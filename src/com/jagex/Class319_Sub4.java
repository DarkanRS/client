package com.jagex;

import jaggl.OpenGL;

public class Class319_Sub4 extends Class319 implements Interface31 {

    public void method202(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method207() {
        super.method207();
    }

    public void method205(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method26() {
        super.method26();
    }

    public void method32() {
        super.method26();
    }

    public void method203() {
        super.method207();
    }

    public void method204(Class35 class35_1) {
        super.method205(class35_1);
    }

    Class319_Sub4(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, int i_2, boolean bool_3, int[][] ints_4) {
        super(class505_sub2_sub1_1, 34067, Class150.aClass150_1949, Class76.aClass76_751, i_2 * i_2 * 6, bool_3);
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        int i_5;
        if (bool_3) {
            for (i_5 = 0; i_5 < 6; i_5++) {
                this.method5714(i_5 + 34069, i_2, i_2, ints_4[i_5]);
            }
        } else {
            for (i_5 = 0; i_5 < 6; i_5++) {
                OpenGL.glTexImage2Di(i_5 + 34069, 0, GraphicalRenderer_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), i_2, i_2, 0, GraphicalRenderer_Sub2_Sub1.method15575(this.aClass150_3708), this.aGraphicalRenderer_Sub2_Sub1_3700.anInt10198, ints_4[i_5], 0);
            }
        }

    }

    public void method201(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method206(Class35 class35_1) {
        super.method205(class35_1);
    }

}
