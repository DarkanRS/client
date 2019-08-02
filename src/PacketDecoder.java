import java.io.IOException;
import java.lang.reflect.Field;

import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class PacketDecoder {

	static final boolean decode(BufferedConnectionContext context) throws IOException {
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
			ServerPacket[] arr_4 = Class60.getIncommingPacket();
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
		if (context.currentPacket == ServerPacket.IF_SETMODEL) {
			int key = buffer.readInt();
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.setIFContent(key, 1, flags, -1, (byte) -45);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.PROCESS_DEV_CONSOLE_COMMAND) {
			String string_63 = buffer.readString();
			RouteFinder.handleCommand(string_63, false, false);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_INV_FULL) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedByte();
			boolean isNegativeKey = (flags & 0x1) == 1;
			NormalObjectStrategy.resetContainer(key, isNegativeKey);
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
		} else if (context.currentPacket == ServerPacket.PLAYER_UNDER_NPC_PRIORITY) {
			int key = buffer.readUnsignedByteC();
			Class470.method7825();
			client.anInt7291 = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SET_CURSOR) {
			Class85.aString817 = context.currentPacketSize > 2 ? buffer.readString() : Message.WALK_HERE.translate(Class223.CURRENT_LANGUAGE);
			client.anInt7311 = context.currentPacketSize > 0 ? buffer.readUnsignedShort() : -1;
			if (client.anInt7311 == 65535) {
				client.anInt7311 = -1;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CAMERA_ROTATION) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readUnsignedShortLE128();
			Class470.method7825();
			HostNameIdentifier.method486(flags, key, 0);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.LOGOUT_FULL) {
			CursorIndexLoader.method7333(false, 2061848059);
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == ServerPacket.MAP_PROJANIM_HALFSQ) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.MAP_PROJANIM_HALFSQ);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CLAN_CHAT_CHANNEL) {
			client.anInt7395 = client.anInt7347;
			boolean nonGuest = buffer.readUnsignedByte() == 1;
			if (context.currentPacketSize == 1) {
				if (nonGuest) {
					Class113.CLAN_CHANNEL = null;
				} else {
					AsyncConnection.GUEST_CLAN_CHANNEL = null;
				}
				context.currentPacket = null;
				return true;
			} else {
				if (nonGuest) {
					Class113.CLAN_CHANNEL = new ClanChannel(buffer);
				} else {
					AsyncConnection.GUEST_CLAN_CHANNEL = new ClanChannel(buffer);
				}
				context.currentPacket = null;
				return true;
			}
		} else if (context.currentPacket == ServerPacket.GRAND_EXCHANGE_SLOT) {
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
		} else if (context.currentPacket == ServerPacket.IF_SETANGLE) {
			int componentHash = buffer.readInt();
			int pitch = buffer.readShortLE();
			int roll = buffer.readShortLE();
			int scale = buffer.readUnsignedShortLE128();
			Class470.method7825();
			PulseEvent.rotateComponentSprite(componentHash, pitch, roll, scale);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETTEXT) {
			String string_63 = buffer.readString();
			int flags = buffer.readIntV1();
			Class470.method7825();
			SunDefinitions.setComponentText(flags, string_63);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_OPENTOP) {
			int key = buffer.readIntV1();
			int flags = buffer.readIntV1();
			int windowId = buffer.readUnsignedShort128();
			int type = buffer.readUnsigned128Byte();
			int i_8 = buffer.readInt();
			int i_9 = buffer.readInt();
			Class470.method7825();
			if (type == 2) {
				ParamIndexLoader.method7081((byte) 18);
			}
			int[] xteas = new int[] { i_9, i_8, key, flags };
			client.BASE_WINDOW_ID = windowId;
			ClipMap.method6007(windowId, xteas, -1517468503);
			Class516.method8867(false);
			Class150.method2582(client.BASE_WINDOW_ID, xteas, -1390726584);
			for (int i_11 = 0; i_11 < 107; i_11++) {
				client.aBoolArray7443[i_11] = true;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETPLAYERMODEL_OTHER) {
			int key = buffer.readUnsignedShort128();
			int interHash = buffer.readIntV1();
			int i_6 = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.setIFContent(interHash, 5, key, i_6, (byte) -76);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RESET_CAMERA) {
			Class470.method7825();
			Class514.method8841(1210401894);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CLIENT_SETVARCSTR_SMALL) {
			String string_63 = buffer.readString();
			int flags = buffer.readUnsignedShortLE128();
			Class470.method7825();
			MapRegion.method4562(flags, string_63, -1783534567);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.DISCORD_RICH_PRESENCE_UPDATE) {
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
		} else if (context.currentPacket == ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED) {
			Class158_Sub1_Sub2.UPDATE_ZONE_Y = buffer.read128Byte() << 3;
			Class272.UPDATE_ZONE_PLANE = buffer.readUnsignedByte128();
			Static.UPDATE_ZONE_X = buffer.readByte() << 3;
			while (buffer.index < context.currentPacketSize) {
				UpdateZonePacket tilestreampacket_68 = UpdateZonePacket.values()[buffer.readUnsignedByte()];
				PacketDecoder.decodeTilestreamPacket(tilestreampacket_68);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETSCROLLPOS) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readInt();
			Class470.method7825();
			PulseEvent.method2966(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RECIEVE_PRIVATE_QUICKCHAT) {
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
					if (i_11 <= 1 && Class280.isIgnored(str_92)) {
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
		} else if (context.currentPacket == ServerPacket.IF_SETCOLOUR) {
			int key = buffer.readIntLE();
			int flags = buffer.readUnsignedShort128();
			Class470.method7825();
			PulseEvent.method7374(key, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VORBIS_SOUND) {
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
		} else if (context.currentPacket == ServerPacket.RUN_ENERGY) {
			client.RUN_ENERGY = buffer.readUnsignedByte();
			client.anInt7397 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETPLAYERHEAD_OTHER) {
			int key = buffer.readInt();
			int flags = buffer.readUnsignedShortLE128();
			int i_6 = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.setIFContent(i_6, 3, flags, key, (byte) -84);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SPOT_ANIM_SPECIFIC) {
			int idk = buffer.readUnsignedByteC();
			int spotAnimId = buffer.readUnsignedShort128();
			if (spotAnimId == 65535) {
				spotAnimId = -1;
			}
			int settings = buffer.readUnsignedByteC();
			int speed = buffer.readUnsignedShort128();
			int targetHash = buffer.readIntLE();
			int height = buffer.readShortLE();
			int rotation = settings & 0x7;
			int setting1 = settings >> 3 & 0xf;
			if (setting1 == 15) {
				setting1 = -1;
			}
			boolean setting2 = (settings >> 7 & 0x1) == 1;
			if (targetHash >> 30 != 0) {
				CoordGrid coordgrid_33 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
				int fromPlane = targetHash >> 28 & 0x3;
				int x = (targetHash >> 14 & 0x3fff) - coordgrid_33.x;
				int y = (targetHash & 0x3fff) - coordgrid_33.y;
				if (x >= 0 && y >= 0 && x < IndexLoaders.MAP_REGION_DECODER.getSizeX() && y < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
					if (spotAnimId == -1) {
						CacheableNode_Sub10 class282_sub50_sub10_80 = (CacheableNode_Sub10) client.aClass465_7334.get((long) (x << 16 | y));
						if (class282_sub50_sub10_80 != null) {
							class282_sub50_sub10_80.aTransform_Sub1_Sub1_Sub4_9636.method15931(-2031553804);
							class282_sub50_sub10_80.remove();
						}
					} else {
						int tileX = x * 512 + 256;
						int tileY = y * 512 + 256;
						int toPlane = fromPlane;
						if (fromPlane < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(x, y, 1765906120)) {
							toPlane = fromPlane + 1;
						}
						SpotAnim spotAnim = new SpotAnim(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), spotAnimId, speed, fromPlane, toPlane, tileX, Class504.getTerrainHeightAtPos(tileX, tileY, fromPlane) - height, tileY, x, x, y, y, rotation, setting2);
						client.aClass465_7334.put(new CacheableNode_Sub10(spotAnim), (long) (x << 16 | y));
					}
				}
			} else if (targetHash >> 29 != 0) {
				int i_35 = targetHash & 0xffff;
				StringNode class282_sub47_116 = (StringNode) client.NPCS.get((long) i_35);
				if (class282_sub47_116 != null) {
					NPC npc_120 = (NPC) class282_sub47_116.anObject8068;
					Class161 class161_104 = npc_120.aClass161Array10339[idk];
					if (spotAnimId == 65535) {
						spotAnimId = -1;
					}
					boolean bool_115 = true;
					int i_82 = class161_104.spotAnimId;
					if (spotAnimId != -1 && i_82 != -1) {
						if (spotAnimId == i_82) {
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) -4);
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
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) 50);
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
						class161_104.spotAnimId = spotAnimId;
						class161_104.anInt2013 = height;
						class161_104.anInt2011 = setting1;
						if (spotAnimId != -1) {
							SpotAnimDefinitions spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) -65);
							int i_40 = spotanimdefinitions_38.aBool6968 ? 0 : 2;
							if (setting2) {
								i_40 = 1;
							}
							class161_104.animation.animateFull(spotanimdefinitions_38.animationId, speed, i_40, false, 1725179623);
						} else {
							class161_104.animation.update(-1);
						}
					}
				}
			} else if (targetHash >> 28 != 0) {
				int i_35 = targetHash & 0xffff;
				Player player_117;
				if (i_35 == client.myPlayerIndex) {
					player_117 = VertexNormal.MY_PLAYER;
				} else {
					player_117 = client.players[i_35];
				}
				if (player_117 != null) {
					Class161 class161_121 = player_117.aClass161Array10339[idk];
					if (spotAnimId == 65535) {
						spotAnimId = -1;
					}
					boolean bool_16 = true;
					int i_34 = class161_121.spotAnimId;
					if (spotAnimId != -1 && i_34 != -1) {
						if (i_34 == spotAnimId) {
							SpotAnimDefinitions spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) 39);
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
							SpotAnimDefinitions spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) -86);
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
						class161_121.spotAnimId = spotAnimId;
						class161_121.anInt2013 = height;
						class161_121.anInt2011 = setting1;
						class161_121.anInt2015 = rotation;
						if (spotAnimId != -1) {
							SpotAnimDefinitions spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId, (byte) -15);
							int i_83 = spotanimdefinitions_125.aBool6968 ? 0 : 2;
							if (setting2) {
								i_83 = 1;
							}
							class161_121.animation.animateFull(spotanimdefinitions_125.animationId, speed, i_83, false, -948478080);
						} else {
							class161_121.animation.update(-1);
						}
					}
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CAMERA_LOOK) {
			int viewX = buffer.readUnsignedByte();
			int viewY = buffer.readUnsignedShort128() << 2;
			int viewZ = buffer.readUnsignedByte128();
			int i_7 = buffer.readUnsignedByteC();
			int i_8 = buffer.readUnsigned128Byte();
			Class470.method7825();
			Class11.method469(viewX, viewZ, viewY, i_8, i_7, (byte) -10);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4368) {
			int key = buffer.readUnsignedByte();
			int flags = buffer.readUnsignedShort128();
			Class470.method7825();
			Class93.method1575(flags, key, true);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.GAME_MESSAGE) {
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
				if (!nameFormatted.equals("") && Class280.isIgnored(nameFormatted)) {
					context.currentPacket = null;
					return true;
				}
				ChatLine.appendChatMessage(type, effectFlags, nameSimple, nameFormatted, nameSimple, message);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.OBJECT_PREFETCH) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.OBJECT_PREFETCH);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.OPEN_URL) {
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
				if (!client.aBool7310 || GroundItemStrategy.aString8069.startsWith("mac") || !Class186.method3082(url, 1, Class361.aClass361_4179.method6253((byte) -74))) {
					CacheableNode_Sub6.method14788(string_137, true, Class393.preferences.currentToolkit.getValue(111625844) == 5, client.aBool7158, client.aBool7159, (byte) -120);
				}
			} else {
				CacheableNode_Sub6.method14788(url, true, Class393.preferences.currentToolkit.getValue(-1499528045) == 5, client.aBool7158, client.aBool7159, (byte) -96);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CAMERA_SHAKE) {
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
		} else if (context.currentPacket == ServerPacket.QUICKCHAT_RELATED1) {
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
					if (i_7 <= 1 && Class280.isIgnored(str_92)) {
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
		} else if (context.currentPacket == ServerPacket.QUICKCHAT_RELATED2) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			String str_92 = string_88;
			if (bool_91) {
				str_92 = buffer.readString();
			}
			int i_7 = buffer.readUnsignedByte();
			int i_8 = buffer.readUnsignedShort();
			boolean bool_69 = false;
			if (i_7 <= 1 && Class280.isIgnored(str_92)) {
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
		} else if (context.currentPacket == ServerPacket.CHAT_FILTER_SETTINGS_PRIVATECHAT) {
			Class149_Sub2.PRIVATE_FILTER = Class246.getFriendStatus(buffer.readUnsignedByte());
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.ANIMATE_NPC) {
			int npcIndex = buffer.readUnsignedShortLE128();
			int[] animationIds = new int[MovementType.values().length];
			for (int i_6 = 0; i_6 < MovementType.values().length; i_6++) {
				animationIds[i_6] = buffer.readIntLE();
			}
			int speed = buffer.readUnsignedByte();
			StringNode class282_sub47_131 = (StringNode) client.NPCS.get((long) npcIndex);
			if (class282_sub47_131 != null) {
				Class20.animate((Entity) class282_sub47_131.anObject8068, animationIds, speed, true);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETPOSITION) {
			int key = buffer.readShort128();
			int flags = buffer.readIntV2();
			int x = buffer.readShortLE128();
			Class470.method7825();
			PulseEvent.setComponentPosition(flags, x, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.DYNAMIC_MAP_REGION) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4499) {
			client.aByte7458 = buffer.readByte();
			if (client.aByte7458 == 0 || client.aByte7458 == 1) {
				client.aBool7323 = true;
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETNPCHEAD) {
			int key = buffer.readIntLE();
			int flags = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.setIFContent(key, 2, flags, -1, (byte) -52);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.PUBLIC_MESSAGE) {
			int playerIndex = buffer.readUnsignedShort();
			Player player;
			if (playerIndex == client.myPlayerIndex) {
				player = VertexNormal.MY_PLAYER;
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
						} else if (Class280.isIgnored(player.displayName)) {
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
		} else if (context.currentPacket == ServerPacket.QUICK_HOP_WORLDS) {
			int port = buffer.readUnsignedShort();
			String host = buffer.readString();
			boolean reconnecting = buffer.readUnsignedByte() == 1;
			Class448.aClass450_5429 = Class159.GAME_CONNECTION_INFO;
			Class448.aBool5428 = reconnecting;
			Class62.setGameHost(port, host);
			Class365.setGameState(17);
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == ServerPacket.LOGOUT_LOBBY) {
			CursorIndexLoader.method7333(Class9.aBool71, 2100753515);
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == ServerPacket.CLIENT_SETVARC_LARGE) {
			int key = buffer.readShortLE();
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method6751(key, flags, -1413337528);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_OPENSUB_ACTIVE_GROUNDITEM) {
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
		} else if (context.currentPacket == ServerPacket.FRIENDS_CHAT_CHANNEL) {
			client.anInt7179 = client.anInt7347;
			if (context.currentPacketSize == 0) {
				client.FC_NAME = null;
				client.FC_OWNER_NAME = null;
				Class459.FC_PLAYER_COUNT = 0;
				Class467.FC_PLAYERS = null;
				context.currentPacket = null;
				return true;
			} else {
				client.FC_OWNER_NAME = buffer.readString();
				boolean isOwner = buffer.readUnsignedByte() == 1;
				if (isOwner) {
					buffer.readString();
				}
				long long_47 = buffer.readLong();
				client.FC_NAME = Utils.getStringFromLong(long_47);
				Class412.FC_MIN_RANK_CAN_KICK = buffer.readByte();
				int i_7 = buffer.readUnsignedByte();
				if (i_7 == 255) {
					context.currentPacket = null;
					return true;
				} else {
					Class459.FC_PLAYER_COUNT = i_7;
					FriendsChatPlayer[] fcPlayers = new FriendsChatPlayer[100];
					for (int i_9 = 0; i_9 < Class459.FC_PLAYER_COUNT; i_9++) {
						fcPlayers[i_9] = new FriendsChatPlayer();
						fcPlayers[i_9].displayName = buffer.readString();
						boolean changedName = buffer.readUnsignedByte() == 1;
						if (changedName) {
							fcPlayers[i_9].username = buffer.readString();
						} else {
							fcPlayers[i_9].username = fcPlayers[i_9].displayName;
						}
						fcPlayers[i_9].textName = Class383.method6515(fcPlayers[i_9].username);
						fcPlayers[i_9].worldId = buffer.readUnsignedShort();
						fcPlayers[i_9].rank = buffer.readByte();
						fcPlayers[i_9].worldName = buffer.readString();
						if (fcPlayers[i_9].username.equals(VertexNormal.MY_PLAYER.displayName)) {
							Class48_Sub2.MY_PLAYER_FC_RANK = fcPlayers[i_9].rank;
						}
					}
					boolean bool_69 = false;
					int i_10 = Class459.FC_PLAYER_COUNT;
					while (i_10 > 0) {
						bool_69 = true;
						--i_10;
						for (int i_11 = 0; i_11 < i_10; i_11++) {
							if (fcPlayers[i_11].textName.compareTo(fcPlayers[i_11 + 1].textName) > 0) {
								FriendsChatPlayer class173_140 = fcPlayers[i_11];
								fcPlayers[i_11] = fcPlayers[i_11 + 1];
								fcPlayers[i_11 + 1] = class173_140;
								bool_69 = false;
							}
						}
						if (bool_69) {
							break;
						}
					}
					Class467.FC_PLAYERS = fcPlayers;
					context.currentPacket = null;
					return true;
				}
			}
		} else if (context.currentPacket == ServerPacket.STOP_CAMERA_SHAKE) {
			Class470.method7825();
			EntityNode_Sub7.method12606((byte) 81);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SET_CLAN_STRING) {
			int key = buffer.readUnsignedShort();
			String string_88 = buffer.readString();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = string_88;
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.MUSIC_TRACK) {
			int key = buffer.readUnsignedByte128();
			int flags = buffer.readUnsignedByte128();
			int i_6 = buffer.readUnsignedShort128();
			if (i_6 == 65535) {
				i_6 = -1;
			}
			Class42.playSoundSong(i_6, flags, key, (byte) -6);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4501) {
			boolean bool_91 = buffer.readUnsigned128Byte() == 1;
			int flags = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method5924(flags, bool_91);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.MUSIC_EFFECT) {
			int key = buffer.method13132();
			int flags = buffer.readUnsigned128Byte();
			int i_6 = buffer.readShortLE();
			if (i_6 == 65535) {
				i_6 = -1;
			}
			Huffman.playSoundJingle(i_6, key, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CHAT_FILTER_SETTINGS) {
			client.TRADE_FILTER = buffer.readUnsignedByteC();
			client.PUBLIC_FILTER = buffer.readUnsignedByte128();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CLEAR_VARPS) {
			Class158_Sub1.PLAYER_VAR_PROVIDER.method265(1066076779);
			client.anInt7453 += 32;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.TILE_MESSAGE) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.TILE_MESSAGE);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.PLAYER_WEIGHT) {
			client.RUN_WEIGHT = buffer.readShort();
			client.anInt7397 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4399) {
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
		} else if (context.currentPacket == ServerPacket.RESET_ALL_ANIMATIONS) {
			for (int key = 0; key < client.players.length; key++) {
				if (client.players[key] != null) {
					client.players[key].currentAnimations = null;
					client.players[key].currentAnimation.update(-1);
				}
			}
			for (int key = 0; key < client.anInt7210; key++) {
				((Entity) client.aNode_Sub47Array7209[key].anObject8068).currentAnimations = null;
				((Entity) client.aNode_Sub47Array7209[key].anObject8068).currentAnimation.update(-1);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CLAN_QUICK_MESSAGE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			long long_49 = (long) buffer.readUnsignedShort();
			long long_51 = (long) buffer.read24BitUnsignedInteger();
			int i_10 = buffer.readUnsignedByte();
			int i_11 = buffer.readUnsignedShort();
			long long_53 = long_51 + (long_49 << 32);
			boolean bool_14 = false;
			ClanChannel class282_sub4_102 = bool_91 ? Class113.CLAN_CHANNEL : AsyncConnection.GUEST_CLAN_CHANNEL;
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
					if (i_10 <= 1 && Class280.isIgnored(string_88)) {
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
		} else if (context.currentPacket == ServerPacket.VARCLAN_SET_LONG) {
			int key = buffer.readUnsignedShort();
			long long_47 = buffer.readLong();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = new Long(long_47);
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RECIEVE_FRIENDS_CHAT_QUICKCHAT) {
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
					if (i_35 <= 1 && Class280.isIgnored(str_92)) {
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
		} else if (context.currentPacket == ServerPacket.SEND_PRIVATE_QUICKCHAT) {
			String string_63 = buffer.readString();
			int flags = buffer.readUnsignedShort();
			String str_92 = IndexLoaders.QUICK_CHAT_MESSAGE_LOADER.getMessageDefinitions(flags).fillDynamicValues(buffer);
			ChatLine.appendChatMessage(19, 0, string_63, string_63, string_63, str_92, (String) null, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VARCLAN_SET_INT) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readInt();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = new Integer(flags);
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_ZONE_FULL_FOLLOWS) { 
			Class158_Sub1_Sub2.UPDATE_ZONE_Y = buffer.readByte128() << 3;
			Class272.UPDATE_ZONE_PLANE = buffer.readUnsignedByte128();
			Static.UPDATE_ZONE_X = buffer.readByte128() << 3;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETCLICKMASK) {
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
		} else if (context.currentPacket == ServerPacket.IF_RESETSETCLICKMASK) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_5382) {
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
		} else if (context.currentPacket == ServerPacket.RESET_SOUNDS) {
			Class185.resetSounds();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.REQUEST_FPS) {
			int key = buffer.readInt();
			int flags = buffer.readInt();
			TCPPacket tcpmessage_111 = Class271.createPacket(ClientPacket.SEND_FPS, context.isaac);
			tcpmessage_111.buffer.writeIntV2(key);
			tcpmessage_111.buffer.writeIntV1(flags, -1650869516);
			tcpmessage_111.buffer.write128Byte(client.FPS);
			context.queuePacket(tcpmessage_111);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.OBJ_ANIM) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.OBJ_ANIM);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VARCLAN_SET_BYTE) {
			int key = buffer.readUnsignedShort();
			byte b_84 = buffer.readByte();
			if (Class46.CLAN_VARS == null) {
				Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			}
			Class46.CLAN_VARS[key] = new Integer(b_84);
			client.CLAN_VAR_KEYS[++client.CLAN_VAR_COUNTER - 1 & 0x1f] = key;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.GROUND_ITEM_REVEAL) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.GROUND_ITEM_REVEAL);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_INV_STOP_TRANSMIT) {
			int key = buffer.readUnsignedByteC();
			int flags = buffer.readShortLE();
			boolean isNegativeKey = (key & 0x1) == 1;
			Class29.deleteItemContainer(flags, isNegativeKey);
			client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = flags;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_REBOOT_TIMER) {
			if (Node_Sub17.lobbyState(client.gameState, -1298993736)) {
				client.REBOOT_TIMER = (int) ((float) buffer.readUnsignedShort() * 2.5F);
			} else {
				client.REBOOT_TIMER = buffer.readUnsignedShort() * 30;
			}
			client.anInt7397 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.MIDI_SONG_LOCATION) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.MIDI_SONG_LOCATION);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS) {
			Static.UPDATE_ZONE_X = buffer.read128Byte() << 3;
			Class158_Sub1_Sub2.UPDATE_ZONE_Y = buffer.readByte() << 3;
			Class272.UPDATE_ZONE_PLANE = buffer.readUnsignedByte();
			CoordGrid coordgrid_67 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			for (Node_Sub29 class282_sub29_109 = (Node_Sub29) client.aClass465_7414.method7750(-1866877180); class282_sub29_109 != null; class282_sub29_109 = (Node_Sub29) client.aClass465_7414.method7751((byte) 48)) {
				int i_6 = (int) (class282_sub29_109.data >> 28 & 0x3L);
				int i_7 = (int) (class282_sub29_109.data & 0x3fffL);
				int i_8 = i_7 - coordgrid_67.x;
				int i_9 = (int) (class282_sub29_109.data >> 14 & 0x3fffL);
				int i_10 = i_9 - coordgrid_67.y;
				if (i_6 == Class272.UPDATE_ZONE_PLANE && i_8 >= Static.UPDATE_ZONE_X && i_8 < Static.UPDATE_ZONE_X + 8 && i_10 >= Class158_Sub1_Sub2.UPDATE_ZONE_Y && i_10 < Class158_Sub1_Sub2.UPDATE_ZONE_Y + 8) {
					class282_sub29_109.remove();
					if (i_8 >= 0 && i_10 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_10 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
						Class434_Sub1.method12760(Class272.UPDATE_ZONE_PLANE, i_8, i_10);
					}
				}
			}
			Node_Sub31 class282_sub31_110;
			for (class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7775.head(); class282_sub31_110 != null; class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7775.next(-766641666)) {
				if (class282_sub31_110.anInt7762 >= Static.UPDATE_ZONE_X && class282_sub31_110.anInt7762 < Static.UPDATE_ZONE_X + 8 && class282_sub31_110.anInt7763 >= Class158_Sub1_Sub2.UPDATE_ZONE_Y && class282_sub31_110.anInt7763 < Class158_Sub1_Sub2.UPDATE_ZONE_Y + 8 && class282_sub31_110.anInt7764 == Class272.UPDATE_ZONE_PLANE) {
					class282_sub31_110.aBool7774 = true;
				}
			}
			for (class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7776.head(); class282_sub31_110 != null; class282_sub31_110 = (Node_Sub31) Node_Sub31.aClass482_7776.next(804942724)) {
				if (class282_sub31_110.anInt7762 >= Static.UPDATE_ZONE_X && class282_sub31_110.anInt7762 < Static.UPDATE_ZONE_X + 8 && class282_sub31_110.anInt7763 >= Class158_Sub1_Sub2.UPDATE_ZONE_Y && class282_sub31_110.anInt7763 < Class158_Sub1_Sub2.UPDATE_ZONE_Y + 8 && class282_sub31_110.anInt7764 == Class272.UPDATE_ZONE_PLANE) {
					class282_sub31_110.aBool7774 = true;
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SOUND_SYNTH) {
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
		} else if (context.currentPacket == ServerPacket.SHOW_FACE_HERE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			Class470.method7825();
			CutsceneAction_Sub6.SHOW_FACE_HERE = bool_91;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4441) {
			buffer.index += 28;
			if (buffer.method13105()) {
				ServerEnvironment.method8309(buffer, buffer.index - 28);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.HINT_ICON) {
			int flags = buffer.readUnsignedByte();
			int iconIndex = flags >> 5;
			int targetType = flags & 0x1f;
			if (targetType == 0) {
				client.HINT_ARROWS[iconIndex] = null;
				context.currentPacket = null;
				return true;
			} else {
				HintArrow arrow = new HintArrow();
				arrow.targetType = targetType;
				arrow.arrowSprite = buffer.readUnsignedByte();
				if (arrow.arrowSprite >= 0 && arrow.arrowSprite < Class391.HINT_ARROW_SPRITES.length) {
					if (arrow.targetType != 1 && arrow.targetType != 10) {
						if (arrow.targetType >= 2 && arrow.targetType <= 6) {
							if (arrow.targetType == 2) {
								arrow.x = 256;
								arrow.y = 256;
							}
							if (arrow.targetType == 3) {
								arrow.x = 0;
								arrow.y = 256;
							}
							if (arrow.targetType == 4) {
								arrow.x = 512;
								arrow.y = 256;
							}
							if (arrow.targetType == 5) {
								arrow.x = 256;
								arrow.y = 0;
							}
							if (arrow.targetType == 6) {
								arrow.x = 256;
								arrow.y = 512;
							}
							arrow.targetType = 2;
							arrow.plane = buffer.readUnsignedByte();
							CoordGrid grid = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
							arrow.x += buffer.readUnsignedShort() - grid.x << 9;
							arrow.y += buffer.readUnsignedShort() - grid.y << 9;
							arrow.height = buffer.readUnsignedByte() << 2;
							arrow.distance = buffer.readUnsignedShort();
						}
					} else {
						arrow.targetIndex = buffer.readUnsignedShort();
						arrow.idk = buffer.readUnsignedShort();
						buffer.index += 4;
					}
					arrow.modelId = buffer.readInt();
					client.HINT_ARROWS[iconIndex] = arrow;
				}
				context.currentPacket = null;
				return true;
			}
		} else if (context.currentPacket == ServerPacket.PROJANIM_SPECIFIC) {
			int endHeight = buffer.readUnsignedByte128() * 4;
			int source = buffer.readShortLE128();
			int endTime = buffer.readShortLE();
			int lockOn = buffer.readShort();
			int flags = buffer.readUnsignedByte128();
			int y = buffer.readUnsignedShort128();
			int angleXZ = buffer.readUnsignedShort();
			int delay = buffer.readUnsignedShortLE128();
			int spotAnimId = buffer.readUnsignedShortLE128();
			int angleY = buffer.readUnsignedByte128();
			if (angleY == 255) {
				angleY = -1;
			}
			byte xDist = buffer.readByteC();
			byte yDist = buffer.readByteC();
			int x = buffer.readUnsignedShort128();
			int startHeight = buffer.readUnsignedByteC();
			boolean useFloorHeight = (flags & 0x1) != 0;
			boolean preciseStartHeight = (flags & 0x2) != 0;
			int basOffIdx = preciseStartHeight ? flags >> 2 : -1;
			if (preciseStartHeight) {
				startHeight = (byte) startHeight;
			} else {
				startHeight *= 4;
			}
			CoordGrid coordgrid_39 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int localX = x - coordgrid_39.x * 2;
			int localY = y - coordgrid_39.y * 2;
			int xOff = xDist + localX;
			int yOff = yDist + localY;
			if (localX >= 0 && localY >= 0 && localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 2 && localY < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 2 && xOff >= 0 && yOff >= 0 && xOff < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 2 && yOff < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 2 && spotAnimId != 65535) {
				localX *= 256;
				localY *= 256;
				xOff *= 256;
				yOff *= 256;
				startHeight <<= 2;
				endHeight <<= 2;
				angleXZ <<= 2;
				CursorIndexLoader.createProjectile(spotAnimId, source, lockOn, basOffIdx, startHeight, endHeight, localX, localY, xOff, yOff, delay, endTime, angleY, angleXZ, useFloorHeight);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.WORLD_LIST) {
			boolean refresh = buffer.readUnsignedByte() == 1;
			byte[] data = new byte[context.currentPacketSize - 1];
			buffer.readBytes(data, 0, context.currentPacketSize - 1);
			Class151.decodeWorldList(refresh, data);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VARBIT_LARGE) {
			int key = buffer.readIntV2();
			int flags = buffer.readUnsignedShort128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.method268(flags, key, -1714881897);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4362) { //request packet 37?
			int key = buffer.readUnsignedShortLE128();
			Class470.method7825();
			Class92.method1563(key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CLANSETTINGS_FULL) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4457) {
			int key = buffer.readUnsignedShort();
			Class470.method7825();
			Class123.method2152(key, -1865446551);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_INV_PARTIAL) {
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
		} else if (context.currentPacket == ServerPacket.PING) {
			context.currentPacket = null;
			return false;
		} else if (context.currentPacket == ServerPacket.VARP_SMALL) {
			byte b_100 = buffer.readByte();
			int flags = buffer.readUnsignedShortLE128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.setVarp(flags, b_100, (byte) 16);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.PLAY_SONG_RELATED) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4497) {
			if (client.BASE_WINDOW_ID != -1) {
				Class383.method6514(client.BASE_WINDOW_ID, 0, 1952807696);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER) {
			String displayName = buffer.readString();
			boolean hasPreviousName = buffer.readUnsignedByte() == 1;
			String username;
			if (hasPreviousName) {
				username = buffer.readString();
			} else {
				username = displayName;
			}
			int worldId = buffer.readUnsignedShort();
			byte rank = buffer.readByte();
			boolean bool_69 = false;
			if (rank == -128) {
				bool_69 = true;
			}
			int i_11;
			if (bool_69) {
				if (Class459.FC_PLAYER_COUNT == 0) {
					context.currentPacket = null;
					return true;
				}
				for (i_11 = 0; i_11 < Class459.FC_PLAYER_COUNT && (!Class467.FC_PLAYERS[i_11].username.equals(username) || worldId != Class467.FC_PLAYERS[i_11].worldId); i_11++) {
					;
				}
				if (i_11 < Class459.FC_PLAYER_COUNT) {
					while (i_11 < Class459.FC_PLAYER_COUNT - 1) {
						Class467.FC_PLAYERS[i_11] = Class467.FC_PLAYERS[i_11 + 1];
						++i_11;
					}
					--Class459.FC_PLAYER_COUNT;
					Class467.FC_PLAYERS[Class459.FC_PLAYER_COUNT] = null;
				}
			} else {
				String worldName = buffer.readString();
				FriendsChatPlayer class173_138 = new FriendsChatPlayer();
				class173_138.displayName = displayName;
				class173_138.username = username;
				class173_138.textName = Class383.method6515(class173_138.username);
				class173_138.worldId = worldId;
				class173_138.rank = rank;
				class173_138.worldName = worldName;
				int i_12;
				for (i_12 = Class459.FC_PLAYER_COUNT - 1; i_12 >= 0; --i_12) {
					int i_35 = Class467.FC_PLAYERS[i_12].textName.compareTo(class173_138.textName);
					if (i_35 == 0) {
						Class467.FC_PLAYERS[i_12].worldId = worldId;
						Class467.FC_PLAYERS[i_12].rank = rank;
						Class467.FC_PLAYERS[i_12].worldName = worldName;
						if (username.equals(VertexNormal.MY_PLAYER.displayName)) {
							Class48_Sub2.MY_PLAYER_FC_RANK = rank;
						}
						client.anInt7179 = client.anInt7347;
						context.currentPacket = null;
						return true;
					}
					if (i_35 < 0) {
						break;
					}
				}
				if (Class459.FC_PLAYER_COUNT >= Class467.FC_PLAYERS.length) {
					context.currentPacket = null;
					return true;
				}
				for (int i_35 = Class459.FC_PLAYER_COUNT - 1; i_35 > i_12; --i_35) {
					Class467.FC_PLAYERS[i_35 + 1] = Class467.FC_PLAYERS[i_35];
				}
				if (Class459.FC_PLAYER_COUNT == 0) {
					Class467.FC_PLAYERS = new FriendsChatPlayer[100];
				}
				Class467.FC_PLAYERS[i_12 + 1] = class173_138;
				++Class459.FC_PLAYER_COUNT;
				if (username.equals(VertexNormal.MY_PLAYER.displayName)) {
					Class48_Sub2.MY_PLAYER_FC_RANK = rank;
				}
			}
			client.anInt7179 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETHIDE) {
			int key = buffer.readUnsignedByte128();
			int flags = buffer.readInt();
			Class470.method7825();
			PulseEvent.method14663(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4480) {
			client.anInt7395 = client.anInt7347;
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			Class349 class349_105 = new Class349(buffer);
			ClanChannel clanChannel;
			if (bool_91) {
				clanChannel = Class113.CLAN_CHANNEL;
			} else {
				clanChannel = AsyncConnection.GUEST_CLAN_CHANNEL;
			}
			class349_105.method6179(clanChannel);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.REGION) {
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
		} else if (context.currentPacket == ServerPacket.REMOVE_GROUND_ITEM) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.REMOVE_GROUND_ITEM);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETANIM) {
			int key = buffer.readIntV2();
			int flags = buffer.readInt();
			Class470.method7825();
			PulseEvent.method3069(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SPOT_ANIM) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.SPOT_ANIM);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VARP_LARGE) {
			int key = buffer.readIntV2();
			int flags = buffer.readUnsignedShortLE128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.setVarp(flags, key, (byte) -17);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_CLOSESUB) {
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
		} else if (context.currentPacket == ServerPacket.UPDATE_STAT) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4453) {
			byte b_100 = buffer.readByte();
			int flags = buffer.readUnsignedByteC();
			Class470.method7825();
			Class52_Sub2.method14501(b_100, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VARCLAN_ENABLE) {
			Class46.CLAN_VARS = new Object[IndexLoaders.CLAN_VAR_LOADER.size];
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4495) {
			int key = buffer.readIntV2();
			int flags = buffer.readShortLE();
			int i_6 = buffer.readShortLE();
			int i_7 = buffer.readUnsignedByte();
			Class470.method7825();
			PulseEvent.method8722(key, i_7, flags, i_6);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4397) {
			boolean bool_91 = buffer.readUnsigned128Byte() == 1;
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method3252(flags, bool_91);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CREATE_CHECK_EMAIL_REPLY) {
			int key = buffer.readUnsignedByte();
			Class466 class466_98 = (Class466) Class386.identify(Class335.method5963(), key);
			if (class466_98 == null) {
				class466_98 = Class466.aClass466_5563;
			}
			JS5CacheRequest.method14949(class466_98);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4508) {
			Class504.anInt5832 = buffer.read24BitInteger(1949038328);
			client.aBool7224 = buffer.readUnsignedByte() == 1;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_OPENSUB_ACTIVE_NPC) {
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
		} else if (context.currentPacket == ServerPacket.CLANSETTINGS_DELTA) {
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
		} else if (context.currentPacket == ServerPacket.MINIMAP_FLAG) {
			int key = buffer.readUnsigned128Byte();
			int flags = buffer.readUnsigned128Byte();
			if (key == 255) {
				key = -1;
				flags = -1;
			}
			PulseEvent.method11155(key, flags);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.BLOCK_MINIMAP_STATE) {
			Class187.anInt2363 = buffer.readUnsignedByte();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4402) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method15381(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_OPENSUB) {
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
		} else if (context.currentPacket == ServerPacket.CREATE_ACCOUNT_REPLY) {
			int key = buffer.readUnsignedByte();
			Class494 class494_96 = (Class494) Class386.identify(UnderlayIndexLoader.method8038(), key);
			if (class494_96 == null) {
				class494_96 = Class494.aClass494_5782;
			}
			Preference_Sub26.method12948(class494_96);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.PLAYER_OPTION) {
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
		} else if (context.currentPacket == ServerPacket.IF_SETITEM) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4481) {
			int key = buffer.readShortLE();
			int flags = buffer.readUnsignedShort128();
			int i_6 = buffer.readUnsignedShort128();
			int i_7 = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.setIFContent(i_7, 7, key << 16 | i_6, flags, (byte) -41);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.GROUND_ITEM_COUNT) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.GROUND_ITEM_COUNT);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETPLAYERMODEL) {
			int key = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.setIFContent(key, 5, client.myPlayerIndex, 0, (byte) -60);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4428) {
			int key = buffer.readUnsignedShortLE128();
			if (key == 65535) {
				key = -1;
			}
			Class332.method5930(key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.DEBUG_SERVER_TRIGGERS) {
			int key = buffer.readUnsignedShort();
			Whirlpool.applyDebugOpcode(key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CREATE_OBJECT) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.CREATE_OBJECT);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SEND_PRIVATE_MESSAGE) {
			String string_63 = buffer.readString();
			String string_88 = Class182.method3044(Defaults7Loader.method8755(buffer));
			ChatLine.appendChatMessage(6, 0, string_63, string_63, string_63, string_88);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CREATE_GROUND_ITEM) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.CREATE_GROUND_ITEM);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4452) {
			client.anInt7434 = 1;
			client.anInt7386 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETPLAYERHEAD) {
			int key = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.setIFContent(key, 3, client.myPlayerIndex, 0, (byte) -81);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.EXECUTE_CS2_SCRIPT_RELATED) {
			int key = buffer.readIntLE();
			if (key != Class354.anInt4112) {
				Class354.anInt4112 = key;
				HitsplatIndexLoader.method3614(Class397.aClass397_4812, -1, -1, (byte) 95);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.REFLECTION_CHECK) {
			JS5StandardRequester.method5560(buffer, context.currentPacketSize);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.VARBIT_SMALL) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedByte128();
			Class158_Sub1.PLAYER_VAR_PROVIDER.method268(key, flags, -1140695527);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RECIEVE_PRIVATE_MESSAGE) {
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
							if (Class280.isIgnored(str_92)) {
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
		} else if (context.currentPacket == ServerPacket.CLIENT_SETVARC_SMALL) {
			byte b_100 = buffer.read128Byte();
			int flags = buffer.readShortLE();
			Class470.method7825();
			PulseEvent.method6751(flags, b_100, 1876892604);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETTEXTFONT) {
			int key = buffer.readInt();
			int flags = buffer.readIntV1();
			Class470.method7825();
			PulseEvent.method15435(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_SETGRAPHIC) {
			int key = buffer.readIntV2();
			int flags = buffer.readIntV2();
			Class470.method7825();
			PulseEvent.method7917(flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4396) {
			int key = buffer.readUnsignedShort();
			int flags = buffer.readUnsignedShort();
			int i_6 = buffer.readUnsignedShort();
			Class470.method7825();
			int i_8;
			if (CustomCursorsPreference.INTERFACES[key] != null) {
				for (int i_7 = flags; i_7 < i_6; i_7++) {
					i_8 = buffer.read24BitUnsignedInteger();
					if (i_7 < CustomCursorsPreference.INTERFACES[key].components.length && CustomCursorsPreference.INTERFACES[key].components[i_7] != null) {
						CustomCursorsPreference.INTERFACES[key].components[i_7].anInt1414 = i_8;
					}
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CUSTOMIZE_OBJECT) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.CUSTOMIZE_OBJECT);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.PLAYER_UPDATE) {
			PlayerUpdate.decode(buffer, context.currentPacketSize);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CAMERA_POSITION) {
			int key = buffer.readUnsignedByte();
			int flags = buffer.readUnsignedByte();
			int i_6 = buffer.readUnsigned128Byte();
			int i_7 = buffer.readShortLE() << 2;
			int i_8 = buffer.readUnsignedByte128();
			Class470.method7825();
			RouteStrategy.method3794(flags, key, i_7, i_6, i_8, true);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RECIEVE_CLAN_MESSAGE) {
			boolean bool_91 = buffer.readUnsignedByte() == 1;
			String string_88 = buffer.readString();
			long long_49 = (long) buffer.readUnsignedShort();
			long long_51 = (long) buffer.read24BitUnsignedInteger();
			int i_10 = buffer.readUnsignedByte();
			long long_55 = long_51 + (long_49 << 32);
			boolean bool_112 = false;
			ClanChannel class282_sub4_37 = bool_91 ? Class113.CLAN_CHANNEL : AsyncConnection.GUEST_CLAN_CHANNEL;
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
							if (Class280.isIgnored(string_88)) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4507) {
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
		} else if (context.currentPacket == ServerPacket.MAP_PROJANIM) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.MAP_PROJANIM);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.UPDATE_SITESETTINGS_COOKIE) {
			Class516.method8868(buffer.readString());
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4412) {
			client.aBool7454 = buffer.readUnsignedByte128() == 1;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.FRIEND_STATUS) {
			while (buffer.index < context.currentPacketSize) {
				boolean warnMessage = buffer.readUnsignedByte() == 1;
				String displayName = buffer.readString();
				String username = buffer.readString();
				int world = buffer.readUnsignedShort();
				int fcFrank = buffer.readUnsignedByte();
				boolean bool_69 = buffer.readUnsignedByte() == 1;
				String worldName = "";
				int i_11 = -1;
				int i_12 = 0;
				if (world > 0) {
					worldName = buffer.readString();
					i_11 = buffer.readUnsignedByte();
					i_12 = buffer.readInt();
				}
				for (int i_35 = 0; i_35 < client.FRIEND_COUNT; i_35++) {
					Friend class6_113 = client.FRIENDS[i_35];
					if (!warnMessage) {
						if (displayName.equals(class6_113.displayName)) {
							if (world != class6_113.worldId) {
								boolean bool_73 = true;
								for (EntityNode_Sub4 class275_sub4_32 = (EntityNode_Sub4) client.aClass457_7350.method7659(); class275_sub4_32 != null; class275_sub4_32 = (EntityNode_Sub4) client.aClass457_7350.method7650((byte) 73)) {
									if (class275_sub4_32.aString7837.equals(displayName)) {
										if (world != 0 && class275_sub4_32.aShort7839 == 0) {
											class275_sub4_32.method4887();
											bool_73 = false;
										} else if (world == 0 && class275_sub4_32.aShort7839 != 0) {
											class275_sub4_32.method4887();
											bool_73 = false;
										}
									}
								}
								if (bool_73) {
									client.aClass457_7350.offer(new EntityNode_Sub4(displayName, world), 1701737919);
								}
								class6_113.worldId = world;
							}
							class6_113.username = username;
							class6_113.worldName = worldName;
							class6_113.fcRank = fcFrank;
							class6_113.platform = i_11;
							class6_113.referrer = bool_69;
							class6_113.worldFlags = i_12;
							displayName = null;
							break;
						}
					} else if (username.equals(class6_113.displayName)) {
						class6_113.displayName = displayName;
						class6_113.username = username;
						displayName = null;
						break;
					}
				}
				if (displayName != null && client.FRIEND_COUNT < 200) {
					Friend friend = new Friend();
					client.FRIENDS[client.FRIEND_COUNT] = friend;
					friend.displayName = displayName;
					friend.username = username;
					friend.worldId = world;
					friend.worldName = worldName;
					friend.fcRank = fcFrank;
					friend.platform = i_11;
					friend.referrer = bool_69;
					friend.worldFlags = i_12;
					++client.FRIEND_COUNT;
				}
			}
			client.anInt7434 = 2;
			client.anInt7386 = client.anInt7347;
			boolean bool_91 = false;
			int flags = client.FRIEND_COUNT;
			while (flags > 0) {
				bool_91 = true;
				--flags;
				for (int i_6 = 0; i_6 < flags; i_6++) {
					boolean bool_70 = false;
					Friend class6_132 = client.FRIENDS[i_6];
					Friend class6_134 = client.FRIENDS[i_6 + 1];
					if (class6_132.worldId != Class159.GAME_CONNECTION_INFO.worldId && class6_134.worldId == Class159.GAME_CONNECTION_INFO.worldId) {
						bool_70 = true;
					}
					if (!bool_70 && class6_132.worldId == 0 && class6_134.worldId != 0) {
						bool_70 = true;
					}
					if (!bool_70 && !class6_132.referrer && class6_134.referrer) {
						bool_70 = true;
					}
					if (bool_70) {
						Friend class6_87 = client.FRIENDS[i_6];
						client.FRIENDS[i_6] = client.FRIENDS[i_6 + 1];
						client.FRIENDS[i_6 + 1] = class6_87;
						bool_91 = false;
					}
				}
				if (bool_91) {
					break;
				}
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IDENTIFY_HOST_NAME) {
			int ip = buffer.readInt();
			Class119.HOSTNAME_IDENTIFIER = new HostNameIdentifier(ip);
			Thread thread_94 = new Thread(Class119.HOSTNAME_IDENTIFIER);
			thread_94.setPriority(1);
			thread_94.start();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4365) {
			int interfaceHash = buffer.readIntV2();
			int newInterface = buffer.readInt();
			Class470.method7825();
			Node_Sub44 class282_sub44_95 = (Node_Sub44) client.aClass465_7442.get((long) newInterface);
			Node_Sub44 class282_sub44_126 = (Node_Sub44) client.aClass465_7442.get((long) interfaceHash);
			if (class282_sub44_126 != null) {
				Class351.closeChildren(class282_sub44_126, class282_sub44_95 == null || class282_sub44_95.anInt8063 != class282_sub44_126.anInt8063, false, -1298031252);
			}
			if (class282_sub44_95 != null) {
				class282_sub44_95.remove();
				client.aClass465_7442.put(class282_sub44_95, (long) interfaceHash);
			}
			IComponentDefinitions iCompDefs = IComponentDefinitions.getDefs(newInterface);
			if (iCompDefs != null) {
				Class109.redrawComponent(iCompDefs);
			}
			iCompDefs = IComponentDefinitions.getDefs(interfaceHash);
			if (iCompDefs != null) {
				Class109.redrawComponent(iCompDefs);
				HostNameIdentifier.method483(CustomCursorsPreference.INTERFACES[iCompDefs.idHash >>> 16], iCompDefs, true, -460404316);
			}
			if (client.BASE_WINDOW_ID != -1) {
				Class383.method6514(client.BASE_WINDOW_ID, 1, 1200373841);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CUTSCENE) {
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
		} else if (context.currentPacket == ServerPacket.DESTROY_OBJECT) {
			PacketDecoder.decodeTilestreamPacket(UpdateZonePacket.DESTROY_OBJECT);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4429) {
			int key = buffer.readInt();
			boolean bool_66 = buffer.readUnsignedByteC() == 1;
			if (bool_66 != Class469.aBool5585 || key != KeyHoldInputSubscriber.anInt2879) {
				Class469.aBool5585 = bool_66;
				KeyHoldInputSubscriber.anInt2879 = key;
				HitsplatIndexLoader.method3614(Class397.aClass397_4803, -1, -1, (byte) 27);
			}
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_OPENSUB_ACTIVE_PLAYER) {
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
		} else if (context.currentPacket == ServerPacket.ADD_IGNORE) {
			int key = buffer.readUnsignedByte();
			boolean editDisplayName = (key & 0x1) == 1;
			String username = buffer.readString();
			String displayName = buffer.readString();
			if (!editDisplayName) {
				Ignore ignore = new Ignore();
				client.IGNORED_PLAYERS[client.IGNORE_LIST_COUNT] = ignore;
				ignore.unfilteredUsername = username;
				ignore.displayName = displayName;
				ignore.temporary = (key & 0x2) == 2;
				++client.IGNORE_LIST_COUNT;
			} else {
				for (int i_8 = 0; i_8 < client.IGNORE_LIST_COUNT; i_8++) {
					Ignore class10_44 = client.IGNORED_PLAYERS[i_8];
					if (displayName.equals(class10_44.unfilteredUsername)) {
						class10_44.unfilteredUsername = username;
						class10_44.displayName = displayName;
						break;
					}
				}
			}
			client.anInt7386 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.CLIENT_SETVARCSTR_LARGE) {
			int key = buffer.readShortLE();
			String string_88 = buffer.readString();
			Class470.method7825();
			MapRegion.method4562(key, string_88, -1183230823);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.NPC_UPDATE) {
			NPCUpdate.decode(false);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RECIEVE_FRIENDS_CHAT_MESSAGE) {
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
							if (Class280.isIgnored(str_92)) {
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
		} else if (context.currentPacket == ServerPacket.OBJ_ANIM_SPECIFIC) {
			int tileHash = buffer.readIntV2();
			int plane = tileHash >> 28 & 0x3;
			int x = tileHash >> 14 & 0x3fff;
			int y = tileHash & 0x3fff;
			int animationId = buffer.readIntLE();
			int objFlags = buffer.readUnsigned128Byte();
			int type = objFlags >> 2;
			int rotation = objFlags & 0x3;
			int slot = client.OBJECT_TYPE_SLOTS[type];
			CoordGrid coordgrid_33 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			x -= coordgrid_33.x;
			y -= coordgrid_33.y;
			Class9.animateObject(plane, x, y, slot, type, rotation, animationId);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.SOUND_IDX15) {
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
		} else if (context.currentPacket == ServerPacket.IGNORE_LIST) {
			client.IGNORE_LIST_COUNT = buffer.readUnsignedByte();
			for (int key = 0; key < client.IGNORE_LIST_COUNT; key++) {
				Ignore class10_89 = new Ignore();
				client.IGNORED_PLAYERS[key] = class10_89;
				class10_89.unfilteredUsername = buffer.readString();
				class10_89.displayName = buffer.readString();
				class10_89.temporary = false;
			}
			client.anInt7386 = client.anInt7347;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4483) {
			int key = buffer.readShortLE();
			int flags = buffer.readUnsignedShort();
			int i_6 = buffer.readUnsigned128Byte();
			int i_7 = buffer.readIntLE();
			Class470.method7825();
			PulseEvent.method12420(i_7, i_6, flags, key);
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4364) {
			client.anInt7162 = buffer.method13121();
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.IF_OPENSUB_ACTIVE_OBJECT) {
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
		} else if (context.currentPacket == ServerPacket.VARCLAN_DISABLE) {
			Class46.CLAN_VARS = null;
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.aClass375_4437) {
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
		} else if (context.currentPacket == ServerPacket.aClass375_4418) {
			int key = buffer.readUnsignedShort128();
			int flags = buffer.readIntV2();
			int i_6 = buffer.readShortLE();
			Class470.method7825();
			PulseEvent.method12882(flags, key + (i_6 << 16));
			context.currentPacket = null;
			return true;
		} else if (context.currentPacket == ServerPacket.RUN_CS2_SCRIPT) {
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
		} else if (context.currentPacket == ServerPacket.NPC_UPDATE_LARGE) {
			NPCUpdate.decode(true);
			context.currentPacket = null;
			return true;
		} else {
			Class151.method2594((context.currentPacket != null ? context.currentPacket.opcode : -1) + "," + (context.secondLastPacket != null ? context.secondLastPacket.opcode : -1) + "," + (context.thirdLastPacket != null ? context.thirdLastPacket.opcode : -1) + " " + context.currentPacketSize, new RuntimeException(), (byte) -73);
			CursorIndexLoader.method7333(false, 2095335662);
			return true;
		}
	}

	static final void decodeTilestreamPacket(UpdateZonePacket packet) {
		RsBitsBuffer buffer = client.GAME_CONNECTION_CONTEXT.recievedBuffer;
		if (UpdateZonePacket.GROUND_ITEM_COUNT == packet) {
			int i_3 = buffer.readUnsignedByte();
			CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int y = i_5 + coordgrid_4.y;
			int i_7 = (i_3 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int x = i_7 + coordgrid_4.x;
			int i_9 = buffer.readUnsignedShort();
			int i_10 = buffer.readUnsignedShort();
			int amount = buffer.readUnsignedShort();
			if (client.aClass465_7414 != null) {
				Node_Sub29 class282_sub29_12 = (Node_Sub29) client.aClass465_7414.get((long) (Class272.UPDATE_ZONE_PLANE << 28 | y << 14 | x));
				if (class282_sub29_12 != null) {
					for (GroundItemNode item = (GroundItemNode) class282_sub29_12.aClass482_7708.head(); item != null; item = (GroundItemNode) class282_sub29_12.aClass482_7708.next(1296718058)) {
						if ((i_9 & 0x7fff) == item.id && i_10 == item.amount) {
							item.remove();
							item.amount = amount;
							Class353.addGroundItem(Class272.UPDATE_ZONE_PLANE, x, y, item);
							break;
						}
					}
					if (i_7 >= 0 && i_5 >= 0 && i_7 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
						Class434_Sub1.method12760(Class272.UPDATE_ZONE_PLANE, i_7, i_5);
					}
				}
			}
		} else if (UpdateZonePacket.OBJECT_PREFETCH == packet) {
			int i_3 = buffer.readInt();
			int i_21 = buffer.readUnsignedByte();
			IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefinitions(i_3).method7987(i_21, -588474817);
		} else if (UpdateZonePacket.SPOT_ANIM == packet) {
			int i_3 = buffer.readUnsignedByte();
			int x = (i_3 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int y = (i_3 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int spotAnimId = buffer.readUnsignedShort();
			if (spotAnimId == 65535) {
				spotAnimId = -1;
			}
			int height = buffer.readUnsignedShort();
			int speed = buffer.readUnsignedShort();
			int rotation = buffer.readUnsignedByte();
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153 && x >= 0 && y >= 0 && x < IndexLoaders.MAP_REGION_DECODER.getSizeX() && y < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				if (spotAnimId == -1) {
					CacheableNode_Sub10 class282_sub50_sub10_22 = (CacheableNode_Sub10) client.aClass465_7334.get((long) (x << 16 | y));
					if (class282_sub50_sub10_22 != null) {
						class282_sub50_sub10_22.aTransform_Sub1_Sub1_Sub4_9636.method15931(-2141216299);
						class282_sub50_sub10_22.remove();
					}
				} else {
					int tileX = x * 512 + 256;
					int tileY = y * 512 + 256;
					int toPlane = Class272.UPDATE_ZONE_PLANE;
					if (toPlane < 3 && IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(x, y, 1736872012)) {
						++toPlane;
					}
					SpotAnim spotAnim = new SpotAnim(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), spotAnimId, speed, Class272.UPDATE_ZONE_PLANE, toPlane, tileX, Class504.getTerrainHeightAtPos(tileX, tileY, Class272.UPDATE_ZONE_PLANE) - height, tileY, x, x, y, y, rotation, false);
					client.aClass465_7334.put(new CacheableNode_Sub10(spotAnim), (long) (x << 16 | y));
				}
			}
		} else if (UpdateZonePacket.MAP_PROJANIM == packet) {
			int flags = buffer.readUnsignedByte();
			boolean useFloorHeight = (flags & 0x80) != 0;
			int localX = (flags >> 3 & 0x7) + Static.UPDATE_ZONE_X;
			int localY = (flags & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int xOff = localX + buffer.readByte();
			int yOff = localY + buffer.readByte();
			int lockOn = buffer.readShort();
			int spotAnimId = buffer.readUnsignedShort();
			int startHeight = buffer.readUnsignedByte() * 4;
			int endHeight = buffer.readUnsignedByte() * 4;
			int delay = buffer.readUnsignedShort();
			int delayPlusSpeed = buffer.readUnsignedShort();
			int angle = buffer.readUnsignedByte();
			int angle2 = buffer.readUnsignedShort();
			if (angle == 255) {
				angle = -1;
			}
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153 && localX >= 0 && localY >= 0 && localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() && localY < IndexLoaders.MAP_REGION_DECODER.getSizeY() && xOff >= 0 && yOff >= 0 && xOff < IndexLoaders.MAP_REGION_DECODER.getSizeX() && yOff < IndexLoaders.MAP_REGION_DECODER.getSizeY() && spotAnimId != 65535) {
				localX = localX * 512 + 256;
				localY = localY * 512 + 256;
				xOff = xOff * 512 + 256;
				yOff = yOff * 512 + 256;
				startHeight <<= 2;
				endHeight <<= 2;
				angle2 <<= 2;
				Projectile class521_sub1_sub1_sub3_17 = new Projectile(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), spotAnimId, Class272.UPDATE_ZONE_PLANE, Class272.UPDATE_ZONE_PLANE, localX, localY, startHeight, delay + client.cycles, delayPlusSpeed + client.cycles, angle, angle2, 0, lockOn, endHeight, useFloorHeight, -1);
				class521_sub1_sub1_sub3_17.method15904(xOff, yOff, Class504.getTerrainHeightAtPos(xOff, yOff, Class272.UPDATE_ZONE_PLANE) - endHeight, delay + client.cycles);
				client.PROJECTILES.append(new ProjectileNode(class521_sub1_sub1_sub3_17));
			}
		} else if (UpdateZonePacket.MIDI_SONG_LOCATION == packet) {
			int i_3 = buffer.readUnsignedByte();
			int i_21 = (i_3 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int i_6 = buffer.readUnsignedShort();
			if (i_6 == 65535) {
				i_6 = -1;
			}
			int i_7 = buffer.readUnsignedByte();
			int i_8 = i_7 >> 4 & 0xf;
			int i_9 = i_7 & 0x7;
			int i_10 = buffer.readUnsignedByte();
			int i_11 = buffer.readUnsignedByte();
			int i_23 = buffer.readUnsignedShort();
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153 && i_21 >= 0 && i_5 >= 0 && i_21 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				int i_24 = i_8 + 1;
				if (VertexNormal.MY_PLAYER.regionBaseX[0] >= i_21 - i_24 && VertexNormal.MY_PLAYER.regionBaseX[0] <= i_21 + i_24 && VertexNormal.MY_PLAYER.regionBaseY[0] >= i_5 - i_24 && VertexNormal.MY_PLAYER.regionBaseY[0] <= i_24 + i_5) {
					Class383.method6509(i_6, i_9, i_10, i_11, i_8 + (Class272.UPDATE_ZONE_PLANE << 24) + (i_5 << 8) + (i_21 << 16), i_23);
				}
			}
		} else if (UpdateZonePacket.DESTROY_OBJECT == packet) {
			int i_3 = buffer.readUnsignedByte128();
			int i_21 = i_3 >> 2;
			int i_5 = i_3 & 0x3;
			int i_6 = client.OBJECT_TYPE_SLOTS[i_21];
			int i_7 = buffer.readUnsignedByte();
			int i_8 = (i_7 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int i_9 = (i_7 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			if (IndexLoaders.MAP_REGION_DECODER.method4419().method4401() || i_8 >= 0 && i_9 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_9 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				Class299.method5313(Class272.UPDATE_ZONE_PLANE, i_8, i_9, i_6, -1, i_21, i_5);
			}
		} else if (UpdateZonePacket.REMOVE_GROUND_ITEM == packet) {
			int i_3 = buffer.readUnsignedByteC();
			CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int i_6 = i_5 + coordgrid_4.y;
			int i_7 = (i_3 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int i_8 = i_7 + coordgrid_4.x;
			int i_9 = buffer.readUnsignedShortLE128();
			Node_Sub29 class282_sub29_39 = (Node_Sub29) client.aClass465_7414.get((long) (Class272.UPDATE_ZONE_PLANE << 28 | i_6 << 14 | i_8));
			if (class282_sub29_39 != null) {
				for (GroundItemNode class282_sub34_26 = (GroundItemNode) class282_sub29_39.aClass482_7708.head(); class282_sub34_26 != null; class282_sub34_26 = (GroundItemNode) class282_sub29_39.aClass482_7708.next(715558625)) {
					if ((i_9 & 0x7fff) == class282_sub34_26.id) {
						class282_sub34_26.remove();
						break;
					}
				}
				if (class282_sub29_39.aClass482_7708.hasNext(2087735245)) {
					class282_sub29_39.remove();
				}
				if (i_7 >= 0 && i_5 >= 0 && i_7 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
					Class434_Sub1.method12760(Class272.UPDATE_ZONE_PLANE, i_7, i_5);
				}
			}
		} else if (UpdateZonePacket.CUSTOMIZE_OBJECT == packet) {
			int i_3 = buffer.readInt();
			ObjectDefinitions objectdefinitions_32 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefinitions(i_3);
			int i_5 = buffer.readUnsignedByte128();
			int i_6 = i_5 >> 2;
			int i_7 = client.OBJECT_TYPE_SLOTS[i_6];
			int i_8 = buffer.readUnsignedByte();
			int i_9 = buffer.readUnsignedByte128();
			int i_10 = (i_9 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int i_11 = (i_9 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			if (i_6 == SceneObjectType.GROUND_INTERACT.type) {
				i_6 = SceneObjectType.SCENERY_INTERACT.type;
			}
			int i_23 = 0;
			if (objectdefinitions_32.types != null) {
				int i_24 = -1;
				for (int i_14 = 0; i_14 < objectdefinitions_32.types.length; i_14++) {
					if (i_6 == objectdefinitions_32.types[i_14]) {
						i_24 = i_14;
						break;
					}
				}
				i_23 = objectdefinitions_32.modelIds[i_24].length;
			}
			int i_24 = 0;
			if (objectdefinitions_32.modifiedColors != null) {
				i_24 = objectdefinitions_32.modifiedColors.length;
			}
			int i_14 = 0;
			if (objectdefinitions_32.modifiedTextures != null) {
				i_14 = objectdefinitions_32.modifiedTextures.length;
			}
			if ((i_8 & 0x1) == 1) {
				VarnBitDefinitions.method8217(Class272.UPDATE_ZONE_PLANE, i_10, i_11, i_7, i_3, i_6, (Class476) null, (byte) -37);
			} else {
				int[] ints_28 = null;
				if ((i_8 & 0x2) == 2) {
					ints_28 = new int[i_23];
					for (int i_16 = 0; i_16 < i_23; i_16++) {
						ints_28[i_16] = buffer.readInt();
					}
				}
				short[] shorts_29 = null;
				if ((i_8 & 0x4) == 4) {
					shorts_29 = new short[i_24];
					for (int i_30 = 0; i_30 < i_24; i_30++) {
						shorts_29[i_30] = (short) buffer.readUnsignedShort();
					}
				}
				short[] shorts_37 = null;
				if ((i_8 & 0x8) == 8) {
					shorts_37 = new short[i_14];
					for (int i_18 = 0; i_18 < i_14; i_18++) {
						shorts_37[i_18] = (short) buffer.readUnsignedShort();
					}
				}
				VarnBitDefinitions.method8217(Class272.UPDATE_ZONE_PLANE, i_10, i_11, i_7, i_3, i_6, new Class476(Node_Sub31.aLong7777, ints_28, shorts_29, shorts_37), (byte) 79);
				++Node_Sub31.aLong7777;
			}
		} else if (UpdateZonePacket.TILE_MESSAGE == packet) {
			buffer.readUnsignedByte();
			int i_3 = buffer.readUnsignedByte();
			int i_21 = (i_3 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int i_5 = (i_3 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int i_6 = buffer.readUnsignedShort();
			int i_7 = buffer.readUnsignedByte();
			int i_8 = buffer.read24BitUnsignedInteger();
			String string_27 = buffer.readString();
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153) {
				ParticleProducerDefinition.method1161(Class272.UPDATE_ZONE_PLANE, i_21, i_5, i_7, i_6, i_8, string_27, (short) 17078);
			}
		} else if (UpdateZonePacket.SOUND_AREA == packet) { //sound related again
			int flags = buffer.readUnsignedByte();
			int localX = (flags >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int localY = (flags & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int soundId = buffer.readUnsignedShort();
			if (soundId == 65535) {
				soundId = -1;
			}
			int i_7 = buffer.readUnsignedByte();
			int i_8 = i_7 >> 4 & 0xf;
			int i_9 = i_7 & 0x7;
			int i_10 = buffer.readUnsignedByte();
			int i_11 = buffer.readUnsignedByte();
			int i_23 = buffer.readUnsignedShort();
			boolean soundType = buffer.readUnsignedByte() == 1;
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153 && localX >= 0 && localY >= 0 && localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() && localY < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				int i_14 = i_8 + 1;
				if (VertexNormal.MY_PLAYER.regionBaseX[0] >= localX - i_14 && VertexNormal.MY_PLAYER.regionBaseX[0] <= localX + i_14 && VertexNormal.MY_PLAYER.regionBaseY[0] >= localY - i_14 && VertexNormal.MY_PLAYER.regionBaseY[0] <= i_14 + localY) {
					Class256.method4414(soundId, i_9, i_10, i_11, i_8 + (Class272.UPDATE_ZONE_PLANE << 24) + (localY << 8) + (localX << 16), soundType, i_23);
				}
			}
		} else if (UpdateZonePacket.OBJ_ANIM == packet) {
			int i_3 = buffer.readUnsigned128Byte();
			int type = i_3 >> 2;
			int rotation = i_3 & 0x3;
			int slot = client.OBJECT_TYPE_SLOTS[type];
			int i_7 = buffer.readUnsigned128Byte();
			int x = (i_7 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int y = (i_7 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int animationId = buffer.readIntLE();
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153) {
				Class9.animateObject(Class272.UPDATE_ZONE_PLANE, x, y, slot, type, rotation, animationId);
			}
		} else if (UpdateZonePacket.GROUND_ITEM_REVEAL == packet) {
			int playerId = buffer.readUnsignedShort();
			int i_21 = buffer.readUnsignedByte();
			CoordGrid coordgrid_25 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int i_6 = (i_21 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int y = i_6 + coordgrid_25.y;
			int i_8 = (i_21 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int x = i_8 + coordgrid_25.x;
			int amount = buffer.readUnsignedShortLE128();
			int id = buffer.readUnsignedShortLE128();
			if (playerId != client.myPlayerIndex) {
				boolean bool_40 = i_8 >= 0 && i_6 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY();
				if (bool_40 || IndexLoaders.MAP_REGION_DECODER.method4419().method4401()) {
					Class353.addGroundItem(Class272.UPDATE_ZONE_PLANE, x, y, new GroundItemNode(id, amount));
					if (bool_40) {
						Class434_Sub1.method12760(Class272.UPDATE_ZONE_PLANE, i_8, i_6);
					}
				}
			}
		} else if (UpdateZonePacket.CREATE_GROUND_ITEM == packet) {
			int amount = buffer.readUnsignedShortLE128();
			int id = buffer.readUnsignedShort128();
			int i_5 = buffer.readUnsignedByteC();
			CoordGrid coordgrid_31 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			int localY = (i_5 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int y = localY + coordgrid_31.y;
			int localX = (i_5 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int x = localX + coordgrid_31.x;
			boolean bool_36 = localX >= 0 && localY >= 0 && localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() && localY < IndexLoaders.MAP_REGION_DECODER.getSizeY();
			if (bool_36 || IndexLoaders.MAP_REGION_DECODER.method4419().method4401()) {
				Class353.addGroundItem(Class272.UPDATE_ZONE_PLANE, x, y, new GroundItemNode(id, amount));
				if (bool_36) {
					Class434_Sub1.method12760(Class272.UPDATE_ZONE_PLANE, localX, localY);
				}
			}
		} else if (UpdateZonePacket.MAP_PROJANIM_HALFSQ == packet) {
			int localCoordsHash = buffer.readUnsignedByte();
			int localX = (localCoordsHash >> 4 & 0xf) + Static.UPDATE_ZONE_X * 2;
			int localY = Class158_Sub1_Sub2.UPDATE_ZONE_Y * 2 + (localCoordsHash & 0xf);
			int flags = buffer.readUnsignedByte();
			boolean useFloorHeight = (flags & 0x1) != 0;
			boolean bool_34 = (flags & 0x2) != 0;
			int basOffIdx = bool_34 ? flags >> 2 : -1;
			int xOff = localX + buffer.readByte();
			int yOff = localY + buffer.readByte();
			int source = buffer.readShort();
			int lockOn = buffer.readShort();
			int spotAnimId = buffer.readUnsignedShort();
			int startHeight = buffer.readUnsignedByte();
			if (bool_34) {
				startHeight = (byte) startHeight;
			} else {
				startHeight *= 4;
			}
			int endHeight = buffer.readUnsignedByte() * 4;
			int delay = buffer.readUnsignedShort();
			int endTime = buffer.readUnsignedShort();
			int angle = buffer.readUnsignedByte();
			int angle2 = buffer.readUnsignedShort();
			if (angle == 255) {
				angle = -1;
			}
			if (IndexLoaders.MAP_REGION_DECODER.method4419() != Class256.aClass256_3153 && localX >= 0 && localY >= 0 && localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 2 && localY < IndexLoaders.MAP_REGION_DECODER.getSizeX() * 2 && xOff >= 0 && yOff >= 0 && xOff < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 2 && yOff < IndexLoaders.MAP_REGION_DECODER.getSizeY() * 2 && spotAnimId != 65535) {
				localX *= 256;
				localY *= 256;
				xOff *= 256;
				yOff *= 256;
				startHeight <<= 2;
				endHeight <<= 2;
				angle2 <<= 2;
				CursorIndexLoader.createProjectile(spotAnimId, source, lockOn, basOffIdx, startHeight, endHeight, localX, localY, xOff, yOff, delay, endTime, angle, angle2, useFloorHeight);
			}
		} else if (UpdateZonePacket.CREATE_OBJECT == packet) {
			int i_3 = buffer.readInt();
			int i_21 = buffer.readUnsigned128Byte();
			int i_5 = (i_21 >> 4 & 0x7) + Static.UPDATE_ZONE_X;
			int i_6 = (i_21 & 0x7) + Class158_Sub1_Sub2.UPDATE_ZONE_Y;
			int i_7 = buffer.readUnsigned128Byte();
			int i_8 = i_7 >> 2;
			int i_9 = i_7 & 0x3;
			int i_10 = client.OBJECT_TYPE_SLOTS[i_8];
			if (IndexLoaders.MAP_REGION_DECODER.method4419().method4401() || i_5 >= 0 && i_6 >= 0 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
				Class299.method5313(Class272.UPDATE_ZONE_PLANE, i_5, i_6, i_10, i_3, i_8, i_9);
			}
		} else {
			Class151.method2594("" + packet, new RuntimeException(), (byte) -3);
			CursorIndexLoader.method7333(false, 2095125734);
		}
	}

}
