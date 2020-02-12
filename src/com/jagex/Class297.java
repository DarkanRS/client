package com.jagex;

public class Class297 {

    static float[] aFloatArray3537 = new float[16384];
    static float[] aFloatArray3536 = new float[16384];

    static {
        double d_0 = 3.834951969714103E-4D;

        for (int i_2 = 0; i_2 < 16384; i_2++) {
            aFloatArray3537[i_2] = (float) Math.sin((double) i_2 * d_0);
            aFloatArray3536[i_2] = (float) Math.cos((double) i_2 * d_0);
        }

    }

    Class297() throws Throwable {
        throw new Error();
    }

}
