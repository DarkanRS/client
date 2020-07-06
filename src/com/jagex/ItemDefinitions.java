package com.jagex;

public class ItemDefinitions implements Definition {

    public static short[] staticColorArr256 = new short[256];
    public int value = 1;
    public int modelZoom = 2000;
    public int modelRotationX;
    public int modelRotationY;
    public int modelRotationZ;
    public int modelOffsetX;
    public int modelOffsetY;
    public String name = "null";
    public boolean membersOnly;
    public int wearPos = -1;
    public int wearPos2 = -1;
    public int wearPos3 = -1;
    public int teamId;
    public String[] groundOptions;
    public int stackable;
    public String[] inventoryOptions;
    public int multiStackSize = -1;
    public int tooltipColor;
    public boolean hasTooltipColor;
    public boolean grandExchange;
    public int unknownInt6;
    public int certId = -1;
    public int certTemplateId = -1;
    public int lendTemplateId = -1;
    public int unknownInt18 = -1;
    public int unknownInt19 = -1;
    public int unknownInt20 = -1;
    public int unknownInt21 = -1;
    public int customCursorOp1 = -1;
    public int customCursorId1 = -1;
    public int customCursorOp2 = -1;
    public int customCursorId2 = -1;
    public int[] quests;
    public int pickSizeShift;
    public int bindTemplateId = -1;
    ItemIndexLoader loader;
    int id;
    int modelId;
    short[] originalModelColors;
    short[] modifiedModelColors;
    byte[] spriteRecolorIndices;
    short[] originalTextureIds;
    short[] modifiedTextureIds;
    int maleEquip1 = -1;
    int maleEquip2 = -1;
    int maleEquip3 = -1;
    int femaleEquip1 = -1;
    int femaleEquip2 = -1;
    int femaleEquip3 = -1;
    int maleWearXOffset;
    int femaleWearXOffset;
    int maleWearYOffset;
    int femaleWearYOffset;
    int maleWearZOffset;
    int femaleWearZOffset;
    int maleHead1 = -1;
    int maleHead2 = -1;
    int femaleHead1 = -1;
    int femaleHead2 = -1;
    IterableNodeMap cs2Map;
    int resizeX = 128;
    int[] stackIds;
    int[] stackAmounts;
    int resizeY = 128;
    int resizeZ = 128;
    int ambient;
    int contrast;
    int lendId = -1;
    int bindId = -1;

    static int[] addOutlines(int[] ints_0, int i_1) {
        int[] ints_3 = new int[1152];
        int i_4 = 0;
        for (int i_5 = 0; i_5 < 32; i_5++) {
            for (int i_6 = 0; i_6 < 36; i_6++) {
                int i_7 = ints_0[i_4];
                if (i_7 == 0) {
                    if (i_6 > 0 && ints_0[i_4 - 1] != 0) {
                        i_7 = i_1;
                    } else if (i_5 > 0 && ints_0[i_4 - 36] != 0) {
                        i_7 = i_1;
                    } else if (i_6 < 35 && ints_0[i_4 + 1] != 0) {
                        i_7 = i_1;
                    } else if (i_5 < 31 && ints_0[i_4 + 36] != 0) {
                        i_7 = i_1;
                    }
                }
                ints_3[i_4++] = i_7;
            }
        }
        return ints_3;
    }

    static void method7140(PathingEntity animable_0, PathingEntity animable_1, int i_2, int i_3, int i_4) {
        int i_10 = animable_1.method15899();
        if (i_10 != -1) {
            NativeSprite nativesprite_11 = (NativeSprite) client.aClass229_7204.get(i_10);
            if (nativesprite_11 == null) {
                SpriteDefinitions[] arr_12 = SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, i_10);
                if (arr_12 == null) {
                    return;
                }
                nativesprite_11 = Renderers.CURRENT_RENDERER.method8444(arr_12[0], true);
                client.aClass229_7204.put(nativesprite_11, i_10);
            }
            Vector3 vector3_16 = animable_0.method11166().coords;
            ScriptRunner.method3612(animable_0.plane, (int) vector3_16.x, (int) vector3_16.z, animable_0.getSize() * 256, 0, false);
            int i_13 = (int) (i_3 + client.aFloatArray7292[0] - 18.0F);
            int i_14 = (int) (i_4 + client.aFloatArray7292[1] - 16.0F - 54.0F);
            i_13 += i_2 / 4 * 18;
            i_14 += i_2 % 4 * 18;
            nativesprite_11.method2752(i_13, i_14);
            if (animable_1 == animable_0) {
                Renderers.CURRENT_RENDERER.method8562(i_13 - 1, i_14 - 1, 18, 18, -256);
            }
            EntityNode_Sub2 class275_sub2_15 = PlayerVarProvider.method286();
            class275_sub2_15.aTransform_Sub1_Sub1_Sub2_7739 = animable_1;
            class275_sub2_15.anInt7742 = i_13;
            class275_sub2_15.anInt7743 = i_14;
            class275_sub2_15.anInt7744 = i_13 + 16;
            class275_sub2_15.anInt7740 = i_14 + 16;
            client.aClass457_7290.offer(class275_sub2_15);
        }
    }

    public static void method7141() {
        Class329.method5906();
    }

    public MeshRasterizer method7084(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, PlayerModel playerappearance_4, Animation animation_5, int i_6, int i_7, int i_8, int i_9) {
        int i_11;
        if (stackIds != null && i_3 > 1) {
            i_11 = -1;
            for (int i_12 = 0; i_12 < 10; i_12++) {
                if (i_3 >= stackAmounts[i_12] && stackAmounts[i_12] != 0) {
                    i_11 = stackIds[i_12];
                }
            }
            if (i_11 != -1) {
                return loader.getItemDefinitions(i_11).method7084(graphicalrenderer_1, i_2, 1, playerappearance_4, animation_5, i_6, i_7, i_8, i_9);
            }
        }
        i_11 = i_2;
        if (animation_5 != null) {
            i_11 = i_2 | animation_5.method7640();
        }
        LRUCache softcache_13 = loader.aClass229_5115;
        MeshRasterizer meshrasterizer_17;
        synchronized (loader.aClass229_5115) {
            meshrasterizer_17 = (MeshRasterizer) loader.aClass229_5115.get(id | graphicalrenderer_1.rendererId << 29);
        }
        if (meshrasterizer_17 == null || graphicalrenderer_1.method8452(meshrasterizer_17.m(), i_11) != 0) {
            if (meshrasterizer_17 != null) {
                i_11 = graphicalrenderer_1.method8546(i_11, meshrasterizer_17.m());
            }
            int i_18 = i_11;
            if (originalTextureIds != null) {
                i_18 = i_11 | 0x8000;
            }
            if (originalModelColors != null || playerappearance_4 != null) {
                i_18 |= 0x4000;
            }
            if (resizeX != 128) {
                i_18 |= 0x1;
            }
            if (resizeX != 128) {
                i_18 |= 0x2;
            }
            if (resizeX != 128) {
                i_18 |= 0x4;
            }
            RSMesh rsmesh_14 = RSMesh.decodeMesh(loader.meshIndex, modelId);
            if (rsmesh_14 == null) {
                return null;
            }
            if (rsmesh_14.version < 13) {
                rsmesh_14.upscale();
            }
            meshrasterizer_17 = graphicalrenderer_1.createMeshRasterizer(rsmesh_14, i_18, loader.anInt5116, ambient + 64, contrast * 5 + 850);
            if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
                meshrasterizer_17.oa(resizeX, resizeY, resizeZ);
            }
            int i_15;
            if (originalModelColors != null) {
                for (i_15 = 0; i_15 < originalModelColors.length; i_15++) {
                    if (spriteRecolorIndices != null && i_15 < spriteRecolorIndices.length) {
                        meshrasterizer_17.X(originalModelColors[i_15], staticColorArr256[spriteRecolorIndices[i_15] & 0xff]);
                    } else {
                        meshrasterizer_17.X(originalModelColors[i_15], modifiedModelColors[i_15]);
                    }
                }
            }
            if (originalTextureIds != null) {
                for (i_15 = 0; i_15 < originalTextureIds.length; i_15++) {
                    meshrasterizer_17.W(originalTextureIds[i_15], modifiedTextureIds[i_15]);
                }
            }
            if (playerappearance_4 != null) {
                for (i_15 = 0; i_15 < 10; i_15++) {
                    for (int i_16 = 0; i_16 < AbstractQueue_Sub1.SKIN_COLORS[i_15].length; i_16++) {
                        if (playerappearance_4.colors[i_15] < Class366.SKIN_COLORS[i_15][i_16].length) {
                            meshrasterizer_17.X(AbstractQueue_Sub1.SKIN_COLORS[i_15][i_16], Class366.SKIN_COLORS[i_15][i_16][playerappearance_4.colors[i_15]]);
                        }
                    }
                }
            }
            meshrasterizer_17.KA(i_11);
            LRUCache softcache_19 = loader.aClass229_5115;
            synchronized (loader.aClass229_5115) {
                loader.aClass229_5115.put(meshrasterizer_17, id | graphicalrenderer_1.rendererId << 29);
            }
        }
        if (animation_5 != null || i_9 != 0) {
            meshrasterizer_17 = meshrasterizer_17.method11289((byte) 1, i_11, true);
            if (animation_5 != null) {
                animation_5.rasterize(meshrasterizer_17, 0);
            }
            if (i_9 != 0) {
                meshrasterizer_17.PA(i_6, i_7, i_8, i_9);
            }
        }
        meshrasterizer_17.KA(i_2);
        return meshrasterizer_17;
    }

    void postDecode() {
    }

    void decode(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            decode(rsbytebuffer_1, i_3);
        }
    }

    void generateBind(ItemDefinitions itemdefinitions_1, ItemDefinitions itemdefinitions_2) {
        value = 0;
        modelId = itemdefinitions_1.modelId;
        modelZoom = itemdefinitions_1.modelZoom;
        modelRotationX = itemdefinitions_1.modelRotationX;
        modelRotationY = itemdefinitions_1.modelRotationY;
        modelRotationZ = itemdefinitions_1.modelRotationZ;
        modelOffsetX = itemdefinitions_1.modelOffsetX;
        modelOffsetY = itemdefinitions_1.modelOffsetY;
        originalModelColors = itemdefinitions_2.originalModelColors;
        modifiedModelColors = itemdefinitions_2.modifiedModelColors;
        spriteRecolorIndices = itemdefinitions_2.spriteRecolorIndices;
        originalTextureIds = itemdefinitions_2.originalTextureIds;
        modifiedTextureIds = itemdefinitions_2.modifiedTextureIds;
        name = itemdefinitions_2.name;
        membersOnly = itemdefinitions_2.membersOnly;
        wearPos = itemdefinitions_2.wearPos;
        wearPos2 = itemdefinitions_2.wearPos2;
        wearPos3 = itemdefinitions_2.wearPos3;
        maleEquip1 = itemdefinitions_2.maleEquip1;
        maleEquip2 = itemdefinitions_2.maleEquip2;
        maleEquip3 = itemdefinitions_2.maleEquip3;
        femaleEquip1 = itemdefinitions_2.femaleEquip1;
        femaleEquip2 = itemdefinitions_2.femaleEquip2;
        femaleEquip3 = itemdefinitions_2.femaleEquip3;
        maleWearXOffset = itemdefinitions_2.maleWearXOffset;
        femaleWearXOffset = itemdefinitions_2.femaleWearXOffset;
        maleWearYOffset = itemdefinitions_2.maleWearYOffset;
        femaleWearYOffset = itemdefinitions_2.femaleWearYOffset;
        maleWearZOffset = itemdefinitions_2.maleWearZOffset;
        femaleWearZOffset = itemdefinitions_2.femaleWearZOffset;
        maleHead1 = itemdefinitions_2.maleHead1;
        maleHead2 = itemdefinitions_2.maleHead2;
        femaleHead1 = itemdefinitions_2.femaleHead1;
        femaleHead2 = itemdefinitions_2.femaleHead2;
        teamId = itemdefinitions_2.teamId;
        groundOptions = itemdefinitions_2.groundOptions;
        cs2Map = itemdefinitions_2.cs2Map;
        stackable = itemdefinitions_2.stackable;
        inventoryOptions = new String[5];
        if (itemdefinitions_2.inventoryOptions != null) {
            System.arraycopy(itemdefinitions_2.inventoryOptions, 0, inventoryOptions, 0, 4);
        }
        inventoryOptions[4] = LocalizedText.DISCARD_2.translate(loader.language);
    }

    void generateCert(ItemDefinitions itemdefinitions_1, ItemDefinitions itemdefinitions_2) {
        modelId = itemdefinitions_1.modelId;
        modelZoom = itemdefinitions_1.modelZoom;
        modelRotationX = itemdefinitions_1.modelRotationX;
        modelRotationY = itemdefinitions_1.modelRotationY;
        modelRotationZ = itemdefinitions_1.modelRotationZ;
        modelOffsetX = itemdefinitions_1.modelOffsetX;
        modelOffsetY = itemdefinitions_1.modelOffsetY;
        originalModelColors = itemdefinitions_1.originalModelColors;
        modifiedModelColors = itemdefinitions_1.modifiedModelColors;
        spriteRecolorIndices = itemdefinitions_1.spriteRecolorIndices;
        originalTextureIds = itemdefinitions_1.originalTextureIds;
        modifiedTextureIds = itemdefinitions_1.modifiedTextureIds;
        name = itemdefinitions_2.name;
        membersOnly = itemdefinitions_2.membersOnly;
        value = itemdefinitions_2.value;
        stackable = 1;
    }

    void decode(ByteBuf stream, int opcode) {
        if (opcode == 1) {
            modelId = stream.readBigSmart();
        } else if (opcode == 2) {
            name = stream.readString();
        } else if (opcode == 4) {
            modelZoom = stream.readUnsignedShort();
        } else if (opcode == 5) {
            modelRotationX = stream.readUnsignedShort();
        } else if (opcode == 6) {
            modelRotationY = stream.readUnsignedShort();
        } else if (opcode == 7) {
            modelOffsetX = stream.readUnsignedShort();
            if (modelOffsetX > 32767) {
                modelOffsetX -= 65536;
            }
        } else if (opcode == 8) {
            modelOffsetY = stream.readUnsignedShort();
            if (modelOffsetY > 32767) {
                modelOffsetY -= 65536;
            }
        } else if (opcode == 11) {
            stackable = 1;
        } else if (opcode == 12) {
            value = stream.readInt();
        } else if (opcode == 13) {
            wearPos = stream.readUnsignedByte();
        } else if (opcode == 14) {
            wearPos2 = stream.readUnsignedByte();
        } else if (opcode == 16) {
            membersOnly = true;
        } else if (opcode == 18) {
            multiStackSize = stream.readUnsignedShort();
        } else if (opcode == 23) {
            maleEquip1 = stream.readBigSmart();
        } else if (opcode == 24) {
            maleEquip2 = stream.readBigSmart();
        } else if (opcode == 25) {
            femaleEquip1 = stream.readBigSmart();
        } else if (opcode == 26) {
            femaleEquip2 = stream.readBigSmart();
        } else if (opcode == 27) {
            wearPos3 = stream.readUnsignedByte();
        } else if (opcode >= 30 && opcode < 35) {
            groundOptions[opcode - 30] = stream.readString();
        } else if (opcode >= 35 && opcode < 40) {
            inventoryOptions[opcode - 35] = stream.readString();
        } else {
            int i_4;
            int i_5;
            if (opcode == 40) {
                i_4 = stream.readUnsignedByte();
                originalModelColors = new short[i_4];
                modifiedModelColors = new short[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    originalModelColors[i_5] = (short) stream.readUnsignedShort();
                    modifiedModelColors[i_5] = (short) stream.readUnsignedShort();
                }
            } else if (opcode == 41) {
                i_4 = stream.readUnsignedByte();
                originalTextureIds = new short[i_4];
                modifiedTextureIds = new short[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    originalTextureIds[i_5] = (short) stream.readUnsignedShort();
                    modifiedTextureIds[i_5] = (short) stream.readUnsignedShort();
                }
            } else if (opcode == 42) {
                i_4 = stream.readUnsignedByte();
                spriteRecolorIndices = new byte[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    spriteRecolorIndices[i_5] = stream.readByte();
                }
            } else if (opcode == 43) {
                tooltipColor = stream.readInt();
                hasTooltipColor = true;
            } else if (opcode == 65) {
                grandExchange = true;
            } else if (opcode == 78) {
                maleEquip3 = stream.readBigSmart();
            } else if (opcode == 79) {
                femaleEquip3 = stream.readBigSmart();
            } else if (opcode == 90) {
                maleHead1 = stream.readBigSmart();
            } else if (opcode == 91) {
                femaleHead1 = stream.readBigSmart();
            } else if (opcode == 92) {
                maleHead2 = stream.readBigSmart();
            } else if (opcode == 93) {
                femaleHead2 = stream.readBigSmart();
            } else if (opcode == 95) {
                modelRotationZ = stream.readUnsignedShort();
            } else if (opcode == 96) {
                unknownInt6 = stream.readUnsignedByte();
            } else if (opcode == 97) {
                certId = stream.readUnsignedShort();
            } else if (opcode == 98) {
                certTemplateId = stream.readUnsignedShort();
            } else if (opcode >= 100 && opcode < 110) {
                if (stackIds == null) {
                    stackIds = new int[10];
                    stackAmounts = new int[10];
                }
                stackIds[opcode - 100] = stream.readUnsignedShort();
                stackAmounts[opcode - 100] = stream.readUnsignedShort();
            } else if (opcode == 110) {
                resizeX = stream.readUnsignedShort();
            } else if (opcode == 111) {
                resizeY = stream.readUnsignedShort();
            } else if (opcode == 112) {
                resizeZ = stream.readUnsignedShort();
            } else if (opcode == 113) {
                ambient = stream.readByte();
            } else if (opcode == 114) {
                contrast = stream.readByte();
            } else if (opcode == 115) {
                teamId = stream.readUnsignedByte();
            } else if (opcode == 121) {
                lendId = stream.readUnsignedShort();
            } else if (opcode == 122) {
                lendTemplateId = stream.readUnsignedShort();
            } else if (opcode == 125) {
                maleWearXOffset = stream.readByte() << 2;
                maleWearYOffset = stream.readByte() << 2;
                maleWearZOffset = stream.readByte() << 2;
            } else if (opcode == 126) {
                femaleWearXOffset = stream.readByte() << 2;
                femaleWearYOffset = stream.readByte() << 2;
                femaleWearZOffset = stream.readByte() << 2;
            } else if (opcode == 127) {
                unknownInt18 = stream.readUnsignedByte();
                unknownInt19 = stream.readUnsignedShort();
            } else if (opcode == 128) {
                unknownInt20 = stream.readUnsignedByte();
                unknownInt21 = stream.readUnsignedShort();
            } else if (opcode == 129) {
                customCursorOp1 = stream.readUnsignedByte();
                customCursorId1 = stream.readUnsignedShort();
            } else if (opcode == 130) {
                customCursorOp2 = stream.readUnsignedByte();
                customCursorId2 = stream.readUnsignedShort();
            } else if (opcode == 132) {
                i_4 = stream.readUnsignedByte();
                quests = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    quests[i_5] = stream.readUnsignedShort();
                }
            } else if (opcode == 134) {
                pickSizeShift = stream.readUnsignedByte();
            } else if (opcode == 139) {
                bindId = stream.readUnsignedShort();
            } else if (opcode == 140) {
                bindTemplateId = stream.readUnsignedShort();
            } else if (opcode == 249) {
                i_4 = stream.readUnsignedByte();
                if (cs2Map == null) {
                    i_5 = Utils.nextPowerOfTwo(i_4);
                    cs2Map = new IterableNodeMap(i_5);
                }
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    boolean bool_6 = stream.readUnsignedByte() == 1;
                    int i_7 = stream.read24BitUnsignedInteger();
                    Object obj_8;
                    if (bool_6) {
                        obj_8 = new ObjectNode(stream.readString());
                    } else {
                        obj_8 = new IntNode(stream.readInt());
                    }
                    cs2Map.put((Node) obj_8, i_7);
                }
            }
        }
    }

    public ItemDefinitions method7090(int i_1) {
        if (stackIds != null && i_1 > 1) {
            int i_3 = -1;
            for (int i_4 = 0; i_4 < 10; i_4++) {
                if (i_1 >= stackAmounts[i_4] && stackAmounts[i_4] != 0) {
                    i_3 = stackIds[i_4];
                }
            }
            if (i_3 != -1) {
                return loader.getItemDefinitions(i_3);
            }
        }
        return this;
    }

    int[] getSprite(AbstractRenderer hardwareRenderer, AbstractRenderer softwareRenderer, int amount, int outlineSize, int shadowColor, boolean zoomedIn, int renderAmounts, FontRenderer fontRenderer, PlayerModel model) {
        RSMesh inventoryMesh = RSMesh.decodeMesh(loader.meshIndex, modelId);
        if (inventoryMesh == null) {
            return null;
        } else {
            if (inventoryMesh.version < 13) {
                inventoryMesh.upscale();
            }
            int i;
            if (originalModelColors != null) {
                for (i = 0; i < originalModelColors.length; i++) {
                    if (spriteRecolorIndices != null && i < spriteRecolorIndices.length) {
                        inventoryMesh.recolor(originalModelColors[i], staticColorArr256[spriteRecolorIndices[i] & 0xff]);
                    } else {
                        inventoryMesh.recolor(originalModelColors[i], modifiedModelColors[i]);
                    }
                }
            }
            if (originalTextureIds != null) {
                for (i = 0; i < originalTextureIds.length; i++) {
                    inventoryMesh.retexture(originalTextureIds[i], modifiedTextureIds[i]);
                }
            }
            if (model != null) {
                for (i = 0; i < 10; i++) {
                    for (int i_13 = 0; i_13 < AbstractQueue_Sub1.SKIN_COLORS[i].length; i_13++) {
                        if (model.colors[i] < Class366.SKIN_COLORS[i][i_13].length) {
                            inventoryMesh.recolor(AbstractQueue_Sub1.SKIN_COLORS[i][i_13], Class366.SKIN_COLORS[i][i_13][model.colors[i]]);
                        }
                    }
                }
            }
            i = 2048;
            boolean needsResize = false;
            if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
                needsResize = true;
                i |= 0x7;
            }
            MeshRasterizer meshRasterizer = hardwareRenderer.createMeshRasterizer(inventoryMesh, i, 64, ambient + 64, contrast * 5 + 768);
            if (!meshRasterizer.successful()) {
                return null;
            } else {
                if (needsResize) {
                    meshRasterizer.oa(resizeX, resizeY, resizeZ);
                }
                NativeSprite sprite = null;
                if (certTemplateId != -1) {
                    sprite = loader.getSprite(hardwareRenderer, softwareRenderer, certId, 10, 1, 0, true, true, 0, fontRenderer, model);
                    if (sprite == null) {
                        return null;
                    }
                } else if (lendTemplateId != -1) {
                    sprite = loader.getSprite(hardwareRenderer, softwareRenderer, lendId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, model);
                    if (sprite == null) {
                        return null;
                    }
                } else if (bindTemplateId != -1) {
                    sprite = loader.getSprite(hardwareRenderer, softwareRenderer, bindId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, model);
                    if (sprite == null) {
                        return null;
                    }
                }
                int zoom;
                if (zoomedIn) {
                    zoom = (int) (1.5D * modelZoom) << 2;
                } else if (outlineSize == 2) {
                    zoom = (int) (modelZoom * 1.04D) << 2;
                } else {
                    zoom = modelZoom << 2;
                }
                Matrix44 matrix44_17 = hardwareRenderer.method8453();
                Matrix44 matrix44_18 = hardwareRenderer.method8449();
                matrix44_18.method6531(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, hardwareRenderer.method8523().method2714(), hardwareRenderer.method8523().method2716());
                hardwareRenderer.method8424(matrix44_18);
                hardwareRenderer.method8617(0, 0, hardwareRenderer.method8523().method2714(), hardwareRenderer.method8523().method2716());
                Matrix44Var matrix44var_19 = new Matrix44Var();
                hardwareRenderer.method8457(matrix44var_19);
                hardwareRenderer.IA(0.95F + (float) (Math.random() / 10.0D));
                hardwareRenderer.m(16777215, 0.95F + (float) (Math.random() / 10.0D), 0.95F + (float) (Math.random() / 10.0D), -50.0f, -10.0f, -50.0f);
                Matrix44Var matrix44var_20 = hardwareRenderer.method8450();
                matrix44var_20.method5217(0.0F, 0.0F, 1.0F, Trig.degToRad(-modelRotationZ << 3));
                matrix44var_20.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(modelRotationY << 3));
                matrix44var_20.method5219((modelOffsetX << 2), ((zoom * Trig.SINE[modelRotationX << 3] >> 14) - meshRasterizer.YA() / 2 + (modelOffsetY << 2)), ((zoom * Trig.COSINE[modelRotationX << 3] >> 14) + (modelOffsetY << 2)));
                matrix44var_20.rotation(1.0F, 0.0F, 0.0F, Trig.degToRad(modelRotationX << 3));
                hardwareRenderer.r(0, 0, 36, 32);
                hardwareRenderer.ba(2, 0);
                hardwareRenderer.B(0, 0, 36, 32, 0, 0);
                hardwareRenderer.c(0, -1, 0);
                meshRasterizer.method11282(matrix44var_20, null, 1);
                hardwareRenderer.method8424(matrix44_17);
                int[] ints_21 = hardwareRenderer.ab(0, 0, 36, 32);
                if (outlineSize >= 1) {
                    ints_21 = addOutlines(ints_21, -16777214);
                    if (outlineSize >= 2) {
                        ints_21 = addOutlines(ints_21, -1);
                    }
                }
                if (shadowColor != 0) {
                    addShadow(ints_21, shadowColor);
                }
                if (lendTemplateId != -1) {
                    sprite.method2752(0, 0);
                } else if (bindTemplateId != -1) {
                    sprite.method2752(0, 0);
                }
                hardwareRenderer.createNativeSprite(ints_21, 36, 36, 32).method2752(0, 0);
                if (certTemplateId != -1) {
                    sprite.method2752(0, 0);
                }
                if (renderAmounts == 1 || renderAmounts == 2 && (stackable == 1 || amount != 1) && amount != -1) {
                    fontRenderer.renderText(Class304.method5407(amount, loader.language), 0, 9, -256, -16777215);
                }
                ints_21 = hardwareRenderer.ab(0, 0, 36, 32);
                for (int i_22 = 0; i_22 < ints_21.length; i_22++) {
                    if ((ints_21[i_22] & 0xffffff) == 0) {
                        ints_21[i_22] = 0;
                    } else {
                        ints_21[i_22] |= -16777216;
                    }
                }
                return ints_21;
            }
        }
    }

    void addShadow(int[] ints_1, int i_2) {
        for (int i_4 = 31; i_4 > 0; --i_4) {
            int i_5 = i_4 * 36;
            for (int i_6 = 35; i_6 > 0; --i_6) {
                if (ints_1[i_6 + i_5] == 0 && ints_1[i_6 + i_5 - 1 - 36] != 0) {
                    ints_1[i_5 + i_6] = i_2;
                }
            }
        }
    }

    public boolean bodyMeshesReady(boolean female, MeshModifier meshmodifier_2) {
        int i_4;
        int i_5;
        int i_6;
        if (female) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleBody != null) {
                i_4 = meshmodifier_2.femaleBody[0];
                i_5 = meshmodifier_2.femaleBody[1];
                i_6 = meshmodifier_2.femaleBody[2];
            } else {
                i_4 = femaleEquip1;
                i_5 = femaleEquip2;
                i_6 = femaleEquip3;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleBody != null) {
            i_4 = meshmodifier_2.maleBody[0];
            i_5 = meshmodifier_2.maleBody[1];
            i_6 = meshmodifier_2.maleBody[2];
        } else {
            i_4 = maleEquip1;
            i_5 = maleEquip2;
            i_6 = maleEquip3;
        }
        if (i_4 == -1) {
            return true;
        } else {
            boolean bool_7 = true;
            if (!loader.meshIndex.load(i_4, 0)) {
                bool_7 = false;
            }
            if (i_5 != -1 && !loader.meshIndex.load(i_5, 0)) {
                bool_7 = false;
            }
            if (i_6 != -1 && !loader.meshIndex.load(i_6, 0)) {
                bool_7 = false;
            }
            return bool_7;
        }
    }

    public RSMesh getBodyMesh(boolean bool_1, MeshModifier meshmodifier_2) {
        int i_4;
        int i_5;
        int i_6;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleBody != null) {
                i_4 = meshmodifier_2.femaleBody[0];
                i_5 = meshmodifier_2.femaleBody[1];
                i_6 = meshmodifier_2.femaleBody[2];
            } else {
                i_4 = femaleEquip1;
                i_5 = femaleEquip2;
                i_6 = femaleEquip3;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleBody != null) {
            i_4 = meshmodifier_2.maleBody[0];
            i_5 = meshmodifier_2.maleBody[1];
            i_6 = meshmodifier_2.maleBody[2];
        } else {
            i_4 = maleEquip1;
            i_5 = maleEquip2;
            i_6 = maleEquip3;
        }
        if (i_4 == -1) {
            return null;
        } else {
            RSMesh rsmesh_7 = RSMesh.decodeMesh(loader.meshIndex, i_4);
            if (rsmesh_7 == null) {
                return null;
            } else {
                if (rsmesh_7.version < 13) {
                    rsmesh_7.upscale();
                }
                if (i_5 != -1) {
                    RSMesh rsmesh_8 = RSMesh.decodeMesh(loader.meshIndex, i_5);
                    if (rsmesh_8.version < 13) {
                        rsmesh_8.upscale();
                    }
                    if (i_6 != -1) {
                        RSMesh rsmesh_9 = RSMesh.decodeMesh(loader.meshIndex, i_6);
                        if (rsmesh_9.version < 13) {
                            rsmesh_9.upscale();
                        }
                        RSMesh[] arr_10 = {rsmesh_7, rsmesh_8, rsmesh_9};
                        rsmesh_7 = new RSMesh(arr_10, 3);
                    } else {
                        RSMesh[] arr_13 = {rsmesh_7, rsmesh_8};
                        rsmesh_7 = new RSMesh(arr_13, 2);
                    }
                }
                if (!bool_1 && (maleWearXOffset != 0 || maleWearYOffset != 0 || maleWearZOffset != 0)) {
                    rsmesh_7.translate(maleWearXOffset, maleWearYOffset, maleWearZOffset);
                }
                if (bool_1 && (femaleWearXOffset != 0 || femaleWearYOffset != 0 || femaleWearZOffset != 0)) {
                    rsmesh_7.translate(femaleWearXOffset, femaleWearYOffset, femaleWearZOffset);
                }
                int i_11;
                short[] shorts_12;
                if (originalModelColors != null) {
                    if (meshmodifier_2 != null && meshmodifier_2.modifiedColors != null) {
                        shorts_12 = meshmodifier_2.modifiedColors;
                    } else {
                        shorts_12 = modifiedModelColors;
                    }
                    for (i_11 = 0; i_11 < originalModelColors.length; i_11++) {
                        rsmesh_7.recolor(originalModelColors[i_11], shorts_12[i_11]);
                    }
                }
                if (originalTextureIds != null) {
                    if (meshmodifier_2 != null && meshmodifier_2.modifiedTextures != null) {
                        shorts_12 = meshmodifier_2.modifiedTextures;
                    } else {
                        shorts_12 = modifiedTextureIds;
                    }
                    for (i_11 = 0; i_11 < originalTextureIds.length; i_11++) {
                        rsmesh_7.retexture(originalTextureIds[i_11], shorts_12[i_11]);
                    }
                }
                return rsmesh_7;
            }
        }
    }

    public boolean headMeshesReady(boolean bool_1, MeshModifier meshmodifier_2) {
        int i_4;
        int i_5;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleHeads != null) {
                i_4 = meshmodifier_2.femaleHeads[0];
                i_5 = meshmodifier_2.femaleHeads[1];
            } else {
                i_4 = femaleHead1;
                i_5 = femaleHead2;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleHeads != null) {
            i_4 = meshmodifier_2.maleHeads[0];
            i_5 = meshmodifier_2.maleHeads[1];
        } else {
            i_4 = maleHead1;
            i_5 = maleHead2;
        }
        if (i_4 == -1) {
            return true;
        } else {
            boolean bool_6 = true;
            if (!loader.meshIndex.load(i_4, 0)) {
                bool_6 = false;
            }
            if (i_5 != -1 && !loader.meshIndex.load(i_5, 0)) {
                bool_6 = false;
            }
            return bool_6;
        }
    }

    public int getCS2Integer(int i_1, int i_2) {
        if (cs2Map == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) cs2Map.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    public String getCS2String(int key, String defaultValue) {
        if (cs2Map == null) {
            return defaultValue;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) cs2Map.get(key);
            return class282_sub47_4 == null ? defaultValue : (String) class282_sub47_4.anObject8068;
        }
    }

    public RSMesh getHeadMesh(boolean bool_1, MeshModifier meshmodifier_2) {
        int i_4;
        int i_5;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleHeads != null) {
                i_4 = meshmodifier_2.femaleHeads[0];
                i_5 = meshmodifier_2.femaleHeads[1];
            } else {
                i_4 = femaleHead1;
                i_5 = femaleHead2;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleHeads != null) {
            i_4 = meshmodifier_2.maleHeads[0];
            i_5 = meshmodifier_2.maleHeads[1];
        } else {
            i_4 = maleHead1;
            i_5 = maleHead2;
        }
        if (i_4 == -1) {
            return null;
        } else {
            RSMesh rsmesh_6 = RSMesh.decodeMesh(loader.meshIndex, i_4);
            if (rsmesh_6.version < 13) {
                rsmesh_6.upscale();
            }
            if (i_5 != -1) {
                RSMesh rsmesh_7 = RSMesh.decodeMesh(loader.meshIndex, i_5);
                if (rsmesh_7.version < 13) {
                    rsmesh_7.upscale();
                }
                RSMesh[] arr_8 = {rsmesh_6, rsmesh_7};
                rsmesh_6 = new RSMesh(arr_8, 2);
            }
            int i_9;
            short[] shorts_10;
            if (originalModelColors != null) {
                if (meshmodifier_2 != null && meshmodifier_2.modifiedColors != null) {
                    shorts_10 = meshmodifier_2.modifiedColors;
                } else {
                    shorts_10 = modifiedModelColors;
                }
                for (i_9 = 0; i_9 < originalModelColors.length; i_9++) {
                    rsmesh_6.recolor(originalModelColors[i_9], shorts_10[i_9]);
                }
            }
            if (originalTextureIds != null) {
                if (meshmodifier_2 != null && meshmodifier_2.modifiedTextures != null) {
                    shorts_10 = meshmodifier_2.modifiedTextures;
                } else {
                    shorts_10 = modifiedTextureIds;
                }
                for (i_9 = 0; i_9 < originalTextureIds.length; i_9++) {
                    rsmesh_6.retexture(originalTextureIds[i_9], shorts_10[i_9]);
                }
            }
            return rsmesh_6;
        }
    }

    void generateLend(ItemDefinitions itemdefinitions_1, ItemDefinitions itemdefinitions_2) {
        value = 0;
        modelId = itemdefinitions_1.modelId;
        modelZoom = itemdefinitions_1.modelZoom;
        modelRotationX = itemdefinitions_1.modelRotationX;
        modelRotationY = itemdefinitions_1.modelRotationY;
        modelRotationZ = itemdefinitions_1.modelRotationZ;
        modelOffsetX = itemdefinitions_1.modelOffsetX;
        modelOffsetY = itemdefinitions_1.modelOffsetY;
        originalModelColors = itemdefinitions_2.originalModelColors;
        modifiedModelColors = itemdefinitions_2.modifiedModelColors;
        spriteRecolorIndices = itemdefinitions_2.spriteRecolorIndices;
        originalTextureIds = itemdefinitions_2.originalTextureIds;
        modifiedTextureIds = itemdefinitions_2.modifiedTextureIds;
        name = itemdefinitions_2.name;
        membersOnly = itemdefinitions_2.membersOnly;
        wearPos = itemdefinitions_2.wearPos;
        wearPos2 = itemdefinitions_2.wearPos2;
        wearPos3 = itemdefinitions_2.wearPos3;
        maleEquip1 = itemdefinitions_2.maleEquip1;
        maleEquip2 = itemdefinitions_2.maleEquip2;
        maleEquip3 = itemdefinitions_2.maleEquip3;
        femaleEquip1 = itemdefinitions_2.femaleEquip1;
        femaleEquip2 = itemdefinitions_2.femaleEquip2;
        femaleEquip3 = itemdefinitions_2.femaleEquip3;
        maleWearXOffset = itemdefinitions_2.maleWearXOffset;
        femaleWearXOffset = itemdefinitions_2.femaleWearXOffset;
        maleWearYOffset = itemdefinitions_2.maleWearYOffset;
        femaleWearYOffset = itemdefinitions_2.femaleWearYOffset;
        maleWearZOffset = itemdefinitions_2.maleWearZOffset;
        femaleWearZOffset = itemdefinitions_2.femaleWearZOffset;
        maleHead1 = itemdefinitions_2.maleHead1;
        maleHead2 = itemdefinitions_2.maleHead2;
        femaleHead1 = itemdefinitions_2.femaleHead1;
        femaleHead2 = itemdefinitions_2.femaleHead2;
        teamId = itemdefinitions_2.teamId;
        groundOptions = itemdefinitions_2.groundOptions;
        cs2Map = itemdefinitions_2.cs2Map;
        inventoryOptions = new String[5];
        if (itemdefinitions_2.inventoryOptions != null) {
            System.arraycopy(itemdefinitions_2.inventoryOptions, 0, inventoryOptions, 0, 4);
        }
        inventoryOptions[4] = LocalizedText.DISCARD.translate(loader.language);
    }
}
