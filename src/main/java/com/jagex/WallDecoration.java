package com.jagex;

public class WallDecoration extends GraphNode_Sub1_Sub4 implements WorldObject {

    public Class123 aClass123_10501;
    boolean aBool10504 = true;
    Class200 aClass200_10503;
    boolean aBool10502;

    public WallDecoration(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14, int i_15) {
        super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, i_11, i_12);
        aClass123_10501 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, i_13, i_14, plane, i_6, this, bool_10, i_15);
        aBool10502 = objectdefinitions_4.interactable != 0 && !bool_10;
        method13008(1);
    }

    public static void method16086(int i_2, int i_3) {
        Class532.anInt7071 = 0;
        Class532.anInt7069 = i_2;
        Class532.anInt7070 = 0;
        Class532.anInt7068 = i_3;
    }

    static void method16087(PathingEntity animable_0) {
        if (animable_0.anIntArray10335 != null || animable_0.anIntArray10362 != null) {
            boolean bool_2 = true;
            CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getBase();
            for (int i_4 = 0; i_4 < animable_0.anIntArray10335.length; i_4++) {
                int i_5 = -1;
                if (animable_0.anIntArray10335 != null) {
                    i_5 = animable_0.anIntArray10335[i_4];
                }
                if (i_5 == -1) {
                    if (!animable_0.method15798(i_4, -1)) {
                        bool_2 = false;
                    }
                } else {
                    bool_2 = false;
                    boolean bool_6 = false;
                    boolean bool_7 = false;
                    Vector3 vector3_8 = animable_0.method11166().coords;
                    int i_9;
                    int i_10;
                    int i_11;
                    if ((i_5 & -1073741824) == -1073741824) {
                        i_11 = i_5 & 0xfffffff;
                        int i_12 = i_11 >> 14;
                        int i_13 = i_11 & 0x3fff;
                        i_9 = (int) vector3_8.x - ((i_12 - coordgrid_3.x) * 512 + 256);
                        i_10 = (int) vector3_8.z - ((i_13 - coordgrid_3.y) * 512 + 256);
                    } else {
                        Vector3 vector3_15;
                        if ((i_5 & 0x8000) != 0) {
                            i_11 = i_5 & 0x7fff;
                            PlayerEntity player_14 = client.players[i_11];
                            if (player_14 == null) {
                                animable_0.method15798(i_4, -1);
                                continue;
                            }
                            vector3_15 = player_14.method11166().coords;
                        } else {
                            ObjectNode class282_sub47_16 = (ObjectNode) client.NPC_MAP.get(i_5);
                            if (class282_sub47_16 == null) {
                                animable_0.method15798(i_4, -1);
                                continue;
                            }
                            NPCEntity npc_17 = (NPCEntity) class282_sub47_16.anObject8068;
                            vector3_15 = npc_17.method11166().coords;
                        }
                        i_9 = (int) vector3_8.x - (int) vector3_15.x;
                        i_10 = (int) vector3_8.z - (int) vector3_15.z;
                    }
                    if (i_9 != 0 || i_10 != 0) {
                        animable_0.method15798(i_4, (int) (Math.atan2(i_9, i_10) * 2607.5945876176133D) & 0x3fff);
                    }
                }
            }
            if (bool_2) {
                animable_0.anIntArray10335 = null;
                animable_0.anIntArray10362 = null;
            }
        }
    }

    public static void method16088(int i_0) {
        if (client.GAME_STATE == 3) {
            TCPPacket tcpmessage_2 = TCPPacket.createPacket(ServerPacket.UNK_79, client.LOBBY_CONNECTION_CONTEXT.isaac);
            tcpmessage_2.buffer.writeByte(i_0);
            client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
        }
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10501.method2132(graphicalrenderer_1, 262144, false, true);
        if (meshrasterizer_2 != null) {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            int i_5 = (int) class305_4.coords.x >> 9;
            int i_6 = (int) class305_4.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, false);
        }
    }

    @Override
    boolean method12987() {
        return aBool10504;
    }

    @Override
    public int method77() {
        return aClass123_10501.anInt1555 * 2129865927 * 845010167;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10503;
    }

    @Override
    public int method13017() {
        return aClass123_10501.method2115();
    }

    @Override
    public int method12997() {
        return aClass123_10501.method2121();
    }

    public void method16082(Class476 class476_1) {
        aClass123_10501.method2116(class476_1);
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_3 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
            matrix44var_4.method5209(method11168());
            matrix44var_4.method5219(aShort9611, 0.0F, aShort9612);
            CoordinateSpace class305_5 = method11166();
            Class285 class285_6 = Class470.method7824(aBool10502);
            int i_7 = (int) class305_5.coords.x >> 9;
            int i_8 = (int) class305_5.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, true);
            meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
            if (aClass123_10501.aClass539_1538 != null) {
                Class151 class151_9 = aClass123_10501.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_9);
            }
            aBool10504 = meshrasterizer_3.i() || aClass123_10501.aClass539_1538 != null;
            if (aClass200_10503 == null) {
                aClass200_10503 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
            } else {
                Class388.method6694(aClass200_10503, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
            }
            return class285_6;
        }
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_3 = aClass123_10501.method2132(graphicalrenderer_1, 262144, false, true);
        if (meshrasterizer_3 != null) {
            Matrix44Var matrix44var_4 = method11168();
            CoordinateSpace class305_5 = method11166();
            int i_6 = (int) class305_5.coords.x >> 9;
            int i_7 = (int) class305_5.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, false);
        }
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_5 = aClass123_10501.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10501.method2132(graphicalrenderer_1, 262144, false, true);
        if (meshrasterizer_2 != null) {
            Matrix44Var matrix44var_3 = method11168();
            CoordinateSpace class305_4 = method11166();
            int i_5 = (int) class305_4.coords.x >> 9;
            int i_6 = (int) class305_4.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, false);
        }
    }

    @Override
    public int method12995() {
        return aClass123_10501.method2115();
    }

    @Override
    public int method91() {
        return -515017769 * aClass123_10501.anInt1542 * -2132267033;
    }

    @Override
    public void method85() {
    }

    @Override
    public boolean method86() {
        return aClass123_10501.method2117();
    }

    @Override
    public void method87(AbstractRenderer graphicalrenderer_1) {
        aClass123_10501.method2136(graphicalrenderer_1);
    }

    @Override
    public void method88(AbstractRenderer graphicalrenderer_1) {
        aClass123_10501.method2118();
    }

    @Override
    public int method76() {
        return aClass123_10501.anInt1540 * 1623064993 * 1535779425;
    }

    @Override
    public int method39() {
        return aClass123_10501.anInt1540 * 1623064993 * 1535779425;
    }

    @Override
    public int method73() {
        return aClass123_10501.anInt1555 * 2129865927 * 845010167;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10503;
    }

    @Override
    public void method38() {
    }

    @Override
    public int method92() {
        return aClass123_10501.anInt1542;
    }

    @Override
    public void method90() {
    }

    @Override
    public boolean method94() {
        return aClass123_10501.method2117();
    }

    @Override
    public void method93(AbstractRenderer graphicalrenderer_1) {
        aClass123_10501.method2136(graphicalrenderer_1);
    }

    @Override
    public void method83(AbstractRenderer graphicalrenderer_1) {
        aClass123_10501.method2136(graphicalrenderer_1);
    }

    @Override
    public void method97(AbstractRenderer graphicalrenderer_1) {
        aClass123_10501.method2118();
    }

    @Override
    public void method98(AbstractRenderer graphicalrenderer_1) {
        aClass123_10501.method2118();
    }

    @Override
    boolean method12986() {
        return false;
    }

    @Override
    boolean method13000() {
        return aBool10504;
    }

    @Override
    boolean method13001() {
        return aBool10504;
    }

    @Override
    public void method96() {
    }

    @Override
    public int method13003() {
        return aClass123_10501.method2115();
    }

    @Override
    public int getId() {
        return aClass123_10501.anInt1540;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            matrix44var_3.method5209(method11168());
            matrix44var_3.method5219(aShort9611, 0.0F, aShort9612);
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10502);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10501.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10501.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10504 = meshrasterizer_2.i() || aClass123_10501.aClass539_1538 != null;
            if (aClass200_10503 == null) {
                aClass200_10503 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10503, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    public int method13006() {
        return aClass123_10501.method2115();
    }

    @Override
    public int method13005() {
        return aClass123_10501.method2115();
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            matrix44var_3.method5209(method11168());
            matrix44var_3.method5219(aShort9611, 0.0F, aShort9612);
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10502);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10501.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10501.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10504 = meshrasterizer_2.i() || aClass123_10501.aClass539_1538 != null;
            if (aClass200_10503 == null) {
                aClass200_10503 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10503, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        MeshRasterizer meshrasterizer_2 = aClass123_10501.method2132(graphicalrenderer_1, 2048, false, true);
        if (meshrasterizer_2 == null) {
            return null;
        } else {
            Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
            matrix44var_3.method5209(method11168());
            matrix44var_3.method5219(aShort9611, 0.0F, aShort9612);
            CoordinateSpace class305_4 = method11166();
            Class285 class285_5 = Class470.method7824(aBool10502);
            int i_6 = (int) class305_4.coords.x >> 9;
            int i_7 = (int) class305_4.coords.z >> 9;
            aClass123_10501.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
            meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
            if (aClass123_10501.aClass539_1538 != null) {
                Class151 class151_8 = aClass123_10501.aClass539_1538.method11517();
                graphicalrenderer_1.method8456(class151_8);
            }
            aBool10504 = meshrasterizer_2.i() || aClass123_10501.aClass539_1538 != null;
            if (aClass200_10503 == null) {
                aClass200_10503 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            } else {
                Class388.method6694(aClass200_10503, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
            }
            return class285_5;
        }
    }

    @Override
    boolean method13002() {
        return aBool10504;
    }

    @Override
    public int method89() {
        return aClass123_10501.anInt1555;
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10503;
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return aClass200_10503;
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        MeshRasterizer meshrasterizer_4 = aClass123_10501.method2132(graphicalrenderer_1, 131072, false, false);
        return meshrasterizer_4 != null && meshrasterizer_4.method11270(i_2, i_3, method11168(), false, 0);
    }

    @Override
    public boolean method95() {
        return aClass123_10501.method2117();
    }

    @Override
    boolean method12999() {
        return false;
    }
}
