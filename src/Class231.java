/* Class231 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class231 {
	int[] anIntArray2859;
	public static final int anInt2860 = 2;
	public static final int anInt2861 = 8;
	short[] aShortArray2862;
	byte aByte2863;
	int[] anIntArray2864;
	byte aByte2865;
	short aShort2866;
	short aShort2867;
	short aShort2868;
	short aShort2869;
	public static final int anInt2870 = 1;
	int[] anIntArray2871;
	public static final int anInt2872 = 16;
	short[] aShortArray2873;
	public static final int anInt2874 = 4;
	short[] aShortArray2875;
	public static String aString2876;

	Class231(SceneObjectManager class206, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class231) this).aByte2863 = (byte) i;
		((Class231) this).aByte2865 = (byte) i_0_;
		((Class231) this).anIntArray2859 = new int[4];
		((Class231) this).anIntArray2871 = new int[4];
		((Class231) this).anIntArray2864 = new int[4];
		((Class231) this).anIntArray2859[0] = i_1_;
		((Class231) this).anIntArray2859[1] = i_2_;
		((Class231) this).anIntArray2859[2] = i_3_;
		((Class231) this).anIntArray2859[3] = i_4_;
		((Class231) this).anIntArray2871[0] = i_5_;
		((Class231) this).anIntArray2871[1] = i_6_;
		((Class231) this).anIntArray2871[2] = i_7_;
		((Class231) this).anIntArray2871[3] = i_8_;
		((Class231) this).anIntArray2864[0] = i_9_;
		((Class231) this).anIntArray2864[1] = i_10_;
		((Class231) this).anIntArray2864[2] = i_11_;
		((Class231) this).anIntArray2864[3] = i_12_;
		((Class231) this).aShort2866 = (short) (i_1_ >> -1928575293 * class206.anInt2592);
		((Class231) this).aShort2867 = (short) (i_3_ >> class206.anInt2592 * -1928575293);
		((Class231) this).aShort2868 = (short) (i_9_ >> -1928575293 * class206.anInt2592);
		((Class231) this).aShort2869 = (short) (i_11_ >> class206.anInt2592 * -1928575293);
		((Class231) this).aShortArray2873 = new short[4];
		((Class231) this).aShortArray2862 = new short[4];
		((Class231) this).aShortArray2875 = new short[4];
	}

	static final void method3913(CS2Executor class527, int i) {
		int i_13_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.anIntArray7336[i_13_];
	}

	static void method3914(int i, String string, boolean bool, byte i_14_) {
		Class28.method772((byte) 14);
		AttributeDefault.method7323((byte) -45);
		Class250.method4297(620530459);
		Class282_Sub17_Sub1.method15402(i, string, bool, 1568129445);
		Class487.aClass378_5752.method6433(-1648322777);
		Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
		Class282_Sub11_Sub3.method15476(Renderers.SOFTWARE_RENDERER, 2105795024);
		Class188.method3139(Renderers.SOFTWARE_RENDERER, IndexLoaders.SPRITES_INDEX, -814245885);
		Class76.method1361((byte) -31);
		Class122.method2109(Class182.aClass160Array2261, (byte) 8);
		IncomingPacket.method6378(-1538407760);
		Class94.method1589((short) 255);
		if (5 == -1741204137 * client.anInt7166)
			Class365.setGameState(11, 2080039213);
		else if (0 == -1741204137 * client.anInt7166)
			Class365.setGameState(2, 2028461626);
		else if (client.anInt7166 * -1741204137 == 7)
			Class365.setGameState(6, 1241604185);
		else if (13 == -1741204137 * client.anInt7166)
			Class365.setGameState(18, 1354384204);
		else if (15 == -1741204137 * client.anInt7166 || client.anInt7166 * -1741204137 == 1)
			Class386.method6673(1101279462);
		else if (client.anInt7166 * -1741204137 == 3)
			Class365.setGameState(9, 703598448);
	}
}
