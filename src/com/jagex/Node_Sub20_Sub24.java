package com.jagex;

public class Node_Sub20_Sub24 extends Node_Sub20 {

    public static Component aClass118_9884;
    int[] anIntArray9881;
    int anInt9883;
    int anInt9880;
    int anInt9882 = -1;

    public Node_Sub20_Sub24() {
        super(0, false);
    }

    static int method15390(int i_0, int i_1) {
        return i_1 < 0 ? -i_0 : (int) (i_0 * Math.sqrt(1.220703125E-4D * i_1) + 0.5D);
    }

    public static void method15391() {
        if (Class320.aClass253_3723 != null) {
            Class320.aClass253_3723.method4333();
        }

        if (ShaderDecoder.aClass253_1008 != null) {
            ShaderDecoder.aClass253_1008.method4333();
        }

    }

    @Override
    int[][] method12320(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int i_4 = (anInt9883 != Class316.anInt3671 ? anInt9883 * i_1 / Class316.anInt3671 : i_1) * anInt9880;
            int[] ints_5 = ints_3[0];
            int[] ints_6 = ints_3[1];
            int[] ints_7 = ints_3[2];
            int i_8;
            int i_9;
            if (anInt9880 == Class316.anInt3670) {
                for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                    i_9 = anIntArray9881[i_4++];
                    ints_7[i_8] = (i_9 & 0xff) << 4;
                    ints_6[i_8] = (i_9 & 0xff00) >> 4;
                    ints_5[i_8] = (i_9 & 0xff0000) >> 12;
                }
            } else {
                for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                    i_9 = i_8 * anInt9880 / Class316.anInt3670;
                    int i_10 = anIntArray9881[i_4 + i_9];
                    ints_7[i_8] = (i_10 & 0xff) << 4;
                    ints_6[i_8] = (i_10 & 0xff00) >> 4;
                    ints_5[i_8] = (i_10 & 0xff0000) >> 12;
                }
            }
        }

        return ints_3;
    }

    @Override
    void method12315(int i_1, int i_2) {
        super.method12315(i_1, i_2);
        if (anInt9882 >= 0 && Class532_Sub1.anInterface22_7922 != null) {
            int i_4 = Class532_Sub1.anInterface22_7922.method144(anInt9882).isHalfSize ? 64 : 128;
            anIntArray9881 = Class532_Sub1.anInterface22_7922.method140(anInt9882, 1.0F, i_4, i_4, false);
            anInt9883 = i_4;
            anInt9880 = i_4;
        }

    }

    @Override
    void method12326() {
        super.method12326();
        anIntArray9881 = null;
    }

    @Override
    void method12322(int i_1, Packet rsbytebuffer_2) {
        if (i_1 == 0) {
            anInt9882 = rsbytebuffer_2.readUnsignedShort();
        }

    }

    @Override
    int method12324() {
        return anInt9882;
    }

}
