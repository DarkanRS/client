/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Defaults6Loader {
	public static final int anInt6986 = 1;
	static final int anInt6987 = 2;
	public static final int anInt6988 = 0;
	public int[] equipmentSlots;
	public int anInt6990 = 1748950621;
	public int anInt6991 = 2070499537;
	public int[] anIntArray6992;
	public int[] anIntArray6993;

	void method11245(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (0 == i_0_)
				break;
			if (1 == i_0_) {
				int i_1_ = class282_sub35.readUnsignedByte();
				equipmentSlots = new int[i_1_];
				for (int i_2_ = 0; i_2_ < equipmentSlots.length; i_2_++) {
					equipmentSlots[i_2_] = class282_sub35.readUnsignedByte();
					if (equipmentSlots[i_2_] != 0 && equipmentSlots[i_2_] != 2) {
						/* empty */
					}
				}
			} else if (3 == i_0_)
				anInt6990 = class282_sub35.readUnsignedByte() * -1748950621;
			else if (4 == i_0_)
				anInt6991 = class282_sub35.readUnsignedByte() * -2070499537;
			else if (5 == i_0_) {
				anIntArray6992 = new int[class282_sub35.readUnsignedByte()];
				for (int i_3_ = 0; i_3_ < anIntArray6992.length; i_3_++)
					anIntArray6992[i_3_] = class282_sub35.readUnsignedByte();
			} else if (6 == i_0_) {
				anIntArray6993 = new int[class282_sub35.readUnsignedByte()];
				for (int i_4_ = 0; i_4_ < anIntArray6993.length; i_4_++)
					anIntArray6993[i_4_] = class282_sub35.readUnsignedByte();
			}
		}
	}

	public Defaults6Loader(Index class317) {
		byte[] is = class317.getFile((-1719912253 * DefaultsFile.FILE_6.fileId));
		method11245(new RsByteBuffer(is), -672057910);
		if (equipmentSlots == null)
			throw new RuntimeException("");
	}

	static final void method11246(CS2Executor class527, byte i) {
		int i_5_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_5_, (byte) 99);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_5_ >> 16];
		QuestDefinitions.method4136(class118, class98, class527, (byte) 78);
	}

	static final void method11247(CS2Executor class527, int i) {
		int i_6_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_6_, (byte) 113);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	public static void method11248(int i) {
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8208), 2, -739339272);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub27_8209), 2, -1802461123);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub23_8202), 1, -2042721165);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub17_8200), 1, -483974796);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub15_8203), 1, -1488523867);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub26_8224), 1, 1312691024);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub28_8212), 1, 1015106335);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub22_8213), 1, -562253480);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub2_8205), 2, -1286707836);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub19_8204), 1, 478043407);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub24_8216), 2, -821146984);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub30_8194), 1, -268934018);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub4_8187), 0, 1600153169);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub4_8223), 0, -2035572278);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), 2, 2138674404);
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, Class106.aClass106_1075.anInt1071 * -530599889, -1318681666);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub12_8195), 0, 1179600345);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub14_8211), 1, 991235937);
		Class323.method5777(1560410818);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub7_8210), 0, -231227368);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 4, -702190975);
		Class94.method1589((short) 255);
		IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4048(1356336946);
		client.aBool7185 = true;
	}

	static final void method11249(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1343 * -1823193031;
	}
}
