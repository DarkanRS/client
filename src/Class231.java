public class Class231 {

	public static String aString2876;

	byte aByte2863;

	byte aByte2865;

	int[] anIntArray2859;

	int[] anIntArray2871;

	int[] anIntArray2864;

	short aShort2866;

	short aShort2867;

	short aShort2868;

	short aShort2869;

	short[] aShortArray2873;

	short[] aShortArray2862;

	short[] aShortArray2875;

	Class231(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15) {
		this.aByte2863 = (byte) i_2;
		this.aByte2865 = (byte) i_3;
		this.anIntArray2859 = new int[4];
		this.anIntArray2871 = new int[4];
		this.anIntArray2864 = new int[4];
		this.anIntArray2859[0] = i_4;
		this.anIntArray2859[1] = i_5;
		this.anIntArray2859[2] = i_6;
		this.anIntArray2859[3] = i_7;
		this.anIntArray2871[0] = i_8;
		this.anIntArray2871[1] = i_9;
		this.anIntArray2871[2] = i_10;
		this.anIntArray2871[3] = i_11;
		this.anIntArray2864[0] = i_12;
		this.anIntArray2864[1] = i_13;
		this.anIntArray2864[2] = i_14;
		this.anIntArray2864[3] = i_15;
		this.aShort2866 = (short) (i_4 >> sceneobjectmanager_1.anInt2592);
		this.aShort2867 = (short) (i_6 >> sceneobjectmanager_1.anInt2592);
		this.aShort2868 = (short) (i_12 >> sceneobjectmanager_1.anInt2592);
		this.aShort2869 = (short) (i_14 >> sceneobjectmanager_1.anInt2592);
		this.aShortArray2873 = new short[4];
		this.aShortArray2862 = new short[4];
		this.aShortArray2875 = new short[4];
	}

	static void method3914(int i_0, String string_1, boolean bool_2, byte b_3) {
		Class28.method772((byte) 14);
		ParamDefinitions.method7323();
		Class250.method4297(620530459);
		Node_Sub17_Sub1.method15402(i_0, string_1, bool_2, 1568129445);
		Class487.aClass378_5752.method6433();
		Class487.aClass378_5752.method6403(client.anInterface35_7206);
		Node_Sub11_Sub3.method15476(Renderers.SOFTWARE_RENDERER, 2105795024);
		Class188.method3139(Renderers.SOFTWARE_RENDERER, IndexLoaders.SPRITES_INDEX);
		Class76.method1361((byte) -31);
		Class122.method2109(Class182.aNativeSpriteArray2261, (byte) 8);
		IncomingPacket.method6378();
		Class94.method1589();
		if (client.gameState == 5) {
			Class365.setGameState(11);
		} else if (client.gameState == 0) {
			Class365.setGameState(2);
		} else if (client.gameState == 7) {
			Class365.setGameState(6);
		} else if (client.gameState == 13) {
			Class365.setGameState(18);
		} else if (client.gameState != 15 && client.gameState != 1) {
			if (client.gameState == 3) {
				Class365.setGameState(9);
			}
		} else {
			Class386.method6673(1101279462);
		}
	}
}
