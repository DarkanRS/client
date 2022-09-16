package com.jagex;

public class oa implements Interface8, Interface40 {

	long nativeid;
	int anInt2681;
	int anInt2682;

	oa(int i_1, int i_2) {
		anInt2681 = i_1;
		anInt2682 = i_2;
		g(i_1, i_2);
	}

	native void e(long var1, boolean var3);

	@Override
	protected void finalize() {
		if (nativeid != 0L)
			Class156.method2642(this);

	}

	native void g(int var1, int var2);

	native void j(int var1, int var2);

	native void l(long var1, boolean var3);

	@Override
	public void ma(boolean bool_1) {
		za(nativeid, bool_1);
	}

	@Override
	public int method1() {
		return anInt2681;
	}

	@Override
	public void method26() {
		ma(false);
	}

	@Override
	public void method32() {
		ma(false);
	}

	@Override
	public int method39() {
		return anInt2682;
	}

	@Override
	public int method73() {
		return anInt2682;
	}

	@Override
	public int method74() {
		return anInt2682;
	}

	@Override
	public int method75() {
		return anInt2681;
	}

	@Override
	public int method76() {
		return anInt2681;
	}

	@Override
	public int method77() {
		return anInt2682;
	}

	native void o(int var1, int var2);

	native void s(long var1, boolean var3);

	native void w(long var1, boolean var3);

	@Override
	public void x(boolean bool_1) {
		za(nativeid, bool_1);
	}

	@Override
	public void y(boolean bool_1) {
		za(nativeid, bool_1);
	}

	native void za(long var1, boolean var3);

}
