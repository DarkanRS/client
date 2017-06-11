/* Class298_Sub32_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub9 extends Class298_Sub32 {
	static boolean aBoolean9385 = true;
	static boolean aBoolean9386 = true;
	static boolean aBoolean9387 = false;
	boolean aBoolean9388 = true;
	boolean aBoolean9389 = true;

	int[] method3189(int i) {
		int[] is = aClass257_7384.method2448(i, 1012167629);
		if (aClass257_7384.aBoolean2810) {
			int[] is_0_ = method3129(0, (((Class298_Sub32_Sub9) this).aBoolean9389 ? -289063255 * Class250.anInt2758 - i : i), -1887337990);
			if (((Class298_Sub32_Sub9) this).aBoolean9388) {
				for (int i_1_ = 0; i_1_ < Class250.anInt2755 * -1474554145; i_1_++)
					is[i_1_] = is_0_[-901777799 * Class250.anInt2753 - i_1_];
			} else
				Class425.method5741(is_0_, 0, is, 0, -1474554145 * Class250.anInt2755);
		}
		return is;
	}

	int[][] method3190(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 107);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_2_ = method3134(0, (((Class298_Sub32_Sub9) this).aBoolean9389 ? Class250.anInt2758 * -289063255 - i : i), (byte) 8);
			int[] is_3_ = is_2_[0];
			int[] is_4_ = is_2_[1];
			int[] is_5_ = is_2_[2];
			int[] is_6_ = is[0];
			int[] is_7_ = is[1];
			int[] is_8_ = is[2];
			if (((Class298_Sub32_Sub9) this).aBoolean9388) {
				for (int i_9_ = 0; i_9_ < -1474554145 * Class250.anInt2755; i_9_++) {
					is_6_[i_9_] = is_3_[Class250.anInt2753 * -901777799 - i_9_];
					is_7_[i_9_] = is_4_[-901777799 * Class250.anInt2753 - i_9_];
					is_8_[i_9_] = is_5_[Class250.anInt2753 * -901777799 - i_9_];
				}
			} else {
				for (int i_10_ = 0; i_10_ < Class250.anInt2755 * -1474554145; i_10_++) {
					is_6_[i_10_] = is_3_[i_10_];
					is_7_[i_10_] = is_4_[i_10_];
					is_8_[i_10_] = is_5_[i_10_];
				}
			}
		}
		return is;
	}

	int[] method3131(int i, int i_11_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1850560302);
			if (aClass257_7384.aBoolean2810) {
				int[] is_12_ = method3129(0, (((Class298_Sub32_Sub9) this).aBoolean9389 ? -289063255 * Class250.anInt2758 - i : i), -1887337990);
				if (((Class298_Sub32_Sub9) this).aBoolean9388) {
					for (int i_13_ = 0; i_13_ < Class250.anInt2755 * -1474554145; i_13_++)
						is[i_13_] = is_12_[-901777799 * Class250.anInt2753 - i_13_];
				} else
					Class425.method5741(is_12_, 0, is, 0, -1474554145 * Class250.anInt2755);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agw.i(").append(')').toString());
		}
	}

	void method3191(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 0:
			((Class298_Sub32_Sub9) this).aBoolean9388 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 1:
			((Class298_Sub32_Sub9) this).aBoolean9389 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	int[] method3192(int i) {
		int[] is = aClass257_7384.method2448(i, 293659249);
		if (aClass257_7384.aBoolean2810) {
			int[] is_14_ = method3129(0, (((Class298_Sub32_Sub9) this).aBoolean9389 ? -289063255 * Class250.anInt2758 - i : i), -1887337990);
			if (((Class298_Sub32_Sub9) this).aBoolean9388) {
				for (int i_15_ = 0; i_15_ < Class250.anInt2755 * -1474554145; i_15_++)
					is[i_15_] = is_14_[-901777799 * Class250.anInt2753 - i_15_];
			} else
				Class425.method5741(is_14_, 0, is, 0, -1474554145 * Class250.anInt2755);
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_16_) {
		try {
			switch (i) {
			case 2:
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
				break;
			case 0:
				((Class298_Sub32_Sub9) this).aBoolean9388 = class298_sub53.readUnsignedByte() == 1;
				break;
			case 1:
				((Class298_Sub32_Sub9) this).aBoolean9389 = class298_sub53.readUnsignedByte() == 1;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agw.r(").append(')').toString());
		}
	}

	void method3193(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 0:
			((Class298_Sub32_Sub9) this).aBoolean9388 = class298_sub53.readUnsignedByte() == 1;
			break;
		case 1:
			((Class298_Sub32_Sub9) this).aBoolean9389 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	int[][] method3132(int i, byte i_17_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 91);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_18_ = method3134(0, (((Class298_Sub32_Sub9) this).aBoolean9389 ? Class250.anInt2758 * -289063255 - i : i), (byte) 8);
				int[] is_19_ = is_18_[0];
				int[] is_20_ = is_18_[1];
				int[] is_21_ = is_18_[2];
				int[] is_22_ = is[0];
				int[] is_23_ = is[1];
				int[] is_24_ = is[2];
				if (((Class298_Sub32_Sub9) this).aBoolean9388) {
					for (int i_25_ = 0; i_25_ < -1474554145 * Class250.anInt2755; i_25_++) {
						is_22_[i_25_] = is_19_[Class250.anInt2753 * -901777799 - i_25_];
						is_23_[i_25_] = is_20_[-901777799 * Class250.anInt2753 - i_25_];
						is_24_[i_25_] = is_21_[Class250.anInt2753 * -901777799 - i_25_];
					}
				} else {
					for (int i_26_ = 0; i_26_ < Class250.anInt2755 * -1474554145; i_26_++) {
						is_22_[i_26_] = is_19_[i_26_];
						is_23_[i_26_] = is_20_[i_26_];
						is_24_[i_26_] = is_21_[i_26_];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agw.k(").append(')').toString());
		}
	}

	int[][] method3194(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 112);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_27_ = method3134(0, (((Class298_Sub32_Sub9) this).aBoolean9389 ? Class250.anInt2758 * -289063255 - i : i), (byte) 8);
			int[] is_28_ = is_27_[0];
			int[] is_29_ = is_27_[1];
			int[] is_30_ = is_27_[2];
			int[] is_31_ = is[0];
			int[] is_32_ = is[1];
			int[] is_33_ = is[2];
			if (((Class298_Sub32_Sub9) this).aBoolean9388) {
				for (int i_34_ = 0; i_34_ < -1474554145 * Class250.anInt2755; i_34_++) {
					is_31_[i_34_] = is_28_[Class250.anInt2753 * -901777799 - i_34_];
					is_32_[i_34_] = is_29_[-901777799 * Class250.anInt2753 - i_34_];
					is_33_[i_34_] = is_30_[Class250.anInt2753 * -901777799 - i_34_];
				}
			} else {
				for (int i_35_ = 0; i_35_ < Class250.anInt2755 * -1474554145; i_35_++) {
					is_31_[i_35_] = is_28_[i_35_];
					is_32_[i_35_] = is_29_[i_35_];
					is_33_[i_35_] = is_30_[i_35_];
				}
			}
		}
		return is;
	}

	public Class298_Sub32_Sub9() {
		super(1, false);
	}
}
