package com.jagex;

import java.awt.*;

public class ja extends AbstractRenderer implements Interface40 {

    static int[] ab = new int[Math.max(Math.max(104, 20), 24573)];
    static float[] ar = new float[20];
    static int[] ae = new int[6];
    static int[] aq;
    static float[] av;
    static int[] aa;
    static int[] bi;
    static int[] bw;
    static int[] bx;
    static short[] bz;
    static byte[] bj;

    static {
        aq = ab;
        av = ar;
        aa = ab;
        bi = ab;
        bw = new int[8191];
        bx = new int[8191];
        bz = new short[8191];
        bj = new byte[8191];
    }

    ba z;
    a[] ai;
    Matrix44 af;
    boolean bm;
    boolean b;
    float az;
    float ap;
    float ax;
    float al;
    int at = 4096;
    int ac = 4096;
    int as;
    Matrix44Var ay;
    Matrix44 an;
    long nativeid;
    NodeCollection au = new NodeCollection();
    Matrix44Var ag;
    Matrix44 ao;
    Matrix44 aw;

    public ja(Canvas canvas_1, ImageLoader interface22_2, int i_3, int i_4) {
        super(interface22_2);

        try {
            if (!Class362.getNativeLibraryLoader().loadLibrary("sw3d")) {
                throw new RuntimeException("");
            } else {
                Class156.method2643();
                q(textureCache, textureCache.method84(), 0);
                SunDefinitions.method854(false, true);
                bm = true;
                af = new Matrix44();
                new Vector3();
                ag = new Matrix44Var();
                new Quaternion();
                ao = new Matrix44();
                an = new Matrix44();
                aw = new Matrix44();
                method8457(new Matrix44Var());
                method8424(new Matrix44());
                nu(1);
                ni();
                if (canvas_1 != null) {
                    method8524(canvas_1, i_3, i_4);
                    method8412(canvas_1);
                }

                int i_5 = textureCache.method84();

                for (short s_6 = 0; s_6 < i_5; s_6++) {
                    TextureDetails class169_7 = textureCache.getTextureDetails(s_6);
                    if (class169_7 != null) {
                        V(s_6, class169_7.color, class169_7.blendType, class169_7.effectId, class169_7.effectParam1, class169_7.effectParam2, class169_7.isHalfSize, class169_7.shadowFactor, class169_7.brightness, class169_7.textureSpeedU, class169_7.textureSpeedV, class169_7.isGroundMesh, class169_7.skipTriangles, class169_7.aBool2087, class169_7.repeatS, class169_7.repeatT, class169_7.useMipmaps, class169_7.hdr, class169_7.isBrickTile, class169_7.combineMode);
                    }
                }

            }
        } catch (Throwable throwable_9) {
            method8396();
            throw new RuntimeException();
        }
    }

    native void op(za var1);

    native void q(ImageLoader var1, int var2, int var3);

    @Override
    public void method8618(Node_Sub1 class282_sub1_1) {
        z = (ba) class282_sub1_1;
        n(class282_sub1_1);
    }

    native void R(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9);

    @Override
    public boolean method8489() {
        return true;
    }

    native void Y(int var1);

    @Override
    public boolean method8649() {
        return false;
    }

    native void Q(int var1, int[] var2, float[] var3);

    native void wa(float[] var1);

    @Override
    protected synchronized void finalize() {
        method8396();
        if (nativeid != 0L) {
            Class156.method2642(this);
        }

    }

    @Override
    public native void ib(int var1, int var2, int var3);

    void h() {
        System.gc();
        System.runFinalization();
        Class156.method2652();
    }

    @Override
    public boolean method8464() {
        return false;
    }

    native void ol(int var1, int var2, int var3, int var4);

    @Override
    void method8485() {
        if (!b) {
            ai = null;
            z = null;
            af = null;

            for (ba ba_1 = (ba) au.head(); ba_1 != null; ba_1 = (ba) au.next()) {
                ba_1.ha();
            }

            au.removeAll();
            da();
            if (bm) {
                Class13.method508(false, true);
                bm = false;
            }

            h();
            Class156.method2644();
            b = true;
        }

    }

    @Override
    public Matrix44Var method8458() {
        return ay;
    }

    @Override
    public native void RA(boolean var1);

    @Override
    public void method8395() {
    }

    @Override
    public void method8488(int i_1) {
        Class156.method2652();
        Y(i_1);

        for (ba ba_2 = (ba) au.head(); ba_2 != null; ba_2 = (ba) au.next()) {
            ba_2.u();
        }

    }

    @Override
    public void method8398(int i_1) {
        Class156.method2652();
        Y(i_1);

        for (ba ba_2 = (ba) au.head(); ba_2 != null; ba_2 = (ba) au.next()) {
            ba_2.u();
        }

    }

    @Override
    public native int za();

    @Override
    public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        return new fa(this, ints_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public boolean method8465() {
        return true;
    }

    @Override
    public boolean method8664() {
        return true;
    }

    @Override
    public boolean method8403() {
        return false;
    }

    @Override
    public boolean method8404() {
        return false;
    }

    @Override
    public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aw.buf[15] + aw.buf[3] * f_1 + aw.buf[7] * f_2 + aw.buf[11] * f_3;
        float f_6 = aw.buf[12] + aw.buf[0] * f_1 + aw.buf[4] * f_2 + aw.buf[8] * f_3;
        float f_7 = aw.buf[13] + aw.buf[1] * f_1 + aw.buf[5] * f_2 + aw.buf[9] * f_3;
        float f_8 = ao.buf[14] + ao.buf[2] * f_1 + ao.buf[6] * f_2 + ao.buf[10] * f_3;
        floats_4[0] = ax + az * f_6 / f_5;
        floats_4[1] = al + ap * f_7 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public native void fl(int var1, int var2, int var3, int var4, int var5);

    @Override
    public native void jf();

    @Override
    public boolean method8454() {
        return true;
    }

    @Override
    public boolean method8407() {
        return true;
    }

    @Override
    public int method8463() {
        return 4;
    }

    @Override
    public void method8480() {
    }

    @Override
    public native void hi(int var1, Class455 var2, int var3, int var4);

    @Override
    public void method8420() {
    }

    @Override
    Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
        return new za(this, canvas_1, i_2, i_3);
    }

    native void PA(za var1);

    native void d(long var1, long var3);

    @Override
    public void method8421() {
        az = method8523().method2714() / 2.0F;
        ap = method8523().method2716() / 2.0F;
        ax = az;
        al = ap;
        k();
    }

    @Override
    public native void iw(int var1, float var2, float var3, float var4, float var5, float var6);

    @Override
    public void method8617(int i_1, int i_2, int i_3, int i_4) {
        az = i_3 / 2.0F;
        ap = i_4 / 2.0F;
        ax = i_1 + az;
        al = i_2 + ap;
        A(i_1, i_2, i_3, i_4);
    }

    native void A(int var1, int var2, int var3, int var4);

    @Override
    public Matrix44 method8587() {
        return an;
    }

    @Override
    public native void L();

    @Override
    public native void r(int var1, int var2, int var3, int var4);

    @Override
    public void method8542(Node_Sub1 class282_sub1_1) {
        z = (ba) class282_sub1_1;
        n(class282_sub1_1);
    }

    @Override
    public native void qa(int[] var1);

    @Override
    public native void ba(int var1, int var2);

    @Override
    public void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
        G(i_3 + i_1 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
    }

    @Override
    public native void B(int var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    public native void N(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

    @Override
    public void method8658() {
        throw new IllegalStateException();
    }

    @Override
    public native void XA(int var1, int var2, int var3, int var4, int var5);

    @Override
    public native void G(int var1, int var2, int var3, int var4, int var5);

    @Override
    public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        YA(i_1, i_2, i_3, i_4, i_5, i_6);
    }

    @Override
    public boolean method8402() {
        return true;
    }

    @Override
    native void CA(int var1, int var2, int var3, int var4);

    @Override
    public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        nx().method311(this, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
    }

    @Override
    public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
        R(i_1, i_2, i_3, i_4, i_5, 1, class455_7, i_8, i_9);
    }

    @Override
    public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
    }

    @Override
    public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aw.buf[14] + aw.buf[2] * i_1 + aw.buf[6] * i_2 + aw.buf[10] * i_3;
        float f_9 = aw.buf[14] + aw.buf[2] * i_4 + aw.buf[6] * i_5 + aw.buf[10] * i_6;
        float f_10 = aw.buf[15] + aw.buf[3] * i_1 + aw.buf[7] * i_2 + aw.buf[11] * i_3;
        float f_11 = aw.buf[15] + aw.buf[3] * i_4 + aw.buf[7] * i_5 + aw.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aw.buf[12] + aw.buf[0] * i_1 + aw.buf[4] * i_2 + aw.buf[8] * i_3;
        float f_13 = aw.buf[12] + aw.buf[0] * i_4 + aw.buf[4] * i_5 + aw.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aw.buf[13] + aw.buf[1] * i_1 + aw.buf[5] * i_2 + aw.buf[9] * i_3;
        float f_15 = aw.buf[13] + aw.buf[1] * i_4 + aw.buf[5] * i_5 + aw.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public boolean method8406() {
        return true;
    }

    @Override
    public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aw.buf[14] + aw.buf[2] * f_1 + aw.buf[6] * f_2 + aw.buf[10] * f_3;
        float f_6 = aw.buf[15] + aw.buf[3] * f_1 + aw.buf[7] * f_2 + aw.buf[11] * f_3;
        if (f_5 >= -f_6 && f_5 <= f_6) {
            float f_7 = aw.buf[12] + aw.buf[0] * f_1 + aw.buf[4] * f_2 + aw.buf[8] * f_3;
            if (f_7 >= -f_6 && f_7 <= f_6) {
                float f_8 = aw.buf[13] + aw.buf[1] * f_1 + aw.buf[5] * f_2 + aw.buf[9] * f_3;
                if (f_8 >= -f_6 && f_8 <= f_6) {
                    float f_9 = ao.buf[14] + ao.buf[2] * f_1 + ao.buf[6] * f_2 + ao.buf[10] * f_3;
                    floats_4[0] = ax + az * f_7 / f_6;
                    floats_4[1] = al + ap * f_8 / f_6;
                    floats_4[2] = f_9;
                } else {
                    floats_4[2] = Float.NaN;
                    floats_4[1] = Float.NaN;
                    floats_4[0] = Float.NaN;
                }
            } else {
                floats_4[2] = Float.NaN;
                floats_4[1] = Float.NaN;
                floats_4[0] = Float.NaN;
            }
        } else {
            floats_4[2] = Float.NaN;
            floats_4[1] = Float.NaN;
            floats_4[0] = Float.NaN;
        }

    }

    @Override
    public Node_Sub1 method8438(int i_1) {
        ba ba_2 = new ba(this, i_1);
        au.append(ba_2);
        return ba_2;
    }

    @Override
    public void method8439(Node_Sub1 class282_sub1_1) {
        z = (ba) class282_sub1_1;
        n(class282_sub1_1);
    }

    @Override
    public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return new fa(this, i_1, i_2, bool_4);
    }

    @Override
    public native void x(boolean var1);

    @Override
    public boolean method8431() {
        return false;
    }

    @Override
    public Class158_Sub1 method8620() {
        return new Class158_Sub1_Sub1(this);
    }

    @Override
    public boolean method8462() {
        return false;
    }

    @Override
    public native void DA(Class455 var2, int var3, int var4);

    @Override
    public FontRenderer createFont(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        int[] ints_4 = new int[arr_2.length];
        int[] ints_5 = new int[arr_2.length];
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
            ints_4[i_7] = arr_2[i_7].width;
            ints_5[i_7] = arr_2[i_7].height;
            if (arr_2[i_7].alpha != null) {
                bool_6 = true;
            }
        }

        if (bool_3) {
            if (bool_6) {
                return new ea(this, z, fontmetrics_1, arr_2);
            } else {
                return new m(this, z, fontmetrics_1, arr_2);
            }
        } else if (bool_6) {
            throw new IllegalArgumentException("");
        } else {
            return new ia(this, z, fontmetrics_1, arr_2);
        }
    }

    @Override
    public void method8459() {
        ac = at = 10000;
        if (as > 1) {
            throw new IllegalStateException();
        } else {
            nu(as);
            ni();
        }
    }

    @Override
    public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new h(this, z, rsmesh_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public int method8452(int i_1, int i_2) {
        int i_3 = i_1 & 0xfffff;
        int i_4 = i_2 & 0xfffff;
        return i_3 & i_4 ^ i_4;
    }

    @Override
    public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return null;
    }

    @Override
    public native void ej(float var1, float var2);

    @Override
    public boolean method8405() {
        return false;
    }

    @Override
    public boolean method8399() {
        return true;
    }

    void nu(int i_1) {
        as = i_1;
        ai = new a[as];

        for (int i_2 = 0; i_2 < as; i_2++) {
            ai[i_2] = new a(this, ac, at);
        }

    }

    void ni() {
        ai[0].method307();
    }

    a nx() {
        for (int i_1 = 0; i_1 < as; i_1++) {
            if (ai[i_1].aRunnable48 == Thread.currentThread()) {
                return ai[i_1];
            }
        }

        return null;
    }

    @Override
    public void method8456(Class151 class151_1) {
        if (class151_1.aClass464_1961.method7736() != 0) {
            ny(class151_1);
            nx().method309(this, bi, bw, bx, bz, class151_1.aClass464_1961.method7736());
        }

    }

    @Override
    public void method8457(Matrix44Var matrix44var_1) {
        ay = matrix44var_1;
        ao.fromVarMatrix44(matrix44var_1);
        AA(ao.buf);
        aw.method6568(ao, an);
    }

    native void oo();

    native void AA(float[] var1);

    @Override
    public void method8424(Matrix44 matrix44_1) {
        an = matrix44_1;
        wa(an.buf);
        aw.method6568(ao, an);
    }

    @Override
    public boolean method8503() {
        return true;
    }

    @Override
    public Matrix44 method8453() {
        return an;
    }

    @Override
    public native void IA(float var1);

    @Override
    public native void m(int var1, float var2, float var3, float var4, float var5, float var6);

    @Override
    public native void J();

    native void YA(int var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    public void method8547(int i_1, Node_Sub24[] arr_2) {
        int i_3 = 0;

        for (int i_4 = 0; i_4 < i_1; i_4++) {
            aq[i_3++] = arr_2[i_4].method12368();
            aq[i_3++] = arr_2[i_4].method12369();
            aq[i_3++] = arr_2[i_4].method12394();
            aq[i_3++] = arr_2[i_4].method12370();
            av[i_4] = arr_2[i_4].method12395();
            aq[i_3++] = arr_2[i_4].method12371();
        }

        Q(i_1, aq, av);
    }

    @Override
    public void method8568() {
    }

    @Override
    public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return null;
    }

    @Override
    void method8596(int i_1, int i_2) throws Exception_Sub3 {
        za za_3 = (za) method8460();
        if (za_3 == null) {
            throw new IllegalStateException();
        } else {
            za_3.method14353(i_1, i_2);
            if (textureCache != null) {
                textureCache.method161();
            }

        }
    }

    @Override
    public void method8477(Class152 class152_1) {
    }

    @Override
    public void method8525(int i_3, int i_4) {
    }

    @Override
    public boolean method8469() {
        return false;
    }

    @Override
    public void method8490() {
    }

    @Override
    public boolean method8471() {
        return false;
    }

    @Override
    void method8592(float f_1, float f_2, float f_3) {
    }

    @Override
    public native int di();

    native void JA(int var1, int var2, int var3, int var4);

    native void M(int var1, int var2, int var3, int var4);

    @Override
    public void method8475(HDWaterTile class90_2) {
        M(-1, class90_2.color, class90_2.scale, class90_2.intensity);
    }

    @Override
    public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new wa(this, z, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public Class158_Sub1 method8418() {
        return new Class158_Sub1_Sub1(this);
    }

    @Override
    public Interface8 method8419(int i_1, int i_2) {
        return new oa(i_1, i_2);
    }

    @Override
    public RendererInfo method8481() {
        return new RendererInfo(0, "SSE", 1, "CPU", 0L);
    }

    @Override
    public void method8634() {
        az = method8523().method2714() / 2.0F;
        ap = method8523().method2716() / 2.0F;
        ax = az;
        al = ap;
        k();
    }

    @Override
    public void method8483() {
    }

    @Override
    public void method8484() {
    }

    @Override
    void method8531() {
        if (!b) {
            ai = null;
            z = null;
            af = null;

            for (ba ba_1 = (ba) au.head(); ba_1 != null; ba_1 = (ba) au.next()) {
                ba_1.ha();
            }

            au.removeAll();
            da();
            if (bm) {
                Class13.method508(false, true);
                bm = false;
            }

            h();
            Class156.method2644();
            b = true;
        }

    }

    @Override
    public void method8445() {
    }

    @Override
    public void method8476(int i_1, HDWaterTile class90_2) {
        JA(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
    }

    @Override
    void method8555() throws Exception_Sub3 {
        za za_3 = (za) method8460();
        if (za_3 == null) {
            throw new IllegalStateException();
        } else {
            za_3.method14353(0, 0);
            if (textureCache != null) {
                textureCache.method161();
            }

        }
    }

    native void F(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

    @Override
    public native void fi(int var1, int var2);

    @Override
    public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        return new fa(this, i_1, i_2, i_3, i_4, !bool_5);
    }

    @Override
    public native int df();

    @Override
    public Matrix44 method8449() {
        return af;
    }

    native void n(Node_Sub1 var1);

    @Override
    public boolean method8528() {
        return true;
    }

    @Override
    public boolean method8492() {
        return true;
    }

    @Override
    public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        YA(i_1, i_2, i_3, i_4, i_5, i_6);
    }

    @Override
    public native int dv();

    @Override
    public void method8616(int i_1, HDWaterTile class90_2) {
        JA(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
    }

    @Override
    public void method8613() {
    }

    @Override
    public void method8487(int i_1) {
        Class156.method2652();
        Y(i_1);

        for (ba ba_2 = (ba) au.head(); ba_2 != null; ba_2 = (ba) au.next()) {
            ba_2.u();
        }

    }

    @Override
    public boolean method8644() {
        return false;
    }

    @Override
    public boolean method8498() {
        return true;
    }

    @Override
    public boolean method8578() {
        return false;
    }

    @Override
    public void method8602() {
    }

    @Override
    public boolean method8501() {
        return false;
    }

    @Override
    public boolean method8502() {
        return true;
    }

    @Override
    public Matrix44 method8517() {
        return af;
    }

    @Override
    public native void hz(int var1, Class455 var2, int var3, int var4);

    @Override
    public boolean method8504() {
        return true;
    }

    @Override
    public native void iz(float var1);

    @Override
    Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
        return new za(this, canvas_1, i_2, i_3);
    }

    @Override
    public Node_Sub1 method8570(int i_1) {
        ba ba_2 = new ba(this, i_1);
        au.append(ba_2);
        return ba_2;
    }

    @Override
    public native void ff(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

    @Override
    public void method8497() {
    }

    @Override
    public native void eq(boolean var1);

    native void og(float[] var1);

    @Override
    void method8397() {
        if (!b) {
            ai = null;
            z = null;
            af = null;

            for (ba ba_1 = (ba) au.head(); ba_1 != null; ba_1 = (ba) au.next()) {
                ba_1.ha();
            }

            au.removeAll();
            da();
            if (bm) {
                Class13.method508(false, true);
                bm = false;
            }

            h();
            Class156.method2644();
            b = true;
        }

    }

    @Override
    public native void en(float var1, float var2);

    @Override
    public void method8585(int i_1, HDWaterTile class90_2) {
        M(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
    }

    @Override
    public native void ez();

    @Override
    public native void eh();

    @Override
    public native void fk(int var1, int var2, int var3, int var4);

    @Override
    public void method8514(int i_1, int i_2, int i_3, int i_4) {
        az = i_3 / 2.0F;
        ap = i_4 / 2.0F;
        ax = i_1 + az;
        al = i_2 + ap;
        A(i_1, i_2, i_3, i_4);
    }

    @Override
    public native void fe(int var1, int var2, int var3, int var4);

    @Override
    public native int[] ab(int var1, int var2, int var3, int var4);

    @Override
    public native void fh(int[] var1);

    @Override
    public native void ft(int[] var1);

    @Override
    public native void fd(int var1, int var2);

    @Override
    public native void fu(int var1, int var2);

    @Override
    public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
    }

    @Override
    public native void ma(boolean var1);

    void ny(Class151 class151_1) {
        int i_3 = 0;
        int i_4 = 0;
        int i_5 = 0;
        int i_6 = 0;
        boolean bool_7 = false;

        for (PointEntity class275_sub1_sub1_8 = (PointEntity) class151_1.aClass464_1961.method7731(); class275_sub1_sub1_8 != null; class275_sub1_sub1_8 = (PointEntity) class151_1.aClass464_1961.method7734()) {
            bi[i_3++] = class275_sub1_sub1_8.x;
            bi[i_3++] = class275_sub1_sub1_8.z;
            bi[i_3++] = class275_sub1_sub1_8.y;
            bw[i_4++] = class275_sub1_sub1_8.color;
            bz[i_6++] = (short) class275_sub1_sub1_8.textureId;
            bx[i_5++] = class275_sub1_sub1_8.size;
        }

    }

    native void oq(float[] var1);

    @Override
    public native void fp(int var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    public native void fb(int var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
        throw new IllegalStateException();
    }

    native void da();

    @Override
    native void fr(int var1, int var2, int var3, int var4, int var5);

    @Override
    public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
        return null;
    }

    @Override
    public native void fs(int var1, int var2, int var3, int var4, int var5);

    @Override
    public native void fq(int var1, int var2, int var3, int var4, int var5);

    @Override
    public native void fo(int var1, int var2, int var3, int var4, int var5);

    @Override
    public native void fv(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

    @Override
    public FontRenderer method8660(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        int[] ints_4 = new int[arr_2.length];
        int[] ints_5 = new int[arr_2.length];
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
            ints_4[i_7] = arr_2[i_7].width;
            ints_5[i_7] = arr_2[i_7].height;
            if (arr_2[i_7].alpha != null) {
                bool_6 = true;
            }
        }

        if (bool_3) {
            if (bool_6) {
                return new ea(this, z, fontmetrics_1, arr_2);
            } else {
                return new m(this, z, fontmetrics_1, arr_2);
            }
        } else if (bool_6) {
            throw new IllegalArgumentException("");
        } else {
            return new ia(this, z, fontmetrics_1, arr_2);
        }
    }

    @Override
    public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        YA(i_1, i_2, i_3, i_4, i_5, i_6);
    }

    @Override
    public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
    }

    @Override
    public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
    }

    native void oj(int var1, int var2, int var3, int var4);

    @Override
    public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aw.buf[15] + aw.buf[3] * f_1 + aw.buf[7] * f_2 + aw.buf[11] * f_3;
        float f_6 = aw.buf[12] + aw.buf[0] * f_1 + aw.buf[4] * f_2 + aw.buf[8] * f_3;
        float f_7 = aw.buf[13] + aw.buf[1] * f_1 + aw.buf[5] * f_2 + aw.buf[9] * f_3;
        float f_8 = ao.buf[14] + ao.buf[2] * f_1 + ao.buf[6] * f_2 + ao.buf[10] * f_3;
        floats_4[0] = ax + az * f_6 / f_5;
        floats_4[1] = al + ap * f_7 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
        G(i_1 + i_3 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
    }

    @Override
    public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
    }

    @Override
    public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
    }

    @Override
    public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
    }

    @Override
    public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
    }

    @Override
    public native void c(int var1, int var2, int var3);

    @Override
    public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aw.buf[14] + aw.buf[2] * i_1 + aw.buf[6] * i_2 + aw.buf[10] * i_3;
        float f_9 = aw.buf[14] + aw.buf[2] * i_4 + aw.buf[6] * i_5 + aw.buf[10] * i_6;
        float f_10 = aw.buf[15] + aw.buf[3] * i_1 + aw.buf[7] * i_2 + aw.buf[11] * i_3;
        float f_11 = aw.buf[15] + aw.buf[3] * i_4 + aw.buf[7] * i_5 + aw.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aw.buf[12] + aw.buf[0] * i_1 + aw.buf[4] * i_2 + aw.buf[8] * i_3;
        float f_13 = aw.buf[12] + aw.buf[0] * i_4 + aw.buf[4] * i_5 + aw.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aw.buf[13] + aw.buf[1] * i_1 + aw.buf[5] * i_2 + aw.buf[9] * i_3;
        float f_15 = aw.buf[13] + aw.buf[1] * i_4 + aw.buf[5] * i_5 + aw.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aw.buf[14] + aw.buf[2] * i_1 + aw.buf[6] * i_2 + aw.buf[10] * i_3;
        float f_9 = aw.buf[14] + aw.buf[2] * i_4 + aw.buf[6] * i_5 + aw.buf[10] * i_6;
        float f_10 = aw.buf[15] + aw.buf[3] * i_1 + aw.buf[7] * i_2 + aw.buf[11] * i_3;
        float f_11 = aw.buf[15] + aw.buf[3] * i_4 + aw.buf[7] * i_5 + aw.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aw.buf[12] + aw.buf[0] * i_1 + aw.buf[4] * i_2 + aw.buf[8] * i_3;
        float f_13 = aw.buf[12] + aw.buf[0] * i_4 + aw.buf[4] * i_5 + aw.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aw.buf[13] + aw.buf[1] * i_1 + aw.buf[5] * i_2 + aw.buf[9] * i_3;
        float f_15 = aw.buf[13] + aw.buf[1] * i_4 + aw.buf[5] * i_5 + aw.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aw.buf[14] + aw.buf[2] * i_1 + aw.buf[6] * i_2 + aw.buf[10] * i_3;
        float f_9 = aw.buf[14] + aw.buf[2] * i_4 + aw.buf[6] * i_5 + aw.buf[10] * i_6;
        float f_10 = aw.buf[15] + aw.buf[3] * i_1 + aw.buf[7] * i_2 + aw.buf[11] * i_3;
        float f_11 = aw.buf[15] + aw.buf[3] * i_4 + aw.buf[7] * i_5 + aw.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aw.buf[12] + aw.buf[0] * i_1 + aw.buf[4] * i_2 + aw.buf[8] * i_3;
        float f_13 = aw.buf[12] + aw.buf[0] * i_4 + aw.buf[4] * i_5 + aw.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aw.buf[13] + aw.buf[1] * i_1 + aw.buf[5] * i_2 + aw.buf[9] * i_3;
        float f_15 = aw.buf[13] + aw.buf[1] * i_4 + aw.buf[5] * i_5 + aw.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int i_7 = 0;
        float f_8 = aw.buf[14] + aw.buf[2] * i_1 + aw.buf[6] * i_2 + aw.buf[10] * i_3;
        float f_9 = aw.buf[14] + aw.buf[2] * i_4 + aw.buf[6] * i_5 + aw.buf[10] * i_6;
        float f_10 = aw.buf[15] + aw.buf[3] * i_1 + aw.buf[7] * i_2 + aw.buf[11] * i_3;
        float f_11 = aw.buf[15] + aw.buf[3] * i_4 + aw.buf[7] * i_5 + aw.buf[11] * i_6;
        if (f_8 < -f_10 && f_9 < -f_11) {
            i_7 |= 0x10;
        } else if (f_8 > f_10 && f_9 > f_11) {
            i_7 |= 0x20;
        }

        float f_12 = aw.buf[12] + aw.buf[0] * i_1 + aw.buf[4] * i_2 + aw.buf[8] * i_3;
        float f_13 = aw.buf[12] + aw.buf[0] * i_4 + aw.buf[4] * i_5 + aw.buf[8] * i_6;
        if (f_12 < -f_10 && f_13 < -f_11) {
            i_7 |= 0x1;
        }

        if (f_12 > f_10 && f_13 > f_11) {
            i_7 |= 0x2;
        }

        float f_14 = aw.buf[13] + aw.buf[1] * i_1 + aw.buf[5] * i_2 + aw.buf[9] * i_3;
        float f_15 = aw.buf[13] + aw.buf[1] * i_4 + aw.buf[5] * i_5 + aw.buf[9] * i_6;
        if (f_14 < -f_10 && f_15 < -f_11) {
            i_7 |= 0x4;
        }

        if (f_14 > f_10 && f_15 > f_11) {
            i_7 |= 0x8;
        }

        return i_7;
    }

    @Override
    public void method8598(Class152 class152_1) {
    }

    @Override
    public native void o(int var1, int var2, int var3, int var4);

    @Override
    public int method8565(int i_1, int i_2) {
        int i_3 = i_1 & 0xfffff;
        int i_4 = i_2 & 0xfffff;
        return i_3 & i_4 ^ i_4;
    }

    native void on(int var1, int var2, int var3, int var4);

    @Override
    public void method8544(Node_Sub1 class282_sub1_1) {
        z = (ba) class282_sub1_1;
        n(class282_sub1_1);
    }

    @Override
    public native void GA();

    @Override
    public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return new fa(this, i_1, i_2, bool_4);
    }

    @Override
    public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        return new fa(this, ints_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
        return new fa(this, ints_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public NativeSprite method8612(SpriteDefinitions class91_1, boolean bool_2) {
        fa fa_3 = new fa(this, class91_1.pallete, class91_1.pixels, class91_1.alpha, class91_1.width, class91_1.width, class91_1.height);
        fa_3.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return fa_3;
    }

    @Override
    public NativeSprite method8518(SpriteDefinitions class91_1, boolean bool_2) {
        fa fa_3 = new fa(this, class91_1.pallete, class91_1.pixels, class91_1.alpha, class91_1.width, class91_1.width, class91_1.height);
        fa_3.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return fa_3;
    }

    @Override
    public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        return new fa(this, i_1, i_2, i_3, i_4, !bool_5);
    }

    @Override
    public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
        return new fa(this, i_1, i_2, i_3, i_4, !bool_5);
    }

    @Override
    public void method8513(int i_1, int i_2, int i_3, int i_4) {
        az = i_3 / 2.0F;
        ap = i_4 / 2.0F;
        ax = i_1 + az;
        al = i_2 + ap;
        A(i_1, i_2, i_3, i_4);
    }

    @Override
    public void method8584(Class152 class152_1) {
    }

    @Override
    public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new wa(this, z, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new wa(this, z, i_1, i_2, ints_3, ints_4);
    }

    @Override
    public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
        G(i_1 + i_3 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
    }

    @Override
    public void method8601() {
    }

    native void nn(int var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    public boolean method8679() {
        return false;
    }

    @Override
    public FontRenderer method8625(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
        int[] ints_4 = new int[arr_2.length];
        int[] ints_5 = new int[arr_2.length];
        boolean bool_6 = false;

        for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
            ints_4[i_7] = arr_2[i_7].width;
            ints_5[i_7] = arr_2[i_7].height;
            if (arr_2[i_7].alpha != null) {
                bool_6 = true;
            }
        }

        if (bool_3) {
            if (bool_6) {
                return new ea(this, z, fontmetrics_1, arr_2);
            } else {
                return new m(this, z, fontmetrics_1, arr_2);
            }
        } else if (bool_6) {
            throw new IllegalArgumentException("");
        } else {
            return new ia(this, z, fontmetrics_1, arr_2);
        }
    }

    @Override
    public void method8559(int i_1) {
        ac = at = i_1;
        if (as > 1) {
            throw new IllegalStateException();
        } else {
            nu(as);
            ni();
        }
    }

    @Override
    public void method8560(int i_1) {
        ac = at = i_1;
        if (as > 1) {
            throw new IllegalStateException();
        } else {
            nu(as);
            ni();
        }
    }

    @Override
    public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new h(this, z, rsmesh_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new h(this, z, rsmesh_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new h(this, z, rsmesh_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
        return new h(this, z, rsmesh_1, i_2, i_3, i_4, i_5);
    }

    @Override
    public void method8635() {
        az = method8523().method2714() / 2.0F;
        ap = method8523().method2716() / 2.0F;
        ax = az;
        al = ap;
        k();
    }

    @Override
    public int method8566(int i_1, int i_2) {
        int i_3 = i_1 & 0xfffff;
        int i_4 = i_2 & 0xfffff;
        return i_3 & i_4 ^ i_4;
    }

    @Override
    public int method8567(int i_1, int i_2) {
        int i_3 = i_1 & 0xfffff;
        int i_4 = i_2 & 0xfffff;
        return i_3 & i_4 ^ i_4;
    }

    @Override
    public int method8443(int i_1, int i_2) {
        int i_3 = i_1 & 0xfffff;
        int i_4 = i_2 & 0xfffff;
        return i_3 & i_4 ^ i_4;
    }

    @Override
    public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
        return new i(this, z, i_1, i_2, ints_3, ints_4, i_5, i_6, i_7);
    }

    @Override
    public Node_Sub1 method8541(int i_1) {
        ba ba_2 = new ba(this, i_1);
        au.append(ba_2);
        return ba_2;
    }

    @Override
    public Matrix44 method8571() {
        return af;
    }

    @Override
    public Matrix44Var method8572() {
        return ag;
    }

    @Override
    public Matrix44Var method8626() {
        return ag;
    }

    @Override
    public int method8574() {
        return 4;
    }

    @Override
    public void method8394(int i_1, Node_Sub24[] arr_2) {
        int i_3 = 0;

        for (int i_4 = 0; i_4 < i_1; i_4++) {
            aq[i_3++] = arr_2[i_4].method12368();
            aq[i_3++] = arr_2[i_4].method12369();
            aq[i_3++] = arr_2[i_4].method12394();
            aq[i_3++] = arr_2[i_4].method12370();
            av[i_4] = arr_2[i_4].method12395();
            aq[i_3++] = arr_2[i_4].method12371();
        }

        Q(i_1, aq, av);
    }

    @Override
    public void method8426(int i_1, Node_Sub24[] arr_2) {
        int i_3 = 0;

        for (int i_4 = 0; i_4 < i_1; i_4++) {
            aq[i_3++] = arr_2[i_4].method12368();
            aq[i_3++] = arr_2[i_4].method12369();
            aq[i_3++] = arr_2[i_4].method12394();
            aq[i_3++] = arr_2[i_4].method12370();
            av[i_4] = arr_2[i_4].method12395();
            aq[i_3++] = arr_2[i_4].method12371();
        }

        Q(i_1, aq, av);
    }

    @Override
    public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
        throw new IllegalStateException();
    }

    @Override
    public void method8580(Class151 class151_1) {
        if (class151_1.aClass464_1961.method7736() != 0) {
            ny(class151_1);
            nx().method309(this, bi, bw, bx, bz, class151_1.aClass464_1961.method7736());
        }

    }

    @Override
    public void method8581(Class151 class151_1) {
        if (class151_1.aClass464_1961.method7736() != 0) {
            ny(class151_1);
            nx().method309(this, bi, bw, bx, bz, class151_1.aClass464_1961.method7736());
        }

    }

    @Override
    public void method8423(Matrix44Var matrix44var_1) {
        ay = matrix44var_1;
        ao.fromVarMatrix44(matrix44var_1);
        AA(ao.buf);
        aw.method6568(ao, an);
    }

    @Override
    public Matrix44Var method8583() {
        return ay;
    }

    @Override
    public Matrix44Var method8685() {
        return ay;
    }

    @Override
    public void method8446(Matrix44 matrix44_1) {
        an = matrix44_1;
        wa(an.buf);
        aw.method6568(ao, an);
    }

    @Override
    public void method8586(Matrix44 matrix44_1) {
        an = matrix44_1;
        wa(an.buf);
        aw.method6568(ao, an);
    }

    @Override
    public native void is(int var1, int var2, int var3);

    @Override
    public Matrix44 method8588() {
        return an;
    }

    @Override
    public Matrix44 method8589() {
        return an;
    }

    @Override
    public Matrix44 method8590() {
        return an;
    }

    native void k();

    @Override
    public boolean method8674() {
        return true;
    }

    @Override
    public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        XA(i_1, i_2, i_3, i_5, i_6);
        XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
        G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
        G(i_1 + i_3 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
    }

    @Override
    public native void im(int var1, float var2, float var3, float var4, float var5, float var6);

    @Override
    public native void iq(int var1);

    @Override
    public native void il(int var1);

    @Override
    public native void ii(int var1);

    @Override
    public void method8507() {
    }

    @Override
    public native void ik(int var1, int var2, int var3);

    @Override
    public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
        return new fa(this, i_1, i_2, bool_4);
    }

    @Override
    public void method8594(boolean bool_1) {
    }

    @Override
    public void method8595(boolean bool_1) {
    }

    @Override
    public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
        return null;
    }

    @Override
    native void fw(int var1, int var2, int var3, int var4, int var5);

    @Override
    public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
        return new i(this, z, i_1, i_2, ints_3, ints_4, 512, i_6, i_7);
    }

    @Override
    public boolean method8628() {
        return false;
    }

    @Override
    public boolean method8600() {
        return false;
    }

    @Override
    public NativeSprite method8444(SpriteDefinitions class91_1, boolean bool_2) {
        fa fa_3 = new fa(this, class91_1.pallete, class91_1.pixels, class91_1.alpha, class91_1.width, class91_1.width, class91_1.height);
        fa_3.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
        return fa_3;
    }

    @Override
    public void method8491() {
    }

    @Override
    public void method8521() {
    }

    @Override
    public RendererInfo method8392() {
        return new RendererInfo(0, "SSE", 1, "CPU", 0L);
    }

    @Override
    public boolean method8605() {
        return false;
    }

    @Override
    public boolean method8606() {
        return false;
    }

    @Override
    public boolean method8607() {
        return false;
    }

    @Override
    public boolean method8614() {
        return true;
    }

    native void ou(long var1, long var3);

    @Override
    public void method8603(int i_1, int i_2, int i_3, int i_4) {
    }

    @Override
    public void method8611() {
    }

    @Override
    public void method8691() {
    }

    @Override
    public native int dd();

    native void oi(int var1, int var2, int var3, int var4);

    @Override
    public void method8615(int i_1, HDWaterTile class90_2) {
        JA(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
    }

    native void V(short var1, short var2, int var3, byte var4, byte var5, int var6, boolean var7, byte var8, byte var9, byte var10, byte var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, byte var17, boolean var18, boolean var19, int var20);

    @Override
    public void method8474() {
    }

    @Override
    public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        nx().method311(this, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
    }

    @Override
    public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aw.buf[15] + aw.buf[3] * f_1 + aw.buf[7] * f_2 + aw.buf[11] * f_3;
        float f_6 = aw.buf[12] + aw.buf[0] * f_1 + aw.buf[4] * f_2 + aw.buf[8] * f_3;
        float f_7 = aw.buf[13] + aw.buf[1] * f_1 + aw.buf[5] * f_2 + aw.buf[9] * f_3;
        float f_8 = ao.buf[14] + ao.buf[2] * f_1 + ao.buf[6] * f_2 + ao.buf[10] * f_3;
        floats_4[0] = ax + az * f_6 / f_5;
        floats_4[1] = al + ap * f_7 / f_5;
        floats_4[2] = f_8;
    }

    @Override
    public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
        float f_5 = aw.buf[14] + aw.buf[2] * f_1 + aw.buf[6] * f_2 + aw.buf[10] * f_3;
        float f_6 = aw.buf[15] + aw.buf[3] * f_1 + aw.buf[7] * f_2 + aw.buf[11] * f_3;
        if (f_5 >= -f_6 && f_5 <= f_6) {
            float f_7 = aw.buf[12] + aw.buf[0] * f_1 + aw.buf[4] * f_2 + aw.buf[8] * f_3;
            if (f_7 >= -f_6 && f_7 <= f_6) {
                float f_8 = aw.buf[13] + aw.buf[1] * f_1 + aw.buf[5] * f_2 + aw.buf[9] * f_3;
                if (f_8 >= -f_6 && f_8 <= f_6) {
                    float f_9 = ao.buf[14] + ao.buf[2] * f_1 + ao.buf[6] * f_2 + ao.buf[10] * f_3;
                    floats_4[0] = ax + az * f_7 / f_6;
                    floats_4[1] = al + ap * f_8 / f_6;
                    floats_4[2] = f_9;
                } else {
                    floats_4[2] = Float.NaN;
                    floats_4[1] = Float.NaN;
                    floats_4[0] = Float.NaN;
                }
            } else {
                floats_4[2] = Float.NaN;
                floats_4[1] = Float.NaN;
                floats_4[0] = Float.NaN;
            }
        } else {
            floats_4[2] = Float.NaN;
            floats_4[1] = Float.NaN;
            floats_4[0] = Float.NaN;
        }

    }

    @Override
    public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
        R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
    }

    @Override
    public Interface8 method8621(int i_1, int i_2) {
        return new oa(i_1, i_2);
    }

    @Override
    public Matrix44Var method8450() {
        return ag;
    }

    @Override
    public boolean method8609() {
        return true;
    }

    @Override
    public native int[] kh(int var1, int var2, int var3, int var4);

    @Override
    public native int[] ke(int var1, int var2, int var3, int var4);

    @Override
    public native int[] kf(int var1, int var2, int var3, int var4);

    @Override
    public native void fm(int var1, int var2, int var3, int var4);

    @Override
    public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
        throw new IllegalStateException();
    }

    @Override
    void method8608(float f_1, float f_2, float f_3, float f_6) {
    }

    @Override
    public int method8630(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public int method8434(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public int method8632(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public void method8633() {
        az = method8523().method2714() / 2.0F;
        ap = method8523().method2716() / 2.0F;
        ax = az;
        al = ap;
        k();
    }

    @Override
    public native void hr(int var1, Class455 var2, int var3, int var4);

    @Override
    public void method8579(int i_1, Node_Sub24[] arr_2) {
        int i_3 = 0;

        for (int i_4 = 0; i_4 < i_1; i_4++) {
            aq[i_3++] = arr_2[i_4].method12368();
            aq[i_3++] = arr_2[i_4].method12369();
            aq[i_3++] = arr_2[i_4].method12394();
            aq[i_3++] = arr_2[i_4].method12370();
            av[i_4] = arr_2[i_4].method12395();
            aq[i_3++] = arr_2[i_4].method12371();
        }

        Q(i_1, aq, av);
    }

    @Override
    public native void y(boolean var1);

    @Override
    public native void fc(int var1, int var2, int var3, int var4);

    native void ng(ImageLoader var1, int var2, int var3);

    @Override
    public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
    }

    native void nc(int var1, int var2, int var3, int var4, int var5, int var6);

    @Override
    void method8486() {
        if (!b) {
            ai = null;
            z = null;
            af = null;

            for (ba ba_1 = (ba) au.head(); ba_1 != null; ba_1 = (ba) au.next()) {
                ba_1.ha();
            }

            au.removeAll();
            da();
            if (bm) {
                Class13.method508(false, true);
                bm = false;
            }

            h();
            Class156.method2644();
            b = true;
        }

    }

    native void nz(int var1);

    native void nm(Node_Sub1 var1);

    native void nd(Node_Sub1 var1);

    native void nj(Node_Sub1 var1);

    native void nf(int var1, int[] var2, float[] var3);

    native void nr(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

    native void ns(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

    native void nw(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

    native void ow(za var1);

    @Override
    public void method8673(int i_1, int i_2, int i_3, int i_4) {
    }

    native void os(za var1);

    @Override
    public boolean method8599() {
        return false;
    }

    native void or();

    native void oe();

    @Override
    public native void O();

    native void of(int var1, int var2, int var3, int var4);

    @Override
    public int method8546(int i_1, int i_2) {
        return i_1 | i_2;
    }

    @Override
    public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new wa(this, z, i_1, i_2, ints_3, ints_4);
    }

    native void ov(int var1, int var2, int var3, int var4);

    @Override
    public boolean method8495() {
        return false;
    }

    native void oy(float[] var1);

    @Override
    public native void in(float var1);

    native void ot(float[] var1);

    @Override
    public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
    }

    @Override
    public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        return null;
    }

    @Override
    public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
        return new wa(this, z, i_1, i_2, ints_3, ints_4);
    }

    native void no(ImageLoader var1, int var2, int var3);

    native void oa(int var1, int var2, int var3, int var4);

    native void ox(int var1, int var2, int var3, int var4);

}
