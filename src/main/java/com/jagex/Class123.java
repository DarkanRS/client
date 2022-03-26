package com.jagex;

public class Class123 {

    boolean aBool1546;

    Class476 aClass476_1541;

    MeshRasterizer aMeshRasterizer_1544;

    boolean[] aBoolArray1553;

    Shadow aCacheableNode_Sub17_1551;

    ParticleSystem aClass539_1538;

    int anInt1548;

    boolean aBool1552;

    boolean aBool1543;

    int anInt1547 = -1;

    int anInt1554;

    LocationIndexLoader aClass474_1536;

    int anInt1540;

    int anInt1555;

    int anInt1542;

    GraphNode_Sub1 aTransform_Sub1_1539;

    byte aByte1537;

    byte aByte1549;

    boolean aBool1550;

    Animation aAnimation_1545;

    Class123(AbstractRenderer graphicalrenderer_1, LocationIndexLoader objectindexloader_2, ObjectDefinition objectdefinitions_3, int i_4, int i_5, int i_6, int i_7, GraphNode_Sub1 class521_sub1_8, boolean bool_9, int i_10) {
        aClass474_1536 = objectindexloader_2;
        anInt1540 = objectdefinitions_3.id;
        anInt1555 = i_4;
        anInt1542 = i_5;
        aTransform_Sub1_1539 = class521_sub1_8;
        aBool1546 = i_10 != -1;
        aByte1537 = (byte) i_6;
        aByte1549 = (byte) i_7;
        aBool1543 = bool_9;
        aBool1550 = graphicalrenderer_1.method8402() && objectdefinitions_3.aBool5703 && !aBool1543;
        aAnimation_1545 = new Animation_Sub2(class521_sub1_8);
        method2124(false, i_10, 1);
    }

    public static int method2149() {
        if (IndexReference.anInt1039 == -1) {
            IndexReference[] arr_1 = Class158_Sub1.method13767();
            for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
                IndexReference indexreference_3 = arr_1[i_2];
                if (indexreference_3.indexId > IndexReference.anInt1039) {
                    IndexReference.anInt1039 = indexreference_3.indexId;
                }
            }
            ++IndexReference.anInt1039;
        }
        return IndexReference.anInt1039;
    }

    public static void method2152(int i_0) {
        VorbisNode class282_sub37_2 = (VorbisNode) Class492.INDEX36_FILE_CACHE.get(i_0);
        if (class282_sub37_2 != null) {
            class282_sub37_2.aBool7995 = !class282_sub37_2.aBool7995;
            class282_sub37_2.vfReference.method4924(class282_sub37_2.aBool7995);
        }
    }

    public void animate(int i_1) {
        aBool1546 = true;
        method2124(false, i_1, 1);
    }

    int method2115() {
        return anInt1554;
    }

    void method2116(Class476 class476_1) {
        aClass476_1541 = class476_1;
        aMeshRasterizer_1544 = null;
    }

    boolean method2117() {
        return aBool1550;
    }

    void method2118() {
        if (aCacheableNode_Sub17_1551 != null) {
            Vector3 vector3_3 = aTransform_Sub1_1539.method11166().coords;
            IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3427(aCacheableNode_Sub17_1551, aByte1549, (int) vector3_3.x, (int) vector3_3.z, aBoolArray1553);
            aBoolArray1553 = null;
            aCacheableNode_Sub17_1551 = null;
        }
    }

    void method2119(AbstractRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3, boolean bool_8) {
        ParticleEmitterConfig[] arr_10 = meshrasterizer_2.method11253();
        SurfaceSkin[] arr_11 = meshrasterizer_2.method11274();
        if ((aClass539_1538 == null || aClass539_1538.aBool7132) && (arr_10 != null || arr_11 != null)) {
            ObjectDefinition objectdefinitions_12 = aClass474_1536.getObjectDefs(anInt1540);
            if (objectdefinitions_12.transformTo != null) {
                objectdefinitions_12 = objectdefinitions_12.getMultiLoc(client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER);
            }
            if (objectdefinitions_12 != null) {
                aClass539_1538 = ParticleSystem.method11557(client.FRAME_COUNT, true);
            }
        }
        if (aClass539_1538 != null) {
            meshrasterizer_2.method11273(matrix44var_3);
            if (bool_8) {
                aClass539_1538.method11511(graphicalrenderer_1, client.FRAME_COUNT, arr_10, arr_11);
            } else {
                aClass539_1538.method11512(client.FRAME_COUNT);
            }
            aClass539_1538.method11515(aByte1537);
        }
    }

    int method2121() {
        return -method2115();
    }

    void method2124(boolean bool_1, int i_2, int i_3) {
        int i_31 = i_3;
        int i_5 = i_2;
        boolean bool_6 = false;
        if (i_2 == -1) {
            ObjectDefinition objectdefinitions_7 = aClass474_1536.getObjectDefs(anInt1540);
            ObjectDefinition objectdefinitions_8 = objectdefinitions_7;
            if (objectdefinitions_7.transformTo != null) {
                objectdefinitions_7 = objectdefinitions_7.getMultiLoc(client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER);
            }
            if (objectdefinitions_7 == null) {
                return;
            }
            if (objectdefinitions_8 == objectdefinitions_7) {
                objectdefinitions_8 = null;
            }
            if (objectdefinitions_7.method7967()) {
                if (bool_1 && aAnimation_1545.hasDefs() && objectdefinitions_7.method7979(aAnimation_1545.method7597())) {
                    return;
                }
                if (objectdefinitions_7.id != anInt1547) {
                    bool_6 = objectdefinitions_7.aBool5702;
                }
                i_5 = objectdefinitions_7.method7977();
                if (objectdefinitions_7.method7976()) {
                    i_31 = 0;
                } else {
                    i_31 = 1;
                }
            } else if (objectdefinitions_8 != null && objectdefinitions_8.method7967()) {
                if (bool_1 && aAnimation_1545.hasDefs() && objectdefinitions_8.method7979(aAnimation_1545.method7597())) {
                    return;
                }
                if (anInt1547 != objectdefinitions_7.id) {
                    bool_6 = objectdefinitions_8.aBool5702;
                }
                i_5 = objectdefinitions_8.method7977();
                if (objectdefinitions_8.method7976()) {
                    i_31 = 0;
                } else {
                    i_31 = 1;
                }
            }
        }
        if (i_5 == -1) {
            aAnimation_1545.method7569();
        } else {
            aAnimation_1545.animateFull(i_5, 0, i_31, bool_6);
            anInt1548 = client.FRAME_COUNT;
            aBool1552 = false;
            aMeshRasterizer_1544 = null;
        }
    }

    MeshRasterizer method2132(AbstractRenderer graphicalrenderer_1, int i_2, boolean bool_3, boolean bool_4) {
        ObjectDefinition objectdefinitions_6 = aClass474_1536.getObjectDefs(anInt1540);
        if (objectdefinitions_6.transformTo != null) {
            objectdefinitions_6 = objectdefinitions_6.getMultiLoc(client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER);
        }
        if (objectdefinitions_6 == null) {
            method2118();
            anInt1547 = -1;
            return null;
        } else {
            if (!aBool1546 && anInt1547 != objectdefinitions_6.id) {
                method2124(true, -1, 0);
                aBool1552 = false;
                aMeshRasterizer_1544 = null;
            }
            method2133();
            if (bool_4) {
                bool_4 &= aBool1550 & !aBool1552 & Class393.preferences.sceneryShadows.method12624() != 0;
            }
            if (bool_3 && !bool_4) {
                anInt1547 = objectdefinitions_6.id;
                return null;
            } else {
                Vector3 vector3_7 = aTransform_Sub1_1539.method11166().coords;
                SceneObjectManager sceneobjectmanager_8 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
                if (bool_4) {
                    sceneobjectmanager_8.method3427(aCacheableNode_Sub17_1551, aByte1549, (int) vector3_7.x, (int) vector3_7.z, aBoolArray1553);
                    aBool1552 = false;
                }
                Ground class390_9 = sceneobjectmanager_8.aGroundArray2591[aByte1549];
                Ground class390_10;
                if (aBool1543) {
                    class390_10 = sceneobjectmanager_8.aGroundArray2607[0];
                } else {
                    class390_10 = aByte1549 < 3 ? sceneobjectmanager_8.aGroundArray2591[aByte1549 + 1] : null;
                }
                MeshRasterizer meshrasterizer_11 = null;
                if (aAnimation_1545.hasDefs()) {
                    if (bool_4) {
                        i_2 |= 0x40000;
                    }
                    meshrasterizer_11 = objectdefinitions_6.method8012(graphicalrenderer_1, i_2, anInt1555 != 11 ? anInt1555 : 10, anInt1555 == 11 ? 4 + anInt1542 : anInt1542, class390_9, class390_10, (int) vector3_7.x, class390_9.averageHeight((int) vector3_7.x, (int) vector3_7.z), (int) vector3_7.z, aAnimation_1545, aClass476_1541);
                    if (meshrasterizer_11 != null) {
                        if (bool_4) {
                            if (aBoolArray1553 == null) {
                                aBoolArray1553 = new boolean[4];
                            }
                            aCacheableNode_Sub17_1551 = meshrasterizer_11.ga(aCacheableNode_Sub17_1551);
                            sceneobjectmanager_8.method3426(aCacheableNode_Sub17_1551, aByte1549, (int) vector3_7.x, (int) vector3_7.z, aBoolArray1553);
                            aBool1552 = true;
                        }
                        anInt1554 = meshrasterizer_11.YA();
                        meshrasterizer_11.n();
                    } else {
                        aBoolArray1553 = null;
                        aCacheableNode_Sub17_1551 = null;
                        anInt1554 = 0;
                    }
                    aMeshRasterizer_1544 = null;
                } else if (aMeshRasterizer_1544 != null && (aMeshRasterizer_1544.m() & i_2) == i_2 && anInt1547 == objectdefinitions_6.id) {
                    meshrasterizer_11 = aMeshRasterizer_1544;
                } else {
                    if (aMeshRasterizer_1544 != null) {
                        i_2 |= aMeshRasterizer_1544.m();
                    }
                    Class452 class452_12 = objectdefinitions_6.method8010(graphicalrenderer_1, i_2, anInt1555 != 11 ? anInt1555 : 10, anInt1555 == 11 ? 4 + anInt1542 : anInt1542, class390_9, class390_10, (int) vector3_7.x, class390_9.averageHeight((int) vector3_7.x, (int) vector3_7.z), (int) vector3_7.z, bool_4, aClass476_1541);
                    if (class452_12 != null) {
                        aMeshRasterizer_1544 = meshrasterizer_11 = (MeshRasterizer) class452_12.anObject5443;
                        if (bool_4) {
                            aCacheableNode_Sub17_1551 = (Shadow) class452_12.anObject5444;
                            aBoolArray1553 = null;
                            sceneobjectmanager_8.method3426(aCacheableNode_Sub17_1551, aByte1549, (int) vector3_7.x, (int) vector3_7.z, null);
                            aBool1552 = true;
                        }
                        anInt1554 = meshrasterizer_11.YA();
                        meshrasterizer_11.n();
                    } else {
                        aBoolArray1553 = null;
                        aCacheableNode_Sub17_1551 = null;
                        aMeshRasterizer_1544 = null;
                        anInt1554 = 0;
                    }
                }
                anInt1547 = objectdefinitions_6.id;
                return meshrasterizer_11;
            }
        }
    }

    void method2133() {
        if (aAnimation_1545.hasDefs()) {
            if (aAnimation_1545.method7627(client.FRAME_COUNT - anInt1548)) {
                if (Class393.preferences.sceneryShadows.method12624() == 2) {
                    aBool1552 = false;
                }
                if (aAnimation_1545.method7580()) {
                    aAnimation_1545.update(-1);
                    aBool1546 = false;
                    method2124(false, -1, 0);
                }
            }
        } else {
            method2124(false, -1, 0);
        }
        anInt1548 = client.FRAME_COUNT;
    }

    void method2136(AbstractRenderer graphicalrenderer_1) {
        method2132(graphicalrenderer_1, 262144, true, true);
    }
}
