package com.jagex;

public class MaterialProp12 extends MaterialProperty {

    int anInt9682;
    int anInt9684;
    int anInt9680 = 1;

    public MaterialProp12() {
        super(0, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int i_4 = Class316.anIntArray3668[i_1];
            int i_5 = i_4 - 2048 >> 1;

            for (int i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
                int i_7 = Class316.anIntArray3672[i_6];
                int i_8 = i_7 - 2048 >> 1;
                int i_9;
                if (anInt9682 == 0) {
                    i_9 = (i_7 - i_4) * anInt9680;
                } else {
                    int i_10 = i_5 * i_5 + i_8 * i_8 >> 12;
                    i_9 = (int) (Math.sqrt(i_10 / 4096.0F) * 4096.0D);
                    i_9 = (int) ((i_9 * anInt9680) * 3.141592653589793D);
                }

                i_9 -= i_9 & -4096;
                if (anInt9684 == 0) {
                    i_9 = Class316.anIntArray3677[i_9 >> 4 & 0xff] + 4096 >> 1;
                } else if (anInt9684 == 2) {
                    i_9 -= 2048;
                    if (i_9 < 0) {
                        i_9 = -i_9;
                    }

                    i_9 = 2048 - i_9 << 1;
                }

                ints_3[i_6] = i_9;
            }
        }

        return ints_3;
    }

    @Override
    void method12321() {
        Class316.method5586();
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9682 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 1:
                anInt9684 = rsbytebuffer_2.readUnsignedByte();
            case 2:
            default:
                break;
            case 3:
                anInt9680 = rsbytebuffer_2.readUnsignedByte();
        }

    }

}
