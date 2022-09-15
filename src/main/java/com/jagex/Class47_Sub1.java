package com.jagex;

public class Class47_Sub1 extends Class47 {

	static Connection updateConnection;

	int[] anIntArray9139;

	Shader aClass101_9124;

	Class115[] aClass115Array9137 = new Class115[3];

	int[][] anIntArrayArray9130 = new int[3][7];

	Vector4 aClass303_9140 = new Vector4(1.0F, 1.0F, 1.0F, 1.0F);

	Vector4 aClass303_9141 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);

	public Class47_Sub1(HardwareRenderer class505_sub2_1) throws Exception_Sub2 {
		super(class505_sub2_1);
		method14475();
	}

	boolean method14475() throws Exception_Sub2 {
		aClass101_9124 = aGraphicalRenderer_Sub2_439.loadShader("Sprite");
		Node_Sub21_Sub1 class282_sub21_sub1_2 = aClass101_9124.method1691("WVPMatrix");
		Node_Sub21_Sub1 class282_sub21_sub1_3 = aClass101_9124.method1691("SpriteSampler");
		Node_Sub21_Sub1 class282_sub21_sub1_4 = aClass101_9124.method1691("MaskSampler");
		Node_Sub21_Sub1 class282_sub21_sub1_5 = aClass101_9124.method1691("MulColour");
		Node_Sub21_Sub1 class282_sub21_sub1_6 = aClass101_9124.method1691("AddColour");
		Node_Sub21_Sub1 class282_sub21_sub1_7 = aClass101_9124.method1691("SpriteTexCoordMatrix");
		Node_Sub21_Sub1 class282_sub21_sub1_8 = aClass101_9124.method1691("MaskTexCoordMatrix");
		aClass115Array9137[0] = aClass101_9124.method1651("Normal");
		aClass115Array9137[1] = aClass101_9124.method1651("Masked");
		aClass115Array9137[2] = aClass101_9124.method1651("AlphaTex");
		for (int i_9 = 0; i_9 < 3; i_9++) {
			int i_10 = aClass101_9124.method1653(aClass115Array9137[i_9]);
			anIntArrayArray9130[i_9][0] = class282_sub21_sub1_2.method15460(i_10);
			anIntArrayArray9130[i_9][1] = class282_sub21_sub1_3.method15460(i_10);
			anIntArrayArray9130[i_9][2] = class282_sub21_sub1_4.method15460(i_10);
			anIntArrayArray9130[i_9][5] = class282_sub21_sub1_5.method15460(i_10);
			anIntArrayArray9130[i_9][6] = class282_sub21_sub1_6.method15460(i_10);
			anIntArrayArray9130[i_9][3] = class282_sub21_sub1_7.method15460(i_10);
			anIntArrayArray9130[i_9][4] = class282_sub21_sub1_8.method15460(i_10);
		}
		aClass101_9124.method1655(aClass115Array9137[0]);
		return true;
	}

	void method14476() {
		aClass101_9124.method1646();
		aClass101_9124.method1677(anIntArray9139[1], 0, anInterface6_443);
		aGraphicalRenderer_Sub2_439.method13933(aClass384_442);
		aClass101_9124.method1676(anIntArray9139[0], aClass384_442);
		aClass101_9124.method1675(anIntArray9139[3], aClass384_440);
		aClass101_9124.method1749(anIntArray9139[5], aClass303_9140.x, aClass303_9140.y, aClass303_9140.z, aClass303_9140.w);
		aClass101_9124.method1749(anIntArray9139[6], aClass303_9141.x, aClass303_9141.y, aClass303_9141.z, aClass303_9141.w);
		aGraphicalRenderer_Sub2_439.method14161(0, anInterface4_445);
		aGraphicalRenderer_Sub2_439.method13996(aClass70_447);
		aGraphicalRenderer_Sub2_439.method13923(Class352.aClass352_4104, anInt446, 2);
	}

	@Override
	public void method936() {
		aClass101_9124.method1655(aClass115Array9137[0]);
		anIntArray9139 = anIntArrayArray9130[aClass101_9124.method1714()];
		method14476();
	}

	@Override
	public void method937(int i_1, int i_2) {
		switch (i_1) {
		case 0:
		case 2:
			aClass303_9140.fromInt(i_2);
			aClass303_9141.fromInt(0);
			break;
		case 1:
			aClass303_9140.fromInt(-1);
			aClass303_9141.fromInt(0);
			break;
		case 3:
			aClass303_9140.fromInt(0xffffff | i_2 & -16777216);
			aClass303_9141.fromInt(i_2 & 0xffffff);
			break;
		case 4:
			aClass303_9140.fromInt(-1);
			aClass303_9141.fromInt(i_2);
			aClass303_9141.negate();
		}
	}

	@Override
	public void method938() {
		aClass101_9124.method1655(aClass115Array9137[1]);
		anIntArray9139 = anIntArrayArray9130[aClass101_9124.method1714()];
		aClass101_9124.method1677(anIntArray9139[2], 1, anInterface6_441);
		aClass101_9124.method1675(anIntArray9139[4], aClass384_444);
		method14476();
	}

	@Override
	public void method939(int i_1, int i_2) {
		switch (i_1) {
		case 0:
		case 2:
			aClass303_9140.fromInt(i_2);
			aClass303_9141.fromInt(0);
			break;
		case 1:
			aClass303_9140.fromInt(-1);
			aClass303_9141.fromInt(0);
			break;
		case 3:
			aClass303_9140.fromInt(0xffffff | i_2 & -16777216);
			aClass303_9141.fromInt(i_2 & 0xffffff);
			break;
		case 4:
			aClass303_9140.fromInt(-1);
			aClass303_9141.fromInt(i_2);
			aClass303_9141.negate();
		}
	}

	@Override
	public void method940(int i_1, int i_2) {
		switch (i_1) {
		case 0:
		case 2:
			aClass303_9140.fromInt(i_2);
			aClass303_9141.fromInt(0);
			break;
		case 1:
			aClass303_9140.fromInt(-1);
			aClass303_9141.fromInt(0);
			break;
		case 3:
			aClass303_9140.fromInt(0xffffff | i_2 & -16777216);
			aClass303_9141.fromInt(i_2 & 0xffffff);
			break;
		case 4:
			aClass303_9140.fromInt(-1);
			aClass303_9141.fromInt(i_2);
			aClass303_9141.negate();
		}
	}

	@Override
	public void method941() {
		aClass101_9124.method1655(aClass115Array9137[0]);
		anIntArray9139 = anIntArrayArray9130[aClass101_9124.method1714()];
		method14476();
	}

	@Override
	public void method942() {
		aClass101_9124.method1655(aClass115Array9137[1]);
		anIntArray9139 = anIntArrayArray9130[aClass101_9124.method1714()];
		aClass101_9124.method1677(anIntArray9139[2], 1, anInterface6_441);
		aClass101_9124.method1675(anIntArray9139[4], aClass384_444);
		method14476();
	}
}
