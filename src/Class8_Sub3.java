import java.io.IOException;

public class Class8_Sub3 extends FontRenderer {

	HardwareRenderer aClass505_Sub3_8968;

	int[] anIntArray8969;

	int[] anIntArray8971;

	byte[][] aByteArrayArray8967;

	int[] anIntArray8972;

	int[] anIntArray8973;

	int[] anIntArray8970;

	void UA(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.aClass505_Sub3_8968.anIntArray8979 != null) {
			i_2 += this.anIntArray8973[var_1];
			i_3 += this.anIntArray8972[var_1];
			int i_6 = this.anIntArray8969[var_1];
			int i_7 = this.anIntArray8971[var_1];
			int i_8 = this.aClass505_Sub3_8968.anInt8980;
			int i_9 = i_2 + i_3 * i_8;
			int i_10 = i_8 - i_6;
			int i_11 = 0;
			int i_12 = 0;
			int i_13;
			if (i_3 < this.aClass505_Sub3_8968.anInt9009) {
				i_13 = this.aClass505_Sub3_8968.anInt9009 - i_3;
				i_7 -= i_13;
				i_3 = this.aClass505_Sub3_8968.anInt9009;
				i_12 += i_13 * i_6;
				i_9 += i_13 * i_8;
			}
			if (i_3 + i_7 > this.aClass505_Sub3_8968.anInt8986) {
				i_7 -= i_3 + i_7 - this.aClass505_Sub3_8968.anInt8986;
			}
			if (i_2 < this.aClass505_Sub3_8968.anInt8983) {
				i_13 = this.aClass505_Sub3_8968.anInt8983 - i_2;
				i_6 -= i_13;
				i_2 = this.aClass505_Sub3_8968.anInt8983;
				i_12 += i_13;
				i_9 += i_13;
				i_11 += i_13;
				i_10 += i_13;
			}
			if (i_6 + i_2 > this.aClass505_Sub3_8968.anInt9002) {
				i_13 = i_6 + i_2 - this.aClass505_Sub3_8968.anInt9002;
				i_6 -= i_13;
				i_11 += i_13;
				i_10 += i_13;
			}
			if (i_6 > 0 && i_7 > 0) {
				if (bool_5) {
					this.method14325(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
				} else {
					this.method14334(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, this.anIntArray8970, i_12, i_9, i_6, i_7, i_10, i_11);
				}
			}
		}
	}

	void method14325(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		int i_10 = -(i_6 >> 2);
		i_6 = -(i_6 & 0x3);
		for (int i_11 = -i_7; i_11 < 0; i_11++) {
			int i_12;
			for (i_12 = i_10; i_12 < 0; i_12++) {
				if (bytes_1[i_4++] != 0) {
					ints_2[i_5++] = i_3;
				} else {
					++i_5;
				}
				if (bytes_1[i_4++] != 0) {
					ints_2[i_5++] = i_3;
				} else {
					++i_5;
				}
				if (bytes_1[i_4++] != 0) {
					ints_2[i_5++] = i_3;
				} else {
					++i_5;
				}
				if (bytes_1[i_4++] != 0) {
					ints_2[i_5++] = i_3;
				} else {
					++i_5;
				}
			}
			for (i_12 = i_6; i_12 < 0; i_12++) {
				if (bytes_1[i_4++] != 0) {
					ints_2[i_5++] = i_3;
				} else {
					++i_5;
				}
			}
			i_5 += i_8;
			i_4 += i_9;
		}
	}

	void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
		if (this.aClass505_Sub3_8968.anIntArray8979 != null) {
			if (class455_6 == null) {
				this.UA(var_1, i_2, i_3, i_4, bool_5);
			} else {
				i_2 += this.anIntArray8973[var_1];
				i_3 += this.anIntArray8972[var_1];
				int i_9 = this.anIntArray8969[var_1];
				int i_10 = this.anIntArray8971[var_1];
				int i_11 = this.aClass505_Sub3_8968.anInt8980;
				int i_12 = i_2 + i_3 * i_11;
				int i_13 = i_11 - i_9;
				int i_14 = 0;
				int i_15 = 0;
				int i_16;
				if (i_3 < this.aClass505_Sub3_8968.anInt9009) {
					i_16 = this.aClass505_Sub3_8968.anInt9009 - i_3;
					i_10 -= i_16;
					i_3 = this.aClass505_Sub3_8968.anInt9009;
					i_15 += i_9 * i_16;
					i_12 += i_16 * i_11;
				}
				if (i_3 + i_10 > this.aClass505_Sub3_8968.anInt8986) {
					i_10 -= i_3 + i_10 - this.aClass505_Sub3_8968.anInt8986;
				}
				if (i_2 < this.aClass505_Sub3_8968.anInt8983) {
					i_16 = this.aClass505_Sub3_8968.anInt8983 - i_2;
					i_9 -= i_16;
					i_2 = this.aClass505_Sub3_8968.anInt8983;
					i_15 += i_16;
					i_12 += i_16;
					i_14 += i_16;
					i_13 += i_16;
				}
				if (i_9 + i_2 > this.aClass505_Sub3_8968.anInt9002) {
					i_16 = i_9 + i_2 - this.aClass505_Sub3_8968.anInt9002;
					i_9 -= i_16;
					i_14 += i_16;
					i_13 += i_16;
				}
				if (i_9 > 0 && i_10 > 0) {
					if (bool_5) {
						this.method14327(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_2, i_3, this.anIntArray8969[var_1], class455_6, i_7, i_8);
					} else {
						this.method14326(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, this.anIntArray8970, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_2, i_3, this.anIntArray8969[var_1], class455_6, i_7, i_8);
					}
				}
			}
		}
	}

	void method14326(byte[] bytes_1, int[] ints_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, Class455 class455_14, int i_15, int i_16) {
		PacketsDecoder packetsdecoder_17 = (PacketsDecoder) class455_14;
		int[] ints_18 = packetsdecoder_17.anIntArray9077;
		int[] ints_19 = packetsdecoder_17.anIntArray9078;
		int i_20 = i_11 - this.aClass505_Sub3_8968.anInt8983;
		int i_21 = i_12;
		if (i_16 > i_12) {
			i_21 = i_16;
			i_6 += (i_16 - i_12) * this.aClass505_Sub3_8968.anInt8980;
			i_5 += i_13 * (i_16 - i_12);
		}
		int i_22 = ints_18.length + i_16 < i_8 + i_12 ? ints_18.length + i_16 : i_8 + i_12;
		boolean bool_23 = false;
		for (int i_24 = i_21; i_24 < i_22; i_24++) {
			int i_25 = i_15 + ints_18[i_24 - i_16];
			int i_26 = ints_19[i_24 - i_16];
			int i_27 = i_7;
			int i_28;
			if (i_20 > i_25) {
				i_28 = i_20 - i_25;
				if (i_28 >= i_26) {
					i_5 = i_5 + i_10 + i_7;
					i_6 += i_7 + i_9;
					continue;
				}
				i_26 -= i_28;
			} else {
				i_28 = i_25 - i_20;
				if (i_28 >= i_7) {
					i_5 = i_5 + i_10 + i_7;
					i_6 += i_7 + i_9;
					continue;
				}
				i_5 += i_28;
				i_27 = i_7 - i_28;
				i_6 += i_28;
			}
			i_28 = 0;
			if (i_27 < i_26) {
				i_26 = i_27;
			} else {
				i_28 = i_27 - i_26;
			}
			for (int i_29 = -i_26; i_29 < 0; i_29++) {
				byte b_30;
				if ((b_30 = bytes_1[i_5++]) != 0) {
					ints_2[i_6++] = ints_3[b_30 & 0xff];
				} else {
					++i_6;
				}
			}
			i_5 = i_5 + i_10 + i_28;
			i_6 += i_28 + i_9;
		}
	}

	void method14327(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Class455 class455_13, int i_14, int i_15) {
		PacketsDecoder packetsdecoder_16 = (PacketsDecoder) class455_13;
		int[] ints_17 = packetsdecoder_16.anIntArray9077;
		int[] ints_18 = packetsdecoder_16.anIntArray9078;
		int i_19 = i_10 - this.aClass505_Sub3_8968.anInt8983;
		int i_20 = i_11;
		if (i_15 > i_11) {
			i_20 = i_15;
			i_5 += this.aClass505_Sub3_8968.anInt8980 * (i_15 - i_11);
			i_4 += (i_15 - i_11) * i_12;
		}
		int i_21 = ints_17.length + i_15 < i_11 + i_7 ? ints_17.length + i_15 : i_11 + i_7;
		for (int i_22 = i_20; i_22 < i_21; i_22++) {
			int i_23 = ints_17[i_22 - i_15] + i_14;
			int i_24 = ints_18[i_22 - i_15];
			int i_25 = i_6;
			int i_26;
			if (i_19 > i_23) {
				i_26 = i_19 - i_23;
				if (i_26 >= i_24) {
					i_4 = i_4 + i_9 + i_6;
					i_5 = i_5 + i_8 + i_6;
					continue;
				}
				i_24 -= i_26;
			} else {
				i_26 = i_23 - i_19;
				if (i_26 >= i_6) {
					i_4 = i_4 + i_9 + i_6;
					i_5 = i_5 + i_8 + i_6;
					continue;
				}
				i_4 += i_26;
				i_25 = i_6 - i_26;
				i_5 += i_26;
			}
			i_26 = 0;
			if (i_25 < i_24) {
				i_24 = i_25;
			} else {
				i_26 = i_25 - i_24;
			}
			for (int i_27 = -i_24; i_27 < 0; i_27++) {
				if (bytes_1[i_4++] != 0) {
					ints_2[i_5++] = i_3;
				} else {
					++i_5;
				}
			}
			i_4 += i_26 + i_4;
			i_5 = i_5 + i_26 + i_8;
		}
	}

	void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
		if (this.aClass505_Sub3_8968.anIntArray8979 != null) {
			if (class455_6 == null) {
				this.UA(var_1, i_2, i_3, i_4, bool_5);
			} else {
				i_2 += this.anIntArray8973[var_1];
				i_3 += this.anIntArray8972[var_1];
				int i_9 = this.anIntArray8969[var_1];
				int i_10 = this.anIntArray8971[var_1];
				int i_11 = this.aClass505_Sub3_8968.anInt8980 * 299731099 * 444800403;
				int i_12 = i_2 + i_3 * i_11;
				int i_13 = i_11 - i_9;
				int i_14 = 0;
				int i_15 = 0;
				int i_16;
				if (i_3 < 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577) {
					i_16 = 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577 - i_3;
					i_10 -= i_16;
					i_3 = this.aClass505_Sub3_8968.anInt9009 * 1457972577 * 1516535457;
					i_15 += i_9 * i_16;
					i_12 += i_16 * i_11;
				}
				if (i_10 + i_3 > 1383960921 * this.aClass505_Sub3_8968.anInt8986 * 760194793) {
					i_10 -= i_3 + i_10 - 1383960921 * this.aClass505_Sub3_8968.anInt8986 * 760194793;
				}
				if (i_2 < this.aClass505_Sub3_8968.anInt8983 * -363774331 * 72550989) {
					i_16 = this.aClass505_Sub3_8968.anInt8983 * -363774331 * 72550989 - i_2;
					i_9 -= i_16;
					i_2 = 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331;
					i_15 += i_16;
					i_12 += i_16;
					i_14 += i_16;
					i_13 += i_16;
				}
				if (i_2 + i_9 > -1710988237 * this.aClass505_Sub3_8968.anInt9002 * 1714763515) {
					i_16 = i_9 + i_2 - this.aClass505_Sub3_8968.anInt9002 * 1714763515 * -1710988237;
					i_9 -= i_16;
					i_14 += i_16;
					i_13 += i_16;
				}
				if (i_9 > 0 && i_10 > 0) {
					if (bool_5) {
						this.method14327(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_2, i_3, this.anIntArray8969[var_1], class455_6, i_7, i_8);
					} else {
						this.method14326(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, this.anIntArray8970, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_2, i_3, this.anIntArray8969[var_1], class455_6, i_7, i_8);
					}
				}
			}
		}
	}

	void c(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.aClass505_Sub3_8968.anIntArray8979 != null) {
			i_2 += this.anIntArray8973[var_1];
			i_3 += this.anIntArray8972[var_1];
			int i_6 = this.anIntArray8969[var_1];
			int i_7 = this.anIntArray8971[var_1];
			int i_8 = 444800403 * this.aClass505_Sub3_8968.anInt8980 * 299731099;
			int i_9 = i_3 * i_8 + i_2;
			int i_10 = i_8 - i_6;
			int i_11 = 0;
			int i_12 = 0;
			int i_13;
			if (i_3 < 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577) {
				i_13 = 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577 - i_3;
				i_7 -= i_13;
				i_3 = 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577;
				i_12 += i_13 * i_6;
				i_9 += i_13 * i_8;
			}
			if (i_7 + i_3 > this.aClass505_Sub3_8968.anInt8986 * 760194793 * 1383960921) {
				i_7 -= i_3 + i_7 - this.aClass505_Sub3_8968.anInt8986 * 760194793 * 1383960921;
			}
			if (i_2 < 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331) {
				i_13 = 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331 - i_2;
				i_6 -= i_13;
				i_2 = 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331;
				i_12 += i_13;
				i_9 += i_13;
				i_11 += i_13;
				i_10 += i_13;
			}
			if (i_2 + i_6 > -1710988237 * this.aClass505_Sub3_8968.anInt9002 * 1714763515) {
				i_13 = i_2 + i_6 - -1710988237 * this.aClass505_Sub3_8968.anInt9002 * 1714763515;
				i_6 -= i_13;
				i_11 += i_13;
				i_10 += i_13;
			}
			if (i_6 > 0 && i_7 > 0) {
				if (bool_5) {
					this.method14325(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
				} else {
					this.method14334(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, this.anIntArray8970, i_12, i_9, i_6, i_7, i_10, i_11);
				}
			}
		}
	}

	Class8_Sub3(HardwareRenderer hardwarerenderer_1, FontMetrics fontmetrics_2, Class91[] arr_3, int[] ints_4, int[] ints_5) {
		super(hardwarerenderer_1, fontmetrics_2);
		this.aClass505_Sub3_8968 = hardwarerenderer_1;
		this.aClass505_Sub3_8968 = hardwarerenderer_1;
		this.anIntArray8969 = ints_4;
		this.anIntArray8971 = ints_5;
		this.aByteArrayArray8967 = new byte[arr_3.length][];
		this.anIntArray8972 = new int[arr_3.length];
		this.anIntArray8973 = new int[arr_3.length];
		for (int i_6 = 0; i_6 < arr_3.length; i_6++) {
			this.aByteArrayArray8967[i_6] = arr_3[i_6].aByteArray960;
			this.anIntArray8972[i_6] = arr_3[i_6].anInt959;
			this.anIntArray8973[i_6] = arr_3[i_6].anInt956;
		}
		this.anIntArray8970 = arr_3[0].anIntArray955;
	}

	void t(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.aClass505_Sub3_8968.anIntArray8979 != null) {
			i_2 += this.anIntArray8973[var_1];
			i_3 += this.anIntArray8972[var_1];
			int i_6 = this.anIntArray8969[var_1];
			int i_7 = this.anIntArray8971[var_1];
			int i_8 = 444800403 * this.aClass505_Sub3_8968.anInt8980 * 299731099;
			int i_9 = i_3 * i_8 + i_2;
			int i_10 = i_8 - i_6;
			int i_11 = 0;
			int i_12 = 0;
			int i_13;
			if (i_3 < 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577) {
				i_13 = 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577 - i_3;
				i_7 -= i_13;
				i_3 = 1516535457 * this.aClass505_Sub3_8968.anInt9009 * 1457972577;
				i_12 += i_13 * i_6;
				i_9 += i_13 * i_8;
			}
			if (i_7 + i_3 > this.aClass505_Sub3_8968.anInt8986 * 760194793 * 1383960921) {
				i_7 -= i_3 + i_7 - this.aClass505_Sub3_8968.anInt8986 * 760194793 * 1383960921;
			}
			if (i_2 < 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331) {
				i_13 = 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331 - i_2;
				i_6 -= i_13;
				i_2 = 72550989 * this.aClass505_Sub3_8968.anInt8983 * -363774331;
				i_12 += i_13;
				i_9 += i_13;
				i_11 += i_13;
				i_10 += i_13;
			}
			if (i_2 + i_6 > -1710988237 * this.aClass505_Sub3_8968.anInt9002 * 1714763515) {
				i_13 = i_2 + i_6 - -1710988237 * this.aClass505_Sub3_8968.anInt9002 * 1714763515;
				i_6 -= i_13;
				i_11 += i_13;
				i_10 += i_13;
			}
			if (i_6 > 0 && i_7 > 0) {
				if (bool_5) {
					this.method14325(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
				} else {
					this.method14334(this.aByteArrayArray8967[var_1], this.aClass505_Sub3_8968.anIntArray8979, this.anIntArray8970, i_12, i_9, i_6, i_7, i_10, i_11);
				}
			}
		}
	}

	void method14334(byte[] bytes_1, int[] ints_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		int i_10 = -(i_6 >> 2);
		i_6 = -(i_6 & 0x3);
		boolean bool_11 = false;
		for (int i_12 = -i_7; i_12 < 0; i_12++) {
			int i_13;
			byte b_14;
			for (i_13 = i_10; i_13 < 0; i_13++) {
				if ((b_14 = bytes_1[i_4++]) != 0) {
					ints_2[i_5++] = ints_3[b_14 & 0xff];
				} else {
					++i_5;
				}
				if ((b_14 = bytes_1[i_4++]) != 0) {
					ints_2[i_5++] = ints_3[b_14 & 0xff];
				} else {
					++i_5;
				}
				if ((b_14 = bytes_1[i_4++]) != 0) {
					ints_2[i_5++] = ints_3[b_14 & 0xff];
				} else {
					++i_5;
				}
				if ((b_14 = bytes_1[i_4++]) != 0) {
					ints_2[i_5++] = ints_3[b_14 & 0xff];
				} else {
					++i_5;
				}
			}
			for (i_13 = i_6; i_13 < 0; i_13++) {
				if ((b_14 = bytes_1[i_4++]) != 0) {
					ints_2[i_5++] = ints_3[b_14 & 0xff];
				} else {
					++i_5;
				}
			}
			i_5 += i_8;
			i_4 += i_9;
		}
	}

	static final void method14336(Class521_Sub1 class521_sub1_0, int i_1, boolean bool_2, int i_3) {
		int i_4;
		int i_5;
		if (class521_sub1_0 instanceof Class521_Sub1_Sub1 && class521_sub1_0 instanceof SceneObject) {
			Class521_Sub1_Sub1 class521_sub1_sub1_9 = (Class521_Sub1_Sub1) class521_sub1_0;
			int i_7 = class521_sub1_sub1_9.localX - class521_sub1_sub1_9.aShort9458 + 1 << 9;
			int i_8 = class521_sub1_sub1_9.localY - class521_sub1_sub1_9.aShort9456 + 1 << 9;
			i_4 = i_7 / 2 + (class521_sub1_sub1_9.aShort9458 << 9);
			i_5 = i_8 / 2 + (class521_sub1_sub1_9.aShort9456 << 9);
		} else {
			Vector3 vector3_6 = class521_sub1_0.method11166().aClass385_3595;
			i_4 = (int) vector3_6.x;
			i_5 = (int) vector3_6.z;
		}
		Class210.method3612(class521_sub1_0.plane, i_4, i_5, 0, i_1, bool_2, (byte) 29);
	}

	public static int method14337(int i_0, int i_1, int i_2, int i_3) {
		int i_4 = 255 - i_2;
		i_1 = ((i_1 & 0xff00ff) * i_2 & ~0xff00ff | (i_1 & 0xff00) * i_2 & 0xff0000) >>> 8;
		return ((i_4 * (i_0 & 0xff00ff) & ~0xff00ff | (i_0 & 0xff00) * i_4 & 0xff0000) >>> 8) + i_1;
	}

	static final boolean method14338(BufferedConnectionContext class184_0, byte b_1) {
		try {
			boolean bool_2 = PacketsDecoder.method14433(class184_0);
			return bool_2;
		} catch (IOException ioexception_7) {
			if (client.gameState == 7) {
				class184_0.method3061(-1844369751);
				return false;
			} else {
				Class151.method2592((byte) 31);
				return true;
			}
		} catch (Exception exception_8) {
			CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			String string_5 = (class184_0.currentPacket != null ? class184_0.currentPacket.opcode : -1) + "," + (class184_0.secondLastPacket != null ? class184_0.secondLastPacket.opcode : -1) + "," + (class184_0.thirdLastPacket != null ? class184_0.thirdLastPacket.opcode : -1) + " " + class184_0.currentPacketSize + "," + (Class84.myPlayer.regionBaseX[0] + coordgrid_4.x) + "," + (Class84.myPlayer.regionBaseY[0] + coordgrid_4.y) + " ";
			for (int i_6 = 0; i_6 < class184_0.currentPacketSize && i_6 < 50; i_6++) {
				string_5 = string_5 + class184_0.recievedBuffer.buffer[i_6] + ",";
			}
			Class151.method2594(string_5, exception_8, (byte) -124);
			Class438.method7333(false, 2019589827);
			return true;
		}
	}

	public static Class249[] method14339() {
		return new Class249[] { Class249.aClass249_3082, Class249.aClass249_3084, Class249.aClass249_3086, Class249.aClass249_3083 };
	}

	static void method14341(int i_0) {
		PulseEvent.aClass465_9667.method7749(207048647);
		PulseEvent.aClass477_9655.method7935((byte) -65);
		PulseEvent.aClass477_9666.method7935((byte) -9);
	}
}
