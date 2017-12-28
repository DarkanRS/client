/* Class282_Sub20_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub15 extends Class282_Sub20 {
	static final boolean aBool9835 = false;
	int anInt9836 = -1744076800;
	static final int anInt9837 = 32768;
	static Class160[] aClass160Array9838;

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub15) this).anInt9836 = (class282_sub35.readUnsignedShort() << 4) * 2130784279;
			break;
		}
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -1629058018);
		if (aClass320_7667.aBool3722) {
			int[] is_1_ = method12317(1, i, 1944617403);
			int[] is_2_ = method12317(2, i, 2077893464);
			for (int i_3_ = 0; i_3_ < Class316.anInt3670 * -402153223; i_3_++) {
				int i_4_ = is_1_[i_3_] >> 4 & 0xff;
				int i_5_ = ((((Class282_Sub20_Sub15) this).anInt9836 * -503380057 * is_2_[i_3_]) >> 12);
				int i_6_ = i_5_ * Class316.anIntArray3675[i_4_] >> 12;
				int i_7_ = Class316.anIntArray3677[i_4_] * i_5_ >> 12;
				int i_8_ = i_3_ + (i_6_ >> 12) & 1201532175 * Class316.anInt3669;
				int i_9_ = i + (i_7_ >> 12) & 543225399 * Class316.anInt3673;
				int[] is_10_ = method12317(0, i_9_, 2118739410);
				is[i_3_] = is_10_[i_8_];
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_11_) {
		int[][] is = aClass308_7670.method5463(i, 1770027093);
		if (aClass308_7670.aBool3619) {
			int[] is_12_ = method12317(1, i, 2106118039);
			int[] is_13_ = method12317(2, i, 2042455351);
			int[] is_14_ = is[0];
			int[] is_15_ = is[1];
			int[] is_16_ = is[2];
			for (int i_17_ = 0; i_17_ < Class316.anInt3670 * -402153223; i_17_++) {
				int i_18_ = 255 * is_12_[i_17_] >> 12 & 0xff;
				int i_19_ = (is_13_[i_17_] * (((Class282_Sub20_Sub15) this).anInt9836 * -503380057) >> 12);
				int i_20_ = Class316.anIntArray3675[i_18_] * i_19_ >> 12;
				int i_21_ = i_19_ * Class316.anIntArray3677[i_18_] >> 12;
				int i_22_ = i_17_ + (i_20_ >> 12) & 1201532175 * Class316.anInt3669;
				int i_23_ = i + (i_21_ >> 12) & Class316.anInt3673 * 543225399;
				int[][] is_24_ = method12333(0, i_23_, (byte) 3);
				is_14_[i_17_] = is_24_[0][i_22_];
				is_15_[i_17_] = is_24_[1][i_22_];
				is_16_[i_17_] = is_24_[2][i_22_];
			}
		}
		return is;
	}

	void method12321(int i) {
		Class316.method5586((byte) 1);
	}

	void method12318() {
		Class316.method5586((byte) -30);
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub15) this).anInt9836 = (class282_sub35.readUnsignedShort() << 4) * 2130784279;
			break;
		}
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1726431669);
		if (aClass320_7667.aBool3722) {
			int[] is_25_ = method12317(1, i, 2012907139);
			int[] is_26_ = method12317(2, i, 2077296952);
			for (int i_27_ = 0; i_27_ < Class316.anInt3670 * -402153223; i_27_++) {
				int i_28_ = is_25_[i_27_] >> 4 & 0xff;
				int i_29_ = ((((Class282_Sub20_Sub15) this).anInt9836 * -503380057 * is_26_[i_27_]) >> 12);
				int i_30_ = i_29_ * Class316.anIntArray3675[i_28_] >> 12;
				int i_31_ = Class316.anIntArray3677[i_28_] * i_29_ >> 12;
				int i_32_ = i_27_ + (i_30_ >> 12) & 1201532175 * Class316.anInt3669;
				int i_33_ = i + (i_31_ >> 12) & 543225399 * Class316.anInt3673;
				int[] is_34_ = method12317(0, i_33_, 1926388092);
				is[i_27_] = is_34_[i_32_];
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, 311597781);
		if (aClass320_7667.aBool3722) {
			int[] is_35_ = method12317(1, i, 2041205462);
			int[] is_36_ = method12317(2, i, 1922764754);
			for (int i_37_ = 0; i_37_ < Class316.anInt3670 * -402153223; i_37_++) {
				int i_38_ = is_35_[i_37_] >> 4 & 0xff;
				int i_39_ = ((((Class282_Sub20_Sub15) this).anInt9836 * -503380057 * is_36_[i_37_]) >> 12);
				int i_40_ = i_39_ * Class316.anIntArray3675[i_38_] >> 12;
				int i_41_ = Class316.anIntArray3677[i_38_] * i_39_ >> 12;
				int i_42_ = i_37_ + (i_40_ >> 12) & 1201532175 * Class316.anInt3669;
				int i_43_ = i + (i_41_ >> 12) & 543225399 * Class316.anInt3673;
				int[] is_44_ = method12317(0, i_43_, 1977247759);
				is[i_37_] = is_44_[i_42_];
			}
		}
		return is;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_45_) {
		switch (i) {
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub15) this).anInt9836 = (class282_sub35.readUnsignedShort() << 4) * 2130784279;
			break;
		}
	}

	void method12329() {
		Class316.method5586((byte) -12);
	}

	void method12350() {
		Class316.method5586((byte) -39);
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, 764693854);
		if (aClass320_7667.aBool3722) {
			int[] is_46_ = method12317(1, i, 1982887359);
			int[] is_47_ = method12317(2, i, 2035098166);
			for (int i_48_ = 0; i_48_ < Class316.anInt3670 * -402153223; i_48_++) {
				int i_49_ = is_46_[i_48_] >> 4 & 0xff;
				int i_50_ = ((((Class282_Sub20_Sub15) this).anInt9836 * -503380057 * is_47_[i_48_]) >> 12);
				int i_51_ = i_50_ * Class316.anIntArray3675[i_49_] >> 12;
				int i_52_ = Class316.anIntArray3677[i_49_] * i_50_ >> 12;
				int i_53_ = i_48_ + (i_51_ >> 12) & 1201532175 * Class316.anInt3669;
				int i_54_ = i + (i_52_ >> 12) & 543225399 * Class316.anInt3673;
				int[] is_55_ = method12317(0, i_54_, 2035769341);
				is[i_48_] = is_55_[i_53_];
			}
		}
		return is;
	}

	void method12328() {
		Class316.method5586((byte) -77);
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 780948662);
		if (aClass308_7670.aBool3619) {
			int[] is_56_ = method12317(1, i, 2140400249);
			int[] is_57_ = method12317(2, i, 1964212200);
			int[] is_58_ = is[0];
			int[] is_59_ = is[1];
			int[] is_60_ = is[2];
			for (int i_61_ = 0; i_61_ < Class316.anInt3670 * -402153223; i_61_++) {
				int i_62_ = 255 * is_56_[i_61_] >> 12 & 0xff;
				int i_63_ = (is_57_[i_61_] * (((Class282_Sub20_Sub15) this).anInt9836 * -503380057) >> 12);
				int i_64_ = Class316.anIntArray3675[i_62_] * i_63_ >> 12;
				int i_65_ = i_63_ * Class316.anIntArray3677[i_62_] >> 12;
				int i_66_ = i_61_ + (i_64_ >> 12) & 1201532175 * Class316.anInt3669;
				int i_67_ = i + (i_65_ >> 12) & Class316.anInt3673 * 543225399;
				int[][] is_68_ = method12333(0, i_67_, (byte) 3);
				is_58_[i_61_] = is_68_[0][i_66_];
				is_59_[i_61_] = is_68_[1][i_66_];
				is_60_[i_61_] = is_68_[2][i_66_];
			}
		}
		return is;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 1:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 0:
			((Class282_Sub20_Sub15) this).anInt9836 = (class282_sub35.readUnsignedShort() << 4) * 2130784279;
			break;
		}
	}

	public Class282_Sub20_Sub15() {
		super(3, false);
	}

	static final void method15306(Class527 class527, int i) {
		Class119.method2077(2005204447);
		client.aClass257_7353.method4547((byte) -23);
		Class190.method3148((byte) 113);
		client.aBool7175 = false;
	}
}
