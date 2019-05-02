import java.io.IOException;
import java.lang.reflect.Field;

import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class PacketsDecoder extends Class455 {

	public static int anInt9079;
	int[] anIntArray9077;
	int[] anIntArray9078;

	PacketsDecoder(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		this.anIntArray9077 = ints_3;
		this.anIntArray9078 = ints_4;
	}

	static final boolean method14433(BufferedConnectionContext context) throws IOException {
		Connection connection = context.getConnection();
		RsBitsBuffer buffer = context.recievedBuffer;
		if (connection == null)
			return false;
		if (context.currentPacket == null) {
			if (context.aBool2288) {
				if (!connection.available(1)) {
					return false;
				}
				connection.read(context.recievedBuffer.buffer, 0, 1);
				++context.read;
				context.idleReadPulses = 0;
				context.aBool2288 = false;
			}
			buffer.index = 0;
			if (buffer.nextIsSmart()) {
				if (!connection.available(1)) {
					return false;
				}
				connection.read(context.recievedBuffer.buffer, 1, 1);
				++context.read;
				context.idleReadPulses = 0;
			}
			context.aBool2288 = true;
			IncomingPacket[] arr_4 = Class60.getIncommingPacket();
			int opcode = buffer.readEncryptedSmart();
			if (opcode < 0 || opcode >= arr_4.length) {
				throw new IOException(opcode + " " + buffer.index);
			}
			context.currentPacket = arr_4[opcode];
			context.currentPacketSize = context.currentPacket.size;
		}
		if (context.currentPacketSize == -1) {
			if (!connection.available(1)) {
				return false;
			}
			connection.read(buffer.buffer, 0, 1);
			context.currentPacketSize = buffer.buffer[0] & 0xff;
			++context.read;
			context.idleReadPulses = 0;
		}
		if (context.currentPacketSize == -2) {
			if (!connection.available(2)) {
				return false;
			}
			connection.read(buffer.buffer, 0, 2);
			buffer.index = 0;
			context.currentPacketSize = buffer.readUnsignedShort();
			context.read += 2;
			context.idleReadPulses = 0;
		}
		if (context.currentPacketSize > 0) {
			if (!connection.available(context.currentPacketSize)) {
				return false;
			}
			buffer.index = 0;
			connection.read(buffer.buffer, 0, context.currentPacketSize);
			context.read += context.currentPacketSize;
			context.idleReadPulses = 0;
		}
		context.thirdLastPacket = context.secondLastPacket;
		context.secondLastPacket = context.lastPacket;
		context.lastPacket = context.currentPacket;
		if (context.currentPacket == IncomingPacket.ICOMPONENT_MODEL) {
			int key = buffer.readInt();
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method13786(key, 1, flags, -1, (byte) -45);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PROCESS_DEV_CONSOLE_COMMAND) {
			String string_63 = buffer.readString();
			Class251.handleCommand(string_63, false, false);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SEND_ITEM_CONTAINER) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedByte();
			boolean isNegativeKey = (flags & 0x1) == 1;
			RouteStrategy_Sub5.resetContainer(key, isNegativeKey);
			int size = buffer.readUnsignedShort();
			for (int slot = 0; slot < size; slot++) {
				int amount = buffer.readUnsigned128Byte();
				if (amount == 255) {
					amount = buffer.readIntV2();
				}
				int itemId = buffer.readUnsignedShortLE128();
				Node_Sub21.setItemInContainer(key, slot, itemId - 1, amount, isNegativeKey);
			}
			client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PLAYER_UNDER_NPC_PRIORITY) {
			int key = buffer.readUnsignedByteC();
			Class470.method7825();
			client.anInt7291 = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SET_CURSOR) {
			Class85.aString817 = context.currentPacketSize > 2 ? buffer.readString() : Message.WALK_HERE.translate(Class223.CURRENT_LANGUAGE);
			client.anInt7311 = context.currentPacketSize > 0 ? buffer.readUnsignedShort() : -1;
			if (client.anInt7311 == 65535) {
				client.anInt7311 = -1;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CAMERA_ROTATION) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readUnsignedShortLE128();
			Class470.method7825();
			HostNameIdentifier.method486(flags, key, 0);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.LOGOUT_FULL) {
			CursorIndexLoader.method7333(false, 2061848059);
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.aClass375_4446) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4210, 2050771049);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CLAN_CHAT_CHANNEL) {
			client.anInt7395 = client.anInt7347;
			boolean nonGuest = buffer.readUnsignedByte() == 1;
			if (context.currentPacketSize == 1) {
				if (nonGuest) {
					Class113.CLAN_CHANNEL = null;
				} else {
					Class202_Sub1.GUEST_CLAN_CHANNEL = null;
				}
				context.currentPacket = null;
				return true;
			} else {
				if (nonGuest) {
					Class113.CLAN_CHANNEL = new ClanChannel(buffer);
				} else {
					Class202_Sub1.GUEST_CLAN_CHANNEL = new ClanChannel(buffer);
				}
				context.currentPacket = null;
				return true;
			}
		} else if (context.currentPacket == IncomingPacket.GRAND_EXCHANGE_SLOT) {
			int key = buffer.readUnsignedByte();
			if (buffer.readUnsignedByte() == 0) {
				client.GRAND_EXCHANGE_SLOTS[key] = new GrandExchangeSlot();
			} else {
				--buffer.index;
				client.GRAND_EXCHANGE_SLOTS[key] = new GrandExchangeSlot(buffer);
			}
			client.anInt7320 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_SPRITE_SCALE) {
			int componentHash = buffer.readInt();
			int pitch = buffer.readShortLE();
			int roll = buffer.readShortLE();
			int scale = buffer.readUnsignedShortLE128();
			Class470.method7825();
			PulseEvent.rotateComponentSprite(componentHash, pitch, roll, scale);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_TEXT) {
			String string_63 = buffer.readString();
			int flags = buffer.readIntV1();
			Class470.method7825();
			SunDefinitions.setComponentText(flags, string_63);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.WINDOW_PANE_PACKET) {
			int key = buffer.readIntV1();
			int flags = buffer.readIntV1();
			int i_6 = buffer.readUnsignedShort128();
			int i_7 = buffer.readUnsigned128Byte();
			int i_8 = buffer.readInt();
			int i_9 = buffer.readInt();
			Class470.method7825();
			if (i_7 == 2) {
				ParamIndexLoader.method7081((byte) 18);
			}
			int[] ints_93 = new int[] { i_9, i_8, key, flags };
			client.anInt7349 = i_6;
			ClipMap.method6007(i_6, ints_93, -1517468503);
			Class516.method8867(false);
			Class150.method2582(client.anInt7349, ints_93, -1390726584);
			for (int i_11 = 0; i_11 < 107; i_11++) {
				client.aBoolArray7443[i_11] = true;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4478) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readIntV1();
			int i_6 = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.method13786(flags, 5, key, i_6, (byte) -76);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RESET_CAMERA) {
			Class470.method7825();
			Class514.method8841(1210401894);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.GLOBAL_STRING_SMALL) {
			String string_63 = buffer.readString();
			int flags = buffer.readUnsignedShortLE128();
			Class470.method7825();
			MapRegion.method4562(flags, string_63, -1783534567);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4459) {
			try {
				Class<? extends DiscordRichPresence> presence = client.getPresence().getClass();
				Field f = presence.getDeclaredField(buffer.readString());
				f.setAccessible(true);
				int type = buffer.readInt();
				if (type == 0)
					f.setInt(client.presence, buffer.readInt());
				else if (type == 1)
					f.set(client.presence, buffer.readString());
				else if (type == 2)
					f.setLong(client.presence, buffer.readLong());
				DiscordRPC.discordUpdatePresence(client.getPresence());
			} catch (Throwable e) {
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4416) {
			Class158_Sub1_Sub2.anInt10131 = buffer.read128Byte() << 3;
			Class272.anInt3331 = buffer.readUnsignedByte128();
			SceneObjectType.anInt5495 = buffer.readByte() << 3;
			while (buffer.index < context.currentPacketSize) {
				TilestreamPacket tilestreampacket_68 = Class163.method2842()[buffer.readUnsignedByte()];
				Class188.decodeTilestreamPacket(tilestreampacket_68, 1774288531);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4406) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readInt();
			Class470.method7825();
			PulseEvent.method2966(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RECIEVE_PRIVATE_QUICKCHAT) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			long long_28 = (long) buffer.readUnsignedShort();
			long long_30 = (long) buffer.read24BitUnsignedInteger();
			int i_11 = buffer.readUnsignedByte();
			int i_12 = buffer.readUnsignedShort();
			long long_13 = long_30 + (long_28 << 32);
			boolean bool_73 = false;
			int i_81 = 0;
			while (true) {
				if (i_81 >= 100) {
					if (i_11 <= 1 && Class280.method4975(str_92)) {
						bool_73 = true;
					}
					break;
				}
				if (client.aLongArray7424[i_81] == long_13) {
					bool_73 = true;
					break;
				}
				++i_81;
			}
			if (!bool_73) {
				client.aLongArray7424[client.anInt7389] = long_13;
				client.anInt7389 = (client.anInt7389 + 1) % 100;
				String string_101 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_12).fillDynamicValues(buffer);
				if (i_11 == 2) {
					ChatLine.appendChatMessage(18, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_101, (String) null, i_12);
				} else if (i_11 == 1) {
					ChatLine.appendChatMessage(18, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_101, (String) null, i_12);
				} else {
					ChatLine.appendChatMessage(18, 0, string_88, str_92, string_88, string_101, (String) null, i_12);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4456) {
			int key = buffer.readIntLE();
			int flags = buffer.readUnsignedShort128();
			Class470.method7825();
			PulseEvent.method7374(key, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4433) {
			int key = buffer.readUnsignedShort();
			if (key == 65535) {
				key = -1;
			}
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readUnsignedShort();
			int i_7 = buffer.readUnsignedByte();
			int i_8 = buffer.readUnsignedShort();
			Class435.playSoundVorbis(key, flags, i_6, i_7, false, i_8);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RUN_ENERGY) {
			client.RUN_ENERGY = buffer.readUnsignedByte();
			client.anInt7397 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4379) {
			int key = buffer.readInt();
			int flags = buffer.readUnsignedShortLE128();
			int i_6 = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.method13786(i_6, 3, flags, key, (byte) -84);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SPOTANIM) {
			int key = buffer.readUnsignedByteC();
			int flags = buffer.readUnsignedShort128();
			if (flags == 65535) {
				flags = -1;
			}
			int i_6 = buffer.readUnsignedByteC();
			int i_7 = buffer.readUnsignedShort128();
			int i_8 = buffer.readIntLE();
			int i_9 = buffer.readShortLE();
			int i_10 = i_6 & 0x7;
			int i_11 = i_6 >> 3 & 0xf;
			if (i_11 == 15) {
				i_11 = -1;
			}
			boolean bool_78 = (i_6 >> 7 & 0x1) == 1;
			int i_83;
			if (i_8 >> 30 != 0) {
				CoordGrid coordgrid_33 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
				int i_77 = i_8 >> 28 & 0x3;
				int i_15 = (i_8 >> 14 & 0x3fff) - coordgrid_33.x;
				int i_81 = (i_8 & 0x3fff) - coordgrid_33.y;
				if (i_15 >= 0 && i_81 >= 0 && i_15 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_81 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
					if (flags == -1) {
						CacheableNode_Sub10 class282_sub50_sub10_80 = (CacheableNode_Sub10) client.aClass465_7334.get((long) (i_15 << 16 | i_81));
						if (class282_sub50_sub10_80 != null) {
							class282_sub50_sub10_80.aTransform_Sub1_Sub1_Sub4_9636.method15931(-2031553804);
							class282_sub50_sub10_80.remove();
						}
					} else {
						int i_34 = i_15 * 512 + 256;
						int i_82 = i_81 * 512 + 256;
						i_83 = i_77;
						if (i_77 < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_15, i_81, 1765906120)) {
							i_83 = i_77 + 1;
						}
						Transform_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4_20 = new Transform_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), flags, i_7, i_77, i_83, i_34, Class504.method8389(i_34, i_82, i_77, (byte) 74) - i_9, i_82, i_15, i_15, i_81, i_81, i_10, bool_78);
						client.aClass465_7334.put(new CacheableNode_Sub10(class521_sub1_sub1_sub4_20), (long) (i_15 << 16 | i_81));
					}
				}
			} else if (i_8 >> 29 != 0) {
				int i_35 = i_8 & 0xffff;
				StringNode class282_sub47_116 = (StringNode) client.NPCS.get((long) i_35);
				if (class282_sub47_116 != null) {
					NPC npc_120 = (NPC) class282_sub47_116.anObject8068;
					Class161 class161_104 = npc_120.aClass161Array10339[key];
					if (flags == 65535) {
						flags = -1;
					}
					boolean bool_115 = true;
					int i_82 = class161_104.spotAnimId;
					if (flags != -1 && i_82 != -1) {
						if (flags == i_82) {
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(flags, (byte) -4);
							if (spotanimdefinitions_38.aBool6968 && spotanimdefinitions_38.animationId != -1) {
								AnimationDefinitions animationdefinitions_86 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_38.animationId, (byte) -4);
								int i_21 = animationdefinitions_86.replayMode;
								if (i_21 != 0 && i_21 != 2) {
									if (i_21 == 1) {
										bool_115 = true;
									}
								} else {
									bool_115 = false;
								}
							}
						} else {
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(flags, (byte) 50);
							SpotAnimDefinitions spotanimdefinitions_85 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(i_82, (byte) 100);
							if (spotanimdefinitions_38.animationId != -1 && spotanimdefinitions_85.animationId != -1) {
								AnimationDefinitions animationdefinitions_123 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_38.animationId, (byte) 15);
								AnimationDefinitions animationdefinitions_22 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_85.animationId, (byte) 19);
								if (animationdefinitions_123.priority < animationdefinitions_22.priority) {
									bool_115 = false;
								}
							}
						}
					}
					if (bool_115) {
						class161_104.spotAnimId = flags;
						class161_104.anInt2013 = i_9;
						class161_104.anInt2011 = i_11;
						if (flags != -1) {
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(flags, (byte) -65);
							int i_40 = spotanimdefinitions_38.aBool6968 ? 0 : 2;
							if (bool_78) {
								i_40 = 1;
							}
							class161_104.animation.method7571(spotanimdefinitions_38.animationId, i_7, i_40, false, 1725179623);
						} else {
							class161_104.animation.update(-1);
						}
					}
				}
			} else if (i_8 >> 28 != 0) {
				int i_35 = i_8 & 0xffff;
				Player player_117;
				if (i_35 == client.myPlayerIndex) {
					player_117 = VertexNormal.myPlayer;
				} else {
					player_117 = client.players[i_35];
				}
				if (player_117 != null) {
					Class161 class161_121 = player_117.aClass161Array10339[key];
					if (flags == 65535) {
						flags = -1;
					}
					boolean bool_16 = true;
					int i_34 = class161_121.spotAnimId;
					if (flags != -1 && i_34 != -1) {
						if (i_34 == flags) {
							SpotAnimDefinitions spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(flags, (byte) 39);
							if (spotanimdefinitions_125.aBool6968 && spotanimdefinitions_125.animationId != -1) {
								AnimationDefinitions animationdefinitions_124 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_125.animationId, (byte) 36);
								int i_40 = animationdefinitions_124.replayMode;
								if (i_40 != 0 && i_40 != 2) {
									if (i_40 == 1) {
										bool_16 = true;
									}
								} else {
									bool_16 = false;
								}
							}
						} else {
							SpotAnimDefinitions spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(flags, (byte) -86);
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(i_34, (byte) -10);
							if (spotanimdefinitions_125.animationId != -1 && spotanimdefinitions_38.animationId != -1) {
								AnimationDefinitions animationdefinitions_86 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_125.animationId, (byte) -12);
								AnimationDefinitions animationdefinitions_123 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_38.animationId, (byte) 15);
								if (animationdefinitions_86.priority < animationdefinitions_123.priority) {
									bool_16 = false;
								}
							}
						}
					}
					if (bool_16) {
						class161_121.spotAnimId = flags;
						class161_121.anInt2013 = i_9;
						class161_121.anInt2011 = i_11;
						class161_121.anInt2015 = i_10;
						if (flags != -1) {
							SpotAnimDefinitions spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(flags, (byte) -15);
							i_83 = spotanimdefinitions_125.aBool6968 ? 0 : 2;
							if (bool_78) {
								i_83 = 1;
							}
							class161_121.animation.method7571(spotanimdefinitions_125.animationId, i_7, i_83, false, -948478080);
						} else {
							class161_121.animation.update(-1);
						}
					}
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CAMERA_LOOK) {
			int viewX = buffer.readUnsignedByte();
			int viewY = buffer.readUnsignedShort128() << 2;
			int viewZ = buffer.readUnsignedByte128();
			int i_7 = buffer.readUnsignedByteC();
			int i_8 = buffer.readUnsigned128Byte();
			Class470.method7825();
			Class11.method469(viewX, viewZ, viewY, i_8, i_7, (byte) -10);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4368) {
			int key = buffer.readUnsignedByte();
			int flags = buffer.readUnsignedShort128();
			Class470.method7825();
			Class93.method1575(flags, key, true);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.GAME_MESSAGE) {
			int type = buffer.readUnsignedSmart();
			int effectFlags = buffer.readInt();
			int flags = buffer.readUnsignedByte();
			String nameSimple = "";
			String nameFormatted = nameSimple;
			if ((flags & 0x1) != 0) {
				nameSimple = buffer.readString();
				if ((flags & 0x2) != 0) {
					nameFormatted = buffer.readString();
				} else {
					nameFormatted = nameSimple;
				}
			}
			String message = buffer.readString();
			if (type == 99) {
				Class209.printConsoleMessage(message);
			} else if (type == 98) {
				QuestDefinitions.setConsoleText(message);
			} else {
				if (!nameFormatted.equals("") && Class280.method4975(nameFormatted)) {
					context.currentPacket = null;
					return true;
				}
				ChatLine.appendChatMessage(type, effectFlags, nameSimple, nameFormatted, nameSimple, message);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4439) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4211, 34147700);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.OPEN_URL) {
			if (Class475.supportsFullScreen && client.fullScreenFrame != null) {
				Class440.method7373(Class393.preferences.screenSize.method12687(-2060452662), -1, -1, false, (byte) 2);
			}
			byte[] bytes = new byte[context.currentPacketSize - 1];
			boolean bool_66 = buffer.readUnsignedByte() == 1;
			buffer.readBytes(bytes, context.currentPacketSize - 1);
			RsByteBuffer rsbytebuffer_127 = new RsByteBuffer(bytes);
			String url = rsbytebuffer_127.readString();
			if (bool_66) {
				String string_137 = rsbytebuffer_127.readString();
				if (string_137.length() == 0) {
					string_137 = url;
				}
				if (!client.aBool7310 || RouteStrategy_Sub6.aString8069.startsWith("mac") || !Class186.method3082(url, 1, Class361.aClass361_4179.method6253((byte) -74))) {
					CacheableNode_Sub6.method14788(string_137, true, Class393.preferences.currentToolkit.getValue(111625844) == 5, client.aBool7158, client.aBool7159, (byte) -120);
				}
			} else {
				CacheableNode_Sub6.method14788(url, true, Class393.preferences.currentToolkit.getValue(-1499528045) == 5, client.aBool7158, client.aBool7159, (byte) -96);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CAMERA_SHAKE) {
			int key = buffer.readUnsigned128Byte();
			int flags = buffer.readUnsignedShort();
			int i_6 = buffer.readUnsignedByteC();
			int i_7 = buffer.readUnsignedByteC();
			int i_8 = buffer.readUnsigned128Byte();
			Class470.method7825();
			client.aBoolArray7431[i_6] = true;
			client.anIntArray7268[i_6] = i_7;
			client.anIntArray7433[i_6] = key;
			client.anIntArray7462[i_6] = i_8;
			client.anIntArray7435[i_6] = flags;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4355) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			int i_7 = buffer.readUnsignedByte();
			boolean bool_74 = false;
			if (i_7 <= 1) {
				if ((!client.aBool7224 || client.aBool7244) && !client.IS_QUICKCHAT_ONLY) {
					if (i_7 <= 1 && Class280.method4975(str_92)) {
						bool_74 = true;
					}
				} else {
					bool_74 = true;
				}
			}
			if (!bool_74) {
				String string_135 = Class182.method3044(Defaults7Loader.method8755(buffer));
				if (i_7 == 2) {
					ChatLine.appendChatMessage(24, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_135, (String) null, -1);
				} else if (i_7 == 1) {
					ChatLine.appendChatMessage(24, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_135, (String) null, -1);
				} else {
					ChatLine.appendChatMessage(24, 0, string_88, str_92, string_88, string_135, (String) null, -1);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4434) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			int i_7 = buffer.readUnsignedByte();
			int i_8 = buffer.readUnsignedShort();
			boolean bool_69 = false;
			if (i_7 <= 1 && Class280.method4975(str_92)) {
				bool_69 = true;
			}
			if (!bool_69) {
				String str_25 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_8).fillDynamicValues(buffer);
				if (i_7 == 2) {
					ChatLine.appendChatMessage(25, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, str_25, (String) null, i_8);
				} else if (i_7 == 1) {
					ChatLine.appendChatMessage(25, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, str_25, (String) null, i_8);
				} else {
					ChatLine.appendChatMessage(25, 0, string_88, str_92, string_88, str_25, (String) null, i_8);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SET_PRIVATE_FILTER) {
			Class149_Sub2.PRIVATE_FILTER = Class246.getFriendStatus(buffer.readUnsignedByte());
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ANIMATE_NPC) {
			int npcIndex = buffer.readUnsignedShortLE128();
			int[] animationIds = new int[MovementType.values().length];
			for (int i_6 = 0; i_6 < MovementType.values().length; i_6++) {
				animationIds[i_6] = buffer.readIntLE();
			}
			int speed = buffer.readUnsignedByte();
			StringNode class282_sub47_131 = (StringNode) client.NPCS.get((long) npcIndex);
			if (class282_sub47_131 != null) {
				Class20.animate((Animable) class282_sub47_131.anObject8068, animationIds, speed, true);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_POSITION) {
			int key = buffer.readShort128();
			int flags = buffer.readIntV2();
			int x = buffer.readShortLE128();
			Class470.method7825();
			PulseEvent.setComponentPosition(flags, x, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.DYNAMIC_MAP_REGION) {
			RsBitsBuffer rsbitsbuffer_65 = new RsBitsBuffer(context.currentPacketSize);
			System.arraycopy(context.recievedBuffer.buffer, context.recievedBuffer.index, rsbitsbuffer_65.buffer, 0, context.currentPacketSize);
			FontMetrics.method6989();
			if (Class393.preferences.aPreference_Sub3_8199.method12632(917077703) == 1) {
				IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3155, rsbitsbuffer_65));
			} else {
				IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3155, rsbitsbuffer_65), 1959185438);
			}
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.aClass375_4499) {
			client.aByte7458 = buffer.readByte();
			if (client.aByte7458 == 0 || client.aByte7458 == 1) {
				client.aBool7323 = true;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.NPC_ON_ICOMPONENT) {
			int key = buffer.readIntLE();
			int flags = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.method13786(key, 2, flags, -1, (byte) -52);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PUBLIC_MESSAGE) {
			int playerIndex = buffer.readUnsignedShort();
			Player player;
			if (playerIndex == client.myPlayerIndex) {
				player = VertexNormal.myPlayer;
			} else {
				player = client.players[playerIndex];
			}
			if (player == null) {
				context.currentPacket = null;
				return true;
			} else {
				int chatEffects = buffer.readUnsignedShort();
				int icon = buffer.readUnsignedByte();
				boolean is0x8000 = (chatEffects & 0x8000) != 0;
				if (player.displayName != null && player.playerAppearance != null) {
					boolean bool_69 = false;
					if (icon <= 1) {
						if (!is0x8000 && (client.aBool7224 && !client.aBool7244 || client.IS_QUICKCHAT_ONLY)) {
							bool_69 = true;
						} else if (Class280.method4975(player.displayName)) {
							bool_69 = true;
						}
					}
					if (!bool_69) {
						int qcMessageId = -1;
						String message;
						if (is0x8000) {
							chatEffects &= 0x7fff;
							QuickChatMessage quickchatMessage = Class175.decodeQuickchatMessage(buffer);
							qcMessageId = quickchatMessage.qcMessageId;
							message = quickchatMessage.qcMessageDefs.fillDynamicValues(buffer);
						} else {
							message = Class182.method3044(Defaults7Loader.method8755(buffer));
						}
						player.sendChat(message.trim(), chatEffects >> 8, chatEffects & 0xff);
						int messageType;
						if (icon != 1 && icon != 2) {
							messageType = is0x8000 ? 17 : 2;
						} else {
							messageType = is0x8000 ? 17 : 1;
						}
						if (icon == 2) {
							ChatLine.appendChatMessage(messageType, 0, Class76.getCrown(1) + player.getUsernameWithTitle(), Class76.getCrown(1) + player.getDisplayName(), player.username, message, (String) null, qcMessageId);
						} else if (icon == 1) {
							ChatLine.appendChatMessage(messageType, 0, Class76.getCrown(0) + player.getUsernameWithTitle(), Class76.getCrown(0) + player.getDisplayName(), player.username, message, (String) null, qcMessageId);
						} else {
							ChatLine.appendChatMessage(messageType, 0, player.getUsernameWithTitle(), player.getDisplayName(), player.username, message, (String) null, qcMessageId);
						}
					}
				}
				context.currentPacket = null;
				return true;
			}
		} else if (context.currentPacket == IncomingPacket.QUICK_HOP_WORLDS) {
			int port = buffer.readUnsignedShort();
			String host = buffer.readString();
			boolean reconnecting = buffer.readUnsignedByte() == 1;
			Class448.aClass450_5429 = Class159.GAME_CONNECTION_INFO;
			Class448.aBool5428 = reconnecting;
			Class62.setGameHost(port, host);
			Class365.setGameState(17);
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.LOGOUT_LOBBY) {
			CursorIndexLoader.method7333(Class9.aBool71, 2100753515);
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.GLOBAL_CONFIG_1) {
			int key = buffer.readShortLE();
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method6751(key, flags, -1413337528);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.GROUNDITEM_INTERFACE) {
			int key = buffer.readIntV2();
			int flags = buffer.readIntLE();
			int i_6 = buffer.readShortLE();
			int i_7 = buffer.readInt();
			int i_8 = buffer.readIntV1();
			int i_9 = buffer.readUnsigned128Byte();
			CoordGrid coordgrid_90 = new CoordGrid(buffer.readIntV1());
			int i_11 = buffer.readIntV1();
			int i_12 = buffer.readUnsignedShortLE128();
			Class470.method7825();
			IdentitiKitIndexLoader.method812(key, new Node_Sub44_Sub3(i_6, i_9, new Class520(coordgrid_90, i_12)), new int[] { i_8, i_11, flags, i_7 }, false, (byte) 121);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.FRIENDS_CHAT_CHANNEL) {
			client.anInt7179 = client.anInt7347;
			if (context.currentPacketSize == 0) {
				client.aString7426 = null;
				client.aString7359 = null;
				Class459.anInt5534 = 0;
				Class467.aClass173Array5575 = null;
				context.currentPacket = null;
				return true;
			} else {
				client.aString7359 = buffer.readString();
				boolean bool_91 = buffer.readUnsignedByte() == 1;
				if (bool_91) {
					buffer.readString();
				}
				long long_47 = buffer.readLong();
				client.aString7426 = Class306.method5457(long_47);
				Class412.aByte4963 = buffer.readByte();
				int i_7 = buffer.readUnsignedByte();
				if (i_7 == 255) {
					context.currentPacket = null;
					return true;
				} else {
					Class459.anInt5534 = i_7;
					Class173[] arr_136 = new Class173[100];
					for (int i_9 = 0; i_9 < Class459.anInt5534; i_9++) {
						arr_136[i_9] = new Class173();
						arr_136[i_9].aString2129 = buffer.readString();
						bool_91 = buffer.readUnsignedByte() == 1;
						if (bool_91) {
							arr_136[i_9].aString2127 = buffer.readString();
						} else {
							arr_136[i_9].aString2127 = arr_136[i_9].aString2129;
						}
						arr_136[i_9].aString2128 = Class383.method6515(arr_136[i_9].aString2127);
						arr_136[i_9].anInt2131 = buffer.readUnsignedShort();
						arr_136[i_9].aByte2126 = buffer.readByte();
						arr_136[i_9].aString2130 = buffer.readString();
						if (arr_136[i_9].aString2127.equals(VertexNormal.myPlayer.displayName)) {
							Class48_Sub2.aByte9263 = arr_136[i_9].aByte2126;
						}
					}
					boolean bool_69 = false;
					int i_10 = Class459.anInt5534;
					while (i_10 > 0) {
						bool_69 = true;
						--i_10;
						for (int i_11 = 0; i_11 < i_10; i_11++) {
							if (arr_136[i_11].aString2128.compareTo(arr_136[i_11 + 1].aString2128) > 0) {
								Class173 class173_140 = arr_136[i_11];
								arr_136[i_11] = arr_136[i_11 + 1];
								arr_136[i_11 + 1] = class173_140;
								bool_69 = false;
							}
						}
						if (bool_69) {
							break;
						}
					}
					Class467.aClass173Array5575 = arr_136;
					context.currentPacket = null;
					return true;
				}
			}
		} else if (context.currentPacket == IncomingPacket.STOP_CAMERA_SHAKE) {
			Class470.method7825();
			EntityNode_Sub7.method12606((byte) 81);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SET_CLAN_STRING) {
			int key = buffer.readUnsignedShort();
			String string_88 = buffer.readString();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = string_88;
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.MUSIC_TRACK) {
			int key = buffer.readUnsignedByte128();
			int flags = buffer.readUnsignedByte128();
			int i_6 = buffer.readUnsignedShort128();
			if (i_6 == 65535) {
				i_6 = -1;
			}
			Class42.playSoundSong(i_6, flags, key, (byte) -6);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4501) {
			boolean bool_91 = buffer.readUnsigned128Byte() == 1;
			int flags = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method5924(flags, bool_91);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.MUSIC_EFFECT) {
			int key = buffer.method13132();
			int flags = buffer.readUnsigned128Byte();
			int i_6 = buffer.readShortLE();
			if (i_6 == 65535) {
				i_6 = -1;
			}
			Huffman.playSoundJingle(i_6, key, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SET_FILTERS_MISC) {
			client.TRADE_FILTER = buffer.readUnsignedByteC();
			client.PUBLIC_FILTER = buffer.readUnsignedByte128();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4451) {
			Class158_Sub1.PLAYER_VAR_PROVIDER.method265(1066076779);
			client.anInt7453 += 32;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.TILE_MESSAGE) {
			Class188.decodeTilestreamPacket(TilestreamPacket.TILE_MESSAGE, 844987156);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PLAYER_WEIGHT) {
			client.RUN_WEIGHT = buffer.readShort();
			client.anInt7397 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4399) {
			int key = buffer.readIntLE();
			Class470.method7825();
			if (key == -1) {
				PingRequester.anInt5864 = -1;
				Class86.anInt833 = -1;
			} else {
				CoordGrid coordgrid_114 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
				int i_6 = key >> 14 & 0x3fff;
				int i_7 = key & 0x3fff;
				i_6 -= coordgrid_114.x;
				if (i_6 < 0) {
					i_6 = 0;
				} else if (i_6 >= IndexLoaders.MAP_REGION_DECODER.getSizeX()) {
					i_6 = IndexLoaders.MAP_REGION_DECODER.getSizeX();
				}
				i_7 -= coordgrid_114.y;
				if (i_7 < 0) {
					i_7 = 0;
				} else if (i_7 >= IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
					i_7 = IndexLoaders.MAP_REGION_DECODER.getSizeY();
				}
				PingRequester.anInt5864 = (i_6 << 9) + 256;
				Class86.anInt833 = (i_7 << 9) + 256;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RESET_ALL_ANIMATIONS) {
			for (int key = 0; key < client.players.length; key++) {
				if (client.players[key] != null) {
					client.players[key].currentAnimations = null;
					client.players[key].currentAnimation.update(-1);
				}
			}
			for (int key = 0; key < client.anInt7210; key++) {
				((Animable) client.aNode_Sub47Array7209[key].anObject8068).currentAnimations = null;
				((Animable) client.aNode_Sub47Array7209[key].anObject8068).currentAnimation.update(-1);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CLAN_QUICK_MESSAGE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			long long_49 = (long) buffer.readUnsignedShort();
			long long_51 = (long) buffer.read24BitUnsignedInteger();
			int i_10 = buffer.readUnsignedByte();
			int i_11 = buffer.readUnsignedShort();
			long long_53 = long_51 + (long_49 << 32);
			boolean bool_14 = false;
			ClanChannel class282_sub4_102 = bool_91 ? Class113.CLAN_CHANNEL : Class202_Sub1.GUEST_CLAN_CHANNEL;
			if (class282_sub4_102 == null) {
				bool_14 = true;
			} else {
				label2385: {
					for (int i_34 = 0; i_34 < 100; i_34++) {
						if (long_53 == client.aLongArray7424[i_34]) {
							bool_14 = true;
							break label2385;
						}
					}
					if (i_10 <= 1 && Class280.method4975(string_88)) {
						bool_14 = true;
					}
				}
			}
			if (!bool_14) {
				client.aLongArray7424[client.anInt7389] = long_53;
				client.anInt7389 = (client.anInt7389 + 1) % 100;
				String string_17 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_11).fillDynamicValues(buffer);
				int i_82 = bool_91 ? 42 : 45;
				if (i_10 != 2 && i_10 != 3) {
					if (i_10 == 1) {
						ChatLine.appendChatMessage(i_82, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + string_88, string_88, string_17, class282_sub4_102.clanName, i_11);
					} else {
						ChatLine.appendChatMessage(i_82, 0, string_88, string_88, string_88, string_17, class282_sub4_102.clanName, i_11);
					}
				} else {
					ChatLine.appendChatMessage(i_82, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + string_88, string_88, string_17, class282_sub4_102.clanName, i_11);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4377) {
			int key = buffer.readUnsignedShort();
			long long_47 = buffer.readLong();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = new Long(long_47);
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RECIEVE_FRIENDS_CHAT_QUICKCHAT) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			long long_28 = buffer.readLong();
			long long_30 = (long) buffer.readUnsignedShort();
			long long_55 = (long) buffer.read24BitUnsignedInteger();
			int i_35 = buffer.readUnsignedByte();
			int i_77 = buffer.readUnsignedShort();
			long long_57 = (long_30 << 32) + long_55;
			boolean bool_115 = false;
			int i_82 = 0;
			while (true) {
				if (i_82 >= 100) {
					if (i_35 <= 1 && Class280.method4975(str_92)) {
						bool_115 = true;
					}
					break;
				}
				if (client.aLongArray7424[i_82] == long_57) {
					bool_115 = true;
					break;
				}
				++i_82;
			}
			if (!bool_115) {
				client.aLongArray7424[client.anInt7389] = long_57;
				client.anInt7389 = (client.anInt7389 + 1) % 100;
				String string_41 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(i_77).fillDynamicValues(buffer);
				if (i_35 == 2) {
					ChatLine.appendChatMessage(20, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_41, Class179.method3018(long_28), i_77);
				} else if (i_35 == 1) {
					ChatLine.appendChatMessage(20, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_41, Class179.method3018(long_28), i_77);
				} else {
					ChatLine.appendChatMessage(20, 0, string_88, str_92, string_88, string_41, Class179.method3018(long_28), i_77);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SEND_PRIVATE_QUICKCHAT) {
			String string_63 = buffer.readString();
			int flags = buffer.readUnsignedShort();
			String str_92 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(flags).fillDynamicValues(buffer);
			ChatLine.appendChatMessage(19, 0, string_63, string_63, string_63, str_92, (String) null, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4484) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readInt();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = new Integer(flags);
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SET_LOCAL_REGION) {
			Class158_Sub1_Sub2.anInt10131 = buffer.readByte128() << 3;
			Class272.anInt3331 = buffer.readUnsignedByte128();
			SceneObjectType.anInt5495 = buffer.readByte128() << 3;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_SETTINGS_SET) {
			int toSlot = buffer.readUnsignedShortLE128();
			if (toSlot == 65535) {
				toSlot = -1;
			}
			int interfaceHash = buffer.readIntV2();
			int fromSlot = buffer.readUnsignedShort();
			if (fromSlot == 65535) {
				fromSlot = -1;
			}
			int settings = buffer.readIntLE();
			Class470.method7825();
			for (int slot = fromSlot; slot <= toSlot; slot++) {
				long slots = (long) slot + ((long) interfaceHash << 32);
				IComponentSettings currentSettings = (IComponentSettings) client.ICOMPONENT_SETTINGS_SLOTS.get(slots);
				IComponentSettings newSettings;
				if (currentSettings == null) {
					if (slot == -1) {
						newSettings = new IComponentSettings(settings, IComponentDefinitions.getDefs(interfaceHash).settings.interfaceId);
					} else {
						newSettings = new IComponentSettings(settings, -1);
					}
				} else {
					newSettings = new IComponentSettings(settings, currentSettings.interfaceId);
					currentSettings.remove();
				}
				client.ICOMPONENT_SETTINGS_SLOTS.put(newSettings, slots);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_SETTINGS_RESTORE_DEFAULT) {
			int interfaceHash = buffer.readIntV1();
			int interfaceId = buffer.readUnsignedShortLE128();
			int toSlot = buffer.readUnsignedShort();
			if (toSlot == 65535) {
				toSlot = -1;
			}
			int fromSlot = buffer.readUnsignedShort128();
			if (fromSlot == 65535) {
				fromSlot = -1;
			}
			Class470.method7825();
			for (int slot = fromSlot; slot <= toSlot; slot++) {
				long slots = (long) slot + ((long) interfaceHash << 32);
				IComponentSettings currentSettings = (IComponentSettings) client.ICOMPONENT_SETTINGS_SLOTS.get(slots);
				IComponentSettings newSettings;
				if (currentSettings == null) {
					if (slot == -1) {
						newSettings = new IComponentSettings(IComponentDefinitions.getDefs(interfaceHash).settings.settingsHash, interfaceId);
					} else {
						newSettings = new IComponentSettings(0, interfaceId);
					}
				} else {
					newSettings = new IComponentSettings(currentSettings.settingsHash, interfaceId);
					currentSettings.remove();
				}
				client.ICOMPONENT_SETTINGS_SLOTS.put(newSettings, slots);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4375) {
			int key = buffer.readUnsignedByte();
			int flags = buffer.readBigSmart();
			if (client.aClass281Array7180[key] != null) {
				client.aClass281Array7180[key].method4979(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				client.aClass281Array7180[key] = null;
			}
			if (flags != -1) {
				client.aClass281Array7180[key] = new Class281(Renderers.SOFTWARE_RENDERER, buffer, flags);
				client.aClass281Array7180[key].method4978(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RESET_SOUNDS) {
			Class185.method3077();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.REQUEST_FPS) {
			int key = buffer.readInt();
			int flags = buffer.readInt();
			TCPPacket tcpmessage_111 = Class271.createPacket(OutgoingPacket.SEND_FPS, context.isaac);
			tcpmessage_111.buffer.writeIntV2(key);
			tcpmessage_111.buffer.writeIntV1(flags, -1650869516);
			tcpmessage_111.buffer.write128Byte(client.FPS);
			context.queuePacket(tcpmessage_111);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4464) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4216, 1197049024);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4474) {
			int key = buffer.readUnsignedShort();
			byte b_84 = buffer.readByte();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = new Integer(b_84);
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4458) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4205, 1052430539);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4393) {
			int key = buffer.readUnsignedByteC();
			int flags = buffer.readShortLE();
			boolean isNegativeKey = (key & 0x1) == 1;
			Class29.deleteItemContainer(flags, isNegativeKey);
			client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = flags;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SYSTEM_UPDATE) {
			if (Node_Sub17.lobbyState(client.gameState, -1298993736)) {
				client.anInt7178 = (int) ((float) buffer.readUnsignedShort() * 2.5F);
			} else {
				client.anInt7178 = buffer.readUnsignedShort() * 30;
			}
			client.anInt7397 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4479) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4214, 1188928157);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4392) {
			SceneObjectType.anInt5495 = buffer.read128Byte() << 3;
			Class158_Sub1_Sub2.anInt10131 = buffer.readByte() << 3;
			Class272.anInt3331 = buffer.readUnsignedByte();
			CoordGrid coordgrid_67 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			for (Node_Sub29 class282_sub29_109 = (Node_Sub29) client.aClass465_7414.method7750(-1866877180); class282_sub29_109 != null; class282_sub29_109 = (Node_Sub29) client.aClass465_7414.method7751((byte) 48)) {
				int i_6 = (int) (class282_sub29_109.data >> 28 & 0x3L);
				int i_7 = (int) (class282_sub29_109.data & 0x3fffL);
				int i_8 = i_7 - coordgrid_67.x;
				int i_9 = (int) (class282_sub29_109.data >> 14 & 0x3fffL);
				int i_10 = i_9 - coordgrid_67.y;
				if (i_6 == Class272.anInt3331 && i_8 >= SceneObjectType.anInt5495 && i_8 < SceneObjectType.anInt5495 + 8 && i_10 >= Class158_Sub1_Sub2.anInt10131 && i_10 < Class158_Sub1_Sub2.anInt10131 + 8) {
					class282_sub29_109.remove();
					if (i_8 >= 0 && i_10 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_10 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
						Class434_Sub1.method12760(Class272.anInt3331, i_8, i_10);
					}
				}
			}
			Node_Sub31 class282_sub31_110;
			for (class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7775.head(); class282_sub31_110 != null; class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7775.next(-766641666)) {
				if (class282_sub31_110.anInt7762 >= SceneObjectType.anInt5495 && class282_sub31_110.anInt7762 < SceneObjectType.anInt5495 + 8 && class282_sub31_110.anInt7763 >= Class158_Sub1_Sub2.anInt10131 && class282_sub31_110.anInt7763 < Class158_Sub1_Sub2.anInt10131 + 8 && class282_sub31_110.anInt7764 == Class272.anInt3331) {
					class282_sub31_110.aBool7774 = true;
				}
			}
			for (class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7776.head(); class282_sub31_110 != null; class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7776.next(804942724)) {
				if (class282_sub31_110.anInt7762 >= SceneObjectType.anInt5495 && class282_sub31_110.anInt7762 < SceneObjectType.anInt5495 + 8 && class282_sub31_110.anInt7763 >= Class158_Sub1_Sub2.anInt10131 && class282_sub31_110.anInt7763 < Class158_Sub1_Sub2.anInt10131 + 8 && class282_sub31_110.anInt7764 == Class272.anInt3331) {
					class282_sub31_110.aBool7774 = true;
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SOUND_IDX14) {
			int soundId = buffer.readUnsignedShort();
			if (soundId == 65535) {
				soundId = -1;
			}
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readUnsignedShort();
			int delay = buffer.readUnsignedByte();
			int i_8 = buffer.readUnsignedShort();
			VarNPCMap.playSoundSynth(soundId, flags, i_6, delay, i_8);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4372) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			Class470.method7825();
			CutsceneAction_Sub6.aBool9173 = bool_91;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4441) {
			buffer.index += 28;
			if (buffer.method13105()) {
				ServerEnvironment.method8309(buffer, buffer.index - 28);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.HINT_ICON) {
			int key = buffer.readUnsignedByte();
			int flags = key >> 5;
			int i_6 = key & 0x1f;
			if (i_6 == 0) {
				client.aClass180Array7348[flags] = null;
				context.currentPacket = null;
				return true;
			} else {
				Class180 class180_129 = new Class180();
				class180_129.anInt2236 = i_6;
				class180_129.anInt2240 = buffer.readUnsignedByte();
				if (class180_129.anInt2240 >= 0 && class180_129.anInt2240 < Class391.aNativeSpriteArray4778.length) {
					if (class180_129.anInt2236 != 1 && class180_129.anInt2236 != 10) {
						if (class180_129.anInt2236 >= 2 && class180_129.anInt2236 <= 6) {
							if (class180_129.anInt2236 == 2) {
								class180_129.anInt2243 = 256;
								class180_129.anInt2235 = 256;
							}
							if (class180_129.anInt2236 == 3) {
								class180_129.anInt2243 = 0;
								class180_129.anInt2235 = 256;
							}
							if (class180_129.anInt2236 == 4) {
								class180_129.anInt2243 = 512;
								class180_129.anInt2235 = 256;
							}
							if (class180_129.anInt2236 == 5) {
								class180_129.anInt2243 = 256;
								class180_129.anInt2235 = 0;
							}
							if (class180_129.anInt2236 == 6) {
								class180_129.anInt2243 = 256;
								class180_129.anInt2235 = 512;
							}
							class180_129.anInt2236 = 2;
							class180_129.anInt2239 = buffer.readUnsignedByte();
							CoordGrid coordgrid_133 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
							class180_129.anInt2243 += buffer.readUnsignedShort() - coordgrid_133.x << 9;
							class180_129.anInt2235 += buffer.readUnsignedShort() - coordgrid_133.y << 9;
							class180_129.anInt2241 = buffer.readUnsignedByte() << 2;
							class180_129.anInt2237 = buffer.readUnsignedShort();
						}
					} else {
						class180_129.anInt2238 = buffer.readUnsignedShort();
						class180_129.anInt2244 = buffer.readUnsignedShort();
						buffer.index += 4;
					}
					class180_129.anInt2242 = buffer.readInt();
					client.aClass180Array7348[flags] = class180_129;
				}
				context.currentPacket = null;
				return true;
			}
		} else if (context.currentPacket == IncomingPacket.aClass375_4429) {
			int key = buffer.readUnsignedByte128() * 4;
			int flags = buffer.readShortLE128();
			int i_6 = buffer.readShortLE();
			int i_7 = buffer.readShort();
			int i_8 = buffer.readUnsignedByte128();
			int i_9 = buffer.readUnsignedShort128();
			int i_10 = buffer.readUnsignedShort();
			int i_11 = buffer.readUnsignedShortLE128();
			int i_12 = buffer.readUnsignedShortLE128();
			int i_35 = buffer.readUnsignedByte128();
			if (i_35 == 255) {
				i_35 = -1;
			}
			byte b_75 = buffer.readByteC();
			byte b_79 = buffer.readByteC();
			int i_81 = buffer.readUnsignedShort128();
			int i_34 = buffer.readUnsignedByteC();
			boolean bool_18 = (i_8 & 0x1) != 0;
			boolean bool_19 = (i_8 & 0x2) != 0;
			int i_40 = bool_19 ? i_8 >> 2 : -1;
			if (bool_19) {
				i_34 = (byte) i_34;
			} else {
				i_34 *= 4;
			}
			CoordGrid coordgrid_39 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int i_59 = i_81 - coordgrid_39.x * 2;
			int i_23 = i_9 - coordgrid_39.y * 2;
			int i_77 = b_75 + i_59;
			int i_15 = b_79 + i_23;
			if (i_59 >= 0 && i_23 >= 0 && i_59 < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 2 && i_23 < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 2 && i_77 >= 0 && i_15 >= 0 && i_77 < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 2 && i_15 < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 2 && i_12 != 65535) {
				i_59 *= 256;
				i_23 *= 256;
				i_77 *= 256;
				i_15 *= 256;
				i_34 <<= 2;
				key <<= 2;
				i_10 <<= 2;
				CursorIndexLoader.method7335(i_12, flags, i_7, i_40, i_34, key, i_59, i_23, i_77, i_15, i_11, i_6, i_35, i_10, bool_18);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.WORLD_LIST) {
			boolean refresh = buffer.readUnsignedByte() == 1;
			byte[] data = new byte[context.currentPacketSize - 1];
			buffer.readBytes(data, 0, context.currentPacketSize - 1);
			Class151.decodeWorldList(refresh, data);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.VARPBIT_2) {
			int key = buffer.readIntV2();
			int flags = buffer.readUnsignedShort128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.method268(flags, key, -1714881897);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4362) {
			int key = buffer.readUnsignedShortLE128();
			Class470.method7825();
			Class92.method1563(key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CLAN_SETTINGS) {
			client.anInt7192 = client.anInt7347;
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			if (context.currentPacketSize == 1) {
				if (bool_91) {
					QuickchatFiller.CLAN_SETTINGS = null;
				} else {
					Node_Sub13.GUEST_CLAN_SETTINGS = null;
				}
				context.currentPacket = null;
				return true;
			} else {
				if (bool_91) {
					QuickchatFiller.CLAN_SETTINGS = new ClanSettings(buffer);
				} else {
					Node_Sub13.GUEST_CLAN_SETTINGS = new ClanSettings(buffer);
				}
				context.currentPacket = null;
				return true;
			}
		} else if (context.currentPacket == IncomingPacket.aClass375_4457) {
			int key = buffer.readUnsignedShort();
			Class470.method7825();
			Class123.method2152(key, -1865446551);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.UPDATE_ITEM_CONTAINER) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedByte();
			int i_7, i_8, i_9;
			for (boolean isNegativeKey = (flags & 0x1) == 1; buffer.index < context.currentPacketSize; Node_Sub21.setItemInContainer(key, i_7, i_8 - 1, i_9, isNegativeKey)) {
				i_7 = buffer.readUnsignedSmart();
				i_8 = buffer.readUnsignedShort();
				i_9 = 0;
				if (i_8 != 0) {
					i_9 = buffer.readUnsignedByte();
					if (i_9 == 255) {
						i_9 = buffer.readInt();
					}
				}
			}
			client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PING) {
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.CONFIG_1) {
			byte b_100 = buffer.readByte();
			int flags = buffer.readUnsignedShortLE128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.method281(flags, b_100, (byte) 16);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4359) {
			int key = buffer.readUnsigned128Byte();
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readUnsignedByteC();
			int i_7 = buffer.readInt();
			int i_8 = buffer.readIntV1();
			int i_9 = i_8 >> 28;
			int i_10 = i_8 >> 14 & 0x3fff;
			int i_11 = i_8 & 0x3fff;
			Class320.method5731(i_9, i_10, i_11, key, i_6, i_7, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4497) {
			if (client.anInt7349 != -1) {
				Class383.method6514(client.anInt7349, 0, 1952807696);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4370) {
			String string_63 = buffer.readString();
			boolean bool_66 = buffer.readUnsignedByte() == 1;
			String str_92;
			if (bool_66) {
				str_92 = buffer.readString();
			} else {
				str_92 = string_63;
			}
			int i_7 = buffer.readUnsignedShort();
			byte b_72 = buffer.readByte();
			boolean bool_69 = false;
			if (b_72 == -128) {
				bool_69 = true;
			}
			int i_11;
			if (bool_69) {
				if (Class459.anInt5534 == 0) {
					context.currentPacket = null;
					return true;
				}
				for (i_11 = 0; i_11 < Class459.anInt5534 && (!Class467.aClass173Array5575[i_11].aString2127.equals(str_92) || i_7 != Class467.aClass173Array5575[i_11].anInt2131); i_11++) {
					;
				}
				if (i_11 < Class459.anInt5534) {
					while (i_11 < Class459.anInt5534 - 1) {
						Class467.aClass173Array5575[i_11] = Class467.aClass173Array5575[i_11 + 1];
						++i_11;
					}
					--Class459.anInt5534;
					Class467.aClass173Array5575[Class459.anInt5534] = null;
				}
			} else {
				String str_25 = buffer.readString();
				Class173 class173_138 = new Class173();
				class173_138.aString2129 = string_63;
				class173_138.aString2127 = str_92;
				class173_138.aString2128 = Class383.method6515(class173_138.aString2127);
				class173_138.anInt2131 = i_7;
				class173_138.aByte2126 = b_72;
				class173_138.aString2130 = str_25;
				int i_12;
				for (i_12 = Class459.anInt5534 - 1; i_12 >= 0; --i_12) {
					int i_35 = Class467.aClass173Array5575[i_12].aString2128.compareTo(class173_138.aString2128);
					if (i_35 == 0) {
						Class467.aClass173Array5575[i_12].anInt2131 = i_7;
						Class467.aClass173Array5575[i_12].aByte2126 = b_72;
						Class467.aClass173Array5575[i_12].aString2130 = str_25;
						if (str_92.equals(VertexNormal.myPlayer.displayName)) {
							Class48_Sub2.aByte9263 = b_72;
						}
						client.anInt7179 = client.anInt7347;
						context.currentPacket = null;
						return true;
					}
					if (i_35 < 0) {
						break;
					}
				}
				if (Class459.anInt5534 >= Class467.aClass173Array5575.length) {
					context.currentPacket = null;
					return true;
				}
				for (int i_35 = Class459.anInt5534 - 1; i_35 > i_12; --i_35) {
					Class467.aClass173Array5575[i_35 + 1] = Class467.aClass173Array5575[i_35];
				}
				if (Class459.anInt5534 == 0) {
					Class467.aClass173Array5575 = new Class173[100];
				}
				Class467.aClass173Array5575[i_12 + 1] = class173_138;
				++Class459.anInt5534;
				if (str_92.equals(VertexNormal.myPlayer.displayName)) {
					Class48_Sub2.aByte9263 = b_72;
				}
			}
			client.anInt7179 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.HIDE_ICOMPONENT) {
			int key = buffer.readUnsignedByte128();
			int flags = buffer.readInt();
			Class470.method7825();
			PulseEvent.method14663(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4480) {
			client.anInt7395 = client.anInt7347;
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			Class349 class349_105 = new Class349(buffer);
			ClanChannel class282_sub4_108;
			if (bool_91) {
				class282_sub4_108 = Class113.CLAN_CHANNEL;
			} else {
				class282_sub4_108 = Class202_Sub1.GUEST_CLAN_CHANNEL;
			}
			class349_105.method6179(class282_sub4_108);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.REGION) {
			RsBitsBuffer rsbitsbuffer_65 = new RsBitsBuffer(context.currentPacketSize);
			System.arraycopy(context.recievedBuffer.buffer, context.recievedBuffer.index, rsbitsbuffer_65.buffer, 0, context.currentPacketSize);
			FontMetrics.method6989();
			if (Class393.preferences.aPreference_Sub3_8199.method12632(621836544) == 1) {
				IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3158, rsbitsbuffer_65));
			} else {
				IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3158, rsbitsbuffer_65), 1089182926);
			}
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.REMOVE_GROUND_ITEM) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4207, 915834659);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_ANIMATION) {
			int key = buffer.readIntV2();
			int flags = buffer.readInt();
			Class470.method7825();
			PulseEvent.method3069(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4351) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4218, 385099520);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4381) {
			int key = buffer.readIntV2();
			int flags = buffer.readUnsignedShortLE128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.method281(flags, key, (byte) -17);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CLOSE_CHILDREN) {
			int parentInterface = buffer.readInt();
			Class470.method7825();
			Node_Sub44 class282_sub44_103 = (Node_Sub44) client.aClass465_7442.get((long) parentInterface);
			if (class282_sub44_103 != null) {
				Class351.closeChildren(class282_sub44_103, true, false, -1452683291);
			}
			if (client.aClass118_7352 != null) {
				Class109.redrawComponent(client.aClass118_7352);
				client.aClass118_7352 = null;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SKILL_LEVEL) {
			int xp = buffer.readInt();
			int skillId = buffer.readUnsignedByte();
			int level = buffer.readUnsignedByte();
			client.SKILL_XP[skillId] = xp;
			client.SKILL_LEVEL_VISIBLE[skillId] = level;
			client.SKILL_LEVEL_ACTUAL[skillId] = 1;
			int maxLevel = Class516.SKILL_MAX_LEVEL[skillId] - 1;
			for (int i = 0; i < maxLevel; i++) {
				if (xp >= Class516.SKILL_XP_FOR_LEVEL[i]) {
					client.SKILL_LEVEL_ACTUAL[skillId] = i + 2;
				}
			}
			client.anIntArray7283[++client.anInt7384 - 1 & 0x1f] = skillId;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4453) {
			byte b_100 = buffer.readByte();
			int flags = buffer.readUnsignedByteC();
			Class470.method7825();
			Class52_Sub2.method14501(b_100, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4440) {
			Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4495) {
			int key = buffer.readIntV2();
			int flags = buffer.readShortLE();
			int i_6 = buffer.readShortLE();
			int i_7 = buffer.readUnsignedByte();
			Class470.method7825();
			PulseEvent.method8722(key, i_7, flags, i_6);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4397) {
			boolean bool_91 = buffer.readUnsigned128Byte() == 1;
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method3252(flags, bool_91);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4352) {
			int key = buffer.readUnsignedByte();
			Class466 class466_98 = (Class466) Class386.identify(Class335.method5963(), key);
			if (class466_98 == null) {
				class466_98 = Class466.aClass466_5563;
			}
			JS5CacheRequest.method14949(class466_98);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4508) {
			Class504.anInt5832 = buffer.read24BitInteger(1949038328);
			client.aBool7224 = buffer.readUnsignedByte() == 1;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.NPC_INTERFACE) {
			int key = buffer.readIntLE();
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readIntV1();
			int i_7 = buffer.readUnsignedShort();
			int i_8 = buffer.readInt();
			int i_9 = buffer.readIntV1();
			int i_10 = buffer.readIntV1();
			int i_11 = buffer.readShortLE();
			Class470.method7825();
			IdentitiKitIndexLoader.method812(i_9, new Node_Sub44_Sub2(i_7, flags, i_11), new int[] { i_6, i_8, i_10, key }, false, (byte) 25);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4502) {
			client.anInt7192 = client.anInt7347;
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			Class348 class348_97 = new Class348(buffer);
			ClanSettings class61_99;
			if (bool_91) {
				class61_99 = QuickchatFiller.CLAN_SETTINGS;
			} else {
				class61_99 = Node_Sub13.GUEST_CLAN_SETTINGS;
			}
			class348_97.method6173(class61_99);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.MINIMAP_FLAG) {
			int key = buffer.readUnsigned128Byte();
			int flags = buffer.readUnsigned128Byte();
			if (key == 255) {
				key = -1;
				flags = -1;
			}
			PulseEvent.method11155(key, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.BLOCK_MINIMAP_STATE) {
			Class187.anInt2363 = buffer.readUnsignedByte();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4402) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method15381(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.INTERFACE) {
			int key = buffer.readInt();
			int flags = buffer.readIntV2();
			int i_6 = buffer.readIntV2();
			int i_7 = buffer.readUnsignedShortLE128();
			int i_8 = buffer.readIntLE();
			int i_9 = buffer.readInt();
			int i_10 = buffer.readUnsignedByteC();
			Class470.method7825();
			IdentitiKitIndexLoader.method812(i_9, new Node_Sub44(i_7, i_10), new int[] { key, i_6, flags, i_8 }, false, (byte) 25);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4438) {
			int key = buffer.readUnsignedByte();
			Class494 class494_96 = (Class494) Class386.identify(UnderlayIndexLoader.method8038(), key);
			if (class494_96 == null) {
				class494_96 = Class494.aClass494_5782;
			}
			Preference_Sub26.method12948(class494_96);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PLAYER_OPTION) {
			String option = buffer.readString();
			int slot = buffer.readUnsignedByte128();
			int cursor = buffer.readUnsignedShortLE128();
			if (cursor == 65535) {
				cursor = -1;
			}
			int onTop = buffer.readUnsignedByteC();
			if (slot >= 1 && slot <= 8) {
				if (option.equalsIgnoreCase("null")) {
					option = null;
				}
				client.PLAYER_OPTIONS[slot - 1] = option;
				client.PLAYER_OPTION_CURSORS[slot - 1] = cursor;
				client.PLAYER_OPTION_REDUCED_PRIORITY[slot - 1] = onTop == 0;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_ITEM) {
			int itemId = buffer.readUnsignedShort();
			if (itemId == 65535) {
				itemId = -1;
			}
			int interfaceHash = buffer.readInt();
			int amount = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.setComponentItem(interfaceHash, itemId, amount);
			ItemDefinitions defs = IndexLoaders.ITEM_LOADER.getItemDefinitions(itemId);
			PulseEvent.rotateComponentSprite(interfaceHash, defs.modelRotationX, defs.modelRotationY, defs.modelZoom);
			PulseEvent.method778(interfaceHash, defs.modelOffsetX, defs.modelOffsetY, defs.modelRotationZ);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4481) {
			int key = buffer.readShortLE();
			int flags = buffer.readUnsignedShort128();
			int i_6 = buffer.readUnsignedShort128();
			int i_7 = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method13786(i_7, 7, key << 16 | i_6, flags, (byte) -41);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4354) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4204, 1220604522);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4423) {
			int key = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.method13786(key, 5, client.myPlayerIndex, 0, (byte) -60);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4428) {
			int key = buffer.readUnsignedShortLE128();
			if (key == 65535) {
				key = -1;
			}
			Class332.method5930(key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4492) {
			int key = buffer.readUnsignedShort();
			Whirlpool.method7421(key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CREATE_OBJECT) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4208, 428929195);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SEND_PRIVATE_MESSAGE) {
			String string_63 = buffer.readString();
			String string_88 = Class182.method3044(Defaults7Loader.method8755(buffer));
			ChatLine.appendChatMessage(6, 0, string_63, string_63, string_63, string_88);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CREATE_GROUND_ITEM) {
			Class188.decodeTilestreamPacket(TilestreamPacket.CREATE_GROUND_ITEM, 894121342);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4452) {
			client.anInt7434 = 1;
			client.anInt7386 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PLAYER_ON_ICOMPONENT) {
			int key = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method13786(key, 3, client.myPlayerIndex, 0, (byte) -81);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4426) {
			int key = buffer.readIntLE();
			if (key != Class354.anInt4112) {
				Class354.anInt4112 = key;
				HitsplatIndexLoader.method3614(Class397.aClass397_4812, -1, -1, (byte) 95);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.REFLECTION_CHECK) {
			JS5StandardRequester.method5560(buffer, context.currentPacketSize);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.VARPBIT_1) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedByte128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.method268(key, flags, -1140695527);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RECIEVE_PRIVATE_MESSAGE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			long long_28 = (long) buffer.readUnsignedShort();
			long long_30 = (long) buffer.read24BitUnsignedInteger();
			int i_11 = buffer.readUnsignedByte();
			long long_53 = (long_28 << 32) + long_30;
			boolean bool_14 = false;
			int i_15 = 0;
			while (true) {
				if (i_15 >= 100) {
					if (i_11 <= 1) {
						if ((!client.aBool7224 || client.aBool7244) && !client.IS_QUICKCHAT_ONLY) {
							if (Class280.method4975(str_92)) {
								bool_14 = true;
							}
						} else {
							bool_14 = true;
						}
					}
					break;
				}
				if (client.aLongArray7424[i_15] == long_53) {
					bool_14 = true;
					break;
				}
				++i_15;
			}
			if (!bool_14) {
				client.aLongArray7424[client.anInt7389] = long_53;
				client.anInt7389 = (client.anInt7389 + 1) % 100;
				String string_118 = Class182.method3044(Defaults7Loader.method8755(buffer));
				if (i_11 == 2) {
					ChatLine.appendChatMessage(7, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_118, (String) null, -1);
				} else if (i_11 == 1) {
					ChatLine.appendChatMessage(7, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_118, (String) null, -1);
				} else {
					ChatLine.appendChatMessage(3, 0, string_88, str_92, string_88, string_118, (String) null, -1);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.GLOBAL_CONFIG_2) {
			byte b_100 = buffer.read128Byte();
			int flags = buffer.readShortLE();
			Class470.method7825();
			PulseEvent.method6751(flags, b_100, 1876892604);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CONFIG_2) {
			int key = buffer.readInt();
			int flags = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.method15435(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_SPRITE) {
			int key = buffer.readIntV2();
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method7917(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4396) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedShort();
			int i_6 = buffer.readUnsignedShort();
			Class470.method7825();
			int i_8;
			if (Preference_Sub8.INTERFACES[key] != null) {
				for (int i_7 = flags; i_7 < i_6; i_7++) {
					i_8 = buffer.read24BitUnsignedInteger();
					if (i_7 < Preference_Sub8.INTERFACES[key].components.length && Preference_Sub8.INTERFACES[key].components[i_7] != null) {
						Preference_Sub8.INTERFACES[key].components[i_7].anInt1414 = i_8;
					}
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CUSTOMIZE_OBJECT) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4209, 408109448);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PLAYER_UPDATE) {
			PlayerUpdate.decode(buffer, context.currentPacketSize);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CAMERA_POSITION) {
			int key = buffer.readUnsignedByte();
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readUnsigned128Byte();
			int i_7 = buffer.readShortLE() << 2;
			int i_8 = buffer.readUnsignedByte128();
			Class470.method7825();
			RouteStrategy.method3794(flags, key, i_7, i_6, i_8, true);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RECIEVE_CLAN_MESSAGE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			long long_49 = (long) buffer.readUnsignedShort();
			long long_51 = (long) buffer.read24BitUnsignedInteger();
			int i_10 = buffer.readUnsignedByte();
			long long_55 = long_51 + (long_49 << 32);
			boolean bool_112 = false;
			ClanChannel class282_sub4_37 = bool_91 ? Class113.CLAN_CHANNEL : Class202_Sub1.GUEST_CLAN_CHANNEL;
			if (class282_sub4_37 == null) {
				bool_112 = true;
			} else {
				label2419: {
					for (int i_81 = 0; i_81 < 100; i_81++) {
						if (client.aLongArray7424[i_81] == long_55) {
							bool_112 = true;
							break label2419;
						}
					}
					if (i_10 <= 1) {
						if ((!client.aBool7224 || client.aBool7244) && !client.IS_QUICKCHAT_ONLY) {
							if (Class280.method4975(string_88)) {
								bool_112 = true;
							}
						} else {
							bool_112 = true;
						}
					}
				}
			}
			if (!bool_112) {
				client.aLongArray7424[client.anInt7389] = long_55;
				client.anInt7389 = (client.anInt7389 + 1) % 100;
				String string_101 = Class182.method3044(Defaults7Loader.method8755(buffer));
				int i_34 = bool_91 ? 41 : 44;
				if (i_10 != 2 && i_10 != 3) {
					if (i_10 == 1) {
						ChatLine.appendChatMessage(i_34, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + string_88, string_88, string_101, class282_sub4_37.clanName, -1);
					} else {
						ChatLine.appendChatMessage(i_34, 0, string_88, string_88, string_88, string_101, class282_sub4_37.clanName, -1);
					}
				} else {
					ChatLine.appendChatMessage(i_34, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + string_88, string_88, string_101, class282_sub4_37.clanName, -1);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4507) {
			byte[] bytes_64 = new byte[context.currentPacketSize];
			buffer.readBytes(bytes_64, context.currentPacketSize);
			String string_88 = Utils.readString(bytes_64, 0, context.currentPacketSize);
			if (client.aBool7310) {
				try {
					Class361.aClass361_4180.method6254(new Object[] { string_88 }, (byte) 51);
				} catch (Throwable throwable_62) {
					;
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PROJECTILE) {
			Class188.decodeTilestreamPacket(TilestreamPacket.PROJECTILE, 1406697126);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4442) {
			Class516.method8868(buffer.readString());
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4412) {
			client.aBool7454 = buffer.readUnsignedByte128() == 1;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.FRIEND_STATUS) {
			while (buffer.index < context.currentPacketSize) {
				boolean bool_91 = buffer.readUnsignedByte() == 1;
				String string_88 = buffer.readString();
				String str_92 = buffer.readString();
				int i_7 = buffer.readUnsignedShort();
				int i_8 = buffer.readUnsignedByte();
				boolean bool_69 = buffer.readUnsignedByte() == 1;
				String str_25 = "";
				int i_11 = -1;
				int i_12 = 0;
				if (i_7 > 0) {
					str_25 = buffer.readString();
					i_11 = buffer.readUnsignedByte();
					i_12 = buffer.readInt();
				}
				for (int i_35 = 0; i_35 < client.anInt7449; i_35++) {
					Class6 class6_113 = client.aClass6Array7452[i_35];
					if (!bool_91) {
						if (string_88.equals(class6_113.aString37)) {
							if (i_7 != class6_113.anInt39) {
								boolean bool_73 = true;
								for (EntityNode_Sub4 class275_sub4_32 = (EntityNode_Sub4) client.aClass457_7350.method7659(); class275_sub4_32 != null; class275_sub4_32 = (EntityNode_Sub4) client.aClass457_7350.method7650((byte) 73)) {
									if (class275_sub4_32.aString7837.equals(string_88)) {
										if (i_7 != 0 && class275_sub4_32.aShort7839 == 0) {
											class275_sub4_32.method4887();
											bool_73 = false;
										} else if (i_7 == 0 && class275_sub4_32.aShort7839 != 0) {
											class275_sub4_32.method4887();
											bool_73 = false;
										}
									}
								}
								if (bool_73) {
									client.aClass457_7350.offer(new EntityNode_Sub4(string_88, i_7), 1701737919);
								}
								class6_113.anInt39 = i_7;
							}
							class6_113.aString43 = str_92;
							class6_113.aString40 = str_25;
							class6_113.anInt41 = i_8;
							class6_113.anInt42 = i_11;
							class6_113.aBool38 = bool_69;
							class6_113.anInt44 = i_12;
							string_88 = null;
							break;
						}
					} else if (str_92.equals(class6_113.aString37)) {
						class6_113.aString37 = string_88;
						class6_113.aString43 = str_92;
						string_88 = null;
						break;
					}
				}
				if (string_88 != null && client.anInt7449 < 200) {
					Class6 class6_106 = new Class6();
					client.aClass6Array7452[client.anInt7449] = class6_106;
					class6_106.aString37 = string_88;
					class6_106.aString43 = str_92;
					class6_106.anInt39 = i_7;
					class6_106.aString40 = str_25;
					class6_106.anInt41 = i_8;
					class6_106.anInt42 = i_11;
					class6_106.aBool38 = bool_69;
					class6_106.anInt44 = i_12;
					++client.anInt7449;
				}
			}
			client.anInt7434 = 2;
			client.anInt7386 = client.anInt7347;
			boolean bool_91 = false;
			int flags = client.anInt7449;
			while (flags > 0) {
				bool_91 = true;
				--flags;
				for (int i_6 = 0; i_6 < flags; i_6++) {
					boolean bool_70 = false;
					Class6 class6_132 = client.aClass6Array7452[i_6];
					Class6 class6_134 = client.aClass6Array7452[i_6 + 1];
					if (class6_132.anInt39 != Class159.GAME_CONNECTION_INFO.worldId && class6_134.anInt39 == Class159.GAME_CONNECTION_INFO.worldId) {
						bool_70 = true;
					}
					if (!bool_70 && class6_132.anInt39 == 0 && class6_134.anInt39 != 0) {
						bool_70 = true;
					}
					if (!bool_70 && !class6_132.aBool38 && class6_134.aBool38) {
						bool_70 = true;
					}
					if (bool_70) {
						Class6 class6_87 = client.aClass6Array7452[i_6];
						client.aClass6Array7452[i_6] = client.aClass6Array7452[i_6 + 1];
						client.aClass6Array7452[i_6 + 1] = class6_87;
						bool_91 = false;
					}
				}
				if (bool_91) {
					break;
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.IDENTIFY_HOST_NAME) {
			int ip = buffer.readInt();
			Class119.HOSTNAME_IDENTIFIER = new HostNameIdentifier(ip);
			Thread thread_94 = new Thread(Class119.HOSTNAME_IDENTIFIER);
			thread_94.setPriority(1);
			thread_94.start();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4365) {
			int interfaceHash = buffer.readIntV2();
			int flags = buffer.readInt();
			Class470.method7825();
			Node_Sub44 class282_sub44_95 = (Node_Sub44) client.aClass465_7442.get((long) flags);
			Node_Sub44 class282_sub44_126 = (Node_Sub44) client.aClass465_7442.get((long) interfaceHash);
			if (class282_sub44_126 != null) {
				Class351.closeChildren(class282_sub44_126, class282_sub44_95 == null || class282_sub44_95.anInt8063 != class282_sub44_126.anInt8063, false, -1298031252);
			}
			if (class282_sub44_95 != null) {
				class282_sub44_95.remove();
				client.aClass465_7442.put(class282_sub44_95, (long) interfaceHash);
			}
			IComponentDefinitions icomponentdefinitions_130 = IComponentDefinitions.getDefs(flags);
			if (icomponentdefinitions_130 != null) {
				Class109.redrawComponent(icomponentdefinitions_130);
			}
			icomponentdefinitions_130 = IComponentDefinitions.getDefs(interfaceHash);
			if (icomponentdefinitions_130 != null) {
				Class109.redrawComponent(icomponentdefinitions_130);
				HostNameIdentifier.method483(Preference_Sub8.INTERFACES[icomponentdefinitions_130.idHash >>> 16], icomponentdefinitions_130, true, -460404316);
			}
			if (client.anInt7349 != -1) {
				Class383.method6514(client.anInt7349, 1, 1200373841);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.CUTSCENE) {
			int key = buffer.readUnsignedShort();
			client.anInt7357 = -1;
			client.CURRENT_CUTSCENE = key;
			client.anInt7341 = 3;
			IndexLoaders.CUTSCENE_INDEX.loadFile(client.CURRENT_CUTSCENE);
			Class316.method5594();
			HitsplatDefinitions.method3851();
			int flags = buffer.readUnsignedShort();
			NativeLibraryLoader.anIntArrayArray3239 = new int[flags][4];
			for (int i_6 = 0; i_6 < flags; i_6++) {
				for (int i_7 = 0; i_7 < 4; i_7++) {
					NativeLibraryLoader.anIntArrayArray3239[i_6][i_7] = buffer.readInt();
				}
			}
			int i_6 = buffer.readUnsignedByte();
			Class276.aNode_Sub35_3346 = new RsByteBuffer(i_6);
			Class276.aNode_Sub35_3346.writeBytes(buffer.buffer, buffer.index, i_6);
			buffer.index += i_6;
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == IncomingPacket.DESTROY_OBJECT) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4213, 1743263242);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ICOMPONENT_CONFIG) {
			int key = buffer.readInt();
			boolean bool_66 = buffer.readUnsignedByteC() == 1;
			if (bool_66 != Class469.aBool5585 || key != KeyHoldInputSubscriber.anInt2879) {
				Class469.aBool5585 = bool_66;
				KeyHoldInputSubscriber.anInt2879 = key;
				HitsplatIndexLoader.method3614(Class397.aClass397_4803, -1, -1, (byte) 27);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.PLAYER_INTERFACE) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readIntLE();
			int i_6 = buffer.readUnsignedByteC();
			int i_7 = buffer.readInt();
			int i_8 = buffer.readIntLE();
			int i_9 = buffer.readUnsignedShortLE128();
			int i_10 = buffer.readInt();
			int i_11 = buffer.readInt();
			Class470.method7825();
			IdentitiKitIndexLoader.method812(i_7, new Node_Sub44_Sub1(i_9, i_6, key), new int[] { i_11, flags, i_10, i_8 }, false, (byte) 46);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.ADD_IGNORE) {
			int key = buffer.readUnsignedByte();
			boolean bool_66 = (key & 0x1) == 1;
			String str_92 = buffer.readString();
			String string_42 = buffer.readString();
			if (!bool_66) {
				Class10 class10_43 = new Class10();
				client.aClass10Array7456[client.anInt7373] = class10_43;
				class10_43.aString115 = str_92;
				class10_43.aString116 = string_42;
				class10_43.aBool117 = (key & 0x2) == 2;
				++client.anInt7373;
			} else {
				for (int i_8 = 0; i_8 < client.anInt7373; i_8++) {
					Class10 class10_44 = client.aClass10Array7456[i_8];
					if (string_42.equals(class10_44.aString115)) {
						class10_44.aString115 = str_92;
						class10_44.aString116 = string_42;
						break;
					}
				}
			}
			client.anInt7386 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.GLOBAL_STRING_BIG) {
			int key = buffer.readShortLE();
			String string_88 = buffer.readString();
			Class470.method7825();
			MapRegion.method4562(key, string_88, -1183230823);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.NPC_UPDATE) {
			NPCUpdate.decode(false);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RECIEVE_FRIENDS_CHAT_MESSAGE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			long long_28 = buffer.readLong();
			long long_30 = (long) buffer.readUnsignedShort();
			long long_55 = (long) buffer.read24BitUnsignedInteger();
			int i_35 = buffer.readUnsignedByte();
			long long_60 = (long_30 << 32) + long_55;
			boolean bool_16 = false;
			int i_34 = 0;
			while (true) {
				if (i_34 >= 100) {
					if (i_35 <= 1) {
						if ((!client.aBool7224 || client.aBool7244) && !client.IS_QUICKCHAT_ONLY) {
							if (Class280.method4975(str_92)) {
								bool_16 = true;
							}
						} else {
							bool_16 = true;
						}
					}
					break;
				}
				if (long_60 == client.aLongArray7424[i_34]) {
					bool_16 = true;
					break;
				}
				++i_34;
			}
			if (!bool_16) {
				client.aLongArray7424[client.anInt7389] = long_60;
				client.anInt7389 = (client.anInt7389 + 1) % 100;
				String string_17 = Class182.method3044(Defaults7Loader.method8755(buffer));
				if (i_35 != 2 && i_35 != 3) {
					if (i_35 == 1) {
						ChatLine.appendChatMessage(9, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_17, Class179.method3018(long_28), -1);
					} else {
						ChatLine.appendChatMessage(9, 0, string_88, str_92, string_88, string_17, Class179.method3018(long_28), -1);
					}
				} else {
					ChatLine.appendChatMessage(9, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_17, Class179.method3018(long_28), -1);
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.OBJECT_ANIMATION) {
			int key = buffer.readIntV2();
			int flags = key >> 28 & 0x3;
			int i_6 = key >> 14 & 0x3fff;
			int i_7 = key & 0x3fff;
			int i_8 = buffer.readIntLE();
			int i_9 = buffer.readUnsigned128Byte();
			int i_10 = i_9 >> 2;
			int i_11 = i_9 & 0x3;
			int i_12 = client.anIntArray7230[i_10];
			CoordGrid coordgrid_33 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			i_6 -= coordgrid_33.x;
			i_7 -= coordgrid_33.y;
			Class9.animateObject(flags, i_6, i_7, i_12, i_10, i_11, i_8);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.SOUND_IDX15) {
			int key = buffer.readUnsignedShort();
			if (key == 65535) {
				key = -1;
			}
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readUnsignedShort();
			int i_7 = buffer.readUnsignedByte();
			Class435.playSoundVorbis(key, flags, i_6, i_7, true, 256);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.IGNORE_LIST) {
			client.anInt7373 = buffer.readUnsignedByte();
			for (int key = 0; key < client.anInt7373; key++) {
				Class10 class10_89 = new Class10();
				client.aClass10Array7456[key] = class10_89;
				class10_89.aString115 = buffer.readString();
				class10_89.aString116 = buffer.readString();
				class10_89.aBool117 = false;
			}
			client.anInt7386 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4483) {
			int key = buffer.readShortLE();
			int flags = buffer.readUnsignedShort();
			int i_6 = buffer.readUnsigned128Byte();
			int i_7 = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method12420(i_7, i_6, flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4364) {
			client.anInt7162 = buffer.method13121();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.OBJECT_INTERFACE) {
			int key = buffer.readIntV2();
			int flags = buffer.readIntV2();
			int i_6 = buffer.readUnsignedByte128();
			int i_7 = buffer.readInt();
			int i_8 = buffer.readIntV1();
			int i_9 = buffer.readUnsignedShort128();
			int i_10 = buffer.readUnsigned128Byte();
			int i_11 = i_10 >> 2;
			int i_12 = i_10 & 0x3;
			int i_35 = buffer.readInt();
			CoordGrid coordgrid_36 = new CoordGrid(buffer.readIntV2());
			int i_15 = buffer.readInt();
			Class470.method7825();
			IdentitiKitIndexLoader.method812(key, new Node_Sub44_Sub4(i_9, i_6, new Class530(coordgrid_36, i_11, i_12, i_15)), new int[] { i_8, i_7, flags, i_35 }, false, (byte) 10);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4445) {
			Class46.CLAN_VARS = null;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4437) {
			if (Class475.supportsFullScreen && client.fullScreenFrame != null) {
				Class440.method7373(Class393.preferences.screenSize.method12687(-1706994104), -1, -1, false, (byte) 30);
			}
			byte[] bytes_64 = new byte[context.currentPacketSize];
			buffer.readBytes(bytes_64, context.currentPacketSize);
			String string_88 = Utils.readString(bytes_64, 0, context.currentPacketSize);
			String str_92 = "opensn";
			if (!client.aBool7310 || !Class186.method3082(string_88, 1, str_92)) {
				PingRequester.method8736(string_88, true, Class393.preferences.currentToolkit.getValue(-780399145) == 5, str_92, client.aBool7158, client.aBool7159, (byte) -17);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.aClass375_4418) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readIntV2();
			int i_6 = buffer.readShortLE();
			Class470.method7825();
			PulseEvent.method12882(flags, key + (i_6 << 16));
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.RUN_CS2_SCRIPT) {
			String string_63 = buffer.readString();
			Object[] arr_26 = new Object[string_63.length() + 1];
			for (int i_6 = string_63.length() - 1; i_6 >= 0; --i_6) {
				if (string_63.charAt(i_6) == 115) {
					arr_26[i_6 + 1] = buffer.readString();
				} else {
					arr_26[i_6 + 1] = new Integer(buffer.readInt());
				}
			}
			arr_26[0] = new Integer(buffer.readInt());
			Class470.method7825();
			HookRequest hookrequest_27 = new HookRequest();
			hookrequest_27.params = arr_26;
			CS2Executor.executeHookInner200k(hookrequest_27, 502538057);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == IncomingPacket.NPC_UPDATE_LARGE) {
			NPCUpdate.decode(true);
			context.currentPacket = null;
			return true;
		} else {
			Class151.method2594((context.currentPacket != null ? context.currentPacket.opcode : -1) + "," + (context.secondLastPacket != null ? context.secondLastPacket.opcode : -1) + "," + (context.thirdLastPacket != null ? context.thirdLastPacket.opcode : -1) + " " + context.currentPacketSize, new RuntimeException(), (byte) -73);
			CursorIndexLoader.method7333(false, 2095335662);
			return true;
		}
	}
}
