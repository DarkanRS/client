package com.jagex;

public class MeshRasterizer_Sub2 extends MeshRasterizer {

    static int anInt8644 = 4096;
    static int anInt8562 = 4096;
    static int anInt8612;
    ChoppyItemFixClass aClass144_8566;
    Class185 aClass185_8564;
    int[] anIntArray8633;
    float[] aFloatArray8590;
    float[] aFloatArray8605;
    float[] aFloatArray8636;
    float[] aFloatArray8637;
    int[] anIntArray8583;
    int[] anIntArray8639;
    int[] anIntArray8628;
    int[] anIntArray8567;
    int[] anIntArray8619;
    int[] anIntArray8643;
    int anInt8577;
    int anInt8598;
    Class185 aClass185_8565;
    MeshRasterizer_Sub2[] aMeshRasterizer_Sub2Array8626;
    MeshRasterizer_Sub2[] aMeshRasterizer_Sub2Array8645;
    Class189[] aClass189Array8584;
    Class195[] aClass195Array8599;
    int[] anIntArray8592;
    int[] anIntArray8631;
    int[] anIntArray8594;
    short[] aShortArray8604;
    byte[] aByteArray8600;
    Class189[] aClass189Array8585;
    boolean aBool8621;
    short aShort8627;
    short aShort8625;
    short aShort8629;
    short aShort8634;
    short aShort8570;
    short aShort8571;
    short aShort8595;
    short aShort8574;
    int anInt8606;
    int anInt8578;
    int anInt8579;
    int anInt8586;
    int anInt8617;
    boolean aBool8630;
    boolean aBool8640;
    int[] anIntArray8580;
    int[] anIntArray8581;
    int[] anIntArray8610;
    byte[] aByteArray8602;
    short[] aShortArray8603;
    Class176[] aClass176Array8582;
    float[][] aFloatArrayArray8635;
    float[][] aFloatArrayArray8591;
    int[][] anIntArrayArray8568;
    int[][] anIntArrayArray8608;
    int[][] anIntArrayArray8620;
    short[] aShortArray8569;
    short[] aShortArray8632;
    byte[] aByteArray8601;
    short[] aShortArray8587;
    short[] aShortArray8588;
    short[] aShortArray8642;
    ParticleEmitterConfig[] aClass87Array8615;
    SurfaceSkin[] aClass172Array8616;
    Class193[] aClass193Array8618;
    short[] aShortArray8623;
    int anInt8575;
    boolean aBool8609;
    boolean aBool8589;
    int anInt8611;
    int anInt8607;
    int anInt8613;
    boolean aBool8614;
    boolean aBool8563;
    JavaRenderer aGraphicalRenderer_Sub3_8638;

    MeshRasterizer_Sub2(JavaRenderer hardwarerenderer_1) {
        aGraphicalRenderer_Sub3_8638 = hardwarerenderer_1;
    }

    MeshRasterizer_Sub2(JavaRenderer hardwarerenderer_1, RSMesh rsmesh_2, int i_3, int i_4, int i_5, int i_6) {
        aGraphicalRenderer_Sub3_8638 = hardwarerenderer_1;
        anInt8575 = i_3;
        anInt8606 = i_4;
        anInt8577 = i_5;
        ImageLoader interface22_7 = aGraphicalRenderer_Sub3_8638.textureCache;
        anInt8578 = rsmesh_2.vertexCount;
        anInt8579 = rsmesh_2.maxDepth;
        anIntArray8580 = rsmesh_2.vertexX;
        anIntArray8581 = rsmesh_2.vertexY;
        anIntArray8610 = rsmesh_2.vertexZ;
        anInt8586 = rsmesh_2.faceCount;
        aShortArray8587 = rsmesh_2.triangleX;
        aShortArray8588 = rsmesh_2.triangleY;
        aShortArray8642 = rsmesh_2.triangleZ;
        aByteArray8601 = rsmesh_2.facePriorities;
        aShortArray8604 = rsmesh_2.faceColor;
        aByteArray8602 = rsmesh_2.faceAlphas;
        aShortArray8632 = rsmesh_2.aShortArray1981;
        aByteArray8600 = rsmesh_2.faceType;
        aClass87Array8615 = rsmesh_2.particleConfig;
        aClass172Array8616 = rsmesh_2.surfaceSkins;
        aShortArray8569 = rsmesh_2.aShortArray1980;
        int[] ints_8 = new int[anInt8586];

        for (int i_9 = 0; i_9 < anInt8586; ints_8[i_9] = i_9++) {
        }

        long[] longs_53 = new long[anInt8586];
        boolean bool_10 = (anInt8575 & 0x100) != 0;

        int i_11;
        int i_14;
        byte b_17;
        int i_64;
        short s_68;
        for (i_11 = 0; i_11 < anInt8586; i_11++) {
            int i_55 = ints_8[i_11];
            TextureDetails class169_13 = null;
            i_14 = 0;
            byte b_15 = 0;
            byte b_16 = 0;
            b_17 = 0;
            if (rsmesh_2.isolatedVertexNormals != null) {
                boolean bool_18 = false;

                for (int i_19 = 0; i_19 < rsmesh_2.isolatedVertexNormals.length; i_19++) {
                    VertexNormal class84_20 = rsmesh_2.isolatedVertexNormals[i_19];
                    if (i_55 == class84_20.anInt809) {
                        BillboardDefinitions class347_21 = NPCMeshModifier.getBillboardDefinitions(class84_20.anInt812);
                        if (class347_21.aBool4059) {
                            bool_18 = true;
                        }

                        if (class347_21.anInt4055 != -1) {
                            TextureDetails class169_22 = interface22_7.getTextureDetails(class347_21.anInt4055);
                            if (class169_22.blendType == 2) {
                                aBool8630 = true;
                            }
                        }
                    }
                }

                if (bool_18) {
                    longs_53[i_11] = Long.MAX_VALUE;
                }
            }

            s_68 = -1;
            if (rsmesh_2.faceTextures != null) {
                s_68 = rsmesh_2.faceTextures[i_55];
                if (s_68 != -1) {
                    class169_13 = interface22_7.getTextureDetails(s_68 & 0xffff);
                    if ((i_6 & 0x40) != 0 && class169_13.isGroundMesh) {
                        s_68 = -1;
                    } else {
                        b_16 = class169_13.effectId;
                        b_17 = class169_13.effectParam1;
                    }
                }
            }

            boolean bool_71 = aByteArray8602 != null && aByteArray8602[i_55] != 0 || class169_13 != null && class169_13.blendType == 2;
            if ((bool_10 || bool_71) && aByteArray8601 != null) {
                i_14 += aByteArray8601[i_55] << 17;
            }

            if (bool_71) {
                i_14 += 65536;
            }

            i_14 += (b_16 & 0xff) << 8;
            i_14 += b_17 & 0xff;
            i_64 = b_15 + ((s_68 & 0xffff) << 16);
            i_64 += i_11 & 0xffff;
            longs_53[i_11] = ((long) i_14 << 32) + i_64;
            aBool8630 |= bool_71;
        }

        Class159.method2736(longs_53, ints_8);
        if (rsmesh_2.isolatedVertexNormals != null) {
            anInt8617 = rsmesh_2.isolatedVertexNormals.length;
            aClass193Array8618 = new Class193[anInt8617];
            aClass176Array8582 = new Class176[anInt8617];

            for (i_11 = 0; i_11 < rsmesh_2.isolatedVertexNormals.length; i_11++) {
                VertexNormal class84_12 = rsmesh_2.isolatedVertexNormals[i_11];
                BillboardDefinitions class347_62 = NPCMeshModifier.getBillboardDefinitions(class84_12.anInt812);
                i_14 = Class335.anIntArray3916[rsmesh_2.faceColor[class84_12.anInt809] & 0xffff] & 0xffffff;
                i_14 |= 255 - (rsmesh_2.faceAlphas != null ? rsmesh_2.faceAlphas[class84_12.anInt809] & 0xff : 0) << 24;
                aClass193Array8618[i_11] = new Class193(class84_12.anInt809, class347_62.anInt4054, class347_62.anInt4050, class347_62.anInt4055, class347_62.anInt4057, class347_62.anInt4051, class347_62.aBool4059, class84_12.anInt810);
                aClass176Array8582[i_11] = new Class176(i_14);
            }
        }

        aFloatArrayArray8635 = new float[anInt8586][];
        aFloatArrayArray8591 = new float[anInt8586][];
        Class83 class83_54 = method11256(rsmesh_2, ints_8, anInt8586);
        Class185 class185_61 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
        float[] floats_63 = class185_61.aFloatArray2338;
        boolean bool_66 = false;

        int i_67;
        for (i_64 = 0; i_64 < anInt8586; i_64++) {
            i_67 = ints_8[i_64];
            if (rsmesh_2.texturePos == null) {
                b_17 = -1;
            } else {
                b_17 = rsmesh_2.texturePos[i_67];
            }

            s_68 = rsmesh_2.faceTextures == null ? -1 : rsmesh_2.faceTextures[i_67];
            if (s_68 != -1 && (i_6 & 0x40) != 0) {
                TextureDetails class169_57 = interface22_7.getTextureDetails(s_68 & 0xffff);
                if (class169_57.isGroundMesh) {
                    s_68 = -1;
                }
            }

            if (s_68 != -1) {
                bool_66 = true;
                float[] floats_87 = aFloatArrayArray8635[i_67] = new float[3];
                float[] floats_72 = aFloatArrayArray8591[i_67] = new float[3];
                if (b_17 == -1) {
                    floats_87[0] = 0.0F;
                    floats_72[0] = 1.0F;
                    floats_87[1] = 1.0F;
                    floats_72[1] = 1.0F;
                    floats_87[2] = 0.0F;
                    floats_72[2] = 0.0F;
                } else {
                    int i_69 = b_17 & 0xff;
                    byte b_58 = rsmesh_2.textureRenderTypes[i_69];
                    short s_23;
                    short s_24;
                    float f_30;
                    float f_31;
                    float f_32;
                    float f_42;
                    float f_43;
                    float f_44;
                    float f_45;
                    float f_46;
                    float f_47;
                    short s_59;
                    if (b_58 == 0) {
                        s_59 = aShortArray8587[i_67];
                        s_23 = aShortArray8588[i_67];
                        s_24 = aShortArray8642[i_67];
                        short s_25 = rsmesh_2.texTriX[i_69];
                        short s_26 = rsmesh_2.texTriY[i_69];
                        short s_27 = rsmesh_2.texTriZ[i_69];
                        float f_28 = anIntArray8580[s_25];
                        float f_29 = anIntArray8581[s_25];
                        f_30 = anIntArray8610[s_25];
                        f_31 = anIntArray8580[s_26] - f_28;
                        f_32 = anIntArray8581[s_26] - f_29;
                        float f_33 = anIntArray8610[s_26] - f_30;
                        float f_34 = anIntArray8580[s_27] - f_28;
                        float f_35 = anIntArray8581[s_27] - f_29;
                        float f_36 = anIntArray8610[s_27] - f_30;
                        float f_37 = anIntArray8580[s_59] - f_28;
                        float f_38 = anIntArray8581[s_59] - f_29;
                        float f_39 = anIntArray8610[s_59] - f_30;
                        float f_40 = anIntArray8580[s_23] - f_28;
                        float f_41 = anIntArray8581[s_23] - f_29;
                        f_42 = anIntArray8610[s_23] - f_30;
                        f_43 = anIntArray8580[s_24] - f_28;
                        f_44 = anIntArray8581[s_24] - f_29;
                        f_45 = anIntArray8610[s_24] - f_30;
                        f_46 = f_32 * f_36 - f_33 * f_35;
                        f_47 = f_33 * f_34 - f_31 * f_36;
                        float f_48 = f_31 * f_35 - f_32 * f_34;
                        float f_49 = f_35 * f_48 - f_36 * f_47;
                        float f_50 = f_36 * f_46 - f_34 * f_48;
                        float f_51 = f_34 * f_47 - f_35 * f_46;
                        float f_52 = 1.0F / (f_49 * f_31 + f_50 * f_32 + f_51 * f_33);
                        floats_87[0] = (f_49 * f_37 + f_50 * f_38 + f_51 * f_39) * f_52;
                        floats_87[1] = (f_49 * f_40 + f_50 * f_41 + f_51 * f_42) * f_52;
                        floats_87[2] = (f_49 * f_43 + f_50 * f_44 + f_51 * f_45) * f_52;
                        f_49 = f_32 * f_48 - f_33 * f_47;
                        f_50 = f_33 * f_46 - f_31 * f_48;
                        f_51 = f_31 * f_47 - f_32 * f_46;
                        f_52 = 1.0F / (f_49 * f_34 + f_50 * f_35 + f_51 * f_36);
                        floats_72[0] = (f_49 * f_37 + f_50 * f_38 + f_51 * f_39) * f_52;
                        floats_72[1] = (f_49 * f_40 + f_50 * f_41 + f_51 * f_42) * f_52;
                        floats_72[2] = (f_49 * f_43 + f_50 * f_44 + f_51 * f_45) * f_52;
                    } else {
                        s_59 = aShortArray8587[i_67];
                        s_23 = aShortArray8588[i_67];
                        s_24 = aShortArray8642[i_67];
                        int i_73 = class83_54.anIntArray808[i_69];
                        int i_74 = class83_54.anIntArray805[i_69];
                        int i_75 = class83_54.anIntArray807[i_69];
                        float[] floats_60 = class83_54.aFloatArrayArray806[i_69];
                        byte b_76 = rsmesh_2.particleLifespanY[i_69];
                        f_30 = rsmesh_2.particleLifespanZ[i_69] / 256.0F;
                        if (b_58 == 1) {
                            f_31 = rsmesh_2.particleDirectionZ[i_69] / 1024.0F;
                            method11306(anIntArray8580[s_59], anIntArray8581[s_59], anIntArray8610[s_59], i_73, i_74, i_75, floats_60, f_31, b_76, f_30, floats_63);
                            floats_87[0] = floats_63[0];
                            floats_72[0] = floats_63[1];
                            method11306(anIntArray8580[s_23], anIntArray8581[s_23], anIntArray8610[s_23], i_73, i_74, i_75, floats_60, f_31, b_76, f_30, floats_63);
                            floats_87[1] = floats_63[0];
                            floats_72[1] = floats_63[1];
                            method11306(anIntArray8580[s_24], anIntArray8581[s_24], anIntArray8610[s_24], i_73, i_74, i_75, floats_60, f_31, b_76, f_30, floats_63);
                            floats_87[2] = floats_63[0];
                            floats_72[2] = floats_63[1];
                            f_32 = f_31 / 2.0F;
                            if ((b_76 & 0x1) == 0) {
                                if (floats_87[1] - floats_87[0] > f_32) {
                                    floats_87[1] -= f_31;
                                } else if (floats_87[0] - floats_87[1] > f_32) {
                                    floats_87[1] += f_31;
                                }

                                if (floats_87[2] - floats_87[0] > f_32) {
                                    floats_87[2] -= f_31;
                                } else if (floats_87[0] - floats_87[2] > f_32) {
                                    floats_87[2] += f_31;
                                }
                            } else {
                                if (floats_72[1] - floats_72[0] > f_32) {
                                    floats_72[1] -= f_31;
                                } else if (floats_72[0] - floats_72[1] > f_32) {
                                    floats_72[1] += f_31;
                                }

                                if (floats_72[2] - floats_72[0] > f_32) {
                                    floats_72[2] -= f_31;
                                } else if (floats_72[0] - floats_72[2] > f_32) {
                                    floats_72[2] += f_31;
                                }
                            }
                        } else if (b_58 == 2) {
                            f_31 = rsmesh_2.texturePrimaryColor[i_69] / 256.0F;
                            f_32 = rsmesh_2.textureSecondaryColor[i_69] / 256.0F;
                            int i_77 = anIntArray8580[s_23] - anIntArray8580[s_59];
                            int i_78 = anIntArray8581[s_23] - anIntArray8581[s_59];
                            int i_79 = anIntArray8610[s_23] - anIntArray8610[s_59];
                            int i_80 = anIntArray8580[s_24] - anIntArray8580[s_59];
                            int i_81 = anIntArray8581[s_24] - anIntArray8581[s_59];
                            int i_82 = anIntArray8610[s_24] - anIntArray8610[s_59];
                            int i_83 = i_78 * i_82 - i_81 * i_79;
                            int i_84 = i_79 * i_80 - i_82 * i_77;
                            int i_85 = i_77 * i_81 - i_80 * i_78;
                            f_42 = 64.0F / rsmesh_2.particleDirectionX[i_69];
                            f_43 = 64.0F / rsmesh_2.particleDirectionY[i_69];
                            f_44 = 64.0F / rsmesh_2.particleDirectionZ[i_69];
                            f_45 = (i_83 * floats_60[0] + i_84 * floats_60[1] + i_85 * floats_60[2]) / f_42;
                            f_46 = (i_83 * floats_60[3] + i_84 * floats_60[4] + i_85 * floats_60[5]) / f_43;
                            f_47 = (i_83 * floats_60[6] + i_84 * floats_60[7] + i_85 * floats_60[8]) / f_44;
                            int i_86 = method11254(f_45, f_46, f_47);
                            method11255(anIntArray8580[s_59], anIntArray8581[s_59], anIntArray8610[s_59], i_73, i_74, i_75, i_86, floats_60, b_76, f_30, f_31, f_32, floats_63);
                            floats_87[0] = floats_63[0];
                            floats_72[0] = floats_63[1];
                            method11255(anIntArray8580[s_23], anIntArray8581[s_23], anIntArray8610[s_23], i_73, i_74, i_75, i_86, floats_60, b_76, f_30, f_31, f_32, floats_63);
                            floats_87[1] = floats_63[0];
                            floats_72[1] = floats_63[1];
                            method11255(anIntArray8580[s_24], anIntArray8581[s_24], anIntArray8610[s_24], i_73, i_74, i_75, i_86, floats_60, b_76, f_30, f_31, f_32, floats_63);
                            floats_87[2] = floats_63[0];
                            floats_72[2] = floats_63[1];
                        } else if (b_58 == 3) {
                            method11271(anIntArray8580[s_59], anIntArray8581[s_59], anIntArray8610[s_59], i_73, i_74, i_75, floats_60, b_76, f_30, floats_63);
                            floats_87[0] = floats_63[0];
                            floats_72[0] = floats_63[1];
                            method11271(anIntArray8580[s_23], anIntArray8581[s_23], anIntArray8610[s_23], i_73, i_74, i_75, floats_60, b_76, f_30, floats_63);
                            floats_87[1] = floats_63[0];
                            floats_72[1] = floats_63[1];
                            method11271(anIntArray8580[s_24], anIntArray8581[s_24], anIntArray8610[s_24], i_73, i_74, i_75, floats_60, b_76, f_30, floats_63);
                            floats_87[2] = floats_63[0];
                            floats_72[2] = floats_63[1];
                            if ((b_76 & 0x1) == 0) {
                                if (floats_87[1] - floats_87[0] > 0.5F) {
                                    --floats_87[1];
                                } else if (floats_87[0] - floats_87[1] > 0.5F) {
                                    ++floats_87[1];
                                }

                                if (floats_87[2] - floats_87[0] > 0.5F) {
                                    --floats_87[2];
                                } else if (floats_87[0] - floats_87[2] > 0.5F) {
                                    ++floats_87[2];
                                }
                            } else {
                                if (floats_72[1] - floats_72[0] > 0.5F) {
                                    --floats_72[1];
                                } else if (floats_72[0] - floats_72[1] > 0.5F) {
                                    ++floats_72[1];
                                }

                                if (floats_72[2] - floats_72[0] > 0.5F) {
                                    --floats_72[2];
                                } else if (floats_72[0] - floats_72[2] > 0.5F) {
                                    ++floats_72[2];
                                }
                            }
                        }
                    }
                }
            }
        }

        if (!bool_66) {
            aFloatArrayArray8591 = null;
            aFloatArrayArray8635 = null;
        }

        if (rsmesh_2.vertexSkins != null && (anInt8575 & 0x20) != 0) {
            anIntArrayArray8568 = rsmesh_2.getBones(true);
        }

        if (rsmesh_2.textureSkins != null && (anInt8575 & 0x180) != 0) {
            anIntArrayArray8608 = rsmesh_2.method2666();
        }

        if (rsmesh_2.isolatedVertexNormals != null && (anInt8575 & 0x400) != 0) {
            anIntArrayArray8620 = rsmesh_2.method2667();
        }

        if (rsmesh_2.faceTextures != null) {
            aShortArray8603 = new short[anInt8586];
            boolean bool_65 = false;

            for (i_67 = 0; i_67 < anInt8586; i_67++) {
                short s_70 = rsmesh_2.faceTextures[i_67];
                if (s_70 != -1) {
                    TextureDetails class169_56 = aGraphicalRenderer_Sub3_8638.textureCache.getTextureDetails(s_70);
                    if ((i_6 & 0x40) != 0 && class169_56.isGroundMesh) {
                        aShortArray8603[i_67] = -1;
                    } else {
                        aShortArray8603[i_67] = s_70;
                        bool_65 = true;
                        if (class169_56.blendType == 2) {
                            aBool8630 = true;
                        }

                        if (class169_56.textureSpeedU != 0 || class169_56.textureSpeedV != 0) {
                            aBool8640 = true;
                        }
                    }
                } else {
                    aShortArray8603[i_67] = -1;
                }
            }

            if (!bool_65) {
                aShortArray8603 = null;
            }
        } else {
            aShortArray8603 = null;
        }

        if (aBool8630 || aClass193Array8618 != null) {
            aShortArray8623 = new short[anInt8586];

            for (i_64 = 0; i_64 < anInt8586; i_64++) {
                aShortArray8623[i_64] = (short) ints_8[i_64];
            }
        }

    }

    @Override
    public void method11282(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
        method13814(matrix44var_1, class275_sub5_2, i_3);
    }

    void method13795(Class185 class185_1) {
        aClass144_8566 = class185_1.aClass144_2310;
        if (class185_1 != aClass185_8564) {
            aClass185_8564 = class185_1;
            anIntArray8633 = aClass185_8564.anIntArray2319;
            aFloatArray8590 = aClass185_8564.aFloatArray2302;
            aFloatArray8605 = aClass185_8564.aFloatArray2341;
            aFloatArray8636 = aClass185_8564.aFloatArray2322;
            aFloatArray8637 = aClass185_8564.aFloatArray2323;
            anIntArray8583 = aClass185_8564.anIntArray2321;
            anIntArray8639 = aClass185_8564.anIntArray2325;
            anIntArray8628 = aClass185_8564.anIntArray2312;
            anIntArray8567 = aClass185_8564.anIntArray2327;
            anIntArray8619 = aClass185_8564.anIntArray2328;
            anIntArray8643 = aClass185_8564.anIntArray2329;
        }

    }

    @Override
    public void Q(int i_1) {
        if ((anInt8575 & 0x2000) != 8192) {
            throw new IllegalStateException();
        } else {
            anInt8577 = i_1;
            anInt8598 = 0;
        }
    }

    void method13796(Thread thread_1) {
        Class185 class185_2 = aGraphicalRenderer_Sub3_8638.method14370(thread_1);
        if (class185_2 != aClass185_8565) {
            aClass185_8565 = class185_2;
            aMeshRasterizer_Sub2Array8626 = aClass185_8565.aMeshRasterizer_Sub2Array2339;
            aMeshRasterizer_Sub2Array8645 = aClass185_8565.aMeshRasterizer_Sub2Array2340;
        }

    }

    void method13797() {
        aClass189Array8584 = new Class189[anInt8579];

        int i_1;
        for (i_1 = 0; i_1 < anInt8579; i_1++) {
            aClass189Array8584[i_1] = new Class189();
        }

        for (i_1 = 0; i_1 < anInt8586; i_1++) {
            short s_2 = aShortArray8587[i_1];
            short s_3 = aShortArray8588[i_1];
            short s_4 = aShortArray8642[i_1];
            int i_5 = anIntArray8580[s_3] - anIntArray8580[s_2];
            int i_6 = anIntArray8581[s_3] - anIntArray8581[s_2];
            int i_7 = anIntArray8610[s_3] - anIntArray8610[s_2];
            int i_8 = anIntArray8580[s_4] - anIntArray8580[s_2];
            int i_9 = anIntArray8581[s_4] - anIntArray8581[s_2];
            int i_10 = anIntArray8610[s_4] - anIntArray8610[s_2];
            int i_11 = i_6 * i_10 - i_9 * i_7;
            int i_12 = i_7 * i_8 - i_10 * i_5;

            int i_13;
            for (i_13 = i_5 * i_9 - i_8 * i_6; i_11 > 8192 || i_12 > 8192 || i_13 > 8192 || i_11 < -8192 || i_12 < -8192 || i_13 < -8192; i_13 >>= 1) {
                i_11 >>= 1;
                i_12 >>= 1;
            }

            int i_14 = (int) Math.sqrt(i_11 * i_11 + i_12 * i_12 + i_13 * i_13);
            if (i_14 <= 0) {
                i_14 = 1;
            }

            i_11 = i_11 * 256 / i_14;
            i_12 = i_12 * 256 / i_14;
            i_13 = i_13 * 256 / i_14;
            byte b_15;
            if (aByteArray8600 == null) {
                b_15 = 0;
            } else {
                b_15 = aByteArray8600[i_1];
            }

            if (b_15 == 0) {
                Class189 class189_16 = aClass189Array8584[s_2];
                class189_16.anInt2380 += i_11;
                class189_16.anInt2381 += i_12;
                class189_16.anInt2379 += i_13;
                ++class189_16.anInt2382;
                class189_16 = aClass189Array8584[s_3];
                class189_16.anInt2380 += i_11;
                class189_16.anInt2381 += i_12;
                class189_16.anInt2379 += i_13;
                ++class189_16.anInt2382;
                class189_16 = aClass189Array8584[s_4];
                class189_16.anInt2380 += i_11;
                class189_16.anInt2381 += i_12;
                class189_16.anInt2379 += i_13;
                ++class189_16.anInt2382;
            } else if (b_15 == 1) {
                if (aClass195Array8599 == null) {
                    aClass195Array8599 = new Class195[anInt8586];
                }

                Class195 class195_17 = aClass195Array8599[i_1] = new Class195();
                class195_17.anInt2410 = i_11;
                class195_17.anInt2411 = i_12;
                class195_17.anInt2412 = i_13;
            }
        }

    }

    @Override
    public void cq(short s_1, short s_2) {
        int i_3;
        for (i_3 = 0; i_3 < anInt8586; i_3++) {
            if (aShortArray8604[i_3] == s_1) {
                aShortArray8604[i_3] = s_2;
            }
        }

        if (aClass193Array8618 != null) {
            for (i_3 = 0; i_3 < anInt8617; i_3++) {
                Class193 class193_4 = aClass193Array8618[i_3];
                Class176 class176_5 = aClass176Array8582[i_3];
                class176_5.anInt2199 = (class176_5.anInt2199 * -1022818925 * -1303125861 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_4.anInt2393 * -1274099887 * 142270897]) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
            }
        }

        if (anInt8598 == 2) {
            anInt8598 = 1;
        }

    }

    void method13798(boolean bool_1) {
        if (anInt8598 == 1) {
            method13801();
        } else if (anInt8598 == 2) {
            if ((anInt8575 & 0x97098) == 0 && aFloatArrayArray8635 == null) {
                aShortArray8604 = null;
            }

            if (bool_1) {
                aByteArray8600 = null;
            }
        } else {
            method13877();
            int i_2 = aGraphicalRenderer_Sub3_8638.anInt9011;
            int i_3 = aGraphicalRenderer_Sub3_8638.anInt8988;
            int i_4 = aGraphicalRenderer_Sub3_8638.anInt9007;
            int i_5 = aGraphicalRenderer_Sub3_8638.anInt8992 >> 8;
            int i_6 = 0;
            int i_7 = 0;
            if (anInt8577 != 0) {
                i_6 = aGraphicalRenderer_Sub3_8638.anInt8990 * 768 / anInt8577;
                i_7 = aGraphicalRenderer_Sub3_8638.anInt8991 * 768 / anInt8577;
            }

            if (anIntArray8592 == null) {
                anIntArray8592 = new int[anInt8586];
                anIntArray8631 = new int[anInt8586];
                anIntArray8594 = new int[anInt8586];
            }

            for (int i_8 = 0; i_8 < anInt8586; i_8++) {
                byte b_9;
                if (aByteArray8600 == null) {
                    b_9 = 0;
                } else {
                    b_9 = aByteArray8600[i_8];
                }

                byte b_10;
                if (aByteArray8602 == null) {
                    b_10 = 0;
                } else {
                    b_10 = aByteArray8602[i_8];
                }

                short s_11;
                if (aShortArray8603 == null) {
                    s_11 = -1;
                } else {
                    s_11 = aShortArray8603[i_8];
                }

                if (b_10 == -2) {
                    b_9 = 3;
                }

                if (b_10 == -1) {
                    b_9 = 2;
                }

                int i_12;
                int i_16;
                if (s_11 == -1) {
                    int i_13;
                    int i_17;
                    int i_18;
                    short s_21;
                    if (b_9 != 0) {
                        if (b_9 == 1) {
                            i_12 = aShortArray8604[i_8] & 0xffff;
                            i_13 = (i_12 & 0x7f) * anInt8606 >> 7;
                            s_21 = Class372.method6362(i_12 & -128 | i_13);
                            Class195 class195_22 = aClass195Array8599[i_8];
                            i_16 = i_2 * class195_22.anInt2410 + i_3 * class195_22.anInt2411 + i_4 * class195_22.anInt2412 >> 16;
                            i_17 = i_16 > 256 ? i_6 : i_7;
                            i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
                            anIntArray8592[i_8] = i_18 << 17 | MaterialProp20.method15076(s_21, i_18);
                            anIntArray8594[i_8] = -1;
                        } else if (b_9 == 3) {
                            anIntArray8592[i_8] = 128;
                            anIntArray8594[i_8] = -1;
                        } else {
                            anIntArray8594[i_8] = -2;
                        }
                    } else {
                        i_12 = aShortArray8604[i_8] & 0xffff;
                        i_13 = (i_12 & 0x7f) * anInt8606 >> 7;
                        s_21 = Class372.method6362(i_12 & -128 | i_13);
                        Class189 class189_15;
                        if (aClass189Array8585 != null && aClass189Array8585[aShortArray8587[i_8]] != null) {
                            class189_15 = aClass189Array8585[aShortArray8587[i_8]];
                        } else {
                            class189_15 = aClass189Array8584[aShortArray8587[i_8]];
                        }

                        i_16 = (i_2 * class189_15.anInt2380 + i_3 * class189_15.anInt2381 + i_4 * class189_15.anInt2379) / class189_15.anInt2382 >> 16;
                        i_17 = i_16 > 256 ? i_6 : i_7;
                        i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
                        anIntArray8592[i_8] = i_18 << 17 | MaterialProp20.method15076(s_21, i_18);
                        if (aClass189Array8585 != null && aClass189Array8585[aShortArray8588[i_8]] != null) {
                            class189_15 = aClass189Array8585[aShortArray8588[i_8]];
                        } else {
                            class189_15 = aClass189Array8584[aShortArray8588[i_8]];
                        }

                        i_16 = (i_2 * class189_15.anInt2380 + i_3 * class189_15.anInt2381 + i_4 * class189_15.anInt2379) / class189_15.anInt2382 >> 16;
                        i_17 = i_16 > 256 ? i_6 : i_7;
                        i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
                        anIntArray8631[i_8] = i_18 << 17 | MaterialProp20.method15076(s_21, i_18);
                        if (aClass189Array8585 != null && aClass189Array8585[aShortArray8642[i_8]] != null) {
                            class189_15 = aClass189Array8585[aShortArray8642[i_8]];
                        } else {
                            class189_15 = aClass189Array8584[aShortArray8642[i_8]];
                        }

                        i_16 = (i_2 * class189_15.anInt2380 + i_3 * class189_15.anInt2381 + i_4 * class189_15.anInt2379) / class189_15.anInt2382 >> 16;
                        i_17 = i_16 > 256 ? i_6 : i_7;
                        i_18 = (i_5 >> 1) + (i_17 * i_16 >> 17);
                        anIntArray8594[i_8] = i_18 << 17 | MaterialProp20.method15076(s_21, i_18);
                    }
                } else {
                    i_12 = aShortArray8604[i_8] & 0xffff;
                    int i_14;
                    int i_20;
                    if (b_9 != 0) {
                        if (b_9 == 1) {
                            Class195 class195_23 = aClass195Array8599[i_8];
                            i_14 = i_2 * class195_23.anInt2410 + i_3 * class195_23.anInt2411 + i_4 * class195_23.anInt2412 >> 16;
                            i_20 = i_14 > 256 ? i_6 : i_7;
                            i_16 = method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
                            anIntArray8592[i_8] = i_16 << 24 | method13799(i_12, s_11, i_16);
                            anIntArray8594[i_8] = -1;
                        } else {
                            anIntArray8594[i_8] = -2;
                        }
                    } else {
                        Class189 class189_19;
                        if (aClass189Array8585 != null && aClass189Array8585[aShortArray8587[i_8]] != null) {
                            class189_19 = aClass189Array8585[aShortArray8587[i_8]];
                        } else {
                            class189_19 = aClass189Array8584[aShortArray8587[i_8]];
                        }

                        i_14 = (i_2 * class189_19.anInt2380 + i_3 * class189_19.anInt2381 + i_4 * class189_19.anInt2379) / class189_19.anInt2382 >> 16;
                        i_20 = i_14 > 256 ? i_6 : i_7;
                        i_16 = method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
                        anIntArray8592[i_8] = i_16 << 24 | method13799(i_12, s_11, i_16);
                        if (aClass189Array8585 != null && aClass189Array8585[aShortArray8588[i_8]] != null) {
                            class189_19 = aClass189Array8585[aShortArray8588[i_8]];
                        } else {
                            class189_19 = aClass189Array8584[aShortArray8588[i_8]];
                        }

                        i_14 = (i_2 * class189_19.anInt2380 + i_3 * class189_19.anInt2381 + i_4 * class189_19.anInt2379) / class189_19.anInt2382 >> 16;
                        i_20 = i_14 > 256 ? i_6 : i_7;
                        i_16 = method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
                        anIntArray8631[i_8] = i_16 << 24 | method13799(i_12, s_11, i_16);
                        if (aClass189Array8585 != null && aClass189Array8585[aShortArray8642[i_8]] != null) {
                            class189_19 = aClass189Array8585[aShortArray8642[i_8]];
                        } else {
                            class189_19 = aClass189Array8584[aShortArray8642[i_8]];
                        }

                        i_14 = (i_2 * class189_19.anInt2380 + i_3 * class189_19.anInt2381 + i_4 * class189_19.anInt2379) / class189_19.anInt2382 >> 16;
                        i_20 = i_14 > 256 ? i_6 : i_7;
                        i_16 = method13800((i_5 >> 2) + (i_20 * i_14 >> 18));
                        anIntArray8594[i_8] = i_16 << 24 | method13799(i_12, s_11, i_16);
                    }
                }
            }

            aClass189Array8584 = null;
            aClass189Array8585 = null;
            aClass195Array8599 = null;
            if ((anInt8575 & 0x97098) == 0 && aFloatArrayArray8635 == null) {
                aShortArray8604 = null;
            }

            if (bool_1) {
                aByteArray8600 = null;
            }

            anInt8598 = 2;
        }

    }

    int method13799(int i_1, short s_2, int i_3) {
        int i_4 = Class540.anIntArray7136[method13855(i_1, i_3)];
        TextureDetails class169_5 = aGraphicalRenderer_Sub3_8638.textureCache.getTextureDetails(s_2 & 0xffff);
        int i_6 = class169_5.shadowFactor & 0xff;
        int i_7;
        int i_9;
        if (i_6 != 0) {
            i_7 = i_3 * 131586;
            if (i_6 == 256) {
                i_4 = i_7;
            } else {
                i_9 = 256 - i_6;
                i_4 = ((i_7 & 0xff00ff) * i_6 + (i_4 & 0xff00ff) * i_9 & -16711936) + (i_6 * (i_7 & 0xff00) + i_9 * (i_4 & 0xff00) & 0xff0000) >> 8;
            }
        }

        i_7 = class169_5.brightness & 0xff;
        if (i_7 != 0) {
            i_7 += 256;
            int i_8 = i_7 * ((i_4 & 0xff0000) >> 16);
            if (i_8 > 65535) {
                i_8 = 65535;
            }

            i_9 = i_7 * ((i_4 & 0xff00) >> 8);
            if (i_9 > 65535) {
                i_9 = 65535;
            }

            int i_10 = (i_4 & 0xff) * i_7;
            if (i_10 > 65535) {
                i_10 = 65535;
            }

            i_4 = (i_10 >> 8) + (i_9 & 0xff00) + (i_8 << 8 & 0xff0000);
        }

        return i_4;
    }

    @Override
    public MeshRasterizer method11289(byte b_1, int i_2, boolean bool_3) {
        method13796(Thread.currentThread());
        boolean bool_4 = false;
        MeshRasterizer_Sub2 class528_sub2_5;
        MeshRasterizer_Sub2 class528_sub2_6;
        if (b_1 > 0 && b_1 <= 7) {
            class528_sub2_6 = aMeshRasterizer_Sub2Array8645[b_1 - 1];
            class528_sub2_5 = aMeshRasterizer_Sub2Array8626[b_1 - 1];
            bool_4 = true;
        } else {
            class528_sub2_5 = class528_sub2_6 = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_8638);
        }

        return method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
    }

    int method13800(int i_1) {
        int i_11 = i_1;
        if (i_11 < 2) {
            i_11 = 2;
        } else if (i_11 > 126) {
            i_11 = 126;
        }

        return i_11;
    }

    void method13801() {
        if (anInt8598 == 0) {
            method13853(false);
        } else if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
            synchronized (this) {
                method13802();
            }
        } else {
            method13802();
        }

    }

    void method13802() {
        for (int i_1 = 0; i_1 < anInt8586; i_1++) {
            short s_2 = aShortArray8603 != null ? aShortArray8603[i_1] : -1;
            if (s_2 == -1) {
                int i_3 = aShortArray8604[i_1] & 0xffff;
                int i_4 = (i_3 & 0x7f) * anInt8606 >> 7;
                short s_5 = Class372.method6362(i_3 & -128 | i_4);
                int i_6;
                if (anIntArray8594[i_1] == -1) {
                    i_6 = anIntArray8592[i_1] & -131072;
                    anIntArray8592[i_1] = i_6 | MaterialProp20.method15076(s_5, i_6 >> 17);
                } else if (anIntArray8594[i_1] != -2) {
                    i_6 = anIntArray8592[i_1] & -131072;
                    anIntArray8592[i_1] = i_6 | MaterialProp20.method15076(s_5, i_6 >> 17);
                    i_6 = anIntArray8631[i_1] & -131072;
                    anIntArray8631[i_1] = i_6 | MaterialProp20.method15076(s_5, i_6 >> 17);
                    i_6 = anIntArray8594[i_1] & -131072;
                    anIntArray8594[i_1] = i_6 | MaterialProp20.method15076(s_5, i_6 >> 17);
                }
            }
        }

        anInt8598 = 2;
    }

    boolean method13803(int i_1) {
        return anIntArray8643 != null && anIntArray8643[i_1] != -1;
    }

    @Override
    public Shadow dn(Shadow class282_sub50_sub17_1) {
        return null;
    }

    MeshRasterizer method13804(MeshRasterizer_Sub2 class528_sub2_1, MeshRasterizer_Sub2 class528_sub2_2, int i_3, boolean bool_4, boolean bool_5) {
        class528_sub2_1.aBool8621 = aBool8621;
        if (aBool8621) {
            class528_sub2_1.aShort8627 = aShort8627;
            class528_sub2_1.aShort8625 = aShort8625;
            class528_sub2_1.aShort8629 = aShort8629;
            class528_sub2_1.aShort8634 = aShort8634;
            class528_sub2_1.aShort8570 = aShort8570;
            class528_sub2_1.aShort8571 = aShort8571;
            class528_sub2_1.aShort8595 = aShort8595;
            class528_sub2_1.aShort8574 = aShort8574;
        }

        class528_sub2_1.anInt8606 = anInt8606;
        class528_sub2_1.anInt8577 = anInt8577;
        class528_sub2_1.anInt8578 = anInt8578;
        class528_sub2_1.anInt8579 = anInt8579;
        class528_sub2_1.anInt8586 = anInt8586;
        class528_sub2_1.anInt8617 = anInt8617;
        if ((i_3 & 0x100) != 0) {
            class528_sub2_1.aBool8630 = true;
        } else {
            class528_sub2_1.aBool8630 = aBool8630;
        }

        class528_sub2_1.aBool8640 = aBool8640;
        boolean bool_6 = (i_3 & 0x7) == 7 | (i_3 & 0x20) != 0;
        boolean bool_7 = bool_6 || (i_3 & 0x1) != 0;
        boolean bool_8 = bool_6 || (i_3 & 0x2) != 0;
        boolean bool_9 = bool_6 || (i_3 & 0x4) != 0 || (i_3 & 0x10) != 0;
        int i_10;
        if (!bool_7 && !bool_8 && !bool_9) {
            class528_sub2_1.anIntArray8580 = anIntArray8580;
            class528_sub2_1.anIntArray8581 = anIntArray8581;
            class528_sub2_1.anIntArray8610 = anIntArray8610;
        } else {
            if (!bool_7) {
                class528_sub2_1.anIntArray8580 = anIntArray8580;
            } else {
                if (class528_sub2_2.anIntArray8580 != null && class528_sub2_2.anIntArray8580.length >= anInt8578) {
                    class528_sub2_1.anIntArray8580 = class528_sub2_2.anIntArray8580;
                } else {
                    class528_sub2_1.anIntArray8580 = class528_sub2_2.anIntArray8580 = new int[anInt8578];
                }

                for (i_10 = 0; i_10 < anInt8578; i_10++) {
                    class528_sub2_1.anIntArray8580[i_10] = anIntArray8580[i_10];
                }
            }

            if (!bool_8) {
                class528_sub2_1.anIntArray8581 = anIntArray8581;
            } else {
                if (class528_sub2_2.anIntArray8581 != null && class528_sub2_2.anIntArray8581.length >= anInt8578) {
                    class528_sub2_1.anIntArray8581 = class528_sub2_2.anIntArray8581;
                } else {
                    class528_sub2_1.anIntArray8581 = class528_sub2_2.anIntArray8581 = new int[anInt8578];
                }

                for (i_10 = 0; i_10 < anInt8578; i_10++) {
                    class528_sub2_1.anIntArray8581[i_10] = anIntArray8581[i_10];
                }
            }

            if (bool_9) {
                if (class528_sub2_2.anIntArray8610 != null && class528_sub2_2.anIntArray8610.length >= anInt8578) {
                    class528_sub2_1.anIntArray8610 = class528_sub2_2.anIntArray8610;
                } else {
                    class528_sub2_1.anIntArray8610 = class528_sub2_2.anIntArray8610 = new int[anInt8578];
                }

                for (i_10 = 0; i_10 < anInt8578; i_10++) {
                    class528_sub2_1.anIntArray8610[i_10] = anIntArray8610[i_10];
                }
            } else {
                class528_sub2_1.anIntArray8610 = anIntArray8610;
            }
        }

        if ((i_3 & 0x84080) != 0) {
            if (class528_sub2_2.aShortArray8604 != null && class528_sub2_2.aShortArray8604.length >= anInt8586) {
                class528_sub2_1.aShortArray8604 = class528_sub2_2.aShortArray8604;
            } else {
                i_10 = anInt8586;
                class528_sub2_1.aShortArray8604 = class528_sub2_2.aShortArray8604 = new short[i_10];
            }

            for (i_10 = 0; i_10 < anInt8586; i_10++) {
                class528_sub2_1.aShortArray8604[i_10] = aShortArray8604[i_10];
            }
        } else {
            class528_sub2_1.aShortArray8604 = aShortArray8604;
        }

        if ((i_3 & 0x97018) != 0) {
            class528_sub2_1.anInt8598 = 0;
            class528_sub2_1.anIntArray8594 = null;
            class528_sub2_1.anIntArray8631 = null;
            class528_sub2_1.anIntArray8592 = null;
        } else if ((i_3 & 0x80) != 0) {
            if (bool_5) {
                method13853(false);
            }

            if (anIntArray8592 != null) {
                if (class528_sub2_2.anIntArray8592 != null && class528_sub2_2.anIntArray8592.length >= anInt8586) {
                    class528_sub2_1.anIntArray8592 = class528_sub2_2.anIntArray8592;
                    class528_sub2_1.anIntArray8631 = class528_sub2_2.anIntArray8631;
                    class528_sub2_1.anIntArray8594 = class528_sub2_2.anIntArray8594;
                } else {
                    i_10 = anInt8586;
                    class528_sub2_1.anIntArray8592 = class528_sub2_2.anIntArray8592 = new int[i_10];
                    class528_sub2_1.anIntArray8631 = class528_sub2_2.anIntArray8631 = new int[i_10];
                    class528_sub2_1.anIntArray8594 = class528_sub2_2.anIntArray8594 = new int[i_10];
                }

                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    class528_sub2_1.anIntArray8592[i_10] = anIntArray8592[i_10];
                    class528_sub2_1.anIntArray8631[i_10] = anIntArray8631[i_10];
                    class528_sub2_1.anIntArray8594[i_10] = anIntArray8594[i_10];
                }
            }

            class528_sub2_1.anInt8598 = anInt8598;
        } else {
            if (bool_5) {
                method13853(false);
            }

            class528_sub2_1.anIntArray8592 = anIntArray8592;
            class528_sub2_1.anIntArray8631 = anIntArray8631;
            class528_sub2_1.anIntArray8594 = anIntArray8594;
            class528_sub2_1.anInt8598 = anInt8598;
        }

        if ((i_3 & 0x100) != 0) {
            if (class528_sub2_2.aByteArray8602 != null && class528_sub2_2.aByteArray8602.length >= anInt8586) {
                class528_sub2_1.aByteArray8602 = class528_sub2_2.aByteArray8602;
            } else {
                i_10 = anInt8586;
                class528_sub2_1.aByteArray8602 = class528_sub2_2.aByteArray8602 = new byte[i_10];
            }

            if (aByteArray8602 != null) {
                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    class528_sub2_1.aByteArray8602[i_10] = aByteArray8602[i_10];
                }
            } else {
                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    class528_sub2_1.aByteArray8602[i_10] = 0;
                }
            }
        } else {
            class528_sub2_1.aByteArray8602 = aByteArray8602;
        }

        if ((i_3 & 0x8) == 0 && (i_3 & 0x10) == 0) {
            if (bool_5) {
                method13877();
            }

            class528_sub2_1.aClass189Array8584 = aClass189Array8584;
            class528_sub2_1.aClass195Array8599 = aClass195Array8599;
        } else {
            if (class528_sub2_2.aClass189Array8584 != null && class528_sub2_2.aClass189Array8584.length >= anInt8579) {
                class528_sub2_1.aClass189Array8584 = class528_sub2_2.aClass189Array8584;
            } else {
                i_10 = anInt8579;
                class528_sub2_1.aClass189Array8584 = class528_sub2_2.aClass189Array8584 = new Class189[i_10];
            }

            if (aClass189Array8584 != null) {
                for (i_10 = 0; i_10 < anInt8579; i_10++) {
                    class528_sub2_1.aClass189Array8584[i_10] = new Class189(aClass189Array8584[i_10]);
                }
            } else {
                class528_sub2_1.aClass189Array8584 = null;
            }

            if (aClass195Array8599 != null) {
                if (class528_sub2_2.aClass195Array8599 != null && class528_sub2_2.aClass195Array8599.length >= anInt8586) {
                    class528_sub2_1.aClass195Array8599 = class528_sub2_2.aClass195Array8599;
                } else {
                    i_10 = anInt8586;
                    class528_sub2_1.aClass195Array8599 = class528_sub2_2.aClass195Array8599 = new Class195[i_10];
                }

                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    class528_sub2_1.aClass195Array8599[i_10] = aClass195Array8599[i_10] != null ? new Class195(aClass195Array8599[i_10]) : null;
                }
            } else {
                class528_sub2_1.aClass195Array8599 = null;
            }
        }

        if ((i_3 & 0x8000) != 0) {
            if (aShortArray8603 == null) {
                class528_sub2_1.aShortArray8603 = null;
            } else {
                if (class528_sub2_2.aShortArray8603 != null && class528_sub2_2.aShortArray8603.length >= anInt8586) {
                    class528_sub2_1.aShortArray8603 = class528_sub2_2.aShortArray8603;
                } else {
                    i_10 = anInt8586;
                    class528_sub2_1.aShortArray8603 = class528_sub2_2.aShortArray8603 = new short[i_10];
                }

                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    class528_sub2_1.aShortArray8603[i_10] = aShortArray8603[i_10];
                }
            }
        } else {
            class528_sub2_1.aShortArray8603 = aShortArray8603;
        }

        if ((i_3 & 0x10000) != 0) {
            if (aByteArray8600 == null) {
                class528_sub2_1.aByteArray8600 = null;
            } else {
                if (class528_sub2_2.aByteArray8600 != null && class528_sub2_2.aByteArray8600.length >= anInt8586) {
                    class528_sub2_1.aByteArray8600 = class528_sub2_2.aByteArray8600;
                } else {
                    i_10 = bool_4 ? anInt8586 + 100 : anInt8586;
                    class528_sub2_1.aByteArray8600 = class528_sub2_2.aByteArray8600 = new byte[i_10];
                }

                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    class528_sub2_1.aByteArray8600[i_10] = aByteArray8600[i_10];
                }
            }
        } else {
            class528_sub2_1.aByteArray8600 = aByteArray8600;
        }

        if ((i_3 & 0xc580) != 0) {
            if (class528_sub2_2.aClass176Array8582 != null && class528_sub2_2.aClass176Array8582.length >= anInt8617) {
                class528_sub2_1.aClass176Array8582 = class528_sub2_2.aClass176Array8582;

                for (i_10 = 0; i_10 < anInt8617; i_10++) {
                    class528_sub2_1.aClass176Array8582[i_10].method2968(aClass176Array8582[i_10]);
                }
            } else {
                i_10 = anInt8617;
                class528_sub2_1.aClass176Array8582 = class528_sub2_2.aClass176Array8582 = new Class176[i_10];

                for (int i_13 = 0; i_13 < anInt8617; i_13++) {
                    class528_sub2_1.aClass176Array8582[i_13] = aClass176Array8582[i_13].method2972();
                }
            }
        } else {
            class528_sub2_1.aClass176Array8582 = aClass176Array8582;
        }

        if (aFloatArrayArray8635 != null && (i_3 & 0x10) != 0) {
            if (class528_sub2_2.aFloatArrayArray8635 != null && class528_sub2_2.aFloatArrayArray8635.length >= anInt8586) {
                class528_sub2_1.aFloatArrayArray8635 = class528_sub2_2.aFloatArrayArray8635;
            } else {
                i_10 = bool_4 ? anInt8586 + 100 : anInt8586;
                class528_sub2_1.aFloatArrayArray8635 = class528_sub2_2.aFloatArrayArray8635 = new float[i_10][3];
            }

            for (i_10 = 0; i_10 < anInt8586; i_10++) {
                if (aFloatArrayArray8635[i_10] != null) {
                    class528_sub2_1.aFloatArrayArray8635[i_10][0] = aFloatArrayArray8635[i_10][0];
                    class528_sub2_1.aFloatArrayArray8635[i_10][1] = aFloatArrayArray8635[i_10][1];
                    class528_sub2_1.aFloatArrayArray8635[i_10][2] = aFloatArrayArray8635[i_10][2];
                }
            }

            if (class528_sub2_2.aFloatArrayArray8591 != null && class528_sub2_2.aFloatArrayArray8591.length >= anInt8586) {
                class528_sub2_1.aFloatArrayArray8591 = class528_sub2_2.aFloatArrayArray8591;
            } else {
                i_10 = bool_4 ? anInt8586 + 100 : anInt8586;
                class528_sub2_1.aFloatArrayArray8591 = class528_sub2_2.aFloatArrayArray8591 = new float[i_10][3];
            }

            for (i_10 = 0; i_10 < anInt8586; i_10++) {
                if (aFloatArrayArray8591[i_10] != null) {
                    class528_sub2_1.aFloatArrayArray8591[i_10][0] = aFloatArrayArray8591[i_10][0];
                    class528_sub2_1.aFloatArrayArray8591[i_10][1] = aFloatArrayArray8591[i_10][1];
                    class528_sub2_1.aFloatArrayArray8591[i_10][2] = aFloatArrayArray8591[i_10][2];
                }
            }
        } else {
            class528_sub2_1.aFloatArrayArray8635 = aFloatArrayArray8635;
            class528_sub2_1.aFloatArrayArray8591 = aFloatArrayArray8591;
        }

        class528_sub2_1.anIntArrayArray8568 = anIntArrayArray8568;
        class528_sub2_1.anIntArrayArray8608 = anIntArrayArray8608;
        class528_sub2_1.anIntArrayArray8620 = anIntArrayArray8620;
        class528_sub2_1.aShortArray8569 = aShortArray8569;
        class528_sub2_1.aShortArray8632 = aShortArray8632;
        class528_sub2_1.aByteArray8601 = aByteArray8601;
        class528_sub2_1.aShortArray8587 = aShortArray8587;
        class528_sub2_1.aShortArray8588 = aShortArray8588;
        class528_sub2_1.aShortArray8642 = aShortArray8642;
        class528_sub2_1.aClass87Array8615 = aClass87Array8615;
        class528_sub2_1.aClass172Array8616 = aClass172Array8616;
        class528_sub2_1.aClass193Array8618 = aClass193Array8618;
        class528_sub2_1.aShortArray8623 = aShortArray8623;
        class528_sub2_1.anInt8575 = i_3;
        return class528_sub2_1;
    }

    @Override
    public int m() {
        return anInt8575;
    }

    @Override
    public void method11293(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
        method13814(matrix44var_1, class275_sub5_2, i_3);
    }

    @Override
    public void method11259() {
    }

    @Override
    public void f(int i_1) {
        if ((anInt8575 & 0x5) != 5) {
            throw new IllegalStateException();
        } else {
            if (i_1 == 4096) {
                method13805();
            } else if (i_1 == 8192) {
                method13806();
            } else if (i_1 == 12288) {
                method13807();
            } else {
                int i_2 = Trig.SINE[i_1];
                int i_3 = Trig.COSINE[i_1];
                synchronized (this) {
                    for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                        int i_6 = i_2 * anIntArray8610[i_5] + i_3 * anIntArray8580[i_5] >> 14;
                        anIntArray8610[i_5] = i_3 * anIntArray8610[i_5] - i_2 * anIntArray8580[i_5] >> 14;
                        anIntArray8580[i_5] = i_6;
                    }

                    method13812();
                }
            }

        }
    }

    @Override
    public void S(int i_1) {
        if ((anInt8575 & 0xd) != 13) {
            throw new IllegalStateException();
        } else {
            if (aClass189Array8584 != null) {
                if (i_1 == 4096) {
                    method13850();
                } else if (i_1 == 8192) {
                    method13809();
                } else if (i_1 == 12288) {
                    method13810();
                } else {
                    int i_2 = Trig.SINE[i_1];
                    int i_3 = Trig.COSINE[i_1];
                    synchronized (this) {
                        int i_5;
                        int i_6;
                        for (i_5 = 0; i_5 < anInt8579; i_5++) {
                            i_6 = i_2 * anIntArray8610[i_5] + i_3 * anIntArray8580[i_5] >> 14;
                            anIntArray8610[i_5] = i_3 * anIntArray8610[i_5] - i_2 * anIntArray8580[i_5] >> 14;
                            anIntArray8580[i_5] = i_6;
                            if (aClass189Array8584[i_5] != null) {
                                i_6 = i_2 * aClass189Array8584[i_5].anInt2379 + i_3 * aClass189Array8584[i_5].anInt2380 >> 14;
                                aClass189Array8584[i_5].anInt2379 = i_3 * aClass189Array8584[i_5].anInt2379 - i_2 * aClass189Array8584[i_5].anInt2380 >> 14;
                                aClass189Array8584[i_5].anInt2380 = i_6;
                            }
                        }

                        if (aClass195Array8599 != null) {
                            for (i_5 = 0; i_5 < anInt8586; i_5++) {
                                if (aClass195Array8599[i_5] != null) {
                                    i_6 = i_2 * aClass195Array8599[i_5].anInt2412 + i_3 * aClass195Array8599[i_5].anInt2410 >> 14;
                                    aClass195Array8599[i_5].anInt2412 = i_3 * aClass195Array8599[i_5].anInt2412 - i_2 * aClass195Array8599[i_5].anInt2410 >> 14;
                                    aClass195Array8599[i_5].anInt2410 = i_6;
                                }
                            }
                        }

                        for (i_5 = anInt8579; i_5 < anInt8578; i_5++) {
                            i_6 = i_2 * anIntArray8610[i_5] + i_3 * anIntArray8580[i_5] >> 14;
                            anIntArray8610[i_5] = i_3 * anIntArray8610[i_5] - i_2 * anIntArray8580[i_5] >> 14;
                            anIntArray8580[i_5] = i_6;
                        }

                        anInt8598 = 0;
                        aBool8621 = false;
                    }
                }
            } else {
                f(i_1);
            }

        }
    }

    void method13805() {
        synchronized (this) {
            for (int i_2 = 0; i_2 < anInt8578; i_2++) {
                int i_3 = anIntArray8580[i_2];
                anIntArray8580[i_2] = anIntArray8610[i_2];
                anIntArray8610[i_2] = -i_3;
            }

            method13812();
        }
    }

    void method13806() {
        synchronized (this) {
            for (int i_2 = 0; i_2 < anInt8578; i_2++) {
                anIntArray8580[i_2] = -anIntArray8580[i_2];
                anIntArray8610[i_2] = -anIntArray8610[i_2];
            }

            method13812();
        }
    }

    void method13807() {
        synchronized (this) {
            for (int i_2 = 0; i_2 < anInt8578; i_2++) {
                int i_3 = anIntArray8610[i_2];
                anIntArray8610[i_2] = anIntArray8580[i_2];
                anIntArray8580[i_2] = -i_3;
            }

            method13812();
        }
    }

    void method13809() {
        synchronized (this) {
            int i_2;
            for (i_2 = 0; i_2 < anInt8579; i_2++) {
                anIntArray8580[i_2] = -anIntArray8580[i_2];
                anIntArray8610[i_2] = -anIntArray8610[i_2];
                if (aClass189Array8584[i_2] != null) {
                    aClass189Array8584[i_2].anInt2380 = -aClass189Array8584[i_2].anInt2380;
                    aClass189Array8584[i_2].anInt2379 = -aClass189Array8584[i_2].anInt2379;
                }
            }

            if (aClass195Array8599 != null) {
                for (i_2 = 0; i_2 < anInt8586; i_2++) {
                    if (aClass195Array8599[i_2] != null) {
                        aClass195Array8599[i_2].anInt2410 = -aClass195Array8599[i_2].anInt2410;
                        aClass195Array8599[i_2].anInt2412 = -aClass195Array8599[i_2].anInt2412;
                    }
                }
            }

            for (i_2 = anInt8579; i_2 < anInt8578; i_2++) {
                anIntArray8580[i_2] = -anIntArray8580[i_2];
                anIntArray8610[i_2] = -anIntArray8610[i_2];
            }

            anInt8598 = 0;
            aBool8621 = false;
        }
    }

    void method13810() {
        synchronized (this) {
            int i_2;
            int i_3;
            for (i_2 = 0; i_2 < anInt8579; i_2++) {
                i_3 = anIntArray8610[i_2];
                anIntArray8610[i_2] = anIntArray8580[i_2];
                anIntArray8580[i_2] = -i_3;
                if (aClass189Array8584[i_2] != null) {
                    i_3 = aClass189Array8584[i_2].anInt2379;
                    aClass189Array8584[i_2].anInt2379 = aClass189Array8584[i_2].anInt2380;
                    aClass189Array8584[i_2].anInt2380 = -i_3;
                }
            }

            if (aClass195Array8599 != null) {
                for (i_2 = 0; i_2 < anInt8586; i_2++) {
                    if (aClass195Array8599[i_2] != null) {
                        i_3 = aClass195Array8599[i_2].anInt2412;
                        aClass195Array8599[i_2].anInt2412 = aClass195Array8599[i_2].anInt2410;
                        aClass195Array8599[i_2].anInt2410 = -i_3;
                    }
                }
            }

            for (i_2 = anInt8579; i_2 < anInt8578; i_2++) {
                i_3 = anIntArray8610[i_2];
                anIntArray8610[i_2] = anIntArray8580[i_2];
                anIntArray8580[i_2] = -i_3;
            }

            anInt8598 = 0;
            aBool8621 = false;
        }
    }

    @Override
    public void t(int i_1) {
        if ((anInt8575 & 0x6) != 6) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = i_3 * anIntArray8581[i_5] - i_2 * anIntArray8610[i_5] >> 14;
                    anIntArray8610[i_5] = i_2 * anIntArray8581[i_5] + i_3 * anIntArray8610[i_5] >> 14;
                    anIntArray8581[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void EA(int i_1) {
        if ((anInt8575 & 0x3) != 3) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = i_2 * anIntArray8581[i_5] + i_3 * anIntArray8580[i_5] >> 14;
                    anIntArray8581[i_5] = i_3 * anIntArray8581[i_5] - i_2 * anIntArray8580[i_5] >> 14;
                    anIntArray8580[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void wa() {
        if ((anInt8575 & 0x10) != 16) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                int i_2;
                for (i_2 = 0; i_2 < anInt8578; i_2++) {
                    anIntArray8610[i_2] = -anIntArray8610[i_2];
                }

                if (aClass189Array8584 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8584[i_2] != null) {
                            aClass189Array8584[i_2].anInt2379 = -aClass189Array8584[i_2].anInt2379;
                        }
                    }
                }

                if (aClass189Array8585 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8585[i_2] != null) {
                            aClass189Array8585[i_2].anInt2379 = -aClass189Array8585[i_2].anInt2379;
                        }
                    }
                }

                if (aClass195Array8599 != null) {
                    for (i_2 = 0; i_2 < anInt8586; i_2++) {
                        if (aClass195Array8599[i_2] != null) {
                            aClass195Array8599[i_2].anInt2412 = -aClass195Array8599[i_2].anInt2412;
                        }
                    }
                }

                short[] shorts_5 = aShortArray8587;
                aShortArray8587 = aShortArray8642;
                aShortArray8642 = shorts_5;
                if (aFloatArrayArray8635 != null) {
                    for (int i_3 = 0; i_3 < anInt8586; i_3++) {
                        float f_4;
                        if (aFloatArrayArray8635[i_3] != null) {
                            f_4 = aFloatArrayArray8635[i_3][0];
                            aFloatArrayArray8635[i_3][0] = aFloatArrayArray8635[i_3][2];
                            aFloatArrayArray8635[i_3][2] = f_4;
                        }

                        if (aFloatArrayArray8591[i_3] != null) {
                            f_4 = aFloatArrayArray8591[i_3][0];
                            aFloatArrayArray8591[i_3][0] = aFloatArrayArray8591[i_3][2];
                            aFloatArrayArray8591[i_3][2] = f_4;
                        }
                    }
                }

                aBool8621 = false;
                anInt8598 = 0;
            }
        }
    }

    @Override
    public void oa(int i_1, int i_2, int i_3) {
        if (i_1 != 128 && (anInt8575 & 0x1) != 1) {
            throw new IllegalStateException();
        } else if (i_2 != 128 && (anInt8575 & 0x2) != 2) {
            throw new IllegalStateException();
        } else if (i_3 != 128 && (anInt8575 & 0x4) != 4) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] = anIntArray8580[i_5] * i_1 >> 7;
                    anIntArray8581[i_5] = i_2 * anIntArray8581[i_5] >> 7;
                    anIntArray8610[i_5] = i_3 * anIntArray8610[i_5] >> 7;
                }

                aBool8621 = false;
            }
        }
    }

    @Override
    void bp() {
        if (aBool8589) {
            for (int i_1 = 0; i_1 < anInt8578; i_1++) {
                anIntArray8580[i_1] = anIntArray8580[i_1] + 7 >> 4;
                anIntArray8581[i_1] = anIntArray8581[i_1] + 7 >> 4;
                anIntArray8610[i_1] = anIntArray8610[i_1] + 7 >> 4;
            }

            aBool8589 = false;
        }

        if (aBool8609) {
            method13801();
            aBool8609 = false;
        }

        aBool8621 = false;
    }

    void method13812() {
        aClass189Array8584 = null;
        aClass189Array8585 = null;
        aClass195Array8599 = null;
        aBool8621 = false;
    }

    @Override
    public void method11273(Matrix44Var matrix44var_1) {
        method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
        Matrix44 matrix44_2 = aClass185_8564.aClass384_2317;
        matrix44_2.fromVarMatrix44(matrix44var_1);
        int i_3;
        if (aClass87Array8615 != null) {
            for (i_3 = 0; i_3 < aClass87Array8615.length; i_3++) {
                ParticleEmitterConfig class87_4 = aClass87Array8615[i_3];
                ParticleEmitterConfig class87_5 = class87_4;
                if (class87_4.aClass87_835 != null) {
                    class87_5 = class87_4.aClass87_835;
                }

                class87_5.anInt844 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceX] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceX] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceX]);
                class87_5.anInt841 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceX] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceX] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceX]);
                class87_5.anInt847 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceX] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceX] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceX]);
                class87_5.anInt834 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceY] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceY] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceY]);
                class87_5.anInt843 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceY] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceY] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceY]);
                class87_5.anInt845 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceY] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceY] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceY]);
                class87_5.anInt846 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceZ] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceZ] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceZ]);
                class87_5.anInt840 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceZ] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceZ] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceZ]);
                class87_5.anInt848 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceZ] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceZ] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceZ]);
            }
        }

        if (aClass172Array8616 != null) {
            for (i_3 = 0; i_3 < aClass172Array8616.length; i_3++) {
                SurfaceSkin class172_6 = aClass172Array8616[i_3];
                SurfaceSkin class172_7 = class172_6;
                if (class172_6.aClass172_2114 != null) {
                    class172_7 = class172_6.aClass172_2114;
                }

                if (class172_6.aClass384_2116 != null) {
                    class172_6.aClass384_2116.method6562(matrix44_2);
                } else {
                    class172_6.aClass384_2116 = new Matrix44(matrix44_2);
                }

                class172_7.anInt2113 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class172_6.anInt2119] + matrix44_2.buf[4] * anIntArray8581[class172_6.anInt2119] + matrix44_2.buf[8] * anIntArray8610[class172_6.anInt2119]);
                class172_7.anInt2117 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class172_6.anInt2119] + matrix44_2.buf[5] * anIntArray8581[class172_6.anInt2119] + matrix44_2.buf[9] * anIntArray8610[class172_6.anInt2119]);
                class172_7.anInt2118 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class172_6.anInt2119] + matrix44_2.buf[6] * anIntArray8581[class172_6.anInt2119] + matrix44_2.buf[10] * anIntArray8610[class172_6.anInt2119]);
            }
        }

    }

    @Override
    void method11261() {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
            synchronized (this) {
                aBool7023 = false;
                notifyAll();
            }
        }

    }

    @Override
    void ka() {
        if (aBool8589) {
            for (int i_1 = 0; i_1 < anInt8578; i_1++) {
                anIntArray8580[i_1] = anIntArray8580[i_1] + 7 >> 4;
                anIntArray8581[i_1] = anIntArray8581[i_1] + 7 >> 4;
                anIntArray8610[i_1] = anIntArray8610[i_1] + 7 >> 4;
            }

            aBool8589 = false;
        }

        if (aBool8609) {
            method13801();
            aBool8609 = false;
        }

        aBool8621 = false;
    }

    @Override
    void method11268(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
        int i_8 = ints_2.length;
        int i_9;
        int i_10;
        int i_13;
        int i_14;
        if (i_1 == 0) {
            i_3 <<= 4;
            i_4 <<= 4;
            i_5 <<= 4;
            if (!aBool8589) {
                for (i_9 = 0; i_9 < anInt8578; i_9++) {
                    anIntArray8580[i_9] <<= 4;
                    anIntArray8581[i_9] <<= 4;
                    anIntArray8610[i_9] <<= 4;
                }

                aBool8589 = true;
            }

            i_9 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_10 = 0; i_10 < i_8; i_10++) {
                int i_11 = ints_2[i_10];
                if (i_11 < anIntArrayArray8568.length) {
                    int[] ints_12 = anIntArrayArray8568[i_11];

                    for (i_13 = 0; i_13 < ints_12.length; i_13++) {
                        i_14 = ints_12[i_13];
                        anInt8611 += anIntArray8580[i_14];
                        anInt8607 += anIntArray8581[i_14];
                        anInt8613 += anIntArray8610[i_14];
                        ++i_9;
                    }
                }
            }

            if (i_9 > 0) {
                anInt8611 = i_3 + anInt8611 / i_9;
                anInt8607 = anInt8607 / i_9 + i_4;
                anInt8613 = i_5 + anInt8613 / i_9;
            } else {
                anInt8611 = i_3;
                anInt8607 = i_4;
                anInt8613 = i_5;
            }
        } else {
            int[] ints_18;
            int i_19;
            if (i_1 == 1) {
                i_3 <<= 4;
                i_4 <<= 4;
                i_5 <<= 4;
                if (!aBool8589) {
                    for (i_9 = 0; i_9 < anInt8578; i_9++) {
                        anIntArray8580[i_9] <<= 4;
                        anIntArray8581[i_9] <<= 4;
                        anIntArray8610[i_9] <<= 4;
                    }

                    aBool8589 = true;
                }

                for (i_9 = 0; i_9 < i_8; i_9++) {
                    i_10 = ints_2[i_9];
                    if (i_10 < anIntArrayArray8568.length) {
                        ints_18 = anIntArrayArray8568[i_10];

                        for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                            i_13 = ints_18[i_19];
                            anIntArray8580[i_13] += i_3;
                            anIntArray8581[i_13] += i_4;
                            anIntArray8610[i_13] += i_5;
                        }
                    }
                }
            } else {
                int i_15;
                int i_16;
                if (i_1 == 2) {
                    for (i_9 = 0; i_9 < i_8; i_9++) {
                        i_10 = ints_2[i_9];
                        if (i_10 < anIntArrayArray8568.length) {
                            ints_18 = anIntArrayArray8568[i_10];
                            if ((i_6 & 0x1) == 0) {
                                for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                    i_13 = ints_18[i_19];
                                    anIntArray8580[i_13] -= anInt8611;
                                    anIntArray8581[i_13] -= anInt8607;
                                    anIntArray8610[i_13] -= anInt8613;
                                    if (i_5 != 0) {
                                        i_14 = Trig.SINE[i_5];
                                        i_15 = Trig.COSINE[i_5];
                                        i_16 = i_14 * anIntArray8581[i_13] + i_15 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8581[i_13] = i_15 * anIntArray8581[i_13] - i_14 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    if (i_3 != 0) {
                                        i_14 = Trig.SINE[i_3];
                                        i_15 = Trig.COSINE[i_3];
                                        i_16 = i_15 * anIntArray8581[i_13] - i_14 * anIntArray8610[i_13] + 16383 >> 14;
                                        anIntArray8610[i_13] = i_14 * anIntArray8581[i_13] + i_15 * anIntArray8610[i_13] + 16383 >> 14;
                                        anIntArray8581[i_13] = i_16;
                                    }

                                    if (i_4 != 0) {
                                        i_14 = Trig.SINE[i_4];
                                        i_15 = Trig.COSINE[i_4];
                                        i_16 = i_14 * anIntArray8610[i_13] + i_15 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8610[i_13] = i_15 * anIntArray8610[i_13] - i_14 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    anIntArray8580[i_13] += anInt8611;
                                    anIntArray8581[i_13] += anInt8607;
                                    anIntArray8610[i_13] += anInt8613;
                                }
                            } else {
                                for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                    i_13 = ints_18[i_19];
                                    anIntArray8580[i_13] -= anInt8611;
                                    anIntArray8581[i_13] -= anInt8607;
                                    anIntArray8610[i_13] -= anInt8613;
                                    if (i_3 != 0) {
                                        i_14 = Trig.SINE[i_3];
                                        i_15 = Trig.COSINE[i_3];
                                        i_16 = i_15 * anIntArray8581[i_13] - i_14 * anIntArray8610[i_13] + 16383 >> 14;
                                        anIntArray8610[i_13] = i_14 * anIntArray8581[i_13] + i_15 * anIntArray8610[i_13] + 16383 >> 14;
                                        anIntArray8581[i_13] = i_16;
                                    }

                                    if (i_5 != 0) {
                                        i_14 = Trig.SINE[i_5];
                                        i_15 = Trig.COSINE[i_5];
                                        i_16 = i_14 * anIntArray8581[i_13] + i_15 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8581[i_13] = i_15 * anIntArray8581[i_13] - i_14 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    if (i_4 != 0) {
                                        i_14 = Trig.SINE[i_4];
                                        i_15 = Trig.COSINE[i_4];
                                        i_16 = i_14 * anIntArray8610[i_13] + i_15 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8610[i_13] = i_15 * anIntArray8610[i_13] - i_14 * anIntArray8580[i_13] + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    anIntArray8580[i_13] += anInt8611;
                                    anIntArray8581[i_13] += anInt8607;
                                    anIntArray8610[i_13] += anInt8613;
                                }
                            }
                        }
                    }
                } else if (i_1 == 3) {
                    for (i_9 = 0; i_9 < i_8; i_9++) {
                        i_10 = ints_2[i_9];
                        if (i_10 < anIntArrayArray8568.length) {
                            ints_18 = anIntArrayArray8568[i_10];

                            for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                i_13 = ints_18[i_19];
                                anIntArray8580[i_13] -= anInt8611;
                                anIntArray8581[i_13] -= anInt8607;
                                anIntArray8610[i_13] -= anInt8613;
                                anIntArray8580[i_13] = i_3 * anIntArray8580[i_13] / 128;
                                anIntArray8581[i_13] = i_4 * anIntArray8581[i_13] / 128;
                                anIntArray8610[i_13] = i_5 * anIntArray8610[i_13] / 128;
                                anIntArray8580[i_13] += anInt8611;
                                anIntArray8581[i_13] += anInt8607;
                                anIntArray8610[i_13] += anInt8613;
                            }
                        }
                    }
                } else {
                    Class193 class193_20;
                    Class176 class176_22;
                    if (i_1 == 5) {
                        if (anIntArrayArray8608 != null && aByteArray8602 != null) {
                            for (i_9 = 0; i_9 < i_8; i_9++) {
                                i_10 = ints_2[i_9];
                                if (i_10 < anIntArrayArray8608.length) {
                                    ints_18 = anIntArrayArray8608[i_10];

                                    for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                        i_13 = ints_18[i_19];
                                        i_14 = (aByteArray8602[i_13] & 0xff) + i_3 * 8;
                                        if (i_14 < 0) {
                                            i_14 = 0;
                                        } else if (i_14 > 255) {
                                            i_14 = 255;
                                        }

                                        aByteArray8602[i_13] = (byte) i_14;
                                    }
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_9 = 0; i_9 < anInt8617; i_9++) {
                                    class193_20 = aClass193Array8618[i_9];
                                    class176_22 = aClass176Array8582[i_9];
                                    class176_22.anInt2199 = class176_22.anInt2199 & 0xffffff | 255 - (aByteArray8602[class193_20.anInt2393] & 0xff) << 24;
                                }
                            }
                        }
                    } else if (i_1 == 7) {
                        if (anIntArrayArray8608 != null) {
                            for (i_9 = 0; i_9 < i_8; i_9++) {
                                i_10 = ints_2[i_9];
                                if (i_10 < anIntArrayArray8608.length) {
                                    ints_18 = anIntArrayArray8608[i_10];

                                    for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                        i_13 = ints_18[i_19];
                                        i_14 = aShortArray8604[i_13] & 0xffff;
                                        i_15 = i_14 >> 10 & 0x3f;
                                        i_16 = i_14 >> 7 & 0x7;
                                        int i_17 = i_14 & 0x7f;
                                        i_15 = i_3 + i_15 & 0x3f;
                                        i_16 += i_4;
                                        if (i_16 < 0) {
                                            i_16 = 0;
                                        } else if (i_16 > 7) {
                                            i_16 = 7;
                                        }

                                        i_17 += i_5;
                                        if (i_17 < 0) {
                                            i_17 = 0;
                                        } else if (i_17 > 127) {
                                            i_17 = 127;
                                        }

                                        aShortArray8604[i_13] = (short) (i_15 << 10 | i_16 << 7 | i_17);
                                    }

                                    aBool8609 = true;
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_9 = 0; i_9 < anInt8617; i_9++) {
                                    class193_20 = aClass193Array8618[i_9];
                                    class176_22 = aClass176Array8582[i_9];
                                    class176_22.anInt2199 = class176_22.anInt2199 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_20.anInt2393] & 0xffff) & 0xffff] & 0xffffff;
                                }
                            }
                        }
                    } else {
                        Class176 class176_21;
                        if (i_1 == 8) {
                            if (anIntArrayArray8620 != null) {
                                for (i_9 = 0; i_9 < i_8; i_9++) {
                                    i_10 = ints_2[i_9];
                                    if (i_10 < anIntArrayArray8620.length) {
                                        ints_18 = anIntArrayArray8620[i_10];

                                        for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                            class176_21 = aClass176Array8582[ints_18[i_19]];
                                            class176_21.anInt2192 += i_3;
                                            class176_21.anInt2189 += i_4;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 10) {
                            if (anIntArrayArray8620 != null) {
                                for (i_9 = 0; i_9 < i_8; i_9++) {
                                    i_10 = ints_2[i_9];
                                    if (i_10 < anIntArrayArray8620.length) {
                                        ints_18 = anIntArrayArray8620[i_10];

                                        for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                            class176_21 = aClass176Array8582[ints_18[i_19]];
                                            class176_21.aFloat2190 = class176_21.aFloat2190 * i_3 / 128.0F;
                                            class176_21.aFloat2191 = class176_21.aFloat2191 * i_4 / 128.0F;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 9 && anIntArrayArray8620 != null) {
                            for (i_9 = 0; i_9 < i_8; i_9++) {
                                i_10 = ints_2[i_9];
                                if (i_10 < anIntArrayArray8620.length) {
                                    ints_18 = anIntArrayArray8620[i_10];

                                    for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                        class176_21 = aClass176Array8582[ints_18[i_19]];
                                        class176_21.anInt2194 = i_3 + class176_21.anInt2194 & 0x3fff;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    void e(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
        int i_31 = i_3;
        int i_41 = i_4;
        int i_51 = i_5;
        int i_9 = ints_2.length;
        int i_10;
        int i_11;
        int i_12;
        int i_14;
        int i_15;
        if (i_1 == 0) {
            i_31 <<= 4;
            i_41 <<= 4;
            i_51 <<= 4;
            if (!aBool8589) {
                for (i_10 = 0; i_10 < anInt8578; i_10++) {
                    anIntArray8580[i_10] <<= 4;
                    anIntArray8581[i_10] <<= 4;
                    anIntArray8610[i_10] <<= 4;
                }

                aBool8589 = true;
            }

            i_10 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_11 = 0; i_11 < i_9; i_11++) {
                i_12 = ints_2[i_11];
                if (i_12 < anIntArrayArray8568.length) {
                    int[] ints_13 = anIntArrayArray8568[i_12];

                    for (i_14 = 0; i_14 < ints_13.length; i_14++) {
                        i_15 = ints_13[i_14];
                        if (aShortArray8569 == null || (i_7 & aShortArray8569[i_15]) != 0) {
                            anInt8611 += anIntArray8580[i_15];
                            anInt8607 += anIntArray8581[i_15];
                            anInt8613 += anIntArray8610[i_15];
                            ++i_10;
                        }
                    }
                }
            }

            if (i_10 > 0) {
                anInt8611 = i_31 + anInt8611 / i_10;
                anInt8607 = anInt8607 / i_10 + i_41;
                anInt8613 = i_51 + anInt8613 / i_10;
                aBool8614 = true;
            } else {
                anInt8611 = i_31;
                anInt8607 = i_41;
                anInt8613 = i_51;
            }
        } else {
            int i_47;
            int[] ints_49;
            if (i_1 == 1) {
                if (ints_8 != null) {
                    i_10 = i_51 * ints_8[2] + ints_8[1] * i_41 + i_31 * ints_8[0] + 8192 >> 14;
                    i_11 = i_31 * ints_8[3] + i_51 * ints_8[5] + i_41 * ints_8[4] + 8192 >> 14;
                    i_12 = i_31 * ints_8[6] + ints_8[7] * i_41 + i_51 * ints_8[8] + 8192 >> 14;
                    i_31 = i_10;
                    i_41 = i_11;
                    i_51 = i_12;
                }

                i_31 <<= 4;
                i_41 <<= 4;
                i_51 <<= 4;
                if (!aBool8589) {
                    for (i_10 = 0; i_10 < anInt8578; i_10++) {
                        anIntArray8580[i_10] <<= 4;
                        anIntArray8581[i_10] <<= 4;
                        anIntArray8610[i_10] <<= 4;
                    }

                    aBool8589 = true;
                }

                for (i_10 = 0; i_10 < i_9; i_10++) {
                    i_11 = ints_2[i_10];
                    if (i_11 < anIntArrayArray8568.length) {
                        ints_49 = anIntArrayArray8568[i_11];

                        for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                            i_14 = ints_49[i_47];
                            if (aShortArray8569 == null || (i_7 & aShortArray8569[i_14]) != 0) {
                                anIntArray8580[i_14] += i_31;
                                anIntArray8581[i_14] += i_41;
                                anIntArray8610[i_14] += i_51;
                            }
                        }
                    }
                }
            } else {
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                int i_21;
                int i_22;
                int i_23;
                int i_24;
                int i_26;
                int i_27;
                int i_28;
                int i_30;
                int i_32;
                int i_33;
                int i_34;
                int[] ints_35;
                int i_36;
                int i_37;
                int i_38;
                int i_39;
                int i_40;
                if (i_1 == 2) {
                    if (ints_8 != null) {
                        if (!aBool8589) {
                            for (i_10 = 0; i_10 < anInt8578; i_10++) {
                                anIntArray8580[i_10] <<= 4;
                                anIntArray8581[i_10] <<= 4;
                                anIntArray8610[i_10] <<= 4;
                            }

                            aBool8589 = true;
                        }

                        i_10 = ints_8[9] << 4;
                        i_11 = ints_8[10] << 4;
                        i_12 = ints_8[11] << 4;
                        i_47 = ints_8[12] << 4;
                        i_14 = ints_8[13] << 4;
                        i_15 = ints_8[14] << 4;
                        if (aBool8614) {
                            i_16 = ints_8[6] * anInt8613 + ints_8[3] * anInt8607 + anInt8611 * ints_8[0] + 8192 >> 14;
                            i_17 = ints_8[7] * anInt8613 + ints_8[1] * anInt8611 + ints_8[4] * anInt8607 + 8192 >> 14;
                            i_18 = ints_8[8] * anInt8613 + ints_8[2] * anInt8611 + ints_8[5] * anInt8607 + 8192 >> 14;
                            i_16 += i_47;
                            i_17 += i_14;
                            i_18 += i_15;
                            anInt8611 = i_16;
                            anInt8607 = i_17;
                            anInt8613 = i_18;
                            aBool8614 = false;
                        }

                        int[] ints_48 = new int[9];
                        i_17 = Trig.COSINE[i_31];
                        i_18 = Trig.SINE[i_31];
                        i_19 = Trig.COSINE[i_41];
                        i_20 = Trig.SINE[i_41];
                        i_21 = Trig.COSINE[i_51];
                        i_22 = Trig.SINE[i_51];
                        i_23 = i_18 * i_21 + 8192 >> 14;
                        i_24 = i_18 * i_22 + 8192 >> 14;
                        ints_48[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
                        ints_48[1] = i_20 * i_23 + -i_19 * i_22 + 8192 >> 14;
                        ints_48[2] = i_20 * i_17 + 8192 >> 14;
                        ints_48[3] = i_17 * i_22 + 8192 >> 14;
                        ints_48[4] = i_17 * i_21 + 8192 >> 14;
                        ints_48[5] = -i_18;
                        ints_48[6] = i_19 * i_24 + -i_20 * i_21 + 8192 >> 14;
                        ints_48[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
                        ints_48[8] = i_19 * i_17 + 8192 >> 14;
                        int i_25 = ints_48[2] * -anInt8613 + ints_48[0] * -anInt8611 + ints_48[1] * -anInt8607 + 8192 >> 14;
                        i_26 = ints_48[5] * -anInt8613 + ints_48[4] * -anInt8607 + ints_48[3] * -anInt8611 + 8192 >> 14;
                        i_27 = ints_48[6] * -anInt8611 + ints_48[8] * -anInt8613 + ints_48[7] * -anInt8607 + 8192 >> 14;
                        i_28 = i_25 + anInt8611;
                        int i_29 = i_26 + anInt8607;
                        i_30 = i_27 + anInt8613;
                        int[] ints_31 = new int[9];

                        for (i_32 = 0; i_32 < 3; i_32++) {
                            for (i_33 = 0; i_33 < 3; i_33++) {
                                i_34 = 0;

                                for (int i_54 = 0; i_54 < 3; i_54++) {
                                    i_34 += ints_8[i_54 + i_33 * 3] * ints_48[i_54 + i_32 * 3];
                                }

                                ints_31[i_33 + i_32 * 3] = i_34 + 8192 >> 14;
                            }
                        }

                        i_32 = i_14 * ints_48[1] + i_47 * ints_48[0] + i_15 * ints_48[2] + 8192 >> 14;
                        i_33 = i_14 * ints_48[4] + i_47 * ints_48[3] + i_15 * ints_48[5] + 8192 >> 14;
                        i_34 = ints_48[6] * i_47 + i_15 * ints_48[8] + ints_48[7] * i_14 + 8192 >> 14;
                        i_32 += i_28;
                        i_33 += i_29;
                        i_34 += i_30;
                        ints_35 = new int[9];

                        for (i_36 = 0; i_36 < 3; i_36++) {
                            for (i_37 = 0; i_37 < 3; i_37++) {
                                i_38 = 0;

                                for (i_39 = 0; i_39 < 3; i_39++) {
                                    i_38 += ints_31[i_37 + i_39 * 3] * ints_8[i_39 + i_36 * 3];
                                }

                                ints_35[i_37 + i_36 * 3] = i_38 + 8192 >> 14;
                            }
                        }

                        i_36 = i_34 * ints_8[2] + i_32 * ints_8[0] + i_33 * ints_8[1] + 8192 >> 14;
                        i_37 = i_32 * ints_8[3] + i_33 * ints_8[4] + ints_8[5] * i_34 + 8192 >> 14;
                        i_38 = i_32 * ints_8[6] + i_34 * ints_8[8] + ints_8[7] * i_33 + 8192 >> 14;
                        i_36 += i_10;
                        i_37 += i_11;
                        i_38 += i_12;

                        for (i_39 = 0; i_39 < i_9; i_39++) {
                            i_40 = ints_2[i_39];
                            if (i_40 < anIntArrayArray8568.length) {
                                int[] ints_41 = anIntArrayArray8568[i_40];

                                for (int i_42 = 0; i_42 < ints_41.length; i_42++) {
                                    int i_43 = ints_41[i_42];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_43]) != 0) {
                                        int i_44 = ints_35[0] * anIntArray8580[i_43] + ints_35[2] * anIntArray8610[i_43] + ints_35[1] * anIntArray8581[i_43] + 8192 >> 14;
                                        int i_45 = ints_35[4] * anIntArray8581[i_43] + ints_35[5] * anIntArray8610[i_43] + ints_35[3] * anIntArray8580[i_43] + 8192 >> 14;
                                        int i_46 = ints_35[6] * anIntArray8580[i_43] + ints_35[7] * anIntArray8581[i_43] + ints_35[8] * anIntArray8610[i_43] + 8192 >> 14;
                                        i_44 += i_36;
                                        i_45 += i_37;
                                        i_46 += i_38;
                                        anIntArray8580[i_43] = i_44;
                                        anIntArray8581[i_43] = i_45;
                                        anIntArray8610[i_43] = i_46;
                                    }
                                }
                            }
                        }
                    } else {
                        for (i_10 = 0; i_10 < i_9; i_10++) {
                            i_11 = ints_2[i_10];
                            if (i_11 < anIntArrayArray8568.length) {
                                ints_49 = anIntArrayArray8568[i_11];

                                for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                    i_14 = ints_49[i_47];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_14]) != 0) {
                                        anIntArray8580[i_14] -= anInt8611;
                                        anIntArray8581[i_14] -= anInt8607;
                                        anIntArray8610[i_14] -= anInt8613;
                                        if (i_51 != 0) {
                                            i_15 = Trig.SINE[i_51];
                                            i_16 = Trig.COSINE[i_51];
                                            i_17 = i_15 * anIntArray8581[i_14] + i_16 * anIntArray8580[i_14] + 16383 >> 14;
                                            anIntArray8581[i_14] = i_16 * anIntArray8581[i_14] - i_15 * anIntArray8580[i_14] + 16383 >> 14;
                                            anIntArray8580[i_14] = i_17;
                                        }

                                        if (i_31 != 0) {
                                            i_15 = Trig.SINE[i_31];
                                            i_16 = Trig.COSINE[i_31];
                                            i_17 = i_16 * anIntArray8581[i_14] - i_15 * anIntArray8610[i_14] + 16383 >> 14;
                                            anIntArray8610[i_14] = i_15 * anIntArray8581[i_14] + i_16 * anIntArray8610[i_14] + 16383 >> 14;
                                            anIntArray8581[i_14] = i_17;
                                        }

                                        if (i_41 != 0) {
                                            i_15 = Trig.SINE[i_41];
                                            i_16 = Trig.COSINE[i_41];
                                            i_17 = i_15 * anIntArray8610[i_14] + i_16 * anIntArray8580[i_14] + 16383 >> 14;
                                            anIntArray8610[i_14] = i_16 * anIntArray8610[i_14] - i_15 * anIntArray8580[i_14] + 16383 >> 14;
                                            anIntArray8580[i_14] = i_17;
                                        }

                                        anIntArray8580[i_14] += anInt8611;
                                        anIntArray8581[i_14] += anInt8607;
                                        anIntArray8610[i_14] += anInt8613;
                                    }
                                }
                            }
                        }
                    }
                } else if (i_1 == 3) {
                    if (ints_8 != null) {
                        if (!aBool8589) {
                            for (i_10 = 0; i_10 < anInt8578; i_10++) {
                                anIntArray8580[i_10] <<= 4;
                                anIntArray8581[i_10] <<= 4;
                                anIntArray8610[i_10] <<= 4;
                            }

                            aBool8589 = true;
                        }

                        i_10 = ints_8[9] << 4;
                        i_11 = ints_8[10] << 4;
                        i_12 = ints_8[11] << 4;
                        i_47 = ints_8[12] << 4;
                        i_14 = ints_8[13] << 4;
                        i_15 = ints_8[14] << 4;
                        if (aBool8614) {
                            i_16 = ints_8[6] * anInt8613 + ints_8[3] * anInt8607 + anInt8611 * ints_8[0] + 8192 >> 14;
                            i_17 = ints_8[7] * anInt8613 + ints_8[1] * anInt8611 + ints_8[4] * anInt8607 + 8192 >> 14;
                            i_18 = ints_8[8] * anInt8613 + ints_8[2] * anInt8611 + ints_8[5] * anInt8607 + 8192 >> 14;
                            i_16 += i_47;
                            i_17 += i_14;
                            i_18 += i_15;
                            anInt8611 = i_16;
                            anInt8607 = i_17;
                            anInt8613 = i_18;
                            aBool8614 = false;
                        }

                        i_16 = i_31 << 15 >> 7;
                        i_17 = i_41 << 15 >> 7;
                        i_18 = i_51 << 15 >> 7;
                        i_19 = i_16 * -anInt8611 + 8192 >> 14;
                        i_20 = i_17 * -anInt8607 + 8192 >> 14;
                        i_21 = i_18 * -anInt8613 + 8192 >> 14;
                        i_22 = i_19 + anInt8611;
                        i_23 = i_20 + anInt8607;
                        i_24 = i_21 + anInt8613;
                        int[] ints_50 = {i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, ints_8[7] * i_17 + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, ints_8[5] * i_18 + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14};
                        i_26 = i_16 * i_47 + 8192 >> 14;
                        i_27 = i_17 * i_14 + 8192 >> 14;
                        i_28 = i_18 * i_15 + 8192 >> 14;
                        i_26 += i_22;
                        i_27 += i_23;
                        i_28 += i_24;
                        int[] ints_51 = new int[9];

                        int i_52;
                        for (i_30 = 0; i_30 < 3; i_30++) {
                            for (i_52 = 0; i_52 < 3; i_52++) {
                                i_32 = 0;

                                for (i_33 = 0; i_33 < 3; i_33++) {
                                    i_32 += ints_50[i_52 + i_33 * 3] * ints_8[i_33 + i_30 * 3];
                                }

                                ints_51[i_52 + i_30 * 3] = i_32 + 8192 >> 14;
                            }
                        }

                        i_30 = i_28 * ints_8[2] + i_26 * ints_8[0] + i_27 * ints_8[1] + 8192 >> 14;
                        i_52 = i_26 * ints_8[3] + i_27 * ints_8[4] + ints_8[5] * i_28 + 8192 >> 14;
                        i_32 = i_26 * ints_8[6] + i_28 * ints_8[8] + ints_8[7] * i_27 + 8192 >> 14;
                        i_30 += i_10;
                        i_52 += i_11;
                        i_32 += i_12;

                        for (i_33 = 0; i_33 < i_9; i_33++) {
                            i_34 = ints_2[i_33];
                            if (i_34 < anIntArrayArray8568.length) {
                                ints_35 = anIntArrayArray8568[i_34];

                                for (i_36 = 0; i_36 < ints_35.length; i_36++) {
                                    i_37 = ints_35[i_36];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_37]) != 0) {
                                        i_38 = ints_51[0] * anIntArray8580[i_37] + ints_51[2] * anIntArray8610[i_37] + ints_51[1] * anIntArray8581[i_37] + 8192 >> 14;
                                        i_39 = ints_51[4] * anIntArray8581[i_37] + ints_51[5] * anIntArray8610[i_37] + ints_51[3] * anIntArray8580[i_37] + 8192 >> 14;
                                        i_40 = ints_51[6] * anIntArray8580[i_37] + ints_51[7] * anIntArray8581[i_37] + ints_51[8] * anIntArray8610[i_37] + 8192 >> 14;
                                        i_38 += i_30;
                                        i_39 += i_52;
                                        i_40 += i_32;
                                        anIntArray8580[i_37] = i_38;
                                        anIntArray8581[i_37] = i_39;
                                        anIntArray8610[i_37] = i_40;
                                    }
                                }
                            }
                        }
                    } else {
                        for (i_10 = 0; i_10 < i_9; i_10++) {
                            i_11 = ints_2[i_10];
                            if (i_11 < anIntArrayArray8568.length) {
                                ints_49 = anIntArrayArray8568[i_11];

                                for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                    i_14 = ints_49[i_47];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_14]) != 0) {
                                        anIntArray8580[i_14] -= anInt8611;
                                        anIntArray8581[i_14] -= anInt8607;
                                        anIntArray8610[i_14] -= anInt8613;
                                        anIntArray8580[i_14] = i_31 * anIntArray8580[i_14] / 128;
                                        anIntArray8581[i_14] = i_41 * anIntArray8581[i_14] / 128;
                                        anIntArray8610[i_14] = i_51 * anIntArray8610[i_14] / 128;
                                        anIntArray8580[i_14] += anInt8611;
                                        anIntArray8581[i_14] += anInt8607;
                                        anIntArray8610[i_14] += anInt8613;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Class193 class193_53;
                    Class176 class176_56;
                    if (i_1 == 5) {
                        if (anIntArrayArray8608 != null && aByteArray8602 != null) {
                            for (i_10 = 0; i_10 < i_9; i_10++) {
                                i_11 = ints_2[i_10];
                                if (i_11 < anIntArrayArray8608.length) {
                                    ints_49 = anIntArrayArray8608[i_11];

                                    for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                        i_14 = ints_49[i_47];
                                        if (aShortArray8632 == null || (i_7 & aShortArray8632[i_14]) != 0) {
                                            i_15 = (aByteArray8602[i_14] & 0xff) + i_31 * 8;
                                            if (i_15 < 0) {
                                                i_15 = 0;
                                            } else if (i_15 > 255) {
                                                i_15 = 255;
                                            }

                                            aByteArray8602[i_14] = (byte) i_15;
                                        }
                                    }
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_10 = 0; i_10 < anInt8617; i_10++) {
                                    class193_53 = aClass193Array8618[i_10];
                                    class176_56 = aClass176Array8582[i_10];
                                    class176_56.anInt2199 = class176_56.anInt2199 & 0xffffff | 255 - (aByteArray8602[class193_53.anInt2393] & 0xff) << 24;
                                }
                            }
                        }
                    } else if (i_1 == 7) {
                        if (anIntArrayArray8608 != null) {
                            for (i_10 = 0; i_10 < i_9; i_10++) {
                                i_11 = ints_2[i_10];
                                if (i_11 < anIntArrayArray8608.length) {
                                    ints_49 = anIntArrayArray8608[i_11];

                                    for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                        i_14 = ints_49[i_47];
                                        if (aShortArray8632 == null || (i_7 & aShortArray8632[i_14]) != 0) {
                                            i_15 = aShortArray8604[i_14] & 0xffff;
                                            i_16 = i_15 >> 10 & 0x3f;
                                            i_17 = i_15 >> 7 & 0x7;
                                            i_18 = i_15 & 0x7f;
                                            i_16 = i_31 + i_16 & 0x3f;
                                            i_17 += i_41;
                                            if (i_17 < 0) {
                                                i_17 = 0;
                                            } else if (i_17 > 7) {
                                                i_17 = 7;
                                            }

                                            i_18 += i_51;
                                            if (i_18 < 0) {
                                                i_18 = 0;
                                            } else if (i_18 > 127) {
                                                i_18 = 127;
                                            }

                                            aShortArray8604[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
                                        }
                                    }

                                    aBool8609 = true;
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_10 = 0; i_10 < anInt8617; i_10++) {
                                    class193_53 = aClass193Array8618[i_10];
                                    class176_56 = aClass176Array8582[i_10];
                                    class176_56.anInt2199 = class176_56.anInt2199 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_53.anInt2393] & 0xffff) & 0xffff] & 0xffffff;
                                }
                            }
                        }
                    } else {
                        Class176 class176_55;
                        if (i_1 == 8) {
                            if (anIntArrayArray8620 != null) {
                                for (i_10 = 0; i_10 < i_9; i_10++) {
                                    i_11 = ints_2[i_10];
                                    if (i_11 < anIntArrayArray8620.length) {
                                        ints_49 = anIntArrayArray8620[i_11];

                                        for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                            class176_55 = aClass176Array8582[ints_49[i_47]];
                                            class176_55.anInt2192 += i_31;
                                            class176_55.anInt2189 += i_41;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 10) {
                            if (anIntArrayArray8620 != null) {
                                for (i_10 = 0; i_10 < i_9; i_10++) {
                                    i_11 = ints_2[i_10];
                                    if (i_11 < anIntArrayArray8620.length) {
                                        ints_49 = anIntArrayArray8620[i_11];

                                        for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                            class176_55 = aClass176Array8582[ints_49[i_47]];
                                            class176_55.aFloat2190 = class176_55.aFloat2190 * i_31 / 128.0F;
                                            class176_55.aFloat2191 = class176_55.aFloat2191 * i_41 / 128.0F;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 9 && anIntArrayArray8620 != null) {
                            for (i_10 = 0; i_10 < i_9; i_10++) {
                                i_11 = ints_2[i_10];
                                if (i_11 < anIntArrayArray8620.length) {
                                    ints_49 = anIntArrayArray8620[i_11];

                                    for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                        class176_55 = aClass176Array8582[ints_49[i_47]];
                                        class176_55.anInt2194 = i_31 + class176_55.anInt2194 & 0x3fff;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    void w(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (i_1 == 0) {
            i_5 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_6 = 0; i_6 < anInt8578; i_6++) {
                anInt8611 += anIntArray8580[i_6];
                anInt8607 += anIntArray8581[i_6];
                anInt8613 += anIntArray8610[i_6];
                ++i_5;
            }

            if (i_5 > 0) {
                anInt8611 = anInt8611 / i_5 + i_2;
                anInt8607 = i_3 + anInt8607 / i_5;
                anInt8613 = anInt8613 / i_5 + i_4;
            } else {
                anInt8611 = i_2;
                anInt8607 = i_3;
                anInt8613 = i_4;
            }
        } else if (i_1 == 1) {
            for (i_5 = 0; i_5 < anInt8578; i_5++) {
                anIntArray8580[i_5] += i_2;
                anIntArray8581[i_5] += i_3;
                anIntArray8610[i_5] += i_4;
            }
        } else {
            int i_7;
            int i_8;
            if (i_1 == 2) {
                for (i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] -= anInt8611;
                    anIntArray8581[i_5] -= anInt8607;
                    anIntArray8610[i_5] -= anInt8613;
                    if (i_4 != 0) {
                        i_6 = Trig.SINE[i_4];
                        i_7 = Trig.COSINE[i_4];
                        i_8 = i_6 * anIntArray8581[i_5] + i_7 * anIntArray8580[i_5] + 16383 >> 14;
                        anIntArray8581[i_5] = i_7 * anIntArray8581[i_5] - i_6 * anIntArray8580[i_5] + 16383 >> 14;
                        anIntArray8580[i_5] = i_8;
                    }

                    if (i_2 != 0) {
                        i_6 = Trig.SINE[i_2];
                        i_7 = Trig.COSINE[i_2];
                        i_8 = i_7 * anIntArray8581[i_5] - i_6 * anIntArray8610[i_5] + 16383 >> 14;
                        anIntArray8610[i_5] = i_6 * anIntArray8581[i_5] + i_7 * anIntArray8610[i_5] + 16383 >> 14;
                        anIntArray8581[i_5] = i_8;
                    }

                    if (i_3 != 0) {
                        i_6 = Trig.SINE[i_3];
                        i_7 = Trig.COSINE[i_3];
                        i_8 = i_6 * anIntArray8610[i_5] + i_7 * anIntArray8580[i_5] + 16383 >> 14;
                        anIntArray8610[i_5] = i_7 * anIntArray8610[i_5] - i_6 * anIntArray8580[i_5] + 16383 >> 14;
                        anIntArray8580[i_5] = i_8;
                    }

                    anIntArray8580[i_5] += anInt8611;
                    anIntArray8581[i_5] += anInt8607;
                    anIntArray8610[i_5] += anInt8613;
                }
            } else if (i_1 == 3) {
                for (i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] -= anInt8611;
                    anIntArray8581[i_5] -= anInt8607;
                    anIntArray8610[i_5] -= anInt8613;
                    anIntArray8580[i_5] = i_2 * anIntArray8580[i_5] / 128;
                    anIntArray8581[i_5] = i_3 * anIntArray8581[i_5] / 128;
                    anIntArray8610[i_5] = i_4 * anIntArray8610[i_5] / 128;
                    anIntArray8580[i_5] += anInt8611;
                    anIntArray8581[i_5] += anInt8607;
                    anIntArray8610[i_5] += anInt8613;
                }
            } else {
                Class193 class193_10;
                Class176 class176_11;
                if (i_1 == 5) {
                    for (i_5 = 0; i_5 < anInt8586; i_5++) {
                        i_6 = (aByteArray8602[i_5] & 0xff) + i_2 * 8;
                        if (i_6 < 0) {
                            i_6 = 0;
                        } else if (i_6 > 255) {
                            i_6 = 255;
                        }

                        aByteArray8602[i_5] = (byte) i_6;
                    }

                    if (aClass193Array8618 != null) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class193_10 = aClass193Array8618[i_5];
                            class176_11 = aClass176Array8582[i_5];
                            class176_11.anInt2199 = class176_11.anInt2199 & 0xffffff | 255 - (aByteArray8602[class193_10.anInt2393] & 0xff) << 24;
                        }
                    }
                } else if (i_1 == 7) {
                    for (i_5 = 0; i_5 < anInt8586; i_5++) {
                        i_6 = aShortArray8604[i_5] & 0xffff;
                        i_7 = i_6 >> 10 & 0x3f;
                        i_8 = i_6 >> 7 & 0x7;
                        int i_9 = i_6 & 0x7f;
                        i_7 = i_7 + i_2 & 0x3f;
                        i_8 += i_3;
                        if (i_8 < 0) {
                            i_8 = 0;
                        } else if (i_8 > 7) {
                            i_8 = 7;
                        }

                        i_9 += i_4;
                        if (i_9 < 0) {
                            i_9 = 0;
                        } else if (i_9 > 127) {
                            i_9 = 127;
                        }

                        aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
                    }

                    aBool8609 = true;
                    if (aClass193Array8618 != null) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class193_10 = aClass193Array8618[i_5];
                            class176_11 = aClass176Array8582[i_5];
                            class176_11.anInt2199 = class176_11.anInt2199 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_10.anInt2393] & 0xffff) & 0xffff] & 0xffffff;
                        }
                    }
                } else {
                    Class176 class176_12;
                    if (i_1 == 8) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.anInt2192 += i_2;
                            class176_12.anInt2189 += i_3;
                        }
                    } else if (i_1 == 10) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.aFloat2190 = class176_12.aFloat2190 * i_2 / 128.0F;
                            class176_12.aFloat2191 = class176_12.aFloat2191 * i_3 / 128.0F;
                        }
                    } else if (i_1 == 9) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.anInt2194 = i_2 + class176_12.anInt2194 & 0x3fff;
                        }
                    }
                }
            }
        }

    }

    @Override
    public int cd() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8629;
    }

    @Override
    public int ar() {
        return anInt8575;
    }

    void method13814(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
        if (anInt8579 >= 1) {
            Class185 class185_4 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
            Matrix44 matrix44_5 = class185_4.aClass384_2317;
            matrix44_5.fromVarMatrix44(matrix44var_1);
            Matrix44 matrix44_6 = aGraphicalRenderer_Sub3_8638.aClass384_8994;
            Matrix44 matrix44_7 = aGraphicalRenderer_Sub3_8638.aClass384_8995;
            if (!aBool8621) {
                method13876();
            }

            boolean bool_8 = matrix44_5.method6526();
            float[] floats_9 = class185_4.aFloatArray2324;
            matrix44_5.method6527(0.0F, aShort8570, 0.0F, floats_9);
            float f_10 = floats_9[0];
            float f_11 = floats_9[1];
            float f_12 = floats_9[2];
            matrix44_5.method6527(0.0F, aShort8625, 0.0F, floats_9);
            float f_13 = floats_9[0];
            float f_14 = floats_9[1];
            float f_15 = floats_9[2];

            float f_18;
            float f_19;
            for (int i_16 = 0; i_16 < 6; i_16++) {
                float[] floats_17 = aGraphicalRenderer_Sub3_8638.aFloatArrayArray8989[i_16];
                f_18 = floats_17[0] * f_10 + floats_17[1] * f_11 + floats_17[2] * f_12 + floats_17[3] + aShort8595;
                f_19 = floats_17[0] * f_13 + floats_17[1] * f_14 + floats_17[2] * f_15 + floats_17[3] + aShort8595;
                if (f_18 < 0.0F && f_19 < 0.0F) {
                    return;
                }
            }

            float f_46;
            float f_56;
            if (bool_8) {
                f_56 = matrix44_6.buf[14];
                f_46 = matrix44_6.buf[6];
            } else {
                f_56 = matrix44_5.buf[12] * matrix44_6.buf[2] + matrix44_5.buf[13] * matrix44_6.buf[6] + matrix44_5.buf[14] * matrix44_6.buf[10] + matrix44_6.buf[14];
                f_46 = matrix44_5.buf[4] * matrix44_6.buf[2] + matrix44_5.buf[5] * matrix44_6.buf[6] + matrix44_5.buf[6] * matrix44_6.buf[10];
            }

            f_18 = f_56 + aShort8570 * f_46;
            f_19 = f_56 + aShort8625 * f_46;
            float f_20 = f_18 > f_19 ? f_18 + aShort8595 : f_19 + aShort8595;
            float f_21 = matrix44_7.buf[10] * f_20 + matrix44_7.buf[14];
            if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
                synchronized (this) {
                    while (aBool8563) {
                        try {
                            wait();
                        } catch (InterruptedException ignored) {
                        }
                    }

                    aBool8563 = true;
                }
            }

            method13795(class185_4);
            Matrix44 matrix44_22 = aClass185_8564.aClass384_2318;
            matrix44_22.method6562(matrix44_5);
            matrix44_22.method6523(aGraphicalRenderer_Sub3_8638.aClass384_8996);
            aClass144_8566.method2418((i_3 & 0x2) != 0);

            boolean bool_47 = false;
            aClass185_8564.aFloat2326 = aClass144_8566.aFloat1679;
            aClass185_8564.aFloat2332 = aClass144_8566.aFloat1702;
            aClass185_8564.aFloat2311 = aClass144_8566.aFloat1683;
            aClass185_8564.aFloat2308 = 1.0F / aClass144_8566.aFloat1683;
            aClass185_8564.aFloat2331 = aClass144_8566.aFloat1678;
            aClass185_8564.aFloat2333 = aClass144_8566.aFloat1680;
            aClass185_8564.aFloat2335 = aClass144_8566.aFloat1682;
            aClass185_8564.anInt2337 = aClass144_8566.anInt1684;

            int i_24;
            int i_26;
            int i_27;
            float f_31;
            for (i_24 = 0; i_24 < anInt8578; i_24++) {
                int i_25 = anIntArray8580[i_24];
                i_26 = anIntArray8581[i_24];
                i_27 = anIntArray8610[i_24];
                float f_28 = matrix44_22.buf[0] * i_25 + matrix44_22.buf[4] * i_26 + matrix44_22.buf[8] * i_27 + matrix44_22.buf[12];
                float f_29 = matrix44_22.buf[1] * i_25 + matrix44_22.buf[5] * i_26 + matrix44_22.buf[9] * i_27 + matrix44_22.buf[13];
                float f_30 = matrix44_22.buf[2] * i_25 + matrix44_22.buf[6] * i_26 + matrix44_22.buf[10] * i_27 + matrix44_22.buf[14];
                f_31 = matrix44_22.buf[3] * i_25 + matrix44_22.buf[7] * i_26 + matrix44_22.buf[11] * i_27 + matrix44_22.buf[15];
                aFloatArray8636[i_24] = aClass185_8564.aFloat2335 + aClass185_8564.aFloat2311 * f_30 / f_31;
                aFloatArray8637[i_24] = f_31;
                if (f_30 >= -f_31) {
                    aFloatArray8590[i_24] = ((int) (aClass185_8564.aFloat2331 + aClass185_8564.aFloat2326 * f_28 / f_31));
                    aFloatArray8605[i_24] = ((int) (aClass185_8564.aFloat2333 + aClass185_8564.aFloat2332 * f_29 / f_31));
                } else {
                    aFloatArray8590[i_24] = -5000.0f;
                    bool_47 = true;
                }

                if (aClass185_8564.aBool2309) {
                    anIntArray8633[i_24] = (int) (matrix44_5.buf[13] + matrix44_5.buf[1] * i_25 + matrix44_5.buf[5] * i_26 + matrix44_5.buf[9] * i_27);
                }
            }

            float f_33;
            float f_34;
            float f_35;
            float f_36;
            float f_37;
            float f_38;
            float f_39;
            float f_40;
            float f_41;
            float f_42;
            short s_61;
            if (aClass193Array8618 != null) {
                for (i_24 = 0; i_24 < anInt8617; i_24++) {
                    Class193 class193_48 = aClass193Array8618[i_24];
                    Class176 class176_49 = aClass176Array8582[i_24];
                    short s_59 = aShortArray8587[class193_48.anInt2393];
                    short s_60 = aShortArray8588[class193_48.anInt2393];
                    s_61 = aShortArray8642[class193_48.anInt2393];
                    int i_62 = (anIntArray8580[s_59] + anIntArray8580[s_60] + anIntArray8580[s_61]) / 3;
                    int i_63 = (anIntArray8581[s_59] + anIntArray8581[s_60] + anIntArray8581[s_61]) / 3;
                    int i_32 = (anIntArray8610[s_59] + anIntArray8610[s_60] + anIntArray8610[s_61]) / 3;
                    f_33 = matrix44_22.buf[0] * i_62 + matrix44_22.buf[4] * i_63 + matrix44_22.buf[8] * i_32 + matrix44_22.buf[12];
                    f_34 = matrix44_22.buf[1] * i_62 + matrix44_22.buf[5] * i_63 + matrix44_22.buf[9] * i_32 + matrix44_22.buf[13];
                    f_35 = matrix44_22.buf[2] * i_62 + matrix44_22.buf[6] * i_63 + matrix44_22.buf[10] * i_32 + matrix44_22.buf[14];
                    f_36 = matrix44_22.buf[3] * i_62 + matrix44_22.buf[7] * i_63 + matrix44_22.buf[11] * i_32 + matrix44_22.buf[15];
                    f_35 += matrix44_7.buf[2] * class176_49.anInt2192 + matrix44_7.buf[6] * class176_49.anInt2189;
                    f_36 += matrix44_7.buf[3] * class176_49.anInt2192 + matrix44_7.buf[7] * class176_49.anInt2189;
                    if (f_35 > -f_36) {
                        f_33 += matrix44_7.buf[0] * class176_49.anInt2192 + matrix44_7.buf[4] * class176_49.anInt2189;
                        f_34 += matrix44_7.buf[1] * class176_49.anInt2192 + matrix44_7.buf[5] * class176_49.anInt2189;
                        f_37 = aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_33 / f_36;
                        f_38 = aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_34 / f_36;
                        f_39 = class176_49.aFloat2190 * class193_48.aShort2394;
                        f_40 = class176_49.aFloat2191 * class193_48.aShort2395;
                        f_41 = f_33 + matrix44_7.buf[0] * f_39 + matrix44_7.buf[4] * f_40;
                        f_42 = f_34 + matrix44_7.buf[1] * f_39 + matrix44_7.buf[5] * f_40;
                        float f_43 = f_36 + matrix44_7.buf[3] * f_39 + matrix44_7.buf[7] * f_40;
                        float f_44 = aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_41 / f_43;
                        float f_45 = aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_42 / f_43;
                        class176_49.anInt2195 = (int) f_37;
                        class176_49.anInt2196 = (int) f_38;
                        class176_49.aFloat2193 = aGraphicalRenderer_Sub3_8638.aFloat8985 + aGraphicalRenderer_Sub3_8638.aFloat8978 * (f_35 - matrix44_7.buf[10] * class193_48.anInt2400) / f_36;
                        class176_49.anInt2197 = (int) (f_44 < f_37 ? f_37 - f_44 : f_44 - f_37);
                        class176_49.anInt2198 = (int) (f_45 < f_38 ? f_38 - f_45 : f_45 - f_38);
                    } else {
                        class176_49.anInt2198 = 0;
                        class176_49.anInt2197 = 0;
                    }
                }
            }

            if (class275_sub5_2 != null) {
                boolean bool_57 = false;
                boolean bool_58 = true;
                i_26 = aShort8634 + aShort8627 >> 1;
                i_27 = aShort8571 + aShort8629 >> 1;
                s_61 = aShort8570;
                f_31 = matrix44_22.buf[0] * i_26 + matrix44_22.buf[4] * s_61 + matrix44_22.buf[8] * i_27 + matrix44_22.buf[12];
                float f_64 = matrix44_22.buf[1] * i_26 + matrix44_22.buf[5] * s_61 + matrix44_22.buf[9] * i_27 + matrix44_22.buf[13];
                f_33 = matrix44_22.buf[2] * i_26 + matrix44_22.buf[6] * s_61 + matrix44_22.buf[10] * i_27 + matrix44_22.buf[14];
                f_34 = matrix44_22.buf[3] * i_26 + matrix44_22.buf[7] * s_61 + matrix44_22.buf[11] * i_27 + matrix44_22.buf[15];
                if (f_33 >= -f_34) {
                    class275_sub5_2.anInt7847 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_34);
                    class275_sub5_2.anInt7848 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_64 / f_34);
                } else {
                    bool_57 = true;
                }

                s_61 = aShort8625;
                f_35 = matrix44_22.buf[0] * i_26 + matrix44_22.buf[4] * s_61 + matrix44_22.buf[8] * i_27 + matrix44_22.buf[12];
                f_36 = matrix44_22.buf[1] * i_26 + matrix44_22.buf[5] * s_61 + matrix44_22.buf[9] * i_27 + matrix44_22.buf[13];
                f_37 = matrix44_22.buf[2] * i_26 + matrix44_22.buf[6] * s_61 + matrix44_22.buf[10] * i_27 + matrix44_22.buf[14];
                f_38 = matrix44_22.buf[3] * i_26 + matrix44_22.buf[7] * s_61 + matrix44_22.buf[11] * i_27 + matrix44_22.buf[15];
                if (f_37 >= -f_38) {
                    class275_sub5_2.anInt7850 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_35 / f_38);
                    class275_sub5_2.anInt7846 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_36 / f_38);
                } else {
                    bool_57 = true;
                }

                if (bool_57) {
                    if (f_33 < -f_34 && f_37 < -f_38) {
                        bool_58 = false;
                    } else if (f_33 < -f_34) {
                        f_39 = (f_33 + f_34) / (f_37 + f_38) - 1.0F;
                        f_40 = f_31 + f_39 * (f_35 - f_31);
                        f_41 = f_64 + f_39 * (f_36 - f_64);
                        f_42 = f_34 + f_39 * (f_38 - f_34);
                        class275_sub5_2.anInt7847 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_40 / f_42);
                        class275_sub5_2.anInt7848 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_41 / f_42);
                    } else if (f_37 < -f_38) {
                        f_39 = (f_37 + f_38) / (f_33 + f_34) - 1.0F;
                        f_40 = f_35 + f_39 * (f_31 - f_35);
                        f_41 = f_36 + f_39 * (f_64 - f_36);
                        f_42 = f_38 + f_39 * (f_34 - f_38);
                        class275_sub5_2.anInt7850 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_40 / f_42);
                        class275_sub5_2.anInt7846 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_41 / f_42);
                    }
                }

                if (bool_58) {
                    if (f_33 / f_34 > f_37 / f_38) {
                        f_39 = f_31 + matrix44_7.buf[0] * aShort8595 + matrix44_7.buf[12];
                        f_40 = f_34 + matrix44_7.buf[3] * aShort8595 + matrix44_7.buf[15];
                        class275_sub5_2.anInt7851 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 - class275_sub5_2.anInt7847 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_39 / f_40);
                    } else {
                        f_39 = f_35 + matrix44_7.buf[0] * aShort8595 + matrix44_7.buf[12];
                        f_40 = f_38 + matrix44_7.buf[3] * aShort8595 + matrix44_7.buf[15];
                        class275_sub5_2.anInt7851 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 - class275_sub5_2.anInt7850 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_39 / f_40);
                    }

                    class275_sub5_2.aBool7849 = true;
                }
            }

            method13853(true);
            aClass144_8566.aBool1675 = (i_3 & 0x1) == 0;
            aClass144_8566.aBool1672 = false;

            try {
                method13817(aGraphicalRenderer_Sub3_8638.anIntArray8979 != null, aGraphicalRenderer_Sub3_8638.aFloatArray9010 != null, (i_3 & 0x4) != 0, bool_47, aClass185_8564.aBool2304 && f_21 > aClass185_8564.aFloat2305 || aClass185_8564.aBool2309);
            } catch (Exception ignored) {
            }

            if (aClass193Array8618 != null) {
                for (i_24 = 0; i_24 < anInt8586; i_24++) {
                    anIntArray8643[i_24] = -1;
                }
            }

            aClass144_8566 = null;
            if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
                synchronized (this) {
                    aBool8563 = false;
                    notifyAll();
                }
            }
        }

    }

    boolean method13816(int i_1) {
        return aByteArray8602 != null && aByteArray8602[i_1] != 0;
    }

    @Override
    public void method11269(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
        MeshRasterizer_Sub2 class528_sub2_6 = (MeshRasterizer_Sub2) meshrasterizer_1;
        if ((anInt8575 & 0x10000) != 65536) {
            throw new IllegalStateException("");
        } else if ((class528_sub2_6.anInt8575 & 0x10000) != 65536) {
            throw new IllegalStateException("");
        } else {
            method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
            method13876();
            method13877();
            class528_sub2_6.method13876();
            class528_sub2_6.method13877();
            ++anInt8612;
            int i_7 = 0;
            int[] ints_8 = class528_sub2_6.anIntArray8580;
            int i_9 = class528_sub2_6.anInt8579;

            int i_10;
            for (i_10 = 0; i_10 < anInt8579; i_10++) {
                Class189 class189_11 = aClass189Array8584[i_10];
                if (class189_11.anInt2382 != 0) {
                    int i_12 = anIntArray8581[i_10] - i_3;
                    if (i_12 >= class528_sub2_6.aShort8570 && i_12 <= class528_sub2_6.aShort8625) {
                        int i_13 = anIntArray8580[i_10] - i_2;
                        if (i_13 >= class528_sub2_6.aShort8634 && i_13 <= class528_sub2_6.aShort8627) {
                            int i_14 = anIntArray8610[i_10] - i_4;
                            if (i_14 >= class528_sub2_6.aShort8571 && i_14 <= class528_sub2_6.aShort8629) {
                                for (int i_15 = 0; i_15 < i_9; i_15++) {
                                    Class189 class189_16 = class528_sub2_6.aClass189Array8584[i_15];
                                    if (i_13 == ints_8[i_15] && i_14 == class528_sub2_6.anIntArray8610[i_15] && i_12 == class528_sub2_6.anIntArray8581[i_15] && class189_16.anInt2382 != 0) {
                                        if (aClass189Array8585 == null) {
                                            aClass189Array8585 = new Class189[anInt8579];
                                        }

                                        if (class528_sub2_6.aClass189Array8585 == null) {
                                            class528_sub2_6.aClass189Array8585 = new Class189[i_9];
                                        }

                                        Class189 class189_17 = aClass189Array8585[i_10];
                                        if (class189_17 == null) {
                                            class189_17 = aClass189Array8585[i_10] = new Class189(class189_11);
                                        }

                                        Class189 class189_18 = class528_sub2_6.aClass189Array8585[i_15];
                                        if (class189_18 == null) {
                                            class189_18 = class528_sub2_6.aClass189Array8585[i_15] = new Class189(class189_16);
                                        }

                                        class189_17.anInt2380 += class189_16.anInt2380;
                                        class189_17.anInt2381 += class189_16.anInt2381;
                                        class189_17.anInt2379 += class189_16.anInt2379;
                                        class189_17.anInt2382 += class189_16.anInt2382;
                                        class189_18.anInt2380 += class189_11.anInt2380;
                                        class189_18.anInt2381 += class189_11.anInt2381;
                                        class189_18.anInt2379 += class189_11.anInt2379;
                                        class189_18.anInt2382 += class189_11.anInt2382;
                                        ++i_7;
                                        anIntArray8567[i_10] = anInt8612;
                                        anIntArray8619[i_15] = anInt8612;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (i_7 >= 3 && bool_5) {
                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    if (anIntArray8567[aShortArray8587[i_10]] == anInt8612 && anIntArray8567[aShortArray8588[i_10]] == anInt8612 && anIntArray8567[aShortArray8642[i_10]] == anInt8612) {
                        if (aByteArray8600 == null) {
                            aByteArray8600 = new byte[anInt8586];
                        }

                        aByteArray8600[i_10] = 2;
                    }
                }

                for (i_10 = 0; i_10 < class528_sub2_6.anInt8586; i_10++) {
                    if (anIntArray8619[class528_sub2_6.aShortArray8587[i_10]] == anInt8612 && anIntArray8619[class528_sub2_6.aShortArray8588[i_10]] == anInt8612 && anIntArray8619[class528_sub2_6.aShortArray8642[i_10]] == anInt8612) {
                        if (class528_sub2_6.aByteArray8600 == null) {
                            class528_sub2_6.aByteArray8600 = new byte[class528_sub2_6.anInt8586];
                        }

                        class528_sub2_6.aByteArray8600[i_10] = 2;
                    }
                }
            }

        }
    }

    @Override
    boolean ea() {
        if (anIntArrayArray8568 == null) {
            return false;
        } else {
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;
            return true;
        }
    }

    void method13817(boolean bool_1, boolean bool_2, boolean bool_3, boolean bool_4, boolean bool_5) {
        int i_6;
        Class193 class193_7;
        if (aClass193Array8618 != null) {
            for (i_6 = 0; i_6 < anInt8617; anIntArray8643[class193_7.anInt2393] = i_6++) {
                class193_7 = aClass193Array8618[i_6];
            }
        }

        if (!aBool8630 && aClass193Array8618 == null) {
            for (i_6 = 0; i_6 < anInt8586; i_6++) {
                method13868(bool_1, bool_2, bool_3, i_6, bool_4, bool_5);
            }
        } else if ((anInt8575 & 0x100) == 0 && aShortArray8623 != null) {
            for (i_6 = 0; i_6 < anInt8586; i_6++) {
                short s_9 = aShortArray8623[i_6];
                method13868(bool_1, bool_2, bool_3, s_9, bool_4, bool_5);
            }
        } else {
            for (i_6 = 0; i_6 < anInt8586; i_6++) {
                if (!method13816(i_6) && !method13803(i_6)) {
                    method13868(bool_1, bool_2, bool_3, i_6, bool_4, bool_5);
                }
            }

            if (aByteArray8601 == null) {
                for (i_6 = 0; i_6 < anInt8586; i_6++) {
                    if (method13816(i_6) || method13803(i_6)) {
                        method13868(bool_1, bool_2, bool_3, i_6, bool_4, bool_5);
                    }
                }
            } else {
                for (i_6 = 0; i_6 < 12; i_6++) {
                    for (int i_8 = 0; i_8 < anInt8586; i_8++) {
                        if (i_6 == aByteArray8601[i_8] && (method13816(i_8) || method13803(i_8))) {
                            method13868(bool_1, bool_2, bool_3, i_8, bool_4, bool_5);
                        }
                    }
                }
            }
        }

    }

    void method13818(boolean bool_1, boolean bool_2, boolean bool_3, int i_4) {
        short s_5;
        short s_6;
        short s_7;
        float f_9;
        float f_10;
        if (!aClass185_8564.aBool2309) {
            s_5 = aShortArray8587[i_4];
            s_6 = aShortArray8588[i_4];
            s_7 = aShortArray8642[i_4];
            Matrix44 matrix44_8 = aGraphicalRenderer_Sub3_8638.aClass384_8995;
            f_9 = matrix44_8.buf[10];
            f_10 = matrix44_8.buf[14];
            float f_11 = matrix44_8.buf[11];
            float f_12 = matrix44_8.buf[15];
            float f_13 = f_10 * f_11 - f_9 * f_12;
            float f_14 = (aFloatArray8636[s_5] - aClass185_8564.aFloat2335) * aClass185_8564.aFloat2308;
            float f_15 = (aFloatArray8636[s_6] - aClass185_8564.aFloat2335) * aClass185_8564.aFloat2308;
            float f_16 = (aFloatArray8636[s_7] - aClass185_8564.aFloat2335) * aClass185_8564.aFloat2308;
            float f_17 = f_14 * f_13 / (f_14 * f_11 - f_9);
            float f_18 = f_15 * f_13 / (f_15 * f_11 - f_9);
            float f_19 = f_16 * f_13 / (f_16 * f_11 - f_9);
            float f_20 = (f_17 - aClass185_8564.aFloat2305) / aClass185_8564.aFloat2303;
            if (f_20 > 1.0F) {
                f_20 = 1.0F;
            } else if (f_20 < 0.0F) {
                f_20 = 0.0F;
            }

            float f_21 = (f_18 - aClass185_8564.aFloat2305) / aClass185_8564.aFloat2303;
            if (f_21 > 1.0F) {
                f_21 = 1.0F;
            } else if (f_21 < 0.0F) {
                f_21 = 0.0F;
            }

            float f_22 = (f_19 - aClass185_8564.aFloat2305) / aClass185_8564.aFloat2303;
            if (f_22 > 1.0F) {
                f_22 = 1.0F;
            } else if (f_22 < 0.0F) {
                f_22 = 0.0F;
            }

            float f_23 = f_20 + f_21 + f_22;
            if (f_23 < 3.0F) {
                if (f_23 <= 0.0F) {
                    method13848(bool_1, bool_2, bool_3, i_4);
                } else {
                    if (aByteArray8602 == null) {
                        aClass144_8566.anInt1674 = 0;
                    } else {
                        aClass144_8566.anInt1674 = aByteArray8602[i_4] & 0xff;
                    }

                    if (aShortArray8603 != null && aShortArray8603[i_4] != -1) {
                        int i_24 = -16777216;
                        if (aByteArray8602 != null) {
                            i_24 = 255 - (aByteArray8602[i_4] & 0xff) << 24;
                        }

                        if (anIntArray8594[i_4] == -1) {
                            int i_25 = i_24 | anIntArray8592[i_4] & 0xffffff;
                            aClass144_8566.method2424(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], aFloatArray8637[s_5], aFloatArray8637[s_6], aFloatArray8637[s_7], aFloatArrayArray8635[i_4][0], aFloatArrayArray8635[i_4][1], aFloatArrayArray8635[i_4][2], aFloatArrayArray8591[i_4][0], aFloatArrayArray8591[i_4][1], aFloatArrayArray8591[i_4][2], i_25, i_25, i_25, aClass185_8564.anInt2307, f_20 * 255.0F, f_21 * 255.0F, f_22 * 255.0F, aShortArray8603[i_4]);
                        } else {
                            aClass144_8566.method2424(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], aFloatArray8637[s_5], aFloatArray8637[s_6], aFloatArray8637[s_7], aFloatArrayArray8635[i_4][0], aFloatArrayArray8635[i_4][1], aFloatArrayArray8635[i_4][2], aFloatArrayArray8591[i_4][0], aFloatArrayArray8591[i_4][1], aFloatArrayArray8591[i_4][2], i_24 | anIntArray8592[i_4] & 0xffffff, i_24 | anIntArray8631[i_4] & 0xffffff, i_24 | anIntArray8594[i_4] & 0xffffff, aClass185_8564.anInt2307, f_20 * 255.0F, f_21 * 255.0F, f_22 * 255.0F, aShortArray8603[i_4]);
                        }
                    } else if (anIntArray8594[i_4] == -1) {
                        aClass144_8566.method2425(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_20 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_21 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_22 * 255.0F));
                    } else {
                        aClass144_8566.method2425(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_20 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8631[i_4] & 0xffff], aClass185_8564.anInt2307, f_21 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8594[i_4] & 0xffff], aClass185_8564.anInt2307, f_22 * 255.0F));
                    }
                }
            }
        } else {
            s_5 = aShortArray8587[i_4];
            s_6 = aShortArray8588[i_4];
            s_7 = aShortArray8642[i_4];
            float f_26 = 0.0F;
            f_9 = 0.0F;
            f_10 = 0.0F;
            if (anIntArray8633[s_5] > aClass185_8564.anInt2313) {
                f_26 = 1.0F;
            } else if (anIntArray8633[s_5] > aClass185_8564.anInt2306) {
                f_26 = (aClass185_8564.anInt2306 - anIntArray8633[s_5]) * 1.0F / (aClass185_8564.anInt2306 - aClass185_8564.anInt2313);
            }

            if (anIntArray8633[s_6] > aClass185_8564.anInt2313) {
                f_9 = 1.0F;
            } else if (anIntArray8633[s_6] > aClass185_8564.anInt2306) {
                f_9 = (aClass185_8564.anInt2306 - anIntArray8633[s_6]) * 1.0F / (aClass185_8564.anInt2306 - aClass185_8564.anInt2313);
            }

            if (anIntArray8633[s_7] > aClass185_8564.anInt2313) {
                f_10 = 1.0F;
            } else if (anIntArray8633[s_7] > aClass185_8564.anInt2306) {
                f_10 = (aClass185_8564.anInt2306 - anIntArray8633[s_7]) * 1.0F / (aClass185_8564.anInt2306 - aClass185_8564.anInt2313);
            }

            if (aByteArray8602 == null) {
                aClass144_8566.anInt1674 = 0;
            } else {
                aClass144_8566.anInt1674 = aByteArray8602[i_4] & 0xff;
            }

            if (aShortArray8603 != null && aShortArray8603[i_4] != -1) {
                int i_27 = -16777216;
                if (aByteArray8602 != null) {
                    i_27 = 255 - (aByteArray8602[i_4] & 0xff) << 24;
                }

                if (anIntArray8594[i_4] == -1) {
                    int i_28 = i_27 | anIntArray8592[i_4] & 0xffffff;
                    aClass144_8566.method2424(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], aFloatArray8637[s_5], aFloatArray8637[s_6], aFloatArray8637[s_7], aFloatArrayArray8635[i_4][0], aFloatArrayArray8635[i_4][1], aFloatArrayArray8635[i_4][2], aFloatArrayArray8591[i_4][0], aFloatArrayArray8591[i_4][1], aFloatArrayArray8591[i_4][2], i_28, i_28, i_28, aClass185_8564.anInt2307, f_26 * 255.0F, f_9 * 255.0F, f_10 * 255.0F, aShortArray8603[i_4]);
                } else {
                    aClass144_8566.method2424(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], aFloatArray8637[s_5], aFloatArray8637[s_6], aFloatArray8637[s_7], aFloatArrayArray8635[i_4][0], aFloatArrayArray8635[i_4][1], aFloatArrayArray8635[i_4][2], aFloatArrayArray8591[i_4][0], aFloatArrayArray8591[i_4][1], aFloatArrayArray8591[i_4][2], i_27 | anIntArray8592[i_4] & 0xffffff, i_27 | anIntArray8631[i_4] & 0xffffff, i_27 | anIntArray8594[i_4] & 0xffffff, aClass185_8564.anInt2307, f_26 * 255.0F, f_9 * 255.0F, f_10 * 255.0F, aShortArray8603[i_4]);
                }
            } else if (anIntArray8594[i_4] == -1) {
                aClass144_8566.method2425(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_26 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_9 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_10 * 255.0F));
            } else {
                aClass144_8566.method2425(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], Class302.method5364(Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff], aClass185_8564.anInt2307, f_26 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8631[i_4] & 0xffff], aClass185_8564.anInt2307, f_9 * 255.0F), Class302.method5364(Class335.anIntArray3916[anIntArray8594[i_4] & 0xffff], aClass185_8564.anInt2307, f_10 * 255.0F));
            }
        }

    }

    @Override
    public boolean method11270(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
        method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
        Matrix44 matrix44_6 = aClass185_8564.aClass384_2317;
        matrix44_6.fromVarMatrix44(matrix44var_3);
        Matrix44 matrix44_7 = aClass185_8564.aClass384_2318;
        matrix44_7.method6562(matrix44_6);
        matrix44_7.method6523(aGraphicalRenderer_Sub3_8638.aClass384_8996);
        boolean bool_8 = false;
        int i_9 = Integer.MAX_VALUE;
        int i_10 = Integer.MIN_VALUE;
        int i_11 = Integer.MAX_VALUE;
        int i_12 = Integer.MIN_VALUE;
        if (!aBool8621) {
            method13876();
        }

        int i_13 = aShort8627 - aShort8634 >> 1;
        int i_14 = aShort8625 - aShort8570 >> 1;
        int i_15 = aShort8629 - aShort8571 >> 1;
        int i_16 = i_13 + aShort8634;
        int i_17 = i_14 + aShort8570;
        int i_18 = i_15 + aShort8571;
        int i_19 = i_16 - (i_13 << i_5);
        int i_20 = i_17 - (i_14 << i_5);
        int i_21 = i_18 - (i_15 << i_5);
        int i_22 = i_16 + (i_13 << i_5);
        int i_23 = i_17 + (i_14 << i_5);
        int i_24 = i_18 + (i_15 << i_5);
        anIntArray8583[0] = i_19;
        anIntArray8639[0] = i_20;
        anIntArray8628[0] = i_21;
        anIntArray8583[1] = i_22;
        anIntArray8639[1] = i_20;
        anIntArray8628[1] = i_21;
        anIntArray8583[2] = i_19;
        anIntArray8639[2] = i_23;
        anIntArray8628[2] = i_21;
        anIntArray8583[3] = i_22;
        anIntArray8639[3] = i_23;
        anIntArray8628[3] = i_21;
        anIntArray8583[4] = i_19;
        anIntArray8639[4] = i_20;
        anIntArray8628[4] = i_24;
        anIntArray8583[5] = i_22;
        anIntArray8639[5] = i_20;
        anIntArray8628[5] = i_24;
        anIntArray8583[6] = i_19;
        anIntArray8639[6] = i_23;
        anIntArray8628[6] = i_24;
        anIntArray8583[7] = i_22;
        anIntArray8639[7] = i_23;
        anIntArray8628[7] = i_24;

        int i_25;
        int i_26;
        int i_27;
        int i_28;
        float f_29;
        float f_30;
        float f_31;
        float f_32;
        for (i_25 = 0; i_25 < 8; i_25++) {
            i_26 = anIntArray8583[i_25];
            i_27 = anIntArray8639[i_25];
            i_28 = anIntArray8628[i_25];
            f_29 = matrix44_7.buf[2] * i_26 + matrix44_7.buf[6] * i_27 + matrix44_7.buf[10] * i_28 + matrix44_7.buf[14];
            f_30 = matrix44_7.buf[3] * i_26 + matrix44_7.buf[7] * i_27 + matrix44_7.buf[11] * i_28 + matrix44_7.buf[15];
            if (f_29 >= -f_30) {
                f_31 = matrix44_7.buf[0] * i_26 + matrix44_7.buf[4] * i_27 + matrix44_7.buf[8] * i_28 + matrix44_7.buf[12];
                f_32 = matrix44_7.buf[1] * i_26 + matrix44_7.buf[5] * i_27 + matrix44_7.buf[9] * i_28 + matrix44_7.buf[13];
                int i_33 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_30);
                int i_34 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_32 / f_30);
                if (i_33 < i_9) {
                    i_9 = i_33;
                }

                if (i_33 > i_10) {
                    i_10 = i_33;
                }

                if (i_34 < i_11) {
                    i_11 = i_34;
                }

                if (i_34 > i_12) {
                    i_12 = i_34;
                }

                bool_8 = true;
            }
        }

        if (bool_8 && i_1 > i_9 && i_1 < i_10 && i_2 > i_11 && i_2 < i_12) {
            if (bool_4) {
                return true;
            }

            for (i_25 = 0; i_25 < anInt8578; i_25++) {
                i_26 = anIntArray8580[i_25];
                i_27 = anIntArray8581[i_25];
                i_28 = anIntArray8610[i_25];
                f_29 = matrix44_7.buf[2] * i_26 + matrix44_7.buf[6] * i_27 + matrix44_7.buf[10] * i_28 + matrix44_7.buf[14];
                f_30 = matrix44_7.buf[3] * i_26 + matrix44_7.buf[7] * i_27 + matrix44_7.buf[11] * i_28 + matrix44_7.buf[15];
                if (f_29 >= -f_30) {
                    f_31 = matrix44_7.buf[0] * i_26 + matrix44_7.buf[4] * i_27 + matrix44_7.buf[8] * i_28 + matrix44_7.buf[12];
                    f_32 = matrix44_7.buf[1] * i_26 + matrix44_7.buf[5] * i_27 + matrix44_7.buf[9] * i_28 + matrix44_7.buf[13];
                    aFloatArray8590[i_25] = ((int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_30));
                    aFloatArray8605[i_25] = ((int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_32 / f_30));
                } else {
                    aFloatArray8590[i_25] = -999999.0f;
                }
            }

            for (i_25 = 0; i_25 < anInt8586; i_25++) {
                if (aFloatArray8590[aShortArray8587[i_25]] != -999999.0f && aFloatArray8590[aShortArray8588[i_25]] != -999999.0f && aFloatArray8590[aShortArray8642[i_25]] != -999999.0f && method13819(i_1, i_2, aFloatArray8605[aShortArray8587[i_25]], aFloatArray8605[aShortArray8588[i_25]], aFloatArray8605[aShortArray8642[i_25]], aFloatArray8590[aShortArray8587[i_25]], aFloatArray8590[aShortArray8588[i_25]], aFloatArray8590[aShortArray8642[i_25]])) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean method13819(int i_1, int i_2, float f_3, float f_4, float f_5, float f_6, float f_7, float f_8) {
        return (!(i_2 < f_3) || !(i_2 < f_4) || !(i_2 < f_5)) && ((!(i_2 > f_3) || !(i_2 > f_4) || !(i_2 > f_5)) && ((!(i_1 < f_6) || !(i_1 < f_7) || !(i_1 < f_8)) && (i_1 <= f_6 || i_1 <= f_7 || i_1 <= f_8)));
    }

    @Override
    void method11260() {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
            synchronized (this) {
                while (aBool7023) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }

                aBool7023 = true;
            }
        }

    }

    @Override
    public int N() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8595;
    }

    @Override
    public int n() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8574;
    }

    @Override
    public int RA() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8634;
    }

    @Override
    public boolean method11303() {
        if (aShortArray8603 != null) {
            for (int i_1 = 0; i_1 < aShortArray8603.length; i_1++) {
                if (aShortArray8603[i_1] != -1 && !aGraphicalRenderer_Sub3_8638.method14360(aShortArray8603[i_1])) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public int cm() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8570;
    }

    @Override
    public int o() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8625;
    }

    @Override
    public int AA() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8571;
    }

    @Override
    public int cv() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8634;
    }

    @Override
    public void p(int i_1) {
        if ((anInt8575 & 0x1000) != 4096) {
            throw new IllegalStateException();
        } else {
            anInt8606 = i_1;
            anInt8598 = 0;
        }
    }

    @Override
    public MeshRasterizer method11276(byte b_1, int i_2, boolean bool_3) {
        method13796(Thread.currentThread());
        boolean bool_4 = false;
        MeshRasterizer_Sub2 class528_sub2_5;
        MeshRasterizer_Sub2 class528_sub2_6;
        if (b_1 > 0 && b_1 <= 7) {
            class528_sub2_6 = aMeshRasterizer_Sub2Array8645[b_1 - 1];
            class528_sub2_5 = aMeshRasterizer_Sub2Array8626[b_1 - 1];
            bool_4 = true;
        } else {
            class528_sub2_5 = class528_sub2_6 = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_8638);
        }

        return method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
    }

    @Override
    public void bw(int i_1) {
        if ((anInt8575 & 0x5) != 5) {
            throw new IllegalStateException();
        } else {
            if (i_1 == 4096) {
                method13805();
            } else if (i_1 == 8192) {
                method13806();
            } else if (i_1 == 12288) {
                method13807();
            } else {
                int i_2 = Trig.SINE[i_1];
                int i_3 = Trig.COSINE[i_1];
                synchronized (this) {
                    for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                        int i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                        anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                        anIntArray8580[i_5] = i_6;
                    }

                    method13812();
                }
            }

        }
    }

    @Override
    public int Z() {
        return anInt8577;
    }

    @Override
    public void X(short s_1, short s_2) {
        int i_3;
        for (i_3 = 0; i_3 < anInt8586; i_3++) {
            if (aShortArray8604[i_3] == s_1) {
                aShortArray8604[i_3] = s_2;
            }
        }

        if (aClass193Array8618 != null) {
            for (i_3 = 0; i_3 < anInt8617; i_3++) {
                Class193 class193_4 = aClass193Array8618[i_3];
                Class176 class176_5 = aClass176Array8582[i_3];
                class176_5.anInt2199 = class176_5.anInt2199 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_4.anInt2393]) & 0xffff] & 0xffffff;
            }
        }

        if (anInt8598 == 2) {
            anInt8598 = 1;
        }

    }

    @Override
    public void method11312(byte b_1, byte[] bytes_2) {
        if ((anInt8575 & 0x100000) == 0) {
            throw new RuntimeException();
        } else {
            if (aByteArray8602 == null) {
                aByteArray8602 = new byte[anInt8586];
            }

            int i_3;
            if (bytes_2 == null) {
                for (i_3 = 0; i_3 < anInt8586; i_3++) {
                    aByteArray8602[i_3] = b_1;
                }
            } else {
                for (i_3 = 0; i_3 < anInt8586; i_3++) {
                    int i_4 = 255 - (255 - (b_1 & 0xff)) * (255 - (bytes_2[i_3] & 0xff)) / 255;
                    aByteArray8602[i_3] = (byte) i_4;
                }
            }

            if (anInt8598 == 2) {
                anInt8598 = 1;
            }

        }
    }

    @Override
    public Shadow da(Shadow class282_sub50_sub17_1) {
        return null;
    }

    @Override
    public void PA(int i_1, int i_2, int i_3, int i_4) {
        if ((anInt8575 & 0x80000) != 524288) {
            throw new IllegalStateException();
        } else {
            int i_5;
            for (i_5 = 0; i_5 < anInt8586; i_5++) {
                int i_6 = aShortArray8604[i_5] & 0xffff;
                int i_7 = i_6 >> 10 & 0x3f;
                int i_8 = i_6 >> 7 & 0x7;
                int i_9 = i_6 & 0x7f;
                if (i_1 != -1) {
                    i_7 += (i_1 - i_7) * i_4 >> 7;
                }

                if (i_2 != -1) {
                    i_8 += i_4 * (i_2 - i_8) >> 7;
                }

                if (i_3 != -1) {
                    i_9 += (i_3 - i_9) * i_4 >> 7;
                }

                aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
            }

            if (aClass193Array8618 != null) {
                for (i_5 = 0; i_5 < anInt8617; i_5++) {
                    Class193 class193_10 = aClass193Array8618[i_5];
                    Class176 class176_11 = aClass176Array8582[i_5];
                    class176_11.anInt2199 = class176_11.anInt2199 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_10.anInt2393] & 0xffff) & 0xffff] & 0xffffff;
                }
            }

            if (anInt8598 == 2) {
                anInt8598 = 1;
            }

        }
    }

    @Override
    public ParticleEmitterConfig[] method11253() {
        return aClass87Array8615;
    }

    @Override
    public SurfaceSkin[] method11274() {
        return aClass172Array8616;
    }

    @Override
    public boolean i() {
        return aBool8630;
    }

    @Override
    public boolean u() {
        return aBool8640;
    }

    @Override
    public void bk(int i_1) {
        if ((anInt8575 & 0x6) != 6) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = anIntArray8581[i_5] * i_3 - anIntArray8610[i_5] * i_2 >> 14;
                    anIntArray8610[i_5] = anIntArray8581[i_5] * i_2 + anIntArray8610[i_5] * i_3 >> 14;
                    anIntArray8581[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void method11294(Matrix44Var matrix44var_1) {
        method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
        Matrix44 matrix44_2 = aClass185_8564.aClass384_2317;
        matrix44_2.fromVarMatrix44(matrix44var_1);
        int i_3;
        if (aClass87Array8615 != null) {
            for (i_3 = 0; i_3 < aClass87Array8615.length; i_3++) {
                ParticleEmitterConfig class87_4 = aClass87Array8615[i_3];
                ParticleEmitterConfig class87_5 = class87_4;
                if (class87_4.aClass87_835 != null) {
                    class87_5 = class87_4.aClass87_835;
                }

                class87_5.anInt844 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceX * 1502404273 * -1572033967]) * -1929058355 * -75866875;
                class87_5.anInt841 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceX * 1502404273 * -1572033967]) * 996785411 * 1618253227;
                class87_5.anInt847 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceX * 1502404273 * -1572033967]) * 976806429 * -489230283;
                class87_5.anInt834 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceY * -2021469179 * -1955014451]) * -458323579 * 1747322701;
                class87_5.anInt843 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceY * -2021469179 * -1955014451]) * 543149547 * -174394685;
                class87_5.anInt845 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceY * -2021469179 * -1955014451]) * 1054448197 * 305293453;
                class87_5.anInt846 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceZ * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
                class87_5.anInt840 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceZ * -1292195173 * -2135413869]) * -1652520905 * 950906247;
                class87_5.anInt848 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceZ * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
            }
        }

        if (aClass172Array8616 != null) {
            for (i_3 = 0; i_3 < aClass172Array8616.length; i_3++) {
                SurfaceSkin class172_6 = aClass172Array8616[i_3];
                SurfaceSkin class172_7 = class172_6;
                if (class172_6.aClass172_2114 != null) {
                    class172_7 = class172_6.aClass172_2114;
                }

                if (class172_6.aClass384_2116 != null) {
                    class172_6.aClass384_2116.method6562(matrix44_2);
                } else {
                    class172_6.aClass384_2116 = new Matrix44(matrix44_2);
                }

                class172_7.anInt2113 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[4] * anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[8] * anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
                class172_7.anInt2117 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[5] * anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[9] * anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
                class172_7.anInt2118 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[6] * anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[10] * anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
            }
        }

    }

    @Override
    void bl(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
        int i_31 = i_3;
        int i_41 = i_4;
        int i_51 = i_5;
        int i_9 = ints_2.length;
        int i_10;
        int i_11;
        int i_12;
        int i_14;
        int i_15;
        if (i_1 == 0) {
            i_31 <<= 4;
            i_41 <<= 4;
            i_51 <<= 4;
            if (!aBool8589) {
                for (i_10 = 0; i_10 < anInt8578; i_10++) {
                    anIntArray8580[i_10] <<= 4;
                    anIntArray8581[i_10] <<= 4;
                    anIntArray8610[i_10] <<= 4;
                }

                aBool8589 = true;
            }

            i_10 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_11 = 0; i_11 < i_9; i_11++) {
                i_12 = ints_2[i_11];
                if (i_12 < anIntArrayArray8568.length) {
                    int[] ints_13 = anIntArrayArray8568[i_12];

                    for (i_14 = 0; i_14 < ints_13.length; i_14++) {
                        i_15 = ints_13[i_14];
                        if (aShortArray8569 == null || (i_7 & aShortArray8569[i_15]) != 0) {
                            anInt8611 += anIntArray8580[i_15];
                            anInt8607 += anIntArray8581[i_15];
                            anInt8613 += anIntArray8610[i_15];
                            ++i_10;
                        }
                    }
                }
            }

            if (i_10 > 0) {
                anInt8611 = anInt8611 / i_10 + i_31;
                anInt8607 = anInt8607 / i_10 + i_41;
                anInt8613 = anInt8613 / i_10 + i_51;
                aBool8614 = true;
            } else {
                anInt8611 = i_31;
                anInt8607 = i_41;
                anInt8613 = i_51;
            }
        } else {
            int i_47;
            int[] ints_49;
            if (i_1 == 1) {
                if (ints_8 != null) {
                    i_10 = ints_8[0] * i_31 + ints_8[1] * i_41 + ints_8[2] * i_51 + 8192 >> 14;
                    i_11 = ints_8[3] * i_31 + ints_8[4] * i_41 + ints_8[5] * i_51 + 8192 >> 14;
                    i_12 = ints_8[6] * i_31 + ints_8[7] * i_41 + ints_8[8] * i_51 + 8192 >> 14;
                    i_31 = i_10;
                    i_41 = i_11;
                    i_51 = i_12;
                }

                i_31 <<= 4;
                i_41 <<= 4;
                i_51 <<= 4;
                if (!aBool8589) {
                    for (i_10 = 0; i_10 < anInt8578; i_10++) {
                        anIntArray8580[i_10] <<= 4;
                        anIntArray8581[i_10] <<= 4;
                        anIntArray8610[i_10] <<= 4;
                    }

                    aBool8589 = true;
                }

                for (i_10 = 0; i_10 < i_9; i_10++) {
                    i_11 = ints_2[i_10];
                    if (i_11 < anIntArrayArray8568.length) {
                        ints_49 = anIntArrayArray8568[i_11];

                        for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                            i_14 = ints_49[i_47];
                            if (aShortArray8569 == null || (i_7 & aShortArray8569[i_14]) != 0) {
                                anIntArray8580[i_14] += i_31;
                                anIntArray8581[i_14] += i_41;
                                anIntArray8610[i_14] += i_51;
                            }
                        }
                    }
                }
            } else {
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                int i_21;
                int i_22;
                int i_23;
                int i_24;
                int i_26;
                int i_27;
                int i_28;
                int i_30;
                int i_32;
                int i_33;
                int i_34;
                int[] ints_35;
                int i_36;
                int i_37;
                int i_38;
                int i_39;
                int i_40;
                if (i_1 == 2) {
                    if (ints_8 != null) {
                        if (!aBool8589) {
                            for (i_10 = 0; i_10 < anInt8578; i_10++) {
                                anIntArray8580[i_10] <<= 4;
                                anIntArray8581[i_10] <<= 4;
                                anIntArray8610[i_10] <<= 4;
                            }

                            aBool8589 = true;
                        }

                        i_10 = ints_8[9] << 4;
                        i_11 = ints_8[10] << 4;
                        i_12 = ints_8[11] << 4;
                        i_47 = ints_8[12] << 4;
                        i_14 = ints_8[13] << 4;
                        i_15 = ints_8[14] << 4;
                        if (aBool8614) {
                            i_16 = ints_8[0] * anInt8611 + ints_8[3] * anInt8607 + ints_8[6] * anInt8613 + 8192 >> 14;
                            i_17 = ints_8[1] * anInt8611 + ints_8[4] * anInt8607 + ints_8[7] * anInt8613 + 8192 >> 14;
                            i_18 = ints_8[2] * anInt8611 + ints_8[5] * anInt8607 + ints_8[8] * anInt8613 + 8192 >> 14;
                            i_16 += i_47;
                            i_17 += i_14;
                            i_18 += i_15;
                            anInt8611 = i_16;
                            anInt8607 = i_17;
                            anInt8613 = i_18;
                            aBool8614 = false;
                        }

                        int[] ints_48 = new int[9];
                        i_17 = Trig.COSINE[i_31];
                        i_18 = Trig.SINE[i_31];
                        i_19 = Trig.COSINE[i_41];
                        i_20 = Trig.SINE[i_41];
                        i_21 = Trig.COSINE[i_51];
                        i_22 = Trig.SINE[i_51];
                        i_23 = i_18 * i_21 + 8192 >> 14;
                        i_24 = i_18 * i_22 + 8192 >> 14;
                        ints_48[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
                        ints_48[1] = -i_19 * i_22 + i_20 * i_23 + 8192 >> 14;
                        ints_48[2] = i_20 * i_17 + 8192 >> 14;
                        ints_48[3] = i_17 * i_22 + 8192 >> 14;
                        ints_48[4] = i_17 * i_21 + 8192 >> 14;
                        ints_48[5] = -i_18;
                        ints_48[6] = -i_20 * i_21 + i_19 * i_24 + 8192 >> 14;
                        ints_48[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
                        ints_48[8] = i_19 * i_17 + 8192 >> 14;
                        int i_25 = ints_48[0] * -anInt8611 + ints_48[1] * -anInt8607 + ints_48[2] * -anInt8613 + 8192 >> 14;
                        i_26 = ints_48[3] * -anInt8611 + ints_48[4] * -anInt8607 + ints_48[5] * -anInt8613 + 8192 >> 14;
                        i_27 = ints_48[6] * -anInt8611 + ints_48[7] * -anInt8607 + ints_48[8] * -anInt8613 + 8192 >> 14;
                        i_28 = i_25 + anInt8611;
                        int i_29 = i_26 + anInt8607;
                        i_30 = i_27 + anInt8613;
                        int[] ints_31 = new int[9];

                        for (i_32 = 0; i_32 < 3; i_32++) {
                            for (i_33 = 0; i_33 < 3; i_33++) {
                                i_34 = 0;

                                for (int i_54 = 0; i_54 < 3; i_54++) {
                                    i_34 += ints_48[i_32 * 3 + i_54] * ints_8[i_33 * 3 + i_54];
                                }

                                ints_31[i_32 * 3 + i_33] = i_34 + 8192 >> 14;
                            }
                        }

                        i_32 = ints_48[0] * i_47 + ints_48[1] * i_14 + ints_48[2] * i_15 + 8192 >> 14;
                        i_33 = ints_48[3] * i_47 + ints_48[4] * i_14 + ints_48[5] * i_15 + 8192 >> 14;
                        i_34 = ints_48[6] * i_47 + ints_48[7] * i_14 + ints_48[8] * i_15 + 8192 >> 14;
                        i_32 += i_28;
                        i_33 += i_29;
                        i_34 += i_30;
                        ints_35 = new int[9];

                        for (i_36 = 0; i_36 < 3; i_36++) {
                            for (i_37 = 0; i_37 < 3; i_37++) {
                                i_38 = 0;

                                for (i_39 = 0; i_39 < 3; i_39++) {
                                    i_38 += ints_8[i_36 * 3 + i_39] * ints_31[i_37 + i_39 * 3];
                                }

                                ints_35[i_36 * 3 + i_37] = i_38 + 8192 >> 14;
                            }
                        }

                        i_36 = ints_8[0] * i_32 + ints_8[1] * i_33 + ints_8[2] * i_34 + 8192 >> 14;
                        i_37 = ints_8[3] * i_32 + ints_8[4] * i_33 + ints_8[5] * i_34 + 8192 >> 14;
                        i_38 = ints_8[6] * i_32 + ints_8[7] * i_33 + ints_8[8] * i_34 + 8192 >> 14;
                        i_36 += i_10;
                        i_37 += i_11;
                        i_38 += i_12;

                        for (i_39 = 0; i_39 < i_9; i_39++) {
                            i_40 = ints_2[i_39];
                            if (i_40 < anIntArrayArray8568.length) {
                                int[] ints_41 = anIntArrayArray8568[i_40];

                                for (int i_42 = 0; i_42 < ints_41.length; i_42++) {
                                    int i_43 = ints_41[i_42];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_43]) != 0) {
                                        int i_44 = ints_35[0] * anIntArray8580[i_43] + ints_35[1] * anIntArray8581[i_43] + ints_35[2] * anIntArray8610[i_43] + 8192 >> 14;
                                        int i_45 = ints_35[3] * anIntArray8580[i_43] + ints_35[4] * anIntArray8581[i_43] + ints_35[5] * anIntArray8610[i_43] + 8192 >> 14;
                                        int i_46 = ints_35[6] * anIntArray8580[i_43] + ints_35[7] * anIntArray8581[i_43] + ints_35[8] * anIntArray8610[i_43] + 8192 >> 14;
                                        i_44 += i_36;
                                        i_45 += i_37;
                                        i_46 += i_38;
                                        anIntArray8580[i_43] = i_44;
                                        anIntArray8581[i_43] = i_45;
                                        anIntArray8610[i_43] = i_46;
                                    }
                                }
                            }
                        }
                    } else {
                        for (i_10 = 0; i_10 < i_9; i_10++) {
                            i_11 = ints_2[i_10];
                            if (i_11 < anIntArrayArray8568.length) {
                                ints_49 = anIntArrayArray8568[i_11];

                                for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                    i_14 = ints_49[i_47];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_14]) != 0) {
                                        anIntArray8580[i_14] -= anInt8611;
                                        anIntArray8581[i_14] -= anInt8607;
                                        anIntArray8610[i_14] -= anInt8613;
                                        if (i_51 != 0) {
                                            i_15 = Trig.SINE[i_51];
                                            i_16 = Trig.COSINE[i_51];
                                            i_17 = anIntArray8581[i_14] * i_15 + anIntArray8580[i_14] * i_16 + 16383 >> 14;
                                            anIntArray8581[i_14] = anIntArray8581[i_14] * i_16 - anIntArray8580[i_14] * i_15 + 16383 >> 14;
                                            anIntArray8580[i_14] = i_17;
                                        }

                                        if (i_31 != 0) {
                                            i_15 = Trig.SINE[i_31];
                                            i_16 = Trig.COSINE[i_31];
                                            i_17 = anIntArray8581[i_14] * i_16 - anIntArray8610[i_14] * i_15 + 16383 >> 14;
                                            anIntArray8610[i_14] = anIntArray8581[i_14] * i_15 + anIntArray8610[i_14] * i_16 + 16383 >> 14;
                                            anIntArray8581[i_14] = i_17;
                                        }

                                        if (i_41 != 0) {
                                            i_15 = Trig.SINE[i_41];
                                            i_16 = Trig.COSINE[i_41];
                                            i_17 = anIntArray8610[i_14] * i_15 + anIntArray8580[i_14] * i_16 + 16383 >> 14;
                                            anIntArray8610[i_14] = anIntArray8610[i_14] * i_16 - anIntArray8580[i_14] * i_15 + 16383 >> 14;
                                            anIntArray8580[i_14] = i_17;
                                        }

                                        anIntArray8580[i_14] += anInt8611;
                                        anIntArray8581[i_14] += anInt8607;
                                        anIntArray8610[i_14] += anInt8613;
                                    }
                                }
                            }
                        }
                    }
                } else if (i_1 == 3) {
                    if (ints_8 != null) {
                        if (!aBool8589) {
                            for (i_10 = 0; i_10 < anInt8578; i_10++) {
                                anIntArray8580[i_10] <<= 4;
                                anIntArray8581[i_10] <<= 4;
                                anIntArray8610[i_10] <<= 4;
                            }

                            aBool8589 = true;
                        }

                        i_10 = ints_8[9] << 4;
                        i_11 = ints_8[10] << 4;
                        i_12 = ints_8[11] << 4;
                        i_47 = ints_8[12] << 4;
                        i_14 = ints_8[13] << 4;
                        i_15 = ints_8[14] << 4;
                        if (aBool8614) {
                            i_16 = ints_8[0] * anInt8611 + ints_8[3] * anInt8607 + ints_8[6] * anInt8613 + 8192 >> 14;
                            i_17 = ints_8[1] * anInt8611 + ints_8[4] * anInt8607 + ints_8[7] * anInt8613 + 8192 >> 14;
                            i_18 = ints_8[2] * anInt8611 + ints_8[5] * anInt8607 + ints_8[8] * anInt8613 + 8192 >> 14;
                            i_16 += i_47;
                            i_17 += i_14;
                            i_18 += i_15;
                            anInt8611 = i_16;
                            anInt8607 = i_17;
                            anInt8613 = i_18;
                            aBool8614 = false;
                        }

                        i_16 = i_31 << 15 >> 7;
                        i_17 = i_41 << 15 >> 7;
                        i_18 = i_51 << 15 >> 7;
                        i_19 = i_16 * -anInt8611 + 8192 >> 14;
                        i_20 = i_17 * -anInt8607 + 8192 >> 14;
                        i_21 = i_18 * -anInt8613 + 8192 >> 14;
                        i_22 = i_19 + anInt8611;
                        i_23 = i_20 + anInt8607;
                        i_24 = i_21 + anInt8613;
                        int[] ints_50 = {i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, i_17 * ints_8[7] + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, i_18 * ints_8[5] + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14};
                        i_26 = i_16 * i_47 + 8192 >> 14;
                        i_27 = i_17 * i_14 + 8192 >> 14;
                        i_28 = i_18 * i_15 + 8192 >> 14;
                        i_26 += i_22;
                        i_27 += i_23;
                        i_28 += i_24;
                        int[] ints_51 = new int[9];

                        int i_52;
                        for (i_30 = 0; i_30 < 3; i_30++) {
                            for (i_52 = 0; i_52 < 3; i_52++) {
                                i_32 = 0;

                                for (i_33 = 0; i_33 < 3; i_33++) {
                                    i_32 += ints_8[i_30 * 3 + i_33] * ints_50[i_52 + i_33 * 3];
                                }

                                ints_51[i_30 * 3 + i_52] = i_32 + 8192 >> 14;
                            }
                        }

                        i_30 = ints_8[0] * i_26 + ints_8[1] * i_27 + ints_8[2] * i_28 + 8192 >> 14;
                        i_52 = ints_8[3] * i_26 + ints_8[4] * i_27 + ints_8[5] * i_28 + 8192 >> 14;
                        i_32 = ints_8[6] * i_26 + ints_8[7] * i_27 + ints_8[8] * i_28 + 8192 >> 14;
                        i_30 += i_10;
                        i_52 += i_11;
                        i_32 += i_12;

                        for (i_33 = 0; i_33 < i_9; i_33++) {
                            i_34 = ints_2[i_33];
                            if (i_34 < anIntArrayArray8568.length) {
                                ints_35 = anIntArrayArray8568[i_34];

                                for (i_36 = 0; i_36 < ints_35.length; i_36++) {
                                    i_37 = ints_35[i_36];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_37]) != 0) {
                                        i_38 = ints_51[0] * anIntArray8580[i_37] + ints_51[1] * anIntArray8581[i_37] + ints_51[2] * anIntArray8610[i_37] + 8192 >> 14;
                                        i_39 = ints_51[3] * anIntArray8580[i_37] + ints_51[4] * anIntArray8581[i_37] + ints_51[5] * anIntArray8610[i_37] + 8192 >> 14;
                                        i_40 = ints_51[6] * anIntArray8580[i_37] + ints_51[7] * anIntArray8581[i_37] + ints_51[8] * anIntArray8610[i_37] + 8192 >> 14;
                                        i_38 += i_30;
                                        i_39 += i_52;
                                        i_40 += i_32;
                                        anIntArray8580[i_37] = i_38;
                                        anIntArray8581[i_37] = i_39;
                                        anIntArray8610[i_37] = i_40;
                                    }
                                }
                            }
                        }
                    } else {
                        for (i_10 = 0; i_10 < i_9; i_10++) {
                            i_11 = ints_2[i_10];
                            if (i_11 < anIntArrayArray8568.length) {
                                ints_49 = anIntArrayArray8568[i_11];

                                for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                    i_14 = ints_49[i_47];
                                    if (aShortArray8569 == null || (i_7 & aShortArray8569[i_14]) != 0) {
                                        anIntArray8580[i_14] -= anInt8611;
                                        anIntArray8581[i_14] -= anInt8607;
                                        anIntArray8610[i_14] -= anInt8613;
                                        anIntArray8580[i_14] = anIntArray8580[i_14] * i_31 / 128;
                                        anIntArray8581[i_14] = anIntArray8581[i_14] * i_41 / 128;
                                        anIntArray8610[i_14] = anIntArray8610[i_14] * i_51 / 128;
                                        anIntArray8580[i_14] += anInt8611;
                                        anIntArray8581[i_14] += anInt8607;
                                        anIntArray8610[i_14] += anInt8613;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    Class193 class193_53;
                    Class176 class176_56;
                    if (i_1 == 5) {
                        if (anIntArrayArray8608 != null && aByteArray8602 != null) {
                            for (i_10 = 0; i_10 < i_9; i_10++) {
                                i_11 = ints_2[i_10];
                                if (i_11 < anIntArrayArray8608.length) {
                                    ints_49 = anIntArrayArray8608[i_11];

                                    for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                        i_14 = ints_49[i_47];
                                        if (aShortArray8632 == null || (i_7 & aShortArray8632[i_14]) != 0) {
                                            i_15 = (aByteArray8602[i_14] & 0xff) + i_31 * 8;
                                            if (i_15 < 0) {
                                                i_15 = 0;
                                            } else if (i_15 > 255) {
                                                i_15 = 255;
                                            }

                                            aByteArray8602[i_14] = (byte) i_15;
                                        }
                                    }
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_10 = 0; i_10 < anInt8617; i_10++) {
                                    class193_53 = aClass193Array8618[i_10];
                                    class176_56 = aClass176Array8582[i_10];
                                    class176_56.anInt2199 = (class176_56.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (aByteArray8602[class193_53.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
                                }
                            }
                        }
                    } else if (i_1 == 7) {
                        if (anIntArrayArray8608 != null) {
                            for (i_10 = 0; i_10 < i_9; i_10++) {
                                i_11 = ints_2[i_10];
                                if (i_11 < anIntArrayArray8608.length) {
                                    ints_49 = anIntArrayArray8608[i_11];

                                    for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                        i_14 = ints_49[i_47];
                                        if (aShortArray8632 == null || (i_7 & aShortArray8632[i_14]) != 0) {
                                            i_15 = aShortArray8604[i_14] & 0xffff;
                                            i_16 = i_15 >> 10 & 0x3f;
                                            i_17 = i_15 >> 7 & 0x7;
                                            i_18 = i_15 & 0x7f;
                                            i_16 = i_16 + i_31 & 0x3f;
                                            i_17 += i_41;
                                            if (i_17 < 0) {
                                                i_17 = 0;
                                            } else if (i_17 > 7) {
                                                i_17 = 7;
                                            }

                                            i_18 += i_51;
                                            if (i_18 < 0) {
                                                i_18 = 0;
                                            } else if (i_18 > 127) {
                                                i_18 = 127;
                                            }

                                            aShortArray8604[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
                                        }
                                    }

                                    aBool8609 = true;
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_10 = 0; i_10 < anInt8617; i_10++) {
                                    class193_53 = aClass193Array8618[i_10];
                                    class176_56 = aClass176Array8582[i_10];
                                    class176_56.anInt2199 = (class176_56.anInt2199 * -1022818925 * -1303125861 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_53.anInt2393 * -1274099887 * 142270897] & 0xffff) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
                                }
                            }
                        }
                    } else {
                        Class176 class176_55;
                        if (i_1 == 8) {
                            if (anIntArrayArray8620 != null) {
                                for (i_10 = 0; i_10 < i_9; i_10++) {
                                    i_11 = ints_2[i_10];
                                    if (i_11 < anIntArrayArray8620.length) {
                                        ints_49 = anIntArrayArray8620[i_11];

                                        for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                            class176_55 = aClass176Array8582[ints_49[i_47]];
                                            class176_55.anInt2192 = (class176_55.anInt2192 * -943685543 + i_31 * -943685543) * -310982679;
                                            class176_55.anInt2189 = (class176_55.anInt2189 * 1414070385 + i_41 * 1414070385) * 1349697681;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 10) {
                            if (anIntArrayArray8620 != null) {
                                for (i_10 = 0; i_10 < i_9; i_10++) {
                                    i_11 = ints_2[i_10];
                                    if (i_11 < anIntArrayArray8620.length) {
                                        ints_49 = anIntArrayArray8620[i_11];

                                        for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                            class176_55 = aClass176Array8582[ints_49[i_47]];
                                            class176_55.aFloat2190 = class176_55.aFloat2190 * i_31 / 128.0F;
                                            class176_55.aFloat2191 = class176_55.aFloat2191 * i_41 / 128.0F;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 9 && anIntArrayArray8620 != null) {
                            for (i_10 = 0; i_10 < i_9; i_10++) {
                                i_11 = ints_2[i_10];
                                if (i_11 < anIntArrayArray8620.length) {
                                    ints_49 = anIntArrayArray8620[i_11];

                                    for (i_47 = 0; i_47 < ints_49.length; i_47++) {
                                        class176_55 = aClass176Array8582[ints_49[i_47]];
                                        class176_55.anInt2194 = (class176_55.anInt2194 * 2076699445 * 156323613 + i_31 & 0x3fff) * 2076699445 * 156323613;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    public int ca() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8570;
    }

    @Override
    public void cr(int i_1) {
        if ((anInt8575 & 0x2000) != 8192) {
            throw new IllegalStateException();
        } else {
            anInt8577 = i_1;
            anInt8598 = 0;
        }
    }

    @Override
    public void method11299(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
        MeshRasterizer_Sub2 class528_sub2_6 = (MeshRasterizer_Sub2) meshrasterizer_1;
        if ((anInt8575 & 0x10000) != 65536) {
            throw new IllegalStateException("");
        } else if ((class528_sub2_6.anInt8575 & 0x10000) != 65536) {
            throw new IllegalStateException("");
        } else {
            method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
            method13876();
            method13877();
            class528_sub2_6.method13876();
            class528_sub2_6.method13877();
            ++anInt8612;
            int i_7 = 0;
            int[] ints_8 = class528_sub2_6.anIntArray8580;
            int i_9 = class528_sub2_6.anInt8579;

            int i_10;
            for (i_10 = 0; i_10 < anInt8579; i_10++) {
                Class189 class189_11 = aClass189Array8584[i_10];
                if (class189_11.anInt2382 != 0) {
                    int i_12 = anIntArray8581[i_10] - i_3;
                    if (i_12 >= class528_sub2_6.aShort8570 && i_12 <= class528_sub2_6.aShort8625) {
                        int i_13 = anIntArray8580[i_10] - i_2;
                        if (i_13 >= class528_sub2_6.aShort8634 && i_13 <= class528_sub2_6.aShort8627) {
                            int i_14 = anIntArray8610[i_10] - i_4;
                            if (i_14 >= class528_sub2_6.aShort8571 && i_14 <= class528_sub2_6.aShort8629) {
                                for (int i_15 = 0; i_15 < i_9; i_15++) {
                                    Class189 class189_16 = class528_sub2_6.aClass189Array8584[i_15];
                                    if (i_13 == ints_8[i_15] && i_14 == class528_sub2_6.anIntArray8610[i_15] && i_12 == class528_sub2_6.anIntArray8581[i_15] && class189_16.anInt2382 != 0) {
                                        if (aClass189Array8585 == null) {
                                            aClass189Array8585 = new Class189[anInt8579];
                                        }

                                        if (class528_sub2_6.aClass189Array8585 == null) {
                                            class528_sub2_6.aClass189Array8585 = new Class189[i_9];
                                        }

                                        Class189 class189_17 = aClass189Array8585[i_10];
                                        if (class189_17 == null) {
                                            class189_17 = aClass189Array8585[i_10] = new Class189(class189_11);
                                        }

                                        Class189 class189_18 = class528_sub2_6.aClass189Array8585[i_15];
                                        if (class189_18 == null) {
                                            class189_18 = class528_sub2_6.aClass189Array8585[i_15] = new Class189(class189_16);
                                        }

                                        class189_17.anInt2380 += class189_16.anInt2380;
                                        class189_17.anInt2381 += class189_16.anInt2381;
                                        class189_17.anInt2379 += class189_16.anInt2379;
                                        class189_17.anInt2382 += class189_16.anInt2382;
                                        class189_18.anInt2380 += class189_11.anInt2380;
                                        class189_18.anInt2381 += class189_11.anInt2381;
                                        class189_18.anInt2379 += class189_11.anInt2379;
                                        class189_18.anInt2382 += class189_11.anInt2382;
                                        ++i_7;
                                        anIntArray8567[i_10] = anInt8612;
                                        anIntArray8619[i_15] = anInt8612;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (i_7 >= 3 && bool_5) {
                for (i_10 = 0; i_10 < anInt8586; i_10++) {
                    if (anIntArray8567[aShortArray8587[i_10]] == anInt8612 && anIntArray8567[aShortArray8588[i_10]] == anInt8612 && anIntArray8567[aShortArray8642[i_10]] == anInt8612) {
                        if (aByteArray8600 == null) {
                            aByteArray8600 = new byte[anInt8586];
                        }

                        aByteArray8600[i_10] = 2;
                    }
                }

                for (i_10 = 0; i_10 < class528_sub2_6.anInt8586; i_10++) {
                    if (anIntArray8619[class528_sub2_6.aShortArray8587[i_10]] == anInt8612 && anIntArray8619[class528_sub2_6.aShortArray8588[i_10]] == anInt8612 && anIntArray8619[class528_sub2_6.aShortArray8642[i_10]] == anInt8612) {
                        if (class528_sub2_6.aByteArray8600 == null) {
                            class528_sub2_6.aByteArray8600 = new byte[class528_sub2_6.anInt8586];
                        }

                        class528_sub2_6.aByteArray8600[i_10] = 2;
                    }
                }
            }

        }
    }

    @Override
    public int dg() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8574;
    }

    @Override
    public MeshRasterizer method11277(byte b_1, int i_2, boolean bool_3) {
        method13796(Thread.currentThread());
        boolean bool_4 = false;
        MeshRasterizer_Sub2 class528_sub2_5;
        MeshRasterizer_Sub2 class528_sub2_6;
        if (b_1 > 0 && b_1 <= 7) {
            class528_sub2_6 = aMeshRasterizer_Sub2Array8645[b_1 - 1];
            class528_sub2_5 = aMeshRasterizer_Sub2Array8626[b_1 - 1];
            bool_4 = true;
        } else {
            class528_sub2_5 = class528_sub2_6 = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_8638);
        }

        return method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
    }

    @Override
    public MeshRasterizer method11278(byte b_1, int i_2, boolean bool_3) {
        method13796(Thread.currentThread());
        boolean bool_4 = false;
        MeshRasterizer_Sub2 class528_sub2_5;
        MeshRasterizer_Sub2 class528_sub2_6;
        if (b_1 > 0 && b_1 <= 7) {
            class528_sub2_6 = aMeshRasterizer_Sub2Array8645[b_1 - 1];
            class528_sub2_5 = aMeshRasterizer_Sub2Array8626[b_1 - 1];
            bool_4 = true;
        } else {
            class528_sub2_5 = class528_sub2_6 = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_8638);
        }

        return method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
    }

    @Override
    public MeshRasterizer method11279(byte b_1, int i_2, boolean bool_3) {
        method13796(Thread.currentThread());
        boolean bool_4 = false;
        MeshRasterizer_Sub2 class528_sub2_5;
        MeshRasterizer_Sub2 class528_sub2_6;
        if (b_1 > 0 && b_1 <= 7) {
            class528_sub2_6 = aMeshRasterizer_Sub2Array8645[b_1 - 1];
            class528_sub2_5 = aMeshRasterizer_Sub2Array8626[b_1 - 1];
            bool_4 = true;
        } else {
            class528_sub2_5 = class528_sub2_6 = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_8638);
        }

        return method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
    }

    @Override
    public MeshRasterizer method11296(byte b_1, int i_2, boolean bool_3) {
        method13796(Thread.currentThread());
        boolean bool_4 = false;
        MeshRasterizer_Sub2 class528_sub2_5;
        MeshRasterizer_Sub2 class528_sub2_6;
        if (b_1 > 0 && b_1 <= 7) {
            class528_sub2_6 = aMeshRasterizer_Sub2Array8645[b_1 - 1];
            class528_sub2_5 = aMeshRasterizer_Sub2Array8626[b_1 - 1];
            bool_4 = true;
        } else {
            class528_sub2_5 = class528_sub2_6 = new MeshRasterizer_Sub2(aGraphicalRenderer_Sub3_8638);
        }

        return method13804(class528_sub2_5, class528_sub2_6, i_2, bool_4, bool_3);
    }

    @Override
    public int ci() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8634;
    }

    @Override
    public int ae() {
        return anInt8575;
    }

    @Override
    public void aq(int i_1) {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
            synchronized (this) {
                if ((anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
                    method13853(true);
                }

                anInt8575 = i_1;
            }
        } else {
            if ((anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
                method13853(true);
            }

            anInt8575 = i_1;
        }

    }

    @Override
    public byte[] aw() {
        return aByteArray8602;
    }

    @Override
    public void KA(int i_1) {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
            synchronized (this) {
                if ((anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
                    method13853(true);
                }

                anInt8575 = i_1;
            }
        } else {
            if ((anInt8575 & 0x10000) == 65536 && (i_1 & 0x10000) == 0) {
                method13853(true);
            }

            anInt8575 = i_1;
        }

    }

    @Override
    public void bx(int i_1) {
        if ((anInt8575 & 0x5) != 5) {
            throw new IllegalStateException();
        } else {
            if (i_1 == 4096) {
                method13805();
            } else if (i_1 == 8192) {
                method13806();
            } else if (i_1 == 12288) {
                method13807();
            } else {
                int i_2 = Trig.SINE[i_1];
                int i_3 = Trig.COSINE[i_1];
                synchronized (this) {
                    for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                        int i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                        anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                        anIntArray8580[i_5] = i_6;
                    }

                    method13812();
                }
            }

        }
    }

    @Override
    public void bz(int i_1) {
        if ((anInt8575 & 0xd) != 13) {
            throw new IllegalStateException();
        } else {
            if (aClass189Array8584 != null) {
                if (i_1 == 4096) {
                    method13850();
                } else if (i_1 == 8192) {
                    method13809();
                } else if (i_1 == 12288) {
                    method13810();
                } else {
                    int i_2 = Trig.SINE[i_1];
                    int i_3 = Trig.COSINE[i_1];
                    synchronized (this) {
                        int i_5;
                        int i_6;
                        for (i_5 = 0; i_5 < anInt8579; i_5++) {
                            i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                            anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                            anIntArray8580[i_5] = i_6;
                            if (aClass189Array8584[i_5] != null) {
                                i_6 = aClass189Array8584[i_5].anInt2379 * i_2 + aClass189Array8584[i_5].anInt2380 * i_3 >> 14;
                                aClass189Array8584[i_5].anInt2379 = aClass189Array8584[i_5].anInt2379 * i_3 - aClass189Array8584[i_5].anInt2380 * i_2 >> 14;
                                aClass189Array8584[i_5].anInt2380 = i_6;
                            }
                        }

                        if (aClass195Array8599 != null) {
                            for (i_5 = 0; i_5 < anInt8586; i_5++) {
                                if (aClass195Array8599[i_5] != null) {
                                    i_6 = aClass195Array8599[i_5].anInt2412 * i_2 + aClass195Array8599[i_5].anInt2410 * i_3 >> 14;
                                    aClass195Array8599[i_5].anInt2412 = aClass195Array8599[i_5].anInt2412 * i_3 - aClass195Array8599[i_5].anInt2410 * i_2 >> 14;
                                    aClass195Array8599[i_5].anInt2410 = i_6;
                                }
                            }
                        }

                        for (i_5 = anInt8579; i_5 < anInt8578; i_5++) {
                            i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                            anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                            anIntArray8580[i_5] = i_6;
                        }

                        anInt8598 = 0;
                        aBool8621 = false;
                    }
                }
            } else {
                f(i_1);
            }

        }
    }

    @Override
    public void method11295() {
    }

    void method13848(boolean bool_1, boolean bool_2, boolean bool_3, int i_4) {
        short s_5 = aShortArray8587[i_4];
        short s_6 = aShortArray8588[i_4];
        short s_7 = aShortArray8642[i_4];
        if (aShortArray8603 != null && aShortArray8603[i_4] != -1) {
            int i_8 = -16777216;
            if (aByteArray8602 != null) {
                i_8 = 255 - (aByteArray8602[i_4] & 0xff) << 24;
            }

            if (anIntArray8594[i_4] == -1) {
                int i_9 = i_8 | anIntArray8592[i_4] & 0xffffff;
                aClass144_8566.method2424(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], aFloatArray8637[s_5], aFloatArray8637[s_6], aFloatArray8637[s_7], aFloatArrayArray8635[i_4][0], aFloatArrayArray8635[i_4][1], aFloatArrayArray8635[i_4][2], aFloatArrayArray8591[i_4][0], aFloatArrayArray8591[i_4][1], aFloatArrayArray8591[i_4][2], i_9, i_9, i_9, aClass185_8564.anInt2307, 0.0F, 0.0F, 0.0F, aShortArray8603[i_4]);
            } else {
                aClass144_8566.method2424(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], aFloatArray8637[s_5], aFloatArray8637[s_6], aFloatArray8637[s_7], aFloatArrayArray8635[i_4][0], aFloatArrayArray8635[i_4][1], aFloatArrayArray8635[i_4][2], aFloatArrayArray8591[i_4][0], aFloatArrayArray8591[i_4][1], aFloatArrayArray8591[i_4][2], i_8 | anIntArray8592[i_4] & 0xffffff, i_8 | anIntArray8631[i_4] & 0xffffff, i_8 | anIntArray8594[i_4] & 0xffffff, aClass185_8564.anInt2307, 0.0F, 0.0F, 0.0F, aShortArray8603[i_4]);
            }
        } else {
            if (aByteArray8602 == null) {
                aClass144_8566.anInt1674 = 0;
            } else {
                aClass144_8566.anInt1674 = aByteArray8602[i_4] & 0xff;
            }

            if (anIntArray8594[i_4] == -1) {
                aClass144_8566.method2428(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], Class335.anIntArray3916[anIntArray8592[i_4] & 0xffff]);
            } else {
                aClass144_8566.method2426(bool_1, bool_2, bool_3, aFloatArray8605[s_5], aFloatArray8605[s_6], aFloatArray8605[s_7], aFloatArray8590[s_5], aFloatArray8590[s_6], aFloatArray8590[s_7], aFloatArray8636[s_5], aFloatArray8636[s_6], aFloatArray8636[s_7], (anIntArray8592[i_4] & 0xffff), (anIntArray8631[i_4] & 0xffff), (anIntArray8594[i_4] & 0xffff));
            }
        }

    }

    @Override
    public int YA() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8570;
    }

    void method13850() {
        synchronized (this) {
            int i_2;
            int i_3;
            for (i_2 = 0; i_2 < anInt8579; i_2++) {
                i_3 = anIntArray8580[i_2];
                anIntArray8580[i_2] = anIntArray8610[i_2];
                anIntArray8610[i_2] = -i_3;
                if (aClass189Array8584[i_2] != null) {
                    i_3 = aClass189Array8584[i_2].anInt2380;
                    aClass189Array8584[i_2].anInt2380 = aClass189Array8584[i_2].anInt2379;
                    aClass189Array8584[i_2].anInt2379 = -i_3;
                }
            }

            if (aClass195Array8599 != null) {
                for (i_2 = 0; i_2 < anInt8586; i_2++) {
                    if (aClass195Array8599[i_2] != null) {
                        i_3 = aClass195Array8599[i_2].anInt2410;
                        aClass195Array8599[i_2].anInt2410 = aClass195Array8599[i_2].anInt2412;
                        aClass195Array8599[i_2].anInt2412 = -i_3;
                    }
                }
            }

            for (i_2 = anInt8579; i_2 < anInt8578; i_2++) {
                i_3 = anIntArray8580[i_2];
                anIntArray8580[i_2] = anIntArray8610[i_2];
                anIntArray8610[i_2] = -i_3;
            }

            anInt8598 = 0;
            aBool8621 = false;
        }
    }

    @Override
    public Shadow ga(Shadow class282_sub50_sub17_1) {
        return null;
    }

    void method13853(boolean bool_1) {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
            synchronized (this) {
                method13798(bool_1);
            }
        } else {
            method13798(bool_1);
        }

    }

    @Override
    public void bs(int i_1) {
        if ((anInt8575 & 0x6) != 6) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = anIntArray8581[i_5] * i_3 - anIntArray8610[i_5] * i_2 >> 14;
                    anIntArray8610[i_5] = anIntArray8581[i_5] * i_2 + anIntArray8610[i_5] * i_3 >> 14;
                    anIntArray8581[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void bm(int i_1) {
        if ((anInt8575 & 0x6) != 6) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = anIntArray8581[i_5] * i_3 - anIntArray8610[i_5] * i_2 >> 14;
                    anIntArray8610[i_5] = anIntArray8581[i_5] * i_2 + anIntArray8610[i_5] * i_3 >> 14;
                    anIntArray8581[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void bf(int i_1) {
        if ((anInt8575 & 0x6) != 6) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = anIntArray8581[i_5] * i_3 - anIntArray8610[i_5] * i_2 >> 14;
                    anIntArray8610[i_5] = anIntArray8581[i_5] * i_2 + anIntArray8610[i_5] * i_3 >> 14;
                    anIntArray8581[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void bn(int i_1) {
        if ((anInt8575 & 0x6) != 6) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = anIntArray8581[i_5] * i_3 - anIntArray8610[i_5] * i_2 >> 14;
                    anIntArray8610[i_5] = anIntArray8581[i_5] * i_2 + anIntArray8610[i_5] * i_3 >> 14;
                    anIntArray8581[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void be() {
        if ((anInt8575 & 0x10) != 16) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                int i_2;
                for (i_2 = 0; i_2 < anInt8578; i_2++) {
                    anIntArray8610[i_2] = -anIntArray8610[i_2];
                }

                if (aClass189Array8584 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8584[i_2] != null) {
                            aClass189Array8584[i_2].anInt2379 = -aClass189Array8584[i_2].anInt2379;
                        }
                    }
                }

                if (aClass189Array8585 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8585[i_2] != null) {
                            aClass189Array8585[i_2].anInt2379 = -aClass189Array8585[i_2].anInt2379;
                        }
                    }
                }

                if (aClass195Array8599 != null) {
                    for (i_2 = 0; i_2 < anInt8586; i_2++) {
                        if (aClass195Array8599[i_2] != null) {
                            aClass195Array8599[i_2].anInt2412 = -aClass195Array8599[i_2].anInt2412;
                        }
                    }
                }

                short[] shorts_5 = aShortArray8587;
                aShortArray8587 = aShortArray8642;
                aShortArray8642 = shorts_5;
                if (aFloatArrayArray8635 != null) {
                    for (int i_3 = 0; i_3 < anInt8586; i_3++) {
                        float f_4;
                        if (aFloatArrayArray8635[i_3] != null) {
                            f_4 = aFloatArrayArray8635[i_3][0];
                            aFloatArrayArray8635[i_3][0] = aFloatArrayArray8635[i_3][2];
                            aFloatArrayArray8635[i_3][2] = f_4;
                        }

                        if (aFloatArrayArray8591[i_3] != null) {
                            f_4 = aFloatArrayArray8591[i_3][0];
                            aFloatArrayArray8591[i_3][0] = aFloatArrayArray8591[i_3][2];
                            aFloatArrayArray8591[i_3][2] = f_4;
                        }
                    }
                }

                aBool8621 = false;
                anInt8598 = 0;
            }
        }
    }

    @Override
    public void by() {
        if ((anInt8575 & 0x10) != 16) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                int i_2;
                for (i_2 = 0; i_2 < anInt8578; i_2++) {
                    anIntArray8610[i_2] = -anIntArray8610[i_2];
                }

                if (aClass189Array8584 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8584[i_2] != null) {
                            aClass189Array8584[i_2].anInt2379 = -aClass189Array8584[i_2].anInt2379;
                        }
                    }
                }

                if (aClass189Array8585 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8585[i_2] != null) {
                            aClass189Array8585[i_2].anInt2379 = -aClass189Array8585[i_2].anInt2379;
                        }
                    }
                }

                if (aClass195Array8599 != null) {
                    for (i_2 = 0; i_2 < anInt8586; i_2++) {
                        if (aClass195Array8599[i_2] != null) {
                            aClass195Array8599[i_2].anInt2412 = -aClass195Array8599[i_2].anInt2412;
                        }
                    }
                }

                short[] shorts_5 = aShortArray8587;
                aShortArray8587 = aShortArray8642;
                aShortArray8642 = shorts_5;
                if (aFloatArrayArray8635 != null) {
                    for (int i_3 = 0; i_3 < anInt8586; i_3++) {
                        float f_4;
                        if (aFloatArrayArray8635[i_3] != null) {
                            f_4 = aFloatArrayArray8635[i_3][0];
                            aFloatArrayArray8635[i_3][0] = aFloatArrayArray8635[i_3][2];
                            aFloatArrayArray8635[i_3][2] = f_4;
                        }

                        if (aFloatArrayArray8591[i_3] != null) {
                            f_4 = aFloatArrayArray8591[i_3][0];
                            aFloatArrayArray8591[i_3][0] = aFloatArrayArray8591[i_3][2];
                            aFloatArrayArray8591[i_3][2] = f_4;
                        }
                    }
                }

                aBool8621 = false;
                anInt8598 = 0;
            }
        }
    }

    @Override
    public void ia(int i_1, int i_2, int i_3) {
        if (i_1 != 0 && (anInt8575 & 0x1) != 1) {
            throw new IllegalStateException();
        } else if (i_2 != 0 && (anInt8575 & 0x2) != 2) {
            throw new IllegalStateException();
        } else if (i_3 != 0 && (anInt8575 & 0x4) != 4) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] += i_1;
                    anIntArray8581[i_5] += i_2;
                    anIntArray8610[i_5] += i_3;
                }

            }
        }
    }

    int method13855(int i_1, int i_2) {
        int i_21 = i_2;
        i_21 = (i_1 & 0x7f) * i_21 >> 7;
        if (i_21 < 2) {
            i_21 = 2;
        } else if (i_21 > 126) {
            i_21 = 126;
        }

        return i_21 + (i_1 & 0xff80);
    }

    @Override
    public Shadow dr(Shadow class282_sub50_sub17_1) {
        return null;
    }

    @Override
    void method11288() {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
            synchronized (this) {
                aBool7023 = false;
                notifyAll();
            }
        }

    }

    @Override
    void method11285() {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
            synchronized (this) {
                aBool7023 = false;
                notifyAll();
            }
        }

    }

    @Override
    boolean bh() {
        if (anIntArrayArray8568 == null) {
            return false;
        } else {
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;
            return true;
        }
    }

    @Override
    boolean bv() {
        if (anIntArrayArray8568 == null) {
            return false;
        } else {
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;
            return true;
        }
    }

    @Override
    public void bj(int i_1) {
        if ((anInt8575 & 0xd) != 13) {
            throw new IllegalStateException();
        } else {
            if (aClass189Array8584 != null) {
                if (i_1 == 4096) {
                    method13850();
                } else if (i_1 == 8192) {
                    method13809();
                } else if (i_1 == 12288) {
                    method13810();
                } else {
                    int i_2 = Trig.SINE[i_1];
                    int i_3 = Trig.COSINE[i_1];
                    synchronized (this) {
                        int i_5;
                        int i_6;
                        for (i_5 = 0; i_5 < anInt8579; i_5++) {
                            i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                            anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                            anIntArray8580[i_5] = i_6;
                            if (aClass189Array8584[i_5] != null) {
                                i_6 = aClass189Array8584[i_5].anInt2379 * i_2 + aClass189Array8584[i_5].anInt2380 * i_3 >> 14;
                                aClass189Array8584[i_5].anInt2379 = aClass189Array8584[i_5].anInt2379 * i_3 - aClass189Array8584[i_5].anInt2380 * i_2 >> 14;
                                aClass189Array8584[i_5].anInt2380 = i_6;
                            }
                        }

                        if (aClass195Array8599 != null) {
                            for (i_5 = 0; i_5 < anInt8586; i_5++) {
                                if (aClass195Array8599[i_5] != null) {
                                    i_6 = aClass195Array8599[i_5].anInt2412 * i_2 + aClass195Array8599[i_5].anInt2410 * i_3 >> 14;
                                    aClass195Array8599[i_5].anInt2412 = aClass195Array8599[i_5].anInt2412 * i_3 - aClass195Array8599[i_5].anInt2410 * i_2 >> 14;
                                    aClass195Array8599[i_5].anInt2410 = i_6;
                                }
                            }
                        }

                        for (i_5 = anInt8579; i_5 < anInt8578; i_5++) {
                            i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                            anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                            anIntArray8580[i_5] = i_6;
                        }

                        anInt8598 = 0;
                        aBool8621 = false;
                    }
                }
            } else {
                f(i_1);
            }

        }
    }

    @Override
    void method11275(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
        int i_8 = ints_2.length;
        int i_9;
        int i_10;
        int i_13;
        int i_14;
        if (i_1 == 0) {
            i_3 <<= 4;
            i_4 <<= 4;
            i_5 <<= 4;
            if (!aBool8589) {
                for (i_9 = 0; i_9 < anInt8578; i_9++) {
                    anIntArray8580[i_9] <<= 4;
                    anIntArray8581[i_9] <<= 4;
                    anIntArray8610[i_9] <<= 4;
                }

                aBool8589 = true;
            }

            i_9 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_10 = 0; i_10 < i_8; i_10++) {
                int i_11 = ints_2[i_10];
                if (i_11 < anIntArrayArray8568.length) {
                    int[] ints_12 = anIntArrayArray8568[i_11];

                    for (i_13 = 0; i_13 < ints_12.length; i_13++) {
                        i_14 = ints_12[i_13];
                        anInt8611 += anIntArray8580[i_14];
                        anInt8607 += anIntArray8581[i_14];
                        anInt8613 += anIntArray8610[i_14];
                        ++i_9;
                    }
                }
            }

            if (i_9 > 0) {
                anInt8611 = anInt8611 / i_9 + i_3;
                anInt8607 = anInt8607 / i_9 + i_4;
                anInt8613 = anInt8613 / i_9 + i_5;
            } else {
                anInt8611 = i_3;
                anInt8607 = i_4;
                anInt8613 = i_5;
            }
        } else {
            int[] ints_18;
            int i_19;
            if (i_1 == 1) {
                i_3 <<= 4;
                i_4 <<= 4;
                i_5 <<= 4;
                if (!aBool8589) {
                    for (i_9 = 0; i_9 < anInt8578; i_9++) {
                        anIntArray8580[i_9] <<= 4;
                        anIntArray8581[i_9] <<= 4;
                        anIntArray8610[i_9] <<= 4;
                    }

                    aBool8589 = true;
                }

                for (i_9 = 0; i_9 < i_8; i_9++) {
                    i_10 = ints_2[i_9];
                    if (i_10 < anIntArrayArray8568.length) {
                        ints_18 = anIntArrayArray8568[i_10];

                        for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                            i_13 = ints_18[i_19];
                            anIntArray8580[i_13] += i_3;
                            anIntArray8581[i_13] += i_4;
                            anIntArray8610[i_13] += i_5;
                        }
                    }
                }
            } else {
                int i_15;
                int i_16;
                if (i_1 == 2) {
                    for (i_9 = 0; i_9 < i_8; i_9++) {
                        i_10 = ints_2[i_9];
                        if (i_10 < anIntArrayArray8568.length) {
                            ints_18 = anIntArrayArray8568[i_10];
                            if ((i_6 & 0x1) == 0) {
                                for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                    i_13 = ints_18[i_19];
                                    anIntArray8580[i_13] -= anInt8611;
                                    anIntArray8581[i_13] -= anInt8607;
                                    anIntArray8610[i_13] -= anInt8613;
                                    if (i_5 != 0) {
                                        i_14 = Trig.SINE[i_5];
                                        i_15 = Trig.COSINE[i_5];
                                        i_16 = anIntArray8581[i_13] * i_14 + anIntArray8580[i_13] * i_15 + 16383 >> 14;
                                        anIntArray8581[i_13] = anIntArray8581[i_13] * i_15 - anIntArray8580[i_13] * i_14 + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    if (i_3 != 0) {
                                        i_14 = Trig.SINE[i_3];
                                        i_15 = Trig.COSINE[i_3];
                                        i_16 = anIntArray8581[i_13] * i_15 - anIntArray8610[i_13] * i_14 + 16383 >> 14;
                                        anIntArray8610[i_13] = anIntArray8581[i_13] * i_14 + anIntArray8610[i_13] * i_15 + 16383 >> 14;
                                        anIntArray8581[i_13] = i_16;
                                    }

                                    if (i_4 != 0) {
                                        i_14 = Trig.SINE[i_4];
                                        i_15 = Trig.COSINE[i_4];
                                        i_16 = anIntArray8610[i_13] * i_14 + anIntArray8580[i_13] * i_15 + 16383 >> 14;
                                        anIntArray8610[i_13] = anIntArray8610[i_13] * i_15 - anIntArray8580[i_13] * i_14 + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    anIntArray8580[i_13] += anInt8611;
                                    anIntArray8581[i_13] += anInt8607;
                                    anIntArray8610[i_13] += anInt8613;
                                }
                            } else {
                                for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                    i_13 = ints_18[i_19];
                                    anIntArray8580[i_13] -= anInt8611;
                                    anIntArray8581[i_13] -= anInt8607;
                                    anIntArray8610[i_13] -= anInt8613;
                                    if (i_3 != 0) {
                                        i_14 = Trig.SINE[i_3];
                                        i_15 = Trig.COSINE[i_3];
                                        i_16 = anIntArray8581[i_13] * i_15 - anIntArray8610[i_13] * i_14 + 16383 >> 14;
                                        anIntArray8610[i_13] = anIntArray8581[i_13] * i_14 + anIntArray8610[i_13] * i_15 + 16383 >> 14;
                                        anIntArray8581[i_13] = i_16;
                                    }

                                    if (i_5 != 0) {
                                        i_14 = Trig.SINE[i_5];
                                        i_15 = Trig.COSINE[i_5];
                                        i_16 = anIntArray8581[i_13] * i_14 + anIntArray8580[i_13] * i_15 + 16383 >> 14;
                                        anIntArray8581[i_13] = anIntArray8581[i_13] * i_15 - anIntArray8580[i_13] * i_14 + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    if (i_4 != 0) {
                                        i_14 = Trig.SINE[i_4];
                                        i_15 = Trig.COSINE[i_4];
                                        i_16 = anIntArray8610[i_13] * i_14 + anIntArray8580[i_13] * i_15 + 16383 >> 14;
                                        anIntArray8610[i_13] = anIntArray8610[i_13] * i_15 - anIntArray8580[i_13] * i_14 + 16383 >> 14;
                                        anIntArray8580[i_13] = i_16;
                                    }

                                    anIntArray8580[i_13] += anInt8611;
                                    anIntArray8581[i_13] += anInt8607;
                                    anIntArray8610[i_13] += anInt8613;
                                }
                            }
                        }
                    }
                } else if (i_1 == 3) {
                    for (i_9 = 0; i_9 < i_8; i_9++) {
                        i_10 = ints_2[i_9];
                        if (i_10 < anIntArrayArray8568.length) {
                            ints_18 = anIntArrayArray8568[i_10];

                            for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                i_13 = ints_18[i_19];
                                anIntArray8580[i_13] -= anInt8611;
                                anIntArray8581[i_13] -= anInt8607;
                                anIntArray8610[i_13] -= anInt8613;
                                anIntArray8580[i_13] = anIntArray8580[i_13] * i_3 / 128;
                                anIntArray8581[i_13] = anIntArray8581[i_13] * i_4 / 128;
                                anIntArray8610[i_13] = anIntArray8610[i_13] * i_5 / 128;
                                anIntArray8580[i_13] += anInt8611;
                                anIntArray8581[i_13] += anInt8607;
                                anIntArray8610[i_13] += anInt8613;
                            }
                        }
                    }
                } else {
                    Class193 class193_20;
                    Class176 class176_22;
                    if (i_1 == 5) {
                        if (anIntArrayArray8608 != null && aByteArray8602 != null) {
                            for (i_9 = 0; i_9 < i_8; i_9++) {
                                i_10 = ints_2[i_9];
                                if (i_10 < anIntArrayArray8608.length) {
                                    ints_18 = anIntArrayArray8608[i_10];

                                    for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                        i_13 = ints_18[i_19];
                                        i_14 = (aByteArray8602[i_13] & 0xff) + i_3 * 8;
                                        if (i_14 < 0) {
                                            i_14 = 0;
                                        } else if (i_14 > 255) {
                                            i_14 = 255;
                                        }

                                        aByteArray8602[i_13] = (byte) i_14;
                                    }
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_9 = 0; i_9 < anInt8617; i_9++) {
                                    class193_20 = aClass193Array8618[i_9];
                                    class176_22 = aClass176Array8582[i_9];
                                    class176_22.anInt2199 = (class176_22.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (aByteArray8602[class193_20.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
                                }
                            }
                        }
                    } else if (i_1 == 7) {
                        if (anIntArrayArray8608 != null) {
                            for (i_9 = 0; i_9 < i_8; i_9++) {
                                i_10 = ints_2[i_9];
                                if (i_10 < anIntArrayArray8608.length) {
                                    ints_18 = anIntArrayArray8608[i_10];

                                    for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                        i_13 = ints_18[i_19];
                                        i_14 = aShortArray8604[i_13] & 0xffff;
                                        i_15 = i_14 >> 10 & 0x3f;
                                        i_16 = i_14 >> 7 & 0x7;
                                        int i_17 = i_14 & 0x7f;
                                        i_15 = i_15 + i_3 & 0x3f;
                                        i_16 += i_4;
                                        if (i_16 < 0) {
                                            i_16 = 0;
                                        } else if (i_16 > 7) {
                                            i_16 = 7;
                                        }

                                        i_17 += i_5;
                                        if (i_17 < 0) {
                                            i_17 = 0;
                                        } else if (i_17 > 127) {
                                            i_17 = 127;
                                        }

                                        aShortArray8604[i_13] = (short) (i_15 << 10 | i_16 << 7 | i_17);
                                    }

                                    aBool8609 = true;
                                }
                            }

                            if (aClass193Array8618 != null) {
                                for (i_9 = 0; i_9 < anInt8617; i_9++) {
                                    class193_20 = aClass193Array8618[i_9];
                                    class176_22 = aClass176Array8582[i_9];
                                    class176_22.anInt2199 = (class176_22.anInt2199 * -1022818925 * -1303125861 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_20.anInt2393 * -1274099887 * 142270897] & 0xffff) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
                                }
                            }
                        }
                    } else {
                        Class176 class176_21;
                        if (i_1 == 8) {
                            if (anIntArrayArray8620 != null) {
                                for (i_9 = 0; i_9 < i_8; i_9++) {
                                    i_10 = ints_2[i_9];
                                    if (i_10 < anIntArrayArray8620.length) {
                                        ints_18 = anIntArrayArray8620[i_10];

                                        for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                            class176_21 = aClass176Array8582[ints_18[i_19]];
                                            class176_21.anInt2192 = (class176_21.anInt2192 * -943685543 + i_3 * -943685543) * -310982679;
                                            class176_21.anInt2189 = (class176_21.anInt2189 * 1414070385 + i_4 * 1414070385) * 1349697681;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 10) {
                            if (anIntArrayArray8620 != null) {
                                for (i_9 = 0; i_9 < i_8; i_9++) {
                                    i_10 = ints_2[i_9];
                                    if (i_10 < anIntArrayArray8620.length) {
                                        ints_18 = anIntArrayArray8620[i_10];

                                        for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                            class176_21 = aClass176Array8582[ints_18[i_19]];
                                            class176_21.aFloat2190 = class176_21.aFloat2190 * i_3 / 128.0F;
                                            class176_21.aFloat2191 = class176_21.aFloat2191 * i_4 / 128.0F;
                                        }
                                    }
                                }
                            }
                        } else if (i_1 == 9 && anIntArrayArray8620 != null) {
                            for (i_9 = 0; i_9 < i_8; i_9++) {
                                i_10 = ints_2[i_9];
                                if (i_10 < anIntArrayArray8620.length) {
                                    ints_18 = anIntArrayArray8620[i_10];

                                    for (i_19 = 0; i_19 < ints_18.length; i_19++) {
                                        class176_21 = aClass176Array8582[ints_18[i_19]];
                                        class176_21.anInt2194 = (class176_21.anInt2194 * 2076699445 * 156323613 + i_3 & 0x3fff) * 2076699445 * 156323613;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    public void bq() {
        if ((anInt8575 & 0x10) != 16) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                int i_2;
                for (i_2 = 0; i_2 < anInt8578; i_2++) {
                    anIntArray8610[i_2] = -anIntArray8610[i_2];
                }

                if (aClass189Array8584 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8584[i_2] != null) {
                            aClass189Array8584[i_2].anInt2379 = -aClass189Array8584[i_2].anInt2379;
                        }
                    }
                }

                if (aClass189Array8585 != null) {
                    for (i_2 = 0; i_2 < anInt8579; i_2++) {
                        if (aClass189Array8585[i_2] != null) {
                            aClass189Array8585[i_2].anInt2379 = -aClass189Array8585[i_2].anInt2379;
                        }
                    }
                }

                if (aClass195Array8599 != null) {
                    for (i_2 = 0; i_2 < anInt8586; i_2++) {
                        if (aClass195Array8599[i_2] != null) {
                            aClass195Array8599[i_2].anInt2412 = -aClass195Array8599[i_2].anInt2412;
                        }
                    }
                }

                short[] shorts_5 = aShortArray8587;
                aShortArray8587 = aShortArray8642;
                aShortArray8642 = shorts_5;
                if (aFloatArrayArray8635 != null) {
                    for (int i_3 = 0; i_3 < anInt8586; i_3++) {
                        float f_4;
                        if (aFloatArrayArray8635[i_3] != null) {
                            f_4 = aFloatArrayArray8635[i_3][0];
                            aFloatArrayArray8635[i_3][0] = aFloatArrayArray8635[i_3][2];
                            aFloatArrayArray8635[i_3][2] = f_4;
                        }

                        if (aFloatArrayArray8591[i_3] != null) {
                            f_4 = aFloatArrayArray8591[i_3][0];
                            aFloatArrayArray8591[i_3][0] = aFloatArrayArray8591[i_3][2];
                            aFloatArrayArray8591[i_3][2] = f_4;
                        }
                    }
                }

                aBool8621 = false;
                anInt8598 = 0;
            }
        }
    }

    @Override
    void bb(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (i_1 == 0) {
            i_5 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_6 = 0; i_6 < anInt8578; i_6++) {
                anInt8611 += anIntArray8580[i_6];
                anInt8607 += anIntArray8581[i_6];
                anInt8613 += anIntArray8610[i_6];
                ++i_5;
            }

            if (i_5 > 0) {
                anInt8611 = anInt8611 / i_5 + i_2;
                anInt8607 = anInt8607 / i_5 + i_3;
                anInt8613 = anInt8613 / i_5 + i_4;
            } else {
                anInt8611 = i_2;
                anInt8607 = i_3;
                anInt8613 = i_4;
            }
        } else if (i_1 == 1) {
            for (i_5 = 0; i_5 < anInt8578; i_5++) {
                anIntArray8580[i_5] += i_2;
                anIntArray8581[i_5] += i_3;
                anIntArray8610[i_5] += i_4;
            }
        } else {
            int i_7;
            int i_8;
            if (i_1 == 2) {
                for (i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] -= anInt8611;
                    anIntArray8581[i_5] -= anInt8607;
                    anIntArray8610[i_5] -= anInt8613;
                    if (i_4 != 0) {
                        i_6 = Trig.SINE[i_4];
                        i_7 = Trig.COSINE[i_4];
                        i_8 = anIntArray8581[i_5] * i_6 + anIntArray8580[i_5] * i_7 + 16383 >> 14;
                        anIntArray8581[i_5] = anIntArray8581[i_5] * i_7 - anIntArray8580[i_5] * i_6 + 16383 >> 14;
                        anIntArray8580[i_5] = i_8;
                    }

                    if (i_2 != 0) {
                        i_6 = Trig.SINE[i_2];
                        i_7 = Trig.COSINE[i_2];
                        i_8 = anIntArray8581[i_5] * i_7 - anIntArray8610[i_5] * i_6 + 16383 >> 14;
                        anIntArray8610[i_5] = anIntArray8581[i_5] * i_6 + anIntArray8610[i_5] * i_7 + 16383 >> 14;
                        anIntArray8581[i_5] = i_8;
                    }

                    if (i_3 != 0) {
                        i_6 = Trig.SINE[i_3];
                        i_7 = Trig.COSINE[i_3];
                        i_8 = anIntArray8610[i_5] * i_6 + anIntArray8580[i_5] * i_7 + 16383 >> 14;
                        anIntArray8610[i_5] = anIntArray8610[i_5] * i_7 - anIntArray8580[i_5] * i_6 + 16383 >> 14;
                        anIntArray8580[i_5] = i_8;
                    }

                    anIntArray8580[i_5] += anInt8611;
                    anIntArray8581[i_5] += anInt8607;
                    anIntArray8610[i_5] += anInt8613;
                }
            } else if (i_1 == 3) {
                for (i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] -= anInt8611;
                    anIntArray8581[i_5] -= anInt8607;
                    anIntArray8610[i_5] -= anInt8613;
                    anIntArray8580[i_5] = anIntArray8580[i_5] * i_2 / 128;
                    anIntArray8581[i_5] = anIntArray8581[i_5] * i_3 / 128;
                    anIntArray8610[i_5] = anIntArray8610[i_5] * i_4 / 128;
                    anIntArray8580[i_5] += anInt8611;
                    anIntArray8581[i_5] += anInt8607;
                    anIntArray8610[i_5] += anInt8613;
                }
            } else {
                Class193 class193_10;
                Class176 class176_11;
                if (i_1 == 5) {
                    for (i_5 = 0; i_5 < anInt8586; i_5++) {
                        i_6 = (aByteArray8602[i_5] & 0xff) + i_2 * 8;
                        if (i_6 < 0) {
                            i_6 = 0;
                        } else if (i_6 > 255) {
                            i_6 = 255;
                        }

                        aByteArray8602[i_5] = (byte) i_6;
                    }

                    if (aClass193Array8618 != null) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class193_10 = aClass193Array8618[i_5];
                            class176_11 = aClass176Array8582[i_5];
                            class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (aByteArray8602[class193_10.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
                        }
                    }
                } else if (i_1 == 7) {
                    for (i_5 = 0; i_5 < anInt8586; i_5++) {
                        i_6 = aShortArray8604[i_5] & 0xffff;
                        i_7 = i_6 >> 10 & 0x3f;
                        i_8 = i_6 >> 7 & 0x7;
                        int i_9 = i_6 & 0x7f;
                        i_7 = i_7 + i_2 & 0x3f;
                        i_8 += i_3;
                        if (i_8 < 0) {
                            i_8 = 0;
                        } else if (i_8 > 7) {
                            i_8 = 7;
                        }

                        i_9 += i_4;
                        if (i_9 < 0) {
                            i_9 = 0;
                        } else if (i_9 > 127) {
                            i_9 = 127;
                        }

                        aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
                    }

                    aBool8609 = true;
                    if (aClass193Array8618 != null) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class193_10 = aClass193Array8618[i_5];
                            class176_11 = aClass176Array8582[i_5];
                            class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_10.anInt2393 * -1274099887 * 142270897] & 0xffff) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
                        }
                    }
                } else {
                    Class176 class176_12;
                    if (i_1 == 8) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.anInt2192 = (class176_12.anInt2192 * -943685543 + i_2 * -943685543) * -310982679;
                            class176_12.anInt2189 = (class176_12.anInt2189 * 1414070385 + i_3 * 1414070385) * 1349697681;
                        }
                    } else if (i_1 == 10) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.aFloat2190 = class176_12.aFloat2190 * i_2 / 128.0F;
                            class176_12.aFloat2191 = class176_12.aFloat2191 * i_3 / 128.0F;
                        }
                    } else if (i_1 == 9) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.anInt2194 = (class176_12.anInt2194 * 2076699445 * 156323613 + i_2 & 0x3fff) * 2076699445 * 156323613;
                        }
                    }
                }
            }
        }

    }

    @Override
    public void method11298(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
        if (aShortArray8569 != null) {
            Class185 class185_4 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
            Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
            matrix44var_5.method5209(matrix44var_1);
            if (bool_3) {
                matrix44var_5.method5207();
            }

            Matrix44 matrix44_6 = class185_4.aClass384_2317;
            matrix44_6.fromVarMatrix44(matrix44var_5);
            float[] floats_7 = new float[3];

            for (int i_8 = 0; i_8 < anInt8579; i_8++) {
                if ((i_2 & aShortArray8569[i_8]) != 0) {
                    matrix44_6.method6527(anIntArray8580[i_8], anIntArray8581[i_8], anIntArray8610[i_8], floats_7);
                    anIntArray8580[i_8] = (int) floats_7[0];
                    anIntArray8581[i_8] = (int) floats_7[1];
                    anIntArray8610[i_8] = (int) floats_7[2];
                }
            }
        }

    }

    @Override
    public int ya() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8627;
    }

    @Override
    public void method11290(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
        if (aShortArray8569 != null) {
            Class185 class185_4 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
            Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
            matrix44var_5.method5209(matrix44var_1);
            if (bool_3) {
                matrix44var_5.method5207();
            }

            Matrix44 matrix44_6 = class185_4.aClass384_2317;
            matrix44_6.fromVarMatrix44(matrix44var_5);
            float[] floats_7 = new float[3];

            for (int i_8 = 0; i_8 < anInt8579; i_8++) {
                if ((i_2 & aShortArray8569[i_8]) != 0) {
                    matrix44_6.method6527(anIntArray8580[i_8], anIntArray8581[i_8], anIntArray8610[i_8], floats_7);
                    anIntArray8580[i_8] = (int) floats_7[0];
                    anIntArray8581[i_8] = (int) floats_7[1];
                    anIntArray8610[i_8] = (int) floats_7[2];
                }
            }
        }

    }

    @Override
    public void method11291(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
        if (aShortArray8569 != null) {
            Class185 class185_4 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
            Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
            matrix44var_5.method5209(matrix44var_1);
            if (bool_3) {
                matrix44var_5.method5207();
            }

            Matrix44 matrix44_6 = class185_4.aClass384_2317;
            matrix44_6.fromVarMatrix44(matrix44var_5);
            float[] floats_7 = new float[3];

            for (int i_8 = 0; i_8 < anInt8579; i_8++) {
                if ((i_2 & aShortArray8569[i_8]) != 0) {
                    matrix44_6.method6527(anIntArray8580[i_8], anIntArray8581[i_8], anIntArray8610[i_8], floats_7);
                    anIntArray8580[i_8] = (int) floats_7[0];
                    anIntArray8581[i_8] = (int) floats_7[1];
                    anIntArray8610[i_8] = (int) floats_7[2];
                }
            }
        }

    }

    @Override
    public void method11292(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
        if (aShortArray8569 != null) {
            Class185 class185_4 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
            Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
            matrix44var_5.method5209(matrix44var_1);
            if (bool_3) {
                matrix44var_5.method5207();
            }

            Matrix44 matrix44_6 = class185_4.aClass384_2317;
            matrix44_6.fromVarMatrix44(matrix44var_5);
            float[] floats_7 = new float[3];

            for (int i_8 = 0; i_8 < anInt8579; i_8++) {
                if ((i_2 & aShortArray8569[i_8]) != 0) {
                    matrix44_6.method6527(anIntArray8580[i_8], anIntArray8581[i_8], anIntArray8610[i_8], floats_7);
                    anIntArray8580[i_8] = (int) floats_7[0];
                    anIntArray8581[i_8] = (int) floats_7[1];
                    anIntArray8610[i_8] = (int) floats_7[2];
                }
            }
        }

    }

    @Override
    public void pa(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
        if (i_1 == 3) {
            if ((anInt8575 & 0x7) != 7) {
                throw new IllegalStateException();
            }
        } else if ((anInt8575 & 0x2) != 2) {
            throw new IllegalStateException();
        }

        if (!aBool8621) {
            method13876();
        }

        int i_8 = i_5 + aShort8634;
        int i_9 = i_5 + aShort8627;
        int i_10 = i_7 + aShort8571;
        int i_11 = i_7 + aShort8629;
        if (i_1 == 4 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
            int[][] ints_12 = class390_3.tileHeights;
            int[][] ints_13 = null;
            if (class390_4 != null) {
                ints_13 = class390_4.tileHeights;
            }

            if (i_1 != 4 && i_1 != 5) {
                i_8 >>= class390_3.tileScale;
                i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
                i_10 >>= class390_3.tileScale;
                i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
                if (ints_12[i_8][i_10] == i_6 && ints_12[i_9][i_10] == i_6 && ints_12[i_8][i_11] == i_6 && ints_12[i_9][i_11] == i_6) {
                    return;
                }
            } else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length) {
                return;
            }

            synchronized (this) {
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                int i_21;
                int i_22;
                int i_23;
                int i_24;
                int i_25;
                if (i_1 == 1) {
                    i_15 = class390_3.tileUnits - 1;

                    for (i_16 = 0; i_16 < anInt8579; i_16++) {
                        i_17 = i_5 + anIntArray8580[i_16];
                        i_18 = i_7 + anIntArray8610[i_16];
                        i_19 = i_17 & i_15;
                        i_20 = i_18 & i_15;
                        i_21 = i_17 >> class390_3.tileScale;
                        i_22 = i_18 >> class390_3.tileScale;
                        i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + i_19 * ints_12[i_21 + 1][i_22] >> class390_3.tileScale;
                        i_24 = (class390_3.tileUnits - i_19) * ints_12[i_21][i_22 + 1] + i_19 * ints_12[i_21 + 1][i_22 + 1] >> class390_3.tileScale;
                        i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
                        anIntArray8581[i_16] = i_25 + anIntArray8581[i_16] - i_6;
                    }

                    for (i_16 = anInt8579; i_16 < anInt8578; i_16++) {
                        i_17 = i_5 + anIntArray8580[i_16];
                        i_18 = i_7 + anIntArray8610[i_16];
                        i_19 = i_17 & i_15;
                        i_20 = i_18 & i_15;
                        i_21 = i_17 >> class390_3.tileScale;
                        i_22 = i_18 >> class390_3.tileScale;
                        if (i_21 >= 0 && i_21 < ints_12.length - 1 && i_22 >= 0 && i_22 < ints_12[0].length - 1) {
                            i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + i_19 * ints_12[i_21 + 1][i_22] >> class390_3.tileScale;
                            i_24 = (class390_3.tileUnits - i_19) * ints_12[i_21][i_22 + 1] + i_19 * ints_12[i_21 + 1][i_22 + 1] >> class390_3.tileScale;
                            i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
                            anIntArray8581[i_16] = i_25 + anIntArray8581[i_16] - i_6;
                        }
                    }
                } else {
                    int i_26;
                    if (i_1 == 2) {
                        if (aShort8570 == 0) {
                            return;
                        }

                        i_15 = class390_3.tileUnits - 1;

                        for (i_16 = 0; i_16 < anInt8579; i_16++) {
                            i_17 = (anIntArray8581[i_16] << 16) / aShort8570;
                            if (i_17 < i_2) {
                                i_18 = i_5 + anIntArray8580[i_16];
                                i_19 = i_7 + anIntArray8610[i_16];
                                i_20 = i_18 & i_15;
                                i_21 = i_19 & i_15;
                                i_22 = i_18 >> class390_3.tileScale;
                                i_23 = i_19 >> class390_3.tileScale;
                                i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
                                i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
                                i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                                anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
                            } else {
                                anIntArray8581[i_16] = anIntArray8581[i_16];
                            }
                        }

                        for (i_16 = anInt8579; i_16 < anInt8578; i_16++) {
                            i_17 = (anIntArray8581[i_16] << 16) / aShort8570;
                            if (i_17 < i_2) {
                                i_18 = i_5 + anIntArray8580[i_16];
                                i_19 = i_7 + anIntArray8610[i_16];
                                i_20 = i_18 & i_15;
                                i_21 = i_19 & i_15;
                                i_22 = i_18 >> class390_3.tileScale;
                                i_23 = i_19 >> class390_3.tileScale;
                                if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1) {
                                    i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
                                    i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
                                    i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                                    anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
                                }
                            } else {
                                anIntArray8581[i_16] = anIntArray8581[i_16];
                            }
                        }
                    } else if (i_1 == 3) {
                        i_15 = (i_2 & 0xff) * 4;
                        i_16 = (i_2 >> 8 & 0xff) * 4;
                        i_17 = (i_2 >> 16 & 0xff) << 6;
                        i_18 = (i_2 >> 24 & 0xff) << 6;
                        if (i_5 - (i_15 >> 1) < 0 || i_5 + class390_3.tileUnits + (i_15 >> 1) >= class390_3.width << class390_3.tileScale || i_7 - (i_16 >> 1) < 0 || class390_3.tileUnits + (i_16 >> 1) + i_7 >= class390_3.length << class390_3.tileScale) {
                            return;
                        }

                        method11281(class390_3, i_5, i_6, i_7, i_15, i_16, i_17, i_18);
                    } else if (i_1 == 4) {
                        i_15 = class390_4.tileUnits - 1;
                        i_16 = aShort8625 - aShort8570;

                        for (i_17 = 0; i_17 < anInt8579; i_17++) {
                            i_18 = i_5 + anIntArray8580[i_17];
                            i_19 = i_7 + anIntArray8610[i_17];
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_4.tileScale;
                            i_23 = i_19 >> class390_4.tileScale;
                            i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
                            i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
                            i_26 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
                            anIntArray8581[i_17] += i_16 + (i_26 - i_6);
                        }

                        for (i_17 = anInt8579; i_17 < anInt8578; i_17++) {
                            i_18 = i_5 + anIntArray8580[i_17];
                            i_19 = i_7 + anIntArray8610[i_17];
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_4.tileScale;
                            i_23 = i_19 >> class390_4.tileScale;
                            if (i_22 >= 0 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_4.length - 1) {
                                i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
                                i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
                                i_26 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
                                anIntArray8581[i_17] += i_16 + (i_26 - i_6);
                            }
                        }
                    } else if (i_1 == 5) {
                        i_15 = class390_4.tileUnits - 1;
                        i_16 = aShort8625 - aShort8570;

                        int i_27;
                        int i_28;
                        for (i_17 = 0; i_17 < anInt8579; i_17++) {
                            i_18 = i_5 + anIntArray8580[i_17];
                            i_19 = i_7 + anIntArray8610[i_17];
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_3.tileScale;
                            i_23 = i_19 >> class390_3.tileScale;
                            i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
                            i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
                            i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                            i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
                            i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
                            i_27 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
                            i_28 = i_26 - i_27 - i_2;
                            anIntArray8581[i_17] = (i_28 * ((anIntArray8581[i_17] << 8) / i_16) >> 8) - (i_6 - i_26);
                        }

                        for (i_17 = anInt8579; i_17 < anInt8578; i_17++) {
                            i_18 = i_5 + anIntArray8580[i_17];
                            i_19 = i_7 + anIntArray8610[i_17];
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_3.tileScale;
                            i_23 = i_19 >> class390_3.tileScale;
                            if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1 && i_23 < class390_4.length - 1) {
                                i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + i_20 * ints_12[i_22 + 1][i_23] >> class390_3.tileScale;
                                i_25 = (class390_3.tileUnits - i_20) * ints_12[i_22][i_23 + 1] + i_20 * ints_12[i_22 + 1][i_23 + 1] >> class390_3.tileScale;
                                i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                                i_24 = i_20 * ints_13[i_22 + 1][i_23] + ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) >> class390_4.tileScale;
                                i_25 = (class390_4.tileUnits - i_20) * ints_13[i_22][i_23 + 1] + i_20 * ints_13[i_22 + 1][i_23 + 1] >> class390_4.tileScale;
                                i_27 = (class390_4.tileUnits - i_21) * i_24 + i_25 * i_21 >> class390_4.tileScale;
                                i_28 = i_26 - i_27 - i_2;
                                anIntArray8581[i_17] = (i_28 * ((anIntArray8581[i_17] << 8) / i_16) >> 8) - (i_6 - i_26);
                            }
                        }
                    }
                }

                aBool8621 = false;
            }
        }

    }

    void method13868(boolean bool_1, boolean bool_2, boolean bool_3, int i_4, boolean bool_5, boolean bool_6) {
        if (anIntArray8594[i_4] != -2) {
            short s_7 = aShortArray8587[i_4];
            short s_8 = aShortArray8588[i_4];
            short s_9 = aShortArray8642[i_4];
            float f_10 = aFloatArray8590[s_7];
            float f_11 = aFloatArray8590[s_8];
            float f_12 = aFloatArray8590[s_9];
            if (!bool_5 || f_10 != -5000.0f && f_11 != -5000.0f && f_12 != -5000.0f) {
                float f_13 = aFloatArray8605[s_7];
                float f_14 = aFloatArray8605[s_8];
                float f_15 = aFloatArray8605[s_9];
                if (anIntArray8643[i_4] != -1 || (f_10 - f_11) * (f_15 - f_14) - (f_13 - f_14) * (f_12 - f_11) > 0.0F) {
                    aClass144_8566.aBool1708 = !(f_10 >= 0.0F) || !(f_11 >= 0.0F) || !(f_12 >= 0.0F) || !(f_10 <= aClass185_8564.anInt2337) || !(f_11 <= aClass185_8564.anInt2337) || !(f_12 <= aClass185_8564.anInt2337);

                    int i_16;
                    if (bool_6) {
                        i_16 = anIntArray8643[i_4];
                        if (i_16 == -1 || !aClass193Array8618[i_16].aBool2399) {
                            method13818(bool_1, bool_2, bool_3, i_4);
                        }
                    } else {
                        i_16 = anIntArray8643[i_4];
                        if (i_16 != -1) {
                            Class193 class193_17 = aClass193Array8618[i_16];
                            Class176 class176_18 = aClass176Array8582[i_16];
                            if (!class193_17.aBool2399) {
                                method13848(bool_1, bool_2, bool_3, i_4);
                            }

                            aGraphicalRenderer_Sub3_8638.method14372(bool_1, bool_2, bool_3, class176_18.anInt2195, class176_18.anInt2196, class176_18.aFloat2193, class176_18.anInt2197, class176_18.anInt2198, class193_17.aShort2396 & 0xffff, class176_18.anInt2199, class193_17.aByte2398, class193_17.aByte2397);
                        } else {
                            method13848(bool_1, bool_2, bool_3, i_4);
                        }
                    }
                }
            }
        }

    }

    @Override
    public int cp() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8634;
    }

    @Override
    public void method11315(Matrix44Var matrix44var_1) {
        method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
        Matrix44 matrix44_2 = aClass185_8564.aClass384_2317;
        matrix44_2.fromVarMatrix44(matrix44var_1);
        int i_3;
        if (aClass87Array8615 != null) {
            for (i_3 = 0; i_3 < aClass87Array8615.length; i_3++) {
                ParticleEmitterConfig class87_4 = aClass87Array8615[i_3];
                ParticleEmitterConfig class87_5 = class87_4;
                if (class87_4.aClass87_835 != null) {
                    class87_5 = class87_4.aClass87_835;
                }

                class87_5.anInt844 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceX * 1502404273 * -1572033967]) * -1929058355 * -75866875;
                class87_5.anInt841 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceX * 1502404273 * -1572033967]) * 996785411 * 1618253227;
                class87_5.anInt847 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceX * 1502404273 * -1572033967]) * 976806429 * -489230283;
                class87_5.anInt834 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceY * -2021469179 * -1955014451]) * -458323579 * 1747322701;
                class87_5.anInt843 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceY * -2021469179 * -1955014451]) * 543149547 * -174394685;
                class87_5.anInt845 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceY * -2021469179 * -1955014451]) * 1054448197 * 305293453;
                class87_5.anInt846 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[4] * anIntArray8581[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[8] * anIntArray8610[class87_4.faceZ * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
                class87_5.anInt840 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[5] * anIntArray8581[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[9] * anIntArray8610[class87_4.faceZ * -1292195173 * -2135413869]) * -1652520905 * 950906247;
                class87_5.anInt848 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[6] * anIntArray8581[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[10] * anIntArray8610[class87_4.faceZ * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
            }
        }

        if (aClass172Array8616 != null) {
            for (i_3 = 0; i_3 < aClass172Array8616.length; i_3++) {
                SurfaceSkin class172_6 = aClass172Array8616[i_3];
                SurfaceSkin class172_7 = class172_6;
                if (class172_6.aClass172_2114 != null) {
                    class172_7 = class172_6.aClass172_2114;
                }

                if (class172_6.aClass384_2116 != null) {
                    class172_6.aClass384_2116.method6562(matrix44_2);
                } else {
                    class172_6.aClass384_2116 = new Matrix44(matrix44_2);
                }

                class172_7.anInt2113 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[4] * anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[8] * anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
                class172_7.anInt2117 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[5] * anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[9] * anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
                class172_7.anInt2118 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * anIntArray8580[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[6] * anIntArray8581[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[10] * anIntArray8610[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
            }
        }

    }

    @Override
    public void method11263(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
        if (aShortArray8569 != null) {
            Class185 class185_4 = aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread());
            Matrix44Var matrix44var_5 = class185_4.aClass294_2316;
            matrix44var_5.method5209(matrix44var_1);
            if (bool_3) {
                matrix44var_5.method5207();
            }

            Matrix44 matrix44_6 = class185_4.aClass384_2317;
            matrix44_6.fromVarMatrix44(matrix44var_5);
            float[] floats_7 = new float[3];

            for (int i_8 = 0; i_8 < anInt8579; i_8++) {
                if ((i_2 & aShortArray8569[i_8]) != 0) {
                    matrix44_6.method6527(anIntArray8580[i_8], anIntArray8581[i_8], anIntArray8610[i_8], floats_7);
                    anIntArray8580[i_8] = (int) floats_7[0];
                    anIntArray8581[i_8] = (int) floats_7[1];
                    anIntArray8610[i_8] = (int) floats_7[2];
                }
            }
        }

    }

    @Override
    public void bi(int i_1) {
        if ((anInt8575 & 0x5) != 5) {
            throw new IllegalStateException();
        } else {
            if (i_1 == 4096) {
                method13805();
            } else if (i_1 == 8192) {
                method13806();
            } else if (i_1 == 12288) {
                method13807();
            } else {
                int i_2 = Trig.SINE[i_1];
                int i_3 = Trig.COSINE[i_1];
                synchronized (this) {
                    for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                        int i_6 = anIntArray8610[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                        anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                        anIntArray8580[i_5] = i_6;
                    }

                    method13812();
                }
            }

        }
    }

    @Override
    public void W(short s_1, short s_2) {
        if (aShortArray8603 != null) {
            if (!aBool8640 && s_2 >= 0) {
                TextureDetails class169_3 = aGraphicalRenderer_Sub3_8638.textureCache.getTextureDetails(s_2 & 0xffff);
                if (class169_3.textureSpeedU != 0 || class169_3.textureSpeedV != 0) {
                    aBool8640 = true;
                }
            }

            for (int i_4 = 0; i_4 < anInt8586; i_4++) {
                if (aShortArray8603[i_4] == s_1) {
                    aShortArray8603[i_4] = s_2;
                }
            }
        }

    }

    @Override
    public int dd() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8625;
    }

    @Override
    void bo(int i_1, int i_2, int i_3, int i_4) {
        int i_5;
        int i_6;
        if (i_1 == 0) {
            i_5 = 0;
            anInt8611 = 0;
            anInt8607 = 0;
            anInt8613 = 0;

            for (i_6 = 0; i_6 < anInt8578; i_6++) {
                anInt8611 += anIntArray8580[i_6];
                anInt8607 += anIntArray8581[i_6];
                anInt8613 += anIntArray8610[i_6];
                ++i_5;
            }

            if (i_5 > 0) {
                anInt8611 = anInt8611 / i_5 + i_2;
                anInt8607 = anInt8607 / i_5 + i_3;
                anInt8613 = anInt8613 / i_5 + i_4;
            } else {
                anInt8611 = i_2;
                anInt8607 = i_3;
                anInt8613 = i_4;
            }
        } else if (i_1 == 1) {
            for (i_5 = 0; i_5 < anInt8578; i_5++) {
                anIntArray8580[i_5] += i_2;
                anIntArray8581[i_5] += i_3;
                anIntArray8610[i_5] += i_4;
            }
        } else {
            int i_7;
            int i_8;
            if (i_1 == 2) {
                for (i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] -= anInt8611;
                    anIntArray8581[i_5] -= anInt8607;
                    anIntArray8610[i_5] -= anInt8613;
                    if (i_4 != 0) {
                        i_6 = Trig.SINE[i_4];
                        i_7 = Trig.COSINE[i_4];
                        i_8 = anIntArray8581[i_5] * i_6 + anIntArray8580[i_5] * i_7 + 16383 >> 14;
                        anIntArray8581[i_5] = anIntArray8581[i_5] * i_7 - anIntArray8580[i_5] * i_6 + 16383 >> 14;
                        anIntArray8580[i_5] = i_8;
                    }

                    if (i_2 != 0) {
                        i_6 = Trig.SINE[i_2];
                        i_7 = Trig.COSINE[i_2];
                        i_8 = anIntArray8581[i_5] * i_7 - anIntArray8610[i_5] * i_6 + 16383 >> 14;
                        anIntArray8610[i_5] = anIntArray8581[i_5] * i_6 + anIntArray8610[i_5] * i_7 + 16383 >> 14;
                        anIntArray8581[i_5] = i_8;
                    }

                    if (i_3 != 0) {
                        i_6 = Trig.SINE[i_3];
                        i_7 = Trig.COSINE[i_3];
                        i_8 = anIntArray8610[i_5] * i_6 + anIntArray8580[i_5] * i_7 + 16383 >> 14;
                        anIntArray8610[i_5] = anIntArray8610[i_5] * i_7 - anIntArray8580[i_5] * i_6 + 16383 >> 14;
                        anIntArray8580[i_5] = i_8;
                    }

                    anIntArray8580[i_5] += anInt8611;
                    anIntArray8581[i_5] += anInt8607;
                    anIntArray8610[i_5] += anInt8613;
                }
            } else if (i_1 == 3) {
                for (i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] -= anInt8611;
                    anIntArray8581[i_5] -= anInt8607;
                    anIntArray8610[i_5] -= anInt8613;
                    anIntArray8580[i_5] = anIntArray8580[i_5] * i_2 / 128;
                    anIntArray8581[i_5] = anIntArray8581[i_5] * i_3 / 128;
                    anIntArray8610[i_5] = anIntArray8610[i_5] * i_4 / 128;
                    anIntArray8580[i_5] += anInt8611;
                    anIntArray8581[i_5] += anInt8607;
                    anIntArray8610[i_5] += anInt8613;
                }
            } else {
                Class193 class193_10;
                Class176 class176_11;
                if (i_1 == 5) {
                    for (i_5 = 0; i_5 < anInt8586; i_5++) {
                        i_6 = (aByteArray8602[i_5] & 0xff) + i_2 * 8;
                        if (i_6 < 0) {
                            i_6 = 0;
                        } else if (i_6 > 255) {
                            i_6 = 255;
                        }

                        aByteArray8602[i_5] = (byte) i_6;
                    }

                    if (aClass193Array8618 != null) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class193_10 = aClass193Array8618[i_5];
                            class176_11 = aClass176Array8582[i_5];
                            class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & 0xffffff | 255 - (aByteArray8602[class193_10.anInt2393 * -1274099887 * 142270897] & 0xff) << 24) * -1022818925 * -1303125861;
                        }
                    }
                } else if (i_1 == 7) {
                    for (i_5 = 0; i_5 < anInt8586; i_5++) {
                        i_6 = aShortArray8604[i_5] & 0xffff;
                        i_7 = i_6 >> 10 & 0x3f;
                        i_8 = i_6 >> 7 & 0x7;
                        int i_9 = i_6 & 0x7f;
                        i_7 = i_7 + i_2 & 0x3f;
                        i_8 += i_3;
                        if (i_8 < 0) {
                            i_8 = 0;
                        } else if (i_8 > 7) {
                            i_8 = 7;
                        }

                        i_9 += i_4;
                        if (i_9 < 0) {
                            i_9 = 0;
                        } else if (i_9 > 127) {
                            i_9 = 127;
                        }

                        aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
                    }

                    aBool8609 = true;
                    if (aClass193Array8618 != null) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class193_10 = aClass193Array8618[i_5];
                            class176_11 = aClass176Array8582[i_5];
                            class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_10.anInt2393 * -1274099887 * 142270897] & 0xffff) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
                        }
                    }
                } else {
                    Class176 class176_12;
                    if (i_1 == 8) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.anInt2192 = (class176_12.anInt2192 * -943685543 + i_2 * -943685543) * -310982679;
                            class176_12.anInt2189 = (class176_12.anInt2189 * 1414070385 + i_3 * 1414070385) * 1349697681;
                        }
                    } else if (i_1 == 10) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.aFloat2190 = class176_12.aFloat2190 * i_2 / 128.0F;
                            class176_12.aFloat2191 = class176_12.aFloat2191 * i_3 / 128.0F;
                        }
                    } else if (i_1 == 9) {
                        for (i_5 = 0; i_5 < anInt8617; i_5++) {
                            class176_12 = aClass176Array8582[i_5];
                            class176_12.anInt2194 = (class176_12.anInt2194 * 2076699445 * 156323613 + i_2 & 0x3fff) * 2076699445 * 156323613;
                        }
                    }
                }
            }
        }

    }

    @Override
    public int ct() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8627;
    }

    @Override
    public int cu() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8627;
    }

    @Override
    public int ha() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8629;
    }

    @Override
    public int cw() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8570;
    }

    @Override
    public int c() {
        return anInt8606;
    }

    @Override
    public int ck() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8571;
    }

    @Override
    public int co() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8629;
    }

    void method13876() {
        if (!aBool8621) {
            int i_1 = 0;
            int i_2 = 0;
            int i_3 = 32767;
            int i_4 = 32767;
            int i_5 = 32767;
            int i_6 = -32768;
            int i_7 = -32768;
            int i_8 = -32768;

            for (int i_9 = 0; i_9 < anInt8579; i_9++) {
                int i_10 = anIntArray8580[i_9];
                int i_11 = anIntArray8581[i_9];
                int i_12 = anIntArray8610[i_9];
                if (i_10 < i_3) {
                    i_3 = i_10;
                }

                if (i_10 > i_6) {
                    i_6 = i_10;
                }

                if (i_11 < i_4) {
                    i_4 = i_11;
                }

                if (i_11 > i_7) {
                    i_7 = i_11;
                }

                if (i_12 < i_5) {
                    i_5 = i_12;
                }

                if (i_12 > i_8) {
                    i_8 = i_12;
                }

                int i_13 = i_10 * i_10 + i_12 * i_12;
                if (i_13 > i_1) {
                    i_1 = i_13;
                }

                i_13 += i_11 * i_11;
                if (i_13 > i_2) {
                    i_2 = i_13;
                }
            }

            aShort8634 = (short) i_3;
            aShort8627 = (short) i_6;
            aShort8570 = (short) i_4;
            aShort8625 = (short) i_7;
            aShort8571 = (short) i_5;
            aShort8629 = (short) i_8;
            aShort8595 = (short) ((int) (Math.sqrt(i_1) + 0.99D));
            aShort8574 = (short) ((int) (Math.sqrt(i_2) + 0.99D));
            aBool8621 = true;
        }

    }

    @Override
    public void ce(int i_1) {
        if ((anInt8575 & 0x1000) != 4096) {
            throw new IllegalStateException();
        } else {
            anInt8606 = i_1;
            anInt8598 = 0;
        }
    }

    void method13877() {
        if (anInt8598 == 0 && aClass189Array8584 == null) {
            if (aGraphicalRenderer_Sub3_8638.anInt9008 > 1) {
                synchronized (this) {
                    method13797();
                }
            } else {
                method13797();
            }
        }

    }

    @Override
    public int ch() {
        return anInt8577;
    }

    @Override
    public byte[] cz() {
        return aByteArray8602;
    }

    @Override
    public void dl(int i_1) {
        if ((anInt8575 & 0x3) != 3) {
            throw new IllegalStateException();
        } else {
            int i_2 = Trig.SINE[i_1];
            int i_3 = Trig.COSINE[i_1];
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    int i_6 = anIntArray8581[i_5] * i_2 + anIntArray8580[i_5] * i_3 >> 14;
                    anIntArray8581[i_5] = anIntArray8581[i_5] * i_3 - anIntArray8580[i_5] * i_2 >> 14;
                    anIntArray8580[i_5] = i_6;
                }

                method13812();
            }
        }
    }

    @Override
    public void method11307(byte b_1, byte[] bytes_2) {
        if ((anInt8575 & 0x100000) == 0) {
            throw new RuntimeException();
        } else {
            if (aByteArray8602 == null) {
                aByteArray8602 = new byte[anInt8586];
            }

            int i_3;
            if (bytes_2 == null) {
                for (i_3 = 0; i_3 < anInt8586; i_3++) {
                    aByteArray8602[i_3] = b_1;
                }
            } else {
                for (i_3 = 0; i_3 < anInt8586; i_3++) {
                    int i_4 = 255 - (255 - (bytes_2[i_3] & 0xff)) * (255 - (b_1 & 0xff)) / 255;
                    aByteArray8602[i_3] = (byte) i_4;
                }
            }

            if (anInt8598 == 2) {
                anInt8598 = 1;
            }

        }
    }

    @Override
    public ParticleEmitterConfig[] method11300() {
        return aClass87Array8615;
    }

    @Override
    public SurfaceSkin[] method11331() {
        return aClass172Array8616;
    }

    @Override
    public SurfaceSkin[] method11283() {
        return aClass172Array8616;
    }

    @Override
    public SurfaceSkin[] method11302() {
        return aClass172Array8616;
    }

    @Override
    public void cy(int i_1, int i_2, int i_3, int i_4) {
        if ((anInt8575 & 0x80000) != 524288) {
            throw new IllegalStateException();
        } else {
            int i_5;
            for (i_5 = 0; i_5 < anInt8586; i_5++) {
                int i_6 = aShortArray8604[i_5] & 0xffff;
                int i_7 = i_6 >> 10 & 0x3f;
                int i_8 = i_6 >> 7 & 0x7;
                int i_9 = i_6 & 0x7f;
                if (i_1 != -1) {
                    i_7 += (i_1 - i_7) * i_4 >> 7;
                }

                if (i_2 != -1) {
                    i_8 += (i_2 - i_8) * i_4 >> 7;
                }

                if (i_3 != -1) {
                    i_9 += (i_3 - i_9) * i_4 >> 7;
                }

                aShortArray8604[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
            }

            if (aClass193Array8618 != null) {
                for (i_5 = 0; i_5 < anInt8617; i_5++) {
                    Class193 class193_10 = aClass193Array8618[i_5];
                    Class176 class176_11 = aClass176Array8582[i_5];
                    class176_11.anInt2199 = (class176_11.anInt2199 * -1022818925 * -1303125861 & -16777216 | Class335.anIntArray3916[Class372.method6362(aShortArray8604[class193_10.anInt2393 * -1274099887 * 142270897] & 0xffff) & 0xffff] & 0xffffff) * -1022818925 * -1303125861;
                }
            }

            if (anInt8598 == 2) {
                anInt8598 = 1;
            }

        }
    }

    @Override
    public boolean dh() {
        return aBool8640;
    }

    @Override
    public int cb() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8570;
    }

    @Override
    public void bc(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
        if (i_1 == 3) {
            if ((anInt8575 & 0x7) != 7) {
                throw new IllegalStateException();
            }
        } else if ((anInt8575 & 0x2) != 2) {
            throw new IllegalStateException();
        }

        if (!aBool8621) {
            method13876();
        }

        int i_8 = i_5 + aShort8634;
        int i_9 = i_5 + aShort8627;
        int i_10 = i_7 + aShort8571;
        int i_11 = i_7 + aShort8629;
        if (i_1 == 4 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
            int[][] ints_12 = class390_3.tileHeights;
            int[][] ints_13 = null;
            if (class390_4 != null) {
                ints_13 = class390_4.tileHeights;
            }

            if (i_1 != 4 && i_1 != 5) {
                i_8 >>= class390_3.tileScale;
                i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
                i_10 >>= class390_3.tileScale;
                i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
                if (ints_12[i_8][i_10] == i_6 && ints_12[i_9][i_10] == i_6 && ints_12[i_8][i_11] == i_6 && ints_12[i_9][i_11] == i_6) {
                    return;
                }
            } else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length) {
                return;
            }

            synchronized (this) {
                int i_15;
                int i_16;
                int i_17;
                int i_18;
                int i_19;
                int i_20;
                int i_21;
                int i_22;
                int i_23;
                int i_24;
                int i_25;
                if (i_1 == 1) {
                    i_15 = class390_3.tileUnits - 1;

                    for (i_16 = 0; i_16 < anInt8579; i_16++) {
                        i_17 = anIntArray8580[i_16] + i_5;
                        i_18 = anIntArray8610[i_16] + i_7;
                        i_19 = i_17 & i_15;
                        i_20 = i_18 & i_15;
                        i_21 = i_17 >> class390_3.tileScale;
                        i_22 = i_18 >> class390_3.tileScale;
                        i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22] * i_19 >> class390_3.tileScale;
                        i_24 = ints_12[i_21][i_22 + 1] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22 + 1] * i_19 >> class390_3.tileScale;
                        i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
                        anIntArray8581[i_16] = anIntArray8581[i_16] + i_25 - i_6;
                    }

                    for (i_16 = anInt8579; i_16 < anInt8578; i_16++) {
                        i_17 = anIntArray8580[i_16] + i_5;
                        i_18 = anIntArray8610[i_16] + i_7;
                        i_19 = i_17 & i_15;
                        i_20 = i_18 & i_15;
                        i_21 = i_17 >> class390_3.tileScale;
                        i_22 = i_18 >> class390_3.tileScale;
                        if (i_21 >= 0 && i_21 < ints_12.length - 1 && i_22 >= 0 && i_22 < ints_12[0].length - 1) {
                            i_23 = ints_12[i_21][i_22] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22] * i_19 >> class390_3.tileScale;
                            i_24 = ints_12[i_21][i_22 + 1] * (class390_3.tileUnits - i_19) + ints_12[i_21 + 1][i_22 + 1] * i_19 >> class390_3.tileScale;
                            i_25 = i_23 * (class390_3.tileUnits - i_20) + i_24 * i_20 >> class390_3.tileScale;
                            anIntArray8581[i_16] = anIntArray8581[i_16] + i_25 - i_6;
                        }
                    }
                } else {
                    int i_26;
                    if (i_1 == 2) {
                        if (aShort8570 == 0) {
                            return;
                        }

                        i_15 = class390_3.tileUnits - 1;

                        for (i_16 = 0; i_16 < anInt8579; i_16++) {
                            i_17 = (anIntArray8581[i_16] << 16) / aShort8570;
                            if (i_17 < i_2) {
                                i_18 = anIntArray8580[i_16] + i_5;
                                i_19 = anIntArray8610[i_16] + i_7;
                                i_20 = i_18 & i_15;
                                i_21 = i_19 & i_15;
                                i_22 = i_18 >> class390_3.tileScale;
                                i_23 = i_19 >> class390_3.tileScale;
                                i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
                                i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
                                i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                                anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
                            } else {
                                anIntArray8581[i_16] = anIntArray8581[i_16];
                            }
                        }

                        for (i_16 = anInt8579; i_16 < anInt8578; i_16++) {
                            i_17 = (anIntArray8581[i_16] << 16) / aShort8570;
                            if (i_17 < i_2) {
                                i_18 = anIntArray8580[i_16] + i_5;
                                i_19 = anIntArray8610[i_16] + i_7;
                                i_20 = i_18 & i_15;
                                i_21 = i_19 & i_15;
                                i_22 = i_18 >> class390_3.tileScale;
                                i_23 = i_19 >> class390_3.tileScale;
                                if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1) {
                                    i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
                                    i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
                                    i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                                    anIntArray8581[i_16] += (i_26 - i_6) * (i_2 - i_17) / i_2;
                                }
                            } else {
                                anIntArray8581[i_16] = anIntArray8581[i_16];
                            }
                        }
                    } else if (i_1 == 3) {
                        i_15 = (i_2 & 0xff) * 4;
                        i_16 = (i_2 >> 8 & 0xff) * 4;
                        i_17 = (i_2 >> 16 & 0xff) << 6;
                        i_18 = (i_2 >> 24 & 0xff) << 6;
                        if (i_5 - (i_15 >> 1) < 0 || i_5 + (i_15 >> 1) + class390_3.tileUnits >= class390_3.width << class390_3.tileScale || i_7 - (i_16 >> 1) < 0 || i_7 + (i_16 >> 1) + class390_3.tileUnits >= class390_3.length << class390_3.tileScale) {
                            return;
                        }

                        method11281(class390_3, i_5, i_6, i_7, i_15, i_16, i_17, i_18);
                    } else if (i_1 == 4) {
                        i_15 = class390_4.tileUnits - 1;
                        i_16 = aShort8625 - aShort8570;

                        for (i_17 = 0; i_17 < anInt8579; i_17++) {
                            i_18 = anIntArray8580[i_17] + i_5;
                            i_19 = anIntArray8610[i_17] + i_7;
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_4.tileScale;
                            i_23 = i_19 >> class390_4.tileScale;
                            i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
                            i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
                            i_26 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
                            anIntArray8581[i_17] += (i_26 - i_6) + i_16;
                        }

                        for (i_17 = anInt8579; i_17 < anInt8578; i_17++) {
                            i_18 = anIntArray8580[i_17] + i_5;
                            i_19 = anIntArray8610[i_17] + i_7;
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_4.tileScale;
                            i_23 = i_19 >> class390_4.tileScale;
                            if (i_22 >= 0 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_4.length - 1) {
                                i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
                                i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
                                i_26 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
                                anIntArray8581[i_17] += (i_26 - i_6) + i_16;
                            }
                        }
                    } else if (i_1 == 5) {
                        i_15 = class390_4.tileUnits - 1;
                        i_16 = aShort8625 - aShort8570;

                        int i_27;
                        int i_28;
                        for (i_17 = 0; i_17 < anInt8579; i_17++) {
                            i_18 = anIntArray8580[i_17] + i_5;
                            i_19 = anIntArray8610[i_17] + i_7;
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_3.tileScale;
                            i_23 = i_19 >> class390_3.tileScale;
                            i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
                            i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
                            i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                            i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
                            i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
                            i_27 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
                            i_28 = i_26 - i_27 - i_2;
                            anIntArray8581[i_17] = ((anIntArray8581[i_17] << 8) / i_16 * i_28 >> 8) - (i_6 - i_26);
                        }

                        for (i_17 = anInt8579; i_17 < anInt8578; i_17++) {
                            i_18 = anIntArray8580[i_17] + i_5;
                            i_19 = anIntArray8610[i_17] + i_7;
                            i_20 = i_18 & i_15;
                            i_21 = i_19 & i_15;
                            i_22 = i_18 >> class390_3.tileScale;
                            i_23 = i_19 >> class390_3.tileScale;
                            if (i_22 >= 0 && i_22 < class390_3.width - 1 && i_22 < class390_4.width - 1 && i_23 >= 0 && i_23 < class390_3.length - 1 && i_23 < class390_4.length - 1) {
                                i_24 = ints_12[i_22][i_23] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23] * i_20 >> class390_3.tileScale;
                                i_25 = ints_12[i_22][i_23 + 1] * (class390_3.tileUnits - i_20) + ints_12[i_22 + 1][i_23 + 1] * i_20 >> class390_3.tileScale;
                                i_26 = i_24 * (class390_3.tileUnits - i_21) + i_25 * i_21 >> class390_3.tileScale;
                                i_24 = ints_13[i_22][i_23] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23] * i_20 >> class390_4.tileScale;
                                i_25 = ints_13[i_22][i_23 + 1] * (class390_4.tileUnits - i_20) + ints_13[i_22 + 1][i_23 + 1] * i_20 >> class390_4.tileScale;
                                i_27 = i_24 * (class390_4.tileUnits - i_21) + i_25 * i_21 >> class390_4.tileScale;
                                i_28 = i_26 - i_27 - i_2;
                                anIntArray8581[i_17] = ((anIntArray8581[i_17] << 8) / i_16 * i_28 >> 8) - (i_6 - i_26);
                            }
                        }
                    }
                }

                aBool8621 = false;
            }
        }

    }

    @Override
    public int dy() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8595;
    }

    @Override
    public int dm() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8595;
    }

    @Override
    public int dp() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8574;
    }

    @Override
    public int du() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8574;
    }

    @Override
    public boolean successful() {
        if (aShortArray8603 != null) {
            for (int i_1 = 0; i_1 < aShortArray8603.length; i_1++) {
                if (aShortArray8603[i_1] != -1 && !aGraphicalRenderer_Sub3_8638.method14360(aShortArray8603[i_1])) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public void di(short s_1, short s_2) {
        if (aShortArray8603 != null) {
            if (!aBool8640 && s_2 >= 0) {
                TextureDetails class169_3 = aGraphicalRenderer_Sub3_8638.textureCache.getTextureDetails(s_2 & 0xffff);
                if (class169_3.textureSpeedU != 0 || class169_3.textureSpeedV != 0) {
                    aBool8640 = true;
                }
            }

            for (int i_4 = 0; i_4 < anInt8586; i_4++) {
                if (aShortArray8603[i_4] == s_1) {
                    aShortArray8603[i_4] = s_2;
                }
            }
        }

    }

    @Override
    public void df(short s_1, short s_2) {
        if (aShortArray8603 != null) {
            if (!aBool8640 && s_2 >= 0) {
                TextureDetails class169_3 = aGraphicalRenderer_Sub3_8638.textureCache.getTextureDetails(s_2 & 0xffff);
                if (class169_3.textureSpeedU != 0 || class169_3.textureSpeedV != 0) {
                    aBool8640 = true;
                }
            }

            for (int i_4 = 0; i_4 < anInt8586; i_4++) {
                if (aShortArray8603[i_4] == s_1) {
                    aShortArray8603[i_4] = s_2;
                }
            }
        }

    }

    @Override
    public boolean dv() {
        return aBool8630;
    }

    @Override
    void method11308() {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
            synchronized (this) {
                while (aBool7023) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }

                aBool7023 = true;
            }
        }

    }

    @Override
    void method11301() {
        if (aGraphicalRenderer_Sub3_8638.anInt9008 * 1696391419 * 656550451 > 1) {
            synchronized (this) {
                while (aBool7023) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }

                aBool7023 = true;
            }
        }

    }

    @Override
    public boolean method11286(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
        method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
        Matrix44 matrix44_6 = aClass185_8564.aClass384_2317;
        matrix44_6.fromVarMatrix44(matrix44var_3);
        Matrix44 matrix44_7 = aClass185_8564.aClass384_2318;
        matrix44_7.method6562(matrix44_6);
        matrix44_7.method6523(aGraphicalRenderer_Sub3_8638.aClass384_8996);
        boolean bool_8 = false;
        int i_9 = Integer.MAX_VALUE;
        int i_10 = Integer.MIN_VALUE;
        int i_11 = Integer.MAX_VALUE;
        int i_12 = Integer.MIN_VALUE;
        if (!aBool8621) {
            method13876();
        }

        int i_13 = aShort8627 - aShort8634 >> 1;
        int i_14 = aShort8625 - aShort8570 >> 1;
        int i_15 = aShort8629 - aShort8571 >> 1;
        int i_16 = aShort8634 + i_13;
        int i_17 = aShort8570 + i_14;
        int i_18 = aShort8571 + i_15;
        int i_19 = i_16 - (i_13 << i_5);
        int i_20 = i_17 - (i_14 << i_5);
        int i_21 = i_18 - (i_15 << i_5);
        int i_22 = i_16 + (i_13 << i_5);
        int i_23 = i_17 + (i_14 << i_5);
        int i_24 = i_18 + (i_15 << i_5);
        anIntArray8583[0] = i_19;
        anIntArray8639[0] = i_20;
        anIntArray8628[0] = i_21;
        anIntArray8583[1] = i_22;
        anIntArray8639[1] = i_20;
        anIntArray8628[1] = i_21;
        anIntArray8583[2] = i_19;
        anIntArray8639[2] = i_23;
        anIntArray8628[2] = i_21;
        anIntArray8583[3] = i_22;
        anIntArray8639[3] = i_23;
        anIntArray8628[3] = i_21;
        anIntArray8583[4] = i_19;
        anIntArray8639[4] = i_20;
        anIntArray8628[4] = i_24;
        anIntArray8583[5] = i_22;
        anIntArray8639[5] = i_20;
        anIntArray8628[5] = i_24;
        anIntArray8583[6] = i_19;
        anIntArray8639[6] = i_23;
        anIntArray8628[6] = i_24;
        anIntArray8583[7] = i_22;
        anIntArray8639[7] = i_23;
        anIntArray8628[7] = i_24;

        int i_25;
        int i_26;
        int i_27;
        int i_28;
        float f_29;
        float f_30;
        float f_31;
        float f_32;
        for (i_25 = 0; i_25 < 8; i_25++) {
            i_26 = anIntArray8583[i_25];
            i_27 = anIntArray8639[i_25];
            i_28 = anIntArray8628[i_25];
            f_29 = matrix44_7.buf[2] * i_26 + matrix44_7.buf[6] * i_27 + matrix44_7.buf[10] * i_28 + matrix44_7.buf[14];
            f_30 = matrix44_7.buf[3] * i_26 + matrix44_7.buf[7] * i_27 + matrix44_7.buf[11] * i_28 + matrix44_7.buf[15];
            if (f_29 >= -f_30) {
                f_31 = matrix44_7.buf[0] * i_26 + matrix44_7.buf[4] * i_27 + matrix44_7.buf[8] * i_28 + matrix44_7.buf[12];
                f_32 = matrix44_7.buf[1] * i_26 + matrix44_7.buf[5] * i_27 + matrix44_7.buf[9] * i_28 + matrix44_7.buf[13];
                int i_33 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_30);
                int i_34 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_32 / f_30);
                if (i_33 < i_9) {
                    i_9 = i_33;
                }

                if (i_33 > i_10) {
                    i_10 = i_33;
                }

                if (i_34 < i_11) {
                    i_11 = i_34;
                }

                if (i_34 > i_12) {
                    i_12 = i_34;
                }

                bool_8 = true;
            }
        }

        if (bool_8 && i_1 > i_9 && i_1 < i_10 && i_2 > i_11 && i_2 < i_12) {
            if (bool_4) {
                return true;
            }

            for (i_25 = 0; i_25 < anInt8578; i_25++) {
                i_26 = anIntArray8580[i_25];
                i_27 = anIntArray8581[i_25];
                i_28 = anIntArray8610[i_25];
                f_29 = matrix44_7.buf[2] * i_26 + matrix44_7.buf[6] * i_27 + matrix44_7.buf[10] * i_28 + matrix44_7.buf[14];
                f_30 = matrix44_7.buf[3] * i_26 + matrix44_7.buf[7] * i_27 + matrix44_7.buf[11] * i_28 + matrix44_7.buf[15];
                if (f_29 >= -f_30) {
                    f_31 = matrix44_7.buf[0] * i_26 + matrix44_7.buf[4] * i_27 + matrix44_7.buf[8] * i_28 + matrix44_7.buf[12];
                    f_32 = matrix44_7.buf[1] * i_26 + matrix44_7.buf[5] * i_27 + matrix44_7.buf[9] * i_28 + matrix44_7.buf[13];
                    aFloatArray8590[i_25] = ((int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_30));
                    aFloatArray8605[i_25] = ((int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_32 / f_30));
                } else {
                    aFloatArray8590[i_25] = -999999.0f;
                }
            }

            for (i_25 = 0; i_25 < anInt8586; i_25++) {
                if (aFloatArray8590[aShortArray8587[i_25]] != -999999.0f && aFloatArray8590[aShortArray8588[i_25]] != -999999.0f && aFloatArray8590[aShortArray8642[i_25]] != -999999.0f && method13819(i_1, i_2, aFloatArray8605[aShortArray8587[i_25]], aFloatArray8605[aShortArray8588[i_25]], aFloatArray8605[aShortArray8642[i_25]], aFloatArray8590[aShortArray8587[i_25]], aFloatArray8590[aShortArray8588[i_25]], aFloatArray8590[aShortArray8642[i_25]])) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean method11309(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
        method13795(aGraphicalRenderer_Sub3_8638.method14370(Thread.currentThread()));
        Matrix44 matrix44_6 = aClass185_8564.aClass384_2317;
        matrix44_6.fromVarMatrix44(matrix44var_3);
        Matrix44 matrix44_7 = aClass185_8564.aClass384_2318;
        matrix44_7.method6562(matrix44_6);
        matrix44_7.method6523(aGraphicalRenderer_Sub3_8638.aClass384_8996);
        boolean bool_8 = false;
        int i_9 = Integer.MAX_VALUE;
        int i_10 = Integer.MIN_VALUE;
        int i_11 = Integer.MAX_VALUE;
        int i_12 = Integer.MIN_VALUE;
        if (!aBool8621) {
            method13876();
        }

        int i_13 = aShort8627 - aShort8634 >> 1;
        int i_14 = aShort8625 - aShort8570 >> 1;
        int i_15 = aShort8629 - aShort8571 >> 1;
        int i_16 = aShort8634 + i_13;
        int i_17 = aShort8570 + i_14;
        int i_18 = aShort8571 + i_15;
        int i_19 = i_16 - (i_13 << i_5);
        int i_20 = i_17 - (i_14 << i_5);
        int i_21 = i_18 - (i_15 << i_5);
        int i_22 = i_16 + (i_13 << i_5);
        int i_23 = i_17 + (i_14 << i_5);
        int i_24 = i_18 + (i_15 << i_5);
        anIntArray8583[0] = i_19;
        anIntArray8639[0] = i_20;
        anIntArray8628[0] = i_21;
        anIntArray8583[1] = i_22;
        anIntArray8639[1] = i_20;
        anIntArray8628[1] = i_21;
        anIntArray8583[2] = i_19;
        anIntArray8639[2] = i_23;
        anIntArray8628[2] = i_21;
        anIntArray8583[3] = i_22;
        anIntArray8639[3] = i_23;
        anIntArray8628[3] = i_21;
        anIntArray8583[4] = i_19;
        anIntArray8639[4] = i_20;
        anIntArray8628[4] = i_24;
        anIntArray8583[5] = i_22;
        anIntArray8639[5] = i_20;
        anIntArray8628[5] = i_24;
        anIntArray8583[6] = i_19;
        anIntArray8639[6] = i_23;
        anIntArray8628[6] = i_24;
        anIntArray8583[7] = i_22;
        anIntArray8639[7] = i_23;
        anIntArray8628[7] = i_24;

        int i_25;
        int i_26;
        int i_27;
        int i_28;
        float f_29;
        float f_30;
        float f_31;
        float f_32;
        for (i_25 = 0; i_25 < 8; i_25++) {
            i_26 = anIntArray8583[i_25];
            i_27 = anIntArray8639[i_25];
            i_28 = anIntArray8628[i_25];
            f_29 = matrix44_7.buf[2] * i_26 + matrix44_7.buf[6] * i_27 + matrix44_7.buf[10] * i_28 + matrix44_7.buf[14];
            f_30 = matrix44_7.buf[3] * i_26 + matrix44_7.buf[7] * i_27 + matrix44_7.buf[11] * i_28 + matrix44_7.buf[15];
            if (f_29 >= -f_30) {
                f_31 = matrix44_7.buf[0] * i_26 + matrix44_7.buf[4] * i_27 + matrix44_7.buf[8] * i_28 + matrix44_7.buf[12];
                f_32 = matrix44_7.buf[1] * i_26 + matrix44_7.buf[5] * i_27 + matrix44_7.buf[9] * i_28 + matrix44_7.buf[13];
                int i_33 = (int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_30);
                int i_34 = (int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_32 / f_30);
                if (i_33 < i_9) {
                    i_9 = i_33;
                }

                if (i_33 > i_10) {
                    i_10 = i_33;
                }

                if (i_34 < i_11) {
                    i_11 = i_34;
                }

                if (i_34 > i_12) {
                    i_12 = i_34;
                }

                bool_8 = true;
            }
        }

        if (bool_8 && i_1 > i_9 && i_1 < i_10 && i_2 > i_11 && i_2 < i_12) {
            if (bool_4) {
                return true;
            }

            for (i_25 = 0; i_25 < anInt8578; i_25++) {
                i_26 = anIntArray8580[i_25];
                i_27 = anIntArray8581[i_25];
                i_28 = anIntArray8610[i_25];
                f_29 = matrix44_7.buf[2] * i_26 + matrix44_7.buf[6] * i_27 + matrix44_7.buf[10] * i_28 + matrix44_7.buf[14];
                f_30 = matrix44_7.buf[3] * i_26 + matrix44_7.buf[7] * i_27 + matrix44_7.buf[11] * i_28 + matrix44_7.buf[15];
                if (f_29 >= -f_30) {
                    f_31 = matrix44_7.buf[0] * i_26 + matrix44_7.buf[4] * i_27 + matrix44_7.buf[8] * i_28 + matrix44_7.buf[12];
                    f_32 = matrix44_7.buf[1] * i_26 + matrix44_7.buf[5] * i_27 + matrix44_7.buf[9] * i_28 + matrix44_7.buf[13];
                    aFloatArray8590[i_25] = ((int) (aGraphicalRenderer_Sub3_8638.aFloat9003 + aGraphicalRenderer_Sub3_8638.aFloat8976 * f_31 / f_30));
                    aFloatArray8605[i_25] = ((int) (aGraphicalRenderer_Sub3_8638.aFloat8982 + aGraphicalRenderer_Sub3_8638.aFloat9004 * f_32 / f_30));
                } else {
                    aFloatArray8590[i_25] = -999999.0f;
                }
            }

            for (i_25 = 0; i_25 < anInt8586; i_25++) {
                if (aFloatArray8590[aShortArray8587[i_25]] != -999999.0f && aFloatArray8590[aShortArray8588[i_25]] != -999999.0f && aFloatArray8590[aShortArray8642[i_25]] != -999999.0f && method13819(i_1, i_2, aFloatArray8605[aShortArray8587[i_25]], aFloatArray8605[aShortArray8588[i_25]], aFloatArray8605[aShortArray8642[i_25]], aFloatArray8590[aShortArray8587[i_25]], aFloatArray8590[aShortArray8588[i_25]], aFloatArray8590[aShortArray8642[i_25]])) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public int cc() {
        if (!aBool8621) {
            method13876();
        }

        return aShort8634;
    }

    @Override
    public Shadow dw(Shadow class282_sub50_sub17_1) {
        return null;
    }

    @Override
    public void dk(int i_1, int i_2, int i_3) {
        if (i_1 != 0 && (anInt8575 & 0x1) != 1) {
            throw new IllegalStateException();
        } else if (i_2 != 0 && (anInt8575 & 0x2) != 2) {
            throw new IllegalStateException();
        } else if (i_3 != 0 && (anInt8575 & 0x4) != 4) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] += i_1;
                    anIntArray8581[i_5] += i_2;
                    anIntArray8610[i_5] += i_3;
                }

            }
        }
    }

    @Override
    public int dq() {
        return anInt8606;
    }

    @Override
    public void ep(int i_1, int i_2, int i_3) {
        if (i_1 != 128 && (anInt8575 & 0x1) != 1) {
            throw new IllegalStateException();
        } else if (i_2 != 128 && (anInt8575 & 0x2) != 2) {
            throw new IllegalStateException();
        } else if (i_3 != 128 && (anInt8575 & 0x4) != 4) {
            throw new IllegalStateException();
        } else {
            synchronized (this) {
                for (int i_5 = 0; i_5 < anInt8578; i_5++) {
                    anIntArray8580[i_5] = anIntArray8580[i_5] * i_1 >> 7;
                    anIntArray8581[i_5] = anIntArray8581[i_5] * i_2 >> 7;
                    anIntArray8610[i_5] = anIntArray8610[i_5] * i_3 >> 7;
                }

                aBool8621 = false;
            }
        }
    }

}
