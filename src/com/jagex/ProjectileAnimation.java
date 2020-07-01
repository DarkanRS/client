package com.jagex;

public class ProjectileAnimation extends GraphNode_Sub1_Sub1 {

    public int startTime;
    public int endTime;
    public int entityLockOn;
    public int endHeight;
    double aDouble10394;
    double aDouble10395;
    double aDouble10396;
    double aDouble10397;
    double aDouble10390;
    boolean aBool10401;
    int anInt10385;
    ParticleSystem aClass539_10402;
    boolean aBool10398;
    int spotAnimId;
    int angle;
    int slope;
    int entitySource;
    int startHeight;
    boolean useTerrainHeight;
    int anInt10391;
    Animation animation;

    public ProjectileAnimation(SceneObjectManager objManager, int spotAnimId, int fromPlane, int toPlane, int localX, int localY, int startHeight, int startTime, int endTime, int angle, int slope, int entitySource, int entityLockOn, int endHeight, boolean useTerrainHeight, int i_16) {
        super(objManager, fromPlane, toPlane, localX, Class504.getTerrainHeightAtPos(localX, localY, fromPlane) - startHeight, localY, localX >> 9, localX >> 9, localY >> 9, localY >> 9, false, (byte) 0);
        this.spotAnimId = spotAnimId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.angle = angle;
        this.slope = slope;
        this.entitySource = entitySource;
        this.entityLockOn = entityLockOn;
        this.startHeight = startHeight;
        this.endHeight = endHeight;
        this.useTerrainHeight = useTerrainHeight;
        aBool10398 = false;
        anInt10391 = i_16;
        int i_17 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnimId).animationId;
        animation = new Animation_Sub2(this);
        animation.update(i_17);
        method13008(1);
    }

    @Override
    boolean method12999() {
        return false;
    }

    @Override
    boolean method12986() {
        return false;
    }

    public void method15903() {
        if (!aBool10398 && entitySource != 0) {
            Object obj_2 = null;
            if (client.anInt7341 == 4) {
                obj_2 = Class82.CUTSCENE_ENTITIES[entitySource - 1].method1342();
            } else {
                int i_14;
                if (entitySource < 0) {
                    i_14 = -entitySource - 1;
                    if (i_14 == client.myPlayerIndex) {
                        obj_2 = VertexNormal.MY_PLAYER;
                    } else {
                        obj_2 = client.players[i_14];
                    }
                } else {
                    i_14 = entitySource - 1;
                    ObjectNode class282_sub47_4 = (ObjectNode) client.NPC_MAP.get(i_14);
                    if (class282_sub47_4 != null) {
                        obj_2 = class282_sub47_4.anObject8068;
                    }
                }
            }

            if (obj_2 != null) {
                Vector3 vector3_3 = ((PathingEntity) obj_2).method11166().coords;
                method11172(vector3_3.x, (Class504.getTerrainHeightAtPos((int) vector3_3.x, (int) vector3_3.z, plane) - startHeight), vector3_3.z);
                if (anInt10391 >= 0) {
                    BASDefinitions renderanimdefs_15 = ((PathingEntity) obj_2).getRenderAnimDefs();
                    int i_5 = 0;
                    int i_6 = 0;
                    if (renderanimdefs_15.anIntArrayArray2802 != null && renderanimdefs_15.anIntArrayArray2802[anInt10391] != null) {
                        i_5 += renderanimdefs_15.anIntArrayArray2802[anInt10391][0];
                        i_6 += renderanimdefs_15.anIntArrayArray2802[anInt10391][2];
                    }

                    if (renderanimdefs_15.anIntArrayArray2791 != null && renderanimdefs_15.anIntArrayArray2791[anInt10391] != null) {
                        i_5 += renderanimdefs_15.anIntArrayArray2791[anInt10391][0];
                        i_6 += renderanimdefs_15.anIntArrayArray2791[anInt10391][2];
                    }

                    if (i_5 != 0 || i_6 != 0) {
                        int i_7 = ((PathingEntity) obj_2).aClass19_10359.method578();
                        int i_8 = i_7;
                        if (((PathingEntity) obj_2).anIntArray10362 != null && ((PathingEntity) obj_2).anIntArray10362[anInt10391] != -1) {
                            i_8 = ((PathingEntity) obj_2).anIntArray10362[anInt10391];
                        }

                        int i_9 = i_8 - i_7 & 0x3fff;
                        int i_10 = Class382.SINE[i_9];
                        int i_11 = Class382.COSINE[i_9];
                        int i_12 = i_10 * i_6 + i_5 * i_11 >> 14;
                        i_6 = i_6 * i_11 - i_10 * i_5 >> 14;
                        Vector3 vector3_13 = Vector3.popVectorStackTo(method11166().coords);
                        vector3_13.x += i_12;
                        vector3_13.z += i_6;
                        method11171(vector3_13);
                        vector3_13.pushVectorStack();
                    }
                }
            }
        }

    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    public void start(int i_1, int i_2, int i_3, int i_4) {
        Vector3 position = Vector3.popVectorStackTo(method11166().coords);
        if (!aBool10398) {
            float f_7 = i_1 - position.x;
            float f_8 = i_2 - position.z;
            float f_9 = (float) Math.sqrt(f_8 * f_8 + f_7 * f_7);
            if (f_9 != 0.0F) {
                position.x += f_7 * slope / f_9;
                position.z += f_8 * slope / f_9;
            }

            if (useTerrainHeight) {
                position.y = (Class504.getTerrainHeightAtPos((int) position.x, (int) position.z, plane) - startHeight);
            }

            method11171(position);
        }

        double d_10 = endTime + 1 - i_4;
        aDouble10394 = (i_1 - position.x) / d_10;
        aDouble10395 = (i_2 - position.z) / d_10;
        aDouble10396 = Math.sqrt(aDouble10395 * aDouble10395 + aDouble10394 * aDouble10394);
        if (angle != -1) {
            if (!aBool10398) {
                aDouble10397 = -aDouble10396 * Math.tan(0.02454369D * angle);
            }

            aDouble10390 = ((i_3 - position.y) - aDouble10397 * d_10) * 2.0D / (d_10 * d_10);
        } else {
            aDouble10397 = (i_3 - position.y) / d_10;
        }

        position.pushVectorStack();
    }

    @Override
    boolean method13000() {
        return aBool10401;
    }

    @Override
    public int method12995() {
        return anInt10385;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = method15907(graphicalrenderer_1, 2048);
        if (meshrasterizer_3 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_4 = method11168();
            method15905(graphicalrenderer_1, meshrasterizer_3, matrix44var_4);
            Class285 class285_5 = Class470.method7824(false);
            meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
            if (aClass539_10402 != null) {
                Class151 class151_6 = aClass539_10402.method11517();
                graphicalrenderer_1.method8456(class151_6);
            }

            aBool10401 = meshrasterizer_3.i();
            meshrasterizer_3.n();
            anInt10385 = meshrasterizer_3.YA();
            return class285_5;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = method15907(graphicalrenderer_1, 0);
        if (meshrasterizer_3 != null) {
            Matrix44Var matrix44var_4 = method11168();
            anInt10385 = meshrasterizer_3.YA();
            meshrasterizer_3.n();
            method15905(graphicalrenderer_1, meshrasterizer_3, matrix44var_4);
        }

    }

    @Override
    void method14697() {
        Vector3 vector3_2 = method11166().coords;
        aShort9458 = localX = (short) ((int) (vector3_2.x / 512.0F));
        aShort9456 = localY = (short) ((int) (vector3_2.z / 512.0F));
    }

    void method15905(AbstractRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3) {
        meshrasterizer_2.method11273(matrix44var_3);
        ParticleEmitterConfig[] arr_5 = meshrasterizer_2.method11253();
        SurfaceSkin[] arr_6 = meshrasterizer_2.method11274();
        if ((aClass539_10402 == null || aClass539_10402.aBool7132) && (arr_5 != null || arr_6 != null)) {
            aClass539_10402 = ParticleSystem.method11557(client.CYCLES_20MS, true);
        }

        if (aClass539_10402 != null) {
            aClass539_10402.method11511(graphicalrenderer_1, client.CYCLES_20MS, arr_5, arr_6);
            aClass539_10402.method11515(plane);
        }

    }

    public void method15906() {
        if (aClass539_10402 != null) {
            aClass539_10402.method11527();
        }

    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
    }

    @Override
    public int method13003() {
        return anInt10385 * -1120357653 * 1701537219;
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    MeshRasterizer method15907(AbstractRenderer graphicalrenderer_1, int i_2) {
        SpotAnimDefinitions spotanimdefinitions_4 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(spotAnimId);
        return spotanimdefinitions_4.method11228(graphicalrenderer_1, i_2, animation, (byte) 2);
    }

    @Override
    public int method13005() {
        return anInt10385 * -1120357653 * 1701537219;
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13001() {
        return aBool10401;
    }

    @Override
    boolean method13002() {
        return aBool10401;
    }

    @Override
    public int method13017() {
        return anInt10385 * -1120357653 * 1701537219;
    }

    @Override
    public int method13006() {
        return anInt10385 * -1120357653 * 1701537219;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15907(graphicalrenderer_1, 2048);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
            Class285 class285_4 = Class470.method7824(false);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass539_10402 != null) {
                Class151 class151_5 = aClass539_10402.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }

            aBool10401 = meshrasterizer_2.i();
            meshrasterizer_2.n();
            anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
            return class285_4;
        }
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15907(graphicalrenderer_1, 2048);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
            Class285 class285_4 = Class470.method7824(false);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass539_10402 != null) {
                Class151 class151_5 = aClass539_10402.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }

            aBool10401 = meshrasterizer_2.i();
            meshrasterizer_2.n();
            anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
            return class285_4;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15907(graphicalrenderer_1, 0);
        if (meshrasterizer_2 != null) {
            Matrix44Var matrix44var_3 = method11168();
            anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
            meshrasterizer_2.n();
            method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
        }

    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15907(graphicalrenderer_1, 0);
        if (meshrasterizer_2 != null) {
            Matrix44Var matrix44var_3 = method11168();
            anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
            meshrasterizer_2.n();
            method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
        }

    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    boolean method12987() {
        return aBool10401;
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    public void method15910(int i_1) {
        aBool10398 = true;
        CoordinateSpace class305_3 = new CoordinateSpace(method11166());
        class305_3.coords.x = (float) (class305_3.coords.x + aDouble10394 * i_1);
        class305_3.coords.z = (float) (class305_3.coords.z + aDouble10395 * i_1);
        if (useTerrainHeight) {
            class305_3.coords.y = (Class504.getTerrainHeightAtPos((int) class305_3.coords.x, (int) class305_3.coords.z, plane) - startHeight);
        } else if (angle != -1) {
            class305_3.coords.y = (float) (class305_3.coords.y + aDouble10397 * i_1 + (double) i_1 * i_1 * 0.5D * aDouble10390);
            aDouble10397 += i_1 * aDouble10390;
        } else {
            class305_3.coords.y = (float) (class305_3.coords.y + aDouble10397 * i_1);
        }

        class305_3.quaternion.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(aDouble10397, aDouble10396));
        Quaternion quaternion_4 = Quaternion.create();
        quaternion_4.angle(0.0F, 1.0F, 0.0F, (float) Math.atan2(aDouble10394, aDouble10395) - 3.1415927F);
        class305_3.quaternion.multiply(quaternion_4);
        quaternion_4.cache();
        method11191(class305_3);
        if (animation.method7627(1) && animation.method7580()) {
            animation.method7582();
        }

    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15907(graphicalrenderer_1, 2048);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            method15905(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
            Class285 class285_4 = Class470.method7824(false);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass539_10402 != null) {
                Class151 class151_5 = aClass539_10402.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }

            aBool10401 = meshrasterizer_2.i();
            meshrasterizer_2.n();
            anInt10385 = meshrasterizer_2.YA() * -1120357653 * 1701537219;
            return class285_4;
        }
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13026() {
        return false;
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    boolean method12985() {
        return false;
    }

}
