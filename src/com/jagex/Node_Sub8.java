package com.jagex;

import java.nio.ByteBuffer;

public class Node_Sub8 extends Node {

    int anInt7530;
    HardwareRenderer aGraphicalRenderer_Sub2_7533;
    Node_Sub24 aNode_Sub24_7528;
    HardwareGround aGround_Sub1_7524;
    int anInt7531;
    int anInt7527;
    int anInt7526;
    int anInt7529;
    float[][] aFloatArrayArray7534;
    float[][] aFloatArrayArray7535;
    float[][] aFloatArrayArray7536;
    Interface4 anInterface4_7525;
    Interface32 anInterface32_7523;
    HashTable aClass453_7537;
    int anInt7532;

    Node_Sub8(HardwareRenderer class505_sub2_1, HardwareGround class390_sub1_2, Node_Sub24 class282_sub24_3, int[] ints_4) {
        aGraphicalRenderer_Sub2_7533 = class505_sub2_1;
        aNode_Sub24_7528 = class282_sub24_3;
        aGround_Sub1_7524 = class390_sub1_2;
        int i_5 = aNode_Sub24_7528.method12370() - (class390_sub1_2.tileUnits >> 1);
        anInt7531 = aNode_Sub24_7528.method12368() - i_5 >> class390_sub1_2.tileScale;
        anInt7527 = aNode_Sub24_7528.method12368() + i_5 >> class390_sub1_2.tileScale;
        anInt7526 = aNode_Sub24_7528.method12394() - i_5 >> class390_sub1_2.tileScale;
        anInt7529 = aNode_Sub24_7528.method12394() + i_5 >> class390_sub1_2.tileScale;
        int i_6 = anInt7527 - anInt7531 + 1;
        int i_7 = anInt7529 - anInt7526 + 1;
        aFloatArrayArray7534 = new float[i_6 + 1][i_7 + 1];
        aFloatArrayArray7535 = new float[i_6 + 1][i_7 + 1];
        aFloatArrayArray7536 = new float[i_6 + 1][i_7 + 1];

        int i_8;
        int i_9;
        int i_11;
        int i_12;
        int i_13;
        int i_21;
        for (i_8 = 0; i_8 <= i_7; i_8++) {
            i_9 = i_8 + anInt7526;
            if (i_9 > 0 && i_9 < aGround_Sub1_7524.length - 1) {
                for (i_21 = 0; i_21 <= i_6; i_21++) {
                    i_11 = i_21 + anInt7531;
                    if (i_11 > 0 && i_11 < aGround_Sub1_7524.width - 1) {
                        i_12 = class390_sub1_2.getHeight(i_11 + 1, i_9) - class390_sub1_2.getHeight(i_11 - 1, i_9);
                        i_13 = class390_sub1_2.getHeight(i_11, i_9 + 1) - class390_sub1_2.getHeight(i_11, i_9 - 1);
                        float f_14 = (float) (1.0D / Math.sqrt(i_12 * i_12 + i_13 * i_13 + 65536));
                        aFloatArrayArray7534[i_21][i_8] = i_12 * f_14;
                        aFloatArrayArray7535[i_21][i_8] = -256.0f * f_14;
                        aFloatArrayArray7536[i_21][i_8] = i_13 * f_14;
                    }
                }
            }
        }

        i_8 = 0;

        for (i_9 = anInt7526; i_9 <= anInt7529; i_9++) {
            if (i_9 >= 0 && i_9 < class390_sub1_2.length) {
                for (i_21 = anInt7531; i_21 <= anInt7527; i_21++) {
                    if (i_21 >= 0 && i_21 < class390_sub1_2.width) {
                        i_11 = ints_4[i_8];
                        int[] ints_22 = class390_sub1_2.anIntArrayArrayArray8538[i_21][i_9];
                        if (ints_22 != null && i_11 != 0) {
                            if (i_11 == 1) {
                                i_13 = 0;

                                while (i_13 < ints_22.length) {
                                    if (ints_22[i_13++] != -1 && ints_22[i_13++] != -1 && ints_22[i_13++] != -1) {
                                        anInt7532 += 3;
                                    }
                                }
                            } else {
                                anInt7532 += 3;
                            }
                        }
                    }

                    ++i_8;
                }
            } else {
                i_8 += anInt7527 - anInt7531;
            }
        }

        if (anInt7532 > 0) {
            aClass453_7537 = new HashTable(Utils.nextPowerOfTwo(anInt7532));
            ByteBuffer bytebuffer_20 = aGraphicalRenderer_Sub2_7533.aByteBuffer8838;
            bytebuffer_20.clear();
            bytebuffer_20.position(2097152);
            ByteBuffer bytebuffer_10 = bytebuffer_20.slice();
            bytebuffer_20.position(0);
            bytebuffer_20.limit(2097152);
            i_11 = 0;
            i_8 = 0;

            for (i_12 = anInt7526; i_12 <= anInt7529; i_12++) {
                if (i_12 >= 0 && i_12 < class390_sub1_2.length) {
                    i_13 = 0;

                    for (int i_23 = anInt7531; i_23 <= anInt7527; i_23++) {
                        if (i_23 >= 0 && i_23 < class390_sub1_2.width) {
                            int i_15 = ints_4[i_8];
                            int[] ints_16 = class390_sub1_2.anIntArrayArrayArray8538[i_23][i_12];
                            if (ints_16 != null && i_15 != 0) {
                                if (i_15 != 1) {
                                    if (i_15 == 3) {
                                        method12175(i_13, i_11, i_23, i_12, 0, 0, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, class390_sub1_2.tileUnits, 0, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, 0, class390_sub1_2.tileUnits, bytebuffer_10, bytebuffer_20);
                                    } else if (i_15 == 2) {
                                        method12175(i_13, i_11, i_23, i_12, class390_sub1_2.tileUnits, 0, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, class390_sub1_2.tileUnits, class390_sub1_2.tileUnits, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, 0, 0, bytebuffer_10, bytebuffer_20);
                                    } else if (i_15 == 5) {
                                        method12175(i_13, i_11, i_23, i_12, class390_sub1_2.tileUnits, class390_sub1_2.tileUnits, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, 0, class390_sub1_2.tileUnits, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, class390_sub1_2.tileUnits, 0, bytebuffer_10, bytebuffer_20);
                                    } else if (i_15 == 4) {
                                        method12175(i_13, i_11, i_23, i_12, 0, class390_sub1_2.tileUnits, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, 0, 0, bytebuffer_10, bytebuffer_20);
                                        method12175(i_13, i_11, i_23, i_12, class390_sub1_2.tileUnits, class390_sub1_2.tileUnits, bytebuffer_10, bytebuffer_20);
                                    }
                                } else {
                                    int[] ints_17 = class390_sub1_2.anIntArrayArrayArray8540[i_23][i_12];
                                    int[] ints_18 = class390_sub1_2.anIntArrayArrayArray8533[i_23][i_12];
                                    int i_19 = 0;

                                    label108:
                                    while (true) {
                                        while (true) {
                                            if (i_19 >= ints_16.length) {
                                                break label108;
                                            }

                                            if (ints_16[i_19] != -1 && ints_16[i_19 + 1] != -1 && ints_16[i_19 + 2] != -1) {
                                                method12175(i_13, i_11, i_23, i_12, ints_17[i_19], ints_18[i_19], bytebuffer_10, bytebuffer_20);
                                                ++i_19;
                                                method12175(i_13, i_11, i_23, i_12, ints_17[i_19], ints_18[i_19], bytebuffer_10, bytebuffer_20);
                                                ++i_19;
                                                method12175(i_13, i_11, i_23, i_12, ints_17[i_19], ints_18[i_19], bytebuffer_10, bytebuffer_20);
                                                ++i_19;
                                            } else {
                                                i_19 += 3;
                                            }
                                        }
                                    }
                                }
                            }
                        }

                        ++i_8;
                        ++i_13;
                    }
                } else {
                    i_8 += anInt7527 - anInt7531;
                }

                ++i_11;
            }

            anInterface32_7523 = aGraphicalRenderer_Sub2_7533.method13993(false);
            anInterface32_7523.method208(anInt7532);
            anInterface4_7525 = aGraphicalRenderer_Sub2_7533.method13994(false);
            anInterface4_7525.method31(anInt7530 * 16, 16);
            anInterface4_7525.method42(0, bytebuffer_20.position(), aGraphicalRenderer_Sub2_7533.aLong8695);
            anInterface32_7523.method42(0, bytebuffer_10.position(), aGraphicalRenderer_Sub2_7533.aLong8695 + 2097152L);
        } else {
            anInterface4_7525 = null;
            anInterface32_7523 = null;
        }

        aClass453_7537 = null;
        aFloatArrayArray7536 = null;
        aFloatArrayArray7535 = null;
        aFloatArrayArray7534 = null;
    }

    void method12175(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, ByteBuffer bytebuffer_7, ByteBuffer bytebuffer_8) {
        long long_9 = -1L;
        int i_11 = i_5 + (i_3 << aGround_Sub1_7524.tileScale);
        int i_12 = (i_4 << aGround_Sub1_7524.tileScale) + i_6;
        int i_13 = aGround_Sub1_7524.averageHeight(i_11, i_12);
        if ((i_5 & 0x7f) == 0 || (i_6 & 0x7f) == 0) {
            long_9 = (i_12 & 0xffffL) << 16 | i_11 & 0xffffL;
            Node node_31 = aClass453_7537.get(long_9);
            if (node_31 != null) {
                bytebuffer_7.putShort(((Node_Sub46) node_31).aShort8067);
                return;
            }
        }

        short s_14 = (short) (anInt7530++);
        if (long_9 != -1L) {
            aClass453_7537.put(new Node_Sub46(s_14), long_9);
        }

        float f_15;
        float f_16;
        float f_17;
        float f_18;
        float f_19;
        float f_20;
        float f_21;
        float f_22;
        float f_23;
        float f_24;
        float f_25;
        if (i_5 == 0 && i_6 == 0) {
            f_15 = aFloatArrayArray7534[i_1][i_2];
            f_16 = aFloatArrayArray7535[i_1][i_2];
            f_17 = aFloatArrayArray7536[i_1][i_2];
        } else if (i_5 == aGround_Sub1_7524.tileUnits && i_6 == 0) {
            f_15 = aFloatArrayArray7534[i_1 + 1][i_2];
            f_16 = aFloatArrayArray7535[i_1 + 1][i_2];
            f_17 = aFloatArrayArray7536[i_1 + 1][i_2];
        } else if (i_5 == aGround_Sub1_7524.tileUnits && aGround_Sub1_7524.tileUnits == i_6) {
            f_15 = aFloatArrayArray7534[i_1 + 1][i_2 + 1];
            f_16 = aFloatArrayArray7535[i_1 + 1][i_2 + 1];
            f_17 = aFloatArrayArray7536[i_1 + 1][i_2 + 1];
        } else if (i_5 == 0 && aGround_Sub1_7524.tileUnits == i_6) {
            f_15 = aFloatArrayArray7534[i_1][i_2 + 1];
            f_16 = aFloatArrayArray7535[i_1][i_2 + 1];
            f_17 = aFloatArrayArray7536[i_1][i_2 + 1];
        } else {
            f_18 = (float) i_5 / aGround_Sub1_7524.tileUnits;
            f_19 = (float) i_6 / aGround_Sub1_7524.tileUnits;
            f_20 = aFloatArrayArray7534[i_1][i_2];
            f_21 = aFloatArrayArray7535[i_1][i_2];
            f_22 = aFloatArrayArray7536[i_1][i_2];
            f_23 = aFloatArrayArray7534[i_1 + 1][i_2];
            f_24 = aFloatArrayArray7535[i_1 + 1][i_2];
            f_25 = aFloatArrayArray7536[i_1 + 1][i_2];
            f_20 += (aFloatArrayArray7534[i_1][i_2 + 1] - f_20) * f_18;
            f_21 += (aFloatArrayArray7535[i_1][i_2 + 1] - f_21) * f_18;
            f_22 += (aFloatArrayArray7536[i_1][i_2 + 1] - f_22) * f_18;
            f_23 += (aFloatArrayArray7534[i_1 + 1][i_2 + 1] - f_23) * f_18;
            f_24 += (aFloatArrayArray7535[i_1 + 1][i_2 + 1] - f_24) * f_18;
            f_25 += (aFloatArrayArray7536[i_1 + 1][i_2 + 1] - f_25) * f_18;
            f_15 = f_20 + (f_23 - f_20) * f_19;
            f_16 = f_21 + (f_24 - f_21) * f_19;
            f_17 = f_22 + (f_25 - f_22) * f_19;
        }

        f_18 = (aNode_Sub24_7528.method12368() - i_11);
        f_19 = (aNode_Sub24_7528.method12369() - i_13);
        f_20 = (aNode_Sub24_7528.method12394() - i_12);
        f_21 = (float) Math.sqrt(f_18 * f_18 + f_19 * f_19 + f_20 * f_20);
        f_22 = 1.0F / f_21;
        f_18 *= f_22;
        f_19 *= f_22;
        f_20 *= f_22;
        f_23 = f_21 / aNode_Sub24_7528.method12370();
        f_24 = 1.0F - f_23 * f_23;
        if (f_24 < 0.0F) {
            f_24 = 0.0F;
        }

        f_25 = f_18 * f_15 + f_19 * f_16 + f_20 * f_17;
        if (f_25 < 0.0F) {
            f_25 = 0.0F;
        }

        float f_26 = f_25 * f_24 * 2.0F;
        if (f_26 > 1.0F) {
            f_26 = 1.0F;
        }

        int i_27 = aNode_Sub24_7528.method12371();
        int i_28 = (int) (f_26 * (i_27 >> 16 & 0xff));
        if (i_28 > 255) {
            i_28 = 255;
        }

        int i_29 = (int) (f_26 * (i_27 >> 8 & 0xff));
        if (i_29 > 255) {
            i_29 = 255;
        }

        int i_30 = (int) (f_26 * (i_27 & 0xff));
        if (i_30 > 255) {
            i_30 = 255;
        }

        bytebuffer_8.putFloat(i_11);
        bytebuffer_8.putFloat(i_13);
        bytebuffer_8.putFloat(i_12);
        if (aGraphicalRenderer_Sub2_7533.anInt8824 == 0) {
            bytebuffer_8.put((byte) i_30);
            bytebuffer_8.put((byte) i_29);
            bytebuffer_8.put((byte) i_28);
        } else {
            bytebuffer_8.put((byte) i_28);
            bytebuffer_8.put((byte) i_29);
            bytebuffer_8.put((byte) i_30);
        }

        bytebuffer_8.put((byte) -1);
        bytebuffer_7.putShort(s_14);
    }

}
