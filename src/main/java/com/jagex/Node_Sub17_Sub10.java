package com.jagex;

public class Node_Sub17_Sub10 extends Node_Sub17 {

    long aLong10047;
    String aString10048;
    Class348 this$0;

    Node_Sub17_Sub10(Class348 class348_1) {
        this$0 = class348_1;
        aLong10047 = -1L;
        aString10048 = null;
    }

    @Override
    void method12252(ClanSettings class61_1) {
        class61_1.method1207(5650566354848839815L * aLong10047 * 4560744686503677239L, aString10048);
    }

    @Override
    void method12255(ClanSettings class61_1) {
        class61_1.method1207(5650566354848839815L * aLong10047 * 4560744686503677239L, aString10048);
    }

    @Override
    void method12251(ClanSettings class61_1) {
        class61_1.method1207(aLong10047, aString10048);
    }

    @Override
    void method12249(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            aLong10047 = rsbytebuffer_1.readLong() * 4560744686503677239L * 5650566354848839815L;
        }

        aString10048 = rsbytebuffer_1.readNullString();
    }

    @Override
    void method12257(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            aLong10047 = rsbytebuffer_1.readLong() * 4560744686503677239L * 5650566354848839815L;
        }

        aString10048 = rsbytebuffer_1.readNullString();
    }

    @Override
    void method12253(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
            aLong10047 = rsbytebuffer_1.readLong() * 4560744686503677239L * 5650566354848839815L;
        }

        aString10048 = rsbytebuffer_1.readNullString();
    }

    @Override
    void method12254(ClanSettings class61_1) {
        class61_1.method1207(5650566354848839815L * aLong10047 * 4560744686503677239L, aString10048);
    }

    @Override
    void method12258(ClanSettings class61_1) {
        class61_1.method1207(5650566354848839815L * aLong10047 * 4560744686503677239L, aString10048);
    }

    @Override
    void method12256(ClanSettings class61_1) {
        class61_1.method1207(5650566354848839815L * aLong10047 * 4560744686503677239L, aString10048);
    }

    @Override
    void method12250(ByteBuf rsbytebuffer_1) {
        if (rsbytebuffer_1.readUnsignedByte() != 255) {
            --rsbytebuffer_1.index;
            aLong10047 = rsbytebuffer_1.readLong();
        }

        aString10048 = rsbytebuffer_1.readNullString();
    }

}
