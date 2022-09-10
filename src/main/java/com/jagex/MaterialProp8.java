package com.jagex;

import java.net.Socket;

public class MaterialProp8 extends MaterialProperty {

    static Socket clientSocket;
    int[][] anIntArrayArray9800;
    int[] anIntArray9798;
    int[] anIntArray9796;
    int anInt9799;
    short[] aShortArray9801 = new short[257];

    public MaterialProp8() {
        super(1, true);
    }

    static Node_Sub15_Sub2 method15262(Node_Sub15_Sub2 class282_sub15_sub2_0) {
        Node_Sub15_Sub2 class282_sub15_sub2_2 = class282_sub15_sub2_0 == null ? new Node_Sub15_Sub2() : new Node_Sub15_Sub2(class282_sub15_sub2_0);
        class282_sub15_sub2_2.method15137();
        return class282_sub15_sub2_2;
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int[] ints_4 = method12317(0, i_1);

            for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
                int i_6 = ints_4[i_5] >> 4;
                if (i_6 < 0) {
                    i_6 = 0;
                }

                if (i_6 > 256) {
                    i_6 = 256;
                }

                ints_3[i_5] = aShortArray9801[i_6];
            }
        }

        return ints_3;
    }

    int[] method15257(int i_1) {
        return i_1 < 0 ? anIntArray9798 : (i_1 >= anIntArrayArray9800.length ? anIntArray9796 : anIntArrayArray9800[i_1]);
    }

    @Override
    void method12321() {
        if (anIntArrayArray9800 == null) {
            anIntArrayArray9800 = new int[][]{new int[2], {4096, 4096}};
        }

        if (anIntArrayArray9800.length < 2) {
            throw new RuntimeException();
        } else {
            if (anInt9799 == 2) {
                method15259();
            }

            Class316.method5586();
            method15258();
        }
    }

    void method15258() {
        int i_2;
        int i_3;
        int i_4;
        int[] ints_5;
        int[] ints_6;
        int i_7;
        int i_8;
        int i_9;
        int i_10;
        switch (anInt9799) {
            case 1:
                for (i_2 = 0; i_2 < 257; i_2++) {
                    i_3 = i_2 << 4;

                    for (i_4 = 1; i_4 < anIntArrayArray9800.length - 1 && anIntArrayArray9800[i_4][0] <= i_3; i_4++) {
                    }

                    ints_5 = anIntArrayArray9800[i_4 - 1];
                    ints_6 = anIntArrayArray9800[i_4];
                    i_7 = (i_3 - ints_5[0] << 12) / (ints_6[0] - ints_5[0]);
                    i_8 = 4096 - Class316.anIntArray3675[i_7 >> 5 & 0xff] >> 1;
                    i_9 = 4096 - i_8;
                    i_10 = i_8 * ints_6[1] + i_9 * ints_5[1] >> 12;
                    if (i_10 <= -32768) {
                        i_10 = -32767;
                    }

                    if (i_10 >= 32768) {
                        i_10 = 32767;
                    }

                    aShortArray9801[i_2] = (short) i_10;
                }

                return;
            case 2:
                for (i_2 = 0; i_2 < 257; i_2++) {
                    i_3 = i_2 << 4;

                    for (i_4 = 1; i_4 < anIntArrayArray9800.length - 1 && anIntArrayArray9800[i_4][0] <= i_3; i_4++) {
                    }

                    ints_5 = anIntArrayArray9800[i_4 - 1];
                    ints_6 = anIntArrayArray9800[i_4];
                    i_7 = method15257(i_4 - 2)[1];
                    i_8 = ints_5[1];
                    i_9 = ints_6[1];
                    i_10 = method15257(i_4 + 1)[1];
                    int i_11 = (i_3 - ints_5[0] << 12) / (ints_6[0] - ints_5[0]);
                    int i_12 = i_11 * i_11 >> 12;
                    int i_13 = i_8 + (i_10 - i_9 - i_7);
                    int i_14 = i_7 - i_8 - i_13;
                    int i_15 = i_9 - i_7;
                    int i_17 = i_12 * (i_13 * i_11 >> 12) >> 12;
                    int i_18 = i_14 * i_12 >> 12;
                    int i_19 = i_11 * i_15 >> 12;
                    int i_20 = i_17 + i_18 + i_19 + i_8;
                    if (i_20 <= -32768) {
                        i_20 = -32767;
                    }

                    if (i_20 >= 32768) {
                        i_20 = 32767;
                    }

                    aShortArray9801[i_2] = (short) i_20;
                }

                return;
            default:
                for (i_2 = 0; i_2 < 257; i_2++) {
                    i_3 = i_2 << 4;

                    for (i_4 = 1; i_4 < anIntArrayArray9800.length - 1 && anIntArrayArray9800[i_4][0] <= i_3; i_4++) {
                    }

                    ints_5 = anIntArrayArray9800[i_4 - 1];
                    ints_6 = anIntArrayArray9800[i_4];
                    i_7 = (i_3 - ints_5[0] << 12) / (ints_6[0] - ints_5[0]);
                    i_8 = 4096 - i_7;
                    i_9 = i_7 * ints_6[1] + i_8 * ints_5[1] >> 12;
                    if (i_9 <= -32768) {
                        i_9 = -32767;
                    }

                    if (i_9 >= 32768) {
                        i_9 = 32767;
                    }

                    aShortArray9801[i_2] = (short) i_9;
                }

        }
    }

    void method15259() {
        int[] ints_2 = anIntArrayArray9800[0];
        int[] ints_3 = anIntArrayArray9800[1];
        int[] ints_4 = anIntArrayArray9800[anIntArrayArray9800.length - 2];
        int[] ints_5 = anIntArrayArray9800[anIntArrayArray9800.length - 1];
        anIntArray9798 = new int[]{ints_2[0] - ints_3[0] + ints_2[0], ints_2[1] - ints_3[1] + ints_2[1]};
        anIntArray9796 = new int[]{ints_4[0] - ints_5[0] + ints_4[0], ints_4[1] - ints_5[1] + ints_4[1]};
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        if (i_1 == 0) {
            anInt9799 = rsbytebuffer_2.readUnsignedByte();
            anIntArrayArray9800 = new int[rsbytebuffer_2.readUnsignedByte()][2];

            for (int i_4 = 0; i_4 < anIntArrayArray9800.length; i_4++) {
                anIntArrayArray9800[i_4][0] = rsbytebuffer_2.readUnsignedShort();
                anIntArrayArray9800[i_4][1] = rsbytebuffer_2.readUnsignedShort();
            }
        }

    }

}
