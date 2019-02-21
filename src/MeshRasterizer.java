/* Class528 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class MeshRasterizer {
	protected boolean aBool7023 = false;
	static final float aFloat7024 = 3.1415927F;

	public abstract void bc(int i, int i_0_, Class390 class390, Class390 class390_1_, int i_2_, int i_3_, int i_4_);

	public abstract Class87[] method11253();

	public abstract int o();

	int method11254(float f, float f_5_, float f_6_) {
		float f_7_ = f < 0.0F ? -f : f;
		float f_8_ = f_5_ < 0.0F ? -f_5_ : f_5_;
		float f_9_ = f_6_ < 0.0F ? -f_6_ : f_6_;
		if (f_8_ > f_7_ && f_8_ > f_9_) {
			if (f_5_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_9_ > f_7_ && f_9_ > f_8_) {
			if (f_6_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	void method11255(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, float[] fs, int i_16_, float f, float f_17_, float f_18_, float[] fs_19_) {
		i -= i_12_;
		i_10_ -= i_13_;
		i_11_ -= i_14_;
		float f_20_ = ((float) i * fs[0] + (float) i_10_ * fs[1] + (float) i_11_ * fs[2]);
		float f_21_ = ((float) i * fs[3] + (float) i_10_ * fs[4] + (float) i_11_ * fs[5]);
		float f_22_ = ((float) i * fs[6] + (float) i_10_ * fs[7] + (float) i_11_ * fs[8]);
		float f_23_;
		float f_24_;
		if (i_15_ == 0) {
			f_23_ = f_20_ + f + 0.5F;
			f_24_ = -f_22_ + f_18_ + 0.5F;
		} else if (i_15_ == 1) {
			f_23_ = f_20_ + f + 0.5F;
			f_24_ = f_22_ + f_18_ + 0.5F;
		} else if (i_15_ == 2) {
			f_23_ = -f_20_ + f + 0.5F;
			f_24_ = -f_21_ + f_17_ + 0.5F;
		} else if (i_15_ == 3) {
			f_23_ = f_20_ + f + 0.5F;
			f_24_ = -f_21_ + f_17_ + 0.5F;
		} else if (i_15_ == 4) {
			f_23_ = f_22_ + f_18_ + 0.5F;
			f_24_ = -f_21_ + f_17_ + 0.5F;
		} else {
			f_23_ = -f_22_ + f_18_ + 0.5F;
			f_24_ = -f_21_ + f_17_ + 0.5F;
		}
		if (i_16_ == 1) {
			float f_25_ = f_23_;
			f_23_ = -f_24_;
			f_24_ = f_25_;
		} else if (i_16_ == 2) {
			f_23_ = -f_23_;
			f_24_ = -f_24_;
		} else if (i_16_ == 3) {
			float f_26_ = f_23_;
			f_23_ = f_24_;
			f_24_ = -f_26_;
		}
		fs_19_[0] = f_23_;
		fs_19_[1] = f_24_;
	}

	Class83 method11256(RSMesh class157, int[] is, int i) {
		int[] is_27_ = null;
		int[] is_28_ = null;
		int[] is_29_ = null;
		float[][] fs = null;
		if (class157.aByteArray1988 != null) {
			int i_30_ = class157.anInt1979;
			int[] is_31_ = new int[i_30_];
			int[] is_32_ = new int[i_30_];
			int[] is_33_ = new int[i_30_];
			int[] is_34_ = new int[i_30_];
			int[] is_35_ = new int[i_30_];
			int[] is_36_ = new int[i_30_];
			for (int i_37_ = 0; i_37_ < i_30_; i_37_++) {
				is_31_[i_37_] = 2147483647;
				is_32_[i_37_] = -2147483647;
				is_33_[i_37_] = 2147483647;
				is_34_[i_37_] = -2147483647;
				is_35_[i_37_] = 2147483647;
				is_36_[i_37_] = -2147483647;
			}
			for (int i_38_ = 0; i_38_ < i; i_38_++) {
				int i_39_ = is[i_38_];
				if (class157.aByteArray1988[i_39_] != -1) {
					int i_40_ = class157.aByteArray1988[i_39_] & 0xff;
					for (int i_41_ = 0; i_41_ < 3; i_41_++) {
						short i_42_;
						if (i_41_ == 0)
							i_42_ = class157.aShortArray1982[i_39_];
						else if (i_41_ == 1)
							i_42_ = class157.aShortArray1983[i_39_];
						else
							i_42_ = class157.aShortArray1984[i_39_];
						int i_43_ = class157.anIntArray1976[i_42_];
						int i_44_ = class157.anIntArray2003[i_42_];
						int i_45_ = class157.anIntArray1978[i_42_];
						if (i_43_ < is_31_[i_40_])
							is_31_[i_40_] = i_43_;
						if (i_43_ > is_32_[i_40_])
							is_32_[i_40_] = i_43_;
						if (i_44_ < is_33_[i_40_])
							is_33_[i_40_] = i_44_;
						if (i_44_ > is_34_[i_40_])
							is_34_[i_40_] = i_44_;
						if (i_45_ < is_35_[i_40_])
							is_35_[i_40_] = i_45_;
						if (i_45_ > is_36_[i_40_])
							is_36_[i_40_] = i_45_;
					}
				}
			}
			is_27_ = new int[i_30_];
			is_28_ = new int[i_30_];
			is_29_ = new int[i_30_];
			fs = new float[i_30_][];
			for (int i_46_ = 0; i_46_ < i_30_; i_46_++) {
				byte i_47_ = class157.aByteArray1995[i_46_];
				if (i_47_ > 0) {
					is_27_[i_46_] = (is_31_[i_46_] + is_32_[i_46_]) / 2;
					is_28_[i_46_] = (is_33_[i_46_] + is_34_[i_46_]) / 2;
					is_29_[i_46_] = (is_35_[i_46_] + is_36_[i_46_]) / 2;
					float f;
					float f_48_;
					float f_49_;
					if (i_47_ == 1) {
						int i_50_ = class157.anIntArray1989[i_46_];
						if (i_50_ == 0) {
							f = 1.0F;
							f_49_ = 1.0F;
						} else if (i_50_ > 0) {
							f = 1.0F;
							f_49_ = (float) i_50_ / 1024.0F;
						} else {
							f_49_ = 1.0F;
							f = (float) -i_50_ / 1024.0F;
						}
						f_48_ = 64.0F / (float) class157.anIntArray2000[i_46_];
					} else if (i_47_ == 2) {
						f = 64.0F / (float) class157.anIntArray1989[i_46_];
						f_48_ = 64.0F / (float) class157.anIntArray2000[i_46_];
						f_49_ = 64.0F / (float) class157.anIntArray2001[i_46_];
					} else {
						f = (float) class157.anIntArray1989[i_46_] / 1024.0F;
						f_48_ = (float) class157.anIntArray2000[i_46_] / 1024.0F;
						f_49_ = (float) class157.anIntArray2001[i_46_] / 1024.0F;
					}
					fs[i_46_] = method11257(class157.aShortArray1996[i_46_], class157.aShortArray1987[i_46_], class157.aShortArray1998[i_46_], class157.aByteArray2005[i_46_] & 0xff, f, f_48_, f_49_);
				}
			}
		}
		return new Class83(this, is_27_, is_28_, is_29_, fs);
	}

	float[] method11257(int i, int i_51_, int i_52_, int i_53_, float f, float f_54_, float f_55_) {
		float[] fs = new float[9];
		float[] fs_56_ = new float[9];
		float f_57_ = (float) Math.cos((double) ((float) i_53_ * 0.024543693F));
		float f_58_ = (float) Math.sin((double) ((float) i_53_ * 0.024543693F));
		float f_59_ = 1.0F - f_57_;
		fs[0] = f_57_;
		fs[1] = 0.0F;
		fs[2] = f_58_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_58_;
		fs[7] = 0.0F;
		fs[8] = f_57_;
		float[] fs_60_ = new float[9];
		float f_61_ = 1.0F;
		float f_62_ = 0.0F;
		f_57_ = (float) i_51_ / 32767.0F;
		f_58_ = -(float) Math.sqrt((double) (1.0F - f_57_ * f_57_));
		f_59_ = 1.0F - f_57_;
		float f_63_ = (float) Math.sqrt((double) (i * i + i_52_ * i_52_));
		if (f_63_ == 0.0F && f_57_ == 0.0F)
			fs_56_ = fs;
		else {
			if (f_63_ != 0.0F) {
				f_61_ = (float) -i_52_ / f_63_;
				f_62_ = (float) i / f_63_;
			}
			fs_60_[0] = f_57_ + f_61_ * f_61_ * f_59_;
			fs_60_[1] = f_62_ * f_58_;
			fs_60_[2] = f_62_ * f_61_ * f_59_;
			fs_60_[3] = -f_62_ * f_58_;
			fs_60_[4] = f_57_;
			fs_60_[5] = f_61_ * f_58_;
			fs_60_[6] = f_61_ * f_62_ * f_59_;
			fs_60_[7] = -f_61_ * f_58_;
			fs_60_[8] = f_57_ + f_62_ * f_62_ * f_59_;
			fs_56_[0] = fs[0] * fs_60_[0] + fs[1] * fs_60_[3] + fs[2] * fs_60_[6];
			fs_56_[1] = fs[0] * fs_60_[1] + fs[1] * fs_60_[4] + fs[2] * fs_60_[7];
			fs_56_[2] = fs[0] * fs_60_[2] + fs[1] * fs_60_[5] + fs[2] * fs_60_[8];
			fs_56_[3] = fs[3] * fs_60_[0] + fs[4] * fs_60_[3] + fs[5] * fs_60_[6];
			fs_56_[4] = fs[3] * fs_60_[1] + fs[4] * fs_60_[4] + fs[5] * fs_60_[7];
			fs_56_[5] = fs[3] * fs_60_[2] + fs[4] * fs_60_[5] + fs[5] * fs_60_[8];
			fs_56_[6] = fs[6] * fs_60_[0] + fs[7] * fs_60_[3] + fs[8] * fs_60_[6];
			fs_56_[7] = fs[6] * fs_60_[1] + fs[7] * fs_60_[4] + fs[8] * fs_60_[7];
			fs_56_[8] = fs[6] * fs_60_[2] + fs[7] * fs_60_[5] + fs[8] * fs_60_[8];
		}
		fs_56_[0] *= f;
		fs_56_[1] *= f;
		fs_56_[2] *= f;
		fs_56_[3] *= f_54_;
		fs_56_[4] *= f_54_;
		fs_56_[5] *= f_54_;
		fs_56_[6] *= f_55_;
		fs_56_[7] *= f_55_;
		fs_56_[8] *= f_55_;
		return fs_56_;
	}

	public abstract void ia(int i, int i_64_, int i_65_);

	public final void method11258(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, boolean bool, int[] is) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				AnimationSkin class95_72_ = null;
				if (class282_sub50_sub13_66_ != null) {
					class95_72_ = (((AnimationSkeleton) class282_sub50_sub13_66_).animationSkins[i_67_]);
					if (((AnimationSkin) class95_72_).skinNodeList != class282_sub12)
						class95_72_ = null;
				}
				method11266(class282_sub12, class95, class95_72_, i_68_, i_69_, i_70_, null, false, bool, i_71_, is);
				ka();
				method11261();
			}
		}
	}

	public abstract int m();

	public abstract void method11259();

	public abstract void f(int i);

	public abstract void ep(int i, int i_73_, int i_74_);

	public abstract void t(int i);

	abstract void e(int i, int[] is, int i_75_, int i_76_, int i_77_, boolean bool, int i_78_, int[] is_79_);

	public abstract int dq();

	public abstract void wa();

	public abstract void oa(int i, int i_80_, int i_81_);

	public abstract void df(short i, short i_82_);

	abstract boolean bh();

	abstract void method11260();

	abstract void method11261();

	public final void method11262(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_83_, int i_84_, int i_85_, int i_86_, int i_87_, boolean bool) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				AnimationSkin class95_88_ = null;
				if (class282_sub50_sub13_83_ != null) {
					class95_88_ = (((AnimationSkeleton) class282_sub50_sub13_83_).animationSkins[i_84_]);
					if (((AnimationSkin) class95_88_).skinNodeList != class282_sub12)
						class95_88_ = null;
				}
				method11266(class282_sub12, class95, class95_88_, i_85_, i_86_, i_87_, null, false, bool, 65535, null);
				ka();
				method11261();
			}
		}
	}

	public abstract void method11263(Matrix44Var class294, int i, boolean bool);

	public final void method11264(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_89_, int i_90_, int i_91_, int i_92_, AnimationSkeleton class282_sub50_sub13_93_, int i_94_, AnimationSkeleton class282_sub50_sub13_95_, int i_96_, int i_97_, int i_98_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_94_ == -1)
				method11262(class282_sub50_sub13, i, class282_sub50_sub13_89_, i_90_, i_91_, i_92_, 0, bool);
			else {
				method11260();
				if (!ea())
					method11261();
				else {
					AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
					AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
					AnimationSkin class95_99_ = null;
					if (class282_sub50_sub13_89_ != null) {
						class95_99_ = (((AnimationSkeleton) class282_sub50_sub13_89_).animationSkins[i_90_]);
						if (((AnimationSkin) class95_99_).skinNodeList != class282_sub12)
							class95_99_ = null;
					}
					method11266(class282_sub12, class95, class95_99_, i_91_, i_92_, 0, bools, false, bool, 65535, null);
					AnimationSkin class95_100_ = (((AnimationSkeleton) class282_sub50_sub13_93_).animationSkins[i_94_]);
					AnimationSkin class95_101_ = null;
					if (class282_sub50_sub13_95_ != null) {
						class95_101_ = (((AnimationSkeleton) class282_sub50_sub13_95_).animationSkins[i_96_]);
						if (((AnimationSkin) class95_101_).skinNodeList != class282_sub12)
							class95_101_ = null;
					}
					method11268(0, new int[0], 0, 0, 0, 0, bool);
					method11266(((AnimationSkin) class95_100_).skinNodeList, class95_100_, class95_101_, i_97_, i_98_, 0, bools, true, bool, 65535, null);
					ka();
					method11261();
				}
			}
		}
	}

	void method11265(int i, int[] is, int i_102_, int i_103_, int i_104_, int i_105_, boolean bool, int i_106_, int[] is_107_) {
		if (i_105_ == 1) {
			if (i == 0 || i == 1) {
				int i_108_ = -i_102_;
				i_102_ = i_104_;
				i_104_ = i_108_;
			} else if (i == 3) {
				int i_109_ = i_102_;
				i_102_ = i_104_;
				i_104_ = i_109_;
			} else if (i == 2) {
				int i_110_ = i_102_;
				i_102_ = -i_104_ & 0x3fff;
				i_104_ = i_110_ & 0x3fff;
			}
		} else if (i_105_ == 2) {
			if (i == 0 || i == 1) {
				i_102_ = -i_102_;
				i_104_ = -i_104_;
			} else if (i == 2) {
				i_102_ = -i_102_ & 0x3fff;
				i_104_ = -i_104_ & 0x3fff;
			}
		} else if (i_105_ == 3) {
			if (i == 0 || i == 1) {
				int i_111_ = i_102_;
				i_102_ = -i_104_;
				i_104_ = i_111_;
			} else if (i == 3) {
				int i_112_ = i_102_;
				i_102_ = i_104_;
				i_104_ = i_112_;
			} else if (i == 2) {
				int i_113_ = i_102_;
				i_102_ = i_104_ & 0x3fff;
				i_104_ = -i_113_ & 0x3fff;
			}
		}
		if (i_106_ != 65535)
			e(i, is, i_102_, i_103_, i_104_, bool, i_106_, is_107_);
		else
			method11268(i, is, i_102_, i_103_, i_104_, i_105_, bool);
	}

	void method11266(AnimationSkinNode class282_sub12, AnimationSkin class95, AnimationSkin class95_114_, int i, int i_115_, int i_116_, boolean[] bools, boolean bool, boolean bool_117_, int i_118_, int[] is) {
		if (class95_114_ == null || i == 0) {
			for (int i_119_ = 0; i_119_ < ((AnimationSkin) class95).anInt980; i_119_++) {
				short i_120_ = ((AnimationSkin) class95).aShortArray987[i_119_];
				if (bools == null || bools[i_120_] == bool || (((AnimationSkinNode) class282_sub12).anIntArray7562[i_120_]) == 0) {
					short i_121_ = ((AnimationSkin) class95).aShortArray984[i_119_];
					if (i_121_ != -1)
						method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_121_]), 0, 0, 0, i_116_, bool_117_, i_118_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_121_]), is);
					method11267((((AnimationSkinNode) class282_sub12).anIntArray7562[i_120_]), (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_120_]), ((AnimationSkin) class95).aShortArray981[i_119_], ((AnimationSkin) class95).aShortArray982[i_119_], ((AnimationSkin) class95).aShortArray983[i_119_], i_116_, bool_117_, i_118_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_120_]), is);
				}
			}
		} else {
			int i_122_ = 0;
			int i_123_ = 0;
			for (int i_124_ = 0; (i_124_ < ((AnimationSkinNode) class282_sub12).anInt7564 * 1693890341); i_124_++) {
				boolean bool_125_ = false;
				if (i_122_ < ((AnimationSkin) class95).anInt980 && ((AnimationSkin) class95).aShortArray987[i_122_] == i_124_)
					bool_125_ = true;
				boolean bool_126_ = false;
				if (i_123_ < ((AnimationSkin) class95_114_).anInt980 && (((AnimationSkin) class95_114_).aShortArray987[i_123_] == i_124_))
					bool_126_ = true;
				if (bool_125_ || bool_126_) {
					if (bools != null && bools[i_124_] != bool && (((AnimationSkinNode) class282_sub12).anIntArray7562[i_124_]) != 0) {
						if (bool_125_)
							i_122_++;
						if (bool_126_)
							i_123_++;
					} else {
						int i_127_ = 0;
						int i_128_ = (((AnimationSkinNode) class282_sub12).anIntArray7562[i_124_]);
						if (i_128_ == 3 || i_128_ == 10)
							i_127_ = 128;
						int i_129_;
						int i_130_;
						int i_131_;
						short i_132_;
						byte i_133_;
						if (bool_125_) {
							i_129_ = ((AnimationSkin) class95).aShortArray981[i_122_];
							i_130_ = ((AnimationSkin) class95).aShortArray982[i_122_];
							i_131_ = ((AnimationSkin) class95).aShortArray983[i_122_];
							i_132_ = ((AnimationSkin) class95).aShortArray984[i_122_];
							i_133_ = ((AnimationSkin) class95).aByteArray985[i_122_];
							i_122_++;
						} else {
							i_129_ = i_127_;
							i_130_ = i_127_;
							i_131_ = i_127_;
							i_132_ = (short) -1;
							i_133_ = (byte) 0;
						}
						int i_134_;
						int i_135_;
						int i_136_;
						short i_137_;
						byte i_138_;
						if (bool_126_) {
							i_134_ = (((AnimationSkin) class95_114_).aShortArray981[i_123_]);
							i_135_ = (((AnimationSkin) class95_114_).aShortArray982[i_123_]);
							i_136_ = (((AnimationSkin) class95_114_).aShortArray983[i_123_]);
							i_137_ = (((AnimationSkin) class95_114_).aShortArray984[i_123_]);
							i_138_ = (((AnimationSkin) class95_114_).aByteArray985[i_123_]);
							i_123_++;
						} else {
							i_134_ = i_127_;
							i_135_ = i_127_;
							i_136_ = i_127_;
							i_137_ = (short) -1;
							i_138_ = (byte) 0;
						}
						int i_139_;
						int i_140_;
						int i_141_;
						if ((i_133_ & 0x2) != 0 || (i_138_ & 0x1) != 0) {
							i_139_ = i_129_;
							i_140_ = i_130_;
							i_141_ = i_131_;
						} else if (i_128_ == 2) {
							int i_142_ = i_134_ - i_129_ & 0x3fff;
							int i_143_ = i_135_ - i_130_ & 0x3fff;
							int i_144_ = i_136_ - i_131_ & 0x3fff;
							if (i_142_ >= 8192)
								i_142_ -= 16384;
							if (i_143_ >= 8192)
								i_143_ -= 16384;
							if (i_144_ >= 8192)
								i_144_ -= 16384;
							i_139_ = i_129_ + i_142_ * i / i_115_ & 0x3fff;
							i_140_ = i_130_ + i_143_ * i / i_115_ & 0x3fff;
							i_141_ = i_131_ + i_144_ * i / i_115_ & 0x3fff;
						} else if (i_128_ == 9) {
							int i_145_ = i_134_ - i_129_ & 0x3fff;
							if (i_145_ >= 8192)
								i_145_ -= 16384;
							i_139_ = i_129_ + i_145_ * i / i_115_ & 0x3fff;
							i_141_ = 0;
							i_140_ = 0;
						} else if (i_128_ == 7) {
							int i_146_ = i_134_ - i_129_ & 0x3f;
							if (i_146_ >= 32)
								i_146_ -= 64;
							i_139_ = i_129_ + i_146_ * i / i_115_ & 0x3f;
							i_140_ = i_130_ + (i_135_ - i_130_) * i / i_115_;
							i_141_ = i_131_ + (i_136_ - i_131_) * i / i_115_;
						} else {
							i_139_ = i_129_ + (i_134_ - i_129_) * i / i_115_;
							i_140_ = i_130_ + (i_135_ - i_130_) * i / i_115_;
							i_141_ = i_131_ + (i_136_ - i_131_) * i / i_115_;
						}
						if (i_132_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_132_]), 0, 0, 0, i_116_, bool_117_, (i_118_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_132_])), is);
						else if (i_137_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_137_]), 0, 0, 0, i_116_, bool_117_, (i_118_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_137_])), is);
						method11267(i_128_, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_124_]), i_139_, i_140_, i_141_, i_116_, bool_117_, i_118_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_124_]), is);
					}
				}
			}
		}
	}

	void method11267(int i, int[] is, int i_147_, int i_148_, int i_149_, int i_150_, boolean bool, int i_151_, int[] is_152_) {
		if (i_150_ == 1) {
			if (i == 0 || i == 1) {
				int i_153_ = -i_147_;
				i_147_ = i_149_;
				i_149_ = i_153_;
			} else if (i == 3) {
				int i_154_ = i_147_;
				i_147_ = i_149_;
				i_149_ = i_154_;
			} else if (i == 2) {
				int i_155_ = i_147_;
				i_147_ = -i_149_ & 0x3fff;
				i_149_ = i_155_ & 0x3fff;
			}
		} else if (i_150_ == 2) {
			if (i == 0 || i == 1) {
				i_147_ = -i_147_;
				i_149_ = -i_149_;
			} else if (i == 2) {
				i_147_ = -i_147_ & 0x3fff;
				i_149_ = -i_149_ & 0x3fff;
			}
		} else if (i_150_ == 3) {
			if (i == 0 || i == 1) {
				int i_156_ = i_147_;
				i_147_ = -i_149_;
				i_149_ = i_156_;
			} else if (i == 3) {
				int i_157_ = i_147_;
				i_147_ = i_149_;
				i_149_ = i_157_;
			} else if (i == 2) {
				int i_158_ = i_147_;
				i_147_ = i_149_ & 0x3fff;
				i_149_ = -i_158_ & 0x3fff;
			}
		}
		if (i_151_ != 65535)
			e(i, is, i_147_, i_148_, i_149_, bool, i_151_, is_152_);
		else
			method11268(i, is, i_147_, i_148_, i_149_, i_150_, bool);
	}

	public abstract void bk(int i);

	abstract void method11268(int i, int[] is, int i_159_, int i_160_, int i_161_, int i_162_, boolean bool);

	public abstract void Q(int i);

	public abstract void method11269(MeshRasterizer class528_163_, int i, int i_164_, int i_165_, boolean bool);

	abstract void ka();

	abstract void bo(int i, int i_166_, int i_167_, int i_168_);

	public abstract int ct();

	public abstract boolean method11270(int i, int i_169_, Matrix44Var class294, boolean bool, int i_170_);

	public abstract Class282_Sub50_Sub17 ga(Class282_Sub50_Sub17 class282_sub50_sub17);

	public abstract int N();

	public abstract int n();

	public abstract int RA();

	abstract void bl(int i, int[] is, int i_171_, int i_172_, int i_173_, boolean bool, int i_174_, int[] is_175_);

	public abstract int YA();

	public abstract int dp();

	public abstract int AA();

	public abstract int ha();

	public abstract void KA(int i);

	MeshRasterizer() {
		/* empty */
	}

	public abstract void bz(int i);

	public abstract int Z();

	public abstract byte[] aw();

	public abstract boolean dh();

	void method11271(int i, int i_176_, int i_177_, int i_178_, int i_179_, int i_180_, float[] fs, int i_181_, float f, float[] fs_182_) {
		i -= i_178_;
		i_176_ -= i_179_;
		i_177_ -= i_180_;
		float f_183_ = ((float) i * fs[0] + (float) i_176_ * fs[1] + (float) i_177_ * fs[2]);
		float f_184_ = ((float) i * fs[3] + (float) i_176_ * fs[4] + (float) i_177_ * fs[5]);
		float f_185_ = ((float) i * fs[6] + (float) i_176_ * fs[7] + (float) i_177_ * fs[8]);
		float f_186_ = (float) Math.sqrt((double) (f_183_ * f_183_ + f_184_ * f_184_ + f_185_ * f_185_));
		float f_187_ = (((float) Math.atan2((double) f_183_, (double) f_185_) / 6.2831855F) + 0.5F);
		float f_188_ = ((float) Math.asin((double) (f_184_ / f_186_)) / 3.1415927F + 0.5F + f);
		if (i_181_ == 1) {
			float f_189_ = f_187_;
			f_187_ = -f_188_;
			f_188_ = f_189_;
		} else if (i_181_ == 2) {
			f_187_ = -f_187_;
			f_188_ = -f_188_;
		} else if (i_181_ == 3) {
			float f_190_ = f_187_;
			f_187_ = f_188_;
			f_188_ = -f_190_;
		}
		fs_182_[0] = f_187_;
		fs_182_[1] = f_188_;
	}

	public abstract void W(short i, short i_191_);

	public abstract void PA(int i, int i_192_, int i_193_, int i_194_);

	public abstract boolean successful();

	public abstract boolean i();

	public abstract boolean u();

	public abstract void method11273(Matrix44Var class294);

	public abstract int cw();

	public abstract Class172[] method11274();

	abstract void method11275(int i, int[] is, int i_195_, int i_196_, int i_197_, int i_198_, boolean bool);

	public abstract void bj(int i);

	public abstract MeshRasterizer method11276(byte i, int i_199_, boolean bool);

	public abstract MeshRasterizer method11277(byte i, int i_200_, boolean bool);

	public abstract MeshRasterizer method11278(byte i, int i_201_, boolean bool);

	public abstract MeshRasterizer method11279(byte i, int i_202_, boolean bool);

	void method11280(int i, int i_203_, int i_204_, int i_205_, int i_206_, int i_207_, float[] fs, float f, int i_208_, float f_209_, float[] fs_210_) {
		i -= i_205_;
		i_203_ -= i_206_;
		i_204_ -= i_207_;
		float f_211_ = ((float) i * fs[0] + (float) i_203_ * fs[1] + (float) i_204_ * fs[2]);
		float f_212_ = ((float) i * fs[3] + (float) i_203_ * fs[4] + (float) i_204_ * fs[5]);
		float f_213_ = ((float) i * fs[6] + (float) i_203_ * fs[7] + (float) i_204_ * fs[8]);
		float f_214_ = (((float) Math.atan2((double) f_211_, (double) f_213_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_214_ *= f;
		float f_215_ = f_212_ + 0.5F + f_209_;
		if (i_208_ == 1) {
			float f_216_ = f_214_;
			f_214_ = -f_215_;
			f_215_ = f_216_;
		} else if (i_208_ == 2) {
			f_214_ = -f_214_;
			f_215_ = -f_215_;
		} else if (i_208_ == 3) {
			float f_217_ = f_214_;
			f_214_ = f_215_;
			f_215_ = -f_217_;
		}
		fs_210_[0] = f_214_;
		fs_210_[1] = f_215_;
	}

	void method11281(Class390 class390, int i, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_) {
		boolean bool = false;
		boolean bool_224_ = false;
		boolean bool_225_ = false;
		int i_226_ = -i_220_ / 2;
		int i_227_ = -i_221_ / 2;
		int i_228_ = class390.method6709(i + i_226_, i_219_ + i_227_, 2029342916);
		int i_229_ = i_220_ / 2;
		int i_230_ = -i_221_ / 2;
		int i_231_ = class390.method6709(i + i_229_, i_219_ + i_230_, 211604312);
		int i_232_ = -i_220_ / 2;
		int i_233_ = i_221_ / 2;
		int i_234_ = class390.method6709(i + i_232_, i_219_ + i_233_, -1995785916);
		int i_235_ = i_220_ / 2;
		int i_236_ = i_221_ / 2;
		int i_237_ = class390.method6709(i + i_235_, i_219_ + i_236_, 1123501570);
		int i_238_ = i_228_ < i_231_ ? i_228_ : i_231_;
		int i_239_ = i_234_ < i_237_ ? i_234_ : i_237_;
		int i_240_ = i_231_ < i_237_ ? i_231_ : i_237_;
		int i_241_ = i_228_ < i_234_ ? i_228_ : i_234_;
		if (i_221_ != 0) {
			int i_242_ = ((int) (Math.atan2((double) (i_238_ - i_239_), (double) i_221_) * 2607.5945876176133) & 0x3fff);
			if (i_242_ != 0) {
				if (i_222_ != 0) {
					if (i_242_ > 8192) {
						int i_243_ = 16384 - i_222_;
						if (i_242_ < i_243_)
							i_242_ = i_243_;
					} else if (i_242_ > i_222_)
						i_242_ = i_222_;
				}
				t(i_242_);
			}
		}
		if (i_220_ != 0) {
			int i_244_ = ((int) (Math.atan2((double) (i_241_ - i_240_), (double) i_220_) * 2607.5945876176133) & 0x3fff);
			if (i_244_ != 0) {
				if (i_223_ != 0) {
					if (i_244_ > 8192) {
						int i_245_ = 16384 - i_223_;
						if (i_244_ < i_245_)
							i_244_ = i_245_;
					} else if (i_244_ > i_223_)
						i_244_ = i_223_;
				}
				EA(i_244_);
			}
		}
		int i_246_ = i_228_ + i_237_;
		if (i_231_ + i_234_ < i_246_)
			i_246_ = i_231_ + i_234_;
		i_246_ = (i_246_ >> 1) - i_218_;
		if (i_246_ != 0)
			ia(0, i_246_, 0);
	}

	public abstract int ae();

	public abstract void aq(int i);

	public abstract int cu();

	public abstract void method11282(Matrix44Var class294, Class275_Sub5 class275_sub5, int i);

	public abstract void X(short i, short i_247_);

	public abstract void bx(int i);

	public abstract Class172[] method11283();

	public abstract int ya();

	public abstract void bm(int i);

	public abstract int ca();

	public abstract int c();

	public abstract void bf(int i);

	public abstract void bn(int i);

	public abstract void be();

	public final void method11284(AnimationSkeleton class282_sub50_sub13, int i) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				for (int i_248_ = 0; i_248_ < ((AnimationSkin) class95).anInt980; i_248_++) {
					short i_249_ = ((AnimationSkin) class95).aShortArray987[i_248_];
					if (((AnimationSkinNode) class282_sub12).aBoolArray7563[i_249_]) {
						if (((AnimationSkin) class95).aShortArray984[i_248_] != -1)
							w(0, 0, 0, 0);
						w((((AnimationSkinNode) class282_sub12).anIntArray7562[i_249_]), ((AnimationSkin) class95).aShortArray981[i_248_], ((AnimationSkin) class95).aShortArray982[i_248_], ((AnimationSkin) class95).aShortArray983[i_248_]);
					}
				}
				ka();
				method11261();
			}
		}
	}

	public abstract void bq();

	abstract void w(int i, int i_250_, int i_251_, int i_252_);

	public abstract void cr(int i);

	abstract void method11285();

	public abstract boolean method11286(int i, int i_253_, Matrix44Var class294, boolean bool, int i_254_);

	abstract boolean bv();

	void method11287(int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_, float[] fs, int i_261_, float f, float f_262_, float f_263_, float[] fs_264_) {
		i -= i_257_;
		i_255_ -= i_258_;
		i_256_ -= i_259_;
		float f_265_ = ((float) i * fs[0] + (float) i_255_ * fs[1] + (float) i_256_ * fs[2]);
		float f_266_ = ((float) i * fs[3] + (float) i_255_ * fs[4] + (float) i_256_ * fs[5]);
		float f_267_ = ((float) i * fs[6] + (float) i_255_ * fs[7] + (float) i_256_ * fs[8]);
		float f_268_;
		float f_269_;
		if (i_260_ == 0) {
			f_268_ = f_265_ + f + 0.5F;
			f_269_ = -f_267_ + f_263_ + 0.5F;
		} else if (i_260_ == 1) {
			f_268_ = f_265_ + f + 0.5F;
			f_269_ = f_267_ + f_263_ + 0.5F;
		} else if (i_260_ == 2) {
			f_268_ = -f_265_ + f + 0.5F;
			f_269_ = -f_266_ + f_262_ + 0.5F;
		} else if (i_260_ == 3) {
			f_268_ = f_265_ + f + 0.5F;
			f_269_ = -f_266_ + f_262_ + 0.5F;
		} else if (i_260_ == 4) {
			f_268_ = f_267_ + f_263_ + 0.5F;
			f_269_ = -f_266_ + f_262_ + 0.5F;
		} else {
			f_268_ = -f_267_ + f_263_ + 0.5F;
			f_269_ = -f_266_ + f_262_ + 0.5F;
		}
		if (i_261_ == 1) {
			float f_270_ = f_268_;
			f_268_ = -f_269_;
			f_269_ = f_270_;
		} else if (i_261_ == 2) {
			f_268_ = -f_268_;
			f_269_ = -f_269_;
		} else if (i_261_ == 3) {
			float f_271_ = f_268_;
			f_268_ = f_269_;
			f_269_ = -f_271_;
		}
		fs_264_[0] = f_268_;
		fs_264_[1] = f_269_;
	}

	abstract boolean ea();

	abstract void method11288();

	abstract void bb(int i, int i_272_, int i_273_, int i_274_);

	public abstract MeshRasterizer method11289(byte i, int i_275_, boolean bool);

	public abstract int cc();

	public abstract void method11290(Matrix44Var class294, int i, boolean bool);

	public abstract void method11291(Matrix44Var class294, int i, boolean bool);

	public abstract void method11292(Matrix44Var class294, int i, boolean bool);

	public abstract void method11293(Matrix44Var class294, Class275_Sub5 class275_sub5, int i);

	public abstract int ar();

	public abstract void method11294(Matrix44Var class294);

	public abstract int cv();

	public abstract int cp();

	public abstract int dg();

	public abstract int ci();

	public abstract void bw(int i);

	public abstract void method11295();

	public abstract int cb();

	public abstract MeshRasterizer method11296(byte i, int i_276_, boolean bool);

	public abstract int cm();

	public abstract void bs(int i);

	public abstract int ck();

	public abstract int co();

	void method11297(int i, int[] is, int i_277_, int i_278_, int i_279_, int i_280_, boolean bool, int i_281_, int[] is_282_) {
		if (i_280_ == 1) {
			if (i == 0 || i == 1) {
				int i_283_ = -i_277_;
				i_277_ = i_279_;
				i_279_ = i_283_;
			} else if (i == 3) {
				int i_284_ = i_277_;
				i_277_ = i_279_;
				i_279_ = i_284_;
			} else if (i == 2) {
				int i_285_ = i_277_;
				i_277_ = -i_279_ & 0x3fff;
				i_279_ = i_285_ & 0x3fff;
			}
		} else if (i_280_ == 2) {
			if (i == 0 || i == 1) {
				i_277_ = -i_277_;
				i_279_ = -i_279_;
			} else if (i == 2) {
				i_277_ = -i_277_ & 0x3fff;
				i_279_ = -i_279_ & 0x3fff;
			}
		} else if (i_280_ == 3) {
			if (i == 0 || i == 1) {
				int i_286_ = i_277_;
				i_277_ = -i_279_;
				i_279_ = i_286_;
			} else if (i == 3) {
				int i_287_ = i_277_;
				i_277_ = i_279_;
				i_279_ = i_287_;
			} else if (i == 2) {
				int i_288_ = i_277_;
				i_277_ = i_279_ & 0x3fff;
				i_279_ = -i_288_ & 0x3fff;
			}
		}
		if (i_281_ != 65535)
			e(i, is, i_277_, i_278_, i_279_, bool, i_281_, is_282_);
		else
			method11268(i, is, i_277_, i_278_, i_279_, i_280_, bool);
	}

	public abstract void ce(int i);

	public abstract void method11298(Matrix44Var class294, int i, boolean bool);

	public abstract int ch();

	public abstract byte[] cz();

	public abstract void cq(short i, short i_289_);

	public abstract void method11299(MeshRasterizer class528_290_, int i, int i_291_, int i_292_, boolean bool);

	public abstract void cy(int i, int i_293_, int i_294_, int i_295_);

	public abstract Class87[] method11300();

	public abstract void p(int i);

	abstract void method11301();

	public abstract Class172[] method11302();

	public abstract boolean method11303();

	void method11304(int i, int i_296_, int i_297_, int i_298_, int i_299_, int i_300_, int i_301_, float[] fs, int i_302_, float f, float f_303_, float f_304_, float[] fs_305_) {
		i -= i_298_;
		i_296_ -= i_299_;
		i_297_ -= i_300_;
		float f_306_ = ((float) i * fs[0] + (float) i_296_ * fs[1] + (float) i_297_ * fs[2]);
		float f_307_ = ((float) i * fs[3] + (float) i_296_ * fs[4] + (float) i_297_ * fs[5]);
		float f_308_ = ((float) i * fs[6] + (float) i_296_ * fs[7] + (float) i_297_ * fs[8]);
		float f_309_;
		float f_310_;
		if (i_301_ == 0) {
			f_309_ = f_306_ + f + 0.5F;
			f_310_ = -f_308_ + f_304_ + 0.5F;
		} else if (i_301_ == 1) {
			f_309_ = f_306_ + f + 0.5F;
			f_310_ = f_308_ + f_304_ + 0.5F;
		} else if (i_301_ == 2) {
			f_309_ = -f_306_ + f + 0.5F;
			f_310_ = -f_307_ + f_303_ + 0.5F;
		} else if (i_301_ == 3) {
			f_309_ = f_306_ + f + 0.5F;
			f_310_ = -f_307_ + f_303_ + 0.5F;
		} else if (i_301_ == 4) {
			f_309_ = f_308_ + f_304_ + 0.5F;
			f_310_ = -f_307_ + f_303_ + 0.5F;
		} else {
			f_309_ = -f_308_ + f_304_ + 0.5F;
			f_310_ = -f_307_ + f_303_ + 0.5F;
		}
		if (i_302_ == 1) {
			float f_311_ = f_309_;
			f_309_ = -f_310_;
			f_310_ = f_311_;
		} else if (i_302_ == 2) {
			f_309_ = -f_309_;
			f_310_ = -f_310_;
		} else if (i_302_ == 3) {
			float f_312_ = f_309_;
			f_309_ = f_310_;
			f_310_ = -f_312_;
		}
		fs_305_[0] = f_309_;
		fs_305_[1] = f_310_;
	}

	public abstract void dl(int i);

	void method11305(int i, int[] is, int i_313_, int i_314_, int i_315_, int i_316_, boolean bool, int i_317_, int[] is_318_) {
		if (i_316_ == 1) {
			if (i == 0 || i == 1) {
				int i_319_ = -i_313_;
				i_313_ = i_315_;
				i_315_ = i_319_;
			} else if (i == 3) {
				int i_320_ = i_313_;
				i_313_ = i_315_;
				i_315_ = i_320_;
			} else if (i == 2) {
				int i_321_ = i_313_;
				i_313_ = -i_315_ & 0x3fff;
				i_315_ = i_321_ & 0x3fff;
			}
		} else if (i_316_ == 2) {
			if (i == 0 || i == 1) {
				i_313_ = -i_313_;
				i_315_ = -i_315_;
			} else if (i == 2) {
				i_313_ = -i_313_ & 0x3fff;
				i_315_ = -i_315_ & 0x3fff;
			}
		} else if (i_316_ == 3) {
			if (i == 0 || i == 1) {
				int i_322_ = i_313_;
				i_313_ = -i_315_;
				i_315_ = i_322_;
			} else if (i == 3) {
				int i_323_ = i_313_;
				i_313_ = i_315_;
				i_315_ = i_323_;
			} else if (i == 2) {
				int i_324_ = i_313_;
				i_313_ = i_315_ & 0x3fff;
				i_315_ = -i_324_ & 0x3fff;
			}
		}
		if (i_317_ != 65535)
			e(i, is, i_313_, i_314_, i_315_, bool, i_317_, is_318_);
		else
			method11268(i, is, i_313_, i_314_, i_315_, i_316_, bool);
	}

	public abstract int dy();

	public abstract int dm();

	void method11306(int i, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_, float[] fs, float f, int i_330_, float f_331_, float[] fs_332_) {
		i -= i_327_;
		i_325_ -= i_328_;
		i_326_ -= i_329_;
		float f_333_ = ((float) i * fs[0] + (float) i_325_ * fs[1] + (float) i_326_ * fs[2]);
		float f_334_ = ((float) i * fs[3] + (float) i_325_ * fs[4] + (float) i_326_ * fs[5]);
		float f_335_ = ((float) i * fs[6] + (float) i_325_ * fs[7] + (float) i_326_ * fs[8]);
		float f_336_ = (((float) Math.atan2((double) f_333_, (double) f_335_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_336_ *= f;
		float f_337_ = f_334_ + 0.5F + f_331_;
		if (i_330_ == 1) {
			float f_338_ = f_336_;
			f_336_ = -f_337_;
			f_337_ = f_338_;
		} else if (i_330_ == 2) {
			f_336_ = -f_336_;
			f_337_ = -f_337_;
		} else if (i_330_ == 3) {
			float f_339_ = f_336_;
			f_336_ = f_337_;
			f_337_ = -f_339_;
		}
		fs_332_[0] = f_336_;
		fs_332_[1] = f_337_;
	}

	public abstract int du();

	public abstract void dk(int i, int i_340_, int i_341_);

	public abstract int dd();

	public abstract void di(short i, short i_342_);

	public abstract void method11307(byte i, byte[] is);

	public abstract boolean dv();

	abstract void method11308();

	public abstract void S(int i);

	public abstract boolean method11309(int i, int i_343_, Matrix44Var class294, boolean bool, int i_344_);

	public abstract void EA(int i);

	public abstract Class282_Sub50_Sub17 dn(Class282_Sub50_Sub17 class282_sub50_sub17);

	public abstract Class282_Sub50_Sub17 da(Class282_Sub50_Sub17 class282_sub50_sub17);

	public abstract Class282_Sub50_Sub17 dw(Class282_Sub50_Sub17 class282_sub50_sub17);

	public abstract Class282_Sub50_Sub17 dr(Class282_Sub50_Sub17 class282_sub50_sub17);

	abstract void bp();

	void method11310(int i, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, float[] fs, int i_350_, float f, float[] fs_351_) {
		i -= i_347_;
		i_345_ -= i_348_;
		i_346_ -= i_349_;
		float f_352_ = ((float) i * fs[0] + (float) i_345_ * fs[1] + (float) i_346_ * fs[2]);
		float f_353_ = ((float) i * fs[3] + (float) i_345_ * fs[4] + (float) i_346_ * fs[5]);
		float f_354_ = ((float) i * fs[6] + (float) i_345_ * fs[7] + (float) i_346_ * fs[8]);
		float f_355_ = (float) Math.sqrt((double) (f_352_ * f_352_ + f_353_ * f_353_ + f_354_ * f_354_));
		float f_356_ = (((float) Math.atan2((double) f_352_, (double) f_354_) / 6.2831855F) + 0.5F);
		float f_357_ = ((float) Math.asin((double) (f_353_ / f_355_)) / 3.1415927F + 0.5F + f);
		if (i_350_ == 1) {
			float f_358_ = f_356_;
			f_356_ = -f_357_;
			f_357_ = f_358_;
		} else if (i_350_ == 2) {
			f_356_ = -f_356_;
			f_357_ = -f_357_;
		} else if (i_350_ == 3) {
			float f_359_ = f_356_;
			f_356_ = f_357_;
			f_357_ = -f_359_;
		}
		fs_351_[0] = f_356_;
		fs_351_[1] = f_357_;
	}

	void method11311(int i, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, float[] fs, int i_365_, float f, float[] fs_366_) {
		i -= i_362_;
		i_360_ -= i_363_;
		i_361_ -= i_364_;
		float f_367_ = ((float) i * fs[0] + (float) i_360_ * fs[1] + (float) i_361_ * fs[2]);
		float f_368_ = ((float) i * fs[3] + (float) i_360_ * fs[4] + (float) i_361_ * fs[5]);
		float f_369_ = ((float) i * fs[6] + (float) i_360_ * fs[7] + (float) i_361_ * fs[8]);
		float f_370_ = (float) Math.sqrt((double) (f_367_ * f_367_ + f_368_ * f_368_ + f_369_ * f_369_));
		float f_371_ = (((float) Math.atan2((double) f_367_, (double) f_369_) / 6.2831855F) + 0.5F);
		float f_372_ = ((float) Math.asin((double) (f_368_ / f_370_)) / 3.1415927F + 0.5F + f);
		if (i_365_ == 1) {
			float f_373_ = f_371_;
			f_371_ = -f_372_;
			f_372_ = f_373_;
		} else if (i_365_ == 2) {
			f_371_ = -f_371_;
			f_372_ = -f_372_;
		} else if (i_365_ == 3) {
			float f_374_ = f_371_;
			f_371_ = f_372_;
			f_372_ = -f_374_;
		}
		fs_366_[0] = f_371_;
		fs_366_[1] = f_372_;
	}

	public abstract void method11312(byte i, byte[] is);

	void method11313(int i, int i_375_, int i_376_, int i_377_, int i_378_, int i_379_, float[] fs, float f, int i_380_, float f_381_, float[] fs_382_) {
		i -= i_377_;
		i_375_ -= i_378_;
		i_376_ -= i_379_;
		float f_383_ = ((float) i * fs[0] + (float) i_375_ * fs[1] + (float) i_376_ * fs[2]);
		float f_384_ = ((float) i * fs[3] + (float) i_375_ * fs[4] + (float) i_376_ * fs[5]);
		float f_385_ = ((float) i * fs[6] + (float) i_375_ * fs[7] + (float) i_376_ * fs[8]);
		float f_386_ = (((float) Math.atan2((double) f_383_, (double) f_385_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_386_ *= f;
		float f_387_ = f_384_ + 0.5F + f_381_;
		if (i_380_ == 1) {
			float f_388_ = f_386_;
			f_386_ = -f_387_;
			f_387_ = f_388_;
		} else if (i_380_ == 2) {
			f_386_ = -f_386_;
			f_387_ = -f_387_;
		} else if (i_380_ == 3) {
			float f_389_ = f_386_;
			f_386_ = f_387_;
			f_387_ = -f_389_;
		}
		fs_382_[0] = f_386_;
		fs_382_[1] = f_387_;
	}

	int method11314(float f, float f_390_, float f_391_) {
		float f_392_ = f < 0.0F ? -f : f;
		float f_393_ = f_390_ < 0.0F ? -f_390_ : f_390_;
		float f_394_ = f_391_ < 0.0F ? -f_391_ : f_391_;
		if (f_393_ > f_392_ && f_393_ > f_394_) {
			if (f_390_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_394_ > f_392_ && f_394_ > f_393_) {
			if (f_391_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	public abstract int cd();

	public abstract void method11315(Matrix44Var class294);

	void method11316(int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_, float[] fs, int i_401_, float f, float f_402_, float f_403_, float[] fs_404_) {
		i -= i_397_;
		i_395_ -= i_398_;
		i_396_ -= i_399_;
		float f_405_ = ((float) i * fs[0] + (float) i_395_ * fs[1] + (float) i_396_ * fs[2]);
		float f_406_ = ((float) i * fs[3] + (float) i_395_ * fs[4] + (float) i_396_ * fs[5]);
		float f_407_ = ((float) i * fs[6] + (float) i_395_ * fs[7] + (float) i_396_ * fs[8]);
		float f_408_;
		float f_409_;
		if (i_400_ == 0) {
			f_408_ = f_405_ + f + 0.5F;
			f_409_ = -f_407_ + f_403_ + 0.5F;
		} else if (i_400_ == 1) {
			f_408_ = f_405_ + f + 0.5F;
			f_409_ = f_407_ + f_403_ + 0.5F;
		} else if (i_400_ == 2) {
			f_408_ = -f_405_ + f + 0.5F;
			f_409_ = -f_406_ + f_402_ + 0.5F;
		} else if (i_400_ == 3) {
			f_408_ = f_405_ + f + 0.5F;
			f_409_ = -f_406_ + f_402_ + 0.5F;
		} else if (i_400_ == 4) {
			f_408_ = f_407_ + f_403_ + 0.5F;
			f_409_ = -f_406_ + f_402_ + 0.5F;
		} else {
			f_408_ = -f_407_ + f_403_ + 0.5F;
			f_409_ = -f_406_ + f_402_ + 0.5F;
		}
		if (i_401_ == 1) {
			float f_410_ = f_408_;
			f_408_ = -f_409_;
			f_409_ = f_410_;
		} else if (i_401_ == 2) {
			f_408_ = -f_408_;
			f_409_ = -f_409_;
		} else if (i_401_ == 3) {
			float f_411_ = f_408_;
			f_408_ = f_409_;
			f_409_ = -f_411_;
		}
		fs_404_[0] = f_408_;
		fs_404_[1] = f_409_;
	}

	Class83 method11317(RSMesh class157, int[] is, int i) {
		int[] is_412_ = null;
		int[] is_413_ = null;
		int[] is_414_ = null;
		float[][] fs = null;
		if (class157.aByteArray1988 != null) {
			int i_415_ = class157.anInt1979;
			int[] is_416_ = new int[i_415_];
			int[] is_417_ = new int[i_415_];
			int[] is_418_ = new int[i_415_];
			int[] is_419_ = new int[i_415_];
			int[] is_420_ = new int[i_415_];
			int[] is_421_ = new int[i_415_];
			for (int i_422_ = 0; i_422_ < i_415_; i_422_++) {
				is_416_[i_422_] = 2147483647;
				is_417_[i_422_] = -2147483647;
				is_418_[i_422_] = 2147483647;
				is_419_[i_422_] = -2147483647;
				is_420_[i_422_] = 2147483647;
				is_421_[i_422_] = -2147483647;
			}
			for (int i_423_ = 0; i_423_ < i; i_423_++) {
				int i_424_ = is[i_423_];
				if (class157.aByteArray1988[i_424_] != -1) {
					int i_425_ = class157.aByteArray1988[i_424_] & 0xff;
					for (int i_426_ = 0; i_426_ < 3; i_426_++) {
						short i_427_;
						if (i_426_ == 0)
							i_427_ = class157.aShortArray1982[i_424_];
						else if (i_426_ == 1)
							i_427_ = class157.aShortArray1983[i_424_];
						else
							i_427_ = class157.aShortArray1984[i_424_];
						int i_428_ = class157.anIntArray1976[i_427_];
						int i_429_ = class157.anIntArray2003[i_427_];
						int i_430_ = class157.anIntArray1978[i_427_];
						if (i_428_ < is_416_[i_425_])
							is_416_[i_425_] = i_428_;
						if (i_428_ > is_417_[i_425_])
							is_417_[i_425_] = i_428_;
						if (i_429_ < is_418_[i_425_])
							is_418_[i_425_] = i_429_;
						if (i_429_ > is_419_[i_425_])
							is_419_[i_425_] = i_429_;
						if (i_430_ < is_420_[i_425_])
							is_420_[i_425_] = i_430_;
						if (i_430_ > is_421_[i_425_])
							is_421_[i_425_] = i_430_;
					}
				}
			}
			is_412_ = new int[i_415_];
			is_413_ = new int[i_415_];
			is_414_ = new int[i_415_];
			fs = new float[i_415_][];
			for (int i_431_ = 0; i_431_ < i_415_; i_431_++) {
				byte i_432_ = class157.aByteArray1995[i_431_];
				if (i_432_ > 0) {
					is_412_[i_431_] = (is_416_[i_431_] + is_417_[i_431_]) / 2;
					is_413_[i_431_] = (is_418_[i_431_] + is_419_[i_431_]) / 2;
					is_414_[i_431_] = (is_420_[i_431_] + is_421_[i_431_]) / 2;
					float f;
					float f_433_;
					float f_434_;
					if (i_432_ == 1) {
						int i_435_ = class157.anIntArray1989[i_431_];
						if (i_435_ == 0) {
							f = 1.0F;
							f_434_ = 1.0F;
						} else if (i_435_ > 0) {
							f = 1.0F;
							f_434_ = (float) i_435_ / 1024.0F;
						} else {
							f_434_ = 1.0F;
							f = (float) -i_435_ / 1024.0F;
						}
						f_433_ = 64.0F / (float) class157.anIntArray2000[i_431_];
					} else if (i_432_ == 2) {
						f = 64.0F / (float) class157.anIntArray1989[i_431_];
						f_433_ = 64.0F / (float) class157.anIntArray2000[i_431_];
						f_434_ = 64.0F / (float) class157.anIntArray2001[i_431_];
					} else {
						f = (float) class157.anIntArray1989[i_431_] / 1024.0F;
						f_433_ = ((float) class157.anIntArray2000[i_431_] / 1024.0F);
						f_434_ = ((float) class157.anIntArray2001[i_431_] / 1024.0F);
					}
					fs[i_431_] = method11257(class157.aShortArray1996[i_431_], class157.aShortArray1987[i_431_], class157.aShortArray1998[i_431_], class157.aByteArray2005[i_431_] & 0xff, f, f_433_, f_434_);
				}
			}
		}
		return new Class83(this, is_412_, is_413_, is_414_, fs);
	}

	Class83 method11318(RSMesh class157, int[] is, int i) {
		int[] is_436_ = null;
		int[] is_437_ = null;
		int[] is_438_ = null;
		float[][] fs = null;
		if (class157.aByteArray1988 != null) {
			int i_439_ = class157.anInt1979;
			int[] is_440_ = new int[i_439_];
			int[] is_441_ = new int[i_439_];
			int[] is_442_ = new int[i_439_];
			int[] is_443_ = new int[i_439_];
			int[] is_444_ = new int[i_439_];
			int[] is_445_ = new int[i_439_];
			for (int i_446_ = 0; i_446_ < i_439_; i_446_++) {
				is_440_[i_446_] = 2147483647;
				is_441_[i_446_] = -2147483647;
				is_442_[i_446_] = 2147483647;
				is_443_[i_446_] = -2147483647;
				is_444_[i_446_] = 2147483647;
				is_445_[i_446_] = -2147483647;
			}
			for (int i_447_ = 0; i_447_ < i; i_447_++) {
				int i_448_ = is[i_447_];
				if (class157.aByteArray1988[i_448_] != -1) {
					int i_449_ = class157.aByteArray1988[i_448_] & 0xff;
					for (int i_450_ = 0; i_450_ < 3; i_450_++) {
						short i_451_;
						if (i_450_ == 0)
							i_451_ = class157.aShortArray1982[i_448_];
						else if (i_450_ == 1)
							i_451_ = class157.aShortArray1983[i_448_];
						else
							i_451_ = class157.aShortArray1984[i_448_];
						int i_452_ = class157.anIntArray1976[i_451_];
						int i_453_ = class157.anIntArray2003[i_451_];
						int i_454_ = class157.anIntArray1978[i_451_];
						if (i_452_ < is_440_[i_449_])
							is_440_[i_449_] = i_452_;
						if (i_452_ > is_441_[i_449_])
							is_441_[i_449_] = i_452_;
						if (i_453_ < is_442_[i_449_])
							is_442_[i_449_] = i_453_;
						if (i_453_ > is_443_[i_449_])
							is_443_[i_449_] = i_453_;
						if (i_454_ < is_444_[i_449_])
							is_444_[i_449_] = i_454_;
						if (i_454_ > is_445_[i_449_])
							is_445_[i_449_] = i_454_;
					}
				}
			}
			is_436_ = new int[i_439_];
			is_437_ = new int[i_439_];
			is_438_ = new int[i_439_];
			fs = new float[i_439_][];
			for (int i_455_ = 0; i_455_ < i_439_; i_455_++) {
				byte i_456_ = class157.aByteArray1995[i_455_];
				if (i_456_ > 0) {
					is_436_[i_455_] = (is_440_[i_455_] + is_441_[i_455_]) / 2;
					is_437_[i_455_] = (is_442_[i_455_] + is_443_[i_455_]) / 2;
					is_438_[i_455_] = (is_444_[i_455_] + is_445_[i_455_]) / 2;
					float f;
					float f_457_;
					float f_458_;
					if (i_456_ == 1) {
						int i_459_ = class157.anIntArray1989[i_455_];
						if (i_459_ == 0) {
							f = 1.0F;
							f_458_ = 1.0F;
						} else if (i_459_ > 0) {
							f = 1.0F;
							f_458_ = (float) i_459_ / 1024.0F;
						} else {
							f_458_ = 1.0F;
							f = (float) -i_459_ / 1024.0F;
						}
						f_457_ = 64.0F / (float) class157.anIntArray2000[i_455_];
					} else if (i_456_ == 2) {
						f = 64.0F / (float) class157.anIntArray1989[i_455_];
						f_457_ = 64.0F / (float) class157.anIntArray2000[i_455_];
						f_458_ = 64.0F / (float) class157.anIntArray2001[i_455_];
					} else {
						f = (float) class157.anIntArray1989[i_455_] / 1024.0F;
						f_457_ = ((float) class157.anIntArray2000[i_455_] / 1024.0F);
						f_458_ = ((float) class157.anIntArray2001[i_455_] / 1024.0F);
					}
					fs[i_455_] = method11257(class157.aShortArray1996[i_455_], class157.aShortArray1987[i_455_], class157.aShortArray1998[i_455_], class157.aByteArray2005[i_455_] & 0xff, f, f_457_, f_458_);
				}
			}
		}
		return new Class83(this, is_436_, is_437_, is_438_, fs);
	}

	Class83 method11319(RSMesh class157, int[] is, int i) {
		int[] is_460_ = null;
		int[] is_461_ = null;
		int[] is_462_ = null;
		float[][] fs = null;
		if (class157.aByteArray1988 != null) {
			int i_463_ = class157.anInt1979;
			int[] is_464_ = new int[i_463_];
			int[] is_465_ = new int[i_463_];
			int[] is_466_ = new int[i_463_];
			int[] is_467_ = new int[i_463_];
			int[] is_468_ = new int[i_463_];
			int[] is_469_ = new int[i_463_];
			for (int i_470_ = 0; i_470_ < i_463_; i_470_++) {
				is_464_[i_470_] = 2147483647;
				is_465_[i_470_] = -2147483647;
				is_466_[i_470_] = 2147483647;
				is_467_[i_470_] = -2147483647;
				is_468_[i_470_] = 2147483647;
				is_469_[i_470_] = -2147483647;
			}
			for (int i_471_ = 0; i_471_ < i; i_471_++) {
				int i_472_ = is[i_471_];
				if (class157.aByteArray1988[i_472_] != -1) {
					int i_473_ = class157.aByteArray1988[i_472_] & 0xff;
					for (int i_474_ = 0; i_474_ < 3; i_474_++) {
						short i_475_;
						if (i_474_ == 0)
							i_475_ = class157.aShortArray1982[i_472_];
						else if (i_474_ == 1)
							i_475_ = class157.aShortArray1983[i_472_];
						else
							i_475_ = class157.aShortArray1984[i_472_];
						int i_476_ = class157.anIntArray1976[i_475_];
						int i_477_ = class157.anIntArray2003[i_475_];
						int i_478_ = class157.anIntArray1978[i_475_];
						if (i_476_ < is_464_[i_473_])
							is_464_[i_473_] = i_476_;
						if (i_476_ > is_465_[i_473_])
							is_465_[i_473_] = i_476_;
						if (i_477_ < is_466_[i_473_])
							is_466_[i_473_] = i_477_;
						if (i_477_ > is_467_[i_473_])
							is_467_[i_473_] = i_477_;
						if (i_478_ < is_468_[i_473_])
							is_468_[i_473_] = i_478_;
						if (i_478_ > is_469_[i_473_])
							is_469_[i_473_] = i_478_;
					}
				}
			}
			is_460_ = new int[i_463_];
			is_461_ = new int[i_463_];
			is_462_ = new int[i_463_];
			fs = new float[i_463_][];
			for (int i_479_ = 0; i_479_ < i_463_; i_479_++) {
				byte i_480_ = class157.aByteArray1995[i_479_];
				if (i_480_ > 0) {
					is_460_[i_479_] = (is_464_[i_479_] + is_465_[i_479_]) / 2;
					is_461_[i_479_] = (is_466_[i_479_] + is_467_[i_479_]) / 2;
					is_462_[i_479_] = (is_468_[i_479_] + is_469_[i_479_]) / 2;
					float f;
					float f_481_;
					float f_482_;
					if (i_480_ == 1) {
						int i_483_ = class157.anIntArray1989[i_479_];
						if (i_483_ == 0) {
							f = 1.0F;
							f_482_ = 1.0F;
						} else if (i_483_ > 0) {
							f = 1.0F;
							f_482_ = (float) i_483_ / 1024.0F;
						} else {
							f_482_ = 1.0F;
							f = (float) -i_483_ / 1024.0F;
						}
						f_481_ = 64.0F / (float) class157.anIntArray2000[i_479_];
					} else if (i_480_ == 2) {
						f = 64.0F / (float) class157.anIntArray1989[i_479_];
						f_481_ = 64.0F / (float) class157.anIntArray2000[i_479_];
						f_482_ = 64.0F / (float) class157.anIntArray2001[i_479_];
					} else {
						f = (float) class157.anIntArray1989[i_479_] / 1024.0F;
						f_481_ = ((float) class157.anIntArray2000[i_479_] / 1024.0F);
						f_482_ = ((float) class157.anIntArray2001[i_479_] / 1024.0F);
					}
					fs[i_479_] = method11257(class157.aShortArray1996[i_479_], class157.aShortArray1987[i_479_], class157.aShortArray1998[i_479_], class157.aByteArray2005[i_479_] & 0xff, f, f_481_, f_482_);
				}
			}
		}
		return new Class83(this, is_460_, is_461_, is_462_, fs);
	}

	float[] method11320(int i, int i_484_, int i_485_, int i_486_, float f, float f_487_, float f_488_) {
		float[] fs = new float[9];
		float[] fs_489_ = new float[9];
		float f_490_ = (float) Math.cos((double) ((float) i_486_ * 0.024543693F));
		float f_491_ = (float) Math.sin((double) ((float) i_486_ * 0.024543693F));
		float f_492_ = 1.0F - f_490_;
		fs[0] = f_490_;
		fs[1] = 0.0F;
		fs[2] = f_491_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_491_;
		fs[7] = 0.0F;
		fs[8] = f_490_;
		float[] fs_493_ = new float[9];
		float f_494_ = 1.0F;
		float f_495_ = 0.0F;
		f_490_ = (float) i_484_ / 32767.0F;
		f_491_ = -(float) Math.sqrt((double) (1.0F - f_490_ * f_490_));
		f_492_ = 1.0F - f_490_;
		float f_496_ = (float) Math.sqrt((double) (i * i + i_485_ * i_485_));
		if (f_496_ == 0.0F && f_490_ == 0.0F)
			fs_489_ = fs;
		else {
			if (f_496_ != 0.0F) {
				f_494_ = (float) -i_485_ / f_496_;
				f_495_ = (float) i / f_496_;
			}
			fs_493_[0] = f_490_ + f_494_ * f_494_ * f_492_;
			fs_493_[1] = f_495_ * f_491_;
			fs_493_[2] = f_495_ * f_494_ * f_492_;
			fs_493_[3] = -f_495_ * f_491_;
			fs_493_[4] = f_490_;
			fs_493_[5] = f_494_ * f_491_;
			fs_493_[6] = f_494_ * f_495_ * f_492_;
			fs_493_[7] = -f_494_ * f_491_;
			fs_493_[8] = f_490_ + f_495_ * f_495_ * f_492_;
			fs_489_[0] = fs[0] * fs_493_[0] + fs[1] * fs_493_[3] + fs[2] * fs_493_[6];
			fs_489_[1] = fs[0] * fs_493_[1] + fs[1] * fs_493_[4] + fs[2] * fs_493_[7];
			fs_489_[2] = fs[0] * fs_493_[2] + fs[1] * fs_493_[5] + fs[2] * fs_493_[8];
			fs_489_[3] = fs[3] * fs_493_[0] + fs[4] * fs_493_[3] + fs[5] * fs_493_[6];
			fs_489_[4] = fs[3] * fs_493_[1] + fs[4] * fs_493_[4] + fs[5] * fs_493_[7];
			fs_489_[5] = fs[3] * fs_493_[2] + fs[4] * fs_493_[5] + fs[5] * fs_493_[8];
			fs_489_[6] = fs[6] * fs_493_[0] + fs[7] * fs_493_[3] + fs[8] * fs_493_[6];
			fs_489_[7] = fs[6] * fs_493_[1] + fs[7] * fs_493_[4] + fs[8] * fs_493_[7];
			fs_489_[8] = fs[6] * fs_493_[2] + fs[7] * fs_493_[5] + fs[8] * fs_493_[8];
		}
		fs_489_[0] *= f;
		fs_489_[1] *= f;
		fs_489_[2] *= f;
		fs_489_[3] *= f_487_;
		fs_489_[4] *= f_487_;
		fs_489_[5] *= f_487_;
		fs_489_[6] *= f_488_;
		fs_489_[7] *= f_488_;
		fs_489_[8] *= f_488_;
		return fs_489_;
	}

	float[] method11321(int i, int i_497_, int i_498_, int i_499_, float f, float f_500_, float f_501_) {
		float[] fs = new float[9];
		float[] fs_502_ = new float[9];
		float f_503_ = (float) Math.cos((double) ((float) i_499_ * 0.024543693F));
		float f_504_ = (float) Math.sin((double) ((float) i_499_ * 0.024543693F));
		float f_505_ = 1.0F - f_503_;
		fs[0] = f_503_;
		fs[1] = 0.0F;
		fs[2] = f_504_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_504_;
		fs[7] = 0.0F;
		fs[8] = f_503_;
		float[] fs_506_ = new float[9];
		float f_507_ = 1.0F;
		float f_508_ = 0.0F;
		f_503_ = (float) i_497_ / 32767.0F;
		f_504_ = -(float) Math.sqrt((double) (1.0F - f_503_ * f_503_));
		f_505_ = 1.0F - f_503_;
		float f_509_ = (float) Math.sqrt((double) (i * i + i_498_ * i_498_));
		if (f_509_ == 0.0F && f_503_ == 0.0F)
			fs_502_ = fs;
		else {
			if (f_509_ != 0.0F) {
				f_507_ = (float) -i_498_ / f_509_;
				f_508_ = (float) i / f_509_;
			}
			fs_506_[0] = f_503_ + f_507_ * f_507_ * f_505_;
			fs_506_[1] = f_508_ * f_504_;
			fs_506_[2] = f_508_ * f_507_ * f_505_;
			fs_506_[3] = -f_508_ * f_504_;
			fs_506_[4] = f_503_;
			fs_506_[5] = f_507_ * f_504_;
			fs_506_[6] = f_507_ * f_508_ * f_505_;
			fs_506_[7] = -f_507_ * f_504_;
			fs_506_[8] = f_503_ + f_508_ * f_508_ * f_505_;
			fs_502_[0] = fs[0] * fs_506_[0] + fs[1] * fs_506_[3] + fs[2] * fs_506_[6];
			fs_502_[1] = fs[0] * fs_506_[1] + fs[1] * fs_506_[4] + fs[2] * fs_506_[7];
			fs_502_[2] = fs[0] * fs_506_[2] + fs[1] * fs_506_[5] + fs[2] * fs_506_[8];
			fs_502_[3] = fs[3] * fs_506_[0] + fs[4] * fs_506_[3] + fs[5] * fs_506_[6];
			fs_502_[4] = fs[3] * fs_506_[1] + fs[4] * fs_506_[4] + fs[5] * fs_506_[7];
			fs_502_[5] = fs[3] * fs_506_[2] + fs[4] * fs_506_[5] + fs[5] * fs_506_[8];
			fs_502_[6] = fs[6] * fs_506_[0] + fs[7] * fs_506_[3] + fs[8] * fs_506_[6];
			fs_502_[7] = fs[6] * fs_506_[1] + fs[7] * fs_506_[4] + fs[8] * fs_506_[7];
			fs_502_[8] = fs[6] * fs_506_[2] + fs[7] * fs_506_[5] + fs[8] * fs_506_[8];
		}
		fs_502_[0] *= f;
		fs_502_[1] *= f;
		fs_502_[2] *= f;
		fs_502_[3] *= f_500_;
		fs_502_[4] *= f_500_;
		fs_502_[5] *= f_500_;
		fs_502_[6] *= f_501_;
		fs_502_[7] *= f_501_;
		fs_502_[8] *= f_501_;
		return fs_502_;
	}

	public abstract void by();

	public final void method11322(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_510_, int i_511_, int i_512_, int i_513_, int i_514_, boolean bool) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				AnimationSkin class95_515_ = null;
				if (class282_sub50_sub13_510_ != null) {
					class95_515_ = (((AnimationSkeleton) class282_sub50_sub13_510_).animationSkins[i_511_]);
					if (((AnimationSkin) class95_515_).skinNodeList != class282_sub12)
						class95_515_ = null;
				}
				method11266(class282_sub12, class95, class95_515_, i_512_, i_513_, i_514_, null, false, bool, 65535, null);
				ka();
				method11261();
			}
		}
	}

	public final void method11323(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_516_, int i_517_, int i_518_, int i_519_, int i_520_, int i_521_, boolean bool, int[] is) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				AnimationSkin class95_522_ = null;
				if (class282_sub50_sub13_516_ != null) {
					class95_522_ = (((AnimationSkeleton) class282_sub50_sub13_516_).animationSkins[i_517_]);
					if (((AnimationSkin) class95_522_).skinNodeList != class282_sub12)
						class95_522_ = null;
				}
				method11266(class282_sub12, class95, class95_522_, i_518_, i_519_, i_520_, null, false, bool, i_521_, is);
				ka();
				method11261();
			}
		}
	}

	public final void method11324(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_523_, int i_524_, int i_525_, int i_526_, int i_527_, int i_528_, boolean bool, int[] is) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				AnimationSkin class95_529_ = null;
				if (class282_sub50_sub13_523_ != null) {
					class95_529_ = (((AnimationSkeleton) class282_sub50_sub13_523_).animationSkins[i_524_]);
					if (((AnimationSkin) class95_529_).skinNodeList != class282_sub12)
						class95_529_ = null;
				}
				method11266(class282_sub12, class95, class95_529_, i_525_, i_526_, i_527_, null, false, bool, i_528_, is);
				ka();
				method11261();
			}
		}
	}

	public final void method11325(AnimationSkeleton class282_sub50_sub13, int i, AnimationSkeleton class282_sub50_sub13_530_, int i_531_, int i_532_, int i_533_, AnimationSkeleton class282_sub50_sub13_534_, int i_535_, AnimationSkeleton class282_sub50_sub13_536_, int i_537_, int i_538_, int i_539_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_535_ == -1)
				method11262(class282_sub50_sub13, i, class282_sub50_sub13_530_, i_531_, i_532_, i_533_, 0, bool);
			else {
				method11260();
				if (!ea())
					method11261();
				else {
					AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
					AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
					AnimationSkin class95_540_ = null;
					if (class282_sub50_sub13_530_ != null) {
						class95_540_ = (((AnimationSkeleton) class282_sub50_sub13_530_).animationSkins[i_531_]);
						if (((AnimationSkin) class95_540_).skinNodeList != class282_sub12)
							class95_540_ = null;
					}
					method11266(class282_sub12, class95, class95_540_, i_532_, i_533_, 0, bools, false, bool, 65535, null);
					AnimationSkin class95_541_ = (((AnimationSkeleton) class282_sub50_sub13_534_).animationSkins[i_535_]);
					AnimationSkin class95_542_ = null;
					if (class282_sub50_sub13_536_ != null) {
						class95_542_ = (((AnimationSkeleton) class282_sub50_sub13_536_).animationSkins[i_537_]);
						if (((AnimationSkin) class95_542_).skinNodeList != class282_sub12)
							class95_542_ = null;
					}
					method11268(0, new int[0], 0, 0, 0, 0, bool);
					method11266(((AnimationSkin) class95_541_).skinNodeList, class95_541_, class95_542_, i_538_, i_539_, 0, bools, true, bool, 65535, null);
					ka();
					method11261();
				}
			}
		}
	}

	public final void method11326(AnimationSkeleton class282_sub50_sub13, int i) {
		if (i != -1) {
			method11260();
			if (!ea())
				method11261();
			else {
				AnimationSkin class95 = (((AnimationSkeleton) class282_sub50_sub13).animationSkins[i]);
				AnimationSkinNode class282_sub12 = ((AnimationSkin) class95).skinNodeList;
				for (int i_543_ = 0; i_543_ < ((AnimationSkin) class95).anInt980; i_543_++) {
					short i_544_ = ((AnimationSkin) class95).aShortArray987[i_543_];
					if (((AnimationSkinNode) class282_sub12).aBoolArray7563[i_544_]) {
						if (((AnimationSkin) class95).aShortArray984[i_543_] != -1)
							w(0, 0, 0, 0);
						w((((AnimationSkinNode) class282_sub12).anIntArray7562[i_544_]), ((AnimationSkin) class95).aShortArray981[i_543_], ((AnimationSkin) class95).aShortArray982[i_543_], ((AnimationSkin) class95).aShortArray983[i_543_]);
					}
				}
				ka();
				method11261();
			}
		}
	}

	void method11327(AnimationSkinNode class282_sub12, AnimationSkin class95, AnimationSkin class95_545_, int i, int i_546_, int i_547_, boolean[] bools, boolean bool, boolean bool_548_, int i_549_, int[] is) {
		if (class95_545_ == null || i == 0) {
			for (int i_550_ = 0; i_550_ < ((AnimationSkin) class95).anInt980; i_550_++) {
				short i_551_ = ((AnimationSkin) class95).aShortArray987[i_550_];
				if (bools == null || bools[i_551_] == bool || (((AnimationSkinNode) class282_sub12).anIntArray7562[i_551_]) == 0) {
					short i_552_ = ((AnimationSkin) class95).aShortArray984[i_550_];
					if (i_552_ != -1)
						method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_552_]), 0, 0, 0, i_547_, bool_548_, i_549_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_552_]), is);
					method11267((((AnimationSkinNode) class282_sub12).anIntArray7562[i_551_]), (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_551_]), ((AnimationSkin) class95).aShortArray981[i_550_], ((AnimationSkin) class95).aShortArray982[i_550_], ((AnimationSkin) class95).aShortArray983[i_550_], i_547_, bool_548_, i_549_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_551_]), is);
				}
			}
		} else {
			int i_553_ = 0;
			int i_554_ = 0;
			for (int i_555_ = 0; (i_555_ < ((AnimationSkinNode) class282_sub12).anInt7564 * 1693890341); i_555_++) {
				boolean bool_556_ = false;
				if (i_553_ < ((AnimationSkin) class95).anInt980 && ((AnimationSkin) class95).aShortArray987[i_553_] == i_555_)
					bool_556_ = true;
				boolean bool_557_ = false;
				if (i_554_ < ((AnimationSkin) class95_545_).anInt980 && (((AnimationSkin) class95_545_).aShortArray987[i_554_] == i_555_))
					bool_557_ = true;
				if (bool_556_ || bool_557_) {
					if (bools != null && bools[i_555_] != bool && (((AnimationSkinNode) class282_sub12).anIntArray7562[i_555_]) != 0) {
						if (bool_556_)
							i_553_++;
						if (bool_557_)
							i_554_++;
					} else {
						int i_558_ = 0;
						int i_559_ = (((AnimationSkinNode) class282_sub12).anIntArray7562[i_555_]);
						if (i_559_ == 3 || i_559_ == 10)
							i_558_ = 128;
						int i_560_;
						int i_561_;
						int i_562_;
						short i_563_;
						byte i_564_;
						if (bool_556_) {
							i_560_ = ((AnimationSkin) class95).aShortArray981[i_553_];
							i_561_ = ((AnimationSkin) class95).aShortArray982[i_553_];
							i_562_ = ((AnimationSkin) class95).aShortArray983[i_553_];
							i_563_ = ((AnimationSkin) class95).aShortArray984[i_553_];
							i_564_ = ((AnimationSkin) class95).aByteArray985[i_553_];
							i_553_++;
						} else {
							i_560_ = i_558_;
							i_561_ = i_558_;
							i_562_ = i_558_;
							i_563_ = (short) -1;
							i_564_ = (byte) 0;
						}
						int i_565_;
						int i_566_;
						int i_567_;
						short i_568_;
						byte i_569_;
						if (bool_557_) {
							i_565_ = (((AnimationSkin) class95_545_).aShortArray981[i_554_]);
							i_566_ = (((AnimationSkin) class95_545_).aShortArray982[i_554_]);
							i_567_ = (((AnimationSkin) class95_545_).aShortArray983[i_554_]);
							i_568_ = (((AnimationSkin) class95_545_).aShortArray984[i_554_]);
							i_569_ = (((AnimationSkin) class95_545_).aByteArray985[i_554_]);
							i_554_++;
						} else {
							i_565_ = i_558_;
							i_566_ = i_558_;
							i_567_ = i_558_;
							i_568_ = (short) -1;
							i_569_ = (byte) 0;
						}
						int i_570_;
						int i_571_;
						int i_572_;
						if ((i_564_ & 0x2) != 0 || (i_569_ & 0x1) != 0) {
							i_570_ = i_560_;
							i_571_ = i_561_;
							i_572_ = i_562_;
						} else if (i_559_ == 2) {
							int i_573_ = i_565_ - i_560_ & 0x3fff;
							int i_574_ = i_566_ - i_561_ & 0x3fff;
							int i_575_ = i_567_ - i_562_ & 0x3fff;
							if (i_573_ >= 8192)
								i_573_ -= 16384;
							if (i_574_ >= 8192)
								i_574_ -= 16384;
							if (i_575_ >= 8192)
								i_575_ -= 16384;
							i_570_ = i_560_ + i_573_ * i / i_546_ & 0x3fff;
							i_571_ = i_561_ + i_574_ * i / i_546_ & 0x3fff;
							i_572_ = i_562_ + i_575_ * i / i_546_ & 0x3fff;
						} else if (i_559_ == 9) {
							int i_576_ = i_565_ - i_560_ & 0x3fff;
							if (i_576_ >= 8192)
								i_576_ -= 16384;
							i_570_ = i_560_ + i_576_ * i / i_546_ & 0x3fff;
							i_572_ = 0;
							i_571_ = 0;
						} else if (i_559_ == 7) {
							int i_577_ = i_565_ - i_560_ & 0x3f;
							if (i_577_ >= 32)
								i_577_ -= 64;
							i_570_ = i_560_ + i_577_ * i / i_546_ & 0x3f;
							i_571_ = i_561_ + (i_566_ - i_561_) * i / i_546_;
							i_572_ = i_562_ + (i_567_ - i_562_) * i / i_546_;
						} else {
							i_570_ = i_560_ + (i_565_ - i_560_) * i / i_546_;
							i_571_ = i_561_ + (i_566_ - i_561_) * i / i_546_;
							i_572_ = i_562_ + (i_567_ - i_562_) * i / i_546_;
						}
						if (i_563_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_563_]), 0, 0, 0, i_547_, bool_548_, (i_549_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_563_])), is);
						else if (i_568_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_568_]), 0, 0, 0, i_547_, bool_548_, (i_549_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_568_])), is);
						method11267(i_559_, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_555_]), i_570_, i_571_, i_572_, i_547_, bool_548_, i_549_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_555_]), is);
					}
				}
			}
		}
	}

	void method11328(AnimationSkinNode class282_sub12, AnimationSkin class95, AnimationSkin class95_578_, int i, int i_579_, int i_580_, boolean[] bools, boolean bool, boolean bool_581_, int i_582_, int[] is) {
		if (class95_578_ == null || i == 0) {
			for (int i_583_ = 0; i_583_ < ((AnimationSkin) class95).anInt980; i_583_++) {
				short i_584_ = ((AnimationSkin) class95).aShortArray987[i_583_];
				if (bools == null || bools[i_584_] == bool || (((AnimationSkinNode) class282_sub12).anIntArray7562[i_584_]) == 0) {
					short i_585_ = ((AnimationSkin) class95).aShortArray984[i_583_];
					if (i_585_ != -1)
						method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_585_]), 0, 0, 0, i_580_, bool_581_, i_582_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_585_]), is);
					method11267((((AnimationSkinNode) class282_sub12).anIntArray7562[i_584_]), (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_584_]), ((AnimationSkin) class95).aShortArray981[i_583_], ((AnimationSkin) class95).aShortArray982[i_583_], ((AnimationSkin) class95).aShortArray983[i_583_], i_580_, bool_581_, i_582_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_584_]), is);
				}
			}
		} else {
			int i_586_ = 0;
			int i_587_ = 0;
			for (int i_588_ = 0; (i_588_ < ((AnimationSkinNode) class282_sub12).anInt7564 * 1693890341); i_588_++) {
				boolean bool_589_ = false;
				if (i_586_ < ((AnimationSkin) class95).anInt980 && ((AnimationSkin) class95).aShortArray987[i_586_] == i_588_)
					bool_589_ = true;
				boolean bool_590_ = false;
				if (i_587_ < ((AnimationSkin) class95_578_).anInt980 && (((AnimationSkin) class95_578_).aShortArray987[i_587_] == i_588_))
					bool_590_ = true;
				if (bool_589_ || bool_590_) {
					if (bools != null && bools[i_588_] != bool && (((AnimationSkinNode) class282_sub12).anIntArray7562[i_588_]) != 0) {
						if (bool_589_)
							i_586_++;
						if (bool_590_)
							i_587_++;
					} else {
						int i_591_ = 0;
						int i_592_ = (((AnimationSkinNode) class282_sub12).anIntArray7562[i_588_]);
						if (i_592_ == 3 || i_592_ == 10)
							i_591_ = 128;
						int i_593_;
						int i_594_;
						int i_595_;
						short i_596_;
						byte i_597_;
						if (bool_589_) {
							i_593_ = ((AnimationSkin) class95).aShortArray981[i_586_];
							i_594_ = ((AnimationSkin) class95).aShortArray982[i_586_];
							i_595_ = ((AnimationSkin) class95).aShortArray983[i_586_];
							i_596_ = ((AnimationSkin) class95).aShortArray984[i_586_];
							i_597_ = ((AnimationSkin) class95).aByteArray985[i_586_];
							i_586_++;
						} else {
							i_593_ = i_591_;
							i_594_ = i_591_;
							i_595_ = i_591_;
							i_596_ = (short) -1;
							i_597_ = (byte) 0;
						}
						int i_598_;
						int i_599_;
						int i_600_;
						short i_601_;
						byte i_602_;
						if (bool_590_) {
							i_598_ = (((AnimationSkin) class95_578_).aShortArray981[i_587_]);
							i_599_ = (((AnimationSkin) class95_578_).aShortArray982[i_587_]);
							i_600_ = (((AnimationSkin) class95_578_).aShortArray983[i_587_]);
							i_601_ = (((AnimationSkin) class95_578_).aShortArray984[i_587_]);
							i_602_ = (((AnimationSkin) class95_578_).aByteArray985[i_587_]);
							i_587_++;
						} else {
							i_598_ = i_591_;
							i_599_ = i_591_;
							i_600_ = i_591_;
							i_601_ = (short) -1;
							i_602_ = (byte) 0;
						}
						int i_603_;
						int i_604_;
						int i_605_;
						if ((i_597_ & 0x2) != 0 || (i_602_ & 0x1) != 0) {
							i_603_ = i_593_;
							i_604_ = i_594_;
							i_605_ = i_595_;
						} else if (i_592_ == 2) {
							int i_606_ = i_598_ - i_593_ & 0x3fff;
							int i_607_ = i_599_ - i_594_ & 0x3fff;
							int i_608_ = i_600_ - i_595_ & 0x3fff;
							if (i_606_ >= 8192)
								i_606_ -= 16384;
							if (i_607_ >= 8192)
								i_607_ -= 16384;
							if (i_608_ >= 8192)
								i_608_ -= 16384;
							i_603_ = i_593_ + i_606_ * i / i_579_ & 0x3fff;
							i_604_ = i_594_ + i_607_ * i / i_579_ & 0x3fff;
							i_605_ = i_595_ + i_608_ * i / i_579_ & 0x3fff;
						} else if (i_592_ == 9) {
							int i_609_ = i_598_ - i_593_ & 0x3fff;
							if (i_609_ >= 8192)
								i_609_ -= 16384;
							i_603_ = i_593_ + i_609_ * i / i_579_ & 0x3fff;
							i_605_ = 0;
							i_604_ = 0;
						} else if (i_592_ == 7) {
							int i_610_ = i_598_ - i_593_ & 0x3f;
							if (i_610_ >= 32)
								i_610_ -= 64;
							i_603_ = i_593_ + i_610_ * i / i_579_ & 0x3f;
							i_604_ = i_594_ + (i_599_ - i_594_) * i / i_579_;
							i_605_ = i_595_ + (i_600_ - i_595_) * i / i_579_;
						} else {
							i_603_ = i_593_ + (i_598_ - i_593_) * i / i_579_;
							i_604_ = i_594_ + (i_599_ - i_594_) * i / i_579_;
							i_605_ = i_595_ + (i_600_ - i_595_) * i / i_579_;
						}
						if (i_596_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_596_]), 0, 0, 0, i_580_, bool_581_, (i_582_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_596_])), is);
						else if (i_601_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_601_]), 0, 0, 0, i_580_, bool_581_, (i_582_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_601_])), is);
						method11267(i_592_, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_588_]), i_603_, i_604_, i_605_, i_580_, bool_581_, i_582_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_588_]), is);
					}
				}
			}
		}
	}

	void method11329(AnimationSkinNode class282_sub12, AnimationSkin class95, AnimationSkin class95_611_, int i, int i_612_, int i_613_, boolean[] bools, boolean bool, boolean bool_614_, int i_615_, int[] is) {
		if (class95_611_ == null || i == 0) {
			for (int i_616_ = 0; i_616_ < ((AnimationSkin) class95).anInt980; i_616_++) {
				short i_617_ = ((AnimationSkin) class95).aShortArray987[i_616_];
				if (bools == null || bools[i_617_] == bool || (((AnimationSkinNode) class282_sub12).anIntArray7562[i_617_]) == 0) {
					short i_618_ = ((AnimationSkin) class95).aShortArray984[i_616_];
					if (i_618_ != -1)
						method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_618_]), 0, 0, 0, i_613_, bool_614_, i_615_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_618_]), is);
					method11267((((AnimationSkinNode) class282_sub12).anIntArray7562[i_617_]), (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_617_]), ((AnimationSkin) class95).aShortArray981[i_616_], ((AnimationSkin) class95).aShortArray982[i_616_], ((AnimationSkin) class95).aShortArray983[i_616_], i_613_, bool_614_, i_615_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_617_]), is);
				}
			}
		} else {
			int i_619_ = 0;
			int i_620_ = 0;
			for (int i_621_ = 0; (i_621_ < ((AnimationSkinNode) class282_sub12).anInt7564 * 1693890341); i_621_++) {
				boolean bool_622_ = false;
				if (i_619_ < ((AnimationSkin) class95).anInt980 && ((AnimationSkin) class95).aShortArray987[i_619_] == i_621_)
					bool_622_ = true;
				boolean bool_623_ = false;
				if (i_620_ < ((AnimationSkin) class95_611_).anInt980 && (((AnimationSkin) class95_611_).aShortArray987[i_620_] == i_621_))
					bool_623_ = true;
				if (bool_622_ || bool_623_) {
					if (bools != null && bools[i_621_] != bool && (((AnimationSkinNode) class282_sub12).anIntArray7562[i_621_]) != 0) {
						if (bool_622_)
							i_619_++;
						if (bool_623_)
							i_620_++;
					} else {
						int i_624_ = 0;
						int i_625_ = (((AnimationSkinNode) class282_sub12).anIntArray7562[i_621_]);
						if (i_625_ == 3 || i_625_ == 10)
							i_624_ = 128;
						int i_626_;
						int i_627_;
						int i_628_;
						short i_629_;
						byte i_630_;
						if (bool_622_) {
							i_626_ = ((AnimationSkin) class95).aShortArray981[i_619_];
							i_627_ = ((AnimationSkin) class95).aShortArray982[i_619_];
							i_628_ = ((AnimationSkin) class95).aShortArray983[i_619_];
							i_629_ = ((AnimationSkin) class95).aShortArray984[i_619_];
							i_630_ = ((AnimationSkin) class95).aByteArray985[i_619_];
							i_619_++;
						} else {
							i_626_ = i_624_;
							i_627_ = i_624_;
							i_628_ = i_624_;
							i_629_ = (short) -1;
							i_630_ = (byte) 0;
						}
						int i_631_;
						int i_632_;
						int i_633_;
						short i_634_;
						byte i_635_;
						if (bool_623_) {
							i_631_ = (((AnimationSkin) class95_611_).aShortArray981[i_620_]);
							i_632_ = (((AnimationSkin) class95_611_).aShortArray982[i_620_]);
							i_633_ = (((AnimationSkin) class95_611_).aShortArray983[i_620_]);
							i_634_ = (((AnimationSkin) class95_611_).aShortArray984[i_620_]);
							i_635_ = (((AnimationSkin) class95_611_).aByteArray985[i_620_]);
							i_620_++;
						} else {
							i_631_ = i_624_;
							i_632_ = i_624_;
							i_633_ = i_624_;
							i_634_ = (short) -1;
							i_635_ = (byte) 0;
						}
						int i_636_;
						int i_637_;
						int i_638_;
						if ((i_630_ & 0x2) != 0 || (i_635_ & 0x1) != 0) {
							i_636_ = i_626_;
							i_637_ = i_627_;
							i_638_ = i_628_;
						} else if (i_625_ == 2) {
							int i_639_ = i_631_ - i_626_ & 0x3fff;
							int i_640_ = i_632_ - i_627_ & 0x3fff;
							int i_641_ = i_633_ - i_628_ & 0x3fff;
							if (i_639_ >= 8192)
								i_639_ -= 16384;
							if (i_640_ >= 8192)
								i_640_ -= 16384;
							if (i_641_ >= 8192)
								i_641_ -= 16384;
							i_636_ = i_626_ + i_639_ * i / i_612_ & 0x3fff;
							i_637_ = i_627_ + i_640_ * i / i_612_ & 0x3fff;
							i_638_ = i_628_ + i_641_ * i / i_612_ & 0x3fff;
						} else if (i_625_ == 9) {
							int i_642_ = i_631_ - i_626_ & 0x3fff;
							if (i_642_ >= 8192)
								i_642_ -= 16384;
							i_636_ = i_626_ + i_642_ * i / i_612_ & 0x3fff;
							i_638_ = 0;
							i_637_ = 0;
						} else if (i_625_ == 7) {
							int i_643_ = i_631_ - i_626_ & 0x3f;
							if (i_643_ >= 32)
								i_643_ -= 64;
							i_636_ = i_626_ + i_643_ * i / i_612_ & 0x3f;
							i_637_ = i_627_ + (i_632_ - i_627_) * i / i_612_;
							i_638_ = i_628_ + (i_633_ - i_628_) * i / i_612_;
						} else {
							i_636_ = i_626_ + (i_631_ - i_626_) * i / i_612_;
							i_637_ = i_627_ + (i_632_ - i_627_) * i / i_612_;
							i_638_ = i_628_ + (i_633_ - i_628_) * i / i_612_;
						}
						if (i_629_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_629_]), 0, 0, 0, i_613_, bool_614_, (i_615_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_629_])), is);
						else if (i_634_ != -1)
							method11267(0, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_634_]), 0, 0, 0, i_613_, bool_614_, (i_615_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_634_])), is);
						method11267(i_625_, (((AnimationSkinNode) class282_sub12).anIntArrayArray7560[i_621_]), i_636_, i_637_, i_638_, i_613_, bool_614_, i_615_ & (((AnimationSkinNode) class282_sub12).anIntArray7561[i_621_]), is);
					}
				}
			}
		}
	}

	public abstract void pa(int i, int i_644_, Class390 class390, Class390 class390_645_, int i_646_, int i_647_, int i_648_);

	public abstract void bi(int i);

	void method11330(int i, int[] is, int i_649_, int i_650_, int i_651_, int i_652_, boolean bool, int i_653_, int[] is_654_) {
		if (i_652_ == 1) {
			if (i == 0 || i == 1) {
				int i_655_ = -i_649_;
				i_649_ = i_651_;
				i_651_ = i_655_;
			} else if (i == 3) {
				int i_656_ = i_649_;
				i_649_ = i_651_;
				i_651_ = i_656_;
			} else if (i == 2) {
				int i_657_ = i_649_;
				i_649_ = -i_651_ & 0x3fff;
				i_651_ = i_657_ & 0x3fff;
			}
		} else if (i_652_ == 2) {
			if (i == 0 || i == 1) {
				i_649_ = -i_649_;
				i_651_ = -i_651_;
			} else if (i == 2) {
				i_649_ = -i_649_ & 0x3fff;
				i_651_ = -i_651_ & 0x3fff;
			}
		} else if (i_652_ == 3) {
			if (i == 0 || i == 1) {
				int i_658_ = i_649_;
				i_649_ = -i_651_;
				i_651_ = i_658_;
			} else if (i == 3) {
				int i_659_ = i_649_;
				i_649_ = i_651_;
				i_651_ = i_659_;
			} else if (i == 2) {
				int i_660_ = i_649_;
				i_649_ = i_651_ & 0x3fff;
				i_651_ = -i_660_ & 0x3fff;
			}
		}
		if (i_653_ != 65535)
			e(i, is, i_649_, i_650_, i_651_, bool, i_653_, is_654_);
		else
			method11268(i, is, i_649_, i_650_, i_651_, i_652_, bool);
	}

	public abstract Class172[] method11331();

	void method11332(int i, int[] is, int i_661_, int i_662_, int i_663_, int i_664_, boolean bool, int i_665_, int[] is_666_) {
		if (i_664_ == 1) {
			if (i == 0 || i == 1) {
				int i_667_ = -i_661_;
				i_661_ = i_663_;
				i_663_ = i_667_;
			} else if (i == 3) {
				int i_668_ = i_661_;
				i_661_ = i_663_;
				i_663_ = i_668_;
			} else if (i == 2) {
				int i_669_ = i_661_;
				i_661_ = -i_663_ & 0x3fff;
				i_663_ = i_669_ & 0x3fff;
			}
		} else if (i_664_ == 2) {
			if (i == 0 || i == 1) {
				i_661_ = -i_661_;
				i_663_ = -i_663_;
			} else if (i == 2) {
				i_661_ = -i_661_ & 0x3fff;
				i_663_ = -i_663_ & 0x3fff;
			}
		} else if (i_664_ == 3) {
			if (i == 0 || i == 1) {
				int i_670_ = i_661_;
				i_661_ = -i_663_;
				i_663_ = i_670_;
			} else if (i == 3) {
				int i_671_ = i_661_;
				i_661_ = i_663_;
				i_663_ = i_671_;
			} else if (i == 2) {
				int i_672_ = i_661_;
				i_661_ = i_663_ & 0x3fff;
				i_663_ = -i_672_ & 0x3fff;
			}
		}
		if (i_665_ != 65535)
			e(i, is, i_661_, i_662_, i_663_, bool, i_665_, is_666_);
		else
			method11268(i, is, i_661_, i_662_, i_663_, i_664_, bool);
	}
}
