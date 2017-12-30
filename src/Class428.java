
/* Class428 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class428 {
	WeakReference_Sub1[] aWeakReference_Sub1Array5124;
	int anInt5125;
	ReferenceQueue aReferenceQueue5126 = new ReferenceQueue();

	void method7190(byte i) {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class428) this).aReferenceQueue5126.poll());
			if (weakreference_sub1 == null)
				break;
			int i_0_ = ((1941058597 * ((WeakReference_Sub1) weakreference_sub1).anInt10067) & (((Class428) this).aWeakReference_Sub1Array5124.length - 1));
			WeakReference_Sub1 weakreference_sub1_1_ = ((Class428) this).aWeakReference_Sub1Array5124[i_0_];
			if (weakreference_sub1 == weakreference_sub1_1_) {
				((Class428) this).aWeakReference_Sub1Array5124[i_0_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (/**/; (weakreference_sub1_1_ != null && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_1_).aWeakReference_Sub1_10066))); weakreference_sub1_1_ = (((WeakReference_Sub1) weakreference_sub1_1_).aWeakReference_Sub1_10066)) {
					/* empty */
				}
				if (weakreference_sub1_1_ != null) {
					((WeakReference_Sub1) weakreference_sub1_1_).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					((Class428) this).anInt5125 -= 2103970533;
				}
			}
		}
	}

	public void method7191(Object object, byte i) {
		if (null == object)
			throw new NullPointerException();
		method7190((byte) 19);
		int i_2_ = System.identityHashCode(object);
		int i_3_ = i_2_ & ((Class428) this).aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_3_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				((Class428) this).aWeakReference_Sub1Array5124[i_3_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_4_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					if (null == weakreference_sub1_4_)
						break;
					if (weakreference_sub1_4_.get() == object) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1_4_).aWeakReference_Sub1_10066);
						((Class428) this).anInt5125 -= 2103970533;
						break;
					}
					weakreference_sub1 = weakreference_sub1_4_;
				}
			}
		}
	}

	public ArrayList method7192() {
		method7190((byte) 46);
		ArrayList arraylist = new ArrayList(-820665619 * ((Class428) this).anInt5125);
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public ArrayList method7193(byte i) {
		method7190((byte) -69);
		ArrayList arraylist = new ArrayList(-820665619 * ((Class428) this).anInt5125);
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		for (int i_5_ = 0; i_5_ < weakreference_sub1s.length; i_5_++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_5_]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method7194(byte i) {
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		((Class428) this).aWeakReference_Sub1Array5124 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_6_ = weakreference_sub1s;
		for (int i_7_ = 0; i_7_ < weakreference_sub1s_6_.length; i_7_++) {
			WeakReference_Sub1 weakreference_sub1_8_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_6_[i_7_]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_8_) {
				weakreference_sub1_8_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				int i_9_ = ((((WeakReference_Sub1) weakreference_sub1).anInt10067 * 1941058597) & (((Class428) this).aWeakReference_Sub1Array5124.length - 1));
				((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = ((Class428) this).aWeakReference_Sub1Array5124[i_9_];
				((Class428) this).aWeakReference_Sub1Array5124[i_9_] = weakreference_sub1;
			}
		}
	}

	public Class428() {
		((Class428) this).aWeakReference_Sub1Array5124 = new WeakReference_Sub1[16];
	}

	public void method7195(Object object, Object object_10_) {
		if (object == null)
			throw new NullPointerException();
		method7190((byte) 66);
		int i = System.identityHashCode(object);
		int i_11_ = i & ((Class428) this).aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_11_];
		if (weakreference_sub1 == null) {
			((Class428) this).aWeakReference_Sub1Array5124[i_11_] = new WeakReference_Sub1(object, ((Class428) this).aReferenceQueue5126, i, object_10_);
			((Class428) this).anInt5125 += 2103970533;
			if (-820665619 * ((Class428) this).anInt5125 >= ((Class428) this).aWeakReference_Sub1Array5124.length)
				method7194((byte) -77);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				if ((((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066) == null) {
					((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = new WeakReference_Sub1(object, (((Class428) this).aReferenceQueue5126), i, object_10_);
					((Class428) this).anInt5125 += 2103970533;
					if (-820665619 * ((Class428) this).anInt5125 >= (((Class428) this).aWeakReference_Sub1Array5124).length)
						method7194((byte) 66);
					break;
				}
			}
		}
	}

	public void method7196(Object object, Object object_12_) {
		if (object == null)
			throw new NullPointerException();
		method7190((byte) 19);
		int i = System.identityHashCode(object);
		int i_13_ = i & ((Class428) this).aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_13_];
		if (weakreference_sub1 == null) {
			((Class428) this).aWeakReference_Sub1Array5124[i_13_] = new WeakReference_Sub1(object, ((Class428) this).aReferenceQueue5126, i, object_12_);
			((Class428) this).anInt5125 += 2103970533;
			if (-820665619 * ((Class428) this).anInt5125 >= ((Class428) this).aWeakReference_Sub1Array5124.length)
				method7194((byte) -44);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				if ((((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066) == null) {
					((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = new WeakReference_Sub1(object, (((Class428) this).aReferenceQueue5126), i, object_12_);
					((Class428) this).anInt5125 += 2103970533;
					if (-820665619 * ((Class428) this).anInt5125 >= (((Class428) this).aWeakReference_Sub1Array5124).length)
						method7194((byte) -28);
					break;
				}
			}
		}
	}

	public void method7197(Object object) {
		if (null == object)
			throw new NullPointerException();
		method7190((byte) -21);
		int i = System.identityHashCode(object);
		int i_14_ = i & ((Class428) this).aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_14_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				((Class428) this).aWeakReference_Sub1Array5124[i_14_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_15_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					if (null == weakreference_sub1_15_)
						break;
					if (weakreference_sub1_15_.get() == object) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1_15_).aWeakReference_Sub1_10066);
						((Class428) this).anInt5125 -= 2103970533;
						break;
					}
					weakreference_sub1 = weakreference_sub1_15_;
				}
			}
		}
	}

	public void method7198(Object object) {
		if (null == object)
			throw new NullPointerException();
		method7190((byte) 64);
		int i = System.identityHashCode(object);
		int i_16_ = i & ((Class428) this).aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_16_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				((Class428) this).aWeakReference_Sub1Array5124[i_16_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_17_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					if (null == weakreference_sub1_17_)
						break;
					if (weakreference_sub1_17_.get() == object) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1_17_).aWeakReference_Sub1_10066);
						((Class428) this).anInt5125 -= 2103970533;
						break;
					}
					weakreference_sub1 = weakreference_sub1_17_;
				}
			}
		}
	}

	public void method7199(Object object) {
		if (null == object)
			throw new NullPointerException();
		method7190((byte) 83);
		int i = System.identityHashCode(object);
		int i_18_ = i & ((Class428) this).aWeakReference_Sub1Array5124.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_18_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				((Class428) this).aWeakReference_Sub1Array5124[i_18_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_19_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					if (null == weakreference_sub1_19_)
						break;
					if (weakreference_sub1_19_.get() == object) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1_19_).aWeakReference_Sub1_10066);
						((Class428) this).anInt5125 -= 2103970533;
						break;
					}
					weakreference_sub1 = weakreference_sub1_19_;
				}
			}
		}
	}

	public ArrayList method7200() {
		method7190((byte) 68);
		ArrayList arraylist = new ArrayList(-820665619 * ((Class428) this).anInt5125);
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public void method7201(Object object, Object object_20_, int i) {
		if (object == null)
			throw new NullPointerException();
		method7190((byte) -6);
		int i_21_ = System.identityHashCode(object);
		int i_22_ = (i_21_ & ((Class428) this).aWeakReference_Sub1Array5124.length - 1);
		WeakReference_Sub1 weakreference_sub1 = ((Class428) this).aWeakReference_Sub1Array5124[i_22_];
		if (weakreference_sub1 == null) {
			((Class428) this).aWeakReference_Sub1Array5124[i_22_] = new WeakReference_Sub1(object, ((Class428) this).aReferenceQueue5126, i_21_, object_20_);
			((Class428) this).anInt5125 += 2103970533;
			if (-820665619 * ((Class428) this).anInt5125 >= ((Class428) this).aWeakReference_Sub1Array5124.length)
				method7194((byte) -54);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				if ((((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066) == null) {
					((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = new WeakReference_Sub1(object, (((Class428) this).aReferenceQueue5126), i_21_, object_20_);
					((Class428) this).anInt5125 += 2103970533;
					if (-820665619 * ((Class428) this).anInt5125 >= (((Class428) this).aWeakReference_Sub1Array5124).length)
						method7194((byte) -16);
					break;
				}
			}
		}
	}

	void method7202() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class428) this).aReferenceQueue5126.poll());
			if (weakreference_sub1 == null)
				break;
			int i = ((1941058597 * ((WeakReference_Sub1) weakreference_sub1).anInt10067) & (((Class428) this).aWeakReference_Sub1Array5124.length - 1));
			WeakReference_Sub1 weakreference_sub1_23_ = ((Class428) this).aWeakReference_Sub1Array5124[i];
			if (weakreference_sub1 == weakreference_sub1_23_) {
				((Class428) this).aWeakReference_Sub1Array5124[i] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (/**/; (weakreference_sub1_23_ != null && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_23_).aWeakReference_Sub1_10066))); weakreference_sub1_23_ = (((WeakReference_Sub1) weakreference_sub1_23_).aWeakReference_Sub1_10066)) {
					/* empty */
				}
				if (weakreference_sub1_23_ != null) {
					((WeakReference_Sub1) weakreference_sub1_23_).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					((Class428) this).anInt5125 -= 2103970533;
				}
			}
		}
	}

	public ArrayList method7203() {
		method7190((byte) -52);
		ArrayList arraylist = new ArrayList(-820665619 * ((Class428) this).anInt5125);
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public ArrayList method7204() {
		method7190((byte) -75);
		ArrayList arraylist = new ArrayList(-820665619 * ((Class428) this).anInt5125);
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	void method7205() {
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		((Class428) this).aWeakReference_Sub1Array5124 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_24_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_24_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_25_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_24_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_25_) {
				weakreference_sub1_25_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				int i_26_ = ((((WeakReference_Sub1) weakreference_sub1).anInt10067 * 1941058597) & (((Class428) this).aWeakReference_Sub1Array5124.length - 1));
				((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066 = ((Class428) this).aWeakReference_Sub1Array5124[i_26_];
				((Class428) this).aWeakReference_Sub1Array5124[i_26_] = weakreference_sub1;
			}
		}
	}

	void method7206() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class428) this).aReferenceQueue5126.poll());
			if (weakreference_sub1 == null)
				break;
			int i = ((1941058597 * ((WeakReference_Sub1) weakreference_sub1).anInt10067) & (((Class428) this).aWeakReference_Sub1Array5124.length - 1));
			WeakReference_Sub1 weakreference_sub1_27_ = ((Class428) this).aWeakReference_Sub1Array5124[i];
			if (weakreference_sub1 == weakreference_sub1_27_) {
				((Class428) this).aWeakReference_Sub1Array5124[i] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
				((Class428) this).anInt5125 -= 2103970533;
			} else {
				for (/**/; (weakreference_sub1_27_ != null && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_27_).aWeakReference_Sub1_10066))); weakreference_sub1_27_ = (((WeakReference_Sub1) weakreference_sub1_27_).aWeakReference_Sub1_10066)) {
					/* empty */
				}
				if (weakreference_sub1_27_ != null) {
					((WeakReference_Sub1) weakreference_sub1_27_).aWeakReference_Sub1_10066 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066);
					((Class428) this).anInt5125 -= 2103970533;
				}
			}
		}
	}

	public ArrayList method7207() {
		method7190((byte) -117);
		ArrayList arraylist = new ArrayList(-820665619 * ((Class428) this).anInt5125);
		WeakReference_Sub1[] weakreference_sub1s = ((Class428) this).aWeakReference_Sub1Array5124;
		for (int i = 0; i < weakreference_sub1s.length; i++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i]; weakreference_sub1 != null; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_10066)) {
				Object object = weakreference_sub1.get();
				if (null != object)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	static final void method7208(CS2Executor class527, int i) {
		int i_28_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_28_, (byte) 45);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_28_ >> 16];
		Class282_Sub50_Sub17.method15511(class118, class98, class527, (byte) 126);
	}

	static final void method7209(CS2Executor class527, int i) {
		Class20.anInt198 = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) * 1670293651);
	}

	static final void method7210(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7001 -= 1918006146;
		if ((((CS2Executor) class527).aLongArray7003[1820448321 * ((CS2Executor) class527).anInt7001 + 1]) == (((CS2Executor) class527).aLongArray7003[1820448321 * ((CS2Executor) class527).anInt7001]))
			((CS2Executor) class527).anInt7020 += (-1051529003 * (((CS2Executor) class527).anIntArray7018[301123709 * ((CS2Executor) class527).anInt7020]));
	}
}
