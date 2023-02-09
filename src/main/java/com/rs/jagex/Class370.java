package com.rs.jagex;

import java.util.Random;

public abstract class Class370 {

	public static int[] anIntArray4291 = new int[4096];

	static {
		for (int i_0 = 0; i_0 < 4096; i_0++)
			anIntArray4291[i_0] = method6326(i_0);

	}

	static int method6324(int i_0, int i_1, int i_2, int i_3) {
		int i_4 = i_0 & 0xf;
		int i_5 = i_4 < 8 ? i_1 : i_2;
		int i_6 = i_4 < 4 ? i_2 : (i_4 != 12 && i_4 != 14 ? i_3 : i_1);
		return ((i_4 & 0x1) == 0 ? i_5 : -i_5) + ((i_4 & 0x2) == 0 ? i_6 : -i_6);
	}
	static int method6326(int i_0) {
		int i_1 = i_0 * (i_0 * i_0 >> 12) >> 12;
		int i_2 = i_0 * 6 - 61440;
		int i_3 = (i_0 * i_2 >> 12) + 40960;
		return i_3 * i_1 >> 12;
	}
	short[] aShortArray4285 = new short[512];
	int anInt4283;
	int anInt4286 = 4;
	int anInt4288 = 4;
	int anInt4289 = 4;

	int anInt4290 = 4;

	short[] aShortArray4281;

	Class370(int i_1, int i_3, int i_4) {
		anInt4283 = i_1;
		anInt4286 = i_3;
		anInt4288 = i_4;
		anInt4289 = 2;
		anInt4290 = 5;
		method6323();
		method6325();
	}

	abstract void method6321();

	void method6322() {
		int[] ints_4 = new int[128];
		int[] ints_5 = new int[128];
		int[] ints_6 = new int[16];

		int i_7;
		for (i_7 = 0; i_7 < 128; i_7++)
			ints_4[i_7] = (i_7 << 12) / 128;

		for (i_7 = 0; i_7 < 128; i_7++)
			ints_5[i_7] = (i_7 << 12) / 128;

		for (i_7 = 0; i_7 < 16; i_7++)
			ints_6[i_7] = (i_7 << 12) / 16;

		method6332();

		for (i_7 = 0; i_7 < 16; i_7++)
			for (int i_8 = 0; i_8 < 128; i_8++)
				for (int i_9 = 0; i_9 < 128; i_9++) {
					for (int i_10 = 0; i_10 < anInt4290; i_10++) {
						int i_11 = aShortArray4281[i_10] << 12;
						int i_12 = i_11 * anInt4286 >> 12;
						int i_13 = i_11 * anInt4288 >> 12;
					int i_14 = i_11 * anInt4289 >> 12;
			int i_15 = i_11 * ints_4[i_9] >> 12;
			int i_16 = i_11 * ints_5[i_8] >> 12;
		int i_17 = i_11 * ints_6[i_7] >> 12;
			i_15 *= anInt4286;
			i_16 *= anInt4288;
			i_17 *= anInt4289;
			int i_18 = i_15 >> 12;
			int i_19 = i_18 + 1;
			i_18 &= 0xff;
			int i_20 = i_16 >> 12;
		int i_21 = i_20 + 1;
		i_20 &= 0xff;
		int i_22 = i_17 >> 12;
		int i_23 = i_22 + 1;
		i_22 &= 0xff;
		if (i_19 >= i_12)
			i_19 = 0;
		else
			i_19 &= 0xff;

		if (i_21 >= i_13)
			i_21 = 0;
		else
			i_21 &= 0xff;

		if (i_23 >= i_14)
			i_23 = 0;
		else
			i_23 &= 0xff;

		i_15 &= 0xfff;
		i_16 &= 0xfff;
		i_17 &= 0xfff;
		int i_24 = anIntArray4291[i_15];
		int i_25 = anIntArray4291[i_16];
		int i_26 = anIntArray4291[i_17];
		int i_27 = i_15 - 4096;
		int i_28 = i_16 - 4096;
		int i_29 = i_17 - 4096;
		short s_30 = aShortArray4285[i_22];
		short s_31 = aShortArray4285[i_23];
		short s_32 = aShortArray4285[i_20 + s_30];
		short s_33 = aShortArray4285[i_21 + s_30];
		short s_34 = aShortArray4285[i_20 + s_31];
		short s_35 = aShortArray4285[i_21 + s_31];
		int i_36 = method6324(aShortArray4285[i_18 + s_32], i_15, i_16, i_17);
		int i_37 = method6324(aShortArray4285[i_19 + s_32], i_27, i_16, i_17);
		int i_38 = i_36 + (i_24 * (i_37 - i_36) >> 12);
		i_36 = method6324(aShortArray4285[i_18 + s_33], i_15, i_28, i_17);
		i_37 = method6324(aShortArray4285[i_19 + s_33], i_27, i_28, i_17);
		int i_39 = i_36 + (i_24 * (i_37 - i_36) >> 12);
		int i_40 = i_38 + (i_25 * (i_39 - i_38) >> 12);
		i_36 = method6324(aShortArray4285[i_18 + s_34], i_15, i_16, i_29);
		i_37 = method6324(aShortArray4285[i_19 + s_34], i_27, i_16, i_29);
		i_38 = i_36 + (i_24 * (i_37 - i_36) >> 12);
		i_36 = method6324(aShortArray4285[i_18 + s_35], i_15, i_28, i_29);
		i_37 = method6324(aShortArray4285[i_19 + s_35], i_27, i_28, i_29);
		i_39 = i_36 + (i_24 * (i_37 - i_36) >> 12);
		int i_41 = i_38 + (i_25 * (i_39 - i_38) >> 12);
		method6337(i_10, i_40 + (i_26 * (i_41 - i_40) >> 12));
					}

					method6321();
				}

	}

	void method6323() {
		aShortArray4281 = new short[anInt4290];

		for (int i_1 = 0; i_1 < anInt4290; i_1++)
			aShortArray4281[i_1] = (short) ((int) Math.pow(2.0D, i_1));

	}

	void method6325() {
		Random random_1 = new Random(anInt4283);

		int i_2;
		for (i_2 = 0; i_2 < 255; i_2++)
			aShortArray4285[i_2] = (short) i_2;

		for (i_2 = 0; i_2 < 255; i_2++) {
			int i_3 = 255 - i_2;
			int i_4 = ObjectMeshModifier.method7931(random_1, i_3);
			short s_5 = aShortArray4285[i_4];
			aShortArray4285[i_4] = aShortArray4285[i_3];
			aShortArray4285[i_3] = aShortArray4285[i_3 + 256] = s_5;
		}

	}

	abstract void method6327(int var1, int var2);

	abstract void method6330();

	abstract void method6331();

	abstract void method6332();

	abstract void method6333(int var1, int var2);

	abstract void method6334(int var1, int var2);

	abstract void method6337(int var1, int var2);

	abstract void method6340();

	abstract void method6344();

	abstract void method6345();

}
