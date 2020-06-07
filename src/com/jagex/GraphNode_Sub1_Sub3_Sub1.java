package com.jagex;

public class GraphNode_Sub1_Sub3_Sub1 extends SceneObjectNode implements Location {
    Shadow aCacheableNode_Sub17_10491;
    Class200 aClass200_10494;
    boolean aBool10497;
    LocationIndexLoader aClass474_10492;
    int id;
    boolean aBool10493;
    byte aByte10496;
    boolean aBool10498;
    boolean aBool10500;
    MeshRasterizer aMeshRasterizer_10499;

    public GraphNode_Sub1_Sub3_Sub1(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, boolean bool_12) {
        super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, objectdefinitions_4.anInt5704);
        aClass474_10492 = objectindexloader_3;
        id = objectdefinitions_4.id;
        aBool10493 = bool_10;
        aByte10496 = (byte) i_11;
        aBool10498 = objectdefinitions_4.interactable != 0 && !bool_10;
        aBool10497 = bool_12;
        aBool10500 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !aBool10493 && Class393.preferences.sceneryShadows.method12624() != 0;
        int i_13 = 2048;
        if (aBool10497) {
            i_13 |= 0x10000;
        }
        if (objectdefinitions_4.aBool5711) {
            i_13 |= 0x80000;
        }
        Class452 class452_14 = method16074(graphicalrenderer_2, i_13, aBool10500);
        if (class452_14 != null) {
            aMeshRasterizer_10499 = (MeshRasterizer) class452_14.anObject5443;
            aCacheableNode_Sub17_10491 = (Shadow) class452_14.anObject5444;
            if (aBool10497 || objectdefinitions_4.aBool5711) {
                aMeshRasterizer_10499 = aMeshRasterizer_10499.method11289((byte) 0, i_13, false);
                if (objectdefinitions_4.aBool5711) {
                    Class341 class341_15 = IndexLoaders.MAP_REGION_DECODER.method4426();
                    aMeshRasterizer_10499.PA(class341_15.anInt3992, class341_15.anInt3993, class341_15.anInt3994, class341_15.anInt3995);
                }
            }
        }
        method13008(1);
    }

    public static void method16078(MeshRasterizer meshrasterizer_0, Animation animation_1, Animation animation_2) {
        if (animation_1.method7562() && animation_2.method7562()) {
            AnimationDefinitions animationdefinitions_4 = animation_1.defs;
            AnimationDefinitions animationdefinitions_5 = animation_2.defs;
            meshrasterizer_0.method11264(animation_1.aClass462_5464.aCacheableNode_Sub13_5545, animation_1.aClass462_5464.anInt5542, animation_1.aClass462_5464.animationFrameSet, animation_1.aClass462_5464.anInt5547, animation_1.anInt5457, animationdefinitions_4.frameDurations[animation_1.anInt5460], animation_2.aClass462_5464.aCacheableNode_Sub13_5545, animation_2.aClass462_5464.anInt5542, animation_2.aClass462_5464.animationFrameSet, animation_2.aClass462_5464.anInt5547, animation_2.anInt5457, animationdefinitions_5.frameDurations[animation_2.anInt5460], animationdefinitions_4.aBoolArray5915, animationdefinitions_4.aBool5923 | animationdefinitions_5.aBool5923);
        }
    }

    static MouseRecord_Sub2 method16080(int i_0, int i_1, int i_2, long long_3, int i_5) {
        MouseRecord_Sub2[] arr_7 = MouseRecord_Sub2.aMouseRecord_Sub2Array9633;
        synchronized (MouseRecord_Sub2.aMouseRecord_Sub2Array9633) {
            MouseRecord_Sub2 class282_sub53_sub2_8;
            if (Class279.anInt3370 == 0) {
                class282_sub53_sub2_8 = new MouseRecord_Sub2();
            } else {
                class282_sub53_sub2_8 = MouseRecord_Sub2.aMouseRecord_Sub2Array9633[--Class279.anInt3370];
            }
            class282_sub53_sub2_8.anInt9631 = i_0;
            class282_sub53_sub2_8.anInt9632 = i_1;
            class282_sub53_sub2_8.anInt9629 = i_2;
            class282_sub53_sub2_8.aLong9634 = long_3;
            class282_sub53_sub2_8.anInt9635 = i_5;
            return class282_sub53_sub2_8;
        }
    }

    static boolean method16081() {
        return Class179.aBool2229;
    }

    @Override
    public void method98(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10491 == null && aBool10500) {
            Class452 class452_4 = method16074(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10491;
            aCacheableNode_Sub17_10491 = null;
        }
        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3427(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }
    }

    @Override
    public void method96() {
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.method11259();
        }
    }

    @Override
    public int method13003() {
        return aMeshRasterizer_10499 != null ? aMeshRasterizer_10499.YA() : 0;
    }

    @Override
    public int method12995() {
        return aMeshRasterizer_10499 != null ? aMeshRasterizer_10499.YA() : 0;
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10499 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = method11168();
            Class285 class285_4 = Class470.method7824(aBool10498);
            aMeshRasterizer_10499.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            return class285_4;
        }
    }

    Class452 method16074(AbstractRenderer graphicalrenderer_1, int i_2, boolean bool_3) {
        ObjectDefinition objectdefinitions_5 = aClass474_10492.getObjectDefs(id);
        Ground class390_6;
        Ground class390_7;
        if (aBool10493) {
            class390_6 = aClass206_7970.aGroundArray2614[collisionPlane];
            class390_7 = aClass206_7970.aGroundArray2607[0];
        } else {
            class390_6 = aClass206_7970.aGroundArray2607[collisionPlane];
            if (collisionPlane < 3) {
                class390_7 = aClass206_7970.aGroundArray2607[collisionPlane + 1];
            } else {
                class390_7 = null;
            }
        }
        Vector3 vector3_8 = method11166().coords;
        return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, ObjectType.GROUND_DECORATION.id, aByte10496, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, null);
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_3 = method11166().coords;
        if (aClass200_10494 == null) {
            aClass200_10494 = EntityNode_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, method16075(graphicalrenderer_1, 0));
        }
        return aClass200_10494;
    }

    @Override
    public int method91() {
        return aByte10496;
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    public void method88(AbstractRenderer graphicalrenderer_1) {
        Object obj_3 = null;
        Shadow class282_sub50_sub17_4;
        if (aCacheableNode_Sub17_10491 == null && aBool10500) {
            Class452 class452_5 = method16074(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
        } else {
            class282_sub50_sub17_4 = aCacheableNode_Sub17_10491;
            aCacheableNode_Sub17_10491 = null;
        }
        Vector3 vector3_6 = method11166().coords;
        if (class282_sub50_sub17_4 != null) {
            aClass206_7970.method3427(class282_sub50_sub17_4, collisionPlane, (int) vector3_6.x, (int) vector3_6.z, null);
        }
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10499 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_2 = method11168();
            Class285 class285_3 = Class470.method7824(aBool10498);
            aMeshRasterizer_10499.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
            return class285_3;
        }
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        if (class521_sub1_2 instanceof GraphNode_Sub1_Sub3_Sub1) {
            GraphNode_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1_8 = (GraphNode_Sub1_Sub3_Sub1) class521_sub1_2;
            if (aMeshRasterizer_10499 != null && class521_sub1_sub3_sub1_8.aMeshRasterizer_10499 != null) {
                aMeshRasterizer_10499.method11269(class521_sub1_sub3_sub1_8.aMeshRasterizer_10499, i_3, i_4, i_5, bool_6);
            }
        }
    }

    @Override
    void method12984() {
        aBool10497 = false;
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.KA(aMeshRasterizer_10499.m() & -65537);
        }
    }

    @Override
    public int getId() {
        return id;
    }

    MeshRasterizer method16075(AbstractRenderer graphicalrenderer_1, int i_2) {
        if (aMeshRasterizer_10499 != null && graphicalrenderer_1.method8452(aMeshRasterizer_10499.m(), i_2) == 0) {
            return aMeshRasterizer_10499;
        } else {
            Class452 class452_4 = method16074(graphicalrenderer_1, i_2, false);
            return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
        }
    }

    @Override
    public int method92() {
        return aByte10496;
    }

    @Override
    boolean method12986() {
        return aMeshRasterizer_10499 == null || !aMeshRasterizer_10499.u();
    }

    @Override
    boolean method13011() {
        return aBool10497;
    }

    @Override
    public void method93(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10491 == null && aBool10500) {
            Class452 class452_4 = method16074(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10491;
            aCacheableNode_Sub17_10491 = null;
        }
        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3426(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }
    }

    @Override
    boolean method12985() {
        return aBool10497;
    }

    @Override
    public int method39() {
        return -1419362635 * id * -1031192675;
    }

    @Override
    public int method73() {
        return ObjectType.GROUND_DECORATION.id * 2087055829 * 1109376893;
    }

    @Override
    public int method77() {
        return ObjectType.GROUND_DECORATION.id * 2087055829 * 1109376893;
    }

    @Override
    public boolean method86() {
        return aBool10500;
    }

    @Override
    public void method87(AbstractRenderer graphicalrenderer_1) {
        Object obj_3 = null;
        Shadow class282_sub50_sub17_4;
        if (aCacheableNode_Sub17_10491 == null && aBool10500) {
            Class452 class452_5 = method16074(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
        } else {
            class282_sub50_sub17_4 = aCacheableNode_Sub17_10491;
            aCacheableNode_Sub17_10491 = null;
        }
        Vector3 vector3_6 = method11166().coords;
        if (class282_sub50_sub17_4 != null) {
            aClass206_7970.method3426(class282_sub50_sub17_4, collisionPlane, (int) vector3_6.x, (int) vector3_6.z, null);
        }
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    public void method90() {
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.method11259();
        }
    }

    @Override
    public boolean method94() {
        return aBool10500;
    }

    @Override
    public boolean method95() {
        return aBool10500;
    }

    @Override
    public void method85() {
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.method11259();
        }
    }

    @Override
    public void method83(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10491 == null && aBool10500) {
            Class452 class452_4 = method16074(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10491;
            aCacheableNode_Sub17_10491 = null;
        }
        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3426(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }
    }

    @Override
    public void method97(AbstractRenderer graphicalrenderer_1) {
        Object obj_2 = null;
        Shadow class282_sub50_sub17_3;
        if (aCacheableNode_Sub17_10491 == null && aBool10500) {
            Class452 class452_4 = method16074(graphicalrenderer_1, 262144, true);
            class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
        } else {
            class282_sub50_sub17_3 = aCacheableNode_Sub17_10491;
            aCacheableNode_Sub17_10491 = null;
        }
        Vector3 vector3_5 = method11166().coords;
        if (class282_sub50_sub17_3 != null) {
            aClass206_7970.method3427(class282_sub50_sub17_3, collisionPlane, (int) vector3_5.x, (int) vector3_5.z, null);
        }
    }

    @Override
    public int method76() {
        return -1419362635 * id * -1031192675;
    }

    @Override
    boolean method12999() {
        return aMeshRasterizer_10499 == null || !aMeshRasterizer_10499.u();
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        if (class521_sub1_2 instanceof GraphNode_Sub1_Sub3_Sub1) {
            GraphNode_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1_7 = (GraphNode_Sub1_Sub3_Sub1) class521_sub1_2;
            if (aMeshRasterizer_10499 != null && class521_sub1_sub3_sub1_7.aMeshRasterizer_10499 != null) {
                aMeshRasterizer_10499.method11269(class521_sub1_sub3_sub1_7.aMeshRasterizer_10499, i_3, i_4, i_5, bool_6);
            }
        }
    }

    @Override
    boolean method13001() {
        return aMeshRasterizer_10499 != null && aMeshRasterizer_10499.i();
    }

    @Override
    boolean method13002() {
        return aMeshRasterizer_10499 != null && aMeshRasterizer_10499.i();
    }

    @Override
    boolean method13000() {
        return aMeshRasterizer_10499 != null && aMeshRasterizer_10499.i();
    }

    @Override
    public int method13017() {
        return aMeshRasterizer_10499 != null ? aMeshRasterizer_10499.YA() : 0;
    }

    @Override
    public int method13005() {
        return aMeshRasterizer_10499 != null ? aMeshRasterizer_10499.YA() : 0;
    }

    @Override
    public int method13006() {
        return aMeshRasterizer_10499 != null ? aMeshRasterizer_10499.YA() : 0;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10499 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_2 = method11168();
            Class285 class285_3 = Class470.method7824(aBool10498);
            aMeshRasterizer_10499.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
            return class285_3;
        }
    }

    @Override
    boolean method12987() {
        return aMeshRasterizer_10499 != null && aMeshRasterizer_10499.i();
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        if (aMeshRasterizer_10499 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_2 = method11168();
            Class285 class285_3 = Class470.method7824(aBool10498);
            aMeshRasterizer_10499.method11282(matrix44var_2, boundingBoxPolygons[0], 0);
            return class285_3;
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    boolean method13026() {
        return aBool10497;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_4 = method16075(graphicalrenderer_1, 131072);
        if (meshrasterizer_4 != null) {
            Matrix44Var matrix44var_5 = method11168();
            return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
        } else {
            return false;
        }
    }

    @Override
    public void method38() {
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.method11259();
        }
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        if (aClass200_10494 == null) {
            aClass200_10494 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16075(graphicalrenderer_1, 0));
        }
        return aClass200_10494;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        if (aClass200_10494 == null) {
            aClass200_10494 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16075(graphicalrenderer_1, 0));
        }
        return aClass200_10494;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        if (aClass200_10494 == null) {
            aClass200_10494 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, method16075(graphicalrenderer_1, 0));
        }
        return aClass200_10494;
    }

    @Override
    public int method89() {
        return ObjectType.GROUND_DECORATION.id;
    }

    @Override
    void method13021() {
        aBool10497 = false;
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.KA(aMeshRasterizer_10499.m() & -65537);
        }
    }

    @Override
    void method13015() {
        aBool10497 = false;
        if (aMeshRasterizer_10499 != null) {
            aMeshRasterizer_10499.KA(aMeshRasterizer_10499.m() & -65537);
        }
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_5 = method16075(graphicalrenderer_1, 131072);
        if (meshrasterizer_5 != null) {
            Matrix44Var matrix44var_6 = method11168();
            return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
        } else {
            return false;
        }
    }
}
