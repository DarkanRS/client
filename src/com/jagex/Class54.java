package com.jagex;

import java.nio.ByteBuffer;

public class Class54 {

    static float aFloat512;
    int anInt509;
    int anInt497 = 64;
    int anInt501 = 64;
    int anInt502 = 768;
    int anInt503 = 1600;
    int anInt504 = Class159.method2739(1600, 1631895269);
    int[] anIntArray506;
    int[] anIntArray507;
    int[] anIntArray508;
    PointEntity[][] aEntityNode_Sub1_Sub1ArrayArray498;
    PointEntity[][] aEntityNode_Sub1_Sub1ArrayArray505;
    Class70 aClass70_499;
    Interface4 anInterface4_500;
    Interface4 anInterface4_510;
    Interface32 anInterface32_511;

    void method1089(GraphicalRenderer_Sub2 class505_sub2_1) {
        this.anInterface4_500.method31(786336, 24);
    }

    void method1090() {
        this.anInterface4_500.method26();
    }

    void method1091(GraphicalRenderer_Sub2 class505_sub2_1, Class151 class151_2) {
        class505_sub2_1.RA(false);
        aFloat512 = class505_sub2_1.aFloat8769;
        float f_3 = class505_sub2_1.aClass384_8740.buf[2];
        float f_4 = class505_sub2_1.aClass384_8740.buf[6];
        float f_5 = class505_sub2_1.aClass384_8740.buf[10];
        float f_6 = class505_sub2_1.aClass384_8740.buf[14];
        int i_7 = 0;
        int i_8 = Integer.MAX_VALUE;
        int i_9 = 0;
        EntityNode_Sub1 class275_sub1_10 = class151_2.aClass464_1961.aEntityNode_Sub1_5554;

        for (EntityNode_Sub1 class275_sub1_11 = class275_sub1_10.aEntityNode_Sub1_7706; class275_sub1_11 != class275_sub1_10; class275_sub1_11 = class275_sub1_11.aEntityNode_Sub1_7706) {
            PointEntity class275_sub1_sub1_21 = (PointEntity) class275_sub1_11;
            int i_22 = (int) (f_3 * (float) (class275_sub1_sub1_21.x >> 12) + f_4 * (float) (class275_sub1_sub1_21.z >> 12) + f_5 * (float) (class275_sub1_sub1_21.y >> 12) + f_6);
            if (i_22 > i_9) {
                i_9 = i_22;
            }

            if (i_22 < i_8) {
                i_8 = i_22;
            }

            this.anIntArray506[i_7++] = i_22;
        }

        int i_20 = i_9 - i_8;
        int i_12;
        if (i_20 + 2 > 1600) {
            i_12 = 1 + Class159.method2739(i_20, -1568280644) - this.anInt504;
            i_20 = (i_20 >> i_12) + 2;
        } else {
            i_12 = 0;
            i_20 += 2;
        }

        EntityNode_Sub1 class275_sub1_13 = class275_sub1_10.aEntityNode_Sub1_7706;
        i_7 = 0;
        class505_sub2_1.method13997(this.anInterface32_511);
        Class103 class103_14 = class505_sub2_1.aClass103_8796;
        class103_14.method1788(Matrix44Arr.aClass384_4666);
        class103_14.aClass384_1058.identity();
        class103_14.anInt1056 = -1;
        int i_15 = -2;
        boolean bool_16 = true;

        for (boolean bool_17 = true; class275_sub1_13 != class275_sub1_10; this.method1096(class505_sub2_1, i_20)) {
            this.anInt509 = 0;

            int i_18;
            for (i_18 = 0; i_18 < i_20; i_18++) {
                this.anIntArray507[i_18] = 0;
            }

            for (i_18 = 0; i_18 < 64; i_18++) {
                this.anIntArray508[i_18] = 0;
            }

            for (; class275_sub1_13 != class275_sub1_10; class275_sub1_13 = class275_sub1_13.aEntityNode_Sub1_7706) {
                PointEntity class275_sub1_sub1_23 = (PointEntity) class275_sub1_13;
                if (bool_17) {
                    i_15 = class275_sub1_sub1_23.rotation;
                    bool_16 = class275_sub1_sub1_23.aBool10210;
                    bool_17 = false;
                }

                if (i_7 > 0 && (i_15 != class275_sub1_sub1_23.rotation || bool_16 != class275_sub1_sub1_23.aBool10210)) {
                    bool_17 = true;
                    break;
                }

                int i_19 = this.anIntArray506[i_7++] - i_8 >> i_12;
                if (i_19 < 1600) {
                    if (this.anIntArray507[i_19] < 64) {
                        this.aEntityNode_Sub1_Sub1ArrayArray498[i_19][this.anIntArray507[i_19]++] = class275_sub1_sub1_23;
                    } else {
                        if (this.anIntArray507[i_19] == 64) {
                            if (this.anInt509 == 64) {
                                continue;
                            }

                            this.anIntArray507[i_19] += 1 + this.anInt509++;
                        }

                        PointEntity[] arr_10000 = this.aEntityNode_Sub1_Sub1ArrayArray505[this.anIntArray507[i_19] - 64 - 1];
                        int i_10002 = this.anIntArray507[i_19] - 64 - 1;
                        int i_10004 = this.anIntArray508[this.anIntArray507[i_19] - 64 - 1];
                        this.anIntArray508[i_10002] = this.anIntArray508[this.anIntArray507[i_19] - 64 - 1] + 1;
                        arr_10000[i_10004] = class275_sub1_sub1_23;
                    }
                }
            }

            class103_14.anInterface6_1059 = class505_sub2_1.aClass66_8787.method1283(i_15 >= 0 ? i_15 : -1);
            if (bool_16 && class505_sub2_1.aFloat8769 != aFloat512) {
                class505_sub2_1.IA(aFloat512);
            } else if (class505_sub2_1.aFloat8769 != 1.0F) {
                class505_sub2_1.IA(1.0F);
            }
        }

        if (class505_sub2_1.aFloat8769 != aFloat512) {
            class505_sub2_1.IA(aFloat512);
        }

        class505_sub2_1.RA(true);
    }

    Class54(GraphicalRenderer_Sub2 class505_sub2_1) {
        this.anInt497 = 64;
        this.anIntArray506 = new int[8191];
        this.anIntArray507 = new int[1600];
        this.anIntArray508 = new int[64];
        this.aEntityNode_Sub1_Sub1ArrayArray498 = new PointEntity[1600][64];
        this.aEntityNode_Sub1_Sub1ArrayArray505 = new PointEntity[64][768];
        this.anInt509 = 0;
        this.aClass70_499 = class505_sub2_1.method13995(new Class72[]{new Class72(new Class69[]{Class69.aClass69_695, Class69.aClass69_690, Class69.aClass69_692}), new Class72(Class69.aClass69_689)});
        this.anInterface4_500 = class505_sub2_1.method13994(true);
        this.anInterface4_510 = class505_sub2_1.method13994(false);
        this.anInterface4_510.method31(393168, 12);
        this.anInterface32_511 = class505_sub2_1.method13993(false);
        this.anInterface32_511.method208(49146);
        ByteBuffer bytebuffer_2 = class505_sub2_1.aByteBuffer8838;
        bytebuffer_2.clear();

        int i_3;
        for (i_3 = 0; i_3 < 8191; i_3++) {
            int i_4 = i_3 * 4;
            bytebuffer_2.putShort((short) i_4);
            bytebuffer_2.putShort((short) (i_4 + 1));
            bytebuffer_2.putShort((short) (i_4 + 2));
            bytebuffer_2.putShort((short) (i_4 + 2));
            bytebuffer_2.putShort((short) (i_4 + 3));
            bytebuffer_2.putShort((short) i_4);
        }

        this.anInterface32_511.method42(0, bytebuffer_2.position(), class505_sub2_1.aLong8695);
        bytebuffer_2.clear();

        for (i_3 = 0; i_3 < 8191; i_3++) {
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(-1.0F);
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(-1.0F);
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(-1.0F);
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(0.0F);
            bytebuffer_2.putFloat(-1.0F);
            bytebuffer_2.putFloat(0.0F);
        }

        this.anInterface4_510.method42(0, bytebuffer_2.position(), class505_sub2_1.aLong8695);
    }

    void method1096(GraphicalRenderer_Sub2 class505_sub2_1, int i_2) {
        int i_3 = 0;
        Matrix44Arr matrix44arr_4 = class505_sub2_1.aClass384_8740;
        float f_5 = matrix44arr_4.buf[0];
        float f_6 = matrix44arr_4.buf[4];
        float f_7 = matrix44arr_4.buf[8];
        float f_8 = matrix44arr_4.buf[1];
        float f_9 = matrix44arr_4.buf[5];
        float f_10 = matrix44arr_4.buf[9];
        float f_11 = f_5 + f_8;
        float f_12 = f_6 + f_9;
        float f_13 = f_7 + f_10;
        float f_14 = f_5 - f_8;
        float f_15 = f_6 - f_9;
        float f_16 = f_7 - f_10;
        float f_17 = f_8 - f_5;
        float f_18 = f_9 - f_6;
        float f_19 = f_10 - f_7;
        ByteBuffer bytebuffer_20 = class505_sub2_1.aByteBuffer8838;
        bytebuffer_20.clear();

        for (int i_21 = i_2 - 1; i_21 >= 0; --i_21) {
            int i_22 = this.anIntArray507[i_21] > 64 ? 64 : this.anIntArray507[i_21];
            if (i_22 > 0) {
                int i_23;
                byte b_27;
                byte b_28;
                byte b_29;
                float f_31;
                float f_32;
                for (i_23 = i_22 - 1; i_23 >= 0; --i_23) {
                    PointEntity class275_sub1_sub1_36 = this.aEntityNode_Sub1_Sub1ArrayArray498[i_21][i_23];
                    int i_37 = class275_sub1_sub1_36.color;
                    byte b_26 = (byte) (i_37 >> 16);
                    b_27 = (byte) (i_37 >> 8);
                    b_28 = (byte) i_37;
                    b_29 = (byte) (i_37 >>> 24);
                    float f_30 = (float) (class275_sub1_sub1_36.x >> 12);
                    f_31 = (float) (class275_sub1_sub1_36.z >> 12);
                    f_32 = (float) (class275_sub1_sub1_36.y >> 12);
                    int i_33 = class275_sub1_sub1_36.size >> 12;
                    bytebuffer_20.putFloat(f_30 + f_11 * (float) (-i_33));
                    bytebuffer_20.putFloat(f_31 + f_12 * (float) (-i_33));
                    bytebuffer_20.putFloat(f_32 + f_13 * (float) (-i_33));
                    if (class505_sub2_1.anInt8824 == 0) {
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_29);
                    } else {
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_29);
                    }

                    bytebuffer_20.putFloat(0.0F);
                    bytebuffer_20.putFloat(0.0F);
                    bytebuffer_20.putFloat(f_30 + f_17 * (float) i_33);
                    bytebuffer_20.putFloat(f_31 + f_18 * (float) i_33);
                    bytebuffer_20.putFloat(f_32 + f_19 * (float) i_33);
                    if (class505_sub2_1.anInt8824 == 0) {
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_29);
                    } else {
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_29);
                    }

                    bytebuffer_20.putFloat(0.0F);
                    bytebuffer_20.putFloat(1.0F);
                    bytebuffer_20.putFloat(f_30 + f_11 * (float) i_33);
                    bytebuffer_20.putFloat(f_31 + f_12 * (float) i_33);
                    bytebuffer_20.putFloat(f_32 + f_13 * (float) i_33);
                    if (class505_sub2_1.anInt8824 == 0) {
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_29);
                    } else {
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_29);
                    }

                    bytebuffer_20.putFloat(1.0F);
                    bytebuffer_20.putFloat(1.0F);
                    bytebuffer_20.putFloat(f_30 + f_14 * (float) i_33);
                    bytebuffer_20.putFloat(f_31 + f_15 * (float) i_33);
                    bytebuffer_20.putFloat(f_32 + f_16 * (float) i_33);
                    if (class505_sub2_1.anInt8824 == 0) {
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_29);
                    } else {
                        bytebuffer_20.put(b_26);
                        bytebuffer_20.put(b_27);
                        bytebuffer_20.put(b_28);
                        bytebuffer_20.put(b_29);
                    }

                    bytebuffer_20.putFloat(1.0F);
                    bytebuffer_20.putFloat(0.0F);
                    ++i_3;
                }

                if (this.anIntArray507[i_21] > 64) {
                    i_23 = this.anIntArray507[i_21] - 64 - 1;

                    for (int i_24 = this.anIntArray508[i_23] - 1; i_24 >= 0; --i_24) {
                        PointEntity class275_sub1_sub1_25 = this.aEntityNode_Sub1_Sub1ArrayArray505[i_23][i_24];
                        int i_38 = class275_sub1_sub1_25.color;
                        b_27 = (byte) (i_38 >> 16);
                        b_28 = (byte) (i_38 >> 8);
                        b_29 = (byte) i_38;
                        byte b_39 = (byte) (i_38 >>> 24);
                        f_31 = (float) (class275_sub1_sub1_25.x >> 12);
                        f_32 = (float) (class275_sub1_sub1_25.z >> 12);
                        float f_40 = (float) (class275_sub1_sub1_25.y >> 12);
                        int i_34 = class275_sub1_sub1_25.size >> 12;
                        bytebuffer_20.putFloat(f_31 + f_11 * (float) (-i_34));
                        bytebuffer_20.putFloat(f_32 + f_12 * (float) (-i_34));
                        bytebuffer_20.putFloat(f_40 + f_13 * (float) (-i_34));
                        if (class505_sub2_1.anInt8824 == 0) {
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_39);
                        } else {
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_39);
                        }

                        bytebuffer_20.putFloat(0.0F);
                        bytebuffer_20.putFloat(0.0F);
                        bytebuffer_20.putFloat(f_31 + f_17 * (float) i_34);
                        bytebuffer_20.putFloat(f_32 + f_18 * (float) i_34);
                        bytebuffer_20.putFloat(f_40 + f_19 * (float) i_34);
                        if (class505_sub2_1.anInt8824 == 0) {
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_39);
                        } else {
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_39);
                        }

                        bytebuffer_20.putFloat(0.0F);
                        bytebuffer_20.putFloat(1.0F);
                        bytebuffer_20.putFloat(f_31 + f_11 * (float) i_34);
                        bytebuffer_20.putFloat(f_32 + f_12 * (float) i_34);
                        bytebuffer_20.putFloat(f_40 + f_13 * (float) i_34);
                        if (class505_sub2_1.anInt8824 == 0) {
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_39);
                        } else {
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_39);
                        }

                        bytebuffer_20.putFloat(1.0F);
                        bytebuffer_20.putFloat(1.0F);
                        bytebuffer_20.putFloat(f_31 + f_14 * (float) i_34);
                        bytebuffer_20.putFloat(f_32 + f_15 * (float) i_34);
                        bytebuffer_20.putFloat(f_40 + f_16 * (float) i_34);
                        if (class505_sub2_1.anInt8824 == 0) {
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_39);
                        } else {
                            bytebuffer_20.put(b_27);
                            bytebuffer_20.put(b_28);
                            bytebuffer_20.put(b_29);
                            bytebuffer_20.put(b_39);
                        }

                        bytebuffer_20.putFloat(1.0F);
                        bytebuffer_20.putFloat(0.0F);
                        ++i_3;
                    }
                }
            }
        }

        this.anInterface4_500.method42(0, bytebuffer_20.position(), class505_sub2_1.aLong8695);
        class505_sub2_1.method14161(0, this.anInterface4_500);
        class505_sub2_1.method14161(1, this.anInterface4_510);
        class505_sub2_1.method13996(this.aClass70_499);
        Class103 class103_35 = class505_sub2_1.aClass103_8796;
        class103_35.method1787(i_3);
    }

}
