package com.jagex;

public class SendFinishedCutsceneAction extends CutsceneAction {

    public static int anInt8307;
    static int anInt8308;

    SendFinishedCutsceneAction(Packet rsbytebuffer_1) {
        super(rsbytebuffer_1);
    }

    public void method1601() {
        BrightnessPreference.method12869(true);
    }

    @Override
    public void method1592() {
        BrightnessPreference.method12869(true);
    }

}
