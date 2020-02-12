package com.jagex;

import jaggl.OpenGL;

public class Class158_Sub1_Sub4 extends Class158_Sub1 {

    int anInt10228;
    int anInt10226;
    int anInt10231;
    int anInt10230;
    int anInt10229;
    Interface13[] anInterface13Array10233 = new Interface13[4];
    OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_10227;
    Interface13 anInterface13_10232;

    public void method186() {
        if (this.anInt10228 != 0) {
            this.aGraphicalRenderer_Sub1_10227.method13678(this.anInt10228);
            this.anInt10228 = 0;
        }

    }

    boolean method213() {
        OpenGL.glBindFramebufferEXT(36160, this.anInt10228);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((this.anInt10226 & 1 << i_1) != 0) {
                this.method15622(i_1);
            }
        }

        if ((this.anInt10226 & 0x10) != 0) {
            this.method15625();
        }

        this.anInt10226 = 0;
        this.aGraphicalRenderer_Sub1_10227.method13578();
        return true;
    }

    public void method13759(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface13 interface13_4 = (Interface13) interface9_2;
        if (interface9_2 == null) {
            this.anInt10231 &= ~i_3;
            this.anInterface13Array10233[i_1] = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if (i_3 != (this.anInt10231 | i_3)) {
                if (this.anInt10229 != interface13_4.method1() || this.anInt10230 != interface13_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_4.method74();
                this.anInt10229 = interface13_4.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 126)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= i_3;
            this.anInterface13Array10233[i_1] = interface13_4;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 120)) {
            this.method15622(i_1);
        } else {
            this.anInt10226 |= i_3;
        }

    }

    void method15622(int i_1) {
        Interface13 interface13_2 = this.anInterface13Array10233[i_1];
        if (interface13_2 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, i_1 + 36064, 36161, 0);
        } else {
            interface13_2.method99(i_1 + 36064);
        }

    }

    public boolean method13764() {
        int i_1 = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i_1 == 36053;
    }

    void method15624(int i_3, int i_4, boolean bool_8) {
        if (true | bool_8) {
            int i_9 = this.anInt10230;
            int i_10 = this.aGraphicalRenderer_Sub1_10227.method8523((byte) 123).method2716();
            int i_11 = 0;
            if (bool_8) {
                i_11 |= 0x100;
            }

            if (true) {
                i_11 |= 0x4000;
            }

            OpenGL.glBindFramebufferEXT(36008, this.anInt10228);
            OpenGL.glBlitFramebufferEXT(0, i_9 - 0 - i_4, i_3 + 0, i_9 - 0, 0, i_10 - 0 - i_4, i_3 + 0, i_10 - 0, i_11, 9728);
            OpenGL.glBindFramebufferEXT(36008, 0);
        }

    }

    boolean method2718() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    public void method13761(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface13 interface13_4 = (Interface13) interface9_2;
        if (interface9_2 == null) {
            this.anInt10231 &= ~i_3;
            this.anInterface13Array10233[i_1] = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | i_3) != i_3) {
                if (this.anInt10229 != interface13_4.method1() || this.anInt10230 != interface13_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_4.method74();
                this.anInt10229 = interface13_4.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 126)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= i_3;
            this.anInterface13Array10233[i_1] = interface13_4;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 111)) {
            this.method15622(i_1);
        } else {
            this.anInt10226 |= i_3;
        }

    }

    Class158_Sub1_Sub4(OpenGLGraphicalRenderer class505_sub1_1) {
        if (!class505_sub1_1.aBool8472) {
            throw new IllegalStateException("");
        } else {
            this.aGraphicalRenderer_Sub1_10227 = class505_sub1_1;
            int[] ints_2 = new int[1];
            OpenGL.glGenFramebuffersEXT(1, ints_2, 0);
            this.anInt10228 = ints_2[0];
        }
    }

    public void method212() {
        if (this.anInt10228 != 0) {
            this.aGraphicalRenderer_Sub1_10227.method13678(this.anInt10228);
            this.anInt10228 = 0;
        }

    }

    public int method2719() {
        return this.anInt10229;
    }

    void method15625() {
        if (this.anInterface13_10232 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
        } else {
            this.anInterface13_10232.method99(36096);
        }

    }

    public int method2720() {
        return this.anInt10229;
    }

    public int method2716() {
        return this.anInt10230;
    }

    public void method13760(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface13 interface13_4 = (Interface13) interface9_2;
        if (interface9_2 == null) {
            this.anInt10231 &= ~i_3;
            this.anInterface13Array10233[i_1] = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | i_3) != i_3) {
                if (this.anInt10229 != interface13_4.method1() || this.anInt10230 != interface13_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_4.method74();
                this.anInt10229 = interface13_4.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 105)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= i_3;
            this.anInterface13Array10233[i_1] = interface13_4;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 117)) {
            this.method15622(i_1);
        } else {
            this.anInt10226 |= i_3;
        }

    }

    boolean method211() {
        OpenGL.glBindFramebufferEXT(36160, this.anInt10228);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((this.anInt10226 & 1 << i_1) != 0) {
                this.method15622(i_1);
            }
        }

        if ((this.anInt10226 & 0x10) != 0) {
            this.method15625();
        }

        this.anInt10226 = 0;
        this.aGraphicalRenderer_Sub1_10227.method13578();
        return true;
    }

    public void method13762(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface13 interface13_4 = (Interface13) interface9_2;
        if (interface9_2 == null) {
            this.anInt10231 &= ~i_3;
            this.anInterface13Array10233[i_1] = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | i_3) != i_3) {
                if (this.anInt10229 != interface13_4.method1() || this.anInt10230 != interface13_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_4.method74();
                this.anInt10229 = interface13_4.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 116)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= i_3;
            this.anInterface13Array10233[i_1] = interface13_4;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 116)) {
            this.method15622(i_1);
        } else {
            this.anInt10226 |= i_3;
        }

    }

    public void method13763(Interface8 interface8_1) {
        Interface13 interface13_2 = (Interface13) interface8_1;
        if (interface8_1 == null) {
            this.anInt10231 &= ~0x10;
            this.anInterface13_10232 = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | 0x10) != 16) {
                if (this.anInt10229 != interface13_2.method1() || this.anInt10230 != interface13_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_2.method74();
                this.anInt10229 = interface13_2.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 113)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= 0x10;
            this.anInterface13_10232 = interface13_2;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 104)) {
            this.method15625();
        } else {
            this.anInt10226 |= 0x10;
        }

    }

    public void method13765(Interface8 interface8_1) {
        Interface13 interface13_2 = (Interface13) interface8_1;
        if (interface8_1 == null) {
            this.anInt10231 &= ~0x10;
            this.anInterface13_10232 = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | 0x10) != 16) {
                if (this.anInt10229 != interface13_2.method1() || this.anInt10230 != interface13_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_2.method74();
                this.anInt10229 = interface13_2.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 109)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= 0x10;
            this.anInterface13_10232 = interface13_2;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 124)) {
            this.method15625();
        } else {
            this.anInt10226 |= 0x10;
        }

    }

    public void method13758(Interface8 interface8_1) {
        Interface13 interface13_2 = (Interface13) interface8_1;
        if (interface8_1 == null) {
            this.anInt10231 &= ~0x10;
            this.anInterface13_10232 = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | 0x10) != 16) {
                if (this.anInt10229 != interface13_2.method1() || this.anInt10230 != interface13_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_2.method74();
                this.anInt10229 = interface13_2.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 112)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= 0x10;
            this.anInterface13_10232 = interface13_2;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 107)) {
            this.method15625();
        } else {
            this.anInt10226 |= 0x10;
        }

    }

    public boolean method13766() {
        int i_1 = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i_1 == 36053;
    }

    boolean method54() {
        OpenGL.glBindFramebufferEXT(36160, this.anInt10228);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((this.anInt10226 & 1 << i_1) != 0) {
                this.method15622(i_1);
            }
        }

        if ((this.anInt10226 & 0x10) != 0) {
            this.method15625();
        }

        this.anInt10226 = 0;
        this.aGraphicalRenderer_Sub1_10227.method13578();
        return true;
    }

    public void method13757(Interface8 interface8_1) {
        Interface13 interface13_2 = (Interface13) interface8_1;
        if (interface8_1 == null) {
            this.anInt10231 &= ~0x10;
            this.anInterface13_10232 = null;
            if (this.anInt10231 == 0) {
                this.anInt10230 = 0;
                this.anInt10229 = 0;
            }
        } else {
            if ((this.anInt10231 | 0x10) != 16) {
                if (this.anInt10229 != interface13_2.method1() || this.anInt10230 != interface13_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10230 = interface13_2.method74();
                this.anInt10229 = interface13_2.method1();
                if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 124)) {
                    this.aGraphicalRenderer_Sub1_10227.method13639();
                }
            }

            this.anInt10231 |= 0x10;
            this.anInterface13_10232 = interface13_2;
        }

        if (this == this.aGraphicalRenderer_Sub1_10227.method8523((byte) 127)) {
            this.method15625();
        } else {
            this.anInt10226 |= 0x10;
        }

    }

    boolean method2723() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    boolean method2715() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    boolean method2717() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    boolean method2724() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    boolean method2725() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    boolean method2722() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    public int method2721() {
        return this.anInt10230;
    }

    public int method2727() {
        return this.anInt10230;
    }

    public int method2714() {
        return this.anInt10229;
    }

    public int method2726() {
        return this.anInt10229;
    }

    void method15628(int i_1) {
        OpenGL.glDrawBuffer(i_1 + 36064);
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.method212();
    }

}
