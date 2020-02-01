package com.jagex;
public class Node_Sub20_Sub20 extends Node_Sub20 {

	int anInt9864 = 0;
	int anInt9868 = 4096;

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1039004960);
		if (this.aClass308_7670.aBool3619) {
			int[][] ints_4 = this.method12333(0, i_1);
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
				if (i_12 < this.anInt9864) {
					ints_8[i_11] = this.anInt9864;
				} else if (i_12 > this.anInt9868) {
					ints_8[i_11] = this.anInt9868;
				} else {
					ints_8[i_11] = i_12;
				}

				if (i_13 < this.anInt9864) {
					ints_9[i_11] = this.anInt9864;
				} else if (i_13 > this.anInt9868) {
					ints_9[i_11] = this.anInt9868;
				} else {
					ints_9[i_11] = i_13;
				}

				if (i_14 < this.anInt9864) {
					ints_10[i_11] = this.anInt9864;
				} else if (i_14 > this.anInt9868) {
					ints_10[i_11] = this.anInt9868;
				} else {
					ints_10[i_11] = i_14;
				}
			}
		}

		return ints_3;
	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -335262287);
		if (this.aClass320_7667.aBool3722) {
			int[] ints_4 = this.method12317(0, i_1, 1946051522);

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				int i_6 = ints_4[i_5];
				if (i_6 < this.anInt9864) {
					ints_3[i_5] = this.anInt9864;
				} else if (i_6 > this.anInt9868) {
					ints_3[i_5] = this.anInt9868;
				} else {
					ints_3[i_5] = i_6;
				}
			}
		}

		return ints_3;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9864 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 1:
			this.anInt9868 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
		}

	}

	public Node_Sub20_Sub20() {
		super(1, false);
	}

}
