package com.jagex;

public class MaterialProp34 extends MaterialProperty {

    byte[] aByteArray9732 = new byte[512];
    int anInt9736 = 4;
    int anInt9737 = 1638;
    int anInt9735 = 4;
    int anInt9725 = 4;
    int anInt9733;
    short[] aShortArray9730;
    boolean aBool9726 = true;
    short[] aShortArray9731;

    public MaterialProp34() {
        super(0, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            method15197(i_1, ints_3);
        }
        return ints_3;
    }

    void method15197(int i_1, int[] ints_2) {
        int i_4 = Class316.anIntArray3668[i_1] * anInt9735;
        short s_5;
        int i_6;
        int i_7;
        int i_8;
        int i_9;
        int i_10;
        int i_11;
        int i_12;
        int i_13;
        int i_14;
        int i_15;
        int i_16;
        int i_17;
        if (anInt9736 == 1) {
            s_5 = aShortArray9730[0];
            i_6 = aShortArray9731[0] << 12;
            i_7 = i_6 * anInt9735 >> 12;
            i_8 = i_6 * anInt9725 >> 12;
            i_9 = i_6 * i_4 >> 12;
            i_10 = i_9 >> 12;
            i_11 = i_10 + 1;
            if (i_11 >= i_7) {
                i_11 = 0;
            }
            i_9 &= 0xfff;
            i_12 = Class370.anIntArray4291[i_9];
            i_13 = aByteArray9732[i_10 & 0xff] & 0xff;
            i_14 = aByteArray9732[i_11 & 0xff] & 0xff;
            if (aBool9726) {
                for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                    i_16 = Class316.anIntArray3672[i_15] * anInt9725;
                    i_17 = method15198(i_6 * i_16 >> 12, i_9, i_13, i_14, i_12, i_8);
                    i_17 = s_5 * i_17 >> 12;
                    ints_2[i_15] = (i_17 >> 1) + 2048;
                }
            } else {
                for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                    i_16 = Class316.anIntArray3672[i_15] * anInt9725;
                    i_17 = method15198(i_6 * i_16 >> 12, i_9, i_13, i_14, i_12, i_8);
                    ints_2[i_15] = s_5 * i_17 >> 12;
                }
            }
        } else {
            s_5 = aShortArray9730[0];
            if (s_5 > 8 || s_5 < -8) {
                i_6 = aShortArray9731[0] << 12;
                i_7 = i_6 * anInt9735 >> 12;
                i_8 = i_6 * anInt9725 >> 12;
                i_9 = i_4 * i_6 >> 12;
                i_10 = i_9 >> 12;
                i_11 = i_10 + 1;
                if (i_11 >= i_7) {
                    i_11 = 0;
                }
                i_9 &= 0xfff;
                i_12 = Class370.anIntArray4291[i_9];
                i_13 = aByteArray9732[i_10 & 0xff] & 0xff;
                i_14 = aByteArray9732[i_11 & 0xff] & 0xff;
                for (i_15 = 0; i_15 < Class316.anInt3670; i_15++) {
                    i_16 = Class316.anIntArray3672[i_15] * anInt9725;
                    i_17 = method15198(i_6 * i_16 >> 12, i_9, i_13, i_14, i_12, i_8);
                    ints_2[i_15] = i_17 * s_5 >> 12;
                }
            }
            for (i_6 = 1; i_6 < anInt9736; i_6++) {
                s_5 = aShortArray9730[i_6];
                if (s_5 > 8 || s_5 < -8) {
                    i_7 = aShortArray9731[i_6] << 12;
                    i_8 = i_7 * anInt9735 >> 12;
                    i_9 = i_7 * anInt9725 >> 12;
                    i_10 = i_4 * i_7 >> 12;
                    i_11 = i_10 >> 12;
                    i_12 = i_11 + 1;
                    if (i_12 >= i_8) {
                        i_12 = 0;
                    }
                    i_10 &= 0xfff;
                    i_13 = Class370.anIntArray4291[i_10];
                    i_14 = aByteArray9732[i_11 & 0xff] & 0xff;
                    i_15 = aByteArray9732[i_12 & 0xff] & 0xff;
                    int i_18;
                    if (aBool9726 && i_6 == anInt9736 - 1) {
                        for (i_16 = 0; i_16 < Class316.anInt3670; i_16++) {
                            i_17 = Class316.anIntArray3672[i_16] * anInt9725;
                            i_18 = method15198(i_17 * i_7 >> 12, i_10, i_14, i_15, i_13, i_9);
                            i_18 = ints_2[i_16] + (s_5 * i_18 >> 12);
                            ints_2[i_16] = (i_18 >> 1) + 2048;
                        }
                    } else {
                        for (i_16 = 0; i_16 < Class316.anInt3670; i_16++) {
                            i_17 = Class316.anIntArray3672[i_16] * anInt9725;
                            i_18 = method15198(i_7 * i_17 >> 12, i_10, i_14, i_15, i_13, i_9);
                            ints_2[i_16] += i_18 * s_5 >> 12;
                        }
                    }
                }
            }
        }
    }

    int method15198(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_8 = i_1 >> 12;
        int i_9 = i_8 + 1;
        if (i_9 >= i_6) {
            i_9 = 0;
        }
        i_1 &= 0xfff;
        i_8 &= 0xff;
        i_9 &= 0xff;
        int i_10 = i_1 - 4096;
        int i_11 = i_2 - 4096;
        int i_12 = Class370.anIntArray4291[i_1];
        int i_13 = aByteArray9732[i_3 + i_8] & 0x3;
        int i_14;
        if (i_13 <= 1) {
            i_14 = i_13 == 0 ? i_2 + i_1 : i_2 - i_1;
        } else {
            i_14 = i_13 == 2 ? i_1 - i_2 : -i_1 - i_2;
        }
        i_13 = aByteArray9732[i_3 + i_9] & 0x3;
        int i_15;
        if (i_13 <= 1) {
            i_15 = i_13 == 0 ? i_10 + i_2 : i_2 - i_10;
        } else {
            i_15 = i_13 == 2 ? i_10 - i_2 : -i_10 - i_2;
        }
        int i_16 = i_14 + (i_12 * (i_15 - i_14) >> 12);
        i_13 = aByteArray9732[i_8 + i_4] & 0x3;
        if (i_13 <= 1) {
            i_14 = i_13 == 0 ? i_11 + i_1 : i_11 - i_1;
        } else {
            i_14 = i_13 == 2 ? i_1 - i_11 : -i_1 - i_11;
        }
        i_13 = aByteArray9732[i_9 + i_4] & 0x3;
        if (i_13 <= 1) {
            i_15 = i_13 == 0 ? i_10 + i_11 : i_11 - i_10;
        } else {
            i_15 = i_13 == 2 ? i_10 - i_11 : -i_10 - i_11;
        }
        int i_17 = i_14 + (i_12 * (i_15 - i_14) >> 12);
        return i_16 + (i_5 * (i_17 - i_16) >> 12);
    }

    @Override
    void method12321() {
        aByteArray9732 = Class316.method5588(anInt9733);
        method15199();
        for (int i_2 = anInt9736 - 1; i_2 >= 1; --i_2) {
            short s_3 = aShortArray9730[i_2];
            if (s_3 > 8 || s_3 < -8) {
                break;
            }
            --anInt9736;
        }
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                aBool9726 = rsbytebuffer_2.readUnsignedByte() == 1;
                break;
            case 1:
                anInt9736 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 2:
                anInt9737 = rsbytebuffer_2.readShort();
                if (anInt9737 < 0) {
                    aShortArray9730 = new short[anInt9736];
                    for (int i_4 = 0; i_4 < anInt9736; i_4++) {
                        aShortArray9730[i_4] = (short) rsbytebuffer_2.readShort();
                    }
                }
                break;
            case 3:
                anInt9725 = anInt9735 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 4:
                anInt9733 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 5:
                anInt9725 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 6:
                anInt9735 = rsbytebuffer_2.readUnsignedByte();
        }
    }

    void method15199() {
        int i_2;
        if (anInt9737 > 0) {
            aShortArray9730 = new short[anInt9736];
            aShortArray9731 = new short[anInt9736];
            for (i_2 = 0; i_2 < anInt9736; i_2++) {
                aShortArray9730[i_2] = (short) ((int) (Math.pow(anInt9737 / 4096.0F, i_2) * 4096.0D));
                aShortArray9731[i_2] = (short) ((int) Math.pow(2.0D, i_2));
            }
        } else if (aShortArray9730 != null && aShortArray9730.length == anInt9736) {
            aShortArray9731 = new short[anInt9736];
            for (i_2 = 0; i_2 < anInt9736; i_2++) {
                aShortArray9731[i_2] = (short) ((int) Math.pow(2.0D, i_2));
            }
        }
    }
}
