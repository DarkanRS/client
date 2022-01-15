package com.jagex;

public class Class176 {

    static FontMetrics aClass414_2200;
    static ModeWhere BUILD_ENVIRONMENT;
    float aFloat2193;
    int anInt2195;
    int anInt2196;
    int anInt2197;
    int anInt2198;
    float aFloat2190 = 1.0F;
    float aFloat2191 = 1.0F;
    int anInt2192;
    int anInt2189;
    int anInt2199;
    int anInt2194;

    Class176(int i_1, float f_2, float f_3, int i_4, int i_5, int i_6) {
        anInt2199 = i_1;
        aFloat2190 = f_2;
        aFloat2191 = f_3;
        anInt2192 = i_4;
        anInt2189 = i_5;
        anInt2194 = i_6;
    }

    Class176(int i_1) {
        anInt2199 = i_1;
    }

    public static void method2977() {
        CutsceneAction_Sub5.method14243();
    }

    static long method2979() {
        return Engine.FPS_MANAGER.method4852();
    }

    void method2968(Class176 class176_1) {
        aFloat2190 = class176_1.aFloat2190;
        aFloat2191 = class176_1.aFloat2191;
        anInt2192 = class176_1.anInt2192;
        anInt2189 = class176_1.anInt2189;
        anInt2199 = class176_1.anInt2199;
        anInt2194 = class176_1.anInt2194;
    }

    Class176 method2972() {
        return new Class176(anInt2199, aFloat2190, aFloat2191, anInt2192, anInt2189, anInt2194);
    }
}
