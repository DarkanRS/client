public class Node_Sub20_Sub31 extends Node_Sub20 {

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1106148078);
		if (this.aClass308_7670.aBool3619) {
			int[][] ints_4 = this.method12333(0, i_1);
			int[] ints_5 = ints_4[0];
			int[] ints_6 = ints_4[1];
			int[] ints_7 = ints_4[2];
			int[] ints_8 = ints_3[0];
			int[] ints_9 = ints_3[1];
			int[] ints_10 = ints_3[2];

			for (int i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
				ints_8[i_11] = 4096 - ints_5[i_11];
				ints_9[i_11] = 4096 - ints_6[i_11];
				ints_10[i_11] = 4096 - ints_7[i_11];
			}
		}

		return ints_3;
	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -1476130867);
		if (this.aClass320_7667.aBool3722) {
			int[] ints_4 = this.method12317(0, i_1, 2029672467);

			for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
				ints_3[i_5] = 4096 - ints_4[i_5];
			}
		}

		return ints_3;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		if (i_1 == 0) {
			this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
		}

	}

	public Node_Sub20_Sub31() {
		super(1, false);
	}

}
