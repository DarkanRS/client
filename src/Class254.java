public abstract class Class254 implements Runnable {

    public static int anInt3145;

    volatile Class253[] aClass253Array3142 = new Class253[2];

    volatile boolean aBool3143 = false;

    volatile boolean aBool3144 = false;

    public static long method4379(CharSequence charsequence_0, int i_1) {
        int i_2 = charsequence_0.length();
        long long_3 = 0L;
        for (int i_5 = 0; i_5 < i_2; i_5++) {
            long_3 = (long_3 << 5) - long_3 + (long) charsequence_0.charAt(i_5);
        }
        return long_3;
    }

    static int method4380(byte[][] bytes_0, byte[][] bytes_1, int[] ints_2, byte[] bytes_3, int[] ints_4, int i_5, int i_6, int i_7) {
        int i_8 = ints_2[i_5];
        int i_9 = i_8 + ints_4[i_5];
        int i_10 = ints_2[i_6];
        int i_11 = i_10 + ints_4[i_6];
        int i_12 = i_8;
        if (i_10 > i_8) {
            i_12 = i_10;
        }
        int i_13 = i_9;
        if (i_11 < i_9) {
            i_13 = i_11;
        }
        int i_14 = bytes_3[i_5] & 0xff;
        if ((bytes_3[i_6] & 0xff) < i_14) {
            i_14 = bytes_3[i_6] & 0xff;
        }
        byte[] bytes_15 = bytes_1[i_5];
        byte[] bytes_16 = bytes_0[i_6];
        int i_17 = i_12 - i_8;
        int i_18 = i_12 - i_10;
        for (int i_19 = i_12; i_19 < i_13; i_19++) {
            int i_20 = bytes_15[i_17++] + bytes_16[i_18++];
            if (i_20 < i_14) {
                i_14 = i_20;
            }
        }
        return -i_14;
    }
}
