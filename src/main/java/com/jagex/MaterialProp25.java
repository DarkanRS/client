package com.jagex;

public class MaterialProp25 extends MaterialProperty {

	static int method15396() {
		return ++Class81.anInt801 - 1;
	}
	int anInt9907 = 4096;
	int anInt9908 = 4096;
	int anInt9909 = 4096;
	int anInt9903 = 409;

	int[] anIntArray9911 = new int[3];

	public MaterialProp25() {
		super(1, false);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			anInt9903 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			anInt9907 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			anInt9908 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			anInt9909 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			int i_4 = rsbytebuffer_2.read24BitUnsignedInteger();
			anIntArray9911[0] = (i_4 & 0xff0000) << 4;
			anIntArray9911[1] = (i_4 & 0xff00) >> 4;
			anIntArray9911[2] = (i_4 & 0xff) >> 12;
		}

	}

	@Override
	int[][] getPixels(int i_1) {
		int[][] ints_3 = aClass308_7670.method5463(i_1);
		if (aClass308_7670.aBool3619) {
			int[][] ints_4 = method12333(0, i_1);
			int[] ints_5 = ints_4[0];
			int[] ints_6 = ints_4[1];
			int[] ints_7 = ints_4[2];
			int[] ints_8 = ints_3[0];
			int[] ints_9 = ints_3[1];
			int[] ints_10 = ints_3[2];

			for (int i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
				int i_12 = ints_5[i_11];
				int i_13 = i_12 - anIntArray9911[0];
				if (i_13 < 0)
					i_13 = -i_13;

				if (i_13 > anInt9903) {
					ints_8[i_11] = i_12;
					ints_9[i_11] = ints_6[i_11];
					ints_10[i_11] = ints_7[i_11];
				} else {
					int i_14 = ints_6[i_11];
					i_13 = i_14 - anIntArray9911[1];
					if (i_13 < 0)
						i_13 = -i_13;

					if (i_13 > anInt9903) {
						ints_8[i_11] = i_12;
						ints_9[i_11] = i_14;
						ints_10[i_11] = ints_7[i_11];
					} else {
						int i_15 = ints_7[i_11];
						i_13 = i_15 - anIntArray9911[2];
						if (i_13 < 0)
							i_13 = -i_13;

						if (i_13 > anInt9903) {
							ints_8[i_11] = i_12;
							ints_9[i_11] = i_14;
							ints_10[i_11] = i_15;
						} else {
							ints_8[i_11] = i_12 * anInt9909 >> 12;
			ints_9[i_11] = i_14 * anInt9908 >> 12;
			ints_10[i_11] = i_15 * anInt9907 >> 12;
						}
					}
				}
			}
		}

		return ints_3;
	}

}
