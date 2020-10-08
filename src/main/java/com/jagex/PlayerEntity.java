package com.jagex;

import com.Loader;

import java.util.Arrays;

public class PlayerEntity extends PathingEntity {

    public int anInt10569;
    public int anInt10570;
    public byte male;
    public int skullId = -1;
    public int headIconId = -1;
    public int combatLevel;
    public int cbLevelWithSumm;
    public int cbLevelRelated = -1;
    public int elo;
    public int faceDirection = -1;
    public boolean aBool10573;
    public int teamId;
    public int walkingAnimation = -1;
    public int rotate180Animation = -1;
    public int rotate90RightAnimation = -1;
    public int rotate90LeftAnimation = -1;
    public boolean isTransformedNPC;
    public int isNpc;
    public int specialByte = 255;
    public boolean aBool10568;
    public boolean aBool10571;
    public boolean hidden;
    public boolean aBool10550;
    public Class155 aClass155_10561 = new Class155();
    public String username;
    public String displayName;
    public PlayerModel model;
    String prefixTitle;
    String postfixTitle;
    int renderEmote;

    public PlayerEntity(SceneObjectManager sceneobjectmanager_1) {
        super(sceneobjectmanager_1);
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        if (model != null && method16133(graphicalrenderer_1, 2048)) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            int i_5 = aClass19_10359.method578();
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                int i_7 = -2023195771 * anInt10325 * -374848179 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = (int) ((anInt10325 * -374848179 * -2023195771) - i_7 / 10.0F) * -374848179 * -2023195771;
            } else {
                anInt10325 = -374848179 * (int) ((-2023195771 * anInt10325 * -374848179) - (anInt10325 * -374848179 * -2023195771) / 10.0F) * -2023195771;
            }

            matrix44var_2.method5209(matrix44var_3);
            matrix44var_2.method5219(0.0F, (-20 - -2023195771 * anInt10325 * -374848179), 0.0F);
            Class285 class285_17 = null;
            aBool10312 = false;
            if (Class393.preferences.characterShadows.method12966() == 1) {
                BASDefinitions renderanimdefs_8 = getRenderAnimDefs();
                if (renderanimdefs_8.aBool2787 && (-977770149 * model.mimickingNpcId * 232890067 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCType(model.mimickingNpcId * 232890067 * -977770149).aBool4912)) {
                    Animation animation_9 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                    MovingAnimation class456_sub3_10 = aAnimation_Sub3_10337.hasDefs() && (!aAnimation_Sub3_10337.aBool7891 || animation_9 == null) ? aAnimation_Sub3_10337 : null;
                    MeshRasterizer meshrasterizer_11 = SongReference.method1969(graphicalrenderer_1, -35614997 * anInt10322 * 2085530051, anInt10323 * 884618779 * -1768311789, -628205413 * anInt10363 * -1453470317, 1, aMeshRasterizerArray10372[0], 0, 0, 160, 240, class456_sub3_10 != null ? class456_sub3_10 : animation_9);
                    if (meshrasterizer_11 != null) {
                        if (boundingBoxPolygons == null || boundingBoxPolygons.length < 1 + aMeshRasterizerArray10372.length) {
                            method13008(aMeshRasterizerArray10372.length + 1);
                        }

                        class285_17 = Class470.method7824(true);
                        aBool10312 = true;
                        graphicalrenderer_1.RA(false);
                        meshrasterizer_11.method11282(matrix44var_2, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                        graphicalrenderer_1.RA(true);
                    }
                }
            }

            int i_18;
            if (this == VertexNormal.MY_PLAYER) {
                for (i_18 = client.HINT_ARROWS.length - 1; i_18 >= 0; --i_18) {
                    HintArrow class180_25 = client.HINT_ARROWS[i_18];
                    if (class180_25 != null && 1869984395 * class180_25.modelId * -669014749 != -1) {
                        int i_13;
                        if (-379447335 * class180_25.targetType * -860161943 == 1) {
                            ObjectNode class282_sub47_26 = (ObjectNode) client.NPC_MAP.get(1505135749 * class180_25.targetIndex * -1443656627);
                            if (class282_sub47_26 != null) {
                                NPCEntity npc_29 = (NPCEntity) class282_sub47_26.anObject8068;
                                Vector3 vector3_12 = Vector3.method6632(npc_29.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                i_13 = (int) vector3_12.x;
                                int i_14 = (int) vector3_12.z;
                                method16136(graphicalrenderer_1, matrix44var_2, i_13, i_14, 1869984395 * class180_25.modelId * -669014749, 92160000L);
                            }
                        }

                        if (class180_25.targetType * -860161943 * -379447335 == 2) {
                            Vector3 vector3_27 = VertexNormal.MY_PLAYER.method11166().coords;
                            long long_19 = class180_25.x * -1582343557 * -51612493 - (int) vector3_27.x;
                            long long_21 = class180_25.y * -1351216313 * -1074026889 - (int) vector3_27.z;
                            long long_15 = 1116475963 * class180_25.distance * 1144190707 << 9;
                            long_15 *= long_15;
                            method16136(graphicalrenderer_1, matrix44var_2, long_19, long_21, class180_25.modelId * -669014749 * 1869984395, long_15);
                        }

                        if (-379447335 * class180_25.targetType * -860161943 == 10 && 1505135749 * class180_25.targetIndex * -1443656627 >= 0 && 1505135749 * class180_25.targetIndex * -1443656627 < client.players.length) {
                            PlayerEntity player_28 = client.players[1505135749 * class180_25.targetIndex * -1443656627];
                            if (player_28 != null) {
                                Vector3 vector3_30 = Vector3.method6632(player_28.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                int i_23 = (int) vector3_30.x;
                                i_13 = (int) vector3_30.z;
                                method16136(graphicalrenderer_1, matrix44var_2, i_23, i_13, class180_25.modelId * -669014749 * 1869984395, 92160000L);
                            }
                        }
                    }
                }
            }

            matrix44var_2.method5209(matrix44var_3);
            matrix44var_2.method5219(0.0F, (-5 - -2023195771 * anInt10325 * -374848179), 0.0F);
            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_17 == null) {
                class285_17 = Class470.method7824(true);
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, false);

            for (i_18 = 0; i_18 < aMeshRasterizerArray10372.length; i_18++) {
                if (aMeshRasterizerArray10372[i_18] != null) {
                    aMeshRasterizerArray10372[i_18].method11282(matrix44var_2, boundingBoxPolygons[i_18], this == VertexNormal.MY_PLAYER ? 1 : 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_24 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_24);
            }

            for (i_18 = 0; i_18 < aMeshRasterizerArray10372.length; i_18++) {
                if (aMeshRasterizerArray10372[i_18] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_18].i();
                }

                aMeshRasterizerArray10372[i_18] = null;
            }

            anInt10349 = 1178121955 * client.anInt7286 * 1895928101 * -2009373393;
            return class285_17;
        } else {
            return null;
        }
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        if (model != null && (aBool10370 || method16133(graphicalrenderer_1, 0))) {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            matrix44var_3.method5210(method11166());
            matrix44var_3.method5219(0.0F, -5.0f, 0.0F);
            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_3, aBool10370);

            Arrays.fill(aMeshRasterizerArray10372, null);
        }

    }

    public boolean hasAppearance() {
        return model != null;
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        if (model != null && (aBool10370 || method16133(graphicalrenderer_1, 0))) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5210(method11166());
            matrix44var_2.method5219(0.0F, -5.0f, 0.0F);
            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, aBool10370);

            Arrays.fill(aMeshRasterizerArray10372, null);
        }

    }

    public String getUsernameWithTitle() {
        String str_3 = "";
        if (prefixTitle != null) {
            str_3 = prefixTitle;
        }

        str_3 += username;
        if (postfixTitle != null) {
            str_3 += postfixTitle;
        }

        return str_3;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void method16129(int i_1, int i_2, byte b_3) {
        if (currentAnimation.hasDefs() && currentAnimation.getDefs().walkingPrecedence == 1) {
            currentAnimations = null;
            currentAnimation.update(-1);
        }

        for (int i_5 = 0; i_5 < spotAnims.length; i_5++) {
            if (spotAnims[i_5].spotAnimId != -1) {
                SpotAnimDefinitions spotanimdefinitions_6 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnims[i_5].spotAnimId);
                if (spotanimdefinitions_6.aBool6968 && spotanimdefinitions_6.animationId != -1 && IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_6.animationId).walkingPrecedence == 1) {
                    spotAnims[i_5].animation.update(-1);
                    spotAnims[i_5].spotAnimId = -1;
                }
            }
        }

        faceDirection = -1;
        if (i_1 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_2 >= 0 && i_2 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
            if (regionBaseX[0] >= 0 && regionBaseX[0] < IndexLoaders.MAP_REGION_DECODER.getSizeX() && regionBaseY[0] >= 0 && regionBaseY[0] < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
                if (b_3 == MoveSpeed.RUNNING.id) {
                    Class512.method8762(this, i_1, i_2, MoveSpeed.RUNNING.id);
                }

                method16132(i_1, i_2, b_3);
            } else {
                move(i_1, i_2);
            }
        } else {
            move(i_1, i_2);
        }

    }

    public void move(int i_1, int i_2) {
        anInt10355 = 0;
        anInt10367 = 0;
        anInt10366 = 0;
        regionBaseX[0] = i_1;
        regionBaseY[0] = i_2;
        int i_4 = getSize();
        Vector3 vector3_5 = Vector3.popVectorStackTo(method11166().coords);
        vector3_5.x = (i_4 * 256 + regionBaseX[0] * 512);
        vector3_5.z = (regionBaseY[0] * 512 + i_4 * 256);
        method11171(vector3_5);
        vector3_5.pushVectorStack();
        if (this == VertexNormal.MY_PLAYER) {
            IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
        }

        if (aClass539_10369 != null) {
            aClass539_10369.method11505();
        }

    }

    @Override
    public boolean method15887() {
        return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
    }

    @Override
    public int getSize() {
        return model != null && model.mimickingNpcId != -1 ? IndexLoaders.NPC_INDEX_LOADER.getNPCType(model.mimickingNpcId).size : super.getSize();
    }

    @Override
    int getRenderAnimation() {
        return renderEmote;
    }

    @Override
    public int method15899() {
        return -1;
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        if (model != null && method16133(graphicalrenderer_1, 131072)) {
            Matrix44Var matrix44var_5 = method11168();
            boolean bool_6 = false;

            int i_7;
            for (i_7 = 0; i_7 < aMeshRasterizerArray10372.length; i_7++) {
                if (aMeshRasterizerArray10372[i_7] != null && aMeshRasterizerArray10372[i_7].method11270(i_2, i_3, matrix44var_5, true, 0)) {
                    bool_6 = true;
                    break;
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
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    public void method16132(int i_1, int i_2, byte b_3) {
        if (anInt10355 < regionBaseX.length - 1) {
            ++anInt10355;
        }

        for (int i_5 = anInt10355; i_5 > 0; --i_5) {
            regionBaseX[i_5] = regionBaseX[i_5 - 1];
            regionBaseY[i_5] = regionBaseY[i_5 - 1];
            walkTypes[i_5] = walkTypes[i_5 - 1];
        }

        regionBaseX[0] = i_1;
        regionBaseY[0] = i_2;
        walkTypes[0] = b_3;
    }

    boolean method16133(AbstractRenderer graphicalrenderer_1, int i_2) {
        int i_4 = i_2;
        BASDefinitions renderanimdefs_5 = getRenderAnimDefs();
        Animation animation_6 = currentAnimation.hasDefs() && !currentAnimation.hasSpeed() ? currentAnimation : null;
        MovingAnimation class456_sub3_7 = !aAnimation_Sub3_10337.hasDefs() || aBool10573 || aAnimation_Sub3_10337.aBool7891 && animation_6 != null ? null : aAnimation_Sub3_10337;
        int i_8 = renderanimdefs_5.anInt2786;
        int i_9 = renderanimdefs_5.anInt2829;
        if (i_8 != 0 || i_9 != 0 || renderanimdefs_5.anInt2824 != 0 || renderanimdefs_5.anInt2827 != 0) {
            i_2 |= 0x7;
        }

        int i_10 = aClass19_10359.method578();
        boolean bool_11 = scalar != 0 && client.CYCLES_20MS >= anInt10347 && client.CYCLES_20MS < anInt10348;
        if (bool_11) {
            i_2 |= 0x80000;
        }

        MeshRasterizer meshrasterizer_12 = aMeshRasterizerArray10372[0] = model.getBodyModel(graphicalrenderer_1, i_2, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, animation_6, class456_sub3_7, aAnimation_Sub2_Sub1Array10354, anIntArray10362, i_10, LinkedNodeList.EQUIPMENT_DEFAULTS);
        int i_13 = Class46.method932();
        if (Engine.MAX_MEMORY < 96 && i_13 > 50) {
            JS5CacheFile.method3359();
        }

        if (HDWaterTile.SERVER_ENVIRONMENT != ServerEnvironment.LIVE && i_13 < 50) {
            int i_14;
            for (i_14 = 50 - i_13; i_14 > client.anInt7173; client.anInt7173++) {
                Class339.aByteArrayArray3986[client.anInt7173] = new byte[102400];
            }

            while (i_14 < client.anInt7173) {
                --client.anInt7173;
                Class339.aByteArrayArray3986[client.anInt7173] = null;
            }
        } else if (HDWaterTile.SERVER_ENVIRONMENT != ServerEnvironment.LIVE) {
            Class339.aByteArrayArray3986 = new byte[50][];
            client.anInt7173 = 0;
        }

        if (meshrasterizer_12 == null) {
            return false;
        } else {
            anInt10317 = meshrasterizer_12.YA();
            meshrasterizer_12.n();
            method15819(meshrasterizer_12);
            if (i_8 == 0 && i_9 == 0) {
                method15895(i_10, getSize() << 9, getSize() << 9, 0, 0);
            } else {
                method15895(i_10, i_8, i_9, renderanimdefs_5.anInt2813, renderanimdefs_5.anInt2790);
                if (anInt10322 != 0) {
                    meshrasterizer_12.t(anInt10322);
                }

                if (anInt10323 != 0) {
                    meshrasterizer_12.EA(anInt10323);
                }

                if (anInt10363 != 0) {
                    meshrasterizer_12.ia(0, anInt10363, 0);
                }
            }

            if (bool_11) {
                meshrasterizer_12.PA(redAdd, greenAdd, blueAdd, scalar & 0xff);
            }

            if (!aBool10573) {
                method15837(graphicalrenderer_1, renderanimdefs_5, i_4, i_8, i_9, i_10);
            }

            return true;
        }
    }

    public void sendChat(String string_1, int i_2, int i_3) {
        method15875(string_1, i_2, i_3, Class204.getFpsCap() * QuickchatFiller.ENTITY_DEFAULTS.playerMessageDuration);
    }

    @Override
    public int getCS2Index() {
        return -index - 1;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        if (model != null && method16133(graphicalrenderer_1, 2048)) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            int i_5 = aClass19_10359.method578();
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                int i_7 = -2023195771 * anInt10325 * -374848179 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = (int) ((anInt10325 * -374848179 * -2023195771) - i_7 / 10.0F) * -374848179 * -2023195771;
            } else {
                anInt10325 = -374848179 * (int) ((-2023195771 * anInt10325 * -374848179) - (anInt10325 * -374848179 * -2023195771) / 10.0F) * -2023195771;
            }

            matrix44var_2.method5209(matrix44var_3);
            matrix44var_2.method5219(0.0F, (-20 - -2023195771 * anInt10325 * -374848179), 0.0F);
            Class285 class285_17 = null;
            aBool10312 = false;
            if (Class393.preferences.characterShadows.method12966() == 1) {
                BASDefinitions renderanimdefs_8 = getRenderAnimDefs();
                if (renderanimdefs_8.aBool2787 && (-977770149 * model.mimickingNpcId * 232890067 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCType(model.mimickingNpcId * 232890067 * -977770149).aBool4912)) {
                    Animation animation_9 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                    MovingAnimation class456_sub3_10 = aAnimation_Sub3_10337.hasDefs() && (!aAnimation_Sub3_10337.aBool7891 || animation_9 == null) ? aAnimation_Sub3_10337 : null;
                    MeshRasterizer meshrasterizer_11 = SongReference.method1969(graphicalrenderer_1, -35614997 * anInt10322 * 2085530051, anInt10323 * 884618779 * -1768311789, -628205413 * anInt10363 * -1453470317, 1, aMeshRasterizerArray10372[0], 0, 0, 160, 240, class456_sub3_10 != null ? class456_sub3_10 : animation_9);
                    if (meshrasterizer_11 != null) {
                        if (boundingBoxPolygons == null || boundingBoxPolygons.length < 1 + aMeshRasterizerArray10372.length) {
                            method13008(aMeshRasterizerArray10372.length + 1);
                        }

                        class285_17 = Class470.method7824(true);
                        aBool10312 = true;
                        graphicalrenderer_1.RA(false);
                        meshrasterizer_11.method11282(matrix44var_2, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                        graphicalrenderer_1.RA(true);
                    }
                }
            }

            int i_18;
            if (this == VertexNormal.MY_PLAYER) {
                for (i_18 = client.HINT_ARROWS.length - 1; i_18 >= 0; --i_18) {
                    HintArrow class180_25 = client.HINT_ARROWS[i_18];
                    if (class180_25 != null && 1869984395 * class180_25.modelId * -669014749 != -1) {
                        int i_13;
                        if (-379447335 * class180_25.targetType * -860161943 == 1) {
                            ObjectNode class282_sub47_26 = (ObjectNode) client.NPC_MAP.get(1505135749 * class180_25.targetIndex * -1443656627);
                            if (class282_sub47_26 != null) {
                                NPCEntity npc_29 = (NPCEntity) class282_sub47_26.anObject8068;
                                Vector3 vector3_12 = Vector3.method6632(npc_29.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                i_13 = (int) vector3_12.x;
                                int i_14 = (int) vector3_12.z;
                                method16136(graphicalrenderer_1, matrix44var_2, i_13, i_14, 1869984395 * class180_25.modelId * -669014749, 92160000L);
                            }
                        }

                        if (class180_25.targetType * -860161943 * -379447335 == 2) {
                            Vector3 vector3_27 = VertexNormal.MY_PLAYER.method11166().coords;
                            long long_19 = class180_25.x * -1582343557 * -51612493 - (int) vector3_27.x;
                            long long_21 = class180_25.y * -1351216313 * -1074026889 - (int) vector3_27.z;
                            long long_15 = 1116475963 * class180_25.distance * 1144190707 << 9;
                            long_15 *= long_15;
                            method16136(graphicalrenderer_1, matrix44var_2, long_19, long_21, class180_25.modelId * -669014749 * 1869984395, long_15);
                        }

                        if (-379447335 * class180_25.targetType * -860161943 == 10 && 1505135749 * class180_25.targetIndex * -1443656627 >= 0 && 1505135749 * class180_25.targetIndex * -1443656627 < client.players.length) {
                            PlayerEntity player_28 = client.players[1505135749 * class180_25.targetIndex * -1443656627];
                            if (player_28 != null) {
                                Vector3 vector3_30 = Vector3.method6632(player_28.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                int i_23 = (int) vector3_30.x;
                                i_13 = (int) vector3_30.z;
                                method16136(graphicalrenderer_1, matrix44var_2, i_23, i_13, class180_25.modelId * -669014749 * 1869984395, 92160000L);
                            }
                        }
                    }
                }
            }

            matrix44var_2.method5209(matrix44var_3);
            matrix44var_2.method5219(0.0F, (-5 - -2023195771 * anInt10325 * -374848179), 0.0F);
            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_17 == null) {
                class285_17 = Class470.method7824(true);
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, false);

            for (i_18 = 0; i_18 < aMeshRasterizerArray10372.length; i_18++) {
                if (aMeshRasterizerArray10372[i_18] != null) {
                    aMeshRasterizerArray10372[i_18].method11282(matrix44var_2, boundingBoxPolygons[i_18], this == VertexNormal.MY_PLAYER ? 1 : 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_24 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_24);
            }

            for (i_18 = 0; i_18 < aMeshRasterizerArray10372.length; i_18++) {
                if (aMeshRasterizerArray10372[i_18] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_18].i();
                }

                aMeshRasterizerArray10372[i_18] = null;
            }

            anInt10349 = 1178121955 * client.anInt7286 * 1895928101 * -2009373393;
            return class285_17;
        } else {
            return null;
        }
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        if (model != null && method16133(graphicalrenderer_1, 2048)) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            int i_5 = aClass19_10359.method578();
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                int i_7 = -2023195771 * anInt10325 * -374848179 - class293_6.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = (int) ((anInt10325 * -374848179 * -2023195771) - i_7 / 10.0F) * -374848179 * -2023195771;
            } else {
                anInt10325 = -374848179 * (int) ((-2023195771 * anInt10325 * -374848179) - (anInt10325 * -374848179 * -2023195771) / 10.0F) * -2023195771;
            }

            matrix44var_2.method5209(matrix44var_3);
            matrix44var_2.method5219(0.0F, (-20 - -2023195771 * anInt10325 * -374848179), 0.0F);
            Class285 class285_17 = null;
            aBool10312 = false;
            if (Class393.preferences.characterShadows.method12966() == 1) {
                BASDefinitions renderanimdefs_8 = getRenderAnimDefs();
                if (renderanimdefs_8.aBool2787 && (-977770149 * model.mimickingNpcId * 232890067 == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCType(model.mimickingNpcId * 232890067 * -977770149).aBool4912)) {
                    Animation animation_9 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                    MovingAnimation class456_sub3_10 = aAnimation_Sub3_10337.hasDefs() && (!aAnimation_Sub3_10337.aBool7891 || animation_9 == null) ? aAnimation_Sub3_10337 : null;
                    MeshRasterizer meshrasterizer_11 = SongReference.method1969(graphicalrenderer_1, -35614997 * anInt10322 * 2085530051, anInt10323 * 884618779 * -1768311789, -628205413 * anInt10363 * -1453470317, 1, aMeshRasterizerArray10372[0], 0, 0, 160, 240, class456_sub3_10 != null ? class456_sub3_10 : animation_9);
                    if (meshrasterizer_11 != null) {
                        if (boundingBoxPolygons == null || boundingBoxPolygons.length < 1 + aMeshRasterizerArray10372.length) {
                            method13008(aMeshRasterizerArray10372.length + 1);
                        }

                        class285_17 = Class470.method7824(true);
                        aBool10312 = true;
                        graphicalrenderer_1.RA(false);
                        meshrasterizer_11.method11282(matrix44var_2, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                        graphicalrenderer_1.RA(true);
                    }
                }
            }

            int i_18;
            if (this == VertexNormal.MY_PLAYER) {
                for (i_18 = client.HINT_ARROWS.length - 1; i_18 >= 0; --i_18) {
                    HintArrow class180_25 = client.HINT_ARROWS[i_18];
                    if (class180_25 != null && 1869984395 * class180_25.modelId * -669014749 != -1) {
                        int i_13;
                        if (-379447335 * class180_25.targetType * -860161943 == 1) {
                            ObjectNode class282_sub47_26 = (ObjectNode) client.NPC_MAP.get(1505135749 * class180_25.targetIndex * -1443656627);
                            if (class282_sub47_26 != null) {
                                NPCEntity npc_29 = (NPCEntity) class282_sub47_26.anObject8068;
                                Vector3 vector3_12 = Vector3.method6632(npc_29.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                i_13 = (int) vector3_12.x;
                                int i_14 = (int) vector3_12.z;
                                method16136(graphicalrenderer_1, matrix44var_2, i_13, i_14, 1869984395 * class180_25.modelId * -669014749, 92160000L);
                            }
                        }

                        if (class180_25.targetType * -860161943 * -379447335 == 2) {
                            Vector3 vector3_27 = VertexNormal.MY_PLAYER.method11166().coords;
                            long long_19 = class180_25.x * -1582343557 * -51612493 - (int) vector3_27.x;
                            long long_21 = class180_25.y * -1351216313 * -1074026889 - (int) vector3_27.z;
                            long long_15 = 1116475963 * class180_25.distance * 1144190707 << 9;
                            long_15 *= long_15;
                            method16136(graphicalrenderer_1, matrix44var_2, long_19, long_21, class180_25.modelId * -669014749 * 1869984395, long_15);
                        }

                        if (-379447335 * class180_25.targetType * -860161943 == 10 && 1505135749 * class180_25.targetIndex * -1443656627 >= 0 && 1505135749 * class180_25.targetIndex * -1443656627 < client.players.length) {
                            PlayerEntity player_28 = client.players[1505135749 * class180_25.targetIndex * -1443656627];
                            if (player_28 != null) {
                                Vector3 vector3_30 = Vector3.method6632(player_28.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                int i_23 = (int) vector3_30.x;
                                i_13 = (int) vector3_30.z;
                                method16136(graphicalrenderer_1, matrix44var_2, i_23, i_13, class180_25.modelId * -669014749 * 1869984395, 92160000L);
                            }
                        }
                    }
                }
            }

            matrix44var_2.method5209(matrix44var_3);
            matrix44var_2.method5219(0.0F, (-5 - -2023195771 * anInt10325 * -374848179), 0.0F);
            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_17 == null) {
                class285_17 = Class470.method7824(true);
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, false);

            for (i_18 = 0; i_18 < aMeshRasterizerArray10372.length; i_18++) {
                if (aMeshRasterizerArray10372[i_18] != null) {
                    aMeshRasterizerArray10372[i_18].method11282(matrix44var_2, boundingBoxPolygons[i_18], this == VertexNormal.MY_PLAYER ? 1 : 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_24 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_24);
            }

            for (i_18 = 0; i_18 < aMeshRasterizerArray10372.length; i_18++) {
                if (aMeshRasterizerArray10372[i_18] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_18].i();
                }

                aMeshRasterizerArray10372[i_18] = null;
            }

            anInt10349 = 1178121955 * client.anInt7286 * 1895928101 * -2009373393;
            return class285_17;
        } else {
            return null;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        if (model != null && (aBool10370 || method16133(graphicalrenderer_1, 0))) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            matrix44var_2.method5210(method11166());
            matrix44var_2.method5219(0.0F, -5.0f, 0.0F);
            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_2, aBool10370);

            Arrays.fill(aMeshRasterizerArray10372, null);
        }

    }

    @Override
    public boolean method15871() {
        return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
    }

    @Override
    boolean method13026() {
        return false;
    }

    @Override
    public int method15804() {
        return -1;
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    void method16136(AbstractRenderer graphicalrenderer_1, Matrix44Var matrix44var_2, long long_4, long long_6, int i_8, long long_9) {
        long long_11 = long_4 * long_4 + long_6 * long_6;
        if (long_11 >= 262144L && long_11 <= long_9) {
            int i_13 = (int) (Math.atan2(long_4, long_6) * 2607.5945876176133D - aClass19_10359.method578()) & 0x3fff;
            MeshRasterizer meshrasterizer_14 = Defaults7Loader.method8752(graphicalrenderer_1, i_13, anInt10322, anInt10323, anInt10363, i_8);
            if (meshrasterizer_14 != null) {
                graphicalrenderer_1.RA(false);
                meshrasterizer_14.method11282(matrix44var_2, null, 0);
                graphicalrenderer_1.RA(true);
            }
        }

    }

    @Override
    int method15867() {
        return renderEmote * -900819287 * 1628597657;
    }

    @Override
    int method15868() {
        return renderEmote * -900819287 * 1628597657;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public boolean method15872() {
        return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
    }

    @Override
    public boolean method15873() {
        return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
    }

    @Override
    public boolean method15814() {
        return QuickchatFiller.ENTITY_DEFAULTS.enablePlayerMessages;
    }

    @Override
    public Class163 method15809() {
        if (aClass163_10334 != null) {
            if (aClass163_10334.aString2028 == null) {
                return null;
            }

            if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && Static.isFriend(displayName)) {
                return aClass163_10334;
            }
        }

        return null;
    }

    @Override
    public Class163 method15876() {
        if (aClass163_10334 != null) {
            if (aClass163_10334.aString2028 == null) {
                return null;
            }

            if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && Static.isFriend(displayName)) {
                return aClass163_10334;
            }
        }

        return null;
    }

    @Override
    public Class163 method15877() {
        if (aClass163_10334 != null) {
            if (aClass163_10334.aString2028 == null) {
                return null;
            }

            if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && Static.isFriend(displayName)) {
                return aClass163_10334;
            }
        }

        return null;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        if (model != null && method16133(graphicalrenderer_1, 131072)) {
            Matrix44Var matrix44var_4 = method11168();
            boolean bool_5 = false;

            int i_6;
            for (i_6 = 0; i_6 < aMeshRasterizerArray10372.length; i_6++) {
                if (aMeshRasterizerArray10372[i_6] != null && aMeshRasterizerArray10372[i_6].method11270(i_2, i_3, matrix44var_4, true, 0)) {
                    bool_5 = true;
                    break;
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

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    public void decodeAppearance(ByteBuf buffer) {
        buffer.index = 0;
        int flags = buffer.readUnsignedByte();
        male = (byte) (flags & 0x1);
        boolean transformedBefore = isTransformedNPC;
        isTransformedNPC = (flags & 0x2) != 0;
        boolean showElo = (flags & 0x4) != 0;
        int size = super.getSize();
        setBoundSize((flags >> 3 & 0x7) + 1);
        boolean titleBefore = (flags & 0x40) != 0;
        boolean titleAfter = (flags & 0x80) != 0;
        Vector3 vecSize = Vector3.popVectorStackTo(method11166().coords);
        vecSize.x += (getSize() - size << 8);
        vecSize.z += (getSize() - size << 8);
        method11171(vecSize);
        vecSize.pushVectorStack();
        if (titleBefore) {
            prefixTitle = buffer.readGJString();
        } else {
            prefixTitle = null;
        }

        if (titleAfter) {
            postfixTitle = buffer.readGJString();
        } else {
            postfixTitle = null;
        }

        skullId = buffer.readByte();
        headIconId = buffer.readByte();
        hidden = buffer.readByte() == 1;
        if (HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.LIVE && client.PLAYER_RIGHTS >= 2) {
            hidden = false;
        }

        int i_10 = -1;
        teamId = 0;
        int[] bodyAppearances = new int[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
        MeshModifier[] modifiedMeshes = new MeshModifier[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
        ItemDefinitions[] wornItems = new ItemDefinitions[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];

        int i;
        int i_15;
        int i_16;
        int itemId;
        int i_18;
        for (i = 0; i < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i++) {
            if (LinkedNodeList.EQUIPMENT_DEFAULTS.hidden[i] != 1) {
                i_15 = buffer.readUnsignedByte();
                if (i_15 == 0) {
                    bodyAppearances[i] = 0;
                } else {
                    i_16 = buffer.readUnsignedByte();
                    itemId = i_16 + (i_15 << 8);
                    if (i == 0 && itemId == 65535) {
                        i_10 = buffer.readBigSmart();
                        teamId = buffer.readUnsignedByte();
                        break;
                    }

                    if (itemId >= 16384) {
                        itemId -= 16384;
                        bodyAppearances[i] = itemId | 0x40000000;
                        wornItems[i] = IndexLoaders.ITEM_LOADER.getItemDefinitions(itemId);
                        i_18 = wornItems[i].teamId;
                        if (i_18 != 0) {
                            teamId = i_18;
                        }
                    } else {
                        bodyAppearances[i] = itemId - 256 | -2147483648;
                    }
                }
            }
        }

        if (i_10 == -1) {
            i = buffer.readUnsignedShort();
            i_15 = 0;

            for (i_16 = 0; i_16 < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i_16++) {
                if (LinkedNodeList.EQUIPMENT_DEFAULTS.hidden[i_16] == 0) {
                    if ((i & 1 << i_15) != 0) {
                        modifiedMeshes[i_16] = Class506.decodeItemEffects(wornItems[i_16], buffer);
                    }

                    ++i_15;
                }
            }
        }

        int[] ints_21 = new int[10];

        for (i_15 = 0; i_15 < 10; i_15++) {
            i_16 = buffer.readUnsignedByte();
            if (Class366.SKIN_COLORS.length < 1 || i_16 < 0 || i_16 >= Class366.SKIN_COLORS[i_15][0].length) {
                i_16 = 0;
            }

            ints_21[i_15] = i_16;
        }

        renderEmote = buffer.readUnsignedShort();
        username = buffer.readString();
        displayName = username;
        if (this == VertexNormal.MY_PLAYER) {
            RuntimeException_Sub3.MY_PLAYER_USERNAME = username;
        }

        combatLevel = buffer.readUnsignedByte();
        if (showElo) {
            elo = buffer.readUnsignedShort();
            if (elo == 65535) {
                elo = -1;
            }

            cbLevelWithSumm = combatLevel;
            cbLevelRelated = -1;
        } else {
            elo = 0;
            cbLevelWithSumm = buffer.readUnsignedByte();
            cbLevelRelated = buffer.readUnsignedByte();
            if (cbLevelRelated == 255) {
                cbLevelRelated = -1;
            }
        }

        i_15 = isNpc;
        isNpc = buffer.readUnsignedByte();
        if (isNpc != 0) {
            i_16 = walkingAnimation;
            itemId = rotate180Animation;
            i_18 = rotate90RightAnimation;
            int i_19 = rotate90LeftAnimation;
            int i_20 = specialByte;
            walkingAnimation = buffer.readUnsignedShort();
            rotate180Animation = buffer.readUnsignedShort();
            rotate90RightAnimation = buffer.readUnsignedShort();
            rotate90LeftAnimation = buffer.readUnsignedShort();
            specialByte = buffer.readUnsignedByte();
            if (transformedBefore != isTransformedNPC || i_15 != isNpc || i_16 != walkingAnimation || itemId != rotate180Animation || i_18 != rotate90RightAnimation || i_19 != rotate90LeftAnimation || i_20 != specialByte) {
                Static.method6379(this);
            }
        } else {
            Class149_Sub2.method14609(this);
        }

        if (model == null) {
            model = new PlayerModel();
        }

        i_16 = model.mimickingNpcId;
        int[] ints_22 = model.colors;
        model.method3992(getRenderAnimation(), bodyAppearances, modifiedMeshes, ints_21, male == 1, i_10);
        if (i_10 != i_16) {
            vecSize = Vector3.popVectorStackTo(method11166().coords);
            vecSize.x = ((regionBaseX[0] << 9) + (getSize() << 8));
            vecSize.z = ((regionBaseY[0] << 9) + (getSize() << 8));
            method11171(vecSize);
            vecSize.pushVectorStack();
        }

        if (index == client.myPlayerIndex && ints_22 != null) {
            for (i_18 = 0; i_18 < ints_21.length; i_18++) {
                if (ints_21[i_18] != ints_22[i_18]) {
                    IndexLoaders.ITEM_LOADER.method7151();
                    break;
                }
            }
        }

        if (aClass539_10369 != null) {
            aClass539_10369.method11505();
        }

        if (aAnimation_Sub3_10337.hasDefs() && aAnimation_Sub3_10337.aBool7891) {
            BASDefinitions renderanimdefs_23 = getRenderAnimDefs();
            if (!renderanimdefs_23.method3810(aAnimation_Sub3_10337.method7597())) {
                aAnimation_Sub3_10337.update(-1);
                aAnimation_Sub3_10337.aBool7891 = false;
            }
        }

    }

    @Override
    public Class163 method15852() {
        if (aClass163_10334 != null) {
            if (aClass163_10334.aString2028 == null) {
                return null;
            }

            if (-574868913 * client.PUBLIC_FILTER * 1429316783 == 0 || client.PUBLIC_FILTER * 1429316783 * -574868913 == 3 || -574868913 * client.PUBLIC_FILTER * 1429316783 == 1 && Static.isFriend(displayName)) {
                return aClass163_10334;
            }
        }

        return null;
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    public int method15806() {
        return -(index * -1498872675 * -1691508299) - 1;
    }

    @Override
    boolean method12985() {
        return false;
    }

    @Override
    public int method15898() {
        return -1;
    }

    @Override
    public int method15897() {
        return -1;
    }

    @Override
    public int method15892() {
        return -(index * -1498872675 * -1691508299) - 1;
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        if (model != null && method16133(graphicalrenderer_1, 2048)) {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_4 = method11168();
            CoordinateSpace class305_5 = method11166();
            int i_6 = aClass19_10359.method578();
            Class293 class293_7 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_5.coords.x >> 9][(int) class305_5.coords.z >> 9];
            if (class293_7 != null && class293_7.aTransform_Sub1_Sub3_3499 != null) {
                int i_8 = anInt10325 - class293_7.aTransform_Sub1_Sub3_3499.aShort9561;
                anInt10325 = (int) (anInt10325 - i_8 / 10.0F);
            } else {
                anInt10325 = (int) (anInt10325 - anInt10325 / 10.0F);
            }

            matrix44var_3.method5209(matrix44var_4);
            matrix44var_3.method5219(0.0F, (-20 - anInt10325), 0.0F);
            Class285 class285_18 = null;
            aBool10312 = false;
            if (Class393.preferences.characterShadows.method12966() == 1) {
                BASDefinitions renderanimdefs_9 = getRenderAnimDefs();
                if (renderanimdefs_9.aBool2787 && (model.mimickingNpcId == -1 || IndexLoaders.NPC_INDEX_LOADER.getNPCType(model.mimickingNpcId).aBool4912)) {
                    Animation animation_10 = currentAnimation.hasDefs() && currentAnimation.hasSpeed() ? currentAnimation : null;
                    MovingAnimation class456_sub3_11 = aAnimation_Sub3_10337.hasDefs() && (!aAnimation_Sub3_10337.aBool7891 || animation_10 == null) ? aAnimation_Sub3_10337 : null;
                    MeshRasterizer meshrasterizer_12 = SongReference.method1969(graphicalrenderer_1, anInt10322, anInt10323, anInt10363, 1, aMeshRasterizerArray10372[0], 0, 0, 160, 240, class456_sub3_11 != null ? class456_sub3_11 : animation_10);
                    if (meshrasterizer_12 != null) {
                        if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length + 1) {
                            method13008(aMeshRasterizerArray10372.length + 1);
                        }

                        class285_18 = Class470.method7824(true);
                        aBool10312 = true;
                        graphicalrenderer_1.RA(false);
                        meshrasterizer_12.method11282(matrix44var_3, boundingBoxPolygons[aMeshRasterizerArray10372.length], 0);
                        graphicalrenderer_1.RA(true);
                    }
                }
            }

            int i_19;
            if (this == VertexNormal.MY_PLAYER) {
                for (i_19 = client.HINT_ARROWS.length - 1; i_19 >= 0; --i_19) {
                    HintArrow class180_26 = client.HINT_ARROWS[i_19];
                    if (class180_26 != null && class180_26.modelId != -1) {
                        int i_14;
                        if (class180_26.targetType == 1) {
                            ObjectNode class282_sub47_27 = (ObjectNode) client.NPC_MAP.get(class180_26.targetIndex);
                            if (class282_sub47_27 != null) {
                                NPCEntity npc_30 = (NPCEntity) class282_sub47_27.anObject8068;
                                Vector3 vector3_13 = Vector3.method6632(npc_30.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                i_14 = (int) vector3_13.x;
                                int i_15 = (int) vector3_13.z;
                                method16136(graphicalrenderer_1, matrix44var_3, i_14, i_15, class180_26.modelId, 92160000L);
                            }
                        }

                        if (class180_26.targetType == 2) {
                            Vector3 vector3_28 = VertexNormal.MY_PLAYER.method11166().coords;
                            long long_20 = class180_26.x - (int) vector3_28.x;
                            long long_22 = class180_26.y - (int) vector3_28.z;
                            long long_16 = class180_26.distance << 9;
                            long_16 *= long_16;
                            method16136(graphicalrenderer_1, matrix44var_3, long_20, long_22, class180_26.modelId, long_16);
                        }

                        if (class180_26.targetType == 10 && class180_26.targetIndex >= 0 && class180_26.targetIndex < client.players.length) {
                            PlayerEntity player_29 = client.players[class180_26.targetIndex];
                            if (player_29 != null) {
                                Vector3 vector3_31 = Vector3.method6632(player_29.method11166().coords, VertexNormal.MY_PLAYER.method11166().coords);
                                int i_24 = (int) vector3_31.x;
                                i_14 = (int) vector3_31.z;
                                method16136(graphicalrenderer_1, matrix44var_3, i_24, i_14, class180_26.modelId, 92160000L);
                            }
                        }
                    }
                }
            }

            matrix44var_3.method5209(matrix44var_4);
            matrix44var_3.method5219(0.0F, (-5 - anInt10325), 0.0F);
            if (boundingBoxPolygons == null || boundingBoxPolygons.length < aMeshRasterizerArray10372.length) {
                method13008(aMeshRasterizerArray10372.length);
            }

            if (class285_18 == null) {
                class285_18 = Class470.method7824(true);
            }

            method15799(graphicalrenderer_1, aMeshRasterizerArray10372, matrix44var_3, false);

            for (i_19 = 0; i_19 < aMeshRasterizerArray10372.length; i_19++) {
                if (aMeshRasterizerArray10372[i_19] != null) {
                    aMeshRasterizerArray10372[i_19].method11282(matrix44var_3, boundingBoxPolygons[i_19], this == VertexNormal.MY_PLAYER ? 1 : 0);
                }
            }

            if (aClass539_10369 != null) {
                Class151 class151_25 = aClass539_10369.method11517();
                graphicalrenderer_1.method8456(class151_25);
            }

            for (i_19 = 0; i_19 < aMeshRasterizerArray10372.length; i_19++) {
                if (aMeshRasterizerArray10372[i_19] != null) {
                    aBool10312 |= aMeshRasterizerArray10372[i_19].i();
                }

                aMeshRasterizerArray10372[i_19] = null;
            }

            anInt10349 = client.anInt7286;
            return class285_18;
        } else {
            return null;
        }
    }

    @Override
    public Class163 method15811() {
        if (aClass163_10334 != null) {
            if (aClass163_10334.aString2028 == null) {
                return null;
            }

            if (client.PUBLIC_FILTER == 0 || client.PUBLIC_FILTER == 3 || client.PUBLIC_FILTER == 1 && Static.isFriend(displayName)) {
                return aClass163_10334;
            }
        }

        return null;
    }

    @Override
    public int method15874() {
        return -(index * -1498872675 * -1691508299) - 1;
    }

}
