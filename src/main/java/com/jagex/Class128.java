package com.jagex;

import jaggl.OpenGL;

public class Class128 {

    static int[] anIntArray1582 = new int[2];
    OpenGLRenderer aGraphicalRenderer_Sub1_1581;
    int anInt1583;

    Class128(OpenGLRenderer class505_sub1_1, int i_2) {
        aGraphicalRenderer_Sub1_1581 = class505_sub1_1;
        anInt1583 = i_2;
    }

    static Class128 method2174(OpenGLRenderer class505_sub1_0, Class140[] arr_1) {
        int i_2;
        for (i_2 = 0; i_2 < arr_1.length; i_2++) {
            if (arr_1[i_2] == null || arr_1[i_2].anInt1663 <= 0) {
                return null;
            }
        }

        i_2 = OpenGL.glCreateProgram();

        int i_3;
        for (i_3 = 0; i_3 < arr_1.length; i_3++) {
            OpenGL.glAttachShader(i_2, arr_1[i_3].anInt1663);
        }

        OpenGL.glLinkProgram(i_2);
        OpenGL.glGetProgramiv(i_2, 35714, anIntArray1582, 0);
        if (anIntArray1582[0] == 0) {
            OpenGL.glGetProgramiv(i_2, 35716, anIntArray1582, 1);
            if (anIntArray1582[1] > 1) {
                byte[] bytes_4 = new byte[anIntArray1582[1]];
                OpenGL.glGetProgramInfoLog(i_2, anIntArray1582[1], anIntArray1582, 0, bytes_4, 0);
                System.out.println(new String(bytes_4));
            }

            if (anIntArray1582[0] == 0) {
                for (i_3 = 0; i_3 < arr_1.length; i_3++) {
                    OpenGL.glDetachShader(i_2, arr_1[i_3].anInt1663);
                }

                OpenGL.glDeleteProgram(i_2);
                return null;
            }
        }

        return new Class128(class505_sub1_0, i_2);
    }

    @Override
    protected void finalize() throws Throwable {
        aGraphicalRenderer_Sub1_1581.method13627(anInt1583);
        super.finalize();
    }

}
