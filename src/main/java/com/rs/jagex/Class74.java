package com.rs.jagex;

import java.nio.ByteBuffer;

public class Class74 {

	static void method1318(byte[] bytes_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = -(i_4 >> 2);
		i_4 = -(i_4 & 0x3);

		for (int i_9 = -i_5; i_9 < 0; i_9++) {
			int i_10001;
			int i_10;
			for (i_10 = i_8; i_10 < 0; i_10++) {
				i_10001 = i_3++;
				bytes_0[i_10001] += bytes_1[i_2++];
				i_10001 = i_3++;
				bytes_0[i_10001] += bytes_1[i_2++];
				i_10001 = i_3++;
				bytes_0[i_10001] += bytes_1[i_2++];
				i_10001 = i_3++;
				bytes_0[i_10001] += bytes_1[i_2++];
			}

			for (i_10 = i_4; i_10 < 0; i_10++) {
				i_10001 = i_3++;
				bytes_0[i_10001] += bytes_1[i_2++];
			}

			i_3 += i_6;
			i_2 += i_7;
		}

	}
	static boolean method1328(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_6 = i_2 % i_5;
		int i_7;
		if (i_6 != 0)
			i_7 = i_5 - i_6;
		else
			i_7 = 0;

		int i_8 = -((i_3 + i_5 - 1) / i_5);
		int i_9 = -((i_5 + i_2 - 1) / i_5);

		for (int i_10 = i_8; i_10 < 0; i_10++) {
			for (int i_11 = i_9; i_11 < 0; i_11++) {
				if (bytes_0[i_1] == 0)
					return true;

				i_1 += i_5;
			}

			i_1 -= i_7;
			if (bytes_0[i_1 - 1] == 0)
				return true;

			i_1 += i_4;
		}

		return false;
	}
	static void method1330(byte[] bytes_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = -(i_4 >> 2);
		i_4 = -(i_4 & 0x3);

		for (int i_9 = -i_5; i_9 < 0; i_9++) {
			int i_10001;
			int i_10;
			for (i_10 = i_8; i_10 < 0; i_10++) {
				i_10001 = i_3++;
				bytes_0[i_10001] -= bytes_1[i_2++];
				i_10001 = i_3++;
				bytes_0[i_10001] -= bytes_1[i_2++];
				i_10001 = i_3++;
				bytes_0[i_10001] -= bytes_1[i_2++];
				i_10001 = i_3++;
				bytes_0[i_10001] -= bytes_1[i_2++];
			}

			for (i_10 = i_4; i_10 < 0; i_10++) {
				i_10001 = i_3++;
				bytes_0[i_10001] -= bytes_1[i_2++];
			}

			i_3 += i_6;
			i_2 += i_7;
		}

	}
	Class71[][] aClass71ArrayArray738;
	HardwareRenderer aGraphicalRenderer_Sub2_730;
	HardwareGround aGround_Sub1_731;
	int anInt732;
	int anInt734;
	byte[] aByteArray736;

	int anInt737;

	int anInt735;

	int anInt733;

	Class74(HardwareRenderer class505_sub2_1, HardwareGround class390_sub1_2) {
		aGraphicalRenderer_Sub2_730 = class505_sub2_1;
		aGround_Sub1_731 = class390_sub1_2;
		anInt732 = (aGround_Sub1_731.width * aGround_Sub1_731.tileUnits >> aGraphicalRenderer_Sub2_730.anInt8806) + 2;
		anInt734 = (aGround_Sub1_731.length * aGround_Sub1_731.tileUnits >> aGraphicalRenderer_Sub2_730.anInt8806) + 2;
		aByteArray736 = new byte[anInt732 * anInt734];
		anInt737 = aGraphicalRenderer_Sub2_730.anInt8806 + 7 - aGround_Sub1_731.tileScale;
		anInt735 = aGround_Sub1_731.width >> anInt737;
			anInt733 = aGround_Sub1_731.length >> anInt737;
	}

	void method1312() {
		aClass71ArrayArray738 = new Class71[anInt735][anInt733];

		for (int i_1 = 0; i_1 < anInt733; i_1++)
			for (int i_2 = 0; i_2 < anInt735; i_2++) {
				aClass71ArrayArray738[i_2][i_1] = new Class71(aGraphicalRenderer_Sub2_730, this, aGround_Sub1_731, i_2, i_1, anInt737, i_2 * 128 + 1, i_1 * 128 + 1);
				if (aClass71ArrayArray738[i_2][i_1].anInt716 == 0)
					aClass71ArrayArray738[i_2][i_1] = null;
			}

	}

	void method1314(Class48 class48_1, int i_2, int i_3, int i_4, boolean[][] bools_5, boolean bool_6) {
		float f_7 = 1.0F / (aGraphicalRenderer_Sub2_730.anInt8775 * 128);
		int i_10;
		int i_11;
		int i_13;
		int i_14;
		int i_15;
		int i_25;
		if (bool_6)
			for (int i_8 = 0; i_8 < anInt733; i_8++) {
				int i_27 = i_8 << anInt737;
				i_10 = i_8 + 1 << anInt737;

				label147:
					for (i_11 = 0; i_11 < anInt735; i_11++)
						if (aClass71ArrayArray738[i_11][i_8] != null) {
							i_25 = i_11 << anInt737;
							i_13 = i_11 + 1 << anInt737;

							for (i_14 = i_25; i_14 < i_13; i_14++)
								if (i_14 - i_2 >= -i_4 && i_14 - i_2 <= i_4)
									for (i_15 = i_27; i_15 < i_10; i_15++)
										if (i_15 - i_3 >= -i_4 && i_15 - i_3 <= i_4 && bools_5[i_14 - i_2 + i_4][i_4 + (i_15 - i_3)]) {
											class48_1.aClass384_454.method6525(f_7, f_7, 1.0F, 1.0F);
											class48_1.aClass384_454.buf[12] = (-i_11);
											class48_1.aClass384_454.buf[13] = (-i_8);
											aClass71ArrayArray738[i_11][i_8].method1288(class48_1);
											continue label147;
										}
						}
			}
		else {
			int[] ints_24 = new int[anInt733 * anInt735];
			ByteBuffer bytebuffer_9 = aGraphicalRenderer_Sub2_730.aByteBuffer8838;
			bytebuffer_9.clear();
			i_10 = 0;

			for (i_11 = 0; i_11 < anInt733; i_11++) {
				i_25 = i_11 << anInt737;
				i_13 = i_11 + 1 << anInt737;

				for (i_14 = 0; i_14 < anInt735; i_14++) {
					Class71 class71_26 = aClass71ArrayArray738[i_14][i_11];
					int i_16 = 0;
					if (class71_26 != null) {
						int i_17 = i_14 << anInt737;
						int i_18 = i_14 + 1 << anInt737;

						for (int i_19 = i_25; i_19 < i_13; i_19++)
							if (i_19 - i_3 >= -i_4 && i_19 - i_3 <= i_4) {
								int i_20 = i_17 + aGround_Sub1_731.width * i_19;

								for (int i_21 = i_17; i_21 < i_18; i_21++) {
									if (i_21 - i_2 >= -i_4 && i_21 - i_2 <= i_4 && bools_5[i_21 - i_2 + i_4][i_4 + (i_19 - i_3)]) {
										short[] shorts_22 = aGround_Sub1_731.aShortArrayArray8534[i_20];
										if (shorts_22 != null)
											for (short element : shorts_22) {
												bytebuffer_9.putShort(element);
												++i_16;
											}
									}

									++i_20;
								}
							}
					}

					ints_24[i_10] = i_16;
					++i_10;
				}
			}

			if (bytebuffer_9.position() != 0) {
				i_11 = bytebuffer_9.position();
				Interface32 interface32_12 = aGraphicalRenderer_Sub2_730.method13911(i_11 / 2);
				interface32_12.method42(0, i_11, aGraphicalRenderer_Sub2_730.aLong8695);
				i_13 = 0;
				i_10 = 0;

				for (i_14 = 0; i_14 < anInt733; i_14++)
					for (i_15 = 0; i_15 < anInt735; i_15++) {
						if (ints_24[i_10] != 0) {
							class48_1.aClass384_454.method6525(f_7, f_7, 1.0F, 1.0F);
							class48_1.aClass384_454.buf[12] = (-i_15);
							class48_1.aClass384_454.buf[13] = (-i_14);
							aClass71ArrayArray738[i_15][i_14].method1290(class48_1, interface32_12, i_13, ints_24[i_10] / 3);
							i_13 += ints_24[i_10];
						}

						++i_10;
					}
			}
		}

	}

	void method1315(Shadow class282_sub50_sub17_1, int i_2, int i_3) {
		int i_31 = i_3;
		int i_21 = i_2;
		CacheableNode_Sub17_Sub2 class282_sub50_sub17_sub2_4 = (CacheableNode_Sub17_Sub2) class282_sub50_sub17_1;
		i_21 += class282_sub50_sub17_sub2_4.anInt10453 + 1;
		i_31 += class282_sub50_sub17_sub2_4.anInt10455 + 1;
		int i_5 = i_21 + i_31 * anInt732;
		int i_6 = 0;
		int i_7 = class282_sub50_sub17_sub2_4.anInt10451;
		int i_8 = class282_sub50_sub17_sub2_4.anInt10452;
		int i_9 = anInt732 - i_8;
		int i_10 = 0;
		int i_11;
		if (i_31 <= 0) {
			i_11 = 1 - i_31;
			i_7 -= i_11;
			i_6 += i_11 * i_8;
			i_5 += i_11 * anInt732;
			i_31 = 1;
		}

		if (i_31 + i_7 >= anInt734) {
			i_11 = i_31 + i_7 + 1 - anInt734;
			i_7 -= i_11;
		}

		if (i_21 <= 0) {
			i_11 = 1 - i_21;
			i_8 -= i_11;
			i_6 += i_11;
			i_5 += i_11;
			i_10 += i_11;
			i_9 += i_11;
			i_21 = 1;
		}

		if (i_8 + i_21 >= anInt732) {
			i_11 = i_8 + i_21 + 1 - anInt732;
			i_8 -= i_11;
			i_10 += i_11;
			i_9 += i_11;
		}

		if (i_8 > 0 && i_7 > 0) {
			method1330(aByteArray736, class282_sub50_sub17_sub2_4.aByteArray10454, i_6, i_5, i_8, i_7, i_9, i_10);
			method1326(i_21, i_31, i_8, i_7);
		}

	}

	boolean method1316(Shadow class282_sub50_sub17_1, int i_2, int i_3) {
		int i_31 = i_3;
		int i_21 = i_2;
		CacheableNode_Sub17_Sub2 class282_sub50_sub17_sub2_4 = (CacheableNode_Sub17_Sub2) class282_sub50_sub17_1;
		i_21 += class282_sub50_sub17_sub2_4.anInt10453 + 1;
		i_31 += class282_sub50_sub17_sub2_4.anInt10455 + 1;
		int i_5 = i_21 + i_31 * anInt732;
		int i_6 = class282_sub50_sub17_sub2_4.anInt10451;
		int i_7 = class282_sub50_sub17_sub2_4.anInt10452;
		int i_8 = anInt732 - i_7;
		int i_9;
		if (i_31 <= 0) {
			i_9 = 1 - i_31;
			i_6 -= i_9;
			i_5 += i_9 * anInt732;
			i_31 = 1;
		}

		if (i_31 + i_6 >= anInt734) {
			i_9 = i_31 + i_6 + 1 - anInt734;
			i_6 -= i_9;
		}

		if (i_21 <= 0) {
			i_9 = 1 - i_21;
			i_7 -= i_9;
			i_5 += i_9;
			i_8 += i_9;
			i_21 = 1;
		}

		if (i_7 + i_21 >= anInt732) {
			i_9 = i_7 + i_21 + 1 - anInt732;
			i_7 -= i_9;
			i_8 += i_9;
		}

		if (i_7 > 0 && i_6 > 0) {
			byte b_10 = 8;
			i_8 += (b_10 - 1) * anInt732;
			return method1328(aByteArray736, i_5, i_7, i_6, i_8, b_10);
		}
		return false;
	}

	void method1317(Shadow class282_sub50_sub17_1, int i_2, int i_3) {
		int i_31 = i_3;
		int i_21 = i_2;
		CacheableNode_Sub17_Sub2 class282_sub50_sub17_sub2_4 = (CacheableNode_Sub17_Sub2) class282_sub50_sub17_1;
		i_21 += class282_sub50_sub17_sub2_4.anInt10453 + 1;
		i_31 += class282_sub50_sub17_sub2_4.anInt10455 + 1;
		int i_5 = i_21 + i_31 * anInt732;
		int i_6 = 0;
		int i_7 = class282_sub50_sub17_sub2_4.anInt10451;
		int i_8 = class282_sub50_sub17_sub2_4.anInt10452;
		int i_9 = anInt732 - i_8;
		int i_10 = 0;
		int i_11;
		if (i_31 <= 0) {
			i_11 = 1 - i_31;
			i_7 -= i_11;
			i_6 += i_11 * i_8;
			i_5 += i_11 * anInt732;
			i_31 = 1;
		}

		if (i_31 + i_7 >= anInt734) {
			i_11 = i_31 + i_7 + 1 - anInt734;
			i_7 -= i_11;
		}

		if (i_21 <= 0) {
			i_11 = 1 - i_21;
			i_8 -= i_11;
			i_6 += i_11;
			i_5 += i_11;
			i_10 += i_11;
			i_9 += i_11;
			i_21 = 1;
		}

		if (i_8 + i_21 >= anInt732) {
			i_11 = i_8 + i_21 + 1 - anInt732;
			i_8 -= i_11;
			i_10 += i_11;
			i_9 += i_11;
		}

		if (i_8 > 0 && i_7 > 0) {
			method1318(aByteArray736, class282_sub50_sub17_sub2_4.aByteArray10454, i_6, i_5, i_8, i_7, i_9, i_10);
			method1326(i_21, i_31, i_8, i_7);
		}

	}

	void method1326(int i_1, int i_2, int i_3, int i_4) {
		if (aClass71ArrayArray738 != null) {
			int i_5 = i_1 - 1 >> 7;
						int i_6 = i_3 + (i_1 - 1) - 1 >> 7;
				int i_7 = i_2 - 1 >> 7;
				int i_8 = i_2 - 1 + i_4 - 1 >> 7;

				for (int i_9 = i_5; i_9 <= i_6; i_9++) {
					Class71[] arr_10 = aClass71ArrayArray738[i_9];

					for (int i_11 = i_7; i_11 <= i_8; i_11++)
						if (arr_10[i_11] != null)
							arr_10[i_11].aBool710 = true;
				}
		}

	}

}
