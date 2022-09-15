package com.jagex;

public class Class41_Sub1_Sub1 extends Class41_Sub1 {

	public static int method15524() {
		return ChatLine.NUM_CHAT_LINES;
	}

	public int anInt10094;

	public int anInt10095;

	public int anInt10110;

	public int anInt10111;
	public int anInt10112;
	public Matrix44 aClass384_10090 = new Matrix44();
	public Matrix44 aClass384_10091 = new Matrix44();
	public Vector3 aClass385_10089 = new Vector3();
	public Vector4 aClass303_10103 = new Vector4();
	public Vector3 aClass385_10086 = new Vector3();
	public Vector4 aClass303_10107 = new Vector4();
	public Vector3 aClass385_10109 = new Vector3();
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10087;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10088;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10105;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10101;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10093;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10096;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10098;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10100;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10102;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10104;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10106;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_10108;
	float aFloat10114;
	Vector4 aClass303_10113 = new Vector4();
	Vector4 aClass303_10099 = new Vector4();
	Vector4 aClass303_10115 = new Vector4();

	Class49 aClass49_10092;

	boolean aBool10097;

	public Class41_Sub1_Sub1(HardwareRenderer class505_sub2_1, Class49 class49_2) throws Exception_Sub2 {
		super(class505_sub2_1);
		new Matrix44();
		aClass49_10092 = class49_2;
		aBool10097 = true;
		if (class505_sub2_1.method13887() && class505_sub2_1.method13888())
			method14523("EnvMappedWater");
	}

	@Override
	boolean method14524() throws Exception_Sub2 {
		if (!aClass49_10092.method969())
			return false;
		aNode_Sub21_Sub1_10087 = aClass101_9218.method1691("NormalSampler");
		aNode_Sub21_Sub1_10088 = aClass101_9218.method1691("EnvMapSampler");
		aNode_Sub21_Sub1_10105 = aClass101_9218.method1691("WVPMatrix");
		aNode_Sub21_Sub1_10101 = aClass101_9218.method1691("TexCoordMatrix");
		aNode_Sub21_Sub1_10093 = aClass101_9218.method1691("EyePosAndTime");
		aNode_Sub21_Sub1_10096 = aClass101_9218.method1691("SunDirectionAndExponent");
		aNode_Sub21_Sub1_10098 = aClass101_9218.method1691("SunColourAndWaveExponent");
		aNode_Sub21_Sub1_10100 = aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset");
		aNode_Sub21_Sub1_10102 = aClass101_9218.method1691("HeightFogPlane");
		aNode_Sub21_Sub1_10104 = aClass101_9218.method1691("HeightFogColour");
		aNode_Sub21_Sub1_10106 = aClass101_9218.method1691("DistanceFogPlane");
		aNode_Sub21_Sub1_10108 = aClass101_9218.method1691("DistanceFogColour");
		Class115 class115_1 = aClass101_9218.method1651(aBool10097 ? "EnvMappedSea" : "EnvMappedWater");
		aClass101_9218.method1655(class115_1);
		return true;
	}

	@Override
	void method14527(Matrix44 matrix44_1) {
		Matrix44 matrix44_2 = new Matrix44();
		matrix44_2.method6525(aFloat10114, aFloat10114, 1.0F, 1.0F);
		matrix44_2.method6568(matrix44_1, matrix44_2);
		super.method14527(matrix44_2);
	}

	@Override
	void method14530(boolean bool_1) {
		float f_2 = 1.0F + (1.0F - Math.abs(aGraphicalRenderer_Sub2_413.aFloatArray8747[1])) * 2.0F;
		float f_3 = aGraphicalRenderer_Sub2_413.aFloat8770;
		aGraphicalRenderer_Sub2_413.aFloat8770 *= f_2;
		super.method14530(bool_1);
		aGraphicalRenderer_Sub2_413.aFloat8770 = f_3;
	}

	@Override
	boolean method14539() throws Exception_Sub2 {
		if (!aClass49_10092.method969())
			return false;
		aNode_Sub21_Sub1_10087 = aClass101_9218.method1691("NormalSampler");
		aNode_Sub21_Sub1_10088 = aClass101_9218.method1691("EnvMapSampler");
		aNode_Sub21_Sub1_10105 = aClass101_9218.method1691("WVPMatrix");
		aNode_Sub21_Sub1_10101 = aClass101_9218.method1691("TexCoordMatrix");
		aNode_Sub21_Sub1_10093 = aClass101_9218.method1691("EyePosAndTime");
		aNode_Sub21_Sub1_10096 = aClass101_9218.method1691("SunDirectionAndExponent");
		aNode_Sub21_Sub1_10098 = aClass101_9218.method1691("SunColourAndWaveExponent");
		aNode_Sub21_Sub1_10100 = aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset");
		aNode_Sub21_Sub1_10102 = aClass101_9218.method1691("HeightFogPlane");
		aNode_Sub21_Sub1_10104 = aClass101_9218.method1691("HeightFogColour");
		aNode_Sub21_Sub1_10106 = aClass101_9218.method1691("DistanceFogPlane");
		aNode_Sub21_Sub1_10108 = aClass101_9218.method1691("DistanceFogColour");
		Class115 class115_1 = aClass101_9218.method1651(aBool10097 ? "EnvMappedSea" : "EnvMappedWater");
		aClass101_9218.method1655(class115_1);
		return true;
	}

	@Override
	boolean method14541() throws Exception_Sub2 {
		if (!aClass49_10092.method969())
			return false;
		aNode_Sub21_Sub1_10087 = aClass101_9218.method1691("NormalSampler");
		aNode_Sub21_Sub1_10088 = aClass101_9218.method1691("EnvMapSampler");
		aNode_Sub21_Sub1_10105 = aClass101_9218.method1691("WVPMatrix");
		aNode_Sub21_Sub1_10101 = aClass101_9218.method1691("TexCoordMatrix");
		aNode_Sub21_Sub1_10093 = aClass101_9218.method1691("EyePosAndTime");
		aNode_Sub21_Sub1_10096 = aClass101_9218.method1691("SunDirectionAndExponent");
		aNode_Sub21_Sub1_10098 = aClass101_9218.method1691("SunColourAndWaveExponent");
		aNode_Sub21_Sub1_10100 = aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset");
		aNode_Sub21_Sub1_10102 = aClass101_9218.method1691("HeightFogPlane");
		aNode_Sub21_Sub1_10104 = aClass101_9218.method1691("HeightFogColour");
		aNode_Sub21_Sub1_10106 = aClass101_9218.method1691("DistanceFogPlane");
		aNode_Sub21_Sub1_10108 = aClass101_9218.method1691("DistanceFogColour");
		Class115 class115_1 = aClass101_9218.method1651(aBool10097 ? "EnvMappedSea" : "EnvMappedWater");
		aClass101_9218.method1655(class115_1);
		return true;
	}

	void method15517() {
		aFloat10114 = 2.4414062E-4F;
		short s_2 = 256;
		float f_3 = 0.3F;
		float f_4 = 0.4F;
		float f_5 = 0.1F;
		byte b_6 = 5;
		aClass384_10091.method6525(aFloat10114, aFloat10114, aFloat10114, aFloat10114);
		aClass303_10113.set(-aGraphicalRenderer_Sub2_413.aFloatArray8747[0], -aGraphicalRenderer_Sub2_413.aFloatArray8747[1], -aGraphicalRenderer_Sub2_413.aFloatArray8747[2], 32.0F);
		aClass303_10099.set(aGraphicalRenderer_Sub2_413.aFloat8766, aGraphicalRenderer_Sub2_413.aFloat8767, aGraphicalRenderer_Sub2_413.aFloat8768, b_6);
		aClass303_10115.set(f_5, f_4, s_2, f_3);
	}

	public void method15520() {
		method15517();
		aClass101_9218.method1655(aClass101_9218.method1654());
		aClass101_9218.method1646();
		aClass101_9218.method1671(aNode_Sub21_Sub1_10087, 0, aClass49_10092.anInterface1_480);
		aClass101_9218.method1671(aNode_Sub21_Sub1_10088, 1, aGraphicalRenderer_Sub2_413.method13965());
		aClass101_9218.method1668(aNode_Sub21_Sub1_10105, aClass384_10090);
		aClass101_9218.method1667(aNode_Sub21_Sub1_10101, aClass384_10091);
		int i_2 = 1 << (anInt10095 & 0x3);
		aClass101_9218.method1662(aNode_Sub21_Sub1_10093, aClass385_10089.x, aClass385_10089.y, aClass385_10089.z, (aGraphicalRenderer_Sub2_413.anInt8820 * i_2 % 40000) / 40000.0F);
		aClass101_9218.method1689(aNode_Sub21_Sub1_10096, aClass303_10113);
		aClass101_9218.method1689(aNode_Sub21_Sub1_10098, aClass303_10099);
		aClass101_9218.method1689(aNode_Sub21_Sub1_10100, aClass303_10115);
		aClass101_9218.method1689(aNode_Sub21_Sub1_10102, aClass303_10103);
		aClass101_9218.method1663(aNode_Sub21_Sub1_10104, aClass385_10086);
		aClass101_9218.method1689(aNode_Sub21_Sub1_10106, aClass303_10107);
		aClass101_9218.method1663(aNode_Sub21_Sub1_10108, aClass385_10109);
		aGraphicalRenderer_Sub2_413.method14002(Class352.aClass352_4098, anInt10110, anInt10111, anInt10094, anInt10112);
	}
}
