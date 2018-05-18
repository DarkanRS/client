/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class NativeSprite implements Interface39 {
	public abstract void method2742(int i, int i_0_, int i_1_, int i_2_, int i_3_);

	public abstract void method2743(int i, int i_4_, int i_5_, int i_6_);

	public abstract void method2744(int[] is);

	public final void method2745(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		method2755(i, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, 1);
	}

	public final void method2746(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		method2755(i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, 1);
	}

	public abstract int method2747();

	public abstract int method2748();

	public abstract void method2749(int i, int i_19_, int i_20_, int i_21_, int i_22_);

	public abstract void method2750(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_);

	public abstract void method2751(int i, int i_28_, int i_29_);

	public final void method2752(int i, int i_30_) {
		method2742(i, i_30_, 1, 0, 1);
	}

	public abstract int method227();

	public abstract int method2753();

	NativeSprite() {
		/* empty */
	}

	public final void method2754(int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		method2755(i, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, 1);
	}

	abstract void method2755(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_);

	public final void method2756(int i, int i_44_, int i_45_, int i_46_) {
		method2772(i, i_44_, i_45_, i_46_, 1, 0, 1);
	}

	public abstract int method2757();

	public final void method2758(float f, float f_47_, int i, int i_48_) {
		method2760(f, f_47_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_48_, 1, 0, 1);
	}

	final void method2759(float f, float f_49_, float f_50_, float f_51_, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (i != 0) {
			double d = (double) (i_52_ & 0xffff) * 9.587379924285257E-5;
			float f_56_ = (float) Math.sin(d) * (float) i;
			float f_57_ = (float) Math.cos(d) * (float) i;
			float f_58_ = (-f_50_ * f_57_ + -f_51_ * f_56_) / 4096.0F + f;
			float f_59_ = (--f_50_ * f_56_ + -f_51_ * f_57_) / 4096.0F + f_49_;
			float f_60_ = ((((float) method228() - f_50_) * f_57_ + -f_51_ * f_56_) / 4096.0F + f);
			float f_61_ = ((-((float) method228() - f_50_) * f_56_ + -f_51_ * f_57_) / 4096.0F + f_49_);
			float f_62_ = ((-f_50_ * f_57_ + ((float) method2748() - f_51_) * f_56_) / 4096.0F + f);
			float f_63_ = ((--f_50_ * f_56_ + ((float) method2748() - f_51_) * f_57_) / 4096.0F + f_49_);
			method2763(f_58_, f_59_, f_60_, f_61_, f_62_, f_63_, i_53_, i_54_, i_55_);
		}
	}

	final void method2760(float f, float f_64_, float f_65_, float f_66_, int i, int i_67_, int i_68_, int i_69_, int i_70_) {
		if (i != 0) {
			double d = (double) (i_67_ & 0xffff) * 9.587379924285257E-5;
			float f_71_ = (float) Math.sin(d) * (float) i;
			float f_72_ = (float) Math.cos(d) * (float) i;
			float f_73_ = (-f_65_ * f_72_ + -f_66_ * f_71_) / 4096.0F + f;
			float f_74_ = (--f_65_ * f_71_ + -f_66_ * f_72_) / 4096.0F + f_64_;
			float f_75_ = ((((float) method228() - f_65_) * f_72_ + -f_66_ * f_71_) / 4096.0F + f);
			float f_76_ = ((-((float) method228() - f_65_) * f_71_ + -f_66_ * f_72_) / 4096.0F + f_64_);
			float f_77_ = ((-f_65_ * f_72_ + ((float) method2748() - f_66_) * f_71_) / 4096.0F + f);
			float f_78_ = ((--f_65_ * f_71_ + ((float) method2748() - f_66_) * f_72_) / 4096.0F + f_64_);
			method2763(f_73_, f_74_, f_75_, f_76_, f_77_, f_78_, i_68_, i_69_, i_70_);
		}
	}

	public final void method2761(float f, float f_79_, int i, int i_80_, Class455 class455, int i_81_, int i_82_) {
		method2762(f, f_79_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_80_, class455, i_81_, i_82_);
	}

	public final void method2762(float f, float f_83_, float f_84_, float f_85_, int i, int i_86_, Class455 class455, int i_87_, int i_88_) {
		if (i != 0) {
			double d = (double) (i_86_ & 0xffff) * 9.587379924285257E-5;
			float f_89_ = (float) Math.sin(d) * (float) i;
			float f_90_ = (float) Math.cos(d) * (float) i;
			float f_91_ = (-f_84_ * f_90_ + -f_85_ * f_89_) / 4096.0F + f;
			float f_92_ = (--f_84_ * f_89_ + -f_85_ * f_90_) / 4096.0F + f_83_;
			float f_93_ = ((((float) method228() - f_84_) * f_90_ + -f_85_ * f_89_) / 4096.0F + f);
			float f_94_ = ((-((float) method228() - f_84_) * f_89_ + -f_85_ * f_90_) / 4096.0F + f_83_);
			float f_95_ = ((-f_84_ * f_90_ + ((float) method2748() - f_85_) * f_89_) / 4096.0F + f);
			float f_96_ = ((--f_84_ * f_89_ + ((float) method2748() - f_85_) * f_90_) / 4096.0F + f_83_);
			method2797(f_91_, f_92_, f_93_, f_94_, f_95_, f_96_, class455, i_87_, i_88_);
		}
	}

	public final void method2763(float f, float f_97_, float f_98_, float f_99_, float f_100_, float f_101_, int i, int i_102_, int i_103_) {
		method2764(f, f_97_, f_98_, f_99_, f_100_, f_101_, i, i_102_, i_103_, 1);
	}

	abstract void method2764(float f, float f_104_, float f_105_, float f_106_, float f_107_, float f_108_, int i, int i_109_, int i_110_, int i_111_);

	public abstract int method2765();

	abstract void method2766(float f, float f_112_, float f_113_, float f_114_, float f_115_, float f_116_, int i, Class455 class455, int i_117_, int i_118_);

	public abstract void method2767(int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_);

	public abstract void method2768(int i, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_);

	public abstract void method2769(int i, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_);

	public abstract void method2770(int i, int i_134_, int i_135_);

	public abstract void method2771(int i, int i_136_, int i_137_);

	public abstract void method2772(int i, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_);

	public abstract void method2773(int i, int i_144_, Class455 class455, int i_145_, int i_146_);

	public abstract void method2774(int i, int i_147_, Class455 class455, int i_148_, int i_149_);

	abstract void method2775(int i, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_);

	final void method2776(float f, float f_157_, float f_158_, float f_159_, int i, int i_160_, int i_161_, int i_162_, int i_163_) {
		if (i != 0) {
			double d = (double) (i_160_ & 0xffff) * 9.587379924285257E-5;
			float f_164_ = (float) Math.sin(d) * (float) i;
			float f_165_ = (float) Math.cos(d) * (float) i;
			float f_166_ = (-f_158_ * f_165_ + -f_159_ * f_164_) / 4096.0F + f;
			float f_167_ = (--f_158_ * f_164_ + -f_159_ * f_165_) / 4096.0F + f_157_;
			float f_168_ = ((((float) method228() - f_158_) * f_165_ + -f_159_ * f_164_) / 4096.0F + f);
			float f_169_ = ((-((float) method228() - f_158_) * f_164_ + -f_159_ * f_165_) / 4096.0F + f_157_);
			float f_170_ = ((-f_158_ * f_165_ + ((float) method2748() - f_159_) * f_164_) / 4096.0F + f);
			float f_171_ = ((--f_158_ * f_164_ + ((float) method2748() - f_159_) * f_165_) / 4096.0F + f_157_);
			method2763(f_166_, f_167_, f_168_, f_169_, f_170_, f_171_, i_161_, i_162_, i_163_);
		}
	}

	public abstract void method2777(int[] is);

	public abstract void method2778(int i, int i_172_, int i_173_, int i_174_, int i_175_);

	public final void method2779(float f, float f_176_, int i, int i_177_) {
		method2760(f, f_176_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_177_, 1, 0, 1);
	}

	public abstract void method2780(int i, int i_178_, int i_179_, int i_180_);

	public abstract void method2781(int i, int i_181_, int i_182_, int i_183_);

	public abstract void method2782(int[] is);

	public abstract void method2783(int i, int i_184_, int i_185_, int i_186_);

	public abstract void method2784(int i, int i_187_, Class455 class455, int i_188_, int i_189_);

	public abstract void method2785(int[] is);

	public abstract int method2786();

	abstract void method2787(int i, int i_190_, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_);

	public abstract int method2788();

	public final void method2789(int i, int i_197_, int i_198_, int i_199_) {
		method2755(i, i_197_, i_198_, i_199_, 1, 0, 1, 1);
	}

	public abstract int method225();

	public final void method2790(float f, float f_200_, int i, int i_201_, int i_202_, int i_203_, int i_204_) {
		method2760(f, f_200_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_201_, i_202_, i_203_, i_204_);
	}

	abstract void method2791(float f, float f_205_, float f_206_, float f_207_, float f_208_, float f_209_, int i, int i_210_, int i_211_, int i_212_);

	public abstract int method229();

	public abstract int method2792();

	public abstract int method2793();

	public abstract int method2794();

	public final void method2795(int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_) {
		method2755(i, i_213_, i_214_, i_215_, i_216_, i_217_, i_218_, 1);
	}

	public abstract void method2796(int i, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_);

	final void method2797(float f, float f_225_, float f_226_, float f_227_, float f_228_, float f_229_, Class455 class455, int i, int i_230_) {
		method2766(f, f_225_, f_226_, f_227_, f_228_, f_229_, 1, class455, i, i_230_);
	}

	abstract void method2798(float f, float f_231_, float f_232_, float f_233_, float f_234_, float f_235_, int i, int i_236_, int i_237_, int i_238_);

	public abstract void method2799(int i, int i_239_, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_);

	abstract void method2800(float f, float f_245_, float f_246_, float f_247_, float f_248_, float f_249_, int i, Class455 class455, int i_250_, int i_251_);

	public abstract Interface9 method2801();

	public final void method2802(int i, int i_252_, int i_253_, int i_254_) {
		method2755(i, i_252_, i_253_, i_254_, 1, 0, 1, 1);
	}

	public final void method2803(int i, int i_255_, int i_256_, int i_257_) {
		method2755(i, i_255_, i_256_, i_257_, 1, 0, 1, 1);
	}

	public abstract int method226();

	public abstract void method2804(int[] is);

	public final void method2805(int i, int i_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_) {
		method2755(i, i_258_, i_259_, i_260_, i_261_, i_262_, i_263_, 1);
	}

	public final void method2806(float f, float f_264_, int i, int i_265_) {
		method2760(f, f_264_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_265_, 1, 0, 1);
	}

	public final void method2807(int i, int i_266_, int i_267_, int i_268_) {
		method2772(i, i_266_, i_267_, i_268_, 1, 0, 1);
	}

	public abstract int method228();

	public abstract Interface9 method2808();

	public final void method2809(float f, float f_269_, int i, int i_270_) {
		method2760(f, f_269_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_270_, 1, 0, 1);
	}

	public final void method2810(float f, float f_271_, int i, int i_272_, int i_273_, int i_274_, int i_275_) {
		method2760(f, f_271_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_272_, i_273_, i_274_, i_275_);
	}

	abstract void method2811(float f, float f_276_, float f_277_, float f_278_, float f_279_, float f_280_, int i, Class455 class455, int i_281_, int i_282_);

	abstract void method2812(float f, float f_283_, float f_284_, float f_285_, float f_286_, float f_287_, int i, int i_288_, int i_289_, int i_290_);

	public final void method2813(float f, float f_291_, int i, int i_292_, Class455 class455, int i_293_, int i_294_) {
		method2762(f, f_291_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_292_, class455, i_293_, i_294_);
	}

	public final void method2814(float f, float f_295_, int i, int i_296_, Class455 class455, int i_297_, int i_298_) {
		method2762(f, f_295_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_296_, class455, i_297_, i_298_);
	}

	public final void method2815(float f, float f_299_, int i, int i_300_, Class455 class455, int i_301_, int i_302_) {
		method2762(f, f_299_, (float) method228() / 2.0F, (float) method2748() / 2.0F, i, i_300_, class455, i_301_, i_302_);
	}

	public final void method2816(float f, float f_303_, float f_304_, float f_305_, int i, int i_306_, Class455 class455, int i_307_, int i_308_) {
		if (i != 0) {
			double d = (double) (i_306_ & 0xffff) * 9.587379924285257E-5;
			float f_309_ = (float) Math.sin(d) * (float) i;
			float f_310_ = (float) Math.cos(d) * (float) i;
			float f_311_ = (-f_304_ * f_310_ + -f_305_ * f_309_) / 4096.0F + f;
			float f_312_ = (--f_304_ * f_309_ + -f_305_ * f_310_) / 4096.0F + f_303_;
			float f_313_ = ((((float) method228() - f_304_) * f_310_ + -f_305_ * f_309_) / 4096.0F + f);
			float f_314_ = ((-((float) method228() - f_304_) * f_309_ + -f_305_ * f_310_) / 4096.0F + f_303_);
			float f_315_ = ((-f_304_ * f_310_ + ((float) method2748() - f_305_) * f_309_) / 4096.0F + f);
			float f_316_ = ((--f_304_ * f_309_ + ((float) method2748() - f_305_) * f_310_) / 4096.0F + f_303_);
			method2797(f_311_, f_312_, f_313_, f_314_, f_315_, f_316_, class455, i_307_, i_308_);
		}
	}

	public final void method2817(float f, float f_317_, float f_318_, float f_319_, int i, int i_320_, Class455 class455, int i_321_, int i_322_) {
		if (i != 0) {
			double d = (double) (i_320_ & 0xffff) * 9.587379924285257E-5;
			float f_323_ = (float) Math.sin(d) * (float) i;
			float f_324_ = (float) Math.cos(d) * (float) i;
			float f_325_ = (-f_318_ * f_324_ + -f_319_ * f_323_) / 4096.0F + f;
			float f_326_ = (--f_318_ * f_323_ + -f_319_ * f_324_) / 4096.0F + f_317_;
			float f_327_ = ((((float) method228() - f_318_) * f_324_ + -f_319_ * f_323_) / 4096.0F + f);
			float f_328_ = ((-((float) method228() - f_318_) * f_323_ + -f_319_ * f_324_) / 4096.0F + f_317_);
			float f_329_ = ((-f_318_ * f_324_ + ((float) method2748() - f_319_) * f_323_) / 4096.0F + f);
			float f_330_ = ((--f_318_ * f_323_ + ((float) method2748() - f_319_) * f_324_) / 4096.0F + f_317_);
			method2797(f_325_, f_326_, f_327_, f_328_, f_329_, f_330_, class455, i_321_, i_322_);
		}
	}

	public final void method2818(float f, float f_331_, float f_332_, float f_333_, int i, int i_334_, Class455 class455, int i_335_, int i_336_) {
		if (i != 0) {
			double d = (double) (i_334_ & 0xffff) * 9.587379924285257E-5;
			float f_337_ = (float) Math.sin(d) * (float) i;
			float f_338_ = (float) Math.cos(d) * (float) i;
			float f_339_ = (-f_332_ * f_338_ + -f_333_ * f_337_) / 4096.0F + f;
			float f_340_ = (--f_332_ * f_337_ + -f_333_ * f_338_) / 4096.0F + f_331_;
			float f_341_ = ((((float) method228() - f_332_) * f_338_ + -f_333_ * f_337_) / 4096.0F + f);
			float f_342_ = ((-((float) method228() - f_332_) * f_337_ + -f_333_ * f_338_) / 4096.0F + f_331_);
			float f_343_ = ((-f_332_ * f_338_ + ((float) method2748() - f_333_) * f_337_) / 4096.0F + f);
			float f_344_ = ((--f_332_ * f_337_ + ((float) method2748() - f_333_) * f_338_) / 4096.0F + f_331_);
			method2797(f_339_, f_340_, f_341_, f_342_, f_343_, f_344_, class455, i_335_, i_336_);
		}
	}

	final void method2819(float f, float f_345_, float f_346_, float f_347_, float f_348_, float f_349_, Class455 class455, int i, int i_350_) {
		method2766(f, f_345_, f_346_, f_347_, f_348_, f_349_, 1, class455, i, i_350_);
	}

	final void method2820(float f, float f_351_, float f_352_, float f_353_, float f_354_, float f_355_, Class455 class455, int i, int i_356_) {
		method2766(f, f_351_, f_352_, f_353_, f_354_, f_355_, 1, class455, i, i_356_);
	}

	final void method2821(float f, float f_357_, float f_358_, float f_359_, float f_360_, float f_361_, Class455 class455, int i, int i_362_) {
		method2766(f, f_357_, f_358_, f_359_, f_360_, f_361_, 1, class455, i, i_362_);
	}

	final void method2822(float f, float f_363_, float f_364_, float f_365_, float f_366_, float f_367_, Class455 class455, int i, int i_368_) {
		method2766(f, f_363_, f_364_, f_365_, f_366_, f_367_, 1, class455, i, i_368_);
	}
}
