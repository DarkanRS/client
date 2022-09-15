package com.jagex;

public class Class41_Sub1_Sub2 extends Class41_Sub1 {

	public int anInt10142;

	public int anInt10152;

	public int anInt10153;

	public int anInt10155;
	public Matrix44 aClass384_10138 = new Matrix44();
	public Matrix44 aClass384_10146 = new Matrix44();
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10145;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10154;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10144;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10143;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10139;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10140;
	Class115 aClass115_10151;
	Class115 aClass115_10141;
	float[] aFloatArray10148 = new float[4];

	float[] aFloatArray10150 = new float[4];

	Class49 aClass49_10147;

	float aFloat10149;

	public Class41_Sub1_Sub2(HardwareRenderer class505_sub2_1, Class49 class49_2) throws Exception_Sub2 {
		super(class505_sub2_1);
		aClass49_10147 = class49_2;
		if (aClass49_10147.method975() && class505_sub2_1.method13887())
			method14523("Waterfall");
	}

	@Override
	boolean method14524() throws Exception_Sub2 {
		aNode_Sub21_Sub1_10145 = aClass101_9218.method1691("WorldMatrix");
		aNode_Sub21_Sub1_10154 = aClass101_9218.method1691("WVPMatrix");
		aNode_Sub21_Sub1_10144 = aClass101_9218.method1691("UGenerationPlane");
		aNode_Sub21_Sub1_10143 = aClass101_9218.method1691("VGenerationPlane");
		aNode_Sub21_Sub1_10139 = aClass101_9218.method1691("Time");
		aNode_Sub21_Sub1_10140 = aClass101_9218.method1691("billowSampler3D");
		if (aClass49_10147.aBool474) {
			aClass115_10141 = aClass101_9218.method1651("Waterfall3D");
			aClass101_9218.method1655(aClass115_10141);
		} else {
			aClass115_10151 = aClass101_9218.method1651("Waterfall2D");
			aClass101_9218.method1655(aClass115_10151);
		}
		return true;
	}

	@Override
	boolean method14539() throws Exception_Sub2 {
		aNode_Sub21_Sub1_10145 = aClass101_9218.method1691("WorldMatrix");
		aNode_Sub21_Sub1_10154 = aClass101_9218.method1691("WVPMatrix");
		aNode_Sub21_Sub1_10144 = aClass101_9218.method1691("UGenerationPlane");
		aNode_Sub21_Sub1_10143 = aClass101_9218.method1691("VGenerationPlane");
		aNode_Sub21_Sub1_10139 = aClass101_9218.method1691("Time");
		aNode_Sub21_Sub1_10140 = aClass101_9218.method1691("billowSampler3D");
		if (aClass49_10147.aBool474) {
			aClass115_10141 = aClass101_9218.method1651("Waterfall3D");
			aClass101_9218.method1655(aClass115_10141);
		} else {
			aClass115_10151 = aClass101_9218.method1651("Waterfall2D");
			aClass101_9218.method1655(aClass115_10151);
		}
		return true;
	}

	@Override
	boolean method14541() throws Exception_Sub2 {
		aNode_Sub21_Sub1_10145 = aClass101_9218.method1691("WorldMatrix");
		aNode_Sub21_Sub1_10154 = aClass101_9218.method1691("WVPMatrix");
		aNode_Sub21_Sub1_10144 = aClass101_9218.method1691("UGenerationPlane");
		aNode_Sub21_Sub1_10143 = aClass101_9218.method1691("VGenerationPlane");
		aNode_Sub21_Sub1_10139 = aClass101_9218.method1691("Time");
		aNode_Sub21_Sub1_10140 = aClass101_9218.method1691("billowSampler3D");
		if (aClass49_10147.aBool474) {
			aClass115_10141 = aClass101_9218.method1651("Waterfall3D");
			aClass101_9218.method1655(aClass115_10141);
		} else {
			aClass115_10151 = aClass101_9218.method1651("Waterfall2D");
			aClass101_9218.method1655(aClass115_10151);
		}
		return true;
	}

	public void method15549() {
		if (aClass49_10147.aBool474)
			aClass101_9218.method1655(aClass115_10141);
		else
			aClass101_9218.method1655(aClass115_10151);
		aClass101_9218.method1646();
		if (aClass49_10147.aBool474)
			aClass101_9218.method1671(aNode_Sub21_Sub1_10140, 0, aClass49_10147.anInterface1_479);
		aClass101_9218.method1668(aNode_Sub21_Sub1_10145, aClass384_10146);
		aClass101_9218.method1668(aNode_Sub21_Sub1_10154, aClass384_10138);
		aClass101_9218.method1689(aNode_Sub21_Sub1_10144, new Vector4(aFloatArray10148[0], aFloatArray10148[1], aFloatArray10148[2], aFloatArray10148[3]));
		aClass101_9218.method1689(aNode_Sub21_Sub1_10143, new Vector4(aFloatArray10150[0], aFloatArray10150[1], aFloatArray10150[2], aFloatArray10150[3]));
		aClass101_9218.method1689(aNode_Sub21_Sub1_10139, new Vector4(aFloat10149, 0.0F, 0.0F, 0.0F));
		aGraphicalRenderer_Sub2_413.method14002(Class352.aClass352_4098, anInt10152, anInt10153, anInt10142, anInt10155);
	}

	public void method15550(int i_1) {
		float f_4 = ((i_1 & 0x3) + 1) * -5.0E-4f;
		float f_5 = ((i_1 >> 3 & 0x3) + 1) * 5.0E-4F;
		float f_6 = (i_1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool_7 = (i_1 & 0x80) != 0;
		if (bool_7) {
			aFloatArray10148[0] = f_6;
			aFloatArray10148[1] = 0.0F;
			aFloatArray10148[2] = 0.0F;
		} else {
			aFloatArray10148[0] = 0.0F;
			aFloatArray10148[1] = 0.0F;
			aFloatArray10148[2] = f_6;
		}
		aFloatArray10148[3] = 0.0F;
		aFloatArray10150[0] = 0.0F;
		aFloatArray10150[1] = f_6;
		aFloatArray10150[2] = 0.0F;
		aFloatArray10150[3] = aGraphicalRenderer_Sub2_413.anInt8820 * f_4 % 1.0F;
		if (!aClass49_10147.aBool474) {
			int i_8 = (int) (f_5 * aGraphicalRenderer_Sub2_413.anInt8820 * 16.0F);
			aGraphicalRenderer_Sub2_413.method14035(aClass49_10147.anInterface6Array478[i_8 % 16]);
		} else
			aFloat10149 = (float) ((double) aGraphicalRenderer_Sub2_413.anInt8820 * f_5 % 1.0D);
	}
}
