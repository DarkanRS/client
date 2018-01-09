/* Class282_Sub20_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub33 extends Class282_Sub20 {
	static final boolean aBool9943 = false;

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -662800371);
		if (aClass320_7667.aBool3722) {
			int[] is_0_ = method12317(0, i, 2057284319);
			int[] is_1_ = method12317(1, i, 2000083560);
			int[] is_2_ = method12317(2, i, 2123249905);
			for (int i_3_ = 0; i_3_ < Class316.anInt3670 * -402153223; i_3_++) {
				int i_4_ = is_2_[i_3_];
				if (4096 == i_4_)
					is[i_3_] = is_0_[i_3_];
				else if (0 == i_4_)
					is[i_3_] = is_1_[i_3_];
				else
					is[i_3_] = (i_4_ * is_0_[i_3_] + is_1_[i_3_] * (4096 - i_4_) >> 12);
			}
		}
		return is;
	}

	int[] method12319(int i, int i_5_) {
		int[] is = aClass320_7667.method5721(i, 802505758);
		if (aClass320_7667.aBool3722) {
			int[] is_6_ = method12317(0, i, 1932693607);
			int[] is_7_ = method12317(1, i, 1952877657);
			int[] is_8_ = method12317(2, i, 2142983298);
			for (int i_9_ = 0; i_9_ < Class316.anInt3670 * -402153223; i_9_++) {
				int i_10_ = is_8_[i_9_];
				if (4096 == i_10_)
					is[i_9_] = is_6_[i_9_];
				else if (0 == i_10_)
					is[i_9_] = is_7_[i_9_];
				else
					is[i_9_] = (i_10_ * is_6_[i_9_] + is_7_[i_9_] * (4096 - i_10_) >> 12);
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_11_) {
		int[][] is = aClass308_7670.method5463(i, 1830498780);
		if (aClass308_7670.aBool3619) {
			int[] is_12_ = method12317(2, i, 2002951059);
			int[][] is_13_ = method12333(0, i, (byte) 3);
			int[][] is_14_ = method12333(1, i, (byte) 3);
			int[] is_15_ = is[0];
			int[] is_16_ = is[1];
			int[] is_17_ = is[2];
			int[] is_18_ = is_13_[0];
			int[] is_19_ = is_13_[1];
			int[] is_20_ = is_13_[2];
			int[] is_21_ = is_14_[0];
			int[] is_22_ = is_14_[1];
			int[] is_23_ = is_14_[2];
			for (int i_24_ = 0; i_24_ < Class316.anInt3670 * -402153223; i_24_++) {
				int i_25_ = is_12_[i_24_];
				if (i_25_ == 4096) {
					is_15_[i_24_] = is_18_[i_24_];
					is_16_[i_24_] = is_19_[i_24_];
					is_17_[i_24_] = is_20_[i_24_];
				} else if (0 == i_25_) {
					is_15_[i_24_] = is_21_[i_24_];
					is_16_[i_24_] = is_22_[i_24_];
					is_17_[i_24_] = is_23_[i_24_];
				} else {
					int i_26_ = 4096 - i_25_;
					is_15_[i_24_] = is_18_[i_24_] * i_25_ + i_26_ * is_21_[i_24_] >> 12;
					is_16_[i_24_] = is_19_[i_24_] * i_25_ + is_22_[i_24_] * i_26_ >> 12;
					is_17_[i_24_] = is_20_[i_24_] * i_25_ + i_26_ * is_23_[i_24_] >> 12;
				}
			}
		}
		return is;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_27_) {
		if (0 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1838792670);
		if (aClass320_7667.aBool3722) {
			int[] is_28_ = method12317(0, i, 2139471029);
			int[] is_29_ = method12317(1, i, 2103466160);
			int[] is_30_ = method12317(2, i, 1953474439);
			for (int i_31_ = 0; i_31_ < Class316.anInt3670 * -402153223; i_31_++) {
				int i_32_ = is_30_[i_31_];
				if (4096 == i_32_)
					is[i_31_] = is_28_[i_31_];
				else if (0 == i_32_)
					is[i_31_] = is_29_[i_31_];
				else
					is[i_31_] = (i_32_ * is_28_[i_31_] + is_29_[i_31_] * (4096 - i_32_)) >> 12;
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, 189139583);
		if (aClass320_7667.aBool3722) {
			int[] is_33_ = method12317(0, i, 2144546930);
			int[] is_34_ = method12317(1, i, 2044750081);
			int[] is_35_ = method12317(2, i, 2035307946);
			for (int i_36_ = 0; i_36_ < Class316.anInt3670 * -402153223; i_36_++) {
				int i_37_ = is_35_[i_36_];
				if (4096 == i_37_)
					is[i_36_] = is_33_[i_36_];
				else if (0 == i_37_)
					is[i_36_] = is_34_[i_36_];
				else
					is[i_36_] = (i_37_ * is_33_[i_36_] + is_34_[i_36_] * (4096 - i_37_)) >> 12;
			}
		}
		return is;
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 724303174);
		if (aClass308_7670.aBool3619) {
			int[] is_38_ = method12317(2, i, 2087963741);
			int[][] is_39_ = method12333(0, i, (byte) 3);
			int[][] is_40_ = method12333(1, i, (byte) 3);
			int[] is_41_ = is[0];
			int[] is_42_ = is[1];
			int[] is_43_ = is[2];
			int[] is_44_ = is_39_[0];
			int[] is_45_ = is_39_[1];
			int[] is_46_ = is_39_[2];
			int[] is_47_ = is_40_[0];
			int[] is_48_ = is_40_[1];
			int[] is_49_ = is_40_[2];
			for (int i_50_ = 0; i_50_ < Class316.anInt3670 * -402153223; i_50_++) {
				int i_51_ = is_38_[i_50_];
				if (i_51_ == 4096) {
					is_41_[i_50_] = is_44_[i_50_];
					is_42_[i_50_] = is_45_[i_50_];
					is_43_[i_50_] = is_46_[i_50_];
				} else if (0 == i_51_) {
					is_41_[i_50_] = is_47_[i_50_];
					is_42_[i_50_] = is_48_[i_50_];
					is_43_[i_50_] = is_49_[i_50_];
				} else {
					int i_52_ = 4096 - i_51_;
					is_41_[i_50_] = is_44_[i_50_] * i_51_ + i_52_ * is_47_[i_50_] >> 12;
					is_42_[i_50_] = is_45_[i_50_] * i_51_ + is_48_[i_50_] * i_52_ >> 12;
					is_43_[i_50_] = is_46_[i_50_] * i_51_ + i_52_ * is_49_[i_50_] >> 12;
				}
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		if (0 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	public Class282_Sub20_Sub33() {
		super(3, false);
	}

	static void method15411(GraphicalRenderer class505, byte i) {
		if (Class20.aBool161)
			Class354.method6216(class505, 399148987);
		else
			Class268.method4800(class505, (byte) 122);
	}
}
