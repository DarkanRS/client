/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class217 {
	public float aFloat2451;
	static int anInt2452;
	static int anInt2453;
	public float aFloat2454;
	public float aFloat2455;
	static Class217[] aClass217Array2456;

	static {
		new Class217(0.0F, 0.0F, 0.0F);
		aClass217Array2456 = new Class217[0];
	}

	public static Class217 method2004(float f, float f_0_, float f_1_) {
		synchronized (aClass217Array2456) {
			if (anInt2453 == 0) {
				Class217 class217 = new Class217(f, f_0_, f_1_);
				return class217;
			}
			aClass217Array2456[--anInt2453].method2007(f, f_0_, f_1_);
			Class217 class217 = aClass217Array2456[anInt2453];
			return class217;
		}
	}

	public static Class217 method2005(Class217 class217) {
		synchronized (aClass217Array2456) {
			if (anInt2453 == 0) {
				Class217 class217_2_ = new Class217(class217);
				return class217_2_;
			}
			aClass217Array2456[--anInt2453].method2013(class217);
			Class217 class217_3_ = aClass217Array2456[anInt2453];
			return class217_3_;
		}
	}

	public void method2006() {
		synchronized (aClass217Array2456) {
			if (anInt2453 < anInt2452 - 1)
				aClass217Array2456[anInt2453++] = this;
		}
	}

	public Class217(float f, float f_4_, float f_5_) {
		aFloat2451 = f;
		aFloat2455 = f_4_;
		aFloat2454 = f_5_;
	}

	public void method2007(float f, float f_6_, float f_7_) {
		aFloat2451 = f;
		aFloat2455 = f_6_;
		aFloat2454 = f_7_;
	}

	final void method2008() {
		aFloat2451 = -aFloat2451;
		aFloat2455 = -aFloat2455;
		aFloat2454 = -aFloat2454;
	}

	final void method2009(Class217 class217_8_) {
		aFloat2451 += class217_8_.aFloat2451;
		aFloat2455 += class217_8_.aFloat2455;
		aFloat2454 += class217_8_.aFloat2454;
	}

	public final void method2010(float f, float f_9_, float f_10_) {
		aFloat2451 -= f;
		aFloat2455 -= f_9_;
		aFloat2454 -= f_10_;
	}

	public static final Class217 method2011(Class217 class217, Class217 class217_11_) {
		Class217 class217_12_ = method2005(class217);
		class217_12_.method2015(class217_11_);
		return class217_12_;
	}

	public final float method2012() {
		return (float) Math.sqrt((double) (aFloat2451 * aFloat2451 + aFloat2455 * aFloat2455 + aFloat2454 * aFloat2454));
	}

	public Class217() {
		/* empty */
	}

	Class217(Class217 class217_13_) {
		aFloat2451 = class217_13_.aFloat2451;
		aFloat2455 = class217_13_.aFloat2455;
		aFloat2454 = class217_13_.aFloat2454;
	}

	public void method2013(Class217 class217_14_) {
		method2007(class217_14_.aFloat2451, class217_14_.aFloat2455, class217_14_.aFloat2454);
	}

	public String toString() {
		return new StringBuilder().append(aFloat2451).append(", ").append(aFloat2455).append(", ").append(aFloat2454).toString();
	}

	final void method2014(Class218 class218) {
		Class218 class218_15_ = Class218.method2020(aFloat2451, aFloat2455, aFloat2454, 0.0F);
		Class218 class218_16_ = Class218.method2025(class218);
		Class218 class218_17_ = Class218.method2028(class218_16_, class218_15_);
		class218_17_.method2026(class218);
		method2007(((Class218) class218_17_).aFloat2461, ((Class218) class218_17_).aFloat2458, ((Class218) class218_17_).aFloat2462);
		class218_15_.method2029();
		class218_16_.method2029();
		class218_17_.method2029();
	}

	final void method2015(Class217 class217_18_) {
		aFloat2451 -= class217_18_.aFloat2451;
		aFloat2455 -= class217_18_.aFloat2455;
		aFloat2454 -= class217_18_.aFloat2454;
	}

	public final void method2016(Matrix3f class222) {
		float f = aFloat2451;
		float f_19_ = aFloat2455;
		aFloat2451 = (((Matrix3f) class222).aFloat2494 * f + ((Matrix3f) class222).aFloat2496 * f_19_ + ((Matrix3f) class222).aFloat2499 * aFloat2454 + ((Matrix3f) class222).aFloat2492);
		aFloat2455 = (((Matrix3f) class222).aFloat2502 * f + ((Matrix3f) class222).aFloat2497 * f_19_ + ((Matrix3f) class222).aFloat2500 * aFloat2454 + ((Matrix3f) class222).aFloat2503);
		aFloat2454 = (((Matrix3f) class222).aFloat2495 * f + ((Matrix3f) class222).aFloat2498 * f_19_ + ((Matrix3f) class222).aFloat2501 * aFloat2454 + ((Matrix3f) class222).aFloat2493);
	}

	public static void method2017(int i) {
		anInt2452 = i;
		aClass217Array2456 = new Class217[i];
		anInt2453 = 0;
	}

	public final void method2018(Matrix3f class222) {
		float f = aFloat2451;
		float f_20_ = aFloat2455;
		aFloat2451 = (((Matrix3f) class222).aFloat2494 * f + ((Matrix3f) class222).aFloat2496 * f_20_ + ((Matrix3f) class222).aFloat2499 * aFloat2454);
		aFloat2455 = (((Matrix3f) class222).aFloat2502 * f + ((Matrix3f) class222).aFloat2497 * f_20_ + ((Matrix3f) class222).aFloat2500 * aFloat2454);
		aFloat2454 = (((Matrix3f) class222).aFloat2495 * f + ((Matrix3f) class222).aFloat2498 * f_20_ + ((Matrix3f) class222).aFloat2501 * aFloat2454);
	}
}
