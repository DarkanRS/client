package com.jagex;

import java.nio.ByteBuffer;

public class Class71 {

	static int[] anIntArray721;
	static byte[] aByteArray722;
	boolean aBool710 = true;
	int anInt715 = -1;
	Interface6 anInterface6_714;
	HardwareRenderer aGraphicalRenderer_Sub2_708;
	Class74 aClass74_711;
	int anInt712;
	int anInt718;
	int anInt716;
	int anInt709;
	int anInt719;
	Interface32 anInterface32_717;

	Class71(HardwareRenderer class505_sub2_1, Class74 class74_2, HardwareGround class390_sub1_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		aGraphicalRenderer_Sub2_708 = class505_sub2_1;
		aClass74_711 = class74_2;
		anInt712 = i_7;
		anInt718 = i_8;
		int i_9 = 1 << i_6;
		int i_10 = 0;
		int i_11 = i_4 << i_6;
		int i_12 = i_5 << i_6;

		int i_14;
		int i_15;
		for (int i_13 = 0; i_13 < i_9; i_13++) {
			i_14 = class390_sub1_3.width * (i_12 + i_13) + i_11;

			for (i_15 = 0; i_15 < i_9; i_15++) {
				short[] shorts_21 = class390_sub1_3.aShortArrayArray8534[i_14++];
				if (shorts_21 != null)
					i_10 += shorts_21.length;
			}
		}

		if (i_10 > 0) {
			anInt709 = Integer.MIN_VALUE;
			anInt719 = Integer.MAX_VALUE;
			anInterface32_717 = aGraphicalRenderer_Sub2_708.method13993(false);
			anInterface32_717.method208(i_10);
			ByteBuffer bytebuffer_20 = aGraphicalRenderer_Sub2_708.aByteBuffer8838;
			bytebuffer_20.clear();

			for (i_14 = 0; i_14 < i_9; i_14++) {
				i_15 = class390_sub1_3.width * (i_12 + i_14) + i_11;

				for (int i_16 = 0; i_16 < i_9; i_16++) {
					short[] shorts_17 = class390_sub1_3.aShortArrayArray8534[i_15++];
					if (shorts_17 != null)
						for (short element : shorts_17) {
							int i_19 = element & 0xffff;
							if (i_19 < anInt719)
								anInt719 = i_19;

							if (i_19 > anInt709)
								anInt709 = i_19;

							bytebuffer_20.putShort((short) i_19);
						}
				}
			}

			anInterface32_717.method42(0, bytebuffer_20.position(), aGraphicalRenderer_Sub2_708.aLong8695);
			anInt716 = i_10 / 3;
		} else {
			anInt716 = 0;
			anInterface6_714 = null;
		}

	}

	void method1288(Class48 class48_1) {
		method1290(class48_1, anInterface32_717, 0, anInt716);
	}

	void method1290(Class48 class48_1, Interface32 interface32_2, int i_3, int i_4) {
		if (i_4 > 0) {
			method1293();
			aGraphicalRenderer_Sub2_708.method13997(interface32_2);
			class48_1.anInterface6_452 = anInterface6_714;
			class48_1.anInt467 = anInt719;
			class48_1.anInt468 = anInt709 - anInt719 + 1;
			class48_1.anInt469 = i_3;
			class48_1.anInt470 = i_4;
			class48_1.method965(0);
		}

	}

	void method1293() {
		if (aBool710) {
			aBool710 = false;
			byte[] bytes_1 = aClass74_711.aByteArray736;
			int i_2 = 0;
			int i_3 = aClass74_711.anInt732;
			int i_4 = anInt712 + aClass74_711.anInt732 * anInt718;

			int i_5;
			for (i_5 = -128; i_5 < 0; i_5++) {
				i_2 = (i_2 << 8) - i_2;

				for (int i_6 = -128; i_6 < 0; i_6++)
					if (bytes_1[i_4++] != 0)
						++i_2;

				i_4 += i_3 - 128;
			}

			if (anInterface6_714 != null && i_2 == anInt715)
				aBool710 = false;
			else {
				anInt715 = i_2;
				i_5 = 0;
				i_4 = i_3 * anInt718 + anInt712;
				int i_7;
				int i_8;
				int i_9;
				if (aGraphicalRenderer_Sub2_708.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
					if (aByteArray722 == null)
						aByteArray722 = new byte[16384];

					byte[] bytes_10 = aByteArray722;

					for (i_7 = -128; i_7 < 0; i_7++) {
						for (i_8 = -128; i_8 < 0; i_8++) {
							if (bytes_1[i_4] != 0)
								bytes_10[i_5++] = 68;
							else {
								i_9 = 0;
								if (bytes_1[i_4 - 1] != 0)
									++i_9;

								if (bytes_1[i_4 + 1] != 0)
									++i_9;

								if (bytes_1[i_4 - i_3] != 0)
									++i_9;

								if (bytes_1[i_4 + i_3] != 0)
									++i_9;

								bytes_10[i_5++] = (byte) (i_9 * 17);
							}

							++i_4;
						}

						i_4 += aClass74_711.anInt732 - 128;
					}

					if (anInterface6_714 == null) {
						anInterface6_714 = aGraphicalRenderer_Sub2_708.method13957(Class150.aClass150_1951, 128, 128, false, aByteArray722);
						anInterface6_714.method50(false, false);
					} else
						anInterface6_714.method52(0, 0, 128, 128, aByteArray722, Class150.aClass150_1951, 0, 128);
				} else {
					if (anIntArray721 == null)
						anIntArray721 = new int[16384];

					int[] ints_11 = anIntArray721;

					for (i_7 = -128; i_7 < 0; i_7++) {
						for (i_8 = -128; i_8 < 0; i_8++) {
							if (bytes_1[i_4] != 0)
								ints_11[i_5++] = 1140850688;
							else {
								i_9 = 0;
								if (bytes_1[i_4 - 1] != 0)
									++i_9;

								if (bytes_1[i_4 + 1] != 0)
									++i_9;

								if (bytes_1[i_4 - i_3] != 0)
									++i_9;

								if (bytes_1[i_4 + i_3] != 0)
									++i_9;

								ints_11[i_5++] = i_9 * 17 << 24;
							}

							++i_4;
						}

						i_4 += aClass74_711.anInt732 - 128;
					}

					if (anInterface6_714 == null) {
						anInterface6_714 = aGraphicalRenderer_Sub2_708.method14024(128, 128, false, anIntArray721);
						anInterface6_714.method50(false, false);
					} else
						anInterface6_714.method48(0, 0, 128, 128, anIntArray721, 0, 128);
				}
			}
		}

	}

}
