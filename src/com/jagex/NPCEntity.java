package com.jagex;

import java.util.Arrays;

public class NPCEntity extends PathingEntity {

    public NPCMeshModifier meshModifiers;
    public int faceX = -1;
    public int faceY = -1;
    public int meshModifierCount = 1;
    public int headMeshModifierCount = 1;
    public int anInt10575 = -1;
    public VarNPCMap varns = new VarNPCMap();
    public NPCDefinitions definitions;
    public String modifiedName;
    public int anInt10582;
    int[] maxStats = new int[6];
    int[] currStats = new int[6];
    int anInt10587;
    int anInt10588;
    int anInt10589;
    int anInt10590;

    public NPCEntity(SceneObjectManager sceneobjectmanager_1) {
        super(sceneobjectmanager_1, 25);
        method16156();
    }

    @Override
    int method12996() {
        return definitions == null ? 0 : definitions.anInt4913;
    }

    void method16156() {
        anInt10587 = 32 + (int) (Math.random() * 4.0D);
        anInt10588 = 3 + (int) (Math.random() * 2.0D);
        anInt10589 = 16 + (int) (Math.random() * 3.0D);
        if (Class393.preferences.textures.method12873() == 1) {
            anInt10590 = (int) (Math.random() * 6.0D);
        } else {
            anInt10590 = (int) (Math.random() * 12.0D);
        }

    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    boolean method16158(AbstractRenderer graphicalrenderer_1, int i_2) {
        int i_4 = i_2;
        BASDefinitions renderanimdefs_5 = getRenderAnimDefs();
        Animation animation_6 = currentAnimation.hasDefs() && !currentAnimation.hasSpeed() ? currentAnimation : null;
        MovingAnimation class456_sub3_7 = aAnimation_Sub3_10337.hasDefs() && (!aAnimation_Sub3_10337.aBool7891 || animation_6 == null) ? aAnimation_Sub3_10337 : null;
        int i_8 = renderanimdefs_5.anInt2786;
        int i_9 = renderanimdefs_5.anInt2829;
        if (i_8 != 0 || i_9 != 0 || renderanimdefs_5.anInt2824 != 0 || renderanimdefs_5.anInt2827 != 0) {
            i_2 |= 0x7;
        }

        boolean bool_10 = scalar != 0 && client.CYCLES_20MS >= anInt10347 && client.CYCLES_20MS < anInt10348;
        if (bool_10) {
            i_2 |= 0x80000;
        }

        int i_11 = aClass19_10359.method578();
        MeshRasterizer meshrasterizer_12 = aMeshRasterizerArray10372[0] = definitions.renderFull(graphicalrenderer_1, i_2, IndexLoaders.RENDER_ANIM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, animation_6, class456_sub3_7, aAnimation_Sub2_Sub1Array10354, anIntArray10362, i_11, meshModifiers, getRenderAnimation(), false);
        if (meshrasterizer_12 == null) {
            return false;
        } else {
            anInt10317 = meshrasterizer_12.YA();
            meshrasterizer_12.n();
            method15819(meshrasterizer_12);
            if (i_8 == 0 && i_9 == 0) {
                method15895(i_11, getSize() << 9, getSize() << 9, 0, 0);
            } else {
                method15895(i_11, i_8, i_9, renderanimdefs_5.anInt2813, renderanimdefs_5.anInt2790);
                if (anInt10322 != 0) {
                    aMeshRasterizerArray10372[0].t(anInt10322);
                }

                if (anInt10323 != 0) {
                    aMeshRasterizerArray10372[0].EA(anInt10323);
                }

                if (anInt10363 != 0) {
                    aMeshRasterizerArray10372[0].ia(0, anInt10363, 0);
                }
            }

            if (bool_10) {
                meshrasterizer_12.PA(redAdd, greenAdd, blueAdd, scalar & 0xff);
            }

            method15837(graphicalrenderer_1, renderanimdefs_5, i_4, i_8, i_9, i_11);
            return true;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && (aBool10370 || method16158(graphicalrenderer_1, 0))) {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            matrix44var_3.method5209(method11168());
            matrix44var_3.method5219(0.0F, -5.0f, 0.0F);
            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_3, aBool10370);

            Arrays.fill(aMeshRasterizerArray10372, null);
        }

    }

    @Override
    public int getCS2Index() {
        return index + 1;
    }

    public void move(int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
        plane = collisionPlane = (byte) i_1;
        if (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(i_2, i_3)) {
            ++collisionPlane;
        }

        if (currentAnimation.hasDefs() && currentAnimation.getDefs().walkingPrecedence == 1) {
            currentAnimations = null;
            currentAnimation.update(-1);
        }

        int i_7;
        for (i_7 = 0; i_7 < spotAnims.length; i_7++) {
            if (spotAnims[i_7].spotAnimId != -1) {
                SpotAnimDefinitions spotanimdefinitions_11 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnims[i_7].spotAnimId);
                if (spotanimdefinitions_11.aBool6968 && spotanimdefinitions_11.animationId != -1 && IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_11.animationId).walkingPrecedence == 1) {
                    spotAnims[i_7].animation.update(-1);
                    spotAnims[i_7].spotAnimId = -1;
                }
            }
        }

        if (!bool_4) {
            i_7 = i_2 - regionBaseX[0];
            int i_8 = i_3 - regionBaseY[0];
            if (i_7 >= -8 && i_7 <= 8 && i_8 >= -8 && i_8 <= 8) {
                if (anInt10355 < regionBaseX.length - 1) {
                    ++anInt10355;
                }

                for (int i_9 = anInt10355; i_9 > 0; --i_9) {
                    regionBaseX[i_9] = regionBaseX[i_9 - 1];
                    regionBaseY[i_9] = regionBaseY[i_9 - 1];
                    walkTypes[i_9] = walkTypes[i_9 - 1];
                }

                regionBaseX[0] = i_2;
                regionBaseY[0] = i_3;
                walkTypes[0] = MoveSpeed.WALKING.id;
                return;
            }
        }

        anInt10355 = 0;
        anInt10367 = 0;
        anInt10366 = 0;
        regionBaseX[0] = i_2;
        regionBaseY[0] = i_3;
        Vector3 vector3_10 = Vector3.popVectorStackTo(method11166().coords);
        vector3_10.x = ((i_5 << 8) + (regionBaseX[0] << 9));
        vector3_10.z = ((i_5 << 8) + (regionBaseY[0] << 9));
        method11171(vector3_10);
        vector3_10.pushVectorStack();
        if (aClass539_10369 != null) {
            aClass539_10369.method11505();
        }

    }

    public boolean hasDefinition() {
        return definitions != null;
    }

    @Override
    int getRenderAnimation() {
        if (anInt10575 != -1) {
            return anInt10575;
        } else {
            if (definitions.transformTo != null) {
                NPCDefinitions npcdefinitions_2 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
                if (npcdefinitions_2 != null && npcdefinitions_2.renderEmote != -1) {
                    return npcdefinitions_2.renderEmote;
                }
            }

            return definitions.renderEmote;
        }
    }

    public void move(NPCDirection direction, int walkType) {
        int baseX = regionBaseX[0];
        int baseY = regionBaseY[0];
        switch (direction.value) {
            case 0:
                ++baseY;
                break;
            case 1:
                --baseX;
                ++baseY;
                break;
            case 2:
                ++baseX;
                ++baseY;
                break;
            case 3:
                ++baseX;
                break;
            case 4:
                --baseX;
                --baseY;
                break;
            case 5:
                --baseX;
                break;
            case 6:
                --baseY;
                break;
            case 7:
                ++baseX;
                --baseY;
        }

        if (currentAnimation.hasDefs() && currentAnimation.getDefs().walkingPrecedence == 1) {
            currentAnimations = null;
            currentAnimation.update(-1);
        }

        int i_6;
        for (i_6 = 0; i_6 < spotAnims.length; i_6++) {
            if (spotAnims[i_6].spotAnimId != -1) {
                SpotAnimDefinitions spotanimdefinitions_7 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnims[i_6].spotAnimId);
                if (spotanimdefinitions_7.aBool6968 && spotanimdefinitions_7.animationId != -1 && IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_7.animationId).walkingPrecedence == 1) {
                    spotAnims[i_6].animation.update(-1);
                    spotAnims[i_6].spotAnimId = -1;
                }
            }
        }

        if (anInt10355 < regionBaseX.length - 1) {
            ++anInt10355;
        }

        for (i_6 = anInt10355; i_6 > 0; --i_6) {
            regionBaseX[i_6] = regionBaseX[i_6 - 1];
            regionBaseY[i_6] = regionBaseY[i_6 - 1];
            walkTypes[i_6] = walkTypes[i_6 - 1];
        }

        regionBaseX[0] = baseX;
        regionBaseY[0] = baseY;
        walkTypes[0] = (byte) walkType;
    }

    @Override
    public int method12997() {
        if (definitions.transformTo != null) {
            NPCDefinitions npcdefinitions_2 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            if (npcdefinitions_2 != null && npcdefinitions_2.anInt4902 != -1) {
                return npcdefinitions_2.anInt4902;
            }
        }

        return definitions.anInt4902 != -1 ? definitions.anInt4902 : super.method12997();
    }

    boolean method16162() {
        return definitions.visible;
    }

    @Override
    public int method15898() {
        if (definitions.transformTo != null) {
            NPCDefinitions npcdefinitions_1 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            if (npcdefinitions_1 != null && 327817917 * npcdefinitions_1.anInt4918 * 1094135957 != -1) {
                return npcdefinitions_1.anInt4918 * 1094135957 * 327817917;
            }
        }

        return 327817917 * definitions.anInt4918 * 1094135957;
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && (aBool10370 || method16158(graphicalrenderer_1, 0))) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5209(method11168());
            matrix44var_2.method5219(0.0F, -5.0f, 0.0F);
            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, aBool10370);

            Arrays.fill(aMeshRasterizerArray10372, null);
        }

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
    void method12984() {
        throw new IllegalStateException();
    }

    public int method16163(int i_1) {
        return maxStats[i_1];
    }

    @Override
    public boolean method15871() {
        return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        if (definitions != null && method16158(graphicalrenderer_1, 131072)) {
            Matrix44Var matrix44var_5 = method11168();
            boolean bool_6 = false;

            int i_7;
            for (i_7 = 0; i_7 < aMeshRasterizerArray10372.length; i_7++) {
                if (aMeshRasterizerArray10372[i_7] != null) {
                    boolean bool_8;
                    label57:
                    {
                        if (definitions.anInt4913 <= 0) {
                            label56:
                            {
                                if (definitions.anInt4917 == -1) {
                                    if (definitions.size == 1) {
                                        break label56;
                                    }
                                } else if (definitions.anInt4917 == 1) {
                                    break label56;
                                }

                                bool_8 = false;
                                break label57;
                            }
                        }

                        bool_8 = true;
                    }

                    boolean bool_10 = aMeshRasterizerArray10372[i_7].method11270(i_2, i_3, matrix44var_5, bool_8, definitions.anInt4913);
                    if (bool_10) {
                        bool_6 = true;
                        break;
                    }
                }
            }

            for (i_7 = 0; i_7 < aMeshRasterizerArray10372.length; i_7++) {
                aMeshRasterizerArray10372[i_7] = null;
            }

            return bool_6;
        } else {
            return false;
        }
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && method16158(graphicalrenderer_1, 526336)) {
            Matrix44Var matrix44var_2 = method11168();
            CoordinateSpace class305_3 = method11166();
            Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
            int i_5 = aClass19_10359.method578();
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_3.coords.x >> 9][(int) class305_3.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                int i_7 = anInt10325 * -374848179 * -2023195771 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = -374848179 * (int) ((-2023195771 * anInt10325 * -374848179) - i_7 / 10.0F) * -2023195771;
            } else {
                anInt10325 = -374848179 * (int) ((anInt10325 * -374848179 * -2023195771) - (-2023195771 * anInt10325 * -374848179) / 10.0F) * -2023195771;
            }

            matrix44var_4.method5209(matrix44var_2);
            matrix44var_4.method5219(0.0F, (-20 - anInt10325 * -374848179 * -2023195771), 0.0F);
            BASDefinitions renderanimdefs_13 = getRenderAnimDefs();
            NPCDefinitions npcdefinitions_8 = definitions.transformTo != null ? definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER) : definitions;
            aBool10312 = false;
            Class285 class285_9 = null;
            if (Class393.preferences.characterShadows.method12966() == 1 && npcdefinitions_8.aBool4912 && renderanimdefs_13.aBool2787) {
                Animation animation_10 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                MovingAnimation class456_sub3_11 = !aAnimation_Sub3_10337.hasDefs() || aAnimation_Sub3_10337.aBool7891 && animation_10 != null ? null : aAnimation_Sub3_10337;
                MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, anInt10322 * 2085530051 * -35614997, -1768311789 * anInt10323 * 884618779, -628205413 * anInt10363 * -1453470317, 1203434505 * definitions.size * -1156523463, aMeshRasterizerArray10372[0], definitions.aShort4874 & 0xffff, definitions.aShort4897 & 0xffff, definitions.aByte4883 & 0xff, definitions.aByte4899 & 0xff, class456_sub3_11 != null ? class456_sub3_11 : animation_10);
                if (meshrasterizer_12 != null) {
                    if (boundingBoxPolygons == null || boundingBoxPolygons.length < 1 + aMeshRasterizerArray10372.length) {
                        method13008(aMeshRasterizerArray10372.length + 1);
                    }

                    class285_9 = Class470.method7824(method16162());
                    aBool10312 = true;
                    graphicalrenderer_1.RA(false);
                    meshrasterizer_12.method11282(matrix44var_4, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                    graphicalrenderer_1.RA(true);
                }
            }

            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_9 == null) {
                class285_9 = Class470.method7824(method16162());
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_4, false);

            int i_14;
            for (i_14 = 0; i_14 < aMeshRasterizerArray10372.length; i_14++) {
                if (aMeshRasterizerArray10372[i_14] != null) {
                    if (definitions.aBool4920) {
                        aMeshRasterizerArray10372[i_14].PA(anInt10587 * 1113755543 * 812179495, 954646983 * anInt10588 * -1431655765 * 3 * -1912819721, 37639707 * anInt10589 * -62352365, 478845591 * anInt10590 * -331447001);
                    }

                    aMeshRasterizerArray10372[i_14].method11282(matrix44var_4, boundingBoxPolygons[i_14], 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_15 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_15);
            }

            for (i_14 = 0; i_14 < aMeshRasterizerArray10372.length; i_14++) {
                if (aMeshRasterizerArray10372[i_14] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_14].i();
                }

                aMeshRasterizerArray10372[i_14] = null;
            }

            anInt10349 = client.anInt7286 * 1895928101 * 1178121955 * -2009373393;
            return class285_9;
        } else {
            return null;
        }
    }

    public void method16164(String string_1) {
        int i_5 = Class204.getFpsCap() * QuickchatFiller.ENTITY_DEFAULTS.npcMessageDuration;
        method15875(string_1, 0, 0, i_5);
    }

    @Override
    public Class163 method15852() {
        return aClass163_10334 != null && aClass163_10334.aString2028 == null ? null : aClass163_10334;
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && method16158(graphicalrenderer_1, 526336)) {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Matrix44Var matrix44var_5 = graphicalrenderer_1.method8450();
            int i_6 = aClass19_10359.method578();
            Class293 class293_7 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_7 != null && class293_7.aTransform_Sub1_Sub3_3499 != null) {
                int i_8 = anInt10325 - class293_7.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = (int) (anInt10325 - i_8 / 10.0F);
            } else {
                anInt10325 = (int) (anInt10325 - anInt10325 / 10.0F);
            }

            matrix44var_5.method5209(matrix44var_3);
            matrix44var_5.method5219(0.0F, (-20 - anInt10325), 0.0F);
            BASDefinitions renderanimdefs_14 = getRenderAnimDefs();
            NPCDefinitions npcdefinitions_9 = definitions.transformTo != null ? definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER) : definitions;
            aBool10312 = false;
            Class285 class285_10 = null;
            if (Class393.preferences.characterShadows.method12966() == 1 && npcdefinitions_9.aBool4912 && renderanimdefs_14.aBool2787) {
                Animation animation_11 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                MovingAnimation class456_sub3_12 = !aAnimation_Sub3_10337.hasDefs() || aAnimation_Sub3_10337.aBool7891 && animation_11 != null ? null : aAnimation_Sub3_10337;
                MeshRasterizer meshrasterizer_13 = SongReference.method1969(graphicalrenderer_1, anInt10322, anInt10323, anInt10363, definitions.size, aMeshRasterizerArray10372[0], definitions.aShort4874 & 0xffff, definitions.aShort4897 & 0xffff, definitions.aByte4883 & 0xff, definitions.aByte4899 & 0xff, class456_sub3_12 != null ? class456_sub3_12 : animation_11);
                if (meshrasterizer_13 != null) {
                    if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length + 1) {
                        method13008(aMeshRasterizerArray10372.length + 1);
                    }

                    class285_10 = Class470.method7824(method16162());
                    aBool10312 = true;
                    graphicalrenderer_1.RA(false);
                    meshrasterizer_13.method11282(matrix44var_5, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                    graphicalrenderer_1.RA(true);
                }
            }

            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_10 == null) {
                class285_10 = Class470.method7824(method16162());
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_5, false);

            int i_15;
            for (i_15 = 0; i_15 < aMeshRasterizerArray10372.length; i_15++) {
                if (aMeshRasterizerArray10372[i_15] != null) {
                    if (definitions.aBool4920) {
                        aMeshRasterizerArray10372[i_15].PA(anInt10587, anInt10588, anInt10589, anInt10590);
                    }

                    aMeshRasterizerArray10372[i_15].method11282(matrix44var_5, boundingBoxPolygons[i_15], 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_16 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_16);
            }

            for (i_15 = 0; i_15 < aMeshRasterizerArray10372.length; i_15++) {
                if (aMeshRasterizerArray10372[i_15] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_15].i();
                }

                aMeshRasterizerArray10372[i_15] = null;
            }

            anInt10349 = client.anInt7286;
            return class285_10;
        } else {
            return null;
        }
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && method16158(graphicalrenderer_1, 526336)) {
            Matrix44Var matrix44var_2 = method11168();
            CoordinateSpace class305_3 = method11166();
            Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
            int i_5 = aClass19_10359.method578();
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_3.coords.x >> 9][(int) class305_3.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                int i_7 = anInt10325 * -374848179 * -2023195771 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = -374848179 * (int) ((-2023195771 * anInt10325 * -374848179) - i_7 / 10.0F) * -2023195771;
            } else {
                anInt10325 = -374848179 * (int) ((anInt10325 * -374848179 * -2023195771) - (-2023195771 * anInt10325 * -374848179) / 10.0F) * -2023195771;
            }

            matrix44var_4.method5209(matrix44var_2);
            matrix44var_4.method5219(0.0F, (-20 - anInt10325 * -374848179 * -2023195771), 0.0F);
            BASDefinitions renderanimdefs_13 = getRenderAnimDefs();
            NPCDefinitions npcdefinitions_8 = definitions.transformTo != null ? definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER) : definitions;
            aBool10312 = false;
            Class285 class285_9 = null;
            if (Class393.preferences.characterShadows.method12966() == 1 && npcdefinitions_8.aBool4912 && renderanimdefs_13.aBool2787) {
                Animation animation_10 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                MovingAnimation class456_sub3_11 = !aAnimation_Sub3_10337.hasDefs() || aAnimation_Sub3_10337.aBool7891 && animation_10 != null ? null : aAnimation_Sub3_10337;
                MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, anInt10322 * 2085530051 * -35614997, -1768311789 * anInt10323 * 884618779, -628205413 * anInt10363 * -1453470317, 1203434505 * definitions.size * -1156523463, aMeshRasterizerArray10372[0], definitions.aShort4874 & 0xffff, definitions.aShort4897 & 0xffff, definitions.aByte4883 & 0xff, definitions.aByte4899 & 0xff, class456_sub3_11 != null ? class456_sub3_11 : animation_10);
                if (meshrasterizer_12 != null) {
                    if (boundingBoxPolygons == null || boundingBoxPolygons.length < 1 + aMeshRasterizerArray10372.length) {
                        method13008(aMeshRasterizerArray10372.length + 1);
                    }

                    class285_9 = Class470.method7824(method16162());
                    aBool10312 = true;
                    graphicalrenderer_1.RA(false);
                    meshrasterizer_12.method11282(matrix44var_4, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                    graphicalrenderer_1.RA(true);
                }
            }

            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_9 == null) {
                class285_9 = Class470.method7824(method16162());
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_4, false);

            int i_14;
            for (i_14 = 0; i_14 < aMeshRasterizerArray10372.length; i_14++) {
                if (aMeshRasterizerArray10372[i_14] != null) {
                    if (definitions.aBool4920) {
                        aMeshRasterizerArray10372[i_14].PA(anInt10587 * 1113755543 * 812179495, 954646983 * anInt10588 * -1431655765 * 3 * -1912819721, 37639707 * anInt10589 * -62352365, 478845591 * anInt10590 * -331447001);
                    }

                    aMeshRasterizerArray10372[i_14].method11282(matrix44var_4, boundingBoxPolygons[i_14], 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_15 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_15);
            }

            for (i_14 = 0; i_14 < aMeshRasterizerArray10372.length; i_14++) {
                if (aMeshRasterizerArray10372[i_14] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_14].i();
                }

                aMeshRasterizerArray10372[i_14] = null;
            }

            anInt10349 = client.anInt7286 * 1895928101 * 1178121955 * -2009373393;
            return class285_9;
        } else {
            return null;
        }
    }

    @Override
    public int method15897() {
        if (definitions.transformTo != null) {
            NPCDefinitions npcdefinitions_1 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            if (npcdefinitions_1 != null && 327817917 * npcdefinitions_1.anInt4918 * 1094135957 != -1) {
                return npcdefinitions_1.anInt4918 * 1094135957 * 327817917;
            }
        }

        return 327817917 * definitions.anInt4918 * 1094135957;
    }

    @Override
    public boolean method15887() {
        return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
    }

    @Override
    public Class163 method15811() {
        return aClass163_10334 != null && aClass163_10334.aString2028 == null ? null : aClass163_10334;
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    public void setDefinition(NPCDefinitions npcdefinitions_1) {
        if (npcdefinitions_1 != definitions && Class20.aBool161 && EnumIndexLoader.method7426(index)) {
            Class316.method5594();
        }

        definitions = npcdefinitions_1;
        if (definitions != null) {
            modifiedName = definitions.name;
            anInt10582 = definitions.combatLevel;
        }

        if (aClass539_10369 != null) {
            aClass539_10369.method11505();
        }

    }

    @Override
    int method15868() {
        if (-343399559 * anInt10575 * -1914841399 != -1) {
            return anInt10575 * -1914841399 * -343399559;
        } else {
            if (definitions.transformTo != null) {
                NPCDefinitions npcdefinitions_1 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
                if (npcdefinitions_1 != null && npcdefinitions_1.renderEmote * -318852007 * -490908695 != -1) {
                    return -490908695 * npcdefinitions_1.renderEmote * -318852007;
                }
            }

            return definitions.renderEmote * -318852007 * -490908695;
        }
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    public boolean method15872() {
        return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
    }

    @Override
    public boolean method15873() {
        return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
    }

    @Override
    public boolean method15814() {
        return QuickchatFiller.ENTITY_DEFAULTS.npcMessagesEnabled;
    }

    @Override
    public Class163 method15809() {
        return aClass163_10334 != null && aClass163_10334.aString2028 == null ? null : aClass163_10334;
    }

    @Override
    public Class163 method15876() {
        return aClass163_10334 != null && aClass163_10334.aString2028 == null ? null : aClass163_10334;
    }

    @Override
    public Class163 method15877() {
        return aClass163_10334 != null && aClass163_10334.aString2028 == null ? null : aClass163_10334;
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    int method15867() {
        if (-343399559 * anInt10575 * -1914841399 != -1) {
            return anInt10575 * -1914841399 * -343399559;
        } else {
            if (definitions.transformTo != null) {
                NPCDefinitions npcdefinitions_1 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
                if (npcdefinitions_1 != null && npcdefinitions_1.renderEmote * -318852007 * -490908695 != -1) {
                    return -490908695 * npcdefinitions_1.renderEmote * -318852007;
                }
            }

            return definitions.renderEmote * -318852007 * -490908695;
        }
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        if (definitions != null && method16158(graphicalrenderer_1, 131072)) {
            Matrix44Var matrix44var_4 = method11168();
            boolean bool_5 = false;

            int i_6;
            for (i_6 = 0; i_6 < aMeshRasterizerArray10372.length; i_6++) {
                if (aMeshRasterizerArray10372[i_6] != null) {
                    boolean bool_7;
                    label57:
                    {
                        if (-1894935519 * definitions.anInt4913 * 1057419233 <= 0) {
                            label56:
                            {
                                if (1419481733 * definitions.anInt4917 * -832596403 == -1) {
                                    if (definitions.size * -1156523463 * 1203434505 == 1) {
                                        break label56;
                                    }
                                } else if (definitions.anInt4917 * -832596403 * 1419481733 == 1) {
                                    break label56;
                                }

                                bool_7 = false;
                                break label57;
                            }
                        }

                        bool_7 = true;
                    }

                    boolean bool_9 = aMeshRasterizerArray10372[i_6].method11270(i_2, i_3, matrix44var_4, bool_7, definitions.anInt4913 * 1057419233 * -1894935519);
                    if (bool_9) {
                        bool_5 = true;
                        break;
                    }
                }
            }

            for (i_6 = 0; i_6 < aMeshRasterizerArray10372.length; i_6++) {
                aMeshRasterizerArray10372[i_6] = null;
            }

            return bool_5;
        } else {
            return false;
        }
    }

    public int method16169(int i_1) {
        return currStats[i_1];
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    public int method15804() {
        if (definitions.transformTo != null) {
            NPCDefinitions npcdefinitions_1 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            if (npcdefinitions_1 != null && 327817917 * npcdefinitions_1.anInt4918 * 1094135957 != -1) {
                return npcdefinitions_1.anInt4918 * 1094135957 * 327817917;
            }
        }

        return 327817917 * definitions.anInt4918 * 1094135957;
    }

    @Override
    public int method15874() {
        return 1 + index * -1498872675 * -1691508299;
    }

    @Override
    public int method15892() {
        return 1 + index * -1498872675 * -1691508299;
    }

    @Override
    boolean method13026() {
        return false;
    }

    public void method16179(int i_1, int i_2, int i_3) {
        maxStats[i_1] = i_2;
        currStats[i_1] = i_3;
    }

    @Override
    public int method15899() {
        if (definitions.transformTo != null) {
            NPCDefinitions npcdefinitions_2 = definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
            if (npcdefinitions_2 != null && npcdefinitions_2.anInt4918 != -1) {
                return npcdefinitions_2.anInt4918;
            }
        }

        return definitions.anInt4918;
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && (aBool10370 || method16158(graphicalrenderer_1, 0))) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5209(method11168());
            matrix44var_2.method5219(0.0F, -5.0f, 0.0F);
            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, aBool10370);

            Arrays.fill(aMeshRasterizerArray10372, null);
        }

    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        if (definitions != null && method16158(graphicalrenderer_1, 526336)) {
            Matrix44Var matrix44var_2 = method11168();
            CoordinateSpace class305_3 = method11166();
            Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
            int i_5 = aClass19_10359.method578();
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_3.coords.x >> 9][(int) class305_3.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                int i_7 = anInt10325 * -374848179 * -2023195771 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = -374848179 * (int) ((-2023195771 * anInt10325 * -374848179) - i_7 / 10.0F) * -2023195771;
            } else {
                anInt10325 = -374848179 * (int) ((anInt10325 * -374848179 * -2023195771) - (-2023195771 * anInt10325 * -374848179) / 10.0F) * -2023195771;
            }

            matrix44var_4.method5209(matrix44var_2);
            matrix44var_4.method5219(0.0F, (-20 - anInt10325 * -374848179 * -2023195771), 0.0F);
            BASDefinitions renderanimdefs_13 = getRenderAnimDefs();
            NPCDefinitions npcdefinitions_8 = definitions.transformTo != null ? definitions.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER) : definitions;
            aBool10312 = false;
            Class285 class285_9 = null;
            if (Class393.preferences.characterShadows.method12966() == 1 && npcdefinitions_8.aBool4912 && renderanimdefs_13.aBool2787) {
                Animation animation_10 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                MovingAnimation class456_sub3_11 = !aAnimation_Sub3_10337.hasDefs() || aAnimation_Sub3_10337.aBool7891 && animation_10 != null ? null : aAnimation_Sub3_10337;
                MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, anInt10322 * 2085530051 * -35614997, -1768311789 * anInt10323 * 884618779, -628205413 * anInt10363 * -1453470317, 1203434505 * definitions.size * -1156523463, aMeshRasterizerArray10372[0], definitions.aShort4874 & 0xffff, definitions.aShort4897 & 0xffff, definitions.aByte4883 & 0xff, definitions.aByte4899 & 0xff, class456_sub3_11 != null ? class456_sub3_11 : animation_10);
                if (meshrasterizer_12 != null) {
                    if (boundingBoxPolygons == null || boundingBoxPolygons.length < 1 + aMeshRasterizerArray10372.length) {
                        method13008(aMeshRasterizerArray10372.length + 1);
                    }

                    class285_9 = Class470.method7824(method16162());
                    aBool10312 = true;
                    graphicalrenderer_1.RA(false);
                    meshrasterizer_12.method11282(matrix44var_4, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                    graphicalrenderer_1.RA(true);
                }
            }

            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_9 == null) {
                class285_9 = Class470.method7824(method16162());
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_4, false);

            int i_14;
            for (i_14 = 0; i_14 < aMeshRasterizerArray10372.length; i_14++) {
                if (aMeshRasterizerArray10372[i_14] != null) {
                    if (definitions.aBool4920) {
                        aMeshRasterizerArray10372[i_14].PA(anInt10587 * 1113755543 * 812179495, 954646983 * anInt10588 * -1431655765 * 3 * -1912819721, 37639707 * anInt10589 * -62352365, 478845591 * anInt10590 * -331447001);
                    }

                    aMeshRasterizerArray10372[i_14].method11282(matrix44var_4, boundingBoxPolygons[i_14], 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_15 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_15);
            }

            for (i_14 = 0; i_14 < aMeshRasterizerArray10372.length; i_14++) {
                if (aMeshRasterizerArray10372[i_14] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_14].i();
                }

                aMeshRasterizerArray10372[i_14] = null;
            }

            anInt10349 = client.anInt7286 * 1895928101 * 1178121955 * -2009373393;
            return class285_9;
        } else {
            return null;
        }
    }

    @Override
    public int method15806() {
        return 1 + index * -1498872675 * -1691508299;
    }
}
