package com.jagex;

class Class82 implements Interface11 {

	public static CutsceneEntity[] CUTSCENE_ENTITIES;

	static void method1457(int i_0, int i_1, IComponentDefinitions icomponentdefinitions_2, Class455 class455_3, int i_4, int i_5) {
		int i_7 = Class197.NUM_PLAYER_INDICES;
		int[] ints_8 = Class197.PLAYER_INDICES;
		for (int i_9 = 0; i_9 < i_7; i_9++) {
			PlayerEntity player_10 = client.PLAYER_LIST[ints_8[i_9]];
			if (player_10 != null && player_10.hasAppearance() && !player_10.hidden && player_10 != VertexNormal.MY_PLAYER && player_10.plane == VertexNormal.MY_PLAYER.plane) {
				Vector3 vector3_11 = player_10.method11166().coords;
				int i_12 = (int) vector3_11.x / 128 - i_0 / 128;
				int i_13 = (int) vector3_11.z / 128 - i_1 / 128;
				boolean bool_14 = false;
				for (int i_15 = 0; i_15 < client.FRIEND_COUNT; i_15++) {
					Friend class6_17 = client.FRIENDS[i_15];
					if (player_10.displayName.equals(class6_17.displayName) && class6_17.worldId != 0) {
						bool_14 = true;
						break;
					}
				}
				boolean bool_18 = false;
				for (int i_16 = 0; i_16 < Class459.FC_PLAYER_COUNT; i_16++)
					if (player_10.displayName.equals(Class467.FC_PLAYERS[i_16].displayName)) {
						bool_18 = true;
						break;
					}
				boolean bool_19 = false;
				if (player_10.teamId != 0 && player_10.teamId == VertexNormal.MY_PLAYER.teamId)
					bool_19 = true;
				if (player_10.aBool10571)
					Class190.method3149(icomponentdefinitions_2, class455_3, i_4, i_5, i_12, i_13, Class250.aNativeSpriteArray3092[6]);
				else if (bool_19)
					Class190.method3149(icomponentdefinitions_2, class455_3, i_4, i_5, i_12, i_13, Class250.aNativeSpriteArray3092[4]);
				else if (player_10.aBool10550)
					Class190.method3149(icomponentdefinitions_2, class455_3, i_4, i_5, i_12, i_13, Class250.aNativeSpriteArray3092[7]);
				else if (bool_14)
					Class190.method3149(icomponentdefinitions_2, class455_3, i_4, i_5, i_12, i_13, Class250.aNativeSpriteArray3092[3]);
				else if (bool_18)
					Class190.method3149(icomponentdefinitions_2, class455_3, i_4, i_5, i_12, i_13, Class250.aNativeSpriteArray3092[5]);
				else
					Class190.method3149(icomponentdefinitions_2, class455_3, i_4, i_5, i_12, i_13, Class250.aNativeSpriteArray3092[2]);
			}
		}
	}

	@Override
	public long method79(String string_1) {
		return Class254.method4379(string_1);
	}
}
