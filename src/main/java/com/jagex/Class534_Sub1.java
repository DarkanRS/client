package com.jagex;

import java.util.LinkedList;
import java.util.Queue;

public class Class534_Sub1 extends Class534 {

    Queue<MouseRecord_Sub1> aQueue7921 = new LinkedList<MouseRecord_Sub1>();

    static int[] method12815(CacheableNode_Sub7 class282_sub50_sub7_0) {
        int[] quests = null;
        if (SunDefinitions.isItemClickType(class282_sub50_sub7_0.clickType)) {
            quests = IndexLoaders.ITEM_LOADER.getItemDefinitions((int) class282_sub50_sub7_0.aLong9584).quests;
        } else if (class282_sub50_sub7_0.itemId != -1) {
            quests = IndexLoaders.ITEM_LOADER.getItemDefinitions(class282_sub50_sub7_0.itemId).quests;
        } else if (Class237.isNPCClickType(class282_sub50_sub7_0.clickType)) {
            ObjectNode class282_sub47_3 = (ObjectNode) client.NPC_MAP.get((int) class282_sub50_sub7_0.aLong9584);
            if (class282_sub47_3 != null) {
                NPCEntity npc_4 = (NPCEntity) class282_sub47_3.anObject8068;
                NPCDefinitions npcdefinitions_5 = npc_4.definitions;
                if (npcdefinitions_5.transformTo != null) {
                    npcdefinitions_5 = npcdefinitions_5.getMultiNPC(Class158_Sub1.PLAYER_VAR_PROVIDER);
                }
                if (npcdefinitions_5 != null) {
                    quests = npcdefinitions_5.quests;
                }
            }
        } else if (EnumDefinitions.isObjectClickType(class282_sub50_sub7_0.clickType)) {
            ObjectDefinition objectdefinitions_6 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefs((int) (class282_sub50_sub7_0.aLong9584 >>> 32 & 0x7fffffffL));
            if (objectdefinitions_6.transformTo != null) {
                objectdefinitions_6 = objectdefinitions_6.getMultiLoc(Class158_Sub1.PLAYER_VAR_PROVIDER);
            }
            if (objectdefinitions_6 != null) {
                quests = objectdefinitions_6.anIntArray5707;
            }
        }
        return quests;
    }

    @Override
    int method11424() {
        return 1;
    }

    void method12809(MouseRecord_Sub1 class282_sub53_sub1_1) {
        aQueue7921.add(class282_sub53_sub1_1);
        if (aQueue7921.size() > 10) {
            aQueue7921.poll();
        }
    }

    @Override
    void method11414() {
        MouseRecord_Sub1 class282_sub53_sub1_2 = aQueue7921.poll();
        if (class282_sub53_sub1_2 != null) {
            TCPPacket tcpmessage_3 = TCPPacket.createPacket(ServerPacket.MOUSE_BUTTON_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_3.buffer.writeIntLE(class282_sub53_sub1_2.getX() | class282_sub53_sub1_2.getY() << 16);
            tcpmessage_3.buffer.writeByte128(class282_sub53_sub1_2.method14730() << 1 | class282_sub53_sub1_2.method14729() & 0x1);
            tcpmessage_3.buffer.writeShortLE(method11408(class282_sub53_sub1_2, 65535));
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_3);
            class282_sub53_sub1_2.cache();
        }
    }

    void method12810(ByteBuf rsbytebuffer_1, MouseRecord_Sub1 class282_sub53_sub1_2) {
        rsbytebuffer_1.writeByte(class282_sub53_sub1_2.method14729());
    }

    @Override
    boolean method11423() {
        return !aQueue7921.isEmpty() || aLong7076 < Utils.time() - 2000L;
    }

    @Override
    int method11412() {
        return 1;
    }

    @Override
    void method11427(ByteBuf rsbytebuffer_1, MouseRecord class282_sub53_2) {
        method12810(rsbytebuffer_1, (MouseRecord_Sub1) class282_sub53_2);
    }

    @Override
    void method11426(ByteBuf rsbytebuffer_1, MouseRecord class282_sub53_2) {
        method12810(rsbytebuffer_1, (MouseRecord_Sub1) class282_sub53_2);
    }

    @Override
    void method11431() {
        MouseRecord_Sub1 class282_sub53_sub1_1 = aQueue7921.poll();
        if (class282_sub53_sub1_1 != null) {
            TCPPacket tcpmessage_2 = TCPPacket.createPacket(ServerPacket.MOUSE_BUTTON_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_2.buffer.writeIntLE(class282_sub53_sub1_1.getX() | class282_sub53_sub1_1.getY() << 16);
            tcpmessage_2.buffer.writeByte128(class282_sub53_sub1_1.method14730() << 1 | class282_sub53_sub1_1.method14729() & 0x1);
            tcpmessage_2.buffer.writeShortLE(method11408(class282_sub53_sub1_1, 65535));
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
            class282_sub53_sub1_1.cache();
        }
    }

    @Override
    void method11418() {
        MouseRecord_Sub1 class282_sub53_sub1_1 = aQueue7921.poll();
        if (class282_sub53_sub1_1 != null) {
            TCPPacket tcpmessage_2 = TCPPacket.createPacket(ServerPacket.MOUSE_BUTTON_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
            tcpmessage_2.buffer.writeIntLE(class282_sub53_sub1_1.getX() | class282_sub53_sub1_1.getY() << 16);
            tcpmessage_2.buffer.writeByte128(class282_sub53_sub1_1.method14730() << 1 | class282_sub53_sub1_1.method14729() & 0x1);
            tcpmessage_2.buffer.writeShortLE(method11408(class282_sub53_sub1_1, 65535));
            client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
            class282_sub53_sub1_1.cache();
        }
    }

    @Override
    boolean method11434() {
        return !aQueue7921.isEmpty() || 2966128844247041579L * aLong7076 * 1203484888895588483L < Utils.time() - 2000L;
    }

    @Override
    TCPPacket method11416() {
        return TCPPacket.createPacket(ServerPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    TCPPacket method11420() {
        return TCPPacket.createPacket(ServerPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    TCPPacket method11428() {
        return TCPPacket.createPacket(ServerPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    TCPPacket method11422() {
        return TCPPacket.createPacket(ServerPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
    }

    @Override
    int method11415() {
        return 1;
    }

    @Override
    int method11425() {
        return 1;
    }

    @Override
    void method11413(ByteBuf rsbytebuffer_1, MouseRecord class282_sub53_2) {
        method12810(rsbytebuffer_1, (MouseRecord_Sub1) class282_sub53_2);
    }

    @Override
    TCPPacket method11421() {
        return TCPPacket.createPacket(ServerPacket.MOVE_MOUSE, client.GAME_CONNECTION_CONTEXT.isaac);
    }
}
