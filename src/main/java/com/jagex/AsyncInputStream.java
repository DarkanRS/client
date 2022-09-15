package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class AsyncInputStream implements Runnable {

	static CS2Script getCS2Script(int i_0) {
		CS2Script cs2script_1 = (CS2Script) Class506.CS2_CACHE.get(i_0);
		if (cs2script_1 != null)
			return cs2script_1;
		byte[] bytes_2 = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(i_0, 0);
		if (bytes_2 != null && bytes_2.length > 1) {
			try {
				cs2script_1 = AbstractRenderer.method8699(bytes_2);
			} catch (Exception exception_4) {
				throw new RuntimeException(exception_4.getMessage() + " " + i_0);
			}
			Class506.CS2_CACHE.put(cs2script_1, i_0);
			return cs2script_1;
		} else
			return null;
	}
	static Class194 method5048(int i_0) {
		if (i_0 == 0) {
			if (Class291.aFloat3468 == 3.0D)
				return Static.aClass194_5794;
			if (Class291.aFloat3468 == 4.0D)
				return Class291_Sub1.aClass194_8017;
			if (Class291.aFloat3468 == 6.0D)
				return Class291_Sub1.aClass194_8023;
			if (Class291.aFloat3468 >= 8.0D)
				return Class446.aClass194_5416;
		} else if (i_0 == 1) {
			if (Class291.aFloat3468 == 3.0D)
				return Class291_Sub1.aClass194_8023;
			if (Class291.aFloat3468 == 4.0D)
				return Class446.aClass194_5416;
			if (Class291.aFloat3468 == 6.0D)
				return ShaderLoader.aClass194_1243;
			if (Class291.aFloat3468 >= 8.0D)
				return DefaultsFile.aClass194_6967;
		} else if (i_0 == 2) {
			if (Class291.aFloat3468 == 3.0D)
				return ShaderLoader.aClass194_1243;
			if (Class291.aFloat3468 == 4.0D)
				return DefaultsFile.aClass194_6967;
			if (Class291.aFloat3468 == 6.0D)
				return RouteFinder.aClass194_3103;
			if (Class291.aFloat3468 >= 8.0D)
				return WallObjectGraphNode.aClass194_10527;
		}
		return null;
	}
	IOException exception;
	int offset;
	InputStream stream;
	int currIndex;
	int buffSize;

	byte[] buffer;

	Thread aThread3398;

	AsyncInputStream(InputStream inputstream_1, int bufferSize) {
		stream = inputstream_1;
		buffSize = bufferSize + 1;
		buffer = new byte[buffSize];
		aThread3398 = new Thread(this);
		aThread3398.setDaemon(true);
		aThread3398.start();
	}

	boolean available(int size) throws IOException {
		if ((size <= 0) || (size >= buffSize))
			throw new IOException();
		synchronized (this) {
			int avail;
			if (currIndex <= offset)
				avail = offset - currIndex;
			else
				avail = buffSize - currIndex + offset;
			if (avail < size) {
				if (exception != null)
					throw new IOException(exception.toString());
				else {
					notifyAll();
					return false;
				}
			} else
				return true;
		}
	}

	void close() {
		stream = new ClosedInputStream();
	}

	int method5034() throws IOException {
		synchronized (this) {
			int i_3;
			if (currIndex <= offset)
				i_3 = offset - currIndex;
			else
				i_3 = buffSize - currIndex + offset;
			if (exception != null)
				throw new IOException(exception.toString());
			notifyAll();
			return i_3;
		}
	}

	void method5042() {
		synchronized (this) {
			if (exception == null)
				exception = new IOException("");
			notifyAll();
		}
		try {
			aThread3398.join();
		} catch (InterruptedException ignored) {
		}
	}

	int method5043(byte[] bytes_1, int i_2, int i_3) throws IOException {
		int i_31 = i_3;
		if ((i_31 < 0) || (i_2 < 0) || (i_31 + i_2 > bytes_1.length))
			throw new IOException();
		synchronized (this) {
			int i_6;
			if (currIndex <= offset)
				i_6 = offset - currIndex;
			else
				i_6 = buffSize - currIndex + offset;
			if (i_31 > i_6)
				i_31 = i_6;
			if (i_31 == 0 && exception != null)
				throw new IOException(exception.toString());
			else {
				if (i_31 + currIndex <= buffSize)
					System.arraycopy(buffer, currIndex, bytes_1, i_2, i_31);
				else {
					int i_7 = buffSize - currIndex;
					System.arraycopy(buffer, currIndex, bytes_1, i_2, i_7);
					System.arraycopy(buffer, 0, bytes_1, i_7 + i_2, i_31 - i_7);
				}
				currIndex = (i_31 + currIndex) % buffSize;
				notifyAll();
				return i_31;
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			int readLen;
			synchronized (this) {
				while (true) {
					if (exception != null)
						return;
					if (currIndex == 0)
						readLen = buffSize - offset - 1;
					else if (currIndex <= offset)
						readLen = buffSize - offset;
					else
						readLen = currIndex - offset - 1;
					if (readLen > 0)
						break;
					try {
						wait();
					} catch (InterruptedException ignored) {
					}
				}
			}
			int readBytes;
			try {
				readBytes = stream.read(buffer, offset, readLen);
				if (readBytes == -1)
					throw new EOFException();
			} catch (IOException ex) {
				//ex.printStackTrace();
				IOException ioexception_3 = ex;
				synchronized (this) {
					exception = ioexception_3;
					return;
				}
			}
			synchronized (this) {
				offset = (readBytes + offset) % buffSize;
			}
		}
	}
}
