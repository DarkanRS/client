/* Class282_Sub20_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub25 extends Class282_Sub20 {
	int anInt9885 = -1538772637;

	void method12322(int i, RsByteBuffer class282_sub35, int i_0_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub25) this).anInt9885 = class282_sub35.readUnsignedShort() * 929781323;
		}
	}

	int[] method12319(int i, int i_1_) {
		int[] is = aClass320_7667.method5721(i, 633392158);
		if (aClass320_7667.aBool3722) {
			int i_2_ = Class316.anIntArray3668[i];
			for (int i_3_ = 0; i_3_ < -402153223 * Class316.anInt3670; i_3_++) {
				int i_4_ = Class316.anIntArray3672[i_3_];
				if (i_4_ > ((Class282_Sub20_Sub25) this).anInt9885 * -591903901 && i_4_ < 4096 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_2_ > 2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_2_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885 * -591903901)) {
					int i_5_ = 2048 - i_4_;
					i_5_ = i_5_ < 0 ? -i_5_ : i_5_;
					i_5_ <<= 12;
					i_5_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_3_] = 4096 - i_5_;
				} else if (i_4_ > 2048 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901 && i_4_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_6_ = i_2_ - 2048;
					i_6_ = i_6_ < 0 ? -i_6_ : i_6_;
					i_6_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_6_ <<= 12;
					is[i_3_] = i_6_ / (2048 - -591903901 * (((Class282_Sub20_Sub25) this).anInt9885));
				} else if (i_2_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_2_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_7_ = i_4_ - 2048;
					i_7_ = i_7_ < 0 ? -i_7_ : i_7_;
					i_7_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_7_ <<= 12;
					is[i_3_] = i_7_ / (2048 - -591903901 * (((Class282_Sub20_Sub25) this).anInt9885));
				} else if (i_4_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_4_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_8_ = 2048 - i_2_;
					i_8_ = i_8_ < 0 ? -i_8_ : i_8_;
					i_8_ <<= 12;
					i_8_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_3_] = 4096 - i_8_;
				} else
					is[i_3_] = 0;
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub25) this).anInt9885 = class282_sub35.readUnsignedShort() * 929781323;
		}
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -1711513871);
		if (aClass320_7667.aBool3722) {
			int i_9_ = Class316.anIntArray3668[i];
			for (int i_10_ = 0; i_10_ < -402153223 * Class316.anInt3670; i_10_++) {
				int i_11_ = Class316.anIntArray3672[i_10_];
				if ((i_11_ > ((Class282_Sub20_Sub25) this).anInt9885 * -591903901) && i_11_ < 4096 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_9_ > 2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_9_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885 * -591903901)) {
					int i_12_ = 2048 - i_11_;
					i_12_ = i_12_ < 0 ? -i_12_ : i_12_;
					i_12_ <<= 12;
					i_12_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_10_] = 4096 - i_12_;
				} else if (i_11_ > 2048 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901 && i_11_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_13_ = i_9_ - 2048;
					i_13_ = i_13_ < 0 ? -i_13_ : i_13_;
					i_13_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_13_ <<= 12;
					is[i_10_] = i_13_ / (2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
				} else if (i_9_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_9_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_14_ = i_11_ - 2048;
					i_14_ = i_14_ < 0 ? -i_14_ : i_14_;
					i_14_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_14_ <<= 12;
					is[i_10_] = i_14_ / (2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
				} else if (i_11_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_11_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_15_ = 2048 - i_9_;
					i_15_ = i_15_ < 0 ? -i_15_ : i_15_;
					i_15_ <<= 12;
					i_15_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_10_] = 4096 - i_15_;
				} else
					is[i_10_] = 0;
			}
		}
		return is;
	}

	public Class282_Sub20_Sub25() {
		super(0, true);
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -264261588);
		if (aClass320_7667.aBool3722) {
			int i_16_ = Class316.anIntArray3668[i];
			for (int i_17_ = 0; i_17_ < -402153223 * Class316.anInt3670; i_17_++) {
				int i_18_ = Class316.anIntArray3672[i_17_];
				if ((i_18_ > ((Class282_Sub20_Sub25) this).anInt9885 * -591903901) && i_18_ < 4096 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_16_ > 2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_16_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885 * -591903901)) {
					int i_19_ = 2048 - i_18_;
					i_19_ = i_19_ < 0 ? -i_19_ : i_19_;
					i_19_ <<= 12;
					i_19_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_17_] = 4096 - i_19_;
				} else if (i_18_ > 2048 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901 && i_18_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_20_ = i_16_ - 2048;
					i_20_ = i_20_ < 0 ? -i_20_ : i_20_;
					i_20_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_20_ <<= 12;
					is[i_17_] = i_20_ / (2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
				} else if (i_16_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_16_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_21_ = i_18_ - 2048;
					i_21_ = i_21_ < 0 ? -i_21_ : i_21_;
					i_21_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_21_ <<= 12;
					is[i_17_] = i_21_ / (2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
				} else if (i_18_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_18_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_22_ = 2048 - i_16_;
					i_22_ = i_22_ < 0 ? -i_22_ : i_22_;
					i_22_ <<= 12;
					i_22_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_17_] = 4096 - i_22_;
				} else
					is[i_17_] = 0;
			}
		}
		return is;
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, 404980804);
		if (aClass320_7667.aBool3722) {
			int i_23_ = Class316.anIntArray3668[i];
			for (int i_24_ = 0; i_24_ < -402153223 * Class316.anInt3670; i_24_++) {
				int i_25_ = Class316.anIntArray3672[i_24_];
				if ((i_25_ > ((Class282_Sub20_Sub25) this).anInt9885 * -591903901) && i_25_ < 4096 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_23_ > 2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885 && i_23_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885 * -591903901)) {
					int i_26_ = 2048 - i_25_;
					i_26_ = i_26_ < 0 ? -i_26_ : i_26_;
					i_26_ <<= 12;
					i_26_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_24_] = 4096 - i_26_;
				} else if (i_25_ > 2048 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901 && i_25_ < 2048 + (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_27_ = i_23_ - 2048;
					i_27_ = i_27_ < 0 ? -i_27_ : i_27_;
					i_27_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_27_ <<= 12;
					is[i_24_] = i_27_ / (2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
				} else if (i_23_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_23_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_28_ = i_25_ - 2048;
					i_28_ = i_28_ < 0 ? -i_28_ : i_28_;
					i_28_ -= (-591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
					i_28_ <<= 12;
					is[i_24_] = i_28_ / (2048 - -591903901 * ((Class282_Sub20_Sub25) this).anInt9885);
				} else if (i_25_ < (((Class282_Sub20_Sub25) this).anInt9885 * -591903901) || i_25_ > 4096 - (((Class282_Sub20_Sub25) this).anInt9885) * -591903901) {
					int i_29_ = 2048 - i_23_;
					i_29_ = i_29_ < 0 ? -i_29_ : i_29_;
					i_29_ <<= 12;
					i_29_ /= 2048 - (((Class282_Sub20_Sub25) this).anInt9885 * -591903901);
					is[i_24_] = 4096 - i_29_;
				} else
					is[i_24_] = 0;
			}
		}
		return is;
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub25) this).anInt9885 = class282_sub35.readUnsignedShort() * 929781323;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub25) this).anInt9885 = class282_sub35.readUnsignedShort() * 929781323;
		}
	}

	static final void method15392(CS2Executor class527, int i) {
		Class118 class118 = Class117.method1981((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]), (byte) 16);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -56249735 * class118.anInt1426;
	}

	public static void method15393(boolean bool, int i) {
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), 1, 62287602);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), 1, 463702183);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub23_8202), 0, -1779797403);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub30_8194), 0, -1558090127);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub17_8200), 0, 1513887822);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub15_8203), 0, -1514537540);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub26_8224), 0, 1378722670);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub28_8212), 0, -339994641);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub2_8205), 0, 1587382390);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub22_8213), 0, -1566931898);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub19_8204), 0, 142474266);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub24_8216), 0, 1640092780);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub4_8187), 0, -847424999);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub4_8223), 0, 358482435);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), 0, 2033925467);
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071 * -530599889, -273525452);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub12_8195), 0, 1196949747);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), 0, -1623251899);
		Class323.method5777(1755856105);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub7_8210), 2, -1469341129);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 1, -971375585);
		Class94.method1589((short) 255);
		client.aClass257_7353.method4435((byte) 1).method4048(-462453553);
		client.aBool7185 = true;
	}
}
