package com.jagex;

public class GroundDecoration extends SceneObjectNode implements WorldObject {

    public Class123 aClass123_10507;
    boolean aBool10508 = true;
    Class200 aClass200_10505;
    boolean aBool10506;

    public GroundDecoration(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12) {
        super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, objectdefinitions_4.anInt5704);
        aClass123_10507 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, ObjectType.GROUND_DECORATION.id, i_11, i_5, i_6, this, bool_10, i_12);
        aBool10506 = objectdefinitions_4.interactable != 0 && !bool_10;
        method13008(1);
    }

    public static void method16094(IComponentDefinitions[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, boolean bool_9) {
        Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
        for (int i_11 = 0; i_11 < arr_0.length; i_11++) {
            IComponentDefinitions inter = arr_0[i_11];
            if (inter != null && (inter.parent == i_1 || i_1 == -1412584499 && inter == client.aClass118_7257)) {
                int i_13;
                if (i_8 == -1) {
                    client.aRectangleArray7411[client.anInt7407].setBounds(inter.x + i_6, i_7 + inter.y, inter.width, inter.height);
                    i_13 = ++client.anInt7407 - 1;
                } else {
                    i_13 = i_8;
                }
                inter.anInt1449 = i_13;
                inter.anInt1450 = client.CYCLES_20MS;
                if (!client.method11651(inter)) {
                    if (inter.contentType != 0) {
                        Class28.method776(inter);
                    }
                    int drawX = inter.x + i_6;
                    int drawY = i_7 + inter.y;
                    int i_16 = inter.transparency;
                    if (client.aBool7168 && (client.getIComponentSettings(inter).settingsHash != 0 || inter.type == ComponentType.CONTAINER) && i_16 > 127) {
                        i_16 = 127;
                    }
                    int i_17;
                    int i_18;
                    if (inter == client.aClass118_7257) {
                        if (i_1 != -1412584499 && (inter.anInt1382 == IComponentDefinitions.anInt1265 || inter.anInt1382 == IComponentDefinitions.anInt1283 || client.getIComponentSettings(inter).bit23Enabled())) {
                            Comparable_Sub1.aClass118Array3772 = arr_0;
                            GameTipsLoader.anInt4822 = i_6;
                            Isaac.anInt5157 = i_7;
                            continue;
                        }
                        if (client.aBool7364 && client.aBool7403) {
                            i_17 = Class163.mouseRecorder.getMouseX();
                            i_18 = Class163.mouseRecorder.getMouseY();
                            i_17 -= client.anInt7361;
                            i_18 -= client.anInt7362;
                            if (i_17 < client.anInt7432) {
                                i_17 = client.anInt7432;
                            }
                            if (i_17 + inter.width > client.anInt7432 + client.anInt7367) {
                                i_17 = client.anInt7432 + client.anInt7367 - inter.width;
                            }
                            if (i_18 < client.anInt7265) {
                                i_18 = client.anInt7265;
                            }
                            if (i_18 + inter.height > client.anInt7265 + client.anInt7476) {
                                i_18 = client.anInt7476 + client.anInt7265 - inter.height;
                            }
                            if (client.getIComponentSettings(inter).bit23Enabled()) {
                                Class292.method5201(i_17, i_18, inter.width, inter.height);
                            }
                            drawX = i_17;
                            drawY = i_18;
                        }
                        if (inter.anInt1382 == IComponentDefinitions.anInt1283) {
                            i_16 = 128;
                        }
                    }
                    int i_19;
                    int i_20;
                    int i_21;
                    int i_22;
                    if (inter.type == ComponentType.TYPE_2) {
                        i_17 = i_2;
                        i_18 = i_3;
                        i_19 = i_4;
                        i_20 = i_5;
                    } else {
                        i_21 = drawX + inter.width;
                        i_22 = drawY + inter.height;
                        if (inter.type == ComponentType.LINE) {
                            ++i_21;
                            ++i_22;
                        }
                        i_17 = Math.max(drawX, i_2);
                        i_18 = Math.max(drawY, i_3);
                        i_19 = Math.min(i_21, i_4);
                        i_20 = Math.min(i_22, i_5);
                    }
                    if (i_17 < i_19 && i_18 < i_20) {
                        if (inter.contentType != 0) {
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1337 || inter.contentType == IComponentDefinitions.CONTENT_TYPE_1403) {
                                HitbarDefinitions.method3231(drawX, drawY, inter.width, inter.height, inter.contentType == IComponentDefinitions.CONTENT_TYPE_1403);
                                TCPPacket.method12366(i_13, i_17, i_18, i_19, i_20, drawX, drawY);
                                Renderers.CURRENT_RENDERER.method8421();
                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                client.aBoolArray7443[i_13] = true;
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1338 && client.anInt7341 == 1) {
                                if (inter.method2046(Renderers.CURRENT_RENDERER) != null) {
                                    MaterialPropTexture.method15391();
                                    Item.method12574(Renderers.CURRENT_RENDERER, inter, drawX, drawY);
                                    Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                }
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1408) {
                                Shadow.method15506(Renderers.CURRENT_RENDERER, drawX, drawY, inter);
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1409) {
                                Class366.method6301(Renderers.CURRENT_RENDERER, drawX, drawY, inter, inter.color % 64);
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1339) {
                                if (inter.method2046(Renderers.CURRENT_RENDERER) != null) {
                                    VorbisFileReference.method13448(inter, drawX, drawY);
                                    Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                }
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1400) {
                                Node_Sub46.method13407(Renderers.CURRENT_RENDERER, IndexLoaders.IMAGE_LOADER, drawX, drawY, inter.width, inter.height);
                                client.aBoolArray7443[i_13] = true;
                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.MINIMAP) {
                                LoadingStage.renderMiniMiniMap(Renderers.CURRENT_RENDERER, drawX, drawY, inter.width, inter.height);
                                client.aBoolArray7443[i_13] = true;
                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                continue;
                            }
                            if (inter.contentType == IComponentDefinitions.DEBUG_INFORMATION) {
                                if (client.DRAW_DEBUG || client.aBool7177) {
                                    NPCDirection.drawDebugInformation(drawX, drawY, inter);
                                    client.aBoolArray7443[i_13] = true;
                                }
                                continue;
                            }
                        }
                        int i_23;
                        int i_24;
                        int i_25;
                        if (inter.type == ComponentType.CONTAINER) {
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1407 && Renderers.CURRENT_RENDERER.method8471()) {
                                Renderers.CURRENT_RENDERER.method8525(Class349.anInt4083, client.anInt3243 * -969250379);
                            }
                            method16094(arr_0, inter.idHash, i_17, i_18, i_19, i_20, drawX - inter.scrollX, drawY - inter.scrollY, i_13, bool_9);
                            if (inter.itemSlots != null) {
                                method16094(inter.itemSlots, inter.idHash, i_17, i_18, i_19, i_20, drawX - inter.scrollX, drawY - inter.scrollY, i_13, bool_9);
                            }
                            SubInterface class282_sub44_33 = (SubInterface) client.OPEN_INTERFACES.get(inter.idHash);
                            if (class282_sub44_33 != null) {
                                RenderAnimIndexLoader.method3629(class282_sub44_33.interfaceId, i_17, i_18, i_19, i_20, drawX, drawY, i_13);
                            }
                            if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1407) {
                                if (Renderers.CURRENT_RENDERER.method8471()) {
                                    Renderers.CURRENT_RENDERER.method8474();
                                }
                                if (client.anInt7341 == 4) {
                                    i_22 = client.anInt7238;
                                    i_23 = client.anInt7377;
                                    i_24 = client.anInt7413;
                                    i_25 = client.anInt7217;
                                    if (client.CYCLES_20MS < client.anInt7237) {
                                        float f_26 = (client.CYCLES_20MS - client.anInt7236) * 1.0F / (client.anInt7237 - client.anInt7236);
                                        i_22 = (int) (client.anInt7238 * f_26 + (1.0F - f_26) * SceneryShadowPreference.anInt7868);
                                        i_23 = (int) (client.anInt7377 * f_26 + Class350_Sub2.anInt7815 * (1.0F - f_26));
                                        i_24 = (int) (f_26 * client.anInt7413 + Class329_Sub1.anInt7726 * (1.0F - f_26));
                                        i_25 = (int) (f_26 * client.anInt7217 + Node_Sub17_Sub4.anInt9940 * (1.0F - f_26));
                                    }
                                    if (i_22 > 0) {
                                        Renderers.CURRENT_RENDERER.method8425(i_17, i_18, i_19 - i_17, i_20 - i_18, i_22 << 24 | i_23 << 16 | i_24 << 8 | i_25);
                                    }
                                }
                            }
                            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                        }
                        if (client.aBoolArray7410[i_13] || client.anInt7412 > 1) {
                            if (inter.type == ComponentType.FIGURE) {
                                if (i_16 == 0) {
                                    if (inter.filled) {
                                        Renderers.CURRENT_RENDERER.B(drawX, drawY, inter.width, inter.height, inter.color, 0);
                                    } else {
                                        Renderers.CURRENT_RENDERER.method8430(drawX, drawY, inter.width, inter.height, inter.color, 0);
                                    }
                                } else if (inter.filled) {
                                    Renderers.CURRENT_RENDERER.B(drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | inter.color & 0xffffff, 1);
                                } else {
                                    Renderers.CURRENT_RENDERER.method8430(drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | inter.color & 0xffffff, 1);
                                }
                            } else {
                                ItemDefinitions itemdefinitions_36;
                                if (inter.type == ComponentType.TEXT) {
                                    FontRenderer fontrenderer_43 = inter.method1988(Class487.aClass378_5752, client.anInterface35_7206);
                                    if (fontrenderer_43 == null) {
                                        if (IComponentDefinitions.aBool1399) {
                                            Class109.redrawComponent(inter);
                                        }
                                    } else {
                                        i_22 = inter.color;
                                        String string_35 = inter.text;
                                        if (inter.containerItemId != -1) {
                                            itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(inter.containerItemId);
                                            string_35 = itemdefinitions_36.name;
                                            if (string_35 == null) {
                                                string_35 = "null";
                                            }
                                            if ((itemdefinitions_36.stackable == 1 || inter.anInt1427 != 1) && inter.anInt1427 != -1) {
                                                string_35 = Utils.rgbToColHexShortcut(16748608) + string_35 + "</col>" + " x" + Class488.method8210(inter.anInt1427);
                                            }
                                        }
                                        if (inter.anInt1435 != -1) {
                                            string_35 = Class148.method2550(inter.anInt1435);
                                            if (string_35 == null) {
                                                string_35 = "";
                                            }
                                        }
                                        if (inter == client.aClass118_7352) {
                                            string_35 = LocalizedText.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE);
                                            i_22 = inter.color;
                                        }
                                        if (client.aBool7358) {
                                            Renderers.CURRENT_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
                                        }
                                        if (inter.textAntiMacro) {
                                            fontrenderer_43.method367(string_35, drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | i_22, inter.shadow ? 255 - (i_16 & 0xff) << 24 : -1, inter.textHorizontalAli, inter.textVerticalAli, client.aRandom7260, Class455_Sub3.anInt9079, client.anIntArray7438, Class182.aNativeSpriteArray2261, null);
                                        } else {
                                            fontrenderer_43.method373(string_35, drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | i_22, inter.shadow ? 255 - (i_16 & 0xff) << 24 : -1, inter.textHorizontalAli, inter.textVerticalAli, inter.anInt1358, inter.maxTextLines, Class182.aNativeSpriteArray2261, null, null, 0, 0);
                                        }
                                        if (client.aBool7358) {
                                            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                        }
                                    }
                                } else {
                                    int i_27;
                                    int i_39;
                                    if (inter.type == ComponentType.SPRITE) {
                                        if (inter.anInt1404 >= 0) {
                                            inter.method2027(IndexLoaders.SKYBOX_LOADER, IndexLoaders.SUN_LOADER).method4214(Renderers.CURRENT_RENDERER, drawX, drawY, inter.width, inter.height, inter.anInt1430 << 3, inter.anInt1431 << 3);
                                        } else {
                                            NativeSprite nativesprite_41;
                                            if (inter.containerItemId != -1) {
                                                PlayerModel playerappearance_34 = inter.wearCol ? VertexNormal.MY_PLAYER.model : null;
                                                nativesprite_41 = IndexLoaders.ITEM_LOADER.softwareRender(Renderers.CURRENT_RENDERER, inter.containerItemId, inter.anInt1427, inter.borderThickness, -16777216 | inter.spriteShadow, inter.renderStack, playerappearance_34);
                                            } else if (inter.anInt1435 != -1) {
                                                nativesprite_41 = SpotAnimIndexLoader.method8858(Renderers.CURRENT_RENDERER, inter.anInt1435);
                                            } else {
                                                nativesprite_41 = inter.method2048(Renderers.CURRENT_RENDERER);
                                            }
                                            if (nativesprite_41 != null) {
                                                i_22 = nativesprite_41.scaleWidth();
                                                i_23 = nativesprite_41.method2748();
                                                i_24 = 255 - (i_16 & 0xff) << 24 | (inter.color != 0 ? inter.color & 0xffffff : 16777215);
                                                if (!inter.tiling) {
                                                    if (inter.color == 0 && i_16 == 0) {
                                                        if (inter.angle2d != 0) {
                                                            nativesprite_41.method2758(inter.width / 2.0F + drawX, drawY + inter.height / 2.0F, inter.width * 4096 / i_22, inter.angle2d);
                                                        } else if (i_22 == inter.width && i_23 == inter.height) {
                                                            nativesprite_41.method2752(drawX, drawY);
                                                        } else {
                                                            nativesprite_41.method2789(drawX, drawY, inter.width, inter.height);
                                                        }
                                                    } else if (inter.angle2d != 0) {
                                                        nativesprite_41.method2790(inter.width / 2.0F + drawX, inter.height / 2.0F + drawY, inter.width * 4096 / i_22, inter.angle2d, i_24);
                                                    } else if (i_22 == inter.width && i_23 == inter.height) {
                                                        nativesprite_41.method2742(drawX, drawY, 0, i_24, 1);
                                                    } else {
                                                        nativesprite_41.method2754(drawX, drawY, inter.width, inter.height, 0, i_24, 1);
                                                    }
                                                } else {
                                                    Renderers.CURRENT_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
                                                    if (inter.angle2d != 0) {
                                                        i_25 = (i_22 - 1 + inter.width) / i_22;
                                                        i_39 = (i_23 - 1 + inter.height) / i_23;
                                                        for (i_27 = 0; i_27 < i_25; i_27++) {
                                                            for (int i_28 = 0; i_28 < i_39; i_28++) {
                                                                if (inter.color != 0) {
                                                                    nativesprite_41.method2790((drawX + i_27 * i_22) + i_22 / 2.0F, i_23 / 2.0F + (drawY + i_23 * i_28), 4096, inter.angle2d, i_24);
                                                                } else {
                                                                    nativesprite_41.method2758((drawX + i_22 * i_27) + i_22 / 2.0F, (drawY + i_23 * i_28) + i_23 / 2.0F, 4096, inter.angle2d);
                                                                }
                                                            }
                                                        }
                                                    } else if (inter.color == 0 && i_16 == 0) {
                                                        nativesprite_41.method2756(drawX, drawY, inter.width, inter.height);
                                                    } else {
                                                        nativesprite_41.method2772(drawX, drawY, inter.width, inter.height, 0, i_24, 1);
                                                    }
                                                    Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                                }
                                            } else if (IComponentDefinitions.aBool1399) {
                                                Class109.redrawComponent(inter);
                                            }
                                        }
                                    } else if (inter.type == ComponentType.MODEL) {
                                    	//TODO figure out what is broken with this block of logic
                                        IndexLoaders.MAP_REGION_DECODER.method4435().method4052();
                                        MeshRasterizer meshRasterizer = null;
                                        i_22 = 2048;
                                        if (inter.modelTintScalar != 0) {
                                            i_22 |= 0x80000;
                                        }
                                        i_23 = 0;
                                        if (inter.containerItemId != -1) {
                                            itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(inter.containerItemId);
                                            if (itemdefinitions_36 != null) {
                                                itemdefinitions_36 = itemdefinitions_36.method7090(inter.anInt1427);
                                                meshRasterizer = itemdefinitions_36.method7084(Renderers.CURRENT_RENDERER, i_22, 1, inter.wearCol ? VertexNormal.MY_PLAYER.model : null, inter.anim, 0, 0, 0, 0);
                                                if (meshRasterizer != null) {
                                                    i_23 = -meshRasterizer.YA() >> 1;
                                                } else {
                                                    Class109.redrawComponent(inter);
                                                }
                                            }
                                        } else {
                                            if (inter.modelType == ModelType.PLAYER_HEAD) {
                                                i_24 = inter.modelId;
                                                if (i_24 >= 0 && i_24 < 2048) {
                                                    PlayerEntity player_37 = client.players[i_24];
                                                    if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.stringToInt(player_37.displayName) == inter.anInt1339)) {
                                                        meshRasterizer = inter.method2002(Renderers.CURRENT_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.anim, player_37.model);
                                                        if (meshRasterizer == null && IComponentDefinitions.aBool1399) {
                                                            Class109.redrawComponent(inter);
                                                        }
                                                    }
                                                }
                                            } else if (inter.modelType == ModelType.PLAYER_MODEL) {
                                            	i_24 = inter.modelId;
                                                if (i_24 >= 0 && i_24 < 2048) {
                                                	PlayerEntity player_37 = client.players[i_24];
                                                    if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.stringToInt(player_37.displayName) == inter.anInt1339)) {
                                                        meshRasterizer = player_37.model.getBodyModel(Renderers.CURRENT_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.anim, null, null, null, 0, LinkedNodeList.EQUIPMENT_DEFAULTS);
                                                    }
                                                }
                                            } else if (inter.modelType == ModelType.ITEM_CONTAINER_MALE || inter.modelType == ModelType.ITEM_CONTAINER_FEMALE) {
                                                ItemContainer container = ItemContainer.getContainer(inter.modelId, false);
                                                if (container != null) {
                                                    meshRasterizer = container.method12429(Renderers.CURRENT_RENDERER, i_22, inter.anim, inter.anInt1339, inter.modelType == ModelType.ITEM_CONTAINER_FEMALE, inter.wearCol ? VertexNormal.MY_PLAYER.model : null);
                                                }
                                            } else {
                                                meshRasterizer = inter.method2002(Renderers.CURRENT_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.anim != null && inter.anim.hasDefs() ? inter.anim : null, VertexNormal.MY_PLAYER.model);
                                                if (meshRasterizer == null && IComponentDefinitions.aBool1399) {
                                                    Class109.redrawComponent(inter);
                                                }
                                            }
                                        }
                                        if (meshRasterizer != null) {
                                            if (inter.modelTintScalar != 0) {
                                                meshRasterizer.PA(inter.modelTintRed, inter.modelTintGreen, inter.modelTintBlue, inter.modelTintScalar);
                                            }
                                            if (inter.aspectWidth > 0) {
                                                i_24 = (inter.width << 9) / inter.aspectWidth;
                                            } else {
                                                i_24 = 512;
                                            }
                                            if (inter.aspectHeight > 0) {
                                                i_25 = (inter.height << 9) / inter.aspectHeight;
                                            } else {
                                                i_25 = 512;
                                            }
                                            i_39 = inter.width / 2 + drawX;
                                            i_27 = inter.height / 2 + drawY;
                                            if (!inter.hasOrigin) {
                                                i_39 += i_24 * inter.originX >> 9;
                                                i_27 += i_25 * inter.originY >> 9;
                                            }
                                            client.aClass294_7457.method5212();
                                            Renderers.CURRENT_RENDERER.method8457(client.aClass294_7457);
                                            Matrix44 matrix44_38 = Renderers.CURRENT_RENDERER.method8449();
                                            int i_29 = IndexLoaders.MAP_REGION_DECODER.method4544();
                                            int i_30 = IndexLoaders.MAP_REGION_DECODER.method4522();
                                            i_30 += inter.spriteScale;
                                            if (inter.usesOrthogonal) {
                                                if (inter.hasOrigin) {
                                                    matrix44_38.method6532(i_39, i_27, i_24, i_25, i_29, i_30, Class349.anInt4083, (client.anInt3243), inter.spriteScale);
                                                } else {
                                                    matrix44_38.method6532(i_39, i_27, i_24, i_25, i_29, i_30, Class349.anInt4083, (client.anInt3243), (inter.spriteScale << 2));
                                                }
                                            } else {
                                                matrix44_38.method6531(i_39, i_27, i_24, i_25, i_29, i_30, Class349.anInt4083, (client.anInt3243));
                                            }
                                            Renderers.CURRENT_RENDERER.method8424(matrix44_38);
                                            Renderers.CURRENT_RENDERER.ba(2, 0);
                                            if (inter.aBool1345) {
                                                Renderers.CURRENT_RENDERER.RA(false);
                                            }
                                            if (inter.hasOrigin) {
                                                client.aClass294_7169.method5217(1.0F, 0.0F, 0.0F, Trig.degToRad(inter.spritePitch));
                                                client.aClass294_7169.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(inter.spriteRoll));
                                                client.aClass294_7169.rotation(0.0F, 0.0F, 1.0F, Trig.degToRad(inter.spriteYaw));
                                                client.aClass294_7169.method5219(inter.originX, inter.originY, inter.originZ);
                                            } else {
                                                int i_31 = Trig.SINE[inter.spritePitch << 3] * (inter.spriteScale << 2) >> 14;
                                                int i_32 = Trig.COSINE[inter.spritePitch << 3] * (inter.spriteScale << 2) >> 14;
                                                client.aClass294_7169.method5217(0.0F, 0.0F, 1.0F, Trig.degToRad(-inter.spriteYaw << 3));
                                                client.aClass294_7169.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(inter.spriteRoll << 3));
                                                client.aClass294_7169.method5219((inter.offsetX << 2), (i_31 + i_23 + (inter.offsetY << 2)), (i_32 + (inter.offsetY << 2)));
                                                client.aClass294_7169.rotation(1.0F, 0.0F, 0.0F, Trig.degToRad(inter.spritePitch << 3));
                                            }
                                            inter.method1991(Renderers.CURRENT_RENDERER, meshRasterizer, client.aClass294_7169, client.CYCLES_20MS);
                                            if (client.aBool7358) {
                                                Renderers.CURRENT_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
                                            }
                                            meshRasterizer.method11282(client.aClass294_7169, null, 1);
                                            if (!inter.usesOrthogonal && inter.particleSystem != null) {
                                                Renderers.CURRENT_RENDERER.method8456(inter.particleSystem.method11533());
                                            }
                                            if (client.aBool7358) {
                                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
                                            }
                                            if (inter.aBool1345) {
                                                Renderers.CURRENT_RENDERER.RA(true);
                                            }
                                        }
                                    } else if (inter.type == ComponentType.LINE) {
                                        if (inter.lineDirection) {
                                            i_21 = drawX;
                                            i_22 = drawY + inter.height;
                                            i_23 = drawX + inter.width;
                                            i_24 = drawY;
                                        } else {
                                            i_21 = drawX;
                                            i_22 = drawY;
                                            i_23 = drawX + inter.width;
                                            i_24 = drawY + inter.height;
                                        }
                                        if (inter.lineWidth == 1) {
                                            Renderers.CURRENT_RENDERER.method8433(i_21, i_22, i_23, i_24, inter.color, 0);
                                        } else {
                                            Renderers.CURRENT_RENDERER.method8496(i_21, i_22, i_23, i_24, inter.color, inter.lineWidth, 0);
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

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }

    @Override
    boolean method12986() {
        return false;
    }

    @Override
    boolean method12987() {
        return aBool10508;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }

    @Override
    public int method12995() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method12997() {
        return aClass123_10507.method2121();
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_3 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_4 = method11168();
            CoordinateSpace class305_5 = method11166();
            Class285 class285_6 = Class470.method7824(aBool10506);
            int i_7 = (int) class305_5.coords.x >> 9;
            int i_8 = (int) class305_5.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, true);
            meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_9 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_9);
            }
            aBool10508 = meshrasterizer_3.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
            }
            return class285_6;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_3 != null) {
            Vector3 vector3_4 = method11166().coords;
            int i_5 = (int) vector3_4.x >> 9;
            int i_6 = (int) vector3_4.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, method11168(), false);
        }
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_5 = aClass123_10507.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    boolean method12985() {
        return false;
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    boolean method13026() {
        return false;
    }

    @Override
    public int getId() {
        return aClass123_10507.anInt1540;
    }

    @Override
    public int method92() {
        return aClass123_10507.anInt1542;
    }

    public void method16091(Class476 class476_1) {
        aClass123_10507.method2116(class476_1);
    }

    @Override
    public void method85() {
    }

    @Override
    public boolean method86() {
        return aClass123_10507.method2117();
    }

    @Override
    public void method87(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2136(graphicalrenderer_1);
    }

    @Override
    boolean method13001() {
        return aBool10508;
    }

    @Override
    public int method76() {
        return 1535779425 * aClass123_10507.anInt1540 * 1623064993;
    }

    @Override
    public int method39() {
        return 1535779425 * aClass123_10507.anInt1540 * 1623064993;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_4 = aClass123_10507.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_4 != null && meshrasterizer_4.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    boolean method13002() {
        return aBool10508;
    }

    @Override
    public int method91() {
        return -515017769 * aClass123_10507.anInt1542 * -2132267033;
    }

    @Override
    public void method38() {
    }

    @Override
    public int method77() {
        return aClass123_10507.anInt1555 * 2129865927 * 845010167;
    }

    @Override
    public void method90() {
    }

    @Override
    public boolean method94() {
        return aClass123_10507.method2117();
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10506);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10508 = meshrasterizer_2.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_2 != null) {
            Vector3 vector3_3 = method11166().coords;
            int i_4 = (int) vector3_3.x >> 9;
            int i_5 = (int) vector3_3.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, method11168(), false);
        }
    }

    @Override
    public void method83(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2136(graphicalrenderer_1);
    }

    @Override
    public void method97(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2118();
    }

    @Override
    public void method98(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2118();
    }

    @Override
    boolean method12999() {
        return false;
    }

    @Override
    public int method73() {
        return aClass123_10507.anInt1555 * 2129865927 * 845010167;
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13000() {
        return aBool10508;
    }

    @Override
    public int method13003() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method13017() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method13005() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method89() {
        return aClass123_10507.anInt1555;
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10506);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10508 = meshrasterizer_2.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10506);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10508 = meshrasterizer_2.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_2 != null) {
            Vector3 vector3_3 = method11166().coords;
            int i_4 = (int) vector3_3.x >> 9;
            int i_5 = (int) vector3_3.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, method11168(), false);
        }
    }

    @Override
    public int method13006() {
        return aClass123_10507.method2115();
    }

    @Override
    public boolean method95() {
        return aClass123_10507.method2117();
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }

    @Override
    public void method88(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2118();
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    public void method93(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2136(graphicalrenderer_1);
    }

    @Override
    public void method96() {
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }
}
