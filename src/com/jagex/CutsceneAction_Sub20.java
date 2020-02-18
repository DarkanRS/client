package com.jagex;

public class CutsceneAction_Sub20 extends CutsceneAction {

    static Packet WORLD_LIST_BUFFER;

    int anInt9414;

    CutsceneAction_Sub20(Packet rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt9414 = rsbytebuffer_1.readUnsignedShort();
    }

    public static Class466 method14668() {
        return Class404.aClass466_4831 == null ? Class466.aClass466_5569 : Class404.aClass466_4831;
    }

    public void method1601() {
        Class82.CUTSCENE_ENTITIES[1703207571 * anInt9414 * 1116179355].method1337();
    }

    @Override
    public void method1592() {
        Class82.CUTSCENE_ENTITIES[anInt9414].method1337();
    }
}
