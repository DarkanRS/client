package com.jagex;

public class Class247 {

    static ImageLoader TEXTURE_LOADER;

    int anInt3053;

    int anInt3044;

    NativeSprite aNativeSprite_3030;

    int anInt3052;

    int anInt3054;

    boolean aBool3042;

    Class247 aClass247_3051;

    int anInt3032 = -1;

    boolean aBool3045 = true;

    MeshRasterizer aMeshRasterizer_3048;

    int anInt3034;

    int anInt3043;

    byte[] aByteArray3037;

    int anInt3036;

    int anInt3038;

    int anInt3039;

    int anInt3040;

    int anInt3031;

    Class334[] aClass334Array3049;

    Class204 aClass204_3050;

    Class334[] aClass334Array3035;

    Class334 aClass334_3033;

    int anInt3047;

    public Class247(int i_1, Class334[] arr_2, int i_3, int i_4, int i_5, int i_6, Class204 class204_7, int i_8) {
        anInt3038 = i_4;
        anInt3039 = i_5;
        anInt3040 = i_6;
        anInt3031 = i_1;
        aClass334Array3049 = arr_2;
        aClass204_3050 = class204_7;
        if (arr_2 != null) {
            aClass334Array3035 = new Class334[arr_2.length];
            aClass334_3033 = i_3 >= 0 ? arr_2[i_3] : null;
        } else {
            aClass334Array3035 = null;
            aClass334_3033 = null;
        }
        anInt3047 = i_8;
    }

    public static boolean method4248(int i_0, int i_1) {
        if (!Class20.aBool161) {
            return false;
        } else {
            int i_3 = i_0 >> 16;
            int i_4 = i_0 & 0xffff;
            if (CustomCursorsPreference.INTERFACES[i_3] != null && CustomCursorsPreference.INTERFACES[i_3].components[i_4] != null) {
                IComponentDefinitions icomponentdefinitions_5 = CustomCursorsPreference.INTERFACES[i_3].components[i_4];
                CacheableNode_Sub7 class282_sub50_sub7_6;
                if (i_1 == -1 && icomponentdefinitions_5.type == ComponentType.CONTAINER) {
                    for (class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
                        if (class282_sub50_sub7_6.clickType == 58 || class282_sub50_sub7_6.clickType == 1007 || class282_sub50_sub7_6.clickType == 25 || class282_sub50_sub7_6.clickType == 57 || class282_sub50_sub7_6.clickType == 30) {
                            for (IComponentDefinitions icomponentdefinitions_7 = IComponentDefinitions.getDefs(class282_sub50_sub7_6.anInt9582); icomponentdefinitions_7 != null; icomponentdefinitions_7 = CutsceneAction_Sub23.method14682(CustomCursorsPreference.INTERFACES[icomponentdefinitions_7.idHash >> 16], icomponentdefinitions_7)) {
                                if (icomponentdefinitions_7.idHash == icomponentdefinitions_5.idHash) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aClass482_171.head(); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (CacheableNode_Sub7) Class20.aClass482_171.next()) {
                        if (class282_sub50_sub7_6.anInt9581 == i_1 && icomponentdefinitions_5.idHash == class282_sub50_sub7_6.anInt9582 && (class282_sub50_sub7_6.clickType == 58 || class282_sub50_sub7_6.clickType == 1007 || class282_sub50_sub7_6.clickType == 25 || class282_sub50_sub7_6.clickType == 57 || class282_sub50_sub7_6.clickType == 30)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static void method4250() {
        for (VorbisNode class282_sub37_1 = (VorbisNode) Class492.INDEX36_FILE_CACHE.method7750(); class282_sub37_1 != null; class282_sub37_1 = (VorbisNode) Class492.INDEX36_FILE_CACHE.method7751()) {
            CutsceneObject.method1563(class282_sub37_1.fileId);
        }
    }

    static void method4251() {
        Class192.ACCOUNT_CREATION_STAGE = AccountCreationStage.REQUEST;
        CutsceneAction_Sub9.RECIEVED_RESPONSE = AccountCreationResponseOpcodes.aClass483_5729;
        Class237.aClass494_2916 = Class494.aClass494_5786;
        Class404.aClass466_4831 = Class466.aClass466_5569;
    }

    void method4206(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, boolean bool_11, int i_13) {
        int i_15 = 255 - i_13;
        if (aMeshRasterizer_3048 == null) {
            graphicalrenderer_1.ba(2, 0);
            i_8 = i_8 + i_2 & 0x3fff;
            if (anInt3031 != -1 && anInt3034 != 0) {
                TextureDetails class169_16 = TEXTURE_LOADER.getTextureDetails(anInt3031);
                if (aNativeSprite_3030 == null && TEXTURE_LOADER.loadTexture(anInt3031)) {
                    int[] ints_17 = class169_16.blendType == 2 ? TEXTURE_LOADER.renderMaterialPixelsI(anInt3031, anInt3034, anInt3034) : TEXTURE_LOADER.renderTexturePixels(anInt3031, 0.7F, anInt3034, anInt3034, false);
                    anInt3053 = ints_17[0];
                    anInt3044 = ints_17[ints_17.length - 1];
                    aNativeSprite_3030 = graphicalrenderer_1.createNativeSprite(ints_17, anInt3034, anInt3034, anInt3034);
                }
                int i_22 = i_15 == 255 ? (class169_16.blendType == 2 ? 1 : 0) : 1;
                if (i_22 == 1 && bool_11) {
                    graphicalrenderer_1.B(i_3, i_4, i_5, i_6, i_10, 0);
                }
                if (aNativeSprite_3030 != null) {
                    int i_18 = i_7 * i_6 / -4096;
                    int i_19;
                    for (i_19 = i_8 * i_6 / 4096 + (i_5 - i_6) / 2; i_19 > i_6; i_19 -= i_6) {
                    }
                    while (i_19 < 0) {
                        i_19 += i_6;
                    }
                    int i_20;
                    if (aClass204_3050 != Class204.aClass204_2578) {
                        while (i_18 > i_6) {
                            i_18 -= i_6;
                        }
                        while (i_18 < 0) {
                            i_18 += i_6;
                        }
                        for (i_20 = i_19 - i_6; i_20 < i_5; i_20 += i_6) {
                            for (int i_21 = i_18 - i_6; i_21 < i_6; i_21 += i_6) {
                                aNativeSprite_3030.method2754(i_3 + i_20, i_21 + i_4, i_6, i_6, 0, i_15 << 24 | 0xffffff, i_22);
                            }
                        }
                    } else {
                        for (i_20 = i_19 - i_6; i_20 < i_5; i_20 += i_6) {
                            aNativeSprite_3030.method2754(i_3 + i_20, i_18 + i_4, i_6, i_6, 0, i_15 << 24 | 0xffffff, i_22);
                        }
                        if ((anInt3053 & -16777216) != 0) {
                            graphicalrenderer_1.method8425(0, 0, i_5, i_18 + i_4 + 1, anInt3053);
                        }
                        if ((anInt3044 & -16777216) != 0) {
                            graphicalrenderer_1.method8425(0, i_18 + i_4 + i_6, i_5, i_6 - (i_18 + i_4 + i_6), anInt3044);
                        }
                    }
                }
            } else {
                graphicalrenderer_1.B(i_3, i_4, i_5, i_6, i_15 << 24 | i_10, 1);
            }
        } else if (false) {
            Matrix44 matrix44_24 = graphicalrenderer_1.method8453();
            Matrix44 matrix44_25 = graphicalrenderer_1.method8453();
            matrix44_24.buf[2] = matrix44_24.buf[3];
            matrix44_24.buf[6] = matrix44_24.buf[7];
            matrix44_24.buf[10] = matrix44_24.buf[11];
            matrix44_24.buf[14] = matrix44_24.buf[15];
            graphicalrenderer_1.method8424(matrix44_24);
            method4231(graphicalrenderer_1, i_7, i_8, i_9, i_13);
            graphicalrenderer_1.method8424(matrix44_25);
        } else {
            if (bool_11) {
                graphicalrenderer_1.ba(3, i_10);
            }
            method4231(graphicalrenderer_1, i_7, i_8, i_9, i_13);
        }
        for (int i_23 = anInt3043 - 1; i_23 >= 0; --i_23) {
            aClass334Array3035[i_23].method5955(graphicalrenderer_1, i_5, i_6, anInt3038, anInt3039, anInt3040, i_15);
        }
        graphicalrenderer_1.ba(2, 0);
    }

    public void method4207(int i_1, int i_2) {
        boolean bool_10000 = aBool3042;
        anInt3052 = (i_2 - anInt3054) * i_1 / 255 + anInt3054;
    }

    public void method4208(Class247 class247_1) {
        if (aBool3042) {
            anInt3054 = anInt3052;
        } else if (class247_1 != null && class247_1.aBool3042) {
            anInt3054 = 255 - class247_1.anInt3052;
        } else {
            anInt3054 = 0;
        }
        aBool3042 = true;
        aClass247_3051 = class247_1;
        anInt3052 = 0;
    }

    public void method4209() {
        aBool3042 = false;
        aClass247_3051 = null;
        anInt3052 = 0;
    }

    public boolean method4210() {
        return aBool3042;
    }

    public Class247 method4211() {
        return aClass247_3051;
    }

    public void method4214(AbstractRenderer graphicalrenderer_1, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        method4215(graphicalrenderer_1, 0, i_3, i_4, i_5, i_6, i_7, i_8, 0, 0);
    }

    public void method4215(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        int i_14 = 0;
        if (aBool3042) {
            i_14 = anInt3052;
        }
        if (aClass247_3051 != null) {
            Class247 class247_15 = this;
            Class247 class247_16 = aClass247_3051;
            if (hashCode() > class247_16.hashCode()) {
                class247_15 = aClass247_3051;
                class247_16 = this;
                i_14 = 255 - i_14;
            }
            class247_15.method4206(graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, true, i_14);
            class247_16.method4206(graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, false, 255 - i_14);
        } else {
            method4206(graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, true, i_14);
        }
    }

    public boolean method4217(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        if (i_2 != anInt3032) {
            anInt3032 = i_2;
            int i_5 = Class51.method1072(i_2);
            if (i_5 > 512) {
                i_5 = 512;
            }
            if (i_5 <= 0) {
                i_5 = 1;
            }
            if (i_5 != anInt3034) {
                anInt3034 = i_5;
                aNativeSprite_3030 = null;
            }
            if (aClass334Array3049 != null) {
                anInt3043 = 0;
                int[] ints_6 = new int[aClass334Array3049.length];
                for (int i_7 = 0; i_7 < aClass334Array3049.length; i_7++) {
                    Class334 class334_8 = aClass334Array3049[i_7];
                    if (class334_8.method5938(anInt3038, anInt3039, anInt3040, anInt3032)) {
                        ints_6[anInt3043] = class334_8.anInt3897;
                        aClass334Array3035[++anInt3043 - 1] = class334_8;
                    }
                }
                Class51.method1074(ints_6, aClass334Array3035, 0, anInt3043 - 1);
            }
            aBool3045 = true;
        }
        boolean bool_10 = false;
        if (aBool3045) {
            aBool3045 = false;
            for (int i_9 = anInt3043 - 1; i_9 >= 0; --i_9) {
                boolean bool_11 = aClass334Array3035[i_9].method5937(graphicalrenderer_1, aClass334_3033);
                aBool3045 |= !bool_11;
                bool_10 |= bool_11;
            }
        }
        if (i_3 != 0 && graphicalrenderer_1.method8404()) {
            if (aMeshRasterizer_3048 == null && anInt3047 >= 0) {
                method4229(graphicalrenderer_1);
            }
        } else {
            aMeshRasterizer_3048 = null;
        }
        if (aClass247_3051 != null && this != aClass247_3051) {
            aClass247_3051.method4209();
            bool_10 |= aClass247_3051.method4217(graphicalrenderer_1, i_2, i_3);
        }
        return bool_10;
    }

    void method4229(AbstractRenderer graphicalrenderer_1) {
        try {
            boolean bool_3 = PaddedJS5Request.TEXTURED_MESH_INDEX.loadArchive(anInt3047);
            if (bool_3) {
                graphicalrenderer_1.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                RSMesh rsmesh_4 = RSMesh.decodeMesh(PaddedJS5Request.TEXTURED_MESH_INDEX, anInt3047);
                aMeshRasterizer_3048 = graphicalrenderer_1.createMeshRasterizer(rsmesh_4, 1099776, 0, 255, 1);
                byte[] bytes_5 = aMeshRasterizer_3048.aw();
                if (bytes_5 == null) {
                    aByteArray3037 = null;
                } else {
                    aByteArray3037 = new byte[bytes_5.length];
                    System.arraycopy(bytes_5, 0, aByteArray3037, 0, bytes_5.length);
                }
            }
        } catch (Exception ignored) {
        }
    }

    void method4231(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5) {
        Matrix44Var matrix44var_7 = graphicalrenderer_1.method8458();
        Matrix44Var matrix44var_8 = new Matrix44Var();
        matrix44var_8.method5223(0.0F, 0.0F, 0.0F);
        matrix44var_8.rotation(0.0F, -1.0f, 0.0F, Trig.degToRad(-i_3 & 0x3fff));
        matrix44var_8.rotation(-1.0f, 0.0F, 0.0F, Trig.degToRad(-i_2 & 0x3fff));
        matrix44var_8.rotation(0.0F, 0.0F, -1.0f, Trig.degToRad(-i_4 & 0x3fff));
        graphicalrenderer_1.method8457(matrix44var_8);
        Matrix44Var matrix44var_9 = new Matrix44Var();
        if (i_5 != anInt3036) {
            aMeshRasterizer_3048.method11312((byte) i_5, aByteArray3037);
            anInt3036 = i_5;
        }
        aMeshRasterizer_3048.method11282(matrix44var_9, null, 0);
        graphicalrenderer_1.method8457(matrix44var_7);
    }
}
