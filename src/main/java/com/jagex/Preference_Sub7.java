package com.jagex;

public class Preference_Sub7 extends Preference {

    public Preference_Sub7(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub7(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public static int method12672() {
        return Class302.anInt3561;
    }

    public void method12663() {
        if (anInt5578 < 0 || anInt5578 > 2) {
            anInt5578 = getDefaultValue();
        }

    }

    @Override
    public int checkValid(int i_1) {
        return 1;
    }

    public boolean method12665() {
        return true;
    }

    public int method12666() {
        return anInt5578;
    }

    void method7780(int i_1) {
        anInt5578 = -754033619 * i_1 * -859024475;
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    int method7786() {
        return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
    }

    int method7787() {
        return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
    }

    @Override
    int getDefaultValue() {
        return manager.currentToolkit.method12777() && Class520.method11162(manager.currentToolkit.getValue()) ? 1 : 0;
    }

    public int method7784() {
        return 1;
    }

}
