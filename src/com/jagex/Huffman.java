package com.jagex;

public class Huffman {

    int[] anIntArray1260;

    byte[] aByteArray1261;

    int[] anIntArray1262;

    public Huffman(byte[] bytes_1) {
        int i_2 = bytes_1.length;
        anIntArray1260 = new int[i_2];
        aByteArray1261 = bytes_1;
        int[] ints_3 = new int[33];
        anIntArray1262 = new int[8];
        int i_4 = 0;
        for (int i_5 = 0; i_5 < i_2; i_5++) {
            byte b_6 = bytes_1[i_5];
            if (b_6 != 0) {
                int i_7 = 1 << 32 - b_6;
                int i_8 = ints_3[b_6];
                anIntArray1260[i_5] = i_8;
                int i_9;
                int i_10;
                int i_11;
                int i_12;
                if ((i_8 & i_7) != 0) {
                    i_9 = ints_3[b_6 - 1];
                } else {
                    i_9 = i_8 | i_7;
                    for (i_10 = b_6 - 1; i_10 >= 1; --i_10) {
                        i_11 = ints_3[i_10];
                        if (i_11 != i_8) {
                            break;
                        }
                        i_12 = 1 << 32 - i_10;
                        if ((i_11 & i_12) != 0) {
                            ints_3[i_10] = ints_3[i_10 - 1];
                            break;
                        }
                        ints_3[i_10] = i_11 | i_12;
                    }
                }
                ints_3[b_6] = i_9;
                for (i_10 = b_6 + 1; i_10 <= 32; i_10++) {
                    if (i_8 == ints_3[i_10]) {
                        ints_3[i_10] = i_9;
                    }
                }
                i_10 = 0;
                for (i_11 = 0; i_11 < b_6; i_11++) {
                    i_12 = Integer.MIN_VALUE >>> i_11;
                    if ((i_8 & i_12) != 0) {
                        if (anIntArray1262[i_10] == 0) {
                            anIntArray1262[i_10] = i_4;
                        }
                        i_10 = anIntArray1262[i_10];
                    } else {
                        ++i_10;
                    }
                    if (i_10 >= anIntArray1262.length) {
                        int[] ints_13 = new int[anIntArray1262.length * 2];
                        System.arraycopy(anIntArray1262, 0, ints_13, 0, anIntArray1262.length);
                        anIntArray1262 = ints_13;
                    }
                    i_12 >>>= 1;
                }
                anIntArray1262[i_10] = ~i_5;
                if (i_10 >= i_4) {
                    i_4 = i_10 + 1;
                }
            }
        }
    }

    public static void playSoundJingle(int i_0, int i_2) {
        i_2 = i_2 * Class393.preferences.musicVolume.method12714() >> 8;
        if (i_2 != 0 && i_0 != -1) {
            if (!Class260.aBool3220 && Class260.anInt3223 != -1 && SongReference.method1966() && !ParticleArchive1Def.method6140()) {
                Class260.aNode_Sub15_Sub2_3231 = LocalizedText.method7272();
                VarBitIndexLoader.method3912();
                Node_Sub15_Sub2 class282_sub15_sub2_4 = Node_Sub20_Sub10.method15262(Class260.aNode_Sub15_Sub2_3231);
                Class42_Sub1.method14563(class282_sub15_sub2_4);
            }
            Class11.method13400(IndexLoaders.MUSIC2_INDEX, i_0, i_2);
            Class150.method2580(-1, 255);
            Class260.aBool3220 = true;
        }
    }

    static void method1982(int i_0) {
        Class13.anInt128 = i_0;
        LRUCache softcache_2 = Class13.aClass229_127;
        synchronized (Class13.aClass229_127) {
            Class13.aClass229_127.method3859();
        }
    }

    int method1971(byte[] bytes_1, int i_2, int i_3, byte[] bytes_4, int i_5) {
        int i_7 = 0;
        int i_8 = i_5 << 3;
        for (i_3 += i_2; i_2 < i_3; i_2++) {
            int i_9 = bytes_1[i_2] & 0xff;
            int i_10 = anIntArray1260[i_9];
            byte b_11 = aByteArray1261[i_9];
            if (b_11 == 0) {
                throw new RuntimeException("" + i_9);
            }
            int i_12 = i_8 >> 3;
            int i_13 = i_8 & 0x7;
            i_7 &= -i_13 >> 31;
            int i_14 = (i_13 + b_11 - 1 >> 3) + i_12;
            i_13 += 24;
            bytes_4[i_12] = (byte) (i_7 |= i_10 >>> i_13);
            if (i_12 < i_14) {
                ++i_12;
                i_13 -= 8;
                bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
                if (i_12 < i_14) {
                    ++i_12;
                    i_13 -= 8;
                    bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
                    if (i_12 < i_14) {
                        ++i_12;
                        i_13 -= 8;
                        bytes_4[i_12] = (byte) (i_7 = i_10 >>> i_13);
                        if (i_12 < i_14) {
                            ++i_12;
                            i_13 -= 8;
                            bytes_4[i_12] = (byte) (i_7 = i_10 << -i_13);
                        }
                    }
                }
            }
            i_8 += b_11;
        }
        return (i_8 + 7 >> 3) - i_5;
    }

    int method1973(byte[] bytes_1, int i_2, byte[] bytes_3, int i_4, int i_5) {
        if (i_5 == 0) {
            return 0;
        } else {
            int i_7 = 0;
            i_5 += i_4;
            int i_8 = i_2;
            while (true) {
                byte b_9 = bytes_1[i_8];
                if (b_9 < 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                int i_10;
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x40) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x20) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x10) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x8) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x4) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x2) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                if ((b_9 & 0x1) != 0) {
                    i_7 = anIntArray1262[i_7];
                } else {
                    ++i_7;
                }
                if ((i_10 = anIntArray1262[i_7]) < 0) {
                    bytes_3[i_4++] = (byte) (~i_10);
                    if (i_4 >= i_5) {
                        break;
                    }
                    i_7 = 0;
                }
                ++i_8;
            }
            return i_8 + 1 - i_2;
        }
    }
}
