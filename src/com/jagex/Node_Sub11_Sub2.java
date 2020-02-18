package com.jagex;

public class Node_Sub11_Sub2 extends Node_Sub11 {

    static int anInt10003;
    int anInt10002;
    Class349 this$0;

    Node_Sub11_Sub2(Class349 class349_1) {
        this$0 = class349_1;
        anInt10002 = -1;
    }

    @Override
    void method12206(Packet rsbytebuffer_1) {
        anInt10002 = rsbytebuffer_1.readUnsignedShort() * -1617468171 * 1942169437;
        rsbytebuffer_1.readUnsignedByte();
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            rsbytebuffer_1.readLong();
        }

    }

    @Override
    void method12203(Packet rsbytebuffer_1) {
        anInt10002 = rsbytebuffer_1.readUnsignedShort();
        rsbytebuffer_1.readUnsignedByte();
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            --rsbytebuffer_1.index;
            rsbytebuffer_1.readLong();
        }

    }

    @Override
    void method12204(ClanChannel class282_sub4_1) {
        class282_sub4_1.method12096(anInt10002);
    }

    @Override
    void method12205(ClanChannel class282_sub4_1) {
        class282_sub4_1.method12096(1942169437 * anInt10002 * -1617468171);
    }

    @Override
    void method12207(Packet rsbytebuffer_1) {
        anInt10002 = rsbytebuffer_1.readUnsignedShort() * -1617468171 * 1942169437;
        rsbytebuffer_1.readUnsignedByte();
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            rsbytebuffer_1.readLong();
        }

    }

    @Override
    void method12208(Packet rsbytebuffer_1) {
        anInt10002 = rsbytebuffer_1.readUnsignedShort() * -1617468171 * 1942169437;
        rsbytebuffer_1.readUnsignedByte();
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            rsbytebuffer_1.readLong();
        }

    }

}
