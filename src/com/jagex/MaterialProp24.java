package com.jagex;

public class MaterialProp24 extends MaterialProperty {

    public MaterialProp24() {
        super(1, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int[][] ints_4 = method12333(0, i_1);
            int[] ints_5 = ints_4[0];
            int[] ints_6 = ints_4[1];
            int[] ints_7 = ints_4[2];
            for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                ints_3[i_8] = (ints_7[i_8] + ints_6[i_8] + ints_5[i_8]) / 3;
            }
        }
        return ints_3;
    }
}
