package com.jagex;

public class Class341 {

    static int anInt3996;
    public int anInt3992;
    public int anInt3993;
    public int anInt3994;
    public int anInt3995;

    static void method6074(String[] arr_0) {
        if (arr_0.length > 1) {
            for (int i_2 = 0; i_2 < arr_0.length; i_2++) {
                if (arr_0[i_2].startsWith("pause")) {
                    int i_3 = 5;
                    try {
                        i_3 = Integer.parseInt(arr_0[i_2].substring(6));
                    } catch (Exception ignored) {
                    }
                    Class209.printConsoleMessage("Pausing for " + i_3 + " seconds...");
                    Class276.aStringArray3345 = arr_0;
                    Class179.anInt2231 = i_2 + 1;
                    Class179.aLong2232 = Utils.time() + (i_3 * 1000);
                    break;
                }
                Class179.aString2225 = arr_0[i_2];
                Class165.method2853(false);
            }
        } else {
            Class179.aString2225 += arr_0[0];
            Class179.anInt2220 += arr_0[0].length();
        }
    }
}
