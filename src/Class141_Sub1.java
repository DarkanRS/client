
/* Class141_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub1 extends Class141 {
	static final char aChar9017 = '\0';
	static final int anInt9018 = 12;
	static final int anInt9019 = 96;
	boolean aBool9020 = false;
	static final float aFloat9021 = 22.5F;
	Class138 aClass138_9022;
	static final char aChar9023 = '\001';
	static final int anInt9024 = 36;
	boolean aBool9025;
	static final int anInt9026 = 64;
	Class137_Sub2[] aClass137_Sub2Array9027;

	void method14411() {
		((Class141_Sub1) this).aClass138_9022 = new Class138(((Class141_Sub1) this).aClass505_Sub1_1664, 2);
		((Class141_Sub1) this).aClass138_9022.method2380(0);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (!((Class141_Sub1) this).aBool9025) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(7681, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(260, 7681);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(1, 34168, 770);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
		} else {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(260, 7681);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 770);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
		}
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub1) this).aClass138_9022.method2381();
		((Class141_Sub1) this).aClass138_9022.method2380(1);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!((Class141_Sub1) this).aBool9025) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(1, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		} else {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		}
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub1) this).aClass138_9022.method2381();
	}

	boolean method2395() {
		return true;
	}

	void method2405(boolean bool) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2397(boolean bool) {
		if (((Class141_Sub1) this).aClass138_9022 != null && bool) {
			if (!((Class141_Sub1) this).aBool9025) {
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub1) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
			}
			((Class141_Sub1) this).aClass138_9022.method2379('\0');
			((Class141_Sub1) this).aBool9020 = true;
		} else
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
	}

	void method2408(boolean bool) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2398() {
		if (((Class141_Sub1) this).aBool9020) {
			if (!((Class141_Sub1) this).aBool9025) {
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13654(null);
			}
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub1) this).aClass138_9022.method2379('\001');
			((Class141_Sub1) this).aBool9020 = false;
		} else
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
	}

	void method2394(Class137 class137, int i) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2400(Class137 class137, int i) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13612(i);
	}

	boolean method2401() {
		return true;
	}

	void method2399(int i, int i_0_) {
		if (((Class141_Sub1) this).aBool9020) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class141_Sub1) this).aClass137_Sub2Array9027[i - 1]);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2413(Class137 class137, int i) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2404(boolean bool) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2402(boolean bool) {
		if (((Class141_Sub1) this).aClass138_9022 != null && bool) {
			if (!((Class141_Sub1) this).aBool9025) {
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub1) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
			}
			((Class141_Sub1) this).aClass138_9022.method2379('\0');
			((Class141_Sub1) this).aBool9020 = true;
		} else
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
	}

	void method14412() {
		((Class141_Sub1) this).aClass138_9022 = new Class138(((Class141_Sub1) this).aClass505_Sub1_1664, 2);
		((Class141_Sub1) this).aClass138_9022.method2380(0);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (!((Class141_Sub1) this).aBool9025) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(7681, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(260, 7681);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(1, 34168, 770);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
		} else {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(260, 7681);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 770);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
		}
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub1) this).aClass138_9022.method2381();
		((Class141_Sub1) this).aClass138_9022.method2380(1);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!((Class141_Sub1) this).aBool9025) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(1, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		} else {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		}
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub1) this).aClass138_9022.method2381();
	}

	void method2407(boolean bool) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2411() {
		if (((Class141_Sub1) this).aBool9020) {
			if (!((Class141_Sub1) this).aBool9025) {
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13654(null);
			}
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
			((Class141_Sub1) this).aClass138_9022.method2379('\001');
			((Class141_Sub1) this).aBool9020 = false;
		} else
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
	}

	void method2409(int i, int i_1_) {
		if (((Class141_Sub1) this).aBool9020) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class141_Sub1) this).aClass137_Sub2Array9027[i - 1]);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2396(int i, int i_2_) {
		if (((Class141_Sub1) this).aBool9020) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class141_Sub1) this).aClass137_Sub2Array9027[i - 1]);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2410(int i, int i_3_) {
		if (((Class141_Sub1) this).aBool9020) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class141_Sub1) this).aClass137_Sub2Array9027[i - 1]);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2403(boolean bool) {
		if (((Class141_Sub1) this).aClass138_9022 != null && bool) {
			if (!((Class141_Sub1) this).aBool9025) {
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub1) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
			}
			((Class141_Sub1) this).aClass138_9022.method2379('\0');
			((Class141_Sub1) this).aBool9020 = true;
		} else
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
	}

	void method2412(Class137 class137, int i) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2406(boolean bool) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 7681);
	}

	void method2414(Class137 class137, int i) {
		((Class141_Sub1) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13612(i);
	}

	Class141_Sub1(Class505_Sub1 class505_sub1) {
		super(class505_sub1);
		if (((Class505_Sub1) class505_sub1).aBool8480) {
			((Class141_Sub1) this).aBool9025 = ((Class505_Sub1) class505_sub1).anInt8469 < 3;
			int i = ((Class141_Sub1) this).aBool9025 ? 48 : 127;
			byte[][] is = new byte[6][4096];
			byte[][] is_4_ = new byte[6][4096];
			byte[][] is_5_ = new byte[6][4096];
			int i_6_ = 0;
			for (int i_7_ = 0; i_7_ < 64; i_7_++) {
				for (int i_8_ = 0; i_8_ < 64; i_8_++) {
					float f = 2.0F * (float) i_8_ / 64.0F - 1.0F;
					float f_9_ = 2.0F * (float) i_7_ / 64.0F - 1.0F;
					float f_10_ = (float) (1.0 / Math.sqrt((double) (f * f + 1.0F + f_9_ * f_9_)));
					f *= f_10_;
					f_9_ *= f_10_;
					for (int i_11_ = 0; i_11_ < 6; i_11_++) {
						float f_12_;
						if (i_11_ == 0)
							f_12_ = -f;
						else if (i_11_ == 1)
							f_12_ = f;
						else if (i_11_ == 2)
							f_12_ = f_9_;
						else if (i_11_ == 3)
							f_12_ = -f_9_;
						else if (i_11_ == 4)
							f_12_ = -f_10_;
						else
							f_12_ = f_10_;
						int i_13_;
						int i_14_;
						int i_15_;
						if (f_12_ > 0.0F) {
							i_15_ = (int) (Math.pow((double) f_12_, 96.0) * (double) i);
							i_14_ = (int) (Math.pow((double) f_12_, 36.0) * (double) i);
							i_13_ = (int) (Math.pow((double) f_12_, 12.0) * (double) i);
						} else {
							i_13_ = 0;
							i_14_ = 0;
							i_15_ = 0;
						}
						is_4_[i_11_][i_6_] = (byte) i_15_;
						is_5_[i_11_][i_6_] = (byte) i_14_;
						is[i_11_][i_6_] = (byte) i_13_;
					}
					i_6_++;
				}
			}
			((Class141_Sub1) this).aClass137_Sub2Array9027 = new Class137_Sub2[3];
			((Class141_Sub1) this).aClass137_Sub2Array9027[0] = new Class137_Sub2(((Class141_Sub1) this).aClass505_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, 64, false, is_4_, Class150.aClass150_1951);
			((Class141_Sub1) this).aClass137_Sub2Array9027[1] = new Class137_Sub2(((Class141_Sub1) this).aClass505_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, 64, false, is_5_, Class150.aClass150_1951);
			((Class141_Sub1) this).aClass137_Sub2Array9027[2] = new Class137_Sub2(((Class141_Sub1) this).aClass505_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, 64, false, is, Class150.aClass150_1951);
			method14411();
		}
	}

	void method14413() {
		((Class141_Sub1) this).aClass138_9022 = new Class138(((Class141_Sub1) this).aClass505_Sub1_1664, 2);
		((Class141_Sub1) this).aClass138_9022.method2380(0);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (!((Class141_Sub1) this).aBool9025) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(7681, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(260, 7681);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(1, 34168, 770);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
		} else {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(260, 7681);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 770);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 34167, 770);
		}
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub1) this).aClass138_9022.method2381();
		((Class141_Sub1) this).aClass138_9022.method2380(1);
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (!((Class141_Sub1) this).aBool9025) {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13610(2);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(1, 34168, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		} else {
			((Class141_Sub1) this).aClass505_Sub1_1664.method13717(8448, 8448);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub1) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		}
		((Class141_Sub1) this).aClass505_Sub1_1664.method13610(0);
		((Class141_Sub1) this).aClass138_9022.method2381();
	}
}
