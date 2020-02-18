package com.jagex;

public class Node_Sub20_Sub2 extends Node_Sub20 {

    int anInt9673 = 4;
    int anInt9674 = 4;

    public Node_Sub20_Sub2() {
        super(1, false);
    }

    public static int method15076(int i_0, int i_1) {
        int i_11 = i_1;
        i_11 = (i_0 & 0x7f) * i_11 >> 7;
        if (i_11 < 2) {
            i_11 = 2;
        } else if (i_11 > 126) {
            i_11 = 126;
        }

        return (i_0 & 0xff80) + i_11;
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int i_4 = Class316.anInt3670 / anInt9673;
            int i_5 = Class316.anInt3671 / anInt9674;
            int[] ints_6;
            int i_7;
            if (i_5 > 0) {
                i_7 = i_1 % i_5;
                ints_6 = method12317(0, i_7 * Class316.anInt3671 / i_5);
            } else {
                ints_6 = method12317(0, 0);
            }

            for (i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
                if (i_4 > 0) {
                    int i_8 = i_7 % i_4;
                    ints_3[i_7] = ints_6[i_8 * Class316.anInt3670 / i_4];
                } else {
                    ints_3[i_7] = ints_6[0];
                }
            }
        }

        return ints_3;
    }

    @Override
    int[][] method12320(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int i_4 = Class316.anInt3670 / anInt9673;
            int i_5 = Class316.anInt3671 / anInt9674;
            int[][] ints_6;
            if (i_5 > 0) {
                int i_7 = i_1 % i_5;
                ints_6 = method12333(0, i_7 * Class316.anInt3671 / i_5);
            } else {
                ints_6 = method12333(0, 0);
            }

            int[] ints_16 = ints_6[0];
            int[] ints_8 = ints_6[1];
            int[] ints_9 = ints_6[2];
            int[] ints_10 = ints_3[0];
            int[] ints_11 = ints_3[1];
            int[] ints_12 = ints_3[2];

            for (int i_13 = 0; i_13 < Class316.anInt3670; i_13++) {
                int i_14;
                if (i_4 > 0) {
                    int i_15 = i_13 % i_4;
                    i_14 = i_15 * Class316.anInt3670 / i_4;
                } else {
                    i_14 = 0;
                }

                ints_10[i_13] = ints_16[i_14];
                ints_11[i_13] = ints_8[i_14];
                ints_12[i_13] = ints_9[i_14];
            }
        }

        return ints_3;
    }

    @Override
    void method12322(int i_1, Packet rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9673 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 1:
                anInt9674 = rsbytebuffer_2.readUnsignedByte();
        }

    }

}
