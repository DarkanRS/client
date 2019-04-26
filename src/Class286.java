import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class286 implements Runnable {

	IOException anIOException3401;

	int anInt3400 = 0;

	InputStream anInputStream3396;

	int anInt3395 = 0;

	int anInt3397;

	byte[] aByteArray3399;

	Thread aThread3398;

	boolean method5030(int i_1, int i_2) throws IOException {
		if (i_1 > 0 && i_1 < this.anInt3397) {
			synchronized (this) {
				int i_4;
				if (this.anInt3395 <= this.anInt3400) {
					i_4 = this.anInt3400 - this.anInt3395;
				} else {
					i_4 = this.anInt3397 - this.anInt3395 + this.anInt3400;
				}
				boolean bool_5;
				if (i_4 < i_1) {
					if (this.anIOException3401 != null) {
						throw new IOException(this.anIOException3401.toString());
					} else {
						this.notifyAll();
						bool_5 = false;
						return bool_5;
					}
				} else {
					bool_5 = true;
					return bool_5;
				}
			}
		} else {
			throw new IOException();
		}
	}

	public void run() {
		while (true) {
			int i_1;
			synchronized (this) {
				while (true) {
					if (this.anIOException3401 != null) {
						return;
					}
					if (this.anInt3395 == 0) {
						i_1 = this.anInt3397 - this.anInt3400 - 1;
					} else if (this.anInt3395 <= this.anInt3400) {
						i_1 = this.anInt3397 - this.anInt3400;
					} else {
						i_1 = this.anInt3395 - this.anInt3400 - 1;
					}
					if (i_1 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedexception_8) {
						;
					}
				}
			}
			int i_5;
			try {
				i_5 = this.anInputStream3396.read(this.aByteArray3399, this.anInt3400, i_1);
				if (i_5 == -1) {
					throw new EOFException();
				}
			} catch (IOException ioexception_9) {
				IOException ioexception_3 = ioexception_9;
				synchronized (this) {
					this.anIOException3401 = ioexception_3;
					return;
				}
			}
			synchronized (this) {
				this.anInt3400 = (i_5 + this.anInt3400) % this.anInt3397;
			}
		}
	}

	void method5031() {
		this.anInputStream3396 = new InputStream_Sub1();
	}

	int method5034() throws IOException {
		synchronized (this) {
			int i_3;
			if (this.anInt3395 <= this.anInt3400) {
				i_3 = this.anInt3400 - this.anInt3395;
			} else {
				i_3 = this.anInt3397 - this.anInt3395 + this.anInt3400;
			}
			if (this.anIOException3401 != null) {
				throw new IOException(this.anIOException3401.toString());
			} else {
				this.notifyAll();
				return i_3;
			}
		}
	}

	Class286(InputStream inputstream_1, int i_2) {
		this.anInputStream3396 = inputstream_1;
		this.anInt3397 = i_2 + 1;
		this.aByteArray3399 = new byte[this.anInt3397];
		this.aThread3398 = new Thread(this);
		this.aThread3398.setDaemon(true);
		this.aThread3398.start();
	}

	void method5042(int i_1) {
		synchronized (this) {
			if (this.anIOException3401 == null) {
				this.anIOException3401 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3398.join();
		} catch (InterruptedException interruptedexception_3) {
			;
		}
	}

	int method5043(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
		if (i_3 >= 0 && i_2 >= 0 && i_3 + i_2 <= bytes_1.length) {
			synchronized (this) {
				int i_6;
				if (this.anInt3395 <= this.anInt3400) {
					i_6 = this.anInt3400 - this.anInt3395;
				} else {
					i_6 = this.anInt3397 - this.anInt3395 + this.anInt3400;
				}
				if (i_3 > i_6) {
					i_3 = i_6;
				}
				if (i_3 == 0 && this.anIOException3401 != null) {
					throw new IOException(this.anIOException3401.toString());
				} else {
					if (i_3 + this.anInt3395 <= this.anInt3397) {
						System.arraycopy(this.aByteArray3399, this.anInt3395, bytes_1, i_2, i_3);
					} else {
						int i_7 = this.anInt3397 - this.anInt3395;
						System.arraycopy(this.aByteArray3399, this.anInt3395, bytes_1, i_2, i_7);
						System.arraycopy(this.aByteArray3399, 0, bytes_1, i_7 + i_2, i_3 - i_7);
					}
					this.anInt3395 = (i_3 + this.anInt3395) % this.anInt3397;
					this.notifyAll();
					return i_3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	static Class194 method5048(int i_0) {
		if (i_0 == 0) {
			if ((double) Class291_Sub1.aFloat3468 == 3.0D) {
				return Class494.aClass194_5794;
			}
			if ((double) Class291_Sub1.aFloat3468 == 4.0D) {
				return Class291_Sub1.aClass194_8017;
			}
			if ((double) Class291_Sub1.aFloat3468 == 6.0D) {
				return Class291_Sub1.aClass194_8023;
			}
			if ((double) Class291_Sub1.aFloat3468 >= 8.0D) {
				return Class446.aClass194_5416;
			}
		} else if (i_0 == 1) {
			if ((double) Class291_Sub1.aFloat3468 == 3.0D) {
				return Class291_Sub1.aClass194_8023;
			}
			if ((double) Class291_Sub1.aFloat3468 == 4.0D) {
				return Class446.aClass194_5416;
			}
			if ((double) Class291_Sub1.aFloat3468 == 6.0D) {
				return Class114.aClass194_1243;
			}
			if ((double) Class291_Sub1.aFloat3468 >= 8.0D) {
				return DefaultsFile.aClass194_6967;
			}
		} else if (i_0 == 2) {
			if ((double) Class291_Sub1.aFloat3468 == 3.0D) {
				return Class114.aClass194_1243;
			}
			if ((double) Class291_Sub1.aFloat3468 == 4.0D) {
				return DefaultsFile.aClass194_6967;
			}
			if ((double) Class291_Sub1.aFloat3468 == 6.0D) {
				return Class251.aClass194_3103;
			}
			if ((double) Class291_Sub1.aFloat3468 >= 8.0D) {
				return Transform_Sub1_Sub5_Sub1.aClass194_10527;
			}
		}
		return null;
	}

	static CS2Script getCS2Script(int i_0) {
		CS2Script cs2script_1 = (CS2Script) Class506.aClass223_5857.method3758((long) i_0);
		if (cs2script_1 != null) {
			return cs2script_1;
		} else {
			byte[] bytes_2 = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(i_0, 0);
			if (bytes_2 != null && bytes_2.length > 1) {
				try {
					cs2script_1 = GraphicalRenderer.method8699(bytes_2, -1364063494);
				} catch (Exception exception_4) {
					throw new RuntimeException(exception_4.getMessage() + " " + i_0);
				}
				Class506.aClass223_5857.method3759(cs2script_1, (long) i_0);
				return cs2script_1;
			} else {
				return null;
			}
		}
	}
}
