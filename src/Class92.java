/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92 {
	int anInt962;
	Class458 aClass458_963;
	int anInt964;
	int anInt965;
	int anInt966;
	int anInt967;

	boolean method1557(int i) {
		if (((Class92) this).anInt964 * -1727931981 >= 0) {
			ObjectDefinitions class478 = IndexLoaders.OBJECT_INDEX_LOADER.getObjectDefinitions(((((Class92) this).anInt964) * -1727931981), 65280);
			boolean bool = class478.method7987((((Class92) this).aClass458_963.anInt5481 * 1109376893), 792891536);
			int[] is = class478.method8008(-2118355158);
			if (is != null) {
				int[] is_0_ = is;
				for (int i_1_ = 0; i_1_ < is_0_.length; i_1_++) {
					int i_2_ = is_0_[i_1_];
					bool &= IndexLoaders.aClass523_3868.method11205(i_2_, (byte) 92).method11132(2061456452);
				}
			}
			return bool;
		}
		return true;
	}

	Class92(RsByteBuffer class282_sub35) {
		((Class92) this).anInt964 = class282_sub35.readBigSmart() * 267419003;
		((Class92) this).aClass458_963 = ((Class458) Class386.method6672(Class2.method262((byte) -1), class282_sub35.readUnsignedByte(), -859737548));
	}

	void method1558(byte i) {
		Class299.method5313(-1318859227 * ((Class92) this).anInt965, -76417803 * ((Class92) this).anInt962, -987984923 * ((Class92) this).anInt966, (480268417 * ((Class92) this).aClass458_963.anInt5494), -1, (1109376893 * ((Class92) this).aClass458_963.anInt5481), ((Class92) this).anInt967 * -71092145, 1736684675);
	}

	void method1559(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
		Class299.method5313(i, i_3_, i_4_, (((Class92) this).aClass458_963.anInt5494 * 480268417), ((Class92) this).anInt964 * -1727931981, (1109376893 * ((Class92) this).aClass458_963.anInt5481), i_5_, 1736684675);
		((Class92) this).anInt965 = 1968020909 * i;
		((Class92) this).anInt962 = i_3_ * 1631065949;
		((Class92) this).anInt966 = -1041057299 * i_4_;
		((Class92) this).anInt967 = i_5_ * 1405673135;
	}

	static final int method1560(int i, int i_7_, int i_8_) {
		int i_9_ = (Class159.method2735(45365 + i, i_7_ + 91923, 4, -726719813) - 128 + ((Class159.method2735(i + 10294, 37821 + i_7_, 2, -726719813) - 128) >> 1) + (Class159.method2735(i, i_7_, 1, -726719813) - 128 >> 2));
		i_9_ = 35 + (int) ((double) i_9_ * 0.3);
		if (i_9_ < 10)
			i_9_ = 10;
		else if (i_9_ > 60)
			i_9_ = 60;
		return i_9_;
	}

	static Class243[] method1561(short i) {
		return (new Class243[] { Class243.aClass243_2984, Class243.aClass243_2987, Class243.aClass243_2986, Class243.aClass243_2994, Class243.aClass243_2991, Class243.aClass243_2996, Class243.aClass243_2985, Class243.aClass243_2990, Class243.aClass243_2989, Class243.aClass243_2993, Class243.aClass243_2983, Class243.aClass243_2988, Class243.aClass243_2995, Class243.aClass243_2992 });
	}

	static final void method1562(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.method11633(class118).method12179(-394361694);
	}

	public static void method1563(int i, int i_10_) {
		Class282_Sub37 class282_sub37 = (Class282_Sub37) Class492.aClass465_5774.method7754((long) i);
		if (null != class282_sub37) {
			((Class282_Sub37) class282_sub37).aClass278_Sub1_8001.method4947((byte) 44);
			Class62.method1260((((Class282_Sub37) class282_sub37).anInt7999 * 1729403683), ((Class282_Sub37) class282_sub37).aBool7998, 1656056599);
			class282_sub37.unlink(-371378792);
		}
	}

	static void method1564(int i, int i_11_, int i_12_, int i_13_, int i_14_, byte i_15_) {
		for (int i_16_ = i_12_; i_16_ <= i_13_; i_16_++) {
			if (i_15_ >= 0)
				break;
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_16_], i, i_11_, i_14_, (byte) -105);
		}
	}

	public static void method1565(int i, int i_17_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(4, (long) i);
		class282_sub50_sub12.method14965((byte) -28);
	}
}
