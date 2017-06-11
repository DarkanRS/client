/* Class298_Sub32_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub16 extends Class298_Sub32 {
	static boolean aBoolean9407 = false;
	static int anInt9408 = 4;
	int anInt9409;
	int anInt9410 = 1743781396;

	int[][] method3229(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 75);
		if (aClass239_7380.aBoolean2607) {
			int i_0_ = (-1474554145 * Class250.anInt2755 / (-277601971 * ((Class298_Sub32_Sub16) this).anInt9410));
			int i_1_ = (Class250.anInt2756 * 461985445 / (1955421883 * ((Class298_Sub32_Sub16) this).anInt9409));
			int[][] is_2_;
			if (i_1_ > 0) {
				int i_3_ = i % i_1_;
				is_2_ = method3134(0, (i_3_ * (461985445 * Class250.anInt2756) / i_1_), (byte) 8);
			} else
				is_2_ = method3134(0, 0, (byte) 8);
			int[] is_4_ = is_2_[0];
			int[] is_5_ = is_2_[1];
			int[] is_6_ = is_2_[2];
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int[] is_9_ = is[2];
			for (int i_10_ = 0; i_10_ < Class250.anInt2755 * -1474554145; i_10_++) {
				int i_11_;
				if (i_0_ > 0) {
					int i_12_ = i_10_ % i_0_;
					i_11_ = -1474554145 * Class250.anInt2755 * i_12_ / i_0_;
				} else
					i_11_ = 0;
				is_7_[i_10_] = is_4_[i_11_];
				is_8_[i_10_] = is_5_[i_11_];
				is_9_[i_10_] = is_6_[i_11_];
			}
		}
		return is;
	}

	public Class298_Sub32_Sub16() {
		super(1, false);
		((Class298_Sub32_Sub16) this).anInt9409 = -882583092;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_13_) {
		try {
			switch (i) {
			case 1:
				((Class298_Sub32_Sub16) this).anInt9409 = class298_sub53.readUnsignedByte() * 853096051;
				break;
			case 0:
				((Class298_Sub32_Sub16) this).anInt9410 = class298_sub53.readUnsignedByte() * -637796475;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahe.r(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_14_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 34);
			if (aClass239_7380.aBoolean2607) {
				int i_15_ = (-1474554145 * Class250.anInt2755 / (-277601971 * ((Class298_Sub32_Sub16) this).anInt9410));
				int i_16_ = (Class250.anInt2756 * 461985445 / (1955421883 * ((Class298_Sub32_Sub16) this).anInt9409));
				int[][] is_17_;
				if (i_16_ > 0) {
					int i_18_ = i % i_16_;
					is_17_ = method3134(0, i_18_ * (461985445 * Class250.anInt2756) / i_16_, (byte) 8);
				} else
					is_17_ = method3134(0, 0, (byte) 8);
				int[] is_19_ = is_17_[0];
				int[] is_20_ = is_17_[1];
				int[] is_21_ = is_17_[2];
				int[] is_22_ = is[0];
				int[] is_23_ = is[1];
				int[] is_24_ = is[2];
				for (int i_25_ = 0; i_25_ < Class250.anInt2755 * -1474554145; i_25_++) {
					int i_26_;
					if (i_15_ > 0) {
						int i_27_ = i_25_ % i_15_;
						i_26_ = -1474554145 * Class250.anInt2755 * i_27_ / i_15_;
					} else
						i_26_ = 0;
					is_22_[i_25_] = is_19_[i_26_];
					is_23_[i_25_] = is_20_[i_26_];
					is_24_[i_25_] = is_21_[i_26_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahe.k(").append(')').toString());
		}
	}

	int[] method3230(int i) {
		int[] is = aClass257_7384.method2448(i, 1514427827);
		if (aClass257_7384.aBoolean2810) {
			int i_28_ = (Class250.anInt2755 * -1474554145 / (-277601971 * ((Class298_Sub32_Sub16) this).anInt9410));
			int i_29_ = (Class250.anInt2756 * 461985445 / (1955421883 * ((Class298_Sub32_Sub16) this).anInt9409));
			int[] is_30_;
			if (i_29_ > 0) {
				int i_31_ = i % i_29_;
				is_30_ = method3129(0, (i_31_ * (Class250.anInt2756 * 461985445) / i_29_), -1887337990);
			} else
				is_30_ = method3129(0, 0, -1887337990);
			for (int i_32_ = 0; i_32_ < Class250.anInt2755 * -1474554145; i_32_++) {
				if (i_28_ > 0) {
					int i_33_ = i_32_ % i_28_;
					is[i_32_] = is_30_[i_33_ * (-1474554145 * Class250.anInt2755) / i_28_];
				} else
					is[i_32_] = is_30_[0];
			}
		}
		return is;
	}

	int[] method3131(int i, int i_34_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1438029248);
			if (aClass257_7384.aBoolean2810) {
				int i_35_ = (Class250.anInt2755 * -1474554145 / (-277601971 * ((Class298_Sub32_Sub16) this).anInt9410));
				int i_36_ = (Class250.anInt2756 * 461985445 / (1955421883 * ((Class298_Sub32_Sub16) this).anInt9409));
				int[] is_37_;
				if (i_36_ > 0) {
					int i_38_ = i % i_36_;
					is_37_ = method3129(0, i_38_ * (Class250.anInt2756 * 461985445) / i_36_, -1887337990);
				} else
					is_37_ = method3129(0, 0, -1887337990);
				for (int i_39_ = 0; i_39_ < Class250.anInt2755 * -1474554145; i_39_++) {
					if (i_35_ > 0) {
						int i_40_ = i_39_ % i_35_;
						is[i_39_] = is_37_[i_40_ * (-1474554145 * Class250.anInt2755) / i_35_];
					} else
						is[i_39_] = is_37_[0];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahe.i(").append(')').toString());
		}
	}

	void method3231(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub16) this).anInt9409 = class298_sub53.readUnsignedByte() * 853096051;
			break;
		case 0:
			((Class298_Sub32_Sub16) this).anInt9410 = class298_sub53.readUnsignedByte() * -637796475;
			break;
		}
	}

	void method3232(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 1:
			((Class298_Sub32_Sub16) this).anInt9409 = class298_sub53.readUnsignedByte() * 853096051;
			break;
		case 0:
			((Class298_Sub32_Sub16) this).anInt9410 = class298_sub53.readUnsignedByte() * -637796475;
			break;
		}
	}

	int[] method3233(int i) {
		int[] is = aClass257_7384.method2448(i, 20761856);
		if (aClass257_7384.aBoolean2810) {
			int i_41_ = (Class250.anInt2755 * -1474554145 / (-277601971 * ((Class298_Sub32_Sub16) this).anInt9410));
			int i_42_ = (Class250.anInt2756 * 461985445 / (1955421883 * ((Class298_Sub32_Sub16) this).anInt9409));
			int[] is_43_;
			if (i_42_ > 0) {
				int i_44_ = i % i_42_;
				is_43_ = method3129(0, (i_44_ * (Class250.anInt2756 * 461985445) / i_42_), -1887337990);
			} else
				is_43_ = method3129(0, 0, -1887337990);
			for (int i_45_ = 0; i_45_ < Class250.anInt2755 * -1474554145; i_45_++) {
				if (i_41_ > 0) {
					int i_46_ = i_45_ % i_41_;
					is[i_45_] = is_43_[i_46_ * (-1474554145 * Class250.anInt2755) / i_41_];
				} else
					is[i_45_] = is_43_[0];
			}
		}
		return is;
	}

	int[][] method3234(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 53);
		if (aClass239_7380.aBoolean2607) {
			int i_47_ = (-1474554145 * Class250.anInt2755 / (-277601971 * ((Class298_Sub32_Sub16) this).anInt9410));
			int i_48_ = (Class250.anInt2756 * 461985445 / (1955421883 * ((Class298_Sub32_Sub16) this).anInt9409));
			int[][] is_49_;
			if (i_48_ > 0) {
				int i_50_ = i % i_48_;
				is_49_ = method3134(0, (i_50_ * (461985445 * Class250.anInt2756) / i_48_), (byte) 8);
			} else
				is_49_ = method3134(0, 0, (byte) 8);
			int[] is_51_ = is_49_[0];
			int[] is_52_ = is_49_[1];
			int[] is_53_ = is_49_[2];
			int[] is_54_ = is[0];
			int[] is_55_ = is[1];
			int[] is_56_ = is[2];
			for (int i_57_ = 0; i_57_ < Class250.anInt2755 * -1474554145; i_57_++) {
				int i_58_;
				if (i_47_ > 0) {
					int i_59_ = i_57_ % i_47_;
					i_58_ = -1474554145 * Class250.anInt2755 * i_59_ / i_47_;
				} else
					i_58_ = 0;
				is_54_[i_57_] = is_51_[i_58_];
				is_55_[i_57_] = is_52_[i_58_];
				is_56_[i_57_] = is_53_[i_58_];
			}
		}
		return is;
	}
}
