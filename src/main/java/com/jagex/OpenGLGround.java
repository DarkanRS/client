package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class OpenGLGround extends Ground {

    static float[] GROUND_MATRIX = new float[16];
    Class130 aClass130_8664;
    int[][][] tileZOffsets;
    int[][][] tileXOffsets;
    int[][][] tileColours;
    int[][][] anIntArrayArrayArray8662;
    int[][][] tileBlendColours;
    int[][][] anIntArrayArrayArray8649;
    Node_Sub3[][][] materials;
    byte[][] shadowing;
    HashTable materialTable;
    float[][] lightingZ;
    float[][] lightingY;
    float[][] lightingX;
    Node[] aNodeArray8666;
    Interface14 data;
    OpenGlArrayBufferPointer vertexPointer;
    OpenGlArrayBufferPointer colourPointer;
    OpenGlArrayBufferPointer texturePointer;
    OpenGlArrayBufferPointer normalPointer;
    int anInt8654;
    int anInt8657;
    int anInt8659;
    int anInt8672;
    LinkedNodeList aClass473_8673 = new LinkedNodeList();
    OpenGLRenderer renderer;
    int quarterTileScale;
    int quartertileUnits;
    int anInt8651;
    int flags;
    short[][] materialIndices;
    byte[][] shadowFlags;

    OpenGLGround(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int[][] ints_6, int[][] ints_7, int i_8) {
        super(i_4, i_5, i_8, ints_6);
        renderer = class505_sub1_1;
        quarterTileScale = tileScale - 2;
        quartertileUnits = 1 << quarterTileScale;
        anInt8651 = i_2;
        flags = i_3;
        anIntArrayArrayArray8649 = new int[i_4][i_5][];
        materials = new Node_Sub3[i_4][i_5][];
        tileXOffsets = new int[i_4][i_5][];
        tileZOffsets = new int[i_4][i_5][];
        tileColours = new int[i_4][i_5][];
        tileBlendColours = new int[i_4][i_5][];
        materialIndices = new short[i_5 * i_4][];
        shadowFlags = new byte[i_4][i_5];
        shadowing = new byte[i_4 + 1][i_5 + 1];
        lightingX = new float[width + 1][length + 1];
        lightingY = new float[width + 1][length + 1];
        lightingZ = new float[width + 1][length + 1];

        for (int i_9 = 1; i_9 < length; i_9++) {
            for (int i_10 = 1; i_10 < width; i_10++) {
                int i_11 = ints_7[i_10 + 1][i_9] - ints_7[i_10 - 1][i_9];
                int i_12 = ints_7[i_10][i_9 + 1] - ints_7[i_10][i_9 - 1];
                float f_13 = (float) (1.0D / Math.sqrt(i_8 * i_8 * 4 + i_11 * i_11 + i_12 * i_12));
                lightingX[i_10][i_9] = i_11 * f_13;
                lightingY[i_10][i_9] = (-i_8 * 2) * f_13;
                lightingZ[i_10][i_9] = i_12 * f_13;
            }
        }

        materialTable = new HashTable(128);
        if ((flags & 0x10) != 0) {
            aClass130_8664 = new Class130(renderer, this);
        }

    }

    void method13879(CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_1, int i_2, int i_3) {
        int[] ints_4 = tileXOffsets[i_2][i_3];
        int[] ints_5 = tileZOffsets[i_2][i_3];
        int i_6 = ints_4.length;
        if (renderer.anIntArray8500.length < i_6) {
            renderer.anIntArray8500 = new int[i_6];
            renderer.anIntArray8501 = new int[i_6];
        }

        int[] ints_7 = renderer.anIntArray8500;
        int[] ints_8 = renderer.anIntArray8501;

        int i_9;
        for (i_9 = 0; i_9 < i_6; i_9++) {
            ints_7[i_9] = ints_4[i_9] >> renderer.anInt8473;
            ints_8[i_9] = ints_5[i_9] >> renderer.anInt8473;
        }

        i_9 = 0;

        while (i_9 < i_6) {
            int i_10 = ints_7[i_9];
            int i_11 = ints_8[i_9++];
            int i_12 = ints_7[i_9];
            int i_13 = ints_8[i_9++];
            int i_14 = ints_7[i_9];
            int i_15 = ints_8[i_9++];
            if ((i_10 - i_12) * (i_13 - i_15) - (i_13 - i_11) * (i_14 - i_12) > 0) {
                class282_sub50_sub17_sub1_1.method15713(i_11, i_13, i_15, i_10, i_12, i_14);
            }
        }

    }

    @Override
    public void LA(int i_1, int i_2, int i_3) {
        if ((shadowing[i_1][i_2] & 0xff) < i_3) {
            shadowing[i_1][i_2] = (byte) i_3;
        }

    }

    @Override
    public void method6708(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, HDWaterTile class90_14) {
        int i_16 = ints_10.length;
        int[] ints_17 = new int[i_16 * 3];
        int[] ints_18 = new int[i_16 * 3];
        int[] ints_19 = new int[i_16 * 3];
        int[] ints_20 = ints_11 != null ? new int[i_16 * 3] : null;
        int[] ints_21 = new int[i_16 * 3];
        int[] ints_22 = new int[i_16 * 3];
        int[] ints_23 = ints_4 != null ? new int[i_16 * 3] : null;
        int[] ints_24 = ints_6 != null ? new int[i_16 * 3] : null;
        int i_25 = 0;

        for (int i_26 = 0; i_26 < i_16; i_26++) {
            int i_27 = ints_7[i_26];
            int i_28 = ints_8[i_26];
            int i_29 = ints_9[i_26];
            ints_17[i_25] = ints_3[i_27];
            ints_18[i_25] = ints_5[i_27];
            ints_19[i_25] = ints_10[i_26];
            ints_21[i_25] = ints_12[i_26];
            ints_22[i_25] = ints_13[i_26];
            if (ints_11 != null) {
                ints_20[i_25] = ints_11[i_26];
            }

            if (ints_4 != null) {
                ints_23[i_25] = ints_4[i_27];
            }

            if (ints_6 != null) {
                ints_24[i_25] = ints_6[i_27];
            }

            ++i_25;
            ints_17[i_25] = ints_3[i_28];
            ints_18[i_25] = ints_5[i_28];
            ints_19[i_25] = ints_10[i_26];
            ints_21[i_25] = ints_12[i_26];
            ints_22[i_25] = ints_13[i_26];
            if (ints_11 != null) {
                ints_20[i_25] = ints_11[i_26];
            }

            if (ints_4 != null) {
                ints_23[i_25] = ints_4[i_28];
            }

            if (ints_6 != null) {
                ints_24[i_25] = ints_6[i_28];
            }

            ++i_25;
            ints_17[i_25] = ints_3[i_29];
            ints_18[i_25] = ints_5[i_29];
            ints_19[i_25] = ints_10[i_26];
            ints_21[i_25] = ints_12[i_26];
            ints_22[i_25] = ints_13[i_26];
            if (ints_11 != null) {
                ints_20[i_25] = ints_11[i_26];
            }

            if (ints_4 != null) {
                ints_23[i_25] = ints_4[i_29];
            }

            if (ints_6 != null) {
                ints_24[i_25] = ints_6[i_29];
            }

            ++i_25;
        }

        method6707(i_1, i_2, ints_17, ints_23, ints_18, ints_24, ints_19, ints_20, ints_21, ints_22, class90_14, false);
    }

    @Override
    public void method6716(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5, int i_6) {
        method13881(i_1, i_2, i_3, bools_4, bool_5);
    }

    void method13881(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5) {
        if (aNodeArray8666 != null) {
            int i_7 = i_3 + i_3 + 1;
            i_7 *= i_7;
            if (renderer.anIntArray8502.length < i_7) {
                renderer.anIntArray8502 = new int[i_7];
            }

            if (renderer.aNode_Sub35_Sub1_8499.buffer.length < anInt8654 * 2) {
                renderer.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1(anInt8654 * 2);
            }

            int i_8 = i_1 - i_3;
            int i_9 = i_8;
            if (i_8 < 0) {
                i_8 = 0;
            }

            int i_10 = i_2 - i_3;
            int i_11 = i_10;
            if (i_10 < 0) {
                i_10 = 0;
            }

            int i_12 = i_3 + i_1;
            if (i_12 > width - 1) {
                i_12 = width - 1;
            }

            int i_13 = i_3 + i_2;
            if (i_13 > length - 1) {
                i_13 = length - 1;
            }

            int i_14 = 0;
            int[] ints_15 = renderer.anIntArray8502;

            int i_16;
            for (i_16 = i_8; i_16 <= i_12; i_16++) {
                boolean[] bools_20 = bools_4[i_16 - i_9];

                for (int i_21 = i_10; i_21 <= i_13; i_21++) {
                    if (bools_20[i_21 - i_11]) {
                        ints_15[i_14++] = i_16 + i_21 * width;
                    }
                }
            }

            renderer.method13607();
            renderer.method13620((flags & 0x7) != 0);

            for (i_16 = 0; i_16 < aNodeArray8666.length; i_16++) {
                ((Node_Sub3) aNodeArray8666[i_16]).method12085(ints_15, i_14);
            }

            if (!aClass473_8673.method7861()) {
                i_16 = renderer.anInt8441;
                int i_17 = renderer.anInt8358;
                renderer.c(0, i_17, renderer.anInt8378);
                renderer.method13620(false);
                renderer.method13623(false);
                renderer.setColorRenderType(128);
                renderer.method13581(-2);
                renderer.setTexture(renderer.aClass137_Sub1_8460);
                renderer.method13717(8448, 7681);
                renderer.method13595(0, 34166, 770);
                renderer.method13616(0, 34167);

                for (Node node_18 = aClass473_8673.getBack(); node_18 != null; node_18 = aClass473_8673.getPrevious()) {
                    Node_Sub19 class282_sub19_19 = (Node_Sub19) node_18;
                    class282_sub19_19.method12311(i_1, i_2, i_3, bools_4);
                }

                renderer.method13595(0, 5890, 768);
                renderer.method13616(0, 5890);
                renderer.setTexture(null);
                renderer.c(i_16, i_17, renderer.anInt8378);
            }

            if (aClass130_8664 != null) {
                OpenGL.glPushMatrix();
                OpenGL.glTranslatef(0.0F, -1.0f, 0.0F);
                renderer.method13647(vertexPointer, null, null, texturePointer);
                aClass130_8664.method2290(i_1, i_2, i_3, bools_4, bool_5);
                OpenGL.glPopMatrix();
            }
        }

    }

    @Override
    public void SA() {
        if (anInt8672 > 0) {
            byte[][] bytes_1 = new byte[width + 1][length + 1];

            int i_2;
            for (i_2 = 1; i_2 < width; i_2++) {
                for (int i_75 = 1; i_75 < length; i_75++) {
                    bytes_1[i_2][i_75] = (byte) ((shadowing[i_2][i_75 - 1] >> 2) + (shadowing[i_2][i_75] >> 1) + (shadowing[i_2 - 1][i_75] >> 2) + (shadowing[i_2][i_75 + 1] >> 3) + (shadowing[i_2 + 1][i_75] >> 3));
                }
            }

            aNodeArray8666 = new Node[materialTable.method7540()];
            materialTable.values(aNodeArray8666);

            for (i_2 = 0; i_2 < aNodeArray8666.length; i_2++) {
                ((Node_Sub3) aNodeArray8666[i_2]).method12092(anInt8672);
            }

            i_2 = 24;
            if (anIntArrayArrayArray8662 != null) {
                i_2 += 4;
            }

            if ((flags & 0x7) != 0) {
                i_2 += 12;
            }

            NativeHeapBuffer nativeheapbuffer_3 = renderer.aNativeHeap8445.method759(i_2 * anInt8672, false);
            Stream stream_4 = new Stream(nativeheapbuffer_3);
            Node_Sub3[] arr_5 = new Node_Sub3[anInt8672];
            int i_6 = Class51.method1072(anInt8672 / 4);
            if (i_6 < 1) {
                i_6 = 1;
            }

            HashTable class453_7 = new HashTable(i_6);
            Node_Sub3[] arr_8 = new Node_Sub3[anInt8659];

            int i_9;
            int i_64;
            for (i_9 = 0; i_9 < width; i_9++) {
                for (i_64 = 0; i_64 < length; i_64++) {
                    if (tileColours[i_9][i_64] != null) {
                        Node_Sub3[] arr_65 = materials[i_9][i_64];
                        int[] ints_12 = tileXOffsets[i_9][i_64];
                        int[] ints_67 = tileZOffsets[i_9][i_64];
                        int[] ints_68 = tileBlendColours[i_9][i_64];
                        int[] ints_69 = tileColours[i_9][i_64];
                        int[] ints_70 = anIntArrayArrayArray8649 != null ? anIntArrayArrayArray8649[i_9][i_64] : null;
                        int[] ints_17 = anIntArrayArrayArray8662 != null ? anIntArrayArrayArray8662[i_9][i_64] : null;
                        if (ints_68 == null) {
                            ints_68 = ints_69;
                        }

                        float f_71 = lightingX[i_9][i_64];
                        float f_72 = lightingY[i_9][i_64];
                        float f_73 = lightingZ[i_9][i_64];
                        float f_21 = lightingX[i_9][i_64 + 1];
                        float f_22 = lightingY[i_9][i_64 + 1];
                        float f_23 = lightingZ[i_9][i_64 + 1];
                        float f_24 = lightingX[i_9 + 1][i_64 + 1];
                        float f_25 = lightingY[i_9 + 1][i_64 + 1];
                        float f_26 = lightingZ[i_9 + 1][i_64 + 1];
                        float f_27 = lightingX[i_9 + 1][i_64];
                        float f_28 = lightingY[i_9 + 1][i_64];
                        float f_29 = lightingZ[i_9 + 1][i_64];
                        int i_30 = bytes_1[i_9][i_64] & 0xff;
                        int i_31 = bytes_1[i_9][i_64 + 1] & 0xff;
                        int i_32 = bytes_1[i_9 + 1][i_64 + 1] & 0xff;
                        int i_33 = bytes_1[i_9 + 1][i_64] & 0xff;
                        int i_34 = 0;

                        int i_37;
                        label439:
                        for (int i_35 = 0; i_35 < ints_69.length; i_35++) {
                            Node_Sub3 class282_sub3_76 = arr_65[i_35];

                            for (i_37 = 0; i_37 < i_34; i_37++) {
                                if (class282_sub3_76 == arr_8[i_37]) {
                                    continue label439;
                                }
                            }

                            arr_8[i_34++] = class282_sub3_76;
                        }

                        short[] shorts_74 = materialIndices[i_9 + i_64 * width] = new short[ints_69.length];

                        for (int i_36 = 0; i_36 < ints_69.length; i_36++) {
                            i_37 = (i_9 << tileScale) + ints_12[i_36];
                            int i_38 = (i_64 << tileScale) + ints_67[i_36];
                            int i_39 = i_37 >> quarterTileScale;
                            int i_40 = i_38 >> quarterTileScale;
                            int i_41 = ints_69[i_36];
                            int i_42 = ints_68[i_36];
                            int i_43 = ints_70 != null ? ints_70[i_36] : 0;
                            long long_44 = (long) i_42 << 48 | (long) i_41 << 32 | (i_39 << 16) | i_40;
                            int i_46 = ints_12[i_36];
                            int i_47 = ints_67[i_36];
                            byte b_48 = 74;
                            int i_49 = 0;
                            float f_50 = 1.0F;
                            float f_51;
                            float f_52;
                            float f_53;
                            float f_58;
                            int i_82;
                            if (i_46 == 0 && i_47 == 0) {
                                f_51 = f_71;
                                f_52 = f_72;
                                f_53 = f_73;
                                i_82 = b_48 - i_30;
                            } else if (i_46 == 0 && i_47 == tileUnits) {
                                f_51 = f_21;
                                f_52 = f_22;
                                f_53 = f_23;
                                i_82 = b_48 - i_31;
                            } else if (i_46 == tileUnits && i_47 == tileUnits) {
                                f_51 = f_24;
                                f_52 = f_25;
                                f_53 = f_26;
                                i_82 = b_48 - i_32;
                            } else if (i_46 == tileUnits && i_47 == 0) {
                                f_51 = f_27;
                                f_52 = f_28;
                                f_53 = f_29;
                                i_82 = b_48 - i_33;
                            } else {
                                float f_54 = (float) i_46 / tileUnits;
                                float f_55 = (float) i_47 / tileUnits;
                                float f_56 = f_71 + (f_27 - f_71) * f_54;
                                float f_57 = f_72 + (f_28 - f_72) * f_54;
                                f_58 = f_73 + (f_29 - f_73) * f_54;
                                float f_59 = f_21 + (f_24 - f_21) * f_54;
                                float f_60 = f_22 + (f_25 - f_22) * f_54;
                                float f_61 = f_23 + (f_26 - f_23) * f_54;
                                f_51 = f_56 + (f_59 - f_56) * f_55;
                                f_52 = f_57 + (f_60 - f_57) * f_55;
                                f_53 = f_58 + (f_61 - f_58) * f_55;
                                int i_62 = i_30 + (i_46 * (i_33 - i_30) >> tileScale);
                                int i_63 = i_31 + (i_46 * (i_32 - i_31) >> tileScale);
                                i_82 = b_48 - (i_62 + (i_47 * (i_63 - i_62) >> tileScale));
                            }

                            if (i_41 != -1) {
                                int i_83 = i_82 * (i_41 & 0x7f) >> 7;
                                if (i_83 < 2) {
                                    i_83 = 2;
                                } else if (i_83 > 126) {
                                    i_83 = 126;
                                }

                                i_49 = Class540.anIntArray7136[i_41 & 0xff80 | i_83];
                                if ((flags & 0x7) == 0) {
                                    f_50 = renderer.aFloatArray8426[0] * f_51 + renderer.aFloatArray8426[1] * f_52 + renderer.aFloatArray8426[2] * f_53;
                                    f_50 = renderer.aFloat8432 + f_50 * (f_50 > 0.0F ? renderer.aFloat8433 : renderer.aFloat8434);
                                }
                            }

                            Node node_77 = null;
                            if ((i_37 & quartertileUnits - 1) == 0 && (i_38 & quartertileUnits - 1) == 0) {
                                node_77 = class453_7.get(long_44);
                            }

                            int i_84;
                            int i_85;
                            if (node_77 == null) {
                                if (i_42 != i_41) {
                                    int i_86 = i_82 * (i_42 & 0x7f) >> 7;
                                    if (i_86 < 2) {
                                        i_86 = 2;
                                    } else if (i_86 > 126) {
                                        i_86 = 126;
                                    }

                                    i_85 = Class540.anIntArray7136[i_42 & 0xff80 | i_86];
                                    if ((flags & 0x7) == 0) {
                                        float f_10000 = renderer.aFloatArray8426[0] * f_51 + renderer.aFloatArray8426[1] * f_52 + renderer.aFloatArray8426[2] * f_53;
                                        f_58 = renderer.aFloat8432 + f_50 * (f_50 > 0.0F ? renderer.aFloat8433 : renderer.aFloat8434);
                                        int i_87 = i_85 >> 16 & 0xff;
                                        int i_88 = i_85 >> 8 & 0xff;
                                        int i_89 = i_85 & 0xff;
                                        i_87 = (int) (i_87 * f_58);
                                        if (i_87 < 0) {
                                            i_87 = 0;
                                        } else if (i_87 > 255) {
                                            i_87 = 255;
                                        }

                                        i_88 = (int) (i_88 * f_58);
                                        if (i_88 < 0) {
                                            i_88 = 0;
                                        } else if (i_88 > 255) {
                                            i_88 = 255;
                                        }

                                        i_89 = (int) (i_89 * f_58);
                                        if (i_89 < 0) {
                                            i_89 = 0;
                                        } else if (i_89 > 255) {
                                            i_89 = 255;
                                        }

                                        i_85 = i_87 << 16 | i_88 << 8 | i_89;
                                    }
                                } else {
                                    i_85 = i_49;
                                }

                                if (renderer.aBool8467) {
                                    stream_4.method2923(i_37);
                                    stream_4.method2923((averageHeight(i_37, i_38) + i_43));
                                    stream_4.method2923(i_38);
                                    stream_4.method2920((byte) (i_85 >> 16));
                                    stream_4.method2920((byte) (i_85 >> 8));
                                    stream_4.method2920((byte) i_85);
                                    stream_4.method2920(-1);
                                    stream_4.method2923(i_37);
                                    stream_4.method2923(i_38);
                                    if (anIntArrayArrayArray8662 != null) {
                                        stream_4.method2923(ints_17 != null ? (ints_17[i_36] - 1) : 0.0F);
                                    }

                                    if ((flags & 0x7) != 0) {
                                        stream_4.method2923(f_51);
                                        stream_4.method2923(f_52);
                                        stream_4.method2923(f_53);
                                    }
                                } else {
                                    stream_4.method2924(i_37);
                                    stream_4.method2924((averageHeight(i_37, i_38) + i_43));
                                    stream_4.method2924(i_38);
                                    stream_4.method2920((byte) (i_85 >> 16));
                                    stream_4.method2920((byte) (i_85 >> 8));
                                    stream_4.method2920((byte) i_85);
                                    stream_4.method2920(-1);
                                    stream_4.method2924(i_37);
                                    stream_4.method2924(i_38);
                                    if (anIntArrayArrayArray8662 != null) {
                                        stream_4.method2924(ints_17 != null ? (ints_17[i_36] - 1) : 0.0F);
                                    }

                                    if ((flags & 0x7) != 0) {
                                        stream_4.method2924(f_51);
                                        stream_4.method2924(f_52);
                                        stream_4.method2924(f_53);
                                    }
                                }

                                i_84 = anInt8657++;
                                shorts_74[i_36] = (short) i_84;
                                if (i_41 != -1) {
                                    arr_5[i_84] = arr_65[i_36];
                                }

                                class453_7.put(new Node_Sub46(shorts_74[i_36]), long_44);
                            } else {
                                shorts_74[i_36] = ((Node_Sub46) node_77).aShort8067;
                                i_84 = shorts_74[i_36] & 0xffff;
                                if (i_41 != -1 && arr_65[i_36].pointer < arr_5[i_84].pointer) {
                                    arr_5[i_84] = arr_65[i_36];
                                }
                            }

                            for (i_85 = 0; i_85 < i_34; i_85++) {
                                arr_8[i_85].method12083(i_84, i_49, i_82, f_50);
                            }

                            ++anInt8654;
                        }
                    }
                }
            }

            for (i_9 = 0; i_9 < anInt8657; i_9++) {
                Node_Sub3 class282_sub3_10 = arr_5[i_9];
                if (class282_sub3_10 != null) {
                    class282_sub3_10.method12081(i_9);
                }
            }

            for (i_9 = 0; i_9 < width; i_9++) {
                for (i_64 = 0; i_64 < length; i_64++) {
                    short[] shorts_90 = materialIndices[i_9 + i_64 * width];
                    if (shorts_90 != null) {
                        int i_66 = 0;

                        for (int i_13 = 0; i_13 < shorts_90.length; i_66++) {
                            int i_14 = shorts_90[i_13++] & 0xffff;
                            int i_15 = shorts_90[i_13++] & 0xffff;
                            int i_16 = shorts_90[i_13++] & 0xffff;
                            Node_Sub3 class282_sub3_81 = arr_5[i_14];
                            Node_Sub3 class282_sub3_18 = arr_5[i_15];
                            Node_Sub3 class282_sub3_19 = arr_5[i_16];
                            Node_Sub3 class282_sub3_20 = null;
                            if (class282_sub3_81 != null) {
                                class282_sub3_81.method12082(i_9, i_64, i_66);
                                class282_sub3_20 = class282_sub3_81;
                            }

                            if (class282_sub3_18 != null) {
                                class282_sub3_18.method12082(i_9, i_64, i_66);
                                if (class282_sub3_20 == null || class282_sub3_18.pointer < class282_sub3_20.pointer) {
                                    class282_sub3_20 = class282_sub3_18;
                                }
                            }

                            if (class282_sub3_19 != null) {
                                class282_sub3_19.method12082(i_9, i_64, i_66);
                                if (class282_sub3_20 == null || class282_sub3_19.pointer < class282_sub3_20.pointer) {
                                    class282_sub3_20 = class282_sub3_19;
                                }
                            }

                            if (class282_sub3_20 != null) {
                                if (class282_sub3_81 != null) {
                                    class282_sub3_20.method12081(i_14);
                                }

                                if (class282_sub3_18 != null) {
                                    class282_sub3_20.method12081(i_15);
                                }

                                if (class282_sub3_19 != null) {
                                    class282_sub3_20.method12081(i_16);
                                }

                                class282_sub3_20.method12082(i_9, i_64, i_66);
                            }
                        }
                    }
                }
            }

            stream_4.method2925();
            data = renderer.createArrayBuffer(i_2, nativeheapbuffer_3, stream_4.written());
            if (data instanceof Class135_Sub2) {
                nativeheapbuffer_3.method1178();
            }

            vertexPointer = new OpenGlArrayBufferPointer(data, 5126, 3, 0);
            colourPointer = new OpenGlArrayBufferPointer(data, 5121, 4, 12);
            byte b_79;
            if (anIntArrayArrayArray8662 != null) {
                texturePointer = new OpenGlArrayBufferPointer(data, 5126, 3, 16);
                b_79 = 28;
            } else {
                texturePointer = new OpenGlArrayBufferPointer(data, 5126, 2, 16);
                b_79 = 24;
            }

            if ((flags & 0x7) != 0) {
                normalPointer = new OpenGlArrayBufferPointer(data, 5126, 3, b_79);
            }

            long[] longs_78 = new long[aNodeArray8666.length];

            for (int i_11 = 0; i_11 < aNodeArray8666.length; i_11++) {
                Node_Sub3 class282_sub3_80 = (Node_Sub3) aNodeArray8666[i_11];
                longs_78[i_11] = class282_sub3_80.pointer;
                class282_sub3_80.method12087(anInt8657);
            }

            Class214.method3669(longs_78, aNodeArray8666);
            if (aClass130_8664 != null) {
                aClass130_8664.method2309();
            }
        } else {
            aClass130_8664 = null;
        }

        if ((anInt8651 & 0x2) == 0) {
            tileZOffsets = null;
            tileXOffsets = null;
            tileColours = null;
        }

        anIntArrayArrayArray8662 = null;
        tileBlendColours = null;
        anIntArrayArrayArray8649 = null;
        materials = null;
        shadowing = null;
        materialTable = null;
        lightingZ = null;
        lightingY = null;
        lightingX = null;
    }

    @Override
    public void method6715(int i_1, int i_2, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
        Class158 class158_9 = renderer.method8523();
        if (anInt8672 > 0 && class158_9 != null) {
            renderer.method13586();
            renderer.method13642(false);
            renderer.method13620(false);
            renderer.enableDepthTest(false);
            renderer.method13623(false);
            renderer.setColorRenderType(0);
            renderer.method13581(-2);
            renderer.setTexture(null);
            GROUND_MATRIX[0] = 1024 / (128.0F * tileUnits * class158_9.method2714());
            GROUND_MATRIX[1] = 0.0F;
            GROUND_MATRIX[2] = 0.0F;
            GROUND_MATRIX[3] = 0.0F;
            GROUND_MATRIX[4] = 0.0F;
            GROUND_MATRIX[5] = 1024 / (128.0F * tileUnits * class158_9.method2716());
            GROUND_MATRIX[6] = 0.0F;
            GROUND_MATRIX[7] = 0.0F;
            GROUND_MATRIX[8] = 0.0F;
            GROUND_MATRIX[9] = 0.0F;
            GROUND_MATRIX[10] = 0.0F;
            GROUND_MATRIX[11] = 0.0F;
            GROUND_MATRIX[12] = -1.0f - ((1024 * i_4) / 128.0F - (i_1 * 2)) / class158_9.method2714();
            GROUND_MATRIX[13] = 1.0F - ((i_2 * 2) + (1024 * i_7) / 128.0F) / class158_9.method2716();
            GROUND_MATRIX[14] = 0.0F;
            GROUND_MATRIX[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);
            GROUND_MATRIX[0] = 1.0F;
            GROUND_MATRIX[1] = 0.0F;
            GROUND_MATRIX[2] = 0.0F;
            GROUND_MATRIX[3] = 0.0F;
            GROUND_MATRIX[4] = 0.0F;
            GROUND_MATRIX[5] = 0.0F;
            GROUND_MATRIX[6] = 1.0F;
            GROUND_MATRIX[7] = 0.0F;
            GROUND_MATRIX[8] = 0.0F;
            GROUND_MATRIX[9] = 1.0F;
            GROUND_MATRIX[10] = 0.0F;
            GROUND_MATRIX[11] = 0.0F;
            GROUND_MATRIX[12] = 0.0F;
            GROUND_MATRIX[13] = 0.0F;
            GROUND_MATRIX[14] = 0.0F;
            GROUND_MATRIX[15] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);
            if ((flags & 0x7) != 0) {
                renderer.method13620(true);
                renderer.positionLights();
            } else {
                renderer.method13620(false);
            }

            renderer.method13647(vertexPointer, normalPointer, colourPointer, texturePointer);
            if (renderer.aNode_Sub35_Sub1_8499.buffer.length < anInt8654 * 2) {
                renderer.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1(anInt8654 * 2);
            } else {
                renderer.aNode_Sub35_Sub1_8499.index = 0;
            }

            int i_10 = 0;
            Node_Sub35_Sub1 class282_sub35_sub1_11 = renderer.aNode_Sub35_Sub1_8499;
            int i_12;
            int i_13;
            int i_14;
            short[] shorts_15;
            int i_16;
            if (renderer.aBool8467) {
                for (i_12 = i_5; i_12 < i_7; i_12++) {
                    i_13 = i_12 * width + i_4;

                    for (i_14 = i_4; i_14 < i_6; i_14++) {
                        if (bools_8[i_14 - i_4][i_12 - i_5]) {
                            shorts_15 = materialIndices[i_13];
                            if (shorts_15 != null) {
                                for (i_16 = 0; i_16 < shorts_15.length; i_16++) {
                                    class282_sub35_sub1_11.writeShort(shorts_15[i_16] & 0xffff);
                                    ++i_10;
                                }
                            }
                        }

                        ++i_13;
                    }
                }
            } else {
                for (i_12 = i_5; i_12 < i_7; i_12++) {
                    i_13 = i_12 * width + i_4;

                    for (i_14 = i_4; i_14 < i_6; i_14++) {
                        if (bools_8[i_14 - i_4][i_12 - i_5]) {
                            shorts_15 = materialIndices[i_13];
                            if (shorts_15 != null) {
                                for (i_16 = 0; i_16 < shorts_15.length; i_16++) {
                                    class282_sub35_sub1_11.writeLEShort(shorts_15[i_16] & 0xffff);
                                    ++i_10;
                                }
                            }
                        }

                        ++i_13;
                    }
                }
            }

            if (i_10 > 0) {
                Class131_Sub2 class131_sub2_17 = new Class131_Sub2(renderer, class282_sub35_sub1_11.buffer, class282_sub35_sub1_11.index);
                renderer.method13611(class131_sub2_17, 0, i_10);
            }
        }

    }

    @Override
    public void UA(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473;
            aClass130_8664.method2314(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public boolean method6712(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473;
            return aClass130_8664.method2293(class282_sub50_sub17_1, i_7, i_8);
        } else {
            return false;
        }
    }

    @Override
    public void NA(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473;
            aClass130_8664.method2313(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public void method6713(GLLight class282_sub24_1, int[] ints_2) {
        aClass473_8673.insertBack(new Node_Sub19(renderer, this, class282_sub24_1, ints_2));
    }

    @Override
    public void method6707(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, HDWaterTile class90_11, boolean bool_12) {
        ImageLoader interface22_13 = renderer.textureCache;
        if (ints_6 != null && anIntArrayArrayArray8662 == null) {
            anIntArrayArrayArray8662 = new int[width][length][];
        }

        if (ints_4 != null && anIntArrayArrayArray8649 == null) {
            anIntArrayArrayArray8649 = new int[width][length][];
        }

        tileXOffsets[i_1][i_2] = ints_3;
        tileZOffsets[i_1][i_2] = ints_5;
        tileColours[i_1][i_2] = ints_7;
        tileBlendColours[i_1][i_2] = ints_8;
        if (anIntArrayArrayArray8662 != null) {
            anIntArrayArrayArray8662[i_1][i_2] = ints_6;
        }

        if (anIntArrayArrayArray8649 != null) {
            anIntArrayArrayArray8649[i_1][i_2] = ints_4;
        }

        Node_Sub3[] arr_14 = materials[i_1][i_2] = new Node_Sub3[ints_7.length];

        for (int i_15 = 0; i_15 < ints_7.length; i_15++) {
            int i_16 = ints_9[i_15];
            int i_17 = ints_10[i_15];
            if ((flags & 0x20) != 0 && i_16 != -1 && interface22_13.getTextureDetails(i_16).isGroundMesh) {
                i_17 = 128;
                i_16 = -1;
            }

            long long_18 = (long) class90_11.intensity << 48 | (long) class90_11.scale << 42 | (long) class90_11.color << 28 | (i_17 << 14) | i_16;

            Node node_20;
            for (node_20 = materialTable.get(long_18); node_20 != null; node_20 = materialTable.nextInBucket()) {
                Node_Sub3 class282_sub3_21 = (Node_Sub3) node_20;
                if (i_16 == class282_sub3_21.anInt7493 && class282_sub3_21.aFloat7490 == i_17 && class282_sub3_21.aClass90_7487.equals(class90_11)) {
                    break;
                }
            }

            if (node_20 == null) {
                arr_14[i_15] = new Node_Sub3(this, i_16, i_17, class90_11);
                materialTable.put(arr_14[i_15], long_18);
            } else {
                arr_14[i_15] = (Node_Sub3) node_20;
            }
        }

        if (bool_12) {
            shadowFlags[i_1][i_2] |= 0x1;
        }

        if (ints_7.length > anInt8659) {
            anInt8659 = ints_7.length;
        }

        anInt8672 += ints_7.length;
    }

    @Override
    public void m(int i_1, int i_2, int i_3) {
        if ((shadowing[i_1][i_2] & 0xff) < i_3) {
            shadowing[i_1][i_2] = (byte) i_3;
        }

    }

    @Override
    public void method6714(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, HDWaterTile class90_14, boolean bool_15) {
        int i_16 = ints_10.length;
        int[] ints_17 = new int[i_16 * 3];
        int[] ints_18 = new int[i_16 * 3];
        int[] ints_19 = new int[i_16 * 3];
        int[] ints_20 = ints_11 != null ? new int[i_16 * 3] : null;
        int[] ints_21 = new int[i_16 * 3];
        int[] ints_22 = new int[i_16 * 3];
        int[] ints_23 = ints_4 != null ? new int[i_16 * 3] : null;
        int[] ints_24 = ints_6 != null ? new int[i_16 * 3] : null;
        int i_25 = 0;

        for (int i_26 = 0; i_26 < i_16; i_26++) {
            int i_27 = ints_7[i_26];
            int i_28 = ints_8[i_26];
            int i_29 = ints_9[i_26];
            ints_17[i_25] = ints_3[i_27];
            ints_18[i_25] = ints_5[i_27];
            ints_19[i_25] = ints_10[i_26];
            ints_21[i_25] = ints_12[i_26];
            ints_22[i_25] = ints_13[i_26];
            if (ints_11 != null) {
                ints_20[i_25] = ints_11[i_26];
            }

            if (ints_4 != null) {
                ints_23[i_25] = ints_4[i_27];
            }

            if (ints_6 != null) {
                ints_24[i_25] = ints_6[i_27];
            }

            ++i_25;
            ints_17[i_25] = ints_3[i_28];
            ints_18[i_25] = ints_5[i_28];
            ints_19[i_25] = ints_10[i_26];
            ints_21[i_25] = ints_12[i_26];
            ints_22[i_25] = ints_13[i_26];
            if (ints_11 != null) {
                ints_20[i_25] = ints_11[i_26];
            }

            if (ints_4 != null) {
                ints_23[i_25] = ints_4[i_28];
            }

            if (ints_6 != null) {
                ints_24[i_25] = ints_6[i_28];
            }

            ++i_25;
            ints_17[i_25] = ints_3[i_29];
            ints_18[i_25] = ints_5[i_29];
            ints_19[i_25] = ints_10[i_26];
            ints_21[i_25] = ints_12[i_26];
            ints_22[i_25] = ints_13[i_26];
            if (ints_11 != null) {
                ints_20[i_25] = ints_11[i_26];
            }

            if (ints_4 != null) {
                ints_23[i_25] = ints_4[i_29];
            }

            if (ints_6 != null) {
                ints_24[i_25] = ints_6[i_29];
            }

            ++i_25;
        }

        method6707(i_1, i_2, ints_17, ints_23, ints_18, ints_24, ints_19, ints_20, ints_21, ints_22, class90_14, bool_15);
    }

    @Override
    public void method6706(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, HDWaterTile class90_11, boolean bool_12) {
        ImageLoader interface22_13 = renderer.textureCache;
        if (ints_6 != null && anIntArrayArrayArray8662 == null) {
            anIntArrayArrayArray8662 = new int[width][length][];
        }

        if (ints_4 != null && anIntArrayArrayArray8649 == null) {
            anIntArrayArrayArray8649 = new int[width][length][];
        }

        tileXOffsets[i_1][i_2] = ints_3;
        tileZOffsets[i_1][i_2] = ints_5;
        tileColours[i_1][i_2] = ints_7;
        tileBlendColours[i_1][i_2] = ints_8;
        if (anIntArrayArrayArray8662 != null) {
            anIntArrayArrayArray8662[i_1][i_2] = ints_6;
        }

        if (anIntArrayArrayArray8649 != null) {
            anIntArrayArrayArray8649[i_1][i_2] = ints_4;
        }

        Node_Sub3[] arr_14 = materials[i_1][i_2] = new Node_Sub3[ints_7.length];

        for (int i_15 = 0; i_15 < ints_7.length; i_15++) {
            int i_16 = ints_9[i_15];
            int i_17 = ints_10[i_15];
            if ((flags & 0x20) != 0 && i_16 != -1 && interface22_13.getTextureDetails(i_16).isGroundMesh) {
                i_17 = 128;
                i_16 = -1;
            }

            long long_18 = (long) (class90_11.intensity) << 48 | (long) (class90_11.scale) << 42 | (long) (class90_11.color) << 28 | (i_17 << 14) | i_16;

            Node node_20;
            for (node_20 = materialTable.get(long_18); node_20 != null; node_20 = materialTable.nextInBucket()) {
                Node_Sub3 class282_sub3_21 = (Node_Sub3) node_20;
                if (class282_sub3_21.anInt7493 == i_16 && class282_sub3_21.aFloat7490 == i_17 && class282_sub3_21.aClass90_7487.equals(class90_11)) {
                    break;
                }
            }

            if (node_20 == null) {
                arr_14[i_15] = new Node_Sub3(this, i_16, i_17, class90_11);
                materialTable.put(arr_14[i_15], long_18);
            } else {
                arr_14[i_15] = (Node_Sub3) node_20;
            }
        }

        if (bool_12) {
            shadowFlags[i_1][i_2] |= 0x1;
        }

        if (ints_7.length > anInt8659) {
            anInt8659 = ints_7.length;
        }

        anInt8672 += ints_7.length;
    }

    @Override
    public void p() {
        if (anInt8672 > 0) {
            byte[][] bytes_1 = new byte[width + 1][length + 1];

            int i_2;
            for (i_2 = 1; i_2 < width; i_2++) {
                for (int i_75 = 1; i_75 < length; i_75++) {
                    bytes_1[i_2][i_75] = (byte) ((shadowing[i_2 - 1][i_75] >> 2) + (shadowing[i_2 + 1][i_75] >> 3) + (shadowing[i_2][i_75 - 1] >> 2) + (shadowing[i_2][i_75 + 1] >> 3) + (shadowing[i_2][i_75] >> 1));
                }
            }

            aNodeArray8666 = new Node[materialTable.method7540()];
            materialTable.values(aNodeArray8666);

            for (i_2 = 0; i_2 < aNodeArray8666.length; i_2++) {
                ((Node_Sub3) aNodeArray8666[i_2]).method12092(anInt8672);
            }

            i_2 = 24;
            if (anIntArrayArrayArray8662 != null) {
                i_2 += 4;
            }

            if ((flags & 0x7) != 0) {
                i_2 += 12;
            }

            NativeHeapBuffer nativeheapbuffer_3 = renderer.aNativeHeap8445.method759(anInt8672 * i_2, false);
            Stream stream_4 = new Stream(nativeheapbuffer_3);
            Node_Sub3[] arr_5 = new Node_Sub3[anInt8672];
            int i_6 = Class51.method1072(anInt8672 / 4);
            if (i_6 < 1) {
                i_6 = 1;
            }

            HashTable class453_7 = new HashTable(i_6);
            Node_Sub3[] arr_8 = new Node_Sub3[anInt8659];

            int i_9;
            int i_64;
            for (i_9 = 0; i_9 < width; i_9++) {
                for (i_64 = 0; i_64 < length; i_64++) {
                    if (tileColours[i_9][i_64] != null) {
                        Node_Sub3[] arr_65 = materials[i_9][i_64];
                        int[] ints_12 = tileXOffsets[i_9][i_64];
                        int[] ints_67 = tileZOffsets[i_9][i_64];
                        int[] ints_68 = tileBlendColours[i_9][i_64];
                        int[] ints_69 = tileColours[i_9][i_64];
                        int[] ints_70 = anIntArrayArrayArray8649 != null ? anIntArrayArrayArray8649[i_9][i_64] : null;
                        int[] ints_17 = anIntArrayArrayArray8662 != null ? anIntArrayArrayArray8662[i_9][i_64] : null;
                        if (ints_68 == null) {
                            ints_68 = ints_69;
                        }

                        float f_71 = lightingX[i_9][i_64];
                        float f_72 = lightingY[i_9][i_64];
                        float f_73 = lightingZ[i_9][i_64];
                        float f_21 = lightingX[i_9][i_64 + 1];
                        float f_22 = lightingY[i_9][i_64 + 1];
                        float f_23 = lightingZ[i_9][i_64 + 1];
                        float f_24 = lightingX[i_9 + 1][i_64 + 1];
                        float f_25 = lightingY[i_9 + 1][i_64 + 1];
                        float f_26 = lightingZ[i_9 + 1][i_64 + 1];
                        float f_27 = lightingX[i_9 + 1][i_64];
                        float f_28 = lightingY[i_9 + 1][i_64];
                        float f_29 = lightingZ[i_9 + 1][i_64];
                        int i_30 = bytes_1[i_9][i_64] & 0xff;
                        int i_31 = bytes_1[i_9][i_64 + 1] & 0xff;
                        int i_32 = bytes_1[i_9 + 1][i_64 + 1] & 0xff;
                        int i_33 = bytes_1[i_9 + 1][i_64] & 0xff;
                        int i_34 = 0;

                        int i_37;
                        label439:
                        for (int i_35 = 0; i_35 < ints_69.length; i_35++) {
                            Node_Sub3 class282_sub3_76 = arr_65[i_35];

                            for (i_37 = 0; i_37 < i_34; i_37++) {
                                if (arr_8[i_37] == class282_sub3_76) {
                                    continue label439;
                                }
                            }

                            arr_8[i_34++] = class282_sub3_76;
                        }

                        short[] shorts_74 = materialIndices[i_64 * width + i_9] = new short[ints_69.length];

                        for (int i_36 = 0; i_36 < ints_69.length; i_36++) {
                            i_37 = (i_9 << tileScale) + ints_12[i_36];
                            int i_38 = (i_64 << tileScale) + ints_67[i_36];
                            int i_39 = i_37 >> quarterTileScale;
                            int i_40 = i_38 >> quarterTileScale;
                            int i_41 = ints_69[i_36];
                            int i_42 = ints_68[i_36];
                            int i_43 = ints_70 != null ? ints_70[i_36] : 0;
                            long long_44 = (long) i_42 << 48 | (long) i_41 << 32 | (i_39 << 16) | i_40;
                            int i_46 = ints_12[i_36];
                            int i_47 = ints_67[i_36];
                            byte b_48 = 74;
                            int i_49 = 0;
                            float f_50 = 1.0F;
                            float f_51;
                            float f_52;
                            float f_53;
                            float f_58;
                            int i_82;
                            if (i_46 == 0 && i_47 == 0) {
                                f_51 = f_71;
                                f_52 = f_72;
                                f_53 = f_73;
                                i_82 = b_48 - i_30;
                            } else if (i_46 == 0 && i_47 == tileUnits) {
                                f_51 = f_21;
                                f_52 = f_22;
                                f_53 = f_23;
                                i_82 = b_48 - i_31;
                            } else if (i_46 == tileUnits && i_47 == tileUnits) {
                                f_51 = f_24;
                                f_52 = f_25;
                                f_53 = f_26;
                                i_82 = b_48 - i_32;
                            } else if (i_46 == tileUnits && i_47 == 0) {
                                f_51 = f_27;
                                f_52 = f_28;
                                f_53 = f_29;
                                i_82 = b_48 - i_33;
                            } else {
                                float f_54 = (float) i_46 / (tileUnits);
                                float f_55 = (float) i_47 / (tileUnits);
                                float f_56 = f_71 + (f_27 - f_71) * f_54;
                                float f_57 = f_72 + (f_28 - f_72) * f_54;
                                f_58 = f_73 + (f_29 - f_73) * f_54;
                                float f_59 = f_21 + (f_24 - f_21) * f_54;
                                float f_60 = f_22 + (f_25 - f_22) * f_54;
                                float f_61 = f_23 + (f_26 - f_23) * f_54;
                                f_51 = f_56 + (f_59 - f_56) * f_55;
                                f_52 = f_57 + (f_60 - f_57) * f_55;
                                f_53 = f_58 + (f_61 - f_58) * f_55;
                                int i_62 = i_30 + ((i_33 - i_30) * i_46 >> tileScale);
                                int i_63 = i_31 + ((i_32 - i_31) * i_46 >> tileScale);
                                i_82 = b_48 - (i_62 + ((i_63 - i_62) * i_47 >> tileScale));
                            }

                            if (i_41 != -1) {
                                int i_83 = (i_41 & 0x7f) * i_82 >> 7;
                                if (i_83 < 2) {
                                    i_83 = 2;
                                } else if (i_83 > 126) {
                                    i_83 = 126;
                                }

                                i_49 = Class540.anIntArray7136[i_41 & 0xff80 | i_83];
                                if ((flags & 0x7) == 0) {
                                    f_50 = renderer.aFloatArray8426[0] * f_51 + renderer.aFloatArray8426[1] * f_52 + renderer.aFloatArray8426[2] * f_53;
                                    f_50 = renderer.aFloat8432 + f_50 * (f_50 > 0.0F ? renderer.aFloat8433 : renderer.aFloat8434);
                                }
                            }

                            Node node_77 = null;
                            if ((i_37 & quartertileUnits - 1) == 0 && (i_38 & quartertileUnits - 1) == 0) {
                                node_77 = class453_7.get(long_44);
                            }

                            int i_84;
                            int i_85;
                            if (node_77 == null) {
                                if (i_42 != i_41) {
                                    int i_86 = (i_42 & 0x7f) * i_82 >> 7;
                                    if (i_86 < 2) {
                                        i_86 = 2;
                                    } else if (i_86 > 126) {
                                        i_86 = 126;
                                    }

                                    i_85 = Class540.anIntArray7136[i_42 & 0xff80 | i_86];
                                    if ((flags & 0x7) == 0) {
                                        float f_10000 = renderer.aFloatArray8426[0] * f_51 + renderer.aFloatArray8426[1] * f_52 + renderer.aFloatArray8426[2] * f_53;
                                        f_58 = renderer.aFloat8432 + f_50 * (f_50 > 0.0F ? renderer.aFloat8433 : renderer.aFloat8434);
                                        int i_87 = i_85 >> 16 & 0xff;
                                        int i_88 = i_85 >> 8 & 0xff;
                                        int i_89 = i_85 & 0xff;
                                        i_87 = (int) (i_87 * f_58);
                                        if (i_87 < 0) {
                                            i_87 = 0;
                                        } else if (i_87 > 255) {
                                            i_87 = 255;
                                        }

                                        i_88 = (int) (i_88 * f_58);
                                        if (i_88 < 0) {
                                            i_88 = 0;
                                        } else if (i_88 > 255) {
                                            i_88 = 255;
                                        }

                                        i_89 = (int) (i_89 * f_58);
                                        if (i_89 < 0) {
                                            i_89 = 0;
                                        } else if (i_89 > 255) {
                                            i_89 = 255;
                                        }

                                        i_85 = i_87 << 16 | i_88 << 8 | i_89;
                                    }
                                } else {
                                    i_85 = i_49;
                                }

                                if (renderer.aBool8467) {
                                    stream_4.method2923(i_37);
                                    stream_4.method2923((averageHeight(i_37, i_38) + i_43));
                                    stream_4.method2923(i_38);
                                    stream_4.method2920((byte) (i_85 >> 16));
                                    stream_4.method2920((byte) (i_85 >> 8));
                                    stream_4.method2920((byte) i_85);
                                    stream_4.method2920(-1);
                                    stream_4.method2923(i_37);
                                    stream_4.method2923(i_38);
                                    if (anIntArrayArrayArray8662 != null) {
                                        stream_4.method2923(ints_17 != null ? (ints_17[i_36] - 1) : 0.0F);
                                    }

                                    if ((flags & 0x7) != 0) {
                                        stream_4.method2923(f_51);
                                        stream_4.method2923(f_52);
                                        stream_4.method2923(f_53);
                                    }
                                } else {
                                    stream_4.method2924(i_37);
                                    stream_4.method2924((averageHeight(i_37, i_38) + i_43));
                                    stream_4.method2924(i_38);
                                    stream_4.method2920((byte) (i_85 >> 16));
                                    stream_4.method2920((byte) (i_85 >> 8));
                                    stream_4.method2920((byte) i_85);
                                    stream_4.method2920(-1);
                                    stream_4.method2924(i_37);
                                    stream_4.method2924(i_38);
                                    if (anIntArrayArrayArray8662 != null) {
                                        stream_4.method2924(ints_17 != null ? (ints_17[i_36] - 1) : 0.0F);
                                    }

                                    if ((flags & 0x7) != 0) {
                                        stream_4.method2924(f_51);
                                        stream_4.method2924(f_52);
                                        stream_4.method2924(f_53);
                                    }
                                }

                                i_84 = anInt8657++;
                                shorts_74[i_36] = (short) i_84;
                                if (i_41 != -1) {
                                    arr_5[i_84] = arr_65[i_36];
                                }

                                class453_7.put(new Node_Sub46(shorts_74[i_36]), long_44);
                            } else {
                                shorts_74[i_36] = ((Node_Sub46) node_77).aShort8067;
                                i_84 = shorts_74[i_36] & 0xffff;
                                if (i_41 != -1 && arr_65[i_36].pointer < arr_5[i_84].pointer) {
                                    arr_5[i_84] = arr_65[i_36];
                                }
                            }

                            for (i_85 = 0; i_85 < i_34; i_85++) {
                                arr_8[i_85].method12083(i_84, i_49, i_82, f_50);
                            }

                            ++anInt8654;
                        }
                    }
                }
            }

            for (i_9 = 0; i_9 < anInt8657; i_9++) {
                Node_Sub3 class282_sub3_10 = arr_5[i_9];
                if (class282_sub3_10 != null) {
                    class282_sub3_10.method12081(i_9);
                }
            }

            for (i_9 = 0; i_9 < width; i_9++) {
                for (i_64 = 0; i_64 < length; i_64++) {
                    short[] shorts_90 = materialIndices[i_64 * width + i_9];
                    if (shorts_90 != null) {
                        int i_66 = 0;

                        for (int i_13 = 0; i_13 < shorts_90.length; i_66++) {
                            int i_14 = shorts_90[i_13++] & 0xffff;
                            int i_15 = shorts_90[i_13++] & 0xffff;
                            int i_16 = shorts_90[i_13++] & 0xffff;
                            Node_Sub3 class282_sub3_81 = arr_5[i_14];
                            Node_Sub3 class282_sub3_18 = arr_5[i_15];
                            Node_Sub3 class282_sub3_19 = arr_5[i_16];
                            Node_Sub3 class282_sub3_20 = null;
                            if (class282_sub3_81 != null) {
                                class282_sub3_81.method12082(i_9, i_64, i_66);
                                class282_sub3_20 = class282_sub3_81;
                            }

                            if (class282_sub3_18 != null) {
                                class282_sub3_18.method12082(i_9, i_64, i_66);
                                if (class282_sub3_20 == null || class282_sub3_18.pointer < class282_sub3_20.pointer) {
                                    class282_sub3_20 = class282_sub3_18;
                                }
                            }

                            if (class282_sub3_19 != null) {
                                class282_sub3_19.method12082(i_9, i_64, i_66);
                                if (class282_sub3_20 == null || class282_sub3_19.pointer < class282_sub3_20.pointer) {
                                    class282_sub3_20 = class282_sub3_19;
                                }
                            }

                            if (class282_sub3_20 != null) {
                                if (class282_sub3_81 != null) {
                                    class282_sub3_20.method12081(i_14);
                                }

                                if (class282_sub3_18 != null) {
                                    class282_sub3_20.method12081(i_15);
                                }

                                if (class282_sub3_19 != null) {
                                    class282_sub3_20.method12081(i_16);
                                }

                                class282_sub3_20.method12082(i_9, i_64, i_66);
                            }
                        }
                    }
                }
            }

            stream_4.method2925();
            data = renderer.createArrayBuffer(i_2, nativeheapbuffer_3, stream_4.written());
            if (data instanceof Class135_Sub2) {
                nativeheapbuffer_3.method1178();
            }

            vertexPointer = new OpenGlArrayBufferPointer(data, 5126, 3, 0);
            colourPointer = new OpenGlArrayBufferPointer(data, 5121, 4, 12);
            byte b_79;
            if (anIntArrayArrayArray8662 != null) {
                texturePointer = new OpenGlArrayBufferPointer(data, 5126, 3, 16);
                b_79 = 28;
            } else {
                texturePointer = new OpenGlArrayBufferPointer(data, 5126, 2, 16);
                b_79 = 24;
            }

            if ((flags & 0x7) != 0) {
                normalPointer = new OpenGlArrayBufferPointer(data, 5126, 3, b_79);
            }

            long[] longs_78 = new long[aNodeArray8666.length];

            for (int i_11 = 0; i_11 < aNodeArray8666.length; i_11++) {
                Node_Sub3 class282_sub3_80 = (Node_Sub3) aNodeArray8666[i_11];
                longs_78[i_11] = class282_sub3_80.pointer;
                class282_sub3_80.method12087(anInt8657);
            }

            Class214.method3669(longs_78, aNodeArray8666);
            if (aClass130_8664 != null) {
                aClass130_8664.method2309();
            }
        } else {
            aClass130_8664 = null;
        }

        if ((anInt8651 & 0x2) == 0) {
            tileZOffsets = null;
            tileXOffsets = null;
            tileColours = null;
        }

        anIntArrayArrayArray8662 = null;
        tileBlendColours = null;
        anIntArrayArrayArray8649 = null;
        materials = null;
        shadowing = null;
        materialTable = null;
        lightingZ = null;
        lightingY = null;
        lightingX = null;
    }

    @Override
    public void e() {
        if (anInt8672 > 0) {
            byte[][] bytes_1 = new byte[width + 1][length + 1];

            int i_2;
            for (i_2 = 1; i_2 < width; i_2++) {
                for (int i_75 = 1; i_75 < length; i_75++) {
                    bytes_1[i_2][i_75] = (byte) ((shadowing[i_2 - 1][i_75] >> 2) + (shadowing[i_2 + 1][i_75] >> 3) + (shadowing[i_2][i_75 - 1] >> 2) + (shadowing[i_2][i_75 + 1] >> 3) + (shadowing[i_2][i_75] >> 1));
                }
            }

            aNodeArray8666 = new Node[materialTable.method7540()];
            materialTable.values(aNodeArray8666);

            for (i_2 = 0; i_2 < aNodeArray8666.length; i_2++) {
                ((Node_Sub3) aNodeArray8666[i_2]).method12092(anInt8672);
            }

            i_2 = 24;
            if (anIntArrayArrayArray8662 != null) {
                i_2 += 4;
            }

            if ((flags & 0x7) != 0) {
                i_2 += 12;
            }

            NativeHeapBuffer nativeheapbuffer_3 = renderer.aNativeHeap8445.method759(anInt8672 * i_2, false);
            Stream stream_4 = new Stream(nativeheapbuffer_3);
            Node_Sub3[] arr_5 = new Node_Sub3[anInt8672];
            int i_6 = Class51.method1072(anInt8672 / 4);
            if (i_6 < 1) {
                i_6 = 1;
            }

            HashTable class453_7 = new HashTable(i_6);
            Node_Sub3[] arr_8 = new Node_Sub3[anInt8659];

            int i_9;
            int i_64;
            for (i_9 = 0; i_9 < width; i_9++) {
                for (i_64 = 0; i_64 < length; i_64++) {
                    if (tileColours[i_9][i_64] != null) {
                        Node_Sub3[] arr_65 = materials[i_9][i_64];
                        int[] ints_12 = tileXOffsets[i_9][i_64];
                        int[] ints_67 = tileZOffsets[i_9][i_64];
                        int[] ints_68 = tileBlendColours[i_9][i_64];
                        int[] ints_69 = tileColours[i_9][i_64];
                        int[] ints_70 = anIntArrayArrayArray8649 != null ? anIntArrayArrayArray8649[i_9][i_64] : null;
                        int[] ints_17 = anIntArrayArrayArray8662 != null ? anIntArrayArrayArray8662[i_9][i_64] : null;
                        if (ints_68 == null) {
                            ints_68 = ints_69;
                        }

                        float f_71 = lightingX[i_9][i_64];
                        float f_72 = lightingY[i_9][i_64];
                        float f_73 = lightingZ[i_9][i_64];
                        float f_21 = lightingX[i_9][i_64 + 1];
                        float f_22 = lightingY[i_9][i_64 + 1];
                        float f_23 = lightingZ[i_9][i_64 + 1];
                        float f_24 = lightingX[i_9 + 1][i_64 + 1];
                        float f_25 = lightingY[i_9 + 1][i_64 + 1];
                        float f_26 = lightingZ[i_9 + 1][i_64 + 1];
                        float f_27 = lightingX[i_9 + 1][i_64];
                        float f_28 = lightingY[i_9 + 1][i_64];
                        float f_29 = lightingZ[i_9 + 1][i_64];
                        int i_30 = bytes_1[i_9][i_64] & 0xff;
                        int i_31 = bytes_1[i_9][i_64 + 1] & 0xff;
                        int i_32 = bytes_1[i_9 + 1][i_64 + 1] & 0xff;
                        int i_33 = bytes_1[i_9 + 1][i_64] & 0xff;
                        int i_34 = 0;

                        int i_37;
                        label439:
                        for (int i_35 = 0; i_35 < ints_69.length; i_35++) {
                            Node_Sub3 class282_sub3_76 = arr_65[i_35];

                            for (i_37 = 0; i_37 < i_34; i_37++) {
                                if (arr_8[i_37] == class282_sub3_76) {
                                    continue label439;
                                }
                            }

                            arr_8[i_34++] = class282_sub3_76;
                        }

                        short[] shorts_74 = materialIndices[i_64 * width + i_9] = new short[ints_69.length];

                        for (int i_36 = 0; i_36 < ints_69.length; i_36++) {
                            i_37 = (i_9 << tileScale) + ints_12[i_36];
                            int i_38 = (i_64 << tileScale) + ints_67[i_36];
                            int i_39 = i_37 >> quarterTileScale;
                            int i_40 = i_38 >> quarterTileScale;
                            int i_41 = ints_69[i_36];
                            int i_42 = ints_68[i_36];
                            int i_43 = ints_70 != null ? ints_70[i_36] : 0;
                            long long_44 = (long) i_42 << 48 | (long) i_41 << 32 | (i_39 << 16) | i_40;
                            int i_46 = ints_12[i_36];
                            int i_47 = ints_67[i_36];
                            byte b_48 = 74;
                            int i_49 = 0;
                            float f_50 = 1.0F;
                            float f_51;
                            float f_52;
                            float f_53;
                            float f_58;
                            int i_82;
                            if (i_46 == 0 && i_47 == 0) {
                                f_51 = f_71;
                                f_52 = f_72;
                                f_53 = f_73;
                                i_82 = b_48 - i_30;
                            } else if (i_46 == 0 && i_47 == tileUnits) {
                                f_51 = f_21;
                                f_52 = f_22;
                                f_53 = f_23;
                                i_82 = b_48 - i_31;
                            } else if (i_46 == tileUnits && i_47 == tileUnits) {
                                f_51 = f_24;
                                f_52 = f_25;
                                f_53 = f_26;
                                i_82 = b_48 - i_32;
                            } else if (i_46 == tileUnits && i_47 == 0) {
                                f_51 = f_27;
                                f_52 = f_28;
                                f_53 = f_29;
                                i_82 = b_48 - i_33;
                            } else {
                                float f_54 = (float) i_46 / (tileUnits);
                                float f_55 = (float) i_47 / (tileUnits);
                                float f_56 = f_71 + (f_27 - f_71) * f_54;
                                float f_57 = f_72 + (f_28 - f_72) * f_54;
                                f_58 = f_73 + (f_29 - f_73) * f_54;
                                float f_59 = f_21 + (f_24 - f_21) * f_54;
                                float f_60 = f_22 + (f_25 - f_22) * f_54;
                                float f_61 = f_23 + (f_26 - f_23) * f_54;
                                f_51 = f_56 + (f_59 - f_56) * f_55;
                                f_52 = f_57 + (f_60 - f_57) * f_55;
                                f_53 = f_58 + (f_61 - f_58) * f_55;
                                int i_62 = i_30 + ((i_33 - i_30) * i_46 >> tileScale);
                                int i_63 = i_31 + ((i_32 - i_31) * i_46 >> tileScale);
                                i_82 = b_48 - (i_62 + ((i_63 - i_62) * i_47 >> tileScale));
                            }

                            if (i_41 != -1) {
                                int i_83 = (i_41 & 0x7f) * i_82 >> 7;
                                if (i_83 < 2) {
                                    i_83 = 2;
                                } else if (i_83 > 126) {
                                    i_83 = 126;
                                }

                                i_49 = Class540.anIntArray7136[i_41 & 0xff80 | i_83];
                                if ((flags & 0x7) == 0) {
                                    f_50 = renderer.aFloatArray8426[0] * f_51 + renderer.aFloatArray8426[1] * f_52 + renderer.aFloatArray8426[2] * f_53;
                                    f_50 = renderer.aFloat8432 + f_50 * (f_50 > 0.0F ? renderer.aFloat8433 : renderer.aFloat8434);
                                }
                            }

                            Node node_77 = null;
                            if ((i_37 & quartertileUnits - 1) == 0 && (i_38 & quartertileUnits - 1) == 0) {
                                node_77 = class453_7.get(long_44);
                            }

                            int i_84;
                            int i_85;
                            if (node_77 == null) {
                                if (i_42 != i_41) {
                                    int i_86 = (i_42 & 0x7f) * i_82 >> 7;
                                    if (i_86 < 2) {
                                        i_86 = 2;
                                    } else if (i_86 > 126) {
                                        i_86 = 126;
                                    }

                                    i_85 = Class540.anIntArray7136[i_42 & 0xff80 | i_86];
                                    if ((flags & 0x7) == 0) {
                                        float f_10000 = renderer.aFloatArray8426[0] * f_51 + renderer.aFloatArray8426[1] * f_52 + renderer.aFloatArray8426[2] * f_53;
                                        f_58 = renderer.aFloat8432 + f_50 * (f_50 > 0.0F ? renderer.aFloat8433 : renderer.aFloat8434);
                                        int i_87 = i_85 >> 16 & 0xff;
                                        int i_88 = i_85 >> 8 & 0xff;
                                        int i_89 = i_85 & 0xff;
                                        i_87 = (int) (i_87 * f_58);
                                        if (i_87 < 0) {
                                            i_87 = 0;
                                        } else if (i_87 > 255) {
                                            i_87 = 255;
                                        }

                                        i_88 = (int) (i_88 * f_58);
                                        if (i_88 < 0) {
                                            i_88 = 0;
                                        } else if (i_88 > 255) {
                                            i_88 = 255;
                                        }

                                        i_89 = (int) (i_89 * f_58);
                                        if (i_89 < 0) {
                                            i_89 = 0;
                                        } else if (i_89 > 255) {
                                            i_89 = 255;
                                        }

                                        i_85 = i_87 << 16 | i_88 << 8 | i_89;
                                    }
                                } else {
                                    i_85 = i_49;
                                }

                                if (renderer.aBool8467) {
                                    stream_4.method2923(i_37);
                                    stream_4.method2923((averageHeight(i_37, i_38) + i_43));
                                    stream_4.method2923(i_38);
                                    stream_4.method2920((byte) (i_85 >> 16));
                                    stream_4.method2920((byte) (i_85 >> 8));
                                    stream_4.method2920((byte) i_85);
                                    stream_4.method2920(-1);
                                    stream_4.method2923(i_37);
                                    stream_4.method2923(i_38);
                                    if (anIntArrayArrayArray8662 != null) {
                                        stream_4.method2923(ints_17 != null ? (ints_17[i_36] - 1) : 0.0F);
                                    }

                                    if ((flags & 0x7) != 0) {
                                        stream_4.method2923(f_51);
                                        stream_4.method2923(f_52);
                                        stream_4.method2923(f_53);
                                    }
                                } else {
                                    stream_4.method2924(i_37);
                                    stream_4.method2924((averageHeight(i_37, i_38) + i_43));
                                    stream_4.method2924(i_38);
                                    stream_4.method2920((byte) (i_85 >> 16));
                                    stream_4.method2920((byte) (i_85 >> 8));
                                    stream_4.method2920((byte) i_85);
                                    stream_4.method2920(-1);
                                    stream_4.method2924(i_37);
                                    stream_4.method2924(i_38);
                                    if (anIntArrayArrayArray8662 != null) {
                                        stream_4.method2924(ints_17 != null ? (ints_17[i_36] - 1) : 0.0F);
                                    }

                                    if ((flags & 0x7) != 0) {
                                        stream_4.method2924(f_51);
                                        stream_4.method2924(f_52);
                                        stream_4.method2924(f_53);
                                    }
                                }

                                i_84 = anInt8657++;
                                shorts_74[i_36] = (short) i_84;
                                if (i_41 != -1) {
                                    arr_5[i_84] = arr_65[i_36];
                                }

                                class453_7.put(new Node_Sub46(shorts_74[i_36]), long_44);
                            } else {
                                shorts_74[i_36] = ((Node_Sub46) node_77).aShort8067;
                                i_84 = shorts_74[i_36] & 0xffff;
                                if (i_41 != -1 && arr_65[i_36].pointer < arr_5[i_84].pointer) {
                                    arr_5[i_84] = arr_65[i_36];
                                }
                            }

                            for (i_85 = 0; i_85 < i_34; i_85++) {
                                arr_8[i_85].method12083(i_84, i_49, i_82, f_50);
                            }

                            ++anInt8654;
                        }
                    }
                }
            }

            for (i_9 = 0; i_9 < anInt8657; i_9++) {
                Node_Sub3 class282_sub3_10 = arr_5[i_9];
                if (class282_sub3_10 != null) {
                    class282_sub3_10.method12081(i_9);
                }
            }

            for (i_9 = 0; i_9 < width; i_9++) {
                for (i_64 = 0; i_64 < length; i_64++) {
                    short[] shorts_90 = materialIndices[i_64 * width + i_9];
                    if (shorts_90 != null) {
                        int i_66 = 0;

                        for (int i_13 = 0; i_13 < shorts_90.length; i_66++) {
                            int i_14 = shorts_90[i_13++] & 0xffff;
                            int i_15 = shorts_90[i_13++] & 0xffff;
                            int i_16 = shorts_90[i_13++] & 0xffff;
                            Node_Sub3 class282_sub3_81 = arr_5[i_14];
                            Node_Sub3 class282_sub3_18 = arr_5[i_15];
                            Node_Sub3 class282_sub3_19 = arr_5[i_16];
                            Node_Sub3 class282_sub3_20 = null;
                            if (class282_sub3_81 != null) {
                                class282_sub3_81.method12082(i_9, i_64, i_66);
                                class282_sub3_20 = class282_sub3_81;
                            }

                            if (class282_sub3_18 != null) {
                                class282_sub3_18.method12082(i_9, i_64, i_66);
                                if (class282_sub3_20 == null || class282_sub3_18.pointer < class282_sub3_20.pointer) {
                                    class282_sub3_20 = class282_sub3_18;
                                }
                            }

                            if (class282_sub3_19 != null) {
                                class282_sub3_19.method12082(i_9, i_64, i_66);
                                if (class282_sub3_20 == null || class282_sub3_19.pointer < class282_sub3_20.pointer) {
                                    class282_sub3_20 = class282_sub3_19;
                                }
                            }

                            if (class282_sub3_20 != null) {
                                if (class282_sub3_81 != null) {
                                    class282_sub3_20.method12081(i_14);
                                }

                                if (class282_sub3_18 != null) {
                                    class282_sub3_20.method12081(i_15);
                                }

                                if (class282_sub3_19 != null) {
                                    class282_sub3_20.method12081(i_16);
                                }

                                class282_sub3_20.method12082(i_9, i_64, i_66);
                            }
                        }
                    }
                }
            }

            stream_4.method2925();
            data = renderer.createArrayBuffer(i_2, nativeheapbuffer_3, stream_4.written());
            if (data instanceof Class135_Sub2) {
                nativeheapbuffer_3.method1178();
            }

            vertexPointer = new OpenGlArrayBufferPointer(data, 5126, 3, 0);
            colourPointer = new OpenGlArrayBufferPointer(data, 5121, 4, 12);
            byte b_79;
            if (anIntArrayArrayArray8662 != null) {
                texturePointer = new OpenGlArrayBufferPointer(data, 5126, 3, 16);
                b_79 = 28;
            } else {
                texturePointer = new OpenGlArrayBufferPointer(data, 5126, 2, 16);
                b_79 = 24;
            }

            if ((flags & 0x7) != 0) {
                normalPointer = new OpenGlArrayBufferPointer(data, 5126, 3, b_79);
            }

            long[] longs_78 = new long[aNodeArray8666.length];

            for (int i_11 = 0; i_11 < aNodeArray8666.length; i_11++) {
                Node_Sub3 class282_sub3_80 = (Node_Sub3) aNodeArray8666[i_11];
                longs_78[i_11] = class282_sub3_80.pointer;
                class282_sub3_80.method12087(anInt8657);
            }

            Class214.method3669(longs_78, aNodeArray8666);
            if (aClass130_8664 != null) {
                aClass130_8664.method2309();
            }
        } else {
            aClass130_8664 = null;
        }

        if ((anInt8651 & 0x2) == 0) {
            tileZOffsets = null;
            tileXOffsets = null;
            tileColours = null;
        }

        anIntArrayArrayArray8662 = null;
        tileBlendColours = null;
        anIntArrayArrayArray8649 = null;
        materials = null;
        shadowing = null;
        materialTable = null;
        lightingZ = null;
        lightingY = null;
        lightingX = null;
    }

    @Override
    public Shadow s(int i_1, int i_2, Shadow class282_sub50_sub17_3) {
        if ((shadowFlags[i_1][i_2] & 0x1) == 0) {
            return null;
        } else {
            int i_4 = tileUnits >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_5 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_3;
            CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_6;
            if (class282_sub50_sub17_sub1_5 != null && class282_sub50_sub17_sub1_5.method15716(i_4, i_4)) {
                class282_sub50_sub17_sub1_6 = class282_sub50_sub17_sub1_5;
                class282_sub50_sub17_sub1_5.method15712();
            } else {
                class282_sub50_sub17_sub1_6 = new CacheableNode_Sub17_Sub1(i_4, i_4);
            }

            class282_sub50_sub17_sub1_6.method15721(0, 0, i_4, i_4);
            method13879(class282_sub50_sub17_sub1_6, i_1, i_2);
            return class282_sub50_sub17_sub1_6;
        }
    }

    @Override
    public void u(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            aClass130_8664.method2314(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public boolean method6718(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            return aClass130_8664.method2293(class282_sub50_sub17_1, i_7, i_8);
        } else {
            return false;
        }
    }

    @Override
    public boolean method6719(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            return aClass130_8664.method2293(class282_sub50_sub17_1, i_7, i_8);
        } else {
            return false;
        }
    }

    @Override
    public void d(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            aClass130_8664.method2313(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public void a(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            aClass130_8664.method2313(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public void method6710(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
        Class158 class158_9 = renderer.method8523();
        if (anInt8672 > 0 && class158_9 != null) {
            renderer.method13586();
            renderer.method13642(false);
            renderer.method13620(false);
            renderer.enableDepthTest(false);
            renderer.method13623(false);
            renderer.setColorRenderType(0);
            renderer.method13581(-2);
            renderer.setTexture(null);
            GROUND_MATRIX[0] = i_3 / (128.0F * (tileUnits) * class158_9.method2714());
            GROUND_MATRIX[1] = 0.0F;
            GROUND_MATRIX[2] = 0.0F;
            GROUND_MATRIX[3] = 0.0F;
            GROUND_MATRIX[4] = 0.0F;
            GROUND_MATRIX[5] = i_3 / (128.0F * (tileUnits) * class158_9.method2716());
            GROUND_MATRIX[6] = 0.0F;
            GROUND_MATRIX[7] = 0.0F;
            GROUND_MATRIX[8] = 0.0F;
            GROUND_MATRIX[9] = 0.0F;
            GROUND_MATRIX[10] = 0.0F;
            GROUND_MATRIX[11] = 0.0F;
            GROUND_MATRIX[12] = -1.0f - ((i_4 * i_3) / 128.0F - (i_1 * 2)) / class158_9.method2714();
            GROUND_MATRIX[13] = 1.0F - ((2 * i_2) + (i_7 * i_3) / 128.0F) / class158_9.method2716();
            GROUND_MATRIX[14] = 0.0F;
            GROUND_MATRIX[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);
            GROUND_MATRIX[0] = 1.0F;
            GROUND_MATRIX[1] = 0.0F;
            GROUND_MATRIX[2] = 0.0F;
            GROUND_MATRIX[3] = 0.0F;
            GROUND_MATRIX[4] = 0.0F;
            GROUND_MATRIX[5] = 0.0F;
            GROUND_MATRIX[6] = 1.0F;
            GROUND_MATRIX[7] = 0.0F;
            GROUND_MATRIX[8] = 0.0F;
            GROUND_MATRIX[9] = 1.0F;
            GROUND_MATRIX[10] = 0.0F;
            GROUND_MATRIX[11] = 0.0F;
            GROUND_MATRIX[12] = 0.0F;
            GROUND_MATRIX[13] = 0.0F;
            GROUND_MATRIX[14] = 0.0F;
            GROUND_MATRIX[15] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);
            if ((flags & 0x7) != 0) {
                renderer.method13620(true);
                renderer.positionLights();
            } else {
                renderer.method13620(false);
            }

            renderer.method13647(vertexPointer, normalPointer, colourPointer, texturePointer);
            if (renderer.aNode_Sub35_Sub1_8499.buffer.length < anInt8654 * 2) {
                renderer.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1(anInt8654 * 2);
            } else {
                renderer.aNode_Sub35_Sub1_8499.index = 0;
            }

            int i_10 = 0;
            Node_Sub35_Sub1 class282_sub35_sub1_11 = renderer.aNode_Sub35_Sub1_8499;
            int i_12;
            int i_13;
            int i_14;
            short[] shorts_15;
            int i_16;
            if (renderer.aBool8467) {
                for (i_12 = i_5; i_12 < i_7; i_12++) {
                    i_13 = i_12 * width + i_4;

                    for (i_14 = i_4; i_14 < i_6; i_14++) {
                        if (bools_8[i_14 - i_4][i_12 - i_5]) {
                            shorts_15 = materialIndices[i_13];
                            if (shorts_15 != null) {
                                for (i_16 = 0; i_16 < shorts_15.length; i_16++) {
                                    class282_sub35_sub1_11.writeShort(shorts_15[i_16] & 0xffff);
                                    ++i_10;
                                }
                            }
                        }

                        ++i_13;
                    }
                }
            } else {
                for (i_12 = i_5; i_12 < i_7; i_12++) {
                    i_13 = i_12 * width + i_4;

                    for (i_14 = i_4; i_14 < i_6; i_14++) {
                        if (bools_8[i_14 - i_4][i_12 - i_5]) {
                            shorts_15 = materialIndices[i_13];
                            if (shorts_15 != null) {
                                for (i_16 = 0; i_16 < shorts_15.length; i_16++) {
                                    class282_sub35_sub1_11.writeLEShort(shorts_15[i_16] & 0xffff);
                                    ++i_10;
                                }
                            }
                        }

                        ++i_13;
                    }
                }
            }

            if (i_10 > 0) {
                Class131_Sub2 class131_sub2_17 = new Class131_Sub2(renderer, class282_sub35_sub1_11.buffer, class282_sub35_sub1_11.index);
                renderer.method13611(class131_sub2_17, 0, i_10);
            }
        }

    }

    @Override
    public void z(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            aClass130_8664.method2313(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public void method6717(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5) {
        method13881(i_1, i_2, i_3, bools_4, bool_5);
    }

    @Override
    public void method6720(GLLight class282_sub24_1, int[] ints_2) {
        aClass473_8673.insertBack(new Node_Sub19(renderer, this, class282_sub24_1, ints_2));
    }

    @Override
    public void method6711(GLLight class282_sub24_1, int[] ints_2) {
        aClass473_8673.insertBack(new Node_Sub19(renderer, this, class282_sub24_1, ints_2));
    }

    @Override
    public Shadow w(int i_1, int i_2, Shadow class282_sub50_sub17_3) {
        if ((shadowFlags[i_1][i_2] & 0x1) == 0) {
            return null;
        } else {
            int i_4 = tileUnits >> renderer.anInt8473;
            CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_5 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_3;
            CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_6;
            if (class282_sub50_sub17_sub1_5 != null && class282_sub50_sub17_sub1_5.method15716(i_4, i_4)) {
                class282_sub50_sub17_sub1_6 = class282_sub50_sub17_sub1_5;
                class282_sub50_sub17_sub1_5.method15712();
            } else {
                class282_sub50_sub17_sub1_6 = new CacheableNode_Sub17_Sub1(i_4, i_4);
            }

            class282_sub50_sub17_sub1_6.method15721(0, 0, i_4, i_4);
            method13879(class282_sub50_sub17_sub1_6, i_1, i_2);
            return class282_sub50_sub17_sub1_6;
        }
    }

    @Override
    public void method6723(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
        Class158 class158_9 = renderer.method8523();
        if (anInt8672 > 0 && class158_9 != null) {
            renderer.method13586();
            renderer.method13642(false);
            renderer.method13620(false);
            renderer.enableDepthTest(false);
            renderer.method13623(false);
            renderer.setColorRenderType(0);
            renderer.method13581(-2);
            renderer.setTexture(null);
            GROUND_MATRIX[0] = i_3 / (128.0F * (tileUnits) * class158_9.method2714());
            GROUND_MATRIX[1] = 0.0F;
            GROUND_MATRIX[2] = 0.0F;
            GROUND_MATRIX[3] = 0.0F;
            GROUND_MATRIX[4] = 0.0F;
            GROUND_MATRIX[5] = i_3 / (128.0F * (tileUnits) * class158_9.method2716());
            GROUND_MATRIX[6] = 0.0F;
            GROUND_MATRIX[7] = 0.0F;
            GROUND_MATRIX[8] = 0.0F;
            GROUND_MATRIX[9] = 0.0F;
            GROUND_MATRIX[10] = 0.0F;
            GROUND_MATRIX[11] = 0.0F;
            GROUND_MATRIX[12] = -1.0f - ((i_4 * i_3) / 128.0F - (i_1 * 2)) / class158_9.method2714();
            GROUND_MATRIX[13] = 1.0F - ((2 * i_2) + (i_7 * i_3) / 128.0F) / class158_9.method2716();
            GROUND_MATRIX[14] = 0.0F;
            GROUND_MATRIX[15] = 1.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);
            GROUND_MATRIX[0] = 1.0F;
            GROUND_MATRIX[1] = 0.0F;
            GROUND_MATRIX[2] = 0.0F;
            GROUND_MATRIX[3] = 0.0F;
            GROUND_MATRIX[4] = 0.0F;
            GROUND_MATRIX[5] = 0.0F;
            GROUND_MATRIX[6] = 1.0F;
            GROUND_MATRIX[7] = 0.0F;
            GROUND_MATRIX[8] = 0.0F;
            GROUND_MATRIX[9] = 1.0F;
            GROUND_MATRIX[10] = 0.0F;
            GROUND_MATRIX[11] = 0.0F;
            GROUND_MATRIX[12] = 0.0F;
            GROUND_MATRIX[13] = 0.0F;
            GROUND_MATRIX[14] = 0.0F;
            GROUND_MATRIX[15] = 1.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);
            if ((flags & 0x7) != 0) {
                renderer.method13620(true);
                renderer.positionLights();
            } else {
                renderer.method13620(false);
            }

            renderer.method13647(vertexPointer, normalPointer, colourPointer, texturePointer);
            if (renderer.aNode_Sub35_Sub1_8499.buffer.length < anInt8654 * 2) {
                renderer.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1(anInt8654 * 2);
            } else {
                renderer.aNode_Sub35_Sub1_8499.index = 0;
            }

            int i_10 = 0;
            Node_Sub35_Sub1 class282_sub35_sub1_11 = renderer.aNode_Sub35_Sub1_8499;
            int i_12;
            int i_13;
            int i_14;
            short[] shorts_15;
            int i_16;
            if (renderer.aBool8467) {
                for (i_12 = i_5; i_12 < i_7; i_12++) {
                    i_13 = i_12 * width + i_4;

                    for (i_14 = i_4; i_14 < i_6; i_14++) {
                        if (bools_8[i_14 - i_4][i_12 - i_5]) {
                            shorts_15 = materialIndices[i_13];
                            if (shorts_15 != null) {
                                for (i_16 = 0; i_16 < shorts_15.length; i_16++) {
                                    class282_sub35_sub1_11.writeShort(shorts_15[i_16] & 0xffff);
                                    ++i_10;
                                }
                            }
                        }

                        ++i_13;
                    }
                }
            } else {
                for (i_12 = i_5; i_12 < i_7; i_12++) {
                    i_13 = i_12 * width + i_4;

                    for (i_14 = i_4; i_14 < i_6; i_14++) {
                        if (bools_8[i_14 - i_4][i_12 - i_5]) {
                            shorts_15 = materialIndices[i_13];
                            if (shorts_15 != null) {
                                for (i_16 = 0; i_16 < shorts_15.length; i_16++) {
                                    class282_sub35_sub1_11.writeLEShort(shorts_15[i_16] & 0xffff);
                                    ++i_10;
                                }
                            }
                        }

                        ++i_13;
                    }
                }
            }

            if (i_10 > 0) {
                Class131_Sub2 class131_sub2_17 = new Class131_Sub2(renderer, class282_sub35_sub1_11.buffer, class282_sub35_sub1_11.index);
                renderer.method13611(class131_sub2_17, 0, i_10);
            }
        }

    }

    @Override
    public void b(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        if (aClass130_8664 != null && class282_sub50_sub17_1 != null) {
            int i_7 = i_2 - (i_3 * renderer.anInt8438 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            int i_8 = i_4 - (i_3 * renderer.anInt8439 >> 8) >> renderer.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
            aClass130_8664.method2313(class282_sub50_sub17_1, i_7, i_8);
        }

    }

    @Override
    public void method6721(GLLight class282_sub24_1, int[] ints_2) {
        aClass473_8673.insertBack(new Node_Sub19(renderer, this, class282_sub24_1, ints_2));
    }

}
