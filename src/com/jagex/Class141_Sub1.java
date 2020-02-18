package com.jagex;

import jaggl.OpenGL;

public class Class141_Sub1 extends Class141 {

    Class138 aClass138_9022;
    boolean aBool9020;
    boolean aBool9025;
    Class137_Sub2[] aClass137_Sub2Array9027;

    Class141_Sub1(OpenGLHardwareRenderer class505_sub1_1) {
        super(class505_sub1_1);
        if (class505_sub1_1.aBool8480) {
            aBool9025 = class505_sub1_1.anInt8469 < 3;
            int i_2 = aBool9025 ? 48 : 127;
            byte[][] bytes_3 = new byte[6][4096];
            byte[][] bytes_4 = new byte[6][4096];
            byte[][] bytes_5 = new byte[6][4096];
            int i_6 = 0;

            for (int i_7 = 0; i_7 < 64; i_7++) {
                for (int i_8 = 0; i_8 < 64; i_8++) {
                    float f_9 = 2.0F * i_8 / 64.0F - 1.0F;
                    float f_10 = 2.0F * i_7 / 64.0F - 1.0F;
                    float f_11 = (float) (1.0D / Math.sqrt(f_9 * f_9 + 1.0F + f_10 * f_10));
                    f_9 *= f_11;
                    f_10 *= f_11;

                    for (int i_12 = 0; i_12 < 6; i_12++) {
                        float f_13;
                        if (i_12 == 0) {
                            f_13 = -f_9;
                        } else if (i_12 == 1) {
                            f_13 = f_9;
                        } else if (i_12 == 2) {
                            f_13 = f_10;
                        } else if (i_12 == 3) {
                            f_13 = -f_10;
                        } else if (i_12 == 4) {
                            f_13 = -f_11;
                        } else {
                            f_13 = f_11;
                        }

                        int i_14;
                        int i_15;
                        int i_16;
                        if (f_13 > 0.0F) {
                            i_16 = (int) (Math.pow(f_13, 96.0D) * i_2);
                            i_15 = (int) (Math.pow(f_13, 36.0D) * i_2);
                            i_14 = (int) (Math.pow(f_13, 12.0D) * i_2);
                        } else {
                            i_14 = 0;
                            i_15 = 0;
                            i_16 = 0;
                        }

                        bytes_4[i_12][i_6] = (byte) i_16;
                        bytes_5[i_12][i_6] = (byte) i_15;
                        bytes_3[i_12][i_6] = (byte) i_14;
                    }

                    ++i_6;
                }
            }

            aClass137_Sub2Array9027 = new Class137_Sub2[3];
            aClass137_Sub2Array9027[0] = new Class137_Sub2(aGraphicalRenderer_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, bytes_4, Class150.aClass150_1951);
            aClass137_Sub2Array9027[1] = new Class137_Sub2(aGraphicalRenderer_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, bytes_5, Class150.aClass150_1951);
            aClass137_Sub2Array9027[2] = new Class137_Sub2(aGraphicalRenderer_Sub1_1664, Class150.aClass150_1951, Class76.aClass76_751, bytes_3, Class150.aClass150_1951);
            method14411();
        }

    }

    void method14411() {
        aClass138_9022 = new Class138(2);
        aClass138_9022.method2380(0);
        aGraphicalRenderer_Sub1_1664.method13610(1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!aBool9025) {
            aGraphicalRenderer_Sub1_1664.method13717(7681, 8448);
            aGraphicalRenderer_Sub1_1664.method13595(0, 34168, 768);
            aGraphicalRenderer_Sub1_1664.method13610(2);
            aGraphicalRenderer_Sub1_1664.method13717(260, 7681);
            aGraphicalRenderer_Sub1_1664.method13595(0, 34168, 768);
            aGraphicalRenderer_Sub1_1664.method13595(1, 34168, 770);
        } else {
            aGraphicalRenderer_Sub1_1664.method13717(260, 7681);
            aGraphicalRenderer_Sub1_1664.method13595(0, 5890, 770);
        }
        aGraphicalRenderer_Sub1_1664.method13616(0, 34167);

        aGraphicalRenderer_Sub1_1664.method13610(0);
        aClass138_9022.method2381();
        aClass138_9022.method2380(1);
        aGraphicalRenderer_Sub1_1664.method13610(1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!aBool9025) {
            aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
            aGraphicalRenderer_Sub1_1664.method13595(0, 5890, 768);
            aGraphicalRenderer_Sub1_1664.method13610(2);
            aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
            aGraphicalRenderer_Sub1_1664.method13595(0, 5890, 768);
            aGraphicalRenderer_Sub1_1664.method13595(1, 34168, 768);
        } else {
            aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
            aGraphicalRenderer_Sub1_1664.method13595(0, 5890, 768);
        }
        aGraphicalRenderer_Sub1_1664.method13616(0, 5890);

        aGraphicalRenderer_Sub1_1664.method13610(0);
        aClass138_9022.method2381();
    }

    @Override
    boolean method2395() {
        return true;
    }

    @Override
    void method2405() {
        aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
    }

    @Override
    void method2397(boolean bool_1) {
        if (aClass138_9022 != null && bool_1) {
            if (!aBool9025) {
                aGraphicalRenderer_Sub1_1664.method13610(2);
                aGraphicalRenderer_Sub1_1664.method13654(aGraphicalRenderer_Sub1_1664.aClass137_Sub1_8460);
                aGraphicalRenderer_Sub1_1664.method13610(0);
            }

            aClass138_9022.method2379('\u0000');
            aBool9020 = true;
        } else {
            aGraphicalRenderer_Sub1_1664.method13616(0, 34168);
        }

    }

    @Override
    void method2408() {
        aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
    }

    @Override
    void method2398() {
        if (aBool9020) {
            if (!aBool9025) {
                aGraphicalRenderer_Sub1_1664.method13610(2);
                aGraphicalRenderer_Sub1_1664.method13654(null);
            }

            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(null);
            aGraphicalRenderer_Sub1_1664.method13610(0);
            aClass138_9022.method2379('\u0001');
            aBool9020 = false;
        } else {
            aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
        }

        aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
    }

    @Override
    void method2394(Class137 class137_1, int i_2) {
        aGraphicalRenderer_Sub1_1664.method13654(class137_1);
        aGraphicalRenderer_Sub1_1664.method13612(i_2);
    }

    @Override
    void method2400(Class137 class137_1, int i_2) {
        aGraphicalRenderer_Sub1_1664.method13654(class137_1);
        aGraphicalRenderer_Sub1_1664.method13612(i_2);
    }

    @Override
    boolean method2401() {
        return true;
    }

    @Override
    void method2399(int i_1, int i_2) {
        if (aBool9020) {
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub2Array9027[i_1 - 1]);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

    }

    @Override
    void method2413(Class137 class137_1, int i_2) {
        aGraphicalRenderer_Sub1_1664.method13654(class137_1);
        aGraphicalRenderer_Sub1_1664.method13612(i_2);
    }

    @Override
    void method2404() {
        aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
    }

    @Override
    void method2402(boolean bool_1) {
        if (aClass138_9022 != null && bool_1) {
            if (!aBool9025) {
                aGraphicalRenderer_Sub1_1664.method13610(2);
                aGraphicalRenderer_Sub1_1664.method13654(aGraphicalRenderer_Sub1_1664.aClass137_Sub1_8460);
                aGraphicalRenderer_Sub1_1664.method13610(0);
            }

            aClass138_9022.method2379('\u0000');
            aBool9020 = true;
        } else {
            aGraphicalRenderer_Sub1_1664.method13616(0, 34168);
        }

    }

    @Override
    void method2407() {
        aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
    }

    @Override
    void method2411() {
        if (aBool9020) {
            if (!aBool9025) {
                aGraphicalRenderer_Sub1_1664.method13610(2);
                aGraphicalRenderer_Sub1_1664.method13654(null);
            }

            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(null);
            aGraphicalRenderer_Sub1_1664.method13610(0);
            aClass138_9022.method2379('\u0001');
            aBool9020 = false;
        } else {
            aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
        }

        aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
    }

    @Override
    void method2409(int i_1, int i_2) {
        if (aBool9020) {
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub2Array9027[i_1 - 1]);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

    }

    @Override
    void method2396(int i_1, int i_2) {
        if (aBool9020) {
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub2Array9027[i_1 - 1]);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

    }

    @Override
    void method2410(int i_1, int i_2) {
        if (aBool9020) {
            aGraphicalRenderer_Sub1_1664.method13610(1);
            aGraphicalRenderer_Sub1_1664.method13654(aClass137_Sub2Array9027[i_1 - 1]);
            aGraphicalRenderer_Sub1_1664.method13610(0);
        }

    }

    @Override
    void method2403(boolean bool_1) {
        if (aClass138_9022 != null && bool_1) {
            if (!aBool9025) {
                aGraphicalRenderer_Sub1_1664.method13610(2);
                aGraphicalRenderer_Sub1_1664.method13654(aGraphicalRenderer_Sub1_1664.aClass137_Sub1_8460);
                aGraphicalRenderer_Sub1_1664.method13610(0);
            }

            aClass138_9022.method2379('\u0000');
            aBool9020 = true;
        } else {
            aGraphicalRenderer_Sub1_1664.method13616(0, 34168);
        }

    }

    @Override
    void method2412(Class137 class137_1, int i_2) {
        aGraphicalRenderer_Sub1_1664.method13654(class137_1);
        aGraphicalRenderer_Sub1_1664.method13612(i_2);
    }

    @Override
    void method2406() {
        aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
    }

    @Override
    void method2414(Class137 class137_1, int i_2) {
        aGraphicalRenderer_Sub1_1664.method13654(class137_1);
        aGraphicalRenderer_Sub1_1664.method13612(i_2);
    }

}
