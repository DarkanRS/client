package com.jagex;

public class Node_Sub11_Sub4 extends Node_Sub11 {

    Class349 this$0;

    String aString10218;

    int anInt10216;

    byte aByte10217;

    Node_Sub11_Sub4(Class349 class349_1) {
        this$0 = class349_1;
        aString10218 = null;
    }

    @Override
    void method12204(ClanChannel class282_sub4_1) {
        ClanChannelPlayer class57_3 = new ClanChannelPlayer();
        class57_3.name = aString10218;
        class57_3.world = anInt10216;
        class57_3.rank = aByte10217;
        class282_sub4_1.method12105(class57_3);
    }

    @Override
    void method12205(ClanChannel class282_sub4_1) {
        ClanChannelPlayer class57_2 = new ClanChannelPlayer();
        class57_2.name = aString10218;
        class57_2.world = anInt10216 * 1097857565 * -1982781809 * -1097296133;
        class57_2.rank = aByte10217;
        class282_sub4_1.method12105(class57_2);
    }

    @Override
    void method12203(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            --rsbytebuffer_1.index;
            rsbytebuffer_1.readLong();
        }
        aString10218 = rsbytebuffer_1.readNullString();
        anInt10216 = rsbytebuffer_1.readUnsignedShort();
        aByte10217 = rsbytebuffer_1.readByte();
        rsbytebuffer_1.readLong();
    }

    @Override
    void method12206(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            rsbytebuffer_1.readLong();
        }
        aString10218 = rsbytebuffer_1.readNullString();
        anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
        aByte10217 = rsbytebuffer_1.readByte();
        rsbytebuffer_1.readLong();
    }

    @Override
    void method12207(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            rsbytebuffer_1.readLong();
        }
        aString10218 = rsbytebuffer_1.readNullString();
        anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
        aByte10217 = rsbytebuffer_1.readByte();
        rsbytebuffer_1.readLong();
    }

    @Override
    void method12208(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            rsbytebuffer_1.readLong();
        }
        aString10218 = rsbytebuffer_1.readNullString();
        anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
        aByte10217 = rsbytebuffer_1.readByte();
        rsbytebuffer_1.readLong();
    }
}
