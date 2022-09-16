package com.jagex;

import java.util.Arrays;

public class Class329_Sub1 extends Class329 {

	public static int anInt7726;

	static boolean aBool7717;

	static boolean aBool7714;

	static int[] anIntArray7724 = {1, 0, -1, 0};

	static int[] anIntArray7720 = {0, -1, 0, 1};

	static int[] anIntArray7721 = {1, -1, -1, 1};

	static int[] anIntArray7713 = {-1, -1, 1, 1};

	public static void animateZero(PlayerEntity player, int size, int speed) {
		int[] animations = new int[MoveSpeed.values().length];
		Arrays.fill(animations, 0, animations.length, size);
		Class20.animate(player, animations, speed, false);
	}

	int anInt7723 = 99;

	LocationIndexLoader objectDefLoader;

	Class239 aClass239_7719;

	public Class329_Sub1(SceneObjectManager sceneobjectmanager_1, LocationIndexLoader objectindexloader_2, int i_3, int i_4, int i_5, boolean bool_6, RenderFlagMap regionmap_7, Class239 class239_8) {
		super(sceneobjectmanager_1, i_3, i_4, i_5, bool_6, IndexLoaders.OVERLAY_LOADER, IndexLoaders.UNDERLAY_LOADER, regionmap_7);
		objectDefLoader = objectindexloader_2;
		aClass239_7719 = class239_8;
	}

	public void decodeDynamicMap(AbstractRenderer renderer, ByteBuf buffer, int plane, int x, int y, int i_6, int i_7, int i_8, int i_9) {
		if (!overlayHidden) {
			boolean bool_11 = false;
			Atmosphere atmosphere = null;
			int i_13 = (i_7 & 0x7) * 8;
			int i_14 = (i_8 & 0x7) * 8;
			while (true) {
				int i_15;
				int i_16;
				int i_18;
				int i_27;
				while (buffer.index < buffer.buffer.length) {
					i_15 = buffer.readUnsignedByte();
					if (i_15 == 0) {
						if (atmosphere == null)
							atmosphere = new Atmosphere(buffer, aClass239_7719);
						else
							atmosphere.method11468(buffer, aClass239_7719);
					} else {
						int i_21;
						int i_22;
						int i_23;
						int i_29;
						if (i_15 == 1) {
							i_16 = buffer.readUnsignedByte();
							if (i_16 > 0)
								for (i_27 = 0; i_27 < i_16; i_27++) {
									Class287 class287_25 = new Class287(renderer, sceneObjectManager.anInt2592, buffer);
									if (class287_25.anInt3430 == 31) {
										LightIntensityDefinitions class416_19 = IndexLoaders.LIGHT_INTENSITY_LOADER.method7304(buffer.readUnsignedShort());
										class287_25.method5061(class416_19.anInt4986, class416_19.anInt4989, class416_19.anInt4988, class416_19.anInt4987);
									}
									if (renderer.method8463() > 0) {
										GLLight class282_sub24_28 = class287_25.aNode_Sub24_3425;
										i_29 = class282_sub24_28.getX() >> 9;
										i_21 = class282_sub24_28.getZ() >> 9;
										if (class287_25.anInt3419 == i_6 && i_29 >= i_13 && i_29 < i_13 + 8 && i_21 >= i_14 && i_21 < i_14 + 8) {
											i_22 = (x << 9) + MaterialProp38.method15436(class282_sub24_28.getX() & 0xfff, class282_sub24_28.getZ() & 0xfff, i_9);
											i_23 = (y << 9) + Class354.method6214(class282_sub24_28.getX() & 0xfff, class282_sub24_28.getZ() & 0xfff, i_9);
											i_29 = i_22 >> 9;
											i_21 = i_23 >> 9;
											if (i_29 >= 0 && i_21 >= 0 && i_29 < maxX && i_21 < maxY) {
												class282_sub24_28.method12374(i_22, tileHeights[i_6][i_29][i_21] - class282_sub24_28.getY(), i_23);
												sceneObjectManager.method3430(class287_25);
											}
										}
									}
								}
						} else if (i_15 == 2) {
							if (atmosphere == null)
								atmosphere = new Atmosphere();
							atmosphere.method11471(buffer);
						} else if (i_15 == 128) {
							if (atmosphere == null)
								atmosphere = new Atmosphere();
							atmosphere.decodeSkybox(buffer, aClass239_7719);
						} else {
							if (i_15 != 129)
								throw new IllegalStateException("");
							if (aByteArrayArrayArray3788 == null)
								aByteArrayArrayArray3788 = new byte[4][][];
							for (i_16 = 0; i_16 < 4; i_16++) {
								byte b_17 = buffer.readByte();
								int i_26;
								if (b_17 == 0 && aByteArrayArrayArray3788[plane] != null) {
									if (i_16 <= i_6) {
										i_18 = x;
										i_26 = x + 7;
										i_29 = y;
										i_21 = y + 7;
										if (x < 0)
											i_18 = 0;
										else if (x >= maxX)
											i_18 = maxX;
										if (i_26 < 0)
											i_26 = 0;
										else if (i_26 >= maxX)
											i_26 = maxX;
										if (y < 0)
											i_29 = 0;
										else if (y >= maxY)
											i_29 = maxY;
										if (i_21 < 0)
											i_21 = 0;
										else if (i_21 >= maxY)
											i_21 = maxY;
										while (i_18 < i_26) {
											while (i_29 < i_21) {
												aByteArrayArrayArray3788[plane][i_18][i_29] = 0;
												++i_29;
											}
											++i_18;
										}
									}
								} else if (b_17 != 1) {
									if (b_17 == 2) {
									}
								} else {
									if (aByteArrayArrayArray3788[plane] == null)
										aByteArrayArrayArray3788[plane] = new byte[maxX + 1][maxY + 1];
									for (i_18 = 0; i_18 < 64; i_18 += 4)
										for (i_26 = 0; i_26 < 64; i_26 += 4) {
											byte b_20 = buffer.readByte();
											if (i_16 <= i_6)
												for (i_21 = i_18; i_21 < i_18 + 4; i_21++)
													for (i_22 = i_26; i_22 < i_26 + 4; i_22++)
														if (i_21 >= i_13 && i_21 < i_13 + 8 && i_22 >= i_14 && i_22 < i_14 + 8) {
															i_23 = x + Class112.method1871(i_21 & 0x7, i_22 & 0x7, i_9);
															int i_24 = y + Class2.method259(i_21 & 0x7, i_22 & 0x7, i_9);
															if (i_23 >= 0 && i_23 < maxX && i_24 >= 0 && i_24 < maxY) {
																aByteArrayArrayArray3788[plane][i_23][i_24] = b_20;
																bool_11 = true;
															}
														}
										}
								}
							}
						}
					}
				}
				//                if(atmosphere != null && skyboxId != -1)
				//                	atmosphere.setSkybox(aClass239_7719, skyboxId);
				if (atmosphere != null)
					aClass239_7719.method4056(x >> 3, y >> 3, atmosphere);
				if (!bool_11 && aByteArrayArrayArray3788 != null && aByteArrayArrayArray3788[plane] != null) {
					i_15 = x + 7;
					i_16 = y + 7;
					for (i_27 = x; i_27 < i_15; i_27++)
						for (i_18 = y; i_18 < i_16; i_18++)
							aByteArrayArrayArray3788[plane][i_27][i_18] = 0;
				}
				break;
			}
		}
	}

	WorldObject getWorldObject(int plane, int slot, int x, int y) {
		WorldObject sceneobject_6 = null;
		if (slot == 0)
			sceneobject_6 = (WorldObject) sceneObjectManager.getWall(plane, x, y);
		if (slot == 1)
			sceneobject_6 = (WorldObject) sceneObjectManager.getWallDecoration(plane, x, y);
		if (slot == 2)
			sceneobject_6 = (WorldObject) sceneObjectManager.getInteractableObject(plane, x, y, client.anInterface25_7446);
		if (slot == 3)
			sceneobject_6 = (WorldObject) sceneObjectManager.getGroundDecoration(plane, x, y);
		return sceneobject_6;
	}

	void method12459(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int objectId, int i_7, int i_8, ClipFlagMap clipMap, int i_10) {
		if (i_3 < anInt7723)
			anInt7723 = i_3;
		ObjectDefinition defs = objectDefLoader.getObjectDefs(objectId);
		if (Class393.preferences.textures.method12873() != 0 || !defs.hidden) {
			int i_13;
			int i_14;
			if (i_7 != 1 && i_7 != 3) {
				i_13 = defs.sizeX;
				i_14 = defs.sizeY;
			} else {
				i_13 = defs.sizeY;
				i_14 = defs.sizeX;
			}
			int i_15;
			int i_16;
			if (i_13 + i_4 <= maxX) {
				i_15 = (i_13 >> 1) + i_4;
				i_16 = (i_13 + 1 >> 1) + i_4;
			} else {
				i_15 = i_4;
				i_16 = i_4 + 1;
			}
			int i_17;
			int i_18;
			if (i_5 + i_14 <= maxY) {
				i_17 = i_5 + (i_14 >> 1);
				i_18 = i_5 + (i_14 + 1 >> 1);
			} else {
				i_17 = i_5;
				i_18 = i_5 + 1;
			}
			Ground class390_19 = sceneObjectManager.aGroundArray2591[i_2];
			int i_20 = class390_19.getHeight(i_15, i_17) + class390_19.getHeight(i_16, i_17) + class390_19.getHeight(i_15, i_18) + class390_19.getHeight(i_16, i_18) >> 2;
									int i_21 = (i_4 << 9) + (i_13 << 8);
									int i_22 = (i_5 << 9) + (i_14 << 8);
									boolean bool_23 = aBool3773 && !overlayHidden && defs.delayShading;
									if (defs.hasSound())
										Static.method6775(i_3, i_4, i_5, i_7, defs, null, null);
									boolean bool_24 = i_10 == -1 && !defs.method7967() && defs.transformTo == null && !defs.hasAnimation && !defs.aBool5699;
									if (!aBool7717 || (!Class308.isWall(i_8) || defs.occludes == 1) && (!QuestDefinitions.isRoof(i_8) || defs.occludes != 0)) {
										Object obj_25;
										if (i_8 == ObjectType.GROUND_DECORATION.id) {
											if (Class393.preferences.groundDecor.method12897() != 0 || defs.interactable != 0 || defs.clipType == 1 || defs.obstructsGround) {
												if (bool_24) {
													GraphNode_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1_26 = new GraphNode_Sub1_Sub3_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, defs, i_3, i_2, i_21, i_20, i_22, overlayHidden, i_7, bool_23);
													if (class521_sub1_sub3_sub1_26.method86())
														class521_sub1_sub3_sub1_26.method87(graphicalrenderer_1);
													obj_25 = class521_sub1_sub3_sub1_26;
												} else
													obj_25 = new GroundDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, defs, i_3, i_2, i_21, i_20, i_22, overlayHidden, i_7, i_10);
												sceneObjectManager.method3393(i_3, i_4, i_5, (SceneObjectNode) obj_25);
												if (defs.clipType == 1 && clipMap != null)
													clipMap.addBlockFloorDeco(i_4, i_5);
											}
										} else if (i_8 != ObjectType.SCENERY_INTERACT.id && i_8 != ObjectType.GROUND_INTERACT.id) {
											if (!QuestDefinitions.isRoof(i_8) && !HitsplatDefinitions.method3849(i_8)) {
												if (!method12464(graphicalrenderer_1, i_8, i_7, bool_24, defs, i_10, i_3, i_2, i_21, i_20, i_22, i_4, i_5, bool_23, class390_19, clipMap, i_13, i_14))
													method12465(graphicalrenderer_1, i_8, i_7, bool_24, defs, i_10, i_3, i_2, i_21, i_20, i_22, i_4, i_5);
											} else {
												if (bool_24) {
													GraphNode_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_33 = new GraphNode_Sub1_Sub1_Sub6(sceneObjectManager, graphicalrenderer_1, objectDefLoader, defs, i_3, i_2, i_21, i_20, i_22, overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, bool_23);
													if (class521_sub1_sub1_sub6_33.method86())
														class521_sub1_sub1_sub6_33.method87(graphicalrenderer_1);
													obj_25 = class521_sub1_sub1_sub6_33;
												} else
													obj_25 = new InteractableObject(sceneObjectManager, graphicalrenderer_1, objectDefLoader, defs, i_3, i_2, i_21, i_20, i_22, overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, i_10);
												sceneObjectManager.method3397((GraphNode_Sub1_Sub1) obj_25, false);
												if (aBool3773 && !overlayHidden && QuestDefinitions.isRoof(i_8) && i_8 != ObjectType.DIAGONAL_SLOPE_ROOF.id && i_3 > 0 && defs.occludes != 0)
													aByteArrayArrayArray3794[i_3][i_4][i_5] |= 0x4;
												if (defs.clipType != 0 && clipMap != null)
													clipMap.addObject(i_4, i_5, i_13, i_14, defs.blocks, !defs.ignoreAltClip);
											}
										} else {
											GraphNode_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_31 = null;
											int i_27;
											GraphNode_Sub1_Sub1 obj_32;
											if (bool_24) {
												GraphNode_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_28 = new GraphNode_Sub1_Sub1_Sub6(sceneObjectManager, graphicalrenderer_1, objectDefLoader, defs, i_3, i_2, i_21, i_20, i_22, overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, bool_23);
												i_27 = class521_sub1_sub1_sub6_28.method16115();
												obj_32 = class521_sub1_sub1_sub6_28;
												class521_sub1_sub1_sub6_31 = class521_sub1_sub1_sub6_28;
											} else {
												obj_32 = new InteractableObject(sceneObjectManager, graphicalrenderer_1, objectDefLoader, defs, i_3, i_2, i_21, i_20, i_22, overlayHidden, i_4, i_13 + i_4 - 1, i_5, i_5 + i_14 - 1, i_8, i_7, i_10);
												i_27 = 15;
											}
											if (sceneObjectManager.method3397(obj_32, false)) {
												if (class521_sub1_sub1_sub6_31 != null && class521_sub1_sub1_sub6_31.method86())
													class521_sub1_sub1_sub6_31.method87(graphicalrenderer_1);
												if (defs.castsShadow && aBool3773) {
													if (i_27 > 30)
														i_27 = 30;
													for (int i_30 = 0; i_30 <= i_13; i_30++)
														for (int i_29 = 0; i_29 <= i_14; i_29++)
															class390_19.LA(i_30 + i_4, i_5 + i_29, i_27);
												}
											}
											if (defs.clipType != 0 && clipMap != null)
												clipMap.addObject(i_4, i_5, i_13, i_14, defs.blocks, !defs.ignoreAltClip);
										}
									}
		}
	}

	public void method12461(AbstractRenderer graphicalrenderer_1, byte[] bytes_2, int i_3, int i_4, ClipFlagMap[] arr_5) {
		ByteBuf rsbytebuffer_7 = new ByteBuf(bytes_2);
		int i_8 = -1;
		while (true) {
			int i_9 = rsbytebuffer_7.readSum();
			if (i_9 == 0)
				return;
			i_8 += i_9;
			int i_10 = 0;
			while (true) {
				int i_11 = rsbytebuffer_7.readSmart();
				if (i_11 == 0)
					break;
				i_10 += i_11 - 1;
				int i_12 = i_10 & 0x3f;
				int i_13 = i_10 >> 6 & 0x3f;
														int i_14 = i_10 >> 12;
									int i_15 = rsbytebuffer_7.readUnsignedByte();
									int i_16 = i_15 >> 2;
									int i_17 = i_15 & 0x3;
									int i_18 = i_3 + i_13;
									int i_19 = i_12 + i_4;
									if (i_18 > 0 && i_19 > 0 && i_18 < maxX - 1 && i_19 < maxY - 1) {
										ClipFlagMap clipmap_20 = null;
										if (!overlayHidden) {
											int i_21 = i_14;
											if ((regionMap.tileMasks[1][i_18][i_19] & 0x2) == 2)
												i_21 = i_14 - 1;
											if (i_21 >= 0)
												clipmap_20 = arr_5[i_21];
										}
										method12459(graphicalrenderer_1, i_14, i_14, i_18, i_19, i_8, i_17, i_16, clipmap_20, -1);
									}
			}
		}
	}

	public void method12462(AbstractRenderer graphicalrenderer_1, byte[] bytes_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, ClipFlagMap[] arr_10) {
		ByteBuf rsbytebuffer_12 = new ByteBuf(bytes_2);
		int i_13 = -1;
		while (true) {
			int i_14 = rsbytebuffer_12.readSum();
			if (i_14 == 0)
				return;
			i_13 += i_14;
			int i_15 = 0;
			while (true) {
				int i_16 = rsbytebuffer_12.readSmart();
				if (i_16 == 0)
					break;
				i_15 += i_16 - 1;
				int i_17 = i_15 & 0x3f;
				int i_18 = i_15 >> 6 & 0x3f;
									int i_19 = i_15 >> 12;
											int i_20 = rsbytebuffer_12.readUnsignedByte();
											int i_21 = i_20 >> 2;
											int i_22 = i_20 & 0x3;
											if (i_19 == i_6 && i_18 >= i_7 && i_18 < i_7 + 8 && i_17 >= i_8 && i_17 < i_8 + 8) {
												ObjectDefinition objectdefinitions_23 = objectDefLoader.getObjectDefs(i_13);
												int i_24 = i_4 + KeyPressInputSubscriber.method3756(i_18 & 0x7, i_17 & 0x7, i_9, objectdefinitions_23.sizeX, objectdefinitions_23.sizeY, i_22);
												int i_25 = i_5 + PlayerVarProvider.method282(i_18 & 0x7, i_17 & 0x7, i_9, objectdefinitions_23.sizeX, objectdefinitions_23.sizeY, i_22);
												if (i_24 > 0 && i_25 > 0 && i_24 < maxX - 1 && i_25 < maxY - 1) {
													ClipFlagMap clipmap_26 = null;
													if (!overlayHidden) {
														int i_27 = i_3;
														if ((regionMap.tileMasks[1][i_24][i_25] & 0x2) == 2)
															i_27 = i_3 - 1;
														if (i_27 >= 0)
															clipmap_26 = arr_10[i_27];
													}
													method12459(graphicalrenderer_1, i_3, i_3, i_24, i_25, i_13, i_22 + i_9 & 0x3, i_21, clipmap_26, -1);
												}
											}
			}
		}
	}

	public void method12463(boolean bool_2) {
		sceneObjectManager.method3400();
		if (!bool_2) {
			int i_4;
			int i_5;
			if (anInt3845 > 1)
				for (i_4 = 0; i_4 < maxX; i_4++)
					for (i_5 = 0; i_5 < maxY; i_5++)
						if ((regionMap.tileMasks[1][i_4][i_5] & 0x2) == 2)
							sceneObjectManager.method3382(i_4, i_5);
			for (i_4 = 0; i_4 < anInt3845; i_4++)
				for (i_5 = 0; i_5 <= maxY; i_5++)
					for (int i_6 = 0; i_6 <= maxX; i_6++)
						if ((aByteArrayArrayArray3794[i_4][i_6][i_5] & 0x4) != 0) {
							int i_7 = i_6;
							int i_8 = i_6;
							int i_9 = i_5;
							int i_10;
							for (i_10 = i_5; i_9 > 0 && (aByteArrayArrayArray3794[i_4][i_6][i_9 - 1] & 0x4) != 0 && i_10 - i_9 < 10; --i_9) {
							}
							while (i_10 < maxY && (aByteArrayArrayArray3794[i_4][i_6][i_10 + 1] & 0x4) != 0 && i_10 - i_9 < 10)
								++i_10;
							int i_11;
							label112:
								while (i_7 > 0 && i_8 - i_7 < 10) {
									for (i_11 = i_9; i_11 <= i_10; i_11++)
										if ((aByteArrayArrayArray3794[i_4][i_7 - 1][i_11] & 0x4) == 0)
											break label112;
									--i_7;
								}
							label99:
								while (i_8 < maxX && i_8 - i_7 < 10) {
									for (i_11 = i_9; i_11 <= i_10; i_11++)
										if ((aByteArrayArrayArray3794[i_4][i_8 + 1][i_11] & 0x4) == 0)
											break label99;
									++i_8;
								}
							if ((i_8 - i_7 + 1) * (i_10 - i_9 + 1) >= 4) {
								i_11 = tileHeights[i_4][i_7][i_9];
								sceneObjectManager.aClass201_2600.method3266(i_4, i_7 << 9, (i_8 << 9) + 512, i_9 << 9, (i_10 << 9) + 512, i_11, i_11);
								for (int i_12 = i_7; i_12 <= i_8; i_12++)
									for (int i_13 = i_9; i_13 <= i_10; i_13++)
										aByteArrayArrayArray3794[i_4][i_12][i_13] &= -5;
							}
						}
			sceneObjectManager.aClass201_2600.method3264();
		}
		aByteArrayArrayArray3794 = null;
	}

	boolean method12464(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, boolean bool_4, ObjectDefinition objectdefinitions_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, boolean bool_14, Ground class390_15, ClipFlagMap clipmap_16, int i_17, int i_18) {
		int i_20;
		GraphNode_Sub1_Sub5 obj_28;
		if (i_2 == ObjectType.WALL_STRAIGHT.id) {
			i_20 = objectdefinitions_5.occludes;
			if (aBool7714 && objectdefinitions_5.occludes == -1)
				i_20 = 1;
			if (bool_4) {
				WallObjectGraphNode class521_sub1_sub5_sub1_29 = new WallObjectGraphNode(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3, bool_14);
				if (class521_sub1_sub5_sub1_29.method86())
					class521_sub1_sub5_sub1_29.method87(graphicalrenderer_1);
				obj_28 = class521_sub1_sub5_sub1_29;
			} else
				obj_28 = new Wall(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3, i_6);
			sceneObjectManager.method3395(i_7, i_12, i_13, obj_28, null);
			if (i_3 == 0) {
				if (aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12, i_13, 50);
					class390_15.LA(i_12, i_13 + 1, 50);
				}
				if (i_20 == 1 && !overlayHidden)
					sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
			} else if (i_3 == 1) {
				if (aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12, i_13 + 1, 50);
					class390_15.LA(i_12 + 1, i_13 + 1, 50);
				}
				if (i_20 == 1 && !overlayHidden)
					sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13 + 1, objectdefinitions_5.anInt5684, -objectdefinitions_5.anInt5658);
			} else if (i_3 == 2) {
				if (aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12 + 1, i_13, 50);
					class390_15.LA(i_12 + 1, i_13 + 1, 50);
				}
				if (i_20 == 1 && !overlayHidden)
					sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12 + 1, i_13, objectdefinitions_5.anInt5684, -objectdefinitions_5.anInt5658);
			} else if (i_3 == 3) {
				if (aBool3773 && objectdefinitions_5.castsShadow) {
					class390_15.LA(i_12, i_13, 50);
					class390_15.LA(i_12 + 1, i_13, 50);
				}
				if (i_20 == 1 && !overlayHidden)
					sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
			}
			if (objectdefinitions_5.clipType != 0 && clipmap_16 != null)
				clipmap_16.addWall(i_12, i_13, i_2, i_3, objectdefinitions_5.blocks, !objectdefinitions_5.ignoreAltClip);
			if (objectdefinitions_5.decorDisplacement != 64)
				sceneObjectManager.method3398(i_7, i_12, i_13, objectdefinitions_5.decorDisplacement);
			return true;
		}
		Object obj_25;
		WallObjectGraphNode class521_sub1_sub5_sub1_27;
		if (i_2 == ObjectType.WALL_DIAGONAL_CORNER.id) {
			if (bool_4) {
				class521_sub1_sub5_sub1_27 = new WallObjectGraphNode(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3, bool_14);
				if (class521_sub1_sub5_sub1_27.method86())
					class521_sub1_sub5_sub1_27.method87(graphicalrenderer_1);
				obj_25 = class521_sub1_sub5_sub1_27;
			} else
				obj_25 = new Wall(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3, i_6);
			sceneObjectManager.method3395(i_7, i_12, i_13, (GraphNode_Sub1_Sub5) obj_25, null);
			if (objectdefinitions_5.castsShadow && aBool3773)
				if (i_3 == 0)
					class390_15.LA(i_12, i_13 + 1, 50);
				else if (i_3 == 1)
					class390_15.LA(i_12 + 1, i_13 + 1, 50);
				else if (i_3 == 2)
					class390_15.LA(i_12 + 1, i_13, 50);
				else if (i_3 == 3)
					class390_15.LA(i_12, i_13, 50);
			if (objectdefinitions_5.clipType != 0 && clipmap_16 != null)
				clipmap_16.addWall(i_12, i_13, i_2, i_3, objectdefinitions_5.blocks, !objectdefinitions_5.ignoreAltClip);
			return true;
		} else if (i_2 == ObjectType.WALL_WHOLE_CORNER.id) {
			i_20 = i_3 + 1 & 0x3;
			GraphNode_Sub1_Sub5 obj_22;
			if (bool_4) {
				WallObjectGraphNode class521_sub1_sub5_sub1_23 = new WallObjectGraphNode(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3 + 4, bool_14);
				WallObjectGraphNode class521_sub1_sub5_sub1_24 = new WallObjectGraphNode(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_20, bool_14);
				if (class521_sub1_sub5_sub1_23.method86())
					class521_sub1_sub5_sub1_23.method87(graphicalrenderer_1);
				if (class521_sub1_sub5_sub1_24.method86())
					class521_sub1_sub5_sub1_24.method87(graphicalrenderer_1);
				obj_28 = class521_sub1_sub5_sub1_23;
				obj_22 = class521_sub1_sub5_sub1_24;
			} else {
				obj_28 = new Wall(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3 + 4, i_6);
				obj_22 = new Wall(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_20, i_6);
			}
			sceneObjectManager.method3395(i_7, i_12, i_13, obj_28, obj_22);
			if ((objectdefinitions_5.occludes == 1 || aBool7714 && objectdefinitions_5.occludes == -1) && !overlayHidden)
				if (i_3 == 0) {
					sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13 + 1, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
				} else if (i_3 == 1) {
					sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12 + 1, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13 + 1, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
				} else if (i_3 == 2) {
					sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12 + 1, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
				} else if (i_3 == 3) {
					sceneObjectManager.aClass201_2600.method3262(1, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
					sceneObjectManager.aClass201_2600.method3262(2, i_7, i_12, i_13, objectdefinitions_5.anInt5684, objectdefinitions_5.anInt5658);
				}
			if (objectdefinitions_5.clipType != 0 && clipmap_16 != null)
				clipmap_16.addWall(i_12, i_13, i_2, i_3, objectdefinitions_5.blocks, !objectdefinitions_5.ignoreAltClip);
			if (objectdefinitions_5.decorDisplacement != 64)
				sceneObjectManager.method3398(i_7, i_12, i_13, objectdefinitions_5.decorDisplacement);
			return true;
		} else if (i_2 == ObjectType.WALL_STRAIGHT_CORNER.id) {
			if (bool_4) {
				class521_sub1_sub5_sub1_27 = new WallObjectGraphNode(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3, bool_14);
				if (class521_sub1_sub5_sub1_27.method86())
					class521_sub1_sub5_sub1_27.method87(graphicalrenderer_1);
				obj_25 = class521_sub1_sub5_sub1_27;
			} else
				obj_25 = new Wall(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_2, i_3, i_6);
			sceneObjectManager.method3395(i_7, i_12, i_13, (GraphNode_Sub1_Sub5) obj_25, null);
			if (objectdefinitions_5.castsShadow && aBool3773)
				if (i_3 == 0)
					class390_15.LA(i_12, i_13 + 1, 50);
				else if (i_3 == 1)
					class390_15.LA(i_12 + 1, i_13 + 1, 50);
				else if (i_3 == 2)
					class390_15.LA(i_12 + 1, i_13, 50);
				else if (i_3 == 3)
					class390_15.LA(i_12, i_13, 50);
			if (objectdefinitions_5.clipType != 0 && clipmap_16 != null)
				clipmap_16.addWall(i_12, i_13, i_2, i_3, objectdefinitions_5.blocks, !objectdefinitions_5.ignoreAltClip);
			return true;
		} else if (i_2 == ObjectType.WALL_INTERACT.id) {
			if (bool_4) {
				GraphNode_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_21 = new GraphNode_Sub1_Sub1_Sub6(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_12, i_12, i_13, i_13, i_2, i_3, bool_14);
				if (class521_sub1_sub1_sub6_21.method86())
					class521_sub1_sub1_sub6_21.method87(graphicalrenderer_1);
				obj_25 = class521_sub1_sub1_sub6_21;
			} else
				obj_25 = new InteractableObject(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_12, i_17 + i_12 - 1, i_13, i_18 + i_13 - 1, i_2, i_3, i_6);
			sceneObjectManager.method3397((GraphNode_Sub1_Sub1) obj_25, false);
			if (objectdefinitions_5.occludes == 1 && !overlayHidden) {
				byte b_26;
				if ((i_3 & 0x1) == 0)
					b_26 = 8;
				else
					b_26 = 16;
				sceneObjectManager.aClass201_2600.method3262(b_26, i_7, i_12, i_13, objectdefinitions_5.anInt5684, 0);
			}
			if (objectdefinitions_5.clipType != 0 && clipmap_16 != null)
				clipmap_16.addObject(i_12, i_13, i_17, i_18, objectdefinitions_5.blocks, !objectdefinitions_5.ignoreAltClip);
			if (objectdefinitions_5.decorDisplacement != 64)
				sceneObjectManager.method3398(i_7, i_12, i_13, objectdefinitions_5.decorDisplacement);
			return true;
		} else
			return false;
	}

	boolean method12465(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, boolean bool_4, ObjectDefinition objectdefinitions_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13) {
		if (i_2 == ObjectType.STRAIGHT_INSIDE_WALL_DEC.id) {
			GraphNode_Sub1_Sub4 obj_15;
			if (bool_4) {
				GraphNode_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_26 = new GraphNode_Sub1_Sub4_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, 0, 0, i_2, i_3);
				if (class521_sub1_sub4_sub1_26.method86())
					class521_sub1_sub4_sub1_26.method87(graphicalrenderer_1);
				obj_15 = class521_sub1_sub4_sub1_26;
			} else
				obj_15 = new WallDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, 0, 0, i_2, i_3, i_6);
			sceneObjectManager.method3396(i_7, i_12, i_13, obj_15, null);
			return true;
		}
		int i_22;
		WorldObject sceneobject_24;
		GraphNode_Sub1_Sub4 obj_27;
		GraphNode_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_28;
		if (i_2 == ObjectType.STRAIGHT_OUSIDE_WALL_DEC.id) {
			i_22 = 65;
			sceneobject_24 = (WorldObject) sceneObjectManager.getWall(i_7, i_12, i_13);
			if (sceneobject_24 != null)
				i_22 = objectDefLoader.getObjectDefs(sceneobject_24.getId()).decorDisplacement + 1;
			if (bool_4) {
				class521_sub1_sub4_sub1_28 = new GraphNode_Sub1_Sub4_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_22 * anIntArray7724[i_3], i_22 * anIntArray7720[i_3], i_2, i_3);
				if (class521_sub1_sub4_sub1_28.method86())
					class521_sub1_sub4_sub1_28.method87(graphicalrenderer_1);
				obj_27 = class521_sub1_sub4_sub1_28;
			} else
				obj_27 = new WallDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_22 * anIntArray7724[i_3], i_22 * anIntArray7720[i_3], i_2, i_3, i_6);
			sceneObjectManager.method3396(i_7, i_12, i_13, obj_27, null);
			return true;
		} else if (i_2 == ObjectType.DIAGONAL_OUTSIDE_WALL_DEC.id) {
			i_22 = 33;
			sceneobject_24 = (WorldObject) sceneObjectManager.getWall(i_7, i_12, i_13);
			if (sceneobject_24 != null)
				i_22 = objectDefLoader.getObjectDefs(sceneobject_24.getId()).decorDisplacement / 2 + 1;
			if (bool_4) {
				class521_sub1_sub4_sub1_28 = new GraphNode_Sub1_Sub4_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_22 * anIntArray7724[i_3], i_22 * anIntArray7720[i_3], i_2, i_3 + 4);
				if (class521_sub1_sub4_sub1_28.method86())
					class521_sub1_sub4_sub1_28.method87(graphicalrenderer_1);
				obj_27 = class521_sub1_sub4_sub1_28;
			} else
				obj_27 = new WallDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_22 * anIntArray7721[i_3], i_22 * anIntArray7713[i_3], i_2, i_3 + 4, i_6);
			sceneObjectManager.method3396(i_7, i_12, i_13, obj_27, null);
			return true;
		} else if (i_2 == ObjectType.DIAGONAL_INSIDE_WALL_DEC.id) {
			i_22 = i_3 + 2 & 0x3;
			GraphNode_Sub1_Sub4 obj_16;
			if (bool_4) {
				GraphNode_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_25 = new GraphNode_Sub1_Sub4_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, 0, 0, i_2, i_22 + 4);
				if (class521_sub1_sub4_sub1_25.method86())
					class521_sub1_sub4_sub1_25.method87(graphicalrenderer_1);
				obj_16 = class521_sub1_sub4_sub1_25;
			} else
				obj_16 = new WallDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, 0, 0, i_2, i_22 + 4, i_6);
			sceneObjectManager.method3396(i_7, i_12, i_13, obj_16, null);
			return true;
		} else if (i_2 == ObjectType.DIAGONAL_INWALL_DEC.id) {
			i_22 = i_3 + 2 & 0x3;
			int i_23 = 33;
			WorldObject sceneobject_17 = (WorldObject) sceneObjectManager.getWall(i_7, i_12, i_13);
			if (sceneobject_17 != null)
				i_23 = objectDefLoader.getObjectDefs(sceneobject_17.getId()).decorDisplacement / 2 + 1;
			GraphNode_Sub1_Sub4 obj_18;
			GraphNode_Sub1_Sub4 obj_19;
			if (bool_4) {
				GraphNode_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_20 = new GraphNode_Sub1_Sub4_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_23 * anIntArray7721[i_3], i_23 * anIntArray7713[i_3], i_2, i_3 + 4);
				GraphNode_Sub1_Sub4_Sub1 class521_sub1_sub4_sub1_21 = new GraphNode_Sub1_Sub4_Sub1(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, 0, 0, i_2, i_22 + 4);
				if (class521_sub1_sub4_sub1_20.method86())
					class521_sub1_sub4_sub1_20.method87(graphicalrenderer_1);
				if (class521_sub1_sub4_sub1_21.method86())
					class521_sub1_sub4_sub1_21.method87(graphicalrenderer_1);
				obj_18 = class521_sub1_sub4_sub1_20;
				obj_19 = class521_sub1_sub4_sub1_21;
			} else {
				WallDecoration walldecoration_29 = new WallDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, i_23 * anIntArray7721[i_3], i_23 * anIntArray7713[i_3], i_2, i_3 + 4, i_6);
				WallDecoration walldecoration_30 = new WallDecoration(sceneObjectManager, graphicalrenderer_1, objectDefLoader, objectdefinitions_5, i_7, i_8, i_9, i_10, i_11, overlayHidden, 0, 0, i_2, i_22 + 4, i_6);
				obj_18 = walldecoration_29;
				obj_19 = walldecoration_30;
			}
			sceneObjectManager.method3396(i_7, i_12, i_13, obj_18, obj_19);
			return true;
		} else
			return false;
	}

	public void method12471(AbstractRenderer graphicalrenderer_1, ByteBuf rsbytebuffer_2, int i_3, int i_4) {
		if (!overlayHidden) {
			boolean bool_6 = false;
			Atmosphere class535_7 = null;
			while (true) {
				int i_8;
				int i_9;
				int i_11;
				int i_12;
				int i_19;
				while (rsbytebuffer_2.index < rsbytebuffer_2.buffer.length) {
					i_8 = rsbytebuffer_2.readUnsignedByte();
					if (i_8 == 0) {
						if (class535_7 == null)
							class535_7 = new Atmosphere(rsbytebuffer_2, aClass239_7719);
						else
							class535_7.method11468(rsbytebuffer_2, aClass239_7719);
					} else {
						int i_13;
						int i_14;
						int i_15;
						if (i_8 == 1) {
							i_9 = rsbytebuffer_2.readUnsignedByte();
							if (i_9 > 0)
								for (i_19 = 0; i_19 < i_9; i_19++) {
									Class287 class287_17 = new Class287(graphicalrenderer_1, sceneObjectManager.anInt2592, rsbytebuffer_2);
									if (class287_17.anInt3430 == 31) {
										LightIntensityDefinitions class416_18 = IndexLoaders.LIGHT_INTENSITY_LOADER.method7304(rsbytebuffer_2.readUnsignedShort());
										class287_17.method5061(class416_18.anInt4986, class416_18.anInt4989, class416_18.anInt4988, class416_18.anInt4987);
									}
									if (graphicalrenderer_1.method8463() > 0) {
										GLLight class282_sub24_21 = class287_17.aNode_Sub24_3425;
										i_13 = class282_sub24_21.getX() + (i_3 << 9);
										i_14 = class282_sub24_21.getZ() + (i_4 << 9);
										i_15 = i_13 >> 9;
										int i_16 = i_14 >> 9;
										if (i_15 >= 0 && i_16 >= 0 && i_15 < maxX && i_16 < maxY) {
											class282_sub24_21.method12374(i_13, tileHeights[class287_17.anInt3419][i_15][i_16] - class282_sub24_21.getY(), i_14);
											sceneObjectManager.method3430(class287_17);
										}
									}
								}
						} else if (i_8 == 2) {
							if (class535_7 == null)
								class535_7 = new Atmosphere();
							class535_7.method11471(rsbytebuffer_2);
						} else if (i_8 == 128) {
							if (class535_7 == null)
								class535_7 = new Atmosphere();
							class535_7.decodeSkybox(rsbytebuffer_2, aClass239_7719);
						} else {
							if (i_8 != 129)
								throw new IllegalStateException("");
							if (aByteArrayArrayArray3788 == null)
								aByteArrayArrayArray3788 = new byte[4][][];
							for (i_9 = 0; i_9 < 4; i_9++) {
								byte b_10 = rsbytebuffer_2.readByte();
								if (b_10 == 0 && aByteArrayArrayArray3788[i_9] != null) {
									i_11 = i_3;
									i_12 = i_3 + 64;
									i_13 = i_4;
									i_14 = i_4 + 64;
									if (i_3 < 0)
										i_11 = 0;
									else if (i_3 >= maxX)
										i_11 = maxX;
									if (i_12 < 0)
										i_12 = 0;
									else if (i_12 >= maxX)
										i_12 = maxX;
									if (i_4 < 0)
										i_13 = 0;
									else if (i_4 >= maxY)
										i_13 = maxY;
									if (i_14 < 0)
										i_14 = 0;
									else if (i_14 >= maxY)
										i_14 = maxY;
									while (i_11 < i_12) {
										while (i_13 < i_14) {
											aByteArrayArrayArray3788[i_9][i_11][i_13] = 0;
											++i_13;
										}
										++i_11;
									}
								} else if (b_10 == 1) {
									if (aByteArrayArrayArray3788[i_9] == null)
										aByteArrayArrayArray3788[i_9] = new byte[maxX + 1][maxY + 1];
									for (i_11 = 0; i_11 < 64; i_11 += 4)
										for (i_12 = 0; i_12 < 64; i_12 += 4) {
											byte b_20 = rsbytebuffer_2.readByte();
											for (i_14 = i_3 + i_11; i_14 < i_3 + i_11 + 4; i_14++)
												for (i_15 = i_12 + i_4; i_15 < i_12 + i_4 + 4; i_15++)
													if (i_14 >= 0 && i_14 < maxX && i_15 >= 0 && i_15 < maxY)
														aByteArrayArrayArray3788[i_9][i_14][i_15] = b_20;
										}
								} else if (b_10 == 2) {
									if (aByteArrayArrayArray3788[i_9] == null)
										aByteArrayArrayArray3788[i_9] = new byte[maxX + 1][maxY + 1];
									if (i_9 > 0) {
										i_11 = i_3;
										i_12 = i_3 + 64;
										i_13 = i_4;
										i_14 = i_4 + 64;
										if (i_3 < 0)
											i_11 = 0;
										else if (i_3 >= maxX)
											i_11 = maxX;
										if (i_12 < 0)
											i_12 = 0;
										else if (i_12 >= maxX)
											i_12 = maxX;
										if (i_4 < 0)
											i_13 = 0;
										else if (i_4 >= maxY)
											i_13 = maxY;
										if (i_14 < 0)
											i_14 = 0;
										else if (i_14 >= maxY)
											i_14 = maxY;
										while (i_11 < i_12) {
											while (i_13 < i_14) {
												aByteArrayArrayArray3788[i_9][i_11][i_13] = aByteArrayArrayArray3788[i_9 - 1][i_11][i_13];
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
				if (class535_7 != null)
					for (i_8 = 0; i_8 < 8; i_8++)
						for (i_9 = 0; i_9 < 8; i_9++) {
							i_19 = (i_3 >> 3) + i_8;
							i_11 = i_9 + (i_4 >> 3);
							if (i_19 >= 0 && i_19 < maxX >> 3 && i_11 >= 0 && i_11 < maxY >> 3)
								aClass239_7719.method4056(i_19, i_11, class535_7);
						}
				if (!bool_6 && aByteArrayArrayArray3788 != null)
					for (i_8 = 0; i_8 < 4; i_8++)
						if (aByteArrayArrayArray3788[i_8] != null)
							for (i_9 = 0; i_9 < 16; i_9++)
								for (i_19 = 0; i_19 < 16; i_19++) {
									i_11 = i_9 + (i_3 >> 2);
									i_12 = i_19 + (i_4 >> 2);
									if (i_11 >= 0 && i_11 < 26 && i_12 >= 0 && i_12 < 26)
										aByteArrayArrayArray3788[i_8][i_11][i_12] = 0;
								}
				break;
			}
		}
	}

	void method12475(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int x, int y, ClipFlagMap clipmap_6) {
		WorldObject object = getWorldObject(i_2, i_3, x, y);
		if (object != null) {
			ObjectDefinition objectdefinitions_9 = objectDefLoader.getObjectDefs(object.getId());
			int type = object.method89();
			int i_11 = object.method92();
			if (objectdefinitions_9.hasSound())
				Class256.method4415(i_2, x, y, objectdefinitions_9);
			if (object.method86())
				object.method88(graphicalrenderer_1);
			if (i_3 == 0) {
				sceneObjectManager.method3422(i_2, x, y);
				sceneObjectManager.method3460(i_2, x, y);
				if (objectdefinitions_9.clipType != 0)
					clipmap_6.removeWall(x, y, type, i_11, objectdefinitions_9.blocks, !objectdefinitions_9.ignoreAltClip);
				if (objectdefinitions_9.occludes == 1)
					if (i_11 == 0)
						sceneObjectManager.aClass201_2600.method3297(1, i_2, x, y);
					else if (i_11 == 1)
						sceneObjectManager.aClass201_2600.method3297(2, i_2, x, y + 1);
					else if (i_11 == 2)
						sceneObjectManager.aClass201_2600.method3297(1, i_2, x + 1, y);
					else if (i_11 == 3)
						sceneObjectManager.aClass201_2600.method3297(2, i_2, x, y);
			} else if (i_3 == 1) {
				sceneObjectManager.method3402(i_2, x, y);
				sceneObjectManager.method3439(i_2, x, y);
			} else if (i_3 == 2) {
				sceneObjectManager.method3530(i_2, x, y, client.anInterface25_7446);
				if (objectdefinitions_9.clipType != 0 && x + objectdefinitions_9.sizeX < maxX && y + objectdefinitions_9.sizeX < maxY && x + objectdefinitions_9.sizeY < maxX && y + objectdefinitions_9.sizeY < maxY)
					clipmap_6.removeObject(x, y, objectdefinitions_9.sizeX, objectdefinitions_9.sizeY, i_11, objectdefinitions_9.blocks, !objectdefinitions_9.ignoreAltClip);
				if (type == ObjectType.WALL_INTERACT.id)
					if ((i_11 & 0x1) == 0)
						sceneObjectManager.aClass201_2600.method3297(8, i_2, x, y);
					else
						sceneObjectManager.aClass201_2600.method3297(16, i_2, x, y);
			} else if (i_3 == 3) {
				sceneObjectManager.method3404(i_2, x, y);
				if (objectdefinitions_9.clipType == 1)
					clipmap_6.removeBlockFloorDeco(x, y);
			}
		}
	}
}
