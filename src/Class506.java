/* Class506 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class506 {
	static Class223 aClass223_5857 = new Class223(128);
	static int anInt5858;

	public static void method8702() {
		aClass223_5857.method3760(41736995);
	}

	static CS2Script method8703(int i) {
		CS2Script class282_sub50_sub5 = (CS2Script) aClass223_5857.method3758((long) i);
		if (class282_sub50_sub5 != null)
			return class282_sub50_sub5;
		byte[] is = Class378.aClass317_4526.getFile(i, 0, -1786940883);
		if (is == null || is.length <= 1)
			return null;
		try {
			class282_sub50_sub5 = GraphicalRenderer.method8699(is, -1488494907);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass223_5857.method3759(class282_sub50_sub5, (long) i);
		return class282_sub50_sub5;
	}

	public static void method8704() {
		aClass223_5857.method3760(-264740781);
	}

	public static void method8705() {
		aClass223_5857.method3760(-979078977);
	}

	static CS2Script method8706(int i) {
		CS2Script class282_sub50_sub5 = (CS2Script) aClass223_5857.method3758((long) i);
		if (class282_sub50_sub5 != null)
			return class282_sub50_sub5;
		byte[] is = Class378.aClass317_4526.getFile(i, 0, -1560691688);
		if (is == null || is.length <= 1)
			return null;
		try {
			class282_sub50_sub5 = GraphicalRenderer.method8699(is, -2147252114);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass223_5857.method3759(class282_sub50_sub5, (long) i);
		return class282_sub50_sub5;
	}

	static CS2Script method8707(int i) {
		CS2Script class282_sub50_sub5 = (CS2Script) aClass223_5857.method3758((long) i);
		if (class282_sub50_sub5 != null)
			return class282_sub50_sub5;
		byte[] is = Class378.aClass317_4526.getFile(i, 0, -1325482050);
		if (is == null || is.length <= 1)
			return null;
		try {
			class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1054962374);
		} catch (Exception exception) {
			throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
		}
		aClass223_5857.method3759(class282_sub50_sub5, (long) i);
		return class282_sub50_sub5;
	}

	Class506() throws Throwable {
		throw new Error();
	}

	static CS2Script method8708(Class397 class397, int i, int i_0_) {
		int i_1_ = 1700138339 * class397.anInt4802 | i << 10;
		CS2Script class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_1_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		byte[] is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_1_, (byte) 4), -1599704714));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 2103535988);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_1_ << 16);
			return class282_sub50_sub5;
		}
		i_1_ = 1700138339 * class397.anInt4802 | 65536 + i_0_ << 10;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_1_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_1_, (byte) 4), -1152787959));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, -150029478);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_1_ << 16);
			return class282_sub50_sub5;
		}
		i_1_ = 1700138339 * class397.anInt4802 | 0x3fffc00;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_1_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_1_, (byte) 4), -984252166));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 226413161);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_1_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_1_ << 16);
			return class282_sub50_sub5;
		}
		return null;
	}

	static CS2Script method8709(Class397 class397, int i, int i_2_) {
		int i_3_ = 1700138339 * class397.anInt4802 | i << 10;
		CS2Script class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_3_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		byte[] is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_3_, (byte) 4), -1384363687));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1677019033);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_3_ << 16);
			return class282_sub50_sub5;
		}
		i_3_ = 1700138339 * class397.anInt4802 | 65536 + i_2_ << 10;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_3_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_3_, (byte) 4), -1517399106));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1167995945);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_3_ << 16);
			return class282_sub50_sub5;
		}
		i_3_ = 1700138339 * class397.anInt4802 | 0x3fffc00;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_3_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_3_, (byte) 4), -9478845));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 772753336);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_3_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_3_ << 16);
			return class282_sub50_sub5;
		}
		return null;
	}

	static CS2Script method8710(Class397 class397, int i, int i_4_) {
		int i_5_ = 1700138339 * class397.anInt4802 | i << 10;
		CS2Script class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_5_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		byte[] is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_5_, (byte) 4), -449923077));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1468515664);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_5_ << 16);
			return class282_sub50_sub5;
		}
		i_5_ = 1700138339 * class397.anInt4802 | 65536 + i_4_ << 10;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_5_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_5_, (byte) 4), -310302992));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1075927691);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_5_ << 16);
			return class282_sub50_sub5;
		}
		i_5_ = 1700138339 * class397.anInt4802 | 0x3fffc00;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_5_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_5_, (byte) 4), -1410493998));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, -1178408736);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_5_ << 16);
			return class282_sub50_sub5;
		}
		return null;
	}

	static CS2Script method8711(Class397 class397, int i, int i_6_) {
		int i_7_ = 1700138339 * class397.anInt4802 | i << 10;
		CS2Script class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_7_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		byte[] is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_7_, (byte) 4), -1830893994));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, -633182637);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_7_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_7_ << 16);
			return class282_sub50_sub5;
		}
		i_7_ = 1700138339 * class397.anInt4802 | 65536 + i_6_ << 10;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_7_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_7_, (byte) 4), -1902261602));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, -2059364468);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_7_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_7_ << 16);
			return class282_sub50_sub5;
		}
		i_7_ = 1700138339 * class397.anInt4802 | 0x3fffc00;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_7_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_7_, (byte) 4), -807707546));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1631421068);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_7_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_7_ << 16);
			return class282_sub50_sub5;
		}
		return null;
	}

	static CS2Script method8712(Class397 class397, int i, int i_8_) {
		int i_9_ = 1700138339 * class397.anInt4802 | i << 10;
		CS2Script class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_9_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		byte[] is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_9_, (byte) 4), -1961061452));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1168530960);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_9_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_9_ << 16);
			return class282_sub50_sub5;
		}
		i_9_ = 1700138339 * class397.anInt4802 | 65536 + i_8_ << 10;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_9_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_9_, (byte) 4), -1713111490));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 1503047364);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_9_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_9_ << 16);
			return class282_sub50_sub5;
		}
		i_9_ = 1700138339 * class397.anInt4802 | 0x3fffc00;
		class282_sub50_sub5 = ((CS2Script) aClass223_5857.method3758((long) i_9_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (Class378.aClass317_4526.method5615(Class378.aClass317_4526.method5623(i_9_, (byte) 4), -1662449312));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, -345933703);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_9_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			aClass223_5857.method3759(class282_sub50_sub5, (long) i_9_ << 16);
			return class282_sub50_sub5;
		}
		return null;
	}

	static CS2Script method8713(byte[] is) {
		return new CS2Script(new RsByteBuffer(is));
	}

	static final void method8714(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class175.method2960(class118, class98, class527, 1306300088);
	}

	static final void method8715(CS2Executor class527, int i) {
		int i_10_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_10_, (byte) 60);
		Class199.method3251(class118, class527, 1146866687);
	}

	static final void method8716(CS2Executor class527, byte i) {
		int i_11_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_12_ = client.aClass330Array7428[i_11_].method5908(-12393301);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 2 == i_12_ ? 1 : 0;
	}

	static final void method8717(CS2Executor class527, int i) {
		String string;
		if (null != Class84.myPlayer && null != Class84.myPlayer.username)
			string = Class84.myPlayer.method16127(true, 2008342545);
		else
			string = "";
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method8718(CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		((CS2Executor) class527).aClass191_7008 = new Class191(string, true);
	}

	static final void method8719(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		long l = (long) (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		long l_13_ = (long) (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		long l_14_ = (long) (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 2]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) (l_14_ * l / l_13_);
	}

	static final void method8720(CS2Executor class527, int i) {
		int i_15_ = (((CS2Executor) class527).unknown[301123709 * ((CS2Executor) class527).instrPtr]);
		int i_16_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (i_16_ < 0 || i_16_ >= ((CS2Executor) class527).globalArrayLengths[i_15_])
			throw new RuntimeException();
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((CS2Executor) class527).globalArrays[i_15_][i_16_];
	}

	public static MeshModifier decodeItemEffects(ItemDefinitions class425, RsByteBuffer stream, int i) {
		MeshModifier class422 = new MeshModifier(class425);
		int flags = stream.readUnsignedByte();
		boolean modifyModel = (flags & 0x1) != 0;
		boolean bool_18_ = 0 != (flags & 0x2);
		boolean modifyModelColors = 0 != (flags & 0x4);
		boolean bool_20_ = (flags & 0x8) != 0;
		if (modifyModel) {
			class422.maleBody[0] = stream.readBigSmart(1983228552);
			class422.femaleBody[0] = stream.readBigSmart(1966660718);
			if (-1 != ((ItemDefinitions) class425).anInt5100 * -931922913 || -1259031521 * ((ItemDefinitions) class425).anInt5069 != -1) {
				class422.maleBody[1] = stream.readBigSmart(1966117219);
				class422.femaleBody[1] = stream.readBigSmart(1968077484);
			}
			if (-1 != -562041407 * ((ItemDefinitions) class425).anInt5070 || -1 != -1802576377 * ((ItemDefinitions) class425).anInt5071) {
				class422.maleBody[2] = stream.readBigSmart(2019468783);
				class422.femaleBody[2] = stream.readBigSmart(1953029845);
			}
		}
		if (bool_18_) {
			class422.maleHeads[0] = stream.readBigSmart(2017468211);
			class422.femaleHeads[0] = stream.readBigSmart(2066820244);
			if (-1 != -613723223 * ((ItemDefinitions) class425).anInt5079 || -1 != -1871546585 * ((ItemDefinitions) class425).anInt5081) {
				class422.maleHeads[1] = stream.readBigSmart(2051081301);
				class422.femaleHeads[1] = stream.readBigSmart(1969156030);
			}
		}
		if (modifyModelColors) {
			int flag = stream.readUnsignedShort();
			int[] slots = new int[4];
			slots[0] = flag & 0xf;
			slots[1] = flag >> 4 & 0xf;
			slots[2] = flag >> 8 & 0xf;
			slots[3] = flag >> 12 & 0xf;
			for (int slotId = 0; slotId < 4; slotId++) {
				if (slots[slotId] != 15) {
					class422.modifiedColors[slots[slotId]] = (short) stream.readUnsignedShort();
				}
			}
		}
		if (bool_20_) {
			int i_23_ = stream.readUnsignedByte();
			int[] is = new int[2];
			is[0] = i_23_ & 0xf;
			is[1] = i_23_ >> 4 & 0xf;
			for (int i_24_ = 0; i_24_ < 2; i_24_++) {
				if (15 != is[i_24_])
					class422.modifiedTextures[is[i_24_]] = (short) stream.readUnsignedShort();
			}
		}
		return class422;
	}

	static void method8722(int i, int i_25_, int i_26_, int i_27_, int i_28_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(18, (long) i_25_ << 32 | (long) i);
		class282_sub50_sub12.method14995(540803591);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = -1773141545 * i_26_;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9641 = 717659479 * i_27_;
	}
}
