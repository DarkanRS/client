package com.rs.jagex;

public class MaterialProp11 extends MaterialProperty {

	int anInt9971 = 4096;
	int anInt9970 = 4096;
	int anInt9968 = 4096;

	public MaterialProp11() {
		super(1, false);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			anInt9971 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			anInt9970 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			anInt9968 = rsbytebuffer_2.readUnsignedShort();
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
				int i_13 = ints_7[i_11];
				int i_14 = ints_6[i_11];
				if (i_12 == i_13 && i_14 == i_13) {
					ints_8[i_11] = i_12 * anInt9971 >> 12;
			ints_9[i_11] = i_13 * anInt9970 >> 12;
			ints_10[i_11] = i_14 * anInt9968 >> 12;
				} else {
					ints_8[i_11] = anInt9971;
					ints_9[i_11] = anInt9970;
					ints_10[i_11] = anInt9968;
				}
			}
		}

		return ints_3;
	}

}
