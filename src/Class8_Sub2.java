import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class8_Sub2 extends FontRenderer {

	HardwareRenderer aClass505_Sub3_8889;
	int[] anIntArray8886;
	int[] anIntArray8888;
	byte[][] aByteArrayArray8887;
	int[] anIntArray8890;
	int[] anIntArray8891;

	void c(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.aClass505_Sub3_8889.anIntArray8979 != null) {
			i_2 += this.anIntArray8891[var_1];
			i_3 += this.anIntArray8890[var_1];
			int i_6 = this.anIntArray8886[var_1];
			int i_7 = this.anIntArray8888[var_1];
			int i_8 = 444800403 * this.aClass505_Sub3_8889.anInt8980 * 299731099;
			int i_9 = i_2 + i_3 * i_8;
			int i_10 = i_8 - i_6;
			int i_11 = 0;
			int i_12 = 0;
			int i_13;
			if (i_3 < 1516535457 * this.aClass505_Sub3_8889.anInt9009 * 1457972577) {
				i_13 = 1516535457 * this.aClass505_Sub3_8889.anInt9009 * 1457972577 - i_3;
				i_7 -= i_13;
				i_3 = this.aClass505_Sub3_8889.anInt9009 * 1457972577 * 1516535457;
				i_12 += i_6 * i_13;
				i_9 += i_8 * i_13;
			}

			if (i_7 + i_3 > 1383960921 * this.aClass505_Sub3_8889.anInt8986 * 760194793) {
				i_7 -= i_7 + i_3 - this.aClass505_Sub3_8889.anInt8986 * 760194793 * 1383960921;
			}

			if (i_2 < 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331) {
				i_13 = 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331 - i_2;
				i_6 -= i_13;
				i_2 = this.aClass505_Sub3_8889.anInt8983 * -363774331 * 72550989;
				i_12 += i_13;
				i_9 += i_13;
				i_11 += i_13;
				i_10 += i_13;
			}

			if (i_6 + i_2 > -1710988237 * this.aClass505_Sub3_8889.anInt9002 * 1714763515) {
				i_13 = i_6 + i_2 - -1710988237 * this.aClass505_Sub3_8889.anInt9002 * 1714763515;
				i_6 -= i_13;
				i_11 += i_13;
				i_10 += i_13;
			}

			if (i_6 > 0 && i_7 > 0) {
				this.method14257(this.aByteArrayArray8887[var_1], this.aClass505_Sub3_8889.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
			}
		}

	}

	void UA(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.aClass505_Sub3_8889.anIntArray8979 != null) {
			i_2 += this.anIntArray8891[var_1];
			i_3 += this.anIntArray8890[var_1];
			int i_6 = this.anIntArray8886[var_1];
			int i_7 = this.anIntArray8888[var_1];
			int i_8 = this.aClass505_Sub3_8889.anInt8980;
			int i_9 = i_2 + i_3 * i_8;
			int i_10 = i_8 - i_6;
			int i_11 = 0;
			int i_12 = 0;
			int i_13;
			if (i_3 < this.aClass505_Sub3_8889.anInt9009) {
				i_13 = this.aClass505_Sub3_8889.anInt9009 - i_3;
				i_7 -= i_13;
				i_3 = this.aClass505_Sub3_8889.anInt9009;
				i_12 += i_6 * i_13;
				i_9 += i_8 * i_13;
			}

			if (i_3 + i_7 > this.aClass505_Sub3_8889.anInt8986) {
				i_7 -= i_3 + i_7 - this.aClass505_Sub3_8889.anInt8986;
			}

			if (i_2 < this.aClass505_Sub3_8889.anInt8983) {
				i_13 = this.aClass505_Sub3_8889.anInt8983 - i_2;
				i_6 -= i_13;
				i_2 = this.aClass505_Sub3_8889.anInt8983;
				i_12 += i_13;
				i_9 += i_13;
				i_11 += i_13;
				i_10 += i_13;
			}

			if (i_6 + i_2 > this.aClass505_Sub3_8889.anInt9002) {
				i_13 = i_6 + i_2 - this.aClass505_Sub3_8889.anInt9002;
				i_6 -= i_13;
				i_11 += i_13;
				i_10 += i_13;
			}

			if (i_6 > 0 && i_7 > 0) {
				this.method14257(this.aByteArrayArray8887[var_1], this.aClass505_Sub3_8889.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
			}
		}

	}

	void method14257(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		for (int i_10 = -i_7; i_10 < 0; i_10++) {
			for (int i_11 = -i_6; i_11 < 0; i_11++) {
				int i_12 = bytes_1[i_4++] & 0xff;
				if (i_12 != 0) {
					int i_13 = (i_12 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_12 & ~0xff00ff) >> 8;
					i_12 = 256 - i_12;
					int i_14 = ints_2[i_5];
					ints_2[i_5++] = i_13 + ((i_12 * (i_14 & 0xff00) & 0xff0000) + ((i_14 & 0xff00ff) * i_12 & ~0xff00ff) >> 8);
				} else {
					++i_5;
				}
			}

			i_5 += i_8;
			i_4 += i_9;
		}

	}

	void t(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
		if (this.aClass505_Sub3_8889.anIntArray8979 != null) {
			i_2 += this.anIntArray8891[var_1];
			i_3 += this.anIntArray8890[var_1];
			int i_6 = this.anIntArray8886[var_1];
			int i_7 = this.anIntArray8888[var_1];
			int i_8 = 444800403 * this.aClass505_Sub3_8889.anInt8980 * 299731099;
			int i_9 = i_2 + i_3 * i_8;
			int i_10 = i_8 - i_6;
			int i_11 = 0;
			int i_12 = 0;
			int i_13;
			if (i_3 < 1516535457 * this.aClass505_Sub3_8889.anInt9009 * 1457972577) {
				i_13 = 1516535457 * this.aClass505_Sub3_8889.anInt9009 * 1457972577 - i_3;
				i_7 -= i_13;
				i_3 = this.aClass505_Sub3_8889.anInt9009 * 1457972577 * 1516535457;
				i_12 += i_6 * i_13;
				i_9 += i_8 * i_13;
			}

			if (i_7 + i_3 > 1383960921 * this.aClass505_Sub3_8889.anInt8986 * 760194793) {
				i_7 -= i_7 + i_3 - this.aClass505_Sub3_8889.anInt8986 * 760194793 * 1383960921;
			}

			if (i_2 < 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331) {
				i_13 = 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331 - i_2;
				i_6 -= i_13;
				i_2 = this.aClass505_Sub3_8889.anInt8983 * -363774331 * 72550989;
				i_12 += i_13;
				i_9 += i_13;
				i_11 += i_13;
				i_10 += i_13;
			}

			if (i_6 + i_2 > -1710988237 * this.aClass505_Sub3_8889.anInt9002 * 1714763515) {
				i_13 = i_6 + i_2 - -1710988237 * this.aClass505_Sub3_8889.anInt9002 * 1714763515;
				i_6 -= i_13;
				i_11 += i_13;
				i_10 += i_13;
			}

			if (i_6 > 0 && i_7 > 0) {
				this.method14257(this.aByteArrayArray8887[var_1], this.aClass505_Sub3_8889.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
			}
		}

	}

	void method14258(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Class455 class455_13, int i_14, int i_15) {
		PacketsDecoder packetsdecoder_16 = (PacketsDecoder) class455_13;
		int[] ints_17 = packetsdecoder_16.anIntArray9077;
		int[] ints_18 = packetsdecoder_16.anIntArray9078;
		int i_19 = i_10 - this.aClass505_Sub3_8889.anInt8983;
		int i_20 = i_11;
		if (i_15 > i_11) {
			i_20 = i_15;
			i_5 += this.aClass505_Sub3_8889.anInt8980 * (i_15 - i_11);
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
				int i_28 = bytes_1[i_4++] & 0xff;
				if (i_28 != 0) {
					int i_29 = (i_28 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_28 & ~0xff00ff) >> 8;
					i_28 = 256 - i_28;
					int i_30 = ints_2[i_5];
					ints_2[i_5++] = (((i_30 & 0xff00ff) * i_28 & ~0xff00ff) + (i_28 * (i_30 & 0xff00) & 0xff0000) >> 8) + i_29;
				} else {
					++i_5;
				}
			}

			i_4 = i_26 + i_4 + i_9;
			i_5 = i_5 + i_26 + i_8;
		}

	}

	void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
		if (this.aClass505_Sub3_8889.anIntArray8979 != null) {
			if (class455_6 == null) {
				this.UA(var_1, i_2, i_3, i_4, bool_5);
			} else {
				i_2 += this.anIntArray8891[var_1];
				i_3 += this.anIntArray8890[var_1];
				int i_9 = this.anIntArray8886[var_1];
				int i_10 = this.anIntArray8888[var_1];
				int i_11 = 444800403 * this.aClass505_Sub3_8889.anInt8980 * 299731099;
				int i_12 = i_2 + i_3 * i_11;
				int i_13 = i_11 - i_9;
				int i_14 = 0;
				int i_15 = 0;
				int i_16;
				if (i_3 < 1516535457 * this.aClass505_Sub3_8889.anInt9009 * 1457972577) {
					i_16 = 1516535457 * this.aClass505_Sub3_8889.anInt9009 * 1457972577 - i_3;
					i_10 -= i_16;
					i_3 = this.aClass505_Sub3_8889.anInt9009 * 1457972577 * 1516535457;
					i_15 += i_16 * i_9;
					i_12 += i_16 * i_11;
				}

				if (i_10 + i_3 > this.aClass505_Sub3_8889.anInt8986 * 760194793 * 1383960921) {
					i_10 -= i_10 + i_3 - 1383960921 * this.aClass505_Sub3_8889.anInt8986 * 760194793;
				}

				if (i_2 < 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331) {
					i_16 = 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331 - i_2;
					i_9 -= i_16;
					i_2 = 72550989 * this.aClass505_Sub3_8889.anInt8983 * -363774331;
					i_15 += i_16;
					i_12 += i_16;
					i_14 += i_16;
					i_13 += i_16;
				}

				if (i_9 + i_2 > this.aClass505_Sub3_8889.anInt9002 * 1714763515 * -1710988237) {
					i_16 = i_2 + i_9 - -1710988237 * this.aClass505_Sub3_8889.anInt9002 * 1714763515;
					i_9 -= i_16;
					i_14 += i_16;
					i_13 += i_16;
				}

				if (i_9 > 0 && i_10 > 0) {
					this.method14258(this.aByteArrayArray8887[var_1], this.aClass505_Sub3_8889.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_2, i_3, this.anIntArray8886[var_1], class455_6, i_7, i_8);
				}
			}
		}

	}

	Class8_Sub2(HardwareRenderer hardwarerenderer_1, FontMetrics fontmetrics_2, Class91[] arr_3, int[] ints_4, int[] ints_5) {
		super(hardwarerenderer_1, fontmetrics_2);
		this.aClass505_Sub3_8889 = hardwarerenderer_1;
		this.aClass505_Sub3_8889 = hardwarerenderer_1;
		this.anIntArray8886 = ints_4;
		this.anIntArray8888 = ints_5;
		this.aByteArrayArray8887 = new byte[arr_3.length][];
		this.anIntArray8890 = new int[arr_3.length];
		this.anIntArray8891 = new int[arr_3.length];

		for (int i_6 = 0; i_6 < arr_3.length; i_6++) {
			Class91 class91_7 = arr_3[i_6];
			if (class91_7.aByteArray961 != null) {
				this.aByteArrayArray8887[i_6] = class91_7.aByteArray961;
			} else {
				byte[] bytes_8 = class91_7.aByteArray960;
				byte[] bytes_9 = this.aByteArrayArray8887[i_6] = new byte[bytes_8.length];

				for (int i_10 = 0; i_10 < bytes_8.length; i_10++) {
					bytes_9[i_10] = (byte) (bytes_8[i_10] == 0 ? 0 : -1);
				}
			}

			this.anIntArray8890[i_6] = class91_7.anInt959;
			this.anIntArray8891[i_6] = class91_7.anInt956;
		}

	}

	void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
		if (this.aClass505_Sub3_8889.anIntArray8979 != null) {
			if (class455_6 == null) {
				this.UA(var_1, i_2, i_3, i_4, bool_5);
			} else {
				i_2 += this.anIntArray8891[var_1];
				i_3 += this.anIntArray8890[var_1];
				int i_9 = this.anIntArray8886[var_1];
				int i_10 = this.anIntArray8888[var_1];
				int i_11 = this.aClass505_Sub3_8889.anInt8980;
				int i_12 = i_2 + i_3 * i_11;
				int i_13 = i_11 - i_9;
				int i_14 = 0;
				int i_15 = 0;
				int i_16;
				if (i_3 < this.aClass505_Sub3_8889.anInt9009) {
					i_16 = this.aClass505_Sub3_8889.anInt9009 - i_3;
					i_10 -= i_16;
					i_3 = this.aClass505_Sub3_8889.anInt9009;
					i_15 += i_16 * i_9;
					i_12 += i_16 * i_11;
				}

				if (i_3 + i_10 > this.aClass505_Sub3_8889.anInt8986) {
					i_10 -= i_3 + i_10 - this.aClass505_Sub3_8889.anInt8986;
				}

				if (i_2 < this.aClass505_Sub3_8889.anInt8983) {
					i_16 = this.aClass505_Sub3_8889.anInt8983 - i_2;
					i_9 -= i_16;
					i_2 = this.aClass505_Sub3_8889.anInt8983;
					i_15 += i_16;
					i_12 += i_16;
					i_14 += i_16;
					i_13 += i_16;
				}

				if (i_9 + i_2 > this.aClass505_Sub3_8889.anInt9002) {
					i_16 = i_9 + i_2 - this.aClass505_Sub3_8889.anInt9002;
					i_9 -= i_16;
					i_14 += i_16;
					i_13 += i_16;
				}

				if (i_9 > 0 && i_10 > 0) {
					this.method14258(this.aByteArrayArray8887[var_1], this.aClass505_Sub3_8889.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_2, i_3, this.anIntArray8886[var_1], class455_6, i_7, i_8);
				}
			}
		}

	}

	static void method14262(int i_0) {
		ItemContainer.CONTAINER_MAP.method7749(-1390768924);
	}

	public static void method14263(int i_0, int i_1) {
		Class291_Sub1.anInt8014 = i_0 - Class291_Sub1.anInt3472;
		Class291_Sub1.anInt8016 = i_1 - Class291_Sub1.anInt3473;
	}

	public static void method14264(RsBitsBuffer rsbitsbuffer_0) {
		Class282_Sub42 class282_sub42_2 = (Class282_Sub42) Class435.aClass482_5332.head((byte) 121);
		if (class282_sub42_2 != null) {
			int i_3 = rsbitsbuffer_0.index;
			rsbitsbuffer_0.writeInt(class282_sub42_2.anInt8038);

			for (int i_4 = 0; i_4 < class282_sub42_2.anInt8033; i_4++) {
				if (class282_sub42_2.anIntArray8036[i_4] != 0) {
					rsbitsbuffer_0.writeByte(class282_sub42_2.anIntArray8036[i_4]);
				} else {
					try {
						int i_5 = class282_sub42_2.anIntArray8035[i_4];
						Field field_6;
						int i_7;
						if (i_5 == 0) {
							field_6 = class282_sub42_2.aFieldArray8037[i_4];
							i_7 = field_6.getInt((Object) null);
							rsbitsbuffer_0.writeByte(0);
							rsbitsbuffer_0.writeInt(i_7);
						} else if (i_5 == 1) {
							field_6 = class282_sub42_2.aFieldArray8037[i_4];
							field_6.setInt((Object) null, class282_sub42_2.anIntArray8040[i_4]);
							rsbitsbuffer_0.writeByte(0);
						} else if (i_5 == 2) {
							field_6 = class282_sub42_2.aFieldArray8037[i_4];
							i_7 = field_6.getModifiers();
							rsbitsbuffer_0.writeByte(0);
							rsbitsbuffer_0.writeInt(i_7);
						}

						Method method_26;
						if (i_5 != 3) {
							if (i_5 == 4) {
								method_26 = class282_sub42_2.aMethodArray8034[i_4];
								i_7 = method_26.getModifiers();
								rsbitsbuffer_0.writeByte(0);
								rsbitsbuffer_0.writeInt(i_7);
							}
						} else {
							method_26 = class282_sub42_2.aMethodArray8034[i_4];
							byte[][] bytes_11 = class282_sub42_2.aByteArrayArrayArray8041[i_4];
							Object[] arr_8 = new Object[bytes_11.length];

							for (int i_9 = 0; i_9 < bytes_11.length; i_9++) {
								ObjectInputStream objectinputstream_10 = new ObjectInputStream(new ByteArrayInputStream(bytes_11[i_9]));
								arr_8[i_9] = objectinputstream_10.readObject();
							}

							Object object_12 = method_26.invoke((Object) null, arr_8);
							if (object_12 == null) {
								rsbitsbuffer_0.writeByte(0);
							} else if (object_12 instanceof Number) {
								rsbitsbuffer_0.writeByte(1);
								rsbitsbuffer_0.writeLong(((Number) object_12).longValue());
							} else if (object_12 instanceof String) {
								rsbitsbuffer_0.writeByte(2);
								rsbitsbuffer_0.writeString((String) object_12);
							} else {
								rsbitsbuffer_0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException classnotfoundexception_14) {
						rsbitsbuffer_0.writeByte(-10);
					} catch (InvalidClassException invalidclassexception_15) {
						rsbitsbuffer_0.writeByte(-11);
					} catch (StreamCorruptedException streamcorruptedexception_16) {
						rsbitsbuffer_0.writeByte(-12);
					} catch (OptionalDataException optionaldataexception_17) {
						rsbitsbuffer_0.writeByte(-13);
					} catch (IllegalAccessException illegalaccessexception_18) {
						rsbitsbuffer_0.writeByte(-14);
					} catch (IllegalArgumentException illegalargumentexception_19) {
						rsbitsbuffer_0.writeByte(-15);
					} catch (InvocationTargetException invocationtargetexception_20) {
						rsbitsbuffer_0.writeByte(-16);
					} catch (SecurityException securityexception_21) {
						rsbitsbuffer_0.writeByte(-17);
					} catch (IOException ioexception_22) {
						rsbitsbuffer_0.writeByte(-18);
					} catch (NullPointerException nullpointerexception_23) {
						rsbitsbuffer_0.writeByte(-19);
					} catch (Exception exception_24) {
						rsbitsbuffer_0.writeByte(-20);
					} catch (Throwable throwable_25) {
						rsbitsbuffer_0.writeByte(-21);
					}
				}
			}

			rsbitsbuffer_0.method13104(i_3);
			class282_sub42_2.remove();
		}

	}

}
