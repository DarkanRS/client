package com.jagex;

public class m extends FontRenderer implements Interface40 {

    long nativeid;

    native void aq(ja var1, ba var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

    m(ja ja_1, ba ba_2, FontMetrics fontmetrics_3, SpriteDefinitions[] arr_4, NativeSprite[] arr_5) {
        super(ja_1, fontmetrics_3);
        byte[][] bytes_6 = new byte[arr_4.length][];
        int[] ints_7 = new int[arr_4.length];
        int[] ints_8 = new int[arr_4.length];
        int[] ints_9 = new int[arr_4.length];
        int[] ints_10 = new int[arr_4.length];

        for (int i_11 = 0; i_11 < arr_4.length; i_11++) {
            bytes_6[i_11] = arr_4[i_11].pixels;
            ints_7[i_11] = arr_4[i_11].width;
            ints_8[i_11] = arr_4[i_11].height;
            ints_9[i_11] = arr_4[i_11].minX;
            ints_10[i_11] = arr_4[i_11].minY;
        }

        this.n(ja_1, ba_2, bytes_6, ints_7, ints_8, ints_9, ints_10);
    }

    public native void x(boolean var1);

    public native void ma(boolean var1);

    native void UA(char var1, int var2, int var3, int var4, boolean var5);

    void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        this.MA(var_1, i_2, i_3, i_4, bool_5, class455_6, i_7, i_8);
    }

    native void MA(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

    void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        this.MA(var_1, i_2, i_3, i_4, bool_5, class455_6, i_7, i_8);
    }

    native void aa(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

    public void finalize() {
        if (this.nativeid != 0L) {
            Class156.method2642(this, (byte) 116);
        }

    }

    public native void y(boolean var1);

    native void n(ja var1, ba var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

    native void ae(ja var1, ba var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

    native void t(char var1, int var2, int var3, int var4, boolean var5);

    native void c(char var1, int var2, int var3, int var4, boolean var5);

    native void av(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

}
