package com.jagex;

public class MaterialProp29 extends MaterialProperty {

    Class149[] aClass149Array9862;

    public MaterialProp29() {
        super(0, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            method15372(aClass320_7667.method5722());
        }
        return ints_3;
    }

    @Override
    int[][] getPixels(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int i_4 = Class316.anInt3670;
            int i_5 = Class316.anInt3671;
            int[][] ints_6 = new int[i_5][i_4];
            int[][][] ints_7 = aClass308_7670.method5464();
            method15372(ints_6);
            for (int i_8 = 0; i_8 < Class316.anInt3671; i_8++) {
                int[] ints_9 = ints_6[i_8];
                int[][] ints_10 = ints_7[i_8];
                int[] ints_11 = ints_10[0];
                int[] ints_12 = ints_10[1];
                int[] ints_13 = ints_10[2];
                for (int i_14 = 0; i_14 < Class316.anInt3670; i_14++) {
                    int i_15 = ints_9[i_14];
                    ints_13[i_14] = (i_15 & 0xff) << 4;
                    ints_12[i_14] = (i_15 & 0xff00) >> 4;
                    ints_11[i_14] = (i_15 & 0xff0000) >> 12;
                }
            }
        }
        return ints_3;
    }

    void method15372(int[][] ints_1) {
        int i_3 = Class316.anInt3670;
        int i_4 = Class316.anInt3671;
        ClanVarSettingsIndexLoader.method3936(ints_1);
        WallDecoration.method16086(Class316.anInt3669, Class316.anInt3673);
        if (aClass149Array9862 != null) {
            for (int i_5 = 0; i_5 < aClass149Array9862.length; i_5++) {
                Class149 class149_6 = aClass149Array9862[i_5];
                int i_7 = class149_6.anInt1743;
                int i_8 = class149_6.anInt1741;
                if (i_7 >= 0) {
                    if (i_8 >= 0) {
                        class149_6.method2557(i_3, i_4);
                    } else {
                        class149_6.method2556(i_3, i_4);
                    }
                } else if (i_8 >= 0) {
                    class149_6.method2561(i_3, i_4);
                }
            }
        }
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        if (i_1 == 0) {
            aClass149Array9862 = new Class149[rsbytebuffer_2.readUnsignedByte()];
            for (int i_4 = 0; i_4 < aClass149Array9862.length; i_4++) {
                int i_5 = rsbytebuffer_2.readUnsignedByte();
                switch (i_5) {
                    case 0:
                        aClass149Array9862[i_4] = QuestIndexLoader.method4165(rsbytebuffer_2);
                        break;
                    case 1:
                        aClass149Array9862[i_4] = Class514.method8842(rsbytebuffer_2);
                        break;
                    case 2:
                        aClass149Array9862[i_4] = SoftwareItemRender.method7033(rsbytebuffer_2);
                        break;
                    case 3:
                        aClass149Array9862[i_4] = Animation.method7644(rsbytebuffer_2);
                }
            }
        } else if (i_1 == 1) {
            noPalette = rsbytebuffer_2.readUnsignedByte() == 1;
        }
    }
}
