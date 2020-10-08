package com.jagex;

public class Preference_Sub3 extends Preference {

    public Preference_Sub3(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public Preference_Sub3(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public void method12631() {
        int i_2 = manager.toolKit.getValue();
        if (i_2 != 3 && i_2 != 5) {
            anInt5578 = 0;
        }

        if (manager.getProcessorSpecs().getProcessorCount() < 2) {
            anInt5578 = 0;
        }

        if (anInt5578 != 0 && anInt5578 != 1) {
            anInt5578 = getDefaultValue();
        }

    }

    void method7780(int i_1) {
        anInt5578 = -754033619 * i_1 * -859024475;
    }

    @Override
    int getDefaultValue() {
        int i_2 = manager.toolKit.getValue();
        return 0;
    }

    @Override
    int checkValid(int i_1) {
        if (i_1 == 0) {
            return 1;
        } else if (manager.getProcessorSpecs().getProcessorCount() < 2) {
            return 3;
        } else {
            int i_3 = manager.toolKit.getValue();
            return i_3 != 3 && i_3 != 5 ? 3 : 1;
        }
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    public int method12632() {
        return anInt5578;
    }

    int method7784(int i_1) {
        if (i_1 == 0) {
            return 1;
        } else if (manager.getProcessorSpecs().getProcessorCount() < 2) {
            return 3;
        } else {
            int i_2 = manager.toolKit.getValue();
            return i_2 != 3 && i_2 != 5 ? 3 : 1;
        }
    }

    int method7787() {
        int i_1 = manager.toolKit.getValue();
        return 0;
    }

    int method7786() {
        int i_1 = manager.toolKit.getValue();
        return 0;
    }

}
