package com.jagex;

import java.util.Random;

public class MaterialProp4 extends MaterialProperty {

	int anInt9982 = 4;
	int anInt9994 = 8;
	int anInt9986;
	int anInt9987 = 1024;
	int anInt9984 = 1024;
	int anInt9989 = 409;
	int anInt9990 = 204;
	int anInt9991 = 81;
	int anInt9993;
	int anInt9988;
	int anInt9995;
	int[] anIntArray9996;
	int[][] anIntArrayArray9979;
	int[][] anIntArrayArray9992;

	public MaterialProp4() {
		super(0, true);
	}

	@Override
	void decode(int i_1, ByteBuf rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			anInt9982 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			anInt9994 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 2:
			anInt9989 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			anInt9990 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			anInt9987 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 5:
			anInt9986 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 6:
			anInt9991 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 7:
			anInt9984 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	@Override
	int[] method12319(int i_1) {
		int[] ints_3 = aClass320_7667.method5721(i_1);
		if (aClass320_7667.aBool3722) {
			int i_4 = 0;

			int i_5;
			for (i_5 = Class316.anIntArray3668[i_1] + anInt9986; i_5 < 0; i_5 += 4096) {
			}

			while (i_5 > 4096)
				i_5 -= 4096;

			while (i_4 < anInt9994 && i_5 >= anIntArray9996[i_4])
				++i_4;

			int i_6 = i_4 - 1;
			boolean bool_7 = (i_4 & 0x1) == 0;
			int i_8 = anIntArray9996[i_4];
			int i_9 = anIntArray9996[i_4 - 1];
			if (i_5 > i_9 + anInt9993 && i_5 < i_8 - anInt9993)
				for (int i_10 = 0; i_10 < Class316.anInt3670; i_10++) {
					int i_11 = 0;
					int i_12 = bool_7 ? anInt9987 : -anInt9987;

					int i_13;
					for (i_13 = Class316.anIntArray3672[i_10] + (i_12 * anInt9988 >> 12); i_13 < 0; i_13 += 4096) {
					}

					while (i_13 > 4096)
						i_13 -= 4096;

					while (i_11 < anInt9982 && i_13 >= anIntArrayArray9979[i_6][i_11])
						++i_11;

					int i_14 = i_11 - 1;
					int i_15 = anIntArrayArray9979[i_6][i_14];
					int i_16 = anIntArrayArray9979[i_6][i_11];
					if (i_13 > i_15 + anInt9993 && i_13 < i_16 - anInt9993)
						ints_3[i_10] = anIntArrayArray9992[i_6][i_14];
					else
						ints_3[i_10] = 0;
				}
			else
				Class503.method8365(ints_3, 0, Class316.anInt3670, 0);
		}

		return ints_3;
	}

	@Override
	void method12321() {
		method15422();
	}

	void method15422() {
		Random random_2 = new Random(anInt9994);
		anInt9993 = anInt9991 / 2;
		anInt9988 = 4096 / anInt9982;
		anInt9995 = 4096 / anInt9994;
		int i_3 = anInt9988 / 2;
		int i_4 = anInt9995 / 2;
		anIntArray9996 = new int[anInt9994 + 1];
		anIntArrayArray9979 = new int[anInt9994][anInt9982 + 1];
		anIntArrayArray9992 = new int[anInt9994][anInt9982];
		anIntArray9996[0] = 0;

		for (int i_5 = 0; i_5 < anInt9994; i_5++) {
			int i_6;
			int i_7;
			if (i_5 > 0) {
				i_6 = anInt9995;
				i_7 = (ObjectMeshModifier.method7931(random_2, 4096) - 2048) * anInt9990 >> 12;
					i_6 += i_7 * i_4 >> 12;
					anIntArray9996[i_5] = i_6 + anIntArray9996[i_5 - 1];
			}

			anIntArrayArray9979[i_5][0] = 0;

			for (i_6 = 0; i_6 < anInt9982; i_6++) {
				if (i_6 > 0) {
					i_7 = anInt9988;
					int i_8 = (ObjectMeshModifier.method7931(random_2, 4096) - 2048) * anInt9989 >> 12;
					i_7 += i_8 * i_3 >> 12;
					anIntArrayArray9979[i_5][i_6] = anIntArrayArray9979[i_5][i_6 - 1] + i_7;
				}

				anIntArrayArray9992[i_5][i_6] = anInt9984 > 0 ? 4096 - ObjectMeshModifier.method7931(random_2, anInt9984) : 4096;
			}

			anIntArrayArray9979[i_5][anInt9982] = 4096;
		}

		anIntArray9996[anInt9994] = 4096;
	}

}
