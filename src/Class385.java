/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class385 {
	static int anInt4668;
	static Class385[] aClass385Array4669;
	static int anInt4670;
	public float aFloat4671;
	public float aFloat4672;
	public float aFloat4673;

	public void method6621(Class385 class385_0_) {
		method6626(class385_0_.aFloat4671, class385_0_.aFloat4672, class385_0_.aFloat4673);
	}

	public static Class385 method6622(float f, float f_1_, float f_2_) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385 = new Class385(f, f_1_, f_2_);
				return class385;
			}
			aClass385Array4669[--anInt4668].method6626(f, f_1_, f_2_);
			Class385 class385 = aClass385Array4669[anInt4668];
			return class385;
		}
	}

	public static Class385 method6623(Class385 class385) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385_3_ = new Class385(class385);
				return class385_3_;
			}
			aClass385Array4669[--anInt4668].method6627(class385);
			Class385 class385_4_ = aClass385Array4669[anInt4668];
			return class385_4_;
		}
	}

	public void method6624() {
		synchronized (aClass385Array4669) {
			if (anInt4668 < anInt4670 - 1)
				aClass385Array4669[anInt4668++] = this;
		}
	}

	public Class385() {
		/* empty */
	}

	public final void method6625(float f, float f_5_, float f_6_) {
		aFloat4671 -= f;
		aFloat4672 -= f_5_;
		aFloat4673 -= f_6_;
	}

	Class385(Class385 class385_7_) {
		aFloat4671 = class385_7_.aFloat4671;
		aFloat4672 = class385_7_.aFloat4672;
		aFloat4673 = class385_7_.aFloat4673;
	}

	public void method6626(float f, float f_8_, float f_9_) {
		aFloat4671 = f;
		aFloat4672 = f_8_;
		aFloat4673 = f_9_;
	}

	public void method6627(Class385 class385_10_) {
		method6626(class385_10_.aFloat4671, class385_10_.aFloat4672, class385_10_.aFloat4673);
	}

	final void method6628() {
		aFloat4671 = -aFloat4671;
		aFloat4672 = -aFloat4672;
		aFloat4673 = -aFloat4673;
	}

	final void method6629(Class385 class385_11_) {
		aFloat4671 += class385_11_.aFloat4671;
		aFloat4672 += class385_11_.aFloat4672;
		aFloat4673 += class385_11_.aFloat4673;
	}

	public void method6630(float f, float f_12_, float f_13_) {
		aFloat4671 = f;
		aFloat4672 = f_12_;
		aFloat4673 = f_13_;
	}

	public final void method6631(float f, float f_14_, float f_15_) {
		aFloat4671 -= f;
		aFloat4672 -= f_14_;
		aFloat4673 -= f_15_;
	}

	public static final Class385 method6632(Class385 class385, Class385 class385_16_) {
		Class385 class385_17_ = method6623(class385);
		class385_17_.method6667(class385_16_);
		return class385_17_;
	}

	public final float method6633() {
		return (float) Math.sqrt((double) (aFloat4671 * aFloat4671 + aFloat4672 * aFloat4672 + aFloat4673 * aFloat4673));
	}

	final void method6634(Class381 class381) {
		Class381 class381_18_ = Class381.method6485(aFloat4671, aFloat4672, aFloat4673, 0.0F);
		Class381 class381_19_ = Class381.method6465(class381);
		Class381 class381_20_ = Class381.method6497(class381_19_, class381_18_);
		class381_20_.method6466(class381);
		method6626(((Class381) class381_20_).aFloat4640, ((Class381) class381_20_).aFloat4637, ((Class381) class381_20_).aFloat4642);
		class381_18_.method6477();
		class381_19_.method6477();
		class381_20_.method6477();
	}

	public static final Class385 method6635(Class385 class385, Class385 class385_21_) {
		Class385 class385_22_ = method6623(class385);
		class385_22_.method6667(class385_21_);
		return class385_22_;
	}

	final void method6636(Class385 class385_23_) {
		aFloat4671 += class385_23_.aFloat4671;
		aFloat4672 += class385_23_.aFloat4672;
		aFloat4673 += class385_23_.aFloat4673;
	}

	public String method6637() {
		return new StringBuilder().append(aFloat4671).append(", ").append(aFloat4672).append(", ").append(aFloat4673).toString();
	}

	public String toString() {
		return new StringBuilder().append(aFloat4671).append(", ").append(aFloat4672).append(", ").append(aFloat4673).toString();
	}

	public String method6638() {
		return new StringBuilder().append(aFloat4671).append(", ").append(aFloat4672).append(", ").append(aFloat4673).toString();
	}

	public static Class385 method6639(float f, float f_24_, float f_25_) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385 = new Class385(f, f_24_, f_25_);
				return class385;
			}
			aClass385Array4669[--anInt4668].method6626(f, f_24_, f_25_);
			Class385 class385 = aClass385Array4669[anInt4668];
			return class385;
		}
	}

	public static Class385 method6640(float f, float f_26_, float f_27_) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385 = new Class385(f, f_26_, f_27_);
				return class385;
			}
			aClass385Array4669[--anInt4668].method6626(f, f_26_, f_27_);
			Class385 class385 = aClass385Array4669[anInt4668];
			return class385;
		}
	}

	public final void method6641(Class294 class294) {
		float f = aFloat4671;
		float f_28_ = aFloat4672;
		aFloat4671 = (((Class294) class294).aFloat3519 * f + ((Class294) class294).aFloat3517 * f_28_ + ((Class294) class294).aFloat3520 * aFloat4673);
		aFloat4672 = (((Class294) class294).aFloat3514 * f + ((Class294) class294).aFloat3523 * f_28_ + ((Class294) class294).aFloat3513 * aFloat4673);
		aFloat4673 = (((Class294) class294).aFloat3516 * f + ((Class294) class294).aFloat3522 * f_28_ + ((Class294) class294).aFloat3521 * aFloat4673);
	}

	public static Class385 method6642(float f, float f_29_, float f_30_) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385 = new Class385(f, f_29_, f_30_);
				return class385;
			}
			aClass385Array4669[--anInt4668].method6626(f, f_29_, f_30_);
			Class385 class385 = aClass385Array4669[anInt4668];
			return class385;
		}
	}

	public static void method6643(int i) {
		anInt4670 = i;
		aClass385Array4669 = new Class385[i];
		anInt4668 = 0;
	}

	public static Class385 method6644(Class385 class385) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385_31_ = new Class385(class385);
				return class385_31_;
			}
			aClass385Array4669[--anInt4668].method6627(class385);
			Class385 class385_32_ = aClass385Array4669[anInt4668];
			return class385_32_;
		}
	}

	public static Class385 method6645(Class385 class385) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385_33_ = new Class385(class385);
				return class385_33_;
			}
			aClass385Array4669[--anInt4668].method6627(class385);
			Class385 class385_34_ = aClass385Array4669[anInt4668];
			return class385_34_;
		}
	}

	public void method6646() {
		synchronized (aClass385Array4669) {
			if (anInt4668 < anInt4670 - 1)
				aClass385Array4669[anInt4668++] = this;
		}
	}

	public void method6647() {
		synchronized (aClass385Array4669) {
			if (anInt4668 < anInt4670 - 1)
				aClass385Array4669[anInt4668++] = this;
		}
	}

	public void method6648(float f, float f_35_, float f_36_) {
		aFloat4671 = f;
		aFloat4672 = f_35_;
		aFloat4673 = f_36_;
	}

	public final void method6649(Class294 class294) {
		float f = aFloat4671;
		float f_37_ = aFloat4672;
		aFloat4671 = (((Class294) class294).aFloat3519 * f + ((Class294) class294).aFloat3517 * f_37_ + ((Class294) class294).aFloat3520 * aFloat4673);
		aFloat4672 = (((Class294) class294).aFloat3514 * f + ((Class294) class294).aFloat3523 * f_37_ + ((Class294) class294).aFloat3513 * aFloat4673);
		aFloat4673 = (((Class294) class294).aFloat3516 * f + ((Class294) class294).aFloat3522 * f_37_ + ((Class294) class294).aFloat3521 * aFloat4673);
	}

	public void method6650(Class385 class385_38_) {
		method6626(class385_38_.aFloat4671, class385_38_.aFloat4672, class385_38_.aFloat4673);
	}

	public final void method6651(Class294 class294) {
		float f = aFloat4671;
		float f_39_ = aFloat4672;
		aFloat4671 = (((Class294) class294).aFloat3519 * f + ((Class294) class294).aFloat3517 * f_39_ + ((Class294) class294).aFloat3520 * aFloat4673 + ((Class294) class294).aFloat3515);
		aFloat4672 = (((Class294) class294).aFloat3514 * f + ((Class294) class294).aFloat3523 * f_39_ + ((Class294) class294).aFloat3513 * aFloat4673 + ((Class294) class294).aFloat3524);
		aFloat4673 = (((Class294) class294).aFloat3516 * f + ((Class294) class294).aFloat3522 * f_39_ + ((Class294) class294).aFloat3521 * aFloat4673 + ((Class294) class294).aFloat3525);
	}

	public void method6652(Class385 class385_40_) {
		method6626(class385_40_.aFloat4671, class385_40_.aFloat4672, class385_40_.aFloat4673);
	}

	public Class385(float f, float f_41_, float f_42_) {
		aFloat4671 = f;
		aFloat4672 = f_41_;
		aFloat4673 = f_42_;
	}

	final void method6653(Class385 class385_43_) {
		aFloat4671 += class385_43_.aFloat4671;
		aFloat4672 += class385_43_.aFloat4672;
		aFloat4673 += class385_43_.aFloat4673;
	}

	final void method6654(Class385 class385_44_) {
		aFloat4671 += class385_44_.aFloat4671;
		aFloat4672 += class385_44_.aFloat4672;
		aFloat4673 += class385_44_.aFloat4673;
	}

	public static Class385 method6655(float f, float f_45_, float f_46_) {
		synchronized (aClass385Array4669) {
			if (anInt4668 == 0) {
				Class385 class385 = new Class385(f, f_45_, f_46_);
				return class385;
			}
			aClass385Array4669[--anInt4668].method6626(f, f_45_, f_46_);
			Class385 class385 = aClass385Array4669[anInt4668];
			return class385;
		}
	}

	public final void method6656(float f, float f_47_, float f_48_) {
		aFloat4671 -= f;
		aFloat4672 -= f_47_;
		aFloat4673 -= f_48_;
	}

	public final void method6657(float f, float f_49_, float f_50_) {
		aFloat4671 -= f;
		aFloat4672 -= f_49_;
		aFloat4673 -= f_50_;
	}

	public final float method6658() {
		return (float) Math.sqrt((double) (aFloat4671 * aFloat4671 + aFloat4672 * aFloat4672 + aFloat4673 * aFloat4673));
	}

	public static final Class385 method6659(Class385 class385, Class385 class385_51_) {
		Class385 class385_52_ = method6623(class385);
		class385_52_.method6667(class385_51_);
		return class385_52_;
	}

	public final float method6660() {
		return (float) Math.sqrt((double) (aFloat4671 * aFloat4671 + aFloat4672 * aFloat4672 + aFloat4673 * aFloat4673));
	}

	public final void method6661(float f, float f_53_, float f_54_) {
		aFloat4671 -= f;
		aFloat4672 -= f_53_;
		aFloat4673 -= f_54_;
	}

	static {
		new Class385(0.0F, 0.0F, 0.0F);
		aClass385Array4669 = new Class385[0];
	}

	public static final Class385 method6662(Class385 class385, Class385 class385_55_) {
		Class385 class385_56_ = method6623(class385);
		class385_56_.method6667(class385_55_);
		return class385_56_;
	}

	final void method6663(Class381 class381) {
		Class381 class381_57_ = Class381.method6485(aFloat4671, aFloat4672, aFloat4673, 0.0F);
		Class381 class381_58_ = Class381.method6465(class381);
		Class381 class381_59_ = Class381.method6497(class381_58_, class381_57_);
		class381_59_.method6466(class381);
		method6626(((Class381) class381_59_).aFloat4640, ((Class381) class381_59_).aFloat4637, ((Class381) class381_59_).aFloat4642);
		class381_57_.method6477();
		class381_58_.method6477();
		class381_59_.method6477();
	}

	final void method6664(Class381 class381) {
		Class381 class381_60_ = Class381.method6485(aFloat4671, aFloat4672, aFloat4673, 0.0F);
		Class381 class381_61_ = Class381.method6465(class381);
		Class381 class381_62_ = Class381.method6497(class381_61_, class381_60_);
		class381_62_.method6466(class381);
		method6626(((Class381) class381_62_).aFloat4640, ((Class381) class381_62_).aFloat4637, ((Class381) class381_62_).aFloat4642);
		class381_60_.method6477();
		class381_61_.method6477();
		class381_62_.method6477();
	}

	public final void method6665(Class294 class294) {
		float f = aFloat4671;
		float f_63_ = aFloat4672;
		aFloat4671 = (((Class294) class294).aFloat3519 * f + ((Class294) class294).aFloat3517 * f_63_ + ((Class294) class294).aFloat3520 * aFloat4673 + ((Class294) class294).aFloat3515);
		aFloat4672 = (((Class294) class294).aFloat3514 * f + ((Class294) class294).aFloat3523 * f_63_ + ((Class294) class294).aFloat3513 * aFloat4673 + ((Class294) class294).aFloat3524);
		aFloat4673 = (((Class294) class294).aFloat3516 * f + ((Class294) class294).aFloat3522 * f_63_ + ((Class294) class294).aFloat3521 * aFloat4673 + ((Class294) class294).aFloat3525);
	}

	public final void method6666(Class294 class294) {
		float f = aFloat4671;
		float f_64_ = aFloat4672;
		aFloat4671 = (((Class294) class294).aFloat3519 * f + ((Class294) class294).aFloat3517 * f_64_ + ((Class294) class294).aFloat3520 * aFloat4673);
		aFloat4672 = (((Class294) class294).aFloat3514 * f + ((Class294) class294).aFloat3523 * f_64_ + ((Class294) class294).aFloat3513 * aFloat4673);
		aFloat4673 = (((Class294) class294).aFloat3516 * f + ((Class294) class294).aFloat3522 * f_64_ + ((Class294) class294).aFloat3521 * aFloat4673);
	}

	final void method6667(Class385 class385_65_) {
		aFloat4671 -= class385_65_.aFloat4671;
		aFloat4672 -= class385_65_.aFloat4672;
		aFloat4673 -= class385_65_.aFloat4673;
	}
}
