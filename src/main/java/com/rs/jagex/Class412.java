package com.rs.jagex;

public class Class412 {

	public static byte FC_MIN_RANK_CAN_KICK;
	static int[] anIntArray4962;
	static char[] aCharArray4960 = {' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};

	static char[] aCharArray4961 = {'[', ']', '#'};

	static void method6934(Matrix44Var matrix44var_0, Matrix44 matrix44_1, int i_2, int i_3) {
		if (Class20.aClass384_158 == null)
			Class20.aClass384_158 = new Matrix44(matrix44_1);
		else
			Class20.aClass384_158.copy(matrix44_1);
		Class20.aClass294_155.method5209(matrix44var_0);
		Class20.anInt176 = i_2;
		Class20.anInt184 = i_3;
	}

	Class412() throws Throwable {
		throw new Error();
	}
}
