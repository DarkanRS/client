package com.jagex;

public class CutsceneAction_Sub2 extends CutsceneAction {

    int anInt8504;

    int anInt8505;

    public void method1601() {
        Class82.CUTSCENE_ENTITIES[-644812741 * this.anInt8504 * 607938803].method1342((byte) 117).turn(this.anInt8505 * -16472603 * -2022567955, true);
    }

    CutsceneAction_Sub2(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt8504 = rsbytebuffer_1.readUnsignedShort();
        this.anInt8505 = rsbytebuffer_1.readUnsignedShort();
    }

    public void method1592() {
        Class82.CUTSCENE_ENTITIES[this.anInt8504].method1342((byte) 18).turn(this.anInt8505, true);
    }
}
