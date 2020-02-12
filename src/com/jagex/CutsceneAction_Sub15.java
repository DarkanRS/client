package com.jagex;

public class CutsceneAction_Sub15 extends CutsceneAction {

    int anInt9374;

    public void method1601() {
        Class86.CUTSCENE_OBJECTS[1690922955 * this.anInt9374 * -1871987229].method1558((byte) -79);
    }

    public void method1592() {
        Class86.CUTSCENE_OBJECTS[this.anInt9374].method1558((byte) -21);
    }

    CutsceneAction_Sub15(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9374 = rsbytebuffer_1.readUnsignedShort();
    }

    public static int method14645(int i_0, int i_1) {
        int i_3;
        if (i_1 > i_0) {
            i_3 = i_0;
            i_0 = i_1;
            i_1 = i_3;
        }

        while (i_1 != 0) {
            i_3 = i_0 % i_1;
            i_0 = i_1;
            i_1 = i_3;
        }

        return i_0;
    }

}
