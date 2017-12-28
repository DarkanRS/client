/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 implements Interface8 {
	int anInt1568;
	int anInt1569;
	float[] aFloatArray1570;
	public static Class160 aClass160_1571;
	static int anInt1572;
	public static Class424 aClass424_1573;

	public void method32() {
		/* empty */
	}

	public int method1() {
		return ((Class125) this).anInt1568 * -2020594833;
	}

	public int method74() {
		return ((Class125) this).anInt1569 * 946359657;
	}

	public void method26() {
		/* empty */
	}

	Class125(int i, int i_0_) {
		((Class125) this).anInt1568 = i * -1553362033;
		((Class125) this).anInt1569 = -2091052327 * i_0_;
		((Class125) this).aFloatArray1570 = new float[(-2020594833 * ((Class125) this).anInt1568 * (946359657 * ((Class125) this).anInt1569))];
	}

	public int method76() {
		return ((Class125) this).anInt1568 * -2020594833;
	}

	public int method75() {
		return ((Class125) this).anInt1568 * -2020594833;
	}

	public int method73() {
		return ((Class125) this).anInt1569 * 946359657;
	}

	public int method77() {
		return ((Class125) this).anInt1569 * 946359657;
	}

	public int method39() {
		return ((Class125) this).anInt1569 * 946359657;
	}

	static final Class527 method2167(int i) {
		if (788272697 * Class517.anInt5905 == Class517.anArrayList5903.size())
			Class517.anArrayList5903.add(new Class527());
		Class527 class527 = ((Class527) Class517.anArrayList5903.get(Class517.anInt5905 * 788272697));
		Class517.anInt5905 += 1618802697;
		return class527;
	}

	static final void method2168(Class118 class118, Class98 class98, Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 425673003;
		class118.anInt1359 = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]) * 1576498757;
		class118.anInt1360 = (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]) * 361885101;
		class118.anInt1358 = ((((Class527) class527).anIntArray6999[2 + 1942118537 * ((Class527) class527).anInt7012]) * -1603580509);
		Class109.method1858(class118, (byte) -42);
	}

	static final void method2169(Class527 class527, byte i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class98 class98 = ((Class513) class513).aClass98_5885;
		Class40.method869(class118, class98, class527, 1852179585);
	}

	static final void method2170(Class118 class118, Class98 class98, Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1404763010) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1421 = Class351.method6193(string, class527, 930133882);
		class118.aBool1384 = true;
	}

	static final void method2171(Class527 class527, byte i) {
		Class361.aClass361_4171.method6257(-168752774);
	}

	static final int method2172(int i, int i_1_) {
		int i_2_ = i & 0x3f;
		int i_3_ = i >> 6 & 0x3;
		if (18 == i_2_) {
			if (0 == i_3_)
				return 1;
			if (1 == i_3_)
				return 2;
			if (i_3_ == 2)
				return 4;
			if (3 == i_3_)
				return 8;
		} else if (19 == i_2_ || 21 == i_2_) {
			if (i_3_ == 0)
				return 16;
			if (1 == i_3_)
				return 32;
			if (2 == i_3_)
				return 64;
			if (3 == i_3_)
				return 128;
		}
		return 0;
	}

	public static Class282_Sub50_Sub6 method2173(int i) {
		return Class291_Sub1.aClass282_Sub50_Sub6_3491;
	}
}
