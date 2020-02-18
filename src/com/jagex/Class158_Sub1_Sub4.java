package com.jagex;

import jaggl.OpenGL;

public class Class158_Sub1_Sub4 extends Class158_Sub1 {

    int anInt10228;
    int anInt10226;
    int anInt10231;
    int anInt10230;
    int anInt10229;
    Interface13[] anInterface13Array10233 = new Interface13[4];
    OpenGLHardwareRenderer aGraphicalRenderer_Sub1_10227;
    Interface13 anInterface13_10232;

    Class158_Sub1_Sub4(OpenGLHardwareRenderer class505_sub1_1) {
        if (!class505_sub1_1.aBool8472) {
            throw new IllegalStateException("");
        } else {
            aGraphicalRenderer_Sub1_10227 = class505_sub1_1;
            int[] ints_2 = new int[1];
            OpenGL.glGenFramebuffersEXT(1, ints_2, 0);
            anInt10228 = ints_2[0];
        }
    }

    @Override
    public void method186() {
        if (anInt10228 != 0) {
            aGraphicalRenderer_Sub1_10227.method13678(anInt10228);
            anInt10228 = 0;
        }

    }

    @Override
    boolean method213() {
        OpenGL.glBindFramebufferEXT(36160, anInt10228);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((anInt10226 & 1 << i_1) != 0) {
                method15622(i_1);
            }
        }

        if ((anInt10226 & 0x10) != 0) {
            method15625();
        }

        anInt10226 = 0;
        aGraphicalRenderer_Sub1_10227.method13578();
        return true;
    }

    @Override
    public void method13759(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface13 interface13_4 = (Interface13) interface9_2;
        if (interface9_2 == null) {
            anInt10231 &= ~i_3;
            anInterface13Array10233[i_1] = null;
            if (anInt10231 == 0) {
                anInt10230 = 0;
                anInt10229 = 0;
            }
        } else {
            if (i_3 != (anInt10231 | i_3)) {
                if (anInt10229 != interface13_4.method1() || anInt10230 != interface13_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                anInt10230 = interface13_4.method74();
                anInt10229 = interface13_4.method1();
                if (this == aGraphicalRenderer_Sub1_10227.method8523()) {
                    aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            anInt10231 |= i_3;
            anInterface13Array10233[i_1] = interface13_4;
        }

        if (this == aGraphicalRenderer_Sub1_10227.method8523()) {
            method15622(i_1);
        } else {
            anInt10226 |= i_3;
        }

    }

    void method15622(int i_1) {
        Interface13 interface13_2 = anInterface13Array10233[i_1];
        if (interface13_2 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, i_1 + 36064, 36161, 0);
        } else {
            interface13_2.method99(i_1 + 36064);
        }

    }

    @Override
    public boolean method13764() {
        int i_1 = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i_1 == 36053;
    }

    void method15624(int i_3, int i_4, boolean bool_8) {
        if (true) {
            int i_9 = anInt10230;
            int i_10 = aGraphicalRenderer_Sub1_10227.method8523().method2716();
            int i_11 = 0;
            if (bool_8) {
                i_11 |= 0x100;
            }

            if (true) {
                i_11 |= 0x4000;
            }

            OpenGL.glBindFramebufferEXT(36008, anInt10228);
            OpenGL.glBlitFramebufferEXT(0, i_9 - i_4, i_3, i_9, 0, i_10 - i_4, i_3, i_10, i_11, 9728);
            OpenGL.glBindFramebufferEXT(36008, 0);
        }

    }

    @Override
    boolean method2718() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    public void method212() {
        if (anInt10228 != 0) {
            aGraphicalRenderer_Sub1_10227.method13678(anInt10228);
            anInt10228 = 0;
        }

    }

    @Override
    public int method2719() {
        return anInt10229;
    }

    void method15625() {
        if (anInterface13_10232 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
        } else {
            anInterface13_10232.method99(36096);
        }

    }

    @Override
    public int method2720() {
        return anInt10229;
    }

    @Override
    public int method2716() {
        return anInt10230;
    }

    @Override
    boolean method211() {
        OpenGL.glBindFramebufferEXT(36160, anInt10228);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((anInt10226 & 1 << i_1) != 0) {
                method15622(i_1);
            }
        }

        if ((anInt10226 & 0x10) != 0) {
            method15625();
        }

        anInt10226 = 0;
        aGraphicalRenderer_Sub1_10227.method13578();
        return true;
    }

    @Override
    public void method13765(Interface8 interface8_1) {
        Interface13 interface13_2 = (Interface13) interface8_1;
        if (interface8_1 == null) {
            anInt10231 &= -17;
            anInterface13_10232 = null;
            if (anInt10231 == 0) {
                anInt10230 = 0;
                anInt10229 = 0;
            }
        } else {
            if ((anInt10231 | 0x10) != 16) {
                if (anInt10229 != interface13_2.method1() || anInt10230 != interface13_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                anInt10230 = interface13_2.method74();
                anInt10229 = interface13_2.method1();
                if (this == aGraphicalRenderer_Sub1_10227.method8523()) {
                    aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            anInt10231 |= 0x10;
            anInterface13_10232 = interface13_2;
        }

        if (this == aGraphicalRenderer_Sub1_10227.method8523()) {
            method15625();
        } else {
            anInt10226 |= 0x10;
        }

    }

    @Override
    boolean method54() {
        OpenGL.glBindFramebufferEXT(36160, anInt10228);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((anInt10226 & 1 << i_1) != 0) {
                method15622(i_1);
            }
        }

        if ((anInt10226 & 0x10) != 0) {
            method15625();
        }

        anInt10226 = 0;
        aGraphicalRenderer_Sub1_10227.method13578();
        return true;
    }

    @Override
    boolean method2723() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    boolean method2715() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    boolean method2717() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    boolean method2724() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    boolean method2725() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    boolean method2722() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    @Override
    public int method2721() {
        return anInt10230;
    }

    @Override
    public int method2727() {
        return anInt10230;
    }

    @Override
    public int method2714() {
        return anInt10229;
    }

    @Override
    public int method2726() {
        return anInt10229;
    }

    void method15628(int i_1) {
        OpenGL.glDrawBuffer(i_1 + 36064);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        method212();
    }

}
