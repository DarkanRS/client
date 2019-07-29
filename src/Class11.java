public class Class11 {

	static Class109 aClass109_121;

	public static int anInt122;

	static int anInt123;

	public static SystemInfo SYSTEM_INFO;

	Class11() throws Throwable {
		throw new Error();
	}

	public static final void method469(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		PlaySynthCutsceneAction.anInt9368 = i_0;
		OutgoingLoginPacket.anInt4280 = i_1;
		Class121.anInt1527 = i_2;
		LinkedNodeList.anInt5606 = i_3;
		Class501.anInt5828 = i_4;
		if (Class501.anInt5828 >= 100) {
			int i_6 = PlaySynthCutsceneAction.anInt9368 * 512 + 256;
			int i_7 = OutgoingLoginPacket.anInt4280 * 512 + 256;
			int i_8 = Class504.getTerrainHeightAtPos(i_6, i_7, Class4.anInt35, (byte) 25) - Class121.anInt1527;
			int i_9 = i_6 - IdentitiKitIndexLoader.anInt361;
			int i_10 = i_8 - Class109_Sub1.anInt9384;
			int i_11 = i_7 - Class246.anInt3029;
			int i_12 = (int) Math.sqrt((double) (i_9 * i_9 + i_11 * i_11));
			Class293.anInt3512 = (int) (Math.atan2((double) i_10, (double) i_12) * 2607.5945876176133D) & 0x3fff;
			AnimationDefinitions.anInt5930 = (int) (Math.atan2((double) i_9, (double) i_11) * -2607.5945876176133D) & 0x3fff;
			Class121.anInt1525 = 0;
			if (Class293.anInt3512 < 1024) {
				Class293.anInt3512 = 1024;
			}
			if (Class293.anInt3512 > 3072) {
				Class293.anInt3512 = 3072;
			}
		}
		NativeLibraryLoader.anInt3240 = 5;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
	}

	public static void method13400(Index index_0, int i_1, int i_3, byte b_5) {
		Class271.method4827(index_0, i_1, 0, i_3, false);
	}
}
