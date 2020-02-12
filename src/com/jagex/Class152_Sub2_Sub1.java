package com.jagex;

public class Class152_Sub2_Sub1 extends Class152_Sub2 {

    static int[] anIntArray10169 = new int[6];
    static int[][] anIntArrayArray10170 = new int[6][];
    Interface31 anInterface31_10161;
    GraphicalRenderer_Sub2 aGraphicalRenderer_Sub2_10168;
    int anInt10165;
    int anInt10166;
    int anInt10162;
    int anInt10167;
    int anInt10163;
    int anInt10164;

    Interface31 method14242() {
        if (this.anInterface31_10161 == null) {
            Interface22 interface22_1 = this.aGraphicalRenderer_Sub2_10168.anInterface22_5834;
            anIntArray10169[0] = this.anInt10163;
            anIntArray10169[1] = this.anInt10164;
            anIntArray10169[2] = this.anInt10165;
            anIntArray10169[3] = this.anInt10166;
            anIntArray10169[4] = this.anInt10162;
            anIntArray10169[5] = this.anInt10167;
            boolean bool_2 = false;
            int i_3 = 0;

            int i_4;
            for (i_4 = 0; i_4 < 6; i_4++) {
                if (!interface22_1.method139(anIntArray10169[i_4], -1109756376)) {
                    return null;
                }

                TextureDetails class169_5 = interface22_1.method144(anIntArray10169[i_4]);
                int i_6 = class169_5.isHalfSize ? 64 : 128;
                if (i_6 > i_3) {
                    i_3 = i_6;
                }

                if (class169_5.useMipmaps > 0) {
                    bool_2 = true;
                }
            }

            for (i_4 = 0; i_4 < 6; i_4++) {
                anIntArrayArray10170[i_4] = interface22_1.method140(anIntArray10169[i_4], 1.0F, i_3, i_3, false, (byte) 104);
            }

            this.anInterface31_10161 = this.aGraphicalRenderer_Sub2_10168.method14034(i_3, bool_2, anIntArrayArray10170);
        }

        return this.anInterface31_10161;
    }

    Interface31 method14241() {
        if (this.anInterface31_10161 == null) {
            Interface22 interface22_1 = this.aGraphicalRenderer_Sub2_10168.anInterface22_5834;
            anIntArray10169[0] = this.anInt10163;
            anIntArray10169[1] = this.anInt10164;
            anIntArray10169[2] = this.anInt10165;
            anIntArray10169[3] = this.anInt10166;
            anIntArray10169[4] = this.anInt10162;
            anIntArray10169[5] = this.anInt10167;
            boolean bool_2 = false;
            int i_3 = 0;

            int i_4;
            for (i_4 = 0; i_4 < 6; i_4++) {
                if (!interface22_1.method139(anIntArray10169[i_4], -461631490)) {
                    return null;
                }

                TextureDetails class169_5 = interface22_1.method144(anIntArray10169[i_4]);
                int i_6 = class169_5.isHalfSize ? 64 : 128;
                if (i_6 > i_3) {
                    i_3 = i_6;
                }

                if (class169_5.useMipmaps > 0) {
                    bool_2 = true;
                }
            }

            for (i_4 = 0; i_4 < 6; i_4++) {
                anIntArrayArray10170[i_4] = interface22_1.method140(anIntArray10169[i_4], 1.0F, i_3, i_3, false, (byte) 114);
            }

            this.anInterface31_10161 = this.aGraphicalRenderer_Sub2_10168.method14034(i_3, bool_2, anIntArrayArray10170);
        }

        return this.anInterface31_10161;
    }

    Class152_Sub2_Sub1(GraphicalRenderer_Sub2 class505_sub2_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        this.aGraphicalRenderer_Sub2_10168 = class505_sub2_1;
        this.anInt10165 = i_4;
        this.anInt10166 = i_5;
        this.anInt10162 = i_6;
        this.anInt10167 = i_7;
        this.anInt10163 = i_2;
        this.anInt10164 = i_3;
    }

}
