/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class oa implements Interface8, Interface40 {
	int anInt2681;
	long nativeid = 0L;
	int anInt2682;

	native void e(long l, boolean bool);

	native void g(int i, int i_0_);

	public int method1() {
		return ((oa) this).anInt2681;
	}

	public void finalize() {
		if (((oa) this).nativeid != 0L)
			Class156.method2642(this, (byte) 60);
	}

	oa(int i, int i_1_) {
		((oa) this).anInt2681 = i;
		((oa) this).anInt2682 = i_1_;
		g(i, i_1_);
	}

	public void y(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	native void za(long l, boolean bool);

	public int method73() {
		return ((oa) this).anInt2682;
	}

	public int method75() {
		return ((oa) this).anInt2681;
	}

	native void w(long l, boolean bool);

	public int method77() {
		return ((oa) this).anInt2682;
	}

	public int method76() {
		return ((oa) this).anInt2681;
	}

	public void ma(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	public void method32() {
		ma(false);
	}

	void method3663() {
		if (((oa) this).nativeid != 0L)
			Class156.method2642(this, (byte) 77);
	}

	void method3664() {
		if (((oa) this).nativeid != 0L)
			Class156.method2642(this, (byte) 76);
	}

	public int method39() {
		return ((oa) this).anInt2682;
	}

	public void x(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	native void j(int i, int i_2_);

	native void o(int i, int i_3_);

	native void l(long l, boolean bool);

	public int method74() {
		return ((oa) this).anInt2682;
	}

	public void method26() {
		ma(false);
	}

	native void s(long l, boolean bool);
}
