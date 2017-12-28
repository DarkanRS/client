
/* Class505 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Class505 {
	Class158_Sub1[] aClass158_Sub1Array5833;
	public Interface22 anInterface22_5834;
	public static final int anInt5835 = 2;
	protected static final int anInt5836 = 8;
	public static final int anInt5837 = 5;
	static final int anInt5838 = 8;
	static boolean[] aBoolArray5839 = new boolean[8];
	public int anInt5840;
	protected Class158_Sub2 aClass158_Sub2_5841;
	public static final int anInt5842 = 0;
	public static final int anInt5843 = 1;
	public static final int anInt5844 = 2;
	protected static final int anInt5845 = 1;
	protected static final int anInt5846 = 2;
	public static final int anInt5847 = 3;
	public static final int anInt5848 = 1;
	protected static final int anInt5849 = 16;
	protected static final int anInt5850 = 32;
	static final int anInt5851 = 4;
	protected static final int anInt5852 = 4;
	protected Class158 aClass158_5853;
	int anInt5854 = -1209204751;
	protected Hashtable aHashtable5855 = new Hashtable();
	public static final int anInt5856 = 0;

	public static Class505 method8391(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_0_) {
		int i_1_ = 0;
		int i_2_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_1_ = dimension.width;
			i_2_ = dimension.height;
		}
		return Class88.method1493(i, canvas, interface22, class317, i_0_, i_1_, i_2_, (byte) 73);
	}

	public abstract Class168 method8392();

	public final void method8393(short i) throws Exception_Sub3 {
		method8555(0, 0);
	}

	public abstract void method8394(int i, Class282_Sub24[] class282_sub24s);

	public abstract void method8395();

	public void method8396(int i) {
		aBoolArray5839[anInt5840 * -413843045] = false;
		Enumeration enumeration = aHashtable5855.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
		}
		method8397();
	}

	abstract void method8397();

	public abstract void method8398(int i);

	public abstract int za();

	public void finalize() {
		method8396(-830410559);
	}

	public abstract boolean method8399();

	public abstract Class152 method8400(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_);

	public final void method8401() throws Exception_Sub3 {
		method8555(0, 0);
	}

	public abstract boolean method8402();

	public abstract boolean method8403();

	public abstract boolean method8404();

	public abstract boolean method8405();

	public abstract boolean method8406();

	public abstract void B(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_);

	public abstract boolean method8407();

	public void method8408(int[] is) {
		if (null != aClass158_Sub2_5841) {
			is[0] = aClass158_Sub2_5841.method2714();
			is[1] = aClass158_Sub2_5841.method2716();
		} else {
			int[] is_13_ = is;
			is[1] = 0;
			is_13_[0] = 0;
		}
	}

	public abstract void iw(int i, float f, float f_14_, float f_15_, float f_16_, float f_17_);

	public static Class505 method8409(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_18_) {
		int i_19_ = 0;
		int i_20_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_19_ = dimension.width;
			i_20_ = dimension.height;
		}
		return Class88.method1493(i, canvas, interface22, class317, i_18_, i_19_, i_20_, (byte) 73);
	}

	public final void method8410(Canvas canvas, int i) {
		if (aHashtable5855.containsKey(canvas)) {
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
			aHashtable5855.remove(canvas);
		}
	}

	final void method8411(Canvas canvas, Class158_Sub2 class158_sub2, int i) {
		if (null == class158_sub2)
			throw new RuntimeException();
		aHashtable5855.put(canvas, class158_sub2);
	}

	public final void method8412(Canvas canvas, byte i) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (null == class158_sub2)
			throw new RuntimeException();
		if (-1417941265 * ((Class505) this).anInt5854 > 0 || aClass158_Sub2_5841 != aClass158_5853)
			throw new RuntimeException();
		if (null != aClass158_5853)
			aClass158_5853.method2718();
		if (-1417941265 * ((Class505) this).anInt5854 < 0)
			aClass158_5853 = class158_sub2;
		aClass158_Sub2_5841 = class158_sub2;
		class158_sub2.method213();
	}

	final Class158_Sub2 method8413() {
		return aClass158_Sub2_5841;
	}

	public final void method8414(Canvas canvas, int i, int i_21_, int i_22_) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (class158_sub2 == null)
			throw new RuntimeException();
		class158_sub2.method14354(i, i_21_);
	}

	public abstract void method8415(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_);

	public final void method8416(Class158_Sub1 class158_sub1, byte i) {
		if (((Class505) this).anInt5854 * -1417941265 < 0 || (((Class505) this).aClass158_Sub1Array5833[-1417941265 * ((Class505) this).anInt5854]) != class158_sub1)
			throw new RuntimeException();
		((Class505) this).aClass158_Sub1Array5833[(((Class505) this).anInt5854 -= 1209204751) * -1417941265 + 1] = null;
		class158_sub1.method2718();
		if (((Class505) this).anInt5854 * -1417941265 >= 0) {
			aClass158_5853 = (((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265]);
			((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265].method213();
		} else {
			aClass158_5853 = aClass158_Sub2_5841;
			aClass158_Sub2_5841.method213();
		}
	}

	abstract Class158_Sub2 method8417(Canvas canvas, int i, int i_28_);

	public abstract Class158_Sub1 method8418();

	public abstract Interface8 method8419(int i, int i_29_);

	public abstract int[] ab(int i, int i_30_, int i_31_, int i_32_);

	public abstract void method8420();

	public abstract void method8421();

	public final void method8422(Canvas canvas, int i, int i_33_) {
		if (!aHashtable5855.containsKey(canvas)) {
			Class459.method7679(canvas, 2108172901);
			method8411(canvas, method8417(canvas, i, i_33_), 316223525);
		}
	}

	public abstract void GA(float f, float f_34_);

	public abstract void L();

	public abstract void method8423(Class294 class294);

	public abstract void o(int i, int i_35_, int i_36_, int i_37_);

	public abstract void qa(int[] is);

	public abstract void ba(int i, int i_38_);

	public abstract void method8424(Class384 class384);

	public final void method8425(int i, int i_39_, int i_40_, int i_41_, int i_42_, byte i_43_) {
		B(i, i_39_, i_40_, i_41_, i_42_, 1);
	}

	public abstract void method8426(int i, Class282_Sub24[] class282_sub24s);

	public abstract Class455 method8427(int i, int i_44_, int[] is, int[] is_45_);

	public final void method8428(int i, int i_46_, int i_47_, int i_48_, int i_49_) {
		G(i, i_46_, i_47_, i_48_, 1);
	}

	public final void method8429(int i, int i_50_, int i_51_, int i_52_, int i_53_, byte i_54_) {
		method8433(i, i_50_, i_51_, i_52_, i_53_, 1);
	}

	public abstract void method8430(int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_);

	public abstract boolean method8431();

	public final void method8432(int i, int i_60_, int i_61_, int i_62_, int i_63_) {
		B(i, i_60_, i_61_, i_62_, i_63_, 1);
	}

	Class505(Interface22 interface22) {
		((Class505) this).aClass158_Sub1Array5833 = new Class158_Sub1[4];
		anInterface22_5834 = interface22;
		int i = -1;
		for (int i_64_ = 0; i_64_ < 8; i_64_++) {
			if (!aBoolArray5839[i_64_]) {
				aBoolArray5839[i_64_] = true;
				i = i_64_;
				break;
			}
		}
		if (-1 == i)
			throw new IllegalStateException("");
		anInt5840 = -533644141 * i;
	}

	abstract void CA(int i, int i_65_, int i_66_, int i_67_, int i_68_);

	public abstract void XA(int i, int i_69_, int i_70_, int i_71_, int i_72_);

	public abstract void G(int i, int i_73_, int i_74_, int i_75_, int i_76_);

	public abstract void method8433(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_);

	public abstract int method8434(int i, int i_82_);

	public abstract void method8435(int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_);

	public void method8436(int[] is) {
		if (null != aClass158_Sub2_5841) {
			is[0] = aClass158_Sub2_5841.method2714();
			is[1] = aClass158_Sub2_5841.method2716();
		} else {
			int[] is_91_ = is;
			is[1] = 0;
			is_91_[0] = 0;
		}
	}

	public abstract void fk(int i, int i_92_, int i_93_, int i_94_);

	public abstract int method8437(int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_);

	public abstract Class282_Sub1 method8438(int i);

	public abstract void method8439(Class282_Sub1 class282_sub1);

	public Class160 method8440(int i, int i_100_, boolean bool, int i_101_) {
		return method8654(i, i_100_, bool, false);
	}

	static synchronized Class505 method8441(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_102_, int i_103_, int i_104_) {
		if (0 == i)
			return Class109_Sub1.method14652(canvas, interface22, i_103_, i_104_, (byte) -119);
		if (i == 2)
			return Class8.method404(canvas, interface22, i_103_, i_104_, 1161793225);
		if (i == 1)
			return Class171.method2909(canvas, interface22, i_102_);
		if (5 == i)
			return Class315.method5582(canvas, interface22, class317, i_102_);
		if (i == 3)
			return Class374.method6367(canvas, interface22, class317, i_102_);
		throw new IllegalArgumentException("");
	}

	public abstract Class160 method8442(int[] is, int i, int i_105_, int i_106_, int i_107_, boolean bool);

	public abstract int method8443(int i, int i_108_);

	public abstract Class160 method8444(Class91 class91, boolean bool);

	public abstract void method8445();

	public abstract void method8446(Class384 class384);

	public final void method8447(int i, int i_109_, int i_110_, int i_111_) {
		CA(i, i_109_, i_110_, i_111_, 1);
	}

	public abstract Class8 method8448(Class414 class414, Class91[] class91s, boolean bool);

	public abstract Class384 method8449();

	public abstract Class294 method8450();

	public abstract void ez();

	public abstract Class528 method8451(Class157 class157, int i, int i_112_, int i_113_, int i_114_);

	public abstract int method8452(int i, int i_115_);

	public abstract Class384 method8453();

	public abstract boolean method8454();

	public boolean method8455(int i) {
		return true;
	}

	public abstract void method8456(Class151 class151);

	public abstract void method8457(Class294 class294);

	public abstract Class294 method8458();

	public abstract void RA(boolean bool);

	public abstract void method8459(int i);

	final Class158_Sub2 method8460(int i) {
		return aClass158_Sub2_5841;
	}

	public abstract void IA(float f);

	public abstract void m(int i, float f, float f_116_, float f_117_, float f_118_, float f_119_);

	public abstract void J(int i);

	public abstract Class160 method8461(int i, int i_120_, boolean bool, boolean bool_121_);

	public abstract boolean method8462();

	public abstract int method8463();

	public abstract boolean method8464();

	public abstract boolean method8465();

	public abstract Class152 method8466(int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_);

	public abstract Class152 method8467(Class152 class152, Class152 class152_127_, float f, Class152 class152_128_);

	public final void method8468(int i, int i_129_, int i_130_, int i_131_, int i_132_) {
		CA(i, i_129_, i_130_, i_131_, 1);
	}

	public abstract boolean method8469();

	public final void method8470(Canvas canvas, int i, int i_133_) {
		if (!aHashtable5855.containsKey(canvas)) {
			Class459.method7679(canvas, -199450075);
			method8411(canvas, method8417(canvas, i, i_133_), 316223525);
		}
	}

	public abstract boolean method8471();

	public void method8472(float f, float f_134_, float f_135_, byte i) {
		method8592(f, f_134_, f_135_, 0.0F, 1.0F, 1.0F);
	}

	public void method8473(int[] is) {
		if (null != aClass158_Sub2_5841) {
			is[0] = aClass158_Sub2_5841.method2714();
			is[1] = aClass158_Sub2_5841.method2716();
		} else {
			int[] is_136_ = is;
			is[1] = 0;
			is_136_[0] = 0;
		}
	}

	public abstract void hz(int i, Class455 class455, int i_137_, int i_138_);

	public abstract void method8474();

	public abstract void method8475(int i, Class90 class90);

	public abstract void method8476(int i, Class90 class90);

	public abstract void method8477(Class152 class152);

	public abstract Class390 method8478(int i, int i_139_, int[][] is, int[][] is_140_, int i_141_, int i_142_, int i_143_);

	public abstract void method8479(float f, float f_144_, float f_145_, float[] fs);

	public abstract void method8480(boolean bool);

	public abstract Class168 method8481();

	public void method8482(int[] is) {
		if (null != aClass158_Sub2_5841) {
			is[0] = aClass158_Sub2_5841.method2714();
			is[1] = aClass158_Sub2_5841.method2716();
		} else {
			int[] is_146_ = is;
			is[1] = 0;
			is_146_[0] = 0;
		}
	}

	public abstract void method8483();

	public abstract void method8484();

	public abstract void ik(int i, int i_147_, int i_148_);

	abstract void method8485();

	abstract void method8486();

	public abstract void method8487(int i);

	public abstract void method8488(int i);

	public abstract int dd();

	public abstract int di();

	public abstract int df();

	public abstract int dv();

	public abstract boolean method8489();

	public abstract void method8490();

	public abstract void method8491(boolean bool);

	public abstract boolean method8492();

	public abstract void fo(int i, int i_149_, int i_150_, int i_151_, int i_152_);

	public final void method8493() throws Exception_Sub3 {
		method8555(0, 0);
	}

	public abstract void method8494(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_);

	public abstract boolean method8495();

	public abstract void method8496(int i, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_);

	public abstract void method8497();

	public abstract boolean method8498();

	public final void method8499(int i, int i_167_, int i_168_, int i_169_) {
		CA(i, i_167_, i_168_, i_169_, 1);
	}

	public Class282_Sub24 method8500(int i, int i_170_, int i_171_, int i_172_, int i_173_, float f) {
		return new Class282_Sub24(i, i_170_, i_171_, i_172_, i_173_, f);
	}

	public abstract boolean method8501();

	public abstract boolean method8502();

	public abstract boolean method8503();

	public abstract void ff(int i, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, byte[] is, int i_179_, int i_180_);

	public abstract boolean method8504();

	public abstract Class528 method8505(Class157 class157, int i, int i_181_, int i_182_, int i_183_);

	final void method8506(Canvas canvas, Class158_Sub2 class158_sub2) {
		if (null == class158_sub2)
			throw new RuntimeException();
		aHashtable5855.put(canvas, class158_sub2);
	}

	public abstract void method8507();

	public Class282_Sub24 method8508(int i, int i_184_, int i_185_, int i_186_, int i_187_, float f) {
		return new Class282_Sub24(i, i_184_, i_185_, i_186_, i_187_, f);
	}

	public abstract void r(int i, int i_188_, int i_189_, int i_190_);

	public void method8509(int[] is) {
		if (null != aClass158_Sub2_5841) {
			is[0] = aClass158_Sub2_5841.method2714();
			is[1] = aClass158_Sub2_5841.method2716();
		} else {
			int[] is_191_ = is;
			is[1] = 0;
			is_191_[0] = 0;
		}
	}

	final Class158_Sub2 method8510() {
		return aClass158_Sub2_5841;
	}

	public abstract void O();

	public abstract void method8511(int i, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_);

	public final void method8512(Canvas canvas, int i, int i_197_) {
		if (!aHashtable5855.containsKey(canvas)) {
			Class459.method7679(canvas, 1643211020);
			method8411(canvas, method8417(canvas, i, i_197_), 316223525);
		}
	}

	public abstract void eq(boolean bool);

	public abstract void method8513(int i, int i_198_, int i_199_, int i_200_);

	public abstract void method8514(int i, int i_201_, int i_202_, int i_203_);

	public abstract void en(float f, float f_204_);

	public abstract void ej(float f, float f_205_);

	public abstract void method8515(float f, float f_206_, float f_207_, float[] fs);

	public abstract void method8516(int i, int i_208_, float f, int i_209_, int i_210_, float f_211_, int i_212_, int i_213_, float f_214_, int i_215_, int i_216_, int i_217_, int i_218_);

	public abstract void fm(int i, int i_219_, int i_220_, int i_221_);

	public abstract void fc(int i, int i_222_, int i_223_, int i_224_);

	public abstract void fe(int i, int i_225_, int i_226_, int i_227_);

	public abstract Class384 method8517();

	public abstract void fh(int[] is);

	public abstract void ft(int[] is);

	public abstract void fd(int i, int i_228_);

	public abstract Class160 method8518(Class91 class91, boolean bool);

	public abstract void fi(int i, int i_229_);

	public abstract void method8519(int i, int i_230_, int i_231_, int i_232_, int i_233_, int i_234_);

	public abstract void ii(int i);

	public abstract void method8520(int i, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_);

	public abstract void method8521();

	public abstract void fb(int i, int i_240_, int i_241_, int i_242_, int i_243_, int i_244_);

	public abstract void c(int i, int i_245_, int i_246_);

	public final void method8522(Canvas canvas) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (null == class158_sub2)
			throw new RuntimeException();
		if (-1417941265 * ((Class505) this).anInt5854 > 0 || aClass158_Sub2_5841 != aClass158_5853)
			throw new RuntimeException();
		if (null != aClass158_5853)
			aClass158_5853.method2718();
		if (-1417941265 * ((Class505) this).anInt5854 < 0)
			aClass158_5853 = class158_sub2;
		aClass158_Sub2_5841 = class158_sub2;
		class158_sub2.method213();
	}

	public final Class158 method8523(byte i) {
		return aClass158_5853;
	}

	public abstract void fp(int i, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_);

	public final void method8524(Canvas canvas, int i, int i_252_, byte i_253_) {
		if (!aHashtable5855.containsKey(canvas)) {
			Class459.method7679(canvas, -88346532);
			method8411(canvas, method8417(canvas, i, i_252_), 316223525);
		}
	}

	public abstract void fq(int i, int i_254_, int i_255_, int i_256_, int i_257_);

	public abstract void method8525(int i, int i_258_, int i_259_, int i_260_);

	public abstract void fl(int i, int i_261_, int i_262_, int i_263_, int i_264_);

	public abstract void eh();

	public abstract void method8526(int i, int i_265_, int i_266_, int i_267_, int i_268_, int i_269_);

	public abstract void method8527(int i, int i_270_, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_);

	public abstract boolean method8528();

	public abstract void method8529(int i, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_, int i_283_, int i_284_, int i_285_);

	public abstract void method8530(int i, int i_286_, int i_287_, int i_288_, int i_289_, int i_290_, int i_291_, int i_292_, int i_293_);

	abstract void method8531();

	public abstract void method8532(int i, int i_294_, int i_295_, int i_296_, int i_297_, int i_298_, Class455 class455, int i_299_, int i_300_);

	public abstract void method8533(int i, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_, Class455 class455, int i_306_, int i_307_);

	public final void method8534(Canvas canvas, int i, int i_308_) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (class158_sub2 == null)
			throw new RuntimeException();
		class158_sub2.method14354(i, i_308_);
	}

	public abstract void method8535(int i, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, Class455 class455, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_);

	public abstract void method8536(int i, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_);

	public abstract int method8537(int i, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_);

	public abstract int method8538(int i, int i_330_, int i_331_, int i_332_, int i_333_, int i_334_);

	public abstract int method8539(int i, int i_335_, int i_336_, int i_337_, int i_338_, int i_339_);

	public abstract int method8540(int i, int i_340_, int i_341_, int i_342_, int i_343_, int i_344_);

	public abstract void DA(int i, Class455 class455, int i_345_, int i_346_);

	public abstract Class282_Sub1 method8541(int i);

	public abstract void method8542(Class282_Sub1 class282_sub1);

	public abstract Class160 method8543(int[] is, int i, int i_347_, int i_348_, int i_349_, boolean bool);

	public abstract void method8544(Class282_Sub1 class282_sub1);

	public static Class505 method8545(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_350_) {
		int i_351_ = 0;
		int i_352_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_351_ = dimension.width;
			i_352_ = dimension.height;
		}
		return Class88.method1493(i, canvas, interface22, class317, i_350_, i_351_, i_352_, (byte) 73);
	}

	public abstract int method8546(int i, int i_353_);

	public abstract void method8547(int i, Class282_Sub24[] class282_sub24s);

	public abstract Class160 method8548(int[] is, int i, int i_354_, int i_355_, int i_356_, boolean bool);

	public Class160 method8549(int[] is, int i, int i_357_, int i_358_, int i_359_, int i_360_) {
		return method8442(is, i, i_357_, i_358_, i_359_, true);
	}

	void method8550() {
		method8396(401222813);
	}

	public final void method8551(Class158_Sub1 class158_sub1) {
		if (-1417941265 * ((Class505) this).anInt5854 >= 3)
			throw new RuntimeException();
		if (-1417941265 * ((Class505) this).anInt5854 >= 0)
			((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265].method2718();
		else
			aClass158_Sub2_5841.method2718();
		aClass158_5853 = ((Class505) this).aClass158_Sub1Array5833[(((Class505) this).anInt5854 += 1209204751) * -1417941265] = class158_sub1;
		class158_sub1.method213();
	}

	public abstract Class160 method8552(int i, int i_361_, int i_362_, int i_363_, boolean bool);

	public abstract Class455 method8553(int i, int i_364_, int[] is, int[] is_365_);

	public abstract Class455 method8554(int i, int i_366_, int[] is, int[] is_367_);

	abstract void method8555(int i, int i_368_) throws Exception_Sub3;

	public abstract Class455 method8556(int i, int i_369_, int[] is, int[] is_370_);

	public abstract void hr(int i, Class455 class455, int i_371_, int i_372_);

	public abstract Class152 method8557(Class152 class152, Class152 class152_373_, float f, Class152 class152_374_);

	public abstract void hi(int i, Class455 class455, int i_375_, int i_376_);

	public abstract void fu(int i, int i_377_);

	abstract Class158_Sub2 method8558(Canvas canvas, int i, int i_378_);

	public abstract void method8559(int i);

	public abstract void method8560(int i);

	public abstract Class528 method8561(Class157 class157, int i, int i_379_, int i_380_, int i_381_);

	public final void method8562(int i, int i_382_, int i_383_, int i_384_, int i_385_, byte i_386_) {
		method8430(i, i_382_, i_383_, i_384_, i_385_, 1);
	}

	public abstract void method8563(int i, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_, Class455 class455, int i_392_, int i_393_, int i_394_, int i_395_, int i_396_);

	public abstract Class528 method8564(Class157 class157, int i, int i_397_, int i_398_, int i_399_);

	public abstract int method8565(int i, int i_400_);

	public abstract int method8566(int i, int i_401_);

	public abstract int method8567(int i, int i_402_);

	public abstract void method8568(boolean bool);

	public abstract Class390 method8569(int i, int i_403_, int[][] is, int[][] is_404_, int i_405_, int i_406_, int i_407_);

	public abstract Class282_Sub1 method8570(int i);

	public abstract Class384 method8571();

	public abstract Class294 method8572();

	public abstract void method8573(float f, float f_408_, float f_409_, float[] fs);

	public abstract int method8574();

	public abstract void method8575(int i, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_, Class455 class455, int i_415_, int i_416_);

	public abstract void method8576(int i, int i_417_, int i_418_, int i_419_, int i_420_, int i_421_, Class455 class455, int i_422_, int i_423_);

	public abstract Class160 method8577(int i, int i_424_, boolean bool, boolean bool_425_);

	public abstract boolean method8578();

	public abstract void method8579(int i, Class282_Sub24[] class282_sub24s);

	public abstract void method8580(Class151 class151);

	public abstract void method8581(Class151 class151);

	public final void method8582(int i, int i_426_, int i_427_, int i_428_, int i_429_) {
		method8430(i, i_426_, i_427_, i_428_, i_429_, 1);
	}

	public abstract Class294 method8583();

	public abstract void method8584(Class152 class152);

	public abstract void method8585(int i, Class90 class90);

	public abstract void method8586(Class384 class384);

	public abstract Class384 method8587();

	public abstract Class384 method8588();

	public abstract Class384 method8589();

	public abstract Class384 method8590();

	public final void method8591(Canvas canvas, int i, int i_430_) {
		if (!aHashtable5855.containsKey(canvas)) {
			Class459.method7679(canvas, 885089370);
			method8411(canvas, method8417(canvas, i, i_430_), 316223525);
		}
	}

	public abstract void in(float f);

	public abstract void is(int i, int i_431_, int i_432_);

	public abstract void im(int i, float f, float f_433_, float f_434_, float f_435_, float f_436_);

	public abstract void iq(int i);

	public abstract void il(int i);

	abstract void method8592(float f, float f_437_, float f_438_, float f_439_, float f_440_, float f_441_);

	public abstract int[] ke(int i, int i_442_, int i_443_, int i_444_);

	public Class282_Sub24 method8593(int i, int i_445_, int i_446_, int i_447_, int i_448_, float f) {
		return new Class282_Sub24(i, i_445_, i_446_, i_447_, i_448_, f);
	}

	public abstract void ib(int i, int i_449_, int i_450_);

	public abstract void method8594(boolean bool);

	public abstract void method8595(boolean bool);

	abstract void method8596(int i, int i_451_) throws Exception_Sub3;

	public final void method8597(int i, int i_452_, int i_453_, int i_454_) {
		G(i, i_452_, i_453_, i_454_, 1);
	}

	public abstract void method8598(Class152 class152);

	public abstract boolean method8599();

	public abstract boolean method8600();

	public abstract void method8601();

	public abstract void method8602();

	public abstract void method8603(int i, int i_455_, int i_456_, int i_457_);

	public abstract Class160 method8604(int i, int i_458_, int i_459_, int i_460_, boolean bool);

	public abstract boolean method8605();

	public abstract boolean method8606();

	public abstract boolean method8607();

	abstract void method8608(float f, float f_461_, float f_462_, float f_463_, float f_464_, float f_465_);

	public abstract boolean method8609();

	public final void method8610(Canvas canvas, int i, int i_466_) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (class158_sub2 == null)
			throw new RuntimeException();
		class158_sub2.method14354(i, i_466_);
	}

	public abstract void method8611();

	public abstract Class160 method8612(Class91 class91, boolean bool);

	public abstract void method8613();

	public abstract boolean method8614();

	public abstract void method8615(int i, Class90 class90);

	public abstract void method8616(int i, Class90 class90);

	public abstract void jf();

	public abstract void method8617(int i, int i_467_, int i_468_, int i_469_);

	public abstract void method8618(Class282_Sub1 class282_sub1);

	public abstract void method8619(float f, float f_470_, float f_471_, float[] fs);

	public abstract Class158_Sub1 method8620();

	public abstract Interface8 method8621(int i, int i_472_);

	void method8622() {
		method8396(1129057800);
	}

	public abstract Class528 method8623(Class157 class157, int i, int i_473_, int i_474_, int i_475_);

	public abstract Class455 method8624(int i, int i_476_, int[] is, int[] is_477_);

	public abstract int[] kh(int i, int i_478_, int i_479_, int i_480_);

	public abstract Class8 method8625(Class414 class414, Class91[] class91s, boolean bool);

	public abstract Class294 method8626();

	public abstract void method8627(int i, int i_481_, float f, int i_482_, int i_483_, float f_484_, int i_485_, int i_486_, float f_487_, int i_488_, int i_489_, int i_490_, int i_491_);

	public abstract boolean method8628();

	public abstract void method8629(int i, int i_492_, float f, int i_493_, int i_494_, float f_495_, int i_496_, int i_497_, float f_498_, int i_499_, int i_500_, int i_501_, int i_502_);

	public abstract int method8630(int i, int i_503_);

	public final void method8631(Class158_Sub1 class158_sub1) {
		if (((Class505) this).anInt5854 * -1417941265 < 0 || (((Class505) this).aClass158_Sub1Array5833[-1417941265 * ((Class505) this).anInt5854]) != class158_sub1)
			throw new RuntimeException();
		((Class505) this).aClass158_Sub1Array5833[(((Class505) this).anInt5854 -= 1209204751) * -1417941265 + 1] = null;
		class158_sub1.method2718();
		if (((Class505) this).anInt5854 * -1417941265 >= 0) {
			aClass158_5853 = (((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265]);
			((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265].method213();
		} else {
			aClass158_5853 = aClass158_Sub2_5841;
			aClass158_Sub2_5841.method213();
		}
	}

	public abstract int method8632(int i, int i_504_);

	public abstract void method8633();

	public abstract void method8634();

	public abstract void method8635();

	public abstract Class152 method8636(int i, int i_505_, int i_506_, int i_507_, int i_508_, int i_509_);

	public final void method8637(Class158_Sub1 class158_sub1, int i) {
		if (-1417941265 * ((Class505) this).anInt5854 >= 3)
			throw new RuntimeException();
		if (-1417941265 * ((Class505) this).anInt5854 >= 0)
			((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265].method2718();
		else
			aClass158_Sub2_5841.method2718();
		aClass158_5853 = ((Class505) this).aClass158_Sub1Array5833[(((Class505) this).anInt5854 += 1209204751) * -1417941265] = class158_sub1;
		class158_sub1.method213();
	}

	public static Class505 method8638(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_510_) {
		int i_511_ = 0;
		int i_512_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_511_ = dimension.width;
			i_512_ = dimension.height;
		}
		return Class88.method1493(i, canvas, interface22, class317, i_510_, i_511_, i_512_, (byte) 73);
	}

	public abstract void iz(float f);

	public Class160 method8639(int[] is, int i, int i_513_, int i_514_, int i_515_) {
		return method8442(is, i, i_513_, i_514_, i_515_, true);
	}

	public final Class158 method8640() {
		return aClass158_5853;
	}

	public static Class505 method8641(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_516_) {
		int i_517_ = 0;
		int i_518_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_517_ = dimension.width;
			i_518_ = dimension.height;
		}
		return Class88.method1493(i, canvas, interface22, class317, i_516_, i_517_, i_518_, (byte) 73);
	}

	static synchronized Class505 method8642(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_519_, int i_520_, int i_521_) {
		if (0 == i)
			return Class109_Sub1.method14652(canvas, interface22, i_520_, i_521_, (byte) -75);
		if (i == 2)
			return Class8.method404(canvas, interface22, i_520_, i_521_, -88129201);
		if (i == 1)
			return Class171.method2909(canvas, interface22, i_519_);
		if (5 == i)
			return Class315.method5582(canvas, interface22, class317, i_519_);
		if (i == 3)
			return Class374.method6367(canvas, interface22, class317, i_519_);
		throw new IllegalArgumentException("");
	}

	static synchronized Class505 method8643(int i, Canvas canvas, Interface22 interface22, Class317 class317, int i_522_, int i_523_, int i_524_) {
		if (0 == i)
			return Class109_Sub1.method14652(canvas, interface22, i_523_, i_524_, (byte) -53);
		if (i == 2)
			return Class8.method404(canvas, interface22, i_523_, i_524_, 405118406);
		if (i == 1)
			return Class171.method2909(canvas, interface22, i_522_);
		if (5 == i)
			return Class315.method5582(canvas, interface22, class317, i_522_);
		if (i == 3)
			return Class374.method6367(canvas, interface22, class317, i_522_);
		throw new IllegalArgumentException("");
	}

	public abstract boolean method8644();

	public static boolean method8645(int i) {
		return 1 == i || i == 3 || 5 == i;
	}

	public static boolean method8646(int i) {
		return 1 == i || i == 3 || 5 == i;
	}

	public static boolean method8647(int i) {
		return 1 == i || i == 3 || 5 == i;
	}

	public static boolean method8648(int i) {
		return 0 == i || 2 == i;
	}

	public abstract boolean method8649();

	public abstract void method8650(float f, float f_525_, float f_526_, float[] fs);

	public void method8651() {
		aBoolArray5839[anInt5840 * -413843045] = false;
		Enumeration enumeration = aHashtable5855.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
		}
		method8397();
	}

	public void method8652() {
		aBoolArray5839[anInt5840 * -413843045] = false;
		Enumeration enumeration = aHashtable5855.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
		}
		method8397();
	}

	public final Class158 method8653() {
		return aClass158_5853;
	}

	public abstract Class160 method8654(int i, int i_527_, boolean bool, boolean bool_528_);

	public final Class158 method8655() {
		return aClass158_5853;
	}

	final Class158_Sub2 method8656() {
		return aClass158_Sub2_5841;
	}

	public final void method8657(Canvas canvas) {
		if (aHashtable5855.containsKey(canvas)) {
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
			aHashtable5855.remove(canvas);
		}
	}

	public abstract void method8658(int i, int i_529_, float f, int i_530_, int i_531_, float f_532_, int i_533_, int i_534_, float f_535_, int i_536_, int i_537_, int i_538_, int i_539_);

	public final void method8659(int i, int i_540_, int i_541_, int i_542_, int i_543_) {
		XA(i, i_540_, i_541_, i_542_, 1);
	}

	abstract void fw(int i, int i_544_, int i_545_, int i_546_, int i_547_);

	public abstract Class8 method8660(Class414 class414, Class91[] class91s, boolean bool);

	public void method8661(int[] is) {
		if (null != aClass158_Sub2_5841) {
			is[0] = aClass158_Sub2_5841.method2714();
			is[1] = aClass158_Sub2_5841.method2716();
		} else {
			int[] is_548_ = is;
			is[1] = 0;
			is_548_[0] = 0;
		}
	}

	final void method8662(Canvas canvas, Class158_Sub2 class158_sub2) {
		if (null == class158_sub2)
			throw new RuntimeException();
		aHashtable5855.put(canvas, class158_sub2);
	}

	final void method8663(Canvas canvas, Class158_Sub2 class158_sub2) {
		if (null == class158_sub2)
			throw new RuntimeException();
		aHashtable5855.put(canvas, class158_sub2);
	}

	public abstract boolean method8664();

	public abstract void N(int i, int i_549_, int i_550_, int i_551_, int i_552_, int i_553_, byte[] is, int i_554_, int i_555_);

	public final void method8665(Canvas canvas) {
		if (aHashtable5855.containsKey(canvas)) {
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
			aHashtable5855.remove(canvas);
		}
	}

	public final void method8666(Canvas canvas) {
		if (aHashtable5855.containsKey(canvas)) {
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
			aHashtable5855.remove(canvas);
		}
	}

	public final void method8667(Canvas canvas) {
		if (aHashtable5855.containsKey(canvas)) {
			Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
			class158_sub2.method212();
			aHashtable5855.remove(canvas);
		}
	}

	public abstract Class160 method8668(int i, int i_556_, int i_557_, int i_558_, boolean bool);

	public abstract int[] kf(int i, int i_559_, int i_560_, int i_561_);

	public abstract void fv(int i, int i_562_, int i_563_, int i_564_, int i_565_, int i_566_, byte[] is, int i_567_, int i_568_);

	public abstract void method8669(int i, int i_569_, int i_570_, int i_571_, int i_572_, int i_573_, Class455 class455, int i_574_, int i_575_);

	public final void method8670(Canvas canvas, int i, int i_576_) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (class158_sub2 == null)
			throw new RuntimeException();
		class158_sub2.method14354(i, i_576_);
	}

	public final void method8671(Canvas canvas, int i, int i_577_) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (class158_sub2 == null)
			throw new RuntimeException();
		class158_sub2.method14354(i, i_577_);
	}

	public final void method8672(Class158_Sub1 class158_sub1) {
		if (-1417941265 * ((Class505) this).anInt5854 >= 3)
			throw new RuntimeException();
		if (-1417941265 * ((Class505) this).anInt5854 >= 0)
			((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265].method2718();
		else
			aClass158_Sub2_5841.method2718();
		aClass158_5853 = ((Class505) this).aClass158_Sub1Array5833[(((Class505) this).anInt5854 += 1209204751) * -1417941265] = class158_sub1;
		class158_sub1.method213();
	}

	public abstract void method8673(int i, int i_578_, int i_579_, int i_580_);

	public abstract boolean method8674();

	abstract void fr(int i, int i_581_, int i_582_, int i_583_, int i_584_);

	public final void method8675(Class158_Sub1 class158_sub1) {
		if (-1417941265 * ((Class505) this).anInt5854 >= 3)
			throw new RuntimeException();
		if (-1417941265 * ((Class505) this).anInt5854 >= 0)
			((Class505) this).aClass158_Sub1Array5833[((Class505) this).anInt5854 * -1417941265].method2718();
		else
			aClass158_Sub2_5841.method2718();
		aClass158_5853 = ((Class505) this).aClass158_Sub1Array5833[(((Class505) this).anInt5854 += 1209204751) * -1417941265] = class158_sub1;
		class158_sub1.method213();
	}

	public final void method8676(int i, int i_585_, int i_586_, int i_587_, int i_588_) {
		method8430(i, i_585_, i_586_, i_587_, i_588_, 1);
	}

	public final void method8677(int i, int i_589_, int i_590_, int i_591_, int i_592_) {
		B(i, i_589_, i_590_, i_591_, i_592_, 1);
	}

	public final void method8678(int i, int i_593_, int i_594_, int i_595_, int i_596_) {
		B(i, i_593_, i_594_, i_595_, i_596_, 1);
	}

	public abstract boolean method8679();

	public abstract void fs(int i, int i_597_, int i_598_, int i_599_, int i_600_);

	public final void method8680(int i, int i_601_, int i_602_, int i_603_) {
		CA(i, i_601_, i_602_, i_603_, 1);
	}

	public final void method8681(int i, int i_604_, int i_605_, int i_606_) {
		CA(i, i_604_, i_605_, i_606_, 1);
	}

	public final void method8682(Canvas canvas, int i, int i_607_) {
		Class158_Sub2 class158_sub2 = (Class158_Sub2) aHashtable5855.get(canvas);
		if (class158_sub2 == null)
			throw new RuntimeException();
		class158_sub2.method14354(i, i_607_);
	}

	public final void method8683(int i, int i_608_, int i_609_, int i_610_) {
		XA(i, i_608_, i_609_, i_610_, 1);
	}

	public final void method8684(int i, int i_611_, int i_612_, int i_613_) {
		XA(i, i_611_, i_612_, i_613_, 1);
	}

	public abstract Class294 method8685();

	public final void method8686(int i, int i_614_, int i_615_, int i_616_, int i_617_) {
		method8433(i, i_614_, i_615_, i_616_, i_617_, 1);
	}

	public final void method8687(int i, int i_618_, int i_619_, int i_620_, int i_621_) {
		method8433(i, i_618_, i_619_, i_620_, i_621_, 1);
	}

	public Class160 method8688(int i, int i_622_, boolean bool) {
		return method8654(i, i_622_, bool, false);
	}

	public Class160 method8689(int i, int i_623_, boolean bool) {
		return method8654(i, i_623_, bool, false);
	}

	public Class160 method8690(int i, int i_624_, boolean bool) {
		return method8654(i, i_624_, bool, false);
	}

	public abstract void method8691();

	public boolean method8692() {
		return true;
	}

	public void method8693(float f, float f_625_, float f_626_) {
		method8592(f, f_625_, f_626_, 0.0F, 1.0F, 1.0F);
	}

	static final void method8694(Class527 class527, int i) {
		int i_627_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_627_, (byte) 95);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_627_ >> 16];
		Class388.method6690(class118, class98, class527, (byte) 95);
	}

	static void method8695(Class275_Sub2 class275_sub2, int i) {
		((Class275_Sub2) class275_sub2).aClass521_Sub1_Sub1_Sub2_7739 = null;
		if (Class275_Sub2.anInt7741 * 278158593 < 20) {
			Class275_Sub2.aClass457_7745.method7649(class275_sub2, 1876581083);
			Class275_Sub2.anInt7741 += -1808489727;
		}
	}

	public static int method8696(CharSequence charsequence, int i) {
		int i_628_ = charsequence.length();
		int i_629_ = 0;
		for (int i_630_ = 0; i_630_ < i_628_; i_630_++)
			i_629_ = ((i_629_ << 5) - i_629_ + Class242.method4163(charsequence.charAt(i_630_), (byte) 117));
		return i_629_;
	}

	public static Class282_Sub50_Sub7 method8697(int i) {
		return Class96_Sub23.aClass282_Sub50_Sub7_9445;
	}

	static final void method8698(Class527 class527, int i) {
		if (Class282_Sub13.aClass61_7587 != null) {
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
			((Class527) class527).aClass61_7010 = Class282_Sub13.aClass61_7587;
		} else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static Class282_Sub50_Sub5 method8699(byte[] is, int i) {
		return new Class282_Sub50_Sub5(new RsByteBuffer(is));
	}

	static void method8700(Class527 class527, byte i) {
		int i_631_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 - 3]);
		int i_632_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537 - 2]);
		int i_633_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012 - 1]);
		((Class527) class527).anInt7012 -= 425673003;
		if (i_631_ > ((Class527) class527).anIntArray6997[i_632_])
			throw new RuntimeException();
		if (i_631_ > ((Class527) class527).anIntArray6997[i_633_])
			throw new RuntimeException();
		if (i_632_ == i_633_)
			throw new RuntimeException();
		Class225_Sub5.method13047((((Class527) class527).anIntArrayArray6998[i_632_]), (((Class527) class527).anIntArrayArray6998[i_633_]), 0, i_631_ - 1, (byte) 46);
	}

	static final void method8701(Class527 class527, byte i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((Class527) class527).aClass61_7010.aBool624 ? 1 : 0;
	}
}
