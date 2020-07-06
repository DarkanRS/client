package com.jagex;

public class Class137_Sub1_Sub1 extends Class137_Sub1 {

    int anInt10136;
    int anInt10133;
    float aFloat10134;
    float aFloat10132;
    boolean aBool10135;
    boolean aBool10137;

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5, int i_6, int i_7) {
        super(class505_sub1_1, 3553, class150_2, class76_3, i_6, i_7);
        anInt10136 = i_4;
        anInt10133 = i_5;
        aFloat10134 = (float) i_5 / i_7;
        aFloat10132 = (float) i_4 / i_6;
        aBool10135 = false;
        aBool10137 = true;
        method14445(false, false);
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5, int i_6, int i_7, byte[] bytes_8, Class150 class150_9) {
        super(class505_sub1_1, 3553, class150_2, class76_3, i_6, i_7);
        anInt10136 = i_4;
        anInt10133 = i_5;
        method14455(i_7 - i_5, i_4, i_5, bytes_8, class150_9, 0, true);
        aFloat10134 = (float) i_5 / i_7;
        aFloat10132 = (float) i_4 / i_6;
        aBool10135 = false;
        aBool10137 = true;
        method14445(false, false);
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, int i_6) {
        super(class505_sub1_1, i_2, class150_3, class76_4, i_5, i_6);
        anInt10136 = i_5;
        anInt10133 = i_6;
        if (anInt1648 == 34037) {
            aFloat10134 = i_6;
            aFloat10132 = i_5;
            aBool10135 = false;
        } else {
            aFloat10134 = 1.0F;
            aFloat10132 = 1.0F;
            aBool10135 = true;
        }

        aBool10137 = false;
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        super(class505_sub1_1, i_2, i_3, i_4, i_5, i_6);
        anInt10136 = i_5;
        anInt10133 = i_6;
        if (anInt1648 == 34037) {
            aFloat10134 = i_6;
            aFloat10132 = i_5;
            aBool10135 = false;
        } else {
            aFloat10134 = 1.0F;
            aFloat10132 = 1.0F;
            aBool10135 = true;
        }

        aBool10137 = false;
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int[] ints_6) {
        super(class505_sub1_1, 3553, Class150.aClass150_1949, Class76.aClass76_751, i_4, i_5);
        anInt10136 = i_2;
        anInt10133 = i_3;
        method14452(0, i_5 - i_3, i_2, i_3, ints_6, 0);
        aFloat10134 = (float) i_3 / i_5;
        aFloat10132 = (float) i_2 / i_4;
        aBool10135 = false;
        aBool10137 = true;
        method14445(false, false);
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        super(class505_sub1_1, 3553, i_2, i_3, i_6, i_7);
        anInt10136 = i_4;
        anInt10133 = i_5;
        aFloat10134 = (float) i_5 / i_7;
        aFloat10132 = (float) i_4 / i_6;
        aBool10135 = false;
        aBool10137 = true;
        method14445(false, false);
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, int i_2, int i_3, int i_4, int[] ints_6, int i_7, int i_8) {
        super(class505_sub1_1, i_2, i_3, i_4, false, ints_6, i_7, i_8, true);
        anInt10136 = i_3;
        anInt10133 = i_4;
        if (anInt1648 == 34037) {
            aFloat10134 = i_4;
            aFloat10132 = i_3;
            aBool10135 = false;
        } else {
            aFloat10134 = 1.0F;
            aFloat10132 = 1.0F;
            aBool10135 = true;
        }

        aBool10137 = false;
    }

    Class137_Sub1_Sub1(OpenGLRenderer class505_sub1_1, int i_2, Class150 class150_3, Class76 class76_4, int i_5, int i_6, byte[] bytes_8, Class150 class150_9) {
        super(class505_sub1_1, i_2, class150_3, class76_4, i_5, i_6, false, bytes_8, class150_9, true);
        anInt10136 = i_5;
        anInt10133 = i_6;
        if (anInt1648 == 34037) {
            aFloat10134 = i_6;
            aFloat10132 = i_5;
            aBool10135 = false;
        } else {
            aFloat10134 = 1.0F;
            aFloat10132 = 1.0F;
            aBool10135 = true;
        }

        aBool10137 = false;
    }

    static Class137_Sub1_Sub1 method15537(OpenGLRenderer class505_sub1_0, int i_1, int i_2, int[] ints_4, int i_5, int i_6) {
        return !class505_sub1_0.aBool8498 && (!CutsceneAction_Sub9.method14585(i_1) || !CutsceneAction_Sub9.method14585(i_2)) ? (class505_sub1_0.aBool8401 ? new Class137_Sub1_Sub1(class505_sub1_0, 34037, i_1, i_2, ints_4, i_5, i_6) : new Class137_Sub1_Sub1(class505_sub1_0, i_1, i_2, Utils.nextPowerOfTwo(i_1), Utils.nextPowerOfTwo(i_2), ints_4)) : new Class137_Sub1_Sub1(class505_sub1_0, 3553, i_1, i_2, ints_4, i_5, i_6);
    }

    static Class137_Sub1_Sub1 method15538(OpenGLRenderer class505_sub1_0, int i_1, int i_2, int i_3, int i_4) {
        return !class505_sub1_0.aBool8498 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (class505_sub1_0.aBool8401 ? new Class137_Sub1_Sub1(class505_sub1_0, 34037, i_1, i_2, i_3, i_4) : new Class137_Sub1_Sub1(class505_sub1_0, i_1, i_2, i_3, i_4, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4))) : new Class137_Sub1_Sub1(class505_sub1_0, 3553, i_1, i_2, i_3, i_4);
    }

    static Class137_Sub1_Sub1 method15540(OpenGLRenderer class505_sub1_0, Class150 class150_1, Class76 class76_2, int i_3, int i_4, byte[] bytes_6, Class150 class150_7) {
        return !class505_sub1_0.aBool8498 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (class505_sub1_0.aBool8401 ? new Class137_Sub1_Sub1(class505_sub1_0, 34037, class150_1, class76_2, i_3, i_4, bytes_6, class150_7) : new Class137_Sub1_Sub1(class505_sub1_0, class150_1, class76_2, i_3, i_4, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4), bytes_6, class150_7)) : new Class137_Sub1_Sub1(class505_sub1_0, 3553, class150_1, class76_2, i_3, i_4, bytes_6, class150_7);
    }

    static Class137_Sub1_Sub1 method15547(OpenGLRenderer class505_sub1_0, Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
        return !class505_sub1_0.aBool8498 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (class505_sub1_0.aBool8401 ? new Class137_Sub1_Sub1(class505_sub1_0, 34037, class150_1, class76_2, i_3, i_4) : new Class137_Sub1_Sub1(class505_sub1_0, class150_1, class76_2, i_3, i_4, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4))) : new Class137_Sub1_Sub1(class505_sub1_0, 3553, class150_1, class76_2, i_3, i_4);
    }

    @Override
    void method2351(boolean bool_1) {
        super.method2351(bool_1 && !aBool10137);
    }

}
