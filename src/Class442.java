import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class442 {

	RandomAccessFile aRandomAccessFile5359;
	long aLong5360;
	long aLong5358;

	public final void method7385(short s_1) throws IOException {
		if (this.aRandomAccessFile5359 != null) {
			this.aRandomAccessFile5359.close();
			this.aRandomAccessFile5359 = null;
		}

	}

	public final void method7386(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
		if (this.aLong5360 + (long) i_3 > this.aLong5358) {
			this.aRandomAccessFile5359.seek(this.aLong5358);
			this.aRandomAccessFile5359.write(1);
			throw new EOFException();
		} else {
			this.aRandomAccessFile5359.write(bytes_1, i_2, i_3);
			this.aLong5360 += (long) i_3;
		}
	}

	public final long method7388(int i_1) throws IOException {
		return this.aRandomAccessFile5359.length();
	}

	public final int method7389(byte[] bytes_1, int i_2, int i_3, byte b_4) throws IOException {
		int i_5 = this.aRandomAccessFile5359.read(bytes_1, i_2, i_3);
		if (i_5 > 0) {
			this.aLong5360 += (long) i_5;
		}

		return i_5;
	}

	public void finalize() throws Throwable {
		if (this.aRandomAccessFile5359 != null) {
			System.out.println("");
			this.method7385((short) 26786);
		}

	}

	public Class442(File file_1, String string_2, long long_3) throws IOException {
		if (long_3 == -1L) {
			long_3 = Long.MAX_VALUE;
		}

		if (file_1.length() > long_3) {
			file_1.delete();
		}

		this.aRandomAccessFile5359 = new RandomAccessFile(file_1, string_2);
		this.aLong5358 = long_3;
		this.aLong5360 = 0L;
		int i_5 = this.aRandomAccessFile5359.read();
		if (i_5 != -1 && !string_2.equals("r")) {
			this.aRandomAccessFile5359.seek(0L);
			this.aRandomAccessFile5359.write(i_5);
		}

		this.aRandomAccessFile5359.seek(0L);
	}

	final void method7390(long long_1) throws IOException {
		this.aRandomAccessFile5359.seek(long_1);
		this.aLong5360 = long_1;
	}

	static final void method7403(int i_0, int i_1, int i_2, boolean bool_3, int i_4) {
		if (Class456_Sub3.isInterfaceLoaded(i_0, (int[]) null, 1896916428)) {
			InteractableObject.method16099(Class468_Sub8.INTERFACES[i_0].components, -1, i_1, i_2, bool_3, (byte) 60);
		}

	}

}
