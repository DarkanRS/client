package com.jagex;

public class a implements Interface40 {

    long nativeid;
    Runnable aRunnable48;
    h[] ahArray49 = new h[7];
    h[] ahArray47 = new h[7];
    ja aja50;
    Matrix44Arr aClass384_51;

    void method307() {
        this.aRunnable48 = Thread.currentThread();
        this.method310();
    }

    native void ha(long var1, GraphicalRenderer var3, int var4, int var5);

    public void finalize() {
        if (this.nativeid != 0L) {
            Class156.method2642(this, (byte) 27);
        }

    }

    public void ma(boolean bool_1) {
        this.R(this.nativeid, bool_1);
    }

    native void R(long var1, boolean var3);

    native void b(long var1, GraphicalRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

    native void ac(long var1, GraphicalRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

    void method309(GraphicalRenderer graphicalrenderer_1, int[] ints_2, int[] ints_3, int[] ints_4, short[] shorts_5, int i_6) {
        this.b(this.nativeid, graphicalrenderer_1, ints_2, ints_3, ints_4, shorts_5, i_6);
    }

    void method310() {
        this.JA(this.nativeid);
    }

    void method311(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        this.K(this.nativeid, graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
    }

    void method313(MeshRasterizer meshrasterizer_1, MeshRasterizer meshrasterizer_2, int i_3, int i_4, int i_5, boolean bool_6) {
        this.P(this.nativeid, ((h) meshrasterizer_1).nativeid, ((h) meshrasterizer_2).nativeid, i_3, i_4, i_5, bool_6);
    }

    native void aq(long var1, long var3, int[] var5, float[] var6);

    void method314(MeshRasterizer meshrasterizer_1, Matrix44Var matrix44var_2, int[] ints_3, int i_4) {
        this.aClass384_51.fromVarMatrix44(matrix44var_2);
        this.wa(this.nativeid, ((h) meshrasterizer_1).nativeid, this.aClass384_51.buf, ints_3, i_4);
    }

    native void wa(long var1, long var3, float[] var5, int[] var6, int var7);

    native boolean ya(long var1, long var3, int var5, int var6, float[] var7, boolean var8);

    native void a(long var1);

    native void J(long var1, long var3, int[] var5, float[] var6);

    void method316(Ground class390_1, int i_2, int i_3) {
        this.v(this.nativeid, ((i) class390_1).nativeid, i_2, i_3);
    }

    void method318(Ground class390_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, boolean[][] bools_9) {
        this.i(this.nativeid, ((i) class390_1).nativeid, i_2, i_3, i_4, i_5, i_6, i_7, i_8, bools_9);
    }

    native void v(long var1, long var3, int var5, int var6);

    native void bs(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

    public void x(boolean bool_1) {
        this.R(this.nativeid, bool_1);
    }

    native void s(long var1, GraphicalRenderer var3, int var4, int var5);

    native void i(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

    native void bz(long var1, long var3, int var5, int var6);

    native void d(long var1);

    MeshRasterizer method325(h h_1, byte b_2, int i_3, boolean bool_4) {
        boolean bool_5 = false;
        h h_6;
        h h_7;
        if (b_2 > 0 && b_2 <= 7) {
            h_7 = this.ahArray47[b_2 - 1];
            h_6 = this.ahArray49[b_2 - 1];
            bool_5 = true;
        } else {
            h_6 = h_7 = new h(this.aja50);
        }

        h_1.BA(h_6, h_7, i_3, bool_5, bool_4);
        h_6.aClass87Array7139 = h_1.aClass87Array7139;
        h_6.aClass172Array7142 = h_1.aClass172Array7142;
        return h_6;
    }

    native void au(long var1, GraphicalRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

    native void ay(long var1, GraphicalRenderer var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    native void at(long var1, GraphicalRenderer var3, int[] var4, int[] var5, int[] var6, short[] var7, int var8);

    native void K(long var1, GraphicalRenderer var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    native void aw(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

    native void az(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

    void method331(MeshRasterizer meshrasterizer_1, int[] ints_2, Matrix44Var matrix44var_3) {
        this.aClass384_51.fromVarMatrix44(matrix44var_3);
        this.J(this.nativeid, ((h) meshrasterizer_1).nativeid, ints_2, this.aClass384_51.buf);
    }

    boolean method335(MeshRasterizer meshrasterizer_1, int i_2, int i_3, Matrix44Var matrix44var_4, boolean bool_5) {
        this.aClass384_51.fromVarMatrix44(matrix44var_4);
        return this.ya(this.nativeid, ((h) meshrasterizer_1).nativeid, i_2, i_3, this.aClass384_51.buf, bool_5);
    }

    native void ah(long var1, long var3, float[] var5, int[] var6, int var7);

    native void ai(long var1, long var3, float[] var5, int[] var6, int var7);

    native void P(long var1, long var3, long var5, int var7, int var8, int var9, boolean var10);

    native void k(long var1, GraphicalRenderer var3, int var4, int var5);

    native void JA(long var1);

    public void y(boolean bool_1) {
        this.R(this.nativeid, bool_1);
    }

    a(ja ja_1, int i_2, int i_3) {
        this.aja50 = ja_1;

        for (int i_4 = 0; i_4 < 7; i_4++) {
            this.ahArray49[i_4] = new h(this.aja50);
            this.ahArray47[i_4] = new h(this.aja50);
        }

        this.aClass384_51 = new Matrix44Arr();
        this.ha(this.nativeid, ja_1, i_2, i_3);
    }

    native void bm(long var1, long var3, int var5, int var6, int var7, int var8, int var9, int var10, int var11, boolean[][] var12);

    native void u(long var1, GraphicalRenderer var3, int var4, int var5);

}
