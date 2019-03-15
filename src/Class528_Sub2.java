public class Class528_Sub2 extends MeshRasterizer {

	static int anInt8644 = 4096;
	static int anInt8562 = 4096;
	static int anInt8612 = 0;
	ChoppyItemFixClass aClass144_8566;
	Class185 aClass185_8564;
	int[] anIntArray8633;
	float[] aFloatArray8590;
	float[] aFloatArray8605;
	float[] aFloatArray8636;
	float[] aFloatArray8637;
	int[] anIntArray8583;
	int[] anIntArray8639;
	int[] anIntArray8628;
	int[] anIntArray8567;
	int[] anIntArray8619;
	int[] anIntArray8643;
	int anInt8577;
	int anInt8598 = 0;
	Class185 aClass185_8565;
	Class528_Sub2[] aClass528_Sub2Array8626;
	Class528_Sub2[] aClass528_Sub2Array8645;
	Class189[] aClass189Array8584;
	Class195[] aClass195Array8599;
	int[] anIntArray8592;
	int[] anIntArray8631;
	int[] anIntArray8594;
	short[] aShortArray8604;
	byte[] aByteArray8600;
	Class189[] aClass189Array8585;
	boolean aBool8621 = false;
	short aShort8627;
	short aShort8625;
	short aShort8629;
	short aShort8634;
	short aShort8570;
	short aShort8571;
	short aShort8595;
	short aShort8574;
	int anInt8606;
	int anInt8578 = 0;
	int anInt8579 = 0;
	int anInt8586 = 0;
	int anInt8617;
	boolean aBool8630 = false;
	boolean aBool8640 = false;
	int[] anIntArray8580;
	int[] anIntArray8581;
	int[] anIntArray8610;
	byte[] aByteArray8602;
	short[] aShortArray8603;
	Class176[] aClass176Array8582;
	float[][] aFloatArrayArray8635;
	float[][] aFloatArrayArray8591;
	int[][] anIntArrayArray8568;
	int[][] anIntArrayArray8608;
	int[][] anIntArrayArray8620;
	short[] aShortArray8569;
	short[] aShortArray8632;
	byte[] aByteArray8601;
	short[] aShortArray8587;
	short[] aShortArray8588;
	short[] aShortArray8642;
	Surface[] aClass87Array8615;
	SurfaceSkin[] aClass172Array8616;
	Class193[] aClass193Array8618;
	short[] aShortArray8623;
	int anInt8575;
	boolean aBool8609;
	boolean aBool8589 = false;
	int anInt8611;
	int anInt8607;
	int anInt8613;
	boolean aBool8614 = false;
	boolean aBool8563 = false;
	HardwareRenderer aClass505_Sub3_8638;

	public void method11282(Matrix44Var matrix44var_1, Class275_Sub5 class275_sub5_2, int i_3) {
		this.method13814(matrix44var_1, class275_sub5_2, i_3);
	}

	void method13795(Class185 class185_1) {
		this.aClass144_8566 = class185_1.aClass144_2310;
		if (class185_1 != this.aClass185_8564) {
			this.aClass185_8564 = class185_1;
			this.anIntArray8633 = this.aClass185_8564.anIntArray2319;
			this.aFloatArray8590 = this.aClass185_8564.aFloatArray2302;
			this.aFloatArray8605 = this.aClass185_8564.aFloatArray2341;
			this.aFloatArray8636 = this.aClass185_8564.aFloatArray2322;
			this.aFloatArray8637 = this.aClass185_8564.aFloatArray2323;
			this.anIntArray8583 = this.aClass185_8564.anIntArray2321;
			this.anIntArray8639 = this.aClass185_8564.anIntArray2325;
			this.anIntArray8628 = this.aClass185_8564.anIntArray2312;
			this.anIntArray8567 = this.aClass185_8564.anIntArray2327;
			this.anIntArray8619 = this.aClass185_8564.anIntArray2328;
			this.anIntArray8643 = this.aClass185_8564.anIntArray2329;
		}

	}

	public void Q(int i_1) {
		if ((this.anInt8575 & 0x2000) != 8192) {
			throw new IllegalStateException();
		} else {
			this.anInt8577 = i_1;
			this.anInt8598 = 0;
		}
	}

	void method13796(Thread thread_1) {
		Class185 class185_2 = this.aClass505_Sub3_8638.method14370(thread_1);
		if (class185_2 != this.aClass185_8565) {
			this.aClass185_8565 = class185_2;
			this.aClass528_Sub2Array8626 = this.aClass185_8565.aClass528_Sub2Array2339;
			this.aClass528_Sub2Array8645 = this.aClass185_8565.aClass528_Sub2Array2340;
		}

	}

	void method13797() {
		this.aClass189Array8584 = new Class189[this.anInt8579];

		int i_1;
		for (i_1 = 0; i_1 < this.anInt8579; i_1++) {
			this.aClass189Array8584[i_1] = new Class189();
		}

		for (i_1 = 0; i_1 < this.anInt8586; i_1++) {
			short s_2 = this.aShortArray8587[i_1];
			short s_3 = this.aShortArray8588[i_1];
			short s_4 = this.aShortArray8642[i_1];
			int i_5 = this.anIntArray8580[s_3] - this.anIntArray8580[s_2];
			int i_6 = this.anIntArray8581[s_3] - this.anIntArray8581[s_2];
			int i_7 = this.anIntArray8610[s_3] - this.anIntArray8610[s_2];
			int i_8 = this.anIntArray8580[s_4] - this.anIntArray8580[s_2];
			int i_9 = this.anIntArray8581[s_4] - this.anIntArray8581[s_2];
			int i_10 = this.anIntArray8610[s_4] - this.anIntArray8610[s_2];
			int i_11 = i_6 * i_10 - i_9 * i_7;
			int i_12 = i_7 * i_8 - i_10 * i_5;

			int i_13;
			for (i_13 = i_5 * i_9 - i_8 * i_6; i_11 > 8192 || i_12 > 8192 || i_13 > 8192 || i_11 < -8192 || i_12 < -8192 || i_13 < -8192; i_13 >>= 1) {
				i_11 >>= 1;
				i_12 >>= 1;
			}

			int i_14 = (int) Math.sqrt((double) (i_11 * i_11 + i_12 * i_12 + i_13 * i_13));
			if (i_14 <= 0) {
				i_14 = 1;
			}

			i_11 = i_11 * 256 / i_14;
			i_12 = i_12 * 256 / i_14;
			i_13 = i_13 * 256 / i_14;
			byte b_15;
			if (this.aByteArray8600 == null) {
				b_15 = 0;
			} else {
				b_15 = this.aByteArray8600[i_1];
			}

			if (b_15 == 0) {
				Class189 class189_16 = this.aClass189Array8584[s_2];
				class189_16.anInt2380 += i_11;
				class189_16.anInt2381 += i_12;
				class189_16.anInt2379 += i_13;
				++class189_16.anInt2382;
				class189_16 = this.aClass189Array8584[s_3];
				class189_16.anInt2380 += i_11;
				class189_16.anInt2381 += i_12;
				class189_16.anInt2379 += i_13;
				++class189_16.anInt2382;
				class189_16 = this.aClass189Array8584[s_4];
				class189_16.anInt2380 += i_11;
				class189_16.anInt2381 += i_12;
				class189_16.anInt2379 += i_13;
				++class189_16.anInt2382;
			} else if (b_15 == 1) {
				if (this.aClass195Array8599 == null) {
					this.aClass195Array8599 = new Class195[this.anInt8586];
				}

				Class195 class195_17 = this.aClass195Array8599[i_1] = new Class195();
				class195_17.anInt2410 = i_11;
				class195_17.anInt2411 = i_12;
				class195_17.anInt2412 = i_13;
			}
		}

	}

	public void cq(short s_1, short s_2) {
		int i_3;
		for (i_3 = 0; i_3 < this.anInt8586; i_3++) {
			if (this.aShortArray8604[i_3] == s_1) {
				this.aShortArray8604[i_3] = s_2;
			}
		}

		if (this.aClass193Array8618 != null) {
			for (i_3 = 0; i_3 < this.anInt8617; i_3++) {
				Class193 class193_4 = this.aClass193Array8618[i_3];
				Class176 class176_5 = this.aClass176Array8582[i_3];
				class176_5.anInt2199 = (class176_5.anInt2199 * -1022818925 * -1303125861 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_4.anInt2393 * -1274099887 * 142270897], 1835640690) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
			}
		}

		if (this.anInt8598 == 2) {
			this.anInt8598 = 1;
		}

	}

	void method13798(boolean bool_1) {
		if (this.anInt8598 == 1) {
			this.method13801();
		} else if (this.anInt8598 == 2) {
			if ((this.anInt8575 & 0x97098) == 0 && this.aFloatArrayArray8635 == null) {
				this.aShortArray8604 = null;
			}

			if (bool_1) {
				this.aByteArray8600 = null;
			}
		} else {
			this.method13877();
			int i_2 = this.aClass505_Sub3_8638.anInt9011;
			int i_3 = this.aClass505_Sub3_8638.anInt8988;
			int i_4 = this.aClass505_Sub3_8638.anInt9007;
			int i_5 = this.aClass505_Sub3_8638.anInt8992 >> 8;
			int i_6 = 0;
			int i_7 = 0;
			if (this.anInt8577 != 0) {
				i_6 = this.aClass505_Sub3_8638.anInt8990 * 768 / this.anInt8577;
				i_7 = this.aClass505_Sub3_8638.anInt8991 * 768 / this.anInt8577;
			}

			if (this.anIntArray8592 == null) {
				this.anIntArray8592 = new int[this.anInt8586];
				this.anIntArray8631 = new int[this.anInt8586];
				this.anIntArray8594 = new int[this.anInt8586];
			}

			for (int i_8 = 0; i_8 < this.anInt8586; i_8++) {
				byte b_9;
				if (this.aByteArray8600 == null) {
					b_9 = 0;
				} else {
					b_9 = this.aByteArray8600[i_8];
				}

				byte b_10;
				if (this.aByteArray8602 == null) {
					b_10 = 0;
				} else {
					b_10 = this.aByteArray8602[i_8];
				}

				short s_11;
				if (this.aShortArray8603 == null) {
					s_11 = -1;
				} else {
					s_11 = this.aShortArray8603[i_8];
				}

				if (b_10 == -2) {
					b_9 = 3;
				}

				if (b_10 == -1) {
					b_9 = 2;
				}

				int i_12;
				int i_16;
				if (s_11 == -1) {
					int i_13;
					int i_17;
					int i_18;
					short s_21;
					if (b_9 != 0) {
						if (b_9 == 1) {
							i_12 = this.aShortArray8604[i_8] & 0xffff;
							i_13 = (i_12 & 0x7f) * this.anInt8606 >> 7;
							s_21 = Class372.method6362(i_12 & ~0x7f | i_13, 646072999);
							Class195 class195_22 = this.aClass195Array8599[i_8];
							i_16 = i_2 * class195_22.anInt2410 + i_3 * class195_22.anInt2411 + i_4 * class195_22.anInt2412 >> 16;
							i_17 = i_16 > 256 ? i_6 : i_7;
							i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
							this.anIntArray8592[i_8] = i_18 << 17 | Class282_Sub20_Sub2.method15076(s_21, i_18, -1499238507);
							this.anIntArray8594[i_8] = -1;
						} else if (b_9 == 3) {
							this.anIntArray8592[i_8] = 128;
							this.anIntArray8594[i_8] = -1;
						} else {
							this.anIntArray8594[i_8] = -2;
						}
					} else {
						i_12 = this.aShortArray8604[i_8] & 0xffff;
						i_13 = (i_12 & 0x7f) * this.anInt8606 >> 7;
						s_21 = Class372.method6362(i_12 & ~0x7f | i_13, 1639823285);
						Class189 class189_15;
						if (this.aClass189Array8585 != null && this.aClass189Array8585[this.aShortArray8587[i_8]] != null) {
							class189_15 = this.aClass189Array8585[this.aShortArray8587[i_8]];
						} else {
							class189_15 = this.aClass189Array8584[this.aShortArray8587[i_8]];
						}

						i_16 = (i_2 * class189_15.anInt2380 + i_3 * class189_15.anInt2381 + i_4 * class189_15.anInt2379) / class189_15.anInt2382 >> 16;
						i_17 = i_16 > 256 ? i_6 : i_7;
						i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
						this.anIntArray8592[i_8] = i_18 << 17 | Class282_Sub20_Sub2.method15076(s_21, i_18, -1278791259);
						if (this.aClass189Array8585 != null && this.aClass189Array8585[this.aShortArray8588[i_8]] != null) {
							class189_15 = this.aClass189Array8585[this.aShortArray8588[i_8]];
						} else {
							class189_15 = this.aClass189Array8584[this.aShortArray8588[i_8]];
						}

						i_16 = (i_2 * class189_15.anInt2380 + i_3 * class189_15.anInt2381 + i_4 * class189_15.anInt2379) / class189_15.anInt2382 >> 16;
						i_17 = i_16 > 256 ? i_6 : i_7;
						i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
						this.anIntArray8631[i_8] = i_18 << 17 | Class282_Sub20_Sub2.method15076(s_21, i_18, -1871859335);
						if (this.aClass189Array8585 != null && this.aClass189Array8585[this.aShortArray8642[i_8]] != null) {
							class189_15 = this.aClass189Array8585[this.aShortArray8642[i_8]];
						} else {
							class189_15 = this.aClass189Array8584[this.aShortArray8642[i_8]];
						}

						i_16 = (i_2 * class189_15.anInt2380 + i_3 * class189_15.anInt2381 + i_4 * class189_15.anInt2379) / class189_15.anInt2382 >> 16;
						i_17 = i_16 > 256 ? i_6 : i_7;
						i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
						this.anIntArray8594[i_8] = i_18 << 17 | Class282_Sub20_Sub2.method15076(s_21, i_18, -2145226586);
					}
				} else {
					i_12 = this.aShortArray8604[i_8] & 0xffff;
					int i_14;
					int i_20;
					if (b_9 != 0) {
						if (b_9 == 1) {
							Class195 class195_23 = this.aClass195Array8599[i_8];
							i_14 = i_2 * class195_23.anInt2410 + i_3 * class195_23.anInt2411 + i_4 * class195_23.anInt2412 >> 16;
							i_20 = i_14 > 256 ? i_6 : i_7;
							i_16 = this.method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
							this.anIntArray8592[i_8] = i_16 << 24 | this.method13799(i_12, s_11, i_16);
							this.anIntArray8594[i_8] = -1;
						} else {
							this.anIntArray8594[i_8] = -2;
						}
					} else {
						Class189 class189_19;
						if (this.aClass189Array8585 != null && this.aClass189Array8585[this.aShortArray8587[i_8]] != null) {
							class189_19 = this.aClass189Array8585[this.aShortArray8587[i_8]];
						} else {
							class189_19 = this.aClass189Array8584[this.aShortArray8587[i_8]];
						}

						i_14 = (i_2 * class189_19.anInt2380 + i_3 * class189_19.anInt2381 + i_4 * class189_19.anInt2379) / class189_19.anInt2382 >> 16;
						i_20 = i_14 > 256 ? i_6 : i_7;
						i_16 = this.method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
						this.anIntArray8592[i_8] = i_16 << 24 | this.method13799(i_12, s_11, i_16);
						if (this.aClass189Array8585 != null && this.aClass189Array8585[this.aShortArray8588[i_8]] != null) {
							class189_19 = this.aClass189Array8585[this.aShortArray8588[i_8]];
						} else {
							class189_19 = this.aClass189Array8584[this.aShortArray8588[i_8]];
						}

						i_14 = (i_2 * class189_19.anInt2380 + i_3 * class189_19.anInt2381 + i_4 * class189_19.anInt2379) / class189_19.anInt2382 >> 16;
						i_20 = i_14 > 256 ? i_6 : i_7;
						i_16 = this.method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
						this.anIntArray8631[i_8] = i_16 << 24 | this.method13799(i_12, s_11, i_16);
						if (this.aClass189Array8585 != null && this.aClass189Array8585[this.aShortArray8642[i_8]] != null) {
							class189_19 = this.aClass189Array8585[this.aShortArray8642[i_8]];
						} else {
							class189_19 = this.aClass189Array8584[this.aShortArray8642[i_8]];
						}

						i_14 = (i_2 * class189_19.anInt2380 + i_3 * class189_19.anInt2381 + i_4 * class189_19.anInt2379) / class189_19.anInt2382 >> 16;
						i_20 = i_14 > 256 ? i_6 : i_7;
						i_16 = this.method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
						this.anIntArray8594[i_8] = i_16 << 24 | this.method13799(i_12, s_11, i_16);
					}
				}
			}

			this.aClass189Array8584 = null;
			this.aClass189Array8585 = null;
			this.aClass195Array8599 = null;
			if ((this.anInt8575 & 0x97098) == 0 && this.aFloatArrayArray8635 == null) {
				this.aShortArray8604 = null;
			}

			if (bool_1) {
				this.aByteArray8600 = null;
			}

			this.anInt8598 = 2;
		}

	}

	int method13799(int i_1, short s_2, int i_3) {
		int i_4 = Class540.anIntArray7136[this.method13855(i_1, i_3)];
		TextureDetails class169_5 = this.aClass505_Sub3_8638.anInterface22_5834.method144(s_2 & 0xffff, -1944142308);
		int i_6 = class169_5.shadowFactor & 0xff;
		int i_7;
		int i_9;
		if (i_6 != 0) {
			i_7 = i_3 * 131586;
			if (i_6 == 256) {
				i_4 = i_7;
			} else {
				i_9 = 256 - i_6;
				i_4 = ((i_7 & 0xff00ff) * i_6 + (i_4 & 0xff00ff) * i_9 & ~0xff00ff) + (i_6 * (i_7 & 0xff00) + i_9 * (i_4 & 0xff00) & 0xff0000) >> 8;
			}
		}

		i_7 = class169_5.brightness & 0xff;
		if (i_7 != 0) {
			i_7 += 256;
			int i_8 = i_7 * ((i_4 & 0xff0000) >> 16);
			if (i_8 > 65535) {
				i_8 = 65535;
			}

			i_9 = i_7 * ((i_4 & 0xff00) >> 8);
			if (i_9 > 65535) {
				i_9 = 65535;
			}

			int i_10 = (i_4 & 0xff) * i_7;
			if (i_10 > 65535) {
				i_10 = 65535;
			}

			i_4 = (i_10 >> 8) + (i_9 & 0xff00) + (i_8 << 8 & 0xff0000);
		}

		return i_4;
	}

	public MeshRasterizer method11289(byte b_1, int i_2, boolean bool_3) {
		this.method13796(Thread.currentThread());
		boolean bool_4 = false;
		Class528_Sub2 class528_sub2_5;
		Class528_Sub2 class528_sub2_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub2_6 = this.aClass528_Sub2Array8645[b_1 - 1];
			class528_sub2_5 = this.aClass528_Sub2Array8626[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub2_5 = class528_sub2_6 = new Class528_Sub2(this.aClass505_Sub3_8638);
		}

		return this.method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
	}

	int method13800(int i_1) {
		if (i_1 < 2) {
			i_1 = 2;
		} else if (i_1 > 126) {
			i_1 = 126;
		}

		return i_1;
	}

	void method13801() {
		if (this.anInt8598 == 0) {
			this.method13853(false);
		} else if (this.aClass505_Sub3_8638.anInt9008 > 1) {
			synchronized (this) {
				this.method13802();
			}
		} else {
			this.method13802();
		}

	}

	void method13802() {
		for (int i_1 = 0; i_1 < this.anInt8586; i_1++) {
			short s_2 = this.aShortArray8603 != null ? this.aShortArray8603[i_1] : -1;
			if (s_2 == -1) {
				int i_3 = this.aShortArray8604[i_1] & 0xffff;
				int i_4 = (i_3 & 0x7f) * this.anInt8606 >> 7;
				short s_5 = Class372.method6362(i_3 & ~0x7f | i_4, 1473480576);
				int i_6;
				if (this.anIntArray8594[i_1] == -1) {
					i_6 = this.anIntArray8592[i_1] & ~0x1ffff;
					this.anIntArray8592[i_1] = i_6 | Class282_Sub20_Sub2.method15076(s_5, i_6 >> 17, -1901811732);
				} else if (this.anIntArray8594[i_1] != -2) {
					i_6 = this.anIntArray8592[i_1] & ~0x1ffff;
					this.anIntArray8592[i_1] = i_6 | Class282_Sub20_Sub2.method15076(s_5, i_6 >> 17, -1355323417);
					i_6 = this.anIntArray8631[i_1] & ~0x1ffff;
					this.anIntArray8631[i_1] = i_6 | Class282_Sub20_Sub2.method15076(s_5, i_6 >> 17, -1594902351);
					i_6 = this.anIntArray8594[i_1] & ~0x1ffff;
					this.anIntArray8594[i_1] = i_6 | Class282_Sub20_Sub2.method15076(s_5, i_6 >> 17, -2107311246);
				}
			}
		}

		this.anInt8598 = 2;
	}

	final boolean method13803(int i_1) {
		return this.anIntArray8643 == null ? false : this.anIntArray8643[i_1] != -1;
	}

	public Shadow dn(Shadow class282_sub50_sub17_1) {
		return null;
	}

	MeshRasterizer method13804(Class528_Sub2 class528_sub2_1, Class528_Sub2 class528_sub2_2, int i_3, boolean bool_4, boolean bool_5) {
		class528_sub2_1.aBool8621 = this.aBool8621;
		if (this.aBool8621) {
			class528_sub2_1.aShort8627 = this.aShort8627;
			class528_sub2_1.aShort8625 = this.aShort8625;
			class528_sub2_1.aShort8629 = this.aShort8629;
			class528_sub2_1.aShort8634 = this.aShort8634;
			class528_sub2_1.aShort8570 = this.aShort8570;
			class528_sub2_1.aShort8571 = this.aShort8571;
			class528_sub2_1.aShort8595 = this.aShort8595;
			class528_sub2_1.aShort8574 = this.aShort8574;
		}

		class528_sub2_1.anInt8606 = this.anInt8606;
		class528_sub2_1.anInt8577 = this.anInt8577;
		class528_sub2_1.anInt8578 = this.anInt8578;
		class528_sub2_1.anInt8579 = this.anInt8579;
		class528_sub2_1.anInt8586 = this.anInt8586;
		class528_sub2_1.anInt8617 = this.anInt8617;
		if ((i_3 & 0x100) != 0) {
			class528_sub2_1.aBool8630 = true;
		} else {
			class528_sub2_1.aBool8630 = this.aBool8630;
		}

		class528_sub2_1.aBool8640 = this.aBool8640;
		boolean bool_6 = (i_3 & 0x7) == 7 | (i_3 & 0x20) != 0;
		boolean bool_7 = bool_6 || (i_3 & 0x1) != 0;
		boolean bool_8 = bool_6 || (i_3 & 0x2) != 0;
		boolean bool_9 = bool_6 || (i_3 & 0x4) != 0 || (i_3 & 0x10) != 0;
		int i_10;
		if (!bool_7 && !bool_8 && !bool_9) {
			class528_sub2_1.anIntArray8580 = this.anIntArray8580;
			class528_sub2_1.anIntArray8581 = this.anIntArray8581;
			class528_sub2_1.anIntArray8610 = this.anIntArray8610;
		} else {
			if (!bool_7) {
				class528_sub2_1.anIntArray8580 = this.anIntArray8580;
			} else {
				if (class528_sub2_2.anIntArray8580 != null && class528_sub2_2.anIntArray8580.length >= this.anInt8578) {
					class528_sub2_1.anIntArray8580 = class528_sub2_2.anIntArray8580;
				} else {
					class528_sub2_1.anIntArray8580 = class528_sub2_2.anIntArray8580 = new int[this.anInt8578];
				}

				for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
					class528_sub2_1.anIntArray8580[i_10] = this.anIntArray8580[i_10];
				}
			}

			if (!bool_8) {
				class528_sub2_1.anIntArray8581 = this.anIntArray8581;
			} else {
				if (class528_sub2_2.anIntArray8581 != null && class528_sub2_2.anIntArray8581.length >= this.anInt8578) {
					class528_sub2_1.anIntArray8581 = class528_sub2_2.anIntArray8581;
				} else {
					class528_sub2_1.anIntArray8581 = class528_sub2_2.anIntArray8581 = new int[this.anInt8578];
				}

				for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
					class528_sub2_1.anIntArray8581[i_10] = this.anIntArray8581[i_10];
				}
			}

			if (bool_9) {
				if (class528_sub2_2.anIntArray8610 != null && class528_sub2_2.anIntArray8610.length >= this.anInt8578) {
					class528_sub2_1.anIntArray8610 = class528_sub2_2.anIntArray8610;
				} else {
					class528_sub2_1.anIntArray8610 = class528_sub2_2.anIntArray8610 = new int[this.anInt8578];
				}

				for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
					class528_sub2_1.anIntArray8610[i_10] = this.anIntArray8610[i_10];
				}
			} else {
				class528_sub2_1.anIntArray8610 = this.anIntArray8610;
			}
		}

		if ((i_3 & 0x84080) != 0) {
			if (class528_sub2_2.aShortArray8604 != null && class528_sub2_2.aShortArray8604.length >= this.anInt8586) {
				class528_sub2_1.aShortArray8604 = class528_sub2_2.aShortArray8604;
			} else {
				i_10 = this.anInt8586;
				class528_sub2_1.aShortArray8604 = class528_sub2_2.aShortArray8604 = new short[i_10];
			}

			for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
				class528_sub2_1.aShortArray8604[i_10] = this.aShortArray8604[i_10];
			}
		} else {
			class528_sub2_1.aShortArray8604 = this.aShortArray8604;
		}

		if ((i_3 & 0x97018) != 0) {
			class528_sub2_1.anInt8598 = 0;
			class528_sub2_1.anIntArray8594 = null;
			class528_sub2_1.anIntArray8631 = null;
			class528_sub2_1.anIntArray8592 = null;
		} else if ((i_3 & 0x80) != 0) {
			if (bool_5) {
				this.method13853(false);
			}

			if (this.anIntArray8592 != null) {
				if (class528_sub2_2.anIntArray8592 != null && class528_sub2_2.anIntArray8592.length >= this.anInt8586) {
					class528_sub2_1.anIntArray8592 = class528_sub2_2.anIntArray8592;
					class528_sub2_1.anIntArray8631 = class528_sub2_2.anIntArray8631;
					class528_sub2_1.anIntArray8594 = class528_sub2_2.anIntArray8594;
				} else {
					i_10 = this.anInt8586;
					class528_sub2_1.anIntArray8592 = class528_sub2_2.anIntArray8592 = new int[i_10];
					class528_sub2_1.anIntArray8631 = class528_sub2_2.anIntArray8631 = new int[i_10];
					class528_sub2_1.anIntArray8594 = class528_sub2_2.anIntArray8594 = new int[i_10];
				}

				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					class528_sub2_1.anIntArray8592[i_10] = this.anIntArray8592[i_10];
					class528_sub2_1.anIntArray8631[i_10] = this.anIntArray8631[i_10];
					class528_sub2_1.anIntArray8594[i_10] = this.anIntArray8594[i_10];
				}
			}

			class528_sub2_1.anInt8598 = this.anInt8598;
		} else {
			if (bool_5) {
				this.method13853(false);
			}

			class528_sub2_1.anIntArray8592 = this.anIntArray8592;
			class528_sub2_1.anIntArray8631 = this.anIntArray8631;
			class528_sub2_1.anIntArray8594 = this.anIntArray8594;
			class528_sub2_1.anInt8598 = this.anInt8598;
		}

		if ((i_3 & 0x100) != 0) {
			if (class528_sub2_2.aByteArray8602 != null && class528_sub2_2.aByteArray8602.length >= this.anInt8586) {
				class528_sub2_1.aByteArray8602 = class528_sub2_2.aByteArray8602;
			} else {
				i_10 = this.anInt8586;
				class528_sub2_1.aByteArray8602 = class528_sub2_2.aByteArray8602 = new byte[i_10];
			}

			if (this.aByteArray8602 != null) {
				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					class528_sub2_1.aByteArray8602[i_10] = this.aByteArray8602[i_10];
				}
			} else {
				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					class528_sub2_1.aByteArray8602[i_10] = 0;
				}
			}
		} else {
			class528_sub2_1.aByteArray8602 = this.aByteArray8602;
		}

		if ((i_3 & 0x8) == 0 && (i_3 & 0x10) == 0) {
			if (bool_5) {
				this.method13877();
			}

			class528_sub2_1.aClass189Array8584 = this.aClass189Array8584;
			class528_sub2_1.aClass195Array8599 = this.aClass195Array8599;
		} else {
			if (class528_sub2_2.aClass189Array8584 != null && class528_sub2_2.aClass189Array8584.length >= this.anInt8579) {
				class528_sub2_1.aClass189Array8584 = class528_sub2_2.aClass189Array8584;
			} else {
				i_10 = this.anInt8579;
				class528_sub2_1.aClass189Array8584 = class528_sub2_2.aClass189Array8584 = new Class189[i_10];
			}

			if (this.aClass189Array8584 != null) {
				for (i_10 = 0; i_10 < this.anInt8579; i_10++) {
					class528_sub2_1.aClass189Array8584[i_10] = new Class189(this.aClass189Array8584[i_10]);
				}
			} else {
				class528_sub2_1.aClass189Array8584 = null;
			}

			if (this.aClass195Array8599 != null) {
				if (class528_sub2_2.aClass195Array8599 != null && class528_sub2_2.aClass195Array8599.length >= this.anInt8586) {
					class528_sub2_1.aClass195Array8599 = class528_sub2_2.aClass195Array8599;
				} else {
					i_10 = this.anInt8586;
					class528_sub2_1.aClass195Array8599 = class528_sub2_2.aClass195Array8599 = new Class195[i_10];
				}

				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					class528_sub2_1.aClass195Array8599[i_10] = this.aClass195Array8599[i_10] != null ? new Class195(this.aClass195Array8599[i_10]) : null;
				}
			} else {
				class528_sub2_1.aClass195Array8599 = null;
			}
		}

		if ((i_3 & 0x8000) != 0) {
			if (this.aShortArray8603 == null) {
				class528_sub2_1.aShortArray8603 = null;
			} else {
				if (class528_sub2_2.aShortArray8603 != null && class528_sub2_2.aShortArray8603.length >= this.anInt8586) {
					class528_sub2_1.aShortArray8603 = class528_sub2_2.aShortArray8603;
				} else {
					i_10 = this.anInt8586;
					class528_sub2_1.aShortArray8603 = class528_sub2_2.aShortArray8603 = new short[i_10];
				}

				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					class528_sub2_1.aShortArray8603[i_10] = this.aShortArray8603[i_10];
				}
			}
		} else {
			class528_sub2_1.aShortArray8603 = this.aShortArray8603;
		}

		if ((i_3 & 0x10000) != 0) {
			if (this.aByteArray8600 == null) {
				class528_sub2_1.aByteArray8600 = null;
			} else {
				if (class528_sub2_2.aByteArray8600 != null && class528_sub2_2.aByteArray8600.length >= this.anInt8586) {
					class528_sub2_1.aByteArray8600 = class528_sub2_2.aByteArray8600;
				} else {
					i_10 = bool_4 ? this.anInt8586 + 100 : this.anInt8586;
					class528_sub2_1.aByteArray8600 = class528_sub2_2.aByteArray8600 = new byte[i_10];
				}

				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					class528_sub2_1.aByteArray8600[i_10] = this.aByteArray8600[i_10];
				}
			}
		} else {
			class528_sub2_1.aByteArray8600 = this.aByteArray8600;
		}

		if ((i_3 & 0xc580) != 0) {
			if (class528_sub2_2.aClass176Array8582 != null && class528_sub2_2.aClass176Array8582.length >= this.anInt8617) {
				class528_sub2_1.aClass176Array8582 = class528_sub2_2.aClass176Array8582;

				for (i_10 = 0; i_10 < this.anInt8617; i_10++) {
					class528_sub2_1.aClass176Array8582[i_10].method2968(this.aClass176Array8582[i_10]);
				}
			} else {
				i_10 = this.anInt8617;
				class528_sub2_1.aClass176Array8582 = class528_sub2_2.aClass176Array8582 = new Class176[i_10];

				for (int i_13 = 0; i_13 < this.anInt8617; i_13++) {
					class528_sub2_1.aClass176Array8582[i_13] = this.aClass176Array8582[i_13].method2972();
				}
			}
		} else {
			class528_sub2_1.aClass176Array8582 = this.aClass176Array8582;
		}

		if (this.aFloatArrayArray8635 != null && (i_3 & 0x10) != 0) {
			if (class528_sub2_2.aFloatArrayArray8635 != null && class528_sub2_2.aFloatArrayArray8635.length >= this.anInt8586) {
				class528_sub2_1.aFloatArrayArray8635 = class528_sub2_2.aFloatArrayArray8635;
			} else {
				i_10 = bool_4 ? this.anInt8586 + 100 : this.anInt8586;
				class528_sub2_1.aFloatArrayArray8635 = class528_sub2_2.aFloatArrayArray8635 = new float[i_10][3];
			}

			for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
				if (this.aFloatArrayArray8635[i_10] != null) {
					class528_sub2_1.aFloatArrayArray8635[i_10][0] = this.aFloatArrayArray8635[i_10][0];
					class528_sub2_1.aFloatArrayArray8635[i_10][1] = this.aFloatArrayArray8635[i_10][1];
					class528_sub2_1.aFloatArrayArray8635[i_10][2] = this.aFloatArrayArray8635[i_10][2];
				}
			}

			if (class528_sub2_2.aFloatArrayArray8591 != null && class528_sub2_2.aFloatArrayArray8591.length >= this.anInt8586) {
				class528_sub2_1.aFloatArrayArray8591 = class528_sub2_2.aFloatArrayArray8591;
			} else {
				i_10 = bool_4 ? this.anInt8586 + 100 : this.anInt8586;
				class528_sub2_1.aFloatArrayArray8591 = class528_sub2_2.aFloatArrayArray8591 = new float[i_10][3];
			}

			for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
				if (this.aFloatArrayArray8591[i_10] != null) {
					class528_sub2_1.aFloatArrayArray8591[i_10][0] = this.aFloatArrayArray8591[i_10][0];
					class528_sub2_1.aFloatArrayArray8591[i_10][1] = this.aFloatArrayArray8591[i_10][1];
					class528_sub2_1.aFloatArrayArray8591[i_10][2] = this.aFloatArrayArray8591[i_10][2];
				}
			}
		} else {
			class528_sub2_1.aFloatArrayArray8635 = this.aFloatArrayArray8635;
			class528_sub2_1.aFloatArrayArray8591 = this.aFloatArrayArray8591;
		}

		class528_sub2_1.anIntArrayArray8568 = this.anIntArrayArray8568;
		class528_sub2_1.anIntArrayArray8608 = this.anIntArrayArray8608;
		class528_sub2_1.anIntArrayArray8620 = this.anIntArrayArray8620;
		class528_sub2_1.aShortArray8569 = this.aShortArray8569;
		class528_sub2_1.aShortArray8632 = this.aShortArray8632;
		class528_sub2_1.aByteArray8601 = this.aByteArray8601;
		class528_sub2_1.aShortArray8587 = this.aShortArray8587;
		class528_sub2_1.aShortArray8588 = this.aShortArray8588;
		class528_sub2_1.aShortArray8642 = this.aShortArray8642;
		class528_sub2_1.aClass87Array8615 = this.aClass87Array8615;
		class528_sub2_1.aClass172Array8616 = this.aClass172Array8616;
		class528_sub2_1.aClass193Array8618 = this.aClass193Array8618;
		class528_sub2_1.aShortArray8623 = this.aShortArray8623;
		class528_sub2_1.anInt8575 = i_3;
		return class528_sub2_1;
	}

	public int m() {
		return this.anInt8575;
	}

	public void method11293(Matrix44Var matrix44var_1, Class275_Sub5 class275_sub5_2, int i_3) {
		this.method13814(matrix44var_1, class275_sub5_2, i_3);
	}

	public void method11259() {
	}

	public void f(int i_1) {
		if ((this.anInt8575 & 0x5) != 5) {
			throw new IllegalStateException();
		} else {
			if (i_1 == 4096) {
				this.method13805();
			} else if (i_1 == 8192) {
				this.method13806();
			} else if (i_1 == 12288) {
				this.method13807();
			} else {
				int i_2 = Class382.anIntArray4657[i_1];
				int i_3 = Class382.anIntArray4661[i_1];
				synchronized (this) {
					for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
						int i_6 = i_2 * this.anIntArray8610[i_5] + i_3 * this.anIntArray8580[i_5] >> 14;
						this.anIntArray8610[i_5] = i_3 * this.anIntArray8610[i_5] - i_2 * this.anIntArray8580[i_5] >> 14;
						this.anIntArray8580[i_5] = i_6;
					}

					this.method13812();
				}
			}

		}
	}

	public void S(int i_1) {
		if ((this.anInt8575 & 0xd) != 13) {
			throw new IllegalStateException();
		} else {
			if (this.aClass189Array8584 != null) {
				if (i_1 == 4096) {
					this.method13850();
				} else if (i_1 == 8192) {
					this.method13809();
				} else if (i_1 == 12288) {
					this.method13810();
				} else {
					int i_2 = Class382.anIntArray4657[i_1];
					int i_3 = Class382.anIntArray4661[i_1];
					synchronized (this) {
						int i_5;
						int i_6;
						for (i_5 = 0; i_5 < this.anInt8579; i_5++) {
							i_6 = i_2 * this.anIntArray8610[i_5] + i_3 * this.anIntArray8580[i_5] >> 14;
							this.anIntArray8610[i_5] = i_3 * this.anIntArray8610[i_5] - i_2 * this.anIntArray8580[i_5] >> 14;
							this.anIntArray8580[i_5] = i_6;
							if (this.aClass189Array8584[i_5] != null) {
								i_6 = i_2 * this.aClass189Array8584[i_5].anInt2379 + i_3 * this.aClass189Array8584[i_5].anInt2380 >> 14;
								this.aClass189Array8584[i_5].anInt2379 = i_3 * this.aClass189Array8584[i_5].anInt2379 - i_2 * this.aClass189Array8584[i_5].anInt2380 >> 14;
								this.aClass189Array8584[i_5].anInt2380 = i_6;
							}
						}

						if (this.aClass195Array8599 != null) {
							for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
								if (this.aClass195Array8599[i_5] != null) {
									i_6 = i_2 * this.aClass195Array8599[i_5].anInt2412 + i_3 * this.aClass195Array8599[i_5].anInt2410 >> 14;
									this.aClass195Array8599[i_5].anInt2412 = i_3 * this.aClass195Array8599[i_5].anInt2412 - i_2 * this.aClass195Array8599[i_5].anInt2410 >> 14;
									this.aClass195Array8599[i_5].anInt2410 = i_6;
								}
							}
						}

						for (i_5 = this.anInt8579; i_5 < this.anInt8578; i_5++) {
							i_6 = i_2 * this.anIntArray8610[i_5] + i_3 * this.anIntArray8580[i_5] >> 14;
							this.anIntArray8610[i_5] = i_3 * this.anIntArray8610[i_5] - i_2 * this.anIntArray8580[i_5] >> 14;
							this.anIntArray8580[i_5] = i_6;
						}

						this.anInt8598 = 0;
						this.aBool8621 = false;
					}
				}
			} else {
				this.f(i_1);
			}

		}
	}

	void method13805() {
		synchronized (this) {
			for (int i_2 = 0; i_2 < this.anInt8578; i_2++) {
				int i_3 = this.anIntArray8580[i_2];
				this.anIntArray8580[i_2] = this.anIntArray8610[i_2];
				this.anIntArray8610[i_2] = -i_3;
			}

			this.method13812();
		}
	}

	void method13806() {
		synchronized (this) {
			for (int i_2 = 0; i_2 < this.anInt8578; i_2++) {
				this.anIntArray8580[i_2] = -this.anIntArray8580[i_2];
				this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
			}

			this.method13812();
		}
	}

	void method13807() {
		synchronized (this) {
			for (int i_2 = 0; i_2 < this.anInt8578; i_2++) {
				int i_3 = this.anIntArray8610[i_2];
				this.anIntArray8610[i_2] = this.anIntArray8580[i_2];
				this.anIntArray8580[i_2] = -i_3;
			}

			this.method13812();
		}
	}

	void method13809() {
		synchronized (this) {
			int i_2;
			for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
				this.anIntArray8580[i_2] = -this.anIntArray8580[i_2];
				this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
				if (this.aClass189Array8584[i_2] != null) {
					this.aClass189Array8584[i_2].anInt2380 = -this.aClass189Array8584[i_2].anInt2380;
					this.aClass189Array8584[i_2].anInt2379 = -this.aClass189Array8584[i_2].anInt2379;
				}
			}

			if (this.aClass195Array8599 != null) {
				for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
					if (this.aClass195Array8599[i_2] != null) {
						this.aClass195Array8599[i_2].anInt2410 = -this.aClass195Array8599[i_2].anInt2410;
						this.aClass195Array8599[i_2].anInt2412 = -this.aClass195Array8599[i_2].anInt2412;
					}
				}
			}

			for (i_2 = this.anInt8579; i_2 < this.anInt8578; i_2++) {
				this.anIntArray8580[i_2] = -this.anIntArray8580[i_2];
				this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
			}

			this.anInt8598 = 0;
			this.aBool8621 = false;
		}
	}

	void method13810() {
		synchronized (this) {
			int i_2;
			int i_3;
			for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
				i_3 = this.anIntArray8610[i_2];
				this.anIntArray8610[i_2] = this.anIntArray8580[i_2];
				this.anIntArray8580[i_2] = -i_3;
				if (this.aClass189Array8584[i_2] != null) {
					i_3 = this.aClass189Array8584[i_2].anInt2379;
					this.aClass189Array8584[i_2].anInt2379 = this.aClass189Array8584[i_2].anInt2380;
					this.aClass189Array8584[i_2].anInt2380 = -i_3;
				}
			}

			if (this.aClass195Array8599 != null) {
				for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
					if (this.aClass195Array8599[i_2] != null) {
						i_3 = this.aClass195Array8599[i_2].anInt2412;
						this.aClass195Array8599[i_2].anInt2412 = this.aClass195Array8599[i_2].anInt2410;
						this.aClass195Array8599[i_2].anInt2410 = -i_3;
					}
				}
			}

			for (i_2 = this.anInt8579; i_2 < this.anInt8578; i_2++) {
				i_3 = this.anIntArray8610[i_2];
				this.anIntArray8610[i_2] = this.anIntArray8580[i_2];
				this.anIntArray8580[i_2] = -i_3;
			}

			this.anInt8598 = 0;
			this.aBool8621 = false;
		}
	}

	public void t(int i_1) {
		if ((this.anInt8575 & 0x6) != 6) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = i_3 * this.anIntArray8581[i_5] - i_2 * this.anIntArray8610[i_5] >> 14;
					this.anIntArray8610[i_5] = i_2 * this.anIntArray8581[i_5] + i_3 * this.anIntArray8610[i_5] >> 14;
					this.anIntArray8581[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void EA(int i_1) {
		if ((this.anInt8575 & 0x3) != 3) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = i_2 * this.anIntArray8581[i_5] + i_3 * this.anIntArray8580[i_5] >> 14;
					this.anIntArray8581[i_5] = i_3 * this.anIntArray8581[i_5] - i_2 * this.anIntArray8580[i_5] >> 14;
					this.anIntArray8580[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void wa() {
		if ((this.anInt8575 & 0x10) != 16) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				int i_2;
				for (i_2 = 0; i_2 < this.anInt8578; i_2++) {
					this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
				}

				if (this.aClass189Array8584 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8584[i_2] != null) {
							this.aClass189Array8584[i_2].anInt2379 = -this.aClass189Array8584[i_2].anInt2379;
						}
					}
				}

				if (this.aClass189Array8585 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8585[i_2] != null) {
							this.aClass189Array8585[i_2].anInt2379 = -this.aClass189Array8585[i_2].anInt2379;
						}
					}
				}

				if (this.aClass195Array8599 != null) {
					for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
						if (this.aClass195Array8599[i_2] != null) {
							this.aClass195Array8599[i_2].anInt2412 = -this.aClass195Array8599[i_2].anInt2412;
						}
					}
				}

				short[] shorts_5 = this.aShortArray8587;
				this.aShortArray8587 = this.aShortArray8642;
				this.aShortArray8642 = shorts_5;
				if (this.aFloatArrayArray8635 != null) {
					for (int i_3 = 0; i_3 < this.anInt8586; i_3++) {
						float f_4;
						if (this.aFloatArrayArray8635[i_3] != null) {
							f_4 = this.aFloatArrayArray8635[i_3][0];
							this.aFloatArrayArray8635[i_3][0] = this.aFloatArrayArray8635[i_3][2];
							this.aFloatArrayArray8635[i_3][2] = f_4;
						}

						if (this.aFloatArrayArray8591[i_3] != null) {
							f_4 = this.aFloatArrayArray8591[i_3][0];
							this.aFloatArrayArray8591[i_3][0] = this.aFloatArrayArray8591[i_3][2];
							this.aFloatArrayArray8591[i_3][2] = f_4;
						}
					}
				}

				this.aBool8621 = false;
				this.anInt8598 = 0;
			}
		}
	}

	public void oa(int i_1, int i_2, int i_3) {
		if (i_1 != 128 && (this.anInt8575 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (i_2 != 128 && (this.anInt8575 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (i_3 != 128 && (this.anInt8575 & 0x4) != 4) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] = this.anIntArray8580[i_5] * i_1 >> 7;
					this.anIntArray8581[i_5] = i_2 * this.anIntArray8581[i_5] >> 7;
					this.anIntArray8610[i_5] = i_3 * this.anIntArray8610[i_5] >> 7;
				}

				this.aBool8621 = false;
			}
		}
	}

	void bp() {
		if (this.aBool8589) {
			for (int i_1 = 0; i_1 < this.anInt8578; i_1++) {
				this.anIntArray8580[i_1] = this.anIntArray8580[i_1] + 7 >> 4;
				this.anIntArray8581[i_1] = this.anIntArray8581[i_1] + 7 >> 4;
				this.anIntArray8610[i_1] = this.anIntArray8610[i_1] + 7 >> 4;
			}

			this.aBool8589 = false;
		}

		if (this.aBool8609) {
			this.method13801();
			this.aBool8609 = false;
		}

		this.aBool8621 = false;
	}

	void method13812() {
		this.aClass189Array8584 = null;
		this.aClass189Array8585 = null;
		this.aClass195Array8599 = null;
		this.aBool8621 = false;
	}

	public void method11273(Matrix44Var matrix44var_1) {
		this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Matrix44Arr matrix44arr_2 = this.aClass185_8564.aClass384_2317;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (this.aClass87Array8615 != null) {
			for (i_3 = 0; i_3 < this.aClass87Array8615.length; i_3++) {
				Surface class87_4 = this.aClass87Array8615[i_3];
				Surface class87_5 = class87_4;
				if (class87_4.aClass87_835 != null) {
					class87_5 = class87_4.aClass87_835;
				}

				class87_5.anInt844 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt836] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt836] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt836]);
				class87_5.anInt841 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt836] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt836] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt836]);
				class87_5.anInt847 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt836] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt836] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt836]);
				class87_5.anInt834 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt837] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt837] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt837]);
				class87_5.anInt843 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt837] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt837] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt837]);
				class87_5.anInt845 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt837] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt837] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt837]);
				class87_5.anInt846 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt838] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt838] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt838]);
				class87_5.anInt840 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt838] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt838] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt838]);
				class87_5.anInt848 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt838] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt838] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt838]);
			}
		}

		if (this.aClass172Array8616 != null) {
			for (i_3 = 0; i_3 < this.aClass172Array8616.length; i_3++) {
				SurfaceSkin class172_6 = this.aClass172Array8616[i_3];
				SurfaceSkin class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null) {
					class172_7 = class172_6.aClass172_2114;
				}

				if (class172_6.aClass384_2116 != null) {
					class172_6.aClass384_2116.method6562(matrix44arr_2);
				} else {
					class172_6.aClass384_2116 = new Matrix44Arr(matrix44arr_2);
				}

				class172_7.anInt2113 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class172_6.anInt2119] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class172_6.anInt2119] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class172_6.anInt2119]);
				class172_7.anInt2117 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class172_6.anInt2119] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class172_6.anInt2119] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class172_6.anInt2119]);
				class172_7.anInt2118 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class172_6.anInt2119] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class172_6.anInt2119] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class172_6.anInt2119]);
			}
		}

	}

	void method11261() {
		if (this.aClass505_Sub3_8638.anInt9008 > 1) {
			synchronized (this) {
				this.aBool7023 = false;
				this.notifyAll();
			}
		}

	}

	void ka() {
		if (this.aBool8589) {
			for (int i_1 = 0; i_1 < this.anInt8578; i_1++) {
				this.anIntArray8580[i_1] = this.anIntArray8580[i_1] + 7 >> 4;
				this.anIntArray8581[i_1] = this.anIntArray8581[i_1] + 7 >> 4;
				this.anIntArray8610[i_1] = this.anIntArray8610[i_1] + 7 >> 4;
			}

			this.aBool8589 = false;
		}

		if (this.aBool8609) {
			this.method13801();
			this.aBool8609 = false;
		}

		this.aBool8621 = false;
	}

	void method11268(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		int i_8 = ints_2.length;
		int i_9;
		int i_10;
		int i_13;
		int i_14;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			if (!this.aBool8589) {
				for (i_9 = 0; i_9 < this.anInt8578; i_9++) {
					this.anIntArray8580[i_9] <<= 4;
					this.anIntArray8581[i_9] <<= 4;
					this.anIntArray8610[i_9] <<= 4;
				}

				this.aBool8589 = true;
			}

			i_9 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_10 = 0; i_10 < i_8; i_10++) {
				int i_11 = ints_2[i_10];
				if (i_11 < this.anIntArrayArray8568.length) {
					int[] ints_12 = this.anIntArrayArray8568[i_11];

					for (i_13 = 0; i_13 < ints_12.length; i_13++) {
						i_14 = ints_12[i_13];
						this.anInt8611 += this.anIntArray8580[i_14];
						this.anInt8607 += this.anIntArray8581[i_14];
						this.anInt8613 += this.anIntArray8610[i_14];
						++i_9;
					}
				}
			}

			if (i_9 > 0) {
				this.anInt8611 = i_3 + this.anInt8611 / i_9;
				this.anInt8607 = this.anInt8607 / i_9 + i_4;
				this.anInt8613 = i_5 + this.anInt8613 / i_9;
			} else {
				this.anInt8611 = i_3;
				this.anInt8607 = i_4;
				this.anInt8613 = i_5;
			}
		} else {
			int[] ints_18;
			int i_19;
			if (i_1 == 1) {
				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;
				if (!this.aBool8589) {
					for (i_9 = 0; i_9 < this.anInt8578; i_9++) {
						this.anIntArray8580[i_9] <<= 4;
						this.anIntArray8581[i_9] <<= 4;
						this.anIntArray8610[i_9] <<= 4;
					}

					this.aBool8589 = true;
				}

				for (i_9 = 0; i_9 < i_8; i_9++) {
					i_10 = ints_2[i_9];
					if (i_10 < this.anIntArrayArray8568.length) {
						ints_18 = this.anIntArrayArray8568[i_10];

						for (i_19 = 0; i_19 < ints_18.length; i_19++) {
							i_13 = ints_18[i_19];
							this.anIntArray8580[i_13] += i_3;
							this.anIntArray8581[i_13] += i_4;
							this.anIntArray8610[i_13] += i_5;
						}
					}
				}
			} else {
				int i_15;
				int i_16;
				if (i_1 == 2) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8568.length) {
							ints_18 = this.anIntArrayArray8568[i_10];
							if ((i_6 & 0x1) == 0) {
								for (i_19 = 0; i_19 < ints_18.length; i_19++) {
									i_13 = ints_18[i_19];
									this.anIntArray8580[i_13] -= this.anInt8611;
									this.anIntArray8581[i_13] -= this.anInt8607;
									this.anIntArray8610[i_13] -= this.anInt8613;
									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = i_14 * this.anIntArray8581[i_13] + i_15 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8581[i_13] = i_15 * this.anIntArray8581[i_13] - i_14 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = i_15 * this.anIntArray8581[i_13] - i_14 * this.anIntArray8610[i_13] + 16383 >> 14;
										this.anIntArray8610[i_13] = i_14 * this.anIntArray8581[i_13] + i_15 * this.anIntArray8610[i_13] + 16383 >> 14;
										this.anIntArray8581[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = i_14 * this.anIntArray8610[i_13] + i_15 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8610[i_13] = i_15 * this.anIntArray8610[i_13] - i_14 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									this.anIntArray8580[i_13] += this.anInt8611;
									this.anIntArray8581[i_13] += this.anInt8607;
									this.anIntArray8610[i_13] += this.anInt8613;
								}
							} else {
								for (i_19 = 0; i_19 < ints_18.length; i_19++) {
									i_13 = ints_18[i_19];
									this.anIntArray8580[i_13] -= this.anInt8611;
									this.anIntArray8581[i_13] -= this.anInt8607;
									this.anIntArray8610[i_13] -= this.anInt8613;
									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = i_15 * this.anIntArray8581[i_13] - i_14 * this.anIntArray8610[i_13] + 16383 >> 14;
										this.anIntArray8610[i_13] = i_14 * this.anIntArray8581[i_13] + i_15 * this.anIntArray8610[i_13] + 16383 >> 14;
										this.anIntArray8581[i_13] = i_16;
									}

									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = i_14 * this.anIntArray8581[i_13] + i_15 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8581[i_13] = i_15 * this.anIntArray8581[i_13] - i_14 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = i_14 * this.anIntArray8610[i_13] + i_15 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8610[i_13] = i_15 * this.anIntArray8610[i_13] - i_14 * this.anIntArray8580[i_13] + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									this.anIntArray8580[i_13] += this.anInt8611;
									this.anIntArray8581[i_13] += this.anInt8607;
									this.anIntArray8610[i_13] += this.anInt8613;
								}
							}
						}
					}
				} else if (i_1 == 3) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8568.length) {
							ints_18 = this.anIntArrayArray8568[i_10];

							for (i_19 = 0; i_19 < ints_18.length; i_19++) {
								i_13 = ints_18[i_19];
								this.anIntArray8580[i_13] -= this.anInt8611;
								this.anIntArray8581[i_13] -= this.anInt8607;
								this.anIntArray8610[i_13] -= this.anInt8613;
								this.anIntArray8580[i_13] = i_3 * this.anIntArray8580[i_13] / 128;
								this.anIntArray8581[i_13] = i_4 * this.anIntArray8581[i_13] / 128;
								this.anIntArray8610[i_13] = i_5 * this.anIntArray8610[i_13] / 128;
								this.anIntArray8580[i_13] += this.anInt8611;
								this.anIntArray8581[i_13] += this.anInt8607;
								this.anIntArray8610[i_13] += this.anInt8613;
							}
						}
					}
				} else {
					Class193 class193_20;
					Class176 class176_22;
					if (i_1 == 5) {
						if (this.anIntArrayArray8608 != null && this.aByteArray8602 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8608.length) {
									ints_18 = this.anIntArrayArray8608[i_10];

									for (i_19 = 0; i_19 < ints_18.length; i_19++) {
										i_13 = ints_18[i_19];
										i_14 = (this.aByteArray8602[i_13] & 0xff) + i_3 * 8;
										if (i_14 < 0) {
											i_14 = 0;
										} else if (i_14 > 255) {
											i_14 = 255;
										}

										this.aByteArray8602[i_13] = (byte) i_14;
									}
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_9 = 0; i_9 < this.anInt8617; i_9++) {
									class193_20 = this.aClass193Array8618[i_9];
									class176_22 = this.aClass176Array8582[i_9];
									class176_22.anInt2199 = class176_22.anInt2199 & 0xffffff | 255 - (this.aByteArray8602[class193_20.anInt2393] & 0xff) << 24;
								}
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8608 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8608.length) {
									ints_18 = this.anIntArrayArray8608[i_10];

									for (i_19 = 0; i_19 < ints_18.length; i_19++) {
										i_13 = ints_18[i_19];
										i_14 = this.aShortArray8604[i_13] & 0xffff;
										i_15 = i_14 >> 10 & 0x3f;
										i_16 = i_14 >> 7 & 0x7;
										int i_17 = i_14 & 0x7f;
										i_15 = i_3 + i_15 & 0x3f;
										i_16 += i_4;
										if (i_16 < 0) {
											i_16 = 0;
										} else if (i_16 > 7) {
											i_16 = 7;
										}

										i_17 += i_5;
										if (i_17 < 0) {
											i_17 = 0;
										} else if (i_17 > 127) {
											i_17 = 127;
										}

										this.aShortArray8604[i_13] = (short) (i_15 << 10 | i_16 << 7 | i_17);
									}

									this.aBool8609 = true;
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_9 = 0; i_9 < this.anInt8617; i_9++) {
									class193_20 = this.aClass193Array8618[i_9];
									class176_22 = this.aClass176Array8582[i_9];
									class176_22.anInt2199 = class176_22.anInt2199 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_20.anInt2393] & 0xffff, 1563168236) & 0xffff] & 0xffffff;
								}
							}
						}
					} else {
						Class176 class176_21;
						if (i_1 == 8) {
							if (this.anIntArrayArray8620 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8620.length) {
										ints_18 = this.anIntArrayArray8620[i_10];

										for (i_19 = 0; i_19 < ints_18.length; i_19++) {
											class176_21 = this.aClass176Array8582[ints_18[i_19]];
											class176_21.anInt2192 += i_3;
											class176_21.anInt2189 += i_4;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8620 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8620.length) {
										ints_18 = this.anIntArrayArray8620[i_10];

										for (i_19 = 0; i_19 < ints_18.length; i_19++) {
											class176_21 = this.aClass176Array8582[ints_18[i_19]];
											class176_21.aFloat2190 = class176_21.aFloat2190 * (float) i_3 / 128.0F;
											class176_21.aFloat2191 = class176_21.aFloat2191 * (float) i_4 / 128.0F;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8620 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8620.length) {
									ints_18 = this.anIntArrayArray8620[i_10];

									for (i_19 = 0; i_19 < ints_18.length; i_19++) {
										class176_21 = this.aClass176Array8582[ints_18[i_19]];
										class176_21.anInt2194 = i_3 + class176_21.anInt2194 & 0x3fff;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	void e(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
		int i_9 = ints_2.length;
		int i_10;
		int i_11;
		int i_12;
		int i_14;
		int i_15;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			if (!this.aBool8589) {
				for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
					this.anIntArray8580[i_10] <<= 4;
					this.anIntArray8581[i_10] <<= 4;
					this.anIntArray8610[i_10] <<= 4;
				}

				this.aBool8589 = true;
			}

			i_10 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_11 = 0; i_11 < i_9; i_11++) {
				i_12 = ints_2[i_11];
				if (i_12 < this.anIntArrayArray8568.length) {
					int[] ints_13 = this.anIntArrayArray8568[i_12];

					for (i_14 = 0; i_14 < ints_13.length; i_14++) {
						i_15 = ints_13[i_14];
						if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_15]) != 0) {
							this.anInt8611 += this.anIntArray8580[i_15];
							this.anInt8607 += this.anIntArray8581[i_15];
							this.anInt8613 += this.anIntArray8610[i_15];
							++i_10;
						}
					}
				}
			}

			if (i_10 > 0) {
				this.anInt8611 = i_3 + this.anInt8611 / i_10;
				this.anInt8607 = this.anInt8607 / i_10 + i_4;
				this.anInt8613 = i_5 + this.anInt8613 / i_10;
				this.aBool8614 = true;
			} else {
				this.anInt8611 = i_3;
				this.anInt8607 = i_4;
				this.anInt8613 = i_5;
			}
		} else {
			int i_47;
			int[] ints_49;
			if (i_1 == 1) {
				if (ints_8 != null) {
					i_10 = i_5 * ints_8[2] + ints_8[1] * i_4 + i_3 * ints_8[0] + 8192 >> 14;
					i_11 = i_3 * ints_8[3] + i_5 * ints_8[5] + i_4 * ints_8[4] + 8192 >> 14;
					i_12 = i_3 * ints_8[6] + ints_8[7] * i_4 + i_5 * ints_8[8] + 8192 >> 14;
					i_3 = i_10;
					i_4 = i_11;
					i_5 = i_12;
				}

				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;
				if (!this.aBool8589) {
					for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
						this.anIntArray8580[i_10] <<= 4;
						this.anIntArray8581[i_10] <<= 4;
						this.anIntArray8610[i_10] <<= 4;
					}

					this.aBool8589 = true;
				}

				for (i_10 = 0; i_10 < i_9; i_10++) {
					i_11 = ints_2[i_10];
					if (i_11 < this.anIntArrayArray8568.length) {
						ints_49 = this.anIntArrayArray8568[i_11];

						for (i_47 = 0; i_47 < ints_49.length; i_47++) {
							i_14 = ints_49[i_47];
							if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_14]) != 0) {
								this.anIntArray8580[i_14] += i_3;
								this.anIntArray8581[i_14] += i_4;
								this.anIntArray8610[i_14] += i_5;
							}
						}
					}
				}
			} else {
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_26;
				int i_27;
				int i_28;
				int i_30;
				int i_32;
				int i_33;
				int i_34;
				int[] ints_35;
				int i_36;
				int i_37;
				int i_38;
				int i_39;
				int i_40;
				if (i_1 == 2) {
					if (ints_8 != null) {
						if (!this.aBool8589) {
							for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
								this.anIntArray8580[i_10] <<= 4;
								this.anIntArray8581[i_10] <<= 4;
								this.anIntArray8610[i_10] <<= 4;
							}

							this.aBool8589 = true;
						}

						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_47 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (this.aBool8614) {
							i_16 = ints_8[6] * this.anInt8613 + ints_8[3] * this.anInt8607 + this.anInt8611 * ints_8[0] + 8192 >> 14;
							i_17 = ints_8[7] * this.anInt8613 + ints_8[1] * this.anInt8611 + ints_8[4] * this.anInt8607 + 8192 >> 14;
							i_18 = ints_8[8] * this.anInt8613 + ints_8[2] * this.anInt8611 + ints_8[5] * this.anInt8607 + 8192 >> 14;
							i_16 += i_47;
							i_17 += i_14;
							i_18 += i_15;
							this.anInt8611 = i_16;
							this.anInt8607 = i_17;
							this.anInt8613 = i_18;
							this.aBool8614 = false;
						}

						int[] ints_48 = new int[9];
						i_17 = Class382.anIntArray4661[i_3];
						i_18 = Class382.anIntArray4657[i_3];
						i_19 = Class382.anIntArray4661[i_4];
						i_20 = Class382.anIntArray4657[i_4];
						i_21 = Class382.anIntArray4661[i_5];
						i_22 = Class382.anIntArray4657[i_5];
						i_23 = i_18 * i_21 + 8192 >> 14;
						i_24 = i_18 * i_22 + 8192 >> 14;
						ints_48[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
						ints_48[1] = i_20 * i_23 + -i_19 * i_22 + 8192 >> 14;
						ints_48[2] = i_20 * i_17 + 8192 >> 14;
						ints_48[3] = i_17 * i_22 + 8192 >> 14;
						ints_48[4] = i_17 * i_21 + 8192 >> 14;
						ints_48[5] = -i_18;
						ints_48[6] = i_19 * i_24 + -i_20 * i_21 + 8192 >> 14;
						ints_48[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
						ints_48[8] = i_19 * i_17 + 8192 >> 14;
						int i_25 = ints_48[2] * -this.anInt8613 + ints_48[0] * -this.anInt8611 + ints_48[1] * -this.anInt8607 + 8192 >> 14;
						i_26 = ints_48[5] * -this.anInt8613 + ints_48[4] * -this.anInt8607 + ints_48[3] * -this.anInt8611 + 8192 >> 14;
						i_27 = ints_48[6] * -this.anInt8611 + ints_48[8] * -this.anInt8613 + ints_48[7] * -this.anInt8607 + 8192 >> 14;
						i_28 = i_25 + this.anInt8611;
						int i_29 = i_26 + this.anInt8607;
						i_30 = i_27 + this.anInt8613;
						int[] ints_31 = new int[9];

						for (i_32 = 0; i_32 < 3; i_32++) {
							for (i_33 = 0; i_33 < 3; i_33++) {
								i_34 = 0;

								for (int i_54 = 0; i_54 < 3; i_54++) {
									i_34 += ints_8[i_54 + i_33 * 3] * ints_48[i_54 + i_32 * 3];
								}

								ints_31[i_33 + i_32 * 3] = i_34 + 8192 >> 14;
							}
						}

						i_32 = i_14 * ints_48[1] + i_47 * ints_48[0] + i_15 * ints_48[2] + 8192 >> 14;
						i_33 = i_14 * ints_48[4] + i_47 * ints_48[3] + i_15 * ints_48[5] + 8192 >> 14;
						i_34 = ints_48[6] * i_47 + i_15 * ints_48[8] + ints_48[7] * i_14 + 8192 >> 14;
						i_32 += i_28;
						i_33 += i_29;
						i_34 += i_30;
						ints_35 = new int[9];

						for (i_36 = 0; i_36 < 3; i_36++) {
							for (i_37 = 0; i_37 < 3; i_37++) {
								i_38 = 0;

								for (i_39 = 0; i_39 < 3; i_39++) {
									i_38 += ints_31[i_37 + i_39 * 3] * ints_8[i_39 + i_36 * 3];
								}

								ints_35[i_37 + i_36 * 3] = i_38 + 8192 >> 14;
							}
						}

						i_36 = i_34 * ints_8[2] + i_32 * ints_8[0] + i_33 * ints_8[1] + 8192 >> 14;
						i_37 = i_32 * ints_8[3] + i_33 * ints_8[4] + ints_8[5] * i_34 + 8192 >> 14;
						i_38 = i_32 * ints_8[6] + i_34 * ints_8[8] + ints_8[7] * i_33 + 8192 >> 14;
						i_36 += i_10;
						i_37 += i_11;
						i_38 += i_12;

						for (i_39 = 0; i_39 < i_9; i_39++) {
							i_40 = ints_2[i_39];
							if (i_40 < this.anIntArrayArray8568.length) {
								int[] ints_41 = this.anIntArrayArray8568[i_40];

								for (int i_42 = 0; i_42 < ints_41.length; i_42++) {
									int i_43 = ints_41[i_42];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_43]) != 0) {
										int i_44 = ints_35[0] * this.anIntArray8580[i_43] + ints_35[2] * this.anIntArray8610[i_43] + ints_35[1] * this.anIntArray8581[i_43] + 8192 >> 14;
										int i_45 = ints_35[4] * this.anIntArray8581[i_43] + ints_35[5] * this.anIntArray8610[i_43] + ints_35[3] * this.anIntArray8580[i_43] + 8192 >> 14;
										int i_46 = ints_35[6] * this.anIntArray8580[i_43] + ints_35[7] * this.anIntArray8581[i_43] + ints_35[8] * this.anIntArray8610[i_43] + 8192 >> 14;
										i_44 += i_36;
										i_45 += i_37;
										i_46 += i_38;
										this.anIntArray8580[i_43] = i_44;
										this.anIntArray8581[i_43] = i_45;
										this.anIntArray8610[i_43] = i_46;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8568.length) {
								ints_49 = this.anIntArrayArray8568[i_11];

								for (i_47 = 0; i_47 < ints_49.length; i_47++) {
									i_14 = ints_49[i_47];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_14]) != 0) {
										this.anIntArray8580[i_14] -= this.anInt8611;
										this.anIntArray8581[i_14] -= this.anInt8607;
										this.anIntArray8610[i_14] -= this.anInt8613;
										if (i_5 != 0) {
											i_15 = Class382.anIntArray4657[i_5];
											i_16 = Class382.anIntArray4661[i_5];
											i_17 = i_15 * this.anIntArray8581[i_14] + i_16 * this.anIntArray8580[i_14] + 16383 >> 14;
											this.anIntArray8581[i_14] = i_16 * this.anIntArray8581[i_14] - i_15 * this.anIntArray8580[i_14] + 16383 >> 14;
											this.anIntArray8580[i_14] = i_17;
										}

										if (i_3 != 0) {
											i_15 = Class382.anIntArray4657[i_3];
											i_16 = Class382.anIntArray4661[i_3];
											i_17 = i_16 * this.anIntArray8581[i_14] - i_15 * this.anIntArray8610[i_14] + 16383 >> 14;
											this.anIntArray8610[i_14] = i_15 * this.anIntArray8581[i_14] + i_16 * this.anIntArray8610[i_14] + 16383 >> 14;
											this.anIntArray8581[i_14] = i_17;
										}

										if (i_4 != 0) {
											i_15 = Class382.anIntArray4657[i_4];
											i_16 = Class382.anIntArray4661[i_4];
											i_17 = i_15 * this.anIntArray8610[i_14] + i_16 * this.anIntArray8580[i_14] + 16383 >> 14;
											this.anIntArray8610[i_14] = i_16 * this.anIntArray8610[i_14] - i_15 * this.anIntArray8580[i_14] + 16383 >> 14;
											this.anIntArray8580[i_14] = i_17;
										}

										this.anIntArray8580[i_14] += this.anInt8611;
										this.anIntArray8581[i_14] += this.anInt8607;
										this.anIntArray8610[i_14] += this.anInt8613;
									}
								}
							}
						}
					}
				} else if (i_1 == 3) {
					if (ints_8 != null) {
						if (!this.aBool8589) {
							for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
								this.anIntArray8580[i_10] <<= 4;
								this.anIntArray8581[i_10] <<= 4;
								this.anIntArray8610[i_10] <<= 4;
							}

							this.aBool8589 = true;
						}

						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_47 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (this.aBool8614) {
							i_16 = ints_8[6] * this.anInt8613 + ints_8[3] * this.anInt8607 + this.anInt8611 * ints_8[0] + 8192 >> 14;
							i_17 = ints_8[7] * this.anInt8613 + ints_8[1] * this.anInt8611 + ints_8[4] * this.anInt8607 + 8192 >> 14;
							i_18 = ints_8[8] * this.anInt8613 + ints_8[2] * this.anInt8611 + ints_8[5] * this.anInt8607 + 8192 >> 14;
							i_16 += i_47;
							i_17 += i_14;
							i_18 += i_15;
							this.anInt8611 = i_16;
							this.anInt8607 = i_17;
							this.anInt8613 = i_18;
							this.aBool8614 = false;
						}

						i_16 = i_3 << 15 >> 7;
						i_17 = i_4 << 15 >> 7;
						i_18 = i_5 << 15 >> 7;
						i_19 = i_16 * -this.anInt8611 + 8192 >> 14;
						i_20 = i_17 * -this.anInt8607 + 8192 >> 14;
						i_21 = i_18 * -this.anInt8613 + 8192 >> 14;
						i_22 = i_19 + this.anInt8611;
						i_23 = i_20 + this.anInt8607;
						i_24 = i_21 + this.anInt8613;
						int[] ints_50 = new int[] { i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, ints_8[7] * i_17 + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, ints_8[5] * i_18 + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14 };
						i_26 = i_16 * i_47 + 8192 >> 14;
						i_27 = i_17 * i_14 + 8192 >> 14;
						i_28 = i_18 * i_15 + 8192 >> 14;
						i_26 += i_22;
						i_27 += i_23;
						i_28 += i_24;
						int[] ints_51 = new int[9];

						int i_52;
						for (i_30 = 0; i_30 < 3; i_30++) {
							for (i_52 = 0; i_52 < 3; i_52++) {
								i_32 = 0;

								for (i_33 = 0; i_33 < 3; i_33++) {
									i_32 += ints_50[i_52 + i_33 * 3] * ints_8[i_33 + i_30 * 3];
								}

								ints_51[i_52 + i_30 * 3] = i_32 + 8192 >> 14;
							}
						}

						i_30 = i_28 * ints_8[2] + i_26 * ints_8[0] + i_27 * ints_8[1] + 8192 >> 14;
						i_52 = i_26 * ints_8[3] + i_27 * ints_8[4] + ints_8[5] * i_28 + 8192 >> 14;
						i_32 = i_26 * ints_8[6] + i_28 * ints_8[8] + ints_8[7] * i_27 + 8192 >> 14;
						i_30 += i_10;
						i_52 += i_11;
						i_32 += i_12;

						for (i_33 = 0; i_33 < i_9; i_33++) {
							i_34 = ints_2[i_33];
							if (i_34 < this.anIntArrayArray8568.length) {
								ints_35 = this.anIntArrayArray8568[i_34];

								for (i_36 = 0; i_36 < ints_35.length; i_36++) {
									i_37 = ints_35[i_36];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_37]) != 0) {
										i_38 = ints_51[0] * this.anIntArray8580[i_37] + ints_51[2] * this.anIntArray8610[i_37] + ints_51[1] * this.anIntArray8581[i_37] + 8192 >> 14;
										i_39 = ints_51[4] * this.anIntArray8581[i_37] + ints_51[5] * this.anIntArray8610[i_37] + ints_51[3] * this.anIntArray8580[i_37] + 8192 >> 14;
										i_40 = ints_51[6] * this.anIntArray8580[i_37] + ints_51[7] * this.anIntArray8581[i_37] + ints_51[8] * this.anIntArray8610[i_37] + 8192 >> 14;
										i_38 += i_30;
										i_39 += i_52;
										i_40 += i_32;
										this.anIntArray8580[i_37] = i_38;
										this.anIntArray8581[i_37] = i_39;
										this.anIntArray8610[i_37] = i_40;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8568.length) {
								ints_49 = this.anIntArrayArray8568[i_11];

								for (i_47 = 0; i_47 < ints_49.length; i_47++) {
									i_14 = ints_49[i_47];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_14]) != 0) {
										this.anIntArray8580[i_14] -= this.anInt8611;
										this.anIntArray8581[i_14] -= this.anInt8607;
										this.anIntArray8610[i_14] -= this.anInt8613;
										this.anIntArray8580[i_14] = i_3 * this.anIntArray8580[i_14] / 128;
										this.anIntArray8581[i_14] = i_4 * this.anIntArray8581[i_14] / 128;
										this.anIntArray8610[i_14] = i_5 * this.anIntArray8610[i_14] / 128;
										this.anIntArray8580[i_14] += this.anInt8611;
										this.anIntArray8581[i_14] += this.anInt8607;
										this.anIntArray8610[i_14] += this.anInt8613;
									}
								}
							}
						}
					}
				} else {
					Class193 class193_53;
					Class176 class176_56;
					if (i_1 == 5) {
						if (this.anIntArrayArray8608 != null && this.aByteArray8602 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8608.length) {
									ints_49 = this.anIntArrayArray8608[i_11];

									for (i_47 = 0; i_47 < ints_49.length; i_47++) {
										i_14 = ints_49[i_47];
										if (this.aShortArray8632 == null || (i_7 & this.aShortArray8632[i_14]) != 0) {
											i_15 = (this.aByteArray8602[i_14] & 0xff) + i_3 * 8;
											if (i_15 < 0) {
												i_15 = 0;
											} else if (i_15 > 255) {
												i_15 = 255;
											}

											this.aByteArray8602[i_14] = (byte) i_15;
										}
									}
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_10 = 0; i_10 < this.anInt8617; i_10++) {
									class193_53 = this.aClass193Array8618[i_10];
									class176_56 = this.aClass176Array8582[i_10];
									class176_56.anInt2199 = class176_56.anInt2199 & 0xffffff | 255 - (this.aByteArray8602[class193_53.anInt2393] & 0xff) << 24;
								}
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8608 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8608.length) {
									ints_49 = this.anIntArrayArray8608[i_11];

									for (i_47 = 0; i_47 < ints_49.length; i_47++) {
										i_14 = ints_49[i_47];
										if (this.aShortArray8632 == null || (i_7 & this.aShortArray8632[i_14]) != 0) {
											i_15 = this.aShortArray8604[i_14] & 0xffff;
											i_16 = i_15 >> 10 & 0x3f;
											i_17 = i_15 >> 7 & 0x7;
											i_18 = i_15 & 0x7f;
											i_16 = i_3 + i_16 & 0x3f;
											i_17 += i_4;
											if (i_17 < 0) {
												i_17 = 0;
											} else if (i_17 > 7) {
												i_17 = 7;
											}

											i_18 += i_5;
											if (i_18 < 0) {
												i_18 = 0;
											} else if (i_18 > 127) {
												i_18 = 127;
											}

											this.aShortArray8604[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
										}
									}

									this.aBool8609 = true;
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_10 = 0; i_10 < this.anInt8617; i_10++) {
									class193_53 = this.aClass193Array8618[i_10];
									class176_56 = this.aClass176Array8582[i_10];
									class176_56.anInt2199 = class176_56.anInt2199 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_53.anInt2393] & 0xffff, 468160301) & 0xffff] & 0xffffff;
								}
							}
						}
					} else {
						Class176 class176_55;
						if (i_1 == 8) {
							if (this.anIntArrayArray8620 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8620.length) {
										ints_49 = this.anIntArrayArray8620[i_11];

										for (i_47 = 0; i_47 < ints_49.length; i_47++) {
											class176_55 = this.aClass176Array8582[ints_49[i_47]];
											class176_55.anInt2192 += i_3;
											class176_55.anInt2189 += i_4;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8620 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8620.length) {
										ints_49 = this.anIntArrayArray8620[i_11];

										for (i_47 = 0; i_47 < ints_49.length; i_47++) {
											class176_55 = this.aClass176Array8582[ints_49[i_47]];
											class176_55.aFloat2190 = class176_55.aFloat2190 * (float) i_3 / 128.0F;
											class176_55.aFloat2191 = class176_55.aFloat2191 * (float) i_4 / 128.0F;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8620 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8620.length) {
									ints_49 = this.anIntArrayArray8620[i_11];

									for (i_47 = 0; i_47 < ints_49.length; i_47++) {
										class176_55 = this.aClass176Array8582[ints_49[i_47]];
										class176_55.anInt2194 = i_3 + class176_55.anInt2194 & 0x3fff;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	void w(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_6 = 0; i_6 < this.anInt8578; i_6++) {
				this.anInt8611 += this.anIntArray8580[i_6];
				this.anInt8607 += this.anIntArray8581[i_6];
				this.anInt8613 += this.anIntArray8610[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				this.anInt8611 = this.anInt8611 / i_5 + i_2;
				this.anInt8607 = i_3 + this.anInt8607 / i_5;
				this.anInt8613 = this.anInt8613 / i_5 + i_4;
			} else {
				this.anInt8611 = i_2;
				this.anInt8607 = i_3;
				this.anInt8613 = i_4;
			}
		} else if (i_1 == 1) {
			for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
				this.anIntArray8580[i_5] += i_2;
				this.anIntArray8581[i_5] += i_3;
				this.anIntArray8610[i_5] += i_4;
			}
		} else {
			int i_7;
			int i_8;
			if (i_1 == 2) {
				for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] -= this.anInt8611;
					this.anIntArray8581[i_5] -= this.anInt8607;
					this.anIntArray8610[i_5] -= this.anInt8613;
					if (i_4 != 0) {
						i_6 = Class382.anIntArray4657[i_4];
						i_7 = Class382.anIntArray4661[i_4];
						i_8 = i_6 * this.anIntArray8581[i_5] + i_7 * this.anIntArray8580[i_5] + 16383 >> 14;
						this.anIntArray8581[i_5] = i_7 * this.anIntArray8581[i_5] - i_6 * this.anIntArray8580[i_5] + 16383 >> 14;
						this.anIntArray8580[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Class382.anIntArray4657[i_2];
						i_7 = Class382.anIntArray4661[i_2];
						i_8 = i_7 * this.anIntArray8581[i_5] - i_6 * this.anIntArray8610[i_5] + 16383 >> 14;
						this.anIntArray8610[i_5] = i_6 * this.anIntArray8581[i_5] + i_7 * this.anIntArray8610[i_5] + 16383 >> 14;
						this.anIntArray8581[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Class382.anIntArray4657[i_3];
						i_7 = Class382.anIntArray4661[i_3];
						i_8 = i_6 * this.anIntArray8610[i_5] + i_7 * this.anIntArray8580[i_5] + 16383 >> 14;
						this.anIntArray8610[i_5] = i_7 * this.anIntArray8610[i_5] - i_6 * this.anIntArray8580[i_5] + 16383 >> 14;
						this.anIntArray8580[i_5] = i_8;
					}

					this.anIntArray8580[i_5] += this.anInt8611;
					this.anIntArray8581[i_5] += this.anInt8607;
					this.anIntArray8610[i_5] += this.anInt8613;
				}
			} else if (i_1 == 3) {
				for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] -= this.anInt8611;
					this.anIntArray8581[i_5] -= this.anInt8607;
					this.anIntArray8610[i_5] -= this.anInt8613;
					this.anIntArray8580[i_5] = i_2 * this.anIntArray8580[i_5] / 128;
					this.anIntArray8581[i_5] = i_3 * this.anIntArray8581[i_5] / 128;
					this.anIntArray8610[i_5] = i_4 * this.anIntArray8610[i_5] / 128;
					this.anIntArray8580[i_5] += this.anInt8611;
					this.anIntArray8581[i_5] += this.anInt8607;
					this.anIntArray8610[i_5] += this.anInt8613;
				}
			} else {
				Class193 class193_10;
				Class176 class176_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
						i_6 = (this.aByteArray8602[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0) {
							i_6 = 0;
						} else if (i_6 > 255) {
							i_6 = 255;
						}

						this.aByteArray8602[i_5] = (byte) i_6;
					}

					if (this.aClass193Array8618 != null) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class193_10 = this.aClass193Array8618[i_5];
							class176_11 = this.aClass176Array8582[i_5];
							class176_11.anInt2199 = class176_11.anInt2199 & 0xffffff | 255 - (this.aByteArray8602[class193_10.anInt2393] & 0xff) << 24;
						}
					}
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
						i_6 = this.aShortArray8604[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
						i_8 = i_6 >> 7 & 0x7;
						int i_9 = i_6 & 0x7f;
						i_7 = i_7 + i_2 & 0x3f;
						i_8 += i_3;
						if (i_8 < 0) {
							i_8 = 0;
						} else if (i_8 > 7) {
							i_8 = 7;
						}

						i_9 += i_4;
						if (i_9 < 0) {
							i_9 = 0;
						} else if (i_9 > 127) {
							i_9 = 127;
						}

						this.aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					this.aBool8609 = true;
					if (this.aClass193Array8618 != null) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class193_10 = this.aClass193Array8618[i_5];
							class176_11 = this.aClass176Array8582[i_5];
							class176_11.anInt2199 = class176_11.anInt2199 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_10.anInt2393] & 0xffff, 1606412034) & 0xffff] & 0xffffff;
						}
					}
				} else {
					Class176 class176_12;
					if (i_1 == 8) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.anInt2192 += i_2;
							class176_12.anInt2189 += i_3;
						}
					} else if (i_1 == 10) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.aFloat2190 = class176_12.aFloat2190 * (float) i_2 / 128.0F;
							class176_12.aFloat2191 = class176_12.aFloat2191 * (float) i_3 / 128.0F;
						}
					} else if (i_1 == 9) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.anInt2194 = i_2 + class176_12.anInt2194 & 0x3fff;
						}
					}
				}
			}
		}

	}

	public int cd() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8629;
	}

	public int ar() {
		return this.anInt8575;
	}

	void method13814(Matrix44Var matrix44var_1, Class275_Sub5 class275_sub5_2, int i_3) {
		if (this.anInt8579 >= 1) {
			Class185 class185_4 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
			Matrix44Arr matrix44arr_5 = class185_4.aClass384_2317;
			matrix44arr_5.fromVarMatrix44(matrix44var_1);
			Matrix44Arr matrix44arr_6 = this.aClass505_Sub3_8638.aClass384_8994;
			Matrix44Arr matrix44arr_7 = this.aClass505_Sub3_8638.aClass384_8995;
			if (!this.aBool8621) {
				this.method13876();
			}

			boolean bool_8 = matrix44arr_5.method6526();
			float[] floats_9 = class185_4.aFloatArray2324;
			matrix44arr_5.method6527(0.0F, (float) this.aShort8570, 0.0F, floats_9);
			float f_10 = floats_9[0];
			float f_11 = floats_9[1];
			float f_12 = floats_9[2];
			matrix44arr_5.method6527(0.0F, (float) this.aShort8625, 0.0F, floats_9);
			float f_13 = floats_9[0];
			float f_14 = floats_9[1];
			float f_15 = floats_9[2];

			float f_18;
			float f_19;
			for (int i_16 = 0; i_16 < 6; i_16++) {
				float[] floats_17 = this.aClass505_Sub3_8638.aFloatArrayArray8989[i_16];
				f_18 = floats_17[0] * f_10 + floats_17[1] * f_11 + floats_17[2] * f_12 + floats_17[3] + (float) this.aShort8595;
				f_19 = floats_17[0] * f_13 + floats_17[1] * f_14 + floats_17[2] * f_15 + floats_17[3] + (float) this.aShort8595;
				if (f_18 < 0.0F && f_19 < 0.0F) {
					return;
				}
			}

			float f_46;
			float f_56;
			if (bool_8) {
				f_56 = matrix44arr_6.buf[14];
				f_46 = matrix44arr_6.buf[6];
			} else {
				f_56 = matrix44arr_5.buf[12] * matrix44arr_6.buf[2] + matrix44arr_5.buf[13] * matrix44arr_6.buf[6] + matrix44arr_5.buf[14] * matrix44arr_6.buf[10] + matrix44arr_6.buf[14];
				f_46 = matrix44arr_5.buf[4] * matrix44arr_6.buf[2] + matrix44arr_5.buf[5] * matrix44arr_6.buf[6] + matrix44arr_5.buf[6] * matrix44arr_6.buf[10];
			}

			f_18 = f_56 + (float) this.aShort8570 * f_46;
			f_19 = f_56 + (float) this.aShort8625 * f_46;
			float f_20 = f_18 > f_19 ? f_18 + (float) this.aShort8595 : f_19 + (float) this.aShort8595;
			float f_21 = matrix44arr_7.buf[10] * f_20 + matrix44arr_7.buf[14];
			if (this.aClass505_Sub3_8638.anInt9008 > 1) {
				synchronized (this) {
					while (this.aBool8563) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception_53) {
							;
						}
					}

					this.aBool8563 = true;
				}
			}

			this.method13795(class185_4);
			Matrix44Arr matrix44arr_22 = this.aClass185_8564.aClass384_2318;
			matrix44arr_22.method6562(matrix44arr_5);
			matrix44arr_22.method6523(this.aClass505_Sub3_8638.aClass384_8996);
			if ((i_3 & 0x2) != 0) {
				this.aClass144_8566.method2418(true);
			} else {
				this.aClass144_8566.method2418(false);
			}

			boolean bool_47 = false;
			this.aClass185_8564.aFloat2326 = this.aClass144_8566.aFloat1679;
			this.aClass185_8564.aFloat2332 = this.aClass144_8566.aFloat1702;
			this.aClass185_8564.aFloat2311 = this.aClass144_8566.aFloat1683;
			this.aClass185_8564.aFloat2308 = 1.0F / this.aClass144_8566.aFloat1683;
			this.aClass185_8564.aFloat2331 = this.aClass144_8566.aFloat1678;
			this.aClass185_8564.aFloat2333 = this.aClass144_8566.aFloat1680;
			this.aClass185_8564.aFloat2335 = this.aClass144_8566.aFloat1682;
			this.aClass185_8564.anInt2337 = this.aClass144_8566.anInt1684;

			int i_24;
			int i_26;
			int i_27;
			float f_31;
			for (i_24 = 0; i_24 < this.anInt8578; i_24++) {
				int i_25 = this.anIntArray8580[i_24];
				i_26 = this.anIntArray8581[i_24];
				i_27 = this.anIntArray8610[i_24];
				float f_28 = matrix44arr_22.buf[0] * (float) i_25 + matrix44arr_22.buf[4] * (float) i_26 + matrix44arr_22.buf[8] * (float) i_27 + matrix44arr_22.buf[12];
				float f_29 = matrix44arr_22.buf[1] * (float) i_25 + matrix44arr_22.buf[5] * (float) i_26 + matrix44arr_22.buf[9] * (float) i_27 + matrix44arr_22.buf[13];
				float f_30 = matrix44arr_22.buf[2] * (float) i_25 + matrix44arr_22.buf[6] * (float) i_26 + matrix44arr_22.buf[10] * (float) i_27 + matrix44arr_22.buf[14];
				f_31 = matrix44arr_22.buf[3] * (float) i_25 + matrix44arr_22.buf[7] * (float) i_26 + matrix44arr_22.buf[11] * (float) i_27 + matrix44arr_22.buf[15];
				this.aFloatArray8636[i_24] = this.aClass185_8564.aFloat2335 + this.aClass185_8564.aFloat2311 * f_30 / f_31;
				this.aFloatArray8637[i_24] = f_31;
				if (f_30 >= -f_31) {
					this.aFloatArray8590[i_24] = (float) ((int) (this.aClass185_8564.aFloat2331 + this.aClass185_8564.aFloat2326 * f_28 / f_31));
					this.aFloatArray8605[i_24] = (float) ((int) (this.aClass185_8564.aFloat2333 + this.aClass185_8564.aFloat2332 * f_29 / f_31));
				} else {
					this.aFloatArray8590[i_24] = -5000.0F;
					bool_47 = true;
				}

				if (this.aClass185_8564.aBool2309) {
					this.anIntArray8633[i_24] = (int) (matrix44arr_5.buf[13] + matrix44arr_5.buf[1] * (float) i_25 + matrix44arr_5.buf[5] * (float) i_26 + matrix44arr_5.buf[9] * (float) i_27);
				}
			}

			float f_33;
			float f_34;
			float f_35;
			float f_36;
			float f_37;
			float f_38;
			float f_39;
			float f_40;
			float f_41;
			float f_42;
			short s_61;
			if (this.aClass193Array8618 != null) {
				for (i_24 = 0; i_24 < this.anInt8617; i_24++) {
					Class193 class193_48 = this.aClass193Array8618[i_24];
					Class176 class176_49 = this.aClass176Array8582[i_24];
					short s_59 = this.aShortArray8587[class193_48.anInt2393];
					short s_60 = this.aShortArray8588[class193_48.anInt2393];
					s_61 = this.aShortArray8642[class193_48.anInt2393];
					int i_62 = (this.anIntArray8580[s_59] + this.anIntArray8580[s_60] + this.anIntArray8580[s_61]) / 3;
					int i_63 = (this.anIntArray8581[s_59] + this.anIntArray8581[s_60] + this.anIntArray8581[s_61]) / 3;
					int i_32 = (this.anIntArray8610[s_59] + this.anIntArray8610[s_60] + this.anIntArray8610[s_61]) / 3;
					f_33 = matrix44arr_22.buf[0] * (float) i_62 + matrix44arr_22.buf[4] * (float) i_63 + matrix44arr_22.buf[8] * (float) i_32 + matrix44arr_22.buf[12];
					f_34 = matrix44arr_22.buf[1] * (float) i_62 + matrix44arr_22.buf[5] * (float) i_63 + matrix44arr_22.buf[9] * (float) i_32 + matrix44arr_22.buf[13];
					f_35 = matrix44arr_22.buf[2] * (float) i_62 + matrix44arr_22.buf[6] * (float) i_63 + matrix44arr_22.buf[10] * (float) i_32 + matrix44arr_22.buf[14];
					f_36 = matrix44arr_22.buf[3] * (float) i_62 + matrix44arr_22.buf[7] * (float) i_63 + matrix44arr_22.buf[11] * (float) i_32 + matrix44arr_22.buf[15];
					f_35 += matrix44arr_7.buf[2] * (float) class176_49.anInt2192 + matrix44arr_7.buf[6] * (float) class176_49.anInt2189;
					f_36 += matrix44arr_7.buf[3] * (float) class176_49.anInt2192 + matrix44arr_7.buf[7] * (float) class176_49.anInt2189;
					if (f_35 > -f_36) {
						f_33 += matrix44arr_7.buf[0] * (float) class176_49.anInt2192 + matrix44arr_7.buf[4] * (float) class176_49.anInt2189;
						f_34 += matrix44arr_7.buf[1] * (float) class176_49.anInt2192 + matrix44arr_7.buf[5] * (float) class176_49.anInt2189;
						f_37 = this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_33 / f_36;
						f_38 = this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_34 / f_36;
						f_39 = class176_49.aFloat2190 * (float) class193_48.aShort2394;
						f_40 = class176_49.aFloat2191 * (float) class193_48.aShort2395;
						f_41 = f_33 + matrix44arr_7.buf[0] * f_39 + matrix44arr_7.buf[4] * f_40;
						f_42 = f_34 + matrix44arr_7.buf[1] * f_39 + matrix44arr_7.buf[5] * f_40;
						float f_43 = f_36 + matrix44arr_7.buf[3] * f_39 + matrix44arr_7.buf[7] * f_40;
						float f_44 = this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_41 / f_43;
						float f_45 = this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_42 / f_43;
						class176_49.anInt2195 = (int) f_37;
						class176_49.anInt2196 = (int) f_38;
						class176_49.aFloat2193 = this.aClass505_Sub3_8638.aFloat8985 + this.aClass505_Sub3_8638.aFloat8978 * (f_35 - matrix44arr_7.buf[10] * (float) class193_48.anInt2400) / f_36;
						class176_49.anInt2197 = (int) (f_44 < f_37 ? f_37 - f_44 : f_44 - f_37);
						class176_49.anInt2198 = (int) (f_45 < f_38 ? f_38 - f_45 : f_45 - f_38);
					} else {
						class176_49.anInt2198 = 0;
						class176_49.anInt2197 = 0;
					}
				}
			}

			if (class275_sub5_2 != null) {
				boolean bool_57 = false;
				boolean bool_58 = true;
				i_26 = this.aShort8634 + this.aShort8627 >> 1;
				i_27 = this.aShort8571 + this.aShort8629 >> 1;
				s_61 = this.aShort8570;
				f_31 = matrix44arr_22.buf[0] * (float) i_26 + matrix44arr_22.buf[4] * (float) s_61 + matrix44arr_22.buf[8] * (float) i_27 + matrix44arr_22.buf[12];
				float f_64 = matrix44arr_22.buf[1] * (float) i_26 + matrix44arr_22.buf[5] * (float) s_61 + matrix44arr_22.buf[9] * (float) i_27 + matrix44arr_22.buf[13];
				f_33 = matrix44arr_22.buf[2] * (float) i_26 + matrix44arr_22.buf[6] * (float) s_61 + matrix44arr_22.buf[10] * (float) i_27 + matrix44arr_22.buf[14];
				f_34 = matrix44arr_22.buf[3] * (float) i_26 + matrix44arr_22.buf[7] * (float) s_61 + matrix44arr_22.buf[11] * (float) i_27 + matrix44arr_22.buf[15];
				if (f_33 >= -f_34) {
					class275_sub5_2.anInt7847 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_34);
					class275_sub5_2.anInt7848 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_64 / f_34);
				} else {
					bool_57 = true;
				}

				s_61 = this.aShort8625;
				f_35 = matrix44arr_22.buf[0] * (float) i_26 + matrix44arr_22.buf[4] * (float) s_61 + matrix44arr_22.buf[8] * (float) i_27 + matrix44arr_22.buf[12];
				f_36 = matrix44arr_22.buf[1] * (float) i_26 + matrix44arr_22.buf[5] * (float) s_61 + matrix44arr_22.buf[9] * (float) i_27 + matrix44arr_22.buf[13];
				f_37 = matrix44arr_22.buf[2] * (float) i_26 + matrix44arr_22.buf[6] * (float) s_61 + matrix44arr_22.buf[10] * (float) i_27 + matrix44arr_22.buf[14];
				f_38 = matrix44arr_22.buf[3] * (float) i_26 + matrix44arr_22.buf[7] * (float) s_61 + matrix44arr_22.buf[11] * (float) i_27 + matrix44arr_22.buf[15];
				if (f_37 >= -f_38) {
					class275_sub5_2.anInt7850 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_35 / f_38);
					class275_sub5_2.anInt7846 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_36 / f_38);
				} else {
					bool_57 = true;
				}

				if (bool_57) {
					if (f_33 < -f_34 && f_37 < -f_38) {
						bool_58 = false;
					} else if (f_33 < -f_34) {
						f_39 = (f_33 + f_34) / (f_37 + f_38) - 1.0F;
						f_40 = f_31 + f_39 * (f_35 - f_31);
						f_41 = f_64 + f_39 * (f_36 - f_64);
						f_42 = f_34 + f_39 * (f_38 - f_34);
						class275_sub5_2.anInt7847 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_40 / f_42);
						class275_sub5_2.anInt7848 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_41 / f_42);
					} else if (f_37 < -f_38) {
						f_39 = (f_37 + f_38) / (f_33 + f_34) - 1.0F;
						f_40 = f_35 + f_39 * (f_31 - f_35);
						f_41 = f_36 + f_39 * (f_64 - f_36);
						f_42 = f_38 + f_39 * (f_34 - f_38);
						class275_sub5_2.anInt7850 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_40 / f_42);
						class275_sub5_2.anInt7846 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_41 / f_42);
					}
				}

				if (bool_58) {
					if (f_33 / f_34 > f_37 / f_38) {
						f_39 = f_31 + matrix44arr_7.buf[0] * (float) this.aShort8595 + matrix44arr_7.buf[12];
						f_40 = f_34 + matrix44arr_7.buf[3] * (float) this.aShort8595 + matrix44arr_7.buf[15];
						class275_sub5_2.anInt7851 = (int) (this.aClass505_Sub3_8638.aFloat9003 - (float) class275_sub5_2.anInt7847 + this.aClass505_Sub3_8638.aFloat8976 * f_39 / f_40);
					} else {
						f_39 = f_35 + matrix44arr_7.buf[0] * (float) this.aShort8595 + matrix44arr_7.buf[12];
						f_40 = f_38 + matrix44arr_7.buf[3] * (float) this.aShort8595 + matrix44arr_7.buf[15];
						class275_sub5_2.anInt7851 = (int) (this.aClass505_Sub3_8638.aFloat9003 - (float) class275_sub5_2.anInt7850 + this.aClass505_Sub3_8638.aFloat8976 * f_39 / f_40);
					}

					class275_sub5_2.aBool7849 = true;
				}
			}

			this.method13853(true);
			this.aClass144_8566.aBool1675 = (i_3 & 0x1) == 0;
			this.aClass144_8566.aBool1672 = false;

			try {
				this.method13817(this.aClass505_Sub3_8638.anIntArray8979 != null, this.aClass505_Sub3_8638.aFloatArray9010 != null, (i_3 & 0x4) != 0, bool_47, this.aClass185_8564.aBool2304 && f_21 > this.aClass185_8564.aFloat2305 || this.aClass185_8564.aBool2309);
			} catch (Exception exception_54) {
				;
			}

			if (this.aClass193Array8618 != null) {
				for (i_24 = 0; i_24 < this.anInt8586; i_24++) {
					this.anIntArray8643[i_24] = -1;
				}
			}

			this.aClass144_8566 = null;
			if (this.aClass505_Sub3_8638.anInt9008 > 1) {
				synchronized (this) {
					this.aBool8563 = false;
					this.notifyAll();
				}
			}
		}

	}

	final boolean method13816(int i_1) {
		return this.aByteArray8602 == null ? false : this.aByteArray8602[i_1] != 0;
	}

	public void method11269(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class528_Sub2 class528_sub2_6 = (Class528_Sub2) meshrasterizer_1;
		if ((this.anInt8575 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((class528_sub2_6.anInt8575 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else {
			this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
			this.method13876();
			this.method13877();
			class528_sub2_6.method13876();
			class528_sub2_6.method13877();
			++anInt8612;
			int i_7 = 0;
			int[] ints_8 = class528_sub2_6.anIntArray8580;
			int i_9 = class528_sub2_6.anInt8579;

			int i_10;
			for (i_10 = 0; i_10 < this.anInt8579; i_10++) {
				Class189 class189_11 = this.aClass189Array8584[i_10];
				if (class189_11.anInt2382 != 0) {
					int i_12 = this.anIntArray8581[i_10] - i_3;
					if (i_12 >= class528_sub2_6.aShort8570 && i_12 <= class528_sub2_6.aShort8625) {
						int i_13 = this.anIntArray8580[i_10] - i_2;
						if (i_13 >= class528_sub2_6.aShort8634 && i_13 <= class528_sub2_6.aShort8627) {
							int i_14 = this.anIntArray8610[i_10] - i_4;
							if (i_14 >= class528_sub2_6.aShort8571 && i_14 <= class528_sub2_6.aShort8629) {
								for (int i_15 = 0; i_15 < i_9; i_15++) {
									Class189 class189_16 = class528_sub2_6.aClass189Array8584[i_15];
									if (i_13 == ints_8[i_15] && i_14 == class528_sub2_6.anIntArray8610[i_15] && i_12 == class528_sub2_6.anIntArray8581[i_15] && class189_16.anInt2382 != 0) {
										if (this.aClass189Array8585 == null) {
											this.aClass189Array8585 = new Class189[this.anInt8579];
										}

										if (class528_sub2_6.aClass189Array8585 == null) {
											class528_sub2_6.aClass189Array8585 = new Class189[i_9];
										}

										Class189 class189_17 = this.aClass189Array8585[i_10];
										if (class189_17 == null) {
											class189_17 = this.aClass189Array8585[i_10] = new Class189(class189_11);
										}

										Class189 class189_18 = class528_sub2_6.aClass189Array8585[i_15];
										if (class189_18 == null) {
											class189_18 = class528_sub2_6.aClass189Array8585[i_15] = new Class189(class189_16);
										}

										class189_17.anInt2380 += class189_16.anInt2380;
										class189_17.anInt2381 += class189_16.anInt2381;
										class189_17.anInt2379 += class189_16.anInt2379;
										class189_17.anInt2382 += class189_16.anInt2382;
										class189_18.anInt2380 += class189_11.anInt2380;
										class189_18.anInt2381 += class189_11.anInt2381;
										class189_18.anInt2379 += class189_11.anInt2379;
										class189_18.anInt2382 += class189_11.anInt2382;
										++i_7;
										this.anIntArray8567[i_10] = anInt8612;
										this.anIntArray8619[i_15] = anInt8612;
									}
								}
							}
						}
					}
				}
			}

			if (i_7 >= 3 && bool_5) {
				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					if (this.anIntArray8567[this.aShortArray8587[i_10]] == anInt8612 && this.anIntArray8567[this.aShortArray8588[i_10]] == anInt8612 && this.anIntArray8567[this.aShortArray8642[i_10]] == anInt8612) {
						if (this.aByteArray8600 == null) {
							this.aByteArray8600 = new byte[this.anInt8586];
						}

						this.aByteArray8600[i_10] = 2;
					}
				}

				for (i_10 = 0; i_10 < class528_sub2_6.anInt8586; i_10++) {
					if (this.anIntArray8619[class528_sub2_6.aShortArray8587[i_10]] == anInt8612 && this.anIntArray8619[class528_sub2_6.aShortArray8588[i_10]] == anInt8612 && this.anIntArray8619[class528_sub2_6.aShortArray8642[i_10]] == anInt8612) {
						if (class528_sub2_6.aByteArray8600 == null) {
							class528_sub2_6.aByteArray8600 = new byte[class528_sub2_6.anInt8586];
						}

						class528_sub2_6.aByteArray8600[i_10] = 2;
					}
				}
			}

		}
	}

	boolean ea() {
		if (this.anIntArrayArray8568 == null) {
			return false;
		} else {
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;
			return true;
		}
	}

	final void method13817(boolean bool_1, boolean bool_2, boolean bool_3, boolean bool_4, boolean bool_5) {
		int i_6;
		Class193 class193_7;
		if (this.aClass193Array8618 != null) {
			for (i_6 = 0; i_6 < this.anInt8617; this.anIntArray8643[class193_7.anInt2393] = i_6++) {
				class193_7 = this.aClass193Array8618[i_6];
			}
		}

		if (!this.aBool8630 && this.aClass193Array8618 == null) {
			for (i_6 = 0; i_6 < this.anInt8586; i_6++) {
				this.method13868(bool_1, bool_2, bool_3, i_6, bool_4, bool_5);
			}
		} else if ((this.anInt8575 & 0x100) == 0 && this.aShortArray8623 != null) {
			for (i_6 = 0; i_6 < this.anInt8586; i_6++) {
				short s_9 = this.aShortArray8623[i_6];
				this.method13868(bool_1, bool_2, bool_3, s_9, bool_4, bool_5);
			}
		} else {
			for (i_6 = 0; i_6 < this.anInt8586; i_6++) {
				if (!this.method13816(i_6) && !this.method13803(i_6)) {
					this.method13868(bool_1, bool_2, bool_3, i_6, bool_4, bool_5);
				}
			}

			if (this.aByteArray8601 == null) {
				for (i_6 = 0; i_6 < this.anInt8586; i_6++) {
					if (this.method13816(i_6) || this.method13803(i_6)) {
						this.method13868(bool_1, bool_2, bool_3, i_6, bool_4, bool_5);
					}
				}
			} else {
				for (i_6 = 0; i_6 < 12; i_6++) {
					for (int i_8 = 0; i_8 < this.anInt8586; i_8++) {
						if (i_6 == this.aByteArray8601[i_8] && (this.method13816(i_8) || this.method13803(i_8))) {
							this.method13868(bool_1, bool_2, bool_3, i_8, bool_4, bool_5);
						}
					}
				}
			}
		}

	}

	final void method13818(boolean bool_1, boolean bool_2, boolean bool_3, int i_4) {
		short s_5;
		short s_6;
		short s_7;
		float f_9;
		float f_10;
		if (!this.aClass185_8564.aBool2309) {
			s_5 = this.aShortArray8587[i_4];
			s_6 = this.aShortArray8588[i_4];
			s_7 = this.aShortArray8642[i_4];
			Matrix44Arr matrix44arr_8 = this.aClass505_Sub3_8638.aClass384_8995;
			f_9 = matrix44arr_8.buf[10];
			f_10 = matrix44arr_8.buf[14];
			float f_11 = matrix44arr_8.buf[11];
			float f_12 = matrix44arr_8.buf[15];
			float f_13 = f_10 * f_11 - f_9 * f_12;
			float f_14 = (this.aFloatArray8636[s_5] - this.aClass185_8564.aFloat2335) * this.aClass185_8564.aFloat2308;
			float f_15 = (this.aFloatArray8636[s_6] - this.aClass185_8564.aFloat2335) * this.aClass185_8564.aFloat2308;
			float f_16 = (this.aFloatArray8636[s_7] - this.aClass185_8564.aFloat2335) * this.aClass185_8564.aFloat2308;
			float f_17 = f_14 * f_13 / (f_14 * f_11 - f_9);
			float f_18 = f_15 * f_13 / (f_15 * f_11 - f_9);
			float f_19 = f_16 * f_13 / (f_16 * f_11 - f_9);
			float f_20 = (f_17 - this.aClass185_8564.aFloat2305) / this.aClass185_8564.aFloat2303;
			if (f_20 > 1.0F) {
				f_20 = 1.0F;
			} else if (f_20 < 0.0F) {
				f_20 = 0.0F;
			}

			float f_21 = (f_18 - this.aClass185_8564.aFloat2305) / this.aClass185_8564.aFloat2303;
			if (f_21 > 1.0F) {
				f_21 = 1.0F;
			} else if (f_21 < 0.0F) {
				f_21 = 0.0F;
			}

			float f_22 = (f_19 - this.aClass185_8564.aFloat2305) / this.aClass185_8564.aFloat2303;
			if (f_22 > 1.0F) {
				f_22 = 1.0F;
			} else if (f_22 < 0.0F) {
				f_22 = 0.0F;
			}

			float f_23 = f_20 + f_21 + f_22;
			if (f_23 < 3.0F) {
				if (f_23 <= 0.0F) {
					this.method13848(bool_1, bool_2, bool_3, i_4);
				} else {
					if (this.aByteArray8602 == null) {
						this.aClass144_8566.anInt1674 = 0;
					} else {
						this.aClass144_8566.anInt1674 = this.aByteArray8602[i_4] & 0xff;
					}

					if (this.aShortArray8603 != null && this.aShortArray8603[i_4] != -1) {
						int i_24 = -16777216;
						if (this.aByteArray8602 != null) {
							i_24 = 255 - (this.aByteArray8602[i_4] & 0xff) << 24;
						}

						if (this.anIntArray8594[i_4] == -1) {
							int i_25 = i_24 | this.anIntArray8592[i_4] & 0xffffff;
							this.aClass144_8566.method2424(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], this.aFloatArray8637[s_5], this.aFloatArray8637[s_6], this.aFloatArray8637[s_7], this.aFloatArrayArray8635[i_4][0], this.aFloatArrayArray8635[i_4][1], this.aFloatArrayArray8635[i_4][2], this.aFloatArrayArray8591[i_4][0], this.aFloatArrayArray8591[i_4][1], this.aFloatArrayArray8591[i_4][2], i_25, i_25, i_25, this.aClass185_8564.anInt2307, f_20 * 255.0F, f_21 * 255.0F, f_22 * 255.0F, this.aShortArray8603[i_4]);
						} else {
							this.aClass144_8566.method2424(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], this.aFloatArray8637[s_5], this.aFloatArray8637[s_6], this.aFloatArray8637[s_7], this.aFloatArrayArray8635[i_4][0], this.aFloatArrayArray8635[i_4][1], this.aFloatArrayArray8635[i_4][2], this.aFloatArrayArray8591[i_4][0], this.aFloatArrayArray8591[i_4][1], this.aFloatArrayArray8591[i_4][2], i_24 | this.anIntArray8592[i_4] & 0xffffff, i_24 | this.anIntArray8631[i_4] & 0xffffff, i_24 | this.anIntArray8594[i_4] & 0xffffff, this.aClass185_8564.anInt2307, f_20 * 255.0F, f_21 * 255.0F, f_22 * 255.0F, this.aShortArray8603[i_4]);
						}
					} else if (this.anIntArray8594[i_4] == -1) {
						this.aClass144_8566.method2425(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_20 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_21 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_22 * 255.0F));
					} else {
						this.aClass144_8566.method2425(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_20 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8631[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_21 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8594[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_22 * 255.0F));
					}
				}
			}
		} else {
			s_5 = this.aShortArray8587[i_4];
			s_6 = this.aShortArray8588[i_4];
			s_7 = this.aShortArray8642[i_4];
			float f_26 = 0.0F;
			f_9 = 0.0F;
			f_10 = 0.0F;
			if (this.anIntArray8633[s_5] > this.aClass185_8564.anInt2313) {
				f_26 = 1.0F;
			} else if (this.anIntArray8633[s_5] > this.aClass185_8564.anInt2306) {
				f_26 = (float) (this.aClass185_8564.anInt2306 - this.anIntArray8633[s_5]) * 1.0F / (float) (this.aClass185_8564.anInt2306 - this.aClass185_8564.anInt2313);
			}

			if (this.anIntArray8633[s_6] > this.aClass185_8564.anInt2313) {
				f_9 = 1.0F;
			} else if (this.anIntArray8633[s_6] > this.aClass185_8564.anInt2306) {
				f_9 = (float) (this.aClass185_8564.anInt2306 - this.anIntArray8633[s_6]) * 1.0F / (float) (this.aClass185_8564.anInt2306 - this.aClass185_8564.anInt2313);
			}

			if (this.anIntArray8633[s_7] > this.aClass185_8564.anInt2313) {
				f_10 = 1.0F;
			} else if (this.anIntArray8633[s_7] > this.aClass185_8564.anInt2306) {
				f_10 = (float) (this.aClass185_8564.anInt2306 - this.anIntArray8633[s_7]) * 1.0F / (float) (this.aClass185_8564.anInt2306 - this.aClass185_8564.anInt2313);
			}

			if (this.aByteArray8602 == null) {
				this.aClass144_8566.anInt1674 = 0;
			} else {
				this.aClass144_8566.anInt1674 = this.aByteArray8602[i_4] & 0xff;
			}

			if (this.aShortArray8603 != null && this.aShortArray8603[i_4] != -1) {
				int i_27 = -16777216;
				if (this.aByteArray8602 != null) {
					i_27 = 255 - (this.aByteArray8602[i_4] & 0xff) << 24;
				}

				if (this.anIntArray8594[i_4] == -1) {
					int i_28 = i_27 | this.anIntArray8592[i_4] & 0xffffff;
					this.aClass144_8566.method2424(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], this.aFloatArray8637[s_5], this.aFloatArray8637[s_6], this.aFloatArray8637[s_7], this.aFloatArrayArray8635[i_4][0], this.aFloatArrayArray8635[i_4][1], this.aFloatArrayArray8635[i_4][2], this.aFloatArrayArray8591[i_4][0], this.aFloatArrayArray8591[i_4][1], this.aFloatArrayArray8591[i_4][2], i_28, i_28, i_28, this.aClass185_8564.anInt2307, f_26 * 255.0F, f_9 * 255.0F, f_10 * 255.0F, this.aShortArray8603[i_4]);
				} else {
					this.aClass144_8566.method2424(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], this.aFloatArray8637[s_5], this.aFloatArray8637[s_6], this.aFloatArray8637[s_7], this.aFloatArrayArray8635[i_4][0], this.aFloatArrayArray8635[i_4][1], this.aFloatArrayArray8635[i_4][2], this.aFloatArrayArray8591[i_4][0], this.aFloatArrayArray8591[i_4][1], this.aFloatArrayArray8591[i_4][2], i_27 | this.anIntArray8592[i_4] & 0xffffff, i_27 | this.anIntArray8631[i_4] & 0xffffff, i_27 | this.anIntArray8594[i_4] & 0xffffff, this.aClass185_8564.anInt2307, f_26 * 255.0F, f_9 * 255.0F, f_10 * 255.0F, this.aShortArray8603[i_4]);
				}
			} else if (this.anIntArray8594[i_4] == -1) {
				this.aClass144_8566.method2425(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_26 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_9 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_10 * 255.0F));
			} else {
				this.aClass144_8566.method2425(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_26 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8631[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_9 * 255.0F), Class302.method5364(Class335.anIntArray3916[this.anIntArray8594[i_4] & 0xffff], this.aClass185_8564.anInt2307, f_10 * 255.0F));
			}
		}

	}

	public boolean method11270(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Matrix44Arr matrix44arr_6 = this.aClass185_8564.aClass384_2317;
		matrix44arr_6.fromVarMatrix44(matrix44var_3);
		Matrix44Arr matrix44arr_7 = this.aClass185_8564.aClass384_2318;
		matrix44arr_7.method6562(matrix44arr_6);
		matrix44arr_7.method6523(this.aClass505_Sub3_8638.aClass384_8996);
		boolean bool_8 = false;
		int i_9 = Integer.MAX_VALUE;
		int i_10 = Integer.MIN_VALUE;
		int i_11 = Integer.MAX_VALUE;
		int i_12 = Integer.MIN_VALUE;
		if (!this.aBool8621) {
			this.method13876();
		}

		int i_13 = this.aShort8627 - this.aShort8634 >> 1;
		int i_14 = this.aShort8625 - this.aShort8570 >> 1;
		int i_15 = this.aShort8629 - this.aShort8571 >> 1;
		int i_16 = i_13 + this.aShort8634;
		int i_17 = i_14 + this.aShort8570;
		int i_18 = i_15 + this.aShort8571;
		int i_19 = i_16 - (i_13 << i_5);
		int i_20 = i_17 - (i_14 << i_5);
		int i_21 = i_18 - (i_15 << i_5);
		int i_22 = i_16 + (i_13 << i_5);
		int i_23 = i_17 + (i_14 << i_5);
		int i_24 = i_18 + (i_15 << i_5);
		this.anIntArray8583[0] = i_19;
		this.anIntArray8639[0] = i_20;
		this.anIntArray8628[0] = i_21;
		this.anIntArray8583[1] = i_22;
		this.anIntArray8639[1] = i_20;
		this.anIntArray8628[1] = i_21;
		this.anIntArray8583[2] = i_19;
		this.anIntArray8639[2] = i_23;
		this.anIntArray8628[2] = i_21;
		this.anIntArray8583[3] = i_22;
		this.anIntArray8639[3] = i_23;
		this.anIntArray8628[3] = i_21;
		this.anIntArray8583[4] = i_19;
		this.anIntArray8639[4] = i_20;
		this.anIntArray8628[4] = i_24;
		this.anIntArray8583[5] = i_22;
		this.anIntArray8639[5] = i_20;
		this.anIntArray8628[5] = i_24;
		this.anIntArray8583[6] = i_19;
		this.anIntArray8639[6] = i_23;
		this.anIntArray8628[6] = i_24;
		this.anIntArray8583[7] = i_22;
		this.anIntArray8639[7] = i_23;
		this.anIntArray8628[7] = i_24;

		int i_25;
		int i_26;
		int i_27;
		int i_28;
		float f_29;
		float f_30;
		float f_31;
		float f_32;
		for (i_25 = 0; i_25 < 8; i_25++) {
			i_26 = this.anIntArray8583[i_25];
			i_27 = this.anIntArray8639[i_25];
			i_28 = this.anIntArray8628[i_25];
			f_29 = matrix44arr_7.buf[2] * (float) i_26 + matrix44arr_7.buf[6] * (float) i_27 + matrix44arr_7.buf[10] * (float) i_28 + matrix44arr_7.buf[14];
			f_30 = matrix44arr_7.buf[3] * (float) i_26 + matrix44arr_7.buf[7] * (float) i_27 + matrix44arr_7.buf[11] * (float) i_28 + matrix44arr_7.buf[15];
			if (f_29 >= -f_30) {
				f_31 = matrix44arr_7.buf[0] * (float) i_26 + matrix44arr_7.buf[4] * (float) i_27 + matrix44arr_7.buf[8] * (float) i_28 + matrix44arr_7.buf[12];
				f_32 = matrix44arr_7.buf[1] * (float) i_26 + matrix44arr_7.buf[5] * (float) i_27 + matrix44arr_7.buf[9] * (float) i_28 + matrix44arr_7.buf[13];
				int i_33 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_30);
				int i_34 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_32 / f_30);
				if (i_33 < i_9) {
					i_9 = i_33;
				}

				if (i_33 > i_10) {
					i_10 = i_33;
				}

				if (i_34 < i_11) {
					i_11 = i_34;
				}

				if (i_34 > i_12) {
					i_12 = i_34;
				}

				bool_8 = true;
			}
		}

		if (bool_8 && i_1 > i_9 && i_1 < i_10 && i_2 > i_11 && i_2 < i_12) {
			if (bool_4) {
				return true;
			}

			for (i_25 = 0; i_25 < this.anInt8578; i_25++) {
				i_26 = this.anIntArray8580[i_25];
				i_27 = this.anIntArray8581[i_25];
				i_28 = this.anIntArray8610[i_25];
				f_29 = matrix44arr_7.buf[2] * (float) i_26 + matrix44arr_7.buf[6] * (float) i_27 + matrix44arr_7.buf[10] * (float) i_28 + matrix44arr_7.buf[14];
				f_30 = matrix44arr_7.buf[3] * (float) i_26 + matrix44arr_7.buf[7] * (float) i_27 + matrix44arr_7.buf[11] * (float) i_28 + matrix44arr_7.buf[15];
				if (f_29 >= -f_30) {
					f_31 = matrix44arr_7.buf[0] * (float) i_26 + matrix44arr_7.buf[4] * (float) i_27 + matrix44arr_7.buf[8] * (float) i_28 + matrix44arr_7.buf[12];
					f_32 = matrix44arr_7.buf[1] * (float) i_26 + matrix44arr_7.buf[5] * (float) i_27 + matrix44arr_7.buf[9] * (float) i_28 + matrix44arr_7.buf[13];
					this.aFloatArray8590[i_25] = (float) ((int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_30));
					this.aFloatArray8605[i_25] = (float) ((int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_32 / f_30));
				} else {
					this.aFloatArray8590[i_25] = -999999.0F;
				}
			}

			for (i_25 = 0; i_25 < this.anInt8586; i_25++) {
				if (this.aFloatArray8590[this.aShortArray8587[i_25]] != -999999.0F && this.aFloatArray8590[this.aShortArray8588[i_25]] != -999999.0F && this.aFloatArray8590[this.aShortArray8642[i_25]] != -999999.0F && this.method13819(i_1, i_2, this.aFloatArray8605[this.aShortArray8587[i_25]], this.aFloatArray8605[this.aShortArray8588[i_25]], this.aFloatArray8605[this.aShortArray8642[i_25]], this.aFloatArray8590[this.aShortArray8587[i_25]], this.aFloatArray8590[this.aShortArray8588[i_25]], this.aFloatArray8590[this.aShortArray8642[i_25]])) {
					return true;
				}
			}
		}

		return false;
	}

	boolean method13819(int i_1, int i_2, float f_3, float f_4, float f_5, float f_6, float f_7, float f_8) {
		return (float) i_2 < f_3 && (float) i_2 < f_4 && (float) i_2 < f_5 ? false : ((float) i_2 > f_3 && (float) i_2 > f_4 && (float) i_2 > f_5 ? false : ((float) i_1 < f_6 && (float) i_1 < f_7 && (float) i_1 < f_8 ? false : (float) i_1 <= f_6 || (float) i_1 <= f_7 || (float) i_1 <= f_8));
	}

	void method11260() {
		if (this.aClass505_Sub3_8638.anInt9008 > 1) {
			synchronized (this) {
				while (this.aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception_3) {
						;
					}
				}

				this.aBool7023 = true;
			}
		}

	}

	public int N() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8595;
	}

	public int n() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8574;
	}

	public int RA() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8634;
	}

	public boolean method11303() {
		if (this.aShortArray8603 == null) {
			return true;
		} else {
			for (int i_1 = 0; i_1 < this.aShortArray8603.length; i_1++) {
				if (this.aShortArray8603[i_1] != -1 && !this.aClass505_Sub3_8638.method14360(this.aShortArray8603[i_1])) {
					return false;
				}
			}

			return true;
		}
	}

	public int cm() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8570;
	}

	public int o() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8625;
	}

	public int AA() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8571;
	}

	public int cv() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8634;
	}

	public void p(int i_1) {
		if ((this.anInt8575 & 0x1000) != 4096) {
			throw new IllegalStateException();
		} else {
			this.anInt8606 = i_1;
			this.anInt8598 = 0;
		}
	}

	public MeshRasterizer method11276(byte b_1, int i_2, boolean bool_3) {
		this.method13796(Thread.currentThread());
		boolean bool_4 = false;
		Class528_Sub2 class528_sub2_5;
		Class528_Sub2 class528_sub2_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub2_6 = this.aClass528_Sub2Array8645[b_1 - 1];
			class528_sub2_5 = this.aClass528_Sub2Array8626[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub2_5 = class528_sub2_6 = new Class528_Sub2(this.aClass505_Sub3_8638);
		}

		return this.method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
	}

	public void bw(int i_1) {
		if ((this.anInt8575 & 0x5) != 5) {
			throw new IllegalStateException();
		} else {
			if (i_1 == 4096) {
				this.method13805();
			} else if (i_1 == 8192) {
				this.method13806();
			} else if (i_1 == 12288) {
				this.method13807();
			} else {
				int i_2 = Class382.anIntArray4657[i_1];
				int i_3 = Class382.anIntArray4661[i_1];
				synchronized (this) {
					for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
						int i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
						this.anIntArray8580[i_5] = i_6;
					}

					this.method13812();
				}
			}

		}
	}

	public int Z() {
		return this.anInt8577;
	}

	public void X(short s_1, short s_2) {
		int i_3;
		for (i_3 = 0; i_3 < this.anInt8586; i_3++) {
			if (this.aShortArray8604[i_3] == s_1) {
				this.aShortArray8604[i_3] = s_2;
			}
		}

		if (this.aClass193Array8618 != null) {
			for (i_3 = 0; i_3 < this.anInt8617; i_3++) {
				Class193 class193_4 = this.aClass193Array8618[i_3];
				Class176 class176_5 = this.aClass176Array8582[i_3];
				class176_5.anInt2199 = class176_5.anInt2199 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_4.anInt2393], 677879658) & 0xffff] & 0xffffff;
			}
		}

		if (this.anInt8598 == 2) {
			this.anInt8598 = 1;
		}

	}

	public void method11312(byte b_1, byte[] bytes_2) {
		if ((this.anInt8575 & 0x100000) == 0) {
			throw new RuntimeException();
		} else {
			if (this.aByteArray8602 == null) {
				this.aByteArray8602 = new byte[this.anInt8586];
			}

			int i_3;
			if (bytes_2 == null) {
				for (i_3 = 0; i_3 < this.anInt8586; i_3++) {
					this.aByteArray8602[i_3] = b_1;
				}
			} else {
				for (i_3 = 0; i_3 < this.anInt8586; i_3++) {
					int i_4 = 255 - (255 - (b_1 & 0xff)) * (255 - (bytes_2[i_3] & 0xff)) / 255;
					this.aByteArray8602[i_3] = (byte) i_4;
				}
			}

			if (this.anInt8598 == 2) {
				this.anInt8598 = 1;
			}

		}
	}

	public Shadow da(Shadow class282_sub50_sub17_1) {
		return null;
	}

	public void PA(int i_1, int i_2, int i_3, int i_4) {
		if ((this.anInt8575 & 0x80000) != 524288) {
			throw new IllegalStateException();
		} else {
			int i_5;
			for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
				int i_6 = this.aShortArray8604[i_5] & 0xffff;
				int i_7 = i_6 >> 10 & 0x3f;
				int i_8 = i_6 >> 7 & 0x7;
				int i_9 = i_6 & 0x7f;
				if (i_1 != -1) {
					i_7 += (i_1 - i_7) * i_4 >> 7;
				}

				if (i_2 != -1) {
					i_8 += i_4 * (i_2 - i_8) >> 7;
				}

				if (i_3 != -1) {
					i_9 += (i_3 - i_9) * i_4 >> 7;
				}

				this.aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
			}

			if (this.aClass193Array8618 != null) {
				for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
					Class193 class193_10 = this.aClass193Array8618[i_5];
					Class176 class176_11 = this.aClass176Array8582[i_5];
					class176_11.anInt2199 = class176_11.anInt2199 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_10.anInt2393] & 0xffff, 713561210) & 0xffff] & 0xffffff;
				}
			}

			if (this.anInt8598 == 2) {
				this.anInt8598 = 1;
			}

		}
	}

	public Surface[] method11253() {
		return this.aClass87Array8615;
	}

	public SurfaceSkin[] method11274() {
		return this.aClass172Array8616;
	}

	public boolean i() {
		return this.aBool8630;
	}

	public boolean u() {
		return this.aBool8640;
	}

	public void bk(int i_1) {
		if ((this.anInt8575 & 0x6) != 6) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = this.anIntArray8581[i_5] * i_3 - this.anIntArray8610[i_5] * i_2 >> 14;
					this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_2 + this.anIntArray8610[i_5] * i_3 >> 14;
					this.anIntArray8581[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void method11294(Matrix44Var matrix44var_1) {
		this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Matrix44Arr matrix44arr_2 = this.aClass185_8564.aClass384_2317;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (this.aClass87Array8615 != null) {
			for (i_3 = 0; i_3 < this.aClass87Array8615.length; i_3++) {
				Surface class87_4 = this.aClass87Array8615[i_3];
				Surface class87_5 = class87_4;
				if (class87_4.aClass87_835 != null) {
					class87_5 = class87_4.aClass87_835;
				}

				class87_5.anInt844 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt836 * 1502404273 * -1572033967]) * -1929058355 * -75866875;
				class87_5.anInt841 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt836 * 1502404273 * -1572033967]) * 996785411 * 1618253227;
				class87_5.anInt847 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt836 * 1502404273 * -1572033967]) * 976806429 * -489230283;
				class87_5.anInt834 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt837 * -2021469179 * -1955014451]) * -458323579 * 1747322701;
				class87_5.anInt843 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt837 * -2021469179 * -1955014451]) * 543149547 * -174394685;
				class87_5.anInt845 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt837 * -2021469179 * -1955014451]) * 1054448197 * 305293453;
				class87_5.anInt846 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt838 * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
				class87_5.anInt840 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt838 * -1292195173 * -2135413869]) * -1652520905 * 950906247;
				class87_5.anInt848 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt838 * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
			}
		}

		if (this.aClass172Array8616 != null) {
			for (i_3 = 0; i_3 < this.aClass172Array8616.length; i_3++) {
				SurfaceSkin class172_6 = this.aClass172Array8616[i_3];
				SurfaceSkin class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null) {
					class172_7 = class172_6.aClass172_2114;
				}

				if (class172_6.aClass384_2116 != null) {
					class172_6.aClass384_2116.method6562(matrix44arr_2);
				} else {
					class172_6.aClass384_2116 = new Matrix44Arr(matrix44arr_2);
				}

				class172_7.anInt2113 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
				class172_7.anInt2117 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
				class172_7.anInt2118 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
			}
		}

	}

	void bl(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
		int i_9 = ints_2.length;
		int i_10;
		int i_11;
		int i_12;
		int i_14;
		int i_15;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			if (!this.aBool8589) {
				for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
					this.anIntArray8580[i_10] <<= 4;
					this.anIntArray8581[i_10] <<= 4;
					this.anIntArray8610[i_10] <<= 4;
				}

				this.aBool8589 = true;
			}

			i_10 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_11 = 0; i_11 < i_9; i_11++) {
				i_12 = ints_2[i_11];
				if (i_12 < this.anIntArrayArray8568.length) {
					int[] ints_13 = this.anIntArrayArray8568[i_12];

					for (i_14 = 0; i_14 < ints_13.length; i_14++) {
						i_15 = ints_13[i_14];
						if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_15]) != 0) {
							this.anInt8611 += this.anIntArray8580[i_15];
							this.anInt8607 += this.anIntArray8581[i_15];
							this.anInt8613 += this.anIntArray8610[i_15];
							++i_10;
						}
					}
				}
			}

			if (i_10 > 0) {
				this.anInt8611 = this.anInt8611 / i_10 + i_3;
				this.anInt8607 = this.anInt8607 / i_10 + i_4;
				this.anInt8613 = this.anInt8613 / i_10 + i_5;
				this.aBool8614 = true;
			} else {
				this.anInt8611 = i_3;
				this.anInt8607 = i_4;
				this.anInt8613 = i_5;
			}
		} else {
			int i_47;
			int[] ints_49;
			if (i_1 == 1) {
				if (ints_8 != null) {
					i_10 = ints_8[0] * i_3 + ints_8[1] * i_4 + ints_8[2] * i_5 + 8192 >> 14;
					i_11 = ints_8[3] * i_3 + ints_8[4] * i_4 + ints_8[5] * i_5 + 8192 >> 14;
					i_12 = ints_8[6] * i_3 + ints_8[7] * i_4 + ints_8[8] * i_5 + 8192 >> 14;
					i_3 = i_10;
					i_4 = i_11;
					i_5 = i_12;
				}

				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;
				if (!this.aBool8589) {
					for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
						this.anIntArray8580[i_10] <<= 4;
						this.anIntArray8581[i_10] <<= 4;
						this.anIntArray8610[i_10] <<= 4;
					}

					this.aBool8589 = true;
				}

				for (i_10 = 0; i_10 < i_9; i_10++) {
					i_11 = ints_2[i_10];
					if (i_11 < this.anIntArrayArray8568.length) {
						ints_49 = this.anIntArrayArray8568[i_11];

						for (i_47 = 0; i_47 < ints_49.length; i_47++) {
							i_14 = ints_49[i_47];
							if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_14]) != 0) {
								this.anIntArray8580[i_14] += i_3;
								this.anIntArray8581[i_14] += i_4;
								this.anIntArray8610[i_14] += i_5;
							}
						}
					}
				}
			} else {
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_26;
				int i_27;
				int i_28;
				int i_30;
				int i_32;
				int i_33;
				int i_34;
				int[] ints_35;
				int i_36;
				int i_37;
				int i_38;
				int i_39;
				int i_40;
				if (i_1 == 2) {
					if (ints_8 != null) {
						if (!this.aBool8589) {
							for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
								this.anIntArray8580[i_10] <<= 4;
								this.anIntArray8581[i_10] <<= 4;
								this.anIntArray8610[i_10] <<= 4;
							}

							this.aBool8589 = true;
						}

						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_47 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (this.aBool8614) {
							i_16 = ints_8[0] * this.anInt8611 + ints_8[3] * this.anInt8607 + ints_8[6] * this.anInt8613 + 8192 >> 14;
							i_17 = ints_8[1] * this.anInt8611 + ints_8[4] * this.anInt8607 + ints_8[7] * this.anInt8613 + 8192 >> 14;
							i_18 = ints_8[2] * this.anInt8611 + ints_8[5] * this.anInt8607 + ints_8[8] * this.anInt8613 + 8192 >> 14;
							i_16 += i_47;
							i_17 += i_14;
							i_18 += i_15;
							this.anInt8611 = i_16;
							this.anInt8607 = i_17;
							this.anInt8613 = i_18;
							this.aBool8614 = false;
						}

						int[] ints_48 = new int[9];
						i_17 = Class382.anIntArray4661[i_3];
						i_18 = Class382.anIntArray4657[i_3];
						i_19 = Class382.anIntArray4661[i_4];
						i_20 = Class382.anIntArray4657[i_4];
						i_21 = Class382.anIntArray4661[i_5];
						i_22 = Class382.anIntArray4657[i_5];
						i_23 = i_18 * i_21 + 8192 >> 14;
						i_24 = i_18 * i_22 + 8192 >> 14;
						ints_48[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
						ints_48[1] = -i_19 * i_22 + i_20 * i_23 + 8192 >> 14;
						ints_48[2] = i_20 * i_17 + 8192 >> 14;
						ints_48[3] = i_17 * i_22 + 8192 >> 14;
						ints_48[4] = i_17 * i_21 + 8192 >> 14;
						ints_48[5] = -i_18;
						ints_48[6] = -i_20 * i_21 + i_19 * i_24 + 8192 >> 14;
						ints_48[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
						ints_48[8] = i_19 * i_17 + 8192 >> 14;
						int i_25 = ints_48[0] * -this.anInt8611 + ints_48[1] * -this.anInt8607 + ints_48[2] * -this.anInt8613 + 8192 >> 14;
						i_26 = ints_48[3] * -this.anInt8611 + ints_48[4] * -this.anInt8607 + ints_48[5] * -this.anInt8613 + 8192 >> 14;
						i_27 = ints_48[6] * -this.anInt8611 + ints_48[7] * -this.anInt8607 + ints_48[8] * -this.anInt8613 + 8192 >> 14;
						i_28 = i_25 + this.anInt8611;
						int i_29 = i_26 + this.anInt8607;
						i_30 = i_27 + this.anInt8613;
						int[] ints_31 = new int[9];

						for (i_32 = 0; i_32 < 3; i_32++) {
							for (i_33 = 0; i_33 < 3; i_33++) {
								i_34 = 0;

								for (int i_54 = 0; i_54 < 3; i_54++) {
									i_34 += ints_48[i_32 * 3 + i_54] * ints_8[i_33 * 3 + i_54];
								}

								ints_31[i_32 * 3 + i_33] = i_34 + 8192 >> 14;
							}
						}

						i_32 = ints_48[0] * i_47 + ints_48[1] * i_14 + ints_48[2] * i_15 + 8192 >> 14;
						i_33 = ints_48[3] * i_47 + ints_48[4] * i_14 + ints_48[5] * i_15 + 8192 >> 14;
						i_34 = ints_48[6] * i_47 + ints_48[7] * i_14 + ints_48[8] * i_15 + 8192 >> 14;
						i_32 += i_28;
						i_33 += i_29;
						i_34 += i_30;
						ints_35 = new int[9];

						for (i_36 = 0; i_36 < 3; i_36++) {
							for (i_37 = 0; i_37 < 3; i_37++) {
								i_38 = 0;

								for (i_39 = 0; i_39 < 3; i_39++) {
									i_38 += ints_8[i_36 * 3 + i_39] * ints_31[i_37 + i_39 * 3];
								}

								ints_35[i_36 * 3 + i_37] = i_38 + 8192 >> 14;
							}
						}

						i_36 = ints_8[0] * i_32 + ints_8[1] * i_33 + ints_8[2] * i_34 + 8192 >> 14;
						i_37 = ints_8[3] * i_32 + ints_8[4] * i_33 + ints_8[5] * i_34 + 8192 >> 14;
						i_38 = ints_8[6] * i_32 + ints_8[7] * i_33 + ints_8[8] * i_34 + 8192 >> 14;
						i_36 += i_10;
						i_37 += i_11;
						i_38 += i_12;

						for (i_39 = 0; i_39 < i_9; i_39++) {
							i_40 = ints_2[i_39];
							if (i_40 < this.anIntArrayArray8568.length) {
								int[] ints_41 = this.anIntArrayArray8568[i_40];

								for (int i_42 = 0; i_42 < ints_41.length; i_42++) {
									int i_43 = ints_41[i_42];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_43]) != 0) {
										int i_44 = ints_35[0] * this.anIntArray8580[i_43] + ints_35[1] * this.anIntArray8581[i_43] + ints_35[2] * this.anIntArray8610[i_43] + 8192 >> 14;
										int i_45 = ints_35[3] * this.anIntArray8580[i_43] + ints_35[4] * this.anIntArray8581[i_43] + ints_35[5] * this.anIntArray8610[i_43] + 8192 >> 14;
										int i_46 = ints_35[6] * this.anIntArray8580[i_43] + ints_35[7] * this.anIntArray8581[i_43] + ints_35[8] * this.anIntArray8610[i_43] + 8192 >> 14;
										i_44 += i_36;
										i_45 += i_37;
										i_46 += i_38;
										this.anIntArray8580[i_43] = i_44;
										this.anIntArray8581[i_43] = i_45;
										this.anIntArray8610[i_43] = i_46;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8568.length) {
								ints_49 = this.anIntArrayArray8568[i_11];

								for (i_47 = 0; i_47 < ints_49.length; i_47++) {
									i_14 = ints_49[i_47];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_14]) != 0) {
										this.anIntArray8580[i_14] -= this.anInt8611;
										this.anIntArray8581[i_14] -= this.anInt8607;
										this.anIntArray8610[i_14] -= this.anInt8613;
										if (i_5 != 0) {
											i_15 = Class382.anIntArray4657[i_5];
											i_16 = Class382.anIntArray4661[i_5];
											i_17 = this.anIntArray8581[i_14] * i_15 + this.anIntArray8580[i_14] * i_16 + 16383 >> 14;
											this.anIntArray8581[i_14] = this.anIntArray8581[i_14] * i_16 - this.anIntArray8580[i_14] * i_15 + 16383 >> 14;
											this.anIntArray8580[i_14] = i_17;
										}

										if (i_3 != 0) {
											i_15 = Class382.anIntArray4657[i_3];
											i_16 = Class382.anIntArray4661[i_3];
											i_17 = this.anIntArray8581[i_14] * i_16 - this.anIntArray8610[i_14] * i_15 + 16383 >> 14;
											this.anIntArray8610[i_14] = this.anIntArray8581[i_14] * i_15 + this.anIntArray8610[i_14] * i_16 + 16383 >> 14;
											this.anIntArray8581[i_14] = i_17;
										}

										if (i_4 != 0) {
											i_15 = Class382.anIntArray4657[i_4];
											i_16 = Class382.anIntArray4661[i_4];
											i_17 = this.anIntArray8610[i_14] * i_15 + this.anIntArray8580[i_14] * i_16 + 16383 >> 14;
											this.anIntArray8610[i_14] = this.anIntArray8610[i_14] * i_16 - this.anIntArray8580[i_14] * i_15 + 16383 >> 14;
											this.anIntArray8580[i_14] = i_17;
										}

										this.anIntArray8580[i_14] += this.anInt8611;
										this.anIntArray8581[i_14] += this.anInt8607;
										this.anIntArray8610[i_14] += this.anInt8613;
									}
								}
							}
						}
					}
				} else if (i_1 == 3) {
					if (ints_8 != null) {
						if (!this.aBool8589) {
							for (i_10 = 0; i_10 < this.anInt8578; i_10++) {
								this.anIntArray8580[i_10] <<= 4;
								this.anIntArray8581[i_10] <<= 4;
								this.anIntArray8610[i_10] <<= 4;
							}

							this.aBool8589 = true;
						}

						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_47 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (this.aBool8614) {
							i_16 = ints_8[0] * this.anInt8611 + ints_8[3] * this.anInt8607 + ints_8[6] * this.anInt8613 + 8192 >> 14;
							i_17 = ints_8[1] * this.anInt8611 + ints_8[4] * this.anInt8607 + ints_8[7] * this.anInt8613 + 8192 >> 14;
							i_18 = ints_8[2] * this.anInt8611 + ints_8[5] * this.anInt8607 + ints_8[8] * this.anInt8613 + 8192 >> 14;
							i_16 += i_47;
							i_17 += i_14;
							i_18 += i_15;
							this.anInt8611 = i_16;
							this.anInt8607 = i_17;
							this.anInt8613 = i_18;
							this.aBool8614 = false;
						}

						i_16 = i_3 << 15 >> 7;
						i_17 = i_4 << 15 >> 7;
						i_18 = i_5 << 15 >> 7;
						i_19 = i_16 * -this.anInt8611 + 8192 >> 14;
						i_20 = i_17 * -this.anInt8607 + 8192 >> 14;
						i_21 = i_18 * -this.anInt8613 + 8192 >> 14;
						i_22 = i_19 + this.anInt8611;
						i_23 = i_20 + this.anInt8607;
						i_24 = i_21 + this.anInt8613;
						int[] ints_50 = new int[] { i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, i_17 * ints_8[7] + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, i_18 * ints_8[5] + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14 };
						i_26 = i_16 * i_47 + 8192 >> 14;
						i_27 = i_17 * i_14 + 8192 >> 14;
						i_28 = i_18 * i_15 + 8192 >> 14;
						i_26 += i_22;
						i_27 += i_23;
						i_28 += i_24;
						int[] ints_51 = new int[9];

						int i_52;
						for (i_30 = 0; i_30 < 3; i_30++) {
							for (i_52 = 0; i_52 < 3; i_52++) {
								i_32 = 0;

								for (i_33 = 0; i_33 < 3; i_33++) {
									i_32 += ints_8[i_30 * 3 + i_33] * ints_50[i_52 + i_33 * 3];
								}

								ints_51[i_30 * 3 + i_52] = i_32 + 8192 >> 14;
							}
						}

						i_30 = ints_8[0] * i_26 + ints_8[1] * i_27 + ints_8[2] * i_28 + 8192 >> 14;
						i_52 = ints_8[3] * i_26 + ints_8[4] * i_27 + ints_8[5] * i_28 + 8192 >> 14;
						i_32 = ints_8[6] * i_26 + ints_8[7] * i_27 + ints_8[8] * i_28 + 8192 >> 14;
						i_30 += i_10;
						i_52 += i_11;
						i_32 += i_12;

						for (i_33 = 0; i_33 < i_9; i_33++) {
							i_34 = ints_2[i_33];
							if (i_34 < this.anIntArrayArray8568.length) {
								ints_35 = this.anIntArrayArray8568[i_34];

								for (i_36 = 0; i_36 < ints_35.length; i_36++) {
									i_37 = ints_35[i_36];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_37]) != 0) {
										i_38 = ints_51[0] * this.anIntArray8580[i_37] + ints_51[1] * this.anIntArray8581[i_37] + ints_51[2] * this.anIntArray8610[i_37] + 8192 >> 14;
										i_39 = ints_51[3] * this.anIntArray8580[i_37] + ints_51[4] * this.anIntArray8581[i_37] + ints_51[5] * this.anIntArray8610[i_37] + 8192 >> 14;
										i_40 = ints_51[6] * this.anIntArray8580[i_37] + ints_51[7] * this.anIntArray8581[i_37] + ints_51[8] * this.anIntArray8610[i_37] + 8192 >> 14;
										i_38 += i_30;
										i_39 += i_52;
										i_40 += i_32;
										this.anIntArray8580[i_37] = i_38;
										this.anIntArray8581[i_37] = i_39;
										this.anIntArray8610[i_37] = i_40;
									}
								}
							}
						}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < this.anIntArrayArray8568.length) {
								ints_49 = this.anIntArrayArray8568[i_11];

								for (i_47 = 0; i_47 < ints_49.length; i_47++) {
									i_14 = ints_49[i_47];
									if (this.aShortArray8569 == null || (i_7 & this.aShortArray8569[i_14]) != 0) {
										this.anIntArray8580[i_14] -= this.anInt8611;
										this.anIntArray8581[i_14] -= this.anInt8607;
										this.anIntArray8610[i_14] -= this.anInt8613;
										this.anIntArray8580[i_14] = this.anIntArray8580[i_14] * i_3 / 128;
										this.anIntArray8581[i_14] = this.anIntArray8581[i_14] * i_4 / 128;
										this.anIntArray8610[i_14] = this.anIntArray8610[i_14] * i_5 / 128;
										this.anIntArray8580[i_14] += this.anInt8611;
										this.anIntArray8581[i_14] += this.anInt8607;
										this.anIntArray8610[i_14] += this.anInt8613;
									}
								}
							}
						}
					}
				} else {
					Class193 class193_53;
					Class176 class176_56;
					if (i_1 == 5) {
						if (this.anIntArrayArray8608 != null && this.aByteArray8602 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8608.length) {
									ints_49 = this.anIntArrayArray8608[i_11];

									for (i_47 = 0; i_47 < ints_49.length; i_47++) {
										i_14 = ints_49[i_47];
										if (this.aShortArray8632 == null || (i_7 & this.aShortArray8632[i_14]) != 0) {
											i_15 = (this.aByteArray8602[i_14] & 0xff) + i_3 * 8;
											if (i_15 < 0) {
												i_15 = 0;
											} else if (i_15 > 255) {
												i_15 = 255;
											}

											this.aByteArray8602[i_14] = (byte) i_15;
										}
									}
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_10 = 0; i_10 < this.anInt8617; i_10++) {
									class193_53 = this.aClass193Array8618[i_10];
									class176_56 = this.aClass176Array8582[i_10];
									class176_56.anInt2199 = (class176_56.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (this.aByteArray8602[class193_53.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
								}
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8608 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8608.length) {
									ints_49 = this.anIntArrayArray8608[i_11];

									for (i_47 = 0; i_47 < ints_49.length; i_47++) {
										i_14 = ints_49[i_47];
										if (this.aShortArray8632 == null || (i_7 & this.aShortArray8632[i_14]) != 0) {
											i_15 = this.aShortArray8604[i_14] & 0xffff;
											i_16 = i_15 >> 10 & 0x3f;
											i_17 = i_15 >> 7 & 0x7;
											i_18 = i_15 & 0x7f;
											i_16 = i_16 + i_3 & 0x3f;
											i_17 += i_4;
											if (i_17 < 0) {
												i_17 = 0;
											} else if (i_17 > 7) {
												i_17 = 7;
											}

											i_18 += i_5;
											if (i_18 < 0) {
												i_18 = 0;
											} else if (i_18 > 127) {
												i_18 = 127;
											}

											this.aShortArray8604[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
										}
									}

									this.aBool8609 = true;
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_10 = 0; i_10 < this.anInt8617; i_10++) {
									class193_53 = this.aClass193Array8618[i_10];
									class176_56 = this.aClass176Array8582[i_10];
									class176_56.anInt2199 = (class176_56.anInt2199 * -1022818925 * -1303125861 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_53.anInt2393 * -1274099887 * 142270897] & 0xffff, 1376089110) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
								}
							}
						}
					} else {
						Class176 class176_55;
						if (i_1 == 8) {
							if (this.anIntArrayArray8620 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8620.length) {
										ints_49 = this.anIntArrayArray8620[i_11];

										for (i_47 = 0; i_47 < ints_49.length; i_47++) {
											class176_55 = this.aClass176Array8582[ints_49[i_47]];
											class176_55.anInt2192 = (class176_55.anInt2192 * -943685543 + i_3 * -943685543) * -310982679;
											class176_55.anInt2189 = (class176_55.anInt2189 * 1414070385 + i_4 * 1414070385) * 1349697681;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8620 != null) {
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < this.anIntArrayArray8620.length) {
										ints_49 = this.anIntArrayArray8620[i_11];

										for (i_47 = 0; i_47 < ints_49.length; i_47++) {
											class176_55 = this.aClass176Array8582[ints_49[i_47]];
											class176_55.aFloat2190 = class176_55.aFloat2190 * (float) i_3 / 128.0F;
											class176_55.aFloat2191 = class176_55.aFloat2191 * (float) i_4 / 128.0F;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8620 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < this.anIntArrayArray8620.length) {
									ints_49 = this.anIntArrayArray8620[i_11];

									for (i_47 = 0; i_47 < ints_49.length; i_47++) {
										class176_55 = this.aClass176Array8582[ints_49[i_47]];
										class176_55.anInt2194 = (class176_55.anInt2194 * 2076699445 * 156323613 + i_3 & 0x3fff) * 2076699445 * 156323613;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public int ca() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8570;
	}

	public void cr(int i_1) {
		if ((this.anInt8575 & 0x2000) != 8192) {
			throw new IllegalStateException();
		} else {
			this.anInt8577 = i_1;
			this.anInt8598 = 0;
		}
	}

	public void method11299(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		Class528_Sub2 class528_sub2_6 = (Class528_Sub2) meshrasterizer_1;
		if ((this.anInt8575 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else if ((class528_sub2_6.anInt8575 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		} else {
			this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
			this.method13876();
			this.method13877();
			class528_sub2_6.method13876();
			class528_sub2_6.method13877();
			++anInt8612;
			int i_7 = 0;
			int[] ints_8 = class528_sub2_6.anIntArray8580;
			int i_9 = class528_sub2_6.anInt8579;

			int i_10;
			for (i_10 = 0; i_10 < this.anInt8579; i_10++) {
				Class189 class189_11 = this.aClass189Array8584[i_10];
				if (class189_11.anInt2382 != 0) {
					int i_12 = this.anIntArray8581[i_10] - i_3;
					if (i_12 >= class528_sub2_6.aShort8570 && i_12 <= class528_sub2_6.aShort8625) {
						int i_13 = this.anIntArray8580[i_10] - i_2;
						if (i_13 >= class528_sub2_6.aShort8634 && i_13 <= class528_sub2_6.aShort8627) {
							int i_14 = this.anIntArray8610[i_10] - i_4;
							if (i_14 >= class528_sub2_6.aShort8571 && i_14 <= class528_sub2_6.aShort8629) {
								for (int i_15 = 0; i_15 < i_9; i_15++) {
									Class189 class189_16 = class528_sub2_6.aClass189Array8584[i_15];
									if (i_13 == ints_8[i_15] && i_14 == class528_sub2_6.anIntArray8610[i_15] && i_12 == class528_sub2_6.anIntArray8581[i_15] && class189_16.anInt2382 != 0) {
										if (this.aClass189Array8585 == null) {
											this.aClass189Array8585 = new Class189[this.anInt8579];
										}

										if (class528_sub2_6.aClass189Array8585 == null) {
											class528_sub2_6.aClass189Array8585 = new Class189[i_9];
										}

										Class189 class189_17 = this.aClass189Array8585[i_10];
										if (class189_17 == null) {
											class189_17 = this.aClass189Array8585[i_10] = new Class189(class189_11);
										}

										Class189 class189_18 = class528_sub2_6.aClass189Array8585[i_15];
										if (class189_18 == null) {
											class189_18 = class528_sub2_6.aClass189Array8585[i_15] = new Class189(class189_16);
										}

										class189_17.anInt2380 += class189_16.anInt2380;
										class189_17.anInt2381 += class189_16.anInt2381;
										class189_17.anInt2379 += class189_16.anInt2379;
										class189_17.anInt2382 += class189_16.anInt2382;
										class189_18.anInt2380 += class189_11.anInt2380;
										class189_18.anInt2381 += class189_11.anInt2381;
										class189_18.anInt2379 += class189_11.anInt2379;
										class189_18.anInt2382 += class189_11.anInt2382;
										++i_7;
										this.anIntArray8567[i_10] = anInt8612;
										this.anIntArray8619[i_15] = anInt8612;
									}
								}
							}
						}
					}
				}
			}

			if (i_7 >= 3 && bool_5) {
				for (i_10 = 0; i_10 < this.anInt8586; i_10++) {
					if (this.anIntArray8567[this.aShortArray8587[i_10]] == anInt8612 && this.anIntArray8567[this.aShortArray8588[i_10]] == anInt8612 && this.anIntArray8567[this.aShortArray8642[i_10]] == anInt8612) {
						if (this.aByteArray8600 == null) {
							this.aByteArray8600 = new byte[this.anInt8586];
						}

						this.aByteArray8600[i_10] = 2;
					}
				}

				for (i_10 = 0; i_10 < class528_sub2_6.anInt8586; i_10++) {
					if (this.anIntArray8619[class528_sub2_6.aShortArray8587[i_10]] == anInt8612 && this.anIntArray8619[class528_sub2_6.aShortArray8588[i_10]] == anInt8612 && this.anIntArray8619[class528_sub2_6.aShortArray8642[i_10]] == anInt8612) {
						if (class528_sub2_6.aByteArray8600 == null) {
							class528_sub2_6.aByteArray8600 = new byte[class528_sub2_6.anInt8586];
						}

						class528_sub2_6.aByteArray8600[i_10] = 2;
					}
				}
			}

		}
	}

	public int dg() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8574;
	}

	public MeshRasterizer method11277(byte b_1, int i_2, boolean bool_3) {
		this.method13796(Thread.currentThread());
		boolean bool_4 = false;
		Class528_Sub2 class528_sub2_5;
		Class528_Sub2 class528_sub2_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub2_6 = this.aClass528_Sub2Array8645[b_1 - 1];
			class528_sub2_5 = this.aClass528_Sub2Array8626[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub2_5 = class528_sub2_6 = new Class528_Sub2(this.aClass505_Sub3_8638);
		}

		return this.method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
	}

	public MeshRasterizer method11278(byte b_1, int i_2, boolean bool_3) {
		this.method13796(Thread.currentThread());
		boolean bool_4 = false;
		Class528_Sub2 class528_sub2_5;
		Class528_Sub2 class528_sub2_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub2_6 = this.aClass528_Sub2Array8645[b_1 - 1];
			class528_sub2_5 = this.aClass528_Sub2Array8626[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub2_5 = class528_sub2_6 = new Class528_Sub2(this.aClass505_Sub3_8638);
		}

		return this.method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
	}

	public MeshRasterizer method11279(byte b_1, int i_2, boolean bool_3) {
		this.method13796(Thread.currentThread());
		boolean bool_4 = false;
		Class528_Sub2 class528_sub2_5;
		Class528_Sub2 class528_sub2_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub2_6 = this.aClass528_Sub2Array8645[b_1 - 1];
			class528_sub2_5 = this.aClass528_Sub2Array8626[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub2_5 = class528_sub2_6 = new Class528_Sub2(this.aClass505_Sub3_8638);
		}

		return this.method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
	}

	public MeshRasterizer method11296(byte b_1, int i_2, boolean bool_3) {
		this.method13796(Thread.currentThread());
		boolean bool_4 = false;
		Class528_Sub2 class528_sub2_5;
		Class528_Sub2 class528_sub2_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub2_6 = this.aClass528_Sub2Array8645[b_1 - 1];
			class528_sub2_5 = this.aClass528_Sub2Array8626[b_1 - 1];
			bool_4 = true;
		} else {
			class528_sub2_5 = class528_sub2_6 = new Class528_Sub2(this.aClass505_Sub3_8638);
		}

		return this.method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
	}

	public int ci() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8634;
	}

	public int ae() {
		return this.anInt8575;
	}

	public void aq(int i_1) {
		if (this.aClass505_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
			synchronized (this) {
				if ((this.anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
					this.method13853(true);
				}

				this.anInt8575 = i_1;
			}
		} else {
			if ((this.anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
				this.method13853(true);
			}

			this.anInt8575 = i_1;
		}

	}

	public byte[] aw() {
		return this.aByteArray8602;
	}

	public void KA(int i_1) {
		if (this.aClass505_Sub3_8638.anInt9008 > 1) {
			synchronized (this) {
				if ((this.anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
					this.method13853(true);
				}

				this.anInt8575 = i_1;
			}
		} else {
			if ((this.anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
				this.method13853(true);
			}

			this.anInt8575 = i_1;
		}

	}

	public void bx(int i_1) {
		if ((this.anInt8575 & 0x5) != 5) {
			throw new IllegalStateException();
		} else {
			if (i_1 == 4096) {
				this.method13805();
			} else if (i_1 == 8192) {
				this.method13806();
			} else if (i_1 == 12288) {
				this.method13807();
			} else {
				int i_2 = Class382.anIntArray4657[i_1];
				int i_3 = Class382.anIntArray4661[i_1];
				synchronized (this) {
					for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
						int i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
						this.anIntArray8580[i_5] = i_6;
					}

					this.method13812();
				}
			}

		}
	}

	public void bz(int i_1) {
		if ((this.anInt8575 & 0xd) != 13) {
			throw new IllegalStateException();
		} else {
			if (this.aClass189Array8584 != null) {
				if (i_1 == 4096) {
					this.method13850();
				} else if (i_1 == 8192) {
					this.method13809();
				} else if (i_1 == 12288) {
					this.method13810();
				} else {
					int i_2 = Class382.anIntArray4657[i_1];
					int i_3 = Class382.anIntArray4661[i_1];
					synchronized (this) {
						int i_5;
						int i_6;
						for (i_5 = 0; i_5 < this.anInt8579; i_5++) {
							i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
							this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
							this.anIntArray8580[i_5] = i_6;
							if (this.aClass189Array8584[i_5] != null) {
								i_6 = this.aClass189Array8584[i_5].anInt2379 * i_2 + this.aClass189Array8584[i_5].anInt2380 * i_3 >> 14;
								this.aClass189Array8584[i_5].anInt2379 = this.aClass189Array8584[i_5].anInt2379 * i_3 - this.aClass189Array8584[i_5].anInt2380 * i_2 >> 14;
								this.aClass189Array8584[i_5].anInt2380 = i_6;
							}
						}

						if (this.aClass195Array8599 != null) {
							for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
								if (this.aClass195Array8599[i_5] != null) {
									i_6 = this.aClass195Array8599[i_5].anInt2412 * i_2 + this.aClass195Array8599[i_5].anInt2410 * i_3 >> 14;
									this.aClass195Array8599[i_5].anInt2412 = this.aClass195Array8599[i_5].anInt2412 * i_3 - this.aClass195Array8599[i_5].anInt2410 * i_2 >> 14;
									this.aClass195Array8599[i_5].anInt2410 = i_6;
								}
							}
						}

						for (i_5 = this.anInt8579; i_5 < this.anInt8578; i_5++) {
							i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
							this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
							this.anIntArray8580[i_5] = i_6;
						}

						this.anInt8598 = 0;
						this.aBool8621 = false;
					}
				}
			} else {
				this.f(i_1);
			}

		}
	}

	public void method11295() {
	}

	final void method13848(boolean bool_1, boolean bool_2, boolean bool_3, int i_4) {
		short s_5 = this.aShortArray8587[i_4];
		short s_6 = this.aShortArray8588[i_4];
		short s_7 = this.aShortArray8642[i_4];
		if (this.aShortArray8603 != null && this.aShortArray8603[i_4] != -1) {
			int i_8 = -16777216;
			if (this.aByteArray8602 != null) {
				i_8 = 255 - (this.aByteArray8602[i_4] & 0xff) << 24;
			}

			if (this.anIntArray8594[i_4] == -1) {
				int i_9 = i_8 | this.anIntArray8592[i_4] & 0xffffff;
				this.aClass144_8566.method2424(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], this.aFloatArray8637[s_5], this.aFloatArray8637[s_6], this.aFloatArray8637[s_7], this.aFloatArrayArray8635[i_4][0], this.aFloatArrayArray8635[i_4][1], this.aFloatArrayArray8635[i_4][2], this.aFloatArrayArray8591[i_4][0], this.aFloatArrayArray8591[i_4][1], this.aFloatArrayArray8591[i_4][2], i_9, i_9, i_9, this.aClass185_8564.anInt2307, 0.0F, 0.0F, 0.0F, this.aShortArray8603[i_4]);
			} else {
				this.aClass144_8566.method2424(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], this.aFloatArray8637[s_5], this.aFloatArray8637[s_6], this.aFloatArray8637[s_7], this.aFloatArrayArray8635[i_4][0], this.aFloatArrayArray8635[i_4][1], this.aFloatArrayArray8635[i_4][2], this.aFloatArrayArray8591[i_4][0], this.aFloatArrayArray8591[i_4][1], this.aFloatArrayArray8591[i_4][2], i_8 | this.anIntArray8592[i_4] & 0xffffff, i_8 | this.anIntArray8631[i_4] & 0xffffff, i_8 | this.anIntArray8594[i_4] & 0xffffff, this.aClass185_8564.anInt2307, 0.0F, 0.0F, 0.0F, this.aShortArray8603[i_4]);
			}
		} else {
			if (this.aByteArray8602 == null) {
				this.aClass144_8566.anInt1674 = 0;
			} else {
				this.aClass144_8566.anInt1674 = this.aByteArray8602[i_4] & 0xff;
			}

			if (this.anIntArray8594[i_4] == -1) {
				this.aClass144_8566.method2428(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], Class335.anIntArray3916[this.anIntArray8592[i_4] & 0xffff]);
			} else {
				this.aClass144_8566.method2426(bool_1, bool_2, bool_3, this.aFloatArray8605[s_5], this.aFloatArray8605[s_6], this.aFloatArray8605[s_7], this.aFloatArray8590[s_5], this.aFloatArray8590[s_6], this.aFloatArray8590[s_7], this.aFloatArray8636[s_5], this.aFloatArray8636[s_6], this.aFloatArray8636[s_7], (float) (this.anIntArray8592[i_4] & 0xffff), (float) (this.anIntArray8631[i_4] & 0xffff), (float) (this.anIntArray8594[i_4] & 0xffff));
			}
		}

	}

	public int YA() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8570;
	}

	void method13850() {
		synchronized (this) {
			int i_2;
			int i_3;
			for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
				i_3 = this.anIntArray8580[i_2];
				this.anIntArray8580[i_2] = this.anIntArray8610[i_2];
				this.anIntArray8610[i_2] = -i_3;
				if (this.aClass189Array8584[i_2] != null) {
					i_3 = this.aClass189Array8584[i_2].anInt2380;
					this.aClass189Array8584[i_2].anInt2380 = this.aClass189Array8584[i_2].anInt2379;
					this.aClass189Array8584[i_2].anInt2379 = -i_3;
				}
			}

			if (this.aClass195Array8599 != null) {
				for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
					if (this.aClass195Array8599[i_2] != null) {
						i_3 = this.aClass195Array8599[i_2].anInt2410;
						this.aClass195Array8599[i_2].anInt2410 = this.aClass195Array8599[i_2].anInt2412;
						this.aClass195Array8599[i_2].anInt2412 = -i_3;
					}
				}
			}

			for (i_2 = this.anInt8579; i_2 < this.anInt8578; i_2++) {
				i_3 = this.anIntArray8580[i_2];
				this.anIntArray8580[i_2] = this.anIntArray8610[i_2];
				this.anIntArray8610[i_2] = -i_3;
			}

			this.anInt8598 = 0;
			this.aBool8621 = false;
		}
	}

	public Shadow ga(Shadow class282_sub50_sub17_1) {
		return null;
	}

	void method13853(boolean bool_1) {
		if (this.aClass505_Sub3_8638.anInt9008 > 1) {
			synchronized (this) {
				this.method13798(bool_1);
			}
		} else {
			this.method13798(bool_1);
		}

	}

	public void bs(int i_1) {
		if ((this.anInt8575 & 0x6) != 6) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = this.anIntArray8581[i_5] * i_3 - this.anIntArray8610[i_5] * i_2 >> 14;
					this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_2 + this.anIntArray8610[i_5] * i_3 >> 14;
					this.anIntArray8581[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void bm(int i_1) {
		if ((this.anInt8575 & 0x6) != 6) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = this.anIntArray8581[i_5] * i_3 - this.anIntArray8610[i_5] * i_2 >> 14;
					this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_2 + this.anIntArray8610[i_5] * i_3 >> 14;
					this.anIntArray8581[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void bf(int i_1) {
		if ((this.anInt8575 & 0x6) != 6) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = this.anIntArray8581[i_5] * i_3 - this.anIntArray8610[i_5] * i_2 >> 14;
					this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_2 + this.anIntArray8610[i_5] * i_3 >> 14;
					this.anIntArray8581[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void bn(int i_1) {
		if ((this.anInt8575 & 0x6) != 6) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = this.anIntArray8581[i_5] * i_3 - this.anIntArray8610[i_5] * i_2 >> 14;
					this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_2 + this.anIntArray8610[i_5] * i_3 >> 14;
					this.anIntArray8581[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void be() {
		if ((this.anInt8575 & 0x10) != 16) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				int i_2;
				for (i_2 = 0; i_2 < this.anInt8578; i_2++) {
					this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
				}

				if (this.aClass189Array8584 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8584[i_2] != null) {
							this.aClass189Array8584[i_2].anInt2379 = -this.aClass189Array8584[i_2].anInt2379;
						}
					}
				}

				if (this.aClass189Array8585 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8585[i_2] != null) {
							this.aClass189Array8585[i_2].anInt2379 = -this.aClass189Array8585[i_2].anInt2379;
						}
					}
				}

				if (this.aClass195Array8599 != null) {
					for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
						if (this.aClass195Array8599[i_2] != null) {
							this.aClass195Array8599[i_2].anInt2412 = -this.aClass195Array8599[i_2].anInt2412;
						}
					}
				}

				short[] shorts_5 = this.aShortArray8587;
				this.aShortArray8587 = this.aShortArray8642;
				this.aShortArray8642 = shorts_5;
				if (this.aFloatArrayArray8635 != null) {
					for (int i_3 = 0; i_3 < this.anInt8586; i_3++) {
						float f_4;
						if (this.aFloatArrayArray8635[i_3] != null) {
							f_4 = this.aFloatArrayArray8635[i_3][0];
							this.aFloatArrayArray8635[i_3][0] = this.aFloatArrayArray8635[i_3][2];
							this.aFloatArrayArray8635[i_3][2] = f_4;
						}

						if (this.aFloatArrayArray8591[i_3] != null) {
							f_4 = this.aFloatArrayArray8591[i_3][0];
							this.aFloatArrayArray8591[i_3][0] = this.aFloatArrayArray8591[i_3][2];
							this.aFloatArrayArray8591[i_3][2] = f_4;
						}
					}
				}

				this.aBool8621 = false;
				this.anInt8598 = 0;
			}
		}
	}

	public void by() {
		if ((this.anInt8575 & 0x10) != 16) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				int i_2;
				for (i_2 = 0; i_2 < this.anInt8578; i_2++) {
					this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
				}

				if (this.aClass189Array8584 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8584[i_2] != null) {
							this.aClass189Array8584[i_2].anInt2379 = -this.aClass189Array8584[i_2].anInt2379;
						}
					}
				}

				if (this.aClass189Array8585 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8585[i_2] != null) {
							this.aClass189Array8585[i_2].anInt2379 = -this.aClass189Array8585[i_2].anInt2379;
						}
					}
				}

				if (this.aClass195Array8599 != null) {
					for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
						if (this.aClass195Array8599[i_2] != null) {
							this.aClass195Array8599[i_2].anInt2412 = -this.aClass195Array8599[i_2].anInt2412;
						}
					}
				}

				short[] shorts_5 = this.aShortArray8587;
				this.aShortArray8587 = this.aShortArray8642;
				this.aShortArray8642 = shorts_5;
				if (this.aFloatArrayArray8635 != null) {
					for (int i_3 = 0; i_3 < this.anInt8586; i_3++) {
						float f_4;
						if (this.aFloatArrayArray8635[i_3] != null) {
							f_4 = this.aFloatArrayArray8635[i_3][0];
							this.aFloatArrayArray8635[i_3][0] = this.aFloatArrayArray8635[i_3][2];
							this.aFloatArrayArray8635[i_3][2] = f_4;
						}

						if (this.aFloatArrayArray8591[i_3] != null) {
							f_4 = this.aFloatArrayArray8591[i_3][0];
							this.aFloatArrayArray8591[i_3][0] = this.aFloatArrayArray8591[i_3][2];
							this.aFloatArrayArray8591[i_3][2] = f_4;
						}
					}
				}

				this.aBool8621 = false;
				this.anInt8598 = 0;
			}
		}
	}

	public void ia(int i_1, int i_2, int i_3) {
		if (i_1 != 0 && (this.anInt8575 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (i_2 != 0 && (this.anInt8575 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (i_3 != 0 && (this.anInt8575 & 0x4) != 4) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] += i_1;
					this.anIntArray8581[i_5] += i_2;
					this.anIntArray8610[i_5] += i_3;
				}

			}
		}
	}

	int method13855(int i_1, int i_2) {
		i_2 = (i_1 & 0x7f) * i_2 >> 7;
		if (i_2 < 2) {
			i_2 = 2;
		} else if (i_2 > 126) {
			i_2 = 126;
		}

		return i_2 + (i_1 & 0xff80);
	}

	public Shadow dr(Shadow class282_sub50_sub17_1) {
		return null;
	}

	void method11288() {
		if (this.aClass505_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
			synchronized (this) {
				this.aBool7023 = false;
				this.notifyAll();
			}
		}

	}

	void method11285() {
		if (this.aClass505_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
			synchronized (this) {
				this.aBool7023 = false;
				this.notifyAll();
			}
		}

	}

	boolean bh() {
		if (this.anIntArrayArray8568 == null) {
			return false;
		} else {
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;
			return true;
		}
	}

	boolean bv() {
		if (this.anIntArrayArray8568 == null) {
			return false;
		} else {
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;
			return true;
		}
	}

	public void bj(int i_1) {
		if ((this.anInt8575 & 0xd) != 13) {
			throw new IllegalStateException();
		} else {
			if (this.aClass189Array8584 != null) {
				if (i_1 == 4096) {
					this.method13850();
				} else if (i_1 == 8192) {
					this.method13809();
				} else if (i_1 == 12288) {
					this.method13810();
				} else {
					int i_2 = Class382.anIntArray4657[i_1];
					int i_3 = Class382.anIntArray4661[i_1];
					synchronized (this) {
						int i_5;
						int i_6;
						for (i_5 = 0; i_5 < this.anInt8579; i_5++) {
							i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
							this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
							this.anIntArray8580[i_5] = i_6;
							if (this.aClass189Array8584[i_5] != null) {
								i_6 = this.aClass189Array8584[i_5].anInt2379 * i_2 + this.aClass189Array8584[i_5].anInt2380 * i_3 >> 14;
								this.aClass189Array8584[i_5].anInt2379 = this.aClass189Array8584[i_5].anInt2379 * i_3 - this.aClass189Array8584[i_5].anInt2380 * i_2 >> 14;
								this.aClass189Array8584[i_5].anInt2380 = i_6;
							}
						}

						if (this.aClass195Array8599 != null) {
							for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
								if (this.aClass195Array8599[i_5] != null) {
									i_6 = this.aClass195Array8599[i_5].anInt2412 * i_2 + this.aClass195Array8599[i_5].anInt2410 * i_3 >> 14;
									this.aClass195Array8599[i_5].anInt2412 = this.aClass195Array8599[i_5].anInt2412 * i_3 - this.aClass195Array8599[i_5].anInt2410 * i_2 >> 14;
									this.aClass195Array8599[i_5].anInt2410 = i_6;
								}
							}
						}

						for (i_5 = this.anInt8579; i_5 < this.anInt8578; i_5++) {
							i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
							this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
							this.anIntArray8580[i_5] = i_6;
						}

						this.anInt8598 = 0;
						this.aBool8621 = false;
					}
				}
			} else {
				this.f(i_1);
			}

		}
	}

	void method11275(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		int i_8 = ints_2.length;
		int i_9;
		int i_10;
		int i_13;
		int i_14;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			if (!this.aBool8589) {
				for (i_9 = 0; i_9 < this.anInt8578; i_9++) {
					this.anIntArray8580[i_9] <<= 4;
					this.anIntArray8581[i_9] <<= 4;
					this.anIntArray8610[i_9] <<= 4;
				}

				this.aBool8589 = true;
			}

			i_9 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_10 = 0; i_10 < i_8; i_10++) {
				int i_11 = ints_2[i_10];
				if (i_11 < this.anIntArrayArray8568.length) {
					int[] ints_12 = this.anIntArrayArray8568[i_11];

					for (i_13 = 0; i_13 < ints_12.length; i_13++) {
						i_14 = ints_12[i_13];
						this.anInt8611 += this.anIntArray8580[i_14];
						this.anInt8607 += this.anIntArray8581[i_14];
						this.anInt8613 += this.anIntArray8610[i_14];
						++i_9;
					}
				}
			}

			if (i_9 > 0) {
				this.anInt8611 = this.anInt8611 / i_9 + i_3;
				this.anInt8607 = this.anInt8607 / i_9 + i_4;
				this.anInt8613 = this.anInt8613 / i_9 + i_5;
			} else {
				this.anInt8611 = i_3;
				this.anInt8607 = i_4;
				this.anInt8613 = i_5;
			}
		} else {
			int[] ints_18;
			int i_19;
			if (i_1 == 1) {
				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;
				if (!this.aBool8589) {
					for (i_9 = 0; i_9 < this.anInt8578; i_9++) {
						this.anIntArray8580[i_9] <<= 4;
						this.anIntArray8581[i_9] <<= 4;
						this.anIntArray8610[i_9] <<= 4;
					}

					this.aBool8589 = true;
				}

				for (i_9 = 0; i_9 < i_8; i_9++) {
					i_10 = ints_2[i_9];
					if (i_10 < this.anIntArrayArray8568.length) {
						ints_18 = this.anIntArrayArray8568[i_10];

						for (i_19 = 0; i_19 < ints_18.length; i_19++) {
							i_13 = ints_18[i_19];
							this.anIntArray8580[i_13] += i_3;
							this.anIntArray8581[i_13] += i_4;
							this.anIntArray8610[i_13] += i_5;
						}
					}
				}
			} else {
				int i_15;
				int i_16;
				if (i_1 == 2) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8568.length) {
							ints_18 = this.anIntArrayArray8568[i_10];
							if ((i_6 & 0x1) == 0) {
								for (i_19 = 0; i_19 < ints_18.length; i_19++) {
									i_13 = ints_18[i_19];
									this.anIntArray8580[i_13] -= this.anInt8611;
									this.anIntArray8581[i_13] -= this.anInt8607;
									this.anIntArray8610[i_13] -= this.anInt8613;
									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = this.anIntArray8581[i_13] * i_14 + this.anIntArray8580[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8581[i_13] = this.anIntArray8581[i_13] * i_15 - this.anIntArray8580[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = this.anIntArray8581[i_13] * i_15 - this.anIntArray8610[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8610[i_13] = this.anIntArray8581[i_13] * i_14 + this.anIntArray8610[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8581[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = this.anIntArray8610[i_13] * i_14 + this.anIntArray8580[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8610[i_13] = this.anIntArray8610[i_13] * i_15 - this.anIntArray8580[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									this.anIntArray8580[i_13] += this.anInt8611;
									this.anIntArray8581[i_13] += this.anInt8607;
									this.anIntArray8610[i_13] += this.anInt8613;
								}
							} else {
								for (i_19 = 0; i_19 < ints_18.length; i_19++) {
									i_13 = ints_18[i_19];
									this.anIntArray8580[i_13] -= this.anInt8611;
									this.anIntArray8581[i_13] -= this.anInt8607;
									this.anIntArray8610[i_13] -= this.anInt8613;
									if (i_3 != 0) {
										i_14 = Class382.anIntArray4657[i_3];
										i_15 = Class382.anIntArray4661[i_3];
										i_16 = this.anIntArray8581[i_13] * i_15 - this.anIntArray8610[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8610[i_13] = this.anIntArray8581[i_13] * i_14 + this.anIntArray8610[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8581[i_13] = i_16;
									}

									if (i_5 != 0) {
										i_14 = Class382.anIntArray4657[i_5];
										i_15 = Class382.anIntArray4661[i_5];
										i_16 = this.anIntArray8581[i_13] * i_14 + this.anIntArray8580[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8581[i_13] = this.anIntArray8581[i_13] * i_15 - this.anIntArray8580[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Class382.anIntArray4657[i_4];
										i_15 = Class382.anIntArray4661[i_4];
										i_16 = this.anIntArray8610[i_13] * i_14 + this.anIntArray8580[i_13] * i_15 + 16383 >> 14;
										this.anIntArray8610[i_13] = this.anIntArray8610[i_13] * i_15 - this.anIntArray8580[i_13] * i_14 + 16383 >> 14;
										this.anIntArray8580[i_13] = i_16;
									}

									this.anIntArray8580[i_13] += this.anInt8611;
									this.anIntArray8581[i_13] += this.anInt8607;
									this.anIntArray8610[i_13] += this.anInt8613;
								}
							}
						}
					}
				} else if (i_1 == 3) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < this.anIntArrayArray8568.length) {
							ints_18 = this.anIntArrayArray8568[i_10];

							for (i_19 = 0; i_19 < ints_18.length; i_19++) {
								i_13 = ints_18[i_19];
								this.anIntArray8580[i_13] -= this.anInt8611;
								this.anIntArray8581[i_13] -= this.anInt8607;
								this.anIntArray8610[i_13] -= this.anInt8613;
								this.anIntArray8580[i_13] = this.anIntArray8580[i_13] * i_3 / 128;
								this.anIntArray8581[i_13] = this.anIntArray8581[i_13] * i_4 / 128;
								this.anIntArray8610[i_13] = this.anIntArray8610[i_13] * i_5 / 128;
								this.anIntArray8580[i_13] += this.anInt8611;
								this.anIntArray8581[i_13] += this.anInt8607;
								this.anIntArray8610[i_13] += this.anInt8613;
							}
						}
					}
				} else {
					Class193 class193_20;
					Class176 class176_22;
					if (i_1 == 5) {
						if (this.anIntArrayArray8608 != null && this.aByteArray8602 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8608.length) {
									ints_18 = this.anIntArrayArray8608[i_10];

									for (i_19 = 0; i_19 < ints_18.length; i_19++) {
										i_13 = ints_18[i_19];
										i_14 = (this.aByteArray8602[i_13] & 0xff) + i_3 * 8;
										if (i_14 < 0) {
											i_14 = 0;
										} else if (i_14 > 255) {
											i_14 = 255;
										}

										this.aByteArray8602[i_13] = (byte) i_14;
									}
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_9 = 0; i_9 < this.anInt8617; i_9++) {
									class193_20 = this.aClass193Array8618[i_9];
									class176_22 = this.aClass176Array8582[i_9];
									class176_22.anInt2199 = (class176_22.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (this.aByteArray8602[class193_20.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
								}
							}
						}
					} else if (i_1 == 7) {
						if (this.anIntArrayArray8608 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8608.length) {
									ints_18 = this.anIntArrayArray8608[i_10];

									for (i_19 = 0; i_19 < ints_18.length; i_19++) {
										i_13 = ints_18[i_19];
										i_14 = this.aShortArray8604[i_13] & 0xffff;
										i_15 = i_14 >> 10 & 0x3f;
										i_16 = i_14 >> 7 & 0x7;
										int i_17 = i_14 & 0x7f;
										i_15 = i_15 + i_3 & 0x3f;
										i_16 += i_4;
										if (i_16 < 0) {
											i_16 = 0;
										} else if (i_16 > 7) {
											i_16 = 7;
										}

										i_17 += i_5;
										if (i_17 < 0) {
											i_17 = 0;
										} else if (i_17 > 127) {
											i_17 = 127;
										}

										this.aShortArray8604[i_13] = (short) (i_15 << 10 | i_16 << 7 | i_17);
									}

									this.aBool8609 = true;
								}
							}

							if (this.aClass193Array8618 != null) {
								for (i_9 = 0; i_9 < this.anInt8617; i_9++) {
									class193_20 = this.aClass193Array8618[i_9];
									class176_22 = this.aClass176Array8582[i_9];
									class176_22.anInt2199 = (class176_22.anInt2199 * -1022818925 * -1303125861 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_20.anInt2393 * -1274099887 * 142270897] & 0xffff, 634773727) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
								}
							}
						}
					} else {
						Class176 class176_21;
						if (i_1 == 8) {
							if (this.anIntArrayArray8620 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8620.length) {
										ints_18 = this.anIntArrayArray8620[i_10];

										for (i_19 = 0; i_19 < ints_18.length; i_19++) {
											class176_21 = this.aClass176Array8582[ints_18[i_19]];
											class176_21.anInt2192 = (class176_21.anInt2192 * -943685543 + i_3 * -943685543) * -310982679;
											class176_21.anInt2189 = (class176_21.anInt2189 * 1414070385 + i_4 * 1414070385) * 1349697681;
										}
									}
								}
							}
						} else if (i_1 == 10) {
							if (this.anIntArrayArray8620 != null) {
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < this.anIntArrayArray8620.length) {
										ints_18 = this.anIntArrayArray8620[i_10];

										for (i_19 = 0; i_19 < ints_18.length; i_19++) {
											class176_21 = this.aClass176Array8582[ints_18[i_19]];
											class176_21.aFloat2190 = class176_21.aFloat2190 * (float) i_3 / 128.0F;
											class176_21.aFloat2191 = class176_21.aFloat2191 * (float) i_4 / 128.0F;
										}
									}
								}
							}
						} else if (i_1 == 9 && this.anIntArrayArray8620 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < this.anIntArrayArray8620.length) {
									ints_18 = this.anIntArrayArray8620[i_10];

									for (i_19 = 0; i_19 < ints_18.length; i_19++) {
										class176_21 = this.aClass176Array8582[ints_18[i_19]];
										class176_21.anInt2194 = (class176_21.anInt2194 * 2076699445 * 156323613 + i_3 & 0x3fff) * 2076699445 * 156323613;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public void bq() {
		if ((this.anInt8575 & 0x10) != 16) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				int i_2;
				for (i_2 = 0; i_2 < this.anInt8578; i_2++) {
					this.anIntArray8610[i_2] = -this.anIntArray8610[i_2];
				}

				if (this.aClass189Array8584 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8584[i_2] != null) {
							this.aClass189Array8584[i_2].anInt2379 = -this.aClass189Array8584[i_2].anInt2379;
						}
					}
				}

				if (this.aClass189Array8585 != null) {
					for (i_2 = 0; i_2 < this.anInt8579; i_2++) {
						if (this.aClass189Array8585[i_2] != null) {
							this.aClass189Array8585[i_2].anInt2379 = -this.aClass189Array8585[i_2].anInt2379;
						}
					}
				}

				if (this.aClass195Array8599 != null) {
					for (i_2 = 0; i_2 < this.anInt8586; i_2++) {
						if (this.aClass195Array8599[i_2] != null) {
							this.aClass195Array8599[i_2].anInt2412 = -this.aClass195Array8599[i_2].anInt2412;
						}
					}
				}

				short[] shorts_5 = this.aShortArray8587;
				this.aShortArray8587 = this.aShortArray8642;
				this.aShortArray8642 = shorts_5;
				if (this.aFloatArrayArray8635 != null) {
					for (int i_3 = 0; i_3 < this.anInt8586; i_3++) {
						float f_4;
						if (this.aFloatArrayArray8635[i_3] != null) {
							f_4 = this.aFloatArrayArray8635[i_3][0];
							this.aFloatArrayArray8635[i_3][0] = this.aFloatArrayArray8635[i_3][2];
							this.aFloatArrayArray8635[i_3][2] = f_4;
						}

						if (this.aFloatArrayArray8591[i_3] != null) {
							f_4 = this.aFloatArrayArray8591[i_3][0];
							this.aFloatArrayArray8591[i_3][0] = this.aFloatArrayArray8591[i_3][2];
							this.aFloatArrayArray8591[i_3][2] = f_4;
						}
					}
				}

				this.aBool8621 = false;
				this.anInt8598 = 0;
			}
		}
	}

	void bb(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_6 = 0; i_6 < this.anInt8578; i_6++) {
				this.anInt8611 += this.anIntArray8580[i_6];
				this.anInt8607 += this.anIntArray8581[i_6];
				this.anInt8613 += this.anIntArray8610[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				this.anInt8611 = this.anInt8611 / i_5 + i_2;
				this.anInt8607 = this.anInt8607 / i_5 + i_3;
				this.anInt8613 = this.anInt8613 / i_5 + i_4;
			} else {
				this.anInt8611 = i_2;
				this.anInt8607 = i_3;
				this.anInt8613 = i_4;
			}
		} else if (i_1 == 1) {
			for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
				this.anIntArray8580[i_5] += i_2;
				this.anIntArray8581[i_5] += i_3;
				this.anIntArray8610[i_5] += i_4;
			}
		} else {
			int i_7;
			int i_8;
			if (i_1 == 2) {
				for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] -= this.anInt8611;
					this.anIntArray8581[i_5] -= this.anInt8607;
					this.anIntArray8610[i_5] -= this.anInt8613;
					if (i_4 != 0) {
						i_6 = Class382.anIntArray4657[i_4];
						i_7 = Class382.anIntArray4661[i_4];
						i_8 = this.anIntArray8581[i_5] * i_6 + this.anIntArray8580[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8581[i_5] = this.anIntArray8581[i_5] * i_7 - this.anIntArray8580[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8580[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Class382.anIntArray4657[i_2];
						i_7 = Class382.anIntArray4661[i_2];
						i_8 = this.anIntArray8581[i_5] * i_7 - this.anIntArray8610[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_6 + this.anIntArray8610[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8581[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Class382.anIntArray4657[i_3];
						i_7 = Class382.anIntArray4661[i_3];
						i_8 = this.anIntArray8610[i_5] * i_6 + this.anIntArray8580[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_7 - this.anIntArray8580[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8580[i_5] = i_8;
					}

					this.anIntArray8580[i_5] += this.anInt8611;
					this.anIntArray8581[i_5] += this.anInt8607;
					this.anIntArray8610[i_5] += this.anInt8613;
				}
			} else if (i_1 == 3) {
				for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] -= this.anInt8611;
					this.anIntArray8581[i_5] -= this.anInt8607;
					this.anIntArray8610[i_5] -= this.anInt8613;
					this.anIntArray8580[i_5] = this.anIntArray8580[i_5] * i_2 / 128;
					this.anIntArray8581[i_5] = this.anIntArray8581[i_5] * i_3 / 128;
					this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_4 / 128;
					this.anIntArray8580[i_5] += this.anInt8611;
					this.anIntArray8581[i_5] += this.anInt8607;
					this.anIntArray8610[i_5] += this.anInt8613;
				}
			} else {
				Class193 class193_10;
				Class176 class176_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
						i_6 = (this.aByteArray8602[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0) {
							i_6 = 0;
						} else if (i_6 > 255) {
							i_6 = 255;
						}

						this.aByteArray8602[i_5] = (byte) i_6;
					}

					if (this.aClass193Array8618 != null) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class193_10 = this.aClass193Array8618[i_5];
							class176_11 = this.aClass176Array8582[i_5];
							class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (this.aByteArray8602[class193_10.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
						}
					}
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
						i_6 = this.aShortArray8604[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
						i_8 = i_6 >> 7 & 0x7;
						int i_9 = i_6 & 0x7f;
						i_7 = i_7 + i_2 & 0x3f;
						i_8 += i_3;
						if (i_8 < 0) {
							i_8 = 0;
						} else if (i_8 > 7) {
							i_8 = 7;
						}

						i_9 += i_4;
						if (i_9 < 0) {
							i_9 = 0;
						} else if (i_9 > 127) {
							i_9 = 127;
						}

						this.aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					this.aBool8609 = true;
					if (this.aClass193Array8618 != null) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class193_10 = this.aClass193Array8618[i_5];
							class176_11 = this.aClass176Array8582[i_5];
							class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_10.anInt2393 * -1274099887 * 142270897] & 0xffff, 369062758) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
						}
					}
				} else {
					Class176 class176_12;
					if (i_1 == 8) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.anInt2192 = (class176_12.anInt2192 * -943685543 + i_2 * -943685543) * -310982679;
							class176_12.anInt2189 = (class176_12.anInt2189 * 1414070385 + i_3 * 1414070385) * 1349697681;
						}
					} else if (i_1 == 10) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.aFloat2190 = class176_12.aFloat2190 * (float) i_2 / 128.0F;
							class176_12.aFloat2191 = class176_12.aFloat2191 * (float) i_3 / 128.0F;
						}
					} else if (i_1 == 9) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.anInt2194 = (class176_12.anInt2194 * 2076699445 * 156323613 + i_2 & 0x3fff) * 2076699445 * 156323613;
						}
					}
				}
			}
		}

	}

	public void method11298(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8569 != null) {
			Class185 class185_4 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
			Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
			matrix44var_5.method5209(matrix44var_1);
			if (bool_3) {
				matrix44var_5.method5207();
			}

			Matrix44Arr matrix44arr_6 = class185_4.aClass384_2317;
			matrix44arr_6.fromVarMatrix44(matrix44var_5);
			float[] floats_7 = new float[3];

			for (int i_8 = 0; i_8 < this.anInt8579; i_8++) {
				if ((i_2 & this.aShortArray8569[i_8]) != 0) {
					matrix44arr_6.method6527((float) this.anIntArray8580[i_8], (float) this.anIntArray8581[i_8], (float) this.anIntArray8610[i_8], floats_7);
					this.anIntArray8580[i_8] = (int) floats_7[0];
					this.anIntArray8581[i_8] = (int) floats_7[1];
					this.anIntArray8610[i_8] = (int) floats_7[2];
				}
			}
		}

	}

	public int ya() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8627;
	}

	public void method11290(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8569 != null) {
			Class185 class185_4 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
			Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
			matrix44var_5.method5209(matrix44var_1);
			if (bool_3) {
				matrix44var_5.method5207();
			}

			Matrix44Arr matrix44arr_6 = class185_4.aClass384_2317;
			matrix44arr_6.fromVarMatrix44(matrix44var_5);
			float[] floats_7 = new float[3];

			for (int i_8 = 0; i_8 < this.anInt8579; i_8++) {
				if ((i_2 & this.aShortArray8569[i_8]) != 0) {
					matrix44arr_6.method6527((float) this.anIntArray8580[i_8], (float) this.anIntArray8581[i_8], (float) this.anIntArray8610[i_8], floats_7);
					this.anIntArray8580[i_8] = (int) floats_7[0];
					this.anIntArray8581[i_8] = (int) floats_7[1];
					this.anIntArray8610[i_8] = (int) floats_7[2];
				}
			}
		}

	}

	public void method11291(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8569 != null) {
			Class185 class185_4 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
			Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
			matrix44var_5.method5209(matrix44var_1);
			if (bool_3) {
				matrix44var_5.method5207();
			}

			Matrix44Arr matrix44arr_6 = class185_4.aClass384_2317;
			matrix44arr_6.fromVarMatrix44(matrix44var_5);
			float[] floats_7 = new float[3];

			for (int i_8 = 0; i_8 < this.anInt8579; i_8++) {
				if ((i_2 & this.aShortArray8569[i_8]) != 0) {
					matrix44arr_6.method6527((float) this.anIntArray8580[i_8], (float) this.anIntArray8581[i_8], (float) this.anIntArray8610[i_8], floats_7);
					this.anIntArray8580[i_8] = (int) floats_7[0];
					this.anIntArray8581[i_8] = (int) floats_7[1];
					this.anIntArray8610[i_8] = (int) floats_7[2];
				}
			}
		}

	}

	public void method11292(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8569 != null) {
			Class185 class185_4 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
			Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
			matrix44var_5.method5209(matrix44var_1);
			if (bool_3) {
				matrix44var_5.method5207();
			}

			Matrix44Arr matrix44arr_6 = class185_4.aClass384_2317;
			matrix44arr_6.fromVarMatrix44(matrix44var_5);
			float[] floats_7 = new float[3];

			for (int i_8 = 0; i_8 < this.anInt8579; i_8++) {
				if ((i_2 & this.aShortArray8569[i_8]) != 0) {
					matrix44arr_6.method6527((float) this.anIntArray8580[i_8], (float) this.anIntArray8581[i_8], (float) this.anIntArray8610[i_8], floats_7);
					this.anIntArray8580[i_8] = (int) floats_7[0];
					this.anIntArray8581[i_8] = (int) floats_7[1];
					this.anIntArray8610[i_8] = (int) floats_7[2];
				}
			}
		}

	}

	public void pa(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
		if (i_1 == 3) {
			if ((this.anInt8575 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((this.anInt8575 & 0x2) != 2) {
			throw new IllegalStateException();
		}

		if (!this.aBool8621) {
			this.method13876();
		}

		int i_8 = i_5 + this.aShort8634;
		int i_9 = i_5 + this.aShort8627;
		int i_10 = i_7 + this.aShort8571;
		int i_11 = i_7 + this.aShort8629;
		if (i_1 == 4 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
			int[][] ints_12 = class390_3.tileHeights;
			int[][] ints_13 = null;
			if (class390_4 != null) {
				ints_13 = class390_4.tileHeights;
			}

			if (i_1 != 4 && i_1 != 5) {
				i_8 >>= class390_3.tileScale;
				i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				i_10 >>= class390_3.tileScale;
				i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				if (ints_12[i_8][i_10] == i_6 && ints_12[i_9][i_10] == i_6 && ints_12[i_8][i_11] == i_6 && ints_12[i_9][i_11] == i_6) {
					return;
				}
			} else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length) {
				return;
			}

			synchronized (this) {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				if (i_1 == 1) {
					i_15 = class390_3.tileUnits - 1;

					for (i_16 = 0; i_16 < this.anInt8579; i_16++) {
						i_17 = i_5 + this.anIntArray8580[i_16];
						i_18 = i_7 + this.anIntArray8610[i_16];
						i_19 = i_17 & i_15;
						i_20 = i_18 & i_15;
						i_21 = i_17 >> class390_3.tileScale;
						i_22 = i_18 >> class390_3.tileScale;
						i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + i_19 * ints_12[i_21 + 1][i_22] >> class390_3.tileScale;
						i_24 = (class390_3.tileUnits - i_19) * ints_12[i_21][i_22 + 1] + i_19 * ints_12[i_21 + 1][i_22 + 1] >> class390_3.tileScale;
						i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
						this.anIntArray8581[i_16] = i_25 + this.anIntArray8581[i_16] - i_6;
					}

					for (i_16 = this.anInt8579; i_16 < this.anInt8578; i_16++) {
						i_17 = i_5 + this.anIntArray8580[i_16];
						i_18 = i_7 + this.anIntArray8610[i_16];
						i_19 = i_17 & i_15;
						i_20 = i_18 & i_15;
						i_21 = i_17 >> class390_3.tileScale;
						i_22 = i_18 >> class390_3.tileScale;
						if (i_21 >= 0 && i_21 < ints_12.length - 1 && i_22 >= 0 && i_22 < ints_12[0].length - 1) {
							i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + i_19 * ints_12[i_21 + 1][i_22] >> class390_3.tileScale;
							i_24 = (class390_3.tileUnits - i_19) * ints_12[i_21][i_22 + 1] + i_19 * ints_12[i_21 + 1][i_22 + 1] >> class390_3.tileScale;
							i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
							this.anIntArray8581[i_16] = i_25 + this.anIntArray8581[i_16] - i_6;
						}
					}
				} else {
					int i_26;
					if (i_1 == 2) {
						if (this.aShort8570 == 0) {
							return;
						}

						i_15 = class390_3.tileUnits - 1;

						for (i_16 = 0; i_16 < this.anInt8579; i_16++) {
							i_17 = (this.anIntArray8581[i_16] << 16) / this.aShort8570;
							if (i_17 < i_2) {
								i_18 = i_5 + this.anIntArray8580[i_16];
								i_19 = i_7 + this.anIntArray8610[i_16];
								i_20 = i_18 & i_15;
								i_21 = i_19 & i_15;
								i_22 = i_18 >> class390_3.tileScale;
								i_23 = i_19 >> class390_3.tileScale;
								i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
								i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
								i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
								this.anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
							} else {
								this.anIntArray8581[i_16] = this.anIntArray8581[i_16];
							}
						}

						for (i_16 = this.anInt8579; i_16 < this.anInt8578; i_16++) {
							i_17 = (this.anIntArray8581[i_16] << 16) / this.aShort8570;
							if (i_17 < i_2) {
								i_18 = i_5 + this.anIntArray8580[i_16];
								i_19 = i_7 + this.anIntArray8610[i_16];
								i_20 = i_18 & i_15;
								i_21 = i_19 & i_15;
								i_22 = i_18 >> class390_3.tileScale;
								i_23 = i_19 >> class390_3.tileScale;
								if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1) {
									i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
									i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
									i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
									this.anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
								}
							} else {
								this.anIntArray8581[i_16] = this.anIntArray8581[i_16];
							}
						}
					} else if (i_1 == 3) {
						i_15 = (i_2 & 0xff) * 4;
						i_16 = (i_2 >> 8 & 0xff) * 4;
						i_17 = (i_2 >> 16 & 0xff) << 6;
						i_18 = (i_2 >> 24 & 0xff) << 6;
						if (i_5 - (i_15 >> 1) < 0 || i_5 + class390_3.tileUnits + (i_15 >> 1) >= class390_3.width << class390_3.tileScale || i_7 - (i_16 >> 1) < 0 || class390_3.tileUnits + (i_16 >> 1) + i_7 >= class390_3.length << class390_3.tileScale) {
							return;
						}

						this.method11281(class390_3, i_5, i_6, i_7, i_15, i_16, i_17, i_18);
					} else if (i_1 == 4) {
						i_15 = class390_4.tileUnits - 1;
						i_16 = this.aShort8625 - this.aShort8570;

						for (i_17 = 0; i_17 < this.anInt8579; i_17++) {
							i_18 = i_5 + this.anIntArray8580[i_17];
							i_19 = i_7 + this.anIntArray8610[i_17];
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_4.tileScale;
							i_23 = i_19 >> class390_4.tileScale;
							i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
							i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
							i_26 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
							this.anIntArray8581[i_17] += i_16 + (i_26 - i_6);
						}

						for (i_17 = this.anInt8579; i_17 < this.anInt8578; i_17++) {
							i_18 = i_5 + this.anIntArray8580[i_17];
							i_19 = i_7 + this.anIntArray8610[i_17];
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_4.tileScale;
							i_23 = i_19 >> class390_4.tileScale;
							if (i_22 >= 0 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_4.length - 1) {
								i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
								i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
								i_26 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
								this.anIntArray8581[i_17] += i_16 + (i_26 - i_6);
							}
						}
					} else if (i_1 == 5) {
						i_15 = class390_4.tileUnits - 1;
						i_16 = this.aShort8625 - this.aShort8570;

						int i_27;
						int i_28;
						for (i_17 = 0; i_17 < this.anInt8579; i_17++) {
							i_18 = i_5 + this.anIntArray8580[i_17];
							i_19 = i_7 + this.anIntArray8610[i_17];
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_3.tileScale;
							i_23 = i_19 >> class390_3.tileScale;
							i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
							i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
							i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
							i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
							i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
							i_27 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
							i_28 = i_26 - i_27 - i_2;
							this.anIntArray8581[i_17] = (i_28 * ((this.anIntArray8581[i_17] << 8) / i_16) >> 8) - (i_6 - i_26);
						}

						for (i_17 = this.anInt8579; i_17 < this.anInt8578; i_17++) {
							i_18 = i_5 + this.anIntArray8580[i_17];
							i_19 = i_7 + this.anIntArray8610[i_17];
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_3.tileScale;
							i_23 = i_19 >> class390_3.tileScale;
							if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1 && i_23 < class390_4.length - 1) {
								i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
								i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
								i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
								i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
								i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
								i_27 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
								i_28 = i_26 - i_27 - i_2;
								this.anIntArray8581[i_17] = (i_28 * ((this.anIntArray8581[i_17] << 8) / i_16) >> 8) - (i_6 - i_26);
							}
						}
					}
				}

				this.aBool8621 = false;
			}
		}

	}

	final void method13868(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, boolean bool_5, boolean bool_6) {
		if (this.anIntArray8594[i_4] != -2) {
			short s_7 = this.aShortArray8587[i_4];
			short s_8 = this.aShortArray8588[i_4];
			short s_9 = this.aShortArray8642[i_4];
			float f_10 = this.aFloatArray8590[s_7];
			float f_11 = this.aFloatArray8590[s_8];
			float f_12 = this.aFloatArray8590[s_9];
			if (!bool_5 || f_10 != -5000.0F && f_11 != -5000.0F && f_12 != -5000.0F) {
				float f_13 = this.aFloatArray8605[s_7];
				float f_14 = this.aFloatArray8605[s_8];
				float f_15 = this.aFloatArray8605[s_9];
				if (this.anIntArray8643[i_4] != -1 || (f_10 - f_11) * (f_15 - f_14) - (f_13 - f_14) * (f_12 - f_11) > 0.0F) {
					if (f_10 >= 0.0F && f_11 >= 0.0F && f_12 >= 0.0F && f_10 <= (float) this.aClass185_8564.anInt2337 && f_11 <= (float) this.aClass185_8564.anInt2337 && f_12 <= (float) this.aClass185_8564.anInt2337) {
						this.aClass144_8566.aBool1708 = false;
					} else {
						this.aClass144_8566.aBool1708 = true;
					}

					int i_16;
					if (bool_6) {
						i_16 = this.anIntArray8643[i_4];
						if (i_16 == -1 || !this.aClass193Array8618[i_16].aBool2399) {
							this.method13818(bool_1, bool_2, bool_3, i_4);
						}
					} else {
						i_16 = this.anIntArray8643[i_4];
						if (i_16 != -1) {
							Class193 class193_17 = this.aClass193Array8618[i_16];
							Class176 class176_18 = this.aClass176Array8582[i_16];
							if (!class193_17.aBool2399) {
								this.method13848(bool_1, bool_2, bool_3, i_4);
							}

							this.aClass505_Sub3_8638.method14372(bool_1, bool_2, bool_3, class176_18.anInt2195, class176_18.anInt2196, class176_18.aFloat2193, class176_18.anInt2197, class176_18.anInt2198, class193_17.aShort2396 & 0xffff, class176_18.anInt2199, class193_17.aByte2398, class193_17.aByte2397);
						} else {
							this.method13848(bool_1, bool_2, bool_3, i_4);
						}
					}
				}
			}
		}

	}

	public int cp() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8634;
	}

	public void method11315(Matrix44Var matrix44var_1) {
		this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Matrix44Arr matrix44arr_2 = this.aClass185_8564.aClass384_2317;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (this.aClass87Array8615 != null) {
			for (i_3 = 0; i_3 < this.aClass87Array8615.length; i_3++) {
				Surface class87_4 = this.aClass87Array8615[i_3];
				Surface class87_5 = class87_4;
				if (class87_4.aClass87_835 != null) {
					class87_5 = class87_4.aClass87_835;
				}

				class87_5.anInt844 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt836 * 1502404273 * -1572033967]) * -1929058355 * -75866875;
				class87_5.anInt841 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt836 * 1502404273 * -1572033967]) * 996785411 * 1618253227;
				class87_5.anInt847 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt836 * 1502404273 * -1572033967] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt836 * 1502404273 * -1572033967]) * 976806429 * -489230283;
				class87_5.anInt834 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt837 * -2021469179 * -1955014451]) * -458323579 * 1747322701;
				class87_5.anInt843 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt837 * -2021469179 * -1955014451]) * 543149547 * -174394685;
				class87_5.anInt845 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt837 * -2021469179 * -1955014451] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt837 * -2021469179 * -1955014451]) * 1054448197 * 305293453;
				class87_5.anInt846 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class87_4.anInt838 * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
				class87_5.anInt840 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class87_4.anInt838 * -1292195173 * -2135413869]) * -1652520905 * 950906247;
				class87_5.anInt848 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class87_4.anInt838 * -1292195173 * -2135413869] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class87_4.anInt838 * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
			}
		}

		if (this.aClass172Array8616 != null) {
			for (i_3 = 0; i_3 < this.aClass172Array8616.length; i_3++) {
				SurfaceSkin class172_6 = this.aClass172Array8616[i_3];
				SurfaceSkin class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null) {
					class172_7 = class172_6.aClass172_2114;
				}

				if (class172_6.aClass384_2116 != null) {
					class172_6.aClass384_2116.method6562(matrix44arr_2);
				} else {
					class172_6.aClass384_2116 = new Matrix44Arr(matrix44arr_2);
				}

				class172_7.anInt2113 = (int) (matrix44arr_2.buf[12] + matrix44arr_2.buf[0] * (float) this.anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[4] * (float) this.anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[8] * (float) this.anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
				class172_7.anInt2117 = (int) (matrix44arr_2.buf[13] + matrix44arr_2.buf[1] * (float) this.anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[5] * (float) this.anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[9] * (float) this.anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
				class172_7.anInt2118 = (int) (matrix44arr_2.buf[14] + matrix44arr_2.buf[2] * (float) this.anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[6] * (float) this.anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44arr_2.buf[10] * (float) this.anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
			}
		}

	}

	public void method11263(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (this.aShortArray8569 != null) {
			Class185 class185_4 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
			Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
			matrix44var_5.method5209(matrix44var_1);
			if (bool_3) {
				matrix44var_5.method5207();
			}

			Matrix44Arr matrix44arr_6 = class185_4.aClass384_2317;
			matrix44arr_6.fromVarMatrix44(matrix44var_5);
			float[] floats_7 = new float[3];

			for (int i_8 = 0; i_8 < this.anInt8579; i_8++) {
				if ((i_2 & this.aShortArray8569[i_8]) != 0) {
					matrix44arr_6.method6527((float) this.anIntArray8580[i_8], (float) this.anIntArray8581[i_8], (float) this.anIntArray8610[i_8], floats_7);
					this.anIntArray8580[i_8] = (int) floats_7[0];
					this.anIntArray8581[i_8] = (int) floats_7[1];
					this.anIntArray8610[i_8] = (int) floats_7[2];
				}
			}
		}

	}

	public void bi(int i_1) {
		if ((this.anInt8575 & 0x5) != 5) {
			throw new IllegalStateException();
		} else {
			if (i_1 == 4096) {
				this.method13805();
			} else if (i_1 == 8192) {
				this.method13806();
			} else if (i_1 == 12288) {
				this.method13807();
			} else {
				int i_2 = Class382.anIntArray4657[i_1];
				int i_3 = Class382.anIntArray4661[i_1];
				synchronized (this) {
					for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
						int i_6 = this.anIntArray8610[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
						this.anIntArray8580[i_5] = i_6;
					}

					this.method13812();
				}
			}

		}
	}

	public void W(short s_1, short s_2) {
		if (this.aShortArray8603 != null) {
			if (!this.aBool8640 && s_2 >= 0) {
				TextureDetails class169_3 = this.aClass505_Sub3_8638.anInterface22_5834.method144(s_2 & 0xffff, -1877330793);
				if (class169_3.textureSpeedU != 0 || class169_3.textureSpeedV != 0) {
					this.aBool8640 = true;
				}
			}

			for (int i_4 = 0; i_4 < this.anInt8586; i_4++) {
				if (this.aShortArray8603[i_4] == s_1) {
					this.aShortArray8603[i_4] = s_2;
				}
			}
		}

	}

	public int dd() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8625;
	}

	void bo(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			this.anInt8611 = 0;
			this.anInt8607 = 0;
			this.anInt8613 = 0;

			for (i_6 = 0; i_6 < this.anInt8578; i_6++) {
				this.anInt8611 += this.anIntArray8580[i_6];
				this.anInt8607 += this.anIntArray8581[i_6];
				this.anInt8613 += this.anIntArray8610[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				this.anInt8611 = this.anInt8611 / i_5 + i_2;
				this.anInt8607 = this.anInt8607 / i_5 + i_3;
				this.anInt8613 = this.anInt8613 / i_5 + i_4;
			} else {
				this.anInt8611 = i_2;
				this.anInt8607 = i_3;
				this.anInt8613 = i_4;
			}
		} else if (i_1 == 1) {
			for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
				this.anIntArray8580[i_5] += i_2;
				this.anIntArray8581[i_5] += i_3;
				this.anIntArray8610[i_5] += i_4;
			}
		} else {
			int i_7;
			int i_8;
			if (i_1 == 2) {
				for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] -= this.anInt8611;
					this.anIntArray8581[i_5] -= this.anInt8607;
					this.anIntArray8610[i_5] -= this.anInt8613;
					if (i_4 != 0) {
						i_6 = Class382.anIntArray4657[i_4];
						i_7 = Class382.anIntArray4661[i_4];
						i_8 = this.anIntArray8581[i_5] * i_6 + this.anIntArray8580[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8581[i_5] = this.anIntArray8581[i_5] * i_7 - this.anIntArray8580[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8580[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Class382.anIntArray4657[i_2];
						i_7 = Class382.anIntArray4661[i_2];
						i_8 = this.anIntArray8581[i_5] * i_7 - this.anIntArray8610[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8581[i_5] * i_6 + this.anIntArray8610[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8581[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Class382.anIntArray4657[i_3];
						i_7 = Class382.anIntArray4661[i_3];
						i_8 = this.anIntArray8610[i_5] * i_6 + this.anIntArray8580[i_5] * i_7 + 16383 >> 14;
						this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_7 - this.anIntArray8580[i_5] * i_6 + 16383 >> 14;
						this.anIntArray8580[i_5] = i_8;
					}

					this.anIntArray8580[i_5] += this.anInt8611;
					this.anIntArray8581[i_5] += this.anInt8607;
					this.anIntArray8610[i_5] += this.anInt8613;
				}
			} else if (i_1 == 3) {
				for (i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] -= this.anInt8611;
					this.anIntArray8581[i_5] -= this.anInt8607;
					this.anIntArray8610[i_5] -= this.anInt8613;
					this.anIntArray8580[i_5] = this.anIntArray8580[i_5] * i_2 / 128;
					this.anIntArray8581[i_5] = this.anIntArray8581[i_5] * i_3 / 128;
					this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_4 / 128;
					this.anIntArray8580[i_5] += this.anInt8611;
					this.anIntArray8581[i_5] += this.anInt8607;
					this.anIntArray8610[i_5] += this.anInt8613;
				}
			} else {
				Class193 class193_10;
				Class176 class176_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
						i_6 = (this.aByteArray8602[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0) {
							i_6 = 0;
						} else if (i_6 > 255) {
							i_6 = 255;
						}

						this.aByteArray8602[i_5] = (byte) i_6;
					}

					if (this.aClass193Array8618 != null) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class193_10 = this.aClass193Array8618[i_5];
							class176_11 = this.aClass176Array8582[i_5];
							class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (this.aByteArray8602[class193_10.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
						}
					}
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
						i_6 = this.aShortArray8604[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
						i_8 = i_6 >> 7 & 0x7;
						int i_9 = i_6 & 0x7f;
						i_7 = i_7 + i_2 & 0x3f;
						i_8 += i_3;
						if (i_8 < 0) {
							i_8 = 0;
						} else if (i_8 > 7) {
							i_8 = 7;
						}

						i_9 += i_4;
						if (i_9 < 0) {
							i_9 = 0;
						} else if (i_9 > 127) {
							i_9 = 127;
						}

						this.aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					this.aBool8609 = true;
					if (this.aClass193Array8618 != null) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class193_10 = this.aClass193Array8618[i_5];
							class176_11 = this.aClass176Array8582[i_5];
							class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_10.anInt2393 * -1274099887 * 142270897] & 0xffff, 745540902) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
						}
					}
				} else {
					Class176 class176_12;
					if (i_1 == 8) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.anInt2192 = (class176_12.anInt2192 * -943685543 + i_2 * -943685543) * -310982679;
							class176_12.anInt2189 = (class176_12.anInt2189 * 1414070385 + i_3 * 1414070385) * 1349697681;
						}
					} else if (i_1 == 10) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.aFloat2190 = class176_12.aFloat2190 * (float) i_2 / 128.0F;
							class176_12.aFloat2191 = class176_12.aFloat2191 * (float) i_3 / 128.0F;
						}
					} else if (i_1 == 9) {
						for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
							class176_12 = this.aClass176Array8582[i_5];
							class176_12.anInt2194 = (class176_12.anInt2194 * 2076699445 * 156323613 + i_2 & 0x3fff) * 2076699445 * 156323613;
						}
					}
				}
			}
		}

	}

	public int ct() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8627;
	}

	public int cu() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8627;
	}

	public int ha() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8629;
	}

	public int cw() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8570;
	}

	public int c() {
		return this.anInt8606;
	}

	public int ck() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8571;
	}

	public int co() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8629;
	}

	void method13876() {
		if (!this.aBool8621) {
			int i_1 = 0;
			int i_2 = 0;
			int i_3 = 32767;
			int i_4 = 32767;
			int i_5 = 32767;
			int i_6 = -32768;
			int i_7 = -32768;
			int i_8 = -32768;

			for (int i_9 = 0; i_9 < this.anInt8579; i_9++) {
				int i_10 = this.anIntArray8580[i_9];
				int i_11 = this.anIntArray8581[i_9];
				int i_12 = this.anIntArray8610[i_9];
				if (i_10 < i_3) {
					i_3 = i_10;
				}

				if (i_10 > i_6) {
					i_6 = i_10;
				}

				if (i_11 < i_4) {
					i_4 = i_11;
				}

				if (i_11 > i_7) {
					i_7 = i_11;
				}

				if (i_12 < i_5) {
					i_5 = i_12;
				}

				if (i_12 > i_8) {
					i_8 = i_12;
				}

				int i_13 = i_10 * i_10 + i_12 * i_12;
				if (i_13 > i_1) {
					i_1 = i_13;
				}

				i_13 += i_11 * i_11;
				if (i_13 > i_2) {
					i_2 = i_13;
				}
			}

			this.aShort8634 = (short) i_3;
			this.aShort8627 = (short) i_6;
			this.aShort8570 = (short) i_4;
			this.aShort8625 = (short) i_7;
			this.aShort8571 = (short) i_5;
			this.aShort8629 = (short) i_8;
			this.aShort8595 = (short) ((int) (Math.sqrt((double) i_1) + 0.99D));
			this.aShort8574 = (short) ((int) (Math.sqrt((double) i_2) + 0.99D));
			this.aBool8621 = true;
		}

	}

	public void ce(int i_1) {
		if ((this.anInt8575 & 0x1000) != 4096) {
			throw new IllegalStateException();
		} else {
			this.anInt8606 = i_1;
			this.anInt8598 = 0;
		}
	}

	void method13877() {
		if (this.anInt8598 == 0 && this.aClass189Array8584 == null) {
			if (this.aClass505_Sub3_8638.anInt9008 > 1) {
				synchronized (this) {
					this.method13797();
				}
			} else {
				this.method13797();
			}
		}

	}

	public int ch() {
		return this.anInt8577;
	}

	public byte[] cz() {
		return this.aByteArray8602;
	}

	public void dl(int i_1) {
		if ((this.anInt8575 & 0x3) != 3) {
			throw new IllegalStateException();
		} else {
			int i_2 = Class382.anIntArray4657[i_1];
			int i_3 = Class382.anIntArray4661[i_1];
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					int i_6 = this.anIntArray8581[i_5] * i_2 + this.anIntArray8580[i_5] * i_3 >> 14;
					this.anIntArray8581[i_5] = this.anIntArray8581[i_5] * i_3 - this.anIntArray8580[i_5] * i_2 >> 14;
					this.anIntArray8580[i_5] = i_6;
				}

				this.method13812();
			}
		}
	}

	public void method11307(byte b_1, byte[] bytes_2) {
		if ((this.anInt8575 & 0x100000) == 0) {
			throw new RuntimeException();
		} else {
			if (this.aByteArray8602 == null) {
				this.aByteArray8602 = new byte[this.anInt8586];
			}

			int i_3;
			if (bytes_2 == null) {
				for (i_3 = 0; i_3 < this.anInt8586; i_3++) {
					this.aByteArray8602[i_3] = b_1;
				}
			} else {
				for (i_3 = 0; i_3 < this.anInt8586; i_3++) {
					int i_4 = 255 - (255 - (bytes_2[i_3] & 0xff)) * (255 - (b_1 & 0xff)) / 255;
					this.aByteArray8602[i_3] = (byte) i_4;
				}
			}

			if (this.anInt8598 == 2) {
				this.anInt8598 = 1;
			}

		}
	}

	public Surface[] method11300() {
		return this.aClass87Array8615;
	}

	public SurfaceSkin[] method11331() {
		return this.aClass172Array8616;
	}

	public SurfaceSkin[] method11283() {
		return this.aClass172Array8616;
	}

	public SurfaceSkin[] method11302() {
		return this.aClass172Array8616;
	}

	public void cy(int i_1, int i_2, int i_3, int i_4) {
		if ((this.anInt8575 & 0x80000) != 524288) {
			throw new IllegalStateException();
		} else {
			int i_5;
			for (i_5 = 0; i_5 < this.anInt8586; i_5++) {
				int i_6 = this.aShortArray8604[i_5] & 0xffff;
				int i_7 = i_6 >> 10 & 0x3f;
				int i_8 = i_6 >> 7 & 0x7;
				int i_9 = i_6 & 0x7f;
				if (i_1 != -1) {
					i_7 += (i_1 - i_7) * i_4 >> 7;
				}

				if (i_2 != -1) {
					i_8 += (i_2 - i_8) * i_4 >> 7;
				}

				if (i_3 != -1) {
					i_9 += (i_3 - i_9) * i_4 >> 7;
				}

				this.aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
			}

			if (this.aClass193Array8618 != null) {
				for (i_5 = 0; i_5 < this.anInt8617; i_5++) {
					Class193 class193_10 = this.aClass193Array8618[i_5];
					Class176 class176_11 = this.aClass176Array8582[i_5];
					class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & ~0xffffff | Class335.anIntArray3916[Class372.method6362(this.aShortArray8604[class193_10.anInt2393 * -1274099887 * 142270897] & 0xffff, 1460494952) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
				}
			}

			if (this.anInt8598 == 2) {
				this.anInt8598 = 1;
			}

		}
	}

	public boolean dh() {
		return this.aBool8640;
	}

	public int cb() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8570;
	}

	public void bc(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
		if (i_1 == 3) {
			if ((this.anInt8575 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((this.anInt8575 & 0x2) != 2) {
			throw new IllegalStateException();
		}

		if (!this.aBool8621) {
			this.method13876();
		}

		int i_8 = i_5 + this.aShort8634;
		int i_9 = i_5 + this.aShort8627;
		int i_10 = i_7 + this.aShort8571;
		int i_11 = i_7 + this.aShort8629;
		if (i_1 == 4 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
			int[][] ints_12 = class390_3.tileHeights;
			int[][] ints_13 = null;
			if (class390_4 != null) {
				ints_13 = class390_4.tileHeights;
			}

			if (i_1 != 4 && i_1 != 5) {
				i_8 >>= class390_3.tileScale;
				i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				i_10 >>= class390_3.tileScale;
				i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				if (ints_12[i_8][i_10] == i_6 && ints_12[i_9][i_10] == i_6 && ints_12[i_8][i_11] == i_6 && ints_12[i_9][i_11] == i_6) {
					return;
				}
			} else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length) {
				return;
			}

			synchronized (this) {
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				if (i_1 == 1) {
					i_15 = class390_3.tileUnits - 1;

					for (i_16 = 0; i_16 < this.anInt8579; i_16++) {
						i_17 = this.anIntArray8580[i_16] + i_5;
						i_18 = this.anIntArray8610[i_16] + i_7;
						i_19 = i_17 & i_15;
						i_20 = i_18 & i_15;
						i_21 = i_17 >> class390_3.tileScale;
						i_22 = i_18 >> class390_3.tileScale;
						i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22] * i_19 >> class390_3.tileScale;
						i_24 = ints_12[i_21][i_22 + 1] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22 + 1] * i_19 >> class390_3.tileScale;
						i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
						this.anIntArray8581[i_16] = this.anIntArray8581[i_16] + i_25 - i_6;
					}

					for (i_16 = this.anInt8579; i_16 < this.anInt8578; i_16++) {
						i_17 = this.anIntArray8580[i_16] + i_5;
						i_18 = this.anIntArray8610[i_16] + i_7;
						i_19 = i_17 & i_15;
						i_20 = i_18 & i_15;
						i_21 = i_17 >> class390_3.tileScale;
						i_22 = i_18 >> class390_3.tileScale;
						if (i_21 >= 0 && i_21 < ints_12.length - 1 && i_22 >= 0 && i_22 < ints_12[0].length - 1) {
							i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22] * i_19 >> class390_3.tileScale;
							i_24 = ints_12[i_21][i_22 + 1] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22 + 1] * i_19 >> class390_3.tileScale;
							i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
							this.anIntArray8581[i_16] = this.anIntArray8581[i_16] + i_25 - i_6;
						}
					}
				} else {
					int i_26;
					if (i_1 == 2) {
						if (this.aShort8570 == 0) {
							return;
						}

						i_15 = class390_3.tileUnits - 1;

						for (i_16 = 0; i_16 < this.anInt8579; i_16++) {
							i_17 = (this.anIntArray8581[i_16] << 16) / this.aShort8570;
							if (i_17 < i_2) {
								i_18 = this.anIntArray8580[i_16] + i_5;
								i_19 = this.anIntArray8610[i_16] + i_7;
								i_20 = i_18 & i_15;
								i_21 = i_19 & i_15;
								i_22 = i_18 >> class390_3.tileScale;
								i_23 = i_19 >> class390_3.tileScale;
								i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
								i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
								i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
								this.anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
							} else {
								this.anIntArray8581[i_16] = this.anIntArray8581[i_16];
							}
						}

						for (i_16 = this.anInt8579; i_16 < this.anInt8578; i_16++) {
							i_17 = (this.anIntArray8581[i_16] << 16) / this.aShort8570;
							if (i_17 < i_2) {
								i_18 = this.anIntArray8580[i_16] + i_5;
								i_19 = this.anIntArray8610[i_16] + i_7;
								i_20 = i_18 & i_15;
								i_21 = i_19 & i_15;
								i_22 = i_18 >> class390_3.tileScale;
								i_23 = i_19 >> class390_3.tileScale;
								if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1) {
									i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
									i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
									i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
									this.anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
								}
							} else {
								this.anIntArray8581[i_16] = this.anIntArray8581[i_16];
							}
						}
					} else if (i_1 == 3) {
						i_15 = (i_2 & 0xff) * 4;
						i_16 = (i_2 >> 8 & 0xff) * 4;
						i_17 = (i_2 >> 16 & 0xff) << 6;
						i_18 = (i_2 >> 24 & 0xff) << 6;
						if (i_5 - (i_15 >> 1) < 0 || i_5 + (i_15 >> 1) + class390_3.tileUnits >= class390_3.width << class390_3.tileScale || i_7 - (i_16 >> 1) < 0 || i_7 + (i_16 >> 1) + class390_3.tileUnits >= class390_3.length << class390_3.tileScale) {
							return;
						}

						this.method11281(class390_3, i_5, i_6, i_7, i_15, i_16, i_17, i_18);
					} else if (i_1 == 4) {
						i_15 = class390_4.tileUnits - 1;
						i_16 = this.aShort8625 - this.aShort8570;

						for (i_17 = 0; i_17 < this.anInt8579; i_17++) {
							i_18 = this.anIntArray8580[i_17] + i_5;
							i_19 = this.anIntArray8610[i_17] + i_7;
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_4.tileScale;
							i_23 = i_19 >> class390_4.tileScale;
							i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
							i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
							i_26 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
							this.anIntArray8581[i_17] = this.anIntArray8581[i_17] + (i_26 - i_6) + i_16;
						}

						for (i_17 = this.anInt8579; i_17 < this.anInt8578; i_17++) {
							i_18 = this.anIntArray8580[i_17] + i_5;
							i_19 = this.anIntArray8610[i_17] + i_7;
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_4.tileScale;
							i_23 = i_19 >> class390_4.tileScale;
							if (i_22 >= 0 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_4.length - 1) {
								i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
								i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
								i_26 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
								this.anIntArray8581[i_17] = this.anIntArray8581[i_17] + (i_26 - i_6) + i_16;
							}
						}
					} else if (i_1 == 5) {
						i_15 = class390_4.tileUnits - 1;
						i_16 = this.aShort8625 - this.aShort8570;

						int i_27;
						int i_28;
						for (i_17 = 0; i_17 < this.anInt8579; i_17++) {
							i_18 = this.anIntArray8580[i_17] + i_5;
							i_19 = this.anIntArray8610[i_17] + i_7;
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_3.tileScale;
							i_23 = i_19 >> class390_3.tileScale;
							i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
							i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
							i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
							i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
							i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
							i_27 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
							i_28 = i_26 - i_27 - i_2;
							this.anIntArray8581[i_17] = ((this.anIntArray8581[i_17] << 8) / i_16 * i_28 >> 8) - (i_6 - i_26);
						}

						for (i_17 = this.anInt8579; i_17 < this.anInt8578; i_17++) {
							i_18 = this.anIntArray8580[i_17] + i_5;
							i_19 = this.anIntArray8610[i_17] + i_7;
							i_20 = i_18 & i_15;
							i_21 = i_19 & i_15;
							i_22 = i_18 >> class390_3.tileScale;
							i_23 = i_19 >> class390_3.tileScale;
							if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1 && i_23 < class390_4.length - 1) {
								i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
								i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
								i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
								i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
								i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
								i_27 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
								i_28 = i_26 - i_27 - i_2;
								this.anIntArray8581[i_17] = ((this.anIntArray8581[i_17] << 8) / i_16 * i_28 >> 8) - (i_6 - i_26);
							}
						}
					}
				}

				this.aBool8621 = false;
			}
		}

	}

	public int dy() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8595;
	}

	public int dm() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8595;
	}

	public int dp() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8574;
	}

	public int du() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8574;
	}

	Class528_Sub2(HardwareRenderer hardwarerenderer_1) {
		this.aClass505_Sub3_8638 = hardwarerenderer_1;
	}

	public boolean successful() {
		if (this.aShortArray8603 == null) {
			return true;
		} else {
			for (int i_1 = 0; i_1 < this.aShortArray8603.length; i_1++) {
				if (this.aShortArray8603[i_1] != -1 && !this.aClass505_Sub3_8638.method14360(this.aShortArray8603[i_1])) {
					return false;
				}
			}

			return true;
		}
	}

	public void di(short s_1, short s_2) {
		if (this.aShortArray8603 != null) {
			if (!this.aBool8640 && s_2 >= 0) {
				TextureDetails class169_3 = this.aClass505_Sub3_8638.anInterface22_5834.method144(s_2 & 0xffff, -2096330622);
				if (class169_3.textureSpeedU != 0 || class169_3.textureSpeedV != 0) {
					this.aBool8640 = true;
				}
			}

			for (int i_4 = 0; i_4 < this.anInt8586; i_4++) {
				if (this.aShortArray8603[i_4] == s_1) {
					this.aShortArray8603[i_4] = s_2;
				}
			}
		}

	}

	public void df(short s_1, short s_2) {
		if (this.aShortArray8603 != null) {
			if (!this.aBool8640 && s_2 >= 0) {
				TextureDetails class169_3 = this.aClass505_Sub3_8638.anInterface22_5834.method144(s_2 & 0xffff, -2091368936);
				if (class169_3.textureSpeedU != 0 || class169_3.textureSpeedV != 0) {
					this.aBool8640 = true;
				}
			}

			for (int i_4 = 0; i_4 < this.anInt8586; i_4++) {
				if (this.aShortArray8603[i_4] == s_1) {
					this.aShortArray8603[i_4] = s_2;
				}
			}
		}

	}

	public boolean dv() {
		return this.aBool8630;
	}

	void method11308() {
		if (this.aClass505_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
			synchronized (this) {
				while (this.aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception_3) {
						;
					}
				}

				this.aBool7023 = true;
			}
		}

	}

	void method11301() {
		if (this.aClass505_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
			synchronized (this) {
				while (this.aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception_3) {
						;
					}
				}

				this.aBool7023 = true;
			}
		}

	}

	Class528_Sub2(HardwareRenderer hardwarerenderer_1, RSMesh rsmesh_2, int i_3, int i_4, int i_5, int i_6) {
		this.aClass505_Sub3_8638 = hardwarerenderer_1;
		this.anInt8575 = i_3;
		this.anInt8606 = i_4;
		this.anInt8577 = i_5;
		Interface22 interface22_7 = this.aClass505_Sub3_8638.anInterface22_5834;
		this.anInt8578 = rsmesh_2.vertexCount;
		this.anInt8579 = rsmesh_2.maxDepth;
		this.anIntArray8580 = rsmesh_2.vertexX;
		this.anIntArray8581 = rsmesh_2.vertexY;
		this.anIntArray8610 = rsmesh_2.vertexZ;
		this.anInt8586 = rsmesh_2.faceCount;
		this.aShortArray8587 = rsmesh_2.triangleX;
		this.aShortArray8588 = rsmesh_2.triangleY;
		this.aShortArray8642 = rsmesh_2.triangleZ;
		this.aByteArray8601 = rsmesh_2.facePriorities;
		this.aShortArray8604 = rsmesh_2.faceColor;
		this.aByteArray8602 = rsmesh_2.faceAlphas;
		this.aShortArray8632 = rsmesh_2.aShortArray1981;
		this.aByteArray8600 = rsmesh_2.faceType;
		this.aClass87Array8615 = rsmesh_2.surfaces;
		this.aClass172Array8616 = rsmesh_2.surfaceSkins;
		this.aShortArray8569 = rsmesh_2.aShortArray1980;
		int[] ints_8 = new int[this.anInt8586];

		for (int i_9 = 0; i_9 < this.anInt8586; ints_8[i_9] = i_9++) {
			;
		}

		long[] longs_53 = new long[this.anInt8586];
		boolean bool_10 = (this.anInt8575 & 0x100) != 0;

		int i_11;
		int i_14;
		byte b_17;
		int i_64;
		short s_68;
		for (i_11 = 0; i_11 < this.anInt8586; i_11++) {
			int i_55 = ints_8[i_11];
			TextureDetails class169_13 = null;
			i_14 = 0;
			byte b_15 = 0;
			byte b_16 = 0;
			b_17 = 0;
			if (rsmesh_2.isolatedVertexNormals != null) {
				boolean bool_18 = false;

				for (int i_19 = 0; i_19 < rsmesh_2.isolatedVertexNormals.length; i_19++) {
					VertexNormal class84_20 = rsmesh_2.isolatedVertexNormals[i_19];
					if (i_55 == class84_20.anInt809) {
						Class347 class347_21 = Class417.method7005(class84_20.anInt812, -1951471035);
						if (class347_21.aBool4059) {
							bool_18 = true;
						}

						if (class347_21.anInt4055 != -1) {
							TextureDetails class169_22 = interface22_7.method144(class347_21.anInt4055, -1996466919);
							if (class169_22.blendType == 2) {
								this.aBool8630 = true;
							}
						}
					}
				}

				if (bool_18) {
					longs_53[i_11] = Long.MAX_VALUE;
				}
			}

			s_68 = -1;
			if (rsmesh_2.faceTextures != null) {
				s_68 = rsmesh_2.faceTextures[i_55];
				if (s_68 != -1) {
					class169_13 = interface22_7.method144(s_68 & 0xffff, -1793423627);
					if ((i_6 & 0x40) != 0 && class169_13.isGroundMesh) {
						s_68 = -1;
					} else {
						b_16 = class169_13.effectId;
						b_17 = class169_13.effectParam1;
					}
				}
			}

			boolean bool_71 = this.aByteArray8602 != null && this.aByteArray8602[i_55] != 0 || class169_13 != null && class169_13.blendType == 2;
			if ((bool_10 || bool_71) && this.aByteArray8601 != null) {
				i_14 += this.aByteArray8601[i_55] << 17;
			}

			if (bool_71) {
				i_14 += 65536;
			}

			i_14 += (b_16 & 0xff) << 8;
			i_14 += b_17 & 0xff;
			i_64 = b_15 + ((s_68 & 0xffff) << 16);
			i_64 += i_11 & 0xffff;
			longs_53[i_11] = ((long) i_14 << 32) + (long) i_64;
			this.aBool8630 |= bool_71;
		}

		Class159.method2736(longs_53, ints_8);
		if (rsmesh_2.isolatedVertexNormals != null) {
			this.anInt8617 = rsmesh_2.isolatedVertexNormals.length;
			this.aClass193Array8618 = new Class193[this.anInt8617];
			this.aClass176Array8582 = new Class176[this.anInt8617];

			for (i_11 = 0; i_11 < rsmesh_2.isolatedVertexNormals.length; i_11++) {
				VertexNormal class84_12 = rsmesh_2.isolatedVertexNormals[i_11];
				Class347 class347_62 = Class417.method7005(class84_12.anInt812, -1147106415);
				i_14 = Class335.anIntArray3916[rsmesh_2.faceColor[class84_12.anInt809] & 0xffff] & 0xffffff;
				i_14 |= 255 - (rsmesh_2.faceAlphas != null ? rsmesh_2.faceAlphas[class84_12.anInt809] & 0xff : 0) << 24;
				this.aClass193Array8618[i_11] = new Class193(class84_12.anInt809, rsmesh_2.triangleX[class84_12.anInt809], rsmesh_2.triangleY[class84_12.anInt809], rsmesh_2.triangleZ[class84_12.anInt809], class347_62.anInt4054, class347_62.anInt4050, class347_62.anInt4055, class347_62.anInt4057, class347_62.anInt4051, class347_62.aBool4059, class84_12.anInt810);
				this.aClass176Array8582[i_11] = new Class176(i_14);
			}
		}

		this.aFloatArrayArray8635 = new float[this.anInt8586][];
		this.aFloatArrayArray8591 = new float[this.anInt8586][];
		Class83 class83_54 = this.method11256(rsmesh_2, ints_8, this.anInt8586);
		Class185 class185_61 = this.aClass505_Sub3_8638.method14370(Thread.currentThread());
		float[] floats_63 = class185_61.aFloatArray2338;
		boolean bool_66 = false;

		int i_67;
		for (i_64 = 0; i_64 < this.anInt8586; i_64++) {
			i_67 = ints_8[i_64];
			if (rsmesh_2.texturePos == null) {
				b_17 = -1;
			} else {
				b_17 = rsmesh_2.texturePos[i_67];
			}

			s_68 = rsmesh_2.faceTextures == null ? -1 : rsmesh_2.faceTextures[i_67];
			if (s_68 != -1 && (i_6 & 0x40) != 0) {
				TextureDetails class169_57 = interface22_7.method144(s_68 & 0xffff, -1940118414);
				if (class169_57.isGroundMesh) {
					s_68 = -1;
				}
			}

			if (s_68 != -1) {
				bool_66 = true;
				float[] floats_87 = this.aFloatArrayArray8635[i_67] = new float[3];
				float[] floats_72 = this.aFloatArrayArray8591[i_67] = new float[3];
				if (b_17 == -1) {
					floats_87[0] = 0.0F;
					floats_72[0] = 1.0F;
					floats_87[1] = 1.0F;
					floats_72[1] = 1.0F;
					floats_87[2] = 0.0F;
					floats_72[2] = 0.0F;
				} else {
					int i_69 = b_17 & 0xff;
					byte b_58 = rsmesh_2.textureRenderTypes[i_69];
					short s_23;
					short s_24;
					float f_30;
					float f_31;
					float f_32;
					float f_42;
					float f_43;
					float f_44;
					float f_45;
					float f_46;
					float f_47;
					short s_59;
					if (b_58 == 0) {
						s_59 = this.aShortArray8587[i_67];
						s_23 = this.aShortArray8588[i_67];
						s_24 = this.aShortArray8642[i_67];
						short s_25 = rsmesh_2.texTriX[i_69];
						short s_26 = rsmesh_2.texTriY[i_69];
						short s_27 = rsmesh_2.texTriZ[i_69];
						float f_28 = (float) this.anIntArray8580[s_25];
						float f_29 = (float) this.anIntArray8581[s_25];
						f_30 = (float) this.anIntArray8610[s_25];
						f_31 = (float) this.anIntArray8580[s_26] - f_28;
						f_32 = (float) this.anIntArray8581[s_26] - f_29;
						float f_33 = (float) this.anIntArray8610[s_26] - f_30;
						float f_34 = (float) this.anIntArray8580[s_27] - f_28;
						float f_35 = (float) this.anIntArray8581[s_27] - f_29;
						float f_36 = (float) this.anIntArray8610[s_27] - f_30;
						float f_37 = (float) this.anIntArray8580[s_59] - f_28;
						float f_38 = (float) this.anIntArray8581[s_59] - f_29;
						float f_39 = (float) this.anIntArray8610[s_59] - f_30;
						float f_40 = (float) this.anIntArray8580[s_23] - f_28;
						float f_41 = (float) this.anIntArray8581[s_23] - f_29;
						f_42 = (float) this.anIntArray8610[s_23] - f_30;
						f_43 = (float) this.anIntArray8580[s_24] - f_28;
						f_44 = (float) this.anIntArray8581[s_24] - f_29;
						f_45 = (float) this.anIntArray8610[s_24] - f_30;
						f_46 = f_32 * f_36 - f_33 * f_35;
						f_47 = f_33 * f_34 - f_31 * f_36;
						float f_48 = f_31 * f_35 - f_32 * f_34;
						float f_49 = f_35 * f_48 - f_36 * f_47;
						float f_50 = f_36 * f_46 - f_34 * f_48;
						float f_51 = f_34 * f_47 - f_35 * f_46;
						float f_52 = 1.0F / (f_49 * f_31 + f_50 * f_32 + f_51 * f_33);
						floats_87[0] = (f_49 * f_37 + f_50 * f_38 + f_51 * f_39) * f_52;
						floats_87[1] = (f_49 * f_40 + f_50 * f_41 + f_51 * f_42) * f_52;
						floats_87[2] = (f_49 * f_43 + f_50 * f_44 + f_51 * f_45) * f_52;
						f_49 = f_32 * f_48 - f_33 * f_47;
						f_50 = f_33 * f_46 - f_31 * f_48;
						f_51 = f_31 * f_47 - f_32 * f_46;
						f_52 = 1.0F / (f_49 * f_34 + f_50 * f_35 + f_51 * f_36);
						floats_72[0] = (f_49 * f_37 + f_50 * f_38 + f_51 * f_39) * f_52;
						floats_72[1] = (f_49 * f_40 + f_50 * f_41 + f_51 * f_42) * f_52;
						floats_72[2] = (f_49 * f_43 + f_50 * f_44 + f_51 * f_45) * f_52;
					} else {
						s_59 = this.aShortArray8587[i_67];
						s_23 = this.aShortArray8588[i_67];
						s_24 = this.aShortArray8642[i_67];
						int i_73 = class83_54.anIntArray808[i_69];
						int i_74 = class83_54.anIntArray805[i_69];
						int i_75 = class83_54.anIntArray807[i_69];
						float[] floats_60 = class83_54.aFloatArrayArray806[i_69];
						byte b_76 = rsmesh_2.particleLifespanY[i_69];
						f_30 = (float) rsmesh_2.particleLifespanZ[i_69] / 256.0F;
						if (b_58 == 1) {
							f_31 = (float) rsmesh_2.particleDirectionZ[i_69] / 1024.0F;
							this.method11306(this.anIntArray8580[s_59], this.anIntArray8581[s_59], this.anIntArray8610[s_59], i_73, i_74, i_75, floats_60, f_31, b_76, f_30, floats_63);
							floats_87[0] = floats_63[0];
							floats_72[0] = floats_63[1];
							this.method11306(this.anIntArray8580[s_23], this.anIntArray8581[s_23], this.anIntArray8610[s_23], i_73, i_74, i_75, floats_60, f_31, b_76, f_30, floats_63);
							floats_87[1] = floats_63[0];
							floats_72[1] = floats_63[1];
							this.method11306(this.anIntArray8580[s_24], this.anIntArray8581[s_24], this.anIntArray8610[s_24], i_73, i_74, i_75, floats_60, f_31, b_76, f_30, floats_63);
							floats_87[2] = floats_63[0];
							floats_72[2] = floats_63[1];
							f_32 = f_31 / 2.0F;
							if ((b_76 & 0x1) == 0) {
								if (floats_87[1] - floats_87[0] > f_32) {
									floats_87[1] -= f_31;
								} else if (floats_87[0] - floats_87[1] > f_32) {
									floats_87[1] += f_31;
								}

								if (floats_87[2] - floats_87[0] > f_32) {
									floats_87[2] -= f_31;
								} else if (floats_87[0] - floats_87[2] > f_32) {
									floats_87[2] += f_31;
								}
							} else {
								if (floats_72[1] - floats_72[0] > f_32) {
									floats_72[1] -= f_31;
								} else if (floats_72[0] - floats_72[1] > f_32) {
									floats_72[1] += f_31;
								}

								if (floats_72[2] - floats_72[0] > f_32) {
									floats_72[2] -= f_31;
								} else if (floats_72[0] - floats_72[2] > f_32) {
									floats_72[2] += f_31;
								}
							}
						} else if (b_58 == 2) {
							f_31 = (float) rsmesh_2.texturePrimaryColor[i_69] / 256.0F;
							f_32 = (float) rsmesh_2.textureSecondaryColor[i_69] / 256.0F;
							int i_77 = this.anIntArray8580[s_23] - this.anIntArray8580[s_59];
							int i_78 = this.anIntArray8581[s_23] - this.anIntArray8581[s_59];
							int i_79 = this.anIntArray8610[s_23] - this.anIntArray8610[s_59];
							int i_80 = this.anIntArray8580[s_24] - this.anIntArray8580[s_59];
							int i_81 = this.anIntArray8581[s_24] - this.anIntArray8581[s_59];
							int i_82 = this.anIntArray8610[s_24] - this.anIntArray8610[s_59];
							int i_83 = i_78 * i_82 - i_81 * i_79;
							int i_84 = i_79 * i_80 - i_82 * i_77;
							int i_85 = i_77 * i_81 - i_80 * i_78;
							f_42 = 64.0F / (float) rsmesh_2.particleDirectionX[i_69];
							f_43 = 64.0F / (float) rsmesh_2.particleDirectionY[i_69];
							f_44 = 64.0F / (float) rsmesh_2.particleDirectionZ[i_69];
							f_45 = ((float) i_83 * floats_60[0] + (float) i_84 * floats_60[1] + (float) i_85 * floats_60[2]) / f_42;
							f_46 = ((float) i_83 * floats_60[3] + (float) i_84 * floats_60[4] + (float) i_85 * floats_60[5]) / f_43;
							f_47 = ((float) i_83 * floats_60[6] + (float) i_84 * floats_60[7] + (float) i_85 * floats_60[8]) / f_44;
							int i_86 = this.method11254(f_45, f_46, f_47);
							this.method11255(this.anIntArray8580[s_59], this.anIntArray8581[s_59], this.anIntArray8610[s_59], i_73, i_74, i_75, i_86, floats_60, b_76, f_30, f_31, f_32, floats_63);
							floats_87[0] = floats_63[0];
							floats_72[0] = floats_63[1];
							this.method11255(this.anIntArray8580[s_23], this.anIntArray8581[s_23], this.anIntArray8610[s_23], i_73, i_74, i_75, i_86, floats_60, b_76, f_30, f_31, f_32, floats_63);
							floats_87[1] = floats_63[0];
							floats_72[1] = floats_63[1];
							this.method11255(this.anIntArray8580[s_24], this.anIntArray8581[s_24], this.anIntArray8610[s_24], i_73, i_74, i_75, i_86, floats_60, b_76, f_30, f_31, f_32, floats_63);
							floats_87[2] = floats_63[0];
							floats_72[2] = floats_63[1];
						} else if (b_58 == 3) {
							this.method11271(this.anIntArray8580[s_59], this.anIntArray8581[s_59], this.anIntArray8610[s_59], i_73, i_74, i_75, floats_60, b_76, f_30, floats_63);
							floats_87[0] = floats_63[0];
							floats_72[0] = floats_63[1];
							this.method11271(this.anIntArray8580[s_23], this.anIntArray8581[s_23], this.anIntArray8610[s_23], i_73, i_74, i_75, floats_60, b_76, f_30, floats_63);
							floats_87[1] = floats_63[0];
							floats_72[1] = floats_63[1];
							this.method11271(this.anIntArray8580[s_24], this.anIntArray8581[s_24], this.anIntArray8610[s_24], i_73, i_74, i_75, floats_60, b_76, f_30, floats_63);
							floats_87[2] = floats_63[0];
							floats_72[2] = floats_63[1];
							if ((b_76 & 0x1) == 0) {
								if (floats_87[1] - floats_87[0] > 0.5F) {
									--floats_87[1];
								} else if (floats_87[0] - floats_87[1] > 0.5F) {
									++floats_87[1];
								}

								if (floats_87[2] - floats_87[0] > 0.5F) {
									--floats_87[2];
								} else if (floats_87[0] - floats_87[2] > 0.5F) {
									++floats_87[2];
								}
							} else {
								if (floats_72[1] - floats_72[0] > 0.5F) {
									--floats_72[1];
								} else if (floats_72[0] - floats_72[1] > 0.5F) {
									++floats_72[1];
								}

								if (floats_72[2] - floats_72[0] > 0.5F) {
									--floats_72[2];
								} else if (floats_72[0] - floats_72[2] > 0.5F) {
									++floats_72[2];
								}
							}
						}
					}
				}
			}
		}

		if (!bool_66) {
			this.aFloatArrayArray8591 = null;
			this.aFloatArrayArray8635 = null;
		}

		if (rsmesh_2.vertexSkins != null && (this.anInt8575 & 0x20) != 0) {
			this.anIntArrayArray8568 = rsmesh_2.method2665(true);
		}

		if (rsmesh_2.skinValues != null && (this.anInt8575 & 0x180) != 0) {
			this.anIntArrayArray8608 = rsmesh_2.method2666();
		}

		if (rsmesh_2.isolatedVertexNormals != null && (this.anInt8575 & 0x400) != 0) {
			this.anIntArrayArray8620 = rsmesh_2.method2667();
		}

		if (rsmesh_2.faceTextures != null) {
			this.aShortArray8603 = new short[this.anInt8586];
			boolean bool_65 = false;

			for (i_67 = 0; i_67 < this.anInt8586; i_67++) {
				short s_70 = rsmesh_2.faceTextures[i_67];
				if (s_70 != -1) {
					TextureDetails class169_56 = this.aClass505_Sub3_8638.anInterface22_5834.method144(s_70, -1981607530);
					if ((i_6 & 0x40) != 0 && class169_56.isGroundMesh) {
						this.aShortArray8603[i_67] = -1;
					} else {
						this.aShortArray8603[i_67] = s_70;
						bool_65 = true;
						if (class169_56.blendType == 2) {
							this.aBool8630 = true;
						}

						if (class169_56.textureSpeedU != 0 || class169_56.textureSpeedV != 0) {
							this.aBool8640 = true;
						}
					}
				} else {
					this.aShortArray8603[i_67] = -1;
				}
			}

			if (!bool_65) {
				this.aShortArray8603 = null;
			}
		} else {
			this.aShortArray8603 = null;
		}

		if (this.aBool8630 || this.aClass193Array8618 != null) {
			this.aShortArray8623 = new short[this.anInt8586];

			for (i_64 = 0; i_64 < this.anInt8586; i_64++) {
				this.aShortArray8623[i_64] = (short) ints_8[i_64];
			}
		}

	}

	public boolean method11286(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Matrix44Arr matrix44arr_6 = this.aClass185_8564.aClass384_2317;
		matrix44arr_6.fromVarMatrix44(matrix44var_3);
		Matrix44Arr matrix44arr_7 = this.aClass185_8564.aClass384_2318;
		matrix44arr_7.method6562(matrix44arr_6);
		matrix44arr_7.method6523(this.aClass505_Sub3_8638.aClass384_8996);
		boolean bool_8 = false;
		int i_9 = Integer.MAX_VALUE;
		int i_10 = Integer.MIN_VALUE;
		int i_11 = Integer.MAX_VALUE;
		int i_12 = Integer.MIN_VALUE;
		if (!this.aBool8621) {
			this.method13876();
		}

		int i_13 = this.aShort8627 - this.aShort8634 >> 1;
		int i_14 = this.aShort8625 - this.aShort8570 >> 1;
		int i_15 = this.aShort8629 - this.aShort8571 >> 1;
		int i_16 = this.aShort8634 + i_13;
		int i_17 = this.aShort8570 + i_14;
		int i_18 = this.aShort8571 + i_15;
		int i_19 = i_16 - (i_13 << i_5);
		int i_20 = i_17 - (i_14 << i_5);
		int i_21 = i_18 - (i_15 << i_5);
		int i_22 = i_16 + (i_13 << i_5);
		int i_23 = i_17 + (i_14 << i_5);
		int i_24 = i_18 + (i_15 << i_5);
		this.anIntArray8583[0] = i_19;
		this.anIntArray8639[0] = i_20;
		this.anIntArray8628[0] = i_21;
		this.anIntArray8583[1] = i_22;
		this.anIntArray8639[1] = i_20;
		this.anIntArray8628[1] = i_21;
		this.anIntArray8583[2] = i_19;
		this.anIntArray8639[2] = i_23;
		this.anIntArray8628[2] = i_21;
		this.anIntArray8583[3] = i_22;
		this.anIntArray8639[3] = i_23;
		this.anIntArray8628[3] = i_21;
		this.anIntArray8583[4] = i_19;
		this.anIntArray8639[4] = i_20;
		this.anIntArray8628[4] = i_24;
		this.anIntArray8583[5] = i_22;
		this.anIntArray8639[5] = i_20;
		this.anIntArray8628[5] = i_24;
		this.anIntArray8583[6] = i_19;
		this.anIntArray8639[6] = i_23;
		this.anIntArray8628[6] = i_24;
		this.anIntArray8583[7] = i_22;
		this.anIntArray8639[7] = i_23;
		this.anIntArray8628[7] = i_24;

		int i_25;
		int i_26;
		int i_27;
		int i_28;
		float f_29;
		float f_30;
		float f_31;
		float f_32;
		for (i_25 = 0; i_25 < 8; i_25++) {
			i_26 = this.anIntArray8583[i_25];
			i_27 = this.anIntArray8639[i_25];
			i_28 = this.anIntArray8628[i_25];
			f_29 = matrix44arr_7.buf[2] * (float) i_26 + matrix44arr_7.buf[6] * (float) i_27 + matrix44arr_7.buf[10] * (float) i_28 + matrix44arr_7.buf[14];
			f_30 = matrix44arr_7.buf[3] * (float) i_26 + matrix44arr_7.buf[7] * (float) i_27 + matrix44arr_7.buf[11] * (float) i_28 + matrix44arr_7.buf[15];
			if (f_29 >= -f_30) {
				f_31 = matrix44arr_7.buf[0] * (float) i_26 + matrix44arr_7.buf[4] * (float) i_27 + matrix44arr_7.buf[8] * (float) i_28 + matrix44arr_7.buf[12];
				f_32 = matrix44arr_7.buf[1] * (float) i_26 + matrix44arr_7.buf[5] * (float) i_27 + matrix44arr_7.buf[9] * (float) i_28 + matrix44arr_7.buf[13];
				int i_33 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_30);
				int i_34 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_32 / f_30);
				if (i_33 < i_9) {
					i_9 = i_33;
				}

				if (i_33 > i_10) {
					i_10 = i_33;
				}

				if (i_34 < i_11) {
					i_11 = i_34;
				}

				if (i_34 > i_12) {
					i_12 = i_34;
				}

				bool_8 = true;
			}
		}

		if (bool_8 && i_1 > i_9 && i_1 < i_10 && i_2 > i_11 && i_2 < i_12) {
			if (bool_4) {
				return true;
			}

			for (i_25 = 0; i_25 < this.anInt8578; i_25++) {
				i_26 = this.anIntArray8580[i_25];
				i_27 = this.anIntArray8581[i_25];
				i_28 = this.anIntArray8610[i_25];
				f_29 = matrix44arr_7.buf[2] * (float) i_26 + matrix44arr_7.buf[6] * (float) i_27 + matrix44arr_7.buf[10] * (float) i_28 + matrix44arr_7.buf[14];
				f_30 = matrix44arr_7.buf[3] * (float) i_26 + matrix44arr_7.buf[7] * (float) i_27 + matrix44arr_7.buf[11] * (float) i_28 + matrix44arr_7.buf[15];
				if (f_29 >= -f_30) {
					f_31 = matrix44arr_7.buf[0] * (float) i_26 + matrix44arr_7.buf[4] * (float) i_27 + matrix44arr_7.buf[8] * (float) i_28 + matrix44arr_7.buf[12];
					f_32 = matrix44arr_7.buf[1] * (float) i_26 + matrix44arr_7.buf[5] * (float) i_27 + matrix44arr_7.buf[9] * (float) i_28 + matrix44arr_7.buf[13];
					this.aFloatArray8590[i_25] = (float) ((int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_30));
					this.aFloatArray8605[i_25] = (float) ((int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_32 / f_30));
				} else {
					this.aFloatArray8590[i_25] = -999999.0F;
				}
			}

			for (i_25 = 0; i_25 < this.anInt8586; i_25++) {
				if (this.aFloatArray8590[this.aShortArray8587[i_25]] != -999999.0F && this.aFloatArray8590[this.aShortArray8588[i_25]] != -999999.0F && this.aFloatArray8590[this.aShortArray8642[i_25]] != -999999.0F && this.method13819(i_1, i_2, this.aFloatArray8605[this.aShortArray8587[i_25]], this.aFloatArray8605[this.aShortArray8588[i_25]], this.aFloatArray8605[this.aShortArray8642[i_25]], this.aFloatArray8590[this.aShortArray8587[i_25]], this.aFloatArray8590[this.aShortArray8588[i_25]], this.aFloatArray8590[this.aShortArray8642[i_25]])) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean method11309(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		this.method13795(this.aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Matrix44Arr matrix44arr_6 = this.aClass185_8564.aClass384_2317;
		matrix44arr_6.fromVarMatrix44(matrix44var_3);
		Matrix44Arr matrix44arr_7 = this.aClass185_8564.aClass384_2318;
		matrix44arr_7.method6562(matrix44arr_6);
		matrix44arr_7.method6523(this.aClass505_Sub3_8638.aClass384_8996);
		boolean bool_8 = false;
		int i_9 = Integer.MAX_VALUE;
		int i_10 = Integer.MIN_VALUE;
		int i_11 = Integer.MAX_VALUE;
		int i_12 = Integer.MIN_VALUE;
		if (!this.aBool8621) {
			this.method13876();
		}

		int i_13 = this.aShort8627 - this.aShort8634 >> 1;
		int i_14 = this.aShort8625 - this.aShort8570 >> 1;
		int i_15 = this.aShort8629 - this.aShort8571 >> 1;
		int i_16 = this.aShort8634 + i_13;
		int i_17 = this.aShort8570 + i_14;
		int i_18 = this.aShort8571 + i_15;
		int i_19 = i_16 - (i_13 << i_5);
		int i_20 = i_17 - (i_14 << i_5);
		int i_21 = i_18 - (i_15 << i_5);
		int i_22 = i_16 + (i_13 << i_5);
		int i_23 = i_17 + (i_14 << i_5);
		int i_24 = i_18 + (i_15 << i_5);
		this.anIntArray8583[0] = i_19;
		this.anIntArray8639[0] = i_20;
		this.anIntArray8628[0] = i_21;
		this.anIntArray8583[1] = i_22;
		this.anIntArray8639[1] = i_20;
		this.anIntArray8628[1] = i_21;
		this.anIntArray8583[2] = i_19;
		this.anIntArray8639[2] = i_23;
		this.anIntArray8628[2] = i_21;
		this.anIntArray8583[3] = i_22;
		this.anIntArray8639[3] = i_23;
		this.anIntArray8628[3] = i_21;
		this.anIntArray8583[4] = i_19;
		this.anIntArray8639[4] = i_20;
		this.anIntArray8628[4] = i_24;
		this.anIntArray8583[5] = i_22;
		this.anIntArray8639[5] = i_20;
		this.anIntArray8628[5] = i_24;
		this.anIntArray8583[6] = i_19;
		this.anIntArray8639[6] = i_23;
		this.anIntArray8628[6] = i_24;
		this.anIntArray8583[7] = i_22;
		this.anIntArray8639[7] = i_23;
		this.anIntArray8628[7] = i_24;

		int i_25;
		int i_26;
		int i_27;
		int i_28;
		float f_29;
		float f_30;
		float f_31;
		float f_32;
		for (i_25 = 0; i_25 < 8; i_25++) {
			i_26 = this.anIntArray8583[i_25];
			i_27 = this.anIntArray8639[i_25];
			i_28 = this.anIntArray8628[i_25];
			f_29 = matrix44arr_7.buf[2] * (float) i_26 + matrix44arr_7.buf[6] * (float) i_27 + matrix44arr_7.buf[10] * (float) i_28 + matrix44arr_7.buf[14];
			f_30 = matrix44arr_7.buf[3] * (float) i_26 + matrix44arr_7.buf[7] * (float) i_27 + matrix44arr_7.buf[11] * (float) i_28 + matrix44arr_7.buf[15];
			if (f_29 >= -f_30) {
				f_31 = matrix44arr_7.buf[0] * (float) i_26 + matrix44arr_7.buf[4] * (float) i_27 + matrix44arr_7.buf[8] * (float) i_28 + matrix44arr_7.buf[12];
				f_32 = matrix44arr_7.buf[1] * (float) i_26 + matrix44arr_7.buf[5] * (float) i_27 + matrix44arr_7.buf[9] * (float) i_28 + matrix44arr_7.buf[13];
				int i_33 = (int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_30);
				int i_34 = (int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_32 / f_30);
				if (i_33 < i_9) {
					i_9 = i_33;
				}

				if (i_33 > i_10) {
					i_10 = i_33;
				}

				if (i_34 < i_11) {
					i_11 = i_34;
				}

				if (i_34 > i_12) {
					i_12 = i_34;
				}

				bool_8 = true;
			}
		}

		if (bool_8 && i_1 > i_9 && i_1 < i_10 && i_2 > i_11 && i_2 < i_12) {
			if (bool_4) {
				return true;
			}

			for (i_25 = 0; i_25 < this.anInt8578; i_25++) {
				i_26 = this.anIntArray8580[i_25];
				i_27 = this.anIntArray8581[i_25];
				i_28 = this.anIntArray8610[i_25];
				f_29 = matrix44arr_7.buf[2] * (float) i_26 + matrix44arr_7.buf[6] * (float) i_27 + matrix44arr_7.buf[10] * (float) i_28 + matrix44arr_7.buf[14];
				f_30 = matrix44arr_7.buf[3] * (float) i_26 + matrix44arr_7.buf[7] * (float) i_27 + matrix44arr_7.buf[11] * (float) i_28 + matrix44arr_7.buf[15];
				if (f_29 >= -f_30) {
					f_31 = matrix44arr_7.buf[0] * (float) i_26 + matrix44arr_7.buf[4] * (float) i_27 + matrix44arr_7.buf[8] * (float) i_28 + matrix44arr_7.buf[12];
					f_32 = matrix44arr_7.buf[1] * (float) i_26 + matrix44arr_7.buf[5] * (float) i_27 + matrix44arr_7.buf[9] * (float) i_28 + matrix44arr_7.buf[13];
					this.aFloatArray8590[i_25] = (float) ((int) (this.aClass505_Sub3_8638.aFloat9003 + this.aClass505_Sub3_8638.aFloat8976 * f_31 / f_30));
					this.aFloatArray8605[i_25] = (float) ((int) (this.aClass505_Sub3_8638.aFloat8982 + this.aClass505_Sub3_8638.aFloat9004 * f_32 / f_30));
				} else {
					this.aFloatArray8590[i_25] = -999999.0F;
				}
			}

			for (i_25 = 0; i_25 < this.anInt8586; i_25++) {
				if (this.aFloatArray8590[this.aShortArray8587[i_25]] != -999999.0F && this.aFloatArray8590[this.aShortArray8588[i_25]] != -999999.0F && this.aFloatArray8590[this.aShortArray8642[i_25]] != -999999.0F && this.method13819(i_1, i_2, this.aFloatArray8605[this.aShortArray8587[i_25]], this.aFloatArray8605[this.aShortArray8588[i_25]], this.aFloatArray8605[this.aShortArray8642[i_25]], this.aFloatArray8590[this.aShortArray8587[i_25]], this.aFloatArray8590[this.aShortArray8588[i_25]], this.aFloatArray8590[this.aShortArray8642[i_25]])) {
					return true;
				}
			}
		}

		return false;
	}

	public int cc() {
		if (!this.aBool8621) {
			this.method13876();
		}

		return this.aShort8634;
	}

	public Shadow dw(Shadow class282_sub50_sub17_1) {
		return null;
	}

	public void dk(int i_1, int i_2, int i_3) {
		if (i_1 != 0 && (this.anInt8575 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (i_2 != 0 && (this.anInt8575 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (i_3 != 0 && (this.anInt8575 & 0x4) != 4) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] += i_1;
					this.anIntArray8581[i_5] += i_2;
					this.anIntArray8610[i_5] += i_3;
				}

			}
		}
	}

	public int dq() {
		return this.anInt8606;
	}

	public void ep(int i_1, int i_2, int i_3) {
		if (i_1 != 128 && (this.anInt8575 & 0x1) != 1) {
			throw new IllegalStateException();
		} else if (i_2 != 128 && (this.anInt8575 & 0x2) != 2) {
			throw new IllegalStateException();
		} else if (i_3 != 128 && (this.anInt8575 & 0x4) != 4) {
			throw new IllegalStateException();
		} else {
			synchronized (this) {
				for (int i_5 = 0; i_5 < this.anInt8578; i_5++) {
					this.anIntArray8580[i_5] = this.anIntArray8580[i_5] * i_1 >> 7;
					this.anIntArray8581[i_5] = this.anIntArray8581[i_5] * i_2 >> 7;
					this.anIntArray8610[i_5] = this.anIntArray8610[i_5] * i_3 >> 7;
				}

				this.aBool8621 = false;
			}
		}
	}

}
