package com.jagex;

public class Node_Sub20_Sub15 extends Node_Sub20 {

    static NativeSprite[] aNativeSpriteArray9838;
    int anInt9836 = 32768;

    public Node_Sub20_Sub15() {
        super(3, false);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int[] ints_4 = method12317(1, i_1);
            int[] ints_5 = method12317(2, i_1);
            for (int i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                int i_7 = ints_4[i_6] >> 4 & 0xff;
                int i_8 = anInt9836 * ints_5[i_6] >> 12;
                int i_9 = Class316.anIntArray3675[i_7] * i_8 >> 12;
                int i_10 = Class316.anIntArray3677[i_7] * i_8 >> 12;
                int i_11 = i_6 + (i_9 >> 12) & Class316.anInt3669;
                int i_12 = (i_10 >> 12) + i_1 & Class316.anInt3673;
                int[] ints_13 = method12317(0, i_12);
                ints_3[i_6] = ints_13[i_11];
            }
        }
        return ints_3;
    }

    @Override
    int[][] method12320(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[] ints_4 = method12317(1, i_1);
            int[] ints_5 = method12317(2, i_1);
            int[] ints_6 = ints_3[0];
            int[] ints_7 = ints_3[1];
            int[] ints_8 = ints_3[2];
            for (int i_9 = 0; i_9 < Class316.anInt3670; i_9++) {
                int i_10 = ints_4[i_9] * 255 >> 12 & 0xff;
                int i_11 = anInt9836 * ints_5[i_9] >> 12;
                int i_12 = Class316.anIntArray3675[i_10] * i_11 >> 12;
                int i_13 = Class316.anIntArray3677[i_10] * i_11 >> 12;
                int i_14 = i_9 + (i_12 >> 12) & Class316.anInt3669;
                int i_15 = (i_13 >> 12) + i_1 & Class316.anInt3673;
                int[][] ints_16 = method12333(0, i_15);
                ints_6[i_9] = ints_16[0][i_14];
                ints_7[i_9] = ints_16[1][i_14];
                ints_8[i_9] = ints_16[2][i_14];
            }
        }
        return ints_3;
    }

    @Override
    void method12321() {
        Class316.method5586();
    }

    @Override
    void method12322(int i_1, Packet rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9836 = rsbytebuffer_2.readUnsignedShort() << 4;
                break;
            case 1:
                aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
        }
    }
}
