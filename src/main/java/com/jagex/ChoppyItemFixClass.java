package com.jagex;

public class ChoppyItemFixClass {

    float aFloat1678;
    float aFloat1679;
    float aFloat1680;
    int anInt1684;
    int anInt1700;
    float aFloat1702;
    boolean aBool1671;
    int anInt1677;
    int[] anIntArray1693;
    float aFloat1696;
    int anInt1674;
    int[] anIntArray1698;
    float aFloat1695;
    int[] anIntArray1673;
    float aFloat1681;
    int anInt1694;
    int anInt1691;
    int anInt1697;
    int anInt1701;
    int anInt1699;
    int anInt1706;
    int anInt1707;
    boolean aBool1672;
    boolean aBool1675 = true;
    boolean aBool1676;
    float aFloat1682;
    float aFloat1683 = 1.0F;
    int[] anIntArray1685 = new int[4096];
    int anInt1688 = -1;
    int anInt1692 = -1;
    boolean aBool1703 = true;
    int anInt1704 = -1;
    boolean aBool1708;
    JavaRenderer aGraphicalRenderer_Sub3_1686;
    Class185 aClass185_1687;
    int anInt1705;
    int[] anIntArray1689;
    float[] aFloatArray1690;

    ChoppyItemFixClass(JavaRenderer hardwarerenderer_1, Class185 class185_2) {
        aGraphicalRenderer_Sub3_1686 = hardwarerenderer_1;
        aClass185_1687 = class185_2;
        anInt1705 = aGraphicalRenderer_Sub3_1686.anInt8980;
        anIntArray1689 = aGraphicalRenderer_Sub3_1686.anIntArray8979;
        aFloatArray1690 = aGraphicalRenderer_Sub3_1686.aFloatArray9010;
    }

    int method2416() {
        return anIntArray1685[0] % anInt1705;
    }

    int method2417() {
        return anIntArray1685[0] / anInt1705;
    }

    void method2418(boolean bool_1) {
        aBool1671 = bool_1;
    }

    void method2419(boolean bool_1, boolean bool_2, boolean bool_3, int[] ints_4, int i_5, int i_6, int i_7, int i_8, int i_9, float f_10, float f_11) {
        int i_91 = i_9;
        int i_81 = i_8;
        int i_71 = i_7;
        if (aBool1708) {
            if (i_91 > anInt1684) {
                i_91 = anInt1684;
            }

            if (i_81 < 0) {
                i_81 = 0;
            }
        }

        if (i_81 < i_91) {
            i_5 += i_81 - 1;
            i_71 = i_91 - i_81 >> 2;
            f_10 += f_11 * i_81;
            int i_12;
            int i_13;
            int i_14;
            if (aClass185_1687.aBool2334) {
                if (anInt1674 == 0) {
                    while (true) {
                        --i_71;
                        if (i_71 < 0) {
                            i_71 = i_91 - i_81 & 0x3;

                            while (true) {
                                --i_71;
                                if (i_71 < 0) {
                                    return;
                                }

                                ++i_5;
                                if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                                    if (bool_1) {
                                        ints_4[i_5] = i_6;
                                    }

                                    if (bool_2) {
                                        aFloatArray1690[i_5] = f_10;
                                    }
                                }

                                f_10 += f_11;
                            }
                        }

                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                ints_4[i_5] = i_6;
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                ints_4[i_5] = i_6;
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                ints_4[i_5] = i_6;
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                ints_4[i_5] = i_6;
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                    }
                }

                if (anInt1674 != 254) {
                    i_12 = anInt1674;
                    i_13 = 256 - anInt1674;
                    i_6 = ((i_6 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_6 & 0xff00) >> 8 & 0xff00);

                    while (true) {
                        --i_71;
                        if (i_71 < 0) {
                            i_71 = i_91 - i_81 & 0x3;

                            while (true) {
                                --i_71;
                                if (i_71 < 0) {
                                    return;
                                }

                                ++i_5;
                                if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                                    if (bool_1) {
                                        i_14 = ints_4[i_5];
                                        if (bool_3) {
                                            ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                        } else {
                                            ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                        }
                                    }

                                    if (bool_2) {
                                        aFloatArray1690[i_5] = f_10;
                                    }
                                }

                                f_10 += f_11;
                            }
                        }

                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                i_14 = ints_4[i_5];
                                if (bool_3) {
                                    ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                } else {
                                    ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                }
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                i_14 = ints_4[i_5];
                                if (bool_3) {
                                    ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                } else {
                                    ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                }
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                i_14 = ints_4[i_5];
                                if (bool_3) {
                                    ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                } else {
                                    ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                }
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            if (bool_1) {
                                i_14 = ints_4[i_5];
                                if (bool_3) {
                                    ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                } else {
                                    ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                }
                            }

                            if (bool_2) {
                                aFloatArray1690[i_5] = f_10;
                            }
                        }

                        f_10 += f_11;
                    }
                }

                if (i_81 != 0 && i_91 <= anInt1684 - 1) {
                    while (true) {
                        --i_71;
                        if (i_71 < 0) {
                            i_71 = i_91 - i_81 & 0x3;

                            while (true) {
                                --i_71;
                                if (i_71 < 0) {
                                    return;
                                }

                                ++i_5;
                                if ((!bool_2 || f_10 < aFloatArray1690[i_5]) && bool_1) {
                                    ints_4[i_5 - 1] = ints_4[i_5];
                                }

                                f_10 += f_11;
                            }
                        }

                        ++i_5;
                        if ((!bool_2 || f_10 < aFloatArray1690[i_5]) && bool_1) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                        ++i_5;
                        if ((!bool_2 || f_10 < aFloatArray1690[i_5]) && bool_1) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                        ++i_5;
                        if ((!bool_2 || f_10 < aFloatArray1690[i_5]) && bool_1) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                        ++i_5;
                        if ((!bool_2 || f_10 < aFloatArray1690[i_5]) && bool_1) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                    }
                }
            } else if (bool_1) {
                if (anInt1674 == 0) {
                    while (true) {
                        --i_71;
                        if (i_71 < 0) {
                            i_71 = i_91 - i_81 & 0x3;

                            while (true) {
                                --i_71;
                                if (i_71 < 0) {
                                    return;
                                }

                                ++i_5;
                                if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                                    ints_4[i_5] = i_6;
                                }

                                f_10 += f_11;
                            }
                        }

                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5] = i_6;
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5] = i_6;
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5] = i_6;
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5] = i_6;
                        }

                        f_10 += f_11;
                    }
                }

                if (anInt1674 != 254) {
                    i_12 = anInt1674;
                    i_13 = 256 - anInt1674;
                    i_6 = ((i_6 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_6 & 0xff00) >> 8 & 0xff00);

                    while (true) {
                        --i_71;
                        if (i_71 < 0) {
                            i_71 = i_91 - i_81 & 0x3;

                            while (true) {
                                --i_71;
                                if (i_71 < 0) {
                                    return;
                                }

                                ++i_5;
                                if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                                    i_14 = ints_4[i_5];
                                    if (bool_3) {
                                        ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                    } else {
                                        ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                                    }
                                }

                                f_10 += f_11;
                            }
                        }

                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            i_14 = ints_4[i_5];
                            if (bool_3) {
                                ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            } else {
                                ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            i_14 = ints_4[i_5];
                            if (bool_3) {
                                ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            } else {
                                ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            i_14 = ints_4[i_5];
                            if (bool_3) {
                                ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            } else {
                                ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            }
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            i_14 = ints_4[i_5];
                            if (bool_3) {
                                ints_4[i_5] = (i_13 | i_14 >> 24) << 24 | ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            } else {
                                ints_4[i_5] = ((i_14 & 0xff00ff) * i_12 >> 8 & 0xff00ff) + (i_12 * (i_14 & 0xff00) >> 8 & 0xff00) + i_6;
                            }
                        }

                        f_10 += f_11;
                    }
                }

                if (i_81 != 0 && i_91 <= anInt1684 - 1) {
                    while (true) {
                        --i_71;
                        if (i_71 < 0) {
                            i_71 = i_91 - i_81 & 0x3;

                            while (true) {
                                --i_71;
                                if (i_71 < 0) {
                                    return;
                                }

                                ++i_5;
                                if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                                    ints_4[i_5 - 1] = ints_4[i_5];
                                }

                                f_10 += f_11;
                            }
                        }

                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                        ++i_5;
                        if (!bool_2 || f_10 < aFloatArray1690[i_5]) {
                            ints_4[i_5 - 1] = ints_4[i_5];
                        }

                        f_10 += f_11;
                    }
                }
            }
        }

    }

    void method2421(float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, int i_22, int i_23, int i_24, int i_25, float f_26, float f_27, float f_28, int i_29, float f_30, int i_31, float f_32, int i_33, float f_34) {
        float f_321 = f_32;
        int i_231 = i_23;
        int i_311 = i_31;
        float f_710 = f_7;
        float f_101 = f_10;
        float f_161 = f_16;
        float f_191 = f_19;
        float f_131 = f_13;
        float f_261 = f_26;
        float f_301 = f_30;
        float f_341 = f_34;
        int i_221 = i_22;
        int i_241 = i_24;
        int i_291 = i_29;
        int i_331 = i_33;
        float f_92 = f_9;
        float f_121 = f_12;
        float f_151 = f_15;
        float f_181 = f_18;
        float f_211 = f_21;
        float f_281 = f_28;
        float f_510 = f_5;
        float f_810 = f_8;
        float f_111 = f_11;
        float f_141 = f_14;
        float f_171 = f_17;
        float f_201 = f_20;
        float f_271 = f_27;
        float f_410 = f_4;
        float f_610 = f_6;
        anInt1677 = i_25;
        float f_35;
        int i_36;
        if (f_410 > f_510 || f_410 > f_610) {
            if (f_510 <= f_610) {
                f_35 = f_710;
                f_710 = f_810;
                f_810 = f_35;
                f_35 = f_410;
                f_410 = f_510;
                f_510 = f_35;
                f_35 = f_101;
                f_101 = f_111;
                f_111 = f_35;
                f_35 = f_161;
                f_161 = f_171;
                f_171 = f_35;
                f_35 = f_191;
                f_191 = f_201;
                f_201 = f_35;
                f_35 = f_131;
                f_131 = f_141;
                f_141 = f_35;
                f_35 = f_261;
                f_261 = f_271;
                f_271 = f_35;
                f_35 = f_301;
                f_301 = f_321;
                f_321 = f_35;
                i_36 = i_221;
                i_221 = i_231;
                i_231 = i_36;
                i_36 = i_291;
                i_291 = i_311;
                i_311 = i_36;
            } else {
                f_35 = f_710;
                f_710 = f_92;
                f_92 = f_35;
                f_35 = f_410;
                f_410 = f_610;
                f_610 = f_35;
                f_35 = f_101;
                f_101 = f_121;
                f_121 = f_35;
                f_35 = f_161;
                f_161 = f_181;
                f_181 = f_35;
                f_35 = f_191;
                f_191 = f_211;
                f_211 = f_35;
                f_35 = f_131;
                f_131 = f_151;
                f_151 = f_35;
                f_35 = f_261;
                f_261 = f_281;
                f_281 = f_35;
                f_35 = f_301;
                f_301 = f_341;
                f_341 = f_35;
                i_36 = i_221;
                i_221 = i_241;
                i_241 = i_36;
                i_36 = i_291;
                i_291 = i_331;
                i_331 = i_36;
            }
        }

        int i_37;
        if (i_291 != anInt1692) {
            anIntArray1693 = aGraphicalRenderer_Sub3_1686.method14359(i_291);
            if (anIntArray1693 == null) {
                anInt1674 = 255 - (i_221 >> 24 & 0xff);
                i_37 = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_1686.method14362(i_291)) & 0xffff];
                i_36 = -16777216 | (i_37 >> 16 & 0xff) * (i_221 >> 16 & 0xff) << 8 & 0xff0000 | (i_221 >> 8 & 0xff) * (i_37 >> 8 & 0xff) & 0xff00 | (i_37 & 0xff) * (i_221 & 0xff) >> 8;
                method2425(true, true, false, f_410, f_510, f_610, f_710, f_810, f_92, f_101, f_111, f_121, Class302.method5364(i_36, i_25, f_261), Class302.method5364(i_36, i_25, f_271), Class302.method5364(i_36, i_25, f_281));
                return;
            }

            anInt1694 = aGraphicalRenderer_Sub3_1686.isHalfSize(i_291) ? 64 : aGraphicalRenderer_Sub3_1686.size;
            anInt1691 = anInt1694 - 1;
            anInt1697 = aGraphicalRenderer_Sub3_1686.method14361(i_291);
        }

        aFloat1696 = f_301;
        if (anInt1688 != i_311) {
            anIntArray1698 = aGraphicalRenderer_Sub3_1686.method14359(i_311);
            if (anIntArray1698 == null) {
                anInt1674 = 255 - (i_221 >> 24 & 0xff);
                i_37 = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_1686.method14362(i_311)) & 0xffff];
                i_36 = -16777216 | (i_37 >> 16 & 0xff) * (i_221 >> 16 & 0xff) << 8 & 0xff0000 | (i_221 >> 8 & 0xff) * (i_37 >> 8 & 0xff) & 0xff00 | (i_37 & 0xff) * (i_221 & 0xff) >> 8;
                method2425(true, true, false, f_410, f_510, f_610, f_710, f_810, f_92, f_101, f_111, f_121, Class302.method5364(i_36, i_25, f_261), Class302.method5364(i_36, i_25, f_271), Class302.method5364(i_36, i_25, f_281));
                return;
            }

            anInt1701 = aGraphicalRenderer_Sub3_1686.isHalfSize(i_311) ? 64 : aGraphicalRenderer_Sub3_1686.size;
            anInt1699 = anInt1701 - 1;
        }

        aFloat1695 = f_321;
        if (i_331 != anInt1704) {
            anIntArray1673 = aGraphicalRenderer_Sub3_1686.method14359(i_331);
            if (anIntArray1673 == null) {
                anInt1674 = 255 - (i_221 >> 24 & 0xff);
                i_37 = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_1686.method14362(i_331)) & 0xffff];
                i_36 = -16777216 | (i_37 >> 16 & 0xff) * (i_221 >> 16 & 0xff) << 8 & 0xff0000 | (i_221 >> 8 & 0xff) * (i_37 >> 8 & 0xff) & 0xff00 | (i_37 & 0xff) * (i_221 & 0xff) >> 8;
                method2425(true, true, false, ((int) f_410), ((int) f_510), ((int) f_610), ((int) f_710), ((int) f_810), ((int) f_92), ((int) f_101), ((int) f_111), ((int) f_121), Class302.method5364(i_36, i_25, f_261), Class302.method5364(i_36, i_25, f_271), Class302.method5364(i_36, i_25, f_281));
                return;
            }

            anInt1706 = aGraphicalRenderer_Sub3_1686.isHalfSize(i_331) ? 64 : aGraphicalRenderer_Sub3_1686.size;
            anInt1707 = anInt1706 - 1;
        }

        aFloat1681 = f_341;
        f_161 /= f_131;
        f_171 /= f_141;
        f_181 /= f_151;
        f_191 /= f_131;
        f_201 /= f_141;
        f_211 /= f_151;
        f_101 = 1.0F / f_101;
        f_111 = 1.0F / f_111;
        f_121 = 1.0F / f_121;
        f_131 = 1.0F / f_131;
        f_141 = 1.0F / f_141;
        f_151 = 1.0F / f_151;
        f_35 = (i_221 >> 24 & 0xff);
        float f_38 = (i_231 >> 24 & 0xff);
        float f_39 = (i_241 >> 24 & 0xff);
        float f_40 = (i_221 >> 16 & 0xff);
        float f_41 = (i_231 >> 16 & 0xff);
        float f_42 = (i_241 >> 16 & 0xff);
        float f_43 = (i_221 >> 8 & 0xff);
        float f_44 = (i_231 >> 8 & 0xff);
        float f_45 = (i_241 >> 8 & 0xff);
        float f_46 = (i_221 & 0xff);
        float f_47 = (i_231 & 0xff);
        float f_48 = (i_241 & 0xff);
        float f_49 = 1.0F;
        float f_50 = 0.0F;
        float f_51 = 0.0F;
        float f_52 = 0.0F;
        float f_53 = 1.0F;
        float f_54 = 0.0F;
        float f_55 = 0.0F;
        float f_56 = 0.0F;
        float f_57 = 0.0F;
        float f_58 = 0.0F;
        float f_59 = 0.0F;
        float f_60 = 0.0F;
        float f_61 = 0.0F;
        float f_62 = 0.0F;
        float f_63 = 0.0F;
        float f_64 = 0.0F;
        float f_65 = 0.0F;
        float f_66 = 0.0F;
        float f_67;
        if (f_510 != f_410) {
            f_67 = f_510 - f_410;
            f_55 = (f_810 - f_710) / f_67;
            f_56 = (f_111 - f_101) / f_67;
            f_57 = (f_141 - f_131) / f_67;
            f_58 = (f_171 - f_161) / f_67;
            f_59 = (f_201 - f_191) / f_67;
            f_60 = (f_271 - f_261) / f_67;
            f_61 = (f_38 - f_35) / f_67;
            f_62 = (f_41 - f_40) / f_67;
            f_63 = (f_44 - f_43) / f_67;
            f_64 = (f_47 - f_46) / f_67;
            f_65 = (f_50 - f_49) / f_67;
            f_66 = (f_53 - f_52) / f_67;
        }

        f_67 = 0.0F;
        float f_68 = 0.0F;
        float f_69 = 0.0F;
        float f_70 = 0.0F;
        float f_71 = 0.0F;
        float f_72 = 0.0F;
        float f_73 = 0.0F;
        float f_74 = 0.0F;
        float f_75 = 0.0F;
        float f_76 = 0.0F;
        float f_77 = 0.0F;
        float f_78 = 0.0F;
        float f_79;
        if (f_610 != f_510) {
            f_79 = f_610 - f_510;
            f_67 = (f_92 - f_810) / f_79;
            f_68 = (f_121 - f_111) / f_79;
            f_69 = (f_151 - f_141) / f_79;
            f_70 = (f_181 - f_171) / f_79;
            f_71 = (f_211 - f_201) / f_79;
            f_72 = (f_281 - f_271) / f_79;
            f_73 = (f_39 - f_38) / f_79;
            f_74 = (f_42 - f_41) / f_79;
            f_75 = (f_45 - f_44) / f_79;
            f_76 = (f_48 - f_47) / f_79;
            f_77 = (f_51 - f_50) / f_79;
            f_78 = (f_54 - f_53) / f_79;
        }

        f_79 = 0.0F;
        float f_80 = 0.0F;
        float f_81 = 0.0F;
        float f_82 = 0.0F;
        float f_83 = 0.0F;
        float f_84 = 0.0F;
        float f_85 = 0.0F;
        float f_86 = 0.0F;
        float f_87 = 0.0F;
        float f_88 = 0.0F;
        float f_89 = 0.0F;
        float f_90 = 0.0F;
        if (f_410 != f_610) {
            float f_91 = f_410 - f_610;
            f_79 = (f_710 - f_92) / f_91;
            f_80 = (f_101 - f_121) / f_91;
            f_81 = (f_131 - f_151) / f_91;
            f_82 = (f_161 - f_181) / f_91;
            f_83 = (f_191 - f_211) / f_91;
            f_84 = (f_261 - f_281) / f_91;
            f_85 = (f_35 - f_39) / f_91;
            f_86 = (f_40 - f_42) / f_91;
            f_87 = (f_43 - f_45) / f_91;
            f_88 = (f_46 - f_48) / f_91;
            f_89 = (f_49 - f_51) / f_91;
            f_90 = (f_52 - f_54) / f_91;
        }

        if (f_410 < anInt1700) {
            if (f_510 > anInt1700) {
                f_510 = anInt1700;
            }

            if (f_610 > anInt1700) {
                f_610 = anInt1700;
            }

            if (f_510 < f_610) {
                f_92 = f_710;
                f_121 = f_101;
                f_151 = f_131;
                f_181 = f_161;
                f_211 = f_191;
                f_281 = f_261;
                f_39 = f_35;
                f_42 = f_40;
                f_45 = f_43;
                f_48 = f_46;
                f_51 = f_49;
                f_54 = f_52;
                if (f_410 < 0.0F) {
                    f_710 -= f_55 * f_410;
                    f_92 -= f_79 * f_410;
                    f_101 -= f_56 * f_410;
                    f_121 -= f_80 * f_410;
                    f_131 -= f_57 * f_410;
                    f_151 -= f_81 * f_410;
                    f_161 -= f_58 * f_410;
                    f_181 -= f_82 * f_410;
                    f_191 -= f_59 * f_410;
                    f_211 -= f_83 * f_410;
                    f_261 -= f_60 * f_410;
                    f_281 -= f_84 * f_410;
                    f_35 -= f_61 * f_410;
                    f_39 -= f_85 * f_410;
                    f_40 -= f_62 * f_410;
                    f_42 -= f_86 * f_410;
                    f_43 -= f_63 * f_410;
                    f_45 -= f_87 * f_410;
                    f_46 -= f_64 * f_410;
                    f_48 -= f_88 * f_410;
                    f_49 -= f_65 * f_410;
                    f_51 -= f_89 * f_410;
                    f_52 -= f_66 * f_410;
                    f_54 -= f_90 * f_410;
                    f_410 = 0.0F;
                }

                if (f_510 < 0.0F) {
                    f_810 -= f_67 * f_510;
                    f_111 -= f_68 * f_510;
                    f_141 -= f_69 * f_510;
                    f_171 -= f_70 * f_510;
                    f_201 -= f_71 * f_510;
                    f_271 -= f_72 * f_510;
                    f_38 -= f_73 * f_510;
                    f_41 -= f_74 * f_510;
                    f_44 -= f_75 * f_510;
                    f_47 -= f_76 * f_510;
                    f_50 -= f_77 * f_510;
                    f_53 -= f_78 * f_510;
                    f_510 = 0.0F;
                }

                if ((f_410 == f_510 || f_79 >= f_55) && (f_410 != f_510 || f_79 <= f_67)) {
                    f_410 = ((int) (f_410 + 0.5F));
                    f_510 = ((int) (f_510 + 0.5F));
                    f_610 = ((int) (f_610 + 0.5F)) - f_510;
                    f_510 -= f_410;

                    for (f_410 = anIntArray1685[(int) f_410]; --f_510 >= 0.0F; f_410 += anInt1705) {
                        method2427(anIntArray1689, (int) f_410, (int) f_710, (int) f_92, f_101, f_121, f_131, f_151, f_161, f_181, f_191, f_211, f_261, f_281, f_35, f_39, f_40, f_42, f_43, f_45, f_46, f_48, f_49, f_51, f_52, f_54);
                        f_710 += f_55;
                        f_92 += f_79;
                        f_101 += f_56;
                        f_121 += f_80;
                        f_131 += f_57;
                        f_151 += f_81;
                        f_161 += f_58;
                        f_181 += f_82;
                        f_191 += f_59;
                        f_211 += f_83;
                        f_261 += f_60;
                        f_281 += f_84;
                        f_35 += f_61;
                        f_39 += f_85;
                        f_40 += f_62;
                        f_42 += f_86;
                        f_43 += f_63;
                        f_45 += f_87;
                        f_46 += f_64;
                        f_48 += f_88;
                        f_49 += f_65;
                        f_51 += f_89;
                        f_52 += f_66;
                        f_54 += f_90;
                    }

                    while (--f_610 >= 0.0F) {
                        method2427(anIntArray1689, (int) f_410, (int) f_810, (int) f_92, f_111, f_121, f_141, f_151, f_171, f_181, f_201, f_211, f_271, f_281, f_38, f_39, f_41, f_42, f_44, f_45, f_47, f_48, f_50, f_51, f_53, f_54);
                        f_810 += f_67;
                        f_92 += f_79;
                        f_111 += f_68;
                        f_121 += f_80;
                        f_141 += f_69;
                        f_151 += f_81;
                        f_171 += f_70;
                        f_181 += f_82;
                        f_201 += f_71;
                        f_211 += f_83;
                        f_271 += f_72;
                        f_281 += f_84;
                        f_38 += f_73;
                        f_39 += f_85;
                        f_41 += f_74;
                        f_42 += f_86;
                        f_44 += f_75;
                        f_45 += f_87;
                        f_47 += f_76;
                        f_48 += f_88;
                        f_50 += f_77;
                        f_51 += f_89;
                        f_53 += f_78;
                        f_54 += f_90;
                        f_410 += anInt1705;
                    }
                } else {
                    f_410 = ((int) (f_410 + 0.5F));
                    f_510 = ((int) (f_510 + 0.5F));
                    f_610 = ((int) (f_610 + 0.5F)) - f_510;
                    f_510 -= f_410;

                    for (f_410 = anIntArray1685[(int) f_410]; --f_510 >= 0.0F; f_410 += anInt1705) {
                        method2427(anIntArray1689, (int) f_410, (int) f_92, (int) f_710, f_121, f_101, f_151, f_131, f_181, f_161, f_211, f_191, f_281, f_261, f_39, f_35, f_42, f_40, f_45, f_43, f_48, f_46, f_51, f_49, f_54, f_52);
                        f_710 += f_55;
                        f_92 += f_79;
                        f_101 += f_56;
                        f_121 += f_80;
                        f_131 += f_57;
                        f_151 += f_81;
                        f_161 += f_58;
                        f_181 += f_82;
                        f_191 += f_59;
                        f_211 += f_83;
                        f_261 += f_60;
                        f_281 += f_84;
                        f_35 += f_61;
                        f_39 += f_85;
                        f_40 += f_62;
                        f_42 += f_86;
                        f_43 += f_63;
                        f_45 += f_87;
                        f_46 += f_64;
                        f_48 += f_88;
                        f_49 += f_65;
                        f_51 += f_89;
                        f_52 += f_66;
                        f_54 += f_90;
                    }

                    while (--f_610 >= 0.0F) {
                        method2427(anIntArray1689, (int) f_410, (int) f_92, (int) f_810, f_121, f_111, f_151, f_141, f_181, f_171, f_211, f_201, f_281, f_271, f_39, f_38, f_42, f_41, f_45, f_44, f_48, f_47, f_51, f_50, f_54, f_53);
                        f_810 += f_67;
                        f_92 += f_79;
                        f_111 += f_68;
                        f_121 += f_80;
                        f_141 += f_69;
                        f_151 += f_81;
                        f_171 += f_70;
                        f_181 += f_82;
                        f_201 += f_71;
                        f_211 += f_83;
                        f_271 += f_72;
                        f_281 += f_84;
                        f_38 += f_73;
                        f_39 += f_85;
                        f_41 += f_74;
                        f_42 += f_86;
                        f_44 += f_75;
                        f_45 += f_87;
                        f_47 += f_76;
                        f_48 += f_88;
                        f_50 += f_77;
                        f_51 += f_89;
                        f_53 += f_78;
                        f_54 += f_90;
                        f_410 += anInt1705;
                    }
                }
            } else {
                f_810 = f_710;
                f_111 = f_101;
                f_141 = f_131;
                f_171 = f_161;
                f_201 = f_191;
                f_271 = f_261;
                f_38 = f_35;
                f_41 = f_40;
                f_44 = f_43;
                f_47 = f_46;
                f_50 = f_49;
                f_53 = f_52;
                if (f_410 < 0.0F) {
                    f_710 -= f_55 * f_410;
                    f_810 -= f_79 * f_410;
                    f_101 -= f_56 * f_410;
                    f_111 -= f_80 * f_410;
                    f_131 -= f_57 * f_410;
                    f_141 -= f_81 * f_410;
                    f_161 -= f_58 * f_410;
                    f_171 -= f_82 * f_410;
                    f_191 -= f_59 * f_410;
                    f_201 -= f_83 * f_410;
                    f_261 -= f_60 * f_410;
                    f_271 -= f_84 * f_410;
                    f_35 -= f_61 * f_410;
                    f_38 -= f_85 * f_410;
                    f_40 -= f_62 * f_410;
                    f_41 -= f_86 * f_410;
                    f_43 -= f_63 * f_410;
                    f_44 -= f_87 * f_410;
                    f_46 -= f_64 * f_410;
                    f_47 -= f_88 * f_410;
                    f_49 -= f_65 * f_410;
                    f_50 -= f_89 * f_410;
                    f_52 -= f_66 * f_410;
                    f_53 -= f_90 * f_410;
                    f_410 = 0.0F;
                }

                if (f_610 < 0.0F) {
                    f_92 -= f_67 * f_610;
                    f_121 -= f_68 * f_610;
                    f_151 -= f_69 * f_610;
                    f_181 -= f_70 * f_610;
                    f_211 -= f_71 * f_610;
                    f_281 -= f_72 * f_610;
                    f_39 -= f_73 * f_610;
                    f_42 -= f_74 * f_610;
                    f_45 -= f_75 * f_610;
                    f_48 -= f_76 * f_610;
                    f_51 -= f_77 * f_610;
                    f_54 -= f_78 * f_610;
                    f_610 = 0.0F;
                }

                if (f_410 != f_610 && f_79 < f_55 || f_410 == f_610 && f_67 > f_55) {
                    f_410 = ((int) (f_410 + 0.5F));
                    f_610 = ((int) (f_610 + 0.5F));
                    f_510 = ((int) (f_510 + 0.5F)) - f_610;
                    f_610 -= f_410;

                    for (f_410 = anIntArray1685[(int) f_410]; --f_610 >= 0.0F; f_410 += anInt1705) {
                        method2427(anIntArray1689, (int) f_410, (int) f_810, (int) f_710, f_111, f_101, f_141, f_131, f_171, f_161, f_201, f_191, f_271, f_261, f_38, f_35, f_41, f_40, f_44, f_43, f_47, f_46, f_50, f_49, f_53, f_52);
                        f_710 += f_55;
                        f_810 += f_79;
                        f_101 += f_56;
                        f_111 += f_80;
                        f_131 += f_57;
                        f_141 += f_81;
                        f_161 += f_58;
                        f_171 += f_82;
                        f_191 += f_59;
                        f_201 += f_83;
                        f_261 += f_60;
                        f_271 += f_84;
                        f_35 += f_61;
                        f_38 += f_85;
                        f_40 += f_62;
                        f_41 += f_86;
                        f_43 += f_63;
                        f_44 += f_87;
                        f_46 += f_64;
                        f_47 += f_88;
                        f_49 += f_65;
                        f_50 += f_89;
                        f_52 += f_66;
                        f_53 += f_90;
                    }

                    while (--f_510 >= 0.0F) {
                        method2427(anIntArray1689, (int) f_410, (int) f_92, (int) f_710, f_121, f_101, f_151, f_131, f_181, f_161, f_211, f_191, f_281, f_261, f_39, f_35, f_42, f_40, f_45, f_43, f_48, f_46, f_51, f_49, f_54, f_52);
                        f_92 += f_67;
                        f_710 += f_55;
                        f_121 += f_68;
                        f_101 += f_56;
                        f_151 += f_69;
                        f_131 += f_57;
                        f_181 += f_70;
                        f_161 += f_58;
                        f_211 += f_71;
                        f_191 += f_59;
                        f_281 += f_72;
                        f_261 += f_60;
                        f_39 += f_73;
                        f_35 += f_61;
                        f_42 += f_74;
                        f_40 += f_62;
                        f_45 += f_75;
                        f_43 += f_63;
                        f_48 += f_76;
                        f_46 += f_64;
                        f_51 += f_77;
                        f_49 += f_65;
                        f_54 += f_78;
                        f_52 += f_66;
                        f_410 += anInt1705;
                    }
                } else {
                    f_410 = ((int) (f_410 + 0.5F));
                    f_610 = ((int) (f_610 + 0.5F));
                    f_510 = ((int) (f_510 + 0.5F)) - f_610;
                    f_610 -= f_410;

                    for (f_410 = anIntArray1685[(int) f_410]; --f_610 >= 0.0F; f_410 += anInt1705) {
                        method2427(anIntArray1689, (int) f_410, (int) f_710, (int) f_810, f_101, f_111, f_131, f_141, f_161, f_171, f_191, f_201, f_261, f_271, f_35, f_38, f_40, f_41, f_43, f_44, f_46, f_47, f_49, f_50, f_52, f_53);
                        f_810 += f_79;
                        f_710 += f_55;
                        f_111 += f_80;
                        f_101 += f_56;
                        f_141 += f_81;
                        f_131 += f_57;
                        f_171 += f_82;
                        f_161 += f_58;
                        f_201 += f_83;
                        f_191 += f_59;
                        f_271 += f_84;
                        f_261 += f_60;
                        f_38 += f_85;
                        f_35 += f_61;
                        f_41 += f_86;
                        f_40 += f_62;
                        f_44 += f_87;
                        f_43 += f_63;
                        f_47 += f_88;
                        f_46 += f_64;
                        f_50 += f_89;
                        f_49 += f_65;
                        f_53 += f_90;
                        f_52 += f_66;
                    }

                    while (--f_510 >= 0.0F) {
                        method2427(anIntArray1689, (int) f_410, (int) f_710, (int) f_92, f_101, f_121, f_131, f_151, f_161, f_181, f_191, f_211, f_261, f_281, f_35, f_39, f_40, f_42, f_43, f_45, f_46, f_48, f_49, f_51, f_52, f_54);
                        f_710 += f_55;
                        f_92 += f_67;
                        f_101 += f_56;
                        f_121 += f_68;
                        f_131 += f_57;
                        f_151 += f_69;
                        f_161 += f_58;
                        f_181 += f_70;
                        f_191 += f_59;
                        f_211 += f_71;
                        f_261 += f_60;
                        f_281 += f_72;
                        f_35 += f_61;
                        f_39 += f_73;
                        f_40 += f_62;
                        f_42 += f_74;
                        f_43 += f_63;
                        f_45 += f_75;
                        f_46 += f_64;
                        f_48 += f_76;
                        f_49 += f_65;
                        f_51 += f_77;
                        f_52 += f_66;
                        f_54 += f_78;
                        f_410 += anInt1705;
                    }
                }
            }
        }

    }

    void method2422(boolean bool_1, boolean bool_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16) {
        int i_81 = i_8;
        int i_71 = i_7;
        int i_61 = i_6;
        int i_51 = i_5;
        if (aBool1708) {
            if (i_81 > anInt1684) {
                i_81 = anInt1684;
            }

            if (i_71 < 0) {
                i_71 = 0;
            }
        }

        if (i_71 < i_81) {
            int i_17;
            int i_18;
            int i_19;
            int i_20;
            int i_21;
            int i_22;
            if (aBool1676) {
                i_4 += i_71;
                f_11 += f_12 * i_71;
                f_13 += f_14 * i_71;
                f_15 += f_16 * i_71;
                if (aBool1675) {
                    i_61 = i_81 - i_71 >> 2;
                    f_12 *= 4.0F;
                    f_14 *= 4.0F;
                    f_16 *= 4.0F;
                    if (anInt1674 == 0) {
                        if (i_61 > 0) {
                            do {
                                i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                ints_3[i_4++] = i_51;
                                ints_3[i_4++] = i_51;
                                ints_3[i_4++] = i_51;
                                ints_3[i_4++] = i_51;
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

                            do {
                                ints_3[i_4++] = i_51;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    } else if (!aBool1672) {
                        i_17 = anInt1674;
                        i_19 = 256 - anInt1674;
                        if (i_61 > 0) {
                            do {
                                i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);
                                i_18 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4++] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    ints_3[i_4++] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    ints_3[i_4++] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    ints_3[i_4++] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                }

                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                            i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);

                            do {
                                i_18 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4++] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                }

                                --i_61;
                            } while (i_61 > 0);
                        }
                    } else {
                        if (i_61 > 0) {
                            do {
                                i_51 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                i_19 = i_4++;
                                i_21 = ints_3[i_19];
                                i_20 = i_51 + i_21;
                                i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                ints_3[i_19] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                i_20 = i_4++;
                                int i_23 = ints_3[i_20];
                                int i_24 = i_51 + i_23;
                                int i_25 = (i_23 & 0xff00ff) + (i_51 & 0xff00ff);
                                i_23 = (i_25 & 0x1000100) + (i_24 - i_25 & 0x10000);
                                ints_3[i_20] = -16777216 | i_24 - i_23 | i_23 - (i_23 >>> 8);
                                i_24 = i_4++;
                                int i_26 = ints_3[i_24];
                                int i_27 = i_51 + i_26;
                                int i_28 = (i_26 & 0xff00ff) + (i_51 & 0xff00ff);
                                i_26 = (i_28 & 0x1000100) + (i_27 - i_28 & 0x10000);
                                ints_3[i_24] = -16777216 | i_27 - i_26 | i_26 - (i_26 >>> 8);
                                i_27 = i_4++;
                                int i_29 = ints_3[i_27];
                                int i_30 = i_51 + i_29;
                                int i_31 = (i_29 & 0xff00ff) + (i_51 & 0xff00ff);
                                i_29 = (i_31 & 0x1000100) + (i_30 - i_31 & 0x10000);
                                ints_3[i_27] = -16777216 | i_30 - i_29 | i_29 - (i_29 >>> 8);
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

                            do {
                                i_19 = i_4++;
                                i_21 = ints_3[i_19];
                                i_20 = i_51 + i_21;
                                i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                ints_3[i_19] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                --i_61;
                            } while (i_61 > 0);
                        }
                    }
                } else {
                    i_61 = i_81 - i_71;
                    if (anInt1674 == 0) {
                        do {
                            ints_3[i_4++] = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                            f_11 += f_12;
                            f_13 += f_14;
                            f_15 += f_16;
                            --i_61;
                        } while (i_61 > 0);
                    } else if (!aBool1672) {
                        i_17 = anInt1674;
                        i_19 = 256 - anInt1674;

                        do {
                            i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                            f_11 += f_12;
                            f_13 += f_14;
                            f_15 += f_16;
                            i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);
                            i_18 = ints_3[i_4];
                            if (bool_2) {
                                ints_3[i_4++] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                            } else {
                                ints_3[i_4++] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                            }

                            --i_61;
                        } while (i_61 > 0);
                    } else {
                        do {
                            i_19 = i_4++;
                            i_18 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                            i_21 = ints_3[i_19];
                            i_20 = i_18 + i_21;
                            i_22 = (i_18 & 0xff00ff) + (i_21 & 0xff00ff);
                            i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                            ints_3[i_19] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                            f_11 += f_12;
                            f_13 += f_14;
                            f_15 += f_16;
                            --i_61;
                        } while (i_61 > 0);
                    }
                }
            } else {
                i_4 += i_71 - 1;
                f_9 += f_10 * i_71;
                f_11 += f_12 * i_71;
                f_13 += f_14 * i_71;
                f_15 += f_16 * i_71;
                if (aClass185_1687.aBool2334) {
                    if (aBool1675) {
                        i_61 = i_81 - i_71 >> 2;
                        f_12 *= 4.0F;
                        f_14 *= 4.0F;
                        f_16 *= 4.0F;
                        if (anInt1674 == 0) {
                            if (i_61 > 0) {
                                do {
                                    i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                    f_11 += f_12;
                                    f_13 += f_14;
                                    f_15 += f_16;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        ints_3[i_4] = i_51;
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        ints_3[i_4] = i_51;
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        ints_3[i_4] = i_51;
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        ints_3[i_4] = i_51;
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    --i_61;
                                } while (i_61 > 0);
                            }

                            i_61 = i_81 - i_71 & 0x3;
                            if (i_61 > 0) {
                                i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

                                do {
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        ints_3[i_4] = i_51;
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    --i_61;
                                } while (i_61 > 0);
                            }
                        } else if (!aBool1672) {
                            i_17 = anInt1674;
                            i_19 = 256 - anInt1674;
                            if (i_61 > 0) {
                                do {
                                    i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                    f_11 += f_12;
                                    f_13 += f_14;
                                    f_15 += f_16;
                                    i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_18 = ints_3[i_4];
                                        if (bool_2) {
                                            ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        } else {
                                            ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        }

                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_18 = ints_3[i_4];
                                        if (bool_2) {
                                            ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        } else {
                                            ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        }

                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_18 = ints_3[i_4];
                                        if (bool_2) {
                                            ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        } else {
                                            ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        }

                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_18 = ints_3[i_4];
                                        if (bool_2) {
                                            ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        } else {
                                            ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        }

                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    --i_61;
                                } while (i_61 > 0);
                            }

                            i_61 = i_81 - i_71 & 0x3;
                            if (i_61 > 0) {
                                i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);

                                do {
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_18 = ints_3[i_4];
                                        if (bool_2) {
                                            ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        } else {
                                            ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        }

                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    --i_61;
                                } while (i_61 > 0);
                            }
                        } else {
                            if (i_61 > 0) {
                                do {
                                    i_51 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                    f_11 += f_12;
                                    f_13 += f_14;
                                    f_15 += f_16;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_21 = ints_3[i_4];
                                        i_20 = i_51 + i_21;
                                        i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                        i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                        ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_21 = ints_3[i_4];
                                        i_20 = i_51 + i_21;
                                        i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                        i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                        ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_21 = ints_3[i_4];
                                        i_20 = i_51 + i_21;
                                        i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                        i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                        ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_21 = ints_3[i_4];
                                        i_20 = i_51 + i_21;
                                        i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                        i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                        ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    --i_61;
                                } while (i_61 > 0);
                            }

                            i_61 = i_81 - i_71 & 0x3;
                            if (i_61 > 0) {
                                i_51 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

                                do {
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_21 = ints_3[i_4];
                                        i_20 = i_51 + i_21;
                                        i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                        i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                        ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    --i_61;
                                } while (i_61 > 0);
                            }
                        }
                    } else {
                        i_61 = i_81 - i_71;
                        if (anInt1674 != 0) {
                            if (aBool1672) {
                                do {
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_18 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                        i_21 = ints_3[i_4];
                                        i_20 = i_18 + i_21;
                                        i_22 = (i_18 & 0xff00ff) + (i_21 & 0xff00ff);
                                        i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                        ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    f_11 += f_12;
                                    f_13 += f_14;
                                    f_15 += f_16;
                                    --i_61;
                                } while (i_61 > 0);
                            } else {
                                i_17 = anInt1674;
                                i_19 = 256 - anInt1674;

                                do {
                                    ++i_4;
                                    if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                        i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                        i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);
                                        i_18 = ints_3[i_4];
                                        if (bool_2) {
                                            ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        } else {
                                            ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                        }

                                        if (bool_1) {
                                            aFloatArray1690[i_4] = f_9;
                                        }
                                    }

                                    f_9 += f_10;
                                    f_11 += f_12;
                                    f_13 += f_14;
                                    f_15 += f_16;
                                    --i_61;
                                } while (i_61 > 0);
                            }
                        } else {
                            do {
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_9;
                                    }
                                }

                                f_9 += f_10;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    }
                } else if (aBool1675) {
                    i_61 = i_81 - i_71 >> 2;
                    f_12 *= 4.0F;
                    f_14 *= 4.0F;
                    f_16 *= 4.0F;
                    if (anInt1674 == 0) {
                        if (i_61 > 0) {
                            do {
                                i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                }

                                f_9 += f_10;
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

                            do {
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                }

                                f_9 += f_10;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    } else if (!aBool1672) {
                        i_17 = anInt1674;
                        i_19 = 256 - anInt1674;
                        if (i_61 > 0) {
                            do {
                                i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_18 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    }
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_18 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    }
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_18 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    }
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_18 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    }
                                }

                                f_9 += f_10;
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                            i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);

                            do {
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_18 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    }
                                }

                                f_9 += f_10;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    } else {
                        if (i_61 > 0) {
                            do {
                                i_51 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_21 = ints_3[i_4];
                                    i_20 = i_51 + i_21;
                                    i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                    i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                    ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_21 = ints_3[i_4];
                                    i_20 = i_51 + i_21;
                                    i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                    i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                    ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_21 = ints_3[i_4];
                                    i_20 = i_51 + i_21;
                                    i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                    i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                    ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                }

                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_21 = ints_3[i_4];
                                    i_20 = i_51 + i_21;
                                    i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                    i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                    ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                }

                                f_9 += f_10;
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;

                            do {
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_21 = ints_3[i_4];
                                    i_20 = i_51 + i_21;
                                    i_22 = (i_21 & 0xff00ff) + (i_51 & 0xff00ff);
                                    i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                    ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                }

                                f_9 += f_10;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    }
                } else {
                    i_61 = i_81 - i_71;
                    if (anInt1674 != 0) {
                        if (aBool1672) {
                            do {
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_18 = (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                    i_21 = ints_3[i_4];
                                    i_20 = i_18 + i_21;
                                    i_22 = (i_18 & 0xff00ff) + (i_21 & 0xff00ff);
                                    i_21 = (i_22 & 0x1000100) + (i_20 - i_22 & 0x10000);
                                    ints_3[i_4] = -16777216 | i_20 - i_21 | i_21 - (i_21 >>> 8);
                                }

                                f_9 += f_10;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                --i_61;
                            } while (i_61 > 0);
                        } else {
                            i_17 = anInt1674;
                            i_19 = 256 - anInt1674;

                            do {
                                ++i_4;
                                if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                    i_51 = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                                    i_51 = (i_19 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_19 * (i_51 & 0xff00) >> 8 & 0xff00);
                                    i_18 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_19 | i_18 >> 24) << 24 | i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_18 & 0xff00ff) * i_17 >> 8 & 0xff00ff) + (i_17 * (i_18 & 0xff00) >> 8 & 0xff00);
                                    }
                                }

                                f_9 += f_10;
                                f_11 += f_12;
                                f_13 += f_14;
                                f_15 += f_16;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    } else {
                        do {
                            ++i_4;
                            if (!bool_1 || f_9 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = -16777216 | (int) f_11 & 0xff0000 | (int) f_13 & 0xff00 | (int) f_15 & 0xff;
                            }

                            f_9 += f_10;
                            f_11 += f_12;
                            f_13 += f_14;
                            f_15 += f_16;
                            --i_61;
                        } while (i_61 > 0);
                    }
                }
            }
        }

    }

    void method2424(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, int i_22, int i_23, int i_24, int i_25, float f_26, float f_27, float f_28, int i_29) {
        int i_231 = i_23;
        float f_74 = f_7;
        float f_101 = f_10;
        float f_161 = f_16;
        float f_191 = f_19;
        float f_131 = f_13;
        float f_261 = f_26;
        int i_221 = i_22;
        int i_241 = i_24;
        float f_91 = f_9;
        float f_121 = f_12;
        float f_151 = f_15;
        float f_181 = f_18;
        float f_211 = f_21;
        float f_281 = f_28;
        float f_510 = f_5;
        float f_81 = f_8;
        float f_111 = f_11;
        float f_141 = f_14;
        float f_171 = f_17;
        float f_201 = f_20;
        float f_271 = f_27;
        float f_410 = f_4;
        float f_610 = f_6;
        if (!bool_1) {
            method2428(false, bool_2, bool_3, f_410, f_510, f_610, f_74, f_81, f_91, f_101, f_111, f_121, 0);
        } else {
            int i_30;
            if (i_29 != anInt1692) {
                anIntArray1693 = aGraphicalRenderer_Sub3_1686.method14359(i_29);
                if (anIntArray1693 == null) {
                    anInt1674 = 255 - (i_221 >> 24 & 0xff);
                    int i_74 = Class335.anIntArray3916[Class372.method6362(aGraphicalRenderer_Sub3_1686.method14362(i_29)) & 0xffff];
                    i_30 = -16777216 | (i_74 >> 16 & 0xff) * (i_221 >> 16 & 0xff) << 8 & 0xff0000 | (i_221 >> 8 & 0xff) * (i_74 >> 8 & 0xff) & 0xff00 | (i_74 & 0xff) * (i_221 & 0xff) >> 8;
                    method2425(true, bool_2, bool_3, f_410, f_510, f_610, f_74, f_81, f_91, f_101, f_111, f_121, Class302.method5364(i_30, i_25, f_261), Class302.method5364(i_30, i_25, f_271), Class302.method5364(i_30, i_25, f_281));
                    return;
                }

                anInt1694 = aGraphicalRenderer_Sub3_1686.isHalfSize(i_29) ? 64 : aGraphicalRenderer_Sub3_1686.size;
                anInt1691 = anInt1694 - 1;
                anInt1697 = aGraphicalRenderer_Sub3_1686.method14361(i_29);
                aBool1703 = aGraphicalRenderer_Sub3_1686.method14403(i_29);
            }

            anInt1677 = i_25;
            float f_31;
            if (f_410 > f_510 || f_410 > f_610) {
                if (f_510 <= f_610) {
                    f_31 = f_74;
                    f_74 = f_81;
                    f_81 = f_31;
                    f_31 = f_410;
                    f_410 = f_510;
                    f_510 = f_31;
                    f_31 = f_101;
                    f_101 = f_111;
                    f_111 = f_31;
                    f_31 = f_161;
                    f_161 = f_171;
                    f_171 = f_31;
                    f_31 = f_191;
                    f_191 = f_201;
                    f_201 = f_31;
                    f_31 = f_131;
                    f_131 = f_141;
                    f_141 = f_31;
                    f_31 = f_261;
                    f_261 = f_271;
                    f_271 = f_31;
                    i_30 = i_221;
                    i_221 = i_231;
                    i_231 = i_30;
                } else {
                    f_31 = f_74;
                    f_74 = f_91;
                    f_91 = f_31;
                    f_31 = f_410;
                    f_410 = f_610;
                    f_610 = f_31;
                    f_31 = f_101;
                    f_101 = f_121;
                    f_121 = f_31;
                    f_31 = f_161;
                    f_161 = f_181;
                    f_181 = f_31;
                    f_31 = f_191;
                    f_191 = f_211;
                    f_211 = f_31;
                    f_31 = f_131;
                    f_131 = f_151;
                    f_151 = f_31;
                    f_31 = f_261;
                    f_261 = f_281;
                    f_281 = f_31;
                    i_30 = i_221;
                    i_221 = i_241;
                    i_241 = i_30;
                }
            }

            f_161 /= f_131;
            f_171 /= f_141;
            f_181 /= f_151;
            f_191 /= f_131;
            f_201 /= f_141;
            f_211 /= f_151;
            f_101 = 1.0F / f_101;
            f_111 = 1.0F / f_111;
            f_121 = 1.0F / f_121;
            f_131 = 1.0F / f_131;
            f_141 = 1.0F / f_141;
            f_151 = 1.0F / f_151;
            f_31 = (i_221 >> 24 & 0xff);
            float f_32 = (i_231 >> 24 & 0xff);
            float f_33 = (i_241 >> 24 & 0xff);
            float f_34 = (i_221 >> 16 & 0xff);
            float f_35 = (i_231 >> 16 & 0xff);
            float f_36 = (i_241 >> 16 & 0xff);
            float f_37 = (i_221 >> 8 & 0xff);
            float f_38 = (i_231 >> 8 & 0xff);
            float f_39 = (i_241 >> 8 & 0xff);
            float f_40 = (i_221 & 0xff);
            float f_41 = (i_231 & 0xff);
            float f_42 = (i_241 & 0xff);
            float f_43 = 0.0F;
            float f_44 = 0.0F;
            float f_45 = 0.0F;
            float f_46 = 0.0F;
            float f_47 = 0.0F;
            float f_48 = 0.0F;
            float f_49 = 0.0F;
            float f_50 = 0.0F;
            float f_51 = 0.0F;
            float f_52 = 0.0F;
            float f_53;
            if (f_510 != f_410) {
                f_53 = f_510 - f_410;
                f_43 = (f_81 - f_74) / f_53;
                f_44 = (f_111 - f_101) / f_53;
                f_45 = (f_141 - f_131) / f_53;
                f_46 = (f_171 - f_161) / f_53;
                f_47 = (f_201 - f_191) / f_53;
                f_48 = (f_271 - f_261) / f_53;
                f_49 = (f_32 - f_31) / f_53;
                f_50 = (f_35 - f_34) / f_53;
                f_51 = (f_38 - f_37) / f_53;
                f_52 = (f_41 - f_40) / f_53;
            }

            f_53 = 0.0F;
            float f_54 = 0.0F;
            float f_55 = 0.0F;
            float f_56 = 0.0F;
            float f_57 = 0.0F;
            float f_58 = 0.0F;
            float f_59 = 0.0F;
            float f_60 = 0.0F;
            float f_61 = 0.0F;
            float f_62 = 0.0F;
            float f_63;
            if (f_610 != f_510) {
                f_63 = f_610 - f_510;
                f_53 = (f_91 - f_81) / f_63;
                f_54 = (f_121 - f_111) / f_63;
                f_55 = (f_151 - f_141) / f_63;
                f_56 = (f_181 - f_171) / f_63;
                f_57 = (f_211 - f_201) / f_63;
                f_58 = (f_281 - f_271) / f_63;
                f_59 = (f_33 - f_32) / f_63;
                f_60 = (f_36 - f_35) / f_63;
                f_61 = (f_39 - f_38) / f_63;
                f_62 = (f_42 - f_41) / f_63;
            }

            f_63 = 0.0F;
            float f_64 = 0.0F;
            float f_65 = 0.0F;
            float f_66 = 0.0F;
            float f_67 = 0.0F;
            float f_68 = 0.0F;
            float f_69 = 0.0F;
            float f_70 = 0.0F;
            float f_71 = 0.0F;
            float f_72 = 0.0F;
            if (f_410 != f_610) {
                float f_73 = f_410 - f_610;
                f_63 = (f_74 - f_91) / f_73;
                f_64 = (f_101 - f_121) / f_73;
                f_65 = (f_131 - f_151) / f_73;
                f_66 = (f_161 - f_181) / f_73;
                f_67 = (f_191 - f_211) / f_73;
                f_68 = (f_261 - f_281) / f_73;
                f_69 = (f_31 - f_33) / f_73;
                f_70 = (f_34 - f_36) / f_73;
                f_71 = (f_37 - f_39) / f_73;
                f_72 = (f_40 - f_42) / f_73;
            }

            if (f_410 < anInt1700) {
                if (f_510 > anInt1700) {
                    f_510 = anInt1700;
                }

                if (f_610 > anInt1700) {
                    f_610 = anInt1700;
                }

                if (f_510 < f_610) {
                    f_91 = f_74;
                    f_121 = f_101;
                    f_151 = f_131;
                    f_181 = f_161;
                    f_211 = f_191;
                    f_281 = f_261;
                    f_33 = f_31;
                    f_36 = f_34;
                    f_39 = f_37;
                    f_42 = f_40;
                    if (f_410 < 0.0F) {
                        f_74 -= f_43 * f_410;
                        f_91 -= f_63 * f_410;
                        f_101 -= f_44 * f_410;
                        f_121 -= f_64 * f_410;
                        f_131 -= f_45 * f_410;
                        f_151 -= f_65 * f_410;
                        f_161 -= f_46 * f_410;
                        f_181 -= f_66 * f_410;
                        f_191 -= f_47 * f_410;
                        f_211 -= f_67 * f_410;
                        f_261 -= f_48 * f_410;
                        f_281 -= f_68 * f_410;
                        f_31 -= f_49 * f_410;
                        f_33 -= f_69 * f_410;
                        f_34 -= f_49 * f_410;
                        f_36 -= f_69 * f_410;
                        f_37 -= f_49 * f_410;
                        f_39 -= f_69 * f_410;
                        f_40 -= f_49 * f_410;
                        f_42 -= f_69 * f_410;
                        f_410 = 0.0F;
                    }

                    if (f_510 < 0.0F) {
                        f_81 -= f_53 * f_510;
                        f_111 -= f_54 * f_510;
                        f_141 -= f_55 * f_510;
                        f_171 -= f_56 * f_510;
                        f_201 -= f_57 * f_510;
                        f_271 -= f_58 * f_510;
                        f_32 -= f_59 * f_510;
                        f_35 -= f_60 * f_510;
                        f_38 -= f_61 * f_510;
                        f_41 -= f_62 * f_510;
                        f_510 = 0.0F;
                    }

                    if (f_410 != f_510 && f_63 < f_43 || f_410 == f_510 && f_63 > f_53) {
                        f_410 = ((int) (f_410 + 0.5F));
                        f_510 = ((int) (f_510 + 0.5F));
                        f_610 = ((int) (f_610 + 0.5F)) - f_510;
                        f_510 -= f_410;

                        for (f_410 = anIntArray1685[(int) f_410]; --f_510 >= 0.0F; f_410 += anInt1705) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_91, (int) f_74, f_121, f_101, f_151, f_131, f_181, f_161, f_211, f_191, f_281, f_261, f_33, f_31, f_36, f_34, f_39, f_37, f_42, f_40);
                            f_74 += f_43;
                            f_91 += f_63;
                            f_101 += f_44;
                            f_121 += f_64;
                            f_131 += f_45;
                            f_151 += f_65;
                            f_161 += f_46;
                            f_181 += f_66;
                            f_191 += f_47;
                            f_211 += f_67;
                            f_261 += f_48;
                            f_281 += f_68;
                            f_31 += f_49;
                            f_33 += f_69;
                            f_34 += f_50;
                            f_36 += f_70;
                            f_37 += f_51;
                            f_39 += f_71;
                            f_40 += f_52;
                            f_42 += f_72;
                        }

                        while (--f_610 >= 0.0F) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_91, (int) f_81, f_121, f_111, f_151, f_141, f_181, f_171, f_211, f_201, f_281, f_271, f_33, f_32, f_36, f_35, f_39, f_38, f_42, f_41);
                            f_81 += f_53;
                            f_91 += f_63;
                            f_111 += f_54;
                            f_121 += f_64;
                            f_141 += f_55;
                            f_151 += f_65;
                            f_171 += f_56;
                            f_181 += f_66;
                            f_201 += f_57;
                            f_211 += f_67;
                            f_271 += f_58;
                            f_281 += f_68;
                            f_32 += f_59;
                            f_33 += f_69;
                            f_35 += f_60;
                            f_36 += f_70;
                            f_38 += f_61;
                            f_39 += f_71;
                            f_41 += f_62;
                            f_42 += f_72;
                            f_410 += anInt1705;
                        }
                    } else {
                        f_410 = ((int) (f_410 + 0.5F));
                        f_510 = ((int) (f_510 + 0.5F));
                        f_610 = ((int) (f_610 + 0.5F)) - f_510;
                        f_510 -= f_410;

                        for (f_410 = anIntArray1685[(int) f_410]; --f_510 >= 0.0F; f_410 += anInt1705) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_74, (int) f_91, f_101, f_121, f_131, f_151, f_161, f_181, f_191, f_211, f_261, f_281, f_31, f_33, f_34, f_36, f_37, f_39, f_40, f_42);
                            f_74 += f_43;
                            f_91 += f_63;
                            f_101 += f_44;
                            f_121 += f_64;
                            f_131 += f_45;
                            f_151 += f_65;
                            f_161 += f_46;
                            f_181 += f_66;
                            f_191 += f_47;
                            f_211 += f_67;
                            f_261 += f_48;
                            f_281 += f_68;
                            f_31 += f_49;
                            f_33 += f_69;
                            f_34 += f_50;
                            f_36 += f_70;
                            f_37 += f_51;
                            f_39 += f_71;
                            f_40 += f_52;
                            f_42 += f_72;
                        }

                        while (--f_610 >= 0.0F) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_81, (int) f_91, f_111, f_121, f_141, f_151, f_171, f_181, f_201, f_211, f_271, f_281, f_32, f_33, f_35, f_36, f_38, f_39, f_41, f_42);
                            f_81 += f_53;
                            f_91 += f_63;
                            f_111 += f_54;
                            f_121 += f_64;
                            f_141 += f_55;
                            f_151 += f_65;
                            f_171 += f_56;
                            f_181 += f_66;
                            f_201 += f_57;
                            f_211 += f_67;
                            f_271 += f_58;
                            f_281 += f_68;
                            f_32 += f_59;
                            f_33 += f_69;
                            f_35 += f_60;
                            f_36 += f_70;
                            f_38 += f_61;
                            f_39 += f_71;
                            f_41 += f_62;
                            f_42 += f_72;
                            f_410 += anInt1705;
                        }
                    }
                } else {
                    f_81 = f_74;
                    f_111 = f_101;
                    f_141 = f_131;
                    f_171 = f_161;
                    f_201 = f_191;
                    f_271 = f_261;
                    f_32 = f_31;
                    f_35 = f_34;
                    f_38 = f_37;
                    f_41 = f_40;
                    if (f_410 < 0.0F) {
                        f_74 -= f_43 * f_410;
                        f_81 -= f_63 * f_410;
                        f_101 -= f_44 * f_410;
                        f_111 -= f_64 * f_410;
                        f_131 -= f_45 * f_410;
                        f_141 -= f_65 * f_410;
                        f_161 -= f_46 * f_410;
                        f_171 -= f_66 * f_410;
                        f_191 -= f_47 * f_410;
                        f_201 -= f_67 * f_410;
                        f_261 -= f_48 * f_410;
                        f_271 -= f_68 * f_410;
                        f_31 -= f_49 * f_410;
                        f_32 -= f_69 * f_410;
                        f_34 -= f_49 * f_410;
                        f_35 -= f_69 * f_410;
                        f_37 -= f_49 * f_410;
                        f_38 -= f_69 * f_410;
                        f_40 -= f_49 * f_410;
                        f_41 -= f_69 * f_410;
                        f_410 = 0.0F;
                    }

                    if (f_610 < 0.0F) {
                        f_91 -= f_53 * f_610;
                        f_121 -= f_54 * f_610;
                        f_151 -= f_55 * f_610;
                        f_181 -= f_56 * f_610;
                        f_211 -= f_57 * f_610;
                        f_281 -= f_58 * f_610;
                        f_33 -= f_59 * f_610;
                        f_36 -= f_60 * f_610;
                        f_39 -= f_61 * f_610;
                        f_42 -= f_62 * f_610;
                        f_610 = 0.0F;
                    }

                    if ((f_410 == f_610 || f_63 >= f_43) && (f_410 != f_610 || f_53 <= f_43)) {
                        f_410 = ((int) (f_410 + 0.5F));
                        f_610 = ((int) (f_610 + 0.5F));
                        f_510 = ((int) (f_510 + 0.5F)) - f_610;
                        f_610 -= f_410;

                        for (f_410 = anIntArray1685[(int) f_410]; --f_610 >= 0.0F; f_410 += anInt1705) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_74, (int) f_81, f_101, f_111, f_131, f_141, f_161, f_171, f_191, f_201, f_261, f_271, f_31, f_32, f_34, f_35, f_37, f_38, f_40, f_41);
                            f_81 += f_63;
                            f_74 += f_43;
                            f_111 += f_64;
                            f_101 += f_44;
                            f_141 += f_65;
                            f_131 += f_45;
                            f_171 += f_66;
                            f_161 += f_46;
                            f_201 += f_67;
                            f_191 += f_47;
                            f_271 += f_68;
                            f_261 += f_48;
                            f_32 += f_69;
                            f_31 += f_49;
                            f_35 += f_70;
                            f_34 += f_50;
                            f_38 += f_71;
                            f_37 += f_51;
                            f_41 += f_72;
                            f_40 += f_52;
                        }

                        while (--f_510 >= 0.0F) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_74, (int) f_91, f_101, f_121, f_131, f_151, f_161, f_181, f_191, f_211, f_261, f_281, f_31, f_33, f_34, f_36, f_37, f_39, f_40, f_42);
                            f_74 += f_43;
                            f_91 += f_53;
                            f_101 += f_44;
                            f_121 += f_54;
                            f_131 += f_45;
                            f_151 += f_55;
                            f_161 += f_46;
                            f_181 += f_56;
                            f_191 += f_47;
                            f_211 += f_57;
                            f_261 += f_48;
                            f_281 += f_58;
                            f_31 += f_49;
                            f_33 += f_59;
                            f_34 += f_50;
                            f_36 += f_60;
                            f_37 += f_51;
                            f_39 += f_61;
                            f_40 += f_52;
                            f_42 += f_62;
                            f_410 += anInt1705;
                        }
                    } else {
                        f_410 = ((int) (f_410 + 0.5F));
                        f_610 = ((int) (f_610 + 0.5F));
                        f_510 = ((int) (f_510 + 0.5F)) - f_610;
                        f_610 -= f_410;

                        for (f_410 = anIntArray1685[(int) f_410]; --f_610 >= 0.0F; f_410 += anInt1705) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_81, (int) f_74, f_111, f_101, f_141, f_131, f_171, f_161, f_201, f_191, f_271, f_261, f_32, f_31, f_35, f_34, f_38, f_37, f_41, f_40);
                            f_74 += f_43;
                            f_81 += f_63;
                            f_101 += f_44;
                            f_111 += f_64;
                            f_131 += f_45;
                            f_141 += f_65;
                            f_161 += f_46;
                            f_171 += f_66;
                            f_191 += f_47;
                            f_201 += f_67;
                            f_261 += f_48;
                            f_271 += f_68;
                            f_31 += f_49;
                            f_32 += f_69;
                            f_34 += f_50;
                            f_35 += f_70;
                            f_37 += f_51;
                            f_38 += f_71;
                            f_40 += f_52;
                            f_41 += f_72;
                        }

                        while (--f_510 >= 0.0F) {
                            method2434(bool_2, bool_3, anIntArray1689, (int) f_410, (int) f_91, (int) f_74, f_121, f_101, f_151, f_131, f_181, f_161, f_211, f_191, f_281, f_261, f_33, f_31, f_36, f_34, f_39, f_37, f_42, f_40);
                            f_91 += f_53;
                            f_74 += f_43;
                            f_121 += f_54;
                            f_101 += f_44;
                            f_151 += f_55;
                            f_131 += f_45;
                            f_181 += f_56;
                            f_161 += f_46;
                            f_211 += f_57;
                            f_191 += f_47;
                            f_281 += f_58;
                            f_261 += f_48;
                            f_33 += f_59;
                            f_31 += f_49;
                            f_36 += f_60;
                            f_34 += f_50;
                            f_39 += f_61;
                            f_37 += f_51;
                            f_42 += f_62;
                            f_40 += f_52;
                            f_410 += anInt1705;
                        }
                    }
                }
            }
        }

    }

    void method2425(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, int i_13, int i_14, int i_15) {
        float f_91 = f_9;
        float f_81 = f_8;
        float f_43 = f_4;
        float f_71 = f_7;
        float f_61 = f_6;
        float f_51 = f_5;
        if (!bool_1) {
            method2428(false, bool_2, bool_3, f_43, f_51, f_61, f_71, f_81, f_91, f_10, f_11, f_12, 0);
        } else if (aBool1671) {
            aGraphicalRenderer_Sub3_1686.method8429((int) f_71, (int) f_43, (int) f_81, (int) f_51, -16777216 | i_13);
            aGraphicalRenderer_Sub3_1686.method8429((int) f_81, (int) f_51, (int) f_91, (int) f_61, -16777216 | i_13);
            aGraphicalRenderer_Sub3_1686.method8429((int) f_91, (int) f_61, (int) f_71, (int) f_43, -16777216 | i_13);
        } else {
            float f_16 = f_81 - f_71;
            float f_17 = f_51 - f_43;
            float f_18 = f_91 - f_71;
            float f_19 = f_61 - f_43;
            float f_20 = f_11 - f_10;
            float f_21 = f_12 - f_10;
            float f_22 = ((i_14 & 0xff0000) - (i_13 & 0xff0000));
            float f_23 = ((i_15 & 0xff0000) - (i_13 & 0xff0000));
            float f_24 = ((i_14 & 0xff00) - (i_13 & 0xff00));
            float f_25 = ((i_15 & 0xff00) - (i_13 & 0xff00));
            float f_26 = ((i_14 & 0xff) - (i_13 & 0xff));
            float f_27 = ((i_15 & 0xff) - (i_13 & 0xff));
            float f_28;
            if (f_61 != f_51) {
                f_28 = (f_91 - f_81) / (f_61 - f_51);
            } else {
                f_28 = 0.0F;
            }

            float f_29;
            if (f_51 != f_43) {
                f_29 = f_16 / f_17;
            } else {
                f_29 = 0.0F;
            }

            float f_30;
            if (f_61 != f_43) {
                f_30 = f_18 / f_19;
            } else {
                f_30 = 0.0F;
            }

            float f_31 = f_16 * f_19 - f_18 * f_17;
            if (f_31 != 0.0F) {
                float f_32 = (f_20 * f_19 - f_21 * f_17) / f_31;
                float f_33 = (f_21 * f_16 - f_20 * f_18) / f_31;
                float f_34 = (f_22 * f_19 - f_23 * f_17) / f_31;
                float f_35 = (f_23 * f_16 - f_22 * f_18) / f_31;
                float f_36 = (f_24 * f_19 - f_25 * f_17) / f_31;
                float f_37 = (f_25 * f_16 - f_24 * f_18) / f_31;
                float f_38 = (f_26 * f_19 - f_27 * f_17) / f_31;
                float f_39 = (f_27 * f_16 - f_26 * f_18) / f_31;
                float f_40;
                float f_41;
                float f_42;
                if (f_43 <= f_51 && f_43 <= f_61) {
                    if (f_43 < anInt1700) {
                        if (f_51 > anInt1700) {
                            f_51 = anInt1700;
                        }

                        if (f_61 > anInt1700) {
                            f_61 = anInt1700;
                        }

                        f_10 = f_10 - f_32 * f_71 + f_32;
                        f_41 = (i_13 & 0xff0000) - f_34 * f_71 + f_34;
                        f_42 = (i_13 & 0xff00) - f_36 * f_71 + f_36;
                        f_40 = (i_13 & 0xff) - f_38 * f_71 + f_38;
                        if (f_51 < f_61) {
                            f_91 = f_71;
                            if (f_43 < 0.0F) {
                                f_91 = f_71 - f_30 * f_43;
                                f_71 -= f_29 * f_43;
                                f_10 -= f_33 * f_43;
                                f_41 -= f_35 * f_43;
                                f_42 -= f_37 * f_43;
                                f_40 -= f_39 * f_43;
                                f_43 = 0.0F;
                            }

                            if (f_51 < 0.0F) {
                                f_81 -= f_28 * f_51;
                                f_51 = 0.0F;
                            }

                            if ((f_43 == f_51 || f_30 >= f_29) && (f_43 != f_51 || f_30 <= f_28)) {
                                f_43 = ((int) (f_43 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_51;
                                f_51 -= f_43;

                                for (f_43 = anIntArray1685[(int) f_43]; --f_51 >= 0.0F; f_43 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_71, (int) f_91, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_30;
                                    f_71 += f_29;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_81, (int) f_91, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_30;
                                    f_81 += f_28;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_43 += anInt1705;
                                }
                            } else {
                                f_43 = ((int) (f_43 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_51;
                                f_51 -= f_43;

                                for (f_43 = anIntArray1685[(int) f_43]; --f_51 >= 0.0F; f_43 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_91, (int) f_71, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_30;
                                    f_71 += f_29;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_91, (int) f_81, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_30;
                                    f_81 += f_28;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_43 += anInt1705;
                                }
                            }
                        } else {
                            f_81 = f_71;
                            if (f_43 < 0.0F) {
                                f_81 = f_71 - f_30 * f_43;
                                f_71 -= f_29 * f_43;
                                f_10 -= f_33 * f_43;
                                f_41 -= f_35 * f_43;
                                f_42 -= f_37 * f_43;
                                f_40 -= f_39 * f_43;
                                f_43 = 0.0F;
                            }

                            if (f_61 < 0.0F) {
                                f_91 -= f_28 * f_61;
                                f_61 = 0.0F;
                            }

                            if (f_43 != f_61 && f_30 < f_29 || f_43 == f_61 && f_28 > f_29) {
                                f_43 = ((int) (f_43 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F)) - f_61;
                                f_61 -= f_43;

                                for (f_43 = anIntArray1685[(int) f_43]; --f_61 >= 0.0F; f_43 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_81, (int) f_71, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_81 += f_30;
                                    f_71 += f_29;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_51 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_91, (int) f_71, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_28;
                                    f_71 += f_29;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_43 += anInt1705;
                                }
                            } else {
                                f_43 = ((int) (f_43 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F)) - f_61;
                                f_61 -= f_43;

                                for (f_43 = anIntArray1685[(int) f_43]; --f_61 >= 0.0F; f_43 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_71, (int) f_81, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_81 += f_30;
                                    f_71 += f_29;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_51 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_43, 0, 0, (int) f_71, (int) f_91, f_10, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_28;
                                    f_71 += f_29;
                                    f_10 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_43 += anInt1705;
                                }
                            }
                        }
                    }
                } else if (f_51 <= f_61) {
                    if (f_51 < anInt1700) {
                        if (f_61 > anInt1700) {
                            f_61 = anInt1700;
                        }

                        if (f_43 > anInt1700) {
                            f_43 = anInt1700;
                        }

                        f_11 = f_11 - f_32 * f_81 + f_32;
                        f_41 = (i_14 & 0xff0000) - f_34 * f_81 + f_34;
                        f_42 = (i_14 & 0xff00) - f_36 * f_81 + f_36;
                        f_40 = (i_14 & 0xff) - f_38 * f_81 + f_38;
                        if (f_61 < f_43) {
                            f_71 = f_81;
                            if (f_51 < 0.0F) {
                                f_71 = f_81 - f_29 * f_51;
                                f_81 -= f_28 * f_51;
                                f_11 -= f_33 * f_51;
                                f_41 -= f_35 * f_51;
                                f_42 -= f_37 * f_51;
                                f_40 -= f_39 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_61 < 0.0F) {
                                f_91 -= f_30 * f_61;
                                f_61 = 0.0F;
                            }

                            if ((f_51 == f_61 || f_29 >= f_28) && (f_51 != f_61 || f_29 <= f_30)) {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_43 = ((int) (f_43 + 0.5F)) - f_61;
                                f_61 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_61 >= 0.0F; f_51 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_81, (int) f_71, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_71 += f_29;
                                    f_81 += f_28;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_43 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_91, (int) f_71, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_71 += f_29;
                                    f_91 += f_30;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_51 += anInt1705;
                                }
                            } else {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_43 = ((int) (f_43 + 0.5F)) - f_61;
                                f_61 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_61 >= 0.0F; f_51 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_71, (int) f_81, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_71 += f_29;
                                    f_81 += f_28;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_43 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_71, (int) f_91, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_71 += f_29;
                                    f_91 += f_30;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_51 += anInt1705;
                                }
                            }
                        } else {
                            f_91 = f_81;
                            if (f_51 < 0.0F) {
                                f_91 = f_81 - f_29 * f_51;
                                f_81 -= f_28 * f_51;
                                f_11 -= f_33 * f_51;
                                f_41 -= f_35 * f_51;
                                f_42 -= f_37 * f_51;
                                f_40 -= f_39 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_43 < 0.0F) {
                                f_71 -= f_30 * f_43;
                                f_43 = 0.0F;
                            }

                            if (f_29 < f_28) {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_43 = ((int) (f_43 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_43;
                                f_43 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_43 >= 0.0F; f_51 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_91, (int) f_81, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_29;
                                    f_81 += f_28;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_71, (int) f_81, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_71 += f_30;
                                    f_81 += f_28;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_51 += anInt1705;
                                }
                            } else {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_43 = ((int) (f_43 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_43;
                                f_43 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_43 >= 0.0F; f_51 += anInt1705) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_81, (int) f_91, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_91 += f_29;
                                    f_81 += f_28;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2422(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_81, (int) f_71, f_11, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                    f_71 += f_30;
                                    f_81 += f_28;
                                    f_11 += f_33;
                                    f_41 += f_35;
                                    f_42 += f_37;
                                    f_40 += f_39;
                                    f_51 += anInt1705;
                                }
                            }
                        }
                    }
                } else if (f_61 < anInt1700) {
                    if (f_43 > anInt1700) {
                        f_43 = anInt1700;
                    }

                    if (f_51 > anInt1700) {
                        f_51 = anInt1700;
                    }

                    f_12 = f_12 - f_32 * f_91 + f_32;
                    f_41 = (i_15 & 0xff0000) - f_34 * f_91 + f_34;
                    f_42 = (i_15 & 0xff00) - f_36 * f_91 + f_36;
                    f_40 = (i_15 & 0xff) - f_38 * f_91 + f_38;
                    if (f_43 < f_51) {
                        f_81 = f_91;
                        if (f_61 < 0.0F) {
                            f_81 = f_91 - f_28 * f_61;
                            f_91 -= f_30 * f_61;
                            f_12 -= f_33 * f_61;
                            f_41 -= f_35 * f_61;
                            f_42 -= f_37 * f_61;
                            f_40 -= f_39 * f_61;
                            f_61 = 0.0F;
                        }

                        if (f_43 < 0.0F) {
                            f_71 -= f_29 * f_43;
                            f_43 = 0.0F;
                        }

                        if (f_28 < f_30) {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_43 = ((int) (f_43 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F)) - f_43;
                            f_43 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_43 >= 0.0F; f_61 += anInt1705) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_81, (int) f_91, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_81 += f_28;
                                f_91 += f_30;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                            }

                            while (--f_51 >= 0.0F) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_81, (int) f_71, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_81 += f_28;
                                f_71 += f_29;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                                f_61 += anInt1705;
                            }
                        } else {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_43 = ((int) (f_43 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F)) - f_43;
                            f_43 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_43 >= 0.0F; f_61 += anInt1705) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_91, (int) f_81, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_81 += f_28;
                                f_91 += f_30;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                            }

                            while (--f_51 >= 0.0F) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_71, (int) f_81, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_81 += f_28;
                                f_71 += f_29;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                                f_61 += anInt1705;
                            }
                        }
                    } else {
                        f_71 = f_91;
                        if (f_61 < 0.0F) {
                            f_71 = f_91 - f_28 * f_61;
                            f_91 -= f_30 * f_61;
                            f_12 -= f_33 * f_61;
                            f_41 -= f_35 * f_61;
                            f_42 -= f_37 * f_61;
                            f_40 -= f_39 * f_61;
                            f_61 = 0.0F;
                        }

                        if (f_51 < 0.0F) {
                            f_81 -= f_29 * f_51;
                            f_51 = 0.0F;
                        }

                        if (f_28 < f_30) {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F));
                            f_43 = ((int) (f_43 + 0.5F)) - f_51;
                            f_51 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_51 >= 0.0F; f_61 += anInt1705) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_71, (int) f_91, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_71 += f_28;
                                f_91 += f_30;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                            }

                            while (--f_43 >= 0.0F) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_81, (int) f_91, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_81 += f_29;
                                f_91 += f_30;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                                f_61 += anInt1705;
                            }
                        } else {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F));
                            f_43 = ((int) (f_43 + 0.5F)) - f_51;
                            f_51 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_51 >= 0.0F; f_61 += anInt1705) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_91, (int) f_71, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_71 += f_28;
                                f_91 += f_30;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                            }

                            while (--f_43 >= 0.0F) {
                                method2422(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_91, (int) f_81, f_12, f_32, f_41, f_34, f_42, f_36, f_40, f_38);
                                f_81 += f_29;
                                f_91 += f_30;
                                f_12 += f_33;
                                f_41 += f_35;
                                f_42 += f_37;
                                f_40 += f_39;
                                f_61 += anInt1705;
                            }
                        }
                    }
                }
            }
        }

    }

    void method2426(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15) {
        float f_91 = f_9;
        float f_81 = f_8;
        float f_41 = f_4;
        float f_71 = f_7;
        float f_61 = f_6;
        float f_51 = f_5;
        if (!bool_1) {
            method2428(false, bool_2, bool_3, f_41, f_51, f_61, f_71, f_81, f_91, f_10, f_11, f_12, 0);
        } else if (aBool1671) {
            aGraphicalRenderer_Sub3_1686.method8429((int) f_71, (int) f_41, (int) f_81, (int) f_51, Class335.anIntArray3916[(int) f_13 & 0xffff]);
            aGraphicalRenderer_Sub3_1686.method8429((int) f_81, (int) f_51, (int) f_91, (int) f_61, Class335.anIntArray3916[(int) f_13 & 0xffff]);
            aGraphicalRenderer_Sub3_1686.method8429((int) f_91, (int) f_61, (int) f_71, (int) f_41, Class335.anIntArray3916[(int) f_13 & 0xffff]);
        } else {
            float f_16 = f_81 - f_71;
            float f_17 = f_51 - f_41;
            float f_18 = f_91 - f_71;
            float f_19 = f_61 - f_41;
            float f_20 = f_14 - f_13;
            float f_21 = f_15 - f_13;
            float f_22 = f_11 - f_10;
            float f_23 = f_12 - f_10;
            float f_24;
            if (f_61 != f_51) {
                f_24 = (f_91 - f_81) / (f_61 - f_51);
            } else {
                f_24 = 0.0F;
            }

            float f_25;
            if (f_51 != f_41) {
                f_25 = f_16 / f_17;
            } else {
                f_25 = 0.0F;
            }

            float f_26;
            if (f_61 != f_41) {
                f_26 = f_18 / f_19;
            } else {
                f_26 = 0.0F;
            }

            float f_27 = f_16 * f_19 - f_18 * f_17;
            if (f_27 != 0.0F) {
                float f_28 = (f_20 * f_19 - f_21 * f_17) / f_27;
                float f_29 = (f_21 * f_16 - f_20 * f_18) / f_27;
                float f_30 = (f_22 * f_19 - f_23 * f_17) / f_27;
                float f_31 = (f_23 * f_16 - f_22 * f_18) / f_27;
                if (f_41 <= f_51 && f_41 <= f_61) {
                    if (f_41 < anInt1700) {
                        if (f_51 > anInt1700) {
                            f_51 = anInt1700;
                        }

                        if (f_61 > anInt1700) {
                            f_61 = anInt1700;
                        }

                        f_13 = f_13 - f_28 * f_71 + f_28;
                        f_10 = f_10 - f_30 * f_71 + f_30;
                        if (f_51 < f_61) {
                            f_91 = f_71;
                            if (f_41 < 0.0F) {
                                f_91 = f_71 - f_26 * f_41;
                                f_71 -= f_25 * f_41;
                                f_13 -= f_29 * f_41;
                                f_10 -= f_31 * f_41;
                                f_41 = 0.0F;
                            }

                            if (f_51 < 0.0F) {
                                f_81 -= f_24 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_41 != f_51 && f_26 < f_25 || f_41 == f_51 && f_26 > f_24) {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_51;
                                f_51 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_51 >= 0.0F; f_41 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_91, (int) f_71, f_13, f_28, f_10, f_30);
                                    f_91 += f_26;
                                    f_71 += f_25;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_91, (int) f_81, f_13, f_28, f_10, f_30);
                                    f_91 += f_26;
                                    f_81 += f_24;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                    f_41 += anInt1705;
                                }
                            } else {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_51;
                                f_51 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_51 >= 0.0F; f_41 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_71, (int) f_91, f_13, f_28, f_10, f_30);
                                    f_91 += f_26;
                                    f_71 += f_25;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_81, (int) f_91, f_13, f_28, f_10, f_30);
                                    f_91 += f_26;
                                    f_81 += f_24;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                    f_41 += anInt1705;
                                }
                            }
                        } else {
                            f_81 = f_71;
                            if (f_41 < 0.0F) {
                                f_81 = f_71 - f_26 * f_41;
                                f_71 -= f_25 * f_41;
                                f_13 -= f_29 * f_41;
                                f_10 -= f_31 * f_41;
                                f_41 = 0.0F;
                            }

                            if (f_61 < 0.0F) {
                                f_91 -= f_24 * f_61;
                                f_61 = 0.0F;
                            }

                            if ((f_41 == f_61 || f_26 >= f_25) && (f_41 != f_61 || f_24 <= f_25)) {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F)) - f_61;
                                f_61 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_61 >= 0.0F; f_41 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_71, (int) f_81, f_13, f_28, f_10, f_30);
                                    f_81 += f_26;
                                    f_71 += f_25;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                }

                                while (--f_51 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_71, (int) f_91, f_13, f_28, f_10, f_30);
                                    f_91 += f_24;
                                    f_71 += f_25;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                    f_41 += anInt1705;
                                }
                            } else {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F)) - f_61;
                                f_61 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_61 >= 0.0F; f_41 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_81, (int) f_71, f_13, f_28, f_10, f_30);
                                    f_81 += f_26;
                                    f_71 += f_25;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                }

                                while (--f_51 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_41, 0, 0, (int) f_91, (int) f_71, f_13, f_28, f_10, f_30);
                                    f_91 += f_24;
                                    f_71 += f_25;
                                    f_13 += f_29;
                                    f_10 += f_31;
                                    f_41 += anInt1705;
                                }
                            }
                        }
                    }
                } else if (f_51 <= f_61) {
                    if (f_51 < anInt1700) {
                        if (f_61 > anInt1700) {
                            f_61 = anInt1700;
                        }

                        if (f_41 > anInt1700) {
                            f_41 = anInt1700;
                        }

                        f_14 = f_14 - f_28 * f_81 + f_28;
                        f_11 = f_11 - f_30 * f_81 + f_30;
                        if (f_61 < f_41) {
                            f_71 = f_81;
                            if (f_51 < 0.0F) {
                                f_71 = f_81 - f_25 * f_51;
                                f_81 -= f_24 * f_51;
                                f_14 -= f_29 * f_51;
                                f_11 -= f_31 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_61 < 0.0F) {
                                f_91 -= f_26 * f_61;
                                f_61 = 0.0F;
                            }

                            if (f_51 != f_61 && f_25 < f_24 || f_51 == f_61 && f_25 > f_26) {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F)) - f_61;
                                f_61 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_61 >= 0.0F; f_51 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_71, (int) f_81, f_14, f_28, f_11, f_30);
                                    f_71 += f_25;
                                    f_81 += f_24;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                }

                                while (--f_41 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_71, (int) f_91, f_14, f_28, f_11, f_30);
                                    f_71 += f_25;
                                    f_91 += f_26;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                    f_51 += anInt1705;
                                }
                            } else {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F)) - f_61;
                                f_61 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_61 >= 0.0F; f_51 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_81, (int) f_71, f_14, f_28, f_11, f_30);
                                    f_71 += f_25;
                                    f_81 += f_24;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                }

                                while (--f_41 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_91, (int) f_71, f_14, f_28, f_11, f_30);
                                    f_71 += f_25;
                                    f_91 += f_26;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                    f_51 += anInt1705;
                                }
                            }
                        } else {
                            f_91 = f_81;
                            if (f_51 < 0.0F) {
                                f_91 = f_81 - f_25 * f_51;
                                f_81 -= f_24 * f_51;
                                f_14 -= f_29 * f_51;
                                f_11 -= f_31 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_41 < 0.0F) {
                                f_71 -= f_26 * f_41;
                                f_41 = 0.0F;
                            }

                            if (f_25 < f_24) {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_41;
                                f_41 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_41 >= 0.0F; f_51 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_91, (int) f_81, f_14, f_28, f_11, f_30);
                                    f_91 += f_25;
                                    f_81 += f_24;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_71, (int) f_81, f_14, f_28, f_11, f_30);
                                    f_71 += f_26;
                                    f_81 += f_24;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                    f_51 += anInt1705;
                                }
                            } else {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_41;
                                f_41 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_41 >= 0.0F; f_51 += anInt1705) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_81, (int) f_91, f_14, f_28, f_11, f_30);
                                    f_91 += f_25;
                                    f_81 += f_24;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2443(bool_2, bool_3, anIntArray1689, (int) f_51, 0, 0, (int) f_81, (int) f_71, f_14, f_28, f_11, f_30);
                                    f_71 += f_26;
                                    f_81 += f_24;
                                    f_14 += f_29;
                                    f_11 += f_31;
                                    f_51 += anInt1705;
                                }
                            }
                        }
                    }
                } else if (f_61 < anInt1700) {
                    if (f_41 > anInt1700) {
                        f_41 = anInt1700;
                    }

                    if (f_51 > anInt1700) {
                        f_51 = anInt1700;
                    }

                    f_15 = f_15 - f_28 * f_91 + f_28;
                    f_12 = f_12 - f_30 * f_91 + f_30;
                    if (f_41 < f_51) {
                        f_81 = f_91;
                        if (f_61 < 0.0F) {
                            f_81 = f_91 - f_24 * f_61;
                            f_91 -= f_26 * f_61;
                            f_15 -= f_29 * f_61;
                            f_12 -= f_31 * f_61;
                            f_61 = 0.0F;
                        }

                        if (f_41 < 0.0F) {
                            f_71 -= f_25 * f_41;
                            f_41 = 0.0F;
                        }

                        if (f_24 < f_26) {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F)) - f_41;
                            f_41 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_41 >= 0.0F; f_61 += anInt1705) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_81, (int) f_91, f_15, f_28, f_12, f_30);
                                f_81 += f_24;
                                f_91 += f_26;
                                f_15 += f_29;
                                f_12 += f_31;
                            }

                            while (--f_51 >= 0.0F) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_81, (int) f_71, f_15, f_28, f_12, f_30);
                                f_81 += f_24;
                                f_71 += f_25;
                                f_15 += f_29;
                                f_12 += f_31;
                                f_61 += anInt1705;
                            }
                        } else {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F)) - f_41;
                            f_41 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_41 >= 0.0F; f_61 += anInt1705) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_91, (int) f_81, f_15, f_28, f_12, f_30);
                                f_81 += f_24;
                                f_91 += f_26;
                                f_15 += f_29;
                                f_12 += f_31;
                            }

                            while (--f_51 >= 0.0F) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_71, (int) f_81, f_15, f_28, f_12, f_30);
                                f_81 += f_24;
                                f_71 += f_25;
                                f_15 += f_29;
                                f_12 += f_31;
                                f_61 += anInt1705;
                            }
                        }
                    } else {
                        f_71 = f_91;
                        if (f_61 < 0.0F) {
                            f_71 = f_91 - f_24 * f_61;
                            f_91 -= f_26 * f_61;
                            f_15 -= f_29 * f_61;
                            f_12 -= f_31 * f_61;
                            f_61 = 0.0F;
                        }

                        if (f_51 < 0.0F) {
                            f_81 -= f_25 * f_51;
                            f_51 = 0.0F;
                        }

                        if (f_24 < f_26) {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F)) - f_51;
                            f_51 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_51 >= 0.0F; f_61 += anInt1705) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_71, (int) f_91, f_15, f_28, f_12, f_30);
                                f_71 += f_24;
                                f_91 += f_26;
                                f_15 += f_29;
                                f_12 += f_31;
                            }

                            while (--f_41 >= 0.0F) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_81, (int) f_91, f_15, f_28, f_12, f_30);
                                f_81 += f_25;
                                f_91 += f_26;
                                f_15 += f_29;
                                f_12 += f_31;
                                f_61 += anInt1705;
                            }
                        } else {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F)) - f_51;
                            f_51 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_51 >= 0.0F; f_61 += anInt1705) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_91, (int) f_71, f_15, f_28, f_12, f_30);
                                f_71 += f_24;
                                f_91 += f_26;
                                f_15 += f_29;
                                f_12 += f_31;
                            }

                            while (--f_41 >= 0.0F) {
                                method2443(bool_2, bool_3, anIntArray1689, (int) f_61, 0, 0, (int) f_91, (int) f_81, f_15, f_28, f_12, f_30);
                                f_81 += f_25;
                                f_91 += f_26;
                                f_15 += f_29;
                                f_12 += f_31;
                                f_61 += anInt1705;
                            }
                        }
                    }
                }
            }
        }

    }

    void method2427(int[] ints_3, int i_4, int i_5, int i_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, float f_22, float f_23, float f_24, float f_25, float f_26, float f_27, float f_28) {
        int i_61 = i_6;
        int i_51 = i_5;
        int i_29 = i_61 - i_51;
        float f_30 = 1.0F / i_29;
        float f_31 = (f_8 - f_7) * f_30;
        float f_32 = (f_10 - f_9) * f_30;
        float f_33 = (f_12 - f_11) * f_30;
        float f_34 = (f_14 - f_13) * f_30;
        float f_35 = (f_16 - f_15) * f_30;
        float f_36 = (f_18 - f_17) * f_30;
        float f_37 = (f_20 - f_19) * f_30;
        float f_38 = (f_22 - f_21) * f_30;
        float f_39 = (f_24 - f_23) * f_30;
        float f_40 = (f_26 - f_25) * f_30;
        float f_41 = (f_28 - f_27) * f_30;
        if (aBool1708) {
            if (i_61 > anInt1684) {
                i_61 = anInt1684;
            }

            if (i_51 < 0) {
                f_7 -= f_31 * i_51;
                f_9 -= f_32 * i_51;
                f_11 -= f_33 * i_51;
                f_13 -= f_34 * i_51;
                f_15 -= f_35 * i_51;
                f_17 -= f_36 * i_51;
                f_19 -= f_37 * i_51;
                f_21 -= f_38 * i_51;
                f_23 -= f_39 * i_51;
                f_25 -= f_40 * i_51;
                f_27 -= f_41 * i_51;
                i_51 = 0;
            }
        }

        if (i_51 < i_61) {
            i_29 = i_61 - i_51;

            for (i_4 += i_51; i_29-- > 0; f_27 += f_41) {
                float f_42 = 1.0F / f_7;
                float f_43 = 1.0F / f_9;
                if (f_42 < aFloatArray1690[i_4]) {
                    float f_44 = f_11 * f_43;
                    float f_45 = f_13 * f_43;
                    int i_46 = (int) (f_44 * anInt1694 * aFloat1696) & anInt1691;
                    int i_47 = (int) (f_45 * anInt1694 * aFloat1696) & anInt1691;
                    int i_48 = anIntArray1693[i_46 + i_47 * anInt1694];
                    i_46 = (int) (f_44 * anInt1701 * aFloat1695) & anInt1699;
                    i_47 = (int) (f_45 * anInt1701 * aFloat1695) & anInt1699;
                    int i_49 = anIntArray1698[i_46 + i_47 * anInt1701];
                    i_46 = (int) (f_44 * anInt1706 * aFloat1681) & anInt1707;
                    i_47 = (int) (f_45 * anInt1706 * aFloat1681) & anInt1707;
                    int i_50 = anIntArray1673[i_46 + i_47 * anInt1706];
                    float f_51 = 1.0F - (f_25 + f_27);
                    i_48 = -16777216 | (int) (f_25 * (i_48 >> 16 & 0xff)) << 16 | (int) (f_25 * (i_48 >> 8 & 0xff)) << 8 | (int) (f_25 * (i_48 & 0xff));
                    i_49 = -16777216 | (int) (f_27 * (i_49 >> 16 & 0xff)) << 16 | (int) (f_27 * (i_49 >> 8 & 0xff)) << 8 | (int) (f_27 * (i_49 & 0xff));
                    i_50 = -16777216 | (int) (f_51 * (i_50 >> 16 & 0xff)) << 16 | (int) (f_51 * (i_50 >> 8 & 0xff)) << 8 | (int) (f_51 * (i_50 & 0xff));
                    int i_52 = i_48 + i_49 + i_50;
                    int i_53 = -16777216 | (int) (f_19 * (i_52 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_21 * (i_52 >> 8 & 0xff)) & 0xff00 | (int) (f_23 * (i_52 & 0xff)) >> 8;
                    if (f_15 != 0.0F) {
                        int i_54 = (int) (255.0F - f_15);
                        int i_55 = ((anInt1677 & 0xff00ff) * (int) f_15 & -16711936 | (int) f_15 * (anInt1677 & 0xff00) & 0xff0000) >>> 8;
                        i_53 = i_55 + (((i_53 & 0xff00ff) * i_54 & -16711936 | i_54 * (i_53 & 0xff00) & 0xff0000) >>> 8);
                    }

                    if (false) {
                        ints_3[i_4] = ((int) f_17 | ints_3[i_4] >> 24) << 24 | i_53;
                    } else {
                        ints_3[i_4] = i_53;
                    }

                    if (true) {
                        aFloatArray1690[i_4] = f_42;
                    }
                }

                ++i_4;
                f_7 += f_31;
                f_9 += f_32;
                f_11 += f_33;
                f_13 += f_34;
                f_15 += f_35;
                f_17 += f_36;
                f_19 += f_37;
                f_21 += f_38;
                f_23 += f_39;
                f_25 += f_40;
            }
        }

    }

    void method2428(boolean bool_1, boolean bool_2, boolean bool_3, float f_4, float f_5, float f_6, float f_7, float f_8, float f_9, float f_10, float f_11, float f_12, int i_13) {
        float f_91 = f_9;
        float f_81 = f_8;
        float f_41 = f_4;
        float f_71 = f_7;
        float f_61 = f_6;
        float f_51 = f_5;
        if (aBool1671) {
            aGraphicalRenderer_Sub3_1686.method8429((int) f_71, (int) f_41, (int) f_81, (int) f_51, i_13);
            aGraphicalRenderer_Sub3_1686.method8429((int) f_81, (int) f_51, (int) f_91, (int) f_61, i_13);
            aGraphicalRenderer_Sub3_1686.method8429((int) f_91, (int) f_61, (int) f_71, (int) f_41, i_13);
        } else {
            float f_14 = f_81 - f_71;
            float f_15 = f_51 - f_41;
            float f_16 = f_91 - f_71;
            float f_17 = f_61 - f_41;
            float f_18 = f_11 - f_10;
            float f_19 = f_12 - f_10;
            float f_20 = 0.0F;
            if (f_51 != f_41) {
                f_20 = (f_81 - f_71) / (f_51 - f_41);
            }

            float f_21 = 0.0F;
            if (f_61 != f_51) {
                f_21 = (f_91 - f_81) / (f_61 - f_51);
            }

            float f_22 = 0.0F;
            if (f_61 != f_41) {
                f_22 = (f_71 - f_91) / (f_41 - f_61);
            }

            float f_23 = f_14 * f_17 - f_16 * f_15;
            if (f_23 != 0.0F) {
                float f_24 = (f_18 * f_17 - f_19 * f_15) / f_23;
                float f_25 = (f_19 * f_14 - f_18 * f_16) / f_23;
                if (f_41 <= f_51 && f_41 <= f_61) {
                    if (f_41 < anInt1700) {
                        if (f_51 > anInt1700) {
                            f_51 = anInt1700;
                        }

                        if (f_61 > anInt1700) {
                            f_61 = anInt1700;
                        }

                        f_10 = f_10 - f_24 * f_71 + f_24;
                        if (f_51 < f_61) {
                            f_91 = f_71;
                            if (f_41 < 0.0F) {
                                f_91 = f_71 - f_22 * f_41;
                                f_71 -= f_20 * f_41;
                                f_10 -= f_25 * f_41;
                                f_41 = 0.0F;
                            }

                            if (f_51 < 0.0F) {
                                f_81 -= f_21 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_41 != f_51 && f_22 < f_20 || f_41 == f_51 && f_22 > f_21) {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_51;
                                f_51 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_51 >= 0.0F; f_41 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_91, (int) f_71, f_10, f_24);
                                    f_91 += f_22;
                                    f_71 += f_20;
                                    f_10 += f_25;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_91, (int) f_81, f_10, f_24);
                                    f_91 += f_22;
                                    f_81 += f_21;
                                    f_10 += f_25;
                                    f_41 += anInt1705;
                                }
                            } else {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_51;
                                f_51 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_51 >= 0.0F; f_41 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_71, (int) f_91, f_10, f_24);
                                    f_91 += f_22;
                                    f_71 += f_20;
                                    f_10 += f_25;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_81, (int) f_91, f_10, f_24);
                                    f_91 += f_22;
                                    f_81 += f_21;
                                    f_10 += f_25;
                                    f_41 += anInt1705;
                                }
                            }
                        } else {
                            f_81 = f_71;
                            if (f_41 < 0.0F) {
                                f_81 = f_71 - f_22 * f_41;
                                f_71 -= f_20 * f_41;
                                f_10 -= f_25 * f_41;
                                f_41 = 0.0F;
                            }

                            if (f_61 < 0.0F) {
                                f_91 -= f_21 * f_61;
                                f_61 = 0.0F;
                            }

                            if ((f_41 == f_61 || f_22 >= f_20) && (f_41 != f_61 || f_21 <= f_20)) {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F)) - f_61;
                                f_61 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_61 >= 0.0F; f_41 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_71, (int) f_81, f_10, f_24);
                                    f_81 += f_22;
                                    f_71 += f_20;
                                    f_10 += f_25;
                                }

                                while (--f_51 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_71, (int) f_91, f_10, f_24);
                                    f_91 += f_21;
                                    f_71 += f_20;
                                    f_10 += f_25;
                                    f_41 += anInt1705;
                                }
                            } else {
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_51 = ((int) (f_51 + 0.5F)) - f_61;
                                f_61 -= f_41;

                                for (f_41 = anIntArray1685[(int) f_41]; --f_61 >= 0.0F; f_41 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_81, (int) f_71, f_10, f_24);
                                    f_81 += f_22;
                                    f_71 += f_20;
                                    f_10 += f_25;
                                }

                                while (--f_51 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_41, i_13, 0, (int) f_91, (int) f_71, f_10, f_24);
                                    f_91 += f_21;
                                    f_71 += f_20;
                                    f_10 += f_25;
                                    f_41 += anInt1705;
                                }
                            }
                        }
                    }
                } else if (f_51 <= f_61) {
                    if (f_51 < anInt1700) {
                        if (f_61 > anInt1700) {
                            f_61 = anInt1700;
                        }

                        if (f_41 > anInt1700) {
                            f_41 = anInt1700;
                        }

                        f_11 = f_11 - f_24 * f_81 + f_24;
                        if (f_61 < f_41) {
                            f_71 = f_81;
                            if (f_51 < 0.0F) {
                                f_71 = f_81 - f_20 * f_51;
                                f_81 -= f_21 * f_51;
                                f_11 -= f_25 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_61 < 0.0F) {
                                f_91 -= f_22 * f_61;
                                f_61 = 0.0F;
                            }

                            if ((f_51 == f_61 || f_20 >= f_21) && (f_51 != f_61 || f_20 <= f_22)) {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F)) - f_61;
                                f_61 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_61 >= 0.0F; f_51 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_81, (int) f_71, f_11, f_24);
                                    f_71 += f_20;
                                    f_81 += f_21;
                                    f_11 += f_25;
                                }

                                while (--f_41 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_91, (int) f_71, f_11, f_24);
                                    f_71 += f_20;
                                    f_91 += f_22;
                                    f_11 += f_25;
                                    f_51 += anInt1705;
                                }
                            } else {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F)) - f_61;
                                f_61 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_61 >= 0.0F; f_51 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_71, (int) f_81, f_11, f_24);
                                    f_71 += f_20;
                                    f_81 += f_21;
                                    f_11 += f_25;
                                }

                                while (--f_41 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_71, (int) f_91, f_11, f_24);
                                    f_71 += f_20;
                                    f_91 += f_22;
                                    f_11 += f_25;
                                    f_51 += anInt1705;
                                }
                            }
                        } else {
                            f_91 = f_81;
                            if (f_51 < 0.0F) {
                                f_91 = f_81 - f_20 * f_51;
                                f_81 -= f_21 * f_51;
                                f_11 -= f_25 * f_51;
                                f_51 = 0.0F;
                            }

                            if (f_41 < 0.0F) {
                                f_71 -= f_22 * f_41;
                                f_41 = 0.0F;
                            }

                            if (f_20 < f_21) {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_41;
                                f_41 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_41 >= 0.0F; f_51 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_91, (int) f_81, f_11, f_24);
                                    f_91 += f_20;
                                    f_81 += f_21;
                                    f_11 += f_25;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_71, (int) f_81, f_11, f_24);
                                    f_71 += f_22;
                                    f_81 += f_21;
                                    f_11 += f_25;
                                    f_51 += anInt1705;
                                }
                            } else {
                                f_51 = ((int) (f_51 + 0.5F));
                                f_41 = ((int) (f_41 + 0.5F));
                                f_61 = ((int) (f_61 + 0.5F)) - f_41;
                                f_41 -= f_51;

                                for (f_51 = anIntArray1685[(int) f_51]; --f_41 >= 0.0F; f_51 += anInt1705) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_81, (int) f_91, f_11, f_24);
                                    f_91 += f_20;
                                    f_81 += f_21;
                                    f_11 += f_25;
                                }

                                while (--f_61 >= 0.0F) {
                                    method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_51, i_13, 0, (int) f_81, (int) f_71, f_11, f_24);
                                    f_71 += f_22;
                                    f_81 += f_21;
                                    f_11 += f_25;
                                    f_51 += anInt1705;
                                }
                            }
                        }
                    }
                } else if (f_61 < anInt1700) {
                    if (f_41 > anInt1700) {
                        f_41 = anInt1700;
                    }

                    if (f_51 > anInt1700) {
                        f_51 = anInt1700;
                    }

                    f_12 = f_12 - f_24 * f_91 + f_24;
                    if (f_41 < f_51) {
                        f_81 = f_91;
                        if (f_61 < 0.0F) {
                            f_81 = f_91 - f_21 * f_61;
                            f_91 -= f_22 * f_61;
                            f_12 -= f_25 * f_61;
                            f_61 = 0.0F;
                        }

                        if (f_41 < 0.0F) {
                            f_71 -= f_20 * f_41;
                            f_41 = 0.0F;
                        }

                        if (f_21 < f_22) {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F)) - f_41;
                            f_41 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_41 >= 0.0F; f_61 += anInt1705) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_81, (int) f_91, f_12, f_24);
                                f_81 += f_21;
                                f_91 += f_22;
                                f_12 += f_25;
                            }

                            while (--f_51 >= 0.0F) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_81, (int) f_71, f_12, f_24);
                                f_81 += f_21;
                                f_71 += f_20;
                                f_12 += f_25;
                                f_61 += anInt1705;
                            }
                        } else {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F)) - f_41;
                            f_41 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_41 >= 0.0F; f_61 += anInt1705) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_91, (int) f_81, f_12, f_24);
                                f_81 += f_21;
                                f_91 += f_22;
                                f_12 += f_25;
                            }

                            while (--f_51 >= 0.0F) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_71, (int) f_81, f_12, f_24);
                                f_81 += f_21;
                                f_71 += f_20;
                                f_12 += f_25;
                                f_61 += anInt1705;
                            }
                        }
                    } else {
                        f_71 = f_91;
                        if (f_61 < 0.0F) {
                            f_71 = f_91 - f_21 * f_61;
                            f_91 -= f_22 * f_61;
                            f_12 -= f_25 * f_61;
                            f_61 = 0.0F;
                        }

                        if (f_51 < 0.0F) {
                            f_81 -= f_20 * f_51;
                            f_51 = 0.0F;
                        }

                        if (f_21 < f_22) {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F)) - f_51;
                            f_51 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_51 >= 0.0F; f_61 += anInt1705) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_71, (int) f_91, f_12, f_24);
                                f_71 += f_21;
                                f_91 += f_22;
                                f_12 += f_25;
                            }

                            while (--f_41 >= 0.0F) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_81, (int) f_91, f_12, f_24);
                                f_81 += f_20;
                                f_91 += f_22;
                                f_12 += f_25;
                                f_61 += anInt1705;
                            }
                        } else {
                            f_61 = ((int) (f_61 + 0.5F));
                            f_51 = ((int) (f_51 + 0.5F));
                            f_41 = ((int) (f_41 + 0.5F)) - f_51;
                            f_51 -= f_61;

                            for (f_61 = anIntArray1685[(int) f_61]; --f_51 >= 0.0F; f_61 += anInt1705) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_91, (int) f_71, f_12, f_24);
                                f_71 += f_21;
                                f_91 += f_22;
                                f_12 += f_25;
                            }

                            while (--f_41 >= 0.0F) {
                                method2419(bool_1, bool_2, bool_3, anIntArray1689, (int) f_61, i_13, 0, (int) f_91, (int) f_81, f_12, f_24);
                                f_81 += f_20;
                                f_91 += f_22;
                                f_12 += f_25;
                                f_61 += anInt1705;
                            }
                        }
                    }
                }
            }
        }

    }

    void method2434(boolean bool_1, boolean bool_2, int[] ints_3, int i_5, int i_6, int i_7, float f_8, float f_9, float f_10, float f_11, float f_12, float f_13, float f_14, float f_15, float f_16, float f_17, float f_18, float f_19, float f_20, float f_21, float f_22, float f_23, float f_24, float f_25) {
        int i_71 = i_7;
        int i_61 = i_6;
        int i_26 = i_71 - i_61;
        float f_27 = 1.0F / i_26;
        float f_28 = (f_9 - f_8) * f_27;
        float f_29 = (f_11 - f_10) * f_27;
        float f_30 = (f_13 - f_12) * f_27;
        float f_31 = (f_15 - f_14) * f_27;
        float f_32 = (f_17 - f_16) * f_27;
        float f_33 = (f_19 - f_18) * f_27;
        float f_34 = (f_21 - f_20) * f_27;
        float f_35 = (f_23 - f_22) * f_27;
        float f_36 = (f_25 - f_24) * f_27;
        if (aBool1708) {
            if (i_71 > anInt1684) {
                i_71 = anInt1684;
            }

            if (i_61 < 0) {
                f_8 -= f_28 * i_61;
                f_10 -= f_29 * i_61;
                f_12 -= f_30 * i_61;
                f_14 -= f_31 * i_61;
                f_16 -= f_32 * i_61;
                f_18 -= f_33 * i_61;
                f_20 -= f_34 * i_61;
                f_22 -= f_35 * i_61;
                f_24 -= f_36 * i_61;
                i_61 = 0;
            }
        }

        if (i_61 < i_71) {
            i_26 = i_71 - i_61;

            for (i_5 += i_61; i_26-- > 0; f_24 += f_36) {
                float f_37 = 1.0F / f_8;
                float f_38 = 1.0F / f_10;
                if (!bool_1 || f_37 < aFloatArray1690[i_5]) {
                    int i_39 = (int) (f_12 * f_38 * anInt1694);
                    if (aBool1703) {
                        i_39 &= anInt1691;
                    } else if (i_39 < 0) {
                        i_39 = 0;
                    } else if (i_39 > anInt1691) {
                        i_39 = anInt1691;
                    }

                    int i_40 = (int) (f_14 * f_38 * anInt1694);
                    if (aBool1703) {
                        i_40 &= anInt1691;
                    } else if (i_40 < 0) {
                        i_40 = 0;
                    } else if (i_40 > anInt1691) {
                        i_40 = anInt1691;
                    }

                    int i_41 = anIntArray1693[i_39 + i_40 * anInt1694];
                    int i_42;
                    if (anInt1697 == 2) {
                        i_42 = i_41 >> 24 & 0xff;
                    } else if (anInt1697 == 1) {
                        i_42 = i_41 == 0 ? 0 : 255;
                    } else {
                        i_42 = (int) f_18;
                    }

                    if (i_42 != 0) {
                        int i_43;
                        int i_44;
                        int i_45;
                        if (i_42 != 255) {
                            i_43 = -16777216 | (int) (f_20 * (i_41 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_22 * (i_41 >> 8 & 0xff)) & 0xff00 | (int) (f_24 * (i_41 & 0xff)) >> 8;
                            if (f_16 != 0.0F) {
                                i_44 = (int) (255.0F - f_16);
                                i_45 = ((anInt1677 & 0xff00ff) * (int) f_16 & -16711936 | (anInt1677 & 0xff00) * (int) f_16 & 0xff0000) >>> 8;
                                i_43 = i_45 + (((i_43 & 0xff00ff) * i_44 & -16711936 | i_44 * (i_43 & 0xff00) & 0xff0000) >>> 8);
                            }

                            i_44 = ints_3[i_5];
                            i_45 = 255 - i_42;
                            i_43 = ((i_44 & 0xff00ff) * i_45 + (i_43 & 0xff00ff) * i_42 & -16711936) + (i_45 * (i_44 & 0xff00) + i_42 * (i_43 & 0xff00) & 0xff0000) >> 8;
                            if (bool_2) {
                                ints_3[i_5] = (i_42 | ints_3[i_5] >> 24) << 24 | i_43;
                            } else {
                                ints_3[i_5] = i_43;
                            }

                        } else {
                            i_43 = -16777216 | (int) (f_20 * (i_41 >> 16 & 0xff)) << 8 & 0xff0000 | (int) (f_22 * (i_41 >> 8 & 0xff)) & 0xff00 | (int) (f_24 * (i_41 & 0xff)) >> 8;
                            if (f_16 != 0.0F) {
                                i_44 = (int) (255.0F - f_16);
                                i_45 = ((anInt1677 & 0xff00ff) * (int) f_16 & -16711936 | (anInt1677 & 0xff00) * (int) f_16 & 0xff0000) >>> 8;
                                i_43 = i_45 + (((i_43 & 0xff00ff) * i_44 & -16711936 | i_44 * (i_43 & 0xff00) & 0xff0000) >>> 8);
                            }

                            if (bool_2) {
                                ints_3[i_5] = i_42 << 24 | i_43;
                            } else {
                                ints_3[i_5] = i_43;
                            }

                        }
                        if (bool_1) {
                            aFloatArray1690[i_5] = f_37;
                        }
                    }
                }

                ++i_5;
                f_8 += f_28;
                f_10 += f_29;
                f_12 += f_30;
                f_14 += f_31;
                f_16 += f_32;
                f_18 += f_33;
                f_20 += f_34;
                f_22 += f_35;
            }
        }

    }

    void method2443(boolean bool_1, boolean bool_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, float f_9, float f_10, float f_11, float f_12) {
        int i_81 = i_8;
        int i_71 = i_7;
        int i_61 = i_6;
        int i_51 = i_5;
        if (aBool1708) {
            if (i_81 > anInt1684) {
                i_81 = anInt1684;
            }

            if (i_71 < 0) {
                i_71 = 0;
            }
        }

        if (i_71 < i_81) {
            i_4 += i_71 - 1;
            f_9 += f_10 * i_71;
            f_11 += f_12 * i_71;
            int i_13;
            int i_14;
            int i_15;
            if (aClass185_1687.aBool2334) {
                if (aBool1675) {
                    i_61 = i_81 - i_71 >> 2;
                    f_10 *= 4.0F;
                    if (anInt1674 == 0) {
                        if (i_61 > 0) {
                            do {
                                i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                                f_9 += f_10;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];

                            do {
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    ints_3[i_4] = i_51;
                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    } else {
                        i_13 = anInt1674;
                        i_14 = 256 - anInt1674;
                        if (i_61 > 0) {
                            do {
                                i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                                f_9 += f_10;
                                i_51 = (i_14 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_51 & 0xff00) >> 8 & 0xff00);
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    i_15 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    }

                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    i_15 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    }

                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    i_15 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    }

                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    i_15 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    }

                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                --i_61;
                            } while (i_61 > 0);
                        }

                        i_61 = i_81 - i_71 & 0x3;
                        if (i_61 > 0) {
                            i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                            i_51 = (i_14 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_51 & 0xff00) >> 8 & 0xff00);

                            do {
                                ++i_4;
                                if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                    i_15 = ints_3[i_4];
                                    if (bool_2) {
                                        ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    } else {
                                        ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                    }

                                    if (bool_1) {
                                        aFloatArray1690[i_4] = f_11;
                                    }
                                }

                                f_11 += f_12;
                                --i_61;
                            } while (i_61 > 0);
                        }
                    }
                } else {
                    i_61 = i_81 - i_71;
                    if (anInt1674 != 0) {
                        i_13 = anInt1674;
                        i_14 = 256 - anInt1674;

                        do {
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                                i_51 = (i_14 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_51 & 0xff00) >> 8 & 0xff00);
                                i_15 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                }

                                if (bool_1) {
                                    aFloatArray1690[i_4] = f_11;
                                }
                            }

                            f_9 += f_10;
                            f_11 += f_12;
                            --i_61;
                        } while (i_61 > 0);
                    } else {
                        do {
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = Class335.anIntArray3916[(int) f_9 & 0xffff];
                                if (bool_1) {
                                    aFloatArray1690[i_4] = f_11;
                                }
                            }

                            f_11 += f_12;
                            f_9 += f_10;
                            --i_61;
                        } while (i_61 > 0);
                    }
                }
            } else if (aBool1675) {
                i_61 = i_81 - i_71 >> 2;
                f_10 *= 4.0F;
                if (anInt1674 == 0) {
                    if (i_61 > 0) {
                        do {
                            i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                            f_9 += f_10;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = i_51;
                            }

                            f_11 += f_12;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = i_51;
                            }

                            f_11 += f_12;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = i_51;
                            }

                            f_11 += f_12;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = i_51;
                            }

                            f_11 += f_12;
                            --i_61;
                        } while (i_61 > 0);
                    }

                    i_61 = i_81 - i_71 & 0x3;
                    if (i_61 > 0) {
                        i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];

                        do {
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                ints_3[i_4] = i_51;
                            }

                            f_11 += f_12;
                            --i_61;
                        } while (i_61 > 0);
                    }
                } else {
                    i_13 = anInt1674;
                    i_14 = 256 - anInt1674;
                    if (i_61 > 0) {
                        do {
                            i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                            f_9 += f_10;
                            i_51 = (i_14 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_51 & 0xff00) >> 8 & 0xff00);
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                i_15 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                }
                            }

                            f_11 += f_12;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                i_15 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                }
                            }

                            f_11 += f_12;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                i_15 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                }
                            }

                            f_11 += f_12;
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                i_15 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                }
                            }

                            f_11 += f_12;
                            --i_61;
                        } while (i_61 > 0);
                    }

                    i_61 = i_81 - i_71 & 0x3;
                    if (i_61 > 0) {
                        i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                        i_51 = (i_14 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_51 & 0xff00) >> 8 & 0xff00);

                        do {
                            ++i_4;
                            if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                                i_15 = ints_3[i_4];
                                if (bool_2) {
                                    ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                } else {
                                    ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                                }
                            }

                            f_11 += f_12;
                            --i_61;
                        } while (i_61 > 0);
                    }
                }
            } else {
                i_61 = i_81 - i_71;
                if (anInt1674 != 0) {
                    i_13 = anInt1674;
                    i_14 = 256 - anInt1674;

                    do {
                        ++i_4;
                        if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                            i_51 = Class335.anIntArray3916[(int) f_9 & 0xffff];
                            i_51 = (i_14 * (i_51 & 0xff00ff) >> 8 & 0xff00ff) + (i_14 * (i_51 & 0xff00) >> 8 & 0xff00);
                            i_15 = ints_3[i_4];
                            if (bool_2) {
                                ints_3[i_4] = (i_14 | i_15 >> 24) << 24 | i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                            } else {
                                ints_3[i_4] = i_51 + ((i_15 & 0xff00ff) * i_13 >> 8 & 0xff00ff) + (i_13 * (i_15 & 0xff00) >> 8 & 0xff00);
                            }
                        }

                        f_9 += f_10;
                        f_11 += f_12;
                        --i_61;
                    } while (i_61 > 0);
                } else {
                    do {
                        ++i_4;
                        if (!bool_1 || f_11 < aFloatArray1690[i_4]) {
                            ints_3[i_4] = Class335.anIntArray3916[(int) f_9 & 0xffff];
                        }

                        f_11 += f_12;
                        f_9 += f_10;
                        --i_61;
                    } while (i_61 > 0);
                }
            }
        }

    }

}
