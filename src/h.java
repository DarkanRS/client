/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class h extends MeshRasterizer implements Interface40 {
	Class87[] aClass87Array7139;
	ja aja7140;
	ba aba7141;
	Class172[] aClass172Array7142;
	long nativeid;

	public void method11299(MeshRasterizer class528, int i, int i_0_, int i_1_, boolean bool) {
		((h) this).aja7140.nx().method313(this, class528, i, i_0_, i_1_, bool);
	}

	public native void aq(int i);

	native void U(ja var_ja, ba var_ba, int i, int i_2_, int[] is, int[] is_3_, int[] is_4_, int[] is_5_, short[] is_6_, int i_7_, short[] is_8_, short[] is_9_, short[] is_10_, byte[] is_11_, byte[] is_12_, byte[] is_13_, byte[] is_14_, short[] is_15_, short[] is_16_, int[] is_17_, byte i_18_, short[] is_19_, int i_20_, byte[] is_21_, short[] is_22_, short[] is_23_, short[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, byte[] is_28_, byte[] is_29_, int[] is_30_, int[] is_31_, int[] is_32_,
			int[] is_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int[] is_40_);

	native void ba(ja var_ja);

	public void finalize() {
		if (((h) this).nativeid != 0L)
			Class156.method2642(this, (byte) 111);
	}

	public native void ma(boolean bool);

	public void method11273(Matrix44Var class294) {
		method11604(ja.aa, class294);
		int i = 0;
		if (((h) this).aClass87Array7139 != null) {
			for (int i_41_ = 0; i_41_ < ((h) this).aClass87Array7139.length; i_41_++) {
				Class87 class87 = ((h) this).aClass87Array7139[i_41_];
				class87.anInt844 = ja.aa[i++] * -1929058355;
				class87.anInt841 = ja.aa[i++] * 996785411;
				class87.anInt847 = ja.aa[i++] * 976806429;
				class87.anInt834 = ja.aa[i++] * -458323579;
				class87.anInt843 = ja.aa[i++] * 543149547;
				class87.anInt845 = ja.aa[i++] * 1054448197;
				class87.anInt846 = ja.aa[i++] * 1348028043;
				class87.anInt840 = ja.aa[i++] * -1652520905;
				class87.anInt848 = ja.aa[i++] * 1757672349;
			}
		}
		if (((h) this).aClass172Array7142 != null) {
			for (int i_42_ = 0; i_42_ < ((h) this).aClass172Array7142.length; i_42_++) {
				Class172 class172 = ((h) this).aClass172Array7142[i_42_];
				Class172 class172_43_ = class172;
				if (class172.aClass172_2114 != null)
					class172_43_ = class172.aClass172_2114;
				if (class172.aClass384_2116 == null)
					class172.aClass384_2116 = new Matrix44Arr();
				class172.aClass384_2116.method6522(class294);
				class172_43_.anInt2113 = ja.aa[i++] * 959663283;
				class172_43_.anInt2117 = ja.aa[i++] * -1084180847;
				class172_43_.anInt2118 = ja.aa[i++] * -1221574613;
			}
		}
	}

	native void bo(int i, int i_44_, int i_45_, int i_46_);

	final void method11275(int i, int[] is, int i_47_, int i_48_, int i_49_, int i_50_, boolean bool) {
		J(((h) this).nativeid, i, is, i_47_, i_48_, i_49_, i_50_, bool);
	}

	native void BA(h var_h_51_, h var_h_52_, int i, boolean bool, boolean bool_53_);

	public native void KA(int i);

	public native int m();

	public void method11259() {
		/* empty */
	}

	public native int n();

	public native void bj(int i);

	public native Class282_Sub50_Sub17 da(Class282_Sub50_Sub17 class282_sub50_sub17);

	public native void EA(int i);

	public native void ia(int i, int i_54_, int i_55_);

	public native void wa();

	public native void oa(int i, int i_56_, int i_57_);

	public MeshRasterizer method11279(byte i, int i_58_, boolean bool) {
		return ((h) this).aja7140.nx().method325(this, i, i_58_, bool);
	}

	void method11260() {
		if (((ja) ((h) this).aja7140).as > 1) {
			synchronized (this) {
				while (aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7023 = true;
			}
		}
	}

	public native int ha();

	native boolean ea();

	h(ja var_ja, ba var_ba, RSMesh class157, int i, int i_59_, int i_60_, int i_61_) {
		((h) this).aja7140 = var_ja;
		((h) this).aba7141 = var_ba;
		((h) this).aClass87Array7139 = class157.aClass87Array2007;
		((h) this).aClass172Array7142 = class157.aClass172Array2008;
		int i_62_ = (class157.aClass87Array2007 == null ? 0 : class157.aClass87Array2007.length);
		int i_63_ = (class157.aClass172Array2008 == null ? 0 : class157.aClass172Array2008.length);
		int i_64_ = 0;
		int[] is = new int[i_62_ * 3 + i_63_];
		for (int i_65_ = 0; i_65_ < i_62_; i_65_++) {
			is[i_64_++] = ((h) this).aClass87Array7139[i_65_].anInt836 * -1572033967;
			is[i_64_++] = ((h) this).aClass87Array7139[i_65_].anInt837 * -1955014451;
			is[i_64_++] = ((h) this).aClass87Array7139[i_65_].anInt838 * -2135413869;
		}
		for (int i_66_ = 0; i_66_ < i_63_; i_66_++)
			is[i_64_++] = ((h) this).aClass172Array7142[i_66_].anInt2119 * -1382123871;
		int i_67_ = (class157.aClass84Array2009 == null ? 0 : class157.aClass84Array2009.length);
		int[] is_68_ = new int[i_67_ * 8];
		int i_69_ = 0;
		for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
			Class84 class84 = class157.aClass84Array2009[i_70_];
			Class347 class347 = Class417.method7005(class84.anInt812 * -221586257, -1672643937);
			is_68_[i_69_++] = class84.anInt809 * 2110152423;
			is_68_[i_69_++] = class347.anInt4054 * -1720863327;
			is_68_[i_69_++] = class347.anInt4050 * -743047207;
			is_68_[i_69_++] = class347.anInt4055 * 117872423;
			is_68_[i_69_++] = class347.anInt4057 * 1007428267;
			is_68_[i_69_++] = class347.anInt4051 * -920295177;
			is_68_[i_69_++] = class347.aBool4059 ? -1 : 0;
		}
		for (int i_71_ = 0; i_71_ < i_67_; i_71_++) {
			Class84 class84 = class157.aClass84Array2009[i_71_];
			is_68_[i_69_++] = class84.anInt811 * 1852505231;
		}
		U(((h) this).aja7140, ((h) this).aba7141, class157.anInt1974, class157.anInt1999, class157.anIntArray1976, class157.anIntArray2003, class157.anIntArray1978, class157.anIntArray2002, class157.aShortArray1980, class157.anInt1973, class157.aShortArray1982, class157.aShortArray1983, class157.aShortArray1984, class157.aByteArray1985, class157.aByteArray1977, class157.aByteArray1975, class157.aByteArray1988, class157.aShortArray2006, class157.aShortArray1993, class157.anIntArray1991,
				class157.aByte1994, class157.aShortArray1981, class157.anInt1979, class157.aByteArray1995, class157.aShortArray1996, class157.aShortArray1987, class157.aShortArray1998, class157.anIntArray1989, class157.anIntArray2000, class157.anIntArray2001, class157.aByteArray2005, class157.aByteArray1990, class157.anIntArray1992, class157.anIntArray1997, class157.anIntArray2004, is, i_62_, i_63_, i, i_59_, i_60_, i_61_, is_68_);
	}

	native void J(long l, int i, int[] is, int i_72_, int i_73_, int i_74_, int i_75_, boolean bool);

	native void e(int i, int[] is, int i_76_, int i_77_, int i_78_, boolean bool, int i_79_, int[] is_80_);

	public native void be();

	native void ka();

	public void method11263(Matrix44Var class294, int i, boolean bool) {
		Matrix44Arr class384 = ((a) ((h) this).aja7140.nx()).aClass384_51;
		class384.method6522(class294);
		aa(class384.buf, i, bool);
	}

	native void aa(float[] fs, int i, boolean bool);

	public native int co();

	public boolean method11270(int i, int i_81_, Matrix44Var class294, boolean bool, int i_82_) {
		return ((h) this).aja7140.nx().method335(this, i, i_81_, class294, bool);
	}

	public native void PA(int i, int i_83_, int i_84_, int i_85_);

	native void ft(ja var_ja);

	void method11603() {
		if (((h) this).nativeid != 0L)
			Class156.method2642(this, (byte) 7);
	}

	public native int cm();

	public native int ya();

	public native int YA();

	public native int o();

	public native int AA();

	public Class172[] method11331() {
		return ((h) this).aClass172Array7142;
	}

	native void IA(byte i, byte[] is);

	public native void Q(int i);

	void method11261() {
		if (((ja) ((h) this).aja7140).as > 1) {
			synchronized (this) {
				aBool7023 = false;
				this.notifyAll();
			}
		}
	}

	public void method11307(byte i, byte[] is) {
		IA(i, is);
	}

	public native byte[] aw();

	public native void X(short i, short i_86_);

	public void method11312(byte i, byte[] is) {
		IA(i, is);
	}

	public native byte[] cz();

	public native void W(short i, short i_87_);

	public void method11298(Matrix44Var class294, int i, boolean bool) {
		Matrix44Arr class384 = ((a) ((h) this).aja7140.nx()).aClass384_51;
		class384.method6522(class294);
		aa(class384.buf, i, bool);
	}

	public native int du();

	public native boolean i();

	public native boolean u();

	public Class87[] method11253() {
		return ((h) this).aClass87Array7139;
	}

	public Class172[] method11274() {
		return ((h) this).aClass172Array7142;
	}

	native boolean bv();

	public Class172[] method11302() {
		return ((h) this).aClass172Array7142;
	}

	public MeshRasterizer method11276(byte i, int i_88_, boolean bool) {
		return ((h) this).aja7140.nx().method325(this, i, i_88_, bool);
	}

	public MeshRasterizer method11277(byte i, int i_89_, boolean bool) {
		return ((h) this).aja7140.nx().method325(this, i, i_89_, bool);
	}

	public MeshRasterizer method11278(byte i, int i_90_, boolean bool) {
		return ((h) this).aja7140.nx().method325(this, i, i_90_, bool);
	}

	public native int cb();

	public MeshRasterizer method11296(byte i, int i_91_, boolean bool) {
		return ((h) this).aja7140.nx().method325(this, i, i_91_, bool);
	}

	public native int ar();

	public native int ae();

	public void method11282(Matrix44Var class294, Class275_Sub5 class275_sub5, int i) {
		if (class275_sub5 == null)
			((h) this).aja7140.nx().method314(this, class294, null, i);
		else {
			ja.ae[5] = 0;
			((h) this).aja7140.nx().method314(this, class294, ja.ae, i);
			class275_sub5.anInt7847 = ja.ae[0];
			class275_sub5.anInt7848 = ja.ae[1];
			class275_sub5.anInt7850 = ja.ae[2];
			class275_sub5.anInt7846 = ja.ae[3];
			class275_sub5.anInt7851 = ja.ae[4];
			class275_sub5.aBool7849 = ja.ae[5] != 0;
		}
	}

	public void method11295() {
		/* empty */
	}

	public native void bi(int i);

	public native void bw(int i);

	public native void bx(int i);

	public native void bz(int i);

	public native void p(int i);

	public native void bm(int i);

	public native void bs(int i);

	public native void bk(int i);

	native void bp();

	public native void bn(int i);

	public native int c();

	public native int cp();

	public native void bq();

	public native void y(boolean bool);

	void method11288() {
		if (((ja) ((h) this).aja7140).as > 1) {
			synchronized (this) {
				aBool7023 = false;
				this.notifyAll();
			}
		}
	}

	void method11604(int[] is, Matrix44Var class294) {
		((h) this).aja7140.nx().method331(this, is, class294);
	}

	public native Class282_Sub50_Sub17 ga(Class282_Sub50_Sub17 class282_sub50_sub17);

	native boolean bh();

	final void method11268(int i, int[] is, int i_92_, int i_93_, int i_94_, int i_95_, boolean bool) {
		J(((h) this).nativeid, i, is, i_92_, i_93_, i_94_, i_95_, bool);
	}

	public native void t(int i);

	native void bl(int i, int[] is, int i_96_, int i_97_, int i_98_, boolean bool, int i_99_, int[] is_100_);

	native void bb(int i, int i_101_, int i_102_, int i_103_);

	public native void by();

	public native void S(int i);

	public void method11290(Matrix44Var class294, int i, boolean bool) {
		Matrix44Arr class384 = ((a) ((h) this).aja7140.nx()).aClass384_51;
		class384.method6522(class294);
		aa(class384.buf, i, bool);
	}

	public void method11291(Matrix44Var class294, int i, boolean bool) {
		Matrix44Arr class384 = ((a) ((h) this).aja7140.nx()).aClass384_51;
		class384.method6522(class294);
		aa(class384.buf, i, bool);
	}

	h(ja var_ja) {
		((h) this).aja7140 = var_ja;
		((h) this).aba7141 = null;
		ba(var_ja);
	}

	public void method11293(Matrix44Var class294, Class275_Sub5 class275_sub5, int i) {
		if (class275_sub5 == null)
			((h) this).aja7140.nx().method314(this, class294, null, i);
		else {
			ja.ae[5] = 0;
			((h) this).aja7140.nx().method314(this, class294, ja.ae, i);
			class275_sub5.anInt7847 = ja.ae[0];
			class275_sub5.anInt7848 = ja.ae[1];
			class275_sub5.anInt7850 = ja.ae[2];
			class275_sub5.anInt7846 = ja.ae[3];
			class275_sub5.anInt7851 = ja.ae[4];
			class275_sub5.aBool7849 = ja.ae[5] != 0;
		}
	}

	public void method11315(Matrix44Var class294) {
		method11604(ja.aa, class294);
		int i = 0;
		if (((h) this).aClass87Array7139 != null) {
			for (int i_104_ = 0; i_104_ < ((h) this).aClass87Array7139.length; i_104_++) {
				Class87 class87 = ((h) this).aClass87Array7139[i_104_];
				class87.anInt844 = ja.aa[i++] * -1929058355;
				class87.anInt841 = ja.aa[i++] * 996785411;
				class87.anInt847 = ja.aa[i++] * 976806429;
				class87.anInt834 = ja.aa[i++] * -458323579;
				class87.anInt843 = ja.aa[i++] * 543149547;
				class87.anInt845 = ja.aa[i++] * 1054448197;
				class87.anInt846 = ja.aa[i++] * 1348028043;
				class87.anInt840 = ja.aa[i++] * -1652520905;
				class87.anInt848 = ja.aa[i++] * 1757672349;
			}
		}
		if (((h) this).aClass172Array7142 != null) {
			for (int i_105_ = 0; i_105_ < ((h) this).aClass172Array7142.length; i_105_++) {
				Class172 class172 = ((h) this).aClass172Array7142[i_105_];
				Class172 class172_106_ = class172;
				if (class172.aClass172_2114 != null)
					class172_106_ = class172.aClass172_2114;
				if (class172.aClass384_2116 == null)
					class172.aClass384_2116 = new Matrix44Arr();
				class172.aClass384_2116.method6522(class294);
				class172_106_.anInt2113 = ja.aa[i++] * 959663283;
				class172_106_.anInt2117 = ja.aa[i++] * -1084180847;
				class172_106_.anInt2118 = ja.aa[i++] * -1221574613;
			}
		}
	}

	public native int RA();

	public native int cv();

	native void w(int i, int i_107_, int i_108_, int i_109_);

	public native int cc();

	public native int ci();

	public native int ct();

	public native int cu();

	void method11308() {
		if (((ja) ((h) this).aja7140).as > 1) {
			synchronized (this) {
				while (aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7023 = true;
			}
		}
	}

	public native int cw();

	public boolean successful() {
		return true;
	}

	public native int ca();

	public MeshRasterizer method11289(byte i, int i_110_, boolean bool) {
		return ((h) this).aja7140.nx().method325(this, i, i_110_, bool);
	}

	public boolean method11286(int i, int i_111_, Matrix44Var class294, boolean bool, int i_112_) {
		return ((h) this).aja7140.nx().method335(this, i, i_111_, class294, bool);
	}

	public native int cd();

	public native void f(int i);

	public native void cr(int i);

	public native void bc(int i, int i_113_, Class390 class390, Class390 class390_114_, int i_115_, int i_116_, int i_117_);

	public native int ch();

	public native void cq(short i, short i_118_);

	public void method11269(MeshRasterizer class528, int i, int i_119_, int i_120_, boolean bool) {
		((h) this).aja7140.nx().method313(this, class528, i, i_119_, i_120_, bool);
	}

	public native void cy(int i, int i_121_, int i_122_, int i_123_);

	public Class87[] method11300() {
		return ((h) this).aClass87Array7139;
	}

	public native void bf(int i);

	public Class172[] method11283() {
		return ((h) this).aClass172Array7142;
	}

	public boolean method11303() {
		return true;
	}

	public native void dl(int i);

	public native boolean dh();

	void method11605() {
		if (((h) this).nativeid != 0L)
			Class156.method2642(this, (byte) 103);
	}

	public native int ck();

	public native int N();

	public native void dk(int i, int i_124_, int i_125_);

	public native int dy();

	public native int dm();

	public native int dp();

	public native void ep(int i, int i_126_, int i_127_);

	public native int dg();

	public native int dd();

	public native void di(short i, short i_128_);

	public native void df(short i, short i_129_);

	public native boolean dv();

	public native int Z();

	void method11301() {
		if (((ja) ((h) this).aja7140).as > 1) {
			synchronized (this) {
				while (aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7023 = true;
			}
		}
	}

	public boolean method11309(int i, int i_130_, Matrix44Var class294, boolean bool, int i_131_) {
		return ((h) this).aja7140.nx().method335(this, i, i_130_, class294, bool);
	}

	void method11285() {
		if (((ja) ((h) this).aja7140).as > 1) {
			synchronized (this) {
				aBool7023 = false;
				this.notifyAll();
			}
		}
	}

	public native Class282_Sub50_Sub17 dn(Class282_Sub50_Sub17 class282_sub50_sub17);

	public native void pa(int i, int i_132_, Class390 class390, Class390 class390_133_, int i_134_, int i_135_, int i_136_);

	public native Class282_Sub50_Sub17 dw(Class282_Sub50_Sub17 class282_sub50_sub17);

	public native Class282_Sub50_Sub17 dr(Class282_Sub50_Sub17 class282_sub50_sub17);

	public native void ce(int i);

	public native void x(boolean bool);

	native void fe(ja var_ja, ba var_ba, int i, int i_137_, int[] is, int[] is_138_, int[] is_139_, int[] is_140_, short[] is_141_, int i_142_, short[] is_143_, short[] is_144_, short[] is_145_, byte[] is_146_, byte[] is_147_, byte[] is_148_, byte[] is_149_, short[] is_150_, short[] is_151_, int[] is_152_, byte i_153_, short[] is_154_, int i_155_, byte[] is_156_, short[] is_157_, short[] is_158_, short[] is_159_, int[] is_160_, int[] is_161_, int[] is_162_, byte[] is_163_, byte[] is_164_,
			int[] is_165_, int[] is_166_, int[] is_167_, int[] is_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int[] is_175_);

	native void fk(ja var_ja, ba var_ba, int i, int i_176_, int[] is, int[] is_177_, int[] is_178_, int[] is_179_, short[] is_180_, int i_181_, short[] is_182_, short[] is_183_, short[] is_184_, byte[] is_185_, byte[] is_186_, byte[] is_187_, byte[] is_188_, short[] is_189_, short[] is_190_, int[] is_191_, byte i_192_, short[] is_193_, int i_194_, byte[] is_195_, short[] is_196_, short[] is_197_, short[] is_198_, int[] is_199_, int[] is_200_, int[] is_201_, byte[] is_202_, byte[] is_203_,
			int[] is_204_, int[] is_205_, int[] is_206_, int[] is_207_, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, int[] is_214_);

	native void fh(ja var_ja);

	public void method11294(Matrix44Var class294) {
		method11604(ja.aa, class294);
		int i = 0;
		if (((h) this).aClass87Array7139 != null) {
			for (int i_215_ = 0; i_215_ < ((h) this).aClass87Array7139.length; i_215_++) {
				Class87 class87 = ((h) this).aClass87Array7139[i_215_];
				class87.anInt844 = ja.aa[i++] * -1929058355;
				class87.anInt841 = ja.aa[i++] * 996785411;
				class87.anInt847 = ja.aa[i++] * 976806429;
				class87.anInt834 = ja.aa[i++] * -458323579;
				class87.anInt843 = ja.aa[i++] * 543149547;
				class87.anInt845 = ja.aa[i++] * 1054448197;
				class87.anInt846 = ja.aa[i++] * 1348028043;
				class87.anInt840 = ja.aa[i++] * -1652520905;
				class87.anInt848 = ja.aa[i++] * 1757672349;
			}
		}
		if (((h) this).aClass172Array7142 != null) {
			for (int i_216_ = 0; i_216_ < ((h) this).aClass172Array7142.length; i_216_++) {
				Class172 class172 = ((h) this).aClass172Array7142[i_216_];
				Class172 class172_217_ = class172;
				if (class172.aClass172_2114 != null)
					class172_217_ = class172.aClass172_2114;
				if (class172.aClass384_2116 == null)
					class172.aClass384_2116 = new Matrix44Arr();
				class172.aClass384_2116.method6522(class294);
				class172_217_.anInt2113 = ja.aa[i++] * 959663283;
				class172_217_.anInt2117 = ja.aa[i++] * -1084180847;
				class172_217_.anInt2118 = ja.aa[i++] * -1221574613;
			}
		}
	}

	void method11606(int[] is, Matrix44Var class294) {
		((h) this).aja7140.nx().method331(this, is, class294);
	}

	void method11607(int[] is, Matrix44Var class294) {
		((h) this).aja7140.nx().method331(this, is, class294);
	}

	void method11608(int[] is, Matrix44Var class294) {
		((h) this).aja7140.nx().method331(this, is, class294);
	}

	void method11609(int[] is, Matrix44Var class294) {
		((h) this).aja7140.nx().method331(this, is, class294);
	}

	native void fg(h var_h_218_, h var_h_219_, int i, boolean bool, boolean bool_220_);

	native void fz(long l, int i, int[] is, int i_221_, int i_222_, int i_223_, int i_224_, boolean bool);

	native void fp(long l, int i, int[] is, int i_225_, int i_226_, int i_227_, int i_228_, boolean bool);

	native void fb(long l, int i, int[] is, int i_229_, int i_230_, int i_231_, int i_232_, boolean bool);

	native void fv(long l, int i, int[] is, int i_233_, int i_234_, int i_235_, int i_236_, boolean bool);

	public native int dq();

	native void ff(byte i, byte[] is);

	native void fr(byte i, byte[] is);

	native void fw(byte i, byte[] is);

	public void method11292(Matrix44Var class294, int i, boolean bool) {
		Matrix44Arr class384 = ((a) ((h) this).aja7140.nx()).aClass384_51;
		class384.method6522(class294);
		aa(class384.buf, i, bool);
	}
}
