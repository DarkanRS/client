/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class i extends Class_xa implements Interface25 {
	ja aJa6678;
	long nativeid;
	Class453 aClass453_6679 = new Class453();

	i(ja var_ja, ba var_ba, int i, int i_0_, int[][] is, int[][] is_1_, int i_2_, int i_3_, int i_4_) {
		super(i, i_0_, i_2_, is);
		((i) this).aJa6678 = var_ja;
		G(((i) this).aJa6678, var_ba, i, i_0_, anIntArrayArray6290, is_1_, i_2_, i_3_, i_4_);
	}

	public final void method6359(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, Class78 class78, boolean bool) {
		ya(i, i_5_, is, is_6_, is_7_, is_8_, is_9_, is_10_, is_11_, is_12_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	native void ay(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int[] is);

	public native void ma(boolean bool);

	public native void LA(int i, int i_18_, int i_19_);

	public native void SA();

	native void ya(int i, int i_20_, int[] is, int[] is_21_, int[] is_22_, int[] is_23_, int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int i_28_, int i_29_, int i_30_, boolean bool);

	native void ab(int i, int i_31_, int[] is, int[] is_32_, int[] is_33_, int[] is_34_, int[] is_35_, int[] is_36_, int[] is_37_, int[] is_38_, int i_39_, int i_40_, int i_41_, boolean bool);

	public void method6336(int i, int i_42_, int[] is, int[] is_43_, int[] is_44_, int[] is_45_, int[] is_46_, int[] is_47_, int[] is_48_, int[] is_49_, int[] is_50_, int[] is_51_, int[] is_52_, Class78 class78, boolean bool) {
		boolean bool_53_ = false;
		if (is_49_ != null) {
			int[] is_54_ = is_49_;
			for (int i_55_ = 0; i_55_ < is_54_.length; i_55_++) {
				int i_56_ = is_54_[i_55_];
				if (i_56_ != -1) {
					bool_53_ = true;
					break;
				}
			}
		}
		int i_57_ = is_49_.length;
		int[] is_58_ = new int[i_57_ * 3];
		int[] is_59_ = new int[i_57_ * 3];
		int[] is_60_ = new int[i_57_ * 3];
		int[] is_61_ = new int[i_57_ * 3];
		int[] is_62_ = new int[i_57_ * 3];
		int[] is_63_ = is_50_ != null ? new int[i_57_ * 3] : null;
		int[] is_64_ = is_43_ != null ? new int[i_57_ * 3] : null;
		int[] is_65_ = is_45_ != null ? new int[i_57_ * 3] : null;
		int i_66_ = 0;
		for (int i_67_ = 0; i_67_ < i_57_; i_67_++) {
			int i_68_ = is_46_[i_67_];
			int i_69_ = is_47_[i_67_];
			int i_70_ = is_48_[i_67_];
			is_58_[i_66_] = is[i_68_];
			is_59_[i_66_] = is_44_[i_68_];
			is_60_[i_66_] = is_49_[i_67_];
			is_61_[i_66_] = is_51_[i_67_];
			is_62_[i_66_] = is_52_[i_67_];
			if (is_50_ != null)
				is_63_[i_66_] = is_50_[i_67_];
			if (is_43_ != null)
				is_64_[i_66_] = is_43_[i_68_];
			if (is_45_ != null)
				is_65_[i_66_] = is_45_[i_68_];
			i_66_++;
			is_58_[i_66_] = is[i_69_];
			is_59_[i_66_] = is_44_[i_69_];
			is_60_[i_66_] = is_49_[i_67_];
			is_61_[i_66_] = is_51_[i_67_];
			is_62_[i_66_] = is_52_[i_67_];
			if (is_50_ != null)
				is_63_[i_66_] = is_50_[i_67_];
			if (is_43_ != null)
				is_64_[i_66_] = is_43_[i_69_];
			if (is_45_ != null)
				is_65_[i_66_] = is_45_[i_69_];
			i_66_++;
			is_58_[i_66_] = is[i_70_];
			is_59_[i_66_] = is_44_[i_70_];
			is_60_[i_66_] = is_49_[i_67_];
			is_61_[i_66_] = is_51_[i_67_];
			is_62_[i_66_] = is_52_[i_67_];
			if (is_50_ != null)
				is_63_[i_66_] = is_50_[i_67_];
			if (is_43_ != null)
				is_64_[i_66_] = is_43_[i_70_];
			if (is_45_ != null)
				is_65_[i_66_] = is_45_[i_70_];
			i_66_++;
		}
		if (bool_53_ || is_63_ != null)
			ya(i, i_42_, is_58_, is_64_, is_59_, is_65_, is_60_, is_63_, is_61_, is_62_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public void method6338(int i, int i_71_, int i_72_, boolean[][] bools, boolean bool, int i_73_) {
		int i_74_ = 0;
		float[] fs = new float[((i) this).aClass453_6679.method5948(1828905535)];
		for (Class298_Sub10 class298_sub10 = ((Class298_Sub10) ((i) this).aClass453_6679.method5939(1766612795)); class298_sub10 != null; class298_sub10 = ((Class298_Sub10) ((i) this).aClass453_6679.method5944(49146)))
			fs[i_74_++] = class298_sub10.method2901(608404512);
		t(fs);
		for (int i_75_ = 0; i_75_ < i_72_ + i_72_; i_75_++) {
			for (int i_76_ = 0; i_76_ < i_72_ + i_72_; i_76_++) {
				if (bools[i_75_][i_76_]) {
					int i_77_ = i - i_72_ + i_75_;
					int i_78_ = i_71_ - i_72_ + i_76_;
					if (i_77_ >= 0 && i_77_ < anInt6287 * -506105871 && i_78_ >= 0 && i_78_ < anInt6286 * -1148794921)
						((i) this).aJa6678.method5571().method281(this, i_77_, i_78_);
				}
			}
		}
	}

	public void method6339(int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, boolean[][] bools) {
		((i) this).aJa6678.method5571().method282(this, i, i_79_, i_80_, i_81_, i_82_, i_83_, i_84_, bools);
	}

	public native Class_na w(int i, int i_85_, Class_na class_na);

	public native void UA(Class_na class_na, int i, int i_86_, int i_87_, int i_88_, boolean bool);

	public void method6349(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, boolean[][] bools) {
		((i) this).aJa6678.method5571().method282(this, i, i_89_, i_90_, i_91_, i_92_, i_93_, i_94_, bools);
	}

	public boolean method6353(Class_na class_na, int i, int i_95_, int i_96_, int i_97_, boolean bool) {
		return true;
	}

	public void method6342(Class298_Sub10 class298_sub10, int[] is) {
		((i) this).aClass453_6679.method5935(class298_sub10, 1770032903);
		A(class298_sub10.hashCode(), class298_sub10.method2895(823958259), class298_sub10.method2894(-2119819308), class298_sub10.method2897((byte) 45), class298_sub10.method2900(-672312292), class298_sub10.method2898(-2045432623), is);
	}

	native void A(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int[] is);

	native void t(float[] fs);

	public final void method6346(int i, int i_103_, int[] is, int[] is_104_, int[] is_105_, int[] is_106_, int[] is_107_, int[] is_108_, int[] is_109_, int[] is_110_, Class78 class78, boolean bool) {
		ya(i, i_103_, is, is_104_, is_105_, is_106_, is_107_, is_108_, is_109_, is_110_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public native void z(boolean bool);

	public native void ak(Class_na class_na, int i, int i_111_, int i_112_, int i_113_, boolean bool);

	public final void method6335(int i, int i_114_, int[] is, int[] is_115_, int[] is_116_, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, int[] is_121_, Class78 class78, boolean bool) {
		ya(i, i_114_, is, is_115_, is_116_, is_117_, is_118_, is_119_, is_120_, is_121_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	native void an(float[] fs);

	public final void method6345(int i, int i_122_, int[] is, int[] is_123_, int[] is_124_, int[] is_125_, int[] is_126_, int[] is_127_, int[] is_128_, int[] is_129_, Class78 class78, boolean bool) {
		ya(i, i_122_, is, is_123_, is_124_, is_125_, is_126_, is_127_, is_128_, is_129_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public native void h();

	public void method6357(int i, int i_130_, int i_131_, boolean[][] bools, boolean bool, int i_132_) {
		int i_133_ = 0;
		float[] fs = new float[((i) this).aClass453_6679.method5948(1828905535)];
		for (Class298_Sub10 class298_sub10 = ((Class298_Sub10) ((i) this).aClass453_6679.method5939(1766612795)); class298_sub10 != null; class298_sub10 = ((Class298_Sub10) ((i) this).aClass453_6679.method5944(49146)))
			fs[i_133_++] = class298_sub10.method2901(608404512);
		t(fs);
		for (int i_134_ = 0; i_134_ < i_131_ + i_131_; i_134_++) {
			for (int i_135_ = 0; i_135_ < i_131_ + i_131_; i_135_++) {
				if (bools[i_134_][i_135_]) {
					int i_136_ = i - i_131_ + i_134_;
					int i_137_ = i_130_ - i_131_ + i_135_;
					if (i_136_ >= 0 && i_136_ < anInt6287 * -506105871 && i_137_ >= 0 && i_137_ < anInt6286 * -1148794921)
						((i) this).aJa6678.method5571().method281(this, i_136_, i_137_);
				}
			}
		}
	}

	public void method6348(int i, int i_138_, int i_139_, boolean[][] bools, boolean bool, int i_140_) {
		int i_141_ = 0;
		float[] fs = new float[((i) this).aClass453_6679.method5948(1828905535)];
		for (Class298_Sub10 class298_sub10 = ((Class298_Sub10) ((i) this).aClass453_6679.method5939(1766612795)); class298_sub10 != null; class298_sub10 = ((Class298_Sub10) ((i) this).aClass453_6679.method5944(49146)))
			fs[i_141_++] = class298_sub10.method2901(608404512);
		t(fs);
		for (int i_142_ = 0; i_142_ < i_139_ + i_139_; i_142_++) {
			for (int i_143_ = 0; i_143_ < i_139_ + i_139_; i_143_++) {
				if (bools[i_142_][i_143_]) {
					int i_144_ = i - i_139_ + i_142_;
					int i_145_ = i_138_ - i_139_ + i_143_;
					if (i_144_ >= 0 && i_144_ < anInt6287 * -506105871 && i_145_ >= 0 && i_145_ < anInt6286 * -1148794921)
						((i) this).aJa6678.method5571().method281(this, i_144_, i_145_);
				}
			}
		}
	}

	public void method6337(int i, int i_146_, int[] is, int[] is_147_, int[] is_148_, int[] is_149_, int[] is_150_, int[] is_151_, int[] is_152_, int[] is_153_, int[] is_154_, int[] is_155_, int[] is_156_, Class78 class78, boolean bool) {
		boolean bool_157_ = false;
		if (is_153_ != null) {
			int[] is_158_ = is_153_;
			for (int i_159_ = 0; i_159_ < is_158_.length; i_159_++) {
				int i_160_ = is_158_[i_159_];
				if (i_160_ != -1) {
					bool_157_ = true;
					break;
				}
			}
		}
		int i_161_ = is_153_.length;
		int[] is_162_ = new int[i_161_ * 3];
		int[] is_163_ = new int[i_161_ * 3];
		int[] is_164_ = new int[i_161_ * 3];
		int[] is_165_ = new int[i_161_ * 3];
		int[] is_166_ = new int[i_161_ * 3];
		int[] is_167_ = is_154_ != null ? new int[i_161_ * 3] : null;
		int[] is_168_ = is_147_ != null ? new int[i_161_ * 3] : null;
		int[] is_169_ = is_149_ != null ? new int[i_161_ * 3] : null;
		int i_170_ = 0;
		for (int i_171_ = 0; i_171_ < i_161_; i_171_++) {
			int i_172_ = is_150_[i_171_];
			int i_173_ = is_151_[i_171_];
			int i_174_ = is_152_[i_171_];
			is_162_[i_170_] = is[i_172_];
			is_163_[i_170_] = is_148_[i_172_];
			is_164_[i_170_] = is_153_[i_171_];
			is_165_[i_170_] = is_155_[i_171_];
			is_166_[i_170_] = is_156_[i_171_];
			if (is_154_ != null)
				is_167_[i_170_] = is_154_[i_171_];
			if (is_147_ != null)
				is_168_[i_170_] = is_147_[i_172_];
			if (is_149_ != null)
				is_169_[i_170_] = is_149_[i_172_];
			i_170_++;
			is_162_[i_170_] = is[i_173_];
			is_163_[i_170_] = is_148_[i_173_];
			is_164_[i_170_] = is_153_[i_171_];
			is_165_[i_170_] = is_155_[i_171_];
			is_166_[i_170_] = is_156_[i_171_];
			if (is_154_ != null)
				is_167_[i_170_] = is_154_[i_171_];
			if (is_147_ != null)
				is_168_[i_170_] = is_147_[i_173_];
			if (is_149_ != null)
				is_169_[i_170_] = is_149_[i_173_];
			i_170_++;
			is_162_[i_170_] = is[i_174_];
			is_163_[i_170_] = is_148_[i_174_];
			is_164_[i_170_] = is_153_[i_171_];
			is_165_[i_170_] = is_155_[i_171_];
			is_166_[i_170_] = is_156_[i_171_];
			if (is_154_ != null)
				is_167_[i_170_] = is_154_[i_171_];
			if (is_147_ != null)
				is_168_[i_170_] = is_147_[i_174_];
			if (is_149_ != null)
				is_169_[i_170_] = is_149_[i_174_];
			i_170_++;
		}
		if (bool_157_ || is_167_ != null)
			ya(i, i_146_, is_162_, is_168_, is_163_, is_169_, is_164_, is_167_, is_165_, is_166_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public native void ad(Class_na class_na, int i, int i_175_, int i_176_, int i_177_, boolean bool);

	public void method6350(int i, int i_178_, int i_179_, int i_180_, int i_181_, int i_182_, int i_183_, boolean[][] bools) {
		((i) this).aJa6678.method5571().method282(this, i, i_178_, i_179_, i_180_, i_181_, i_182_, i_183_, bools);
	}

	public void method6351(int i, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, boolean[][] bools) {
		((i) this).aJa6678.method5571().method282(this, i, i_184_, i_185_, i_186_, i_187_, i_188_, i_189_, bools);
	}

	public void method6352(int i, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, boolean[][] bools) {
		((i) this).aJa6678.method5571().method282(this, i, i_190_, i_191_, i_192_, i_193_, i_194_, i_195_, bools);
	}

	public native Class_na l(int i, int i_196_, Class_na class_na);

	public native Class_na ax(int i, int i_197_, Class_na class_na);

	public native Class_na aa(int i, int i_198_, Class_na class_na);

	public void method6356(int i, int i_199_, int[] is, int[] is_200_, int[] is_201_, int[] is_202_, int[] is_203_, int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, int[] is_208_, int[] is_209_, Class78 class78, boolean bool) {
		boolean bool_210_ = false;
		if (is_206_ != null) {
			int[] is_211_ = is_206_;
			for (int i_212_ = 0; i_212_ < is_211_.length; i_212_++) {
				int i_213_ = is_211_[i_212_];
				if (i_213_ != -1) {
					bool_210_ = true;
					break;
				}
			}
		}
		int i_214_ = is_206_.length;
		int[] is_215_ = new int[i_214_ * 3];
		int[] is_216_ = new int[i_214_ * 3];
		int[] is_217_ = new int[i_214_ * 3];
		int[] is_218_ = new int[i_214_ * 3];
		int[] is_219_ = new int[i_214_ * 3];
		int[] is_220_ = is_207_ != null ? new int[i_214_ * 3] : null;
		int[] is_221_ = is_200_ != null ? new int[i_214_ * 3] : null;
		int[] is_222_ = is_202_ != null ? new int[i_214_ * 3] : null;
		int i_223_ = 0;
		for (int i_224_ = 0; i_224_ < i_214_; i_224_++) {
			int i_225_ = is_203_[i_224_];
			int i_226_ = is_204_[i_224_];
			int i_227_ = is_205_[i_224_];
			is_215_[i_223_] = is[i_225_];
			is_216_[i_223_] = is_201_[i_225_];
			is_217_[i_223_] = is_206_[i_224_];
			is_218_[i_223_] = is_208_[i_224_];
			is_219_[i_223_] = is_209_[i_224_];
			if (is_207_ != null)
				is_220_[i_223_] = is_207_[i_224_];
			if (is_200_ != null)
				is_221_[i_223_] = is_200_[i_225_];
			if (is_202_ != null)
				is_222_[i_223_] = is_202_[i_225_];
			i_223_++;
			is_215_[i_223_] = is[i_226_];
			is_216_[i_223_] = is_201_[i_226_];
			is_217_[i_223_] = is_206_[i_224_];
			is_218_[i_223_] = is_208_[i_224_];
			is_219_[i_223_] = is_209_[i_224_];
			if (is_207_ != null)
				is_220_[i_223_] = is_207_[i_224_];
			if (is_200_ != null)
				is_221_[i_223_] = is_200_[i_226_];
			if (is_202_ != null)
				is_222_[i_223_] = is_202_[i_226_];
			i_223_++;
			is_215_[i_223_] = is[i_227_];
			is_216_[i_223_] = is_201_[i_227_];
			is_217_[i_223_] = is_206_[i_224_];
			is_218_[i_223_] = is_208_[i_224_];
			is_219_[i_223_] = is_209_[i_224_];
			if (is_207_ != null)
				is_220_[i_223_] = is_207_[i_224_];
			if (is_200_ != null)
				is_221_[i_223_] = is_200_[i_227_];
			if (is_202_ != null)
				is_222_[i_223_] = is_202_[i_227_];
			i_223_++;
		}
		if (bool_210_ || is_220_ != null)
			ya(i, i_199_, is_215_, is_221_, is_216_, is_222_, is_217_, is_220_, is_218_, is_219_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public boolean method6354(Class_na class_na, int i, int i_228_, int i_229_, int i_230_, boolean bool) {
		return true;
	}

	public native void NA(Class_na class_na, int i, int i_231_, int i_232_, int i_233_, boolean bool);

	public boolean method6355(Class_na class_na, int i, int i_234_, int i_235_, int i_236_, boolean bool) {
		return true;
	}

	public void method6343(int i, int i_237_, int[] is, int[] is_238_, int[] is_239_, int[] is_240_, int[] is_241_, int[] is_242_, int[] is_243_, int[] is_244_, int[] is_245_, int[] is_246_, int[] is_247_, Class78 class78, boolean bool) {
		boolean bool_248_ = false;
		if (is_244_ != null) {
			int[] is_249_ = is_244_;
			for (int i_250_ = 0; i_250_ < is_249_.length; i_250_++) {
				int i_251_ = is_249_[i_250_];
				if (i_251_ != -1) {
					bool_248_ = true;
					break;
				}
			}
		}
		int i_252_ = is_244_.length;
		int[] is_253_ = new int[i_252_ * 3];
		int[] is_254_ = new int[i_252_ * 3];
		int[] is_255_ = new int[i_252_ * 3];
		int[] is_256_ = new int[i_252_ * 3];
		int[] is_257_ = new int[i_252_ * 3];
		int[] is_258_ = is_245_ != null ? new int[i_252_ * 3] : null;
		int[] is_259_ = is_238_ != null ? new int[i_252_ * 3] : null;
		int[] is_260_ = is_240_ != null ? new int[i_252_ * 3] : null;
		int i_261_ = 0;
		for (int i_262_ = 0; i_262_ < i_252_; i_262_++) {
			int i_263_ = is_241_[i_262_];
			int i_264_ = is_242_[i_262_];
			int i_265_ = is_243_[i_262_];
			is_253_[i_261_] = is[i_263_];
			is_254_[i_261_] = is_239_[i_263_];
			is_255_[i_261_] = is_244_[i_262_];
			is_256_[i_261_] = is_246_[i_262_];
			is_257_[i_261_] = is_247_[i_262_];
			if (is_245_ != null)
				is_258_[i_261_] = is_245_[i_262_];
			if (is_238_ != null)
				is_259_[i_261_] = is_238_[i_263_];
			if (is_240_ != null)
				is_260_[i_261_] = is_240_[i_263_];
			i_261_++;
			is_253_[i_261_] = is[i_264_];
			is_254_[i_261_] = is_239_[i_264_];
			is_255_[i_261_] = is_244_[i_262_];
			is_256_[i_261_] = is_246_[i_262_];
			is_257_[i_261_] = is_247_[i_262_];
			if (is_245_ != null)
				is_258_[i_261_] = is_245_[i_262_];
			if (is_238_ != null)
				is_259_[i_261_] = is_238_[i_264_];
			if (is_240_ != null)
				is_260_[i_261_] = is_240_[i_264_];
			i_261_++;
			is_253_[i_261_] = is[i_265_];
			is_254_[i_261_] = is_239_[i_265_];
			is_255_[i_261_] = is_244_[i_262_];
			is_256_[i_261_] = is_246_[i_262_];
			is_257_[i_261_] = is_247_[i_262_];
			if (is_245_ != null)
				is_258_[i_261_] = is_245_[i_262_];
			if (is_238_ != null)
				is_259_[i_261_] = is_238_[i_265_];
			if (is_240_ != null)
				is_260_[i_261_] = is_240_[i_265_];
			i_261_++;
		}
		if (bool_248_ || is_258_ != null)
			ya(i, i_237_, is_253_, is_259_, is_254_, is_260_, is_255_, is_258_, is_256_, is_257_, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183, bool);
	}

	public void method6344(Class298_Sub10 class298_sub10, int[] is) {
		((i) this).aClass453_6679.method5935(class298_sub10, 957931044);
		A(class298_sub10.hashCode(), class298_sub10.method2895(823958259), class298_sub10.method2894(-939748445), class298_sub10.method2897((byte) 100), class298_sub10.method2900(-1170808732), class298_sub10.method2898(-2059498120), is);
	}

	public void method6358(Class298_Sub10 class298_sub10, int[] is) {
		((i) this).aClass453_6679.method5935(class298_sub10, 1406819574);
		A(class298_sub10.hashCode(), class298_sub10.method2895(823958259), class298_sub10.method2894(-1659137214), class298_sub10.method2897((byte) 53), class298_sub10.method2900(-822697788), class298_sub10.method2898(-1817941652), is);
	}

	native void au(float[] fs);

	native void ap(ja var_ja, ba var_ba, int i, int i_266_, int[][] is, int[][] is_267_, int i_268_, int i_269_, int i_270_);

	native void af(ja var_ja, ba var_ba, int i, int i_271_, int[][] is, int[][] is_272_, int i_273_, int i_274_, int i_275_);

	native void aw(ja var_ja, ba var_ba, int i, int i_276_, int[][] is, int[][] is_277_, int i_278_, int i_279_, int i_280_);

	public void method6347(int i, int i_281_, int i_282_, int i_283_, int i_284_, int i_285_, int i_286_, boolean[][] bools) {
		((i) this).aJa6678.method5571().method282(this, i, i_281_, i_282_, i_283_, i_284_, i_285_, i_286_, bools);
	}

	native void aj(int i, int i_287_, int[] is, int[] is_288_, int[] is_289_, int[] is_290_, int[] is_291_, int[] is_292_, int[] is_293_, int[] is_294_, int i_295_, int i_296_, int i_297_, boolean bool);

	native void G(ja var_ja, ba var_ba, int i, int i_298_, int[][] is, int[][] is_299_, int i_300_, int i_301_, int i_302_);

	native void aq(int i, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, int[] is);

	native void ag(float[] fs);

	public native void at(int i, int i_308_, int i_309_);

	public native void av(Class_na class_na, int i, int i_310_, int i_311_, int i_312_, boolean bool);
}
