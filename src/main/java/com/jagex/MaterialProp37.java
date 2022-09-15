package com.jagex;

public class MaterialProp37 extends MaterialProperty {

	int anInt9830 = 2048;
	int anInt9829;
	int anInt9833;
	int anInt9831 = 2048;
	int anInt9832 = 12288;
	int anInt9828 = 4096;
	int anInt9834 = 8192;

	public MaterialProp37() {
		super(0, true);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			anInt9830 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			anInt9829 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			anInt9833 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			anInt9831 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			anInt9832 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 5:
			anInt9828 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 6:
			anInt9834 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	@Override
	int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1] - 2048;

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				int i_6 = Class316.anIntArray3672[i_5] - 2048;
				int i_7 = i_6 + anInt9830;
				i_7 = i_7 < -2048 ? i_7 + 4096 : i_7;
				i_7 = i_7 > 2048 ? i_7 - 4096 : i_7;
				int i_8 = i_4 + anInt9829;
				i_8 = i_8 < -2048 ? i_8 + 4096 : i_8;
				i_8 = i_8 > 2048 ? i_8 - 4096 : i_8;
				int i_9 = i_6 + anInt9833;
				i_9 = i_9 < -2048 ? i_9 + 4096 : i_9;
				i_9 = i_9 > 2048 ? i_9 - 4096 : i_9;
				int i_10 = i_4 + anInt9831;
				i_10 = i_10 < -2048 ? i_10 + 4096 : i_10;
				i_10 = i_10 > 2048 ? i_10 - 4096 : i_10;
				ints_3[i_5] = !method15302(i_7, i_8) && !method15300(i_9, i_10) ? 0 : 4096;
			}
		}

		return ints_3;
	}

	@Override
	void method12321() {
		Class316.method5586();
	}

	boolean method15300(int i_1, int i_2) {
		int i_4 = (i_2 + i_1) * anInt9832 >> 12;
			int i_5 = Class316.anIntArray3675[i_4 * 255 >> 12 & 0xff];
			i_5 = (i_5 << 12) / anInt9832;
			i_5 = (i_5 << 12) / anInt9834;
			i_5 = i_5 * anInt9828 >> 12;
			return i_2 - i_1 < i_5 && i_2 - i_1 > -i_5;
	}

	boolean method15302(int i_1, int i_2) {
		int i_4 = (i_2 - i_1) * anInt9832 >> 12;
			int i_5 = Class316.anIntArray3675[i_4 * 255 >> 12 & 0xff];
			i_5 = (i_5 << 12) / anInt9832;
			i_5 = (i_5 << 12) / anInt9834;
			i_5 = i_5 * anInt9828 >> 12;
			return i_2 + i_1 < i_5 && i_2 + i_1 > -i_5;
	}

}
