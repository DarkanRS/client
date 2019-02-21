/* Class282_Sub20_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub19 extends Class282_Sub20 {
	Class149[] aClass149Array9862;
	static final boolean aBool9863 = true;

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, 705963785);
		if (aClass320_7667.aBool3722)
			method15372(aClass320_7667.method5722((byte) 1), -25414305);
		return is;
	}

	public Class282_Sub20_Sub19() {
		super(0, true);
	}

	int[][] method12320(int i, int i_1_) {
		int[][] is = aClass308_7670.method5463(i, 789226746);
		if (aClass308_7670.aBool3619) {
			int i_2_ = Class316.anInt3670 * -402153223;
			int i_3_ = Class316.anInt3671 * -929726253;
			int[][] is_4_ = new int[i_3_][i_2_];
			int[][][] is_5_ = aClass308_7670.method5464(-1058244211);
			method15372(is_4_, -25414305);
			for (int i_6_ = 0; i_6_ < -929726253 * Class316.anInt3671; i_6_++) {
				int[] is_7_ = is_4_[i_6_];
				int[][] is_8_ = is_5_[i_6_];
				int[] is_9_ = is_8_[0];
				int[] is_10_ = is_8_[1];
				int[] is_11_ = is_8_[2];
				for (int i_12_ = 0; i_12_ < Class316.anInt3670 * -402153223; i_12_++) {
					int i_13_ = is_7_[i_12_];
					is_11_[i_12_] = (i_13_ & 0xff) << 4;
					is_10_[i_12_] = (i_13_ & 0xff00) >> 4;
					is_9_[i_12_] = (i_13_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	final void method15372(int[][] is, int i) {
		int i_14_ = Class316.anInt3670 * -402153223;
		int i_15_ = Class316.anInt3671 * -929726253;
		Class233.method3936(is, -1894758972);
		WallDecoration.method16086(0, 0, Class316.anInt3669 * 1201532175, Class316.anInt3673 * 543225399, 1229420958);
		if (((Class282_Sub20_Sub19) this).aClass149Array9862 != null) {
			for (int i_16_ = 0; (i_16_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_16_++) {
				Class149 class149 = ((Class282_Sub20_Sub19) this).aClass149Array9862[i_16_];
				int i_17_ = ((Class149) class149).anInt1743 * 1340859839;
				int i_18_ = ((Class149) class149).anInt1741 * -1525176857;
				if (i_17_ >= 0) {
					if (i_18_ >= 0)
						class149.method2557(i_14_, i_15_, (byte) 36);
					else
						class149.method2556(i_14_, i_15_, 44333930);
				} else if (i_18_ >= 0)
					class149.method2561(i_14_, i_15_, 1438121569);
			}
		}
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_19_) {
		if (0 == i) {
			((Class282_Sub20_Sub19) this).aClass149Array9862 = new Class149[class282_sub35.readUnsignedByte()];
			for (int i_20_ = 0; (i_20_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_20_++) {
				int i_21_ = class282_sub35.readUnsignedByte();
				switch (i_21_) {
				case 1:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_20_] = Class514.method8842(class282_sub35, (byte) -32);
					break;
				case 0:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_20_] = Class242.method4165(class282_sub35, 623572265);
					break;
				case 2:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_20_] = SoftwareItemRender.method7033(class282_sub35, 2040554812);
					break;
				case 3:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_20_] = Animation.method7644(class282_sub35, 153787879);
					break;
				}
			}
		} else if (1 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1278995011);
		if (aClass320_7667.aBool3722)
			method15372(aClass320_7667.method5722((byte) 1), -25414305);
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -2011747950);
		if (aClass320_7667.aBool3722)
			method15372(aClass320_7667.method5722((byte) 1), -25414305);
		return is;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		if (0 == i) {
			((Class282_Sub20_Sub19) this).aClass149Array9862 = new Class149[class282_sub35.readUnsignedByte()];
			for (int i_22_ = 0; (i_22_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_22_++) {
				int i_23_ = class282_sub35.readUnsignedByte();
				switch (i_23_) {
				case 1:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_22_] = Class514.method8842(class282_sub35, (byte) 33);
					break;
				case 0:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_22_] = Class242.method4165(class282_sub35, 626526682);
					break;
				case 2:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_22_] = SoftwareItemRender.method7033(class282_sub35, 1916258333);
					break;
				case 3:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_22_] = Animation.method7644(class282_sub35, 5565827);
					break;
				}
			}
		} else if (1 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		if (0 == i) {
			((Class282_Sub20_Sub19) this).aClass149Array9862 = new Class149[class282_sub35.readUnsignedByte()];
			for (int i_24_ = 0; (i_24_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_24_++) {
				int i_25_ = class282_sub35.readUnsignedByte();
				switch (i_25_) {
				case 1:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_24_] = Class514.method8842(class282_sub35, (byte) -3);
					break;
				case 0:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_24_] = Class242.method4165(class282_sub35, 1535398504);
					break;
				case 2:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_24_] = SoftwareItemRender.method7033(class282_sub35, 1872880342);
					break;
				case 3:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_24_] = Animation.method7644(class282_sub35, -8610723);
					break;
				}
			}
		} else if (1 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		if (0 == i) {
			((Class282_Sub20_Sub19) this).aClass149Array9862 = new Class149[class282_sub35.readUnsignedByte()];
			for (int i_26_ = 0; (i_26_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_26_++) {
				int i_27_ = class282_sub35.readUnsignedByte();
				switch (i_27_) {
				case 1:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_26_] = Class514.method8842(class282_sub35, (byte) 85);
					break;
				case 0:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_26_] = Class242.method4165(class282_sub35, 322498136);
					break;
				case 2:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_26_] = SoftwareItemRender.method7033(class282_sub35, 2061966786);
					break;
				case 3:
					((Class282_Sub20_Sub19) this).aClass149Array9862[i_26_] = Animation.method7644(class282_sub35, 715141012);
					break;
				}
			}
		} else if (1 == i)
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, -1672933013);
		if (aClass320_7667.aBool3722)
			method15372(aClass320_7667.method5722((byte) 1), -25414305);
		return is;
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1133255212);
		if (aClass308_7670.aBool3619) {
			int i_28_ = Class316.anInt3670 * -402153223;
			int i_29_ = Class316.anInt3671 * -929726253;
			int[][] is_30_ = new int[i_29_][i_28_];
			int[][][] is_31_ = aClass308_7670.method5464(-1058244211);
			method15372(is_30_, -25414305);
			for (int i_32_ = 0; i_32_ < -929726253 * Class316.anInt3671; i_32_++) {
				int[] is_33_ = is_30_[i_32_];
				int[][] is_34_ = is_31_[i_32_];
				int[] is_35_ = is_34_[0];
				int[] is_36_ = is_34_[1];
				int[] is_37_ = is_34_[2];
				for (int i_38_ = 0; i_38_ < Class316.anInt3670 * -402153223; i_38_++) {
					int i_39_ = is_33_[i_38_];
					is_37_[i_38_] = (i_39_ & 0xff) << 4;
					is_36_[i_38_] = (i_39_ & 0xff00) >> 4;
					is_35_[i_38_] = (i_39_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	final void method15373(int[][] is) {
		int i = Class316.anInt3670 * -402153223;
		int i_40_ = Class316.anInt3671 * -929726253;
		Class233.method3936(is, 849035483);
		WallDecoration.method16086(0, 0, Class316.anInt3669 * 1201532175, Class316.anInt3673 * 543225399, 1229420958);
		if (((Class282_Sub20_Sub19) this).aClass149Array9862 != null) {
			for (int i_41_ = 0; (i_41_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_41_++) {
				Class149 class149 = ((Class282_Sub20_Sub19) this).aClass149Array9862[i_41_];
				int i_42_ = ((Class149) class149).anInt1743 * 1340859839;
				int i_43_ = ((Class149) class149).anInt1741 * -1525176857;
				if (i_42_ >= 0) {
					if (i_43_ >= 0)
						class149.method2557(i, i_40_, (byte) -65);
					else
						class149.method2556(i, i_40_, 1535770023);
				} else if (i_43_ >= 0)
					class149.method2561(i, i_40_, 1316650693);
			}
		}
	}

	final void method15374(int[][] is) {
		int i = Class316.anInt3670 * -402153223;
		int i_44_ = Class316.anInt3671 * -929726253;
		Class233.method3936(is, -819532276);
		WallDecoration.method16086(0, 0, Class316.anInt3669 * 1201532175, Class316.anInt3673 * 543225399, 1229420958);
		if (((Class282_Sub20_Sub19) this).aClass149Array9862 != null) {
			for (int i_45_ = 0; (i_45_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_45_++) {
				Class149 class149 = ((Class282_Sub20_Sub19) this).aClass149Array9862[i_45_];
				int i_46_ = ((Class149) class149).anInt1743 * 1340859839;
				int i_47_ = ((Class149) class149).anInt1741 * -1525176857;
				if (i_46_ >= 0) {
					if (i_47_ >= 0)
						class149.method2557(i, i_44_, (byte) -39);
					else
						class149.method2556(i, i_44_, 835276438);
				} else if (i_47_ >= 0)
					class149.method2561(i, i_44_, 881737531);
			}
		}
	}

	final void method15375(int[][] is) {
		int i = Class316.anInt3670 * -402153223;
		int i_48_ = Class316.anInt3671 * -929726253;
		Class233.method3936(is, 1711243204);
		WallDecoration.method16086(0, 0, Class316.anInt3669 * 1201532175, Class316.anInt3673 * 543225399, 1229420958);
		if (((Class282_Sub20_Sub19) this).aClass149Array9862 != null) {
			for (int i_49_ = 0; (i_49_ < ((Class282_Sub20_Sub19) this).aClass149Array9862.length); i_49_++) {
				Class149 class149 = ((Class282_Sub20_Sub19) this).aClass149Array9862[i_49_];
				int i_50_ = ((Class149) class149).anInt1743 * 1340859839;
				int i_51_ = ((Class149) class149).anInt1741 * -1525176857;
				if (i_50_ >= 0) {
					if (i_51_ >= 0)
						class149.method2557(i, i_48_, (byte) -47);
					else
						class149.method2556(i, i_48_, 1294910692);
				} else if (i_51_ >= 0)
					class149.method2561(i, i_48_, 988937282);
			}
		}
	}

	static final void method15376(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -242416735 * client.anInt7354;
	}
}
