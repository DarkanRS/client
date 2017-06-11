/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class oa implements Interface8_Impl1_Impl2, Interface25 {
	long nativeid = 0L;
	int anInt8979;
	int anInt8980;

	public int k() {
		return ((oa) this).anInt8980;
	}

	native void g(int i, int i_0_);

	public int a() {
		return ((oa) this).anInt8979;
	}

	public int f() {
		return ((oa) this).anInt8980;
	}

	native void s(long l, boolean bool);

	native void n(int i, int i_1_);

	public void b() {
		ma(false);
	}

	public int p() {
		return ((oa) this).anInt8979;
	}

	public int i() {
		return ((oa) this).anInt8979;
	}

	public void u() {
		ma(false);
	}

	native void za(long l, boolean bool);

	public void ma(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	public void x() {
		ma(false);
	}

	public void d() {
		ma(false);
	}

	native void r(int i, int i_2_);

	native void q(int i, int i_3_);

	public void z(boolean bool) {
		za(((oa) this).nativeid, bool);
	}

	oa(int i, int i_4_) {
		((oa) this).anInt8979 = i;
		((oa) this).anInt8980 = i_4_;
		g(i, i_4_);
	}

	native void y(long l, boolean bool);
}
