package com.jagex;

public class Node_Sub20_Sub13 extends Node_Sub20 {

    int[][] anIntArrayArray9822;
    int[] anIntArray9823 = new int[257];

    public Node_Sub20_Sub13() {
        super(1, false);
    }

    @Override
    int[][] method12320(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[] ints_4 = method12317(0, i_1);
            int[] ints_5 = ints_3[0];
            int[] ints_6 = ints_3[1];
            int[] ints_7 = ints_3[2];

            for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                int i_9 = ints_4[i_8] >> 4;
                if (i_9 < 0) {
                    i_9 = 0;
                }

                if (i_9 > 256) {
                    i_9 = 256;
                }

                i_9 = anIntArray9823[i_9];
                ints_5[i_8] = (i_9 & 0xff0000) >> 12;
                ints_6[i_8] = (i_9 & 0xff00) >> 4;
                ints_7[i_8] = (i_9 & 0xff) << 4;
            }
        }

        return ints_3;
    }

    void method15268() {
        int i_2 = anIntArrayArray9822.length;
        if (i_2 > 0) {
            for (int i_3 = 0; i_3 < 257; i_3++) {
                int i_4 = 0;
                int i_5 = i_3 << 4;

                int i_6;
                for (i_6 = 0; i_6 < i_2 && i_5 >= anIntArrayArray9822[i_6][0]; i_6++) {
                    ++i_4;
                }

                int i_7;
                int i_8;
                int[] ints_9;
                if (i_4 < i_2) {
                    ints_9 = anIntArrayArray9822[i_4];
                    if (i_4 > 0) {
                        int[] ints_10 = anIntArrayArray9822[i_4 - 1];
                        int i_11 = (i_5 - ints_10[0] << 12) / (ints_9[0] - ints_10[0]);
                        int i_12 = 4096 - i_11;
                        i_6 = i_11 * ints_9[1] + i_12 * ints_10[1] >> 12;
                        i_7 = i_11 * ints_9[2] + i_12 * ints_10[2] >> 12;
                        i_8 = i_11 * ints_9[3] + i_12 * ints_10[3] >> 12;
                    } else {
                        i_6 = ints_9[1];
                        i_7 = ints_9[2];
                        i_8 = ints_9[3];
                    }
                } else {
                    ints_9 = anIntArrayArray9822[i_2 - 1];
                    i_6 = ints_9[1];
                    i_7 = ints_9[2];
                    i_8 = ints_9[3];
                }

                i_6 >>= 4;
                i_7 >>= 4;
                i_8 >>= 4;
                if (i_6 < 0) {
                    i_6 = 0;
                } else if (i_6 > 255) {
                    i_6 = 255;
                }

                if (i_7 < 0) {
                    i_7 = 0;
                } else if (i_7 > 255) {
                    i_7 = 255;
                }

                if (i_8 < 0) {
                    i_8 = 0;
                } else if (i_8 > 255) {
                    i_8 = 255;
                }

                anIntArray9823[i_3] = i_6 << 16 | i_7 << 8 | i_8;
            }
        }

    }

    void method15269(int i_1) {
        if (i_1 != 0) {
            switch (i_1) {
                case 1:
                    anIntArrayArray9822 = new int[2][4];
                    anIntArrayArray9822[0][0] = 0;
                    anIntArrayArray9822[0][1] = 0;
                    anIntArrayArray9822[0][2] = 0;
                    anIntArrayArray9822[0][3] = 0;
                    anIntArrayArray9822[1][0] = 4096;
                    anIntArrayArray9822[1][1] = 4096;
                    anIntArrayArray9822[1][2] = 4096;
                    anIntArrayArray9822[1][3] = 4096;
                    break;
                case 2:
                    anIntArrayArray9822 = new int[8][4];
                    anIntArrayArray9822[0][0] = 0;
                    anIntArrayArray9822[0][1] = 2650;
                    anIntArrayArray9822[0][2] = 2602;
                    anIntArrayArray9822[0][3] = 2361;
                    anIntArrayArray9822[1][0] = 2867;
                    anIntArrayArray9822[1][1] = 2313;
                    anIntArrayArray9822[1][2] = 1799;
                    anIntArrayArray9822[1][3] = 1558;
                    anIntArrayArray9822[2][0] = 3072;
                    anIntArrayArray9822[2][1] = 2618;
                    anIntArrayArray9822[2][2] = 1734;
                    anIntArrayArray9822[2][3] = 1413;
                    anIntArrayArray9822[3][0] = 3276;
                    anIntArrayArray9822[3][1] = 2296;
                    anIntArrayArray9822[3][2] = 1220;
                    anIntArrayArray9822[3][3] = 947;
                    anIntArrayArray9822[4][0] = 3481;
                    anIntArrayArray9822[4][1] = 2072;
                    anIntArrayArray9822[4][2] = 963;
                    anIntArrayArray9822[4][3] = 722;
                    anIntArrayArray9822[5][0] = 3686;
                    anIntArrayArray9822[5][1] = 2730;
                    anIntArrayArray9822[5][2] = 2152;
                    anIntArrayArray9822[5][3] = 1766;
                    anIntArrayArray9822[6][0] = 3891;
                    anIntArrayArray9822[6][1] = 2232;
                    anIntArrayArray9822[6][2] = 1060;
                    anIntArrayArray9822[6][3] = 915;
                    anIntArrayArray9822[7][0] = 4096;
                    anIntArrayArray9822[7][1] = 1686;
                    anIntArrayArray9822[7][2] = 1413;
                    anIntArrayArray9822[7][3] = 1140;
                    break;
                case 3:
                    anIntArrayArray9822 = new int[7][4];
                    anIntArrayArray9822[0][0] = 0;
                    anIntArrayArray9822[0][1] = 0;
                    anIntArrayArray9822[0][2] = 0;
                    anIntArrayArray9822[0][3] = 4096;
                    anIntArrayArray9822[1][0] = 663;
                    anIntArrayArray9822[1][1] = 0;
                    anIntArrayArray9822[1][2] = 4096;
                    anIntArrayArray9822[1][3] = 4096;
                    anIntArrayArray9822[2][0] = 1363;
                    anIntArrayArray9822[2][1] = 0;
                    anIntArrayArray9822[2][2] = 4096;
                    anIntArrayArray9822[2][3] = 0;
                    anIntArrayArray9822[3][0] = 2048;
                    anIntArrayArray9822[3][1] = 4096;
                    anIntArrayArray9822[3][2] = 4096;
                    anIntArrayArray9822[3][3] = 0;
                    anIntArrayArray9822[4][0] = 2727;
                    anIntArrayArray9822[4][1] = 4096;
                    anIntArrayArray9822[4][2] = 0;
                    anIntArrayArray9822[4][3] = 0;
                    anIntArrayArray9822[5][0] = 3411;
                    anIntArrayArray9822[5][1] = 4096;
                    anIntArrayArray9822[5][2] = 0;
                    anIntArrayArray9822[5][3] = 4096;
                    anIntArrayArray9822[6][0] = 4096;
                    anIntArrayArray9822[6][1] = 0;
                    anIntArrayArray9822[6][2] = 0;
                    anIntArrayArray9822[6][3] = 4096;
                    break;
                case 4:
                    anIntArrayArray9822 = new int[6][4];
                    anIntArrayArray9822[0][0] = 0;
                    anIntArrayArray9822[0][1] = 0;
                    anIntArrayArray9822[0][2] = 0;
                    anIntArrayArray9822[0][3] = 0;
                    anIntArrayArray9822[1][0] = 1843;
                    anIntArrayArray9822[1][1] = 0;
                    anIntArrayArray9822[1][2] = 0;
                    anIntArrayArray9822[1][3] = 1493;
                    anIntArrayArray9822[2][0] = 2457;
                    anIntArrayArray9822[2][1] = 0;
                    anIntArrayArray9822[2][2] = 0;
                    anIntArrayArray9822[2][3] = 2939;
                    anIntArrayArray9822[3][0] = 2781;
                    anIntArrayArray9822[3][1] = 0;
                    anIntArrayArray9822[3][2] = 1124;
                    anIntArrayArray9822[3][3] = 3565;
                    anIntArrayArray9822[4][0] = 3481;
                    anIntArrayArray9822[4][1] = 546;
                    anIntArrayArray9822[4][2] = 3084;
                    anIntArrayArray9822[4][3] = 4031;
                    anIntArrayArray9822[5][0] = 4096;
                    anIntArrayArray9822[5][1] = 4096;
                    anIntArrayArray9822[5][2] = 4096;
                    anIntArrayArray9822[5][3] = 4096;
                    break;
                case 5:
                    anIntArrayArray9822 = new int[16][4];
                    anIntArrayArray9822[0][0] = 0;
                    anIntArrayArray9822[0][1] = 80;
                    anIntArrayArray9822[0][2] = 192;
                    anIntArrayArray9822[0][3] = 321;
                    anIntArrayArray9822[1][0] = 155;
                    anIntArrayArray9822[1][1] = 321;
                    anIntArrayArray9822[1][2] = 449;
                    anIntArrayArray9822[1][3] = 562;
                    anIntArrayArray9822[2][0] = 389;
                    anIntArrayArray9822[2][1] = 578;
                    anIntArrayArray9822[2][2] = 690;
                    anIntArrayArray9822[2][3] = 803;
                    anIntArrayArray9822[3][0] = 671;
                    anIntArrayArray9822[3][1] = 947;
                    anIntArrayArray9822[3][2] = 995;
                    anIntArrayArray9822[3][3] = 1140;
                    anIntArrayArray9822[4][0] = 897;
                    anIntArrayArray9822[4][1] = 1285;
                    anIntArrayArray9822[4][2] = 1397;
                    anIntArrayArray9822[4][3] = 1509;
                    anIntArrayArray9822[5][0] = 1175;
                    anIntArrayArray9822[5][1] = 1525;
                    anIntArrayArray9822[5][2] = 1429;
                    anIntArrayArray9822[5][3] = 1413;
                    anIntArrayArray9822[6][0] = 1368;
                    anIntArrayArray9822[6][1] = 1734;
                    anIntArrayArray9822[6][2] = 1461;
                    anIntArrayArray9822[6][3] = 1333;
                    anIntArrayArray9822[7][0] = 1507;
                    anIntArrayArray9822[7][1] = 1413;
                    anIntArrayArray9822[7][2] = 1525;
                    anIntArrayArray9822[7][3] = 1702;
                    anIntArrayArray9822[8][0] = 1736;
                    anIntArrayArray9822[8][1] = 1108;
                    anIntArrayArray9822[8][2] = 1590;
                    anIntArrayArray9822[8][3] = 2056;
                    anIntArrayArray9822[9][0] = 2088;
                    anIntArrayArray9822[9][1] = 1766;
                    anIntArrayArray9822[9][2] = 2056;
                    anIntArrayArray9822[9][3] = 2666;
                    anIntArrayArray9822[10][0] = 2355;
                    anIntArrayArray9822[10][1] = 2409;
                    anIntArrayArray9822[10][2] = 2586;
                    anIntArrayArray9822[10][3] = 3276;
                    anIntArrayArray9822[11][0] = 2691;
                    anIntArrayArray9822[11][1] = 3116;
                    anIntArrayArray9822[11][2] = 3148;
                    anIntArrayArray9822[11][3] = 3228;
                    anIntArrayArray9822[12][0] = 3031;
                    anIntArrayArray9822[12][1] = 3806;
                    anIntArrayArray9822[12][2] = 3710;
                    anIntArrayArray9822[12][3] = 3196;
                    anIntArrayArray9822[13][0] = 3522;
                    anIntArrayArray9822[13][1] = 3437;
                    anIntArrayArray9822[13][2] = 3421;
                    anIntArrayArray9822[13][3] = 3019;
                    anIntArrayArray9822[14][0] = 3727;
                    anIntArrayArray9822[14][1] = 3116;
                    anIntArrayArray9822[14][2] = 3148;
                    anIntArrayArray9822[14][3] = 3228;
                    anIntArrayArray9822[15][0] = 4096;
                    anIntArrayArray9822[15][1] = 2377;
                    anIntArrayArray9822[15][2] = 2505;
                    anIntArrayArray9822[15][3] = 2746;
                    break;
                case 6:
                    anIntArrayArray9822 = new int[4][4];
                    anIntArrayArray9822[0][0] = 2048;
                    anIntArrayArray9822[0][1] = 0;
                    anIntArrayArray9822[0][2] = 4096;
                    anIntArrayArray9822[0][3] = 0;
                    anIntArrayArray9822[1][0] = 2867;
                    anIntArrayArray9822[1][1] = 4096;
                    anIntArrayArray9822[1][2] = 4096;
                    anIntArrayArray9822[1][3] = 0;
                    anIntArrayArray9822[2][0] = 3276;
                    anIntArrayArray9822[2][1] = 4096;
                    anIntArrayArray9822[2][2] = 4096;
                    anIntArrayArray9822[2][3] = 0;
                    anIntArrayArray9822[3][0] = 4096;
                    anIntArrayArray9822[3][1] = 4096;
                    anIntArrayArray9822[3][2] = 0;
                    anIntArrayArray9822[3][3] = 0;
                    break;
                default:
                    throw new RuntimeException();
            }
        }

    }

    @Override
    void method12321() {
        if (anIntArrayArray9822 == null) {
            method15269(1);
        }

        method15268();
    }

    @Override
    void method12322(int i_1, Packet rsbytebuffer_2) {
        if (i_1 == 0) {
            int i_4 = rsbytebuffer_2.readUnsignedByte();
            if (i_4 == 0) {
                anIntArrayArray9822 = new int[rsbytebuffer_2.readUnsignedByte()][4];

                for (int i_5 = 0; i_5 < anIntArrayArray9822.length; i_5++) {
                    anIntArrayArray9822[i_5][0] = rsbytebuffer_2.readUnsignedShort();
                    anIntArrayArray9822[i_5][1] = rsbytebuffer_2.readUnsignedByte() << 4;
                    anIntArrayArray9822[i_5][2] = rsbytebuffer_2.readUnsignedByte() << 4;
                    anIntArrayArray9822[i_5][3] = rsbytebuffer_2.readUnsignedByte() << 4;
                }
            } else {
                method15269(i_4);
            }
        }

    }

}
