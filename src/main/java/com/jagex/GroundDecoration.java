package com.jagex;

public class GroundDecoration extends SceneObjectNode implements WorldObject {

    public Class123 aClass123_10507;
    boolean aBool10508 = true;
    Class200 aClass200_10505;
    boolean aBool10506;

    public GroundDecoration(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12) {
        super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, objectdefinitions_4.anInt5704);
        aClass123_10507 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, ObjectType.GROUND_DECORATION.id, i_11, i_5, i_6, this, bool_10, i_12);
        aBool10506 = objectdefinitions_4.interactable != 0 && !bool_10;
        method13008(1);
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }

    @Override
    boolean method12986() {
        return false;
    }

    @Override
    boolean method12987() {
        return aBool10508;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }

    @Override
    public int method12995() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method12997() {
        return aClass123_10507.method2121();
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_3 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_4 = method11168();
            CoordinateSpace class305_5 = method11166();
            Class285 class285_6 = Class470.method7824(aBool10506);
            int i_7 = (int) class305_5.coords.x >> 9;
            int i_8 = (int) class305_5.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, true);
            meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_9 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_9);
            }
            aBool10508 = meshrasterizer_3.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
            }
            return class285_6;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_3 != null) {
            Vector3 vector3_4 = method11166().coords;
            int i_5 = (int) vector3_4.x >> 9;
            int i_6 = (int) vector3_4.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, method11168(), false);
        }
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_5 = aClass123_10507.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, method11168(), false, 0);
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
    boolean method13026() {
        return false;
    }

    @Override
    public int getId() {
        return aClass123_10507.anInt1540;
    }

    @Override
    public int method92() {
        return aClass123_10507.anInt1542;
    }

    public void method16091(Class476 class476_1) {
        aClass123_10507.method2116(class476_1);
    }

    @Override
    public void method85() {
    }

    @Override
    public boolean method86() {
        return aClass123_10507.method2117();
    }

    @Override
    public void method87(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2136(graphicalrenderer_1);
    }

    @Override
    boolean method13001() {
        return aBool10508;
    }

    @Override
    public int method76() {
        return 1535779425 * aClass123_10507.anInt1540 * 1623064993;
    }

    @Override
    public int method39() {
        return 1535779425 * aClass123_10507.anInt1540 * 1623064993;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_4 = aClass123_10507.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_4 != null && meshrasterizer_4.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    boolean method13002() {
        return aBool10508;
    }

    @Override
    public int method91() {
        return -515017769 * aClass123_10507.anInt1542 * -2132267033;
    }

    @Override
    public void method38() {
    }

    @Override
    public int method77() {
        return aClass123_10507.anInt1555 * 2129865927 * 845010167;
    }

    @Override
    public void method90() {
    }

    @Override
    public boolean method94() {
        return aClass123_10507.method2117();
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10506);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10508 = meshrasterizer_2.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_2 != null) {
            Vector3 vector3_3 = method11166().coords;
            int i_4 = (int) vector3_3.x >> 9;
            int i_5 = (int) vector3_3.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, method11168(), false);
        }
    }

    @Override
    public void method83(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2136(graphicalrenderer_1);
    }

    @Override
    public void method97(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2118();
    }

    @Override
    public void method98(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2118();
    }

    @Override
    boolean method12999() {
        return false;
    }

    @Override
    public int method73() {
        return aClass123_10507.anInt1555 * 2129865927 * 845010167;
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13000() {
        return aBool10508;
    }

    @Override
    public int method13003() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method13017() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method13005() {
        return aClass123_10507.method2115();
    }

    @Override
    public int method89() {
        return aClass123_10507.anInt1555;
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10506);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10508 = meshrasterizer_2.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10506);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10507.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10507.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10508 = meshrasterizer_2.i() || aClass123_10507.aClass539_1538 != null;
            if (aClass200_10505 == null) {
                aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_2 != null) {
            Vector3 vector3_3 = method11166().coords;
            int i_4 = (int) vector3_3.x >> 9;
            int i_5 = (int) vector3_3.z >> 9;
            aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, method11168(), false);
        }
    }

    @Override
    public int method13006() {
        return aClass123_10507.method2115();
    }

    @Override
    public boolean method95() {
        return aClass123_10507.method2117();
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }

    @Override
    public void method88(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2118();
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    public void method93(AbstractRenderer graphicalrenderer_1) {
        aClass123_10507.method2136(graphicalrenderer_1);
    }

    @Override
    public void method96() {
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10505;
    }
}
