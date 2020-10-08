package com.jagex;

import java.util.Random;

public class Class476 {

    long aLong5627;

    int[] anIntArray5626;

    short[] aShortArray5628;

    short[] aShortArray5625;

    public Class476(long long_1, int[] ints_3, short[] shorts_4, short[] shorts_5) {
        aLong5627 = long_1;
        anIntArray5626 = ints_3;
        aShortArray5628 = shorts_4;
        aShortArray5625 = shorts_5;
    }

    public static int method7931(Random random_0, int i_1) {
        if (i_1 <= 0) {
            throw new IllegalArgumentException();
        } else if (CutsceneAction_Sub9.method14585(i_1)) {
            return (int) ((random_0.nextInt() & 0xffffffffL) * i_1 >> 32);
        } else {
            int i_3 = Integer.MIN_VALUE - (int) (4294967296L % i_1);
            int i_4;
            do {
                i_4 = random_0.nextInt();
            } while (i_4 >= i_3);
            return Class302.method5360(i_4, i_1);
        }
    }
}
