package com.jagex;

public class CutsceneAction_Sub16 extends CutsceneAction {

    long aLong9382;

    int anInt9381;

    public void method1601() {
        IntNode class282_sub38_1 = (IntNode) Class86.aClass465_823.get(-6193626509720689219L * this.aLong9382 * -8460157808910631531L);
        if (class282_sub38_1 != null) {
            class282_sub38_1.value = -1352622247 * this.anInt9381 * -1911760175 * -570797415;
        } else {
            Class86.aClass465_823.put(new IntNode(900972081 * this.anInt9381 * -1911760175), -6193626509720689219L * this.aLong9382 * -8460157808910631531L);
        }
    }

    public void method1592() {
        IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get(this.aLong9382);
        if (class282_sub38_2 != null) {
            class282_sub38_2.value = this.anInt9381;
        } else {
            Class86.aClass465_823.put(new IntNode(this.anInt9381), this.aLong9382);
        }
    }

    CutsceneAction_Sub16(RsByteBuffer rsbytebuffer_1, boolean bool_2) {
        super(rsbytebuffer_1);
        int i_3 = rsbytebuffer_1.readUnsignedShort();
        if (bool_2) {
            this.aLong9382 = 0x100000000L | (long) i_3;
        } else {
            this.aLong9382 = i_3;
        }
        this.anInt9381 = rsbytebuffer_1.readInt();
    }
}
