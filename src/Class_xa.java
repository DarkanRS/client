/* Class_xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class_xa {
	public int anInt6286;
	public int anInt6287;
	public int anInt6288;
	public int anInt6289;
	public int[][] anIntArrayArray6290;
	static Class396 aClass396_6291;
	public static int anInt6292;

	public abstract void av(Class_na class_na, int i, int i_0_, int i_1_, int i_2_, boolean bool);

	public abstract void LA(int i, int i_3_, int i_4_);

	public abstract void method6335(int i, int i_5_, int[] is, int[] is_6_, int[] is_7_, int[] is_8_, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_, Class78 class78, boolean bool);

	public abstract void method6336(int i, int i_13_, int[] is, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, Class78 class78, boolean bool);

	public abstract void method6337(int i, int i_24_, int[] is, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, Class78 class78, boolean bool);

	public abstract void method6338(int i, int i_35_, int i_36_, boolean[][] bools, boolean bool, int i_37_);

	public abstract void method6339(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, boolean[][] bools);

	public final int method6340(int i, int i_44_, int i_45_) {
		try {
			int i_46_ = i >> -2137349879 * anInt6289;
			int i_47_ = i_44_ >> -2137349879 * anInt6289;
			if (i_46_ < 0 || i_47_ < 0 || i_46_ > anInt6287 * -506105871 - 1 || i_47_ > anInt6286 * -1148794921 - 1)
				return 0;
			int i_48_ = i & anInt6288 * -1212653763 - 1;
			int i_49_ = i_44_ & anInt6288 * -1212653763 - 1;
			int i_50_ = ((((anInt6288 * -1212653763 - i_48_) * anIntArrayArray6290[i_46_][i_47_]) + i_48_ * anIntArrayArray6290[i_46_ + 1][i_47_]) >> anInt6289 * -2137349879);
			int i_51_ = ((i_48_ * anIntArrayArray6290[1 + i_46_][1 + i_47_] + ((anInt6288 * -1212653763 - i_48_) * anIntArrayArray6290[i_46_][i_47_ + 1])) >> anInt6289 * -2137349879);
			return (i_50_ * (anInt6288 * -1212653763 - i_49_) + i_51_ * i_49_ >> anInt6289 * -2137349879);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.i(").append(')').toString());
		}
	}

	public final int method6341(int i, int i_52_, byte i_53_) {
		try {
			return anIntArrayArray6290[i][i_52_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.k(").append(')').toString());
		}
	}

	public abstract Class_na w(int i, int i_54_, Class_na class_na);

	public abstract void UA(Class_na class_na, int i, int i_55_, int i_56_, int i_57_, boolean bool);

	public abstract void NA(Class_na class_na, int i, int i_58_, int i_59_, int i_60_, boolean bool);

	Class_xa(int i, int i_61_, int i_62_, int[][] is) {
		anInt6287 = -1455578863 * i;
		anInt6286 = i_61_ * 1046617063;
		int i_63_ = 0;
		for (/**/; i_62_ > 1; i_62_ >>= 1)
			i_63_++;
		anInt6288 = (1 << i_63_) * 1080291349;
		anInt6289 = i_63_ * -816104135;
		anIntArrayArray6290 = is;
	}

	public abstract void method6342(Class298_Sub10 class298_sub10, int[] is);

	public abstract void ad(Class_na class_na, int i, int i_64_, int i_65_, int i_66_, boolean bool);

	public abstract void method6343(int i, int i_67_, int[] is, int[] is_68_, int[] is_69_, int[] is_70_, int[] is_71_, int[] is_72_, int[] is_73_, int[] is_74_, int[] is_75_, int[] is_76_, int[] is_77_, Class78 class78, boolean bool);

	public abstract void method6344(Class298_Sub10 class298_sub10, int[] is);

	public abstract void method6345(int i, int i_78_, int[] is, int[] is_79_, int[] is_80_, int[] is_81_, int[] is_82_, int[] is_83_, int[] is_84_, int[] is_85_, Class78 class78, boolean bool);

	public abstract void method6346(int i, int i_86_, int[] is, int[] is_87_, int[] is_88_, int[] is_89_, int[] is_90_, int[] is_91_, int[] is_92_, int[] is_93_, Class78 class78, boolean bool);

	public abstract void SA();

	public abstract void h();

	public abstract void method6347(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, boolean[][] bools);

	public abstract void method6348(int i, int i_100_, int i_101_, boolean[][] bools, boolean bool, int i_102_);

	public abstract Class_na ax(int i, int i_103_, Class_na class_na);

	public abstract void method6349(int i, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, boolean[][] bools);

	public abstract void method6350(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, boolean[][] bools);

	public abstract void method6351(int i, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, boolean[][] bools);

	public abstract void method6352(int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, boolean[][] bools);

	public abstract Class_na l(int i, int i_128_, Class_na class_na);

	public abstract boolean method6353(Class_na class_na, int i, int i_129_, int i_130_, int i_131_, boolean bool);

	public abstract Class_na aa(int i, int i_132_, Class_na class_na);

	public abstract void ak(Class_na class_na, int i, int i_133_, int i_134_, int i_135_, boolean bool);

	public abstract boolean method6354(Class_na class_na, int i, int i_136_, int i_137_, int i_138_, boolean bool);

	public abstract boolean method6355(Class_na class_na, int i, int i_139_, int i_140_, int i_141_, boolean bool);

	public abstract void method6356(int i, int i_142_, int[] is, int[] is_143_, int[] is_144_, int[] is_145_, int[] is_146_, int[] is_147_, int[] is_148_, int[] is_149_, int[] is_150_, int[] is_151_, int[] is_152_, Class78 class78, boolean bool);

	public abstract void at(int i, int i_153_, int i_154_);

	public abstract void method6357(int i, int i_155_, int i_156_, boolean[][] bools, boolean bool, int i_157_);

	public abstract void method6358(Class298_Sub10 class298_sub10, int[] is);

	public abstract void method6359(int i, int i_158_, int[] is, int[] is_159_, int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_, int[] is_164_, int[] is_165_, Class78 class78, boolean bool);

	static final void method6360(ClientScript2 class403, int i) {
		try {
			int i_166_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_166_, (byte) 109);
			Class119 class119 = Class389.aClass119Array4165[i_166_ >> 16];
			Class22.method373(class105, class119, class403, 327823219);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.ja(").append(')').toString());
		}
	}

	static final void method6361(ClientScript2 class403, byte i) {
		try {
			int i_167_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_167_, (byte) -33);
			Class119 class119 = Class389.aClass119Array4165[i_167_ >> 16];
			Class125.method1397(class105, class119, class403, 1549580200);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.nu(").append(')').toString());
		}
	}

	static final void method6362(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_168_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_169_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (i_168_ > 700 || i_169_ > 700)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 256;
			double d = ((Math.random() * (double) (i_169_ + i_168_) - (double) i_168_ + 800.0) / 100.0);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (Math.pow(2.0, d) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.zr(").append(')').toString());
		}
	}

	static final void method6363(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5646((byte) -74) && Class373.aClass_ra4071.method5050()) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.anp(").append(')').toString());
		}
	}

	static final void method6364(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_170_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_171_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_172_ = (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]);
			long l = Class296.method2830(0, 0, 12, i_170_, i_171_, i_172_, (byte) 67);
			int i_173_ = Class408.method4966(l);
			if (i_172_ < 1970)
				i_173_--;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_173_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xa.akr(").append(')').toString());
		}
	}
}
