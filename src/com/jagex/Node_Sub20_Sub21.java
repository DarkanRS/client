package com.jagex;
public class Node_Sub20_Sub21 extends Node_Sub20 {

	int anInt9869;
	int anInt9870;
	int anInt9871;

	Node_Sub20_Sub21() {
		super(0, false);
		this.method15378(0);
	}

	void method15378(int i_1) {
		this.anInt9869 = (i_1 & 0xff) << 4;
		this.anInt9870 = (i_1 & 0xff00) >> 4;
		this.anInt9871 = (i_1 & 0xff0000) >> 12;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.method15378(rsbytebuffer_2.read24BitUnsignedInteger());
		default:
		}
	}

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1977566548);
		if (this.aClass308_7670.aBool3619) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];

			for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
				ints_4[i_7] = this.anInt9871;
				ints_5[i_7] = this.anInt9870;
				ints_6[i_7] = this.anInt9869;
			}
		}

		return ints_3;
	}

}
