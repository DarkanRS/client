package com.jagex;

public class InteractableObject extends GraphNode_Sub1_Sub1 implements WorldObject {

    public Class123 aClass123_10509;
    boolean aBool10512 = true;
    Class200 aClass200_10510;
    boolean aBool10511;

    public InteractableObject(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17) {
        super(sceneobjectmanager_1, i_5, i_6, i_7, i_8, i_9, i_11, i_12, i_13, i_14, objectdefinitions_4.supportsItems == 1, FriendStatus.method7705(i_15, i_16));
        aClass123_10509 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, i_15, i_16, plane, i_6, this, bool_10, i_17);
        aBool10511 = objectdefinitions_4.interactable != 0 && !bool_10;
        method13008(1);
    }

    public static void method16099(IComponentDefinitions[] arr_0, int i_1, int i_2, int i_3, boolean bool_4) {
        for (int i_6 = 0; i_6 < arr_0.length; i_6++) {
            IComponentDefinitions icomponentdefinitions_7 = arr_0[i_6];
            if (icomponentdefinitions_7 != null && icomponentdefinitions_7.parent == i_1) {
                Class484.initSizes(icomponentdefinitions_7, i_2, i_3, bool_4);
                Class246.method4204(icomponentdefinitions_7, i_2, i_3);
                if (icomponentdefinitions_7.scrollX > icomponentdefinitions_7.scrollWidth - icomponentdefinitions_7.width) {
                    icomponentdefinitions_7.scrollX = icomponentdefinitions_7.scrollWidth - icomponentdefinitions_7.width;
                }
                if (icomponentdefinitions_7.scrollX < 0) {
                    icomponentdefinitions_7.scrollX = 0;
                }
                if (icomponentdefinitions_7.scrollY > icomponentdefinitions_7.scrollHeight - icomponentdefinitions_7.height) {
                    icomponentdefinitions_7.scrollY = icomponentdefinitions_7.scrollHeight - icomponentdefinitions_7.height;
                }
                if (icomponentdefinitions_7.scrollY < 0) {
                    icomponentdefinitions_7.scrollY = 0;
                }
                if (icomponentdefinitions_7.type == ComponentType.CONTAINER) {
                    Class480.method8044(arr_0, icomponentdefinitions_7, bool_4);
                }
            }
        }
    }

    @Override
    public int method76() {
        return aClass123_10509.anInt1540 * 1623064993 * 1535779425;
    }

    @Override
    boolean method12986() {
        return false;
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10509.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_2 != null) {
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, method11168(), false);
        }
    }

    @Override
    public int method12995() {
        return aClass123_10509.method2115();
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10510;
    }

    @Override
    public boolean method94() {
        return aClass123_10509.method2117();
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_3 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_4 = method11168();
            Class285 class285_5 = Class470.method7824(aBool10511);
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, true);
            meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
            if (aClass123_10509.aClass539_1538 != null) {
                Class151 class151_6 = aClass123_10509.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_6);
            }
            aBool10512 = meshrasterizer_3.i() || aClass123_10509.aClass539_1538 != null;
            CoordinateSpace class305_7 = method11166();
            if (aClass200_10510 == null) {
                aClass200_10510 = EntityNode_Sub2.method12505((int) class305_7.coords.x, (int) class305_7.coords.y, (int) class305_7.coords.z, meshrasterizer_3);
            } else {
                Class388.method6694(aClass200_10510, (int) class305_7.coords.x, (int) class305_7.coords.y, (int) class305_7.coords.z, meshrasterizer_3);
            }
            return class285_5;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10509.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_3 != null) {
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_3, method11168(), false);
        }
    }

    public void method16096(Class476 class476_1) {
        aClass123_10509.method2116(class476_1);
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_5 = aClass123_10509.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    boolean method12985() {
        return false;
    }

    @Override
    boolean method13001() {
        return aBool10512;
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    public void method97(AbstractRenderer graphicalrenderer_1) {
        aClass123_10509.method2118();
    }

    @Override
    public int method89() {
        return aClass123_10509.anInt1555;
    }

    @Override
    public int method92() {
        return aClass123_10509.anInt1542;
    }

    @Override
    public void method85() {
    }

    @Override
    public boolean method86() {
        return aClass123_10509.method2117();
    }

    @Override
    public void method87(AbstractRenderer graphicalrenderer_1) {
        aClass123_10509.method2136(graphicalrenderer_1);
    }

    @Override
    public void method88(AbstractRenderer graphicalrenderer_1) {
        aClass123_10509.method2118();
    }

    @Override
    public int getId() {
        return aClass123_10509.anInt1540;
    }

    @Override
    public int method39() {
        return aClass123_10509.anInt1540 * 1623064993 * 1535779425;
    }

    @Override
    boolean method12987() {
        return aBool10512;
    }

    @Override
    public int method91() {
        return aClass123_10509.anInt1542 * -2132267033 * -515017769;
    }

    @Override
    public void method38() {
    }

    @Override
    public void method90() {
    }

    @Override
    public void method98(AbstractRenderer graphicalrenderer_1) {
        aClass123_10509.method2118();
    }

    @Override
    public boolean method95() {
        return aClass123_10509.method2117();
    }

    @Override
    public void method93(AbstractRenderer graphicalrenderer_1) {
        aClass123_10509.method2136(graphicalrenderer_1);
    }

    @Override
    public void method83(AbstractRenderer graphicalrenderer_1) {
        aClass123_10509.method2136(graphicalrenderer_1);
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            Class285 class285_4 = Class470.method7824(aBool10511);
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10509.aClass539_1538 != null) {
                Class151 class151_5 = aClass123_10509.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }
            aBool10512 = meshrasterizer_2.i() || aClass123_10509.aClass539_1538 != null;
            CoordinateSpace class305_6 = method11166();
            if (aClass200_10510 == null) {
                aClass200_10510 = EntityNode_Sub2.method12505((int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10510, (int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2);
            }
            return class285_4;
        }
    }

    @Override
    boolean method12999() {
        return false;
    }

    @Override
    public int method77() {
        return 845010167 * aClass123_10509.anInt1555 * 2129865927;
    }

    @Override
    boolean method13000() {
        return aBool10512;
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    boolean method13002() {
        return aBool10512;
    }

    @Override
    public int method13003() {
        return aClass123_10509.method2115();
    }

    @Override
    public int method13017() {
        return aClass123_10509.method2115();
    }

    @Override
    public int method13005() {
        return aClass123_10509.method2115();
    }

    @Override
    public int method13006() {
        return aClass123_10509.method2115();
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            Class285 class285_4 = Class470.method7824(aBool10511);
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10509.aClass539_1538 != null) {
                Class151 class151_5 = aClass123_10509.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }
            aBool10512 = meshrasterizer_2.i() || aClass123_10509.aClass539_1538 != null;
            CoordinateSpace class305_6 = method11166();
            if (aClass200_10510 == null) {
                aClass200_10510 = EntityNode_Sub2.method12505((int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10510, (int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2);
            }
            return class285_4;
        }
    }

    @Override
    public void method96() {
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            Class285 class285_4 = Class470.method7824(aBool10511);
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10509.aClass539_1538 != null) {
                Class151 class151_5 = aClass123_10509.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_5);
            }
            aBool10512 = meshrasterizer_2.i() || aClass123_10509.aClass539_1538 != null;
            CoordinateSpace class305_6 = method11166();
            if (aClass200_10510 == null) {
                aClass200_10510 = EntityNode_Sub2.method12505((int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10510, (int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2);
            }
            return class285_4;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10509.method2132(graphicalrenderer_1, 262144, true, true);
        if (meshrasterizer_2 != null) {
            aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, method11168(), false);
        }
    }

    @Override
    public int method73() {
        return 845010167 * aClass123_10509.anInt1555 * 2129865927;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10510;
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
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10510;
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10510;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_4 = aClass123_10509.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_4 != null && meshrasterizer_4.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    public int method12997() {
        return aClass123_10509.method2121();
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }
}
