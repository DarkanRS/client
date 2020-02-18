package com.jagex;

public class Class152_Sub1_Sub1 extends Class152_Sub1 {

    static int[] anIntArray10082 = new int[6];
    static int[][] anIntArrayArray10076 = new int[6][];
    Class137_Sub2 aClass137_Sub2_10077;
    OpenGLHardwareRenderer aGraphicalRenderer_Sub1_10079;
    int anInt10080;
    int anInt10085;
    int anInt10078;
    int anInt10083;
    int anInt10081;
    int anInt10084;

    Class152_Sub1_Sub1(OpenGLHardwareRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        aGraphicalRenderer_Sub1_10079 = class505_sub1_1;
        anInt10080 = i_4;
        anInt10085 = i_5;
        anInt10078 = i_6;
        anInt10083 = i_7;
        anInt10081 = i_2;
        anInt10084 = i_3;
    }

    @Override
    Class137_Sub2 method13519() {
        if (aClass137_Sub2_10077 == null) {
            Interface22 interface22_1 = aGraphicalRenderer_Sub1_10079.anInterface22_5834;
            anIntArray10082[0] = anInt10081;
            anIntArray10082[1] = anInt10084;
            anIntArray10082[2] = anInt10080;
            anIntArray10082[3] = anInt10085;
            anIntArray10082[4] = anInt10078;
            anIntArray10082[5] = anInt10083;
            boolean bool_2 = false;
            int i_3 = 0;

            int i_4;
            for (i_4 = 0; i_4 < 6; i_4++) {
                if (!interface22_1.method139(anIntArray10082[i_4])) {
                    return null;
                }

                TextureDetails class169_5 = interface22_1.method144(anIntArray10082[i_4]);
                int i_6 = class169_5.isHalfSize ? 64 : 128;
                if (i_6 > i_3) {
                    i_3 = i_6;
                }

                if (class169_5.useMipmaps > 0) {
                    bool_2 = true;
                }
            }

            for (i_4 = 0; i_4 < 6; i_4++) {
                anIntArrayArray10076[i_4] = interface22_1.method140(anIntArray10082[i_4], 1.0F, i_3, i_3, false);
            }

            aClass137_Sub2_10077 = new Class137_Sub2(aGraphicalRenderer_Sub1_10079, Class150.aClass150_1950, Class76.aClass76_751, i_3, bool_2, anIntArrayArray10076);
        }

        return aClass137_Sub2_10077;
    }

    @Override
    Class137_Sub2 method13520() {
        if (aClass137_Sub2_10077 == null) {
            Interface22 interface22_1 = aGraphicalRenderer_Sub1_10079.anInterface22_5834;
            anIntArray10082[0] = anInt10081;
            anIntArray10082[1] = anInt10084;
            anIntArray10082[2] = anInt10080;
            anIntArray10082[3] = anInt10085;
            anIntArray10082[4] = anInt10078;
            anIntArray10082[5] = anInt10083;
            boolean bool_2 = false;
            int i_3 = 0;

            int i_4;
            for (i_4 = 0; i_4 < 6; i_4++) {
                if (!interface22_1.method139(anIntArray10082[i_4])) {
                    return null;
                }

                TextureDetails class169_5 = interface22_1.method144(anIntArray10082[i_4]);
                int i_6 = class169_5.isHalfSize ? 64 : 128;
                if (i_6 > i_3) {
                    i_3 = i_6;
                }

                if (class169_5.useMipmaps > 0) {
                    bool_2 = true;
                }
            }

            for (i_4 = 0; i_4 < 6; i_4++) {
                anIntArrayArray10076[i_4] = interface22_1.method140(anIntArray10082[i_4], 1.0F, i_3, i_3, false);
            }

            aClass137_Sub2_10077 = new Class137_Sub2(aGraphicalRenderer_Sub1_10079, Class150.aClass150_1950, Class76.aClass76_751, i_3, bool_2, anIntArrayArray10076);
        }

        return aClass137_Sub2_10077;
    }

    @Override
    Class137_Sub2 method13521() {
        if (aClass137_Sub2_10077 == null) {
            Interface22 interface22_1 = aGraphicalRenderer_Sub1_10079.anInterface22_5834;
            anIntArray10082[0] = anInt10081;
            anIntArray10082[1] = anInt10084;
            anIntArray10082[2] = anInt10080;
            anIntArray10082[3] = anInt10085;
            anIntArray10082[4] = anInt10078;
            anIntArray10082[5] = anInt10083;
            boolean bool_2 = false;
            int i_3 = 0;

            int i_4;
            for (i_4 = 0; i_4 < 6; i_4++) {
                if (!interface22_1.method139(anIntArray10082[i_4])) {
                    return null;
                }

                TextureDetails class169_5 = interface22_1.method144(anIntArray10082[i_4]);
                int i_6 = class169_5.isHalfSize ? 64 : 128;
                if (i_6 > i_3) {
                    i_3 = i_6;
                }

                if (class169_5.useMipmaps > 0) {
                    bool_2 = true;
                }
            }

            for (i_4 = 0; i_4 < 6; i_4++) {
                anIntArrayArray10076[i_4] = interface22_1.method140(anIntArray10082[i_4], 1.0F, i_3, i_3, false);
            }

            aClass137_Sub2_10077 = new Class137_Sub2(aGraphicalRenderer_Sub1_10079, Class150.aClass150_1950, Class76.aClass76_751, i_3, bool_2, anIntArrayArray10076);
        }

        return aClass137_Sub2_10077;
    }

}
