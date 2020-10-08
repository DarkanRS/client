package com.jagex;

public class ea extends FontRenderer implements Interface40 {

    long nativeid;

    ea(ja ja_1, ba ba_2, FontMetrics fontmetrics_3, SpriteDefinitions[] arr_4) {
        super(ja_1, fontmetrics_3);
        byte[][] bytes_6 = new byte[arr_4.length][];
        int[] ints_7 = new int[arr_4.length];
        int[] ints_8 = new int[arr_4.length];
        int[] ints_9 = new int[arr_4.length];
        int[] ints_10 = new int[arr_4.length];

        for (int i_11 = 0; i_11 < arr_4.length; i_11++) {
            SpriteDefinitions class91_12 = arr_4[i_11];
            if (class91_12.alpha != null) {
                bytes_6[i_11] = class91_12.alpha;
            } else {
                byte[] bytes_13 = class91_12.pixels;
                byte[] bytes_14 = bytes_6[i_11] = new byte[bytes_13.length];

                for (int i_15 = 0; i_15 < bytes_13.length; i_15++) {
                    bytes_14[i_15] = (byte) (bytes_13[i_15] == 0 ? 0 : -1);
                }
            }

            ints_7[i_11] = class91_12.width;
            ints_8[i_11] = class91_12.height;
            ints_9[i_11] = class91_12.minX;
            ints_10[i_11] = class91_12.minY;
        }

        n(ja_1, ba_2, bytes_6, ints_7, ints_8, ints_9, ints_10);
    }

    @Override
    native void UA(char var1, int var2, int var3, int var4, boolean var5);

    native void n(ja var1, ba var2, byte[][] var3, int[] var4, int[] var5, int[] var6, int[] var7);

    native void aq(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

    @Override
    public native void x(boolean var1);

    @Override
    protected void finalize() {
        if (nativeid != 0L) {
            Class156.method2642(this);
        }

    }

    native void P(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

    @Override
    void method362(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        P(var_1, i_2, i_3, i_4, bool_5, class455_6, i_7, i_8);
    }

    @Override
    public native void ma(boolean var1);

    @Override
    native void t(char var1, int var2, int var3, int var4, boolean var5);

    @Override
    native void c(char var1, int var2, int var3, int var4, boolean var5);

    @Override
    public native void y(boolean var1);

    @Override
    void method374(char var_1, int i_2, int i_3, int i_4, boolean bool_5, Class455 class455_6, int i_7, int i_8) {
        P(var_1, i_2, i_3, i_4, bool_5, class455_6, i_7, i_8);
    }

    native void ae(char var1, int var2, int var3, int var4, boolean var5, Class455 var6, int var7, int var8);

}
