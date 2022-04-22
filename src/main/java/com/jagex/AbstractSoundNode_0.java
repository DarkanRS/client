package com.jagex;

public abstract class AbstractSoundNode_0 extends Node {

    AbstractSoundNode_0 aAbstractSoundNode_0_7598;
    int anInt7599;
    Node_Sub26 nodeWithAudioBuffer26;
    volatile boolean aBoolNormTrue7600 = true;

    abstract int method12224();

    int method12225() {
        return 255;
    }

    abstract AbstractSoundNode_0 method12226();

    abstract int method12227();

    abstract int method12228();

    abstract AbstractSoundNode_0 method12229();

    abstract void method12230(int[] var1, int var2, int var3);

    abstract void method12231(int var1);

    abstract AbstractSoundNode_0 method12232();

    abstract AbstractSoundNode_0 method12233();

    abstract void method12234(int var1);

    abstract AbstractSoundNode_0 method12235();

    abstract AbstractSoundNode_0 method12236();

    void method12237(int[] ints_1, int i_2, int i_3) {
        if (aBoolNormTrue7600) {
            method12230(ints_1, i_2, i_3);
        } else {
            method12231(i_3);
        }

    }

    abstract int method12238();

    abstract AbstractSoundNode_0 method12239();

    abstract void method12240(int[] var1, int var2, int var3);

    abstract void method12241(int[] var1, int var2, int var3);

    abstract void method12242(int[] var1, int var2, int var3);

    abstract void method12243(int var1);

    abstract int method12244();

}
