package com.jagex;

public abstract class PathingEntity extends GraphNode_Sub1_Sub1 {

    public int index;
    public int forceMovementT1XOff;
    public byte greenAdd;
    public int forceMovementT1YOff;
    public int forceMovementT2XOff;
    public int forceMovementT1Delay;
    public int forceMovementT2YOff;
    public int forceMovementT2Delay;
    public int forceMovementDir;
    public int anInt10349;
    public byte blueAdd;
    public byte redAdd;
    public int turnDirection;
    public int turningTicks;
    public int[] anIntArray10335;
    public int[] anIntArray10362;
    public int anInt10355;
    public int anInt10367;
    public Interface inter;
    public int loadedInterfaceId;
    public boolean aBool10318;
    public int anInt10319;
    public int anInt10375;
    public int drawPriority;
    public int[] anIntArray10316;
    public int[] anIntArray10329;
    public int[] anIntArray10351;
    public int[] anIntArray10331;
    public int[] anIntArray10332;
    public EntityList aClass457_10333;
    public int faceEntity;
    public int[] currentAnimations;
    public MovingAnimation aAnimation_Sub3_10337;
    public Animation currentAnimation;
    public int anInt10347;
    public int anInt10348;
    public byte scalar;
    public int lastUpdate;
    public int anInt10340;
    public Class19 aClass19_10359;
    public Class19 aClass19_10360;
    public Class19 aClass19_10330;
    public int anInt10366;
    public int anInt10368;
    public int[] regionBaseX;
    public int[] regionBaseY;
    public byte[] walkTypes;
    public MeshRasterizer[] aMeshRasterizerArray10372;
    public EntitySpotAnim[] spotAnims;
    public Animation_Sub2_Sub1[] aAnimation_Sub2_Sub1Array10354;
    ParticleSystem aClass539_10369;
    boolean aBool10370;
    byte aByte10358;
    int interfaceIdToLoad;
    int anInt10315;
    int anInt10317;
    int anInt10325;
    boolean aBool10312;
    Class163 aClass163_10334;
    int anInt10322;
    int anInt10323;
    int anInt10363;

    PathingEntity(SceneObjectManager sceneobjectmanager_1) {
        this(sceneobjectmanager_1, 10);
    }

    PathingEntity(SceneObjectManager sceneobjectmanager_1, int i_2) {
        super(sceneobjectmanager_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        anInt10315 = 1;
        anInt10317 = -32768;
        aBool10318 = true;
        anInt10319 = 0;
        anInt10375 = -1;
        drawPriority = 0;
        anInt10325 = 0;
        aByte10358 = 0;
        anIntArray10316 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
        anIntArray10329 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
        anIntArray10351 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
        anIntArray10331 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
        anIntArray10332 = new int[QuickchatFiller.ENTITY_DEFAULTS.maximumHits];
        aClass457_10333 = new EntityList();
        faceEntity = -1;
        currentAnimations = null;
        aAnimation_Sub3_10337 = new MovingAnimation(this);
        currentAnimation = new Animation_Sub2(this);
        anInt10347 = -1;
        anInt10348 = -1;
        scalar = 0;
        lastUpdate = 0;
        turningTicks = 0;
        anInt10340 = 256;
        aClass19_10359 = new Class19();
        aClass19_10360 = new Class19();
        aClass19_10330 = new Class19();
        anInt10355 = 0;
        anInt10366 = 0;
        anInt10367 = 0;
        anInt10368 = 0;
        aBool10370 = false;
        aBool10312 = false;
        loadedInterfaceId = -1;
        interfaceIdToLoad = -1;
        regionBaseX = new int[i_2];
        regionBaseY = new int[i_2];
        walkTypes = new byte[i_2];
        aMeshRasterizerArray10372 = new MeshRasterizer[5];
        spotAnims = new EntitySpotAnim[4];

        for (int i_3 = 0; i_3 < 4; i_3++) {
            spotAnims[i_3] = new EntitySpotAnim(this);
        }

        aAnimation_Sub2_Sub1Array10354 = new Animation_Sub2_Sub1[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
    }

    public void turn(int i_1, boolean bool_2) {
        BASDefinitions renderanimdefs_4 = getRenderAnimDefs();
        if (bool_2 || renderanimdefs_4.anInt2820 != 0 || anInt10340 != 0) {
            turnDirection = i_1 & 0x3fff;
            aClass19_10359.method577(turnDirection);
        }

    }

    @Override
    public int method13017() {
        return anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * anInt10317 * -358839357;
    }

    @Override
    boolean method12987() {
        return aBool10312;
    }

    public abstract int getCS2Index();

    public void method15795(int i_1, int i_2, boolean bool_3) {
        if (initInterface()) {
            InteractableObject.method16099(inter.components, -1, i_1, i_2, bool_3);
        }

    }

    public int method15796() {
        BASDefinitions renderanimdefs_2 = getRenderAnimDefs();
        int i_3 = aClass19_10359.turnDirection;
        boolean bool_4;
        if (renderanimdefs_2.anInt2820 != 0) {
            bool_4 = aClass19_10359.method576(turnDirection, renderanimdefs_2.anInt2820, renderanimdefs_2.anInt2804);
        } else {
            bool_4 = aClass19_10359.method576(turnDirection, anInt10340, anInt10340);
        }

        int i_5 = aClass19_10359.turnDirection - i_3;
        if (i_5 != 0) {
            ++turningTicks;
        } else {
            turningTicks = 0;
            aClass19_10359.method577(turnDirection);
        }

        if (bool_4) {
            if (renderanimdefs_2.anInt2825 != 0) {
                if (i_5 > 0) {
                    aClass19_10360.method576(renderanimdefs_2.anInt2824, renderanimdefs_2.anInt2825, renderanimdefs_2.anInt2823);
                } else {
                    aClass19_10360.method576(-renderanimdefs_2.anInt2824, renderanimdefs_2.anInt2825, renderanimdefs_2.anInt2823);
                }
            }

            if (renderanimdefs_2.anInt2816 != 0) {
                aClass19_10330.method576(renderanimdefs_2.anInt2827, renderanimdefs_2.anInt2816, renderanimdefs_2.anInt2815);
            }
        } else {
            if (renderanimdefs_2.anInt2825 != 0) {
                aClass19_10360.method576(0, renderanimdefs_2.anInt2825, renderanimdefs_2.anInt2823);
            } else {
                aClass19_10360.method577(0);
            }

            if (renderanimdefs_2.anInt2816 != 0) {
                aClass19_10330.method576(0, renderanimdefs_2.anInt2816, renderanimdefs_2.anInt2815);
            } else {
                aClass19_10330.method577(0);
            }
        }

        return i_5;
    }

    public void method15797(int[] ints_1, int[] ints_2) {
        if (anIntArray10335 == null && ints_1 != null) {
            anIntArray10335 = new int[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];
        } else if (ints_1 == null) {
            anIntArray10335 = null;
            return;
        }

        int i_4;
        for (i_4 = 0; i_4 < anIntArray10335.length; i_4++) {
            anIntArray10335[i_4] = -1;
        }

        for (i_4 = 0; i_4 < ints_1.length; i_4++) {
            int i_5 = ints_2[i_4];

            for (int i_6 = 0; i_6 < anIntArray10335.length; i_5 >>= 1) {
                if ((i_5 & 0x1) != 0) {
                    anIntArray10335[i_6] = ints_1[i_4];
                }

                ++i_6;
            }
        }

    }

    public boolean method15798(int i_1, int i_2) {
        if (anIntArray10362 == null) {
            if (i_2 == -1) {
                return true;
            }

            anIntArray10362 = new int[LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length];

            for (int i_10 = 0; i_10 < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i_10++) {
                anIntArray10362[i_10] = -1;
            }
        }

        BASDefinitions renderanimdefs_4 = getRenderAnimDefs();
        int i_5 = 256;
        if (renderanimdefs_4.anIntArray2818 != null && renderanimdefs_4.anIntArray2818[i_1] > 0) {
            i_5 = renderanimdefs_4.anIntArray2818[i_1];
        }

        int i_6;
        int i_7;
        if (i_2 == -1) {
            if (anIntArray10362[i_1] == -1) {
                return true;
            } else {
                i_6 = aClass19_10359.method578();
                i_7 = anIntArray10362[i_1];
                int i_8 = i_6 - i_7;
                if (i_8 >= -i_5 && i_8 <= i_5) {
                    anIntArray10362[i_1] = -1;

                    for (int i_9 = 0; i_9 < LinkedNodeList.EQUIPMENT_DEFAULTS.hidden.length; i_9++) {
                        if (anIntArray10362[i_9] != -1) {
                            return true;
                        }
                    }

                    anIntArray10362 = null;
                    return true;
                } else {
                    if ((i_8 <= 0 || i_8 > 8192) && i_8 > -8192) {
                        anIntArray10362[i_1] = i_7 - i_5 & 0x3fff;
                    } else {
                        anIntArray10362[i_1] = i_7 + i_5 & 0x3fff;
                    }

                    return false;
                }
            }
        } else {
            if (anIntArray10362[i_1] == -1) {
                anIntArray10362[i_1] = aClass19_10359.method578();
            }

            i_6 = anIntArray10362[i_1];
            i_7 = i_2 - i_6;
            if (i_7 >= -i_5 && i_7 <= i_5) {
                anIntArray10362[i_1] = i_2;
                return true;
            } else {
                if ((i_7 <= 0 || i_7 > 8192) && i_7 > -8192) {
                    anIntArray10362[i_1] = i_6 - i_5 & 0x3fff;
                } else {
                    anIntArray10362[i_1] = i_6 + i_5 & 0x3fff;
                }

                return false;
            }
        }
    }

    void method15799(AbstractRenderer graphicalrenderer_1, MeshRasterizer[] arr_2, Matrix44Var matrix44var_3, boolean bool_4) {
        if (!bool_4) {
            int i_6 = 0;
            int i_7 = 0;
            int i_8 = 0;
            int i_9 = 0;
            int i_10 = -1;
            int i_11 = -1;
            ParticleEmitterConfig[][] arr_12 = new ParticleEmitterConfig[arr_2.length][];
            SurfaceSkin[][] arr_13 = new SurfaceSkin[arr_2.length][];

            for (int i_14 = 0; i_14 < arr_2.length; i_14++) {
                if (arr_2[i_14] != null) {
                    arr_2[i_14].method11273(matrix44var_3);
                    arr_12[i_14] = arr_2[i_14].method11253();
                    arr_13[i_14] = arr_2[i_14].method11274();
                    if (arr_12[i_14] != null) {
                        i_10 = i_14;
                        ++i_7;
                        i_6 += arr_12[i_14].length;
                    }

                    if (arr_13[i_14] != null) {
                        i_11 = i_14;
                        ++i_9;
                        i_8 += arr_13[i_14].length;
                    }
                }
            }

            if ((aClass539_10369 == null || aClass539_10369.aBool7132) && (i_7 > 0 || i_9 > 0)) {
                aClass539_10369 = ParticleSystem.method11557(client.CYCLES_20MS, true);
            }

            if (aClass539_10369 != null) {
                Object obj_20 = null;
                ParticleEmitterConfig[] arr_15;
                if (i_7 == 1) {
                    arr_15 = arr_12[i_10];
                } else {
                    arr_15 = new ParticleEmitterConfig[i_6];
                    int i_21 = 0;

                    for (int i_22 = 0; i_22 < arr_2.length; i_22++) {
                        if (arr_12[i_22] != null) {
                            System.arraycopy(arr_12[i_22], 0, arr_15, i_21, arr_12[i_22].length);
                            i_21 += arr_12[i_22].length;
                        }
                    }
                }

                Object obj_16 = null;
                SurfaceSkin[] arr_17;
                if (i_9 == 1) {
                    arr_17 = arr_13[i_11];
                } else {
                    arr_17 = new SurfaceSkin[i_8];
                    int i_18 = 0;

                    for (int i_19 = 0; i_19 < arr_2.length; i_19++) {
                        if (arr_13[i_19] != null) {
                            System.arraycopy(arr_13[i_19], 0, arr_17, i_18, arr_13[i_19].length);
                            i_18 += arr_13[i_19].length;
                        }
                    }
                }

                aClass539_10369.method11511(graphicalrenderer_1, client.CYCLES_20MS, arr_15, arr_17);
                aBool10370 = true;
            }
        } else if (aClass539_10369 != null) {
            aClass539_10369.method11512(client.CYCLES_20MS);
        }

        if (aClass539_10369 != null) {
            aClass539_10369.method11515(plane);
        }

    }

    public void sendSpotAnim(int spotAnimId, int flags1, int rotation, int i_4, boolean bool_5, int index) {
        EntitySpotAnim class161_8 = spotAnims[index];
        int currSpotAnimId = class161_8.spotAnimId;
        if (spotAnimId != -1 && currSpotAnimId != -1) {
            SpotAnimDefinitions spotAnimDefs;
            if (currSpotAnimId == spotAnimId) {
                spotAnimDefs = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId);
                if (spotAnimDefs.aBool6968 && spotAnimDefs.animationId != -1) {
                    AnimationDefinitions animationdefinitions_11 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotAnimDefs.animationId);
                    int i_12 = animationdefinitions_11.replayMode;
                    if (i_12 == 0) {
                        return;
                    }

                    if (i_12 == 2) {
                        class161_8.animation.method7584();
                        return;
                    }
                }
            } else {
                spotAnimDefs = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId);
                SpotAnimDefinitions currSpotAnimDefs = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(currSpotAnimId);
                if (spotAnimDefs.animationId != -1 && currSpotAnimDefs.animationId != -1) {
                    AnimationDefinitions animationdefinitions_15 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotAnimDefs.animationId);
                    AnimationDefinitions animationdefinitions_13 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(currSpotAnimDefs.animationId);
                    if (animationdefinitions_15.priority < animationdefinitions_13.priority) {
                        return;
                    }
                }
            }
        }

        byte b_14 = 0;
        if (spotAnimId != -1 && !IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId).aBool6968) {
            b_14 = 2;
        }

        if (spotAnimId != -1 && bool_5) {
            b_14 = 1;
        }

        class161_8.spotAnimId = spotAnimId;
        class161_8.anInt2011 = i_4;
        class161_8.height = flags1 >> 16;
        class161_8.rotation = rotation;
        class161_8.animation.animateFull(spotAnimId != -1 ? IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId).animationId : -1, flags1 & 0xffff, b_14, false);
    }

    public void method15801() {
        anInt10355 = 0;
        anInt10367 = 0;
    }

    public void applyHit(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        boolean bool_8 = true;
        boolean bool_9 = true;

        int i_10;
        for (i_10 = 0; i_10 < QuickchatFiller.ENTITY_DEFAULTS.maximumHits; i_10++) {
            if (anIntArray10351[i_10] > i_5) {
                bool_8 = false;
            } else {
                bool_9 = false;
            }
        }

        i_10 = -1;
        int i_11 = -1;
        int i_12 = 0;
        if (i_1 >= 0) {
            HitsplatDefinitions hitsplatdefinitions_13 = IndexLoaders.HITSPLAT_LOADER.getDefinitions(i_1);
            i_11 = hitsplatdefinitions_13.anInt2839;
            i_12 = hitsplatdefinitions_13.anInt2841;
        }

        int i_15;
        if (bool_9) {
            if (i_11 == -1) {
                return;
            }

            i_10 = 0;
            i_15 = 0;
            if (i_11 == 0) {
                i_15 = anIntArray10351[0];
            } else if (i_11 == 1) {
                i_15 = anIntArray10329[0];
            }

            for (int i_14 = 1; i_14 < QuickchatFiller.ENTITY_DEFAULTS.maximumHits; i_14++) {
                if (i_11 == 0) {
                    if (anIntArray10351[i_14] < i_15) {
                        i_10 = i_14;
                        i_15 = anIntArray10351[i_14];
                    }
                } else if (i_11 == 1 && anIntArray10329[i_14] < i_15) {
                    i_10 = i_14;
                    i_15 = anIntArray10329[i_14];
                }
            }

            if (i_11 == 1 && i_15 >= i_2) {
                return;
            }
        } else {
            if (bool_8) {
                aByte10358 = 0;
            }

            for (i_15 = 0; i_15 < QuickchatFiller.ENTITY_DEFAULTS.maximumHits; i_15++) {
                byte b_16 = aByte10358;
                aByte10358 = (byte) ((aByte10358 + 1) % QuickchatFiller.ENTITY_DEFAULTS.maximumHits);
                if (anIntArray10351[b_16] <= i_5) {
                    i_10 = b_16;
                    break;
                }
            }
        }

        if (i_10 >= 0) {
            anIntArray10316[i_10] = i_1;
            anIntArray10329[i_10] = i_2;
            anIntArray10331[i_10] = i_3;
            anIntArray10332[i_10] = i_4;
            anIntArray10351[i_10] = i_5 + i_12 + i_6;
        }

    }

    public void displayHitbar(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        HitbarDefinitions hitbardefinitions_8 = IndexLoaders.HITBAR_LOADER.getDefinitions(i_1);
        EntityNode_Sub7 class275_sub7_9 = null;
        EntityNode_Sub7 class275_sub7_10 = null;
        int i_11 = hitbardefinitions_8.anInt2440;
        int i_12 = 0;

        EntityNode_Sub7 class275_sub7_13;
        for (class275_sub7_13 = (EntityNode_Sub7) aClass457_10333.method7659(); class275_sub7_13 != null; class275_sub7_13 = (EntityNode_Sub7) aClass457_10333.method7650()) {
            ++i_12;
            if (hitbardefinitions_8 == class275_sub7_13.aClass198_7863) {
                class275_sub7_13.method12601(i_2 + i_4, i_5, i_6, i_3);
                return;
            }

            if (class275_sub7_13.aClass198_7863.anInt2446 <= hitbardefinitions_8.anInt2446) {
                class275_sub7_9 = class275_sub7_13;
            }

            if (class275_sub7_13.aClass198_7863.anInt2440 > i_11) {
                class275_sub7_10 = class275_sub7_13;
                i_11 = class275_sub7_13.aClass198_7863.anInt2440;
            }
        }

        if (class275_sub7_10 != null || i_12 < QuickchatFiller.ENTITY_DEFAULTS.anInt7032) {
            class275_sub7_13 = new EntityNode_Sub7(hitbardefinitions_8);
            if (class275_sub7_9 == null) {
                aClass457_10333.method7647(class275_sub7_13);
            } else {
                Class516.method8866(class275_sub7_13, class275_sub7_9);
            }

            class275_sub7_13.method12601(i_2 + i_4, i_5, i_6, i_3);
            if (i_12 >= QuickchatFiller.ENTITY_DEFAULTS.anInt7032) {
                class275_sub7_10.method4887();
            }
        }

    }

    @Override
    boolean method13000() {
        return aBool10312;
    }

    @Override
    public int method12997() {
        BASDefinitions renderanimdefs_2 = getRenderAnimDefs();
        int i_3;
        if (renderanimdefs_2.anInt2798 != -1) {
            i_3 = renderanimdefs_2.anInt2798;
        } else if (anInt10317 == -32768) {
            i_3 = 200;
        } else {
            i_3 = -anInt10317;
        }

        CoordinateSpace class305_4 = method11166();
        int i_5 = (int) class305_4.coords.x >> 9;
        int i_6 = (int) class305_4.coords.z >> 9;
        if (aClass206_7970 != null && i_5 >= 1 && i_6 >= 1 && i_5 <= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 1 && i_6 <= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 1) {
            Class293 class293_7 = aClass206_7970.aClass293ArrayArrayArray2604[plane][i_5][i_6];
            if (class293_7 != null && class293_7.aTransform_Sub1_Sub3_3499 != null) {
                return class293_7.aTransform_Sub1_Sub3_3499.aShort9561 + i_3;
            }
        }

        return i_3;
    }

    public abstract int method15804();

    public int getSize() {
        return anInt10315;
    }

    @Override
    public void method14697() {
        int i_2 = (anInt10315 - 1 << 8) + 240;
        Vector3 vector3_3 = method11166().coords;
        aShort9458 = (short) ((int) vector3_3.x - i_2 >> 9);
        aShort9456 = (short) ((int) vector3_3.z - i_2 >> 9);
        localX = (short) (i_2 + (int) vector3_3.x >> 9);
        localY = (short) (i_2 + (int) vector3_3.z >> 9);
    }

    public abstract int method15806();

    @Override
    boolean method12986() {
        return false;
    }

    abstract int getRenderAnimation();

    public abstract Class163 method15809();

    public abstract Class163 method15811();

    public void method15812() {
        if (aClass163_10334 != null && aClass163_10334.aString2028 != null) {
            --aClass163_10334.anInt2030;
            if (aClass163_10334.anInt2030 == 0) {
                aClass163_10334.aString2028 = null;
            }
        }

    }

    public void method15813(int i_1) {
        if (interfaceIdToLoad != loadedInterfaceId) {
            method15816();
        }

        interfaceIdToLoad = i_1;
    }

    public abstract boolean method15814();

    boolean initInterface(int i_1) {
        if (loadedInterfaceId == i_1) {
            return true;
        } else {
            inter = SkyboxIndexLoader.getInterface(i_1, null, null, true);
            if (inter == null) {
                return false;
            } else {
                loadedInterfaceId = i_1;
                Connection.runIComponentScripts(inter.components);
                return true;
            }
        }
    }

    void method15816() {
        if (loadedInterfaceId != -1) {
            HostNameIdentifier.clearComponents(loadedInterfaceId);
            inter = null;
            loadedInterfaceId = -1;
        }

    }

    public void method15818(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (!initInterface()) {
            if (i_1 != -1) {
                client.aBoolArray7443[i_1] = true;
            } else {
                for (int i_9 = 0; i_9 < 107; i_9++) {
                    client.aBoolArray7443[i_9] = true;
                }
            }
        } else {
            IComponentDefinitions.render(inter.method1616(), -1, i_2, i_3, i_4, i_5, i_6, i_7, i_1, false);
        }

    }

    void method15819(MeshRasterizer meshrasterizer_1) {
        int i_3 = aClass19_10360.turnDirection;
        int i_4 = aClass19_10330.turnDirection;
        if (i_3 != 0 || i_4 != 0) {
            int i_5 = meshrasterizer_1.YA() / 2;
            meshrasterizer_1.ia(0, -i_5, 0);
            meshrasterizer_1.EA(i_3 & 0x3fff);
            meshrasterizer_1.t(i_4 & 0x3fff);
            meshrasterizer_1.ia(0, i_5, 0);
        }

    }

    @Override
    boolean method12999() {
        return false;
    }

    @Override
    boolean method13001() {
        return aBool10312;
    }

    @Override
    public int method13003() {
        return anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * anInt10317 * -358839357;
    }

    @Override
    boolean method13002() {
        return aBool10312;
    }

    @Override
    public int method13005() {
        return anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * anInt10317 * -358839357;
    }

    public void setBoundSize(int i_1) {
        anInt10315 = i_1;
    }

    void method15837(AbstractRenderer graphicalrenderer_1, BASDefinitions renderanimdefs_2, int i_3, int i_4, int i_5, int i_6) {
        for (int i_8 = 0; i_8 < spotAnims.length; i_8++) {
            byte b_9 = 0;
            if (i_8 == 0) {
                b_9 = 2;
            } else if (i_8 == 1) {
                b_9 = 5;
            } else if (i_8 == 2) {
                b_9 = 1;
            } else if (i_8 == 3) {
                b_9 = 7;
            }

            EntitySpotAnim class161_10 = spotAnims[i_8];
            if (class161_10.spotAnimId != -1 && !class161_10.animation.hasSpeed()) {
                SpotAnimDefinitions spotanimdefinitions_11 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(class161_10.spotAnimId);
                boolean bool_12 = spotanimdefinitions_11.aByte6982 == 3 && (i_4 != 0 || i_5 != 0);
                int i_13 = i_3;
                if (bool_12) {
                    i_13 = i_3 | 0x7;
                } else {
                    if (class161_10.rotation != 0) {
                        i_13 = i_3 | 0x5;
                    }

                    if (class161_10.height != 0) {
                        i_13 |= 0x2;
                    }

                    if (class161_10.anInt2011 >= 0) {
                        i_13 |= 0x7;
                    }
                }

                MeshRasterizer meshrasterizer_14 = aMeshRasterizerArray10372[i_8 + 1] = spotanimdefinitions_11.method11228(graphicalrenderer_1, i_13, class161_10.animation, b_9);
                if (meshrasterizer_14 != null) {
                    if (class161_10.anInt2011 >= 0 && renderanimdefs_2.anIntArrayArray2802 != null && renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011] != null) {
                        int i_15 = 0;
                        int i_16 = 0;
                        int i_17 = 0;
                        if (renderanimdefs_2.anIntArrayArray2802 != null && renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011] != null) {
                            i_15 += renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011][0];
                            i_16 += renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011][1];
                            i_17 += renderanimdefs_2.anIntArrayArray2802[class161_10.anInt2011][2];
                        }

                        if (renderanimdefs_2.anIntArrayArray2791 != null && renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011] != null) {
                            i_15 += renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011][0];
                            i_16 += renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011][1];
                            i_17 += renderanimdefs_2.anIntArrayArray2791[class161_10.anInt2011][2];
                        }

                        if (i_17 != 0 || i_15 != 0) {
                            int i_18 = i_6;
                            if (anIntArray10362 != null && anIntArray10362[class161_10.anInt2011] != -1) {
                                i_18 = anIntArray10362[class161_10.anInt2011];
                            }

                            int i_19 = i_18 + class161_10.rotation * 2048 - i_6 & 0x3fff;
                            if (i_19 != 0) {
                                meshrasterizer_14.f(i_19);
                            }

                            int i_20 = Trig.SINE[i_19];
                            int i_21 = Trig.COSINE[i_19];
                            int i_22 = i_21 * i_15 + i_17 * i_20 >> 14;
                            i_17 = i_21 * i_17 - i_15 * i_20 >> 14;
                            i_15 = i_22;
                        }

                        meshrasterizer_14.ia(i_15, i_16, i_17);
                    } else if (class161_10.rotation != 0) {
                        meshrasterizer_14.f(class161_10.rotation * 2048);
                    }

                    if (class161_10.height != 0) {
                        meshrasterizer_14.ia(0, -class161_10.height << 2, 0);
                    }

                    if (bool_12) {
                        if (anInt10322 != 0) {
                            meshrasterizer_14.t(anInt10322);
                        }

                        if (anInt10323 != 0) {
                            meshrasterizer_14.EA(anInt10323);
                        }

                        if (anInt10363 != 0) {
                            meshrasterizer_14.ia(0, anInt10363, 0);
                        }
                    }
                }
            } else {
                aMeshRasterizerArray10372[i_8 + 1] = null;
            }
        }

    }

    public abstract Class163 method15852();

    public BASDefinitions getRenderAnimDefs() {
        int i_2 = getRenderAnimation();
        return i_2 == -1 ? RenderAnimIndexLoader.aClass227_2669 : IndexLoaders.RENDER_ANIM_LOADER.getBASDefs(i_2);
    }

    public void method15857(int i_1) {
        HitbarDefinitions hitbardefinitions_3 = IndexLoaders.HITBAR_LOADER.getDefinitions(i_1);

        for (EntityNode_Sub7 class275_sub7_4 = (EntityNode_Sub7) aClass457_10333.method7659(); class275_sub7_4 != null; class275_sub7_4 = (EntityNode_Sub7) aClass457_10333.method7650()) {
            if (hitbardefinitions_3 == class275_sub7_4.aClass198_7863) {
                class275_sub7_4.method4887();
                break;
            }
        }

    }

    public void method15863(int i_1) {
        BASDefinitions renderanimdefs_3 = getRenderAnimDefs();
        if (renderanimdefs_3.anInt2820 != 0 || anInt10340 != 0) {
            aClass19_10359.method579();
            int i_4 = i_1 - aClass19_10359.turnDirection & 0x3fff;
            if (i_4 > 8192) {
                turnDirection = aClass19_10359.turnDirection - (16384 - i_4);
            } else {
                turnDirection = aClass19_10359.turnDirection + i_4;
            }
        }

    }

    abstract int method15867();

    abstract int method15868();

    public abstract boolean method15871();

    public abstract boolean method15872();

    public abstract boolean method15873();

    public abstract int method15874();

    public void method15875(String string_1, int i_2, int i_3, int i_4) {
        if (aClass163_10334 == null) {
            aClass163_10334 = new Class163();
        }

        aClass163_10334.aString2028 = string_1;
        aClass163_10334.anInt2027 = i_2;
        aClass163_10334.anInt2029 = i_3;
        aClass163_10334.anInt2030 = aClass163_10334.anInt2026 = i_4;
    }

    public abstract Class163 method15876();

    public abstract Class163 method15877();

    public void method15880(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (initInterface()) {
            client.method11768(inter, inter.method1616(), -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
        }

    }

    public abstract boolean method15887();

    @Override
    public int method13006() {
        return anInt10317 * -358839357 * 296631531 == -32768 ? 0 : 296631531 * anInt10317 * -358839357;
    }

    public abstract int method15892();

    void method15895(int i_1, int i_2, int i_3, int i_4, int i_5) {
        Vector3 vector3_7 = method11166().coords;
        int i_8 = aShort9458 + localX >> 1;
        int i_9 = localY + aShort9456 >> 1;
        int i_10 = Trig.SINE[i_1];
        int i_11 = Trig.COSINE[i_1];
        int i_12 = -i_2 / 2;
        int i_13 = -i_3 / 2;
        int i_14 = i_11 * i_12 + i_10 * i_13 >> 14;
        int i_15 = i_13 * i_11 - i_10 * i_12 >> 14;
        int i_16 = Class13.method507(i_14 + (int) vector3_7.x, i_15 + (int) vector3_7.z, i_8, i_9, plane);
        int i_17 = i_2 / 2;
        int i_18 = -i_3 / 2;
        int i_19 = i_17 * i_11 + i_10 * i_18 >> 14;
        int i_20 = i_11 * i_18 - i_17 * i_10 >> 14;
        int i_21 = Class13.method507(i_19 + (int) vector3_7.x, i_20 + (int) vector3_7.z, i_8, i_9, plane);
        int i_22 = -i_2 / 2;
        int i_23 = i_3 / 2;
        int i_24 = i_11 * i_22 + i_10 * i_23 >> 14;
        int i_25 = i_23 * i_11 - i_10 * i_22 >> 14;
        int i_26 = Class13.method507(i_24 + (int) vector3_7.x, i_25 + (int) vector3_7.z, i_8, i_9, plane);
        int i_27 = i_2 / 2;
        int i_28 = i_3 / 2;
        int i_29 = i_11 * i_27 + i_28 * i_10 >> 14;
        int i_30 = i_28 * i_11 - i_10 * i_27 >> 14;
        int i_31 = Class13.method507(i_29 + (int) vector3_7.x, i_30 + (int) vector3_7.z, i_8, i_9, plane);
        int i_32 = Math.min(i_16, i_21);
        int i_33 = Math.min(i_26, i_31);
        int i_34 = Math.min(i_21, i_31);
        int i_35 = Math.min(i_16, i_26);
        anInt10322 = (int) (Math.atan2(i_32 - i_33, i_3) * 2607.5945876176133D) & 0x3fff;
        anInt10323 = (int) (Math.atan2(i_35 - i_34, i_2) * 2607.5945876176133D) & 0x3fff;
        int i_36;
        if (anInt10322 != 0 && i_4 != 0) {
            i_36 = 16384 - i_4;
            if (anInt10322 > 8192) {
                if (anInt10322 < i_36) {
                    anInt10322 = i_36;
                }
            } else if (anInt10322 > i_4) {
                anInt10322 = i_4;
            }
        }

        if (anInt10323 != 0 && i_5 != 0) {
            i_36 = 16384 - i_5;
            if (anInt10323 > 8192) {
                if (anInt10323 < i_36) {
                    anInt10323 = i_36;
                }
            } else if (anInt10323 > i_5) {
                anInt10323 = i_5;
            }
        }

        anInt10363 = i_31 + i_16;
        if (i_21 + i_26 < anInt10363) {
            anInt10363 = i_26 + i_21;
        }

        anInt10363 = (anInt10363 >> 1) - (int) vector3_7.y;
    }

    public abstract int method15897();

    public abstract int method15898();

    public abstract int method15899();

    @Override
    public int method12995() {
        return anInt10317 == -32768 ? 0 : anInt10317;
    }

    boolean initInterface() {
        return interfaceIdToLoad != -1 && initInterface(interfaceIdToLoad);
    }

}
