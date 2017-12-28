
/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class370 {
	short[] aShortArray4281;
	static final int anInt4282 = 4096;
	int anInt4283;
	static final int anInt4284 = 4095;
	short[] aShortArray4285 = new short[512];
	int anInt4286;
	static final int anInt4287 = 12;
	int anInt4288;
	int anInt4289;
	int anInt4290;
	public static int[] anIntArray4291 = new int[4096];

	void method6319() {
		Random random = new Random((long) ((Class370) this).anInt4283);
		for (int i = 0; i < 255; i++)
			((Class370) this).aShortArray4285[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_0_ = 255 - i;
			int i_1_ = Class476.method7931(random, i_0_, -686025746);
			short i_2_ = ((Class370) this).aShortArray4285[i_1_];
			((Class370) this).aShortArray4285[i_1_] = ((Class370) this).aShortArray4285[i_0_];
			((Class370) this).aShortArray4285[i_0_] = ((Class370) this).aShortArray4285[i_0_ + 256] = i_2_;
		}
	}

	static int method6320(int i, int i_3_, int i_4_, int i_5_) {
		int i_6_ = i & 0xf;
		int i_7_ = i_6_ < 8 ? i_3_ : i_4_;
		int i_8_ = i_6_ < 4 ? i_4_ : i_6_ == 12 || i_6_ == 14 ? i_3_ : i_5_;
		return (((i_6_ & 0x1) == 0 ? i_7_ : -i_7_) + ((i_6_ & 0x2) == 0 ? i_8_ : -i_8_));
	}

	Class370(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class370) this).anInt4283 = 0;
		((Class370) this).anInt4286 = 4;
		((Class370) this).anInt4288 = 4;
		((Class370) this).anInt4289 = 4;
		((Class370) this).anInt4290 = 4;
		((Class370) this).anInt4283 = i;
		((Class370) this).anInt4286 = i_10_;
		((Class370) this).anInt4288 = i_11_;
		((Class370) this).anInt4289 = i_12_;
		((Class370) this).anInt4290 = i_9_;
		method6323();
		method6325();
	}

	abstract void method6321();

	void method6322(int i, int i_13_, int i_14_) {
		int[] is = new int[i];
		int[] is_15_ = new int[i_13_];
		int[] is_16_ = new int[i_14_];
		for (int i_17_ = 0; i_17_ < i; i_17_++)
			is[i_17_] = (i_17_ << 12) / i;
		for (int i_18_ = 0; i_18_ < i_13_; i_18_++)
			is_15_[i_18_] = (i_18_ << 12) / i_13_;
		for (int i_19_ = 0; i_19_ < i_14_; i_19_++)
			is_16_[i_19_] = (i_19_ << 12) / i_14_;
		method6332();
		for (int i_20_ = 0; i_20_ < i_14_; i_20_++) {
			for (int i_21_ = 0; i_21_ < i_13_; i_21_++) {
				for (int i_22_ = 0; i_22_ < i; i_22_++) {
					for (int i_23_ = 0; i_23_ < ((Class370) this).anInt4290; i_23_++) {
						int i_24_ = ((Class370) this).aShortArray4281[i_23_] << 12;
						int i_25_ = ((Class370) this).anInt4286 * i_24_ >> 12;
						int i_26_ = ((Class370) this).anInt4288 * i_24_ >> 12;
						int i_27_ = ((Class370) this).anInt4289 * i_24_ >> 12;
						int i_28_ = is[i_22_] * i_24_ >> 12;
						int i_29_ = is_15_[i_21_] * i_24_ >> 12;
						int i_30_ = is_16_[i_20_] * i_24_ >> 12;
						i_28_ *= ((Class370) this).anInt4286;
						i_29_ *= ((Class370) this).anInt4288;
						i_30_ *= ((Class370) this).anInt4289;
						int i_31_ = i_28_ >> 12;
						int i_32_ = i_31_ + 1;
						i_31_ &= 0xff;
						int i_33_ = i_29_ >> 12;
						int i_34_ = i_33_ + 1;
						i_33_ &= 0xff;
						int i_35_ = i_30_ >> 12;
						int i_36_ = i_35_ + 1;
						i_35_ &= 0xff;
						if (i_32_ >= i_25_)
							i_32_ = 0;
						else
							i_32_ &= 0xff;
						if (i_34_ >= i_26_)
							i_34_ = 0;
						else
							i_34_ &= 0xff;
						if (i_36_ >= i_27_)
							i_36_ = 0;
						else
							i_36_ &= 0xff;
						i_28_ &= 0xfff;
						i_29_ &= 0xfff;
						i_30_ &= 0xfff;
						int i_37_ = anIntArray4291[i_28_];
						int i_38_ = anIntArray4291[i_29_];
						int i_39_ = anIntArray4291[i_30_];
						int i_40_ = i_28_ - 4096;
						int i_41_ = i_29_ - 4096;
						int i_42_ = i_30_ - 4096;
						int i_43_ = ((Class370) this).aShortArray4285[i_35_];
						int i_44_ = ((Class370) this).aShortArray4285[i_36_];
						int i_45_ = ((Class370) this).aShortArray4285[i_33_ + i_43_];
						int i_46_ = ((Class370) this).aShortArray4285[i_34_ + i_43_];
						int i_47_ = ((Class370) this).aShortArray4285[i_33_ + i_44_];
						int i_48_ = ((Class370) this).aShortArray4285[i_34_ + i_44_];
						int i_49_ = method6324((((Class370) this).aShortArray4285[i_31_ + i_45_]), i_28_, i_29_, i_30_);
						int i_50_ = method6324((((Class370) this).aShortArray4285[i_32_ + i_45_]), i_40_, i_29_, i_30_);
						int i_51_ = i_49_ + (i_37_ * (i_50_ - i_49_) >> 12);
						i_49_ = method6324((((Class370) this).aShortArray4285[i_31_ + i_46_]), i_28_, i_41_, i_30_);
						i_50_ = method6324((((Class370) this).aShortArray4285[i_32_ + i_46_]), i_40_, i_41_, i_30_);
						int i_52_ = i_49_ + (i_37_ * (i_50_ - i_49_) >> 12);
						int i_53_ = i_51_ + (i_38_ * (i_52_ - i_51_) >> 12);
						i_49_ = method6324((((Class370) this).aShortArray4285[i_31_ + i_47_]), i_28_, i_29_, i_42_);
						i_50_ = method6324((((Class370) this).aShortArray4285[i_32_ + i_47_]), i_40_, i_29_, i_42_);
						i_51_ = i_49_ + (i_37_ * (i_50_ - i_49_) >> 12);
						i_49_ = method6324((((Class370) this).aShortArray4285[i_31_ + i_48_]), i_28_, i_41_, i_42_);
						i_50_ = method6324((((Class370) this).aShortArray4285[i_32_ + i_48_]), i_40_, i_41_, i_42_);
						i_52_ = i_49_ + (i_37_ * (i_50_ - i_49_) >> 12);
						int i_54_ = i_51_ + (i_38_ * (i_52_ - i_51_) >> 12);
						method6337(i_23_, i_53_ + (i_39_ * (i_54_ - i_53_) >> 12));
					}
					method6321();
				}
			}
		}
	}

	void method6323() {
		((Class370) this).aShortArray4281 = new short[((Class370) this).anInt4290];
		for (int i = 0; i < ((Class370) this).anInt4290; i++)
			((Class370) this).aShortArray4281[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	static int method6324(int i, int i_55_, int i_56_, int i_57_) {
		int i_58_ = i & 0xf;
		int i_59_ = i_58_ < 8 ? i_55_ : i_56_;
		int i_60_ = i_58_ < 4 ? i_56_ : i_58_ == 12 || i_58_ == 14 ? i_55_ : i_57_;
		return (((i_58_ & 0x1) == 0 ? i_59_ : -i_59_) + ((i_58_ & 0x2) == 0 ? i_60_ : -i_60_));
	}

	void method6325() {
		Random random = new Random((long) ((Class370) this).anInt4283);
		for (int i = 0; i < 255; i++)
			((Class370) this).aShortArray4285[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_61_ = 255 - i;
			int i_62_ = Class476.method7931(random, i_61_, -270652562);
			short i_63_ = ((Class370) this).aShortArray4285[i_62_];
			((Class370) this).aShortArray4285[i_62_] = ((Class370) this).aShortArray4285[i_61_];
			((Class370) this).aShortArray4285[i_61_] = ((Class370) this).aShortArray4285[i_61_ + 256] = i_63_;
		}
	}

	static final int method6326(int i) {
		int i_64_ = i * (i * i >> 12) >> 12;
		int i_65_ = i * 6 - 61440;
		int i_66_ = 40960 + (i_65_ * i >> 12);
		return i_66_ * i_64_ >> 12;
	}

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray4291[i] = method6326(i);
	}

	abstract void method6327(int i, int i_67_);

	void method6328(int i, int i_68_, int i_69_) {
		int[] is = new int[i];
		int[] is_70_ = new int[i_68_];
		int[] is_71_ = new int[i_69_];
		for (int i_72_ = 0; i_72_ < i; i_72_++)
			is[i_72_] = (i_72_ << 12) / i;
		for (int i_73_ = 0; i_73_ < i_68_; i_73_++)
			is_70_[i_73_] = (i_73_ << 12) / i_68_;
		for (int i_74_ = 0; i_74_ < i_69_; i_74_++)
			is_71_[i_74_] = (i_74_ << 12) / i_69_;
		method6332();
		for (int i_75_ = 0; i_75_ < i_69_; i_75_++) {
			for (int i_76_ = 0; i_76_ < i_68_; i_76_++) {
				for (int i_77_ = 0; i_77_ < i; i_77_++) {
					for (int i_78_ = 0; i_78_ < ((Class370) this).anInt4290; i_78_++) {
						int i_79_ = ((Class370) this).aShortArray4281[i_78_] << 12;
						int i_80_ = ((Class370) this).anInt4286 * i_79_ >> 12;
						int i_81_ = ((Class370) this).anInt4288 * i_79_ >> 12;
						int i_82_ = ((Class370) this).anInt4289 * i_79_ >> 12;
						int i_83_ = is[i_77_] * i_79_ >> 12;
						int i_84_ = is_70_[i_76_] * i_79_ >> 12;
						int i_85_ = is_71_[i_75_] * i_79_ >> 12;
						i_83_ *= ((Class370) this).anInt4286;
						i_84_ *= ((Class370) this).anInt4288;
						i_85_ *= ((Class370) this).anInt4289;
						int i_86_ = i_83_ >> 12;
						int i_87_ = i_86_ + 1;
						i_86_ &= 0xff;
						int i_88_ = i_84_ >> 12;
						int i_89_ = i_88_ + 1;
						i_88_ &= 0xff;
						int i_90_ = i_85_ >> 12;
						int i_91_ = i_90_ + 1;
						i_90_ &= 0xff;
						if (i_87_ >= i_80_)
							i_87_ = 0;
						else
							i_87_ &= 0xff;
						if (i_89_ >= i_81_)
							i_89_ = 0;
						else
							i_89_ &= 0xff;
						if (i_91_ >= i_82_)
							i_91_ = 0;
						else
							i_91_ &= 0xff;
						i_83_ &= 0xfff;
						i_84_ &= 0xfff;
						i_85_ &= 0xfff;
						int i_92_ = anIntArray4291[i_83_];
						int i_93_ = anIntArray4291[i_84_];
						int i_94_ = anIntArray4291[i_85_];
						int i_95_ = i_83_ - 4096;
						int i_96_ = i_84_ - 4096;
						int i_97_ = i_85_ - 4096;
						int i_98_ = ((Class370) this).aShortArray4285[i_90_];
						int i_99_ = ((Class370) this).aShortArray4285[i_91_];
						int i_100_ = ((Class370) this).aShortArray4285[i_88_ + i_98_];
						int i_101_ = ((Class370) this).aShortArray4285[i_89_ + i_98_];
						int i_102_ = ((Class370) this).aShortArray4285[i_88_ + i_99_];
						int i_103_ = ((Class370) this).aShortArray4285[i_89_ + i_99_];
						int i_104_ = method6324((((Class370) this).aShortArray4285[i_86_ + i_100_]), i_83_, i_84_, i_85_);
						int i_105_ = method6324((((Class370) this).aShortArray4285[i_87_ + i_100_]), i_95_, i_84_, i_85_);
						int i_106_ = i_104_ + (i_92_ * (i_105_ - i_104_) >> 12);
						i_104_ = method6324((((Class370) this).aShortArray4285[i_86_ + i_101_]), i_83_, i_96_, i_85_);
						i_105_ = method6324((((Class370) this).aShortArray4285[i_87_ + i_101_]), i_95_, i_96_, i_85_);
						int i_107_ = i_104_ + (i_92_ * (i_105_ - i_104_) >> 12);
						int i_108_ = i_106_ + (i_93_ * (i_107_ - i_106_) >> 12);
						i_104_ = method6324((((Class370) this).aShortArray4285[i_86_ + i_102_]), i_83_, i_84_, i_97_);
						i_105_ = method6324((((Class370) this).aShortArray4285[i_87_ + i_102_]), i_95_, i_84_, i_97_);
						i_106_ = i_104_ + (i_92_ * (i_105_ - i_104_) >> 12);
						i_104_ = method6324((((Class370) this).aShortArray4285[i_86_ + i_103_]), i_83_, i_96_, i_97_);
						i_105_ = method6324((((Class370) this).aShortArray4285[i_87_ + i_103_]), i_95_, i_96_, i_97_);
						i_107_ = i_104_ + (i_92_ * (i_105_ - i_104_) >> 12);
						int i_109_ = i_106_ + (i_93_ * (i_107_ - i_106_) >> 12);
						method6337(i_78_, i_108_ + (i_94_ * (i_109_ - i_108_) >> 12));
					}
					method6321();
				}
			}
		}
	}

	void method6329(int i, int i_110_, int i_111_) {
		int[] is = new int[i];
		int[] is_112_ = new int[i_110_];
		int[] is_113_ = new int[i_111_];
		for (int i_114_ = 0; i_114_ < i; i_114_++)
			is[i_114_] = (i_114_ << 12) / i;
		for (int i_115_ = 0; i_115_ < i_110_; i_115_++)
			is_112_[i_115_] = (i_115_ << 12) / i_110_;
		for (int i_116_ = 0; i_116_ < i_111_; i_116_++)
			is_113_[i_116_] = (i_116_ << 12) / i_111_;
		method6332();
		for (int i_117_ = 0; i_117_ < i_111_; i_117_++) {
			for (int i_118_ = 0; i_118_ < i_110_; i_118_++) {
				for (int i_119_ = 0; i_119_ < i; i_119_++) {
					for (int i_120_ = 0; i_120_ < ((Class370) this).anInt4290; i_120_++) {
						int i_121_ = ((Class370) this).aShortArray4281[i_120_] << 12;
						int i_122_ = ((Class370) this).anInt4286 * i_121_ >> 12;
						int i_123_ = ((Class370) this).anInt4288 * i_121_ >> 12;
						int i_124_ = ((Class370) this).anInt4289 * i_121_ >> 12;
						int i_125_ = is[i_119_] * i_121_ >> 12;
						int i_126_ = is_112_[i_118_] * i_121_ >> 12;
						int i_127_ = is_113_[i_117_] * i_121_ >> 12;
						i_125_ *= ((Class370) this).anInt4286;
						i_126_ *= ((Class370) this).anInt4288;
						i_127_ *= ((Class370) this).anInt4289;
						int i_128_ = i_125_ >> 12;
						int i_129_ = i_128_ + 1;
						i_128_ &= 0xff;
						int i_130_ = i_126_ >> 12;
						int i_131_ = i_130_ + 1;
						i_130_ &= 0xff;
						int i_132_ = i_127_ >> 12;
						int i_133_ = i_132_ + 1;
						i_132_ &= 0xff;
						if (i_129_ >= i_122_)
							i_129_ = 0;
						else
							i_129_ &= 0xff;
						if (i_131_ >= i_123_)
							i_131_ = 0;
						else
							i_131_ &= 0xff;
						if (i_133_ >= i_124_)
							i_133_ = 0;
						else
							i_133_ &= 0xff;
						i_125_ &= 0xfff;
						i_126_ &= 0xfff;
						i_127_ &= 0xfff;
						int i_134_ = anIntArray4291[i_125_];
						int i_135_ = anIntArray4291[i_126_];
						int i_136_ = anIntArray4291[i_127_];
						int i_137_ = i_125_ - 4096;
						int i_138_ = i_126_ - 4096;
						int i_139_ = i_127_ - 4096;
						int i_140_ = ((Class370) this).aShortArray4285[i_132_];
						int i_141_ = ((Class370) this).aShortArray4285[i_133_];
						int i_142_ = (((Class370) this).aShortArray4285[i_130_ + i_140_]);
						int i_143_ = (((Class370) this).aShortArray4285[i_131_ + i_140_]);
						int i_144_ = (((Class370) this).aShortArray4285[i_130_ + i_141_]);
						int i_145_ = (((Class370) this).aShortArray4285[i_131_ + i_141_]);
						int i_146_ = method6324((((Class370) this).aShortArray4285[i_128_ + i_142_]), i_125_, i_126_, i_127_);
						int i_147_ = method6324((((Class370) this).aShortArray4285[i_129_ + i_142_]), i_137_, i_126_, i_127_);
						int i_148_ = i_146_ + (i_134_ * (i_147_ - i_146_) >> 12);
						i_146_ = method6324((((Class370) this).aShortArray4285[i_128_ + i_143_]), i_125_, i_138_, i_127_);
						i_147_ = method6324((((Class370) this).aShortArray4285[i_129_ + i_143_]), i_137_, i_138_, i_127_);
						int i_149_ = i_146_ + (i_134_ * (i_147_ - i_146_) >> 12);
						int i_150_ = i_148_ + (i_135_ * (i_149_ - i_148_) >> 12);
						i_146_ = method6324((((Class370) this).aShortArray4285[i_128_ + i_144_]), i_125_, i_126_, i_139_);
						i_147_ = method6324((((Class370) this).aShortArray4285[i_129_ + i_144_]), i_137_, i_126_, i_139_);
						i_148_ = i_146_ + (i_134_ * (i_147_ - i_146_) >> 12);
						i_146_ = method6324((((Class370) this).aShortArray4285[i_128_ + i_145_]), i_125_, i_138_, i_139_);
						i_147_ = method6324((((Class370) this).aShortArray4285[i_129_ + i_145_]), i_137_, i_138_, i_139_);
						i_149_ = i_146_ + (i_134_ * (i_147_ - i_146_) >> 12);
						int i_151_ = i_148_ + (i_135_ * (i_149_ - i_148_) >> 12);
						method6337(i_120_, i_150_ + (i_136_ * (i_151_ - i_150_) >> 12));
					}
					method6321();
				}
			}
		}
	}

	abstract void method6330();

	abstract void method6331();

	abstract void method6332();

	abstract void method6333(int i, int i_152_);

	abstract void method6334(int i, int i_153_);

	void method6335() {
		((Class370) this).aShortArray4281 = new short[((Class370) this).anInt4290];
		for (int i = 0; i < ((Class370) this).anInt4290; i++)
			((Class370) this).aShortArray4281[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	void method6336() {
		((Class370) this).aShortArray4281 = new short[((Class370) this).anInt4290];
		for (int i = 0; i < ((Class370) this).anInt4290; i++)
			((Class370) this).aShortArray4281[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	abstract void method6337(int i, int i_154_);

	static int method6338(int i, int i_155_, int i_156_, int i_157_) {
		int i_158_ = i & 0xf;
		int i_159_ = i_158_ < 8 ? i_155_ : i_156_;
		int i_160_ = (i_158_ < 4 ? i_156_ : i_158_ == 12 || i_158_ == 14 ? i_155_ : i_157_);
		return (((i_158_ & 0x1) == 0 ? i_159_ : -i_159_) + ((i_158_ & 0x2) == 0 ? i_160_ : -i_160_));
	}

	void method6339(int i, int i_161_, int i_162_) {
		int[] is = new int[i];
		int[] is_163_ = new int[i_161_];
		int[] is_164_ = new int[i_162_];
		for (int i_165_ = 0; i_165_ < i; i_165_++)
			is[i_165_] = (i_165_ << 12) / i;
		for (int i_166_ = 0; i_166_ < i_161_; i_166_++)
			is_163_[i_166_] = (i_166_ << 12) / i_161_;
		for (int i_167_ = 0; i_167_ < i_162_; i_167_++)
			is_164_[i_167_] = (i_167_ << 12) / i_162_;
		method6332();
		for (int i_168_ = 0; i_168_ < i_162_; i_168_++) {
			for (int i_169_ = 0; i_169_ < i_161_; i_169_++) {
				for (int i_170_ = 0; i_170_ < i; i_170_++) {
					for (int i_171_ = 0; i_171_ < ((Class370) this).anInt4290; i_171_++) {
						int i_172_ = ((Class370) this).aShortArray4281[i_171_] << 12;
						int i_173_ = ((Class370) this).anInt4286 * i_172_ >> 12;
						int i_174_ = ((Class370) this).anInt4288 * i_172_ >> 12;
						int i_175_ = ((Class370) this).anInt4289 * i_172_ >> 12;
						int i_176_ = is[i_170_] * i_172_ >> 12;
						int i_177_ = is_163_[i_169_] * i_172_ >> 12;
						int i_178_ = is_164_[i_168_] * i_172_ >> 12;
						i_176_ *= ((Class370) this).anInt4286;
						i_177_ *= ((Class370) this).anInt4288;
						i_178_ *= ((Class370) this).anInt4289;
						int i_179_ = i_176_ >> 12;
						int i_180_ = i_179_ + 1;
						i_179_ &= 0xff;
						int i_181_ = i_177_ >> 12;
						int i_182_ = i_181_ + 1;
						i_181_ &= 0xff;
						int i_183_ = i_178_ >> 12;
						int i_184_ = i_183_ + 1;
						i_183_ &= 0xff;
						if (i_180_ >= i_173_)
							i_180_ = 0;
						else
							i_180_ &= 0xff;
						if (i_182_ >= i_174_)
							i_182_ = 0;
						else
							i_182_ &= 0xff;
						if (i_184_ >= i_175_)
							i_184_ = 0;
						else
							i_184_ &= 0xff;
						i_176_ &= 0xfff;
						i_177_ &= 0xfff;
						i_178_ &= 0xfff;
						int i_185_ = anIntArray4291[i_176_];
						int i_186_ = anIntArray4291[i_177_];
						int i_187_ = anIntArray4291[i_178_];
						int i_188_ = i_176_ - 4096;
						int i_189_ = i_177_ - 4096;
						int i_190_ = i_178_ - 4096;
						int i_191_ = ((Class370) this).aShortArray4285[i_183_];
						int i_192_ = ((Class370) this).aShortArray4285[i_184_];
						int i_193_ = (((Class370) this).aShortArray4285[i_181_ + i_191_]);
						int i_194_ = (((Class370) this).aShortArray4285[i_182_ + i_191_]);
						int i_195_ = (((Class370) this).aShortArray4285[i_181_ + i_192_]);
						int i_196_ = (((Class370) this).aShortArray4285[i_182_ + i_192_]);
						int i_197_ = method6324((((Class370) this).aShortArray4285[i_179_ + i_193_]), i_176_, i_177_, i_178_);
						int i_198_ = method6324((((Class370) this).aShortArray4285[i_180_ + i_193_]), i_188_, i_177_, i_178_);
						int i_199_ = i_197_ + (i_185_ * (i_198_ - i_197_) >> 12);
						i_197_ = method6324((((Class370) this).aShortArray4285[i_179_ + i_194_]), i_176_, i_189_, i_178_);
						i_198_ = method6324((((Class370) this).aShortArray4285[i_180_ + i_194_]), i_188_, i_189_, i_178_);
						int i_200_ = i_197_ + (i_185_ * (i_198_ - i_197_) >> 12);
						int i_201_ = i_199_ + (i_186_ * (i_200_ - i_199_) >> 12);
						i_197_ = method6324((((Class370) this).aShortArray4285[i_179_ + i_195_]), i_176_, i_177_, i_190_);
						i_198_ = method6324((((Class370) this).aShortArray4285[i_180_ + i_195_]), i_188_, i_177_, i_190_);
						i_199_ = i_197_ + (i_185_ * (i_198_ - i_197_) >> 12);
						i_197_ = method6324((((Class370) this).aShortArray4285[i_179_ + i_196_]), i_176_, i_189_, i_190_);
						i_198_ = method6324((((Class370) this).aShortArray4285[i_180_ + i_196_]), i_188_, i_189_, i_190_);
						i_200_ = i_197_ + (i_185_ * (i_198_ - i_197_) >> 12);
						int i_202_ = i_199_ + (i_186_ * (i_200_ - i_199_) >> 12);
						method6337(i_171_, i_201_ + (i_187_ * (i_202_ - i_201_) >> 12));
					}
					method6321();
				}
			}
		}
	}

	abstract void method6340();

	static int method6341(int i, int i_203_, int i_204_, int i_205_) {
		int i_206_ = i & 0xf;
		int i_207_ = i_206_ < 8 ? i_203_ : i_204_;
		int i_208_ = (i_206_ < 4 ? i_204_ : i_206_ == 12 || i_206_ == 14 ? i_203_ : i_205_);
		return (((i_206_ & 0x1) == 0 ? i_207_ : -i_207_) + ((i_206_ & 0x2) == 0 ? i_208_ : -i_208_));
	}

	static int method6342(int i, int i_209_, int i_210_, int i_211_) {
		int i_212_ = i & 0xf;
		int i_213_ = i_212_ < 8 ? i_209_ : i_210_;
		int i_214_ = (i_212_ < 4 ? i_210_ : i_212_ == 12 || i_212_ == 14 ? i_209_ : i_211_);
		return (((i_212_ & 0x1) == 0 ? i_213_ : -i_213_) + ((i_212_ & 0x2) == 0 ? i_214_ : -i_214_));
	}

	static final int method6343(int i) {
		int i_215_ = i * (i * i >> 12) >> 12;
		int i_216_ = i * 6 - 61440;
		int i_217_ = 40960 + (i_216_ * i >> 12);
		return i_217_ * i_215_ >> 12;
	}

	abstract void method6344();

	abstract void method6345();

	static final int method6346(int i) {
		int i_218_ = i * (i * i >> 12) >> 12;
		int i_219_ = i * 6 - 61440;
		int i_220_ = 40960 + (i_219_ * i >> 12);
		return i_220_ * i_218_ >> 12;
	}
}
