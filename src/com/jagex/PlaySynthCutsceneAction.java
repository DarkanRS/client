package com.jagex;

public class PlaySynthCutsceneAction extends CutsceneAction {

    public static int anInt9368;

    AreadSound aClass268_9367;

    int anInt9363;

    int anInt9365;

    int anInt9364;

    int anInt9366;

    PlaySynthCutsceneAction(Packet rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt9363 = rsbytebuffer_1.readUnsignedShort();
        anInt9365 = rsbytebuffer_1.readUnsignedByte();
        anInt9364 = rsbytebuffer_1.readUnsignedByte();
        anInt9366 = rsbytebuffer_1.readUnsignedByte();
    }

    @Override
    public void method1592() {
        aClass268_9367 = VarNPCMap.playSoundSynth(anInt9363, anInt9366, 0, anInt9365, anInt9364);
    }

    @Override
    void method1593() {
        if (aClass268_9367 != null) {
            QuickchatFiller.method1142(aClass268_9367);
            aClass268_9367 = null;
        }
    }

    public void method1601() {
        aClass268_9367 = VarNPCMap.playSoundSynth(-1658024425 * anInt9363 * -614233689, 1033987545 * anInt9366 * 468765289, 0, 183603537 * anInt9365 * -2028447823, anInt9364 * -1995338863 * -1180265103);
    }
}
