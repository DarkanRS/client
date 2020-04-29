package com.jagex;

public class Class287 {

    public int anInt3419;
    public int anInt3430;
    public Node_Sub24 aNode_Sub24_3425;
    boolean aBool3426;
    boolean aBool3427;
    short[] aShortArray3429;
    int anInt3433;
    int anInt3435;
    int anInt3431;
    int anInt3409;
    int anInt3432;

    public Class287(AbstractRenderer graphicalrenderer_1, int i_2, ByteBuf rsbytebuffer_3) {
        if (Preference_Sub20.anIntArray7920 == null) {
            FontRenderer_Sub1.method13783();
        }
        anInt3419 = rsbytebuffer_3.readUnsignedByte();
        aBool3426 = (anInt3419 & 0x8) != 0;
        aBool3427 = (anInt3419 & 0x10) != 0;
        anInt3419 &= 0x7;
        int i_5 = rsbytebuffer_3.readUnsignedShort() << 2;
        int i_6 = rsbytebuffer_3.readUnsignedShort() << 2;
        int i_7 = rsbytebuffer_3.readUnsignedShort() << 2;
        int i_8 = rsbytebuffer_3.readUnsignedByte();
        int i_9 = i_8 * 2 + 1;
        aShortArray3429 = new short[i_9];
        int i_10;
        for (i_10 = 0; i_10 < aShortArray3429.length; i_10++) {
            short s_11 = (short) rsbytebuffer_3.readUnsignedShort();
            int i_12 = s_11 >>> 8;
            int i_13 = s_11 & 0xff;
            if (i_12 >= i_9) {
                i_12 = i_9 - 1;
            }
            if (i_13 > i_9 - i_12) {
                i_13 = i_9 - i_12;
            }
            aShortArray3429[i_10] = (short) (i_12 << 8 | i_13);
        }
        i_8 = (i_8 << i_2) + (1 << i_2 >> 1);
        i_10 = Class540.anIntArray7136 != null ? Class540.anIntArray7136[rsbytebuffer_3.readUnsignedShort()] : Class335.anIntArray3916[Class372.method6362(rsbytebuffer_3.readUnsignedShort()) & 0xffff];
        int i_14 = rsbytebuffer_3.readUnsignedByte();
        anInt3430 = i_14 & 0x1f;
        anInt3433 = (i_14 & 0xe0) << 3;
        if (anInt3430 != 31) {
            method5052();
        }
        method5050(graphicalrenderer_1, i_5, i_7, i_6, i_8, i_10);
    }

    void method5050(AbstractRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        aNode_Sub24_3425 = graphicalrenderer_1.method8593(i_2, i_3, i_4, i_5, i_6);
    }

    void method5052() {
        switch (anInt3430) {
            case 2:
                anInt3431 = 1;
                anInt3435 = 0;
                anInt3409 = 2048;
                anInt3432 = 2048;
                break;
            case 3:
                anInt3431 = 1;
                anInt3435 = 0;
                anInt3409 = 2048;
                anInt3432 = 4096;
                break;
            case 4:
                anInt3431 = 4;
                anInt3435 = 0;
                anInt3409 = 2048;
                anInt3432 = 2048;
                break;
            case 5:
                anInt3431 = 4;
                anInt3435 = 0;
                anInt3409 = 2048;
                anInt3432 = 8192;
                break;
            case 6:
                anInt3431 = 3;
                anInt3435 = 1280;
                anInt3409 = 768;
                anInt3432 = 2048;
                break;
            case 7:
                anInt3431 = 3;
                anInt3435 = 1280;
                anInt3409 = 768;
                anInt3432 = 4096;
                break;
            case 8:
                anInt3431 = 3;
                anInt3435 = 1024;
                anInt3409 = 1024;
                anInt3432 = 2048;
                break;
            case 9:
                anInt3431 = 3;
                anInt3435 = 1024;
                anInt3409 = 1024;
                anInt3432 = 4096;
                break;
            case 10:
                anInt3431 = 3;
                anInt3435 = 1536;
                anInt3409 = 512;
                anInt3432 = 2048;
                break;
            case 11:
                anInt3431 = 3;
                anInt3435 = 1536;
                anInt3409 = 512;
                anInt3432 = 4096;
                break;
            case 12:
                anInt3431 = 2;
                anInt3435 = 0;
                anInt3409 = 2048;
                anInt3432 = 2048;
                break;
            case 13:
                anInt3431 = 2;
                anInt3435 = 0;
                anInt3409 = 2048;
                anInt3432 = 8192;
                break;
            case 14:
                anInt3431 = 1;
                anInt3435 = 1280;
                anInt3409 = 768;
                anInt3432 = 2048;
                break;
            case 15:
                anInt3431 = 1;
                anInt3435 = 1536;
                anInt3409 = 512;
                anInt3432 = 4096;
                break;
            case 16:
                anInt3431 = 1;
                anInt3435 = 1792;
                anInt3409 = 256;
                anInt3432 = 8192;
                break;
            default:
                anInt3435 = 0;
                anInt3431 = 0;
                anInt3409 = 2048;
                anInt3432 = 2048;
        }
    }

    void method5053(int i_1, boolean bool_2) {
        int i_4;
        if (!bool_2) {
            int i_5 = anInt3432 * i_1 / 50 + anInt3433 & 0x7ff;
            switch (anInt3431) {
                case 1:
                    i_4 = (Class382.SINE[i_5 << 3] >> 4) + 1024;
                    break;
                case 2:
                    i_4 = i_5;
                    break;
                case 3:
                    i_4 = Preference_Sub20.anIntArray7920[i_5] >> 1;
                    break;
                case 4:
                    i_4 = i_5 >> 10 << 11;
                    break;
                case 5:
                    i_4 = (i_5 < 1024 ? i_5 : 2048 - i_5) << 1;
                    break;
                default:
                    i_4 = 2048;
            }
        } else {
            i_4 = 2048;
        }
        aNode_Sub24_3425.method12373(((i_4 * anInt3409 >> 11) + anInt3435) / 2048.0F);
    }

    public void method5061(int i_1, int i_2, int i_3, int i_4) {
        anInt3431 = i_1;
        anInt3435 = i_4;
        anInt3409 = i_3;
        anInt3432 = i_2;
    }
}
