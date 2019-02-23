public class Class282_Sub14 extends Node {

	static int anInt7597;
	int[] anIntArray7596 = new int[128];
	Class282_Sub26_Sub1[] aClass282_Sub26_Sub1Array7589 = new Class282_Sub26_Sub1[128];
	short[] aShortArray7590 = new short[128];
	byte[] aByteArray7592 = new byte[128];
	byte[] aByteArray7591 = new byte[128];
	Class110[] aClass110Array7594 = new Class110[128];
	byte[] aByteArray7595 = new byte[128];
	int anInt7593;

	boolean method12216(Class250 class250_1, byte[] bytes_2, int[] ints_3, int i_4) {
		boolean bool_5 = true;
		int i_6 = 0;
		Object obj_7 = null;

		for (int i_8 = 0; i_8 < 128; i_8++) {
			if (bytes_2 == null || bytes_2[i_8] != 0) {
				int i_9 = this.anIntArray7596[i_8];
				if (i_9 != 0) {
					if (i_9 != i_6) {
						i_6 = i_9--;
						if ((i_9 & 0x1) == 0) {
							obj_7 = class250_1.method4290(i_9 >> 2, ints_3, (byte) 36);
						} else {
							obj_7 = class250_1.method4287(i_9 >> 2, ints_3, -2001370194);
						}

						if (obj_7 == null) {
							bool_5 = false;
						}
					}

					if (obj_7 != null) {
						this.aClass282_Sub26_Sub1Array7589[i_8] = (Class282_Sub26_Sub1) obj_7;
						this.anIntArray7596[i_8] = 0;
					}
				}
			}
		}

		return bool_5;
	}

	void method12217(short s_1) {
		this.anIntArray7596 = null;
	}

	Class282_Sub14(byte[] bytes_1) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(bytes_1);

		int i_3;
		for (i_3 = 0; rsbytebuffer_2.buffer[i_3 + rsbytebuffer_2.index] != 0; i_3++) {
			;
		}

		byte[] bytes_4 = new byte[i_3];

		int i_5;
		for (i_5 = 0; i_5 < i_3; i_5++) {
			bytes_4[i_5] = rsbytebuffer_2.readByte();
		}

		++rsbytebuffer_2.index;
		++i_3;
		i_5 = rsbytebuffer_2.index;
		rsbytebuffer_2.index += i_3;

		int i_6;
		for (i_6 = 0; rsbytebuffer_2.buffer[i_6 + rsbytebuffer_2.index] != 0; i_6++) {
			;
		}

		byte[] bytes_7 = new byte[i_6];

		int i_8;
		for (i_8 = 0; i_8 < i_6; i_8++) {
			bytes_7[i_8] = rsbytebuffer_2.readByte();
		}

		++rsbytebuffer_2.index;
		++i_6;
		i_8 = rsbytebuffer_2.index;
		rsbytebuffer_2.index += i_6;

		int i_9;
		for (i_9 = 0; rsbytebuffer_2.buffer[i_9 + rsbytebuffer_2.index] != 0; i_9++) {
			;
		}

		byte[] bytes_10 = new byte[i_9];

		for (int i_11 = 0; i_11 < i_9; i_11++) {
			bytes_10[i_11] = rsbytebuffer_2.readByte();
		}

		++rsbytebuffer_2.index;
		++i_9;
		byte[] bytes_36 = new byte[i_9];
		int i_12;
		int i_14;
		if (i_9 > 1) {
			bytes_36[1] = 1;
			int i_13 = 1;
			i_12 = 2;

			for (i_14 = 2; i_14 < i_9; i_14++) {
				int i_41 = rsbytebuffer_2.readUnsignedByte();
				if (i_41 == 0) {
					i_13 = i_12++;
				} else {
					if (i_41 <= i_13) {
						--i_41;
					}

					i_13 = i_41;
				}

				bytes_36[i_14] = (byte) i_13;
			}
		} else {
			i_12 = i_9;
		}

		Class110[] arr_37 = new Class110[i_12];

		for (i_14 = 0; i_14 < arr_37.length; i_14++) {
			Class110 class110_15 = arr_37[i_14] = new Class110();
			int i_40 = rsbytebuffer_2.readUnsignedByte();
			if (i_40 > 0) {
				class110_15.aByteArray1097 = new byte[i_40 * 2];
			}

			i_40 = rsbytebuffer_2.readUnsignedByte();
			if (i_40 > 0) {
				class110_15.aByteArray1094 = new byte[i_40 * 2 + 2];
				class110_15.aByteArray1094[1] = 64;
			}
		}

		i_14 = rsbytebuffer_2.readUnsignedByte();
		byte[] bytes_43 = i_14 > 0 ? new byte[i_14 * 2] : null;
		i_14 = rsbytebuffer_2.readUnsignedByte();
		byte[] bytes_16 = i_14 > 0 ? new byte[i_14 * 2] : null;

		int i_17;
		for (i_17 = 0; rsbytebuffer_2.buffer[i_17 + rsbytebuffer_2.index] != 0; i_17++) {
			;
		}

		byte[] bytes_18 = new byte[i_17];

		int i_19;
		for (i_19 = 0; i_19 < i_17; i_19++) {
			bytes_18[i_19] = rsbytebuffer_2.readByte();
		}

		++rsbytebuffer_2.index;
		++i_17;
		i_19 = 0;

		int i_20;
		for (i_20 = 0; i_20 < 128; i_20++) {
			i_19 += rsbytebuffer_2.readUnsignedByte();
			this.aShortArray7590[i_20] = (short) i_19;
		}

		i_19 = 0;

		for (i_20 = 0; i_20 < 128; i_20++) {
			i_19 += rsbytebuffer_2.readUnsignedByte();
			this.aShortArray7590[i_20] = (short) (this.aShortArray7590[i_20] + (i_19 << 8));
		}

		i_20 = 0;
		int i_21 = 0;
		int i_22 = 0;

		int i_23;
		for (i_23 = 0; i_23 < 128; i_23++) {
			if (i_20 == 0) {
				if (i_21 < bytes_18.length) {
					i_20 = bytes_18[i_21++];
				} else {
					i_20 = -1;
				}

				i_22 = rsbytebuffer_2.method13099(774797043);
			}

			this.aShortArray7590[i_23] = (short) (this.aShortArray7590[i_23] + ((i_22 - 1 & 0x2) << 14));
			this.anIntArray7596[i_23] = i_22;
			--i_20;
		}

		i_20 = 0;
		i_21 = 0;
		i_23 = 0;

		int i_24;
		for (i_24 = 0; i_24 < 128; i_24++) {
			if (this.anIntArray7596[i_24] != 0) {
				if (i_20 == 0) {
					if (i_21 < bytes_4.length) {
						i_20 = bytes_4[i_21++];
					} else {
						i_20 = -1;
					}

					i_23 = rsbytebuffer_2.buffer[i_5++] - 1;
				}

				this.aByteArray7595[i_24] = (byte) i_23;
				--i_20;
			}
		}

		i_20 = 0;
		i_21 = 0;
		i_24 = 0;

		for (int i_25 = 0; i_25 < 128; i_25++) {
			if (this.anIntArray7596[i_25] != 0) {
				if (i_20 == 0) {
					if (i_21 < bytes_7.length) {
						i_20 = bytes_7[i_21++];
					} else {
						i_20 = -1;
					}

					i_24 = rsbytebuffer_2.buffer[i_8++] + 16 << 2;
				}

				this.aByteArray7591[i_25] = (byte) i_24;
				--i_20;
			}
		}

		i_20 = 0;
		i_21 = 0;
		Class110 class110_38 = null;

		int i_26;
		for (i_26 = 0; i_26 < 128; i_26++) {
			if (this.anIntArray7596[i_26] != 0) {
				if (i_20 == 0) {
					class110_38 = arr_37[bytes_36[i_21]];
					if (i_21 < bytes_10.length) {
						i_20 = bytes_10[i_21++];
					} else {
						i_20 = -1;
					}
				}

				this.aClass110Array7594[i_26] = class110_38;
				--i_20;
			}
		}

		i_20 = 0;
		i_21 = 0;
		i_26 = 0;

		int i_27;
		for (i_27 = 0; i_27 < 128; i_27++) {
			if (i_20 == 0) {
				if (i_21 < bytes_18.length) {
					i_20 = bytes_18[i_21++];
				} else {
					i_20 = -1;
				}

				if (this.anIntArray7596[i_27] > 0) {
					i_26 = rsbytebuffer_2.readUnsignedByte() + 1;
				}
			}

			this.aByteArray7592[i_27] = (byte) i_26;
			--i_20;
		}

		this.anInt7593 = rsbytebuffer_2.readUnsignedByte() + 1;

		int i_29;
		Class110 class110_42;
		for (i_27 = 0; i_27 < i_12; i_27++) {
			class110_42 = arr_37[i_27];
			if (class110_42.aByteArray1097 != null) {
				for (i_29 = 1; i_29 < class110_42.aByteArray1097.length; i_29 += 2) {
					class110_42.aByteArray1097[i_29] = rsbytebuffer_2.readByte();
				}
			}

			if (class110_42.aByteArray1094 != null) {
				for (i_29 = 3; i_29 < class110_42.aByteArray1094.length - 2; i_29 += 2) {
					class110_42.aByteArray1094[i_29] = rsbytebuffer_2.readByte();
				}
			}
		}

		if (bytes_43 != null) {
			for (i_27 = 1; i_27 < bytes_43.length; i_27 += 2) {
				bytes_43[i_27] = rsbytebuffer_2.readByte();
			}
		}

		if (bytes_16 != null) {
			for (i_27 = 1; i_27 < bytes_16.length; i_27 += 2) {
				bytes_16[i_27] = rsbytebuffer_2.readByte();
			}
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			class110_42 = arr_37[i_27];
			if (class110_42.aByteArray1094 != null) {
				i_19 = 0;

				for (i_29 = 2; i_29 < class110_42.aByteArray1094.length; i_29 += 2) {
					i_19 = 1 + i_19 + rsbytebuffer_2.readUnsignedByte();
					class110_42.aByteArray1094[i_29] = (byte) i_19;
				}
			}
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			class110_42 = arr_37[i_27];
			if (class110_42.aByteArray1097 != null) {
				i_19 = 0;

				for (i_29 = 2; i_29 < class110_42.aByteArray1097.length; i_29 += 2) {
					i_19 = i_19 + 1 + rsbytebuffer_2.readUnsignedByte();
					class110_42.aByteArray1097[i_29] = (byte) i_19;
				}
			}
		}

		byte b_30;
		int i_32;
		int i_33;
		int i_34;
		Object obj_39;
		byte b_47;
		if (bytes_43 != null) {
			i_19 = rsbytebuffer_2.readUnsignedByte();
			bytes_43[0] = (byte) i_19;

			for (i_27 = 2; i_27 < bytes_43.length; i_27 += 2) {
				i_19 = 1 + i_19 + rsbytebuffer_2.readUnsignedByte();
				bytes_43[i_27] = (byte) i_19;
			}

			b_47 = bytes_43[0];
			byte b_28 = bytes_43[1];

			for (i_29 = 0; i_29 < b_47; i_29++) {
				this.aByteArray7592[i_29] = (byte) (b_28 * this.aByteArray7592[i_29] + 32 >> 6);
			}

			for (i_29 = 2; i_29 < bytes_43.length; i_29 += 2) {
				b_30 = bytes_43[i_29];
				byte b_31 = bytes_43[i_29 + 1];
				i_32 = b_28 * (b_30 - b_47) + (b_30 - b_47) / 2;

				for (i_33 = b_47; i_33 < b_30; i_33++) {
					i_34 = Class371.method6349(i_32, b_30 - b_47, 1314552472);
					this.aByteArray7592[i_33] = (byte) (i_34 * this.aByteArray7592[i_33] + 32 >> 6);
					i_32 += b_31 - b_28;
				}

				b_47 = b_30;
				b_28 = b_31;
			}

			for (i_29 = b_47; i_29 < 128; i_29++) {
				this.aByteArray7592[i_29] = (byte) (b_28 * this.aByteArray7592[i_29] + 32 >> 6);
			}

			obj_39 = null;
		}

		if (bytes_16 != null) {
			i_19 = rsbytebuffer_2.readUnsignedByte();
			bytes_16[0] = (byte) i_19;

			for (i_27 = 2; i_27 < bytes_16.length; i_27 += 2) {
				i_19 = 1 + i_19 + rsbytebuffer_2.readUnsignedByte();
				bytes_16[i_27] = (byte) i_19;
			}

			b_47 = bytes_16[0];
			int i_44 = bytes_16[1] << 1;

			int i_45;
			for (i_29 = 0; i_29 < b_47; i_29++) {
				i_45 = i_44 + (this.aByteArray7591[i_29] & 0xff);
				if (i_45 < 0) {
					i_45 = 0;
				}

				if (i_45 > 128) {
					i_45 = 128;
				}

				this.aByteArray7591[i_29] = (byte) i_45;
			}

			for (i_29 = 2; i_29 < bytes_16.length; i_29 += 2) {
				b_30 = bytes_16[i_29];
				int i_46 = bytes_16[i_29 + 1] << 1;
				i_32 = i_44 * (b_30 - b_47) + (b_30 - b_47) / 2;

				for (i_33 = b_47; i_33 < b_30; i_33++) {
					i_34 = Class371.method6349(i_32, b_30 - b_47, -95801299);
					int i_35 = i_34 + (this.aByteArray7591[i_33] & 0xff);
					if (i_35 < 0) {
						i_35 = 0;
					}

					if (i_35 > 128) {
						i_35 = 128;
					}

					this.aByteArray7591[i_33] = (byte) i_35;
					i_32 += i_46 - i_44;
				}

				b_47 = b_30;
				i_44 = i_46;
			}

			for (i_29 = b_47; i_29 < 128; i_29++) {
				i_45 = i_44 + (this.aByteArray7591[i_29] & 0xff);
				if (i_45 < 0) {
					i_45 = 0;
				}

				if (i_45 > 128) {
					i_45 = 128;
				}

				this.aByteArray7591[i_29] = (byte) i_45;
			}

			obj_39 = null;
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			arr_37[i_27].anInt1096 = rsbytebuffer_2.readUnsignedByte();
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			class110_42 = arr_37[i_27];
			if (class110_42.aByteArray1097 != null) {
				class110_42.anInt1095 = rsbytebuffer_2.readUnsignedByte();
			}

			if (class110_42.aByteArray1094 != null) {
				class110_42.anInt1098 = rsbytebuffer_2.readUnsignedByte();
			}

			if (class110_42.anInt1096 > 0) {
				class110_42.anInt1099 = rsbytebuffer_2.readUnsignedByte();
			}
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			arr_37[i_27].anInt1101 = rsbytebuffer_2.readUnsignedByte();
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			class110_42 = arr_37[i_27];
			if (class110_42.anInt1101 > 0) {
				class110_42.anInt1100 = rsbytebuffer_2.readUnsignedByte();
			}
		}

		for (i_27 = 0; i_27 < i_12; i_27++) {
			class110_42 = arr_37[i_27];
			if (class110_42.anInt1100 > 0) {
				class110_42.anInt1102 = rsbytebuffer_2.readUnsignedByte();
			}
		}

	}

	public static final void method12221(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2, int i_3) {
		if (client.aClass118_7257 == null && !Class20.aBool161 && icomponentdefinitions_0 != null && Class96_Sub14.method14643(icomponentdefinitions_0, 735931958)) {
			client.aClass118_7257 = icomponentdefinitions_0;
			client.aClass118_7247 = Class468_Sub22.method12880(icomponentdefinitions_0, (byte) 34);
			client.anInt7361 = i_1;
			client.anInt7362 = i_2;
			Class96_Sub1.anInt8308 = 0;
			client.aBool7364 = false;
		}

	}

	static void method12222(int i_0) {
	}

	public static void method12223(int i_0, byte b_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(6, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -46);
	}

}
