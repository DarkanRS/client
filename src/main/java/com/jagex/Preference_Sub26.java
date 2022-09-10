package com.jagex;

public class Preference_Sub26 extends Preference {

    public Preference_Sub26(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub26(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    static void method12948(Class494 class494_0) {
        Class237.aClass494_2916 = class494_0;
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    public void method12941() {
        if (value != 1 && value != 0) {
            value = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return 1;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    public int method12943() {
        return value;
    }

    int method7784() {
        return 1;
    }

    int method7786() {
        return 1;
    }

    int method7787() {
        return 1;
    }

    void method7780(int i_1) {
        value = -754033619 * i_1 * -859024475;
    }

}
