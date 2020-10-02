package com.jagex;

public class Class497 {

    Class497() throws Throwable {
        throw new Error();
    }

    static void method8316(long[] longs_0, int[] ints_1, int i_2, int i_3) {
        if (i_2 < i_3) {
            int i_5 = (i_3 + i_2) / 2;
            int i_6 = i_2;
            long long_7 = longs_0[i_5];
            longs_0[i_5] = longs_0[i_3];
            longs_0[i_3] = long_7;
            int i_9 = ints_1[i_5];
            ints_1[i_5] = ints_1[i_3];
            ints_1[i_3] = i_9;
            int i_10 = long_7 == Long.MAX_VALUE ? 0 : 1;

            for (int i_11 = i_2; i_11 < i_3; i_11++) {
                if (longs_0[i_11] < (i_11 & i_10) + long_7) {
                    long long_12 = longs_0[i_11];
                    longs_0[i_11] = longs_0[i_6];
                    longs_0[i_6] = long_12;
                    int i_14 = ints_1[i_11];
                    ints_1[i_11] = ints_1[i_6];
                    ints_1[i_6++] = i_14;
                }
            }

            longs_0[i_3] = longs_0[i_6];
            longs_0[i_6] = long_7;
            ints_1[i_3] = ints_1[i_6];
            ints_1[i_6] = i_9;
            method8316(longs_0, ints_1, i_2, i_6 - 1);
            method8316(longs_0, ints_1, i_6 + 1, i_3);
        }

    }

}
