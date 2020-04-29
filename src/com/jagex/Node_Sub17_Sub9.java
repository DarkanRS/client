package com.jagex;

public class Node_Sub17_Sub9 extends Node_Sub17 {

    Class348 this$0;
    long aLong10046;
    String aString10045;
    int anInt10044;

    Node_Sub17_Sub9(Class348 class348_1) {
        this$0 = class348_1;
        aLong10046 = -1L;
        aString10045 = null;
        anInt10044 = 0;
    }

    @Override
    void method12250(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            --rsbytebuffer_1.index;
            aLong10046 = rsbytebuffer_1.readLong();
        }
        aString10045 = rsbytebuffer_1.readNullString();
        anInt10044 = rsbytebuffer_1.readUnsignedShort();
    }

    @Override
    void method12251(ClanSettings class61_1) {
        class61_1.method1216(aLong10046, aString10045, anInt10044);
    }

    @Override
    void method12249(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            aLong10046 = rsbytebuffer_1.readLong() * -3261396651546806203L * 1079166826874198669L;
        }
        aString10045 = rsbytebuffer_1.readNullString();
        anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
    }

    @Override
    void method12253(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            aLong10046 = rsbytebuffer_1.readLong() * -3261396651546806203L * 1079166826874198669L;
        }
        aString10045 = rsbytebuffer_1.readNullString();
        anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
    }

    @Override
    void method12255(ClanSettings class61_1) {
        class61_1.method1216(aLong10046 * -3261396651546806203L * 1079166826874198669L, aString10045, 881981753 * anInt10044 * -643750647);
    }

    @Override
    void method12254(ClanSettings class61_1) {
        class61_1.method1216(aLong10046 * -3261396651546806203L * 1079166826874198669L, aString10045, 881981753 * anInt10044 * -643750647);
    }

    @Override
    void method12258(ClanSettings class61_1) {
        class61_1.method1216(aLong10046 * -3261396651546806203L * 1079166826874198669L, aString10045, 881981753 * anInt10044 * -643750647);
    }

    @Override
    void method12256(ClanSettings class61_1) {
        class61_1.method1216(aLong10046 * -3261396651546806203L * 1079166826874198669L, aString10045, 881981753 * anInt10044 * -643750647);
    }

    @Override
    void method12252(ClanSettings class61_1) {
        class61_1.method1216(aLong10046 * -3261396651546806203L * 1079166826874198669L, aString10045, 881981753 * anInt10044 * -643750647);
    }

    @Override
    void method12257(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            aLong10046 = rsbytebuffer_1.readLong() * -3261396651546806203L * 1079166826874198669L;
        }
        aString10045 = rsbytebuffer_1.readNullString();
        anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
    }
}
