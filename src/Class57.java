/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class57 implements Interface28 {
	final void method620(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, Class_ta class_ta, int i, int i_5_) {
		method644(f, f_0_, f_1_, f_2_, f_3_, f_4_, 1, class_ta, i, i_5_);
	}

	public abstract void method621(int i, int i_6_, int i_7_, int i_8_);

	public abstract void method622(int[] is);

	public abstract int method623();

	public abstract void method624(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_);

	public abstract int method625();

	public abstract int method626();

	public abstract Interface8_Impl1_Impl1 method627();

	public abstract void method628(int i, int i_14_, int i_15_);

	abstract void method629(float f, float f_16_, float f_17_, float f_18_, float f_19_, float f_20_, int i, int i_21_, int i_22_, int i_23_);

	public abstract int method630();

	public abstract void method631(int i, int i_24_, int i_25_, int i_26_, int i_27_);

	public abstract void method632(int i, int i_28_, int i_29_);

	public final void method633(int i, int i_30_, int i_31_, int i_32_) {
		method635(i, i_30_, i_31_, i_32_, 1, 0, 1, 1);
	}

	public final void method634(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_) {
		method635(i, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_, 1);
	}

	abstract void method635(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_);

	public final void method636(int i, int i_46_, int i_47_, int i_48_) {
		method662(i, i_46_, i_47_, i_48_, 1, 0, 1);
	}

	public abstract int method271();

	final void method637(float f, float f_49_, float f_50_, float f_51_, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (i != 0) {
			double d = (double) (i_52_ & 0xffff) * 9.587379924285257E-5;
			float f_56_ = (float) Math.sin(d) * (float) i;
			float f_57_ = (float) Math.cos(d) * (float) i;
			float f_58_ = (-f_50_ * f_57_ + -f_51_ * f_56_) / 4096.0F + f;
			float f_59_ = (--f_50_ * f_56_ + -f_51_ * f_57_) / 4096.0F + f_49_;
			float f_60_ = ((((float) method271() - f_50_) * f_57_ + -f_51_ * f_56_) / 4096.0F + f);
			float f_61_ = ((-((float) method271() - f_50_) * f_56_ + -f_51_ * f_57_) / 4096.0F + f_49_);
			float f_62_ = ((-f_50_ * f_57_ + ((float) method626() - f_51_) * f_56_) / 4096.0F + f);
			float f_63_ = ((--f_50_ * f_56_ + ((float) method626() - f_51_) * f_57_) / 4096.0F + f_49_);
			method641(f_58_, f_59_, f_60_, f_61_, f_62_, f_63_, i_53_, i_54_, i_55_);
		}
	}

	public final void method638(float f, float f_64_, int i, int i_65_, int i_66_, int i_67_, int i_68_) {
		method637(f, f_64_, (float) method271() / 2.0F, (float) method626() / 2.0F, i, i_65_, i_66_, i_67_, i_68_);
	}

	public final void method639(float f, float f_69_, int i, int i_70_, Class_ta class_ta, int i_71_, int i_72_) {
		method659(f, f_69_, (float) method271() / 2.0F, (float) method626() / 2.0F, i, i_70_, class_ta, i_71_, i_72_);
	}

	public abstract void method640(int[] is);

	public final void method641(float f, float f_73_, float f_74_, float f_75_, float f_76_, float f_77_, int i, int i_78_, int i_79_) {
		method642(f, f_73_, f_74_, f_75_, f_76_, f_77_, i, i_78_, i_79_, 1);
	}

	abstract void method642(float f, float f_80_, float f_81_, float f_82_, float f_83_, float f_84_, int i, int i_85_, int i_86_, int i_87_);

	public abstract void method643(int i, int i_88_, int i_89_, int i_90_, int i_91_);

	abstract void method644(float f, float f_92_, float f_93_, float f_94_, float f_95_, float f_96_, int i, Class_ta class_ta, int i_97_, int i_98_);

	public final void method645(int i, int i_99_) {
		method631(i, i_99_, 1, 0, 1);
	}

	public abstract Interface8_Impl1_Impl1 method646();

	public abstract Interface8_Impl1_Impl1 method647();

	public abstract void method648(int i, int i_100_, int i_101_, int i_102_, int i_103_);

	public abstract void method649(int i, int i_104_, int i_105_, int i_106_, int i_107_);

	public abstract void method650(int i, int i_108_, Class_ta class_ta, int i_109_, int i_110_);

	abstract void method651(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_);

	abstract void method652(int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_);

	public abstract int method653();

	public abstract void method654(int i, int i_125_, Class_ta class_ta, int i_126_, int i_127_);

	public abstract void method655(int i, int i_128_, int i_129_, int i_130_);

	public abstract void method656(int[] is);

	abstract void method657(float f, float f_131_, float f_132_, float f_133_, float f_134_, float f_135_, int i, int i_136_, int i_137_, int i_138_);

	public abstract int method658();

	public abstract int method272();

	public final void method659(float f, float f_139_, float f_140_, float f_141_, int i, int i_142_, Class_ta class_ta, int i_143_, int i_144_) {
		if (i != 0) {
			double d = (double) (i_142_ & 0xffff) * 9.587379924285257E-5;
			float f_145_ = (float) Math.sin(d) * (float) i;
			float f_146_ = (float) Math.cos(d) * (float) i;
			float f_147_ = (-f_140_ * f_146_ + -f_141_ * f_145_) / 4096.0F + f;
			float f_148_ = (--f_140_ * f_145_ + -f_141_ * f_146_) / 4096.0F + f_139_;
			float f_149_ = ((((float) method271() - f_140_) * f_146_ + -f_141_ * f_145_) / 4096.0F + f);
			float f_150_ = ((-((float) method271() - f_140_) * f_145_ + -f_141_ * f_146_) / 4096.0F + f_139_);
			float f_151_ = ((-f_140_ * f_146_ + ((float) method626() - f_141_) * f_145_) / 4096.0F + f);
			float f_152_ = ((--f_140_ * f_145_ + ((float) method626() - f_141_) * f_146_) / 4096.0F + f_139_);
			method620(f_147_, f_148_, f_149_, f_150_, f_151_, f_152_, class_ta, i_143_, i_144_);
		}
	}

	public abstract void method660(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_);

	public abstract void method661(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_);

	public abstract void method662(int i, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_);

	abstract void method663(float f, float f_171_, float f_172_, float f_173_, float f_174_, float f_175_, int i, int i_176_, int i_177_, int i_178_);

	Class57() {
		/* empty */
	}

	abstract void method664(float f, float f_179_, float f_180_, float f_181_, float f_182_, float f_183_, int i, int i_184_, int i_185_, int i_186_);

	public abstract void method665(int i, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_);

	abstract void method666(float f, float f_192_, float f_193_, float f_194_, float f_195_, float f_196_, int i, int i_197_, int i_198_, int i_199_);

	public abstract int method667();

	public abstract int method668();

	public abstract int method669();

	abstract void method670(float f, float f_200_, float f_201_, float f_202_, float f_203_, float f_204_, int i, Class_ta class_ta, int i_205_, int i_206_);

	abstract void method671(float f, float f_207_, float f_208_, float f_209_, float f_210_, float f_211_, int i, Class_ta class_ta, int i_212_, int i_213_);

	abstract void method672(float f, float f_214_, float f_215_, float f_216_, float f_217_, float f_218_, int i, Class_ta class_ta, int i_219_, int i_220_);

	public final void method673(float f, float f_221_, int i, int i_222_) {
		method637(f, f_221_, (float) method271() / 2.0F, (float) method626() / 2.0F, i, i_222_, 1, 0, 1);
	}

	public abstract void method674(int i, int i_223_, int i_224_, int i_225_, int i_226_);

	public abstract void method675(int i, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_);

	abstract void method676(float f, float f_232_, float f_233_, float f_234_, float f_235_, float f_236_, int i, int i_237_, int i_238_, int i_239_);

	public abstract void method677(int[] is);
}
