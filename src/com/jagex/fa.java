package com.jagex;
public class fa extends NativeSprite implements Interface40, Interface9 {

	long nativeid;
	boolean aBool7477 = false;

	public int method229() {
		return this.WA(this.nativeid);
	}

	fa(ja ja_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6) {
		this.RA(ja_1, ints_2, i_3, i_4, i_5, i_6, false);
	}

	public int method2788() {
		return this.GA(this.nativeid);
	}

	fa(ja ja_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		this.K(ja_1, i_2, i_3, i_4, i_5, bool_6);
	}

	native void e(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

	public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.ea(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public int method75() {
		return this.da(this.nativeid);
	}

	native void K(ja var1, int var2, int var3, int var4, int var5, boolean var6);

	public void finalize() {
		if (this.nativeid != 0L) {
			Class156.method2642(this, (byte) 95);
		}

	}

	public void ma(boolean bool_1) {
		this.M(this.nativeid, bool_1);
	}

	native int native_do(long var1);

	public void method2743(int i_1, int i_2, int i_3, int i_4) {
		this.U(this.nativeid, i_1, i_2, i_3, i_4);
	}

	public void method2782(int[] ints_1) {
		this.F(this.nativeid, ints_1);
	}

	native void dr(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

	native void RA(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	public int method1() {
		return this.da(this.nativeid);
	}

	public int method2747() {
		return this.da(this.nativeid);
	}

	native int da(long var1);

	public int scaleWidth() {
		return this.WA(this.nativeid);
	}

	native int WA(long var1);

	native void ee(long var1, int var3, int var4, int var5, int var6, int var7);

	public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		this.o(this.nativeid, i_1, i_2, ((wa) class455_3).nativeid, i_4, i_5);
	}

	native int GA(long var1);

	native void dx(ja var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

	native int ba(long var1);

	public Interface9 method2808() {
		return this.aBool7477 ? this : null;
	}

	public void method2777(int[] ints_1) {
		this.F(this.nativeid, ints_1);
	}

	native void ea(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

	public void method2751() {
		this.j(this.nativeid, 0, 0, 3);
	}

	native void j(long var1, int var3, int var4, int var5);

	public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.Y(this.nativeid, i_1, i_2, i_3, i_4, i_5);
	}

	native void Y(long var1, int var3, int var4, int var5, int var6, int var7);

	public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		this.o(this.nativeid, i_1, i_2, ((wa) class455_3).nativeid, i_4, i_5);
	}

	native void o(long var1, int var3, int var4, long var5, int var7, int var8);

	void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.ha(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7, 1);
	}

	native void eo(long var1, int var3, int var4, int var5);

	public void method2772(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aa(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	native void aa(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	native void ex(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

	native void dp(long var1, int var3, int var4, int var5, int var6);

	void method2766(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		this.FA(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, ((wa) class455_8).nativeid, i_9, i_10, this.aBool7477);
	}

	native void FA(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, long var10, int var12, int var13, boolean var14);

	public void method26() {
	}

	native void dm(long var1, int var3, int var4, int var5, int var6);

	public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.ea(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.ea(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public void method2771(int i_1, int i_2, int i_3) {
		this.j(this.nativeid, i_1, i_2, i_3);
	}

	native int ds(long var1);

	public Interface9 method2801() {
		return this.aBool7477 ? this : null;
	}

	public int method2794() {
		return this.da(this.nativeid);
	}

	public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		this.o(this.nativeid, i_1, i_2, ((wa) class455_3).nativeid, i_4, i_5);
	}

	void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.ha(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
	}

	void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.ha(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
	}

	public void method2770(int i_1, int i_2, int i_3) {
		this.j(this.nativeid, i_1, i_2, i_3);
	}

	public int method76() {
		return this.da(this.nativeid);
	}

	public int method39() {
		return this.GA(this.nativeid);
	}

	public int method73() {
		return this.GA(this.nativeid);
	}

	native void ey(long var1, int var3, int var4, long var5, int var7, int var8);

	public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.ea(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	native void M(long var1, boolean var3);

	public void method2783(int i_1, int i_2, int i_3, int i_4) {
		this.U(this.nativeid, i_1, i_2, i_3, i_4);
	}

	public void method2781(int i_1, int i_2, int i_3, int i_4) {
		this.U(this.nativeid, i_1, i_2, i_3, i_4);
	}

	public void method2780(int i_1, int i_2, int i_3, int i_4) {
		this.U(this.nativeid, i_1, i_2, i_3, i_4);
	}

	fa(ja ja_1, int[] ints_2, byte[] bytes_3, byte[] bytes_4, int i_6, int i_7, int i_8) {
		this.EA(ja_1, ints_2, bytes_3, bytes_4, 0, i_6, i_7, i_8);
	}

	public int method2793() {
		return this.GA(this.nativeid);
	}

	public void method2804(int[] ints_1) {
		this.F(this.nativeid, ints_1);
	}

	fa(ja ja_1, int i_2, int i_3, boolean bool_4) {
		this.aBool7477 = bool_4;
		this.UA(ja_1, i_2, i_3);
	}

	public void method2785(int[] ints_1) {
		this.F(this.nativeid, ints_1);
	}

	public int method2786() {
		return this.da(this.nativeid);
	}

	native int di(long var1);

	native void dl(ja var1, int var2, int var3, int var4, int var5, boolean var6);

	public int method2765() {
		return this.GA(this.nativeid);
	}

	public int method225() {
		return this.WA(this.nativeid);
	}

	public int method227() {
		return this.WA(this.nativeid);
	}

	public int method226() {
		return this.WA(this.nativeid);
	}

	public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.Y(this.nativeid, i_1, i_2, i_3, i_4, i_5);
	}

	native void dq(long var1, int var3, int var4, int var5);

	public int method2757() {
		return this.ba(this.nativeid);
	}

	public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.Y(this.nativeid, i_1, i_2, i_3, i_4, i_5);
	}

	public void method2799(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aa(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	public void method2796(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aa(this.nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	void method2791(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		this.e(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, i_10);
	}

	void method2798(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		this.e(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, i_10);
	}

	void method2812(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		this.e(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, i_10);
	}

	void method2800(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		this.FA(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, ((wa) class455_8).nativeid, i_9, i_10, this.aBool7477);
	}

	void method2811(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		this.FA(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, ((wa) class455_8).nativeid, i_9, i_10, this.aBool7477);
	}

	public void y(boolean bool_1) {
		this.M(this.nativeid, bool_1);
	}

	native void dh(ja var1, int var2, int var3, int var4, int var5, boolean var6);

	public void x(boolean bool_1) {
		this.M(this.nativeid, bool_1);
	}

	native void cs(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	native void dj(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	native void de(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	native void ek(long var1, int var3, int var4, long var5, int var7, int var8);

	native void dc(ja var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

	public int method2753() {
		return this.ba(this.nativeid);
	}

	native void F(long var1, int[] var3);

	native void dk(long var1, boolean var3);

	native void dy(long var1, boolean var3);

	void method2764(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
		this.e(this.nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, 1);
	}

	native void EA(ja var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

	public int method2792() {
		return this.ba(this.nativeid);
	}

	native void dg(long var1, int[] var3);

	native void dd(long var1, int[] var3);

	native void U(long var1, int var3, int var4, int var5, int var6);

	public int method77() {
		return this.GA(this.nativeid);
	}

	native int dv(long var1);

	native void ha(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native int dz(long var1);

	native int dt(long var1);

	public int method74() {
		return this.GA(this.nativeid);
	}

	native int dn(long var1);

	native void dw(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

	public int method2748() {
		return this.ba(this.nativeid);
	}

	native int df(long var1);

	native void db(long var1, int var3, int var4, int var5);

	native void ef(long var1, int var3, int var4, int var5);

	native void cy(ja var1, int var2, int var3);

	native void eb(long var1, int var3, int var4, int var5, int var6, int var7);

	native void UA(ja var1, int var2, int var3);

	public void method32() {
	}

	native void es(long var1, int var3, int var4, long var5, int var7, int var8);

	public void method2744(int[] ints_1) {
		this.F(this.nativeid, ints_1);
	}

	native void et(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void ew(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void em(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void ed(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	native void du(long var1, int[] var3);

	native void ep(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

}
