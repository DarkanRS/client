package com.jagex;

public class Node_Sub15_Sub2 extends AbstractSoundNode_0 {

    int anInt9719;
    boolean aBool9724;
    int volume = 256;
    int anInt9690 = 256;
    int anInt9695 = 1000000;
    int[] anIntArray9702 = new int[16];
    int[] anIntArray9711 = new int[16];
    int[] anIntArray9691 = new int[16];
    int[] anIntArray9697 = new int[16];
    int[] anIntArray9698 = new int[16];
    int[] anIntArray9699 = new int[16];
    int[] anIntArray9700 = new int[16];
    int[] anIntArray9701 = new int[16];
    int[] anIntArray9720 = new int[16];
    int[] anIntArray9703 = new int[16];
    int[] anIntArray9707 = new int[16];
    int[] anIntArray9708 = new int[16];
    int[] anIntArray9709 = new int[16];
    int[] anIntArray9704 = new int[16];
    int[] anIntArray9723 = new int[16];
    int[] anIntArray9712 = new int[16];
    Node_Sub13[][] aNode_Sub13ArrayArray9713 = new Node_Sub13[16][128];
    Node_Sub13[][] aNode_Sub13ArrayArray9714 = new Node_Sub13[16][128];
    Class80 aClass80_9715 = new Class80();
    Node_Sub15_Sub3 aNode_Sub15_Sub3_9721 = new Node_Sub15_Sub3(this);
    IterableNodeMap aClass465_9694;
    long aLong9710;
    Node_Sub7 aNode_Sub7_9722;
    int anInt9717;
    int anInt9696;
    long aLong9693;
    boolean aBool9716;

    public Node_Sub15_Sub2(Node_Sub15_Sub2 class282_sub15_sub2_1) {
        aClass465_9694 = class282_sub15_sub2_1.aClass465_9694;
        method15095(-1, 256);
        method15116(true);
    }

    public Node_Sub15_Sub2() {
        aClass465_9694 = new IterableNodeMap(128);
        method15095(-1, 256);
        method15116(true);
    }

    void method15091(int i_1, int i_2) {
        anIntArray9701[i_1] = i_2;
    }

    synchronized void method15094(int i_1) {
        anInt9690 = i_1;
    }

    synchronized void method15095(int i_1, int i_2) {
        if (i_1 < 0) {
            for (int i_4 = 0; i_4 < 16; i_4++) {
                anIntArray9702[i_4] = i_2;
            }
        } else {
            anIntArray9702[i_1] = i_2;
        }

    }

    @Override
    synchronized void method12230(int[] ints_1, int i_2, int i_3) {
        if (aClass80_9715.method1409()) {
            int i_4 = aClass80_9715.anInt785 * anInt9695 / Class253.hertz;

            do {
                long long_5 = (long) i_4 * i_3 + aLong9710;
                if (aLong9693 - long_5 >= 0L) {
                    aLong9710 = long_5;
                    break;
                }

                int i_7 = (int) ((aLong9693 - aLong9710 + i_4 - 1L) / i_4);
                aLong9710 += (long) i_7 * i_4;
                aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_7);
                i_2 += i_7;
                i_3 -= i_7;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_3);
    }

    synchronized void method15096() {
        for (Node_Sub14 class282_sub14_2 = (Node_Sub14) aClass465_9694.method7750(); class282_sub14_2 != null; class282_sub14_2 = (Node_Sub14) aClass465_9694.method7751()) {
            class282_sub14_2.method12217();
        }

    }

    synchronized void method15097() {
        for (Node_Sub14 class282_sub14_2 = (Node_Sub14) aClass465_9694.method7750(); class282_sub14_2 != null; class282_sub14_2 = (Node_Sub14) aClass465_9694.method7751()) {
            class282_sub14_2.unlink();
        }

    }

    synchronized void method15098(Node_Sub7 class282_sub7_1, boolean bool_2) {
        method15131(class282_sub7_1, bool_2, true);
    }

    void method15099(Node_Sub13 class282_sub13_1, boolean bool_2) {
        int i_4 = class282_sub13_1.aNode_WithAudioBuffer26_Sub1_7565.getAudioBufferLength();
        int i_5;
        if (bool_2 && class282_sub13_1.aNode_WithAudioBuffer26_Sub1_7565.aBoolNormFalse9752) {
            int i_6 = i_4 + i_4 - class282_sub13_1.aNode_WithAudioBuffer26_Sub1_7565.anInt9749;
            i_5 = (int) ((long) anIntArray9704[class282_sub13_1.anInt7582] * i_6 >> 6);
            i_4 <<= 8;
            if (i_5 >= i_4) {
                i_5 = i_4 + i_4 - 1 - i_5;
                class282_sub13_1.aSoundNode_1_7568.method15313();
            }
        } else {
            i_5 = (int) ((long) anIntArray9704[class282_sub13_1.anInt7582] * i_4 >> 6);
        }

        class282_sub13_1.aSoundNode_1_7568.method15317(i_5);
    }

    synchronized void method15100(Node_Sub7 class282_sub7_1, boolean bool_2, long long_4) {
        method15131(class282_sub7_1, bool_2, true);
        method15126(aClass80_9715.anInt785 * long_4);
    }

    synchronized void method15101() {
        method15102(true);
    }

    synchronized void method15102(boolean bool_1) {
        aClass80_9715.method1395();
        aNode_Sub7_9722 = null;
        method15116(bool_1);
    }

    synchronized boolean method15103() {
        return aClass80_9715.method1409();
    }

    void method15104(int i_1, int i_2) {
        anIntArray9723[i_1] = i_2;
        anIntArray9712[i_1] = (int) (2097152.0D * Math.pow(2.0D, i_2 * 5.4931640625E-4D) + 0.5D);
    }

    void method15105() {
        anIntArray9698[9] = 128;
        anIntArray9700[9] = 128;
        method15189(9, 128);
    }

    void method15107(int i_1, int i_2, int i_3) {
        method15109(i_1, i_2);
        if ((anIntArray9707[i_1] & 0x2) != 0) {
            for (Node_Sub13 class282_sub13_5 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.method8065(); class282_sub13_5 != null; class282_sub13_5 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.method8068()) {
                if (class282_sub13_5.anInt7582 == i_1 && class282_sub13_5.anInt7579 < 0) {
                    aNode_Sub13ArrayArray9713[i_1][class282_sub13_5.anInt7569] = null;
                    aNode_Sub13ArrayArray9713[i_1][i_2] = class282_sub13_5;
                    int i_9 = (class282_sub13_5.anInt7575 * class282_sub13_5.anInt7574 >> 12) + class282_sub13_5.anInt7573;
                    class282_sub13_5.anInt7573 += i_2 - class282_sub13_5.anInt7569 << 8;
                    class282_sub13_5.anInt7574 = i_9 - class282_sub13_5.anInt7573;
                    class282_sub13_5.anInt7575 = 4096;
                    class282_sub13_5.anInt7569 = i_2;
                    return;
                }
            }
        }

        Node_Sub14 class282_sub14_10 = (Node_Sub14) aClass465_9694.get(anIntArray9699[i_1]);
        if (class282_sub14_10 != null) {
            NodeWithAudioBuffer26_Sub1 class282_sub26_sub1_6 = class282_sub14_10.aNode_WithAudioBuffer26_Sub1Array7589[i_2];
            if (class282_sub26_sub1_6 != null) {
                Node_Sub13 class282_sub13_7 = new Node_Sub13();
                class282_sub13_7.anInt7582 = i_1;
                class282_sub13_7.aNode_Sub14_7566 = class282_sub14_10;
                class282_sub13_7.aNode_WithAudioBuffer26_Sub1_7565 = class282_sub26_sub1_6;
                class282_sub13_7.aClass110_7586 = class282_sub14_10.aClass110Array7594[i_2];
                class282_sub13_7.anInt7567 = class282_sub14_10.aByteArray7595[i_2];
                class282_sub13_7.anInt7569 = i_2;
                class282_sub13_7.anInt7570 = i_3 * i_3 * class282_sub14_10.aByteArray7592[i_2] * class282_sub14_10.anInt7593 + 1024 >> 11;
                class282_sub13_7.anInt7572 = class282_sub14_10.aByteArray7591[i_2] & 0xff;
                class282_sub13_7.anInt7573 = (i_2 << 8) - (class282_sub14_10.aShortArray7590[i_2] & 0x7fff);
                class282_sub13_7.anInt7576 = 0;
                class282_sub13_7.anInt7577 = 0;
                class282_sub13_7.anInt7578 = 0;
                class282_sub13_7.anInt7579 = -1;
                class282_sub13_7.anInt7580 = 0;
                if (anIntArray9704[i_1] == 0) {
                    class282_sub13_7.aSoundNode_1_7568 = class282_sub26_sub1_6.getHeadSoundNode_4(method15120(class282_sub13_7), method15108(class282_sub13_7), method15122(class282_sub13_7));
                } else {
                    class282_sub13_7.aSoundNode_1_7568 = class282_sub26_sub1_6.getHeadSoundNode_4(method15120(class282_sub13_7), 0, method15122(class282_sub13_7));
                    method15099(class282_sub13_7, class282_sub14_10.aShortArray7590[i_2] < 0);
                }

                if (class282_sub14_10.aShortArray7590[i_2] < 0) {
                    class282_sub13_7.aSoundNode_1_7568.method15325(-1);
                }

                if (class282_sub13_7.anInt7567 >= 0) {
                    Node_Sub13 class282_sub13_8 = aNode_Sub13ArrayArray9714[i_1][class282_sub13_7.anInt7567];
                    if (class282_sub13_8 != null && class282_sub13_8.anInt7579 < 0) {
                        aNode_Sub13ArrayArray9713[i_1][class282_sub13_8.anInt7569] = null;
                        class282_sub13_8.anInt7579 = 0;
                    }

                    aNode_Sub13ArrayArray9714[i_1][class282_sub13_7.anInt7567] = class282_sub13_7;
                }

                aNode_Sub15_Sub3_9721.aClass482_9754.append(class282_sub13_7);
                aNode_Sub13ArrayArray9713[i_1][i_2] = class282_sub13_7;
            }
        }

    }

    int method15108(Node_Sub13 class282_sub13_1) {
        if (anIntArray9702[class282_sub13_1.anInt7582] == 0) {
            return 0;
        } else {
            Class110 class110_3 = class282_sub13_1.aClass110_7586;
            int i_4 = anIntArray9697[class282_sub13_1.anInt7582] * anIntArray9711[class282_sub13_1.anInt7582] + 4096 >> 13;
            i_4 = i_4 * i_4 + 16384 >> 15;
            i_4 = i_4 * class282_sub13_1.anInt7570 + 16384 >> 15;
            i_4 = i_4 * volume + 128 >> 8;
            i_4 = i_4 * anInt9690 >> 8;
            i_4 = i_4 * anIntArray9702[class282_sub13_1.anInt7582] + 128 >> 8;
            if (class110_3.anInt1096 > 0) {
                i_4 = (int) (i_4 * Math.pow(0.5D, class282_sub13_1.anInt7576 * 1.953125E-5D * class110_3.anInt1096) + 0.5D);
            }

            int i_5;
            int i_6;
            int i_7;
            int i_8;
            if (class110_3.aByteArray1097 != null) {
                i_5 = class282_sub13_1.anInt7577;
                i_6 = class110_3.aByteArray1097[class282_sub13_1.anInt7578 + 1];
                if (class282_sub13_1.anInt7578 < class110_3.aByteArray1097.length - 2) {
                    i_7 = (class110_3.aByteArray1097[class282_sub13_1.anInt7578] & 0xff) << 8;
                    i_8 = (class110_3.aByteArray1097[class282_sub13_1.anInt7578 + 2] & 0xff) << 8;
                    i_6 += (i_5 - i_7) * (class110_3.aByteArray1097[class282_sub13_1.anInt7578 + 3] - i_6) / (i_8 - i_7);
                }

                i_4 = i_4 * i_6 + 32 >> 6;
            }

            if (class282_sub13_1.anInt7579 > 0 && class110_3.aByteArray1094 != null) {
                i_5 = class282_sub13_1.anInt7579;
                i_6 = class110_3.aByteArray1094[class282_sub13_1.anInt7580 + 1];
                if (class282_sub13_1.anInt7580 < class110_3.aByteArray1094.length - 2) {
                    i_7 = (class110_3.aByteArray1094[class282_sub13_1.anInt7580] & 0xff) << 8;
                    i_8 = (class110_3.aByteArray1094[class282_sub13_1.anInt7580 + 2] & 0xff) << 8;
                    i_6 += (class110_3.aByteArray1094[class282_sub13_1.anInt7580 + 3] - i_6) * (i_5 - i_7) / (i_8 - i_7);
                }

                i_4 = i_6 * i_4 + 32 >> 6;
            }

            return i_4;
        }
    }

    void method15109(int i_1, int i_2) {
        Node_Sub13 class282_sub13_5 = aNode_Sub13ArrayArray9713[i_1][i_2];
        if (class282_sub13_5 != null) {
            aNode_Sub13ArrayArray9713[i_1][i_2] = null;
            if ((anIntArray9707[i_1] & 0x2) != 0) {
                for (Node_Sub13 class282_sub13_6 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.head(); class282_sub13_6 != null; class282_sub13_6 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.next()) {
                    if (class282_sub13_5.anInt7582 == class282_sub13_6.anInt7582 && class282_sub13_6.anInt7579 < 0 && class282_sub13_6 != class282_sub13_5) {
                        class282_sub13_5.anInt7579 = 0;
                        break;
                    }
                }
            } else {
                class282_sub13_5.anInt7579 = 0;
            }
        }

    }

    void method15111(int i_1) {
        for (Node_Sub13 class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.head(); class282_sub13_3 != null; class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.next()) {
            if (i_1 < 0 || class282_sub13_3.anInt7582 == i_1) {
                if (class282_sub13_3.aSoundNode_1_7568 != null) {
                    class282_sub13_3.aSoundNode_1_7568.method15322(Class253.hertz / 100);
                    if (class282_sub13_3.aSoundNode_1_7568.method15311()) {
                        aNode_Sub15_Sub3_9721.aNode_Sub15_Sub4_9755.method15275(class282_sub13_3.aSoundNode_1_7568);
                    }

                    class282_sub13_3.method12213();
                }

                if (class282_sub13_3.anInt7579 < 0) {
                    aNode_Sub13ArrayArray9713[class282_sub13_3.anInt7582][class282_sub13_3.anInt7569] = null;
                }

                class282_sub13_3.unlink();
            }
        }

    }

    void method15114(int i_1) {
        int i_11 = i_1;
        if (i_11 < 0) {
            for (i_11 = 0; i_11 < 16; i_11++) {
                method15114(i_11);
            }
        } else {
            anIntArray9711[i_11] = 12800;
            anIntArray9691[i_11] = 8192;
            anIntArray9697[i_11] = 16383;
            anIntArray9701[i_11] = 8192;
            anIntArray9720[i_11] = 0;
            anIntArray9703[i_11] = 8192;
            method15117(i_11);
            method15118(i_11, (byte) 41);
            anIntArray9707[i_11] = 0;
            anIntArray9708[i_11] = 32767;
            anIntArray9709[i_11] = 256;
            anIntArray9704[i_11] = 0;
            method15104(i_11, 8192);
        }

    }

    boolean method15115(Node_Sub13 class282_sub13_1) {
        if (class282_sub13_1.aSoundNode_1_7568 == null) {
            if (class282_sub13_1.anInt7579 >= 0) {
                class282_sub13_1.unlink();
                if (class282_sub13_1.anInt7567 > 0 && class282_sub13_1 == aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567]) {
                    aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567] = null;
                }
            }

            return true;
        } else {
            return false;
        }
    }

    void method15116(boolean bool_1) {
        if (bool_1) {
            method15111(-1);
        } else {
            method15192(-1);
        }

        method15114(-1);

        int i_3;
        for (i_3 = 0; i_3 < 16; i_3++) {
            anIntArray9699[i_3] = anIntArray9698[i_3];
        }

        for (i_3 = 0; i_3 < 16; i_3++) {
            anIntArray9700[i_3] = anIntArray9698[i_3] & -128;
        }

    }

    void method15117(int i_1) {
        if ((anIntArray9707[i_1] & 0x2) != 0) {
            for (Node_Sub13 class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.head(); class282_sub13_3 != null; class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.next()) {
                if (class282_sub13_3.anInt7582 == i_1 && aNode_Sub13ArrayArray9713[i_1][class282_sub13_3.anInt7569] == null && class282_sub13_3.anInt7579 < 0) {
                    class282_sub13_3.anInt7579 = 0;
                }
            }
        }

    }

    void method15118(int i_1, byte b_2) {
        if ((anIntArray9707[i_1] & 0x4) != 0 && b_2 > 1) {
            for (Node_Sub13 class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.head(); class282_sub13_3 != null && b_2 > 1; class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.next()) {
                if (class282_sub13_3.anInt7582 == i_1) {
                    if (b_2 <= 1) {
                        break;
                    }

                    class282_sub13_3.anInt7583 = 0;
                }
            }
        }

    }

    void method15119(int i_1) {
        int i_3 = i_1 & 0xf0;
        int i_4;
        int i_5;
        int i_6;
        if (i_3 == 128) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            method15109(i_4, i_5);
        } else if (i_3 == 144) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            if (i_6 > 0) {
                method15107(i_4, i_5, i_6);
            } else {
                method15109(i_4, i_5);
            }
        } else if (i_3 == 160) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            method15188();
        } else if (i_3 == 176) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            i_6 = i_1 >> 16 & 0x7f;
            if (i_5 == 0) {
                anIntArray9700[i_4] = (i_6 << 14) + (anIntArray9700[i_4] & -2080769);
            }

            if (i_5 == 32) {
                anIntArray9700[i_4] = (i_6 << 7) + (anIntArray9700[i_4] & -16257);
            }

            if (i_5 == 1) {
                anIntArray9720[i_4] = (i_6 << 7) + (anIntArray9720[i_4] & -16257);
            }

            if (i_5 == 33) {
                anIntArray9720[i_4] = i_6 + (anIntArray9720[i_4] & -128);
            }

            if (i_5 == 5) {
                anIntArray9703[i_4] = (i_6 << 7) + (anIntArray9703[i_4] & -16257);
            }

            if (i_5 == 37) {
                anIntArray9703[i_4] = i_6 + (anIntArray9703[i_4] & -128);
            }

            if (i_5 == 7) {
                anIntArray9711[i_4] = (i_6 << 7) + (anIntArray9711[i_4] & -16257);
            }

            if (i_5 == 39) {
                anIntArray9711[i_4] = i_6 + (anIntArray9711[i_4] & -128);
            }

            if (i_5 == 10) {
                anIntArray9691[i_4] = (i_6 << 7) + (anIntArray9691[i_4] & -16257);
            }

            if (i_5 == 42) {
                anIntArray9691[i_4] = i_6 + (anIntArray9691[i_4] & -128);
            }

            if (i_5 == 11) {
                anIntArray9697[i_4] = (i_6 << 7) + (anIntArray9697[i_4] & -16257);
            }

            if (i_5 == 43) {
                anIntArray9697[i_4] = i_6 + (anIntArray9697[i_4] & -128);
            }

            if (i_5 == 64) {
                if (i_6 >= 64) {
                    anIntArray9707[i_4] |= 0x1;
                } else {
                    anIntArray9707[i_4] &= -2;
                }
            }

            if (i_5 == 65) {
                if (i_6 >= 64) {
                    anIntArray9707[i_4] |= 0x2;
                } else {
                    method15117(i_4);
                    anIntArray9707[i_4] &= -3;
                }
            }

            if (i_5 == 99) {
                anIntArray9708[i_4] = (i_6 << 7) + (anIntArray9708[i_4] & 0x7f);
            }

            if (i_5 == 98) {
                anIntArray9708[i_4] = (anIntArray9708[i_4] & 0x3f80) + i_6;
            }

            if (i_5 == 101) {
                anIntArray9708[i_4] = (i_6 << 7) + (anIntArray9708[i_4] & 0x7f) + 16384;
            }

            if (i_5 == 100) {
                anIntArray9708[i_4] = (anIntArray9708[i_4] & 0x3f80) + i_6 + 16384;
            }

            if (i_5 == 120) {
                method15111(i_4);
            }

            if (i_5 == 121) {
                method15114(i_4);
            }

            if (i_5 == 123) {
                method15192(i_4);
            }

            int i_7;
            if (i_5 == 6) {
                i_7 = anIntArray9708[i_4];
                if (i_7 == 16384) {
                    anIntArray9709[i_4] = (i_6 << 7) + (anIntArray9709[i_4] & -16257);
                }
            }

            if (i_5 == 38) {
                i_7 = anIntArray9708[i_4];
                if (i_7 == 16384) {
                    anIntArray9709[i_4] = i_6 + (anIntArray9709[i_4] & -128);
                }
            }

            if (i_5 == 16) {
                anIntArray9704[i_4] = (i_6 << 7) + (anIntArray9704[i_4] & -16257);
            }

            if (i_5 == 48) {
                anIntArray9704[i_4] = i_6 + (anIntArray9704[i_4] & -128);
            }

            if (i_5 == 81) {
                if (i_6 >= 64) {
                    anIntArray9707[i_4] |= 0x4;
                } else {
                    method15118(i_4, (byte) 97);
                    anIntArray9707[i_4] &= -5;
                }
            }

            if (i_5 == 17) {
                method15104(i_4, (i_6 << 7) + (anIntArray9723[i_4] & -16257));
            }

            if (i_5 == 49) {
                method15104(i_4, i_6 + (anIntArray9723[i_4] & -128));
            }
        } else if (i_3 == 192) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            method15189(i_4, i_5 + anIntArray9700[i_4]);
        } else if (i_3 == 208) {
            i_4 = i_1 & 0xf;
            i_5 = i_1 >> 8 & 0x7f;
            method15121();
        } else if (i_3 == 224) {
            i_4 = i_1 & 0xf;
            i_5 = (i_1 >> 8 & 0x7f) + (i_1 >> 9 & 0x3f80);
            method15091(i_4, i_5);
        } else {
            i_3 = i_1 & 0xff;
            if (i_3 == 255) {
                method15116(true);
            }
        }

    }

    int method15120(Node_Sub13 class282_sub13_1) {
        int i_3 = (class282_sub13_1.anInt7574 * class282_sub13_1.anInt7575 >> 12) + class282_sub13_1.anInt7573;
        i_3 += (anIntArray9701[class282_sub13_1.anInt7582] - 8192) * anIntArray9709[class282_sub13_1.anInt7582] >> 12;
        Class110 class110_4 = class282_sub13_1.aClass110_7586;
        int i_5;
        if (class110_4.anInt1101 > 0 && (class110_4.anInt1100 > 0 || anIntArray9720[class282_sub13_1.anInt7582] > 0)) {
            i_5 = class110_4.anInt1100 << 2;
            int i_6 = class110_4.anInt1102 << 1;
            if (class282_sub13_1.anInt7581 < i_6) {
                i_5 = i_5 * class282_sub13_1.anInt7581 / i_6;
            }

            i_5 += anIntArray9720[class282_sub13_1.anInt7582] >> 7;
            double d_7 = Math.sin(0.01227184630308513D * (class282_sub13_1.anInt7571 & 0x1ff));
            i_3 += (int) (d_7 * i_5);
        }

        i_5 = (int) ((class282_sub13_1.aNode_WithAudioBuffer26_Sub1_7565.hertz * 256) * Math.pow(2.0D, 3.255208333333333E-4D * i_3) / Class253.hertz + 0.5D);
        return Math.max(1, i_5);
    }

    void method15121() {
    }

    int method15122(Node_Sub13 class282_sub13_1) {
        int i_3 = anIntArray9691[class282_sub13_1.anInt7582];
        return i_3 < 8192 ? i_3 * class282_sub13_1.anInt7572 + 32 >> 6 : 16384 - ((128 - class282_sub13_1.anInt7572) * (16384 - i_3) + 32 >> 6);
    }

    @Override
    synchronized AbstractSoundNode_0 method12226() {
        return aNode_Sub15_Sub3_9721;
    }

    int method15123() {
        return volume;
    }

    @Override
    synchronized void method12231(int i_1) {
        if (aClass80_9715.method1409()) {
            int i_2 = aClass80_9715.anInt785 * anInt9695 / Class253.hertz;

            do {
                long long_3 = (long) i_1 * i_2 + aLong9710;
                if (aLong9693 - long_3 >= 0L) {
                    aLong9710 = long_3;
                    break;
                }

                int i_5 = (int) ((aLong9693 - aLong9710 + i_2 - 1L) / i_2);
                aLong9710 += (long) i_2 * i_5;
                aNode_Sub15_Sub3_9721.method12231(i_5);
                i_1 -= i_5;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12231(i_1);
    }

    void method15126(long long_1) {
        while (aLong9693 <= long_1) {
            int i_5 = anInt9717;
            int i_6 = anInt9696;

            long long_3;
            for (long_3 = aLong9693; i_6 == anInt9696; long_3 = aClass80_9715.method1403(i_6)) {
                while (i_6 == aClass80_9715.anIntArray788[i_5]) {
                    aClass80_9715.method1398(i_5);
                    int i_7 = aClass80_9715.method1401(i_5);
                    if (i_7 == 1) {
                        aClass80_9715.method1400();
                        aClass80_9715.method1404(i_5);
                        if (aClass80_9715.method1405()) {
                            if (!aBool9716 || i_6 == 0) {
                                method15116(true);
                                aClass80_9715.method1395();
                                return;
                            }

                            aClass80_9715.method1406(long_3);
                        }
                        break;
                    }

                    if ((i_7 & 0x80) != 0 && (i_7 & 0xf0) != 144) {
                        method15119(i_7);
                    }

                    aClass80_9715.method1392(i_5);
                    aClass80_9715.method1404(i_5);
                }

                aLong9710 = long_3;
                i_5 = aClass80_9715.method1393();
                i_6 = aClass80_9715.anIntArray788[i_5];
            }

            anInt9717 = i_5;
            anInt9696 = i_6;
            aLong9693 = long_3;
        }

    }

    void method15127() {
        int i_2 = anInt9717;
        int i_3 = anInt9696;
        long long_4 = aLong9693;
        if (aNode_Sub7_9722 != null && i_3 == anInt9719) {
            method15131(aNode_Sub7_9722, aBool9716, aBool9724);
            method15127();
        } else {
            while (true) {
                if (i_3 != anInt9696) {
                    anInt9717 = i_2;
                    anInt9696 = i_3;
                    aLong9693 = long_4;
                    if (aNode_Sub7_9722 != null && anInt9719 < i_3) {
                        anInt9717 = -1;
                        anInt9696 = anInt9719;
                        aLong9693 = aClass80_9715.method1403(anInt9696);
                    }
                    break;
                }

                while (i_3 == aClass80_9715.anIntArray788[i_2]) {
                    aClass80_9715.method1398(i_2);
                    int i_6 = aClass80_9715.method1401(i_2);
                    if (i_6 == 1) {
                        aClass80_9715.method1400();
                        aClass80_9715.method1404(i_2);
                        if (aClass80_9715.method1405()) {
                            if (aNode_Sub7_9722 != null) {
                                method15098(aNode_Sub7_9722, aBool9716);
                                method15127();
                                return;
                            }

                            if (!aBool9716 || i_3 == 0) {
                                method15116(true);
                                aClass80_9715.method1395();
                                return;
                            }

                            aClass80_9715.method1406(long_4);
                        }
                        break;
                    }

                    if ((i_6 & 0x80) != 0) {
                        method15119(i_6);
                    }

                    aClass80_9715.method1392(i_2);
                    aClass80_9715.method1404(i_2);
                }

                i_2 = aClass80_9715.method1393();
                i_3 = aClass80_9715.anIntArray788[i_2];
                long_4 = aClass80_9715.method1403(i_3);
            }
        }

    }

    @Override
    synchronized int method12228() {
        return 0;
    }

    boolean method15128(Node_Sub13 class282_sub13_1, int[] ints_2, int i_3, int i_4) {
        class282_sub13_1.anInt7584 = Class253.hertz / 100;
        if (class282_sub13_1.anInt7579 < 0 || class282_sub13_1.aSoundNode_1_7568 != null && !class282_sub13_1.aSoundNode_1_7568.method15319()) {
            int i_6 = class282_sub13_1.anInt7575;
            if (i_6 > 0) {
                i_6 -= (int) (16.0D * Math.pow(2.0D, anIntArray9703[class282_sub13_1.anInt7582] * 4.921259842519685E-4D) + 0.5D);
                if (i_6 < 0) {
                    i_6 = 0;
                }

                class282_sub13_1.anInt7575 = i_6;
            }

            class282_sub13_1.aSoundNode_1_7568.method15308(method15120(class282_sub13_1));
            Class110 class110_7 = class282_sub13_1.aClass110_7586;
            boolean bool_8 = false;
            ++class282_sub13_1.anInt7581;
            class282_sub13_1.anInt7571 += class110_7.anInt1101;
            double d_9 = 5.086263020833333E-6D * ((class282_sub13_1.anInt7569 - 60 << 8) + (class282_sub13_1.anInt7574 * class282_sub13_1.anInt7575 >> 12));
            if (class110_7.anInt1096 > 0) {
                if (class110_7.anInt1099 > 0) {
                    class282_sub13_1.anInt7576 += (int) (128.0D * Math.pow(2.0D, d_9 * class110_7.anInt1099) + 0.5D);
                } else {
                    class282_sub13_1.anInt7576 += 128;
                }

                if (class110_7.anInt1096 * class282_sub13_1.anInt7576 >= 819200) {
                    bool_8 = true;
                }
            }

            if (class110_7.aByteArray1097 != null) {
                if (class110_7.anInt1095 > 0) {
                    class282_sub13_1.anInt7577 += (int) (128.0D * Math.pow(2.0D, d_9 * class110_7.anInt1095) + 0.5D);
                } else {
                    class282_sub13_1.anInt7577 += 128;
                }

                while (class282_sub13_1.anInt7578 < class110_7.aByteArray1097.length - 2 && class282_sub13_1.anInt7577 > (class110_7.aByteArray1097[class282_sub13_1.anInt7578 + 2] & 0xff) << 8) {
                    class282_sub13_1.anInt7578 += 2;
                }

                if (class110_7.aByteArray1097.length - 2 == class282_sub13_1.anInt7578 && class110_7.aByteArray1097[class282_sub13_1.anInt7578 + 1] == 0) {
                    bool_8 = true;
                }
            }

            if (class282_sub13_1.anInt7579 >= 0 && class110_7.aByteArray1094 != null && (anIntArray9707[class282_sub13_1.anInt7582] & 0x1) == 0 && (class282_sub13_1.anInt7567 < 0 || class282_sub13_1 != aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567])) {
                if (class110_7.anInt1098 > 0) {
                    class282_sub13_1.anInt7579 += (int) (128.0D * Math.pow(2.0D, d_9 * class110_7.anInt1098) + 0.5D);
                } else {
                    class282_sub13_1.anInt7579 += 128;
                }

                while (class282_sub13_1.anInt7580 < class110_7.aByteArray1094.length - 2 && class282_sub13_1.anInt7579 > (class110_7.aByteArray1094[class282_sub13_1.anInt7580 + 2] & 0xff) << 8) {
                    class282_sub13_1.anInt7580 += 2;
                }

                if (class110_7.aByteArray1094.length - 2 == class282_sub13_1.anInt7580) {
                    bool_8 = true;
                }
            }

            if (bool_8) {
                class282_sub13_1.aSoundNode_1_7568.method15322(class282_sub13_1.anInt7584);
                if (ints_2 != null) {
                    class282_sub13_1.aSoundNode_1_7568.method12230(ints_2, i_3, i_4);
                } else {
                    class282_sub13_1.aSoundNode_1_7568.method12231(i_4);
                }

                if (class282_sub13_1.aSoundNode_1_7568.method15311()) {
                    aNode_Sub15_Sub3_9721.aNode_Sub15_Sub4_9755.method15275(class282_sub13_1.aSoundNode_1_7568);
                }

                class282_sub13_1.method12213();
                if (class282_sub13_1.anInt7579 >= 0) {
                    class282_sub13_1.unlink();
                    if (class282_sub13_1.anInt7567 > 0 && class282_sub13_1 == aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567]) {
                        aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567] = null;
                    }
                }

                return true;
            } else {
                class282_sub13_1.aSoundNode_1_7568.method15321(class282_sub13_1.anInt7584, method15108(class282_sub13_1), method15122(class282_sub13_1));
                return false;
            }
        } else {
            class282_sub13_1.method12213();
            class282_sub13_1.unlink();
            if (class282_sub13_1.anInt7567 > 0 && class282_sub13_1 == aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567]) {
                aNode_Sub13ArrayArray9714[class282_sub13_1.anInt7582][class282_sub13_1.anInt7567] = null;
            }

            return true;
        }
    }

    @Override
    synchronized AbstractSoundNode_0 method12233() {
        return aNode_Sub15_Sub3_9721;
    }

    @Override
    synchronized AbstractSoundNode_0 method12229() {
        return null;
    }

    @Override
    synchronized AbstractSoundNode_0 method12235() {
        return null;
    }

    @Override
    synchronized AbstractSoundNode_0 method12236() {
        return null;
    }

    @Override
    synchronized int method12227() {
        return 0;
    }

    @Override
    synchronized int method12224() {
        return 0;
    }

    @Override
    synchronized int method12238() {
        return 0;
    }

    @Override
    synchronized void method12240(int[] ints_1, int i_2, int i_3) {
        if (aClass80_9715.method1409()) {
            int i_4 = anInt9695 * 260425001 * -33380583 * aClass80_9715.anInt785 / Class253.hertz;

            do {
                long long_5 = (long) i_4 * i_3 + 5773041712000823651L * aLong9710 * 8282832003758463051L;
                if (aLong9693 * 7131548477904339833L * 6737959858605438665L - long_5 >= 0L) {
                    aLong9710 = long_5 * 8282832003758463051L * 5773041712000823651L;
                    break;
                }

                int i_7 = (int) ((aLong9693 * 7131548477904339833L * 6737959858605438665L - 5773041712000823651L * aLong9710 * 8282832003758463051L + i_4 - 1L) / i_4);
                aLong9710 = (aLong9710 * 8282832003758463051L + 8282832003758463051L * i_7 * i_4) * 5773041712000823651L;
                aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_7);
                i_2 += i_7;
                i_3 -= i_7;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_3);
    }

    synchronized void method15131(Node_Sub7 class282_sub7_1, boolean bool_2, boolean bool_3) {
        method15102(bool_3);
        aClass80_9715.method1394(class282_sub7_1.aByteArray7522);
        aBool9716 = bool_2;
        aLong9710 = 0L;
        int i_5 = aClass80_9715.method1397();

        for (int i_6 = 0; i_6 < i_5; i_6++) {
            aClass80_9715.method1398(i_6);
            aClass80_9715.method1392(i_6);
            aClass80_9715.method1404(i_6);
        }

        anInt9717 = aClass80_9715.method1393();
        anInt9696 = aClass80_9715.anIntArray788[anInt9717];
        aLong9693 = aClass80_9715.method1403(anInt9696);
    }

    @Override
    synchronized void method12243(int i_1) {
        if (aClass80_9715.method1409()) {
            int i_2 = -33380583 * anInt9695 * 260425001 * aClass80_9715.anInt785 / Class253.hertz;

            do {
                long long_3 = (long) i_1 * i_2 + 5773041712000823651L * aLong9710 * 8282832003758463051L;
                if (aLong9693 * 7131548477904339833L * 6737959858605438665L - long_3 >= 0L) {
                    aLong9710 = long_3 * 8282832003758463051L * 5773041712000823651L;
                    break;
                }

                int i_5 = (int) ((6737959858605438665L * aLong9693 * 7131548477904339833L - 5773041712000823651L * aLong9710 * 8282832003758463051L + i_2 - 1L) / i_2);
                aLong9710 = (aLong9710 * 8282832003758463051L + 8282832003758463051L * i_2 * i_5) * 5773041712000823651L;
                aNode_Sub15_Sub3_9721.method12231(i_5);
                i_1 -= i_5;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12231(i_1);
    }

    @Override
    synchronized void method12234(int i_1) {
        if (aClass80_9715.method1409()) {
            int i_2 = -33380583 * anInt9695 * 260425001 * aClass80_9715.anInt785 / Class253.hertz;

            do {
                long long_3 = (long) i_1 * i_2 + 5773041712000823651L * aLong9710 * 8282832003758463051L;
                if (aLong9693 * 7131548477904339833L * 6737959858605438665L - long_3 >= 0L) {
                    aLong9710 = long_3 * 8282832003758463051L * 5773041712000823651L;
                    break;
                }

                int i_5 = (int) ((6737959858605438665L * aLong9693 * 7131548477904339833L - 5773041712000823651L * aLong9710 * 8282832003758463051L + i_2 - 1L) / i_2);
                aLong9710 = (aLong9710 * 8282832003758463051L + 8282832003758463051L * i_2 * i_5) * 5773041712000823651L;
                aNode_Sub15_Sub3_9721.method12231(i_5);
                i_1 -= i_5;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12231(i_1);
    }

    public synchronized void method15137() {
        method15105();
    }

    synchronized void setVolume(int i_1) {
        volume = i_1;
    }

    @Override
    synchronized AbstractSoundNode_0 method12239() {
        return null;
    }

    @Override
    synchronized void method12241(int[] ints_1, int i_2, int i_3) {
        if (aClass80_9715.method1409()) {
            int i_4 = anInt9695 * 260425001 * -33380583 * aClass80_9715.anInt785 / Class253.hertz;

            do {
                long long_5 = (long) i_4 * i_3 + 5773041712000823651L * aLong9710 * 8282832003758463051L;
                if (aLong9693 * 7131548477904339833L * 6737959858605438665L - long_5 >= 0L) {
                    aLong9710 = long_5 * 8282832003758463051L * 5773041712000823651L;
                    break;
                }

                int i_7 = (int) ((aLong9693 * 7131548477904339833L * 6737959858605438665L - 5773041712000823651L * aLong9710 * 8282832003758463051L + i_4 - 1L) / i_4);
                aLong9710 = (aLong9710 * 8282832003758463051L + 8282832003758463051L * i_7 * i_4) * 5773041712000823651L;
                aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_7);
                i_2 += i_7;
                i_3 -= i_7;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_3);
    }

    @Override
    synchronized int method12244() {
        return 0;
    }

    @Override
    synchronized AbstractSoundNode_0 method12232() {
        return aNode_Sub15_Sub3_9721;
    }

    @Override
    synchronized void method12242(int[] ints_1, int i_2, int i_3) {
        if (aClass80_9715.method1409()) {
            int i_4 = anInt9695 * 260425001 * -33380583 * aClass80_9715.anInt785 / Class253.hertz;

            do {
                long long_5 = (long) i_4 * i_3 + 5773041712000823651L * aLong9710 * 8282832003758463051L;
                if (aLong9693 * 7131548477904339833L * 6737959858605438665L - long_5 >= 0L) {
                    aLong9710 = long_5 * 8282832003758463051L * 5773041712000823651L;
                    break;
                }

                int i_7 = (int) ((aLong9693 * 7131548477904339833L * 6737959858605438665L - 5773041712000823651L * aLong9710 * 8282832003758463051L + i_4 - 1L) / i_4);
                aLong9710 = (aLong9710 * 8282832003758463051L + 8282832003758463051L * i_7 * i_4) * 5773041712000823651L;
                aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_7);
                i_2 += i_7;
                i_3 -= i_7;
                method15127();
            } while (aClass80_9715.method1409());
        }

        aNode_Sub15_Sub3_9721.method12230(ints_1, i_2, i_3);
    }

    synchronized boolean method15182(Node_Sub7 class282_sub7_1, Index index_2, Class250 class250_3) {
        class282_sub7_1.method12165();
        boolean bool_6 = true;
        int[] ints_7 = null;
        if (true) {
            ints_7 = new int[]{22050};
        }

        for (ObjectNode class282_sub47_8 = (ObjectNode) class282_sub7_1.aClass465_7521.method7750(); class282_sub47_8 != null; class282_sub47_8 = (ObjectNode) class282_sub7_1.aClass465_7521.method7751()) {
            int i_9 = (int) class282_sub47_8.pointer;
            Node_Sub14 class282_sub14_10 = (Node_Sub14) aClass465_9694.get(i_9);
            if (class282_sub14_10 == null) {
                class282_sub14_10 = PlaySoundJingleCutsceneAction.method14676(index_2, i_9);
                if (class282_sub14_10 == null) {
                    bool_6 = false;
                    continue;
                }

                aClass465_9694.put(class282_sub14_10, i_9);
            }

            if (!class282_sub14_10.method12216(class250_3, (byte[]) class282_sub47_8.anObject8068, ints_7)) {
                bool_6 = false;
            }
        }

        if (bool_6) {
            class282_sub7_1.method12167();
        }

        return bool_6;
    }

    void method15188() {
    }

    void method15189(int i_1, int i_2) {
        if (i_2 != anIntArray9699[i_1]) {
            anIntArray9699[i_1] = i_2;

            for (int i_4 = 0; i_4 < 128; i_4++) {
                aNode_Sub13ArrayArray9714[i_1][i_4] = null;
            }
        }

    }

    void method15192(int i_1) {
        for (Node_Sub13 class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.head(); class282_sub13_3 != null; class282_sub13_3 = (Node_Sub13) aNode_Sub15_Sub3_9721.aClass482_9754.next()) {
            if ((i_1 < 0 || class282_sub13_3.anInt7582 == i_1) && class282_sub13_3.anInt7579 < 0) {
                aNode_Sub13ArrayArray9713[class282_sub13_3.anInt7582][class282_sub13_3.anInt7569] = null;
                class282_sub13_3.anInt7579 = 0;
            }
        }

    }

}
