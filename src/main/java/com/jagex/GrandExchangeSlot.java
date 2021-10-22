package com.jagex;

public class GrandExchangeSlot {

    public int itemId;
    public int price;
    public int amount;
    public int currentAmount;
    public int totalPrice;
    byte progress;

    public GrandExchangeSlot() {
    }

    public GrandExchangeSlot(ByteBuf buffer) {
        progress = buffer.readByte();
        itemId = buffer.readUnsignedShort();
        price = buffer.readInt();
        amount = buffer.readInt();
        currentAmount = buffer.readInt();
        totalPrice = buffer.readInt();
    }

    public static void method5913() {
        IComponentDefinitions.aClass229_1280.method3863();
        IComponentDefinitions.aClass229_1341.method3863();
        IComponentDefinitions.aClass229_1303.method3863();
        IComponentDefinitions.aClass229_1282.method3863();
    }

    public static int method5914(byte[] bytes_0, int i_1, CharSequence charsequence_2) {
        int i_4 = charsequence_2.length();
        int i_5 = i_1;
        for (int i_6 = 0; i_6 < i_4; i_6++) {
            char var_7 = charsequence_2.charAt(i_6);
            if (var_7 <= 127) {
                bytes_0[i_5++] = (byte) var_7;
            } else if (var_7 <= 2047) {
                bytes_0[i_5++] = (byte) (0xc0 | var_7 >> 6);
                bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
            } else {
                bytes_0[i_5++] = (byte) (0xe0 | var_7 >> 12);
                bytes_0[i_5++] = (byte) (0x80 | var_7 >> 6 & 0x3f);
                bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
            }
        }
        return i_5 - i_1;
    }

    static void method5916() {
        for (int i_1 = 0; i_1 < client.NPC_UPDATE_INDEX; i_1++) {
            int i_2 = client.NPC_UPDATE_INDICES[i_1];
            ObjectNode class282_sub47_3 = (ObjectNode) client.NPC_MAP.get(i_2);
            if (class282_sub47_3 != null) {
                NPCEntity npc_4 = (NPCEntity) class282_sub47_3.anObject8068;
                Class363.method6287(npc_4, false);
            }
        }
    }

    public int getState() {
        return progress & 0x7;
    }

    public int isSelling() {
        return (progress & 0x8) == 8 ? 1 : 0;
    }
}
