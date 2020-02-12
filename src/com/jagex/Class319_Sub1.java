package com.jagex;

import jaggl.OpenGL;

public class Class319_Sub1 extends Class319 implements Interface1 {

    int anInt9151;
    int anInt9152;
    int anInt9153;

    public void method205(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method207() {
        super.method207();
    }

    public void method203() {
        super.method207();
    }

    public void method26() {
        super.method26();
    }

    public void method32() {
        super.method26();
    }

    public void method201(Class35 class35_1) {
        super.method205(class35_1);
    }

    Class319_Sub1(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, Class150 class150_2, int i_3, int i_4, int i_5, boolean bool_6, byte[] bytes_7) {
        super(class505_sub2_sub1_1, 32879, class150_2, Class76.aClass76_751, i_3 * i_5 * i_4, bool_6);
        this.anInt9151 = i_3;
        this.anInt9152 = i_4;
        this.anInt9153 = i_5;
        this.aGraphicalRenderer_Sub2_Sub1_3700.method14035(this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(this.anInt3707, 0, GraphicalRenderer_Sub2_Sub1.method15574(this.aClass150_3708, this.aClass76_3710), this.anInt9151, this.anInt9152, this.anInt9153, 0, GraphicalRenderer_Sub2_Sub1.method15575(this.aClass150_3708), 5121, bytes_7, 0);
        OpenGL.glPixelStorei(3317, 4);
        if (bool_6) {
            this.method54();
        }

    }

    public void method206(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method204(Class35 class35_1) {
        super.method205(class35_1);
    }

    public void method202(Class35 class35_1) {
        super.method205(class35_1);
    }

}
