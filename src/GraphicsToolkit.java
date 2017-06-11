/* Class_ra - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class GraphicsToolkit {
	static int anInt5291 = 4;
	protected Class52 aClass52_5292;
	public static int anInt5293 = 2;
	public static int anInt5294 = 3;
	public static int anInt5295 = 5;
	public static int anInt5296 = 1;
	static boolean[] aBooleanArray5297 = new boolean[8];
	public int anInt5298;
	public Interface_ma anInterface_ma5299;
	public static int anInt5300 = 0;
	protected static int anInt5301 = 2;
	public static int anInt5302 = 2;
	protected static int anInt5303 = 1;
	Class52_Sub1[] aClass52_Sub1Array5304;
	public static int anInt5305 = 0;
	protected static int anInt5306 = 8;
	protected static int anInt5307 = 16;
	protected static int anInt5308 = 32;
	public static int anInt5309 = 1;
	int anInt5310 = -1780694629;
	protected static int anInt5311 = 4;
	protected Class52_Sub2 aClass52_Sub2_5312;
	protected Hashtable aHashtable5313 = new Hashtable();
	static int anInt5314 = 8;
	public static Class256 aClass256_5315;

	public abstract void method5042_cp(Class69 class69, al ccat, int ci, int ca);
	
	public abstract Class66 method4986(Class66 class66, Class66 class66_0_, float f, Class66 class66_1_);

	public abstract Class58 method4987();

	public final void method4988(byte i) throws Exception_Sub1 {
		try {
			method4989(0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.u(").append(')').toString());
		}
	}

	abstract void method4989(int i, int i_2_) throws Exception_Sub1;

	public final void method4990(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			XA(i, i_3_, i_4_, i_5_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.bd(").append(')').toString());
		}
	}

	public abstract void method4991(int i, int i_7_, int i_8_, int i_9_);

	public final Class52 method4992(short i) {
		try {
			return aClass52_5292;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.at(").append(')').toString());
		}
	}

	public abstract void method4993(int i);

	public abstract int za();

	public abstract boolean method4994();

	public abstract boolean method4995();

	public abstract void er(int[] is);

	public abstract void ep();

	public abstract boolean method4996();

	public abstract void method4997(int i, Class298_Sub10[] class298_sub10s);

	public abstract void N(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, byte[] is, int i_15_, int i_16_);

	public abstract boolean method4998();

	public abstract void method4999(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_);

	public void method5000(int[] is) {
		try {
			if (aClass52_Sub2_5312 != null) {
				is[0] = aClass52_Sub2_5312.method545();
				is[1] = aClass52_Sub2_5312.method552();
			} else {
				int[] is_23_ = is;
				is[1] = 0;
				is_23_[0] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.av(").append(')').toString());
		}
	}

	public abstract int[] ev(int i, int i_24_, int i_25_, int i_26_);

	public abstract boolean method5001();

	public final void method5002(Canvas canvas, int i) {
		try {
			if (aHashtable5313.containsKey(canvas)) {
				Class52_Sub2 class52_sub2 = (Class52_Sub2) aHashtable5313.get(canvas);
				class52_sub2.method135();
				aHashtable5313.remove(canvas);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.az(").append(')').toString());
		}
	}

	public final void method5003(Canvas canvas, byte i) {
		try {
			Class52_Sub2 class52_sub2 = (Class52_Sub2) aHashtable5313.get(canvas);
			if (null == class52_sub2)
				throw new RuntimeException();
			if (929186669 * ((GraphicsToolkit) this).anInt5310 > 0 || aClass52_5292 != aClass52_Sub2_5312)
				throw new RuntimeException();
			if (aClass52_5292 != null)
				aClass52_5292.method546();
			if (((GraphicsToolkit) this).anInt5310 * 929186669 < 0)
				aClass52_5292 = class52_sub2;
			aClass52_Sub2_5312 = class52_sub2;
			class52_sub2.method136();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.as(").append(')').toString());
		}
	}

	public abstract int method5004(int i, int i_27_);

	public final void method5005(Class52_Sub1 class52_sub1, byte i) {
		try {
			if (929186669 * ((GraphicsToolkit) this).anInt5310 < 0 || (((GraphicsToolkit) this).aClass52_Sub1Array5304[((GraphicsToolkit) this).anInt5310 * 929186669]) != class52_sub1)
				throw new RuntimeException();
			((GraphicsToolkit) this).aClass52_Sub1Array5304[(((GraphicsToolkit) this).anInt5310 -= 1780694629) * 929186669 + 1] = null;
			class52_sub1.method546();
			if (((GraphicsToolkit) this).anInt5310 * 929186669 >= 0) {
				aClass52_5292 = (((GraphicsToolkit) this).aClass52_Sub1Array5304[((GraphicsToolkit) this).anInt5310 * 929186669]);
				((GraphicsToolkit) this).aClass52_Sub1Array5304[((GraphicsToolkit) this).anInt5310 * 929186669].method136();
			} else {
				aClass52_5292 = aClass52_Sub2_5312;
				aClass52_Sub2_5312.method136();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.aw(").append(')').toString());
		}
	}

	abstract Class52_Sub2 method5006(Canvas canvas, int i, int i_28_);

	public abstract void method5007(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, Class_ta class_ta, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_);

	public abstract Matrix3f method5008();

	abstract void method5009();

	public abstract void method5010(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_);

	public abstract void method5011();

	public abstract void method5012(boolean bool);

	public abstract void GA(float f, float f_45_);

	public abstract void L();

	public abstract Matrix3f method5013();

	public abstract void o(int i, int i_46_, int i_47_, int i_48_);

	public abstract void qa(int[] is);

	public abstract void ba(int i, int i_49_);

	public final void method5014(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_) {
		try {
			method5019(i, i_50_, i_51_, i_52_, i_53_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.ar(").append(')').toString());
		}
	}

	public final void method5015(int i, int i_55_, int i_56_, int i_57_, int i_58_, byte i_59_) {
		try {
			B(i, i_55_, i_56_, i_57_, i_58_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.ac(").append(')').toString());
		}
	}

	public final void method5016(int i, int i_60_, int i_61_, int i_62_, int i_63_) {
		try {
			CA(i, i_60_, i_61_, i_62_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.am(").append(')').toString());
		}
	}

	public abstract void J(int i);

	public abstract int method5017(int i, int i_64_);

	public final void method5018(int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		try {
			method5091(i, i_65_, i_66_, i_67_, i_68_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.be(").append(')').toString());
		}
	}

	public abstract void method5019(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_);

	public abstract void XA(int i, int i_75_, int i_76_, int i_77_, int i_78_);

	public abstract void method5020(int i, int i_79_, float f, int i_80_, int i_81_, float f_82_, int i_83_, int i_84_, float f_85_, int i_86_, int i_87_, int i_88_, int i_89_);

	abstract void CA(int i, int i_90_, int i_91_, int i_92_, int i_93_);

	public abstract void hv(int i, int i_94_, int i_95_);

	public abstract void G(int i, int i_96_, int i_97_, int i_98_, int i_99_);

	public abstract void method5021(int i, Class298_Sub10[] class298_sub10s);

	public abstract void method5022(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, Class_ta class_ta, int i_105_, int i_106_);

	abstract void method5023();

	public abstract int method5024(int i, int i_107_);

	public abstract int method5025(int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_);

	public abstract Class_v method5026(int i);

	public abstract void method5027(Class_v class_v);

	public abstract Class66 method5028(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_);

	public abstract Class57 method5029(int i, int i_118_, boolean bool, boolean bool_119_);

	public abstract Class57 method5030(int[] is, int i, int i_120_, int i_121_, int i_122_, boolean bool);

	public Class57 method5031(int[] is, int i, int i_123_, int i_124_, int i_125_, int i_126_) {
		try {
			return method5030(is, i, i_123_, i_124_, i_125_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.bp(").append(')').toString());
		}
	}

	public abstract boolean method5032();

	public abstract Class57 method5033(int i, int i_127_, int i_128_, int i_129_, boolean bool);

	public abstract Class_ta method5034(int i, int i_130_, int[] is, int[] is_131_);

	public final void method5035(int i, int i_132_, int i_133_, int i_134_, short i_135_) {
		try {
			G(i, i_132_, i_133_, i_134_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.bf(").append(')').toString());
		}
	}

	public abstract void em(boolean bool);

	public abstract Matrix4f method5036();

	public abstract Class387 method5037(Model model, int i, int i_136_, int i_137_, int i_138_);

	public abstract void method5038(int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_);

	public abstract void method5039(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_);

	public abstract Class_xa method5040(int i, int i_155_, int[][] is, int[][] is_156_, int i_157_, int i_158_, int i_159_);

	public boolean method5041(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.cx(").append(')').toString());
		}
	}

	public abstract void method5042(Class69 class69);

	public abstract void method5043(Matrix3f class222);

	public abstract Matrix3f method5044();

	public abstract void RA(boolean bool);

	public abstract Matrix4f method5045();

	public abstract void ey(float f, float f_160_);

	public abstract void m(int i, float f, float f_161_, float f_162_, float f_163_, float f_164_);

	public Class57 method5046(int i, int i_165_, boolean bool, int i_166_) {
		try {
			return method5029(i, i_165_, bool, false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.bq(").append(')').toString());
		}
	}

	public abstract void c(int i, int i_167_, int i_168_);

	public abstract void method5047(boolean bool);

	public abstract int method5048();

	public Class298_Sub10 method5049(int i, int i_169_, int i_170_, int i_171_, int i_172_, float f) {
		try {
			return new Class298_Sub10(i, i_169_, i_170_, i_171_, i_172_, f);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.cg(").append(')').toString());
		}
	}

	public abstract boolean method5050();

	public abstract boolean method5051();

	public abstract void DA(int i, Class_ta class_ta, int i_173_, int i_174_);

	public abstract boolean method5052();

	public abstract void method5053();

	public abstract boolean method5054();

	public abstract void method5055(float f, float f_175_, float f_176_, float[] fs);

	public abstract void method5056(int i, int i_177_, int i_178_, int i_179_);

	public abstract void method5057(int i, Class78 class78);

	public abstract void method5058(int i, Class78 class78);

	public abstract void O();

	public abstract void method5059(float f, float f_180_, float f_181_, float[] fs);

	public abstract void method5060(float f, float f_182_, float f_183_, float[] fs);

	public abstract void method5061(boolean bool);

	public abstract Class58 method5062();

	public abstract Class58 method5063();

	abstract void method5064(int i, int i_184_) throws Exception_Sub1;

	abstract void method5065(int i, int i_185_) throws Exception_Sub1;

	public abstract void method5066();

	public abstract void method5067();

	public abstract void hs(float f);

	abstract void method5068();

	abstract void method5069();

	public abstract void gg(int i, Class_ta class_ta, int i_186_, int i_187_);

	public abstract int dm();

	public abstract int du();

	public abstract boolean method5070();

	public abstract boolean method5071();

	public abstract boolean method5072();

	public abstract boolean method5073();

	public abstract boolean method5074();

	public abstract void method5075();

	public abstract boolean method5076();

	public abstract boolean method5077();

	public abstract boolean method5078();

	public abstract boolean method5079();

	public abstract void method5080();

	public abstract boolean method5081();

	public abstract boolean method5082();

	public abstract Matrix4f method5083();

	public abstract int[] eg(int i, int i_188_, int i_189_, int i_190_);

	public abstract Class66 method5084(int i, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_);

	public abstract void method5085(boolean bool);

	public abstract void method5086();

	public abstract Class_xa method5087(int i, int i_196_, int[][] is, int[][] is_197_, int i_198_, int i_199_, int i_200_);

	public abstract void es(int[] is);

	public abstract void el(float f, float f_201_);

	public abstract void eq();

	public abstract void method5088(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_, Class_ta class_ta, int i_207_, int i_208_);

	public abstract void ei();

	public abstract void ej(int i, int i_209_, int i_210_, int i_211_);

	public abstract void method5089(int i, Class78 class78);

	public abstract void ea(int i, int i_212_, int i_213_, int i_214_);

	public abstract void eh(int i, int i_215_, int i_216_, int i_217_);

	public abstract void method5090(int i, int i_218_, int i_219_, int i_220_);

	public abstract void eo(int[] is);

	public abstract void method5091(int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_);

	public abstract void fy(int i, int i_226_);

	public abstract Class264 method5092(Class505 class505, Class89[] class89s, boolean bool);

	public abstract void fh(int i, int i_227_);

	public abstract void fn(int i, int i_228_);

	public abstract void method5093(int i, int i_229_, int i_230_, int i_231_, int i_232_, int i_233_);

	public abstract void fa(int i, int i_234_, int i_235_, int i_236_, int i_237_, int i_238_);

	public abstract void fo(int i, int i_239_, int i_240_, int i_241_, int i_242_, int i_243_, byte[] is, int i_244_, int i_245_);

	public abstract Class52_Sub1 method5094();

	abstract void fv(int i, int i_246_, int i_247_, int i_248_, int i_249_);

	abstract void fm(int i, int i_250_, int i_251_, int i_252_, int i_253_);

	public abstract void ff(int i, int i_254_, int i_255_, int i_256_, int i_257_);

	public abstract void fd(int i, int i_258_, int i_259_, int i_260_, int i_261_);

	public abstract void ft(int i, int i_262_, int i_263_, int i_264_, int i_265_);

	public abstract void fu(int i, int i_266_, int i_267_, int i_268_, int i_269_);

	public abstract void fl(int i, int i_270_, int i_271_, int i_272_, int i_273_);

	public abstract void method5095(Class66 class66);

	public abstract void ed(int i, int i_274_, int i_275_, int i_276_);

	public abstract void method5096(int i, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, Class_ta class_ta, int i_282_, int i_283_);

	public abstract void method5097(int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, Class_ta class_ta, int i_289_, int i_290_);

	public abstract void method5098(int i, int i_291_, int i_292_, int i_293_, int i_294_, int i_295_, Class_ta class_ta, int i_296_, int i_297_, int i_298_, int i_299_, int i_300_);

	public abstract int method5099(int i, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_);

	public abstract int method5100(int i, int i_306_, int i_307_, int i_308_, int i_309_, int i_310_);

	public abstract Class57 method5101(Class89 class89, boolean bool);

	public abstract Class_v method5102(int i);

	public abstract void method5103(Class_v class_v);

	public abstract Class57 method5104(int i, int i_311_, boolean bool, boolean bool_312_);

	public abstract Class57 method5105(int[] is, int i, int i_313_, int i_314_, int i_315_, boolean bool);

	public abstract Class57 method5106(int[] is, int i, int i_316_, int i_317_, int i_318_, boolean bool);

	public abstract Class57 method5107(Class89 class89, boolean bool);

	public abstract Class57 method5108(int i, int i_319_, int i_320_, int i_321_, boolean bool);

	public abstract Class_ta method5109(int i, int i_322_, int[] is, int[] is_323_);

	public abstract Class_ta method5110(int i, int i_324_, int[] is, int[] is_325_);

	public abstract boolean method5111();

	public abstract void method5112();

	public abstract void gv(int i, Class_ta class_ta, int i_326_, int i_327_);

	public abstract Class264 method5113(Class505 class505, Class89[] class89s, boolean bool);

	public abstract Class264 method5114(Class505 class505, Class89[] class89s, boolean bool);

	public abstract void method5115(int i);

	public abstract Class387 method5116(Model model, int i, int i_328_, int i_329_, int i_330_);

	abstract Class52_Sub2 method5117(Canvas canvas, int i, int i_331_);

	public abstract int method5118(int i, int i_332_);

	public abstract boolean method5119();

	public abstract int method5120(int i, int i_333_);

	public abstract Class_xa method5121(int i, int i_334_, int[][] is, int[][] is_335_, int i_336_, int i_337_, int i_338_);

	public abstract Class_xa method5122(int i, int i_339_, int[][] is, int[][] is_340_, int i_341_, int i_342_, int i_343_);

	public abstract Class_xa method5123(int i, int i_344_, int[][] is, int[][] is_345_, int i_346_, int i_347_, int i_348_);

	public abstract Matrix4f method5124();

	public abstract Class57 method5125(Class89 class89, boolean bool);

	public abstract int method5126(int i, int i_349_);

	public abstract void B(int i, int i_350_, int i_351_, int i_352_, int i_353_, int i_354_);

	public abstract boolean method5127();

	public abstract void r(int i, int i_355_, int i_356_, int i_357_);

	public abstract void go(int i, Class_ta class_ta, int i_358_, int i_359_);

	public abstract void method5128(Class69 class69);

	public abstract void method5129(Matrix3f class222);

	public abstract void method5130(Matrix3f class222);

	public abstract void method5131(Matrix3f class222);

	public abstract void method5132(Matrix3f class222);

	public abstract void method5133(Matrix4f class233);

	public abstract void method5134(Matrix4f class233);

	public abstract int method5135(int i, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_);

	public void method5136(int i) {
		try {
			aBooleanArray5297[580915349 * anInt5298] = false;
			Enumeration enumeration = aHashtable5313.keys();
			while (enumeration.hasMoreElements()) {
				Canvas canvas = (Canvas) enumeration.nextElement();
				Class52_Sub2 class52_sub2 = (Class52_Sub2) aHashtable5313.get(canvas);
				class52_sub2.method135();
			}
			method5023();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.y(").append(')').toString());
		}
	}

	public abstract void hg(int i, float f, float f_365_, float f_366_, float f_367_, float f_368_);

	public abstract void hb(int i);

	public abstract void ec(boolean bool);

	public abstract void hu(float f);

	public abstract void hn(int i, int i_369_, int i_370_);

	public abstract void he(int i, int i_371_, int i_372_);

	public abstract void method5137(boolean bool);

	public abstract Class52_Sub1 method5138();

	public abstract void method5139(int i, int i_373_, float f, int i_374_, int i_375_, float f_376_, int i_377_, int i_378_, float f_379_, int i_380_, int i_381_, int i_382_, int i_383_);

	public abstract Class66 method5140(int i, int i_384_, int i_385_, int i_386_, int i_387_, int i_388_);

	abstract void method5141();

	public abstract Class66 method5142(Class66 class66, Class66 class66_389_, float f, Class66 class66_390_);

	public final void method5143(Class52_Sub1 class52_sub1, byte i) {
		try {
			if (929186669 * ((GraphicsToolkit) this).anInt5310 >= 3)
				throw new RuntimeException();
			if (((GraphicsToolkit) this).anInt5310 * 929186669 >= 0)
				((GraphicsToolkit) this).aClass52_Sub1Array5304[929186669 * ((GraphicsToolkit) this).anInt5310].method546();
			else
				aClass52_Sub2_5312.method546();
			aClass52_5292 = ((GraphicsToolkit) this).aClass52_Sub1Array5304[(((GraphicsToolkit) this).anInt5310 += 1780694629) * 929186669] = class52_sub1;
			class52_sub1.method136();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.af(").append(')').toString());
		}
	}

	public abstract boolean method5144();

	public abstract void method5145();

	public abstract boolean method5146();

	final Class52_Sub2 method5147(int i) {
		try {
			return aClass52_Sub2_5312;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.ah(").append(')').toString());
		}
	}

	public abstract boolean method5148();

	public abstract boolean method5149();

	abstract void method5150(float f, float f_391_, float f_392_, float f_393_, float f_394_, float f_395_);

	final void method5151(Canvas canvas, Class52_Sub2 class52_sub2, byte i) {
		try {
			if (class52_sub2 == null)
				throw new RuntimeException();
			aHashtable5313.put(canvas, class52_sub2);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.al(").append(')').toString());
		}
	}

	public void method5152(float f, float f_396_, float f_397_, int i) {
		try {
			method5188(f, f_396_, f_397_, 0.0F, 1.0F, 1.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.ce(").append(')').toString());
		}
	}

	public abstract void method5153();

	public abstract void method5154();

	public abstract void method5155(int i, Class78 class78);

	public abstract void method5156(int i, Class78 class78);

	public abstract void fb(int i, int i_398_);

	public abstract void ih();

	public abstract void iv();

	public abstract void method5157(int i, int i_399_, float f, int i_400_, int i_401_, float f_402_, int i_403_, int i_404_, float f_405_, int i_406_, int i_407_, int i_408_, int i_409_);

	public abstract void method5158(int i, int i_410_, float f, int i_411_, int i_412_, float f_413_, int i_414_, int i_415_, float f_416_, int i_417_, int i_418_, int i_419_, int i_420_);

	public abstract boolean method5159();

	public abstract void method5160(float f, float f_421_, float f_422_, float[] fs);

	public abstract void method5161(float f, float f_423_, float f_424_, float[] fs);

	public abstract void method5162(float f, float f_425_, float f_426_, float[] fs);

	public final void method5163(Canvas canvas, int i, int i_427_, int i_428_) {
		try {
			if (!aHashtable5313.containsKey(canvas)) {
				Class298_Sub19_Sub3.method3041(canvas, (short) 32072);
				method5151(canvas, method5006(canvas, i, i_427_), (byte) 109);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.ai(").append(')').toString());
		}
	}

	public abstract void method5164(float f, float f_429_, float f_430_, float[] fs);

	public abstract Interface8_Impl1_Impl2 method5165(int i, int i_431_);

	public abstract boolean method5166();

	public abstract void method5167(int i, int i_432_, int i_433_, int i_434_, int i_435_, int i_436_);

	public abstract void method5168(int i, int i_437_, int i_438_, int i_439_, int i_440_, int i_441_, int i_442_);

	public abstract void method5169(int i);

	public abstract int method5170(int i, int i_443_);

	public abstract void ez(float f, float f_444_);

	public abstract Matrix3f method5171();

	public abstract Matrix4f method5172();

	public final void method5173(Canvas canvas, int i, int i_445_, byte i_446_) {
		try {
			Class52_Sub2 class52_sub2 = (Class52_Sub2) aHashtable5313.get(canvas);
			if (null == class52_sub2)
				throw new RuntimeException();
			class52_sub2.method582(i, i_445_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.ap(").append(')').toString());
		}
	}

	public abstract void method5174(int i);

	public abstract void method5175();

	public abstract void method5176();

	public abstract int method5177();

	public abstract Matrix3f method5178();

	public abstract Class66 method5179(Class66 class66, Class66 class66_447_, float f, Class66 class66_448_);

	GraphicsToolkit(Interface_ma interface_ma) {
		((GraphicsToolkit) this).aClass52_Sub1Array5304 = new Class52_Sub1[4];
		anInterface_ma5299 = interface_ma;
		int i = -1;
		for (int i_449_ = 0; i_449_ < 8; i_449_++) {
			if (!aBooleanArray5297[i_449_]) {
				aBooleanArray5297[i_449_] = true;
				i = i_449_;
				break;
			}
		}
		if (i == -1)
			throw new IllegalStateException("");
		anInt5298 = i * -1656079683;
	}

	public abstract boolean method5180();

	public abstract int[] aq(int i, int i_450_, int i_451_, int i_452_);

	public abstract Class66 method5181(int i, int i_453_, int i_454_, int i_455_, int i_456_, int i_457_);

	public abstract void hj(int i, int i_458_, int i_459_);

	public abstract void method5182(Matrix4f class233);

	public abstract Matrix3f method5183();

	public abstract void method5184(boolean bool);

	public abstract Class66 method5185(int i, int i_460_, int i_461_, int i_462_, int i_463_, int i_464_);

	protected void finalize() {
		try {
			method5136(1104723109);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.finalize(").append(')').toString());
		}
	}

	public abstract Interface8_Impl1_Impl2 method5186(int i, int i_465_);

	public abstract void method5187(int i, int i_466_, int i_467_, int i_468_);

	abstract void method5188(float f, float f_469_, float f_470_, float f_471_, float f_472_, float f_473_);

	public abstract void method5189(Class66 class66);

	public abstract void fi(int i, int i_474_, int i_475_, int i_476_, int i_477_, int i_478_, byte[] is, int i_479_, int i_480_);

	public abstract void IA(float f);

	public abstract Class57 method5190(int[] is, int i, int i_481_, int i_482_, int i_483_, boolean bool);

	static void method5191(int i) {
		try {
			if (null != Class82_Sub6.aClass227_6843) {
				Class288_Sub1.aClass219_7147 = new Class219();
				Class288_Sub1.aClass219_7147.method2043(-4360787748556788915L * Class230.aLong2560, ((Class227) Class82_Sub6.aClass227_6843).aClass470_2549.method6049(Class321.aClass429_3357, -875414210), (360399239 * ((Class227) Class82_Sub6.aClass227_6843).anInt2551), Class82_Sub6.aClass227_6843, 180676280);
				Class459.aThread5674 = new Thread(Class288_Sub1.aClass219_7147, "");
				Class459.aThread5674.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.f(").append(')').toString());
		}
	}

	static void method5192(int i, int i_484_, int i_485_, int i_486_, int i_487_, int i_488_, int i_489_, Class298_Sub37_Sub15 class298_sub37_sub15, Class264 class264, Class505 class505, int i_490_, int i_491_, int i_492_) {
		try {
			if (i > i_485_ && i < i_485_ + i_487_ && i_484_ > i_489_ - class505.anInt6202 * 1110385787 - 1 && i_484_ < i_489_ + -1883958527 * class505.anInt6197 && ((Class298_Sub37_Sub15) class298_sub37_sub15).aBoolean9664)
				i_490_ = i_491_;
			int[] is = Class313.method3821(class298_sub37_sub15, (byte) -16);
			String string = Class8.method315(class298_sub37_sub15, 1974058841);
			if (is != null)
				string = new StringBuilder().append(string).append(Class216.method1999(is, (byte) 1)).toString();
			class264.method2480(string, 3 + i_485_, i_489_, i_490_, 0, client.aRandom8702, Class368.anInt4005 * 1401020893, Class436.aClass57Array5501, Class422_Sub3.anIntArray8372, 65280);
			if (((Class298_Sub37_Sub15) class298_sub37_sub15).aBoolean9665)
				Graphics.aClass57_573.method645(i_485_ + 5 + class505.method6264(string, 1318090489), i_489_ - 1110385787 * class505.anInt6202);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.an(").append(')').toString());
		}
	}

	static final void method5193(ClientScript2 class403, byte i) {
		try {
			int i_493_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_493_, (byte) 22);
			Class119 class119 = Class389.aClass119Array4165[i_493_ >> 16];
			Class443.method5887(class105, class119, class403, -2057554129);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.kw(").append(')').toString());
		}
	}

	static long method5194(CharSequence charsequence, byte i) {
		try {
			long l = 0L;
			int i_494_ = charsequence.length();
			for (int i_495_ = 0; i_495_ < i_494_; i_495_++) {
				l *= 37L;
				char c = charsequence.charAt(i_495_);
				if (c >= 'A' && c <= 'Z')
					l += (long) ('\001' + c - 'A');
				else if (c >= 'a' && c <= 'z')
					l += (long) ('\001' + c - 'a');
				else if (c >= '0' && c <= '9')
					l += (long) (c + '\033' - '0');
				if (l >= 177917621779460413L) {
					if (i == 0)
						throw new IllegalStateException();
					break;
				}
			}
			for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
				/* empty */
			}
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.a(").append(')').toString());
		}
	}

	static void method5195(GraphicsToolkit class_ra, IComponentDefinition class105, int i, int i_496_, byte i_497_) {
		try {
			Class117 class117 = class105.method1116(class_ra, 1502538903);
			if (null != class117) {
				Class_ta class_ta = class117.aClass_ta1397;
				class_ra.r(i, i_496_, -2093041337 * class105.anInt1156 + i, 457937409 * class105.anInt1162 + i_496_);
				if ((-2093041337 * class105.anInt1156 != class117.anInt1393 * 1633695381) || (-60174999 * class117.anInt1394 != 457937409 * class105.anInt1162))
					throw new IllegalStateException("");
				if (2 != -64305285 * Class3.anInt56 && 5 != Class3.anInt56 * -64305285 && null != Class384.aClass57_4127) {
					Class341 class341 = client.aClass283_8716.method2628(681479919);
					int i_498_;
					int i_499_;
					int i_500_;
					int i_501_;
					if (2 == Class298_Sub1.anInt7164 * -863531439) {
						i_498_ = client.anInt8753 * -2080858977;
						i_499_ = 1818837461 * client.anInt8755;
						i_500_ = (int) -client.aFloat8949 & 0x3fff;
						i_501_ = 4096;
					} else {
						Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
						i_498_ = (int) class217.aFloat2451;
						i_499_ = (int) class217.aFloat2454;
						i_500_ = (client.anInt8801 * 1227356013 + (int) -client.aFloat8949) & 0x3fff;
						i_501_ = 4096 - 1412674352 * client.anInt8749;
					}
					int i_502_ = i_498_ / 128 + 48;
					int i_503_ = (48 + client.aClass283_8716.method2630(789210081) * 4 - i_499_ / 128);
					Class384.aClass57_4127.method659(((float) i + (float) (class105.anInt1156 * -2093041337) / 2.0F), ((float) i_496_ + (float) (457937409 * class105.anInt1162) / 2.0F), (float) i_502_, (float) i_503_, i_501_, i_500_ << 2, class_ta, i, i_496_);
					Class296 class296 = client.aClass283_8716.method2631(-337725639);
					for (Class298_Sub35 class298_sub35 = ((Class298_Sub35) Class3.aClass453_61.method5939(1766612795)); class298_sub35 != null; class298_sub35 = ((Class298_Sub35) Class3.aClass453_61.method5944(49146))) {
						int i_504_ = class298_sub35.anInt7394 * -774922497;
						int i_505_ = ((class296.anIntArray3168[i_504_] >> 14 & 0x3fff) - -1760580017 * class341.gameSceneBaseX);
						int i_506_ = ((class296.anIntArray3168[i_504_] & 0x3fff) - 283514611 * class341.gameSceneBaseY);
						int i_507_ = 2 + 4 * i_505_ - i_498_ / 128;
						int i_508_ = 2 + 4 * i_506_ - i_499_ / 128;
						Class248.method2389(class_ra, class_ta, class105, i, i_496_, i_507_, i_508_, class296.anIntArray3170[i_504_], (byte) 0);
					}
					for (int i_509_ = 0; i_509_ < 1659101557 * Class3.anInt67; i_509_++) {
						int i_510_ = (2 + Class3.anIntArray58[i_509_] * 4 - i_498_ / 128);
						int i_511_ = (2 + 4 * Class3.anIntArray59[i_509_] - i_499_ / 128);
						ObjectDefinitions class432 = (client.aClass283_8716.method2641(2011176396).getObjectDefinitions(Class3.anIntArray60[i_509_]));
						if (null != class432.anIntArray5366) {
							class432 = class432.method5777(Class128.aClass148_6331, 1042930561);
							if (null == class432)
								continue;
							if (-1 == class432.anInt5399 * -1422593103) {
								if (i_497_ < 10)
									continue;
								return;
							}
						}
						Class248.method2389(class_ra, class_ta, class105, i, i_496_, i_510_, i_511_, class432.anInt5399 * -1422593103, (byte) 0);
					}
					for (Class298_Sub2 class298_sub2 = ((Class298_Sub2) client.groundItems.method5816(1742338274)); class298_sub2 != null; class298_sub2 = ((Class298_Sub2) client.groundItems.method5815((byte) 24))) {
						int i_512_ = (int) ((class298_sub2.linkedKey * 7051297995265073167L) >> 28 & 0x3L);
						if (i_512_ == Class3.anInt57 * -1694437021) {
							int i_513_ = ((int) ((class298_sub2.linkedKey * 7051297995265073167L) & 0x3fffL) - -1760580017 * class341.gameSceneBaseX);
							int i_514_ = ((int) ((class298_sub2.linkedKey * 7051297995265073167L) >> 14 & 0x3fffL) - class341.gameSceneBaseY * 283514611);
							int i_515_ = 2 + i_513_ * 4 - i_498_ / 128;
							int i_516_ = 2 + i_514_ * 4 - i_499_ / 128;
							Class443.method5883(class105, class_ta, i, i_496_, i_515_, i_516_, SubIncommingPacket.aClass57Array2349[0], (byte) 16);
						}
					}
					Class422_Sub10.method5662(class_ra, i_498_, i_499_, class105, class_ta, i, i_496_, 826111295);
					Class346.method4171(i_498_, i_499_, class105, class_ta, i, i_496_, 1913514572);
					Class74.method832(i_498_, i_499_, class105, class117, i, i_496_, -1636621855);
					if (2 != Class298_Sub1.anInt7164 * -863531439) {
						if (Class3.anInt62 * 2076926079 != 0) {
							int i_517_ = (-282230276 * Class3.anInt62 + 2 - i_498_ / 128 + (Class287.myPlayer.getSize() - 1) * 2);
							int i_518_ = (2 + Class3.anInt54 * -1505214580 - i_499_ / 128 + (Class287.myPlayer.getSize() - 1) * 2);
							Class443.method5883(class105, class_ta, i, i_496_, i_517_, i_518_, (Class234.aClass57Array2598[Class3.aBoolean63 ? 1 : 0]), (byte) 23);
						}
						if (!Class287.myPlayer.hidden)
							class_ra.method5015(i + (-2093041337 * class105.anInt1156 / 2) - 1, (457937409 * class105.anInt1162 / 2) + i_496_ - 1, 3, 3, -1, (byte) 7);
					}
				} else
					class_ra.DA(-16777216, class_ta, i, i_496_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ra.r(").append(')').toString());
		}
	}
}
