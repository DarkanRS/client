public class Class344 {

	int anInt4015;
	int anInt4012;
	int[][] anIntArrayArray4017;

	byte[] method6102(byte[] bytes_1, int i_2) {
		if (this.anIntArrayArray4017 != null) {
			int i_3 = (int) ((long) this.anInt4012 * (long) bytes_1.length / (long) this.anInt4015) + 14;
			int[] ints_4 = new int[i_3];
			int i_5 = 0;
			int i_6 = 0;

			int i_7;
			for (i_7 = 0; i_7 < bytes_1.length; i_7++) {
				byte b_8 = bytes_1[i_7];
				int[] ints_9 = this.anIntArrayArray4017[i_6];

				int i_10;
				for (i_10 = 0; i_10 < 14; i_10++) {
					ints_4[i_5 + i_10] += b_8 * ints_9[i_10];
				}

				i_6 += this.anInt4012;
				i_10 = i_6 / this.anInt4015;
				i_5 += i_10;
				i_6 -= i_10 * this.anInt4015;
			}

			bytes_1 = new byte[i_3];

			for (i_7 = 0; i_7 < i_3; i_7++) {
				int i_11 = ints_4[i_7] + 32768 >> 16;
				if (i_11 < -128) {
					bytes_1[i_7] = -128;
				} else if (i_11 > 127) {
					bytes_1[i_7] = 127;
				} else {
					bytes_1[i_7] = (byte) i_11;
				}
			}
		}

		return bytes_1;
	}

	public Class344(int i_1, int i_2) {
		if (i_2 != i_1) {
			int i_3 = Class96_Sub15.method14645(i_1, i_2, 1499248528);
			i_1 /= i_3;
			i_2 /= i_3;
			this.anInt4015 = i_1;
			this.anInt4012 = i_2;
			this.anIntArrayArray4017 = new int[i_1][14];

			for (int i_4 = 0; i_4 < i_1; i_4++) {
				int[] ints_5 = this.anIntArrayArray4017[i_4];
				double d_6 = (double) i_4 / (double) i_1 + 6.0D;
				int i_8 = (int) Math.floor(d_6 - 7.0D + 1.0D);
				if (i_8 < 0) {
					i_8 = 0;
				}

				int i_9 = (int) Math.ceil(7.0D + d_6);
				if (i_9 > 14) {
					i_9 = 14;
				}

				for (double d_10 = (double) i_2 / (double) i_1; i_8 < i_9; i_8++) {
					double d_12 = ((double) i_8 - d_6) * 3.141592653589793D;
					double d_14 = d_10;
					if (d_12 < -1.0E-4D || d_12 > 1.0E-4D) {
						d_14 = d_10 * (Math.sin(d_12) / d_12);
					}

					d_14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) i_8 - d_6));
					ints_5[i_8] = (int) Math.floor(d_14 * 65536.0D + 0.5D);
				}
			}
		}

	}

	public short[] method6111(short[] shorts_1, int i_2) {
		if (this.anIntArrayArray4017 != null) {
			int i_3 = (int) ((long) shorts_1.length * (long) this.anInt4012 / (long) this.anInt4015) + 14;
			int[] ints_4 = new int[i_3];
			int i_5 = 0;
			int i_6 = 0;

			int i_7;
			for (i_7 = 0; i_7 < shorts_1.length; i_7++) {
				short s_8 = shorts_1[i_7];
				int[] ints_9 = this.anIntArrayArray4017[i_6];

				int i_10;
				for (i_10 = 0; i_10 < 14; i_10++) {
					ints_4[i_10 + i_5] += ints_9[i_10] * s_8 >> 2;
				}

				i_6 += this.anInt4012;
				i_10 = i_6 / this.anInt4015;
				i_5 += i_10;
				i_6 -= i_10 * this.anInt4015;
			}

			shorts_1 = new short[i_3];

			for (i_7 = 0; i_7 < i_3; i_7++) {
				int i_11 = ints_4[i_7] + 8192 >> 14;
				if (i_11 < -32768) {
					shorts_1[i_7] = -32768;
				} else if (i_11 > 32767) {
					shorts_1[i_7] = 32767;
				} else {
					shorts_1[i_7] = (short) i_11;
				}
			}
		}

		return shorts_1;
	}

	int method6112(int i_1, int i_2) {
		if (this.anIntArrayArray4017 != null) {
			i_1 = (int) ((long) this.anInt4012 * (long) i_1 / (long) this.anInt4015);
		}

		return i_1;
	}

	int method6114(int i_1, int i_2) {
		if (this.anIntArrayArray4017 != null) {
			i_1 = (int) ((long) this.anInt4012 * (long) i_1 / (long) this.anInt4015) + 6;
		}

		return i_1;
	}

	public static RouteStrategy method6115(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		Class224.aClass225_Sub3_2773.approxDestinationX = i_0;
		Class224.aClass225_Sub3_2773.approxDestinationY = i_1;
		Class224.aClass225_Sub3_2773.approxDestinationSizeX = i_2;
		Class224.aClass225_Sub3_2773.approxDestinationSizeY = i_3;
		Class224.aClass225_Sub3_2773.anInt7929 = i_4;
		return Class224.aClass225_Sub3_2773;
	}

	static final void method6116(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		Class282_Sub17.method12260(icomponentdefinitions_4, interface_5, cs2executor_0, 603809090);
	}

	static final void method6117(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		int i_3 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (i_3 == -1) {
			throw new RuntimeException("");
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_2 + (char) i_3;
		}
	}

	public static String method6118(byte[] bytes_0, int i_1, int i_2, byte b_3) {
		char[] arr_4 = new char[i_2];
		int i_5 = 0;

		for (int i_6 = 0; i_6 < i_2; i_6++) {
			int i_7 = bytes_0[i_6 + i_1] & 0xff;
			if (i_7 != 0) {
				if (i_7 >= 128 && i_7 < 160) {
					char var_8 = Class490.aCharArray5766[i_7 - 128];
					if (var_8 == 0) {
						var_8 = 63;
					}

					i_7 = var_8;
				}

				arr_4[i_5++] = (char) i_7;
			}
		}

		return new String(arr_4, 0, i_5);
	}

	public static final void method6119(String string_0, int i_1) {
		if (Class467.aClass173Array5575 != null) {
			Class184 class184_2 = Class468_Sub20.method12807(978713855);
			TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4618, class184_2.isaac, 808752825);
			tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_0));
			tcpmessage_3.buffer.writeString(string_0);
			class184_2.method3049(tcpmessage_3, 1620839155);
		}

	}

	static final void method6120(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class52.method1083(icomponentdefinitions_3, interface_4, cs2executor_0, -1250124563);
	}

	static final void method6121(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class20.anInt169;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class20.anInt170;
	}

	static final void method6122(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aString1369 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
	}

}
