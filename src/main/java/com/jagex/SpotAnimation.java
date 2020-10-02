package com.jagex;

public class SpotAnimation extends GraphNode_Sub1_Sub1 {

    boolean aBool10405 = true;
    int anInt10407;
    int rotation;
    int spotAnimId;
    Animation animation;
    ParticleSystem aClass539_10409;

    public SpotAnimation(SceneObjectManager objManager, int spotAnimId, int speed, int fromPlane, int toPlane, int localX, int height, int localY, int x1, int x2, int y1, int y2, int rotation, boolean setting2) {
        super(objManager, fromPlane, toPlane, localX, height, localY, x1, x2, y1, y2, false, (byte) 0);
        this.spotAnimId = spotAnimId;
        this.rotation = rotation;
        SpotAnimDefinitions spotanimdefinitions_15 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(this.spotAnimId);
        int animId = spotanimdefinitions_15.animationId;
        if (animId != -1) {
            animation = new Animation_Sub2(this);
            int i_17 = spotanimdefinitions_15.aBool6968 ? 0 : 2;
            if (setting2) {
                i_17 = 1;
            }

            animation.animateFull(animId, speed, i_17, false);
        }

        method13008(1);
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15929(graphicalrenderer_1, 0x800 | (868957945 * rotation * -2052644023 != 0 ? 5 : 0), spotAnimId * -1615535539 * 346760837);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            if (rotation * -2052644023 * 868957945 != 0) {
                meshrasterizer_2.f(1509410816 * rotation * -2052644023);
            }

            Matrix44Var matrix44var_3 = method11168();
            method15930(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
            Class285 class285_4 = Class470.method7824(false);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass539_10409 != null) {
                Class151 class151_5 = aClass539_10409.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }

            aBool10405 = meshrasterizer_2.i();
            anInt10407 = meshrasterizer_2.YA() * 1799159049 * -1656643271;
            meshrasterizer_2.n();
            return class285_4;
        }
    }

    @Override
    boolean method12986() {
        return false;
    }

    @Override
    public int method12995() {
        return anInt10407;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    public void method15926() {
        if (animation != null && !animation.method7580()) {
            animation.method7627(1);
        }

    }

    public boolean method15927() {
        return animation != null && !animation.hasSpeed();
    }

    public boolean method15928() {
        return animation == null || animation.method7580();
    }

    MeshRasterizer method15929(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        SpotAnimDefinitions spotanimdefinitions_5 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(i_3);
        Ground class390_6 = aClass206_7970.aGroundArray2607[plane];
        Ground class390_7 = collisionPlane < 3 ? aClass206_7970.aGroundArray2607[collisionPlane + 1] : null;
        Vector3 vector3_8 = method11166().coords;
        return animation != null && !animation.method7580() ? spotanimdefinitions_5.rasterize(graphicalrenderer_1, i_2, true, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, animation, (byte) 2) : spotanimdefinitions_5.rasterize(graphicalrenderer_1, i_2, true, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, null, (byte) 2);
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15929(graphicalrenderer_1, 0x800 | (868957945 * rotation * -2052644023 != 0 ? 5 : 0), spotAnimId * -1615535539 * 346760837);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            if (rotation * -2052644023 * 868957945 != 0) {
                meshrasterizer_2.f(1509410816 * rotation * -2052644023);
            }

            Matrix44Var matrix44var_3 = method11168();
            method15930(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
            Class285 class285_4 = Class470.method7824(false);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass539_10409 != null) {
                Class151 class151_5 = aClass539_10409.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }

            aBool10405 = meshrasterizer_2.i();
            anInt10407 = meshrasterizer_2.YA() * 1799159049 * -1656643271;
            meshrasterizer_2.n();
            return class285_4;
        }
    }

    void method15930(AbstractRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3) {
        meshrasterizer_2.method11273(matrix44var_3);
        ParticleEmitterConfig[] arr_5 = meshrasterizer_2.method11253();
        SurfaceSkin[] arr_6 = meshrasterizer_2.method11274();
        if ((aClass539_10409 == null || aClass539_10409.aBool7132) && (arr_5 != null || arr_6 != null)) {
            aClass539_10409 = ParticleSystem.method11557(client.CYCLES_20MS, true);
        }

        if (aClass539_10409 != null) {
            aClass539_10409.method11511(graphicalrenderer_1, client.CYCLES_20MS, arr_5, arr_6);
            aClass539_10409.method11515(plane);
        }

    }

    public void method15931() {
        if (aClass539_10409 != null) {
            aClass539_10409.method11527();
        }

    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
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
    boolean method12999() {
        return false;
    }

    @Override
    boolean method13000() {
        return aBool10405;
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    public int method13017() {
        return anInt10407 * 1799159049 * -1656643271;
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public int method13005() {
        return anInt10407 * 1799159049 * -1656643271;
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13002() {
        return aBool10405;
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15929(graphicalrenderer_1, 0x800 | (868957945 * rotation * -2052644023 != 0 ? 5 : 0), spotAnimId * -1615535539 * 346760837);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            if (rotation * -2052644023 * 868957945 != 0) {
                meshrasterizer_2.f(1509410816 * rotation * -2052644023);
            }

            Matrix44Var matrix44var_3 = method11168();
            method15930(graphicalrenderer_1, meshrasterizer_2, matrix44var_3);
            Class285 class285_4 = Class470.method7824(false);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass539_10409 != null) {
                Class151 class151_5 = aClass539_10409.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }

            aBool10405 = meshrasterizer_2.i();
            anInt10407 = meshrasterizer_2.YA() * 1799159049 * -1656643271;
            meshrasterizer_2.n();
            return class285_4;
        }
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = method15929(graphicalrenderer_1, 0x800 | (rotation != 0 ? 5 : 0), spotAnimId);
        if (meshrasterizer_3 == null) {
            return null;
        } else {
            if (rotation != 0) {
                meshrasterizer_3.f(rotation * 2048);
            }

            Matrix44Var matrix44var_4 = method11168();
            method15930(graphicalrenderer_1, meshrasterizer_3, matrix44var_4);
            Class285 class285_5 = Class470.method7824(false);
            meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
            if (aClass539_10409 != null) {
                Class151 class151_6 = aClass539_10409.method11517();
                graphicalrenderer_1.method8456(class151_6);
            }

            aBool10405 = meshrasterizer_3.i();
            anInt10407 = meshrasterizer_3.YA();
            meshrasterizer_3.n();
            return class285_5;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15929(graphicalrenderer_1, 0, 346760837 * spotAnimId * -1615535539);
        if (meshrasterizer_2 != null) {
            method15930(graphicalrenderer_1, meshrasterizer_2, method11168());
        }

    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = method15929(graphicalrenderer_1, 0, spotAnimId);
        if (meshrasterizer_3 != null) {
            method15930(graphicalrenderer_1, meshrasterizer_3, method11168());
        }

    }

    @Override
    boolean method13026() {
        return false;
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    public int method13006() {
        return anInt10407 * 1799159049 * -1656643271;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public int method13003() {
        return anInt10407 * 1799159049 * -1656643271;
    }

    @Override
    boolean method13001() {
        return aBool10405;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = method15929(graphicalrenderer_1, 0, 346760837 * spotAnimId * -1615535539);
        if (meshrasterizer_2 != null) {
            method15930(graphicalrenderer_1, meshrasterizer_2, method11168());
        }

    }

    @Override
    boolean method12987() {
        return aBool10405;
    }

    @Override
    boolean method13011() {
        return false;
    }

}
