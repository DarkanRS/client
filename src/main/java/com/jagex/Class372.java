package com.jagex;

public class Class372 implements Definition {

    public char aChar4328;
    public int anInt4327;

    public static short method6362(int i_0) {
        int i_2 = i_0 >> 10 & 0x3f;
        int i_3 = i_0 >> 3 & 0x70;
        int i_4 = i_0 & 0x7f;
        i_3 = i_4 <= 64 ? i_4 * i_3 >> 7 : i_3 * (127 - i_4) >> 7;
        int i_5 = i_3 + i_4;
        int i_6;
        if (i_5 != 0) {
            i_6 = (i_3 << 8) / i_5;
        } else {
            i_6 = i_3 << 1;
        }

        return (short) (i_2 << 10 | i_6 >> 4 << 7 | i_5);
    }

    void method6356(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }

            method6357(rsbytebuffer_1, i_3);
        }
    }

    void method6357(ByteBuf rsbytebuffer_1, int i_2) {
        if (i_2 == 1) {
            aChar4328 = Utils.cp1252ToChar(rsbytebuffer_1.readByte());
        } else if (i_2 == 5) {
            anInt4327 = rsbytebuffer_1.readUnsignedShort();
        }

    }

}
