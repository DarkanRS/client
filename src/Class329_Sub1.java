import java.util.Arrays;

public class Class329_Sub1 extends Class329 {

	public static int anInt7726;

	static boolean aBool7717 = false;

	static boolean aBool7714 = false;

	static int[] anIntArray7724 = new int[] { 1, 0, -1, 0 };

	static int[] anIntArray7720 = new int[] { 0, -1, 0, 1 };

	static int[] anIntArray7721 = new int[] { 1, -1, -1, 1 };

	static int[] anIntArray7713 = new int[] { -1, -1, 1, 1 };

	int anInt7723 = 99;

	ObjectIndexLoader objectDefLoader;

	Class239 aClass239_7719;

	final void method12459(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, ClipMap clipmap_9, int i_10, int i_11) {
		if (i_3 < this.anInt7723) {
			this.anInt7723 = i_3;
		}
		ObjectDefinitions objectdefinitions_12 = this.objectDefLoader.getObjectDefinitions(i_6);
		if (Class393.preferences.textures.method12873(590379458) != 0 || !objectdefinitions_12.hidden) {
			int i_13;
			int i_14;
			if (i_7 != 1 && i_7 != 3) {
				i_13 = objectdefinitions_12.sizeX;
				i_14 = objectdefinitions_12.sizeY;
			} else {
				i_13 = objectdefinitions_12.sizeY;
				i_14 = objectdefinitions_12.sizeX;
			}
			int i_15;
			int i_16;
			if (i_13 + i_4 <= this.maxX) {
				i_15 = (i_13 >> 1) + i_4;
				i_16 = (i_13 + 1 >> 1) + i_4;
			} else {
				i_15 = i_4;
				i_16 = i_4 + 1;
			}
			int i_17;
			int i_18;
			if (i_5 + i_14 <= this.maxY) {
				i_17 = i_5 + (i_14 >> 1);
				i_18 = i_5 + (i_14 + 1 >> 1);
			} else {
				i_17 = i_5;
				i_18 = i_5 + 1;
			}
			Ground class390_19 = this.sceneObjectManager.aClass390Array2591[i_2];
			int i_20 = class390_19.method6722(i_15, i_17) + class390_19.method6722(i_16, i_17) + class390_19.method6722(i_15, i_18) + class390_19.method6722(i_16, i_18) >> 2;
			int i_21 = (i_4 << 9) + (i_13 << 8);
			int i_22 = (i_5 << 9) + (i_14 << 8);
			boolean bool_23 = this.aBool3773 && !this.overlayHidden && objectdefinitions_12.delayShading;
			if (objectdefinitions_12.hasSound(317865608)) {
				Class397.method6775(i_3, i_4, i_5, i_7, objectdefinitions_12, (NPC) null, (Player) null, 2109240355);
			}
			boolean bool_24 = i_10 == -1 && !objectdefinitions_12.method7967((byte) 85) && objectdefinitions_12.toObjectIds == null && !objectdefinitions_12.hasAnimation && !objectdefinitions_12.aBool5699;
			if (!aBool7717 || (!Class308.isWall(i_8, -2097799445) || objectdefinitions_12.occludes == 1) && (!QuestDefinitions.isRoof(i_8, -1938518575) || objectdefinitions_12.occludes != 0)) {
				Object obj_25;
				if (i_8 == SceneObjectType.GROUND_DECORATION.type) {
					if (Class393.preferences.aClass468_Sub23_8202.method12897((byte) 84) != 0 || objectdefinitions_12.interactable != 0 || objectdefinitions_12.clipType == 1 || objectdefinitions_12.obstructsGround) {
						if (bool_24) {
							Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1_26 = new Class521_Sub1_Sub3_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_12, i_3, i_2, i_21, i_20, i_22, this.overlayHidden, i_7, bool_23);
							if (class521_sub1_sub3_sub1_26.method86(1102115730)) {
								class521_sub1_sub3_sub1_26.method87(graphicalrenderer_1);
							}
							obj_25 = class521_sub1_sub3_sub1_26;
						} else {
							obj_25 = new GroundDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_12, i_3, i_2, i_21, i_20, i_22, this.overlayHidden, i_7, i_10);
						}
						this.sceneObjectManager.method3393(i_3, i_4, i_5, (SceneObjectNode) obj_25);
						if (objectdefinitions_12.clipType == 1 && clipmap_9 != null) {
							clipmap_9.addBlockFloorDeco(i_4, i_5);
						}
					}
				} else if (i_8 != SceneObjectType.SCENERY_INTERACT.type && i_8 != SceneObjectType.GROUND_INTERACT.type) {
					if (!QuestDefinitions.isRoof(i_8, -2013524019) && !HitsplatDefinitions.method3849(i_8)) {
						if (!this.method12464(graphicalrenderer_1, i_8, i_7, bool_24, objectdefinitions_12, i_10, i_3, i_2, i_21, i_20, i_22, i_4, i_5, bool_23, class390_19, clipmap_9, i_13, i_14)) {
							this.method12465(graphicalrenderer_1, i_8, i_7, bool_24, objectdefinitions_12, i_10, i_3, i_2, i_21, i_20, i_22, i_4, i_5);
						}
					} else {
						if (bool_24) {
							Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_33 = new Class521_Sub1_Sub1_Sub6(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_12, i_3, i_2, i_21, i_20, i_22, this.overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, bool_23);
							if (class521_sub1_sub1_sub6_33.method86(2126103199)) {
								class521_sub1_sub1_sub6_33.method87(graphicalrenderer_1);
							}
							obj_25 = class521_sub1_sub1_sub6_33;
						} else {
							obj_25 = new InteractableObject(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_12, i_3, i_2, i_21, i_20, i_22, this.overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, i_10);
						}
						this.sceneObjectManager.method3397((Class521_Sub1_Sub1) obj_25, false, -83080800);
						if (this.aBool3773 && !this.overlayHidden && QuestDefinitions.isRoof(i_8, -1226229167) && i_8 != SceneObjectType.DIAGONAL_SLOPE_ROOF.type && i_3 > 0 && objectdefinitions_12.occludes != 0) {
							this.aByteArrayArrayArray3794[i_3][i_4][i_5] = (byte) (this.aByteArrayArrayArray3794[i_3][i_4][i_5] | 0x4);
						}
						if (objectdefinitions_12.clipType != 0 && clipmap_9 != null) {
							clipmap_9.addObject(i_4, i_5, i_13, i_14, objectdefinitions_12.projectileClipped, !objectdefinitions_12.gateway, (byte) -122);
						}
					}
				} else {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_31 = null;
					int i_27;
					Object obj_32;
					if (bool_24) {
						Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_28 = new Class521_Sub1_Sub1_Sub6(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_12, i_3, i_2, i_21, i_20, i_22, this.overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, bool_23);
						i_27 = class521_sub1_sub1_sub6_28.method16115();
						obj_32 = class521_sub1_sub1_sub6_28;
						class521_sub1_sub1_sub6_31 = class521_sub1_sub1_sub6_28;
					} else {
						obj_32 = new InteractableObject(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_12, i_3, i_2, i_21, i_20, i_22, this.overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, i_10);
						i_27 = 15;
					}
					if (this.sceneObjectManager.method3397((Class521_Sub1_Sub1) obj_32, false, 1685535245)) {
						if (class521_sub1_sub1_sub6_31 != null && class521_sub1_sub1_sub6_31.method86(1742426135)) {
							class521_sub1_sub1_sub6_31.method87(graphicalrenderer_1);
						}
						if (objectdefinitions_12.castsShadow && this.aBool3773) {
							if (i_27 > 30) {
								i_27 = 30;
							}
							for (int i_30 = 0; i_30 <= i_13; i_30++) {
								for (int i_29 = 0; i_29 <= i_14; i_29++) {
									class390_19.LA(i_30 + i_4, i_5 + i_29, i_27);
								}
							}
						}
					}
					if (objectdefinitions_12.clipType != 0 && clipmap_9 != null) {
						clipmap_9.addObject(i_4, i_5, i_13, i_14, objectdefinitions_12.projectileClipped, !objectdefinitions_12.gateway, (byte) -99);
					}
				}
			}
		}
	}

	public final void method12460(GraphicalRenderer graphicalrenderer_1, RsByteBuffer rsbytebuffer_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (!this.overlayHidden) {
			boolean bool_11 = false;
			Class535 class535_12 = null;
			int i_13 = (i_7 & 0x7) * 8;
			int i_14 = (i_8 & 0x7) * 8;
			while (true) {
				int i_15;
				int i_16;
				int i_18;
				int i_27;
				while (rsbytebuffer_2.index < rsbytebuffer_2.buffer.length) {
					i_15 = rsbytebuffer_2.readUnsignedByte();
					if (i_15 == 0) {
						if (class535_12 == null) {
							class535_12 = new Class535(rsbytebuffer_2, this.aClass239_7719);
						} else {
							class535_12.method11468(rsbytebuffer_2, this.aClass239_7719, -1126147349);
						}
					} else {
						int i_21;
						int i_22;
						int i_23;
						int i_29;
						if (i_15 == 1) {
							i_16 = rsbytebuffer_2.readUnsignedByte();
							if (i_16 > 0) {
								for (i_27 = 0; i_27 < i_16; i_27++) {
									Class287 class287_25 = new Class287(graphicalrenderer_1, this.sceneObjectManager.anInt2592, rsbytebuffer_2);
									if (class287_25.anInt3430 == 31) {
										Class416 class416_19 = IndexLoaders.aClass436_7683.method7304(rsbytebuffer_2.readUnsignedShort(), (byte) -123);
										class287_25.method5061(class416_19.anInt4986, class416_19.anInt4989, class416_19.anInt4988, class416_19.anInt4987);
									}
									if (graphicalrenderer_1.method8463() > 0) {
										Class282_Sub24 class282_sub24_28 = class287_25.aClass282_Sub24_3425;
										i_29 = class282_sub24_28.method12368((byte) 87) >> 9;
										i_21 = class282_sub24_28.method12394(1893246471) >> 9;
										if (class287_25.anInt3419 == i_6 && i_29 >= i_13 && i_29 < i_13 + 8 && i_21 >= i_14 && i_21 < i_14 + 8) {
											i_22 = (i_4 << 9) + Class282_Sub20_Sub39.method15436(class282_sub24_28.method12368((byte) 59) & 0xfff, class282_sub24_28.method12394(1407877313) & 0xfff, i_9);
											i_23 = (i_5 << 9) + Class354.method6214(class282_sub24_28.method12368((byte) 59) & 0xfff, class282_sub24_28.method12394(1257447923) & 0xfff, i_9);
											i_29 = i_22 >> 9;
											i_21 = i_23 >> 9;
											if (i_29 >= 0 && i_21 >= 0 && i_29 < this.maxX && i_21 < this.maxY) {
												class282_sub24_28.method12374(i_22, this.tileHeights[i_6][i_29][i_21] - class282_sub24_28.method12369(), i_23, 1982941604);
												this.sceneObjectManager.method3430(class287_25);
											}
										}
									}
								}
							}
						} else if (i_15 == 2) {
							if (class535_12 == null) {
								class535_12 = new Class535();
							}
							class535_12.method11471(rsbytebuffer_2, (byte) -104);
						} else if (i_15 == 128) {
							if (class535_12 == null) {
								class535_12 = new Class535();
							}
							class535_12.method11472(rsbytebuffer_2, this.aClass239_7719);
						} else {
							if (i_15 != 129) {
								throw new IllegalStateException("");
							}
							if (this.aByteArrayArrayArray3788 == null) {
								this.aByteArrayArrayArray3788 = new byte[4][][];
							}
							for (i_16 = 0; i_16 < 4; i_16++) {
								byte b_17 = rsbytebuffer_2.readByte();
								int i_26;
								if (b_17 == 0 && this.aByteArrayArrayArray3788[i_3] != null) {
									if (i_16 <= i_6) {
										i_18 = i_4;
										i_26 = i_4 + 7;
										i_29 = i_5;
										i_21 = i_5 + 7;
										if (i_4 < 0) {
											i_18 = 0;
										} else if (i_4 >= this.maxX) {
											i_18 = this.maxX;
										}
										if (i_26 < 0) {
											i_26 = 0;
										} else if (i_26 >= this.maxX) {
											i_26 = this.maxX;
										}
										if (i_5 < 0) {
											i_29 = 0;
										} else if (i_5 >= this.maxY) {
											i_29 = this.maxY;
										}
										if (i_21 < 0) {
											i_21 = 0;
										} else if (i_21 >= this.maxY) {
											i_21 = this.maxY;
										}
										while (i_18 < i_26) {
											while (i_29 < i_21) {
												this.aByteArrayArrayArray3788[i_3][i_18][i_29] = 0;
												++i_29;
											}
											++i_18;
										}
									}
								} else if (b_17 != 1) {
									if (b_17 == 2) {
										;
									}
								} else {
									if (this.aByteArrayArrayArray3788[i_3] == null) {
										this.aByteArrayArrayArray3788[i_3] = new byte[this.maxX + 1][this.maxY + 1];
									}
									for (i_18 = 0; i_18 < 64; i_18 += 4) {
										for (i_26 = 0; i_26 < 64; i_26 += 4) {
											byte b_20 = rsbytebuffer_2.readByte();
											if (i_16 <= i_6) {
												for (i_21 = i_18; i_21 < i_18 + 4; i_21++) {
													for (i_22 = i_26; i_22 < i_26 + 4; i_22++) {
														if (i_21 >= i_13 && i_21 < i_13 + 8 && i_22 >= i_14 && i_22 < i_14 + 8) {
															i_23 = i_4 + Class112.method1871(i_21 & 0x7, i_22 & 0x7, i_9);
															int i_24 = i_5 + Class2.method259(i_21 & 0x7, i_22 & 0x7, i_9, 959009236);
															if (i_23 >= 0 && i_23 < this.maxX && i_24 >= 0 && i_24 < this.maxY) {
																this.aByteArrayArrayArray3788[i_3][i_23][i_24] = b_20;
																bool_11 = true;
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
				if (class535_12 != null) {
					this.aClass239_7719.method4056(i_4 >> 3, i_5 >> 3, class535_12, (byte) 95);
				}
				if (!bool_11 && this.aByteArrayArrayArray3788 != null && this.aByteArrayArrayArray3788[i_3] != null) {
					i_15 = i_4 + 7;
					i_16 = i_5 + 7;
					for (i_27 = i_4; i_27 < i_15; i_27++) {
						for (i_18 = i_5; i_18 < i_16; i_18++) {
							this.aByteArrayArrayArray3788[i_3][i_27][i_18] = 0;
						}
					}
				}
				break;
			}
		}
	}

	public final void method12461(GraphicalRenderer graphicalrenderer_1, byte[] bytes_2, int i_3, int i_4, ClipMap[] arr_5) {
		RsByteBuffer rsbytebuffer_7 = new RsByteBuffer(bytes_2);
		int i_8 = -1;
		while (true) {
			int i_9 = rsbytebuffer_7.readSmart2(75082230);
			if (i_9 == 0) {
				return;
			}
			i_8 += i_9;
			int i_10 = 0;
			while (true) {
				int i_11 = rsbytebuffer_7.readUnsignedSmart();
				if (i_11 == 0) {
					break;
				}
				i_10 += i_11 - 1;
				int i_12 = i_10 & 0x3f;
				int i_13 = i_10 >> 6 & 0x3f;
				int i_14 = i_10 >> 12;
				int i_15 = rsbytebuffer_7.readUnsignedByte();
				int i_16 = i_15 >> 2;
				int i_17 = i_15 & 0x3;
				int i_18 = i_3 + i_13;
				int i_19 = i_12 + i_4;
				if (i_18 > 0 && i_19 > 0 && i_18 < this.maxX - 1 && i_19 < this.maxY - 1) {
					ClipMap clipmap_20 = null;
					if (!this.overlayHidden) {
						int i_21 = i_14;
						if ((this.regionMap.tileMasks[1][i_18][i_19] & 0x2) == 2) {
							i_21 = i_14 - 1;
						}
						if (i_21 >= 0) {
							clipmap_20 = arr_5[i_21];
						}
					}
					this.method12459(graphicalrenderer_1, i_14, i_14, i_18, i_19, i_8, i_17, i_16, clipmap_20, -1, 2114561381);
				}
			}
		}
	}

	public final void method12462(GraphicalRenderer graphicalrenderer_1, byte[] bytes_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, ClipMap[] arr_10) {
		RsByteBuffer rsbytebuffer_12 = new RsByteBuffer(bytes_2);
		int i_13 = -1;
		while (true) {
			int i_14 = rsbytebuffer_12.readSmart2(-378735322);
			if (i_14 == 0) {
				return;
			}
			i_13 += i_14;
			int i_15 = 0;
			while (true) {
				int i_16 = rsbytebuffer_12.readUnsignedSmart();
				if (i_16 == 0) {
					break;
				}
				i_15 += i_16 - 1;
				int i_17 = i_15 & 0x3f;
				int i_18 = i_15 >> 6 & 0x3f;
				int i_19 = i_15 >> 12;
				int i_20 = rsbytebuffer_12.readUnsignedByte();
				int i_21 = i_20 >> 2;
				int i_22 = i_20 & 0x3;
				if (i_19 == i_6 && i_18 >= i_7 && i_18 < i_7 + 8 && i_17 >= i_8 && i_17 < i_8 + 8) {
					ObjectDefinitions objectdefinitions_23 = this.objectDefLoader.getObjectDefinitions(i_13);
					int i_24 = i_4 + Class222.method3756(i_18 & 0x7, i_17 & 0x7, i_9, objectdefinitions_23.sizeX, objectdefinitions_23.sizeY, i_22);
					int i_25 = i_5 + Class3.method282(i_18 & 0x7, i_17 & 0x7, i_9, objectdefinitions_23.sizeX, objectdefinitions_23.sizeY, i_22);
					if (i_24 > 0 && i_25 > 0 && i_24 < this.maxX - 1 && i_25 < this.maxY - 1) {
						ClipMap clipmap_26 = null;
						if (!this.overlayHidden) {
							int i_27 = i_3;
							if ((this.regionMap.tileMasks[1][i_24][i_25] & 0x2) == 2) {
								i_27 = i_3 - 1;
							}
							if (i_27 >= 0) {
								clipmap_26 = arr_10[i_27];
							}
						}
						this.method12459(graphicalrenderer_1, i_3, i_3, i_24, i_25, i_13, i_22 + i_9 & 0x3, i_21, clipmap_26, -1, 1428988045);
					}
				}
			}
		}
	}

	public final void method12463(GraphicalRenderer graphicalrenderer_1, boolean bool_2, int i_3) {
		this.sceneObjectManager.method3400();
		if (!bool_2) {
			int i_4;
			int i_5;
			if (this.anInt3845 > 1) {
				for (i_4 = 0; i_4 < this.maxX; i_4++) {
					for (i_5 = 0; i_5 < this.maxY; i_5++) {
						if ((this.regionMap.tileMasks[1][i_4][i_5] & 0x2) == 2) {
							this.sceneObjectManager.method3382(i_4, i_5);
						}
					}
				}
			}
			for (i_4 = 0; i_4 < this.anInt3845; i_4++) {
				for (i_5 = 0; i_5 <= this.maxY; i_5++) {
					for (int i_6 = 0; i_6 <= this.maxX; i_6++) {
						if ((this.aByteArrayArrayArray3794[i_4][i_6][i_5] & 0x4) != 0) {
							int i_7 = i_6;
							int i_8 = i_6;
							int i_9 = i_5;
							int i_10;
							for (i_10 = i_5; i_9 > 0 && (this.aByteArrayArrayArray3794[i_4][i_6][i_9 - 1] & 0x4) != 0 && i_10 - i_9 < 10; --i_9) {
								;
							}
							while (i_10 < this.maxY && (this.aByteArrayArrayArray3794[i_4][i_6][i_10 + 1] & 0x4) != 0 && i_10 - i_9 < 10) {
								++i_10;
							}
							int i_11;
							label112: while (i_7 > 0 && i_8 - i_7 < 10) {
								for (i_11 = i_9; i_11 <= i_10; i_11++) {
									if ((this.aByteArrayArrayArray3794[i_4][i_7 - 1][i_11] & 0x4) == 0) {
										break label112;
									}
								}
								--i_7;
							}
							label99: while (i_8 < this.maxX && i_8 - i_7 < 10) {
								for (i_11 = i_9; i_11 <= i_10; i_11++) {
									if ((this.aByteArrayArrayArray3794[i_4][i_8 + 1][i_11] & 0x4) == 0) {
										break label99;
									}
								}
								++i_8;
							}
							if ((i_8 - i_7 + 1) * (i_10 - i_9 + 1) >= 4) {
								i_11 = this.tileHeights[i_4][i_7][i_9];
								this.sceneObjectManager.aClass201_2600.method3266(i_4, i_7 << 9, (i_8 << 9) + 512, i_9 << 9, (i_10 << 9) + 512, i_11, i_11);
								for (int i_12 = i_7; i_12 <= i_8; i_12++) {
									for (int i_13 = i_9; i_13 <= i_10; i_13++) {
										this.aByteArrayArrayArray3794[i_4][i_12][i_13] &= ~0x4;
									}
								}
							}
						}
					}
				}
			}
			this.sceneObjectManager.aClass201_2600.method3264();
		}
		this.aByteArrayArrayArray3794 = null;
	}

	boolean method12464(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, boolean bool_4, ObjectDefinitions objectdefinitions_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, boolean bool_14, Ground class390_15, ClipMap clipmap_16, int i_17, int i_18) {
		int i_20;
		Object obj_28;
		if (i_2 == SceneObjectType.WALL_STRAIGHT.type) {
			i_20 = objectdefinitions_5.occludes;
			if (aBool7714 && objectdefinitions_5.occludes == -1) {
				i_20 = 1;
			}
			if (bool_4) {
				Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_29 = new Class521_Sub1_Sub5_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3, bool_14);
				if (class521_sub1_sub5_sub1_29.method86(2031686650)) {
					class521_sub1_sub5_sub1_29.method87(graphicalrenderer_1);
				}
				obj_28 = class521_sub1_sub5_sub1_29;
			} else {
				obj_28 = new Wall(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3, i_6);
			}
			this.sceneObjectManager.method3395(i_7, i_12, i_13, (Class521_Sub1_Sub5) obj_28, (Class521_Sub1_Sub5) null, -759421433);
			if (i_3 == 0) {
				if (this.aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12, i_13, 50);
					class390_15.LA(i_12, i_13 + 1, 50);
				}
				if (i_20 == 1 && !this.overlayHidden) {
					this.sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
				}
			} else if (i_3 == 1) {
				if (this.aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12, i_13 + 1, 50);
					class390_15.LA(i_12 + 1, i_13 + 1, 50);
				}
				if (i_20 == 1 && !this.overlayHidden) {
					this.sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13 + 1, objectdefinitions_5.anInt5684, -objectdefinitions_5.anInt5658);
				}
			} else if (i_3 == 2) {
				if (this.aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12 + 1, i_13, 50);
					class390_15.LA(i_12 + 1, i_13 + 1, 50);
				}
				if (i_20 == 1 && !this.overlayHidden) {
					this.sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12 + 1, i_13, objectdefinitions_5.anInt5684, -objectdefinitions_5.anInt5658);
				}
			} else if (i_3 == 3) {
				if (this.aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12, i_13, 50);
					class390_15.LA(i_12 + 1, i_13, 50);
				}
				if (i_20 == 1 && !this.overlayHidden) {
					this.sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
				}
			}
			if (objectdefinitions_5.clipType != 0 && clipmap_16 != null) {
				clipmap_16.method5971(i_12, i_13, i_2, i_3, objectdefinitions_5.projectileClipped, !objectdefinitions_5.gateway);
			}
			if (objectdefinitions_5.decorDisplacement != 64) {
				this.sceneObjectManager.method3398(i_7, i_12, i_13, objectdefinitions_5.decorDisplacement, (byte) 45);
			}
			return true;
		} else {
			Object obj_25;
			Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_27;
			if (i_2 == SceneObjectType.WALL_DIAGONAL_CORNER.type) {
				if (bool_4) {
					class521_sub1_sub5_sub1_27 = new Class521_Sub1_Sub5_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3, bool_14);
					if (class521_sub1_sub5_sub1_27.method86(186811932)) {
						class521_sub1_sub5_sub1_27.method87(graphicalrenderer_1);
					}
					obj_25 = class521_sub1_sub5_sub1_27;
				} else {
					obj_25 = new Wall(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3, i_6);
				}
				this.sceneObjectManager.method3395(i_7, i_12, i_13, (Class521_Sub1_Sub5) obj_25, (Class521_Sub1_Sub5) null, -68723515);
				if (objectdefinitions_5.castsShadow && this.aBool3773) {
					if (i_3 == 0) {
						class390_15.LA(i_12, i_13 + 1, 50);
					} else if (i_3 == 1) {
						class390_15.LA(i_12 + 1, i_13 + 1, 50);
					} else if (i_3 == 2) {
						class390_15.LA(i_12 + 1, i_13, 50);
					} else if (i_3 == 3) {
						class390_15.LA(i_12, i_13, 50);
					}
				}
				if (objectdefinitions_5.clipType != 0 && clipmap_16 != null) {
					clipmap_16.method5971(i_12, i_13, i_2, i_3, objectdefinitions_5.projectileClipped, !objectdefinitions_5.gateway);
				}
				return true;
			} else if (i_2 == SceneObjectType.WALL_WHOLE_CORNER.type) {
				i_20 = i_3 + 1 & 0x3;
				Object obj_22;
				if (bool_4) {
					Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_23 = new Class521_Sub1_Sub5_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3 + 4, bool_14);
					Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_24 = new Class521_Sub1_Sub5_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_20, bool_14);
					if (class521_sub1_sub5_sub1_23.method86(1640390953)) {
						class521_sub1_sub5_sub1_23.method87(graphicalrenderer_1);
					}
					if (class521_sub1_sub5_sub1_24.method86(119698496)) {
						class521_sub1_sub5_sub1_24.method87(graphicalrenderer_1);
					}
					obj_28 = class521_sub1_sub5_sub1_23;
					obj_22 = class521_sub1_sub5_sub1_24;
				} else {
					obj_28 = new Wall(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3 + 4, i_6);
					obj_22 = new Wall(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_20, i_6);
				}
				this.sceneObjectManager.method3395(i_7, i_12, i_13, (Class521_Sub1_Sub5) obj_28, (Class521_Sub1_Sub5) obj_22, -1866295330);
				if ((objectdefinitions_5.occludes == 1 || aBool7714 && objectdefinitions_5.occludes == -1) && !this.overlayHidden) {
					if (i_3 == 0) {
						this.sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
						this.sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13 + 1, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					} else if (i_3 == 1) {
						this.sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12 + 1, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
						this.sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13 + 1, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					} else if (i_3 == 2) {
						this.sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12 + 1, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
						this.sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					} else if (i_3 == 3) {
						this.sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
						this.sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					}
				}
				if (objectdefinitions_5.clipType != 0 && clipmap_16 != null) {
					clipmap_16.method5971(i_12, i_13, i_2, i_3, objectdefinitions_5.projectileClipped, !objectdefinitions_5.gateway);
				}
				if (objectdefinitions_5.decorDisplacement != 64) {
					this.sceneObjectManager.method3398(i_7, i_12, i_13, objectdefinitions_5.decorDisplacement, (byte) 58);
				}
				return true;
			} else if (i_2 == SceneObjectType.WALL_STRAIGHT_CORNER.type) {
				if (bool_4) {
					class521_sub1_sub5_sub1_27 = new Class521_Sub1_Sub5_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3, bool_14);
					if (class521_sub1_sub5_sub1_27.method86(88380172)) {
						class521_sub1_sub5_sub1_27.method87(graphicalrenderer_1);
					}
					obj_25 = class521_sub1_sub5_sub1_27;
				} else {
					obj_25 = new Wall(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_2, i_3, i_6);
				}
				this.sceneObjectManager.method3395(i_7, i_12, i_13, (Class521_Sub1_Sub5) obj_25, (Class521_Sub1_Sub5) null, -340500627);
				if (objectdefinitions_5.castsShadow && this.aBool3773) {
					if (i_3 == 0) {
						class390_15.LA(i_12, i_13 + 1, 50);
					} else if (i_3 == 1) {
						class390_15.LA(i_12 + 1, i_13 + 1, 50);
					} else if (i_3 == 2) {
						class390_15.LA(i_12 + 1, i_13, 50);
					} else if (i_3 == 3) {
						class390_15.LA(i_12, i_13, 50);
					}
				}
				if (objectdefinitions_5.clipType != 0 && clipmap_16 != null) {
					clipmap_16.method5971(i_12, i_13, i_2, i_3, objectdefinitions_5.projectileClipped, !objectdefinitions_5.gateway);
				}
				return true;
			} else if (i_2 == SceneObjectType.WALL_INTERACT.type) {
				if (bool_4) {
					Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_21 = new Class521_Sub1_Sub1_Sub6(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_12, i_12, i_13, i_13, i_2, i_3, bool_14);
					if (class521_sub1_sub1_sub6_21.method86(336072278)) {
						class521_sub1_sub1_sub6_21.method87(graphicalrenderer_1);
					}
					obj_25 = class521_sub1_sub1_sub6_21;
				} else {
					obj_25 = new InteractableObject(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_12, i_17 + i_12 - 1, i_13, i_18 + i_13 - 1, i_2, i_3, i_6);
				}
				this.sceneObjectManager.method3397((Class521_Sub1_Sub1) obj_25, false, 1635515614);
				if (objectdefinitions_5.occludes == 1 && !this.overlayHidden) {
					byte b_26;
					if ((i_3 & 0x1) == 0) {
						b_26 = 8;
					} else {
						b_26 = 16;
					}
					this.sceneObjectManager.aClass201_2600.method3262(b_26, i_7, i_12, i_13, objectdefinitions_5.anInt5684, 0);
				}
				if (objectdefinitions_5.clipType != 0 && clipmap_16 != null) {
					clipmap_16.addObject(i_12, i_13, i_17, i_18, objectdefinitions_5.projectileClipped, !objectdefinitions_5.gateway, (byte) -60);
				}
				if (objectdefinitions_5.decorDisplacement != 64) {
					this.sceneObjectManager.method3398(i_7, i_12, i_13, objectdefinitions_5.decorDisplacement, (byte) 81);
				}
				return true;
			} else {
				return false;
			}
		}
	}

	boolean method12465(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, boolean bool_4, ObjectDefinitions objectdefinitions_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13) {
		if (i_2 == SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type) {
			Object obj_15;
			if (bool_4) {
				Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_26 = new Class521_Sub1_Sub4_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, 0, 0, i_2, i_3);
				if (class521_sub1_sub4_sub1_26.method86(240231077)) {
					class521_sub1_sub4_sub1_26.method87(graphicalrenderer_1);
				}
				obj_15 = class521_sub1_sub4_sub1_26;
			} else {
				obj_15 = new WallDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, 0, 0, i_2, i_3, i_6);
			}
			this.sceneObjectManager.method3396(i_7, i_12, i_13, (Class521_Sub1_Sub4) obj_15, (Class521_Sub1_Sub4) null);
			return true;
		} else {
			int i_22;
			SceneObject sceneobject_24;
			Object obj_27;
			Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_28;
			if (i_2 == SceneObjectType.STRAIGHT_OUSIDE_WALL_DEC.type) {
				i_22 = 65;
				sceneobject_24 = (SceneObject) this.sceneObjectManager.getWall(i_7, i_12, i_13, (byte) -117);
				if (sceneobject_24 != null) {
					i_22 = this.objectDefLoader.getObjectDefinitions(sceneobject_24.getId(897339826)).decorDisplacement + 1;
				}
				if (bool_4) {
					class521_sub1_sub4_sub1_28 = new Class521_Sub1_Sub4_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_22 * anIntArray7724[i_3], i_22 * anIntArray7720[i_3], i_2, i_3);
					if (class521_sub1_sub4_sub1_28.method86(-1255760625)) {
						class521_sub1_sub4_sub1_28.method87(graphicalrenderer_1);
					}
					obj_27 = class521_sub1_sub4_sub1_28;
				} else {
					obj_27 = new WallDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_22 * anIntArray7724[i_3], i_22 * anIntArray7720[i_3], i_2, i_3, i_6);
				}
				this.sceneObjectManager.method3396(i_7, i_12, i_13, (Class521_Sub1_Sub4) obj_27, (Class521_Sub1_Sub4) null);
				return true;
			} else if (i_2 == SceneObjectType.DIAGONAL_OUTSIDE_WALL_DEC.type) {
				i_22 = 33;
				sceneobject_24 = (SceneObject) this.sceneObjectManager.getWall(i_7, i_12, i_13, (byte) -91);
				if (sceneobject_24 != null) {
					i_22 = this.objectDefLoader.getObjectDefinitions(sceneobject_24.getId(-33334546)).decorDisplacement / 2 + 1;
				}
				if (bool_4) {
					class521_sub1_sub4_sub1_28 = new Class521_Sub1_Sub4_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_22 * anIntArray7724[i_3], i_22 * anIntArray7720[i_3], i_2, i_3 + 4);
					if (class521_sub1_sub4_sub1_28.method86(-716487834)) {
						class521_sub1_sub4_sub1_28.method87(graphicalrenderer_1);
					}
					obj_27 = class521_sub1_sub4_sub1_28;
				} else {
					obj_27 = new WallDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_22 * anIntArray7721[i_3], i_22 * anIntArray7713[i_3], i_2, i_3 + 4, i_6);
				}
				this.sceneObjectManager.method3396(i_7, i_12, i_13, (Class521_Sub1_Sub4) obj_27, (Class521_Sub1_Sub4) null);
				return true;
			} else if (i_2 == SceneObjectType.DIAGONAL_INSIDE_WALL_DEC.type) {
				i_22 = i_3 + 2 & 0x3;
				Object obj_16;
				if (bool_4) {
					Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_25 = new Class521_Sub1_Sub4_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, 0, 0, i_2, i_22 + 4);
					if (class521_sub1_sub4_sub1_25.method86(1853694415)) {
						class521_sub1_sub4_sub1_25.method87(graphicalrenderer_1);
					}
					obj_16 = class521_sub1_sub4_sub1_25;
				} else {
					obj_16 = new WallDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, 0, 0, i_2, i_22 + 4, i_6);
				}
				this.sceneObjectManager.method3396(i_7, i_12, i_13, (Class521_Sub1_Sub4) obj_16, (Class521_Sub1_Sub4) null);
				return true;
			} else if (i_2 == SceneObjectType.DIAGONAL_INWALL_DEC.type) {
				i_22 = i_3 + 2 & 0x3;
				int i_23 = 33;
				SceneObject sceneobject_17 = (SceneObject) this.sceneObjectManager.getWall(i_7, i_12, i_13, (byte) -3);
				if (sceneobject_17 != null) {
					i_23 = this.objectDefLoader.getObjectDefinitions(sceneobject_17.getId(-824380403)).decorDisplacement / 2 + 1;
				}
				Object obj_18;
				Object obj_19;
				if (bool_4) {
					Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_20 = new Class521_Sub1_Sub4_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_23 * anIntArray7721[i_3], i_23 * anIntArray7713[i_3], i_2, i_3 + 4);
					Class521_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_21 = new Class521_Sub1_Sub4_Sub1(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, 0, 0, i_2, i_22 + 4);
					if (class521_sub1_sub4_sub1_20.method86(907345148)) {
						class521_sub1_sub4_sub1_20.method87(graphicalrenderer_1);
					}
					if (class521_sub1_sub4_sub1_21.method86(1796803842)) {
						class521_sub1_sub4_sub1_21.method87(graphicalrenderer_1);
					}
					obj_18 = class521_sub1_sub4_sub1_20;
					obj_19 = class521_sub1_sub4_sub1_21;
				} else {
					WallDecoration walldecoration_29 = new WallDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, i_23 * anIntArray7721[i_3], i_23 * anIntArray7713[i_3], i_2, i_3 + 4, i_6);
					WallDecoration walldecoration_30 = new WallDecoration(this.sceneObjectManager, graphicalrenderer_1, this.objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, this.overlayHidden, 0, 0, i_2, i_22 + 4, i_6);
					obj_18 = walldecoration_29;
					obj_19 = walldecoration_30;
				}
				this.sceneObjectManager.method3396(i_7, i_12, i_13, (Class521_Sub1_Sub4) obj_18, (Class521_Sub1_Sub4) obj_19);
				return true;
			} else {
				return false;
			}
		}
	}

	SceneObject method12467(int i_1, int i_2, int i_3, int i_4, int i_5) {
		SceneObject sceneobject_6 = null;
		if (i_2 == 0) {
			sceneobject_6 = (SceneObject) this.sceneObjectManager.getWall(i_1, i_3, i_4, (byte) -111);
		}
		if (i_2 == 1) {
			sceneobject_6 = (SceneObject) this.sceneObjectManager.getWallDecoration(i_1, i_3, i_4, (byte) -56);
		}
		if (i_2 == 2) {
			sceneobject_6 = (SceneObject) this.sceneObjectManager.getInteractableObject(i_1, i_3, i_4, client.anInterface25_7446);
		}
		if (i_2 == 3) {
			sceneobject_6 = (SceneObject) this.sceneObjectManager.getGroundDecoration(i_1, i_3, i_4);
		}
		return sceneobject_6;
	}

	public final void method12471(GraphicalRenderer graphicalrenderer_1, RsByteBuffer rsbytebuffer_2, int i_3, int i_4) {
		if (!this.overlayHidden) {
			boolean bool_6 = false;
			Class535 class535_7 = null;
			while (true) {
				int i_8;
				int i_9;
				int i_11;
				int i_12;
				int i_19;
				while (rsbytebuffer_2.index < rsbytebuffer_2.buffer.length) {
					i_8 = rsbytebuffer_2.readUnsignedByte();
					if (i_8 == 0) {
						if (class535_7 == null) {
							class535_7 = new Class535(rsbytebuffer_2, this.aClass239_7719);
						} else {
							class535_7.method11468(rsbytebuffer_2, this.aClass239_7719, 375597297);
						}
					} else {
						int i_13;
						int i_14;
						int i_15;
						if (i_8 == 1) {
							i_9 = rsbytebuffer_2.readUnsignedByte();
							if (i_9 > 0) {
								for (i_19 = 0; i_19 < i_9; i_19++) {
									Class287 class287_17 = new Class287(graphicalrenderer_1, this.sceneObjectManager.anInt2592, rsbytebuffer_2);
									if (class287_17.anInt3430 == 31) {
										Class416 class416_18 = IndexLoaders.aClass436_7683.method7304(rsbytebuffer_2.readUnsignedShort(), (byte) 56);
										class287_17.method5061(class416_18.anInt4986, class416_18.anInt4989, class416_18.anInt4988, class416_18.anInt4987);
									}
									if (graphicalrenderer_1.method8463() > 0) {
										Class282_Sub24 class282_sub24_21 = class287_17.aClass282_Sub24_3425;
										i_13 = class282_sub24_21.method12368((byte) 18) + (i_3 << 9);
										i_14 = class282_sub24_21.method12394(1333252250) + (i_4 << 9);
										i_15 = i_13 >> 9;
										int i_16 = i_14 >> 9;
										if (i_15 >= 0 && i_16 >= 0 && i_15 < this.maxX && i_16 < this.maxY) {
											class282_sub24_21.method12374(i_13, this.tileHeights[class287_17.anInt3419][i_15][i_16] - class282_sub24_21.method12369(), i_14, 2078101485);
											this.sceneObjectManager.method3430(class287_17);
										}
									}
								}
							}
						} else if (i_8 == 2) {
							if (class535_7 == null) {
								class535_7 = new Class535();
							}
							class535_7.method11471(rsbytebuffer_2, (byte) -6);
						} else if (i_8 == 128) {
							if (class535_7 == null) {
								class535_7 = new Class535();
							}
							class535_7.method11472(rsbytebuffer_2, this.aClass239_7719);
						} else {
							if (i_8 != 129) {
								throw new IllegalStateException("");
							}
							if (this.aByteArrayArrayArray3788 == null) {
								this.aByteArrayArrayArray3788 = new byte[4][][];
							}
							for (i_9 = 0; i_9 < 4; i_9++) {
								byte b_10 = rsbytebuffer_2.readByte();
								if (b_10 == 0 && this.aByteArrayArrayArray3788[i_9] != null) {
									i_11 = i_3;
									i_12 = i_3 + 64;
									i_13 = i_4;
									i_14 = i_4 + 64;
									if (i_3 < 0) {
										i_11 = 0;
									} else if (i_3 >= this.maxX) {
										i_11 = this.maxX;
									}
									if (i_12 < 0) {
										i_12 = 0;
									} else if (i_12 >= this.maxX) {
										i_12 = this.maxX;
									}
									if (i_4 < 0) {
										i_13 = 0;
									} else if (i_4 >= this.maxY) {
										i_13 = this.maxY;
									}
									if (i_14 < 0) {
										i_14 = 0;
									} else if (i_14 >= this.maxY) {
										i_14 = this.maxY;
									}
									while (i_11 < i_12) {
										while (i_13 < i_14) {
											this.aByteArrayArrayArray3788[i_9][i_11][i_13] = 0;
											++i_13;
										}
										++i_11;
									}
								} else if (b_10 == 1) {
									if (this.aByteArrayArrayArray3788[i_9] == null) {
										this.aByteArrayArrayArray3788[i_9] = new byte[this.maxX + 1][this.maxY + 1];
									}
									for (i_11 = 0; i_11 < 64; i_11 += 4) {
										for (i_12 = 0; i_12 < 64; i_12 += 4) {
											byte b_20 = rsbytebuffer_2.readByte();
											for (i_14 = i_3 + i_11; i_14 < i_3 + i_11 + 4; i_14++) {
												for (i_15 = i_12 + i_4; i_15 < i_12 + i_4 + 4; i_15++) {
													if (i_14 >= 0 && i_14 < this.maxX && i_15 >= 0 && i_15 < this.maxY) {
														this.aByteArrayArrayArray3788[i_9][i_14][i_15] = b_20;
													}
												}
											}
										}
									}
								} else if (b_10 == 2) {
									if (this.aByteArrayArrayArray3788[i_9] == null) {
										this.aByteArrayArrayArray3788[i_9] = new byte[this.maxX + 1][this.maxY + 1];
									}
									if (i_9 > 0) {
										i_11 = i_3;
										i_12 = i_3 + 64;
										i_13 = i_4;
										i_14 = i_4 + 64;
										if (i_3 < 0) {
											i_11 = 0;
										} else if (i_3 >= this.maxX) {
											i_11 = this.maxX;
										}
										if (i_12 < 0) {
											i_12 = 0;
										} else if (i_12 >= this.maxX) {
											i_12 = this.maxX;
										}
										if (i_4 < 0) {
											i_13 = 0;
										} else if (i_4 >= this.maxY) {
											i_13 = this.maxY;
										}
										if (i_14 < 0) {
											i_14 = 0;
										} else if (i_14 >= this.maxY) {
											i_14 = this.maxY;
										}
										while (i_11 < i_12) {
											while (i_13 < i_14) {
												this.aByteArrayArrayArray3788[i_9][i_11][i_13] = this.aByteArrayArrayArray3788[i_9 - 1][i_11][i_13];
												++i_13;
											}
											++i_11;
										}
									}
								}
							}
							bool_6 = true;
						}
					}
				}
				if (class535_7 != null) {
					for (i_8 = 0; i_8 < 8; i_8++) {
						for (i_9 = 0; i_9 < 8; i_9++) {
							i_19 = (i_3 >> 3) + i_8;
							i_11 = i_9 + (i_4 >> 3);
							if (i_19 >= 0 && i_19 < this.maxX >> 3 && i_11 >= 0 && i_11 < this.maxY >> 3) {
								this.aClass239_7719.method4056(i_19, i_11, class535_7, (byte) 27);
							}
						}
					}
				}
				if (!bool_6 && this.aByteArrayArrayArray3788 != null) {
					for (i_8 = 0; i_8 < 4; i_8++) {
						if (this.aByteArrayArrayArray3788[i_8] != null) {
							for (i_9 = 0; i_9 < 16; i_9++) {
								for (i_19 = 0; i_19 < 16; i_19++) {
									i_11 = i_9 + (i_3 >> 2);
									i_12 = i_19 + (i_4 >> 2);
									if (i_11 >= 0 && i_11 < 26 && i_12 >= 0 && i_12 < 26) {
										this.aByteArrayArrayArray3788[i_8][i_11][i_12] = 0;
									}
								}
							}
						}
					}
				}
				break;
			}
		}
	}

	void method12475(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, ClipMap clipmap_6) {
		SceneObject sceneobject_8 = this.method12467(i_2, i_3, i_4, i_5, 1923565825);
		if (sceneobject_8 != null) {
			ObjectDefinitions objectdefinitions_9 = this.objectDefLoader.getObjectDefinitions(sceneobject_8.getId(-289246828));
			int i_10 = sceneobject_8.method89(1128699312);
			int i_11 = sceneobject_8.method92(-2000294676);
			if (objectdefinitions_9.hasSound(1930590252)) {
				Class256.method4415(i_2, i_4, i_5, objectdefinitions_9);
			}
			if (sceneobject_8.method86(1202983458)) {
				sceneobject_8.method88(graphicalrenderer_1);
			}
			if (i_3 == 0) {
				this.sceneObjectManager.method3422(i_2, i_4, i_5);
				this.sceneObjectManager.method3460(i_2, i_4, i_5);
				if (objectdefinitions_9.clipType != 0) {
					clipmap_6.method5992(i_4, i_5, i_10, i_11, objectdefinitions_9.projectileClipped, !objectdefinitions_9.gateway);
				}
				if (objectdefinitions_9.occludes == 1) {
					if (i_11 == 0) {
						this.sceneObjectManager.aClass201_2600.method3297(1, i_2, i_4, i_5);
					} else if (i_11 == 1) {
						this.sceneObjectManager.aClass201_2600.method3297(2, i_2, i_4, i_5 + 1);
					} else if (i_11 == 2) {
						this.sceneObjectManager.aClass201_2600.method3297(1, i_2, i_4 + 1, i_5);
					} else if (i_11 == 3) {
						this.sceneObjectManager.aClass201_2600.method3297(2, i_2, i_4, i_5);
					}
				}
			} else if (i_3 == 1) {
				this.sceneObjectManager.method3402(i_2, i_4, i_5);
				this.sceneObjectManager.method3439(i_2, i_4, i_5);
			} else if (i_3 == 2) {
				this.sceneObjectManager.method3530(i_2, i_4, i_5, client.anInterface25_7446, -510350290);
				if (objectdefinitions_9.clipType != 0 && i_4 + objectdefinitions_9.sizeX < this.maxX && i_5 + objectdefinitions_9.sizeX < this.maxY && i_4 + objectdefinitions_9.sizeY < this.maxX && i_5 + objectdefinitions_9.sizeY < this.maxY) {
					clipmap_6.method5970(i_4, i_5, objectdefinitions_9.sizeX, objectdefinitions_9.sizeY, i_11, objectdefinitions_9.projectileClipped, !objectdefinitions_9.gateway);
				}
				if (i_10 == SceneObjectType.WALL_INTERACT.type) {
					if ((i_11 & 0x1) == 0) {
						this.sceneObjectManager.aClass201_2600.method3297(8, i_2, i_4, i_5);
					} else {
						this.sceneObjectManager.aClass201_2600.method3297(16, i_2, i_4, i_5);
					}
				}
			} else if (i_3 == 3) {
				this.sceneObjectManager.method3404(i_2, i_4, i_5);
				if (objectdefinitions_9.clipType == 1) {
					clipmap_6.method5991(i_4, i_5);
				}
			}
		}
	}

	public Class329_Sub1(SceneObjectManager sceneobjectmanager_1, ObjectIndexLoader objectindexloader_2, int i_3, int i_4, int i_5, boolean bool_6, RegionMap regionmap_7, Class239 class239_8) {
		super(sceneobjectmanager_1, i_3, i_4, i_5, bool_6, IndexLoaders.OVERLAY_INDEX_LOADER, IndexLoaders.UNDERLAY_INDEX_LOADER, regionmap_7);
		this.objectDefLoader = objectindexloader_2;
		this.aClass239_7719 = class239_8;
	}

	public static void method12491(Player player_0, int i_1, int i_2) {
		int[] ints_4 = new int[Class8_Sub3.method14339().length];
		Arrays.fill(ints_4, 0, ints_4.length, i_1);
		Class20.animate(player_0, ints_4, i_2, false, (byte) -11);
	}
}
