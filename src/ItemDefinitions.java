public class ItemDefinitions implements Definition {

    ItemIndexLoader loader;
    int id;
    public static short[] staticColorArr256 = new short[256];
    public int value = 1;
    int modelId;
    public int modelZoom = 2000;
    public int modelRotationX = 0;
    public int modelRotationY = 0;
    public int modelRotationZ = 0;
    public int modelOffsetX = 0;
    public int modelOffsetY = 0;
    short[] originalModelColors;
    short[] modifiedModelColors;
    byte[] spriteRecolorIndices;
    short[] originalTextureIds;
    short[] modifiedTextureIds;
    public String name = "null";
    public boolean membersOnly = false;
    public int wearPos = -1;
    public int wearPos2 = -1;
    public int wearPos3 = -1;
    int maleEquip1 = -1;
    int maleEquip2 = -1;
    int maleEquip3 = -1;
    int femaleEquip1 = -1;
    int femaleEquip2 = -1;
    int femaleEquip3 = -1;
    int maleWearXOffset = 0;
    int femaleWearXOffset = 0;
    int maleWearYOffset = 0;
    int femaleWearYOffset = 0;
    int maleWearZOffset = 0;
    int femaleWearZOffset = 0;
    int maleHead1 = -1;
    int maleHead2 = -1;
    int femaleHead1 = -1;
    int femaleHead2 = -1;
    public int teamId = 0;
    public String[] groundOptions;
    IterableNodeMap cs2Map;
    public int stackable = 0;
    public String[] inventoryOptions;
    public int multiStackSize = -1;
    public int tooltipColor;
    public boolean hasTooltipColor = false;
    public boolean grandExchange = false;
    public int unknownInt6 = 0;
    public int certId = -1;
    public int certTemplateId = -1;
    int resizeX = 128;
    int[] stackIds;
    int[] stackAmounts;
    int resizeY = 128;
    int resizeZ = 128;
    int ambient = 0;
    int contrast = 0;
    int lendId = -1;
    public int lendTemplateId = -1;
    public int unknownInt18 = -1;
    public int unknownInt19 = -1;
    public int unknownInt20 = -1;
    public int unknownInt21 = -1;
    public int unknownInt22 = -1;
    public int unknownInt23 = -1;
    public int unknownInt27 = -1;
    public int unknownInt28 = -1;
    public int[] quests;
    public int pickSizeShift = 0;
    int bindId = -1;
    public int bindTemplateId = -1;

    public final MeshRasterizer method7084(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, PlayerAppearance playerappearance_4, Animation animation_5, int i_6, int i_7, int i_8, int i_9) {
        int i_11;
        if (this.stackIds != null && i_3 > 1) {
            i_11 = -1;
            for (int i_12 = 0; i_12 < 10; i_12++) {
                if (i_3 >= this.stackAmounts[i_12] && this.stackAmounts[i_12] != 0) {
                    i_11 = this.stackIds[i_12];
                }
            }
            if (i_11 != -1) {
                return this.loader.getItemDefinitions(i_11).method7084(graphicalrenderer_1, i_2, 1, playerappearance_4, animation_5, i_6, i_7, i_8, i_9);
            }
        }
        i_11 = i_2;
        if (animation_5 != null) {
            i_11 = i_2 | animation_5.method7640(-1206237088);
        }
        SoftCache softcache_13 = this.loader.aClass229_5115;
        MeshRasterizer meshrasterizer_17;
        synchronized (this.loader.aClass229_5115) {
            meshrasterizer_17 = (MeshRasterizer) this.loader.aClass229_5115.get((long) (this.id | graphicalrenderer_1.rendererId << 29));
        }
        if (meshrasterizer_17 == null || graphicalrenderer_1.method8452(meshrasterizer_17.m(), i_11) != 0) {
            if (meshrasterizer_17 != null) {
                i_11 = graphicalrenderer_1.method8546(i_11, meshrasterizer_17.m());
            }
            int i_18 = i_11;
            if (this.originalTextureIds != null) {
                i_18 = i_11 | 0x8000;
            }
            if (this.originalModelColors != null || playerappearance_4 != null) {
                i_18 |= 0x4000;
            }
            if (this.resizeX != 128) {
                i_18 |= 0x1;
            }
            if (this.resizeX != 128) {
                i_18 |= 0x2;
            }
            if (this.resizeX != 128) {
                i_18 |= 0x4;
            }
            RSMesh rsmesh_14 = RSMesh.decodeMesh(this.loader.meshIndex, this.modelId);
            if (rsmesh_14 == null) {
                return null;
            }
            if (rsmesh_14.version < 13) {
                rsmesh_14.upscale();
            }
            meshrasterizer_17 = graphicalrenderer_1.createMeshRasterizer(rsmesh_14, i_18, this.loader.anInt5116, this.ambient + 64, this.contrast * 5 + 850);
            if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
                meshrasterizer_17.oa(this.resizeX, this.resizeY, this.resizeZ);
            }
            int i_15;
            if (this.originalModelColors != null) {
                for (i_15 = 0; i_15 < this.originalModelColors.length; i_15++) {
                    if (this.spriteRecolorIndices != null && i_15 < this.spriteRecolorIndices.length) {
                        meshrasterizer_17.X(this.originalModelColors[i_15], staticColorArr256[this.spriteRecolorIndices[i_15] & 0xff]);
                    } else {
                        meshrasterizer_17.X(this.originalModelColors[i_15], this.modifiedModelColors[i_15]);
                    }
                }
            }
            if (this.originalTextureIds != null) {
                for (i_15 = 0; i_15 < this.originalTextureIds.length; i_15++) {
                    meshrasterizer_17.W(this.originalTextureIds[i_15], this.modifiedTextureIds[i_15]);
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
            SoftCache softcache_19 = this.loader.aClass229_5115;
            synchronized (this.loader.aClass229_5115) {
                this.loader.aClass229_5115.put(meshrasterizer_17, (long) (this.id | graphicalrenderer_1.rendererId << 29));
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

    void decode(RsByteBuffer rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            this.decode(rsbytebuffer_1, i_3);
        }
    }

    void generateBind(ItemDefinitions itemdefinitions_1, ItemDefinitions itemdefinitions_2) {
        this.value = 0;
        this.modelId = itemdefinitions_1.modelId;
        this.modelZoom = itemdefinitions_1.modelZoom;
        this.modelRotationX = itemdefinitions_1.modelRotationX;
        this.modelRotationY = itemdefinitions_1.modelRotationY;
        this.modelRotationZ = itemdefinitions_1.modelRotationZ;
        this.modelOffsetX = itemdefinitions_1.modelOffsetX;
        this.modelOffsetY = itemdefinitions_1.modelOffsetY;
        this.originalModelColors = itemdefinitions_2.originalModelColors;
        this.modifiedModelColors = itemdefinitions_2.modifiedModelColors;
        this.spriteRecolorIndices = itemdefinitions_2.spriteRecolorIndices;
        this.originalTextureIds = itemdefinitions_2.originalTextureIds;
        this.modifiedTextureIds = itemdefinitions_2.modifiedTextureIds;
        this.name = itemdefinitions_2.name;
        this.membersOnly = itemdefinitions_2.membersOnly;
        this.wearPos = itemdefinitions_2.wearPos;
        this.wearPos2 = itemdefinitions_2.wearPos2;
        this.wearPos3 = itemdefinitions_2.wearPos3;
        this.maleEquip1 = itemdefinitions_2.maleEquip1;
        this.maleEquip2 = itemdefinitions_2.maleEquip2;
        this.maleEquip3 = itemdefinitions_2.maleEquip3;
        this.femaleEquip1 = itemdefinitions_2.femaleEquip1;
        this.femaleEquip2 = itemdefinitions_2.femaleEquip2;
        this.femaleEquip3 = itemdefinitions_2.femaleEquip3;
        this.maleWearXOffset = itemdefinitions_2.maleWearXOffset;
        this.femaleWearXOffset = itemdefinitions_2.femaleWearXOffset;
        this.maleWearYOffset = itemdefinitions_2.maleWearYOffset;
        this.femaleWearYOffset = itemdefinitions_2.femaleWearYOffset;
        this.maleWearZOffset = itemdefinitions_2.maleWearZOffset;
        this.femaleWearZOffset = itemdefinitions_2.femaleWearZOffset;
        this.maleHead1 = itemdefinitions_2.maleHead1;
        this.maleHead2 = itemdefinitions_2.maleHead2;
        this.femaleHead1 = itemdefinitions_2.femaleHead1;
        this.femaleHead2 = itemdefinitions_2.femaleHead2;
        this.teamId = itemdefinitions_2.teamId;
        this.groundOptions = itemdefinitions_2.groundOptions;
        this.cs2Map = itemdefinitions_2.cs2Map;
        this.stackable = itemdefinitions_2.stackable;
        this.inventoryOptions = new String[5];
        if (itemdefinitions_2.inventoryOptions != null) {
            for (int i_4 = 0; i_4 < 4; i_4++) {
                this.inventoryOptions[i_4] = itemdefinitions_2.inventoryOptions[i_4];
            }
        }
        this.inventoryOptions[4] = Message.DISCARD_2.translate(this.loader.language);
    }

    void generateCert(ItemDefinitions itemdefinitions_1, ItemDefinitions itemdefinitions_2) {
        this.modelId = itemdefinitions_1.modelId;
        this.modelZoom = itemdefinitions_1.modelZoom;
        this.modelRotationX = itemdefinitions_1.modelRotationX;
        this.modelRotationY = itemdefinitions_1.modelRotationY;
        this.modelRotationZ = itemdefinitions_1.modelRotationZ;
        this.modelOffsetX = itemdefinitions_1.modelOffsetX;
        this.modelOffsetY = itemdefinitions_1.modelOffsetY;
        this.originalModelColors = itemdefinitions_1.originalModelColors;
        this.modifiedModelColors = itemdefinitions_1.modifiedModelColors;
        this.spriteRecolorIndices = itemdefinitions_1.spriteRecolorIndices;
        this.originalTextureIds = itemdefinitions_1.originalTextureIds;
        this.modifiedTextureIds = itemdefinitions_1.modifiedTextureIds;
        this.name = itemdefinitions_2.name;
        this.membersOnly = itemdefinitions_2.membersOnly;
        this.value = itemdefinitions_2.value;
        this.stackable = 1;
    }

    void decode(RsByteBuffer stream, int opcode) {
        if (opcode == 1) {
            this.modelId = stream.readBigSmart();
        } else if (opcode == 2) {
            this.name = stream.readString();
        } else if (opcode == 4) {
            this.modelZoom = stream.readUnsignedShort();
        } else if (opcode == 5) {
            this.modelRotationX = stream.readUnsignedShort();
        } else if (opcode == 6) {
            this.modelRotationY = stream.readUnsignedShort();
        } else if (opcode == 7) {
            this.modelOffsetX = stream.readUnsignedShort();
            if (this.modelOffsetX > 32767) {
                this.modelOffsetX -= 65536;
            }
        } else if (opcode == 8) {
            this.modelOffsetY = stream.readUnsignedShort();
            if (this.modelOffsetY > 32767) {
                this.modelOffsetY -= 65536;
            }
        } else if (opcode == 11) {
            this.stackable = 1;
        } else if (opcode == 12) {
            this.value = stream.readInt();
        } else if (opcode == 13) {
            this.wearPos = stream.readUnsignedByte();
        } else if (opcode == 14) {
            this.wearPos2 = stream.readUnsignedByte();
        } else if (opcode == 16) {
            this.membersOnly = true;
        } else if (opcode == 18) {
            this.multiStackSize = stream.readUnsignedShort();
        } else if (opcode == 23) {
            this.maleEquip1 = stream.readBigSmart();
        } else if (opcode == 24) {
            this.maleEquip2 = stream.readBigSmart();
        } else if (opcode == 25) {
            this.femaleEquip1 = stream.readBigSmart();
        } else if (opcode == 26) {
            this.femaleEquip2 = stream.readBigSmart();
        } else if (opcode == 27) {
            this.wearPos3 = stream.readUnsignedByte();
        } else if (opcode >= 30 && opcode < 35) {
            this.groundOptions[opcode - 30] = stream.readString();
        } else if (opcode >= 35 && opcode < 40) {
            this.inventoryOptions[opcode - 35] = stream.readString();
        } else {
            int i_4;
            int i_5;
            if (opcode == 40) {
                i_4 = stream.readUnsignedByte();
                this.originalModelColors = new short[i_4];
                this.modifiedModelColors = new short[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.originalModelColors[i_5] = (short) stream.readUnsignedShort();
                    this.modifiedModelColors[i_5] = (short) stream.readUnsignedShort();
                }
            } else if (opcode == 41) {
                i_4 = stream.readUnsignedByte();
                this.originalTextureIds = new short[i_4];
                this.modifiedTextureIds = new short[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.originalTextureIds[i_5] = (short) stream.readUnsignedShort();
                    this.modifiedTextureIds[i_5] = (short) stream.readUnsignedShort();
                }
            } else if (opcode == 42) {
                i_4 = stream.readUnsignedByte();
                this.spriteRecolorIndices = new byte[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.spriteRecolorIndices[i_5] = stream.readByte();
                }
            } else if (opcode == 43) {
                this.tooltipColor = stream.readInt();
                this.hasTooltipColor = true;
            } else if (opcode == 65) {
                this.grandExchange = true;
            } else if (opcode == 78) {
                this.maleEquip3 = stream.readBigSmart();
            } else if (opcode == 79) {
                this.femaleEquip3 = stream.readBigSmart();
            } else if (opcode == 90) {
                this.maleHead1 = stream.readBigSmart();
            } else if (opcode == 91) {
                this.femaleHead1 = stream.readBigSmart();
            } else if (opcode == 92) {
                this.maleHead2 = stream.readBigSmart();
            } else if (opcode == 93) {
                this.femaleHead2 = stream.readBigSmart();
            } else if (opcode == 95) {
                this.modelRotationZ = stream.readUnsignedShort();
            } else if (opcode == 96) {
                this.unknownInt6 = stream.readUnsignedByte();
            } else if (opcode == 97) {
                this.certId = stream.readUnsignedShort();
            } else if (opcode == 98) {
                this.certTemplateId = stream.readUnsignedShort();
            } else if (opcode >= 100 && opcode < 110) {
                if (this.stackIds == null) {
                    this.stackIds = new int[10];
                    this.stackAmounts = new int[10];
                }
                this.stackIds[opcode - 100] = stream.readUnsignedShort();
                this.stackAmounts[opcode - 100] = stream.readUnsignedShort();
            } else if (opcode == 110) {
                this.resizeX = stream.readUnsignedShort();
            } else if (opcode == 111) {
                this.resizeY = stream.readUnsignedShort();
            } else if (opcode == 112) {
                this.resizeZ = stream.readUnsignedShort();
            } else if (opcode == 113) {
                this.ambient = stream.readByte();
            } else if (opcode == 114) {
                this.contrast = stream.readByte();
            } else if (opcode == 115) {
                this.teamId = stream.readUnsignedByte();
            } else if (opcode == 121) {
                this.lendId = stream.readUnsignedShort();
            } else if (opcode == 122) {
                this.lendTemplateId = stream.readUnsignedShort();
            } else if (opcode == 125) {
                this.maleWearXOffset = stream.readByte() << 2;
                this.maleWearYOffset = stream.readByte() << 2;
                this.maleWearZOffset = stream.readByte() << 2;
            } else if (opcode == 126) {
                this.femaleWearXOffset = stream.readByte() << 2;
                this.femaleWearYOffset = stream.readByte() << 2;
                this.femaleWearZOffset = stream.readByte() << 2;
            } else if (opcode == 127) {
                this.unknownInt18 = stream.readUnsignedByte();
                this.unknownInt19 = stream.readUnsignedShort();
            } else if (opcode == 128) {
                this.unknownInt20 = stream.readUnsignedByte();
                this.unknownInt21 = stream.readUnsignedShort();
            } else if (opcode == 129) {
                this.unknownInt22 = stream.readUnsignedByte();
                this.unknownInt23 = stream.readUnsignedShort();
            } else if (opcode == 130) {
                this.unknownInt27 = stream.readUnsignedByte();
                this.unknownInt28 = stream.readUnsignedShort();
            } else if (opcode == 132) {
                i_4 = stream.readUnsignedByte();
                this.quests = new int[i_4];
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.quests[i_5] = stream.readUnsignedShort();
                }
            } else if (opcode == 134) {
                this.pickSizeShift = stream.readUnsignedByte();
            } else if (opcode == 139) {
                this.bindId = stream.readUnsignedShort();
            } else if (opcode == 140) {
                this.bindTemplateId = stream.readUnsignedShort();
            } else if (opcode == 249) {
                i_4 = stream.readUnsignedByte();
                if (this.cs2Map == null) {
                    i_5 = Utils.nextPowerOfTwo(i_4);
                    this.cs2Map = new IterableNodeMap(i_5);
                }
                for (i_5 = 0; i_5 < i_4; i_5++) {
                    boolean bool_6 = stream.readUnsignedByte() == 1;
                    int i_7 = stream.read24BitUnsignedInteger();
                    Object obj_8;
                    if (bool_6) {
                        obj_8 = new StringNode(stream.readString());
                    } else {
                        obj_8 = new IntNode(stream.readInt());
                    }
                    this.cs2Map.put((Node) obj_8, (long) i_7);
                }
            }
        }
    }

    public ItemDefinitions method7090(int i_1) {
        if (this.stackIds != null && i_1 > 1) {
            int i_3 = -1;
            for (int i_4 = 0; i_4 < 10; i_4++) {
                if (i_1 >= this.stackAmounts[i_4] && this.stackAmounts[i_4] != 0) {
                    i_3 = this.stackIds[i_4];
                }
            }
            if (i_3 != -1) {
                return this.loader.getItemDefinitions(i_3);
            }
        }
        return this;
    }

    int[] getSprite(GraphicalRenderer hardwareRenderer, GraphicalRenderer softwareRenderer, int amount, int outlineSize, int shadowColor, boolean zoomedIn, int renderAmounts, FontRenderer fontRenderer, PlayerAppearance playerAppearance, short s_10) {
        RSMesh inventoryMesh = RSMesh.decodeMesh(this.loader.meshIndex, this.modelId);
        if (inventoryMesh == null) {
            return null;
        } else {
            if (inventoryMesh.version < 13) {
                inventoryMesh.upscale();
            }
            int i;
            if (this.originalModelColors != null) {
                for (i = 0; i < this.originalModelColors.length; i++) {
                    if (this.spriteRecolorIndices != null && i < this.spriteRecolorIndices.length) {
                        inventoryMesh.recolor(this.originalModelColors[i], staticColorArr256[this.spriteRecolorIndices[i] & 0xff]);
                    } else {
                        inventoryMesh.recolor(this.originalModelColors[i], this.modifiedModelColors[i]);
                    }
                }
            }
            if (this.originalTextureIds != null) {
                for (i = 0; i < this.originalTextureIds.length; i++) {
                    inventoryMesh.retexture(this.originalTextureIds[i], this.modifiedTextureIds[i]);
                }
            }
            if (playerAppearance != null) {
                for (i = 0; i < 10; i++) {
                    for (int i_13 = 0; i_13 < AbstractQueue_Sub1.SKIN_COLORS[i].length; i_13++) {
                        if (playerAppearance.colors[i] < Class366.SKIN_COLORS[i][i_13].length) {
                            inventoryMesh.recolor(AbstractQueue_Sub1.SKIN_COLORS[i][i_13], Class366.SKIN_COLORS[i][i_13][playerAppearance.colors[i]]);
                        }
                    }
                }
            }
            i = 2048;
            boolean needsResize = false;
            if (this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
                needsResize = true;
                i |= 0x7;
            }
            MeshRasterizer meshRasterizer = hardwareRenderer.createMeshRasterizer(inventoryMesh, i, 64, this.ambient + 64, this.contrast * 5 + 768);
            if (!meshRasterizer.successful()) {
                return null;
            } else {
                if (needsResize) {
                    meshRasterizer.oa(this.resizeX, this.resizeY, this.resizeZ);
                }
                NativeSprite sprite = null;
                if (this.certTemplateId != -1) {
                    sprite = this.loader.getSprite(hardwareRenderer, softwareRenderer, this.certId, 10, 1, 0, true, true, 0, fontRenderer, playerAppearance, (byte) -12);
                    if (sprite == null) {
                        return null;
                    }
                } else if (this.lendTemplateId != -1) {
                    sprite = this.loader.getSprite(hardwareRenderer, softwareRenderer, this.lendId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, playerAppearance, (byte) 63);
                    if (sprite == null) {
                        return null;
                    }
                } else if (this.bindTemplateId != -1) {
                    sprite = this.loader.getSprite(hardwareRenderer, softwareRenderer, this.bindId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, playerAppearance, (byte) 12);
                    if (sprite == null) {
                        return null;
                    }
                }
                int zoom;
                if (zoomedIn) {
                    zoom = (int) (1.5D * (double) this.modelZoom) << 2;
                } else if (outlineSize == 2) {
                    zoom = (int) ((double) this.modelZoom * 1.04D) << 2;
                } else {
                    zoom = this.modelZoom << 2;
                }
                Matrix44Arr matrix44arr_17 = hardwareRenderer.method8453();
                Matrix44Arr matrix44arr_18 = hardwareRenderer.method8449();
                matrix44arr_18.method6531(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) hardwareRenderer.method8523((byte) 121).method2714(), (float) hardwareRenderer.method8523((byte) 111).method2716());
                hardwareRenderer.method8424(matrix44arr_18);
                hardwareRenderer.method8617(0, 0, hardwareRenderer.method8523((byte) 122).method2714(), hardwareRenderer.method8523((byte) 122).method2716());
                Matrix44Var matrix44var_19 = new Matrix44Var();
                hardwareRenderer.method8457(matrix44var_19);
                hardwareRenderer.IA(0.95F + (float) (Math.random() / 10.0D));
                hardwareRenderer.m(16777215, 0.95F + (float) (Math.random() / 10.0D), 0.95F + (float) (Math.random() / 10.0D), -50.0F, -10.0F, -50.0F);
                Matrix44Var matrix44var_20 = hardwareRenderer.method8450();
                matrix44var_20.method5217(0.0F, 0.0F, 1.0F, Class382.method6508(-this.modelRotationZ << 3));
                matrix44var_20.rotation(0.0F, 1.0F, 0.0F, Class382.method6508(this.modelRotationY << 3));
                matrix44var_20.method5219((float) (this.modelOffsetX << 2), (float) ((zoom * Class382.SINE[this.modelRotationX << 3] >> 14) - meshRasterizer.YA() / 2 + (this.modelOffsetY << 2)), (float) ((zoom * Class382.COSINE[this.modelRotationX << 3] >> 14) + (this.modelOffsetY << 2)));
                matrix44var_20.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(this.modelRotationX << 3));
                hardwareRenderer.r(0, 0, 36, 32);
                hardwareRenderer.ba(2, 0);
                hardwareRenderer.B(0, 0, 36, 32, 0, 0);
                hardwareRenderer.c(0, -1, 0);
                meshRasterizer.method11282(matrix44var_20, (EntityNode_Sub5) null, 1);
                hardwareRenderer.method8424(matrix44arr_17);
                int[] ints_21 = hardwareRenderer.ab(0, 0, 36, 32);
                if (outlineSize >= 1) {
                    ints_21 = addOutlines(ints_21, -16777214, (byte) -98);
                    if (outlineSize >= 2) {
                        ints_21 = addOutlines(ints_21, -1, (byte) -71);
                    }
                }
                if (shadowColor != 0) {
                    this.addShadow(ints_21, shadowColor);
                }
                if (this.lendTemplateId != -1) {
                    sprite.method2752(0, 0);
                } else if (this.bindTemplateId != -1) {
                    sprite.method2752(0, 0);
                }
                hardwareRenderer.createNativeSprite(ints_21, 36, 36, 32, 1982525260).method2752(0, 0);
                if (this.certTemplateId != -1) {
                    sprite.method2752(0, 0);
                }
                if (renderAmounts == 1 || renderAmounts == 2 && (this.stackable == 1 || amount != 1) && amount != -1) {
                    fontRenderer.renderText(Class304.method5407(amount, this.loader.language), 0, 9, -256, -16777215);
                }
                ints_21 = hardwareRenderer.ab(0, 0, 36, 32);
                for (int i_22 = 0; i_22 < ints_21.length; i_22++) {
                    if ((ints_21[i_22] & 0xffffff) == 0) {
                        ints_21[i_22] = 0;
                    } else {
                        ints_21[i_22] |= ~0xffffff;
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

    public final boolean bodyMeshesReady(boolean bool_1, MeshModifier meshmodifier_2, int i_3) {
        int i_4;
        int i_5;
        int i_6;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleBody != null) {
                i_4 = meshmodifier_2.femaleBody[0];
                i_5 = meshmodifier_2.femaleBody[1];
                i_6 = meshmodifier_2.femaleBody[2];
            } else {
                i_4 = this.femaleEquip1;
                i_5 = this.femaleEquip2;
                i_6 = this.femaleEquip3;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleBody != null) {
            i_4 = meshmodifier_2.maleBody[0];
            i_5 = meshmodifier_2.maleBody[1];
            i_6 = meshmodifier_2.maleBody[2];
        } else {
            i_4 = this.maleEquip1;
            i_5 = this.maleEquip2;
            i_6 = this.maleEquip3;
        }
        if (i_4 == -1) {
            return true;
        } else {
            boolean bool_7 = true;
            if (!this.loader.meshIndex.load(i_4, 0)) {
                bool_7 = false;
            }
            if (i_5 != -1 && !this.loader.meshIndex.load(i_5, 0)) {
                bool_7 = false;
            }
            if (i_6 != -1 && !this.loader.meshIndex.load(i_6, 0)) {
                bool_7 = false;
            }
            return bool_7;
        }
    }

    public final RSMesh getBodyMesh(boolean bool_1, MeshModifier meshmodifier_2, int i_3) {
        int i_4;
        int i_5;
        int i_6;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleBody != null) {
                i_4 = meshmodifier_2.femaleBody[0];
                i_5 = meshmodifier_2.femaleBody[1];
                i_6 = meshmodifier_2.femaleBody[2];
            } else {
                i_4 = this.femaleEquip1;
                i_5 = this.femaleEquip2;
                i_6 = this.femaleEquip3;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleBody != null) {
            i_4 = meshmodifier_2.maleBody[0];
            i_5 = meshmodifier_2.maleBody[1];
            i_6 = meshmodifier_2.maleBody[2];
        } else {
            i_4 = this.maleEquip1;
            i_5 = this.maleEquip2;
            i_6 = this.maleEquip3;
        }
        if (i_4 == -1) {
            return null;
        } else {
            RSMesh rsmesh_7 = RSMesh.decodeMesh(this.loader.meshIndex, i_4);
            if (rsmesh_7 == null) {
                return null;
            } else {
                if (rsmesh_7.version < 13) {
                    rsmesh_7.upscale();
                }
                if (i_5 != -1) {
                    RSMesh rsmesh_8 = RSMesh.decodeMesh(this.loader.meshIndex, i_5);
                    if (rsmesh_8.version < 13) {
                        rsmesh_8.upscale();
                    }
                    if (i_6 != -1) {
                        RSMesh rsmesh_9 = RSMesh.decodeMesh(this.loader.meshIndex, i_6);
                        if (rsmesh_9.version < 13) {
                            rsmesh_9.upscale();
                        }
                        RSMesh[] arr_10 = new RSMesh[] { rsmesh_7, rsmesh_8, rsmesh_9 };
                        rsmesh_7 = new RSMesh(arr_10, 3);
                    } else {
                        RSMesh[] arr_13 = new RSMesh[] { rsmesh_7, rsmesh_8 };
                        rsmesh_7 = new RSMesh(arr_13, 2);
                    }
                }
                if (!bool_1 && (this.maleWearXOffset != 0 || this.maleWearYOffset != 0 || this.maleWearZOffset != 0)) {
                    rsmesh_7.translate(this.maleWearXOffset, this.maleWearYOffset, this.maleWearZOffset);
                }
                if (bool_1 && (this.femaleWearXOffset != 0 || this.femaleWearYOffset != 0 || this.femaleWearZOffset != 0)) {
                    rsmesh_7.translate(this.femaleWearXOffset, this.femaleWearYOffset, this.femaleWearZOffset);
                }
                int i_11;
                short[] shorts_12;
                if (this.originalModelColors != null) {
                    if (meshmodifier_2 != null && meshmodifier_2.modifiedColors != null) {
                        shorts_12 = meshmodifier_2.modifiedColors;
                    } else {
                        shorts_12 = this.modifiedModelColors;
                    }
                    for (i_11 = 0; i_11 < this.originalModelColors.length; i_11++) {
                        rsmesh_7.recolor(this.originalModelColors[i_11], shorts_12[i_11]);
                    }
                }
                if (this.originalTextureIds != null) {
                    if (meshmodifier_2 != null && meshmodifier_2.modifiedTextures != null) {
                        shorts_12 = meshmodifier_2.modifiedTextures;
                    } else {
                        shorts_12 = this.modifiedTextureIds;
                    }
                    for (i_11 = 0; i_11 < this.originalTextureIds.length; i_11++) {
                        rsmesh_7.retexture(this.originalTextureIds[i_11], shorts_12[i_11]);
                    }
                }
                return rsmesh_7;
            }
        }
    }

    public final boolean headMeshesReady(boolean bool_1, MeshModifier meshmodifier_2) {
        int i_4;
        int i_5;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleHeads != null) {
                i_4 = meshmodifier_2.femaleHeads[0];
                i_5 = meshmodifier_2.femaleHeads[1];
            } else {
                i_4 = this.femaleHead1;
                i_5 = this.femaleHead2;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleHeads != null) {
            i_4 = meshmodifier_2.maleHeads[0];
            i_5 = meshmodifier_2.maleHeads[1];
        } else {
            i_4 = this.maleHead1;
            i_5 = this.maleHead2;
        }
        if (i_4 == -1) {
            return true;
        } else {
            boolean bool_6 = true;
            if (!this.loader.meshIndex.load(i_4, 0)) {
                bool_6 = false;
            }
            if (i_5 != -1 && !this.loader.meshIndex.load(i_5, 0)) {
                bool_6 = false;
            }
            return bool_6;
        }
    }

    public int getCS2Integer(int i_1, int i_2) {
        if (this.cs2Map == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) this.cs2Map.get((long) i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    public String getCS2String(int key, String defaultValue) {
        if (this.cs2Map == null) {
            return defaultValue;
        } else {
            StringNode class282_sub47_4 = (StringNode) this.cs2Map.get((long) key);
            return class282_sub47_4 == null ? defaultValue : (String) class282_sub47_4.anObject8068;
        }
    }

    static int[] addOutlines(int[] ints_0, int i_1, byte b_2) {
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

    public final RSMesh getHeadMesh(boolean bool_1, MeshModifier meshmodifier_2) {
        int i_4;
        int i_5;
        if (bool_1) {
            if (meshmodifier_2 != null && meshmodifier_2.femaleHeads != null) {
                i_4 = meshmodifier_2.femaleHeads[0];
                i_5 = meshmodifier_2.femaleHeads[1];
            } else {
                i_4 = this.femaleHead1;
                i_5 = this.femaleHead2;
            }
        } else if (meshmodifier_2 != null && meshmodifier_2.maleHeads != null) {
            i_4 = meshmodifier_2.maleHeads[0];
            i_5 = meshmodifier_2.maleHeads[1];
        } else {
            i_4 = this.maleHead1;
            i_5 = this.maleHead2;
        }
        if (i_4 == -1) {
            return null;
        } else {
            RSMesh rsmesh_6 = RSMesh.decodeMesh(this.loader.meshIndex, i_4);
            if (rsmesh_6.version < 13) {
                rsmesh_6.upscale();
            }
            if (i_5 != -1) {
                RSMesh rsmesh_7 = RSMesh.decodeMesh(this.loader.meshIndex, i_5);
                if (rsmesh_7.version < 13) {
                    rsmesh_7.upscale();
                }
                RSMesh[] arr_8 = new RSMesh[] { rsmesh_6, rsmesh_7 };
                rsmesh_6 = new RSMesh(arr_8, 2);
            }
            int i_9;
            short[] shorts_10;
            if (this.originalModelColors != null) {
                if (meshmodifier_2 != null && meshmodifier_2.modifiedColors != null) {
                    shorts_10 = meshmodifier_2.modifiedColors;
                } else {
                    shorts_10 = this.modifiedModelColors;
                }
                for (i_9 = 0; i_9 < this.originalModelColors.length; i_9++) {
                    rsmesh_6.recolor(this.originalModelColors[i_9], shorts_10[i_9]);
                }
            }
            if (this.originalTextureIds != null) {
                if (meshmodifier_2 != null && meshmodifier_2.modifiedTextures != null) {
                    shorts_10 = meshmodifier_2.modifiedTextures;
                } else {
                    shorts_10 = this.modifiedTextureIds;
                }
                for (i_9 = 0; i_9 < this.originalTextureIds.length; i_9++) {
                    rsmesh_6.retexture(this.originalTextureIds[i_9], shorts_10[i_9]);
                }
            }
            return rsmesh_6;
        }
    }

    void generateLend(ItemDefinitions itemdefinitions_1, ItemDefinitions itemdefinitions_2) {
        this.value = 0;
        this.modelId = itemdefinitions_1.modelId;
        this.modelZoom = itemdefinitions_1.modelZoom;
        this.modelRotationX = itemdefinitions_1.modelRotationX;
        this.modelRotationY = itemdefinitions_1.modelRotationY;
        this.modelRotationZ = itemdefinitions_1.modelRotationZ;
        this.modelOffsetX = itemdefinitions_1.modelOffsetX;
        this.modelOffsetY = itemdefinitions_1.modelOffsetY;
        this.originalModelColors = itemdefinitions_2.originalModelColors;
        this.modifiedModelColors = itemdefinitions_2.modifiedModelColors;
        this.spriteRecolorIndices = itemdefinitions_2.spriteRecolorIndices;
        this.originalTextureIds = itemdefinitions_2.originalTextureIds;
        this.modifiedTextureIds = itemdefinitions_2.modifiedTextureIds;
        this.name = itemdefinitions_2.name;
        this.membersOnly = itemdefinitions_2.membersOnly;
        this.wearPos = itemdefinitions_2.wearPos;
        this.wearPos2 = itemdefinitions_2.wearPos2;
        this.wearPos3 = itemdefinitions_2.wearPos3;
        this.maleEquip1 = itemdefinitions_2.maleEquip1;
        this.maleEquip2 = itemdefinitions_2.maleEquip2;
        this.maleEquip3 = itemdefinitions_2.maleEquip3;
        this.femaleEquip1 = itemdefinitions_2.femaleEquip1;
        this.femaleEquip2 = itemdefinitions_2.femaleEquip2;
        this.femaleEquip3 = itemdefinitions_2.femaleEquip3;
        this.maleWearXOffset = itemdefinitions_2.maleWearXOffset;
        this.femaleWearXOffset = itemdefinitions_2.femaleWearXOffset;
        this.maleWearYOffset = itemdefinitions_2.maleWearYOffset;
        this.femaleWearYOffset = itemdefinitions_2.femaleWearYOffset;
        this.maleWearZOffset = itemdefinitions_2.maleWearZOffset;
        this.femaleWearZOffset = itemdefinitions_2.femaleWearZOffset;
        this.maleHead1 = itemdefinitions_2.maleHead1;
        this.maleHead2 = itemdefinitions_2.maleHead2;
        this.femaleHead1 = itemdefinitions_2.femaleHead1;
        this.femaleHead2 = itemdefinitions_2.femaleHead2;
        this.teamId = itemdefinitions_2.teamId;
        this.groundOptions = itemdefinitions_2.groundOptions;
        this.cs2Map = itemdefinitions_2.cs2Map;
        this.inventoryOptions = new String[5];
        if (itemdefinitions_2.inventoryOptions != null) {
            for (int i_4 = 0; i_4 < 4; i_4++) {
                this.inventoryOptions[i_4] = itemdefinitions_2.inventoryOptions[i_4];
            }
        }
        this.inventoryOptions[4] = Message.DISCARD.translate(this.loader.language);
    }

    static final void method7140(Entity animable_0, Entity animable_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_10 = animable_1.method15899(-525246876);
        if (i_10 != -1) {
            NativeSprite nativesprite_11 = (NativeSprite) client.aClass229_7204.get((long) i_10);
            if (nativesprite_11 == null) {
                SpriteDefinitions[] arr_12 = SpriteDefinitions.method1514(IndexLoaders.SPRITES_INDEX, i_10);
                if (arr_12 == null) {
                    return;
                }
                nativesprite_11 = Renderers.SOFTWARE_RENDERER.method8444(arr_12[0], true);
                client.aClass229_7204.put(nativesprite_11, (long) i_10);
            }
            Vector3 vector3_16 = animable_0.method11166().aClass385_3595;
            HitsplatIndexLoader.method3612(animable_0.plane, (int) vector3_16.x, (int) vector3_16.z, animable_0.getSize() * 256, 0, false, (byte) 2);
            int i_13 = (int) ((float) i_3 + client.aFloatArray7292[0] - 18.0F);
            int i_14 = (int) ((float) i_4 + client.aFloatArray7292[1] - 16.0F - 54.0F);
            i_13 += i_2 / 4 * 18;
            i_14 += i_2 % 4 * 18;
            nativesprite_11.method2752(i_13, i_14);
            if (animable_1 == animable_0) {
                Renderers.SOFTWARE_RENDERER.method8562(i_13 - 1, i_14 - 1, 18, 18, -256);
            }
            EntityNode_Sub2 class275_sub2_15 = PlayerVarProvider.method286();
            class275_sub2_15.aTransform_Sub1_Sub1_Sub2_7739 = animable_1;
            class275_sub2_15.anInt7742 = i_13;
            class275_sub2_15.anInt7743 = i_14;
            class275_sub2_15.anInt7744 = i_13 + 16;
            class275_sub2_15.anInt7740 = i_14 + 16;
            client.aClass457_7290.offer(class275_sub2_15, 1174204485);
        }
    }

    public static void method7141(byte b_1) {
        Class329.method5906();
    }
}
