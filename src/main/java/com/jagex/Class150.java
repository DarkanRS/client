package com.jagex;

public class Class150 {

    public static Class150 aClass150_1950 = new Class150(5, 3);
    public static Class150 aClass150_1949 = new Class150(6, 4);
    public static Class150 aClass150_1951 = new Class150(1, 1);
    public static Class150 aClass150_1948 = new Class150(0, 1);
    public static Class150 aClass150_1952 = new Class150(4, 2);
    public static Class150 aClass150_1953 = new Class150(8, 1);
    public static Class150 aClass150_1956 = new Class150(7, 1);
    public static Class150 aClass150_1957 = new Class150(9, 1);
    static Class150 aClass150_1954 = new Class150(3, 3);
    static Class150 aClass150_1955 = new Class150(2, 4);
    public int anInt1958;

    public int anInt1959;

    Class150(int i_1, int i_2) {
        anInt1958 = i_1;
        anInt1959 = i_2;
    }

    public static void method2580(int i_0, int i_1) {
        if (Class148.anInt1730 != 0) {
            if (i_0 < 0) {
                for (int i_3 = 0; i_3 < 16; i_3++) {
                    HashTable.anIntArray5449[i_3] = i_1;
                }
            } else {
                HashTable.anIntArray5449[i_0] = i_1;
            }
        }
        Class148.aNode_Sub15_Sub2_1735.method15095(i_0, i_1);
    }

    static void method2581(PathingEntity animable_0) {
        MovingAnimation class456_sub3_2 = animable_0.aAnimation_Sub3_10337;
        if (class456_sub3_2.hasDefs() && class456_sub3_2.method7627(1) && class456_sub3_2.method7580()) {
            if (class456_sub3_2.aBool7891) {
                class456_sub3_2.animate(animable_0.getRenderAnimDefs().getStandAnimation());
                class456_sub3_2.aBool7891 = class456_sub3_2.hasDefs();
            }
            class456_sub3_2.method7582();
        }
        for (int i_3 = 0; i_3 < animable_0.spotAnims.length; i_3++) {
            if (animable_0.spotAnims[i_3].spotAnimId != -1) {
                Animation animation_4 = animable_0.spotAnims[i_3].animation;
                if (animation_4.hasSpeed()) {
                    SpotAnimDefinitions spotanimdefinitions_5 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(animable_0.spotAnims[i_3].spotAnimId);
                    AnimationDefinitions animationdefinitions_6 = animation_4.getDefs();
                    if (spotanimdefinitions_5.aBool6968) {
                        if (animationdefinitions_6.animatingPrecedence == 3) {
                            if (animable_0.anInt10367 > 0 && animable_0.forceMovementT1Delay <= client.CYCLES_20MS && animable_0.forceMovementT2Delay < client.CYCLES_20MS) {
                                animation_4.update(-1);
                                animable_0.spotAnims[i_3].spotAnimId = -1;
                                continue;
                            }
                        } else if (animationdefinitions_6.animatingPrecedence == 1 && animable_0.anInt10367 > 0 && animable_0.forceMovementT1Delay <= client.CYCLES_20MS && animable_0.forceMovementT2Delay < client.CYCLES_20MS) {
                            continue;
                        }
                    }
                }
                if (animation_4.method7627(1) && animation_4.method7580()) {
                    animation_4.update(-1);
                    animable_0.spotAnims[i_3].spotAnimId = -1;
                }
            }
        }
        Animation animation_7 = animable_0.currentAnimation;
        if (animation_7.hasDefs()) {
            label88:
            {
                AnimationDefinitions animationdefinitions_9 = animation_7.getDefs();
                if (animationdefinitions_9.animatingPrecedence == 3) {
                    if (animable_0.anInt10367 > 0 && animable_0.forceMovementT1Delay <= client.CYCLES_20MS && animable_0.forceMovementT2Delay < client.CYCLES_20MS) {
                        animable_0.currentAnimations = null;
                        animation_7.update(-1);
                        break label88;
                    }
                } else if (animationdefinitions_9.animatingPrecedence == 1) {
                    if (animable_0.anInt10367 > 0 && animable_0.forceMovementT1Delay <= client.CYCLES_20MS && animable_0.forceMovementT2Delay < client.CYCLES_20MS) {
                        animation_7.setSpeed(1);
                        break label88;
                    }
                    animation_7.setSpeed(0);
                }
                if (animation_7.method7627(1) && animation_7.method7580()) {
                    animable_0.currentAnimations = null;
                    animation_7.update(-1);
                }
            }
        }
        for (int i_8 = 0; i_8 < animable_0.aAnimation_Sub2_Sub1Array10354.length; i_8++) {
            Animation_Sub2_Sub1 class456_sub2_sub1_10 = animable_0.aAnimation_Sub2_Sub1Array10354[i_8];
            if (class456_sub2_sub1_10 != null) {
                if (class456_sub2_sub1_10.anInt10065 > 0) {
                    --class456_sub2_sub1_10.anInt10065;
                } else if (class456_sub2_sub1_10.method7627(1) && class456_sub2_sub1_10.method7580()) {
                    animable_0.aAnimation_Sub2_Sub1Array10354[i_8] = null;
                }
            }
        }
    }

    public static void method2582(int i_0, int[] ints_1) {
        if (i_0 != -1 && MovingAnimation.isInterfaceLoaded(i_0, ints_1)) {
            IComponentDefinitions[] arr_3 = Interface.INTERFACES[i_0].components;
            Connection.runIComponentScripts(arr_3);
        }
    }

    public static void method2583(ClientTriggerType class397_0, int i_1, GroundItem class521_sub1_sub2_sub1_4) {
        CS2Executor cs2executor_6 = CS2Executor.getNextScriptExecutor();
        cs2executor_6.currentGroundItem = class521_sub1_sub2_sub1_4;
        CS2Executor.method1834(class397_0, i_1, -1, cs2executor_6);
        cs2executor_6.currentGroundItem = null;
    }
}
