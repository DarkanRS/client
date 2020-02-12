package com.jagex;

import jaggl.OpenGL;

public class Class319_Sub3 extends Class319 implements Interface29 {

    int anInt9167;
    int anInt9166;

    public void method68(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
        if (i_8 == 0) {
            i_8 = i_3;
        }

        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glPixelStorei(3317, 1);
        if (i_8 != i_3) {
            OpenGL.glPixelStorei(3314, i_8);
        }

        OpenGL.glTexSubImage2Dub(this.anInt3707, 0, i_1, i_2, i_3, i_4, GraphicalRenderer_Sub2_Sub1.method15575(class150_6), 5121, bytes_5, i_7);
        if (i_8 != i_3) {
            OpenGL.glPixelStorei(3314, 0);
        }

        OpenGL.glPixelStorei(3317, 4);
    }

    public void method32() {
        super.method26();
    }

    public float method47(float f_1) {
        return f_1;
    }

    Class319_Sub3(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, float[] floats_5, int i_6, int i_7) {
        super(class505_sub2_sub1_1, 34037, class150_2, Class76.aClass76_758, i_3 * i_4, false);
        this.anInt9167 = i_3;
        this.anInt9166 = i_4;
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glPixelStorei(3314, i_7);
        OpenGL.glTexImage2Df(this.anInt3707, 0, GraphicalRenderer_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_3, i_4, 0, GraphicalRenderer_Sub2_Sub1.method15575(this.aClass150_3708), 5126, floats_5, i_6 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    public int method1() {
        return this.anInt9167;
    }

    public int method59() {
        return this.anInt9166;
    }

    public float method62(float f_1) {
        return f_1;
    }

    public void method48(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        if (i_7 == 0) {
            i_7 = i_3;
        }

        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, i_7);
        }

        OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_5, i_6);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, 0);
        }

    }

    public boolean method46() {
        return false;
    }

    public void method50(boolean bool_1, boolean bool_2) {
    }

    public boolean method63() {
        return false;
    }

    public void method52(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
        if (i_8 == 0) {
            i_8 = i_3;
        }

        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glPixelStorei(3317, 1);
        if (i_3 != i_8) {
            OpenGL.glPixelStorei(3314, i_8);
        }

        OpenGL.glTexSubImage2Dub(this.anInt3707, 0, i_1, i_2, i_3, i_4, GraphicalRenderer_Sub2_Sub1.method15575(class150_6), 5121, bytes_5, i_7);
        if (i_3 != i_8) {
            OpenGL.glPixelStorei(3314, 0);
        }

        OpenGL.glPixelStorei(3317, 4);
    }

    public boolean method54() {
        return super.method54();
    }

    public Interface9 method200() {
        return new Class314(this, 0);
    }

    public int method70() {
        return this.anInt9167;
    }

    Class319_Sub3(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
        super(class505_sub2_sub1_1, 34037, class150_2, class76_3, i_5 * i_4, false);
        this.anInt9167 = i_4;
        this.anInt9166 = i_5;
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glTexImage2Dub(this.anInt3707, 0, GraphicalRenderer_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_4, i_5, 0, GraphicalRenderer_Sub2_Sub1.method15575(this.aClass150_3708), GraphicalRenderer_Sub2_Sub1.method15566(this.aClass76_3710), null, 0);
    }

    public void method205(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method26() {
        super.method26();
    }

    public float method60(float f_1) {
        return f_1;
    }

    public int method55() {
        return this.anInt9167;
    }

    public boolean method49() {
        return super.method54();
    }

    public int method57() {
        return this.anInt9167;
    }

    public int method72() {
        return this.anInt9166;
    }

    public float method65(float f_1) {
        return f_1;
    }

    public float method56(float f_1) {
        return f_1;
    }

    public float method45(float f_1) {
        return f_1;
    }

    public void method53(int i_3, int i_4, int[] ints_5) {
        int[] ints_7 = new int[this.anInt9167 * this.anInt9166];
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glGetTexImagei(this.anInt3707, 0, 32993, 5121, ints_7, 0);

        for (int i_8 = 0; i_8 < i_4; i_8++) {
            System.arraycopy(ints_7, this.anInt9167 * (0 + (i_4 - 1) - i_8), ints_5, i_3 * i_8 + 0, i_3);
        }

    }

    public float method58(float f_1) {
        return f_1;
    }

    public float method51(float f_1) {
        return f_1;
    }

    public void method67(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        if (i_7 == 0) {
            i_7 = i_3;
        }

        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, i_7);
        }

        OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aGraphicalRenderer_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, 0);
        }

    }

    public void method64(boolean bool_1, boolean bool_2) {
    }

    public void method61(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        if (i_7 == 0) {
            i_7 = i_3;
        }

        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, i_7);
        }

        OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aGraphicalRenderer_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, 0);
        }

    }

    public void method66(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
        if (i_7 == 0) {
            i_7 = i_3;
        }

        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, i_7);
        }

        OpenGL.glTexSubImage2Di(this.anInt3707, 0, i_1, i_2, i_3, i_4, 32993, this.aGraphicalRenderer_Sub2_Sub1_3700.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_6);
        if (i_3 != i_7) {
            OpenGL.glPixelStorei(3314, 0);
        }

    }

    public void method206(Class35 class35_1) {
        super.method205(class35_1);
    }

    Class319_Sub3(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, int i_2, int i_3, int[] ints_4, int i_5, int i_6) {
        super(class505_sub2_sub1_1, 34037, Class150.aClass150_1949, Class76.aClass76_751, i_3 * i_2, false);
        this.anInt9167 = i_2;
        this.anInt9166 = i_3;
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glPixelStorei(3314, i_6);
        OpenGL.glTexImage2Di(this.anInt3707, 0, 6408, this.anInt9167, this.anInt9166, 0, 32993, this.aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_4, i_5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    public void method69(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
        int[] ints_7 = new int[this.anInt9167 * this.anInt9166];
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glGetTexImagei(this.anInt3707, 0, 32993, 5121, ints_7, 0);

        for (int i_8 = 0; i_8 < i_4; i_8++) {
            System.arraycopy(ints_7, (i_2 + (i_4 - 1) - i_8) * this.anInt9167, ints_5, i_6 + i_8 * i_3, i_3);
        }

    }

    public int method36() {
        return this.anInt9167;
    }

    public void method203() {
        super.method207();
    }

    public void method204(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method207() {
        super.method207();
    }

    public void method201(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method202(Class35 class35_1) {
        super.method205(class35_1);
    }

    public Interface9 method199(int i_1) {
        return new Class314(this, i_1);
    }

    public int method71() {
        return this.anInt9166;
    }

    Class319_Sub3(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, byte[] bytes_5, int i_6, int i_7) {
        super(class505_sub2_sub1_1, 34037, class150_2, Class76.aClass76_751, i_3 * i_4, false);
        this.anInt9167 = i_3;
        this.anInt9166 = i_4;
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, i_7);
        OpenGL.glTexImage2Dub(this.anInt3707, 0, GraphicalRenderer_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_3, i_4, 0, GraphicalRenderer_Sub2_Sub1.method15575(this.aClass150_3708), 5121, bytes_5, i_6);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

}
