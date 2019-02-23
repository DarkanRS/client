import java.util.Iterator;

public abstract class Class534 {

	static short aShort7079;
	long aLong7074 = -1L;
	long aLong7076 = -1L;
	int anInt7075 = -1;
	int anInt7078 = -1;
	NodeCollection aClass482_7077 = new NodeCollection();

	int method11408(Class282_Sub53 class282_sub53_1, int i_2, int i_3) {
		long long_4;
		if (this.aLong7074 == -1L) {
			long_4 = (long) i_2;
		} else {
			long_4 = class282_sub53_1.method13471(-568247340) - this.aLong7074;
			if (long_4 > (long) i_2) {
				long_4 = (long) i_2;
			}
		}

		this.aLong7074 = class282_sub53_1.method13471(1455935453);
		return (int) long_4;
	}

	void method11409(int i_1) {
		this.aClass482_7077.method8118(839183612);
		this.aLong7074 = -1L;
		this.aLong7076 = -1L;
		this.anInt7075 = -1;
		this.anInt7078 = -1;
	}

	void method11410(Class282_Sub53 class282_sub53_1, byte b_2) {
		this.aClass482_7077.append(class282_sub53_1, -1396840421);
	}

	abstract int method11412(int var1);

	abstract void method11413(RsByteBuffer var1, Class282_Sub53 var2, int var3);

	abstract void method11414(int var1);

	abstract int method11415();

	abstract TCPMessage method11416(byte var1);

	void method11417(int i_1) {
		if (this.method11423(-1420677067)) {
			TCPMessage tcpmessage_2 = null;
			int i_3 = 0;
			int i_4 = 0;
			int i_5 = 0;
			Iterator iterator_6 = this.aClass482_7077.iterator();

			label105: while (true) {
				while (true) {
					if (!iterator_6.hasNext()) {
						break label105;
					}

					Class282_Sub53 class282_sub53_13 = (Class282_Sub53) iterator_6.next();
					if (tcpmessage_2 != null && tcpmessage_2.buffer.index - i_3 >= 252 - (6 + this.method11412(919512464))) {
						break label105;
					}

					class282_sub53_13.remove();
					int i_8 = class282_sub53_13.method13469(1360106336);
					if (i_8 < -1) {
						i_8 = -1;
					} else if (i_8 > 65534) {
						i_8 = 65534;
					}

					int i_9 = class282_sub53_13.method13481(2047173833);
					if (i_9 < -1) {
						i_9 = -1;
					} else if (i_9 > 65534) {
						i_9 = 65534;
					}

					if (i_9 == this.anInt7075 && i_8 == this.anInt7078) {
						class282_sub53_13.method13475(-894194576);
					} else {
						if (tcpmessage_2 == null) {
							tcpmessage_2 = this.method11416((byte) -81);
							tcpmessage_2.buffer.writeByte(0);
							i_3 = tcpmessage_2.buffer.index;
							tcpmessage_2.buffer.index += 2;
							i_4 = 0;
							i_5 = 0;
						}

						int i_10;
						int i_11;
						int i_12;
						if (this.aLong7076 != -1L) {
							i_10 = i_9 - this.anInt7075;
							i_11 = i_8 - this.anInt7078;
							i_12 = (int) ((class282_sub53_13.method13471(1951145050) - this.aLong7076) / 20L);
							i_4 = (int) ((long) i_4 + (class282_sub53_13.method13471(898396823) - this.aLong7076) % 20L);
						} else {
							i_10 = i_9;
							i_11 = i_8;
							i_12 = Integer.MAX_VALUE;
						}

						this.anInt7075 = i_9;
						this.anInt7078 = i_8;
						if (i_12 < 8 && i_10 >= -32 && i_10 <= 31 && i_11 >= -32 && i_11 <= 31) {
							i_10 += 32;
							i_11 += 32;
							tcpmessage_2.buffer.writeShort((i_12 << 12) + i_11 + (i_10 << 6), 1417031095);
						} else if (i_12 < 32 && i_10 >= -128 && i_10 <= 127 && i_11 >= -128 && i_11 <= 127) {
							i_10 += 128;
							i_11 += 128;
							tcpmessage_2.buffer.writeByte(i_12 + 128);
							tcpmessage_2.buffer.writeShort(i_11 + (i_10 << 8), 1417031095);
						} else if (i_12 < 32) {
							tcpmessage_2.buffer.writeByte(i_12 + 192);
							if (i_9 != -1 && i_8 != -1) {
								tcpmessage_2.buffer.writeInt(i_9 | i_8 << 16);
							} else {
								tcpmessage_2.buffer.writeInt(Integer.MIN_VALUE);
							}
						} else {
							tcpmessage_2.buffer.writeShort((i_12 & 0x1fff) + 57344, 1417031095);
							if (i_9 != -1 && i_8 != -1) {
								tcpmessage_2.buffer.writeInt(i_9 | i_8 << 16);
							} else {
								tcpmessage_2.buffer.writeInt(Integer.MIN_VALUE);
							}
						}

						++i_5;
						this.method11413(tcpmessage_2.buffer, class282_sub53_13, 1351568696);
						this.aLong7076 = class282_sub53_13.method13471(1014804991);
						class282_sub53_13.method13475(684754110);
					}
				}
			}

			if (tcpmessage_2 != null) {
				tcpmessage_2.buffer.method13061(tcpmessage_2.buffer.index - i_3, -898756253);
				int i_7 = tcpmessage_2.buffer.index;
				tcpmessage_2.buffer.index = i_3;
				tcpmessage_2.buffer.writeByte(i_4 / i_5);
				tcpmessage_2.buffer.writeByte(i_4 % i_5);
				tcpmessage_2.buffer.index = i_7;
				client.aClass184_7475.method3049(tcpmessage_2, 1392403393);
			}
		}

		this.method11414(-1167987838);
	}

	abstract void method11418();

	abstract TCPMessage method11420();

	abstract TCPMessage method11421();

	abstract TCPMessage method11422();

	abstract boolean method11423(int var1);

	abstract int method11424();

	abstract int method11425();

	abstract void method11426(RsByteBuffer var1, Class282_Sub53 var2);

	abstract void method11427(RsByteBuffer var1, Class282_Sub53 var2);

	abstract TCPMessage method11428();

	abstract void method11431();

	abstract boolean method11434();

	static final void method11438(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 76);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class185.method3078(icomponentdefinitions_3, interface_4, cs2executor_0, -1906837964);
	}

	static final void method11439(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = i_2 >> 14 & 0x3fff;
		int i_4 = i_2 & 0x3fff;
		CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(2060657850);
		i_3 -= coordgrid_5.x;
		if (i_3 < 0) {
			i_3 = 0;
		} else if (i_3 >= IndexLoaders.MAP_REGION_DECODER.getSizeX(1745707366)) {
			i_3 = IndexLoaders.MAP_REGION_DECODER.getSizeX(564190904);
		}

		i_4 -= coordgrid_5.y;
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-500504359)) {
			i_4 = IndexLoaders.MAP_REGION_DECODER.getSizeY(-160695726);
		}

		client.anInt7262 = (i_3 << 9) + 256;
		client.anInt7376 = (i_4 << 9) + 256;
		NativeLibraryLoader.anInt3240 = 4;
		Class86.anInt833 = -1;
		Class508.anInt5864 = -1;
	}

	static final void method11440(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class96_Sub10.method14603(1, i_2 << 16 | i_3, i_4, "", (byte) 25);
	}

	static void method11441(byte b_0) {
		if (Class179.anInt2226 > 0) {
			int i_1 = 0;

			for (int i_2 = 0; i_2 < Class13.aStringArray129.length; i_2++) {
				if (Class13.aStringArray129[i_2].indexOf("--> ") != -1) {
					++i_1;
					if (i_1 == Class179.anInt2226) {
						Class179.aString2225 = Class13.aStringArray129[i_2].substring(Class13.aStringArray129[i_2].indexOf(62) + 2);
						break;
					}
				}
			}
		} else {
			Class179.aString2225 = "";
		}

	}

}
