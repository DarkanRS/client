package com.jagex;

public class MaterialProp6 extends MaterialProperty {

	int anInt9864;
	int anInt9868 = 4096;

	public MaterialProp6() {
		super(1, false);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			anInt9864 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			anInt9868 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			noPalette = rsbytebuffer_2.readUnsignedByte() == 1;
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
				int i_13 = ints_6[i_11];
				int i_14 = ints_7[i_11];
				if (i_12 < anInt9864)
					ints_8[i_11] = anInt9864;
				else ints_8[i_11] = Math.min(i_12, anInt9868);

				if (i_13 < anInt9864)
					ints_9[i_11] = anInt9864;
				else ints_9[i_11] = Math.min(i_13, anInt9868);

				if (i_14 < anInt9864)
					ints_10[i_11] = anInt9864;
				else ints_10[i_11] = Math.min(i_14, anInt9868);
			}
		}

		return ints_3;
	}

	@Override
	int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722) {
			int[] ints_4 = method12317(0, i_1);

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				int i_6 = ints_4[i_5];
				if (i_6 < anInt9864)
					ints_3[i_5] = anInt9864;
				else ints_3[i_5] = Math.min(i_6, anInt9868);
			}
		}

		return ints_3;
	}

}
