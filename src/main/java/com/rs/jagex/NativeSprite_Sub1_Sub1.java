package com.rs.jagex;

public class NativeSprite_Sub1_Sub1 extends NativeSprite_Sub1 {

	int[] anIntArray10201;

	NativeSprite_Sub1_Sub1(JavaRenderer hardwarerenderer_1, int i_2, int i_3) {
		super(hardwarerenderer_1, i_2, i_3);
		anIntArray10201 = new int[i_3 * i_2];
	}

	NativeSprite_Sub1_Sub1(JavaRenderer hardwarerenderer_1, int[] ints_2, int i_3, int i_4) {
		super(hardwarerenderer_1, i_3, i_4);
		anIntArray10201 = ints_2;
	}

	NativeSprite_Sub1_Sub1(JavaRenderer hardwarerenderer_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		super(hardwarerenderer_1, i_5, i_6);
		if (bool_7)
			anIntArray10201 = new int[i_5 * i_6];
		else
			anIntArray10201 = ints_2;

		i_4 -= anInt8851;
		int i_8 = 0;

		for (int i_9 = 0; i_9 < i_6; i_9++) {
			for (int i_10 = 0; i_10 < i_5; i_10++) {
				int i_11 = ints_2[i_3++];
				if (i_11 >>> 24 == 255)
					anIntArray10201[i_8++] = (i_11 & 0xffffff) == 0 ? -16777215 : i_11;
				else
					anIntArray10201[i_8++] = 0;
			}

			i_3 += i_4;
		}

	}

	@Override
	void method14245(int i_1, int i_2) {
		int[] ints_3 = renderer.anIntArray8979;
		if (ints_3 != null) {
			int i_4;
			int i_5;
			int i_6;
			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (anInt8865 == 0) {
				if (anInt8868 == 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_7 >= 0 && i_6 - (anInt8851 << 12) < 0 && i_7 - (anInt8867 << 12) < 0)
							for (; i_8 < 0; i_8++) {
								i_9 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
								i_10 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_10] = anIntArray10201[i_9];
									else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9++];
										i_12 = anInt8880 * (i_11 & 0xff0000) & -16777216;
										i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
										i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9++];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_11 = anIntArray10201[i_9];
										i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
										i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_10] = ((i_12 | i_13) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0)
											ints_3[i_10] = i_11;
									} else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_12 = anInt8877 >>> 24;
												i_13 = 256 - i_12;
												i_14 = ints_3[i_10];
												ints_3[i_10] = ((i_11 & 0xff00ff) * i_12 + (i_14 & 0xff00ff) * i_13 & -16711936) + (i_12 * (i_11 & 0xff00) + i_13 * (i_14 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_12 = anInt8880 * (i_11 & 0xff0000) & -16777216;
												i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
												i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
												i_11 = (i_12 | i_13 | i_14) >>> 8;
												i_15 = ints_3[i_10];
												ints_3[i_10] = ((i_11 & 0xff00ff) * anInt8878 + (i_15 & 0xff00ff) * anInt8879 & -16711936) + ((i_11 & 0xff00) * anInt8878 + (i_15 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_12 = anInt8880 * (i_11 & 0xff0000) & -16777216;
												i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
												i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
											}
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										i_15 = i_13 - i_15 | i_15 - (i_15 >>> 8);
										if (i_11 == 0 && anInt8878 != 255) {
											i_11 = i_15;
											i_15 = ints_3[i_10];
											i_15 = ((i_11 & 0xff00ff) * anInt8878 + (i_15 & 0xff00ff) * anInt8879 & -16711936) + ((i_11 & 0xff00) * anInt8878 + (i_15 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_10] = i_15;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
											i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_10++] = ((i_12 | i_13) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = ints_3[i_10];
											i_13 = i_11 + i_12;
											i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
											i_12 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
											ints_3[i_10] = i_13 - i_12 | i_12 - (i_12 >>> 8);
										}
									} else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = anInt8880 * (i_11 & 0xff0000) & -16777216;
											i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
											i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
											i_11 = (i_12 | i_13 | i_14) >>> 8;
											i_15 = ints_3[i_10];
											i_16 = i_11 + i_15;
											i_17 = (i_11 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_10] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										i_11 = i_13 - i_15 | i_15 - (i_15 >>> 8);
										i_15 = ints_3[i_10];
										i_13 = i_11 + i_15;
										i_14 = (i_11 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else if (i_1 == 2) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
											i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
											i_11 = ((i_12 | i_13) >>> 8) + anInt8885;
											i_14 = ints_3[i_10];
											i_15 = i_11 + i_14;
											i_16 = (i_11 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_10] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									}
								}
							}

						++i_4;
					}
				else if (anInt8868 < 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (anInt8851 << 12) < 0) {
							if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
								i_9 = (anInt8868 - i_9) / anInt8868;
								i_8 += i_9;
								i_7 += i_9 * anInt8868;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_7 += anInt8868;
								++i_8;
							}
						}

						++i_4;
						anInt8873 += anInt8869;
					}
				else
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (anInt8851 << 12) < 0) {
							if (i_7 < 0) {
								i_9 = (anInt8868 - 1 - i_7) / anInt8868;
								i_8 += i_9;
								i_7 += i_9 * anInt8868;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 + 1 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_7 += anInt8868;
								++i_8;
							}
						}

						++i_4;
						anInt8873 += anInt8869;
					}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_7 >= 0 && i_7 - (anInt8867 << 12) < 0) {
							if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
								i_9 = (anInt8865 - i_9) / anInt8865;
								i_8 += i_9;
								i_6 += i_9 * anInt8865;
								i_5 += i_9;
							}

							if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_6 += anInt8865;
								++i_8;
							}
						}

						++i_4;
						anInt8874 += anInt8876;
					}
				else if (anInt8868 < 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
							i_9 = (anInt8868 - i_9) / anInt8868;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							i_7 += anInt8868;
							++i_8;
						}

						++i_4;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				else
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						if (i_7 < 0) {
							i_9 = (anInt8868 - 1 - i_7) / anInt8868;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 + 1 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							i_7 += anInt8868;
							++i_8;
						}

						++i_4;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
			} else if (anInt8868 == 0)
				for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
					i_5 = anInt8870;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874;
					i_8 = anInt8862;
					if (i_7 >= 0 && i_7 - (anInt8867 << 12) < 0) {
						if (i_6 < 0) {
							i_9 = (anInt8865 - 1 - i_6) / anInt8865;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 + 1 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							++i_8;
						}
					}

					++i_4;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else if (anInt8868 < 0)
				for (i_4 = anInt8864; i_4 < 0; i_4++) {
					i_5 = anInt8870;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874 + anInt8866;
					i_8 = anInt8862;
					if (i_6 < 0) {
						i_9 = (anInt8865 - 1 - i_6) / anInt8865;
						i_8 += i_9;
						i_6 += i_9 * anInt8865;
						i_7 += i_9 * anInt8868;
						i_5 += i_9;
					}

					if ((i_9 = (i_6 + 1 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
						i_8 = i_9;

					if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
						i_9 = (anInt8868 - i_9) / anInt8868;
						i_8 += i_9;
						i_6 += i_9 * anInt8865;
						i_7 += i_9 * anInt8868;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
						i_8 = i_9;

					while (i_8 < 0) {
						i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1)
								ints_3[i_11] = anIntArray10201[i_10];
							else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									ints_3[i_11] = i_12;
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_13 = anInt8877 >>> 24;
										i_14 = 256 - i_13;
										i_15 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								if (i_12 == 0 && anInt8878 != 255) {
									i_12 = i_16;
									i_16 = ints_3[i_11];
									i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_16;
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2)
								throw new IllegalArgumentException();

							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = ints_3[i_11];
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
								}
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									i_12 = (i_13 | i_14 | i_15) >>> 8;
									i_16 = ints_3[i_11];
									i_17 = i_12 + i_16;
									i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								i_16 = ints_3[i_11];
								i_14 = i_12 + i_16;
								i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else if (i_1 == 2) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
									i_15 = ints_3[i_11];
									i_16 = i_12 + i_15;
									i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
									i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
									ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
								}
							}
						}

						i_6 += anInt8865;
						i_7 += anInt8868;
						++i_8;
					}

					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
			else
				for (i_4 = anInt8864; i_4 < 0; i_4++) {
					i_5 = anInt8870;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874 + anInt8866;
					i_8 = anInt8862;
					if (i_6 < 0) {
						i_9 = (anInt8865 - 1 - i_6) / anInt8865;
						i_8 += i_9;
						i_6 += i_9 * anInt8865;
						i_7 += i_9 * anInt8868;
						i_5 += i_9;
					}

					if ((i_9 = (i_6 + 1 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
						i_8 = i_9;

					if (i_7 < 0) {
						i_9 = (anInt8868 - 1 - i_7) / anInt8868;
						i_8 += i_9;
						i_6 += i_9 * anInt8865;
						i_7 += i_9 * anInt8868;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 + 1 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
						i_8 = i_9;

					while (i_8 < 0) {
						i_10 = (i_6 >> 12) + (i_7 >> 12) * anInt8851;
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1)
								ints_3[i_11] = anIntArray10201[i_10];
							else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									ints_3[i_11] = i_12;
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_13 = anInt8877 >>> 24;
										i_14 = 256 - i_13;
										i_15 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								if (i_12 == 0 && anInt8878 != 255) {
									i_12 = i_16;
									i_16 = ints_3[i_11];
									i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_16;
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2)
								throw new IllegalArgumentException();

							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = ints_3[i_11];
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
								}
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = anInt8880 * (i_12 & 0xff0000) & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									i_12 = (i_13 | i_14 | i_15) >>> 8;
									i_16 = ints_3[i_11];
									i_17 = i_12 + i_16;
									i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								i_16 = ints_3[i_11];
								i_14 = i_12 + i_16;
								i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else if (i_1 == 2) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
									i_15 = ints_3[i_11];
									i_16 = i_12 + i_15;
									i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
									i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
									ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
								}
							}
						}

						i_6 += anInt8865;
						i_7 += anInt8868;
						++i_8;
					}

					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 += anInt8850;
				}
		}

	}

	@Override
	void method14246(int i_1, int i_2) {
		int[] ints_3 = renderer.anIntArray8979;
		if (ints_3 != null) {
			int i_4;
			int i_5;
			int i_6;
			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (anInt8865 == 0) {
				if (anInt8868 == 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_7 >= 0 && i_6 - (anInt8851 << 12) < 0 && i_7 - (anInt8867 << 12) < 0)
							for (; i_8 < 0; i_8++) {
								i_9 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_10 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_10] = anIntArray10201[i_9];
									else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9++];
										i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
										i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
										i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9++];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_11 = anIntArray10201[i_9];
										i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
										i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_10] = ((i_12 | i_13) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0)
											ints_3[i_10] = i_11;
									} else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_12 = anInt8877 >>> 24;
												i_13 = 256 - i_12;
												i_14 = ints_3[i_10];
												ints_3[i_10] = ((i_11 & 0xff00ff) * i_12 + (i_14 & 0xff00ff) * i_13 & -16711936) + ((i_11 & 0xff00) * i_12 + (i_14 & 0xff00) * i_13 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
												i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
												i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
												i_11 = (i_12 | i_13 | i_14) >>> 8;
												i_15 = ints_3[i_10];
												ints_3[i_10] = ((i_11 & 0xff00ff) * anInt8878 + (i_15 & 0xff00ff) * anInt8879 & -16711936) + ((i_11 & 0xff00) * anInt8878 + (i_15 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
												i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
												i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
											}
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										i_15 = i_13 - i_15 | i_15 - (i_15 >>> 8);
										if (i_11 == 0 && anInt8878 != 255) {
											i_11 = i_15;
											i_15 = ints_3[i_10];
											i_15 = ((i_11 & 0xff00ff) * anInt8878 + (i_15 & 0xff00ff) * anInt8879 & -16711936) + ((i_11 & 0xff00) * anInt8878 + (i_15 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_10] = i_15;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
											i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_10++] = ((i_12 | i_13) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = ints_3[i_10];
											i_13 = i_11 + i_12;
											i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
											i_12 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
											ints_3[i_10] = i_13 - i_12 | i_12 - (i_12 >>> 8);
										}
									} else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
											i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
											i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
											i_11 = (i_12 | i_13 | i_14) >>> 8;
											i_15 = ints_3[i_10];
											i_16 = i_11 + i_15;
											i_17 = (i_11 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_10] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										i_11 = i_13 - i_15 | i_15 - (i_15 >>> 8);
										i_15 = ints_3[i_10];
										i_13 = i_11 + i_15;
										i_14 = (i_11 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else if (i_1 == 2) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
											i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
											i_11 = ((i_12 | i_13) >>> 8) + anInt8885;
											i_14 = ints_3[i_10];
											i_15 = i_11 + i_14;
											i_16 = (i_11 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_10] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									}
								}
							}

						++i_4;
					}
				else if (anInt8868 < 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (anInt8851 << 12) < 0) {
							if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
								i_9 = (anInt8868 - i_9) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_7 += anInt8868;
								++i_8;
							}
						}

						++i_4;
						anInt8873 += anInt8869;
					}
				else
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (anInt8851 << 12) < 0) {
							if (i_7 < 0) {
								i_9 = (anInt8868 - 1 - i_7) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (1 + i_7 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_7 += anInt8868;
								++i_8;
							}
						}

						++i_4;
						anInt8873 += anInt8869;
					}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_7 >= 0 && i_7 - (anInt8867 << 12) < 0) {
							if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
								i_9 = (anInt8865 - i_9) / anInt8865;
								i_8 += i_9;
								i_6 += anInt8865 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_6 += anInt8865;
								++i_8;
							}
						}

						++i_4;
						anInt8874 += anInt8876;
					}
				else if (anInt8868 < 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
							i_9 = (anInt8868 - i_9) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							i_7 += anInt8868;
							++i_8;
						}

						++i_4;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				else
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						if (i_7 < 0) {
							i_9 = (anInt8868 - 1 - i_7) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_7 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							i_7 += anInt8868;
							++i_8;
						}

						++i_4;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
			} else if (anInt8868 == 0)
				for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874;
					i_8 = anInt8862;
					if (i_7 >= 0 && i_7 - (anInt8867 << 12) < 0) {
						if (i_6 < 0) {
							i_9 = (anInt8865 - 1 - i_6) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_6 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							++i_8;
						}
					}

					++i_4;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else if (anInt8868 < 0)
				for (i_4 = anInt8864; i_4 < 0; i_4++) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874 + anInt8866;
					i_8 = anInt8862;
					if (i_6 < 0) {
						i_9 = (anInt8865 - 1 - i_6) / anInt8865;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_6 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
						i_8 = i_9;

					if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
						i_9 = (anInt8868 - i_9) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
						i_8 = i_9;

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1)
								ints_3[i_11] = anIntArray10201[i_10];
							else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10++];
								i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									ints_3[i_11] = i_12;
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_13 = anInt8877 >>> 24;
										i_14 = 256 - i_13;
										i_15 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								if (i_12 == 0 && anInt8878 != 255) {
									i_12 = i_16;
									i_16 = ints_3[i_11];
									i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_16;
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2)
								throw new IllegalArgumentException();

							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = ints_3[i_11];
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
								}
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									i_12 = (i_13 | i_14 | i_15) >>> 8;
									i_16 = ints_3[i_11];
									i_17 = i_12 + i_16;
									i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								i_16 = ints_3[i_11];
								i_14 = i_12 + i_16;
								i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else if (i_1 == 2) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
									i_15 = ints_3[i_11];
									i_16 = i_12 + i_15;
									i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
									i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
									ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
								}
							}
						}

						i_6 += anInt8865;
						i_7 += anInt8868;
						++i_8;
					}

					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403;
				}
			else
				for (i_4 = anInt8864; i_4 < 0; i_4++) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874 + anInt8866;
					i_8 = anInt8862;
					if (i_6 < 0) {
						i_9 = (anInt8865 - 1 - i_6) / anInt8865;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_6 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
						i_8 = i_9;

					if (i_7 < 0) {
						i_9 = (anInt8868 - 1 - i_7) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_7 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
						i_8 = i_9;

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1)
								ints_3[i_11] = anIntArray10201[i_10];
							else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10++];
								i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									ints_3[i_11] = i_12;
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_13 = anInt8877 >>> 24;
										i_14 = 256 - i_13;
										i_15 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								if (i_12 == 0 && anInt8878 != 255) {
									i_12 = i_16;
									i_16 = ints_3[i_11];
									i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_16;
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2)
								throw new IllegalArgumentException();

							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = ints_3[i_11];
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
								}
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									i_12 = (i_13 | i_14 | i_15) >>> 8;
									i_16 = ints_3[i_11];
									i_17 = i_12 + i_16;
									i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								i_16 = ints_3[i_11];
								i_14 = i_12 + i_16;
								i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else if (i_1 == 2) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
									i_15 = ints_3[i_11];
									i_16 = i_12 + i_15;
									i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
									i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
									ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
								}
							}
						}

						i_6 += anInt8865;
						i_7 += anInt8868;
						++i_8;
					}

					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403;
				}
		}

	}

	@Override
	void method14247(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, boolean bool_13) {
		int i_71 = i_7;
		int i_81 = i_8;
		int i_101 = i_10;
		if (i_71 > 0 && i_81 > 0 && (bool_1 || bool_2)) {
			int i_14 = 0;
			int i_15 = 0;
			int i_16 = anInt8853 + anInt8851 + anInt8855;
			int i_17 = anInt8854 + anInt8867 + anInt8856;
			int i_18 = (i_16 << 16) / i_71;
			int i_19 = (i_17 << 16) / i_81;
			int i_20;
			if (anInt8853 > 0) {
				i_20 = (i_18 + (anInt8853 << 16) - 1) / i_18;
				i_4 += i_20;
				i_14 += i_20 * i_18 - (anInt8853 << 16);
			}

			if (anInt8854 > 0) {
				i_20 = (i_19 + (anInt8854 << 16) - 1) / i_19;
				i_5 += i_20;
				i_15 += i_20 * i_19 - (anInt8854 << 16);
			}

			if (anInt8851 < i_16)
				i_71 = ((anInt8851 << 16) - i_14 + i_18 - 1) / i_18;

			if (anInt8867 < i_17)
				i_81 = ((anInt8867 << 16) - i_15 + i_19 - 1) / i_19;

			i_20 = i_5 * renderer.width + i_4;
			int i_21 = renderer.width - i_71;
			if (i_5 + i_81 > renderer.anInt8986)
				i_81 -= i_5 + i_81 - renderer.anInt8986;

			int i_22;
			if (i_5 < renderer.anInt9009) {
				i_22 = renderer.anInt9009 - i_5;
				i_81 -= i_22;
				i_20 += renderer.width * i_22;
				i_15 += i_19 * i_22;
			}

			if (i_4 + i_71 > renderer.anInt9002) {
				i_22 = i_4 + i_71 - renderer.anInt9002;
				i_71 -= i_22;
				i_21 += i_22;
			}

			if (i_4 < renderer.anInt8983) {
				i_22 = renderer.anInt8983 - i_4;
				i_71 -= i_22;
				i_20 += i_22;
				i_14 += i_18 * i_22;
				i_21 += i_22;
			}

			float[] floats_38 = renderer.aFloatArray9010;
			int[] ints_23 = renderer.anIntArray8979;
			int i_24;
			int i_25;
			int i_26;
			int i_27;
			int i_28;
			int i_29;
			int i_30;
			int i_31;
			int i_32;
			int i_33;
			int i_34;
			if (i_11 == 0) {
				if (i_9 == 1) {
					i_24 = i_14;

					for (i_25 = -i_81; i_25 < 0; i_25++) {
						i_26 = anInt8851 * (i_15 >> 16);

						for (i_27 = -i_71; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_38[i_20]) {
								if (bool_1)
									ints_23[i_20] = anIntArray10201[i_26 + (i_14 >> 16)];

								if (bool_2 && bool_13)
									floats_38[i_20] = f_6;
							}

							i_14 += i_18;
							++i_20;
						}

						i_15 += i_19;
						i_14 = i_24;
						i_20 += i_21;
					}
				} else if (i_9 == 0) {
					i_24 = (i_101 & 0xff0000) >> 16;
				i_25 = (i_101 & 0xff00) >> 8;
				i_26 = i_101 & 0xff;
				i_27 = i_14;

				for (i_28 = -i_81; i_28 < 0; i_28++) {
					i_29 = anInt8851 * (i_15 >> 16);

					for (i_30 = -i_71; i_30 < 0; i_30++) {
						if (!bool_2 || f_6 < floats_38[i_20]) {
							if (bool_1) {
								i_31 = anIntArray10201[i_29 + (i_14 >> 16)];
								i_32 = i_24 * (i_31 & 0xff0000) & -16777216;
								i_33 = i_25 * (i_31 & 0xff00) & 0xff0000;
								i_34 = (i_31 & 0xff) * i_26 & 0xff00;
								ints_23[i_20] = (i_32 | i_33 | i_34) >>> 8;
							}

							if (bool_2 && bool_13)
								floats_38[i_20] = f_6;
						}

						i_14 += i_18;
						++i_20;
					}

					i_15 += i_19;
					i_14 = i_27;
					i_20 += i_21;
				}
				} else if (i_9 == 3) {
					i_24 = i_14;

					for (i_25 = -i_81; i_25 < 0; i_25++) {
						i_26 = anInt8851 * (i_15 >> 16);

						for (i_27 = -i_71; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_38[i_20]) {
								if (bool_1) {
									i_28 = anIntArray10201[i_26 + (i_14 >> 16)];
									i_29 = i_101 + i_28;
									i_30 = (i_28 & 0xff00ff) + (i_101 & 0xff00ff);
									i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
									ints_23[i_20] = i_29 - i_31 | i_31 - (i_31 >>> 8);
								}

								if (bool_2 && bool_13)
									floats_38[i_20] = f_6;
							}

							i_14 += i_18;
							++i_20;
						}

						i_15 += i_19;
						i_14 = i_24;
						i_20 += i_21;
					}
				} else {
					if (i_9 != 2)
						throw new IllegalArgumentException();

					i_24 = i_101 >>> 24;
			i_25 = 256 - i_24;
			i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
			i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
			i_101 = (i_26 | i_27) >>> 8;
			i_28 = i_14;

			for (i_29 = -i_81; i_29 < 0; i_29++) {
				i_30 = anInt8851 * (i_15 >> 16);

				for (i_31 = -i_71; i_31 < 0; i_31++) {
					if (!bool_2 || f_6 < floats_38[i_20]) {
						if (bool_1) {
							i_32 = anIntArray10201[i_30 + (i_14 >> 16)];
							i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
							i_27 = i_24 * (i_32 & 0xff00) & 0xff0000;
							ints_23[i_20] = i_101 + ((i_26 | i_27) >>> 8);
						}

						if (bool_2 && bool_13)
							floats_38[i_20] = f_6;
					}

					i_14 += i_18;
					++i_20;
				}

				i_15 += i_19;
				i_14 = i_28;
				i_20 += i_21;
			}
				}
			} else {
				int i_35;
				int i_36;
				int i_37;
				if (i_11 == 1) {
					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = anInt8851 * (i_15 >> 16);

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_28 = anIntArray10201[i_26 + (i_14 >> 16)];
									if (i_28 != 0) {
										if (bool_1)
											ints_23[i_20] = i_28;

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 0) {
						i_24 = i_14;
						if ((i_101 & 0xffffff) == 16777215) {
							i_25 = i_101 >>> 24;
							i_26 = 256 - i_25;

							for (i_27 = -i_81; i_27 < 0; i_27++) {
								i_28 = anInt8851 * (i_15 >> 16);

								for (i_29 = -i_71; i_29 < 0; i_29++) {
									if (!bool_2 || f_6 < floats_38[i_20]) {
										i_30 = anIntArray10201[i_28 + (i_14 >> 16)];
										if (i_30 != 0) {
											if (bool_1) {
												i_31 = ints_23[i_20];
												ints_23[i_20] = ((i_30 & 0xff00ff) * i_25 + (i_31 & 0xff00ff) * i_26 & -16711936) + (i_25 * (i_30 & 0xff00) + i_26 * (i_31 & 0xff00) & 0xff0000) >> 8;
											}

											if (bool_2 && bool_13)
												floats_38[i_20] = f_6;
										}
									}

									i_14 += i_18;
									++i_20;
								}

								i_15 += i_19;
								i_14 = i_24;
								i_20 += i_21;
							}
						} else {
							i_25 = (i_101 & 0xff0000) >> 16;
							i_26 = (i_101 & 0xff00) >> 8;
							i_27 = i_101 & 0xff;
							i_28 = i_101 >>> 24;
							i_29 = 256 - i_28;

							for (i_30 = -i_81; i_30 < 0; i_30++) {
								i_31 = anInt8851 * (i_15 >> 16);

								for (i_32 = -i_71; i_32 < 0; i_32++) {
									if (!bool_2 || f_6 < floats_38[i_20]) {
										i_33 = anIntArray10201[i_31 + (i_14 >> 16)];
										if (i_33 != 0) {
											if (bool_1) {
												if (i_28 != 255) {
													i_34 = i_25 * (i_33 & 0xff0000) & -16777216;
													i_35 = i_26 * (i_33 & 0xff00) & 0xff0000;
													i_36 = (i_33 & 0xff) * i_27 & 0xff00;
													i_33 = (i_34 | i_35 | i_36) >>> 8;
													i_37 = ints_23[i_20];
													ints_23[i_20] = ((i_33 & 0xff00ff) * i_28 + (i_37 & 0xff00ff) * i_29 & -16711936) + (i_28 * (i_33 & 0xff00) + i_29 * (i_37 & 0xff00) & 0xff0000) >> 8;
												} else {
													i_34 = i_25 * (i_33 & 0xff0000) & -16777216;
													i_35 = i_26 * (i_33 & 0xff00) & 0xff0000;
													i_36 = (i_33 & 0xff) * i_27 & 0xff00;
													ints_23[i_20] = (i_34 | i_35 | i_36) >>> 8;
												}
											}
											if (bool_2 && bool_13)
												floats_38[i_20] = f_6;
										}
									}

									i_14 += i_18;
									++i_20;
								}

								i_15 += i_19;
								i_14 = i_24;
								i_20 += i_21;
							}
						}
					} else if (i_9 == 3) {
						i_24 = i_14;
						i_25 = i_101 >>> 24;
						i_26 = 256 - i_25;

						for (i_27 = -i_81; i_27 < 0; i_27++) {
							i_28 = anInt8851 * (i_15 >> 16);

							for (i_29 = -i_71; i_29 < 0; i_29++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									if (bool_1) {
										i_30 = anIntArray10201[i_28 + (i_14 >> 16)];
										i_31 = i_101 + i_30;
										i_32 = (i_30 & 0xff00ff) + (i_101 & 0xff00ff);
										i_33 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
										i_33 = i_31 - i_33 | i_33 - (i_33 >>> 8);
										if (i_30 == 0 && i_25 != 255) {
											i_30 = i_33;
											i_33 = ints_23[i_20];
											i_33 = ((i_30 & 0xff00ff) * i_25 + (i_33 & 0xff00ff) * i_26 & -16711936) + (i_25 * (i_30 & 0xff00) + i_26 * (i_33 & 0xff00) & 0xff0000) >> 8;
										}

										ints_23[i_20] = i_33;
									}

									if (bool_2 && bool_13)
										floats_38[i_20] = f_6;
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else {
						if (i_9 != 2)
							throw new IllegalArgumentException();

						i_24 = i_101 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
						i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
						i_101 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_81; i_29 < 0; i_29++) {
							i_30 = anInt8851 * (i_15 >> 16);

							for (i_31 = -i_71; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_32 = anIntArray10201[i_30 + (i_14 >> 16)];
									if (i_32 != 0) {
										if (bool_1) {
											i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
											i_27 = i_24 * (i_32 & 0xff00) & 0xff0000;
											ints_23[i_20] = i_101 + ((i_26 | i_27) >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_28;
							i_20 += i_21;
						}
					}
				} else {
					if (i_11 != 2)
						throw new IllegalArgumentException();

					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = anInt8851 * (i_15 >> 16);

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_28 = anIntArray10201[i_26 + (i_14 >> 16)];
									if (i_28 != 0) {
										if (bool_1) {
											i_29 = ints_23[i_20];
											i_30 = i_28 + i_29;
											i_31 = (i_28 & 0xff00ff) + (i_29 & 0xff00ff);
											i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
											ints_23[i_20] = i_30 - i_29 | i_29 - (i_29 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 0) {
						i_24 = i_14;
						i_25 = (i_101 & 0xff0000) >> 16;
						i_26 = (i_101 & 0xff00) >> 8;
						i_27 = i_101 & 0xff;

						for (i_28 = -i_81; i_28 < 0; i_28++) {
							i_29 = anInt8851 * (i_15 >> 16);

							for (i_30 = -i_71; i_30 < 0; i_30++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_31 = anIntArray10201[i_29 + (i_14 >> 16)];
									if (i_31 != 0) {
										if (bool_1) {
											i_32 = i_25 * (i_31 & 0xff0000) & -16777216;
											i_33 = i_26 * (i_31 & 0xff00) & 0xff0000;
											i_34 = (i_31 & 0xff) * i_27 & 0xff00;
											i_31 = (i_32 | i_33 | i_34) >>> 8;
											i_35 = ints_23[i_20];
											i_36 = i_31 + i_35;
											i_37 = (i_31 & 0xff00ff) + (i_35 & 0xff00ff);
											i_35 = (i_37 & 0x1000100) + (i_36 - i_37 & 0x10000);
											ints_23[i_20] = i_36 - i_35 | i_35 - (i_35 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 3) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = anInt8851 * (i_15 >> 16);

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									if (bool_1) {
										i_28 = anIntArray10201[i_26 + (i_14 >> 16)];
										i_29 = i_101 + i_28;
										i_30 = (i_28 & 0xff00ff) + (i_101 & 0xff00ff);
										i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										i_28 = i_29 - i_31 | i_31 - (i_31 >>> 8);
										i_31 = ints_23[i_20];
										i_29 = i_28 + i_31;
										i_30 = (i_28 & 0xff00ff) + (i_31 & 0xff00ff);
										i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										ints_23[i_20] = i_29 - i_31 | i_31 - (i_31 >>> 8);
									}

									if (bool_2 && bool_13)
										floats_38[i_20] = f_6;
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else {
						if (i_9 != 2)
							throw new IllegalArgumentException();

						i_24 = i_101 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
						i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
						i_101 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_81; i_29 < 0; i_29++) {
							i_30 = anInt8851 * (i_15 >> 16);

							for (i_31 = -i_71; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_32 = anIntArray10201[i_30 + (i_14 >> 16)];
									if (i_32 != 0) {
										if (bool_1) {
											i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
											i_27 = i_24 * (i_32 & 0xff00) & 0xff0000;
											i_32 = i_101 + ((i_26 | i_27) >>> 8);
											i_33 = ints_23[i_20];
											i_34 = i_32 + i_33;
											i_35 = (i_32 & 0xff00ff) + (i_33 & 0xff00ff);
											i_33 = (i_35 & 0x1000100) + (i_34 - i_35 & 0x10000);
											ints_23[i_20] = i_34 - i_33 | i_33 - (i_33 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_28;
							i_20 += i_21;
						}
					}
				}
			}
		}

	}

	@Override
	void method14250(int[] ints_1, int[] ints_2, int i_3, int i_4) {
		int[] ints_5 = renderer.anIntArray8979;
		if (ints_5 != null) {
			int i_6;
			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			if (anInt8865 == 0) {
				if (anInt8868 == 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870;
							i_9 = anInt8873;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_10 >= 0 && i_9 - (anInt8851 << 12) < 0 && i_10 - (anInt8867 << 12) < 0) {
								i_12 = ints_1[i_7] - i_3;
								i_13 = -ints_2[i_7];
								i_14 = i_12 - (i_8 - anInt8870);
								if (i_14 > 0) {
									i_8 += i_14;
									i_11 += i_14;
									i_9 += i_14 * anInt8865;
									i_10 += i_14 * anInt8868;
								} else
									i_13 -= i_14;

								if (i_11 < i_13)
									i_11 = i_13;

								for (; i_11 < 0; i_11++) {
									i_15 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
									if (i_15 != 0)
										ints_5[i_8++] = i_15;
									else
										++i_8;
								}
							}
						}

						++i_6;
					}
				else if (anInt8868 < 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (anInt8851 << 12) < 0) {
								if ((i_12 = i_10 - (anInt8867 << 12)) >= 0) {
									i_12 = (anInt8868 - i_12) / anInt8868;
									i_11 += i_12;
									i_10 += i_12 * anInt8868;
									i_8 += i_12;
								}

								if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11)
									i_11 = i_12;

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_15 = i_13 - (i_8 - anInt8870);
								if (i_15 > 0) {
									i_8 += i_15;
									i_11 += i_15;
									i_9 += i_15 * anInt8865;
									i_10 += i_15 * anInt8868;
								} else
									i_14 -= i_15;

								if (i_11 < i_14)
									i_11 = i_14;

								while (i_11 < 0) {
									i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
									if (i_16 != 0)
										ints_5[i_8++] = i_16;
									else
										++i_8;

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
				else
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (anInt8851 << 12) < 0) {
								if (i_10 < 0) {
									i_12 = (anInt8868 - 1 - i_10) / anInt8868;
									i_11 += i_12;
									i_10 += i_12 * anInt8868;
									i_8 += i_12;
								}

								if ((i_12 = (i_10 + 1 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_11)
									i_11 = i_12;

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_15 = i_13 - (i_8 - anInt8870);
								if (i_15 > 0) {
									i_8 += i_15;
									i_11 += i_15;
									i_9 += i_15 * anInt8865;
									i_10 += i_15 * anInt8868;
								} else
									i_14 -= i_15;

								if (i_11 < i_14)
									i_11 = i_14;

								while (i_11 < 0) {
									i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
									if (i_16 != 0)
										ints_5[i_8++] = i_16;
									else
										++i_8;

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_10 >= 0 && i_10 - (anInt8867 << 12) < 0) {
								if ((i_12 = i_9 - (anInt8851 << 12)) >= 0) {
									i_12 = (anInt8865 - i_12) / anInt8865;
									i_11 += i_12;
									i_9 += i_12 * anInt8865;
									i_8 += i_12;
								}

								if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11)
									i_11 = i_12;

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_15 = i_13 - (i_8 - anInt8870);
								if (i_15 > 0) {
									i_8 += i_15;
									i_11 += i_15;
									i_9 += i_15 * anInt8865;
									i_10 += i_15 * anInt8868;
								} else
									i_14 -= i_15;

								if (i_11 < i_14)
									i_11 = i_14;

								while (i_11 < 0) {
									i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
									if (i_16 != 0)
										ints_5[i_8++] = i_16;
									else
										++i_8;

									i_9 += anInt8865;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8874 += anInt8876;
					}
				else if (anInt8868 < 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11)
								i_11 = i_12;

							if ((i_12 = i_10 - (anInt8867 << 12)) >= 0) {
								i_12 = (anInt8868 - i_12) / anInt8868;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11)
								i_11 = i_12;

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_15 = i_13 - (i_8 - anInt8870);
							if (i_15 > 0) {
								i_8 += i_15;
								i_11 += i_15;
								i_9 += i_15 * anInt8865;
								i_10 += i_15 * anInt8868;
							} else
								i_14 -= i_15;

							if (i_11 < i_14)
								i_11 = i_14;

							while (i_11 < 0) {
								i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
								if (i_16 != 0)
									ints_5[i_8++] = i_16;
								else
									++i_8;

								i_9 += anInt8865;
								i_10 += anInt8868;
								++i_11;
							}
						}

						++i_6;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				else
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11)
								i_11 = i_12;

							if (i_10 < 0) {
								i_12 = (anInt8868 - 1 - i_10) / anInt8868;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_10 + 1 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_11)
								i_11 = i_12;

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_15 = i_13 - (i_8 - anInt8870);
							if (i_15 > 0) {
								i_8 += i_15;
								i_11 += i_15;
								i_9 += i_15 * anInt8865;
								i_10 += i_15 * anInt8868;
							} else
								i_14 -= i_15;

							if (i_11 < i_14)
								i_11 = i_14;

							while (i_11 < 0) {
								i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
								if (i_16 != 0)
									ints_5[i_8++] = i_16;
								else
									++i_8;

								i_9 += anInt8865;
								i_10 += anInt8868;
								++i_11;
							}
						}

						++i_6;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
			} else if (anInt8868 == 0)
				for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length)
							break;

						i_8 = anInt8870;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874;
						i_11 = anInt8862;
						if (i_10 >= 0 && i_10 - (anInt8867 << 12) < 0) {
							if (i_9 < 0) {
								i_12 = (anInt8865 - 1 - i_9) / anInt8865;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 + 1 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_11)
								i_11 = i_12;

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_15 = i_13 - (i_8 - anInt8870);
							if (i_15 > 0) {
								i_8 += i_15;
								i_11 += i_15;
								i_9 += i_15 * anInt8865;
								i_10 += i_15 * anInt8868;
							} else
								i_14 -= i_15;

							if (i_11 < i_14)
								i_11 = i_14;

							while (i_11 < 0) {
								i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
								if (i_16 != 0)
									ints_5[i_8++] = i_16;
								else
									++i_8;

								i_9 += anInt8865;
								++i_11;
							}
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else if (anInt8868 < 0)
				for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length)
							break;

						i_8 = anInt8870;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874 + anInt8866;
						i_11 = anInt8862;
						if (i_9 < 0) {
							i_12 = (anInt8865 - 1 - i_9) / anInt8865;
							i_11 += i_12;
							i_9 += i_12 * anInt8865;
							i_10 += i_12 * anInt8868;
							i_8 += i_12;
						}

						if ((i_12 = (i_9 + 1 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_11)
							i_11 = i_12;

						if ((i_12 = i_10 - (anInt8867 << 12)) >= 0) {
							i_12 = (anInt8868 - i_12) / anInt8868;
							i_11 += i_12;
							i_9 += i_12 * anInt8865;
							i_10 += i_12 * anInt8868;
							i_8 += i_12;
						}

						if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11)
							i_11 = i_12;

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_15 = i_13 - (i_8 - anInt8870);
						if (i_15 > 0) {
							i_8 += i_15;
							i_11 += i_15;
							i_9 += i_15 * anInt8865;
							i_10 += i_15 * anInt8868;
						} else
							i_14 -= i_15;

						if (i_11 < i_14)
							i_11 = i_14;

						while (i_11 < 0) {
							i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
							if (i_16 != 0)
								ints_5[i_8++] = i_16;
							else
								++i_8;

							i_9 += anInt8865;
							i_10 += anInt8868;
							++i_11;
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else
				for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length)
							break;

						i_8 = anInt8870;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874 + anInt8866;
						i_11 = anInt8862;
						if (i_9 < 0) {
							i_12 = (anInt8865 - 1 - i_9) / anInt8865;
							i_11 += i_12;
							i_9 += i_12 * anInt8865;
							i_10 += i_12 * anInt8868;
							i_8 += i_12;
						}

						if ((i_12 = (i_9 + 1 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_11)
							i_11 = i_12;

						if (i_10 < 0) {
							i_12 = (anInt8868 - 1 - i_10) / anInt8868;
							i_11 += i_12;
							i_9 += i_12 * anInt8865;
							i_10 += i_12 * anInt8868;
							i_8 += i_12;
						}

						if ((i_12 = (i_10 + 1 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_11)
							i_11 = i_12;

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_15 = i_13 - (i_8 - anInt8870);
						if (i_15 > 0) {
							i_8 += i_15;
							i_11 += i_15;
							i_9 += i_15 * anInt8865;
							i_10 += i_15 * anInt8868;
						} else
							i_14 -= i_15;

						if (i_11 < i_14)
							i_11 = i_14;

						while (i_11 < 0) {
							i_16 = anIntArray10201[(i_9 >> 12) + (i_10 >> 12) * anInt8851];
							if (i_16 != 0)
								ints_5[i_8++] = i_16;
							else
								++i_8;

							i_9 += anInt8865;
							i_10 += anInt8868;
							++i_11;
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
		}

	}

	@Override
	void method14251(int[] ints_1, int[] ints_2, int i_3, int i_4) {
		int[] ints_5 = renderer.anIntArray8979;
		if (ints_5 != null) {
			int i_6;
			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			if (anInt8865 == 0) {
				if (anInt8868 == 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_10 >= 0 && i_9 - (anInt8851 << 12) < 0 && i_10 - (anInt8867 << 12) < 0) {
								i_12 = ints_1[i_7] - i_3;
								i_13 = -ints_2[i_7];
								i_14 = i_12 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_14 > 0) {
									i_8 += i_14;
									i_11 += i_14;
									i_9 += anInt8865 * i_14;
									i_10 += anInt8868 * i_14;
								} else
									i_13 -= i_14;

								if (i_11 < i_13)
									i_11 = i_13;

								for (; i_11 < 0; i_11++) {
									i_15 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
									if (i_15 != 0)
										ints_5[i_8++] = i_15;
									else
										++i_8;
								}
							}
						}

						++i_6;
					}
				else if (anInt8868 < 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (anInt8851 << 12) < 0) {
								if ((i_12 = i_10 - (anInt8867 << 12)) >= 0) {
									i_12 = (anInt8868 - i_12) / anInt8868;
									i_11 += i_12;
									i_10 += anInt8868 * i_12;
									i_8 += i_12;
								}

								if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11)
									i_11 = i_12;

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_15 > 0) {
									i_8 += i_15;
									i_11 += i_15;
									i_9 += anInt8865 * i_15;
									i_10 += anInt8868 * i_15;
								} else
									i_14 -= i_15;

								if (i_11 < i_14)
									i_11 = i_14;

								while (i_11 < 0) {
									i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
									if (i_16 != 0)
										ints_5[i_8++] = i_16;
									else
										++i_8;

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
				else
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (anInt8851 << 12) < 0) {
								if (i_10 < 0) {
									i_12 = (anInt8868 - 1 - i_10) / anInt8868;
									i_11 += i_12;
									i_10 += anInt8868 * i_12;
									i_8 += i_12;
								}

								if ((i_12 = (1 + i_10 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_11)
									i_11 = i_12;

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_15 > 0) {
									i_8 += i_15;
									i_11 += i_15;
									i_9 += anInt8865 * i_15;
									i_10 += anInt8868 * i_15;
								} else
									i_14 -= i_15;

								if (i_11 < i_14)
									i_11 = i_14;

								while (i_11 < 0) {
									i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
									if (i_16 != 0)
										ints_5[i_8++] = i_16;
									else
										++i_8;

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_10 >= 0 && i_10 - (anInt8867 << 12) < 0) {
								if ((i_12 = i_9 - (anInt8851 << 12)) >= 0) {
									i_12 = (anInt8865 - i_12) / anInt8865;
									i_11 += i_12;
									i_9 += anInt8865 * i_12;
									i_8 += i_12;
								}

								if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11)
									i_11 = i_12;

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_15 > 0) {
									i_8 += i_15;
									i_11 += i_15;
									i_9 += anInt8865 * i_15;
									i_10 += anInt8868 * i_15;
								} else
									i_14 -= i_15;

								if (i_11 < i_14)
									i_11 = i_14;

								while (i_11 < 0) {
									i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
									if (i_16 != 0)
										ints_5[i_8++] = i_16;
									else
										++i_8;

									i_9 += anInt8865;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8874 += anInt8876;
					}
				else if (anInt8868 < 0)
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11)
								i_11 = i_12;

							if ((i_12 = i_10 - (anInt8867 << 12)) >= 0) {
								i_12 = (anInt8868 - i_12) / anInt8868;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11)
								i_11 = i_12;

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
							if (i_15 > 0) {
								i_8 += i_15;
								i_11 += i_15;
								i_9 += anInt8865 * i_15;
								i_10 += anInt8868 * i_15;
							} else
								i_14 -= i_15;

							if (i_11 < i_14)
								i_11 = i_14;

							while (i_11 < 0) {
								i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
								if (i_16 != 0)
									ints_5[i_8++] = i_16;
								else
									++i_8;

								i_9 += anInt8865;
								i_10 += anInt8868;
								++i_11;
							}
						}

						++i_6;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				else
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length)
								break;

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11)
								i_11 = i_12;

							if (i_10 < 0) {
								i_12 = (anInt8868 - 1 - i_10) / anInt8868;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (1 + i_10 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_11)
								i_11 = i_12;

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
							if (i_15 > 0) {
								i_8 += i_15;
								i_11 += i_15;
								i_9 += anInt8865 * i_15;
								i_10 += anInt8868 * i_15;
							} else
								i_14 -= i_15;

							if (i_11 < i_14)
								i_11 = i_14;

							while (i_11 < 0) {
								i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
								if (i_16 != 0)
									ints_5[i_8++] = i_16;
								else
									++i_8;

								i_9 += anInt8865;
								i_10 += anInt8868;
								++i_11;
							}
						}

						++i_6;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
			} else if (anInt8868 == 0)
				for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length)
							break;

						i_8 = anInt8870 * 299731099 * 444800403;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874;
						i_11 = anInt8862;
						if (i_10 >= 0 && i_10 - (anInt8867 << 12) < 0) {
							if (i_9 < 0) {
								i_12 = (anInt8865 - 1 - i_9) / anInt8865;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (1 + i_9 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_11)
								i_11 = i_12;

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
							if (i_15 > 0) {
								i_8 += i_15;
								i_11 += i_15;
								i_9 += anInt8865 * i_15;
								i_10 += anInt8868 * i_15;
							} else
								i_14 -= i_15;

							if (i_11 < i_14)
								i_11 = i_14;

							while (i_11 < 0) {
								i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
								if (i_16 != 0)
									ints_5[i_8++] = i_16;
								else
									++i_8;

								i_9 += anInt8865;
								++i_11;
							}
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else if (anInt8868 < 0)
				for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length)
							break;

						i_8 = anInt8870 * 299731099 * 444800403;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874 + anInt8866;
						i_11 = anInt8862;
						if (i_9 < 0) {
							i_12 = (anInt8865 - 1 - i_9) / anInt8865;
							i_11 += i_12;
							i_9 += anInt8865 * i_12;
							i_10 += anInt8868 * i_12;
							i_8 += i_12;
						}

						if ((i_12 = (1 + i_9 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_11)
							i_11 = i_12;

						if ((i_12 = i_10 - (anInt8867 << 12)) >= 0) {
							i_12 = (anInt8868 - i_12) / anInt8868;
							i_11 += i_12;
							i_9 += anInt8865 * i_12;
							i_10 += anInt8868 * i_12;
							i_8 += i_12;
						}

						if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11)
							i_11 = i_12;

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
						if (i_15 > 0) {
							i_8 += i_15;
							i_11 += i_15;
							i_9 += anInt8865 * i_15;
							i_10 += anInt8868 * i_15;
						} else
							i_14 -= i_15;

						if (i_11 < i_14)
							i_11 = i_14;

						while (i_11 < 0) {
							i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
							if (i_16 != 0)
								ints_5[i_8++] = i_16;
							else
								++i_8;

							i_9 += anInt8865;
							i_10 += anInt8868;
							++i_11;
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else
				for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length)
							break;

						i_8 = anInt8870 * 299731099 * 444800403;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874 + anInt8866;
						i_11 = anInt8862;
						if (i_9 < 0) {
							i_12 = (anInt8865 - 1 - i_9) / anInt8865;
							i_11 += i_12;
							i_9 += anInt8865 * i_12;
							i_10 += anInt8868 * i_12;
							i_8 += i_12;
						}

						if ((i_12 = (1 + i_9 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_11)
							i_11 = i_12;

						if (i_10 < 0) {
							i_12 = (anInt8868 - 1 - i_10) / anInt8868;
							i_11 += i_12;
							i_9 += anInt8865 * i_12;
							i_10 += anInt8868 * i_12;
							i_8 += i_12;
						}

						if ((i_12 = (1 + i_10 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_11)
							i_11 = i_12;

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_15 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
						if (i_15 > 0) {
							i_8 += i_15;
							i_11 += i_15;
							i_9 += anInt8865 * i_15;
							i_10 += anInt8868 * i_15;
						} else
							i_14 -= i_15;

						if (i_11 < i_14)
							i_11 = i_14;

						while (i_11 < 0) {
							i_16 = anIntArray10201[(i_10 >> 12) * anInt8851 + (i_9 >> 12)];
							if (i_16 != 0)
								ints_5[i_8++] = i_16;
							else
								++i_8;

							i_9 += anInt8865;
							i_10 += anInt8868;
							++i_11;
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
		}

	}

	@Override
	void method14252(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, boolean bool_13) {
		int i_71 = i_7;
		int i_81 = i_8;
		int i_101 = i_10;
		if (i_71 > 0 && i_81 > 0 && (bool_1 || bool_2)) {
			int i_14 = 0;
			int i_15 = 0;
			int i_16 = anInt8853 + anInt8851 + anInt8855;
			int i_17 = anInt8854 + anInt8867 + anInt8856;
			int i_18 = (i_16 << 16) / i_71;
			int i_19 = (i_17 << 16) / i_81;
			int i_20;
			if (anInt8853 > 0) {
				i_20 = ((anInt8853 << 16) + i_18 - 1) / i_18;
				i_4 += i_20;
				i_14 += i_20 * i_18 - (anInt8853 << 16);
			}

			if (anInt8854 > 0) {
				i_20 = ((anInt8854 << 16) + i_19 - 1) / i_19;
				i_5 += i_20;
				i_15 += i_20 * i_19 - (anInt8854 << 16);
			}

			if (anInt8851 < i_16)
				i_71 = ((anInt8851 << 16) - i_14 + i_18 - 1) / i_18;

			if (anInt8867 < i_17)
				i_81 = ((anInt8867 << 16) - i_15 + i_19 - 1) / i_19;

			i_20 = i_4 + i_5 * renderer.width * 299731099 * 444800403;
			int i_21 = renderer.width * 299731099 * 444800403 - i_71;
			if (i_5 + i_81 > renderer.anInt8986 * 760194793 * 1383960921)
				i_81 -= i_5 + i_81 - renderer.anInt8986 * 760194793 * 1383960921;

			int i_22;
			if (i_5 < renderer.anInt9009 * 1457972577 * 1516535457) {
				i_22 = renderer.anInt9009 * 1457972577 * 1516535457 - i_5;
				i_81 -= i_22;
				i_20 += i_22 * renderer.width * 299731099 * 444800403;
				i_15 += i_19 * i_22;
			}

			if (i_4 + i_71 > renderer.anInt9002 * 1714763515 * -1710988237) {
				i_22 = i_4 + i_71 - renderer.anInt9002 * 1714763515 * -1710988237;
				i_71 -= i_22;
				i_21 += i_22;
			}

			if (i_4 < renderer.anInt8983 * -363774331 * 72550989) {
				i_22 = renderer.anInt8983 * -363774331 * 72550989 - i_4;
				i_71 -= i_22;
				i_20 += i_22;
				i_14 += i_18 * i_22;
				i_21 += i_22;
			}

			float[] floats_38 = renderer.aFloatArray9010;
			int[] ints_23 = renderer.anIntArray8979;
			int i_24;
			int i_25;
			int i_26;
			int i_27;
			int i_28;
			int i_29;
			int i_30;
			int i_31;
			int i_32;
			int i_33;
			int i_34;
			if (i_11 == 0) {
				if (i_9 == 1) {
					i_24 = i_14;

					for (i_25 = -i_81; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * anInt8851;

						for (i_27 = -i_71; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_38[i_20]) {
								if (bool_1)
									ints_23[i_20] = anIntArray10201[(i_14 >> 16) + i_26];

								if (bool_2 && bool_13)
									floats_38[i_20] = f_6;
							}

							i_14 += i_18;
							++i_20;
						}

						i_15 += i_19;
						i_14 = i_24;
						i_20 += i_21;
					}
				} else if (i_9 == 0) {
					i_24 = (i_101 & 0xff0000) >> 16;
				i_25 = (i_101 & 0xff00) >> 8;
				i_26 = i_101 & 0xff;
				i_27 = i_14;

				for (i_28 = -i_81; i_28 < 0; i_28++) {
					i_29 = (i_15 >> 16) * anInt8851;

					for (i_30 = -i_71; i_30 < 0; i_30++) {
						if (!bool_2 || f_6 < floats_38[i_20]) {
							if (bool_1) {
								i_31 = anIntArray10201[(i_14 >> 16) + i_29];
								i_32 = (i_31 & 0xff0000) * i_24 & -16777216;
								i_33 = (i_31 & 0xff00) * i_25 & 0xff0000;
								i_34 = (i_31 & 0xff) * i_26 & 0xff00;
								ints_23[i_20] = (i_32 | i_33 | i_34) >>> 8;
							}

							if (bool_2 && bool_13)
								floats_38[i_20] = f_6;
						}

						i_14 += i_18;
						++i_20;
					}

					i_15 += i_19;
					i_14 = i_27;
					i_20 += i_21;
				}
				} else if (i_9 == 3) {
					i_24 = i_14;

					for (i_25 = -i_81; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * anInt8851;

						for (i_27 = -i_71; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_38[i_20]) {
								if (bool_1) {
									i_28 = anIntArray10201[(i_14 >> 16) + i_26];
									i_29 = i_28 + i_101;
									i_30 = (i_28 & 0xff00ff) + (i_101 & 0xff00ff);
									i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
									ints_23[i_20] = i_29 - i_31 | i_31 - (i_31 >>> 8);
								}

								if (bool_2 && bool_13)
									floats_38[i_20] = f_6;
							}

							i_14 += i_18;
							++i_20;
						}

						i_15 += i_19;
						i_14 = i_24;
						i_20 += i_21;
					}
				} else {
					if (i_9 != 2)
						throw new IllegalArgumentException();

					i_24 = i_101 >>> 24;
			i_25 = 256 - i_24;
			i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
			i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
			i_101 = (i_26 | i_27) >>> 8;
			i_28 = i_14;

			for (i_29 = -i_81; i_29 < 0; i_29++) {
				i_30 = (i_15 >> 16) * anInt8851;

				for (i_31 = -i_71; i_31 < 0; i_31++) {
					if (!bool_2 || f_6 < floats_38[i_20]) {
						if (bool_1) {
							i_32 = anIntArray10201[(i_14 >> 16) + i_30];
							i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
							i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
							ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_101;
						}

						if (bool_2 && bool_13)
							floats_38[i_20] = f_6;
					}

					i_14 += i_18;
					++i_20;
				}

				i_15 += i_19;
				i_14 = i_28;
				i_20 += i_21;
			}
				}
			} else {
				int i_35;
				int i_36;
				int i_37;
				if (i_11 == 1) {
					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * anInt8851;

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_28 = anIntArray10201[(i_14 >> 16) + i_26];
									if (i_28 != 0) {
										if (bool_1)
											ints_23[i_20] = i_28;

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 0) {
						i_24 = i_14;
						if ((i_101 & 0xffffff) == 16777215) {
							i_25 = i_101 >>> 24;
							i_26 = 256 - i_25;

							for (i_27 = -i_81; i_27 < 0; i_27++) {
								i_28 = (i_15 >> 16) * anInt8851;

								for (i_29 = -i_71; i_29 < 0; i_29++) {
									if (!bool_2 || f_6 < floats_38[i_20]) {
										i_30 = anIntArray10201[(i_14 >> 16) + i_28];
										if (i_30 != 0) {
											if (bool_1) {
												i_31 = ints_23[i_20];
												ints_23[i_20] = ((i_30 & 0xff00ff) * i_25 + (i_31 & 0xff00ff) * i_26 & -16711936) + ((i_30 & 0xff00) * i_25 + (i_31 & 0xff00) * i_26 & 0xff0000) >> 8;
											}

											if (bool_2 && bool_13)
												floats_38[i_20] = f_6;
										}
									}

									i_14 += i_18;
									++i_20;
								}

								i_15 += i_19;
								i_14 = i_24;
								i_20 += i_21;
							}
						} else {
							i_25 = (i_101 & 0xff0000) >> 16;
							i_26 = (i_101 & 0xff00) >> 8;
							i_27 = i_101 & 0xff;
							i_28 = i_101 >>> 24;
							i_29 = 256 - i_28;

							for (i_30 = -i_81; i_30 < 0; i_30++) {
								i_31 = (i_15 >> 16) * anInt8851;

								for (i_32 = -i_71; i_32 < 0; i_32++) {
									if (!bool_2 || f_6 < floats_38[i_20]) {
										i_33 = anIntArray10201[(i_14 >> 16) + i_31];
										if (i_33 != 0) {
											if (bool_1) {
												if (i_28 != 255) {
													i_34 = (i_33 & 0xff0000) * i_25 & -16777216;
													i_35 = (i_33 & 0xff00) * i_26 & 0xff0000;
													i_36 = (i_33 & 0xff) * i_27 & 0xff00;
													i_33 = (i_34 | i_35 | i_36) >>> 8;
													i_37 = ints_23[i_20];
													ints_23[i_20] = ((i_33 & 0xff00ff) * i_28 + (i_37 & 0xff00ff) * i_29 & -16711936) + ((i_33 & 0xff00) * i_28 + (i_37 & 0xff00) * i_29 & 0xff0000) >> 8;
												} else {
													i_34 = (i_33 & 0xff0000) * i_25 & -16777216;
													i_35 = (i_33 & 0xff00) * i_26 & 0xff0000;
													i_36 = (i_33 & 0xff) * i_27 & 0xff00;
													ints_23[i_20] = (i_34 | i_35 | i_36) >>> 8;
												}
											}
											if (bool_2 && bool_13)
												floats_38[i_20] = f_6;
										}
									}

									i_14 += i_18;
									++i_20;
								}

								i_15 += i_19;
								i_14 = i_24;
								i_20 += i_21;
							}
						}
					} else if (i_9 == 3) {
						i_24 = i_14;
						i_25 = i_101 >>> 24;
						i_26 = 256 - i_25;

						for (i_27 = -i_81; i_27 < 0; i_27++) {
							i_28 = (i_15 >> 16) * anInt8851;

							for (i_29 = -i_71; i_29 < 0; i_29++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									if (bool_1) {
										i_30 = anIntArray10201[(i_14 >> 16) + i_28];
										i_31 = i_30 + i_101;
										i_32 = (i_30 & 0xff00ff) + (i_101 & 0xff00ff);
										i_33 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
										i_33 = i_31 - i_33 | i_33 - (i_33 >>> 8);
										if (i_30 == 0 && i_25 != 255) {
											i_30 = i_33;
											i_33 = ints_23[i_20];
											i_33 = ((i_30 & 0xff00ff) * i_25 + (i_33 & 0xff00ff) * i_26 & -16711936) + ((i_30 & 0xff00) * i_25 + (i_33 & 0xff00) * i_26 & 0xff0000) >> 8;
										}

										ints_23[i_20] = i_33;
									}

									if (bool_2 && bool_13)
										floats_38[i_20] = f_6;
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else {
						if (i_9 != 2)
							throw new IllegalArgumentException();

						i_24 = i_101 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
						i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
						i_101 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_81; i_29 < 0; i_29++) {
							i_30 = (i_15 >> 16) * anInt8851;

							for (i_31 = -i_71; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_32 = anIntArray10201[(i_14 >> 16) + i_30];
									if (i_32 != 0) {
										if (bool_1) {
											i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
											i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
											ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_101;
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_28;
							i_20 += i_21;
						}
					}
				} else {
					if (i_11 != 2)
						throw new IllegalArgumentException();

					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * anInt8851;

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_28 = anIntArray10201[(i_14 >> 16) + i_26];
									if (i_28 != 0) {
										if (bool_1) {
											i_29 = ints_23[i_20];
											i_30 = i_28 + i_29;
											i_31 = (i_28 & 0xff00ff) + (i_29 & 0xff00ff);
											i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
											ints_23[i_20] = i_30 - i_29 | i_29 - (i_29 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 0) {
						i_24 = i_14;
						i_25 = (i_101 & 0xff0000) >> 16;
						i_26 = (i_101 & 0xff00) >> 8;
						i_27 = i_101 & 0xff;

						for (i_28 = -i_81; i_28 < 0; i_28++) {
							i_29 = (i_15 >> 16) * anInt8851;

							for (i_30 = -i_71; i_30 < 0; i_30++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_31 = anIntArray10201[(i_14 >> 16) + i_29];
									if (i_31 != 0) {
										if (bool_1) {
											i_32 = (i_31 & 0xff0000) * i_25 & -16777216;
											i_33 = (i_31 & 0xff00) * i_26 & 0xff0000;
											i_34 = (i_31 & 0xff) * i_27 & 0xff00;
											i_31 = (i_32 | i_33 | i_34) >>> 8;
											i_35 = ints_23[i_20];
											i_36 = i_31 + i_35;
											i_37 = (i_31 & 0xff00ff) + (i_35 & 0xff00ff);
											i_35 = (i_37 & 0x1000100) + (i_36 - i_37 & 0x10000);
											ints_23[i_20] = i_36 - i_35 | i_35 - (i_35 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 3) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * anInt8851;

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									if (bool_1) {
										i_28 = anIntArray10201[(i_14 >> 16) + i_26];
										i_29 = i_28 + i_101;
										i_30 = (i_28 & 0xff00ff) + (i_101 & 0xff00ff);
										i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										i_28 = i_29 - i_31 | i_31 - (i_31 >>> 8);
										i_31 = ints_23[i_20];
										i_29 = i_28 + i_31;
										i_30 = (i_28 & 0xff00ff) + (i_31 & 0xff00ff);
										i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										ints_23[i_20] = i_29 - i_31 | i_31 - (i_31 >>> 8);
									}

									if (bool_2 && bool_13)
										floats_38[i_20] = f_6;
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else {
						if (i_9 != 2)
							throw new IllegalArgumentException();

						i_24 = i_101 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
						i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
						i_101 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_81; i_29 < 0; i_29++) {
							i_30 = (i_15 >> 16) * anInt8851;

							for (i_31 = -i_71; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_32 = anIntArray10201[(i_14 >> 16) + i_30];
									if (i_32 != 0) {
										if (bool_1) {
											i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
											i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
											i_32 = ((i_26 | i_27) >>> 8) + i_101;
											i_33 = ints_23[i_20];
											i_34 = i_32 + i_33;
											i_35 = (i_32 & 0xff00ff) + (i_33 & 0xff00ff);
											i_33 = (i_35 & 0x1000100) + (i_34 - i_35 & 0x10000);
											ints_23[i_20] = i_34 - i_33 | i_33 - (i_33 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_28;
							i_20 += i_21;
						}
					}
				}
			}
		}

	}

	@Override
	void method14253(int i_1, int i_2) {
		int[] ints_3 = renderer.anIntArray8979;
		if (ints_3 != null) {
			int i_4;
			int i_5;
			int i_6;
			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (anInt8865 == 0) {
				if (anInt8868 == 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_7 >= 0 && i_6 - (anInt8851 << 12) < 0 && i_7 - (anInt8867 << 12) < 0)
							for (; i_8 < 0; i_8++) {
								i_9 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_10 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_10] = anIntArray10201[i_9];
									else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9++];
										i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
										i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
										i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9++];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_11 = anIntArray10201[i_9];
										i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
										i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_10] = ((i_12 | i_13) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0)
											ints_3[i_10] = i_11;
									} else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_12 = anInt8877 >>> 24;
												i_13 = 256 - i_12;
												i_14 = ints_3[i_10];
												ints_3[i_10] = ((i_11 & 0xff00ff) * i_12 + (i_14 & 0xff00ff) * i_13 & -16711936) + ((i_11 & 0xff00) * i_12 + (i_14 & 0xff00) * i_13 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
												i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
												i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
												i_11 = (i_12 | i_13 | i_14) >>> 8;
												i_15 = ints_3[i_10];
												ints_3[i_10] = ((i_11 & 0xff00ff) * anInt8878 + (i_15 & 0xff00ff) * anInt8879 & -16711936) + ((i_11 & 0xff00) * anInt8878 + (i_15 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
												i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
												i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
											}
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										i_15 = i_13 - i_15 | i_15 - (i_15 >>> 8);
										if (i_11 == 0 && anInt8878 != 255) {
											i_11 = i_15;
											i_15 = ints_3[i_10];
											i_15 = ((i_11 & 0xff00ff) * anInt8878 + (i_15 & 0xff00ff) * anInt8879 & -16711936) + ((i_11 & 0xff00) * anInt8878 + (i_15 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_10] = i_15;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
											i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_10++] = ((i_12 | i_13) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = ints_3[i_10];
											i_13 = i_11 + i_12;
											i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
											i_12 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
											ints_3[i_10] = i_13 - i_12 | i_12 - (i_12 >>> 8);
										}
									} else if (i_1 == 0) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff0000) * anInt8880 & -16777216;
											i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
											i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
											i_11 = (i_12 | i_13 | i_14) >>> 8;
											i_15 = ints_3[i_10];
											i_16 = i_11 + i_15;
											i_17 = (i_11 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_10] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									} else if (i_1 == 3) {
										i_11 = anIntArray10201[i_9];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										i_11 = i_13 - i_15 | i_15 - (i_15 >>> 8);
										i_15 = ints_3[i_10];
										i_13 = i_11 + i_15;
										i_14 = (i_11 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else if (i_1 == 2) {
										i_11 = anIntArray10201[i_9];
										if (i_11 != 0) {
											i_12 = (i_11 & 0xff00ff) * anInt8878 & -16711936;
											i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
											i_11 = ((i_12 | i_13) >>> 8) + anInt8885;
											i_14 = ints_3[i_10];
											i_15 = i_11 + i_14;
											i_16 = (i_11 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_10] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									}
								}
							}

						++i_4;
					}
				else if (anInt8868 < 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (anInt8851 << 12) < 0) {
							if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
								i_9 = (anInt8868 - i_9) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_7 += anInt8868;
								++i_8;
							}
						}

						++i_4;
						anInt8873 += anInt8869;
					}
				else
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (anInt8851 << 12) < 0) {
							if (i_7 < 0) {
								i_9 = (anInt8868 - 1 - i_7) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (1 + i_7 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_7 += anInt8868;
								++i_8;
							}
						}

						++i_4;
						anInt8873 += anInt8869;
					}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_7 >= 0 && i_7 - (anInt8867 << 12) < 0) {
							if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
								i_9 = (anInt8865 - i_9) / anInt8865;
								i_8 += i_9;
								i_6 += anInt8865 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
								i_8 = i_9;

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1)
										ints_3[i_11] = anIntArray10201[i_10];
									else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10++];
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10++];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											ints_3[i_11] = i_12;
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0)
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_13 = anInt8877 >>> 24;
												i_14 = 256 - i_13;
												i_15 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
											}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										if (i_12 == 0 && anInt8878 != 255) {
											i_12 = i_16;
											i_16 = ints_3[i_11];
											i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_16;
									} else {
										if (i_1 != 2)
											throw new IllegalArgumentException();

										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2)
										throw new IllegalArgumentException();

									if (i_1 == 1) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = ints_3[i_11];
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
										}
									} else if (i_1 == 0) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											i_17 = i_12 + i_16;
											i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
										}
									} else if (i_1 == 3) {
										i_12 = anIntArray10201[i_10];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
										i_16 = ints_3[i_11];
										i_14 = i_12 + i_16;
										i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else if (i_1 == 2) {
										i_12 = anIntArray10201[i_10];
										if (i_12 != 0) {
											i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
											i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
											i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
											i_15 = ints_3[i_11];
											i_16 = i_12 + i_15;
											i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
											i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
											ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
										}
									}
								}

								i_6 += anInt8865;
								++i_8;
							}
						}

						++i_4;
						anInt8874 += anInt8876;
					}
				else if (anInt8868 < 0)
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
							i_9 = (anInt8868 - i_9) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							i_7 += anInt8868;
							++i_8;
						}

						++i_4;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				else
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						if (i_7 < 0) {
							i_9 = (anInt8868 - 1 - i_7) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_7 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							i_7 += anInt8868;
							++i_8;
						}

						++i_4;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
			} else if (anInt8868 == 0)
				for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874;
					i_8 = anInt8862;
					if (i_7 >= 0 && i_7 - (anInt8867 << 12) < 0) {
						if (i_6 < 0) {
							i_9 = (anInt8865 - 1 - i_6) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_6 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
							i_8 = i_9;

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1)
									ints_3[i_11] = anIntArray10201[i_10];
								else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10++];
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10++];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										ints_3[i_11] = i_12;
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0)
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_13 = anInt8877 >>> 24;
											i_14 = 256 - i_13;
											i_15 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											i_12 = (i_13 | i_14 | i_15) >>> 8;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
											i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
											i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
										}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									if (i_12 == 0 && anInt8878 != 255) {
										i_12 = i_16;
										i_16 = ints_3[i_11];
										i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_16;
								} else {
									if (i_1 != 2)
										throw new IllegalArgumentException();

									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2)
									throw new IllegalArgumentException();

								if (i_1 == 1) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = ints_3[i_11];
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
									}
								} else if (i_1 == 0) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										i_17 = i_12 + i_16;
										i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
									}
								} else if (i_1 == 3) {
									i_12 = anIntArray10201[i_10];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
									i_16 = ints_3[i_11];
									i_14 = i_12 + i_16;
									i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else if (i_1 == 2) {
									i_12 = anIntArray10201[i_10];
									if (i_12 != 0) {
										i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
										i_15 = ints_3[i_11];
										i_16 = i_12 + i_15;
										i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
										i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
										ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
									}
								}
							}

							i_6 += anInt8865;
							++i_8;
						}
					}

					++i_4;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			else if (anInt8868 < 0)
				for (i_4 = anInt8864; i_4 < 0; i_4++) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874 + anInt8866;
					i_8 = anInt8862;
					if (i_6 < 0) {
						i_9 = (anInt8865 - 1 - i_6) / anInt8865;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_6 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
						i_8 = i_9;

					if ((i_9 = i_7 - (anInt8867 << 12)) >= 0) {
						i_9 = (anInt8868 - i_9) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8)
						i_8 = i_9;

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1)
								ints_3[i_11] = anIntArray10201[i_10];
							else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10++];
								i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									ints_3[i_11] = i_12;
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_13 = anInt8877 >>> 24;
										i_14 = 256 - i_13;
										i_15 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								if (i_12 == 0 && anInt8878 != 255) {
									i_12 = i_16;
									i_16 = ints_3[i_11];
									i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_16;
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2)
								throw new IllegalArgumentException();

							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = ints_3[i_11];
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
								}
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									i_12 = (i_13 | i_14 | i_15) >>> 8;
									i_16 = ints_3[i_11];
									i_17 = i_12 + i_16;
									i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								i_16 = ints_3[i_11];
								i_14 = i_12 + i_16;
								i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else if (i_1 == 2) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
									i_15 = ints_3[i_11];
									i_16 = i_12 + i_15;
									i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
									i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
									ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
								}
							}
						}

						i_6 += anInt8865;
						i_7 += anInt8868;
						++i_8;
					}

					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403;
				}
			else
				for (i_4 = anInt8864; i_4 < 0; i_4++) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874 + anInt8866;
					i_8 = anInt8862;
					if (i_6 < 0) {
						i_9 = (anInt8865 - 1 - i_6) / anInt8865;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_6 - (anInt8851 << 12) - anInt8865) / anInt8865) > i_8)
						i_8 = i_9;

					if (i_7 < 0) {
						i_9 = (anInt8868 - 1 - i_7) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_7 - (anInt8867 << 12) - anInt8868) / anInt8868) > i_8)
						i_8 = i_9;

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1)
								ints_3[i_11] = anIntArray10201[i_10];
							else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10++];
								i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10++];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									ints_3[i_11] = i_12;
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0)
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_13 = anInt8877 >>> 24;
										i_14 = 256 - i_13;
										i_15 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & -16711936) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										i_12 = (i_13 | i_14 | i_15) >>> 8;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								if (i_12 == 0 && anInt8878 != 255) {
									i_12 = i_16;
									i_16 = ints_3[i_11];
									i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & -16711936) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_16;
							} else {
								if (i_1 != 2)
									throw new IllegalArgumentException();

								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2)
								throw new IllegalArgumentException();

							if (i_1 == 1) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = ints_3[i_11];
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_13 | i_13 - (i_13 >>> 8);
								}
							} else if (i_1 == 0) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff0000) * anInt8880 & -16777216;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									i_12 = (i_13 | i_14 | i_15) >>> 8;
									i_16 = ints_3[i_11];
									i_17 = i_12 + i_16;
									i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
								}
							} else if (i_1 == 3) {
								i_12 = anIntArray10201[i_10];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								i_12 = i_14 - i_16 | i_16 - (i_16 >>> 8);
								i_16 = ints_3[i_11];
								i_14 = i_12 + i_16;
								i_15 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else if (i_1 == 2) {
								i_12 = anIntArray10201[i_10];
								if (i_12 != 0) {
									i_13 = (i_12 & 0xff00ff) * anInt8878 & -16711936;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
									i_15 = ints_3[i_11];
									i_16 = i_12 + i_15;
									i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
									i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
									ints_3[i_11] = i_16 - i_15 | i_15 - (i_15 >>> 8);
								}
							}
						}

						i_6 += anInt8865;
						i_7 += anInt8868;
						++i_8;
					}

					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
					anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403;
				}
		}

	}

	@Override
	void method14255(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, boolean bool_13) {
		int i_71 = i_7;
		int i_81 = i_8;
		int i_101 = i_10;
		if (i_71 > 0 && i_81 > 0 && (bool_1 || bool_2)) {
			int i_14 = 0;
			int i_15 = 0;
			int i_16 = anInt8853 + anInt8851 + anInt8855;
			int i_17 = anInt8854 + anInt8867 + anInt8856;
			int i_18 = (i_16 << 16) / i_71;
			int i_19 = (i_17 << 16) / i_81;
			int i_20;
			if (anInt8853 > 0) {
				i_20 = ((anInt8853 << 16) + i_18 - 1) / i_18;
				i_4 += i_20;
				i_14 += i_20 * i_18 - (anInt8853 << 16);
			}

			if (anInt8854 > 0) {
				i_20 = ((anInt8854 << 16) + i_19 - 1) / i_19;
				i_5 += i_20;
				i_15 += i_20 * i_19 - (anInt8854 << 16);
			}

			if (anInt8851 < i_16)
				i_71 = ((anInt8851 << 16) - i_14 + i_18 - 1) / i_18;

			if (anInt8867 < i_17)
				i_81 = ((anInt8867 << 16) - i_15 + i_19 - 1) / i_19;

			i_20 = i_4 + i_5 * renderer.width * 299731099 * 444800403;
			int i_21 = renderer.width * 299731099 * 444800403 - i_71;
			if (i_5 + i_81 > renderer.anInt8986 * 760194793 * 1383960921)
				i_81 -= i_5 + i_81 - renderer.anInt8986 * 760194793 * 1383960921;

			int i_22;
			if (i_5 < renderer.anInt9009 * 1457972577 * 1516535457) {
				i_22 = renderer.anInt9009 * 1457972577 * 1516535457 - i_5;
				i_81 -= i_22;
				i_20 += i_22 * renderer.width * 299731099 * 444800403;
				i_15 += i_19 * i_22;
			}

			if (i_4 + i_71 > renderer.anInt9002 * 1714763515 * -1710988237) {
				i_22 = i_4 + i_71 - renderer.anInt9002 * 1714763515 * -1710988237;
				i_71 -= i_22;
				i_21 += i_22;
			}

			if (i_4 < renderer.anInt8983 * -363774331 * 72550989) {
				i_22 = renderer.anInt8983 * -363774331 * 72550989 - i_4;
				i_71 -= i_22;
				i_20 += i_22;
				i_14 += i_18 * i_22;
				i_21 += i_22;
			}

			float[] floats_38 = renderer.aFloatArray9010;
			int[] ints_23 = renderer.anIntArray8979;
			int i_24;
			int i_25;
			int i_26;
			int i_27;
			int i_28;
			int i_29;
			int i_30;
			int i_31;
			int i_32;
			int i_33;
			int i_34;
			if (i_11 == 0) {
				if (i_9 == 1) {
					i_24 = i_14;

					for (i_25 = -i_81; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * anInt8851;

						for (i_27 = -i_71; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_38[i_20]) {
								if (bool_1)
									ints_23[i_20] = anIntArray10201[(i_14 >> 16) + i_26];

								if (bool_2 && bool_13)
									floats_38[i_20] = f_6;
							}

							i_14 += i_18;
							++i_20;
						}

						i_15 += i_19;
						i_14 = i_24;
						i_20 += i_21;
					}
				} else if (i_9 == 0) {
					i_24 = (i_101 & 0xff0000) >> 16;
				i_25 = (i_101 & 0xff00) >> 8;
				i_26 = i_101 & 0xff;
				i_27 = i_14;

				for (i_28 = -i_81; i_28 < 0; i_28++) {
					i_29 = (i_15 >> 16) * anInt8851;

					for (i_30 = -i_71; i_30 < 0; i_30++) {
						if (!bool_2 || f_6 < floats_38[i_20]) {
							if (bool_1) {
								i_31 = anIntArray10201[(i_14 >> 16) + i_29];
								i_32 = (i_31 & 0xff0000) * i_24 & -16777216;
								i_33 = (i_31 & 0xff00) * i_25 & 0xff0000;
								i_34 = (i_31 & 0xff) * i_26 & 0xff00;
								ints_23[i_20] = (i_32 | i_33 | i_34) >>> 8;
							}

							if (bool_2 && bool_13)
								floats_38[i_20] = f_6;
						}

						i_14 += i_18;
						++i_20;
					}

					i_15 += i_19;
					i_14 = i_27;
					i_20 += i_21;
				}
				} else if (i_9 == 3) {
					i_24 = i_14;

					for (i_25 = -i_81; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * anInt8851;

						for (i_27 = -i_71; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_38[i_20]) {
								if (bool_1) {
									i_28 = anIntArray10201[(i_14 >> 16) + i_26];
									i_29 = i_28 + i_101;
									i_30 = (i_28 & 0xff00ff) + (i_101 & 0xff00ff);
									i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
									ints_23[i_20] = i_29 - i_31 | i_31 - (i_31 >>> 8);
								}

								if (bool_2 && bool_13)
									floats_38[i_20] = f_6;
							}

							i_14 += i_18;
							++i_20;
						}

						i_15 += i_19;
						i_14 = i_24;
						i_20 += i_21;
					}
				} else {
					if (i_9 != 2)
						throw new IllegalArgumentException();

					i_24 = i_101 >>> 24;
			i_25 = 256 - i_24;
			i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
			i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
			i_101 = (i_26 | i_27) >>> 8;
			i_28 = i_14;

			for (i_29 = -i_81; i_29 < 0; i_29++) {
				i_30 = (i_15 >> 16) * anInt8851;

				for (i_31 = -i_71; i_31 < 0; i_31++) {
					if (!bool_2 || f_6 < floats_38[i_20]) {
						if (bool_1) {
							i_32 = anIntArray10201[(i_14 >> 16) + i_30];
							i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
							i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
							ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_101;
						}

						if (bool_2 && bool_13)
							floats_38[i_20] = f_6;
					}

					i_14 += i_18;
					++i_20;
				}

				i_15 += i_19;
				i_14 = i_28;
				i_20 += i_21;
			}
				}
			} else {
				int i_35;
				int i_36;
				int i_37;
				if (i_11 == 1) {
					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * anInt8851;

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_28 = anIntArray10201[(i_14 >> 16) + i_26];
									if (i_28 != 0) {
										if (bool_1)
											ints_23[i_20] = i_28;

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 0) {
						i_24 = i_14;
						if ((i_101 & 0xffffff) == 16777215) {
							i_25 = i_101 >>> 24;
							i_26 = 256 - i_25;

							for (i_27 = -i_81; i_27 < 0; i_27++) {
								i_28 = (i_15 >> 16) * anInt8851;

								for (i_29 = -i_71; i_29 < 0; i_29++) {
									if (!bool_2 || f_6 < floats_38[i_20]) {
										i_30 = anIntArray10201[(i_14 >> 16) + i_28];
										if (i_30 != 0) {
											if (bool_1) {
												i_31 = ints_23[i_20];
												ints_23[i_20] = ((i_30 & 0xff00ff) * i_25 + (i_31 & 0xff00ff) * i_26 & -16711936) + ((i_30 & 0xff00) * i_25 + (i_31 & 0xff00) * i_26 & 0xff0000) >> 8;
											}

											if (bool_2 && bool_13)
												floats_38[i_20] = f_6;
										}
									}

									i_14 += i_18;
									++i_20;
								}

								i_15 += i_19;
								i_14 = i_24;
								i_20 += i_21;
							}
						} else {
							i_25 = (i_101 & 0xff0000) >> 16;
							i_26 = (i_101 & 0xff00) >> 8;
							i_27 = i_101 & 0xff;
							i_28 = i_101 >>> 24;
							i_29 = 256 - i_28;

							for (i_30 = -i_81; i_30 < 0; i_30++) {
								i_31 = (i_15 >> 16) * anInt8851;

								for (i_32 = -i_71; i_32 < 0; i_32++) {
									if (!bool_2 || f_6 < floats_38[i_20]) {
										i_33 = anIntArray10201[(i_14 >> 16) + i_31];
										if (i_33 != 0) {
											if (bool_1) {
												if (i_28 != 255) {
													i_34 = (i_33 & 0xff0000) * i_25 & -16777216;
													i_35 = (i_33 & 0xff00) * i_26 & 0xff0000;
													i_36 = (i_33 & 0xff) * i_27 & 0xff00;
													i_33 = (i_34 | i_35 | i_36) >>> 8;
													i_37 = ints_23[i_20];
													ints_23[i_20] = ((i_33 & 0xff00ff) * i_28 + (i_37 & 0xff00ff) * i_29 & -16711936) + ((i_33 & 0xff00) * i_28 + (i_37 & 0xff00) * i_29 & 0xff0000) >> 8;
												} else {
													i_34 = (i_33 & 0xff0000) * i_25 & -16777216;
													i_35 = (i_33 & 0xff00) * i_26 & 0xff0000;
													i_36 = (i_33 & 0xff) * i_27 & 0xff00;
													ints_23[i_20] = (i_34 | i_35 | i_36) >>> 8;
												}
											}
											if (bool_2 && bool_13)
												floats_38[i_20] = f_6;
										}
									}

									i_14 += i_18;
									++i_20;
								}

								i_15 += i_19;
								i_14 = i_24;
								i_20 += i_21;
							}
						}
					} else if (i_9 == 3) {
						i_24 = i_14;
						i_25 = i_101 >>> 24;
						i_26 = 256 - i_25;

						for (i_27 = -i_81; i_27 < 0; i_27++) {
							i_28 = (i_15 >> 16) * anInt8851;

							for (i_29 = -i_71; i_29 < 0; i_29++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									if (bool_1) {
										i_30 = anIntArray10201[(i_14 >> 16) + i_28];
										i_31 = i_30 + i_101;
										i_32 = (i_30 & 0xff00ff) + (i_101 & 0xff00ff);
										i_33 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
										i_33 = i_31 - i_33 | i_33 - (i_33 >>> 8);
										if (i_30 == 0 && i_25 != 255) {
											i_30 = i_33;
											i_33 = ints_23[i_20];
											i_33 = ((i_30 & 0xff00ff) * i_25 + (i_33 & 0xff00ff) * i_26 & -16711936) + ((i_30 & 0xff00) * i_25 + (i_33 & 0xff00) * i_26 & 0xff0000) >> 8;
										}

										ints_23[i_20] = i_33;
									}

									if (bool_2 && bool_13)
										floats_38[i_20] = f_6;
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else {
						if (i_9 != 2)
							throw new IllegalArgumentException();

						i_24 = i_101 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
						i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
						i_101 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_81; i_29 < 0; i_29++) {
							i_30 = (i_15 >> 16) * anInt8851;

							for (i_31 = -i_71; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_32 = anIntArray10201[(i_14 >> 16) + i_30];
									if (i_32 != 0) {
										if (bool_1) {
											i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
											i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
											ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_101;
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_28;
							i_20 += i_21;
						}
					}
				} else {
					if (i_11 != 2)
						throw new IllegalArgumentException();

					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * anInt8851;

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_28 = anIntArray10201[(i_14 >> 16) + i_26];
									if (i_28 != 0) {
										if (bool_1) {
											i_29 = ints_23[i_20];
											i_30 = i_28 + i_29;
											i_31 = (i_28 & 0xff00ff) + (i_29 & 0xff00ff);
											i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
											ints_23[i_20] = i_30 - i_29 | i_29 - (i_29 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 0) {
						i_24 = i_14;
						i_25 = (i_101 & 0xff0000) >> 16;
						i_26 = (i_101 & 0xff00) >> 8;
						i_27 = i_101 & 0xff;

						for (i_28 = -i_81; i_28 < 0; i_28++) {
							i_29 = (i_15 >> 16) * anInt8851;

							for (i_30 = -i_71; i_30 < 0; i_30++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_31 = anIntArray10201[(i_14 >> 16) + i_29];
									if (i_31 != 0) {
										if (bool_1) {
											i_32 = (i_31 & 0xff0000) * i_25 & -16777216;
											i_33 = (i_31 & 0xff00) * i_26 & 0xff0000;
											i_34 = (i_31 & 0xff) * i_27 & 0xff00;
											i_31 = (i_32 | i_33 | i_34) >>> 8;
											i_35 = ints_23[i_20];
											i_36 = i_31 + i_35;
											i_37 = (i_31 & 0xff00ff) + (i_35 & 0xff00ff);
											i_35 = (i_37 & 0x1000100) + (i_36 - i_37 & 0x10000);
											ints_23[i_20] = i_36 - i_35 | i_35 - (i_35 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else if (i_9 == 3) {
						i_24 = i_14;

						for (i_25 = -i_81; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * anInt8851;

							for (i_27 = -i_71; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									if (bool_1) {
										i_28 = anIntArray10201[(i_14 >> 16) + i_26];
										i_29 = i_28 + i_101;
										i_30 = (i_28 & 0xff00ff) + (i_101 & 0xff00ff);
										i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										i_28 = i_29 - i_31 | i_31 - (i_31 >>> 8);
										i_31 = ints_23[i_20];
										i_29 = i_28 + i_31;
										i_30 = (i_28 & 0xff00ff) + (i_31 & 0xff00ff);
										i_31 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										ints_23[i_20] = i_29 - i_31 | i_31 - (i_31 >>> 8);
									}

									if (bool_2 && bool_13)
										floats_38[i_20] = f_6;
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_24;
							i_20 += i_21;
						}
					} else {
						if (i_9 != 2)
							throw new IllegalArgumentException();

						i_24 = i_101 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_101 & 0xff00ff) * i_25 & -16711936;
						i_27 = (i_101 & 0xff00) * i_25 & 0xff0000;
						i_101 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_81; i_29 < 0; i_29++) {
							i_30 = (i_15 >> 16) * anInt8851;

							for (i_31 = -i_71; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_38[i_20]) {
									i_32 = anIntArray10201[(i_14 >> 16) + i_30];
									if (i_32 != 0) {
										if (bool_1) {
											i_26 = (i_32 & 0xff00ff) * i_24 & -16711936;
											i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
											i_32 = ((i_26 | i_27) >>> 8) + i_101;
											i_33 = ints_23[i_20];
											i_34 = i_32 + i_33;
											i_35 = (i_32 & 0xff00ff) + (i_33 & 0xff00ff);
											i_33 = (i_35 & 0x1000100) + (i_34 - i_35 & 0x10000);
											ints_23[i_20] = i_34 - i_33 | i_33 - (i_33 >>> 8);
										}

										if (bool_2 && bool_13)
											floats_38[i_20] = f_6;
									}
								}

								i_14 += i_18;
								++i_20;
							}

							i_15 += i_19;
							i_14 = i_28;
							i_20 += i_21;
						}
					}
				}
			}
		}

	}

	@Override
	public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_26 = i_2;
		int i_110 = i_1;
		int i_41 = i_4;
		if (renderer.method14408())
			throw new IllegalStateException();
		int[] ints_6 = renderer.anIntArray8979;
		if (ints_6 != null) {
			int i_7 = renderer.width;
			i_110 += anInt8853;
			i_26 += anInt8854;
			int i_8 = i_7 * i_26 + i_110;
			int i_9 = 0;
			int i_10 = anInt8867;
			int i_11 = anInt8851;
			int i_12 = i_7 - i_11;
			int i_13 = 0;
			int i_14;
			if (i_26 < renderer.anInt9009) {
				i_14 = renderer.anInt9009 - i_26;
				i_10 -= i_14;
				i_26 = renderer.anInt9009;
				i_9 += i_14 * i_11;
				i_8 += i_14 * i_7;
			}

			if (i_10 + i_26 > renderer.anInt8986)
				i_10 -= i_10 + i_26 - renderer.anInt8986;

			if (i_110 < renderer.anInt8983) {
				i_14 = renderer.anInt8983 - i_110;
				i_11 -= i_14;
				i_110 = renderer.anInt8983;
				i_9 += i_14;
				i_8 += i_14;
				i_13 += i_14;
				i_12 += i_14;
			}

			if (i_11 + i_110 > renderer.anInt9002) {
				i_14 = i_11 + i_110 - renderer.anInt9002;
				i_11 -= i_14;
				i_13 += i_14;
				i_12 += i_14;
			}

			if (i_11 > 0 && i_10 > 0) {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				if (i_5 == 0) {
					if (i_3 == 1)
						for (i_14 = -i_10; i_14 < 0; i_14++) {
							for (i_15 = i_8 + i_11 - 3; i_8 < i_15; ints_6[i_8++] = anIntArray10201[i_9++]) {
								ints_6[i_8++] = anIntArray10201[i_9++];
								ints_6[i_8++] = anIntArray10201[i_9++];
								ints_6[i_8++] = anIntArray10201[i_9++];
							}

							for (i_15 += 3; i_8 < i_15; ints_6[i_8++] = anIntArray10201[i_9++]) {
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					else if (i_3 == 0) {
						i_14 = (i_41 & 0xff0000) >> 16;
							i_15 = (i_41 & 0xff00) >> 8;
						i_16 = i_41 & 0xff;

						for (i_17 = -i_10; i_17 < 0; i_17++) {
							for (i_18 = -i_11; i_18 < 0; i_18++) {
								i_19 = anIntArray10201[i_9++];
								i_20 = i_14 * (i_19 & 0xff0000) & -16777216;
								i_21 = i_15 * (i_19 & 0xff00) & 0xff0000;
								i_22 = (i_19 & 0xff) * i_16 & 0xff00;
								ints_6[i_8++] = (i_20 | i_21 | i_22) >>> 8;
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					} else if (i_3 == 3)
						for (i_14 = -i_10; i_14 < 0; i_14++) {
							for (i_15 = -i_11; i_15 < 0; i_15++) {
								i_16 = anIntArray10201[i_9++];
								i_17 = i_16 + i_41;
								i_18 = (i_16 & 0xff00ff) + (i_41 & 0xff00ff);
								i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					else {
						if (i_3 != 2)
							throw new IllegalArgumentException();

						i_14 = i_41 >>> 24;
						i_15 = 256 - i_14;
						i_16 = i_15 * (i_41 & 0xff00ff) & -16711936;
						i_17 = i_15 * (i_41 & 0xff00) & 0xff0000;
						i_41 = (i_16 | i_17) >>> 8;

						for (i_18 = -i_10; i_18 < 0; i_18++) {
							for (i_19 = -i_11; i_19 < 0; i_19++) {
								i_20 = anIntArray10201[i_9++];
								i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
								i_17 = i_14 * (i_20 & 0xff00) & 0xff0000;
								ints_6[i_8++] = i_41 + ((i_16 | i_17) >>> 8);
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					}
				} else {
					int i_23;
					int i_24;
					int i_25;
					if (i_5 == 1) {
						if (i_3 == 1)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								i_15 = i_8 + i_11 - 3;

								while (i_8 < i_15) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;
								}

								i_15 += 3;

								while (i_8 < i_15) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else if (i_3 == 0) {
							if ((i_41 & 0xffffff) == 16777215) {
								i_14 = i_41 >>> 24;
								i_15 = 256 - i_14;

								for (i_16 = -i_10; i_16 < 0; i_16++) {
									for (i_17 = -i_11; i_17 < 0; i_17++) {
										i_18 = anIntArray10201[i_9++];
										if (i_18 != 0) {
											i_19 = ints_6[i_8];
											ints_6[i_8++] = ((i_18 & 0xff00ff) * i_14 + (i_19 & 0xff00ff) * i_15 & -16711936) + (i_14 * (i_18 & 0xff00) + i_15 * (i_19 & 0xff00) & 0xff0000) >> 8;
										} else
											++i_8;
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								i_14 = (i_41 & 0xff0000) >> 16;
								i_15 = (i_41 & 0xff00) >> 8;
								i_16 = i_41 & 0xff;
								i_17 = i_41 >>> 24;
								i_18 = 256 - i_17;

								for (i_19 = -i_10; i_19 < 0; i_19++) {
									for (i_20 = -i_11; i_20 < 0; i_20++) {
										i_21 = anIntArray10201[i_9++];
										if (i_21 != 0) {
											if (i_17 != 255) {
												i_22 = i_14 * (i_21 & 0xff0000) & -16777216;
												i_23 = i_15 * (i_21 & 0xff00) & 0xff0000;
												i_24 = (i_21 & 0xff) * i_16 & 0xff00;
												i_21 = (i_22 | i_23 | i_24) >>> 8;
								i_25 = ints_6[i_8];
								ints_6[i_8++] = ((i_21 & 0xff00ff) * i_17 + (i_25 & 0xff00ff) * i_18 & -16711936) + (i_17 * (i_21 & 0xff00) + i_18 * (i_25 & 0xff00) & 0xff0000) >> 8;
											} else {
												i_22 = i_14 * (i_21 & 0xff0000) & -16777216;
												i_23 = i_15 * (i_21 & 0xff00) & 0xff0000;
												i_24 = (i_21 & 0xff) * i_16 & 0xff00;
												ints_6[i_8++] = (i_22 | i_23 | i_24) >>> 8;
											}
										} else
											++i_8;
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							}
						} else if (i_3 == 3) {
							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;

							for (i_16 = -i_10; i_16 < 0; i_16++) {
								for (i_17 = -i_11; i_17 < 0; i_17++) {
									i_18 = anIntArray10201[i_9++];
									i_19 = i_18 + i_41;
									i_20 = (i_18 & 0xff00ff) + (i_41 & 0xff00ff);
									i_21 = (i_20 & 0x1000100) + (i_19 - i_20 & 0x10000);
									i_21 = i_19 - i_21 | i_21 - (i_21 >>> 8);
									if (i_18 == 0 && i_14 != 255) {
										i_18 = i_21;
										i_21 = ints_6[i_8];
										i_21 = ((i_18 & 0xff00ff) * i_14 + (i_21 & 0xff00ff) * i_15 & -16711936) + (i_14 * (i_18 & 0xff00) + i_15 * (i_21 & 0xff00) & 0xff0000) >> 8;
									}

									ints_6[i_8++] = i_21;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else {
							if (i_3 != 2)
								throw new IllegalArgumentException();

							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;
							i_16 = i_15 * (i_41 & 0xff00ff) & -16711936;
							i_17 = i_15 * (i_41 & 0xff00) & 0xff0000;
							i_41 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = anIntArray10201[i_9++];
									if (i_20 != 0) {
										i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
										i_17 = i_14 * (i_20 & 0xff00) & 0xff0000;
										ints_6[i_8++] = i_41 + ((i_16 | i_17) >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					} else {
						if (i_5 != 2)
							throw new IllegalArgumentException();

						if (i_3 == 1)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0) {
										i_17 = ints_6[i_8];
										i_18 = i_16 + i_17;
										i_19 = (i_16 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_6[i_8++] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else if (i_3 == 0) {
							i_14 = (i_41 & 0xff0000) >> 16;
							i_15 = (i_41 & 0xff00) >> 8;
							i_16 = i_41 & 0xff;

							for (i_17 = -i_10; i_17 < 0; i_17++) {
								for (i_18 = -i_11; i_18 < 0; i_18++) {
									i_19 = anIntArray10201[i_9++];
									if (i_19 != 0) {
										i_20 = i_14 * (i_19 & 0xff0000) & -16777216;
										i_21 = i_15 * (i_19 & 0xff00) & 0xff0000;
										i_22 = (i_19 & 0xff) * i_16 & 0xff00;
										i_19 = (i_20 | i_21 | i_22) >>> 8;
							i_23 = ints_6[i_8];
							i_24 = i_19 + i_23;
							i_25 = (i_19 & 0xff00ff) + (i_23 & 0xff00ff);
							i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
							ints_6[i_8++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 3)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = anIntArray10201[i_9++];
									i_17 = i_16 + i_41;
									i_18 = (i_16 & 0xff00ff) + (i_41 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									i_16 = i_17 - i_19 | i_19 - (i_19 >>> 8);
									i_19 = ints_6[i_8];
									i_17 = i_16 + i_19;
									i_18 = (i_16 & 0xff00ff) + (i_19 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else {
							if (i_3 != 2)
								throw new IllegalArgumentException();

							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;
							i_16 = i_15 * (i_41 & 0xff00ff) & -16711936;
							i_17 = i_15 * (i_41 & 0xff00) & 0xff0000;
							i_41 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = anIntArray10201[i_9++];
									if (i_20 != 0) {
										i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
										i_17 = i_14 * (i_20 & 0xff00) & 0xff0000;
										i_20 = i_41 + ((i_16 | i_17) >>> 8);
										i_21 = ints_6[i_8];
										i_22 = i_20 + i_21;
										i_23 = (i_20 & 0xff00ff) + (i_21 & 0xff00ff);
										i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
										ints_6[i_8++] = i_22 - i_21 | i_21 - (i_21 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_26 = i_2;
		int i_110 = i_1;
		int i_41 = i_4;
		if (renderer.method14408())
			throw new IllegalStateException();
		int[] ints_6 = renderer.anIntArray8979;
		if (ints_6 != null) {
			int i_7 = renderer.width * 299731099 * 444800403;
			i_110 += anInt8853;
			i_26 += anInt8854;
			int i_8 = i_26 * i_7 + i_110;
			int i_9 = 0;
			int i_10 = anInt8867;
			int i_11 = anInt8851;
			int i_12 = i_7 - i_11;
			int i_13 = 0;
			int i_14;
			if (i_26 < renderer.anInt9009 * 1457972577 * 1516535457) {
				i_14 = renderer.anInt9009 * 1457972577 * 1516535457 - i_26;
				i_10 -= i_14;
				i_26 = renderer.anInt9009 * 1457972577 * 1516535457;
				i_9 += i_14 * i_11;
				i_8 += i_14 * i_7;
			}

			if (i_26 + i_10 > renderer.anInt8986 * 760194793 * 1383960921)
				i_10 -= i_26 + i_10 - renderer.anInt8986 * 760194793 * 1383960921;

			if (i_110 < renderer.anInt8983 * -363774331 * 72550989) {
				i_14 = renderer.anInt8983 * -363774331 * 72550989 - i_110;
				i_11 -= i_14;
				i_110 = renderer.anInt8983 * -363774331 * 72550989;
				i_9 += i_14;
				i_8 += i_14;
				i_13 += i_14;
				i_12 += i_14;
			}

			if (i_110 + i_11 > renderer.anInt9002 * 1714763515 * -1710988237) {
				i_14 = i_110 + i_11 - renderer.anInt9002 * 1714763515 * -1710988237;
				i_11 -= i_14;
				i_13 += i_14;
				i_12 += i_14;
			}

			if (i_11 > 0 && i_10 > 0) {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				if (i_5 == 0) {
					if (i_3 == 1)
						for (i_14 = -i_10; i_14 < 0; i_14++) {
							for (i_15 = i_8 + i_11 - 3; i_8 < i_15; ints_6[i_8++] = anIntArray10201[i_9++]) {
								ints_6[i_8++] = anIntArray10201[i_9++];
								ints_6[i_8++] = anIntArray10201[i_9++];
								ints_6[i_8++] = anIntArray10201[i_9++];
							}

							for (i_15 += 3; i_8 < i_15; ints_6[i_8++] = anIntArray10201[i_9++]) {
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					else if (i_3 == 0) {
						i_14 = (i_41 & 0xff0000) >> 16;
							i_15 = (i_41 & 0xff00) >> 8;
						i_16 = i_41 & 0xff;

						for (i_17 = -i_10; i_17 < 0; i_17++) {
							for (i_18 = -i_11; i_18 < 0; i_18++) {
								i_19 = anIntArray10201[i_9++];
								i_20 = (i_19 & 0xff0000) * i_14 & -16777216;
								i_21 = (i_19 & 0xff00) * i_15 & 0xff0000;
								i_22 = (i_19 & 0xff) * i_16 & 0xff00;
								ints_6[i_8++] = (i_20 | i_21 | i_22) >>> 8;
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					} else if (i_3 == 3)
						for (i_14 = -i_10; i_14 < 0; i_14++) {
							for (i_15 = -i_11; i_15 < 0; i_15++) {
								i_16 = anIntArray10201[i_9++];
								i_17 = i_16 + i_41;
								i_18 = (i_16 & 0xff00ff) + (i_41 & 0xff00ff);
								i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					else {
						if (i_3 != 2)
							throw new IllegalArgumentException();

						i_14 = i_41 >>> 24;
						i_15 = 256 - i_14;
						i_16 = (i_41 & 0xff00ff) * i_15 & -16711936;
						i_17 = (i_41 & 0xff00) * i_15 & 0xff0000;
						i_41 = (i_16 | i_17) >>> 8;

						for (i_18 = -i_10; i_18 < 0; i_18++) {
							for (i_19 = -i_11; i_19 < 0; i_19++) {
								i_20 = anIntArray10201[i_9++];
								i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
								i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
								ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_41;
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					}
				} else {
					int i_23;
					int i_24;
					int i_25;
					if (i_5 == 1) {
						if (i_3 == 1)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								i_15 = i_8 + i_11 - 3;

								while (i_8 < i_15) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;
								}

								i_15 += 3;

								while (i_8 < i_15) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else if (i_3 == 0) {
							if ((i_41 & 0xffffff) == 16777215) {
								i_14 = i_41 >>> 24;
								i_15 = 256 - i_14;

								for (i_16 = -i_10; i_16 < 0; i_16++) {
									for (i_17 = -i_11; i_17 < 0; i_17++) {
										i_18 = anIntArray10201[i_9++];
										if (i_18 != 0) {
											i_19 = ints_6[i_8];
											ints_6[i_8++] = ((i_18 & 0xff00ff) * i_14 + (i_19 & 0xff00ff) * i_15 & -16711936) + ((i_18 & 0xff00) * i_14 + (i_19 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else
											++i_8;
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								i_14 = (i_41 & 0xff0000) >> 16;
								i_15 = (i_41 & 0xff00) >> 8;
								i_16 = i_41 & 0xff;
								i_17 = i_41 >>> 24;
								i_18 = 256 - i_17;

								for (i_19 = -i_10; i_19 < 0; i_19++) {
									for (i_20 = -i_11; i_20 < 0; i_20++) {
										i_21 = anIntArray10201[i_9++];
										if (i_21 != 0) {
											if (i_17 != 255) {
												i_22 = (i_21 & 0xff0000) * i_14 & -16777216;
												i_23 = (i_21 & 0xff00) * i_15 & 0xff0000;
												i_24 = (i_21 & 0xff) * i_16 & 0xff00;
												i_21 = (i_22 | i_23 | i_24) >>> 8;
								i_25 = ints_6[i_8];
								ints_6[i_8++] = ((i_21 & 0xff00ff) * i_17 + (i_25 & 0xff00ff) * i_18 & -16711936) + ((i_21 & 0xff00) * i_17 + (i_25 & 0xff00) * i_18 & 0xff0000) >> 8;
											} else {
												i_22 = (i_21 & 0xff0000) * i_14 & -16777216;
												i_23 = (i_21 & 0xff00) * i_15 & 0xff0000;
												i_24 = (i_21 & 0xff) * i_16 & 0xff00;
												ints_6[i_8++] = (i_22 | i_23 | i_24) >>> 8;
											}
										} else
											++i_8;
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							}
						} else if (i_3 == 3) {
							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;

							for (i_16 = -i_10; i_16 < 0; i_16++) {
								for (i_17 = -i_11; i_17 < 0; i_17++) {
									i_18 = anIntArray10201[i_9++];
									i_19 = i_18 + i_41;
									i_20 = (i_18 & 0xff00ff) + (i_41 & 0xff00ff);
									i_21 = (i_20 & 0x1000100) + (i_19 - i_20 & 0x10000);
									i_21 = i_19 - i_21 | i_21 - (i_21 >>> 8);
									if (i_18 == 0 && i_14 != 255) {
										i_18 = i_21;
										i_21 = ints_6[i_8];
										i_21 = ((i_18 & 0xff00ff) * i_14 + (i_21 & 0xff00ff) * i_15 & -16711936) + ((i_18 & 0xff00) * i_14 + (i_21 & 0xff00) * i_15 & 0xff0000) >> 8;
									}

									ints_6[i_8++] = i_21;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else {
							if (i_3 != 2)
								throw new IllegalArgumentException();

							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;
							i_16 = (i_41 & 0xff00ff) * i_15 & -16711936;
							i_17 = (i_41 & 0xff00) * i_15 & 0xff0000;
							i_41 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = anIntArray10201[i_9++];
									if (i_20 != 0) {
										i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
										i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
										ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_41;
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					} else {
						if (i_5 != 2)
							throw new IllegalArgumentException();

						if (i_3 == 1)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0) {
										i_17 = ints_6[i_8];
										i_18 = i_16 + i_17;
										i_19 = (i_16 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_6[i_8++] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else if (i_3 == 0) {
							i_14 = (i_41 & 0xff0000) >> 16;
							i_15 = (i_41 & 0xff00) >> 8;
							i_16 = i_41 & 0xff;

							for (i_17 = -i_10; i_17 < 0; i_17++) {
								for (i_18 = -i_11; i_18 < 0; i_18++) {
									i_19 = anIntArray10201[i_9++];
									if (i_19 != 0) {
										i_20 = (i_19 & 0xff0000) * i_14 & -16777216;
										i_21 = (i_19 & 0xff00) * i_15 & 0xff0000;
										i_22 = (i_19 & 0xff) * i_16 & 0xff00;
										i_19 = (i_20 | i_21 | i_22) >>> 8;
							i_23 = ints_6[i_8];
							i_24 = i_19 + i_23;
							i_25 = (i_19 & 0xff00ff) + (i_23 & 0xff00ff);
							i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
							ints_6[i_8++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 3)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = anIntArray10201[i_9++];
									i_17 = i_16 + i_41;
									i_18 = (i_16 & 0xff00ff) + (i_41 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									i_16 = i_17 - i_19 | i_19 - (i_19 >>> 8);
									i_19 = ints_6[i_8];
									i_17 = i_16 + i_19;
									i_18 = (i_16 & 0xff00ff) + (i_19 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else {
							if (i_3 != 2)
								throw new IllegalArgumentException();

							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;
							i_16 = (i_41 & 0xff00ff) * i_15 & -16711936;
							i_17 = (i_41 & 0xff00) * i_15 & 0xff0000;
							i_41 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = anIntArray10201[i_9++];
									if (i_20 != 0) {
										i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
										i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
										i_20 = ((i_16 | i_17) >>> 8) + i_41;
										i_21 = ints_6[i_8];
										i_22 = i_20 + i_21;
										i_23 = (i_20 & 0xff00ff) + (i_21 & 0xff00ff);
										i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
										ints_6[i_8++] = i_22 - i_21 | i_21 - (i_21 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = renderer.anIntArray8979;
		if (ints_7 == null)
			throw new IllegalStateException("");
		for (int i_8 = 0; i_8 < i_4; i_8++) {
			int i_9 = (i_8 + i_2) * anInt8851 + i_1;
			int i_10 = (i_8 + i_6) * renderer.width + i_5;

			if (i_3 >= 0) System.arraycopy(ints_7, i_10, anIntArray10201, i_9, i_3);
		}
	}

	@Override
	public void method2751() {
		throw new IllegalStateException("");
	}

	@Override
	void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_33 = i_3;
		int i_41 = i_4;
		int i_61 = i_6;
		if (renderer.method14408())
			throw new IllegalStateException();
		if (i_33 > 0 && i_41 > 0) {
			int[] ints_9 = renderer.anIntArray8979;
			if (ints_9 != null) {
				int i_10 = 0;
				int i_11 = 0;
				int i_12 = renderer.width;
				int i_13 = anInt8853 + anInt8851 + anInt8855;
				int i_14 = anInt8854 + anInt8867 + anInt8856;
				int i_15 = (i_13 << 16) / i_33;
				int i_16 = (i_14 << 16) / i_41;
				int i_17;
				if (anInt8853 > 0) {
					i_17 = (i_15 + (anInt8853 << 16) - 1) / i_15;
					i_1 += i_17;
					i_10 += i_17 * i_15 - (anInt8853 << 16);
				}

				if (anInt8854 > 0) {
					i_17 = (i_16 + (anInt8854 << 16) - 1) / i_16;
					i_2 += i_17;
					i_11 += i_17 * i_16 - (anInt8854 << 16);
				}

				if (anInt8851 < i_13)
					i_33 = ((anInt8851 << 16) - i_10 + i_15 - 1) / i_15;

				if (anInt8867 < i_14)
					i_41 = ((anInt8867 << 16) - i_11 + i_16 - 1) / i_16;

				i_17 = i_12 * i_2 + i_1;
				int i_18 = i_12 - i_33;
				if (i_2 + i_41 > renderer.anInt8986)
					i_41 -= i_2 + i_41 - renderer.anInt8986;

				int i_19;
				if (i_2 < renderer.anInt9009) {
					i_19 = renderer.anInt9009 - i_2;
					i_41 -= i_19;
					i_17 += i_19 * i_12;
					i_11 += i_16 * i_19;
				}

				if (i_33 + i_1 > renderer.anInt9002) {
					i_19 = i_33 + i_1 - renderer.anInt9002;
					i_33 -= i_19;
					i_18 += i_19;
				}

				if (i_1 < renderer.anInt8983) {
					i_19 = renderer.anInt8983 - i_1;
					i_33 -= i_19;
					i_17 += i_19;
					i_10 += i_15 * i_19;
					i_18 += i_19;
				}

				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				int i_26;
				int i_27;
				int i_28;
				int i_29;
				if (i_7 == 0) {
					if (i_5 == 1) {
						i_19 = i_10;

						for (i_20 = -i_41; i_20 < 0; i_20++) {
							i_21 = anInt8851 * (i_11 >> 16);

							for (i_22 = -i_33; i_22 < 0; i_22++) {
								ints_9[i_17++] = anIntArray10201[i_21 + (i_10 >> 16)];
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_19;
							i_17 += i_18;
						}
					} else if (i_5 == 0) {
						i_19 = (i_61 & 0xff0000) >> 16;
				i_20 = (i_61 & 0xff00) >> 8;
					i_21 = i_61 & 0xff;
					i_22 = i_10;

					for (i_23 = -i_41; i_23 < 0; i_23++) {
						i_24 = anInt8851 * (i_11 >> 16);

						for (i_25 = -i_33; i_25 < 0; i_25++) {
							i_26 = anIntArray10201[i_24 + (i_10 >> 16)];
							i_27 = i_19 * (i_26 & 0xff0000) & -16777216;
							i_28 = i_20 * (i_26 & 0xff00) & 0xff0000;
							i_29 = (i_26 & 0xff) * i_21 & 0xff00;
							ints_9[i_17++] = (i_27 | i_28 | i_29) >>> 8;
					i_10 += i_15;
						}

						i_11 += i_16;
						i_10 = i_22;
						i_17 += i_18;
					}
					} else if (i_5 == 3) {
						i_19 = i_10;

						for (i_20 = -i_41; i_20 < 0; i_20++) {
							i_21 = anInt8851 * (i_11 >> 16);

							for (i_22 = -i_33; i_22 < 0; i_22++) {
								i_23 = anIntArray10201[i_21 + (i_10 >> 16)];
								i_24 = i_23 + i_61;
								i_25 = (i_23 & 0xff00ff) + (i_61 & 0xff00ff);
								i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
								ints_9[i_17++] = i_24 - i_26 | i_26 - (i_26 >>> 8);
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_19;
							i_17 += i_18;
						}
					} else {
						if (i_5 != 2)
							throw new IllegalArgumentException();

						i_19 = i_61 >>> 24;
						i_20 = 256 - i_19;
						i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
						i_22 = i_20 * (i_61 & 0xff00) & 0xff0000;
						i_61 = (i_21 | i_22) >>> 8;
						i_23 = i_10;

						for (i_24 = -i_41; i_24 < 0; i_24++) {
							i_25 = anInt8851 * (i_11 >> 16);

							for (i_26 = -i_33; i_26 < 0; i_26++) {
								i_27 = anIntArray10201[i_25 + (i_10 >> 16)];
								i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
								i_22 = i_19 * (i_27 & 0xff00) & 0xff0000;
								ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_61;
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_23;
							i_17 += i_18;
						}
					}
				} else {
					int i_30;
					int i_31;
					int i_32;
					if (i_7 == 1) {
						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = anInt8851 * (i_11 >> 16);

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[i_21 + (i_10 >> 16)];
									if (i_23 != 0)
										ints_9[i_17++] = i_23;
									else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = i_10;
							if ((i_61 & 0xffffff) == 16777215) {
								i_20 = i_61 >>> 24;
								i_21 = 256 - i_20;

								for (i_22 = -i_41; i_22 < 0; i_22++) {
									i_23 = anInt8851 * (i_11 >> 16);

									for (i_24 = -i_33; i_24 < 0; i_24++) {
										i_25 = anIntArray10201[i_23 + (i_10 >> 16)];
										if (i_25 != 0) {
											i_26 = ints_9[i_17];
											ints_9[i_17++] = ((i_25 & 0xff00ff) * i_20 + (i_26 & 0xff00ff) * i_21 & -16711936) + (i_20 * (i_25 & 0xff00) + i_21 * (i_26 & 0xff00) & 0xff0000) >> 8;
										} else
											++i_17;

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								i_20 = (i_61 & 0xff0000) >> 16;
								i_21 = (i_61 & 0xff00) >> 8;
								i_22 = i_61 & 0xff;
								i_23 = i_61 >>> 24;
								i_24 = 256 - i_23;

								for (i_25 = -i_41; i_25 < 0; i_25++) {
									i_26 = anInt8851 * (i_11 >> 16);

									for (i_27 = -i_33; i_27 < 0; i_27++) {
										i_28 = anIntArray10201[i_26 + (i_10 >> 16)];
										if (i_28 != 0) {
											if (i_23 != 255) {
												i_29 = i_20 * (i_28 & 0xff0000) & -16777216;
												i_30 = i_21 * (i_28 & 0xff00) & 0xff0000;
												i_31 = (i_28 & 0xff) * i_22 & 0xff00;
												i_28 = (i_29 | i_30 | i_31) >>> 8;
												i_32 = ints_9[i_17];
												ints_9[i_17++] = ((i_28 & 0xff00ff) * i_23 + (i_32 & 0xff00ff) * i_24 & -16711936) + (i_23 * (i_28 & 0xff00) + i_24 * (i_32 & 0xff00) & 0xff0000) >> 8;
											} else {
												i_29 = i_20 * (i_28 & 0xff0000) & -16777216;
												i_30 = i_21 * (i_28 & 0xff00) & 0xff0000;
												i_31 = (i_28 & 0xff) * i_22 & 0xff00;
												ints_9[i_17++] = (i_29 | i_30 | i_31) >>> 8;
											}
										} else
											++i_17;

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							}
						} else if (i_5 == 3) {
							i_19 = i_10;
							i_20 = i_61 >>> 24;
							i_21 = 256 - i_20;

							for (i_22 = -i_41; i_22 < 0; i_22++) {
								i_23 = anInt8851 * (i_11 >> 16);

								for (i_24 = -i_33; i_24 < 0; i_24++) {
									i_25 = anIntArray10201[i_23 + (i_10 >> 16)];
									i_26 = i_25 + i_61;
									i_27 = (i_25 & 0xff00ff) + (i_61 & 0xff00ff);
									i_28 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
									i_28 = i_26 - i_28 | i_28 - (i_28 >>> 8);
									if (i_25 == 0 && i_20 != 255) {
										i_25 = i_28;
										i_28 = ints_9[i_17];
										i_28 = ((i_25 & 0xff00ff) * i_20 + (i_28 & 0xff00ff) * i_21 & -16711936) + (i_20 * (i_25 & 0xff00) + i_21 * (i_28 & 0xff00) & 0xff0000) >> 8;
									}

									ints_9[i_17++] = i_28;
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2)
								throw new IllegalArgumentException();

							i_19 = i_61 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
							i_22 = i_20 * (i_61 & 0xff00) & 0xff0000;
							i_61 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_41; i_24 < 0; i_24++) {
								i_25 = anInt8851 * (i_11 >> 16);

								for (i_26 = -i_33; i_26 < 0; i_26++) {
									i_27 = anIntArray10201[i_25 + (i_10 >> 16)];
									if (i_27 != 0) {
										i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
										i_22 = i_19 * (i_27 & 0xff00) & 0xff0000;
										ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_61;
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_23;
								i_17 += i_18;
							}
						}
					} else {
						if (i_7 != 2)
							throw new IllegalArgumentException();

						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = anInt8851 * (i_11 >> 16);

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[i_21 + (i_10 >> 16)];
									if (i_23 != 0) {
										i_24 = ints_9[i_17];
										i_25 = i_23 + i_24;
										i_26 = (i_23 & 0xff00ff) + (i_24 & 0xff00ff);
										i_24 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										ints_9[i_17++] = i_25 - i_24 | i_24 - (i_24 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = i_10;
							i_20 = (i_61 & 0xff0000) >> 16;
							i_21 = (i_61 & 0xff00) >> 8;
							i_22 = i_61 & 0xff;

							for (i_23 = -i_41; i_23 < 0; i_23++) {
								i_24 = anInt8851 * (i_11 >> 16);

								for (i_25 = -i_33; i_25 < 0; i_25++) {
									i_26 = anIntArray10201[i_24 + (i_10 >> 16)];
									if (i_26 != 0) {
										i_27 = i_20 * (i_26 & 0xff0000) & -16777216;
										i_28 = i_21 * (i_26 & 0xff00) & 0xff0000;
										i_29 = (i_26 & 0xff) * i_22 & 0xff00;
										i_26 = (i_27 | i_28 | i_29) >>> 8;
										i_30 = ints_9[i_17];
										i_31 = i_26 + i_30;
										i_32 = (i_26 & 0xff00ff) + (i_30 & 0xff00ff);
										i_30 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
										ints_9[i_17++] = i_31 - i_30 | i_30 - (i_30 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 3) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = anInt8851 * (i_11 >> 16);

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[i_21 + (i_10 >> 16)];
									i_24 = i_23 + i_61;
									i_25 = (i_23 & 0xff00ff) + (i_61 & 0xff00ff);
									i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
									i_23 = i_24 - i_26 | i_26 - (i_26 >>> 8);
									i_26 = ints_9[i_17];
									i_24 = i_23 + i_26;
									i_25 = (i_23 & 0xff00ff) + (i_26 & 0xff00ff);
									i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
									ints_9[i_17++] = i_24 - i_26 | i_26 - (i_26 >>> 8);
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2)
								throw new IllegalArgumentException();

							i_19 = i_61 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
							i_22 = i_20 * (i_61 & 0xff00) & 0xff0000;
							i_61 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_41; i_24 < 0; i_24++) {
								i_25 = anInt8851 * (i_11 >> 16);

								for (i_26 = -i_33; i_26 < 0; i_26++) {
									i_27 = anIntArray10201[i_25 + (i_10 >> 16)];
									if (i_27 != 0) {
										i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
										i_22 = i_19 * (i_27 & 0xff00) & 0xff0000;
										i_27 = ((i_21 | i_22) >>> 8) + i_61;
										i_28 = ints_9[i_17];
										i_29 = i_27 + i_28;
										i_30 = (i_27 & 0xff00ff) + (i_28 & 0xff00ff);
										i_28 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										ints_9[i_17++] = i_29 - i_28 | i_28 - (i_28 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_23;
								i_17 += i_18;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = renderer.anIntArray8979;
		if (ints_7 == null)
			throw new IllegalStateException("");
		for (int i_8 = 0; i_8 < i_4; i_8++) {
			int i_9 = (i_2 + i_8) * anInt8851 + i_1;
			int i_10 = (i_6 + i_8) * renderer.width * 299731099 * 444800403 + i_5;

			if (i_3 >= 0) System.arraycopy(ints_7, i_10, anIntArray10201, i_9, i_3);
		}
	}

	@Override
	public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = renderer.anIntArray8979;
		if (ints_7 == null)
			throw new IllegalStateException("");
		for (int i_8 = 0; i_8 < i_4; i_8++) {
			int i_9 = (i_2 + i_8) * anInt8851 + i_1;
			int i_10 = (i_6 + i_8) * renderer.width * 299731099 * 444800403 + i_5;

			if (i_3 >= 0) System.arraycopy(ints_7, i_10, anIntArray10201, i_9, i_3);
		}
	}

	@Override
	public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int[] ints_7 = renderer.anIntArray8979;
		if (ints_7 == null)
			throw new IllegalStateException("");
		for (int i_8 = 0; i_8 < i_4; i_8++) {
			int i_9 = (i_2 + i_8) * anInt8851 + i_1;
			int i_10 = (i_6 + i_8) * renderer.width * 299731099 * 444800403 + i_5;

			if (i_3 >= 0) System.arraycopy(ints_7, i_10, anIntArray10201, i_9, i_3);
		}
	}

	@Override
	public void method2770(int i_1, int i_2, int i_3) {
		throw new IllegalStateException("");
	}

	@Override
	public void method2771(int i_1, int i_2, int i_3) {
		throw new IllegalStateException("");
	}

	@Override
	public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		int i_26 = i_2;
		int i_15 = i_1;
		if (renderer.method14408())
			throw new IllegalStateException();
		int[] ints_6 = renderer.anIntArray8979;
		if (ints_6 != null) {
			i_15 += anInt8853;
			i_26 += anInt8854;
			int i_7 = 0;
			int i_8 = renderer.width;
			int i_9 = anInt8851;
			int i_10 = anInt8867;
			int i_11 = i_8 - i_9;
			int i_12 = 0;
			int i_13 = i_8 * i_26 + i_15;
			int i_14;
			if (i_26 < renderer.anInt9009) {
				i_14 = renderer.anInt9009 - i_26;
				i_10 -= i_14;
				i_26 = renderer.anInt9009;
				i_7 += i_14 * i_9;
				i_13 += i_14 * i_8;
			}

			if (i_10 + i_26 > renderer.anInt8986)
				i_10 -= i_10 + i_26 - renderer.anInt8986;

			if (i_15 < renderer.anInt8983) {
				i_14 = renderer.anInt8983 - i_15;
				i_9 -= i_14;
				i_15 = renderer.anInt8983;
				i_7 += i_14;
				i_13 += i_14;
				i_12 += i_14;
				i_11 += i_14;
			}

			if (i_9 + i_15 > renderer.anInt9002) {
				i_14 = i_9 + i_15 - renderer.anInt9002;
				i_9 -= i_14;
				i_12 += i_14;
				i_11 += i_14;
			}

			if (i_9 > 0 && i_10 > 0) {
				Class455_Sub3 packetsdecoder_26 = (Class455_Sub3) class455_3;
				int[] ints_15 = packetsdecoder_26.anIntArray9077;
				int[] ints_16 = packetsdecoder_26.anIntArray9078;
				int i_17 = i_26;
				if (i_5 > i_26) {
					i_17 = i_5;
					i_13 += i_8 * (i_5 - i_26);
					i_7 += (i_5 - i_26) * anInt8851;
				}

				int i_18 = Math.min(ints_15.length + i_5, i_10 + i_26);

				for (int i_19 = i_17; i_19 < i_18; i_19++) {
					int i_20 = ints_15[i_19 - i_5] + i_4;
					int i_21 = ints_16[i_19 - i_5];
					int i_22 = i_9;
					int i_23;
					if (i_15 > i_20) {
						i_23 = i_15 - i_20;
						if (i_23 >= i_21) {
							i_7 += i_9 + i_12;
							i_13 += i_9 + i_11;
							continue;
						}

						i_21 -= i_23;
					} else {
						i_23 = i_20 - i_15;
						if (i_23 >= i_9) {
							i_7 += i_9 + i_12;
							i_13 += i_9 + i_11;
							continue;
						}

						i_7 += i_23;
						i_22 = i_9 - i_23;
						i_13 += i_23;
					}

					i_23 = 0;
					if (i_22 < i_21)
						i_21 = i_22;
					else
						i_23 = i_22 - i_21;

					for (int i_24 = -i_21; i_24 < 0; i_24++) {
						int i_25 = anIntArray10201[i_7++];
						if (i_25 != 0)
							ints_6[i_13++] = i_25;
						else
							++i_13;
					}

					i_7 += i_23 + i_12;
					i_13 += i_23 + i_11;
				}
			}
		}
	}

	@Override
	public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		int i_26 = i_2;
		int i_15 = i_1;
		if (renderer.method14408())
			throw new IllegalStateException();
		int[] ints_6 = renderer.anIntArray8979;
		if (ints_6 != null) {
			i_15 += anInt8853;
			i_26 += anInt8854;
			int i_7 = 0;
			int i_8 = renderer.width * 299731099 * 444800403;
			int i_9 = anInt8851;
			int i_10 = anInt8867;
			int i_11 = i_8 - i_9;
			int i_12 = 0;
			int i_13 = i_15 + i_26 * i_8;
			int i_14;
			if (i_26 < renderer.anInt9009 * 1457972577 * 1516535457) {
				i_14 = renderer.anInt9009 * 1457972577 * 1516535457 - i_26;
				i_10 -= i_14;
				i_26 = renderer.anInt9009 * 1457972577 * 1516535457;
				i_7 += i_14 * i_9;
				i_13 += i_14 * i_8;
			}

			if (i_26 + i_10 > renderer.anInt8986 * 760194793 * 1383960921)
				i_10 -= i_26 + i_10 - renderer.anInt8986 * 760194793 * 1383960921;

			if (i_15 < renderer.anInt8983 * -363774331 * 72550989) {
				i_14 = renderer.anInt8983 * -363774331 * 72550989 - i_15;
				i_9 -= i_14;
				i_15 = renderer.anInt8983 * -363774331 * 72550989;
				i_7 += i_14;
				i_13 += i_14;
				i_12 += i_14;
				i_11 += i_14;
			}

			if (i_15 + i_9 > renderer.anInt9002 * 1714763515 * -1710988237) {
				i_14 = i_15 + i_9 - renderer.anInt9002 * 1714763515 * -1710988237;
				i_9 -= i_14;
				i_12 += i_14;
				i_11 += i_14;
			}

			if (i_9 > 0 && i_10 > 0) {
				Class455_Sub3 packetsdecoder_26 = (Class455_Sub3) class455_3;
				int[] ints_15 = packetsdecoder_26.anIntArray9077;
				int[] ints_16 = packetsdecoder_26.anIntArray9078;
				int i_17 = i_26;
				if (i_5 > i_26) {
					i_17 = i_5;
					i_13 += (i_5 - i_26) * i_8;
					i_7 += (i_5 - i_26) * anInt8851;
				}

				int i_18 = Math.min(i_5 + ints_15.length, i_26 + i_10);

				for (int i_19 = i_17; i_19 < i_18; i_19++) {
					int i_20 = ints_15[i_19 - i_5] + i_4;
					int i_21 = ints_16[i_19 - i_5];
					int i_22 = i_9;
					int i_23;
					if (i_15 > i_20) {
						i_23 = i_15 - i_20;
						if (i_23 >= i_21) {
							i_7 += i_9 + i_12;
							i_13 += i_9 + i_11;
							continue;
						}

						i_21 -= i_23;
					} else {
						i_23 = i_20 - i_15;
						if (i_23 >= i_9) {
							i_7 += i_9 + i_12;
							i_13 += i_9 + i_11;
							continue;
						}

						i_7 += i_23;
						i_22 = i_9 - i_23;
						i_13 += i_23;
					}

					i_23 = 0;
					if (i_22 < i_21)
						i_21 = i_22;
					else
						i_23 = i_22 - i_21;

					for (int i_24 = -i_21; i_24 < 0; i_24++) {
						int i_25 = anIntArray10201[i_7++];
						if (i_25 != 0)
							ints_6[i_13++] = i_25;
						else
							++i_13;
					}

					i_7 += i_23 + i_12;
					i_13 += i_23 + i_11;
				}
			}
		}
	}

	@Override
	void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		int i_33 = i_3;
		int i_41 = i_4;
		int i_61 = i_6;
		if (renderer.method14408())
			throw new IllegalStateException();
		if (i_33 > 0 && i_41 > 0) {
			int[] ints_9 = renderer.anIntArray8979;
			if (ints_9 != null) {
				int i_10 = 0;
				int i_11 = 0;
				int i_12 = renderer.width * 299731099 * 444800403;
				int i_13 = anInt8853 + anInt8851 + anInt8855;
				int i_14 = anInt8854 + anInt8867 + anInt8856;
				int i_15 = (i_13 << 16) / i_33;
				int i_16 = (i_14 << 16) / i_41;
				int i_17;
				if (anInt8853 > 0) {
					i_17 = ((anInt8853 << 16) + i_15 - 1) / i_15;
					i_1 += i_17;
					i_10 += i_17 * i_15 - (anInt8853 << 16);
				}

				if (anInt8854 > 0) {
					i_17 = ((anInt8854 << 16) + i_16 - 1) / i_16;
					i_2 += i_17;
					i_11 += i_17 * i_16 - (anInt8854 << 16);
				}

				if (anInt8851 < i_13)
					i_33 = ((anInt8851 << 16) - i_10 + i_15 - 1) / i_15;

				if (anInt8867 < i_14)
					i_41 = ((anInt8867 << 16) - i_11 + i_16 - 1) / i_16;

				i_17 = i_1 + i_2 * i_12;
				int i_18 = i_12 - i_33;
				if (i_2 + i_41 > renderer.anInt8986 * 760194793 * 1383960921)
					i_41 -= i_2 + i_41 - renderer.anInt8986 * 760194793 * 1383960921;

				int i_19;
				if (i_2 < renderer.anInt9009 * 1457972577 * 1516535457) {
					i_19 = renderer.anInt9009 * 1457972577 * 1516535457 - i_2;
					i_41 -= i_19;
					i_17 += i_19 * i_12;
					i_11 += i_16 * i_19;
				}

				if (i_1 + i_33 > renderer.anInt9002 * 1714763515 * -1710988237) {
					i_19 = i_1 + i_33 - renderer.anInt9002 * 1714763515 * -1710988237;
					i_33 -= i_19;
					i_18 += i_19;
				}

				if (i_1 < renderer.anInt8983 * -363774331 * 72550989) {
					i_19 = renderer.anInt8983 * -363774331 * 72550989 - i_1;
					i_33 -= i_19;
					i_17 += i_19;
					i_10 += i_15 * i_19;
					i_18 += i_19;
				}

				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				int i_26;
				int i_27;
				int i_28;
				int i_29;
				if (i_7 == 0) {
					if (i_5 == 1) {
						i_19 = i_10;

						for (i_20 = -i_41; i_20 < 0; i_20++) {
							i_21 = (i_11 >> 16) * anInt8851;

							for (i_22 = -i_33; i_22 < 0; i_22++) {
								ints_9[i_17++] = anIntArray10201[(i_10 >> 16) + i_21];
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_19;
							i_17 += i_18;
						}
					} else if (i_5 == 0) {
						i_19 = (i_61 & 0xff0000) >> 16;
				i_20 = (i_61 & 0xff00) >> 8;
					i_21 = i_61 & 0xff;
					i_22 = i_10;

					for (i_23 = -i_41; i_23 < 0; i_23++) {
						i_24 = (i_11 >> 16) * anInt8851;

						for (i_25 = -i_33; i_25 < 0; i_25++) {
							i_26 = anIntArray10201[(i_10 >> 16) + i_24];
							i_27 = (i_26 & 0xff0000) * i_19 & -16777216;
							i_28 = (i_26 & 0xff00) * i_20 & 0xff0000;
							i_29 = (i_26 & 0xff) * i_21 & 0xff00;
							ints_9[i_17++] = (i_27 | i_28 | i_29) >>> 8;
					i_10 += i_15;
						}

						i_11 += i_16;
						i_10 = i_22;
						i_17 += i_18;
					}
					} else if (i_5 == 3) {
						i_19 = i_10;

						for (i_20 = -i_41; i_20 < 0; i_20++) {
							i_21 = (i_11 >> 16) * anInt8851;

							for (i_22 = -i_33; i_22 < 0; i_22++) {
								i_23 = anIntArray10201[(i_10 >> 16) + i_21];
								i_24 = i_23 + i_61;
								i_25 = (i_23 & 0xff00ff) + (i_61 & 0xff00ff);
								i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
								ints_9[i_17++] = i_24 - i_26 | i_26 - (i_26 >>> 8);
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_19;
							i_17 += i_18;
						}
					} else {
						if (i_5 != 2)
							throw new IllegalArgumentException();

						i_19 = i_61 >>> 24;
						i_20 = 256 - i_19;
						i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
						i_22 = (i_61 & 0xff00) * i_20 & 0xff0000;
						i_61 = (i_21 | i_22) >>> 8;
						i_23 = i_10;

						for (i_24 = -i_41; i_24 < 0; i_24++) {
							i_25 = (i_11 >> 16) * anInt8851;

							for (i_26 = -i_33; i_26 < 0; i_26++) {
								i_27 = anIntArray10201[(i_10 >> 16) + i_25];
								i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
								i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
								ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_61;
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_23;
							i_17 += i_18;
						}
					}
				} else {
					int i_30;
					int i_31;
					int i_32;
					if (i_7 == 1) {
						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * anInt8851;

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[(i_10 >> 16) + i_21];
									if (i_23 != 0)
										ints_9[i_17++] = i_23;
									else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = i_10;
							if ((i_61 & 0xffffff) == 16777215) {
								i_20 = i_61 >>> 24;
								i_21 = 256 - i_20;

								for (i_22 = -i_41; i_22 < 0; i_22++) {
									i_23 = (i_11 >> 16) * anInt8851;

									for (i_24 = -i_33; i_24 < 0; i_24++) {
										i_25 = anIntArray10201[(i_10 >> 16) + i_23];
										if (i_25 != 0) {
											i_26 = ints_9[i_17];
											ints_9[i_17++] = ((i_25 & 0xff00ff) * i_20 + (i_26 & 0xff00ff) * i_21 & -16711936) + ((i_25 & 0xff00) * i_20 + (i_26 & 0xff00) * i_21 & 0xff0000) >> 8;
										} else
											++i_17;

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								i_20 = (i_61 & 0xff0000) >> 16;
								i_21 = (i_61 & 0xff00) >> 8;
								i_22 = i_61 & 0xff;
								i_23 = i_61 >>> 24;
								i_24 = 256 - i_23;

								for (i_25 = -i_41; i_25 < 0; i_25++) {
									i_26 = (i_11 >> 16) * anInt8851;

									for (i_27 = -i_33; i_27 < 0; i_27++) {
										i_28 = anIntArray10201[(i_10 >> 16) + i_26];
										if (i_28 != 0) {
											if (i_23 != 255) {
												i_29 = (i_28 & 0xff0000) * i_20 & -16777216;
												i_30 = (i_28 & 0xff00) * i_21 & 0xff0000;
												i_31 = (i_28 & 0xff) * i_22 & 0xff00;
												i_28 = (i_29 | i_30 | i_31) >>> 8;
												i_32 = ints_9[i_17];
												ints_9[i_17++] = ((i_28 & 0xff00ff) * i_23 + (i_32 & 0xff00ff) * i_24 & -16711936) + ((i_28 & 0xff00) * i_23 + (i_32 & 0xff00) * i_24 & 0xff0000) >> 8;
											} else {
												i_29 = (i_28 & 0xff0000) * i_20 & -16777216;
												i_30 = (i_28 & 0xff00) * i_21 & 0xff0000;
												i_31 = (i_28 & 0xff) * i_22 & 0xff00;
												ints_9[i_17++] = (i_29 | i_30 | i_31) >>> 8;
											}
										} else
											++i_17;

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							}
						} else if (i_5 == 3) {
							i_19 = i_10;
							i_20 = i_61 >>> 24;
							i_21 = 256 - i_20;

							for (i_22 = -i_41; i_22 < 0; i_22++) {
								i_23 = (i_11 >> 16) * anInt8851;

								for (i_24 = -i_33; i_24 < 0; i_24++) {
									i_25 = anIntArray10201[(i_10 >> 16) + i_23];
									i_26 = i_25 + i_61;
									i_27 = (i_25 & 0xff00ff) + (i_61 & 0xff00ff);
									i_28 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
									i_28 = i_26 - i_28 | i_28 - (i_28 >>> 8);
									if (i_25 == 0 && i_20 != 255) {
										i_25 = i_28;
										i_28 = ints_9[i_17];
										i_28 = ((i_25 & 0xff00ff) * i_20 + (i_28 & 0xff00ff) * i_21 & -16711936) + ((i_25 & 0xff00) * i_20 + (i_28 & 0xff00) * i_21 & 0xff0000) >> 8;
									}

									ints_9[i_17++] = i_28;
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2)
								throw new IllegalArgumentException();

							i_19 = i_61 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
							i_22 = (i_61 & 0xff00) * i_20 & 0xff0000;
							i_61 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_41; i_24 < 0; i_24++) {
								i_25 = (i_11 >> 16) * anInt8851;

								for (i_26 = -i_33; i_26 < 0; i_26++) {
									i_27 = anIntArray10201[(i_10 >> 16) + i_25];
									if (i_27 != 0) {
										i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
										i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
										ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_61;
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_23;
								i_17 += i_18;
							}
						}
					} else {
						if (i_7 != 2)
							throw new IllegalArgumentException();

						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * anInt8851;

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[(i_10 >> 16) + i_21];
									if (i_23 != 0) {
										i_24 = ints_9[i_17];
										i_25 = i_23 + i_24;
										i_26 = (i_23 & 0xff00ff) + (i_24 & 0xff00ff);
										i_24 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										ints_9[i_17++] = i_25 - i_24 | i_24 - (i_24 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = i_10;
							i_20 = (i_61 & 0xff0000) >> 16;
							i_21 = (i_61 & 0xff00) >> 8;
							i_22 = i_61 & 0xff;

							for (i_23 = -i_41; i_23 < 0; i_23++) {
								i_24 = (i_11 >> 16) * anInt8851;

								for (i_25 = -i_33; i_25 < 0; i_25++) {
									i_26 = anIntArray10201[(i_10 >> 16) + i_24];
									if (i_26 != 0) {
										i_27 = (i_26 & 0xff0000) * i_20 & -16777216;
										i_28 = (i_26 & 0xff00) * i_21 & 0xff0000;
										i_29 = (i_26 & 0xff) * i_22 & 0xff00;
										i_26 = (i_27 | i_28 | i_29) >>> 8;
										i_30 = ints_9[i_17];
										i_31 = i_26 + i_30;
										i_32 = (i_26 & 0xff00ff) + (i_30 & 0xff00ff);
										i_30 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
										ints_9[i_17++] = i_31 - i_30 | i_30 - (i_30 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 3) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * anInt8851;

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[(i_10 >> 16) + i_21];
									i_24 = i_23 + i_61;
									i_25 = (i_23 & 0xff00ff) + (i_61 & 0xff00ff);
									i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
									i_23 = i_24 - i_26 | i_26 - (i_26 >>> 8);
									i_26 = ints_9[i_17];
									i_24 = i_23 + i_26;
									i_25 = (i_23 & 0xff00ff) + (i_26 & 0xff00ff);
									i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
									ints_9[i_17++] = i_24 - i_26 | i_26 - (i_26 >>> 8);
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2)
								throw new IllegalArgumentException();

							i_19 = i_61 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
							i_22 = (i_61 & 0xff00) * i_20 & 0xff0000;
							i_61 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_41; i_24 < 0; i_24++) {
								i_25 = (i_11 >> 16) * anInt8851;

								for (i_26 = -i_33; i_26 < 0; i_26++) {
									i_27 = anIntArray10201[(i_10 >> 16) + i_25];
									if (i_27 != 0) {
										i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
										i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
										i_27 = ((i_21 | i_22) >>> 8) + i_61;
										i_28 = ints_9[i_17];
										i_29 = i_27 + i_28;
										i_30 = (i_27 & 0xff00ff) + (i_28 & 0xff00ff);
										i_28 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										ints_9[i_17++] = i_29 - i_28 | i_28 - (i_28 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_23;
								i_17 += i_18;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
		int i_26 = i_2;
		int i_110 = i_1;
		int i_41 = i_4;
		if (renderer.method14408())
			throw new IllegalStateException();
		int[] ints_6 = renderer.anIntArray8979;
		if (ints_6 != null) {
			int i_7 = renderer.width * 299731099 * 444800403;
			i_110 += anInt8853;
			i_26 += anInt8854;
			int i_8 = i_26 * i_7 + i_110;
			int i_9 = 0;
			int i_10 = anInt8867;
			int i_11 = anInt8851;
			int i_12 = i_7 - i_11;
			int i_13 = 0;
			int i_14;
			if (i_26 < renderer.anInt9009 * 1457972577 * 1516535457) {
				i_14 = renderer.anInt9009 * 1457972577 * 1516535457 - i_26;
				i_10 -= i_14;
				i_26 = renderer.anInt9009 * 1457972577 * 1516535457;
				i_9 += i_14 * i_11;
				i_8 += i_14 * i_7;
			}

			if (i_26 + i_10 > renderer.anInt8986 * 760194793 * 1383960921)
				i_10 -= i_26 + i_10 - renderer.anInt8986 * 760194793 * 1383960921;

			if (i_110 < renderer.anInt8983 * -363774331 * 72550989) {
				i_14 = renderer.anInt8983 * -363774331 * 72550989 - i_110;
				i_11 -= i_14;
				i_110 = renderer.anInt8983 * -363774331 * 72550989;
				i_9 += i_14;
				i_8 += i_14;
				i_13 += i_14;
				i_12 += i_14;
			}

			if (i_110 + i_11 > renderer.anInt9002 * 1714763515 * -1710988237) {
				i_14 = i_110 + i_11 - renderer.anInt9002 * 1714763515 * -1710988237;
				i_11 -= i_14;
				i_13 += i_14;
				i_12 += i_14;
			}

			if (i_11 > 0 && i_10 > 0) {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				if (i_5 == 0) {
					if (i_3 == 1)
						for (i_14 = -i_10; i_14 < 0; i_14++) {
							for (i_15 = i_8 + i_11 - 3; i_8 < i_15; ints_6[i_8++] = anIntArray10201[i_9++]) {
								ints_6[i_8++] = anIntArray10201[i_9++];
								ints_6[i_8++] = anIntArray10201[i_9++];
								ints_6[i_8++] = anIntArray10201[i_9++];
							}

							for (i_15 += 3; i_8 < i_15; ints_6[i_8++] = anIntArray10201[i_9++]) {
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					else if (i_3 == 0) {
						i_14 = (i_41 & 0xff0000) >> 16;
							i_15 = (i_41 & 0xff00) >> 8;
						i_16 = i_41 & 0xff;

						for (i_17 = -i_10; i_17 < 0; i_17++) {
							for (i_18 = -i_11; i_18 < 0; i_18++) {
								i_19 = anIntArray10201[i_9++];
								i_20 = (i_19 & 0xff0000) * i_14 & -16777216;
								i_21 = (i_19 & 0xff00) * i_15 & 0xff0000;
								i_22 = (i_19 & 0xff) * i_16 & 0xff00;
								ints_6[i_8++] = (i_20 | i_21 | i_22) >>> 8;
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					} else if (i_3 == 3)
						for (i_14 = -i_10; i_14 < 0; i_14++) {
							for (i_15 = -i_11; i_15 < 0; i_15++) {
								i_16 = anIntArray10201[i_9++];
								i_17 = i_16 + i_41;
								i_18 = (i_16 & 0xff00ff) + (i_41 & 0xff00ff);
								i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
								ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					else {
						if (i_3 != 2)
							throw new IllegalArgumentException();

						i_14 = i_41 >>> 24;
						i_15 = 256 - i_14;
						i_16 = (i_41 & 0xff00ff) * i_15 & -16711936;
						i_17 = (i_41 & 0xff00) * i_15 & 0xff0000;
						i_41 = (i_16 | i_17) >>> 8;

						for (i_18 = -i_10; i_18 < 0; i_18++) {
							for (i_19 = -i_11; i_19 < 0; i_19++) {
								i_20 = anIntArray10201[i_9++];
								i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
								i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
								ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_41;
							}

							i_8 += i_12;
							i_9 += i_13;
						}
					}
				} else {
					int i_23;
					int i_24;
					int i_25;
					if (i_5 == 1) {
						if (i_3 == 1)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								i_15 = i_8 + i_11 - 3;

								while (i_8 < i_15) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;

									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;
								}

								i_15 += 3;

								while (i_8 < i_15) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0)
										ints_6[i_8++] = i_16;
									else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else if (i_3 == 0) {
							if ((i_41 & 0xffffff) == 16777215) {
								i_14 = i_41 >>> 24;
								i_15 = 256 - i_14;

								for (i_16 = -i_10; i_16 < 0; i_16++) {
									for (i_17 = -i_11; i_17 < 0; i_17++) {
										i_18 = anIntArray10201[i_9++];
										if (i_18 != 0) {
											i_19 = ints_6[i_8];
											ints_6[i_8++] = ((i_18 & 0xff00ff) * i_14 + (i_19 & 0xff00ff) * i_15 & -16711936) + ((i_18 & 0xff00) * i_14 + (i_19 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else
											++i_8;
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								i_14 = (i_41 & 0xff0000) >> 16;
								i_15 = (i_41 & 0xff00) >> 8;
								i_16 = i_41 & 0xff;
								i_17 = i_41 >>> 24;
								i_18 = 256 - i_17;

								for (i_19 = -i_10; i_19 < 0; i_19++) {
									for (i_20 = -i_11; i_20 < 0; i_20++) {
										i_21 = anIntArray10201[i_9++];
										if (i_21 != 0) {
											if (i_17 != 255) {
												i_22 = (i_21 & 0xff0000) * i_14 & -16777216;
												i_23 = (i_21 & 0xff00) * i_15 & 0xff0000;
												i_24 = (i_21 & 0xff) * i_16 & 0xff00;
												i_21 = (i_22 | i_23 | i_24) >>> 8;
								i_25 = ints_6[i_8];
								ints_6[i_8++] = ((i_21 & 0xff00ff) * i_17 + (i_25 & 0xff00ff) * i_18 & -16711936) + ((i_21 & 0xff00) * i_17 + (i_25 & 0xff00) * i_18 & 0xff0000) >> 8;
											} else {
												i_22 = (i_21 & 0xff0000) * i_14 & -16777216;
												i_23 = (i_21 & 0xff00) * i_15 & 0xff0000;
												i_24 = (i_21 & 0xff) * i_16 & 0xff00;
												ints_6[i_8++] = (i_22 | i_23 | i_24) >>> 8;
											}
										} else
											++i_8;
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							}
						} else if (i_3 == 3) {
							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;

							for (i_16 = -i_10; i_16 < 0; i_16++) {
								for (i_17 = -i_11; i_17 < 0; i_17++) {
									i_18 = anIntArray10201[i_9++];
									i_19 = i_18 + i_41;
									i_20 = (i_18 & 0xff00ff) + (i_41 & 0xff00ff);
									i_21 = (i_20 & 0x1000100) + (i_19 - i_20 & 0x10000);
									i_21 = i_19 - i_21 | i_21 - (i_21 >>> 8);
									if (i_18 == 0 && i_14 != 255) {
										i_18 = i_21;
										i_21 = ints_6[i_8];
										i_21 = ((i_18 & 0xff00ff) * i_14 + (i_21 & 0xff00ff) * i_15 & -16711936) + ((i_18 & 0xff00) * i_14 + (i_21 & 0xff00) * i_15 & 0xff0000) >> 8;
									}

									ints_6[i_8++] = i_21;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else {
							if (i_3 != 2)
								throw new IllegalArgumentException();

							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;
							i_16 = (i_41 & 0xff00ff) * i_15 & -16711936;
							i_17 = (i_41 & 0xff00) * i_15 & 0xff0000;
							i_41 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = anIntArray10201[i_9++];
									if (i_20 != 0) {
										i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
										i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
										ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_41;
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					} else {
						if (i_5 != 2)
							throw new IllegalArgumentException();

						if (i_3 == 1)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = anIntArray10201[i_9++];
									if (i_16 != 0) {
										i_17 = ints_6[i_8];
										i_18 = i_16 + i_17;
										i_19 = (i_16 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_6[i_8++] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else if (i_3 == 0) {
							i_14 = (i_41 & 0xff0000) >> 16;
							i_15 = (i_41 & 0xff00) >> 8;
							i_16 = i_41 & 0xff;

							for (i_17 = -i_10; i_17 < 0; i_17++) {
								for (i_18 = -i_11; i_18 < 0; i_18++) {
									i_19 = anIntArray10201[i_9++];
									if (i_19 != 0) {
										i_20 = (i_19 & 0xff0000) * i_14 & -16777216;
										i_21 = (i_19 & 0xff00) * i_15 & 0xff0000;
										i_22 = (i_19 & 0xff) * i_16 & 0xff00;
										i_19 = (i_20 | i_21 | i_22) >>> 8;
							i_23 = ints_6[i_8];
							i_24 = i_19 + i_23;
							i_25 = (i_19 & 0xff00ff) + (i_23 & 0xff00ff);
							i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
							ints_6[i_8++] = i_24 - i_23 | i_23 - (i_23 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 3)
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = anIntArray10201[i_9++];
									i_17 = i_16 + i_41;
									i_18 = (i_16 & 0xff00ff) + (i_41 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									i_16 = i_17 - i_19 | i_19 - (i_19 >>> 8);
									i_19 = ints_6[i_8];
									i_17 = i_16 + i_19;
									i_18 = (i_16 & 0xff00ff) + (i_19 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						else {
							if (i_3 != 2)
								throw new IllegalArgumentException();

							i_14 = i_41 >>> 24;
							i_15 = 256 - i_14;
							i_16 = (i_41 & 0xff00ff) * i_15 & -16711936;
							i_17 = (i_41 & 0xff00) * i_15 & 0xff0000;
							i_41 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = anIntArray10201[i_9++];
									if (i_20 != 0) {
										i_16 = (i_20 & 0xff00ff) * i_14 & -16711936;
										i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
										i_20 = ((i_16 | i_17) >>> 8) + i_41;
										i_21 = ints_6[i_8];
										i_22 = i_20 + i_21;
										i_23 = (i_20 & 0xff00ff) + (i_21 & 0xff00ff);
										i_21 = (i_23 & 0x1000100) + (i_22 - i_23 & 0x10000);
										ints_6[i_8++] = i_22 - i_21 | i_21 - (i_21 >>> 8);
									} else
										++i_8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		int i_26 = i_2;
		int i_15 = i_1;
		if (renderer.method14408())
			throw new IllegalStateException();
		int[] ints_6 = renderer.anIntArray8979;
		if (ints_6 != null) {
			i_15 += anInt8853;
			i_26 += anInt8854;
			int i_7 = 0;
			int i_8 = renderer.width * 299731099 * 444800403;
			int i_9 = anInt8851;
			int i_10 = anInt8867;
			int i_11 = i_8 - i_9;
			int i_12 = 0;
			int i_13 = i_15 + i_26 * i_8;
			int i_14;
			if (i_26 < renderer.anInt9009 * 1457972577 * 1516535457) {
				i_14 = renderer.anInt9009 * 1457972577 * 1516535457 - i_26;
				i_10 -= i_14;
				i_26 = renderer.anInt9009 * 1457972577 * 1516535457;
				i_7 += i_14 * i_9;
				i_13 += i_14 * i_8;
			}

			if (i_26 + i_10 > renderer.anInt8986 * 760194793 * 1383960921)
				i_10 -= i_26 + i_10 - renderer.anInt8986 * 760194793 * 1383960921;

			if (i_15 < renderer.anInt8983 * -363774331 * 72550989) {
				i_14 = renderer.anInt8983 * -363774331 * 72550989 - i_15;
				i_9 -= i_14;
				i_15 = renderer.anInt8983 * -363774331 * 72550989;
				i_7 += i_14;
				i_13 += i_14;
				i_12 += i_14;
				i_11 += i_14;
			}

			if (i_15 + i_9 > renderer.anInt9002 * 1714763515 * -1710988237) {
				i_14 = i_15 + i_9 - renderer.anInt9002 * 1714763515 * -1710988237;
				i_9 -= i_14;
				i_12 += i_14;
				i_11 += i_14;
			}

			if (i_9 > 0 && i_10 > 0) {
				Class455_Sub3 packetsdecoder_26 = (Class455_Sub3) class455_3;
				int[] ints_15 = packetsdecoder_26.anIntArray9077;
				int[] ints_16 = packetsdecoder_26.anIntArray9078;
				int i_17 = i_26;
				if (i_5 > i_26) {
					i_17 = i_5;
					i_13 += (i_5 - i_26) * i_8;
					i_7 += (i_5 - i_26) * anInt8851;
				}

				int i_18 = Math.min(i_5 + ints_15.length, i_26 + i_10);

				for (int i_19 = i_17; i_19 < i_18; i_19++) {
					int i_20 = ints_15[i_19 - i_5] + i_4;
					int i_21 = ints_16[i_19 - i_5];
					int i_22 = i_9;
					int i_23;
					if (i_15 > i_20) {
						i_23 = i_15 - i_20;
						if (i_23 >= i_21) {
							i_7 += i_9 + i_12;
							i_13 += i_9 + i_11;
							continue;
						}

						i_21 -= i_23;
					} else {
						i_23 = i_20 - i_15;
						if (i_23 >= i_9) {
							i_7 += i_9 + i_12;
							i_13 += i_9 + i_11;
							continue;
						}

						i_7 += i_23;
						i_22 = i_9 - i_23;
						i_13 += i_23;
					}

					i_23 = 0;
					if (i_22 < i_21)
						i_21 = i_22;
					else
						i_23 = i_22 - i_21;

					for (int i_24 = -i_21; i_24 < 0; i_24++) {
						int i_25 = anIntArray10201[i_7++];
						if (i_25 != 0)
							ints_6[i_13++] = i_25;
						else
							++i_13;
					}

					i_7 += i_23 + i_12;
					i_13 += i_23 + i_11;
				}
			}
		}
	}

	@Override
	void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		int i_33 = i_3;
		int i_41 = i_4;
		int i_61 = i_6;
		if (renderer.method14408())
			throw new IllegalStateException();
		if (i_33 > 0 && i_41 > 0) {
			int[] ints_9 = renderer.anIntArray8979;
			if (ints_9 != null) {
				int i_10 = 0;
				int i_11 = 0;
				int i_12 = renderer.width * 299731099 * 444800403;
				int i_13 = anInt8853 + anInt8851 + anInt8855;
				int i_14 = anInt8854 + anInt8867 + anInt8856;
				int i_15 = (i_13 << 16) / i_33;
				int i_16 = (i_14 << 16) / i_41;
				int i_17;
				if (anInt8853 > 0) {
					i_17 = ((anInt8853 << 16) + i_15 - 1) / i_15;
					i_1 += i_17;
					i_10 += i_17 * i_15 - (anInt8853 << 16);
				}

				if (anInt8854 > 0) {
					i_17 = ((anInt8854 << 16) + i_16 - 1) / i_16;
					i_2 += i_17;
					i_11 += i_17 * i_16 - (anInt8854 << 16);
				}

				if (anInt8851 < i_13)
					i_33 = ((anInt8851 << 16) - i_10 + i_15 - 1) / i_15;

				if (anInt8867 < i_14)
					i_41 = ((anInt8867 << 16) - i_11 + i_16 - 1) / i_16;

				i_17 = i_1 + i_2 * i_12;
				int i_18 = i_12 - i_33;
				if (i_2 + i_41 > renderer.anInt8986 * 760194793 * 1383960921)
					i_41 -= i_2 + i_41 - renderer.anInt8986 * 760194793 * 1383960921;

				int i_19;
				if (i_2 < renderer.anInt9009 * 1457972577 * 1516535457) {
					i_19 = renderer.anInt9009 * 1457972577 * 1516535457 - i_2;
					i_41 -= i_19;
					i_17 += i_19 * i_12;
					i_11 += i_16 * i_19;
				}

				if (i_1 + i_33 > renderer.anInt9002 * 1714763515 * -1710988237) {
					i_19 = i_1 + i_33 - renderer.anInt9002 * 1714763515 * -1710988237;
					i_33 -= i_19;
					i_18 += i_19;
				}

				if (i_1 < renderer.anInt8983 * -363774331 * 72550989) {
					i_19 = renderer.anInt8983 * -363774331 * 72550989 - i_1;
					i_33 -= i_19;
					i_17 += i_19;
					i_10 += i_15 * i_19;
					i_18 += i_19;
				}

				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				int i_26;
				int i_27;
				int i_28;
				int i_29;
				if (i_7 == 0) {
					if (i_5 == 1) {
						i_19 = i_10;

						for (i_20 = -i_41; i_20 < 0; i_20++) {
							i_21 = (i_11 >> 16) * anInt8851;

							for (i_22 = -i_33; i_22 < 0; i_22++) {
								ints_9[i_17++] = anIntArray10201[(i_10 >> 16) + i_21];
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_19;
							i_17 += i_18;
						}
					} else if (i_5 == 0) {
						i_19 = (i_61 & 0xff0000) >> 16;
				i_20 = (i_61 & 0xff00) >> 8;
					i_21 = i_61 & 0xff;
					i_22 = i_10;

					for (i_23 = -i_41; i_23 < 0; i_23++) {
						i_24 = (i_11 >> 16) * anInt8851;

						for (i_25 = -i_33; i_25 < 0; i_25++) {
							i_26 = anIntArray10201[(i_10 >> 16) + i_24];
							i_27 = (i_26 & 0xff0000) * i_19 & -16777216;
							i_28 = (i_26 & 0xff00) * i_20 & 0xff0000;
							i_29 = (i_26 & 0xff) * i_21 & 0xff00;
							ints_9[i_17++] = (i_27 | i_28 | i_29) >>> 8;
					i_10 += i_15;
						}

						i_11 += i_16;
						i_10 = i_22;
						i_17 += i_18;
					}
					} else if (i_5 == 3) {
						i_19 = i_10;

						for (i_20 = -i_41; i_20 < 0; i_20++) {
							i_21 = (i_11 >> 16) * anInt8851;

							for (i_22 = -i_33; i_22 < 0; i_22++) {
								i_23 = anIntArray10201[(i_10 >> 16) + i_21];
								i_24 = i_23 + i_61;
								i_25 = (i_23 & 0xff00ff) + (i_61 & 0xff00ff);
								i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
								ints_9[i_17++] = i_24 - i_26 | i_26 - (i_26 >>> 8);
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_19;
							i_17 += i_18;
						}
					} else {
						if (i_5 != 2)
							throw new IllegalArgumentException();

						i_19 = i_61 >>> 24;
						i_20 = 256 - i_19;
						i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
						i_22 = (i_61 & 0xff00) * i_20 & 0xff0000;
						i_61 = (i_21 | i_22) >>> 8;
						i_23 = i_10;

						for (i_24 = -i_41; i_24 < 0; i_24++) {
							i_25 = (i_11 >> 16) * anInt8851;

							for (i_26 = -i_33; i_26 < 0; i_26++) {
								i_27 = anIntArray10201[(i_10 >> 16) + i_25];
								i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
								i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
								ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_61;
								i_10 += i_15;
							}

							i_11 += i_16;
							i_10 = i_23;
							i_17 += i_18;
						}
					}
				} else {
					int i_30;
					int i_31;
					int i_32;
					if (i_7 == 1) {
						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * anInt8851;

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[(i_10 >> 16) + i_21];
									if (i_23 != 0)
										ints_9[i_17++] = i_23;
									else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = i_10;
							if ((i_61 & 0xffffff) == 16777215) {
								i_20 = i_61 >>> 24;
								i_21 = 256 - i_20;

								for (i_22 = -i_41; i_22 < 0; i_22++) {
									i_23 = (i_11 >> 16) * anInt8851;

									for (i_24 = -i_33; i_24 < 0; i_24++) {
										i_25 = anIntArray10201[(i_10 >> 16) + i_23];
										if (i_25 != 0) {
											i_26 = ints_9[i_17];
											ints_9[i_17++] = ((i_25 & 0xff00ff) * i_20 + (i_26 & 0xff00ff) * i_21 & -16711936) + ((i_25 & 0xff00) * i_20 + (i_26 & 0xff00) * i_21 & 0xff0000) >> 8;
										} else
											++i_17;

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								i_20 = (i_61 & 0xff0000) >> 16;
								i_21 = (i_61 & 0xff00) >> 8;
								i_22 = i_61 & 0xff;
								i_23 = i_61 >>> 24;
								i_24 = 256 - i_23;

								for (i_25 = -i_41; i_25 < 0; i_25++) {
									i_26 = (i_11 >> 16) * anInt8851;

									for (i_27 = -i_33; i_27 < 0; i_27++) {
										i_28 = anIntArray10201[(i_10 >> 16) + i_26];
										if (i_28 != 0) {
											if (i_23 != 255) {
												i_29 = (i_28 & 0xff0000) * i_20 & -16777216;
												i_30 = (i_28 & 0xff00) * i_21 & 0xff0000;
												i_31 = (i_28 & 0xff) * i_22 & 0xff00;
												i_28 = (i_29 | i_30 | i_31) >>> 8;
												i_32 = ints_9[i_17];
												ints_9[i_17++] = ((i_28 & 0xff00ff) * i_23 + (i_32 & 0xff00ff) * i_24 & -16711936) + ((i_28 & 0xff00) * i_23 + (i_32 & 0xff00) * i_24 & 0xff0000) >> 8;
											} else {
												i_29 = (i_28 & 0xff0000) * i_20 & -16777216;
												i_30 = (i_28 & 0xff00) * i_21 & 0xff0000;
												i_31 = (i_28 & 0xff) * i_22 & 0xff00;
												ints_9[i_17++] = (i_29 | i_30 | i_31) >>> 8;
											}
										} else
											++i_17;

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							}
						} else if (i_5 == 3) {
							i_19 = i_10;
							i_20 = i_61 >>> 24;
							i_21 = 256 - i_20;

							for (i_22 = -i_41; i_22 < 0; i_22++) {
								i_23 = (i_11 >> 16) * anInt8851;

								for (i_24 = -i_33; i_24 < 0; i_24++) {
									i_25 = anIntArray10201[(i_10 >> 16) + i_23];
									i_26 = i_25 + i_61;
									i_27 = (i_25 & 0xff00ff) + (i_61 & 0xff00ff);
									i_28 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
									i_28 = i_26 - i_28 | i_28 - (i_28 >>> 8);
									if (i_25 == 0 && i_20 != 255) {
										i_25 = i_28;
										i_28 = ints_9[i_17];
										i_28 = ((i_25 & 0xff00ff) * i_20 + (i_28 & 0xff00ff) * i_21 & -16711936) + ((i_25 & 0xff00) * i_20 + (i_28 & 0xff00) * i_21 & 0xff0000) >> 8;
									}

									ints_9[i_17++] = i_28;
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2)
								throw new IllegalArgumentException();

							i_19 = i_61 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
							i_22 = (i_61 & 0xff00) * i_20 & 0xff0000;
							i_61 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_41; i_24 < 0; i_24++) {
								i_25 = (i_11 >> 16) * anInt8851;

								for (i_26 = -i_33; i_26 < 0; i_26++) {
									i_27 = anIntArray10201[(i_10 >> 16) + i_25];
									if (i_27 != 0) {
										i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
										i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
										ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_61;
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_23;
								i_17 += i_18;
							}
						}
					} else {
						if (i_7 != 2)
							throw new IllegalArgumentException();

						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * anInt8851;

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[(i_10 >> 16) + i_21];
									if (i_23 != 0) {
										i_24 = ints_9[i_17];
										i_25 = i_23 + i_24;
										i_26 = (i_23 & 0xff00ff) + (i_24 & 0xff00ff);
										i_24 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										ints_9[i_17++] = i_25 - i_24 | i_24 - (i_24 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = i_10;
							i_20 = (i_61 & 0xff0000) >> 16;
							i_21 = (i_61 & 0xff00) >> 8;
							i_22 = i_61 & 0xff;

							for (i_23 = -i_41; i_23 < 0; i_23++) {
								i_24 = (i_11 >> 16) * anInt8851;

								for (i_25 = -i_33; i_25 < 0; i_25++) {
									i_26 = anIntArray10201[(i_10 >> 16) + i_24];
									if (i_26 != 0) {
										i_27 = (i_26 & 0xff0000) * i_20 & -16777216;
										i_28 = (i_26 & 0xff00) * i_21 & 0xff0000;
										i_29 = (i_26 & 0xff) * i_22 & 0xff00;
										i_26 = (i_27 | i_28 | i_29) >>> 8;
										i_30 = ints_9[i_17];
										i_31 = i_26 + i_30;
										i_32 = (i_26 & 0xff00ff) + (i_30 & 0xff00ff);
										i_30 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
										ints_9[i_17++] = i_31 - i_30 | i_30 - (i_30 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 3) {
							i_19 = i_10;

							for (i_20 = -i_41; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * anInt8851;

								for (i_22 = -i_33; i_22 < 0; i_22++) {
									i_23 = anIntArray10201[(i_10 >> 16) + i_21];
									i_24 = i_23 + i_61;
									i_25 = (i_23 & 0xff00ff) + (i_61 & 0xff00ff);
									i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
									i_23 = i_24 - i_26 | i_26 - (i_26 >>> 8);
									i_26 = ints_9[i_17];
									i_24 = i_23 + i_26;
									i_25 = (i_23 & 0xff00ff) + (i_26 & 0xff00ff);
									i_26 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
									ints_9[i_17++] = i_24 - i_26 | i_26 - (i_26 >>> 8);
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2)
								throw new IllegalArgumentException();

							i_19 = i_61 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_61 & 0xff00ff) * i_20 & -16711936;
							i_22 = (i_61 & 0xff00) * i_20 & 0xff0000;
							i_61 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_41; i_24 < 0; i_24++) {
								i_25 = (i_11 >> 16) * anInt8851;

								for (i_26 = -i_33; i_26 < 0; i_26++) {
									i_27 = anIntArray10201[(i_10 >> 16) + i_25];
									if (i_27 != 0) {
										i_21 = (i_27 & 0xff00ff) * i_19 & -16711936;
										i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
										i_27 = ((i_21 | i_22) >>> 8) + i_61;
										i_28 = ints_9[i_17];
										i_29 = i_27 + i_28;
										i_30 = (i_27 & 0xff00ff) + (i_28 & 0xff00ff);
										i_28 = (i_30 & 0x1000100) + (i_29 - i_30 & 0x10000);
										ints_9[i_17++] = i_29 - i_28 | i_28 - (i_28 >>> 8);
									} else
										++i_17;

									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_23;
								i_17 += i_18;
							}
						}
					}
				}
			}
		}
	}

	@Override
	public Interface9 method2801() {
		return new Class192(anInt8851, anInt8867, anIntArray10201);
	}

	@Override
	public Interface9 method2808() {
		return new Class192(anInt8851, anInt8867, anIntArray10201);
	}

}
