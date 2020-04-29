package com.jagex;

public class FontRenderer_Sub1 extends FontRenderer {

    static int anInt8515;
    HardwareRenderer aGraphicalRenderer_Sub3_8513;
    int[] anIntArray8511;
    int[] anIntArray8512;
    byte[][] aByteArrayArray8509;
    int[] anIntArray8510;
    int[] anIntArray8514;

    FontRenderer_Sub1(HardwareRenderer hardwarerenderer_1, FontMetrics fontmetrics_2, SpriteDefinitions[] arr_3, int[] ints_4, int[] ints_5) {
        super(hardwarerenderer_1, fontmetrics_2);
        aGraphicalRenderer_Sub3_8513 = hardwarerenderer_1;
        anIntArray8511 = ints_4;
        anIntArray8512 = ints_5;
        aByteArrayArray8509 = new byte[arr_3.length][];
        anIntArray8510 = new int[arr_3.length];
        anIntArray8514 = new int[arr_3.length];

        for (int i_6 = 0; i_6 < arr_3.length; i_6++) {
            aByteArrayArray8509[i_6] = arr_3[i_6].pixels;
            anIntArray8510[i_6] = arr_3[i_6].minY;
            anIntArray8514[i_6] = arr_3[i_6].minX;
        }

    }

    static int method13782(int i_0, int i_1) {
        byte b_3;
        if (i_1 > 20077) {
            EquipmentDefaults.method11248();
            b_3 = 4;
        } else if (i_1 > 10021) {
            Node_Sub40.method13300();
            b_3 = 3;
        } else if (i_1 > 5002) {
            Class119.method2077();
            b_3 = 2;
        } else {
            MaterialProp14.method15393();
            b_3 = 1;
        }

        if (Class393.preferences.currentToolkit.getValue() != i_0) {
            Class393.preferences.setValue(Class393.preferences.toolKit, i_0);
            ParticleProducer.method11500(i_0, false);
        } else {
            Class393.preferences.method13505(Class393.preferences.currentToolkit, true);
        }

        Class190.savePreferences();
        return b_3;
    }

    static void method13783() {
        Preference_Sub20.anIntArray7920 = Class492.method8266();
    }

    static void method13784(int i_0) {
        if (Class9.lobbyStage == 140) {
            Class9.anInt72 = i_0;
        } else if (Class9.lobbyStage == 273) {
            Class9.anInt106 = i_0;
        }

    }

    @Override
    void UA(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8513.anIntArray8979 != null) {
            i_21 += anIntArray8514[var_1];
            i_31 += anIntArray8510[var_1];
            int i_6 = anIntArray8511[var_1];
            int i_7 = anIntArray8512[var_1];
            int i_8 = aGraphicalRenderer_Sub3_8513.anInt8980;
            int i_9 = i_31 * i_8 + i_21;
            int i_10 = i_8 - i_6;
            int i_11 = 0;
            int i_12 = 0;
            int i_13;
            if (i_31 < aGraphicalRenderer_Sub3_8513.anInt9009) {
                i_13 = aGraphicalRenderer_Sub3_8513.anInt9009 - i_31;
                i_7 -= i_13;
                i_31 = aGraphicalRenderer_Sub3_8513.anInt9009;
                i_12 += i_6 * i_13;
                i_9 += i_8 * i_13;
            }

            if (i_31 + i_7 > aGraphicalRenderer_Sub3_8513.anInt8986) {
                i_7 -= i_31 + i_7 - aGraphicalRenderer_Sub3_8513.anInt8986;
            }

            if (i_21 < aGraphicalRenderer_Sub3_8513.anInt8983) {
                i_13 = aGraphicalRenderer_Sub3_8513.anInt8983 - i_21;
                i_6 -= i_13;
                i_21 = aGraphicalRenderer_Sub3_8513.anInt8983;
                i_12 += i_13;
                i_9 += i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 + i_21 > aGraphicalRenderer_Sub3_8513.anInt9002) {
                i_13 = i_6 + i_21 - aGraphicalRenderer_Sub3_8513.anInt9002;
                i_6 -= i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 > 0 && i_7 > 0) {
                if ((i_4 & -16777216) == -16777216) {
                    method13771(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
                } else if ((i_4 & -16777216) != 0) {
                    method13772(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
                }
            }
        }

    }

    @Override
    void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8513.anIntArray8979 != null) {
            if (class455_6 == null) {
                UA(var_1, i_21, i_31, i_4, bool_5);
            } else {
                i_21 += anIntArray8514[var_1];
                i_31 += anIntArray8510[var_1];
                int i_9 = anIntArray8511[var_1];
                int i_10 = anIntArray8512[var_1];
                int i_11 = aGraphicalRenderer_Sub3_8513.anInt8980;
                int i_12 = i_31 * i_11 + i_21;
                int i_13 = i_11 - i_9;
                int i_14 = 0;
                int i_15 = 0;
                int i_16;
                if (i_31 < aGraphicalRenderer_Sub3_8513.anInt9009) {
                    i_16 = aGraphicalRenderer_Sub3_8513.anInt9009 - i_31;
                    i_10 -= i_16;
                    i_31 = aGraphicalRenderer_Sub3_8513.anInt9009;
                    i_15 += i_9 * i_16;
                    i_12 += i_11 * i_16;
                }

                if (i_31 + i_10 > aGraphicalRenderer_Sub3_8513.anInt8986) {
                    i_10 -= i_31 + i_10 - aGraphicalRenderer_Sub3_8513.anInt8986;
                }

                if (i_21 < aGraphicalRenderer_Sub3_8513.anInt8983) {
                    i_16 = aGraphicalRenderer_Sub3_8513.anInt8983 - i_21;
                    i_9 -= i_16;
                    i_21 = aGraphicalRenderer_Sub3_8513.anInt8983;
                    i_15 += i_16;
                    i_12 += i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 + i_21 > aGraphicalRenderer_Sub3_8513.anInt9002) {
                    i_16 = i_9 + i_21 - aGraphicalRenderer_Sub3_8513.anInt9002;
                    i_9 -= i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 > 0 && i_10 > 0) {
                    if ((i_4 & -16777216) == -16777216) {
                        method13773(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_21, i_31, anIntArray8511[var_1], class455_6, i_7, i_8);
                    } else {
                        method13774(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_21, i_31, anIntArray8511[var_1], class455_6, i_7, i_8);
                    }
                }
            }
        }

    }

    void method13771(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        int i_10 = -(i_6 >> 2);
        i_6 = -(i_6 & 0x3);

        for (int i_11 = -i_7; i_11 < 0; i_11++) {
            int i_12;
            for (i_12 = i_10; i_12 < 0; i_12++) {
                if (bytes_1[i_4++] != 0) {
                    ints_2[i_5++] = i_3;
                } else {
                    ++i_5;
                }

                if (bytes_1[i_4++] != 0) {
                    ints_2[i_5++] = i_3;
                } else {
                    ++i_5;
                }

                if (bytes_1[i_4++] != 0) {
                    ints_2[i_5++] = i_3;
                } else {
                    ++i_5;
                }

                if (bytes_1[i_4++] != 0) {
                    ints_2[i_5++] = i_3;
                } else {
                    ++i_5;
                }
            }

            for (i_12 = i_6; i_12 < 0; i_12++) {
                if (bytes_1[i_4++] != 0) {
                    ints_2[i_5++] = i_3;
                } else {
                    ++i_5;
                }
            }

            i_5 += i_8;
            i_4 += i_9;
        }

    }

    void method13772(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        int i_10 = i_3 >>> 24;
        int i_11 = 255 - i_10;

        for (int i_12 = -i_7; i_12 < 0; i_12++) {
            for (int i_13 = -i_6; i_13 < 0; i_13++) {
                if (bytes_1[i_4++] != 0) {
                    int i_14 = (i_10 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_10 & -16711936) >> 8;
                    int i_15 = ints_2[i_5];
                    ints_2[i_5++] = i_14 + ((i_11 * (i_15 & 0xff00) & 0xff0000) + ((i_15 & 0xff00ff) * i_11 & -16711936) >> 8);
                } else {
                    ++i_5;
                }
            }

            i_5 += i_8;
            i_4 += i_9;
        }

    }

    void method13773(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Class455 class455_13, int i_14, int i_15) {
        Class455_Sub3 packetsdecoder_16 = (Class455_Sub3) class455_13;
        int[] ints_17 = packetsdecoder_16.anIntArray9077;
        int[] ints_18 = packetsdecoder_16.anIntArray9078;
        int i_19 = i_11;
        if (i_15 > i_11) {
            i_19 = i_15;
            i_5 += aGraphicalRenderer_Sub3_8513.anInt8980 * (i_15 - i_11);
            i_4 += (i_15 - i_11) * i_12;
        }

        int i_20 = Math.min(ints_17.length + i_15, i_11 + i_7);

        for (int i_21 = i_19; i_21 < i_20; i_21++) {
            int i_22 = ints_17[i_21 - i_15] + i_14;
            int i_23 = ints_18[i_21 - i_15];
            int i_24 = i_6;
            int i_25;
            if (i_10 > i_22) {
                i_25 = i_10 - i_22;
                if (i_25 >= i_23) {
                    i_4 += i_9 + i_6;
                    i_5 += i_8 + i_6;
                    continue;
                }

                i_23 -= i_25;
            } else {
                i_25 = i_22 - i_10;
                if (i_25 >= i_6) {
                    i_4 += i_9 + i_6;
                    i_5 += i_8 + i_6;
                    continue;
                }

                i_4 += i_25;
                i_24 = i_6 - i_25;
                i_5 += i_25;
            }

            i_25 = 0;
            if (i_24 < i_23) {
                i_23 = i_24;
            } else {
                i_25 = i_24 - i_23;
            }

            for (int i_26 = 0; i_26 < i_23; i_26++) {
                if (bytes_1[i_4++] != 0) {
                    ints_2[i_5++] = i_3;
                } else {
                    ++i_5;
                }
            }

            i_4 = i_25 + i_4 + i_9;
            i_5 += i_25 + i_8;
        }

    }

    void method13774(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Class455 class455_13, int i_14, int i_15) {
        Class455_Sub3 packetsdecoder_16 = (Class455_Sub3) class455_13;
        int[] ints_17 = packetsdecoder_16.anIntArray9077;
        int[] ints_18 = packetsdecoder_16.anIntArray9078;
        int i_19 = i_10 - aGraphicalRenderer_Sub3_8513.anInt8983;
        int i_20 = i_11;
        if (i_15 > i_11) {
            i_20 = i_15;
            i_5 += aGraphicalRenderer_Sub3_8513.anInt8980 * (i_15 - i_11);
            i_4 += (i_15 - i_11) * i_12;
        }

        int i_21 = Math.min(ints_17.length + i_15, i_11 + i_7);
        int i_22 = i_3 >>> 24;
        int i_23 = 255 - i_22;

        for (int i_24 = i_20; i_24 < i_21; i_24++) {
            int i_25 = ints_17[i_24 - i_15] + i_14;
            int i_26 = ints_18[i_24 - i_15];
            int i_27 = i_6;
            int i_28;
            if (i_19 > i_25) {
                i_28 = i_19 - i_25;
                if (i_28 >= i_26) {
                    i_4 += i_9 + i_6;
                    i_5 += i_8 + i_6;
                    continue;
                }

                i_26 -= i_28;
            } else {
                i_28 = i_25 - i_19;
                if (i_28 >= i_6) {
                    i_4 += i_9 + i_6;
                    i_5 += i_8 + i_6;
                    continue;
                }

                i_4 += i_28;
                i_27 = i_6 - i_28;
                i_5 += i_28;
            }

            i_28 = 0;
            if (i_27 < i_26) {
                i_26 = i_27;
            } else {
                i_28 = i_27 - i_26;
            }

            for (int i_29 = -i_26; i_29 < 0; i_29++) {
                if (bytes_1[i_4++] != 0) {
                    int i_30 = (i_22 * (i_3 & 0xff00) & 0xff0000) + ((i_3 & 0xff00ff) * i_22 & -16711936) >> 8;
                    int i_31 = ints_2[i_5];
                    ints_2[i_5++] = (((i_31 & 0xff00ff) * i_23 & -16711936) + (i_23 * (i_31 & 0xff00) & 0xff0000) >> 8) + i_30;
                } else {
                    ++i_5;
                }
            }

            i_4 = i_28 + i_4 + i_9;
            i_5 += i_28 + i_8;
        }

    }

    @Override
    void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8513.anIntArray8979 != null) {
            if (class455_6 == null) {
                UA(var_1, i_21, i_31, i_4, bool_5);
            } else {
                i_21 += anIntArray8514[var_1];
                i_31 += anIntArray8510[var_1];
                int i_9 = anIntArray8511[var_1];
                int i_10 = anIntArray8512[var_1];
                int i_11 = 444800403 * aGraphicalRenderer_Sub3_8513.anInt8980 * 299731099;
                int i_12 = i_21 + i_11 * i_31;
                int i_13 = i_11 - i_9;
                int i_14 = 0;
                int i_15 = 0;
                int i_16;
                if (i_31 < 1516535457 * aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577) {
                    i_16 = aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577 * 1516535457 - i_31;
                    i_10 -= i_16;
                    i_31 = 1516535457 * aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577;
                    i_15 += i_9 * i_16;
                    i_12 += i_11 * i_16;
                }

                if (i_10 + i_31 > aGraphicalRenderer_Sub3_8513.anInt8986 * 760194793 * 1383960921) {
                    i_10 -= i_31 + i_10 - 1383960921 * aGraphicalRenderer_Sub3_8513.anInt8986 * 760194793;
                }

                if (i_21 < 72550989 * aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331) {
                    i_16 = 72550989 * aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331 - i_21;
                    i_9 -= i_16;
                    i_21 = 72550989 * aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331;
                    i_15 += i_16;
                    i_12 += i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 + i_21 > aGraphicalRenderer_Sub3_8513.anInt9002 * 1714763515 * -1710988237) {
                    i_16 = i_21 + i_9 - -1710988237 * aGraphicalRenderer_Sub3_8513.anInt9002 * 1714763515;
                    i_9 -= i_16;
                    i_14 += i_16;
                    i_13 += i_16;
                }

                if (i_9 > 0 && i_10 > 0) {
                    if ((i_4 & -16777216) == -16777216) {
                        method13773(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_21, i_31, anIntArray8511[var_1], class455_6, i_7, i_8);
                    } else {
                        method13774(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_15, i_12, i_9, i_10, i_13, i_14, i_21, i_31, anIntArray8511[var_1], class455_6, i_7, i_8);
                    }
                }
            }
        }

    }

    @Override
    void c(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8513.anIntArray8979 != null) {
            i_21 += anIntArray8514[var_1];
            i_31 += anIntArray8510[var_1];
            int i_6 = anIntArray8511[var_1];
            int i_7 = anIntArray8512[var_1];
            int i_8 = 444800403 * aGraphicalRenderer_Sub3_8513.anInt8980 * 299731099;
            int i_9 = i_21 + i_8 * i_31;
            int i_10 = i_8 - i_6;
            int i_11 = 0;
            int i_12 = 0;
            int i_13;
            if (i_31 < 1516535457 * aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577) {
                i_13 = aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577 * 1516535457 - i_31;
                i_7 -= i_13;
                i_31 = 1516535457 * aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577;
                i_12 += i_6 * i_13;
                i_9 += i_8 * i_13;
            }

            if (i_31 + i_7 > aGraphicalRenderer_Sub3_8513.anInt8986 * 760194793 * 1383960921) {
                i_7 -= i_31 + i_7 - 1383960921 * aGraphicalRenderer_Sub3_8513.anInt8986 * 760194793;
            }

            if (i_21 < 72550989 * aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331) {
                i_13 = aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331 * 72550989 - i_21;
                i_6 -= i_13;
                i_21 = aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331 * 72550989;
                i_12 += i_13;
                i_9 += i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_21 + i_6 > aGraphicalRenderer_Sub3_8513.anInt9002 * 1714763515 * -1710988237) {
                i_13 = i_21 + i_6 - -1710988237 * aGraphicalRenderer_Sub3_8513.anInt9002 * 1714763515;
                i_6 -= i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 > 0 && i_7 > 0) {
                if ((i_4 & -16777216) == -16777216) {
                    method13771(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
                } else if ((i_4 & -16777216) != 0) {
                    method13772(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
                }
            }
        }

    }

    @Override
    void t(char var_1, int i_2, int i_3, int i_4, boolean bool_5) {
        int i_31 = i_3;
        int i_21 = i_2;
        if (aGraphicalRenderer_Sub3_8513.anIntArray8979 != null) {
            i_21 += anIntArray8514[var_1];
            i_31 += anIntArray8510[var_1];
            int i_6 = anIntArray8511[var_1];
            int i_7 = anIntArray8512[var_1];
            int i_8 = 444800403 * aGraphicalRenderer_Sub3_8513.anInt8980 * 299731099;
            int i_9 = i_21 + i_8 * i_31;
            int i_10 = i_8 - i_6;
            int i_11 = 0;
            int i_12 = 0;
            int i_13;
            if (i_31 < 1516535457 * aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577) {
                i_13 = aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577 * 1516535457 - i_31;
                i_7 -= i_13;
                i_31 = 1516535457 * aGraphicalRenderer_Sub3_8513.anInt9009 * 1457972577;
                i_12 += i_6 * i_13;
                i_9 += i_8 * i_13;
            }

            if (i_31 + i_7 > aGraphicalRenderer_Sub3_8513.anInt8986 * 760194793 * 1383960921) {
                i_7 -= i_31 + i_7 - 1383960921 * aGraphicalRenderer_Sub3_8513.anInt8986 * 760194793;
            }

            if (i_21 < 72550989 * aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331) {
                i_13 = aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331 * 72550989 - i_21;
                i_6 -= i_13;
                i_21 = aGraphicalRenderer_Sub3_8513.anInt8983 * -363774331 * 72550989;
                i_12 += i_13;
                i_9 += i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_21 + i_6 > aGraphicalRenderer_Sub3_8513.anInt9002 * 1714763515 * -1710988237) {
                i_13 = i_21 + i_6 - -1710988237 * aGraphicalRenderer_Sub3_8513.anInt9002 * 1714763515;
                i_6 -= i_13;
                i_11 += i_13;
                i_10 += i_13;
            }

            if (i_6 > 0 && i_7 > 0) {
                if ((i_4 & -16777216) == -16777216) {
                    method13771(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
                } else if ((i_4 & -16777216) != 0) {
                    method13772(aByteArrayArray8509[var_1], aGraphicalRenderer_Sub3_8513.anIntArray8979, i_4, i_12, i_9, i_6, i_7, i_10, i_11);
                }
            }
        }

    }

}
