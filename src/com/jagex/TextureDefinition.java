package com.jagex;

import java.io.FileOutputStream;

public class TextureDefinition extends CacheableNode {

    static FileOutputStream aFileOutputStream9481;
    static double aDouble9479 = -1.0D;
    static int[] anIntArray9474 = new int[256];
    Node_Sub20[] aNode_Sub20Array9478;
    int[] anIntArray9475;
    int[] anIntArray9473;
    Node_Sub20 aNode_Sub20_9476;
    Node_Sub20 aNode_Sub20_9477;
    Node_Sub20 aNode_Sub20_9480;

    boolean method14717(Index index_1, Interface22 interface22_2, int i_3) {
        int i_4;
        if (Node_Sub20_Sub29.anInt9913 >= 0) {
            for (i_4 = 0; i_4 < this.anIntArray9475.length; i_4++) {
                if (!index_1.load(Node_Sub20_Sub29.anInt9913, this.anIntArray9475[i_4])) {
                    return false;
                }
            }
        } else {
            for (i_4 = 0; i_4 < this.anIntArray9475.length; i_4++) {
                if (!index_1.loadFile(this.anIntArray9475[i_4])) {
                    return false;
                }
            }
        }

        for (i_4 = 0; i_4 < this.anIntArray9473.length; i_4++) {
            if (!interface22_2.method139(this.anIntArray9473[i_4], -324994004)) {
                return false;
            }
        }

        return true;
    }

    int[] method14718(Index index_1, Interface22 interface22_2, double d_3, int i_5, int i_6, boolean bool_7, boolean bool_8, int i_9) {
        Class532_Sub2.CURR_SPRITE_INDEX = index_1;
        Class532_Sub1.anInterface22_7922 = interface22_2;

        for (int i_10 = 0; i_10 < this.aNode_Sub20Array9478.length; i_10++) {
            this.aNode_Sub20Array9478[i_10].method12315(i_5, i_6, (byte) 60);
        }

        SoftCache.method3895(d_3);
        Class316.method5593(i_5, i_6, 1422267205);
        int[] ints_24 = new int[i_5 * i_6];
        int i_11;
        int i_12;
        byte b_13;
        if (bool_7) {
            i_11 = i_5 - 1;
            i_12 = -1;
            b_13 = -1;
        } else {
            i_11 = 0;
            i_12 = i_5;
            b_13 = 1;
        }

        int i_14 = 0;

        int i_15;
        for (i_15 = 0; i_15 < i_6; i_15++) {
            int[] ints_16;
            int[] ints_17;
            int[] ints_18;
            if (this.aNode_Sub20_9476.aBool7669) {
                int[] ints_19 = this.aNode_Sub20_9476.method12319(i_15);
                ints_16 = ints_19;
                ints_17 = ints_19;
                ints_18 = ints_19;
            } else {
                int[][] ints_26 = this.aNode_Sub20_9476.method12320(i_15, 1981543466);
                ints_16 = ints_26[0];
                ints_17 = ints_26[1];
                ints_18 = ints_26[2];
            }

            if (bool_8) {
                i_14 = i_15;
            }

            for (int i_25 = i_11; i_25 != i_12; i_25 += b_13) {
                int i_20 = ints_16[i_25] >> 4;
                if (i_20 > 255) {
                    i_20 = 255;
                }

                if (i_20 < 0) {
                    i_20 = 0;
                }

                int i_21 = ints_17[i_25] >> 4;
                if (i_21 > 255) {
                    i_21 = 255;
                }

                if (i_21 < 0) {
                    i_21 = 0;
                }

                int i_22 = ints_18[i_25] >> 4;
                if (i_22 > 255) {
                    i_22 = 255;
                }

                if (i_22 < 0) {
                    i_22 = 0;
                }

                i_20 = anIntArray9474[i_20];
                i_21 = anIntArray9474[i_21];
                i_22 = anIntArray9474[i_22];
                int i_23 = i_22 + (i_21 << 8) + (i_20 << 16);
                if (i_23 != 0) {
                    i_23 |= ~0xffffff;
                }

                ints_24[i_14++] = i_23;
                if (bool_8) {
                    i_14 += i_5 - 1;
                }
            }
        }

        for (i_15 = 0; i_15 < this.aNode_Sub20Array9478.length; i_15++) {
            this.aNode_Sub20Array9478[i_15].method12326();
        }

        return ints_24;
    }

    int[] method14719(Index index_1, Interface22 interface22_2, double d_3, int i_5, int i_6, boolean bool_7, byte b_8) {
        Class532_Sub2.CURR_SPRITE_INDEX = index_1;
        Class532_Sub1.anInterface22_7922 = interface22_2;

        for (int i_9 = 0; i_9 < this.aNode_Sub20Array9478.length; i_9++) {
            this.aNode_Sub20Array9478[i_9].method12315(i_5, i_6, (byte) 116);
        }

        SoftCache.method3895(d_3);
        Class316.method5593(i_5, i_6, 1384434405);
        int[] ints_21 = new int[i_5 * i_6];
        int i_10 = 0;

        int i_11;
        for (i_11 = 0; i_11 < i_6; i_11++) {
            int[] ints_12;
            int[] ints_13;
            int[] ints_14;
            int[] ints_15;
            if (this.aNode_Sub20_9476.aBool7669) {
                ints_15 = this.aNode_Sub20_9476.method12319(i_11);
                ints_12 = ints_15;
                ints_13 = ints_15;
                ints_14 = ints_15;
            } else {
                int[][] ints_22 = this.aNode_Sub20_9476.method12320(i_11, -1291616356);
                ints_12 = ints_22[0];
                ints_13 = ints_22[1];
                ints_14 = ints_22[2];
            }

            if (this.aNode_Sub20_9477.aBool7669) {
                ints_15 = this.aNode_Sub20_9477.method12319(i_11);
            } else {
                ints_15 = this.aNode_Sub20_9477.method12320(i_11, 1766478944)[0];
            }

            if (bool_7) {
                i_10 = i_11;
            }

            for (int i_16 = i_5 - 1; i_16 >= 0; --i_16) {
                int i_17 = ints_12[i_16] >> 4;
                if (i_17 > 255) {
                    i_17 = 255;
                }

                if (i_17 < 0) {
                    i_17 = 0;
                }

                int i_18 = ints_13[i_16] >> 4;
                if (i_18 > 255) {
                    i_18 = 255;
                }

                if (i_18 < 0) {
                    i_18 = 0;
                }

                int i_19 = ints_14[i_16] >> 4;
                if (i_19 > 255) {
                    i_19 = 255;
                }

                if (i_19 < 0) {
                    i_19 = 0;
                }

                i_17 = anIntArray9474[i_17];
                i_18 = anIntArray9474[i_18];
                i_19 = anIntArray9474[i_19];
                int i_20;
                if (i_17 == 0 && i_18 == 0 && i_19 == 0) {
                    i_20 = 0;
                } else {
                    i_20 = ints_15[i_16] >> 4;
                    if (i_20 > 255) {
                        i_20 = 255;
                    }

                    if (i_20 < 0) {
                        i_20 = 0;
                    }
                }

                ints_21[i_10++] = i_19 + (i_18 << 8) + (i_20 << 24) + (i_17 << 16);
                if (bool_7) {
                    i_10 += i_5 - 1;
                }
            }
        }

        for (i_11 = 0; i_11 < this.aNode_Sub20Array9478.length; i_11++) {
            this.aNode_Sub20Array9478[i_11].method12326();
        }

        return ints_21;
    }

    TextureDefinition(RsByteBuffer rsbytebuffer_1) {
        int i_2 = rsbytebuffer_1.readUnsignedByte();
        int i_3 = 0;
        int i_4 = 0;
        int[][] ints_5 = new int[i_2][];
        this.aNode_Sub20Array9478 = new Node_Sub20[i_2];

        int i_6;
        Node_Sub20 class282_sub20_7;
        int i_8;
        int i_9;
        for (i_6 = 0; i_6 < i_2; i_6++) {
            class282_sub20_7 = Class278.method4963(rsbytebuffer_1);
            if (class282_sub20_7.method12323() >= 0) {
                ++i_3;
            }

            if (class282_sub20_7.method12324((byte) 44) >= 0) {
                ++i_4;
            }

            i_8 = class282_sub20_7.aNode_Sub20Array7671.length;
            ints_5[i_6] = new int[i_8];

            for (i_9 = 0; i_9 < i_8; i_9++) {
                ints_5[i_6][i_9] = rsbytebuffer_1.readUnsignedByte();
            }

            this.aNode_Sub20Array9478[i_6] = class282_sub20_7;
        }

        this.anIntArray9475 = new int[i_3];
        i_3 = 0;
        this.anIntArray9473 = new int[i_4];
        i_4 = 0;

        for (i_6 = 0; i_6 < i_2; i_6++) {
            class282_sub20_7 = this.aNode_Sub20Array9478[i_6];
            i_8 = class282_sub20_7.aNode_Sub20Array7671.length;

            for (i_9 = 0; i_9 < i_8; i_9++) {
                class282_sub20_7.aNode_Sub20Array7671[i_9] = this.aNode_Sub20Array9478[ints_5[i_6][i_9]];
            }

            i_9 = class282_sub20_7.method12323();
            int i_10 = class282_sub20_7.method12324((byte) 117);
            if (i_9 > 0) {
                this.anIntArray9475[i_3++] = i_9;
            }

            if (i_10 > 0) {
                this.anIntArray9473[i_4++] = i_10;
            }

            ints_5[i_6] = null;
        }

        this.aNode_Sub20_9476 = this.aNode_Sub20Array9478[rsbytebuffer_1.readUnsignedByte()];
        this.aNode_Sub20_9477 = this.aNode_Sub20Array9478[rsbytebuffer_1.readUnsignedByte()];
        this.aNode_Sub20_9480 = this.aNode_Sub20Array9478[rsbytebuffer_1.readUnsignedByte()];
        Object obj_11 = null;
    }

    float[] method14723(Index index_1, Interface22 interface22_2, int i_3, int i_4, boolean bool_5) {
        Class532_Sub2.CURR_SPRITE_INDEX = index_1;
        Class532_Sub1.anInterface22_7922 = interface22_2;

        for (int i_7 = 0; i_7 < this.aNode_Sub20Array9478.length; i_7++) {
            this.aNode_Sub20Array9478[i_7].method12315(i_3, i_4, (byte) 59);
        }

        Class316.method5593(i_3, i_4, -315322197);
        float[] floats_18 = new float[i_3 * i_4 * 4];
        int i_8 = 0;

        int i_9;
        for (i_9 = 0; i_9 < i_4; i_9++) {
            int[] ints_10;
            int[] ints_11;
            int[] ints_12;
            int[] ints_13;
            if (this.aNode_Sub20_9476.aBool7669) {
                ints_13 = this.aNode_Sub20_9476.method12319(i_9);
                ints_10 = ints_13;
                ints_11 = ints_13;
                ints_12 = ints_13;
            } else {
                int[][] ints_19 = this.aNode_Sub20_9476.method12320(i_9, 1271694305);
                ints_10 = ints_19[0];
                ints_11 = ints_19[1];
                ints_12 = ints_19[2];
            }

            if (this.aNode_Sub20_9477.aBool7669) {
                ints_13 = this.aNode_Sub20_9477.method12319(i_9);
            } else {
                ints_13 = this.aNode_Sub20_9477.method12320(i_9, -1071831227)[0];
            }

            int[] ints_14;
            if (this.aNode_Sub20_9480.aBool7669) {
                ints_14 = this.aNode_Sub20_9480.method12319(i_9);
            } else {
                ints_14 = this.aNode_Sub20_9480.method12320(i_9, -1302016809)[0];
            }

            if (bool_5) {
                i_8 = i_9 << 2;
            }

            for (int i_15 = i_3 - 1; i_15 >= 0; --i_15) {
                float f_16 = (float) ints_13[i_15] / 4096.0F;
                float f_17 = (1.0F + (float) ints_14[i_15] * 31.0F / 4096.0F) / 4096.0F;
                if (f_16 < 0.0F) {
                    f_16 = 0.0F;
                } else if (f_16 > 1.0F) {
                    f_16 = 1.0F;
                }

                floats_18[i_8++] = (float) ints_10[i_15] * f_17;
                floats_18[i_8++] = f_17 * (float) ints_11[i_15];
                floats_18[i_8++] = (float) ints_12[i_15] * f_17;
                floats_18[i_8++] = f_16;
                if (bool_5) {
                    i_8 += (i_3 << 2) - 4;
                }
            }
        }

        for (i_9 = 0; i_9 < this.aNode_Sub20Array9478.length; i_9++) {
            this.aNode_Sub20Array9478[i_9].method12326();
        }

        return floats_18;
    }

}
