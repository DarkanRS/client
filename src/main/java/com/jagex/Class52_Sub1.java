package com.jagex;

import java.awt.*;

public class Class52_Sub1 extends Class52 {

    NativeSprite aNativeSprite_9150;

    Class52_Sub1(Index index_1, Index index_2, Class350_Sub1 class350_sub1_3) {
        super(index_1, index_2, class350_sub1_3);
    }

    static Class158_Sub2_Sub3 method14493(JavaRenderer hardwarerenderer_0, Canvas canvas_1, int i_2, int i_3) {
        Class158_Sub2_Sub3_Sub1 class158_sub2_sub3_sub1_5 = new Class158_Sub2_Sub3_Sub1(hardwarerenderer_0, canvas_1, i_2, i_3);
        return class158_sub2_sub3_sub1_5;
    }

    @Override
    public void method23() {
        super.method22();
        aNativeSprite_9150 = Class152.method2600(aClass317_493, -2099828279 * ((Class350_Sub1) aClass350_489).anInt7756 * 478363769);
    }

    @Override
    void method1081(boolean bool_1, int i_2, int i_3) {
        Renderers.CURRENT_RENDERER.method8430(i_2 - 2, i_3, aClass350_489.anInt4093 + 4, aClass350_489.anInt4088 + 2, ((Class350_Sub1) aClass350_489).anInt7755, 0);
        Renderers.CURRENT_RENDERER.method8430(i_2 - 1, i_3 + 1, aClass350_489.anInt4093 + 2, aClass350_489.anInt4088, 0, 0);
    }

    @Override
    void method1077(int i_2, int i_3) {
        int i_5 = method1078() * aClass350_489.anInt4093 / 10000;
        int[] ints_6 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_6);
        Renderers.CURRENT_RENDERER.r(i_2, i_3 + 2, i_5 + i_2, i_3 + aClass350_489.anInt4088);
        aNativeSprite_9150.method2756(i_2, i_3 + 2, aClass350_489.anInt4093, aClass350_489.anInt4088);
        Renderers.CURRENT_RENDERER.r(ints_6[0], ints_6[1], ints_6[2], ints_6[3]);
    }

    @Override
    public boolean method13() {
        return super.method10() && aClass317_493.loadFile(((Class350_Sub1) aClass350_489).anInt7756 * 478363769 * -2099828279);
    }

    @Override
    public void method22() {
        super.method22();
        aNativeSprite_9150 = Class152.method2600(aClass317_493, ((Class350_Sub1) aClass350_489).anInt7756);
    }

    @Override
    public boolean method10() {
        return super.method10() && aClass317_493.loadFile(((Class350_Sub1) aClass350_489).anInt7756);
    }

    @Override
    public void method16() {
        super.method22();
        aNativeSprite_9150 = Class152.method2600(aClass317_493, -2099828279 * ((Class350_Sub1) aClass350_489).anInt7756 * 478363769);
    }

    @Override
    public void method18() {
        super.method22();
        aNativeSprite_9150 = Class152.method2600(aClass317_493, -2099828279 * ((Class350_Sub1) aClass350_489).anInt7756 * 478363769);
    }

    @Override
    public void method15() {
        super.method22();
        aNativeSprite_9150 = Class152.method2600(aClass317_493, -2099828279 * ((Class350_Sub1) aClass350_489).anInt7756 * 478363769);
    }

    @Override
    public void method19() {
        super.method22();
        aNativeSprite_9150 = Class152.method2600(aClass317_493, -2099828279 * ((Class350_Sub1) aClass350_489).anInt7756 * 478363769);
    }

    @Override
    public boolean method9() {
        return super.method10() && aClass317_493.loadFile(((Class350_Sub1) aClass350_489).anInt7756 * 478363769 * -2099828279);
    }

    @Override
    public boolean method21() {
        return super.method10() && aClass317_493.loadFile(((Class350_Sub1) aClass350_489).anInt7756 * 478363769 * -2099828279);
    }

    @Override
    public boolean method17() {
        return super.method10() && aClass317_493.loadFile(((Class350_Sub1) aClass350_489).anInt7756 * 478363769 * -2099828279);
    }

    @Override
    void method1080(int i_2, int i_3) {
        int i_4 = method1078() * aClass350_489.anInt4093 * -229835439 * 329542577 / 10000;
        int[] ints_5 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_5);
        Renderers.CURRENT_RENDERER.r(i_2, i_3 + 2, i_4 + i_2, aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3);
        aNativeSprite_9150.method2756(i_2, 2 + i_3, 329542577 * aClass350_489.anInt4093 * -229835439, aClass350_489.anInt4088 * 1707725877 * 323608093);
        Renderers.CURRENT_RENDERER.r(ints_5[0], ints_5[1], ints_5[2], ints_5[3]);
    }

    @Override
    void method1075(int i_2, int i_3) {
        int i_4 = method1078() * aClass350_489.anInt4093 * -229835439 * 329542577 / 10000;
        int[] ints_5 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_5);
        Renderers.CURRENT_RENDERER.r(i_2, i_3 + 2, i_4 + i_2, aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3);
        aNativeSprite_9150.method2756(i_2, 2 + i_3, 329542577 * aClass350_489.anInt4093 * -229835439, aClass350_489.anInt4088 * 1707725877 * 323608093);
        Renderers.CURRENT_RENDERER.r(ints_5[0], ints_5[1], ints_5[2], ints_5[3]);
    }

    @Override
    void method1079(int i_2, int i_3) {
        int i_4 = method1078() * aClass350_489.anInt4093 * -229835439 * 329542577 / 10000;
        int[] ints_5 = new int[4];
        Renderers.CURRENT_RENDERER.qa(ints_5);
        Renderers.CURRENT_RENDERER.r(i_2, i_3 + 2, i_4 + i_2, aClass350_489.anInt4088 * 1707725877 * 323608093 + i_3);
        aNativeSprite_9150.method2756(i_2, 2 + i_3, 329542577 * aClass350_489.anInt4093 * -229835439, aClass350_489.anInt4088 * 1707725877 * 323608093);
        Renderers.CURRENT_RENDERER.r(ints_5[0], ints_5[1], ints_5[2], ints_5[3]);
    }

    @Override
    void method1076(boolean bool_1, int i_2, int i_3) {
        Renderers.CURRENT_RENDERER.method8430(i_2 - 2, i_3, aClass350_489.anInt4093 * -229835439 * 329542577 + 4, aClass350_489.anInt4088 * 1707725877 * 323608093 + 2, 1505550823 * ((Class350_Sub1) aClass350_489).anInt7755 * 1943314903, 0);
        Renderers.CURRENT_RENDERER.method8430(i_2 - 1, 1 + i_3, 2 + 329542577 * aClass350_489.anInt4093 * -229835439, aClass350_489.anInt4088 * 1707725877 * 323608093, 0, 0);
    }
}
