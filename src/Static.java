
public class Static {

	public static boolean method2084(Index index_0, Index index_1, Index index_2, Node_Sub15_Sub2 class282_sub15_sub2_3, Class253 class253_4) {
		Class148.aClass317_1737 = index_0;
		Class148.aClass317_1731 = index_1;
		Class148.aClass317_1732 = index_2;
		Class148.aNode_Sub15_Sub2_1735 = class282_sub15_sub2_3;
		Class502.aClass253_5830 = class253_4;
		HashTable.anIntArray5449 = new int[16];
		for (int i_6 = 0; i_6 < 16; i_6++) {
			HashTable.anIntArray5449[i_6] = 255;
		}
		return true;
	}

	public static void method2094(int i_0) {
		Class291_Sub1.anInt8018 = -1;
		Class291_Sub1.anInt8026 = i_0;
		Class361.anInt4185 = 3;
		CutsceneAction_Sub9.anInt9282 = 100;
	}

	static void method2095(CacheableNode_Sub7 class282_sub50_sub7_0) {
		if (!Class20.aBool161) {
			class282_sub50_sub7_0.remove();
			--Class20.anInt169;
			if (!class282_sub50_sub7_0.aBool9586) {
				long long_2 = class282_sub50_sub7_0.aLong9580;
				CacheableNode_Sub15 class282_sub50_sub15_4;
				for (class282_sub50_sub15_4 = (CacheableNode_Sub15) Class20.aClass465_172.get(long_2); class282_sub50_sub15_4 != null && !class282_sub50_sub15_4.aString9771.equals(class282_sub50_sub7_0.aString9588); class282_sub50_sub15_4 = (CacheableNode_Sub15) Class20.aClass465_172.method7747(-1584347554)) {
					;
				}
				if (class282_sub50_sub15_4 != null && class282_sub50_sub15_4.method15249(class282_sub50_sub7_0, (byte) 17)) {
					Class13.method503(class282_sub50_sub15_4, 1715883578);
				}
			} else {
				for (CacheableNode_Sub15 class282_sub50_sub15_5 = (CacheableNode_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_5 != null; class282_sub50_sub15_5 = (CacheableNode_Sub15) Class20.aClass477_182.method7955(194809254)) {
					if (class282_sub50_sub15_5.aString9771.equals(class282_sub50_sub7_0.aString9588)) {
						boolean bool_3 = false;
						for (CacheableNode_Sub7 class282_sub50_sub7_6 = (CacheableNode_Sub7) class282_sub50_sub15_5.aClass477_9770.method7941(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) class282_sub50_sub15_5.aClass477_9770.method7955(444396099)) {
							if (class282_sub50_sub7_6 == class282_sub50_sub7_0) {
								if (class282_sub50_sub15_5.method15249(class282_sub50_sub7_0, (byte) 111)) {
									Class13.method503(class282_sub50_sub15_5, 1035797942);
								}
								bool_3 = true;
								break;
							}
						}
						if (bool_3) {
							break;
						}
					}
				}
			}
		}
	}

	static int method6375(String string_0, byte[] bytes_1, int i_2) {
		int i_4 = i_2;
		int i_5 = string_0.length();
		for (int i_6 = 0; i_6 < i_5; i_6 += 4) {
			int i_7 = Class514.method8840(string_0.charAt(i_6), -894712583);
			int i_8 = i_6 + 1 < i_5 ? Class514.method8840(string_0.charAt(i_6 + 1), -1438069843) : -1;
			int i_9 = i_6 + 2 < i_5 ? Class514.method8840(string_0.charAt(i_6 + 2), -571701318) : -1;
			int i_10 = i_6 + 3 < i_5 ? Class514.method8840(string_0.charAt(i_6 + 3), -1756572759) : -1;
			bytes_1[i_2++] = (byte) (i_7 << 2 | i_8 >>> 4);
			if (i_9 == -1) {
				break;
			}
			bytes_1[i_2++] = (byte) ((i_8 & 0xf) << 4 | i_9 >>> 2);
			if (i_10 == -1) {
				break;
			}
			bytes_1[i_2++] = (byte) ((i_9 & 0x3) << 6 | i_10);
		}
		return i_2 - i_4;
	}

	public static Game method6376(int i_0) {
		Game[] arr_2 = Node_Sub15_Sub1.method14817();
		for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
			Game game_4 = arr_2[i_3];
			if (i_0 == game_4.id) {
				return game_4;
			}
		}
		return null;
	}

	static void method6377() {
		Class186.method3083(925085944);
	}

	public static void method6378() {
		for (int i_1 = 0; i_1 < 107; i_1++) {
			client.aBoolArray7443[i_1] = true;
		}
	}

	public static void method6379(Player player_0) {
		Node_Sub48 class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass465_8075.get((long) player_0.index);
		if (class282_sub48_2 == null) {
			Class397.method6775(player_0.plane, player_0.regionBaseX[0], player_0.regionBaseY[0], 0, (ObjectDefinitions) null, (NPC) null, player_0, 77262483);
		} else {
			class282_sub48_2.method13426();
		}
	}

	static String method6380(CacheableNode_Sub7 class282_sub50_sub7_0, int i_1) {
		return class282_sub50_sub7_0.aString9585 != null && class282_sub50_sub7_0.aString9585.length() != 0 ? (class282_sub50_sub7_0.aString9588 != null && class282_sub50_sub7_0.aString9588.length() > 0 ? class282_sub50_sub7_0.aString9576 + Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9588 + Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9585 : class282_sub50_sub7_0.aString9576 + Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9585) : (class282_sub50_sub7_0.aString9588 != null && class282_sub50_sub7_0.aString9588.length() > 0 ? class282_sub50_sub7_0.aString9576 + Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + class282_sub50_sub7_0.aString9588 : class282_sub50_sub7_0.aString9576);
	}

	static final void method4281(Entity animable_0) {
	    int i_2 = animable_0.anInt10342 - client.cycles;
	    int i_3 = animable_0.anInt10326 * 512 + animable_0.getSize() * 256;
	    int i_4 = animable_0.anInt10328 * 512 + animable_0.getSize() * 256;
	    Vector3 vector3_5 = animable_0.method11166().coords;
	    animable_0.method11172((float) ((int) vector3_5.x + (i_3 - (int) vector3_5.x) / i_2), (float) ((int) vector3_5.y), (float) ((int) vector3_5.z + (i_4 - (int) vector3_5.z) / i_2));
	    animable_0.anInt10366 = 0;
	    animable_0.method15863(animable_0.anInt10346, 1692779087);
	}

	public static boolean isFriend(String string_0) {
	    if (string_0 == null) {
	        return false;
	    } else {
	        for (int i_2 = 0; i_2 < client.FRIEND_COUNT; i_2++) {
	            if (string_0.equalsIgnoreCase(client.FRIENDS[i_2].displayName)) {
	                return true;
	            }
	        }
	        return string_0.equalsIgnoreCase(VertexNormal.MY_PLAYER.displayName);
	    }
	}

	static Class194 aClass194_5794;
	static int UPDATE_ZONE_X;
	public static int COUNTRY;

}
