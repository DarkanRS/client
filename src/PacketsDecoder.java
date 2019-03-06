import java.io.IOException;

public class PacketsDecoder extends Class455 {

	public static int anInt9079;
	int[] anIntArray9077;
	int[] anIntArray9078;

	PacketsDecoder(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		this.anIntArray9077 = ints_3;
		this.anIntArray9078 = ints_4;
	}

	static final boolean method14433(Class184 class184_0, int i_1) throws IOException {
		Class202 class202_2 = class184_0.method3053((byte) -107);
		RsBitsBuffer rsbitsbuffer_3 = class184_0.recievedBuffer;
		if (class202_2 == null) {
			return false;
		} else {
			int i_5;
			if (class184_0.aClass375_2286 == null) {
				if (class184_0.aBool2288) {
					if (!class202_2.available(1, (byte) 84)) {
						return false;
					}

					class202_2.read(class184_0.recievedBuffer.buffer, 0, 1, -1338515791);
					++class184_0.anInt2292;
					class184_0.anInt2289 = 0;
					class184_0.aBool2288 = false;
				}

				rsbitsbuffer_3.index = 0;
				if (rsbitsbuffer_3.method14869((short) 22877)) {
					if (!class202_2.available(1, (byte) 98)) {
						return false;
					}

					class202_2.read(class184_0.recievedBuffer.buffer, 1, 1, -566199770);
					++class184_0.anInt2292;
					class184_0.anInt2289 = 0;
				}

				class184_0.aBool2288 = true;
				IncomingPacket[] arr_4 = Class60.getIncommingPacket();
				i_5 = rsbitsbuffer_3.method14870();
				if (i_5 < 0 || i_5 >= arr_4.length) {
					throw new IOException(i_5 + " " + rsbitsbuffer_3.index);
				}

				class184_0.aClass375_2286 = arr_4[i_5];
				class184_0.anInt2287 = class184_0.aClass375_2286.anInt4513;
			}

			if (class184_0.anInt2287 == -1) {
				if (!class202_2.available(1, (byte) 96)) {
					return false;
				}

				class202_2.read(rsbitsbuffer_3.buffer, 0, 1, -1428027721);
				class184_0.anInt2287 = rsbitsbuffer_3.buffer[0] & 0xff;
				++class184_0.anInt2292;
				class184_0.anInt2289 = 0;
			}

			if (class184_0.anInt2287 == -2) {
				if (!class202_2.available(2, (byte) 58)) {
					return false;
				}

				class202_2.read(rsbitsbuffer_3.buffer, 0, 2, -1086022200);
				rsbitsbuffer_3.index = 0;
				class184_0.anInt2287 = rsbitsbuffer_3.readUnsignedShort();
				class184_0.anInt2292 += 2;
				class184_0.anInt2289 = 0;
			}

			if (class184_0.anInt2287 > 0) {
				if (!class202_2.available(class184_0.anInt2287, (byte) 90)) {
					return false;
				}

				rsbitsbuffer_3.index = 0;
				class202_2.read(rsbitsbuffer_3.buffer, 0, class184_0.anInt2287, -2131709422);
				class184_0.anInt2292 += class184_0.anInt2287;
				class184_0.anInt2289 = 0;
			}

			class184_0.aClass375_2291 = class184_0.aClass375_2296;
			class184_0.aClass375_2296 = class184_0.aClass375_2278;
			class184_0.aClass375_2278 = class184_0.aClass375_2286;
			int i_24;
			if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4486) {
				i_24 = rsbitsbuffer_3.readInt();
				i_5 = rsbitsbuffer_3.readIntV2(-1998341482);
				Class470.method7825(-402122141);
				Class96_Sub3.method13786(i_24, 1, i_5, -1, (byte) -45);
				class184_0.aClass375_2286 = null;
				return true;
			} else {
				String string_63;
				if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4504) {
					string_63 = rsbitsbuffer_3.readString();
					Class251.handleCommand(string_63, false, false, -354697449);
					class184_0.aClass375_2286 = null;
					return true;
				} else {
					int i_7;
					int i_8;
					int i_9;
					int i_10;
					boolean bool_76;
					if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4356) {
						i_24 = rsbitsbuffer_3.readUnsignedShort();
						i_5 = rsbitsbuffer_3.readUnsignedByte();
						bool_76 = (i_5 & 0x1) == 1;
						Class225_Sub5.method13043(i_24, bool_76, (short) -26041);
						i_7 = rsbitsbuffer_3.readUnsignedShort();

						for (i_8 = 0; i_8 < i_7; i_8++) {
							i_9 = rsbitsbuffer_3.readUnsigned128Byte();
							if (i_9 == 255) {
								i_9 = rsbitsbuffer_3.readIntV2(-760330093);
							}

							i_10 = rsbitsbuffer_3.readShortLE128();
							Class282_Sub21.method12353(i_24, i_8, i_10 - 1, i_9, bool_76, -713581501);
						}

						client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = i_24;
						class184_0.aClass375_2286 = null;
						return true;
					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4444) {
						i_24 = rsbitsbuffer_3.readUnsignedByteC(1686876240);
						Class470.method7825(-39143318);
						client.anInt7291 = i_24;
						class184_0.aClass375_2286 = null;
						return true;
					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4482) {
						Class85.aString817 = class184_0.anInt2287 > 2 ? rsbitsbuffer_3.readString() : Message.WALK_HERE.translate(Class223.CURRENT_LANGUAGE, -1187913693);
						client.anInt7311 = class184_0.anInt2287 > 0 ? rsbitsbuffer_3.readUnsignedShort() : -1;
						if (client.anInt7311 == 65535) {
							client.anInt7311 = -1;
						}

						class184_0.aClass375_2286 = null;
						return true;
					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4469) {
						i_24 = rsbitsbuffer_3.readUnsignedShort128();
						i_5 = rsbitsbuffer_3.readShortLE128();
						Class470.method7825(1278401565);
						Class12.method486(i_5, i_24, 0, 596260679);
						class184_0.aClass375_2286 = null;
						return true;
					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4413) {
						Class438.method7333(false, 2061848059);
						class184_0.aClass375_2286 = null;
						return false;
					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4446) {
						Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4210, 2050771049);
						class184_0.aClass375_2286 = null;
						return true;
					} else {
						boolean bool_91;
						if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4400) {
							client.anInt7395 = client.anInt7347;
							bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
							if (class184_0.anInt2287 == 1) {
								if (bool_91) {
									Class113.aClass282_Sub4_1235 = null;
								} else {
									Class202_Sub1.aClass282_Sub4_8186 = null;
								}

								class184_0.aClass375_2286 = null;
								return true;
							} else {
								if (bool_91) {
									Class113.aClass282_Sub4_1235 = new Class282_Sub4(rsbitsbuffer_3);
								} else {
									Class202_Sub1.aClass282_Sub4_8186 = new Class282_Sub4(rsbitsbuffer_3);
								}

								class184_0.aClass375_2286 = null;
								return true;
							}
						} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4408) {
							i_24 = rsbitsbuffer_3.readUnsignedByte();
							if (rsbitsbuffer_3.readUnsignedByte() == 0) {
								client.aClass330Array7428[i_24] = new Class330();
							} else {
								--rsbitsbuffer_3.index;
								client.aClass330Array7428[i_24] = new Class330(rsbitsbuffer_3);
							}

							client.anInt7320 = client.anInt7347;
							class184_0.aClass375_2286 = null;
							return true;
						} else {
							int i_6;
							if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4395) {
								i_24 = rsbitsbuffer_3.readInt();
								i_5 = rsbitsbuffer_3.readShortLE((byte) -42);
								i_6 = rsbitsbuffer_3.readShortLE((byte) -126);
								i_7 = rsbitsbuffer_3.readShortLE128();
								Class470.method7825(94861760);
								Class149_Sub1.method14583(i_24, i_5, i_6, i_7, -2141386100);
								class184_0.aClass375_2286 = null;
								return true;
							} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4475) {
								string_63 = rsbitsbuffer_3.readString();
								i_5 = rsbitsbuffer_3.readIntV1();
								Class470.method7825(-588315880);
								Class38.method860(i_5, string_63, -697454473);
								class184_0.aClass375_2286 = null;
								return true;
							} else {
								int i_11;
								if (class184_0.aClass375_2286 == IncomingPacket.WINDOW_PANE_PACKET) {
									i_24 = rsbitsbuffer_3.readIntV1();
									i_5 = rsbitsbuffer_3.readIntV1();
									i_6 = rsbitsbuffer_3.readUnsignedShort128();
									i_7 = rsbitsbuffer_3.readUnsigned128Byte();
									i_8 = rsbitsbuffer_3.readInt();
									i_9 = rsbitsbuffer_3.readInt();
									Class470.method7825(-400873026);
									if (i_7 == 2) {
										ItemDefaultsLoader.method7081((byte) 18);
									}

									int[] ints_93 = new int[] { i_9, i_8, i_24, i_5 };
									client.anInt7349 = i_6;
									ClipMap.method6007(i_6, ints_93, -1517468503);
									Class516.method8867(false, -905479502);
									Class150.method2582(client.anInt7349, ints_93, -1390726584);

									for (i_11 = 0; i_11 < 107; i_11++) {
										client.aBoolArray7443[i_11] = true;
									}

									class184_0.aClass375_2286 = null;
									return true;
								} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4478) {
									i_24 = rsbitsbuffer_3.readUnsignedShort128();
									i_5 = rsbitsbuffer_3.readIntV1();
									i_6 = rsbitsbuffer_3.readIntV1();
									Class470.method7825(994147760);
									Class96_Sub3.method13786(i_5, 5, i_24, i_6, (byte) -76);
									class184_0.aClass375_2286 = null;
									return true;
								} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4390) {
									Class470.method7825(1974206194);
									Class514.method8841(1210401894);
									class184_0.aClass375_2286 = null;
									return true;
								} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4511) {
									string_63 = rsbitsbuffer_3.readString();
									i_5 = rsbitsbuffer_3.readShortLE128();
									Class470.method7825(1212962087);
									MapRegion.method4562(i_5, string_63, -1783534567);
									class184_0.aClass375_2286 = null;
									return true;
//								} else if (class184.aClass375_2286 == IncomingPacket.aClass375_4459) {
//									try {
//										Class<? extends DiscordRichPresence> presence = client.presence.getClass();
//										Field f = presence.getDeclaredField(stream.readString());
//										f.setAccessible(true);
//										int type = stream.readInt();
//										if (type == 0)
//											f.setInt(client.presence, stream.readInt());
//										else if (type == 1)
//											f.set(client.presence, stream.readString());
//										else if (type == 2)
//											f.setLong(client.presence, stream.readLong(-1));
//										DiscordRPC.discordUpdatePresence(client.presence);
//									} catch (Throwable e) {
//										e.printStackTrace();
//									}
//									class184.aClass375_2286 = null;
//									return true;
								} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4416) {
									Class158_Sub1_Sub2.anInt10131 = rsbitsbuffer_3.read128Byte((short) 9583) << 3;
									Class272.anInt3331 = rsbitsbuffer_3.readUnsignedByte128(-1153285276);
									SceneObjectType.anInt5495 = rsbitsbuffer_3.readByte() << 3;

									while (rsbitsbuffer_3.index < class184_0.anInt2287) {
										TilestreamPacket tilestreampacket_68 = Class163.method2842(-332458150)[rsbitsbuffer_3.readUnsignedByte()];
										Class188.decodeTilestreamPacket(tilestreampacket_68, 1774288531);
									}

									class184_0.aClass375_2286 = null;
									return true;
								} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4406) {
									i_24 = rsbitsbuffer_3.readUnsignedShort();
									i_5 = rsbitsbuffer_3.readInt();
									Class470.method7825(1616362856);
									Class175.method2966(i_5, i_24, (short) 151);
									class184_0.aClass375_2286 = null;
									return true;
								} else {
									int i_12;
									long long_28;
									long long_30;
									boolean bool_73;
									int i_81;
									String string_88;
									String str_92;
									String string_101;
									if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4382) {
										bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
										string_88 = rsbitsbuffer_3.readString();
										str_92 = string_88;
										if (bool_91) {
											str_92 = rsbitsbuffer_3.readString();
										}

										long_28 = (long) rsbitsbuffer_3.readUnsignedShort();
										long_30 = (long) rsbitsbuffer_3.read24BitUnsignedInteger();
										i_11 = rsbitsbuffer_3.readUnsignedByte();
										i_12 = rsbitsbuffer_3.readUnsignedShort();
										long long_13 = long_30 + (long_28 << 32);
										bool_73 = false;
										i_81 = 0;

										while (true) {
											if (i_81 >= 100) {
												if (i_11 <= 1 && Class280.method4975(str_92, (byte) -80)) {
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
											string_101 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_12, -2078154753).fillDynamicValues(rsbitsbuffer_3, (byte) 0);
											if (i_11 == 2) {
												MapRegionLoaderTask.appendMessage(18, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_101, (String) null, i_12);
											} else if (i_11 == 1) {
												MapRegionLoaderTask.appendMessage(18, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_101, (String) null, i_12);
											} else {
												MapRegionLoaderTask.appendMessage(18, 0, string_88, str_92, string_88, string_101, (String) null, i_12);
											}
										}

										class184_0.aClass375_2286 = null;
										return true;
									} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4456) {
										i_24 = rsbitsbuffer_3.readIntLE();
										i_5 = rsbitsbuffer_3.readUnsignedShort128();
										Class470.method7825(1178481607);
										Class440.method7374(i_24, i_5, -1621742846);
										class184_0.aClass375_2286 = null;
										return true;
									} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4433) {
										i_24 = rsbitsbuffer_3.readUnsignedShort();
										if (i_24 == 65535) {
											i_24 = -1;
										}

										i_5 = rsbitsbuffer_3.readUnsignedByte();
										i_6 = rsbitsbuffer_3.readUnsignedShort();
										i_7 = rsbitsbuffer_3.readUnsignedByte();
										i_8 = rsbitsbuffer_3.readUnsignedShort();
										Class435.method7300(i_24, i_5, i_6, i_7, false, i_8, 1449989045);
										class184_0.aClass375_2286 = null;
										return true;
									} else if (class184_0.aClass375_2286 == IncomingPacket.RUN_ENERGY) {
										client.anInt7300 = rsbitsbuffer_3.readUnsignedByte();
										client.anInt7397 = client.anInt7347;
										class184_0.aClass375_2286 = null;
										return true;
									} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4379) {
										i_24 = rsbitsbuffer_3.readInt();
										i_5 = rsbitsbuffer_3.readShortLE128();
										i_6 = rsbitsbuffer_3.readIntV1();
										Class470.method7825(-444552624);
										Class96_Sub3.method13786(i_6, 3, i_5, i_24, (byte) -84);
										class184_0.aClass375_2286 = null;
										return true;
									} else {
										int i_15;
										boolean bool_16;
										CoordGrid coordgrid_33;
										int i_34;
										int i_35;
										int i_40;
										int i_77;
										int i_82;
										boolean bool_115;
										if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4477) {
											i_24 = rsbitsbuffer_3.readUnsignedByteC(1994158207);
											i_5 = rsbitsbuffer_3.readUnsignedShort128();
											if (i_5 == 65535) {
												i_5 = -1;
											}

											i_6 = rsbitsbuffer_3.readUnsignedByteC(-1478296892);
											i_7 = rsbitsbuffer_3.readUnsignedShort128();
											i_8 = rsbitsbuffer_3.readIntLE();
											i_9 = rsbitsbuffer_3.readShortLE((byte) -30);
											i_10 = i_6 & 0x7;
											i_11 = i_6 >> 3 & 0xf;
											if (i_11 == 15) {
												i_11 = -1;
											}

											boolean bool_78 = (i_6 >> 7 & 0x1) == 1;
											int i_83;
											if (i_8 >> 30 != 0) {
												coordgrid_33 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1211596991);
												i_77 = i_8 >> 28 & 0x3;
												i_15 = (i_8 >> 14 & 0x3fff) - coordgrid_33.x;
												i_81 = (i_8 & 0x3fff) - coordgrid_33.y;
												if (i_15 >= 0 && i_81 >= 0 && i_15 < IndexLoaders.MAP_REGION_DECODER.getSizeX(388459650) && i_81 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1824277921)) {
													if (i_5 == -1) {
														Class282_Sub50_Sub10 class282_sub50_sub10_80 = (Class282_Sub50_Sub10) client.aClass465_7334.get((long) (i_15 << 16 | i_81));
														if (class282_sub50_sub10_80 != null) {
															class282_sub50_sub10_80.aClass521_Sub1_Sub1_Sub4_9636.method15931(-2031553804);
															class282_sub50_sub10_80.remove();
														}
													} else {
														i_34 = i_15 * 512 + 256;
														i_82 = i_81 * 512 + 256;
														i_83 = i_77;
														if (i_77 < 3 && IndexLoaders.MAP_REGION_DECODER.method4433(33386298).is0x2(i_15, i_81, 1765906120)) {
															i_83 = i_77 + 1;
														}

														Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4_20 = new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1893689656), i_5, i_7, i_77, i_83, i_34, Class504.method8389(i_34, i_82, i_77, (byte) 74) - i_9, i_82, i_15, i_15, i_81, i_81, i_10, bool_78);
														client.aClass465_7334.method7765(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4_20), (long) (i_15 << 16 | i_81));
													}
												}
											} else {
												SpotAnimDefinitions spotanimdefinitions_38;
												AnimationDefinitions animationdefinitions_86;
												AnimationDefinitions animationdefinitions_123;
												if (i_8 >> 29 != 0) {
													i_35 = i_8 & 0xffff;
													Class282_Sub47 class282_sub47_116 = (Class282_Sub47) client.NPCS.get((long) i_35);
													if (class282_sub47_116 != null) {
														NPC npc_120 = (NPC) class282_sub47_116.anObject8068;
														Class161 class161_104 = npc_120.aClass161Array10339[i_24];
														if (i_5 == 65535) {
															i_5 = -1;
														}

														bool_115 = true;
														i_82 = class161_104.spotAnimId;
														if (i_5 != -1 && i_82 != -1) {
															if (i_5 == i_82) {
																spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_5, (byte) -4);
																if (spotanimdefinitions_38.aBool6968 && spotanimdefinitions_38.animationId != -1) {
																	animationdefinitions_86 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_38.animationId, (byte) -4);
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
																spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_5, (byte) 50);
																SpotAnimDefinitions spotanimdefinitions_85 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_82, (byte) 100);
																if (spotanimdefinitions_38.animationId != -1 && spotanimdefinitions_85.animationId != -1) {
																	animationdefinitions_123 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_38.animationId, (byte) 15);
																	AnimationDefinitions animationdefinitions_22 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_85.animationId, (byte) 19);
																	if (animationdefinitions_123.priority < animationdefinitions_22.priority) {
																		bool_115 = false;
																	}
																}
															}
														}

														if (bool_115) {
															class161_104.spotAnimId = i_5;
															class161_104.anInt2013 = i_9;
															class161_104.anInt2011 = i_11;
															if (i_5 != -1) {
																spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_5, (byte) -65);
																i_40 = spotanimdefinitions_38.aBool6968 ? 0 : 2;
																if (bool_78) {
																	i_40 = 1;
																}

																class161_104.animation.method7571(spotanimdefinitions_38.animationId, i_7, i_40, false, 1725179623);
															} else {
																class161_104.animation.method7567(-1, (short) 8960);
															}
														}
													}
												} else if (i_8 >> 28 != 0) {
													i_35 = i_8 & 0xffff;
													Player player_117;
													if (i_35 == client.anInt7315) {
														player_117 = Class84.myPlayer;
													} else {
														player_117 = client.players[i_35];
													}

													if (player_117 != null) {
														Class161 class161_121 = player_117.aClass161Array10339[i_24];
														if (i_5 == 65535) {
															i_5 = -1;
														}

														bool_16 = true;
														i_34 = class161_121.spotAnimId;
														SpotAnimDefinitions spotanimdefinitions_125;
														if (i_5 != -1 && i_34 != -1) {
															if (i_34 == i_5) {
																spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_5, (byte) 39);
																if (spotanimdefinitions_125.aBool6968 && spotanimdefinitions_125.animationId != -1) {
																	AnimationDefinitions animationdefinitions_124 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_125.animationId, (byte) 36);
																	i_40 = animationdefinitions_124.replayMode;
																	if (i_40 != 0 && i_40 != 2) {
																		if (i_40 == 1) {
																			bool_16 = true;
																		}
																	} else {
																		bool_16 = false;
																	}
																}
															} else {
																spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_5, (byte) -86);
																spotanimdefinitions_38 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_34, (byte) -10);
																if (spotanimdefinitions_125.animationId != -1 && spotanimdefinitions_38.animationId != -1) {
																	animationdefinitions_86 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_125.animationId, (byte) -12);
																	animationdefinitions_123 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_38.animationId, (byte) 15);
																	if (animationdefinitions_86.priority < animationdefinitions_123.priority) {
																		bool_16 = false;
																	}
																}
															}
														}

														if (bool_16) {
															class161_121.spotAnimId = i_5;
															class161_121.anInt2013 = i_9;
															class161_121.anInt2011 = i_11;
															class161_121.anInt2015 = i_10;
															if (i_5 != -1) {
																spotanimdefinitions_125 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_5, (byte) -15);
																i_83 = spotanimdefinitions_125.aBool6968 ? 0 : 2;
																if (bool_78) {
																	i_83 = 1;
																}

																class161_121.animation.method7571(spotanimdefinitions_125.animationId, i_7, i_83, false, -948478080);
															} else {
																class161_121.animation.method7567(-1, (short) 8960);
															}
														}
													}
												}
											}

											class184_0.aClass375_2286 = null;
											return true;
										} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4391) {
											i_24 = rsbitsbuffer_3.readUnsignedByte();
											i_5 = rsbitsbuffer_3.readUnsignedShort128() << 2;
											i_6 = rsbitsbuffer_3.readUnsignedByte128(-1952319270);
											i_7 = rsbitsbuffer_3.readUnsignedByteC(1062022644);
											i_8 = rsbitsbuffer_3.readUnsigned128Byte();
											Class470.method7825(1011041047);
											Class11.method469(i_24, i_6, i_5, i_8, i_7, (byte) -10);
											class184_0.aClass375_2286 = null;
											return true;
										} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4368) {
											i_24 = rsbitsbuffer_3.readUnsignedByte();
											i_5 = rsbitsbuffer_3.readUnsignedShort128();
											Class470.method7825(-822536297);
											Class93.method1575(i_5, i_24, true, 733762718);
											class184_0.aClass375_2286 = null;
											return true;
										} else {
											String string_42;
											String string_135;
											String string_137;
											if (class184_0.aClass375_2286 == IncomingPacket.GAME_MESSAGE) {
												i_24 = rsbitsbuffer_3.readUnsignedSmart(1685842544);
												i_5 = rsbitsbuffer_3.readInt();
												i_6 = rsbitsbuffer_3.readUnsignedByte();
												string_42 = "";
												string_137 = string_42;
												if ((i_6 & 0x1) != 0) {
													string_42 = rsbitsbuffer_3.readString();
													if ((i_6 & 0x2) != 0) {
														string_137 = rsbitsbuffer_3.readString();
													} else {
														string_137 = string_42;
													}
												}

												string_135 = rsbitsbuffer_3.readString();
												if (i_24 == 99) {
													Class209.method3598(string_135, -1476632772);
												} else if (i_24 == 98) {
													QuestDefinitions.method4140(string_135, -2007576372);
												} else {
													if (!string_137.equals("") && Class280.method4975(string_137, (byte) -48)) {
														class184_0.aClass375_2286 = null;
														return true;
													}

													Class191.method3167(i_24, i_5, string_42, string_137, string_42, string_135, 1911483495);
												}

												class184_0.aClass375_2286 = null;
												return true;
											} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4439) {
												Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4211, 34147700);
												class184_0.aClass375_2286 = null;
												return true;
											} else {
												byte[] bytes_64;
												boolean bool_66;
												if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4367) {
													if (Class475.supportsFullScreen && client.fullScreenFrame != null) {
														Class440.method7373(Class393.preferences.screenSize.method12687(-2060452662), -1, -1, false, (byte) 2);
													}

													bytes_64 = new byte[class184_0.anInt2287 - 1];
													bool_66 = rsbitsbuffer_3.readUnsignedByte() == 1;
													rsbitsbuffer_3.method14873(bytes_64, 0, class184_0.anInt2287 - 1, (byte) 8);
													RsByteBuffer rsbytebuffer_127 = new RsByteBuffer(bytes_64);
													string_42 = rsbytebuffer_127.readString();
													if (bool_66) {
														string_137 = rsbytebuffer_127.readString();
														if (string_137.length() == 0) {
															string_137 = string_42;
														}

														if (!client.aBool7310 || Class225_Sub6.aString8069.startsWith("mac") || !Class186.method3082(string_42, 1, Class361.aClass361_4179.method6253((byte) -74), 145298920)) {
															Class282_Sub50_Sub6.method14788(string_137, true, Class393.preferences.currentToolkit.getValue(111625844) == 5, client.aBool7158, client.aBool7159, (byte) -120);
														}
													} else {
														Class282_Sub50_Sub6.method14788(string_42, true, Class393.preferences.currentToolkit.getValue(-1499528045) == 5, client.aBool7158, client.aBool7159, (byte) -96);
													}

													class184_0.aClass375_2286 = null;
													return true;
												} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4422) {
													i_24 = rsbitsbuffer_3.readUnsigned128Byte();
													i_5 = rsbitsbuffer_3.readUnsignedShort();
													i_6 = rsbitsbuffer_3.readUnsignedByteC(-588997418);
													i_7 = rsbitsbuffer_3.readUnsignedByteC(138735834);
													i_8 = rsbitsbuffer_3.readUnsigned128Byte();
													Class470.method7825(665470469);
													client.aBoolArray7431[i_6] = true;
													client.anIntArray7268[i_6] = i_7;
													client.anIntArray7433[i_6] = i_24;
													client.anIntArray7462[i_6] = i_8;
													client.anIntArray7435[i_6] = i_5;
													class184_0.aClass375_2286 = null;
													return true;
												} else {
													boolean bool_74;
													if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4355) {
														bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
														string_88 = rsbitsbuffer_3.readString();
														str_92 = string_88;
														if (bool_91) {
															str_92 = rsbitsbuffer_3.readString();
														}

														i_7 = rsbitsbuffer_3.readUnsignedByte();
														bool_74 = false;
														if (i_7 <= 1) {
															if ((!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
																if (i_7 <= 1 && Class280.method4975(str_92, (byte) -70)) {
																	bool_74 = true;
																}
															} else {
																bool_74 = true;
															}
														}

														if (!bool_74) {
															string_135 = Class182.method3044(Defaults7Loader.method8755(rsbitsbuffer_3, (byte) 29), -1519993030);
															if (i_7 == 2) {
																MapRegionLoaderTask.appendMessage(24, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_135, (String) null, -1);
															} else if (i_7 == 1) {
																MapRegionLoaderTask.appendMessage(24, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_135, (String) null, -1);
															} else {
																MapRegionLoaderTask.appendMessage(24, 0, string_88, str_92, string_88, string_135, (String) null, -1);
															}
														}

														class184_0.aClass375_2286 = null;
														return true;
													} else {
														String str_25;
														boolean bool_69;
														if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4434) {
															bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
															string_88 = rsbitsbuffer_3.readString();
															str_92 = string_88;
															if (bool_91) {
																str_92 = rsbitsbuffer_3.readString();
															}

															i_7 = rsbitsbuffer_3.readUnsignedByte();
															i_8 = rsbitsbuffer_3.readUnsignedShort();
															bool_69 = false;
															if (i_7 <= 1 && Class280.method4975(str_92, (byte) -65)) {
																bool_69 = true;
															}

															if (!bool_69) {
																str_25 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_8, -1821075949).fillDynamicValues(rsbitsbuffer_3, (byte) 0);
																if (i_7 == 2) {
																	MapRegionLoaderTask.appendMessage(25, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, str_25, (String) null, i_8);
																} else if (i_7 == 1) {
																	MapRegionLoaderTask.appendMessage(25, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, str_25, (String) null, i_8);
																} else {
																	MapRegionLoaderTask.appendMessage(25, 0, string_88, str_92, string_88, str_25, (String) null, i_8);
																}
															}

															class184_0.aClass375_2286 = null;
															return true;
														} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4373) {
															Class149_Sub2.aClass461_9316 = Class246.method4203(rsbitsbuffer_3.readUnsignedByte(), (byte) 2);
															class184_0.aClass375_2286 = null;
															return true;
														} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4496) {
															i_24 = rsbitsbuffer_3.readShortLE128();
															int[] ints_122 = new int[Class8_Sub3.method14339(179659033).length];

															for (i_6 = 0; i_6 < Class8_Sub3.method14339(2021729749).length; i_6++) {
																ints_122[i_6] = rsbitsbuffer_3.readIntLE();
															}

															i_6 = rsbitsbuffer_3.readUnsignedByte();
															Class282_Sub47 class282_sub47_131 = (Class282_Sub47) client.NPCS.get((long) i_24);
															if (class282_sub47_131 != null) {
																Class20.animate((Animable) class282_sub47_131.anObject8068, ints_122, i_6, true, (byte) 72);
															}

															class184_0.aClass375_2286 = null;
															return true;
														} else if (class184_0.aClass375_2286 == IncomingPacket.MOVE_ICOMPONENT) {
															i_24 = rsbitsbuffer_3.readUnsignedShort128(877005762);
															i_5 = rsbitsbuffer_3.readIntV2(-1005542632);
															i_6 = rsbitsbuffer_3.readUnsignedShortLE128(-1358044133);
															Class470.method7825(457880484);
															Class96_Sub16.method14648(i_5, i_6, i_24, (byte) 8);
															class184_0.aClass375_2286 = null;
															return true;
														} else {
															RsBitsBuffer rsbitsbuffer_65;
															if (class184_0.aClass375_2286 == IncomingPacket.DYNAMIC_MAP_REGION) {
																rsbitsbuffer_65 = new RsBitsBuffer(class184_0.anInt2287);
																System.arraycopy(class184_0.recievedBuffer.buffer, class184_0.recievedBuffer.index, rsbitsbuffer_65.buffer, 0, class184_0.anInt2287);
																FontMetrics.method6989(1407669515);
																if (Class393.preferences.aClass468_Sub3_8199.method12632(917077703) == 1) {
																	IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3155, rsbitsbuffer_65), 301123709);
																} else {
																	IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3155, rsbitsbuffer_65), 1959185438);
																}

																class184_0.aClass375_2286 = null;
																return false;
															} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4499) {
																client.aByte7458 = rsbitsbuffer_3.readByte();
																if (client.aByte7458 == 0 || client.aByte7458 == 1) {
																	client.aBool7323 = true;
																}

																class184_0.aClass375_2286 = null;
																return true;
															} else if (class184_0.aClass375_2286 == IncomingPacket.NPC_ON_ICOMPONENT) {
																i_24 = rsbitsbuffer_3.readIntLE();
																i_5 = rsbitsbuffer_3.readIntV1();
																Class470.method7825(-1093951005);
																Class96_Sub3.method13786(i_24, 2, i_5, -1, (byte) -52);
																class184_0.aClass375_2286 = null;
																return true;
															} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4369) {
																i_24 = rsbitsbuffer_3.readUnsignedShort();
																Player player_119;
																if (i_24 == client.anInt7315) {
																	player_119 = Class84.myPlayer;
																} else {
																	player_119 = client.players[i_24];
																}

																if (player_119 == null) {
																	class184_0.aClass375_2286 = null;
																	return true;
																} else {
																	i_6 = rsbitsbuffer_3.readUnsignedShort();
																	i_7 = rsbitsbuffer_3.readUnsignedByte();
																	bool_74 = (i_6 & 0x8000) != 0;
																	if (player_119.displayName != null && player_119.playerAppearance != null) {
																		bool_69 = false;
																		if (i_7 <= 1) {
																			if (!bool_74 && (client.aBool7224 && !client.aBool7244 || client.aBool7325)) {
																				bool_69 = true;
																			} else if (Class280.method4975(player_119.displayName, (byte) -107)) {
																				bool_69 = true;
																			}
																		}

																		if (!bool_69) {
																			i_10 = -1;
																			String string_139;
																			if (bool_74) {
																				i_6 &= 0x7fff;
																				Class346 class346_141 = Class175.method2958(rsbitsbuffer_3, -1418215798);
																				i_10 = class346_141.anInt4048;
																				string_139 = class346_141.aClass282_Sub50_Sub9_4047.fillDynamicValues(rsbitsbuffer_3, (byte) 0);
																			} else {
																				string_139 = Class182.method3044(Defaults7Loader.method8755(rsbitsbuffer_3, (byte) 71), -1519993030);
																			}

																			player_119.sendChat(string_139.trim(), i_6 >> 8, i_6 & 0xff, (byte) 33);
																			if (i_7 != 1 && i_7 != 2) {
																				i_12 = bool_74 ? 17 : 2;
																			} else {
																				i_12 = bool_74 ? 17 : 1;
																			}

																			if (i_7 == 2) {
																				MapRegionLoaderTask.appendMessage(i_12, 0, Class76.getCrown(1) + player_119.method16127(true, 2000914170), Class76.getCrown(1) + player_119.method16128(false, 1912893547), player_119.username, string_139, (String) null, i_10);
																			} else if (i_7 == 1) {
																				MapRegionLoaderTask.appendMessage(i_12, 0, Class76.getCrown(0) + player_119.method16127(true, 1975174486), Class76.getCrown(0) + player_119.method16128(false, 1912893547), player_119.username, string_139, (String) null, i_10);
																			} else {
																				MapRegionLoaderTask.appendMessage(i_12, 0, player_119.method16127(true, 2076242583), player_119.method16128(false, 1912893547), player_119.username, string_139, (String) null, i_10);
																			}
																		}
																	}

																	class184_0.aClass375_2286 = null;
																	return true;
																}
															} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4409) {
																i_24 = rsbitsbuffer_3.readUnsignedShort();
																string_88 = rsbitsbuffer_3.readString();
																bool_76 = rsbitsbuffer_3.readUnsignedByte() == 1;
																Class448.aClass450_5429 = Class159.aClass450_2010;
																Class448.aBool5428 = bool_76;
																Class62.method1262(i_24, string_88, (byte) 0);
																string_42 = null;
																Class365.setGameState(17);
																class184_0.aClass375_2286 = null;
																return false;
															} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4360) {
																Class438.method7333(Class9.aBool71, 2100753515);
																class184_0.aClass375_2286 = null;
																return false;
															} else if (class184_0.aClass375_2286 == IncomingPacket.GLOBAL_CONFIG_1) {
																i_24 = rsbitsbuffer_3.readShortLE((byte) -64);
																i_5 = rsbitsbuffer_3.readIntV2(-390916272);
																Class470.method7825(933827827);
																Class393.method6751(i_24, i_5, -1413337528);
																class184_0.aClass375_2286 = null;
																return true;
															} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4506) {
																i_24 = rsbitsbuffer_3.readIntV2(-1343839559);
																i_5 = rsbitsbuffer_3.readIntLE();
																i_6 = rsbitsbuffer_3.readShortLE((byte) -14);
																i_7 = rsbitsbuffer_3.readInt();
																i_8 = rsbitsbuffer_3.readIntV1();
																i_9 = rsbitsbuffer_3.readUnsigned128Byte();
																CoordGrid coordgrid_90 = new CoordGrid(rsbitsbuffer_3.readIntV1());
																i_11 = rsbitsbuffer_3.readIntV1();
																i_12 = rsbitsbuffer_3.readShortLE128();
																Class470.method7825(881365038);
																Class31.method812(i_24, new Class282_Sub44_Sub3(i_6, i_9, new Class520(coordgrid_90, i_12)), new int[] { i_8, i_11, i_5, i_7 }, false, (byte) 121);
																class184_0.aClass375_2286 = null;
																return true;
															} else {
																long long_47;
																if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4500) {
																	client.anInt7179 = client.anInt7347;
																	if (class184_0.anInt2287 == 0) {
																		client.aString7426 = null;
																		client.aString7359 = null;
																		Class459.anInt5534 = 0;
																		Class467.aClass173Array5575 = null;
																		class184_0.aClass375_2286 = null;
																		return true;
																	} else {
																		client.aString7359 = rsbitsbuffer_3.readString();
																		bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																		if (bool_91) {
																			rsbitsbuffer_3.readString();
																		}

																		long_47 = rsbitsbuffer_3.readLong(1393893108);
																		client.aString7426 = Class306.method5457(long_47);
																		Class412.aByte4963 = rsbitsbuffer_3.readByte();
																		i_7 = rsbitsbuffer_3.readUnsignedByte();
																		if (i_7 == 255) {
																			class184_0.aClass375_2286 = null;
																			return true;
																		} else {
																			Class459.anInt5534 = i_7;
																			Class173[] arr_136 = new Class173[100];

																			for (i_9 = 0; i_9 < Class459.anInt5534; i_9++) {
																				arr_136[i_9] = new Class173();
																				arr_136[i_9].aString2129 = rsbitsbuffer_3.readString();
																				bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																				if (bool_91) {
																					arr_136[i_9].aString2127 = rsbitsbuffer_3.readString();
																				} else {
																					arr_136[i_9].aString2127 = arr_136[i_9].aString2129;
																				}

																				arr_136[i_9].aString2128 = Class383.method6515(arr_136[i_9].aString2127, 1942118537);
																				arr_136[i_9].anInt2131 = rsbitsbuffer_3.readUnsignedShort();
																				arr_136[i_9].aByte2126 = rsbitsbuffer_3.readByte();
																				arr_136[i_9].aString2130 = rsbitsbuffer_3.readString();
																				if (arr_136[i_9].aString2127.equals(Class84.myPlayer.displayName)) {
																					Class48_Sub2.aByte9263 = arr_136[i_9].aByte2126;
																				}
																			}

																			bool_69 = false;
																			i_10 = Class459.anInt5534;

																			while (i_10 > 0) {
																				bool_69 = true;
																				--i_10;

																				for (i_11 = 0; i_11 < i_10; i_11++) {
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
																			class184_0.aClass375_2286 = null;
																			return true;
																		}
																	}
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4387) {
																	Class470.method7825(1881544107);
																	Class275_Sub7.method12606((byte) 81);
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4401) {
																	i_24 = rsbitsbuffer_3.readUnsignedShort();
																	string_88 = rsbitsbuffer_3.readString();
																	if (Class46.anObjectArray437 == null) {
																		Class46.anObjectArray437 = new Object[IndexLoaders.aClass394_5831.anInt4785];
																	}

																	Class46.anObjectArray437[i_24] = string_88;
																	client.anIntArray7222[++client.anInt7390 - 1 & 0x1f] = i_24;
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4414) {
																	i_24 = rsbitsbuffer_3.readUnsignedByte128(-1018518837);
																	i_5 = rsbitsbuffer_3.readUnsignedByte128(-655779539);
																	i_6 = rsbitsbuffer_3.readUnsignedShort128();
																	if (i_6 == 65535) {
																		i_6 = -1;
																	}

																	Class42.method890(i_6, i_5, i_24, (byte) -6);
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4501) {
																	bool_91 = rsbitsbuffer_3.readUnsigned128Byte() == 1;
																	i_5 = rsbitsbuffer_3.readIntLE();
																	Class470.method7825(1755063045);
																	Class331.method5924(i_5, bool_91, 16777472);
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4411) {
																	i_24 = rsbitsbuffer_3.method13132(-458827259);
																	i_5 = rsbitsbuffer_3.readUnsigned128Byte();
																	i_6 = rsbitsbuffer_3.readShortLE((byte) -115);
																	if (i_6 == 65535) {
																		i_6 = -1;
																	}

																	Class117.method1978(i_6, i_24, i_5, (byte) 1);
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4427) {
																	client.anInt7422 = rsbitsbuffer_3.readUnsignedByteC(-751450518);
																	client.anInt7416 = rsbitsbuffer_3.readUnsignedByte128(-1679113626);
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4451) {
																	Class158_Sub1.PLAYER_VAR_PROVIDER.method265(1066076779);
																	client.anInt7453 += 32;
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4465) {
																	Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4215, 844987156);
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4473) {
																	client.anInt7354 = rsbitsbuffer_3.readShort();
																	client.anInt7397 = client.anInt7347;
																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4399) {
																	i_24 = rsbitsbuffer_3.readIntLE();
																	Class470.method7825(-741454199);
																	if (i_24 == -1) {
																		Class508.anInt5864 = -1;
																		Class86.anInt833 = -1;
																	} else {
																		CoordGrid coordgrid_114 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1825501600);
																		i_6 = i_24 >> 14 & 0x3fff;
																		i_7 = i_24 & 0x3fff;
																		i_6 -= coordgrid_114.x;
																		if (i_6 < 0) {
																			i_6 = 0;
																		} else if (i_6 >= IndexLoaders.MAP_REGION_DECODER.getSizeX(2001969663)) {
																			i_6 = IndexLoaders.MAP_REGION_DECODER.getSizeX(1292734123);
																		}

																		i_7 -= coordgrid_114.y;
																		if (i_7 < 0) {
																			i_7 = 0;
																		} else if (i_7 >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-446292147)) {
																			i_7 = IndexLoaders.MAP_REGION_DECODER.getSizeY(-1249519564);
																		}

																		Class508.anInt5864 = (i_6 << 9) + 256;
																		Class86.anInt833 = (i_7 << 9) + 256;
																	}

																	class184_0.aClass375_2286 = null;
																	return true;
																} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4509) {
																	for (i_24 = 0; i_24 < client.players.length; i_24++) {
																		if (client.players[i_24] != null) {
																			client.players[i_24].currentAnimations = null;
																			client.players[i_24].currentAnimation.method7567(-1, (short) 8960);
																		}
																	}

																	for (i_24 = 0; i_24 < client.anInt7210; i_24++) {
																		((Animable) client.aClass282_Sub47Array7209[i_24].anObject8068).currentAnimations = null;
																		((Animable) client.aClass282_Sub47Array7209[i_24].anObject8068).currentAnimation.method7567(-1, (short) 8960);
																	}

																	class184_0.aClass375_2286 = null;
																	return true;
																} else {
																	boolean bool_14;
																	String string_17;
																	Class282_Sub4 class282_sub4_37;
																	long long_49;
																	long long_51;
																	long long_53;
																	if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4353) {
																		bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																		string_88 = rsbitsbuffer_3.readString();
																		long_49 = (long) rsbitsbuffer_3.readUnsignedShort();
																		long_51 = (long) rsbitsbuffer_3.read24BitUnsignedInteger();
																		i_10 = rsbitsbuffer_3.readUnsignedByte();
																		i_11 = rsbitsbuffer_3.readUnsignedShort();
																		long_53 = long_51 + (long_49 << 32);
																		bool_14 = false;
																		class282_sub4_37 = null;
																		Class282_Sub4 class282_sub4_102 = bool_91 ? Class113.aClass282_Sub4_1235 : Class202_Sub1.aClass282_Sub4_8186;
																		if (class282_sub4_102 == null) {
																			bool_14 = true;
																		} else {
																			label2385: {
																				for (i_34 = 0; i_34 < 100; i_34++) {
																					if (long_53 == client.aLongArray7424[i_34]) {
																						bool_14 = true;
																						break label2385;
																					}
																				}

																				if (i_10 <= 1 && Class280.method4975(string_88, (byte) -52)) {
																					bool_14 = true;
																				}
																			}
																		}

																		if (!bool_14) {
																			client.aLongArray7424[client.anInt7389] = long_53;
																			client.anInt7389 = (client.anInt7389 + 1) % 100;
																			string_17 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_11, -1887115838).fillDynamicValues(rsbitsbuffer_3, (byte) 0);
																			i_82 = bool_91 ? 42 : 45;
																			if (i_10 != 2 && i_10 != 3) {
																				if (i_10 == 1) {
																					MapRegionLoaderTask.appendMessage(i_82, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + string_88, string_88, string_17, class282_sub4_102.aString7501, i_11);
																				} else {
																					MapRegionLoaderTask.appendMessage(i_82, 0, string_88, string_88, string_88, string_17, class282_sub4_102.aString7501, i_11);
																				}
																			} else {
																				MapRegionLoaderTask.appendMessage(i_82, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + string_88, string_88, string_17, class282_sub4_102.aString7501, i_11);
																			}
																		}

																		class184_0.aClass375_2286 = null;
																		return true;
																	} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4377) {
																		i_24 = rsbitsbuffer_3.readUnsignedShort();
																		long_47 = rsbitsbuffer_3.readLong(923196069);
																		if (Class46.anObjectArray437 == null) {
																			Class46.anObjectArray437 = new Object[IndexLoaders.aClass394_5831.anInt4785];
																		}

																		Class46.anObjectArray437[i_24] = new Long(long_47);
																		client.anIntArray7222[++client.anInt7390 - 1 & 0x1f] = i_24;
																		class184_0.aClass375_2286 = null;
																		return true;
																	} else {
																		long long_55;
																		if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4493) {
																			bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																			string_88 = rsbitsbuffer_3.readString();
																			str_92 = string_88;
																			if (bool_91) {
																				str_92 = rsbitsbuffer_3.readString();
																			}

																			long_28 = rsbitsbuffer_3.readLong(1356149635);
																			long_30 = (long) rsbitsbuffer_3.readUnsignedShort();
																			long_55 = (long) rsbitsbuffer_3.read24BitUnsignedInteger();
																			i_35 = rsbitsbuffer_3.readUnsignedByte();
																			i_77 = rsbitsbuffer_3.readUnsignedShort();
																			long long_57 = (long_30 << 32) + long_55;
																			bool_115 = false;
																			i_82 = 0;

																			while (true) {
																				if (i_82 >= 100) {
																					if (i_35 <= 1 && Class280.method4975(str_92, (byte) -44)) {
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
																				String string_41 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_77, -1839082633).fillDynamicValues(rsbitsbuffer_3, (byte) 0);
																				if (i_35 == 2) {
																					MapRegionLoaderTask.appendMessage(20, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_41, Class179.method3018(long_28), i_77);
																				} else if (i_35 == 1) {
																					MapRegionLoaderTask.appendMessage(20, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_41, Class179.method3018(long_28), i_77);
																				} else {
																					MapRegionLoaderTask.appendMessage(20, 0, string_88, str_92, string_88, string_41, Class179.method3018(long_28), i_77);
																				}
																			}

																			class184_0.aClass375_2286 = null;
																			return true;
																		} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4510) {
																			string_63 = rsbitsbuffer_3.readString();
																			i_5 = rsbitsbuffer_3.readUnsignedShort();
																			str_92 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_5, -1726302200).fillDynamicValues(rsbitsbuffer_3, (byte) 0);
																			MapRegionLoaderTask.appendMessage(19, 0, string_63, string_63, string_63, str_92, (String) null, i_5);
																			class184_0.aClass375_2286 = null;
																			return true;
																		} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4484) {
																			i_24 = rsbitsbuffer_3.readUnsignedShort();
																			i_5 = rsbitsbuffer_3.readInt();
																			if (Class46.anObjectArray437 == null) {
																				Class46.anObjectArray437 = new Object[IndexLoaders.aClass394_5831.anInt4785];
																			}

																			Class46.anObjectArray437[i_24] = new Integer(i_5);
																			client.anIntArray7222[++client.anInt7390 - 1 & 0x1f] = i_24;
																			class184_0.aClass375_2286 = null;
																			return true;
																		} else if (class184_0.aClass375_2286 == IncomingPacket.WORLD_TILE) {
																			Class158_Sub1_Sub2.anInt10131 = rsbitsbuffer_3.readByte128(2090412640) << 3;
																			Class272.anInt3331 = rsbitsbuffer_3.readUnsignedByte128(-2083264480);
																			SceneObjectType.anInt5495 = rsbitsbuffer_3.readByte128(1860551613) << 3;
																			class184_0.aClass375_2286 = null;
																			return true;
																		} else {
																			IComponentSettings class282_sub10_45;
																			IComponentSettings class282_sub10_46;
																			if (class184_0.aClass375_2286 == IncomingPacket.ICOMPONENT_SETTINGS) {
																				i_24 = rsbitsbuffer_3.readShortLE128();
																				if (i_24 == 65535) {
																					i_24 = -1;
																				}

																				i_5 = rsbitsbuffer_3.readIntV2(-1820495375);
																				i_6 = rsbitsbuffer_3.readUnsignedShort();
																				if (i_6 == 65535) {
																					i_6 = -1;
																				}

																				i_7 = rsbitsbuffer_3.readIntLE();
																				Class470.method7825(745585795);

																				for (i_8 = i_6; i_8 <= i_24; i_8++) {
																					long_30 = (long) i_8 + ((long) i_5 << 32);
																					class282_sub10_46 = (IComponentSettings) client.aClass465_7405.get(long_30);
																					if (class282_sub10_46 == null) {
																						if (i_8 == -1) {
																							class282_sub10_45 = new IComponentSettings(i_7, Class117.method1981(i_5, (byte) 67).aClass282_Sub10_1364.interfaceId);
																						} else {
																							class282_sub10_45 = new IComponentSettings(i_7, -1);
																						}
																					} else {
																						class282_sub10_45 = new IComponentSettings(i_7, class282_sub10_46.interfaceId);
																						class282_sub10_46.remove();
																					}

																					client.aClass465_7405.method7765(class282_sub10_45, long_30);
																				}

																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4375) {
																				i_24 = rsbitsbuffer_3.readUnsignedByte();
																				i_5 = rsbitsbuffer_3.readBigSmart();
																				if (client.aClass281Array7180[i_24] != null) {
																					client.aClass281Array7180[i_24].method4979(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1999339488), -617722573);
																					client.aClass281Array7180[i_24] = null;
																				}

																				if (i_5 != -1) {
																					client.aClass281Array7180[i_24] = new Class281(Renderers.SOFTWARE_RENDERER, rsbitsbuffer_3, i_5);
																					client.aClass281Array7180[i_24].method4978(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1306272287), (byte) -1);
																				}

																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4404) {
																				Class185.method3077(1093107755);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4405) {
																				i_24 = rsbitsbuffer_3.readInt();
																				i_5 = rsbitsbuffer_3.readInt();
																				TCPMessage tcpmessage_111 = Class271.method4828(OutgoingPacket.aClass379_4595, class184_0.isaac, 2042092);
																				tcpmessage_111.buffer.writeIntV2(i_24, (byte) 104);
																				tcpmessage_111.buffer.writeIntV1(i_5, -1650869516);
																				tcpmessage_111.buffer.write128Byte(client.FPS, -826747048);
																				class184_0.method3049(tcpmessage_111, -917310259);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4464) {
																				Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4216, 1197049024);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4474) {
																				i_24 = rsbitsbuffer_3.readUnsignedShort();
																				byte b_84 = rsbitsbuffer_3.readByte();
																				if (Class46.anObjectArray437 == null) {
																					Class46.anObjectArray437 = new Object[IndexLoaders.aClass394_5831.anInt4785];
																				}

																				Class46.anObjectArray437[i_24] = new Integer(b_84);
																				client.anIntArray7222[++client.anInt7390 - 1 & 0x1f] = i_24;
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4458) {
																				Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4205, 1052430539);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4393) {
																				i_24 = rsbitsbuffer_3.readUnsignedByteC(726740720);
																				i_5 = rsbitsbuffer_3.readShortLE((byte) -122);
																				bool_76 = (i_24 & 0x1) == 1;
																				Class29.method788(i_5, bool_76, -2088356489);
																				client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = i_5;
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4491) {
																				if (Class282_Sub17.lobbyState(client.gameState, -1298993736)) {
																					client.anInt7178 = (int) ((float) rsbitsbuffer_3.readUnsignedShort() * 2.5F);
																				} else {
																					client.anInt7178 = rsbitsbuffer_3.readUnsignedShort() * 30;
																				}

																				client.anInt7397 = client.anInt7347;
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4479) {
																				Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4214, 1188928157);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4392) {
																				SceneObjectType.anInt5495 = rsbitsbuffer_3.read128Byte((short) 15542) << 3;
																				Class158_Sub1_Sub2.anInt10131 = rsbitsbuffer_3.readByte() << 3;
																				Class272.anInt3331 = rsbitsbuffer_3.readUnsignedByte();
																				CoordGrid coordgrid_67 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(902676925);

																				for (Class282_Sub29 class282_sub29_109 = (Class282_Sub29) client.aClass465_7414.method7750(-1866877180); class282_sub29_109 != null; class282_sub29_109 = (Class282_Sub29) client.aClass465_7414.method7751((byte) 48)) {
																					i_6 = (int) (class282_sub29_109.data >> 28 & 0x3L);
																					i_7 = (int) (class282_sub29_109.data & 0x3fffL);
																					i_8 = i_7 - coordgrid_67.x;
																					i_9 = (int) (class282_sub29_109.data >> 14 & 0x3fffL);
																					i_10 = i_9 - coordgrid_67.y;
																					if (i_6 == Class272.anInt3331 && i_8 >= SceneObjectType.anInt5495 && i_8 < SceneObjectType.anInt5495 + 8 && i_10 >= Class158_Sub1_Sub2.anInt10131 && i_10 < Class158_Sub1_Sub2.anInt10131 + 8) {
																						class282_sub29_109.remove();
																						if (i_8 >= 0 && i_10 >= 0 && i_8 < IndexLoaders.MAP_REGION_DECODER.getSizeX(-359634463) && i_10 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-542957162)) {
																							Class434_Sub1.method12760(Class272.anInt3331, i_8, i_10, -1380263584);
																						}
																					}
																				}

																				Class282_Sub31 class282_sub31_110;
																				for (class282_sub31_110 = (Class282_Sub31) Class282_Sub31.aClass482_7775.head((byte) 94); class282_sub31_110 != null; class282_sub31_110 = (Class282_Sub31) Class282_Sub31.aClass482_7775.next(-766641666)) {
																					if (class282_sub31_110.anInt7762 >= SceneObjectType.anInt5495 && class282_sub31_110.anInt7762 < SceneObjectType.anInt5495 + 8 && class282_sub31_110.anInt7763 >= Class158_Sub1_Sub2.anInt10131 && class282_sub31_110.anInt7763 < Class158_Sub1_Sub2.anInt10131 + 8 && class282_sub31_110.anInt7764 == Class272.anInt3331) {
																						class282_sub31_110.aBool7774 = true;
																					}
																				}

																				for (class282_sub31_110 = (Class282_Sub31) Class282_Sub31.aClass482_7776.head((byte) 125); class282_sub31_110 != null; class282_sub31_110 = (Class282_Sub31) Class282_Sub31.aClass482_7776.next(804942724)) {
																					if (class282_sub31_110.anInt7762 >= SceneObjectType.anInt5495 && class282_sub31_110.anInt7762 < SceneObjectType.anInt5495 + 8 && class282_sub31_110.anInt7763 >= Class158_Sub1_Sub2.anInt10131 && class282_sub31_110.anInt7763 < Class158_Sub1_Sub2.anInt10131 + 8 && class282_sub31_110.anInt7764 == Class272.anInt3331) {
																						class282_sub31_110.aBool7774 = true;
																					}
																				}

																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4487) {
																				i_24 = rsbitsbuffer_3.readUnsignedShort();
																				if (i_24 == 65535) {
																					i_24 = -1;
																				}

																				i_5 = rsbitsbuffer_3.readUnsignedByte();
																				i_6 = rsbitsbuffer_3.readUnsignedShort();
																				i_7 = rsbitsbuffer_3.readUnsignedByte();
																				i_8 = rsbitsbuffer_3.readUnsignedShort();
																				Class153.method2618(i_24, i_5, i_6, i_7, i_8, 1278035776);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4372) {
																				bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																				Class470.method7825(1191925088);
																				Class96_Sub6.aBool9173 = bool_91;
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4441) {
																				rsbitsbuffer_3.index += 28;
																				if (rsbitsbuffer_3.method13105((byte) 80)) {
																					Class496.method8309(rsbitsbuffer_3, rsbitsbuffer_3.index - 28, 1177161322);
																				}

																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4430) {
																				i_24 = rsbitsbuffer_3.readUnsignedByte();
																				i_5 = i_24 >> 5;
																				i_6 = i_24 & 0x1f;
																				if (i_6 == 0) {
																					client.aClass180Array7348[i_5] = null;
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else {
																					Class180 class180_129 = new Class180();
																					class180_129.anInt2236 = i_6;
																					class180_129.anInt2240 = rsbitsbuffer_3.readUnsignedByte();
																					if (class180_129.anInt2240 >= 0 && class180_129.anInt2240 < Class391.aClass160Array4778.length) {
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
																								class180_129.anInt2239 = rsbitsbuffer_3.readUnsignedByte();
																								CoordGrid coordgrid_133 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(2046392322);
																								class180_129.anInt2243 += rsbitsbuffer_3.readUnsignedShort() - coordgrid_133.x << 9;
																								class180_129.anInt2235 += rsbitsbuffer_3.readUnsignedShort() - coordgrid_133.y << 9;
																								class180_129.anInt2241 = rsbitsbuffer_3.readUnsignedByte() << 2;
																								class180_129.anInt2237 = rsbitsbuffer_3.readUnsignedShort();
																							}
																						} else {
																							class180_129.anInt2238 = rsbitsbuffer_3.readUnsignedShort();
																							class180_129.anInt2244 = rsbitsbuffer_3.readUnsignedShort();
																							rsbitsbuffer_3.index += 4;
																						}

																						class180_129.anInt2242 = rsbitsbuffer_3.readInt();
																						client.aClass180Array7348[i_5] = class180_129;
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				}
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4429) {
																				i_24 = rsbitsbuffer_3.readUnsignedByte128(-1139286912) * 4;
																				i_5 = rsbitsbuffer_3.readUnsignedShortLE128(-1358044133);
																				i_6 = rsbitsbuffer_3.readShortLE((byte) -25);
																				i_7 = rsbitsbuffer_3.readShort();
																				i_8 = rsbitsbuffer_3.readUnsignedByte128(-850673914);
																				i_9 = rsbitsbuffer_3.readUnsignedShort128();
																				i_10 = rsbitsbuffer_3.readUnsignedShort();
																				i_11 = rsbitsbuffer_3.readShortLE128();
																				i_12 = rsbitsbuffer_3.readShortLE128();
																				i_35 = rsbitsbuffer_3.readUnsignedByte128(-1518251062);
																				if (i_35 == 255) {
																					i_35 = -1;
																				}

																				byte b_75 = rsbitsbuffer_3.readByteC(-1483186607);
																				byte b_79 = rsbitsbuffer_3.readByteC(616572083);
																				i_81 = rsbitsbuffer_3.readUnsignedShort128();
																				i_34 = rsbitsbuffer_3.readUnsignedByteC(-1005375060);
																				boolean bool_18 = (i_8 & 0x1) != 0;
																				boolean bool_19 = (i_8 & 0x2) != 0;
																				i_40 = bool_19 ? i_8 >> 2 : -1;
																				if (bool_19) {
																					i_34 = (byte) i_34;
																				} else {
																					i_34 *= 4;
																				}

																				CoordGrid coordgrid_39 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(2057571253);
																				int i_59 = i_81 - coordgrid_39.x * 2;
																				int i_23 = i_9 - coordgrid_39.y * 2;
																				i_77 = b_75 + i_59;
																				i_15 = b_79 + i_23;
																				if (i_59 >= 0 && i_23 >= 0 && i_59 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1885615957) * 2 && i_23 < IndexLoaders.MAP_REGION_DECODER.getSizeX(1685736884) * 2 && i_77 >= 0 && i_15 >= 0 && i_77 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1422128606) * 2 && i_15 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1745798122) * 2 && i_12 != 65535) {
																					i_59 *= 256;
																					i_23 *= 256;
																					i_77 *= 256;
																					i_15 *= 256;
																					i_34 <<= 2;
																					i_24 <<= 2;
																					i_10 <<= 2;
																					Class438.method7335(i_12, i_5, i_7, i_40, i_34, i_24, i_59, i_23, i_77, i_15, i_11, i_6, i_35, i_10, bool_18, 1771137455);
																				}

																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4358) {
																				bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																				byte[] bytes_107 = new byte[class184_0.anInt2287 - 1];
																				rsbitsbuffer_3.readBytes(bytes_107, 0, class184_0.anInt2287 - 1, 1093492861);
																				Class151.method2589(bool_91, bytes_107, -1912381757);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.VARPBIT_2) {
																				i_24 = rsbitsbuffer_3.readIntV2(-1778621836);
																				i_5 = rsbitsbuffer_3.readUnsignedShort128();
																				Class158_Sub1.PLAYER_VAR_PROVIDER.method268(i_5, i_24, -1714881897);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4362) {
																				i_24 = rsbitsbuffer_3.readShortLE128();
																				Class470.method7825(869737055);
																				Class92.method1563(i_24, 1917715893);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4488) {
																				client.anInt7192 = client.anInt7347;
																				bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																				if (class184_0.anInt2287 == 1) {
																					if (bool_91) {
																						Class58.aClass61_528 = null;
																					} else {
																						Class282_Sub13.aClass61_7587 = null;
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else {
																					if (bool_91) {
																						Class58.aClass61_528 = new Class61(rsbitsbuffer_3);
																					} else {
																						Class282_Sub13.aClass61_7587 = new Class61(rsbitsbuffer_3);
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				}
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4457) {
																				i_24 = rsbitsbuffer_3.readUnsignedShort();
																				Class470.method7825(711453188);
																				Class123.method2152(i_24, -1865446551);
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4450) {
																				i_24 = rsbitsbuffer_3.readUnsignedShort();
																				i_5 = rsbitsbuffer_3.readUnsignedByte();

																				for (bool_76 = (i_5 & 0x1) == 1; rsbitsbuffer_3.index < class184_0.anInt2287; Class282_Sub21.method12353(i_24, i_7, i_8 - 1, i_9, bool_76, -1281904163)) {
																					i_7 = rsbitsbuffer_3.readUnsignedSmart(1532067241);
																					i_8 = rsbitsbuffer_3.readUnsignedShort();
																					i_9 = 0;
																					if (i_8 != 0) {
																						i_9 = rsbitsbuffer_3.readUnsignedByte();
																						if (i_9 == 255) {
																							i_9 = rsbitsbuffer_3.readInt();
																						}
																					}
																				}

																				client.anIntArray7381[++client.anInt7382 - 1 & 0x1f] = i_24;
																				class184_0.aClass375_2286 = null;
																				return true;
																			} else if (class184_0.aClass375_2286 == IncomingPacket.PING) {
																				class184_0.aClass375_2286 = null;
																				return false;
																			} else {
																				byte b_100;
																				if (class184_0.aClass375_2286 == IncomingPacket.CONFIG_1) {
																					b_100 = rsbitsbuffer_3.readByte();
																					i_5 = rsbitsbuffer_3.readShortLE128();
																					Class158_Sub1.PLAYER_VAR_PROVIDER.method281(i_5, b_100, (byte) 16);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4359) {
																					i_24 = rsbitsbuffer_3.readUnsigned128Byte();
																					i_5 = rsbitsbuffer_3.readUnsignedByte();
																					i_6 = rsbitsbuffer_3.readUnsignedByteC(1030625671);
																					i_7 = rsbitsbuffer_3.readInt();
																					i_8 = rsbitsbuffer_3.readIntV1();
																					i_9 = i_8 >> 28;
																					i_10 = i_8 >> 14 & 0x3fff;
																					i_11 = i_8 & 0x3fff;
																					Class320.method5731(i_9, i_10, i_11, i_24, i_6, i_7, i_5, -595463761);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4497) {
																					if (client.anInt7349 != -1) {
																						Class383.method6514(client.anInt7349, 0, 1952807696);
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4370) {
																					string_63 = rsbitsbuffer_3.readString();
																					bool_66 = rsbitsbuffer_3.readUnsignedByte() == 1;
																					if (bool_66) {
																						str_92 = rsbitsbuffer_3.readString();
																					} else {
																						str_92 = string_63;
																					}

																					i_7 = rsbitsbuffer_3.readUnsignedShort();
																					byte b_72 = rsbitsbuffer_3.readByte();
																					bool_69 = false;
																					if (b_72 == -128) {
																						bool_69 = true;
																					}

																					if (bool_69) {
																						if (Class459.anInt5534 == 0) {
																							class184_0.aClass375_2286 = null;
																							return true;
																						}

																						boolean bool_71 = false;

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
																						str_25 = rsbitsbuffer_3.readString();
																						Class173 class173_138 = new Class173();
																						class173_138.aString2129 = string_63;
																						class173_138.aString2127 = str_92;
																						class173_138.aString2128 = Class383.method6515(class173_138.aString2127, 1942118537);
																						class173_138.anInt2131 = i_7;
																						class173_138.aByte2126 = b_72;
																						class173_138.aString2130 = str_25;

																						for (i_12 = Class459.anInt5534 - 1; i_12 >= 0; --i_12) {
																							i_35 = Class467.aClass173Array5575[i_12].aString2128.compareTo(class173_138.aString2128);
																							if (i_35 == 0) {
																								Class467.aClass173Array5575[i_12].anInt2131 = i_7;
																								Class467.aClass173Array5575[i_12].aByte2126 = b_72;
																								Class467.aClass173Array5575[i_12].aString2130 = str_25;
																								if (str_92.equals(Class84.myPlayer.displayName)) {
																									Class48_Sub2.aByte9263 = b_72;
																								}

																								client.anInt7179 = client.anInt7347;
																								class184_0.aClass375_2286 = null;
																								return true;
																							}

																							if (i_35 < 0) {
																								break;
																							}
																						}

																						if (Class459.anInt5534 >= Class467.aClass173Array5575.length) {
																							class184_0.aClass375_2286 = null;
																							return true;
																						}

																						for (i_35 = Class459.anInt5534 - 1; i_35 > i_12; --i_35) {
																							Class467.aClass173Array5575[i_35 + 1] = Class467.aClass173Array5575[i_35];
																						}

																						if (Class459.anInt5534 == 0) {
																							Class467.aClass173Array5575 = new Class173[100];
																						}

																						Class467.aClass173Array5575[i_12 + 1] = class173_138;
																						++Class459.anInt5534;
																						if (str_92.equals(Class84.myPlayer.displayName)) {
																							Class48_Sub2.aByte9263 = b_72;
																						}
																					}

																					client.anInt7179 = client.anInt7347;
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4383) {
																					i_24 = rsbitsbuffer_3.readIntV1();
																					i_5 = rsbitsbuffer_3.readShortLE128();
																					i_6 = rsbitsbuffer_3.readUnsignedShort();
																					if (i_6 == 65535) {
																						i_6 = -1;
																					}

																					i_7 = rsbitsbuffer_3.readUnsignedShort128();
																					if (i_7 == 65535) {
																						i_7 = -1;
																					}

																					Class470.method7825(-1105399171);

																					for (i_8 = i_7; i_8 <= i_6; i_8++) {
																						long_30 = (long) i_8 + ((long) i_24 << 32);
																						class282_sub10_46 = (IComponentSettings) client.aClass465_7405.get(long_30);
																						if (class282_sub10_46 == null) {
																							if (i_8 == -1) {
																								class282_sub10_45 = new IComponentSettings(Class117.method1981(i_24, (byte) 100).aClass282_Sub10_1364.settings, i_5);
																							} else {
																								class282_sub10_45 = new IComponentSettings(0, i_5);
																							}
																						} else {
																							class282_sub10_45 = new IComponentSettings(class282_sub10_46.settings, i_5);
																							class282_sub10_46.remove();
																						}

																						client.aClass465_7405.method7765(class282_sub10_45, long_30);
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4384) {
																					i_24 = rsbitsbuffer_3.readUnsignedByte128(-1543145246);
																					i_5 = rsbitsbuffer_3.readInt();
																					Class470.method7825(278578436);
																					Class149_Sub4.method14663(i_5, i_24, (byte) 0);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4480) {
																					client.anInt7395 = client.anInt7347;
																					bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																					Class349 class349_105 = new Class349(rsbitsbuffer_3);
																					Class282_Sub4 class282_sub4_108;
																					if (bool_91) {
																						class282_sub4_108 = Class113.aClass282_Sub4_1235;
																					} else {
																						class282_sub4_108 = Class202_Sub1.aClass282_Sub4_8186;
																					}

																					class349_105.method6179(class282_sub4_108, (short) -12831);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.REGION) {
																					rsbitsbuffer_65 = new RsBitsBuffer(class184_0.anInt2287);
																					System.arraycopy(class184_0.recievedBuffer.buffer, class184_0.recievedBuffer.index, rsbitsbuffer_65.buffer, 0, class184_0.anInt2287);
																					FontMetrics.method6989(1407669515);
																					if (Class393.preferences.aClass468_Sub3_8199.method12632(621836544) == 1) {
																						IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3158, rsbitsbuffer_65), 301123709);
																					} else {
																						IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3158, rsbitsbuffer_65), 1089182926);
																					}

																					class184_0.aClass375_2286 = null;
																					return false;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.REMOVE_GROUND_ITEM) {
																					Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4207, 915834659);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4417) {
																					i_24 = rsbitsbuffer_3.readIntV2(-433591239);
																					i_5 = rsbitsbuffer_3.readInt();
																					Class470.method7825(1816561941);
																					Class184.method3069(i_5, i_24, 393215246);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4351) {
																					Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4218, 385099520);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4381) {
																					i_24 = rsbitsbuffer_3.readIntV2(-389607229);
																					i_5 = rsbitsbuffer_3.readShortLE128();
																					Class158_Sub1.PLAYER_VAR_PROVIDER.method281(i_5, i_24, (byte) -17);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4407) {
																					i_24 = rsbitsbuffer_3.readInt();
																					Class470.method7825(-1159345533);
																					Class282_Sub44 class282_sub44_103 = (Class282_Sub44) client.aClass465_7442.get((long) i_24);
																					if (class282_sub44_103 != null) {
																						Class351.method6196(class282_sub44_103, true, false, -1452683291);
																					}

																					if (client.aClass118_7352 != null) {
																						Class109.method1858(client.aClass118_7352, (byte) 55);
																						client.aClass118_7352 = null;
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4490) {
																					i_24 = rsbitsbuffer_3.readInt();
																					i_5 = rsbitsbuffer_3.readUnsignedByte();
																					i_6 = rsbitsbuffer_3.readUnsignedByte();
																					client.anIntArray7338[i_5] = i_24;
																					client.anIntArray7336[i_5] = i_6;
																					client.anIntArray7337[i_5] = 1;
																					i_7 = Class516.anIntArray5895[i_5] - 1;

																					for (i_8 = 0; i_8 < i_7; i_8++) {
																						if (i_24 >= Class516.anIntArray5896[i_8]) {
																							client.anIntArray7337[i_5] = i_8 + 2;
																						}
																					}

																					client.anIntArray7283[++client.anInt7384 - 1 & 0x1f] = i_5;
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4453) {
																					b_100 = rsbitsbuffer_3.readByte();
																					i_5 = rsbitsbuffer_3.readUnsignedByteC(-1202169109);
																					Class470.method7825(-603286899);
																					Class52_Sub2.method14501(b_100, i_5, 1624203213);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4440) {
																					Class46.anObjectArray437 = new Object[IndexLoaders.aClass394_5831.anInt4785];
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4495) {
																					i_24 = rsbitsbuffer_3.readIntV2(-544566311);
																					i_5 = rsbitsbuffer_3.readShortLE((byte) -57);
																					i_6 = rsbitsbuffer_3.readShortLE((byte) -93);
																					i_7 = rsbitsbuffer_3.readUnsignedByte();
																					Class470.method7825(-126108182);
																					Class506.method8722(i_24, i_7, i_5, i_6, 1767108719);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4397) {
																					bool_91 = rsbitsbuffer_3.readUnsigned128Byte() == 1;
																					i_5 = rsbitsbuffer_3.readIntV2(-247300590);
																					Class470.method7825(1854453567);
																					Class199.method3252(i_5, bool_91, -1395501412);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4352) {
																					i_24 = rsbitsbuffer_3.readUnsignedByte();
																					Class466 class466_98 = (Class466) Class386.method6672(Class335.method5963(-5009614), i_24, -2108912489);
																					if (class466_98 == null) {
																						class466_98 = Class466.aClass466_5563;
																					}

																					JS5CacheRequest.method14949(class466_98, 1453204131);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4508) {
																					Class504.anInt5832 = rsbitsbuffer_3.read24BitInteger(1949038328);
																					client.aBool7224 = rsbitsbuffer_3.readUnsignedByte() == 1;
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4410) {
																					i_24 = rsbitsbuffer_3.readIntLE();
																					i_5 = rsbitsbuffer_3.readUnsignedByte();
																					i_6 = rsbitsbuffer_3.readIntV1();
																					i_7 = rsbitsbuffer_3.readUnsignedShort();
																					i_8 = rsbitsbuffer_3.readInt();
																					i_9 = rsbitsbuffer_3.readIntV1();
																					i_10 = rsbitsbuffer_3.readIntV1();
																					i_11 = rsbitsbuffer_3.readShortLE((byte) -104);
																					Class470.method7825(726119231);
																					Class31.method812(i_9, new Class282_Sub44_Sub2(i_7, i_5, i_11), new int[] { i_6, i_8, i_10, i_24 }, false, (byte) 25);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4502) {
																					client.anInt7192 = client.anInt7347;
																					bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																					Class348 class348_97 = new Class348(rsbitsbuffer_3);
																					Class61 class61_99;
																					if (bool_91) {
																						class61_99 = Class58.aClass61_528;
																					} else {
																						class61_99 = Class282_Sub13.aClass61_7587;
																					}

																					class348_97.method6173(class61_99, -1753022365);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4421) {
																					i_24 = rsbitsbuffer_3.readUnsigned128Byte();
																					i_5 = rsbitsbuffer_3.readUnsigned128Byte();
																					if (i_24 == 255) {
																						i_24 = -1;
																						i_5 = -1;
																					}

																					Defaults8Loader.method11155(i_24, i_5, -1859663619);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4505) {
																					Class187.anInt2363 = rsbitsbuffer_3.readUnsignedByte();
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4402) {
																					i_24 = rsbitsbuffer_3.readUnsignedShort128();
																					i_5 = rsbitsbuffer_3.readIntLE();
																					Class470.method7825(-963697092);
																					Class282_Sub20_Sub21.method15381(i_5, i_24, -665241735);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.INTERFACE) {
																					i_24 = rsbitsbuffer_3.readInt();
																					i_5 = rsbitsbuffer_3.readIntV2(-1694964243);
																					i_6 = rsbitsbuffer_3.readIntV2(-346063041);
																					i_7 = rsbitsbuffer_3.readShortLE128();
																					i_8 = rsbitsbuffer_3.readIntLE();
																					i_9 = rsbitsbuffer_3.readInt();
																					i_10 = rsbitsbuffer_3.readUnsignedByteC(1579852251);
																					Class470.method7825(473378556);
																					Class31.method812(i_9, new Class282_Sub44(i_7, i_10), new int[] { i_24, i_6, i_5, i_8 }, false, (byte) 25);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4438) {
																					i_24 = rsbitsbuffer_3.readUnsignedByte();
																					Class494 class494_96 = (Class494) Class386.method6672(UnderlayIndexLoader.method8038((byte) 99), i_24, -1560493235);
																					if (class494_96 == null) {
																						class494_96 = Class494.aClass494_5782;
																					}

																					Class468_Sub26.method12948(class494_96, -16711936);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4462) {
																					string_63 = rsbitsbuffer_3.readString();
																					i_5 = rsbitsbuffer_3.readUnsignedByte128(-694816925);
																					i_6 = rsbitsbuffer_3.readShortLE128();
																					if (i_6 == 65535) {
																						i_6 = -1;
																					}

																					i_7 = rsbitsbuffer_3.readUnsignedByteC(1148216670);
																					if (i_5 >= 1 && i_5 <= 8) {
																						if (string_63.equalsIgnoreCase("null")) {
																							string_63 = null;
																						}

																						client.aStringArray7329[i_5 - 1] = string_63;
																						client.anIntArray7328[i_5 - 1] = i_6;
																						client.aBoolArray7330[i_5 - 1] = i_7 == 0;
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4463) {
																					i_24 = rsbitsbuffer_3.readUnsignedShort();
																					if (i_24 == 65535) {
																						i_24 = -1;
																					}

																					i_5 = rsbitsbuffer_3.readInt();
																					i_6 = rsbitsbuffer_3.readIntV2(-1389778745);
																					Class470.method7825(-586263541);
																					Class96_Sub9.method14587(i_5, i_24, i_6, (short) -342);
																					ItemDefinitions itemdefinitions_128 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_24, 985436598);
																					Class149_Sub1.method14583(i_5, itemdefinitions_128.modelRotationX, itemdefinitions_128.modelRotationY, itemdefinitions_128.modelZoom, -2105289855);
																					Class28.method778(i_5, itemdefinitions_128.modelOffsetX, itemdefinitions_128.modelOffsetY, itemdefinitions_128.modelRotationZ, (byte) 16);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4481) {
																					i_24 = rsbitsbuffer_3.readShortLE((byte) -74);
																					i_5 = rsbitsbuffer_3.readUnsignedShort128();
																					i_6 = rsbitsbuffer_3.readUnsignedShort128();
																					i_7 = rsbitsbuffer_3.readIntV2(-1297851300);
																					Class470.method7825(754356437);
																					Class96_Sub3.method13786(i_7, 7, i_24 << 16 | i_6, i_5, (byte) -41);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4354) {
																					Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4204, 1220604522);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4423) {
																					i_24 = rsbitsbuffer_3.readIntV1();
																					Class470.method7825(627328237);
																					Class96_Sub3.method13786(i_24, 5, client.anInt7315, 0, (byte) -60);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4428) {
																					i_24 = rsbitsbuffer_3.readShortLE128();
																					if (i_24 == 65535) {
																						i_24 = -1;
																					}

																					Class332.method5930(i_24, (byte) 38);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4492) {
																					i_24 = rsbitsbuffer_3.readUnsignedShort();
																					Whirlpool.method7421(i_24, 2001451534);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.CREATE_OBJECT) {
																					Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4208, 428929195);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4443) {
																					string_63 = rsbitsbuffer_3.readString();
																					string_88 = Class182.method3044(Defaults7Loader.method8755(rsbitsbuffer_3, (byte) 116), -1519993030);
																					Class191.method3167(6, 0, string_63, string_63, string_63, string_88, 1342704972);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.CREATE_GROUND_ITEM) {
																					Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4206, 894121342);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4452) {
																					client.anInt7434 = 1;
																					client.anInt7386 = client.anInt7347;
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.PLAYER_ON_ICOMPONENT) {
																					i_24 = rsbitsbuffer_3.readIntLE();
																					Class470.method7825(889183110);
																					Class96_Sub3.method13786(i_24, 3, client.anInt7315, 0, (byte) -81);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4426) {
																					i_24 = rsbitsbuffer_3.readIntLE();
																					if (i_24 != Class354.anInt4112) {
																						Class354.anInt4112 = i_24;
																						Class210.method3614(Class397.aClass397_4812, -1, -1, (byte) 95);
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4449) {
																					JS5StandardRequester.method5560(rsbitsbuffer_3, class184_0.anInt2287, -822486096);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.VARPBIT_1) {
																					i_24 = rsbitsbuffer_3.readUnsignedShort();
																					i_5 = rsbitsbuffer_3.readUnsignedByte128(-1075041075);
																					Class158_Sub1.PLAYER_VAR_PROVIDER.method268(i_24, i_5, -1140695527);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4361) {
																					bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																					string_88 = rsbitsbuffer_3.readString();
																					str_92 = string_88;
																					if (bool_91) {
																						str_92 = rsbitsbuffer_3.readString();
																					}

																					long_28 = (long) rsbitsbuffer_3.readUnsignedShort();
																					long_30 = (long) rsbitsbuffer_3.read24BitUnsignedInteger();
																					i_11 = rsbitsbuffer_3.readUnsignedByte();
																					long_53 = (long_28 << 32) + long_30;
																					bool_14 = false;
																					i_15 = 0;

																					while (true) {
																						if (i_15 >= 100) {
																							if (i_11 <= 1) {
																								if ((!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
																									if (Class280.method4975(str_92, (byte) -73)) {
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
																						String string_118 = Class182.method3044(Defaults7Loader.method8755(rsbitsbuffer_3, (byte) 81), -1519993030);
																						if (i_11 == 2) {
																							MapRegionLoaderTask.appendMessage(7, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_118, (String) null, -1);
																						} else if (i_11 == 1) {
																							MapRegionLoaderTask.appendMessage(7, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_118, (String) null, -1);
																						} else {
																							MapRegionLoaderTask.appendMessage(3, 0, string_88, str_92, string_88, string_118, (String) null, -1);
																						}
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.GLOBAL_CONFIG_2) {
																					b_100 = rsbitsbuffer_3.read128Byte((short) -6566);
																					i_5 = rsbitsbuffer_3.readShortLE((byte) -105);
																					Class470.method7825(865938232);
																					Class393.method6751(i_5, b_100, 1876892604);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.CONFIG_2) {
																					i_24 = rsbitsbuffer_3.readInt();
																					i_5 = rsbitsbuffer_3.readIntV1();
																					Class470.method7825(1770241922);
																					Class282_Sub11_Sub1.method15435(i_5, i_24, (byte) -67);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4386) {
																					i_24 = rsbitsbuffer_3.readIntV2(-1649128015);
																					i_5 = rsbitsbuffer_3.readIntV2(-1377250026);
																					Class470.method7825(-971334097);
																					ObjectIndexLoader.method7917(i_5, i_24, (byte) 2);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4396) {
																					i_24 = rsbitsbuffer_3.readUnsignedShort();
																					i_5 = rsbitsbuffer_3.readUnsignedShort();
																					i_6 = rsbitsbuffer_3.readUnsignedShort();
																					Class470.method7825(-958341641);
																					if (Class468_Sub8.aClass98Array7889[i_24] != null) {
																						for (i_7 = i_5; i_7 < i_6; i_7++) {
																							i_8 = rsbitsbuffer_3.read24BitUnsignedInteger();
																							if (i_7 < Class468_Sub8.aClass98Array7889[i_24].components.length && Class468_Sub8.aClass98Array7889[i_24].components[i_7] != null) {
																								Class468_Sub8.aClass98Array7889[i_24].components[i_7].anInt1414 = i_8;
																							}
																						}
																					}

																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4435) {
																					Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4209, 408109448);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.PLAYER_UPDATE) {
																					Class282_Sub34.decodePlayerUpdate(rsbitsbuffer_3, class184_0.anInt2287, (byte) 3);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4371) {
																					i_24 = rsbitsbuffer_3.readUnsignedByte();
																					i_5 = rsbitsbuffer_3.readUnsignedByte();
																					i_6 = rsbitsbuffer_3.readUnsigned128Byte();
																					i_7 = rsbitsbuffer_3.readShortLE((byte) -27) << 2;
																					i_8 = rsbitsbuffer_3.readUnsignedByte128(-904691893);
																					Class470.method7825(-450255418);
																					RouteStrategy.method3794(i_5, i_24, i_7, i_6, i_8, true, (byte) -1);
																					class184_0.aClass375_2286 = null;
																					return true;
																				} else {
																					CoordGrid coordgrid_36;
																					if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4432) {
																						bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																						string_88 = rsbitsbuffer_3.readString();
																						long_49 = (long) rsbitsbuffer_3.readUnsignedShort();
																						long_51 = (long) rsbitsbuffer_3.read24BitUnsignedInteger();
																						i_10 = rsbitsbuffer_3.readUnsignedByte();
																						long_55 = long_51 + (long_49 << 32);
																						boolean bool_112 = false;
																						coordgrid_36 = null;
																						class282_sub4_37 = bool_91 ? Class113.aClass282_Sub4_1235 : Class202_Sub1.aClass282_Sub4_8186;
																						if (class282_sub4_37 == null) {
																							bool_112 = true;
																						} else {
																							label2419: {
																								for (i_81 = 0; i_81 < 100; i_81++) {
																									if (client.aLongArray7424[i_81] == long_55) {
																										bool_112 = true;
																										break label2419;
																									}
																								}

																								if (i_10 <= 1) {
																									if ((!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
																										if (Class280.method4975(string_88, (byte) -47)) {
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
																							string_101 = Class182.method3044(Defaults7Loader.method8755(rsbitsbuffer_3, (byte) 54), -1519993030);
																							i_34 = bool_91 ? 41 : 44;
																							if (i_10 != 2 && i_10 != 3) {
																								if (i_10 == 1) {
																									MapRegionLoaderTask.appendMessage(i_34, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + string_88, string_88, string_101, class282_sub4_37.aString7501, -1);
																								} else {
																									MapRegionLoaderTask.appendMessage(i_34, 0, string_88, string_88, string_88, string_101, class282_sub4_37.aString7501, -1);
																								}
																							} else {
																								MapRegionLoaderTask.appendMessage(i_34, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + string_88, string_88, string_101, class282_sub4_37.aString7501, -1);
																							}
																						}

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4507) {
																						bytes_64 = new byte[class184_0.anInt2287];
																						rsbitsbuffer_3.method14873(bytes_64, 0, class184_0.anInt2287, (byte) 8);
																						string_88 = Class344.method6118(bytes_64, 0, class184_0.anInt2287, (byte) -124);
																						if (client.aBool7310) {
																							try {
																								Class361.aClass361_4180.method6254(new Object[] { string_88 }, (byte) 51);
																							} catch (Throwable throwable_62) {
																								;
																							}
																						}

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.PROJECTILE) {
																						Class188.decodeTilestreamPacket(TilestreamPacket.PROJECTILE, 1406697126);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4442) {
																						Class516.method8868(rsbitsbuffer_3.readString(), (byte) -72);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4412) {
																						client.aBool7454 = rsbitsbuffer_3.readUnsignedByte128(-2050851904) == 1;
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4425) {
																						while (rsbitsbuffer_3.index < class184_0.anInt2287) {
																							bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																							string_88 = rsbitsbuffer_3.readString();
																							str_92 = rsbitsbuffer_3.readString();
																							i_7 = rsbitsbuffer_3.readUnsignedShort();
																							i_8 = rsbitsbuffer_3.readUnsignedByte();
																							bool_69 = rsbitsbuffer_3.readUnsignedByte() == 1;
																							str_25 = "";
																							i_11 = -1;
																							i_12 = 0;
																							if (i_7 > 0) {
																								str_25 = rsbitsbuffer_3.readString();
																								i_11 = rsbitsbuffer_3.readUnsignedByte();
																								i_12 = rsbitsbuffer_3.readInt();
																							}

																							for (i_35 = 0; i_35 < client.anInt7449; i_35++) {
																								Class6 class6_113 = client.aClass6Array7452[i_35];
																								if (!bool_91) {
																									if (string_88.equals(class6_113.aString37)) {
																										if (i_7 != class6_113.anInt39) {
																											bool_73 = true;

																											for (Class275_Sub4 class275_sub4_32 = (Class275_Sub4) client.aClass457_7350.method7659(301908602); class275_sub4_32 != null; class275_sub4_32 = (Class275_Sub4) client.aClass457_7350.method7650((byte) 73)) {
																												if (class275_sub4_32.aString7837.equals(string_88)) {
																													if (i_7 != 0 && class275_sub4_32.aShort7839 == 0) {
																														class275_sub4_32.method4887((byte) 2);
																														bool_73 = false;
																													} else if (i_7 == 0 && class275_sub4_32.aShort7839 != 0) {
																														class275_sub4_32.method4887((byte) -38);
																														bool_73 = false;
																													}
																												}
																											}

																											if (bool_73) {
																												client.aClass457_7350.offer(new Class275_Sub4(string_88, i_7), 1701737919);
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
																						bool_91 = false;
																						i_5 = client.anInt7449;

																						while (i_5 > 0) {
																							bool_91 = true;
																							--i_5;

																							for (i_6 = 0; i_6 < i_5; i_6++) {
																								boolean bool_70 = false;
																								Class6 class6_132 = client.aClass6Array7452[i_6];
																								Class6 class6_134 = client.aClass6Array7452[i_6 + 1];
																								if (class6_132.anInt39 != Class159.aClass450_2010.worldId && class6_134.anInt39 == Class159.aClass450_2010.worldId) {
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

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4498) {
																						i_24 = rsbitsbuffer_3.readInt();
																						Class119.aClass12_1461 = new Class12(i_24);
																						Thread thread_94 = new Thread(Class119.aClass12_1461);
																						thread_94.setPriority(1);
																						thread_94.start();
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4365) {
																						i_24 = rsbitsbuffer_3.readIntV2(-1544593371);
																						i_5 = rsbitsbuffer_3.readInt();
																						Class470.method7825(1577365213);
																						Class282_Sub44 class282_sub44_95 = (Class282_Sub44) client.aClass465_7442.get((long) i_5);
																						Class282_Sub44 class282_sub44_126 = (Class282_Sub44) client.aClass465_7442.get((long) i_24);
																						if (class282_sub44_126 != null) {
																							Class351.method6196(class282_sub44_126, class282_sub44_95 == null || class282_sub44_95.anInt8063 != class282_sub44_126.anInt8063, false, -1298031252);
																						}

																						if (class282_sub44_95 != null) {
																							class282_sub44_95.remove();
																							client.aClass465_7442.method7765(class282_sub44_95, (long) i_24);
																						}

																						IComponentDefinitions icomponentdefinitions_130 = Class117.method1981(i_5, (byte) 29);
																						if (icomponentdefinitions_130 != null) {
																							Class109.method1858(icomponentdefinitions_130, (byte) -6);
																						}

																						icomponentdefinitions_130 = Class117.method1981(i_24, (byte) 46);
																						if (icomponentdefinitions_130 != null) {
																							Class109.method1858(icomponentdefinitions_130, (byte) 22);
																							Class12.method483(Class468_Sub8.aClass98Array7889[icomponentdefinitions_130.idHash >>> 16], icomponentdefinitions_130, true, -460404316);
																						}

																						if (client.anInt7349 != -1) {
																							Class383.method6514(client.anInt7349, 1, 1200373841);
																						}

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4461) {
																						i_24 = rsbitsbuffer_3.readUnsignedShort();
																						client.anInt7357 = -1;
																						client.anInt7231 = i_24;
																						client.anInt7341 = 3;
																						IndexLoaders.CUTSCENE_INDEX.method5661(client.anInt7231, -190684974);
																						Class316.method5594(-559600711);
																						HitsplatDefinitions.method3851(-402153223);
																						i_5 = rsbitsbuffer_3.readUnsignedShort();
																						NativeLibraryLoader.anIntArrayArray3239 = new int[i_5][4];

																						for (i_6 = 0; i_6 < i_5; i_6++) {
																							for (i_7 = 0; i_7 < 4; i_7++) {
																								NativeLibraryLoader.anIntArrayArray3239[i_6][i_7] = rsbitsbuffer_3.readInt();
																							}
																						}

																						i_6 = rsbitsbuffer_3.readUnsignedByte();
																						Class276.aClass282_Sub35_3346 = new RsByteBuffer(i_6);
																						Class276.aClass282_Sub35_3346.writeBytes(rsbitsbuffer_3.buffer, rsbitsbuffer_3.index, i_6);
																						rsbitsbuffer_3.index += i_6;
																						class184_0.aClass375_2286 = null;
																						return false;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.DESTROY_OBJECT) {
																						Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4213, 1743263242);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4394) {
																						i_24 = rsbitsbuffer_3.readInt();
																						bool_66 = rsbitsbuffer_3.readUnsignedByteC(-999919017) == 1;
																						if (bool_66 != Class469.aBool5585 || i_24 != Class232.anInt2879) {
																							Class469.aBool5585 = bool_66;
																							Class232.anInt2879 = i_24;
																							Class210.method3614(Class397.aClass397_4803, -1, -1, (byte) 27);
																						}

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4385) {
																						i_24 = rsbitsbuffer_3.readUnsignedShort128();
																						i_5 = rsbitsbuffer_3.readIntLE();
																						i_6 = rsbitsbuffer_3.readUnsignedByteC(1811840250);
																						i_7 = rsbitsbuffer_3.readInt();
																						i_8 = rsbitsbuffer_3.readIntLE();
																						i_9 = rsbitsbuffer_3.readShortLE128();
																						i_10 = rsbitsbuffer_3.readInt();
																						i_11 = rsbitsbuffer_3.readInt();
																						Class470.method7825(1088980855);
																						Class31.method812(i_7, new Class282_Sub44_Sub1(i_9, i_6, i_24), new int[] { i_11, i_5, i_10, i_8 }, false, (byte) 46);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4489) {
																						i_24 = rsbitsbuffer_3.readUnsignedByte();
																						bool_66 = (i_24 & 0x1) == 1;
																						str_92 = rsbitsbuffer_3.readString();
																						string_42 = rsbitsbuffer_3.readString();
																						if (!bool_66) {
																							Class10 class10_43 = new Class10();
																							client.aClass10Array7456[client.anInt7373] = class10_43;
																							class10_43.aString115 = str_92;
																							class10_43.aString116 = string_42;
																							class10_43.aBool117 = (i_24 & 0x2) == 2;
																							++client.anInt7373;
																						} else {
																							for (i_8 = 0; i_8 < client.anInt7373; i_8++) {
																								Class10 class10_44 = client.aClass10Array7456[i_8];
																								if (string_42.equals(class10_44.aString115)) {
																									class10_44.aString115 = str_92;
																									class10_44.aString116 = string_42;
																									break;
																								}
																							}
																						}

																						client.anInt7386 = client.anInt7347;
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4470) {
																						i_24 = rsbitsbuffer_3.readShortLE((byte) -15);
																						string_88 = rsbitsbuffer_3.readString();
																						Class470.method7825(-929905527);
																						MapRegion.method4562(i_24, string_88, -1183230823);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.NPC_UPDATE) {
																						Class540.decodeNPCUpdate(false, -1846664385);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4376) {
																						bool_91 = rsbitsbuffer_3.readUnsignedByte() == 1;
																						string_88 = rsbitsbuffer_3.readString();
																						str_92 = string_88;
																						if (bool_91) {
																							str_92 = rsbitsbuffer_3.readString();
																						}

																						long_28 = rsbitsbuffer_3.readLong(776681433);
																						long_30 = (long) rsbitsbuffer_3.readUnsignedShort();
																						long_55 = (long) rsbitsbuffer_3.read24BitUnsignedInteger();
																						i_35 = rsbitsbuffer_3.readUnsignedByte();
																						long long_60 = (long_30 << 32) + long_55;
																						bool_16 = false;
																						i_34 = 0;

																						while (true) {
																							if (i_34 >= 100) {
																								if (i_35 <= 1) {
																									if ((!client.aBool7224 || client.aBool7244) && !client.aBool7325) {
																										if (Class280.method4975(str_92, (byte) -112)) {
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
																							string_17 = Class182.method3044(Defaults7Loader.method8755(rsbitsbuffer_3, (byte) 107), -1519993030);
																							if (i_35 != 2 && i_35 != 3) {
																								if (i_35 == 1) {
																									MapRegionLoaderTask.appendMessage(9, 0, Class76.getCrown(0) + string_88, Class76.getCrown(0) + str_92, string_88, string_17, Class179.method3018(long_28), -1);
																								} else {
																									MapRegionLoaderTask.appendMessage(9, 0, string_88, str_92, string_88, string_17, Class179.method3018(long_28), -1);
																								}
																							} else {
																								MapRegionLoaderTask.appendMessage(9, 0, Class76.getCrown(1) + string_88, Class76.getCrown(1) + str_92, string_88, string_17, Class179.method3018(long_28), -1);
																							}
																						}

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.OBJECT_ANIMATION) {
																						i_24 = rsbitsbuffer_3.readIntV2(-1065611098);
																						i_5 = i_24 >> 28 & 0x3;
																						i_6 = i_24 >> 14 & 0x3fff;
																						i_7 = i_24 & 0x3fff;
																						i_8 = rsbitsbuffer_3.readIntLE();
																						i_9 = rsbitsbuffer_3.readUnsigned128Byte();
																						i_10 = i_9 >> 2;
																						i_11 = i_9 & 0x3;
																						i_12 = client.anIntArray7230[i_10];
																						coordgrid_33 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1832979532);
																						i_6 -= coordgrid_33.x;
																						i_7 -= coordgrid_33.y;
																						Class9.animateObject(i_5, i_6, i_7, i_12, i_10, i_11, i_8, (byte) 1);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4455) {
																						i_24 = rsbitsbuffer_3.readUnsignedShort();
																						if (i_24 == 65535) {
																							i_24 = -1;
																						}

																						i_5 = rsbitsbuffer_3.readUnsignedByte();
																						i_6 = rsbitsbuffer_3.readUnsignedShort();
																						i_7 = rsbitsbuffer_3.readUnsignedByte();
																						Class435.method7300(i_24, i_5, i_6, i_7, true, 256, 1449989045);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4448) {
																						client.anInt7373 = rsbitsbuffer_3.readUnsignedByte();

																						for (i_24 = 0; i_24 < client.anInt7373; i_24++) {
																							Class10 class10_89 = new Class10();
																							client.aClass10Array7456[i_24] = class10_89;
																							class10_89.aString115 = rsbitsbuffer_3.readString();
																							class10_89.aString116 = rsbitsbuffer_3.readString();
																							class10_89.aBool117 = false;
																						}

																						client.anInt7386 = client.anInt7347;
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4483) {
																						i_24 = rsbitsbuffer_3.readShortLE((byte) -26);
																						i_5 = rsbitsbuffer_3.readUnsignedShort();
																						i_6 = rsbitsbuffer_3.readUnsigned128Byte();
																						i_7 = rsbitsbuffer_3.readIntLE();
																						Class470.method7825(1533122072);
																						Class282_Sub28.method12420(i_7, i_6, i_5, i_24, 2108425103);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4364) {
																						client.anInt7162 = rsbitsbuffer_3.method13121(358505784);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4374) {
																						i_24 = rsbitsbuffer_3.readIntV2(-1532962648);
																						i_5 = rsbitsbuffer_3.readIntV2(-646638711);
																						i_6 = rsbitsbuffer_3.readUnsignedByte128(-1264346056);
																						i_7 = rsbitsbuffer_3.readInt();
																						i_8 = rsbitsbuffer_3.readIntV1();
																						i_9 = rsbitsbuffer_3.readUnsignedShort128();
																						i_10 = rsbitsbuffer_3.readUnsigned128Byte();
																						i_11 = i_10 >> 2;
																						i_12 = i_10 & 0x3;
																						i_35 = rsbitsbuffer_3.readInt();
																						coordgrid_36 = new CoordGrid(rsbitsbuffer_3.readIntV2(-1833365269));
																						i_15 = rsbitsbuffer_3.readInt();
																						Class470.method7825(-1402446608);
																						Class31.method812(i_24, new Class282_Sub44_Sub4(i_9, i_6, new Class530(coordgrid_36, i_11, i_12, i_15)), new int[] { i_8, i_7, i_5, i_35 }, false, (byte) 10);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4445) {
																						Class46.anObjectArray437 = null;
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4437) {
																						if (Class475.supportsFullScreen && client.fullScreenFrame != null) {
																							Class440.method7373(Class393.preferences.screenSize.method12687(-1706994104), -1, -1, false, (byte) 30);
																						}

																						bytes_64 = new byte[class184_0.anInt2287];
																						rsbitsbuffer_3.method14873(bytes_64, 0, class184_0.anInt2287, (byte) 8);
																						string_88 = Class344.method6118(bytes_64, 0, class184_0.anInt2287, (byte) -8);
																						str_92 = "opensn";
																						if (!client.aBool7310 || !Class186.method3082(string_88, 1, str_92, 145298920)) {
																							Class508.method8736(string_88, true, Class393.preferences.currentToolkit.getValue(-780399145) == 5, str_92, client.aBool7158, client.aBool7159, (byte) -17);
																						}

																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.aClass375_4418) {
																						i_24 = rsbitsbuffer_3.readUnsignedShort128();
																						i_5 = rsbitsbuffer_3.readIntV2(-875618994);
																						i_6 = rsbitsbuffer_3.readShortLE((byte) -6);
																						Class470.method7825(-1216270588);
																						Class225_Sub2.method12882(i_5, i_24 + (i_6 << 16), 1247559712);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.RUN_CS2_SCRIPT) {
																						string_63 = rsbitsbuffer_3.readString();
																						Object[] arr_26 = new Object[string_63.length() + 1];

																						for (i_6 = string_63.length() - 1; i_6 >= 0; --i_6) {
																							if (string_63.charAt(i_6) == 115) {
																								arr_26[i_6 + 1] = rsbitsbuffer_3.readString();
																							} else {
																								arr_26[i_6 + 1] = new Integer(rsbitsbuffer_3.readInt());
																							}
																						}

																						arr_26[0] = new Integer(rsbitsbuffer_3.readInt());
																						Class470.method7825(14988826);
																						HookRequest hookrequest_27 = new HookRequest();
																						hookrequest_27.params = arr_26;
																						Class96_Sub4.executeHookInner200k(hookrequest_27, 502538057);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else if (class184_0.aClass375_2286 == IncomingPacket.NPC_UPDATE_LARGE) {
																						Class540.decodeNPCUpdate(true, -938480813);
																						class184_0.aClass375_2286 = null;
																						return true;
																					} else {
																						Class151.method2594((class184_0.aClass375_2286 != null ? class184_0.aClass375_2286.anInt4512 : -1) + "," + (class184_0.aClass375_2296 != null ? class184_0.aClass375_2296.anInt4512 : -1) + "," + (class184_0.aClass375_2291 != null ? class184_0.aClass375_2291.anInt4512 : -1) + " " + class184_0.anInt2287, new RuntimeException(), (byte) -73);
																						Class438.method7333(false, 2095335662);
																						return true;
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method14434(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.anInt7000 -= 2;
		Class533.method11404((String) cs2executor_0.objectStack[cs2executor_0.anInt7000], (String) cs2executor_0.objectStack[cs2executor_0.anInt7000 + 1], "", cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1, false, -94301647);
	}

}
