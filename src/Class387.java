/* Class387 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class387 {
	static float aFloat4147 = 3.1415927F;
	protected boolean aBoolean4148 = false;

	public abstract int ec();

	public abstract Class68[] method4728();

	int method4729(float f, float f_0_, float f_1_) {
		float f_2_ = f < 0.0F ? -f : f;
		float f_3_ = f_0_ < 0.0F ? -f_0_ : f_0_;
		float f_4_ = f_1_ < 0.0F ? -f_1_ : f_1_;
		if (f_3_ > f_2_ && f_3_ > f_4_) {
			if (f_0_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_4_ > f_2_ && f_4_ > f_3_) {
			if (f_1_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	void method4730(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, float[] fs, int i_11_, float f, float f_12_, float f_13_, float[] fs_14_) {
		i -= i_7_;
		i_5_ -= i_8_;
		i_6_ -= i_9_;
		float f_15_ = (float) i * fs[0] + (float) i_5_ * fs[1] + (float) i_6_ * fs[2];
		float f_16_ = (float) i * fs[3] + (float) i_5_ * fs[4] + (float) i_6_ * fs[5];
		float f_17_ = (float) i * fs[6] + (float) i_5_ * fs[7] + (float) i_6_ * fs[8];
		float f_18_;
		float f_19_;
		if (i_10_ == 0) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = -f_17_ + f_13_ + 0.5F;
		} else if (i_10_ == 1) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = f_17_ + f_13_ + 0.5F;
		} else if (i_10_ == 2) {
			f_18_ = -f_15_ + f + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else if (i_10_ == 3) {
			f_18_ = f_15_ + f + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else if (i_10_ == 4) {
			f_18_ = f_17_ + f_13_ + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		} else {
			f_18_ = -f_17_ + f_13_ + 0.5F;
			f_19_ = -f_16_ + f_12_ + 0.5F;
		}
		if (i_11_ == 1) {
			float f_20_ = f_18_;
			f_18_ = -f_19_;
			f_19_ = f_20_;
		} else if (i_11_ == 2) {
			f_18_ = -f_18_;
			f_19_ = -f_19_;
		} else if (i_11_ == 3) {
			float f_21_ = f_18_;
			f_18_ = f_19_;
			f_19_ = -f_21_;
		}
		fs_14_[0] = f_18_;
		fs_14_[1] = f_19_;
	}

	public abstract void dd(int i);

	float[] method4731(int i, int i_22_, int i_23_, int i_24_, float f, float f_25_, float f_26_) {
		float[] fs = new float[9];
		float[] fs_27_ = new float[9];
		float f_28_ = (float) Math.cos((double) ((float) i_24_ * 0.024543693F));
		float f_29_ = (float) Math.sin((double) ((float) i_24_ * 0.024543693F));
		float f_30_ = 1.0F - f_28_;
		fs[0] = f_28_;
		fs[1] = 0.0F;
		fs[2] = f_29_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_29_;
		fs[7] = 0.0F;
		fs[8] = f_28_;
		float[] fs_31_ = new float[9];
		float f_32_ = 1.0F;
		float f_33_ = 0.0F;
		f_28_ = (float) i_22_ / 32767.0F;
		f_29_ = -(float) Math.sqrt((double) (1.0F - f_28_ * f_28_));
		f_30_ = 1.0F - f_28_;
		float f_34_ = (float) Math.sqrt((double) (i * i + i_23_ * i_23_));
		if (f_34_ == 0.0F && f_28_ == 0.0F)
			fs_27_ = fs;
		else {
			if (f_34_ != 0.0F) {
				f_32_ = (float) -i_23_ / f_34_;
				f_33_ = (float) i / f_34_;
			}
			fs_31_[0] = f_28_ + f_32_ * f_32_ * f_30_;
			fs_31_[1] = f_33_ * f_29_;
			fs_31_[2] = f_33_ * f_32_ * f_30_;
			fs_31_[3] = -f_33_ * f_29_;
			fs_31_[4] = f_28_;
			fs_31_[5] = f_32_ * f_29_;
			fs_31_[6] = f_32_ * f_33_ * f_30_;
			fs_31_[7] = -f_32_ * f_29_;
			fs_31_[8] = f_28_ + f_33_ * f_33_ * f_30_;
			fs_27_[0] = fs[0] * fs_31_[0] + fs[1] * fs_31_[3] + fs[2] * fs_31_[6];
			fs_27_[1] = fs[0] * fs_31_[1] + fs[1] * fs_31_[4] + fs[2] * fs_31_[7];
			fs_27_[2] = fs[0] * fs_31_[2] + fs[1] * fs_31_[5] + fs[2] * fs_31_[8];
			fs_27_[3] = fs[3] * fs_31_[0] + fs[4] * fs_31_[3] + fs[5] * fs_31_[6];
			fs_27_[4] = fs[3] * fs_31_[1] + fs[4] * fs_31_[4] + fs[5] * fs_31_[7];
			fs_27_[5] = fs[3] * fs_31_[2] + fs[4] * fs_31_[5] + fs[5] * fs_31_[8];
			fs_27_[6] = fs[6] * fs_31_[0] + fs[7] * fs_31_[3] + fs[8] * fs_31_[6];
			fs_27_[7] = fs[6] * fs_31_[1] + fs[7] * fs_31_[4] + fs[8] * fs_31_[7];
			fs_27_[8] = fs[6] * fs_31_[2] + fs[7] * fs_31_[5] + fs[8] * fs_31_[8];
		}
		fs_27_[0] *= f;
		fs_27_[1] *= f;
		fs_27_[2] *= f;
		fs_27_[3] *= f_25_;
		fs_27_[4] *= f_25_;
		fs_27_[5] *= f_25_;
		fs_27_[6] *= f_26_;
		fs_27_[7] *= f_26_;
		fs_27_[8] *= f_26_;
		return fs_27_;
	}

	public abstract void by(int i);

	public abstract void KA(int i);

	public abstract int m();

	abstract boolean ea();

	public abstract int Z();

	public abstract void S(int i);

	public abstract void t(int i);

	public abstract void ia(int i, int i_35_, int i_36_);

	public abstract void wa();

	public abstract void oa(int i, int i_37_, int i_38_);

	public abstract void bu(int i, int i_39_, int i_40_);

	void method4732(Class_xa class_xa, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		boolean bool = false;
		boolean bool_47_ = false;
		boolean bool_48_ = false;
		int i_49_ = -i_43_ / 2;
		int i_50_ = -i_44_ / 2;
		int i_51_ = class_xa.method6340(i + i_49_, i_42_ + i_50_, -1693901736);
		int i_52_ = i_43_ / 2;
		int i_53_ = -i_44_ / 2;
		int i_54_ = class_xa.method6340(i + i_52_, i_42_ + i_53_, -1350603421);
		int i_55_ = -i_43_ / 2;
		int i_56_ = i_44_ / 2;
		int i_57_ = class_xa.method6340(i + i_55_, i_42_ + i_56_, -2095633165);
		int i_58_ = i_43_ / 2;
		int i_59_ = i_44_ / 2;
		int i_60_ = class_xa.method6340(i + i_58_, i_42_ + i_59_, -2087321793);
		int i_61_ = i_51_ < i_54_ ? i_51_ : i_54_;
		int i_62_ = i_57_ < i_60_ ? i_57_ : i_60_;
		int i_63_ = i_54_ < i_60_ ? i_54_ : i_60_;
		int i_64_ = i_51_ < i_57_ ? i_51_ : i_57_;
		if (i_44_ != 0) {
			int i_65_ = ((int) (Math.atan2((double) (i_61_ - i_62_), (double) i_44_) * 2607.5945876176133) & 0x3fff);
			if (i_65_ != 0) {
				if (i_45_ != 0) {
					if (i_65_ > 8192) {
						int i_66_ = 16384 - i_45_;
						if (i_65_ < i_66_)
							i_65_ = i_66_;
					} else if (i_65_ > i_45_)
						i_65_ = i_45_;
				}
				t(i_65_);
			}
		}
		if (i_43_ != 0) {
			int i_67_ = ((int) (Math.atan2((double) (i_64_ - i_63_), (double) i_43_) * 2607.5945876176133) & 0x3fff);
			if (i_67_ != 0) {
				if (i_46_ != 0) {
					if (i_67_ > 8192) {
						int i_68_ = 16384 - i_46_;
						if (i_67_ < i_68_)
							i_67_ = i_68_;
					} else if (i_67_ > i_46_)
						i_67_ = i_46_;
				}
				EA(i_67_);
			}
		}
		int i_69_ = i_51_ + i_60_;
		if (i_54_ + i_57_ < i_69_)
			i_69_ = i_54_ + i_57_;
		i_69_ = (i_69_ >> 1) - i_41_;
		if (i_69_ != 0)
			ia(0, i_69_, 0);
	}

	abstract void method4733();

	abstract void method4734();

	public final void method4735(Class298_Sub37_Sub4 class298_sub37_sub4, int i, Class298_Sub37_Sub4 class298_sub37_sub4_70_, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				Class96 class96 = (((Class298_Sub37_Sub4) class298_sub37_sub4).aClass96Array9579[i]);
				Class298_Sub15 class298_sub15 = ((Class96) class96).aClass298_Sub15_931;
				Class96 class96_75_ = null;
				if (class298_sub37_sub4_70_ != null) {
					class96_75_ = (((Class298_Sub37_Sub4) class298_sub37_sub4_70_).aClass96Array9579[i_71_]);
					if (((Class96) class96_75_).aClass298_Sub15_931 != class298_sub15)
						class96_75_ = null;
				}
				method4767(class298_sub15, class96, class96_75_, i_72_, i_73_, i_74_, null, false, bool, 65535, null);
				ka();
				method4734();
			}
		}
	}

	public abstract void pa(int i, int i_76_, Class_xa class_xa, Class_xa class_xa_77_, int i_78_, int i_79_, int i_80_);

	public final void method4736(Class298_Sub37_Sub4 class298_sub37_sub4, int i, Class298_Sub37_Sub4 class298_sub37_sub4_81_, int i_82_, int i_83_, int i_84_, Class298_Sub37_Sub4 class298_sub37_sub4_85_, int i_86_, Class298_Sub37_Sub4 class298_sub37_sub4_87_, int i_88_, int i_89_, int i_90_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_86_ == -1)
				method4735(class298_sub37_sub4, i, class298_sub37_sub4_81_, i_82_, i_83_, i_84_, 0, bool);
			else {
				method4733();
				if (!ea())
					method4734();
				else {
					Class96 class96 = (((Class298_Sub37_Sub4) class298_sub37_sub4).aClass96Array9579[i]);
					Class298_Sub15 class298_sub15 = ((Class96) class96).aClass298_Sub15_931;
					Class96 class96_91_ = null;
					if (class298_sub37_sub4_81_ != null) {
						class96_91_ = (((Class298_Sub37_Sub4) class298_sub37_sub4_81_).aClass96Array9579[i_82_]);
						if (((Class96) class96_91_).aClass298_Sub15_931 != class298_sub15)
							class96_91_ = null;
					}
					method4767(class298_sub15, class96, class96_91_, i_83_, i_84_, 0, bools, false, bool, 65535, null);
					Class96 class96_92_ = (((Class298_Sub37_Sub4) class298_sub37_sub4_85_).aClass96Array9579[i_86_]);
					Class96 class96_93_ = null;
					if (class298_sub37_sub4_87_ != null) {
						class96_93_ = (((Class298_Sub37_Sub4) class298_sub37_sub4_87_).aClass96Array9579[i_88_]);
						if (((Class96) class96_93_).aClass298_Sub15_931 != class298_sub15)
							class96_93_ = null;
					}
					method4738(0, new int[0], 0, 0, 0, 0, bool);
					method4767(((Class96) class96_92_).aClass298_Sub15_931, class96_92_, class96_93_, i_89_, i_90_, 0, bools, true, bool, 65535, null);
					ka();
					method4734();
				}
			}
		}
	}

	public final void method4737(Class298_Sub37_Sub4 class298_sub37_sub4, int i) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				Class96 class96 = (((Class298_Sub37_Sub4) class298_sub37_sub4).aClass96Array9579[i]);
				Class298_Sub15 class298_sub15 = ((Class96) class96).aClass298_Sub15_931;
				for (int i_94_ = 0; i_94_ < ((Class96) class96).anInt925; i_94_++) {
					short i_95_ = ((Class96) class96).aShortArray933[i_94_];
					if (((Class298_Sub15) class298_sub15).aBooleanArray7275[i_95_]) {
						if (((Class96) class96).aShortArray937[i_94_] != -1)
							w(0, 0, 0, 0);
						w((((Class298_Sub15) class298_sub15).anIntArray7278[i_95_]), ((Class96) class96).aShortArray934[i_94_], ((Class96) class96).aShortArray930[i_94_], ((Class96) class96).aShortArray936[i_94_]);
					}
				}
				ka();
				method4734();
			}
		}
	}

	abstract void method4738(int i, int[] is, int i_96_, int i_97_, int i_98_, int i_99_, boolean bool);

	public abstract void method4739(Matrix3f class222, Class302_Sub1 class302_sub1, int i);

	abstract void cl(int i, int[] is, int i_100_, int i_101_, int i_102_, boolean bool, int i_103_, int[] is_104_);

	abstract void e(int i, int[] is, int i_105_, int i_106_, int i_107_, boolean bool, int i_108_, int[] is_109_);

	abstract void w(int i, int i_110_, int i_111_, int i_112_);

	public abstract void method4740(Matrix3f class222, Class302_Sub1 class302_sub1, int i);

	public abstract void method4741(Matrix3f class222, int i, boolean bool);

	public abstract void bo(int i);

	public abstract int N();

	public abstract int n();

	abstract void cw(int i, int i_113_, int i_114_, int i_115_);

	public abstract void eb(short i, short i_116_);

	public abstract int YA();

	public abstract int o();

	public abstract int AA();

	public abstract int ha();

	public abstract void p(int i);

	public abstract void Q(int i);

	public abstract int c();

	public abstract byte[] ah();

	public abstract void X(short i, short i_117_);

	public abstract void method4742(byte i, byte[] is);

	public abstract void W(short i, short i_118_);

	public abstract void PA(int i, int i_119_, int i_120_, int i_121_);

	public abstract boolean method4743();

	public abstract boolean i();

	public abstract void ey(short i, short i_122_);

	void method4744(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, float[] fs, float f, int i_128_, float f_129_, float[] fs_130_) {
		i -= i_125_;
		i_123_ -= i_126_;
		i_124_ -= i_127_;
		float f_131_ = ((float) i * fs[0] + (float) i_123_ * fs[1] + (float) i_124_ * fs[2]);
		float f_132_ = ((float) i * fs[3] + (float) i_123_ * fs[4] + (float) i_124_ * fs[5]);
		float f_133_ = ((float) i * fs[6] + (float) i_123_ * fs[7] + (float) i_124_ * fs[8]);
		float f_134_ = (((float) Math.atan2((double) f_131_, (double) f_133_) / 6.2831855F) + 0.5F);
		if (f != 1.0F)
			f_134_ *= f;
		float f_135_ = f_132_ + 0.5F + f_129_;
		if (i_128_ == 1) {
			float f_136_ = f_134_;
			f_134_ = -f_135_;
			f_135_ = f_136_;
		} else if (i_128_ == 2) {
			f_134_ = -f_134_;
			f_135_ = -f_135_;
		} else if (i_128_ == 3) {
			float f_137_ = f_134_;
			f_134_ = f_135_;
			f_135_ = -f_137_;
		}
		fs_130_[0] = f_134_;
		fs_130_[1] = f_135_;
	}

	public abstract void bw(int i, int i_138_, int i_139_);

	public abstract int ce();

	public abstract void method4745(Class387 class387_140_, int i, int i_141_, int i_142_, boolean bool);

	public abstract boolean method4746(int i, int i_143_, Matrix3f class222, boolean bool, int i_144_);

	public abstract void method4747(Class387 class387_145_, int i, int i_146_, int i_147_, boolean bool);

	public abstract Class387 method4748(byte i, int i_148_, boolean bool);

	public abstract boolean eg();

	public abstract Class387 method4749(byte i, int i_149_, boolean bool);

	public abstract Class387 method4750(byte i, int i_150_, boolean bool);

	public abstract boolean ev();

	public abstract void au(int i);

	public abstract void ar(int i);

	public abstract void method4751(Matrix3f class222);

	public abstract void method4752();

	public abstract int ya();

	public abstract void bf(int i);

	public abstract void be(int i);

	public abstract Class68[] method4753();

	public abstract void bm(int i);

	public abstract void bc(int i);

	public abstract void bx(int i);

	abstract void method4754();

	public abstract void bb(int i);

	public abstract void bl(int i, int i_151_, int i_152_);

	public abstract void f(int i);

	public abstract Class387 method4755(byte i, int i_153_, boolean bool);

	abstract void method4756();

	public abstract void bq(int i, int i_154_, int i_155_);

	public abstract void bg(int i, int i_156_, Class_xa class_xa, Class_xa class_xa_157_, int i_158_, int i_159_, int i_160_);

	public abstract void bs(int i, int i_161_, Class_xa class_xa, Class_xa class_xa_162_, int i_163_, int i_164_, int i_165_);

	public abstract void bp(int i, int i_166_, Class_xa class_xa, Class_xa class_xa_167_, int i_168_, int i_169_, int i_170_);

	abstract void method4757();

	abstract boolean bj();

	abstract void method4758();

	abstract boolean bt();

	public abstract Class_na ct(Class_na class_na);

	abstract void br();

	public abstract void method4759(Matrix3f class222, Class302_Sub1 class302_sub1, int i);

	abstract void cm();

	abstract void bz();

	abstract void method4760(int i, int[] is, int i_171_, int i_172_, int i_173_, int i_174_, boolean bool);

	abstract void method4761(int i, int[] is, int i_175_, int i_176_, int i_177_, int i_178_, boolean bool);

	abstract void co(int i, int[] is, int i_179_, int i_180_, int i_181_, boolean bool, int i_182_, int[] is_183_);

	abstract void cv(int i, int i_184_, int i_185_, int i_186_);

	public abstract boolean u();

	public abstract void method4762(Matrix3f class222, int i, boolean bool);

	public abstract void dx(int i);

	public abstract boolean method4763(int i, int i_187_, Matrix3f class222, boolean bool, int i_188_);

	public abstract void dv(short i, short i_189_);

	public abstract void EA(int i);

	Class387() {
		/* empty */
	}

	public abstract int ca();

	public abstract int ci();

	public abstract void di(short i, short i_190_);

	public abstract int cb();

	public abstract int cr();

	public abstract int cu();

	public abstract int cp();

	public abstract void method4764();

	public abstract int cf();

	public abstract int dh();

	public abstract int dg();

	public abstract int dl();

	public abstract int dq();

	public abstract int ds();

	public final void method4765(Class298_Sub37_Sub4 class298_sub37_sub4, int i, Class298_Sub37_Sub4 class298_sub37_sub4_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, boolean bool, int[] is) {
		if (i != -1) {
			method4733();
			if (!ea())
				method4734();
			else {
				Class96 class96 = (((Class298_Sub37_Sub4) class298_sub37_sub4).aClass96Array9579[i]);
				Class298_Sub15 class298_sub15 = ((Class96) class96).aClass298_Sub15_931;
				Class96 class96_197_ = null;
				if (class298_sub37_sub4_191_ != null) {
					class96_197_ = (((Class298_Sub37_Sub4) class298_sub37_sub4_191_).aClass96Array9579[i_192_]);
					if (((Class96) class96_197_).aClass298_Sub15_931 != class298_sub15)
						class96_197_ = null;
				}
				method4767(class298_sub15, class96, class96_197_, i_193_, i_194_, i_195_, null, false, bool, i_196_, is);
				ka();
				method4734();
			}
		}
	}

	void method4766(int i, int[] is, int i_198_, int i_199_, int i_200_, int i_201_, boolean bool, int i_202_, int[] is_203_) {
		if (i_201_ == 1) {
			if (i == 0 || i == 1) {
				int i_204_ = -i_198_;
				i_198_ = i_200_;
				i_200_ = i_204_;
			} else if (i == 3) {
				int i_205_ = i_198_;
				i_198_ = i_200_;
				i_200_ = i_205_;
			} else if (i == 2) {
				int i_206_ = i_198_;
				i_198_ = -i_200_ & 0x3fff;
				i_200_ = i_206_ & 0x3fff;
			}
		} else if (i_201_ == 2) {
			if (i == 0 || i == 1) {
				i_198_ = -i_198_;
				i_200_ = -i_200_;
			} else if (i == 2) {
				i_198_ = -i_198_ & 0x3fff;
				i_200_ = -i_200_ & 0x3fff;
			}
		} else if (i_201_ == 3) {
			if (i == 0 || i == 1) {
				int i_207_ = i_198_;
				i_198_ = -i_200_;
				i_200_ = i_207_;
			} else if (i == 3) {
				int i_208_ = i_198_;
				i_198_ = i_200_;
				i_200_ = i_208_;
			} else if (i == 2) {
				int i_209_ = i_198_;
				i_198_ = i_200_ & 0x3fff;
				i_200_ = -i_209_ & 0x3fff;
			}
		}
		if (i_202_ != 65535)
			e(i, is, i_198_, i_199_, i_200_, bool, i_202_, is_203_);
		else
			method4738(i, is, i_198_, i_199_, i_200_, i_201_, bool);
	}

	void method4767(Class298_Sub15 class298_sub15, Class96 class96, Class96 class96_210_, int i, int i_211_, int i_212_, boolean[] bools, boolean bool, boolean bool_213_, int i_214_, int[] is) {
		if (class96_210_ == null || i == 0) {
			for (int i_215_ = 0; i_215_ < ((Class96) class96).anInt925; i_215_++) {
				short i_216_ = ((Class96) class96).aShortArray933[i_215_];
				if (bools == null || bools[i_216_] == bool || (((Class298_Sub15) class298_sub15).anIntArray7278[i_216_]) == 0) {
					short i_217_ = ((Class96) class96).aShortArray937[i_215_];
					if (i_217_ != -1)
						method4766(0, (((Class298_Sub15) class298_sub15).anIntArrayArray7279[i_217_]), 0, 0, 0, i_212_, bool_213_, i_214_ & (((Class298_Sub15) class298_sub15).anIntArray7280[i_217_]), is);
					method4766((((Class298_Sub15) class298_sub15).anIntArray7278[i_216_]), (((Class298_Sub15) class298_sub15).anIntArrayArray7279[i_216_]), ((Class96) class96).aShortArray934[i_215_], ((Class96) class96).aShortArray930[i_215_], ((Class96) class96).aShortArray936[i_215_], i_212_, bool_213_, i_214_ & (((Class298_Sub15) class298_sub15).anIntArray7280[i_216_]), is);
				}
			}
		} else {
			int i_218_ = 0;
			int i_219_ = 0;
			for (int i_220_ = 0; (i_220_ < ((Class298_Sub15) class298_sub15).anInt7268 * 92429039); i_220_++) {
				boolean bool_221_ = false;
				if (i_218_ < ((Class96) class96).anInt925 && ((Class96) class96).aShortArray933[i_218_] == i_220_)
					bool_221_ = true;
				boolean bool_222_ = false;
				if (i_219_ < ((Class96) class96_210_).anInt925 && (((Class96) class96_210_).aShortArray933[i_219_] == i_220_))
					bool_222_ = true;
				if (bool_221_ || bool_222_) {
					if (bools != null && bools[i_220_] != bool && (((Class298_Sub15) class298_sub15).anIntArray7278[i_220_]) != 0) {
						if (bool_221_)
							i_218_++;
						if (bool_222_)
							i_219_++;
					} else {
						int i_223_ = 0;
						int i_224_ = (((Class298_Sub15) class298_sub15).anIntArray7278[i_220_]);
						if (i_224_ == 3 || i_224_ == 10)
							i_223_ = 128;
						int i_225_;
						int i_226_;
						int i_227_;
						short i_228_;
						byte i_229_;
						if (bool_221_) {
							i_225_ = ((Class96) class96).aShortArray934[i_218_];
							i_226_ = ((Class96) class96).aShortArray930[i_218_];
							i_227_ = ((Class96) class96).aShortArray936[i_218_];
							i_228_ = ((Class96) class96).aShortArray937[i_218_];
							i_229_ = ((Class96) class96).aByteArray938[i_218_];
							i_218_++;
						} else {
							i_225_ = i_223_;
							i_226_ = i_223_;
							i_227_ = i_223_;
							i_228_ = (short) -1;
							i_229_ = (byte) 0;
						}
						int i_230_;
						int i_231_;
						int i_232_;
						short i_233_;
						byte i_234_;
						if (bool_222_) {
							i_230_ = (((Class96) class96_210_).aShortArray934[i_219_]);
							i_231_ = (((Class96) class96_210_).aShortArray930[i_219_]);
							i_232_ = (((Class96) class96_210_).aShortArray936[i_219_]);
							i_233_ = (((Class96) class96_210_).aShortArray937[i_219_]);
							i_234_ = (((Class96) class96_210_).aByteArray938[i_219_]);
							i_219_++;
						} else {
							i_230_ = i_223_;
							i_231_ = i_223_;
							i_232_ = i_223_;
							i_233_ = (short) -1;
							i_234_ = (byte) 0;
						}
						int i_235_;
						int i_236_;
						int i_237_;
						if ((i_229_ & 0x2) != 0 || (i_234_ & 0x1) != 0) {
							i_235_ = i_225_;
							i_236_ = i_226_;
							i_237_ = i_227_;
						} else if (i_224_ == 2) {
							int i_238_ = i_230_ - i_225_ & 0x3fff;
							int i_239_ = i_231_ - i_226_ & 0x3fff;
							int i_240_ = i_232_ - i_227_ & 0x3fff;
							if (i_238_ >= 8192)
								i_238_ -= 16384;
							if (i_239_ >= 8192)
								i_239_ -= 16384;
							if (i_240_ >= 8192)
								i_240_ -= 16384;
							i_235_ = i_225_ + i_238_ * i / i_211_ & 0x3fff;
							i_236_ = i_226_ + i_239_ * i / i_211_ & 0x3fff;
							i_237_ = i_227_ + i_240_ * i / i_211_ & 0x3fff;
						} else if (i_224_ == 9) {
							int i_241_ = i_230_ - i_225_ & 0x3fff;
							if (i_241_ >= 8192)
								i_241_ -= 16384;
							i_235_ = i_225_ + i_241_ * i / i_211_ & 0x3fff;
							i_237_ = 0;
							i_236_ = 0;
						} else if (i_224_ == 7) {
							int i_242_ = i_230_ - i_225_ & 0x3f;
							if (i_242_ >= 32)
								i_242_ -= 64;
							i_235_ = i_225_ + i_242_ * i / i_211_ & 0x3f;
							i_236_ = i_226_ + (i_231_ - i_226_) * i / i_211_;
							i_237_ = i_227_ + (i_232_ - i_227_) * i / i_211_;
						} else {
							i_235_ = i_225_ + (i_230_ - i_225_) * i / i_211_;
							i_236_ = i_226_ + (i_231_ - i_226_) * i / i_211_;
							i_237_ = i_227_ + (i_232_ - i_227_) * i / i_211_;
						}
						if (i_228_ != -1)
							method4766(0, (((Class298_Sub15) class298_sub15).anIntArrayArray7279[i_228_]), 0, 0, 0, i_212_, bool_213_, (i_214_ & (((Class298_Sub15) class298_sub15).anIntArray7280[i_228_])), is);
						else if (i_233_ != -1)
							method4766(0, (((Class298_Sub15) class298_sub15).anIntArrayArray7279[i_233_]), 0, 0, 0, i_212_, bool_213_, (i_214_ & (((Class298_Sub15) class298_sub15).anIntArray7280[i_233_])), is);
						method4766(i_224_, (((Class298_Sub15) class298_sub15).anIntArrayArray7279[i_220_]), i_235_, i_236_, i_237_, i_212_, bool_213_, i_214_ & (((Class298_Sub15) class298_sub15).anIntArray7280[i_220_]), is);
					}
				}
			}
		}
	}

	public abstract void dc(int i);

	public abstract int dk();

	public abstract int db();

	public abstract int dn();

	public abstract byte[] method_do();

	public abstract void method4768(byte i, byte[] is);

	public abstract void method4769(byte i, byte[] is);

	public abstract void du(short i, short i_243_);

	public abstract Class387 method4770(byte i, int i_244_, boolean bool);

	abstract void cd();

	public abstract void df(short i, short i_245_);

	public abstract void dz(short i, short i_246_);

	public abstract void dt(int i, int i_247_, int i_248_, int i_249_);

	public abstract void dj(int i, int i_250_, int i_251_, int i_252_);

	public abstract void dr(int i, int i_253_, int i_254_, int i_255_);

	public abstract Class85[] method4771();

	public abstract Class85[] method4772();

	public abstract Class68[] method4773();

	public abstract Class68[] method4774();

	public abstract int dp();

	public abstract Class68[] method4775();

	public abstract void method4776(Matrix3f class222, int i, boolean bool);

	public abstract boolean method4777();

	public abstract boolean method4778();

	public abstract void method4779(Class387 class387_256_, int i, int i_257_, int i_258_, boolean bool);

	abstract void ka();

	public abstract boolean ek();

	public abstract void em();

	void method4780(int i, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, float[] fs, int i_264_, float f, float[] fs_265_) {
		i -= i_261_;
		i_259_ -= i_262_;
		i_260_ -= i_263_;
		float f_266_ = ((float) i * fs[0] + (float) i_259_ * fs[1] + (float) i_260_ * fs[2]);
		float f_267_ = ((float) i * fs[3] + (float) i_259_ * fs[4] + (float) i_260_ * fs[5]);
		float f_268_ = ((float) i * fs[6] + (float) i_259_ * fs[7] + (float) i_260_ * fs[8]);
		float f_269_ = (float) Math.sqrt((double) (f_266_ * f_266_ + f_267_ * f_267_ + f_268_ * f_268_));
		float f_270_ = (((float) Math.atan2((double) f_266_, (double) f_268_) / 6.2831855F) + 0.5F);
		float f_271_ = ((float) Math.asin((double) (f_267_ / f_269_)) / 3.1415927F + 0.5F + f);
		if (i_264_ == 1) {
			float f_272_ = f_270_;
			f_270_ = -f_271_;
			f_271_ = f_272_;
		} else if (i_264_ == 2) {
			f_270_ = -f_270_;
			f_271_ = -f_271_;
		} else if (i_264_ == 3) {
			float f_273_ = f_270_;
			f_270_ = f_271_;
			f_271_ = -f_273_;
		}
		fs_265_[0] = f_270_;
		fs_265_[1] = f_271_;
	}

	public abstract int an();

	public abstract Class85[] method4781();

	public abstract void method4782(Matrix3f class222);

	public abstract void method4783(Matrix3f class222);

	public abstract Class_na cc(Class_na class_na);

	public abstract void method4784();

	public abstract void bk(int i, int i_274_, int i_275_);

	Class76 method4785(Model model, int[] is, int i) {
		int[] is_276_ = null;
		int[] is_277_ = null;
		int[] is_278_ = null;
		float[][] fs = null;
		if (model.aByteArray635 != null) {
			int i_279_ = model.texturedTriangles;
			int[] is_280_ = new int[i_279_];
			int[] is_281_ = new int[i_279_];
			int[] is_282_ = new int[i_279_];
			int[] is_283_ = new int[i_279_];
			int[] is_284_ = new int[i_279_];
			int[] is_285_ = new int[i_279_];
			for (int i_286_ = 0; i_286_ < i_279_; i_286_++) {
				is_280_[i_286_] = 2147483647;
				is_281_[i_286_] = -2147483647;
				is_282_[i_286_] = 2147483647;
				is_283_[i_286_] = -2147483647;
				is_284_[i_286_] = 2147483647;
				is_285_[i_286_] = -2147483647;
			}
			for (int i_287_ = 0; i_287_ < i; i_287_++) {
				int i_288_ = is[i_287_];
				if (model.aByteArray635[i_288_] != -1) {
					int i_289_ = model.aByteArray635[i_288_] & 0xff;
					for (int i_290_ = 0; i_290_ < 3; i_290_++) {
						short i_291_;
						if (i_290_ == 0)
							i_291_ = model.aShortArray644[i_288_];
						else if (i_290_ == 1)
							i_291_ = model.aShortArray646[i_288_];
						else
							i_291_ = model.aShortArray624[i_288_];
						int i_292_ = model.anIntArray616[i_291_];
						int i_293_ = model.anIntArray642[i_291_];
						int i_294_ = model.anIntArray618[i_291_];
						if (i_292_ < is_280_[i_289_])
							is_280_[i_289_] = i_292_;
						if (i_292_ > is_281_[i_289_])
							is_281_[i_289_] = i_292_;
						if (i_293_ < is_282_[i_289_])
							is_282_[i_289_] = i_293_;
						if (i_293_ > is_283_[i_289_])
							is_283_[i_289_] = i_293_;
						if (i_294_ < is_284_[i_289_])
							is_284_[i_289_] = i_294_;
						if (i_294_ > is_285_[i_289_])
							is_285_[i_289_] = i_294_;
					}
				}
			}
			is_276_ = new int[i_279_];
			is_277_ = new int[i_279_];
			is_278_ = new int[i_279_];
			fs = new float[i_279_][];
			for (int i_295_ = 0; i_295_ < i_279_; i_295_++) {
				byte i_296_ = model.tex_fill_attr[i_295_];
				if (i_296_ > 0) {
					is_276_[i_295_] = (is_280_[i_295_] + is_281_[i_295_]) / 2;
					is_277_[i_295_] = (is_282_[i_295_] + is_283_[i_295_]) / 2;
					is_278_[i_295_] = (is_284_[i_295_] + is_285_[i_295_]) / 2;
					float f;
					float f_297_;
					float f_298_;
					if (i_296_ == 1) {
						int i_299_ = model.particles_zlifepsan[i_295_];
						if (i_299_ == 0) {
							f = 1.0F;
							f_298_ = 1.0F;
						} else if (i_299_ > 0) {
							f = 1.0F;
							f_298_ = (float) i_299_ / 1024.0F;
						} else {
							f_298_ = 1.0F;
							f = (float) -i_299_ / 1024.0F;
						}
						f_297_ = 64.0F / (float) model.particles_zdir[i_295_];
					} else if (i_296_ == 2) {
						f = 64.0F / (float) model.particles_zlifepsan[i_295_];
						f_297_ = 64.0F / (float) model.particles_zdir[i_295_];
						f_298_ = 64.0F / (float) model.particles_xdir[i_295_];
					} else {
						f = (float) model.particles_zlifepsan[i_295_] / 1024.0F;
						f_297_ = (float) model.particles_zdir[i_295_] / 1024.0F;
						f_298_ = (float) model.particles_xdir[i_295_] / 1024.0F;
					}
					fs[i_295_] = method4731(model.tex_point_mapx[i_295_], model.tex_point_mapy[i_295_], model.tex_point_mapz[i_295_], model.particles_xlifespan[i_295_] & 0xff, f, f_297_, f_298_);
				}
			}
		}
		return new Class76(this, is_276_, is_277_, is_278_, fs);
	}

	public abstract void method4786(Matrix3f class222);

	public abstract boolean method4787(int i, int i_300_, Matrix3f class222, boolean bool, int i_301_);

	public abstract boolean method4788();

	public abstract int RA();

	public abstract int cq();

	public abstract boolean ex();

	public abstract Class_na ga(Class_na class_na);

	public abstract void ac(int i);

	abstract void cj(int i, int[] is, int i_302_, int i_303_, int i_304_, boolean bool, int i_305_, int[] is_306_);
}
