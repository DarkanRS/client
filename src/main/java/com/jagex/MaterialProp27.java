package com.jagex;

public class MaterialProp27 extends MaterialProperty {

    int anInt9593 = 10;
    int anInt9594 = 2048;
    int anInt9595;
    int[] anIntArray9596;
    int[] anIntArray9592;

    public MaterialProp27() {
        super(0, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            int i_4 = Class316.anIntArray3668[i_1];
            int i_6;
            if (anInt9595 != 0) {
                for (int i_5 = 0; i_5 < Class316.anInt3670; i_5++) {
                    i_6 = 0;
                    short s_7 = 0;
                    int i_8 = Class316.anIntArray3672[i_5];
                    switch (anInt9595) {
                        case 1:
                            i_6 = i_8;
                            break;
                        case 2:
                            i_6 = (i_8 - (4096 - i_4) >> 1) + 2048;
                            break;
                        case 3:
                            i_6 = (i_8 - i_4 >> 1) + 2048;
                    }

                    for (int i_9 = 0; i_9 < anInt9593; i_9++) {
                        if (i_6 >= anIntArray9592[i_9] && i_6 < anIntArray9592[i_9 + 1]) {
                            if (i_6 < anIntArray9596[i_9]) {
                                s_7 = 4096;
                            }
                            break;
                        }
                    }

                    ints_3[i_5] = s_7;
                }
            } else {
                short s_10 = 0;

                for (i_6 = 0; i_6 < anInt9593; i_6++) {
                    if (i_4 >= anIntArray9592[i_6] && i_4 < anIntArray9592[i_6 + 1]) {
                        if (i_4 < anIntArray9596[i_6]) {
                            s_10 = 4096;
                        }
                        break;
                    }
                }

                Class503.method8365(ints_3, 0, Class316.anInt3670, s_10);
            }
        }

        return ints_3;
    }

    @Override
    void method12321() {
        method14842();
    }

    void method14842() {
        int i_2 = 0;
        anIntArray9596 = new int[anInt9593 + 1];
        anIntArray9592 = new int[anInt9593 + 1];
        int i_3 = 4096 / anInt9593;
        int i_4 = i_3 * anInt9594 >> 12;

        for (int i_5 = 0; i_5 < anInt9593; i_5++) {
            anIntArray9592[i_5] = i_2;
            anIntArray9596[i_5] = i_4 + i_2;
            i_2 += i_3;
        }

        anIntArray9592[anInt9593] = 4096;
        anIntArray9596[anInt9593] = anIntArray9596[0] + 4096;
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9593 = rsbytebuffer_2.readUnsignedByte();
                break;
            case 1:
                anInt9594 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 2:
                anInt9595 = rsbytebuffer_2.readUnsignedByte();
        }

    }

}
