package com.jagex;

public class CutsceneAction_Sub16 extends CutsceneAction {

    long aLong9382;

    int anInt9381;

    CutsceneAction_Sub16(ByteBuf rsbytebuffer_1, boolean bool_2) {
        super(rsbytebuffer_1);
        int i_3 = rsbytebuffer_1.readUnsignedShort();
        if (bool_2) {
            aLong9382 = 0x100000000L | i_3;
        } else {
            aLong9382 = i_3;
        }
        anInt9381 = rsbytebuffer_1.readInt();
    }

    public void method1601() {
        IntNode class282_sub38_1 = (IntNode) Class86.aClass465_823.get(-6193626509720689219L * aLong9382 * -8460157808910631531L);
        if (class282_sub38_1 != null) {
            class282_sub38_1.value = -1352622247 * anInt9381 * -1911760175 * -570797415;
        } else {
            Class86.aClass465_823.put(new IntNode(900972081 * anInt9381 * -1911760175), -6193626509720689219L * aLong9382 * -8460157808910631531L);
        }
    }

    @Override
    public void method1592() {
        IntNode class282_sub38_2 = (IntNode) Class86.aClass465_823.get(aLong9382);
        if (class282_sub38_2 != null) {
            class282_sub38_2.value = anInt9381;
        } else {
            Class86.aClass465_823.put(new IntNode(anInt9381), aLong9382);
        }
    }
}
