package com.rs.jagex;

public class Class125 implements Interface8 {

	public static NativeSprite aNativeSprite_1571;

	static int LAST_IP_ADDRESS;

	static int method2172(int i_0) {
		int i_2 = i_0 & 0x3f;
		int i_3 = i_0 >> 6 & 0x3;
		if (i_2 == 18) {
			if (i_3 == 0)
				return 1;
			if (i_3 == 1)
				return 2;
			if (i_3 == 2)
				return 4;
			if (i_3 == 3)
				return 8;
		} else if (i_2 == 19 || i_2 == 21) {
			if (i_3 == 0)
				return 16;
			if (i_3 == 1)
				return 32;
			if (i_3 == 2)
				return 64;
			if (i_3 == 3)
				return 128;
		}
		return 0;
	}

	public static WorldMapDef method2173() {
		return Class291.aCacheableNode_Sub6_3491;
	}

	int anInt1568;

	int anInt1569;

	float[] aFloatArray1570;

	Class125(int i_1, int i_2) {
		anInt1568 = i_1;
		anInt1569 = i_2;
		aFloatArray1570 = new float[anInt1568 * anInt1569];
	}

	@Override
	public int method1() {
		return anInt1568;
	}

	@Override
	public void method26() {
	}

	@Override
	public void method32() {
	}

	@Override
	public int method39() {
		return anInt1569 * -2091052327 * 946359657;
	}

	@Override
	public int method73() {
		return anInt1569 * -2091052327 * 946359657;
	}

	@Override
	public int method74() {
		return anInt1569;
	}

	@Override
	public int method75() {
		return anInt1568 * -1553362033 * -2020594833;
	}

	@Override
	public int method76() {
		return anInt1568 * -1553362033 * -2020594833;
	}

	@Override
	public int method77() {
		return anInt1569 * -2091052327 * 946359657;
	}
}
