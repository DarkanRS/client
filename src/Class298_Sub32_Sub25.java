/* Class298_Sub32_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub25 extends Class298_Sub32 {
	static int anInt9479 = 0;
	static boolean aBoolean9480 = false;
	static int anInt9481 = 0;

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 633455339);
			if (aClass257_7384.aBoolean2810) {
				for (int i_1_ = 0; i_1_ < Class250.anInt2755 * -1474554145; i_1_++) {
					method3299(i_1_, i, 2004320511);
					int[] is_2_ = method3129(0, anInt9481 * -927323081, -1887337990);
					is[i_1_] = is_2_[anInt9479 * 47038181];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahn.i(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_3_) {
		try {
			if (0 == i)
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahn.r(").append(')').toString());
		}
	}

	public Class298_Sub32_Sub25() {
		super(1, false);
	}

	int[][] method3294(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 121);
		if (aClass239_7380.aBoolean2607) {
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			for (int i_7_ = 0; i_7_ < -1474554145 * Class250.anInt2755; i_7_++) {
				method3299(i_7_, i, 1851335541);
				int[][] is_8_ = method3134(0, anInt9481 * -927323081, (byte) 8);
				is_4_[i_7_] = is_8_[0][47038181 * anInt9479];
				is_5_[i_7_] = is_8_[1][anInt9479 * 47038181];
				is_6_[i_7_] = is_8_[2][anInt9479 * 47038181];
			}
		}
		return is;
	}

	int[] method3295(int i) {
		int[] is = aClass257_7384.method2448(i, 463299427);
		if (aClass257_7384.aBoolean2810) {
			for (int i_9_ = 0; i_9_ < Class250.anInt2755 * -1474554145; i_9_++) {
				method3299(i_9_, i, 1824549099);
				int[] is_10_ = method3129(0, anInt9481 * -927323081, -1887337990);
				is[i_9_] = is_10_[anInt9479 * 47038181];
			}
		}
		return is;
	}

	int[] method3296(int i) {
		int[] is = aClass257_7384.method2448(i, 1556517712);
		if (aClass257_7384.aBoolean2810) {
			for (int i_11_ = 0; i_11_ < Class250.anInt2755 * -1474554145; i_11_++) {
				method3299(i_11_, i, 2038618552);
				int[] is_12_ = method3129(0, anInt9481 * -927323081, -1887337990);
				is[i_11_] = is_12_[anInt9479 * 47038181];
			}
		}
		return is;
	}

	void method3297(int i, RsByteBuffer class298_sub53) {
		if (0 == i)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	void method3298(int i, RsByteBuffer class298_sub53) {
		if (0 == i)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	final void method3299(int i, int i_13_, int i_14_) {
		try {
			int i_15_ = Class250.anIntArray2762[i];
			int i_16_ = Class250.anIntArray2760[i_13_];
			float f = (float) Math.atan2((double) (i_15_ - 2048), (double) (i_16_ - 2048));
			if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345) {
				anInt9479 = 799198957 * i;
				anInt9481 = i_13_ * -1258206841;
			} else if ((double) f <= -1.5707963267948966 && (double) f >= -2.356194490192345) {
				anInt9479 = 799198957 * i_13_;
				anInt9481 = -1258206841 * i;
			} else if ((double) f <= -0.7853981633974483 && (double) f >= -1.5707963267948966) {
				anInt9479 = 799198957 * (Class250.anInt2755 * -1474554145 - i_13_);
				anInt9481 = -1258206841 * i;
			} else if (f <= 0.0F && (double) f >= -0.7853981633974483) {
				anInt9479 = i * 799198957;
				anInt9481 = (Class250.anInt2756 * 461985445 - i_13_) * -1258206841;
			} else if (f >= 0.0F && (double) f <= 0.7853981633974483) {
				anInt9479 = (Class250.anInt2755 * -1474554145 - i) * 799198957;
				anInt9481 = -1258206841 * (461985445 * Class250.anInt2756 - i_13_);
			} else if ((double) f >= 0.7853981633974483 && (double) f <= 1.5707963267948966) {
				anInt9479 = 799198957 * (-1474554145 * Class250.anInt2755 - i_13_);
				anInt9481 = -1258206841 * (461985445 * Class250.anInt2756 - i);
			} else if ((double) f >= 1.5707963267948966 && (double) f <= 2.356194490192345) {
				anInt9479 = i_13_ * 799198957;
				anInt9481 = (Class250.anInt2756 * 461985445 - i) * -1258206841;
			} else if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
				anInt9479 = 799198957 * (Class250.anInt2755 * -1474554145 - i);
				anInt9481 = i_13_ * -1258206841;
			}
			anInt9479 = 799198957 * (47038181 * anInt9479 & Class250.anInt2753 * -901777799);
			anInt9481 = (anInt9481 * -927323081 & Class250.anInt2758 * -289063255) * -1258206841;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahn.ac(").append(')').toString());
		}
	}

	int[][] method3300(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 17);
		if (aClass239_7380.aBoolean2607) {
			int[] is_17_ = is[0];
			int[] is_18_ = is[1];
			int[] is_19_ = is[2];
			for (int i_20_ = 0; i_20_ < -1474554145 * Class250.anInt2755; i_20_++) {
				method3299(i_20_, i, 1874770921);
				int[][] is_21_ = method3134(0, anInt9481 * -927323081, (byte) 8);
				is_17_[i_20_] = is_21_[0][47038181 * anInt9479];
				is_18_[i_20_] = is_21_[1][anInt9479 * 47038181];
				is_19_[i_20_] = is_21_[2][anInt9479 * 47038181];
			}
		}
		return is;
	}

	int[][] method3132(int i, byte i_22_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 40);
			if (aClass239_7380.aBoolean2607) {
				int[] is_23_ = is[0];
				int[] is_24_ = is[1];
				int[] is_25_ = is[2];
				for (int i_26_ = 0; i_26_ < -1474554145 * Class250.anInt2755; i_26_++) {
					method3299(i_26_, i, 2006108511);
					int[][] is_27_ = method3134(0, anInt9481 * -927323081, (byte) 8);
					is_23_[i_26_] = is_27_[0][47038181 * anInt9479];
					is_24_[i_26_] = is_27_[1][anInt9479 * 47038181];
					is_25_[i_26_] = is_27_[2][anInt9479 * 47038181];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahn.k(").append(')').toString());
		}
	}
}
