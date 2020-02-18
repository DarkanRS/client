package com.jagex;

public class Node_Sub20_Sub32 extends Node_Sub20 {

    int anInt9922;
    int anInt9925;
    int anInt9926;
    int anInt9918;
    int anInt9919;
    int anInt9923;
    int anInt9924;
    int anInt9921;
    int anInt9927;

    public Node_Sub20_Sub32() {
        super(1, false);
    }

    @Override
    int[][] method12320(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[][] ints_4 = method12333(0, i_1);
            int[] ints_5 = ints_4[0];
            int[] ints_6 = ints_4[1];
            int[] ints_7 = ints_4[2];
            int[] ints_8 = ints_3[0];
            int[] ints_9 = ints_3[1];
            int[] ints_10 = ints_3[2];

            for (int i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
                method15400(ints_5[i_11], ints_6[i_11], ints_7[i_11]);
                anInt9922 += anInt9918;
                anInt9925 += anInt9919;

                for (anInt9926 += anInt9923; anInt9922 < 0; anInt9922 += 4096) {
                }

                while (anInt9922 > 4096) {
                    anInt9922 -= 4096;
                }

                if (anInt9925 < 0) {
                    anInt9925 = 0;
                }

                if (anInt9925 > 4096) {
                    anInt9925 = 4096;
                }

                if (anInt9926 < 0) {
                    anInt9926 = 0;
                }

                if (anInt9926 > 4096) {
                    anInt9926 = 4096;
                }

                method15401(anInt9922, anInt9925, anInt9926);
                ints_8[i_11] = anInt9927;
                ints_9[i_11] = anInt9921;
                ints_10[i_11] = anInt9924;
            }
        }

        return ints_3;
    }

    void method15400(int i_1, int i_2, int i_3) {
        int i_5 = Math.max(i_1, i_2);
        i_5 = Math.max(i_3, i_5);
        int i_6 = Math.min(i_1, i_2);
        i_6 = Math.min(i_3, i_6);
        int i_7 = i_5 - i_6;
        anInt9926 = (i_6 + i_5) / 2;
        if (anInt9926 > 0 && anInt9926 < 4096) {
            anInt9925 = (i_7 << 12) / (anInt9926 <= 2048 ? anInt9926 * 2 : 8192 - anInt9926 * 2);
        } else {
            anInt9925 = 0;
        }

        if (i_7 > 0) {
            int i_8 = (i_5 - i_1 << 12) / i_7;
            int i_9 = (i_5 - i_2 << 12) / i_7;
            int i_10 = (i_5 - i_3 << 12) / i_7;
            if (i_5 == i_1) {
                anInt9922 = i_6 == i_2 ? i_10 + 20480 : 4096 - i_9;
            } else if (i_5 == i_2) {
                anInt9922 = i_3 == i_6 ? i_8 + 4096 : 12288 - i_10;
            } else {
                anInt9922 = i_6 == i_1 ? i_9 + 12288 : 20480 - i_8;
            }

            anInt9922 /= 6;
        } else {
            anInt9922 = 0;
        }

    }

    void method15401(int i_1, int i_2, int i_3) {
        int i_5 = i_3 <= 2048 ? i_3 * (i_2 + 4096) >> 12 : i_3 + i_2 - (i_3 * i_2 >> 12);
        if (i_5 > 0) {
            i_1 *= 6;
            int i_6 = i_3 + i_3 - i_5;
            int i_7 = (i_5 - i_6 << 12) / i_5;
            int i_8 = i_1 >> 12;
            int i_9 = i_1 - (i_8 << 12);
            int i_10 = i_7 * i_5 >> 12;
            i_10 = i_9 * i_10 >> 12;
            int i_11 = i_6 + i_10;
            int i_12 = i_5 - i_10;
            switch (i_8) {
                case 0:
                    anInt9927 = i_5;
                    anInt9921 = i_11;
                    anInt9924 = i_6;
                    break;
                case 1:
                    anInt9927 = i_12;
                    anInt9921 = i_5;
                    anInt9924 = i_6;
                    break;
                case 2:
                    anInt9927 = i_6;
                    anInt9921 = i_5;
                    anInt9924 = i_11;
                    break;
                case 3:
                    anInt9927 = i_6;
                    anInt9921 = i_12;
                    anInt9924 = i_5;
                    break;
                case 4:
                    anInt9927 = i_11;
                    anInt9921 = i_6;
                    anInt9924 = i_5;
                    break;
                case 5:
                    anInt9927 = i_5;
                    anInt9921 = i_6;
                    anInt9924 = i_12;
            }
        } else {
            anInt9924 = i_3 * -680551435;
            anInt9927 = anInt9921 = i_3;
        }

    }

    @Override
    void method12322(int i_1, Packet rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9918 = rsbytebuffer_2.readShort();
                break;
            case 1:
                anInt9919 = (rsbytebuffer_2.readByte() << 12) / 100;
                break;
            case 2:
                anInt9923 = (rsbytebuffer_2.readByte() << 12) / 100;
        }

    }

}
