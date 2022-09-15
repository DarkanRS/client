package com.jagex;

public abstract class NativeSprite implements Sprite {

	public abstract void method2742(int var1, int var2, int var3, int var4, int var5);

	public abstract void method2743(int var1, int var2, int var3, int var4);

	public abstract void method2744(int[] var1);

	public abstract int method2747();

	public abstract int method2748();

	public abstract void method2749(int var1, int var2, int var3, int var4, int var5);

	public abstract void method2750(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method2751();

	public void method2752(int i_1, int i_2) {
		method2742(i_1, i_2, 1, 0, 1);
	}

	public abstract int method2753();

	public void method2754(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		method2755(i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	abstract void method2755(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	public void method2756(int i_1, int i_2, int i_3, int i_4) {
		method2772(i_1, i_2, i_3, i_4, 1, 0, 1);
	}

	public abstract int method2757();

	public void method2758(float f_1, float f_2, int i_3, int i_4) {
		method2760(f_1, f_2, scaleWidth() / 2.0F, method2748() / 2.0F, i_3, i_4, 1, 0);
	}

	void method2760(float f_1, float f_2, float f_3, float f_4, int i_5, int i_6, int i_7, int i_8) {
		if (i_5 != 0) {
			double d_10 = (i_6 & 0xffff) * 9.587379924285257E-5D;
			float f_12 = (float) StrictMath.sin(d_10) * i_5;
			float f_13 = (float) StrictMath.cos(d_10) * i_5;
			float f_14 = (-f_3 * f_13 + -f_4 * f_12) / 4096.0F + f_1;
			float f_15 = (--f_3 * f_12 + -f_4 * f_13) / 4096.0F + f_2;
			float f_16 = ((scaleWidth() - f_3) * f_13 + -f_4 * f_12) / 4096.0F + f_1;
			float f_17 = (-(scaleWidth() - f_3) * f_12 + -f_4 * f_13) / 4096.0F + f_2;
			float f_18 = (-f_3 * f_13 + (method2748() - f_4) * f_12) / 4096.0F + f_1;
			float f_19 = (--f_3 * f_12 + (method2748() - f_4) * f_13) / 4096.0F + f_2;
			method2763(f_14, f_15, f_16, f_17, f_18, f_19, i_7, i_8, 1);
		}

	}

	public void method2761(float f_1, float f_2, int i_4, Class455 class455_5, int i_6, int i_7) {
		method2762(f_1, f_2, scaleWidth() / 2.0F, method2748() / 2.0F, 4141, i_4, class455_5, i_6, i_7);
	}

	public void method2762(float f_1, float f_2, float f_3, float f_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		if (i_5 != 0) {
			double d_10 = (i_6 & 0xffff) * 9.587379924285257E-5D;
			float f_12 = (float) StrictMath.sin(d_10) * i_5;
			float f_13 = (float) StrictMath.cos(d_10) * i_5;
			float f_14 = (-f_3 * f_13 + -f_4 * f_12) / 4096.0F + f_1;
			float f_15 = (--f_3 * f_12 + -f_4 * f_13) / 4096.0F + f_2;
			float f_16 = ((scaleWidth() - f_3) * f_13 + -f_4 * f_12) / 4096.0F + f_1;
			float f_17 = (-(scaleWidth() - f_3) * f_12 + -f_4 * f_13) / 4096.0F + f_2;
			float f_18 = (-f_3 * f_13 + (method2748() - f_4) * f_12) / 4096.0F + f_1;
			float f_19 = (--f_3 * f_12 + (method2748() - f_4) * f_13) / 4096.0F + f_2;
			method2797(f_14, f_15, f_16, f_17, f_18, f_19, class455_7, i_8, i_9);
		}

	}

	public void method2763(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
		method2764(f_1, f_2, f_3, f_4, f_5, f_6, i_7, i_8, i_9);
	}

	abstract void method2764(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9);

	public abstract int method2765();

	abstract void method2766(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class455 var8, int var9, int var10);

	public abstract void method2767(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method2768(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method2769(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method2770(int var1, int var2, int var3);

	public abstract void method2771(int var1, int var2, int var3);

	public abstract void method2772(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	public abstract void method2773(int var1, int var2, Class455 var3, int var4, int var5);

	public abstract void method2774(int var1, int var2, Class455 var3, int var4, int var5);

	abstract void method2775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	public abstract void method2777(int[] var1);

	public abstract void method2778(int var1, int var2, int var3, int var4, int var5);

	public abstract void method2780(int var1, int var2, int var3, int var4);

	public abstract void method2781(int var1, int var2, int var3, int var4);

	public abstract void method2782(int[] var1);

	public abstract void method2783(int var1, int var2, int var3, int var4);

	public abstract void method2784(int var1, int var2, Class455 var3, int var4, int var5);

	public abstract void method2785(int[] var1);

	public abstract int method2786();

	abstract void method2787(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	public abstract int method2788();

	public void method2789(int i_1, int i_2, int i_3, int i_4) {
		method2755(i_1, i_2, i_3, i_4, 1, 0, 1);
	}

	public void method2790(float f_1, float f_2, int i_3, int i_4, int i_6) {
		method2760(f_1, f_2, scaleWidth() / 2.0F, method2748() / 2.0F, i_3, i_4, 0, i_6);
	}

	abstract void method2791(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

	public abstract int method2792();

	public abstract int method2793();

	public abstract int method2794();

	public abstract void method2796(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	void method2797(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, Class455 class455_7, int i_8, int i_9) {
		method2766(f_1, f_2, f_3, f_4, f_5, f_6, 1, class455_7, i_8, i_9);
	}

	abstract void method2798(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

	public abstract void method2799(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	abstract void method2800(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class455 var8, int var9, int var10);

	public abstract Interface9 method2801();

	public abstract void method2804(int[] var1);

	public abstract Interface9 method2808();

	abstract void method2811(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class455 var8, int var9, int var10);

	abstract void method2812(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10);

	@Override
	public abstract int scaleWidth();

}
