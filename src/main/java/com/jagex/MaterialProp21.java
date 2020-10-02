package com.jagex;

public class MaterialProp21 extends MaterialProperty {

    public MaterialProp21() {
        super(3, false);
    }

    static void method15411(AbstractRenderer graphicalrenderer_0) {
        if (Class20.aBool161) {
            Class354.method6216(graphicalrenderer_0);
        } else {
            AreadSound.method4800();
        }

    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int[] ints_4 = method12317(0, i_1);
            int[] ints_5 = method12317(1, i_1);
            int[] ints_6 = method12317(2, i_1);

            for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
                int i_8 = ints_6[i_7];
                if (i_8 == 4096) {
                    ints_3[i_7] = ints_4[i_7];
                } else if (i_8 == 0) {
                    ints_3[i_7] = ints_5[i_7];
                } else {
                    ints_3[i_7] = (4096 - i_8) * ints_5[i_7] + i_8 * ints_4[i_7] >> 12;
                }
            }
        }

        return ints_3;
    }

    @Override
    int[][] getPixels(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[] ints_4 = method12317(2, i_1);
            int[][] ints_5 = method12333(0, i_1);
            int[][] ints_6 = method12333(1, i_1);
            int[] ints_7 = ints_3[0];
            int[] ints_8 = ints_3[1];
            int[] ints_9 = ints_3[2];
            int[] ints_10 = ints_5[0];
            int[] ints_11 = ints_5[1];
            int[] ints_12 = ints_5[2];
            int[] ints_13 = ints_6[0];
            int[] ints_14 = ints_6[1];
            int[] ints_15 = ints_6[2];

            for (int i_16 = 0; i_16 < Class316.anInt3670; i_16++) {
                int i_17 = ints_4[i_16];
                if (i_17 == 4096) {
                    ints_7[i_16] = ints_10[i_16];
                    ints_8[i_16] = ints_11[i_16];
                    ints_9[i_16] = ints_12[i_16];
                } else if (i_17 == 0) {
                    ints_7[i_16] = ints_13[i_16];
                    ints_8[i_16] = ints_14[i_16];
                    ints_9[i_16] = ints_15[i_16];
                } else {
                    int i_18 = 4096 - i_17;
                    ints_7[i_16] = i_17 * ints_10[i_16] + i_18 * ints_13[i_16] >> 12;
                    ints_8[i_16] = i_17 * ints_11[i_16] + i_18 * ints_14[i_16] >> 12;
                    ints_9[i_16] = i_17 * ints_12[i_16] + i_18 * ints_15[i_16] >> 12;
                }
            }
        }

        return ints_3;
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        if (i_1 == 0) {
            noPalette = rsbytebuffer_2.readUnsignedByte() == 1;
        }

    }

}
