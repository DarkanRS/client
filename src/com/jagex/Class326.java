package com.jagex;

import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public abstract class Class326 implements Interface5 {

    static int[] anIntArray3766 = new int[1];
    int anInt3758 = -1;
    AbstractRenderer_Sub2_Sub1 aGraphicalRenderer_Sub2_Sub1_3757;
    int anInt3762;
    boolean aBool3761;
    NativeHeapBuffer aNativeHeapBuffer3765;
    int anInt3763;
    int anInt3764;

    Class326(AbstractRenderer_Sub2_Sub1 class505_sub2_sub1_1, int i_2, boolean bool_3) {
        aGraphicalRenderer_Sub2_Sub1_3757 = class505_sub2_sub1_1;
        anInt3762 = i_2;
        aBool3761 = bool_3;
    }

    @Override
    public int method39() {
        return anInt3763;
    }

    @Override
    public long method41(int i_1, int i_2) {
        OpenGL.glBindBufferARB(anInt3762, anInt3758);
        return OpenGL.glMapBufferARB(anInt3762, 35001) + i_1;
    }

    void method5792() {
        if (aGraphicalRenderer_Sub2_Sub1_3757.aBool10193) {
            OpenGL.glBindBufferARB(anInt3762, anInt3758);
        }

    }

    @Override
    public void method44() {
        OpenGL.glUnmapBufferARB(anInt3762);
    }

    void method5793() {
        if (anInt3758 < 0) {
            if (aGraphicalRenderer_Sub2_Sub1_3757.aBool10193) {
                OpenGL.glGenBuffersARB(1, anIntArray3766, 0);
                anInt3758 = anIntArray3766[0];
                OpenGL.glBindBufferARB(anInt3762, anInt3758);
            } else {
                anInt3758 = 0;
            }
        }

    }

    @Override
    public long method40(int i_1, int i_2) {
        OpenGL.glBindBufferARB(anInt3762, anInt3758);
        return OpenGL.glMapBufferARB(anInt3762, 35001) + i_1;
    }

    long method5794() {
        return anInt3758 == 0 ? aNativeHeapBuffer3765.method2() : 0L;
    }

    @Override
    public boolean method42(int i_1, int i_2, long long_3) {
        method5793();
        if (anInt3758 > 0) {
            OpenGL.glBindBufferARB(anInt3762, anInt3758);
            OpenGL.glBufferSubDataARBa(anInt3762, i_1, i_2, long_3);
        } else {
            aNativeHeapBuffer3765.aNativeHeap614.copy(aNativeHeapBuffer3765.method2() + i_1, long_3, i_2);
        }

        return true;
    }

    void method26() {
        if (anInt3758 > 0) {
            aGraphicalRenderer_Sub2_Sub1_3757.method15569(anInt3758, anInt3763);
            anInt3758 = -1;
        }

    }

    @Override
    protected void finalize() throws Throwable {
        method26();
        super.finalize();
    }

    @Override
    public boolean method35(int i_1, int i_2, long long_3) {
        method5793();
        if (anInt3758 > 0) {
            OpenGL.glBindBufferARB(anInt3762, anInt3758);
            OpenGL.glBufferSubDataARBa(anInt3762, i_1, i_2, long_3);
        } else {
            aNativeHeapBuffer3765.aNativeHeap614.copy(aNativeHeapBuffer3765.method2() + i_1, long_3, i_2);
        }

        return true;
    }

    @Override
    public void method38() {
        OpenGL.glUnmapBufferARB(anInt3762);
    }

    @Override
    public long method37(int i_1, int i_2) {
        OpenGL.glBindBufferARB(anInt3762, anInt3758);
        return OpenGL.glMapBufferARB(anInt3762, 35001) + i_1;
    }

    @Override
    public void method43() {
        OpenGL.glUnmapBufferARB(anInt3762);
    }

    boolean method5798(int i_1, Source source_2) {
        if (i_1 > anInt3764) {
            method5793();
            if (anInt3758 > 0) {
                OpenGL.glBindBufferARB(anInt3762, anInt3758);
                OpenGL.glBufferDataARBa(anInt3762, i_1, source_2.method2(), aBool3761 ? 35040 : 35044);
                aGraphicalRenderer_Sub2_Sub1_3757.anInt8702 += i_1 - anInt3763;
            } else {
                aNativeHeapBuffer3765 = aGraphicalRenderer_Sub2_Sub1_3757.method13910(i_1, false);
                aNativeHeapBuffer3765.method1176(source_2);
            }

            anInt3764 = i_1;
        } else if (anInt3758 > 0) {
            OpenGL.glBindBufferARB(anInt3762, anInt3758);
            OpenGL.glBufferSubDataARBa(anInt3762, 0, anInt3763, source_2.method2());
            aGraphicalRenderer_Sub2_Sub1_3757.anInt8702 += i_1 - anInt3763;
        } else {
            aNativeHeapBuffer3765 = aGraphicalRenderer_Sub2_Sub1_3757.method13910(i_1, false);
            aNativeHeapBuffer3765.method1176(source_2);
        }

        anInt3763 = i_1;
        return true;
    }

    void method208(int i_1) {
        if (i_1 > anInt3764) {
            method5793();
            if (anInt3758 > 0) {
                OpenGL.glBindBufferARB(anInt3762, anInt3758);
                OpenGL.glBufferDataARBub(anInt3762, i_1, null, 0, aBool3761 ? 35040 : 35044);
                aGraphicalRenderer_Sub2_Sub1_3757.anInt8702 += i_1 - anInt3764;
            } else {
                aNativeHeapBuffer3765 = aGraphicalRenderer_Sub2_Sub1_3757.method13910(i_1, false);
            }

            anInt3764 = i_1;
        }

        anInt3763 = i_1;
    }

    @Override
    public int method36() {
        return anInt3763;
    }

}
