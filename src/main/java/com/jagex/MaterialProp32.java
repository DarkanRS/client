package com.jagex;

public class MaterialProp32 extends MaterialProperty {

    static byte[] aByteArray9814;

    static {
        int i_0 = 0;
        aByteArray9814 = new byte[32896];

        for (int i_1 = 0; i_1 < 256; i_1++) {
            for (int i_2 = 0; i_2 <= i_1; i_2++) {
                aByteArray9814[i_0++] = (byte) ((int) (255.0D / Math.sqrt((i_2 * i_2 + i_1 * i_1 + 65535) / 65535.0F)));
            }
        }

    }

    int anInt9810 = 4096;
    int anInt9813 = 3216;
    int anInt9807 = 3216;
    int[] anIntArray9808 = new int[3];

    public MaterialProp32() {
        super(1, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int i_4 = anInt9810 * Class316.anInt3678 >> 12;
            int[] ints_5 = method12317(0, i_1 - 1 & Class316.anInt3673);
            int[] ints_6 = method12317(0, i_1);
            int[] ints_7 = method12317(0, i_1 + 1 & Class316.anInt3673);

            for (int i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
                int i_9 = (ints_7[i_8] - ints_5[i_8]) * i_4 >> 12;
                int i_10 = i_4 * (ints_6[i_8 - 1 & Class316.anInt3669] - ints_6[i_8 + 1 & Class316.anInt3669]) >> 12;
                int i_11 = i_10 >> 4;
                int i_12 = i_9 >> 4;
                if (i_11 < 0) {
                    i_11 = -i_11;
                }

                if (i_11 > 255) {
                    i_11 = 255;
                }

                if (i_12 < 0) {
                    i_12 = -i_12;
                }

                if (i_12 > 255) {
                    i_12 = 255;
                }

                int i_13 = aByteArray9814[i_11 + (i_12 * (i_12 + 1) >> 1)] & 0xff;
                int i_14 = i_10 * i_13 >> 8;
                int i_15 = i_9 * i_13 >> 8;
                int i_16 = i_13 * 4096 >> 8;
                i_14 = i_14 * anIntArray9808[0] >> 12;
                i_15 = anIntArray9808[1] * i_15 >> 12;
                i_16 = i_16 * anIntArray9808[2] >> 12;
                ints_3[i_8] = i_16 + i_15 + i_14;
            }
        }

        return ints_3;
    }

    @Override
    void method12321() {
        method15266();
    }

    void method15266() {
        double d_2 = Math.cos(anInt9807 / 4096.0F);
        anIntArray9808[0] = (int) (Math.sin(anInt9813 / 4096.0F) * d_2 * 4096.0D);
        anIntArray9808[1] = (int) (Math.cos(anInt9813 / 4096.0F) * d_2 * 4096.0D);
        anIntArray9808[2] = (int) (Math.sin(anInt9807 / 4096.0F) * 4096.0D);
        int i_4 = anIntArray9808[0] * anIntArray9808[0] >> 12;
        int i_5 = anIntArray9808[1] * anIntArray9808[1] >> 12;
        int i_6 = anIntArray9808[2] * anIntArray9808[2] >> 12;
        int i_7 = (int) (Math.sqrt(i_4 + i_5 + i_6 >> 12) * 4096.0D);
        if (i_7 != 0) {
            anIntArray9808[0] = (anIntArray9808[0] << 12) / i_7;
            anIntArray9808[1] = (anIntArray9808[1] << 12) / i_7;
            anIntArray9808[2] = (anIntArray9808[2] << 12) / i_7;
        }

    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9810 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 1:
                anInt9813 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 2:
                anInt9807 = rsbytebuffer_2.readUnsignedShort();
        }

    }

}
