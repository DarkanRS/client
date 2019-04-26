import java.io.IOException;

public abstract class Class152 {

	static boolean aBool1962;

	static void method2596() {
		Class442 class442_1 = null;
		try {
			class442_1 = Class345.method6137("2", client.CURRENT_GAME.name, false);
			byte[] bytes_2 = new byte[(int) class442_1.method7388()];
			int i_3;
			for (int i_4 = 0; i_4 < bytes_2.length; i_4 += i_3) {
				i_3 = class442_1.method7389(bytes_2, i_4, bytes_2.length - i_4, (byte) -99);
				if (i_3 == -1) {
					throw new IOException();
				}
			}
			Class468_Sub10.method12696(new RsByteBuffer(bytes_2));
		} catch (Exception exception_6) {
			;
		}
		try {
			if (class442_1 != null) {
				class442_1.method7385((short) 14717);
			}
		} catch (Exception exception_5) {
			;
		}
	}

	public static Class494 method2598() {
		return Class237.aClass494_2916 == null ? Class494.aClass494_5786 : Class237.aClass494_2916;
	}

	static char method2599(char var_0, Language xlanguage_1) {
		if (var_0 >= 192 && var_0 <= 255) {
			if (var_0 >= 192 && var_0 <= 198) {
				return 'A';
			}
			if (var_0 == 199) {
				return 'C';
			}
			if (var_0 >= 200 && var_0 <= 203) {
				return 'E';
			}
			if (var_0 >= 204 && var_0 <= 207) {
				return 'I';
			}
			if (var_0 == 209 && xlanguage_1 != Language.aClass495_5800) {
				return 'N';
			}
			if (var_0 >= 210 && var_0 <= 214) {
				return 'O';
			}
			if (var_0 >= 217 && var_0 <= 220) {
				return 'U';
			}
			if (var_0 == 221) {
				return 'Y';
			}
			if (var_0 == 223) {
				return 's';
			}
			if (var_0 >= 224 && var_0 <= 230) {
				return 'a';
			}
			if (var_0 == 231) {
				return 'c';
			}
			if (var_0 >= 232 && var_0 <= 235) {
				return 'e';
			}
			if (var_0 >= 236 && var_0 <= 239) {
				return 'i';
			}
			if (var_0 == 241 && xlanguage_1 != Language.aClass495_5800) {
				return 'n';
			}
			if (var_0 >= 242 && var_0 <= 246) {
				return 'o';
			}
			if (var_0 >= 249 && var_0 <= 252) {
				return 'u';
			}
			if (var_0 == 253 || var_0 == 255) {
				return 'y';
			}
		}
		return var_0 == 338 ? 'O' : (var_0 == 339 ? 'o' : (var_0 == 376 ? 'Y' : var_0));
	}

	public static NativeSprite method2600(Index index_0, int i_1, int i_2) {
		NativeSprite nativesprite_3 = (NativeSprite) Class299.aClass229_3545.get((long) i_1);
		if (nativesprite_3 == null) {
			if (IndexLoaders.USING_JAGEX_IMAGE_FORMAT) {
				nativesprite_3 = Renderers.SOFTWARE_RENDERER.method8444(SpriteDefinitions.method1515(index_0, i_1), true);
			} else {
				nativesprite_3 = Class103_Sub1.method14490(index_0.getFile(i_1), (byte) -40);
			}
			Class299.aClass229_3545.put(nativesprite_3, (long) i_1);
		}
		return nativesprite_3;
	}

	static final void method2601(long long_0) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
			if (NativeLibraryLoader.anInt3240 != 2 && NativeLibraryLoader.anInt3240 != 1) {
				if (NativeLibraryLoader.anInt3240 == 4) {
					Class280.method4974(long_0);
				}
			} else {
				Class363.method6286(long_0);
			}
		}
		Class96_Sub12.method14614(Renderers.SOFTWARE_RENDERER, (long) client.cycles);
		if (client.anInt7349 != -1) {
			RSHookableInterface.method8777(client.anInt7349, (byte) -80);
		}
		int i_2;
		for (i_2 = 0; i_2 < client.anInt7407; i_2++) {
			client.aBoolArray7410[i_2] = client.aBoolArray7443[i_2];
			client.aBoolArray7443[i_2] = false;
		}
		client.anInt7408 = client.cycles;
		Class380.method6451(-1, -1, 926012216);
		if (client.anInt7349 != -1) {
			client.anInt7407 = 0;
			StructIndexLoader.method7039((byte) 58);
		}
		Renderers.SOFTWARE_RENDERER.L();
		Class282_Sub20_Sub33.method15411(Renderers.SOFTWARE_RENDERER, (byte) 23);
		i_2 = QuickchatFiller.method1141(563483982);
		if (i_2 == -1) {
			i_2 = client.anInt7427;
		}
		if (i_2 == -1) {
			i_2 = client.anInt7340;
		}
		UnderlayIndexLoader.method8036(i_2);
		int i_3 = VertexNormal.myPlayer.getSize() << 8;
		Vector3 vector3_4 = VertexNormal.myPlayer.method11166().aClass385_3595;
		Class96_Sub21.method14675(VertexNormal.myPlayer.plane, i_3 + (int) vector3_4.x, i_3 + (int) vector3_4.z, client.anInt7261);
		client.anInt7261 = 0;
	}

	public static final void method2603(String string_0) {
		if (string_0 != null) {
			if ((client.anInt7449 < 200 || client.aBool7316) && client.anInt7449 < 200) {
				String string_2 = Class383.method6515(string_0);
				if (string_2 != null) {
					int i_3;
					String string_5;
					String string_6;
					for (i_3 = 0; i_3 < client.anInt7449; i_3++) {
						Class6 class6_4 = client.aClass6Array7452[i_3];
						string_5 = Class383.method6515(class6_4.aString37);
						if (string_5 != null && string_5.equals(string_2)) {
							LoadingStage.method6681(string_0 + Message.aClass433_5300.translate(Class223.CURRENT_LANGUAGE, -429754713), (byte) 25);
							return;
						}
						if (class6_4.aString43 != null) {
							string_6 = Class383.method6515(class6_4.aString43);
							if (string_6 != null && string_6.equals(string_2)) {
								LoadingStage.method6681(string_0 + Message.aClass433_5300.translate(Class223.CURRENT_LANGUAGE, -1776218961), (byte) 15);
								return;
							}
						}
					}
					for (i_3 = 0; i_3 < client.anInt7373; i_3++) {
						Class10 class10_8 = client.aClass10Array7456[i_3];
						string_5 = Class383.method6515(class10_8.aString115);
						if (string_5 != null && string_5.equals(string_2)) {
							LoadingStage.method6681(Message.aClass433_5214.translate(Class223.CURRENT_LANGUAGE, -2005183517) + string_0 + Message.aClass433_5198.translate(Class223.CURRENT_LANGUAGE, -2069902145), (byte) 0);
							return;
						}
						if (class10_8.aString116 != null) {
							string_6 = Class383.method6515(class10_8.aString116);
							if (string_6 != null && string_6.equals(string_2)) {
								LoadingStage.method6681(Message.aClass433_5214.translate(Class223.CURRENT_LANGUAGE, -1810692087) + string_0 + Message.aClass433_5198.translate(Class223.CURRENT_LANGUAGE, -1486683427), (byte) 11);
								return;
							}
						}
					}
					if (Class383.method6515(VertexNormal.myPlayer.displayName).equals(string_2)) {
						LoadingStage.method6681(Message.aClass433_5227.translate(Class223.CURRENT_LANGUAGE, -2084734592), (byte) 58);
					} else {
						BufferedConnectionContext class184_7 = Class468_Sub20.method12807(1188178835);
						TCPPacket tcpmessage_9 = Class271.createPacket(OutgoingPacket.ADD_FRIEND, class184_7.isaac);
						tcpmessage_9.buffer.writeByte(ChatLine.getLength(string_0));
						tcpmessage_9.buffer.writeString(string_0);
						class184_7.queuePacket(tcpmessage_9);
					}
				}
			} else {
				LoadingStage.method6681(Message.aClass433_5309.translate(Class223.CURRENT_LANGUAGE, -1836106303), (byte) 44);
			}
		}
	}

	static int method2604() {
		int i_1 = IndexLoaders.LOADING_STAGE.anInt4712;
		if (i_1 < Class302.aClass387Array3557.length - 1) {
			IndexLoaders.LOADING_STAGE = Class302.aClass387Array3557[i_1 + 1];
		}
		return 100;
	}
}
