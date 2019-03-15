import java.util.Random;

public class Class282_Sub20_Sub9 extends Class282_Sub20 {

	public static int anInt9792;
	int anInt9782 = 0;
	int anInt9791 = 1024;
	int anInt9784 = 2048;
	int anInt9772 = 409;
	int anInt9786 = 819;
	int anInt9787 = 1024;
	int anInt9788 = 0;
	int anInt9780 = 1024;
	int anInt9790 = 1024;
	int anInt9789;

	final void method15253(Random random_1, int[][] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		int i_8 = this.anInt9790 > 0 ? 4096 - Class476.method7931(random_1, this.anInt9790, -664753074) : 4096;
		int i_9 = this.anInt9780 * this.anInt9789 >> 12;
		int i_10 = this.anInt9789 - (i_9 > 0 ? Class476.method7931(random_1, i_9, 1861509778) : 0);
		if (i_3 >= Class316.anInt3670) {
			i_3 -= Class316.anInt3670;
		}

		int i_11;
		int i_12;
		if (i_10 > 0) {
			if (i_6 > 0 && i_5 > 0) {
				i_11 = i_5 / 2;
				i_12 = i_6 / 2;
				int i_13 = i_11 < i_10 ? i_11 : i_10;
				int i_14 = i_12 < i_10 ? i_12 : i_10;
				int i_15 = i_3 + i_13;
				int i_16 = i_5 - i_13 * 2;

				for (int i_17 = 0; i_17 < i_6; i_17++) {
					int[] ints_18 = ints_2[i_17 + i_4];
					int i_19;
					int i_20;
					int i_21;
					if (i_17 < i_14) {
						i_19 = i_8 * i_17 / i_14;
						if (this.anInt9788 == 0) {
							for (i_20 = 0; i_20 < i_13; i_20++) {
								i_21 = i_8 * i_20 / i_13;
								ints_18[i_3 + i_20 & Class316.anInt3669] = ints_18[i_3 + i_5 - i_20 - 1 & Class316.anInt3669] = i_21 * i_19 >> 12;
							}
						} else {
							for (i_20 = 0; i_20 < i_13; i_20++) {
								i_21 = i_20 * i_8 / i_13;
								ints_18[i_3 + i_20 & Class316.anInt3669] = ints_18[i_3 + i_5 - i_20 - 1 & Class316.anInt3669] = i_21 < i_19 ? i_21 : i_19;
							}
						}

						if (i_16 + i_15 > Class316.anInt3670) {
							i_20 = Class316.anInt3670 - i_15;
							Class503.method8365(ints_18, i_15, i_20, i_19);
							Class503.method8365(ints_18, 0, i_16 - i_20, i_19);
						} else {
							Class503.method8365(ints_18, i_15, i_16, i_19);
						}
					} else {
						i_19 = i_6 - i_17 - 1;
						if (i_19 < i_14) {
							i_20 = i_8 * i_19 / i_14;
							int i_22;
							if (this.anInt9788 == 0) {
								for (i_21 = 0; i_21 < i_13; i_21++) {
									i_22 = i_21 * i_8 / i_13;
									ints_18[i_3 + i_21 & Class316.anInt3669] = ints_18[i_3 + i_5 - i_21 - 1 & Class316.anInt3669] = i_20 * i_22 >> 12;
								}
							} else {
								for (i_21 = 0; i_21 < i_13; i_21++) {
									i_22 = i_21 * i_8 / i_13;
									ints_18[i_3 + i_21 & Class316.anInt3669] = ints_18[i_3 + i_5 - i_21 - 1 & Class316.anInt3669] = i_22 < i_20 ? i_22 : i_20;
								}
							}

							if (i_16 + i_15 > Class316.anInt3670) {
								i_21 = Class316.anInt3670 - i_15;
								Class503.method8365(ints_18, i_15, i_21, i_20);
								Class503.method8365(ints_18, 0, i_16 - i_21, i_20);
							} else {
								Class503.method8365(ints_18, i_15, i_16, i_20);
							}
						} else {
							for (i_20 = 0; i_20 < i_13; i_20++) {
								ints_18[i_3 + i_20 & Class316.anInt3669] = ints_18[i_3 + i_5 - i_20 - 1 & Class316.anInt3669] = i_20 * i_8 / i_13;
							}

							if (i_15 + i_16 > Class316.anInt3670) {
								i_20 = Class316.anInt3670 - i_15;
								Class503.method8365(ints_18, i_15, i_20, i_8);
								Class503.method8365(ints_18, 0, i_16 - i_20, i_8);
							} else {
								Class503.method8365(ints_18, i_15, i_16, i_8);
							}
						}
					}
				}
			}
		} else if (i_3 + i_5 > Class316.anInt3670) {
			i_11 = Class316.anInt3670 - i_3;

			for (i_12 = 0; i_12 < i_6; i_12++) {
				int[] ints_23 = ints_2[i_12 + i_4];
				Class503.method8365(ints_23, i_3, i_11, i_8);
				Class503.method8365(ints_23, 0, i_5 - i_11, i_8);
			}
		} else {
			for (i_11 = 0; i_11 < i_6; i_11++) {
				Class503.method8365(ints_2[i_11 + i_4], i_3, i_5, i_8);
			}
		}

	}

	public Class282_Sub20_Sub9() {
		super(0, true);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		switch (i_1) {
		case 0:
			this.anInt9782 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9791 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 2:
			this.anInt9784 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			this.anInt9772 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 4:
			this.anInt9786 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 5:
			this.anInt9787 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 6:
			this.anInt9788 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 7:
			this.anInt9780 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 8:
			this.anInt9790 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	void method12321(int i_1) {
	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -1227771715);
		if (this.aClass320_7667.aBool3722) {
			int[][] ints_4 = this.aClass320_7667.method5722();
			int i_5 = 0;
			int i_6 = 0;
			int i_7 = 0;
			int i_8 = 0;
			int i_9 = 0;
			boolean bool_10 = true;
			boolean bool_11 = true;
			int i_12 = 0;
			int i_13 = 0;
			int i_14 = this.anInt9791 * Class316.anInt3670 >> 12;
			int i_15 = this.anInt9784 * Class316.anInt3670 >> 12;
			int i_16 = this.anInt9772 * Class316.anInt3671 >> 12;
			int i_17 = this.anInt9786 * Class316.anInt3671 >> 12;
			if (i_17 <= 1) {
				return ints_4[i_1];
			} else {
				this.anInt9789 = Class316.anInt3670 / 8 * this.anInt9787 >> 12;
				int i_18 = Class316.anInt3670 / i_14 + 1;
				int[][] ints_19 = new int[i_18][3];
				int[][] ints_20 = new int[i_18][3];
				Random random_21 = new Random((long) this.anInt9782);

				while (true) {
					while (true) {
						int i_22 = i_14 + Class476.method7931(random_21, i_15 - i_14, 43789865);
						int i_23 = i_16 + Class476.method7931(random_21, i_17 - i_16, -1448566396);
						int i_24 = i_22 + i_8;
						if (i_24 > Class316.anInt3670) {
							i_22 = Class316.anInt3670 - i_8;
							i_24 = Class316.anInt3670;
						}

						int i_25;
						int i_28;
						if (bool_11) {
							i_25 = 0;
						} else {
							int i_26 = i_9;
							int[] ints_27 = ints_20[i_9];
							i_28 = 0;
							int i_29 = i_24 + i_5;
							if (i_29 < 0) {
								i_29 += Class316.anInt3670;
							}

							if (i_29 > Class316.anInt3670) {
								i_29 -= Class316.anInt3670;
							}

							while (true) {
								int[] ints_30 = ints_20[i_26];
								if (i_29 >= ints_30[0] && i_29 <= ints_30[1]) {
									i_25 = ints_27[2];
									if (i_26 != i_9) {
										int i_38 = i_8 + i_5;
										if (i_38 < 0) {
											i_38 += Class316.anInt3670;
										}

										if (i_38 > Class316.anInt3670) {
											i_38 -= Class316.anInt3670;
										}

										int i_31;
										int[] ints_32;
										for (i_31 = 1; i_31 <= i_28; i_31++) {
											ints_32 = ints_20[(i_31 + i_9) % i_12];
											i_25 = Math.max(i_25, ints_32[2]);
										}

										for (i_31 = 0; i_31 <= i_28; i_31++) {
											ints_32 = ints_20[(i_31 + i_9) % i_12];
											int i_33 = ints_32[2];
											if (i_33 != i_25) {
												int i_34 = ints_32[0];
												int i_35 = ints_32[1];
												int i_36;
												int i_37;
												if (i_38 < i_29) {
													i_36 = Math.max(i_38, i_34);
													i_37 = Math.min(i_29, i_35);
												} else if (i_34 == 0) {
													i_36 = 0;
													i_37 = Math.min(i_29, i_35);
												} else {
													i_36 = Math.max(i_38, i_34);
													i_37 = Class316.anInt3670;
												}

												this.method15253(random_21, ints_4, i_36 + i_7, i_33, i_37 - i_36, i_25 - i_33, 212976521);
											}
										}
									}

									i_9 = i_26;
									break;
								}

								++i_26;
								if (i_26 >= i_12) {
									i_26 = 0;
								}

								++i_28;
							}
						}

						if (i_25 + i_23 > Class316.anInt3671) {
							i_23 = Class316.anInt3671 - i_25;
						} else {
							bool_10 = false;
						}

						int[] ints_39;
						if (i_24 == Class316.anInt3670) {
							this.method15253(random_21, ints_4, i_6 + i_8, i_25, i_22, i_23, -946908989);
							if (bool_10) {
								return ints_3;
							}

							bool_10 = true;
							ints_39 = ints_19[i_13++];
							ints_39[0] = i_8;
							ints_39[1] = i_24;
							ints_39[2] = i_23 + i_25;
							int[][] ints_41 = ints_20;
							ints_20 = ints_19;
							ints_19 = ints_41;
							i_12 = i_13;
							i_13 = 0;
							i_7 = i_6;
							i_6 = Class476.method7931(random_21, Class316.anInt3670, 1102098553);
							i_5 = i_6 - i_7;
							i_8 = 0;
							i_28 = i_5;
							if (i_5 < 0) {
								i_28 = i_5 + Class316.anInt3670;
							}

							if (i_28 > Class316.anInt3670) {
								i_28 -= Class316.anInt3670;
							}

							i_9 = 0;

							while (true) {
								int[] ints_40 = ints_20[i_9];
								if (i_28 >= ints_40[0] && i_28 <= ints_40[1]) {
									bool_11 = false;
									break;
								}

								++i_9;
								if (i_9 >= i_12) {
									i_9 = 0;
								}
							}
						} else {
							ints_39 = ints_19[i_13++];
							ints_39[0] = i_8;
							ints_39[1] = i_24;
							ints_39[2] = i_23 + i_25;
							this.method15253(random_21, ints_4, i_6 + i_8, i_25, i_22, i_23, -1730721144);
							i_8 = i_24;
						}
					}
				}
			}
		} else {
			return ints_3;
		}
	}

	static void method15255(short s_0) {
		PulseEvent class282_sub50_sub12_1 = PulseEvent.createPulseEvent(15, 0L);
		class282_sub50_sub12_1.method14965((byte) 18);
	}

	static final void method15256(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1381 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
	}

}
