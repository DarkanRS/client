package com.jagex;

public class Node_Sub19 extends Node {

	int anInt7646;
	OpenGLRenderer aGraphicalRenderer_Sub1_7650;
	GLLight aNode_Sub24_7641;
	OpenGLGround aGround_Sub2_7654;
	int anInt7642;
	int anInt7653;
	int anInt7644;
	int anInt7656;
	float[][] aFloatArrayArray7652;
	float[][] aFloatArrayArray7648;
	float[][] aFloatArrayArray7645;
	Interface15 anInterface15_7639;
	Interface14 anInterface14_7649;
	OpenGlArrayBufferPointer aClass143_7647;
	OpenGlArrayBufferPointer aClass143_7643;
	ByteBuf aNode_Sub35_7655;
	Node_Sub35_Sub1 aNode_Sub35_Sub1_7651;
	HashTable aClass453_7657;
	int anInt7640;

	Node_Sub19(OpenGLRenderer class505_sub1_1, OpenGLGround class390_sub2_2, GLLight class282_sub24_3, int[] ints_4) {
		aGraphicalRenderer_Sub1_7650 = class505_sub1_1;
		aNode_Sub24_7641 = class282_sub24_3;
		aGround_Sub2_7654 = class390_sub2_2;
		int i_5 = aNode_Sub24_7641.method12370() - (class390_sub2_2.tileUnits >> 1);
		anInt7642 = aNode_Sub24_7641.getX() - i_5 >> class390_sub2_2.tileScale;
		anInt7653 = aNode_Sub24_7641.getX() + i_5 >> class390_sub2_2.tileScale;
		anInt7644 = aNode_Sub24_7641.getZ() - i_5 >> class390_sub2_2.tileScale;
		anInt7656 = aNode_Sub24_7641.getZ() + i_5 >> class390_sub2_2.tileScale;
		int i_6 = anInt7653 - anInt7642 + 1;
		int i_7 = anInt7656 - anInt7644 + 1;
		aFloatArrayArray7652 = new float[i_6 + 1][i_7 + 1];
		aFloatArrayArray7648 = new float[i_6 + 1][i_7 + 1];
		aFloatArrayArray7645 = new float[i_6 + 1][i_7 + 1];

		int i_8;
		int i_9;
		int i_10;
		int i_11;
		int i_12;
		int i_13;
		for (i_8 = 0; i_8 <= i_7; i_8++) {
			i_9 = i_8 + anInt7644;
			if (i_9 > 0 && i_9 < aGround_Sub2_7654.length - 1)
				for (i_10 = 0; i_10 <= i_6; i_10++) {
					i_11 = i_10 + anInt7642;
					if (i_11 > 0 && i_11 < aGround_Sub2_7654.width - 1) {
						i_12 = class390_sub2_2.getHeight(i_11 + 1, i_9) - class390_sub2_2.getHeight(i_11 - 1, i_9);
						i_13 = class390_sub2_2.getHeight(i_11, i_9 + 1) - class390_sub2_2.getHeight(i_11, i_9 - 1);
						float f_14 = (float) (1.0D / Math.sqrt(i_12 * i_12 + i_13 * i_13 + 65536));
						aFloatArrayArray7652[i_10][i_8] = i_12 * f_14;
						aFloatArrayArray7648[i_10][i_8] = -256.0f * f_14;
						aFloatArrayArray7645[i_10][i_8] = i_13 * f_14;
					}
				}
		}

		i_8 = 0;

		for (i_9 = anInt7644; i_9 <= anInt7656; i_9++)
			if (i_9 >= 0 && i_9 < class390_sub2_2.length)
				for (i_10 = anInt7642; i_10 <= anInt7653; i_10++) {
					if (i_10 >= 0 && i_10 < class390_sub2_2.width) {
						i_11 = ints_4[i_8];
						int[] ints_19 = class390_sub2_2.tileColours[i_10][i_9];
						if (ints_19 != null && i_11 != 0)
							if (i_11 == 1) {
								i_13 = 0;

								while (i_13 < ints_19.length)
									if (ints_19[i_13++] != -1 && ints_19[i_13++] != -1 && ints_19[i_13++] != -1)
										anInt7640 += 3;
							} else
								anInt7640 += 3;
					}

					++i_8;
				}
			else
				i_8 += anInt7653 - anInt7642;

		if (anInt7640 > 0) {
			aNode_Sub35_7655 = new ByteBuf(anInt7640 * 2);
			aNode_Sub35_Sub1_7651 = new Node_Sub35_Sub1(anInt7640 * 16);
			aClass453_7657 = new HashTable(Utils.nextPowerOfTwo(anInt7640));
			i_9 = 0;
			i_8 = 0;

			for (i_10 = anInt7644; i_10 <= anInt7656; i_10++) {
				if (i_10 >= 0 && i_10 < class390_sub2_2.length) {
					i_11 = 0;

					for (i_12 = anInt7642; i_12 <= anInt7653; i_12++) {
						if (i_12 >= 0 && i_12 < class390_sub2_2.width) {
							i_13 = ints_4[i_8];
							int[] ints_18 = class390_sub2_2.tileColours[i_12][i_10];
							if (ints_18 != null && i_13 != 0)
								if (i_13 != 1) {
									if (i_13 == 3) {
										method12306(i_11, i_9, i_12, i_10, 0, 0);
										method12306(i_11, i_9, i_12, i_10, class390_sub2_2.tileUnits, 0);
										method12306(i_11, i_9, i_12, i_10, 0, class390_sub2_2.tileUnits);
									} else if (i_13 == 2) {
										method12306(i_11, i_9, i_12, i_10, class390_sub2_2.tileUnits, 0);
										method12306(i_11, i_9, i_12, i_10, class390_sub2_2.tileUnits, class390_sub2_2.tileUnits);
										method12306(i_11, i_9, i_12, i_10, 0, 0);
									} else if (i_13 == 5) {
										method12306(i_11, i_9, i_12, i_10, class390_sub2_2.tileUnits, class390_sub2_2.tileUnits);
										method12306(i_11, i_9, i_12, i_10, 0, class390_sub2_2.tileUnits);
										method12306(i_11, i_9, i_12, i_10, class390_sub2_2.tileUnits, 0);
									} else if (i_13 == 4) {
										method12306(i_11, i_9, i_12, i_10, 0, class390_sub2_2.tileUnits);
										method12306(i_11, i_9, i_12, i_10, 0, 0);
										method12306(i_11, i_9, i_12, i_10, class390_sub2_2.tileUnits, class390_sub2_2.tileUnits);
									}
								} else {
									int[] ints_15 = class390_sub2_2.tileXOffsets[i_12][i_10];
									int[] ints_16 = class390_sub2_2.tileZOffsets[i_12][i_10];
									int i_17 = 0;

									label108:
										while (true)
											while (true) {
												if (i_17 >= ints_18.length)
													break label108;

												if (ints_18[i_17] != -1 && ints_18[i_17 + 1] != -1 && ints_18[i_17 + 2] != -1) {
													method12306(i_11, i_9, i_12, i_10, ints_15[i_17], ints_16[i_17]);
													++i_17;
													method12306(i_11, i_9, i_12, i_10, ints_15[i_17], ints_16[i_17]);
													++i_17;
													method12306(i_11, i_9, i_12, i_10, ints_15[i_17], ints_16[i_17]);
													++i_17;
												} else
													i_17 += 3;
											}
								}
						}

						++i_8;
						++i_11;
					}
				} else
					i_8 += anInt7653 - anInt7642;

				++i_9;
			}

			anInterface15_7639 = aGraphicalRenderer_Sub1_7650.method13598(aNode_Sub35_7655.buffer, aNode_Sub35_7655.index, false);
			anInterface14_7649 = aGraphicalRenderer_Sub1_7650.method13599(16, aNode_Sub35_Sub1_7651.buffer, aNode_Sub35_Sub1_7651.index, false);
			aClass143_7647 = new OpenGlArrayBufferPointer(anInterface14_7649, 5126, 3, 0);
			aClass143_7643 = new OpenGlArrayBufferPointer(anInterface14_7649, 5121, 4, 12);
		} else {
			anInterface15_7639 = null;
			anInterface14_7649 = null;
			aClass143_7647 = null;
			aClass143_7643 = null;
		}

		aNode_Sub35_Sub1_7651 = null;
		aNode_Sub35_7655 = null;
		aClass453_7657 = null;
		aFloatArrayArray7645 = null;
		aFloatArrayArray7648 = null;
		aFloatArrayArray7652 = null;
	}

	void method12305(short s_1) {
		if (aGraphicalRenderer_Sub1_7650.aBool8467)
			aNode_Sub35_7655.writeShort(s_1);
		else
			aNode_Sub35_7655.writeLEShort(s_1);

	}

	void method12306(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		long long_7 = -1L;
		int i_9 = i_5 + (i_3 << aGround_Sub2_7654.tileScale);
		int i_10 = (i_4 << aGround_Sub2_7654.tileScale) + i_6;
		int i_11 = aGround_Sub2_7654.averageHeight(i_9, i_10);
		if ((i_5 & 0x7f) == 0 || (i_6 & 0x7f) == 0) {
			long_7 = (i_10 & 0xffffL) << 16 | i_9 & 0xffffL;
			Node node_29 = aClass453_7657.get(long_7);
			if (node_29 != null) {
				method12305(((Node_Sub46) node_29).aShort8067);
				return;
			}
		}

		short s_12 = (short) (anInt7646++);
		if (long_7 != -1L)
			aClass453_7657.put(new Node_Sub46(s_12), long_7);

		float f_13;
		float f_14;
		float f_15;
		float f_16;
		float f_17;
		float f_18;
		float f_19;
		float f_20;
		float f_21;
		float f_22;
		float f_23;
		if (i_5 == 0 && i_6 == 0) {
			f_13 = aFloatArrayArray7652[i_1][i_2];
			f_14 = aFloatArrayArray7648[i_1][i_2];
			f_15 = aFloatArrayArray7645[i_1][i_2];
		} else if (i_5 == aGround_Sub2_7654.tileUnits && i_6 == 0) {
			f_13 = aFloatArrayArray7652[i_1 + 1][i_2];
			f_14 = aFloatArrayArray7648[i_1 + 1][i_2];
			f_15 = aFloatArrayArray7645[i_1 + 1][i_2];
		} else if (i_5 == aGround_Sub2_7654.tileUnits && aGround_Sub2_7654.tileUnits == i_6) {
			f_13 = aFloatArrayArray7652[i_1 + 1][i_2 + 1];
			f_14 = aFloatArrayArray7648[i_1 + 1][i_2 + 1];
			f_15 = aFloatArrayArray7645[i_1 + 1][i_2 + 1];
		} else if (i_5 == 0 && aGround_Sub2_7654.tileUnits == i_6) {
			f_13 = aFloatArrayArray7652[i_1][i_2 + 1];
			f_14 = aFloatArrayArray7648[i_1][i_2 + 1];
			f_15 = aFloatArrayArray7645[i_1][i_2 + 1];
		} else {
			f_16 = (float) i_5 / aGround_Sub2_7654.tileUnits;
			f_17 = (float) i_6 / aGround_Sub2_7654.tileUnits;
			f_18 = aFloatArrayArray7652[i_1][i_2];
			f_19 = aFloatArrayArray7648[i_1][i_2];
			f_20 = aFloatArrayArray7645[i_1][i_2];
			f_21 = aFloatArrayArray7652[i_1 + 1][i_2];
			f_22 = aFloatArrayArray7648[i_1 + 1][i_2];
			f_23 = aFloatArrayArray7645[i_1 + 1][i_2];
			f_18 += (aFloatArrayArray7652[i_1][i_2 + 1] - f_18) * f_16;
			f_19 += (aFloatArrayArray7648[i_1][i_2 + 1] - f_19) * f_16;
			f_20 += (aFloatArrayArray7645[i_1][i_2 + 1] - f_20) * f_16;
			f_21 += (aFloatArrayArray7652[i_1 + 1][i_2 + 1] - f_21) * f_16;
			f_22 += (aFloatArrayArray7648[i_1 + 1][i_2 + 1] - f_22) * f_16;
			f_23 += (aFloatArrayArray7645[i_1 + 1][i_2 + 1] - f_23) * f_16;
			f_13 = f_18 + (f_21 - f_18) * f_17;
			f_14 = f_19 + (f_22 - f_19) * f_17;
			f_15 = f_20 + (f_23 - f_20) * f_17;
		}

		f_16 = (aNode_Sub24_7641.getX() - i_9);
		f_17 = (aNode_Sub24_7641.getY() - i_11);
		f_18 = (aNode_Sub24_7641.getZ() - i_10);
		f_19 = (float) Math.sqrt(f_16 * f_16 + f_17 * f_17 + f_18 * f_18);
		f_20 = 1.0F / f_19;
		f_16 *= f_20;
		f_17 *= f_20;
		f_18 *= f_20;
		f_21 = f_19 / aNode_Sub24_7641.method12370();
		f_22 = 1.0F - f_21 * f_21;
		if (f_22 < 0.0F)
			f_22 = 0.0F;

		f_23 = f_16 * f_13 + f_17 * f_14 + f_18 * f_15;
		if (f_23 < 0.0F)
			f_23 = 0.0F;

		float f_24 = f_23 * f_22 * 2.0F;
		if (f_24 > 1.0F)
			f_24 = 1.0F;

		int i_25 = aNode_Sub24_7641.getColor();
		int i_26 = (int) (f_24 * (i_25 >> 16 & 0xff));
		if (i_26 > 255)
			i_26 = 255;

		int i_27 = (int) (f_24 * (i_25 >> 8 & 0xff));
		if (i_27 > 255)
			i_27 = 255;

		int i_28 = (int) (f_24 * (i_25 & 0xff));
		if (i_28 > 255)
			i_28 = 255;

		if (aGraphicalRenderer_Sub1_7650.aBool8467) {
			aNode_Sub35_Sub1_7651.method14688(i_9);
			aNode_Sub35_Sub1_7651.method14688(i_11);
			aNode_Sub35_Sub1_7651.method14688(i_10);
		} else {
			aNode_Sub35_Sub1_7651.method14685(i_9);
			aNode_Sub35_Sub1_7651.method14685(i_11);
			aNode_Sub35_Sub1_7651.method14685(i_10);
		}

		aNode_Sub35_Sub1_7651.writeByte(i_26);
		aNode_Sub35_Sub1_7651.writeByte(i_27);
		aNode_Sub35_Sub1_7651.writeByte(i_28);
		aNode_Sub35_Sub1_7651.writeByte(255);
		method12305(s_12);
	}

	void method12311(int i_1, int i_2, int i_3, boolean[][] bools_4) {
		if (anInterface15_7639 != null && anInt7642 <= i_3 + i_1 && anInt7653 >= i_1 - i_3 && anInt7644 <= i_3 + i_2 && anInt7656 >= i_2 - i_3)
			for (int i_5 = anInt7644; i_5 <= anInt7656; i_5++)
				for (int i_6 = anInt7642; i_6 <= anInt7653; i_6++) {
					int i_7 = i_6 - i_1;
					int i_8 = i_5 - i_2;
					if (i_7 > -i_3 && i_7 < i_3 && i_8 > -i_3 && i_8 < i_3 && bools_4[i_3 + i_7][i_3 + i_8]) {
						aGraphicalRenderer_Sub1_7650.method13617((int) (aNode_Sub24_7641.getIntensity() * 255.0F) << 24);
						aGraphicalRenderer_Sub1_7650.method13647(aClass143_7647, null, aClass143_7643, null);
						aGraphicalRenderer_Sub1_7650.method13611(anInterface15_7639, 0, anInt7640);
						return;
					}
				}

	}

}
