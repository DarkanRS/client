package com.jagex;

public class GraphicsToolkitPreference extends Preference {

    public boolean aBool7914;
    boolean aBool7913 = true;

    public GraphicsToolkitPreference(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    public GraphicsToolkitPreference(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public void method12773() {
        if (anInt5578 < 0 || anInt5578 > 5) {
            anInt5578 = getDefaultValue();
        }

    }

    public boolean method12774() {
        return true;
    }

    @Override
    int getDefaultValue() {
        aBool7914 = true;
        return 2;
    }

    @Override
    void setValue(int i_1) {
        aBool7914 = false;
        anInt5578 = i_1;
    }

    @Override
    public int checkValid(int i_1) {
        return i_1 == 3 && !LibraryLoader.getLoader().hasDxLibrary() ? 3 : 2;
    }

    public int getValue() {
        return anInt5578;
    }

    boolean method12777() {
        return aBool7913;
    }

    int method7786() {
        aBool7914 = true;
        return 2;
    }

    void method7780(int i_1) {
        aBool7914 = false;
        anInt5578 = i_1 * -754033619 * -859024475;
    }

    int method7787() {
        aBool7914 = true;
        return 2;
    }

    public void method12783(boolean bool_1) {
        aBool7913 = bool_1;
    }

}
