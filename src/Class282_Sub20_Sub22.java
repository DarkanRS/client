import java.io.IOException;

public class Class282_Sub20_Sub22 extends Class282_Sub20 {

	static int anInt9873 = 0;

	static int anInt9872 = 0;

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
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
				int[][] ints_8 = this.method12333(0, anInt9872, (byte) 3);
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

	int[] method12319(int i_1, int i_2) {
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

	public Class282_Sub20_Sub22() {
		super(1, false);
	}

	static final void method15386(int i_0) {
		if (client.anInt7178 > 1) {
			--client.anInt7178;
			client.anInt7397 = client.anInt7347;
		}
		if (client.aClass184_7475.aBool2298) {
			client.aClass184_7475.aBool2298 = false;
			Class151.method2592((byte) 21);
		} else {
			if (!Class20.aBool161) {
				HitsplatDefinitions.method3851(-402153223);
			}
			for (int i_1 = 0; i_1 < 100 && Class8_Sub3.method14338(client.aClass184_7475, (byte) 2); i_1++) {
				;
			}
			if (client.gameState == 13) {
				int i_2;
				TCPMessage tcpmessage_6;
				while (Class451.method7517((byte) 8)) {
					tcpmessage_6 = Class271.method4828(OutgoingPacket.aClass379_4563, client.aClass184_7475.isaac, 780391787);
					tcpmessage_6.buffer.writeByte(0);
					i_2 = tcpmessage_6.buffer.index;
					Class8_Sub2.method14264(tcpmessage_6.buffer, 1655549985);
					tcpmessage_6.buffer.method13061(tcpmessage_6.buffer.index - i_2, 788141162);
					client.aClass184_7475.method3049(tcpmessage_6, -467156881);
				}
				if (Class496.aClass510_5816 != null) {
					if (Class496.aClass510_5816.anInt5872 != -1) {
						tcpmessage_6 = Class271.method4828(OutgoingPacket.aClass379_4615, client.aClass184_7475.isaac, 312457209);
						tcpmessage_6.buffer.writeShort(Class496.aClass510_5816.anInt5872, 1417031095);
						client.aClass184_7475.method3049(tcpmessage_6, 496271189);
						Class496.aClass510_5816 = null;
						Class28.aLong351 = Class169.time() + 30000L;
					}
				} else if (Class169.time() >= Class28.aLong351) {
					Class496.aClass510_5816 = client.aClass508_7223.method8729(Class159.aClass450_2010.aString5433, (short) 5418);
				}
				Class434.method7292((byte) -22);
				MouseRecord class282_sub53_13 = (MouseRecord) client.mouseRecords.head((byte) 106);
				if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1135712280) != null) {
					if (NativeLibraryLoader.anInt3240 == 5) {
						Wall.method16113(70521151);
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
				Class282_Sub20_Sub7.method15240((byte) 1);
				if (client.gameState == 13) {
					IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4037(IndexLoaders.MAP_REGION_DECODER, (byte) 81);
					Class350_Sub1.method12516(16232323);
					Interface.method1623(759137270);
					if (client.anInt7396 > 10) {
						++client.aClass184_7475.anInt2289;
					}
					if (client.aClass184_7475.anInt2289 > 2250) {
						Class151.method2592((byte) 35);
					} else {
						if (client.anInt7341 == 1) {
							Class155.method2636((byte) 20);
							GrandExchangeSlot.method5916(1211695569);
						} else if (Class282_Sub13.DEFAULTS_LOADER_8.anInterface17_5931.method127(class282_sub53_13, client.anInterface16Array7298, client.maximumHeldKeys, Class96_Sub21.keyRecorder, (byte) 81)) {
							Class468_Sub21.method12869(false, -200546110);
						} else {
							if (client.anInt7341 == 3 && LoadingStage.method6684(client.anInt7231, (byte) 27)) {
								IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3153, (RsBitsBuffer) null), 218907808);
								client.anInt7341 = 0;
							}
							if (client.anInt7341 == 0 && client.gameState != 18) {
								Class86.aClass465_823.method7749(1239526521);
								client.anInt7341 = 4;
								client.anInt7357 = client.cycles;
								client.anInt7235 = 0;
								ParticleTriangle.method3953((byte) 1);
							}
							if (client.anInt7341 == 4) {
								i_2 = client.cycles - client.anInt7357;
								if (client.anInt7235 < Class86.aClass96Array822.length) {
									do {
										Class96 class96_3 = Class86.aClass96Array822[client.anInt7235];
										if (class96_3.anInt992 > i_2) {
											break;
										}
										class96_3.method1592(2123508323);
									} while (client.anInt7341 == 4 && ++client.anInt7235 < Class86.aClass96Array822.length);
								}
								if (client.anInt7341 == 4) {
									for (int i_7 = 0; i_7 < Class82.aClass75Array804.length; i_7++) {
										Class75 class75_4 = Class82.aClass75Array804[i_7];
										if (class75_4.aBool742) {
											Animable animable_5 = class75_4.method1342((byte) 112);
											Class363.method6287(animable_5, true, -101184635);
										}
									}
								}
							}
						}
						Class357.method6233((byte) 36);
						Class149_Sub4.method14661((byte) -86);
						Class84.method1464(1237119486);
						++client.anInt7261;
						if (client.anInt7296 != 0) {
							client.anInt7295 += 20;
							if (client.anInt7295 >= 400) {
								client.anInt7296 = 0;
							}
						}
						if (Class401.aClass118_4825 != null) {
							++client.anInt7297;
							if (client.anInt7297 >= 15) {
								Class109.method1858(Class401.aClass118_4825, (byte) 51);
								Class401.aClass118_4825 = null;
							}
						}
						client.aClass118_7370 = null;
						client.aBool7369 = false;
						client.aBool7403 = false;
						Class282_Sub20_Sub24.aClass118_9884 = null;
						Class15.method544((IComponentDefinitions) null, -1, -1, 809786138);
						if (!client.aBool7344) {
							client.anInt7427 = -1;
						}
						Class496.method8315(-472472191);
						++client.anInt7347;
						TCPMessage tcpmessage_8;
						if (client.aBool7375) {
							tcpmessage_8 = Class271.method4828(OutgoingPacket.aClass379_4549, client.aClass184_7475.isaac, 771698207);
							tcpmessage_8.buffer.writeLEInt(Class282_Sub15_Sub5.anInt9859 << 28 | IdentikitDefinition.anInt431 << 14 | StructIndexLoader.anInt5015, (byte) -22);
							client.aClass184_7475.method3049(tcpmessage_8, -1247398056);
							client.aBool7375 = false;
						}
						while (true) {
							IComponentDefinitions icomponentdefinitions_10;
							IComponentDefinitions icomponentdefinitions_11;
							HookRequest hookrequest_14;
							do {
								hookrequest_14 = (HookRequest) client.aClass482_7233.popHead((byte) -22);
								if (hookrequest_14 == null) {
									while (true) {
										do {
											hookrequest_14 = (HookRequest) client.aClass482_7404.popHead((byte) -73);
											if (hookrequest_14 == null) {
												while (true) {
													do {
														hookrequest_14 = (HookRequest) client.aClass482_7402.popHead((byte) -101);
														if (hookrequest_14 == null) {
															if (Class282_Sub20_Sub24.aClass118_9884 == null) {
																client.anInt7184 = 0;
															}
															if (client.aClass118_7257 != null) {
																Class161.method2827(1342280577);
															}
															Class461.method7703(-1982488660);
															if (client.rights > 0 && Class96_Sub21.keyRecorder.method3236(82, -1802639112) && Class96_Sub21.keyRecorder.method3236(81, -1439970687) && client.anInt7191 != 0) {
																i_2 = Class84.myPlayer.plane - client.anInt7191;
																if (i_2 < 0) {
																	i_2 = 0;
																} else if (i_2 > 3) {
																	i_2 = 3;
																}
																CoordGrid coordgrid_12 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1589459272);
																Class447.method7460(i_2, Class84.myPlayer.regionBaseX[0] + coordgrid_12.x, Class84.myPlayer.regionBaseY[0] + coordgrid_12.y, -1104014965);
															}
															for (i_2 = 0; i_2 < 5; i_2++) {
																++client.anIntArray7435[i_2];
															}
															if (client.aBool7400 && client.aLong7401 < Class169.time() - 60000L) {
																Class282_Sub11.method12211(375713564);
															}
															for (Class275_Sub4 class275_sub4_15 = (Class275_Sub4) client.aClass457_7350.method7659(301908602); class275_sub4_15 != null; class275_sub4_15 = (Class275_Sub4) client.aClass457_7350.method7650((byte) 20)) {
																if ((long) class275_sub4_15.anInt7838 < Class169.time() / 1000L - 5L) {
																	if (class275_sub4_15.aShort7839 > 0) {
																		Class191.method3167(5, 0, "", "", "", class275_sub4_15.aString7837 + Message.HAS_LOGGED_IN.translate(Class223.CURRENT_LANGUAGE, -1783066271), 442373563);
																	}
																	if (class275_sub4_15.aShort7839 == 0) {
																		Class191.method3167(5, 0, "", "", "", class275_sub4_15.aString7837 + Message.HAS_LOGGED_OUT.translate(Class223.CURRENT_LANGUAGE, -805981058), 1499607134);
																	}
																	class275_sub4_15.method4887((byte) -28);
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
															++client.aClass184_7475.anInt2290;
															if (client.aClass184_7475.anInt2290 > 50) {
																tcpmessage_8 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, client.aClass184_7475.isaac, -169588500);
																client.aClass184_7475.method3049(tcpmessage_8, -57681873);
															}
															if (client.aBool7459) {
																Class466.method7776(-389902536);
																client.aBool7459 = false;
															}
															try {
																client.aClass184_7475.method3047(613912304);
															} catch (IOException ioexception_9) {
																Class151.method2592((byte) 40);
															}
															return;
														}
														icomponentdefinitions_10 = hookrequest_14.iComponentDefs;
														if (icomponentdefinitions_10.anInt1288 < 0) {
															break;
														}
														icomponentdefinitions_11 = Class117.getInterfaceComponent(icomponentdefinitions_10.anInt1305);
													} while (icomponentdefinitions_11 == null || icomponentdefinitions_11.aClass118Array1438 == null || icomponentdefinitions_10.anInt1288 >= icomponentdefinitions_11.aClass118Array1438.length || icomponentdefinitions_10 != icomponentdefinitions_11.aClass118Array1438[icomponentdefinitions_10.anInt1288]);
													Class96_Sub4.executeHookInner200k(hookrequest_14, 2146300541);
												}
											}
											icomponentdefinitions_10 = hookrequest_14.iComponentDefs;
											if (icomponentdefinitions_10.anInt1288 < 0) {
												break;
											}
											icomponentdefinitions_11 = Class117.getInterfaceComponent(icomponentdefinitions_10.anInt1305);
										} while (icomponentdefinitions_11 == null || icomponentdefinitions_11.aClass118Array1438 == null || icomponentdefinitions_10.anInt1288 >= icomponentdefinitions_11.aClass118Array1438.length || icomponentdefinitions_10 != icomponentdefinitions_11.aClass118Array1438[icomponentdefinitions_10.anInt1288]);
										Class96_Sub4.executeHookInner200k(hookrequest_14, 690549551);
									}
								}
								icomponentdefinitions_10 = hookrequest_14.iComponentDefs;
								if (icomponentdefinitions_10.anInt1288 < 0) {
									break;
								}
								icomponentdefinitions_11 = Class117.getInterfaceComponent(icomponentdefinitions_10.anInt1305);
							} while (icomponentdefinitions_11 == null || icomponentdefinitions_11.aClass118Array1438 == null || icomponentdefinitions_10.anInt1288 >= icomponentdefinitions_11.aClass118Array1438.length || icomponentdefinitions_10 != icomponentdefinitions_11.aClass118Array1438[icomponentdefinitions_10.anInt1288]);
							Class96_Sub4.executeHookInner200k(hookrequest_14, 859874447);
						}
					}
				}
			}
		}
	}

	public static void setParticleIndex(Index index_0, byte b_1) {
		CoordGrid.PARTICLE_INDEX = index_0;
	}
}
