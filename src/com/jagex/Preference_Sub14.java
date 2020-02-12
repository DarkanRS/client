package com.jagex;

public class Preference_Sub14 extends Preference {

    public Preference_Sub14(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public Preference_Sub14(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public void method12725() {
        if (this.anInt5578 < 0 || this.anInt5578 > 1) {
            this.anInt5578 = this.getDefaultValue();
        }

    }

    public boolean method12727() {
        return Class60.method1166(this.manager.currentToolkit.getValue(-1914029751), -830025324);
    }

    public int checkValid(int i_1) {
        return !Class60.method1166(this.manager.currentToolkit.getValue(1687107728), 131652836) ? 3 : 1;
    }

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    int getDefaultValue() {
        return 1;
    }

    public int method7784(int i_1) {
        return !Class60.method1166(this.manager.currentToolkit.getValue(1589425094), -1916831439) ? 3 : 1;
    }

    public int method12728() {
        return this.anInt5578;
    }

    int method7786() {
        return 1;
    }

    int method7787() {
        return 1;
    }

    void method7780(int i_1) {
        this.anInt5578 = -754033619 * i_1 * -859024475;
    }

}
