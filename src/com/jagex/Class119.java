package com.jagex;

public class Class119 {

    public static HostNameIdentifier HOSTNAME_IDENTIFIER;
    public static JS5StandardRequester JS5_STANDARD_REQUESTER;
    static Class344 aClass344_1460;
    public int anInt1458;
    public int anInt1454;
    public int[] anIntArray1455;
    public int[] anIntArray1457;
    public Class455 aClass455_1456;
    int anInt1459;

    Class119(int i_1, int i_2, int[] ints_3, int[] ints_4, Class455 class455_5, int i_6) {
        anInt1458 = i_1;
        anInt1454 = i_2;
        anIntArray1455 = ints_3;
        anIntArray1457 = ints_4;
        aClass455_1456 = class455_5;
        anInt1459 = i_6;
    }

    public static void method2074(String string_0, String string_1, int i_2, boolean bool_3) {
        if (client.gameState == 3) {
            TCPPacket tcpmessage_5 = Class271.createPacket(ClientProt.SEND_SIGN_UP_FORM, client.LOBBY_CONNECTION_CONTEXT.isaac);
            tcpmessage_5.buffer.writeShort(0);
            int i_6 = tcpmessage_5.buffer.index;
            tcpmessage_5.buffer.writeString(string_0);
            tcpmessage_5.buffer.writeString(string_1);
            tcpmessage_5.buffer.writeByte(i_2);
            tcpmessage_5.buffer.writeByte(bool_3 ? 1 : 0);
            tcpmessage_5.buffer.index += 7;
            tcpmessage_5.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, i_6, tcpmessage_5.buffer.index);
            tcpmessage_5.buffer.method13281(tcpmessage_5.buffer.index - i_6);
            client.LOBBY_CONNECTION_CONTEXT.queuePacket(tcpmessage_5);
            if (i_2 < 13) {
                client.aBool7189 = true;
                Class188.method3142();
            }

            Class237.aClass494_2916 = Class494.aClass494_5790;
        }

    }

    public static void method2075(int i_0, String string_1) {
        int i_3 = Class197.NUM_PLAYER_INDICES;
        int[] ints_4 = Class197.PLAYER_INDICES;
        boolean bool_5 = false;

        for (int i_6 = 0; i_6 < i_3; i_6++) {
            PlayerEntity player_7 = client.players[ints_4[i_6]];
            if (player_7 != null && player_7 != VertexNormal.MY_PLAYER && player_7.displayName != null && player_7.displayName.equalsIgnoreCase(string_1)) {
                ClientProt outgoingpacket_8 = null;
                if (i_0 == 1) {
                    outgoingpacket_8 = ClientProt.PLAYER_OP1;
                } else if (i_0 == 4) {
                    outgoingpacket_8 = ClientProt.PLAYER_OP4;
                } else if (i_0 == 5) {
                    outgoingpacket_8 = ClientProt.PLAYER_OP5;
                } else if (i_0 == 6) {
                    outgoingpacket_8 = ClientProt.PLAYER_OP6;
                } else if (i_0 == 7) {
                    outgoingpacket_8 = ClientProt.PLAYER_OP7;
                } else if (i_0 == 9) {
                    outgoingpacket_8 = ClientProt.PLAYER_OP9;
                }

                if (outgoingpacket_8 != null) {
                    TCPPacket tcpmessage_9 = Class271.createPacket(outgoingpacket_8, client.GAME_CONNECTION_CONTEXT.isaac);
                    tcpmessage_9.buffer.writeShort(ints_4[i_6]);
                    tcpmessage_9.buffer.write128Byte(0);
                    client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_9);
                }

                bool_5 = true;
                break;
            }
        }

        if (!bool_5) {
            ChatLine.appendGameMessage(LocalizedText.UNABLE_TO_FIND.translate(Class223.CURRENT_LANGUAGE) + string_1);
        }

    }

    static void method2076(Component icomponentdefinitions_0, Component icomponentdefinitions_1) {
        TCPPacket tcpmessage_3 = Class271.createPacket(ClientProt.IF_DRAG_ONTO_IF, client.GAME_CONNECTION_CONTEXT.isaac);
        tcpmessage_3.buffer.writeShortLE128(icomponentdefinitions_1.slotId);
        tcpmessage_3.buffer.writeShortLE(icomponentdefinitions_0.slotId);
        tcpmessage_3.buffer.writeShort(icomponentdefinitions_1.containerItemId);
        tcpmessage_3.buffer.writeShortLE128(icomponentdefinitions_0.containerItemId);
        tcpmessage_3.buffer.writeIntV1(icomponentdefinitions_0.idHash);
        tcpmessage_3.buffer.writeIntLE(icomponentdefinitions_1.idHash);
        client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
    }

    public static void method2077() {
        Class393.preferences.setValue(Class393.preferences.removeRoofs, 1);
        Class393.preferences.setValue(Class393.preferences.removeRoofsOptionOverride, 1);
        Class393.preferences.setValue(Class393.preferences.groundDecor, 1);
        Class393.preferences.setValue(Class393.preferences.groundBlending, 1);
        Class393.preferences.setValue(Class393.preferences.idleAnimations, 0);
        Class393.preferences.setValue(Class393.preferences.flickeringEffects, 0);
        Class393.preferences.setValue(Class393.preferences.characterShadows, 0);
        Class393.preferences.setValue(Class393.preferences.sceneryShadows, 0);
        Class393.preferences.setValue(Class393.preferences.textures, 0);
        Class393.preferences.setValue(Class393.preferences.lightDetail, 0);
        Class393.preferences.setValue(Class393.preferences.water, 0);
        Class393.preferences.setValue(Class393.preferences.fog, 0);
        Class393.preferences.setValue(Class393.preferences.antiAliasingDefault, 0);
        Class393.preferences.setValue(Class393.preferences.aPreference_Sub4_8223, 0);
        Class393.preferences.setValue(Class393.preferences.particles, 0);
        Class393.preferences.setValue(Class393.preferences.buildArea, MapSize.SIZE_104.index);
        Class393.preferences.setValue(Class393.preferences.bloom, 0);
        Class393.preferences.setValue(Class393.preferences.skyBoxes, 0);
        ImageIndexLoader.method5777();
        Class393.preferences.setValue(Class393.preferences.maxScreenSize, 2);
        Class393.preferences.setValue(Class393.preferences.graphics, 2);
        Class94.method1589();
        IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
        client.aBool7185 = true;
    }

    public boolean method2073(int i_1, int i_2) {
        if (i_2 >= 0 && i_2 < anIntArray1457.length) {
            int i_4 = anIntArray1457[i_2];
            return i_1 >= i_4 && i_1 <= i_4 + anIntArray1455[i_2];
        }

        return false;
    }

}
