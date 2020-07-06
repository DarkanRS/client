package com.jagex;

public class Class334 {

    static int[] anIntArray3884 = new int[4];
    static MeshRasterizer aMeshRasterizer_3905;
    static NativeSprite aNativeSprite_3912;
    static NativeSprite aNativeSprite_3895;
    int anInt3897;
    int anInt3899;
    NativeSprite aNativeSprite_3910;
    int anInt3902;
    int anInt3911;
    int anInt3896;
    int anInt3889;
    int anInt3890;
    int anInt3891;
    boolean aBool3900;
    int anInt3893;
    int anInt3894;
    int anInt3888;
    int anInt3887;
    int anInt3901;
    int anInt3883;
    int anInt3903;

    public Class334(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, int i_9, int i_10, int i_11) {
        anInt3889 = i_3;
        anInt3890 = i_4;
        anInt3891 = i_5;
        aBool3900 = bool_8;
        anInt3893 = i_2;
        anInt3894 = i_7;
        anInt3888 = i_6;
        anInt3887 = i_1;
        anInt3901 = i_9;
        anInt3883 = i_10;
        anInt3903 = i_11;
    }

    static void method5940() {
        aMeshRasterizer_3905 = null;
        aNativeSprite_3912 = null;
    }

    static void method5943(AbstractRenderer graphicalrenderer_0) {
        if (aMeshRasterizer_3905 == null) {
            RSMesh rsmesh_1 = new RSMesh(580, 1104, 1);
            rsmesh_1.method2664();
            rsmesh_1.method2662(0, 128, 0);
            rsmesh_1.method2662(0, -128, 0);

            for (int i_2 = 0; i_2 <= 24; i_2++) {
                int i_3 = i_2 * 8192 / 24;
                int i_4 = Trig.SINE[i_3];
                int i_5 = Trig.COSINE[i_3];

                int i_6;
                int i_7;
                int i_8;
                int i_9;
                int i_10;
                for (i_6 = 1; i_6 < 24; i_6++) {
                    i_7 = i_6 * 8192 / 24;
                    i_8 = Trig.COSINE[i_7] >> 7;
                    i_9 = Trig.SINE[i_7] * i_4 >> 21;
                    i_10 = Trig.SINE[i_7] * i_5 >> 21;
                    rsmesh_1.method2662(i_10, i_8, -i_9);
                }

                if (i_2 > 0) {
                    i_6 = i_2 * 23 + 2;
                    i_7 = i_6 - 23;
                    rsmesh_1.method2663(0, i_7, i_6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);

                    for (i_8 = 1; i_8 < 23; i_8++) {
                        i_9 = i_7 + 1;
                        i_10 = i_6 + 1;
                        rsmesh_1.method2663(i_7, i_9, i_6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                        rsmesh_1.method2663(i_9, i_10, i_6, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                        i_7 = i_9;
                        i_6 = i_10;
                    }

                    rsmesh_1.method2663(i_6, i_7, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
                }
            }

            rsmesh_1.maxDepth = rsmesh_1.vertexCount;
            rsmesh_1.textureSkins = null;
            rsmesh_1.vertexSkins = null;
            rsmesh_1.facePriorities = null;
            aMeshRasterizer_3905 = graphicalrenderer_0.createMeshRasterizer(rsmesh_1, 51200, 33, 64, 768);
        }

    }

    static void method5946(AbstractRenderer graphicalrenderer_0) {
        if (aNativeSprite_3912 == null) {
            int[] ints_1 = new int[16384];
            int[] ints_2 = new int[16384];

            for (int i_3 = 0; i_3 < 64; i_3++) {
                int i_4 = 64 - i_3;
                i_4 *= i_4;
                int i_5 = 128 - i_3 - 1;
                int i_6 = i_3 * 128;
                int i_7 = i_5 * 128;

                for (int i_8 = 0; i_8 < 64; i_8++) {
                    int i_9 = 64 - i_8;
                    i_9 *= i_9;
                    int i_10 = 128 - i_8 - 1;
                    int i_11 = 256 - (i_9 + i_4 << 8) / 4096;
                    i_11 = i_11 * 3072 / 1536;
                    if (i_11 < 0) {
                        i_11 = 0;
                    } else if (i_11 > 255) {
                        i_11 = 255;
                    }

                    int i_12 = i_11 / 2;
                    ints_2[i_6 + i_8] = ints_2[i_6 + i_10] = ints_2[i_7 + i_8] = ints_2[i_7 + i_10] = -16777216 | i_11 << 16;
                    ints_1[i_6 + i_8] = ints_1[i_6 + i_10] = ints_1[i_7 + i_8] = ints_1[i_7 + i_10] = 127 - i_12 << 24 | 0xffffff;
                }
            }

            aNativeSprite_3912 = graphicalrenderer_0.createNativeSprite(ints_2, 128, 128, 128);
            aNativeSprite_3895 = graphicalrenderer_0.createNativeSprite(ints_1, 128, 128, 128);
        }

    }

    boolean method5937(AbstractRenderer graphicalrenderer_1, Class334 class334_2) {
        return aNativeSprite_3910 != null || method5942(graphicalrenderer_1, class334_2);
    }

    boolean method5938(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        int i_7;
        if (!aBool3900) {
            i_5 = anInt3889 - i_1;
            i_6 = anInt3890 - i_2;
            i_7 = anInt3891 - i_3;
            anInt3897 = (int) Math.sqrt(i_5 * i_5 + i_6 * i_6 + i_7 * i_7);
            if (anInt3897 == 0) {
                anInt3897 = 1;
            }

            i_5 = (i_5 << 8) / anInt3897;
            i_6 = (i_6 << 8) / anInt3897;
            i_7 = (i_7 << 8) / anInt3897;
        } else {
            anInt3897 = 1073741823;
            i_5 = anInt3889;
            i_6 = anInt3890;
            i_7 = anInt3891;
        }

        int i_8 = (int) (Math.sqrt(i_5 * i_5 + i_6 * i_6 + i_7 * i_7) * 256.0D);
        if (i_8 > 128) {
            i_5 = (i_5 << 16) / i_8;
            i_6 = (i_6 << 16) / i_8;
            i_7 = (i_7 << 16) / i_8;
            anInt3899 = i_4 * anInt3888 / (aBool3900 ? 1024 : anInt3897);
        } else {
            anInt3899 = 0;
        }

        if (anInt3899 < 8) {
            aNativeSprite_3910 = null;
            return false;
        } else {
            int i_9 = Utils.nextPowerOfTwo(anInt3899);
            if (i_9 > i_4) {
                i_9 = Class51.method1072(i_4);
            }

            if (i_9 > 512) {
                i_9 = 512;
            }

            if (i_9 != anInt3902) {
                anInt3902 = i_9;
            }

            anInt3911 = (int) (Math.asin(i_6 / 256.0F) * 2607.5945876176133D) & 0x3fff;
            anInt3896 = (int) (Math.atan2(i_5, -i_7) * 2607.5945876176133D) & 0x3fff;
            aNativeSprite_3910 = null;
            return true;
        }
    }

    void method5939(AbstractRenderer graphicalrenderer_1, Class334 class334_2) {
        RSMesh rsmesh_3 = RSMesh.decodeMesh(PaddedJS5Request.TEXTURED_MESH_INDEX, anInt3893);
        if (rsmesh_3 != null) {
            graphicalrenderer_1.qa(anIntArray3884);
            graphicalrenderer_1.r(0, 0, anInt3902, anInt3902);
            graphicalrenderer_1.ba(2, 0);
            graphicalrenderer_1.B(0, 0, anInt3902, anInt3902, 0, 0);
            int i_4 = 0;
            int i_5 = 0;
            int i_6 = 256;
            if (class334_2 != null) {
                if (class334_2.aBool3900) {
                    i_4 = -class334_2.anInt3889;
                    i_5 = -class334_2.anInt3890;
                    i_6 = -class334_2.anInt3891;
                } else {
                    i_4 = anInt3889 - class334_2.anInt3889;
                    i_5 = anInt3890 - class334_2.anInt3890;
                    i_6 = anInt3891 - class334_2.anInt3891;
                }
            }

            int i_7;
            int i_8;
            int i_9;
            int i_10;
            if (anInt3911 != 0) {
                i_7 = -anInt3911 & 0x3fff;
                i_8 = Trig.SINE[i_7];
                i_9 = Trig.COSINE[i_7];
                i_10 = i_5 * i_9 - i_6 * i_8 >> 14;
                i_6 = i_5 * i_8 + i_6 * i_9 >> 14;
                i_5 = i_10;
            }

            if (anInt3896 != 0) {
                i_7 = -anInt3896 & 0x3fff;
                i_8 = Trig.SINE[i_7];
                i_9 = Trig.COSINE[i_7];
                i_10 = i_6 * i_8 + i_4 * i_9 >> 14;
                i_6 = i_6 * i_9 - i_4 * i_8 >> 14;
                i_4 = i_10;
            }

            graphicalrenderer_1.IA(1.0F);
            graphicalrenderer_1.m(anInt3894, 1.0F, 1.0F, i_4, i_5, i_6);
            rsmesh_3.method2671(anInt3901 & 0x3fff, anInt3883 & 0x3fff, anInt3903 & 0x3fff);
            MeshRasterizer meshrasterizer_16 = graphicalrenderer_1.createMeshRasterizer(rsmesh_3, 2048, 0, 64, 768);
            i_8 = meshrasterizer_16.ya() - meshrasterizer_16.RA();
            i_9 = meshrasterizer_16.o() - meshrasterizer_16.YA();
            i_10 = Math.max(i_8, i_9);
            int i_11 = anInt3902 * 1024 / i_10;
            Matrix44 matrix44_12 = graphicalrenderer_1.method8453();
            Matrix44 matrix44_13 = graphicalrenderer_1.method8449();
            matrix44_13.method6532((anInt3902 / 2), (anInt3902 / 2), i_11, i_11, 50.0F, 50000.0F, graphicalrenderer_1.method8523().method2714(), graphicalrenderer_1.method8523().method2716(), 1024.0F);
            graphicalrenderer_1.method8424(matrix44_13);
            Matrix44Var matrix44var_14 = new Matrix44Var();
            graphicalrenderer_1.method8457(matrix44var_14);
            Matrix44Var matrix44var_15 = graphicalrenderer_1.method8450();
            matrix44var_15.method5223(0.0F, 0.0F, (50 - meshrasterizer_16.AA()));
            meshrasterizer_16.method11282(matrix44var_15, null, 1);
            aNativeSprite_3910 = graphicalrenderer_1.method8668(0, 0, anInt3902, anInt3902, true);
            aNativeSprite_3910.method2751();
            graphicalrenderer_1.method8424(matrix44_12);
            graphicalrenderer_1.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
        }

    }

    boolean method5942(AbstractRenderer graphicalrenderer_1, Class334 class334_2) {
        if (aNativeSprite_3910 == null) {
            if (anInt3887 == 0) {
                if (Class247.TEXTURE_LOADER.loadTexture(anInt3893)) {
                    int[] ints_3 = Class247.TEXTURE_LOADER.renderMaterialPixelsI(anInt3893, anInt3902, anInt3902);
                    aNativeSprite_3910 = graphicalrenderer_1.createNativeSprite(ints_3, anInt3902, anInt3902, anInt3902);
                }
            } else if (anInt3887 == 2) {
                method5939(graphicalrenderer_1, class334_2);
            } else if (anInt3887 == 1) {
                method5944(graphicalrenderer_1, class334_2);
            }
        }

        return aNativeSprite_3910 != null;
    }

    void method5944(AbstractRenderer graphicalrenderer_1, Class334 class334_2) {
        method5943(graphicalrenderer_1);
        method5946(graphicalrenderer_1);
        graphicalrenderer_1.qa(anIntArray3884);
        graphicalrenderer_1.r(0, 0, anInt3902, anInt3902);
        graphicalrenderer_1.ba(2, 0);
        graphicalrenderer_1.B(0, 0, anInt3902, anInt3902, -16777216 | anInt3894, 0);
        int i_3 = 0;
        int i_4 = 0;
        int i_5 = 256;
        if (class334_2 != null) {
            if (class334_2.aBool3900) {
                i_3 = -class334_2.anInt3889;
                i_4 = -class334_2.anInt3890;
                i_5 = -class334_2.anInt3891;
            } else {
                i_3 = class334_2.anInt3889 - anInt3889;
                i_4 = class334_2.anInt3890 - anInt3890;
                i_5 = class334_2.anInt3891 - anInt3891;
            }
        }

        int i_6;
        int i_7;
        int i_8;
        if (anInt3911 != 0) {
            i_6 = Trig.SINE[anInt3911];
            i_7 = Trig.COSINE[anInt3911];
            i_8 = i_4 * i_7 - i_5 * i_6 >> 14;
            i_5 = i_4 * i_6 + i_5 * i_7 >> 14;
            i_4 = i_8;
        }

        if (anInt3896 != 0) {
            i_6 = Trig.SINE[anInt3896];
            i_7 = Trig.COSINE[anInt3896];
            i_8 = i_5 * i_6 + i_3 * i_7 >> 14;
            i_5 = i_5 * i_7 - i_3 * i_6 >> 14;
            i_3 = i_8;
        }

        MeshRasterizer meshrasterizer_13 = aMeshRasterizer_3905.method11289((byte) 0, 51200, true);
        meshrasterizer_13.W((short) 0, (short) anInt3893);
        graphicalrenderer_1.IA(1.0F);
        graphicalrenderer_1.m(16777215, 1.0F, 1.0F, i_3, i_4, i_5);
        i_7 = anInt3902 * 1024 / (meshrasterizer_13.ya() - meshrasterizer_13.RA());
        if (anInt3894 != 0) {
            i_7 = i_7 * 13 / 16;
        }

        Matrix44 matrix44_14 = graphicalrenderer_1.method8453();
        Matrix44 matrix44_9 = graphicalrenderer_1.method8449();
        matrix44_9.method6532((anInt3902 / 2), (anInt3902 / 2), i_7, i_7, 50.0F, 50000.0F, graphicalrenderer_1.method8523().method2714(), graphicalrenderer_1.method8523().method2716(), 1024.0F);
        graphicalrenderer_1.method8424(matrix44_9);
        graphicalrenderer_1.method8457(new Matrix44Var());
        Matrix44Var matrix44var_10 = new Matrix44Var();
        matrix44var_10.method5223(0.0F, 0.0F, (50 - meshrasterizer_13.AA()));
        meshrasterizer_13.method11282(matrix44var_10, null, 1);
        int i_11 = anInt3902 * 13 / 16;
        int i_12 = (anInt3902 - i_11) / 2;
        aNativeSprite_3895.method2754(i_12, i_12, i_11, i_11, 0, -16777216 | anInt3894, 1);
        aNativeSprite_3910 = graphicalrenderer_1.method8668(0, 0, anInt3902, anInt3902, true);
        graphicalrenderer_1.ba(2, 0);
        graphicalrenderer_1.B(0, 0, anInt3902, anInt3902, 0, 0);
        aNativeSprite_3912.method2754(0, 0, anInt3902, anInt3902, 1, 0, 0);
        aNativeSprite_3910.method2751();
        graphicalrenderer_1.method8424(matrix44_14);
        graphicalrenderer_1.r(anIntArray3884[0], anIntArray3884[1], anIntArray3884[2], anIntArray3884[3]);
    }

    void method5955(AbstractRenderer graphicalrenderer_1, int i_4, int i_5, int i_8, int i_9, int i_10, int i_11) {
        if (aNativeSprite_3910 != null) {
            float[] floats_12 = new float[3];
            float f_13 = (-(anInt3889 - i_8 << 16));
            float f_14 = (anInt3890 - i_9 << 15);
            float f_15 = (-(anInt3891 - i_10 << 16));
            float[] floats_16 = new float[3];
            graphicalrenderer_1.method8458().method5231(floats_16);
            f_13 += floats_16[0];
            f_14 += floats_16[1];
            f_15 += floats_16[2];
            graphicalrenderer_1.method8479(f_13, f_14, f_15, floats_12);
            if (floats_12[2] >= 0.0F) {
                int i_17 = (int) (floats_12[0] - (anInt3899 / 2));
                int i_18 = (int) (floats_12[1] - (anInt3899 / 2));
                if (i_18 < i_5 && i_18 + anInt3899 > 0 && i_17 < i_4 && i_17 + anInt3899 > 0) {
                    aNativeSprite_3910.method2754(i_17, i_18, anInt3899, anInt3899, 0, i_11 << 24 | 0xffffff, 1);
                }
            }
        }

    }

}
