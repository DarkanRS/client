package com.jagex;

public class MaterialProp9 extends MaterialProperty {

    boolean aBool9878 = true;
    boolean aBool9875 = true;

    public MaterialProp9() {
        super(1, false);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int[] ints_4 = method12317(0, aBool9875 ? Class316.anInt3673 - i_1 : i_1);
            if (aBool9878) {
                for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
                    ints_3[i_5] = ints_4[Class316.anInt3669 - i_5];
                }
            } else {
                Class503.method8362(ints_4, 0, ints_3, 0, Class316.anInt3670);
            }
        }
        return ints_3;
    }

    @Override
    int[][] getPixels(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[][] ints_4 = method12333(0, aBool9875 ? Class316.anInt3673 - i_1 : i_1);
            int[] ints_5 = ints_4[0];
            int[] ints_6 = ints_4[1];
            int[] ints_7 = ints_4[2];
            int[] ints_8 = ints_3[0];
            int[] ints_9 = ints_3[1];
            int[] ints_10 = ints_3[2];
            int i_11;
            if (aBool9878) {
                for (i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
                    ints_8[i_11] = ints_5[Class316.anInt3669 - i_11];
                    ints_9[i_11] = ints_6[Class316.anInt3669 - i_11];
                    ints_10[i_11] = ints_7[Class316.anInt3669 - i_11];
                }
            } else {
                for (i_11 = 0; i_11 < Class316.anInt3670; i_11++) {
                    ints_8[i_11] = ints_5[i_11];
                    ints_9[i_11] = ints_6[i_11];
                    ints_10[i_11] = ints_7[i_11];
                }
            }
        }
        return ints_3;
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                aBool9878 = rsbytebuffer_2.readUnsignedByte() == 1;
                break;
            case 1:
                aBool9875 = rsbytebuffer_2.readUnsignedByte() == 1;
                break;
            case 2:
                aBool7669 = rsbytebuffer_2.readUnsignedByte() == 1;
        }
    }
}
