package com.jagex;

import jaggl.OpenGL;

public class Class140 {

    static int[] anIntArray1661 = new int[2];
    OpenGLRenderer aGraphicalRenderer_Sub1_1662;
    int anInt1663;

    Class140(OpenGLRenderer class505_sub1_1, int i_2) {
        aGraphicalRenderer_Sub1_1662 = class505_sub1_1;
        anInt1663 = i_2;
    }

    static Class140 method2393(OpenGLRenderer class505_sub1_0, int i_1, String string_2) {
        int i_3 = OpenGL.glCreateShader(i_1);
        OpenGL.glShaderSource(i_3, string_2);
        OpenGL.glCompileShader(i_3);
        OpenGL.glGetShaderiv(i_3, 35713, anIntArray1661, 0);
        if (anIntArray1661[0] == 0) {
            if (anIntArray1661[0] == 0) {
                System.out.println();
            }

            OpenGL.glGetShaderiv(i_3, 35716, anIntArray1661, 1);
            if (anIntArray1661[1] > 1) {
                byte[] bytes_4 = new byte[anIntArray1661[1]];
                OpenGL.glGetShaderInfoLog(i_3, anIntArray1661[1], anIntArray1661, 0, bytes_4, 0);
                System.out.println(new String(bytes_4));
            }

            if (anIntArray1661[0] == 0) {
                OpenGL.glDeleteShader(i_3);
                return null;
            }
        }

        return new Class140(class505_sub1_0, i_3);
    }

    @Override
    protected void finalize() throws Throwable {
        aGraphicalRenderer_Sub1_1662.method13627(anInt1663);
        super.finalize();
    }

}
