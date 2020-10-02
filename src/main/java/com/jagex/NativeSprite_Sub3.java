package com.jagex;

public class NativeSprite_Sub3 extends NativeSprite {

    boolean aBool9051;
    int anInt9057;
    int anInt9055;
    int anInt9049;
    int anInt9058;
    HardwareRenderer aGraphicalRenderer_Sub2_9052;
    int anInt9060;
    int anInt9053;
    Interface6 anInterface6_9050;
    Interface9 anInterface9_9054;
    boolean aBool9059;
    boolean aBool9056;
    boolean aBool9061;
    boolean aBool9062;

    NativeSprite_Sub3(HardwareRenderer class505_sub2_1, Interface6 interface6_2) {
        this(class505_sub2_1, interface6_2, interface6_2.method1(), interface6_2.method59());
    }

    NativeSprite_Sub3(HardwareRenderer class505_sub2_1, Interface6 interface6_2, int i_3, int i_4) {
        aBool9051 = false;
        anInt9057 = 0;
        anInt9055 = 0;
        anInt9049 = 0;
        anInt9058 = 0;
        aGraphicalRenderer_Sub2_9052 = class505_sub2_1;
        anInt9060 = i_3;
        anInt9053 = i_4;
        anInterface6_9050 = interface6_2;
        anInterface9_9054 = null;
        aBool9059 = anInterface6_9050.method1() != i_3;
        aBool9056 = anInterface6_9050.method59() != i_4;
        aBool9061 = !aBool9059 && anInterface6_9050.method46();
        aBool9062 = !aBool9056 && anInterface6_9050.method46();
        aGraphicalRenderer_Sub2_9052.method13896(12);
    }

    NativeSprite_Sub3(HardwareRenderer class505_sub2_1, int i_2, int i_3, int[] ints_4, int i_5, int i_6) {
        aBool9051 = false;
        anInt9057 = 0;
        anInt9055 = 0;
        anInt9049 = 0;
        anInt9058 = 0;
        aGraphicalRenderer_Sub2_9052 = class505_sub2_1;
        anInt9060 = i_2;
        anInt9053 = i_3;
        anInterface9_9054 = null;
        anInterface6_9050 = class505_sub2_1.method14094(i_2, i_3, false, ints_4, i_5, i_6);
        anInterface6_9050.method50(true, true);
        aBool9059 = anInterface6_9050.method1() != i_2;
        aBool9056 = anInterface6_9050.method59() != i_3;
        aBool9061 = !aBool9059 && anInterface6_9050.method46();
        aBool9062 = !aBool9056 && anInterface6_9050.method46();
        aGraphicalRenderer_Sub2_9052.method13896(12);
    }

    NativeSprite_Sub3(HardwareRenderer class505_sub2_1, int i_2, int i_3, boolean bool_4, boolean bool_5) {
        aBool9051 = false;
        anInt9057 = 0;
        anInt9055 = 0;
        anInt9049 = 0;
        anInt9058 = 0;
        aGraphicalRenderer_Sub2_9052 = class505_sub2_1;
        anInt9060 = i_2;
        anInt9053 = i_3;
        if (bool_5) {
            Interface29 interface29_6 = class505_sub2_1.method14064(bool_4 ? Class150.aClass150_1949 : Class150.aClass150_1950, Class76.aClass76_751, i_2, i_3);
            anInterface9_9054 = interface29_6.method200();
            anInterface6_9050 = interface29_6;
        } else {
            anInterface6_9050 = class505_sub2_1.method14072(bool_4 ? Class150.aClass150_1949 : Class150.aClass150_1950, Class76.aClass76_751, i_2, i_3);
            anInterface9_9054 = null;
        }

        anInterface6_9050.method50(true, true);
        aBool9059 = anInterface6_9050.method1() != i_2;
        aBool9056 = anInterface6_9050.method59() != i_3;
        aBool9061 = !aBool9059 && anInterface6_9050.method46();
        aBool9062 = !aBool9056 && anInterface6_9050.method46();
        aGraphicalRenderer_Sub2_9052.method13896(12);
    }

    @Override
    public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int[] ints_7 = aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
        if (ints_7 != null) {
            for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
                ints_7[i_8] |= -16777216;
            }

            method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
        }

    }

    @Override
    public int method2765() {
        return anInt9053;
    }

    @Override
    void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_7);
        Class47 class47_9 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_9.anInterface6_443 = anInterface6_9050;
        class47_9.method937(i_5, i_6);
        if (aBool9051) {
            i_3 = i_3 * anInt9060 / scaleWidth();
            i_4 = i_4 * anInt9053 / method2748();
            i_1 += i_3 * anInt9055 / anInt9060;
            i_2 += i_4 * anInt9057 / anInt9053;
        }

        float f_10 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_11 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_9.aClass384_442.method6525(i_3 * 2.0F / f_10, i_4 * 2.0F / f_11, 1.0F, 1.0F);
        class47_9.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
        class47_9.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_11 - 1.0F;
        class47_9.aClass384_442.buf[14] = -1.0f;
        class47_9.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_9.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_9.anInt446 = 0;
        class47_9.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_9.method936();
    }

    @Override
    public void method2751() {
        int[] ints_4 = aGraphicalRenderer_Sub2_9052.ab(0, 0, anInt9060, anInt9053);
        int[] ints_5 = new int[anInt9060 * anInt9053];
        anInterface6_9050.method53(anInt9060, anInt9053, ints_5);
        int i_6;
        int i_7;
        int i_8;
        if (false) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 8 & -16777216;
                }
            }
        } else if (false) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 16 & -16777216;
                }
            }
        } else if (false) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 24 & -16777216;
                }
            }
        } else if (true) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | (ints_4[i_7 + i_8] != 0 ? -16777216 : 0);
                }
            }
        }

        method14425(0, 0, anInt9060, anInt9053, ints_5, anInt9060);
    }

    @Override
    void method2798(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_9);
        float f_12;
        float f_13;
        if (aBool9051) {
            float f_11 = scaleWidth();
            f_12 = method2748();
            f_13 = (f_3 - f_1) / f_11;
            float f_14 = (f_4 - f_2) / f_11;
            float f_15 = (f_5 - f_1) / f_12;
            float f_16 = (f_6 - f_2) / f_12;
            float f_17 = f_15 * anInt9057;
            float f_18 = f_16 * anInt9057;
            float f_19 = f_13 * anInt9055;
            float f_20 = f_14 * anInt9055;
            float f_21 = -f_13 * anInt9058;
            float f_22 = -f_14 * anInt9058;
            float f_23 = -f_15 * anInt9049;
            float f_24 = -f_16 * anInt9049;
            f_1 = f_1 + f_19 + f_17;
            f_2 = f_2 + f_20 + f_18;
            f_3 = f_3 + f_21 + f_17;
            f_4 = f_4 + f_22 + f_18;
            f_5 = f_5 + f_19 + f_23;
            f_6 = f_6 + f_20 + f_24;
        }

        Class47 class47_25 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_25.anInterface6_443 = anInterface6_9050;
        class47_25.method937(i_7, i_8);
        f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_25.aClass384_442.identity();
        class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[12] = (f_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
        class47_25.aClass384_442.buf[13] = (f_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
        class47_25.aClass384_442.buf[14] = -1.0f;
        class47_25.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_25.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_25.anInt446 = 0;
        class47_25.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_25.method936();
    }

    @Override
    public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int[] ints_7 = aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
        if (ints_7 != null) {
            for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
                ints_7[i_8] |= -16777216;
            }

            method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
        }

    }

    @Override
    public int method2747() {
        return anInt9060;
    }

    @Override
    public int method2786() {
        return anInt9060;
    }

    @Override
    public int method2793() {
        return anInt9053;
    }

    @Override
    void method2764(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_9);
        float f_12;
        float f_13;
        if (aBool9051) {
            float f_11 = scaleWidth();
            f_12 = method2748();
            f_13 = (f_3 - f_1) / f_11;
            float f_14 = (f_4 - f_2) / f_11;
            float f_15 = (f_5 - f_1) / f_12;
            float f_16 = (f_6 - f_2) / f_12;
            float f_17 = f_15 * anInt9057;
            float f_18 = f_16 * anInt9057;
            float f_19 = f_13 * anInt9055;
            float f_20 = f_14 * anInt9055;
            float f_21 = -f_13 * anInt9058;
            float f_22 = -f_14 * anInt9058;
            float f_23 = -f_15 * anInt9049;
            float f_24 = -f_16 * anInt9049;
            f_1 = f_1 + f_19 + f_17;
            f_2 = f_2 + f_20 + f_18;
            f_3 = f_3 + f_21 + f_17;
            f_4 = f_4 + f_22 + f_18;
            f_5 = f_5 + f_19 + f_23;
            f_6 = f_6 + f_20 + f_24;
        }

        Class47 class47_25 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_25.anInterface6_443 = anInterface6_9050;
        class47_25.method937(i_7, i_8);
        f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_25.aClass384_442.identity();
        class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[12] = (f_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
        class47_25.aClass384_442.buf[13] = (f_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
        class47_25.aClass384_442.buf[14] = -1.0f;
        class47_25.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_25.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_25.anInt446 = 0;
        class47_25.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_25.method936();
    }

    @Override
    public Interface9 method2808() {
        return anInterface9_9054;
    }

    @Override
    public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int[] ints_7 = aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
        if (ints_7 != null) {
            for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
                ints_7[i_8] |= -16777216;
            }

            method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
        }

    }

    @Override
    public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
        aGraphicalRenderer_Sub2_9052.method13935();
        Class47 class47_6 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_6.anInterface6_443 = anInterface6_9050;
        class47_6.method937(1, -1);
        i_1 += anInt9055;
        i_2 += anInt9057;
        float f_7 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_8 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_6.aClass384_442.method6525(anInt9060 * 2.0F / f_7, anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0f;
        class47_6.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_6.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_6.anInt446 = 0;
        class47_6.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        Interface6 interface6_9 = ((Class455_Sub1) class455_3).anInterface6_8508;
        class47_6.anInterface6_441 = interface6_9;
        class47_6.aClass384_444.method6525(interface6_9.method47(anInt9060), interface6_9.method62(anInt9053), 1.0F, 1.0F);
        class47_6.aClass384_444.buf[12] = interface6_9.method47((i_1 - i_4));
        class47_6.aClass384_444.buf[13] = interface6_9.method62((i_2 - i_5));
        class47_6.method938();
    }

    @Override
    public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
        aGraphicalRenderer_Sub2_9052.method13935();
        Class47 class47_6 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_6.anInterface6_443 = anInterface6_9050;
        class47_6.method937(1, -1);
        i_1 += anInt9055;
        i_2 += anInt9057;
        float f_7 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_8 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_6.aClass384_442.method6525(anInt9060 * 2.0F / f_7, anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0f;
        class47_6.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_6.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_6.anInt446 = 0;
        class47_6.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        Interface6 interface6_9 = ((Class455_Sub1) class455_3).anInterface6_8508;
        class47_6.anInterface6_441 = interface6_9;
        class47_6.aClass384_444.method6525(interface6_9.method47(anInt9060), interface6_9.method62(anInt9053), 1.0F, 1.0F);
        class47_6.aClass384_444.buf[12] = interface6_9.method47((i_1 - i_4));
        class47_6.aClass384_444.buf[13] = interface6_9.method62((i_2 - i_5));
        class47_6.method938();
    }

    @Override
    public Interface9 method2801() {
        return anInterface9_9054;
    }

    @Override
    public void method2772(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_7);
        Class47 class47_8 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_8.anInterface6_443 = anInterface6_9050;
        class47_8.method937(i_5, i_6);
        float f_9 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_10 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_8.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_8.anInt446 = 0;
        class47_8.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        boolean bool_11 = aBool9062 && anInt9057 == 0 && anInt9049 == 0;
        boolean bool_12 = aBool9061 && anInt9055 == 0 && anInt9058 == 0;
        if (bool_12 & bool_11) {
            class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
            class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
            class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
            class47_8.aClass384_442.buf[14] = -1.0f;
            class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
            class47_8.method936();
        } else {
            int i_13;
            int i_14;
            int i_15;
            int i_16;
            if (bool_12) {
                i_13 = i_2 + i_4;
                i_14 = method2748();
                class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                i_15 = i_2 + anInt9057;

                for (i_16 = i_15 + anInt9053; i_16 <= i_13; i_16 += i_14) {
                    class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                    i_15 += i_14;
                }

                if (i_15 < i_13) {
                    i_16 = i_13 - i_15;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(i_16), 1.0F, 1.0F);
                    class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, i_16 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                }
            } else if (bool_11) {
                i_13 = i_3 + i_1;
                i_14 = scaleWidth();
                class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
                i_15 = anInt9055 + i_1;

                for (i_16 = i_15 + anInt9060; i_16 <= i_13; i_16 += i_14) {
                    class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                    i_15 += i_14;
                }

                if (i_15 < i_13) {
                    i_16 = i_13 - i_15;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_16), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
                    class47_8.aClass384_442.method6525(i_16 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                }
            } else {
                i_13 = i_2 + i_4;
                i_14 = i_3 + i_1;
                i_15 = scaleWidth();
                i_16 = method2748();
                int i_17 = i_2 + anInt9057;

                int i_18;
                int i_19;
                int i_20;
                for (i_18 = i_17 + anInt9053; i_18 <= i_13; i_18 += i_16) {
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                    i_19 = anInt9055 + i_1;

                    for (i_20 = i_19 + anInt9060; i_20 <= i_14; i_20 += i_15) {
                        class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                        i_19 += i_15;
                    }

                    if (i_19 < i_14) {
                        i_20 = i_14 - i_19;
                        class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_20), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                        class47_8.aClass384_442.method6525(i_20 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                    }

                    i_17 += i_16;
                }

                if (i_17 < i_13) {
                    i_18 = i_13 - i_17;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(i_18), 1.0F, 1.0F);
                    i_19 = anInt9055 + i_1;

                    for (i_20 = i_19 + anInt9060; i_20 <= i_14; i_20 += i_15) {
                        class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, i_18 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                        i_19 += i_15;
                    }

                    if (i_19 < i_14) {
                        i_20 = i_14 - i_19;
                        class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_20), anInterface6_9050.method62(i_18), 1.0F, 1.0F);
                        class47_8.aClass384_442.method6525(i_20 * 2.0F / f_9, i_18 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                    }
                }
            }
        }

    }

    @Override
    public int method2792() {
        return anInt9053 + anInt9057 + anInt9049;
    }

    @Override
    void method2766(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
        aGraphicalRenderer_Sub2_9052.method13935();
        Class47 class47_11 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_11.anInterface6_443 = anInterface6_9050;
        class47_11.method937(1, -1);
        float f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_11.aClass384_442.identity();
        if (aBool9051) {
            float f_14 = (float) anInt9060 / scaleWidth();
            float f_15 = (float) anInt9053 / method2748();
            class47_11.aClass384_442.buf[0] = (f_3 - f_1) * f_14;
            class47_11.aClass384_442.buf[1] = (f_4 - f_2) * f_14;
            class47_11.aClass384_442.buf[4] = (f_5 - f_1) * f_15;
            class47_11.aClass384_442.buf[5] = (f_6 - f_2) * f_15;
            class47_11.aClass384_442.buf[12] = (f_1 + anInt9055) * f_14 + aGraphicalRenderer_Sub2_9052.method13905();
            class47_11.aClass384_442.buf[13] = (f_2 + anInt9057) * f_15 + aGraphicalRenderer_Sub2_9052.method13905();
        } else {
            class47_11.aClass384_442.buf[0] = f_3 - f_1;
            class47_11.aClass384_442.buf[1] = f_4 - f_2;
            class47_11.aClass384_442.buf[4] = f_5 - f_1;
            class47_11.aClass384_442.buf[5] = f_6 - f_2;
            class47_11.aClass384_442.buf[12] = f_1 + aGraphicalRenderer_Sub2_9052.method13905();
            class47_11.aClass384_442.buf[13] = f_2 + aGraphicalRenderer_Sub2_9052.method13905();
        }

        Matrix44 matrix44_16 = aGraphicalRenderer_Sub2_9052.aClass384_8683;
        matrix44_16.identity();
        matrix44_16.buf[0] = 2.0F / f_12;
        matrix44_16.buf[5] = 2.0F / f_13;
        matrix44_16.buf[12] = -1.0f;
        matrix44_16.buf[13] = -1.0f;
        matrix44_16.buf[14] = -1.0f;
        class47_11.aClass384_442.method6523(matrix44_16);
        class47_11.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_11.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_11.anInt446 = 0;
        class47_11.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        Interface6 interface6_17 = ((Class455_Sub1) class455_8).anInterface6_8508;
        class47_11.anInterface6_441 = interface6_17;
        class47_11.aClass384_444.identity();
        class47_11.aClass384_444.buf[0] = (f_3 - f_1) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[1] = (f_4 - f_2) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[4] = (f_5 - f_1) * interface6_17.method62(1.0F);
        class47_11.aClass384_444.buf[5] = (f_6 - f_2) * interface6_17.method62(1.0F);
        class47_11.aClass384_444.buf[12] = (f_1 - i_9) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[13] = (f_2 - i_10) * interface6_17.method62(1.0F);
        class47_11.method938();
    }

    @Override
    public void method2796(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_7);
        Class47 class47_8 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_8.anInterface6_443 = anInterface6_9050;
        class47_8.method937(i_5, i_6);
        float f_9 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_10 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_8.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_8.anInt446 = 0;
        class47_8.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        boolean bool_11 = aBool9062 && anInt9057 == 0 && anInt9049 == 0;
        boolean bool_12 = aBool9061 && anInt9055 == 0 && anInt9058 == 0;
        if (bool_12 & bool_11) {
            class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
            class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
            class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
            class47_8.aClass384_442.buf[14] = -1.0f;
            class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
            class47_8.method936();
        } else {
            int i_13;
            int i_14;
            int i_15;
            int i_16;
            if (bool_12) {
                i_13 = i_2 + i_4;
                i_14 = method2748();
                class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                i_15 = i_2 + anInt9057;

                for (i_16 = i_15 + anInt9053; i_16 <= i_13; i_16 += i_14) {
                    class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                    i_15 += i_14;
                }

                if (i_15 < i_13) {
                    i_16 = i_13 - i_15;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(i_16), 1.0F, 1.0F);
                    class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, i_16 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                }
            } else if (bool_11) {
                i_13 = i_1 + i_3;
                i_14 = scaleWidth();
                class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
                i_15 = i_1 + anInt9055;

                for (i_16 = i_15 + anInt9060; i_16 <= i_13; i_16 += i_14) {
                    class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                    i_15 += i_14;
                }

                if (i_15 < i_13) {
                    i_16 = i_13 - i_15;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_16), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
                    class47_8.aClass384_442.method6525(i_16 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                }
            } else {
                i_13 = i_2 + i_4;
                i_14 = i_1 + i_3;
                i_15 = scaleWidth();
                i_16 = method2748();
                int i_17 = i_2 + anInt9057;

                int i_18;
                int i_19;
                int i_20;
                for (i_18 = i_17 + anInt9053; i_18 <= i_13; i_18 += i_16) {
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                    i_19 = i_1 + anInt9055;

                    for (i_20 = i_19 + anInt9060; i_20 <= i_14; i_20 += i_15) {
                        class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                        i_19 += i_15;
                    }

                    if (i_19 < i_14) {
                        i_20 = i_14 - i_19;
                        class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_20), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                        class47_8.aClass384_442.method6525(i_20 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                    }

                    i_17 += i_16;
                }

                if (i_17 < i_13) {
                    i_18 = i_13 - i_17;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(i_18), 1.0F, 1.0F);
                    i_19 = i_1 + anInt9055;

                    for (i_20 = i_19 + anInt9060; i_20 <= i_14; i_20 += i_15) {
                        class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, i_18 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                        i_19 += i_15;
                    }

                    if (i_19 < i_14) {
                        i_20 = i_14 - i_19;
                        class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_20), anInterface6_9050.method62(i_18), 1.0F, 1.0F);
                        class47_8.aClass384_442.method6525(i_20 * 2.0F / f_9, i_18 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                    }
                }
            }
        }

    }

    @Override
    public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_5);
        Class47 class47_6 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_6.anInterface6_443 = anInterface6_9050;
        class47_6.method937(i_3, i_4);
        i_1 += anInt9055;
        i_2 += anInt9057;
        float f_7 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_8 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_6.aClass384_442.method6525(anInt9060 * 2.0F / f_7, anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0f;
        class47_6.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_6.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_6.anInt446 = 0;
        class47_6.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_6.method936();
    }

    @Override
    public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int[] ints_7 = aGraphicalRenderer_Sub2_9052.ab(i_5, i_6, i_3, i_4);
        if (ints_7 != null) {
            for (int i_8 = 0; i_8 < ints_7.length; i_8++) {
                ints_7[i_8] |= -16777216;
            }

            method14425(i_1, i_2, i_3, i_4, ints_7, i_3);
        }

    }

    @Override
    public void method2770(int i_1, int i_2, int i_3) {
        int[] ints_4 = aGraphicalRenderer_Sub2_9052.ab(i_1, i_2, anInt9060, anInt9053);
        int[] ints_5 = new int[anInt9060 * anInt9053];
        anInterface6_9050.method53(anInt9060, anInt9053, ints_5);
        int i_6;
        int i_7;
        int i_8;
        if (i_3 == 0) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 8 & -16777216;
                }
            }
        } else if (i_3 == 1) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 16 & -16777216;
                }
            }
        } else if (i_3 == 2) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 24 & -16777216;
                }
            }
        } else if (i_3 == 3) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | (ints_4[i_7 + i_8] != 0 ? -16777216 : 0);
                }
            }
        }

        method14425(0, 0, anInt9060, anInt9053, ints_5, anInt9060);
    }

    @Override
    public void method2783(int i_1, int i_2, int i_3, int i_4) {
        anInt9055 = i_1;
        anInt9057 = i_2;
        anInt9058 = i_3;
        anInt9049 = i_4;
        aBool9051 = anInt9055 != 0 || anInt9057 != 0 || anInt9058 != 0 || anInt9049 != 0;
    }

    void method14425(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_7) {
        anInterface6_9050.method48(i_1, i_2, i_3, i_4, ints_5, 0, i_7);
    }

    @Override
    public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
        aGraphicalRenderer_Sub2_9052.method13935();
        Class47 class47_6 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_6.anInterface6_443 = anInterface6_9050;
        class47_6.method937(1, -1);
        i_1 += anInt9055;
        i_2 += anInt9057;
        float f_7 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_8 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_6.aClass384_442.method6525(anInt9060 * 2.0F / f_7, anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0f;
        class47_6.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_6.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_6.anInt446 = 0;
        class47_6.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        Interface6 interface6_9 = ((Class455_Sub1) class455_3).anInterface6_8508;
        class47_6.anInterface6_441 = interface6_9;
        class47_6.aClass384_444.method6525(interface6_9.method47(anInt9060), interface6_9.method62(anInt9053), 1.0F, 1.0F);
        class47_6.aClass384_444.buf[12] = interface6_9.method47((i_1 - i_4));
        class47_6.aClass384_444.buf[13] = interface6_9.method62((i_2 - i_5));
        class47_6.method938();
    }

    @Override
    public int method2757() {
        return anInt9053 + anInt9057 + anInt9049;
    }

    @Override
    public void method2743(int i_1, int i_2, int i_3, int i_4) {
        anInt9055 = i_1;
        anInt9057 = i_2;
        anInt9058 = i_3;
        anInt9049 = i_4;
        aBool9051 = anInt9055 != 0 || anInt9057 != 0 || anInt9058 != 0 || anInt9049 != 0;
    }

    @Override
    void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_7);
        Class47 class47_9 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_9.anInterface6_443 = anInterface6_9050;
        class47_9.method937(i_5, i_6);
        if (aBool9051) {
            i_3 = i_3 * anInt9060 / scaleWidth();
            i_4 = i_4 * anInt9053 / method2748();
            i_1 += anInt9055 * i_3 / anInt9060;
            i_2 += anInt9057 * i_4 / anInt9053;
        }

        float f_10 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_11 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_9.aClass384_442.method6525(i_3 * 2.0F / f_10, i_4 * 2.0F / f_11, 1.0F, 1.0F);
        class47_9.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
        class47_9.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_11 - 1.0F;
        class47_9.aClass384_442.buf[14] = -1.0f;
        class47_9.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_9.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_9.anInt446 = 0;
        class47_9.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_9.method936();
    }

    @Override
    public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_5);
        Class47 class47_6 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_6.anInterface6_443 = anInterface6_9050;
        class47_6.method937(i_3, i_4);
        i_1 += anInt9055;
        i_2 += anInt9057;
        float f_7 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_8 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_6.aClass384_442.method6525(anInt9060 * 2.0F / f_7, anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0f;
        class47_6.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_6.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_6.anInt446 = 0;
        class47_6.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_6.method936();
    }

    @Override
    public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_5);
        Class47 class47_6 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_6.anInterface6_443 = anInterface6_9050;
        class47_6.method937(i_3, i_4);
        i_1 += anInt9055;
        i_2 += anInt9057;
        float f_7 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_8 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_6.aClass384_442.method6525(anInt9060 * 2.0F / f_7, anInt9053 * 2.0F / f_8, 1.0F, 1.0F);
        class47_6.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_7 - 1.0F;
        class47_6.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_8 - 1.0F;
        class47_6.aClass384_442.buf[14] = -1.0f;
        class47_6.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_6.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_6.anInt446 = 0;
        class47_6.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_6.method936();
    }

    @Override
    void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_7);
        Class47 class47_9 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_9.anInterface6_443 = anInterface6_9050;
        class47_9.method937(i_5, i_6);
        if (aBool9051) {
            i_3 = i_3 * anInt9060 / scaleWidth();
            i_4 = i_4 * anInt9053 / method2748();
            i_1 += anInt9055 * i_3 / anInt9060;
            i_2 += anInt9057 * i_4 / anInt9053;
        }

        float f_10 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_11 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_9.aClass384_442.method6525(i_3 * 2.0F / f_10, i_4 * 2.0F / f_11, 1.0F, 1.0F);
        class47_9.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
        class47_9.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_11 - 1.0F;
        class47_9.aClass384_442.buf[14] = -1.0f;
        class47_9.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_9.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_9.anInt446 = 0;
        class47_9.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_9.method936();
    }

    @Override
    public int method2794() {
        return anInt9060;
    }

    @Override
    public void method2781(int i_1, int i_2, int i_3, int i_4) {
        anInt9055 = i_1;
        anInt9057 = i_2;
        anInt9058 = i_3;
        anInt9049 = i_4;
        aBool9051 = anInt9055 != 0 || anInt9057 != 0 || anInt9058 != 0 || anInt9049 != 0;
    }

    @Override
    public void method2782(int[] ints_1) {
        ints_1[0] = anInt9055;
        ints_1[1] = anInt9057;
        ints_1[2] = anInt9058;
        ints_1[3] = anInt9049;
    }

    @Override
    public void method2804(int[] ints_1) {
        ints_1[0] = anInt9055;
        ints_1[1] = anInt9057;
        ints_1[2] = anInt9058;
        ints_1[3] = anInt9049;
    }

    @Override
    public void method2777(int[] ints_1) {
        ints_1[0] = anInt9055;
        ints_1[1] = anInt9057;
        ints_1[2] = anInt9058;
        ints_1[3] = anInt9049;
    }

    @Override
    public void method2785(int[] ints_1) {
        ints_1[0] = anInt9055;
        ints_1[1] = anInt9057;
        ints_1[2] = anInt9058;
        ints_1[3] = anInt9049;
    }

    @Override
    public int method2788() {
        return anInt9053;
    }

    @Override
    public int method2748() {
        return anInt9053 + anInt9057 + anInt9049;
    }

    @Override
    public void method2771(int i_1, int i_2, int i_3) {
        int[] ints_4 = aGraphicalRenderer_Sub2_9052.ab(i_1, i_2, anInt9060, anInt9053);
        int[] ints_5 = new int[anInt9060 * anInt9053];
        anInterface6_9050.method53(anInt9060, anInt9053, ints_5);
        int i_6;
        int i_7;
        int i_8;
        if (i_3 == 0) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 8 & -16777216;
                }
            }
        } else if (i_3 == 1) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 16 & -16777216;
                }
            }
        } else if (i_3 == 2) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | ints_4[i_7 + i_8] << 24 & -16777216;
                }
            }
        } else if (i_3 == 3) {
            for (i_6 = 0; i_6 < anInt9053; i_6++) {
                i_7 = i_6 * anInt9060;

                for (i_8 = 0; i_8 < anInt9060; i_8++) {
                    ints_5[i_7 + i_8] = ints_5[i_7 + i_8] & 0xffffff | (ints_4[i_7 + i_8] != 0 ? -16777216 : 0);
                }
            }
        }

        method14425(0, 0, anInt9060, anInt9053, ints_5, anInt9060);
    }

    @Override
    public void method2744(int[] ints_1) {
        ints_1[0] = anInt9055;
        ints_1[1] = anInt9057;
        ints_1[2] = anInt9058;
        ints_1[3] = anInt9049;
    }

    @Override
    public void method2780(int i_1, int i_2, int i_3, int i_4) {
        anInt9055 = i_1;
        anInt9057 = i_2;
        anInt9058 = i_3;
        anInt9049 = i_4;
        aBool9051 = anInt9055 != 0 || anInt9057 != 0 || anInt9058 != 0 || anInt9049 != 0;
    }

    @Override
    public int method2753() {
        return anInt9053 + anInt9057 + anInt9049;
    }

    @Override
    public void method2799(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_7);
        Class47 class47_8 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_8.anInterface6_443 = anInterface6_9050;
        class47_8.method937(i_5, i_6);
        float f_9 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_10 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_8.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_8.anInt446 = 0;
        class47_8.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        boolean bool_11 = aBool9062 && anInt9057 == 0 && anInt9049 == 0;
        boolean bool_12 = aBool9061 && anInt9055 == 0 && anInt9058 == 0;
        if (bool_12 & bool_11) {
            class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
            class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
            class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
            class47_8.aClass384_442.buf[14] = -1.0f;
            class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
            class47_8.method936();
        } else {
            int i_13;
            int i_14;
            int i_15;
            int i_16;
            if (bool_12) {
                i_13 = i_2 + i_4;
                i_14 = method2748();
                class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                i_15 = i_2 + anInt9057;

                for (i_16 = i_15 + anInt9053; i_16 <= i_13; i_16 += i_14) {
                    class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                    i_15 += i_14;
                }

                if (i_15 < i_13) {
                    i_16 = i_13 - i_15;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_3), anInterface6_9050.method62(i_16), 1.0F, 1.0F);
                    class47_8.aClass384_442.method6525(i_3 * 2.0F / f_9, i_16 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                }
            } else if (bool_11) {
                i_13 = i_1 + i_3;
                i_14 = scaleWidth();
                class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
                i_15 = i_1 + anInt9055;

                for (i_16 = i_15 + anInt9060; i_16 <= i_13; i_16 += i_14) {
                    class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                    i_15 += i_14;
                }

                if (i_15 < i_13) {
                    i_16 = i_13 - i_15;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_16), anInterface6_9050.method62(i_4), 1.0F, 1.0F);
                    class47_8.aClass384_442.method6525(i_16 * 2.0F / f_9, i_4 * 2.0F / f_10, 1.0F, 1.0F);
                    class47_8.aClass384_442.buf[12] = (i_15 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                    class47_8.aClass384_442.buf[13] = (i_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                    class47_8.aClass384_442.buf[14] = -1.0f;
                    class47_8.method936();
                }
            } else {
                i_13 = i_2 + i_4;
                i_14 = i_1 + i_3;
                i_15 = scaleWidth();
                i_16 = method2748();
                int i_17 = i_2 + anInt9057;

                int i_18;
                int i_19;
                int i_20;
                for (i_18 = i_17 + anInt9053; i_18 <= i_13; i_18 += i_16) {
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                    i_19 = i_1 + anInt9055;

                    for (i_20 = i_19 + anInt9060; i_20 <= i_14; i_20 += i_15) {
                        class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                        i_19 += i_15;
                    }

                    if (i_19 < i_14) {
                        i_20 = i_14 - i_19;
                        class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_20), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
                        class47_8.aClass384_442.method6525(i_20 * 2.0F / f_9, anInt9053 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                    }

                    i_17 += i_16;
                }

                if (i_17 < i_13) {
                    i_18 = i_13 - i_17;
                    class47_8.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(i_18), 1.0F, 1.0F);
                    i_19 = i_1 + anInt9055;

                    for (i_20 = i_19 + anInt9060; i_20 <= i_14; i_20 += i_15) {
                        class47_8.aClass384_442.method6525(anInt9060 * 2.0F / f_9, i_18 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                        i_19 += i_15;
                    }

                    if (i_19 < i_14) {
                        i_20 = i_14 - i_19;
                        class47_8.aClass384_440.method6525(anInterface6_9050.method47(i_20), anInterface6_9050.method62(i_18), 1.0F, 1.0F);
                        class47_8.aClass384_442.method6525(i_20 * 2.0F / f_9, i_18 * 2.0F / f_10, 1.0F, 1.0F);
                        class47_8.aClass384_442.buf[12] = (i_19 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_9 - 1.0F;
                        class47_8.aClass384_442.buf[13] = (i_17 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_10 - 1.0F;
                        class47_8.aClass384_442.buf[14] = -1.0f;
                        class47_8.method936();
                    }
                }
            }
        }

    }

    @Override
    public int scaleWidth() {
        return anInt9060 + anInt9055 + anInt9058;
    }

    @Override
    void method2791(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_9);
        float f_12;
        float f_13;
        if (aBool9051) {
            float f_11 = scaleWidth();
            f_12 = method2748();
            f_13 = (f_3 - f_1) / f_11;
            float f_14 = (f_4 - f_2) / f_11;
            float f_15 = (f_5 - f_1) / f_12;
            float f_16 = (f_6 - f_2) / f_12;
            float f_17 = f_15 * anInt9057;
            float f_18 = f_16 * anInt9057;
            float f_19 = f_13 * anInt9055;
            float f_20 = f_14 * anInt9055;
            float f_21 = -f_13 * anInt9058;
            float f_22 = -f_14 * anInt9058;
            float f_23 = -f_15 * anInt9049;
            float f_24 = -f_16 * anInt9049;
            f_1 = f_1 + f_19 + f_17;
            f_2 = f_2 + f_20 + f_18;
            f_3 = f_3 + f_21 + f_17;
            f_4 = f_4 + f_22 + f_18;
            f_5 = f_5 + f_19 + f_23;
            f_6 = f_6 + f_20 + f_24;
        }

        Class47 class47_25 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_25.anInterface6_443 = anInterface6_9050;
        class47_25.method937(i_7, i_8);
        f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_25.aClass384_442.identity();
        class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[12] = (f_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
        class47_25.aClass384_442.buf[13] = (f_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
        class47_25.aClass384_442.buf[14] = -1.0f;
        class47_25.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_25.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_25.anInt446 = 0;
        class47_25.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_25.method936();
    }

    @Override
    void method2812(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
        aGraphicalRenderer_Sub2_9052.method13935();
        aGraphicalRenderer_Sub2_9052.method13904(i_9);
        float f_12;
        float f_13;
        if (aBool9051) {
            float f_11 = scaleWidth();
            f_12 = method2748();
            f_13 = (f_3 - f_1) / f_11;
            float f_14 = (f_4 - f_2) / f_11;
            float f_15 = (f_5 - f_1) / f_12;
            float f_16 = (f_6 - f_2) / f_12;
            float f_17 = f_15 * anInt9057;
            float f_18 = f_16 * anInt9057;
            float f_19 = f_13 * anInt9055;
            float f_20 = f_14 * anInt9055;
            float f_21 = -f_13 * anInt9058;
            float f_22 = -f_14 * anInt9058;
            float f_23 = -f_15 * anInt9049;
            float f_24 = -f_16 * anInt9049;
            f_1 = f_1 + f_19 + f_17;
            f_2 = f_2 + f_20 + f_18;
            f_3 = f_3 + f_21 + f_17;
            f_4 = f_4 + f_22 + f_18;
            f_5 = f_5 + f_19 + f_23;
            f_6 = f_6 + f_20 + f_24;
        }

        Class47 class47_25 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_25.anInterface6_443 = anInterface6_9050;
        class47_25.method937(i_7, i_8);
        f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_25.aClass384_442.identity();
        class47_25.aClass384_442.buf[0] = (f_3 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[1] = (f_4 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[4] = (f_5 - f_1) * 2.0F / f_12;
        class47_25.aClass384_442.buf[5] = (f_6 - f_2) * 2.0F / f_13;
        class47_25.aClass384_442.buf[12] = (f_1 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_12 - 1.0F;
        class47_25.aClass384_442.buf[13] = (f_2 + aGraphicalRenderer_Sub2_9052.method13905()) * 2.0F / f_13 - 1.0F;
        class47_25.aClass384_442.buf[14] = -1.0f;
        class47_25.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_25.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_25.anInt446 = 0;
        class47_25.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        class47_25.method936();
    }

    @Override
    void method2800(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
        aGraphicalRenderer_Sub2_9052.method13935();
        Class47 class47_11 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_11.anInterface6_443 = anInterface6_9050;
        class47_11.method937(1, -1);
        float f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_11.aClass384_442.identity();
        if (aBool9051) {
            float f_14 = (float) anInt9060 / scaleWidth();
            float f_15 = (float) anInt9053 / method2748();
            class47_11.aClass384_442.buf[0] = (f_3 - f_1) * f_14;
            class47_11.aClass384_442.buf[1] = (f_4 - f_2) * f_14;
            class47_11.aClass384_442.buf[4] = (f_5 - f_1) * f_15;
            class47_11.aClass384_442.buf[5] = (f_6 - f_2) * f_15;
            class47_11.aClass384_442.buf[12] = (f_1 + anInt9055) * f_14 + aGraphicalRenderer_Sub2_9052.method13905();
            class47_11.aClass384_442.buf[13] = (f_2 + anInt9057) * f_15 + aGraphicalRenderer_Sub2_9052.method13905();
        } else {
            class47_11.aClass384_442.buf[0] = f_3 - f_1;
            class47_11.aClass384_442.buf[1] = f_4 - f_2;
            class47_11.aClass384_442.buf[4] = f_5 - f_1;
            class47_11.aClass384_442.buf[5] = f_6 - f_2;
            class47_11.aClass384_442.buf[12] = f_1 + aGraphicalRenderer_Sub2_9052.method13905();
            class47_11.aClass384_442.buf[13] = f_2 + aGraphicalRenderer_Sub2_9052.method13905();
        }

        Matrix44 matrix44_16 = aGraphicalRenderer_Sub2_9052.aClass384_8683;
        matrix44_16.identity();
        matrix44_16.buf[0] = 2.0F / f_12;
        matrix44_16.buf[5] = 2.0F / f_13;
        matrix44_16.buf[12] = -1.0f;
        matrix44_16.buf[13] = -1.0f;
        matrix44_16.buf[14] = -1.0f;
        class47_11.aClass384_442.method6523(matrix44_16);
        class47_11.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_11.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_11.anInt446 = 0;
        class47_11.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        Interface6 interface6_17 = ((Class455_Sub1) class455_8).anInterface6_8508;
        class47_11.anInterface6_441 = interface6_17;
        class47_11.aClass384_444.identity();
        class47_11.aClass384_444.buf[0] = (f_3 - f_1) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[1] = (f_4 - f_2) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[4] = (f_5 - f_1) * interface6_17.method62(1.0F);
        class47_11.aClass384_444.buf[5] = (f_6 - f_2) * interface6_17.method62(1.0F);
        class47_11.aClass384_444.buf[12] = (f_1 - i_9) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[13] = (f_2 - i_10) * interface6_17.method62(1.0F);
        class47_11.method938();
    }

    @Override
    void method2811(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
        aGraphicalRenderer_Sub2_9052.method13935();
        Class47 class47_11 = aGraphicalRenderer_Sub2_9052.aClass47_8698;
        class47_11.anInterface6_443 = anInterface6_9050;
        class47_11.method937(1, -1);
        float f_12 = aGraphicalRenderer_Sub2_9052.method8523().method2714();
        float f_13 = aGraphicalRenderer_Sub2_9052.method8523().method2716();
        class47_11.aClass384_442.identity();
        if (aBool9051) {
            float f_14 = (float) anInt9060 / scaleWidth();
            float f_15 = (float) anInt9053 / method2748();
            class47_11.aClass384_442.buf[0] = (f_3 - f_1) * f_14;
            class47_11.aClass384_442.buf[1] = (f_4 - f_2) * f_14;
            class47_11.aClass384_442.buf[4] = (f_5 - f_1) * f_15;
            class47_11.aClass384_442.buf[5] = (f_6 - f_2) * f_15;
            class47_11.aClass384_442.buf[12] = (f_1 + anInt9055) * f_14 + aGraphicalRenderer_Sub2_9052.method13905();
            class47_11.aClass384_442.buf[13] = (f_2 + anInt9057) * f_15 + aGraphicalRenderer_Sub2_9052.method13905();
        } else {
            class47_11.aClass384_442.buf[0] = f_3 - f_1;
            class47_11.aClass384_442.buf[1] = f_4 - f_2;
            class47_11.aClass384_442.buf[4] = f_5 - f_1;
            class47_11.aClass384_442.buf[5] = f_6 - f_2;
            class47_11.aClass384_442.buf[12] = f_1 + aGraphicalRenderer_Sub2_9052.method13905();
            class47_11.aClass384_442.buf[13] = f_2 + aGraphicalRenderer_Sub2_9052.method13905();
        }

        Matrix44 matrix44_16 = aGraphicalRenderer_Sub2_9052.aClass384_8683;
        matrix44_16.identity();
        matrix44_16.buf[0] = 2.0F / f_12;
        matrix44_16.buf[5] = 2.0F / f_13;
        matrix44_16.buf[12] = -1.0f;
        matrix44_16.buf[13] = -1.0f;
        matrix44_16.buf[14] = -1.0f;
        class47_11.aClass384_442.method6523(matrix44_16);
        class47_11.aClass384_440.method6525(anInterface6_9050.method47(anInt9060), anInterface6_9050.method62(anInt9053), 1.0F, 1.0F);
        class47_11.anInterface4_445 = aGraphicalRenderer_Sub2_9052.anInterface4_8746;
        class47_11.anInt446 = 0;
        class47_11.aClass70_447 = aGraphicalRenderer_Sub2_9052.aClass70_8786;
        Interface6 interface6_17 = ((Class455_Sub1) class455_8).anInterface6_8508;
        class47_11.anInterface6_441 = interface6_17;
        class47_11.aClass384_444.identity();
        class47_11.aClass384_444.buf[0] = (f_3 - f_1) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[1] = (f_4 - f_2) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[4] = (f_5 - f_1) * interface6_17.method62(1.0F);
        class47_11.aClass384_444.buf[5] = (f_6 - f_2) * interface6_17.method62(1.0F);
        class47_11.aClass384_444.buf[12] = (f_1 - i_9) * interface6_17.method47(1.0F);
        class47_11.aClass384_444.buf[13] = (f_2 - i_10) * interface6_17.method62(1.0F);
        class47_11.method938();
    }

}
