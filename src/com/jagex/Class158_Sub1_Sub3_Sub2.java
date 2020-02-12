package com.jagex;

import jaggl.OpenGL;

public class Class158_Sub1_Sub3_Sub2 extends Class158_Sub1_Sub3 {

    Interface28[] anInterface28Array10449 = new Interface28[4];
    GraphicalRenderer_Sub2_Sub1 aGraphicalRenderer_Sub2_Sub1_10446;
    int anInt10443;
    int anInt10444;
    Interface28 anInterface28_10448;
    int anInt10445;
    int anInt10441;
    int anInt10447;

    public int method2714() {
        return this.anInt10441;
    }

    Class158_Sub1_Sub3_Sub2(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1) {
        super(class505_sub2_sub1_1);
        this.aGraphicalRenderer_Sub2_Sub1_10446 = class505_sub2_sub1_1;
        int[] ints_2 = new int[1];
        OpenGL.glGenFramebuffersEXT(1, ints_2, 0);
        this.anInt10443 = ints_2[0];
    }

    public void method13765(Interface8 interface8_1) {
        Interface28 interface28_2 = (Interface28) interface8_1;
        if (interface8_1 == null) {
            this.anInt10444 &= ~0x10;
            this.anInterface28_10448 = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_2.method1() || this.anInt10445 != interface28_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_2.method74();
                this.anInt10441 = interface28_2.method1();
                this.method15562();
            }

            this.anInt10444 |= 0x10;
            this.anInterface28_10448 = interface28_2;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 107)) {
            this.method15982();
        } else {
            this.anInt10447 |= 0x10;
        }

    }

    void method15981(int i_1) {
        Interface28 interface28_2 = this.anInterface28Array10449[i_1];
        if (interface28_2 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, i_1 + 36064, 36161, 0);
        } else {
            interface28_2.method99(i_1 + 36064);
        }

    }

    void method15982() {
        if (this.anInterface28_10448 == null) {
            OpenGL.glFramebufferRenderbufferEXT(36160, 36096, 36161, 0);
        } else {
            this.anInterface28_10448.method99(36096);
        }

    }

    public void method13758(Interface8 interface8_1) {
        Interface28 interface28_2 = (Interface28) interface8_1;
        if (interface8_1 == null) {
            this.anInt10444 &= ~0x10;
            this.anInterface28_10448 = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_2.method1() || this.anInt10445 != interface28_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_2.method74();
                this.anInt10441 = interface28_2.method1();
                this.method15562();
            }

            this.anInt10444 |= 0x10;
            this.anInterface28_10448 = interface28_2;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 113)) {
            this.method15982();
        } else {
            this.anInt10447 |= 0x10;
        }

    }

    boolean method213() {
        OpenGL.glBindFramebufferEXT(36160, this.anInt10443);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((this.anInt10447 & 1 << i_1) != 0) {
                this.method15981(i_1);
            }
        }

        if ((this.anInt10447 & 0x10) != 0) {
            this.method15982();
        }

        this.anInt10447 = 0;
        return super.method213();
    }

    public void method13760(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface28 interface28_4 = (Interface28) interface9_2;
        if (interface9_2 == null) {
            this.anInt10444 &= ~i_3;
            this.anInterface28Array10449[i_1] = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_4.method1() || this.anInt10445 != interface28_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_4.method74();
                this.anInt10441 = interface28_4.method1();
                this.method15562();
            }

            this.anInt10444 |= i_3;
            this.anInterface28Array10449[i_1] = interface28_4;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 125)) {
            this.method15981(i_1);
        } else {
            this.anInt10447 |= i_3;
        }

    }

    public void method212() {
        if (this.anInt10443 != 0) {
            this.aGraphicalRenderer_Sub2_Sub1_10446.method15571(this.anInt10443);
            this.anInt10443 = 0;
        }

    }

    public void finalize() throws Throwable {
        super.finalize();
        this.method212();
    }

    boolean method211() {
        OpenGL.glBindFramebufferEXT(36160, this.anInt10443);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((this.anInt10447 & 1 << i_1) != 0) {
                this.method15981(i_1);
            }
        }

        if ((this.anInt10447 & 0x10) != 0) {
            this.method15982();
        }

        this.anInt10447 = 0;
        return super.method213();
    }

    public int method2720() {
        return this.anInt10441;
    }

    public int method2726() {
        return this.anInt10441;
    }

    public boolean method13764() {
        int i_1 = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i_1 == 36053;
    }

    public void method13761(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface28 interface28_4 = (Interface28) interface9_2;
        if (interface9_2 == null) {
            this.anInt10444 &= ~i_3;
            this.anInterface28Array10449[i_1] = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_4.method1() || this.anInt10445 != interface28_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_4.method74();
                this.anInt10441 = interface28_4.method1();
                this.method15562();
            }

            this.anInt10444 |= i_3;
            this.anInterface28Array10449[i_1] = interface28_4;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 103)) {
            this.method15981(i_1);
        } else {
            this.anInt10447 |= i_3;
        }

    }

    public int method2719() {
        return this.anInt10441;
    }

    public void method13763(Interface8 interface8_1) {
        Interface28 interface28_2 = (Interface28) interface8_1;
        if (interface8_1 == null) {
            this.anInt10444 &= ~0x10;
            this.anInterface28_10448 = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_2.method1() || this.anInt10445 != interface28_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_2.method74();
                this.anInt10441 = interface28_2.method1();
                this.method15562();
            }

            this.anInt10444 |= 0x10;
            this.anInterface28_10448 = interface28_2;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 121)) {
            this.method15982();
        } else {
            this.anInt10447 |= 0x10;
        }

    }

    public void method13757(Interface8 interface8_1) {
        Interface28 interface28_2 = (Interface28) interface8_1;
        if (interface8_1 == null) {
            this.anInt10444 &= ~0x10;
            this.anInterface28_10448 = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_2.method1() || this.anInt10445 != interface28_2.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_2.method74();
                this.anInt10441 = interface28_2.method1();
                this.method15562();
            }

            this.anInt10444 |= 0x10;
            this.anInterface28_10448 = interface28_2;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 119)) {
            this.method15982();
        } else {
            this.anInt10447 |= 0x10;
        }

    }

    boolean method2725() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    public boolean method13766() {
        int i_1 = OpenGL.glCheckFramebufferStatusEXT(36160);
        return i_1 == 36053;
    }

    public void method13759(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface28 interface28_4 = (Interface28) interface9_2;
        if (interface9_2 == null) {
            this.anInt10444 &= ~i_3;
            this.anInterface28Array10449[i_1] = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_4.method1() || this.anInt10445 != interface28_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_4.method74();
                this.anInt10441 = interface28_4.method1();
                this.method15562();
            }

            this.anInt10444 |= i_3;
            this.anInterface28Array10449[i_1] = interface28_4;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 120)) {
            this.method15981(i_1);
        } else {
            this.anInt10447 |= i_3;
        }

    }

    boolean method54() {
        OpenGL.glBindFramebufferEXT(36160, this.anInt10443);

        for (int i_1 = 0; i_1 < 4; i_1++) {
            if ((this.anInt10447 & 1 << i_1) != 0) {
                this.method15981(i_1);
            }
        }

        if ((this.anInt10447 & 0x10) != 0) {
            this.method15982();
        }

        this.anInt10447 = 0;
        return super.method213();
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

    public int method2716() {
        return this.anInt10445;
    }

    boolean method2722() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    public int method2721() {
        return this.anInt10445;
    }

    public int method2727() {
        return this.anInt10445;
    }

    public void method13762(int i_1, Interface9 interface9_2) {
        int i_3 = 1 << i_1;
        Interface28 interface28_4 = (Interface28) interface9_2;
        if (interface9_2 == null) {
            this.anInt10444 &= ~i_3;
            this.anInterface28Array10449[i_1] = null;
            if (this.anInt10444 == 0) {
                this.anInt10445 = 0;
                this.anInt10441 = 0;
            }
        } else {
            if (this.anInt10444 != 0) {
                if (this.anInt10441 != interface28_4.method1() || this.anInt10445 != interface28_4.method74()) {
                    throw new RuntimeException();
                }
            } else {
                this.anInt10445 = interface28_4.method74();
                this.anInt10441 = interface28_4.method1();
                this.method15562();
            }

            this.anInt10444 |= i_3;
            this.anInterface28Array10449[i_1] = interface28_4;
        }

        if (this == this.aGraphicalRenderer_Sub2_Sub1_10446.method8523((byte) 116)) {
            this.method15981(i_1);
        } else {
            this.anInt10447 |= i_3;
        }

    }

    boolean method2718() {
        OpenGL.glBindFramebufferEXT(36160, 0);
        return true;
    }

    public void method186() {
        if (this.anInt10443 != 0) {
            this.aGraphicalRenderer_Sub2_Sub1_10446.method15571(this.anInt10443);
            this.anInt10443 = 0;
        }

    }

}
