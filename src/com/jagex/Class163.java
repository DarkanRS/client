package com.jagex;

public class Class163 {

    public static Class209 mouseRecorder;
    int anInt2026;
    int anInt2027;
    String aString2028;
    int anInt2029;
    int anInt2030;

    static int method2840(CacheableNode_Sub15 class282_sub50_sub15_0, FontMetrics fontmetrics_1) {
        String string_3 = CutsceneEntity.method1354(class282_sub50_sub15_0);
        return fontmetrics_1.getTextWidth(string_3, Class115.aNativeSpriteArray1248);
    }

    public static Class350 method2843(Packet rsbytebuffer_0) {
        Class350 class350_2 = Class383.method6512(rsbytebuffer_0);
        int i_3 = rsbytebuffer_0.readBigSmart();
        int i_4 = rsbytebuffer_0.readBigSmart();
        int i_5 = rsbytebuffer_0.readBigSmart();
        int i_6 = rsbytebuffer_0.readBigSmart();
        int i_7 = rsbytebuffer_0.readBigSmart();
        int i_8 = rsbytebuffer_0.readBigSmart();
        return new Class350_Sub3(class350_2.aClass356_4094, class350_2.aClass353_4087, class350_2.anInt4090, class350_2.anInt4089, class350_2.anInt4093, class350_2.anInt4088, class350_2.anInt4092, class350_2.anInt4086, class350_2.anInt4091, i_3, i_4, i_5, i_6, i_7, i_8);
    }

    static void method2844() {
        int i_5 = client.anInt7293;
        int i_6 = client.anInt7294;
        NativeSprite nativesprite_7;
        if (client.anInt7296 == 1) {
            nativesprite_7 = Node_Sub36.aNativeSpriteArray7994[client.anInt7295 / 100];
            nativesprite_7.method2752(i_5 - 8, i_6 - 8);
        }
        if (client.anInt7296 == 2) {
            nativesprite_7 = Node_Sub36.aNativeSpriteArray7994[client.anInt7295 / 100 + 4];
            nativesprite_7.method2752(i_5 - 8, i_6 - 8);
        }
    }

    public static FontMetrics method2845(Index index_0, int i_1) {
        byte[] bytes_3 = index_0.getFile(i_1);
        return bytes_3 == null ? null : new FontMetrics(bytes_3);
    }

    public String method2829() {
        return aString2028;
    }

    public int method2830() {
        return anInt2027;
    }

    public int method2831() {
        return anInt2029;
    }

    public int method2832() {
        return anInt2026;
    }

    public int method2833() {
        return anInt2030;
    }
}
