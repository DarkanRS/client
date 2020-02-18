package com.jagex;

import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class Class135 {

    static int[] anIntArray1626 = new int[1];
    boolean aBool1619;
    OpenGLHardwareRenderer aGraphicalRenderer_Sub1_1620;
    int anInt1621;
    int anInt1623;
    boolean aBool1624;
    int anInt1622;

    Class135(OpenGLHardwareRenderer class505_sub1_1, Buffer buffer_3, int i_4) {
        aGraphicalRenderer_Sub1_1620 = class505_sub1_1;
        anInt1621 = 34962;
        anInt1623 = i_4;
        aBool1624 = false;
        OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
        anInt1622 = anIntArray1626[0];
        method2341();
        OpenGL.glBufferDataARBa(34962, anInt1623, buffer_3.method2(), aBool1624 ? 35040 : 35044);
        aGraphicalRenderer_Sub1_1620.anInt8371 += anInt1623;
    }

    Class135(OpenGLHardwareRenderer class505_sub1_1, int i_2, byte[] bytes_3, int i_4, boolean bool_5) {
        aGraphicalRenderer_Sub1_1620 = class505_sub1_1;
        anInt1621 = i_2;
        anInt1623 = i_4;
        aBool1624 = bool_5;
        OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
        anInt1622 = anIntArray1626[0];
        method2341();
        OpenGL.glBufferDataARBub(i_2, anInt1623, bytes_3, 0, aBool1624 ? 35040 : 35044);
        aGraphicalRenderer_Sub1_1620.anInt8371 += anInt1623;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!aBool1619) {
            aGraphicalRenderer_Sub1_1620.method13657(anInt1622, anInt1623);
            aBool1619 = true;
        }

        super.finalize();
    }

    abstract void method2341();

    void method2342(byte[] bytes_1, int i_2) {
        method2341();
        if (i_2 > anInt1623) {
            OpenGL.glBufferDataARBub(anInt1621, i_2, bytes_1, 0, aBool1624 ? 35040 : 35044);
            aGraphicalRenderer_Sub1_1620.anInt8371 += i_2 - anInt1623;
            anInt1623 = i_2;
        } else {
            OpenGL.glBufferSubDataARBub(anInt1621, 0, i_2, bytes_1, 0);
        }

    }

    abstract void method2345();

    abstract void method2346();

}
