package com.jagex;

import jaggl.OpenGL;

public class Class137_Sub1 extends Class137 {

    int anInt9087;
    int anInt9086;

    Class137_Sub1(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, boolean bool_5, int[] ints_6, int i_7, int i_8, boolean bool_9) {
        super(class505_sub1_1, i_2, Class150.aClass150_1949, Class76.aClass76_751, i_3 * i_4, bool_5);
        int[] ints_61 = ints_6;
        anInt9087 = i_3;
        anInt9086 = i_4;
        if (bool_9) {
            int[] ints_10 = new int[ints_61.length];

            for (int i_11 = 0; i_11 < i_4; i_11++) {
                int i_12 = i_3 * i_11;
                int i_13 = i_3 * (i_4 - i_11 - 1);

                for (int i_14 = 0; i_14 < i_3; i_14++) {
                    ints_10[i_12++] = ints_61[i_13++];
                }
            }

            ints_61 = ints_10;
        }

        openGLHardwareRenderer.method13654(this);
        if (anInt1648 != 34037 && bool_5 && i_7 == 0 && i_8 == 0) {
            method2371(anInt1648, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9087, anInt9086, openGLHardwareRenderer.anInt8410, ints_61);
            method2354(true);
        } else {
            OpenGL.glPixelStorei(3314, i_7);
            OpenGL.glTexImage2Di(anInt1648, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9087, anInt9086, 0, 32993, openGLHardwareRenderer.anInt8410, ints_61, i_8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            method2354(false);
        }

        method2351(true);
    }

    Class137_Sub1(OpenGLRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, int i_6, boolean bool_7, byte[] bytes_8, Class150 class150_9, boolean bool_10) {
        super(class505_sub1_1, i_2, class150_3, class76_4, i_5 * i_6, bool_7);
        byte[] bytes_81 = bytes_8;
        anInt9087 = i_5;
        anInt9086 = i_6;
        if (bool_10) {
            byte[] bytes_11 = new byte[bytes_81.length];

            for (int i_12 = 0; i_12 < i_6; i_12++) {
                int i_13 = i_5 * i_12;
                int i_14 = i_5 * (i_6 - i_12 - 1);

                for (int i_15 = 0; i_15 < i_5; i_15++) {
                    bytes_11[i_13++] = bytes_81[i_14++];
                }
            }

            bytes_81 = bytes_11;
        }

        openGLHardwareRenderer.method13654(this);
        OpenGL.glPixelStorei(3317, 1);
        if (bool_7 && anInt1648 != 34037) {
            method2359(i_2, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), i_5, i_6, class150_9, bytes_81);
            method2354(true);
        } else {
            OpenGL.glTexImage2Dub(anInt1648, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9087, anInt9086, 0, OpenGLRenderer.method13629(class150_9), 5121, bytes_81, 0);
            method2354(false);
        }

        OpenGL.glPixelStorei(3317, 4);
        method2351(true);
    }

    Class137_Sub1(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        super(class505_sub1_1, i_2, Class150.aClass150_1950, Class76.aClass76_751, i_5 * i_6, false);
        anInt9087 = i_5;
        anInt9086 = i_6;
        openGLHardwareRenderer.method13654(this);
        Class158 class158_7 = openGLHardwareRenderer.method8523();
        if (class158_7 != null) {
            int i_8 = class158_7.method2716() - (i_4 + i_6);
            int i_9 = OpenGLRenderer.method13630(aClass150_1650, aClass76_1651);
            OpenGL.glCopyTexImage2D(anInt1648, 0, i_9, i_3, i_8, i_5, i_6, 0);
        }

        method2351(true);
    }

    Class137_Sub1(OpenGLRenderer class505_sub1_1, Class150 class150_3, Class76 class76_4, int i_5, int i_6, boolean bool_7, float[] floats_8, Class150 class150_9) {
        super(class505_sub1_1, 3553, class150_3, class76_4, i_5 * i_6, bool_7);
        anInt9087 = i_5;
        anInt9086 = i_6;
        openGLHardwareRenderer.method13654(this);
        if (bool_7 && anInt1648 != 34037) {
            method2361(OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), i_5, i_6, class150_9, floats_8);
            method2354(true);
        } else {
            OpenGL.glTexImage2Df(anInt1648, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), anInt9087, anInt9086, 0, OpenGLRenderer.method13629(class150_9), 5126, floats_8, 0);
            method2354(false);
        }

        method2351(true);
    }

    Class137_Sub1(OpenGLRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, int i_6) {
        super(class505_sub1_1, i_2, class150_3, class76_4, i_5 * i_6, false);
        anInt9087 = i_5;
        anInt9086 = i_6;
        openGLHardwareRenderer.method13654(this);
        OpenGL.glTexImage2Dub(anInt1648, 0, OpenGLRenderer.method13630(aClass150_1650, aClass76_1651), i_5, i_6, 0, OpenGLRenderer.method13629(aClass150_1650), 5121, null, 0);
        method2351(true);
    }

    void method14439(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        Class158 class158_7 = openGLHardwareRenderer.method8523();
        if (class158_7 != null) {
            int i_8 = class158_7.method2716() - (i_4 + i_6);
            openGLHardwareRenderer.method13654(this);
            OpenGL.glCopyTexSubImage2D(anInt1648, 0, i_1, anInt9086 - (i_2 + i_4), i_5, i_8, i_3, i_4);
            OpenGL.glFlush();
        }

    }

    Interface8 method14440() {
        return new Class154(this);
    }

    Interface9 method14441() {
        return new Class154(this);
    }

    void method14445(boolean bool_1, boolean bool_2) {
        if (anInt1648 == 3553) {
            openGLHardwareRenderer.method13654(this);
            OpenGL.glTexParameteri(anInt1648, 10242, bool_1 ? 10497 : 33071);
            OpenGL.glTexParameteri(anInt1648, 10243, bool_2 ? 10497 : 33071);
        }

    }

    void method14452(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_7) {
        int i_71 = i_7;
        if (i_71 == 0) {
            i_71 = i_3;
        }

        int[] ints_9 = new int[i_3 * i_4];

        for (int i_10 = 0; i_10 < i_4; i_10++) {
            int i_11 = i_3 * i_10;
            int i_12 = (i_4 - i_10 - 1) * i_71;

            for (int i_13 = 0; i_13 < i_3; i_13++) {
                ints_9[i_11++] = ints_5[i_12++];
            }
        }

        openGLHardwareRenderer.method13654(this);
        if (i_3 != i_71) {
            OpenGL.glPixelStorei(3314, i_71);
        }

        OpenGL.glTexSubImage2Di(anInt1648, 0, i_1, anInt9086 - i_2 - i_4, i_3, i_4, 32993, openGLHardwareRenderer.anInt8410, ints_9, 0);
        if (i_3 != i_71) {
            OpenGL.glPixelStorei(3314, 0);
        }

    }

    void method14455(int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_8, boolean bool_9) {
        int i_81 = i_8;
        byte[] bytes_51 = bytes_5;
        if (i_81 == 0) {
            i_81 = i_3;
        }

        if (bool_9) {
            int i_10 = class150_6.anInt1959;
            int i_11 = i_3 * i_10;
            int i_12 = i_10 * i_81;
            byte[] bytes_13 = new byte[i_11 * i_4];

            for (int i_14 = 0; i_14 < i_4; i_14++) {
                int i_15 = i_14 * i_11;
                int i_16 = i_12 * (i_4 - i_14 - 1);

                for (int i_17 = 0; i_17 < i_11; i_17++) {
                    bytes_13[i_15++] = bytes_51[i_16++];
                }
            }

            bytes_51 = bytes_13;
        }

        openGLHardwareRenderer.method13654(this);
        OpenGL.glPixelStorei(3317, 1);
        if (i_3 != i_81) {
            OpenGL.glPixelStorei(3314, i_81);
        }

        OpenGL.glTexSubImage2Dub(anInt1648, 0, 0, anInt9086 - i_2 - i_4, i_3, i_4, OpenGLRenderer.method13629(class150_6), 5121, bytes_51, 0);
        if (i_3 != i_81) {
            OpenGL.glPixelStorei(3314, 0);
        }

        OpenGL.glPixelStorei(3317, 4);
    }

}
