/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class330 implements Runnable {
	Thread aThread3495;
	OutputStream anOutputStream3496;
	int anInt3497 = 0;
	byte[] aByteArray3498;
	int anInt3499;
	int anInt3500 = 0;
	IOException anIOException3501;
	boolean aBoolean3502;

	void method3998(byte[] is, int i, int i_0_, int i_1_) throws IOException {
		try {
			if (i_0_ < 0 || i < 0 || i + i_0_ > is.length)
				throw new IOException();
			synchronized (this) {
				if (null != ((Class330) this).anIOException3501)
					throw new IOException(((Class330) this).anIOException3501.toString());
				int i_2_;
				if (825739053 * ((Class330) this).anInt3497 <= 517453779 * ((Class330) this).anInt3500)
					i_2_ = (((Class330) this).anInt3497 * 825739053 + (75932039 * ((Class330) this).anInt3499 - ((Class330) this).anInt3500 * 517453779) - 1);
				else
					i_2_ = (825739053 * ((Class330) this).anInt3497 - ((Class330) this).anInt3500 * 517453779 - 1);
				if (i_2_ < i_0_)
					throw new IOException("");
				if (((Class330) this).anInt3500 * 517453779 + i_0_ <= 75932039 * ((Class330) this).anInt3499)
					System.arraycopy(is, i, ((Class330) this).aByteArray3498, 517453779 * ((Class330) this).anInt3500, i_0_);
				else {
					int i_3_ = (((Class330) this).anInt3499 * 75932039 - ((Class330) this).anInt3500 * 517453779);
					System.arraycopy(is, i, ((Class330) this).aByteArray3498, ((Class330) this).anInt3500 * 517453779, i_3_);
					System.arraycopy(is, i_3_ + i, ((Class330) this).aByteArray3498, 0, i_0_ - i_3_);
				}
				((Class330) this).anInt3500 = ((i_0_ + 517453779 * ((Class330) this).anInt3500) % (75932039 * ((Class330) this).anInt3499) * -255412133);
				this.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.f(").append(')').toString());
		}
	}

	boolean method3999(int i) {
		try {
			if (((Class330) this).aBoolean3502) {
				try {
					((Class330) this).anOutputStream3496.close();
					if (null == ((Class330) this).anIOException3501)
						((Class330) this).anIOException3501 = new IOException("");
				} catch (IOException ioexception) {
					if (((Class330) this).anIOException3501 == null)
						((Class330) this).anIOException3501 = new IOException(ioexception);
				}
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.a(").append(')').toString());
		}
	}

	void method4000(byte i) {
		try {
			((Class330) this).anOutputStream3496 = new OutputStream_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.p(").append(')').toString());
		}
	}

	void method4001(int i) {
		try {
			synchronized (this) {
				((Class330) this).aBoolean3502 = true;
				this.notifyAll();
			}
			try {
				((Class330) this).aThread3495.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.b(").append(')').toString());
		}
	}

	public void run() {
		try {
			do {
				int i;
				synchronized (this) {
					for (;;) {
						if (null != ((Class330) this).anIOException3501)
							return;
						if (825739053 * ((Class330) this).anInt3497 <= 517453779 * ((Class330) this).anInt3500)
							i = (((Class330) this).anInt3500 * 517453779 - 825739053 * ((Class330) this).anInt3497);
						else
							i = (((Class330) this).anInt3500 * 517453779 + (75932039 * ((Class330) this).anInt3499 - (825739053 * ((Class330) this).anInt3497)));
						if (i > 0)
							break;
						try {
							((Class330) this).anOutputStream3496.flush();
						} catch (IOException ioexception) {
							((Class330) this).anIOException3501 = ioexception;
							return;
						}
						if (method3999(-1835611724))
							return;
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					if (i + ((Class330) this).anInt3497 * 825739053 <= 75932039 * ((Class330) this).anInt3499)
						((Class330) this).anOutputStream3496.write(((Class330) this).aByteArray3498, ((Class330) this).anInt3497 * 825739053, i);
					else {
						int i_4_ = (75932039 * ((Class330) this).anInt3499 - ((Class330) this).anInt3497 * 825739053);
						((Class330) this).anOutputStream3496.write(((Class330) this).aByteArray3498, ((Class330) this).anInt3497 * 825739053, i_4_);
						((Class330) this).anOutputStream3496.write(((Class330) this).aByteArray3498, 0, i - i_4_);
					}
				} catch (IOException ioexception) {
					synchronized (this) {
						((Class330) this).anIOException3501 = ioexception;
						break;
					}
				}
				synchronized (this) {
					((Class330) this).anInt3497 = ((825739053 * ((Class330) this).anInt3497 + i) % (((Class330) this).anInt3499 * 75932039) * 1059266725);
				}
			} while (!method3999(-1331950055));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.run(").append(')').toString());
		}
	}

	Class330(OutputStream outputstream, int i) {
		((Class330) this).anOutputStream3496 = outputstream;
		((Class330) this).anInt3499 = (i + 1) * 370496567;
		((Class330) this).aByteArray3498 = new byte[((Class330) this).anInt3499 * 75932039];
		((Class330) this).aThread3495 = new Thread(this);
		((Class330) this).aThread3495.setDaemon(true);
		((Class330) this).aThread3495.start();
	}

	static final void method4002(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class287.myPlayer.anInt10206 * 696798311);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.ue(").append(')').toString());
		}
	}

	static final void method4003(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class376.method4659(i_5_, 2048910777);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.ahi(").append(')').toString());
		}
	}

	static final void method4004(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).aLongArray5235[(((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357])] = (((ClientScript2) class403).aLongArray5251[((((ClientScript2) class403).anInt5245 -= -682569305) * 1685767703)]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.bm(").append(')').toString());
		}
	}

	public static void method4005(int i) {
		try {
			Class182.aClass348_1815.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.k(").append(')').toString());
		}
	}

	static final boolean method4006(int i, int i_6_, Class336 class336, Class289 class289, int i_7_) {
		try {
			int i_8_ = i;
			int i_9_ = i_6_;
			int i_10_ = 64;
			int i_11_ = 64;
			int i_12_ = i - i_10_;
			int i_13_ = i_6_ - i_11_;
			Class285.anIntArrayArray3076[i_10_][i_11_] = 99;
			Class285.anIntArrayArray3080[i_10_][i_11_] = 0;
			int i_14_ = 0;
			int i_15_ = 0;
			Class285.routeFinderXArray[i_14_] = i_8_;
			Class285.routeFinderYArray[i_14_++] = i_9_;
			int[][] is = class289.anIntArrayArray3155;
			while (i_15_ != i_14_) {
				i_8_ = Class285.routeFinderXArray[i_15_];
				i_9_ = Class285.routeFinderYArray[i_15_];
				i_15_ = 1 + i_15_ & 0xfff;
				i_10_ = i_8_ - i_12_;
				i_11_ = i_9_ - i_13_;
				int i_16_ = i_8_ - 1487776559 * class289.anInt3151;
				int i_17_ = i_9_ - 1415525851 * class289.anInt3152;
				if (class336.method4090(1, i_8_, i_9_, class289, -16711936)) {
					Class285.anInt3078 = i_8_ * 1021042197;
					ClanMember.anInt1684 = -575994451 * i_9_;
					return true;
				}
				int i_18_ = Class285.anIntArrayArray3080[i_10_][i_11_] + 1;
				if (i_10_ > 0 && 0 == Class285.anIntArrayArray3076[i_10_ - 1][i_11_] && (is[i_16_ - 1][i_17_] & 0x42240000) == 0) {
					Class285.routeFinderXArray[i_14_] = i_8_ - 1;
					Class285.routeFinderYArray[i_14_] = i_9_;
					i_14_ = 1 + i_14_ & 0xfff;
					Class285.anIntArrayArray3076[i_10_ - 1][i_11_] = 2;
					Class285.anIntArrayArray3080[i_10_ - 1][i_11_] = i_18_;
				}
				if (i_10_ < 127 && 0 == Class285.anIntArrayArray3076[i_10_ + 1][i_11_] && (is[1 + i_16_][i_17_] & 0x60240000) == 0) {
					Class285.routeFinderXArray[i_14_] = i_8_ + 1;
					Class285.routeFinderYArray[i_14_] = i_9_;
					i_14_ = i_14_ + 1 & 0xfff;
					Class285.anIntArrayArray3076[1 + i_10_][i_11_] = 8;
					Class285.anIntArrayArray3080[i_10_ + 1][i_11_] = i_18_;
				}
				if (i_11_ > 0 && Class285.anIntArrayArray3076[i_10_][i_11_ - 1] == 0 && 0 == (is[i_16_][i_17_ - 1] & 0x40a40000)) {
					Class285.routeFinderXArray[i_14_] = i_8_;
					Class285.routeFinderYArray[i_14_] = i_9_ - 1;
					i_14_ = 1 + i_14_ & 0xfff;
					Class285.anIntArrayArray3076[i_10_][i_11_ - 1] = 1;
					Class285.anIntArrayArray3080[i_10_][i_11_ - 1] = i_18_;
				}
				if (i_11_ < 127 && 0 == Class285.anIntArrayArray3076[i_10_][i_11_ + 1] && (is[i_16_][1 + i_17_] & 0x48240000) == 0) {
					Class285.routeFinderXArray[i_14_] = i_8_;
					Class285.routeFinderYArray[i_14_] = 1 + i_9_;
					i_14_ = 1 + i_14_ & 0xfff;
					Class285.anIntArrayArray3076[i_10_][i_11_ + 1] = 4;
					Class285.anIntArrayArray3080[i_10_][i_11_ + 1] = i_18_;
				}
				if (i_10_ > 0 && i_11_ > 0 && Class285.anIntArrayArray3076[i_10_ - 1][i_11_ - 1] == 0 && (is[i_16_ - 1][i_17_ - 1] & 0x43a40000) == 0 && (is[i_16_ - 1][i_17_] & 0x42240000) == 0 && 0 == (is[i_16_][i_17_ - 1] & 0x40a40000)) {
					Class285.routeFinderXArray[i_14_] = i_8_ - 1;
					Class285.routeFinderYArray[i_14_] = i_9_ - 1;
					i_14_ = i_14_ + 1 & 0xfff;
					Class285.anIntArrayArray3076[i_10_ - 1][i_11_ - 1] = 3;
					Class285.anIntArrayArray3080[i_10_ - 1][i_11_ - 1] = i_18_;
				}
				if (i_10_ < 127 && i_11_ > 0 && 0 == Class285.anIntArrayArray3076[1 + i_10_][i_11_ - 1] && (is[i_16_ + 1][i_17_ - 1] & 0x60e40000) == 0 && (is[i_16_ + 1][i_17_] & 0x60240000) == 0 && (is[i_16_][i_17_ - 1] & 0x40a40000) == 0) {
					Class285.routeFinderXArray[i_14_] = i_8_ + 1;
					Class285.routeFinderYArray[i_14_] = i_9_ - 1;
					i_14_ = i_14_ + 1 & 0xfff;
					Class285.anIntArrayArray3076[1 + i_10_][i_11_ - 1] = 9;
					Class285.anIntArrayArray3080[i_10_ + 1][i_11_ - 1] = i_18_;
				}
				if (i_10_ > 0 && i_11_ < 127 && Class285.anIntArrayArray3076[i_10_ - 1][1 + i_11_] == 0 && (is[i_16_ - 1][1 + i_17_] & 0x4e240000) == 0 && (is[i_16_ - 1][i_17_] & 0x42240000) == 0 && 0 == (is[i_16_][1 + i_17_] & 0x48240000)) {
					Class285.routeFinderXArray[i_14_] = i_8_ - 1;
					Class285.routeFinderYArray[i_14_] = i_9_ + 1;
					i_14_ = i_14_ + 1 & 0xfff;
					Class285.anIntArrayArray3076[i_10_ - 1][i_11_ + 1] = 6;
					Class285.anIntArrayArray3080[i_10_ - 1][1 + i_11_] = i_18_;
				}
				if (i_10_ < 127 && i_11_ < 127 && Class285.anIntArrayArray3076[1 + i_10_][1 + i_11_] == 0 && 0 == (is[1 + i_16_][1 + i_17_] & 0x78240000) && 0 == (is[1 + i_16_][i_17_] & 0x60240000) && 0 == (is[i_16_][i_17_ + 1] & 0x48240000)) {
					Class285.routeFinderXArray[i_14_] = 1 + i_8_;
					Class285.routeFinderYArray[i_14_] = 1 + i_9_;
					i_14_ = i_14_ + 1 & 0xfff;
					Class285.anIntArrayArray3076[i_10_ + 1][1 + i_11_] = 12;
					Class285.anIntArrayArray3080[i_10_ + 1][1 + i_11_] = i_18_;
				}
			}
			Class285.anInt3078 = 1021042197 * i_8_;
			ClanMember.anInt1684 = -575994451 * i_9_;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nt.f(").append(')').toString());
		}
	}
}
