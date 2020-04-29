package com.jagex;

public class CutsceneAction_Sub10_Sub1 extends CutsceneAction_Sub10 {

    static int anInt10159;

    int anInt10157;

    int anInt10158;

    int anInt10156;

    CutsceneAction_Sub10_Sub1(ByteBuf rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt10157 = rsbytebuffer_1.readUnsignedShort();
        anInt10158 = rsbytebuffer_1.readUnsignedByte();
        anInt10156 = rsbytebuffer_1.readUnsignedShort();
    }

    public static void setAnimationIndices(Index index_0, Index index_1) {
        AnimationFrameSet.ANIMATION_FRAMESET_INDEX = index_0;
        AnimationFrameSet.ANIMATION_FRAME_INDEX = index_1;
    }

    public void method1601() {
        Class82.CUTSCENE_ENTITIES[-2052083567 * anInt10157 * -1328934799].method1342().sendSpotAnim(anInt9296 * -1972436045 * 660169595, 277206935 * anInt9295 * 143267879 << 16, anInt9297 * 468728079 * 1009489391, -1634196889 * anInt10156 * 1239800151, false, -2011621393 * anInt10158 * 1183905551);
    }

    @Override
    public void method1592() {
        Class82.CUTSCENE_ENTITIES[anInt10157].method1342().sendSpotAnim(anInt9296, anInt9295 << 16, anInt9297, anInt10156, false, anInt10158);
    }
}
