package com.jagex;

public class Preference_Sub16 extends Preference {

    public Preference_Sub16(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public Preference_Sub16(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public void method12749() {
        if (value < Class104.aClass104_1061.id || value > Class104.aClass104_1062.id) {
            value = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return Class104.aClass104_1061.id;
    }

    int method7787() {
        return -1544200711 * Class104.aClass104_1061.id * 2087113801;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    public int method12750() {
        return value;
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    void method7780(int i_1) {
        value = i_1 * -754033619 * -859024475;
    }

    int method7786() {
        return -1544200711 * Class104.aClass104_1061.id * 2087113801;
    }

    int method7784() {
        return 1;
    }

}
