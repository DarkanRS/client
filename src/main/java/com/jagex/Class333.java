package com.jagex;

import jaggl.OpenGL;

public class Class333 implements Interface28 {

    int anInt3882;
    Class150 aClass150_3880;
    Class76 aClass76_3878;
    int anInt3877;
    int anInt3879;
    JAGGLRenderer aGraphicalRenderer_Sub2_Sub1_3881;

    Class333(JAGGLRenderer class505_sub2_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
        aClass150_3880 = class150_2;
        aClass76_3878 = class76_3;
        anInt3877 = i_4;
        anInt3879 = i_5;
        aGraphicalRenderer_Sub2_Sub1_3881 = class505_sub2_sub1_1;
        int[] ints_6 = new int[1];
        OpenGL.glGenRenderbuffersEXT(1, ints_6, 0);
        anInt3882 = ints_6[0];
        OpenGL.glBindRenderbufferEXT(36161, anInt3882);
        OpenGL.glRenderbufferStorageEXT(36161, JAGGLRenderer.method15574(aClass150_3880, aClass76_3878), i_4, i_5);
    }

    @Override
    protected void finalize() throws Throwable {
        method5931();
        super.finalize();
    }

    @Override
    public int method1() {
        return anInt3877;
    }

    @Override
    public int method74() {
        return anInt3879;
    }

    void method5931() {
        if (anInt3882 > 0) {
            aGraphicalRenderer_Sub2_Sub1_3881.method15572(anInt3882, aClass76_3878.anInt748 * aClass150_3880.anInt1959 * anInt3877 * anInt3879);
            anInt3882 = 0;
        }

    }

    @Override
    public void method26() {
        if (anInt3882 > 0) {
            int[] ints_1 = {anInt3882};
            OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
            anInt3882 = 0;
        }

    }

    @Override
    public int method73() {
        return anInt3879;
    }

    @Override
    public int method75() {
        return anInt3877;
    }

    @Override
    public int method76() {
        return anInt3877;
    }

    @Override
    public int method39() {
        return anInt3879;
    }

    @Override
    public void method99(int i_1) {
        OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt3882);
    }

    @Override
    public void method32() {
        if (anInt3882 > 0) {
            int[] ints_1 = {anInt3882};
            OpenGL.glDeleteRenderbuffersEXT(1, ints_1, 0);
            anInt3882 = 0;
        }

    }

    @Override
    public int method77() {
        return anInt3879;
    }

    @Override
    public void method104(int i_1) {
        OpenGL.glFramebufferRenderbufferEXT(36160, i_1, 36161, anInt3882);
    }

}
