public class Class160_Sub1_Sub2 extends Class160_Sub1 {

	byte[] aByteArray10221;
	int[] anIntArray10220;

	void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			if (i_3 > 0 && i_4 > 0) {
				int[] ints_9 = this.aClass505_Sub3_8875.anIntArray8979;
				if (ints_9 != null) {
					int i_10 = 0;
					int i_11 = 0;
					int i_12 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
					int i_13 = this.anInt8853 + this.anInt8851 + this.anInt8855;
					int i_14 = this.anInt8854 + this.anInt8867 + this.anInt8856;
					int i_15 = (i_13 << 16) / i_3;
					int i_16 = (i_14 << 16) / i_4;
					int i_17;
					if (this.anInt8853 > 0) {
						i_17 = ((this.anInt8853 << 16) + i_15 - 1) / i_15;
						i_1 += i_17;
						i_10 += i_17 * i_15 - (this.anInt8853 << 16);
					}

					if (this.anInt8854 > 0) {
						i_17 = ((this.anInt8854 << 16) + i_16 - 1) / i_16;
						i_2 += i_17;
						i_11 += i_17 * i_16 - (this.anInt8854 << 16);
					}

					if (this.anInt8851 < i_13) {
						i_3 = ((this.anInt8851 << 16) - i_10 + i_15 - 1) / i_15;
					}

					if (this.anInt8867 < i_14) {
						i_4 = ((this.anInt8867 << 16) - i_11 + i_16 - 1) / i_16;
					}

					i_17 = i_1 + i_2 * i_12;
					int i_18 = i_12 - i_3;
					if (i_2 + i_4 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
						i_4 -= i_2 + i_4 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
					}

					int i_19;
					if (i_2 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
						i_19 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_2;
						i_4 -= i_19;
						i_17 += i_19 * i_12;
						i_11 += i_16 * i_19;
					}

					if (i_1 + i_3 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
						i_19 = i_1 + i_3 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
						i_3 -= i_19;
						i_18 += i_19;
					}

					if (i_1 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
						i_19 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_1;
						i_3 -= i_19;
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
					byte b_34;
					if (i_7 == 0) {
						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_4; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * this.anInt8851;

								for (i_22 = -i_3; i_22 < 0; i_22++) {
									ints_9[i_17++] = this.anIntArray10220[this.aByteArray10221[(i_10 >> 16) + i_21] & 0xff];
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = (i_6 & 0xff0000) >> 16;
							i_20 = (i_6 & 0xff00) >> 8;
							i_21 = i_6 & 0xff;
							i_22 = i_10;

							for (i_23 = -i_4; i_23 < 0; i_23++) {
								i_24 = (i_11 >> 16) * this.anInt8851;

								for (i_25 = -i_3; i_25 < 0; i_25++) {
									i_26 = this.anIntArray10220[this.aByteArray10221[(i_10 >> 16) + i_24] & 0xff];
									i_27 = (i_26 & 0xff0000) * i_19 & ~0xffffff;
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

							for (i_20 = -i_4; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * this.anInt8851;

								for (i_22 = -i_3; i_22 < 0; i_22++) {
									b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
									i_24 = b_34 > 0 ? this.anIntArray10220[b_34] : 0;
									i_25 = i_24 + i_6;
									i_26 = (i_24 & 0xff00ff) + (i_6 & 0xff00ff);
									i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
									ints_9[i_17++] = i_25 - i_27 | i_27 - (i_27 >>> 8);
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2) {
								throw new IllegalArgumentException();
							}

							i_19 = i_6 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
							i_22 = (i_6 & 0xff00) * i_20 & 0xff0000;
							i_6 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_4; i_24 < 0; i_24++) {
								i_25 = (i_11 >> 16) * this.anInt8851;

								for (i_26 = -i_3; i_26 < 0; i_26++) {
									i_27 = this.anIntArray10220[this.aByteArray10221[(i_10 >> 16) + i_25] & 0xff];
									i_21 = (i_27 & 0xff00ff) * i_19 & ~0xff00ff;
									i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
									ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_6;
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
						int i_33;
						byte b_37;
						if (i_7 == 1) {
							if (i_5 == 1) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = (i_11 >> 16) * this.anInt8851;

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
										if (b_34 != 0) {
											ints_9[i_17++] = this.anIntArray10220[b_34 & 0xff];
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								byte b_35;
								if (i_5 == 0) {
									i_19 = i_10;
									if ((i_6 & 0xffffff) == 16777215) {
										i_20 = i_6 >>> 24;
										i_21 = 256 - i_20;

										for (i_22 = -i_4; i_22 < 0; i_22++) {
											i_23 = (i_11 >> 16) * this.anInt8851;

											for (i_24 = -i_3; i_24 < 0; i_24++) {
												b_35 = this.aByteArray10221[(i_10 >> 16) + i_23];
												if (b_35 != 0) {
													i_26 = this.anIntArray10220[b_35 & 0xff];
													i_27 = ints_9[i_17];
													ints_9[i_17++] = ((i_26 & 0xff00ff) * i_20 + (i_27 & 0xff00ff) * i_21 & ~0xff00ff) + ((i_26 & 0xff00) * i_20 + (i_27 & 0xff00) * i_21 & 0xff0000) >> 8;
												} else {
													++i_17;
												}

												i_10 += i_15;
											}

											i_11 += i_16;
											i_10 = i_19;
											i_17 += i_18;
										}
									} else {
										i_20 = (i_6 & 0xff0000) >> 16;
										i_21 = (i_6 & 0xff00) >> 8;
										i_22 = i_6 & 0xff;
										i_23 = i_6 >>> 24;
										i_24 = 256 - i_23;

										for (i_25 = -i_4; i_25 < 0; i_25++) {
											i_26 = (i_11 >> 16) * this.anInt8851;

											for (i_27 = -i_3; i_27 < 0; i_27++) {
												byte b_36 = this.aByteArray10221[(i_10 >> 16) + i_26];
												if (b_36 != 0) {
													i_29 = this.anIntArray10220[b_36 & 0xff];
													if (i_23 != 255) {
														i_30 = (i_29 & 0xff0000) * i_20 & ~0xffffff;
														i_31 = (i_29 & 0xff00) * i_21 & 0xff0000;
														i_32 = (i_29 & 0xff) * i_22 & 0xff00;
														i_29 = (i_30 | i_31 | i_32) >>> 8;
														i_33 = ints_9[i_17];
														ints_9[i_17++] = ((i_29 & 0xff00ff) * i_23 + (i_33 & 0xff00ff) * i_24 & ~0xff00ff) + ((i_29 & 0xff00) * i_23 + (i_33 & 0xff00) * i_24 & 0xff0000) >> 8;
													} else {
														i_30 = (i_29 & 0xff0000) * i_20 & ~0xffffff;
														i_31 = (i_29 & 0xff00) * i_21 & 0xff0000;
														i_32 = (i_29 & 0xff) * i_22 & 0xff00;
														ints_9[i_17++] = (i_30 | i_31 | i_32) >>> 8;
													}
												} else {
													++i_17;
												}

												i_10 += i_15;
											}

											i_11 += i_16;
											i_10 = i_19;
											i_17 += i_18;
										}
									}
								} else if (i_5 == 3) {
									i_19 = i_10;
									i_20 = i_6 >>> 24;
									i_21 = 256 - i_20;

									for (i_22 = -i_4; i_22 < 0; i_22++) {
										i_23 = (i_11 >> 16) * this.anInt8851;

										for (i_24 = -i_3; i_24 < 0; i_24++) {
											b_35 = this.aByteArray10221[(i_10 >> 16) + i_23];
											i_26 = b_35 > 0 ? this.anIntArray10220[b_35] : 0;
											i_27 = i_26 + i_6;
											i_28 = (i_26 & 0xff00ff) + (i_6 & 0xff00ff);
											i_29 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
											i_29 = i_27 - i_29 | i_29 - (i_29 >>> 8);
											if (i_26 == 0 && i_20 != 255) {
												i_26 = i_29;
												i_29 = ints_9[i_17];
												i_29 = ((i_26 & 0xff00ff) * i_20 + (i_29 & 0xff00ff) * i_21 & ~0xff00ff) + ((i_26 & 0xff00) * i_20 + (i_29 & 0xff00) * i_21 & 0xff0000) >> 8;
											}

											ints_9[i_17++] = i_29;
											i_10 += i_15;
										}

										i_11 += i_16;
										i_10 = i_19;
										i_17 += i_18;
									}
								} else {
									if (i_5 != 2) {
										throw new IllegalArgumentException();
									}

									i_19 = i_6 >>> 24;
									i_20 = 256 - i_19;
									i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
									i_22 = (i_6 & 0xff00) * i_20 & 0xff0000;
									i_6 = (i_21 | i_22) >>> 8;
									i_23 = i_10;

									for (i_24 = -i_4; i_24 < 0; i_24++) {
										i_25 = (i_11 >> 16) * this.anInt8851;

										for (i_26 = -i_3; i_26 < 0; i_26++) {
											b_37 = this.aByteArray10221[(i_10 >> 16) + i_25];
											if (b_37 != 0) {
												i_28 = this.anIntArray10220[b_37 & 0xff];
												i_21 = (i_28 & 0xff00ff) * i_19 & ~0xff00ff;
												i_22 = (i_28 & 0xff00) * i_19 & 0xff0000;
												ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_6;
											} else {
												++i_17;
											}

											i_10 += i_15;
										}

										i_11 += i_16;
										i_10 = i_23;
										i_17 += i_18;
									}
								}
							}
						} else {
							if (i_7 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_5 == 1) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = (i_11 >> 16) * this.anInt8851;

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
										if (b_34 != 0) {
											i_24 = this.anIntArray10220[b_34 & 0xff];
											i_25 = ints_9[i_17];
											i_26 = i_24 + i_25;
											i_27 = (i_24 & 0xff00ff) + (i_25 & 0xff00ff);
											i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
											ints_9[i_17++] = i_26 - i_25 | i_25 - (i_25 >>> 8);
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else if (i_5 == 0) {
								i_19 = i_10;
								i_20 = (i_6 & 0xff0000) >> 16;
								i_21 = (i_6 & 0xff00) >> 8;
								i_22 = i_6 & 0xff;

								for (i_23 = -i_4; i_23 < 0; i_23++) {
									i_24 = (i_11 >> 16) * this.anInt8851;

									for (i_25 = -i_3; i_25 < 0; i_25++) {
										byte b_38 = this.aByteArray10221[(i_10 >> 16) + i_24];
										if (b_38 != 0) {
											i_27 = this.anIntArray10220[b_38 & 0xff];
											i_28 = (i_27 & 0xff0000) * i_20 & ~0xffffff;
											i_29 = (i_27 & 0xff00) * i_21 & 0xff0000;
											i_30 = (i_27 & 0xff) * i_22 & 0xff00;
											i_27 = (i_28 | i_29 | i_30) >>> 8;
											i_31 = ints_9[i_17];
											i_32 = i_27 + i_31;
											i_33 = (i_27 & 0xff00ff) + (i_31 & 0xff00ff);
											i_31 = (i_33 & 0x1000100) + (i_32 - i_33 & 0x10000);
											ints_9[i_17++] = i_32 - i_31 | i_31 - (i_31 >>> 8);
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else if (i_5 == 3) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = (i_11 >> 16) * this.anInt8851;

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
										i_24 = b_34 > 0 ? this.anIntArray10220[b_34] : 0;
										i_25 = i_24 + i_6;
										i_26 = (i_24 & 0xff00ff) + (i_6 & 0xff00ff);
										i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										i_24 = i_25 - i_27 | i_27 - (i_27 >>> 8);
										i_27 = ints_9[i_17];
										i_25 = i_24 + i_27;
										i_26 = (i_24 & 0xff00ff) + (i_27 & 0xff00ff);
										i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										ints_9[i_17++] = i_25 - i_27 | i_27 - (i_27 >>> 8);
										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								if (i_5 != 2) {
									throw new IllegalArgumentException();
								}

								i_19 = i_6 >>> 24;
								i_20 = 256 - i_19;
								i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
								i_22 = (i_6 & 0xff00) * i_20 & 0xff0000;
								i_6 = (i_21 | i_22) >>> 8;
								i_23 = i_10;

								for (i_24 = -i_4; i_24 < 0; i_24++) {
									i_25 = (i_11 >> 16) * this.anInt8851;

									for (i_26 = -i_3; i_26 < 0; i_26++) {
										b_37 = this.aByteArray10221[(i_10 >> 16) + i_25];
										if (b_37 != 0) {
											i_28 = this.anIntArray10220[b_37 & 0xff];
											i_21 = (i_28 & 0xff00ff) * i_19 & ~0xff00ff;
											i_22 = (i_28 & 0xff00) * i_19 & 0xff0000;
											i_28 = ((i_21 | i_22) >>> 8) + i_6;
											i_29 = ints_9[i_17];
											i_30 = i_28 + i_29;
											i_31 = (i_28 & 0xff00ff) + (i_29 & 0xff00ff);
											i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
											ints_9[i_17++] = i_30 - i_29 | i_29 - (i_29 >>> 8);
										} else {
											++i_17;
										}

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
	}

	public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		throw new IllegalStateException();
	}

	Class160_Sub1_Sub2(HardwareRenderer hardwarerenderer_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5) {
		super(hardwarerenderer_1, i_4, i_5);
		this.aByteArray10221 = bytes_2;
		this.anIntArray10220 = ints_3;
	}

	void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			if (i_3 > 0 && i_4 > 0) {
				int[] ints_9 = this.aClass505_Sub3_8875.anIntArray8979;
				if (ints_9 != null) {
					int i_10 = 0;
					int i_11 = 0;
					int i_12 = this.aClass505_Sub3_8875.anInt8980;
					int i_13 = this.anInt8853 + this.anInt8851 + this.anInt8855;
					int i_14 = this.anInt8854 + this.anInt8867 + this.anInt8856;
					int i_15 = (i_13 << 16) / i_3;
					int i_16 = (i_14 << 16) / i_4;
					int i_17;
					if (this.anInt8853 > 0) {
						i_17 = (i_15 + (this.anInt8853 << 16) - 1) / i_15;
						i_1 += i_17;
						i_10 += i_17 * i_15 - (this.anInt8853 << 16);
					}

					if (this.anInt8854 > 0) {
						i_17 = (i_16 + (this.anInt8854 << 16) - 1) / i_16;
						i_2 += i_17;
						i_11 += i_17 * i_16 - (this.anInt8854 << 16);
					}

					if (this.anInt8851 < i_13) {
						i_3 = ((this.anInt8851 << 16) - i_10 + i_15 - 1) / i_15;
					}

					if (this.anInt8867 < i_14) {
						i_4 = ((this.anInt8867 << 16) - i_11 + i_16 - 1) / i_16;
					}

					i_17 = i_12 * i_2 + i_1;
					int i_18 = i_12 - i_3;
					if (i_2 + i_4 > this.aClass505_Sub3_8875.anInt8986) {
						i_4 -= i_2 + i_4 - this.aClass505_Sub3_8875.anInt8986;
					}

					int i_19;
					if (i_2 < this.aClass505_Sub3_8875.anInt9009) {
						i_19 = this.aClass505_Sub3_8875.anInt9009 - i_2;
						i_4 -= i_19;
						i_17 += i_19 * i_12;
						i_11 += i_16 * i_19;
					}

					if (i_3 + i_1 > this.aClass505_Sub3_8875.anInt9002) {
						i_19 = i_3 + i_1 - this.aClass505_Sub3_8875.anInt9002;
						i_3 -= i_19;
						i_18 += i_19;
					}

					if (i_1 < this.aClass505_Sub3_8875.anInt8983) {
						i_19 = this.aClass505_Sub3_8875.anInt8983 - i_1;
						i_3 -= i_19;
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
					byte b_34;
					if (i_7 == 0) {
						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_4; i_20 < 0; i_20++) {
								i_21 = this.anInt8851 * (i_11 >> 16);

								for (i_22 = -i_3; i_22 < 0; i_22++) {
									ints_9[i_17++] = this.anIntArray10220[this.aByteArray10221[i_21 + (i_10 >> 16)] & 0xff];
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = (i_6 & 0xff0000) >> 16;
							i_20 = (i_6 & 0xff00) >> 8;
							i_21 = i_6 & 0xff;
							i_22 = i_10;

							for (i_23 = -i_4; i_23 < 0; i_23++) {
								i_24 = this.anInt8851 * (i_11 >> 16);

								for (i_25 = -i_3; i_25 < 0; i_25++) {
									i_26 = this.anIntArray10220[this.aByteArray10221[i_24 + (i_10 >> 16)] & 0xff];
									i_27 = i_19 * (i_26 & 0xff0000) & ~0xffffff;
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

							for (i_20 = -i_4; i_20 < 0; i_20++) {
								i_21 = this.anInt8851 * (i_11 >> 16);

								for (i_22 = -i_3; i_22 < 0; i_22++) {
									b_34 = this.aByteArray10221[i_21 + (i_10 >> 16)];
									i_24 = b_34 > 0 ? this.anIntArray10220[b_34] : 0;
									i_25 = i_24 + i_6;
									i_26 = (i_24 & 0xff00ff) + (i_6 & 0xff00ff);
									i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
									ints_9[i_17++] = i_25 - i_27 | i_27 - (i_27 >>> 8);
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2) {
								throw new IllegalArgumentException();
							}

							i_19 = i_6 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
							i_22 = i_20 * (i_6 & 0xff00) & 0xff0000;
							i_6 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_4; i_24 < 0; i_24++) {
								i_25 = this.anInt8851 * (i_11 >> 16);

								for (i_26 = -i_3; i_26 < 0; i_26++) {
									i_27 = this.anIntArray10220[this.aByteArray10221[i_25 + (i_10 >> 16)] & 0xff];
									i_21 = (i_27 & 0xff00ff) * i_19 & ~0xff00ff;
									i_22 = i_19 * (i_27 & 0xff00) & 0xff0000;
									ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_6;
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
						int i_33;
						byte b_37;
						if (i_7 == 1) {
							if (i_5 == 1) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = this.anInt8851 * (i_11 >> 16);

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[i_21 + (i_10 >> 16)];
										if (b_34 != 0) {
											ints_9[i_17++] = this.anIntArray10220[b_34 & 0xff];
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								byte b_35;
								if (i_5 == 0) {
									i_19 = i_10;
									if ((i_6 & 0xffffff) == 16777215) {
										i_20 = i_6 >>> 24;
										i_21 = 256 - i_20;

										for (i_22 = -i_4; i_22 < 0; i_22++) {
											i_23 = this.anInt8851 * (i_11 >> 16);

											for (i_24 = -i_3; i_24 < 0; i_24++) {
												b_35 = this.aByteArray10221[i_23 + (i_10 >> 16)];
												if (b_35 != 0) {
													i_26 = this.anIntArray10220[b_35 & 0xff];
													i_27 = ints_9[i_17];
													ints_9[i_17++] = ((i_26 & 0xff00ff) * i_20 + (i_27 & 0xff00ff) * i_21 & ~0xff00ff) + (i_20 * (i_26 & 0xff00) + i_21 * (i_27 & 0xff00) & 0xff0000) >> 8;
												} else {
													++i_17;
												}

												i_10 += i_15;
											}

											i_11 += i_16;
											i_10 = i_19;
											i_17 += i_18;
										}
									} else {
										i_20 = (i_6 & 0xff0000) >> 16;
										i_21 = (i_6 & 0xff00) >> 8;
										i_22 = i_6 & 0xff;
										i_23 = i_6 >>> 24;
										i_24 = 256 - i_23;

										for (i_25 = -i_4; i_25 < 0; i_25++) {
											i_26 = this.anInt8851 * (i_11 >> 16);

											for (i_27 = -i_3; i_27 < 0; i_27++) {
												byte b_36 = this.aByteArray10221[i_26 + (i_10 >> 16)];
												if (b_36 != 0) {
													i_29 = this.anIntArray10220[b_36 & 0xff];
													if (i_23 != 255) {
														i_30 = i_20 * (i_29 & 0xff0000) & ~0xffffff;
														i_31 = i_21 * (i_29 & 0xff00) & 0xff0000;
														i_32 = (i_29 & 0xff) * i_22 & 0xff00;
														i_29 = (i_30 | i_31 | i_32) >>> 8;
														i_33 = ints_9[i_17];
														ints_9[i_17++] = ((i_29 & 0xff00ff) * i_23 + (i_33 & 0xff00ff) * i_24 & ~0xff00ff) + (i_23 * (i_29 & 0xff00) + i_24 * (i_33 & 0xff00) & 0xff0000) >> 8;
													} else {
														i_30 = i_20 * (i_29 & 0xff0000) & ~0xffffff;
														i_31 = i_21 * (i_29 & 0xff00) & 0xff0000;
														i_32 = (i_29 & 0xff) * i_22 & 0xff00;
														ints_9[i_17++] = (i_30 | i_31 | i_32) >>> 8;
													}
												} else {
													++i_17;
												}

												i_10 += i_15;
											}

											i_11 += i_16;
											i_10 = i_19;
											i_17 += i_18;
										}
									}
								} else if (i_5 == 3) {
									i_19 = i_10;
									i_20 = i_6 >>> 24;
									i_21 = 256 - i_20;

									for (i_22 = -i_4; i_22 < 0; i_22++) {
										i_23 = this.anInt8851 * (i_11 >> 16);

										for (i_24 = -i_3; i_24 < 0; i_24++) {
											b_35 = this.aByteArray10221[i_23 + (i_10 >> 16)];
											i_26 = b_35 > 0 ? this.anIntArray10220[b_35] : 0;
											i_27 = i_26 + i_6;
											i_28 = (i_26 & 0xff00ff) + (i_6 & 0xff00ff);
											i_29 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
											i_29 = i_27 - i_29 | i_29 - (i_29 >>> 8);
											if (i_26 == 0 && i_20 != 255) {
												i_26 = i_29;
												i_29 = ints_9[i_17];
												i_29 = ((i_26 & 0xff00ff) * i_20 + (i_29 & 0xff00ff) * i_21 & ~0xff00ff) + (i_20 * (i_26 & 0xff00) + i_21 * (i_29 & 0xff00) & 0xff0000) >> 8;
											}

											ints_9[i_17++] = i_29;
											i_10 += i_15;
										}

										i_11 += i_16;
										i_10 = i_19;
										i_17 += i_18;
									}
								} else {
									if (i_5 != 2) {
										throw new IllegalArgumentException();
									}

									i_19 = i_6 >>> 24;
									i_20 = 256 - i_19;
									i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
									i_22 = i_20 * (i_6 & 0xff00) & 0xff0000;
									i_6 = (i_21 | i_22) >>> 8;
									i_23 = i_10;

									for (i_24 = -i_4; i_24 < 0; i_24++) {
										i_25 = this.anInt8851 * (i_11 >> 16);

										for (i_26 = -i_3; i_26 < 0; i_26++) {
											b_37 = this.aByteArray10221[i_25 + (i_10 >> 16)];
											if (b_37 != 0) {
												i_28 = this.anIntArray10220[b_37 & 0xff];
												i_21 = (i_28 & 0xff00ff) * i_19 & ~0xff00ff;
												i_22 = i_19 * (i_28 & 0xff00) & 0xff0000;
												ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_6;
											} else {
												++i_17;
											}

											i_10 += i_15;
										}

										i_11 += i_16;
										i_10 = i_23;
										i_17 += i_18;
									}
								}
							}
						} else {
							if (i_7 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_5 == 1) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = this.anInt8851 * (i_11 >> 16);

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[i_21 + (i_10 >> 16)];
										if (b_34 != 0) {
											i_24 = this.anIntArray10220[b_34 & 0xff];
											i_25 = ints_9[i_17];
											i_26 = i_24 + i_25;
											i_27 = (i_24 & 0xff00ff) + (i_25 & 0xff00ff);
											i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
											ints_9[i_17++] = i_26 - i_25 | i_25 - (i_25 >>> 8);
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else if (i_5 == 0) {
								i_19 = i_10;
								i_20 = (i_6 & 0xff0000) >> 16;
								i_21 = (i_6 & 0xff00) >> 8;
								i_22 = i_6 & 0xff;

								for (i_23 = -i_4; i_23 < 0; i_23++) {
									i_24 = this.anInt8851 * (i_11 >> 16);

									for (i_25 = -i_3; i_25 < 0; i_25++) {
										byte b_38 = this.aByteArray10221[i_24 + (i_10 >> 16)];
										if (b_38 != 0) {
											i_27 = this.anIntArray10220[b_38 & 0xff];
											i_28 = i_20 * (i_27 & 0xff0000) & ~0xffffff;
											i_29 = i_21 * (i_27 & 0xff00) & 0xff0000;
											i_30 = (i_27 & 0xff) * i_22 & 0xff00;
											i_27 = (i_28 | i_29 | i_30) >>> 8;
											i_31 = ints_9[i_17];
											i_32 = i_27 + i_31;
											i_33 = (i_27 & 0xff00ff) + (i_31 & 0xff00ff);
											i_31 = (i_33 & 0x1000100) + (i_32 - i_33 & 0x10000);
											ints_9[i_17++] = i_32 - i_31 | i_31 - (i_31 >>> 8);
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else if (i_5 == 3) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = this.anInt8851 * (i_11 >> 16);

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[i_21 + (i_10 >> 16)];
										i_24 = b_34 > 0 ? this.anIntArray10220[b_34] : 0;
										i_25 = i_24 + i_6;
										i_26 = (i_24 & 0xff00ff) + (i_6 & 0xff00ff);
										i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										i_24 = i_25 - i_27 | i_27 - (i_27 >>> 8);
										i_27 = ints_9[i_17];
										i_25 = i_24 + i_27;
										i_26 = (i_24 & 0xff00ff) + (i_27 & 0xff00ff);
										i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										ints_9[i_17++] = i_25 - i_27 | i_27 - (i_27 >>> 8);
										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								if (i_5 != 2) {
									throw new IllegalArgumentException();
								}

								i_19 = i_6 >>> 24;
								i_20 = 256 - i_19;
								i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
								i_22 = i_20 * (i_6 & 0xff00) & 0xff0000;
								i_6 = (i_21 | i_22) >>> 8;
								i_23 = i_10;

								for (i_24 = -i_4; i_24 < 0; i_24++) {
									i_25 = this.anInt8851 * (i_11 >> 16);

									for (i_26 = -i_3; i_26 < 0; i_26++) {
										b_37 = this.aByteArray10221[i_25 + (i_10 >> 16)];
										if (b_37 != 0) {
											i_28 = this.anIntArray10220[b_37 & 0xff];
											i_21 = (i_28 & 0xff00ff) * i_19 & ~0xff00ff;
											i_22 = i_19 * (i_28 & 0xff00) & 0xff0000;
											i_28 = ((i_21 | i_22) >>> 8) + i_6;
											i_29 = ints_9[i_17];
											i_30 = i_28 + i_29;
											i_31 = (i_28 & 0xff00ff) + (i_29 & 0xff00ff);
											i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
											ints_9[i_17++] = i_30 - i_29 | i_29 - (i_29 >>> 8);
										} else {
											++i_17;
										}

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
	}

	public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			int[] ints_6 = this.aClass505_Sub3_8875.anIntArray8979;
			if (ints_6 != null) {
				int i_7 = this.aClass505_Sub3_8875.anInt8980;
				i_1 += this.anInt8853;
				i_2 += this.anInt8854;
				int i_8 = i_7 * i_2 + i_1;
				int i_9 = 0;
				int i_10 = this.anInt8867;
				int i_11 = this.anInt8851;
				int i_12 = i_7 - i_11;
				int i_13 = 0;
				int i_14;
				if (i_2 < this.aClass505_Sub3_8875.anInt9009) {
					i_14 = this.aClass505_Sub3_8875.anInt9009 - i_2;
					i_10 -= i_14;
					i_2 = this.aClass505_Sub3_8875.anInt9009;
					i_9 += i_14 * i_11;
					i_8 += i_14 * i_7;
				}

				if (i_10 + i_2 > this.aClass505_Sub3_8875.anInt8986) {
					i_10 -= i_10 + i_2 - this.aClass505_Sub3_8875.anInt8986;
				}

				if (i_1 < this.aClass505_Sub3_8875.anInt8983) {
					i_14 = this.aClass505_Sub3_8875.anInt8983 - i_1;
					i_11 -= i_14;
					i_1 = this.aClass505_Sub3_8875.anInt8983;
					i_9 += i_14;
					i_8 += i_14;
					i_13 += i_14;
					i_12 += i_14;
				}

				if (i_11 + i_1 > this.aClass505_Sub3_8875.anInt9002) {
					i_14 = i_11 + i_1 - this.aClass505_Sub3_8875.anInt9002;
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
						if (i_3 == 1) {
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = i_8 + i_11 - 3; i_8 < i_15; ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff]) {
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
								}

								for (i_15 += 3; i_8 < i_15; ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff]) {
									;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 0) {
							i_14 = (i_4 & 0xff0000) >> 16;
							i_15 = (i_4 & 0xff00) >> 8;
							i_16 = i_4 & 0xff;

							for (i_17 = -i_10; i_17 < 0; i_17++) {
								for (i_18 = -i_11; i_18 < 0; i_18++) {
									i_19 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_20 = i_14 * (i_19 & 0xff0000) & ~0xffffff;
									i_21 = i_15 * (i_19 & 0xff00) & 0xff0000;
									i_22 = (i_19 & 0xff) * i_16 & 0xff00;
									ints_6[i_8++] = (i_20 | i_21 | i_22) >>> 8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 3) {
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_17 = i_16 + i_4;
									i_18 = (i_16 & 0xff00ff) + (i_4 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else {
							if (i_3 != 2) {
								throw new IllegalArgumentException();
							}

							i_14 = i_4 >>> 24;
							i_15 = 256 - i_14;
							i_16 = i_15 * (i_4 & 0xff00ff) & ~0xff00ff;
							i_17 = i_15 * (i_4 & 0xff00) & 0xff0000;
							i_4 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_16 = (i_20 & 0xff00ff) * i_14 & ~0xff00ff;
									i_17 = i_14 * (i_20 & 0xff00) & 0xff0000;
									ints_6[i_8++] = i_4 + ((i_16 | i_17) >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					} else {
						int i_23;
						int i_24;
						int i_25;
						int i_26;
						byte b_27;
						byte b_32;
						if (i_5 == 1) {
							if (i_3 == 1) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										if (b_27 != 0) {
											i_17 = this.anIntArray10220[b_27 & 0xff] | ~0xffffff;
											short s_28 = 255;
											byte b_30 = 0;
											i_20 = ints_6[i_8];
											ints_6[i_8++] = (((i_17 & ~0xff00ff) >>> 8) * s_28 + ((i_20 & ~0xff00ff) >>> 8) * b_30 & ~0xff00ff) + (((i_17 & 0xff00ff) * s_28 + (i_20 & 0xff00ff) * b_30 & ~0xff00ff) >> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								byte b_29;
								if (i_3 == 0) {
									if ((i_4 & 0xffffff) == 16777215) {
										i_14 = i_4 >>> 24;
										i_15 = 256 - i_14;

										for (i_16 = -i_10; i_16 < 0; i_16++) {
											for (i_17 = -i_11; i_17 < 0; i_17++) {
												b_29 = this.aByteArray10221[i_9++];
												if (b_29 != 0) {
													i_19 = this.anIntArray10220[b_29 & 0xff];
													i_20 = ints_6[i_8];
													ints_6[i_8++] = ((i_19 & 0xff00ff) * i_14 + (i_20 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_19 & 0xff00) + i_15 * (i_20 & 0xff00) & 0xff0000) >> 8;
												} else {
													++i_8;
												}
											}

											i_8 += i_12;
											i_9 += i_13;
										}
									} else {
										i_14 = (i_4 & 0xff0000) >> 16;
										i_15 = (i_4 & 0xff00) >> 8;
										i_16 = i_4 & 0xff;
										i_17 = i_4 >>> 24;
										i_18 = 256 - i_17;

										for (i_19 = -i_10; i_19 < 0; i_19++) {
											for (i_20 = -i_11; i_20 < 0; i_20++) {
												byte b_31 = this.aByteArray10221[i_9++];
												if (b_31 != 0) {
													i_22 = this.anIntArray10220[b_31 & 0xff];
													if (i_17 != 255) {
														i_23 = i_14 * (i_22 & 0xff0000) & ~0xffffff;
														i_24 = i_15 * (i_22 & 0xff00) & 0xff0000;
														i_25 = (i_22 & 0xff) * i_16 & 0xff00;
														i_22 = (i_23 | i_24 | i_25) >>> 8;
														i_26 = ints_6[i_8];
														ints_6[i_8++] = ((i_22 & 0xff00ff) * i_17 + (i_26 & 0xff00ff) * i_18 & ~0xff00ff) + (i_17 * (i_22 & 0xff00) + i_18 * (i_26 & 0xff00) & 0xff0000) >> 8;
													} else {
														i_23 = i_14 * (i_22 & 0xff0000) & ~0xffffff;
														i_24 = i_15 * (i_22 & 0xff00) & 0xff0000;
														i_25 = (i_22 & 0xff) * i_16 & 0xff00;
														ints_6[i_8++] = (i_23 | i_24 | i_25) >>> 8;
													}
												} else {
													++i_8;
												}
											}

											i_8 += i_12;
											i_9 += i_13;
										}
									}
								} else if (i_3 == 3) {
									i_14 = i_4 >>> 24;
									i_15 = 256 - i_14;

									for (i_16 = -i_10; i_16 < 0; i_16++) {
										for (i_17 = -i_11; i_17 < 0; i_17++) {
											b_29 = this.aByteArray10221[i_9++];
											i_19 = b_29 > 0 ? this.anIntArray10220[b_29] : 0;
											i_20 = i_19 + i_4;
											i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
											i_22 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
											i_22 = i_20 - i_22 | i_22 - (i_22 >>> 8);
											if (i_19 == 0 && i_14 != 255) {
												i_19 = i_22;
												i_22 = ints_6[i_8];
												i_22 = ((i_19 & 0xff00ff) * i_14 + (i_22 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_19 & 0xff00) + i_15 * (i_22 & 0xff00) & 0xff0000) >> 8;
											}

											ints_6[i_8++] = i_22;
										}

										i_8 += i_12;
										i_9 += i_13;
									}
								} else {
									if (i_3 != 2) {
										throw new IllegalArgumentException();
									}

									i_14 = i_4 >>> 24;
									i_15 = 256 - i_14;
									i_16 = i_15 * (i_4 & 0xff00ff) & ~0xff00ff;
									i_17 = i_15 * (i_4 & 0xff00) & 0xff0000;
									i_4 = (i_16 | i_17) >>> 8;

									for (i_18 = -i_10; i_18 < 0; i_18++) {
										for (i_19 = -i_11; i_19 < 0; i_19++) {
											b_32 = this.aByteArray10221[i_9++];
											if (b_32 != 0) {
												i_21 = this.anIntArray10220[b_32 & 0xff];
												i_16 = (i_21 & 0xff00ff) * i_14 & ~0xff00ff;
												i_17 = i_14 * (i_21 & 0xff00) & 0xff0000;
												ints_6[i_8++] = i_4 + ((i_16 | i_17) >>> 8);
											} else {
												++i_8;
											}
										}

										i_8 += i_12;
										i_9 += i_13;
									}
								}
							}
						} else {
							if (i_5 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_3 == 1) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										if (b_27 != 0) {
											i_17 = this.anIntArray10220[b_27 & 0xff];
											i_18 = ints_6[i_8];
											i_19 = i_17 + i_18;
											i_20 = (i_17 & 0xff00ff) + (i_18 & 0xff00ff);
											i_18 = (i_20 & 0x1000100) + (i_19 - i_20 & 0x10000);
											ints_6[i_8++] = i_19 - i_18 | i_18 - (i_18 >>> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else if (i_3 == 0) {
								i_14 = (i_4 & 0xff0000) >> 16;
								i_15 = (i_4 & 0xff00) >> 8;
								i_16 = i_4 & 0xff;

								for (i_17 = -i_10; i_17 < 0; i_17++) {
									for (i_18 = -i_11; i_18 < 0; i_18++) {
										byte b_33 = this.aByteArray10221[i_9++];
										if (b_33 != 0) {
											i_20 = this.anIntArray10220[b_33 & 0xff];
											i_21 = i_14 * (i_20 & 0xff0000) & ~0xffffff;
											i_22 = i_15 * (i_20 & 0xff00) & 0xff0000;
											i_23 = (i_20 & 0xff) * i_16 & 0xff00;
											i_20 = (i_21 | i_22 | i_23) >>> 8;
											i_24 = ints_6[i_8];
											i_25 = i_20 + i_24;
											i_26 = (i_20 & 0xff00ff) + (i_24 & 0xff00ff);
											i_24 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
											ints_6[i_8++] = i_25 - i_24 | i_24 - (i_24 >>> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else if (i_3 == 3) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										i_17 = b_27 > 0 ? this.anIntArray10220[b_27] : 0;
										i_18 = i_17 + i_4;
										i_19 = (i_17 & 0xff00ff) + (i_4 & 0xff00ff);
										i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										i_17 = i_18 - i_20 | i_20 - (i_20 >>> 8);
										i_20 = ints_6[i_8];
										i_18 = i_17 + i_20;
										i_19 = (i_17 & 0xff00ff) + (i_20 & 0xff00ff);
										i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_6[i_8++] = i_18 - i_20 | i_20 - (i_20 >>> 8);
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								if (i_3 != 2) {
									throw new IllegalArgumentException();
								}

								i_14 = i_4 >>> 24;
								i_15 = 256 - i_14;
								i_16 = i_15 * (i_4 & 0xff00ff) & ~0xff00ff;
								i_17 = i_15 * (i_4 & 0xff00) & 0xff0000;
								i_4 = (i_16 | i_17) >>> 8;

								for (i_18 = -i_10; i_18 < 0; i_18++) {
									for (i_19 = -i_11; i_19 < 0; i_19++) {
										b_32 = this.aByteArray10221[i_9++];
										if (b_32 != 0) {
											i_21 = this.anIntArray10220[b_32 & 0xff];
											i_16 = (i_21 & 0xff00ff) * i_14 & ~0xff00ff;
											i_17 = i_14 * (i_21 & 0xff00) & 0xff0000;
											i_21 = i_4 + ((i_16 | i_17) >>> 8);
											i_22 = ints_6[i_8];
											i_23 = i_21 + i_22;
											i_24 = (i_21 & 0xff00ff) + (i_22 & 0xff00ff);
											i_22 = (i_24 & 0x1000100) + (i_23 - i_24 & 0x10000);
											ints_6[i_8++] = i_23 - i_22 | i_22 - (i_22 >>> 8);
										} else {
											++i_8;
										}
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
	}

	public void method2751() {
		throw new IllegalStateException();
	}

	void method14247(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, boolean bool_13) {
		if (i_7 > 0 && i_8 > 0 && (bool_1 || bool_2)) {
			int i_14 = 0;
			int i_15 = 0;
			int i_16 = this.anInt8853 + this.anInt8851 + this.anInt8855;
			int i_17 = this.anInt8854 + this.anInt8867 + this.anInt8856;
			int i_18 = (i_16 << 16) / i_7;
			int i_19 = (i_17 << 16) / i_8;
			int i_20;
			if (this.anInt8853 > 0) {
				i_20 = (i_18 + (this.anInt8853 << 16) - 1) / i_18;
				i_4 += i_20;
				i_14 += i_20 * i_18 - (this.anInt8853 << 16);
			}

			if (this.anInt8854 > 0) {
				i_20 = (i_19 + (this.anInt8854 << 16) - 1) / i_19;
				i_5 += i_20;
				i_15 += i_20 * i_19 - (this.anInt8854 << 16);
			}

			if (this.anInt8851 < i_16) {
				i_7 = ((this.anInt8851 << 16) - i_14 + i_18 - 1) / i_18;
			}

			if (this.anInt8867 < i_17) {
				i_8 = ((this.anInt8867 << 16) - i_15 + i_19 - 1) / i_19;
			}

			i_20 = i_5 * this.aClass505_Sub3_8875.anInt8980 + i_4;
			int i_21 = this.aClass505_Sub3_8875.anInt8980 - i_7;
			if (i_5 + i_8 > this.aClass505_Sub3_8875.anInt8986) {
				i_8 -= i_5 + i_8 - this.aClass505_Sub3_8875.anInt8986;
			}

			int i_22;
			if (i_5 < this.aClass505_Sub3_8875.anInt9009) {
				i_22 = this.aClass505_Sub3_8875.anInt9009 - i_5;
				i_8 -= i_22;
				i_20 += this.aClass505_Sub3_8875.anInt8980 * i_22;
				i_15 += i_19 * i_22;
			}

			if (i_4 + i_7 > this.aClass505_Sub3_8875.anInt9002) {
				i_22 = i_4 + i_7 - this.aClass505_Sub3_8875.anInt9002;
				i_7 -= i_22;
				i_21 += i_22;
			}

			if (i_4 < this.aClass505_Sub3_8875.anInt8983) {
				i_22 = this.aClass505_Sub3_8875.anInt8983 - i_4;
				i_7 -= i_22;
				i_20 += i_22;
				i_14 += i_18 * i_22;
				i_21 += i_22;
			}

			float[] floats_39 = this.aClass505_Sub3_8875.aFloatArray9010;
			int[] ints_23 = this.aClass505_Sub3_8875.anIntArray8979;
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
			byte b_40;
			if (i_11 == 0) {
				if (i_9 == 1) {
					i_24 = i_14;

					for (i_25 = -i_8; i_25 < 0; i_25++) {
						i_26 = this.anInt8851 * (i_15 >> 16);

						for (i_27 = -i_7; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									ints_23[i_20] = this.anIntArray10220[this.aByteArray10221[i_26 + (i_14 >> 16)] & 0xff];
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
					i_24 = (i_10 & 0xff0000) >> 16;
					i_25 = (i_10 & 0xff00) >> 8;
					i_26 = i_10 & 0xff;
					i_27 = i_14;

					for (i_28 = -i_8; i_28 < 0; i_28++) {
						i_29 = this.anInt8851 * (i_15 >> 16);

						for (i_30 = -i_7; i_30 < 0; i_30++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									i_31 = this.anIntArray10220[this.aByteArray10221[i_29 + (i_14 >> 16)] & 0xff];
									i_32 = i_24 * (i_31 & 0xff0000) & ~0xffffff;
									i_33 = i_25 * (i_31 & 0xff00) & 0xff0000;
									i_34 = (i_31 & 0xff) * i_26 & 0xff00;
									ints_23[i_20] = (i_32 | i_33 | i_34) >>> 8;
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
								}
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

					for (i_25 = -i_8; i_25 < 0; i_25++) {
						i_26 = this.anInt8851 * (i_15 >> 16);

						for (i_27 = -i_7; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									b_40 = this.aByteArray10221[i_26 + (i_14 >> 16)];
									i_29 = b_40 > 0 ? this.anIntArray10220[b_40] : 0;
									i_30 = i_10 + i_29;
									i_31 = (i_29 & 0xff00ff) + (i_10 & 0xff00ff);
									i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
									ints_23[i_20] = i_30 - i_32 | i_32 - (i_32 >>> 8);
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
					if (i_9 != 2) {
						throw new IllegalArgumentException();
					}

					i_24 = i_10 >>> 24;
					i_25 = 256 - i_24;
					i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
					i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
					i_10 = (i_26 | i_27) >>> 8;
					i_28 = i_14;

					for (i_29 = -i_8; i_29 < 0; i_29++) {
						i_30 = this.anInt8851 * (i_15 >> 16);

						for (i_31 = -i_7; i_31 < 0; i_31++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									i_32 = this.anIntArray10220[this.aByteArray10221[i_30 + (i_14 >> 16)] & 0xff];
									i_26 = (i_32 & 0xff00ff) * i_24 & ~0xff00ff;
									i_27 = i_24 * (i_32 & 0xff00) & 0xff0000;
									ints_23[i_20] = i_10 + ((i_26 | i_27) >>> 8);
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
				int i_35;
				int i_36;
				int i_37;
				int i_38;
				byte b_43;
				if (i_11 == 1) {
					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = this.anInt8851 * (i_15 >> 16);

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_40 = this.aByteArray10221[i_26 + (i_14 >> 16)];
									if (b_40 != 0) {
										if (bool_1) {
											ints_23[i_20] = this.anIntArray10220[b_40 & 0xff];
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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
						byte b_41;
						if (i_9 == 0) {
							i_24 = i_14;
							if ((i_10 & 0xffffff) == 16777215) {
								i_25 = i_10 >>> 24;
								i_26 = 256 - i_25;

								for (i_27 = -i_8; i_27 < 0; i_27++) {
									i_28 = this.anInt8851 * (i_15 >> 16);

									for (i_29 = -i_7; i_29 < 0; i_29++) {
										if (!bool_2 || f_6 < floats_39[i_20]) {
											b_41 = this.aByteArray10221[i_28 + (i_14 >> 16)];
											if (b_41 != 0) {
												if (bool_1) {
													i_31 = this.anIntArray10220[b_41 & 0xff];
													i_32 = ints_23[i_20];
													ints_23[i_20] = ((i_31 & 0xff00ff) * i_25 + (i_32 & 0xff00ff) * i_26 & ~0xff00ff) + (i_25 * (i_31 & 0xff00) + i_26 * (i_32 & 0xff00) & 0xff0000) >> 8;
												}

												if (bool_2 && bool_13) {
													floats_39[i_20] = f_6;
												}
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
								i_25 = (i_10 & 0xff0000) >> 16;
								i_26 = (i_10 & 0xff00) >> 8;
								i_27 = i_10 & 0xff;
								i_28 = i_10 >>> 24;
								i_29 = 256 - i_28;

								for (i_30 = -i_8; i_30 < 0; i_30++) {
									i_31 = this.anInt8851 * (i_15 >> 16);

									for (i_32 = -i_7; i_32 < 0; i_32++) {
										if (!bool_2 || f_6 < floats_39[i_20]) {
											byte b_42 = this.aByteArray10221[i_31 + (i_14 >> 16)];
											if (b_42 != 0) {
												i_34 = this.anIntArray10220[b_42 & 0xff];
												if (i_28 != 255) {
													if (bool_1) {
														i_35 = i_25 * (i_34 & 0xff0000) & ~0xffffff;
														i_36 = i_26 * (i_34 & 0xff00) & 0xff0000;
														i_37 = (i_34 & 0xff) * i_27 & 0xff00;
														i_34 = (i_35 | i_36 | i_37) >>> 8;
														i_38 = ints_23[i_20];
														ints_23[i_20] = ((i_34 & 0xff00ff) * i_28 + (i_38 & 0xff00ff) * i_29 & ~0xff00ff) + (i_28 * (i_34 & 0xff00) + i_29 * (i_38 & 0xff00) & 0xff0000) >> 8;
													}

													if (bool_2 && bool_13) {
														floats_39[i_20] = f_6;
													}
												} else {
													if (bool_1) {
														i_35 = i_25 * (i_34 & 0xff0000) & ~0xffffff;
														i_36 = i_26 * (i_34 & 0xff00) & 0xff0000;
														i_37 = (i_34 & 0xff) * i_27 & 0xff00;
														ints_23[i_20] = (i_35 | i_36 | i_37) >>> 8;
													}

													if (bool_2 && bool_13) {
														floats_39[i_20] = f_6;
													}
												}
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
							i_25 = i_10 >>> 24;
							i_26 = 256 - i_25;

							for (i_27 = -i_8; i_27 < 0; i_27++) {
								i_28 = this.anInt8851 * (i_15 >> 16);

								for (i_29 = -i_7; i_29 < 0; i_29++) {
									if (!bool_2 || f_6 < floats_39[i_20]) {
										if (bool_1) {
											b_41 = this.aByteArray10221[i_28 + (i_14 >> 16)];
											i_31 = b_41 > 0 ? this.anIntArray10220[b_41] : 0;
											i_32 = i_10 + i_31;
											i_33 = (i_31 & 0xff00ff) + (i_10 & 0xff00ff);
											i_34 = (i_33 & 0x1000100) + (i_32 - i_33 & 0x10000);
											i_34 = i_32 - i_34 | i_34 - (i_34 >>> 8);
											if (i_31 == 0 && i_25 != 255) {
												i_31 = i_34;
												i_34 = ints_23[i_20];
												i_34 = ((i_31 & 0xff00ff) * i_25 + (i_34 & 0xff00ff) * i_26 & ~0xff00ff) + (i_25 * (i_31 & 0xff00) + i_26 * (i_34 & 0xff00) & 0xff0000) >> 8;
											}

											ints_23[i_20] = i_34;
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
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
							if (i_9 != 2) {
								throw new IllegalArgumentException();
							}

							i_24 = i_10 >>> 24;
							i_25 = 256 - i_24;
							i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
							i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
							i_10 = (i_26 | i_27) >>> 8;
							i_28 = i_14;

							for (i_29 = -i_8; i_29 < 0; i_29++) {
								i_30 = this.anInt8851 * (i_15 >> 16);

								for (i_31 = -i_7; i_31 < 0; i_31++) {
									if (!bool_2 || f_6 < floats_39[i_20]) {
										b_43 = this.aByteArray10221[i_30 + (i_14 >> 16)];
										if (b_43 != 0) {
											if (bool_1) {
												i_33 = this.anIntArray10220[b_43 & 0xff];
												i_26 = (i_33 & 0xff00ff) * i_24 & ~0xff00ff;
												i_27 = i_24 * (i_33 & 0xff00) & 0xff0000;
												ints_23[i_20] = i_10 + ((i_26 | i_27) >>> 8);
											}

											if (bool_2 && bool_13) {
												floats_39[i_20] = f_6;
											}
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
				} else {
					if (i_11 != 2) {
						throw new IllegalArgumentException();
					}

					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = this.anInt8851 * (i_15 >> 16);

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_40 = this.aByteArray10221[i_26 + (i_14 >> 16)];
									if (b_40 != 0) {
										if (bool_1) {
											i_29 = this.anIntArray10220[b_40 & 0xff];
											i_30 = ints_23[i_20];
											i_31 = i_29 + i_30;
											i_32 = (i_29 & 0xff00ff) + (i_30 & 0xff00ff);
											i_30 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
											ints_23[i_20] = i_31 - i_30 | i_30 - (i_30 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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
						i_25 = (i_10 & 0xff0000) >> 16;
						i_26 = (i_10 & 0xff00) >> 8;
						i_27 = i_10 & 0xff;

						for (i_28 = -i_8; i_28 < 0; i_28++) {
							i_29 = this.anInt8851 * (i_15 >> 16);

							for (i_30 = -i_7; i_30 < 0; i_30++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									byte b_44 = this.aByteArray10221[i_29 + (i_14 >> 16)];
									if (b_44 != 0) {
										if (bool_1) {
											i_32 = this.anIntArray10220[b_44 & 0xff];
											i_33 = i_25 * (i_32 & 0xff0000) & ~0xffffff;
											i_34 = i_26 * (i_32 & 0xff00) & 0xff0000;
											i_35 = (i_32 & 0xff) * i_27 & 0xff00;
											i_32 = (i_33 | i_34 | i_35) >>> 8;
											i_36 = ints_23[i_20];
											i_37 = i_32 + i_36;
											i_38 = (i_32 & 0xff00ff) + (i_36 & 0xff00ff);
											i_36 = (i_38 & 0x1000100) + (i_37 - i_38 & 0x10000);
											ints_23[i_20] = i_37 - i_36 | i_36 - (i_36 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = this.anInt8851 * (i_15 >> 16);

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									if (bool_1) {
										b_40 = this.aByteArray10221[i_26 + (i_14 >> 16)];
										i_29 = b_40 > 0 ? this.anIntArray10220[b_40] : 0;
										i_30 = i_10 + i_29;
										i_31 = (i_29 & 0xff00ff) + (i_10 & 0xff00ff);
										i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
										i_29 = i_30 - i_32 | i_32 - (i_32 >>> 8);
										i_32 = ints_23[i_20];
										i_30 = i_29 + i_32;
										i_31 = (i_29 & 0xff00ff) + (i_32 & 0xff00ff);
										i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
										ints_23[i_20] = i_30 - i_32 | i_32 - (i_32 >>> 8);
									}

									if (bool_2 && bool_13) {
										floats_39[i_20] = f_6;
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
						if (i_9 != 2) {
							throw new IllegalArgumentException();
						}

						i_24 = i_10 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
						i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
						i_10 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_8; i_29 < 0; i_29++) {
							i_30 = this.anInt8851 * (i_15 >> 16);

							for (i_31 = -i_7; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_43 = this.aByteArray10221[i_30 + (i_14 >> 16)];
									if (b_43 != 0) {
										if (bool_1) {
											i_33 = this.anIntArray10220[b_43 & 0xff];
											i_26 = (i_33 & 0xff00ff) * i_24 & ~0xff00ff;
											i_27 = i_24 * (i_33 & 0xff00) & 0xff0000;
											i_33 = i_10 + ((i_26 | i_27) >>> 8);
											i_34 = ints_23[i_20];
											i_35 = i_33 + i_34;
											i_36 = (i_33 & 0xff00ff) + (i_34 & 0xff00ff);
											i_34 = (i_36 & 0x1000100) + (i_35 - i_36 & 0x10000);
											ints_23[i_20] = i_35 - i_34 | i_34 - (i_34 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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

	public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			int[] ints_6 = this.aClass505_Sub3_8875.anIntArray8979;
			if (ints_6 != null) {
				i_1 += this.anInt8853;
				i_2 += this.anInt8854;
				int i_7 = 0;
				int i_8 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
				int i_9 = this.anInt8851;
				int i_10 = this.anInt8867;
				int i_11 = i_8 - i_9;
				int i_12 = 0;
				int i_13 = i_1 + i_2 * i_8;
				int i_14;
				if (i_2 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
					i_14 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_2;
					i_10 -= i_14;
					i_2 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457;
					i_7 += i_14 * i_9;
					i_13 += i_14 * i_8;
				}

				if (i_2 + i_10 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
					i_10 -= i_2 + i_10 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
				}

				if (i_1 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
					i_14 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_1;
					i_9 -= i_14;
					i_1 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989;
					i_7 += i_14;
					i_13 += i_14;
					i_12 += i_14;
					i_11 += i_14;
				}

				if (i_1 + i_9 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
					i_14 = i_1 + i_9 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
					i_9 -= i_14;
					i_12 += i_14;
					i_11 += i_14;
				}

				if (i_9 > 0 && i_10 > 0) {
					PacketsDecoder packetsdecoder_26 = (PacketsDecoder) class455_3;
					int[] ints_15 = packetsdecoder_26.anIntArray9077;
					int[] ints_16 = packetsdecoder_26.anIntArray9078;
					int i_17 = i_2;
					if (i_5 > i_2) {
						i_17 = i_5;
						i_13 += (i_5 - i_2) * i_8;
						i_7 += (i_5 - i_2) * this.anInt8851;
					}

					int i_18 = i_5 + ints_15.length < i_2 + i_10 ? i_5 + ints_15.length : i_2 + i_10;

					for (int i_19 = i_17; i_19 < i_18; i_19++) {
						int i_20 = ints_15[i_19 - i_5] + i_4;
						int i_21 = ints_16[i_19 - i_5];
						int i_22 = i_9;
						int i_23;
						if (i_1 > i_20) {
							i_23 = i_1 - i_20;
							if (i_23 >= i_21) {
								i_7 += i_9 + i_12;
								i_13 += i_9 + i_11;
								continue;
							}

							i_21 -= i_23;
						} else {
							i_23 = i_20 - i_1;
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
						if (i_22 < i_21) {
							i_21 = i_22;
						} else {
							i_23 = i_22 - i_21;
						}

						for (int i_24 = -i_21; i_24 < 0; i_24++) {
							byte b_25 = this.aByteArray10221[i_7++];
							if (b_25 != 0) {
								ints_6[i_13++] = this.anIntArray10220[b_25 & 0xff];
							} else {
								++i_13;
							}
						}

						i_7 += i_23 + i_12;
						i_13 += i_23 + i_11;
					}
				}
			}

		}
	}

	void method14245(int i_1, int i_2) {
		int[] ints_3 = this.aClass505_Sub3_8875.anIntArray8979;
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
			int i_19;
			byte b_21;
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_7 >= 0 && i_6 - (this.anInt8851 << 12) < 0 && i_7 - (this.anInt8867 << 12) < 0) {
							for (; i_8 < 0; i_8++) {
								i_9 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
								i_10 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_10] = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
									} else if (i_1 == 0) {
										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = anInt8880 * (i_11 & 0xff0000) & ~0xffffff;
										i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
										i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
									} else if (i_1 == 3) {
										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = (i_11 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_10] = ((i_12 | i_13) >>> 8) + anInt8885;
									}
								} else {
									byte b_20;
									if (i_2 == 1) {
										if (i_1 == 1) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												ints_3[i_10] = this.anIntArray10220[b_20 & 0xff];
											}
										} else if (i_1 == 0) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												if ((anInt8877 & 0xffffff) == 16777215) {
													i_13 = anInt8877 >>> 24;
													i_14 = 256 - i_13;
													i_15 = ints_3[i_10];
													ints_3[i_10] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & ~0xff00ff) + (i_13 * (i_12 & 0xff00) + i_14 * (i_15 & 0xff00) & 0xff0000) >> 8;
												} else if (anInt8878 != 255) {
													i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
													i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
													i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
													i_12 = (i_13 | i_14 | i_15) >>> 8;
													i_16 = ints_3[i_10];
													ints_3[i_10] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
												} else {
													i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
													i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
													i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
													ints_3[i_10] = (i_13 | i_14 | i_15) >>> 8;
												}
											}
										} else if (i_1 == 3) {
											b_20 = this.aByteArray10221[i_9];
											i_12 = b_20 > 0 ? this.anIntArray10220[b_20] : 0;
											i_13 = anInt8877;
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
											if (i_12 == 0 && anInt8878 != 255) {
												i_12 = i_16;
												i_16 = ints_3[i_10];
												i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											}

											ints_3[i_10] = i_16;
										} else {
											if (i_1 != 2) {
												throw new IllegalArgumentException();
											}

											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
												i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
												ints_3[i_10++] = ((i_13 | i_14) >>> 8) + anInt8885;
											}
										}
									} else {
										if (i_2 != 2) {
											throw new IllegalArgumentException();
										}

										if (i_1 == 1) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = ints_3[i_10];
												i_14 = i_12 + i_13;
												i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
												i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
												ints_3[i_10] = i_14 - i_13 | i_13 - (i_13 >>> 8);
											}
										} else if (i_1 == 0) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_10];
												i_17 = i_12 + i_16;
												i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
												i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
												ints_3[i_10] = i_17 - i_16 | i_16 - (i_16 >>> 8);
											}
										} else if (i_1 == 3) {
											b_20 = this.aByteArray10221[i_9];
											i_12 = b_20 > 0 ? this.anIntArray10220[b_20] : 0;
											i_13 = anInt8877;
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
											if (i_12 == 0 && anInt8878 != 255) {
												i_12 = i_16;
												i_16 = ints_3[i_10];
												i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											}

											ints_3[i_10] = i_16;
										} else if (i_1 == 2) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
												i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
												i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
												i_15 = ints_3[i_10];
												i_16 = i_12 + i_15;
												i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
												i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
												ints_3[i_10] = i_16 - i_15 | i_15 - (i_15 >>> 8);
											}
										}
									}
								}
							}
						}

						++i_4;
					}
				} else if (anInt8868 < 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (this.anInt8851 << 12) < 0) {
							if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
								i_9 = (anInt8868 - i_9) / anInt8868;
								i_8 += i_9;
								i_7 += i_9 * anInt8868;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (this.anInt8851 << 12) < 0) {
							if (i_7 < 0) {
								i_9 = (anInt8868 - 1 - i_7) / anInt8868;
								i_8 += i_9;
								i_7 += i_9 * anInt8868;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 + 1 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_7 >= 0 && i_7 - (this.anInt8867 << 12) < 0) {
							if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
								i_9 = (anInt8865 - i_9) / anInt8865;
								i_8 += i_9;
								i_6 += i_9 * anInt8865;
								i_5 += i_9;
							}

							if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else if (anInt8868 < 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
							i_9 = (anInt8868 - i_9) / anInt8868;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
						i_5 = anInt8870;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						if (i_7 < 0) {
							i_9 = (anInt8868 - 1 - i_7) / anInt8868;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_7 += i_9 * anInt8868;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 + 1 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				}
			} else if (anInt8868 == 0) {
				for (i_4 = anInt8864; i_4 < 0; anInt8870 += anInt8850) {
					i_5 = anInt8870;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874;
					i_8 = anInt8862;
					if (i_7 >= 0 && i_7 - (this.anInt8867 << 12) < 0) {
						if (i_6 < 0) {
							i_9 = (anInt8865 - 1 - i_6) / anInt8865;
							i_8 += i_9;
							i_6 += i_9 * anInt8865;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 + 1 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
			} else if (anInt8868 < 0) {
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

					if ((i_9 = (i_6 + 1 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
						i_8 = i_9;
					}

					if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
						i_9 = (anInt8868 - i_9) / anInt8868;
						i_8 += i_9;
						i_6 += i_9 * anInt8865;
						i_7 += i_9 * anInt8868;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
						i_8 = i_9;
					}

					while (i_8 < 0) {
						i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1) {
								ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
							} else if (i_1 == 0) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_14 = anInt8877 >>> 24;
										i_15 = 256 - i_14;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
									}
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = ints_3[i_11];
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
									i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
									i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
									i_13 = (i_14 | i_15 | i_16) >>> 8;
									i_17 = ints_3[i_11];
									i_18 = i_13 + i_17;
									i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
									i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
									ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else if (i_1 == 2) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
									i_16 = ints_3[i_11];
									i_17 = i_13 + i_16;
									i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
			} else {
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

					if ((i_9 = (i_6 + 1 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
						i_8 = i_9;
					}

					if (i_7 < 0) {
						i_9 = (anInt8868 - 1 - i_7) / anInt8868;
						i_8 += i_9;
						i_6 += i_9 * anInt8865;
						i_7 += i_9 * anInt8868;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 + 1 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
						i_8 = i_9;
					}

					while (i_8 < 0) {
						i_10 = (i_6 >> 12) + (i_7 >> 12) * this.anInt8851;
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1) {
								ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
							} else if (i_1 == 0) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8880 * (i_12 & 0xff0000) & ~0xffffff;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_14 = anInt8877 >>> 24;
										i_15 = 256 - i_14;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + (i_14 * (i_13 & 0xff00) + i_15 * (i_16 & 0xff00) & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
									}
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = ints_3[i_11];
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = anInt8880 * (i_13 & 0xff0000) & ~0xffffff;
									i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
									i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
									i_13 = (i_14 | i_15 | i_16) >>> 8;
									i_17 = ints_3[i_11];
									i_18 = i_13 + i_17;
									i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
									i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
									ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else if (i_1 == 2) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
									i_16 = ints_3[i_11];
									i_17 = i_13 + i_16;
									i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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

	}

	void method14250(int[] ints_1, int[] ints_2, int i_3, int i_4) {
		int[] ints_5 = this.aClass505_Sub3_8875.anIntArray8979;
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
			byte b_16;
			int i_17;
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870;
							i_9 = anInt8873;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_10 >= 0 && i_9 - (this.anInt8851 << 12) < 0 && i_10 - (this.anInt8867 << 12) < 0) {
								i_12 = ints_1[i_7] - i_3;
								i_13 = -ints_2[i_7];
								i_14 = i_12 - (i_8 - anInt8870);
								if (i_14 > 0) {
									i_8 += i_14;
									i_11 += i_14;
									i_9 += i_14 * anInt8865;
									i_10 += i_14 * anInt8868;
								} else {
									i_13 -= i_14;
								}

								if (i_11 < i_13) {
									i_11 = i_13;
								}

								for (; i_11 < 0; i_11++) {
									byte b_15 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
									if (b_15 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_15 & 0xff];
									} else {
										++i_8;
									}
								}
							}
						}

						++i_6;
					}
				} else if (anInt8868 < 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (this.anInt8851 << 12) < 0) {
								if ((i_12 = i_10 - (this.anInt8867 << 12)) >= 0) {
									i_12 = (anInt8868 - i_12) / anInt8868;
									i_11 += i_12;
									i_10 += i_12 * anInt8868;
									i_8 += i_12;
								}

								if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11) {
									i_11 = i_12;
								}

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_17 = i_13 - (i_8 - anInt8870);
								if (i_17 > 0) {
									i_8 += i_17;
									i_11 += i_17;
									i_9 += i_17 * anInt8865;
									i_10 += i_17 * anInt8868;
								} else {
									i_14 -= i_17;
								}

								if (i_11 < i_14) {
									i_11 = i_14;
								}

								while (i_11 < 0) {
									b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
									if (b_16 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
									} else {
										++i_8;
									}

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
				} else {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (this.anInt8851 << 12) < 0) {
								if (i_10 < 0) {
									i_12 = (anInt8868 - 1 - i_10) / anInt8868;
									i_11 += i_12;
									i_10 += i_12 * anInt8868;
									i_8 += i_12;
								}

								if ((i_12 = (i_10 + 1 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_11) {
									i_11 = i_12;
								}

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_17 = i_13 - (i_8 - anInt8870);
								if (i_17 > 0) {
									i_8 += i_17;
									i_11 += i_17;
									i_9 += i_17 * anInt8865;
									i_10 += i_17 * anInt8868;
								} else {
									i_14 -= i_17;
								}

								if (i_11 < i_14) {
									i_11 = i_14;
								}

								while (i_11 < 0) {
									b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
									if (b_16 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
									} else {
										++i_8;
									}

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_10 >= 0 && i_10 - (this.anInt8867 << 12) < 0) {
								if ((i_12 = i_9 - (this.anInt8851 << 12)) >= 0) {
									i_12 = (anInt8865 - i_12) / anInt8865;
									i_11 += i_12;
									i_9 += i_12 * anInt8865;
									i_8 += i_12;
								}

								if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11) {
									i_11 = i_12;
								}

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_17 = i_13 - (i_8 - anInt8870);
								if (i_17 > 0) {
									i_8 += i_17;
									i_11 += i_17;
									i_9 += i_17 * anInt8865;
									i_10 += i_17 * anInt8868;
								} else {
									i_14 -= i_17;
								}

								if (i_11 < i_14) {
									i_11 = i_14;
								}

								while (i_11 < 0) {
									b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
									if (b_16 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
									} else {
										++i_8;
									}

									i_9 += anInt8865;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8874 += anInt8876;
					}
				} else if (anInt8868 < 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (this.anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11) {
								i_11 = i_12;
							}

							if ((i_12 = i_10 - (this.anInt8867 << 12)) >= 0) {
								i_12 = (anInt8868 - i_12) / anInt8868;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11) {
								i_11 = i_12;
							}

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_17 = i_13 - (i_8 - anInt8870);
							if (i_17 > 0) {
								i_8 += i_17;
								i_11 += i_17;
								i_9 += i_17 * anInt8865;
								i_10 += i_17 * anInt8868;
							} else {
								i_14 -= i_17;
							}

							if (i_11 < i_14) {
								i_11 = i_14;
							}

							while (i_11 < 0) {
								b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
								if (b_16 != 0) {
									ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
								} else {
									++i_8;
								}

								i_9 += anInt8865;
								i_10 += anInt8868;
								++i_11;
							}
						}

						++i_6;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				} else {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (this.anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11) {
								i_11 = i_12;
							}

							if (i_10 < 0) {
								i_12 = (anInt8868 - 1 - i_10) / anInt8868;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_10 += i_12 * anInt8868;
								i_8 += i_12;
							}

							if ((i_12 = (i_10 + 1 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_11) {
								i_11 = i_12;
							}

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_17 = i_13 - (i_8 - anInt8870);
							if (i_17 > 0) {
								i_8 += i_17;
								i_11 += i_17;
								i_9 += i_17 * anInt8865;
								i_10 += i_17 * anInt8868;
							} else {
								i_14 -= i_17;
							}

							if (i_11 < i_14) {
								i_11 = i_14;
							}

							while (i_11 < 0) {
								b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
								if (b_16 != 0) {
									ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
								} else {
									++i_8;
								}

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
			} else if (anInt8868 == 0) {
				for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length) {
							break;
						}

						i_8 = anInt8870;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874;
						i_11 = anInt8862;
						if (i_10 >= 0 && i_10 - (this.anInt8867 << 12) < 0) {
							if (i_9 < 0) {
								i_12 = (anInt8865 - 1 - i_9) / anInt8865;
								i_11 += i_12;
								i_9 += i_12 * anInt8865;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 + 1 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_11) {
								i_11 = i_12;
							}

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_17 = i_13 - (i_8 - anInt8870);
							if (i_17 > 0) {
								i_8 += i_17;
								i_11 += i_17;
								i_9 += i_17 * anInt8865;
								i_10 += i_17 * anInt8868;
							} else {
								i_14 -= i_17;
							}

							if (i_11 < i_14) {
								i_11 = i_14;
							}

							while (i_11 < 0) {
								b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
								if (b_16 != 0) {
									ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
								} else {
									++i_8;
								}

								i_9 += anInt8865;
								++i_11;
							}
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			} else if (anInt8868 < 0) {
				for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length) {
							break;
						}

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

						if ((i_12 = (i_9 + 1 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_11) {
							i_11 = i_12;
						}

						if ((i_12 = i_10 - (this.anInt8867 << 12)) >= 0) {
							i_12 = (anInt8868 - i_12) / anInt8868;
							i_11 += i_12;
							i_9 += i_12 * anInt8865;
							i_10 += i_12 * anInt8868;
							i_8 += i_12;
						}

						if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11) {
							i_11 = i_12;
						}

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_17 = i_13 - (i_8 - anInt8870);
						if (i_17 > 0) {
							i_8 += i_17;
							i_11 += i_17;
							i_9 += i_17 * anInt8865;
							i_10 += i_17 * anInt8868;
						} else {
							i_14 -= i_17;
						}

						if (i_11 < i_14) {
							i_11 = i_14;
						}

						while (i_11 < 0) {
							b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
							if (b_16 != 0) {
								ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
							} else {
								++i_8;
							}

							i_9 += anInt8865;
							i_10 += anInt8868;
							++i_11;
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			} else {
				for (i_6 = anInt8864; i_6 < 0; anInt8870 += anInt8850) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length) {
							break;
						}

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

						if ((i_12 = (i_9 + 1 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_11) {
							i_11 = i_12;
						}

						if (i_10 < 0) {
							i_12 = (anInt8868 - 1 - i_10) / anInt8868;
							i_11 += i_12;
							i_9 += i_12 * anInt8865;
							i_10 += i_12 * anInt8868;
							i_8 += i_12;
						}

						if ((i_12 = (i_10 + 1 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_11) {
							i_11 = i_12;
						}

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_17 = i_13 - (i_8 - anInt8870);
						if (i_17 > 0) {
							i_8 += i_17;
							i_11 += i_17;
							i_9 += i_17 * anInt8865;
							i_10 += i_17 * anInt8868;
						} else {
							i_14 -= i_17;
						}

						if (i_11 < i_14) {
							i_11 = i_14;
						}

						while (i_11 < 0) {
							b_16 = this.aByteArray10221[(i_9 >> 12) + (i_10 >> 12) * this.anInt8851];
							if (b_16 != 0) {
								ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
							} else {
								++i_8;
							}

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

	}

	public Interface9 method2808() {
		throw new IllegalStateException();
	}

	public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		throw new IllegalStateException();
	}

	public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		throw new IllegalStateException();
	}

	public void method2770(int i_1, int i_2, int i_3) {
		throw new IllegalStateException();
	}

	public void method2771(int i_1, int i_2, int i_3) {
		throw new IllegalStateException();
	}

	public Interface9 method2801() {
		throw new IllegalStateException();
	}

	void method14255(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_13) {
		if (i_7 > 0 && i_8 > 0 && (bool_1 || bool_2)) {
			int i_14 = 0;
			int i_15 = 0;
			int i_16 = this.anInt8853 + this.anInt8851 + this.anInt8855;
			int i_17 = this.anInt8854 + this.anInt8867 + this.anInt8856;
			int i_18 = (i_16 << 16) / i_7;
			int i_19 = (i_17 << 16) / i_8;
			int i_20;
			if (this.anInt8853 > 0) {
				i_20 = ((this.anInt8853 << 16) + i_18 - 1) / i_18;
				i_4 += i_20;
				i_14 += i_20 * i_18 - (this.anInt8853 << 16);
			}

			if (this.anInt8854 > 0) {
				i_20 = ((this.anInt8854 << 16) + i_19 - 1) / i_19;
				i_5 += i_20;
				i_15 += i_20 * i_19 - (this.anInt8854 << 16);
			}

			if (this.anInt8851 < i_16) {
				i_7 = ((this.anInt8851 << 16) - i_14 + i_18 - 1) / i_18;
			}

			if (this.anInt8867 < i_17) {
				i_8 = ((this.anInt8867 << 16) - i_15 + i_19 - 1) / i_19;
			}

			i_20 = i_4 + i_5 * this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
			int i_21 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403 - i_7;
			if (i_5 + i_8 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
				i_8 -= i_5 + i_8 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
			}

			int i_22;
			if (i_5 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
				i_22 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_5;
				i_8 -= i_22;
				i_20 += i_22 * this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
				i_15 += i_19 * i_22;
			}

			if (i_4 + i_7 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
				i_22 = i_4 + i_7 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
				i_7 -= i_22;
				i_21 += i_22;
			}

			if (i_4 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
				i_22 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_4;
				i_7 -= i_22;
				i_20 += i_22;
				i_14 += i_18 * i_22;
				i_21 += i_22;
			}

			float[] floats_39 = this.aClass505_Sub3_8875.aFloatArray9010;
			int[] ints_23 = this.aClass505_Sub3_8875.anIntArray8979;
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
			byte b_40;
			if (i_11 == 0) {
				if (i_9 == 1) {
					i_24 = i_14;

					for (i_25 = -i_8; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * this.anInt8851;

						for (i_27 = -i_7; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									ints_23[i_20] = this.anIntArray10220[this.aByteArray10221[(i_14 >> 16) + i_26] & 0xff];
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
					i_24 = (i_10 & 0xff0000) >> 16;
					i_25 = (i_10 & 0xff00) >> 8;
					i_26 = i_10 & 0xff;
					i_27 = i_14;

					for (i_28 = -i_8; i_28 < 0; i_28++) {
						i_29 = (i_15 >> 16) * this.anInt8851;

						for (i_30 = -i_7; i_30 < 0; i_30++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									i_31 = this.anIntArray10220[this.aByteArray10221[(i_14 >> 16) + i_29] & 0xff];
									i_32 = (i_31 & 0xff0000) * i_24 & ~0xffffff;
									i_33 = (i_31 & 0xff00) * i_25 & 0xff0000;
									i_34 = (i_31 & 0xff) * i_26 & 0xff00;
									ints_23[i_20] = (i_32 | i_33 | i_34) >>> 8;
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
								}
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

					for (i_25 = -i_8; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * this.anInt8851;

						for (i_27 = -i_7; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
									i_29 = b_40 > 0 ? this.anIntArray10220[b_40] : 0;
									i_30 = i_29 + i_10;
									i_31 = (i_29 & 0xff00ff) + (i_10 & 0xff00ff);
									i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
									ints_23[i_20] = i_30 - i_32 | i_32 - (i_32 >>> 8);
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
					if (i_9 != 2) {
						throw new IllegalArgumentException();
					}

					i_24 = i_10 >>> 24;
					i_25 = 256 - i_24;
					i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
					i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
					i_10 = (i_26 | i_27) >>> 8;
					i_28 = i_14;

					for (i_29 = -i_8; i_29 < 0; i_29++) {
						i_30 = (i_15 >> 16) * this.anInt8851;

						for (i_31 = -i_7; i_31 < 0; i_31++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									i_32 = this.anIntArray10220[this.aByteArray10221[(i_14 >> 16) + i_30] & 0xff];
									i_26 = (i_32 & 0xff00ff) * i_24 & ~0xff00ff;
									i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
									ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_10;
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
				int i_35;
				int i_36;
				int i_37;
				int i_38;
				byte b_43;
				if (i_11 == 1) {
					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * this.anInt8851;

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
									if (b_40 != 0) {
										if (bool_1) {
											ints_23[i_20] = this.anIntArray10220[b_40 & 0xff];
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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
						byte b_41;
						if (i_9 == 0) {
							i_24 = i_14;
							if ((i_10 & 0xffffff) == 16777215) {
								i_25 = i_10 >>> 24;
								i_26 = 256 - i_25;

								for (i_27 = -i_8; i_27 < 0; i_27++) {
									i_28 = (i_15 >> 16) * this.anInt8851;

									for (i_29 = -i_7; i_29 < 0; i_29++) {
										if (!bool_2 || f_6 < floats_39[i_20]) {
											b_41 = this.aByteArray10221[(i_14 >> 16) + i_28];
											if (b_41 != 0) {
												if (bool_1) {
													i_31 = this.anIntArray10220[b_41 & 0xff];
													i_32 = ints_23[i_20];
													ints_23[i_20] = ((i_31 & 0xff00ff) * i_25 + (i_32 & 0xff00ff) * i_26 & ~0xff00ff) + ((i_31 & 0xff00) * i_25 + (i_32 & 0xff00) * i_26 & 0xff0000) >> 8;
												}

												if (bool_2 && bool_13) {
													floats_39[i_20] = f_6;
												}
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
								i_25 = (i_10 & 0xff0000) >> 16;
								i_26 = (i_10 & 0xff00) >> 8;
								i_27 = i_10 & 0xff;
								i_28 = i_10 >>> 24;
								i_29 = 256 - i_28;

								for (i_30 = -i_8; i_30 < 0; i_30++) {
									i_31 = (i_15 >> 16) * this.anInt8851;

									for (i_32 = -i_7; i_32 < 0; i_32++) {
										if (!bool_2 || f_6 < floats_39[i_20]) {
											byte b_42 = this.aByteArray10221[(i_14 >> 16) + i_31];
											if (b_42 != 0) {
												i_34 = this.anIntArray10220[b_42 & 0xff];
												if (i_28 != 255) {
													if (bool_1) {
														i_35 = (i_34 & 0xff0000) * i_25 & ~0xffffff;
														i_36 = (i_34 & 0xff00) * i_26 & 0xff0000;
														i_37 = (i_34 & 0xff) * i_27 & 0xff00;
														i_34 = (i_35 | i_36 | i_37) >>> 8;
														i_38 = ints_23[i_20];
														ints_23[i_20] = ((i_34 & 0xff00ff) * i_28 + (i_38 & 0xff00ff) * i_29 & ~0xff00ff) + ((i_34 & 0xff00) * i_28 + (i_38 & 0xff00) * i_29 & 0xff0000) >> 8;
													}

													if (bool_2 && bool_13) {
														floats_39[i_20] = f_6;
													}
												} else {
													if (bool_1) {
														i_35 = (i_34 & 0xff0000) * i_25 & ~0xffffff;
														i_36 = (i_34 & 0xff00) * i_26 & 0xff0000;
														i_37 = (i_34 & 0xff) * i_27 & 0xff00;
														ints_23[i_20] = (i_35 | i_36 | i_37) >>> 8;
													}

													if (bool_2 && bool_13) {
														floats_39[i_20] = f_6;
													}
												}
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
							i_25 = i_10 >>> 24;
							i_26 = 256 - i_25;

							for (i_27 = -i_8; i_27 < 0; i_27++) {
								i_28 = (i_15 >> 16) * this.anInt8851;

								for (i_29 = -i_7; i_29 < 0; i_29++) {
									if (!bool_2 || f_6 < floats_39[i_20]) {
										if (bool_1) {
											b_41 = this.aByteArray10221[(i_14 >> 16) + i_28];
											i_31 = b_41 > 0 ? this.anIntArray10220[b_41] : 0;
											i_32 = i_31 + i_10;
											i_33 = (i_31 & 0xff00ff) + (i_10 & 0xff00ff);
											i_34 = (i_33 & 0x1000100) + (i_32 - i_33 & 0x10000);
											i_34 = i_32 - i_34 | i_34 - (i_34 >>> 8);
											if (i_31 == 0 && i_25 != 255) {
												i_31 = i_34;
												i_34 = ints_23[i_20];
												i_34 = ((i_31 & 0xff00ff) * i_25 + (i_34 & 0xff00ff) * i_26 & ~0xff00ff) + ((i_31 & 0xff00) * i_25 + (i_34 & 0xff00) * i_26 & 0xff0000) >> 8;
											}

											ints_23[i_20] = i_34;
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
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
							if (i_9 != 2) {
								throw new IllegalArgumentException();
							}

							i_24 = i_10 >>> 24;
							i_25 = 256 - i_24;
							i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
							i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
							i_10 = (i_26 | i_27) >>> 8;
							i_28 = i_14;

							for (i_29 = -i_8; i_29 < 0; i_29++) {
								i_30 = (i_15 >> 16) * this.anInt8851;

								for (i_31 = -i_7; i_31 < 0; i_31++) {
									if (!bool_2 || f_6 < floats_39[i_20]) {
										b_43 = this.aByteArray10221[(i_14 >> 16) + i_30];
										if (b_43 != 0) {
											if (bool_1) {
												i_33 = this.anIntArray10220[b_43 & 0xff];
												i_26 = (i_33 & 0xff00ff) * i_24 & ~0xff00ff;
												i_27 = (i_33 & 0xff00) * i_24 & 0xff0000;
												ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_10;
											}

											if (bool_2 && bool_13) {
												floats_39[i_20] = f_6;
											}
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
				} else {
					if (i_11 != 2) {
						throw new IllegalArgumentException();
					}

					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * this.anInt8851;

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
									if (b_40 != 0) {
										if (bool_1) {
											i_29 = this.anIntArray10220[b_40 & 0xff];
											i_30 = ints_23[i_20];
											i_31 = i_29 + i_30;
											i_32 = (i_29 & 0xff00ff) + (i_30 & 0xff00ff);
											i_30 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
											ints_23[i_20] = i_31 - i_30 | i_30 - (i_30 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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
						i_25 = (i_10 & 0xff0000) >> 16;
						i_26 = (i_10 & 0xff00) >> 8;
						i_27 = i_10 & 0xff;

						for (i_28 = -i_8; i_28 < 0; i_28++) {
							i_29 = (i_15 >> 16) * this.anInt8851;

							for (i_30 = -i_7; i_30 < 0; i_30++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									byte b_44 = this.aByteArray10221[(i_14 >> 16) + i_29];
									if (b_44 != 0) {
										if (bool_1) {
											i_32 = this.anIntArray10220[b_44 & 0xff];
											i_33 = (i_32 & 0xff0000) * i_25 & ~0xffffff;
											i_34 = (i_32 & 0xff00) * i_26 & 0xff0000;
											i_35 = (i_32 & 0xff) * i_27 & 0xff00;
											i_32 = (i_33 | i_34 | i_35) >>> 8;
											i_36 = ints_23[i_20];
											i_37 = i_32 + i_36;
											i_38 = (i_32 & 0xff00ff) + (i_36 & 0xff00ff);
											i_36 = (i_38 & 0x1000100) + (i_37 - i_38 & 0x10000);
											ints_23[i_20] = i_37 - i_36 | i_36 - (i_36 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * this.anInt8851;

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									if (bool_1) {
										b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
										i_29 = b_40 > 0 ? this.anIntArray10220[b_40] : 0;
										i_30 = i_29 + i_10;
										i_31 = (i_29 & 0xff00ff) + (i_10 & 0xff00ff);
										i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
										i_29 = i_30 - i_32 | i_32 - (i_32 >>> 8);
										i_32 = ints_23[i_20];
										i_30 = i_29 + i_32;
										i_31 = (i_29 & 0xff00ff) + (i_32 & 0xff00ff);
										i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
										ints_23[i_20] = i_30 - i_32 | i_32 - (i_32 >>> 8);
									}

									if (bool_2 && bool_13) {
										floats_39[i_20] = f_6;
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
						if (i_9 != 2) {
							throw new IllegalArgumentException();
						}

						i_24 = i_10 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
						i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
						i_10 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_8; i_29 < 0; i_29++) {
							i_30 = (i_15 >> 16) * this.anInt8851;

							for (i_31 = -i_7; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_43 = this.aByteArray10221[(i_14 >> 16) + i_30];
									if (b_43 != 0) {
										if (bool_1) {
											i_33 = this.anIntArray10220[b_43 & 0xff];
											i_26 = (i_33 & 0xff00ff) * i_24 & ~0xff00ff;
											i_27 = (i_33 & 0xff00) * i_24 & 0xff0000;
											i_33 = ((i_26 | i_27) >>> 8) + i_10;
											i_34 = ints_23[i_20];
											i_35 = i_33 + i_34;
											i_36 = (i_33 & 0xff00ff) + (i_34 & 0xff00ff);
											i_34 = (i_36 & 0x1000100) + (i_35 - i_36 & 0x10000);
											ints_23[i_20] = i_35 - i_34 | i_34 - (i_34 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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

	public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		throw new IllegalStateException();
	}

	public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			int[] ints_6 = this.aClass505_Sub3_8875.anIntArray8979;
			if (ints_6 != null) {
				i_1 += this.anInt8853;
				i_2 += this.anInt8854;
				int i_7 = 0;
				int i_8 = this.aClass505_Sub3_8875.anInt8980;
				int i_9 = this.anInt8851;
				int i_10 = this.anInt8867;
				int i_11 = i_8 - i_9;
				int i_12 = 0;
				int i_13 = i_8 * i_2 + i_1;
				int i_14;
				if (i_2 < this.aClass505_Sub3_8875.anInt9009) {
					i_14 = this.aClass505_Sub3_8875.anInt9009 - i_2;
					i_10 -= i_14;
					i_2 = this.aClass505_Sub3_8875.anInt9009;
					i_7 += i_14 * i_9;
					i_13 += i_14 * i_8;
				}

				if (i_10 + i_2 > this.aClass505_Sub3_8875.anInt8986) {
					i_10 -= i_10 + i_2 - this.aClass505_Sub3_8875.anInt8986;
				}

				if (i_1 < this.aClass505_Sub3_8875.anInt8983) {
					i_14 = this.aClass505_Sub3_8875.anInt8983 - i_1;
					i_9 -= i_14;
					i_1 = this.aClass505_Sub3_8875.anInt8983;
					i_7 += i_14;
					i_13 += i_14;
					i_12 += i_14;
					i_11 += i_14;
				}

				if (i_9 + i_1 > this.aClass505_Sub3_8875.anInt9002) {
					i_14 = i_9 + i_1 - this.aClass505_Sub3_8875.anInt9002;
					i_9 -= i_14;
					i_12 += i_14;
					i_11 += i_14;
				}

				if (i_9 > 0 && i_10 > 0) {
					PacketsDecoder packetsdecoder_26 = (PacketsDecoder) class455_3;
					int[] ints_15 = packetsdecoder_26.anIntArray9077;
					int[] ints_16 = packetsdecoder_26.anIntArray9078;
					int i_17 = i_2;
					if (i_5 > i_2) {
						i_17 = i_5;
						i_13 += i_8 * (i_5 - i_2);
						i_7 += (i_5 - i_2) * this.anInt8851;
					}

					int i_18 = ints_15.length + i_5 < i_10 + i_2 ? ints_15.length + i_5 : i_10 + i_2;

					for (int i_19 = i_17; i_19 < i_18; i_19++) {
						int i_20 = ints_15[i_19 - i_5] + i_4;
						int i_21 = ints_16[i_19 - i_5];
						int i_22 = i_9;
						int i_23;
						if (i_1 > i_20) {
							i_23 = i_1 - i_20;
							if (i_23 >= i_21) {
								i_7 = i_7 + i_9 + i_12;
								i_13 = i_13 + i_9 + i_11;
								continue;
							}

							i_21 -= i_23;
						} else {
							i_23 = i_20 - i_1;
							if (i_23 >= i_9) {
								i_7 = i_7 + i_9 + i_12;
								i_13 = i_13 + i_9 + i_11;
								continue;
							}

							i_7 += i_23;
							i_22 = i_9 - i_23;
							i_13 += i_23;
						}

						i_23 = 0;
						if (i_22 < i_21) {
							i_21 = i_22;
						} else {
							i_23 = i_22 - i_21;
						}

						for (int i_24 = -i_21; i_24 < 0; i_24++) {
							byte b_25 = this.aByteArray10221[i_7++];
							if (b_25 != 0) {
								ints_6[i_13++] = this.anIntArray10220[b_25 & 0xff];
							} else {
								++i_13;
							}
						}

						i_7 = i_7 + i_23 + i_12;
						i_13 = i_13 + i_23 + i_11;
					}
				}
			}

		}
	}

	void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			if (i_3 > 0 && i_4 > 0) {
				int[] ints_9 = this.aClass505_Sub3_8875.anIntArray8979;
				if (ints_9 != null) {
					int i_10 = 0;
					int i_11 = 0;
					int i_12 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
					int i_13 = this.anInt8853 + this.anInt8851 + this.anInt8855;
					int i_14 = this.anInt8854 + this.anInt8867 + this.anInt8856;
					int i_15 = (i_13 << 16) / i_3;
					int i_16 = (i_14 << 16) / i_4;
					int i_17;
					if (this.anInt8853 > 0) {
						i_17 = ((this.anInt8853 << 16) + i_15 - 1) / i_15;
						i_1 += i_17;
						i_10 += i_17 * i_15 - (this.anInt8853 << 16);
					}

					if (this.anInt8854 > 0) {
						i_17 = ((this.anInt8854 << 16) + i_16 - 1) / i_16;
						i_2 += i_17;
						i_11 += i_17 * i_16 - (this.anInt8854 << 16);
					}

					if (this.anInt8851 < i_13) {
						i_3 = ((this.anInt8851 << 16) - i_10 + i_15 - 1) / i_15;
					}

					if (this.anInt8867 < i_14) {
						i_4 = ((this.anInt8867 << 16) - i_11 + i_16 - 1) / i_16;
					}

					i_17 = i_1 + i_2 * i_12;
					int i_18 = i_12 - i_3;
					if (i_2 + i_4 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
						i_4 -= i_2 + i_4 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
					}

					int i_19;
					if (i_2 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
						i_19 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_2;
						i_4 -= i_19;
						i_17 += i_19 * i_12;
						i_11 += i_16 * i_19;
					}

					if (i_1 + i_3 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
						i_19 = i_1 + i_3 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
						i_3 -= i_19;
						i_18 += i_19;
					}

					if (i_1 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
						i_19 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_1;
						i_3 -= i_19;
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
					byte b_34;
					if (i_7 == 0) {
						if (i_5 == 1) {
							i_19 = i_10;

							for (i_20 = -i_4; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * this.anInt8851;

								for (i_22 = -i_3; i_22 < 0; i_22++) {
									ints_9[i_17++] = this.anIntArray10220[this.aByteArray10221[(i_10 >> 16) + i_21] & 0xff];
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else if (i_5 == 0) {
							i_19 = (i_6 & 0xff0000) >> 16;
							i_20 = (i_6 & 0xff00) >> 8;
							i_21 = i_6 & 0xff;
							i_22 = i_10;

							for (i_23 = -i_4; i_23 < 0; i_23++) {
								i_24 = (i_11 >> 16) * this.anInt8851;

								for (i_25 = -i_3; i_25 < 0; i_25++) {
									i_26 = this.anIntArray10220[this.aByteArray10221[(i_10 >> 16) + i_24] & 0xff];
									i_27 = (i_26 & 0xff0000) * i_19 & ~0xffffff;
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

							for (i_20 = -i_4; i_20 < 0; i_20++) {
								i_21 = (i_11 >> 16) * this.anInt8851;

								for (i_22 = -i_3; i_22 < 0; i_22++) {
									b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
									i_24 = b_34 > 0 ? this.anIntArray10220[b_34] : 0;
									i_25 = i_24 + i_6;
									i_26 = (i_24 & 0xff00ff) + (i_6 & 0xff00ff);
									i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
									ints_9[i_17++] = i_25 - i_27 | i_27 - (i_27 >>> 8);
									i_10 += i_15;
								}

								i_11 += i_16;
								i_10 = i_19;
								i_17 += i_18;
							}
						} else {
							if (i_5 != 2) {
								throw new IllegalArgumentException();
							}

							i_19 = i_6 >>> 24;
							i_20 = 256 - i_19;
							i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
							i_22 = (i_6 & 0xff00) * i_20 & 0xff0000;
							i_6 = (i_21 | i_22) >>> 8;
							i_23 = i_10;

							for (i_24 = -i_4; i_24 < 0; i_24++) {
								i_25 = (i_11 >> 16) * this.anInt8851;

								for (i_26 = -i_3; i_26 < 0; i_26++) {
									i_27 = this.anIntArray10220[this.aByteArray10221[(i_10 >> 16) + i_25] & 0xff];
									i_21 = (i_27 & 0xff00ff) * i_19 & ~0xff00ff;
									i_22 = (i_27 & 0xff00) * i_19 & 0xff0000;
									ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_6;
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
						int i_33;
						byte b_37;
						if (i_7 == 1) {
							if (i_5 == 1) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = (i_11 >> 16) * this.anInt8851;

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
										if (b_34 != 0) {
											ints_9[i_17++] = this.anIntArray10220[b_34 & 0xff];
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								byte b_35;
								if (i_5 == 0) {
									i_19 = i_10;
									if ((i_6 & 0xffffff) == 16777215) {
										i_20 = i_6 >>> 24;
										i_21 = 256 - i_20;

										for (i_22 = -i_4; i_22 < 0; i_22++) {
											i_23 = (i_11 >> 16) * this.anInt8851;

											for (i_24 = -i_3; i_24 < 0; i_24++) {
												b_35 = this.aByteArray10221[(i_10 >> 16) + i_23];
												if (b_35 != 0) {
													i_26 = this.anIntArray10220[b_35 & 0xff];
													i_27 = ints_9[i_17];
													ints_9[i_17++] = ((i_26 & 0xff00ff) * i_20 + (i_27 & 0xff00ff) * i_21 & ~0xff00ff) + ((i_26 & 0xff00) * i_20 + (i_27 & 0xff00) * i_21 & 0xff0000) >> 8;
												} else {
													++i_17;
												}

												i_10 += i_15;
											}

											i_11 += i_16;
											i_10 = i_19;
											i_17 += i_18;
										}
									} else {
										i_20 = (i_6 & 0xff0000) >> 16;
										i_21 = (i_6 & 0xff00) >> 8;
										i_22 = i_6 & 0xff;
										i_23 = i_6 >>> 24;
										i_24 = 256 - i_23;

										for (i_25 = -i_4; i_25 < 0; i_25++) {
											i_26 = (i_11 >> 16) * this.anInt8851;

											for (i_27 = -i_3; i_27 < 0; i_27++) {
												byte b_36 = this.aByteArray10221[(i_10 >> 16) + i_26];
												if (b_36 != 0) {
													i_29 = this.anIntArray10220[b_36 & 0xff];
													if (i_23 != 255) {
														i_30 = (i_29 & 0xff0000) * i_20 & ~0xffffff;
														i_31 = (i_29 & 0xff00) * i_21 & 0xff0000;
														i_32 = (i_29 & 0xff) * i_22 & 0xff00;
														i_29 = (i_30 | i_31 | i_32) >>> 8;
														i_33 = ints_9[i_17];
														ints_9[i_17++] = ((i_29 & 0xff00ff) * i_23 + (i_33 & 0xff00ff) * i_24 & ~0xff00ff) + ((i_29 & 0xff00) * i_23 + (i_33 & 0xff00) * i_24 & 0xff0000) >> 8;
													} else {
														i_30 = (i_29 & 0xff0000) * i_20 & ~0xffffff;
														i_31 = (i_29 & 0xff00) * i_21 & 0xff0000;
														i_32 = (i_29 & 0xff) * i_22 & 0xff00;
														ints_9[i_17++] = (i_30 | i_31 | i_32) >>> 8;
													}
												} else {
													++i_17;
												}

												i_10 += i_15;
											}

											i_11 += i_16;
											i_10 = i_19;
											i_17 += i_18;
										}
									}
								} else if (i_5 == 3) {
									i_19 = i_10;
									i_20 = i_6 >>> 24;
									i_21 = 256 - i_20;

									for (i_22 = -i_4; i_22 < 0; i_22++) {
										i_23 = (i_11 >> 16) * this.anInt8851;

										for (i_24 = -i_3; i_24 < 0; i_24++) {
											b_35 = this.aByteArray10221[(i_10 >> 16) + i_23];
											i_26 = b_35 > 0 ? this.anIntArray10220[b_35] : 0;
											i_27 = i_26 + i_6;
											i_28 = (i_26 & 0xff00ff) + (i_6 & 0xff00ff);
											i_29 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
											i_29 = i_27 - i_29 | i_29 - (i_29 >>> 8);
											if (i_26 == 0 && i_20 != 255) {
												i_26 = i_29;
												i_29 = ints_9[i_17];
												i_29 = ((i_26 & 0xff00ff) * i_20 + (i_29 & 0xff00ff) * i_21 & ~0xff00ff) + ((i_26 & 0xff00) * i_20 + (i_29 & 0xff00) * i_21 & 0xff0000) >> 8;
											}

											ints_9[i_17++] = i_29;
											i_10 += i_15;
										}

										i_11 += i_16;
										i_10 = i_19;
										i_17 += i_18;
									}
								} else {
									if (i_5 != 2) {
										throw new IllegalArgumentException();
									}

									i_19 = i_6 >>> 24;
									i_20 = 256 - i_19;
									i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
									i_22 = (i_6 & 0xff00) * i_20 & 0xff0000;
									i_6 = (i_21 | i_22) >>> 8;
									i_23 = i_10;

									for (i_24 = -i_4; i_24 < 0; i_24++) {
										i_25 = (i_11 >> 16) * this.anInt8851;

										for (i_26 = -i_3; i_26 < 0; i_26++) {
											b_37 = this.aByteArray10221[(i_10 >> 16) + i_25];
											if (b_37 != 0) {
												i_28 = this.anIntArray10220[b_37 & 0xff];
												i_21 = (i_28 & 0xff00ff) * i_19 & ~0xff00ff;
												i_22 = (i_28 & 0xff00) * i_19 & 0xff0000;
												ints_9[i_17++] = ((i_21 | i_22) >>> 8) + i_6;
											} else {
												++i_17;
											}

											i_10 += i_15;
										}

										i_11 += i_16;
										i_10 = i_23;
										i_17 += i_18;
									}
								}
							}
						} else {
							if (i_7 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_5 == 1) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = (i_11 >> 16) * this.anInt8851;

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
										if (b_34 != 0) {
											i_24 = this.anIntArray10220[b_34 & 0xff];
											i_25 = ints_9[i_17];
											i_26 = i_24 + i_25;
											i_27 = (i_24 & 0xff00ff) + (i_25 & 0xff00ff);
											i_25 = (i_27 & 0x1000100) + (i_26 - i_27 & 0x10000);
											ints_9[i_17++] = i_26 - i_25 | i_25 - (i_25 >>> 8);
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else if (i_5 == 0) {
								i_19 = i_10;
								i_20 = (i_6 & 0xff0000) >> 16;
								i_21 = (i_6 & 0xff00) >> 8;
								i_22 = i_6 & 0xff;

								for (i_23 = -i_4; i_23 < 0; i_23++) {
									i_24 = (i_11 >> 16) * this.anInt8851;

									for (i_25 = -i_3; i_25 < 0; i_25++) {
										byte b_38 = this.aByteArray10221[(i_10 >> 16) + i_24];
										if (b_38 != 0) {
											i_27 = this.anIntArray10220[b_38 & 0xff];
											i_28 = (i_27 & 0xff0000) * i_20 & ~0xffffff;
											i_29 = (i_27 & 0xff00) * i_21 & 0xff0000;
											i_30 = (i_27 & 0xff) * i_22 & 0xff00;
											i_27 = (i_28 | i_29 | i_30) >>> 8;
											i_31 = ints_9[i_17];
											i_32 = i_27 + i_31;
											i_33 = (i_27 & 0xff00ff) + (i_31 & 0xff00ff);
											i_31 = (i_33 & 0x1000100) + (i_32 - i_33 & 0x10000);
											ints_9[i_17++] = i_32 - i_31 | i_31 - (i_31 >>> 8);
										} else {
											++i_17;
										}

										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else if (i_5 == 3) {
								i_19 = i_10;

								for (i_20 = -i_4; i_20 < 0; i_20++) {
									i_21 = (i_11 >> 16) * this.anInt8851;

									for (i_22 = -i_3; i_22 < 0; i_22++) {
										b_34 = this.aByteArray10221[(i_10 >> 16) + i_21];
										i_24 = b_34 > 0 ? this.anIntArray10220[b_34] : 0;
										i_25 = i_24 + i_6;
										i_26 = (i_24 & 0xff00ff) + (i_6 & 0xff00ff);
										i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										i_24 = i_25 - i_27 | i_27 - (i_27 >>> 8);
										i_27 = ints_9[i_17];
										i_25 = i_24 + i_27;
										i_26 = (i_24 & 0xff00ff) + (i_27 & 0xff00ff);
										i_27 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
										ints_9[i_17++] = i_25 - i_27 | i_27 - (i_27 >>> 8);
										i_10 += i_15;
									}

									i_11 += i_16;
									i_10 = i_19;
									i_17 += i_18;
								}
							} else {
								if (i_5 != 2) {
									throw new IllegalArgumentException();
								}

								i_19 = i_6 >>> 24;
								i_20 = 256 - i_19;
								i_21 = (i_6 & 0xff00ff) * i_20 & ~0xff00ff;
								i_22 = (i_6 & 0xff00) * i_20 & 0xff0000;
								i_6 = (i_21 | i_22) >>> 8;
								i_23 = i_10;

								for (i_24 = -i_4; i_24 < 0; i_24++) {
									i_25 = (i_11 >> 16) * this.anInt8851;

									for (i_26 = -i_3; i_26 < 0; i_26++) {
										b_37 = this.aByteArray10221[(i_10 >> 16) + i_25];
										if (b_37 != 0) {
											i_28 = this.anIntArray10220[b_37 & 0xff];
											i_21 = (i_28 & 0xff00ff) * i_19 & ~0xff00ff;
											i_22 = (i_28 & 0xff00) * i_19 & 0xff0000;
											i_28 = ((i_21 | i_22) >>> 8) + i_6;
											i_29 = ints_9[i_17];
											i_30 = i_28 + i_29;
											i_31 = (i_28 & 0xff00ff) + (i_29 & 0xff00ff);
											i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
											ints_9[i_17++] = i_30 - i_29 | i_29 - (i_29 >>> 8);
										} else {
											++i_17;
										}

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
	}

	void method14246(int i_1, int i_2) {
		int[] ints_3 = this.aClass505_Sub3_8875.anIntArray8979;
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
			int i_19;
			byte b_21;
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_7 >= 0 && i_6 - (this.anInt8851 << 12) < 0 && i_7 - (this.anInt8867 << 12) < 0) {
							for (; i_8 < 0; i_8++) {
								i_9 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_10 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_10] = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
									} else if (i_1 == 0) {
										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = (i_11 & 0xff0000) * anInt8880 & ~0xffffff;
										i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
										i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
									} else if (i_1 == 3) {
										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = (i_11 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_10] = ((i_12 | i_13) >>> 8) + anInt8885;
									}
								} else {
									byte b_20;
									if (i_2 == 1) {
										if (i_1 == 1) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												ints_3[i_10] = this.anIntArray10220[b_20 & 0xff];
											}
										} else if (i_1 == 0) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												if ((anInt8877 & 0xffffff) == 16777215) {
													i_13 = anInt8877 >>> 24;
													i_14 = 256 - i_13;
													i_15 = ints_3[i_10];
													ints_3[i_10] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & ~0xff00ff) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
												} else if (anInt8878 != 255) {
													i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
													i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
													i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
													i_12 = (i_13 | i_14 | i_15) >>> 8;
													i_16 = ints_3[i_10];
													ints_3[i_10] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
												} else {
													i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
													i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
													i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
													ints_3[i_10] = (i_13 | i_14 | i_15) >>> 8;
												}
											}
										} else if (i_1 == 3) {
											b_20 = this.aByteArray10221[i_9];
											i_12 = b_20 > 0 ? this.anIntArray10220[b_20] : 0;
											i_13 = anInt8877;
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
											if (i_12 == 0 && anInt8878 != 255) {
												i_12 = i_16;
												i_16 = ints_3[i_10];
												i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											}

											ints_3[i_10] = i_16;
										} else {
											if (i_1 != 2) {
												throw new IllegalArgumentException();
											}

											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
												i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
												ints_3[i_10++] = ((i_13 | i_14) >>> 8) + anInt8885;
											}
										}
									} else {
										if (i_2 != 2) {
											throw new IllegalArgumentException();
										}

										if (i_1 == 1) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = ints_3[i_10];
												i_14 = i_12 + i_13;
												i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
												i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
												ints_3[i_10] = i_14 - i_13 | i_13 - (i_13 >>> 8);
											}
										} else if (i_1 == 0) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_10];
												i_17 = i_12 + i_16;
												i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
												i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
												ints_3[i_10] = i_17 - i_16 | i_16 - (i_16 >>> 8);
											}
										} else if (i_1 == 3) {
											b_20 = this.aByteArray10221[i_9];
											i_12 = b_20 > 0 ? this.anIntArray10220[b_20] : 0;
											i_13 = anInt8877;
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
											if (i_12 == 0 && anInt8878 != 255) {
												i_12 = i_16;
												i_16 = ints_3[i_10];
												i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											}

											ints_3[i_10] = i_16;
										} else if (i_1 == 2) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
												i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
												i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
												i_15 = ints_3[i_10];
												i_16 = i_12 + i_15;
												i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
												i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
												ints_3[i_10] = i_16 - i_15 | i_15 - (i_15 >>> 8);
											}
										}
									}
								}
							}
						}

						++i_4;
					}
				} else if (anInt8868 < 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (this.anInt8851 << 12) < 0) {
							if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
								i_9 = (anInt8868 - i_9) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (this.anInt8851 << 12) < 0) {
							if (i_7 < 0) {
								i_9 = (anInt8868 - 1 - i_7) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (1 + i_7 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_7 >= 0 && i_7 - (this.anInt8867 << 12) < 0) {
							if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
								i_9 = (anInt8865 - i_9) / anInt8865;
								i_8 += i_9;
								i_6 += anInt8865 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else if (anInt8868 < 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
							i_9 = (anInt8868 - i_9) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						if (i_7 < 0) {
							i_9 = (anInt8868 - 1 - i_7) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_7 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				}
			} else if (anInt8868 == 0) {
				for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874;
					i_8 = anInt8862;
					if (i_7 >= 0 && i_7 - (this.anInt8867 << 12) < 0) {
						if (i_6 < 0) {
							i_9 = (anInt8865 - 1 - i_6) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_6 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
			} else if (anInt8868 < 0) {
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

					if ((i_9 = (1 + i_6 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
						i_8 = i_9;
					}

					if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
						i_9 = (anInt8868 - i_9) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
						i_8 = i_9;
					}

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1) {
								ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
							} else if (i_1 == 0) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_14 = anInt8877 >>> 24;
										i_15 = 256 - i_14;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
									}
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = ints_3[i_11];
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
									i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
									i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
									i_13 = (i_14 | i_15 | i_16) >>> 8;
									i_17 = ints_3[i_11];
									i_18 = i_13 + i_17;
									i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
									i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
									ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else if (i_1 == 2) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
									i_16 = ints_3[i_11];
									i_17 = i_13 + i_16;
									i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
			} else {
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

					if ((i_9 = (1 + i_6 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
						i_8 = i_9;
					}

					if (i_7 < 0) {
						i_9 = (anInt8868 - 1 - i_7) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_7 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
						i_8 = i_9;
					}

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1) {
								ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
							} else if (i_1 == 0) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_14 = anInt8877 >>> 24;
										i_15 = 256 - i_14;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
									}
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = ints_3[i_11];
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
									i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
									i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
									i_13 = (i_14 | i_15 | i_16) >>> 8;
									i_17 = ints_3[i_11];
									i_18 = i_13 + i_17;
									i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
									i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
									ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else if (i_1 == 2) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
									i_16 = ints_3[i_11];
									i_17 = i_13 + i_16;
									i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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

	}

	void method14253(int i_1, int i_2) {
		int[] ints_3 = this.aClass505_Sub3_8875.anIntArray8979;
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
			int i_19;
			byte b_21;
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_7 >= 0 && i_6 - (this.anInt8851 << 12) < 0 && i_7 - (this.anInt8867 << 12) < 0) {
							for (; i_8 < 0; i_8++) {
								i_9 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_10 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_10] = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
									} else if (i_1 == 0) {
										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = (i_11 & 0xff0000) * anInt8880 & ~0xffffff;
										i_13 = (i_11 & 0xff00) * anInt8852 & 0xff0000;
										i_14 = (i_11 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_10] = (i_12 | i_13 | i_14) >>> 8;
									} else if (i_1 == 3) {
										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = anInt8877;
										i_13 = i_11 + i_12;
										i_14 = (i_11 & 0xff00ff) + (i_12 & 0xff00ff);
										i_15 = (i_14 & 0x1000100) + (i_13 - i_14 & 0x10000);
										ints_3[i_10] = i_13 - i_15 | i_15 - (i_15 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_11 = this.anIntArray10220[this.aByteArray10221[i_9] & 0xff];
										i_12 = (i_11 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_13 = (i_11 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_10] = ((i_12 | i_13) >>> 8) + anInt8885;
									}
								} else {
									byte b_20;
									if (i_2 == 1) {
										if (i_1 == 1) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												ints_3[i_10] = this.anIntArray10220[b_20 & 0xff];
											}
										} else if (i_1 == 0) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												if ((anInt8877 & 0xffffff) == 16777215) {
													i_13 = anInt8877 >>> 24;
													i_14 = 256 - i_13;
													i_15 = ints_3[i_10];
													ints_3[i_10] = ((i_12 & 0xff00ff) * i_13 + (i_15 & 0xff00ff) * i_14 & ~0xff00ff) + ((i_12 & 0xff00) * i_13 + (i_15 & 0xff00) * i_14 & 0xff0000) >> 8;
												} else if (anInt8878 != 255) {
													i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
													i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
													i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
													i_12 = (i_13 | i_14 | i_15) >>> 8;
													i_16 = ints_3[i_10];
													ints_3[i_10] = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
												} else {
													i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
													i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
													i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
													ints_3[i_10] = (i_13 | i_14 | i_15) >>> 8;
												}
											}
										} else if (i_1 == 3) {
											b_20 = this.aByteArray10221[i_9];
											i_12 = b_20 > 0 ? this.anIntArray10220[b_20] : 0;
											i_13 = anInt8877;
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
											if (i_12 == 0 && anInt8878 != 255) {
												i_12 = i_16;
												i_16 = ints_3[i_10];
												i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											}

											ints_3[i_10] = i_16;
										} else {
											if (i_1 != 2) {
												throw new IllegalArgumentException();
											}

											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
												i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
												ints_3[i_10++] = ((i_13 | i_14) >>> 8) + anInt8885;
											}
										}
									} else {
										if (i_2 != 2) {
											throw new IllegalArgumentException();
										}

										if (i_1 == 1) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = ints_3[i_10];
												i_14 = i_12 + i_13;
												i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
												i_13 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
												ints_3[i_10] = i_14 - i_13 | i_13 - (i_13 >>> 8);
											}
										} else if (i_1 == 0) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
												i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
												i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
												i_12 = (i_13 | i_14 | i_15) >>> 8;
												i_16 = ints_3[i_10];
												i_17 = i_12 + i_16;
												i_18 = (i_12 & 0xff00ff) + (i_16 & 0xff00ff);
												i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
												ints_3[i_10] = i_17 - i_16 | i_16 - (i_16 >>> 8);
											}
										} else if (i_1 == 3) {
											b_20 = this.aByteArray10221[i_9];
											i_12 = b_20 > 0 ? this.anIntArray10220[b_20] : 0;
											i_13 = anInt8877;
											i_14 = i_12 + i_13;
											i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
											i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
											i_16 = i_14 - i_16 | i_16 - (i_16 >>> 8);
											if (i_12 == 0 && anInt8878 != 255) {
												i_12 = i_16;
												i_16 = ints_3[i_10];
												i_16 = ((i_12 & 0xff00ff) * anInt8878 + (i_16 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_12 & 0xff00) * anInt8878 + (i_16 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											}

											ints_3[i_10] = i_16;
										} else if (i_1 == 2) {
											b_20 = this.aByteArray10221[i_9];
											if (b_20 != 0) {
												i_12 = this.anIntArray10220[b_20 & 0xff];
												i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
												i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
												i_12 = ((i_13 | i_14) >>> 8) + anInt8885;
												i_15 = ints_3[i_10];
												i_16 = i_12 + i_15;
												i_17 = (i_12 & 0xff00ff) + (i_15 & 0xff00ff);
												i_15 = (i_17 & 0x1000100) + (i_16 - i_17 & 0x10000);
												ints_3[i_10] = i_16 - i_15 | i_15 - (i_15 >>> 8);
											}
										}
									}
								}
							}
						}

						++i_4;
					}
				} else if (anInt8868 < 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (this.anInt8851 << 12) < 0) {
							if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
								i_9 = (anInt8868 - i_9) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if (i_6 >= 0 && i_6 - (this.anInt8851 << 12) < 0) {
							if (i_7 < 0) {
								i_9 = (anInt8868 - 1 - i_7) / anInt8868;
								i_8 += i_9;
								i_7 += anInt8868 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (1 + i_7 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874;
						i_8 = anInt8862;
						if (i_7 >= 0 && i_7 - (this.anInt8867 << 12) < 0) {
							if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
								i_9 = (anInt8865 - i_9) / anInt8865;
								i_8 += i_9;
								i_6 += anInt8865 * i_9;
								i_5 += i_9;
							}

							if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
								i_8 = i_9;
							}

							while (i_8 < 0) {
								i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
								i_11 = i_5++;
								if (i_2 == 0) {
									if (i_1 == 1) {
										ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									} else if (i_1 == 0) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
										i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
										i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
									} else if (i_1 == 3) {
										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = anInt8877;
										i_14 = i_12 + i_13;
										i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
										i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
										ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
										i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
									}
								} else if (i_2 == 1) {
									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											if ((anInt8877 & 0xffffff) == 16777215) {
												i_14 = anInt8877 >>> 24;
												i_15 = 256 - i_14;
												i_16 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
											} else if (anInt8878 != 255) {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												i_13 = (i_14 | i_15 | i_16) >>> 8;
												i_17 = ints_3[i_11];
												ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
											} else {
												i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
												i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
												i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
												ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
											}
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else {
										if (i_1 != 2) {
											throw new IllegalArgumentException();
										}

										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
										}
									}
								} else {
									if (i_2 != 2) {
										throw new IllegalArgumentException();
									}

									if (i_1 == 1) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = ints_3[i_11];
											i_15 = i_13 + i_14;
											i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
											i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
											ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
										}
									} else if (i_1 == 0) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											i_18 = i_13 + i_17;
											i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
											i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
											ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
										}
									} else if (i_1 == 3) {
										b_21 = this.aByteArray10221[i_10];
										i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
										i_14 = anInt8877;
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
										if (i_13 == 0 && anInt8878 != 255) {
											i_13 = i_17;
											i_17 = ints_3[i_11];
											i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										}

										ints_3[i_11] = i_17;
									} else if (i_1 == 2) {
										b_21 = this.aByteArray10221[i_10];
										if (b_21 != 0) {
											i_13 = this.anIntArray10220[b_21 & 0xff];
											i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
											i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
											i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
											i_16 = ints_3[i_11];
											i_17 = i_13 + i_16;
											i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
											i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
											ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else if (anInt8868 < 0) {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
							i_9 = (anInt8868 - i_9) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				} else {
					for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_5 = anInt8870 * 299731099 * 444800403;
						i_6 = anInt8873 + anInt8858;
						i_7 = anInt8874 + anInt8866;
						i_8 = anInt8862;
						if ((i_9 = i_6 - (this.anInt8851 << 12)) >= 0) {
							i_9 = (anInt8865 - i_9) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (i_6 - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						if (i_7 < 0) {
							i_9 = (anInt8868 - 1 - i_7) / anInt8868;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_7 += anInt8868 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_7 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
				}
			} else if (anInt8868 == 0) {
				for (i_4 = anInt8864; i_4 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_5 = anInt8870 * 299731099 * 444800403;
					i_6 = anInt8873 + anInt8858;
					i_7 = anInt8874;
					i_8 = anInt8862;
					if (i_7 >= 0 && i_7 - (this.anInt8867 << 12) < 0) {
						if (i_6 < 0) {
							i_9 = (anInt8865 - 1 - i_6) / anInt8865;
							i_8 += i_9;
							i_6 += anInt8865 * i_9;
							i_5 += i_9;
						}

						if ((i_9 = (1 + i_6 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
							i_8 = i_9;
						}

						while (i_8 < 0) {
							i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
							i_11 = i_5++;
							if (i_2 == 0) {
								if (i_1 == 1) {
									ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								} else if (i_1 == 0) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
									i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
									i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
									ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
								} else if (i_1 == 3) {
									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = anInt8877;
									i_14 = i_12 + i_13;
									i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
									i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
									ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
									i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
								}
							} else if (i_2 == 1) {
								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										if ((anInt8877 & 0xffffff) == 16777215) {
											i_14 = anInt8877 >>> 24;
											i_15 = 256 - i_14;
											i_16 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
										} else if (anInt8878 != 255) {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											i_13 = (i_14 | i_15 | i_16) >>> 8;
											i_17 = ints_3[i_11];
											ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
										} else {
											i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
											i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
											i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
											ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
										}
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else {
									if (i_1 != 2) {
										throw new IllegalArgumentException();
									}

									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
									}
								}
							} else {
								if (i_2 != 2) {
									throw new IllegalArgumentException();
								}

								if (i_1 == 1) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = ints_3[i_11];
										i_15 = i_13 + i_14;
										i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
										i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
										ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
									}
								} else if (i_1 == 0) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										i_18 = i_13 + i_17;
										i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
										i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
									}
								} else if (i_1 == 3) {
									b_21 = this.aByteArray10221[i_10];
									i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
									i_14 = anInt8877;
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
									if (i_13 == 0 && anInt8878 != 255) {
										i_13 = i_17;
										i_17 = ints_3[i_11];
										i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									}

									ints_3[i_11] = i_17;
								} else if (i_1 == 2) {
									b_21 = this.aByteArray10221[i_10];
									if (b_21 != 0) {
										i_13 = this.anIntArray10220[b_21 & 0xff];
										i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
										i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
										i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
										i_16 = ints_3[i_11];
										i_17 = i_13 + i_16;
										i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
										i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
										ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
			} else if (anInt8868 < 0) {
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

					if ((i_9 = (1 + i_6 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
						i_8 = i_9;
					}

					if ((i_9 = i_7 - (this.anInt8867 << 12)) >= 0) {
						i_9 = (anInt8868 - i_9) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (i_7 - anInt8868) / anInt8868) > i_8) {
						i_8 = i_9;
					}

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1) {
								ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
							} else if (i_1 == 0) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_14 = anInt8877 >>> 24;
										i_15 = 256 - i_14;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
									}
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = ints_3[i_11];
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
									i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
									i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
									i_13 = (i_14 | i_15 | i_16) >>> 8;
									i_17 = ints_3[i_11];
									i_18 = i_13 + i_17;
									i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
									i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
									ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else if (i_1 == 2) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
									i_16 = ints_3[i_11];
									i_17 = i_13 + i_16;
									i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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
			} else {
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

					if ((i_9 = (1 + i_6 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_8) {
						i_8 = i_9;
					}

					if (i_7 < 0) {
						i_9 = (anInt8868 - 1 - i_7) / anInt8868;
						i_8 += i_9;
						i_6 += anInt8865 * i_9;
						i_7 += anInt8868 * i_9;
						i_5 += i_9;
					}

					if ((i_9 = (1 + i_7 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_8) {
						i_8 = i_9;
					}

					while (i_8 < 0) {
						i_10 = (i_7 >> 12) * this.anInt8851 + (i_6 >> 12);
						i_11 = i_5++;
						if (i_2 == 0) {
							if (i_1 == 1) {
								ints_3[i_11] = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
							} else if (i_1 == 0) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff0000) * anInt8880 & ~0xffffff;
								i_14 = (i_12 & 0xff00) * anInt8852 & 0xff0000;
								i_15 = (i_12 & 0xff) * anInt8882 & 0xff00;
								ints_3[i_11] = (i_13 | i_14 | i_15) >>> 8;
							} else if (i_1 == 3) {
								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = anInt8877;
								i_14 = i_12 + i_13;
								i_15 = (i_12 & 0xff00ff) + (i_13 & 0xff00ff);
								i_16 = (i_15 & 0x1000100) + (i_14 - i_15 & 0x10000);
								ints_3[i_11] = i_14 - i_16 | i_16 - (i_16 >>> 8);
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								i_12 = this.anIntArray10220[this.aByteArray10221[i_10] & 0xff];
								i_13 = (i_12 & 0xff00ff) * anInt8878 & ~0xff00ff;
								i_14 = (i_12 & 0xff00) * anInt8878 & 0xff0000;
								ints_3[i_11] = ((i_13 | i_14) >>> 8) + anInt8885;
							}
						} else if (i_2 == 1) {
							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									ints_3[i_11] = this.anIntArray10220[b_21 & 0xff];
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									if ((anInt8877 & 0xffffff) == 16777215) {
										i_14 = anInt8877 >>> 24;
										i_15 = 256 - i_14;
										i_16 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * i_14 + (i_16 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_13 & 0xff00) * i_14 + (i_16 & 0xff00) * i_15 & 0xff0000) >> 8;
									} else if (anInt8878 != 255) {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										i_13 = (i_14 | i_15 | i_16) >>> 8;
										i_17 = ints_3[i_11];
										ints_3[i_11] = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
									} else {
										i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
										i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
										i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
										ints_3[i_11] = (i_14 | i_15 | i_16) >>> 8;
									}
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else {
								if (i_1 != 2) {
									throw new IllegalArgumentException();
								}

								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									ints_3[i_11++] = ((i_14 | i_15) >>> 8) + anInt8885;
								}
							}
						} else {
							if (i_2 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_1 == 1) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = ints_3[i_11];
									i_15 = i_13 + i_14;
									i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
									i_14 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
									ints_3[i_11] = i_15 - i_14 | i_14 - (i_14 >>> 8);
								}
							} else if (i_1 == 0) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff0000) * anInt8880 & ~0xffffff;
									i_15 = (i_13 & 0xff00) * anInt8852 & 0xff0000;
									i_16 = (i_13 & 0xff) * anInt8882 & 0xff00;
									i_13 = (i_14 | i_15 | i_16) >>> 8;
									i_17 = ints_3[i_11];
									i_18 = i_13 + i_17;
									i_19 = (i_13 & 0xff00ff) + (i_17 & 0xff00ff);
									i_17 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
									ints_3[i_11] = i_18 - i_17 | i_17 - (i_17 >>> 8);
								}
							} else if (i_1 == 3) {
								b_21 = this.aByteArray10221[i_10];
								i_13 = b_21 > 0 ? this.anIntArray10220[b_21] : 0;
								i_14 = anInt8877;
								i_15 = i_13 + i_14;
								i_16 = (i_13 & 0xff00ff) + (i_14 & 0xff00ff);
								i_17 = (i_16 & 0x1000100) + (i_15 - i_16 & 0x10000);
								i_17 = i_15 - i_17 | i_17 - (i_17 >>> 8);
								if (i_13 == 0 && anInt8878 != 255) {
									i_13 = i_17;
									i_17 = ints_3[i_11];
									i_17 = ((i_13 & 0xff00ff) * anInt8878 + (i_17 & 0xff00ff) * anInt8879 & ~0xff00ff) + ((i_13 & 0xff00) * anInt8878 + (i_17 & 0xff00) * anInt8879 & 0xff0000) >> 8;
								}

								ints_3[i_11] = i_17;
							} else if (i_1 == 2) {
								b_21 = this.aByteArray10221[i_10];
								if (b_21 != 0) {
									i_13 = this.anIntArray10220[b_21 & 0xff];
									i_14 = (i_13 & 0xff00ff) * anInt8878 & ~0xff00ff;
									i_15 = (i_13 & 0xff00) * anInt8878 & 0xff0000;
									i_13 = ((i_14 | i_15) >>> 8) + anInt8885;
									i_16 = ints_3[i_11];
									i_17 = i_13 + i_16;
									i_18 = (i_13 & 0xff00ff) + (i_16 & 0xff00ff);
									i_16 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_3[i_11] = i_17 - i_16 | i_16 - (i_16 >>> 8);
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

	}

	void method14251(int[] ints_1, int[] ints_2, int i_3, int i_4) {
		int[] ints_5 = this.aClass505_Sub3_8875.anIntArray8979;
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
			byte b_16;
			int i_17;
			if (anInt8865 == 0) {
				if (anInt8868 == 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_10 >= 0 && i_9 - (this.anInt8851 << 12) < 0 && i_10 - (this.anInt8867 << 12) < 0) {
								i_12 = ints_1[i_7] - i_3;
								i_13 = -ints_2[i_7];
								i_14 = i_12 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_14 > 0) {
									i_8 += i_14;
									i_11 += i_14;
									i_9 += anInt8865 * i_14;
									i_10 += anInt8868 * i_14;
								} else {
									i_13 -= i_14;
								}

								if (i_11 < i_13) {
									i_11 = i_13;
								}

								for (; i_11 < 0; i_11++) {
									byte b_15 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
									if (b_15 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_15 & 0xff];
									} else {
										++i_8;
									}
								}
							}
						}

						++i_6;
					}
				} else if (anInt8868 < 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (this.anInt8851 << 12) < 0) {
								if ((i_12 = i_10 - (this.anInt8867 << 12)) >= 0) {
									i_12 = (anInt8868 - i_12) / anInt8868;
									i_11 += i_12;
									i_10 += anInt8868 * i_12;
									i_8 += i_12;
								}

								if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11) {
									i_11 = i_12;
								}

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_17 > 0) {
									i_8 += i_17;
									i_11 += i_17;
									i_9 += anInt8865 * i_17;
									i_10 += anInt8868 * i_17;
								} else {
									i_14 -= i_17;
								}

								if (i_11 < i_14) {
									i_11 = i_14;
								}

								while (i_11 < 0) {
									b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
									if (b_16 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
									} else {
										++i_8;
									}

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
				} else {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if (i_9 >= 0 && i_9 - (this.anInt8851 << 12) < 0) {
								if (i_10 < 0) {
									i_12 = (anInt8868 - 1 - i_10) / anInt8868;
									i_11 += i_12;
									i_10 += anInt8868 * i_12;
									i_8 += i_12;
								}

								if ((i_12 = (1 + i_10 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_11) {
									i_11 = i_12;
								}

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_17 > 0) {
									i_8 += i_17;
									i_11 += i_17;
									i_9 += anInt8865 * i_17;
									i_10 += anInt8868 * i_17;
								} else {
									i_14 -= i_17;
								}

								if (i_11 < i_14) {
									i_11 = i_14;
								}

								while (i_11 < 0) {
									b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
									if (b_16 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
									} else {
										++i_8;
									}

									i_10 += anInt8868;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8873 += anInt8869;
					}
				}
			} else if (anInt8865 < 0) {
				if (anInt8868 == 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874;
							i_11 = anInt8862;
							if (i_10 >= 0 && i_10 - (this.anInt8867 << 12) < 0) {
								if ((i_12 = i_9 - (this.anInt8851 << 12)) >= 0) {
									i_12 = (anInt8865 - i_12) / anInt8865;
									i_11 += i_12;
									i_9 += anInt8865 * i_12;
									i_8 += i_12;
								}

								if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11) {
									i_11 = i_12;
								}

								i_13 = ints_1[i_7] - i_3;
								i_14 = -ints_2[i_7];
								i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
								if (i_17 > 0) {
									i_8 += i_17;
									i_11 += i_17;
									i_9 += anInt8865 * i_17;
									i_10 += anInt8868 * i_17;
								} else {
									i_14 -= i_17;
								}

								if (i_11 < i_14) {
									i_11 = i_14;
								}

								while (i_11 < 0) {
									b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
									if (b_16 != 0) {
										ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
									} else {
										++i_8;
									}

									i_9 += anInt8865;
									++i_11;
								}
							}
						}

						++i_6;
						anInt8874 += anInt8876;
					}
				} else if (anInt8868 < 0) {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (this.anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11) {
								i_11 = i_12;
							}

							if ((i_12 = i_10 - (this.anInt8867 << 12)) >= 0) {
								i_12 = (anInt8868 - i_12) / anInt8868;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11) {
								i_11 = i_12;
							}

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
							if (i_17 > 0) {
								i_8 += i_17;
								i_11 += i_17;
								i_9 += anInt8865 * i_17;
								i_10 += anInt8868 * i_17;
							} else {
								i_14 -= i_17;
							}

							if (i_11 < i_14) {
								i_11 = i_14;
							}

							while (i_11 < 0) {
								b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
								if (b_16 != 0) {
									ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
								} else {
									++i_8;
								}

								i_9 += anInt8865;
								i_10 += anInt8868;
								++i_11;
							}
						}

						++i_6;
						anInt8873 += anInt8869;
						anInt8874 += anInt8876;
					}
				} else {
					for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
						i_7 = i_6 + i_4;
						if (i_7 >= 0) {
							if (i_7 >= ints_1.length) {
								break;
							}

							i_8 = anInt8870 * 299731099 * 444800403;
							i_9 = anInt8873 + anInt8858;
							i_10 = anInt8874 + anInt8866;
							i_11 = anInt8862;
							if ((i_12 = i_9 - (this.anInt8851 << 12)) >= 0) {
								i_12 = (anInt8865 - i_12) / anInt8865;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (i_9 - anInt8865) / anInt8865) > i_11) {
								i_11 = i_12;
							}

							if (i_10 < 0) {
								i_12 = (anInt8868 - 1 - i_10) / anInt8868;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_10 += anInt8868 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (1 + i_10 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_11) {
								i_11 = i_12;
							}

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
							if (i_17 > 0) {
								i_8 += i_17;
								i_11 += i_17;
								i_9 += anInt8865 * i_17;
								i_10 += anInt8868 * i_17;
							} else {
								i_14 -= i_17;
							}

							if (i_11 < i_14) {
								i_11 = i_14;
							}

							while (i_11 < 0) {
								b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
								if (b_16 != 0) {
									ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
								} else {
									++i_8;
								}

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
			} else if (anInt8868 == 0) {
				for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length) {
							break;
						}

						i_8 = anInt8870 * 299731099 * 444800403;
						i_9 = anInt8873 + anInt8858;
						i_10 = anInt8874;
						i_11 = anInt8862;
						if (i_10 >= 0 && i_10 - (this.anInt8867 << 12) < 0) {
							if (i_9 < 0) {
								i_12 = (anInt8865 - 1 - i_9) / anInt8865;
								i_11 += i_12;
								i_9 += anInt8865 * i_12;
								i_8 += i_12;
							}

							if ((i_12 = (1 + i_9 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_11) {
								i_11 = i_12;
							}

							i_13 = ints_1[i_7] - i_3;
							i_14 = -ints_2[i_7];
							i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
							if (i_17 > 0) {
								i_8 += i_17;
								i_11 += i_17;
								i_9 += anInt8865 * i_17;
								i_10 += anInt8868 * i_17;
							} else {
								i_14 -= i_17;
							}

							if (i_11 < i_14) {
								i_11 = i_14;
							}

							while (i_11 < 0) {
								b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
								if (b_16 != 0) {
									ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
								} else {
									++i_8;
								}

								i_9 += anInt8865;
								++i_11;
							}
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			} else if (anInt8868 < 0) {
				for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length) {
							break;
						}

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

						if ((i_12 = (1 + i_9 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_11) {
							i_11 = i_12;
						}

						if ((i_12 = i_10 - (this.anInt8867 << 12)) >= 0) {
							i_12 = (anInt8868 - i_12) / anInt8868;
							i_11 += i_12;
							i_9 += anInt8865 * i_12;
							i_10 += anInt8868 * i_12;
							i_8 += i_12;
						}

						if ((i_12 = (i_10 - anInt8868) / anInt8868) > i_11) {
							i_11 = i_12;
						}

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
						if (i_17 > 0) {
							i_8 += i_17;
							i_11 += i_17;
							i_9 += anInt8865 * i_17;
							i_10 += anInt8868 * i_17;
						} else {
							i_14 -= i_17;
						}

						if (i_11 < i_14) {
							i_11 = i_14;
						}

						while (i_11 < 0) {
							b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
							if (b_16 != 0) {
								ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
							} else {
								++i_8;
							}

							i_9 += anInt8865;
							i_10 += anInt8868;
							++i_11;
						}
					}

					++i_6;
					anInt8873 += anInt8869;
					anInt8874 += anInt8876;
				}
			} else {
				for (i_6 = anInt8864; i_6 < 0; anInt8870 = (anInt8870 * 299731099 * 444800403 + anInt8850 * 299731099 * 444800403 * 299731099 * 444800403) * 299731099 * 444800403) {
					i_7 = i_6 + i_4;
					if (i_7 >= 0) {
						if (i_7 >= ints_1.length) {
							break;
						}

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

						if ((i_12 = (1 + i_9 - (this.anInt8851 << 12) - anInt8865) / anInt8865) > i_11) {
							i_11 = i_12;
						}

						if (i_10 < 0) {
							i_12 = (anInt8868 - 1 - i_10) / anInt8868;
							i_11 += i_12;
							i_9 += anInt8865 * i_12;
							i_10 += anInt8868 * i_12;
							i_8 += i_12;
						}

						if ((i_12 = (1 + i_10 - (this.anInt8867 << 12) - anInt8868) / anInt8868) > i_11) {
							i_11 = i_12;
						}

						i_13 = ints_1[i_7] - i_3;
						i_14 = -ints_2[i_7];
						i_17 = i_13 - (i_8 - anInt8870 * 299731099 * 444800403);
						if (i_17 > 0) {
							i_8 += i_17;
							i_11 += i_17;
							i_9 += anInt8865 * i_17;
							i_10 += anInt8868 * i_17;
						} else {
							i_14 -= i_17;
						}

						if (i_11 < i_14) {
							i_11 = i_14;
						}

						while (i_11 < 0) {
							b_16 = this.aByteArray10221[(i_10 >> 12) * this.anInt8851 + (i_9 >> 12)];
							if (b_16 != 0) {
								ints_5[i_8++] = this.anIntArray10220[b_16 & 0xff];
							} else {
								++i_8;
							}

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

	}

	public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			int[] ints_6 = this.aClass505_Sub3_8875.anIntArray8979;
			if (ints_6 != null) {
				int i_7 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
				i_1 += this.anInt8853;
				i_2 += this.anInt8854;
				int i_8 = i_2 * i_7 + i_1;
				int i_9 = 0;
				int i_10 = this.anInt8867;
				int i_11 = this.anInt8851;
				int i_12 = i_7 - i_11;
				int i_13 = 0;
				int i_14;
				if (i_2 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
					i_14 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_2;
					i_10 -= i_14;
					i_2 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457;
					i_9 += i_14 * i_11;
					i_8 += i_14 * i_7;
				}

				if (i_2 + i_10 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
					i_10 -= i_2 + i_10 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
				}

				if (i_1 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
					i_14 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_1;
					i_11 -= i_14;
					i_1 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989;
					i_9 += i_14;
					i_8 += i_14;
					i_13 += i_14;
					i_12 += i_14;
				}

				if (i_1 + i_11 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
					i_14 = i_1 + i_11 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
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
						if (i_3 == 1) {
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = i_8 + i_11 - 3; i_8 < i_15; ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff]) {
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
								}

								for (i_15 += 3; i_8 < i_15; ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff]) {
									;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 0) {
							i_14 = (i_4 & 0xff0000) >> 16;
							i_15 = (i_4 & 0xff00) >> 8;
							i_16 = i_4 & 0xff;

							for (i_17 = -i_10; i_17 < 0; i_17++) {
								for (i_18 = -i_11; i_18 < 0; i_18++) {
									i_19 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_20 = (i_19 & 0xff0000) * i_14 & ~0xffffff;
									i_21 = (i_19 & 0xff00) * i_15 & 0xff0000;
									i_22 = (i_19 & 0xff) * i_16 & 0xff00;
									ints_6[i_8++] = (i_20 | i_21 | i_22) >>> 8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 3) {
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_17 = i_16 + i_4;
									i_18 = (i_16 & 0xff00ff) + (i_4 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else {
							if (i_3 != 2) {
								throw new IllegalArgumentException();
							}

							i_14 = i_4 >>> 24;
							i_15 = 256 - i_14;
							i_16 = (i_4 & 0xff00ff) * i_15 & ~0xff00ff;
							i_17 = (i_4 & 0xff00) * i_15 & 0xff0000;
							i_4 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_16 = (i_20 & 0xff00ff) * i_14 & ~0xff00ff;
									i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
									ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_4;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					} else {
						int i_23;
						int i_24;
						int i_25;
						int i_26;
						byte b_27;
						byte b_32;
						if (i_5 == 1) {
							if (i_3 == 1) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										if (b_27 != 0) {
											i_17 = this.anIntArray10220[b_27 & 0xff] | ~0xffffff;
											short s_28 = 255;
											byte b_30 = 0;
											i_20 = ints_6[i_8];
											ints_6[i_8++] = (((i_17 & 0xff00ff) * s_28 + (i_20 & 0xff00ff) * b_30 & ~0xff00ff) >> 8) + (((i_17 & ~0xff00ff) >>> 8) * s_28 + ((i_20 & ~0xff00ff) >>> 8) * b_30 & ~0xff00ff);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								byte b_29;
								if (i_3 == 0) {
									if ((i_4 & 0xffffff) == 16777215) {
										i_14 = i_4 >>> 24;
										i_15 = 256 - i_14;

										for (i_16 = -i_10; i_16 < 0; i_16++) {
											for (i_17 = -i_11; i_17 < 0; i_17++) {
												b_29 = this.aByteArray10221[i_9++];
												if (b_29 != 0) {
													i_19 = this.anIntArray10220[b_29 & 0xff];
													i_20 = ints_6[i_8];
													ints_6[i_8++] = ((i_19 & 0xff00ff) * i_14 + (i_20 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_19 & 0xff00) * i_14 + (i_20 & 0xff00) * i_15 & 0xff0000) >> 8;
												} else {
													++i_8;
												}
											}

											i_8 += i_12;
											i_9 += i_13;
										}
									} else {
										i_14 = (i_4 & 0xff0000) >> 16;
										i_15 = (i_4 & 0xff00) >> 8;
										i_16 = i_4 & 0xff;
										i_17 = i_4 >>> 24;
										i_18 = 256 - i_17;

										for (i_19 = -i_10; i_19 < 0; i_19++) {
											for (i_20 = -i_11; i_20 < 0; i_20++) {
												byte b_31 = this.aByteArray10221[i_9++];
												if (b_31 != 0) {
													i_22 = this.anIntArray10220[b_31 & 0xff];
													if (i_17 != 255) {
														i_23 = (i_22 & 0xff0000) * i_14 & ~0xffffff;
														i_24 = (i_22 & 0xff00) * i_15 & 0xff0000;
														i_25 = (i_22 & 0xff) * i_16 & 0xff00;
														i_22 = (i_23 | i_24 | i_25) >>> 8;
														i_26 = ints_6[i_8];
														ints_6[i_8++] = ((i_22 & 0xff00ff) * i_17 + (i_26 & 0xff00ff) * i_18 & ~0xff00ff) + ((i_22 & 0xff00) * i_17 + (i_26 & 0xff00) * i_18 & 0xff0000) >> 8;
													} else {
														i_23 = (i_22 & 0xff0000) * i_14 & ~0xffffff;
														i_24 = (i_22 & 0xff00) * i_15 & 0xff0000;
														i_25 = (i_22 & 0xff) * i_16 & 0xff00;
														ints_6[i_8++] = (i_23 | i_24 | i_25) >>> 8;
													}
												} else {
													++i_8;
												}
											}

											i_8 += i_12;
											i_9 += i_13;
										}
									}
								} else if (i_3 == 3) {
									i_14 = i_4 >>> 24;
									i_15 = 256 - i_14;

									for (i_16 = -i_10; i_16 < 0; i_16++) {
										for (i_17 = -i_11; i_17 < 0; i_17++) {
											b_29 = this.aByteArray10221[i_9++];
											i_19 = b_29 > 0 ? this.anIntArray10220[b_29] : 0;
											i_20 = i_19 + i_4;
											i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
											i_22 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
											i_22 = i_20 - i_22 | i_22 - (i_22 >>> 8);
											if (i_19 == 0 && i_14 != 255) {
												i_19 = i_22;
												i_22 = ints_6[i_8];
												i_22 = ((i_19 & 0xff00ff) * i_14 + (i_22 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_19 & 0xff00) * i_14 + (i_22 & 0xff00) * i_15 & 0xff0000) >> 8;
											}

											ints_6[i_8++] = i_22;
										}

										i_8 += i_12;
										i_9 += i_13;
									}
								} else {
									if (i_3 != 2) {
										throw new IllegalArgumentException();
									}

									i_14 = i_4 >>> 24;
									i_15 = 256 - i_14;
									i_16 = (i_4 & 0xff00ff) * i_15 & ~0xff00ff;
									i_17 = (i_4 & 0xff00) * i_15 & 0xff0000;
									i_4 = (i_16 | i_17) >>> 8;

									for (i_18 = -i_10; i_18 < 0; i_18++) {
										for (i_19 = -i_11; i_19 < 0; i_19++) {
											b_32 = this.aByteArray10221[i_9++];
											if (b_32 != 0) {
												i_21 = this.anIntArray10220[b_32 & 0xff];
												i_16 = (i_21 & 0xff00ff) * i_14 & ~0xff00ff;
												i_17 = (i_21 & 0xff00) * i_14 & 0xff0000;
												ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_4;
											} else {
												++i_8;
											}
										}

										i_8 += i_12;
										i_9 += i_13;
									}
								}
							}
						} else {
							if (i_5 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_3 == 1) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										if (b_27 != 0) {
											i_17 = this.anIntArray10220[b_27 & 0xff];
											i_18 = ints_6[i_8];
											i_19 = i_17 + i_18;
											i_20 = (i_17 & 0xff00ff) + (i_18 & 0xff00ff);
											i_18 = (i_20 & 0x1000100) + (i_19 - i_20 & 0x10000);
											ints_6[i_8++] = i_19 - i_18 | i_18 - (i_18 >>> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else if (i_3 == 0) {
								i_14 = (i_4 & 0xff0000) >> 16;
								i_15 = (i_4 & 0xff00) >> 8;
								i_16 = i_4 & 0xff;

								for (i_17 = -i_10; i_17 < 0; i_17++) {
									for (i_18 = -i_11; i_18 < 0; i_18++) {
										byte b_33 = this.aByteArray10221[i_9++];
										if (b_33 != 0) {
											i_20 = this.anIntArray10220[b_33 & 0xff];
											i_21 = (i_20 & 0xff0000) * i_14 & ~0xffffff;
											i_22 = (i_20 & 0xff00) * i_15 & 0xff0000;
											i_23 = (i_20 & 0xff) * i_16 & 0xff00;
											i_20 = (i_21 | i_22 | i_23) >>> 8;
											i_24 = ints_6[i_8];
											i_25 = i_20 + i_24;
											i_26 = (i_20 & 0xff00ff) + (i_24 & 0xff00ff);
											i_24 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
											ints_6[i_8++] = i_25 - i_24 | i_24 - (i_24 >>> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else if (i_3 == 3) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										i_17 = b_27 > 0 ? this.anIntArray10220[b_27] : 0;
										i_18 = i_17 + i_4;
										i_19 = (i_17 & 0xff00ff) + (i_4 & 0xff00ff);
										i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										i_17 = i_18 - i_20 | i_20 - (i_20 >>> 8);
										i_20 = ints_6[i_8];
										i_18 = i_17 + i_20;
										i_19 = (i_17 & 0xff00ff) + (i_20 & 0xff00ff);
										i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_6[i_8++] = i_18 - i_20 | i_20 - (i_20 >>> 8);
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								if (i_3 != 2) {
									throw new IllegalArgumentException();
								}

								i_14 = i_4 >>> 24;
								i_15 = 256 - i_14;
								i_16 = (i_4 & 0xff00ff) * i_15 & ~0xff00ff;
								i_17 = (i_4 & 0xff00) * i_15 & 0xff0000;
								i_4 = (i_16 | i_17) >>> 8;

								for (i_18 = -i_10; i_18 < 0; i_18++) {
									for (i_19 = -i_11; i_19 < 0; i_19++) {
										b_32 = this.aByteArray10221[i_9++];
										if (b_32 != 0) {
											i_21 = this.anIntArray10220[b_32 & 0xff];
											i_16 = (i_21 & 0xff00ff) * i_14 & ~0xff00ff;
											i_17 = (i_21 & 0xff00) * i_14 & 0xff0000;
											i_21 = ((i_16 | i_17) >>> 8) + i_4;
											i_22 = ints_6[i_8];
											i_23 = i_21 + i_22;
											i_24 = (i_21 & 0xff00ff) + (i_22 & 0xff00ff);
											i_22 = (i_24 & 0x1000100) + (i_23 - i_24 & 0x10000);
											ints_6[i_8++] = i_23 - i_22 | i_22 - (i_22 >>> 8);
										} else {
											++i_8;
										}
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
	}

	public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			int[] ints_6 = this.aClass505_Sub3_8875.anIntArray8979;
			if (ints_6 != null) {
				int i_7 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
				i_1 += this.anInt8853;
				i_2 += this.anInt8854;
				int i_8 = i_2 * i_7 + i_1;
				int i_9 = 0;
				int i_10 = this.anInt8867;
				int i_11 = this.anInt8851;
				int i_12 = i_7 - i_11;
				int i_13 = 0;
				int i_14;
				if (i_2 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
					i_14 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_2;
					i_10 -= i_14;
					i_2 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457;
					i_9 += i_14 * i_11;
					i_8 += i_14 * i_7;
				}

				if (i_2 + i_10 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
					i_10 -= i_2 + i_10 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
				}

				if (i_1 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
					i_14 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_1;
					i_11 -= i_14;
					i_1 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989;
					i_9 += i_14;
					i_8 += i_14;
					i_13 += i_14;
					i_12 += i_14;
				}

				if (i_1 + i_11 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
					i_14 = i_1 + i_11 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
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
						if (i_3 == 1) {
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = i_8 + i_11 - 3; i_8 < i_15; ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff]) {
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
								}

								for (i_15 += 3; i_8 < i_15; ints_6[i_8++] = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff]) {
									;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 0) {
							i_14 = (i_4 & 0xff0000) >> 16;
							i_15 = (i_4 & 0xff00) >> 8;
							i_16 = i_4 & 0xff;

							for (i_17 = -i_10; i_17 < 0; i_17++) {
								for (i_18 = -i_11; i_18 < 0; i_18++) {
									i_19 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_20 = (i_19 & 0xff0000) * i_14 & ~0xffffff;
									i_21 = (i_19 & 0xff00) * i_15 & 0xff0000;
									i_22 = (i_19 & 0xff) * i_16 & 0xff00;
									ints_6[i_8++] = (i_20 | i_21 | i_22) >>> 8;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else if (i_3 == 3) {
							for (i_14 = -i_10; i_14 < 0; i_14++) {
								for (i_15 = -i_11; i_15 < 0; i_15++) {
									i_16 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_17 = i_16 + i_4;
									i_18 = (i_16 & 0xff00ff) + (i_4 & 0xff00ff);
									i_19 = (i_18 & 0x1000100) + (i_17 - i_18 & 0x10000);
									ints_6[i_8++] = i_17 - i_19 | i_19 - (i_19 >>> 8);
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						} else {
							if (i_3 != 2) {
								throw new IllegalArgumentException();
							}

							i_14 = i_4 >>> 24;
							i_15 = 256 - i_14;
							i_16 = (i_4 & 0xff00ff) * i_15 & ~0xff00ff;
							i_17 = (i_4 & 0xff00) * i_15 & 0xff0000;
							i_4 = (i_16 | i_17) >>> 8;

							for (i_18 = -i_10; i_18 < 0; i_18++) {
								for (i_19 = -i_11; i_19 < 0; i_19++) {
									i_20 = this.anIntArray10220[this.aByteArray10221[i_9++] & 0xff];
									i_16 = (i_20 & 0xff00ff) * i_14 & ~0xff00ff;
									i_17 = (i_20 & 0xff00) * i_14 & 0xff0000;
									ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_4;
								}

								i_8 += i_12;
								i_9 += i_13;
							}
						}
					} else {
						int i_23;
						int i_24;
						int i_25;
						int i_26;
						byte b_27;
						byte b_32;
						if (i_5 == 1) {
							if (i_3 == 1) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										if (b_27 != 0) {
											i_17 = this.anIntArray10220[b_27 & 0xff] | ~0xffffff;
											short s_28 = 255;
											byte b_30 = 0;
											i_20 = ints_6[i_8];
											ints_6[i_8++] = (((i_17 & 0xff00ff) * s_28 + (i_20 & 0xff00ff) * b_30 & ~0xff00ff) >> 8) + (((i_17 & ~0xff00ff) >>> 8) * s_28 + ((i_20 & ~0xff00ff) >>> 8) * b_30 & ~0xff00ff);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								byte b_29;
								if (i_3 == 0) {
									if ((i_4 & 0xffffff) == 16777215) {
										i_14 = i_4 >>> 24;
										i_15 = 256 - i_14;

										for (i_16 = -i_10; i_16 < 0; i_16++) {
											for (i_17 = -i_11; i_17 < 0; i_17++) {
												b_29 = this.aByteArray10221[i_9++];
												if (b_29 != 0) {
													i_19 = this.anIntArray10220[b_29 & 0xff];
													i_20 = ints_6[i_8];
													ints_6[i_8++] = ((i_19 & 0xff00ff) * i_14 + (i_20 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_19 & 0xff00) * i_14 + (i_20 & 0xff00) * i_15 & 0xff0000) >> 8;
												} else {
													++i_8;
												}
											}

											i_8 += i_12;
											i_9 += i_13;
										}
									} else {
										i_14 = (i_4 & 0xff0000) >> 16;
										i_15 = (i_4 & 0xff00) >> 8;
										i_16 = i_4 & 0xff;
										i_17 = i_4 >>> 24;
										i_18 = 256 - i_17;

										for (i_19 = -i_10; i_19 < 0; i_19++) {
											for (i_20 = -i_11; i_20 < 0; i_20++) {
												byte b_31 = this.aByteArray10221[i_9++];
												if (b_31 != 0) {
													i_22 = this.anIntArray10220[b_31 & 0xff];
													if (i_17 != 255) {
														i_23 = (i_22 & 0xff0000) * i_14 & ~0xffffff;
														i_24 = (i_22 & 0xff00) * i_15 & 0xff0000;
														i_25 = (i_22 & 0xff) * i_16 & 0xff00;
														i_22 = (i_23 | i_24 | i_25) >>> 8;
														i_26 = ints_6[i_8];
														ints_6[i_8++] = ((i_22 & 0xff00ff) * i_17 + (i_26 & 0xff00ff) * i_18 & ~0xff00ff) + ((i_22 & 0xff00) * i_17 + (i_26 & 0xff00) * i_18 & 0xff0000) >> 8;
													} else {
														i_23 = (i_22 & 0xff0000) * i_14 & ~0xffffff;
														i_24 = (i_22 & 0xff00) * i_15 & 0xff0000;
														i_25 = (i_22 & 0xff) * i_16 & 0xff00;
														ints_6[i_8++] = (i_23 | i_24 | i_25) >>> 8;
													}
												} else {
													++i_8;
												}
											}

											i_8 += i_12;
											i_9 += i_13;
										}
									}
								} else if (i_3 == 3) {
									i_14 = i_4 >>> 24;
									i_15 = 256 - i_14;

									for (i_16 = -i_10; i_16 < 0; i_16++) {
										for (i_17 = -i_11; i_17 < 0; i_17++) {
											b_29 = this.aByteArray10221[i_9++];
											i_19 = b_29 > 0 ? this.anIntArray10220[b_29] : 0;
											i_20 = i_19 + i_4;
											i_21 = (i_19 & 0xff00ff) + (i_4 & 0xff00ff);
											i_22 = (i_21 & 0x1000100) + (i_20 - i_21 & 0x10000);
											i_22 = i_20 - i_22 | i_22 - (i_22 >>> 8);
											if (i_19 == 0 && i_14 != 255) {
												i_19 = i_22;
												i_22 = ints_6[i_8];
												i_22 = ((i_19 & 0xff00ff) * i_14 + (i_22 & 0xff00ff) * i_15 & ~0xff00ff) + ((i_19 & 0xff00) * i_14 + (i_22 & 0xff00) * i_15 & 0xff0000) >> 8;
											}

											ints_6[i_8++] = i_22;
										}

										i_8 += i_12;
										i_9 += i_13;
									}
								} else {
									if (i_3 != 2) {
										throw new IllegalArgumentException();
									}

									i_14 = i_4 >>> 24;
									i_15 = 256 - i_14;
									i_16 = (i_4 & 0xff00ff) * i_15 & ~0xff00ff;
									i_17 = (i_4 & 0xff00) * i_15 & 0xff0000;
									i_4 = (i_16 | i_17) >>> 8;

									for (i_18 = -i_10; i_18 < 0; i_18++) {
										for (i_19 = -i_11; i_19 < 0; i_19++) {
											b_32 = this.aByteArray10221[i_9++];
											if (b_32 != 0) {
												i_21 = this.anIntArray10220[b_32 & 0xff];
												i_16 = (i_21 & 0xff00ff) * i_14 & ~0xff00ff;
												i_17 = (i_21 & 0xff00) * i_14 & 0xff0000;
												ints_6[i_8++] = ((i_16 | i_17) >>> 8) + i_4;
											} else {
												++i_8;
											}
										}

										i_8 += i_12;
										i_9 += i_13;
									}
								}
							}
						} else {
							if (i_5 != 2) {
								throw new IllegalArgumentException();
							}

							if (i_3 == 1) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										if (b_27 != 0) {
											i_17 = this.anIntArray10220[b_27 & 0xff];
											i_18 = ints_6[i_8];
											i_19 = i_17 + i_18;
											i_20 = (i_17 & 0xff00ff) + (i_18 & 0xff00ff);
											i_18 = (i_20 & 0x1000100) + (i_19 - i_20 & 0x10000);
											ints_6[i_8++] = i_19 - i_18 | i_18 - (i_18 >>> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else if (i_3 == 0) {
								i_14 = (i_4 & 0xff0000) >> 16;
								i_15 = (i_4 & 0xff00) >> 8;
								i_16 = i_4 & 0xff;

								for (i_17 = -i_10; i_17 < 0; i_17++) {
									for (i_18 = -i_11; i_18 < 0; i_18++) {
										byte b_33 = this.aByteArray10221[i_9++];
										if (b_33 != 0) {
											i_20 = this.anIntArray10220[b_33 & 0xff];
											i_21 = (i_20 & 0xff0000) * i_14 & ~0xffffff;
											i_22 = (i_20 & 0xff00) * i_15 & 0xff0000;
											i_23 = (i_20 & 0xff) * i_16 & 0xff00;
											i_20 = (i_21 | i_22 | i_23) >>> 8;
											i_24 = ints_6[i_8];
											i_25 = i_20 + i_24;
											i_26 = (i_20 & 0xff00ff) + (i_24 & 0xff00ff);
											i_24 = (i_26 & 0x1000100) + (i_25 - i_26 & 0x10000);
											ints_6[i_8++] = i_25 - i_24 | i_24 - (i_24 >>> 8);
										} else {
											++i_8;
										}
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else if (i_3 == 3) {
								for (i_14 = -i_10; i_14 < 0; i_14++) {
									for (i_15 = -i_11; i_15 < 0; i_15++) {
										b_27 = this.aByteArray10221[i_9++];
										i_17 = b_27 > 0 ? this.anIntArray10220[b_27] : 0;
										i_18 = i_17 + i_4;
										i_19 = (i_17 & 0xff00ff) + (i_4 & 0xff00ff);
										i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										i_17 = i_18 - i_20 | i_20 - (i_20 >>> 8);
										i_20 = ints_6[i_8];
										i_18 = i_17 + i_20;
										i_19 = (i_17 & 0xff00ff) + (i_20 & 0xff00ff);
										i_20 = (i_19 & 0x1000100) + (i_18 - i_19 & 0x10000);
										ints_6[i_8++] = i_18 - i_20 | i_20 - (i_20 >>> 8);
									}

									i_8 += i_12;
									i_9 += i_13;
								}
							} else {
								if (i_3 != 2) {
									throw new IllegalArgumentException();
								}

								i_14 = i_4 >>> 24;
								i_15 = 256 - i_14;
								i_16 = (i_4 & 0xff00ff) * i_15 & ~0xff00ff;
								i_17 = (i_4 & 0xff00) * i_15 & 0xff0000;
								i_4 = (i_16 | i_17) >>> 8;

								for (i_18 = -i_10; i_18 < 0; i_18++) {
									for (i_19 = -i_11; i_19 < 0; i_19++) {
										b_32 = this.aByteArray10221[i_9++];
										if (b_32 != 0) {
											i_21 = this.anIntArray10220[b_32 & 0xff];
											i_16 = (i_21 & 0xff00ff) * i_14 & ~0xff00ff;
											i_17 = (i_21 & 0xff00) * i_14 & 0xff0000;
											i_21 = ((i_16 | i_17) >>> 8) + i_4;
											i_22 = ints_6[i_8];
											i_23 = i_21 + i_22;
											i_24 = (i_21 & 0xff00ff) + (i_22 & 0xff00ff);
											i_22 = (i_24 & 0x1000100) + (i_23 - i_24 & 0x10000);
											ints_6[i_8++] = i_23 - i_22 | i_22 - (i_22 >>> 8);
										} else {
											++i_8;
										}
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
	}

	void method14252(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, int i_5, float f_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_13) {
		if (i_7 > 0 && i_8 > 0 && (bool_1 || bool_2)) {
			int i_14 = 0;
			int i_15 = 0;
			int i_16 = this.anInt8853 + this.anInt8851 + this.anInt8855;
			int i_17 = this.anInt8854 + this.anInt8867 + this.anInt8856;
			int i_18 = (i_16 << 16) / i_7;
			int i_19 = (i_17 << 16) / i_8;
			int i_20;
			if (this.anInt8853 > 0) {
				i_20 = ((this.anInt8853 << 16) + i_18 - 1) / i_18;
				i_4 += i_20;
				i_14 += i_20 * i_18 - (this.anInt8853 << 16);
			}

			if (this.anInt8854 > 0) {
				i_20 = ((this.anInt8854 << 16) + i_19 - 1) / i_19;
				i_5 += i_20;
				i_15 += i_20 * i_19 - (this.anInt8854 << 16);
			}

			if (this.anInt8851 < i_16) {
				i_7 = ((this.anInt8851 << 16) - i_14 + i_18 - 1) / i_18;
			}

			if (this.anInt8867 < i_17) {
				i_8 = ((this.anInt8867 << 16) - i_15 + i_19 - 1) / i_19;
			}

			i_20 = i_4 + i_5 * this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
			int i_21 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403 - i_7;
			if (i_5 + i_8 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
				i_8 -= i_5 + i_8 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
			}

			int i_22;
			if (i_5 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
				i_22 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_5;
				i_8 -= i_22;
				i_20 += i_22 * this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
				i_15 += i_19 * i_22;
			}

			if (i_4 + i_7 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
				i_22 = i_4 + i_7 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
				i_7 -= i_22;
				i_21 += i_22;
			}

			if (i_4 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
				i_22 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_4;
				i_7 -= i_22;
				i_20 += i_22;
				i_14 += i_18 * i_22;
				i_21 += i_22;
			}

			float[] floats_39 = this.aClass505_Sub3_8875.aFloatArray9010;
			int[] ints_23 = this.aClass505_Sub3_8875.anIntArray8979;
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
			byte b_40;
			if (i_11 == 0) {
				if (i_9 == 1) {
					i_24 = i_14;

					for (i_25 = -i_8; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * this.anInt8851;

						for (i_27 = -i_7; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									ints_23[i_20] = this.anIntArray10220[this.aByteArray10221[(i_14 >> 16) + i_26] & 0xff];
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
					i_24 = (i_10 & 0xff0000) >> 16;
					i_25 = (i_10 & 0xff00) >> 8;
					i_26 = i_10 & 0xff;
					i_27 = i_14;

					for (i_28 = -i_8; i_28 < 0; i_28++) {
						i_29 = (i_15 >> 16) * this.anInt8851;

						for (i_30 = -i_7; i_30 < 0; i_30++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									i_31 = this.anIntArray10220[this.aByteArray10221[(i_14 >> 16) + i_29] & 0xff];
									i_32 = (i_31 & 0xff0000) * i_24 & ~0xffffff;
									i_33 = (i_31 & 0xff00) * i_25 & 0xff0000;
									i_34 = (i_31 & 0xff) * i_26 & 0xff00;
									ints_23[i_20] = (i_32 | i_33 | i_34) >>> 8;
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
								}
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

					for (i_25 = -i_8; i_25 < 0; i_25++) {
						i_26 = (i_15 >> 16) * this.anInt8851;

						for (i_27 = -i_7; i_27 < 0; i_27++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
									i_29 = b_40 > 0 ? this.anIntArray10220[b_40] : 0;
									i_30 = i_29 + i_10;
									i_31 = (i_29 & 0xff00ff) + (i_10 & 0xff00ff);
									i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
									ints_23[i_20] = i_30 - i_32 | i_32 - (i_32 >>> 8);
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
					if (i_9 != 2) {
						throw new IllegalArgumentException();
					}

					i_24 = i_10 >>> 24;
					i_25 = 256 - i_24;
					i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
					i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
					i_10 = (i_26 | i_27) >>> 8;
					i_28 = i_14;

					for (i_29 = -i_8; i_29 < 0; i_29++) {
						i_30 = (i_15 >> 16) * this.anInt8851;

						for (i_31 = -i_7; i_31 < 0; i_31++) {
							if (!bool_2 || f_6 < floats_39[i_20]) {
								if (bool_1) {
									i_32 = this.anIntArray10220[this.aByteArray10221[(i_14 >> 16) + i_30] & 0xff];
									i_26 = (i_32 & 0xff00ff) * i_24 & ~0xff00ff;
									i_27 = (i_32 & 0xff00) * i_24 & 0xff0000;
									ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_10;
								}

								if (bool_2 && bool_13) {
									floats_39[i_20] = f_6;
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
				int i_35;
				int i_36;
				int i_37;
				int i_38;
				byte b_43;
				if (i_11 == 1) {
					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * this.anInt8851;

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
									if (b_40 != 0) {
										if (bool_1) {
											ints_23[i_20] = this.anIntArray10220[b_40 & 0xff];
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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
						byte b_41;
						if (i_9 == 0) {
							i_24 = i_14;
							if ((i_10 & 0xffffff) == 16777215) {
								i_25 = i_10 >>> 24;
								i_26 = 256 - i_25;

								for (i_27 = -i_8; i_27 < 0; i_27++) {
									i_28 = (i_15 >> 16) * this.anInt8851;

									for (i_29 = -i_7; i_29 < 0; i_29++) {
										if (!bool_2 || f_6 < floats_39[i_20]) {
											b_41 = this.aByteArray10221[(i_14 >> 16) + i_28];
											if (b_41 != 0) {
												if (bool_1) {
													i_31 = this.anIntArray10220[b_41 & 0xff];
													i_32 = ints_23[i_20];
													ints_23[i_20] = ((i_31 & 0xff00ff) * i_25 + (i_32 & 0xff00ff) * i_26 & ~0xff00ff) + ((i_31 & 0xff00) * i_25 + (i_32 & 0xff00) * i_26 & 0xff0000) >> 8;
												}

												if (bool_2 && bool_13) {
													floats_39[i_20] = f_6;
												}
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
								i_25 = (i_10 & 0xff0000) >> 16;
								i_26 = (i_10 & 0xff00) >> 8;
								i_27 = i_10 & 0xff;
								i_28 = i_10 >>> 24;
								i_29 = 256 - i_28;

								for (i_30 = -i_8; i_30 < 0; i_30++) {
									i_31 = (i_15 >> 16) * this.anInt8851;

									for (i_32 = -i_7; i_32 < 0; i_32++) {
										if (!bool_2 || f_6 < floats_39[i_20]) {
											byte b_42 = this.aByteArray10221[(i_14 >> 16) + i_31];
											if (b_42 != 0) {
												i_34 = this.anIntArray10220[b_42 & 0xff];
												if (i_28 != 255) {
													if (bool_1) {
														i_35 = (i_34 & 0xff0000) * i_25 & ~0xffffff;
														i_36 = (i_34 & 0xff00) * i_26 & 0xff0000;
														i_37 = (i_34 & 0xff) * i_27 & 0xff00;
														i_34 = (i_35 | i_36 | i_37) >>> 8;
														i_38 = ints_23[i_20];
														ints_23[i_20] = ((i_34 & 0xff00ff) * i_28 + (i_38 & 0xff00ff) * i_29 & ~0xff00ff) + ((i_34 & 0xff00) * i_28 + (i_38 & 0xff00) * i_29 & 0xff0000) >> 8;
													}

													if (bool_2 && bool_13) {
														floats_39[i_20] = f_6;
													}
												} else {
													if (bool_1) {
														i_35 = (i_34 & 0xff0000) * i_25 & ~0xffffff;
														i_36 = (i_34 & 0xff00) * i_26 & 0xff0000;
														i_37 = (i_34 & 0xff) * i_27 & 0xff00;
														ints_23[i_20] = (i_35 | i_36 | i_37) >>> 8;
													}

													if (bool_2 && bool_13) {
														floats_39[i_20] = f_6;
													}
												}
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
							i_25 = i_10 >>> 24;
							i_26 = 256 - i_25;

							for (i_27 = -i_8; i_27 < 0; i_27++) {
								i_28 = (i_15 >> 16) * this.anInt8851;

								for (i_29 = -i_7; i_29 < 0; i_29++) {
									if (!bool_2 || f_6 < floats_39[i_20]) {
										if (bool_1) {
											b_41 = this.aByteArray10221[(i_14 >> 16) + i_28];
											i_31 = b_41 > 0 ? this.anIntArray10220[b_41] : 0;
											i_32 = i_31 + i_10;
											i_33 = (i_31 & 0xff00ff) + (i_10 & 0xff00ff);
											i_34 = (i_33 & 0x1000100) + (i_32 - i_33 & 0x10000);
											i_34 = i_32 - i_34 | i_34 - (i_34 >>> 8);
											if (i_31 == 0 && i_25 != 255) {
												i_31 = i_34;
												i_34 = ints_23[i_20];
												i_34 = ((i_31 & 0xff00ff) * i_25 + (i_34 & 0xff00ff) * i_26 & ~0xff00ff) + ((i_31 & 0xff00) * i_25 + (i_34 & 0xff00) * i_26 & 0xff0000) >> 8;
											}

											ints_23[i_20] = i_34;
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
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
							if (i_9 != 2) {
								throw new IllegalArgumentException();
							}

							i_24 = i_10 >>> 24;
							i_25 = 256 - i_24;
							i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
							i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
							i_10 = (i_26 | i_27) >>> 8;
							i_28 = i_14;

							for (i_29 = -i_8; i_29 < 0; i_29++) {
								i_30 = (i_15 >> 16) * this.anInt8851;

								for (i_31 = -i_7; i_31 < 0; i_31++) {
									if (!bool_2 || f_6 < floats_39[i_20]) {
										b_43 = this.aByteArray10221[(i_14 >> 16) + i_30];
										if (b_43 != 0) {
											if (bool_1) {
												i_33 = this.anIntArray10220[b_43 & 0xff];
												i_26 = (i_33 & 0xff00ff) * i_24 & ~0xff00ff;
												i_27 = (i_33 & 0xff00) * i_24 & 0xff0000;
												ints_23[i_20] = ((i_26 | i_27) >>> 8) + i_10;
											}

											if (bool_2 && bool_13) {
												floats_39[i_20] = f_6;
											}
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
				} else {
					if (i_11 != 2) {
						throw new IllegalArgumentException();
					}

					if (i_9 == 1) {
						i_24 = i_14;

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * this.anInt8851;

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
									if (b_40 != 0) {
										if (bool_1) {
											i_29 = this.anIntArray10220[b_40 & 0xff];
											i_30 = ints_23[i_20];
											i_31 = i_29 + i_30;
											i_32 = (i_29 & 0xff00ff) + (i_30 & 0xff00ff);
											i_30 = (i_32 & 0x1000100) + (i_31 - i_32 & 0x10000);
											ints_23[i_20] = i_31 - i_30 | i_30 - (i_30 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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
						i_25 = (i_10 & 0xff0000) >> 16;
						i_26 = (i_10 & 0xff00) >> 8;
						i_27 = i_10 & 0xff;

						for (i_28 = -i_8; i_28 < 0; i_28++) {
							i_29 = (i_15 >> 16) * this.anInt8851;

							for (i_30 = -i_7; i_30 < 0; i_30++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									byte b_44 = this.aByteArray10221[(i_14 >> 16) + i_29];
									if (b_44 != 0) {
										if (bool_1) {
											i_32 = this.anIntArray10220[b_44 & 0xff];
											i_33 = (i_32 & 0xff0000) * i_25 & ~0xffffff;
											i_34 = (i_32 & 0xff00) * i_26 & 0xff0000;
											i_35 = (i_32 & 0xff) * i_27 & 0xff00;
											i_32 = (i_33 | i_34 | i_35) >>> 8;
											i_36 = ints_23[i_20];
											i_37 = i_32 + i_36;
											i_38 = (i_32 & 0xff00ff) + (i_36 & 0xff00ff);
											i_36 = (i_38 & 0x1000100) + (i_37 - i_38 & 0x10000);
											ints_23[i_20] = i_37 - i_36 | i_36 - (i_36 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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

						for (i_25 = -i_8; i_25 < 0; i_25++) {
							i_26 = (i_15 >> 16) * this.anInt8851;

							for (i_27 = -i_7; i_27 < 0; i_27++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									if (bool_1) {
										b_40 = this.aByteArray10221[(i_14 >> 16) + i_26];
										i_29 = b_40 > 0 ? this.anIntArray10220[b_40] : 0;
										i_30 = i_29 + i_10;
										i_31 = (i_29 & 0xff00ff) + (i_10 & 0xff00ff);
										i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
										i_29 = i_30 - i_32 | i_32 - (i_32 >>> 8);
										i_32 = ints_23[i_20];
										i_30 = i_29 + i_32;
										i_31 = (i_29 & 0xff00ff) + (i_32 & 0xff00ff);
										i_32 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
										ints_23[i_20] = i_30 - i_32 | i_32 - (i_32 >>> 8);
									}

									if (bool_2 && bool_13) {
										floats_39[i_20] = f_6;
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
						if (i_9 != 2) {
							throw new IllegalArgumentException();
						}

						i_24 = i_10 >>> 24;
						i_25 = 256 - i_24;
						i_26 = (i_10 & 0xff00ff) * i_25 & ~0xff00ff;
						i_27 = (i_10 & 0xff00) * i_25 & 0xff0000;
						i_10 = (i_26 | i_27) >>> 8;
						i_28 = i_14;

						for (i_29 = -i_8; i_29 < 0; i_29++) {
							i_30 = (i_15 >> 16) * this.anInt8851;

							for (i_31 = -i_7; i_31 < 0; i_31++) {
								if (!bool_2 || f_6 < floats_39[i_20]) {
									b_43 = this.aByteArray10221[(i_14 >> 16) + i_30];
									if (b_43 != 0) {
										if (bool_1) {
											i_33 = this.anIntArray10220[b_43 & 0xff];
											i_26 = (i_33 & 0xff00ff) * i_24 & ~0xff00ff;
											i_27 = (i_33 & 0xff00) * i_24 & 0xff0000;
											i_33 = ((i_26 | i_27) >>> 8) + i_10;
											i_34 = ints_23[i_20];
											i_35 = i_33 + i_34;
											i_36 = (i_33 & 0xff00ff) + (i_34 & 0xff00ff);
											i_34 = (i_36 & 0x1000100) + (i_35 - i_36 & 0x10000);
											ints_23[i_20] = i_35 - i_34 | i_34 - (i_34 >>> 8);
										}

										if (bool_2 && bool_13) {
											floats_39[i_20] = f_6;
										}
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

	public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		if (this.aClass505_Sub3_8875.method14408()) {
			throw new IllegalStateException();
		} else {
			int[] ints_6 = this.aClass505_Sub3_8875.anIntArray8979;
			if (ints_6 != null) {
				i_1 += this.anInt8853;
				i_2 += this.anInt8854;
				int i_7 = 0;
				int i_8 = this.aClass505_Sub3_8875.anInt8980 * 299731099 * 444800403;
				int i_9 = this.anInt8851;
				int i_10 = this.anInt8867;
				int i_11 = i_8 - i_9;
				int i_12 = 0;
				int i_13 = i_1 + i_2 * i_8;
				int i_14;
				if (i_2 < this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457) {
					i_14 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457 - i_2;
					i_10 -= i_14;
					i_2 = this.aClass505_Sub3_8875.anInt9009 * 1457972577 * 1516535457;
					i_7 += i_14 * i_9;
					i_13 += i_14 * i_8;
				}

				if (i_2 + i_10 > this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921) {
					i_10 -= i_2 + i_10 - this.aClass505_Sub3_8875.anInt8986 * 760194793 * 1383960921;
				}

				if (i_1 < this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989) {
					i_14 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989 - i_1;
					i_9 -= i_14;
					i_1 = this.aClass505_Sub3_8875.anInt8983 * -363774331 * 72550989;
					i_7 += i_14;
					i_13 += i_14;
					i_12 += i_14;
					i_11 += i_14;
				}

				if (i_1 + i_9 > this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237) {
					i_14 = i_1 + i_9 - this.aClass505_Sub3_8875.anInt9002 * 1714763515 * -1710988237;
					i_9 -= i_14;
					i_12 += i_14;
					i_11 += i_14;
				}

				if (i_9 > 0 && i_10 > 0) {
					PacketsDecoder packetsdecoder_26 = (PacketsDecoder) class455_3;
					int[] ints_15 = packetsdecoder_26.anIntArray9077;
					int[] ints_16 = packetsdecoder_26.anIntArray9078;
					int i_17 = i_2;
					if (i_5 > i_2) {
						i_17 = i_5;
						i_13 += (i_5 - i_2) * i_8;
						i_7 += (i_5 - i_2) * this.anInt8851;
					}

					int i_18 = i_5 + ints_15.length < i_2 + i_10 ? i_5 + ints_15.length : i_2 + i_10;

					for (int i_19 = i_17; i_19 < i_18; i_19++) {
						int i_20 = ints_15[i_19 - i_5] + i_4;
						int i_21 = ints_16[i_19 - i_5];
						int i_22 = i_9;
						int i_23;
						if (i_1 > i_20) {
							i_23 = i_1 - i_20;
							if (i_23 >= i_21) {
								i_7 += i_9 + i_12;
								i_13 += i_9 + i_11;
								continue;
							}

							i_21 -= i_23;
						} else {
							i_23 = i_20 - i_1;
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
						if (i_22 < i_21) {
							i_21 = i_22;
						} else {
							i_23 = i_22 - i_21;
						}

						for (int i_24 = -i_21; i_24 < 0; i_24++) {
							byte b_25 = this.aByteArray10221[i_7++];
							if (b_25 != 0) {
								ints_6[i_13++] = this.anIntArray10220[b_25 & 0xff];
							} else {
								++i_13;
							}
						}

						i_7 += i_23 + i_12;
						i_13 += i_23 + i_11;
					}
				}
			}

		}
	}

}
