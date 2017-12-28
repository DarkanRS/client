/* Class282_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub2 extends Class282_Sub20 {
	static final int anInt9672 = 4;
	int anInt9673 = -685382476;
	int anInt9674 = -1418132460;
	static final boolean aBool9675 = false;

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -46775186);
		if (aClass320_7667.aBool3722) {
			int i_1_ = (Class316.anInt3670 * -402153223 / (-126075227 * ((Class282_Sub20_Sub2) this).anInt9673));
			int i_2_ = (Class316.anInt3671 * -929726253 / (((Class282_Sub20_Sub2) this).anInt9674 * 1328374733));
			int[] is_3_;
			if (i_2_ > 0) {
				int i_4_ = i % i_2_;
				is_3_ = method12317(0, (i_4_ * (-929726253 * Class316.anInt3671) / i_2_), 2124468963);
			} else
				is_3_ = method12317(0, 0, 1944713013);
			for (int i_5_ = 0; i_5_ < -402153223 * Class316.anInt3670; i_5_++) {
				if (i_1_ > 0) {
					int i_6_ = i_5_ % i_1_;
					is[i_5_] = is_3_[Class316.anInt3670 * -402153223 * i_6_ / i_1_];
				} else
					is[i_5_] = is_3_[0];
			}
		}
		return is;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -696651006);
		if (aClass320_7667.aBool3722) {
			int i_7_ = (Class316.anInt3670 * -402153223 / (-126075227 * ((Class282_Sub20_Sub2) this).anInt9673));
			int i_8_ = (Class316.anInt3671 * -929726253 / (((Class282_Sub20_Sub2) this).anInt9674 * 1328374733));
			int[] is_9_;
			if (i_8_ > 0) {
				int i_10_ = i % i_8_;
				is_9_ = method12317(0, (i_10_ * (-929726253 * Class316.anInt3671) / i_8_), 1999778489);
			} else
				is_9_ = method12317(0, 0, 1982529373);
			for (int i_11_ = 0; i_11_ < -402153223 * Class316.anInt3670; i_11_++) {
				if (i_7_ > 0) {
					int i_12_ = i_11_ % i_7_;
					is[i_11_] = is_9_[(Class316.anInt3670 * -402153223 * i_12_ / i_7_)];
				} else
					is[i_11_] = is_9_[0];
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_13_) {
		int[][] is = aClass308_7670.method5463(i, 1263602542);
		if (aClass308_7670.aBool3619) {
			int i_14_ = (-402153223 * Class316.anInt3670 / (((Class282_Sub20_Sub2) this).anInt9673 * -126075227));
			int i_15_ = (Class316.anInt3671 * -929726253 / (((Class282_Sub20_Sub2) this).anInt9674 * 1328374733));
			int[][] is_16_;
			if (i_15_ > 0) {
				int i_17_ = i % i_15_;
				is_16_ = method12333(0, (i_17_ * (-929726253 * Class316.anInt3671) / i_15_), (byte) 3);
			} else
				is_16_ = method12333(0, 0, (byte) 3);
			int[] is_18_ = is_16_[0];
			int[] is_19_ = is_16_[1];
			int[] is_20_ = is_16_[2];
			int[] is_21_ = is[0];
			int[] is_22_ = is[1];
			int[] is_23_ = is[2];
			for (int i_24_ = 0; i_24_ < -402153223 * Class316.anInt3670; i_24_++) {
				int i_25_;
				if (i_14_ > 0) {
					int i_26_ = i_24_ % i_14_;
					i_25_ = i_26_ * (Class316.anInt3670 * -402153223) / i_14_;
				} else
					i_25_ = 0;
				is_21_[i_24_] = is_18_[i_25_];
				is_22_[i_24_] = is_19_[i_25_];
				is_23_[i_24_] = is_20_[i_25_];
			}
		}
		return is;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_27_) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub2) this).anInt9674 = class282_sub35.readUnsignedByte() * -354533115;
			break;
		case 0:
			((Class282_Sub20_Sub2) this).anInt9673 = class282_sub35.readUnsignedByte() * 1976138029;
			break;
		}
	}

	public Class282_Sub20_Sub2() {
		super(1, false);
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1781443758);
		if (aClass320_7667.aBool3722) {
			int i_28_ = (Class316.anInt3670 * -402153223 / (-126075227 * ((Class282_Sub20_Sub2) this).anInt9673));
			int i_29_ = (Class316.anInt3671 * -929726253 / (((Class282_Sub20_Sub2) this).anInt9674 * 1328374733));
			int[] is_30_;
			if (i_29_ > 0) {
				int i_31_ = i % i_29_;
				is_30_ = method12317(0, (i_31_ * (-929726253 * Class316.anInt3671) / i_29_), 1981052112);
			} else
				is_30_ = method12317(0, 0, 2134142873);
			for (int i_32_ = 0; i_32_ < -402153223 * Class316.anInt3670; i_32_++) {
				if (i_28_ > 0) {
					int i_33_ = i_32_ % i_28_;
					is[i_32_] = is_30_[(Class316.anInt3670 * -402153223 * i_33_ / i_28_)];
				} else
					is[i_32_] = is_30_[0];
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -1930330392);
		if (aClass320_7667.aBool3722) {
			int i_34_ = (Class316.anInt3670 * -402153223 / (-126075227 * ((Class282_Sub20_Sub2) this).anInt9673));
			int i_35_ = (Class316.anInt3671 * -929726253 / (((Class282_Sub20_Sub2) this).anInt9674 * 1328374733));
			int[] is_36_;
			if (i_35_ > 0) {
				int i_37_ = i % i_35_;
				is_36_ = method12317(0, (i_37_ * (-929726253 * Class316.anInt3671) / i_35_), 2137508183);
			} else
				is_36_ = method12317(0, 0, 1966117398);
			for (int i_38_ = 0; i_38_ < -402153223 * Class316.anInt3670; i_38_++) {
				if (i_34_ > 0) {
					int i_39_ = i_38_ % i_34_;
					is[i_38_] = is_36_[(Class316.anInt3670 * -402153223 * i_39_ / i_34_)];
				} else
					is[i_38_] = is_36_[0];
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub2) this).anInt9674 = class282_sub35.readUnsignedByte() * -354533115;
			break;
		case 0:
			((Class282_Sub20_Sub2) this).anInt9673 = class282_sub35.readUnsignedByte() * 1976138029;
			break;
		}
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub2) this).anInt9674 = class282_sub35.readUnsignedByte() * -354533115;
			break;
		case 0:
			((Class282_Sub20_Sub2) this).anInt9673 = class282_sub35.readUnsignedByte() * 1976138029;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			((Class282_Sub20_Sub2) this).anInt9674 = class282_sub35.readUnsignedByte() * -354533115;
			break;
		case 0:
			((Class282_Sub20_Sub2) this).anInt9673 = class282_sub35.readUnsignedByte() * 1976138029;
			break;
		}
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1874760126);
		if (aClass308_7670.aBool3619) {
			int i_40_ = (-402153223 * Class316.anInt3670 / (((Class282_Sub20_Sub2) this).anInt9673 * -126075227));
			int i_41_ = (Class316.anInt3671 * -929726253 / (((Class282_Sub20_Sub2) this).anInt9674 * 1328374733));
			int[][] is_42_;
			if (i_41_ > 0) {
				int i_43_ = i % i_41_;
				is_42_ = method12333(0, (i_43_ * (-929726253 * Class316.anInt3671) / i_41_), (byte) 3);
			} else
				is_42_ = method12333(0, 0, (byte) 3);
			int[] is_44_ = is_42_[0];
			int[] is_45_ = is_42_[1];
			int[] is_46_ = is_42_[2];
			int[] is_47_ = is[0];
			int[] is_48_ = is[1];
			int[] is_49_ = is[2];
			for (int i_50_ = 0; i_50_ < -402153223 * Class316.anInt3670; i_50_++) {
				int i_51_;
				if (i_40_ > 0) {
					int i_52_ = i_50_ % i_40_;
					i_51_ = i_52_ * (Class316.anInt3670 * -402153223) / i_40_;
				} else
					i_51_ = 0;
				is_47_[i_50_] = is_44_[i_51_];
				is_48_[i_50_] = is_45_[i_51_];
				is_49_[i_50_] = is_46_[i_51_];
			}
		}
		return is;
	}

	public static int method15076(int i, int i_53_, int i_54_) {
		i_53_ = (i & 0x7f) * i_53_ >> 7;
		if (i_53_ < 2)
			i_53_ = 2;
		else if (i_53_ > 126)
			i_53_ = 126;
		return (i & 0xff80) + i_53_;
	}
}
