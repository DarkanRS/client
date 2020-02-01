package com.jagex;
public enum Class413 implements Identifiable {

    aClass413_4971(1, 0, "", ""),
    aClass413_4965(6, 1, "", ""),
    aClass413_4968(7, 2, "", ""),
    aClass413_4967(3, 3, "", ""),
    aClass413_4970(4, 4, "", ""),
    aClass413_4969(5, 5, "", ""),
    aClass413_4964(0, 6, "", ""),
    aClass413_4966("", "", new Class413[] { aClass413_4971, aClass413_4965, aClass413_4968, aClass413_4970, aClass413_4967 });

    int anInt4972;
    int anInt4973;
    String aString4974;

    public int getValue() {
        return this.anInt4973;
    }

    public String toString() {
        return this.aString4974;
    }

    Class413(int i_1, int i_2, String string_3, String string_4) {
        this.anInt4972 = i_1;
        this.anInt4973 = i_2;
        this.aString4974 = string_4;
    }

    Class413(String string_3, String string_4, Class413[] arr_6) {
        this.anInt4972 = 2;
        this.anInt4973 = -1;
        this.aString4974 = string_4;
    }

    static void method6939() {
        ItemContainer.aClass229_7712.method3859();
    }
}
