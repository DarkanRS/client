package com.jagex;

import java.util.Arrays;

public class CutsceneAction_Sub18 extends CutsceneAction {

    int anInt9395;

    int[] anIntArray9397;

    int anInt9396;

    int anInt9398;

    CutsceneAction_Sub18(Packet rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt9395 = rsbytebuffer_1.readUnsignedShort();
        anIntArray9397 = new int[MoveSpeed.values().length];
        anInt9396 = rsbytebuffer_1.readBigSmart();
        Arrays.fill(anIntArray9397, 0, anIntArray9397.length, anInt9396);
        anInt9398 = rsbytebuffer_1.readInt();
    }

    @Override
    public void method1592() {
        PathingEntity animable_2 = Class82.CUTSCENE_ENTITIES[anInt9395].method1342();
        if (anInt9398 == 0) {
            Class20.animate(animable_2, anIntArray9397, 0, false);
        } else {
            QuickchatCategoryLoader.method5923(animable_2, new int[]{anInt9396}, new int[1], new int[]{anInt9398});
        }
    }

    @Override
    boolean method1599() {
        AnimationDefinitions animationdefinitions_2 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(anInt9396);
        return animationdefinitions_2.ready();
    }

    public void method1601() {
        PathingEntity animable_1 = Class82.CUTSCENE_ENTITIES[1932395903 * anInt9395 * 1548991103].method1342();
        if (1684442377 * anInt9398 * 933564729 == 0) {
            Class20.animate(animable_1, anIntArray9397, 0, false);
        } else {
            QuickchatCategoryLoader.method5923(animable_1, new int[]{anInt9396 * 185651677 * 1590562421}, new int[1], new int[]{anInt9398 * 933564729 * 1684442377});
        }
    }
}
