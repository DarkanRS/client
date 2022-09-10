package com.jagex;

public class SafeModePreference extends Preference {

    public SafeModePreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public SafeModePreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    int method7787() {
        return 0;
    }

    public int getValue() {
        return value;
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    public void method12928() {
        if (value != 1 && value != 0) {
            value = getDefaultValue();
        }
    }

    int method7784() {
        return 1;
    }

    void method7780(int i_1) {
        value = -754033619 * i_1 * -859024475;
    }

    int method7786() {
        return 0;
    }

    @Override
    int getDefaultValue() {
        return 0;
    }
}
