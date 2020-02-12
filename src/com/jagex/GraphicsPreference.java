package com.jagex;

public class GraphicsPreference extends Preference {

    public void method12653() {
        if (this.anInt5578 < 0 || this.anInt5578 > 4) {
            this.anInt5578 = this.getDefaultValue();
        }
    }

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    int getDefaultValue() {
        return 0;
    }

    int checkValid(int i_1) {
        return 1;
    }

    int method7784(int i_1) {
        return 1;
    }

    public int method12654() {
        return this.anInt5578;
    }

    public GraphicsPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    void method7780(int i_1) {
        this.anInt5578 = -754033619 * i_1 * -859024475;
    }

    int method7786() {
        return 0;
    }

    int method7787() {
        return 0;
    }

    public GraphicsPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public static void method12658(int i_0) {
        Class150.method2580(-1, 255, (byte) 34);
    }

    static boolean method12661(String string_0, int i_1, byte b_2) {
        return Class186.method3082(string_0, i_1, "openjs");
    }
}
