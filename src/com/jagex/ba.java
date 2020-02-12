package com.jagex;

public class ba extends Node_Sub1 implements Interface40 {

    long nativeid;

    native void sa(ja var1, int var2);

    ba(ja ja_1, int i_2) {
        this.sa(ja_1, i_2);
    }

    public native void ma(boolean var1);

    native void ha();

    native void u();

    native void v();

    public native void y(boolean var1);

    native void j();

    native void n(ja var1, int var2);

    native void g(ja var1, int var2);

    public native void x(boolean var1);

    public void finalize() {
        if (this.nativeid != 0L) {
            Class156.method2642(this, (byte) 120);
        }

    }

}
