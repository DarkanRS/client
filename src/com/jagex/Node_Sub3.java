package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class Node_Sub3 extends Node {

    OpenGlArrayBufferPointer aClass143_7492;
    NativeHeapBuffer aNativeHeapBuffer7495;
    Stream aStream7489;
    OpenGLGround aGround_Sub2_7488;
    OpenGLHardwareRenderer aGraphicalRenderer_Sub1_7494;
    int anInt7493;
    float aFloat7490;
    HDWaterTile aClass90_7487;
    int[] anIntArray7496;
    Class131_Sub2 aClass131_Sub2_7491;

    Node_Sub3(OpenGLGround class390_sub2_1, int i_2, int i_3, HDWaterTile class90_4) {
        aGround_Sub2_7488 = class390_sub2_1;
        aGraphicalRenderer_Sub1_7494 = aGround_Sub2_7488.renderer;
        anInt7493 = i_2;
        aFloat7490 = i_3;
        aClass90_7487 = class90_4;
        anIntArray7496 = new int[aGround_Sub2_7488.width * aGround_Sub2_7488.length];
        aClass131_Sub2_7491 = new Class131_Sub2(aGraphicalRenderer_Sub1_7494, null, 1);
    }

    void method12081(int i_1) {
        aStream7489.method2919(i_1 * 4 + 3);
        aStream7489.method2920(-1);
    }

    void method12082(int i_1, int i_2, int i_3) {
        anIntArray7496[i_2 * aGround_Sub2_7488.width + i_1] |= 1 << i_3;
    }

    void method12083(int i_1, int i_2, int i_3, float f_4) {
        int i_21 = i_2;
        int i_6;
        int i_7;
        if (anInt7493 != -1) {
            TextureDetails class169_5 = aGraphicalRenderer_Sub1_7494.textureCache.getTextureDetails(anInt7493);
            i_6 = class169_5.shadowFactor & 0xff;
            int i_9;
            if (i_6 != 0 && class169_5.effectId != 4) {
                if (i_3 < 0) {
                    i_7 = 0;
                } else if (i_3 > 127) {
                    i_7 = 16777215;
                } else {
                    i_7 = i_3 * 131586;
                }

                if (i_6 == 256) {
                    i_21 = i_7;
                } else {
                    i_9 = 256 - i_6;
                    i_21 = ((i_7 & 0xff00ff) * i_6 + i_9 * (i_21 & 0xff00ff) & -16711936) + (i_9 * (i_21 & 0xff00) + i_6 * (i_7 & 0xff00) & 0xff0000) >> 8;
                }
            }

            i_7 = class169_5.brightness & 0xff;
            if (i_7 != 0) {
                i_7 += 256;
                int i_8 = ((i_21 & 0xff0000) >> 16) * i_7;
                if (i_8 > 65535) {
                    i_8 = 65535;
                }

                i_9 = ((i_21 & 0xff00) >> 8) * i_7;
                if (i_9 > 65535) {
                    i_9 = 65535;
                }

                int i_10 = i_7 * (i_21 & 0xff);
                if (i_10 > 65535) {
                    i_10 = 65535;
                }

                i_21 = (i_10 >> 8) + (i_9 & 0xff00) + (i_8 << 8 & 0xff0000);
            }
        }

        if (f_4 != 1.0F) {
            int i_11 = i_21 >> 16 & 0xff;
            i_6 = i_21 >> 8 & 0xff;
            i_7 = i_21 & 0xff;
            i_11 = (int) (i_11 * f_4);
            if (i_11 < 0) {
                i_11 = 0;
            } else if (i_11 > 255) {
                i_11 = 255;
            }

            i_6 = (int) (i_6 * f_4);
            if (i_6 < 0) {
                i_6 = 0;
            } else if (i_6 > 255) {
                i_6 = 255;
            }

            i_7 = (int) (i_7 * f_4);
            if (i_7 < 0) {
                i_7 = 0;
            } else if (i_7 > 255) {
                i_7 = 255;
            }

            i_21 = i_11 << 16 | i_6 << 8 | i_7;
        }

        aStream7489.method2919(i_1 * 4);
        aStream7489.method2920((byte) (i_21 >> 16));
        aStream7489.method2920((byte) (i_21 >> 8));
        aStream7489.method2920((byte) i_21);
    }

    void method12085(int[] ints_1, int i_2) {
        int i_3 = 0;
        Node_Sub35_Sub1 class282_sub35_sub1_4 = aGraphicalRenderer_Sub1_7494.aNode_Sub35_Sub1_8499;
        class282_sub35_sub1_4.index = 0;
        int i_5;
        int i_6;
        short[] shorts_7;
        int i_8;
        int i_9;
        int i_10;
        if (aGraphicalRenderer_Sub1_7494.aBool8467) {
            for (i_5 = 0; i_5 < i_2; i_5++) {
                i_6 = ints_1[i_5];
                shorts_7 = aGround_Sub2_7488.materialIndices[i_6];
                i_8 = anIntArray7496[i_6];
                if (i_8 != 0 && shorts_7 != null) {
                    i_9 = 0;
                    i_10 = 0;

                    while (i_10 < shorts_7.length) {
                        if ((i_8 & 1 << i_9++) != 0) {
                            class282_sub35_sub1_4.writeShort(shorts_7[i_10++] & 0xffff);
                            ++i_3;
                            class282_sub35_sub1_4.writeShort(shorts_7[i_10++] & 0xffff);
                            ++i_3;
                            class282_sub35_sub1_4.writeShort(shorts_7[i_10++] & 0xffff);
                            ++i_3;
                        } else {
                            i_10 += 3;
                        }
                    }
                }
            }
        } else {
            for (i_5 = 0; i_5 < i_2; i_5++) {
                i_6 = ints_1[i_5];
                shorts_7 = aGround_Sub2_7488.materialIndices[i_6];
                i_8 = anIntArray7496[i_6];
                if (i_8 != 0 && shorts_7 != null) {
                    i_9 = 0;
                    i_10 = 0;

                    while (i_10 < shorts_7.length) {
                        if ((i_8 & 1 << i_9++) != 0) {
                            class282_sub35_sub1_4.writeLEShort(shorts_7[i_10++] & 0xffff);
                            ++i_3;
                            class282_sub35_sub1_4.writeLEShort(shorts_7[i_10++] & 0xffff);
                            ++i_3;
                            class282_sub35_sub1_4.writeLEShort(shorts_7[i_10++] & 0xffff);
                            ++i_3;
                        } else {
                            i_10 += 3;
                        }
                    }
                }
            }
        }

        if (i_3 > 0) {
            aClass131_Sub2_7491.method111(class282_sub35_sub1_4.buffer, class282_sub35_sub1_4.index);
            aGraphicalRenderer_Sub1_7494.method13647(aGround_Sub2_7488.vertexPointer, aGround_Sub2_7488.normalPointer, aClass143_7492, aGround_Sub2_7488.texturePointer);
            aGraphicalRenderer_Sub1_7494.method13609(anInt7493, (aGround_Sub2_7488.flags & 0x7) != 0, (aGround_Sub2_7488.flags & 0x8) != 0);
            if (aGraphicalRenderer_Sub1_7494.aBool8448) {
                aGraphicalRenderer_Sub1_7494.method8476(Integer.MAX_VALUE, aClass90_7487);
            }

            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / aFloat7490, 1.0F / aFloat7490, 1.0F);
            OpenGL.glMatrixMode(5888);
            aGraphicalRenderer_Sub1_7494.method13647(aGround_Sub2_7488.vertexPointer, aGround_Sub2_7488.normalPointer, aClass143_7492, aGround_Sub2_7488.texturePointer);
            aGraphicalRenderer_Sub1_7494.method13611(aClass131_Sub2_7491, 0, i_3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }

    }

    void method12087(int i_1) {
        aStream7489.method2925();
        Interface14 interface14_2 = aGraphicalRenderer_Sub1_7494.createArrayBuffer(4, aNativeHeapBuffer7495, i_1 * 4);
        if (interface14_2 instanceof Class135_Sub2) {
            aNativeHeapBuffer7495.method1178();
        }

        aClass143_7492 = new OpenGlArrayBufferPointer(interface14_2, 5121, 4, 0);
        aNativeHeapBuffer7495 = null;
        aStream7489 = null;
    }

    void method12092(int i_1) {
        aNativeHeapBuffer7495 = aGraphicalRenderer_Sub1_7494.aNativeHeap8445.method759(i_1 * 4, true);
        aStream7489 = new Stream(aNativeHeapBuffer7495);
    }

}
