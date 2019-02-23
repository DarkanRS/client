public class Class270 {

	static float[][] aFloatArrayArray3324 = new float[2][8];
	static int[][] anIntArrayArray3321 = new int[2][8];
	int[] anIntArray3318 = new int[2];
	int[][][] anIntArrayArrayArray3317 = new int[2][2][4];
	int[][][] anIntArrayArrayArray3326 = new int[2][2][4];
	int[] anIntArray3319 = new int[2];
	static float aFloat3322;
	static int anInt3315;

	float method4804(int i_1, int i_2, float f_3) {
		float f_4 = (float) this.anIntArrayArrayArray3326[i_1][0][i_2] + f_3 * (float) (this.anIntArrayArrayArray3326[i_1][1][i_2] - this.anIntArrayArrayArray3326[i_1][0][i_2]);
		f_4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-f_4 / 20.0F));
	}

	static float method4805(float f_0) {
		float f_1 = 32.703197F * (float) Math.pow(2.0D, (double) f_0);
		return f_1 * 3.1415927F / 11025.0F;
	}

	float method4806(int i_1, int i_2, float f_3) {
		float f_4 = (float) this.anIntArrayArrayArray3317[i_1][0][i_2] + f_3 * (float) (this.anIntArrayArrayArray3317[i_1][1][i_2] - this.anIntArrayArrayArray3317[i_1][0][i_2]);
		f_4 *= 1.2207031E-4F;
		return method4805(f_4);
	}

	final void method4807(RsByteBuffer rsbytebuffer_1, Class342 class342_2) {
		int i_3 = rsbytebuffer_1.readUnsignedByte();
		this.anIntArray3318[0] = i_3 >> 4;
		this.anIntArray3318[1] = i_3 & 0xf;
		if (i_3 != 0) {
			this.anIntArray3319[0] = rsbytebuffer_1.readUnsignedShort();
			this.anIntArray3319[1] = rsbytebuffer_1.readUnsignedShort();
			int i_4 = rsbytebuffer_1.readUnsignedByte();

			int i_5;
			int i_6;
			for (i_5 = 0; i_5 < 2; i_5++) {
				for (i_6 = 0; i_6 < this.anIntArray3318[i_5]; i_6++) {
					this.anIntArrayArrayArray3317[i_5][0][i_6] = rsbytebuffer_1.readUnsignedShort();
					this.anIntArrayArrayArray3326[i_5][0][i_6] = rsbytebuffer_1.readUnsignedShort();
				}
			}

			for (i_5 = 0; i_5 < 2; i_5++) {
				for (i_6 = 0; i_6 < this.anIntArray3318[i_5]; i_6++) {
					if ((i_4 & 1 << i_5 * 4 << i_6) != 0) {
						this.anIntArrayArrayArray3317[i_5][1][i_6] = rsbytebuffer_1.readUnsignedShort();
						this.anIntArrayArrayArray3326[i_5][1][i_6] = rsbytebuffer_1.readUnsignedShort();
					} else {
						this.anIntArrayArrayArray3317[i_5][1][i_6] = this.anIntArrayArrayArray3317[i_5][0][i_6];
						this.anIntArrayArrayArray3326[i_5][1][i_6] = this.anIntArrayArrayArray3326[i_5][0][i_6];
					}
				}
			}

			if (i_4 != 0 || this.anIntArray3319[1] != this.anIntArray3319[0]) {
				class342_2.method6086(rsbytebuffer_1);
			}
		} else {
			int[] ints_7 = this.anIntArray3319;
			this.anIntArray3319[1] = 0;
			ints_7[0] = 0;
		}

	}

	int method4812(int i_1, float f_2) {
		float f_3;
		if (i_1 == 0) {
			f_3 = (float) this.anIntArray3319[0] + (float) (this.anIntArray3319[1] - this.anIntArray3319[0]) * f_2;
			f_3 *= 0.0030517578F;
			aFloat3322 = (float) Math.pow(0.1D, (double) (f_3 / 20.0F));
			anInt3315 = (int) (aFloat3322 * 65536.0F);
		}

		if (this.anIntArray3318[i_1] == 0) {
			return 0;
		} else {
			f_3 = this.method4804(i_1, 0, f_2);
			aFloatArrayArray3324[i_1][0] = -2.0F * f_3 * (float) Math.cos((double) this.method4806(i_1, 0, f_2));
			aFloatArrayArray3324[i_1][1] = f_3 * f_3;

			int i_4;
			for (i_4 = 1; i_4 < this.anIntArray3318[i_1]; i_4++) {
				f_3 = this.method4804(i_1, i_4, f_2);
				float f_5 = -2.0F * f_3 * (float) Math.cos((double) this.method4806(i_1, i_4, f_2));
				float f_6 = f_3 * f_3;
				aFloatArrayArray3324[i_1][i_4 * 2 + 1] = aFloatArrayArray3324[i_1][i_4 * 2 - 1] * f_6;
				aFloatArrayArray3324[i_1][i_4 * 2] = aFloatArrayArray3324[i_1][i_4 * 2 - 1] * f_5 + aFloatArrayArray3324[i_1][i_4 * 2 - 2] * f_6;

				for (int i_7 = i_4 * 2 - 1; i_7 >= 2; --i_7) {
					aFloatArrayArray3324[i_1][i_7] += aFloatArrayArray3324[i_1][i_7 - 1] * f_5 + aFloatArrayArray3324[i_1][i_7 - 2] * f_6;
				}

				aFloatArrayArray3324[i_1][1] += aFloatArrayArray3324[i_1][0] * f_5 + f_6;
				aFloatArrayArray3324[i_1][0] += f_5;
			}

			if (i_1 == 0) {
				for (i_4 = 0; i_4 < this.anIntArray3318[0] * 2; i_4++) {
					aFloatArrayArray3324[0][i_4] *= aFloat3322;
				}
			}

			for (i_4 = 0; i_4 < this.anIntArray3318[i_1] * 2; i_4++) {
				anIntArrayArray3321[i_1][i_4] = (int) (aFloatArrayArray3324[i_1][i_4] * 65536.0F);
			}

			return this.anIntArray3318[i_1] * 2;
		}
	}

}
