package com.jagex;

public class PlaySoundVorbisCutsceneAction extends CutsceneAction {

    AreadSound sound;

    int soundID;

    int anInt9269;

    int anInt9272;

    int anInt9268;

    PlaySoundVorbisCutsceneAction(ByteBuf rsbytebuffer_1) {
        super(rsbytebuffer_1);
        soundID = rsbytebuffer_1.readUnsignedShort();
        anInt9269 = rsbytebuffer_1.readUnsignedByte();
        anInt9272 = rsbytebuffer_1.readUnsignedByte();
        anInt9268 = rsbytebuffer_1.readUnsignedByte();
    }

    static boolean method14577() {
        return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5879);
    }

    @Override
    public void method1592() {
        sound = Class435.playSoundVorbis(soundID, anInt9268, 0, anInt9269, false, anInt9272);
    }

    @Override
    void method1593() {
        if (sound != null) {
            QuickchatFiller.method1142(sound);
            sound = null;
        }
    }

    public void method1601() {
        sound = Class435.playSoundVorbis(983294899 * soundID * -1315470469, anInt9268 * 1609664985 * -573413783, 0, anInt9269 * -957613339 * -840420627, false, 177588843 * anInt9272 * -1529769405);
    }
}
