package com.jagex;

public class MaterialProp31 extends MaterialProperty {

    int anInt9741;
    int anInt9740;
    int anInt9742 = 1365;
    int anInt9743 = 20;

    public MaterialProp31() {
        super(0, true);
    }

    @Override
    int[] method12319(int i_1) {
        int[] ints_3 = aClass320_7667.method5721(i_1);
        if (aClass320_7667.aBool3722) {
            for (int i_4 = 0; i_4 < Class316.anInt3670; i_4++) {
                int i_5 = (Class316.anIntArray3672[i_4] << 12) / anInt9742 + anInt9741;
                int i_6 = (Class316.anIntArray3668[i_1] << 12) / anInt9742 + anInt9740;
                int i_7 = i_5;
                int i_8 = i_6;
                int i_9 = i_5;
                int i_10 = i_6;
                int i_11 = i_5 * i_5 >> 12;
                int i_12 = i_6 * i_6 >> 12;

                int i_13;
                for (i_13 = 0; i_11 + i_12 < 16384 && i_13 < anInt9743; i_13++) {
                    i_10 = (i_9 * i_10 >> 12) * 2 + i_8;
                    i_9 = i_7 + (i_11 - i_12);
                    i_11 = i_9 * i_9 >> 12;
                    i_12 = i_10 * i_10 >> 12;
                }

                ints_3[i_4] = i_13 < anInt9743 - 1 ? (i_13 << 12) / anInt9743 : 0;
            }
        }

        return ints_3;
    }

    @Override
    void decode(int i_1, ByteBuf rsbytebuffer_2) {
        switch (i_1) {
            case 0:
                anInt9742 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 1:
                anInt9743 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 2:
                anInt9741 = rsbytebuffer_2.readUnsignedShort();
                break;
            case 3:
                anInt9740 = rsbytebuffer_2.readUnsignedShort();
        }

    }

}
