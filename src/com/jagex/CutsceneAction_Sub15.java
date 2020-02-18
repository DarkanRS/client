package com.jagex;

public class CutsceneAction_Sub15 extends CutsceneAction {

    int anInt9374;

    CutsceneAction_Sub15(Packet rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt9374 = rsbytebuffer_1.readUnsignedShort();
    }

    public static int method14645(int i_0, int i_1) {
        int i_01 = i_0;
        int i_11 = i_1;
        int i_3;
        if (i_11 > i_01) {
            i_3 = i_01;
            i_01 = i_11;
            i_11 = i_3;
        }

        while (i_11 != 0) {
            i_3 = i_01 % i_11;
            i_01 = i_11;
            i_11 = i_3;
        }

        return i_01;
    }

    public void method1601() {
        Class86.CUTSCENE_OBJECTS[1690922955 * anInt9374 * -1871987229].method1558();
    }

    @Override
    public void method1592() {
        Class86.CUTSCENE_OBJECTS[anInt9374].method1558();
    }

}
