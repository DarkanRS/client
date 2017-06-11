/* Class298_Sub32_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub29 extends Class298_Sub32 {
	int anInt9503 = -1358727707;
	int anInt9504;
	int[] anIntArray9505;
	int anInt9506;

	void method3318(int i, RsByteBuffer class298_sub53) {
		if (i == 0)
			((Class298_Sub32_Sub29) this).anInt9503 = class298_sub53.readUnsignedShort() * 1358727707;
	}

	public Class298_Sub32_Sub29() {
		super(0, false);
	}

	int[][] method3132(int i, byte i_0_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 73);
			if (aClass239_7380.aBoolean2607) {
				int i_1_ = (((Class298_Sub32_Sub29) this).anInt9504 * -1304311833 * ((-275760121 * ((Class298_Sub32_Sub29) this).anInt9506 != Class250.anInt2756 * 461985445) ? (((Class298_Sub32_Sub29) this).anInt9506 * -275760121 * i / (461985445 * Class250.anInt2756)) : i));
				int[] is_2_ = is[0];
				int[] is_3_ = is[1];
				int[] is_4_ = is[2];
				if (Class250.anInt2755 * -1474554145 == ((Class298_Sub32_Sub29) this).anInt9504 * -1304311833) {
					for (int i_5_ = 0; i_5_ < Class250.anInt2755 * -1474554145; i_5_++) {
						int i_6_ = (((Class298_Sub32_Sub29) this).anIntArray9505[i_1_++]);
						is_4_[i_5_] = (i_6_ & 0xff) << 4;
						is_3_[i_5_] = (i_6_ & 0xff00) >> 4;
						is_2_[i_5_] = (i_6_ & 0xff0000) >> 12;
					}
				} else {
					for (int i_7_ = 0; i_7_ < -1474554145 * Class250.anInt2755; i_7_++) {
						int i_8_ = (i_7_ * (((Class298_Sub32_Sub29) this).anInt9504 * -1304311833) / (Class250.anInt2755 * -1474554145));
						int i_9_ = (((Class298_Sub32_Sub29) this).anIntArray9505[i_1_ + i_8_]);
						is_4_[i_7_] = (i_9_ & 0xff) << 4;
						is_3_[i_7_] = (i_9_ & 0xff00) >> 4;
						is_2_[i_7_] = (i_9_ & 0xff0000) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahr.k(").append(')').toString());
		}
	}

	void method3319() {
		super.method3128(1881168514);
		((Class298_Sub32_Sub29) this).anIntArray9505 = null;
	}

	int method3136(byte i) {
		try {
			return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahr.n(").append(')').toString());
		}
	}

	void method3130(int i, int i_10_, int i_11_) {
		try {
			super.method3130(i, i_10_, -1661668864);
			if (((Class298_Sub32_Sub29) this).anInt9503 * -69124077 >= 0 && null != Class294.anInterface_ma3166) {
				int i_12_ = ((Class294.anInterface_ma3166.method174(-69124077 * ((Class298_Sub32_Sub29) this).anInt9503, 816226410).aBoolean518) ? 64 : 128);
				((Class298_Sub32_Sub29) this).anIntArray9505 = (Class294.anInterface_ma3166.method171(-69124077 * ((Class298_Sub32_Sub29) this).anInt9503, 1.0F, i_12_, i_12_, false, 215810850));
				((Class298_Sub32_Sub29) this).anInt9506 = 1374319031 * i_12_;
				((Class298_Sub32_Sub29) this).anInt9504 = -1283564585 * i_12_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahr.a(").append(')').toString());
		}
	}

	int method3320() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	int method3321() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	int[][] method3322(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 45);
		if (aClass239_7380.aBoolean2607) {
			int i_13_ = (((Class298_Sub32_Sub29) this).anInt9504 * -1304311833 * ((-275760121 * ((Class298_Sub32_Sub29) this).anInt9506 != Class250.anInt2756 * 461985445) ? (((Class298_Sub32_Sub29) this).anInt9506 * -275760121 * i / (461985445 * Class250.anInt2756)) : i));
			int[] is_14_ = is[0];
			int[] is_15_ = is[1];
			int[] is_16_ = is[2];
			if (Class250.anInt2755 * -1474554145 == ((Class298_Sub32_Sub29) this).anInt9504 * -1304311833) {
				for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
					int i_18_ = (((Class298_Sub32_Sub29) this).anIntArray9505[i_13_++]);
					is_16_[i_17_] = (i_18_ & 0xff) << 4;
					is_15_[i_17_] = (i_18_ & 0xff00) >> 4;
					is_14_[i_17_] = (i_18_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_19_ = 0; i_19_ < -1474554145 * Class250.anInt2755; i_19_++) {
					int i_20_ = (i_19_ * (((Class298_Sub32_Sub29) this).anInt9504 * -1304311833) / (Class250.anInt2755 * -1474554145));
					int i_21_ = (((Class298_Sub32_Sub29) this).anIntArray9505[i_13_ + i_20_]);
					is_16_[i_19_] = (i_21_ & 0xff) << 4;
					is_15_[i_19_] = (i_21_ & 0xff00) >> 4;
					is_14_[i_19_] = (i_21_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	int[][] method3323(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 101);
		if (aClass239_7380.aBoolean2607) {
			int i_22_ = (((Class298_Sub32_Sub29) this).anInt9504 * -1304311833 * ((-275760121 * ((Class298_Sub32_Sub29) this).anInt9506 != Class250.anInt2756 * 461985445) ? (((Class298_Sub32_Sub29) this).anInt9506 * -275760121 * i / (461985445 * Class250.anInt2756)) : i));
			int[] is_23_ = is[0];
			int[] is_24_ = is[1];
			int[] is_25_ = is[2];
			if (Class250.anInt2755 * -1474554145 == ((Class298_Sub32_Sub29) this).anInt9504 * -1304311833) {
				for (int i_26_ = 0; i_26_ < Class250.anInt2755 * -1474554145; i_26_++) {
					int i_27_ = (((Class298_Sub32_Sub29) this).anIntArray9505[i_22_++]);
					is_25_[i_26_] = (i_27_ & 0xff) << 4;
					is_24_[i_26_] = (i_27_ & 0xff00) >> 4;
					is_23_[i_26_] = (i_27_ & 0xff0000) >> 12;
				}
			} else {
				for (int i_28_ = 0; i_28_ < -1474554145 * Class250.anInt2755; i_28_++) {
					int i_29_ = (i_28_ * (((Class298_Sub32_Sub29) this).anInt9504 * -1304311833) / (Class250.anInt2755 * -1474554145));
					int i_30_ = (((Class298_Sub32_Sub29) this).anIntArray9505[i_22_ + i_29_]);
					is_25_[i_28_] = (i_30_ & 0xff) << 4;
					is_24_[i_28_] = (i_30_ & 0xff00) >> 4;
					is_23_[i_28_] = (i_30_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	void method3324(int i, int i_31_) {
		super.method3130(i, i_31_, -1661668864);
		if (((Class298_Sub32_Sub29) this).anInt9503 * -69124077 >= 0 && null != Class294.anInterface_ma3166) {
			int i_32_ = ((Class294.anInterface_ma3166.method174(-69124077 * ((Class298_Sub32_Sub29) this).anInt9503, 1192750196).aBoolean518) ? 64 : 128);
			((Class298_Sub32_Sub29) this).anIntArray9505 = (Class294.anInterface_ma3166.method171(-69124077 * ((Class298_Sub32_Sub29) this).anInt9503, 1.0F, i_32_, i_32_, false, -234790231));
			((Class298_Sub32_Sub29) this).anInt9506 = 1374319031 * i_32_;
			((Class298_Sub32_Sub29) this).anInt9504 = -1283564585 * i_32_;
		}
	}

	void method3128(int i) {
		try {
			super.method3128(1881168514);
			((Class298_Sub32_Sub29) this).anIntArray9505 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahr.f(").append(')').toString());
		}
	}

	int method3325() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	int method3326() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_33_) {
		try {
			if (i == 0)
				((Class298_Sub32_Sub29) this).anInt9503 = class298_sub53.readUnsignedShort() * 1358727707;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahr.r(").append(')').toString());
		}
	}

	int method3327() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	int method3328() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	int method3329() {
		return -69124077 * ((Class298_Sub32_Sub29) this).anInt9503;
	}

	void method3330(int i, int i_34_) {
		super.method3130(i, i_34_, -1661668864);
		if (((Class298_Sub32_Sub29) this).anInt9503 * -69124077 >= 0 && null != Class294.anInterface_ma3166) {
			int i_35_ = ((Class294.anInterface_ma3166.method174(-69124077 * ((Class298_Sub32_Sub29) this).anInt9503, 607579585).aBoolean518) ? 64 : 128);
			((Class298_Sub32_Sub29) this).anIntArray9505 = (Class294.anInterface_ma3166.method171(-69124077 * ((Class298_Sub32_Sub29) this).anInt9503, 1.0F, i_35_, i_35_, false, 626013006));
			((Class298_Sub32_Sub29) this).anInt9506 = 1374319031 * i_35_;
			((Class298_Sub32_Sub29) this).anInt9504 = -1283564585 * i_35_;
		}
	}

	void method3331(int i, RsByteBuffer class298_sub53) {
		if (i == 0)
			((Class298_Sub32_Sub29) this).anInt9503 = class298_sub53.readUnsignedShort() * 1358727707;
	}
}
