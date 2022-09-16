package com.jagex;

public class CutsceneAction_Sub2 extends CutsceneAction {

	int anInt8504;

	int anInt8505;

	CutsceneAction_Sub2(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt8504 = rsbytebuffer_1.readUnsignedShort();
		anInt8505 = rsbytebuffer_1.readUnsignedShort();
	}

	@Override
	public void method1592() {
		Class82.CUTSCENE_ENTITIES[anInt8504].method1342().turn(anInt8505, true);
	}

	public void method1601() {
		Class82.CUTSCENE_ENTITIES[-644812741 * anInt8504 * 607938803].method1342().turn(anInt8505 * -16472603 * -2022567955, true);
	}
}
