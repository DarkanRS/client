package com.jagex;

public class Preference_Sub29 extends Preference {

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    public int method7784(int i_1) {
        return i_1 == 2 ? 2 : 1;
    }

    public void method13048() {
        if (this.anInt5578 < 0 || this.anInt5578 > 2) {
            this.anInt5578 = this.getDefaultValue();
        }

    }

    int getDefaultValue() {
        return 0;
    }

    public boolean method13049() {
        return true;
    }

    public int checkValid(int i_1) {
        return i_1 == 2 ? 2 : 1;
    }

    public Preference_Sub29(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public int method13050() {
        return this.anInt5578;
    }

    void method7780(int i_1) {
        this.anInt5578 = i_1 * -754033619 * -859024475;
    }

    public Preference_Sub29(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    int method7787() {
        return 0;
    }

    int method7786() {
        return 0;
    }

}
