package com.jagex;

public class Ground_Sub3 extends Ground {

    Class178[][] aClass178ArrayArray9352;
    Class183[][] aClass183ArrayArray9332;
    Class177[][] aClass177ArrayArray9336;
    Class196[][] aClass196ArrayArray9337;
    Class181[][] aClass181ArrayArray9335;
    byte[][] aByteArrayArray9355;
    byte[][] aByteArrayArray9356;
    float aFloat9338;
    float aFloat9340;
    float aFloat9341;
    float aFloat9342;
    float aFloat9343;
    float aFloat9344;
    float aFloat9334;
    float aFloat9346;
    float aFloat9339;
    float aFloat9327;
    float aFloat9349;
    float aFloat9350;
    float aFloat9351;
    float aFloat9328;
    float aFloat9333;
    float aFloat9354;
    JavaRenderer aGraphicalRenderer_Sub3_9353;
    int anInt9345;

    Ground_Sub3(JavaRenderer hardwarerenderer_1, int i_3, int i_4, int i_5, int[][] ints_6, int[][] ints_7, int i_8) {
        super(i_4, i_5, i_8, ints_6);
        aGraphicalRenderer_Sub3_9353 = hardwarerenderer_1;
        anInt9345 = i_3;
        aByteArrayArray9355 = new byte[i_4 + 1][i_5 + 1];
        int i_9 = aGraphicalRenderer_Sub3_9353.anInt8992 >> 9;

        for (int i_10 = 1; i_10 < i_5; i_10++) {
            for (int i_11 = 1; i_11 < i_4; i_11++) {
                int i_13 = ints_7[i_11 + 1][i_10] - ints_7[i_11 - 1][i_10];
                int i_14 = ints_7[i_11][i_10 + 1] - ints_7[i_11][i_10 - 1];
                int i_15 = (int) Math.sqrt(i_8 * 512 + i_13 * i_13 + i_14 * i_14);
                int i_16 = (i_13 << 8) / i_15;
                int i_17 = i_8 * -512 / i_15;
                int i_18 = (i_14 << 8) / i_15;
                int i_12 = i_9 + (aGraphicalRenderer_Sub3_9353.anInt9011 * i_16 + aGraphicalRenderer_Sub3_9353.anInt8988 * i_17 + aGraphicalRenderer_Sub3_9353.anInt9007 * i_18 >> 17);
                i_12 >>= 1;
                if (i_12 < 2) {
                    i_12 = 2;
                } else if (i_12 > 126) {
                    i_12 = 126;
                }

                aByteArrayArray9355[i_11][i_10] = (byte) i_12;
            }
        }

        aByteArrayArray9356 = new byte[i_4 + 1][i_5 + 1];
    }

    static int method14616(int i_0, int i_1) {
        int i_2 = (i_0 & 0xff0000) * i_1 >> 23;
        if (i_2 < 2) {
            i_2 = 2;
        } else if (i_2 > 253) {
            i_2 = 253;
        }

        int i_3 = (i_0 & 0xff00) * i_1 >> 15;
        if (i_3 < 2) {
            i_3 = 2;
        } else if (i_3 > 253) {
            i_3 = 253;
        }

        int i_4 = (i_0 & 0xff) * i_1 >> 7;
        if (i_4 < 2) {
            i_4 = 2;
        } else if (i_4 > 253) {
            i_4 = 253;
        }

        return i_2 << 16 | i_3 << 8 | i_4;
    }

    @Override
    public void LA(int i_1, int i_2, int i_3) {
        if (aByteArrayArray9356[i_1][i_2] < i_3) {
            aByteArrayArray9356[i_1][i_2] = (byte) i_3;
        }

    }

    @Override
    public void method6708(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, HDWaterTile class90_14) {
        if (aClass178ArrayArray9352 == null) {
            aClass178ArrayArray9352 = new Class178[width][length];
            aClass183ArrayArray9332 = new Class183[width][length];
        } else if (aClass177ArrayArray9336 != null || aClass181ArrayArray9335 != null) {
            throw new IllegalStateException();
        }

        boolean bool_16 = false;
        int i_18;
        int i_19;
        if (ints_10.length == 2 && ints_7.length == 2 && (ints_10[0] == ints_10[1] || ints_12[0] != -1 && ints_12[1] == ints_12[0])) {
            bool_16 = true;

            for (int i_17 = 1; i_17 < 2; i_17++) {
                i_18 = ints_3[ints_7[i_17]];
                i_19 = ints_5[ints_7[i_17]];
                if (i_18 != 0 && i_18 != tileUnits || i_19 != 0 && i_19 != tileUnits) {
                    bool_16 = false;
                    break;
                }
            }
        }

        if (!bool_16) {
            Class183 class183_25 = new Class183();
            short s_28 = (short) ints_3.length;
            short s_29 = (short) ints_10.length;
            class183_25.aShort2265 = s_28;
            class183_25.aShortArray2274 = new short[s_28];
            class183_25.aShortArray2267 = new short[s_28];
            class183_25.aShortArray2268 = new short[s_28];
            class183_25.aShortArray2264 = new short[s_28];

            int i_21;
            int i_22;
            int i_23;
            for (int i_20 = 0; i_20 < s_28; i_20++) {
                i_21 = ints_3[i_20];
                i_22 = ints_5[i_20];
                int i_27;
                if (i_21 == 0 && i_22 == 0) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                } else if (i_21 == 0 && i_22 == tileUnits) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]);
                } else if (i_21 == tileUnits && i_22 == tileUnits) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]);
                } else if (i_21 == tileUnits && i_22 == 0) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]);
                } else {
                    i_23 = (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) * i_21 + (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) * (tileUnits - i_21);
                    i_27 = (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) * (tileUnits - i_21) + (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) * i_21;
                    class183_25.aShortArray2274[i_20] = (short) (i_23 * (tileUnits - i_22) + i_27 * i_22 >> tileScale * 2);
                }

                i_23 = i_21 + (i_1 << tileScale);
                i_27 = i_22 + (i_2 << tileScale);
                class183_25.aShortArray2267[i_20] = (short) i_21;
                class183_25.aShortArray2264[i_20] = (short) i_22;
                class183_25.aShortArray2268[i_20] = (short) (averageHeight(i_23, i_27) + (ints_4 != null ? ints_4[i_20] : 0));
                if (class183_25.aShortArray2274[i_20] < 2) {
                    class183_25.aShortArray2274[i_20] = 2;
                }
            }

            boolean bool_30 = false;
            i_21 = 0;

            for (i_22 = 0; i_22 < s_29; i_22++) {
                if (ints_10[i_22] >= 0 || ints_11 != null && ints_11[i_22] >= 0) {
                    ++i_21;
                }

                i_23 = ints_12[i_22];
                if (i_23 != -1) {
                    TextureDetails class169_24 = aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_23);
                    if (!class169_24.isGroundMesh) {
                        bool_30 = true;
                        if (method14620(class169_24.effectId) || class169_24.textureSpeedU != 0 || class169_24.textureSpeedV != 0) {
                            class183_25.aByte2276 |= 0x4;
                        }
                    }
                }
            }

            class183_25.anIntArray2272 = new int[i_21];
            if (ints_11 != null) {
                class183_25.anIntArray2277 = new int[i_21];
            }

            class183_25.aShortArray2271 = new short[i_21];
            class183_25.aShortArray2266 = new short[i_21];
            class183_25.aShortArray2273 = new short[i_21];
            if (bool_30) {
                class183_25.aShortArray2270 = new short[i_21];
                class183_25.aShortArray2275 = new short[i_21];
            }

            for (i_22 = 0; i_22 < s_29; i_22++) {
                if (ints_10[i_22] >= 0 || ints_11 != null && ints_11[i_22] >= 0) {
                    if (ints_10[i_22] >= 0) {
                        class183_25.anIntArray2272[class183_25.aShort2269] = Class372.method6362(ints_10[i_22]);
                    } else {
                        class183_25.anIntArray2272[class183_25.aShort2269] = -1;
                    }

                    if (ints_11 != null) {
                        if (ints_11[i_22] != -1) {
                            class183_25.anIntArray2277[class183_25.aShort2269] = Class372.method6362(ints_11[i_22]);
                        } else {
                            class183_25.anIntArray2277[class183_25.aShort2269] = -1;
                        }
                    }

                    class183_25.aShortArray2271[class183_25.aShort2269] = (short) ints_7[i_22];
                    class183_25.aShortArray2266[class183_25.aShort2269] = (short) ints_8[i_22];
                    class183_25.aShortArray2273[class183_25.aShort2269] = (short) ints_9[i_22];
                    if (bool_30) {
                        if (ints_12[i_22] != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(ints_12[i_22]).isGroundMesh) {
                            class183_25.aShortArray2270[class183_25.aShort2269] = (short) ints_12[i_22];
                            class183_25.aShortArray2275[class183_25.aShort2269] = (short) ints_13[i_22];
                        } else {
                            class183_25.aShortArray2270[class183_25.aShort2269] = -1;
                        }
                    }

                    ++class183_25.aShort2269;
                }
            }

            aClass183ArrayArray9332[i_1][i_2] = class183_25;
        } else if (ints_10[0] >= 0 || ints_11 != null && ints_11[0] >= 0) {
            Class178 class178_32 = new Class178();
            i_18 = ints_10[0];
            i_19 = ints_12[0];
            if (ints_11 != null) {
                class178_32.anInt2213 = MaterialProp20.method15076(Class372.method6362(ints_11[0]), aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                if (i_18 == -1) {
                    class178_32.aByte2219 |= 0x2;
                }
            }

            if (tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2] && tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2 + 1] && tileHeights[i_1][i_2 + 1] == tileHeights[i_1][i_2]) {
                class178_32.aByte2219 |= 0x1;
            }

            TextureDetails class169_26 = null;
            if (i_19 != -1) {
                class169_26 = aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_19);
            }

            if (class169_26 != null && (class178_32.aByte2219 & 0x2) == 0 && !class169_26.isGroundMesh) {
                class178_32.aShort2214 = (short) (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                class178_32.aShort2217 = (short) (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]);
                class178_32.aShort2216 = (short) (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]);
                class178_32.aShort2218 = (short) (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]);
                class178_32.aShort2215 = (short) i_19;
                if (method14620(class169_26.effectId) || class169_26.textureSpeedU != 0 || class169_26.textureSpeedV != 0) {
                    class178_32.aByte2219 |= 0x4;
                }
            } else {
                short s_31 = Class372.method6362(i_18);
                class178_32.aShort2214 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                class178_32.aShort2217 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]);
                class178_32.aShort2216 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]);
                class178_32.aShort2218 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]);
                class178_32.aShort2215 = -1;
            }

            aClass178ArrayArray9352[i_1][i_2] = class178_32;
        }

    }

    @Override
    public void method6707(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, HDWaterTile class90_11, boolean bool_12) {
        boolean bool_13 = (anInt9345 & 0x20) == 0;
        if (aClass177ArrayArray9336 == null && !bool_13) {
            aClass177ArrayArray9336 = new Class177[width][length];
            aClass196ArrayArray9337 = new Class196[width][length];
        } else if (aClass181ArrayArray9335 == null && bool_13) {
            aClass181ArrayArray9335 = new Class181[width][length];
        } else if (aClass178ArrayArray9352 != null) {
            throw new IllegalStateException();
        }

        if (ints_3 != null && ints_3.length != 0) {
            int i_14;
            for (i_14 = 0; i_14 < ints_7.length; i_14++) {
                if (ints_7[i_14] == -1) {
                    ints_7[i_14] = 0;
                } else {
                    ints_7[i_14] = Class335.anIntArray3916[Class372.method6362(ints_7[i_14]) & 0xffff] << 8 | 0xff;
                }
            }

            if (ints_8 != null) {
                for (i_14 = 0; i_14 < ints_8.length; i_14++) {
                    if (ints_8[i_14] == -1) {
                        ints_8[i_14] = 0;
                    } else {
                        ints_8[i_14] = Class335.anIntArray3916[Class372.method6362(ints_8[i_14]) & 0xffff] << 8 | 0xff;
                    }
                }
            }

            int i_15;
            int i_16;
            int i_17;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_34;
            if (bool_13) {
                Class181 class181_29 = new Class181();
                class181_29.aShort2248 = (short) ints_3.length;
                class181_29.aShort2250 = (short) (ints_3.length / 3);
                class181_29.aShortArray2249 = new short[class181_29.aShort2248];
                class181_29.aShortArray2255 = new short[class181_29.aShort2248];
                class181_29.aShortArray2247 = new short[class181_29.aShort2248];
                class181_29.anIntArray2251 = new int[class181_29.aShort2248];
                class181_29.aShortArray2253 = new short[class181_29.aShort2248];
                class181_29.aShortArray2254 = new short[class181_29.aShort2248];
                class181_29.aByteArray2256 = new byte[class181_29.aShort2248];
                if (ints_6 != null) {
                    class181_29.aShortArray2252 = new short[class181_29.aShort2248];
                }

                for (i_15 = 0; i_15 < class181_29.aShort2248; i_15++) {
                    i_16 = ints_3[i_15];
                    i_17 = ints_5[i_15];
                    boolean bool_18 = false;
                    if (i_16 == 0 && i_17 == 0) {
                        i_19 = aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2];
                    } else if (i_16 == 0 && i_17 == tileUnits) {
                        i_19 = aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1];
                    } else if (i_16 == tileUnits && i_17 == tileUnits) {
                        i_19 = aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1];
                    } else if (i_16 == tileUnits && i_17 == 0) {
                        i_19 = aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2];
                    } else {
                        i_20 = (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) * i_16 + (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) * (tileUnits - i_16);
                        i_21 = (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) * (tileUnits - i_16) + (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) * i_16;
                        i_19 = i_20 * (tileUnits - i_17) + i_21 * i_17 >> tileScale * 2;
                    }

                    i_20 = i_16 + (i_1 << tileScale);
                    i_21 = i_17 + (i_2 << tileScale);
                    class181_29.aShortArray2249[i_15] = (short) i_16;
                    class181_29.aShortArray2247[i_15] = (short) i_17;
                    class181_29.aShortArray2255[i_15] = (short) (averageHeight(i_20, i_21) + (ints_4 != null ? ints_4[i_15] : 0));
                    if (i_19 < 0) {
                        i_19 = 0;
                    }

                    if (ints_7[i_15] == 0) {
                        class181_29.anIntArray2251[i_15] = 0;
                    } else {
                        i_22 = 0;
                        if (ints_6 != null) {
                            short s_23 = class181_29.aShortArray2252[i_15] = (short) ints_6[i_15];
                            if (class90_11.scale != 0) {
                                i_22 = s_23 * 255 / class90_11.scale;
                                if (i_22 < 0) {
                                    i_22 = 0;
                                } else if (i_22 > 255) {
                                    i_22 = 255;
                                }
                            }
                        }

                        i_34 = -16777216;
                        if (ints_9[i_15] != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(ints_9[i_15]).effectId)) {
                            i_34 = -1694498816;
                        }

                        class181_29.anIntArray2251[i_15] = i_34 | FontRenderer_Sub3.method14337(method14616(ints_7[i_15] >> 8, i_19), class90_11.color, i_22);
                    }
                    if (ints_8 != null) {
                        class181_29.aByteArray2256[i_15] = (byte) i_19;
                    }

                    class181_29.aShortArray2253[i_15] = (short) ints_9[i_15];
                    class181_29.aShortArray2254[i_15] = (short) ints_10[i_15];
                }

                if (ints_8 != null) {
                    class181_29.anIntArray2257 = new int[class181_29.aShort2250];
                }

                for (i_15 = 0; i_15 < class181_29.aShort2250; i_15++) {
                    i_16 = i_15 * 3;
                    if (ints_8 != null && ints_8[i_16] != 0) {
                        class181_29.anIntArray2257[i_15] = -16777216 | ints_8[i_16] >> 8;
                    }
                }

                aClass181ArrayArray9335[i_1][i_2] = class181_29;
            } else {
                boolean bool_31 = true;
                i_15 = -1;
                i_16 = -1;
                i_17 = -1;
                int i_32 = -1;
                if (ints_3.length != 6) {
                    bool_31 = false;
                } else {
                    for (i_19 = 0; i_19 < 6; i_19++) {
                        if (ints_3[i_19] == 0 && ints_5[i_19] == 0) {
                            if (i_15 != -1 && ints_7[i_15] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_15 = i_19;
                        } else if (ints_3[i_19] == tileUnits && ints_5[i_19] == 0) {
                            if (i_16 != -1 && ints_7[i_16] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_16 = i_19;
                        } else if (ints_3[i_19] == tileUnits && ints_5[i_19] == tileUnits) {
                            if (i_17 != -1 && ints_7[i_17] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_17 = i_19;
                        } else if (ints_3[i_19] == 0 && ints_5[i_19] == tileUnits) {
                            if (i_32 != -1 && ints_7[i_32] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_32 = i_19;
                        }
                    }

                    if (i_15 == -1 || i_16 == -1 || i_17 == -1 || i_32 == -1) {
                        bool_31 = false;
                    }

                    if (bool_31) {
                        if (ints_4 != null) {
                            for (i_19 = 0; i_19 < 4; i_19++) {
                                if (ints_4[i_19] != 0) {
                                    bool_31 = false;
                                    break;
                                }
                            }
                        }

                        if (bool_31) {
                            for (i_19 = 1; i_19 < 4; i_19++) {
                                if (ints_3[i_19] != ints_3[0] && ints_3[i_19] != ints_3[0] + tileUnits && ints_3[0] - tileUnits != ints_3[i_19]) {
                                    bool_31 = false;
                                    break;
                                }

                                if (ints_5[i_19] != ints_5[0] && ints_5[i_19] != ints_5[0] + tileUnits && ints_5[i_19] != ints_5[0] - tileUnits) {
                                    bool_31 = false;
                                    break;
                                }
                            }
                        }
                    }
                }

                if (bool_31) {
                    Class177 class177_30 = new Class177();
                    i_20 = ints_7[0];
                    i_21 = ints_9[0];
                    if (ints_8 != null) {
                        class177_30.anInt2203 = ints_8[0] >> 8;
                        if (i_20 == 0) {
                            class177_30.aByte2210 |= 0x2;
                        }
                    } else if (i_20 == 0) {
                        return;
                    }

                    if (tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2] && tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2 + 1] && tileHeights[i_1][i_2 + 1] == tileHeights[i_1][i_2]) {
                        class177_30.aByte2210 |= 0x1;
                    }

                    if (i_21 != -1 && (class177_30.aByte2210 & 0x2) == 0 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_21).isGroundMesh) {
                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_15] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2209 = FontRenderer_Sub3.method14337(method14616(ints_7[i_15] >> 8, aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2209 |= 255 - (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_16] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2204 = FontRenderer_Sub3.method14337(method14616(ints_7[i_16] >> 8, aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2204 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_17] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2211 = FontRenderer_Sub3.method14337(method14616(ints_7[i_17] >> 8, aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2211 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_32] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2206 = FontRenderer_Sub3.method14337(method14616(ints_7[i_32] >> 8, aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]), class90_11.color, i_22);
                        class177_30.aShort2212 = (short) i_21;
                    } else {
                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_15] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2209 = FontRenderer_Sub3.method14337(method14616(ints_7[i_15] >> 8, aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2209 |= 255 - (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_16] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2204 = FontRenderer_Sub3.method14337(method14616(ints_7[i_16] >> 8, aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2204 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_17] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2211 = FontRenderer_Sub3.method14337(method14616(ints_7[i_17] >> 8, aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2211 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = ints_6[i_32] * 255 / class90_11.scale;
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2206 = FontRenderer_Sub3.method14337(method14616(ints_7[i_32] >> 8, aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2206 |= 255 - (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) << 25;
                        }

                        class177_30.aShort2212 = -1;
                    }

                    if (ints_6 != null) {
                        class177_30.aShort2208 = (short) ints_6[i_17];
                        class177_30.aShort2205 = (short) ints_6[i_32];
                        class177_30.aShort2202 = (short) ints_6[i_16];
                        class177_30.aShort2207 = (short) ints_6[i_15];
                    }

                    aClass177ArrayArray9336[i_1][i_2] = class177_30;
                } else {
                    Class196 class196_38 = new Class196();
                    class196_38.aShort2421 = (short) ints_3.length;
                    class196_38.aShort2415 = (short) (ints_3.length / 3);
                    class196_38.aShortArray2416 = new short[class196_38.aShort2421];
                    class196_38.aShortArray2417 = new short[class196_38.aShort2421];
                    class196_38.aShortArray2418 = new short[class196_38.aShort2421];
                    class196_38.anIntArray2420 = new int[class196_38.aShort2421];
                    if (ints_6 != null) {
                        class196_38.aShortArray2419 = new short[class196_38.aShort2421];
                    }

                    int i_24;
                    int i_27;
                    for (i_20 = 0; i_20 < class196_38.aShort2421; i_20++) {
                        i_21 = ints_3[i_20];
                        i_22 = ints_5[i_20];
                        boolean bool_35 = false;
                        int i_25;
                        int i_26;
                        if (i_21 == 0 && i_22 == 0) {
                            i_24 = aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2];
                        } else if (i_21 == 0 && i_22 == tileUnits) {
                            i_24 = aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1];
                        } else if (i_21 == tileUnits && i_22 == tileUnits) {
                            i_24 = aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1];
                        } else if (i_21 == tileUnits && i_22 == 0) {
                            i_24 = aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2];
                        } else {
                            i_25 = (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) * i_21 + (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) * (tileUnits - i_21);
                            i_26 = (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) * (tileUnits - i_21) + (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) * i_21;
                            i_24 = i_25 * (tileUnits - i_22) + i_26 * i_22 >> tileScale * 2;
                        }

                        i_25 = i_21 + (i_1 << tileScale);
                        i_26 = i_22 + (i_2 << tileScale);
                        class196_38.aShortArray2416[i_20] = (short) i_21;
                        class196_38.aShortArray2418[i_20] = (short) i_22;
                        class196_38.aShortArray2417[i_20] = (short) (averageHeight(i_25, i_26) + (ints_4 != null ? ints_4[i_20] : 0));
                        if (i_24 < 0) {
                            i_24 = 0;
                        }

                        if (ints_7[i_20] == 0) {
                            if (ints_8 != null) {
                                class196_38.anIntArray2420[i_20] = i_24 << 25;
                            } else {
                                class196_38.anIntArray2420[i_20] = 0;
                            }
                        } else {
                            i_27 = 0;
                            if (ints_6 != null) {
                                short s_28 = class196_38.aShortArray2419[i_20] = (short) ints_6[i_20];
                                if (class90_11.scale != 0) {
                                    i_27 = s_28 * 255 / class90_11.scale;
                                    if (i_27 < 0) {
                                        i_27 = 0;
                                    } else if (i_27 > 255) {
                                        i_27 = 255;
                                    }
                                }
                            }

                            class196_38.anIntArray2420[i_20] = FontRenderer_Sub3.method14337(method14616(ints_7[i_20] >> 8, i_24), class90_11.color, i_27);
                            if (ints_8 != null) {
                                class196_38.anIntArray2420[i_20] |= i_24 << 25;
                            }
                        }
                    }

                    boolean bool_33 = false;

                    for (i_21 = 0; i_21 < class196_38.aShort2415; i_21++) {
                        if (ints_9[i_21 * 3] != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(ints_9[i_21 * 3]).isGroundMesh) {
                            bool_33 = true;
                        }
                    }

                    if (ints_8 != null) {
                        class196_38.anIntArray2423 = new int[class196_38.aShort2415];
                    }

                    if (bool_33) {
                        class196_38.aShortArray2413 = new short[class196_38.aShort2415];
                        class196_38.aShortArray2422 = new short[class196_38.aShort2415];
                    }

                    for (i_21 = 0; i_21 < class196_38.aShort2415; i_21++) {
                        i_22 = i_21 * 3;
                        if (ints_8 != null && ints_8[i_22] != 0) {
                            class196_38.anIntArray2423[i_21] = ints_8[i_22] >> 8;
                        }

                        if (bool_33) {
                            i_34 = i_22 + 1;
                            i_24 = i_34 + 1;
                            boolean bool_36 = false;
                            boolean bool_37 = true;
                            i_27 = ints_9[i_22];
                            if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                bool_36 = true;
                            } else {
                                bool_37 = false;
                            }

                            i_27 = ints_9[i_34];
                            if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                bool_36 = true;
                            } else {
                                bool_37 = false;
                            }

                            i_27 = ints_9[i_24];
                            if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                bool_36 = true;
                            } else {
                                bool_37 = false;
                            }

                            if (bool_37) {
                                class196_38.aShortArray2413[i_21] = (short) i_27;
                                class196_38.aShortArray2422[i_21] = (short) ints_10[i_22];
                            } else {
                                if (bool_36) {
                                    i_27 = ints_9[i_22];
                                    if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                        class196_38.anIntArray2420[i_22] = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).color & 0xffff) & 0xffff];
                                    }

                                    i_27 = ints_9[i_34];
                                    if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                        class196_38.anIntArray2420[i_34] = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).color & 0xffff) & 0xffff];
                                    }

                                    i_27 = ints_9[i_24];
                                    if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                        class196_38.anIntArray2420[i_24] = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).color & 0xffff) & 0xffff];
                                    }
                                }

                                class196_38.aShortArray2413[i_21] = -1;
                            }
                        }
                    }

                    aClass196ArrayArray9337[i_1][i_2] = class196_38;
                }
            }
        }

    }

    @Override
    public void SA() {
        aByteArrayArray9355 = null;
        aByteArrayArray9356 = null;
    }

    void method14617(int i_1, int i_2, boolean bool_3, Class185 class185_4, ChoppyItemFixClass choppyitemfixclass_5, float[] floats_6, float[] floats_7, float[] floats_8, float[] floats_9, float[] floats_10, int i_11) {
        Class177 class177_12 = aClass177ArrayArray9336[i_1][i_2];
        int i_14;
        int i_15;
        int i_16;
        float f_18;
        float f_19;
        float f_20;
        float f_21;
        float f_22;
        float f_23;
        float f_24;
        if (class177_12 != null) {
            if ((class177_12.aByte2210 & 0x2) == 0) {
                if (i_11 != 0) {
                    if ((class177_12.aByte2210 & 0x4) != 0) {
                        if ((i_11 & 0x1) != 0) {
                            return;
                        }
                    } else if ((i_11 & 0x2) != 0) {
                        return;
                    }
                }

                int i_13 = tileUnits * i_1;
                i_14 = i_13 + tileUnits;
                i_15 = i_2 * tileUnits;
                i_16 = i_15 + tileUnits;
                float f_17 = 0.0F;
                f_18 = 0.0F;
                f_19 = 0.0F;
                f_20 = 0.0F;
                float f_25;
                float f_26;
                float f_27;
                float f_28;
                float f_29;
                float f_30;
                float f_31;
                float f_32;
                float f_33;
                float f_34;
                float f_35;
                float f_36;
                int i_37;
                int i_39;
                float f_41;
                float f_42;
                float f_43;
                float f_44;
                float f_45;
                float f_47;
                float f_48;
                float f_49;
                float f_50;
                float f_51;
                float f_52;
                float f_60;
                float f_63;
                if ((class177_12.aByte2210 & 0x1) != 0 && !bool_3) {
                    i_37 = tileHeights[i_1][i_2];
                    f_60 = aFloat9334 * i_37;
                    float f_61 = aFloat9346 * i_37;
                    float f_62 = aFloat9333 + aFloat9341 * i_13 + f_60 + aFloat9349 * i_15;
                    f_21 = aFloat9354 + aFloat9342 * i_13 + f_61 + aFloat9350 * i_15;
                    if (f_62 < -f_21) {
                        return;
                    }

                    f_41 = aFloat9333 + aFloat9341 * i_14 + f_60 + aFloat9349 * i_15;
                    f_22 = aFloat9354 + aFloat9342 * i_14 + f_61 + aFloat9350 * i_15;
                    if (f_41 < -f_22) {
                        return;
                    }

                    f_42 = aFloat9333 + aFloat9341 * i_14 + f_60 + aFloat9349 * i_16;
                    f_23 = aFloat9354 + aFloat9342 * i_14 + f_61 + aFloat9350 * i_16;
                    if (f_42 < -f_23) {
                        return;
                    }

                    f_43 = aFloat9333 + aFloat9341 * i_13 + f_60 + aFloat9349 * i_16;
                    f_24 = aFloat9354 + aFloat9342 * i_13 + f_61 + aFloat9350 * i_16;
                    if (f_43 < -f_24) {
                        return;
                    }

                    f_25 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_62 / f_21;
                    f_26 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_41 / f_22;
                    f_27 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_42 / f_23;
                    f_28 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_43 / f_24;
                    if (class185_4.aBool2304) {
                        f_44 = f_62 - class185_4.aFloat2305;
                        if (f_44 > 0.0F) {
                            f_17 = f_44 / class185_4.aFloat2303;
                            if (f_17 > 1.0F) {
                                f_17 = 1.0F;
                            }
                        }

                        f_44 = f_41 - class185_4.aFloat2305;
                        if (f_44 > 0.0F) {
                            f_18 = f_44 / class185_4.aFloat2303;
                            if (f_18 > 1.0F) {
                                f_18 = 1.0F;
                            }
                        }

                        f_44 = f_42 - class185_4.aFloat2305;
                        if (f_44 > 0.0F) {
                            f_19 = f_44 / class185_4.aFloat2303;
                            if (f_19 > 1.0F) {
                                f_19 = 1.0F;
                            }
                        }

                        f_44 = f_43 - class185_4.aFloat2305;
                        if (f_44 > 0.0F) {
                            f_20 = f_44 / class185_4.aFloat2303;
                            if (f_20 > 1.0F) {
                                f_20 = 1.0F;
                            }
                        }
                    }

                    f_44 = aFloat9343 * i_37;
                    f_45 = aFloat9344 * i_37;
                    f_63 = aFloat9351 + aFloat9338 * i_13 + f_44 + aFloat9339 * i_15;
                    f_29 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_63 / f_21;
                    f_47 = aFloat9328 + aFloat9340 * i_13 + f_45 + aFloat9327 * i_15;
                    f_30 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_47 / f_21;
                    f_48 = aFloat9351 + aFloat9338 * i_14 + f_44 + aFloat9339 * i_15;
                    f_31 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_48 / f_22;
                    f_49 = aFloat9328 + aFloat9340 * i_14 + f_45 + aFloat9327 * i_15;
                    f_32 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_49 / f_22;
                    f_50 = aFloat9351 + aFloat9338 * i_14 + f_44 + aFloat9339 * i_16;
                    f_33 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_50 / f_23;
                    f_51 = aFloat9328 + aFloat9340 * i_14 + f_45 + aFloat9327 * i_16;
                    f_34 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_51 / f_23;
                    f_52 = aFloat9351 + aFloat9338 * i_13 + f_44 + aFloat9339 * i_16;
                    f_35 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_52 / f_24;
                    float f_53 = aFloat9328 + aFloat9340 * i_13 + f_45 + aFloat9327 * i_16;
                    f_36 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_53 / f_24;
                } else {
                    i_37 = tileHeights[i_1][i_2];
                    int i_38 = tileHeights[i_1 + 1][i_2];
                    i_39 = tileHeights[i_1 + 1][i_2 + 1];
                    int i_40 = tileHeights[i_1][i_2 + 1];
                    f_41 = aFloat9333 + aFloat9341 * i_13 + aFloat9334 * i_37 + aFloat9349 * i_15;
                    f_21 = aFloat9354 + aFloat9342 * i_13 + aFloat9346 * i_37 + aFloat9350 * i_15;
                    if (f_41 < -f_21) {
                        return;
                    }

                    f_42 = aFloat9333 + aFloat9341 * i_14 + aFloat9334 * i_38 + aFloat9349 * i_15;
                    f_22 = aFloat9354 + aFloat9342 * i_14 + aFloat9346 * i_38 + aFloat9350 * i_15;
                    if (f_42 < -f_22) {
                        return;
                    }

                    f_43 = aFloat9333 + aFloat9341 * i_14 + aFloat9334 * i_39 + aFloat9349 * i_16;
                    f_23 = aFloat9354 + aFloat9342 * i_14 + aFloat9346 * i_39 + aFloat9350 * i_16;
                    if (f_43 < -f_23) {
                        return;
                    }

                    f_44 = aFloat9333 + aFloat9341 * i_13 + aFloat9334 * i_40 + aFloat9349 * i_16;
                    f_24 = aFloat9354 + aFloat9342 * i_13 + aFloat9346 * i_40 + aFloat9350 * i_16;
                    if (f_44 < -f_24) {
                        return;
                    }

                    f_25 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_41 / f_21;
                    f_26 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_42 / f_22;
                    f_27 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_43 / f_23;
                    f_28 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_44 / f_24;
                    if (bool_3) {
                        f_45 = f_41 - class185_4.aFloat2305;
                        int i_46;
                        if (f_45 > 0.0F) {
                            f_45 /= class185_4.aFloat2303;
                            if (f_45 > 1.0F) {
                                f_45 = 1.0F;
                            }

                            f_17 = f_45;
                            i_46 = (int) (class177_12.aShort2207 * f_45);
                            if (i_46 > 0) {
                                i_37 -= i_46;
                            }
                        }

                        f_45 = f_42 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_45 /= class185_4.aFloat2303;
                            if (f_45 > 1.0F) {
                                f_45 = 1.0F;
                            }

                            f_18 = f_45;
                            i_46 = (int) (class177_12.aShort2202 * f_45);
                            if (i_46 > 0) {
                                i_38 -= i_46;
                            }
                        }

                        f_45 = f_43 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_45 /= class185_4.aFloat2303;
                            if (f_45 > 1.0F) {
                                f_45 = 1.0F;
                            }

                            f_19 = f_45;
                            i_46 = (int) (class177_12.aShort2208 * f_45);
                            if (i_46 > 0) {
                                i_39 -= i_46;
                            }
                        }

                        f_45 = f_44 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_45 /= class185_4.aFloat2303;
                            if (f_45 > 1.0F) {
                                f_45 = 1.0F;
                            }

                            f_20 = f_45;
                            i_46 = (int) (class177_12.aShort2205 * f_45);
                            if (i_46 > 0) {
                                i_40 -= i_46;
                            }
                        }
                    } else if (class185_4.aBool2304) {
                        f_45 = f_41 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_17 = f_45 / class185_4.aFloat2303;
                            if (f_17 > 1.0F) {
                                f_17 = 1.0F;
                            }
                        }

                        f_45 = f_42 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_18 = f_45 / class185_4.aFloat2303;
                            if (f_18 > 1.0F) {
                                f_18 = 1.0F;
                            }
                        }

                        f_45 = f_43 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_19 = f_45 / class185_4.aFloat2303;
                            if (f_19 > 1.0F) {
                                f_19 = 1.0F;
                            }
                        }

                        f_45 = f_44 - class185_4.aFloat2305;
                        if (f_45 > 0.0F) {
                            f_20 = f_45 / class185_4.aFloat2303;
                            if (f_20 > 1.0F) {
                                f_20 = 1.0F;
                            }
                        }
                    }

                    f_45 = aFloat9351 + aFloat9338 * i_13 + aFloat9343 * i_37 + aFloat9339 * i_15;
                    f_29 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_45 / f_21;
                    f_63 = aFloat9328 + aFloat9340 * i_13 + aFloat9344 * i_37 + aFloat9327 * i_15;
                    f_30 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_63 / f_21;
                    f_47 = aFloat9351 + aFloat9338 * i_14 + aFloat9343 * i_38 + aFloat9339 * i_15;
                    f_31 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_47 / f_22;
                    f_48 = aFloat9328 + aFloat9340 * i_14 + aFloat9344 * i_38 + aFloat9327 * i_15;
                    f_32 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_48 / f_22;
                    f_49 = aFloat9351 + aFloat9338 * i_14 + aFloat9343 * i_39 + aFloat9339 * i_16;
                    f_33 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_49 / f_23;
                    f_50 = aFloat9328 + aFloat9340 * i_14 + aFloat9344 * i_39 + aFloat9327 * i_16;
                    f_34 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_50 / f_23;
                    f_51 = aFloat9351 + aFloat9338 * i_13 + aFloat9343 * i_40 + aFloat9339 * i_16;
                    f_35 = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_51 / f_24;
                    f_52 = aFloat9328 + aFloat9340 * i_13 + aFloat9344 * i_40 + aFloat9327 * i_16;
                    f_36 = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_52 / f_24;
                }

                boolean bool_59 = class177_12.aShort2212 != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(class177_12.aShort2212).effectId);
                f_60 = f_18 + f_19 + f_20;
                if ((f_33 - f_35) * (f_32 - f_36) - (f_34 - f_36) * (f_31 - f_35) > 0.0F) {
                    choppyitemfixclass_5.aBool1708 = f_33 < 0.0F || f_35 < 0.0F || f_31 < 0.0F || f_33 > choppyitemfixclass_5.anInt1684 || f_35 > choppyitemfixclass_5.anInt1684 || f_31 > choppyitemfixclass_5.anInt1684;
                    if (f_60 < 3.0F) {
                        if (f_60 > 0.0F) {
                            if (class177_12.aShort2212 >= 0) {
                                i_39 = -16777216;
                                if (bool_59) {
                                    i_39 = -1694498816;
                                }

                                choppyitemfixclass_5.method2424(true, true, false, f_34, f_36, f_32, f_33, f_35, f_31, f_27, f_28, f_26, f_23, f_24, f_22, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_39 | class177_12.anInt2211 & 0xffffff, i_39 | class177_12.anInt2206 & 0xffffff, i_39 | class177_12.anInt2204 & 0xffffff, class185_4.anInt2307, f_19 * 255.0F, f_20 * 255.0F, f_18 * 255.0F, class177_12.aShort2212);
                            } else {
                                if (bool_59) {
                                    choppyitemfixclass_5.anInt1674 = 100;
                                }

                                choppyitemfixclass_5.method2425(true, true, false, f_34, f_36, f_32, f_33, f_35, f_31, f_27, f_28, f_26, ImageIndexLoader.method5773(class177_12.anInt2211, (int) (f_19 * 255.0F) << 24 | class185_4.anInt2307), ImageIndexLoader.method5773(class177_12.anInt2206, (int) (f_20 * 255.0F) << 24 | class185_4.anInt2307), ImageIndexLoader.method5773(class177_12.anInt2204, (int) (f_18 * 255.0F) << 24 | class185_4.anInt2307));
                                choppyitemfixclass_5.anInt1674 = 0;
                            }
                        } else if (class177_12.aShort2212 >= 0) {
                            i_39 = -16777216;
                            if (bool_59) {
                                i_39 = -1694498816;
                            }

                            choppyitemfixclass_5.method2424(true, true, false, f_34, f_36, f_32, f_33, f_35, f_31, f_27, f_28, f_26, f_23, f_24, f_22, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, i_39 | class177_12.anInt2211 & 0xffffff, i_39 | class177_12.anInt2206 & 0xffffff, i_39 | class177_12.anInt2204 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class177_12.aShort2212);
                        } else {
                            if (bool_59) {
                                choppyitemfixclass_5.anInt1674 = 100;
                            }

                            choppyitemfixclass_5.method2425(true, true, false, f_34, f_36, f_32, f_33, f_35, f_31, f_27, f_28, f_26, class177_12.anInt2211, class177_12.anInt2206, class177_12.anInt2204);
                            choppyitemfixclass_5.anInt1674 = 0;
                        }
                    } else {
                        choppyitemfixclass_5.method2428(true, true, false, f_34, f_36, f_32, f_33, f_35, f_31, f_27, f_28, f_26, class185_4.anInt2307);
                    }
                }

                f_60 = f_17 + f_18 + f_20;
                if ((f_29 - f_31) * (f_36 - f_32) - (f_30 - f_32) * (f_35 - f_31) > 0.0F) {
                    choppyitemfixclass_5.aBool1708 = f_29 < 0.0F || f_31 < 0.0F || f_35 < 0.0F || f_29 > choppyitemfixclass_5.anInt1684 || f_31 > choppyitemfixclass_5.anInt1684 || f_35 > choppyitemfixclass_5.anInt1684;
                    if (f_60 < 3.0F) {
                        if (bool_59) {
                            choppyitemfixclass_5.anInt1674 = -1694498816;
                        }

                        if (f_60 > 0.0F) {
                            if (class177_12.aShort2212 >= 0) {
                                i_39 = -16777216;
                                if (bool_59) {
                                    i_39 = -1694498816;
                                }

                                choppyitemfixclass_5.method2424(true, true, false, f_30, f_32, f_36, f_29, f_31, f_35, f_25, f_26, f_28, f_21, f_22, f_24, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_39 | class177_12.anInt2209 & 0xffffff, i_39 | class177_12.anInt2204 & 0xffffff, i_39 | class177_12.anInt2206 & 0xffffff, class185_4.anInt2307, f_17 * 255.0F, f_18 * 255.0F, f_20 * 255.0F, class177_12.aShort2212);
                            } else {
                                if (bool_59) {
                                    choppyitemfixclass_5.anInt1674 = 100;
                                }

                                choppyitemfixclass_5.method2425(true, true, false, f_30, f_32, f_36, f_29, f_31, f_35, f_25, f_26, f_28, ImageIndexLoader.method5773(class177_12.anInt2209, (int) (f_17 * 255.0F) << 24 | class185_4.anInt2307), ImageIndexLoader.method5773(class177_12.anInt2204, (int) (f_18 * 255.0F) << 24 | class185_4.anInt2307), ImageIndexLoader.method5773(class177_12.anInt2206, (int) (f_20 * 255.0F) << 24 | class185_4.anInt2307));
                                choppyitemfixclass_5.anInt1674 = 0;
                            }
                        } else if (class177_12.aShort2212 >= 0) {
                            i_39 = -16777216;
                            if (bool_59) {
                                i_39 = -1694498816;
                            }

                            choppyitemfixclass_5.method2424(true, true, false, f_30, f_32, f_36, f_29, f_31, f_35, f_25, f_26, f_28, f_21, f_22, f_24, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, i_39 | class177_12.anInt2209 & 0xffffff, i_39 | class177_12.anInt2204 & 0xffffff, i_39 | class177_12.anInt2206 & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class177_12.aShort2212);
                        } else {
                            if (bool_59) {
                                choppyitemfixclass_5.anInt1674 = 100;
                            }

                            choppyitemfixclass_5.method2425(true, true, false, f_30, f_32, f_36, f_29, f_31, f_35, f_25, f_26, f_28, class177_12.anInt2209, class177_12.anInt2204, class177_12.anInt2206);
                            choppyitemfixclass_5.anInt1674 = 0;
                        }
                    } else {
                        choppyitemfixclass_5.method2428(true, true, false, f_30, f_32, f_36, f_29, f_31, f_35, f_25, f_26, f_28, class185_4.anInt2307);
                    }
                }
            }
        } else {
            Class196 class196_54 = aClass196ArrayArray9337[i_1][i_2];
            if (class196_54 != null) {
                if (i_11 != 0) {
                    if ((class196_54.aByte2414 & 0x4) != 0) {
                        if ((i_11 & 0x1) != 0) {
                            return;
                        }
                    } else if ((i_11 & 0x2) != 0) {
                        return;
                    }
                }

                int i_55;
                for (i_14 = 0; i_14 < class196_54.aShort2421; i_14++) {
                    i_15 = class196_54.aShortArray2416[i_14] + (i_1 << tileScale);
                    i_16 = class196_54.aShortArray2417[i_14];
                    i_55 = class196_54.aShortArray2418[i_14] + (i_2 << tileScale);
                    f_18 = aFloat9333 + aFloat9341 * i_15 + aFloat9334 * i_16 + aFloat9349 * i_55;
                    f_19 = aFloat9354 + aFloat9342 * i_15 + aFloat9346 * i_16 + aFloat9350 * i_55;
                    if (f_18 < -f_19) {
                        return;
                    }

                    f_20 = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_18 / f_19;
                    floats_10[i_14] = 0.0F;
                    if (bool_3) {
                        f_21 = f_18 - class185_4.aFloat2305;
                        if (f_21 > 0.0F) {
                            f_21 /= class185_4.aFloat2303;
                            if (f_21 > 1.0F) {
                                f_21 = 1.0F;
                            }

                            floats_10[i_14] = f_21;
                            int i_56 = (int) (class196_54.aShortArray2419[i_14] * f_21);
                            if (i_56 > 0) {
                                i_16 -= i_56;
                            }
                        }
                    } else if (class185_4.aBool2304) {
                        f_21 = f_18 - class185_4.aFloat2305;
                        if (f_21 > 0.0F) {
                            floats_10[i_14] = f_21 / class185_4.aFloat2303;
                            if (floats_10[i_14] > 1.0F) {
                                floats_10[i_14] = 1.0F;
                            }
                        }
                    }

                    f_21 = aFloat9351 + aFloat9338 * i_15 + aFloat9343 * i_16 + aFloat9339 * i_55;
                    f_22 = aFloat9328 + aFloat9340 * i_15 + aFloat9344 * i_16 + aFloat9327 * i_55;
                    floats_6[i_14] = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_21 / f_19;
                    floats_7[i_14] = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_22 / f_19;
                    floats_8[i_14] = f_20;
                    floats_9[i_14] = f_19;
                }

                if (class196_54.aShortArray2413 != null) {
                    for (i_14 = 0; i_14 < class196_54.aShort2415; i_14++) {
                        i_15 = i_14 * 3;
                        i_16 = i_15 + 1;
                        i_55 = i_16 + 1;
                        f_18 = floats_6[i_15];
                        f_19 = floats_6[i_16];
                        f_20 = floats_6[i_55];
                        f_21 = floats_7[i_15];
                        f_22 = floats_7[i_16];
                        f_23 = floats_7[i_55];
                        f_24 = floats_10[i_15] + floats_10[i_16] + floats_10[i_55];
                        if ((f_18 - f_19) * (f_23 - f_22) - (f_21 - f_22) * (f_20 - f_19) > 0.0F) {
                            choppyitemfixclass_5.aBool1708 = f_18 < 0.0F || f_19 < 0.0F || f_20 < 0.0F || f_18 > choppyitemfixclass_5.anInt1684 || f_19 > choppyitemfixclass_5.anInt1684 || f_20 > choppyitemfixclass_5.anInt1684;
                            short s_57 = class196_54.aShortArray2413[i_14];
                            if (f_24 < 3.0F) {
                                int i_58;
                                if (f_24 > 0.0F) {
                                    if (s_57 != -1) {
                                        i_58 = -16777216;
                                        if (s_57 != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(s_57).effectId)) {
                                            i_58 = -1694498816;
                                        }

                                        choppyitemfixclass_5.method2424(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], floats_9[i_15], floats_9[i_16], floats_9[i_55], (float) class196_54.aShortArray2416[i_15] / tileUnits, (float) class196_54.aShortArray2416[i_16] / tileUnits, (float) class196_54.aShortArray2416[i_55] / tileUnits, (float) class196_54.aShortArray2418[i_15] / tileUnits, (float) class196_54.aShortArray2418[i_16] / tileUnits, (float) class196_54.aShortArray2418[i_55] / tileUnits, i_58 | class196_54.anIntArray2420[i_15] & 0xffffff, i_58 | class196_54.anIntArray2420[i_16] & 0xffffff, i_58 | class196_54.anIntArray2420[i_55] & 0xffffff, class185_4.anInt2307, floats_10[i_15] * 255.0F, floats_10[i_16] * 255.0F, floats_10[i_55] * 255.0F, s_57);
                                    } else if ((class196_54.anIntArray2420[i_15] & 0xffffff) != 0) {
                                        if (s_57 != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(s_57).effectId)) {
                                            choppyitemfixclass_5.anInt1674 = -1694498816;
                                        }

                                        choppyitemfixclass_5.method2425(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], ImageIndexLoader.method5773(class196_54.anIntArray2420[i_15], (int) (floats_10[i_15] * 255.0F) << 24 | class185_4.anInt2307), ImageIndexLoader.method5773(class196_54.anIntArray2420[i_16], (int) (floats_10[i_16] * 255.0F) << 24 | class185_4.anInt2307), ImageIndexLoader.method5773(class196_54.anIntArray2420[i_55], (int) (floats_10[i_55] * 255.0F) << 24 | class185_4.anInt2307));
                                        choppyitemfixclass_5.anInt1674 = 0;
                                    }
                                } else if (s_57 != -1) {
                                    i_58 = -16777216;
                                    if (s_57 != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(s_57).effectId)) {
                                        i_58 = -1694498816;
                                    }

                                    choppyitemfixclass_5.method2424(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], floats_9[i_15], floats_9[i_16], floats_9[i_55], (float) class196_54.aShortArray2416[i_15] / tileUnits, (float) class196_54.aShortArray2416[i_16] / tileUnits, (float) class196_54.aShortArray2416[i_55] / tileUnits, (float) class196_54.aShortArray2418[i_15] / tileUnits, (float) class196_54.aShortArray2418[i_16] / tileUnits, (float) class196_54.aShortArray2418[i_55] / tileUnits, i_58 | class196_54.anIntArray2420[i_15] & 0xffffff, i_58 | class196_54.anIntArray2420[i_16] & 0xffffff, i_58 | class196_54.anIntArray2420[i_55] & 0xffffff, 0, 0.0F, 0.0F, 0.0F, s_57);
                                } else if ((class196_54.anIntArray2420[i_15] & 0xffffff) != 0) {
                                    if (s_57 != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(s_57).effectId)) {
                                        choppyitemfixclass_5.anInt1674 = -1694498816;
                                    }

                                    choppyitemfixclass_5.method2425(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], class196_54.anIntArray2420[i_15], class196_54.anIntArray2420[i_16], class196_54.anIntArray2420[i_55]);
                                    choppyitemfixclass_5.anInt1674 = 0;
                                }
                            } else {
                                choppyitemfixclass_5.method2428(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], class185_4.anInt2307);
                            }
                        }
                    }
                } else {
                    for (i_14 = 0; i_14 < class196_54.aShort2415; i_14++) {
                        i_15 = i_14 * 3;
                        i_16 = i_15 + 1;
                        i_55 = i_16 + 1;
                        f_18 = floats_6[i_15];
                        f_19 = floats_6[i_16];
                        f_20 = floats_6[i_55];
                        f_21 = floats_7[i_15];
                        f_22 = floats_7[i_16];
                        f_23 = floats_7[i_55];
                        f_24 = floats_10[i_15] + floats_10[i_16] + floats_10[i_55];
                        if ((f_18 - f_19) * (f_23 - f_22) - (f_21 - f_22) * (f_20 - f_19) > 0.0F) {
                            choppyitemfixclass_5.aBool1708 = f_18 < 0.0F || f_19 < 0.0F || f_20 < 0.0F || f_18 > choppyitemfixclass_5.anInt1684 || f_19 > choppyitemfixclass_5.anInt1684 || f_20 > choppyitemfixclass_5.anInt1684;
                            if (f_24 < 3.0F) {
                                if (f_24 > 0.0F) {
                                    if ((class196_54.anIntArray2420[i_15] & 0xffffff) != 0) {
                                        choppyitemfixclass_5.method2425(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], Class302.method5364(class196_54.anIntArray2420[i_15], class185_4.anInt2307, floats_10[i_15] * 255.0F), Class302.method5364(class196_54.anIntArray2420[i_16], class185_4.anInt2307, floats_10[i_16] * 255.0F), Class302.method5364(class196_54.anIntArray2420[i_55], class185_4.anInt2307, floats_10[i_55] * 255.0F));
                                    }
                                } else if ((class196_54.anIntArray2420[i_15] & 0xffffff) != 0) {
                                    choppyitemfixclass_5.method2425(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], class196_54.anIntArray2420[i_15], class196_54.anIntArray2420[i_16], class196_54.anIntArray2420[i_55]);
                                }
                            } else {
                                choppyitemfixclass_5.method2428(true, true, false, f_21, f_22, f_23, f_18, f_19, f_20, floats_8[i_15], floats_8[i_16], floats_8[i_55], class185_4.anInt2307);
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    public void z(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public void method6717(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5) {
        if (aGraphicalRenderer_Sub3_9353.anIntArray8979 != null && aGraphicalRenderer_Sub3_9353.aFloatArray9010 != null) {
            Matrix44 matrix44_7 = aGraphicalRenderer_Sub3_9353.aClass384_8996;
            aFloat9338 = matrix44_7.buf[0];
            aFloat9340 = matrix44_7.buf[1];
            aFloat9341 = matrix44_7.buf[2];
            aFloat9342 = matrix44_7.buf[3];
            aFloat9343 = matrix44_7.buf[4];
            aFloat9344 = matrix44_7.buf[5];
            aFloat9334 = matrix44_7.buf[6];
            aFloat9346 = matrix44_7.buf[7];
            aFloat9339 = matrix44_7.buf[8];
            aFloat9327 = matrix44_7.buf[9];
            aFloat9349 = matrix44_7.buf[10];
            aFloat9350 = matrix44_7.buf[11];
            aFloat9351 = matrix44_7.buf[12];
            aFloat9328 = matrix44_7.buf[13];
            aFloat9333 = matrix44_7.buf[14];
            aFloat9354 = matrix44_7.buf[15];

            for (int i_8 = 0; i_8 < i_3 + i_3; i_8++) {
                for (int i_9 = 0; i_9 < i_3 + i_3; i_9++) {
                    if (bools_4[i_8][i_9]) {
                        int i_10 = i_8 + (i_1 - i_3);
                        int i_11 = i_9 + (i_2 - i_3);
                        if (i_10 >= 0 && i_10 < width && i_11 >= 0 && i_11 < length) {
                            method14638(i_10, i_11, 0);
                        }
                    }
                }
            }

        } else {
            throw new IllegalStateException("");
        }
    }

    void method14618(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8, Class185 class185_9, ChoppyItemFixClass choppyitemfixclass_10, float[] floats_11, float[] floats_12) {
        int i_13 = i_3 * (i_7 - i_5) / 256;
        int i_14 = i_3 >> 8;
        boolean bool_15 = class185_9.aBool2334;
        aGraphicalRenderer_Sub3_9353.RA(false);
        choppyitemfixclass_10.aBool1675 = false;
        choppyitemfixclass_10.aBool1672 = false;
        int i_16 = i_1;
        int i_17 = i_13 + i_2;

        for (int i_18 = i_4; i_18 < i_6; i_18++) {
            for (int i_19 = i_5; i_19 < i_7; i_19++) {
                if (bools_8[i_18 - i_4][i_19 - i_5]) {
                    int i_21;
                    int i_22;
                    int i_23;
                    int i_24;
                    float f_25;
                    float f_26;
                    float f_27;
                    float f_28;
                    float f_29;
                    float f_30;
                    int i_31;
                    if (aClass177ArrayArray9336 != null) {
                        if (aClass177ArrayArray9336[i_18][i_19] != null) {
                            Class177 class177_33 = aClass177ArrayArray9336[i_18][i_19];
                            if (class177_33.aShort2212 != -1 && (class177_33.aByte2210 & 0x2) == 0 && class177_33.anInt2203 == 0) {
                                i_21 = aGraphicalRenderer_Sub3_9353.method14362(class177_33.aShort2212);
                                choppyitemfixclass_10.method2426(true, true, false, (i_17 - i_14), (i_17 - i_14), i_17, (i_16 + i_14), i_16, (i_16 + i_14), 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_21, class177_33.anInt2211), MaterialProp20.method15076(i_21, class177_33.anInt2206), MaterialProp20.method15076(i_21, class177_33.anInt2204));
                                choppyitemfixclass_10.method2426(true, true, false, i_17, i_17, (i_17 - i_14), i_16, (i_16 + i_14), i_16, 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_21, class177_33.anInt2209), MaterialProp20.method15076(i_21, class177_33.anInt2204), MaterialProp20.method15076(i_21, class177_33.anInt2206));
                            } else if (class177_33.anInt2203 == 0) {
                                choppyitemfixclass_10.method2425(true, true, false, (i_17 - i_14), (i_17 - i_14), i_17, (i_16 + i_14), i_16, (i_16 + i_14), 100.0F, 100.0F, 100.0F, class177_33.anInt2211, class177_33.anInt2206, class177_33.anInt2204);
                                choppyitemfixclass_10.method2425(true, true, false, i_17, i_17, (i_17 - i_14), i_16, (i_16 + i_14), i_16, 100.0F, 100.0F, 100.0F, class177_33.anInt2209, class177_33.anInt2204, class177_33.anInt2206);
                            } else {
                                i_21 = class177_33.anInt2203;
                                choppyitemfixclass_10.method2425(true, true, false, (i_17 - i_14), (i_17 - i_14), i_17, (i_16 + i_14), i_16, (i_16 + i_14), 100.0F, 100.0F, 100.0F, ImageIndexLoader.method5773(i_21, class177_33.anInt2211 & -16777216), ImageIndexLoader.method5773(i_21, class177_33.anInt2206 & -16777216), ImageIndexLoader.method5773(i_21, class177_33.anInt2204 & -16777216));
                                choppyitemfixclass_10.method2425(true, true, false, i_17, i_17, (i_17 - i_14), i_16, (i_16 + i_14), i_16, 100.0F, 100.0F, 100.0F, ImageIndexLoader.method5773(i_21, class177_33.anInt2209 & -16777216), ImageIndexLoader.method5773(i_21, class177_33.anInt2204 & -16777216), ImageIndexLoader.method5773(i_21, class177_33.anInt2206 & -16777216));
                            }
                        } else if (aClass196ArrayArray9337[i_18][i_19] != null) {
                            Class196 class196_32 = aClass196ArrayArray9337[i_18][i_19];

                            for (i_21 = 0; i_21 < class196_32.aShort2421; i_21++) {
                                floats_11[i_21] = (i_16 + class196_32.aShortArray2416[i_21] * i_14 / tileUnits);
                                floats_12[i_21] = (i_17 - class196_32.aShortArray2418[i_21] * i_14 / tileUnits);
                            }

                            for (i_21 = 0; i_21 < class196_32.aShort2415; i_21++) {
                                i_22 = i_21 * 3;
                                i_23 = i_22 + 1;
                                i_24 = i_23 + 1;
                                f_25 = floats_11[i_22];
                                f_26 = floats_11[i_23];
                                f_27 = floats_11[i_24];
                                f_28 = floats_12[i_22];
                                f_29 = floats_12[i_23];
                                f_30 = floats_12[i_24];
                                if (class196_32.anIntArray2423 == null || class196_32.anIntArray2423[i_21] == 0 || class196_32.aShortArray2413 != null && (class196_32.aShortArray2413 == null || class196_32.aShortArray2413[i_21] != -1)) {
                                    if (class196_32.aShortArray2413 != null && class196_32.aShortArray2413[i_21] != -1) {
                                        i_31 = aGraphicalRenderer_Sub3_9353.method14362(class196_32.aShortArray2413[i_21]);
                                        choppyitemfixclass_10.method2426(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, i_31, i_31, i_31);
                                    } else {
                                        choppyitemfixclass_10.method2425(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, class196_32.anIntArray2420[i_22], class196_32.anIntArray2420[i_23], class196_32.anIntArray2420[i_24]);
                                    }
                                } else {
                                    i_31 = class196_32.anIntArray2423[i_21];
                                    choppyitemfixclass_10.method2425(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, ImageIndexLoader.method5773(i_31, -16777216 - (class196_32.anIntArray2420[i_22] & -16777216)), ImageIndexLoader.method5773(i_31, -16777216 - (class196_32.anIntArray2420[i_23] & -16777216)), ImageIndexLoader.method5773(i_31, -16777216 - (class196_32.anIntArray2420[i_24] & -16777216)));
                                }
                            }
                        }
                    } else if (aClass181ArrayArray9335[i_18][i_19] != null) {
                        Class181 class181_20 = aClass181ArrayArray9335[i_18][i_19];

                        for (i_21 = 0; i_21 < class181_20.aShort2248; i_21++) {
                            floats_11[i_21] = (i_16 + class181_20.aShortArray2249[i_21] * i_14 / tileUnits);
                            floats_12[i_21] = (i_17 - class181_20.aShortArray2247[i_21] * i_14 / tileUnits);
                        }

                        for (i_21 = 0; i_21 < class181_20.aShort2250; i_21++) {
                            i_22 = i_21 * 3;
                            i_23 = i_22 + 1;
                            i_24 = i_23 + 1;
                            f_25 = floats_11[i_22];
                            f_26 = floats_11[i_23];
                            f_27 = floats_11[i_24];
                            f_28 = floats_12[i_22];
                            f_29 = floats_12[i_23];
                            f_30 = floats_12[i_24];
                            if (class181_20.anIntArray2257 != null && class181_20.anIntArray2257[i_21] != 0) {
                                i_31 = class181_20.anIntArray2257[i_21];
                                choppyitemfixclass_10.method2425(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, i_31, i_31, i_31);
                            } else {
                                choppyitemfixclass_10.method2425(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, class181_20.anIntArray2251[i_22], class181_20.anIntArray2251[i_23], class181_20.anIntArray2251[i_24]);
                            }
                        }
                    }
                }

                i_17 -= i_14;
            }

            i_17 = i_13 + i_2;
            i_16 += i_14;
        }

        choppyitemfixclass_10.aBool1675 = true;
        aGraphicalRenderer_Sub3_9353.RA(bool_15);
    }

    void method14619(int i_1, int i_2, boolean bool_3, Class185 class185_4, ChoppyItemFixClass choppyitemfixclass_5, float[] floats_6, float[] floats_7, float[] floats_8, float[] floats_9, float[] floats_10, int i_11) {
        Class181 class181_12 = aClass181ArrayArray9335[i_1][i_2];
        if ((i_11 == 0 || (i_11 & 0x2) == 0) && class181_12 != null) {
            int i_14;
            int i_15;
            int i_16;
            float f_18;
            float f_19;
            float f_28;
            for (int i_13 = 0; i_13 < class181_12.aShort2248; i_13++) {
                i_14 = class181_12.aShortArray2249[i_13] + (i_1 << tileScale);
                i_15 = class181_12.aShortArray2255[i_13];
                i_16 = class181_12.aShortArray2247[i_13] + (i_2 << tileScale);
                float f_17 = aFloat9333 + aFloat9341 * i_14 + aFloat9334 * i_15 + aFloat9349 * i_16;
                f_18 = aFloat9354 + aFloat9342 * i_14 + aFloat9346 * i_15 + aFloat9350 * i_16;
                if (f_17 < -f_18) {
                    return;
                }

                floats_10[i_13] = 0.0F;
                if (bool_3) {
                    f_19 = f_17 - class185_4.aFloat2305;
                    if (f_19 > 0.0F) {
                        f_19 /= class185_4.aFloat2303;
                        if (f_19 > 1.0F) {
                            f_19 = 1.0F;
                        }

                        floats_10[i_13] = f_19;
                        int i_20 = (int) (class181_12.aShortArray2252[i_13] * f_19);
                        if (i_20 > 0) {
                            i_15 -= i_20;
                        }
                    }
                } else if (class185_4.aBool2304) {
                    f_19 = f_17 - class185_4.aFloat2305;
                    if (f_19 > 0.0F) {
                        floats_10[i_13] = f_19 / class185_4.aFloat2303;
                        if (floats_10[i_13] > 1.0F) {
                            floats_10[i_13] = 1.0F;
                        }
                    }
                }

                f_19 = aFloat9351 + aFloat9338 * i_14 + aFloat9343 * i_15 + aFloat9339 * i_16;
                f_28 = aFloat9328 + aFloat9340 * i_14 + aFloat9344 * i_15 + aFloat9327 * i_16;
                floats_6[i_13] = choppyitemfixclass_5.aFloat1678 + choppyitemfixclass_5.aFloat1679 * f_19 / f_18;
                floats_7[i_13] = choppyitemfixclass_5.aFloat1680 + choppyitemfixclass_5.aFloat1702 * f_28 / f_18;
                floats_8[i_13] = choppyitemfixclass_5.aFloat1682 + choppyitemfixclass_5.aFloat1683 * f_17 / f_18;
                floats_9[i_13] = f_18;
            }

            float f_26 = tileUnits;

            for (i_14 = 0; i_14 < class181_12.aShort2250; i_14++) {
                i_15 = i_14 * 3;
                i_16 = i_15 + 1;
                int i_27 = i_16 + 1;
                f_18 = floats_6[i_15];
                f_19 = floats_6[i_16];
                f_28 = floats_6[i_27];
                float f_21 = floats_7[i_15];
                float f_22 = floats_7[i_16];
                float f_23 = floats_7[i_27];
                if ((f_18 - f_19) * (f_23 - f_22) - (f_21 - f_22) * (f_28 - f_19) > 0.0F) {
                    choppyitemfixclass_5.aBool1708 = f_18 < 0.0F || f_19 < 0.0F || f_28 < 0.0F || f_18 > choppyitemfixclass_5.anInt1684 || f_19 > choppyitemfixclass_5.anInt1684 || f_28 > choppyitemfixclass_5.anInt1684;
                    if (floats_10[i_15] + floats_10[i_16] + floats_10[i_27] < 3.0F) {
                        int i_24 = i_1 << tileScale;
                        int i_25 = i_2 << tileScale;
                        if ((class181_12.anIntArray2251[i_15] & 0xffffff) != 0) {
                            if (class181_12.aShortArray2253[i_15] == class181_12.aShortArray2253[i_16] && class181_12.aShortArray2253[i_15] == class181_12.aShortArray2253[i_27] && class181_12.aShortArray2254[i_15] == class181_12.aShortArray2254[i_16] && class181_12.aShortArray2254[i_15] == class181_12.aShortArray2254[i_27]) {
                                choppyitemfixclass_5.method2424(true, true, false, f_21, f_22, f_23, f_18, f_19, f_28, floats_8[i_15], floats_8[i_16], floats_8[i_27], floats_9[i_15], floats_9[i_16], floats_9[i_27], (float) (class181_12.aShortArray2249[i_15] + i_24) / class181_12.aShortArray2254[i_15], (float) (class181_12.aShortArray2249[i_16] + i_24) / class181_12.aShortArray2254[i_16], (float) (class181_12.aShortArray2249[i_27] + i_24) / class181_12.aShortArray2254[i_27], (float) (class181_12.aShortArray2247[i_15] + i_25) / class181_12.aShortArray2254[i_15], (float) (class181_12.aShortArray2247[i_16] + i_25) / class181_12.aShortArray2254[i_16], (float) (class181_12.aShortArray2247[i_27] + i_25) / class181_12.aShortArray2254[i_27], class181_12.anIntArray2251[i_15], class181_12.anIntArray2251[i_16], class181_12.anIntArray2251[i_27], class185_4.anInt2307, floats_10[i_15] * 255.0F, floats_10[i_16] * 255.0F, floats_10[i_27] * 255.0F, class181_12.aShortArray2253[i_15]);
                            } else {
                                choppyitemfixclass_5.method2421(f_21, f_22, f_23, f_18, f_19, f_28, floats_8[i_15], floats_8[i_16], floats_8[i_27], floats_9[i_15], floats_9[i_16], floats_9[i_27], (class181_12.aShortArray2249[i_15] + i_24) / f_26, (class181_12.aShortArray2249[i_16] + i_24) / f_26, (class181_12.aShortArray2249[i_27] + i_24) / f_26, (class181_12.aShortArray2247[i_15] + i_25) / f_26, (class181_12.aShortArray2247[i_16] + i_25) / f_26, (class181_12.aShortArray2247[i_27] + i_25) / f_26, class181_12.anIntArray2251[i_15], class181_12.anIntArray2251[i_16], class181_12.anIntArray2251[i_27], class185_4.anInt2307, floats_10[i_15] * 255.0F, floats_10[i_16] * 255.0F, floats_10[i_27] * 255.0F, class181_12.aShortArray2253[i_15], f_26 / class181_12.aShortArray2254[i_15], class181_12.aShortArray2253[i_16], f_26 / class181_12.aShortArray2254[i_16], class181_12.aShortArray2253[i_27], f_26 / class181_12.aShortArray2254[i_27]);
                            }
                        }
                    } else {
                        choppyitemfixclass_5.method2428(true, true, false, f_21, f_22, f_23, f_18, f_19, f_28, floats_8[i_15], floats_8[i_16], floats_8[i_27], class185_4.anInt2307);
                    }
                }
            }
        }

    }

    boolean method14620(int i_1) {
        return (anInt9345 & 0x8) != 0 && (i_1 == 4 || (i_1 == 8 || i_1 == 9));
    }

    void method14622(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8, Class185 class185_9, ChoppyItemFixClass choppyitemfixclass_10, float[] floats_11, float[] floats_12) {
        int i_13 = i_3 * (i_7 - i_5) / 256;
        int i_14 = i_3 >> 8;
        boolean bool_15 = class185_9.aBool2334;
        aGraphicalRenderer_Sub3_9353.RA(false);
        choppyitemfixclass_10.aBool1675 = false;
        choppyitemfixclass_10.aBool1672 = false;
        int i_16 = i_1;
        int i_17 = i_13 + i_2;

        for (int i_18 = i_4; i_18 < i_6; i_18++) {
            for (int i_19 = i_5; i_19 < i_7; i_19++) {
                if (bools_8[i_18 - i_4][i_19 - i_5]) {
                    int i_21;
                    if (aClass178ArrayArray9352[i_18][i_19] != null) {
                        Class178 class178_32 = aClass178ArrayArray9352[i_18][i_19];
                        if (class178_32.aShort2215 != -1 && (class178_32.aByte2219 & 0x2) == 0 && class178_32.anInt2213 == -1) {
                            i_21 = aGraphicalRenderer_Sub3_9353.method14362(class178_32.aShort2215);
                            choppyitemfixclass_10.method2426(true, true, false, (i_17 - i_14), (i_17 - i_14), i_17, (i_16 + i_14), i_16, (i_16 + i_14), 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_21, class178_32.aShort2216 & 0xffff), MaterialProp20.method15076(i_21, class178_32.aShort2218 & 0xffff), MaterialProp20.method15076(i_21, class178_32.aShort2217 & 0xffff));
                            choppyitemfixclass_10.method2426(true, true, false, i_17, i_17, (i_17 - i_14), i_16, (i_16 + i_14), i_16, 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_21, class178_32.aShort2214 & 0xffff), MaterialProp20.method15076(i_21, class178_32.aShort2217 & 0xffff), MaterialProp20.method15076(i_21, class178_32.aShort2218 & 0xffff));
                        } else if (class178_32.anInt2213 == -1) {
                            choppyitemfixclass_10.method2426(true, true, false, (i_17 - i_14), (i_17 - i_14), i_17, (i_16 + i_14), i_16, (i_16 + i_14), 100.0F, 100.0F, 100.0F, (class178_32.aShort2216 & 0xffff), (class178_32.aShort2218 & 0xffff), (class178_32.aShort2217 & 0xffff));
                            choppyitemfixclass_10.method2426(true, true, false, i_17, i_17, (i_17 - i_14), i_16, (i_16 + i_14), i_16, 100.0F, 100.0F, 100.0F, (class178_32.aShort2214 & 0xffff), (class178_32.aShort2217 & 0xffff), (class178_32.aShort2218 & 0xffff));
                        } else {
                            i_21 = class178_32.anInt2213;
                            choppyitemfixclass_10.method2426(true, true, false, (i_17 - i_14), (i_17 - i_14), i_17, (i_16 + i_14), i_16, (i_16 + i_14), 100.0F, 100.0F, 100.0F, i_21, i_21, i_21);
                            choppyitemfixclass_10.method2426(true, true, false, i_17, i_17, (i_17 - i_14), i_16, (i_16 + i_14), i_16, 100.0F, 100.0F, 100.0F, i_21, i_21, i_21);
                        }
                    } else if (aClass183ArrayArray9332[i_18][i_19] != null) {
                        Class183 class183_20 = aClass183ArrayArray9332[i_18][i_19];

                        for (i_21 = 0; i_21 < class183_20.aShort2265; i_21++) {
                            floats_11[i_21] = (i_16 + class183_20.aShortArray2267[i_21] * i_14 / tileUnits);
                            floats_12[i_21] = (i_17 - class183_20.aShortArray2264[i_21] * i_14 / tileUnits);
                        }

                        for (i_21 = 0; i_21 < class183_20.aShort2269; i_21++) {
                            short s_22 = class183_20.aShortArray2271[i_21];
                            short s_23 = class183_20.aShortArray2266[i_21];
                            short s_24 = class183_20.aShortArray2273[i_21];
                            float f_25 = floats_11[s_22];
                            float f_26 = floats_11[s_23];
                            float f_27 = floats_11[s_24];
                            float f_28 = floats_12[s_22];
                            float f_29 = floats_12[s_23];
                            float f_30 = floats_12[s_24];
                            int i_31;
                            if (class183_20.anIntArray2277 != null && class183_20.anIntArray2277[i_21] != -1) {
                                i_31 = class183_20.anIntArray2277[i_21];
                                choppyitemfixclass_10.method2426(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_22]), MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_23]), MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_24]));
                            } else if (class183_20.aShortArray2270 != null && class183_20.aShortArray2270[i_21] != -1) {
                                i_31 = aGraphicalRenderer_Sub3_9353.method14362(class183_20.aShortArray2270[i_21]);
                                choppyitemfixclass_10.method2426(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_22]), MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_23]), MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_24]));
                            } else {
                                i_31 = class183_20.anIntArray2272[i_21];
                                choppyitemfixclass_10.method2426(true, true, false, f_28, f_29, f_30, f_25, f_26, f_27, 100.0F, 100.0F, 100.0F, MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_22]), MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_23]), MaterialProp20.method15076(i_31, class183_20.aShortArray2274[s_24]));
                            }
                        }
                    }
                }

                i_17 -= i_14;
            }

            i_17 = i_13 + i_2;
            i_16 += i_14;
        }

        choppyitemfixclass_10.aBool1675 = true;
        aGraphicalRenderer_Sub3_9353.RA(bool_15);
    }

    @Override
    public void method6716(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5, int i_6) {
        if (aGraphicalRenderer_Sub3_9353.anIntArray8979 != null && aGraphicalRenderer_Sub3_9353.aFloatArray9010 != null) {
            Matrix44 matrix44_7 = aGraphicalRenderer_Sub3_9353.aClass384_8996;
            aFloat9338 = matrix44_7.buf[0];
            aFloat9340 = matrix44_7.buf[1];
            aFloat9341 = matrix44_7.buf[2];
            aFloat9342 = matrix44_7.buf[3];
            aFloat9343 = matrix44_7.buf[4];
            aFloat9344 = matrix44_7.buf[5];
            aFloat9334 = matrix44_7.buf[6];
            aFloat9346 = matrix44_7.buf[7];
            aFloat9339 = matrix44_7.buf[8];
            aFloat9327 = matrix44_7.buf[9];
            aFloat9349 = matrix44_7.buf[10];
            aFloat9350 = matrix44_7.buf[11];
            aFloat9351 = matrix44_7.buf[12];
            aFloat9328 = matrix44_7.buf[13];
            aFloat9333 = matrix44_7.buf[14];
            aFloat9354 = matrix44_7.buf[15];

            for (int i_8 = 0; i_8 < i_3 + i_3; i_8++) {
                for (int i_9 = 0; i_9 < i_3 + i_3; i_9++) {
                    if (bools_4[i_8][i_9]) {
                        int i_10 = i_1 - i_3 + i_8;
                        int i_11 = i_2 - i_3 + i_9;
                        if (i_10 >= 0 && i_10 < width && i_11 >= 0 && i_11 < length) {
                            method14638(i_10, i_11, i_6);
                        }
                    }
                }
            }

        } else {
            throw new IllegalStateException("");
        }
    }

    @Override
    public Shadow w(int i_1, int i_2, Shadow class282_sub50_sub17_3) {
        return null;
    }

    @Override
    public void UA(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public boolean method6712(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        return false;
    }

    @Override
    public Shadow s(int i_1, int i_2, Shadow class282_sub50_sub17_3) {
        return null;
    }

    @Override
    public void method6713(GLLight class282_sub24_1, int[] ints_2) {
    }

    @Override
    public void m(int i_1, int i_2, int i_3) {
        if (aByteArrayArray9356[i_1][i_2] < i_3) {
            aByteArrayArray9356[i_1][i_2] = (byte) i_3;
        }

    }

    @Override
    public void method6706(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, HDWaterTile class90_11, boolean bool_12) {
        boolean bool_13 = (anInt9345 & 0x20) == 0;
        if (aClass177ArrayArray9336 == null && !bool_13) {
            aClass177ArrayArray9336 = new Class177[width][length];
            aClass196ArrayArray9337 = new Class196[width][length];
        } else if (aClass181ArrayArray9335 == null && bool_13) {
            aClass181ArrayArray9335 = new Class181[width][length];
        } else if (aClass178ArrayArray9352 != null) {
            throw new IllegalStateException();
        }

        if (ints_3 != null && ints_3.length != 0) {
            int i_14;
            for (i_14 = 0; i_14 < ints_7.length; i_14++) {
                if (ints_7[i_14] == -1) {
                    ints_7[i_14] = 0;
                } else {
                    ints_7[i_14] = Class335.anIntArray3916[Class372.method6362(ints_7[i_14]) & 0xffff] << 8 | 0xff;
                }
            }

            if (ints_8 != null) {
                for (i_14 = 0; i_14 < ints_8.length; i_14++) {
                    if (ints_8[i_14] == -1) {
                        ints_8[i_14] = 0;
                    } else {
                        ints_8[i_14] = Class335.anIntArray3916[Class372.method6362(ints_8[i_14]) & 0xffff] << 8 | 0xff;
                    }
                }
            }

            int i_15;
            int i_16;
            int i_17;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            int i_34;
            if (bool_13) {
                Class181 class181_29 = new Class181();
                class181_29.aShort2248 = (short) ints_3.length;
                class181_29.aShort2250 = (short) (ints_3.length / 3);
                class181_29.aShortArray2249 = new short[class181_29.aShort2248];
                class181_29.aShortArray2255 = new short[class181_29.aShort2248];
                class181_29.aShortArray2247 = new short[class181_29.aShort2248];
                class181_29.anIntArray2251 = new int[class181_29.aShort2248];
                class181_29.aShortArray2253 = new short[class181_29.aShort2248];
                class181_29.aShortArray2254 = new short[class181_29.aShort2248];
                class181_29.aByteArray2256 = new byte[class181_29.aShort2248];
                if (ints_6 != null) {
                    class181_29.aShortArray2252 = new short[class181_29.aShort2248];
                }

                for (i_15 = 0; i_15 < class181_29.aShort2248; i_15++) {
                    i_16 = ints_3[i_15];
                    i_17 = ints_5[i_15];
                    boolean bool_18 = false;
                    if (i_16 == 0 && i_17 == 0) {
                        i_19 = aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2];
                    } else if (i_16 == 0 && i_17 == tileUnits) {
                        i_19 = aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1];
                    } else if (i_16 == tileUnits && i_17 == tileUnits) {
                        i_19 = aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1];
                    } else if (i_16 == tileUnits && i_17 == 0) {
                        i_19 = aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2];
                    } else {
                        i_20 = (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) * (tileUnits - i_16) + (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) * i_16;
                        i_21 = (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) * (tileUnits - i_16) + (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) * i_16;
                        i_19 = i_20 * (tileUnits - i_17) + i_21 * i_17 >> tileScale;
                    }

                    i_20 = (i_1 << tileScale) + i_16;
                    i_21 = (i_2 << tileScale) + i_17;
                    class181_29.aShortArray2249[i_15] = (short) i_16;
                    class181_29.aShortArray2247[i_15] = (short) i_17;
                    class181_29.aShortArray2255[i_15] = (short) (averageHeight(i_20, i_21) + (ints_4 != null ? ints_4[i_15] : 0));
                    if (i_19 < 0) {
                        i_19 = 0;
                    }

                    if (ints_7[i_15] == 0) {
                        class181_29.anIntArray2251[i_15] = 0;
                    } else {
                        i_22 = 0;
                        if (ints_6 != null) {
                            short s_23 = class181_29.aShortArray2252[i_15] = (short) ints_6[i_15];
                            if (class90_11.scale != 0) {
                                i_22 = 255 * s_23 / (class90_11.scale);
                                if (i_22 < 0) {
                                    i_22 = 0;
                                } else if (i_22 > 255) {
                                    i_22 = 255;
                                }
                            }
                        }

                        i_34 = -16777216;
                        if (ints_9[i_15] != -1 && method14620(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(ints_9[i_15]).effectId)) {
                            i_34 = -1694498816;
                        }

                        class181_29.anIntArray2251[i_15] = i_34 | FontRenderer_Sub3.method14337(method14616(ints_7[i_15] >> 8, i_19), class90_11.color, i_22);
                    }
                    if (ints_8 != null) {
                        class181_29.aByteArray2256[i_15] = (byte) i_19;
                    }

                    class181_29.aShortArray2253[i_15] = (short) ints_9[i_15];
                    class181_29.aShortArray2254[i_15] = (short) ints_10[i_15];
                }

                if (ints_8 != null) {
                    class181_29.anIntArray2257 = new int[class181_29.aShort2250];
                }

                for (i_15 = 0; i_15 < class181_29.aShort2250; i_15++) {
                    i_16 = i_15 * 3;
                    if (ints_8 != null && ints_8[i_16] != 0) {
                        class181_29.anIntArray2257[i_15] = -16777216 | ints_8[i_16] >> 8;
                    }
                }

                aClass181ArrayArray9335[i_1][i_2] = class181_29;
            } else {
                boolean bool_31 = true;
                i_15 = -1;
                i_16 = -1;
                i_17 = -1;
                int i_32 = -1;
                if (ints_3.length != 6) {
                    bool_31 = false;
                } else {
                    for (i_19 = 0; i_19 < 6; i_19++) {
                        if (ints_3[i_19] == 0 && ints_5[i_19] == 0) {
                            if (i_15 != -1 && ints_7[i_15] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_15 = i_19;
                        } else if (ints_3[i_19] == tileUnits && ints_5[i_19] == 0) {
                            if (i_16 != -1 && ints_7[i_16] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_16 = i_19;
                        } else if (ints_3[i_19] == tileUnits && ints_5[i_19] == tileUnits) {
                            if (i_17 != -1 && ints_7[i_17] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_17 = i_19;
                        } else if (ints_3[i_19] == 0 && ints_5[i_19] == tileUnits) {
                            if (i_32 != -1 && ints_7[i_32] != ints_7[i_19]) {
                                bool_31 = false;
                                break;
                            }

                            i_32 = i_19;
                        }
                    }

                    if (i_15 == -1 || i_16 == -1 || i_17 == -1 || i_32 == -1) {
                        bool_31 = false;
                    }

                    if (bool_31) {
                        if (ints_4 != null) {
                            for (i_19 = 0; i_19 < 4; i_19++) {
                                if (ints_4[i_19] != 0) {
                                    bool_31 = false;
                                    break;
                                }
                            }
                        }

                        if (bool_31) {
                            for (i_19 = 1; i_19 < 4; i_19++) {
                                if (ints_3[i_19] != ints_3[0] && ints_3[i_19] != ints_3[0] + tileUnits && ints_3[i_19] != ints_3[0] - tileUnits) {
                                    bool_31 = false;
                                    break;
                                }

                                if (ints_5[i_19] != ints_5[0] && ints_5[i_19] != ints_5[0] + tileUnits && ints_5[i_19] != ints_5[0] - tileUnits) {
                                    bool_31 = false;
                                    break;
                                }
                            }
                        }
                    }
                }

                if (bool_31) {
                    Class177 class177_30 = new Class177();
                    i_20 = ints_7[0];
                    i_21 = ints_9[0];
                    if (ints_8 != null) {
                        class177_30.anInt2203 = ints_8[0] >> 8;
                        if (i_20 == 0) {
                            class177_30.aByte2210 |= 0x2;
                        }
                    } else if (i_20 == 0) {
                        return;
                    }

                    if (tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2] && tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2 + 1] && tileHeights[i_1][i_2] == tileHeights[i_1][i_2 + 1]) {
                        class177_30.aByte2210 |= 0x1;
                    }

                    if (i_21 != -1 && (class177_30.aByte2210 & 0x2) == 0 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_21).isGroundMesh) {
                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_15] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2209 = FontRenderer_Sub3.method14337(method14616(ints_7[i_15] >> 8, aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2209 |= 255 - (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_16] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2204 = FontRenderer_Sub3.method14337(method14616(ints_7[i_16] >> 8, aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2204 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_17] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2211 = FontRenderer_Sub3.method14337(method14616(ints_7[i_17] >> 8, aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2211 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_32] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2206 = FontRenderer_Sub3.method14337(method14616(ints_7[i_32] >> 8, aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]), class90_11.color, i_22);
                        class177_30.aShort2212 = (short) i_21;
                    } else {
                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_15] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2209 = FontRenderer_Sub3.method14337(method14616(ints_7[i_15] >> 8, aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2209 |= 255 - (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_16] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2204 = FontRenderer_Sub3.method14337(method14616(ints_7[i_16] >> 8, aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2204 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_17] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2211 = FontRenderer_Sub3.method14337(method14616(ints_7[i_17] >> 8, aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2211 |= 255 - (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) << 25;
                        }

                        if (ints_6 != null && class90_11.scale != 0) {
                            i_22 = 255 * ints_6[i_32] / (class90_11.scale);
                            if (i_22 < 0) {
                                i_22 = 0;
                            } else if (i_22 > 255) {
                                i_22 = 255;
                            }
                        } else {
                            i_22 = 0;
                        }

                        class177_30.anInt2206 = FontRenderer_Sub3.method14337(method14616(ints_7[i_32] >> 8, aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]), class90_11.color, i_22);
                        if (class177_30.anInt2203 != 0) {
                            class177_30.anInt2206 |= 255 - (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) << 25;
                        }

                        class177_30.aShort2212 = -1;
                    }

                    if (ints_6 != null) {
                        class177_30.aShort2208 = (short) ints_6[i_17];
                        class177_30.aShort2205 = (short) ints_6[i_32];
                        class177_30.aShort2202 = (short) ints_6[i_16];
                        class177_30.aShort2207 = (short) ints_6[i_15];
                    }

                    aClass177ArrayArray9336[i_1][i_2] = class177_30;
                } else {
                    Class196 class196_38 = new Class196();
                    class196_38.aShort2421 = (short) ints_3.length;
                    class196_38.aShort2415 = (short) (ints_3.length / 3);
                    class196_38.aShortArray2416 = new short[class196_38.aShort2421];
                    class196_38.aShortArray2417 = new short[class196_38.aShort2421];
                    class196_38.aShortArray2418 = new short[class196_38.aShort2421];
                    class196_38.anIntArray2420 = new int[class196_38.aShort2421];
                    if (ints_6 != null) {
                        class196_38.aShortArray2419 = new short[class196_38.aShort2421];
                    }

                    int i_24;
                    int i_27;
                    for (i_20 = 0; i_20 < class196_38.aShort2421; i_20++) {
                        i_21 = ints_3[i_20];
                        i_22 = ints_5[i_20];
                        boolean bool_35 = false;
                        int i_25;
                        int i_26;
                        if (i_21 == 0 && i_22 == 0) {
                            i_24 = aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2];
                        } else if (i_21 == 0 && i_22 == tileUnits) {
                            i_24 = aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1];
                        } else if (i_21 == tileUnits && i_22 == tileUnits) {
                            i_24 = aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1];
                        } else if (i_21 == tileUnits && i_22 == 0) {
                            i_24 = aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2];
                        } else {
                            i_25 = (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) * (tileUnits - i_21) + (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) * i_21;
                            i_26 = (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) * (tileUnits - i_21) + (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) * i_21;
                            i_24 = i_25 * (tileUnits - i_22) + i_26 * i_22 >> tileScale;
                        }

                        i_25 = (i_1 << tileScale) + i_21;
                        i_26 = (i_2 << tileScale) + i_22;
                        class196_38.aShortArray2416[i_20] = (short) i_21;
                        class196_38.aShortArray2418[i_20] = (short) i_22;
                        class196_38.aShortArray2417[i_20] = (short) (averageHeight(i_25, i_26) + (ints_4 != null ? ints_4[i_20] : 0));
                        if (i_24 < 0) {
                            i_24 = 0;
                        }

                        if (ints_7[i_20] == 0) {
                            if (ints_8 != null) {
                                class196_38.anIntArray2420[i_20] = i_24 << 25;
                            } else {
                                class196_38.anIntArray2420[i_20] = 0;
                            }
                        } else {
                            i_27 = 0;
                            if (ints_6 != null) {
                                short s_28 = class196_38.aShortArray2419[i_20] = (short) ints_6[i_20];
                                if (class90_11.scale != 0) {
                                    i_27 = 255 * s_28 / (class90_11.scale);
                                    if (i_27 < 0) {
                                        i_27 = 0;
                                    } else if (i_27 > 255) {
                                        i_27 = 255;
                                    }
                                }
                            }

                            class196_38.anIntArray2420[i_20] = FontRenderer_Sub3.method14337(method14616(ints_7[i_20] >> 8, i_24), class90_11.color, i_27);
                            if (ints_8 != null) {
                                class196_38.anIntArray2420[i_20] |= i_24 << 25;
                            }
                        }
                    }

                    boolean bool_33 = false;

                    for (i_21 = 0; i_21 < class196_38.aShort2415; i_21++) {
                        if (ints_9[i_21 * 3] != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(ints_9[i_21 * 3]).isGroundMesh) {
                            bool_33 = true;
                        }
                    }

                    if (ints_8 != null) {
                        class196_38.anIntArray2423 = new int[class196_38.aShort2415];
                    }

                    if (bool_33) {
                        class196_38.aShortArray2413 = new short[class196_38.aShort2415];
                        class196_38.aShortArray2422 = new short[class196_38.aShort2415];
                    }

                    for (i_21 = 0; i_21 < class196_38.aShort2415; i_21++) {
                        i_22 = i_21 * 3;
                        if (ints_8 != null && ints_8[i_22] != 0) {
                            class196_38.anIntArray2423[i_21] = ints_8[i_22] >> 8;
                        }

                        if (bool_33) {
                            i_34 = i_22 + 1;
                            i_24 = i_34 + 1;
                            boolean bool_36 = false;
                            boolean bool_37 = true;
                            i_27 = ints_9[i_22];
                            if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                bool_36 = true;
                            } else {
                                bool_37 = false;
                            }

                            i_27 = ints_9[i_34];
                            if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                bool_36 = true;
                            } else {
                                bool_37 = false;
                            }

                            i_27 = ints_9[i_24];
                            if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                bool_36 = true;
                            } else {
                                bool_37 = false;
                            }

                            if (bool_37) {
                                class196_38.aShortArray2413[i_21] = (short) i_27;
                                class196_38.aShortArray2422[i_21] = (short) ints_10[i_22];
                            } else {
                                if (bool_36) {
                                    i_27 = ints_9[i_22];
                                    if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                        class196_38.anIntArray2420[i_22] = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).color & 0xffff) & 0xffff];
                                    }

                                    i_27 = ints_9[i_34];
                                    if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                        class196_38.anIntArray2420[i_34] = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).color & 0xffff) & 0xffff];
                                    }

                                    i_27 = ints_9[i_24];
                                    if (i_27 != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).isGroundMesh) {
                                        class196_38.anIntArray2420[i_24] = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_27).color & 0xffff) & 0xffff];
                                    }
                                }

                                class196_38.aShortArray2413[i_21] = -1;
                            }
                        }
                    }

                    aClass196ArrayArray9337[i_1][i_2] = class196_38;
                }
            }
        }

    }

    @Override
    public void method6720(GLLight class282_sub24_1, int[] ints_2) {
    }

    @Override
    public void p() {
        aByteArrayArray9355 = null;
        aByteArrayArray9356 = null;
    }

    @Override
    public void e() {
        aByteArrayArray9355 = null;
        aByteArrayArray9356 = null;
    }

    @Override
    public void method6710(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
        Class185 class185_9 = aGraphicalRenderer_Sub3_9353.method14370(Thread.currentThread());
        ChoppyItemFixClass choppyitemfixclass_10 = class185_9.aClass144_2310;
        choppyitemfixclass_10.anInt1674 = 0;
        choppyitemfixclass_10.aBool1708 = true;
        aGraphicalRenderer_Sub3_9353.method14410();
        if (aClass177ArrayArray9336 == null && aClass181ArrayArray9335 == null) {
            if (aClass178ArrayArray9352 != null) {
                method14622(i_1, i_2, i_3, i_4, i_5, i_6, i_7, bools_8, class185_9, choppyitemfixclass_10, class185_9.aFloatArray2315, class185_9.aFloatArray2342);
            }
        } else {
            method14618(i_1, i_2, i_3, i_4, i_5, i_6, i_7, bools_8, class185_9, choppyitemfixclass_10, class185_9.aFloatArray2315, class185_9.aFloatArray2342);
        }

    }

    @Override
    public void method6715(int i_1, int i_2, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
        Class185 class185_9 = aGraphicalRenderer_Sub3_9353.method14370(Thread.currentThread());
        ChoppyItemFixClass choppyitemfixclass_10 = class185_9.aClass144_2310;
        choppyitemfixclass_10.anInt1674 = 0;
        choppyitemfixclass_10.aBool1708 = true;
        aGraphicalRenderer_Sub3_9353.method14410();
        if (aClass177ArrayArray9336 == null && aClass181ArrayArray9335 == null) {
            if (aClass178ArrayArray9352 != null) {
                method14622(i_1, i_2, 1024, i_4, i_5, i_6, i_7, bools_8, class185_9, choppyitemfixclass_10, class185_9.aFloatArray2315, class185_9.aFloatArray2342);
            }
        } else {
            method14618(i_1, i_2, 1024, i_4, i_5, i_6, i_7, bools_8, class185_9, choppyitemfixclass_10, class185_9.aFloatArray2315, class185_9.aFloatArray2342);
        }

    }

    @Override
    public boolean method6719(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        return false;
    }

    @Override
    public void NA(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public void method6714(int i_1, int i_2, int[] ints_3, int[] ints_4, int[] ints_5, int[] ints_6, int[] ints_7, int[] ints_8, int[] ints_9, int[] ints_10, int[] ints_11, int[] ints_12, int[] ints_13, HDWaterTile class90_14, boolean bool_15) {
        if (aClass178ArrayArray9352 == null) {
            aClass178ArrayArray9352 = new Class178[width][length];
            aClass183ArrayArray9332 = new Class183[width][length];
        } else if (aClass177ArrayArray9336 != null || aClass181ArrayArray9335 != null) {
            throw new IllegalStateException();
        }

        boolean bool_16 = false;
        int i_18;
        int i_19;
        if (ints_10.length == 2 && ints_7.length == 2 && (ints_10[0] == ints_10[1] || ints_12[0] != -1 && ints_12[0] == ints_12[1])) {
            bool_16 = true;

            for (int i_17 = 1; i_17 < 2; i_17++) {
                i_18 = ints_3[ints_7[i_17]];
                i_19 = ints_5[ints_7[i_17]];
                if (i_18 != 0 && i_18 != tileUnits || i_19 != 0 && i_19 != tileUnits) {
                    bool_16 = false;
                    break;
                }
            }
        }

        if (!bool_16) {
            Class183 class183_25 = new Class183();
            short s_28 = (short) ints_3.length;
            short s_29 = (short) ints_10.length;
            class183_25.aShort2265 = s_28;
            class183_25.aShortArray2274 = new short[s_28];
            class183_25.aShortArray2267 = new short[s_28];
            class183_25.aShortArray2268 = new short[s_28];
            class183_25.aShortArray2264 = new short[s_28];

            int i_21;
            int i_22;
            int i_23;
            for (int i_20 = 0; i_20 < s_28; i_20++) {
                i_21 = ints_3[i_20];
                i_22 = ints_5[i_20];
                int i_27;
                if (i_21 == 0 && i_22 == 0) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                } else if (i_21 == 0 && i_22 == tileUnits) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]);
                } else if (i_21 == tileUnits && i_22 == tileUnits) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]);
                } else if (i_21 == tileUnits && i_22 == 0) {
                    class183_25.aShortArray2274[i_20] = (short) (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]);
                } else {
                    i_23 = (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]) * (tileUnits - i_21) + (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]) * i_21;
                    i_27 = (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]) * (tileUnits - i_21) + (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]) * i_21;
                    class183_25.aShortArray2274[i_20] = (short) (i_23 * (tileUnits - i_22) + i_27 * i_22 >> tileScale);
                }

                i_23 = (i_1 << tileScale) + i_21;
                i_27 = (i_2 << tileScale) + i_22;
                class183_25.aShortArray2267[i_20] = (short) i_21;
                class183_25.aShortArray2264[i_20] = (short) i_22;
                class183_25.aShortArray2268[i_20] = (short) (averageHeight(i_23, i_27) + (ints_4 != null ? ints_4[i_20] : 0));
                if (class183_25.aShortArray2274[i_20] < 2) {
                    class183_25.aShortArray2274[i_20] = 2;
                }
            }

            boolean bool_30 = false;
            i_21 = 0;

            for (i_22 = 0; i_22 < s_29; i_22++) {
                if (ints_10[i_22] >= 0 || ints_11 != null && ints_11[i_22] >= 0) {
                    ++i_21;
                }

                i_23 = ints_12[i_22];
                if (i_23 != -1) {
                    TextureDetails class169_24 = aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_23);
                    if (!class169_24.isGroundMesh) {
                        bool_30 = true;
                        if (method14620(class169_24.effectId) || class169_24.textureSpeedU != 0 || class169_24.textureSpeedV != 0) {
                            class183_25.aByte2276 |= 0x4;
                        }
                    }
                }
            }

            class183_25.anIntArray2272 = new int[i_21];
            if (ints_11 != null) {
                class183_25.anIntArray2277 = new int[i_21];
            }

            class183_25.aShortArray2271 = new short[i_21];
            class183_25.aShortArray2266 = new short[i_21];
            class183_25.aShortArray2273 = new short[i_21];
            if (bool_30) {
                class183_25.aShortArray2270 = new short[i_21];
                class183_25.aShortArray2275 = new short[i_21];
            }

            for (i_22 = 0; i_22 < s_29; i_22++) {
                if (ints_10[i_22] >= 0 || ints_11 != null && ints_11[i_22] >= 0) {
                    if (ints_10[i_22] >= 0) {
                        class183_25.anIntArray2272[class183_25.aShort2269] = Class372.method6362(ints_10[i_22]);
                    } else {
                        class183_25.anIntArray2272[class183_25.aShort2269] = -1;
                    }

                    if (ints_11 != null) {
                        if (ints_11[i_22] != -1) {
                            class183_25.anIntArray2277[class183_25.aShort2269] = Class372.method6362(ints_11[i_22]);
                        } else {
                            class183_25.anIntArray2277[class183_25.aShort2269] = -1;
                        }
                    }

                    class183_25.aShortArray2271[class183_25.aShort2269] = (short) ints_7[i_22];
                    class183_25.aShortArray2266[class183_25.aShort2269] = (short) ints_8[i_22];
                    class183_25.aShortArray2273[class183_25.aShort2269] = (short) ints_9[i_22];
                    if (bool_30) {
                        if (ints_12[i_22] != -1 && !aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(ints_12[i_22]).isGroundMesh) {
                            class183_25.aShortArray2270[class183_25.aShort2269] = (short) ints_12[i_22];
                            class183_25.aShortArray2275[class183_25.aShort2269] = (short) ints_13[i_22];
                        } else {
                            class183_25.aShortArray2270[class183_25.aShort2269] = -1;
                        }
                    }

                    ++class183_25.aShort2269;
                }
            }

            aClass183ArrayArray9332[i_1][i_2] = class183_25;
        } else if (ints_10[0] >= 0 || ints_11 != null && ints_11[0] >= 0) {
            Class178 class178_32 = new Class178();
            i_18 = ints_10[0];
            i_19 = ints_12[0];
            if (ints_11 != null) {
                class178_32.anInt2213 = MaterialProp20.method15076(Class372.method6362(ints_11[0]), aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                if (i_18 == -1) {
                    class178_32.aByte2219 |= 0x2;
                }
            }

            if (tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2] && tileHeights[i_1][i_2] == tileHeights[i_1 + 1][i_2 + 1] && tileHeights[i_1][i_2] == tileHeights[i_1][i_2 + 1]) {
                class178_32.aByte2219 |= 0x1;
            }

            TextureDetails class169_26 = null;
            if (i_19 != -1) {
                class169_26 = aGraphicalRenderer_Sub3_9353.textureCache.getTextureDetails(i_19);
            }

            if (class169_26 != null && (class178_32.aByte2219 & 0x2) == 0 && !class169_26.isGroundMesh) {
                class178_32.aShort2214 = (short) (aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                class178_32.aShort2217 = (short) (aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]);
                class178_32.aShort2216 = (short) (aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]);
                class178_32.aShort2218 = (short) (aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]);
                class178_32.aShort2215 = (short) i_19;
                if (method14620(class169_26.effectId) || class169_26.textureSpeedU != 0 || class169_26.textureSpeedV != 0) {
                    class178_32.aByte2219 |= 0x4;
                }
            } else {
                short s_31 = Class372.method6362(i_18);
                class178_32.aShort2214 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1][i_2] - aByteArrayArray9356[i_1][i_2]);
                class178_32.aShort2217 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1 + 1][i_2] - aByteArrayArray9356[i_1 + 1][i_2]);
                class178_32.aShort2216 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1 + 1][i_2 + 1] - aByteArrayArray9356[i_1 + 1][i_2 + 1]);
                class178_32.aShort2218 = (short) MaterialProp20.method15076(s_31, aByteArrayArray9355[i_1][i_2 + 1] - aByteArrayArray9356[i_1][i_2 + 1]);
                class178_32.aShort2215 = -1;
            }

            aClass178ArrayArray9352[i_1][i_2] = class178_32;
        }

    }

    @Override
    public void u(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public boolean method6718(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
        return false;
    }

    void method14636(int i_1, int i_2, ChoppyItemFixClass choppyitemfixclass_3, float[] floats_4, float[] floats_5, float[] floats_6, float[] floats_7, int i_9) {
        Class178 class178_10 = aClass178ArrayArray9352[i_1][i_2];
        int i_12;
        int i_13;
        float f_16;
        float f_17;
        float f_18;
        float f_19;
        float f_20;
        float f_21;
        if (class178_10 != null) {
            if ((class178_10.aByte2219 & 0x2) == 0) {
                if (i_9 != 0) {
                    if ((class178_10.aByte2219 & 0x4) != 0) {
                        if ((i_9 & 0x1) != 0) {
                            return;
                        }
                    } else if ((i_9 & 0x2) != 0) {
                        return;
                    }
                }

                int i_11 = tileUnits * i_1;
                i_12 = i_11 + tileUnits;
                i_13 = i_2 * tileUnits;
                int i_14 = i_13 + tileUnits;
                float f_15;
                float f_22;
                float f_23;
                float f_24;
                float f_25;
                float f_26;
                float f_27;
                float f_28;
                float f_29;
                float f_30;
                int i_31;
                float f_35;
                float f_36;
                float f_37;
                float f_38;
                float f_39;
                float f_40;
                float f_41;
                float f_42;
                float f_43;
                float f_44;
                float f_45;
                float f_46;
                if ((class178_10.aByte2219 & 0x1) != 0) {
                    i_31 = tileHeights[i_1][i_2];
                    float f_32 = aFloat9334 * i_31;
                    float f_33 = aFloat9346 * i_31;
                    float f_34 = aFloat9333 + aFloat9341 * i_11 + f_32 + aFloat9349 * i_13;
                    f_15 = aFloat9354 + aFloat9342 * i_11 + f_33 + aFloat9350 * i_13;
                    if (f_34 < -f_15) {
                        return;
                    }

                    f_35 = aFloat9333 + aFloat9341 * i_12 + f_32 + aFloat9349 * i_13;
                    f_16 = aFloat9354 + aFloat9342 * i_12 + f_33 + aFloat9350 * i_13;
                    if (f_35 < -f_16) {
                        return;
                    }

                    f_36 = aFloat9333 + aFloat9341 * i_12 + f_32 + aFloat9349 * i_14;
                    f_17 = aFloat9354 + aFloat9342 * i_12 + f_33 + aFloat9350 * i_14;
                    if (f_36 < -f_17) {
                        return;
                    }

                    f_37 = aFloat9333 + aFloat9341 * i_11 + f_32 + aFloat9349 * i_14;
                    f_18 = aFloat9354 + aFloat9342 * i_11 + f_33 + aFloat9350 * i_14;
                    if (f_37 < -f_18) {
                        return;
                    }

                    f_38 = aFloat9343 * i_31;
                    f_39 = aFloat9344 * i_31;
                    f_40 = aFloat9351 + aFloat9338 * i_11 + f_38 + aFloat9339 * i_13;
                    f_19 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_40 / f_15;
                    f_41 = aFloat9328 + aFloat9340 * i_11 + f_39 + aFloat9327 * i_13;
                    f_20 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_41 / f_15;
                    f_21 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_34 / f_15;
                    f_42 = aFloat9351 + aFloat9338 * i_12 + f_38 + aFloat9339 * i_13;
                    f_22 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_42 / f_16;
                    f_43 = aFloat9328 + aFloat9340 * i_12 + f_39 + aFloat9327 * i_13;
                    f_23 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_43 / f_16;
                    f_24 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_35 / f_16;
                    f_44 = aFloat9351 + aFloat9338 * i_12 + f_38 + aFloat9339 * i_14;
                    f_25 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_44 / f_17;
                    f_45 = aFloat9328 + aFloat9340 * i_12 + f_39 + aFloat9327 * i_14;
                    f_26 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_45 / f_17;
                    f_27 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_36 / f_17;
                    f_46 = aFloat9351 + aFloat9338 * i_11 + f_38 + aFloat9339 * i_14;
                    f_28 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_46 / f_18;
                    float f_47 = aFloat9328 + aFloat9340 * i_11 + f_39 + aFloat9327 * i_14;
                    f_29 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_47 / f_18;
                    f_30 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_37 / f_18;
                } else {
                    i_31 = tileHeights[i_1][i_2];
                    int i_56 = tileHeights[i_1 + 1][i_2];
                    int i_57 = tileHeights[i_1 + 1][i_2 + 1];
                    int i_58 = tileHeights[i_1][i_2 + 1];
                    f_35 = aFloat9333 + aFloat9341 * i_11 + aFloat9334 * i_31 + aFloat9349 * i_13;
                    f_15 = aFloat9354 + aFloat9342 * i_11 + aFloat9346 * i_31 + aFloat9350 * i_13;
                    if (f_35 < -f_15) {
                        return;
                    }

                    f_36 = aFloat9333 + aFloat9341 * i_12 + aFloat9334 * i_56 + aFloat9349 * i_13;
                    f_16 = aFloat9354 + aFloat9342 * i_12 + aFloat9346 * i_56 + aFloat9350 * i_13;
                    if (f_36 < -f_16) {
                        return;
                    }

                    f_37 = aFloat9333 + aFloat9341 * i_12 + aFloat9334 * i_57 + aFloat9349 * i_14;
                    f_17 = aFloat9354 + aFloat9342 * i_12 + aFloat9346 * i_57 + aFloat9350 * i_14;
                    if (f_37 < -f_17) {
                        return;
                    }

                    f_38 = aFloat9333 + aFloat9341 * i_11 + aFloat9334 * i_58 + aFloat9349 * i_14;
                    f_18 = aFloat9354 + aFloat9342 * i_11 + aFloat9346 * i_58 + aFloat9350 * i_14;
                    if (f_38 < -f_18) {
                        return;
                    }

                    f_39 = aFloat9351 + aFloat9338 * i_11 + aFloat9343 * i_31 + aFloat9339 * i_13;
                    f_19 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_39 / f_15;
                    f_40 = aFloat9328 + aFloat9340 * i_11 + aFloat9344 * i_31 + aFloat9327 * i_13;
                    f_20 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_40 / f_15;
                    f_21 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_35 / f_15;
                    f_41 = aFloat9351 + aFloat9338 * i_12 + aFloat9343 * i_56 + aFloat9339 * i_13;
                    f_22 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_41 / f_16;
                    f_42 = aFloat9328 + aFloat9340 * i_12 + aFloat9344 * i_56 + aFloat9327 * i_13;
                    f_23 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_42 / f_16;
                    f_24 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_36 / f_16;
                    f_43 = aFloat9351 + aFloat9338 * i_12 + aFloat9343 * i_57 + aFloat9339 * i_14;
                    f_25 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_43 / f_17;
                    f_44 = aFloat9328 + aFloat9340 * i_12 + aFloat9344 * i_57 + aFloat9327 * i_14;
                    f_26 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_44 / f_17;
                    f_27 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_37 / f_17;
                    f_45 = aFloat9351 + aFloat9338 * i_11 + aFloat9343 * i_58 + aFloat9339 * i_14;
                    f_28 = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_45 / f_18;
                    f_46 = aFloat9328 + aFloat9340 * i_11 + aFloat9344 * i_58 + aFloat9327 * i_14;
                    f_29 = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_46 / f_18;
                    f_30 = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_38 / f_18;
                }

                if ((f_25 - f_28) * (f_23 - f_29) - (f_26 - f_29) * (f_22 - f_28) > 0.0F) {
                    choppyitemfixclass_3.aBool1708 = f_25 < 0.0F || f_28 < 0.0F || f_22 < 0.0F || f_25 > choppyitemfixclass_3.anInt1684 || f_28 > choppyitemfixclass_3.anInt1684 || f_22 > choppyitemfixclass_3.anInt1684;
                    if (class178_10.aShort2215 >= 0) {
                        choppyitemfixclass_3.method2424(true, true, false, f_26, f_29, f_23, f_25, f_28, f_22, f_27, f_30, f_24, f_17, f_18, f_16, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, -16777216 | Class335.anIntArray3916[class178_10.aShort2216 & 0xffff] & 0xffffff, -16777216 | Class335.anIntArray3916[class178_10.aShort2218 & 0xffff] & 0xffffff, -16777216 | Class335.anIntArray3916[class178_10.aShort2217 & 0xffff] & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class178_10.aShort2215);
                    } else {
                        choppyitemfixclass_3.method2426(true, true, false, f_26, f_29, f_23, f_25, f_28, f_22, f_27, f_30, f_24, (class178_10.aShort2216 & 0xffff), (class178_10.aShort2218 & 0xffff), (class178_10.aShort2217 & 0xffff));
                    }
                }

                if ((f_19 - f_22) * (f_29 - f_23) - (f_20 - f_23) * (f_28 - f_22) > 0.0F) {
                    choppyitemfixclass_3.aBool1708 = f_19 < 0.0F || f_22 < 0.0F || f_28 < 0.0F || f_19 > choppyitemfixclass_3.anInt1684 || f_22 > choppyitemfixclass_3.anInt1684 || f_28 > choppyitemfixclass_3.anInt1684;
                    if (class178_10.aShort2215 >= 0) {
                        choppyitemfixclass_3.method2424(true, true, false, f_20, f_23, f_29, f_19, f_22, f_28, f_21, f_24, f_30, f_15, f_16, f_18, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, -16777216 | Class335.anIntArray3916[class178_10.aShort2214 & 0xffff] & 0xffffff, -16777216 | Class335.anIntArray3916[class178_10.aShort2217 & 0xffff] & 0xffffff, -16777216 | Class335.anIntArray3916[class178_10.aShort2218 & 0xffff] & 0xffffff, 0, 0.0F, 0.0F, 0.0F, class178_10.aShort2215);
                    } else {
                        choppyitemfixclass_3.method2426(true, true, false, f_20, f_23, f_29, f_19, f_22, f_28, f_21, f_24, f_30, (class178_10.aShort2214 & 0xffff), (class178_10.aShort2217 & 0xffff), (class178_10.aShort2218 & 0xffff));
                    }
                }
            }
        } else {
            Class183 class183_48 = aClass183ArrayArray9332[i_1][i_2];
            if (class183_48 != null) {
                if (i_9 != 0) {
                    if ((class183_48.aByte2276 & 0x4) != 0) {
                        if ((i_9 & 0x1) != 0) {
                            return;
                        }
                    } else if ((i_9 & 0x2) != 0) {
                        return;
                    }
                }

                short s_50;
                for (i_12 = 0; i_12 < class183_48.aShort2265; i_12++) {
                    i_13 = class183_48.aShortArray2267[i_12] + (i_1 << tileScale);
                    s_50 = class183_48.aShortArray2268[i_12];
                    int i_51 = class183_48.aShortArray2264[i_12] + (i_2 << tileScale);
                    f_16 = aFloat9333 + aFloat9341 * i_13 + aFloat9334 * s_50 + aFloat9349 * i_51;
                    f_17 = aFloat9354 + aFloat9342 * i_13 + aFloat9346 * s_50 + aFloat9350 * i_51;
                    if (f_16 < -f_17) {
                        return;
                    }

                    f_18 = aFloat9351 + aFloat9338 * i_13 + aFloat9343 * s_50 + aFloat9339 * i_51;
                    f_19 = aFloat9328 + aFloat9340 * i_13 + aFloat9344 * s_50 + aFloat9327 * i_51;
                    floats_4[i_12] = choppyitemfixclass_3.aFloat1678 + choppyitemfixclass_3.aFloat1679 * f_18 / f_17;
                    floats_5[i_12] = choppyitemfixclass_3.aFloat1680 + choppyitemfixclass_3.aFloat1702 * f_19 / f_17;
                    floats_6[i_12] = choppyitemfixclass_3.aFloat1682 + choppyitemfixclass_3.aFloat1683 * f_16 / f_17;
                    floats_7[i_12] = f_17;
                }

                short s_49;
                short s_52;
                if (class183_48.aShortArray2270 != null) {
                    for (i_12 = 0; i_12 < class183_48.aShort2269; i_12++) {
                        s_49 = class183_48.aShortArray2271[i_12];
                        s_50 = class183_48.aShortArray2266[i_12];
                        s_52 = class183_48.aShortArray2273[i_12];
                        f_16 = floats_4[s_49];
                        f_17 = floats_4[s_50];
                        f_18 = floats_4[s_52];
                        f_19 = floats_5[s_49];
                        f_20 = floats_5[s_50];
                        f_21 = floats_5[s_52];
                        if ((f_16 - f_17) * (f_21 - f_20) - (f_19 - f_20) * (f_18 - f_17) > 0.0F) {
                            choppyitemfixclass_3.aBool1708 = f_16 < 0.0F || f_17 < 0.0F || f_18 < 0.0F || f_16 > choppyitemfixclass_3.anInt1684 || f_17 > choppyitemfixclass_3.anInt1684 || f_18 > choppyitemfixclass_3.anInt1684;
                            short s_53 = class183_48.aShortArray2270[i_12];
                            if (s_53 != -1) {
                                choppyitemfixclass_3.method2424(true, true, false, f_19, f_20, f_21, f_16, f_17, f_18, floats_6[s_49], floats_6[s_50], floats_6[s_52], floats_7[s_49], floats_7[s_50], floats_7[s_52], (float) class183_48.aShortArray2267[s_49] / tileUnits, (float) class183_48.aShortArray2267[s_50] / tileUnits, (float) class183_48.aShortArray2267[s_52] / tileUnits, (float) class183_48.aShortArray2264[s_49] / tileUnits, (float) class183_48.aShortArray2264[s_50] / tileUnits, (float) class183_48.aShortArray2264[s_52] / tileUnits, -16777216 | Class335.anIntArray3916[class183_48.aShortArray2274[s_49] & 0xffff] & 0xffffff, -16777216 | Class335.anIntArray3916[class183_48.aShortArray2274[s_50] & 0xffff] & 0xffffff, -16777216 | Class335.anIntArray3916[class183_48.aShortArray2274[s_52] & 0xffff] & 0xffffff, 0, 0.0F, 0.0F, 0.0F, s_53);
                            } else {
                                int i_55 = class183_48.anIntArray2272[i_12];
                                if (i_55 != -1) {
                                    choppyitemfixclass_3.method2426(true, true, false, f_19, f_20, f_21, f_16, f_17, f_18, floats_6[s_49], floats_6[s_50], floats_6[s_52], MaterialProp20.method15076(i_55, class183_48.aShortArray2274[s_49]), MaterialProp20.method15076(i_55, class183_48.aShortArray2274[s_50]), MaterialProp20.method15076(i_55, class183_48.aShortArray2274[s_52]));
                                }
                            }
                        }
                    }
                } else {
                    for (i_12 = 0; i_12 < class183_48.aShort2269; i_12++) {
                        s_49 = class183_48.aShortArray2271[i_12];
                        s_50 = class183_48.aShortArray2266[i_12];
                        s_52 = class183_48.aShortArray2273[i_12];
                        f_16 = floats_4[s_49];
                        f_17 = floats_4[s_50];
                        f_18 = floats_4[s_52];
                        f_19 = floats_5[s_49];
                        f_20 = floats_5[s_50];
                        f_21 = floats_5[s_52];
                        if ((f_16 - f_17) * (f_21 - f_20) - (f_19 - f_20) * (f_18 - f_17) > 0.0F) {
                            int i_54 = class183_48.anIntArray2272[i_12];
                            if (i_54 != -1) {
                                choppyitemfixclass_3.aBool1708 = f_16 < 0.0F || f_17 < 0.0F || f_18 < 0.0F || f_16 > choppyitemfixclass_3.anInt1684 || f_17 > choppyitemfixclass_3.anInt1684 || f_18 > choppyitemfixclass_3.anInt1684;
                                choppyitemfixclass_3.method2426(true, true, false, f_19, f_20, f_21, f_16, f_17, f_18, floats_6[s_49], floats_6[s_50], floats_6[s_52], MaterialProp20.method15076(i_54, class183_48.aShortArray2274[s_49]), MaterialProp20.method15076(i_54, class183_48.aShortArray2274[s_50]), MaterialProp20.method15076(i_54, class183_48.aShortArray2274[s_52]));
                            }
                        }
                    }
                }
            }
        }

    }

    @Override
    public void d(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public void a(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    void method14638(int i_1, int i_2, int i_3) {
        Class185 class185_4 = aGraphicalRenderer_Sub3_9353.method14370(Thread.currentThread());
        class185_4.aClass144_2310.anInt1674 = 0;
        if (aClass177ArrayArray9336 != null) {
            method14617(i_1, i_2, class185_4.aBool2309, class185_4, class185_4.aClass144_2310, class185_4.aFloatArray2315, class185_4.aFloatArray2342, class185_4.aFloatArray2330, class185_4.aFloatArray2344, class185_4.aFloatArray2345, i_3);
        } else if (aClass178ArrayArray9352 != null) {
            method14636(i_1, i_2, class185_4.aClass144_2310, class185_4.aFloatArray2315, class185_4.aFloatArray2342, class185_4.aFloatArray2330, class185_4.aFloatArray2344, i_3);
        } else if (aClass181ArrayArray9335 != null) {
            method14619(i_1, i_2, class185_4.aBool2309, class185_4, class185_4.aClass144_2310, class185_4.aFloatArray2315, class185_4.aFloatArray2342, class185_4.aFloatArray2330, class185_4.aFloatArray2344, class185_4.aFloatArray2345, i_3);
        }

    }

    @Override
    public void b(Shadow class282_sub50_sub17_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public void method6721(GLLight class282_sub24_1, int[] ints_2) {
    }

    @Override
    public void method6711(GLLight class282_sub24_1, int[] ints_2) {
    }

    @Override
    public void method6723(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, boolean[][] bools_8) {
        Class185 class185_9 = aGraphicalRenderer_Sub3_9353.method14370(Thread.currentThread());
        ChoppyItemFixClass choppyitemfixclass_10 = class185_9.aClass144_2310;
        choppyitemfixclass_10.anInt1674 = 0;
        choppyitemfixclass_10.aBool1708 = true;
        aGraphicalRenderer_Sub3_9353.method14410();
        if (aClass177ArrayArray9336 == null && aClass181ArrayArray9335 == null) {
            if (aClass178ArrayArray9352 != null) {
                method14622(i_1, i_2, i_3, i_4, i_5, i_6, i_7, bools_8, class185_9, choppyitemfixclass_10, class185_9.aFloatArray2315, class185_9.aFloatArray2342);
            }
        } else {
            method14618(i_1, i_2, i_3, i_4, i_5, i_6, i_7, bools_8, class185_9, choppyitemfixclass_10, class185_9.aFloatArray2315, class185_9.aFloatArray2342);
        }

    }

}
