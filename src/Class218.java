/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class218 {
	static int anInt2457;
	float aFloat2458;
	static int anInt2459;
	static Class218[] aClass218Array2460 = new Class218[0];
	float aFloat2461;
	float aFloat2462;
	float aFloat2463;

	public String toString() {
		return new StringBuilder().append(((Class218) this).aFloat2461).append(",").append(((Class218) this).aFloat2458).append(",").append(((Class218) this).aFloat2462).append(",").append(((Class218) this).aFloat2463).toString();
	}

	public static Class218 method2019() {
		synchronized (aClass218Array2460) {
			if (anInt2459 == 0) {
				Class218 class218 = new Class218();
				return class218;
			}
			aClass218Array2460[--anInt2459].method2030();
			Class218 class218 = aClass218Array2460[anInt2459];
			return class218;
		}
	}

	static Class218 method2020(float f, float f_0_, float f_1_, float f_2_) {
		synchronized (aClass218Array2460) {
			if (anInt2459 == 0) {
				Class218 class218 = new Class218(f, f_0_, f_1_, f_2_);
				return class218;
			}
			aClass218Array2460[--anInt2459].method2021(f, f_0_, f_1_, f_2_);
			Class218 class218 = aClass218Array2460[anInt2459];
			return class218;
		}
	}

	public Class218() {
		method2030();
	}

	Class218(float f, float f_3_, float f_4_, float f_5_) {
		method2021(f, f_3_, f_4_, f_5_);
	}

	Class218(Class218 class218_6_) {
		method2022(class218_6_);
	}

	void method2021(float f, float f_7_, float f_8_, float f_9_) {
		((Class218) this).aFloat2461 = f;
		((Class218) this).aFloat2458 = f_7_;
		((Class218) this).aFloat2462 = f_8_;
		((Class218) this).aFloat2463 = f_9_;
	}

	public void method2022(Class218 class218_10_) {
		((Class218) this).aFloat2461 = ((Class218) class218_10_).aFloat2461;
		((Class218) this).aFloat2458 = ((Class218) class218_10_).aFloat2458;
		((Class218) this).aFloat2462 = ((Class218) class218_10_).aFloat2462;
		((Class218) this).aFloat2463 = ((Class218) class218_10_).aFloat2463;
	}

	public void method2023(float f, float f_11_, float f_12_, float f_13_) {
		float f_14_ = (float) Math.sin((double) (f_13_ * 0.5F));
		float f_15_ = (float) Math.cos((double) (f_13_ * 0.5F));
		((Class218) this).aFloat2461 = f * f_14_;
		((Class218) this).aFloat2458 = f_11_ * f_14_;
		((Class218) this).aFloat2462 = f_12_ * f_14_;
		((Class218) this).aFloat2463 = f_15_;
	}

	final void method2024() {
		((Class218) this).aFloat2461 = -((Class218) this).aFloat2461;
		((Class218) this).aFloat2458 = -((Class218) this).aFloat2458;
		((Class218) this).aFloat2462 = -((Class218) this).aFloat2462;
	}

	static final Class218 method2025(Class218 class218) {
		Class218 class218_16_ = method2031(class218);
		class218_16_.method2024();
		return class218_16_;
	}

	public final void method2026(Class218 class218_17_) {
		method2021(((((Class218) class218_17_).aFloat2463 * ((Class218) this).aFloat2461) + (((Class218) class218_17_).aFloat2461 * ((Class218) this).aFloat2463) + (((Class218) class218_17_).aFloat2458 * ((Class218) this).aFloat2462) - (((Class218) class218_17_).aFloat2462 * ((Class218) this).aFloat2458)), ((((Class218) class218_17_).aFloat2463 * ((Class218) this).aFloat2458) - (((Class218) class218_17_).aFloat2461 * ((Class218) this).aFloat2462)
				+ (((Class218) class218_17_).aFloat2458 * ((Class218) this).aFloat2463) + (((Class218) class218_17_).aFloat2462 * ((Class218) this).aFloat2461)), ((((Class218) class218_17_).aFloat2463 * ((Class218) this).aFloat2462) + (((Class218) class218_17_).aFloat2461 * ((Class218) this).aFloat2458) - (((Class218) class218_17_).aFloat2458 * ((Class218) this).aFloat2461) + (((Class218) class218_17_).aFloat2462 * ((Class218) this).aFloat2463)),
				((((Class218) class218_17_).aFloat2463 * ((Class218) this).aFloat2463) - (((Class218) class218_17_).aFloat2461 * ((Class218) this).aFloat2461) - (((Class218) class218_17_).aFloat2458 * ((Class218) this).aFloat2458) - (((Class218) class218_17_).aFloat2462 * ((Class218) this).aFloat2462)));
	}

	public static void method2027(int i) {
		anInt2457 = i;
		aClass218Array2460 = new Class218[i];
		anInt2459 = 0;
	}

	static final Class218 method2028(Class218 class218, Class218 class218_18_) {
		Class218 class218_19_ = method2031(class218);
		class218_19_.method2026(class218_18_);
		return class218_19_;
	}

	public void method2029() {
		synchronized (aClass218Array2460) {
			if (anInt2459 < anInt2457 - 1)
				aClass218Array2460[anInt2459++] = this;
		}
	}

	static {
		new Class218();
	}

	final void method2030() {
		((Class218) this).aFloat2462 = 0.0F;
		((Class218) this).aFloat2458 = 0.0F;
		((Class218) this).aFloat2461 = 0.0F;
		((Class218) this).aFloat2463 = 1.0F;
	}

	static Class218 method2031(Class218 class218) {
		synchronized (aClass218Array2460) {
			if (anInt2459 == 0) {
				Class218 class218_20_ = new Class218(class218);
				return class218_20_;
			}
			aClass218Array2460[--anInt2459].method2022(class218);
			Class218 class218_21_ = aClass218Array2460[anInt2459];
			return class218_21_;
		}
	}

	public void method2032(float f, float f_22_, float f_23_) {
		method2023(0.0F, 1.0F, 0.0F, f);
		Class218 class218_24_ = method2019();
		class218_24_.method2023(1.0F, 0.0F, 0.0F, f_22_);
		method2026(class218_24_);
		class218_24_.method2023(0.0F, 0.0F, 1.0F, f_23_);
		method2026(class218_24_);
		class218_24_.method2029();
	}
}
