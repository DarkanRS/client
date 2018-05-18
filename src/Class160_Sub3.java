/* Class160_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160_Sub3 extends NativeSprite {
	int anInt9049;
	Interface6 anInterface6_9050;
	boolean aBool9051 = false;
	Class505_Sub2 aClass505_Sub2_9052;
	int anInt9053;
	Interface9 anInterface9_9054;
	int anInt9055;
	boolean aBool9056;
	int anInt9057 = 0;
	int anInt9058;
	boolean aBool9059;
	int anInt9060;
	boolean aBool9061;
	boolean aBool9062;

	public void method2767(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int[] is = ((Class160_Sub3) this).aClass505_Sub2_9052.ab(i_3_, i_4_, i_1_, i_2_);
		if (is != null) {
			for (int i_5_ = 0; i_5_ < is.length; i_5_++)
				is[i_5_] |= ~0xffffff;
			method14425(i, i_0_, i_1_, i_2_, is, 0, i_1_);
		}
	}

	public int method2765() {
		return ((Class160_Sub3) this).anInt9053;
	}

	Class160_Sub3(Class505_Sub2 class505_sub2, Interface6 interface6) {
		this(class505_sub2, interface6, interface6.method1(), interface6.method59());
	}

	Class160_Sub3(Class505_Sub2 class505_sub2, Interface6 interface6, int i, int i_6_) {
		((Class160_Sub3) this).anInt9055 = 0;
		((Class160_Sub3) this).anInt9049 = 0;
		((Class160_Sub3) this).anInt9058 = 0;
		((Class160_Sub3) this).aClass505_Sub2_9052 = class505_sub2;
		((Class160_Sub3) this).anInt9060 = i;
		((Class160_Sub3) this).anInt9053 = i_6_;
		((Class160_Sub3) this).anInterface6_9050 = interface6;
		((Class160_Sub3) this).anInterface9_9054 = null;
		((Class160_Sub3) this).aBool9059 = ((Class160_Sub3) this).anInterface6_9050.method1() != i;
		((Class160_Sub3) this).aBool9056 = ((Class160_Sub3) this).anInterface6_9050.method59() != i_6_;
		((Class160_Sub3) this).aBool9061 = (!((Class160_Sub3) this).aBool9059 && ((Class160_Sub3) this).anInterface6_9050.method46());
		((Class160_Sub3) this).aBool9062 = (!((Class160_Sub3) this).aBool9056 && ((Class160_Sub3) this).anInterface6_9050.method46());
		((Class160_Sub3) this).aClass505_Sub2_9052.method13896(12);
	}

	void method2755(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_12_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_10_, i_11_);
		if (((Class160_Sub3) this).aBool9051) {
			i_8_ = i_8_ * ((Class160_Sub3) this).anInt9060 / method228();
			i_9_ = i_9_ * ((Class160_Sub3) this).anInt9053 / method2748();
			i += (((Class160_Sub3) this).anInt9055 * i_8_ / ((Class160_Sub3) this).anInt9060);
			i_7_ += (((Class160_Sub3) this).anInt9057 * i_9_ / ((Class160_Sub3) this).anInt9053);
		}
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 126).method2714();
		float f_14_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 104).method2716();
		class47.aClass384_442.method6525((float) i_8_ * 2.0F / f, (float) i_9_ * 2.0F / f_14_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_7_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_14_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public void method2751(int i, int i_15_, int i_16_) {
		int[] is = (((Class160_Sub3) this).aClass505_Sub2_9052.ab(i, i_15_, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053));
		int[] is_17_ = new int[(((Class160_Sub3) this).anInt9060 * ((Class160_Sub3) this).anInt9053)];
		((Class160_Sub3) this).anInterface6_9050.method53(0, 0, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053, is_17_, 0);
		if (i_16_ == 0) {
			for (int i_18_ = 0; i_18_ < ((Class160_Sub3) this).anInt9053; i_18_++) {
				int i_19_ = i_18_ * ((Class160_Sub3) this).anInt9060;
				for (int i_20_ = 0; i_20_ < ((Class160_Sub3) this).anInt9060; i_20_++)
					is_17_[i_19_ + i_20_] = (is_17_[i_19_ + i_20_] & 0xffffff | is[i_19_ + i_20_] << 8 & ~0xffffff);
			}
		} else if (i_16_ == 1) {
			for (int i_21_ = 0; i_21_ < ((Class160_Sub3) this).anInt9053; i_21_++) {
				int i_22_ = i_21_ * ((Class160_Sub3) this).anInt9060;
				for (int i_23_ = 0; i_23_ < ((Class160_Sub3) this).anInt9060; i_23_++)
					is_17_[i_22_ + i_23_] = (is_17_[i_22_ + i_23_] & 0xffffff | is[i_22_ + i_23_] << 16 & ~0xffffff);
			}
		} else if (i_16_ == 2) {
			for (int i_24_ = 0; i_24_ < ((Class160_Sub3) this).anInt9053; i_24_++) {
				int i_25_ = i_24_ * ((Class160_Sub3) this).anInt9060;
				for (int i_26_ = 0; i_26_ < ((Class160_Sub3) this).anInt9060; i_26_++)
					is_17_[i_25_ + i_26_] = (is_17_[i_25_ + i_26_] & 0xffffff | is[i_25_ + i_26_] << 24 & ~0xffffff);
			}
		} else if (i_16_ == 3) {
			for (int i_27_ = 0; i_27_ < ((Class160_Sub3) this).anInt9053; i_27_++) {
				int i_28_ = i_27_ * ((Class160_Sub3) this).anInt9060;
				for (int i_29_ = 0; i_29_ < ((Class160_Sub3) this).anInt9060; i_29_++)
					is_17_[i_28_ + i_29_] = (is_17_[i_28_ + i_29_] & 0xffffff | (is[i_28_ + i_29_] != 0 ? -16777216 : 0));
			}
		}
		method14425(0, 0, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053, is_17_, 0, ((Class160_Sub3) this).anInt9060);
	}

	void method2798(float f, float f_30_, float f_31_, float f_32_, float f_33_, float f_34_, int i, int i_35_, int i_36_, int i_37_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_36_);
		if (((Class160_Sub3) this).aBool9051) {
			float f_38_ = (float) method228();
			float f_39_ = (float) method2748();
			float f_40_ = (f_31_ - f) / f_38_;
			float f_41_ = (f_32_ - f_30_) / f_38_;
			float f_42_ = (f_33_ - f) / f_39_;
			float f_43_ = (f_34_ - f_30_) / f_39_;
			float f_44_ = f_42_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_45_ = f_43_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_46_ = f_40_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_47_ = f_41_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_48_ = -f_40_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_49_ = -f_41_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_50_ = -f_42_ * (float) ((Class160_Sub3) this).anInt9049;
			float f_51_ = -f_43_ * (float) ((Class160_Sub3) this).anInt9049;
			f = f + f_46_ + f_44_;
			f_30_ = f_30_ + f_47_ + f_45_;
			f_31_ = f_31_ + f_48_ + f_44_;
			f_32_ = f_32_ + f_49_ + f_45_;
			f_33_ = f_33_ + f_46_ + f_50_;
			f_34_ = f_34_ + f_47_ + f_51_;
		}
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i, i_35_);
		float f_52_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 112).method2714();
		float f_53_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 122).method2716();
		class47.aClass384_442.method6518();
		class47.aClass384_442.aFloatArray4667[0] = (f_31_ - f) * 2.0F / f_52_;
		class47.aClass384_442.aFloatArray4667[1] = (f_32_ - f_30_) * 2.0F / f_53_;
		class47.aClass384_442.aFloatArray4667[4] = (f_33_ - f) * 2.0F / f_52_;
		class47.aClass384_442.aFloatArray4667[5] = (f_34_ - f_30_) * 2.0F / f_53_;
		class47.aClass384_442.aFloatArray4667[12] = ((f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_52_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = ((f_30_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_53_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public void method2750(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		int[] is = ((Class160_Sub3) this).aClass505_Sub2_9052.ab(i_57_, i_58_, i_55_, i_56_);
		if (is != null) {
			for (int i_59_ = 0; i_59_ < is.length; i_59_++)
				is[i_59_] |= ~0xffffff;
			method14425(i, i_54_, i_55_, i_56_, is, 0, i_55_);
		}
	}

	public int method2747() {
		return ((Class160_Sub3) this).anInt9060;
	}

	public int method2786() {
		return ((Class160_Sub3) this).anInt9060;
	}

	public int method2793() {
		return ((Class160_Sub3) this).anInt9053;
	}

	void method2764(float f, float f_60_, float f_61_, float f_62_, float f_63_, float f_64_, int i, int i_65_, int i_66_, int i_67_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_66_);
		if (((Class160_Sub3) this).aBool9051) {
			float f_68_ = (float) method228();
			float f_69_ = (float) method2748();
			float f_70_ = (f_61_ - f) / f_68_;
			float f_71_ = (f_62_ - f_60_) / f_68_;
			float f_72_ = (f_63_ - f) / f_69_;
			float f_73_ = (f_64_ - f_60_) / f_69_;
			float f_74_ = f_72_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_75_ = f_73_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_76_ = f_70_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_77_ = f_71_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_78_ = -f_70_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_79_ = -f_71_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_80_ = -f_72_ * (float) ((Class160_Sub3) this).anInt9049;
			float f_81_ = -f_73_ * (float) ((Class160_Sub3) this).anInt9049;
			f = f + f_76_ + f_74_;
			f_60_ = f_60_ + f_77_ + f_75_;
			f_61_ = f_61_ + f_78_ + f_74_;
			f_62_ = f_62_ + f_79_ + f_75_;
			f_63_ = f_63_ + f_76_ + f_80_;
			f_64_ = f_64_ + f_77_ + f_81_;
		}
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i, i_65_);
		float f_82_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 126).method2714();
		float f_83_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 123).method2716();
		class47.aClass384_442.method6518();
		class47.aClass384_442.aFloatArray4667[0] = (f_61_ - f) * 2.0F / f_82_;
		class47.aClass384_442.aFloatArray4667[1] = (f_62_ - f_60_) * 2.0F / f_83_;
		class47.aClass384_442.aFloatArray4667[4] = (f_63_ - f) * 2.0F / f_82_;
		class47.aClass384_442.aFloatArray4667[5] = (f_64_ - f_60_) * 2.0F / f_83_;
		class47.aClass384_442.aFloatArray4667[12] = ((f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_82_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = ((f_60_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_83_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public Interface9 method2808() {
		return ((Class160_Sub3) this).anInterface9_9054;
	}

	public void method2768(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_) {
		int[] is = ((Class160_Sub3) this).aClass505_Sub2_9052.ab(i_87_, i_88_, i_85_, i_86_);
		if (is != null) {
			for (int i_89_ = 0; i_89_ < is.length; i_89_++)
				is[i_89_] |= ~0xffffff;
			method14425(i, i_84_, i_85_, i_86_, is, 0, i_85_);
		}
	}

	public void method2774(int i, int i_90_, Class455 class455, int i_91_, int i_92_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(1, -1);
		i += ((Class160_Sub3) this).anInt9055;
		i_90_ += ((Class160_Sub3) this).anInt9057;
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 115).method2714();
		float f_93_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 104).method2716();
		class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_93_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_90_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_93_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		Interface6 interface6 = ((Class455_Sub1) (Class455_Sub1) class455).anInterface6_8508;
		class47.anInterface6_441 = interface6;
		class47.aClass384_444.method6525(interface6.method47((float) ((Class160_Sub3) this).anInt9060), interface6.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.aClass384_444.aFloatArray4667[12] = interface6.method47((float) (i - i_91_));
		class47.aClass384_444.aFloatArray4667[13] = interface6.method62((float) (i_90_ - i_92_));
		class47.method938();
	}

	public void method2773(int i, int i_94_, Class455 class455, int i_95_, int i_96_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(1, -1);
		i += ((Class160_Sub3) this).anInt9055;
		i_94_ += ((Class160_Sub3) this).anInt9057;
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 121).method2714();
		float f_97_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 125).method2716();
		class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_97_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_94_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_97_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		Interface6 interface6 = ((Class455_Sub1) (Class455_Sub1) class455).anInterface6_8508;
		class47.anInterface6_441 = interface6;
		class47.aClass384_444.method6525(interface6.method47((float) ((Class160_Sub3) this).anInt9060), interface6.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.aClass384_444.aFloatArray4667[12] = interface6.method47((float) (i - i_95_));
		class47.aClass384_444.aFloatArray4667[13] = interface6.method62((float) (i_94_ - i_96_));
		class47.method938();
	}

	public Interface9 method2801() {
		return ((Class160_Sub3) this).anInterface9_9054;
	}

	public void method2772(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_103_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_101_, i_102_);
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 116).method2714();
		float f_104_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 122).method2716();
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		boolean bool = (((Class160_Sub3) this).aBool9062 && ((Class160_Sub3) this).anInt9057 == 0 && ((Class160_Sub3) this).anInt9049 == 0);
		boolean bool_105_ = (((Class160_Sub3) this).aBool9061 && ((Class160_Sub3) this).anInt9055 == 0 && ((Class160_Sub3) this).anInt9058 == 0);
		if (bool_105_ & bool) {
			class47.aClass384_442.method6525((float) i_99_ * 2.0F / f, (float) i_100_ * 2.0F / f_104_, 1.0F, 1.0F);
			class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
			class47.aClass384_442.aFloatArray4667[13] = (((float) i_98_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_) - 1.0F;
			class47.aClass384_442.aFloatArray4667[14] = -1.0F;
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_99_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_100_), 1.0F, 1.0F);
			class47.method936();
		} else if (bool_105_) {
			int i_106_ = i_98_ + i_100_;
			int i_107_ = method2748();
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_99_), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
			int i_108_ = i_98_ + ((Class160_Sub3) this).anInt9057;
			for (int i_109_ = i_108_ + ((Class160_Sub3) this).anInt9053; i_109_ <= i_106_; i_109_ += i_107_) {
				class47.aClass384_442.method6525((float) i_99_ * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_104_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_108_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
				i_108_ += i_107_;
			}
			if (i_108_ < i_106_) {
				int i_110_ = i_106_ - i_108_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_99_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_110_), 1.0F, 1.0F);
				class47.aClass384_442.method6525((float) i_99_ * 2.0F / f, ((float) i_110_ * 2.0F / f_104_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_108_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
			}
		} else if (bool) {
			int i_111_ = i + i_99_;
			int i_112_ = method228();
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_100_), 1.0F, 1.0F);
			int i_113_ = i + ((Class160_Sub3) this).anInt9055;
			for (int i_114_ = i_113_ + ((Class160_Sub3) this).anInt9060; i_114_ <= i_111_; i_114_ += i_112_) {
				class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) i_100_ * 2.0F / f_104_, 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i_113_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = (((float) i_98_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_) - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
				i_113_ += i_112_;
			}
			if (i_113_ < i_111_) {
				int i_115_ = i_111_ - i_113_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_115_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_100_), 1.0F, 1.0F);
				class47.aClass384_442.method6525((float) i_115_ * 2.0F / f, ((float) i_100_ * 2.0F / f_104_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i_113_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = (((float) i_98_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_) - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
			}
		} else {
			int i_116_ = i_98_ + i_100_;
			int i_117_ = i + i_99_;
			int i_118_ = method228();
			int i_119_ = method2748();
			int i_120_ = i_98_ + ((Class160_Sub3) this).anInt9057;
			for (int i_121_ = i_120_ + ((Class160_Sub3) this).anInt9053; i_121_ <= i_116_; i_121_ += i_119_) {
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
				int i_122_ = i + ((Class160_Sub3) this).anInt9055;
				for (int i_123_ = i_122_ + ((Class160_Sub3) this).anInt9060; i_123_ <= i_117_; i_123_ += i_118_) {
					class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_104_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_122_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_120_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
					i_122_ += i_118_;
				}
				if (i_122_ < i_117_) {
					int i_124_ = i_117_ - i_122_;
					class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_124_), (((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053)), 1.0F, 1.0F);
					class47.aClass384_442.method6525((float) i_124_ * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_104_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_122_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_120_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
				}
				i_120_ += i_119_;
			}
			if (i_120_ < i_116_) {
				int i_125_ = i_116_ - i_120_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_125_), 1.0F, 1.0F);
				int i_126_ = i + ((Class160_Sub3) this).anInt9055;
				for (int i_127_ = i_126_ + ((Class160_Sub3) this).anInt9060; i_127_ <= i_117_; i_127_ += i_118_) {
					class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) i_125_ * 2.0F / f_104_, 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_126_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_120_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
					i_126_ += i_118_;
				}
				if (i_126_ < i_117_) {
					int i_128_ = i_117_ - i_126_;
					class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_128_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_125_), 1.0F, 1.0F);
					class47.aClass384_442.method6525((float) i_128_ * 2.0F / f, ((float) i_125_ * 2.0F / f_104_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_126_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_120_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_104_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
				}
			}
		}
	}

	public int method2792() {
		return (((Class160_Sub3) this).anInt9053 + ((Class160_Sub3) this).anInt9057 + ((Class160_Sub3) this).anInt9049);
	}

	void method2766(float f, float f_129_, float f_130_, float f_131_, float f_132_, float f_133_, int i, Class455 class455, int i_134_, int i_135_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(1, -1);
		float f_136_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 105).method2714();
		float f_137_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 110).method2716();
		class47.aClass384_442.method6518();
		if (((Class160_Sub3) this).aBool9051) {
			float f_138_ = ((float) ((Class160_Sub3) this).anInt9060 / (float) method228());
			float f_139_ = ((float) ((Class160_Sub3) this).anInt9053 / (float) method2748());
			class47.aClass384_442.aFloatArray4667[0] = (f_130_ - f) * f_138_;
			class47.aClass384_442.aFloatArray4667[1] = (f_131_ - f_129_) * f_138_;
			class47.aClass384_442.aFloatArray4667[4] = (f_132_ - f) * f_139_;
			class47.aClass384_442.aFloatArray4667[5] = (f_133_ - f_129_) * f_139_;
			class47.aClass384_442.aFloatArray4667[12] = ((f + (float) ((Class160_Sub3) this).anInt9055) * f_138_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
			class47.aClass384_442.aFloatArray4667[13] = ((f_129_ + (float) ((Class160_Sub3) this).anInt9057) * f_139_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
		} else {
			class47.aClass384_442.aFloatArray4667[0] = f_130_ - f;
			class47.aClass384_442.aFloatArray4667[1] = f_131_ - f_129_;
			class47.aClass384_442.aFloatArray4667[4] = f_132_ - f;
			class47.aClass384_442.aFloatArray4667[5] = f_133_ - f_129_;
			class47.aClass384_442.aFloatArray4667[12] = f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905();
			class47.aClass384_442.aFloatArray4667[13] = (f_129_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
		}
		Class384 class384 = ((Class160_Sub3) this).aClass505_Sub2_9052.aClass384_8683;
		class384.method6518();
		class384.aFloatArray4667[0] = 2.0F / f_136_;
		class384.aFloatArray4667[5] = 2.0F / f_137_;
		class384.aFloatArray4667[12] = -1.0F;
		class384.aFloatArray4667[13] = -1.0F;
		class384.aFloatArray4667[14] = -1.0F;
		class47.aClass384_442.method6523(class384);
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		Interface6 interface6 = ((Class455_Sub1) (Class455_Sub1) class455).anInterface6_8508;
		class47.anInterface6_441 = interface6;
		class47.aClass384_444.method6518();
		class47.aClass384_444.aFloatArray4667[0] = (f_130_ - f) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[1] = (f_131_ - f_129_) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[4] = (f_132_ - f) * interface6.method62(1.0F);
		class47.aClass384_444.aFloatArray4667[5] = (f_133_ - f_129_) * interface6.method62(1.0F);
		class47.aClass384_444.aFloatArray4667[12] = (f - (float) i_134_) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[13] = (f_129_ - (float) i_135_) * interface6.method62(1.0F);
		class47.method938();
	}

	public void method2796(int i, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_145_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_143_, i_144_);
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 109).method2714();
		float f_146_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 120).method2716();
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		boolean bool = (((Class160_Sub3) this).aBool9062 && ((Class160_Sub3) this).anInt9057 == 0 && ((Class160_Sub3) this).anInt9049 == 0);
		boolean bool_147_ = (((Class160_Sub3) this).aBool9061 && ((Class160_Sub3) this).anInt9055 == 0 && ((Class160_Sub3) this).anInt9058 == 0);
		if (bool_147_ & bool) {
			class47.aClass384_442.method6525((float) i_141_ * 2.0F / f, (float) i_142_ * 2.0F / f_146_, 1.0F, 1.0F);
			class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
			class47.aClass384_442.aFloatArray4667[13] = (((float) i_140_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_) - 1.0F;
			class47.aClass384_442.aFloatArray4667[14] = -1.0F;
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_141_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_142_), 1.0F, 1.0F);
			class47.method936();
		} else if (bool_147_) {
			int i_148_ = i_140_ + i_142_;
			int i_149_ = method2748();
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_141_), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
			int i_150_ = i_140_ + ((Class160_Sub3) this).anInt9057;
			for (int i_151_ = i_150_ + ((Class160_Sub3) this).anInt9053; i_151_ <= i_148_; i_151_ += i_149_) {
				class47.aClass384_442.method6525((float) i_141_ * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_146_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_150_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
				i_150_ += i_149_;
			}
			if (i_150_ < i_148_) {
				int i_152_ = i_148_ - i_150_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_141_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_152_), 1.0F, 1.0F);
				class47.aClass384_442.method6525((float) i_141_ * 2.0F / f, ((float) i_152_ * 2.0F / f_146_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_150_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
			}
		} else if (bool) {
			int i_153_ = i + i_141_;
			int i_154_ = method228();
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_142_), 1.0F, 1.0F);
			int i_155_ = i + ((Class160_Sub3) this).anInt9055;
			for (int i_156_ = i_155_ + ((Class160_Sub3) this).anInt9060; i_156_ <= i_153_; i_156_ += i_154_) {
				class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) i_142_ * 2.0F / f_146_, 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i_155_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_140_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
				i_155_ += i_154_;
			}
			if (i_155_ < i_153_) {
				int i_157_ = i_153_ - i_155_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_157_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_142_), 1.0F, 1.0F);
				class47.aClass384_442.method6525((float) i_157_ * 2.0F / f, ((float) i_142_ * 2.0F / f_146_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i_155_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_140_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
			}
		} else {
			int i_158_ = i_140_ + i_142_;
			int i_159_ = i + i_141_;
			int i_160_ = method228();
			int i_161_ = method2748();
			int i_162_ = i_140_ + ((Class160_Sub3) this).anInt9057;
			for (int i_163_ = i_162_ + ((Class160_Sub3) this).anInt9053; i_163_ <= i_158_; i_163_ += i_161_) {
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
				int i_164_ = i + ((Class160_Sub3) this).anInt9055;
				for (int i_165_ = i_164_ + ((Class160_Sub3) this).anInt9060; i_165_ <= i_159_; i_165_ += i_160_) {
					class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_146_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_164_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_162_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
					i_164_ += i_160_;
				}
				if (i_164_ < i_159_) {
					int i_166_ = i_159_ - i_164_;
					class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_166_), (((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053)), 1.0F, 1.0F);
					class47.aClass384_442.method6525((float) i_166_ * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_146_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_164_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_162_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
				}
				i_162_ += i_161_;
			}
			if (i_162_ < i_158_) {
				int i_167_ = i_158_ - i_162_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_167_), 1.0F, 1.0F);
				int i_168_ = i + ((Class160_Sub3) this).anInt9055;
				for (int i_169_ = i_168_ + ((Class160_Sub3) this).anInt9060; i_169_ <= i_159_; i_169_ += i_160_) {
					class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) i_167_ * 2.0F / f_146_, 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_168_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_162_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
					i_168_ += i_160_;
				}
				if (i_168_ < i_159_) {
					int i_170_ = i_159_ - i_168_;
					class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_170_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_167_), 1.0F, 1.0F);
					class47.aClass384_442.method6525((float) i_170_ * 2.0F / f, ((float) i_167_ * 2.0F / f_146_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_168_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_162_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_146_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
				}
			}
		}
	}

	public void method2742(int i, int i_171_, int i_172_, int i_173_, int i_174_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_174_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_172_, i_173_);
		i += ((Class160_Sub3) this).anInt9055;
		i_171_ += ((Class160_Sub3) this).anInt9057;
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 114).method2714();
		float f_175_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 112).method2716();
		class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_175_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_171_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_175_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public void method2769(int i, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_) {
		int[] is = ((Class160_Sub3) this).aClass505_Sub2_9052.ab(i_179_, i_180_, i_177_, i_178_);
		if (is != null) {
			for (int i_181_ = 0; i_181_ < is.length; i_181_++)
				is[i_181_] |= ~0xffffff;
			method14425(i, i_176_, i_177_, i_178_, is, 0, i_177_);
		}
	}

	public void method2770(int i, int i_182_, int i_183_) {
		int[] is = (((Class160_Sub3) this).aClass505_Sub2_9052.ab(i, i_182_, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053));
		int[] is_184_ = new int[(((Class160_Sub3) this).anInt9060 * ((Class160_Sub3) this).anInt9053)];
		((Class160_Sub3) this).anInterface6_9050.method53(0, 0, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053, is_184_, 0);
		if (i_183_ == 0) {
			for (int i_185_ = 0; i_185_ < ((Class160_Sub3) this).anInt9053; i_185_++) {
				int i_186_ = i_185_ * ((Class160_Sub3) this).anInt9060;
				for (int i_187_ = 0; i_187_ < ((Class160_Sub3) this).anInt9060; i_187_++)
					is_184_[i_186_ + i_187_] = (is_184_[i_186_ + i_187_] & 0xffffff | is[i_186_ + i_187_] << 8 & ~0xffffff);
			}
		} else if (i_183_ == 1) {
			for (int i_188_ = 0; i_188_ < ((Class160_Sub3) this).anInt9053; i_188_++) {
				int i_189_ = i_188_ * ((Class160_Sub3) this).anInt9060;
				for (int i_190_ = 0; i_190_ < ((Class160_Sub3) this).anInt9060; i_190_++)
					is_184_[i_189_ + i_190_] = (is_184_[i_189_ + i_190_] & 0xffffff | is[i_189_ + i_190_] << 16 & ~0xffffff);
			}
		} else if (i_183_ == 2) {
			for (int i_191_ = 0; i_191_ < ((Class160_Sub3) this).anInt9053; i_191_++) {
				int i_192_ = i_191_ * ((Class160_Sub3) this).anInt9060;
				for (int i_193_ = 0; i_193_ < ((Class160_Sub3) this).anInt9060; i_193_++)
					is_184_[i_192_ + i_193_] = (is_184_[i_192_ + i_193_] & 0xffffff | is[i_192_ + i_193_] << 24 & ~0xffffff);
			}
		} else if (i_183_ == 3) {
			for (int i_194_ = 0; i_194_ < ((Class160_Sub3) this).anInt9053; i_194_++) {
				int i_195_ = i_194_ * ((Class160_Sub3) this).anInt9060;
				for (int i_196_ = 0; i_196_ < ((Class160_Sub3) this).anInt9060; i_196_++)
					is_184_[i_195_ + i_196_] = (is_184_[i_195_ + i_196_] & 0xffffff | (is[i_195_ + i_196_] != 0 ? -16777216 : 0));
			}
		}
		method14425(0, 0, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053, is_184_, 0, ((Class160_Sub3) this).anInt9060);
	}

	public void method2783(int i, int i_197_, int i_198_, int i_199_) {
		((Class160_Sub3) this).anInt9055 = i;
		((Class160_Sub3) this).anInt9057 = i_197_;
		((Class160_Sub3) this).anInt9058 = i_198_;
		((Class160_Sub3) this).anInt9049 = i_199_;
		((Class160_Sub3) this).aBool9051 = (((Class160_Sub3) this).anInt9055 != 0 || ((Class160_Sub3) this).anInt9057 != 0 || ((Class160_Sub3) this).anInt9058 != 0 || ((Class160_Sub3) this).anInt9049 != 0);
	}

	void method14425(int i, int i_200_, int i_201_, int i_202_, int[] is, int i_203_, int i_204_) {
		((Class160_Sub3) this).anInterface6_9050.method48(i, i_200_, i_201_, i_202_, is, i_203_, i_204_);
	}

	public void method2784(int i, int i_205_, Class455 class455, int i_206_, int i_207_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(1, -1);
		i += ((Class160_Sub3) this).anInt9055;
		i_205_ += ((Class160_Sub3) this).anInt9057;
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 113).method2714();
		float f_208_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 122).method2716();
		class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_208_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_205_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_208_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		Interface6 interface6 = ((Class455_Sub1) (Class455_Sub1) class455).anInterface6_8508;
		class47.anInterface6_441 = interface6;
		class47.aClass384_444.method6525(interface6.method47((float) ((Class160_Sub3) this).anInt9060), interface6.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.aClass384_444.aFloatArray4667[12] = interface6.method47((float) (i - i_206_));
		class47.aClass384_444.aFloatArray4667[13] = interface6.method62((float) (i_205_ - i_207_));
		class47.method938();
	}

	public int method2757() {
		return (((Class160_Sub3) this).anInt9053 + ((Class160_Sub3) this).anInt9057 + ((Class160_Sub3) this).anInt9049);
	}

	public void method2743(int i, int i_209_, int i_210_, int i_211_) {
		((Class160_Sub3) this).anInt9055 = i;
		((Class160_Sub3) this).anInt9057 = i_209_;
		((Class160_Sub3) this).anInt9058 = i_210_;
		((Class160_Sub3) this).anInt9049 = i_211_;
		((Class160_Sub3) this).aBool9051 = (((Class160_Sub3) this).anInt9055 != 0 || ((Class160_Sub3) this).anInt9057 != 0 || ((Class160_Sub3) this).anInt9058 != 0 || ((Class160_Sub3) this).anInt9049 != 0);
	}

	void method2787(int i, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_217_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_215_, i_216_);
		if (((Class160_Sub3) this).aBool9051) {
			i_213_ = i_213_ * ((Class160_Sub3) this).anInt9060 / method228();
			i_214_ = i_214_ * ((Class160_Sub3) this).anInt9053 / method2748();
			i += (((Class160_Sub3) this).anInt9055 * i_213_ / ((Class160_Sub3) this).anInt9060);
			i_212_ += (((Class160_Sub3) this).anInt9057 * i_214_ / ((Class160_Sub3) this).anInt9053);
		}
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 115).method2714();
		float f_219_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 123).method2716();
		class47.aClass384_442.method6525((float) i_213_ * 2.0F / f, (float) i_214_ * 2.0F / f_219_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_212_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_219_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public void method2749(int i, int i_220_, int i_221_, int i_222_, int i_223_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_223_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_221_, i_222_);
		i += ((Class160_Sub3) this).anInt9055;
		i_220_ += ((Class160_Sub3) this).anInt9057;
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 106).method2714();
		float f_224_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 106).method2716();
		class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_224_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_220_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_224_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public void method2778(int i, int i_225_, int i_226_, int i_227_, int i_228_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_228_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_226_, i_227_);
		i += ((Class160_Sub3) this).anInt9055;
		i_225_ += ((Class160_Sub3) this).anInt9057;
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 113).method2714();
		float f_229_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 110).method2716();
		class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_229_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_225_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_229_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	void method2775(int i, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_235_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_233_, i_234_);
		if (((Class160_Sub3) this).aBool9051) {
			i_231_ = i_231_ * ((Class160_Sub3) this).anInt9060 / method228();
			i_232_ = i_232_ * ((Class160_Sub3) this).anInt9053 / method2748();
			i += (((Class160_Sub3) this).anInt9055 * i_231_ / ((Class160_Sub3) this).anInt9060);
			i_230_ += (((Class160_Sub3) this).anInt9057 * i_232_ / ((Class160_Sub3) this).anInt9053);
		}
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 115).method2714();
		float f_237_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 120).method2716();
		class47.aClass384_442.method6525((float) i_231_ * 2.0F / f, (float) i_232_ * 2.0F / f_237_, 1.0F, 1.0F);
		class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = (((float) i_230_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_237_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	public int method2794() {
		return ((Class160_Sub3) this).anInt9060;
	}

	public void method2781(int i, int i_238_, int i_239_, int i_240_) {
		((Class160_Sub3) this).anInt9055 = i;
		((Class160_Sub3) this).anInt9057 = i_238_;
		((Class160_Sub3) this).anInt9058 = i_239_;
		((Class160_Sub3) this).anInt9049 = i_240_;
		((Class160_Sub3) this).aBool9051 = (((Class160_Sub3) this).anInt9055 != 0 || ((Class160_Sub3) this).anInt9057 != 0 || ((Class160_Sub3) this).anInt9058 != 0 || ((Class160_Sub3) this).anInt9049 != 0);
	}

	public void method2782(int[] is) {
		is[0] = ((Class160_Sub3) this).anInt9055;
		is[1] = ((Class160_Sub3) this).anInt9057;
		is[2] = ((Class160_Sub3) this).anInt9058;
		is[3] = ((Class160_Sub3) this).anInt9049;
	}

	public void method2804(int[] is) {
		is[0] = ((Class160_Sub3) this).anInt9055;
		is[1] = ((Class160_Sub3) this).anInt9057;
		is[2] = ((Class160_Sub3) this).anInt9058;
		is[3] = ((Class160_Sub3) this).anInt9049;
	}

	public void method2777(int[] is) {
		is[0] = ((Class160_Sub3) this).anInt9055;
		is[1] = ((Class160_Sub3) this).anInt9057;
		is[2] = ((Class160_Sub3) this).anInt9058;
		is[3] = ((Class160_Sub3) this).anInt9049;
	}

	public void method2785(int[] is) {
		is[0] = ((Class160_Sub3) this).anInt9055;
		is[1] = ((Class160_Sub3) this).anInt9057;
		is[2] = ((Class160_Sub3) this).anInt9058;
		is[3] = ((Class160_Sub3) this).anInt9049;
	}

	public int method225() {
		return (((Class160_Sub3) this).anInt9060 + ((Class160_Sub3) this).anInt9055 + ((Class160_Sub3) this).anInt9058);
	}

	Class160_Sub3(Class505_Sub2 class505_sub2, int i, int i_241_, int[] is, int i_242_, int i_243_) {
		((Class160_Sub3) this).anInt9055 = 0;
		((Class160_Sub3) this).anInt9049 = 0;
		((Class160_Sub3) this).anInt9058 = 0;
		((Class160_Sub3) this).aClass505_Sub2_9052 = class505_sub2;
		((Class160_Sub3) this).anInt9060 = i;
		((Class160_Sub3) this).anInt9053 = i_241_;
		((Class160_Sub3) this).anInterface9_9054 = null;
		((Class160_Sub3) this).anInterface6_9050 = class505_sub2.method14094(i, i_241_, false, is, i_242_, i_243_);
		((Class160_Sub3) this).anInterface6_9050.method50(true, true);
		((Class160_Sub3) this).aBool9059 = ((Class160_Sub3) this).anInterface6_9050.method1() != i;
		((Class160_Sub3) this).aBool9056 = ((Class160_Sub3) this).anInterface6_9050.method59() != i_241_;
		((Class160_Sub3) this).aBool9061 = (!((Class160_Sub3) this).aBool9059 && ((Class160_Sub3) this).anInterface6_9050.method46());
		((Class160_Sub3) this).aBool9062 = (!((Class160_Sub3) this).aBool9056 && ((Class160_Sub3) this).anInterface6_9050.method46());
		((Class160_Sub3) this).aClass505_Sub2_9052.method13896(12);
	}

	public int method2788() {
		return ((Class160_Sub3) this).anInt9053;
	}

	public int method2748() {
		return (((Class160_Sub3) this).anInt9053 + ((Class160_Sub3) this).anInt9057 + ((Class160_Sub3) this).anInt9049);
	}

	public int method227() {
		return (((Class160_Sub3) this).anInt9060 + ((Class160_Sub3) this).anInt9055 + ((Class160_Sub3) this).anInt9058);
	}

	public void method2771(int i, int i_244_, int i_245_) {
		int[] is = (((Class160_Sub3) this).aClass505_Sub2_9052.ab(i, i_244_, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053));
		int[] is_246_ = new int[(((Class160_Sub3) this).anInt9060 * ((Class160_Sub3) this).anInt9053)];
		((Class160_Sub3) this).anInterface6_9050.method53(0, 0, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053, is_246_, 0);
		if (i_245_ == 0) {
			for (int i_247_ = 0; i_247_ < ((Class160_Sub3) this).anInt9053; i_247_++) {
				int i_248_ = i_247_ * ((Class160_Sub3) this).anInt9060;
				for (int i_249_ = 0; i_249_ < ((Class160_Sub3) this).anInt9060; i_249_++)
					is_246_[i_248_ + i_249_] = (is_246_[i_248_ + i_249_] & 0xffffff | is[i_248_ + i_249_] << 8 & ~0xffffff);
			}
		} else if (i_245_ == 1) {
			for (int i_250_ = 0; i_250_ < ((Class160_Sub3) this).anInt9053; i_250_++) {
				int i_251_ = i_250_ * ((Class160_Sub3) this).anInt9060;
				for (int i_252_ = 0; i_252_ < ((Class160_Sub3) this).anInt9060; i_252_++)
					is_246_[i_251_ + i_252_] = (is_246_[i_251_ + i_252_] & 0xffffff | is[i_251_ + i_252_] << 16 & ~0xffffff);
			}
		} else if (i_245_ == 2) {
			for (int i_253_ = 0; i_253_ < ((Class160_Sub3) this).anInt9053; i_253_++) {
				int i_254_ = i_253_ * ((Class160_Sub3) this).anInt9060;
				for (int i_255_ = 0; i_255_ < ((Class160_Sub3) this).anInt9060; i_255_++)
					is_246_[i_254_ + i_255_] = (is_246_[i_254_ + i_255_] & 0xffffff | is[i_254_ + i_255_] << 24 & ~0xffffff);
			}
		} else if (i_245_ == 3) {
			for (int i_256_ = 0; i_256_ < ((Class160_Sub3) this).anInt9053; i_256_++) {
				int i_257_ = i_256_ * ((Class160_Sub3) this).anInt9060;
				for (int i_258_ = 0; i_258_ < ((Class160_Sub3) this).anInt9060; i_258_++)
					is_246_[i_257_ + i_258_] = (is_246_[i_257_ + i_258_] & 0xffffff | (is[i_257_ + i_258_] != 0 ? -16777216 : 0));
			}
		}
		method14425(0, 0, ((Class160_Sub3) this).anInt9060, ((Class160_Sub3) this).anInt9053, is_246_, 0, ((Class160_Sub3) this).anInt9060);
	}

	public int method226() {
		return (((Class160_Sub3) this).anInt9060 + ((Class160_Sub3) this).anInt9055 + ((Class160_Sub3) this).anInt9058);
	}

	public int method229() {
		return (((Class160_Sub3) this).anInt9060 + ((Class160_Sub3) this).anInt9055 + ((Class160_Sub3) this).anInt9058);
	}

	public void method2744(int[] is) {
		is[0] = ((Class160_Sub3) this).anInt9055;
		is[1] = ((Class160_Sub3) this).anInt9057;
		is[2] = ((Class160_Sub3) this).anInt9058;
		is[3] = ((Class160_Sub3) this).anInt9049;
	}

	public void method2780(int i, int i_259_, int i_260_, int i_261_) {
		((Class160_Sub3) this).anInt9055 = i;
		((Class160_Sub3) this).anInt9057 = i_259_;
		((Class160_Sub3) this).anInt9058 = i_260_;
		((Class160_Sub3) this).anInt9049 = i_261_;
		((Class160_Sub3) this).aBool9051 = (((Class160_Sub3) this).anInt9055 != 0 || ((Class160_Sub3) this).anInt9057 != 0 || ((Class160_Sub3) this).anInt9058 != 0 || ((Class160_Sub3) this).anInt9049 != 0);
	}

	public int method2753() {
		return (((Class160_Sub3) this).anInt9053 + ((Class160_Sub3) this).anInt9057 + ((Class160_Sub3) this).anInt9049);
	}

	public void method2799(int i, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_267_);
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i_265_, i_266_);
		float f = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 118).method2714();
		float f_268_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 112).method2716();
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		boolean bool = (((Class160_Sub3) this).aBool9062 && ((Class160_Sub3) this).anInt9057 == 0 && ((Class160_Sub3) this).anInt9049 == 0);
		boolean bool_269_ = (((Class160_Sub3) this).aBool9061 && ((Class160_Sub3) this).anInt9055 == 0 && ((Class160_Sub3) this).anInt9058 == 0);
		if (bool_269_ & bool) {
			class47.aClass384_442.method6525((float) i_263_ * 2.0F / f, (float) i_264_ * 2.0F / f_268_, 1.0F, 1.0F);
			class47.aClass384_442.aFloatArray4667[12] = (((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f) - 1.0F;
			class47.aClass384_442.aFloatArray4667[13] = (((float) i_262_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_) - 1.0F;
			class47.aClass384_442.aFloatArray4667[14] = -1.0F;
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_263_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_264_), 1.0F, 1.0F);
			class47.method936();
		} else if (bool_269_) {
			int i_270_ = i_262_ + i_264_;
			int i_271_ = method2748();
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_263_), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
			int i_272_ = i_262_ + ((Class160_Sub3) this).anInt9057;
			for (int i_273_ = i_272_ + ((Class160_Sub3) this).anInt9053; i_273_ <= i_270_; i_273_ += i_271_) {
				class47.aClass384_442.method6525((float) i_263_ * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_268_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_272_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
				i_272_ += i_271_;
			}
			if (i_272_ < i_270_) {
				int i_274_ = i_270_ - i_272_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_263_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_274_), 1.0F, 1.0F);
				class47.aClass384_442.method6525((float) i_263_ * 2.0F / f, ((float) i_274_ * 2.0F / f_268_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_272_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
			}
		} else if (bool) {
			int i_275_ = i + i_263_;
			int i_276_ = method228();
			class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_264_), 1.0F, 1.0F);
			int i_277_ = i + ((Class160_Sub3) this).anInt9055;
			for (int i_278_ = i_277_ + ((Class160_Sub3) this).anInt9060; i_278_ <= i_275_; i_278_ += i_276_) {
				class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) i_264_ * 2.0F / f_268_, 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i_277_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_262_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
				i_277_ += i_276_;
			}
			if (i_277_ < i_275_) {
				int i_279_ = i_275_ - i_277_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_279_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_264_), 1.0F, 1.0F);
				class47.aClass384_442.method6525((float) i_279_ * 2.0F / f, ((float) i_264_ * 2.0F / f_268_), 1.0F, 1.0F);
				class47.aClass384_442.aFloatArray4667[12] = ((float) i_277_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
				class47.aClass384_442.aFloatArray4667[13] = ((float) i_262_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
				class47.aClass384_442.aFloatArray4667[14] = -1.0F;
				class47.method936();
			}
		} else {
			int i_280_ = i_262_ + i_264_;
			int i_281_ = i + i_263_;
			int i_282_ = method228();
			int i_283_ = method2748();
			int i_284_ = i_262_ + ((Class160_Sub3) this).anInt9057;
			for (int i_285_ = i_284_ + ((Class160_Sub3) this).anInt9053; i_285_ <= i_280_; i_285_ += i_283_) {
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
				int i_286_ = i + ((Class160_Sub3) this).anInt9055;
				for (int i_287_ = i_286_ + ((Class160_Sub3) this).anInt9060; i_287_ <= i_281_; i_287_ += i_282_) {
					class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_268_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_286_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_284_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
					i_286_ += i_282_;
				}
				if (i_286_ < i_281_) {
					int i_288_ = i_281_ - i_286_;
					class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_288_), (((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053)), 1.0F, 1.0F);
					class47.aClass384_442.method6525((float) i_288_ * 2.0F / f, ((float) ((Class160_Sub3) this).anInt9053 * 2.0F / f_268_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_286_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_284_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
				}
				i_284_ += i_283_;
			}
			if (i_284_ < i_280_) {
				int i_289_ = i_280_ - i_284_;
				class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_289_), 1.0F, 1.0F);
				int i_290_ = i + ((Class160_Sub3) this).anInt9055;
				for (int i_291_ = i_290_ + ((Class160_Sub3) this).anInt9060; i_291_ <= i_281_; i_291_ += i_282_) {
					class47.aClass384_442.method6525((float) ((Class160_Sub3) this).anInt9060 * 2.0F / f, (float) i_289_ * 2.0F / f_268_, 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_290_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_284_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
					i_290_ += i_282_;
				}
				if (i_290_ < i_281_) {
					int i_292_ = i_281_ - i_290_;
					class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) i_292_), ((Class160_Sub3) this).anInterface6_9050.method62((float) i_289_), 1.0F, 1.0F);
					class47.aClass384_442.method6525((float) i_292_ * 2.0F / f, ((float) i_289_ * 2.0F / f_268_), 1.0F, 1.0F);
					class47.aClass384_442.aFloatArray4667[12] = ((float) i_290_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f - 1.0F;
					class47.aClass384_442.aFloatArray4667[13] = ((float) i_284_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_268_ - 1.0F;
					class47.aClass384_442.aFloatArray4667[14] = -1.0F;
					class47.method936();
				}
			}
		}
	}

	public int method228() {
		return (((Class160_Sub3) this).anInt9060 + ((Class160_Sub3) this).anInt9055 + ((Class160_Sub3) this).anInt9058);
	}

	void method2791(float f, float f_293_, float f_294_, float f_295_, float f_296_, float f_297_, int i, int i_298_, int i_299_, int i_300_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_299_);
		if (((Class160_Sub3) this).aBool9051) {
			float f_301_ = (float) method228();
			float f_302_ = (float) method2748();
			float f_303_ = (f_294_ - f) / f_301_;
			float f_304_ = (f_295_ - f_293_) / f_301_;
			float f_305_ = (f_296_ - f) / f_302_;
			float f_306_ = (f_297_ - f_293_) / f_302_;
			float f_307_ = f_305_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_308_ = f_306_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_309_ = f_303_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_310_ = f_304_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_311_ = -f_303_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_312_ = -f_304_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_313_ = -f_305_ * (float) ((Class160_Sub3) this).anInt9049;
			float f_314_ = -f_306_ * (float) ((Class160_Sub3) this).anInt9049;
			f = f + f_309_ + f_307_;
			f_293_ = f_293_ + f_310_ + f_308_;
			f_294_ = f_294_ + f_311_ + f_307_;
			f_295_ = f_295_ + f_312_ + f_308_;
			f_296_ = f_296_ + f_309_ + f_313_;
			f_297_ = f_297_ + f_310_ + f_314_;
		}
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i, i_298_);
		float f_315_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 106).method2714();
		float f_316_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 105).method2716();
		class47.aClass384_442.method6518();
		class47.aClass384_442.aFloatArray4667[0] = (f_294_ - f) * 2.0F / f_315_;
		class47.aClass384_442.aFloatArray4667[1] = (f_295_ - f_293_) * 2.0F / f_316_;
		class47.aClass384_442.aFloatArray4667[4] = (f_296_ - f) * 2.0F / f_315_;
		class47.aClass384_442.aFloatArray4667[5] = (f_297_ - f_293_) * 2.0F / f_316_;
		class47.aClass384_442.aFloatArray4667[12] = ((f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_315_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = ((f_293_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_316_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	Class160_Sub3(Class505_Sub2 class505_sub2, int i, int i_317_, boolean bool, boolean bool_318_) {
		((Class160_Sub3) this).anInt9055 = 0;
		((Class160_Sub3) this).anInt9049 = 0;
		((Class160_Sub3) this).anInt9058 = 0;
		((Class160_Sub3) this).aClass505_Sub2_9052 = class505_sub2;
		((Class160_Sub3) this).anInt9060 = i;
		((Class160_Sub3) this).anInt9053 = i_317_;
		if (bool_318_) {
			Interface29 interface29 = class505_sub2.method14064((bool ? Class150.aClass150_1949 : Class150.aClass150_1950), Class76.aClass76_751, i, i_317_);
			((Class160_Sub3) this).anInterface9_9054 = interface29.method200(0);
			((Class160_Sub3) this).anInterface6_9050 = interface29;
		} else {
			((Class160_Sub3) this).anInterface6_9050 = class505_sub2.method14072((bool ? Class150.aClass150_1949 : Class150.aClass150_1950), Class76.aClass76_751, i, i_317_);
			((Class160_Sub3) this).anInterface9_9054 = null;
		}
		((Class160_Sub3) this).anInterface6_9050.method50(true, true);
		((Class160_Sub3) this).aBool9059 = ((Class160_Sub3) this).anInterface6_9050.method1() != i;
		((Class160_Sub3) this).aBool9056 = ((Class160_Sub3) this).anInterface6_9050.method59() != i_317_;
		((Class160_Sub3) this).aBool9061 = (!((Class160_Sub3) this).aBool9059 && ((Class160_Sub3) this).anInterface6_9050.method46());
		((Class160_Sub3) this).aBool9062 = (!((Class160_Sub3) this).aBool9056 && ((Class160_Sub3) this).anInterface6_9050.method46());
		((Class160_Sub3) this).aClass505_Sub2_9052.method13896(12);
	}

	void method2812(float f, float f_319_, float f_320_, float f_321_, float f_322_, float f_323_, int i, int i_324_, int i_325_, int i_326_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		((Class160_Sub3) this).aClass505_Sub2_9052.method13904(i_325_);
		if (((Class160_Sub3) this).aBool9051) {
			float f_327_ = (float) method228();
			float f_328_ = (float) method2748();
			float f_329_ = (f_320_ - f) / f_327_;
			float f_330_ = (f_321_ - f_319_) / f_327_;
			float f_331_ = (f_322_ - f) / f_328_;
			float f_332_ = (f_323_ - f_319_) / f_328_;
			float f_333_ = f_331_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_334_ = f_332_ * (float) ((Class160_Sub3) this).anInt9057;
			float f_335_ = f_329_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_336_ = f_330_ * (float) ((Class160_Sub3) this).anInt9055;
			float f_337_ = -f_329_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_338_ = -f_330_ * (float) ((Class160_Sub3) this).anInt9058;
			float f_339_ = -f_331_ * (float) ((Class160_Sub3) this).anInt9049;
			float f_340_ = -f_332_ * (float) ((Class160_Sub3) this).anInt9049;
			f = f + f_335_ + f_333_;
			f_319_ = f_319_ + f_336_ + f_334_;
			f_320_ = f_320_ + f_337_ + f_333_;
			f_321_ = f_321_ + f_338_ + f_334_;
			f_322_ = f_322_ + f_335_ + f_339_;
			f_323_ = f_323_ + f_336_ + f_340_;
		}
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(i, i_324_);
		float f_341_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 122).method2714();
		float f_342_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 117).method2716();
		class47.aClass384_442.method6518();
		class47.aClass384_442.aFloatArray4667[0] = (f_320_ - f) * 2.0F / f_341_;
		class47.aClass384_442.aFloatArray4667[1] = (f_321_ - f_319_) * 2.0F / f_342_;
		class47.aClass384_442.aFloatArray4667[4] = (f_322_ - f) * 2.0F / f_341_;
		class47.aClass384_442.aFloatArray4667[5] = (f_323_ - f_319_) * 2.0F / f_342_;
		class47.aClass384_442.aFloatArray4667[12] = ((f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_341_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[13] = ((f_319_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905()) * 2.0F / f_342_) - 1.0F;
		class47.aClass384_442.aFloatArray4667[14] = -1.0F;
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		class47.method936();
	}

	void method2800(float f, float f_343_, float f_344_, float f_345_, float f_346_, float f_347_, int i, Class455 class455, int i_348_, int i_349_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(1, -1);
		float f_350_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 103).method2714();
		float f_351_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 112).method2716();
		class47.aClass384_442.method6518();
		if (((Class160_Sub3) this).aBool9051) {
			float f_352_ = ((float) ((Class160_Sub3) this).anInt9060 / (float) method228());
			float f_353_ = ((float) ((Class160_Sub3) this).anInt9053 / (float) method2748());
			class47.aClass384_442.aFloatArray4667[0] = (f_344_ - f) * f_352_;
			class47.aClass384_442.aFloatArray4667[1] = (f_345_ - f_343_) * f_352_;
			class47.aClass384_442.aFloatArray4667[4] = (f_346_ - f) * f_353_;
			class47.aClass384_442.aFloatArray4667[5] = (f_347_ - f_343_) * f_353_;
			class47.aClass384_442.aFloatArray4667[12] = ((f + (float) ((Class160_Sub3) this).anInt9055) * f_352_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
			class47.aClass384_442.aFloatArray4667[13] = ((f_343_ + (float) ((Class160_Sub3) this).anInt9057) * f_353_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
		} else {
			class47.aClass384_442.aFloatArray4667[0] = f_344_ - f;
			class47.aClass384_442.aFloatArray4667[1] = f_345_ - f_343_;
			class47.aClass384_442.aFloatArray4667[4] = f_346_ - f;
			class47.aClass384_442.aFloatArray4667[5] = f_347_ - f_343_;
			class47.aClass384_442.aFloatArray4667[12] = f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905();
			class47.aClass384_442.aFloatArray4667[13] = (f_343_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
		}
		Class384 class384 = ((Class160_Sub3) this).aClass505_Sub2_9052.aClass384_8683;
		class384.method6518();
		class384.aFloatArray4667[0] = 2.0F / f_350_;
		class384.aFloatArray4667[5] = 2.0F / f_351_;
		class384.aFloatArray4667[12] = -1.0F;
		class384.aFloatArray4667[13] = -1.0F;
		class384.aFloatArray4667[14] = -1.0F;
		class47.aClass384_442.method6523(class384);
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		Interface6 interface6 = ((Class455_Sub1) (Class455_Sub1) class455).anInterface6_8508;
		class47.anInterface6_441 = interface6;
		class47.aClass384_444.method6518();
		class47.aClass384_444.aFloatArray4667[0] = (f_344_ - f) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[1] = (f_345_ - f_343_) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[4] = (f_346_ - f) * interface6.method62(1.0F);
		class47.aClass384_444.aFloatArray4667[5] = (f_347_ - f_343_) * interface6.method62(1.0F);
		class47.aClass384_444.aFloatArray4667[12] = (f - (float) i_348_) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[13] = (f_343_ - (float) i_349_) * interface6.method62(1.0F);
		class47.method938();
	}

	void method2811(float f, float f_354_, float f_355_, float f_356_, float f_357_, float f_358_, int i, Class455 class455, int i_359_, int i_360_) {
		((Class160_Sub3) this).aClass505_Sub2_9052.method13935();
		Class47 class47 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass47_8698);
		class47.anInterface6_443 = ((Class160_Sub3) this).anInterface6_9050;
		class47.method937(1, -1);
		float f_361_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 119).method2714();
		float f_362_ = (float) ((Class160_Sub3) this).aClass505_Sub2_9052.method8523((byte) 127).method2716();
		class47.aClass384_442.method6518();
		if (((Class160_Sub3) this).aBool9051) {
			float f_363_ = ((float) ((Class160_Sub3) this).anInt9060 / (float) method228());
			float f_364_ = ((float) ((Class160_Sub3) this).anInt9053 / (float) method2748());
			class47.aClass384_442.aFloatArray4667[0] = (f_355_ - f) * f_363_;
			class47.aClass384_442.aFloatArray4667[1] = (f_356_ - f_354_) * f_363_;
			class47.aClass384_442.aFloatArray4667[4] = (f_357_ - f) * f_364_;
			class47.aClass384_442.aFloatArray4667[5] = (f_358_ - f_354_) * f_364_;
			class47.aClass384_442.aFloatArray4667[12] = ((f + (float) ((Class160_Sub3) this).anInt9055) * f_363_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
			class47.aClass384_442.aFloatArray4667[13] = ((f_354_ + (float) ((Class160_Sub3) this).anInt9057) * f_364_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
		} else {
			class47.aClass384_442.aFloatArray4667[0] = f_355_ - f;
			class47.aClass384_442.aFloatArray4667[1] = f_356_ - f_354_;
			class47.aClass384_442.aFloatArray4667[4] = f_357_ - f;
			class47.aClass384_442.aFloatArray4667[5] = f_358_ - f_354_;
			class47.aClass384_442.aFloatArray4667[12] = f + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905();
			class47.aClass384_442.aFloatArray4667[13] = (f_354_ + ((Class160_Sub3) this).aClass505_Sub2_9052.method13905());
		}
		Class384 class384 = ((Class160_Sub3) this).aClass505_Sub2_9052.aClass384_8683;
		class384.method6518();
		class384.aFloatArray4667[0] = 2.0F / f_361_;
		class384.aFloatArray4667[5] = 2.0F / f_362_;
		class384.aFloatArray4667[12] = -1.0F;
		class384.aFloatArray4667[13] = -1.0F;
		class384.aFloatArray4667[14] = -1.0F;
		class47.aClass384_442.method6523(class384);
		class47.aClass384_440.method6525(((Class160_Sub3) this).anInterface6_9050.method47((float) ((Class160_Sub3) this).anInt9060), ((Class160_Sub3) this).anInterface6_9050.method62((float) ((Class160_Sub3) this).anInt9053), 1.0F, 1.0F);
		class47.anInterface4_445 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).anInterface4_8746);
		class47.anInt446 = 0;
		class47.aClass70_447 = (((Class505_Sub2) ((Class160_Sub3) this).aClass505_Sub2_9052).aClass70_8786);
		Interface6 interface6 = ((Class455_Sub1) (Class455_Sub1) class455).anInterface6_8508;
		class47.anInterface6_441 = interface6;
		class47.aClass384_444.method6518();
		class47.aClass384_444.aFloatArray4667[0] = (f_355_ - f) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[1] = (f_356_ - f_354_) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[4] = (f_357_ - f) * interface6.method62(1.0F);
		class47.aClass384_444.aFloatArray4667[5] = (f_358_ - f_354_) * interface6.method62(1.0F);
		class47.aClass384_444.aFloatArray4667[12] = (f - (float) i_359_) * interface6.method47(1.0F);
		class47.aClass384_444.aFloatArray4667[13] = (f_354_ - (float) i_360_) * interface6.method62(1.0F);
		class47.method938();
	}

	void method14426(int i, int i_365_, int i_366_, int i_367_, int[] is, int i_368_, int i_369_) {
		((Class160_Sub3) this).anInterface6_9050.method48(i, i_365_, i_366_, i_367_, is, i_368_, i_369_);
	}
}
