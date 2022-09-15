package com.jagex;

public class Class158_Sub1_Sub1 extends Class158_Sub1 {

	oa anoa9448;
	int anInt9446;
	int anInt9450;
	fa afa9447;
	ja aja9449;

	Class158_Sub1_Sub1(ja ja_1) {
		aja9449 = ja_1;
	}

	@Override
	public void method13759(int i_1, Interface9 interface9_2) {
		if (i_1 != 0)
			throw new RuntimeException();
		if (anoa9448 != null && interface9_2 != null && (anoa9448.method1() != interface9_2.method1() || anoa9448.method74() != interface9_2.method74()))
			throw new RuntimeException();
		else {
			afa9447 = (fa) interface9_2;
			if (interface9_2 != null) {
				anInt9446 = interface9_2.method1();
				anInt9450 = interface9_2.method74();
			} else if (anoa9448 == null) {
				anInt9446 = 0;
				anInt9450 = 0;
			}

			if (aja9449.method8523() == this)
				method213();

		}
	}

	@Override
	public boolean method13764() {
		return true;
	}

	@Override
	public void method13765(Interface8 interface8_1) {
		if (afa9447 != null && interface8_1 != null && (afa9447.method1() != interface8_1.method1() || afa9447.method74() != interface8_1.method74()))
			throw new RuntimeException();
		anoa9448 = (oa) interface8_1;
		if (interface8_1 != null) {
			anInt9446 = interface8_1.method1();
			anInt9450 = interface8_1.method74();
		} else if (afa9447 == null) {
			anInt9446 = 0;
			anInt9450 = 0;
		}

		if (aja9449.method8523() == this)
			method213();
	}

	@Override
	public void method186() {
	}

	@Override
	boolean method211() {
		aja9449.d(afa9447 == null ? 0L : afa9447.nativeid, anoa9448 == null ? 0L : anoa9448.nativeid);
		return true;
	}

	@Override
	public void method212() {
	}

	@Override
	boolean method213() {
		aja9449.d(afa9447 == null ? 0L : afa9447.nativeid, anoa9448 == null ? 0L : anoa9448.nativeid);
		return true;
	}

	@Override
	public int method2714() {
		return anInt9446;
	}

	@Override
	boolean method2715() {
		return true;
	}

	@Override
	public int method2716() {
		return anInt9450;
	}

	@Override
	boolean method2717() {
		return true;
	}

	@Override
	boolean method2718() {
		return true;
	}

	@Override
	public int method2719() {
		return anInt9446;
	}

	@Override
	public int method2720() {
		return anInt9446;
	}

	@Override
	public int method2721() {
		return anInt9450;
	}

	@Override
	boolean method2722() {
		return true;
	}

	@Override
	boolean method2723() {
		return true;
	}

	@Override
	boolean method2724() {
		return true;
	}

	@Override
	boolean method2725() {
		return true;
	}

	@Override
	public int method2726() {
		return anInt9446;
	}

	@Override
	public int method2727() {
		return anInt9450;
	}

	@Override
	boolean method54() {
		aja9449.d(afa9447 == null ? 0L : afa9447.nativeid, anoa9448 == null ? 0L : anoa9448.nativeid);
		return true;
	}

}
