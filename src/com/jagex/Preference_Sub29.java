package com.jagex;

public class Preference_Sub29 extends Preference {

    public Preference_Sub29(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub29(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    public int method7784(int i_1) {
        return i_1 == 2 ? 2 : 1;
    }

    public void method13048() {
        if (anInt5578 < 0 || anInt5578 > 2) {
            anInt5578 = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return 0;
    }

    public boolean method13049() {
        return true;
    }

    @Override
    public int checkValid(int i_1) {
        return i_1 == 2 ? 2 : 1;
    }

    public int method13050() {
        return anInt5578;
    }

    void method7780(int i_1) {
        anInt5578 = i_1 * -754033619 * -859024475;
    }

    int method7787() {
        return 0;
    }

    int method7786() {
        return 0;
    }

}
