/* Class298_Sub32_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub24 extends Class298_Sub32 {
	static boolean aBoolean9478 = false;

	public Class298_Sub32_Sub24() {
		super(3, false);
	}

	int[] method3131(int i, int i_0_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1169453050);
			if (aClass257_7384.aBoolean2810) {
				int[] is_1_ = method3129(0, i, -1887337990);
				int[] is_2_ = method3129(1, i, -1887337990);
				int[] is_3_ = method3129(2, i, -1887337990);
				for (int i_4_ = 0; i_4_ < Class250.anInt2755 * -1474554145; i_4_++) {
					int i_5_ = is_3_[i_4_];
					if (i_5_ == 4096)
						is[i_4_] = is_1_[i_4_];
					else if (i_5_ == 0)
						is[i_4_] = is_2_[i_4_];
					else
						is[i_4_] = (is_1_[i_4_] * i_5_ + (4096 - i_5_) * is_2_[i_4_] >> 12);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahm.i(").append(')').toString());
		}
	}

	int[][] method3288(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 26);
		if (aClass239_7380.aBoolean2607) {
			int[] is_6_ = method3129(2, i, -1887337990);
			int[][] is_7_ = method3134(0, i, (byte) 8);
			int[][] is_8_ = method3134(1, i, (byte) 8);
			int[] is_9_ = is[0];
			int[] is_10_ = is[1];
			int[] is_11_ = is[2];
			int[] is_12_ = is_7_[0];
			int[] is_13_ = is_7_[1];
			int[] is_14_ = is_7_[2];
			int[] is_15_ = is_8_[0];
			int[] is_16_ = is_8_[1];
			int[] is_17_ = is_8_[2];
			for (int i_18_ = 0; i_18_ < -1474554145 * Class250.anInt2755; i_18_++) {
				int i_19_ = is_6_[i_18_];
				if (4096 == i_19_) {
					is_9_[i_18_] = is_12_[i_18_];
					is_10_[i_18_] = is_13_[i_18_];
					is_11_[i_18_] = is_14_[i_18_];
				} else if (i_19_ == 0) {
					is_9_[i_18_] = is_15_[i_18_];
					is_10_[i_18_] = is_16_[i_18_];
					is_11_[i_18_] = is_17_[i_18_];
				} else {
					int i_20_ = 4096 - i_19_;
					is_9_[i_18_] = is_15_[i_18_] * i_20_ + i_19_ * is_12_[i_18_] >> 12;
					is_10_[i_18_] = is_16_[i_18_] * i_20_ + i_19_ * is_13_[i_18_] >> 12;
					is_11_[i_18_] = is_14_[i_18_] * i_19_ + is_17_[i_18_] * i_20_ >> 12;
				}
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_21_) {
		try {
			if (i == 0)
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahm.r(").append(')').toString());
		}
	}

	int[] method3289(int i) {
		int[] is = aClass257_7384.method2448(i, 6018124);
		if (aClass257_7384.aBoolean2810) {
			int[] is_22_ = method3129(0, i, -1887337990);
			int[] is_23_ = method3129(1, i, -1887337990);
			int[] is_24_ = method3129(2, i, -1887337990);
			for (int i_25_ = 0; i_25_ < Class250.anInt2755 * -1474554145; i_25_++) {
				int i_26_ = is_24_[i_25_];
				if (i_26_ == 4096)
					is[i_25_] = is_22_[i_25_];
				else if (i_26_ == 0)
					is[i_25_] = is_23_[i_25_];
				else
					is[i_25_] = (is_22_[i_25_] * i_26_ + (4096 - i_26_) * is_23_[i_25_]) >> 12;
			}
		}
		return is;
	}

	int[] method3290(int i) {
		int[] is = aClass257_7384.method2448(i, 1105475938);
		if (aClass257_7384.aBoolean2810) {
			int[] is_27_ = method3129(0, i, -1887337990);
			int[] is_28_ = method3129(1, i, -1887337990);
			int[] is_29_ = method3129(2, i, -1887337990);
			for (int i_30_ = 0; i_30_ < Class250.anInt2755 * -1474554145; i_30_++) {
				int i_31_ = is_29_[i_30_];
				if (i_31_ == 4096)
					is[i_30_] = is_27_[i_30_];
				else if (i_31_ == 0)
					is[i_30_] = is_28_[i_30_];
				else
					is[i_30_] = (is_27_[i_30_] * i_31_ + (4096 - i_31_) * is_28_[i_30_]) >> 12;
			}
		}
		return is;
	}

	int[][] method3132(int i, byte i_32_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 117);
			if (aClass239_7380.aBoolean2607) {
				int[] is_33_ = method3129(2, i, -1887337990);
				int[][] is_34_ = method3134(0, i, (byte) 8);
				int[][] is_35_ = method3134(1, i, (byte) 8);
				int[] is_36_ = is[0];
				int[] is_37_ = is[1];
				int[] is_38_ = is[2];
				int[] is_39_ = is_34_[0];
				int[] is_40_ = is_34_[1];
				int[] is_41_ = is_34_[2];
				int[] is_42_ = is_35_[0];
				int[] is_43_ = is_35_[1];
				int[] is_44_ = is_35_[2];
				for (int i_45_ = 0; i_45_ < -1474554145 * Class250.anInt2755; i_45_++) {
					int i_46_ = is_33_[i_45_];
					if (4096 == i_46_) {
						is_36_[i_45_] = is_39_[i_45_];
						is_37_[i_45_] = is_40_[i_45_];
						is_38_[i_45_] = is_41_[i_45_];
					} else if (i_46_ == 0) {
						is_36_[i_45_] = is_42_[i_45_];
						is_37_[i_45_] = is_43_[i_45_];
						is_38_[i_45_] = is_44_[i_45_];
					} else {
						int i_47_ = 4096 - i_46_;
						is_36_[i_45_] = (is_42_[i_45_] * i_47_ + i_46_ * is_39_[i_45_] >> 12);
						is_37_[i_45_] = (is_43_[i_45_] * i_47_ + i_46_ * is_40_[i_45_] >> 12);
						is_38_[i_45_] = (is_41_[i_45_] * i_46_ + is_44_[i_45_] * i_47_ >> 12);
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahm.k(").append(')').toString());
		}
	}

	void method3291(int i, RsByteBuffer class298_sub53) {
		if (i == 0)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	int[][] method3292(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 59);
		if (aClass239_7380.aBoolean2607) {
			int[] is_48_ = method3129(2, i, -1887337990);
			int[][] is_49_ = method3134(0, i, (byte) 8);
			int[][] is_50_ = method3134(1, i, (byte) 8);
			int[] is_51_ = is[0];
			int[] is_52_ = is[1];
			int[] is_53_ = is[2];
			int[] is_54_ = is_49_[0];
			int[] is_55_ = is_49_[1];
			int[] is_56_ = is_49_[2];
			int[] is_57_ = is_50_[0];
			int[] is_58_ = is_50_[1];
			int[] is_59_ = is_50_[2];
			for (int i_60_ = 0; i_60_ < -1474554145 * Class250.anInt2755; i_60_++) {
				int i_61_ = is_48_[i_60_];
				if (4096 == i_61_) {
					is_51_[i_60_] = is_54_[i_60_];
					is_52_[i_60_] = is_55_[i_60_];
					is_53_[i_60_] = is_56_[i_60_];
				} else if (i_61_ == 0) {
					is_51_[i_60_] = is_57_[i_60_];
					is_52_[i_60_] = is_58_[i_60_];
					is_53_[i_60_] = is_59_[i_60_];
				} else {
					int i_62_ = 4096 - i_61_;
					is_51_[i_60_] = is_57_[i_60_] * i_62_ + i_61_ * is_54_[i_60_] >> 12;
					is_52_[i_60_] = is_58_[i_60_] * i_62_ + i_61_ * is_55_[i_60_] >> 12;
					is_53_[i_60_] = is_56_[i_60_] * i_61_ + is_59_[i_60_] * i_62_ >> 12;
				}
			}
		}
		return is;
	}

	void method3293(int i, RsByteBuffer class298_sub53) {
		if (i == 0)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}
}
