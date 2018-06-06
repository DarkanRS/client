/* Class41_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class41_Sub1_Sub1 extends Class41_Sub1 {
	public Vector3 aClass385_10086;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10087;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10088;
	public Vector3 aClass385_10089;
	public Matrix44Arr aClass384_10090 = new Matrix44Arr();
	public Matrix44Arr aClass384_10091 = new Matrix44Arr();
	Class49 aClass49_10092;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10093;
	public int anInt10094;
	public int anInt10095;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10096;
	boolean aBool10097;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10098;
	Vector4 aClass303_10099;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10100;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10101;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10102;
	public Vector4 aClass303_10103;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10104;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10105;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10106;
	public Vector4 aClass303_10107;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_10108;
	public Vector3 aClass385_10109;
	public int anInt10110;
	public int anInt10111;
	public int anInt10112;
	Vector4 aClass303_10113;
	float aFloat10114;
	Vector4 aClass303_10115;

	public void method15515() {
		method15517(-833343372);
		aClass101_9218.method1655(aClass101_9218.method1654(-2013921956));
		aClass101_9218.method1646();
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087), 0, (((Class41_Sub1_Sub1) this).aClass49_10092.anInterface1_480), (byte) 0);
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088), 1, aClass505_Sub2_413.method13965(), (byte) 0);
		aClass101_9218.method1668((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105), aClass384_10090, (byte) -11);
		aClass101_9218.method1667((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101), aClass384_10091, 308777594);
		int i = 1 << (anInt10095 * 1077467809 & 0x3);
		aClass101_9218.method1662((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093), aClass385_10089.x, aClass385_10089.y, aClass385_10089.z, (float) (i * aClass505_Sub2_413.anInt8820 % 40000) / 40000.0F, (byte) -60);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096), ((Class41_Sub1_Sub1) this).aClass303_10113, 1544632414);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098), ((Class41_Sub1_Sub1) this).aClass303_10099, 2101913834);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100), ((Class41_Sub1_Sub1) this).aClass303_10115, 1534120063);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102), aClass303_10103, 2081729526);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104), aClass385_10086, 987670540);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106), aClass303_10107, 1658174439);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108), aClass385_10109, 519961028);
		aClass505_Sub2_413.method14002(Class352.aClass352_4098, 576571639 * anInt10110, 1765960201 * anInt10111, anInt10094 * -55734077, -486392523 * anInt10112);
	}

	boolean method14524() throws Exception_Sub2 {
		if (!((Class41_Sub1_Sub1) this).aClass49_10092.method969())
			return false;
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087 = aClass101_9218.method1691("NormalSampler", (short) 9050);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088 = aClass101_9218.method1691("EnvMapSampler", (short) 29576);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105 = aClass101_9218.method1691("WVPMatrix", (short) 19852);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101 = aClass101_9218.method1691("TexCoordMatrix", (short) 30264);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093 = aClass101_9218.method1691("EyePosAndTime", (short) 12670);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096 = aClass101_9218.method1691("SunDirectionAndExponent", (short) 30161);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098 = aClass101_9218.method1691("SunColourAndWaveExponent", (short) 14845);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100 = (aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset", (short) 15063));
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102 = aClass101_9218.method1691("HeightFogPlane", (short) 15139);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104 = aClass101_9218.method1691("HeightFogColour", (short) 7836);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106 = aClass101_9218.method1691("DistanceFogPlane", (short) 13766);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108 = aClass101_9218.method1691("DistanceFogColour", (short) 4861);
		Class115 class115 = aClass101_9218.method1651((((Class41_Sub1_Sub1) this).aBool10097 ? "EnvMappedSea" : "EnvMappedWater"), -780122128);
		aClass101_9218.method1655(class115);
		return true;
	}

	void method14527(Matrix44Arr class384) {
		Matrix44Arr class384_0_ = new Matrix44Arr();
		class384_0_.method6525(((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, 1.0F, 1.0F);
		class384_0_.method6568(class384, class384_0_);
		super.method14527(class384_0_);
	}

	void method14530(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass505_Sub2_413.aFloatArray8747[1])) * 2.0F);
		float f_1_ = aClass505_Sub2_413.aFloat8770;
		aClass505_Sub2_413.aFloat8770 *= f;
		super.method14530(bool);
		aClass505_Sub2_413.aFloat8770 = f_1_;
	}

	public void method15516() {
		method15517(1027501417);
		aClass101_9218.method1655(aClass101_9218.method1654(-512032533));
		aClass101_9218.method1646();
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087), 0, (((Class41_Sub1_Sub1) this).aClass49_10092.anInterface1_480), (byte) 0);
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088), 1, aClass505_Sub2_413.method13965(), (byte) 0);
		aClass101_9218.method1668((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105), aClass384_10090, (byte) -71);
		aClass101_9218.method1667((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101), aClass384_10091, 936143780);
		int i = 1 << (anInt10095 * 1077467809 & 0x3);
		aClass101_9218.method1662((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093), aClass385_10089.x, aClass385_10089.y, aClass385_10089.z, (float) (i * aClass505_Sub2_413.anInt8820 % 40000) / 40000.0F, (byte) -106);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096), ((Class41_Sub1_Sub1) this).aClass303_10113, 2027572518);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098), ((Class41_Sub1_Sub1) this).aClass303_10099, 2018416761);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100), ((Class41_Sub1_Sub1) this).aClass303_10115, 1989791572);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102), aClass303_10103, 1847722389);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104), aClass385_10086, 1836528947);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106), aClass303_10107, 2081134759);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108), aClass385_10109, 1049196869);
		aClass505_Sub2_413.method14002(Class352.aClass352_4098, 576571639 * anInt10110, 1765960201 * anInt10111, anInt10094 * -55734077, -486392523 * anInt10112);
	}

	void method15517(int i) {
		((Class41_Sub1_Sub1) this).aFloat10114 = 2.4414062E-4F;
		int i_2_ = 256;
		float f = 0.3F;
		float f_3_ = 0.4F;
		float f_4_ = 0.1F;
		int i_5_ = 5;
		aClass384_10091.method6525(((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114);
		((Class41_Sub1_Sub1) this).aClass303_10113.set(-aClass505_Sub2_413.aFloatArray8747[0], -aClass505_Sub2_413.aFloatArray8747[1], -aClass505_Sub2_413.aFloatArray8747[2], 32.0F);
		((Class41_Sub1_Sub1) this).aClass303_10099.set(aClass505_Sub2_413.aFloat8766, aClass505_Sub2_413.aFloat8767, aClass505_Sub2_413.aFloat8768, (float) i_5_);
		((Class41_Sub1_Sub1) this).aClass303_10115.set(f_4_, f_3_, (float) i_2_, f);
	}

	public void method15518() {
		method15517(1168468954);
		aClass101_9218.method1655(aClass101_9218.method1654(173243855));
		aClass101_9218.method1646();
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087), 0, (((Class41_Sub1_Sub1) this).aClass49_10092.anInterface1_480), (byte) 0);
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088), 1, aClass505_Sub2_413.method13965(), (byte) 0);
		aClass101_9218.method1668((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105), aClass384_10090, (byte) -81);
		aClass101_9218.method1667((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101), aClass384_10091, -159763583);
		int i = 1 << (anInt10095 * 1077467809 & 0x3);
		aClass101_9218.method1662((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093), aClass385_10089.x, aClass385_10089.y, aClass385_10089.z, (float) (i * aClass505_Sub2_413.anInt8820 % 40000) / 40000.0F, (byte) -77);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096), ((Class41_Sub1_Sub1) this).aClass303_10113, 1564092408);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098), ((Class41_Sub1_Sub1) this).aClass303_10099, 2070577755);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100), ((Class41_Sub1_Sub1) this).aClass303_10115, 1981752177);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102), aClass303_10103, 1788462319);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104), aClass385_10086, -208525940);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106), aClass303_10107, 2126200623);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108), aClass385_10109, 513935868);
		aClass505_Sub2_413.method14002(Class352.aClass352_4098, 576571639 * anInt10110, 1765960201 * anInt10111, anInt10094 * -55734077, -486392523 * anInt10112);
	}

	void method15519() {
		((Class41_Sub1_Sub1) this).aFloat10114 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_6_ = 0.4F;
		float f_7_ = 0.1F;
		int i_8_ = 5;
		aClass384_10091.method6525(((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114);
		((Class41_Sub1_Sub1) this).aClass303_10113.set(-aClass505_Sub2_413.aFloatArray8747[0], -aClass505_Sub2_413.aFloatArray8747[1], -aClass505_Sub2_413.aFloatArray8747[2], 32.0F);
		((Class41_Sub1_Sub1) this).aClass303_10099.set(aClass505_Sub2_413.aFloat8766, aClass505_Sub2_413.aFloat8767, aClass505_Sub2_413.aFloat8768, (float) i_8_);
		((Class41_Sub1_Sub1) this).aClass303_10115.set(f_7_, f_6_, (float) i, f);
	}

	void method14540(Matrix44Arr class384) {
		Matrix44Arr class384_9_ = new Matrix44Arr();
		class384_9_.method6525(((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, 1.0F, 1.0F);
		class384_9_.method6568(class384, class384_9_);
		super.method14527(class384_9_);
	}

	public void method15520(int i) {
		method15517(-1407827048);
		aClass101_9218.method1655(aClass101_9218.method1654(558838248));
		aClass101_9218.method1646();
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087), 0, (((Class41_Sub1_Sub1) this).aClass49_10092.anInterface1_480), (byte) 0);
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088), 1, aClass505_Sub2_413.method13965(), (byte) 0);
		aClass101_9218.method1668((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105), aClass384_10090, (byte) -102);
		aClass101_9218.method1667((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101), aClass384_10091, 1269356236);
		int i_10_ = 1 << (anInt10095 * 1077467809 & 0x3);
		aClass101_9218.method1662((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093), aClass385_10089.x, aClass385_10089.y, aClass385_10089.z, (float) (i_10_ * aClass505_Sub2_413.anInt8820 % 40000) / 40000.0F, (byte) -89);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096), ((Class41_Sub1_Sub1) this).aClass303_10113, 1645652807);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098), ((Class41_Sub1_Sub1) this).aClass303_10099, 1748236316);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100), ((Class41_Sub1_Sub1) this).aClass303_10115, 1588793245);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102), aClass303_10103, 2066872642);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104), aClass385_10086, -1094823842);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106), aClass303_10107, 1825514726);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108), aClass385_10109, -1843665663);
		aClass505_Sub2_413.method14002(Class352.aClass352_4098, 576571639 * anInt10110, 1765960201 * anInt10111, anInt10094 * -55734077, -486392523 * anInt10112);
	}

	void method14546(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass505_Sub2_413.aFloatArray8747[1])) * 2.0F);
		float f_11_ = aClass505_Sub2_413.aFloat8770;
		aClass505_Sub2_413.aFloat8770 *= f;
		super.method14530(bool);
		aClass505_Sub2_413.aFloat8770 = f_11_;
	}

	void method14531(boolean bool) {
		float f = 1.0F + ((1.0F - Math.abs(aClass505_Sub2_413.aFloatArray8747[1])) * 2.0F);
		float f_12_ = aClass505_Sub2_413.aFloat8770;
		aClass505_Sub2_413.aFloat8770 *= f;
		super.method14530(bool);
		aClass505_Sub2_413.aFloat8770 = f_12_;
	}

	public void method15521() {
		method15517(-224396228);
		aClass101_9218.method1655(aClass101_9218.method1654(423246903));
		aClass101_9218.method1646();
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087), 0, (((Class41_Sub1_Sub1) this).aClass49_10092.anInterface1_480), (byte) 0);
		aClass101_9218.method1671((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088), 1, aClass505_Sub2_413.method13965(), (byte) 0);
		aClass101_9218.method1668((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105), aClass384_10090, (byte) -43);
		aClass101_9218.method1667((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101), aClass384_10091, 1488788383);
		int i = 1 << (anInt10095 * 1077467809 & 0x3);
		aClass101_9218.method1662((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093), aClass385_10089.x, aClass385_10089.y, aClass385_10089.z, (float) (i * aClass505_Sub2_413.anInt8820 % 40000) / 40000.0F, (byte) -6);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096), ((Class41_Sub1_Sub1) this).aClass303_10113, 1612404578);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098), ((Class41_Sub1_Sub1) this).aClass303_10099, 1757533019);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100), ((Class41_Sub1_Sub1) this).aClass303_10115, 1736268895);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102), aClass303_10103, 1793257407);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104), aClass385_10086, 973104118);
		aClass101_9218.method1689((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106), aClass303_10107, 1995410077);
		aClass101_9218.method1663((((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108), aClass385_10109, -172056087);
		aClass505_Sub2_413.method14002(Class352.aClass352_4098, 576571639 * anInt10110, 1765960201 * anInt10111, anInt10094 * -55734077, -486392523 * anInt10112);
	}

	public Class41_Sub1_Sub1(Class505_Sub2 class505_sub2, Class49 class49, boolean bool) throws Exception_Sub2 {
		super(class505_sub2);
		aClass385_10089 = new Vector3();
		((Class41_Sub1_Sub1) this).aClass303_10113 = new Vector4();
		((Class41_Sub1_Sub1) this).aClass303_10099 = new Vector4();
		((Class41_Sub1_Sub1) this).aClass303_10115 = new Vector4();
		aClass303_10103 = new Vector4();
		aClass385_10086 = new Vector3();
		aClass303_10107 = new Vector4();
		aClass385_10109 = new Vector3();
		((Class41_Sub1_Sub1) this).aFloat10114 = 0.0F;
		new Matrix44Arr();
		((Class41_Sub1_Sub1) this).aClass49_10092 = class49;
		((Class41_Sub1_Sub1) this).aBool10097 = bool;
		if (class505_sub2.method13887() && class505_sub2.method13888())
			method14523("EnvMappedWater");
	}

	void method15522() {
		((Class41_Sub1_Sub1) this).aFloat10114 = 2.4414062E-4F;
		int i = 256;
		float f = 0.3F;
		float f_13_ = 0.4F;
		float f_14_ = 0.1F;
		int i_15_ = 5;
		aClass384_10091.method6525(((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114);
		((Class41_Sub1_Sub1) this).aClass303_10113.set(-aClass505_Sub2_413.aFloatArray8747[0], -aClass505_Sub2_413.aFloatArray8747[1], -aClass505_Sub2_413.aFloatArray8747[2], 32.0F);
		((Class41_Sub1_Sub1) this).aClass303_10099.set(aClass505_Sub2_413.aFloat8766, aClass505_Sub2_413.aFloat8767, aClass505_Sub2_413.aFloat8768, (float) i_15_);
		((Class41_Sub1_Sub1) this).aClass303_10115.set(f_14_, f_13_, (float) i, f);
	}

	void method14534(Matrix44Arr class384) {
		Matrix44Arr class384_16_ = new Matrix44Arr();
		class384_16_.method6525(((Class41_Sub1_Sub1) this).aFloat10114, ((Class41_Sub1_Sub1) this).aFloat10114, 1.0F, 1.0F);
		class384_16_.method6568(class384, class384_16_);
		super.method14527(class384_16_);
	}

	boolean method14539() throws Exception_Sub2 {
		if (!((Class41_Sub1_Sub1) this).aClass49_10092.method969())
			return false;
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087 = aClass101_9218.method1691("NormalSampler", (short) 12505);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088 = aClass101_9218.method1691("EnvMapSampler", (short) 15011);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105 = aClass101_9218.method1691("WVPMatrix", (short) 25962);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101 = aClass101_9218.method1691("TexCoordMatrix", (short) 13855);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093 = aClass101_9218.method1691("EyePosAndTime", (short) 7415);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096 = aClass101_9218.method1691("SunDirectionAndExponent", (short) 18233);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098 = aClass101_9218.method1691("SunColourAndWaveExponent", (short) 7594);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100 = (aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset", (short) 26347));
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102 = aClass101_9218.method1691("HeightFogPlane", (short) 28725);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104 = aClass101_9218.method1691("HeightFogColour", (short) 12979);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106 = aClass101_9218.method1691("DistanceFogPlane", (short) 21385);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108 = aClass101_9218.method1691("DistanceFogColour", (short) 8591);
		Class115 class115 = aClass101_9218.method1651((((Class41_Sub1_Sub1) this).aBool10097 ? "EnvMappedSea" : "EnvMappedWater"), 1171807076);
		aClass101_9218.method1655(class115);
		return true;
	}

	boolean method14541() throws Exception_Sub2 {
		if (!((Class41_Sub1_Sub1) this).aClass49_10092.method969())
			return false;
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10087 = aClass101_9218.method1691("NormalSampler", (short) 4213);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10088 = aClass101_9218.method1691("EnvMapSampler", (short) 31886);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10105 = aClass101_9218.method1691("WVPMatrix", (short) 16446);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10101 = aClass101_9218.method1691("TexCoordMatrix", (short) 11828);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10093 = aClass101_9218.method1691("EyePosAndTime", (short) 7020);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10096 = aClass101_9218.method1691("SunDirectionAndExponent", (short) 26895);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10098 = aClass101_9218.method1691("SunColourAndWaveExponent", (short) 24843);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10100 = (aClass101_9218.method1691("WaveIntensityAndBreakWaterDepthAndOffset", (short) 6702));
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10102 = aClass101_9218.method1691("HeightFogPlane", (short) 10753);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10104 = aClass101_9218.method1691("HeightFogColour", (short) 28390);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10106 = aClass101_9218.method1691("DistanceFogPlane", (short) 26837);
		((Class41_Sub1_Sub1) this).aClass282_Sub21_Sub1_10108 = aClass101_9218.method1691("DistanceFogColour", (short) 15833);
		Class115 class115 = aClass101_9218.method1651((((Class41_Sub1_Sub1) this).aBool10097 ? "EnvMappedSea" : "EnvMappedWater"), -244176703);
		aClass101_9218.method1655(class115);
		return true;
	}

	static final void method15523(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		IsaacCipher.method7267(class118, class98, class527, 1800659377);
	}

	public static int method15524(byte i) {
		return -1824080875 * Class81.NUM_CHAT_LINES;
	}
}
