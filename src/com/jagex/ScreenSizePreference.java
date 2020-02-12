package com.jagex;

public class ScreenSizePreference extends Preference {

    public static JS5Manager JS5_MANAGER;

    public ScreenSizePreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public void method12684(byte b_1) {
        if (this.anInt5578 < 1 || this.anInt5578 > 3) {
            this.anInt5578 = this.getDefaultValue();
        }
    }

    public ScreenSizePreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    void setValue(int i_1) {
        this.anInt5578 = i_1;
    }

    int method7784(int i_1) {
        return 1;
    }

    void method7780(int i_1) {
        this.anInt5578 = -754033619 * i_1 * -859024475;
    }

    int method7786() {
        return this.manager.getProcessorSpecs().isARM() ? 3 : 2;
    }

    int method7787() {
        return this.manager.getProcessorSpecs().isARM() ? 3 : 2;
    }

    public int method12687(int i_1) {
        return this.anInt5578;
    }

    int getDefaultValue() {
        return this.manager.getProcessorSpecs().isARM() ? 3 : 2;
    }

    int checkValid(int i_1) {
        return 1;
    }
}
