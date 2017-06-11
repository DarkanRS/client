/**
 * Downloader.java
 * Copyright 2008 Zach Scrivena
 * zachscrivena@gmail.com
 * http://zs.freeshell.org/
 *
 * TERMS AND CONDITIONS:
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Download a remote resource.
 */
public class Downloader implements Runnable {
	/** wait interval in milliseconds (100) */
	private static final long WAIT_INTERVAL_MILLISECONDS = 100L;

	/** buffer size in number of bytes (1024) */
	private static final int BUFFER_SIZE = 1024;

	/** URL of the remote resource to be downloaded */
	private final URL url;

	/** target object to be populated */
	private final Object target;

	/** length of the remote resource, in number of bytes; -1 if unknown */
	private int totalLength = -1;

	/** number of bytes downloaded */
	private int downloadedLength = 0;

	/** mutex lock for fields totalLength and downloadedLength */
	private final Object lengthLock = new Object();

	/** string describing the current progress */
	volatile private String progressString = "Waiting to start";

	/** has there been an update in the progress? */
	volatile private boolean progressUpdated = false;

	/** Exception object representing the error, if any */
	volatile private Exception error = null;

	/** has the download started? */
	private boolean started = false;

	/** is the downloader running? */
	private boolean running = false;

	/** is the download cancelled? */
	private boolean cancelled = false;

	/** is the download completed? */
	private boolean completed = false;

	/** mutex lock for fields started, running, cancelled, and completed */
	private final Object stateLock = new Object();

	/**
	 * Constructor. The target object should not be accessed until after calling
	 * waitUntilCompleted().
	 * 
	 * @param url
	 *            URL of the remote resource to be downloaded
	 * @param target
	 *            target object to be populated (File or StringBuilder object)
	 */
	public Downloader(final URL url, final Object target) {
		if ((target instanceof File) || (target instanceof StringBuilder)) {
			this.target = target;
		} else {
			throw new IllegalArgumentException("Target must be a File or StringBuilder object.");
		}

		this.url = url;

		synchronized (stateLock) {
			started = false;
			running = false;
		}
	}

	/**
	 * Get the length of the remote resource.
	 * 
	 * @return length of the remote resource, in number of bytes; -1 if unknown
	 */
	public int getLength() {
		synchronized (lengthLock) {
			return totalLength;
		}
	}

	/**
	 * Get the number of bytes downloaded.
	 * 
	 * @return number of bytes downloaded
	 */
	public int getDownloadedLength() {
		synchronized (lengthLock) {
			return downloadedLength;
		}
	}

	/**
	 * Get a string describing the current progress.
	 * 
	 * @return string describing the current progress
	 */
	public String getProgressString() {
		return progressString;
	}

	/**
	 * Get the percentage describing the current progress.
	 * 
	 * @return percentage describing the current progress; -1 if unknown
	 */
	public int getProgressPercent() {
		synchronized (lengthLock) {
			if ((totalLength <= 0) || (downloadedLength > totalLength)) {
				return -1;
			} else if (downloadedLength == totalLength) {
				return 100;
			} else {
				return (int) (100.0 * downloadedLength / totalLength);
			}
		}
	}

	/**
	 * Has there been an update in the progress? The progressUpdated flag is set
	 * to false before this method returns.
	 * 
	 * @return true if there has been an update in the progress; false otherwise
	 */
	public boolean isProgressUpdated() {
		if (progressUpdated) {
			progressUpdated = false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Pause the download.
	 */
	public void pause() {
		synchronized (stateLock) {
			running = false;
		}
	}

	/**
	 * Resume the download.
	 */
	public void resume() {
		synchronized (stateLock) {
			if (!completed) {
				running = true;
			}
		}
	}

	/**
	 * Cancel the download.
	 */
	public void cancel() {
		synchronized (stateLock) {
			cancelled = true;
		}
	}

	/**
	 * Has the download started?
	 * 
	 * @return true if download has started; false otherwise
	 */
	public boolean isStarted() {
		synchronized (stateLock) {
			return started;
		}
	}

	/**
	 * Is the downloader running?
	 * 
	 * @return true if downloader is running; false otherwise
	 */
	public boolean isRunning() {
		synchronized (stateLock) {
			return running;
		}
	}

	/**
	 * Is the download cancelled?
	 * 
	 * @return true if downloader is cancelled; false otherwise
	 */
	public boolean isCancelled() {
		synchronized (stateLock) {
			return cancelled;
		}
	}

	/**
	 * Is the download completed?
	 * 
	 * @return true if download is completed; false otherwise
	 */
	public boolean isCompleted() {
		synchronized (stateLock) {
			return completed;
		}
	}

	/**
	 * Wait until the download is completed. The target object should be
	 * accessed only after calling this method.
	 * 
	 * @throws Exception
	 *             if an error has occurred during download, or if the download
	 *             was cancelled
	 */
	public void waitUntilCompleted() throws Exception {
		while (true) {
			synchronized (stateLock) {
				if (completed) {
					if (error == null) {
						return;
					} else {
						throw error;
					}
				}
			}

			Thread.sleep(WAIT_INTERVAL_MILLISECONDS);
		}
	}

	/**
	 * Start downloading the remote resource. The target object should not be
	 * accessed until after calling waitUntilCompleted().
	 */
	public void run() {
		synchronized (stateLock) {
			if (started) {
				return;
			} else {
				started = true;
				running = true;
			}
		}

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		BufferedReader br = null;

		try {
			/* open connection to the URL */
			checkState();
			progressString = "Opening connection to remote resource";
			progressUpdated = true;

			final URLConnection link;

			try {
				link = url.openConnection();
				link.connect();
			} catch (Exception e) {
				progressString = "Failed to open connection to remote resource";
				progressUpdated = true;
				throw e;
			}

			/* get length of the remote resource */
			checkState();
			progressString = "Getting length of remote resource";
			progressUpdated = true;

			/* get size of webpage in bytes; -1 if unknown */
			final int length = link.getContentLength();

			synchronized (lengthLock) {
				totalLength = length;
			}

			progressUpdated = true;

			/* open input stream to remote resource */
			checkState();
			progressString = "Opening input stream to remote resource";
			progressUpdated = true;

			try {
				final InputStream input = link.getInputStream();

				if (target instanceof File) {
					bis = new BufferedInputStream(input);
				} else if (target instanceof StringBuilder) {
					final String contentType = link.getContentType().toLowerCase(Locale.ENGLISH);

					/* look for charset, if specified */
					String charset = null;
					final Matcher m = Pattern.compile(".*charset[\\s]*=([^;]++).*").matcher(contentType);

					if (m.find()) {
						charset = m.group(1).trim();
					}

					if ((charset != null) && charset.length() != 0) {
						try {
							br = new BufferedReader(new InputStreamReader(input, charset));
						} catch (Exception e) {
							br = null;
						}
					}

					if (br == null) {
						br = new BufferedReader(new InputStreamReader(input));
					}
				}
			} catch (Exception e) {
				progressString = "Failed to open input stream to remote resource";
				progressUpdated = true;
				throw e;
			}

			/* open output stream, if necessary */
			if (target instanceof File) {
				checkState();
				progressString = "Opening output stream to local file";
				progressUpdated = true;

				try {
					/* create parent directories, if necessary */
					final File f = (File) target;
					final File parent = f.getParentFile();

					if ((parent != null) && !parent.exists()) {
						parent.mkdirs();
					}

					bos = new BufferedOutputStream(new FileOutputStream(f));
				} catch (Exception e) {
					progressString = "Failed to open output stream to local file";
					progressUpdated = true;
					throw e;
				}
			}

			/* download remote resource iteratively */
			progressString = "Downloading";
			progressUpdated = true;

			try {
				if (target instanceof File) {
					final byte[] byteBuffer = new byte[BUFFER_SIZE];

					while (true) {
						checkState();
						final int byteCount = bis.read(byteBuffer, 0, BUFFER_SIZE);

						/* check for end-of-stream */
						if (byteCount == -1) {
							break;
						}

						bos.write(byteBuffer, 0, byteCount);

						synchronized (lengthLock) {
							downloadedLength += byteCount;
						}

						progressUpdated = true;
					}
				} else if (target instanceof StringBuilder) {
					final char[] charBuffer = new char[BUFFER_SIZE];
					final StringBuilder sb = (StringBuilder) target;

					while (true) {
						checkState();
						final int charCount = br.read(charBuffer, 0, BUFFER_SIZE);

						/* check for end-of-stream */
						if (charCount == -1) {
							break;
						}

						sb.append(charBuffer, 0, charCount);

						synchronized (lengthLock) {
							downloadedLength += charCount; /*
															 * may be inaccurate
															 * because byte !=
															 * char
															 */
						}

						progressUpdated = true;
					}
				}
			} catch (Exception e) {
				progressString = "Failed to download remote resource";
				progressUpdated = true;
				throw e;
			}

			/* download completed successfully */
			progressString = "Download completed";
			progressUpdated = true;
		} catch (Exception e) {
			error = e;
		} finally {
			/* clean-up */
			for (Closeable c : new Closeable[] { bis, br, bos }) {
				if (c != null) {
					try {
						c.close();
					} catch (Exception e) {
						/* ignore */
					}
				}
			}

			synchronized (stateLock) {
				running = false;
				completed = true;
			}
		}
	}

	/**
	 * Check if the downloader state has been modified. This method blocks if
	 * the download has been paused, unless it is resumed or cancelled. An
	 * exception is thrown if the download is cancelled.
	 * 
	 * @throws java.lang.Exception
	 *             if the download is cancelled
	 */
	private void checkState() throws Exception {
		while (true) {
			synchronized (stateLock) {
				if (cancelled) {
					progressString = "Download cancelled";
					progressUpdated = true;
					throw new Exception("Download cancelled");
				}

				if (running) {
					return;
				}
			}

			Thread.sleep(WAIT_INTERVAL_MILLISECONDS);
		}
	}
}