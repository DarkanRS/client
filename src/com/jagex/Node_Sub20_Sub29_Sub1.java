package com.jagex;
public class Node_Sub20_Sub29_Sub1 extends Node_Sub20_Sub29 {

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 2115111278);
		if (this.aClass308_7670.aBool3619 && this.method15398()) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];
			int i_7 = i_1 % this.anInt9915 * this.anInt9915;

			for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
				int i_9 = this.anIntArray9916[i_8 % this.anInt9914 + i_7];
				ints_6[i_8] = (i_9 & 0xff) << 4;
				ints_5[i_8] = (i_9 & 0xff00) >> 4;
				ints_4[i_8] = (i_9 & 0xff0000) >> 12;
			}
		}

		return ints_3;
	}

}
