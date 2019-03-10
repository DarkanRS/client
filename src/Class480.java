public class Class480 {

	static char[] aCharArray5716 = new char[64];

	static char[] aCharArray5717;

	static int[] anIntArray5715;

	static {
		int i_0;
		for (i_0 = 0; i_0 < 26; i_0++) {
			aCharArray5716[i_0] = (char) (i_0 + 65);
		}
		for (i_0 = 26; i_0 < 52; i_0++) {
			aCharArray5716[i_0] = (char) (i_0 + 97 - 26);
		}
		for (i_0 = 52; i_0 < 62; i_0++) {
			aCharArray5716[i_0] = (char) (i_0 + 48 - 52);
		}
		aCharArray5716[62] = 43;
		aCharArray5716[63] = 47;
		aCharArray5717 = new char[64];
		for (i_0 = 0; i_0 < 26; i_0++) {
			aCharArray5717[i_0] = (char) (i_0 + 65);
		}
		for (i_0 = 26; i_0 < 52; i_0++) {
			aCharArray5717[i_0] = (char) (i_0 + 97 - 26);
		}
		for (i_0 = 52; i_0 < 62; i_0++) {
			aCharArray5717[i_0] = (char) (i_0 + 48 - 52);
		}
		aCharArray5717[62] = 42;
		aCharArray5717[63] = 45;
		anIntArray5715 = new int[128];
		for (i_0 = 0; i_0 < anIntArray5715.length; i_0++) {
			anIntArray5715[i_0] = -1;
		}
		for (i_0 = 65; i_0 <= 90; i_0++) {
			anIntArray5715[i_0] = i_0 - 65;
		}
		for (i_0 = 97; i_0 <= 122; i_0++) {
			anIntArray5715[i_0] = i_0 - 97 + 26;
		}
		for (i_0 = 48; i_0 <= 57; i_0++) {
			anIntArray5715[i_0] = i_0 - 48 + 52;
		}
		int[] ints_2 = anIntArray5715;
		anIntArray5715[43] = 62;
		ints_2[42] = 62;
		int[] ints_1 = anIntArray5715;
		anIntArray5715[47] = 63;
		ints_1[45] = 63;
	}

	Class480() throws Throwable {
		throw new Error();
	}

	public static final void method8043(int i_0) {
		String string_1 = Class445.aString5384 != null ? Class445.aString5384 : WorldMapAreaDefs.method3741((byte) -1);
		Class282_Sub50_Sub6.method14788(string_1, false, Class393.preferences.currentToolkit.getValue(375740834) == 5, client.aBool7158, client.aBool7159, (byte) -111);
	}

	static void method8044(IComponentDefinitions[] arr_0, IComponentDefinitions icomponentdefinitions_1, boolean bool_2, byte b_3) {
		int i_4 = icomponentdefinitions_1.anInt1376 != 0 ? icomponentdefinitions_1.anInt1376 : icomponentdefinitions_1.anInt1301;
		int i_5 = icomponentdefinitions_1.anInt1314 != 0 ? icomponentdefinitions_1.anInt1314 : icomponentdefinitions_1.anInt1429;
		InteractableObject.method16099(arr_0, icomponentdefinitions_1.idHash, i_4, i_5, bool_2, (byte) 29);
		if (icomponentdefinitions_1.aClass118Array1439 != null) {
			InteractableObject.method16099(icomponentdefinitions_1.aClass118Array1439, icomponentdefinitions_1.idHash, i_4, i_5, bool_2, (byte) 17);
		}
		Class282_Sub44 class282_sub44_6 = (Class282_Sub44) client.aClass465_7442.get((long) icomponentdefinitions_1.idHash);
		if (class282_sub44_6 != null) {
			Class442.method7403(class282_sub44_6.anInt8063, i_4, i_5, bool_2, 1720687852);
		}
		if (icomponentdefinitions_1 == client.aClass118_7183) {
			int i_7 = Class197.NUM_PLAYER_INDICES;
			int[] ints_8 = Class197.PLAYER_INDICES;
			int i_9;
			for (i_9 = 0; i_9 < i_7; i_9++) {
				Player player_12 = client.players[ints_8[i_9]];
				if (player_12 != null) {
					player_12.method15795(i_4, i_5, bool_2, (byte) 27);
				}
			}
			for (i_9 = 0; i_9 < client.anInt7211; i_9++) {
				int i_10 = client.anIntArray7212[i_9];
				Class282_Sub47 class282_sub47_11 = (Class282_Sub47) client.NPCS.get((long) i_10);
				if (class282_sub47_11 != null) {
					((Animable) class282_sub47_11.anObject8068).method15795(i_4, i_5, bool_2, (byte) -94);
				}
			}
		}
	}

	public static Class106 method8046(int i_0, byte b_1) {
		Class106[] arr_2 = Class530.method11352(-2059272885);
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			Class106 class106_4 = arr_2[i_3];
			if (i_0 == class106_4.anInt1071) {
				return class106_4;
			}
		}
		return null;
	}
}
