package com.rs.jagex;

public class CutsceneAction_Sub6 extends CutsceneAction {

	static boolean SHOW_FACE_HERE;
	int anInt9170;
	int anInt9169;
	int anInt9168;
	int anInt9171;
	int anInt9172;

	CutsceneAction_Sub6(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9170 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readInt();
		anInt9169 = i_2 >>> 16;
		anInt9168 = i_2 & 0xffff;
		anInt9171 = rsbytebuffer_1.readUnsignedByte();
		anInt9172 = rsbytebuffer_1.readUnsignedByte();
	}

	@Override
	public void method1592() {
		Class86.CUTSCENE_OBJECTS[anInt9170].method1559(anInt9171, anInt9169, anInt9168, anInt9172);
	}

	public void method1601() {
		Class86.CUTSCENE_OBJECTS[848428857 * anInt9170 * 1418149641].method1559(anInt9171 * 10301909 * 376340349, -916997341 * anInt9169 * 1332038795, -1710403859 * anInt9168 * -2105065755, anInt9172 * -781329023 * -2066193791);
	}
}
