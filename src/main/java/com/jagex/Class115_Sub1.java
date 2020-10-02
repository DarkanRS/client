package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class115_Sub1 extends Class115 {

    static float[] aFloatArray9288 = new float[16];
    boolean aBool9284;
    float[][] aFloatArrayArray9283;
    boolean[] aBoolArray9285;
    byte[] aByteArray9289;
    byte[] aByteArray9290;
    long aLong9286;
    long aLong9287;
    DirectXRenderer aGraphicalRenderer_Sub2_Sub2_9293;
    DirectXShader aClass101_Sub2_9294;

    Class115_Sub1(DirectXRenderer class505_sub2_sub2_1, Class99 class99_2) {
        aBool9284 = false;
        aFloatArrayArray9283 = new float[2][];
        aBoolArray9285 = new boolean[2];
        aString1245 = class99_2.aString1003;
        if (class99_2.aString1001 != null) {
            shaderName = class99_2.aString1001;
            aByteArray9289 = class505_sub2_sub2_1.getDXShaderData(shaderName);
        }

        if (class99_2.aString1002 != null) {
            aString1246 = class99_2.aString1002;
            aByteArray9290 = class505_sub2_sub2_1.getDXShaderData(aString1246);
        }

        class505_sub2_sub2_1.method13901(this);
    }

    Class115_Sub1(DirectXRenderer class505_sub2_sub2_1, DirectXShader class101_sub2_2, Class99 class99_3) {
        this(class505_sub2_sub2_1, class99_3);
        aGraphicalRenderer_Sub2_Sub2_9293 = class505_sub2_sub2_1;
        aClass101_Sub2_9294 = class101_sub2_2;
    }

    @Override
    void method1912(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457() != Class111.aClass111_1182) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                i_3 *= 4;
                aFloatArrayArray9283[0][i_3] = f_2;
                aBoolArray9285[0] = true;
            }

            if (i_4 >= 0) {
                i_4 *= 4;
                aFloatArrayArray9283[1][i_4] = f_2;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    public boolean method1898() {
        if (aBool9284) {
            return true;
        } else {
            aLong9286 = aByteArray9289 == null ? 0L : IDirect3DDevice.CreateVertexShader(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, aByteArray9289);
            aLong9287 = aByteArray9290 == null ? 0L : IDirect3DDevice.CreatePixelShader(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, aByteArray9290);
            if (aLong9286 == 0L && aLong9287 == 0L) {
                return false;
            } else {
                int i_1 = -1;

                int i_2;
                for (i_2 = 0; i_2 < aClass101_Sub2_9294.method1650(); i_2++) {
                    if (aClass101_Sub2_9294.method1652(i_2) == this) {
                        i_1 = i_2;
                        break;
                    }
                }

                i_2 = aClass101_Sub2_9294.method1682();
                int i_3 = aClass101_Sub2_9294.method1679();

                int i_4;
                Node_Sub21_Sub1 class282_sub21_sub1_12;
                for (i_4 = 0; i_4 < i_2; i_4++) {
                    class282_sub21_sub1_12 = aClass101_Sub2_9294.method1742(i_4);
                    class282_sub21_sub1_12.method15471(i_1);
                }

                for (i_4 = 0; i_4 < i_3; i_4++) {
                    class282_sub21_sub1_12 = aClass101_Sub2_9294.method1705(i_4);
                    class282_sub21_sub1_12.method15471(i_1);
                }

                i_4 = 0;
                int i_5 = 0;
                int i_6 = aClass101_Sub2_9294.method1653(this);

                for (int i_7 = 0; i_7 < i_2 + i_3; i_7++) {
                    Node_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1_8 = (Node_Sub21_Sub1_Sub1) (i_7 < i_2 ? aClass101_Sub2_9294.method1742(i_7) : aClass101_Sub2_9294.method1705(i_7 - i_2));
                    Class111 class111_9 = class282_sub21_sub1_sub1_8.method15457();
                    int i_10 = 1;
                    if (class111_9 == Class111.aClass111_1109) {
                        class111_9 = class282_sub21_sub1_sub1_8.method15458();
                        i_10 = class282_sub21_sub1_sub1_8.method15459();
                    }

                    switch (class111_9.anInt1232 * 1002380705 * -278657439) {
                        case 5:
                        case 26:
                        case 49:
                        case 64:
                            i_10 *= 3;
                        case 8:
                        case 10:
                        case 54:
                        case 95:
                            break;
                        case 16:
                        case 17:
                        case 56:
                        case 75:
                            i_10 *= 4;
                            break;
                        case 34:
                        case 41:
                        case 80:
                        case 94:
                            i_10 *= 2;
                            break;
                        default:
                            i_10 = 0;
                    }

                    int i_11;
                    if (class282_sub21_sub1_sub1_8.anIntArray10306[i_6] >= 0) {
                        i_11 = class282_sub21_sub1_sub1_8.anIntArray10306[i_6] + i_10;
                        if (i_4 < i_11) {
                            i_4 = i_11;
                        }
                    }

                    if (class282_sub21_sub1_sub1_8.anIntArray10307[i_6] >= 0) {
                        i_11 = class282_sub21_sub1_sub1_8.anIntArray10307[i_6] + i_10;
                        if (i_5 < i_11) {
                            i_5 = i_11;
                        }
                    }
                }

                aFloatArrayArray9283[0] = new float[i_4 * 4];
                aFloatArrayArray9283[1] = new float[i_5 * 4];
                aBool9284 = true;
                return true;
            }
        }
    }

    @Override
    void method1894(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457() != Class111.aClass111_1182) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                i_3 *= 4;
                aFloatArrayArray9283[0][i_3] = f_2;
                aBoolArray9285[0] = true;
            }

            if (i_4 >= 0) {
                i_4 *= 4;
                aFloatArrayArray9283[1][i_4] = f_2;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1923(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1132) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                i_4 *= 4;
                aFloatArrayArray9283[0][i_4] = f_2;
                aFloatArrayArray9283[0][i_4 + 1] = f_3;
                aBoolArray9285[0] = true;
            }

            if (i_5 >= 0) {
                i_5 *= 4;
                aFloatArrayArray9283[1][i_5] = f_2;
                aFloatArrayArray9283[1][i_5 + 1] = f_3;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1908(int i_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1942(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6589(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 8);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1936(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1168) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                method14589(i_3, matrix44_2.method6589(aFloatArray9288), 8);
            }

            if (i_4 >= 0) {
                method14590(i_4, matrix44_2.method6589(aFloatArray9288), 8);
            }

        }
    }

    @Override
    void method1891(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1150) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                method14589(i_3, matrix44_2.method6545(aFloatArray9288), 16);
            }

            if (i_4 >= 0) {
                method14590(i_4, matrix44_2.method6545(aFloatArray9288), 16);
            }

        }
    }

    @Override
    void method1948(int i_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1893(int i_1, float f_2, float f_3, float f_4) {
        int i_5 = i_1 >> 16;
        int i_6 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_5][i_6] = f_2;
        aFloatArrayArray9283[i_5][i_6 + 1] = f_3;
        aFloatArrayArray9283[i_5][i_6 + 2] = f_4;
        aBoolArray9285[i_5] = true;
    }

    @Override
    void method1895(int i_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = i_1 >> 16;
        int i_7 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_6][i_7] = f_2;
        aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
        aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
        aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
        aBoolArray9285[i_6] = true;
    }

    @Override
    void method1905(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 12);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1906(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6589(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 8);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1900(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 16);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1904(int i_1, float[] floats_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = (i_1 & 0xffff) * 4;
        System.arraycopy(floats_2, 0, aFloatArrayArray9283[i_4], i_5, i_3);
        aBoolArray9285[i_4] = true;
    }

    void method14589(int i_1, float[] floats_2, int i_3) {
        Class503.method8356(floats_2, 0, aFloatArrayArray9283[0], i_1 * 4, i_3);
        aBoolArray9285[0] = true;
    }

    void method14590(int i_1, float[] floats_2, int i_3) {
        Class503.method8356(floats_2, 0, aFloatArrayArray9283[1], i_1 * 4, i_3);
        aBoolArray9285[1] = true;
    }

    @Override
    void method1933(int i_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = i_1 >> 16;
        int i_7 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_6][i_7] = f_2;
        aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
        aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
        aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
        aBoolArray9285[i_6] = true;
    }

    void method14591() {
        int i_1;
        if (aBoolArray9285[0]) {
            for (i_1 = 0; i_1 < aFloatArrayArray9283[0].length; i_1++) {
                aGraphicalRenderer_Sub2_Sub2_9293.anUnsafe8830.putFloat(aGraphicalRenderer_Sub2_Sub2_9293.aLong8695 + (i_1 * 4), aFloatArrayArray9283[0][i_1]);
            }

            IDirect3DDevice.SetVertexShaderConstantF(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, 0, aGraphicalRenderer_Sub2_Sub2_9293.aLong8695, aFloatArrayArray9283[0].length / 4);
            aBoolArray9285[0] = false;
        }

        if (aBoolArray9285[1]) {
            for (i_1 = 0; i_1 < aFloatArrayArray9283[1].length; i_1++) {
                aGraphicalRenderer_Sub2_Sub2_9293.anUnsafe8830.putFloat(aGraphicalRenderer_Sub2_Sub2_9293.aLong8695 + (i_1 * 4), aFloatArrayArray9283[1][i_1]);
            }

            IDirect3DDevice.SetPixelShaderConstantF(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, 0, aGraphicalRenderer_Sub2_Sub2_9293.aLong8695, aFloatArrayArray9283[1].length / 4);
            aBoolArray9285[1] = false;
        }

    }

    @Override
    public void method26() {
        if (aLong9286 != 0L) {
            IUnknown.Release(aLong9286);
            aLong9286 = 0L;
        }

        if (aLong9287 != 0L) {
            IUnknown.Release(aLong9287);
            aLong9287 = 0L;
        }

        aGraphicalRenderer_Sub2_Sub2_9293.method13885(this);
    }

    void method14592() {
        if (aLong9286 != 0L) {
            aGraphicalRenderer_Sub2_Sub2_9293.method15650(aLong9286);
            aLong9286 = 0L;
        }

        if (aLong9287 != 0L) {
            aGraphicalRenderer_Sub2_Sub2_9293.method15650(aLong9287);
            aLong9287 = 0L;
        }

    }

    @Override
    protected void finalize() {
        method14592();
    }

    @Override
    void method1903(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1109) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                method14589(i_4, floats_2, i_3);
            }

            if (i_5 >= 0) {
                method14590(i_5, floats_2, i_3);
            }

        }
    }

    @Override
    public void method32() {
        if (aLong9286 != 0L) {
            IUnknown.Release(aLong9286);
            aLong9286 = 0L;
        }

        if (aLong9287 != 0L) {
            IUnknown.Release(aLong9287);
            aLong9287 = 0L;
        }

        aGraphicalRenderer_Sub2_Sub2_9293.method13885(this);
    }

    @Override
    public boolean method1911() {
        if (aBool9284) {
            return true;
        } else {
            aLong9286 = aByteArray9289 == null ? 0L : IDirect3DDevice.CreateVertexShader(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, aByteArray9289);
            aLong9287 = aByteArray9290 == null ? 0L : IDirect3DDevice.CreatePixelShader(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, aByteArray9290);
            if (aLong9286 == 0L && aLong9287 == 0L) {
                return false;
            } else {
                int i_1 = -1;

                int i_2;
                for (i_2 = 0; i_2 < aClass101_Sub2_9294.method1650(); i_2++) {
                    if (aClass101_Sub2_9294.method1652(i_2) == this) {
                        i_1 = i_2;
                        break;
                    }
                }

                i_2 = aClass101_Sub2_9294.method1682();
                int i_3 = aClass101_Sub2_9294.method1679();

                int i_4;
                Node_Sub21_Sub1 class282_sub21_sub1_12;
                for (i_4 = 0; i_4 < i_2; i_4++) {
                    class282_sub21_sub1_12 = aClass101_Sub2_9294.method1742(i_4);
                    class282_sub21_sub1_12.method15471(i_1);
                }

                for (i_4 = 0; i_4 < i_3; i_4++) {
                    class282_sub21_sub1_12 = aClass101_Sub2_9294.method1705(i_4);
                    class282_sub21_sub1_12.method15471(i_1);
                }

                i_4 = 0;
                int i_5 = 0;
                int i_6 = aClass101_Sub2_9294.method1653(this);

                for (int i_7 = 0; i_7 < i_2 + i_3; i_7++) {
                    Node_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1_8 = (Node_Sub21_Sub1_Sub1) (i_7 < i_2 ? aClass101_Sub2_9294.method1742(i_7) : aClass101_Sub2_9294.method1705(i_7 - i_2));
                    Class111 class111_9 = class282_sub21_sub1_sub1_8.method15457();
                    int i_10 = 1;
                    if (class111_9 == Class111.aClass111_1109) {
                        class111_9 = class282_sub21_sub1_sub1_8.method15458();
                        i_10 = class282_sub21_sub1_sub1_8.method15459();
                    }

                    switch (class111_9.anInt1232 * 1002380705 * -278657439) {
                        case 5:
                        case 26:
                        case 49:
                        case 64:
                            i_10 *= 3;
                        case 8:
                        case 10:
                        case 54:
                        case 95:
                            break;
                        case 16:
                        case 17:
                        case 56:
                        case 75:
                            i_10 *= 4;
                            break;
                        case 34:
                        case 41:
                        case 80:
                        case 94:
                            i_10 *= 2;
                            break;
                        default:
                            i_10 = 0;
                    }

                    int i_11;
                    if (class282_sub21_sub1_sub1_8.anIntArray10306[i_6] >= 0) {
                        i_11 = class282_sub21_sub1_sub1_8.anIntArray10306[i_6] + i_10;
                        if (i_4 < i_11) {
                            i_4 = i_11;
                        }
                    }

                    if (class282_sub21_sub1_sub1_8.anIntArray10307[i_6] >= 0) {
                        i_11 = class282_sub21_sub1_sub1_8.anIntArray10307[i_6] + i_10;
                        if (i_5 < i_11) {
                            i_5 = i_11;
                        }
                    }
                }

                aFloatArrayArray9283[0] = new float[i_4 * 4];
                aFloatArrayArray9283[1] = new float[i_5 * 4];
                aBool9284 = true;
                return true;
            }
        }
    }

    @Override
    void method1897(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_7 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[0][i_6] = f_2;
                aFloatArrayArray9283[0][i_6 + 1] = f_3;
                aFloatArrayArray9283[0][i_6 + 2] = f_4;
                aFloatArrayArray9283[0][i_6 + 3] = f_5;
                aBoolArray9285[0] = true;
            }

            if (i_7 >= 0) {
                i_7 *= 4;
                aFloatArrayArray9283[1][i_7] = f_2;
                aFloatArrayArray9283[1][i_7 + 1] = f_3;
                aFloatArrayArray9283[1][i_7 + 2] = f_4;
                aFloatArrayArray9283[1][i_7 + 3] = f_5;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1928(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1939(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_5 >= 0) {
                i_5 *= 4;
                aFloatArrayArray9283[0][i_5] = f_2;
                aFloatArrayArray9283[0][i_5 + 1] = f_3;
                aFloatArrayArray9283[0][i_5 + 2] = f_4;
                aBoolArray9285[0] = true;
            }

            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[1][i_6] = f_2;
                aFloatArrayArray9283[1][i_6 + 1] = f_3;
                aFloatArrayArray9283[1][i_6 + 2] = f_4;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1917(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_7 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[0][i_6] = f_2;
                aFloatArrayArray9283[0][i_6 + 1] = f_3;
                aFloatArrayArray9283[0][i_6 + 2] = f_4;
                aFloatArrayArray9283[0][i_6 + 3] = f_5;
                aBoolArray9285[0] = true;
            }

            if (i_7 >= 0) {
                i_7 *= 4;
                aFloatArrayArray9283[1][i_7] = f_2;
                aFloatArrayArray9283[1][i_7 + 1] = f_3;
                aFloatArrayArray9283[1][i_7 + 2] = f_4;
                aFloatArrayArray9283[1][i_7 + 3] = f_5;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1901(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_7 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[0][i_6] = f_2;
                aFloatArrayArray9283[0][i_6 + 1] = f_3;
                aFloatArrayArray9283[0][i_6 + 2] = f_4;
                aFloatArrayArray9283[0][i_6 + 3] = f_5;
                aBoolArray9285[0] = true;
            }

            if (i_7 >= 0) {
                i_7 *= 4;
                aFloatArrayArray9283[1][i_7] = f_2;
                aFloatArrayArray9283[1][i_7 + 1] = f_3;
                aFloatArrayArray9283[1][i_7 + 2] = f_4;
                aFloatArrayArray9283[1][i_7 + 3] = f_5;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1920(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_7 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[0][i_6] = f_2;
                aFloatArrayArray9283[0][i_6 + 1] = f_3;
                aFloatArrayArray9283[0][i_6 + 2] = f_4;
                aFloatArrayArray9283[0][i_6 + 3] = f_5;
                aBoolArray9285[0] = true;
            }

            if (i_7 >= 0) {
                i_7 *= 4;
                aFloatArrayArray9283[1][i_7] = f_2;
                aFloatArrayArray9283[1][i_7 + 1] = f_3;
                aFloatArrayArray9283[1][i_7 + 2] = f_4;
                aFloatArrayArray9283[1][i_7 + 3] = f_5;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1925(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1168) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                method14589(i_3, matrix44_2.method6589(aFloatArray9288), 8);
            }

            if (i_4 >= 0) {
                method14590(i_4, matrix44_2.method6589(aFloatArray9288), 8);
            }

        }
    }

    @Override
    void method1919(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1109) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                method14589(i_4, floats_2, i_3);
            }

            if (i_5 >= 0) {
                method14590(i_5, floats_2, i_3);
            }

        }
    }

    @Override
    void method1944(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1109) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                method14589(i_4, floats_2, i_3);
            }

            if (i_5 >= 0) {
                method14590(i_5, floats_2, i_3);
            }

        }
    }

    @Override
    void method1930(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1918(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1109) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                method14589(i_4, floats_2, i_3);
            }

            if (i_5 >= 0) {
                method14590(i_5, floats_2, i_3);
            }

        }
    }

    @Override
    void method1924(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1168) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                method14589(i_3, matrix44_2.method6589(aFloatArray9288), 8);
            }

            if (i_4 >= 0) {
                method14590(i_4, matrix44_2.method6589(aFloatArray9288), 8);
            }

        }
    }

    @Override
    void method1921(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1109) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                method14589(i_4, floats_2, i_3);
            }

            if (i_5 >= 0) {
                method14590(i_5, floats_2, i_3);
            }

        }
    }

    @Override
    void method1926(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1150) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                method14589(i_3, matrix44_2.method6545(aFloatArray9288), 16);
            }

            if (i_4 >= 0) {
                method14590(i_4, matrix44_2.method6545(aFloatArray9288), 16);
            }

        }
    }

    @Override
    void method1927(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
        int i_3 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1150) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_3 >= 0) {
                method14589(i_3, matrix44_2.method6545(aFloatArray9288), 16);
            }

            if (i_4 >= 0) {
                method14590(i_4, matrix44_2.method6545(aFloatArray9288), 16);
            }

        }
    }

    @Override
    void method1910(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 16);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1929(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1922(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 12);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1931(int i_1, float f_2, float f_3, float f_4) {
        int i_5 = i_1 >> 16;
        int i_6 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_5][i_6] = f_2;
        aFloatArrayArray9283[i_5][i_6 + 1] = f_3;
        aFloatArrayArray9283[i_5][i_6 + 2] = f_4;
        aBoolArray9285[i_5] = true;
    }

    @Override
    void method1932(int i_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = i_1 >> 16;
        int i_7 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_6][i_7] = f_2;
        aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
        aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
        aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
        aBoolArray9285[i_6] = true;
    }

    @Override
    void method1935(int i_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = i_1 >> 16;
        int i_7 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_6][i_7] = f_2;
        aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
        aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
        aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
        aBoolArray9285[i_6] = true;
    }

    @Override
    void method1934(int i_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = i_1 >> 16;
        int i_7 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_6][i_7] = f_2;
        aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
        aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
        aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
        aBoolArray9285[i_6] = true;
    }

    @Override
    void method1914(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_5 >= 0) {
                i_5 *= 4;
                aFloatArrayArray9283[0][i_5] = f_2;
                aFloatArrayArray9283[0][i_5 + 1] = f_3;
                aFloatArrayArray9283[0][i_5 + 2] = f_4;
                aBoolArray9285[0] = true;
            }

            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[1][i_6] = f_2;
                aFloatArrayArray9283[1][i_6 + 1] = f_3;
                aFloatArrayArray9283[1][i_6 + 2] = f_4;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1907(int i_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = i_1 >> 16;
        int i_7 = (i_1 & 0xffff) * 4;
        aFloatArrayArray9283[i_6][i_7] = f_2;
        aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
        aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
        aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
        aBoolArray9285[i_6] = true;
    }

    @Override
    void method1937(int i_1, float[] floats_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = (i_1 & 0xffff) * 4;
        System.arraycopy(floats_2, 0, aFloatArrayArray9283[i_4], i_5, i_3);
        aBoolArray9285[i_4] = true;
    }

    @Override
    void method1938(int i_1, float[] floats_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = (i_1 & 0xffff) * 4;
        System.arraycopy(floats_2, 0, aFloatArrayArray9283[i_4], i_5, i_3);
        aBoolArray9285[i_4] = true;
    }

    @Override
    void method1915(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_5 >= 0) {
                i_5 *= 4;
                aFloatArrayArray9283[0][i_5] = f_2;
                aFloatArrayArray9283[0][i_5 + 1] = f_3;
                aFloatArrayArray9283[0][i_5 + 2] = f_4;
                aBoolArray9285[0] = true;
            }

            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[1][i_6] = f_2;
                aFloatArrayArray9283[1][i_6 + 1] = f_3;
                aFloatArrayArray9283[1][i_6 + 2] = f_4;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1940(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 12);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1913(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
        int i_4 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1132) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_4 >= 0) {
                i_4 *= 4;
                aFloatArrayArray9283[0][i_4] = f_2;
                aFloatArrayArray9283[0][i_4 + 1] = f_3;
                aBoolArray9285[0] = true;
            }

            if (i_5 >= 0) {
                i_5 *= 4;
                aFloatArrayArray9283[1][i_5] = f_2;
                aFloatArrayArray9283[1][i_5 + 1] = f_3;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1943(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 16);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1902(int i_1, Matrix44 matrix44_2) {
        int i_3 = i_1 >> 16;
        int i_4 = (i_1 & 0xffff) * 4;
        System.arraycopy(matrix44_2.method6545(aFloatArray9288), 0, aFloatArrayArray9283[i_3], i_4, 12);
        aBoolArray9285[i_3] = true;
    }

    @Override
    void method1947(int i_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1945(int i_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    void method1946(int i_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

    @Override
    public boolean method1899() {
        if (aBool9284) {
            return true;
        } else {
            aLong9286 = aByteArray9289 == null ? 0L : IDirect3DDevice.CreateVertexShader(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, aByteArray9289);
            aLong9287 = aByteArray9290 == null ? 0L : IDirect3DDevice.CreatePixelShader(aGraphicalRenderer_Sub2_Sub2_9293.aLong10252, aByteArray9290);
            if (aLong9286 == 0L && aLong9287 == 0L) {
                return false;
            } else {
                int i_1 = -1;

                int i_2;
                for (i_2 = 0; i_2 < aClass101_Sub2_9294.method1650(); i_2++) {
                    if (aClass101_Sub2_9294.method1652(i_2) == this) {
                        i_1 = i_2;
                        break;
                    }
                }

                i_2 = aClass101_Sub2_9294.method1682();
                int i_3 = aClass101_Sub2_9294.method1679();

                int i_4;
                Node_Sub21_Sub1 class282_sub21_sub1_12;
                for (i_4 = 0; i_4 < i_2; i_4++) {
                    class282_sub21_sub1_12 = aClass101_Sub2_9294.method1742(i_4);
                    class282_sub21_sub1_12.method15471(i_1);
                }

                for (i_4 = 0; i_4 < i_3; i_4++) {
                    class282_sub21_sub1_12 = aClass101_Sub2_9294.method1705(i_4);
                    class282_sub21_sub1_12.method15471(i_1);
                }

                i_4 = 0;
                int i_5 = 0;
                int i_6 = aClass101_Sub2_9294.method1653(this);

                for (int i_7 = 0; i_7 < i_2 + i_3; i_7++) {
                    Node_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1_8 = (Node_Sub21_Sub1_Sub1) (i_7 < i_2 ? aClass101_Sub2_9294.method1742(i_7) : aClass101_Sub2_9294.method1705(i_7 - i_2));
                    Class111 class111_9 = class282_sub21_sub1_sub1_8.method15457();
                    int i_10 = 1;
                    if (class111_9 == Class111.aClass111_1109) {
                        class111_9 = class282_sub21_sub1_sub1_8.method15458();
                        i_10 = class282_sub21_sub1_sub1_8.method15459();
                    }

                    switch (class111_9.anInt1232) {
                        case 5:
                        case 26:
                        case 49:
                        case 64:
                            i_10 *= 3;
                        case 8:
                        case 10:
                        case 54:
                        case 95:
                            break;
                        case 16:
                        case 17:
                        case 56:
                        case 75:
                            i_10 *= 4;
                            break;
                        case 34:
                        case 41:
                        case 80:
                        case 94:
                            i_10 *= 2;
                            break;
                        default:
                            i_10 = 0;
                    }

                    int i_11;
                    if (class282_sub21_sub1_sub1_8.anIntArray10306[i_6] >= 0) {
                        i_11 = i_10 + class282_sub21_sub1_sub1_8.anIntArray10306[i_6];
                        if (i_4 < i_11) {
                            i_4 = i_11;
                        }
                    }

                    if (class282_sub21_sub1_sub1_8.anIntArray10307[i_6] >= 0) {
                        i_11 = i_10 + class282_sub21_sub1_sub1_8.anIntArray10307[i_6];
                        if (i_5 < i_11) {
                            i_5 = i_11;
                        }
                    }
                }

                aFloatArrayArray9283[0] = new float[i_4 * 4];
                aFloatArrayArray9283[1] = new float[i_5 * 4];
                aBool9284 = true;
                return true;
            }
        }
    }

    @Override
    void method1916(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
        int i_5 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_5 >= 0) {
                i_5 *= 4;
                aFloatArrayArray9283[0][i_5] = f_2;
                aFloatArrayArray9283[0][i_5 + 1] = f_3;
                aFloatArrayArray9283[0][i_5 + 2] = f_4;
                aBoolArray9285[0] = true;
            }

            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[1][i_6] = f_2;
                aFloatArrayArray9283[1][i_6 + 1] = f_3;
                aFloatArrayArray9283[1][i_6 + 2] = f_4;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1941(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
        int i_6 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
        int i_7 = ((Node_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
        if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134) {
            throw new IllegalArgumentException_Sub1();
        } else {
            if (i_6 >= 0) {
                i_6 *= 4;
                aFloatArrayArray9283[0][i_6] = f_2;
                aFloatArrayArray9283[0][i_6 + 1] = f_3;
                aFloatArrayArray9283[0][i_6 + 2] = f_4;
                aFloatArrayArray9283[0][i_6 + 3] = f_5;
                aBoolArray9285[0] = true;
            }

            if (i_7 >= 0) {
                i_7 *= 4;
                aFloatArrayArray9283[1][i_7] = f_2;
                aFloatArrayArray9283[1][i_7 + 1] = f_3;
                aFloatArrayArray9283[1][i_7 + 2] = f_4;
                aFloatArrayArray9283[1][i_7 + 3] = f_5;
                aBoolArray9285[1] = true;
            }

        }
    }

    @Override
    void method1896(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
        aGraphicalRenderer_Sub2_Sub2_9293.method14163(i_2);
        aGraphicalRenderer_Sub2_Sub2_9293.method14035(interface30_3);
    }

}
