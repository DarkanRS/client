public class Class282_Sub20_Sub15 extends Class282_Sub20 {

	static NativeSprite[] aClass160Array9838;
	int anInt9836 = 32768;

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -1629058018);
		if (this.aClass320_7667.aBool3722) {
			int[] ints_4 = this.method12317(1, i_1, 1944617403);
			int[] ints_5 = this.method12317(2, i_1, 2077893464);

			for (int i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
				int i_7 = ints_4[i_6] >> 4 & 0xff;
				int i_8 = this.anInt9836 * ints_5[i_6] >> 12;
				int i_9 = Class316.anIntArray3675[i_7] * i_8 >> 12;
				int i_10 = Class316.anIntArray3677[i_7] * i_8 >> 12;
				int i_11 = i_6 + (i_9 >> 12) & Class316.anInt3669;
				int i_12 = (i_10 >> 12) + i_1 & Class316.anInt3673;
				int[] ints_13 = this.method12317(0, i_12, 2118739410);
				ints_3[i_6] = ints_13[i_11];
			}
		}

		return ints_3;
	}

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1770027093);
		if (this.aClass308_7670.aBool3619) {
			int[] ints_4 = this.method12317(1, i_1, 2106118039);
			int[] ints_5 = this.method12317(2, i_1, 2042455351);
			int[] ints_6 = ints_3[0];
			int[] ints_7 = ints_3[1];
			int[] ints_8 = ints_3[2];

			for (int i_9 = 0; i_9 < Class316.anInt3670; i_9++) {
				int i_10 = ints_4[i_9] * 255 >> 12 & 0xff;
				int i_11 = this.anInt9836 * ints_5[i_9] >> 12;
				int i_12 = Class316.anIntArray3675[i_10] * i_11 >> 12;
				int i_13 = Class316.anIntArray3677[i_10] * i_11 >> 12;
				int i_14 = i_9 + (i_12 >> 12) & Class316.anInt3669;
				int i_15 = (i_13 >> 12) + i_1 & Class316.anInt3673;
				int[][] ints_16 = this.method12333(0, i_15, (byte) 3);
				ints_6[i_9] = ints_16[0][i_14];
				ints_7[i_9] = ints_16[1][i_14];
				ints_8[i_9] = ints_16[2][i_14];
			}
		}

		return ints_3;
	}

	void method12321(int i_1) {
		Class316.method5586((byte) 1);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9836 = rsbytebuffer_2.readUnsignedShort() << 4;
			break;
		case 1:
			this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
		}

	}

	public Class282_Sub20_Sub15() {
		super(3, false);
	}

	static final void method15306(CS2Executor cs2executor_0, int i_1) {
		Class119.method2077(2005204447);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -23);
		Class190.method3148((byte) 113);
		client.aBool7175 = false;
	}

}
