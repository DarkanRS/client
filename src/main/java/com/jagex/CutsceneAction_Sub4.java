package com.jagex;

public class CutsceneAction_Sub4 extends CutsceneAction {

    int anInt8520;
    int anInt8519;
    int anInt8521;
    int anInt8522;
    int anInt8523;

    CutsceneAction_Sub4(ByteBuf rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt8520 = rsbytebuffer_1.readUnsignedShort();
        int i_2 = rsbytebuffer_1.readInt();
        anInt8519 = i_2 >>> 16;
        anInt8521 = i_2 & 0xffff;
        anInt8522 = rsbytebuffer_1.readUnsignedByte();
        anInt8523 = rsbytebuffer_1.readUnsignedSmart();
    }

    static boolean method13788(int i_0) {
        return i_0 == 59 || i_0 == 2 || i_0 == 8 || i_0 == 17 || i_0 == 15 || i_0 == 16 || i_0 == 58;
    }

    static void method13789(CacheableNode_Sub7 class282_sub50_sub7_0, int i_1, int i_2, int i_3) {
        if (class282_sub50_sub7_0 != null && Class20.aClass482_171.tail != class282_sub50_sub7_0) {
            int i_4 = class282_sub50_sub7_0.anInt9581;
            int i_5 = class282_sub50_sub7_0.anInt9582;
            int clickType = class282_sub50_sub7_0.clickType;
            int i_7 = (int) class282_sub50_sub7_0.aLong9584;
            long long_8 = class282_sub50_sub7_0.aLong9584;
            if (clickType >= 2000) {
                clickType -= 2000;
            }

            if (Class209_Sub1.shiftDown && i_3 == -549787245)
            {
                clickType = 1007;
                i_7 = 8;
            }

            CoordGrid coordgrid_10 = IndexLoaders.MAP_REGION_DECODER.getBase();
            ClientProt outgoingpacket_11 = null;
            if (clickType == 44) {
                outgoingpacket_11 = ClientProt.PLAYER_OP1;
            } else if (clickType == 45) {
                outgoingpacket_11 = ClientProt.PLAYER_OP2;
            } else if (clickType == 46) {
                outgoingpacket_11 = ClientProt.PLAYER_OP3;
            } else if (clickType == 47) {
                outgoingpacket_11 = ClientProt.PLAYER_OP4;
            } else if (clickType == 48) {
                outgoingpacket_11 = ClientProt.PLAYER_OP5;
            } else if (clickType == 49) {
                outgoingpacket_11 = ClientProt.PLAYER_OP6;
            } else if (clickType == 50) {
                outgoingpacket_11 = ClientProt.PLAYER_OP7;
            } else if (clickType == 51) {
                outgoingpacket_11 = ClientProt.PLAYER_OP8;
            } else if (clickType == 52) {
                outgoingpacket_11 = ClientProt.PLAYER_OP9;
            } else if (clickType == 53) {
                outgoingpacket_11 = ClientProt.PLAYER_OP10;
            }

            PlayerEntity player_12;
            TCPPacket tcpmessage_13;
            if (outgoingpacket_11 != null) {
                player_12 = client.players[i_7];
                if (player_12 != null) {
                    client.anInt7293 = i_1;
                    client.anInt7294 = i_2;
                    client.anInt7296 = 2;
                    client.anInt7295 = 0;
                    tcpmessage_13 = TCPPacket.createPacket(outgoingpacket_11, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_13.buffer.writeShort(i_7);
                    tcpmessage_13.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
                    MapRegion.routeTo(player_12.regionBaseX[0], player_12.regionBaseY[0], true, Class344.method6115(player_12.regionBaseX[0], player_12.regionBaseY[0], player_12.getSize(), player_12.getSize()));
                }
            }

            TCPPacket tcpmessage_17;
            if (clickType == 16) {
                client.anInt7293 = i_1;
                client.anInt7294 = i_2;
                client.anInt7296 = 2;
                client.anInt7295 = 0;
                tcpmessage_17 = TCPPacket.createPacket(ClientProt.IF_ON_PLAYER, client.GAME_CONNECTION_CONTEXT.isaac);
                tcpmessage_17.buffer.writeShort(client.anInt7345);
                tcpmessage_17.buffer.writeShortLE(VertexNormal.MY_PLAYER.index);
                tcpmessage_17.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
                tcpmessage_17.buffer.writeIntV2(client.anInt56);
                tcpmessage_17.buffer.writeShortLE(client.anInt7346);
                client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_17);
            }

            if (clickType == 57 || clickType == 1007) {
                CutsceneAction_Sub10.method14603(i_7, i_5, i_4, class282_sub50_sub7_0.aString9588);
            }

            if (clickType == 15) {
                player_12 = client.players[i_7];
                if (player_12 != null) {
                    client.anInt7293 = i_1;
                    client.anInt7294 = i_2;
                    client.anInt7296 = 2;
                    client.anInt7295 = 0;
                    tcpmessage_13 = TCPPacket.createPacket(ClientProt.IF_ON_PLAYER, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_13.buffer.writeShort(client.anInt7345);
                    tcpmessage_13.buffer.writeShortLE(i_7);
                    tcpmessage_13.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
                    tcpmessage_13.buffer.writeIntV2(client.anInt56);
                    tcpmessage_13.buffer.writeShortLE(client.anInt7346);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
                    MapRegion.routeTo(player_12.regionBaseX[0], player_12.regionBaseY[0], true, Class344.method6115(player_12.regionBaseX[0], player_12.regionBaseY[0], player_12.getSize(), player_12.getSize()));
                }
            }

            if (clickType == 2) {
                client.anInt7293 = i_1;
                client.anInt7294 = i_2;
                client.anInt7296 = 2;
                client.anInt7295 = 0;
                tcpmessage_17 = TCPPacket.createPacket(ClientProt.IF_ON_OBJECT, client.GAME_CONNECTION_CONTEXT.isaac);
                tcpmessage_17.buffer.writeShortLE128(i_4 + coordgrid_10.x);
                tcpmessage_17.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
                tcpmessage_17.buffer.writeIntV1((int) (long_8 >>> 32) & 0x7fffffff);
                tcpmessage_17.buffer.writeInt(client.anInt56);
                tcpmessage_17.buffer.writeShortLE(client.anInt7346);
                tcpmessage_17.buffer.writeShort128(client.anInt7345);
                tcpmessage_17.buffer.writeShortLE(i_5 + coordgrid_10.y);
                client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_17);
                Class439.routeToSceneObject(i_4, i_5, long_8);
            }

            ClientProt outgoingpacket_18 = null;
            if (clickType == 9) {
                outgoingpacket_18 = ClientProt.NPC_OP1;
            } else if (clickType == 10) {
                outgoingpacket_18 = ClientProt.NPC_OP2;
            } else if (clickType == 11) {
                outgoingpacket_18 = ClientProt.NPC_OP3;
            } else if (clickType == 12) {
                outgoingpacket_18 = ClientProt.NPC_OP4;
            } else if (clickType == 13) {
                outgoingpacket_18 = ClientProt.NPC_OP5;
            } else if (clickType == 1003) {
                outgoingpacket_18 = ClientProt.NPC_EXAMINE;
            }

            TCPPacket tcpmessage_15;
            if (outgoingpacket_18 != null) {
                ObjectNode class282_sub47_19 = (ObjectNode) client.NPC_MAP.get(i_7);
                if (class282_sub47_19 != null) {
                    NPCEntity npc_14 = (NPCEntity) class282_sub47_19.anObject8068;
                    client.anInt7293 = i_1;
                    client.anInt7294 = i_2;
                    client.anInt7296 = 2;
                    client.anInt7295 = 0;
                    tcpmessage_15 = TCPPacket.createPacket(outgoingpacket_18, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_15.buffer.writeShort(i_7);
                    tcpmessage_15.buffer.writeByte(VertexNormal.method1465() ? 1 : 0);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_15);
                    MapRegion.routeTo(npc_14.regionBaseX[0], npc_14.regionBaseY[0], true, Class344.method6115(npc_14.regionBaseX[0], npc_14.regionBaseY[0], npc_14.getSize(), npc_14.getSize()));
                }
            }

            if (clickType == 60) {
                if (client.PLAYER_RIGHTS > 0 && PlaySoundVorbisCutsceneAction.method14577()) {
                    VarnIndexLoader.method7460(VertexNormal.MY_PLAYER.plane, i_4 + coordgrid_10.x, i_5 + coordgrid_10.y);
                } else {
                    client.anInt7293 = i_1;
                    client.anInt7294 = i_2;
                    client.anInt7296 = 1;
                    client.anInt7295 = 0;
                    tcpmessage_13 = TCPPacket.createPacket(ClientProt.UNK_63, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_13.buffer.writeShort128(i_4 + coordgrid_10.x);
                    tcpmessage_13.buffer.writeShort(i_5 + coordgrid_10.y);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
                }
            }

            if (clickType == 23) {
                if (client.PLAYER_RIGHTS > 0 && PlaySoundVorbisCutsceneAction.method14577()) {
                    VarnIndexLoader.method7460(VertexNormal.MY_PLAYER.plane, i_4 + coordgrid_10.x, i_5 + coordgrid_10.y);
                } else {
                    tcpmessage_13 = CutsceneArea.method12078(i_4, i_5, i_7);
                    if (i_7 == 1) {
                        tcpmessage_13.buffer.writeByte(-1);
                        tcpmessage_13.buffer.writeByte(-1);
                        tcpmessage_13.buffer.writeShort((int) client.camAngleY);
                        tcpmessage_13.buffer.writeByte(57);
                        tcpmessage_13.buffer.writeByte(client.anInt7255);
                        tcpmessage_13.buffer.writeByte(client.anInt7203);
                        tcpmessage_13.buffer.writeByte(89);
                        Vector3 vector3_20 = VertexNormal.MY_PLAYER.method11166().coords;
                        tcpmessage_13.buffer.writeShort((int) vector3_20.x);
                        tcpmessage_13.buffer.writeShort((int) vector3_20.z);
                        tcpmessage_13.buffer.writeByte(63);
                    } else {
                        client.anInt7293 = i_1;
                        client.anInt7294 = i_2;
                        client.anInt7296 = 1;
                        client.anInt7295 = 0;
                    }

                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
                    MapRegion.routeTo(i_4, i_5, true, SunDefinitions.method853(i_4, i_5));
                }
            }

            if (clickType == 17) {
                client.anInt7293 = i_1;
                client.anInt7294 = i_2;
                client.anInt7296 = 2;
                client.anInt7295 = 0;
                tcpmessage_13 = TCPPacket.createPacket(ClientProt.IF_ON_GROUND_ITEM, client.GAME_CONNECTION_CONTEXT.isaac);
                tcpmessage_13.buffer.writeShort128(client.anInt7346);
                tcpmessage_13.buffer.writeIntV2(client.anInt56);
                tcpmessage_13.buffer.writeShort(i_7);
                tcpmessage_13.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
                tcpmessage_13.buffer.writeShortLE128(client.anInt7345);
                tcpmessage_13.buffer.writeShortLE128(i_5 + coordgrid_10.y);
                tcpmessage_13.buffer.writeShortLE(i_4 + coordgrid_10.x);
                client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
                client.method12073(i_4, i_5);
            }

            if (clickType == 59) {
                client.anInt7293 = i_1;
                client.anInt7294 = i_2;
                client.anInt7296 = 1;
                client.anInt7295 = 0;
                tcpmessage_13 = TCPPacket.createPacket(ClientProt.IF_ON_TILE, client.GAME_CONNECTION_CONTEXT.isaac);
                tcpmessage_13.buffer.writeShortLE(client.anInt7346);
                tcpmessage_13.buffer.writeShortLE(i_5 + coordgrid_10.y);
                tcpmessage_13.buffer.writeIntV1(client.anInt56);
                tcpmessage_13.buffer.writeShort128(client.anInt7345);
                tcpmessage_13.buffer.writeShortLE(i_4 + coordgrid_10.x);
                client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_13);
                MapRegion.routeTo(i_4, i_5, true, SunDefinitions.method853(i_4, i_5));
            }

            if (clickType == 30 && client.aClass118_7352 == null) {
                Class158_Sub2.method14355(i_5, i_4);
                client.aClass118_7352 = Index.getIComponentDefinitions(i_5, i_4);
                if (client.aClass118_7352 != null) {
                    IComponentDefinitions.redrawComponent(client.aClass118_7352);
                }
            }

            IComponentDefinitions icomponentdefinitions_23;
            if (clickType == 58) {
                icomponentdefinitions_23 = Index.getIComponentDefinitions(i_5, i_4);
                if (icomponentdefinitions_23 != null) {
                    Class151.method2590(icomponentdefinitions_23);
                }
            }

            if (clickType == 25) {
                icomponentdefinitions_23 = Index.getIComponentDefinitions(i_5, i_4);
                if (icomponentdefinitions_23 != null) {
                    Class60.method1170();
                    IFTargetParams class282_sub10_21 = client.getIComponentSettings(icomponentdefinitions_23);
                    Class304.setUseOptionFlags(icomponentdefinitions_23, class282_sub10_21.getUseOptionFlags(), class282_sub10_21.interfaceId);
                    client.aString7275 = QuickChatMessage.method6157(icomponentdefinitions_23);
                    if (client.aString7275 == null) {
                        client.aString7275 = "Null";
                    }

                    client.aString7356 = icomponentdefinitions_23.useOnName + Utils.rgbToColHexShortcut(16777215);
                }
            } else {
                ClientProt outgoingpacket_27 = null;
                if (clickType == 18) {
                    outgoingpacket_27 = ClientProt.GROUND_ITEM_OP1;
                } else if (clickType == 19) {
                    outgoingpacket_27 = ClientProt.GROUND_ITEM_OP2;
                } else if (clickType == 20) {
                    outgoingpacket_27 = ClientProt.GROUND_ITEM_OP3;
                } else if (clickType == 21) {
                    outgoingpacket_27 = ClientProt.GROUND_ITEM_OP4;
                } else if (clickType == 22) {
                    outgoingpacket_27 = ClientProt.GROUND_ITEM_OP5;
                } else if (clickType == 1004) {
                    outgoingpacket_27 = ClientProt.GROUND_ITEM_EXAMINE;
                }

                if (outgoingpacket_27 != null) {
                    client.anInt7293 = i_1;
                    client.anInt7294 = i_2;
                    client.anInt7296 = 2;
                    client.anInt7295 = 0;
                    TCPPacket tcpmessage_22 = TCPPacket.createPacket(outgoingpacket_27, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_22.buffer.writeShortLE128(i_7);
                    tcpmessage_22.buffer.writeByteC(VertexNormal.method1465() ? 1 : 0);
                    tcpmessage_22.buffer.writeShort(i_5 + coordgrid_10.y);
                    tcpmessage_22.buffer.writeShort128(i_4 + coordgrid_10.x);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_22);
                    client.method12073(i_4, i_5);
                }

                if (clickType == 8) {
                    ObjectNode class282_sub47_24 = (ObjectNode) client.NPC_MAP.get(i_7);
                    if (class282_sub47_24 != null) {
                        NPCEntity npc_25 = (NPCEntity) class282_sub47_24.anObject8068;
                        client.anInt7293 = i_1;
                        client.anInt7294 = i_2;
                        client.anInt7296 = 2;
                        client.anInt7295 = 0;
                        TCPPacket tcpmessage_16 = TCPPacket.createPacket(ClientProt.IF_ON_NPC, client.GAME_CONNECTION_CONTEXT.isaac);
                        tcpmessage_16.buffer.writeIntV2(client.anInt56);
                        tcpmessage_16.buffer.writeShortLE128(i_7);
                        tcpmessage_16.buffer.write128Byte(VertexNormal.method1465() ? 1 : 0);
                        tcpmessage_16.buffer.writeShortLE128(client.anInt7346);
                        tcpmessage_16.buffer.writeShort128(client.anInt7345);
                        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_16);
                        MapRegion.routeTo(npc_25.regionBaseX[0], npc_25.regionBaseY[0], true, Class344.method6115(npc_25.regionBaseX[0], npc_25.regionBaseY[0], npc_25.getSize(), npc_25.getSize()));
                    }
                }

                ClientProt outgoingpacket_26 = null;
                if (clickType == 3) {
                    outgoingpacket_26 = ClientProt.OBJECT_OP1;
                } else if (clickType == 4) {
                    outgoingpacket_26 = ClientProt.OBJECT_OP2;
                } else if (clickType == 5) {
                    outgoingpacket_26 = ClientProt.OBJECT_OP3;
                } else if (clickType == 6) {
                    outgoingpacket_26 = ClientProt.OBJECT_OP4;
                } else if (clickType == 1001) {
                    outgoingpacket_26 = ClientProt.OBJECT_OP5;
                } else if (clickType == 1002) {
                    outgoingpacket_26 = ClientProt.OBJECT_EXAMINE;
                }

                if (outgoingpacket_26 != null) {
                    client.anInt7293 = i_1;
                    client.anInt7294 = i_2;
                    client.anInt7296 = 2;
                    client.anInt7295 = 0;
                    tcpmessage_15 = TCPPacket.createPacket(outgoingpacket_26, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_15.buffer.writeShort(i_5 + coordgrid_10.y);
                    tcpmessage_15.buffer.writeShort(i_4 + coordgrid_10.x);
                    tcpmessage_15.buffer.writeInt((int) (long_8 >>> 32) & 0x7fffffff);
                    tcpmessage_15.buffer.writeByte128(VertexNormal.method1465() ? 1 : 0);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_15);
                    Class439.routeToSceneObject(i_4, i_5, long_8);
                }

                if (clickType == 1008 || clickType == 1009 || clickType == 1010 || clickType == 1011 || clickType == 1012) {
                    Friend.method303(clickType, i_7, i_4);
                }

                if (client.aBool7344) {
                    Class60.method1170();
                }

                if (VarcStringIndexLoader.aClass118_4825 != null && client.anInt7297 == 0) {
                    IComponentDefinitions.redrawComponent(VarcStringIndexLoader.aClass118_4825);
                }
            }
        }

    }

    @Override
    public void method1592() {
        Class82.CUTSCENE_ENTITIES[anInt8520].move(anInt8519, anInt8521, anInt8522, anInt8523);
    }

    public void method1601() {
        Class82.CUTSCENE_ENTITIES[anInt8520 * 2062001331 * 2144840315].move(1910720287 * anInt8519 * 517305567, anInt8521 * -1845072575 * -194698559, 1760322517 * anInt8522 * 1440988541, 1015183835 * anInt8523 * 1479203411);
    }
}
