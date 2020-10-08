package com.jagex;

public abstract class Class254 implements Runnable {

    public static int anInt3145;

    volatile Class253[] aClass253Array3142 = new Class253[2];

    volatile boolean aBool3143;

    volatile boolean aBool3144;

    public static long method4379(CharSequence charsequence_0) {
        int i_2 = charsequence_0.length();
        long long_3 = 0L;
        for (int i_5 = 0; i_5 < i_2; i_5++) {
            long_3 = (long_3 << 5) - long_3 + charsequence_0.charAt(i_5);
        }
        return long_3;
    }
}
