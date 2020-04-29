package com.jagex;

public class PlayerModel {
    /**
     *
     */
    static int[] IDK_PART_TABLE = {8, 11, 4, 6, 9, 7, 10, 0};
    static LRUCache aClass229_2920 = new LRUCache(260);
    static LRUCache aClass229_2930 = new LRUCache(5);
    public int mimickingNpcId = -1;
    public int[] colors;
    public boolean female;
    long aLong2926;
    int anInt2925;
    int[] appearance;
    MeshModifier[] aClass422Array2922;
    long aLong2927;

    static void method4032(String string_0, String string_1, int i_2, int i_3, int i_4, long long_5, int i_7, int i_8, boolean bool_9, boolean bool_10, long long_11, boolean bool_13) {
        if (!Class20.aBool161 && Class20.anInt169 < 520) {
            i_2 = i_2 != -1 ? i_2 : client.anInt7427;
            CacheableNode_Sub7 class282_sub50_sub7_15 = new CacheableNode_Sub7(string_0, string_1, i_2, i_3, i_4, long_5, i_7, i_8, bool_9, bool_10, long_11, bool_13);
            Class361.method6269(class282_sub50_sub7_15);
        }
    }

    static void method4034(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_8 = EntityNode.method4890(i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
        int i_9 = EntityNode.method4890(i_3, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
        int i_10 = EntityNode.method4890(i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
        int i_11 = EntityNode.method4890(i_1, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
        int i_12 = EntityNode.method4890(i_2 + i_6, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
        int i_13 = EntityNode.method4890(i_3 - i_6, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068);
        int i_14;
        for (i_14 = i_8; i_14 < i_12; i_14++) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_14], i_10, i_11, i_5);
        }
        for (i_14 = i_9; i_14 > i_13; --i_14) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_14], i_10, i_11, i_5);
        }
        i_14 = EntityNode.method4890(i_0 + i_6, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
        int i_15 = EntityNode.method4890(i_1 - i_6, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069);
        for (int i_16 = i_12; i_16 <= i_13; i_16++) {
            int[] ints_17 = Class532_Sub1.anIntArrayArray7072[i_16];
            KeyHoldInputSubscriber.method3922(ints_17, i_10, i_14, i_5);
            KeyHoldInputSubscriber.method3922(ints_17, i_14, i_15, i_4);
            KeyHoldInputSubscriber.method3922(ints_17, i_15, i_11, i_5);
        }
    }

    void refresh() {
        long[] longs_2 = ByteBuf.aLongArray7979;
        aLong2926 = -1L;
        aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (anInt2925 >> 8)) & 0xffL)];
        aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ anInt2925) & 0xffL)];
        int i_3;
        for (i_3 = 0; i_3 < appearance.length; i_3++) {
            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (appearance[i_3] >> 24)) & 0xffL)];
            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (appearance[i_3] >> 16)) & 0xffL)];
            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (appearance[i_3] >> 8)) & 0xffL)];
            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ appearance[i_3]) & 0xffL)];
        }
        if (aClass422Array2922 != null) {
            for (i_3 = 0; i_3 < aClass422Array2922.length; i_3++) {
                if (aClass422Array2922[i_3] != null) {
                    int[] ints_4;
                    int[] ints_5;
                    if (female) {
                        ints_4 = aClass422Array2922[i_3].femaleBody;
                        ints_5 = aClass422Array2922[i_3].femaleHeads;
                    } else {
                        ints_4 = aClass422Array2922[i_3].maleBody;
                        ints_5 = aClass422Array2922[i_3].maleHeads;
                    }
                    int i_6;
                    if (ints_4 != null) {
                        for (i_6 = 0; i_6 < ints_4.length; i_6++) {
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (ints_4[i_6] >> 8)) & 0xffL)];
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ ints_4[i_6]) & 0xffL)];
                        }
                    }
                    if (ints_5 != null) {
                        for (i_6 = 0; i_6 < ints_5.length; i_6++) {
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (ints_5[i_6] >> 8)) & 0xffL)];
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ ints_5[i_6]) & 0xffL)];
                        }
                    }
                    if (aClass422Array2922[i_3].modifiedColors != null) {
                        for (i_6 = 0; i_6 < aClass422Array2922[i_3].modifiedColors.length; i_6++) {
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (aClass422Array2922[i_3].modifiedColors[i_6] >> 8)) & 0xffL)];
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ aClass422Array2922[i_3].modifiedColors[i_6]) & 0xffL)];
                        }
                    }
                    if (aClass422Array2922[i_3].modifiedTextures != null) {
                        for (i_6 = 0; i_6 < aClass422Array2922[i_3].modifiedTextures.length; i_6++) {
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (aClass422Array2922[i_3].modifiedTextures[i_6] >> 8)) & 0xffL)];
                            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ aClass422Array2922[i_3].modifiedTextures[i_6]) & 0xffL)];
                        }
                    }
                }
            }
        }
        for (i_3 = 0; i_3 < 10; i_3++) {
            aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ colors[i_3]) & 0xffL)];
        }
        aLong2926 = aLong2926 >>> 8 ^ longs_2[(int) ((aLong2926 ^ (female ? 1 : 0)) & 0xffL)];
    }

    public void method3992(int i_1, int[] ints_2, MeshModifier[] arr_3, int[] ints_4, boolean bool_5, int i_6) {
        if (anInt2925 != i_1) {
            anInt2925 = i_1;
        }
        appearance = ints_2;
        aClass422Array2922 = arr_3;
        colors = ints_4;
        female = bool_5;
        mimickingNpcId = i_6;
        refresh();
    }

    public void setIDKPart(int slot, int id, IdentiKitIndexLoader loader) {
        int partIndex = IDK_PART_TABLE[slot];
        if (loader.getIdentiKit(id) != null) {
            appearance[partIndex] = id | -2147483648;
            refresh();
        }
    }

    public void setItem(int index, int itemId, ObjectIndexLoader loader) {
        if (itemId == -1) {
            appearance[index] = 0;
        } else if (loader.getItemDefinitions(itemId) != null) {
            appearance[index] = itemId | 0x40000000;
            refresh();
        }
    }

    public MeshRasterizer getBodyModel(AbstractRenderer Renderer, int i_2, RenderAnimIndexLoader renderanimindexloader_3, IdentiKitIndexLoader class31_4, NPCIndexLoader loader, ObjectIndexLoader itemindexloader_6, VarProvider interface42_8, Animation animation_9, Animation animation_10, Animation[] arr_11, int[] ints_12, int i_13, EquipmentDefaults defaults6loader_15) {
        if (mimickingNpcId != -1) {
            return loader.getNPCType(mimickingNpcId).method6875(Renderer, i_2, renderanimindexloader_3, interface42_8, animation_9, animation_10, arr_11, ints_12, i_13, null);
        } else {
            int i_17 = i_2;
            long long_18 = aLong2926;
            int[] ints_20 = appearance;
            boolean bool_21 = false;
            boolean bool_22 = false;
            int i_24;
            if (animation_9 != null) {
                AnimationDefinitions animationdefinitions_23 = animation_9.getDefs();
                if (animationdefinitions_23 != null && (animationdefinitions_23.leftHandItem >= 0 || animationdefinitions_23.rightHandItem >= 0)) {
                    ints_20 = new int[appearance.length];
                    for (i_24 = 0; i_24 < ints_20.length; i_24++) {
                        ints_20[i_24] = appearance[i_24];
                    }
                    if (animationdefinitions_23.leftHandItem >= 0 && defaults6loader_15.offhandSlot != -1) {
                        bool_21 = true;
                        if (animationdefinitions_23.leftHandItem == 65535) {
                            ints_20[defaults6loader_15.offhandSlot] = 0;
                            for (i_24 = 0; i_24 < defaults6loader_15.hiddenAnimationOffhandSlots.length; i_24++) {
                                ints_20[defaults6loader_15.hiddenAnimationOffhandSlots[i_24]] = 0;
                            }
                            long_18 ^= -4294967296L;
                        } else {
                            ints_20[defaults6loader_15.offhandSlot] = animationdefinitions_23.leftHandItem | 0x40000000;
                            for (i_24 = 0; i_24 < defaults6loader_15.hiddenAnimationOffhandSlots.length; i_24++) {
                                ints_20[defaults6loader_15.hiddenAnimationOffhandSlots[i_24]] = 0;
                            }
                            long_18 ^= (long) ints_20[defaults6loader_15.offhandSlot] << 32;
                        }
                    }
                    if (animationdefinitions_23.rightHandItem >= 0 && defaults6loader_15.weaponSlot != -1) {
                        bool_22 = true;
                        if (animationdefinitions_23.rightHandItem == 65535) {
                            ints_20[defaults6loader_15.weaponSlot] = 0;
                            for (i_24 = 0; i_24 < defaults6loader_15.hiddenAnimationWeaponSlots.length; i_24++) {
                                ints_20[defaults6loader_15.hiddenAnimationWeaponSlots[i_24]] = 0;
                            }
                            long_18 ^= 0xffffffffL;
                        } else {
                            ints_20[defaults6loader_15.weaponSlot] = animationdefinitions_23.rightHandItem | 0x40000000;
                            for (i_24 = 0; i_24 < defaults6loader_15.hiddenAnimationWeaponSlots.length; i_24++) {
                                ints_20[defaults6loader_15.hiddenAnimationWeaponSlots[i_24]] = 0;
                            }
                            long_18 ^= ints_20[defaults6loader_15.weaponSlot];
                        }
                    }
                }
            }
            boolean bool_38 = false;
            i_24 = arr_11 != null ? arr_11.length : 0;
            for (int i_25 = 0; i_25 < i_24; i_25++) {
                if (arr_11[i_25] != null) {
                    i_17 |= arr_11[i_25].method7640();
                    bool_38 = true;
                }
            }
            if (animation_9 != null) {
                i_17 |= animation_9.method7640();
                bool_38 = true;
            }
            if (animation_10 != null) {
                i_17 |= animation_10.method7640();
                bool_38 = true;
            }
            boolean bool_50 = false;
            if (ints_12 != null) {
                for (int i_26 = 0; i_26 < ints_12.length; i_26++) {
                    if (ints_12[i_26] != -1) {
                        i_17 |= 0x20;
                        bool_50 = true;
                    }
                }
            }
            LRUCache softcache_27 = aClass229_2920;
            MeshRasterizer meshrasterizer_39;
            synchronized (aClass229_2920) {
                meshrasterizer_39 = (MeshRasterizer) aClass229_2920.get(long_18);
            }
            BASDefinitions renderanimdefs_51 = null;
            if (anInt2925 != -1) {
                renderanimdefs_51 = renderanimindexloader_3.getBASDefs(anInt2925);
            }
            int i_30;
            int i_31;
            if (meshrasterizer_39 == null || Renderer.method8452(meshrasterizer_39.m(), i_17) != 0) {
                if (meshrasterizer_39 != null) {
                    i_17 = Renderer.method8546(i_17, meshrasterizer_39.m());
                }
                boolean bool_29 = false;
                i_30 = 0;
                while (true) {
                    int i_34;
                    if (i_30 >= ints_20.length) {
                        if (bool_29) {
                            if (aLong2927 != -1L) {
                                LRUCache softcache_40 = aClass229_2920;
                                synchronized (aClass229_2920) {
                                    meshrasterizer_39 = (MeshRasterizer) aClass229_2920.get(aLong2927);
                                }
                            }
                            if (meshrasterizer_39 == null || Renderer.method8452(meshrasterizer_39.m(), i_17) != 0) {
                                return null;
                            }
                        } else {
                            RSMesh[] arr_56 = new RSMesh[ints_20.length];
                            int i_41;
                            for (i_31 = 0; i_31 < ints_20.length; i_31++) {
                                i_41 = ints_20[i_31];
                                MeshModifier meshmodifier_42 = null;
                                boolean bool_55 = i_31 == 5 && bool_21 || i_31 == 3 && bool_22;
                                RSMesh rsmesh_35;
                                if ((i_41 & 0x40000000) != 0) {
                                    if (!bool_55 && aClass422Array2922 != null && aClass422Array2922[i_31] != null) {
                                        meshmodifier_42 = aClass422Array2922[i_31];
                                    }
                                    rsmesh_35 = itemindexloader_6.getItemDefinitions(i_41 & 0x3fffffff).getBodyMesh(female, meshmodifier_42);
                                    if (rsmesh_35 != null) {
                                        arr_56[i_31] = rsmesh_35;
                                    }
                                } else if ((i_41 & -2147483648) != 0) {
                                    rsmesh_35 = class31_4.getIdentiKit(i_41 & 0x3fffffff).method899();
                                    if (rsmesh_35 != null) {
                                        arr_56[i_31] = rsmesh_35;
                                    }
                                }
                            }
                            int i_54;
                            if (renderanimdefs_51 != null && renderanimdefs_51.anIntArrayArray2802 != null) {
                                for (i_31 = 0; i_31 < renderanimdefs_51.anIntArrayArray2802.length; i_31++) {
                                    if (arr_56[i_31] != null) {
                                        i_41 = 0;
                                        i_54 = 0;
                                        i_34 = 0;
                                        int i_43 = 0;
                                        int i_36 = 0;
                                        int i_37 = 0;
                                        if (renderanimdefs_51.anIntArrayArray2802[i_31] != null) {
                                            i_41 = renderanimdefs_51.anIntArrayArray2802[i_31][0];
                                            i_54 = renderanimdefs_51.anIntArrayArray2802[i_31][1];
                                            i_34 = renderanimdefs_51.anIntArrayArray2802[i_31][2];
                                            i_43 = renderanimdefs_51.anIntArrayArray2802[i_31][3] << 3;
                                            i_36 = renderanimdefs_51.anIntArrayArray2802[i_31][4] << 3;
                                            i_37 = renderanimdefs_51.anIntArrayArray2802[i_31][5] << 3;
                                        }
                                        if (i_43 != 0 || i_36 != 0 || i_37 != 0) {
                                            arr_56[i_31].method2671(i_43, i_36, i_37);
                                        }
                                        if (i_41 != 0 || i_54 != 0 || i_34 != 0) {
                                            arr_56[i_31].translate(i_41, i_54, i_34);
                                        }
                                    }
                                }
                            }
                            RSMesh rsmesh_44 = new RSMesh(arr_56, arr_56.length);
                            int i_28 = i_17 | 0x4000;
                            meshrasterizer_39 = Renderer.createMeshRasterizer(rsmesh_44, i_28, Class149.anInt1744, 64, 850);
                            for (i_41 = 0; i_41 < 10; i_41++) {
                                for (i_54 = 0; i_54 < AbstractQueue_Sub1.SKIN_COLORS[i_41].length; i_54++) {
                                    if (colors[i_41] < Class366.SKIN_COLORS[i_41][i_54].length) {
                                        meshrasterizer_39.X(AbstractQueue_Sub1.SKIN_COLORS[i_41][i_54], Class366.SKIN_COLORS[i_41][i_54][colors[i_41]]);
                                    }
                                }
                            }
                            meshrasterizer_39.KA(i_17);
                            LRUCache softcache_52 = aClass229_2920;
                            synchronized (aClass229_2920) {
                                aClass229_2920.put(meshrasterizer_39, long_18);
                            }
                            aLong2927 = long_18;
                        }
                        break;
                    }
                    i_31 = ints_20[i_30];
                    MeshModifier meshmodifier_32 = null;
                    boolean bool_33 = false;
                    if (bool_21) {
                        if (defaults6loader_15.offhandSlot == i_30) {
                            bool_33 = true;
                        } else {
                            for (i_34 = 0; i_34 < defaults6loader_15.hiddenAnimationOffhandSlots.length; i_34++) {
                                if (defaults6loader_15.hiddenAnimationOffhandSlots[i_34] == i_30) {
                                    bool_33 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (bool_22) {
                        if (defaults6loader_15.weaponSlot == i_30) {
                            bool_33 = true;
                        } else {
                            for (i_34 = 0; i_34 < defaults6loader_15.hiddenAnimationWeaponSlots.length; i_34++) {
                                if (defaults6loader_15.hiddenAnimationWeaponSlots[i_34] == i_30) {
                                    bool_33 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if ((i_31 & 0x40000000) != 0) {
                        if (!bool_33 && aClass422Array2922 != null && aClass422Array2922[i_30] != null) {
                            meshmodifier_32 = aClass422Array2922[i_30];
                        }
                        if (!itemindexloader_6.getItemDefinitions(i_31 & 0x3fffffff).bodyMeshesReady(female, meshmodifier_32)) {
                            bool_29 = true;
                        }
                    } else if ((i_31 & -2147483648) != 0 && !class31_4.getIdentiKit(i_31 & 0x3fffffff).method898()) {
                        bool_29 = true;
                    }
                    ++i_30;
                }
            }
            MeshRasterizer meshrasterizer_45 = meshrasterizer_39.method11289((byte) 4, i_17, true);
            if (bool_38 || bool_50) {
                Matrix44Var[] arr_46 = null;
                if (renderanimdefs_51 != null) {
                    arr_46 = renderanimdefs_51.method3811();
                }
                if (bool_50 && arr_46 != null) {
                    for (i_30 = 0; i_30 < ints_12.length; i_30++) {
                        if (arr_46[i_30] != null) {
                            meshrasterizer_45.method11298(arr_46[i_30], 1 << i_30, true);
                        }
                    }
                }
                i_30 = 0;
                for (i_31 = 1; i_30 < i_24; i_31 <<= 1) {
                    if (arr_11[i_30] != null) {
                        arr_11[i_30].method7578(meshrasterizer_45, i_31);
                    }
                    ++i_30;
                }
                if (bool_50) {
                    for (i_30 = 0; i_30 < ints_12.length; i_30++) {
                        if (ints_12[i_30] != -1) {
                            i_31 = ints_12[i_30] - i_13;
                            i_31 &= 0x3fff;
                            Matrix44Var matrix44var_53 = new Matrix44Var();
                            matrix44var_53.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_31));
                            meshrasterizer_45.method11298(matrix44var_53, 1 << i_30, false);
                        }
                    }
                }
                if (bool_50 && arr_46 != null) {
                    for (i_30 = 0; i_30 < ints_12.length; i_30++) {
                        if (arr_46[i_30] != null) {
                            meshrasterizer_45.method11298(arr_46[i_30], 1 << i_30, false);
                        }
                    }
                }
                if (animation_9 != null && animation_10 != null) {
                    GraphNode_Sub1_Sub3_Sub1.method16078(meshrasterizer_45, animation_9, animation_10);
                } else if (animation_9 != null) {
                    animation_9.rasterize(meshrasterizer_45, 0);
                } else if (animation_10 != null) {
                    animation_10.rasterize(meshrasterizer_45, 0);
                }
            }
            return meshrasterizer_45;
        }
    }

    public MeshRasterizer getHeadModel(AbstractRenderer graphicalrenderer_1, int i_2, IdentiKitIndexLoader IdentiKitLoader, Animation animation_5, int idKit1, int idKit2, int idKit3) {
        int i_10 = animation_5 != null ? i_2 | animation_5.method7640() : i_2;
        long long_11 = (long) idKit3 << 32 | (idKit2 << 16) | idKit1;
        LRUCache softcache_14 = aClass229_2930;
        MeshRasterizer meshrasterizer_13;
        synchronized (aClass229_2930) {
            meshrasterizer_13 = (MeshRasterizer) aClass229_2930.get(long_11);
        }
        if (meshrasterizer_13 == null || graphicalrenderer_1.method8452(meshrasterizer_13.m(), i_10) != 0) {
            if (meshrasterizer_13 != null) {
                i_10 = graphicalrenderer_1.method8546(i_10, meshrasterizer_13.m());
            }
            RSMesh[] arr_15 = new RSMesh[3];
            int i_16 = 0;
            if (!IdentiKitLoader.getIdentiKit(idKit1).method900() || !IdentiKitLoader.getIdentiKit(idKit2).method900() || !IdentiKitLoader.getIdentiKit(idKit3).method900()) {
                return null;
            }
            RSMesh rsmesh_17 = IdentiKitLoader.getIdentiKit(idKit1).renderHead();
            if (rsmesh_17 != null) {
                arr_15[i_16++] = rsmesh_17;
            }
            rsmesh_17 = IdentiKitLoader.getIdentiKit(idKit2).renderHead();
            if (rsmesh_17 != null) {
                arr_15[i_16++] = rsmesh_17;
            }
            rsmesh_17 = IdentiKitLoader.getIdentiKit(idKit3).renderHead();
            if (rsmesh_17 != null) {
                arr_15[i_16++] = rsmesh_17;
            }
            rsmesh_17 = new RSMesh(arr_15, i_16);
            int i_20 = i_10 | 0x4000;
            meshrasterizer_13 = graphicalrenderer_1.createMeshRasterizer(rsmesh_17, i_20, Class149.anInt1744, 64, 768);
            for (int i_18 = 0; i_18 < 10; i_18++) {
                for (int i_19 = 0; i_19 < AbstractQueue_Sub1.SKIN_COLORS[i_18].length; i_19++) {
                    if (colors[i_18] < Class366.SKIN_COLORS[i_18][i_19].length) {
                        meshrasterizer_13.X(AbstractQueue_Sub1.SKIN_COLORS[i_18][i_19], Class366.SKIN_COLORS[i_18][i_19][colors[i_18]]);
                    }
                }
            }
            meshrasterizer_13.KA(i_10);
            LRUCache softcache_21 = aClass229_2930;
            synchronized (aClass229_2930) {
                aClass229_2930.put(meshrasterizer_13, long_11);
            }
        }
        if (animation_5 != null) {
            meshrasterizer_13 = meshrasterizer_13.method11289((byte) 4, i_10, true);
            animation_5.rasterize(meshrasterizer_13, 0);
        }
        return meshrasterizer_13;
    }

    public void method4003(boolean bool_1) {
        female = bool_1;
        refresh();
    }

    public MeshRasterizer method4021(AbstractRenderer graphicalrenderer_1, int i_2, IdentiKitIndexLoader class31_3, NPCIndexLoader npcindexloader_4, ObjectIndexLoader itemindexloader_5, VarProvider interface42_7, Animation animation_8) {
        if (mimickingNpcId != -1) {
            return npcindexloader_4.getNPCType(mimickingNpcId).renderHead(graphicalrenderer_1, i_2, interface42_7, animation_8, null);
        } else {
            int i_10 = animation_8 != null ? i_2 | animation_8.method7640() : i_2;
            LRUCache softcache_12 = aClass229_2930;
            MeshRasterizer meshrasterizer_11;
            synchronized (aClass229_2930) {
                meshrasterizer_11 = (MeshRasterizer) aClass229_2930.get(aLong2926);
            }
            if (meshrasterizer_11 == null || graphicalrenderer_1.method8452(meshrasterizer_11.m(), i_10) != 0) {
                if (meshrasterizer_11 != null) {
                    i_10 = graphicalrenderer_1.method8546(i_10, meshrasterizer_11.m());
                }
                boolean bool_13 = false;
                int i_15;
                for (int i_14 = 0; i_14 < appearance.length; i_14++) {
                    i_15 = appearance[i_14];
                    MeshModifier meshmodifier_16 = null;
                    if ((i_15 & 0x40000000) != 0) {
                        if (aClass422Array2922 != null && aClass422Array2922[i_14] != null) {
                            meshmodifier_16 = aClass422Array2922[i_14];
                        }
                        if (!itemindexloader_5.getItemDefinitions(i_15 & 0x3fffffff).headMeshesReady(female, meshmodifier_16)) {
                            bool_13 = true;
                        }
                    } else if ((i_15 & -2147483648) != 0 && !class31_3.getIdentiKit(i_15 & 0x3fffffff).method900()) {
                        bool_13 = true;
                    }
                }
                if (bool_13) {
                    return null;
                }
                RSMesh[] arr_21 = new RSMesh[appearance.length];
                i_15 = 0;
                int i_17;
                for (int i_22 = 0; i_22 < appearance.length; i_22++) {
                    i_17 = appearance[i_22];
                    MeshModifier meshmodifier_18 = null;
                    RSMesh rsmesh_19;
                    if ((i_17 & 0x40000000) != 0) {
                        if (aClass422Array2922 != null && aClass422Array2922[i_22] != null) {
                            meshmodifier_18 = aClass422Array2922[i_22];
                        }
                        rsmesh_19 = itemindexloader_5.getItemDefinitions(i_17 & 0x3fffffff).getHeadMesh(female, meshmodifier_18);
                        if (rsmesh_19 != null) {
                            arr_21[i_15++] = rsmesh_19;
                        }
                    } else if ((i_17 & -2147483648) != 0) {
                        rsmesh_19 = class31_3.getIdentiKit(i_17 & 0x3fffffff).renderHead();
                        if (rsmesh_19 != null) {
                            arr_21[i_15++] = rsmesh_19;
                        }
                    }
                }
                RSMesh rsmesh_28 = new RSMesh(arr_21, i_15);
                int i_20 = i_10 | 0x4000;
                meshrasterizer_11 = graphicalrenderer_1.createMeshRasterizer(rsmesh_28, i_20, Class149.anInt1744, 64, 768);
                for (i_17 = 0; i_17 < 10; i_17++) {
                    for (int i_23 = 0; i_23 < AbstractQueue_Sub1.SKIN_COLORS[i_17].length; i_23++) {
                        if (colors[i_17] < Class366.SKIN_COLORS[i_17][i_23].length) {
                            meshrasterizer_11.X(AbstractQueue_Sub1.SKIN_COLORS[i_17][i_23], Class366.SKIN_COLORS[i_17][i_23][colors[i_17]]);
                        }
                    }
                }
                meshrasterizer_11.KA(i_10);
                LRUCache softcache_24 = aClass229_2930;
                synchronized (aClass229_2930) {
                    aClass229_2930.put(meshrasterizer_11, aLong2926);
                }
            }
            if (animation_8 == null) {
                return meshrasterizer_11;
            } else {
                MeshRasterizer meshrasterizer_27 = meshrasterizer_11.method11289((byte) 4, i_10, true);
                animation_8.rasterize(meshrasterizer_27, 0);
                return meshrasterizer_27;
            }
        }
    }

    public void setBaseColor(int i_1, int i_2) {
        colors[i_1] = i_2;
        refresh();
    }
}
