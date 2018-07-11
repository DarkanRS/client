
/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public class Class20 {
	static Matrix44Var aClass294_155;
	static int anInt156;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_157;
	static Matrix44Arr aClass384_158;
	public static boolean aBool161;
	static boolean aBool162;
	static Class282_Sub50_Sub15 aClass282_Sub50_Sub15_163;
	static SoftCache aClass229_164;
	static int anInt167;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_168;
	public static int anInt169;
	public static int anInt170;
	static NodeCollection aClass482_171;
	static IterableNodeMap aClass465_172;
	static NodeCollection aClass482_174;
	static NodeCollection aClass482_175;
	static int anInt176;
	static int[] anIntArray177;
	static int anInt178 = 426037136;
	static int anInt179;
	static int anInt180;
	static int anInt181;
	static Class477 aClass477_182;
	static IComponentDefinitions aClass118_183;
	static int anInt184;
	static Matrix44Arr aClass384_185;
	static int anInt186;
	public static boolean aBool187;
	public static int anInt188;
	static SoftCache aClass229_191;
	static float[] aFloatArray194;
	static int anInt195;
	public static int anInt198;

	static {
		aBool161 = false;
		aBool162 = false;
		aClass282_Sub50_Sub15_163 = null;
		anInt167 = 0;
		anInt169 = 0;
		anInt170 = 0;
		aClass482_171 = new NodeCollection();
		aClass465_172 = new IterableNodeMap(16);
		aClass477_182 = new Class477();
		aClass482_174 = new NodeCollection();
		aClass482_175 = new NodeCollection();
		aClass229_164 = new SoftCache(30);
		aClass118_183 = null;
		anInt195 = -1511257025;
		anInt179 = 248935111;
		anInt180 = -797571487;
		anInt181 = 2139368457;
		anInt176 = 0;
		anInt184 = 0;
		aClass384_158 = null;
		aClass384_185 = new Matrix44Arr();
		aClass294_155 = new Matrix44Var();
		aBool187 = false;
		anInt156 = 0;
		anInt198 = -1670293651;
		aClass229_191 = new SoftCache(8);
		aFloatArray194 = new float[4];
	}

	Class20() throws Throwable {
		throw new Error();
	}

	static final void method741(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class306.method5455(class118, class98, class527, -869216999);
	}

	static final void method742(CS2Executor class527, int i) {
		int i_561_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = IndexLoaders.QUICK_CHAT_INDEX_LOADER.method5918(i_561_, -572656458);
		if (class282_sub50_sub14.anIntArray9746 == null)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = class282_sub50_sub14.anIntArray9746.length;
	}

	static final void method743(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12872(-257053432) ? 1 : 0;
	}

	static void method744(int i, int i_562_, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_) {
		int i_568_ = Class275.method4890(i_563_, 324226563 * Class532_Sub1.anInt7070, Class532_Sub1.anInt7068 * -348932735, -109837866);
		int i_569_ = Class275.method4890(i_564_, 324226563 * Class532_Sub1.anInt7070, -348932735 * Class532_Sub1.anInt7068, -766812485);
		int i_570_ = Class275.method4890(i, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, -1790568603);
		int i_571_ = Class275.method4890(i_562_, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, -1159028771);
		int i_572_ = Class275.method4890(i_566_ + i_563_, Class532_Sub1.anInt7070 * 324226563, Class532_Sub1.anInt7068 * -348932735, -1317034828);
		int i_573_ = Class275.method4890(i_564_ - i_566_, 324226563 * Class532_Sub1.anInt7070, Class532_Sub1.anInt7068 * -348932735, -1696179527);
		for (int i_574_ = i_568_; i_574_ < i_572_; i_574_++)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_574_], i_570_, i_571_, i_565_, (byte) 31);
		for (int i_575_ = i_569_; i_575_ > i_573_; i_575_--)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_575_], i_570_, i_571_, i_565_, (byte) 46);
		int i_576_ = Class275.method4890(i_566_ + i, Class532_Sub1.anInt7071 * -612590951, Class532_Sub1.anInt7069 * -1345107225, 2146581760);
		int i_577_ = Class275.method4890(i_562_ - i_566_, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, 167924575);
		for (int i_578_ = i_572_; i_578_ <= i_573_; i_578_++) {
			int[] is = Class532_Sub1.anIntArrayArray7072[i_578_];
			Class232.method3922(is, i_570_, i_576_, i_565_, (byte) -7);
			Class232.method3922(is, i_577_, i_571_, i_565_, (byte) -37);
		}
	}

	static final void method745(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.aBool7155 ? 1 : 0;
	}

	public static void animate(Animable animable, int[] is, int i, boolean bool, byte i_579_) {
		if (null != animable.anIntArray10350) {
			boolean bool_580_ = true;
			for (int i_581_ = 0; i_581_ < animable.anIntArray10350.length; i_581_++) {
				if (is[i_581_] != animable.anIntArray10350[i_581_]) {
					bool_580_ = false;
					break;
				}
			}
			Class456 class456 = animable.aClass456_10338;
			if (bool_580_ && class456.method7564(-1655113782)) {
				AnimationDefinitions class518 = animable.aClass456_10338.method7565(-1632742162);
				int i_582_ = 554947543 * class518.anInt5907;
				if (i_582_ == 1)
					class456.method7583(i, (byte) 0);
				if (2 == i_582_)
					class456.method7584(-272427166);
			}
		}
		boolean bool_583_ = true;
		for (int i_584_ = 0; i_584_ < is.length; i_584_++) {
			if (-1 != is[i_584_])
				bool_583_ = false;
			if (null == animable.anIntArray10350 || -1 == animable.anIntArray10350[i_584_] || ((IndexLoaders.aClass523_3868.method11205(is[i_584_], (byte) -52).anInt5916) * -1834317435 >= (IndexLoaders.aClass523_3868.method11205(animable.anIntArray10350[i_584_], (byte) -23).anInt5916) * -1834317435)) {
				animable.anIntArray10350 = is;
				animable.aClass456_10338.method7575(i, 1547741706);
				if (bool)
					animable.anInt10367 = 485298635 * animable.anInt10355;
			}
		}
		if (bool_583_) {
			animable.anIntArray10350 = is;
			animable.aClass456_10338.method7575(i, 1956173638);
			if (bool)
				animable.anInt10367 = 485298635 * animable.anInt10355;
		}
	}
}
