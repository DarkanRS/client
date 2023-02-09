package com.rs.jagex;

public class MaterialProp1 extends MaterialProperty {

	int anInt9869;
	int anInt9870;
	int anInt9871;

	MaterialProp1() {
		super(0, false);
		method15378(0);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			method15378(rsbytebuffer_2.read24BitUnsignedInteger());
		default:
		}
	}

	@Override
	int[][] getPixels(int i_1) {
		int[][] ints_3 = aClass308_7670.method5463(i_1);
		if (aClass308_7670.aBool3619) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];

			for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
				ints_4[i_7] = anInt9871;
				ints_5[i_7] = anInt9870;
				ints_6[i_7] = anInt9869;
			}
		}

		return ints_3;
	}

	void method15378(int i_1) {
		anInt9869 = (i_1 & 0xff) << 4;
		anInt9870 = (i_1 & 0xff00) >> 4;
		anInt9871 = (i_1 & 0xff0000) >> 12;
	}

}
