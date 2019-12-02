public class Class190 {

	static boolean aBool2383 = false;

	Class190() throws Throwable {
		throw new Error();
	}

	public static void savePreferences(byte b_0) {
		Class442 class442_1 = null;

		try {
			class442_1 = ParticleArchive1Def.method6137("", client.CURRENT_GAME.name, true);
			RsByteBuffer rsbytebuffer_2 = Class393.preferences.encode();
			class442_1.method7386(rsbytebuffer_2.buffer, 0, rsbytebuffer_2.index, -1686459180);
		} catch (Exception exception_4) {
			;
		}

		try {
			if (class442_1 != null) {
				class442_1.method7385((short) 27366);
			}
		} catch (Exception exception_3) {
			;
		}

	}

	static void method3149(IComponentDefinitions icomponentdefinitions_0, Class455 class455_1, int i_2, int i_3, int i_4, int i_5, NativeSprite nativesprite_6, int i_7) {
		if (nativesprite_6 != null) {
			int i_8;
			if (NativeLibraryLoader.anInt3240 == 4) {
				i_8 = (int) client.camAngleY & 0x3fff;
			} else {
				i_8 = (int) client.camAngleY + client.anInt7255 & 0x3fff;
			}

			int i_9 = Math.max(icomponentdefinitions_0.width / 2, icomponentdefinitions_0.height / 2) + 10;
			int i_10 = i_5 * i_5 + i_4 * i_4;
			if (i_10 <= i_9 * i_9) {
				int i_11 = Class382.SINE[i_8];
				int i_12 = Class382.COSINE[i_8];
				if (NativeLibraryLoader.anInt3240 != 4) {
					i_11 = i_11 * 256 / (client.anInt7203 + 256);
					i_12 = i_12 * 256 / (client.anInt7203 + 256);
				}

				int i_13 = i_12 * i_4 + i_5 * i_11 >> 14;
				int i_14 = i_5 * i_12 - i_11 * i_4 >> 14;
				nativesprite_6.method2773(i_13 + icomponentdefinitions_0.width / 2 + i_2 - nativesprite_6.scaleWidth() / 2, i_3 + icomponentdefinitions_0.height / 2 - i_14 - nativesprite_6.method2748() / 2, class455_1, i_2, i_3);
			}
		}

	}

	public static RouteStrategy method3150(int i_0, int i_1, int sizeX, int sizeY) {
		RouteStrategies.NPC.approxDestinationX = i_0;
		RouteStrategies.NPC.approxDestinationY = i_1;
		RouteStrategies.NPC.approxDestinationSizeX = sizeX;
		RouteStrategies.NPC.approxDestinationSizeY = sizeY;
		RouteStrategies.NPC.anInt7928 = 0;
		return RouteStrategies.NPC;
	}

	static void method3151(int i_0, int i_1, IComponentDefinitions icomponentdefinitions_2, Class119 class119_3, int i_4, int i_5) {
		HintArrow[] hintArrows = client.HINT_ARROWS;

		for (int i_8 = 0; i_8 < hintArrows.length; i_8++) {
			HintArrow arrow = hintArrows[i_8];
			if (arrow != null && arrow.targetType != 0 && client.cycles % 20 < 10) {
				int i_13;
				if (arrow.targetType == 1) {
					StringNode class282_sub47_10 = (StringNode) client.NPCS.get((long) arrow.targetIndex);
					if (class282_sub47_10 != null) {
						NPC npc_11 = (NPC) class282_sub47_10.anObject8068;
						Vector3 vector3_12 = npc_11.method11166().coords;
						i_13 = (int) vector3_12.x / 128 - i_0 / 128;
						int i_14 = (int) vector3_12.z / 128 - i_1 / 128;
						Ground.method6728(icomponentdefinitions_2, class119_3, i_4, i_5, i_13, i_14, arrow.arrowSprite, 360000L);
					}
				}

				if (arrow.targetType == 2) {
					int i_15 = arrow.x / 128 - i_0 / 128;
					int i_16 = arrow.y / 128 - i_1 / 128;
					long long_17 = (long) (arrow.distance << 7);
					long_17 *= long_17;
					Ground.method6728(icomponentdefinitions_2, class119_3, i_4, i_5, i_15, i_16, arrow.arrowSprite, long_17);
				}

				if (arrow.targetType == 10 && arrow.targetIndex >= 0 && arrow.targetIndex < client.players.length) {
					Player player_20 = client.players[arrow.targetIndex];
					if (player_20 != null) {
						Vector3 vector3_21 = player_20.method11166().coords;
						int i_19 = (int) vector3_21.x / 128 - i_0 / 128;
						i_13 = (int) vector3_21.z / 128 - i_1 / 128;
						Ground.method6728(icomponentdefinitions_2, class119_3, i_4, i_5, i_19, i_13, arrow.arrowSprite, 360000L);
					}
				}
			}
		}

	}

	static void method3152() {
		if (client.gameState == 17) {
			Class42_Sub1.method14562(733346392);
		}

		Class186.method3083(619410098);
		client.LOBBY_CONNECTION_CONTEXT.method3051();
		IFSubObjectPosition.appletHasFocus = true;
		Class250.method4296();

		int i_1;
		for (i_1 = 0; i_1 < client.HINT_ARROWS.length; i_1++) {
			client.HINT_ARROWS[i_1] = null;
		}

		client.aBool7344 = false;
		Class16.method566(2012843625);
		client.anInt7248 = (int) (Math.random() * 100.0D) - 50;
		client.anInt7250 = (int) (Math.random() * 110.0D) - 55;
		client.anInt7343 = (int) (Math.random() * 80.0D) - 40;
		client.anInt7255 = (int) (Math.random() * 120.0D) - 60;
		client.anInt7203 = (int) (Math.random() * 30.0D) - 20;
		client.camAngleY = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3fff);
		ClanVarIndexLoader.method6763();

		for (i_1 = 0; i_1 < 2048; i_1++) {
			client.players[i_1] = null;
		}

		VertexNormal.MY_PLAYER = null;
		client.NPC_UPDATE_INDEX = 0;
		client.anInt7210 = 0;
		client.NPCS.method7749(1966305284);
		client.PROJECTILES.removeAll();
		client.aClass465_7334.method7749(1935752602);
		client.aClass457_7335.method7651();
		client.aClass465_7414.method7749(828403909);
		Node_Sub31.aClass482_7775 = new NodeCollection();
		Node_Sub31.aClass482_7776 = new NodeCollection();
		Class158_Sub1.PLAYER_VAR_PROVIDER.method265(-1043684196);
		FontRenderer_Sub3.method14341();
		Class296.CAM_MOVE_LOCALX = 0;
		IFSubNode.CAM_MOVE_LOCALY = 0;
		SpotAnimDefinitions.CAM_MOVE_Z = 0;
		Class454.CAM_MOVE_CONST_SPEED = 0;
		Class115.CAM_MOVE_VAR_SPEED = 0;
		PlaySynthCutsceneAction.anInt9368 = 0;
		OutgoingLoginPacket.anInt4280 = 0;
		Class121.anInt1527 = 0;
		LinkedNodeList.anInt5606 = 0;
		Class501.anInt5828 = 0;

		for (i_1 = 0; i_1 < Class320.VARC_INT.length; i_1++) {
			if (!Node_Sub17_Sub2.VARC_BOOL[i_1]) {
				Class320.VARC_INT[i_1] = -1;
			}
		}

		if (client.BASE_WINDOW_ID != -1) {
			Class337.unloadInterface(client.BASE_WINDOW_ID, 1308673999);
		}

		for (IFSubNode class282_sub44_2 = (IFSubNode) client.OPEN_INTERFACES.method7750(774217336); class282_sub44_2 != null; class282_sub44_2 = (IFSubNode) client.OPEN_INTERFACES.method7751((byte) 87)) {
			if (!class282_sub44_2.isLinked()) {
				class282_sub44_2 = (IFSubNode) client.OPEN_INTERFACES.method7750(-1913243579);
				if (class282_sub44_2 == null) {
					break;
				}
			}

			Class351.closeChildren(class282_sub44_2, true, false);
		}

		client.BASE_WINDOW_ID = -1;
		client.OPEN_INTERFACES = new IterableNodeMap(8);
		MeshModifier.method7041((byte) -126);
		client.aClass118_7352 = null;

		for (i_1 = 0; i_1 < 8; i_1++) {
			client.PLAYER_OPTIONS[i_1] = null;
			client.PLAYER_OPTION_REDUCED_PRIORITY[i_1] = false;
			client.PLAYER_OPTION_CURSORS[i_1] = -1;
		}

		FontRenderer_Sub2.method14262(-19282159);
		client.aBool7172 = true;

		for (i_1 = 0; i_1 < 107; i_1++) {
			client.aBoolArray7443[i_1] = true;
		}

		for (i_1 = 0; i_1 < 6; i_1++) {
			client.GRAND_EXCHANGE_SLOTS[i_1] = new GrandExchangeSlot();
		}

		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
		client.aBool7371 = true;
		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];
		Class85.aString817 = Message.WALK_HERE.translate(Class223.CURRENT_LANGUAGE);
		Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, Class393.preferences.aPreference_Sub27_8208.method12952((byte) 104));
		client.anInt7221 = 0;
		Class350.method6189((byte) 111);
		Class388.method6692(2043592347);
		PingRequest.CURRENT_REQUEST = null;
		Class28.aLong351 = 0L;
	}

}
