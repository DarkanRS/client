public class ChoppyItemFixClass {

	float aFloat1678;
	float aFloat1679;
	float aFloat1680;
	int anInt1684;
	int anInt1700;
	float aFloat1702;
	boolean aBool1671 = false;
	int anInt1677;
	int[] anIntArray1693 = null;
	float aFloat1696 = 0.0F;
	int anInt1674 = 0;
	int[] anIntArray1698 = null;
	float aFloat1695 = 0.0F;
	int[] anIntArray1673 = null;
	float aFloat1681 = 0.0F;
	int anInt1694 = 0;
	int anInt1691 = 0;
	int anInt1697 = 0;
	int anInt1701 = 0;
	int anInt1699 = 0;
	int anInt1706 = 0;
	int anInt1707 = 0;
	boolean aBool1672 = false;
	boolean aBool1675 = true;
	boolean aBool1676 = false;
	float aFloat1682 = 0.0F;
	float aFloat1683 = 1.0F;
	int[] anIntArray1685 = new int[4096];
	int anInt1688 = -1;
	int anInt1692 = -1;
	boolean aBool1703 = true;
	int anInt1704 = -1;
	boolean aBool1708 = false;
	HardwareRenderer aClass505_Sub3_1686;
	Class185 aClass185_1687;
	int anInt1705;
	int[] anIntArray1689;
	float[] aFloatArray1690;

	int method2416() {
		return this.anIntArray1685[0] % this.anInt1705;
	}

	int method2417() {
		return this.anIntArray1685[0] / this.anInt1705;
	}

	final void method2418(boolean bool_1) {
		this.aBool1671 = bool_1;
	}

	final void method2419(boolean bool_1, boolean bool_2, boolean bool_3, int[] ints_4, int i_5, int i_6, int i_7, int i_8, int i_9, float f_10, float f_11) {
		if (this.aBool1708) {
			if (i_9 > this.anInt1684) {
				i_9 = this.anInt1684;
			}

			if (i_8 < 0) {
				i_8 = 0;
			}
		}

		if (i_8 < i_9) {
			i_5 += i_8 - 1;
			i_7 = i_9 - i_8 >> 2;
			f_10 += f_11 * (float) i_8;
			int i_12;
			int i_13;
			int i_14;
			if (this.aClass185_1687.aBool2334) {
				if (this.anInt1674 == 0) {
					while (true) {
						--i_7;
						if (i_7 < 0) {
							i_7 = i_9 - i_8 & 0x3;

							while (true) {
								--i_7;
								if (i_7 < 0) {
									return;
								}

								++i_5;
								if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
									if (bool_1) {
										ints_4[i_5] = i_6;
									}

									if (bool_2) {
										this.aFloatArray1690[i_5] = f_10;
									}
								}

								f_10 += f_11;
							}
						}

						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								ints_4[i_5] = i_6;
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								ints_4[i_5] = i_6;
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								ints_4[i_5] = i_6;
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								ints_4[i_5] = i_6;
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
					}
				}

				if (this.anInt1674 != 254) {
					i_12 = this.anInt1674;
					i_13 = 256 - this.anInt1674;
					i_6 = ((i_6 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_6 & 0xff00) >> 8 & 0xff00);

					while (true) {
						--i_7;
						if (i_7 < 0) {
							i_7 = i_9 - i_8 & 0x3;

							while (true) {
								--i_7;
								if (i_7 < 0) {
									return;
								}

								++i_5;
								if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
									if (bool_1) {
										i_14 = ints_4[i_5];
										if (bool_3) {
											ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
										} else {
											ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
										}
									}

									if (bool_2) {
										this.aFloatArray1690[i_5] = f_10;
									}
								}

								f_10 += f_11;
							}
						}

						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								i_14 = ints_4[i_5];
								if (bool_3) {
									ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								} else {
									ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								}
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								i_14 = ints_4[i_5];
								if (bool_3) {
									ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								} else {
									ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								}
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								i_14 = ints_4[i_5];
								if (bool_3) {
									ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								} else {
									ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								}
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							if (bool_1) {
								i_14 = ints_4[i_5];
								if (bool_3) {
									ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								} else {
									ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
								}
							}

							if (bool_2) {
								this.aFloatArray1690[i_5] = f_10;
							}
						}

						f_10 += f_11;
					}
				}

				if (i_8 != 0 && i_9 <= this.anInt1684 - 1) {
					while (true) {
						--i_7;
						if (i_7 < 0) {
							i_7 = i_9 - i_8 & 0x3;

							while (true) {
								--i_7;
								if (i_7 < 0) {
									return;
								}

								++i_5;
								if ((!bool_2 || f_10 < this.aFloatArray1690[i_5]) && bool_1) {
									ints_4[i_5 - 1] = ints_4[i_5];
								}

								f_10 += f_11;
							}
						}

						++i_5;
						if ((!bool_2 || f_10 < this.aFloatArray1690[i_5]) && bool_1) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
						++i_5;
						if ((!bool_2 || f_10 < this.aFloatArray1690[i_5]) && bool_1) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
						++i_5;
						if ((!bool_2 || f_10 < this.aFloatArray1690[i_5]) && bool_1) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
						++i_5;
						if ((!bool_2 || f_10 < this.aFloatArray1690[i_5]) && bool_1) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
					}
				}
			} else if (bool_1) {
				if (this.anInt1674 == 0) {
					while (true) {
						--i_7;
						if (i_7 < 0) {
							i_7 = i_9 - i_8 & 0x3;

							while (true) {
								--i_7;
								if (i_7 < 0) {
									return;
								}

								++i_5;
								if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
									ints_4[i_5] = i_6;
								}

								f_10 += f_11;
							}
						}

						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5] = i_6;
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5] = i_6;
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5] = i_6;
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5] = i_6;
						}

						f_10 += f_11;
					}
				}

				if (this.anInt1674 != 254) {
					i_12 = this.anInt1674;
					i_13 = 256 - this.anInt1674;
					i_6 = ((i_6 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_6 & 0xff00) >> 8 & 0xff00);

					while (true) {
						--i_7;
						if (i_7 < 0) {
							i_7 = i_9 - i_8 & 0x3;

							while (true) {
								--i_7;
								if (i_7 < 0) {
									return;
								}

								++i_5;
								if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
									i_14 = ints_4[i_5];
									if (bool_3) {
										ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
									} else {
										ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
									}
								}

								f_10 += f_11;
							}
						}

						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							i_14 = ints_4[i_5];
							if (bool_3) {
								ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							} else {
								ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							i_14 = ints_4[i_5];
							if (bool_3) {
								ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							} else {
								ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							i_14 = ints_4[i_5];
							if (bool_3) {
								ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							} else {
								ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							}
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							i_14 = ints_4[i_5];
							if (bool_3) {
								ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							} else {
								ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
							}
						}

						f_10 += f_11;
					}
				}

				if (i_8 != 0 && i_9 <= this.anInt1684 - 1) {
					while (true) {
						--i_7;
						if (i_7 < 0) {
							i_7 = i_9 - i_8 & 0x3;

							while (true) {
								--i_7;
								if (i_7 < 0) {
									return;
								}

								++i_5;
								if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
									ints_4[i_5 - 1] = ints_4[i_5];
								}

								f_10 += f_11;
							}
						}

						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
						++i_5;
						if (!bool_2 || f_10 < this.aFloatArray1690[i_5]) {
							ints_4[i_5 - 1] = ints_4[i_5];
						}

						f_10 += f_11;
					}
				}
			}
		}

	}

	final void method2421(float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, int i_22, int i_23, int i_24, int i_25, float f_26, float f_27, float f_28, int i_29, float f_30, int i_31, float f_32, int i_33, float f_34) {
		this.anInt1677 = i_25;
		float f_35;
		int i_36;
		if (f_4 > f_5 || f_4 > f_6) {
			if (f_5 <= f_6) {
				f_35 = f_7;
				f_7 = f_8;
				f_8 = f_35;
				f_35 = f_4;
				f_4 = f_5;
				f_5 = f_35;
				f_35 = f_10;
				f_10 = f_11;
				f_11 = f_35;
				f_35 = f_16;
				f_16 = f_17;
				f_17 = f_35;
				f_35 = f_19;
				f_19 = f_20;
				f_20 = f_35;
				f_35 = f_13;
				f_13 = f_14;
				f_14 = f_35;
				f_35 = f_26;
				f_26 = f_27;
				f_27 = f_35;
				f_35 = f_30;
				f_30 = f_32;
				f_32 = f_35;
				i_36 = i_22;
				i_22 = i_23;
				i_23 = i_36;
				i_36 = i_29;
				i_29 = i_31;
				i_31 = i_36;
			} else {
				f_35 = f_7;
				f_7 = f_9;
				f_9 = f_35;
				f_35 = f_4;
				f_4 = f_6;
				f_6 = f_35;
				f_35 = f_10;
				f_10 = f_12;
				f_12 = f_35;
				f_35 = f_16;
				f_16 = f_18;
				f_18 = f_35;
				f_35 = f_19;
				f_19 = f_21;
				f_21 = f_35;
				f_35 = f_13;
				f_13 = f_15;
				f_15 = f_35;
				f_35 = f_26;
				f_26 = f_28;
				f_28 = f_35;
				f_35 = f_30;
				f_30 = f_34;
				f_34 = f_35;
				i_36 = i_22;
				i_22 = i_24;
				i_24 = i_36;
				i_36 = i_29;
				i_29 = i_33;
				i_33 = i_36;
			}
		}

		int i_37;
		if (i_29 != this.anInt1692) {
			this.anIntArray1693 = this.aClass505_Sub3_1686.method14359(i_29);
			if (this.anIntArray1693 == null) {
				this.anInt1674 = 255 - (i_22 >> 24 & 0xff);
				i_37 = Class335.anIntArray3916[Class372.method6362(this.aClass505_Sub3_1686.method14362(i_29), 266546494) & 0xffff];
				i_36 = ~0xffffff | (i_37 >> 16 & 0xff) * (i_22 >> 16 & 0xff) << 8 & 0xff0000 | (i_22 >> 8 & 0xff) * (i_37 >> 8 & 0xff) & 0xff00 | (i_37 & 0xff) * (i_22 & 0xff) >> 8;
				this.method2425(true, true, false, f_4, f_5, f_6, f_7, f_8, f_9, f_10, f_11, f_12, Class302.method5364(i_36, i_25, f_26), Class302.method5364(i_36, i_25, f_27), Class302.method5364(i_36, i_25, f_28));
				return;
			}

			this.anInt1694 = this.aClass505_Sub3_1686.method14377(i_29) ? 64 : this.aClass505_Sub3_1686.anInt9005;
			this.anInt1691 = this.anInt1694 - 1;
			this.anInt1697 = this.aClass505_Sub3_1686.method14361(i_29);
		}

		this.aFloat1696 = f_30;
		if (this.anInt1688 != i_31) {
			this.anIntArray1698 = this.aClass505_Sub3_1686.method14359(i_31);
			if (this.anIntArray1698 == null) {
				this.anInt1674 = 255 - (i_22 >> 24 & 0xff);
				i_37 = Class335.anIntArray3916[Class372.method6362(this.aClass505_Sub3_1686.method14362(i_31), 1213792412) & 0xffff];
				i_36 = ~0xffffff | (i_37 >> 16 & 0xff) * (i_22 >> 16 & 0xff) << 8 & 0xff0000 | (i_22 >> 8 & 0xff) * (i_37 >> 8 & 0xff) & 0xff00 | (i_37 & 0xff) * (i_22 & 0xff) >> 8;
				this.method2425(true, true, false, f_4, f_5, f_6, f_7, f_8, f_9, f_10, f_11, f_12, Class302.method5364(i_36, i_25, f_26), Class302.method5364(i_36, i_25, f_27), Class302.method5364(i_36, i_25, f_28));
				return;
			}

			this.anInt1701 = this.aClass505_Sub3_1686.method14377(i_31) ? 64 : this.aClass505_Sub3_1686.anInt9005;
			this.anInt1699 = this.anInt1701 - 1;
		}

		this.aFloat1695 = f_32;
		if (i_33 != this.anInt1704) {
			this.anIntArray1673 = this.aClass505_Sub3_1686.method14359(i_33);
			if (this.anIntArray1673 == null) {
				this.anInt1674 = 255 - (i_22 >> 24 & 0xff);
				i_37 = Class335.anIntArray3916[Class372.method6362(this.aClass505_Sub3_1686.method14362(i_33), 1237545137) & 0xffff];
				i_36 = ~0xffffff | (i_37 >> 16 & 0xff) * (i_22 >> 16 & 0xff) << 8 & 0xff0000 | (i_22 >> 8 & 0xff) * (i_37 >> 8 & 0xff) & 0xff00 | (i_37 & 0xff) * (i_22 & 0xff) >> 8;
				this.method2425(true, true, false, (float) ((int) f_4), (float) ((int) f_5), (float) ((int) f_6), (float) ((int) f_7), (float) ((int) f_8), (float) ((int) f_9), (float) ((int) f_10), (float) ((int) f_11), (float) ((int) f_12), Class302.method5364(i_36, i_25, f_26), Class302.method5364(i_36, i_25, f_27), Class302.method5364(i_36, i_25, f_28));
				return;
			}

			this.anInt1706 = this.aClass505_Sub3_1686.method14377(i_33) ? 64 : this.aClass505_Sub3_1686.anInt9005;
			this.anInt1707 = this.anInt1706 - 1;
		}

		this.aFloat1681 = f_34;
		f_16 /= f_13;
		f_17 /= f_14;
		f_18 /= f_15;
		f_19 /= f_13;
		f_20 /= f_14;
		f_21 /= f_15;
		f_10 = 1.0F / f_10;
		f_11 = 1.0F / f_11;
		f_12 = 1.0F / f_12;
		f_13 = 1.0F / f_13;
		f_14 = 1.0F / f_14;
		f_15 = 1.0F / f_15;
		f_35 = (float) (i_22 >> 24 & 0xff);
		float f_38 = (float) (i_23 >> 24 & 0xff);
		float f_39 = (float) (i_24 >> 24 & 0xff);
		float f_40 = (float) (i_22 >> 16 & 0xff);
		float f_41 = (float) (i_23 >> 16 & 0xff);
		float f_42 = (float) (i_24 >> 16 & 0xff);
		float f_43 = (float) (i_22 >> 8 & 0xff);
		float f_44 = (float) (i_23 >> 8 & 0xff);
		float f_45 = (float) (i_24 >> 8 & 0xff);
		float f_46 = (float) (i_22 & 0xff);
		float f_47 = (float) (i_23 & 0xff);
		float f_48 = (float) (i_24 & 0xff);
		float f_49 = 1.0F;
		float f_50 = 0.0F;
		float f_51 = 0.0F;
		float f_52 = 0.0F;
		float f_53 = 1.0F;
		float f_54 = 0.0F;
		float f_55 = 0.0F;
		float f_56 = 0.0F;
		float f_57 = 0.0F;
		float f_58 = 0.0F;
		float f_59 = 0.0F;
		float f_60 = 0.0F;
		float f_61 = 0.0F;
		float f_62 = 0.0F;
		float f_63 = 0.0F;
		float f_64 = 0.0F;
		float f_65 = 0.0F;
		float f_66 = 0.0F;
		float f_67;
		if (f_5 != f_4) {
			f_67 = f_5 - f_4;
			f_55 = (f_8 - f_7) / f_67;
			f_56 = (f_11 - f_10) / f_67;
			f_57 = (f_14 - f_13) / f_67;
			f_58 = (f_17 - f_16) / f_67;
			f_59 = (f_20 - f_19) / f_67;
			f_60 = (f_27 - f_26) / f_67;
			f_61 = (f_38 - f_35) / f_67;
			f_62 = (f_41 - f_40) / f_67;
			f_63 = (f_44 - f_43) / f_67;
			f_64 = (f_47 - f_46) / f_67;
			f_65 = (f_50 - f_49) / f_67;
			f_66 = (f_53 - f_52) / f_67;
		}

		f_67 = 0.0F;
		float f_68 = 0.0F;
		float f_69 = 0.0F;
		float f_70 = 0.0F;
		float f_71 = 0.0F;
		float f_72 = 0.0F;
		float f_73 = 0.0F;
		float f_74 = 0.0F;
		float f_75 = 0.0F;
		float f_76 = 0.0F;
		float f_77 = 0.0F;
		float f_78 = 0.0F;
		float f_79;
		if (f_6 != f_5) {
			f_79 = f_6 - f_5;
			f_67 = (f_9 - f_8) / f_79;
			f_68 = (f_12 - f_11) / f_79;
			f_69 = (f_15 - f_14) / f_79;
			f_70 = (f_18 - f_17) / f_79;
			f_71 = (f_21 - f_20) / f_79;
			f_72 = (f_28 - f_27) / f_79;
			f_73 = (f_39 - f_38) / f_79;
			f_74 = (f_42 - f_41) / f_79;
			f_75 = (f_45 - f_44) / f_79;
			f_76 = (f_48 - f_47) / f_79;
			f_77 = (f_51 - f_50) / f_79;
			f_78 = (f_54 - f_53) / f_79;
		}

		f_79 = 0.0F;
		float f_80 = 0.0F;
		float f_81 = 0.0F;
		float f_82 = 0.0F;
		float f_83 = 0.0F;
		float f_84 = 0.0F;
		float f_85 = 0.0F;
		float f_86 = 0.0F;
		float f_87 = 0.0F;
		float f_88 = 0.0F;
		float f_89 = 0.0F;
		float f_90 = 0.0F;
		if (f_4 != f_6) {
			float f_91 = f_4 - f_6;
			f_79 = (f_7 - f_9) / f_91;
			f_80 = (f_10 - f_12) / f_91;
			f_81 = (f_13 - f_15) / f_91;
			f_82 = (f_16 - f_18) / f_91;
			f_83 = (f_19 - f_21) / f_91;
			f_84 = (f_26 - f_28) / f_91;
			f_85 = (f_35 - f_39) / f_91;
			f_86 = (f_40 - f_42) / f_91;
			f_87 = (f_43 - f_45) / f_91;
			f_88 = (f_46 - f_48) / f_91;
			f_89 = (f_49 - f_51) / f_91;
			f_90 = (f_52 - f_54) / f_91;
		}

		if (f_4 < (float) this.anInt1700) {
			if (f_5 > (float) this.anInt1700) {
				f_5 = (float) this.anInt1700;
			}

			if (f_6 > (float) this.anInt1700) {
				f_6 = (float) this.anInt1700;
			}

			if (f_5 < f_6) {
				f_9 = f_7;
				f_12 = f_10;
				f_15 = f_13;
				f_18 = f_16;
				f_21 = f_19;
				f_28 = f_26;
				f_39 = f_35;
				f_42 = f_40;
				f_45 = f_43;
				f_48 = f_46;
				f_51 = f_49;
				f_54 = f_52;
				if (f_4 < 0.0F) {
					f_7 -= f_55 * f_4;
					f_9 -= f_79 * f_4;
					f_10 -= f_56 * f_4;
					f_12 -= f_80 * f_4;
					f_13 -= f_57 * f_4;
					f_15 -= f_81 * f_4;
					f_16 -= f_58 * f_4;
					f_18 -= f_82 * f_4;
					f_19 -= f_59 * f_4;
					f_21 -= f_83 * f_4;
					f_26 -= f_60 * f_4;
					f_28 -= f_84 * f_4;
					f_35 -= f_61 * f_4;
					f_39 -= f_85 * f_4;
					f_40 -= f_62 * f_4;
					f_42 -= f_86 * f_4;
					f_43 -= f_63 * f_4;
					f_45 -= f_87 * f_4;
					f_46 -= f_64 * f_4;
					f_48 -= f_88 * f_4;
					f_49 -= f_65 * f_4;
					f_51 -= f_89 * f_4;
					f_52 -= f_66 * f_4;
					f_54 -= f_90 * f_4;
					f_4 = 0.0F;
				}

				if (f_5 < 0.0F) {
					f_8 -= f_67 * f_5;
					f_11 -= f_68 * f_5;
					f_14 -= f_69 * f_5;
					f_17 -= f_70 * f_5;
					f_20 -= f_71 * f_5;
					f_27 -= f_72 * f_5;
					f_38 -= f_73 * f_5;
					f_41 -= f_74 * f_5;
					f_44 -= f_75 * f_5;
					f_47 -= f_76 * f_5;
					f_50 -= f_77 * f_5;
					f_53 -= f_78 * f_5;
					f_5 = 0.0F;
				}

				if ((f_4 == f_5 || f_79 >= f_55) && (f_4 != f_5 || f_79 <= f_67)) {
					f_4 = (float) ((int) (f_4 + 0.5F));
					f_5 = (float) ((int) (f_5 + 0.5F));
					f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
					f_5 -= f_4;

					for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_7, (int) f_9, f_10, f_12, f_13, f_15, f_16, f_18, f_19, f_21, f_26, f_28, f_35, f_39, f_40, f_42, f_43, f_45, f_46, f_48, f_49, f_51, f_52, f_54);
						f_7 += f_55;
						f_9 += f_79;
						f_10 += f_56;
						f_12 += f_80;
						f_13 += f_57;
						f_15 += f_81;
						f_16 += f_58;
						f_18 += f_82;
						f_19 += f_59;
						f_21 += f_83;
						f_26 += f_60;
						f_28 += f_84;
						f_35 += f_61;
						f_39 += f_85;
						f_40 += f_62;
						f_42 += f_86;
						f_43 += f_63;
						f_45 += f_87;
						f_46 += f_64;
						f_48 += f_88;
						f_49 += f_65;
						f_51 += f_89;
						f_52 += f_66;
						f_54 += f_90;
					}

					while (--f_6 >= 0.0F) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_8, (int) f_9, f_11, f_12, f_14, f_15, f_17, f_18, f_20, f_21, f_27, f_28, f_38, f_39, f_41, f_42, f_44, f_45, f_47, f_48, f_50, f_51, f_53, f_54);
						f_8 += f_67;
						f_9 += f_79;
						f_11 += f_68;
						f_12 += f_80;
						f_14 += f_69;
						f_15 += f_81;
						f_17 += f_70;
						f_18 += f_82;
						f_20 += f_71;
						f_21 += f_83;
						f_27 += f_72;
						f_28 += f_84;
						f_38 += f_73;
						f_39 += f_85;
						f_41 += f_74;
						f_42 += f_86;
						f_44 += f_75;
						f_45 += f_87;
						f_47 += f_76;
						f_48 += f_88;
						f_50 += f_77;
						f_51 += f_89;
						f_53 += f_78;
						f_54 += f_90;
						f_4 += (float) this.anInt1705;
					}
				} else {
					f_4 = (float) ((int) (f_4 + 0.5F));
					f_5 = (float) ((int) (f_5 + 0.5F));
					f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
					f_5 -= f_4;

					for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_9, (int) f_7, f_12, f_10, f_15, f_13, f_18, f_16, f_21, f_19, f_28, f_26, f_39, f_35, f_42, f_40, f_45, f_43, f_48, f_46, f_51, f_49, f_54, f_52);
						f_7 += f_55;
						f_9 += f_79;
						f_10 += f_56;
						f_12 += f_80;
						f_13 += f_57;
						f_15 += f_81;
						f_16 += f_58;
						f_18 += f_82;
						f_19 += f_59;
						f_21 += f_83;
						f_26 += f_60;
						f_28 += f_84;
						f_35 += f_61;
						f_39 += f_85;
						f_40 += f_62;
						f_42 += f_86;
						f_43 += f_63;
						f_45 += f_87;
						f_46 += f_64;
						f_48 += f_88;
						f_49 += f_65;
						f_51 += f_89;
						f_52 += f_66;
						f_54 += f_90;
					}

					while (--f_6 >= 0.0F) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_9, (int) f_8, f_12, f_11, f_15, f_14, f_18, f_17, f_21, f_20, f_28, f_27, f_39, f_38, f_42, f_41, f_45, f_44, f_48, f_47, f_51, f_50, f_54, f_53);
						f_8 += f_67;
						f_9 += f_79;
						f_11 += f_68;
						f_12 += f_80;
						f_14 += f_69;
						f_15 += f_81;
						f_17 += f_70;
						f_18 += f_82;
						f_20 += f_71;
						f_21 += f_83;
						f_27 += f_72;
						f_28 += f_84;
						f_38 += f_73;
						f_39 += f_85;
						f_41 += f_74;
						f_42 += f_86;
						f_44 += f_75;
						f_45 += f_87;
						f_47 += f_76;
						f_48 += f_88;
						f_50 += f_77;
						f_51 += f_89;
						f_53 += f_78;
						f_54 += f_90;
						f_4 += (float) this.anInt1705;
					}
				}
			} else {
				f_8 = f_7;
				f_11 = f_10;
				f_14 = f_13;
				f_17 = f_16;
				f_20 = f_19;
				f_27 = f_26;
				f_38 = f_35;
				f_41 = f_40;
				f_44 = f_43;
				f_47 = f_46;
				f_50 = f_49;
				f_53 = f_52;
				if (f_4 < 0.0F) {
					f_7 -= f_55 * f_4;
					f_8 -= f_79 * f_4;
					f_10 -= f_56 * f_4;
					f_11 -= f_80 * f_4;
					f_13 -= f_57 * f_4;
					f_14 -= f_81 * f_4;
					f_16 -= f_58 * f_4;
					f_17 -= f_82 * f_4;
					f_19 -= f_59 * f_4;
					f_20 -= f_83 * f_4;
					f_26 -= f_60 * f_4;
					f_27 -= f_84 * f_4;
					f_35 -= f_61 * f_4;
					f_38 -= f_85 * f_4;
					f_40 -= f_62 * f_4;
					f_41 -= f_86 * f_4;
					f_43 -= f_63 * f_4;
					f_44 -= f_87 * f_4;
					f_46 -= f_64 * f_4;
					f_47 -= f_88 * f_4;
					f_49 -= f_65 * f_4;
					f_50 -= f_89 * f_4;
					f_52 -= f_66 * f_4;
					f_53 -= f_90 * f_4;
					f_4 = 0.0F;
				}

				if (f_6 < 0.0F) {
					f_9 -= f_67 * f_6;
					f_12 -= f_68 * f_6;
					f_15 -= f_69 * f_6;
					f_18 -= f_70 * f_6;
					f_21 -= f_71 * f_6;
					f_28 -= f_72 * f_6;
					f_39 -= f_73 * f_6;
					f_42 -= f_74 * f_6;
					f_45 -= f_75 * f_6;
					f_48 -= f_76 * f_6;
					f_51 -= f_77 * f_6;
					f_54 -= f_78 * f_6;
					f_6 = 0.0F;
				}

				if (f_4 != f_6 && f_79 < f_55 || f_4 == f_6 && f_67 > f_55) {
					f_4 = (float) ((int) (f_4 + 0.5F));
					f_6 = (float) ((int) (f_6 + 0.5F));
					f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
					f_6 -= f_4;

					for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_8, (int) f_7, f_11, f_10, f_14, f_13, f_17, f_16, f_20, f_19, f_27, f_26, f_38, f_35, f_41, f_40, f_44, f_43, f_47, f_46, f_50, f_49, f_53, f_52);
						f_7 += f_55;
						f_8 += f_79;
						f_10 += f_56;
						f_11 += f_80;
						f_13 += f_57;
						f_14 += f_81;
						f_16 += f_58;
						f_17 += f_82;
						f_19 += f_59;
						f_20 += f_83;
						f_26 += f_60;
						f_27 += f_84;
						f_35 += f_61;
						f_38 += f_85;
						f_40 += f_62;
						f_41 += f_86;
						f_43 += f_63;
						f_44 += f_87;
						f_46 += f_64;
						f_47 += f_88;
						f_49 += f_65;
						f_50 += f_89;
						f_52 += f_66;
						f_53 += f_90;
					}

					while (--f_5 >= 0.0F) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_9, (int) f_7, f_12, f_10, f_15, f_13, f_18, f_16, f_21, f_19, f_28, f_26, f_39, f_35, f_42, f_40, f_45, f_43, f_48, f_46, f_51, f_49, f_54, f_52);
						f_9 += f_67;
						f_7 += f_55;
						f_12 += f_68;
						f_10 += f_56;
						f_15 += f_69;
						f_13 += f_57;
						f_18 += f_70;
						f_16 += f_58;
						f_21 += f_71;
						f_19 += f_59;
						f_28 += f_72;
						f_26 += f_60;
						f_39 += f_73;
						f_35 += f_61;
						f_42 += f_74;
						f_40 += f_62;
						f_45 += f_75;
						f_43 += f_63;
						f_48 += f_76;
						f_46 += f_64;
						f_51 += f_77;
						f_49 += f_65;
						f_54 += f_78;
						f_52 += f_66;
						f_4 += (float) this.anInt1705;
					}
				} else {
					f_4 = (float) ((int) (f_4 + 0.5F));
					f_6 = (float) ((int) (f_6 + 0.5F));
					f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
					f_6 -= f_4;

					for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_7, (int) f_8, f_10, f_11, f_13, f_14, f_16, f_17, f_19, f_20, f_26, f_27, f_35, f_38, f_40, f_41, f_43, f_44, f_46, f_47, f_49, f_50, f_52, f_53);
						f_8 += f_79;
						f_7 += f_55;
						f_11 += f_80;
						f_10 += f_56;
						f_14 += f_81;
						f_13 += f_57;
						f_17 += f_82;
						f_16 += f_58;
						f_20 += f_83;
						f_19 += f_59;
						f_27 += f_84;
						f_26 += f_60;
						f_38 += f_85;
						f_35 += f_61;
						f_41 += f_86;
						f_40 += f_62;
						f_44 += f_87;
						f_43 += f_63;
						f_47 += f_88;
						f_46 += f_64;
						f_50 += f_89;
						f_49 += f_65;
						f_53 += f_90;
						f_52 += f_66;
					}

					while (--f_5 >= 0.0F) {
						this.method2427(true, false, this.anIntArray1689, (int) f_4, (int) f_7, (int) f_9, f_10, f_12, f_13, f_15, f_16, f_18, f_19, f_21, f_26, f_28, f_35, f_39, f_40, f_42, f_43, f_45, f_46, f_48, f_49, f_51, f_52, f_54);
						f_7 += f_55;
						f_9 += f_67;
						f_10 += f_56;
						f_12 += f_68;
						f_13 += f_57;
						f_15 += f_69;
						f_16 += f_58;
						f_18 += f_70;
						f_19 += f_59;
						f_21 += f_71;
						f_26 += f_60;
						f_28 += f_72;
						f_35 += f_61;
						f_39 += f_73;
						f_40 += f_62;
						f_42 += f_74;
						f_43 += f_63;
						f_45 += f_75;
						f_46 += f_64;
						f_48 += f_76;
						f_49 += f_65;
						f_51 += f_77;
						f_52 += f_66;
						f_54 += f_78;
						f_4 += (float) this.anInt1705;
					}
				}
			}
		}

	}

	final void method2422(boolean bool_1, boolean bool_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16) {
		if (this.aBool1708) {
			if (i_8 > this.anInt1684) {
				i_8 = this.anInt1684;
			}

			if (i_7 < 0) {
				i_7 = 0;
			}
		}

		if (i_7 < i_8) {
			int i_17;
			int i_18;
			int i_19;
			int i_20;
			int i_21;
			int i_22;
			if (this.aBool1676) {
				i_4 += i_7;
				f_11 += f_12 * (float) i_7;
				f_13 += f_14 * (float) i_7;
				f_15 += f_16 * (float) i_7;
				if (this.aBool1675) {
					i_6 = i_8 - i_7 >> 2;
					f_12 *= 4.0F;
					f_14 *= 4.0F;
					f_16 *= 4.0F;
					if (this.anInt1674 == 0) {
						if (i_6 > 0) {
							do {
								i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								ints_3[i_4++] = i_5;
								ints_3[i_4++] = i_5;
								ints_3[i_4++] = i_5;
								ints_3[i_4++] = i_5;
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

							do {
								ints_3[i_4++] = i_5;
								--i_6;
							} while (i_6 > 0);
						}
					} else if (!this.aBool1672) {
						i_17 = this.anInt1674;
						i_19 = 256 - this.anInt1674;
						if (i_6 > 0) {
							do {
								i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);
								i_18 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4++] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									ints_3[i_4++] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									ints_3[i_4++] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									ints_3[i_4++] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
								}

								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
							i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);

							do {
								i_18 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4++] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
								}

								--i_6;
							} while (i_6 > 0);
						}
					} else {
						if (i_6 > 0) {
							do {
								i_5 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								i_19 = i_4++;
								i_21 = ints_3[i_19];
								i_20 = i_5 + i_21;
								i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
								ints_3[i_19] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								i_20 = i_4++;
								int i_23 = ints_3[i_20];
								int i_24 = i_5 + i_23;
								int i_25 = (i_23 & 0xff00ff) + (i_5 & 0xff00ff);
								i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
								ints_3[i_20] = ~0xffffff | i_24 - i_23 | i_23 - (i_23 >>> 8);
								i_24 = i_4++;
								int i_26 = ints_3[i_24];
								int i_27 = i_5 + i_26;
								int i_28 = (i_26 & 0xff00ff) + (i_5 & 0xff00ff);
								i_26 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
								ints_3[i_24] = ~0xffffff | i_27 - i_26 | i_26 - (i_26 >>> 8);
								i_27 = i_4++;
								int i_29 = ints_3[i_27];
								int i_30 = i_5 + i_29;
								int i_31 = (i_29 & 0xff00ff) + (i_5 & 0xff00ff);
								i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
								ints_3[i_27] = ~0xffffff | i_30 - i_29 | i_29 - (i_29 >>> 8);
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

							do {
								i_19 = i_4++;
								i_21 = ints_3[i_19];
								i_20 = i_5 + i_21;
								i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
								i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
								ints_3[i_19] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								--i_6;
							} while (i_6 > 0);
						}
					}
				} else {
					i_6 = i_8 - i_7;
					if (this.anInt1674 == 0) {
						do {
							ints_3[i_4++] = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
							f_11 += f_12;
							f_13 += f_14;
							f_15 += f_16;
							--i_6;
						} while (i_6 > 0);
					} else if (!this.aBool1672) {
						i_17 = this.anInt1674;
						i_19 = 256 - this.anInt1674;

						do {
							i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
							f_11 += f_12;
							f_13 += f_14;
							f_15 += f_16;
							i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);
							i_18 = ints_3[i_4];
							if (bool_2) {
								ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
							} else {
								ints_3[i_4++] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
							}

							--i_6;
						} while (i_6 > 0);
					} else {
						do {
							i_19 = i_4++;
							i_18 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
							i_21 = ints_3[i_19];
							i_20 = i_18 + i_21;
							i_22 = (i_18 & 0xff00ff) + (i_21 & 0xff00ff);
							i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
							ints_3[i_19] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
							f_11 += f_12;
							f_13 += f_14;
							f_15 += f_16;
							--i_6;
						} while (i_6 > 0);
					}
				}
			} else {
				i_4 += i_7 - 1;
				f_9 += f_10 * (float) i_7;
				f_11 += f_12 * (float) i_7;
				f_13 += f_14 * (float) i_7;
				f_15 += f_16 * (float) i_7;
				if (this.aClass185_1687.aBool2334) {
					if (this.aBool1675) {
						i_6 = i_8 - i_7 >> 2;
						f_12 *= 4.0F;
						f_14 *= 4.0F;
						f_16 *= 4.0F;
						if (this.anInt1674 == 0) {
							if (i_6 > 0) {
								do {
									i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
									f_11 += f_12;
									f_13 += f_14;
									f_15 += f_16;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										ints_3[i_4] = i_5;
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										ints_3[i_4] = i_5;
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										ints_3[i_4] = i_5;
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										ints_3[i_4] = i_5;
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									--i_6;
								} while (i_6 > 0);
							}

							i_6 = i_8 - i_7 & 0x3;
							if (i_6 > 0) {
								i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

								do {
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										ints_3[i_4] = i_5;
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									--i_6;
								} while (i_6 > 0);
							}
						} else if (!this.aBool1672) {
							i_17 = this.anInt1674;
							i_19 = 256 - this.anInt1674;
							if (i_6 > 0) {
								do {
									i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
									f_11 += f_12;
									f_13 += f_14;
									f_15 += f_16;
									i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_18 = ints_3[i_4];
										if (bool_2) {
											ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										} else {
											ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										}

										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_18 = ints_3[i_4];
										if (bool_2) {
											ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										} else {
											ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										}

										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_18 = ints_3[i_4];
										if (bool_2) {
											ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										} else {
											ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										}

										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_18 = ints_3[i_4];
										if (bool_2) {
											ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										} else {
											ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										}

										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									--i_6;
								} while (i_6 > 0);
							}

							i_6 = i_8 - i_7 & 0x3;
							if (i_6 > 0) {
								i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);

								do {
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_18 = ints_3[i_4];
										if (bool_2) {
											ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										} else {
											ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										}

										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									--i_6;
								} while (i_6 > 0);
							}
						} else {
							if (i_6 > 0) {
								do {
									i_5 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
									f_11 += f_12;
									f_13 += f_14;
									f_15 += f_16;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_21 = ints_3[i_4];
										i_20 = i_5 + i_21;
										i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
										i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
										ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_21 = ints_3[i_4];
										i_20 = i_5 + i_21;
										i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
										i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
										ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_21 = ints_3[i_4];
										i_20 = i_5 + i_21;
										i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
										i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
										ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_21 = ints_3[i_4];
										i_20 = i_5 + i_21;
										i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
										i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
										ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									--i_6;
								} while (i_6 > 0);
							}

							i_6 = i_8 - i_7 & 0x3;
							if (i_6 > 0) {
								i_5 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

								do {
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_21 = ints_3[i_4];
										i_20 = i_5 + i_21;
										i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
										i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
										ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									--i_6;
								} while (i_6 > 0);
							}
						}
					} else {
						i_6 = i_8 - i_7;
						if (this.anInt1674 != 0) {
							if (this.aBool1672) {
								do {
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_18 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
										i_21 = ints_3[i_4];
										i_20 = i_18 + i_21;
										i_22 = (i_18 & 0xff00ff) + (i_21 & 0xff00ff);
										i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
										ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									f_11 += f_12;
									f_13 += f_14;
									f_15 += f_16;
									--i_6;
								} while (i_6 > 0);
							} else {
								i_17 = this.anInt1674;
								i_19 = 256 - this.anInt1674;

								do {
									++i_4;
									if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
										i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
										i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);
										i_18 = ints_3[i_4];
										if (bool_2) {
											ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										} else {
											ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
										}

										if (bool_1) {
											this.aFloatArray1690[i_4] = f_9;
										}
									}

									f_9 += f_10;
									f_11 += f_12;
									f_13 += f_14;
									f_15 += f_16;
									--i_6;
								} while (i_6 > 0);
							}
						} else {
							do {
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
									if (bool_1) {
										this.aFloatArray1690[i_4] = f_9;
									}
								}

								f_9 += f_10;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								--i_6;
							} while (i_6 > 0);
						}
					}
				} else if (this.aBool1675) {
					i_6 = i_8 - i_7 >> 2;
					f_12 *= 4.0F;
					f_14 *= 4.0F;
					f_16 *= 4.0F;
					if (this.anInt1674 == 0) {
						if (i_6 > 0) {
							do {
								i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
								}

								f_9 += f_10;
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

							do {
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
								}

								f_9 += f_10;
								--i_6;
							} while (i_6 > 0);
						}
					} else if (!this.aBool1672) {
						i_17 = this.anInt1674;
						i_19 = 256 - this.anInt1674;
						if (i_6 > 0) {
							do {
								i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_18 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									}
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_18 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									}
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_18 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									}
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_18 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									}
								}

								f_9 += f_10;
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
							i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);

							do {
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_18 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									}
								}

								f_9 += f_10;
								--i_6;
							} while (i_6 > 0);
						}
					} else {
						if (i_6 > 0) {
							do {
								i_5 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_21 = ints_3[i_4];
									i_20 = i_5 + i_21;
									i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
									i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
									ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_21 = ints_3[i_4];
									i_20 = i_5 + i_21;
									i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
									i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
									ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_21 = ints_3[i_4];
									i_20 = i_5 + i_21;
									i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
									i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
									ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								}

								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_21 = ints_3[i_4];
									i_20 = i_5 + i_21;
									i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
									i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
									ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								}

								f_9 += f_10;
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

							do {
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_21 = ints_3[i_4];
									i_20 = i_5 + i_21;
									i_22 = (i_21 & 0xff00ff) + (i_5 & 0xff00ff);
									i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
									ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								}

								f_9 += f_10;
								--i_6;
							} while (i_6 > 0);
						}
					}
				} else {
					i_6 = i_8 - i_7;
					if (this.anInt1674 != 0) {
						if (this.aBool1672) {
							do {
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_18 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
									i_21 = ints_3[i_4];
									i_20 = i_18 + i_21;
									i_22 = (i_18 & 0xff00ff) + (i_21 & 0xff00ff);
									i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
									ints_3[i_4] = ~0xffffff | i_20 - i_21 | i_21 - (i_21 >>> 8);
								}

								f_9 += f_10;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								--i_6;
							} while (i_6 > 0);
						} else {
							i_17 = this.anInt1674;
							i_19 = 256 - this.anInt1674;

							do {
								++i_4;
								if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
									i_5 = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
									i_5 = (i_19 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_5 & 0xff00) >> 8 & 0xff00);
									i_18 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
									}
								}

								f_9 += f_10;
								f_11 += f_12;
								f_13 += f_14;
								f_15 += f_16;
								--i_6;
							} while (i_6 > 0);
						}
					} else {
						do {
							++i_4;
							if (!bool_1 || f_9 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = ~0xffffff | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
							}

							f_9 += f_10;
							f_11 += f_12;
							f_13 += f_14;
							f_15 += f_16;
							--i_6;
						} while (i_6 > 0);
					}
				}
			}
		}

	}

	ChoppyItemFixClass(HardwareRenderer hardwarerenderer_1, Class185 class185_2) {
		this.aClass505_Sub3_1686 = hardwarerenderer_1;
		this.aClass185_1687 = class185_2;
		this.anInt1705 = this.aClass505_Sub3_1686.anInt8980;
		this.anIntArray1689 = this.aClass505_Sub3_1686.anIntArray8979;
		this.aFloatArray1690 = this.aClass505_Sub3_1686.aFloatArray9010;
	}

	final void method2424(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, int i_22, int i_23, int i_24, int i_25, float f_26, float f_27, float f_28, int i_29) {
		if (!bool_1) {
			this.method2428(false, bool_2, bool_3, f_4, f_5, f_6, f_7, f_8, f_9, f_10, f_11, f_12, 0);
		} else {
			int i_30;
			if (i_29 != this.anInt1692) {
				this.anIntArray1693 = this.aClass505_Sub3_1686.method14359(i_29);
				if (this.anIntArray1693 == null) {
					this.anInt1674 = 255 - (i_22 >> 24 & 0xff);
					int i_74 = Class335.anIntArray3916[Class372.method6362(this.aClass505_Sub3_1686.method14362(i_29), 638838203) & 0xffff];
					i_30 = ~0xffffff | (i_74 >> 16 & 0xff) * (i_22 >> 16 & 0xff) << 8 & 0xff0000 | (i_22 >> 8 & 0xff) * (i_74 >> 8 & 0xff) & 0xff00 | (i_74 & 0xff) * (i_22 & 0xff) >> 8;
					this.method2425(true, bool_2, bool_3, f_4, f_5, f_6, f_7, f_8, f_9, f_10, f_11, f_12, Class302.method5364(i_30, i_25, f_26), Class302.method5364(i_30, i_25, f_27), Class302.method5364(i_30, i_25, f_28));
					return;
				}

				this.anInt1694 = this.aClass505_Sub3_1686.method14377(i_29) ? 64 : this.aClass505_Sub3_1686.anInt9005;
				this.anInt1691 = this.anInt1694 - 1;
				this.anInt1697 = this.aClass505_Sub3_1686.method14361(i_29);
				this.aBool1703 = this.aClass505_Sub3_1686.method14403(i_29);
			}

			this.anInt1677 = i_25;
			float f_31;
			if (f_4 > f_5 || f_4 > f_6) {
				if (f_5 <= f_6) {
					f_31 = f_7;
					f_7 = f_8;
					f_8 = f_31;
					f_31 = f_4;
					f_4 = f_5;
					f_5 = f_31;
					f_31 = f_10;
					f_10 = f_11;
					f_11 = f_31;
					f_31 = f_16;
					f_16 = f_17;
					f_17 = f_31;
					f_31 = f_19;
					f_19 = f_20;
					f_20 = f_31;
					f_31 = f_13;
					f_13 = f_14;
					f_14 = f_31;
					f_31 = f_26;
					f_26 = f_27;
					f_27 = f_31;
					i_30 = i_22;
					i_22 = i_23;
					i_23 = i_30;
				} else {
					f_31 = f_7;
					f_7 = f_9;
					f_9 = f_31;
					f_31 = f_4;
					f_4 = f_6;
					f_6 = f_31;
					f_31 = f_10;
					f_10 = f_12;
					f_12 = f_31;
					f_31 = f_16;
					f_16 = f_18;
					f_18 = f_31;
					f_31 = f_19;
					f_19 = f_21;
					f_21 = f_31;
					f_31 = f_13;
					f_13 = f_15;
					f_15 = f_31;
					f_31 = f_26;
					f_26 = f_28;
					f_28 = f_31;
					i_30 = i_22;
					i_22 = i_24;
					i_24 = i_30;
				}
			}

			f_16 /= f_13;
			f_17 /= f_14;
			f_18 /= f_15;
			f_19 /= f_13;
			f_20 /= f_14;
			f_21 /= f_15;
			f_10 = 1.0F / f_10;
			f_11 = 1.0F / f_11;
			f_12 = 1.0F / f_12;
			f_13 = 1.0F / f_13;
			f_14 = 1.0F / f_14;
			f_15 = 1.0F / f_15;
			f_31 = (float) (i_22 >> 24 & 0xff);
			float f_32 = (float) (i_23 >> 24 & 0xff);
			float f_33 = (float) (i_24 >> 24 & 0xff);
			float f_34 = (float) (i_22 >> 16 & 0xff);
			float f_35 = (float) (i_23 >> 16 & 0xff);
			float f_36 = (float) (i_24 >> 16 & 0xff);
			float f_37 = (float) (i_22 >> 8 & 0xff);
			float f_38 = (float) (i_23 >> 8 & 0xff);
			float f_39 = (float) (i_24 >> 8 & 0xff);
			float f_40 = (float) (i_22 & 0xff);
			float f_41 = (float) (i_23 & 0xff);
			float f_42 = (float) (i_24 & 0xff);
			float f_43 = 0.0F;
			float f_44 = 0.0F;
			float f_45 = 0.0F;
			float f_46 = 0.0F;
			float f_47 = 0.0F;
			float f_48 = 0.0F;
			float f_49 = 0.0F;
			float f_50 = 0.0F;
			float f_51 = 0.0F;
			float f_52 = 0.0F;
			float f_53;
			if (f_5 != f_4) {
				f_53 = f_5 - f_4;
				f_43 = (f_8 - f_7) / f_53;
				f_44 = (f_11 - f_10) / f_53;
				f_45 = (f_14 - f_13) / f_53;
				f_46 = (f_17 - f_16) / f_53;
				f_47 = (f_20 - f_19) / f_53;
				f_48 = (f_27 - f_26) / f_53;
				f_49 = (f_32 - f_31) / f_53;
				f_50 = (f_35 - f_34) / f_53;
				f_51 = (f_38 - f_37) / f_53;
				f_52 = (f_41 - f_40) / f_53;
			}

			f_53 = 0.0F;
			float f_54 = 0.0F;
			float f_55 = 0.0F;
			float f_56 = 0.0F;
			float f_57 = 0.0F;
			float f_58 = 0.0F;
			float f_59 = 0.0F;
			float f_60 = 0.0F;
			float f_61 = 0.0F;
			float f_62 = 0.0F;
			float f_63;
			if (f_6 != f_5) {
				f_63 = f_6 - f_5;
				f_53 = (f_9 - f_8) / f_63;
				f_54 = (f_12 - f_11) / f_63;
				f_55 = (f_15 - f_14) / f_63;
				f_56 = (f_18 - f_17) / f_63;
				f_57 = (f_21 - f_20) / f_63;
				f_58 = (f_28 - f_27) / f_63;
				f_59 = (f_33 - f_32) / f_63;
				f_60 = (f_36 - f_35) / f_63;
				f_61 = (f_39 - f_38) / f_63;
				f_62 = (f_42 - f_41) / f_63;
			}

			f_63 = 0.0F;
			float f_64 = 0.0F;
			float f_65 = 0.0F;
			float f_66 = 0.0F;
			float f_67 = 0.0F;
			float f_68 = 0.0F;
			float f_69 = 0.0F;
			float f_70 = 0.0F;
			float f_71 = 0.0F;
			float f_72 = 0.0F;
			if (f_4 != f_6) {
				float f_73 = f_4 - f_6;
				f_63 = (f_7 - f_9) / f_73;
				f_64 = (f_10 - f_12) / f_73;
				f_65 = (f_13 - f_15) / f_73;
				f_66 = (f_16 - f_18) / f_73;
				f_67 = (f_19 - f_21) / f_73;
				f_68 = (f_26 - f_28) / f_73;
				f_69 = (f_31 - f_33) / f_73;
				f_70 = (f_34 - f_36) / f_73;
				f_71 = (f_37 - f_39) / f_73;
				f_72 = (f_40 - f_42) / f_73;
			}

			if (f_4 < (float) this.anInt1700) {
				if (f_5 > (float) this.anInt1700) {
					f_5 = (float) this.anInt1700;
				}

				if (f_6 > (float) this.anInt1700) {
					f_6 = (float) this.anInt1700;
				}

				if (f_5 < f_6) {
					f_9 = f_7;
					f_12 = f_10;
					f_15 = f_13;
					f_18 = f_16;
					f_21 = f_19;
					f_28 = f_26;
					f_33 = f_31;
					f_36 = f_34;
					f_39 = f_37;
					f_42 = f_40;
					if (f_4 < 0.0F) {
						f_7 -= f_43 * f_4;
						f_9 -= f_63 * f_4;
						f_10 -= f_44 * f_4;
						f_12 -= f_64 * f_4;
						f_13 -= f_45 * f_4;
						f_15 -= f_65 * f_4;
						f_16 -= f_46 * f_4;
						f_18 -= f_66 * f_4;
						f_19 -= f_47 * f_4;
						f_21 -= f_67 * f_4;
						f_26 -= f_48 * f_4;
						f_28 -= f_68 * f_4;
						f_31 -= f_49 * f_4;
						f_33 -= f_69 * f_4;
						f_34 -= f_49 * f_4;
						f_36 -= f_69 * f_4;
						f_37 -= f_49 * f_4;
						f_39 -= f_69 * f_4;
						f_40 -= f_49 * f_4;
						f_42 -= f_69 * f_4;
						f_4 = 0.0F;
					}

					if (f_5 < 0.0F) {
						f_8 -= f_53 * f_5;
						f_11 -= f_54 * f_5;
						f_14 -= f_55 * f_5;
						f_17 -= f_56 * f_5;
						f_20 -= f_57 * f_5;
						f_27 -= f_58 * f_5;
						f_32 -= f_59 * f_5;
						f_35 -= f_60 * f_5;
						f_38 -= f_61 * f_5;
						f_41 -= f_62 * f_5;
						f_5 = 0.0F;
					}

					if (f_4 != f_5 && f_63 < f_43 || f_4 == f_5 && f_63 > f_53) {
						f_4 = (float) ((int) (f_4 + 0.5F));
						f_5 = (float) ((int) (f_5 + 0.5F));
						f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
						f_5 -= f_4;

						for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_9, (int) f_7, f_12, f_10, f_15, f_13, f_18, f_16, f_21, f_19, f_28, f_26, f_33, f_31, f_36, f_34, f_39, f_37, f_42, f_40);
							f_7 += f_43;
							f_9 += f_63;
							f_10 += f_44;
							f_12 += f_64;
							f_13 += f_45;
							f_15 += f_65;
							f_16 += f_46;
							f_18 += f_66;
							f_19 += f_47;
							f_21 += f_67;
							f_26 += f_48;
							f_28 += f_68;
							f_31 += f_49;
							f_33 += f_69;
							f_34 += f_50;
							f_36 += f_70;
							f_37 += f_51;
							f_39 += f_71;
							f_40 += f_52;
							f_42 += f_72;
						}

						while (--f_6 >= 0.0F) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_9, (int) f_8, f_12, f_11, f_15, f_14, f_18, f_17, f_21, f_20, f_28, f_27, f_33, f_32, f_36, f_35, f_39, f_38, f_42, f_41);
							f_8 += f_53;
							f_9 += f_63;
							f_11 += f_54;
							f_12 += f_64;
							f_14 += f_55;
							f_15 += f_65;
							f_17 += f_56;
							f_18 += f_66;
							f_20 += f_57;
							f_21 += f_67;
							f_27 += f_58;
							f_28 += f_68;
							f_32 += f_59;
							f_33 += f_69;
							f_35 += f_60;
							f_36 += f_70;
							f_38 += f_61;
							f_39 += f_71;
							f_41 += f_62;
							f_42 += f_72;
							f_4 += (float) this.anInt1705;
						}
					} else {
						f_4 = (float) ((int) (f_4 + 0.5F));
						f_5 = (float) ((int) (f_5 + 0.5F));
						f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
						f_5 -= f_4;

						for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_7, (int) f_9, f_10, f_12, f_13, f_15, f_16, f_18, f_19, f_21, f_26, f_28, f_31, f_33, f_34, f_36, f_37, f_39, f_40, f_42);
							f_7 += f_43;
							f_9 += f_63;
							f_10 += f_44;
							f_12 += f_64;
							f_13 += f_45;
							f_15 += f_65;
							f_16 += f_46;
							f_18 += f_66;
							f_19 += f_47;
							f_21 += f_67;
							f_26 += f_48;
							f_28 += f_68;
							f_31 += f_49;
							f_33 += f_69;
							f_34 += f_50;
							f_36 += f_70;
							f_37 += f_51;
							f_39 += f_71;
							f_40 += f_52;
							f_42 += f_72;
						}

						while (--f_6 >= 0.0F) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_8, (int) f_9, f_11, f_12, f_14, f_15, f_17, f_18, f_20, f_21, f_27, f_28, f_32, f_33, f_35, f_36, f_38, f_39, f_41, f_42);
							f_8 += f_53;
							f_9 += f_63;
							f_11 += f_54;
							f_12 += f_64;
							f_14 += f_55;
							f_15 += f_65;
							f_17 += f_56;
							f_18 += f_66;
							f_20 += f_57;
							f_21 += f_67;
							f_27 += f_58;
							f_28 += f_68;
							f_32 += f_59;
							f_33 += f_69;
							f_35 += f_60;
							f_36 += f_70;
							f_38 += f_61;
							f_39 += f_71;
							f_41 += f_62;
							f_42 += f_72;
							f_4 += (float) this.anInt1705;
						}
					}
				} else {
					f_8 = f_7;
					f_11 = f_10;
					f_14 = f_13;
					f_17 = f_16;
					f_20 = f_19;
					f_27 = f_26;
					f_32 = f_31;
					f_35 = f_34;
					f_38 = f_37;
					f_41 = f_40;
					if (f_4 < 0.0F) {
						f_7 -= f_43 * f_4;
						f_8 -= f_63 * f_4;
						f_10 -= f_44 * f_4;
						f_11 -= f_64 * f_4;
						f_13 -= f_45 * f_4;
						f_14 -= f_65 * f_4;
						f_16 -= f_46 * f_4;
						f_17 -= f_66 * f_4;
						f_19 -= f_47 * f_4;
						f_20 -= f_67 * f_4;
						f_26 -= f_48 * f_4;
						f_27 -= f_68 * f_4;
						f_31 -= f_49 * f_4;
						f_32 -= f_69 * f_4;
						f_34 -= f_49 * f_4;
						f_35 -= f_69 * f_4;
						f_37 -= f_49 * f_4;
						f_38 -= f_69 * f_4;
						f_40 -= f_49 * f_4;
						f_41 -= f_69 * f_4;
						f_4 = 0.0F;
					}

					if (f_6 < 0.0F) {
						f_9 -= f_53 * f_6;
						f_12 -= f_54 * f_6;
						f_15 -= f_55 * f_6;
						f_18 -= f_56 * f_6;
						f_21 -= f_57 * f_6;
						f_28 -= f_58 * f_6;
						f_33 -= f_59 * f_6;
						f_36 -= f_60 * f_6;
						f_39 -= f_61 * f_6;
						f_42 -= f_62 * f_6;
						f_6 = 0.0F;
					}

					if ((f_4 == f_6 || f_63 >= f_43) && (f_4 != f_6 || f_53 <= f_43)) {
						f_4 = (float) ((int) (f_4 + 0.5F));
						f_6 = (float) ((int) (f_6 + 0.5F));
						f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
						f_6 -= f_4;

						for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_7, (int) f_8, f_10, f_11, f_13, f_14, f_16, f_17, f_19, f_20, f_26, f_27, f_31, f_32, f_34, f_35, f_37, f_38, f_40, f_41);
							f_8 += f_63;
							f_7 += f_43;
							f_11 += f_64;
							f_10 += f_44;
							f_14 += f_65;
							f_13 += f_45;
							f_17 += f_66;
							f_16 += f_46;
							f_20 += f_67;
							f_19 += f_47;
							f_27 += f_68;
							f_26 += f_48;
							f_32 += f_69;
							f_31 += f_49;
							f_35 += f_70;
							f_34 += f_50;
							f_38 += f_71;
							f_37 += f_51;
							f_41 += f_72;
							f_40 += f_52;
						}

						while (--f_5 >= 0.0F) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_7, (int) f_9, f_10, f_12, f_13, f_15, f_16, f_18, f_19, f_21, f_26, f_28, f_31, f_33, f_34, f_36, f_37, f_39, f_40, f_42);
							f_7 += f_43;
							f_9 += f_53;
							f_10 += f_44;
							f_12 += f_54;
							f_13 += f_45;
							f_15 += f_55;
							f_16 += f_46;
							f_18 += f_56;
							f_19 += f_47;
							f_21 += f_57;
							f_26 += f_48;
							f_28 += f_58;
							f_31 += f_49;
							f_33 += f_59;
							f_34 += f_50;
							f_36 += f_60;
							f_37 += f_51;
							f_39 += f_61;
							f_40 += f_52;
							f_42 += f_62;
							f_4 += (float) this.anInt1705;
						}
					} else {
						f_4 = (float) ((int) (f_4 + 0.5F));
						f_6 = (float) ((int) (f_6 + 0.5F));
						f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
						f_6 -= f_4;

						for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_8, (int) f_7, f_11, f_10, f_14, f_13, f_17, f_16, f_20, f_19, f_27, f_26, f_32, f_31, f_35, f_34, f_38, f_37, f_41, f_40);
							f_7 += f_43;
							f_8 += f_63;
							f_10 += f_44;
							f_11 += f_64;
							f_13 += f_45;
							f_14 += f_65;
							f_16 += f_46;
							f_17 += f_66;
							f_19 += f_47;
							f_20 += f_67;
							f_26 += f_48;
							f_27 += f_68;
							f_31 += f_49;
							f_32 += f_69;
							f_34 += f_50;
							f_35 += f_70;
							f_37 += f_51;
							f_38 += f_71;
							f_40 += f_52;
							f_41 += f_72;
						}

						while (--f_5 >= 0.0F) {
							this.method2434(bool_2, bool_3, this.anIntArray1689, this.anIntArray1693, (int) f_4, (int) f_9, (int) f_7, f_12, f_10, f_15, f_13, f_18, f_16, f_21, f_19, f_28, f_26, f_33, f_31, f_36, f_34, f_39, f_37, f_42, f_40);
							f_9 += f_53;
							f_7 += f_43;
							f_12 += f_54;
							f_10 += f_44;
							f_15 += f_55;
							f_13 += f_45;
							f_18 += f_56;
							f_16 += f_46;
							f_21 += f_57;
							f_19 += f_47;
							f_28 += f_58;
							f_26 += f_48;
							f_33 += f_59;
							f_31 += f_49;
							f_36 += f_60;
							f_34 += f_50;
							f_39 += f_61;
							f_37 += f_51;
							f_42 += f_62;
							f_40 += f_52;
							f_4 += (float) this.anInt1705;
						}
					}
				}
			}
		}

	}

	final void method2425(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, int i_13, int i_14, int i_15) {
		if (!bool_1) {
			this.method2428(false, bool_2, bool_3, f_4, f_5, f_6, f_7, f_8, f_9, f_10, f_11, f_12, 0);
		} else if (this.aBool1671) {
			this.aClass505_Sub3_1686.method8429((int) f_7, (int) f_4, (int) f_8, (int) f_5, ~0xffffff | i_13, (byte) 9);
			this.aClass505_Sub3_1686.method8429((int) f_8, (int) f_5, (int) f_9, (int) f_6, ~0xffffff | i_13, (byte) -29);
			this.aClass505_Sub3_1686.method8429((int) f_9, (int) f_6, (int) f_7, (int) f_4, ~0xffffff | i_13, (byte) -6);
		} else {
			float f_16 = f_8 - f_7;
			float f_17 = f_5 - f_4;
			float f_18 = f_9 - f_7;
			float f_19 = f_6 - f_4;
			float f_20 = f_11 - f_10;
			float f_21 = f_12 - f_10;
			float f_22 = (float) ((i_14 & 0xff0000) - (i_13 & 0xff0000));
			float f_23 = (float) ((i_15 & 0xff0000) - (i_13 & 0xff0000));
			float f_24 = (float) ((i_14 & 0xff00) - (i_13 & 0xff00));
			float f_25 = (float) ((i_15 & 0xff00) - (i_13 & 0xff00));
			float f_26 = (float) ((i_14 & 0xff) - (i_13 & 0xff));
			float f_27 = (float) ((i_15 & 0xff) - (i_13 & 0xff));
			float f_28;
			if (f_6 != f_5) {
				f_28 = (f_9 - f_8) / (f_6 - f_5);
			} else {
				f_28 = 0.0F;
			}

			float f_29;
			if (f_5 != f_4) {
				f_29 = f_16 / f_17;
			} else {
				f_29 = 0.0F;
			}

			float f_30;
			if (f_6 != f_4) {
				f_30 = f_18 / f_19;
			} else {
				f_30 = 0.0F;
			}

			float f_31 = f_16 * f_19 - f_18 * f_17;
			if (f_31 != 0.0F) {
				float f_32 = (f_20 * f_19 - f_21 * f_17) / f_31;
				float f_33 = (f_21 * f_16 - f_20 * f_18) / f_31;
				float f_34 = (f_22 * f_19 - f_23 * f_17) / f_31;
				float f_35 = (f_23 * f_16 - f_22 * f_18) / f_31;
				float f_36 = (f_24 * f_19 - f_25 * f_17) / f_31;
				float f_37 = (f_25 * f_16 - f_24 * f_18) / f_31;
				float f_38 = (f_26 * f_19 - f_27 * f_17) / f_31;
				float f_39 = (f_27 * f_16 - f_26 * f_18) / f_31;
				float f_40;
				float f_41;
				float f_42;
				if (f_4 <= f_5 && f_4 <= f_6) {
					if (f_4 < (float) this.anInt1700) {
						if (f_5 > (float) this.anInt1700) {
							f_5 = (float) this.anInt1700;
						}

						if (f_6 > (float) this.anInt1700) {
							f_6 = (float) this.anInt1700;
						}

						f_10 = f_10 - f_32 * f_7 + f_32;
						f_41 = (float) (i_13 & 0xff0000) - f_34 * f_7 + f_34;
						f_42 = (float) (i_13 & 0xff00) - f_36 * f_7 + f_36;
						f_40 = (float) (i_13 & 0xff) - f_38 * f_7 + f_38;
						if (f_5 < f_6) {
							f_9 = f_7;
							if (f_4 < 0.0F) {
								f_9 = f_7 - f_30 * f_4;
								f_7 -= f_29 * f_4;
								f_10 -= f_33 * f_4;
								f_41 -= f_35 * f_4;
								f_42 -= f_37 * f_4;
								f_40 -= f_39 * f_4;
								f_4 = 0.0F;
							}

							if (f_5 < 0.0F) {
								f_8 -= f_28 * f_5;
								f_5 = 0.0F;
							}

							if ((f_4 == f_5 || f_30 >= f_29) && (f_4 != f_5 || f_30 <= f_28)) {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
								f_5 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_7, (int) f_9, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_30;
									f_7 += f_29;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_6 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_8, (int) f_9, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_30;
									f_8 += f_28;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_4 += (float) this.anInt1705;
								}
							} else {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
								f_5 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_9, (int) f_7, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_30;
									f_7 += f_29;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_6 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_9, (int) f_8, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_30;
									f_8 += f_28;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_4 += (float) this.anInt1705;
								}
							}
						} else {
							f_8 = f_7;
							if (f_4 < 0.0F) {
								f_8 = f_7 - f_30 * f_4;
								f_7 -= f_29 * f_4;
								f_10 -= f_33 * f_4;
								f_41 -= f_35 * f_4;
								f_42 -= f_37 * f_4;
								f_40 -= f_39 * f_4;
								f_4 = 0.0F;
							}

							if (f_6 < 0.0F) {
								f_9 -= f_28 * f_6;
								f_6 = 0.0F;
							}

							if (f_4 != f_6 && f_30 < f_29 || f_4 == f_6 && f_28 > f_29) {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
								f_6 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_8, (int) f_7, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_8 += f_30;
									f_7 += f_29;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_5 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_9, (int) f_7, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_28;
									f_7 += f_29;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_4 += (float) this.anInt1705;
								}
							} else {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
								f_6 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_7, (int) f_8, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_8 += f_30;
									f_7 += f_29;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_5 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_7, (int) f_9, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_28;
									f_7 += f_29;
									f_10 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_4 += (float) this.anInt1705;
								}
							}
						}
					}
				} else if (f_5 <= f_6) {
					if (f_5 < (float) this.anInt1700) {
						if (f_6 > (float) this.anInt1700) {
							f_6 = (float) this.anInt1700;
						}

						if (f_4 > (float) this.anInt1700) {
							f_4 = (float) this.anInt1700;
						}

						f_11 = f_11 - f_32 * f_8 + f_32;
						f_41 = (float) (i_14 & 0xff0000) - f_34 * f_8 + f_34;
						f_42 = (float) (i_14 & 0xff00) - f_36 * f_8 + f_36;
						f_40 = (float) (i_14 & 0xff) - f_38 * f_8 + f_38;
						if (f_6 < f_4) {
							f_7 = f_8;
							if (f_5 < 0.0F) {
								f_7 = f_8 - f_29 * f_5;
								f_8 -= f_28 * f_5;
								f_11 -= f_33 * f_5;
								f_41 -= f_35 * f_5;
								f_42 -= f_37 * f_5;
								f_40 -= f_39 * f_5;
								f_5 = 0.0F;
							}

							if (f_6 < 0.0F) {
								f_9 -= f_30 * f_6;
								f_6 = 0.0F;
							}

							if ((f_5 == f_6 || f_29 >= f_28) && (f_5 != f_6 || f_29 <= f_30)) {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F)) - f_6;
								f_6 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_6 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_8, (int) f_7, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_7 += f_29;
									f_8 += f_28;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_4 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_9, (int) f_7, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_7 += f_29;
									f_9 += f_30;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_5 += (float) this.anInt1705;
								}
							} else {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F)) - f_6;
								f_6 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_6 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_7, (int) f_8, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_7 += f_29;
									f_8 += f_28;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_4 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_7, (int) f_9, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_7 += f_29;
									f_9 += f_30;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_5 += (float) this.anInt1705;
								}
							}
						} else {
							f_9 = f_8;
							if (f_5 < 0.0F) {
								f_9 = f_8 - f_29 * f_5;
								f_8 -= f_28 * f_5;
								f_11 -= f_33 * f_5;
								f_41 -= f_35 * f_5;
								f_42 -= f_37 * f_5;
								f_40 -= f_39 * f_5;
								f_5 = 0.0F;
							}

							if (f_4 < 0.0F) {
								f_7 -= f_30 * f_4;
								f_4 = 0.0F;
							}

							if (f_29 < f_28) {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_4;
								f_4 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_4 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_9, (int) f_8, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_29;
									f_8 += f_28;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_6 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_7, (int) f_8, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_7 += f_30;
									f_8 += f_28;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_5 += (float) this.anInt1705;
								}
							} else {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_4;
								f_4 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_4 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_8, (int) f_9, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_9 += f_29;
									f_8 += f_28;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
								}

								while (--f_6 >= 0.0F) {
									this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_8, (int) f_7, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
									f_7 += f_30;
									f_8 += f_28;
									f_11 += f_33;
									f_41 += f_35;
									f_42 += f_37;
									f_40 += f_39;
									f_5 += (float) this.anInt1705;
								}
							}
						}
					}
				} else if (f_6 < (float) this.anInt1700) {
					if (f_4 > (float) this.anInt1700) {
						f_4 = (float) this.anInt1700;
					}

					if (f_5 > (float) this.anInt1700) {
						f_5 = (float) this.anInt1700;
					}

					f_12 = f_12 - f_32 * f_9 + f_32;
					f_41 = (float) (i_15 & 0xff0000) - f_34 * f_9 + f_34;
					f_42 = (float) (i_15 & 0xff00) - f_36 * f_9 + f_36;
					f_40 = (float) (i_15 & 0xff) - f_38 * f_9 + f_38;
					if (f_4 < f_5) {
						f_8 = f_9;
						if (f_6 < 0.0F) {
							f_8 = f_9 - f_28 * f_6;
							f_9 -= f_30 * f_6;
							f_12 -= f_33 * f_6;
							f_41 -= f_35 * f_6;
							f_42 -= f_37 * f_6;
							f_40 -= f_39 * f_6;
							f_6 = 0.0F;
						}

						if (f_4 < 0.0F) {
							f_7 -= f_29 * f_4;
							f_4 = 0.0F;
						}

						if (f_28 < f_30) {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F)) - f_4;
							f_4 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_4 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_8, (int) f_9, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_8 += f_28;
								f_9 += f_30;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
							}

							while (--f_5 >= 0.0F) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_8, (int) f_7, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_8 += f_28;
								f_7 += f_29;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
								f_6 += (float) this.anInt1705;
							}
						} else {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F)) - f_4;
							f_4 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_4 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_9, (int) f_8, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_8 += f_28;
								f_9 += f_30;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
							}

							while (--f_5 >= 0.0F) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_7, (int) f_8, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_8 += f_28;
								f_7 += f_29;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
								f_6 += (float) this.anInt1705;
							}
						}
					} else {
						f_7 = f_9;
						if (f_6 < 0.0F) {
							f_7 = f_9 - f_28 * f_6;
							f_9 -= f_30 * f_6;
							f_12 -= f_33 * f_6;
							f_41 -= f_35 * f_6;
							f_42 -= f_37 * f_6;
							f_40 -= f_39 * f_6;
							f_6 = 0.0F;
						}

						if (f_5 < 0.0F) {
							f_8 -= f_29 * f_5;
							f_5 = 0.0F;
						}

						if (f_28 < f_30) {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F)) - f_5;
							f_5 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_5 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_7, (int) f_9, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_7 += f_28;
								f_9 += f_30;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
							}

							while (--f_4 >= 0.0F) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_8, (int) f_9, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_8 += f_29;
								f_9 += f_30;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
								f_6 += (float) this.anInt1705;
							}
						} else {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F)) - f_5;
							f_5 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_5 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_9, (int) f_7, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_7 += f_28;
								f_9 += f_30;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
							}

							while (--f_4 >= 0.0F) {
								this.method2422(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_9, (int) f_8, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
								f_8 += f_29;
								f_9 += f_30;
								f_12 += f_33;
								f_41 += f_35;
								f_42 += f_37;
								f_40 += f_39;
								f_6 += (float) this.anInt1705;
							}
						}
					}
				}
			}
		}

	}

	final void method2426(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15) {
		if (!bool_1) {
			this.method2428(false, bool_2, bool_3, f_4, f_5, f_6, f_7, f_8, f_9, f_10, f_11, f_12, 0);
		} else if (this.aBool1671) {
			this.aClass505_Sub3_1686.method8429((int) f_7, (int) f_4, (int) f_8, (int) f_5, Class335.anIntArray3916[(int) f_13 & 0xffff], (byte) -26);
			this.aClass505_Sub3_1686.method8429((int) f_8, (int) f_5, (int) f_9, (int) f_6, Class335.anIntArray3916[(int) f_13 & 0xffff], (byte) -7);
			this.aClass505_Sub3_1686.method8429((int) f_9, (int) f_6, (int) f_7, (int) f_4, Class335.anIntArray3916[(int) f_13 & 0xffff], (byte) 19);
		} else {
			float f_16 = f_8 - f_7;
			float f_17 = f_5 - f_4;
			float f_18 = f_9 - f_7;
			float f_19 = f_6 - f_4;
			float f_20 = f_14 - f_13;
			float f_21 = f_15 - f_13;
			float f_22 = f_11 - f_10;
			float f_23 = f_12 - f_10;
			float f_24;
			if (f_6 != f_5) {
				f_24 = (f_9 - f_8) / (f_6 - f_5);
			} else {
				f_24 = 0.0F;
			}

			float f_25;
			if (f_5 != f_4) {
				f_25 = f_16 / f_17;
			} else {
				f_25 = 0.0F;
			}

			float f_26;
			if (f_6 != f_4) {
				f_26 = f_18 / f_19;
			} else {
				f_26 = 0.0F;
			}

			float f_27 = f_16 * f_19 - f_18 * f_17;
			if (f_27 != 0.0F) {
				float f_28 = (f_20 * f_19 - f_21 * f_17) / f_27;
				float f_29 = (f_21 * f_16 - f_20 * f_18) / f_27;
				float f_30 = (f_22 * f_19 - f_23 * f_17) / f_27;
				float f_31 = (f_23 * f_16 - f_22 * f_18) / f_27;
				if (f_4 <= f_5 && f_4 <= f_6) {
					if (f_4 < (float) this.anInt1700) {
						if (f_5 > (float) this.anInt1700) {
							f_5 = (float) this.anInt1700;
						}

						if (f_6 > (float) this.anInt1700) {
							f_6 = (float) this.anInt1700;
						}

						f_13 = f_13 - f_28 * f_7 + f_28;
						f_10 = f_10 - f_30 * f_7 + f_30;
						if (f_5 < f_6) {
							f_9 = f_7;
							if (f_4 < 0.0F) {
								f_9 = f_7 - f_26 * f_4;
								f_7 -= f_25 * f_4;
								f_13 -= f_29 * f_4;
								f_10 -= f_31 * f_4;
								f_4 = 0.0F;
							}

							if (f_5 < 0.0F) {
								f_8 -= f_24 * f_5;
								f_5 = 0.0F;
							}

							if (f_4 != f_5 && f_26 < f_25 || f_4 == f_5 && f_26 > f_24) {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
								f_5 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_9, (int) f_7, f_13, f_28, f_10, f_30);
									f_9 += f_26;
									f_7 += f_25;
									f_13 += f_29;
									f_10 += f_31;
								}

								while (--f_6 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_9, (int) f_8, f_13, f_28, f_10, f_30);
									f_9 += f_26;
									f_8 += f_24;
									f_13 += f_29;
									f_10 += f_31;
									f_4 += (float) this.anInt1705;
								}
							} else {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
								f_5 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_7, (int) f_9, f_13, f_28, f_10, f_30);
									f_9 += f_26;
									f_7 += f_25;
									f_13 += f_29;
									f_10 += f_31;
								}

								while (--f_6 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_8, (int) f_9, f_13, f_28, f_10, f_30);
									f_9 += f_26;
									f_8 += f_24;
									f_13 += f_29;
									f_10 += f_31;
									f_4 += (float) this.anInt1705;
								}
							}
						} else {
							f_8 = f_7;
							if (f_4 < 0.0F) {
								f_8 = f_7 - f_26 * f_4;
								f_7 -= f_25 * f_4;
								f_13 -= f_29 * f_4;
								f_10 -= f_31 * f_4;
								f_4 = 0.0F;
							}

							if (f_6 < 0.0F) {
								f_9 -= f_24 * f_6;
								f_6 = 0.0F;
							}

							if ((f_4 == f_6 || f_26 >= f_25) && (f_4 != f_6 || f_24 <= f_25)) {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
								f_6 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_7, (int) f_8, f_13, f_28, f_10, f_30);
									f_8 += f_26;
									f_7 += f_25;
									f_13 += f_29;
									f_10 += f_31;
								}

								while (--f_5 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_7, (int) f_9, f_13, f_28, f_10, f_30);
									f_9 += f_24;
									f_7 += f_25;
									f_13 += f_29;
									f_10 += f_31;
									f_4 += (float) this.anInt1705;
								}
							} else {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
								f_6 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_8, (int) f_7, f_13, f_28, f_10, f_30);
									f_8 += f_26;
									f_7 += f_25;
									f_13 += f_29;
									f_10 += f_31;
								}

								while (--f_5 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_4, 0, 0, (int) f_9, (int) f_7, f_13, f_28, f_10, f_30);
									f_9 += f_24;
									f_7 += f_25;
									f_13 += f_29;
									f_10 += f_31;
									f_4 += (float) this.anInt1705;
								}
							}
						}
					}
				} else if (f_5 <= f_6) {
					if (f_5 < (float) this.anInt1700) {
						if (f_6 > (float) this.anInt1700) {
							f_6 = (float) this.anInt1700;
						}

						if (f_4 > (float) this.anInt1700) {
							f_4 = (float) this.anInt1700;
						}

						f_14 = f_14 - f_28 * f_8 + f_28;
						f_11 = f_11 - f_30 * f_8 + f_30;
						if (f_6 < f_4) {
							f_7 = f_8;
							if (f_5 < 0.0F) {
								f_7 = f_8 - f_25 * f_5;
								f_8 -= f_24 * f_5;
								f_14 -= f_29 * f_5;
								f_11 -= f_31 * f_5;
								f_5 = 0.0F;
							}

							if (f_6 < 0.0F) {
								f_9 -= f_26 * f_6;
								f_6 = 0.0F;
							}

							if (f_5 != f_6 && f_25 < f_24 || f_5 == f_6 && f_25 > f_26) {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F)) - f_6;
								f_6 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_6 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_7, (int) f_8, f_14, f_28, f_11, f_30);
									f_7 += f_25;
									f_8 += f_24;
									f_14 += f_29;
									f_11 += f_31;
								}

								while (--f_4 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_7, (int) f_9, f_14, f_28, f_11, f_30);
									f_7 += f_25;
									f_9 += f_26;
									f_14 += f_29;
									f_11 += f_31;
									f_5 += (float) this.anInt1705;
								}
							} else {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F)) - f_6;
								f_6 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_6 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_8, (int) f_7, f_14, f_28, f_11, f_30);
									f_7 += f_25;
									f_8 += f_24;
									f_14 += f_29;
									f_11 += f_31;
								}

								while (--f_4 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_9, (int) f_7, f_14, f_28, f_11, f_30);
									f_7 += f_25;
									f_9 += f_26;
									f_14 += f_29;
									f_11 += f_31;
									f_5 += (float) this.anInt1705;
								}
							}
						} else {
							f_9 = f_8;
							if (f_5 < 0.0F) {
								f_9 = f_8 - f_25 * f_5;
								f_8 -= f_24 * f_5;
								f_14 -= f_29 * f_5;
								f_11 -= f_31 * f_5;
								f_5 = 0.0F;
							}

							if (f_4 < 0.0F) {
								f_7 -= f_26 * f_4;
								f_4 = 0.0F;
							}

							if (f_25 < f_24) {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_4;
								f_4 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_4 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_9, (int) f_8, f_14, f_28, f_11, f_30);
									f_9 += f_25;
									f_8 += f_24;
									f_14 += f_29;
									f_11 += f_31;
								}

								while (--f_6 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_7, (int) f_8, f_14, f_28, f_11, f_30);
									f_7 += f_26;
									f_8 += f_24;
									f_14 += f_29;
									f_11 += f_31;
									f_5 += (float) this.anInt1705;
								}
							} else {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_4;
								f_4 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_4 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_8, (int) f_9, f_14, f_28, f_11, f_30);
									f_9 += f_25;
									f_8 += f_24;
									f_14 += f_29;
									f_11 += f_31;
								}

								while (--f_6 >= 0.0F) {
									this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_5, 0, 0, (int) f_8, (int) f_7, f_14, f_28, f_11, f_30);
									f_7 += f_26;
									f_8 += f_24;
									f_14 += f_29;
									f_11 += f_31;
									f_5 += (float) this.anInt1705;
								}
							}
						}
					}
				} else if (f_6 < (float) this.anInt1700) {
					if (f_4 > (float) this.anInt1700) {
						f_4 = (float) this.anInt1700;
					}

					if (f_5 > (float) this.anInt1700) {
						f_5 = (float) this.anInt1700;
					}

					f_15 = f_15 - f_28 * f_9 + f_28;
					f_12 = f_12 - f_30 * f_9 + f_30;
					if (f_4 < f_5) {
						f_8 = f_9;
						if (f_6 < 0.0F) {
							f_8 = f_9 - f_24 * f_6;
							f_9 -= f_26 * f_6;
							f_15 -= f_29 * f_6;
							f_12 -= f_31 * f_6;
							f_6 = 0.0F;
						}

						if (f_4 < 0.0F) {
							f_7 -= f_25 * f_4;
							f_4 = 0.0F;
						}

						if (f_24 < f_26) {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F)) - f_4;
							f_4 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_4 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_8, (int) f_9, f_15, f_28, f_12, f_30);
								f_8 += f_24;
								f_9 += f_26;
								f_15 += f_29;
								f_12 += f_31;
							}

							while (--f_5 >= 0.0F) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_8, (int) f_7, f_15, f_28, f_12, f_30);
								f_8 += f_24;
								f_7 += f_25;
								f_15 += f_29;
								f_12 += f_31;
								f_6 += (float) this.anInt1705;
							}
						} else {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F)) - f_4;
							f_4 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_4 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_9, (int) f_8, f_15, f_28, f_12, f_30);
								f_8 += f_24;
								f_9 += f_26;
								f_15 += f_29;
								f_12 += f_31;
							}

							while (--f_5 >= 0.0F) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_7, (int) f_8, f_15, f_28, f_12, f_30);
								f_8 += f_24;
								f_7 += f_25;
								f_15 += f_29;
								f_12 += f_31;
								f_6 += (float) this.anInt1705;
							}
						}
					} else {
						f_7 = f_9;
						if (f_6 < 0.0F) {
							f_7 = f_9 - f_24 * f_6;
							f_9 -= f_26 * f_6;
							f_15 -= f_29 * f_6;
							f_12 -= f_31 * f_6;
							f_6 = 0.0F;
						}

						if (f_5 < 0.0F) {
							f_8 -= f_25 * f_5;
							f_5 = 0.0F;
						}

						if (f_24 < f_26) {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F)) - f_5;
							f_5 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_5 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_7, (int) f_9, f_15, f_28, f_12, f_30);
								f_7 += f_24;
								f_9 += f_26;
								f_15 += f_29;
								f_12 += f_31;
							}

							while (--f_4 >= 0.0F) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_8, (int) f_9, f_15, f_28, f_12, f_30);
								f_8 += f_25;
								f_9 += f_26;
								f_15 += f_29;
								f_12 += f_31;
								f_6 += (float) this.anInt1705;
							}
						} else {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F)) - f_5;
							f_5 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_5 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_9, (int) f_7, f_15, f_28, f_12, f_30);
								f_7 += f_24;
								f_9 += f_26;
								f_15 += f_29;
								f_12 += f_31;
							}

							while (--f_4 >= 0.0F) {
								this.method2443(bool_2, bool_3, this.anIntArray1689, (int) f_6, 0, 0, (int) f_9, (int) f_8, f_15, f_28, f_12, f_30);
								f_8 += f_25;
								f_9 += f_26;
								f_15 += f_29;
								f_12 += f_31;
								f_6 += (float) this.anInt1705;
							}
						}
					}
				}
			}
		}

	}

	final void method2427(boolean bool_1, boolean bool_2, int[] ints_3, int i_4, int i_5, int i_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, float f_22, float f_23, float f_24, float f_25, float f_26, float f_27, float f_28) {
		int i_29 = i_6 - i_5;
		float f_30 = 1.0F / (float) i_29;
		float f_31 = (f_8 - f_7) * f_30;
		float f_32 = (f_10 - f_9) * f_30;
		float f_33 = (f_12 - f_11) * f_30;
		float f_34 = (f_14 - f_13) * f_30;
		float f_35 = (f_16 - f_15) * f_30;
		float f_36 = (f_18 - f_17) * f_30;
		float f_37 = (f_20 - f_19) * f_30;
		float f_38 = (f_22 - f_21) * f_30;
		float f_39 = (f_24 - f_23) * f_30;
		float f_40 = (f_26 - f_25) * f_30;
		float f_41 = (f_28 - f_27) * f_30;
		if (this.aBool1708) {
			if (i_6 > this.anInt1684) {
				i_6 = this.anInt1684;
			}

			if (i_5 < 0) {
				f_7 -= f_31 * (float) i_5;
				f_9 -= f_32 * (float) i_5;
				f_11 -= f_33 * (float) i_5;
				f_13 -= f_34 * (float) i_5;
				f_15 -= f_35 * (float) i_5;
				f_17 -= f_36 * (float) i_5;
				f_19 -= f_37 * (float) i_5;
				f_21 -= f_38 * (float) i_5;
				f_23 -= f_39 * (float) i_5;
				f_25 -= f_40 * (float) i_5;
				f_27 -= f_41 * (float) i_5;
				i_5 = 0;
			}
		}

		if (i_5 < i_6) {
			i_29 = i_6 - i_5;

			for (i_4 += i_5; i_29-- > 0; f_27 += f_41) {
				float f_42 = 1.0F / f_7;
				float f_43 = 1.0F / f_9;
				if (!bool_1 || f_42 < this.aFloatArray1690[i_4]) {
					float f_44 = f_11 * f_43;
					float f_45 = f_13 * f_43;
					int i_46 = (int) (f_44 * (float) this.anInt1694 * this.aFloat1696) & this.anInt1691;
					int i_47 = (int) (f_45 * (float) this.anInt1694 * this.aFloat1696) & this.anInt1691;
					int i_48 = this.anIntArray1693[i_46 + i_47 * this.anInt1694];
					i_46 = (int) (f_44 * (float) this.anInt1701 * this.aFloat1695) & this.anInt1699;
					i_47 = (int) (f_45 * (float) this.anInt1701 * this.aFloat1695) & this.anInt1699;
					int i_49 = this.anIntArray1698[i_46 + i_47 * this.anInt1701];
					i_46 = (int) (f_44 * (float) this.anInt1706 * this.aFloat1681) & this.anInt1707;
					i_47 = (int) (f_45 * (float) this.anInt1706 * this.aFloat1681) & this.anInt1707;
					int i_50 = this.anIntArray1673[i_46 + i_47 * this.anInt1706];
					float f_51 = 1.0F - (f_25 + f_27);
					i_48 = ~0xffffff | (int) (f_25 * (float) (i_48 >> 16 & 0xff)) << 16 | (int) (f_25 * (float) (i_48 >> 8 & 0xff)) << 8 | (int) (f_25 * (float) (i_48 & 0xff));
					i_49 = ~0xffffff | (int) (f_27 * (float) (i_49 >> 16 & 0xff)) << 16 | (int) (f_27 * (float) (i_49 >> 8 & 0xff)) << 8 | (int) (f_27 * (float) (i_49 & 0xff));
					i_50 = ~0xffffff | (int) (f_51 * (float) (i_50 >> 16 & 0xff)) << 16 | (int) (f_51 * (float) (i_50 >> 8 & 0xff)) << 8 | (int) (f_51 * (float) (i_50 & 0xff));
					int i_52 = i_48 + i_49 + i_50;
					int i_53 = ~0xffffff | (int) (f_19 * (float) (i_52 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_21 * (float) (i_52 >> 8 & 0xff)) & 0xff00 | (int) (f_23 * (float) (i_52 & 0xff)) >> 8;
					if (f_15 != 0.0F) {
						int i_54 = (int) (255.0F - f_15);
						int i_55 = ((this.anInt1677 & 0xff00ff) * (int) f_15 & ~0xff00ff | (int) f_15 * (this.anInt1677 & 0xff00) & 0xff0000) >>> 8;
						i_53 = i_55 + (((i_53 & 0xff00ff) * i_54 & ~0xff00ff | i_54 * (i_53 & 0xff00) & 0xff0000) >>> 8);
					}

					if (bool_2) {
						ints_3[i_4] = ((int) f_17 | ints_3[i_4] >> 24) << 24 | i_53;
					} else {
						ints_3[i_4] = i_53;
					}

					if (bool_1) {
						this.aFloatArray1690[i_4] = f_42;
					}
				}

				++i_4;
				f_7 += f_31;
				f_9 += f_32;
				f_11 += f_33;
				f_13 += f_34;
				f_15 += f_35;
				f_17 += f_36;
				f_19 += f_37;
				f_21 += f_38;
				f_23 += f_39;
				f_25 += f_40;
			}
		}

	}

	final void method2428(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, int i_13) {
		if (this.aBool1671) {
			this.aClass505_Sub3_1686.method8429((int) f_7, (int) f_4, (int) f_8, (int) f_5, i_13, (byte) 39);
			this.aClass505_Sub3_1686.method8429((int) f_8, (int) f_5, (int) f_9, (int) f_6, i_13, (byte) -65);
			this.aClass505_Sub3_1686.method8429((int) f_9, (int) f_6, (int) f_7, (int) f_4, i_13, (byte) 63);
		} else {
			float f_14 = f_8 - f_7;
			float f_15 = f_5 - f_4;
			float f_16 = f_9 - f_7;
			float f_17 = f_6 - f_4;
			float f_18 = f_11 - f_10;
			float f_19 = f_12 - f_10;
			float f_20 = 0.0F;
			if (f_5 != f_4) {
				f_20 = (f_8 - f_7) / (f_5 - f_4);
			}

			float f_21 = 0.0F;
			if (f_6 != f_5) {
				f_21 = (f_9 - f_8) / (f_6 - f_5);
			}

			float f_22 = 0.0F;
			if (f_6 != f_4) {
				f_22 = (f_7 - f_9) / (f_4 - f_6);
			}

			float f_23 = f_14 * f_17 - f_16 * f_15;
			if (f_23 != 0.0F) {
				float f_24 = (f_18 * f_17 - f_19 * f_15) / f_23;
				float f_25 = (f_19 * f_14 - f_18 * f_16) / f_23;
				if (f_4 <= f_5 && f_4 <= f_6) {
					if (f_4 < (float) this.anInt1700) {
						if (f_5 > (float) this.anInt1700) {
							f_5 = (float) this.anInt1700;
						}

						if (f_6 > (float) this.anInt1700) {
							f_6 = (float) this.anInt1700;
						}

						f_10 = f_10 - f_24 * f_7 + f_24;
						if (f_5 < f_6) {
							f_9 = f_7;
							if (f_4 < 0.0F) {
								f_9 = f_7 - f_22 * f_4;
								f_7 -= f_20 * f_4;
								f_10 -= f_25 * f_4;
								f_4 = 0.0F;
							}

							if (f_5 < 0.0F) {
								f_8 -= f_21 * f_5;
								f_5 = 0.0F;
							}

							if (f_4 != f_5 && f_22 < f_20 || f_4 == f_5 && f_22 > f_21) {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
								f_5 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_9, (int) f_7, f_10, f_24);
									f_9 += f_22;
									f_7 += f_20;
									f_10 += f_25;
								}

								while (--f_6 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_9, (int) f_8, f_10, f_24);
									f_9 += f_22;
									f_8 += f_21;
									f_10 += f_25;
									f_4 += (float) this.anInt1705;
								}
							} else {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_5;
								f_5 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_5 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_7, (int) f_9, f_10, f_24);
									f_9 += f_22;
									f_7 += f_20;
									f_10 += f_25;
								}

								while (--f_6 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_8, (int) f_9, f_10, f_24);
									f_9 += f_22;
									f_8 += f_21;
									f_10 += f_25;
									f_4 += (float) this.anInt1705;
								}
							}
						} else {
							f_8 = f_7;
							if (f_4 < 0.0F) {
								f_8 = f_7 - f_22 * f_4;
								f_7 -= f_20 * f_4;
								f_10 -= f_25 * f_4;
								f_4 = 0.0F;
							}

							if (f_6 < 0.0F) {
								f_9 -= f_21 * f_6;
								f_6 = 0.0F;
							}

							if ((f_4 == f_6 || f_22 >= f_20) && (f_4 != f_6 || f_21 <= f_20)) {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
								f_6 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_7, (int) f_8, f_10, f_24);
									f_8 += f_22;
									f_7 += f_20;
									f_10 += f_25;
								}

								while (--f_5 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_7, (int) f_9, f_10, f_24);
									f_9 += f_21;
									f_7 += f_20;
									f_10 += f_25;
									f_4 += (float) this.anInt1705;
								}
							} else {
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_5 = (float) ((int) (f_5 + 0.5F)) - f_6;
								f_6 -= f_4;

								for (f_4 = (float) this.anIntArray1685[(int) f_4]; --f_6 >= 0.0F; f_4 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_8, (int) f_7, f_10, f_24);
									f_8 += f_22;
									f_7 += f_20;
									f_10 += f_25;
								}

								while (--f_5 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_4, i_13, 0, (int) f_9, (int) f_7, f_10, f_24);
									f_9 += f_21;
									f_7 += f_20;
									f_10 += f_25;
									f_4 += (float) this.anInt1705;
								}
							}
						}
					}
				} else if (f_5 <= f_6) {
					if (f_5 < (float) this.anInt1700) {
						if (f_6 > (float) this.anInt1700) {
							f_6 = (float) this.anInt1700;
						}

						if (f_4 > (float) this.anInt1700) {
							f_4 = (float) this.anInt1700;
						}

						f_11 = f_11 - f_24 * f_8 + f_24;
						if (f_6 < f_4) {
							f_7 = f_8;
							if (f_5 < 0.0F) {
								f_7 = f_8 - f_20 * f_5;
								f_8 -= f_21 * f_5;
								f_11 -= f_25 * f_5;
								f_5 = 0.0F;
							}

							if (f_6 < 0.0F) {
								f_9 -= f_22 * f_6;
								f_6 = 0.0F;
							}

							if ((f_5 == f_6 || f_20 >= f_21) && (f_5 != f_6 || f_20 <= f_22)) {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F)) - f_6;
								f_6 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_6 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_8, (int) f_7, f_11, f_24);
									f_7 += f_20;
									f_8 += f_21;
									f_11 += f_25;
								}

								while (--f_4 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_9, (int) f_7, f_11, f_24);
									f_7 += f_20;
									f_9 += f_22;
									f_11 += f_25;
									f_5 += (float) this.anInt1705;
								}
							} else {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F)) - f_6;
								f_6 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_6 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_7, (int) f_8, f_11, f_24);
									f_7 += f_20;
									f_8 += f_21;
									f_11 += f_25;
								}

								while (--f_4 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_7, (int) f_9, f_11, f_24);
									f_7 += f_20;
									f_9 += f_22;
									f_11 += f_25;
									f_5 += (float) this.anInt1705;
								}
							}
						} else {
							f_9 = f_8;
							if (f_5 < 0.0F) {
								f_9 = f_8 - f_20 * f_5;
								f_8 -= f_21 * f_5;
								f_11 -= f_25 * f_5;
								f_5 = 0.0F;
							}

							if (f_4 < 0.0F) {
								f_7 -= f_22 * f_4;
								f_4 = 0.0F;
							}

							if (f_20 < f_21) {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_4;
								f_4 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_4 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_9, (int) f_8, f_11, f_24);
									f_9 += f_20;
									f_8 += f_21;
									f_11 += f_25;
								}

								while (--f_6 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_7, (int) f_8, f_11, f_24);
									f_7 += f_22;
									f_8 += f_21;
									f_11 += f_25;
									f_5 += (float) this.anInt1705;
								}
							} else {
								f_5 = (float) ((int) (f_5 + 0.5F));
								f_4 = (float) ((int) (f_4 + 0.5F));
								f_6 = (float) ((int) (f_6 + 0.5F)) - f_4;
								f_4 -= f_5;

								for (f_5 = (float) this.anIntArray1685[(int) f_5]; --f_4 >= 0.0F; f_5 += (float) this.anInt1705) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_8, (int) f_9, f_11, f_24);
									f_9 += f_20;
									f_8 += f_21;
									f_11 += f_25;
								}

								while (--f_6 >= 0.0F) {
									this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_5, i_13, 0, (int) f_8, (int) f_7, f_11, f_24);
									f_7 += f_22;
									f_8 += f_21;
									f_11 += f_25;
									f_5 += (float) this.anInt1705;
								}
							}
						}
					}
				} else if (f_6 < (float) this.anInt1700) {
					if (f_4 > (float) this.anInt1700) {
						f_4 = (float) this.anInt1700;
					}

					if (f_5 > (float) this.anInt1700) {
						f_5 = (float) this.anInt1700;
					}

					f_12 = f_12 - f_24 * f_9 + f_24;
					if (f_4 < f_5) {
						f_8 = f_9;
						if (f_6 < 0.0F) {
							f_8 = f_9 - f_21 * f_6;
							f_9 -= f_22 * f_6;
							f_12 -= f_25 * f_6;
							f_6 = 0.0F;
						}

						if (f_4 < 0.0F) {
							f_7 -= f_20 * f_4;
							f_4 = 0.0F;
						}

						if (f_21 < f_22) {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F)) - f_4;
							f_4 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_4 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_8, (int) f_9, f_12, f_24);
								f_8 += f_21;
								f_9 += f_22;
								f_12 += f_25;
							}

							while (--f_5 >= 0.0F) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_8, (int) f_7, f_12, f_24);
								f_8 += f_21;
								f_7 += f_20;
								f_12 += f_25;
								f_6 += (float) this.anInt1705;
							}
						} else {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F)) - f_4;
							f_4 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_4 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_9, (int) f_8, f_12, f_24);
								f_8 += f_21;
								f_9 += f_22;
								f_12 += f_25;
							}

							while (--f_5 >= 0.0F) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_7, (int) f_8, f_12, f_24);
								f_8 += f_21;
								f_7 += f_20;
								f_12 += f_25;
								f_6 += (float) this.anInt1705;
							}
						}
					} else {
						f_7 = f_9;
						if (f_6 < 0.0F) {
							f_7 = f_9 - f_21 * f_6;
							f_9 -= f_22 * f_6;
							f_12 -= f_25 * f_6;
							f_6 = 0.0F;
						}

						if (f_5 < 0.0F) {
							f_8 -= f_20 * f_5;
							f_5 = 0.0F;
						}

						if (f_21 < f_22) {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F)) - f_5;
							f_5 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_5 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_7, (int) f_9, f_12, f_24);
								f_7 += f_21;
								f_9 += f_22;
								f_12 += f_25;
							}

							while (--f_4 >= 0.0F) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_8, (int) f_9, f_12, f_24);
								f_8 += f_20;
								f_9 += f_22;
								f_12 += f_25;
								f_6 += (float) this.anInt1705;
							}
						} else {
							f_6 = (float) ((int) (f_6 + 0.5F));
							f_5 = (float) ((int) (f_5 + 0.5F));
							f_4 = (float) ((int) (f_4 + 0.5F)) - f_5;
							f_5 -= f_6;

							for (f_6 = (float) this.anIntArray1685[(int) f_6]; --f_5 >= 0.0F; f_6 += (float) this.anInt1705) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_9, (int) f_7, f_12, f_24);
								f_7 += f_21;
								f_9 += f_22;
								f_12 += f_25;
							}

							while (--f_4 >= 0.0F) {
								this.method2419(bool_1, bool_2, bool_3, this.anIntArray1689, (int) f_6, i_13, 0, (int) f_9, (int) f_8, f_12, f_24);
								f_8 += f_20;
								f_9 += f_22;
								f_12 += f_25;
								f_6 += (float) this.anInt1705;
							}
						}
					}
				}
			}
		}

	}

	final void method2434(boolean bool_1, boolean bool_2, int[] ints_3, int[] ints_4, int i_5, int i_6, int i_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, float f_22, float f_23, float f_24, float f_25) {
		int i_26 = i_7 - i_6;
		float f_27 = 1.0F / (float) i_26;
		float f_28 = (f_9 - f_8) * f_27;
		float f_29 = (f_11 - f_10) * f_27;
		float f_30 = (f_13 - f_12) * f_27;
		float f_31 = (f_15 - f_14) * f_27;
		float f_32 = (f_17 - f_16) * f_27;
		float f_33 = (f_19 - f_18) * f_27;
		float f_34 = (f_21 - f_20) * f_27;
		float f_35 = (f_23 - f_22) * f_27;
		float f_36 = (f_25 - f_24) * f_27;
		if (this.aBool1708) {
			if (i_7 > this.anInt1684) {
				i_7 = this.anInt1684;
			}

			if (i_6 < 0) {
				f_8 -= f_28 * (float) i_6;
				f_10 -= f_29 * (float) i_6;
				f_12 -= f_30 * (float) i_6;
				f_14 -= f_31 * (float) i_6;
				f_16 -= f_32 * (float) i_6;
				f_18 -= f_33 * (float) i_6;
				f_20 -= f_34 * (float) i_6;
				f_22 -= f_35 * (float) i_6;
				f_24 -= f_36 * (float) i_6;
				i_6 = 0;
			}
		}

		if (i_6 < i_7) {
			i_26 = i_7 - i_6;

			for (i_5 += i_6; i_26-- > 0; f_24 += f_36) {
				float f_37 = 1.0F / f_8;
				float f_38 = 1.0F / f_10;
				if (!bool_1 || f_37 < this.aFloatArray1690[i_5]) {
					int i_39 = (int) (f_12 * f_38 * (float) this.anInt1694);
					if (this.aBool1703) {
						i_39 &= this.anInt1691;
					} else if (i_39 < 0) {
						i_39 = 0;
					} else if (i_39 > this.anInt1691) {
						i_39 = this.anInt1691;
					}

					int i_40 = (int) (f_14 * f_38 * (float) this.anInt1694);
					if (this.aBool1703) {
						i_40 &= this.anInt1691;
					} else if (i_40 < 0) {
						i_40 = 0;
					} else if (i_40 > this.anInt1691) {
						i_40 = this.anInt1691;
					}

					int i_41 = this.anIntArray1693[i_39 + i_40 * this.anInt1694];
					int i_42;
					if (this.anInt1697 == 2) {
						i_42 = i_41 >> 24 & 0xff;
					} else if (this.anInt1697 == 1) {
						i_42 = i_41 == 0 ? 0 : 255;
					} else {
						i_42 = (int) f_18;
					}

					if (i_42 != 0) {
						int i_43;
						int i_44;
						int i_45;
						if (i_42 != 255) {
							i_43 = ~0xffffff | (int) (f_20 * (float) (i_41 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_22 * (float) (i_41 >> 8 & 0xff)) & 0xff00 | (int) (f_24 * (float) (i_41 & 0xff)) >> 8;
							if (f_16 != 0.0F) {
								i_44 = (int) (255.0F - f_16);
								i_45 = ((this.anInt1677 & 0xff00ff) * (int) f_16 & ~0xff00ff | (this.anInt1677 & 0xff00) * (int) f_16 & 0xff0000) >>> 8;
								i_43 = i_45 + (((i_43 & 0xff00ff) * i_44 & ~0xff00ff | i_44 * (i_43 & 0xff00) & 0xff0000) >>> 8);
							}

							i_44 = ints_3[i_5];
							i_45 = 255 - i_42;
							i_43 = ((i_44 & 0xff00ff) * i_45 + (i_43 & 0xff00ff) * i_42 & ~0xff00ff) + (i_45 * (i_44 & 0xff00) + i_42 * (i_43 & 0xff00) & 0xff0000) >> 8;
							if (bool_2) {
								ints_3[i_5] = (i_42 | ints_3[i_5] >> 24) << 24 | i_43;
							} else {
								ints_3[i_5] = i_43;
							}

							if (bool_1) {
								this.aFloatArray1690[i_5] = f_37;
							}
						} else {
							i_43 = ~0xffffff | (int) (f_20 * (float) (i_41 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_22 * (float) (i_41 >> 8 & 0xff)) & 0xff00 | (int) (f_24 * (float) (i_41 & 0xff)) >> 8;
							if (f_16 != 0.0F) {
								i_44 = (int) (255.0F - f_16);
								i_45 = ((this.anInt1677 & 0xff00ff) * (int) f_16 & ~0xff00ff | (this.anInt1677 & 0xff00) * (int) f_16 & 0xff0000) >>> 8;
								i_43 = i_45 + (((i_43 & 0xff00ff) * i_44 & ~0xff00ff | i_44 * (i_43 & 0xff00) & 0xff0000) >>> 8);
							}

							if (bool_2) {
								ints_3[i_5] = i_42 << 24 | i_43;
							} else {
								ints_3[i_5] = i_43;
							}

							if (bool_1) {
								this.aFloatArray1690[i_5] = f_37;
							}
						}
					}
				}

				++i_5;
				f_8 += f_28;
				f_10 += f_29;
				f_12 += f_30;
				f_14 += f_31;
				f_16 += f_32;
				f_18 += f_33;
				f_20 += f_34;
				f_22 += f_35;
			}
		}

	}

	final void method2443(boolean bool_1, boolean bool_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, float f_9, float f_10, float f_11, float f_12) {
		if (this.aBool1708) {
			if (i_8 > this.anInt1684) {
				i_8 = this.anInt1684;
			}

			if (i_7 < 0) {
				i_7 = 0;
			}
		}

		if (i_7 < i_8) {
			i_4 += i_7 - 1;
			f_9 += f_10 * (float) i_7;
			f_11 += f_12 * (float) i_7;
			int i_13;
			int i_14;
			int i_15;
			if (this.aClass185_1687.aBool2334) {
				if (this.aBool1675) {
					i_6 = i_8 - i_7 >> 2;
					f_10 *= 4.0F;
					if (this.anInt1674 == 0) {
						if (i_6 > 0) {
							do {
								i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
								f_9 += f_10;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];

							do {
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									ints_3[i_4] = i_5;
									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								--i_6;
							} while (i_6 > 0);
						}
					} else {
						i_13 = this.anInt1674;
						i_14 = 256 - this.anInt1674;
						if (i_6 > 0) {
							do {
								i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
								f_9 += f_10;
								i_5 = (i_14 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_5 & 0xff00) >> 8 & 0xff00);
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									i_15 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									}

									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									i_15 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									}

									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									i_15 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									}

									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									i_15 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									}

									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								--i_6;
							} while (i_6 > 0);
						}

						i_6 = i_8 - i_7 & 0x3;
						if (i_6 > 0) {
							i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
							i_5 = (i_14 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_5 & 0xff00) >> 8 & 0xff00);

							do {
								++i_4;
								if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
									i_15 = ints_3[i_4];
									if (bool_2) {
										ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									} else {
										ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
									}

									if (bool_1) {
										this.aFloatArray1690[i_4] = f_11;
									}
								}

								f_11 += f_12;
								--i_6;
							} while (i_6 > 0);
						}
					}
				} else {
					i_6 = i_8 - i_7;
					if (this.anInt1674 != 0) {
						i_13 = this.anInt1674;
						i_14 = 256 - this.anInt1674;

						do {
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
								i_5 = (i_14 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_5 & 0xff00) >> 8 & 0xff00);
								i_15 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								}

								if (bool_1) {
									this.aFloatArray1690[i_4] = f_11;
								}
							}

							f_9 += f_10;
							f_11 += f_12;
							--i_6;
						} while (i_6 > 0);
					} else {
						do {
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = Class335.anIntArray3916[(int) f_9 & 0xffff];
								if (bool_1) {
									this.aFloatArray1690[i_4] = f_11;
								}
							}

							f_11 += f_12;
							f_9 += f_10;
							--i_6;
						} while (i_6 > 0);
					}
				}
			} else if (this.aBool1675) {
				i_6 = i_8 - i_7 >> 2;
				f_10 *= 4.0F;
				if (this.anInt1674 == 0) {
					if (i_6 > 0) {
						do {
							i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
							f_9 += f_10;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = i_5;
							}

							f_11 += f_12;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = i_5;
							}

							f_11 += f_12;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = i_5;
							}

							f_11 += f_12;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = i_5;
							}

							f_11 += f_12;
							--i_6;
						} while (i_6 > 0);
					}

					i_6 = i_8 - i_7 & 0x3;
					if (i_6 > 0) {
						i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];

						do {
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								ints_3[i_4] = i_5;
							}

							f_11 += f_12;
							--i_6;
						} while (i_6 > 0);
					}
				} else {
					i_13 = this.anInt1674;
					i_14 = 256 - this.anInt1674;
					if (i_6 > 0) {
						do {
							i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
							f_9 += f_10;
							i_5 = (i_14 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_5 & 0xff00) >> 8 & 0xff00);
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								i_15 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								}
							}

							f_11 += f_12;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								i_15 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								}
							}

							f_11 += f_12;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								i_15 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								}
							}

							f_11 += f_12;
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								i_15 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								}
							}

							f_11 += f_12;
							--i_6;
						} while (i_6 > 0);
					}

					i_6 = i_8 - i_7 & 0x3;
					if (i_6 > 0) {
						i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
						i_5 = (i_14 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_5 & 0xff00) >> 8 & 0xff00);

						do {
							++i_4;
							if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
								i_15 = ints_3[i_4];
								if (bool_2) {
									ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								} else {
									ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
								}
							}

							f_11 += f_12;
							--i_6;
						} while (i_6 > 0);
					}
				}
			} else {
				i_6 = i_8 - i_7;
				if (this.anInt1674 != 0) {
					i_13 = this.anInt1674;
					i_14 = 256 - this.anInt1674;

					do {
						++i_4;
						if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
							i_5 = Class335.anIntArray3916[(int) f_9 & 0xffff];
							i_5 = (i_14 * (i_5 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_5 & 0xff00) >> 8 & 0xff00);
							i_15 = ints_3[i_4];
							if (bool_2) {
								ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
							} else {
								ints_3[i_4] = i_5 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
							}
						}

						f_9 += f_10;
						f_11 += f_12;
						--i_6;
					} while (i_6 > 0);
				} else {
					do {
						++i_4;
						if (!bool_1 || f_11 < this.aFloatArray1690[i_4]) {
							ints_3[i_4] = Class335.anIntArray3916[(int) f_9 & 0xffff];
						}

						f_11 += f_12;
						f_9 += f_10;
						--i_6;
					} while (i_6 > 0);
				}
			}
		}

	}

}
