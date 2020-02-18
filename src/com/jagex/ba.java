package com.jagex;

public class ba extends Node_Sub1 implements Interface40 {

    long nativeid;

    ba(ja ja_1, int i_2) {
        sa(ja_1, i_2);
    }

    native void sa(ja var1, int var2);

    @Override
    public native void ma(boolean var1);

    native void ha();

    native void u();

    native void v();

    @Override
    public native void y(boolean var1);

    native void j();

    native void n(ja var1, int var2);

    native void g(ja var1, int var2);

    @Override
    public native void x(boolean var1);

    @Override
    protected void finalize() {
        if (nativeid != 0L) {
            Class156.method2642(this);
        }

    }

}
