package com.rs.jagex;

import java.io.IOException;

public abstract class Class152 {

	static boolean aBool1962;

	public static void addFriend(String string_0) {
		if (string_0 != null)
			if (client.FRIEND_COUNT < 200) {
				String string_2 = Class383.method6515(string_0);
				if (string_2 != null) {
					int i_3;
					String string_5;
					String string_6;
					for (i_3 = 0; i_3 < client.FRIEND_COUNT; i_3++) {
						Friend class6_4 = client.FRIENDS[i_3];
						string_5 = Class383.method6515(class6_4.displayName);
						if (string_5 != null && string_5.equals(string_2)) {
							ChatLine.appendGameMessage(string_0 + LocalizedText.ALREADY_ON_FRIENDS_LIST.translate(Class223.CURRENT_LANGUAGE));
							return;
						}
						if (class6_4.username != null) {
							string_6 = Class383.method6515(class6_4.username);
							if (string_6 != null && string_6.equals(string_2)) {
								ChatLine.appendGameMessage(string_0 + LocalizedText.ALREADY_ON_FRIENDS_LIST.translate(Class223.CURRENT_LANGUAGE));
								return;
							}
						}
					}
					for (i_3 = 0; i_3 < client.IGNORE_LIST_COUNT; i_3++) {
						IgnoredPlayer class10_8 = client.IGNORED_PLAYERS[i_3];
						string_5 = Class383.method6515(class10_8.displayName);
						if (string_5 != null && string_5.equals(string_2)) {
							ChatLine.appendGameMessage(LocalizedText.aClass433_5214.translate(Class223.CURRENT_LANGUAGE) + string_0 + LocalizedText.aClass433_5198.translate(Class223.CURRENT_LANGUAGE));
							return;
						}
						if (class10_8.lastDisplayName != null) {
							string_6 = Class383.method6515(class10_8.lastDisplayName);
							if (string_6 != null && string_6.equals(string_2)) {
								ChatLine.appendGameMessage(LocalizedText.aClass433_5214.translate(Class223.CURRENT_LANGUAGE) + string_0 + LocalizedText.aClass433_5198.translate(Class223.CURRENT_LANGUAGE));
								return;
							}
						}
					}
					if (Class383.method6515(VertexNormal.MY_PLAYER.displayName).equals(string_2))
						ChatLine.appendGameMessage(LocalizedText.aClass433_5227.translate(Class223.CURRENT_LANGUAGE));
					else {
						BufferedConnectionContext class184_7 = BufferedConnectionContext.getConnectionContext();
						TCPPacket tcpmessage_9 = TCPPacket.createPacket(ClientProt.ADD_FRIEND, class184_7.outKeys);
						tcpmessage_9.buffer.writeByte(ChatLine.getLength(string_0));
						tcpmessage_9.buffer.writeString(string_0);
						class184_7.queuePacket(tcpmessage_9);
					}
				}
			} else
				ChatLine.appendGameMessage(LocalizedText.aClass433_5309.translate(Class223.CURRENT_LANGUAGE));
	}

	static void method2596() {
		Class442 class442_1 = null;
		try {
			class442_1 = ParticleArchive1Def.method6137("2", client.CURRENT_GAME.name, false);
			byte[] bytes_2 = new byte[(int) class442_1.method7388()];
			int i_3;
			for (int i_4 = 0; i_4 < bytes_2.length; i_4 += i_3) {
				i_3 = class442_1.method7389(bytes_2, i_4, bytes_2.length - i_4);
				if (i_3 == -1)
					throw new IOException();
			}
			MonoStereoPreference.method12696(new ByteBuf(bytes_2));
		} catch (Exception ignored) {
		}
		try {
			if (class442_1 != null)
				class442_1.method7385();
		} catch (Exception ignored) {
		}
	}

	public static Class494 method2598() {
		return Class237.aClass494_2916 == null ? Class494.aClass494_5786 : Class237.aClass494_2916;
	}

	static char method2599(char var_0, Language xlanguage_1) {
		if (var_0 >= 192 && var_0 <= 255) {
			if (var_0 >= 192 && var_0 <= 198)
				return 'A';
			if (var_0 == 199)
				return 'C';
			if (var_0 >= 200 && var_0 <= 203)
				return 'E';
			if (var_0 >= 204 && var_0 <= 207)
				return 'I';
			if (var_0 == 209 && xlanguage_1 != Language.SPANISH)
				return 'N';
			if (var_0 >= 210 && var_0 <= 214)
				return 'O';
			if (var_0 >= 217 && var_0 <= 220)
				return 'U';
			if (var_0 == 221)
				return 'Y';
			if (var_0 == 223)
				return 's';
			if (var_0 >= 224 && var_0 <= 230)
				return 'a';
			if (var_0 == 231)
				return 'c';
			if (var_0 >= 232 && var_0 <= 235)
				return 'e';
			if (var_0 >= 236 && var_0 <= 239)
				return 'i';
			if (var_0 == 241 && xlanguage_1 != Language.SPANISH)
				return 'n';
			if (var_0 >= 242 && var_0 <= 246)
				return 'o';
			if (var_0 >= 249 && var_0 <= 252)
				return 'u';
			if (var_0 == 253 || var_0 == 255)
				return 'y';
		}
		return var_0 == 338 ? 'O' : (var_0 == 339 ? 'o' : (var_0 == 376 ? 'Y' : var_0));
	}

	public static NativeSprite method2600(Index index_0, int i_1) {
		NativeSprite nativesprite_3 = (NativeSprite) Class299.aClass229_3545.get(i_1);
		if (nativesprite_3 == null) {
			if (IndexLoaders.USING_JAGEX_IMAGE_FORMAT)
				nativesprite_3 = Renderers.CURRENT_RENDERER.method8444(SpriteDefinitions.method1515(index_0, i_1), true);
			else
				nativesprite_3 = Class103_Sub1.method14490(index_0.getFile(i_1));
			Class299.aClass229_3545.put(nativesprite_3, i_1);
		}
		return nativesprite_3;
	}

	static void method2601(long long_0) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null)
			if (Camera.STATE != 2 && Camera.STATE != 1) {
				if (Camera.STATE == 4)
					Class280.method4974(long_0);
			} else
				Class363.method6286(long_0);
		CutsceneAction_Sub12.method14614(Renderers.CURRENT_RENDERER, client.FRAME_COUNT);
		if (client.BASE_WINDOW_ID != -1)
			CS2Interface.method8777(client.BASE_WINDOW_ID);
		int i_2;
		for (i_2 = 0; i_2 < client.IF_CURR_LAYER; i_2++) {
			client.aBoolArray7410[i_2] = client.IF_COMPONENTS_TO_RENDER[i_2];
			client.IF_COMPONENTS_TO_RENDER[i_2] = false;
		}
		client.anInt7408 = client.FRAME_COUNT;
		Class380.method6451(-1, -1);
		if (client.BASE_WINDOW_ID != -1) {
			client.IF_CURR_LAYER = 0;
			StructIndexLoader.method7039();
		}
		Renderers.CURRENT_RENDERER.L();
		MaterialProp21.method15411(Renderers.CURRENT_RENDERER);
		i_2 = QuickchatFiller.method1141();
		if (i_2 == -1)
			i_2 = client.anInt7427;
		if (i_2 == -1)
			i_2 = client.anInt7340;
		UnderlayIndexLoader.method8036(i_2);
		int i_3 = VertexNormal.MY_PLAYER.getSize() << 8;
		Vector3 vector3_4 = VertexNormal.MY_PLAYER.method11166().coords;
		PlaySoundJingleCutsceneAction.method14675(VertexNormal.MY_PLAYER.plane, i_3 + (int) vector3_4.x, i_3 + (int) vector3_4.z, client.anInt7261);
		client.anInt7261 = 0;
	}

	static int method2604() {
		int i_1 = IndexLoaders.LOADING_STAGE.anInt4712;
		if (i_1 < Class302.aClass387Array3557.length - 1)
			IndexLoaders.LOADING_STAGE = Class302.aClass387Array3557[i_1 + 1];
		return 100;
	}
}
