package com.jagex;

public class Preference_Sub4 extends Preference {

    public Preference_Sub4(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub4(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    @Override
    public int checkValid(int i_1) {
        return !Class60.method1166(manager.currentToolkit.getValue()) ? 3 : 1;
    }

    public void method12639() {
        if (manager.currentToolkit.method12777() && !Class60.method1166(manager.currentToolkit.getValue())) {
            value = 0;
        }

        if (value < 0 || value > 2) {
            value = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return 0;
    }

    public int method7784() {
        return !Class60.method1166(manager.currentToolkit.getValue()) ? 3 : 1;
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    public int method12641() {
        return value;
    }

    void method7780(int i_1) {
        value = -754033619 * i_1 * -859024475;
    }

    int method7786() {
        return 0;
    }

    int method7787() {
        return 0;
    }

    public boolean method12646() {
        return Class60.method1166(manager.currentToolkit.getValue());
    }

}
