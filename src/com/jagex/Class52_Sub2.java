package com.jagex;

public class Class52_Sub2 extends Class52 {

    NativeSprite aNativeSprite_9162;
    NativeSprite aNativeSprite_9161;
    NativeSprite aNativeSprite_9160;
    NativeSprite aNativeSprite_9163;
    NativeSprite aNativeSprite_9164;
    NativeSprite aNativeSprite_9165;

    Class52_Sub2(Index index_1, Index index_2, Class350_Sub3 class350_sub3_3) {
        super(index_1, index_2, class350_sub3_3);
    }

    public static void method14501(int i_0, int i_1) {
        Class150.method2580(i_0, i_1);
    }

    @Override
    public boolean method21() {
        if (!super.method10()) {
            return false;
        } else {
            Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
            return aClass317_493.loadFile(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) && (aClass317_493.loadFile(-733628077 * class350_sub3_1.anInt7840 * 2096034523) && (aClass317_493.loadFile(class350_sub3_1.anInt7842 * -1010155381 * -821287133) && (aClass317_493.loadFile(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) && (aClass317_493.loadFile(-485291629 * class350_sub3_1.anInt7841 * -141394789) && aClass317_493.loadFile(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
        }
    }

    @Override
    public void method22() {
        super.method22();
        Class350_Sub3 class350_sub3_2 = (Class350_Sub3) aClass350_489;
        aNativeSprite_9162 = Class152.method2600(aClass317_493, class350_sub3_2.anInt7844);
        aNativeSprite_9161 = Class152.method2600(aClass317_493, class350_sub3_2.anInt7840);
        aNativeSprite_9160 = Class152.method2600(aClass317_493, class350_sub3_2.anInt7842);
        aNativeSprite_9163 = Class152.method2600(aClass317_493, class350_sub3_2.anInt7843);
        aNativeSprite_9164 = Class152.method2600(aClass317_493, class350_sub3_2.anInt7841);
        aNativeSprite_9165 = Class152.method2600(aClass317_493, class350_sub3_2.anInt7845);
    }

    @Override
    void method1081(boolean bool_1, int i_2, int i_3) {
        if (bool_1) {
            int[] ints_5 = new int[4];
            Renderers.CURRENT_RENDERER.qa(ints_5);
            Renderers.CURRENT_RENDERER.r(i_2, i_3, aClass350_489.anInt4093 + i_2, i_3 + aClass350_489.anInt4088);
            int i_6 = aNativeSprite_9160.scaleWidth();
            int i_7 = aNativeSprite_9160.method2748();
            int i_8 = aNativeSprite_9163.scaleWidth();
            int i_9 = aNativeSprite_9163.method2748();
            aNativeSprite_9160.method2752(i_2, i_3 + (aClass350_489.anInt4088 - i_7) / 2);
            aNativeSprite_9163.method2752(aClass350_489.anInt4093 + i_2 - i_8, i_3 + (aClass350_489.anInt4088 - i_9) / 2);
            Renderers.CURRENT_RENDERER.r(i_2, i_3, aClass350_489.anInt4093 + i_2, i_3 + aNativeSprite_9164.method2748());
            aNativeSprite_9164.method2756(i_6 + i_2, i_3, aClass350_489.anInt4093 - i_6 - i_8, aClass350_489.anInt4088);
            int i_10 = aNativeSprite_9165.method2748();
            Renderers.CURRENT_RENDERER.r(i_2, i_3 + aClass350_489.anInt4088 - i_10, aClass350_489.anInt4093 + i_2, i_3 + aClass350_489.anInt4088);
            aNativeSprite_9165.method2756(i_6 + i_2, i_3 + aClass350_489.anInt4088 - i_10, aClass350_489.anInt4093 - i_6 - i_8, aClass350_489.anInt4088);
            Renderers.CURRENT_RENDERER.r(ints_5[0], ints_5[1], ints_5[2], ints_5[3]);
        }

    }

    @Override
    void method1077(int i_2, int i_3) {
        int i_5 = i_2 + aNativeSprite_9160.scaleWidth();
        int i_6 = aClass350_489.anInt4093 + i_2 - aNativeSprite_9163.scaleWidth();
        int i_7 = i_3 + aNativeSprite_9164.method2748();
        int i_8 = i_3 + aClass350_489.anInt4088 - aNativeSprite_9165.method2748();
        int i_9 = i_6 - i_5;
        int i_10 = i_8 - i_7;
        int i_11 = method1078() * i_9 / 10000;
        int[] ints_12 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_12);
        Renderers.CURRENT_RENDERER.r(i_5, i_7, i_5 + i_11, i_8);
        method14498(i_5, i_7, i_9, i_10);
        Renderers.CURRENT_RENDERER.r(i_5 + i_11, i_7, i_6, i_8);
        aNativeSprite_9161.method2756(i_5, i_7, i_9, i_10);
        Renderers.CURRENT_RENDERER.r(ints_12[0], ints_12[1], ints_12[2], ints_12[3]);
    }

    void method14498(int i_1, int i_2, int i_3, int i_4) {
        aNativeSprite_9162.method2756(i_1, i_2, i_3, i_4);
    }

    @Override
    public void method15() {
        super.method22();
        Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
        aNativeSprite_9162 = Class152.method2600(aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671);
        aNativeSprite_9161 = Class152.method2600(aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523);
        aNativeSprite_9160 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133);
        aNativeSprite_9163 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227);
        aNativeSprite_9164 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629);
        aNativeSprite_9165 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501);
    }

    @Override
    public void method23() {
        super.method22();
        Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
        aNativeSprite_9162 = Class152.method2600(aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671);
        aNativeSprite_9161 = Class152.method2600(aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523);
        aNativeSprite_9160 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133);
        aNativeSprite_9163 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227);
        aNativeSprite_9164 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629);
        aNativeSprite_9165 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501);
    }

    @Override
    public void method16() {
        super.method22();
        Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
        aNativeSprite_9162 = Class152.method2600(aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671);
        aNativeSprite_9161 = Class152.method2600(aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523);
        aNativeSprite_9160 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133);
        aNativeSprite_9163 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227);
        aNativeSprite_9164 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629);
        aNativeSprite_9165 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501);
    }

    @Override
    void method1076(boolean bool_1, int i_2, int i_3) {
        if (bool_1) {
            int[] ints_4 = new int[4];
            Renderers.CURRENT_RENDERER.qa(ints_4);
            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_2 + aClass350_489.anInt4093 * -229835439 * 329542577, aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3);
            int i_5 = aNativeSprite_9160.scaleWidth();
            int i_6 = aNativeSprite_9160.method2748();
            int i_7 = aNativeSprite_9163.scaleWidth();
            int i_8 = aNativeSprite_9163.method2748();
            aNativeSprite_9160.method2752(i_2, (aClass350_489.anInt4088 * 1707725877 * 323608093 - i_6) / 2 + i_3);
            aNativeSprite_9163.method2752(aClass350_489.anInt4093 * -229835439 * 329542577 + i_2 - i_7, (aClass350_489.anInt4088 * 1707725877 * 323608093 - i_8) / 2 + i_3);
            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_2 + aClass350_489.anInt4093 * -229835439 * 329542577, i_3 + aNativeSprite_9164.method2748());
            aNativeSprite_9164.method2756(i_2 + i_5, i_3, aClass350_489.anInt4093 * -229835439 * 329542577 - i_5 - i_7, 323608093 * aClass350_489.anInt4088 * 1707725877);
            int i_9 = aNativeSprite_9165.method2748();
            Renderers.CURRENT_RENDERER.r(i_2, i_3 + 323608093 * aClass350_489.anInt4088 * 1707725877 - i_9, i_2 + 329542577 * aClass350_489.anInt4093 * -229835439, i_3 + 323608093 * aClass350_489.anInt4088 * 1707725877);
            aNativeSprite_9165.method2756(i_2 + i_5, i_3 + 323608093 * aClass350_489.anInt4088 * 1707725877 - i_9, 329542577 * aClass350_489.anInt4093 * -229835439 - i_5 - i_7, aClass350_489.anInt4088 * 1707725877 * 323608093);
            Renderers.CURRENT_RENDERER.r(ints_4[0], ints_4[1], ints_4[2], ints_4[3]);
        }

    }

    @Override
    public void method19() {
        super.method22();
        Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
        aNativeSprite_9162 = Class152.method2600(aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671);
        aNativeSprite_9161 = Class152.method2600(aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523);
        aNativeSprite_9160 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133);
        aNativeSprite_9163 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227);
        aNativeSprite_9164 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629);
        aNativeSprite_9165 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501);
    }

    @Override
    public boolean method13() {
        if (!super.method10()) {
            return false;
        } else {
            Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
            return aClass317_493.loadFile(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) && (aClass317_493.loadFile(-733628077 * class350_sub3_1.anInt7840 * 2096034523) && (aClass317_493.loadFile(class350_sub3_1.anInt7842 * -1010155381 * -821287133) && (aClass317_493.loadFile(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) && (aClass317_493.loadFile(-485291629 * class350_sub3_1.anInt7841 * -141394789) && aClass317_493.loadFile(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
        }
    }

    @Override
    public boolean method9() {
        if (!super.method10()) {
            return false;
        } else {
            Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
            return aClass317_493.loadFile(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) && (aClass317_493.loadFile(-733628077 * class350_sub3_1.anInt7840 * 2096034523) && (aClass317_493.loadFile(class350_sub3_1.anInt7842 * -1010155381 * -821287133) && (aClass317_493.loadFile(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) && (aClass317_493.loadFile(-485291629 * class350_sub3_1.anInt7841 * -141394789) && aClass317_493.loadFile(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
        }
    }

    @Override
    public boolean method10() {
        if (!super.method10()) {
            return false;
        } else {
            Class350_Sub3 class350_sub3_2 = (Class350_Sub3) aClass350_489;
            return aClass317_493.loadFile(class350_sub3_2.anInt7844) && (aClass317_493.loadFile(class350_sub3_2.anInt7840) && (aClass317_493.loadFile(class350_sub3_2.anInt7842) && (aClass317_493.loadFile(class350_sub3_2.anInt7843) && (aClass317_493.loadFile(class350_sub3_2.anInt7841) && aClass317_493.loadFile(class350_sub3_2.anInt7845)))));
        }
    }

    @Override
    public void method18() {
        super.method22();
        Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
        aNativeSprite_9162 = Class152.method2600(aClass317_493, -1642545265 * class350_sub3_1.anInt7844 * 1903394671);
        aNativeSprite_9161 = Class152.method2600(aClass317_493, -733628077 * class350_sub3_1.anInt7840 * 2096034523);
        aNativeSprite_9160 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7842 * -1010155381 * -821287133);
        aNativeSprite_9163 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7843 * -1461400443 * -2050274227);
        aNativeSprite_9164 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7841 * -141394789 * -485291629);
        aNativeSprite_9165 = Class152.method2600(aClass317_493, class350_sub3_1.anInt7845 * 1560773125 * 657783501);
    }

    @Override
    void method1080(int i_2, int i_3) {
        int i_4 = i_2 + aNativeSprite_9160.scaleWidth();
        int i_5 = i_2 + aClass350_489.anInt4093 * -229835439 * 329542577 - aNativeSprite_9163.scaleWidth();
        int i_6 = i_3 + aNativeSprite_9164.method2748();
        int i_7 = aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3 - aNativeSprite_9165.method2748();
        int i_8 = i_5 - i_4;
        int i_9 = i_7 - i_6;
        int i_10 = method1078() * i_8 / 10000;
        int[] ints_11 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_11);
        Renderers.CURRENT_RENDERER.r(i_4, i_6, i_4 + i_10, i_7);
        method14498(i_4, i_6, i_8, i_9);
        Renderers.CURRENT_RENDERER.r(i_4 + i_10, i_6, i_5, i_7);
        aNativeSprite_9161.method2756(i_4, i_6, i_8, i_9);
        Renderers.CURRENT_RENDERER.r(ints_11[0], ints_11[1], ints_11[2], ints_11[3]);
    }

    @Override
    void method1075(int i_2, int i_3) {
        int i_4 = i_2 + aNativeSprite_9160.scaleWidth();
        int i_5 = i_2 + aClass350_489.anInt4093 * -229835439 * 329542577 - aNativeSprite_9163.scaleWidth();
        int i_6 = i_3 + aNativeSprite_9164.method2748();
        int i_7 = aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3 - aNativeSprite_9165.method2748();
        int i_8 = i_5 - i_4;
        int i_9 = i_7 - i_6;
        int i_10 = method1078() * i_8 / 10000;
        int[] ints_11 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_11);
        Renderers.CURRENT_RENDERER.r(i_4, i_6, i_4 + i_10, i_7);
        method14498(i_4, i_6, i_8, i_9);
        Renderers.CURRENT_RENDERER.r(i_4 + i_10, i_6, i_5, i_7);
        aNativeSprite_9161.method2756(i_4, i_6, i_8, i_9);
        Renderers.CURRENT_RENDERER.r(ints_11[0], ints_11[1], ints_11[2], ints_11[3]);
    }

    @Override
    void method1079(int i_2, int i_3) {
        int i_4 = i_2 + aNativeSprite_9160.scaleWidth();
        int i_5 = i_2 + aClass350_489.anInt4093 * -229835439 * 329542577 - aNativeSprite_9163.scaleWidth();
        int i_6 = i_3 + aNativeSprite_9164.method2748();
        int i_7 = aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3 - aNativeSprite_9165.method2748();
        int i_8 = i_5 - i_4;
        int i_9 = i_7 - i_6;
        int i_10 = method1078() * i_8 / 10000;
        int[] ints_11 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_11);
        Renderers.CURRENT_RENDERER.r(i_4, i_6, i_4 + i_10, i_7);
        method14498(i_4, i_6, i_8, i_9);
        Renderers.CURRENT_RENDERER.r(i_4 + i_10, i_6, i_5, i_7);
        aNativeSprite_9161.method2756(i_4, i_6, i_8, i_9);
        Renderers.CURRENT_RENDERER.r(ints_11[0], ints_11[1], ints_11[2], ints_11[3]);
    }

    @Override
    public boolean method17() {
        if (!super.method10()) {
            return false;
        } else {
            Class350_Sub3 class350_sub3_1 = (Class350_Sub3) aClass350_489;
            return aClass317_493.loadFile(-1642545265 * class350_sub3_1.anInt7844 * 1903394671) && (aClass317_493.loadFile(-733628077 * class350_sub3_1.anInt7840 * 2096034523) && (aClass317_493.loadFile(class350_sub3_1.anInt7842 * -1010155381 * -821287133) && (aClass317_493.loadFile(-2050274227 * class350_sub3_1.anInt7843 * -1461400443) && (aClass317_493.loadFile(-485291629 * class350_sub3_1.anInt7841 * -141394789) && aClass317_493.loadFile(class350_sub3_1.anInt7845 * 1560773125 * 657783501)))));
        }
    }

}
