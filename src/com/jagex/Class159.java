package com.jagex;

public class Class159 {

    Class159() throws Throwable {
        throw new Error();
    }

    public static boolean method2734(String string_0, String string_1, String string_2, String string_3, byte b_4) {
        if (string_0 != null) {
            if (string_2 != null) {
                if (!string_0.startsWith("#")) {
                    if (b_4 >= -1) {
                        throw new IllegalStateException();
                    }
                    if (!string_2.startsWith("#")) {
                        return string_1.equals(string_3);
                    }
                    if (b_4 < -1) {
                    }
                }
                return string_0.equals(string_2);
            }
            if (b_4 >= -1) {
                throw new IllegalStateException();
            }
        }
        return false;
    }

    static int method2735(int i_0, int i_1, int i_2) {
        int i_4 = i_0 / i_2;
        int i_5 = i_0 & i_2 - 1;
        int i_6 = i_1 / i_2;
        int i_7 = i_1 & i_2 - 1;
        int i_8 = Class241.method4151(i_4, i_6);
        int i_9 = Class241.method4151(i_4 + 1, i_6);
        int i_10 = Class241.method4151(i_4, i_6 + 1);
        int i_11 = Class241.method4151(i_4 + 1, i_6 + 1);
        int i_12 = Class430.method7220(i_8, i_9, i_5, i_2);
        int i_13 = Class430.method7220(i_10, i_11, i_5, i_2);
        return Class430.method7220(i_12, i_13, i_7, i_2);
    }

    public static void method2736(long[] longs_0, int[] ints_1) {
        Class497.method8316(longs_0, ints_1, 0, longs_0.length - 1);
    }

    public static int method2739(int i_0) {
        int i_2 = 0;
        if (i_0 < 0 || i_0 >= 65536) {
            i_0 >>>= 16;
            i_2 += 16;
        }
        if (i_0 >= 256) {
            i_0 >>>= 8;
            i_2 += 8;
        }
        if (i_0 >= 16) {
            i_0 >>>= 4;
            i_2 += 4;
        }
        if (i_0 >= 4) {
            i_0 >>>= 2;
            i_2 += 2;
        }
        if (i_0 >= 1) {
            i_0 >>>= 1;
            ++i_2;
        }
        return i_0 + i_2;
    }

    public static void setNativeLibraryLoader(LibraryLoader interface36_0) {
        if (Class404.LIBRARY_LOADER != null) {
            throw new IllegalStateException("");
        } else {
            Class404.LIBRARY_LOADER = interface36_0;
        }
    }
}
