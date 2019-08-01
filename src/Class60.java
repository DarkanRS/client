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

	public static ServerPacket[] getIncommingPacket() {
		return new ServerPacket[] { ServerPacket.IF_SETPLAYERHEAD, ServerPacket.CREATE_CHECK_EMAIL_REPLY, ServerPacket.PROCESS_DEV_CONSOLE_COMMAND, ServerPacket.GROUND_ITEM_COUNT, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.UPDATE_INV_FULL, ServerPacket.NPC_UPDATE, ServerPacket.IF_SETTEXTFONT, ServerPacket.VARP_LARGE, ServerPacket.LOGOUT_LOBBY, ServerPacket.RECIEVE_PRIVATE_MESSAGE, ServerPacket.aClass375_4362, ServerPacket.CLIENT_SETVARC_LARGE, ServerPacket.aClass375_4365, ServerPacket.PLAYER_WEIGHT, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.OPEN_URL, ServerPacket.aClass375_4368, ServerPacket.VORBIS_SOUND, ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER, ServerPacket.aClass375_4402, ServerPacket.SHOW_FACE_HERE, ServerPacket.SEND_PRIVATE_QUICKCHAT, ServerPacket.IF_OPENSUB_ACTIVE_OBJECT, ServerPacket.CAMERA_LOOK, ServerPacket.RECIEVE_FRIENDS_CHAT_MESSAGE, ServerPacket.VARCLAN_SET_LONG, ServerPacket.CREATE_GROUND_ITEM, ServerPacket.aClass375_4480, ServerPacket.PING, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.RECIEVE_PRIVATE_QUICKCHAT, ServerPacket.aClass375_4429, ServerPacket.IF_SETHIDE, ServerPacket.IF_OPENSUB_ACTIVE_PLAYER, ServerPacket.IF_SETGRAPHIC, ServerPacket.aClass375_4397, ServerPacket.IF_OPENTOP, ServerPacket.IF_OPENSUB, ServerPacket.CAMERA_POSITION, ServerPacket.aClass375_4399, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.UPDATE_INV_STOP_TRANSMIT, ServerPacket.PLAYER_UPDATE, ServerPacket.IF_SETANGLE, ServerPacket.VARCLAN_ENABLE, ServerPacket.CLANSETTINGS_DELTA, ServerPacket.NPC_UPDATE_LARGE, ServerPacket.IF_SETPOSITION, ServerPacket.CLAN_CHAT_CHANNEL, ServerPacket.SET_CLAN_STRING, ServerPacket.DYNAMIC_MAP_REGION, ServerPacket.aClass375_4499, ServerPacket.IF_SETPLAYERMODEL_OTHER, ServerPacket.CLIENT_SETVARCSTR_SMALL, ServerPacket.IF_SETSCROLLPOS, ServerPacket.PROJANIM_SPECIFIC, ServerPacket.GRAND_EXCHANGE_SLOT, ServerPacket.QUICK_HOP_WORLDS, ServerPacket.IF_OPENSUB_ACTIVE_NPC, ServerPacket.MUSIC_EFFECT, ServerPacket.aClass375_4412, ServerPacket.LOGOUT_FULL, ServerPacket.MUSIC_TRACK, ServerPacket.RUN_ENERGY, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.RESET_CAMERA, ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT, ServerPacket.VARBIT_SMALL, ServerPacket.DESTROY_OBJECT, ServerPacket.MINIMAP_FLAG, ServerPacket.CAMERA_SHAKE, ServerPacket.IF_SETPLAYERMODEL, ServerPacket.aClass375_4396, ServerPacket.FRIEND_STATUS, ServerPacket.EXECUTE_CS2_SCRIPT_RELATED, ServerPacket.DEBUG_SERVER_TRIGGERS, ServerPacket.aClass375_4428, ServerPacket.IF_CLOSESUB, ServerPacket.HINT_ICON, ServerPacket.OBJ_ANIM_SPECIFIC, ServerPacket.RECIEVE_CLAN_MESSAGE, ServerPacket.IF_SETANIM, ServerPacket.QUICKCHAT_RELATED2, ServerPacket.CUSTOMIZE_OBJECT, ServerPacket.REGION, ServerPacket.aClass375_4437, ServerPacket.CREATE_ACCOUNT_REPLY, ServerPacket.OBJECT_PREFETCH, ServerPacket.STOP_CAMERA_SHAKE, ServerPacket.aClass375_4441, ServerPacket.UPDATE_SITESETTINGS_COOKIE, ServerPacket.SEND_PRIVATE_MESSAGE, ServerPacket.PLAY_SONG_RELATED, ServerPacket.VARCLAN_DISABLE, ServerPacket.MAP_PROJANIM_HALFSQ, ServerPacket.aClass375_4418, ServerPacket.IGNORE_LIST, ServerPacket.REFLECTION_CHECK, ServerPacket.RUN_CS2_SCRIPT, ServerPacket.CLEAR_VARPS, ServerPacket.aClass375_4452, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.WORLD_LIST, ServerPacket.SOUND_IDX15, ServerPacket.IF_SETCOLOUR, ServerPacket.aClass375_4457, ServerPacket.GROUND_ITEM_REVEAL, ServerPacket.VARBIT_LARGE, ServerPacket.IF_SETNPCHEAD, ServerPacket.CUTSCENE, ServerPacket.PLAYER_OPTION, ServerPacket.IF_SETITEM, ServerPacket.OBJ_ANIM, ServerPacket.TILE_MESSAGE, ServerPacket.VARP_SMALL, ServerPacket.CLIENT_SETVARC_SMALL, ServerPacket.CREATE_OBJECT, ServerPacket.CAMERA_ROTATION, ServerPacket.CLIENT_SETVARCSTR_LARGE, ServerPacket.RESET_SOUNDS, ServerPacket.IF_SETCLICKMASK, ServerPacket.RESET_ALL_ANIMATIONS, ServerPacket.VARCLAN_SET_BYTE, ServerPacket.IF_SETTEXT, ServerPacket.REMOVE_GROUND_ITEM, ServerPacket.SPOT_ANIM_SPECIFIC, ServerPacket.FRIENDS_CHAT_CHANNEL, ServerPacket.MIDI_SONG_LOCATION, ServerPacket.aClass375_4364, ServerPacket.aClass375_4481, ServerPacket.CLAN_QUICK_MESSAGE, ServerPacket.aClass375_4483, ServerPacket.QUICKCHAT_RELATED1, ServerPacket.aClass375_4453, ServerPacket.IF_SETMODEL, ServerPacket.SOUND_SYNTH, ServerPacket.CLANSETTINGS_FULL, ServerPacket.ADD_IGNORE, ServerPacket.SPOT_ANIM, ServerPacket.UPDATE_STAT, ServerPacket.VARCLAN_SET_INT, ServerPacket.RECIEVE_FRIENDS_CHAT_QUICKCHAT, ServerPacket.MAP_PROJANIM, ServerPacket.aClass375_4495, ServerPacket.ANIMATE_NPC, ServerPacket.aClass375_4497, ServerPacket.IDENTIFY_HOST_NAME, ServerPacket.IF_RESETSETCLICKMASK, ServerPacket.aClass375_5382, ServerPacket.aClass375_4501, ServerPacket.PLAYER_UNDER_NPC_PRIORITY, ServerPacket.PUBLIC_MESSAGE, ServerPacket.SET_CURSOR, ServerPacket.BLOCK_MINIMAP_STATE, ServerPacket.IF_OPENSUB_ACTIVE_GROUNDITEM, ServerPacket.aClass375_4507, ServerPacket.aClass375_4508, ServerPacket.IF_SETPLAYERHEAD_OTHER, ServerPacket.REQUEST_FPS, ServerPacket.GAME_MESSAGE,
				ServerPacket.DISCORD_RICH_PRESENCE_UPDATE };
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
