public class Class60 {

	public static NativeSprite aNativeSprite_612;

	public static Class60 aClass60_609 = new Class60(1);
	public static Class60 aClass60_602 = new Class60(2);
	public static Class60 aClass60_603 = new Class60(2);
	public static Class60 aClass60_608 = new Class60(2);
	public static Class60 aClass60_605 = new Class60(1);
	public static Class60 aClass60_606 = new Class60(1);
	public static Class60 aClass60_607 = new Class60(1);
	public static Class60 aClass60_604 = new Class60(2);
	public static Class60 aClass60_601 = new Class60(1);
	public static Class60 aClass60_610 = new Class60(2);

	public int anInt611;

	Class60(int i_1) {
		this.anInt611 = i_1;
	}

	public static boolean method1166(int i_0, int i_1) {
		return i_0 == 1 || i_0 == 3 || i_0 == 5;
	}

	public static IncomingPacket[] getIncommingPacket() {
		return new IncomingPacket[] { IncomingPacket.PLAYER_ON_ICOMPONENT, IncomingPacket.aClass375_4352, IncomingPacket.PROCESS_DEV_CONSOLE_COMMAND, IncomingPacket.aClass375_4354, IncomingPacket.UPDATE_ITEM_CONTAINER, IncomingPacket.SEND_ITEM_CONTAINER, IncomingPacket.NPC_UPDATE, IncomingPacket.CONFIG_2, IncomingPacket.aClass375_4381, IncomingPacket.LOGOUT_LOBBY, IncomingPacket.RECIEVE_PRIVATE_MESSAGE, IncomingPacket.aClass375_4362, IncomingPacket.GLOBAL_CONFIG_1, IncomingPacket.aClass375_4365, IncomingPacket.PLAYER_WEIGHT, IncomingPacket.aClass375_4392, IncomingPacket.OPEN_URL, IncomingPacket.aClass375_4368, IncomingPacket.aClass375_4433, IncomingPacket.aClass375_4370, IncomingPacket.aClass375_4402, IncomingPacket.aClass375_4372, IncomingPacket.SEND_PRIVATE_QUICKCHAT, IncomingPacket.OBJECT_INTERFACE, IncomingPacket.CAMERA_LOOK, IncomingPacket.RECIEVE_FRIENDS_CHAT_MESSAGE, IncomingPacket.aClass375_4377, IncomingPacket.CREATE_GROUND_ITEM, IncomingPacket.aClass375_4480, IncomingPacket.PING, IncomingPacket.SET_FILTERS_MISC, IncomingPacket.RECIEVE_PRIVATE_QUICKCHAT, IncomingPacket.ICOMPONENT_CONFIG, IncomingPacket.HIDE_ICOMPONENT, IncomingPacket.PLAYER_INTERFACE, IncomingPacket.ICOMPONENT_SPRITE, IncomingPacket.aClass375_4397, IncomingPacket.WINDOW_PANE_PACKET, IncomingPacket.INTERFACE, IncomingPacket.CAMERA_POSITION, IncomingPacket.aClass375_4399, IncomingPacket.SET_LOCAL_REGION, IncomingPacket.aClass375_4393, IncomingPacket.PLAYER_UPDATE, IncomingPacket.ICOMPONENT_SPRITE_SCALE, IncomingPacket.aClass375_4440, IncomingPacket.aClass375_4502, IncomingPacket.NPC_UPDATE_LARGE, IncomingPacket.ICOMPONENT_POSITION, IncomingPacket.CLAN_CHAT_CHANNEL, IncomingPacket.SET_CLAN_STRING, IncomingPacket.DYNAMIC_MAP_REGION, IncomingPacket.aClass375_4499, IncomingPacket.aClass375_4478, IncomingPacket.GLOBAL_STRING_SMALL, IncomingPacket.aClass375_4406, IncomingPacket.aClass375_4429, IncomingPacket.GRAND_EXCHANGE_SLOT, IncomingPacket.QUICK_HOP_WORLDS, IncomingPacket.NPC_INTERFACE, IncomingPacket.MUSIC_EFFECT, IncomingPacket.aClass375_4412, IncomingPacket.LOGOUT_FULL, IncomingPacket.MUSIC_TRACK, IncomingPacket.RUN_ENERGY, IncomingPacket.aClass375_4416, IncomingPacket.RESET_CAMERA, IncomingPacket.SET_PRIVATE_FILTER, IncomingPacket.VARPBIT_1, IncomingPacket.DESTROY_OBJECT, IncomingPacket.MINIMAP_FLAG, IncomingPacket.CAMERA_SHAKE, IncomingPacket.aClass375_4423, IncomingPacket.aClass375_4396, IncomingPacket.FRIEND_STATUS, IncomingPacket.aClass375_4426, IncomingPacket.aClass375_4492, IncomingPacket.aClass375_4428, IncomingPacket.CLOSE_CHILDREN, IncomingPacket.HINT_ICON, IncomingPacket.OBJECT_ANIMATION, IncomingPacket.RECIEVE_CLAN_MESSAGE, IncomingPacket.ICOMPONENT_ANIMATION, IncomingPacket.aClass375_4434, IncomingPacket.CUSTOMIZE_OBJECT, IncomingPacket.REGION, IncomingPacket.aClass375_4437, IncomingPacket.aClass375_4438, IncomingPacket.aClass375_4439, IncomingPacket.STOP_CAMERA_SHAKE, IncomingPacket.aClass375_4441, IncomingPacket.aClass375_4442, IncomingPacket.SEND_PRIVATE_MESSAGE, IncomingPacket.aClass375_4359, IncomingPacket.aClass375_4445, IncomingPacket.aClass375_4446, IncomingPacket.aClass375_4418, IncomingPacket.IGNORE_LIST, IncomingPacket.REFLECTION_CHECK, IncomingPacket.RUN_CS2_SCRIPT, IncomingPacket.aClass375_4451, IncomingPacket.aClass375_4452, IncomingPacket.SYSTEM_UPDATE, IncomingPacket.WORLD_LIST, IncomingPacket.SOUND_IDX15, IncomingPacket.aClass375_4456, IncomingPacket.aClass375_4457, IncomingPacket.aClass375_4458, IncomingPacket.VARPBIT_2, IncomingPacket.NPC_ON_ICOMPONENT, IncomingPacket.CUTSCENE, IncomingPacket.PLAYER_OPTION, IncomingPacket.ICOMPONENT_ITEM, IncomingPacket.aClass375_4464, IncomingPacket.TILE_MESSAGE, IncomingPacket.CONFIG_1, IncomingPacket.GLOBAL_CONFIG_2, IncomingPacket.CREATE_OBJECT, IncomingPacket.CAMERA_ROTATION, IncomingPacket.GLOBAL_STRING_BIG, IncomingPacket.RESET_SOUNDS, IncomingPacket.ICOMPONENT_SETTINGS_SET, IncomingPacket.RESET_ALL_ANIMATIONS, IncomingPacket.aClass375_4474, IncomingPacket.ICOMPONENT_TEXT, IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.SPOTANIM, IncomingPacket.FRIENDS_CHAT_CHANNEL, IncomingPacket.aClass375_4479, IncomingPacket.aClass375_4364, IncomingPacket.aClass375_4481, IncomingPacket.CLAN_QUICK_MESSAGE, IncomingPacket.aClass375_4483, IncomingPacket.aClass375_4355, IncomingPacket.aClass375_4453, IncomingPacket.ICOMPONENT_MODEL, IncomingPacket.SOUND_IDX14, IncomingPacket.CLAN_SETTINGS, IncomingPacket.ADD_IGNORE, IncomingPacket.aClass375_4351, IncomingPacket.SKILL_LEVEL, IncomingPacket.aClass375_4484, IncomingPacket.RECIEVE_FRIENDS_CHAT_QUICKCHAT, IncomingPacket.PROJECTILE, IncomingPacket.aClass375_4495, IncomingPacket.ANIMATE_NPC, IncomingPacket.aClass375_4497, IncomingPacket.IDENTIFY_HOST_NAME, IncomingPacket.ICOMPONENT_SETTINGS_RESTORE_DEFAULT, IncomingPacket.aClass375_4375, IncomingPacket.aClass375_4501, IncomingPacket.PLAYER_UNDER_NPC_PRIORITY, IncomingPacket.PUBLIC_MESSAGE, IncomingPacket.SET_CURSOR, IncomingPacket.BLOCK_MINIMAP_STATE, IncomingPacket.GROUNDITEM_INTERFACE, IncomingPacket.aClass375_4507, IncomingPacket.aClass375_4508, IncomingPacket.aClass375_4379, IncomingPacket.REQUEST_FPS, IncomingPacket.GAME_MESSAGE,
				IncomingPacket.aClass375_4459 };
	}

	public static boolean method1169(char var_0) {
		return var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
	}

	public static void method1170() {
		if (client.aBool7344) {
			IComponentDefinitions icomponentdefinitions_1 = Index.getIComponentDefinitions(Class7.anInt56, client.anInt7345);
			if (icomponentdefinitions_1 != null && icomponentdefinitions_1.anObjectArray1396 != null) {
				HookRequest hookrequest_2 = new HookRequest();
				hookrequest_2.iComponentDefs = icomponentdefinitions_1;
				hookrequest_2.params = icomponentdefinitions_1.anObjectArray1396;
				CS2Executor.executeHookInner200k(hookrequest_2, 1386646091);
			}
			client.anInt7427 = -1;
			client.anInt7346 = -1;
			client.aBool7344 = false;
			if (icomponentdefinitions_1 != null) {
				Class109.redrawComponent(icomponentdefinitions_1);
			}
		}
	}

	static void method1172(int i_0) {
		if (HDWaterTile.aClass496_952 != ServerEnvironment.aClass496_5810) {
			Class361.aClass361_4174.method6257(-84783453);
		}
	}

	static final void method1174(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		ItemIndexLoader.method7170(i_2);
		int i_7 = 0;
		int i_8 = i_2 - i_5;
		if (i_8 < 0) {
			i_8 = 0;
		}
		int i_9 = i_2;
		int i_10 = -i_2;
		int i_11 = i_8;
		int i_12 = -i_8;
		int i_13 = -1;
		int i_14 = -1;
		int i_16;
		int i_17;
		int i_18;
		int i_19;
		if (i_1 >= Class532_Sub3.anInt7070 && i_1 <= Class532_Sub3.anInt7068) {
			int[] ints_15 = Class532_Sub3.anIntArrayArray7072[i_1];
			i_16 = EntityNode.method4890(i_0 - i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 1149911370);
			i_17 = EntityNode.method4890(i_0 + i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -1752676227);
			i_18 = EntityNode.method4890(i_0 - i_8, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 543795752);
			i_19 = EntityNode.method4890(i_0 + i_8, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 1403864905);
			KeyHoldInputSubscriber.method3922(ints_15, i_16, i_18, i_4, (byte) -39);
			KeyHoldInputSubscriber.method3922(ints_15, i_18, i_19, i_3, (byte) -10);
			KeyHoldInputSubscriber.method3922(ints_15, i_19, i_17, i_4, (byte) -23);
		}
		while (i_9 > i_7) {
			i_13 += 2;
			i_14 += 2;
			i_10 += i_13;
			i_12 += i_14;
			if (i_12 >= 0 && i_11 >= 1) {
				--i_11;
				i_12 -= i_11 << 1;
				Class5.anIntArray36[i_11] = i_7;
			}
			++i_7;
			int i_20;
			int i_21;
			int[] ints_22;
			int i_23;
			if (i_10 >= 0) {
				--i_9;
				i_10 -= i_9 << 1;
				i_23 = i_1 - i_9;
				i_16 = i_9 + i_1;
				if (i_16 >= Class532_Sub3.anInt7070 && i_23 <= Class532_Sub3.anInt7068) {
					if (i_9 >= i_8) {
						i_17 = EntityNode.method4890(i_0 + i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -617603444);
						i_18 = EntityNode.method4890(i_0 - i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -1801446753);
						if (i_16 <= Class532_Sub3.anInt7068) {
							KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_16], i_18, i_17, i_4, (byte) -23);
						}
						if (i_23 >= Class532_Sub3.anInt7070) {
							KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_23], i_18, i_17, i_4, (byte) 29);
						}
					} else {
						i_17 = Class5.anIntArray36[i_9];
						i_18 = EntityNode.method4890(i_0 + i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 877789143);
						i_19 = EntityNode.method4890(i_0 - i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 58227539);
						i_20 = EntityNode.method4890(i_0 + i_17, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -1073712474);
						i_21 = EntityNode.method4890(i_0 - i_17, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 87726144);
						if (i_16 <= Class532_Sub3.anInt7068) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_16];
							KeyHoldInputSubscriber.method3922(ints_22, i_19, i_21, i_4, (byte) 31);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3, (byte) -76);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_18, i_4, (byte) 42);
						}
						if (i_23 >= Class532_Sub3.anInt7070) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_23];
							KeyHoldInputSubscriber.method3922(ints_22, i_19, i_21, i_4, (byte) -28);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3, (byte) -31);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_18, i_4, (byte) -10);
						}
					}
				}
			}
			i_23 = i_1 - i_7;
			i_16 = i_7 + i_1;
			if (i_16 >= Class532_Sub3.anInt7070 && i_23 <= Class532_Sub3.anInt7068) {
				i_17 = i_0 + i_9;
				i_18 = i_0 - i_9;
				if (i_17 >= Class532_Sub3.anInt7071 && i_18 <= Class532_Sub3.anInt7069) {
					i_17 = EntityNode.method4890(i_17, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 686110117);
					i_18 = EntityNode.method4890(i_18, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -716811882);
					if (i_7 < i_8) {
						i_19 = i_11 < i_7 ? Class5.anIntArray36[i_7] : i_11;
						i_20 = EntityNode.method4890(i_0 + i_19, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -569174694);
						i_21 = EntityNode.method4890(i_0 - i_19, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -277030614);
						if (i_16 <= Class532_Sub3.anInt7068) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_16];
							KeyHoldInputSubscriber.method3922(ints_22, i_18, i_21, i_4, (byte) -20);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3, (byte) 51);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_17, i_4, (byte) -7);
						}
						if (i_23 >= Class532_Sub3.anInt7070) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_23];
							KeyHoldInputSubscriber.method3922(ints_22, i_18, i_21, i_4, (byte) 32);
							KeyHoldInputSubscriber.method3922(ints_22, i_21, i_20, i_3, (byte) -49);
							KeyHoldInputSubscriber.method3922(ints_22, i_20, i_17, i_4, (byte) -4);
						}
					} else {
						if (i_16 <= Class532_Sub3.anInt7068) {
							KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_16], i_18, i_17, i_4, (byte) 63);
						}
						if (i_23 >= Class532_Sub3.anInt7070) {
							KeyHoldInputSubscriber.method3922(Class532_Sub3.anIntArrayArray7072[i_23], i_18, i_17, i_4, (byte) 67);
						}
					}
				}
			}
		}
	}
}
