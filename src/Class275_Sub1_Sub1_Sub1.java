import java.util.Iterator;

public class Class275_Sub1_Sub1_Sub1 extends Class275_Sub1_Sub1 {

	short aShort10425;
	Class538 aClass538_10428;
	short aShort10427;
	short aShort10432;
	short aShort10431;
	short aShort10424;
	short aShort10430;
	int anInt10429;
	int anInt10426;

	void method15954() {
		int i_1 = this.aClass538_10428.aClass539_7102.anInt7125;
		if (this.aClass538_10428.aClass539_7102.aClass275_Sub1_Sub1_Sub1Array7120[i_1] != null) {
			this.aClass538_10428.aClass539_7102.aClass275_Sub1_Sub1_Sub1Array7120[i_1].method15957();
		}

		this.aClass538_10428.aClass539_7102.aClass275_Sub1_Sub1_Sub1Array7120[i_1] = this;
		this.aShort10425 = (short) this.aClass538_10428.aClass539_7102.anInt7125;
		this.aClass538_10428.aClass539_7102.anInt7125 = i_1 + 1 & 0x1fff;
		this.aClass538_10428.aClass457_7100.method7649(this, 1353338910);
	}

	void method15955(Class538 class538_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_13, boolean bool_14) {
		this.aClass538_10428 = class538_1;
		this.anInt10205 = i_2 << 12;
		this.anInt10208 = i_3 << 12;
		this.anInt10202 = i_4 << 12;
		this.anInt10209 = i_10;
		this.aShort10432 = this.aShort10427 = (short) i_9;
		this.anInt10206 = i_11;
		this.anInt10207 = i_12;
		this.aBool10210 = bool_14;
		this.aShort10431 = (short) i_5;
		this.aShort10424 = (short) i_6;
		this.aShort10430 = (short) i_7;
		this.anInt10429 = i_8;
		this.aByte10211 = this.aClass538_10428.aClass87_7110.aByte839;
		this.method15954();
	}

	void method15957() {
		this.aClass538_10428.aClass539_7102.aClass275_Sub1_Sub1_Sub1Array7120[this.aShort10425] = null;
		Class235.aClass275_Sub1_Sub1_Sub1Array2897[Class235.anInt2905] = this;
		Class235.anInt2905 = Class235.anInt2905 + 1 & 0x3ff;
		this.method4887((byte) -14);
		this.method12423((byte) -115);
	}

	void method15965(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, long long_3) {
		int i_5 = this.anInt10205 >> sceneobjectmanager_1.anInt2592 + 12;
		int i_6 = this.anInt10202 >> sceneobjectmanager_1.anInt2592 + 12;
		int i_7 = this.anInt10208 >> 12;
		if (i_7 <= 0 && i_7 >= -262144 && i_5 >= 0 && i_5 < sceneobjectmanager_1.anInt2617 && i_6 >= 0 && i_6 < sceneobjectmanager_1.anInt2603) {
			Class539 class539_8 = this.aClass538_10428.aClass539_7102;
			Class59 class59_9 = this.aClass538_10428.aClass59_7101;
			Class390[] arr_10 = sceneobjectmanager_1.aClass390Array2591;
			int i_11 = class539_8.anInt7122;
			Class293 class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[class539_8.anInt7122][i_5][i_6];
			if (class293_12 != null) {
				i_11 = class293_12.aByte3507;
			}

			int i_13 = arr_10[i_11].method6722(i_5, i_6, 65280);
			int i_14;
			if (i_11 < sceneobjectmanager_1.anInt2601 - 1) {
				i_14 = arr_10[i_11 + 1].method6722(i_5, i_6, 65280);
			} else {
				i_14 = i_13 - (8 << sceneobjectmanager_1.anInt2592);
			}

			if (class59_9.aBool578) {
				if (class59_9.anInt591 == -1 && i_7 > i_13) {
					this.method15957();
					return;
				}

				if (class59_9.anInt591 >= 0 && i_7 > arr_10[class59_9.anInt591].method6722(i_5, i_6, 65280)) {
					this.method15957();
					return;
				}

				if (class59_9.anInt600 == -1 && i_7 < i_14) {
					this.method15957();
					return;
				}

				if (class59_9.anInt600 >= 0 && i_7 < arr_10[class59_9.anInt600 + 1].method6722(i_5, i_6, 65280)) {
					this.method15957();
					return;
				}
			}

			int i_15;
			for (i_15 = sceneobjectmanager_1.anInt2601 - 1; i_15 > 0 && i_7 > arr_10[i_15].method6722(i_5, i_6, 65280); --i_15) {
				;
			}

			if (class59_9.aBool541 && i_15 == 0 && i_7 > arr_10[0].method6722(i_5, i_6, 65280)) {
				this.method15957();
			} else if (i_15 == sceneobjectmanager_1.anInt2601 - 1 && arr_10[i_15].method6722(i_5, i_6, 65280) - i_7 > 8 << sceneobjectmanager_1.anInt2592) {
				this.method15957();
			} else {
				class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_15][i_5][i_6];
				int i_17;
				if (class293_12 == null) {
					if (i_15 == 0 || sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6] == null) {
						class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6] = new Class293(0);
					}

					boolean bool_16 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6].aClass293_3509 != null;
					if (i_15 == 3 && bool_16) {
						this.method15957();
						return;
					}

					for (i_17 = 1; i_17 <= i_15; i_17++) {
						if (sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_17][i_5][i_6] == null) {
							class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_17][i_5][i_6] = new Class293(i_17);
							if (bool_16) {
								++class293_12.aByte3507;
							}
						}
					}
				}

				if (class59_9.aBool576) {
					int i_20 = this.anInt10205 >> 12;
					i_17 = this.anInt10202 >> 12;
					Class200 class200_18;
					if (class293_12.aClass521_Sub1_Sub5_3505 != null) {
						class200_18 = class293_12.aClass521_Sub1_Sub5_3505.method12992(graphicalrenderer_2, (byte) -108);
						if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
							this.method15957();
							return;
						}
					}

					if (class293_12.aClass521_Sub1_Sub5_3502 != null) {
						class200_18 = class293_12.aClass521_Sub1_Sub5_3502.method12992(graphicalrenderer_2, (byte) -127);
						if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
							this.method15957();
							return;
						}
					}

					if (class293_12.aClass521_Sub1_Sub3_3499 != null) {
						class200_18 = class293_12.aClass521_Sub1_Sub3_3499.method12992(graphicalrenderer_2, (byte) -37);
						if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
							this.method15957();
							return;
						}
					}

					for (Class208 class208_21 = class293_12.aClass208_3504; class208_21 != null; class208_21 = class208_21.aClass208_2660) {
						Class200 class200_19 = class208_21.aClass521_Sub1_Sub1_2659.method12992(graphicalrenderer_2, (byte) -12);
						if (class200_19 != null && class200_19.method3255(i_20, i_7, i_17)) {
							this.method15957();
							return;
						}
					}
				}

				class539_8.aClass151_7131.aClass464_1961.method7735(this, -606845948);
			}
		} else {
			this.method15957();
		}

	}

	Class275_Sub1_Sub1_Sub1(Class538 class538_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_13, boolean bool_14) {
		this.aClass538_10428 = class538_1;
		this.anInt10205 = i_2 << 12;
		this.anInt10208 = i_3 << 12;
		this.anInt10202 = i_4 << 12;
		this.anInt10209 = i_10;
		this.aShort10432 = this.aShort10427 = (short) i_9;
		this.anInt10206 = i_11;
		this.anInt10207 = i_12;
		this.aBool10210 = bool_14;
		this.aShort10431 = (short) i_5;
		this.aShort10424 = (short) i_6;
		this.aShort10430 = (short) i_7;
		this.anInt10429 = i_8;
		this.aByte10211 = this.aClass538_10428.aClass87_7110.aByte839;
		this.method15954();
	}

	void method15967(long long_1, int i_3) {
		this.aShort10427 = (short) (this.aShort10427 - i_3);
		if (this.aShort10427 <= 0) {
			this.method15957();
		} else {
			int i_4 = this.anInt10205 >> 12;
			int i_5 = this.anInt10208 >> 12;
			int i_6 = this.anInt10202 >> 12;
			Class539 class539_7 = this.aClass538_10428.aClass539_7102;
			Class59 class59_8 = this.aClass538_10428.aClass59_7101;
			if (class59_8.anInt564 != 0) {
				int i_9;
				if (this.aShort10432 - this.aShort10427 <= class59_8.anInt558) {
					i_9 = i_3 * class59_8.anInt593 + (this.anInt10426 >> 16 & 0xff) + (this.anInt10209 >> 8 & 0xff00);
					int i_10 = i_3 * class59_8.anInt594 + (this.anInt10209 & 0xff00) + (this.anInt10426 >> 8 & 0xff);
					int i_11 = i_3 * class59_8.anInt595 + (this.anInt10209 << 8 & 0xff00) + (this.anInt10426 & 0xff);
					if (i_9 < 0) {
						i_9 = 0;
					} else if (i_9 > 65535) {
						i_9 = 65535;
					}

					if (i_10 < 0) {
						i_10 = 0;
					} else if (i_10 > 65535) {
						i_10 = 65535;
					}

					if (i_11 < 0) {
						i_11 = 0;
					} else if (i_11 > 65535) {
						i_11 = 65535;
					}

					this.anInt10209 &= ~0xffffff;
					this.anInt10209 |= (i_10 & 0xff00) + ((i_11 & 0xff00) >> 8) + ((i_9 & 0xff00) << 8);
					this.anInt10426 &= ~0xffffff;
					this.anInt10426 |= (i_11 & 0xff) + ((i_9 & 0xff) << 16) + ((i_10 & 0xff) << 8);
				}

				if (this.aShort10432 - this.aShort10427 <= class59_8.anInt592) {
					i_9 = i_3 * class59_8.anInt596 + (this.anInt10426 >> 24 & 0xff) + (this.anInt10209 >> 16 & 0xff00);
					if (i_9 < 0) {
						i_9 = 0;
					} else if (i_9 > 65535) {
						i_9 = 65535;
					}

					this.anInt10209 &= 0xffffff;
					this.anInt10209 |= (i_9 & 0xff00) << 16;
					this.anInt10426 &= 0xffffff;
					this.anInt10426 |= (i_9 & 0xff) << 24;
				}
			}

			if (class59_8.anInt547 != -1 && this.aShort10432 - this.aShort10427 <= class59_8.anInt597) {
				this.anInt10429 += class59_8.anInt598 * i_3;
			}

			if (class59_8.anInt583 != -1 && this.aShort10432 - this.aShort10427 <= class59_8.anInt580) {
				this.anInt10206 += class59_8.anInt540 * i_3;
			}

			double d_40 = (double) this.aShort10431;
			double d_42 = (double) this.aShort10424;
			double d_13 = (double) this.aShort10430;
			boolean bool_15 = false;
			int i_16;
			int i_17;
			int i_18;
			int i_19;
			long long_20;
			if (class59_8.anInt542 == 1) {
				i_16 = i_4 - this.aClass538_10428.aClass234_7115.anInt2894;
				i_17 = i_5 - this.aClass538_10428.aClass234_7115.anInt2887;
				i_18 = i_6 - this.aClass538_10428.aClass234_7115.anInt2892;
				i_19 = (int) Math.sqrt((double) (i_16 * i_16 + i_17 * i_17 + i_18 * i_18)) >> 2;
				long_20 = (long) (i_3 * i_19 * class59_8.anInt569);
				this.anInt10429 = (int) ((long) this.anInt10429 - ((long) this.anInt10429 * long_20 >> 18));
			} else if (class59_8.anInt542 == 2) {
				i_16 = i_4 - this.aClass538_10428.aClass234_7115.anInt2894;
				i_17 = i_5 - this.aClass538_10428.aClass234_7115.anInt2887;
				i_18 = i_6 - this.aClass538_10428.aClass234_7115.anInt2892;
				i_19 = i_16 * i_16 + i_17 * i_17 + i_18 * i_18;
				long_20 = (long) (i_3 * i_19 * class59_8.anInt569);
				this.anInt10429 = (int) ((long) this.anInt10429 - ((long) this.anInt10429 * long_20 >> 28));
			}

			Class282_Sub40 class282_sub40_45;
			Class345 class345_46;
			if (class59_8.anIntArray559 != null) {
				Iterator iterator_44 = class539_7.aList7127.iterator();

				label218: while (true) {
					do {
						if (!iterator_44.hasNext()) {
							break label218;
						}

						class282_sub40_45 = (Class282_Sub40) iterator_44.next();
						class345_46 = class282_sub40_45.aClass345_8007;
					} while (class345_46.anInt4041 == 1);

					boolean bool_50 = false;

					for (int i_47 = 0; i_47 < class59_8.anIntArray559.length; i_47++) {
						if (class345_46.anInt4032 == class59_8.anIntArray559[i_47]) {
							bool_50 = true;
							break;
						}
					}

					if (bool_50) {
						double d_51 = (double) (i_4 - class282_sub40_45.anInt8010);
						double d_22 = (double) (i_5 - class282_sub40_45.anInt8006);
						double d_24 = (double) (i_6 - class282_sub40_45.anInt8008);
						double d_26 = d_51 * d_51 + d_22 * d_22 + d_24 * d_24;
						if (d_26 <= (double) class345_46.aLong4044) {
							double d_28 = Math.sqrt(d_26);
							if (d_28 == 0.0D) {
								d_28 = 1.0D;
							}

							double d_30 = (d_51 * (double) class282_sub40_45.aFloat8011 + d_22 * (double) class345_46.anInt4036 + d_24 * (double) class282_sub40_45.aFloat8012) * 65535.0D / ((double) class345_46.anInt4033 * d_28);
							if (d_30 >= (double) class345_46.anInt4024) {
								double d_32 = 0.0D;
								if (class345_46.anInt4038 == 1) {
									d_32 = d_28 / 16.0D * (double) class345_46.anInt4035;
								} else if (class345_46.anInt4038 == 2) {
									d_32 = d_28 / 16.0D * (d_28 / 16.0D) * (double) class345_46.anInt4035;
								}

								if (class345_46.anInt4039 == 0) {
									if (class345_46.anInt4040 == 0) {
										d_40 += ((double) class282_sub40_45.aFloat8011 - d_32) * (double) i_3;
										d_42 += ((double) class345_46.anInt4036 - d_32) * (double) i_3;
										d_13 += ((double) class282_sub40_45.aFloat8012 - d_32) * (double) i_3;
										bool_15 = true;
									} else {
										this.anInt10205 = (int) ((double) this.anInt10205 + ((double) class282_sub40_45.aFloat8011 - d_32) * (double) i_3);
										this.anInt10208 = (int) ((double) this.anInt10208 + ((double) class345_46.anInt4036 - d_32) * (double) i_3);
										this.anInt10202 = (int) ((double) this.anInt10202 + ((double) class282_sub40_45.aFloat8012 - d_32) * (double) i_3);
									}
								} else {
									double d_34 = d_51 / d_28 * (double) class345_46.anInt4033;
									double d_36 = d_22 / d_28 * (double) class345_46.anInt4033;
									double d_38 = d_24 / d_28 * (double) class345_46.anInt4033;
									if (class345_46.anInt4040 == 0) {
										d_40 += d_34 * (double) i_3;
										d_42 += d_36 * (double) i_3;
										d_13 += d_38 * (double) i_3;
										bool_15 = true;
									} else {
										this.anInt10205 = (int) ((double) this.anInt10205 + d_34 * (double) i_3);
										this.anInt10208 = (int) ((double) this.anInt10208 + d_36 * (double) i_3);
										this.anInt10202 = (int) ((double) this.anInt10202 + d_38 * (double) i_3);
									}
								}
							}
						}
					}
				}
			}

			if (class59_8.anIntArray582 != null) {
				for (i_16 = 0; i_16 < class59_8.anIntArray582.length; i_16++) {
					class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7754((long) class59_8.anIntArray582[i_16]);

					while (class282_sub40_45 != null) {
						class345_46 = class282_sub40_45.aClass345_8007;
						double d_48 = (double) (i_4 - class282_sub40_45.anInt8010);
						double d_21 = (double) (i_5 - class282_sub40_45.anInt8006);
						double d_23 = (double) (i_6 - class282_sub40_45.anInt8008);
						double d_25 = d_48 * d_48 + d_21 * d_21 + d_23 * d_23;
						if (d_25 > (double) class345_46.aLong4044) {
							class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7747(-1253459750);
						} else {
							double d_27 = Math.sqrt(d_25);
							if (d_27 == 0.0D) {
								d_27 = 1.0D;
							}

							double d_29 = (d_48 * (double) class282_sub40_45.aFloat8011 + d_21 * (double) class345_46.anInt4036 + d_23 * (double) class282_sub40_45.aFloat8012) * 65535.0D / ((double) class345_46.anInt4033 * d_27);
							if (d_29 < (double) class345_46.anInt4024) {
								class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7747(-1518106530);
							} else {
								double d_31 = 0.0D;
								if (class345_46.anInt4038 == 1) {
									d_31 = d_27 / 16.0D * (double) class345_46.anInt4035;
								} else if (class345_46.anInt4038 == 2) {
									d_31 = d_27 / 16.0D * (d_27 / 16.0D) * (double) class345_46.anInt4035;
								}

								if (class345_46.anInt4039 == 0) {
									if (class345_46.anInt4040 == 0) {
										d_40 += ((double) class282_sub40_45.aFloat8011 - d_31) * (double) i_3;
										d_42 += ((double) class345_46.anInt4036 - d_31) * (double) i_3;
										d_13 += ((double) class282_sub40_45.aFloat8012 - d_31) * (double) i_3;
										bool_15 = true;
									} else {
										this.anInt10205 = (int) ((double) this.anInt10205 + ((double) class282_sub40_45.aFloat8011 - d_31) * (double) i_3);
										this.anInt10208 = (int) ((double) this.anInt10208 + ((double) class345_46.anInt4036 - d_31) * (double) i_3);
										this.anInt10202 = (int) ((double) this.anInt10202 + ((double) class282_sub40_45.aFloat8012 - d_31) * (double) i_3);
									}
								} else {
									double d_33 = d_48 / d_27 * (double) class345_46.anInt4033;
									double d_35 = d_21 / d_27 * (double) class345_46.anInt4033;
									double d_37 = d_23 / d_27 * (double) class345_46.anInt4033;
									if (class345_46.anInt4040 == 0) {
										d_40 += d_33 * (double) i_3;
										d_42 += d_35 * (double) i_3;
										d_13 += d_37 * (double) i_3;
										bool_15 = true;
									} else {
										this.anInt10205 = (int) ((double) this.anInt10205 + d_33 * (double) i_3);
										this.anInt10208 = (int) ((double) this.anInt10208 + d_35 * (double) i_3);
										this.anInt10202 = (int) ((double) this.anInt10202 + d_37 * (double) i_3);
									}
								}

								class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7747(-1586920665);
							}
						}
					}
				}
			}

			if (class59_8.anIntArray561 != null) {
				if (class59_8.anIntArray562 == null) {
					class59_8.anIntArray562 = new int[class59_8.anIntArray561.length];

					for (i_16 = 0; i_16 < class59_8.anIntArray561.length; i_16++) {
						Class423.method7065(class59_8.anIntArray561[i_16], -1229346850);
						class59_8.anIntArray562[i_16] = ((Class282_Sub38) Class345.aClass465_4029.method7754((long) class59_8.anIntArray561[i_16])).anInt8002;
					}
				}

				for (i_16 = 0; i_16 < class59_8.anIntArray562.length; i_16++) {
					Class345 class345_52 = Class345.aClass345Array4025[class59_8.anIntArray562[i_16]];
					if (class345_52.anInt4040 == 0) {
						d_40 += (double) (i_3 * class345_52.anInt4027);
						d_42 += (double) (i_3 * class345_52.anInt4036);
						d_13 += (double) (i_3 * class345_52.anInt4037);
						bool_15 = true;
					} else {
						this.anInt10205 += class345_52.anInt4027 * i_3;
						this.anInt10208 += class345_52.anInt4036 * i_3;
						this.anInt10202 += class345_52.anInt4037 * i_3;
					}
				}
			}

			if (bool_15) {
				while (true) {
					if (d_40 <= 32767.0D && d_42 <= 32767.0D && d_13 <= 32767.0D && d_40 >= -32767.0D && d_42 >= -32767.0D && d_13 >= -32767.0D) {
						this.aShort10431 = (short) ((int) d_40);
						this.aShort10424 = (short) ((int) d_42);
						this.aShort10430 = (short) ((int) d_13);
						break;
					}

					d_40 /= 2.0D;
					d_42 /= 2.0D;
					d_13 /= 2.0D;
					this.anInt10429 <<= 1;
				}
			}

			this.anInt10205 = (int) ((long) this.anInt10205 + ((long) this.aShort10431 * (long) (this.anInt10429 << 2) >> 23) * (long) i_3);
			this.anInt10208 = (int) ((long) this.anInt10208 + ((long) this.aShort10424 * (long) (this.anInt10429 << 2) >> 23) * (long) i_3);
			this.anInt10202 = (int) ((long) this.anInt10202 + ((long) this.aShort10430 * (long) (this.anInt10429 << 2) >> 23) * (long) i_3);
		}

	}

}
