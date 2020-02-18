package com.jagex;

public class CacheableNode_Sub6 extends CacheableNode {

    public int anInt9542 = -1;
    public int anInt9539 = 12800;
    public int anInt9540;
    public int anInt9541 = 12800;
    public int anInt9535;
    public int anInt9536;
    public String aString9533;
    public String aString9534;
    public int anInt9532;
    int anInt9538 = -1;
    boolean aBool9543 = true;
    NodeCollection aClass482_9537;

    CacheableNode_Sub6(int i_1, String string_2, String string_3, int i_4, int i_5, boolean bool_6, int i_7, int i_8) {
        anInt9536 = i_1;
        aString9533 = string_2;
        aString9534 = string_3;
        anInt9532 = i_4;
        anInt9538 = i_5;
        aBool9543 = bool_6;
        anInt9542 = i_7;
        if (anInt9542 == 255) {
            anInt9542 = 0;
        }

        Class480.getMapSize(i_8);
        aClass482_9537 = new NodeCollection();
    }

    public static void method14788(String string_0, boolean bool_1, boolean bool_3) {
        PingRequester.method8736(string_0, bool_1, "openjs", bool_3);
    }

    public boolean method14775(int i_1, int i_2, int[] ints_3) {
        for (Node_Sub28 class282_sub28_5 = (Node_Sub28) aClass482_9537.head(); class282_sub28_5 != null; class282_sub28_5 = (Node_Sub28) aClass482_9537.next()) {
            if (class282_sub28_5.method12409(i_1, i_2)) {
                class282_sub28_5.method12410(i_1, i_2, ints_3);
                return true;
            }
        }

        return false;
    }

    public boolean method14777(int i_1, int i_2, int[] ints_3) {
        for (Node_Sub28 class282_sub28_5 = (Node_Sub28) aClass482_9537.head(); class282_sub28_5 != null; class282_sub28_5 = (Node_Sub28) aClass482_9537.next()) {
            if (class282_sub28_5.method12415(i_1, i_2)) {
                class282_sub28_5.method12414(i_1, i_2, ints_3);
                return true;
            }
        }

        return false;
    }

    public boolean method14778(int i_1, int i_2, int i_3, int[] ints_4) {
        for (Node_Sub28 class282_sub28_6 = (Node_Sub28) aClass482_9537.head(); class282_sub28_6 != null; class282_sub28_6 = (Node_Sub28) aClass482_9537.next()) {
            if (class282_sub28_6.method12408(i_1, i_2, i_3)) {
                class282_sub28_6.method12414(i_2, i_3, ints_4);
                return true;
            }
        }

        return false;
    }

    void method14779() {
        anInt9539 = 12800;
        anInt9540 = 0;
        anInt9541 = 12800;
        anInt9535 = 0;

        for (Node_Sub28 class282_sub28_2 = (Node_Sub28) aClass482_9537.head(); class282_sub28_2 != null; class282_sub28_2 = (Node_Sub28) aClass482_9537.next()) {
            if (class282_sub28_2.anInt7701 < anInt9539) {
                anInt9539 = class282_sub28_2.anInt7701;
            }

            if (class282_sub28_2.anInt7704 > anInt9540) {
                anInt9540 = class282_sub28_2.anInt7704;
            }

            if (class282_sub28_2.anInt7703 < anInt9541) {
                anInt9541 = class282_sub28_2.anInt7703;
            }

            if (class282_sub28_2.anInt7705 > anInt9535) {
                anInt9535 = class282_sub28_2.anInt7705;
            }
        }

    }

    boolean method14784(int i_1, int i_2) {
        for (Node_Sub28 class282_sub28_4 = (Node_Sub28) aClass482_9537.head(); class282_sub28_4 != null; class282_sub28_4 = (Node_Sub28) aClass482_9537.next()) {
            if (class282_sub28_4.method12415(i_1, i_2)) {
                return true;
            }
        }

        return false;
    }

}
