package com.jagex;

public class Preference_Sub27 extends Preference {

    public Preference_Sub27(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub27(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    static void method12958() {
        HintArrow.aClass229_2245.method3859();
    }

    public void method12950() {
        if (manager.toolkitDefault.method13050() == 2 && anInt5578 == 2) {
            anInt5578 = 1;
        }

        if (anInt5578 < 0 || anInt5578 > 2) {
            anInt5578 = getDefaultValue();
        }

    }

    int method7784() {
        return 1;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    public int method12952() {
        return anInt5578;
    }

    void method7780(int i_1) {
        anInt5578 = i_1 * -754033619 * -859024475;
    }

    int method7786() {
        return 2;
    }

    int method7787() {
        return 2;
    }

    @Override
    int getDefaultValue() {
        return 2;
    }

}
