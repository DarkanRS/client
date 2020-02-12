package com.jagex;

import java.nio.ByteBuffer;

public class Class71 {

    boolean aBool710 = true;
    int anInt715 = -1;
    static int[] anIntArray721;
    static byte[] aByteArray722;
    Interface6 anInterface6_714;
    GraphicalRenderer_Sub2 aGraphicalRenderer_Sub2_708;
    Class74 aClass74_711;
    int anInt712;
    int anInt718;
    int anInt716;
    int anInt709;
    int anInt719;
    Interface32 anInterface32_717;

    void method1288(Class48 class48_1) {
        this.method1290(class48_1, this.anInterface32_717, 0, this.anInt716);
    }

    void method1290(Class48 class48_1, Interface32 interface32_2, int i_3, int i_4) {
        if (i_4 > 0) {
            this.method1293();
            this.aGraphicalRenderer_Sub2_708.method13997(interface32_2);
            class48_1.anInterface6_452 = this.anInterface6_714;
            class48_1.anInt467 = this.anInt719;
            class48_1.anInt468 = this.anInt709 - this.anInt719 + 1;
            class48_1.anInt469 = i_3;
            class48_1.anInt470 = i_4;
            class48_1.method965(0);
        }

    }

    void method1293() {
        if (this.aBool710) {
            this.aBool710 = false;
            byte[] bytes_1 = this.aClass74_711.aByteArray736;
            int i_2 = 0;
            int i_3 = this.aClass74_711.anInt732;
            int i_4 = this.anInt712 + this.aClass74_711.anInt732 * this.anInt718;

            int i_5;
            for (i_5 = -128; i_5 < 0; i_5++) {
                i_2 = (i_2 << 8) - i_2;

                for (int i_6 = -128; i_6 < 0; i_6++) {
                    if (bytes_1[i_4++] != 0) {
                        ++i_2;
                    }
                }

                i_4 += i_3 - 128;
            }

            if (this.anInterface6_714 != null && i_2 == this.anInt715) {
                this.aBool710 = false;
            } else {
                this.anInt715 = i_2;
                i_5 = 0;
                i_4 = i_3 * this.anInt718 + this.anInt712;
                int i_7;
                int i_8;
                int i_9;
                if (this.aGraphicalRenderer_Sub2_708.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
                    if (aByteArray722 == null) {
                        aByteArray722 = new byte[16384];
                    }

                    byte[] bytes_10 = aByteArray722;

                    for (i_7 = -128; i_7 < 0; i_7++) {
                        for (i_8 = -128; i_8 < 0; i_8++) {
                            if (bytes_1[i_4] != 0) {
                                bytes_10[i_5++] = 68;
                            } else {
                                i_9 = 0;
                                if (bytes_1[i_4 - 1] != 0) {
                                    ++i_9;
                                }

                                if (bytes_1[i_4 + 1] != 0) {
                                    ++i_9;
                                }

                                if (bytes_1[i_4 - i_3] != 0) {
                                    ++i_9;
                                }

                                if (bytes_1[i_4 + i_3] != 0) {
                                    ++i_9;
                                }

                                bytes_10[i_5++] = (byte) (i_9 * 17);
                            }

                            ++i_4;
                        }

                        i_4 += this.aClass74_711.anInt732 - 128;
                    }

                    if (this.anInterface6_714 == null) {
                        this.anInterface6_714 = this.aGraphicalRenderer_Sub2_708.method13957(Class150.aClass150_1951, 128, 128, false, aByteArray722);
                        this.anInterface6_714.method50(false, false);
                    } else {
                        this.anInterface6_714.method52(0, 0, 128, 128, aByteArray722, Class150.aClass150_1951, 0, 128);
                    }
                } else {
                    if (anIntArray721 == null) {
                        anIntArray721 = new int[16384];
                    }

                    int[] ints_11 = anIntArray721;

                    for (i_7 = -128; i_7 < 0; i_7++) {
                        for (i_8 = -128; i_8 < 0; i_8++) {
                            if (bytes_1[i_4] != 0) {
                                ints_11[i_5++] = 1140850688;
                            } else {
                                i_9 = 0;
                                if (bytes_1[i_4 - 1] != 0) {
                                    ++i_9;
                                }

                                if (bytes_1[i_4 + 1] != 0) {
                                    ++i_9;
                                }

                                if (bytes_1[i_4 - i_3] != 0) {
                                    ++i_9;
                                }

                                if (bytes_1[i_4 + i_3] != 0) {
                                    ++i_9;
                                }

                                ints_11[i_5++] = i_9 * 17 << 24;
                            }

                            ++i_4;
                        }

                        i_4 += this.aClass74_711.anInt732 - 128;
                    }

                    if (this.anInterface6_714 == null) {
                        this.anInterface6_714 = this.aGraphicalRenderer_Sub2_708.method14024(128, 128, false, anIntArray721);
                        this.anInterface6_714.method50(false, false);
                    } else {
                        this.anInterface6_714.method48(0, 0, 128, 128, anIntArray721, 0, 128);
                    }
                }
            }
        }

    }

    Class71(GraphicalRenderer_Sub2 class505_sub2_1, Class74 class74_2, HardwareGround class390_sub1_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        this.aGraphicalRenderer_Sub2_708 = class505_sub2_1;
        this.aClass74_711 = class74_2;
        this.anInt712 = i_7;
        this.anInt718 = i_8;
        int i_9 = 1 << i_6;
        int i_10 = 0;
        int i_11 = i_4 << i_6;
        int i_12 = i_5 << i_6;

        int i_14;
        int i_15;
        for (int i_13 = 0; i_13 < i_9; i_13++) {
            i_14 = class390_sub1_3.width * (i_12 + i_13) + i_11;

            for (i_15 = 0; i_15 < i_9; i_15++) {
                short[] shorts_21 = class390_sub1_3.aShortArrayArray8534[i_14++];
                if (shorts_21 != null) {
                    i_10 += shorts_21.length;
                }
            }
        }

        if (i_10 > 0) {
            this.anInt709 = Integer.MIN_VALUE;
            this.anInt719 = Integer.MAX_VALUE;
            this.anInterface32_717 = this.aGraphicalRenderer_Sub2_708.method13993(false);
            this.anInterface32_717.method208(i_10);
            ByteBuffer bytebuffer_20 = this.aGraphicalRenderer_Sub2_708.aByteBuffer8838;
            bytebuffer_20.clear();

            for (i_14 = 0; i_14 < i_9; i_14++) {
                i_15 = class390_sub1_3.width * (i_12 + i_14) + i_11;

                for (int i_16 = 0; i_16 < i_9; i_16++) {
                    short[] shorts_17 = class390_sub1_3.aShortArrayArray8534[i_15++];
                    if (shorts_17 != null) {
                        for (int i_18 = 0; i_18 < shorts_17.length; i_18++) {
                            int i_19 = shorts_17[i_18] & 0xffff;
                            if (i_19 < this.anInt719) {
                                this.anInt719 = i_19;
                            }

                            if (i_19 > this.anInt709) {
                                this.anInt709 = i_19;
                            }

                            bytebuffer_20.putShort((short) i_19);
                        }
                    }
                }
            }

            this.anInterface32_717.method42(0, bytebuffer_20.position(), this.aGraphicalRenderer_Sub2_708.aLong8695);
            this.anInt716 = i_10 / 3;
        } else {
            this.anInt716 = 0;
            this.anInterface6_714 = null;
        }

    }

}
