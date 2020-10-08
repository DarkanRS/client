package com.jagex;

public class CPUMaxMemoryPreference extends Preference {

    public CPUMaxMemoryPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public CPUMaxMemoryPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public void method12648() {
        if (anInt5578 < 0 && anInt5578 > 4) {
            anInt5578 = getDefaultValue();
        }

    }

    @Override
    int getDefaultValue() {
        return manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
    }

    void method7780(int i_1) {
        anInt5578 = -754033619 * i_1 * -859024475;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    int method7784() {
        return 1;
    }

    int method7786() {
        return manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
    }

    int method7787() {
        return manager.getProcessorSpecs().getProcessorCount() > 1 ? 4 : 2;
    }

    public int getValue() {
        return anInt5578;
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

}
