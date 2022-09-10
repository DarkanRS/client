package com.jagex;

import java.util.Random;

public class MaterialProp38 extends MaterialProperty {

    int anInt10009;
    int anInt10013 = 2000;
    int anInt10010 = 16;
    int anInt10004;
    int anInt10011 = 4096;

    public MaterialProp38() {
        super(0, true);
    }

    public static int method15436(int i_0, int i_1, int i_2) {
        i_2 &= 0x3;
        return i_2 == 0 ? i_0 : (i_2 == 1 ? i_1 : (i_2 == 2 ? 4095 - i_0 : 4095 - i_1));
    }

    @Override
    void method12321() {
        Class316.method5586();
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt10009 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 1:
                anInt10013 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 2:
                anInt10010 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 3:
                anInt10004 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 4:
                anInt10011 = rsbytebuffer_2.readUnsignedShort();
        }

    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int i_4 = anInt10011 >> 1;
            int[][] ints_5 = aClass320_7667.method5722();
            Random random_6 = new Random(anInt10009);

            for (int i_7 = 0; i_7 < anInt10013; i_7++) {
                int i_8 = anInt10011 > 0 ? anInt10004 + (ObjectMeshModifier.method7931(random_6, anInt10011) - i_4) : anInt10004;
                i_8 = i_8 >> 4 & 0xff;
                int i_9 = ObjectMeshModifier.method7931(random_6, Class316.anInt3670);
                int i_10 = ObjectMeshModifier.method7931(random_6, Class316.anInt3671);
                int i_11 = i_9 + (Class316.anIntArray3675[i_8] * anInt10010 >> 12);
                int i_12 = i_10 + (Class316.anIntArray3677[i_8] * anInt10010 >> 12);
                int i_13 = i_12 - i_10;
                int i_14 = i_11 - i_9;
                if (i_14 != 0 || i_13 != 0) {
                    if (i_13 < 0) {
                        i_13 = -i_13;
                    }

                    if (i_14 < 0) {
                        i_14 = -i_14;
                    }

                    boolean bool_15 = i_13 > i_14;
                    int i_16;
                    int i_17;
                    if (bool_15) {
                        i_16 = i_9;
                        i_17 = i_11;
                        i_9 = i_10;
                        i_10 = i_16;
                        i_11 = i_12;
                        i_12 = i_17;
                    }

                    if (i_9 > i_11) {
                        i_16 = i_9;
                        i_17 = i_10;
                        i_9 = i_11;
                        i_11 = i_16;
                        i_10 = i_12;
                        i_12 = i_17;
                    }

                    i_16 = i_10;
                    i_17 = i_11 - i_9;
                    int i_18 = i_12 - i_10;
                    int i_19 = -i_17 / 2;
                    int i_20 = 2048 / i_17;
                    int i_21 = 1024 - (ObjectMeshModifier.method7931(random_6, 4096) >> 2);
                    int i_22 = i_10 < i_12 ? 1 : -1;
                    if (i_18 < 0) {
                        i_18 = -i_18;
                    }

                    for (int i_23 = i_9; i_23 < i_11; i_23++) {
                        int i_24 = i_21 + i_20 * (i_23 - i_9) + 1024;
                        int i_25 = i_23 & Class316.anInt3669;
                        int i_26 = i_16 & Class316.anInt3673;
                        if (bool_15) {
                            ints_5[i_26][i_25] = i_24;
                        } else {
                            ints_5[i_25][i_26] = i_24;
                        }

                        i_19 += i_18;
                        if (i_19 > 0) {
                            i_19 -= i_17;
                            i_16 += i_22;
                        }
                    }
                }
            }
        }

        return ints_3;
    }

}
