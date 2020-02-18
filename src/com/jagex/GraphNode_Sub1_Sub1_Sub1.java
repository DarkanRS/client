package com.jagex;

public class GraphNode_Sub1_Sub1_Sub1 extends GraphNode_Sub1_Sub1 {

    MeshRasterizer aMeshRasterizer_10310;
    HintTrail aClass281_10311;

    GraphNode_Sub1_Sub1_Sub1(SceneObjectManager sceneobjectmanager_1, HintTrail class281_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        super(sceneobjectmanager_1, i_3, i_4, i_5, i_6, i_7, i_5 >> 9, i_5 >> 9, i_7 >> 9, i_7 >> 9, false, (byte) 0);
        aClass281_10311 = class281_2;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        return false;
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
    boolean method12986() {
        return aMeshRasterizer_10310 == null || !aMeshRasterizer_10310.u();
    }

    @Override
    boolean method12987() {
        return aMeshRasterizer_10310 != null && aMeshRasterizer_10310.i();
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
    }

    @Override
    void method12984() {
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10310 == null) {
            aMeshRasterizer_10310 = aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_4 = method11168();
            CoordinateSpace class305_5 = method11166();
            matrix44var_3.method5209(matrix44var_4);
            Class293 class293_6 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_5.coords.x >> 9][(int) class305_5.coords.z >> 9];
            if (class293_6 != null && class293_6.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_3.method5219(0.0F, (-class293_6.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            aMeshRasterizer_10310.method11282(matrix44var_3, null, 0);
        }

        return null;
    }

    @Override
    boolean method13001() {
        return aMeshRasterizer_10310 != null && aMeshRasterizer_10310.i();
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public int method12995() {
        return aMeshRasterizer_10310 != null ? aMeshRasterizer_10310.YA() : 0;
    }

    @Override
    boolean method12999() {
        return aMeshRasterizer_10310 == null || !aMeshRasterizer_10310.u();
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    boolean method13002() {
        return aMeshRasterizer_10310 != null && aMeshRasterizer_10310.i();
    }

    @Override
    public int method13003() {
        return aMeshRasterizer_10310 != null ? aMeshRasterizer_10310.YA() : 0;
    }

    @Override
    public int method13017() {
        return aMeshRasterizer_10310 != null ? aMeshRasterizer_10310.YA() : 0;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public int method13006() {
        return aMeshRasterizer_10310 != null ? aMeshRasterizer_10310.YA() : 0;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10310 == null) {
            aMeshRasterizer_10310 = aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            matrix44var_2.method5209(matrix44var_3);
            Class293 class293_5 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_2.method5219(0.0F, (-class293_5.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            aMeshRasterizer_10310.method11282(matrix44var_2, null, 0);
        }

        return null;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10310 == null) {
            aMeshRasterizer_10310 = aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            matrix44var_2.method5209(matrix44var_3);
            Class293 class293_5 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_2.method5219(0.0F, (-class293_5.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            aMeshRasterizer_10310.method11282(matrix44var_2, null, 0);
        }

        return null;
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
    }

    @Override
    public int method13005() {
        return aMeshRasterizer_10310 != null ? aMeshRasterizer_10310.YA() : 0;
    }

    @Override
    boolean method13026() {
        return false;
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10310 == null) {
            aMeshRasterizer_10310 = aClass281_10311.getMeshRasterizer(graphicalrenderer_1);
        }

        if (aMeshRasterizer_10310 != null) {
            Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            matrix44var_2.method5209(matrix44var_3);
            Class293 class293_5 = aClass206_7970.aClass293ArrayArrayArray2604[plane][(int) class305_4.coords.x >> 9][(int) class305_4.coords.z >> 9];
            if (class293_5 != null && class293_5.aTransform_Sub1_Sub3_3499 != null) {
                matrix44var_2.method5219(0.0F, (-class293_5.aTransform_Sub1_Sub3_3499.aShort9561), 0.0F);
            }

            aMeshRasterizer_10310.method11282(matrix44var_2, null, 0);
        }

        return null;
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    boolean method13000() {
        return aMeshRasterizer_10310 != null && aMeshRasterizer_10310.i();
    }

    @Override
    void method13021() {
    }

    @Override
    void method13015() {
    }

}
