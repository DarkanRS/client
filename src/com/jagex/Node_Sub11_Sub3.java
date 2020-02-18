package com.jagex;

public class Node_Sub11_Sub3 extends Node_Sub11 {

    int anInt10061;

    byte aByte10062;

    int anInt10063;

    String aString10064;

    Class349 this$0;

    Node_Sub11_Sub3(Class349 class349_1) {
        this$0 = class349_1;
        anInt10061 = -1;
    }

    public static void method15476() {
        Renderers.FONT_RENDERER = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.p11FullIndex, true, true);
        Node_Sub17_Sub2.aClass414_9933 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.p11FullIndex);
        Class16.aFontRenderer_144 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class16.p12FullIndex, true, true);
        Class16.aClass414_139 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class16.p12FullIndex);
        Class285.aFontRenderer_3394 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, Class395.b12FullIndex, true, true);
        SkyboxIndexLoader.aClass414_3438 = Class487.aClass378_5752.method6415(client.anInterface35_7206, Class395.b12FullIndex);
    }

    @Override
    void method12206(Packet rsbytebuffer_1) {
        anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
        aByte10062 = rsbytebuffer_1.readByte();
        anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
        rsbytebuffer_1.readLong();
        aString10064 = rsbytebuffer_1.readString();
    }

    @Override
    void method12208(Packet rsbytebuffer_1) {
        anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
        aByte10062 = rsbytebuffer_1.readByte();
        anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
        rsbytebuffer_1.readLong();
        aString10064 = rsbytebuffer_1.readString();
    }

    @Override
    void method12204(ClanChannel class282_sub4_1) {
        ClanChannelPlayer class57_3 = class282_sub4_1.players[anInt10061];
        class57_3.rank = aByte10062;
        class57_3.world = anInt10063;
        class57_3.name = aString10064;
    }

    @Override
    void method12203(Packet rsbytebuffer_1) {
        anInt10061 = rsbytebuffer_1.readUnsignedShort();
        aByte10062 = rsbytebuffer_1.readByte();
        anInt10063 = rsbytebuffer_1.readUnsignedShort();
        rsbytebuffer_1.readLong();
        aString10064 = rsbytebuffer_1.readString();
    }

    @Override
    void method12207(Packet rsbytebuffer_1) {
        anInt10061 = rsbytebuffer_1.readUnsignedShort() * -800503111 * -1538155639;
        aByte10062 = rsbytebuffer_1.readByte();
        anInt10063 = rsbytebuffer_1.readUnsignedShort() * 1544248451 * 415027755;
        rsbytebuffer_1.readLong();
        aString10064 = rsbytebuffer_1.readString();
    }

    @Override
    void method12205(ClanChannel class282_sub4_1) {
        ClanChannelPlayer class57_2 = class282_sub4_1.players[anInt10061 * -800503111 * -1538155639];
        class57_2.rank = aByte10062;
        class57_2.world = -452687215 * anInt10063 * 1544248451 * -1097296133;
        class57_2.name = aString10064;
    }
}
