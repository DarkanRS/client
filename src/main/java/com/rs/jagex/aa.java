package com.rs.jagex;

public class aa extends Shadow implements Interface40 {

	long nativeid;

	aa() {
	}

	@Override
	protected void finalize() {
		if (nativeid != 0L)
			Class156.method2642(this);
	}

	@Override
	public native void ma(boolean var1);

	@Override
	public native void x(boolean var1);

	@Override
	public native void y(boolean var1);

}
