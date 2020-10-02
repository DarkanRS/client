package com.jagex;

public class Node_Sub39 extends Node {

    short[][] aShortArrayArray8003;
    double aDouble8004;

    Node_Sub39(short[][] shorts_1, double d_2) {
        aShortArrayArray8003 = shorts_1;
        aDouble8004 = d_2;
    }

    static void method13296(Matrix44 matrix44_0) {
        Class20.aClass384_185.method6562(matrix44_0);
    }

    static void method13297(AbstractRenderer graphicalrenderer_0, Node_Sub36 class282_sub36_1, MapAreaDefinitions worldmapareadefs_2) {
        NativeSprite nativesprite_4 = worldmapareadefs_2.method3729(graphicalrenderer_0);
        if (nativesprite_4 != null) {
            int i_5 = nativesprite_4.method2747();
            if (nativesprite_4.method2793() > i_5) {
                i_5 = nativesprite_4.method2793();
            }

            byte b_6 = 10;
            int i_7 = class282_sub36_1.anInt7990;
            int i_8 = class282_sub36_1.anInt7992;
            int i_9 = 0;
            int i_10 = 0;
            int i_11 = 0;
            int i_12;
            int i_14;
            if (worldmapareadefs_2.areaName != null) {
                i_9 = Node_Sub17_Sub2.aClass414_9933.method6987(worldmapareadefs_2.areaName, null, Class291_Sub1.aStringArray8024, null);

                for (i_12 = 0; i_12 < i_9; i_12++) {
                    String string_22 = Class291_Sub1.aStringArray8024[i_12];
                    if (i_12 < i_9 - 1) {
                        string_22 = string_22.substring(0, string_22.length() - 4);
                    }

                    i_14 = Class291_Sub1.aClass194_8023.method3177(string_22);
                    if (i_14 > i_10) {
                        i_10 = i_14;
                    }
                }

                i_11 = Class291_Sub1.aClass194_8023.method3173() * i_9 + Class291_Sub1.aClass194_8023.method3186() / 2;
            }

            i_12 = i_5 / 2 + class282_sub36_1.anInt7990;
            int i_13 = class282_sub36_1.anInt7992;
            if (i_7 < i_5 + Class291_Sub1.anInt3489) {
                i_7 = Class291_Sub1.anInt3489;
                i_12 = i_5 / 2 + i_10 / 2 + b_6 + Class291_Sub1.anInt3489 + 5;
            } else if (i_7 > Class291_Sub1.anInt3476 - i_5) {
                i_7 = Class291_Sub1.anInt3476 - i_5;
                i_12 = Class291_Sub1.anInt3476 - i_5 / 2 - b_6 - i_10 / 2 - 5;
            }

            if (i_8 < i_5 + Class291_Sub1.anInt3490) {
                i_8 = Class291_Sub1.anInt3490;
                i_13 = i_5 / 2 + b_6 + Class291_Sub1.anInt3490;
            } else if (i_8 > Class291_Sub1.anInt3492 - i_5) {
                i_8 = Class291_Sub1.anInt3492 - i_5;
                i_13 = Class291_Sub1.anInt3492 - i_5 / 2 - b_6 - i_11;
            }

            i_14 = (int) (Math.atan2(i_7 - class282_sub36_1.anInt7990, i_8 - class282_sub36_1.anInt7992) / 3.141592653589793D * 32767.0D) & 0xffff;
            nativesprite_4.method2758(i_7 + i_5 / 2.0F, i_5 / 2.0F + i_8, 4096, i_14);
            int i_15 = -2;
            int i_16 = -2;
            int i_17 = -2;
            int i_18 = -2;
            if (worldmapareadefs_2.areaName != null) {
                i_15 = i_12 - i_10 / 2 - 5;
                i_16 = i_13;
                i_17 = i_15 + i_10 + 10;
                i_18 = i_13 + Class291_Sub1.aClass194_8023.method3173() * i_9 + 3;
                if (worldmapareadefs_2.anInt2726 != 0) {
                    graphicalrenderer_0.method8425(i_15, i_13, i_17 - i_15, i_18 - i_13, worldmapareadefs_2.anInt2726);
                }

                if (worldmapareadefs_2.anInt2727 != 0) {
                    graphicalrenderer_0.method8562(i_15, i_13, i_17 - i_15, i_18 - i_13, worldmapareadefs_2.anInt2727);
                }

                for (int i_19 = 0; i_19 < i_9; i_19++) {
                    String string_20 = Class291_Sub1.aStringArray8024[i_19];
                    if (i_19 < i_9 - 1) {
                        string_20 = string_20.substring(0, string_20.length() - 4);
                    }

                    Class291_Sub1.aClass194_8023.method3178(graphicalrenderer_0, string_20, i_12, i_13, worldmapareadefs_2.anInt2720);
                    i_13 += Class291_Sub1.aClass194_8023.method3173();
                }
            }

            if (worldmapareadefs_2.anInt2719 != -1 || worldmapareadefs_2.areaName != null) {
                Node_Sub33 class282_sub33_21 = new Node_Sub33(class282_sub36_1);
                i_5 >>= 1;
                class282_sub33_21.anInt7830 = i_7 - i_5;
                class282_sub33_21.anInt7828 = i_7 + i_5;
                class282_sub33_21.anInt7834 = i_8 - i_5;
                class282_sub33_21.anInt7833 = i_5 + i_8;
                class282_sub33_21.anInt7829 = i_15;
                class282_sub33_21.anInt7832 = i_17;
                class282_sub33_21.anInt7831 = i_16;
                class282_sub33_21.anInt7827 = i_18;
                QuickChatMessage.aClass482_4049.append(class282_sub33_21);
            }
        }

    }

    long method13294() {
        return aShortArrayArray8003.length << 0 | aShortArrayArray8003[0].length;
    }

}
