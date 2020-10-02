package com.jagex;

public class MaterialProp33 extends MaterialProperty {

    boolean aBool9974 = true;
    int anInt9975 = 4096;

    public MaterialProp33() {
        super(1, false);
    }

    public static void method15418() {
        VorbisFileReference.method13449();
        Class253.method4330(Class393.preferences.monoStereo.method12691() == 1);
        Class320.aClass253_3723 = Class253.method4331(0, 22050);
        Class42_Sub1.method14563(MaterialProp8.method15262(null));
        ShaderDecoder.aClass253_1008 = Class253.method4331(1, 2048);
        ShaderDecoder.aClass253_1008.method4329(Class79.aNode_Sub15_Sub4_783);
    }

    public static void queryItemNoParams(String name, boolean tradeable) {
        MaterialProp16.queryItemParamInt(name, tradeable, -1, -1);
    }

    public static void method15420() {
        try {
            int i_1;
            if (Class148.anInt1730 == 1) {
                i_1 = Class148.aNode_Sub15_Sub2_1735.method15123();
                if (i_1 > 0 && Class148.aNode_Sub15_Sub2_1735.method15103()) {
                    i_1 -= CutsceneAction_Sub22.anInt9440;
                    if (i_1 < 0) {
                        i_1 = 0;
                    }
                    Class148.aNode_Sub15_Sub2_1735.setVolume(i_1);
                    return;
                }
                Class148.aNode_Sub15_Sub2_1735.method15101();
                Class148.aNode_Sub15_Sub2_1735.method15097();
                if (CutsceneEntity.aClass317_746 != null) {
                    Class148.anInt1730 = 2;
                } else {
                    Class148.anInt1730 = 0;
                }
                Node_Sub44_Sub3.aNode_Sub7_9563 = null;
                Class454.aClass250_5450 = null;
            }
            if (Class148.anInt1730 == 3) {
                i_1 = Class148.aNode_Sub15_Sub2_1735.method15123();
                if (i_1 < Class158_Sub2_Sub3.anInt10243 && Class148.aNode_Sub15_Sub2_1735.method15103()) {
                    i_1 += Class383.anInt4664;
                    if (i_1 > Class158_Sub2_Sub3.anInt10243) {
                        i_1 = Class158_Sub2_Sub3.anInt10243;
                    }
                    Class148.aNode_Sub15_Sub2_1735.setVolume(i_1);
                } else {
                    Class383.anInt4664 = 0;
                    Class148.anInt1730 = 0;
                }
            }
        } catch (Exception exception_3) {
            exception_3.printStackTrace();
            Class148.aNode_Sub15_Sub2_1735.method15101();
            Class332.method5929();
        }
    }

    @Override
    int[][] getPixels(int i_1) {
        int[][] ints_3 = aClass308_7670.method5463(i_1);
        if (aClass308_7670.aBool3619) {
            int[] ints_4 = method12317(0, i_1 - 1 & Class316.anInt3673);
            int[] ints_5 = method12317(0, i_1);
            int[] ints_6 = method12317(0, i_1 + 1 & Class316.anInt3673);
            int[] ints_7 = ints_3[0];
            int[] ints_8 = ints_3[1];
            int[] ints_9 = ints_3[2];
            for (int i_10 = 0; i_10 < Class316.anInt3670; i_10++) {
                int i_11 = (ints_6[i_10] - ints_4[i_10]) * anInt9975;
                int i_12 = (ints_5[i_10 + 1 & Class316.anInt3669] - ints_5[i_10 - 1 & Class316.anInt3669]) * anInt9975;
                int i_13 = i_12 >> 12;
                int i_14 = i_11 >> 12;
                int i_15 = i_13 * i_13 >> 12;
                int i_16 = i_14 * i_14 >> 12;
                int i_17 = (int) (Math.sqrt((i_15 + i_16 + 4096) / 4096.0F) * 4096.0D);
                int i_18;
                int i_19;
                int i_20;
                if (i_17 != 0) {
                    i_18 = i_12 / i_17;
                    i_19 = i_11 / i_17;
                    i_20 = 16777216 / i_17;
                } else {
                    i_18 = 0;
                    i_19 = 0;
                    i_20 = 0;
                }
                if (aBool9974) {
                    i_18 = (i_18 >> 1) + 2048;
                    i_19 = (i_19 >> 1) + 2048;
                    i_20 = (i_20 >> 1) + 2048;
                }
                ints_7[i_10] = i_18;
                ints_8[i_10] = i_19;
                ints_9[i_10] = i_20;
            }
        }
        return ints_3;
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9975 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 1:
                aBool9974 = rsbytebuffer_2.readUnsignedByte() == 1;
        }
    }
}
