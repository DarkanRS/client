public class oa implements Interface8, Interface40 {

	long nativeid = 0L;
	int anInt2681;
	int anInt2682;

	native void e(long var1, boolean var3);

	native void g(int var1, int var2);

	public int method1() {
		return this.anInt2681;
	}

	public void finalize() {
		if (this.nativeid != 0L) {
			Class156.method2642(this, (byte) 60);
		}

	}

	oa(int i_1, int i_2) {
		this.anInt2681 = i_1;
		this.anInt2682 = i_2;
		this.g(i_1, i_2);
	}

	public void y(boolean bool_1) {
		this.za(this.nativeid, bool_1);
	}

	native void za(long var1, boolean var3);

	public int method73() {
		return this.anInt2682;
	}

	public int method75() {
		return this.anInt2681;
	}

	native void w(long var1, boolean var3);

	public int method77() {
		return this.anInt2682;
	}

	public int method76() {
		return this.anInt2681;
	}

	public void ma(boolean bool_1) {
		this.za(this.nativeid, bool_1);
	}

	public void method32() {
		this.ma(false);
	}

	public int method39() {
		return this.anInt2682;
	}

	public void x(boolean bool_1) {
		this.za(this.nativeid, bool_1);
	}

	native void j(int var1, int var2);

	native void o(int var1, int var2);

	native void l(long var1, boolean var3);

	public int method74() {
		return this.anInt2682;
	}

	public void method26() {
		this.ma(false);
	}

	native void s(long var1, boolean var3);

}
