package com.jagex;
public class CutsceneAction_Sub6 extends CutsceneAction {

	static boolean SHOW_FACE_HERE;
	int anInt9170;
	int anInt9169;
	int anInt9168;
	int anInt9171;
	int anInt9172;

	CutsceneAction_Sub6(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9170 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readInt();
		this.anInt9169 = i_2 >>> 16;
		this.anInt9168 = i_2 & 0xffff;
		this.anInt9171 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9172 = rsbytebuffer_1.readUnsignedByte();
	}

	public void method1592() {
		Class86.CUTSCENE_OBJECTS[this.anInt9170].method1559(this.anInt9171, this.anInt9169, this.anInt9168, this.anInt9172, (byte) 60);
	}

	public void method1601() {
		Class86.CUTSCENE_OBJECTS[848428857 * this.anInt9170 * 1418149641].method1559(this.anInt9171 * 10301909 * 376340349, -916997341 * this.anInt9169 * 1332038795, -1710403859 * this.anInt9168 * -2105065755, this.anInt9172 * -781329023 * -2066193791, (byte) 30);
	}
}
