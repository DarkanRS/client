/* Class510 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class510 {
	public int anInt6218;
	public int anInt6219;
	public int anInt6220;
	static Class444 aClass444_6221;
	public static boolean aBoolean6222;

	Class510(int i, int i_0_, int i_1_) {
		anInt6220 = -1047476297 * i;
		anInt6218 = i_0_ * 463745529;
		anInt6219 = i_1_ * 50067731;
	}

	public static int[] method6287(int i) {
		try {
			return new int[] { 399302739 * Class74.anInt691, Class74.anInt690 * 1178461027, Class74.anInt698 * -1372765471 };
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vc.b(").append(')').toString());
		}
	}

	static final void method6288(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 969361751;
			((ClientScript2) class403).anInt5239 -= -1175642067;
			String string = (String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241]);
			boolean bool = ((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]) == 1);
			boolean bool_2_ = 1 == (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			boolean bool_3_ = ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]) == 1);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2093, client.lobbyConnection.aClass449_330, (byte) 102);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(Class58.method693(string, 1218902925) + 1, 16711935);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2143999999);
			int i_4_ = 0;
			if (bool)
				i_4_ |= 0x1;
			if (bool_2_)
				i_4_ |= 0x2;
			if (bool_3_)
				i_4_ |= 0x4;
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(i_4_);
			client.lobbyConnection.method390(class298_sub36, (byte) -104);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vc.ve(").append(')').toString());
		}
	}

	public static void method6289(int i) {
		try {
			for (Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5816(1729958795)); class298_sub49 != null; class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5815((byte) -77))) {
				if (((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3773(-263786809))
					Class285.method2710((1566028323 * (((Class298_Sub49) class298_sub49).anInt7589)), (byte) 5);
				else {
					((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3785((byte) 40);
					try {
						((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3780((byte) -21);
					} catch (Exception exception) {
						Class464.method6062(new StringBuilder().append("").append(1566028323 * ((Class298_Sub49) class298_sub49).anInt7589).toString(), exception, (short) -20610);
						Class285.method2710(1566028323 * (((Class298_Sub49) class298_sub49).anInt7589), (byte) 85);
					}
					if (!((Class298_Sub49) class298_sub49).aBoolean7593 && !((Class298_Sub49) class298_sub49).aBoolean7592) {
						Class298_Sub24_Sub1 class298_sub24_sub1 = ((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3763(2034757591);
						if (class298_sub24_sub1 != null) {
							Class298_Sub19_Sub3 class298_sub19_sub3 = class298_sub24_sub1.method3082(-411389991);
							if (null != class298_sub19_sub3) {
								class298_sub19_sub3.method3030(1064671451 * ((Class298_Sub49) class298_sub49).anInt7590, (byte) 0);
								Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub3);
								((Class298_Sub49) class298_sub49).aBoolean7593 = true;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vc.d(").append(')').toString());
		}
	}

	public static IncommingPacket[] method6290(int i) {
		try {
			return (new IncommingPacket[] { IncommingPacket.aClass202_2227, IncommingPacket.RECEIVE_QUICK_PRIVATE_MESSAGE, IncommingPacket.FRIENDS_PACKET, IncommingPacket.aClass202_2153, IncommingPacket.aClass202_2154, IncommingPacket.CLOSE_INTERFACE_PACKET, IncommingPacket.PLAYER_UNDER_NPC_PRIORITY_PACKET, IncommingPacket.aClass202_2157, IncommingPacket.aClass202_2158, IncommingPacket.MUSIC_EFFECT_PACKET, IncommingPacket.SET_MOUSE_PACKET, IncommingPacket.WORLD_LIST_PACKET,
					IncommingPacket.aClass202_2162, IncommingPacket.aClass202_2163, IncommingPacket.INTERFACE_PACKET, IncommingPacket.aClass202_2195, IncommingPacket.aClass202_2166, IncommingPacket.OPEN_URL_PACKET, IncommingPacket.aClass202_2168, IncommingPacket.aClass202_2186, IncommingPacket.PROJECTILE_PACKET, IncommingPacket.aClass202_2151, IncommingPacket.aClass202_2172, IncommingPacket.PLAYER_ON_ICOMPONENT_PACKET, IncommingPacket.aClass202_2174, IncommingPacket.RUN_ENERGY_PACKET,
					IncommingPacket.aClass202_2176, IncommingPacket.aClass202_2177, IncommingPacket.aClass202_2284, IncommingPacket.aClass202_2179, IncommingPacket.SEND_FRIEND_QUICK_CHAT_MESSAGE_PACKET, IncommingPacket.MODEL_ON_ICOMPONENT_PACKET, IncommingPacket.RECEIVE_FRIEND_CHAT_QUICK_MESSAGE_PACKET, IncommingPacket.RECEIVE_PERSONAL_MESSAGE_PACKET, IncommingPacket.GLOBAL_STRING_PACKET_2, IncommingPacket.aClass202_2185, IncommingPacket.aClass202_2160, IncommingPacket.aClass202_2259,
					IncommingPacket.aClass202_2188, IncommingPacket.GAME_PANE_PACKET, IncommingPacket.ICOMPONENT_SETTINGS_PACKET, IncommingPacket.aClass202_2191, IncommingPacket.LOAD_MAP_SCENE_PACKET, IncommingPacket.aClass202_2193, IncommingPacket.SHAKE_CAMERA_PACKET, IncommingPacket.DESTROY_OBJECT_PACKET, IncommingPacket.aClass202_2209, IncommingPacket.aClass202_2184, IncommingPacket.aClass202_2198, IncommingPacket.aClass202_2199, IncommingPacket.aClass202_2212,
					IncommingPacket.aClass202_2201, IncommingPacket.aClass202_2194, IncommingPacket.aClass202_2203, IncommingPacket.aClass202_2238, IncommingPacket.IGNORES_PACKET, IncommingPacket.CONFIG2_PACKET, IncommingPacket.aClass202_2207, IncommingPacket.aClass202_2208, IncommingPacket.LOBBY_LOGOUT_PACKET, IncommingPacket.LOGOUT_PACKET, IncommingPacket.CLIENT_CONSOLE_COMMAND_PACKET, IncommingPacket.aClass202_2261, IncommingPacket.GLOBAL_CONFIG2_PACKET,
					IncommingPacket.LARGE_NPC_UPDATE_PACKET, IncommingPacket.aClass202_2215, IncommingPacket.aClass202_2204, IncommingPacket.aClass202_2217, IncommingPacket.aClass202_2218, IncommingPacket.BLACK_OUT_PACKET, IncommingPacket.SOUND_INDEX15, IncommingPacket.aClass202_2221, IncommingPacket.NPC_UPDATE_PACKET, IncommingPacket.aClass202_2223, IncommingPacket.SET_CAMERA_POS_PACKET, IncommingPacket.PRIVATE_GAME_BAR_STAGE_PACKET, IncommingPacket.OBJECT_ANIMATION_PACKET,
					IncommingPacket.ITEMS_PACKET, IncommingPacket.aClass202_2228, IncommingPacket.HINT_ICON_PACKET, IncommingPacket.aClass202_2230, IncommingPacket.CONFIG_BY_FILE2_PACKET, IncommingPacket.aClass202_2248, IncommingPacket.aClass202_2247, IncommingPacket.aClass202_2270, IncommingPacket.CLAN_CHAT_CHANNEL, IncommingPacket.aClass202_2290, IncommingPacket.aClass202_2237, IncommingPacket.aClass202_2236, IncommingPacket.aClass202_2239, IncommingPacket.GRAPHICS_PACKET,
					IncommingPacket.aClass202_2178, IncommingPacket.aClass202_2242, IncommingPacket.aClass202_2293, IncommingPacket.aClass202_2231, IncommingPacket.RESET_CAMERA_PACKET, IncommingPacket.PLAYER_UPDATE_PACKET, IncommingPacket.aClass202_2234, IncommingPacket.aClass202_2309, IncommingPacket.aClass202_2249, IncommingPacket.aClass202_2267, IncommingPacket.aClass202_2251, IncommingPacket.ICOMPONENT_MODEL_PACKET, IncommingPacket.aClass202_2253,
					IncommingPacket.RECEIVE_PRIVATE_QUICK_CHAT_MESSAGE_PACKET, IncommingPacket.RECEIVE_PRIVATE_MESSAGE_PACKET, IncommingPacket.PUBLIC_MESSAGE_PACKET, IncommingPacket.TILE_MESSAGE_PACKET, IncommingPacket.REMOVE_GROUND_ITEM_PACKET, IncommingPacket.aClass202_2250, IncommingPacket.CONFIG1_PACKET, IncommingPacket.CONFIG_BY_FILE1_PACKET, IncommingPacket.HIDE_ICOMPONENT_PACKET, IncommingPacket.aClass202_1900, IncommingPacket.aClass202_2182, IncommingPacket.aClass202_2265,
					IncommingPacket.SET_CAMERA_LOOK_PACKET, IncommingPacket.FRIENDS_CHAT_CHANNEL_PACKET, IncommingPacket.PLAYER_OPTION_PACKET, IncommingPacket.RUN_SCRIPT_PACKET, IncommingPacket.SPAWN_OBJECT_PACKET, IncommingPacket.aClass202_2271, IncommingPacket.aClass202_2272, IncommingPacket.CAMERA_ROTATION_PACKET, IncommingPacket.aClass202_2274, IncommingPacket.SEND_GROUND_ITEM_PACKET, IncommingPacket.aClass202_2276, IncommingPacket.aClass202_2277, IncommingPacket.IGNORE_PACKET,
					IncommingPacket.MUSIC_PACKET, IncommingPacket.SEND_PRIVATE_MESSAGE_PACKET, IncommingPacket.STOP_CAMERA_SHAKE_PACKET, IncommingPacket.SECURITY_PACKET, IncommingPacket.aClass202_2283, IncommingPacket.GLOBAL_STRING_PACKET, IncommingPacket.ICOMPONENT_TEXT_PACKET, IncommingPacket.MESSAGE_PACKET, IncommingPacket.aClass202_2287, IncommingPacket.ITEMS_UPDATE_PACKET, IncommingPacket.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET, IncommingPacket.aClass202_2232,
					IncommingPacket.SYSTEM_UPDATE_PACKET, IncommingPacket.CUTSCENE_PACKET, IncommingPacket.aClass202_2273, IncommingPacket.LOAD_MAP_SCENE_DYNAMIC_PACKET, IncommingPacket.RESET_SOUNDS_PACKET, IncommingPacket.SKILL_LEVEL_PACKET, IncommingPacket.aClass202_2297, IncommingPacket.aClass202_2298, IncommingPacket.aClass202_2299, IncommingPacket.aClass202_2255, IncommingPacket.aClass202_2220, IncommingPacket.ITEM_ON_ICOMPONENT_PACKET, IncommingPacket.KEEP_ALIVE_PACKET,
					IncommingPacket.GLOBAL_CONFIG1_PACKET, IncommingPacket.aClass202_2305, IncommingPacket.aClass202_2306, IncommingPacket.aClass202_2307, IncommingPacket.WORLD_TILE_PACKET, IncommingPacket.SWITCH_ITEMS_LOOK_PACKET });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vc.a(").append(')').toString());
		}
	}
}
