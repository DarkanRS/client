package com.jagex;

public class Class382 {

    public static int[] SINE = new int[16384];
    public static int[] COSINE = new int[16384];

    static {
        double step = 3.834951969714103E-4D;

        for (int i = 0; i < 16384; i++) {
            SINE[i] = (int) (16384.0D * Math.sin((double) i * step));
            COSINE[i] = (int) (16384.0D * Math.cos((double) i * step));
        }

    }

    Class382() throws Throwable {
        throw new Error();
    }

    public static float method6508(int i_0) {
        i_0 &= 0x3fff;
        return (float) ((double) ((float) i_0 / 16384.0F) * 6.283185307179586D);
    }

}
