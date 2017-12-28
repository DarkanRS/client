/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class381 {
	float aFloat4637;
	static int anInt4638;
	static int anInt4639;
	float aFloat4640;
	static Class381[] aClass381Array4641 = new Class381[0];
	float aFloat4642;
	float aFloat4643;

	public void method6454(float f, float f_0_, float f_1_, float f_2_) {
		float f_3_ = (float) Math.sin((double) (f_2_ * 0.5F));
		float f_4_ = (float) Math.cos((double) (f_2_ * 0.5F));
		((Class381) this).aFloat4640 = f * f_3_;
		((Class381) this).aFloat4637 = f_0_ * f_3_;
		((Class381) this).aFloat4642 = f_1_ * f_3_;
		((Class381) this).aFloat4643 = f_4_;
	}

	public static Class381 method6455() {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381 = new Class381();
				return class381;
			}
			aClass381Array4641[--anInt4639].method6463();
			Class381 class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	static Class381 method6456(Class381 class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381_5_ = new Class381(class381);
				return class381_5_;
			}
			aClass381Array4641[--anInt4639].method6490(class381);
			Class381 class381_6_ = aClass381Array4641[anInt4639];
			return class381_6_;
		}
	}

	static Class381 method6457(Class381 class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381_7_ = new Class381(class381);
				return class381_7_;
			}
			aClass381Array4641[--anInt4639].method6490(class381);
			Class381 class381_8_ = aClass381Array4641[anInt4639];
			return class381_8_;
		}
	}

	static final Class381 method6458(Class381 class381, Class381 class381_9_) {
		Class381 class381_10_ = method6457(class381);
		class381_10_.method6466(class381_9_);
		return class381_10_;
	}

	public Class381() {
		method6463();
	}

	Class381(float f, float f_11_, float f_12_, float f_13_) {
		method6459(f, f_11_, f_12_, f_13_);
	}

	Class381(Class381 class381_14_) {
		method6490(class381_14_);
	}

	void method6459(float f, float f_15_, float f_16_, float f_17_) {
		((Class381) this).aFloat4640 = f;
		((Class381) this).aFloat4637 = f_15_;
		((Class381) this).aFloat4642 = f_16_;
		((Class381) this).aFloat4643 = f_17_;
	}

	static final Class381 method6460(Class381 class381) {
		Class381 class381_18_ = method6457(class381);
		class381_18_.method6464();
		return class381_18_;
	}

	public void method6461(float f, float f_19_, float f_20_, float f_21_) {
		float f_22_ = (float) Math.sin((double) (f_21_ * 0.5F));
		float f_23_ = (float) Math.cos((double) (f_21_ * 0.5F));
		((Class381) this).aFloat4640 = f * f_22_;
		((Class381) this).aFloat4637 = f_19_ * f_22_;
		((Class381) this).aFloat4642 = f_20_ * f_22_;
		((Class381) this).aFloat4643 = f_23_;
	}

	static Class381 method6462(Class381 class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381_24_ = new Class381(class381);
				return class381_24_;
			}
			aClass381Array4641[--anInt4639].method6490(class381);
			Class381 class381_25_ = aClass381Array4641[anInt4639];
			return class381_25_;
		}
	}

	final void method6463() {
		((Class381) this).aFloat4642 = 0.0F;
		((Class381) this).aFloat4637 = 0.0F;
		((Class381) this).aFloat4640 = 0.0F;
		((Class381) this).aFloat4643 = 1.0F;
	}

	final void method6464() {
		((Class381) this).aFloat4640 = -((Class381) this).aFloat4640;
		((Class381) this).aFloat4637 = -((Class381) this).aFloat4637;
		((Class381) this).aFloat4642 = -((Class381) this).aFloat4642;
	}

	static final Class381 method6465(Class381 class381) {
		Class381 class381_26_ = method6457(class381);
		class381_26_.method6464();
		return class381_26_;
	}

	public final void method6466(Class381 class381_27_) {
		method6459(((((Class381) class381_27_).aFloat4643 * ((Class381) this).aFloat4640) + (((Class381) class381_27_).aFloat4640 * ((Class381) this).aFloat4643) + (((Class381) class381_27_).aFloat4637 * ((Class381) this).aFloat4642) - (((Class381) class381_27_).aFloat4642 * ((Class381) this).aFloat4637)),
				((((Class381) class381_27_).aFloat4643 * ((Class381) this).aFloat4637) - (((Class381) class381_27_).aFloat4640 * ((Class381) this).aFloat4642) + (((Class381) class381_27_).aFloat4637 * ((Class381) this).aFloat4643) + (((Class381) class381_27_).aFloat4642 * ((Class381) this).aFloat4640)),
				((((Class381) class381_27_).aFloat4643 * ((Class381) this).aFloat4642) + (((Class381) class381_27_).aFloat4640 * ((Class381) this).aFloat4637) - (((Class381) class381_27_).aFloat4637 * ((Class381) this).aFloat4640) + (((Class381) class381_27_).aFloat4642 * ((Class381) this).aFloat4643)),
				((((Class381) class381_27_).aFloat4643 * ((Class381) this).aFloat4643) - (((Class381) class381_27_).aFloat4640 * ((Class381) this).aFloat4640) - (((Class381) class381_27_).aFloat4637 * ((Class381) this).aFloat4637) - (((Class381) class381_27_).aFloat4642 * ((Class381) this).aFloat4642)));
	}

	public String toString() {
		return new StringBuilder().append(((Class381) this).aFloat4640).append(",").append(((Class381) this).aFloat4637).append(",").append(((Class381) this).aFloat4642).append(",").append(((Class381) this).aFloat4643).toString();
	}

	public void method6467(float f, float f_28_, float f_29_, float f_30_) {
		float f_31_ = (float) Math.sin((double) (f_30_ * 0.5F));
		float f_32_ = (float) Math.cos((double) (f_30_ * 0.5F));
		((Class381) this).aFloat4640 = f * f_31_;
		((Class381) this).aFloat4637 = f_28_ * f_31_;
		((Class381) this).aFloat4642 = f_29_ * f_31_;
		((Class381) this).aFloat4643 = f_32_;
	}

	static {
		new Class381();
	}

	public String method6468() {
		return new StringBuilder().append(((Class381) this).aFloat4640).append(",").append(((Class381) this).aFloat4637).append(",").append(((Class381) this).aFloat4642).append(",").append(((Class381) this).aFloat4643).toString();
	}

	public String method6469() {
		return new StringBuilder().append(((Class381) this).aFloat4640).append(",").append(((Class381) this).aFloat4637).append(",").append(((Class381) this).aFloat4642).append(",").append(((Class381) this).aFloat4643).toString();
	}

	public static void method6470(int i) {
		anInt4638 = i;
		aClass381Array4641 = new Class381[i];
		anInt4639 = 0;
	}

	public static void method6471(int i) {
		anInt4638 = i;
		aClass381Array4641 = new Class381[i];
		anInt4639 = 0;
	}

	public void method6472(float f, float f_33_, float f_34_) {
		method6461(0.0F, 1.0F, 0.0F, f);
		Class381 class381_35_ = method6455();
		class381_35_.method6461(1.0F, 0.0F, 0.0F, f_33_);
		method6466(class381_35_);
		class381_35_.method6461(0.0F, 0.0F, 1.0F, f_34_);
		method6466(class381_35_);
		class381_35_.method6477();
	}

	public static void method6473(int i) {
		anInt4638 = i;
		aClass381Array4641 = new Class381[i];
		anInt4639 = 0;
	}

	void method6474(float f, float f_36_, float f_37_, float f_38_) {
		((Class381) this).aFloat4640 = f;
		((Class381) this).aFloat4637 = f_36_;
		((Class381) this).aFloat4642 = f_37_;
		((Class381) this).aFloat4643 = f_38_;
	}

	public static Class381 method6475() {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381 = new Class381();
				return class381;
			}
			aClass381Array4641[--anInt4639].method6463();
			Class381 class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	static final Class381 method6476(Class381 class381) {
		Class381 class381_39_ = method6457(class381);
		class381_39_.method6464();
		return class381_39_;
	}

	public void method6477() {
		synchronized (aClass381Array4641) {
			if (anInt4639 < anInt4638 - 1)
				aClass381Array4641[anInt4639++] = this;
		}
	}

	static Class381 method6478(Class381 class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381_40_ = new Class381(class381);
				return class381_40_;
			}
			aClass381Array4641[--anInt4639].method6490(class381);
			Class381 class381_41_ = aClass381Array4641[anInt4639];
			return class381_41_;
		}
	}

	public void method6479(float f, float f_42_, float f_43_, float f_44_) {
		float f_45_ = (float) Math.sin((double) (f_44_ * 0.5F));
		float f_46_ = (float) Math.cos((double) (f_44_ * 0.5F));
		((Class381) this).aFloat4640 = f * f_45_;
		((Class381) this).aFloat4637 = f_42_ * f_45_;
		((Class381) this).aFloat4642 = f_43_ * f_45_;
		((Class381) this).aFloat4643 = f_46_;
	}

	public void method6480(float f, float f_47_, float f_48_) {
		method6461(0.0F, 1.0F, 0.0F, f);
		Class381 class381_49_ = method6455();
		class381_49_.method6461(1.0F, 0.0F, 0.0F, f_47_);
		method6466(class381_49_);
		class381_49_.method6461(0.0F, 0.0F, 1.0F, f_48_);
		method6466(class381_49_);
		class381_49_.method6477();
	}

	static Class381 method6481(Class381 class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381_50_ = new Class381(class381);
				return class381_50_;
			}
			aClass381Array4641[--anInt4639].method6490(class381);
			Class381 class381_51_ = aClass381Array4641[anInt4639];
			return class381_51_;
		}
	}

	static Class381 method6482(Class381 class381) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381_52_ = new Class381(class381);
				return class381_52_;
			}
			aClass381Array4641[--anInt4639].method6490(class381);
			Class381 class381_53_ = aClass381Array4641[anInt4639];
			return class381_53_;
		}
	}

	public void method6483() {
		synchronized (aClass381Array4641) {
			if (anInt4639 < anInt4638 - 1)
				aClass381Array4641[anInt4639++] = this;
		}
	}

	public void method6484() {
		synchronized (aClass381Array4641) {
			if (anInt4639 < anInt4638 - 1)
				aClass381Array4641[anInt4639++] = this;
		}
	}

	static Class381 method6485(float f, float f_54_, float f_55_, float f_56_) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381 = new Class381(f, f_54_, f_55_, f_56_);
				return class381;
			}
			aClass381Array4641[--anInt4639].method6459(f, f_54_, f_55_, f_56_);
			Class381 class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	void method6486(float f, float f_57_, float f_58_, float f_59_) {
		((Class381) this).aFloat4640 = f;
		((Class381) this).aFloat4637 = f_57_;
		((Class381) this).aFloat4642 = f_58_;
		((Class381) this).aFloat4643 = f_59_;
	}

	public void method6487(Class381 class381_60_) {
		((Class381) this).aFloat4640 = ((Class381) class381_60_).aFloat4640;
		((Class381) this).aFloat4637 = ((Class381) class381_60_).aFloat4637;
		((Class381) this).aFloat4642 = ((Class381) class381_60_).aFloat4642;
		((Class381) this).aFloat4643 = ((Class381) class381_60_).aFloat4643;
	}

	public void method6488(Class381 class381_61_) {
		((Class381) this).aFloat4640 = ((Class381) class381_61_).aFloat4640;
		((Class381) this).aFloat4637 = ((Class381) class381_61_).aFloat4637;
		((Class381) this).aFloat4642 = ((Class381) class381_61_).aFloat4642;
		((Class381) this).aFloat4643 = ((Class381) class381_61_).aFloat4643;
	}

	static Class381 method6489(float f, float f_62_, float f_63_, float f_64_) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381 = new Class381(f, f_62_, f_63_, f_64_);
				return class381;
			}
			aClass381Array4641[--anInt4639].method6459(f, f_62_, f_63_, f_64_);
			Class381 class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	public void method6490(Class381 class381_65_) {
		((Class381) this).aFloat4640 = ((Class381) class381_65_).aFloat4640;
		((Class381) this).aFloat4637 = ((Class381) class381_65_).aFloat4637;
		((Class381) this).aFloat4642 = ((Class381) class381_65_).aFloat4642;
		((Class381) this).aFloat4643 = ((Class381) class381_65_).aFloat4643;
	}

	public static void method6491(int i) {
		anInt4638 = i;
		aClass381Array4641 = new Class381[i];
		anInt4639 = 0;
	}

	public void method6492(float f, float f_66_, float f_67_, float f_68_) {
		float f_69_ = (float) Math.sin((double) (f_68_ * 0.5F));
		float f_70_ = (float) Math.cos((double) (f_68_ * 0.5F));
		((Class381) this).aFloat4640 = f * f_69_;
		((Class381) this).aFloat4637 = f_66_ * f_69_;
		((Class381) this).aFloat4642 = f_67_ * f_69_;
		((Class381) this).aFloat4643 = f_70_;
	}

	public static void method6493(int i) {
		anInt4638 = i;
		aClass381Array4641 = new Class381[i];
		anInt4639 = 0;
	}

	public void method6494(float f, float f_71_, float f_72_) {
		method6461(0.0F, 1.0F, 0.0F, f);
		Class381 class381_73_ = method6455();
		class381_73_.method6461(1.0F, 0.0F, 0.0F, f_71_);
		method6466(class381_73_);
		class381_73_.method6461(0.0F, 0.0F, 1.0F, f_72_);
		method6466(class381_73_);
		class381_73_.method6477();
	}

	final void method6495() {
		((Class381) this).aFloat4642 = 0.0F;
		((Class381) this).aFloat4637 = 0.0F;
		((Class381) this).aFloat4640 = 0.0F;
		((Class381) this).aFloat4643 = 1.0F;
	}

	final void method6496() {
		((Class381) this).aFloat4640 = -((Class381) this).aFloat4640;
		((Class381) this).aFloat4637 = -((Class381) this).aFloat4637;
		((Class381) this).aFloat4642 = -((Class381) this).aFloat4642;
	}

	static final Class381 method6497(Class381 class381, Class381 class381_74_) {
		Class381 class381_75_ = method6457(class381);
		class381_75_.method6466(class381_74_);
		return class381_75_;
	}

	static final Class381 method6498(Class381 class381) {
		Class381 class381_76_ = method6457(class381);
		class381_76_.method6464();
		return class381_76_;
	}

	public static Class381 method6499() {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381 = new Class381();
				return class381;
			}
			aClass381Array4641[--anInt4639].method6463();
			Class381 class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}

	static final Class381 method6500(Class381 class381) {
		Class381 class381_77_ = method6457(class381);
		class381_77_.method6464();
		return class381_77_;
	}

	public final void method6501(Class381 class381_78_) {
		method6459(((((Class381) class381_78_).aFloat4643 * ((Class381) this).aFloat4640) + (((Class381) class381_78_).aFloat4640 * ((Class381) this).aFloat4643) + (((Class381) class381_78_).aFloat4637 * ((Class381) this).aFloat4642) - (((Class381) class381_78_).aFloat4642 * ((Class381) this).aFloat4637)),
				((((Class381) class381_78_).aFloat4643 * ((Class381) this).aFloat4637) - (((Class381) class381_78_).aFloat4640 * ((Class381) this).aFloat4642) + (((Class381) class381_78_).aFloat4637 * ((Class381) this).aFloat4643) + (((Class381) class381_78_).aFloat4642 * ((Class381) this).aFloat4640)),
				((((Class381) class381_78_).aFloat4643 * ((Class381) this).aFloat4642) + (((Class381) class381_78_).aFloat4640 * ((Class381) this).aFloat4637) - (((Class381) class381_78_).aFloat4637 * ((Class381) this).aFloat4640) + (((Class381) class381_78_).aFloat4642 * ((Class381) this).aFloat4643)),
				((((Class381) class381_78_).aFloat4643 * ((Class381) this).aFloat4643) - (((Class381) class381_78_).aFloat4640 * ((Class381) this).aFloat4640) - (((Class381) class381_78_).aFloat4637 * ((Class381) this).aFloat4637) - (((Class381) class381_78_).aFloat4642 * ((Class381) this).aFloat4642)));
	}

	public final void method6502(Class381 class381_79_) {
		method6459(((((Class381) class381_79_).aFloat4643 * ((Class381) this).aFloat4640) + (((Class381) class381_79_).aFloat4640 * ((Class381) this).aFloat4643) + (((Class381) class381_79_).aFloat4637 * ((Class381) this).aFloat4642) - (((Class381) class381_79_).aFloat4642 * ((Class381) this).aFloat4637)),
				((((Class381) class381_79_).aFloat4643 * ((Class381) this).aFloat4637) - (((Class381) class381_79_).aFloat4640 * ((Class381) this).aFloat4642) + (((Class381) class381_79_).aFloat4637 * ((Class381) this).aFloat4643) + (((Class381) class381_79_).aFloat4642 * ((Class381) this).aFloat4640)),
				((((Class381) class381_79_).aFloat4643 * ((Class381) this).aFloat4642) + (((Class381) class381_79_).aFloat4640 * ((Class381) this).aFloat4637) - (((Class381) class381_79_).aFloat4637 * ((Class381) this).aFloat4640) + (((Class381) class381_79_).aFloat4642 * ((Class381) this).aFloat4643)),
				((((Class381) class381_79_).aFloat4643 * ((Class381) this).aFloat4643) - (((Class381) class381_79_).aFloat4640 * ((Class381) this).aFloat4640) - (((Class381) class381_79_).aFloat4637 * ((Class381) this).aFloat4637) - (((Class381) class381_79_).aFloat4642 * ((Class381) this).aFloat4642)));
	}

	public final void method6503(Class381 class381_80_) {
		method6459(((((Class381) class381_80_).aFloat4643 * ((Class381) this).aFloat4640) + (((Class381) class381_80_).aFloat4640 * ((Class381) this).aFloat4643) + (((Class381) class381_80_).aFloat4637 * ((Class381) this).aFloat4642) - (((Class381) class381_80_).aFloat4642 * ((Class381) this).aFloat4637)),
				((((Class381) class381_80_).aFloat4643 * ((Class381) this).aFloat4637) - (((Class381) class381_80_).aFloat4640 * ((Class381) this).aFloat4642) + (((Class381) class381_80_).aFloat4637 * ((Class381) this).aFloat4643) + (((Class381) class381_80_).aFloat4642 * ((Class381) this).aFloat4640)),
				((((Class381) class381_80_).aFloat4643 * ((Class381) this).aFloat4642) + (((Class381) class381_80_).aFloat4640 * ((Class381) this).aFloat4637) - (((Class381) class381_80_).aFloat4637 * ((Class381) this).aFloat4640) + (((Class381) class381_80_).aFloat4642 * ((Class381) this).aFloat4643)),
				((((Class381) class381_80_).aFloat4643 * ((Class381) this).aFloat4643) - (((Class381) class381_80_).aFloat4640 * ((Class381) this).aFloat4640) - (((Class381) class381_80_).aFloat4637 * ((Class381) this).aFloat4637) - (((Class381) class381_80_).aFloat4642 * ((Class381) this).aFloat4642)));
	}

	static final Class381 method6504(Class381 class381, Class381 class381_81_) {
		Class381 class381_82_ = method6457(class381);
		class381_82_.method6466(class381_81_);
		return class381_82_;
	}

	static Class381 method6505(float f, float f_83_, float f_84_, float f_85_) {
		synchronized (aClass381Array4641) {
			if (anInt4639 == 0) {
				Class381 class381 = new Class381(f, f_83_, f_84_, f_85_);
				return class381;
			}
			aClass381Array4641[--anInt4639].method6459(f, f_83_, f_84_, f_85_);
			Class381 class381 = aClass381Array4641[anInt4639];
			return class381;
		}
	}
}
