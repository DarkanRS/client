package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

import java.nio.ByteBuffer;

public class Class70_Sub1 extends Class70 {

    long aLong9179 = 0L;
    GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_9178;

    Class70_Sub1(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class72[] arr_2) {
        super(arr_2);
        this.aGraphicalRenderer_Sub2_Sub2_9178 = class505_sub2_sub2_1;
        byte b_3 = 0;
        ByteBuffer bytebuffer_4 = this.aGraphicalRenderer_Sub2_Sub2_9178.aByteBuffer8838;
        bytebuffer_4.clear();

        for (short s_5 = 0; s_5 < this.aClass72Array707.length; s_5++) {
            short s_6 = 0;
            Class72 class72_7 = this.aClass72Array707[s_5];

            for (int i_8 = 0; i_8 < class72_7.method1296(); i_8++) {
                Class69 class69_9 = class72_7.method1297(i_8);
                if (class69_9 == Class69.aClass69_695) {
                    this.method14506(bytebuffer_4, s_5, s_6, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
                } else if (class69_9 == Class69.aClass69_689) {
                    this.method14506(bytebuffer_4, s_5, s_6, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
                } else if (class69_9 == Class69.aClass69_690) {
                    this.method14506(bytebuffer_4, s_5, s_6, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
                } else {
                    byte b_14;
                    byte b_15;
                    byte b_16;
                    byte b_17;
                    if (class69_9 == Class69.aClass69_691) {
                        b_14 = 0;
                        b_15 = 0;
                        b_16 = 5;
                        b_17 = b_3++;
                        this.method14506(bytebuffer_4, s_5, s_6, b_14, b_15, b_16, b_17);
                    } else if (class69_9 == Class69.aClass69_692) {
                        b_14 = 1;
                        b_15 = 0;
                        b_16 = 5;
                        b_17 = b_3++;
                        this.method14506(bytebuffer_4, s_5, s_6, b_14, b_15, b_16, b_17);
                    } else if (class69_9 == Class69.aClass69_693) {
                        b_14 = 2;
                        b_15 = 0;
                        b_16 = 5;
                        b_17 = b_3++;
                        this.method14506(bytebuffer_4, s_5, s_6, b_14, b_15, b_16, b_17);
                    } else if (class69_9 == Class69.aClass69_694) {
                        b_14 = 3;
                        b_15 = 0;
                        b_16 = 5;
                        b_17 = b_3++;
                        this.method14506(bytebuffer_4, s_5, s_6, b_14, b_15, b_16, b_17);
                    }
                }

                s_6 = (short) (s_6 + class69_9.anInt704);
            }
        }

        this.method14506(bytebuffer_4, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
        this.aLong9179 = IDirect3DDevice.CreateVertexDeclaration(this.aGraphicalRenderer_Sub2_Sub2_9178.aLong10252, this.aGraphicalRenderer_Sub2_Sub2_9178.aLong8695);
        this.aGraphicalRenderer_Sub2_Sub2_9178.method13901(this);
    }

    public void method26() {
        if (this.aLong9179 != 0L) {
            IUnknown.Release(this.aLong9179);
            this.aLong9179 = 0L;
        }

        this.aGraphicalRenderer_Sub2_Sub2_9178.method13885(this);
    }

    void method14505() {
        if (this.aLong9179 != 0L) {
            this.aGraphicalRenderer_Sub2_Sub2_9178.method15650(this.aLong9179);
            this.aLong9179 = 0L;
        }

    }

    public void finalize() {
        this.method14505();
    }

    void method14506(ByteBuffer bytebuffer_1, short s_2, short s_3, byte b_4, byte b_5, byte b_6, byte b_7) {
        bytebuffer_1.putShort(s_2);
        bytebuffer_1.putShort(s_3);
        bytebuffer_1.put(b_4);
        bytebuffer_1.put(b_5);
        bytebuffer_1.put(b_6);
        bytebuffer_1.put(b_7);
    }

    public void method32() {
        if (this.aLong9179 != 0L) {
            IUnknown.Release(this.aLong9179);
            this.aLong9179 = 0L;
        }

        this.aGraphicalRenderer_Sub2_Sub2_9178.method13885(this);
    }

}
