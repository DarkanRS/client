package com.jagex;

public class Class534_Sub2 extends Class534 {

    static void method12847(int i_0) {
        client.anIntArray7198 = new int[i_0];
        client.anIntArray7303 = new int[i_0];
        client.anIntArray7194 = new int[i_0];
        client.anIntArray7305 = new int[i_0];
        client.anIntArray7306 = new int[i_0];
    }

    @Override
    boolean method11434() {
        return method12842() != null || aLong7076 * 1203484888895588483L * 2966128844247041579L < Utils.time() - 2000L;
    }

    MouseRecord method12842() {
        return (MouseRecord) client.mouseRecords.head();
    }

    @Override
    void method11427(Packet rsbytebuffer_1, MouseRecord class282_sub53_2) {
    }

    @Override
    boolean method11423() {
        return method12842() != null || aLong7076 < Utils.time() - 2000L;
    }

    @Override
    TCPPacket method11416() {
        return Class271.createPacket(ClientProt.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    void method11413(Packet rsbytebuffer_1, MouseRecord class282_sub53_2) {
    }

    @Override
    int method11412() {
        return 0;
    }

    @Override
    void method11431() {
        MouseRecord class282_sub53_1 = method12842();
        if (class282_sub53_1 != null) {
            int i_2 = method11408(class282_sub53_1, 32767);
            int i_3 = class282_sub53_1.getY();
            if (i_3 < 0) {
                i_3 = 0;
            } else if (i_3 > 65535) {
                i_3 = 65535;
            }
            int i_4 = class282_sub53_1.getX();
            if (i_4 < 0) {
                i_4 = 0;
            } else if (i_4 > 65535) {
                i_4 = 65535;
            }
            byte b_5 = 0;
            if (class282_sub53_1.getClickType() == 2) {
                b_5 = 1;
            }
            TCPPacket tcpmessage_6 = Class271.createPacket(ClientProt.MOUSE_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_6.buffer.writeIntLE(i_4 | i_3 << 16);
            tcpmessage_6.buffer.writeShort(i_2 | b_5 << 15);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
        }
    }

    @Override
    void method11418() {
        MouseRecord class282_sub53_1 = method12842();
        if (class282_sub53_1 != null) {
            int i_2 = method11408(class282_sub53_1, 32767);
            int i_3 = class282_sub53_1.getY();
            if (i_3 < 0) {
                i_3 = 0;
            } else if (i_3 > 65535) {
                i_3 = 65535;
            }
            int i_4 = class282_sub53_1.getX();
            if (i_4 < 0) {
                i_4 = 0;
            } else if (i_4 > 65535) {
                i_4 = 65535;
            }
            byte b_5 = 0;
            if (class282_sub53_1.getClickType() == 2) {
                b_5 = 1;
            }
            TCPPacket tcpmessage_6 = Class271.createPacket(ClientProt.MOUSE_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_6.buffer.writeIntLE(i_4 | i_3 << 16);
            tcpmessage_6.buffer.writeShort(i_2 | b_5 << 15);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
        }
    }

    @Override
    int method11415() {
        return 0;
    }

    @Override
    TCPPacket method11421() {
        return Class271.createPacket(ClientProt.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    TCPPacket method11420() {
        return Class271.createPacket(ClientProt.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    TCPPacket method11428() {
        return Class271.createPacket(ClientProt.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    void method11414() {
        MouseRecord class282_sub53_2 = method12842();
        if (class282_sub53_2 != null) {
            int i_3 = method11408(class282_sub53_2, 32767);
            int i_4 = class282_sub53_2.getY();
            if (i_4 < 0) {
                i_4 = 0;
            } else if (i_4 > 65535) {
                i_4 = 65535;
            }
            int i_5 = class282_sub53_2.getX();
            if (i_5 < 0) {
                i_5 = 0;
            } else if (i_5 > 65535) {
                i_5 = 65535;
            }
            byte b_6 = 0;
            if (class282_sub53_2.getClickType() == 2) {
                b_6 = 1;
            }
            TCPPacket tcpmessage_7 = Class271.createPacket(ClientProt.MOUSE_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_7.buffer.writeIntLE(i_5 | i_4 << 16);
            tcpmessage_7.buffer.writeShort(i_3 | b_6 << 15);
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_7);
        }
    }

    @Override
    int method11425() {
        return 0;
    }

    @Override
    int method11424() {
        return 0;
    }

    @Override
    TCPPacket method11422() {
        return Class271.createPacket(ClientProt.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    void method11426(Packet rsbytebuffer_1, MouseRecord class282_sub53_2) {
    }
}
