package com.jagex;

public class Class480 {

	static char[] aCharArray5716 = new char[64];

	static char[] aCharArray5717;

	static int[] anIntArray5715;

	static {
		int i_0;
		for (i_0 = 0; i_0 < 26; i_0++)
			aCharArray5716[i_0] = (char) (i_0 + 65);
		for (i_0 = 26; i_0 < 52; i_0++)
			aCharArray5716[i_0] = (char) (i_0 + 97 - 26);
		for (i_0 = 52; i_0 < 62; i_0++)
			aCharArray5716[i_0] = (char) (i_0 + 48 - 52);
		aCharArray5716[62] = 43;
		aCharArray5716[63] = 47;
		aCharArray5717 = new char[64];
		for (i_0 = 0; i_0 < 26; i_0++)
			aCharArray5717[i_0] = (char) (i_0 + 65);
		for (i_0 = 26; i_0 < 52; i_0++)
			aCharArray5717[i_0] = (char) (i_0 + 97 - 26);
		for (i_0 = 52; i_0 < 62; i_0++)
			aCharArray5717[i_0] = (char) (i_0 + 48 - 52);
		aCharArray5717[62] = 42;
		aCharArray5717[63] = 45;
		anIntArray5715 = new int[128];
		for (i_0 = 0; i_0 < anIntArray5715.length; i_0++)
			anIntArray5715[i_0] = -1;
		for (i_0 = 65; i_0 <= 90; i_0++)
			anIntArray5715[i_0] = i_0 - 65;
		for (i_0 = 97; i_0 <= 122; i_0++)
			anIntArray5715[i_0] = i_0 - 97 + 26;
		for (i_0 = 48; i_0 <= 57; i_0++)
			anIntArray5715[i_0] = i_0 - 48 + 52;
		int[] ints_2 = anIntArray5715;
		anIntArray5715[43] = 62;
		ints_2[42] = 62;
		int[] ints_1 = anIntArray5715;
		anIntArray5715[47] = 63;
		ints_1[45] = 63;
	}

	public static MapSize getMapSize(int i_0) {
		MapSize[] arr_2 = MapSize.values();
		for (MapSize class106_4 : arr_2) {
			if (i_0 == class106_4.index)
				return class106_4;
		}
		return null;
	}

	public static void method8043() {
		String string_1 = Class445.aString5384 != null ? Class445.aString5384 : MapAreaDefinitions.method3741();
		WorldMapDef.method14788(string_1, false, client.aBool7158);
	}

	static void method8044(IComponentDefinitions[] arr_0, IComponentDefinitions icomponentdefinitions_1, boolean bool_2) {
		int i_4 = icomponentdefinitions_1.scrollWidth != 0 ? icomponentdefinitions_1.scrollWidth : icomponentdefinitions_1.width;
		int i_5 = icomponentdefinitions_1.scrollHeight != 0 ? icomponentdefinitions_1.scrollHeight : icomponentdefinitions_1.height;
		InteractableObject.method16099(arr_0, icomponentdefinitions_1.idHash, i_4, i_5, bool_2);
		if (icomponentdefinitions_1.itemSlots != null)
			InteractableObject.method16099(icomponentdefinitions_1.itemSlots, icomponentdefinitions_1.idHash, i_4, i_5, bool_2);
		SubInterface class282_sub44_6 = (SubInterface) client.OPEN_INTERFACES.get(icomponentdefinitions_1.idHash);
		if (class282_sub44_6 != null)
			Class442.method7403(class282_sub44_6.interfaceId, i_4, i_5, bool_2);
		if (icomponentdefinitions_1 == client.GAME_SCREEN_INTERFACE) {
			int i_7 = Class197.NUM_PLAYER_INDICES;
			int[] ints_8 = Class197.PLAYER_INDICES;
			int i_9;
			for (i_9 = 0; i_9 < i_7; i_9++) {
				PlayerEntity player_12 = client.PLAYER_LIST[ints_8[i_9]];
				if (player_12 != null)
					player_12.method15795(i_4, i_5, bool_2);
			}
			for (i_9 = 0; i_9 < client.NPC_UPDATE_INDEX; i_9++) {
				int i_10 = client.NPC_UPDATE_INDICES[i_9];
				ObjectNode class282_sub47_11 = (ObjectNode) client.NPC_MAP.get(i_10);
				if (class282_sub47_11 != null)
					((PathingEntity) class282_sub47_11.anObject8068).method15795(i_4, i_5, bool_2);
			}
		}
	}

	Class480() throws Throwable {
		throw new Error();
	}
}
