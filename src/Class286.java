
/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class286 implements Runnable {
	int anInt3395 = 0;
	InputStream anInputStream3396;
	int anInt3397;
	Thread aThread3398;
	byte[] aByteArray3399;
	int anInt3400 = 0;
	IOException anIOException3401;
	
	boolean method5030(int i, int i_0_) throws IOException {
		if (i <= 0 || i >= ((Class286) this).anInt3397 * -1529176971)
			throw new IOException();
		synchronized (this) {
			int i_1_;
			if (((Class286) this).anInt3395 * 900353451 <= ((Class286) this).anInt3400 * 1971856091)
				i_1_ = (1971856091 * ((Class286) this).anInt3400 - ((Class286) this).anInt3395 * 900353451);
			else
				i_1_ = (((Class286) this).anInt3397 * -1529176971 - ((Class286) this).anInt3395 * 900353451 + 1971856091 * ((Class286) this).anInt3400);
			if (i_1_ < i) {
				if (null != ((Class286) this).anIOException3401)
					throw new IOException(((Class286) this).anIOException3401.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	public void run() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != ((Class286) this).anIOException3401)
						return;
					if (((Class286) this).anInt3395 * 900353451 == 0)
						i = (-1529176971 * ((Class286) this).anInt3397 - ((Class286) this).anInt3400 * 1971856091 - 1);
					else if (900353451 * ((Class286) this).anInt3395 <= ((Class286) this).anInt3400 * 1971856091)
						i = (((Class286) this).anInt3397 * -1529176971 - 1971856091 * ((Class286) this).anInt3400);
					else
						i = (((Class286) this).anInt3395 * 900353451 - ((Class286) this).anInt3400 * 1971856091 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_2_;
			try {
				i_2_ = (((Class286) this).anInputStream3396.read(((Class286) this).aByteArray3399, ((Class286) this).anInt3400 * 1971856091, i));
				if (-1 == i_2_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class286) this).anIOException3401 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class286) this).anInt3400 = ((((Class286) this).anInt3400 * 1971856091 + i_2_) % (-1529176971 * ((Class286) this).anInt3397) * -1327953581);
			}
		}
	}

	void method5031(int i) {
		((Class286) this).anInputStream3396 = new InputStream_Sub1();
	}

	boolean method5032(int i) throws IOException {
		if (i <= 0 || i >= ((Class286) this).anInt3397 * -1529176971)
			throw new IOException();
		synchronized (this) {
			int i_3_;
			if (((Class286) this).anInt3395 * 900353451 <= ((Class286) this).anInt3400 * 1971856091)
				i_3_ = (1971856091 * ((Class286) this).anInt3400 - ((Class286) this).anInt3395 * 900353451);
			else
				i_3_ = (((Class286) this).anInt3397 * -1529176971 - ((Class286) this).anInt3395 * 900353451 + 1971856091 * ((Class286) this).anInt3400);
			if (i_3_ < i) {
				if (null != ((Class286) this).anIOException3401)
					throw new IOException(((Class286) this).anIOException3401.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	void method5033() {
		synchronized (this) {
			if (null == ((Class286) this).anIOException3401)
				((Class286) this).anIOException3401 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class286) this).aThread3398.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	int method5034(int i) throws IOException {
		synchronized (this) {
			int i_4_;
			if (900353451 * ((Class286) this).anInt3395 <= ((Class286) this).anInt3400 * 1971856091)
				i_4_ = (1971856091 * ((Class286) this).anInt3400 - 900353451 * ((Class286) this).anInt3395);
			else
				i_4_ = (-1529176971 * ((Class286) this).anInt3397 - 900353451 * ((Class286) this).anInt3395 + 1971856091 * ((Class286) this).anInt3400);
			if (((Class286) this).anIOException3401 != null)
				throw new IOException(((Class286) this).anIOException3401.toString());
			this.notifyAll();
			int i_5_ = i_4_;
			return i_5_;
		}
	}

	int method5035(byte[] is, int i, int i_6_) throws IOException {
		if (i_6_ < 0 || i < 0 || i + i_6_ > is.length)
			throw new IOException();
		synchronized (this) {
			int i_7_;
			if (((Class286) this).anInt3395 * 900353451 <= 1971856091 * ((Class286) this).anInt3400)
				i_7_ = (((Class286) this).anInt3400 * 1971856091 - 900353451 * ((Class286) this).anInt3395);
			else
				i_7_ = (1971856091 * ((Class286) this).anInt3400 + (-1529176971 * ((Class286) this).anInt3397 - 900353451 * ((Class286) this).anInt3395));
			if (i_6_ > i_7_)
				i_6_ = i_7_;
			if (i_6_ == 0 && ((Class286) this).anIOException3401 != null)
				throw new IOException(((Class286) this).anIOException3401.toString());
			if (900353451 * ((Class286) this).anInt3395 + i_6_ <= ((Class286) this).anInt3397 * -1529176971)
				System.arraycopy(((Class286) this).aByteArray3399, ((Class286) this).anInt3395 * 900353451, is, i, i_6_);
			else {
				int i_8_ = (-1529176971 * ((Class286) this).anInt3397 - ((Class286) this).anInt3395 * 900353451);
				System.arraycopy(((Class286) this).aByteArray3399, 900353451 * ((Class286) this).anInt3395, is, i, i_8_);
				System.arraycopy(((Class286) this).aByteArray3399, 0, is, i + i_8_, i_6_ - i_8_);
			}
			((Class286) this).anInt3395 = 1110852867 * ((i_6_ + 900353451 * ((Class286) this).anInt3395) % (-1529176971 * ((Class286) this).anInt3397));
			this.notifyAll();
			int i_9_ = i_6_;
			return i_9_;
		}
	}

	public void method5036() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != ((Class286) this).anIOException3401)
						return;
					if (((Class286) this).anInt3395 * 900353451 == 0)
						i = (-1529176971 * ((Class286) this).anInt3397 - ((Class286) this).anInt3400 * 1971856091 - 1);
					else if (900353451 * ((Class286) this).anInt3395 <= ((Class286) this).anInt3400 * 1971856091)
						i = (((Class286) this).anInt3397 * -1529176971 - 1971856091 * ((Class286) this).anInt3400);
					else
						i = (((Class286) this).anInt3395 * 900353451 - ((Class286) this).anInt3400 * 1971856091 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_10_;
			try {
				i_10_ = (((Class286) this).anInputStream3396.read(((Class286) this).aByteArray3399, ((Class286) this).anInt3400 * 1971856091, i));
				if (-1 == i_10_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class286) this).anIOException3401 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class286) this).anInt3400 = ((((Class286) this).anInt3400 * 1971856091 + i_10_) % (-1529176971 * ((Class286) this).anInt3397) * -1327953581);
			}
		}
	}

	public void method5037() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (null != ((Class286) this).anIOException3401)
						return;
					if (((Class286) this).anInt3395 * 900353451 == 0)
						i = (-1529176971 * ((Class286) this).anInt3397 - ((Class286) this).anInt3400 * 1971856091 - 1);
					else if (900353451 * ((Class286) this).anInt3395 <= ((Class286) this).anInt3400 * 1971856091)
						i = (((Class286) this).anInt3397 * -1529176971 - 1971856091 * ((Class286) this).anInt3400);
					else
						i = (((Class286) this).anInt3395 * 900353451 - ((Class286) this).anInt3400 * 1971856091 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_11_;
			try {
				i_11_ = (((Class286) this).anInputStream3396.read(((Class286) this).aByteArray3399, ((Class286) this).anInt3400 * 1971856091, i));
				if (-1 == i_11_)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class286) this).anIOException3401 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class286) this).anInt3400 = ((((Class286) this).anInt3400 * 1971856091 + i_11_) % (-1529176971 * ((Class286) this).anInt3397) * -1327953581);
			}
		}
	}

	boolean method5038(int i) throws IOException {
		if (i <= 0 || i >= ((Class286) this).anInt3397 * -1529176971)
			throw new IOException();
		synchronized (this) {
			int i_12_;
			if (((Class286) this).anInt3395 * 900353451 <= ((Class286) this).anInt3400 * 1971856091)
				i_12_ = (1971856091 * ((Class286) this).anInt3400 - ((Class286) this).anInt3395 * 900353451);
			else
				i_12_ = (((Class286) this).anInt3397 * -1529176971 - ((Class286) this).anInt3395 * 900353451 + 1971856091 * ((Class286) this).anInt3400);
			if (i_12_ < i) {
				if (null != ((Class286) this).anIOException3401)
					throw new IOException(((Class286) this).anIOException3401.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	Class286(InputStream inputstream, int i) {
		((Class286) this).anInputStream3396 = inputstream;
		((Class286) this).anInt3397 = 112808925 * (i + 1);
		((Class286) this).aByteArray3399 = new byte[((Class286) this).anInt3397 * -1529176971];
		((Class286) this).aThread3398 = new Thread(this);
		((Class286) this).aThread3398.setDaemon(true);
		((Class286) this).aThread3398.start();
	}

	boolean method5039(int i) throws IOException {
		if (i <= 0 || i >= ((Class286) this).anInt3397 * -1529176971)
			throw new IOException();
		synchronized (this) {
			int i_13_;
			if (((Class286) this).anInt3395 * 900353451 <= ((Class286) this).anInt3400 * 1971856091)
				i_13_ = (1971856091 * ((Class286) this).anInt3400 - ((Class286) this).anInt3395 * 900353451);
			else
				i_13_ = (((Class286) this).anInt3397 * -1529176971 - ((Class286) this).anInt3395 * 900353451 + 1971856091 * ((Class286) this).anInt3400);
			if (i_13_ < i) {
				if (null != ((Class286) this).anIOException3401)
					throw new IOException(((Class286) this).anIOException3401.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	int method5040() throws IOException {
		synchronized (this) {
			int i;
			if (900353451 * ((Class286) this).anInt3395 <= ((Class286) this).anInt3400 * 1971856091)
				i = (1971856091 * ((Class286) this).anInt3400 - 900353451 * ((Class286) this).anInt3395);
			else
				i = (-1529176971 * ((Class286) this).anInt3397 - 900353451 * ((Class286) this).anInt3395 + 1971856091 * ((Class286) this).anInt3400);
			if (((Class286) this).anIOException3401 != null)
				throw new IOException(((Class286) this).anIOException3401.toString());
			this.notifyAll();
			int i_14_ = i;
			return i_14_;
		}
	}

	int method5041() throws IOException {
		synchronized (this) {
			int i;
			if (900353451 * ((Class286) this).anInt3395 <= ((Class286) this).anInt3400 * 1971856091)
				i = (1971856091 * ((Class286) this).anInt3400 - 900353451 * ((Class286) this).anInt3395);
			else
				i = (-1529176971 * ((Class286) this).anInt3397 - 900353451 * ((Class286) this).anInt3395 + 1971856091 * ((Class286) this).anInt3400);
			if (((Class286) this).anIOException3401 != null)
				throw new IOException(((Class286) this).anIOException3401.toString());
			this.notifyAll();
			int i_15_ = i;
			return i_15_;
		}
	}

	void method5042(int i) {
		synchronized (this) {
			if (null == ((Class286) this).anIOException3401)
				((Class286) this).anIOException3401 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class286) this).aThread3398.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	int method5043(byte[] is, int i, int i_16_, int i_17_) throws IOException {
		if (i_16_ < 0 || i < 0 || i + i_16_ > is.length)
			throw new IOException();
		synchronized (this) {
			int i_18_;
			if (((Class286) this).anInt3395 * 900353451 <= 1971856091 * ((Class286) this).anInt3400)
				i_18_ = (((Class286) this).anInt3400 * 1971856091 - 900353451 * ((Class286) this).anInt3395);
			else
				i_18_ = (1971856091 * ((Class286) this).anInt3400 + (-1529176971 * ((Class286) this).anInt3397 - 900353451 * ((Class286) this).anInt3395));
			if (i_16_ > i_18_)
				i_16_ = i_18_;
			if (i_16_ == 0 && ((Class286) this).anIOException3401 != null)
				throw new IOException(((Class286) this).anIOException3401.toString());
			if (900353451 * ((Class286) this).anInt3395 + i_16_ <= ((Class286) this).anInt3397 * -1529176971)
				System.arraycopy(((Class286) this).aByteArray3399, ((Class286) this).anInt3395 * 900353451, is, i, i_16_);
			else {
				int i_19_ = (-1529176971 * ((Class286) this).anInt3397 - ((Class286) this).anInt3395 * 900353451);
				System.arraycopy(((Class286) this).aByteArray3399, 900353451 * ((Class286) this).anInt3395, is, i, i_19_);
				System.arraycopy(((Class286) this).aByteArray3399, 0, is, i + i_19_, i_16_ - i_19_);
			}
			((Class286) this).anInt3395 = 1110852867 * ((i_16_ + 900353451 * ((Class286) this).anInt3395) % (-1529176971 * ((Class286) this).anInt3397));
			this.notifyAll();
			int i_20_ = i_16_;
			return i_20_;
		}
	}

	void method5044() {
		synchronized (this) {
			if (null == ((Class286) this).anIOException3401)
				((Class286) this).anIOException3401 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class286) this).aThread3398.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static final void method5045(CS2Executor class527, int i) {
		int i_21_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_21_, (byte) 61);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 2110532063 * class118.anInt1305;
	}

	static final void method5046(CS2Executor class527, byte i) {
		if (null == Class149_Sub2.aClass461_9316)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -1977256787 * Class149_Sub2.aClass461_9316.anInt5541;
	}

	static final void method5047(CS2Executor class527, int i) {
		int i_22_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub21_8222), i_22_, -1752837734);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -44);
		Class190.method3148((byte) 84);
		client.aBool7175 = false;
	}

	static Class194 method5048(int i, byte i_23_) {
		if (i == 0) {
			if (3.0 == (double) Class291_Sub1.aFloat3468)
				return Class494.aClass194_5794;
			if ((double) Class291_Sub1.aFloat3468 == 4.0)
				return Class291_Sub1.aClass194_8017;
			if (6.0 == (double) Class291_Sub1.aFloat3468)
				return Class291_Sub1.aClass194_8023;
			if ((double) Class291_Sub1.aFloat3468 >= 8.0)
				return Class446.aClass194_5416;
		} else if (1 == i) {
			if (3.0 == (double) Class291_Sub1.aFloat3468)
				return Class291_Sub1.aClass194_8023;
			if (4.0 == (double) Class291_Sub1.aFloat3468)
				return Class446.aClass194_5416;
			if (6.0 == (double) Class291_Sub1.aFloat3468)
				return Class114.aClass194_1243;
			if ((double) Class291_Sub1.aFloat3468 >= 8.0)
				return DefaultsFile.aClass194_6967;
		} else if (i == 2) {
			if ((double) Class291_Sub1.aFloat3468 == 3.0)
				return Class114.aClass194_1243;
			if ((double) Class291_Sub1.aFloat3468 == 4.0)
				return DefaultsFile.aClass194_6967;
			if (6.0 == (double) Class291_Sub1.aFloat3468)
				return Class251.aClass194_3103;
			if ((double) Class291_Sub1.aFloat3468 >= 8.0)
				return Class521_Sub1_Sub5_Sub1.aClass194_10527;
		}
		return null;
	}

	static CS2Script getCS2Script(int i) {
		CS2Script class282_sub50_sub5 = ((CS2Script) Class506.aClass223_5857.method3758((long) i));
		if (class282_sub50_sub5 != null)
			return class282_sub50_sub5;
		byte[] is = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(i, 0);
		if (is == null || is.length <= 1)
			return null;
		try {
			class282_sub50_sub5 = GraphicalRenderer.method8699(is, -1364063494);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		Class506.aClass223_5857.method3759(class282_sub50_sub5, (long) i);
		return class282_sub50_sub5;
	}
}
