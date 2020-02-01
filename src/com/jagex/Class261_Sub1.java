package com.jagex;
import java.util.Random;

public class Class261_Sub1 extends Class261 {

	static float[][] aFloatArrayArray8043 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
	int[] anIntArray8042 = new int[512];

	static final float method13369(float f_0, float f_1, float f_2) {
		return f_0 + (f_1 - f_0) * f_2;
	}

	static final float method13370(int i_0, float f_1, float f_2, float f_3) {
		float[] floats_4 = aFloatArrayArray8043[i_0];
		return floats_4[0] * f_1 + floats_4[1] * f_2 + floats_4[2] * f_3;
	}

	public Class261_Sub1() {
		Random random_2 = new Random((long) 419684);

		int i_3;
		for (i_3 = 0; i_3 < 256; i_3++) {
			this.anIntArray8042[i_3] = this.anIntArray8042[i_3 + 256] = i_3;
		}

		for (i_3 = 0; i_3 < 256; i_3++) {
			int i_4 = random_2.nextInt() & 0xff;
			int i_5 = this.anIntArray8042[i_4];
			this.anIntArray8042[i_4] = this.anIntArray8042[i_4 + 256] = this.anIntArray8042[i_3];
			this.anIntArray8042[i_3] = this.anIntArray8042[i_3 + 256] = i_5;
		}

	}

	void method4634(int i_1, int i_2, int i_3, int i_4, float f_5, float f_6, float f_7, float f_8, float[] floats_9) {
		int start = 0;
		int i_11 = (int) ((float) i_2 * f_5 - 1.0F);
		i_11 &= 0xff;
		int i_12 = (int) ((float) i_3 * f_6 - 1.0F);
		i_12 &= 0xff;
		int i_13 = (int) ((float) i_4 * f_7 - 1.0F);
		i_13 &= 0xff;
		float f_14 = (float) i_1 * f_7;
		int i_15 = (int) f_14;
		int i_16 = i_15 + 1;
		float f_17 = f_14 - (float) i_15;
		float f_18 = 1.0F - f_17;
		float f_19 = method13372(f_17);
		i_15 &= i_13;
		i_16 &= i_13;
		int i_20 = this.anIntArray8042[i_15];
		int i_21 = this.anIntArray8042[i_16];

		for (int i_22 = 0; i_22 < i_3; i_22++) {
			float f_23 = (float) i_22 * f_6;
			int i_24 = (int) f_23;
			int i_25 = i_24 + 1;
			float f_26 = f_23 - (float) i_24;
			float f_27 = 1.0F - f_26;
			float f_28 = method13372(f_26);
			i_24 &= i_12;
			i_25 &= i_12;
			int i_29 = this.anIntArray8042[i_24 + i_20];
			int i_30 = this.anIntArray8042[i_25 + i_20];
			int i_31 = this.anIntArray8042[i_24 + i_21];
			int i_32 = this.anIntArray8042[i_25 + i_21];

			for (int i_33 = 0; i_33 < i_2; i_33++) {
				float f_34 = (float) i_33 * f_5;
				int i_35 = (int) f_34;
				int i_36 = i_35 + 1;
				float f_37 = f_34 - (float) i_35;
				float f_38 = 1.0F - f_37;
				float f_39 = method13372(f_37);
				i_35 &= i_11;
				i_36 &= i_11;
				floats_9[i_33] = f_8 * method13369(method13369(method13369(method13370(this.anIntArray8042[i_35 + i_29] & 0x7, f_38, f_27, f_18), method13370(this.anIntArray8042[i_36 + i_29] & 0x7, f_37, f_27, f_18), f_39), method13369(method13370(this.anIntArray8042[i_35 + i_30] & 0x7, f_38, f_26, f_18), method13370(this.anIntArray8042[i_36 + i_30] & 0x7, f_37, f_26, f_18), f_39), f_28), method13369(method13369(method13370(this.anIntArray8042[i_35 + i_31] & 0x7, f_38, f_27, f_17), method13370(this.anIntArray8042[i_36 + i_31] & 0x7, f_37, f_27, f_17), f_39), method13369(method13370(this.anIntArray8042[i_35 + i_32] & 0x7, f_38, f_26, f_17), method13370(this.anIntArray8042[i_36 + i_32] & 0x7, f_37, f_26, f_17), f_39), f_28), f_19);
			}
		}

	}

	static final float method13372(float f_0) {
		return f_0 * f_0 * f_0 * (10.0F + (f_0 * 6.0F - 15.0F) * f_0);
	}

}
