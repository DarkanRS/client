package com.jagex;

import java.util.LinkedList;
import java.util.Queue;

public class Class236 {

    static long aLong2910 = -1L;

    static int anInt2912;

    static boolean aBool2909 = true;

    static Class534_Sub2 aClass534_Sub2_2911 = new Class534_Sub2();

    static Class534_Sub1 aClass534_Sub1_2913 = new Class534_Sub1();

    static Queue<MouseRecord_Sub1> aQueue2914 = new LinkedList<MouseRecord_Sub1>();

    Class236() throws Throwable {
        throw new Error();
    }

    static void method3985(PathingEntity animable_0, int i_1) {
        if (animable_0.currentAnimations != null) {
            MoveSpeed class249_3 = (MoveSpeed) Class386.identify(MoveSpeed.values(), i_1);
            int i_4 = animable_0.currentAnimations[class249_3.getValueIncr()];
            if (i_4 != animable_0.currentAnimation.method7597()) {
                animable_0.currentAnimation.method7615(i_4, animable_0.currentAnimation.getSpeed());
                animable_0.anInt10367 = animable_0.anInt10355;
            }
        }
    }
}
