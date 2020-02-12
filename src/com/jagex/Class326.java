package com.jagex;

import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class326 implements Interface5 {

    static int[] anIntArray3766 = new int[1];
    int anInt3758 = -1;
    GraphicalRenderer_Sub2_Sub1 aGraphicalRenderer_Sub2_Sub1_3757;
    int anInt3762;
    boolean aBool3761;
    NativeHeapBuffer aNativeHeapBuffer3765;
    int anInt3763;
    int anInt3764;

    public int method39() {
        return this.anInt3763;
    }

    public long method41(int i_1, int i_2) {
        OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
        return OpenGL.glMapBufferARB(this.anInt3762, 35001) + (long) i_1;
    }

    Class326(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, int i_2, boolean bool_3) {
        this.aGraphicalRenderer_Sub2_Sub1_3757 = class505_sub2_sub1_1;
        this.anInt3762 = i_2;
        this.aBool3761 = bool_3;
    }

    void method5792() {
        if (this.aGraphicalRenderer_Sub2_Sub1_3757.aBool10193) {
            OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
        }

    }

    public void method44() {
        OpenGL.glUnmapBufferARB(this.anInt3762);
    }

    void method5793() {
        if (this.anInt3758 < 0) {
            if (this.aGraphicalRenderer_Sub2_Sub1_3757.aBool10193) {
                OpenGL.glGenBuffersARB(1, anIntArray3766, 0);
                this.anInt3758 = anIntArray3766[0];
                OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
            } else {
                this.anInt3758 = 0;
            }
        }

    }

    public long method40(int i_1, int i_2) {
        OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
        return OpenGL.glMapBufferARB(this.anInt3762, 35001) + (long) i_1;
    }

    long method5794() {
        return this.anInt3758 == 0 ? this.aNativeHeapBuffer3765.method2() : 0L;
    }

    public boolean method42(int i_1, int i_2, long long_3) {
        this.method5793();
        if (this.anInt3758 > 0) {
            OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
            OpenGL.glBufferSubDataARBa(this.anInt3762, i_1, i_2, long_3);
        } else {
            this.aNativeHeapBuffer3765.aNativeHeap614.copy(this.aNativeHeapBuffer3765.method2() + (long) i_1, long_3, i_2);
        }

        return true;
    }

    void method26() {
        if (this.anInt3758 > 0) {
            this.aGraphicalRenderer_Sub2_Sub1_3757.method15569(this.anInt3758, this.anInt3763);
            this.anInt3758 = -1;
        }

    }

    public void finalize() throws Throwable {
        this.method26();
        super.finalize();
    }

    public boolean method35(int i_1, int i_2, long long_3) {
        this.method5793();
        if (this.anInt3758 > 0) {
            OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
            OpenGL.glBufferSubDataARBa(this.anInt3762, i_1, i_2, long_3);
        } else {
            this.aNativeHeapBuffer3765.aNativeHeap614.copy(this.aNativeHeapBuffer3765.method2() + (long) i_1, long_3, i_2);
        }

        return true;
    }

    public void method38() {
        OpenGL.glUnmapBufferARB(this.anInt3762);
    }

    public long method37(int i_1, int i_2) {
        OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
        return OpenGL.glMapBufferARB(this.anInt3762, 35001) + (long) i_1;
    }

    public void method43() {
        OpenGL.glUnmapBufferARB(this.anInt3762);
    }

    boolean method5798(int i_1, Source source_2) {
        if (i_1 > this.anInt3764) {
            this.method5793();
            if (this.anInt3758 > 0) {
                OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
                OpenGL.glBufferDataARBa(this.anInt3762, i_1, source_2.method2(), this.aBool3761 ? 35040 : 35044);
                this.aGraphicalRenderer_Sub2_Sub1_3757.anInt8702 += i_1 - this.anInt3763;
            } else {
                this.aNativeHeapBuffer3765 = this.aGraphicalRenderer_Sub2_Sub1_3757.method13910(i_1, false);
                this.aNativeHeapBuffer3765.method1176(source_2);
            }

            this.anInt3764 = i_1;
        } else if (this.anInt3758 > 0) {
            OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
            OpenGL.glBufferSubDataARBa(this.anInt3762, 0, this.anInt3763, source_2.method2());
            this.aGraphicalRenderer_Sub2_Sub1_3757.anInt8702 += i_1 - this.anInt3763;
        } else {
            this.aNativeHeapBuffer3765 = this.aGraphicalRenderer_Sub2_Sub1_3757.method13910(i_1, false);
            this.aNativeHeapBuffer3765.method1176(source_2);
        }

        this.anInt3763 = i_1;
        return true;
    }

    void method208(int i_1) {
        if (i_1 > this.anInt3764) {
            this.method5793();
            if (this.anInt3758 > 0) {
                OpenGL.glBindBufferARB(this.anInt3762, this.anInt3758);
                OpenGL.glBufferDataARBub(this.anInt3762, i_1, null, 0, this.aBool3761 ? 35040 : 35044);
                this.aGraphicalRenderer_Sub2_Sub1_3757.anInt8702 += i_1 - this.anInt3764;
            } else {
                this.aNativeHeapBuffer3765 = this.aGraphicalRenderer_Sub2_Sub1_3757.method13910(i_1, false);
            }

            this.anInt3764 = i_1;
        }

        this.anInt3763 = i_1;
    }

    public int method36() {
        return this.anInt3763;
    }

}
