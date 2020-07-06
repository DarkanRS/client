package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

import java.nio.ByteBuffer;

public class Node_Sub6 extends Node {

    int anInt7508;
    int anInt7514;
    int anInt7519;
    int anInt7517;
    HardwareGround aGround_Sub1_7509;
    HardwareRenderer aGraphicalRenderer_Sub2_7518;
    int anInt7510;
    float aFloat7511;
    HDWaterTile hdWaterTile;
    int[] anIntArray7515;
    Interface4 anInterface4_7516;
    NativeHeapBuffer aNativeHeapBuffer7520;
    Stream aStream7513;

    Node_Sub6(HardwareGround class390_sub1_1, int i_2, int i_3, HDWaterTile class90_4) {
        aGround_Sub1_7509 = class390_sub1_1;
        aGraphicalRenderer_Sub2_7518 = aGround_Sub1_7509.aGraphicalRenderer_Sub2_8528;
        anInt7510 = i_2;
        aFloat7511 = i_3;
        hdWaterTile = class90_4;
        anIntArray7515 = new int[aGround_Sub1_7509.width * aGround_Sub1_7509.length];
        byte b_5 = 10;
        if (i_2 >= 0) {
            TextureDetails class169_6 = aGraphicalRenderer_Sub2_7518.textureCache.getTextureDetails(i_2);
            if (class169_6.effectId > 0) {
                b_5 = class169_6.effectId;
            }
        }

        aGraphicalRenderer_Sub2_7518.method13896(b_5);
        aGraphicalRenderer_Sub2_7518.method13896(3);
    }

    void method12143(int i_1) {
        aStream7513.method2919(i_1 * 4 + 3);
        aStream7513.method2920(-1);
    }

    void method12145(int i_1, int i_2, int i_3, float f_4) {
        int i_21 = i_2;
        int i_6;
        int i_7;
        if (anInt7510 != -1) {
            TextureDetails class169_5 = aGraphicalRenderer_Sub2_7518.textureCache.getTextureDetails(anInt7510);
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

        aStream7513.method2919(i_1 * 4);
        if (aGraphicalRenderer_Sub2_7518.anInt8824 == 0) {
            aStream7513.method2920((byte) i_21);
            aStream7513.method2920((byte) (i_21 >> 8));
            aStream7513.method2920((byte) (i_21 >> 16));
        } else {
            aStream7513.method2920((byte) (i_21 >> 16));
            aStream7513.method2920((byte) (i_21 >> 8));
            aStream7513.method2920((byte) i_21);
        }

    }

    void method12146(int i_1) {
        aStream7513.method2925();
        anInterface4_7516 = aGraphicalRenderer_Sub2_7518.method13994(false);
        anInterface4_7516.method27(i_1 * 4, 4, aNativeHeapBuffer7520);
        aNativeHeapBuffer7520 = null;
        aStream7513 = null;
    }

    void method12147(int[] ints_1, int i_2) {
        anInt7514 = 0;
        anInt7519 = 32767;
        anInt7517 = -32768;
        ByteBuffer bytebuffer_3 = aGraphicalRenderer_Sub2_7518.aByteBuffer8838;

        label49:
        for (int i_4 = 0; i_4 < i_2; i_4++) {
            int i_5 = ints_1[i_4];
            short[] shorts_6 = aGround_Sub1_7509.aShortArrayArray8534[i_5];
            int i_7 = anIntArray7515[i_5];
            if (i_7 != 0 && shorts_6 != null) {
                int i_8 = 0;
                int i_9 = 0;

                while (true) {
                    while (true) {
                        if (i_9 >= shorts_6.length) {
                            continue label49;
                        }

                        if ((i_7 & 1 << i_8++) != 0) {
                            for (int i_10 = 0; i_10 < 3; i_10++) {
                                int i_11 = shorts_6[i_9++] & 0xffff;
                                if (i_11 > anInt7517) {
                                    anInt7517 = i_11;
                                }

                                if (i_11 < anInt7519) {
                                    anInt7519 = i_11;
                                }

                                bytebuffer_3.putShort((short) i_11);
                            }

                            anInt7514 += 3;
                        } else {
                            i_9 += 3;
                        }
                    }
                }
            }
        }

    }

    void method12150(int i_1) {
        aNativeHeapBuffer7520 = aGraphicalRenderer_Sub2_7518.method13910(i_1 * 4, true);
        aStream7513 = new Stream(aNativeHeapBuffer7520, i_1 * 4);
    }

    void method12152(int i_1, int i_2, int i_3) {
        anIntArray7515[i_2 * aGround_Sub1_7509.width + i_1] |= 1 << i_3;
        ++anInt7508;
    }

}
