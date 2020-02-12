package com.jagex;

import java.net.Socket;

public class Node_Sub20_Sub10 extends Node_Sub20 {

    static Socket clientSocket;
    int[][] anIntArrayArray9800;
    int[] anIntArray9798;
    int[] anIntArray9796;
    int anInt9799 = 0;
    short[] aShortArray9801 = new short[257];

    int[] method12319(int i_1) {
        int[] ints_3 = this.aClass320_7667.method5721(i_1, -2005829703);
        if (this.aClass320_7667.aBool3722) {
            int[] ints_4 = this.method12317(0, i_1, 2064121299);

            for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
                int i_6 = ints_4[i_5] >> 4;
                if (i_6 < 0) {
                    i_6 = 0;
                }

                if (i_6 > 256) {
                    i_6 = 256;
                }

                ints_3[i_5] = this.aShortArray9801[i_6];
            }
        }

        return ints_3;
    }

    final int[] method15257(int i_1, int i_2) {
        return i_1 < 0 ? this.anIntArray9798 : (i_1 >= this.anIntArrayArray9800.length ? this.anIntArray9796 : this.anIntArrayArray9800[i_1]);
    }

    void method12321(int i_1) {
        if (this.anIntArrayArray9800 == null) {
            this.anIntArrayArray9800 = new int[][]{new int[2], {4096, 4096}};
        }

        if (this.anIntArrayArray9800.length < 2) {
            throw new RuntimeException();
        } else {
            if (this.anInt9799 == 2) {
                this.method15259();
            }

            Class316.method5586((byte) -8);
            this.method15258();
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
        switch (this.anInt9799) {
            case 1:
                for (i_2 = 0; i_2 < 257; i_2++) {
                    i_3 = i_2 << 4;

                    for (i_4 = 1; i_4 < this.anIntArrayArray9800.length - 1 && this.anIntArrayArray9800[i_4][0] <= i_3; i_4++) {
                    }

                    ints_5 = this.anIntArrayArray9800[i_4 - 1];
                    ints_6 = this.anIntArrayArray9800[i_4];
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

                    this.aShortArray9801[i_2] = (short) i_10;
                }

                return;
            case 2:
                for (i_2 = 0; i_2 < 257; i_2++) {
                    i_3 = i_2 << 4;

                    for (i_4 = 1; i_4 < this.anIntArrayArray9800.length - 1 && this.anIntArrayArray9800[i_4][0] <= i_3; i_4++) {
                    }

                    ints_5 = this.anIntArrayArray9800[i_4 - 1];
                    ints_6 = this.anIntArrayArray9800[i_4];
                    i_7 = this.method15257(i_4 - 2, 1838320651)[1];
                    i_8 = ints_5[1];
                    i_9 = ints_6[1];
                    i_10 = this.method15257(i_4 + 1, 1394468294)[1];
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

                    this.aShortArray9801[i_2] = (short) i_20;
                }

                return;
            default:
                for (i_2 = 0; i_2 < 257; i_2++) {
                    i_3 = i_2 << 4;

                    for (i_4 = 1; i_4 < this.anIntArrayArray9800.length - 1 && this.anIntArrayArray9800[i_4][0] <= i_3; i_4++) {
                    }

                    ints_5 = this.anIntArrayArray9800[i_4 - 1];
                    ints_6 = this.anIntArrayArray9800[i_4];
                    i_7 = (i_3 - ints_5[0] << 12) / (ints_6[0] - ints_5[0]);
                    i_8 = 4096 - i_7;
                    i_9 = i_7 * ints_6[1] + i_8 * ints_5[1] >> 12;
                    if (i_9 <= -32768) {
                        i_9 = -32767;
                    }

                    if (i_9 >= 32768) {
                        i_9 = 32767;
                    }

                    this.aShortArray9801[i_2] = (short) i_9;
                }

        }
    }

    final void method15259() {
        int[] ints_2 = this.anIntArrayArray9800[0];
        int[] ints_3 = this.anIntArrayArray9800[1];
        int[] ints_4 = this.anIntArrayArray9800[this.anIntArrayArray9800.length - 2];
        int[] ints_5 = this.anIntArrayArray9800[this.anIntArrayArray9800.length - 1];
        this.anIntArray9798 = new int[]{ints_2[0] - ints_3[0] + ints_2[0], ints_2[1] - ints_3[1] + ints_2[1]};
        this.anIntArray9796 = new int[]{ints_4[0] - ints_5[0] + ints_4[0], ints_4[1] - ints_5[1] + ints_4[1]};
    }

    void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
        if (i_1 == 0) {
            this.anInt9799 = rsbytebuffer_2.readUnsignedByte();
            this.anIntArrayArray9800 = new int[rsbytebuffer_2.readUnsignedByte()][2];

            for (int i_4 = 0; i_4 < this.anIntArrayArray9800.length; i_4++) {
                this.anIntArrayArray9800[i_4][0] = rsbytebuffer_2.readUnsignedShort();
                this.anIntArrayArray9800[i_4][1] = rsbytebuffer_2.readUnsignedShort();
            }
        }

    }

    public Node_Sub20_Sub10() {
        super(1, true);
    }

    static Node_Sub15_Sub2 method15262(Node_Sub15_Sub2 class282_sub15_sub2_0, int i_1) {
        Node_Sub15_Sub2 class282_sub15_sub2_2 = class282_sub15_sub2_0 == null ? new Node_Sub15_Sub2() : new Node_Sub15_Sub2(class282_sub15_sub2_0);
        class282_sub15_sub2_2.method15137(-240032763);
        return class282_sub15_sub2_2;
    }

    public static void method15263(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(2, i_0);
        class282_sub50_sub12_2.method14965((byte) 22);
    }

}
