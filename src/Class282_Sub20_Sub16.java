public class Class282_Sub20_Sub16 extends Class282_Sub20 {

	int anInt9842 = 1;

	int anInt9843 = 1;

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -937795728);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = this.anInt9843 + this.anInt9843 + 1;
			int i_5 = 65536 / i_4;
			int i_6 = this.anInt9842 + this.anInt9842 + 1;
			int i_7 = 65536 / i_6;
			int[][] ints_8 = new int[i_4][];
			int i_9;
			for (i_9 = i_1 - this.anInt9843; i_9 <= this.anInt9843 + i_1; i_9++) {
				int[] ints_14 = this.method12317(0, i_9 & Class316.anInt3673, 1959050678);
				int[] ints_15 = new int[Class316.anInt3670];
				int i_12 = 0;
				int i_13;
				for (i_13 = -this.anInt9842; i_13 <= this.anInt9842; i_13++) {
					i_12 += ints_14[i_13 & Class316.anInt3669];
				}
				for (i_13 = 0; i_13 < Class316.anInt3670; i_12 += ints_14[i_13 + this.anInt9842 & Class316.anInt3669]) {
					ints_15[i_13] = i_12 * i_7 >> 16;
					i_12 -= ints_14[i_13 - this.anInt9842 & Class316.anInt3669];
					++i_13;
				}
				ints_8[i_9 + this.anInt9843 - i_1] = ints_15;
			}
			for (i_9 = 0; i_9 < Class316.anInt3670; i_9++) {
				int i_10 = 0;
				for (int i_11 = 0; i_11 < i_4; i_11++) {
					i_10 += ints_8[i_11][i_9];
				}
				ints_3[i_9] = i_10 * i_5 >> 16;
			}
		}
		return ints_3;
	}

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 2090479453);
		if (this.aClass308_7670.aBool3619) {
			int i_4 = this.anInt9843 + this.anInt9843 + 1;
			int i_5 = 65536 / i_4;
			int i_6 = this.anInt9842 + this.anInt9842 + 1;
			int i_7 = 65536 / i_6;
			int[][][] ints_8 = new int[i_4][][];
			int i_12;
			int i_13;
			int i_14;
			for (int i_9 = i_1 - this.anInt9843; i_9 <= this.anInt9843 + i_1; i_9++) {
				int[][] ints_10 = this.method12333(0, i_9 & Class316.anInt3673, (byte) 3);
				int[][] ints_11 = new int[3][Class316.anInt3670];
				i_12 = 0;
				i_13 = 0;
				i_14 = 0;
				int[] ints_24 = ints_10[0];
				int[] ints_25 = ints_10[1];
				int[] ints_17 = ints_10[2];
				for (int i_18 = -this.anInt9842; i_18 <= this.anInt9842; i_18++) {
					int i_27 = i_18 & Class316.anInt3669;
					i_12 += ints_24[i_27];
					i_13 += ints_25[i_27];
					i_14 += ints_17[i_27];
				}
				int[] ints_26 = ints_11[0];
				int[] ints_19 = ints_11[1];
				int[] ints_20 = ints_11[2];
				int i_22;
				for (int i_21 = 0; i_21 < Class316.anInt3670; i_14 += ints_17[i_22]) {
					ints_26[i_21] = i_7 * i_12 >> 16;
					ints_19[i_21] = i_7 * i_13 >> 16;
					ints_20[i_21] = i_14 * i_7 >> 16;
					i_22 = i_21 - this.anInt9842 & Class316.anInt3669;
					i_12 -= ints_24[i_22];
					i_13 -= ints_25[i_22];
					i_14 -= ints_17[i_22];
					++i_21;
					i_22 = i_21 + this.anInt9842 & Class316.anInt3669;
					i_12 += ints_24[i_22];
					i_13 += ints_25[i_22];
				}
				ints_8[i_9 + this.anInt9843 - i_1] = ints_11;
			}
			int[] ints_23 = ints_3[0];
			int[] ints_28 = ints_3[1];
			int[] ints_29 = ints_3[2];
			for (i_12 = 0; i_12 < Class316.anInt3670; i_12++) {
				i_13 = 0;
				i_14 = 0;
				int i_15 = 0;
				for (int i_16 = 0; i_16 < i_4; i_16++) {
					int[][] ints_30 = ints_8[i_16];
					i_13 += ints_30[0][i_12];
					i_14 += ints_30[1][i_12];
					i_15 += ints_30[2][i_12];
				}
				ints_23[i_12] = i_13 * i_5 >> 16;
				ints_28[i_12] = i_5 * i_14 >> 16;
				ints_29[i_12] = i_5 * i_15 >> 16;
			}
		}
		return ints_3;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9842 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9843 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 2:
			this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
		}
	}

	public Class282_Sub20_Sub16() {
		super(1, false);
	}
}
