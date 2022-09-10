package com.jagex;

public class CustomCursorsPreference extends Preference {

    public CustomCursorsPreference(GamePreferences class282_sub54_2) {
        super(class282_sub54_2);
    }

    public static void method12679() {
        LRUCache softcache_1 = PlayerModel.aClass229_2920;
        synchronized (PlayerModel.aClass229_2920) {
            PlayerModel.aClass229_2920.method3859();
        }

        softcache_1 = PlayerModel.aClass229_2930;
        synchronized (PlayerModel.aClass229_2930) {
            PlayerModel.aClass229_2930.method3859();
        }
    }

    @Override
    void setValue(int i_1) {
        value = i_1;
    }

    @Override
    int getDefaultValue() {
        return 1;
    }

    @Override
    int checkValid(int i_1) {
        return 1;
    }

    public void method12674() {
        if (value != 1 && value != 0) {
            value = getDefaultValue();
        }

    }

    public int method12675() {
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
        value = i_1 * -754033619 * -859024475;
    }

}
