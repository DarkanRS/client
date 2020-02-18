package com.jagex;

public class Node_Sub20_Sub29 extends Node_Sub20 {

    public static int anInt9913 = -1;
    int[] anIntArray9916;
    int anInt9914;
    int anInt9915;
    int anInt9912 = -1;

    public Node_Sub20_Sub29() {
        super(0, false);
    }

    @Override
    void method12326() {
        super.method12326();
        anIntArray9916 = null;
    }

    boolean method15398() {
        if (anIntArray9916 != null) {
            return true;
        } else if (anInt9912 >= 0) {
            SpriteDefinitions class91_2 = anInt9913 >= 0 ? SpriteDefinitions.getSprite(Class532_Sub2.CURR_SPRITE_INDEX, anInt9913, anInt9912) : SpriteDefinitions.method1515(Class532_Sub2.CURR_SPRITE_INDEX, anInt9912);
            class91_2.method1523();
            anIntArray9916 = class91_2.method1528();
            anInt9914 = class91_2.width;
            anInt9915 = class91_2.height;
            return true;
        } else {
            return false;
        }
    }

    @Override
    void method12322(int i_1, Packet rsbytebuffer_2) {
        if (i_1 == 0) {
            anInt9912 = rsbytebuffer_2.readUnsignedShort();
        }

    }

    @Override
    int method12323() {
        return anInt9912;
    }

    @Override
    int[][] method12320(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619 && method15398()) {
            int[] ints_4 = ints_3[0];
            int[] ints_5 = ints_3[1];
            int[] ints_6 = ints_3[2];
            int i_7 = (anInt9915 != Class316.anInt3671 ? anInt9915 * i_1 / Class316.anInt3671 : i_1) * anInt9914;
            int i_8;
            int i_9;
            if (anInt9914 == Class316.anInt3670) {
                for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                    i_9 = anIntArray9916[i_7++];
                    ints_6[i_8] = (i_9 & 0xff) << 4;
                    ints_5[i_8] = (i_9 & 0xff00) >> 4;
                    ints_4[i_8] = (i_9 & 0xff0000) >> 12;
                }
            } else {
                for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                    i_9 = i_8 * anInt9914 / Class316.anInt3670;
                    int i_10 = anIntArray9916[i_7 + i_9];
                    ints_6[i_8] = (i_10 & 0xff) << 4;
                    ints_5[i_8] = (i_10 & 0xff00) >> 4;
                    ints_4[i_8] = (i_10 & 0xff0000) >> 12;
                }
            }
        }

        return ints_3;
    }

}
