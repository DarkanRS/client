/* Class160_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class160_Sub1 extends NativeSprite {
	static int anInt8850;
	int anInt8851;
	static int anInt8852;
	int anInt8853;
	int anInt8854;
	int anInt8855;
	int anInt8856;
	int[] anIntArray8857;
	static int anInt8858;
	static final int anInt8859 = 8;
	static final int anInt8860 = 12;
	static int anInt8861;
	static int anInt8862;
	static int anInt8863;
	static int anInt8864;
	static int anInt8865;
	static int anInt8866;
	int anInt8867;
	static int anInt8868;
	static int anInt8869;
	static int anInt8870;
	static int anInt8871;
	static int anInt8872;
	static int anInt8873;
	static int anInt8874;
	HardwareRenderer aClass505_Sub3_8875;
	static int anInt8876;
	static int anInt8877;
	static int anInt8878 = 0;
	static int anInt8879 = 0;
	static int anInt8880 = 0;
	static final int anInt8881 = 4;
	static int anInt8882;
	static int anInt8883;
	static int anInt8884;
	static int anInt8885;

	public int method2753() {
		return (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
	}

	public void method2743(int i, int i_0_, int i_1_, int i_2_) {
		((Class160_Sub1) this).anInt8853 = i;
		((Class160_Sub1) this).anInt8854 = i_0_;
		((Class160_Sub1) this).anInt8855 = i_1_;
		((Class160_Sub1) this).anInt8856 = i_2_;
	}

	public void method2796(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (((Class160_Sub1) this).anIntArray8857 == null)
			((Class160_Sub1) this).anIntArray8857 = new int[4];
		((Class160_Sub1) this).aClass505_Sub3_8875.qa(((Class160_Sub1) this).anIntArray8857);
		((Class160_Sub1) this).aClass505_Sub3_8875.o((((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8983) * 72550989, (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9009) * 1516535457, i + i_4_, i_3_ + i_5_);
		int i_9_ = method228();
		int i_10_ = method2748();
		int i_11_ = (i_4_ + i_9_ - 1) / i_9_;
		int i_12_ = (i_5_ + i_10_ - 1) / i_10_;
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			int i_14_ = i_13_ * i_10_;
			for (int i_15_ = 0; i_15_ < i_11_; i_15_++)
				method2742(i + i_15_ * i_9_, i_3_ + i_14_, i_6_, i_7_, i_8_);
		}
		((Class160_Sub1) this).aClass505_Sub3_8875.r(((Class160_Sub1) this).anIntArray8857[0], ((Class160_Sub1) this).anIntArray8857[1], ((Class160_Sub1) this).anIntArray8857[2], ((Class160_Sub1) this).anIntArray8857[3]);
	}

	public int method2747() {
		return ((Class160_Sub1) this).anInt8851;
	}

	public int method2793() {
		return ((Class160_Sub1) this).anInt8867;
	}

	abstract void method14245(int i, int i_16_);

	public int method2748() {
		return (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
	}

	public abstract void method2742(int i, int i_17_, int i_18_, int i_19_, int i_20_);

	public abstract void method2773(int i, int i_21_, Class455 class455, int i_22_, int i_23_);

	abstract void method14246(int i, int i_24_);

	abstract void method14247(boolean bool, boolean bool_25_, boolean bool_26_, int i, int i_27_, float f, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, boolean bool_34_);

	public void method2772(int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (((Class160_Sub1) this).anIntArray8857 == null)
			((Class160_Sub1) this).anIntArray8857 = new int[4];
		((Class160_Sub1) this).aClass505_Sub3_8875.qa(((Class160_Sub1) this).anIntArray8857);
		((Class160_Sub1) this).aClass505_Sub3_8875.o((((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8983) * 72550989, (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9009) * 1516535457, i + i_36_, i_35_ + i_37_);
		int i_41_ = method228();
		int i_42_ = method2748();
		int i_43_ = (i_36_ + i_41_ - 1) / i_41_;
		int i_44_ = (i_37_ + i_42_ - 1) / i_42_;
		for (int i_45_ = 0; i_45_ < i_44_; i_45_++) {
			int i_46_ = i_45_ * i_42_;
			for (int i_47_ = 0; i_47_ < i_43_; i_47_++)
				method2742(i + i_47_ * i_41_, i_35_ + i_46_, i_38_, i_39_, i_40_);
		}
		((Class160_Sub1) this).aClass505_Sub3_8875.r(((Class160_Sub1) this).anIntArray8857[0], ((Class160_Sub1) this).anIntArray8857[1], ((Class160_Sub1) this).anIntArray8857[2], ((Class160_Sub1) this).anIntArray8857[3]);
	}

	boolean method14248(float f, float f_48_, float f_49_, float f_50_, float f_51_, float f_52_) {
		int i = (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
		int i_53_ = (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
		if (i != ((Class160_Sub1) this).anInt8851 || i_53_ != ((Class160_Sub1) this).anInt8867) {
			float f_54_ = (f_49_ - f) / (float) i;
			float f_55_ = (f_50_ - f_48_) / (float) i;
			float f_56_ = (f_51_ - f) / (float) i_53_;
			float f_57_ = (f_52_ - f_48_) / (float) i_53_;
			float f_58_ = f_56_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_59_ = f_57_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_60_ = f_54_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_61_ = f_55_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_62_ = -f_54_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_63_ = -f_55_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_64_ = -f_56_ * (float) ((Class160_Sub1) this).anInt8856;
			float f_65_ = -f_57_ * (float) ((Class160_Sub1) this).anInt8856;
			f += f_60_ + f_58_;
			f_48_ += f_61_ + f_59_;
			f_49_ += f_62_ + f_58_;
			f_50_ += f_63_ + f_59_;
			f_51_ += f_60_ + f_64_;
			f_52_ += f_61_ + f_65_;
		}
		float f_66_ = f_51_ + (f_49_ - f);
		float f_67_ = f_50_ + (f_52_ - f_48_);
		float f_68_;
		float f_69_;
		if (f < f_49_) {
			f_68_ = f;
			f_69_ = f_49_;
		} else {
			f_68_ = f_49_;
			f_69_ = f;
		}
		if (f_51_ < f_68_)
			f_68_ = f_51_;
		if (f_66_ < f_68_)
			f_68_ = f_66_;
		if (f_51_ > f_69_)
			f_69_ = f_51_;
		if (f_66_ > f_69_)
			f_69_ = f_66_;
		float f_70_;
		float f_71_;
		if (f_48_ < f_50_) {
			f_70_ = f_48_;
			f_71_ = f_50_;
		} else {
			f_70_ = f_50_;
			f_71_ = f_48_;
		}
		if (f_52_ < f_70_)
			f_70_ = f_52_;
		if (f_67_ < f_70_)
			f_70_ = f_67_;
		if (f_52_ > f_71_)
			f_71_ = f_52_;
		if (f_67_ > f_71_)
			f_71_ = f_67_;
		if (f_68_ < (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989))
			f_68_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
		if (f_69_ > (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9002 * -1710988237))
			f_69_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9002 * -1710988237);
		if (f_70_ < (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457))
			f_70_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
		if (f_71_ > (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921))
			f_71_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921);
		f_69_ = f_68_ - f_69_;
		if (f_69_ >= 0.0F)
			return false;
		f_71_ = f_70_ - f_71_;
		if (f_71_ >= 0.0F)
			return false;
		anInt8850 = (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8980) * 444800403;
		anInt8870 = (int) ((float) ((int) f_70_ * anInt8850) + f_68_);
		float f_72_ = (f_49_ - f) * (f_52_ - f_48_) - (f_50_ - f_48_) * (f_51_ - f);
		float f_73_ = (f_51_ - f) * (f_50_ - f_48_) - (f_52_ - f_48_) * (f_49_ - f);
		anInt8865 = (int) ((f_52_ - f_48_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_72_);
		anInt8868 = (int) ((f_50_ - f_48_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_73_);
		anInt8869 = (int) ((f_51_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_73_);
		anInt8876 = (int) ((f_49_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_72_);
		anInt8871 = (int) (f_68_ * 16.0F + 8.0F - (f + f_49_ + f_51_ + f_66_) / 4.0F * 16.0F);
		anInt8872 = (int) (f_70_ * 16.0F + 8.0F - (f_48_ + f_50_ + f_52_ + f_67_) / 4.0F * 16.0F);
		anInt8873 = ((((Class160_Sub1) this).anInt8851 >> 1 << 12) + (anInt8872 * anInt8869 >> 4));
		anInt8874 = ((((Class160_Sub1) this).anInt8867 >> 1 << 12) + (anInt8872 * anInt8876 >> 4));
		anInt8858 = anInt8871 * anInt8865 >> 4;
		anInt8866 = anInt8871 * anInt8868 >> 4;
		anInt8861 = (int) f_68_;
		anInt8862 = (int) f_69_;
		anInt8863 = (int) f_70_;
		anInt8864 = (int) f_71_;
		return true;
	}

	void method2764(float f, float f_74_, float f_75_, float f_76_, float f_77_, float f_78_, int i, int i_79_, int i_80_, int i_81_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_74_, f_75_, f_76_, f_77_, f_78_)) {
			anInt8877 = i_79_;
			if (i != 1) {
				anInt8878 = i_79_ >>> 24;
				anInt8879 = 256 - anInt8878;
				if (i == 0) {
					anInt8880 = (i_79_ & 0xff0000) >> 16;
					anInt8852 = (i_79_ & 0xff00) >> 8;
					anInt8882 = i_79_ & 0xff;
				} else if (i == 2) {
					anInt8883 = i_79_ >>> 24;
					anInt8884 = 256 - anInt8883;
					int i_82_ = (i_79_ & 0xff00ff) * anInt8884 & ~0xff00ff;
					int i_83_ = (i_79_ & 0xff00) * anInt8884 & 0xff0000;
					anInt8885 = (i_82_ | i_83_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_80_ == 0)
					method14245(1, 0);
				else if (i_80_ == 1)
					method14245(1, 1);
				else if (i_80_ == 2)
					method14245(1, 2);
			} else if (i == 0) {
				if (i_80_ == 0)
					method14245(0, 0);
				else if (i_80_ == 1)
					method14245(0, 1);
				else if (i_80_ == 2)
					method14245(0, 2);
			} else if (i == 3) {
				if (i_80_ == 0)
					method14245(3, 0);
				else if (i_80_ == 1)
					method14245(3, 1);
				else if (i_80_ == 2)
					method14245(3, 2);
			} else if (i == 2) {
				if (i_80_ == 0)
					method14245(2, 0);
				else if (i_80_ == 1)
					method14245(2, 1);
				else if (i_80_ == 2)
					method14245(2, 2);
			}
		}
	}

	public abstract void method2778(int i, int i_84_, int i_85_, int i_86_, int i_87_);

	public int method228() {
		return (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
	}

	boolean method14249(float f, float f_88_, float f_89_, float f_90_, float f_91_, float f_92_) {
		int i = (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
		int i_93_ = (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
		if (i != ((Class160_Sub1) this).anInt8851 || i_93_ != ((Class160_Sub1) this).anInt8867) {
			float f_94_ = (f_89_ - f) / (float) i;
			float f_95_ = (f_90_ - f_88_) / (float) i;
			float f_96_ = (f_91_ - f) / (float) i_93_;
			float f_97_ = (f_92_ - f_88_) / (float) i_93_;
			float f_98_ = f_96_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_99_ = f_97_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_100_ = f_94_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_101_ = f_95_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_102_ = -f_94_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_103_ = -f_95_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_104_ = -f_96_ * (float) ((Class160_Sub1) this).anInt8856;
			float f_105_ = -f_97_ * (float) ((Class160_Sub1) this).anInt8856;
			f += f_100_ + f_98_;
			f_88_ += f_101_ + f_99_;
			f_89_ += f_102_ + f_98_;
			f_90_ += f_103_ + f_99_;
			f_91_ += f_100_ + f_104_;
			f_92_ += f_101_ + f_105_;
		}
		float f_106_ = f_91_ + (f_89_ - f);
		float f_107_ = f_90_ + (f_92_ - f_88_);
		float f_108_;
		float f_109_;
		if (f < f_89_) {
			f_108_ = f;
			f_109_ = f_89_;
		} else {
			f_108_ = f_89_;
			f_109_ = f;
		}
		if (f_91_ < f_108_)
			f_108_ = f_91_;
		if (f_106_ < f_108_)
			f_108_ = f_106_;
		if (f_91_ > f_109_)
			f_109_ = f_91_;
		if (f_106_ > f_109_)
			f_109_ = f_106_;
		float f_110_;
		float f_111_;
		if (f_88_ < f_90_) {
			f_110_ = f_88_;
			f_111_ = f_90_;
		} else {
			f_110_ = f_90_;
			f_111_ = f_88_;
		}
		if (f_92_ < f_110_)
			f_110_ = f_92_;
		if (f_107_ < f_110_)
			f_110_ = f_107_;
		if (f_92_ > f_111_)
			f_111_ = f_92_;
		if (f_107_ > f_111_)
			f_111_ = f_107_;
		if (f_108_ < (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8983 * 72550989))
			f_108_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
		if (f_109_ > (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9002 * -1710988237))
			f_109_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9002 * -1710988237);
		if (f_110_ < (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9009 * 1516535457))
			f_110_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
		if (f_111_ > (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
			f_111_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921);
		f_109_ = f_108_ - f_109_;
		if (f_109_ >= 0.0F)
			return false;
		f_111_ = f_110_ - f_111_;
		if (f_111_ >= 0.0F)
			return false;
		anInt8850 = (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8980) * 444800403;
		anInt8870 = (int) ((float) ((int) f_110_ * anInt8850) + f_108_);
		float f_112_ = (f_89_ - f) * (f_92_ - f_88_) - (f_90_ - f_88_) * (f_91_ - f);
		float f_113_ = (f_91_ - f) * (f_90_ - f_88_) - (f_92_ - f_88_) * (f_89_ - f);
		anInt8865 = (int) ((f_92_ - f_88_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_112_);
		anInt8868 = (int) ((f_90_ - f_88_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_113_);
		anInt8869 = (int) ((f_91_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_113_);
		anInt8876 = (int) ((f_89_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_112_);
		anInt8871 = (int) (f_108_ * 16.0F + 8.0F - (f + f_89_ + f_91_ + f_106_) / 4.0F * 16.0F);
		anInt8872 = (int) (f_110_ * 16.0F + 8.0F - (f_88_ + f_90_ + f_92_ + f_107_) / 4.0F * 16.0F);
		anInt8873 = ((((Class160_Sub1) this).anInt8851 >> 1 << 12) + (anInt8872 * anInt8869 >> 4));
		anInt8874 = ((((Class160_Sub1) this).anInt8867 >> 1 << 12) + (anInt8872 * anInt8876 >> 4));
		anInt8858 = anInt8871 * anInt8865 >> 4;
		anInt8866 = anInt8871 * anInt8868 >> 4;
		anInt8861 = (int) f_108_;
		anInt8862 = (int) f_109_;
		anInt8863 = (int) f_110_;
		anInt8864 = (int) f_111_;
		return true;
	}

	static {
		anInt8852 = 0;
		anInt8882 = 0;
		anInt8883 = 0;
		anInt8884 = 0;
		anInt8885 = 0;
	}

	public abstract void method2784(int i, int i_114_, Class455 class455, int i_115_, int i_116_);

	public abstract void method2774(int i, int i_117_, Class455 class455, int i_118_, int i_119_);

	abstract void method2775(int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_);

	abstract void method2787(int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_);

	abstract void method14250(int[] is, int[] is_134_, int i, int i_135_);

	public void method2804(int[] is) {
		is[0] = ((Class160_Sub1) this).anInt8853;
		is[1] = ((Class160_Sub1) this).anInt8854;
		is[2] = ((Class160_Sub1) this).anInt8855;
		is[3] = ((Class160_Sub1) this).anInt8856;
	}

	abstract void method14251(int[] is, int[] is_136_, int i, int i_137_);

	abstract void method14252(boolean bool, boolean bool_138_, boolean bool_139_, int i, int i_140_, float f, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, boolean bool_147_);

	public void method2744(int[] is) {
		is[0] = ((Class160_Sub1) this).anInt8853;
		is[1] = ((Class160_Sub1) this).anInt8854;
		is[2] = ((Class160_Sub1) this).anInt8855;
		is[3] = ((Class160_Sub1) this).anInt8856;
	}

	public void method2783(int i, int i_148_, int i_149_, int i_150_) {
		((Class160_Sub1) this).anInt8853 = i;
		((Class160_Sub1) this).anInt8854 = i_148_;
		((Class160_Sub1) this).anInt8855 = i_149_;
		((Class160_Sub1) this).anInt8856 = i_150_;
	}

	abstract void method14253(int i, int i_151_);

	abstract void method2755(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_);

	public abstract void method2749(int i, int i_159_, int i_160_, int i_161_, int i_162_);

	public void method2777(int[] is) {
		is[0] = ((Class160_Sub1) this).anInt8853;
		is[1] = ((Class160_Sub1) this).anInt8854;
		is[2] = ((Class160_Sub1) this).anInt8855;
		is[3] = ((Class160_Sub1) this).anInt8856;
	}

	boolean method14254(float f, float f_163_, float f_164_, float f_165_, float f_166_, float f_167_) {
		int i = (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
		int i_168_ = (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
		if (i != ((Class160_Sub1) this).anInt8851 || i_168_ != ((Class160_Sub1) this).anInt8867) {
			float f_169_ = (f_164_ - f) / (float) i;
			float f_170_ = (f_165_ - f_163_) / (float) i;
			float f_171_ = (f_166_ - f) / (float) i_168_;
			float f_172_ = (f_167_ - f_163_) / (float) i_168_;
			float f_173_ = f_171_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_174_ = f_172_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_175_ = f_169_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_176_ = f_170_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_177_ = -f_169_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_178_ = -f_170_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_179_ = -f_171_ * (float) ((Class160_Sub1) this).anInt8856;
			float f_180_ = -f_172_ * (float) ((Class160_Sub1) this).anInt8856;
			f += f_175_ + f_173_;
			f_163_ += f_176_ + f_174_;
			f_164_ += f_177_ + f_173_;
			f_165_ += f_178_ + f_174_;
			f_166_ += f_175_ + f_179_;
			f_167_ += f_176_ + f_180_;
		}
		float f_181_ = f_166_ + (f_164_ - f);
		float f_182_ = f_165_ + (f_167_ - f_163_);
		float f_183_;
		float f_184_;
		if (f < f_164_) {
			f_183_ = f;
			f_184_ = f_164_;
		} else {
			f_183_ = f_164_;
			f_184_ = f;
		}
		if (f_166_ < f_183_)
			f_183_ = f_166_;
		if (f_181_ < f_183_)
			f_183_ = f_181_;
		if (f_166_ > f_184_)
			f_184_ = f_166_;
		if (f_181_ > f_184_)
			f_184_ = f_181_;
		float f_185_;
		float f_186_;
		if (f_163_ < f_165_) {
			f_185_ = f_163_;
			f_186_ = f_165_;
		} else {
			f_185_ = f_165_;
			f_186_ = f_163_;
		}
		if (f_167_ < f_185_)
			f_185_ = f_167_;
		if (f_182_ < f_185_)
			f_185_ = f_182_;
		if (f_167_ > f_186_)
			f_186_ = f_167_;
		if (f_182_ > f_186_)
			f_186_ = f_182_;
		if (f_183_ < (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8983 * 72550989))
			f_183_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
		if (f_184_ > (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9002 * -1710988237))
			f_184_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9002 * -1710988237);
		if (f_185_ < (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9009 * 1516535457))
			f_185_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
		if (f_186_ > (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
			f_186_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921);
		f_184_ = f_183_ - f_184_;
		if (f_184_ >= 0.0F)
			return false;
		f_186_ = f_185_ - f_186_;
		if (f_186_ >= 0.0F)
			return false;
		anInt8850 = (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8980) * 444800403;
		anInt8870 = (int) ((float) ((int) f_185_ * anInt8850) + f_183_);
		float f_187_ = ((f_164_ - f) * (f_167_ - f_163_) - (f_165_ - f_163_) * (f_166_ - f));
		float f_188_ = ((f_166_ - f) * (f_165_ - f_163_) - (f_167_ - f_163_) * (f_164_ - f));
		anInt8865 = (int) ((f_167_ - f_163_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_187_);
		anInt8868 = (int) ((f_165_ - f_163_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_188_);
		anInt8869 = (int) ((f_166_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_188_);
		anInt8876 = (int) ((f_164_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_187_);
		anInt8871 = (int) (f_183_ * 16.0F + 8.0F - (f + f_164_ + f_166_ + f_181_) / 4.0F * 16.0F);
		anInt8872 = (int) (f_185_ * 16.0F + 8.0F - (f_163_ + f_165_ + f_167_ + f_182_) / 4.0F * 16.0F);
		anInt8873 = ((((Class160_Sub1) this).anInt8851 >> 1 << 12) + (anInt8872 * anInt8869 >> 4));
		anInt8874 = ((((Class160_Sub1) this).anInt8867 >> 1 << 12) + (anInt8872 * anInt8876 >> 4));
		anInt8858 = anInt8871 * anInt8865 >> 4;
		anInt8866 = anInt8871 * anInt8868 >> 4;
		anInt8861 = (int) f_183_;
		anInt8862 = (int) f_184_;
		anInt8863 = (int) f_185_;
		anInt8864 = (int) f_186_;
		return true;
	}

	public void method2781(int i, int i_189_, int i_190_, int i_191_) {
		((Class160_Sub1) this).anInt8853 = i;
		((Class160_Sub1) this).anInt8854 = i_189_;
		((Class160_Sub1) this).anInt8855 = i_190_;
		((Class160_Sub1) this).anInt8856 = i_191_;
	}

	public int method2786() {
		return ((Class160_Sub1) this).anInt8851;
	}

	public int method2794() {
		return ((Class160_Sub1) this).anInt8851;
	}

	public int method2788() {
		return ((Class160_Sub1) this).anInt8867;
	}

	public int method2765() {
		return ((Class160_Sub1) this).anInt8867;
	}

	public void method2782(int[] is) {
		is[0] = ((Class160_Sub1) this).anInt8853;
		is[1] = ((Class160_Sub1) this).anInt8854;
		is[2] = ((Class160_Sub1) this).anInt8855;
		is[3] = ((Class160_Sub1) this).anInt8856;
	}

	public int method227() {
		return (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
	}

	public int method226() {
		return (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
	}

	public int method229() {
		return (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
	}

	public int method2792() {
		return (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
	}

	public int method225() {
		return (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
	}

	Class160_Sub1(HardwareRenderer class505_sub3, int i, int i_192_) {
		((Class160_Sub1) this).aClass505_Sub3_8875 = class505_sub3;
		((Class160_Sub1) this).anInt8851 = i;
		((Class160_Sub1) this).anInt8867 = i_192_;
	}

	public void method2785(int[] is) {
		is[0] = ((Class160_Sub1) this).anInt8853;
		is[1] = ((Class160_Sub1) this).anInt8854;
		is[2] = ((Class160_Sub1) this).anInt8855;
		is[3] = ((Class160_Sub1) this).anInt8856;
	}

	abstract void method14255(boolean bool, boolean bool_193_, boolean bool_194_, int i, int i_195_, float f, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, boolean bool_202_);

	public void method2799(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (((Class160_Sub1) this).anIntArray8857 == null)
			((Class160_Sub1) this).anIntArray8857 = new int[4];
		((Class160_Sub1) this).aClass505_Sub3_8875.qa(((Class160_Sub1) this).anIntArray8857);
		((Class160_Sub1) this).aClass505_Sub3_8875.o((((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8983) * 72550989, (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9009) * 1516535457, i + i_204_, i_203_ + i_205_);
		int i_209_ = method228();
		int i_210_ = method2748();
		int i_211_ = (i_204_ + i_209_ - 1) / i_209_;
		int i_212_ = (i_205_ + i_210_ - 1) / i_210_;
		for (int i_213_ = 0; i_213_ < i_212_; i_213_++) {
			int i_214_ = i_213_ * i_210_;
			for (int i_215_ = 0; i_215_ < i_211_; i_215_++)
				method2742(i + i_215_ * i_209_, i_203_ + i_214_, i_206_, i_207_, i_208_);
		}
		((Class160_Sub1) this).aClass505_Sub3_8875.r(((Class160_Sub1) this).anIntArray8857[0], ((Class160_Sub1) this).anIntArray8857[1], ((Class160_Sub1) this).anIntArray8857[2], ((Class160_Sub1) this).anIntArray8857[3]);
	}

	void method2812(float f, float f_216_, float f_217_, float f_218_, float f_219_, float f_220_, int i, int i_221_, int i_222_, int i_223_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_216_, f_217_, f_218_, f_219_, f_220_)) {
			anInt8877 = i_221_;
			if (i != 1) {
				anInt8878 = i_221_ >>> 24;
				anInt8879 = 256 - anInt8878;
				if (i == 0) {
					anInt8880 = (i_221_ & 0xff0000) >> 16;
					anInt8852 = (i_221_ & 0xff00) >> 8;
					anInt8882 = i_221_ & 0xff;
				} else if (i == 2) {
					anInt8883 = i_221_ >>> 24;
					anInt8884 = 256 - anInt8883;
					int i_224_ = (i_221_ & 0xff00ff) * anInt8884 & ~0xff00ff;
					int i_225_ = (i_221_ & 0xff00) * anInt8884 & 0xff0000;
					anInt8885 = (i_224_ | i_225_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_222_ == 0)
					method14245(1, 0);
				else if (i_222_ == 1)
					method14245(1, 1);
				else if (i_222_ == 2)
					method14245(1, 2);
			} else if (i == 0) {
				if (i_222_ == 0)
					method14245(0, 0);
				else if (i_222_ == 1)
					method14245(0, 1);
				else if (i_222_ == 2)
					method14245(0, 2);
			} else if (i == 3) {
				if (i_222_ == 0)
					method14245(3, 0);
				else if (i_222_ == 1)
					method14245(3, 1);
				else if (i_222_ == 2)
					method14245(3, 2);
			} else if (i == 2) {
				if (i_222_ == 0)
					method14245(2, 0);
				else if (i_222_ == 1)
					method14245(2, 1);
				else if (i_222_ == 2)
					method14245(2, 2);
			}
		}
	}

	public void method2780(int i, int i_226_, int i_227_, int i_228_) {
		((Class160_Sub1) this).anInt8853 = i;
		((Class160_Sub1) this).anInt8854 = i_226_;
		((Class160_Sub1) this).anInt8855 = i_227_;
		((Class160_Sub1) this).anInt8856 = i_228_;
	}

	boolean method14256(float f, float f_229_, float f_230_, float f_231_, float f_232_, float f_233_) {
		int i = (((Class160_Sub1) this).anInt8853 + ((Class160_Sub1) this).anInt8851 + ((Class160_Sub1) this).anInt8855);
		int i_234_ = (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
		if (i != ((Class160_Sub1) this).anInt8851 || i_234_ != ((Class160_Sub1) this).anInt8867) {
			float f_235_ = (f_230_ - f) / (float) i;
			float f_236_ = (f_231_ - f_229_) / (float) i;
			float f_237_ = (f_232_ - f) / (float) i_234_;
			float f_238_ = (f_233_ - f_229_) / (float) i_234_;
			float f_239_ = f_237_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_240_ = f_238_ * (float) ((Class160_Sub1) this).anInt8854;
			float f_241_ = f_235_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_242_ = f_236_ * (float) ((Class160_Sub1) this).anInt8853;
			float f_243_ = -f_235_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_244_ = -f_236_ * (float) ((Class160_Sub1) this).anInt8855;
			float f_245_ = -f_237_ * (float) ((Class160_Sub1) this).anInt8856;
			float f_246_ = -f_238_ * (float) ((Class160_Sub1) this).anInt8856;
			f += f_241_ + f_239_;
			f_229_ += f_242_ + f_240_;
			f_230_ += f_243_ + f_239_;
			f_231_ += f_244_ + f_240_;
			f_232_ += f_241_ + f_245_;
			f_233_ += f_242_ + f_246_;
		}
		float f_247_ = f_232_ + (f_230_ - f);
		float f_248_ = f_231_ + (f_233_ - f_229_);
		float f_249_;
		float f_250_;
		if (f < f_230_) {
			f_249_ = f;
			f_250_ = f_230_;
		} else {
			f_249_ = f_230_;
			f_250_ = f;
		}
		if (f_232_ < f_249_)
			f_249_ = f_232_;
		if (f_247_ < f_249_)
			f_249_ = f_247_;
		if (f_232_ > f_250_)
			f_250_ = f_232_;
		if (f_247_ > f_250_)
			f_250_ = f_247_;
		float f_251_;
		float f_252_;
		if (f_229_ < f_231_) {
			f_251_ = f_229_;
			f_252_ = f_231_;
		} else {
			f_251_ = f_231_;
			f_252_ = f_229_;
		}
		if (f_233_ < f_251_)
			f_251_ = f_233_;
		if (f_248_ < f_251_)
			f_251_ = f_248_;
		if (f_233_ > f_252_)
			f_252_ = f_233_;
		if (f_248_ > f_252_)
			f_252_ = f_248_;
		if (f_249_ < (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8983 * 72550989))
			f_249_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8983 * 72550989);
		if (f_250_ > (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9002 * -1710988237))
			f_250_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9002 * -1710988237);
		if (f_251_ < (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt9009 * 1516535457))
			f_251_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt9009 * 1516535457);
		if (f_252_ > (float) (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8986 * 1383960921))
			f_252_ = (float) (((HardwareRenderer) (((Class160_Sub1) this).aClass505_Sub3_8875)).anInt8986 * 1383960921);
		f_250_ = f_249_ - f_250_;
		if (f_250_ >= 0.0F)
			return false;
		f_252_ = f_251_ - f_252_;
		if (f_252_ >= 0.0F)
			return false;
		anInt8850 = (((HardwareRenderer) ((Class160_Sub1) this).aClass505_Sub3_8875).anInt8980) * 444800403;
		anInt8870 = (int) ((float) ((int) f_251_ * anInt8850) + f_249_);
		float f_253_ = ((f_230_ - f) * (f_233_ - f_229_) - (f_231_ - f_229_) * (f_232_ - f));
		float f_254_ = ((f_232_ - f) * (f_231_ - f_229_) - (f_233_ - f_229_) * (f_230_ - f));
		anInt8865 = (int) ((f_233_ - f_229_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_253_);
		anInt8868 = (int) ((f_231_ - f_229_) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_254_);
		anInt8869 = (int) ((f_232_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8851 / f_254_);
		anInt8876 = (int) ((f_230_ - f) * 4096.0F * (float) ((Class160_Sub1) this).anInt8867 / f_253_);
		anInt8871 = (int) (f_249_ * 16.0F + 8.0F - (f + f_230_ + f_232_ + f_247_) / 4.0F * 16.0F);
		anInt8872 = (int) (f_251_ * 16.0F + 8.0F - (f_229_ + f_231_ + f_233_ + f_248_) / 4.0F * 16.0F);
		anInt8873 = ((((Class160_Sub1) this).anInt8851 >> 1 << 12) + (anInt8872 * anInt8869 >> 4));
		anInt8874 = ((((Class160_Sub1) this).anInt8867 >> 1 << 12) + (anInt8872 * anInt8876 >> 4));
		anInt8858 = anInt8871 * anInt8865 >> 4;
		anInt8866 = anInt8871 * anInt8868 >> 4;
		anInt8861 = (int) f_249_;
		anInt8862 = (int) f_250_;
		anInt8863 = (int) f_251_;
		anInt8864 = (int) f_252_;
		return true;
	}

	void method2766(float f, float f_255_, float f_256_, float f_257_, float f_258_, float f_259_, int i, Class455 class455, int i_260_, int i_261_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_255_, f_256_, f_257_, f_258_, f_259_)) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			method14250(((PacketsDecoder) class455_sub3).anIntArray9077, ((PacketsDecoder) class455_sub3).anIntArray9078, anInt8861 - i_260_, -i_261_ - (anInt8864 - anInt8863));
		}
	}

	void method2791(float f, float f_262_, float f_263_, float f_264_, float f_265_, float f_266_, int i, int i_267_, int i_268_, int i_269_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_262_, f_263_, f_264_, f_265_, f_266_)) {
			anInt8877 = i_267_;
			if (i != 1) {
				anInt8878 = i_267_ >>> 24;
				anInt8879 = 256 - anInt8878;
				if (i == 0) {
					anInt8880 = (i_267_ & 0xff0000) >> 16;
					anInt8852 = (i_267_ & 0xff00) >> 8;
					anInt8882 = i_267_ & 0xff;
				} else if (i == 2) {
					anInt8883 = i_267_ >>> 24;
					anInt8884 = 256 - anInt8883;
					int i_270_ = (i_267_ & 0xff00ff) * anInt8884 & ~0xff00ff;
					int i_271_ = (i_267_ & 0xff00) * anInt8884 & 0xff0000;
					anInt8885 = (i_270_ | i_271_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_268_ == 0)
					method14245(1, 0);
				else if (i_268_ == 1)
					method14245(1, 1);
				else if (i_268_ == 2)
					method14245(1, 2);
			} else if (i == 0) {
				if (i_268_ == 0)
					method14245(0, 0);
				else if (i_268_ == 1)
					method14245(0, 1);
				else if (i_268_ == 2)
					method14245(0, 2);
			} else if (i == 3) {
				if (i_268_ == 0)
					method14245(3, 0);
				else if (i_268_ == 1)
					method14245(3, 1);
				else if (i_268_ == 2)
					method14245(3, 2);
			} else if (i == 2) {
				if (i_268_ == 0)
					method14245(2, 0);
				else if (i_268_ == 1)
					method14245(2, 1);
				else if (i_268_ == 2)
					method14245(2, 2);
			}
		}
	}

	void method2798(float f, float f_272_, float f_273_, float f_274_, float f_275_, float f_276_, int i, int i_277_, int i_278_, int i_279_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_272_, f_273_, f_274_, f_275_, f_276_)) {
			anInt8877 = i_277_;
			if (i != 1) {
				anInt8878 = i_277_ >>> 24;
				anInt8879 = 256 - anInt8878;
				if (i == 0) {
					anInt8880 = (i_277_ & 0xff0000) >> 16;
					anInt8852 = (i_277_ & 0xff00) >> 8;
					anInt8882 = i_277_ & 0xff;
				} else if (i == 2) {
					anInt8883 = i_277_ >>> 24;
					anInt8884 = 256 - anInt8883;
					int i_280_ = (i_277_ & 0xff00ff) * anInt8884 & ~0xff00ff;
					int i_281_ = (i_277_ & 0xff00) * anInt8884 & 0xff0000;
					anInt8885 = (i_280_ | i_281_) >>> 8;
				}
			}
			if (i == 1) {
				if (i_278_ == 0)
					method14245(1, 0);
				else if (i_278_ == 1)
					method14245(1, 1);
				else if (i_278_ == 2)
					method14245(1, 2);
			} else if (i == 0) {
				if (i_278_ == 0)
					method14245(0, 0);
				else if (i_278_ == 1)
					method14245(0, 1);
				else if (i_278_ == 2)
					method14245(0, 2);
			} else if (i == 3) {
				if (i_278_ == 0)
					method14245(3, 0);
				else if (i_278_ == 1)
					method14245(3, 1);
				else if (i_278_ == 2)
					method14245(3, 2);
			} else if (i == 2) {
				if (i_278_ == 0)
					method14245(2, 0);
				else if (i_278_ == 1)
					method14245(2, 1);
				else if (i_278_ == 2)
					method14245(2, 2);
			}
		}
	}

	public int method2757() {
		return (((Class160_Sub1) this).anInt8854 + ((Class160_Sub1) this).anInt8867 + ((Class160_Sub1) this).anInt8856);
	}

	void method2800(float f, float f_282_, float f_283_, float f_284_, float f_285_, float f_286_, int i, Class455 class455, int i_287_, int i_288_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_282_, f_283_, f_284_, f_285_, f_286_)) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			method14250(((PacketsDecoder) class455_sub3).anIntArray9077, ((PacketsDecoder) class455_sub3).anIntArray9078, anInt8861 - i_287_, -i_288_ - (anInt8864 - anInt8863));
		}
	}

	void method2811(float f, float f_289_, float f_290_, float f_291_, float f_292_, float f_293_, int i, Class455 class455, int i_294_, int i_295_) {
		if (((Class160_Sub1) this).aClass505_Sub3_8875.method14408())
			throw new IllegalStateException();
		if (method14248(f, f_289_, f_290_, f_291_, f_292_, f_293_)) {
			PacketsDecoder class455_sub3 = (PacketsDecoder) class455;
			method14250(((PacketsDecoder) class455_sub3).anIntArray9077, ((PacketsDecoder) class455_sub3).anIntArray9078, anInt8861 - i_294_, -i_295_ - (anInt8864 - anInt8863));
		}
	}
}
