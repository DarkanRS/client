package com.jagex;
public class wa extends Class455 implements Interface40 {

	long nativeid;

	native void g(ja var1, ba var2, int var3, int var4, int[] var5, int[] var6);

	native void l(ja var1, ba var2, int var3, int var4, int[] var5, int[] var6);

	public void finalize() {
		if (this.nativeid != 0L) {
			Class156.method2642(this, (byte) 91);
		}

	}

	wa(ja ja_1, ba ba_2, int i_3, int i_4, int[] ints_5, int[] ints_6) {
		this.l(ja_1, ba_2, i_3, i_4, ints_5, ints_6);
	}

	public native void x(boolean var1);

	public native void ma(boolean var1);

	public native void y(boolean var1);

	native void n(ja var1, ba var2, int var3, int var4, int[] var5, int[] var6);

}
