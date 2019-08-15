import java.io.IOException;

public class Node_Sub20_Sub22 extends Node_Sub20 {

	static int anInt9873 = 0;

	static int anInt9872 = 0;

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		if (i_1 == 0) {
			this.aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
		}
	}

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1326272512);
		if (this.aClass308_7670.aBool3619) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];
			for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
				this.method15383(i_7, i_1, 2069251162);
				int[][] ints_8 = this.method12333(0, anInt9872);
				ints_4[i_7] = ints_8[0][anInt9873];
				ints_5[i_7] = ints_8[1][anInt9873];
				ints_6[i_7] = ints_8[2][anInt9873];
			}
		}
		return ints_3;
	}

	final void method15383(int i_1, int i_2, int i_3) {
		int i_4 = Class316.anIntArray3672[i_1];
		int i_5 = Class316.anIntArray3668[i_2];
		float f_6 = (float) Math.atan2((double) (i_4 - 2048), (double) (i_5 - 2048));
		if ((double) f_6 >= -3.141592653589793D && (double) f_6 <= -2.356194490192345D) {
			anInt9873 = i_1;
			anInt9872 = i_2;
		} else if ((double) f_6 <= -1.5707963267948966D && (double) f_6 >= -2.356194490192345D) {
			anInt9873 = i_2;
			anInt9872 = i_1;
		} else if ((double) f_6 <= -0.7853981633974483D && (double) f_6 >= -1.5707963267948966D) {
			anInt9873 = Class316.anInt3670 - i_2;
			anInt9872 = i_1;
		} else if (f_6 <= 0.0F && (double) f_6 >= -0.7853981633974483D) {
			anInt9873 = i_1;
			anInt9872 = Class316.anInt3671 - i_2;
		} else if (f_6 >= 0.0F && (double) f_6 <= 0.7853981633974483D) {
			anInt9873 = Class316.anInt3670 - i_1;
			anInt9872 = Class316.anInt3671 - i_2;
		} else if ((double) f_6 >= 0.7853981633974483D && (double) f_6 <= 1.5707963267948966D) {
			anInt9873 = Class316.anInt3670 - i_2;
			anInt9872 = Class316.anInt3671 - i_1;
		} else if ((double) f_6 >= 1.5707963267948966D && (double) f_6 <= 2.356194490192345D) {
			anInt9873 = i_2;
			anInt9872 = Class316.anInt3671 - i_1;
		} else if ((double) f_6 >= 2.356194490192345D && (double) f_6 <= 3.141592653589793D) {
			anInt9873 = Class316.anInt3670 - i_1;
			anInt9872 = i_2;
		}
		anInt9873 &= Class316.anInt3669;
		anInt9872 &= Class316.anInt3673;
	}

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, 726111748);
		if (this.aClass320_7667.aBool3722) {
			for (int i_4 = 0; i_4 < Class316.anInt3670; i_4++) {
				this.method15383(i_4, i_1, 1810846536);
				int[] ints_5 = this.method12317(0, anInt9872, 2096747711);
				ints_3[i_4] = ints_5[anInt9873];
			}
		}
		return ints_3;
	}

	public Node_Sub20_Sub22() {
		super(1, false);
	}

	static final void method15386() {
		if (client.REBOOT_TIMER > 1) {
			--client.REBOOT_TIMER;
			client.anInt7397 = client.anInt7347;
		}
		if (client.GAME_CONNECTION_CONTEXT.aBool2298) {
			client.GAME_CONNECTION_CONTEXT.aBool2298 = false;
			Class151.method2592((byte) 21);
		} else {
			if (!Class20.aBool161) {
				HitsplatDefinitions.method3851();
			}
			for (int i_1 = 0; i_1 < 100 && FontRenderer_Sub3.method14338(client.GAME_CONNECTION_CONTEXT); i_1++) {
				;
			}
			if (client.gameState == 13) {
				int i_2;
				TCPPacket tcpmessage_6;
				while (HashTableIterator.hasValues()) {
					tcpmessage_6 = Class271.createPacket(ClientPacket.REFLECTION_CHECK, client.GAME_CONNECTION_CONTEXT.isaac);
					tcpmessage_6.buffer.writeByte(0);
					i_2 = tcpmessage_6.buffer.index;
					FontRenderer_Sub2.method14264(tcpmessage_6.buffer);
					tcpmessage_6.buffer.writeIndex(tcpmessage_6.buffer.index - i_2);
					client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
				}
				if (PingRequest.CURRENT_REQUEST != null) {
					if (PingRequest.CURRENT_REQUEST.ping != -1) {
						tcpmessage_6 = Class271.createPacket(ClientPacket.WRITE_PING, client.GAME_CONNECTION_CONTEXT.isaac);
						tcpmessage_6.buffer.writeShort(PingRequest.CURRENT_REQUEST.ping);
						client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
						PingRequest.CURRENT_REQUEST = null;
						Class28.aLong351 = Utils.time() + 30000L;
					}
				} else if (Utils.time() >= Class28.aLong351) {
					PingRequest.CURRENT_REQUEST = client.PING_REQUESTER.createPingRequest(Class159.GAME_CONNECTION_INFO.host);
				}
				Class434.method7292();
				MouseRecord class282_sub53_13 = (MouseRecord) client.mouseRecords.head();
				if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
					if (NativeLibraryLoader.anInt3240 == 5) {
						Wall.method16113();
					} else if (NativeLibraryLoader.anInt3240 == 3) {
						SpotAnimIndexLoader.method8860((byte) -76);
					}
				}
				if (client.aBool7331) {
					client.aBool7331 = false;
				} else {
					client.aFloat7284 /= 2.0F;
				}
				if (client.aBool7269) {
					client.aBool7269 = false;
				} else {
					client.aFloat7266 /= 2.0F;
				}
				Node_Sub20_Sub7.method15240();
				if (client.gameState == 13) {
					IndexLoaders.MAP_REGION_DECODER.method4435().method4037(IndexLoaders.MAP_REGION_DECODER, (byte) 81);
					Class350_Sub1.method12516();
					RSInterface.method1623();
					if (client.anInt7396 > 10) {
						++client.GAME_CONNECTION_CONTEXT.idleReadPulses;
					}
					if (client.GAME_CONNECTION_CONTEXT.idleReadPulses > 2250) {
						Class151.method2592((byte) 35);
					} else {
						if (client.anInt7341 == 1) {
							Class155.method2636();
							GrandExchangeSlot.method5916();
						} else if (Node_Sub13.DEFAULTS_LOADER_8.inputSubscriber.valid(class282_sub53_13, client.keyRecords, client.maximumHeldKeys, PlaySoundJingleCutsceneAction.keyRecorder)) {
							Preference_Sub21.method12869(false, -200546110);
						} else {
							if (client.anInt7341 == 3 && LoadingStage.method6684(client.CURRENT_CUTSCENE)) {
								IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3153, (RsBitsBuffer) null), 218907808);
								client.anInt7341 = 0;
							}
							if (client.anInt7341 == 0 && client.gameState != 18) {
								Class86.aClass465_823.method7749(1239526521);
								client.anInt7341 = 4;
								client.anInt7357 = client.cycles;
								client.anInt7235 = 0;
								ParticleTriangle.method3953();
							}
							if (client.anInt7341 == 4) {
								i_2 = client.cycles - client.anInt7357;
								if (client.anInt7235 < Class86.aCutsceneActionArray822.length) {
									do {
										CutsceneAction class96_3 = Class86.aCutsceneActionArray822[client.anInt7235];
										if (class96_3.anInt992 > i_2) {
											break;
										}
										class96_3.method1592();
									} while (client.anInt7341 == 4 && ++client.anInt7235 < Class86.aCutsceneActionArray822.length);
								}
								if (client.anInt7341 == 4) {
									for (int i_7 = 0; i_7 < Class82.aClass75Array804.length; i_7++) {
										CutsceneEntity class75_4 = Class82.aClass75Array804[i_7];
										if (class75_4.initialized) {
											Entity animable_5 = class75_4.method1342((byte) 112);
											Class363.method6287(animable_5, true, -101184635);
										}
									}
								}
							}
						}
						Class357.method6233();
						Class149_Sub4.method14661();
						PulseEvent.processPulseEvents();
						++client.anInt7261;
						if (client.anInt7296 != 0) {
							client.anInt7295 += 20;
							if (client.anInt7295 >= 400) {
								client.anInt7296 = 0;
							}
						}
						if (VarcStringIndexLoader.aClass118_4825 != null) {
							++client.anInt7297;
							if (client.anInt7297 >= 15) {
								Class109.redrawComponent(VarcStringIndexLoader.aClass118_4825);
								VarcStringIndexLoader.aClass118_4825 = null;
							}
						}
						client.aClass118_7370 = null;
						client.aBool7369 = false;
						client.aBool7403 = false;
						Node_Sub20_Sub24.aClass118_9884 = null;
						Class15.method544((IComponentDefinitions) null, -1, -1, 809786138);
						if (!client.aBool7344) {
							client.anInt7427 = -1;
						}
						ServerEnvironment.method8315(-472472191);
						++client.anInt7347;
						TCPPacket tcpmessage_8;
						if (client.aBool7375) {
							tcpmessage_8 = Class271.createPacket(ClientPacket.WORLD_MAP_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
							tcpmessage_8.buffer.writeLEInt(Node_Sub15_Sub5.anInt9859 << 28 | IdentikitDefinition.anInt431 << 14 | StructIndexLoader.anInt5015, (byte) -22);
							client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_8);
							client.aBool7375 = false;
						}
						while (true) {
							IComponentDefinitions icomponentdefinitions_10;
							IComponentDefinitions icomponentdefinitions_11;
							HookRequest hookrequest_14;
							do {
								hookrequest_14 = (HookRequest) client.aClass482_7233.popHead();
								if (hookrequest_14 == null) {
									while (true) {
										do {
											hookrequest_14 = (HookRequest) client.aClass482_7404.popHead();
											if (hookrequest_14 == null) {
												while (true) {
													do {
														hookrequest_14 = (HookRequest) client.PENDING_HOOK_REQUESTS.popHead();
														if (hookrequest_14 == null) {
															if (Node_Sub20_Sub24.aClass118_9884 == null) {
																client.anInt7184 = 0;
															}
															if (client.aClass118_7257 != null) {
																Class161.method2827(1342280577);
															}
															FriendStatus.method7703();
															if (client.rights > 0 && PlaySoundJingleCutsceneAction.keyRecorder.held(82) && PlaySoundJingleCutsceneAction.keyRecorder.held(81) && client.anInt7191 != 0) {
																i_2 = VertexNormal.MY_PLAYER.plane - client.anInt7191;
																if (i_2 < 0) {
																	i_2 = 0;
																} else if (i_2 > 3) {
																	i_2 = 3;
																}
																WorldTile coordgrid_12 = IndexLoaders.MAP_REGION_DECODER.getBase();
																VarnIndexLoader.method7460(i_2, VertexNormal.MY_PLAYER.regionBaseX[0] + coordgrid_12.x, VertexNormal.MY_PLAYER.regionBaseY[0] + coordgrid_12.y, -1104014965);
															}
															for (i_2 = 0; i_2 < 5; i_2++) {
																++client.anIntArray7435[i_2];
															}
															if (client.aBool7400 && client.aLong7401 < Utils.time() - 60000L) {
																Node_Sub11.method12211(375713564);
															}
															for (EntityNode_Sub4 class275_sub4_15 = (EntityNode_Sub4) client.aClass457_7350.method7659(); class275_sub4_15 != null; class275_sub4_15 = (EntityNode_Sub4) client.aClass457_7350.method7650((byte) 20)) {
																if ((long) class275_sub4_15.anInt7838 < Utils.time() / 1000L - 5L) {
																	if (class275_sub4_15.aShort7839 > 0) {
																		ChatLine.appendChatMessage(5, 0, "", "", "", class275_sub4_15.aString7837 + Message.HAS_LOGGED_IN.translate(Class223.CURRENT_LANGUAGE));
																	}
																	if (class275_sub4_15.aShort7839 == 0) {
																		ChatLine.appendChatMessage(5, 0, "", "", "", class275_sub4_15.aString7837 + Message.HAS_LOGGED_OUT.translate(Class223.CURRENT_LANGUAGE));
																	}
																	class275_sub4_15.method4887();
																}
															}
															++client.anInt7418;
															if (client.anInt7418 > 508) {
																client.anInt7418 = 0;
																i_2 = (int) (Math.random() * 8.0D);
																if ((i_2 & 0x1) == 1) {
																	client.anInt7248 += client.anInt7249;
																}
																if ((i_2 & 0x2) == 2) {
																	client.anInt7250 += client.anInt7251;
																}
																if ((i_2 & 0x4) == 4) {
																	client.anInt7343 += client.anInt7253;
																}
															}
															if (client.anInt7248 < -51) {
																client.anInt7249 = 2;
															}
															if (client.anInt7248 > 56) {
																client.anInt7249 = -2;
															}
															if (client.anInt7250 < -63) {
																client.anInt7251 = 2;
															}
															if (client.anInt7250 > 56) {
																client.anInt7251 = -2;
															}
															if (client.anInt7343 < -44) {
																client.anInt7253 = 1;
															}
															if (client.anInt7343 > 40) {
																client.anInt7253 = -1;
															}
															++client.anInt7259;
															if (client.anInt7259 > 508) {
																client.anInt7259 = 0;
																i_2 = (int) (Math.random() * 8.0D);
																if ((i_2 & 0x1) == 1) {
																	client.anInt7255 += client.anInt7187;
																}
																if ((i_2 & 0x2) == 2) {
																	client.anInt7203 += client.anInt7258;
																}
															}
															if (client.anInt7255 < -60) {
																client.anInt7187 = 2;
															}
															if (client.anInt7255 > 65) {
																client.anInt7187 = -2;
															}
															if (client.anInt7203 < -20) {
																client.anInt7258 = 1;
															}
															if (client.anInt7203 > 11) {
																client.anInt7258 = -1;
															}
															++client.GAME_CONNECTION_CONTEXT.anInt2290;
															if (client.GAME_CONNECTION_CONTEXT.anInt2290 > 50) {
																tcpmessage_8 = Class271.createPacket(ClientPacket.PING, client.GAME_CONNECTION_CONTEXT.isaac);
																client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_8);
															}
															if (client.aBool7459) {
																Class466.method7776();
																client.aBool7459 = false;
															}
															try {
																client.GAME_CONNECTION_CONTEXT.flush();
															} catch (IOException ioexception_9) {
																Class151.method2592((byte) 40);
															}
															return;
														}
														icomponentdefinitions_10 = hookrequest_14.source;
														if (icomponentdefinitions_10.anInt1288 < 0) {
															break;
														}
														icomponentdefinitions_11 = IComponentDefinitions.getDefs(icomponentdefinitions_10.parent);
													} while (icomponentdefinitions_11 == null || icomponentdefinitions_11.aClass118Array1438 == null || icomponentdefinitions_10.anInt1288 >= icomponentdefinitions_11.aClass118Array1438.length || icomponentdefinitions_10 != icomponentdefinitions_11.aClass118Array1438[icomponentdefinitions_10.anInt1288]);
													CS2Executor.executeHookInner200k(hookrequest_14, 2146300541);
												}
											}
											icomponentdefinitions_10 = hookrequest_14.source;
											if (icomponentdefinitions_10.anInt1288 < 0) {
												break;
											}
											icomponentdefinitions_11 = IComponentDefinitions.getDefs(icomponentdefinitions_10.parent);
										} while (icomponentdefinitions_11 == null || icomponentdefinitions_11.aClass118Array1438 == null || icomponentdefinitions_10.anInt1288 >= icomponentdefinitions_11.aClass118Array1438.length || icomponentdefinitions_10 != icomponentdefinitions_11.aClass118Array1438[icomponentdefinitions_10.anInt1288]);
										CS2Executor.executeHookInner200k(hookrequest_14, 690549551);
									}
								}
								icomponentdefinitions_10 = hookrequest_14.source;
								if (icomponentdefinitions_10.anInt1288 < 0) {
									break;
								}
								icomponentdefinitions_11 = IComponentDefinitions.getDefs(icomponentdefinitions_10.parent);
							} while (icomponentdefinitions_11 == null || icomponentdefinitions_11.aClass118Array1438 == null || icomponentdefinitions_10.anInt1288 >= icomponentdefinitions_11.aClass118Array1438.length || icomponentdefinitions_10 != icomponentdefinitions_11.aClass118Array1438[icomponentdefinitions_10.anInt1288]);
							CS2Executor.executeHookInner200k(hookrequest_14, 859874447);
						}
					}
				}
			}
		}
	}

	public static void setParticleIndex(Index index_0) {
		WorldTile.PARTICLE_INDEX = index_0;
	}
}
