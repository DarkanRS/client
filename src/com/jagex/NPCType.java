package com.jagex;

public class NPCType {

    public static short[] aShortArray4862 = new short[256];
    public int type;
    public String[] options;
    public int[] modelIds;
    public byte aByte4916;
    public String name = "null";
    public int size = 1;
    public int renderEmote = -1;
    public int anInt4873 = -1;
    public int anInt4861 = -1;
    public int anInt4875 = -1;
    public int anInt4854 = -1;
    public int anInt4877 = -1;
    public boolean isVisibleOnMap = true;
    public int combatLevel = -1;
    public boolean aBool4904;
    public boolean aBool4890;
    public boolean aBool4884;
    public int headIcons = -1;
    public int anInt4918 = -1;
    public int contrast = 32;
    public boolean visible = true;
    public boolean aBool4894 = true;
    public boolean aBool4912 = true;
    public short aShort4874;
    public short aShort4897;
    public byte aByte4883 = -96;
    public byte aByte4899 = -16;
    public byte walkMask;
    public int walkingAnimation = -1;
    public int rotate180Animation = -1;
    public int rotate90RightAnimation = -1;
    public int rotate90LeftAnimation = -1;
    public int specialByte;
    public int anInt4908;
    public int anInt4909 = 255;
    public int anInt4902 = -1;
    public NPCDirection respawnDirection;
    public int anInt4914;
    public int anInt4917;
    public int anInt4911;
    public int anInt4919;
    public int anInt4913;
    public boolean aBool4920;
    public short[] modifiedColors;
    public short[] modifiedTextures;
    public int[] headModels;
    public int[] transformTo;
    public int[] quests;
    public boolean aBool4872;
    NPCIndexLoader npcLoader;
    byte aByte4871;
    int anInt4880 = 128;
    int anInt4881 = 128;
    int anInt4885;
    int anInt4888;
    int varpBit = -1;
    int varp = -1;
    short[] originalColors;
    short[] originalTextures;
    byte[] recolourPalette;
    int[][] modelTranslation;
    byte aByte4868;
    byte aByte4869;
    byte aByte4905;
    IterableNodeMap cs2Params;

    NPCType() {
        respawnDirection = NPCDirection.SOUTH;
        anInt4914 = -1;
        aByte4916 = -1;
        anInt4917 = -1;
        anInt4911 = 256;
        anInt4919 = 256;
        anInt4913 = 0;
        aBool4920 = true;
    }

    static void method6907() {
        IndexLoaders.MAP_REGION_DECODER.method4444();
        QuickchatFiller.method1139();
        Class356.method6227(true);
        Class247.method4250();
        System.gc();
        Renderers.SOFTWARE_RENDERER.ba(2, 0);
    }

    void method6874(Packet rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            decode(rsbytebuffer_1, i_3);
        }
    }

    public MeshRasterizer method6875(AbstractRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, VarProvider interface42_4, Animation animation_5, Animation animation_6, Animation[] arr_7, int[] ints_8, int i_9, NPCMeshModifier class417_10) {
        return renderFull(graphicalrenderer_1, i_2, renderanimindexloader_3, interface42_4, animation_5, animation_6, arr_7, ints_8, i_9, class417_10, renderEmote, true);
    }

    public int method6876(int i_1, int i_2) {
        if (cs2Params == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) cs2Params.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    void method6877() {
        if (modelIds == null) {
            modelIds = new int[0];
        }
        if (aByte4916 == -1) {
            if (npcLoader.aClass486_4844 == Game.darkan) {
                aByte4916 = 1;
            } else {
                aByte4916 = 0;
            }
        }
    }

    public MeshRasterizer renderFull(AbstractRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, VarProvider interface42_4, Animation animation_5, Animation animation_6, Animation[] arr_7, int[] ints_8, int i_9, NPCMeshModifier class417_10, int i_11, boolean bool_12) {
        if (transformTo != null) {
            NPCType npcdefinitions_14 = getMultiNPC(interface42_4);
            return npcdefinitions_14 == null ? null : npcdefinitions_14.renderFull(graphicalrenderer_1, i_2, renderanimindexloader_3, interface42_4, animation_5, animation_6, arr_7, ints_8, i_9, class417_10, i_11, bool_12);
        } else {
            int i_32 = i_2;
            if (anInt4881 != 128) {
                i_32 = i_2 | 0x2;
            }
            if (anInt4880 != 128) {
                i_32 |= 0x5;
            }
            boolean bool_15 = false;
            int i_16 = arr_7 != null ? arr_7.length : 0;
            for (int i_17 = 0; i_17 < i_16; i_17++) {
                if (arr_7[i_17] != null) {
                    i_32 |= arr_7[i_17].method7640();
                    bool_15 = true;
                }
            }
            if (animation_5 != null) {
                i_32 |= animation_5.method7640();
                bool_15 = true;
            }
            if (animation_6 != null) {
                i_32 |= animation_6.method7640();
                bool_15 = true;
            }
            long long_33 = type | graphicalrenderer_1.rendererId << 16;
            if (class417_10 != null) {
                long_33 |= class417_10.aLong4993 << 24;
            }
            LRUCache softcache_20 = npcLoader.aClass229_4836;
            MeshRasterizer meshrasterizer_19;
            synchronized (npcLoader.aClass229_4836) {
                meshrasterizer_19 = (MeshRasterizer) npcLoader.aClass229_4836.get(long_33);
            }
            BASDefinitions renderanimdefs_45 = null;
            if (!bool_12 && i_11 != -1) {
                renderanimdefs_45 = renderanimindexloader_3.getBASDefs(i_11);
            } else if (renderEmote != -1) {
                renderanimdefs_45 = renderanimindexloader_3.getBASDefs(renderEmote);
            }
            int i_25;
            if (meshrasterizer_19 == null || (meshrasterizer_19.m() & i_32) != i_32) {
                if (meshrasterizer_19 != null) {
                    i_32 |= meshrasterizer_19.m();
                }
                int i_21 = i_32;
                if (originalColors != null) {
                    i_21 = i_32 | 0x4000;
                }
                if (originalTextures != null) {
                    i_21 |= 0x8000;
                }
                if (aByte4871 != 0) {
                    i_21 |= 0x80000;
                }
                int[] ints_22 = class417_10 != null && class417_10.anIntArray4992 != null ? class417_10.anIntArray4992 : modelIds;
                boolean bool_23 = false;
                Index index_24 = npcLoader.aClass317_4842;
                synchronized (npcLoader.aClass317_4842) {
                    i_25 = 0;
                    while (i_25 < ints_22.length) {
                        if (ints_22[i_25] != -1 && !npcLoader.aClass317_4842.load(ints_22[i_25], 0)) {
                            bool_23 = true;
                        }
                        ++i_25;
                    }
                }
                if (bool_23) {
                    return null;
                }
                RSMesh[] arr_47 = new RSMesh[ints_22.length];
                for (i_25 = 0; i_25 < ints_22.length; i_25++) {
                    if (ints_22[i_25] != -1) {
                        Index index_26 = npcLoader.aClass317_4842;
                        synchronized (npcLoader.aClass317_4842) {
                            arr_47[i_25] = RSMesh.decodeMesh(npcLoader.aClass317_4842, ints_22[i_25]);
                        }
                        if (arr_47[i_25] != null) {
                            if (arr_47[i_25].version < 13) {
                                arr_47[i_25].upscale();
                            }
                            if (modelTranslation != null && modelTranslation[i_25] != null) {
                                arr_47[i_25].translate(modelTranslation[i_25][0], modelTranslation[i_25][1], modelTranslation[i_25][2]);
                            }
                        }
                    }
                }
                int i_27;
                if (renderanimdefs_45 != null && renderanimdefs_45.anIntArrayArray2802 != null) {
                    for (i_25 = 0; i_25 < renderanimdefs_45.anIntArrayArray2802.length; i_25++) {
                        if (i_25 < arr_47.length && arr_47[i_25] != null) {
                            int i_35 = 0;
                            i_27 = 0;
                            int i_28 = 0;
                            int i_29 = 0;
                            int i_30 = 0;
                            int i_31 = 0;
                            if (renderanimdefs_45.anIntArrayArray2802[i_25] != null) {
                                i_35 = renderanimdefs_45.anIntArrayArray2802[i_25][0];
                                i_27 = renderanimdefs_45.anIntArrayArray2802[i_25][1];
                                i_28 = renderanimdefs_45.anIntArrayArray2802[i_25][2];
                                i_29 = renderanimdefs_45.anIntArrayArray2802[i_25][3] << 3;
                                i_30 = renderanimdefs_45.anIntArrayArray2802[i_25][4] << 3;
                                i_31 = renderanimdefs_45.anIntArrayArray2802[i_25][5] << 3;
                            }
                            if (i_29 != 0 || i_30 != 0 || i_31 != 0) {
                                arr_47[i_25].method2671(i_29, i_30, i_31);
                            }
                            if (i_35 != 0 || i_27 != 0 || i_28 != 0) {
                                arr_47[i_25].translate(i_35, i_27, i_28);
                            }
                        }
                    }
                }
                RSMesh rsmesh_36;
                if (arr_47.length == 1) {
                    rsmesh_36 = arr_47[0];
                } else {
                    rsmesh_36 = new RSMesh(arr_47, arr_47.length);
                }
                meshrasterizer_19 = graphicalrenderer_1.createMeshRasterizer(rsmesh_36, i_21, npcLoader.anInt4845, anInt4885 + 64, anInt4888 * 5 + 850);
                short[] shorts_48;
                if (originalColors != null) {
                    if (class417_10 != null && class417_10.aShortArray4990 != null) {
                        shorts_48 = class417_10.aShortArray4990;
                    } else {
                        shorts_48 = modifiedColors;
                    }
                    for (i_27 = 0; i_27 < originalColors.length; i_27++) {
                        if (recolourPalette != null && i_27 < recolourPalette.length) {
                            meshrasterizer_19.X(originalColors[i_27], aShortArray4862[recolourPalette[i_27] & 0xff]);
                        } else {
                            meshrasterizer_19.X(originalColors[i_27], shorts_48[i_27]);
                        }
                    }
                }
                if (originalTextures != null) {
                    if (class417_10 != null && class417_10.aShortArray4991 != null) {
                        shorts_48 = class417_10.aShortArray4991;
                    } else {
                        shorts_48 = modifiedTextures;
                    }
                    for (i_27 = 0; i_27 < originalTextures.length; i_27++) {
                        meshrasterizer_19.W(originalTextures[i_27], shorts_48[i_27]);
                    }
                }
                if (aByte4871 != 0) {
                    meshrasterizer_19.PA(aByte4868, aByte4869, aByte4905, aByte4871 & 0xff);
                }
                meshrasterizer_19.KA(i_32);
                LRUCache softcache_49 = npcLoader.aClass229_4836;
                synchronized (npcLoader.aClass229_4836) {
                    npcLoader.aClass229_4836.put(meshrasterizer_19, long_33);
                }
            }
            MeshRasterizer meshrasterizer_37 = meshrasterizer_19.method11289((byte) 4, i_32, true);
            boolean bool_38 = false;
            if (ints_8 != null) {
                for (int i_46 = 0; i_46 < 12; i_46++) {
                    if (ints_8[i_46] != -1) {
                        bool_38 = true;
                    }
                }
            }
            if (bool_15 || bool_38) {
                Matrix44Var[] arr_39 = null;
                if (renderanimdefs_45 != null) {
                    arr_39 = renderanimdefs_45.method3811();
                }
                int i_40;
                if (bool_38 && arr_39 != null) {
                    for (i_40 = 0; i_40 < 12; i_40++) {
                        if (arr_39[i_40] != null) {
                            meshrasterizer_37.method11298(arr_39[i_40], 1 << i_40, true);
                        }
                    }
                }
                i_40 = 0;
                for (i_25 = 1; i_40 < i_16; i_25 <<= 1) {
                    if (arr_7[i_40] != null) {
                        arr_7[i_40].method7578(meshrasterizer_37, i_25);
                    }
                    ++i_40;
                }
                if (bool_38) {
                    for (i_40 = 0; i_40 < 12; i_40++) {
                        if (ints_8[i_40] != -1) {
                            i_25 = ints_8[i_40] - i_9;
                            i_25 &= 0x3fff;
                            Matrix44Var matrix44var_50 = new Matrix44Var();
                            matrix44var_50.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_25));
                            meshrasterizer_37.method11298(matrix44var_50, 1 << i_40, false);
                        }
                    }
                }
                if (bool_38 && arr_39 != null) {
                    for (i_40 = 0; i_40 < 12; i_40++) {
                        if (arr_39[i_40] != null) {
                            meshrasterizer_37.method11298(arr_39[i_40], 1 << i_40, false);
                        }
                    }
                }
                if (animation_5 != null && animation_6 != null) {
                    GraphNode_Sub1_Sub3_Sub1.method16078(meshrasterizer_37, animation_5, animation_6);
                } else if (animation_5 != null) {
                    animation_5.rasterize(meshrasterizer_37, 0);
                } else if (animation_6 != null) {
                    animation_6.rasterize(meshrasterizer_37, 0);
                }
                if (anInt4880 != 128 || anInt4881 != 128) {
                    meshrasterizer_37.oa(anInt4880, anInt4881, anInt4880);
                }
                meshrasterizer_37.KA(i_2);
            }
            return meshrasterizer_37;
        }
    }

    public MeshRasterizer renderHead(AbstractRenderer graphicalrenderer_1, int i_2, VarProvider interface42_3, Animation animation_4, NPCMeshModifier class417_5) {
        if (transformTo != null) {
            NPCType npcdefinitions_7 = getMultiNPC(interface42_3);
            return npcdefinitions_7 == null ? null : npcdefinitions_7.renderHead(graphicalrenderer_1, i_2, interface42_3, animation_4, class417_5);
        } else if (headModels == null && (class417_5 == null || class417_5.anIntArray4992 == null)) {
            return null;
        } else {
            int i_18 = i_2;
            if (animation_4 != null) {
                i_18 = i_2 | animation_4.method7640();
            }
            long long_8 = type | graphicalrenderer_1.rendererId << 16;
            if (class417_5 != null) {
                long_8 |= class417_5.aLong4993 << 24;
            }
            LRUCache softcache_11 = npcLoader.aClass229_4843;
            MeshRasterizer meshrasterizer_10;
            synchronized (npcLoader.aClass229_4843) {
                meshrasterizer_10 = (MeshRasterizer) npcLoader.aClass229_4843.get(long_8);
            }
            if (meshrasterizer_10 == null || (meshrasterizer_10.m() & i_18) != i_18) {
                if (meshrasterizer_10 != null) {
                    i_18 |= meshrasterizer_10.m();
                }
                int i_19 = i_18;
                if (originalColors != null) {
                    i_19 = i_18 | 0x4000;
                }
                if (originalTextures != null) {
                    i_19 |= 0x8000;
                }
                if (aByte4871 != 0) {
                    i_19 |= 0x80000;
                }
                int[] ints_12 = class417_5 != null && class417_5.anIntArray4992 != null ? class417_5.anIntArray4992 : headModels;
                boolean bool_13 = false;
                Index index_14 = npcLoader.aClass317_4842;
                int i_15;
                synchronized (npcLoader.aClass317_4842) {
                    i_15 = 0;
                    while (i_15 < ints_12.length) {
                        if (!npcLoader.aClass317_4842.load(ints_12[i_15], 0)) {
                            bool_13 = true;
                        }
                        ++i_15;
                    }
                }
                if (bool_13) {
                    return null;
                }
                RSMesh[] arr_26 = new RSMesh[ints_12.length];
                Index index_20 = npcLoader.aClass317_4842;
                synchronized (npcLoader.aClass317_4842) {
                    for (int i_16 = 0; i_16 < ints_12.length; i_16++) {
                        arr_26[i_16] = RSMesh.decodeMesh(npcLoader.aClass317_4842, ints_12[i_16]);
                    }
                }
                for (i_15 = 0; i_15 < ints_12.length; i_15++) {
                    if (arr_26[i_15] != null && arr_26[i_15].version < 13) {
                        arr_26[i_15].upscale();
                    }
                }
                RSMesh rsmesh_27;
                if (arr_26.length == 1) {
                    rsmesh_27 = arr_26[0];
                } else {
                    rsmesh_27 = new RSMesh(arr_26, arr_26.length);
                }
                meshrasterizer_10 = graphicalrenderer_1.createMeshRasterizer(rsmesh_27, i_19, npcLoader.anInt4845, 64, 768);
                int i_17;
                short[] shorts_21;
                if (originalColors != null) {
                    if (class417_5 != null && class417_5.aShortArray4990 != null) {
                        shorts_21 = class417_5.aShortArray4990;
                    } else {
                        shorts_21 = modifiedColors;
                    }
                    for (i_17 = 0; i_17 < originalColors.length; i_17++) {
                        if (recolourPalette != null && i_17 < recolourPalette.length) {
                            meshrasterizer_10.X(originalColors[i_17], aShortArray4862[recolourPalette[i_17] & 0xff]);
                        } else {
                            meshrasterizer_10.X(originalColors[i_17], shorts_21[i_17]);
                        }
                    }
                }
                if (originalTextures != null) {
                    if (class417_5 != null && class417_5.aShortArray4991 != null) {
                        shorts_21 = class417_5.aShortArray4991;
                    } else {
                        shorts_21 = modifiedTextures;
                    }
                    for (i_17 = 0; i_17 < originalTextures.length; i_17++) {
                        meshrasterizer_10.W(originalTextures[i_17], shorts_21[i_17]);
                    }
                }
                if (aByte4871 != 0) {
                    meshrasterizer_10.PA(aByte4868, aByte4869, aByte4905, aByte4871 & 0xff);
                }
                meshrasterizer_10.KA(i_18);
                LRUCache softcache_28 = npcLoader.aClass229_4843;
                synchronized (npcLoader.aClass229_4843) {
                    npcLoader.aClass229_4843.put(meshrasterizer_10, long_8);
                }
            }
            if (animation_4 != null) {
                meshrasterizer_10 = meshrasterizer_10.method11289((byte) 1, i_18, true);
                animation_4.rasterize(meshrasterizer_10, 0);
            }
            meshrasterizer_10.KA(i_2);
            return meshrasterizer_10;
        }
    }

    public boolean method6881() {
        if (modelIds == null) {
            return true;
        } else {
            boolean bool_2 = true;
            int[] ints_3 = modelIds;
            for (int i_4 = 0; i_4 < ints_3.length; i_4++) {
                int i_5 = ints_3[i_4];
                if (!npcLoader.aClass317_4842.load(i_5, 0)) {
                    bool_2 = false;
                }
            }
            return bool_2;
        }
    }

    public String getCS2Param(int key, String defaultValue) {
        if (cs2Params == null) {
            return defaultValue;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) cs2Params.get(key);
            return class282_sub47_4 == null ? defaultValue : (String) class282_sub47_4.anObject8068;
        }
    }

    public NPCType getMultiNPC(VarProvider vars) {
        int index = -1;
        if (varpBit != -1) {
            index = vars.getVarBit(varpBit);
        } else if (varp != -1) {
            index = vars.getVar(varp);
        }
        if (index >= 0 && index < transformTo.length - 1 && transformTo[index] != -1) {
            return npcLoader.getNPCType(transformTo[index]);
        } else {
            int varIdx = transformTo[transformTo.length - 1];
            return varIdx != -1 ? npcLoader.getNPCType(varIdx) : null;
        }
    }

    public boolean method6885(VarProvider interface42_1) {
        if (transformTo == null) {
            return true;
        } else {
            int i_3 = -1;
            if (varpBit != -1) {
                i_3 = interface42_1.getVarBit(varpBit);
            } else if (varp != -1) {
                i_3 = interface42_1.getVar(varp);
            }
            if (i_3 >= 0 && i_3 < transformTo.length - 1 && transformTo[i_3] != -1) {
                return true;
            } else {
                int i_4 = transformTo[transformTo.length - 1];
                return i_4 != -1;
            }
        }
    }

    public boolean method6886() {
        if (transformTo == null) {
            return walkingAnimation != -1 || rotate90RightAnimation != -1 || rotate90LeftAnimation != -1;
        } else {
            for (int i_2 = 0; i_2 < transformTo.length; i_2++) {
                if (transformTo[i_2] != -1) {
                    NPCType npcdefinitions_3 = npcLoader.getNPCType(transformTo[i_2]);
                    if (npcdefinitions_3.walkingAnimation != -1 || npcdefinitions_3.rotate90RightAnimation != -1 || npcdefinitions_3.rotate90LeftAnimation != -1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    void decode(Packet stream, int opcode) {
        if (opcode == 1) {
            int i_4 = stream.readUnsignedByte();
            modelIds = new int[i_4];
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                modelIds[i_5] = stream.readBigSmart();
            }
        } else if (opcode == 2) {
            name = stream.readString();
        } else if (opcode == 12) {
            size = stream.readUnsignedByte();
        } else if (opcode >= 30 && opcode < 35) {
            options[opcode - 30] = stream.readString();
        } else if (opcode == 40) {
            int i_4 = stream.readUnsignedByte();
            originalColors = new short[i_4];
            modifiedColors = new short[i_4];
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                originalColors[i_5] = (short) stream.readUnsignedShort();
                modifiedColors[i_5] = (short) stream.readUnsignedShort();
            }
        } else if (opcode == 41) {
            int i_4 = stream.readUnsignedByte();
            originalTextures = new short[i_4];
            modifiedTextures = new short[i_4];
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                originalTextures[i_5] = (short) stream.readUnsignedShort();
                modifiedTextures[i_5] = (short) stream.readUnsignedShort();
            }
        } else if (opcode == 42) {
            int i_4 = stream.readUnsignedByte();
            recolourPalette = new byte[i_4];
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                recolourPalette[i_5] = stream.readByte();
            }
        } else if (opcode == 60) {
            int i_4 = stream.readUnsignedByte();
            headModels = new int[i_4];
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                headModels[i_5] = stream.readBigSmart();
            }
        } else if (opcode == 93) {
            isVisibleOnMap = false;
        } else if (opcode == 95) {
            combatLevel = stream.readUnsignedShort();
        } else if (opcode == 97) {
            anInt4880 = stream.readUnsignedShort();
        } else if (opcode == 98) {
            anInt4881 = stream.readUnsignedShort();
        } else if (opcode == 99) {
            aBool4904 = true;
        } else if (opcode == 100) {
            anInt4885 = stream.readByte();
        } else if (opcode == 101) {
            anInt4888 = stream.readByte();
        } else if (opcode == 102) {
            headIcons = stream.readUnsignedShort();
        } else if (opcode == 103) {
            contrast = stream.readUnsignedShort();
        } else if (opcode == 106 || opcode == 118) {
            varpBit = stream.readUnsignedShort();
            if (varpBit == 65535) {
                varpBit = -1;
            }
            varp = stream.readUnsignedShort();
            if (varp == 65535) {
                varp = -1;
            }
            int i_4 = -1;
            if (opcode == 118) {
                i_4 = stream.readUnsignedShort();
                if (i_4 == 65535) {
                    i_4 = -1;
                }
            }
            int i_5 = stream.readUnsignedByte();
            transformTo = new int[i_5 + 2];
            for (int i_6 = 0; i_6 <= i_5; i_6++) {
                transformTo[i_6] = stream.readUnsignedShort();
                if (transformTo[i_6] == 65535) {
                    transformTo[i_6] = -1;
                }
            }
            transformTo[i_5 + 1] = i_4;
        } else if (opcode == 107) {
            visible = false;
        } else if (opcode == 109) {
            aBool4894 = false;
        } else if (opcode == 111) {
            aBool4912 = false;
        } else if (opcode == 113) {
            aShort4874 = (short) stream.readUnsignedShort();
            aShort4897 = (short) stream.readUnsignedShort();
        } else if (opcode == 114) {
            aByte4883 = stream.readByte();
            aByte4899 = stream.readByte();
        } else if (opcode == 119) {
            walkMask = stream.readByte();
        } else if (opcode == 121) {
            modelTranslation = new int[modelIds.length][];
            int i_4 = stream.readUnsignedByte();
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                int i_6 = stream.readUnsignedByte();
                int[] ints_7 = modelTranslation[i_6] = new int[3];
                ints_7[0] = stream.readByte();
                ints_7[1] = stream.readByte();
                ints_7[2] = stream.readByte();
            }
        } else if (opcode == 123) {
            anInt4902 = stream.readUnsignedShort();
        } else if (opcode == 125) {
            respawnDirection = (NPCDirection) Class386.identify(Class46.getDirections(), stream.readByte());
        } else if (opcode == 127) {
            renderEmote = stream.readUnsignedShort();
        } else if (opcode == 128) {
            Class386.identify(MoveSpeed.values(), stream.readUnsignedByte());
        } else if (opcode == 134) {
            walkingAnimation = stream.readUnsignedShort();
            if (walkingAnimation == 65535) {
                walkingAnimation = -1;
            }
            rotate180Animation = stream.readUnsignedShort();
            if (rotate180Animation == 65535) {
                rotate180Animation = -1;
            }
            rotate90RightAnimation = stream.readUnsignedShort();
            if (rotate90RightAnimation == 65535) {
                rotate90RightAnimation = -1;
            }
            rotate90LeftAnimation = stream.readUnsignedShort();
            if (rotate90LeftAnimation == 65535) {
                rotate90LeftAnimation = -1;
            }
            specialByte = stream.readUnsignedByte();
        } else if (opcode == 135) {
            anInt4875 = stream.readUnsignedByte();
            anInt4873 = stream.readUnsignedShort();
        } else if (opcode == 136) {
            anInt4854 = stream.readUnsignedByte();
            anInt4861 = stream.readUnsignedShort();
        } else if (opcode == 137) {
            anInt4877 = stream.readUnsignedShort();
        } else if (opcode == 138) {
            anInt4918 = stream.readBigSmart();
        } else if (opcode == 140) {
            anInt4909 = stream.readUnsignedByte();
        } else if (opcode == 141) {
            aBool4884 = true;
        } else if (opcode == 142) {
            anInt4914 = stream.readUnsignedShort();
        } else if (opcode == 143) {
            aBool4890 = true;
        } else if (opcode >= 150 && opcode < 155) {
            options[opcode - 150] = stream.readString();
            if (!npcLoader.aBool4838) {
                options[opcode - 150] = null;
            }
        } else if (opcode == 155) {
            aByte4868 = stream.readByte();
            aByte4869 = stream.readByte();
            aByte4905 = stream.readByte();
            aByte4871 = stream.readByte();
        } else if (opcode == 158) {
            aByte4916 = 1;
        } else if (opcode == 159) {
            aByte4916 = 0;
        } else if (opcode == 160) {
            int i_4 = stream.readUnsignedByte();
            quests = new int[i_4];
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                quests[i_5] = stream.readUnsignedShort();
            }
        } else if (opcode == 162) {
            aBool4872 = true;
        } else if (opcode == 163) {
            anInt4917 = stream.readUnsignedByte();
        } else if (opcode == 164) {
            anInt4911 = stream.readUnsignedShort();
            anInt4919 = stream.readUnsignedShort();
        } else if (opcode == 165) {
            anInt4913 = stream.readUnsignedByte();
        } else if (opcode == 168) {
            anInt4908 = stream.readUnsignedByte();
        } else if (opcode == 169) {
            aBool4920 = false;
        } else if (opcode == 249) {
            int i_4 = stream.readUnsignedByte();
            if (cs2Params == null) {
                int i_5 = Utils.nextPowerOfTwo(i_4);
                cs2Params = new IterableNodeMap(i_5);
            }
            for (int i_5 = 0; i_5 < i_4; i_5++) {
                boolean bool_10 = stream.readUnsignedByte() == 1;
                int i_9 = stream.read24BitUnsignedInteger();
                Object obj_8;
                if (bool_10) {
                    obj_8 = new ObjectNode(stream.readString());
                } else {
                    obj_8 = new IntNode(stream.readInt());
                }
                cs2Params.put((Node) obj_8, i_9);
            }
        }
    }
}
