package com.jagex;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MaterialProp7 extends MaterialProperty {

    int anInt9895 = 6;

    public MaterialProp7() {
        super(2, false);
    }

    public static void method15395(Canvas object_0) {
        if (Shadow.anEventQueue10074 != null) {
            for (int i_2 = 0; i_2 < 50 && Shadow.anEventQueue10074.peekEvent() != null; i_2++) {
                Class89.sleep(1L);
            }

            try {
                if (object_0 != null) {
                    Shadow.anEventQueue10074.postEvent(new ActionEvent(object_0, 1001, "dummy"));
                }
            } catch (Exception ignored) {
            }
        }

    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int[] ints_4 = method12317(0, i_1);
            int[] ints_5 = method12317(1, i_1);
            int i_6;
            int i_7;
            int i_8;
            switch (anInt9895) {
                case 1:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        ints_3[i_6] = ints_5[i_6] + ints_4[i_6];
                    }

                    return ints_3;
                case 2:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        ints_3[i_6] = ints_4[i_6] - ints_5[i_6];
                    }

                    return ints_3;
                case 3:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        ints_3[i_6] = ints_4[i_6] * ints_5[i_6] >> 12;
                    }

                    return ints_3;
                case 4:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_5[i_6];
                        ints_3[i_6] = i_7 != 0 ? (ints_4[i_6] << 12) / i_7 : 4096;
                    }

                    return ints_3;
                case 5:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        ints_3[i_6] = 4096 - ((4096 - ints_4[i_6]) * (4096 - ints_5[i_6]) >> 12);
                    }

                    return ints_3;
                case 6:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_5[i_6];
                        ints_3[i_6] = i_7 < 2048 ? i_7 * ints_4[i_6] >> 11 : 4096 - ((4096 - ints_4[i_6]) * (4096 - i_7) >> 11);
                    }

                    return ints_3;
                case 7:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_4[i_6];
                        ints_3[i_6] = i_7 == 4096 ? 4096 : (ints_5[i_6] << 12) / (4096 - i_7);
                    }

                    return ints_3;
                case 8:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_4[i_6];
                        ints_3[i_6] = i_7 == 0 ? 0 : 4096 - (4096 - ints_5[i_6] << 12) / i_7;
                    }

                    return ints_3;
                case 9:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_4[i_6];
                        i_8 = ints_5[i_6];
                        ints_3[i_6] = Math.min(i_7, i_8);
                    }

                    return ints_3;
                case 10:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_4[i_6];
                        i_8 = ints_5[i_6];
                        ints_3[i_6] = Math.max(i_7, i_8);
                    }

                    return ints_3;
                case 11:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_4[i_6];
                        i_8 = ints_5[i_6];
                        ints_3[i_6] = i_7 > i_8 ? i_7 - i_8 : i_8 - i_7;
                    }

                    return ints_3;
                case 12:
                    for (i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                        i_7 = ints_4[i_6];
                        i_8 = ints_5[i_6];
                        ints_3[i_6] = i_8 + i_7 - (i_7 * i_8 >> 11);
                    }
            }
        }

        return ints_3;
    }

    @Override
    int[][] getPixels(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[][] ints_4 = method12333(0, i_1);
            int[][] ints_5 = method12333(1, i_1);
            int[] ints_6 = ints_3[0];
            int[] ints_7 = ints_3[1];
            int[] ints_8 = ints_3[2];
            int[] ints_9 = ints_4[0];
            int[] ints_10 = ints_4[1];
            int[] ints_11 = ints_4[2];
            int[] ints_12 = ints_5[0];
            int[] ints_13 = ints_5[1];
            int[] ints_14 = ints_5[2];
            int i_15;
            int i_16;
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            switch (anInt9895) {
                case 1:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        ints_6[i_15] = ints_9[i_15] + ints_12[i_15];
                        ints_7[i_15] = ints_10[i_15] + ints_13[i_15];
                        ints_8[i_15] = ints_14[i_15] + ints_11[i_15];
                    }

                    return ints_3;
                case 2:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        ints_6[i_15] = ints_9[i_15] - ints_12[i_15];
                        ints_7[i_15] = ints_10[i_15] - ints_13[i_15];
                        ints_8[i_15] = ints_11[i_15] - ints_14[i_15];
                    }

                    return ints_3;
                case 3:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        ints_6[i_15] = ints_12[i_15] * ints_9[i_15] >> 12;
                        ints_7[i_15] = ints_10[i_15] * ints_13[i_15] >> 12;
                        ints_8[i_15] = ints_11[i_15] * ints_14[i_15] >> 12;
                    }

                    return ints_3;
                case 4:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_12[i_15];
                        i_17 = ints_13[i_15];
                        i_18 = ints_14[i_15];
                        ints_6[i_15] = i_16 != 0 ? (ints_9[i_15] << 12) / i_16 : 4096;
                        ints_7[i_15] = i_17 != 0 ? (ints_10[i_15] << 12) / i_17 : 4096;
                        ints_8[i_15] = i_18 != 0 ? (ints_11[i_15] << 12) / i_18 : 4096;
                    }

                    return ints_3;
                case 5:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        ints_6[i_15] = 4096 - ((4096 - ints_12[i_15]) * (4096 - ints_9[i_15]) >> 12);
                        ints_7[i_15] = 4096 - ((4096 - ints_10[i_15]) * (4096 - ints_13[i_15]) >> 12);
                        ints_8[i_15] = 4096 - ((4096 - ints_11[i_15]) * (4096 - ints_14[i_15]) >> 12);
                    }

                    return ints_3;
                case 6:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_12[i_15];
                        i_17 = ints_13[i_15];
                        i_18 = ints_14[i_15];
                        ints_6[i_15] = i_16 < 2048 ? i_16 * ints_9[i_15] >> 11 : 4096 - ((4096 - ints_9[i_15]) * (4096 - i_16) >> 11);
                        ints_7[i_15] = i_17 < 2048 ? i_17 * ints_10[i_15] >> 11 : 4096 - ((4096 - ints_10[i_15]) * (4096 - i_17) >> 11);
                        ints_8[i_15] = i_18 < 2048 ? i_18 * ints_11[i_15] >> 11 : 4096 - ((4096 - ints_11[i_15]) * (4096 - i_18) >> 11);
                    }

                    return ints_3;
                case 7:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_9[i_15];
                        i_17 = ints_10[i_15];
                        i_18 = ints_11[i_15];
                        ints_6[i_15] = i_16 == 4096 ? 4096 : (ints_12[i_15] << 12) / (4096 - i_16);
                        ints_7[i_15] = i_17 == 4096 ? 4096 : (ints_13[i_15] << 12) / (4096 - i_17);
                        ints_8[i_15] = i_18 == 4096 ? 4096 : (ints_14[i_15] << 12) / (4096 - i_18);
                    }

                    return ints_3;
                case 8:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_9[i_15];
                        i_17 = ints_10[i_15];
                        i_18 = ints_11[i_15];
                        ints_6[i_15] = i_16 == 0 ? 0 : 4096 - (4096 - ints_12[i_15] << 12) / i_16;
                        ints_7[i_15] = i_17 == 0 ? 0 : 4096 - (4096 - ints_13[i_15] << 12) / i_17;
                        ints_8[i_15] = i_18 == 0 ? 0 : 4096 - (4096 - ints_14[i_15] << 12) / i_18;
                    }

                    return ints_3;
                case 9:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_9[i_15];
                        i_17 = ints_10[i_15];
                        i_18 = ints_11[i_15];
                        i_19 = ints_12[i_15];
                        i_20 = ints_13[i_15];
                        i_21 = ints_14[i_15];
                        ints_6[i_15] = Math.min(i_16, i_19);
                        ints_7[i_15] = Math.min(i_17, i_20);
                        ints_8[i_15] = Math.min(i_18, i_21);
                    }

                    return ints_3;
                case 10:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_9[i_15];
                        i_17 = ints_10[i_15];
                        i_18 = ints_11[i_15];
                        i_19 = ints_12[i_15];
                        i_20 = ints_13[i_15];
                        i_21 = ints_14[i_15];
                        ints_6[i_15] = Math.max(i_16, i_19);
                        ints_7[i_15] = Math.max(i_17, i_20);
                        ints_8[i_15] = Math.max(i_18, i_21);
                    }

                    return ints_3;
                case 11:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_9[i_15];
                        i_17 = ints_10[i_15];
                        i_18 = ints_11[i_15];
                        i_19 = ints_12[i_15];
                        i_20 = ints_13[i_15];
                        i_21 = ints_14[i_15];
                        ints_6[i_15] = i_16 > i_19 ? i_16 - i_19 : i_19 - i_16;
                        ints_7[i_15] = i_17 > i_20 ? i_17 - i_20 : i_20 - i_17;
                        ints_8[i_15] = i_18 > i_21 ? i_18 - i_21 : i_21 - i_18;
                    }

                    return ints_3;
                case 12:
                    for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                        i_16 = ints_9[i_15];
                        i_17 = ints_10[i_15];
                        i_18 = ints_11[i_15];
                        i_19 = ints_12[i_15];
                        i_20 = ints_13[i_15];
                        i_21 = ints_14[i_15];
                        ints_6[i_15] = i_16 + i_19 - (i_19 * i_16 >> 11);
                        ints_7[i_15] = i_20 + i_17 - (i_20 * i_17 >> 11);
                        ints_8[i_15] = i_21 + i_18 - (i_21 * i_18 >> 11);
                    }
            }
        }

        return ints_3;
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9895 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 1:
                aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
        }

    }

}
