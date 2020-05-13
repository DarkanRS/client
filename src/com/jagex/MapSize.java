package com.jagex;

public enum MapSize {

    SIZE_104(0, 104),
    SIZE_120(1, 120),
    SIZE_136(2, 136),
    SIZE_168(3, 168),
    SIZE_72(4, 72);

    public int index;
    public int size;

    MapSize(int i_1, int i_2) {
        index = i_1;
        size = i_2;
    }
    
    static String[] aStringArray1077;

    public static void method1818(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(8, i_0);
        class282_sub50_sub12_2.method14965();
    }
}
