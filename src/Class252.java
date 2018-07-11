/* Class252 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class252 implements Interface43 {
	public int anInt3104;
	static Class252 aClass252_3105;
	static Class252 aClass252_3106 = new Class252(0, 0);
	static Class252 aClass252_3107;
	public static Class252 aClass252_3108;
	static Class252 aClass252_3109;
	static Class252 aClass252_3110;
	static Class252 aClass252_3111;
	int anInt3112;
	static Class252 aClass252_3113;

	public Class252 method4317(short i) {
		switch (anInt3104 * 1583741993) {
		case 4:
			return aClass252_3105;
		case 7:
			return aClass252_3113;
		case 0:
			return aClass252_3108;
		case 6:
			return aClass252_3106;
		case 5:
			return aClass252_3111;
		case 3:
			return aClass252_3110;
		case 1:
			return aClass252_3107;
		case 2:
			return aClass252_3109;
		default:
			throw new IllegalStateException();
		}
	}

	public static Class252[] method4318() {
		return new Class252[] { aClass252_3111, aClass252_3110, aClass252_3113, aClass252_3108, aClass252_3105, aClass252_3109, aClass252_3107, aClass252_3106 };
	}

	static {
		aClass252_3105 = new Class252(2, 1);
		aClass252_3111 = new Class252(3, 2);
		aClass252_3107 = new Class252(7, 3);
		aClass252_3108 = new Class252(6, 4);
		aClass252_3109 = new Class252(4, 5);
		aClass252_3110 = new Class252(5, 6);
		aClass252_3113 = new Class252(1, 7);
	}

	public static Class252[] method4319() {
		return new Class252[] { aClass252_3111, aClass252_3110, aClass252_3113, aClass252_3108, aClass252_3105, aClass252_3109, aClass252_3107, aClass252_3106 };
	}

	public static Class252[] method4320() {
		return new Class252[] { aClass252_3111, aClass252_3110, aClass252_3113, aClass252_3108, aClass252_3105, aClass252_3109, aClass252_3107, aClass252_3106 };
	}

	Class252(int i, int i_0_) {
		anInt3104 = i * -1929158631;
		((Class252) this).anInt3112 = i_0_ * 431977215;
	}

	public int method243(byte i) {
		return 764906751 * ((Class252) this).anInt3112;
	}

	public int method75() {
		return 764906751 * ((Class252) this).anInt3112;
	}

	public int method76() {
		return 764906751 * ((Class252) this).anInt3112;
	}

	public Class252 method4321() {
		switch (anInt3104 * 1583741993) {
		case 4:
			return aClass252_3105;
		case 7:
			return aClass252_3113;
		case 0:
			return aClass252_3108;
		case 6:
			return aClass252_3106;
		case 5:
			return aClass252_3111;
		case 3:
			return aClass252_3110;
		case 1:
			return aClass252_3107;
		case 2:
			return aClass252_3109;
		default:
			throw new IllegalStateException();
		}
	}

	public Class252 method4322() {
		switch (anInt3104 * 1583741993) {
		case 4:
			return aClass252_3105;
		case 7:
			return aClass252_3113;
		case 0:
			return aClass252_3108;
		case 6:
			return aClass252_3106;
		case 5:
			return aClass252_3111;
		case 3:
			return aClass252_3110;
		case 1:
			return aClass252_3107;
		case 2:
			return aClass252_3109;
		default:
			throw new IllegalStateException();
		}
	}

	static final void method4323(CS2Executor class527, byte i) {
		int i_1_ = (class527.intOpValues[class527.instrPtr * 301123709]);
		Integer integer = (Integer) Class46.anObjectArray437[i_1_];
		if (integer == null) {
			Class405 class405 = IndexLoaders.aClass394_5831.method6753(i_1_, 908110130);
			if ('i' == class405.aChar4832 || '1' == class405.aChar4832)
				class527.intStack[((class527.intStackPtr += 141891001) * 1942118537) - 1] = 0;
			else
				class527.intStack[((class527.intStackPtr += 141891001) * 1942118537) - 1] = -1;
		} else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = integer.intValue();
	}

	static final void method4324(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -9);
	}

	static int method4325(Class217_Sub1 class217_sub1, Class217_Sub1 class217_sub1_2_, int i, boolean bool, int i_3_, boolean bool_4_, int i_5_) {
		int i_6_ = Class468_Sub1.method12620(class217_sub1, class217_sub1_2_, i, bool, -1139598282);
		if (i_6_ != 0) {
			if (bool)
				return -i_6_;
			return i_6_;
		}
		if (-1 == i_3_)
			return 0;
		int i_7_ = Class468_Sub1.method12620(class217_sub1, class217_sub1_2_, i_3_, bool_4_, 502697852);
		if (bool_4_)
			return -i_7_;
		return i_7_;
	}

	static void method4326(int i, int i_8_, IComponentDefinitions class118, int i_9_) {
		int i_10_ = i + 1506818197 * class118.anInt1301;
		int i_11_ = 15 + i_8_;
		if (client.aBool7176) {
			int i_12_ = -256;
			if (457052913 * client.FPS < 20)
				i_12_ = -65536;
			Class16.aClass8_144.method359(new StringBuilder().append("Fps:").append(457052913 * client.FPS).toString(), i_10_, i_11_, i_12_, -1, 1878721557);
			i_11_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long l = runtime.totalMemory() / 1024L;
			long l_13_ = l - runtime.freeMemory() / 1024L;
			int i_14_ = -256;
			if (l_13_ > 262144L)
				i_14_ = -65536;
			Class16.aClass8_144.method359(new StringBuilder().append("Mem:").append(l_13_).append("/").append(l).append("k").toString(), i_10_, i_11_, i_14_, -1, 1878721557);
			i_11_ += 15;
			long l_15_ = ((Class184) client.aClass184_7475).aClass7_2299.method349((byte) 16);
			String string = "N/A";
			if (-1L != l_15_) {
				string = new StringBuilder().append(l_15_).append("ms").toString();
				if (l_15_ > 500L)
					string = new StringBuilder().append(Class59.method1163(16711680, 619010179)).append(string).append(Class59.method1163(16776960, 619010179)).toString();
			}
			Class16.aClass8_144.method359(new StringBuilder().append("Game: In:").append(((Class184) client.aClass184_7475).anInt2294 * 967488065).append("B/s ").append("Out:").append(((Class184) client.aClass184_7475).anInt2293 * -1629191971).append("B/s ").append("Ping:").append(string).toString(), i_10_, i_11_, -256, -1, 1878721557);
			i_11_ += 15;
			long l_16_ = ((Class184) client.aClass184_7218).aClass7_2299.method349((byte) -81);
			String string_17_ = "N/A";
			if (-1L != l_16_) {
				string_17_ = new StringBuilder().append(l_16_).append("ms").toString();
				if (l_16_ > 500L)
					string_17_ = new StringBuilder().append(Class59.method1163(16711680, 619010179)).append(string_17_).append(Class59.method1163(16776960, 619010179)).toString();
			}
			Class16.aClass8_144.method359(new StringBuilder().append("Lobby: In:").append(967488065 * ((Class184) client.aClass184_7218).anInt2294).append("B/s ").append("Out:").append(-1629191971 * ((Class184) client.aClass184_7218).anInt2293).append("B/s ").append("Ping:").append(string_17_).toString(), i_10_, i_11_, -256, -1, 1878721557);
			i_11_ += 15;
			int i_18_ = Renderers.SOFTWARE_RENDERER.za() / 1024;
			Class16.aClass8_144.method359(new StringBuilder().append("Offheap:").append(i_18_).append("k").toString(), i_10_, i_11_, i_18_ > 65536 ? -65536 : -256, -1, 1878721557);
			i_11_ += 15;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			for (int i_22_ = 0; i_22_ < Class492.aClass327_Sub1Array5777.length; i_22_++) {
				if (Class492.aClass327_Sub1Array5777[i_22_] != null) {
					i_19_ += Class492.aClass327_Sub1Array5777[i_22_].method12541(1747986717);
					i_20_ += Class492.aClass327_Sub1Array5777[i_22_].method12542(947500830);
					i_21_ += Class492.aClass327_Sub1Array5777[i_22_].method12559(1761402877);
				}
			}
			int i_23_ = i_21_ * 100 / i_19_;
			int i_24_ = 10000 * i_20_ / i_19_;
			String string_25_ = new StringBuilder().append("Cache:").append(Class202.method3342((long) i_24_, 2, true, Language.aClass495_5795, (byte) 28)).append("% (").append(i_23_).append("%)").toString();
			Renderers.FONT_RENDERER.method359(string_25_, i_10_, i_11_, -256, -1, 1878721557);
			i_11_ += 12;
		}
	}

	public static int method4327(int i, int i_26_, boolean bool, boolean bool_27_, byte i_28_) {
		Class282_Sub30 class282_sub30 = CS2Runner.method11127(i, bool_27_, 1863818579);
		if (class282_sub30 == null)
			return 0;
		int i_29_ = 0;
		for (int i_30_ = 0; i_30_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_30_++) {
			if (((Class282_Sub30) class282_sub30).anIntArray7710[i_30_] >= 0 && (((Class282_Sub30) class282_sub30).anIntArray7710[i_30_] < -1662523091 * IndexLoaders.ITEM_INDEX_LOADER.maxItemsCount)) {
				ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((((Class282_Sub30) class282_sub30).anIntArray7710[i_30_]), 1670357313);
				int i_31_ = class425.method7099(i_26_, ((IndexLoaders.ITEM_DEFAULTS.method7069(i_26_, (byte) 0).anInt5337) * -1741480635), -304171855);
				if (bool)
					i_29_ += i_31_ * (((Class282_Sub30) class282_sub30).anIntArray7709[i_30_]);
				else
					i_29_ += i_31_;
			}
		}
		return i_29_;
	}

	static Class282_Sub20 method4328(int i, int i_32_) {
		switch (i) {
		case 32:
			return new Class282_Sub20_Sub12();
		case 4:
			return new Class282_Sub20_Sub37();
		case 12:
			return new Class282_Sub20_Sub3();
		case 14:
			return new Class282_Sub20_Sub25();
		case 36:
			return new Class282_Sub20_Sub24();
		case 18:
			return new Class282_Sub20_Sub29_Sub1();
		case 26:
			return new Class282_Sub20_Sub11();
		case 28:
			return new Class282_Sub20_Sub9();
		case 27:
			return new Class282_Sub20_Sub1();
		case 39:
			return new Class282_Sub20_Sub29();
		case 8:
			return new Class282_Sub20_Sub10();
		case 2:
			return new Class282_Sub20_Sub6();
		case 0:
			return new Class282_Sub20_Sub17();
		case 11:
			return new Class282_Sub20_Sub35();
		case 35:
			return new Class282_Sub20_Sub26();
		case 7:
			return new Class282_Sub20_Sub27();
		case 15:
			return new Class282_Sub20_Sub34();
		case 3:
			return new Class282_Sub20_Sub18();
		case 19:
			return new Class282_Sub20_Sub15();
		case 33:
			return new Class282_Sub20_Sub36();
		case 9:
			return new Class282_Sub20_Sub23();
		case 23:
			return new Class282_Sub20_Sub22();
		case 25:
			return new Class282_Sub20_Sub28();
		case 21:
			return new Class282_Sub20_Sub33();
		case 30:
			return new Class282_Sub20_Sub7();
		case 20:
			return new Class282_Sub20_Sub2();
		case 24:
			return new Class282_Sub20_Sub30();
		case 16:
			return new Class282_Sub20_Sub8();
		case 6:
			return new Class282_Sub20_Sub20();
		case 10:
			return new Class282_Sub20_Sub13();
		case 1:
			return new Class282_Sub20_Sub21();
		case 5:
			return new Class282_Sub20_Sub16();
		case 34:
			return new Class282_Sub20_Sub4();
		case 17:
			return new Class282_Sub20_Sub32();
		case 13:
			return new Class282_Sub20_Sub38();
		case 29:
			return new Class282_Sub20_Sub19();
		case 37:
			return new Class282_Sub20_Sub14();
		case 22:
			return new Class282_Sub20_Sub31();
		case 38:
			return new Class282_Sub20_Sub39();
		case 31:
			return new Class282_Sub20_Sub5();
		default:
			return null;
		}
	}
}
