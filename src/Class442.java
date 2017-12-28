
/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class442 {
	long aLong5358;
	RandomAccessFile aRandomAccessFile5359;
	long aLong5360;

	public final void method7384() throws IOException {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			((Class442) this).aRandomAccessFile5359.close();
			((Class442) this).aRandomAccessFile5359 = null;
		}
	}

	public final void method7385(short i) throws IOException {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			if (i > 255) {
				((Class442) this).aRandomAccessFile5359.close();
				((Class442) this).aRandomAccessFile5359 = null;
			}
		}
	}

	public final void method7386(byte[] is, int i, int i_0_, int i_1_) throws IOException {
		if (((Class442) this).aLong5360 * -8810086075253454751L + (long) i_0_ > 4550371225063770071L * ((Class442) this).aLong5358) {
			((Class442) this).aRandomAccessFile5359.seek(4550371225063770071L * ((Class442) this).aLong5358);
			((Class442) this).aRandomAccessFile5359.write(1);
			throw new EOFException();
		}
		((Class442) this).aRandomAccessFile5359.write(is, i, i_0_);
		((Class442) this).aLong5360 += (long) i_0_ * 2728668244666850209L;
	}

	public final void method7387(byte[] is, int i, int i_2_) throws IOException {
		if (((Class442) this).aLong5360 * -8810086075253454751L + (long) i_2_ > 4550371225063770071L * ((Class442) this).aLong5358) {
			((Class442) this).aRandomAccessFile5359.seek(4550371225063770071L * ((Class442) this).aLong5358);
			((Class442) this).aRandomAccessFile5359.write(1);
			throw new EOFException();
		}
		((Class442) this).aRandomAccessFile5359.write(is, i, i_2_);
		((Class442) this).aLong5360 += (long) i_2_ * 2728668244666850209L;
	}

	public final long method7388(int i) throws IOException {
		return ((Class442) this).aRandomAccessFile5359.length();
	}

	public final int method7389(byte[] is, int i, int i_3_, byte i_4_) throws IOException {
		int i_5_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_3_);
		if (i_5_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_5_;
		return i_5_;
	}

	public void finalize() throws Throwable {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			System.out.println("");
			method7385((short) 26786);
		}
	}

	public Class442(File file, String string, long l) throws IOException {
		if (l == -1L)
			l = 9223372036854775807L;
		if (file.length() > l)
			file.delete();
		((Class442) this).aRandomAccessFile5359 = new RandomAccessFile(file, string);
		((Class442) this).aLong5358 = l * -350947538057880601L;
		((Class442) this).aLong5360 = 0L;
		int i = ((Class442) this).aRandomAccessFile5359.read();
		if (i != -1 && !string.equals("r")) {
			((Class442) this).aRandomAccessFile5359.seek(0L);
			((Class442) this).aRandomAccessFile5359.write(i);
		}
		((Class442) this).aRandomAccessFile5359.seek(0L);
	}

	final void method7390(long l) throws IOException {
		((Class442) this).aRandomAccessFile5359.seek(l);
		((Class442) this).aLong5360 = 2728668244666850209L * l;
	}

	final void method7391(long l) throws IOException {
		((Class442) this).aRandomAccessFile5359.seek(l);
		((Class442) this).aLong5360 = 2728668244666850209L * l;
	}

	void method7392() throws Throwable {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			System.out.println("");
			method7385((short) 15971);
		}
	}

	public final int method7393(byte[] is, int i, int i_6_) throws IOException {
		int i_7_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_6_);
		if (i_7_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_7_;
		return i_7_;
	}

	void method7394() throws Throwable {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			System.out.println("");
			method7385((short) 21764);
		}
	}

	public final void method7395() throws IOException {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			((Class442) this).aRandomAccessFile5359.close();
			((Class442) this).aRandomAccessFile5359 = null;
		}
	}

	public final long method7396() throws IOException {
		return ((Class442) this).aRandomAccessFile5359.length();
	}

	public final int method7397(byte[] is, int i, int i_8_) throws IOException {
		int i_9_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_8_);
		if (i_9_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_9_;
		return i_9_;
	}

	public final int method7398(byte[] is, int i, int i_10_) throws IOException {
		int i_11_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_10_);
		if (i_11_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_11_;
		return i_11_;
	}

	public final int method7399(byte[] is, int i, int i_12_) throws IOException {
		int i_13_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_12_);
		if (i_13_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_13_;
		return i_13_;
	}

	public final void method7400() throws IOException {
		if (((Class442) this).aRandomAccessFile5359 != null) {
			((Class442) this).aRandomAccessFile5359.close();
			((Class442) this).aRandomAccessFile5359 = null;
		}
	}

	public final int method7401(byte[] is, int i, int i_14_) throws IOException {
		int i_15_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_14_);
		if (i_15_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_15_;
		return i_15_;
	}

	public final int method7402(byte[] is, int i, int i_16_) throws IOException {
		int i_17_ = ((Class442) this).aRandomAccessFile5359.read(is, i, i_16_);
		if (i_17_ > 0)
			((Class442) this).aLong5360 += 2728668244666850209L * (long) i_17_;
		return i_17_;
	}

	static final void method7403(int i, int i_18_, int i_19_, boolean bool, int i_20_) {
		if (Class456_Sub3.method12682(i, null, 1896916428))
			Class521_Sub1_Sub1_Sub5.method16099((Class468_Sub8.aClass98Array7889[i].aClass118Array998), -1, i_18_, i_19_, bool, (byte) 60);
	}
}
