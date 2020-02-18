package com.jagex;

public class VertexNormal {

    public static PlayerEntity MY_PLAYER;
    public int anInt812;
    public int anInt809;
    public int anInt811;
    public int anInt810;

    VertexNormal(int i_1, int i_2, int i_3, int i_4) {
        anInt812 = i_1;
        anInt809 = i_2;
        anInt811 = i_3;
        anInt810 = i_4;
    }

    public static Class273 method1461() {
        try {
            Class273_Sub1 class273_sub1_1 = new Class273_Sub1();
            return class273_sub1_1;
        } catch (Throwable throwable_3) {
            return new Class273_Sub2();
        }
    }

    static boolean method1465() {
        return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5873);
    }

    VertexNormal method1459(int i_1) {
        return new VertexNormal(anInt812, i_1, anInt811, anInt810);
    }
}
