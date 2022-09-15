package com.jagex;

public class fa extends NativeSprite implements Interface40, Interface9 {

	long nativeid;
	boolean aBool7477;

	fa(ja ja_1, int i_2, int i_3, boolean bool_4) {
		aBool7477 = bool_4;
		UA(ja_1, i_2, i_3);
	}

	fa(ja ja_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		K(ja_1, i_2, i_3, i_4, i_5, bool_6);
	}

	fa(ja ja_1, int[] ints_2, byte[] bytes_3, byte[] bytes_4, int i_6, int i_7, int i_8) {
		EA(ja_1, ints_2, bytes_3, bytes_4, 0, i_6, i_7, i_8);
	}

	fa(ja ja_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6) {
		RA(ja_1, ints_2, i_3, i_4, i_5, i_6, false);
	}

	native void aa(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	native int ba(long var1);

	native void cs(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	native void cy(ja var1, int var2, int var3);

	native int da(long var1);

	native void db(long var1, int var3, int var4, int var5);

	native void dc(ja var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

	native void dd(long var1, int[] var3);

	native void de(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	native int df(long var1);

	native void dg(long var1, int[] var3);

	native void dh(ja var1, int var2, int var3, int var4, int var5, boolean var6);

	native int di(long var1);

	native void dj(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	native void dk(long var1, boolean var3);

	native void dl(ja var1, int var2, int var3, int var4, int var5, boolean var6);

	native void dm(long var1, int var3, int var4, int var5, int var6);

	native int dn(long var1);

	native void dp(long var1, int var3, int var4, int var5, int var6);

	native void dq(long var1, int var3, int var4, int var5);

	native void dr(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

	native int ds(long var1);

	native int dt(long var1);

	native void du(long var1, int[] var3);

	native int dv(long var1);

	native void dw(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

	native void dx(ja var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

	native void dy(long var1, boolean var3);

	native int dz(long var1);

	native void e(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

	native void ea(long var1, int var3, int var4, int var5, int var6, int var7, int var8);

	native void EA(ja var1, int[] var2, byte[] var3, byte[] var4, int var5, int var6, int var7, int var8);

	native void eb(long var1, int var3, int var4, int var5, int var6, int var7);

	native void ed(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	native void ee(long var1, int var3, int var4, int var5, int var6, int var7);

	native void ef(long var1, int var3, int var4, int var5);

	native void ek(long var1, int var3, int var4, long var5, int var7, int var8);

	native void em(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void eo(long var1, int var3, int var4, int var5);

	native void ep(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

	native void es(long var1, int var3, int var4, long var5, int var7, int var8);

	native void et(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void ew(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void ex(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12);

	native void ey(long var1, int var3, int var4, long var5, int var7, int var8);

	native void F(long var1, int[] var3);

	native void FA(long var1, float var3, float var4, float var5, float var6, float var7, float var8, int var9, long var10, int var12, int var13, boolean var14);

	@Override
	protected void finalize() {
		if (nativeid != 0L)
			Class156.method2642(this);

	}

	native int GA(long var1);

	native void ha(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

	native void j(long var1, int var3, int var4, int var5);

	native void K(ja var1, int var2, int var3, int var4, int var5, boolean var6);

	native void M(long var1, boolean var3);

	@Override
	public void ma(boolean bool_1) {
		M(nativeid, bool_1);
	}

	@Override
	public int method1() {
		return da(nativeid);
	}

	@Override
	public void method26() {
	}

	@Override
	public void method2742(int i_1, int i_2, int i_3, int i_4, int i_5) {
		Y(nativeid, i_1, i_2, i_3, i_4, i_5);
	}

	@Override
	public void method2743(int i_1, int i_2, int i_3, int i_4) {
		U(nativeid, i_1, i_2, i_3, i_4);
	}

	@Override
	public void method2744(int[] ints_1) {
		F(nativeid, ints_1);
	}

	@Override
	public int method2747() {
		return da(nativeid);
	}

	@Override
	public int method2748() {
		return ba(nativeid);
	}

	@Override
	public void method2749(int i_1, int i_2, int i_3, int i_4, int i_5) {
		Y(nativeid, i_1, i_2, i_3, i_4, i_5);
	}

	@Override
	public void method2750(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		ea(nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	@Override
	public void method2751() {
		j(nativeid, 0, 0, 3);
	}

	@Override
	public int method2753() {
		return ba(nativeid);
	}

	@Override
	void method2755(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		ha(nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7, 1);
	}

	@Override
	public int method2757() {
		return ba(nativeid);
	}

	@Override
	void method2764(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
		e(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, 1);
	}

	@Override
	public int method2765() {
		return GA(nativeid);
	}

	@Override
	void method2766(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		FA(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, ((wa) class455_8).nativeid, i_9, i_10, aBool7477);
	}

	@Override
	public void method2767(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		ea(nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	@Override
	public void method2768(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		ea(nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	@Override
	public void method2769(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		ea(nativeid, i_1, i_2, i_3, i_4, i_5, i_6);
	}

	@Override
	public void method2770(int i_1, int i_2, int i_3) {
		j(nativeid, i_1, i_2, i_3);
	}

	@Override
	public void method2771(int i_1, int i_2, int i_3) {
		j(nativeid, i_1, i_2, i_3);
	}

	@Override
	public void method2772(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		aa(nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	@Override
	public void method2773(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		o(nativeid, i_1, i_2, ((wa) class455_3).nativeid, i_4, i_5);
	}

	@Override
	public void method2774(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		o(nativeid, i_1, i_2, ((wa) class455_3).nativeid, i_4, i_5);
	}

	@Override
	void method2775(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		ha(nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
	}

	@Override
	public void method2777(int[] ints_1) {
		F(nativeid, ints_1);
	}

	@Override
	public void method2778(int i_1, int i_2, int i_3, int i_4, int i_5) {
		Y(nativeid, i_1, i_2, i_3, i_4, i_5);
	}

	@Override
	public void method2780(int i_1, int i_2, int i_3, int i_4) {
		U(nativeid, i_1, i_2, i_3, i_4);
	}

	@Override
	public void method2781(int i_1, int i_2, int i_3, int i_4) {
		U(nativeid, i_1, i_2, i_3, i_4);
	}

	@Override
	public void method2782(int[] ints_1) {
		F(nativeid, ints_1);
	}

	@Override
	public void method2783(int i_1, int i_2, int i_3, int i_4) {
		U(nativeid, i_1, i_2, i_3, i_4);
	}

	@Override
	public void method2784(int i_1, int i_2, Class455 class455_3, int i_4, int i_5) {
		o(nativeid, i_1, i_2, ((wa) class455_3).nativeid, i_4, i_5);
	}

	@Override
	public void method2785(int[] ints_1) {
		F(nativeid, ints_1);
	}

	@Override
	public int method2786() {
		return da(nativeid);
	}

	@Override
	void method2787(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		ha(nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
	}

	@Override
	public int method2788() {
		return GA(nativeid);
	}

	@Override
	void method2791(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		e(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, i_10);
	}

	@Override
	public int method2792() {
		return ba(nativeid);
	}

	@Override
	public int method2793() {
		return GA(nativeid);
	}

	@Override
	public int method2794() {
		return da(nativeid);
	}

	@Override
	public void method2796(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		aa(nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	@Override
	void method2798(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		e(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, i_10);
	}

	@Override
	public void method2799(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		aa(nativeid, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	@Override
	void method2800(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		FA(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, ((wa) class455_8).nativeid, i_9, i_10, aBool7477);
	}

	@Override
	public Interface9 method2801() {
		return aBool7477 ? this : null;
	}

	@Override
	public void method2804(int[] ints_1) {
		F(nativeid, ints_1);
	}

	@Override
	public Interface9 method2808() {
		return aBool7477 ? this : null;
	}

	@Override
	void method2811(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		FA(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, ((wa) class455_8).nativeid, i_9, i_10, aBool7477);
	}

	@Override
	void method2812(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		e(nativeid, f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9, i_10);
	}

	@Override
	public void method32() {
	}

	@Override
	public int method39() {
		return GA(nativeid);
	}

	@Override
	public int method73() {
		return GA(nativeid);
	}

	@Override
	public int method74() {
		return GA(nativeid);
	}

	@Override
	public int method75() {
		return da(nativeid);
	}

	@Override
	public int method76() {
		return da(nativeid);
	}

	@Override
	public int method77() {
		return GA(nativeid);
	}

	native int native_do(long var1);

	native void o(long var1, int var3, int var4, long var5, int var7, int var8);

	native void RA(ja var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	@Override
	public int scaleWidth() {
		return WA(nativeid);
	}

	native void U(long var1, int var3, int var4, int var5, int var6);

	native void UA(ja var1, int var2, int var3);

	native int WA(long var1);

	@Override
	public void x(boolean bool_1) {
		M(nativeid, bool_1);
	}

	@Override
	public void y(boolean bool_1) {
		M(nativeid, bool_1);
	}

	native void Y(long var1, int var3, int var4, int var5, int var6, int var7);

}
