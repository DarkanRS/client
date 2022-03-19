package com.jagex;

import jaggl.OpenGL;

public class Class130 {

    OpenGLRenderer aGraphicalRenderer_Sub1_1592;
    OpenGLGround aGround_Sub2_1584;
    int anInt1586;
    int anInt1587;
    byte[] aByteArray1588;
    int anInt1589;
    int anInt1591;
    int anInt1590;
    Class124[][] aClass124ArrayArray1585;

    Class130(OpenGLRenderer class505_sub1_1, OpenGLGround class390_sub2_2) {
        aGraphicalRenderer_Sub1_1592 = class505_sub1_1;
        aGround_Sub2_1584 = class390_sub2_2;
        anInt1586 = (aGround_Sub2_1584.width * aGround_Sub2_1584.tileUnits >> aGraphicalRenderer_Sub1_1592.anInt8473) + 2;
        anInt1587 = (aGround_Sub2_1584.length * aGround_Sub2_1584.tileUnits >> aGraphicalRenderer_Sub1_1592.anInt8473) + 2;
        aByteArray1588 = new byte[anInt1586 * anInt1587];
        anInt1589 = aGraphicalRenderer_Sub1_1592.anInt8473 + 7 - aGround_Sub2_1584.tileScale;
        anInt1591 = aGround_Sub2_1584.width >> anInt1589;
        anInt1590 = aGround_Sub2_1584.length >> anInt1589;
    }

    static void method2295(byte[] bytes_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = -(i_4 >> 2);
        i_4 = -(i_4 & 0x3);

        for (int i_9 = -i_5; i_9 < 0; i_9++) {
            int i_10001;
            int i_10;
            for (i_10 = i_8; i_10 < 0; i_10++) {
                i_10001 = i_3++;
                bytes_0[i_10001] += bytes_1[i_2++];
                i_10001 = i_3++;
                bytes_0[i_10001] += bytes_1[i_2++];
                i_10001 = i_3++;
                bytes_0[i_10001] += bytes_1[i_2++];
                i_10001 = i_3++;
                bytes_0[i_10001] += bytes_1[i_2++];
            }

            for (i_10 = i_4; i_10 < 0; i_10++) {
                i_10001 = i_3++;
                bytes_0[i_10001] += bytes_1[i_2++];
            }

            i_3 += i_6;
            i_2 += i_7;
        }

    }

    static void method2296(byte[] bytes_0, byte[] bytes_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        int i_8 = -(i_4 >> 2);
        i_4 = -(i_4 & 0x3);

        for (int i_9 = -i_5; i_9 < 0; i_9++) {
            int i_10001;
            int i_10;
            for (i_10 = i_8; i_10 < 0; i_10++) {
                i_10001 = i_3++;
                bytes_0[i_10001] -= bytes_1[i_2++];
                i_10001 = i_3++;
                bytes_0[i_10001] -= bytes_1[i_2++];
                i_10001 = i_3++;
                bytes_0[i_10001] -= bytes_1[i_2++];
                i_10001 = i_3++;
                bytes_0[i_10001] -= bytes_1[i_2++];
            }

            for (i_10 = i_4; i_10 < 0; i_10++) {
                i_10001 = i_3++;
                bytes_0[i_10001] -= bytes_1[i_2++];
            }

            i_3 += i_6;
            i_2 += i_7;
        }

    }

    static boolean method2297(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        int i_6 = i_2 % i_5;
        int i_7;
        if (i_6 != 0) {
            i_7 = i_5 - i_6;
        } else {
            i_7 = 0;
        }

        int i_8 = -((i_3 + i_5 - 1) / i_5);
        int i_9 = -((i_5 + i_2 - 1) / i_5);

        for (int i_10 = i_8; i_10 < 0; i_10++) {
            for (int i_11 = i_9; i_11 < 0; i_11++) {
                if (bytes_0[i_1] == 0) {
                    return true;
                }

                i_1 += i_5;
            }

            i_1 -= i_7;
            if (bytes_0[i_1 - 1] == 0) {
                return true;
            }

            i_1 += i_4;
        }

        return false;
    }

    void method2290(int i_1, int i_2, int i_3, boolean[][] bools_4, boolean bool_5) {
        aGraphicalRenderer_Sub1_1592.method13620(false);
        aGraphicalRenderer_Sub1_1592.method13623(false);
        aGraphicalRenderer_Sub1_1592.method13581(-2);
        aGraphicalRenderer_Sub1_1592.method13612(1);
        aGraphicalRenderer_Sub1_1592.setColorRenderType(1);
        float f_6 = 1.0F / (aGraphicalRenderer_Sub1_1592.anInt8466 * 128);
        int i_7;
        int i_8;
        int i_9;
        int i_10;
        int i_11;
        int i_12;
        int i_13;
        if (bool_5) {
            for (i_7 = 0; i_7 < anInt1590; i_7++) {
                i_8 = i_7 << anInt1589;
                i_9 = i_7 + 1 << anInt1589;

                label136:
                for (i_10 = 0; i_10 < anInt1591; i_10++) {
                    i_11 = i_10 << anInt1589;
                    i_12 = i_10 + 1 << anInt1589;

                    for (i_13 = i_11; i_13 < i_12; i_13++) {
                        if (i_13 - i_1 >= -i_3 && i_13 - i_1 <= i_3) {
                            for (int i_20 = i_8; i_20 < i_9; i_20++) {
                                if (i_20 - i_2 >= -i_3 && i_20 - i_2 <= i_3 && bools_4[i_3 + (i_13 - i_1)][i_20 - i_2 + i_3]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(f_6, f_6, 1.0F);
                                    OpenGL.glTranslatef((-i_10) / f_6, (-i_7) / f_6, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    aClass124ArrayArray1585[i_10][i_7].method2155();
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (i_7 = 0; i_7 < anInt1590; i_7++) {
                i_8 = i_7 << anInt1589;
                i_9 = i_7 + 1 << anInt1589;

                for (i_10 = 0; i_10 < anInt1591; i_10++) {
                    i_11 = 0;
                    i_12 = i_10 << anInt1589;
                    i_13 = i_10 + 1 << anInt1589;
                    Node_Sub35_Sub1 class282_sub35_sub1_14 = aGraphicalRenderer_Sub1_1592.aNode_Sub35_Sub1_8499;
                    class282_sub35_sub1_14.index = 0;

                    for (int i_15 = i_8; i_15 < i_9; i_15++) {
                        if (i_15 - i_2 >= -i_3 && i_15 - i_2 <= i_3) {
                            int i_16 = i_12 + aGround_Sub2_1584.width * i_15;

                            for (int i_17 = i_12; i_17 < i_13; i_17++) {
                                if (i_17 - i_1 >= -i_3 && i_17 - i_1 <= i_3 && bools_4[i_3 + (i_17 - i_1)][i_15 - i_2 + i_3]) {
                                    short[] shorts_18 = aGround_Sub2_1584.materialIndices[i_16];
                                    if (shorts_18 != null) {
                                        int i_19;
                                        if (aGraphicalRenderer_Sub1_1592.aBool8467) {
                                            for (i_19 = 0; i_19 < shorts_18.length; i_19++) {
                                                class282_sub35_sub1_14.writeShort(shorts_18[i_19] & 0xffff);
                                                ++i_11;
                                            }
                                        } else {
                                            for (i_19 = 0; i_19 < shorts_18.length; i_19++) {
                                                class282_sub35_sub1_14.writeLEShort(shorts_18[i_19] & 0xffff);
                                                ++i_11;
                                            }
                                        }
                                    }
                                }

                                ++i_16;
                            }
                        }
                    }

                    if (i_11 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(f_6, f_6, 1.0F);
                        OpenGL.glTranslatef((-i_10) / f_6, (-i_7) / f_6, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        aClass124ArrayArray1585[i_10][i_7].method2156(class282_sub35_sub1_14.buffer, i_11);
                    }
                }
            }
        }

        OpenGL.glMatrixMode(5890); //GL_TEXTURE
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888); //GL_MODELVIEW
    }

    boolean method2293(Shadow class282_sub50_sub17_1, int i_2, int i_3) {
        int i_31 = i_3;
        int i_21 = i_2;
        CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_4 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
        i_21 += class282_sub50_sub17_sub1_4.anInt10293 + 1;
        i_31 += class282_sub50_sub17_sub1_4.anInt10295 + 1;
        int i_5 = i_21 + i_31 * anInt1586;
        int i_6 = class282_sub50_sub17_sub1_4.anInt10294;
        int i_7 = class282_sub50_sub17_sub1_4.anInt10296;
        int i_8 = anInt1586 - i_7;
        int i_9;
        if (i_31 <= 0) {
            i_9 = 1 - i_31;
            i_6 -= i_9;
            i_5 += i_9 * anInt1586;
            i_31 = 1;
        }

        if (i_31 + i_6 >= anInt1587) {
            i_9 = i_31 + i_6 + 1 - anInt1587;
            i_6 -= i_9;
        }

        if (i_21 <= 0) {
            i_9 = 1 - i_21;
            i_7 -= i_9;
            i_5 += i_9;
            i_8 += i_9;
            i_21 = 1;
        }

        if (i_7 + i_21 >= anInt1586) {
            i_9 = i_7 + i_21 + 1 - anInt1586;
            i_7 -= i_9;
            i_8 += i_9;
        }

        if (i_7 > 0 && i_6 > 0) {
            byte b_10 = 8;
            i_8 += (b_10 - 1) * anInt1586;
            return method2297(aByteArray1588, i_5, i_7, i_6, i_8, b_10);
        } else {
            return false;
        }
    }

    void method2298(int i_1, int i_2, int i_3, int i_4) {
        if (aClass124ArrayArray1585 != null) {
            int i_5 = i_1 - 1 >> 7;
            int i_6 = i_3 + (i_1 - 1) - 1 >> 7;
            int i_7 = i_2 - 1 >> 7;
            int i_8 = i_2 - 1 + i_4 - 1 >> 7;

            for (int i_9 = i_5; i_9 <= i_6; i_9++) {
                Class124[] arr_10 = aClass124ArrayArray1585[i_9];

                for (int i_11 = i_7; i_11 <= i_8; i_11++) {
                    arr_10[i_11].aBool1556 = true;
                }
            }
        }

    }

    void method2309() {
        aClass124ArrayArray1585 = new Class124[anInt1591][anInt1590];

        for (int i_1 = 0; i_1 < anInt1590; i_1++) {
            for (int i_2 = 0; i_2 < anInt1591; i_2++) {
                aClass124ArrayArray1585[i_2][i_1] = new Class124(aGraphicalRenderer_Sub1_1592, this, aGround_Sub2_1584, i_2, i_1, anInt1589, i_2 * 128 + 1, i_1 * 128 + 1);
            }
        }

    }

    void method2313(Shadow class282_sub50_sub17_1, int i_2, int i_3) {
        int i_31 = i_3;
        int i_21 = i_2;
        CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_4 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
        i_21 += class282_sub50_sub17_sub1_4.anInt10293 + 1;
        i_31 += class282_sub50_sub17_sub1_4.anInt10295 + 1;
        int i_5 = i_21 + i_31 * anInt1586;
        int i_6 = 0;
        int i_7 = class282_sub50_sub17_sub1_4.anInt10294;
        int i_8 = class282_sub50_sub17_sub1_4.anInt10296;
        int i_9 = anInt1586 - i_8;
        int i_10 = 0;
        int i_11;
        if (i_31 <= 0) {
            i_11 = 1 - i_31;
            i_7 -= i_11;
            i_6 += i_11 * i_8;
            i_5 += i_11 * anInt1586;
            i_31 = 1;
        }

        if (i_31 + i_7 >= anInt1587) {
            i_11 = i_31 + i_7 + 1 - anInt1587;
            i_7 -= i_11;
        }

        if (i_21 <= 0) {
            i_11 = 1 - i_21;
            i_8 -= i_11;
            i_6 += i_11;
            i_5 += i_11;
            i_10 += i_11;
            i_9 += i_11;
            i_21 = 1;
        }

        if (i_8 + i_21 >= anInt1586) {
            i_11 = i_8 + i_21 + 1 - anInt1586;
            i_8 -= i_11;
            i_10 += i_11;
            i_9 += i_11;
        }

        if (i_8 > 0 && i_7 > 0) {
            method2296(aByteArray1588, class282_sub50_sub17_sub1_4.aByteArray10297, i_6, i_5, i_8, i_7, i_9, i_10);
            method2298(i_21, i_31, i_8, i_7);
        }

    }

    void method2314(Shadow class282_sub50_sub17_1, int i_2, int i_3) {
        int i_31 = i_3;
        int i_21 = i_2;
        CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_4 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
        i_21 += class282_sub50_sub17_sub1_4.anInt10293 + 1;
        i_31 += class282_sub50_sub17_sub1_4.anInt10295 + 1;
        int i_5 = i_21 + i_31 * anInt1586;
        int i_6 = 0;
        int i_7 = class282_sub50_sub17_sub1_4.anInt10294;
        int i_8 = class282_sub50_sub17_sub1_4.anInt10296;
        int i_9 = anInt1586 - i_8;
        int i_10 = 0;
        int i_11;
        if (i_31 <= 0) {
            i_11 = 1 - i_31;
            i_7 -= i_11;
            i_6 += i_11 * i_8;
            i_5 += i_11 * anInt1586;
            i_31 = 1;
        }

        if (i_31 + i_7 >= anInt1587) {
            i_11 = i_31 + i_7 + 1 - anInt1587;
            i_7 -= i_11;
        }

        if (i_21 <= 0) {
            i_11 = 1 - i_21;
            i_8 -= i_11;
            i_6 += i_11;
            i_5 += i_11;
            i_10 += i_11;
            i_9 += i_11;
            i_21 = 1;
        }

        if (i_8 + i_21 >= anInt1586) {
            i_11 = i_8 + i_21 + 1 - anInt1586;
            i_8 -= i_11;
            i_10 += i_11;
            i_9 += i_11;
        }

        if (i_8 > 0 && i_7 > 0) {
            method2295(aByteArray1588, class282_sub50_sub17_sub1_4.aByteArray10297, i_6, i_5, i_8, i_7, i_9, i_10);
            method2298(i_21, i_31, i_8, i_7);
        }

    }

}
