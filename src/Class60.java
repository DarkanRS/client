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
		return new IncomingPacket[] { IncomingPacket.IF_SETPLAYERHEAD, IncomingPacket.EMAIL_VALIDITY_RESPONSE, IncomingPacket.PROCESS_DEV_CONSOLE_COMMAND, IncomingPacket.GROUND_ITEM_COUNT, IncomingPacket.UPDATE_ITEM_CONTAINER, IncomingPacket.SEND_ITEM_CONTAINER, IncomingPacket.NPC_UPDATE, IncomingPacket.IF_SETTEXTFONT, IncomingPacket.VARP_2, IncomingPacket.LOGOUT_LOBBY, IncomingPacket.RECIEVE_PRIVATE_MESSAGE, IncomingPacket.aClass375_4362, IncomingPacket.VARC_1, IncomingPacket.aClass375_4365, IncomingPacket.PLAYER_WEIGHT, IncomingPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, IncomingPacket.OPEN_URL, IncomingPacket.aClass375_4368, IncomingPacket.VORBIS_SOUND, IncomingPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, IncomingPacket.aClass375_4402, IncomingPacket.SHOW_FACE_HERE, IncomingPacket.SEND_PRIVATE_QUICKCHAT, IncomingPacket.IF_OPENSUB_ACTIVE_OBJECT, IncomingPacket.CAMERA_LOOK, IncomingPacket.RECIEVE_FRIENDS_CHAT_MESSAGE, IncomingPacket.VARCLAN_SET_LONG, IncomingPacket.CREATE_GROUND_ITEM, IncomingPacket.aClass375_4480, IncomingPacket.PING, IncomingPacket.CHAT_FILTER_SETTINGS, IncomingPacket.RECIEVE_PRIVATE_QUICKCHAT, IncomingPacket.aClass375_4429, IncomingPacket.IF_SETHIDE, IncomingPacket.IF_OPENSUB_ACTIVE_PLAYER, IncomingPacket.IF_SETGRAPHIC, IncomingPacket.aClass375_4397, IncomingPacket.IF_OPENTOP, IncomingPacket.IF_OPENSUB, IncomingPacket.CAMERA_POSITION, IncomingPacket.aClass375_4399, IncomingPacket.UPDATE_ZONE_FULL_FOLLOWS, IncomingPacket.DELETE_ITEM_CONTAINER, IncomingPacket.PLAYER_UPDATE, IncomingPacket.IF_SETANGLE, IncomingPacket.VARCLAN_ENABLE, IncomingPacket.CLANSETTINGS_DELTA, IncomingPacket.NPC_UPDATE_LARGE, IncomingPacket.IF_SETPOSITION, IncomingPacket.CLAN_CHAT_CHANNEL, IncomingPacket.SET_CLAN_STRING, IncomingPacket.DYNAMIC_MAP_REGION, IncomingPacket.aClass375_4499, IncomingPacket.IF_SETPLAYERMODEL_OTHER, IncomingPacket.GLOBAL_STRING_SMALL, IncomingPacket.IF_SETSCROLLPOS, IncomingPacket.PROJANIM_SPECIFIC, IncomingPacket.GRAND_EXCHANGE_SLOT, IncomingPacket.QUICK_HOP_WORLDS, IncomingPacket.IF_OPENSUB_ACTIVE_NPC, IncomingPacket.MUSIC_EFFECT, IncomingPacket.aClass375_4412, IncomingPacket.LOGOUT_FULL, IncomingPacket.MUSIC_TRACK, IncomingPacket.RUN_ENERGY, IncomingPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, IncomingPacket.RESET_CAMERA, IncomingPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT, IncomingPacket.VARPBIT_1, IncomingPacket.DESTROY_OBJECT, IncomingPacket.MINIMAP_FLAG, IncomingPacket.CAMERA_SHAKE, IncomingPacket.IF_SETPLAYERMODEL, IncomingPacket.aClass375_4396, IncomingPacket.FRIEND_STATUS, IncomingPacket.EXECUTE_CS2_SCRIPT_RELATED, IncomingPacket.DEBUG_SERVER_TRIGGERS, IncomingPacket.aClass375_4428, IncomingPacket.IF_CLOSESUB, IncomingPacket.HINT_ICON, IncomingPacket.OBJ_ANIM_SPECIFIC, IncomingPacket.RECIEVE_CLAN_MESSAGE, IncomingPacket.IF_SETANIM, IncomingPacket.QUICKCHAT_RELATED2, IncomingPacket.CUSTOMIZE_OBJECT, IncomingPacket.REGION, IncomingPacket.aClass375_4437, IncomingPacket.SIGNUP_FORM_RESPONSE, IncomingPacket.OBJECT_PREFETCH, IncomingPacket.STOP_CAMERA_SHAKE, IncomingPacket.aClass375_4441, IncomingPacket.UPDATE_SITESETTINGS_COOKIE, IncomingPacket.SEND_PRIVATE_MESSAGE, IncomingPacket.PLAY_SONG_RELATED, IncomingPacket.VARCLAN_DISABLE, IncomingPacket.MAP_PROJANIM_HALFSQ, IncomingPacket.aClass375_4418, IncomingPacket.IGNORE_LIST, IncomingPacket.REFLECTION_CHECK, IncomingPacket.RUN_CS2_SCRIPT, IncomingPacket.CLEAR_VARPS, IncomingPacket.aClass375_4452, IncomingPacket.UPDATE_REBOOT_TIMER, IncomingPacket.WORLD_LIST, IncomingPacket.SOUND_IDX15, IncomingPacket.IF_SETCOLOUR, IncomingPacket.aClass375_4457, IncomingPacket.GROUND_ITEM_REVEAL, IncomingPacket.VARPBIT_2, IncomingPacket.IF_SETNPCHEAD, IncomingPacket.CUTSCENE, IncomingPacket.PLAYER_OPTION, IncomingPacket.IF_SETITEM, IncomingPacket.OBJ_ANIM, IncomingPacket.TILE_MESSAGE, IncomingPacket.VARP_1, IncomingPacket.VARC_2, IncomingPacket.CREATE_OBJECT, IncomingPacket.CAMERA_ROTATION, IncomingPacket.GLOBAL_STRING_BIG, IncomingPacket.RESET_SOUNDS, IncomingPacket.IF_SETCLICKMASK, IncomingPacket.RESET_ALL_ANIMATIONS, IncomingPacket.VARCLAN_SET_BYTE, IncomingPacket.IF_SETTEXT, IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.SPOT_ANIM_SPECIFIC, IncomingPacket.FRIENDS_CHAT_CHANNEL, IncomingPacket.MIDI_SONG_LOCATION, IncomingPacket.aClass375_4364, IncomingPacket.aClass375_4481, IncomingPacket.CLAN_QUICK_MESSAGE, IncomingPacket.aClass375_4483, IncomingPacket.QUICKCHAT_RELATED1, IncomingPacket.aClass375_4453, IncomingPacket.IF_SETMODEL, IncomingPacket.SOUND_SYNTH, IncomingPacket.CLANSETTINGS_FULL, IncomingPacket.ADD_IGNORE, IncomingPacket.SPOT_ANIM, IncomingPacket.UPDATE_STAT, IncomingPacket.VARCLAN_SET_INT, IncomingPacket.RECIEVE_FRIENDS_CHAT_QUICKCHAT, IncomingPacket.MAP_PROJANIM, IncomingPacket.aClass375_4495, IncomingPacket.ANIMATE_NPC, IncomingPacket.aClass375_4497, IncomingPacket.IDENTIFY_HOST_NAME, IncomingPacket.IF_RESETSETCLICKMASK, IncomingPacket.aClass375_5382, IncomingPacket.aClass375_4501, IncomingPacket.PLAYER_UNDER_NPC_PRIORITY, IncomingPacket.PUBLIC_MESSAGE, IncomingPacket.SET_CURSOR, IncomingPacket.BLOCK_MINIMAP_STATE, IncomingPacket.IF_OPENSUB_ACTIVE_GROUNDITEM, IncomingPacket.aClass375_4507, IncomingPacket.aClass375_4508, IncomingPacket.IF_SETPLAYERHEAD_OTHER, IncomingPacket.REQUEST_FPS, IncomingPacket.GAME_MESSAGE,
				IncomingPacket.DISCORD_RICH_PRESENCE_UPDATE };
	}

	public static boolean method1169(char var_0) {
		return var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
	}

	public static void method1170() {
		if (client.aBool7344) {
			IComponentDefinitions icomponentdefinitions_1 = Index.getIComponentDefinitions(client.anInt56, client.anInt7345);
			if (icomponentdefinitions_1 != null && icomponentdefinitions_1.anObjectArray1396 != null) {
				HookRequest hookrequest_2 = new HookRequest();
				hookrequest_2.source = icomponentdefinitions_1;
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
		if (HDWaterTile.SERVER_ENVIRONMENT != ServerEnvironment.LOCAL) {
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
