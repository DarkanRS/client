package com.jagex;

public class MaterialProp18 extends MaterialPropSprite {

    @Override
    int[][] getPixels(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619 && method15398()) {
            int[] ints_4 = ints_3[0];
            int[] ints_5 = ints_3[1];
            int[] ints_6 = ints_3[2];
            int i_7 = i_1 % height * height;

            for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                int i_9 = pixels[i_8 % width + i_7];
                ints_6[i_8] = (i_9 & 0xff) << 4;
                ints_5[i_8] = (i_9 & 0xff00) >> 4;
                ints_4[i_8] = (i_9 & 0xff0000) >> 12;
            }
        }

        return ints_3;
    }

}
