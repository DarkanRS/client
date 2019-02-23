public class Class197 {

	static FontMetrics aClass414_2436;
	static byte[] aByteArray2424 = new byte[2048];
	static byte[] playerMovementTypes = new byte[2048];
	static RsByteBuffer[] aClass282_Sub35Array2428 = new RsByteBuffer[2048];
	static int NUM_PLAYER_INDICES = 0;
	static int[] PLAYER_INDICES = new int[2048];
	static int anInt2431 = 0;
	static int[] anIntArray2426 = new int[2048];
	static Class4[] aClass4Array2430 = new Class4[2048];
	static int anInt2434 = 0;
	static int[] anIntArray2435 = new int[2048];

	Class197() throws Throwable {
		throw new Error();
	}

	static final void method3200(CS2Executor cs2executor_0, int i_1) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8227, cs2executor_0.intStack[--cs2executor_0.intStackPtr], 62408516);
		Class190.method3148((byte) 24);
		client.aBool7175 = false;
	}

	static final void method3201(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 71);
		Class282_Sub20_Sub4.method15207(icomponentdefinitions_3, cs2executor_0, 1765364986);
	}

	public static Interface17 method3202(RsByteBuffer rsbytebuffer_0, int i_1) {
		Class221 class221_2 = Class100.method1640(rsbytebuffer_0.readUnsignedByte(), (byte) -96);
		return (Interface17) (class221_2 == Class221.aClass221_2759 ? SceneObjectManager.method3545(rsbytebuffer_0, -532578452) : (class221_2 == Class221.aClass221_2761 ? Class97.method1614(rsbytebuffer_0, 1268954246) : (class221_2 == Class221.aClass221_2760 ? ClipMap.method6009(rsbytebuffer_0, -1710988237) : null)));
	}

	static final void method3203(RsBitsBuffer rsbitsbuffer_0, byte b_1) {
		rsbitsbuffer_0.initBitAccess((byte) -47);
		int i_2 = client.anInt7315;
		Player player_3 = Class84.myPlayer = client.players[i_2] = new Player(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2015513411));
		player_3.anInt10314 = i_2;
		int i_4 = rsbitsbuffer_0.readBits(30, (byte) -49);
		byte b_5 = (byte) (i_4 >> 28);
		int i_6 = i_4 >> 14 & 0x3fff;
		int i_7 = i_4 & 0x3fff;
		CoordGrid coordgrid_8 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(331387961);
		player_3.regionBaseX[0] = i_6 - coordgrid_8.x;
		player_3.regionBaseY[0] = i_7 - coordgrid_8.y;
		player_3.method11172((float) ((player_3.regionBaseX[0] << 9) + (player_3.getSize(828768449) << 8)), player_3.method11165().aClass385_3595.y, (float) ((player_3.regionBaseY[0] << 9) + (player_3.getSize(828768449) << 8)));
		Class4.anInt35 = player_3.plane = player_3.aByte7968 = b_5;
		if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).is0x2(player_3.regionBaseX[0], player_3.regionBaseY[0], 1664929780)) {
			player_3.aByte7968 = (byte) (player_3.aByte7968 + 1);
		}

		if (aClass282_Sub35Array2428[i_2] != null) {
			player_3.decodeAppearance(aClass282_Sub35Array2428[i_2], 1925099603);
		}

		NUM_PLAYER_INDICES = 0;
		PLAYER_INDICES[++NUM_PLAYER_INDICES - 1] = i_2;
		aByteArray2424[i_2] = 0;
		anInt2431 = 0;

		for (int i_9 = 1; i_9 < 2048; i_9++) {
			if (i_2 != i_9) {
				int i_10 = rsbitsbuffer_0.readBits(18, (byte) -45);
				int i_11 = i_10 >> 16;
				int i_12 = i_10 >> 8 & 0xff;
				int i_13 = i_10 & 0xff;
				Class4 class4_14 = aClass4Array2430[i_9] = new Class4();
				class4_14.anInt31 = (i_12 << 14) + i_13 + (i_11 << 28);
				class4_14.anInt30 = 0;
				class4_14.anInt32 = -1;
				class4_14.aBool29 = false;
				class4_14.aBool33 = false;
				anIntArray2426[++anInt2431 - 1] = i_9;
				aByteArray2424[i_9] = 0;
			}
		}

		rsbitsbuffer_0.finishBitAccess((byte) 95);
	}

}
