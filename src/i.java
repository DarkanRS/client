/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class i extends Class390 implements Interface40 {
	Class482 aClass482_7143 = new Class482();
	long nativeid;
	ja aja7144;

	public void method6721(Class282_Sub24 class282_sub24, int[] is) {
		((i) this).aClass482_7143.method8059(class282_sub24, -128323671);
		A(class282_sub24.hashCode(), class282_sub24.method12368((byte) -66), class282_sub24.method12369(1534020223), class282_sub24.method12394(1778675317), class282_sub24.method12370(-789603523), class282_sub24.method12371(-2137870600), is);
	}

	native void G(ja var_ja, ba var_ba, int i, int i_0_, int[][] is, int[][] is_1_, int i_2_, int i_3_, int i_4_);

	public native void z(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_5_, int i_6_, int i_7_, boolean bool);

	native void ap(float[] fs);

	public native void LA(int i, int i_8_, int i_9_);

	public final void method6707(int i, int i_10_, int[] is, int[] is_11_, int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_, Class90 class90, boolean bool) {
		ya(i, i_10_, is, is_11_, is_12_, is_13_, is_14_, is_15_, is_16_, is_17_, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481, bool);
	}

	public void method6710(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, boolean[][] bools) {
		((i) this).aja7144.nx().method318(this, i, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, bools);
	}

	public void method6714(int i, int i_24_, int[] is, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_, Class90 class90, boolean bool) {
		boolean bool_35_ = false;
		if (is_31_ != null) {
			int[] is_36_ = is_31_;
			for (int i_37_ = 0; i_37_ < is_36_.length; i_37_++) {
				int i_38_ = is_36_[i_37_];
				if (i_38_ != -1) {
					bool_35_ = true;
					break;
				}
			}
		}
		int i_39_ = is_31_.length;
		int[] is_40_ = new int[i_39_ * 3];
		int[] is_41_ = new int[i_39_ * 3];
		int[] is_42_ = new int[i_39_ * 3];
		int[] is_43_ = new int[i_39_ * 3];
		int[] is_44_ = new int[i_39_ * 3];
		int[] is_45_ = is_32_ != null ? new int[i_39_ * 3] : null;
		int[] is_46_ = is_25_ != null ? new int[i_39_ * 3] : null;
		int[] is_47_ = is_27_ != null ? new int[i_39_ * 3] : null;
		int i_48_ = 0;
		for (int i_49_ = 0; i_49_ < i_39_; i_49_++) {
			int i_50_ = is_28_[i_49_];
			int i_51_ = is_29_[i_49_];
			int i_52_ = is_30_[i_49_];
			is_40_[i_48_] = is[i_50_];
			is_41_[i_48_] = is_26_[i_50_];
			is_42_[i_48_] = is_31_[i_49_];
			is_43_[i_48_] = is_33_[i_49_];
			is_44_[i_48_] = is_34_[i_49_];
			if (is_32_ != null)
				is_45_[i_48_] = is_32_[i_49_];
			if (is_25_ != null)
				is_46_[i_48_] = is_25_[i_50_];
			if (is_27_ != null)
				is_47_[i_48_] = is_27_[i_50_];
			i_48_++;
			is_40_[i_48_] = is[i_51_];
			is_41_[i_48_] = is_26_[i_51_];
			is_42_[i_48_] = is_31_[i_49_];
			is_43_[i_48_] = is_33_[i_49_];
			is_44_[i_48_] = is_34_[i_49_];
			if (is_32_ != null)
				is_45_[i_48_] = is_32_[i_49_];
			if (is_25_ != null)
				is_46_[i_48_] = is_25_[i_51_];
			if (is_27_ != null)
				is_47_[i_48_] = is_27_[i_51_];
			i_48_++;
			is_40_[i_48_] = is[i_52_];
			is_41_[i_48_] = is_26_[i_52_];
			is_42_[i_48_] = is_31_[i_49_];
			is_43_[i_48_] = is_33_[i_49_];
			is_44_[i_48_] = is_34_[i_49_];
			if (is_32_ != null)
				is_45_[i_48_] = is_32_[i_49_];
			if (is_25_ != null)
				is_46_[i_48_] = is_25_[i_52_];
			if (is_27_ != null)
				is_47_[i_48_] = is_27_[i_52_];
			i_48_++;
		}
		if (bool_35_ || is_45_ != null)
			ya(i, i_24_, is_40_, is_46_, is_41_, is_47_, is_42_, is_45_, is_43_, is_44_, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481, bool);
	}

	public void method6708(int i, int i_53_, int[] is, int[] is_54_, int[] is_55_, int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, int[] is_61_, int[] is_62_, int[] is_63_, Class90 class90, boolean bool) {
		boolean bool_64_ = false;
		if (is_60_ != null) {
			int[] is_65_ = is_60_;
			for (int i_66_ = 0; i_66_ < is_65_.length; i_66_++) {
				int i_67_ = is_65_[i_66_];
				if (i_67_ != -1) {
					bool_64_ = true;
					break;
				}
			}
		}
		int i_68_ = is_60_.length;
		int[] is_69_ = new int[i_68_ * 3];
		int[] is_70_ = new int[i_68_ * 3];
		int[] is_71_ = new int[i_68_ * 3];
		int[] is_72_ = new int[i_68_ * 3];
		int[] is_73_ = new int[i_68_ * 3];
		int[] is_74_ = is_61_ != null ? new int[i_68_ * 3] : null;
		int[] is_75_ = is_54_ != null ? new int[i_68_ * 3] : null;
		int[] is_76_ = is_56_ != null ? new int[i_68_ * 3] : null;
		int i_77_ = 0;
		for (int i_78_ = 0; i_78_ < i_68_; i_78_++) {
			int i_79_ = is_57_[i_78_];
			int i_80_ = is_58_[i_78_];
			int i_81_ = is_59_[i_78_];
			is_69_[i_77_] = is[i_79_];
			is_70_[i_77_] = is_55_[i_79_];
			is_71_[i_77_] = is_60_[i_78_];
			is_72_[i_77_] = is_62_[i_78_];
			is_73_[i_77_] = is_63_[i_78_];
			if (is_61_ != null)
				is_74_[i_77_] = is_61_[i_78_];
			if (is_54_ != null)
				is_75_[i_77_] = is_54_[i_79_];
			if (is_56_ != null)
				is_76_[i_77_] = is_56_[i_79_];
			i_77_++;
			is_69_[i_77_] = is[i_80_];
			is_70_[i_77_] = is_55_[i_80_];
			is_71_[i_77_] = is_60_[i_78_];
			is_72_[i_77_] = is_62_[i_78_];
			is_73_[i_77_] = is_63_[i_78_];
			if (is_61_ != null)
				is_74_[i_77_] = is_61_[i_78_];
			if (is_54_ != null)
				is_75_[i_77_] = is_54_[i_80_];
			if (is_56_ != null)
				is_76_[i_77_] = is_56_[i_80_];
			i_77_++;
			is_69_[i_77_] = is[i_81_];
			is_70_[i_77_] = is_55_[i_81_];
			is_71_[i_77_] = is_60_[i_78_];
			is_72_[i_77_] = is_62_[i_78_];
			is_73_[i_77_] = is_63_[i_78_];
			if (is_61_ != null)
				is_74_[i_77_] = is_61_[i_78_];
			if (is_54_ != null)
				is_75_[i_77_] = is_54_[i_81_];
			if (is_56_ != null)
				is_76_[i_77_] = is_56_[i_81_];
			i_77_++;
		}
		if (bool_64_ || is_74_ != null)
			ya(i, i_53_, is_69_, is_75_, is_70_, is_76_, is_71_, is_74_, is_72_, is_73_, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481, bool);
	}

	public void method6717(int i, int i_82_, int i_83_, boolean[][] bools, boolean bool, int i_84_) {
		int i_85_ = 0;
		float[] fs = new float[((i) this).aClass482_7143.method8069(-1374254477)];
		for (Class282_Sub24 class282_sub24 = ((Class282_Sub24) ((i) this).aClass482_7143.method8097((byte) 78)); class282_sub24 != null; class282_sub24 = ((Class282_Sub24) ((i) this).aClass482_7143.method8067(89434836)))
			fs[i_85_++] = class282_sub24.method12395(-730968094);
		t(fs);
		for (int i_86_ = 0; i_86_ < i_83_ + i_83_; i_86_++) {
			for (int i_87_ = 0; i_87_ < i_83_ + i_83_; i_87_++) {
				if (bools[i_86_][i_87_]) {
					int i_88_ = i - i_83_ + i_86_;
					int i_89_ = i_82_ - i_83_ + i_87_;
					if (i_88_ >= 0 && i_88_ < anInt4776 * -1843860823 && i_89_ >= 0 && i_89_ < anInt4773 * 1826078169)
						((i) this).aja7144.nx().method316(this, i_88_, i_89_);
				}
			}
		}
	}

	public void method6715(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, boolean[][] bools) {
		((i) this).aja7144.nx().method318(this, i, i_90_, i_91_, i_92_, i_93_, i_94_, i_95_, bools);
	}

	public native Class282_Sub50_Sub17 w(int i, int i_96_, Class282_Sub50_Sub17 class282_sub50_sub17);

	public native void UA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_97_, int i_98_, int i_99_, boolean bool);

	public native void NA(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_100_, int i_101_, int i_102_, boolean bool);

	public native void u(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_103_, int i_104_, int i_105_, boolean bool);

	public void method6713(Class282_Sub24 class282_sub24, int[] is) {
		((i) this).aClass482_7143.method8059(class282_sub24, 806761388);
		A(class282_sub24.hashCode(), class282_sub24.method12368((byte) -36), class282_sub24.method12369(1534020223), class282_sub24.method12394(1367026999), class282_sub24.method12370(-789603523), class282_sub24.method12371(-2137393590), is);
	}

	native void A(int i, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int[] is);

	native void t(float[] fs);

	public native void m(int i, int i_111_, int i_112_);

	public boolean method6718(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_113_, int i_114_, int i_115_, boolean bool) {
		return true;
	}

	public final void method6706(int i, int i_116_, int[] is, int[] is_117_, int[] is_118_, int[] is_119_, int[] is_120_, int[] is_121_, int[] is_122_, int[] is_123_, Class90 class90, boolean bool) {
		ya(i, i_116_, is, is_117_, is_118_, is_119_, is_120_, is_121_, is_122_, is_123_, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481, bool);
	}

	public native void p();

	public void finalize() {
		if (((i) this).nativeid != 0L)
			Class156.method2642(this, (byte) 91);
	}

	public void method6716(int i, int i_124_, int i_125_, boolean[][] bools, boolean bool, int i_126_) {
		int i_127_ = 0;
		float[] fs = new float[((i) this).aClass482_7143.method8069(-1374254477)];
		for (Class282_Sub24 class282_sub24 = ((Class282_Sub24) ((i) this).aClass482_7143.method8097((byte) 81)); class282_sub24 != null; class282_sub24 = (Class282_Sub24) ((i) this).aClass482_7143.method8067(-1062392884))
			fs[i_127_++] = class282_sub24.method12395(1226134811);
		t(fs);
		for (int i_128_ = 0; i_128_ < i_125_ + i_125_; i_128_++) {
			for (int i_129_ = 0; i_129_ < i_125_ + i_125_; i_129_++) {
				if (bools[i_128_][i_129_]) {
					int i_130_ = i - i_125_ + i_128_;
					int i_131_ = i_124_ - i_125_ + i_129_;
					if (i_130_ >= 0 && i_130_ < anInt4776 * -1843860823 && i_131_ >= 0 && i_131_ < anInt4773 * 1826078169)
						((i) this).aja7144.nx().method316(this, i_130_, i_131_);
				}
			}
		}
	}

	public native Class282_Sub50_Sub17 s(int i, int i_132_, Class282_Sub50_Sub17 class282_sub50_sub17);

	native void ya(int i, int i_133_, int[] is, int[] is_134_, int[] is_135_, int[] is_136_, int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_, int i_141_, int i_142_, int i_143_, boolean bool);

	public boolean method6712(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_144_, int i_145_, int i_146_, boolean bool) {
		return true;
	}

	public boolean method6719(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_147_, int i_148_, int i_149_, boolean bool) {
		return true;
	}

	public native void d(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_150_, int i_151_, int i_152_, boolean bool);

	public native void a(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_153_, int i_154_, int i_155_, boolean bool);

	public native void e();

	public native void ma(boolean bool);

	public void method6720(Class282_Sub24 class282_sub24, int[] is) {
		((i) this).aClass482_7143.method8059(class282_sub24, 93021309);
		A(class282_sub24.hashCode(), class282_sub24.method12368((byte) -36), class282_sub24.method12369(1534020223), class282_sub24.method12394(1861802480), class282_sub24.method12370(-789603523), class282_sub24.method12371(-2141041870), is);
	}

	public native void x(boolean bool);

	public void method6711(Class282_Sub24 class282_sub24, int[] is) {
		((i) this).aClass482_7143.method8059(class282_sub24, -1497714438);
		A(class282_sub24.hashCode(), class282_sub24.method12368((byte) -75), class282_sub24.method12369(1534020223), class282_sub24.method12394(1800255406), class282_sub24.method12370(-789603523), class282_sub24.method12371(-2136043298), is);
	}

	void method11610() {
		if (((i) this).nativeid != 0L)
			Class156.method2642(this, (byte) 48);
	}

	void method11611() {
		if (((i) this).nativeid != 0L)
			Class156.method2642(this, (byte) 69);
	}

	public void method6723(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, boolean[][] bools) {
		((i) this).aja7144.nx().method318(this, i, i_156_, i_157_, i_158_, i_159_, i_160_, i_161_, bools);
	}

	public native void b(Class282_Sub50_Sub17 class282_sub50_sub17, int i, int i_162_, int i_163_, int i_164_, boolean bool);

	public native void y(boolean bool);

	public native void SA();

	native void az(ja var_ja, ba var_ba, int i, int i_165_, int[][] is, int[][] is_166_, int i_167_, int i_168_, int i_169_);

	native void ax(int i, int i_170_, int[] is, int[] is_171_, int[] is_172_, int[] is_173_, int[] is_174_, int[] is_175_, int[] is_176_, int[] is_177_, int i_178_, int i_179_, int i_180_, boolean bool);

	i(ja var_ja, ba var_ba, int i, int i_181_, int[][] is, int[][] is_182_, int i_183_, int i_184_, int i_185_) {
		super(i, i_181_, i_183_, is);
		((i) this).aja7144 = var_ja;
		G(((i) this).aja7144, var_ba, i, i_181_, anIntArrayArray4772, is_182_, i_183_, i_184_, i_185_);
	}
}
