package com.jagex;

public class Class370_Sub2 extends Class370 {

    byte[] aByteArray7759;
    int anInt7758;
    int anInt7760;
    int[] anIntArray7761;

    Class370_Sub2() {
        super(12, 16, 2);
        anIntArray7761 = new int[anInt4290];

        for (int i_7 = 0; i_7 < anInt4290; i_7++) {
            anIntArray7761[i_7] = (short) ((int) (Math.pow((float) 0.45, i_7) * 4096.0D));
        }

    }

    void method12517(int i_1, byte b_2) {
        aByteArray7759[anInt7758++] = (byte) (((b_2 & 0xff) >> 1) + 127);
    }

    @Override
    void method6337(int i_1, int i_2) {
        anInt7760 += i_2 * anIntArray7761[i_1] >> 12;
    }

    @Override
    void method6332() {
        anInt7758 = 0;
        anInt7760 = 0;
    }

    @Override
    void method6327(int i_1, int i_2) {
        anInt7760 += i_2 * anIntArray7761[i_1] >> 12;
    }

    @Override
    void method6330() {
        anInt7758 = 0;
        anInt7760 = 0;
    }

    @Override
    void method6344() {
        anInt7760 = Math.abs(anInt7760);
        if (anInt7760 >= 4096) {
            anInt7760 = 4095;
        }

        method12517(anInt7758++, (byte) (anInt7760 >> 4));
        anInt7760 = 0;
    }

    @Override
    void method6331() {
        anInt7758 = 0;
        anInt7760 = 0;
    }

    @Override
    void method6333(int i_1, int i_2) {
        anInt7760 += i_2 * anIntArray7761[i_1] >> 12;
    }

    @Override
    void method6334(int i_1, int i_2) {
        anInt7760 += i_2 * anIntArray7761[i_1] >> 12;
    }

    @Override
    void method6321() {
        anInt7760 = Math.abs(anInt7760);
        if (anInt7760 >= 4096) {
            anInt7760 = 4095;
        }

        method12517(anInt7758++, (byte) (anInt7760 >> 4));
        anInt7760 = 0;
    }

    @Override
    void method6345() {
        anInt7760 = Math.abs(anInt7760);
        if (anInt7760 >= 4096) {
            anInt7760 = 4095;
        }

        method12517(anInt7758++, (byte) (anInt7760 >> 4));
        anInt7760 = 0;
    }

    @Override
    void method6340() {
        anInt7760 = Math.abs(anInt7760);
        if (anInt7760 >= 4096) {
            anInt7760 = 4095;
        }

        method12517(anInt7758++, (byte) (anInt7760 >> 4));
        anInt7760 = 0;
    }

}
