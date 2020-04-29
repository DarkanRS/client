package com.jagex;

public class Node_Sub17_Sub8 extends Node_Sub17 {

    int anInt10021;
    Class348 this$0;

    Node_Sub17_Sub8(Class348 class348_1) {
        this$0 = class348_1;
        anInt10021 = -1;
    }

    @Override
    void method12250(ByteBuf rsbytebuffer_1) {
        anInt10021 = rsbytebuffer_1.readUnsignedShort();
    }

    @Override
    void method12249(ByteBuf rsbytebuffer_1) {
        anInt10021 = rsbytebuffer_1.readUnsignedShort() * 86059087 * 1415900847;
    }

    @Override
    void method12251(ClanSettings class61_1) {
        class61_1.method1208(anInt10021);
    }

    @Override
    void method12257(ByteBuf rsbytebuffer_1) {
        anInt10021 = rsbytebuffer_1.readUnsignedShort() * 86059087 * 1415900847;
    }

    @Override
    void method12253(ByteBuf rsbytebuffer_1) {
        anInt10021 = rsbytebuffer_1.readUnsignedShort() * 86059087 * 1415900847;
    }

    @Override
    void method12255(ClanSettings class61_1) {
        class61_1.method1208(1415900847 * anInt10021 * 86059087);
    }

    @Override
    void method12258(ClanSettings class61_1) {
        class61_1.method1208(1415900847 * anInt10021 * 86059087);
    }

    @Override
    void method12256(ClanSettings class61_1) {
        class61_1.method1208(1415900847 * anInt10021 * 86059087);
    }

    @Override
    void method12252(ClanSettings class61_1) {
        class61_1.method1208(1415900847 * anInt10021 * 86059087);
    }

    @Override
    void method12254(ClanSettings class61_1) {
        class61_1.method1208(1415900847 * anInt10021 * 86059087);
    }

}
