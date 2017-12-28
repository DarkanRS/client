
/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class ja extends Class505 implements Interface40 {
	static final int ah = 4;
	long nativeid;
	static final int ad = 24573;
	Class482 au;
	int ac;
	int at;
	Class384 af;
	static int[] bi;
	Class294 ay;
	static int[] bx;
	ba z;
	Class384 aw;
	float az;
	float ax;
	Class384 an;
	float al;
	int as;
	a[] ai;
	Class294 ag;
	static final int aj = 104;
	static final int am = 20;
	static int[] ab = new int[Math.max(Math.max(104, 20), 24573)];
	Class384 ao;
	static byte[] bj;
	static float[] ar = new float[20];
	static int[] ae = new int[6];
	static int[] aq = ab;
	static float[] av = ar;
	static int[] aa = ab;
	boolean bm;
	static int[] bw;
	float ap;
	static short[] bz;
	boolean b = false;
	static final int ak = 20;

	native void op(za var_za);

	native void q(Interface22 interface22, int i, int i_0_);

	public void method8618(Class282_Sub1 class282_sub1) {
		((ja) this).z = (ba) class282_sub1;
		n(class282_sub1);
	}

	native void R(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class455 class455, int i_6_, int i_7_);

	public boolean method8489() {
		return true;
	}

	native void Y(int i);

	public boolean method8649() {
		return false;
	}

	native void Q(int i, int[] is, float[] fs);

	Object WA() {
		return new aa(this);
	}

	native void wa(float[] fs);

	public synchronized void finalize() {
		method8396(-710252687);
		if (((ja) this).nativeid != 0L)
			Class156.method2642(this, (byte) 14);
	}

	public native void ib(int i, int i_8_, int i_9_);

	void h() {
		System.gc();
		System.runFinalization();
		Class156.method2652((byte) -83);
	}

	public boolean method8464() {
		return false;
	}

	native void ol(int i, int i_10_, int i_11_, int i_12_);

	void method8485() {
		if (!((ja) this).b) {
			((ja) this).ai = null;
			((ja) this).z = null;
			((ja) this).af = null;
			for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 89); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(-58113197))
				var_ba.ha();
			((ja) this).au.method8118(-971959284);
			da();
			if (((ja) this).bm) {
				Class13.method508(false, true, -167551249);
				((ja) this).bm = false;
			}
			h();
			Class156.method2644(-1556051265);
			((ja) this).b = true;
		}
	}

	public Class294 method8458() {
		return ((ja) this).ay;
	}

	public native void RA(boolean bool);

	public void method8395() {
		/* empty */
	}

	public void method8488(int i) {
		Class156.method2652((byte) 46);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 32); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(-980125304))
			var_ba.u();
	}

	public void method8398(int i) {
		Class156.method2652((byte) 42);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 99); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(1815060892))
			var_ba.u();
	}

	public native int za();

	public Class160 method8442(int[] is, int i, int i_13_, int i_14_, int i_15_, boolean bool) {
		return new fa(this, is, i, i_13_, i_14_, i_15_, false);
	}

	public boolean method8465() {
		return true;
	}

	public boolean method8664() {
		return true;
	}

	public boolean method8403() {
		return false;
	}

	public boolean method8404() {
		return false;
	}

	public void method8479(float f, float f_16_, float f_17_, float[] fs) {
		float f_18_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * f + ((ja) this).aw.aFloatArray4667[7] * f_16_ + ((ja) this).aw.aFloatArray4667[11] * f_17_);
		float f_19_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * f + ((ja) this).aw.aFloatArray4667[4] * f_16_ + ((ja) this).aw.aFloatArray4667[8] * f_17_);
		float f_20_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * f + ((ja) this).aw.aFloatArray4667[5] * f_16_ + ((ja) this).aw.aFloatArray4667[9] * f_17_);
		float f_21_ = (((ja) this).ao.aFloatArray4667[14] + ((ja) this).ao.aFloatArray4667[2] * f + ((ja) this).ao.aFloatArray4667[6] * f_16_ + ((ja) this).ao.aFloatArray4667[10] * f_17_);
		fs[0] = ((ja) this).ax + ((ja) this).az * f_19_ / f_18_;
		fs[1] = ((ja) this).al + ((ja) this).ap * f_20_ / f_18_;
		fs[2] = f_21_;
	}

	public native void fl(int i, int i_22_, int i_23_, int i_24_, int i_25_);

	public native void jf();

	public boolean method8454() {
		return true;
	}

	public boolean method8407() {
		return true;
	}

	public int method8463() {
		return 4;
	}

	public void method8480(boolean bool) {
		/* empty */
	}

	public native void hi(int i, Class455 class455, int i_26_, int i_27_);

	public void method8420() {
		/* empty */
	}

	Class158_Sub2 method8417(Canvas canvas, int i, int i_28_) {
		return new za(this, canvas, i, i_28_);
	}

	native void PA(za var_za);

	native void d(long l, long l_29_);

	public void method8421() {
		((ja) this).az = (float) method8523((byte) 109).method2714() / 2.0F;
		((ja) this).ap = (float) method8523((byte) 123).method2716() / 2.0F;
		((ja) this).ax = ((ja) this).az;
		((ja) this).al = ((ja) this).ap;
		k();
	}

	public native void iw(int i, float f, float f_30_, float f_31_, float f_32_, float f_33_);

	public void method8617(int i, int i_34_, int i_35_, int i_36_) {
		((ja) this).az = (float) i_35_ / 2.0F;
		((ja) this).ap = (float) i_36_ / 2.0F;
		((ja) this).ax = (float) i + ((ja) this).az;
		((ja) this).al = (float) i_34_ + ((ja) this).ap;
		A(i, i_34_, i_35_, i_36_);
	}

	native void A(int i, int i_37_, int i_38_, int i_39_);

	public Class384 method8587() {
		return ((ja) this).an;
	}

	public native void L();

	public native void r(int i, int i_40_, int i_41_, int i_42_);

	public void method8542(Class282_Sub1 class282_sub1) {
		((ja) this).z = (ba) class282_sub1;
		n(class282_sub1);
	}

	public native void qa(int[] is);

	public native void ba(int i, int i_43_);

	public void method8430(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		XA(i, i_44_, i_45_, i_47_, i_48_);
		XA(i, i_44_ + i_46_ - 1, i_45_, i_47_, i_48_);
		G(i, i_44_ + 1, i_46_ - 1, i_47_, i_48_);
		G(i + i_45_ - 1, i_44_ + 1, i_46_ - 1, i_47_, i_48_);
	}

	public native void B(int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_);

	public native void N(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, byte[] is, int i_59_, int i_60_);

	public void method8658(int i, int i_61_, float f, int i_62_, int i_63_, float f_64_, int i_65_, int i_66_, float f_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
		throw new IllegalStateException();
	}

	public native void XA(int i, int i_72_, int i_73_, int i_74_, int i_75_);

	public native void G(int i, int i_76_, int i_77_, int i_78_, int i_79_);

	public void method8433(int i, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		YA(i, i_80_, i_81_, i_82_, i_83_, i_84_);
	}

	public boolean method8402() {
		return true;
	}

	native void CA(int i, int i_85_, int i_86_, int i_87_, int i_88_);

	public void method8496(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_) {
		nx().method311(this, i, i_89_, i_90_, i_91_, i_92_, i_93_, i_94_);
	}

	public void method8669(int i, int i_95_, int i_96_, int i_97_, int i_98_, int i_99_, Class455 class455, int i_100_, int i_101_) {
		R(i, i_95_, i_96_, i_97_, i_98_, i_99_, class455, i_100_, i_101_);
	}

	public void method8435(int i, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_) {
		/* empty */
	}

	public int method8437(int i, int i_110_, int i_111_, int i_112_, int i_113_, int i_114_) {
		int i_115_ = 0;
		float f = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i + ((ja) this).aw.aFloatArray4667[6] * (float) i_110_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_111_);
		float f_116_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i_112_ + ((ja) this).aw.aFloatArray4667[6] * (float) i_113_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_114_);
		float f_117_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i + ((ja) this).aw.aFloatArray4667[7] * (float) i_110_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_111_);
		float f_118_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i_112_ + ((ja) this).aw.aFloatArray4667[7] * (float) i_113_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_114_);
		if (f < -f_117_ && f_116_ < -f_118_)
			i_115_ |= 0x10;
		else if (f > f_117_ && f_116_ > f_118_)
			i_115_ |= 0x20;
		float f_119_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i + ((ja) this).aw.aFloatArray4667[4] * (float) i_110_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_111_);
		float f_120_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i_112_ + ((ja) this).aw.aFloatArray4667[4] * (float) i_113_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_114_);
		if (f_119_ < -f_117_ && f_120_ < -f_118_)
			i_115_ |= 0x1;
		if (f_119_ > f_117_ && f_120_ > f_118_)
			i_115_ |= 0x2;
		float f_121_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i + ((ja) this).aw.aFloatArray4667[5] * (float) i_110_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_111_);
		float f_122_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i_112_ + ((ja) this).aw.aFloatArray4667[5] * (float) i_113_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_114_);
		if (f_121_ < -f_117_ && f_122_ < -f_118_)
			i_115_ |= 0x4;
		if (f_121_ > f_117_ && f_122_ > f_118_)
			i_115_ |= 0x8;
		return i_115_;
	}

	public boolean method8406() {
		return true;
	}

	public void method8515(float f, float f_123_, float f_124_, float[] fs) {
		float f_125_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * f + ((ja) this).aw.aFloatArray4667[6] * f_123_ + ((ja) this).aw.aFloatArray4667[10] * f_124_);
		float f_126_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * f + ((ja) this).aw.aFloatArray4667[7] * f_123_ + ((ja) this).aw.aFloatArray4667[11] * f_124_);
		if (f_125_ < -f_126_ || f_125_ > f_126_) {
			float[] fs_127_ = fs;
			float[] fs_128_ = fs;
			fs[2] = Float.NaN;
			fs_128_[1] = Float.NaN;
			fs_127_[0] = Float.NaN;
		} else {
			float f_129_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * f + ((ja) this).aw.aFloatArray4667[4] * f_123_ + ((ja) this).aw.aFloatArray4667[8] * f_124_);
			if (f_129_ < -f_126_ || f_129_ > f_126_) {
				float[] fs_130_ = fs;
				float[] fs_131_ = fs;
				fs[2] = Float.NaN;
				fs_131_[1] = Float.NaN;
				fs_130_[0] = Float.NaN;
			} else {
				float f_132_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * f + ((ja) this).aw.aFloatArray4667[5] * f_123_ + ((ja) this).aw.aFloatArray4667[9] * f_124_);
				if (f_132_ < -f_126_ || f_132_ > f_126_) {
					float[] fs_133_ = fs;
					float[] fs_134_ = fs;
					fs[2] = Float.NaN;
					fs_134_[1] = Float.NaN;
					fs_133_[0] = Float.NaN;
				} else {
					float f_135_ = (((ja) this).ao.aFloatArray4667[14] + ((ja) this).ao.aFloatArray4667[2] * f + ((ja) this).ao.aFloatArray4667[6] * f_123_ + ((ja) this).ao.aFloatArray4667[10] * f_124_);
					fs[0] = ((ja) this).ax + ((ja) this).az * f_129_ / f_126_;
					fs[1] = ((ja) this).al + ((ja) this).ap * f_132_ / f_126_;
					fs[2] = f_135_;
				}
			}
		}
	}

	public Class282_Sub1 method8438(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).au.method8059(var_ba, 753628503);
		return var_ba;
	}

	public void method8439(Class282_Sub1 class282_sub1) {
		((ja) this).z = (ba) class282_sub1;
		n(class282_sub1);
	}

	public Class160 method8654(int i, int i_136_, boolean bool, boolean bool_137_) {
		return new fa(this, i, i_136_, bool_137_);
	}

	public native void x(boolean bool);

	public boolean method8431() {
		return false;
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub1(this);
	}

	public boolean method8462() {
		return false;
	}

	public native void DA(int i, Class455 class455, int i_138_, int i_139_);

	public Class8 method8448(Class414 class414, Class91[] class91s, boolean bool) {
		int[] is = new int[class91s.length];
		int[] is_140_ = new int[class91s.length];
		boolean bool_141_ = false;
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].anInt957;
			is_140_[i] = class91s[i].anInt954;
			if (class91s[i].aByteArray961 != null)
				bool_141_ = true;
		}
		if (bool) {
			if (bool_141_)
				return new ea(this, ((ja) this).z, class414, class91s, null);
			return new m(this, ((ja) this).z, class414, class91s, null);
		}
		if (bool_141_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).z, class414, class91s, null);
	}

	public void method8459(int i) {
		((ja) this).ac = ((ja) this).at = i;
		if (((ja) this).as > 1)
			throw new IllegalStateException();
		nu(((ja) this).as);
		ni(0);
	}

	public Class528 method8451(Class157 class157, int i, int i_142_, int i_143_, int i_144_) {
		return new h(this, ((ja) this).z, class157, i, i_142_, i_143_, i_144_);
	}

	public int method8452(int i, int i_145_) {
		int i_146_ = i & 0xfffff;
		int i_147_ = i_145_ & 0xfffff;
		return i_146_ & i_147_ ^ i_147_;
	}

	public Class152 method8636(int i, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_) {
		return null;
	}

	public native void ej(float f, float f_153_);

	public boolean method8405() {
		return false;
	}

	public boolean method8399() {
		return true;
	}

	void nu(int i) {
		((ja) this).as = i;
		((ja) this).ai = new a[((ja) this).as];
		for (int i_154_ = 0; i_154_ < ((ja) this).as; i_154_++)
			((ja) this).ai[i_154_] = new a(this, ((ja) this).ac, ((ja) this).at);
	}

	void ni(int i) {
		((ja) this).ai[i].method307();
	}

	a nx() {
		for (int i = 0; i < ((ja) this).as; i++) {
			if (((a) ((ja) this).ai[i]).aRunnable48 == Thread.currentThread())
				return ((ja) this).ai[i];
		}
		return null;
	}

	public void method8456(Class151 class151) {
		if (class151.aClass464_1961.method7736(-1292124716) != 0) {
			ny(class151, false);
			nx().method309(this, bi, bw, bx, bz, class151.aClass464_1961.method7736(-1336234189));
		}
	}

	public void method8457(Class294 class294) {
		((ja) this).ay = class294;
		((ja) this).ao.method6522(class294);
		AA(((ja) this).ao.aFloatArray4667);
		((ja) this).aw.method6568(((ja) this).ao, ((ja) this).an);
	}

	native void oo();

	native void AA(float[] fs);

	public void method8424(Class384 class384) {
		((ja) this).an = class384;
		wa(((ja) this).an.aFloatArray4667);
		((ja) this).aw.method6568(((ja) this).ao, ((ja) this).an);
	}

	public boolean method8503() {
		return true;
	}

	public Class384 method8453() {
		return ((ja) this).an;
	}

	public native void IA(float f);

	public native void m(int i, float f, float f_155_, float f_156_, float f_157_, float f_158_);

	public native void J(int i);

	native void YA(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_);

	synchronized void method8622() {
		method8396(324933011);
		if (((ja) this).nativeid != 0L)
			Class156.method2642(this, (byte) 82);
	}

	public void method8547(int i, Class282_Sub24[] class282_sub24s) {
		int i_164_ = 0;
		for (int i_165_ = 0; i_165_ < i; i_165_++) {
			aq[i_164_++] = class282_sub24s[i_165_].method12368((byte) -85);
			aq[i_164_++] = class282_sub24s[i_165_].method12369(1534020223);
			aq[i_164_++] = class282_sub24s[i_165_].method12394(1398342512);
			aq[i_164_++] = class282_sub24s[i_165_].method12370(-789603523);
			av[i_165_] = class282_sub24s[i_165_].method12395(314107586);
			aq[i_164_++] = class282_sub24s[i_165_].method12371(-2144091834);
		}
		Q(i, aq, av);
	}

	public void method8568(boolean bool) {
		/* empty */
	}

	public Class152 method8466(int i, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_) {
		return null;
	}

	void method8596(int i, int i_171_) throws Exception_Sub3 {
		za var_za = (za) method8460(-1390159861);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method14353(i, i_171_);
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-1828555261);
	}

	public void method8477(Class152 class152) {
		/* empty */
	}

	public void method8525(int i, int i_172_, int i_173_, int i_174_) {
		/* empty */
	}

	void ob(int i) {
		((ja) this).as = i;
		((ja) this).ai = new a[((ja) this).as];
		for (int i_175_ = 0; i_175_ < ((ja) this).as; i_175_++)
			((ja) this).ai[i_175_] = new a(this, ((ja) this).ac, ((ja) this).at);
	}

	public boolean method8469() {
		return false;
	}

	public void method8490() {
		/* empty */
	}

	public boolean method8471() {
		return false;
	}

	void method8592(float f, float f_176_, float f_177_, float f_178_, float f_179_, float f_180_) {
		/* empty */
	}

	public native int di();

	native void JA(int i, int i_181_, int i_182_, int i_183_);

	native void M(int i, int i_184_, int i_185_, int i_186_);

	public final void method8475(int i, Class90 class90) {
		M(i, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481);
	}

	public Class455 method8553(int i, int i_187_, int[] is, int[] is_188_) {
		return new wa(this, ((ja) this).z, i, i_187_, is, is_188_);
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub1(this);
	}

	public Interface8 method8419(int i, int i_189_) {
		return new oa(i, i_189_);
	}

	static {
		bi = ab;
		bw = new int[8191];
		bx = new int[8191];
		bz = new short[8191];
		bj = new byte[8191];
	}

	public Class168 method8481() {
		return new Class168(0, "SSE", 1, "CPU", 0L);
	}

	public void method8634() {
		((ja) this).az = (float) method8523((byte) 126).method2714() / 2.0F;
		((ja) this).ap = (float) method8523((byte) 117).method2716() / 2.0F;
		((ja) this).ax = ((ja) this).az;
		((ja) this).al = ((ja) this).ap;
		k();
	}

	public void method8483() {
		/* empty */
	}

	public void method8484() {
		/* empty */
	}

	void method8531() {
		if (!((ja) this).b) {
			((ja) this).ai = null;
			((ja) this).z = null;
			((ja) this).af = null;
			for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 79); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(1077527555))
				var_ba.ha();
			((ja) this).au.method8118(-239422644);
			da();
			if (((ja) this).bm) {
				Class13.method508(false, true, -803268356);
				((ja) this).bm = false;
			}
			h();
			Class156.method2644(-1800082140);
			((ja) this).b = true;
		}
	}

	public void method8445() {
		/* empty */
	}

	public final void method8476(int i, Class90 class90) {
		JA(i, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481);
	}

	void method8555(int i, int i_190_) throws Exception_Sub3 {
		za var_za = (za) method8460(-323567179);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method14353(i, i_190_);
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-2129499905);
	}

	native void F(short i, int[] is, short i_191_, int i_192_, byte i_193_, byte i_194_, int i_195_, boolean bool, byte i_196_, byte i_197_, byte i_198_, byte i_199_, boolean bool_200_, boolean bool_201_, boolean bool_202_, boolean bool_203_, boolean bool_204_, byte i_205_, boolean bool_206_, boolean bool_207_, int i_208_);

	public native void fi(int i, int i_209_);

	public Class160 method8668(int i, int i_210_, int i_211_, int i_212_, boolean bool) {
		return new fa(this, i, i_210_, i_211_, i_212_, !bool);
	}

	public native int df();

	public ja(Canvas canvas, Interface22 interface22, int i, int i_213_) {
		super(interface22);
		((ja) this).nativeid = 0L;
		((ja) this).au = new Class482();
		((ja) this).ac = 4096;
		((ja) this).at = 4096;
		((ja) this).bm = false;
		try {
			if (!Class362.method6278(616047582).method222("sw3d", -1251324674))
				throw new RuntimeException("");
			Class156.method2643((byte) 53);
			q(anInterface22_5834, anInterface22_5834.method84(-670973656), 0);
			Class38.method854(false, true, -1602514184);
			((ja) this).bm = true;
			((ja) this).af = new Class384();
			new Class385();
			((ja) this).ag = new Class294();
			new Class381();
			((ja) this).ao = new Class384();
			((ja) this).an = new Class384();
			((ja) this).aw = new Class384();
			method8457(new Class294());
			method8424(new Class384());
			nu(1);
			ni(0);
			if (canvas != null) {
				method8524(canvas, i, i_213_, (byte) -69);
				method8412(canvas, (byte) 8);
			}
			int i_214_ = anInterface22_5834.method84(-670973656);
			for (short i_215_ = 0; i_215_ < i_214_; i_215_++) {
				Class169 class169 = anInterface22_5834.method144(i_215_, -2075826193);
				if (class169 != null)
					V(i_215_, class169.aShort2073, class169.anInt2074 * 1960017665, class169.aByte2064, class169.aByte2076, class169.anInt2077 * 1385119855, class169.aBool2065, class169.aByte2079, class169.aByte2080, class169.aByte2081, class169.aByte2090, class169.aBool2056, class169.aBool2072, class169.aBool2087, class169.aBool2086, class169.aBool2059, class169.aByte2088, class169.aBool2089, class169.aBool2082, class169.anInt2091 * 1436865495);
			}
		} catch (Throwable throwable) {
			method8396(1670288083);
			throw new RuntimeException();
		}
	}

	public Class384 method8449() {
		return ((ja) this).af;
	}

	native void n(Class282_Sub1 class282_sub1);

	public boolean method8528() {
		return true;
	}

	public boolean method8492() {
		return true;
	}

	public void method8415(int i, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_) {
		YA(i, i_216_, i_217_, i_218_, i_219_, i_220_);
	}

	public native int dv();

	public final void method8616(int i, Class90 class90) {
		JA(i, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481);
	}

	public void method8613() {
		/* empty */
	}

	public void method8487(int i) {
		Class156.method2652((byte) 4);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 58); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(951552583))
			var_ba.u();
	}

	public boolean method8644() {
		return false;
	}

	public boolean method8498() {
		return true;
	}

	public boolean method8578() {
		return false;
	}

	public void method8602() {
		/* empty */
	}

	public boolean method8501() {
		return false;
	}

	public boolean method8502() {
		return true;
	}

	public Class384 method8517() {
		return ((ja) this).af;
	}

	public native void hz(int i, Class455 class455, int i_221_, int i_222_);

	public boolean method8504() {
		return true;
	}

	public native void iz(float f);

	Class158_Sub2 method8558(Canvas canvas, int i, int i_223_) {
		return new za(this, canvas, i, i_223_);
	}

	public Class282_Sub1 method8570(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).au.method8059(var_ba, 486534140);
		return var_ba;
	}

	public native void ff(int i, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_, byte[] is, int i_229_, int i_230_);

	public void method8497() {
		/* empty */
	}

	public native void eq(boolean bool);

	native void og(float[] fs);

	void method8397() {
		if (!((ja) this).b) {
			((ja) this).ai = null;
			((ja) this).z = null;
			((ja) this).af = null;
			for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 16); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(1772121447))
				var_ba.ha();
			((ja) this).au.method8118(183026123);
			da();
			if (((ja) this).bm) {
				Class13.method508(false, true, -819132543);
				((ja) this).bm = false;
			}
			h();
			Class156.method2644(-1363354475);
			((ja) this).b = true;
		}
	}

	public native void en(float f, float f_231_);

	public final void method8585(int i, Class90 class90) {
		M(i, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481);
	}

	public native void ez();

	public native void eh();

	public native void fk(int i, int i_232_, int i_233_, int i_234_);

	public void method8514(int i, int i_235_, int i_236_, int i_237_) {
		((ja) this).az = (float) i_236_ / 2.0F;
		((ja) this).ap = (float) i_237_ / 2.0F;
		((ja) this).ax = (float) i + ((ja) this).az;
		((ja) this).al = (float) i_235_ + ((ja) this).ap;
		A(i, i_235_, i_236_, i_237_);
	}

	public native void fe(int i, int i_238_, int i_239_, int i_240_);

	public native int[] ab(int i, int i_241_, int i_242_, int i_243_);

	public native void fh(int[] is);

	public native void ft(int[] is);

	public native void fd(int i, int i_244_);

	public native void fu(int i, int i_245_);

	public void method8563(int i, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_, Class455 class455, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_) {
		/* empty */
	}

	public native void ma(boolean bool);

	void ny(Class151 class151, boolean bool) {
		int i = 0;
		int i_256_ = 0;
		int i_257_ = 0;
		int i_258_ = 0;
		int i_259_ = 0;
		for (Class275_Sub1_Sub1 class275_sub1_sub1 = ((Class275_Sub1_Sub1) class151.aClass464_1961.method7731(1278936127)); class275_sub1_sub1 != null; class275_sub1_sub1 = ((Class275_Sub1_Sub1) class151.aClass464_1961.method7734((byte) -107))) {
			bi[i++] = class275_sub1_sub1.anInt10205;
			bi[i++] = class275_sub1_sub1.anInt10208;
			bi[i++] = class275_sub1_sub1.anInt10202;
			bw[i_256_++] = class275_sub1_sub1.anInt10209;
			bz[i_258_++] = (short) class275_sub1_sub1.anInt10207;
			bx[i_257_++] = class275_sub1_sub1.anInt10206;
			if (bool)
				bj[i_259_++] = class275_sub1_sub1.aByte10211;
		}
	}

	native void oq(float[] fs);

	public native void fp(int i, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_);

	public native void fb(int i, int i_265_, int i_266_, int i_267_, int i_268_, int i_269_);

	public void method8627(int i, int i_270_, float f, int i_271_, int i_272_, float f_273_, int i_274_, int i_275_, float f_276_, int i_277_, int i_278_, int i_279_, int i_280_) {
		throw new IllegalStateException();
	}

	native void da();

	native void fr(int i, int i_281_, int i_282_, int i_283_, int i_284_);

	public Class152 method8467(Class152 class152, Class152 class152_285_, float f, Class152 class152_286_) {
		return null;
	}

	public native void fs(int i, int i_287_, int i_288_, int i_289_, int i_290_);

	public native void fq(int i, int i_291_, int i_292_, int i_293_, int i_294_);

	public native void fo(int i, int i_295_, int i_296_, int i_297_, int i_298_);

	public native void fv(int i, int i_299_, int i_300_, int i_301_, int i_302_, int i_303_, byte[] is, int i_304_, int i_305_);

	public Class8 method8660(Class414 class414, Class91[] class91s, boolean bool) {
		int[] is = new int[class91s.length];
		int[] is_306_ = new int[class91s.length];
		boolean bool_307_ = false;
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].anInt957;
			is_306_[i] = class91s[i].anInt954;
			if (class91s[i].aByteArray961 != null)
				bool_307_ = true;
		}
		if (bool) {
			if (bool_307_)
				return new ea(this, ((ja) this).z, class414, class91s, null);
			return new m(this, ((ja) this).z, class414, class91s, null);
		}
		if (bool_307_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).z, class414, class91s, null);
	}

	public void method8526(int i, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_) {
		YA(i, i_308_, i_309_, i_310_, i_311_, i_312_);
	}

	public void method8527(int i, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_) {
		/* empty */
	}

	public void method8494(int i, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, int i_328_) {
		/* empty */
	}

	native void oj(int i, int i_329_, int i_330_, int i_331_);

	public void method8573(float f, float f_332_, float f_333_, float[] fs) {
		float f_334_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * f + ((ja) this).aw.aFloatArray4667[7] * f_332_ + ((ja) this).aw.aFloatArray4667[11] * f_333_);
		float f_335_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * f + ((ja) this).aw.aFloatArray4667[4] * f_332_ + ((ja) this).aw.aFloatArray4667[8] * f_333_);
		float f_336_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * f + ((ja) this).aw.aFloatArray4667[5] * f_332_ + ((ja) this).aw.aFloatArray4667[9] * f_333_);
		float f_337_ = (((ja) this).ao.aFloatArray4667[14] + ((ja) this).ao.aFloatArray4667[2] * f + ((ja) this).ao.aFloatArray4667[6] * f_332_ + ((ja) this).ao.aFloatArray4667[10] * f_333_);
		fs[0] = ((ja) this).ax + ((ja) this).az * f_335_ / f_334_;
		fs[1] = ((ja) this).al + ((ja) this).ap * f_336_ / f_334_;
		fs[2] = f_337_;
	}

	public void method8520(int i, int i_338_, int i_339_, int i_340_, int i_341_, int i_342_) {
		XA(i, i_338_, i_339_, i_341_, i_342_);
		XA(i, i_338_ + i_340_ - 1, i_339_, i_341_, i_342_);
		G(i, i_338_ + 1, i_340_ - 1, i_341_, i_342_);
		G(i + i_339_ - 1, i_338_ + 1, i_340_ - 1, i_341_, i_342_);
	}

	public void method8532(int i, int i_343_, int i_344_, int i_345_, int i_346_, int i_347_, Class455 class455, int i_348_, int i_349_) {
		R(i, i_343_, i_344_, i_345_, i_346_, i_347_, class455, i_348_, i_349_);
	}

	public void method8533(int i, int i_350_, int i_351_, int i_352_, int i_353_, int i_354_, Class455 class455, int i_355_, int i_356_) {
		R(i, i_350_, i_351_, i_352_, i_353_, i_354_, class455, i_355_, i_356_);
	}

	public void method8575(int i, int i_357_, int i_358_, int i_359_, int i_360_, int i_361_, Class455 class455, int i_362_, int i_363_) {
		R(i, i_357_, i_358_, i_359_, i_360_, i_361_, class455, i_362_, i_363_);
	}

	public void method8535(int i, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_, Class455 class455, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_) {
		/* empty */
	}

	public native void c(int i, int i_374_, int i_375_);

	public int method8537(int i, int i_376_, int i_377_, int i_378_, int i_379_, int i_380_) {
		int i_381_ = 0;
		float f = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i + ((ja) this).aw.aFloatArray4667[6] * (float) i_376_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_377_);
		float f_382_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i_378_ + ((ja) this).aw.aFloatArray4667[6] * (float) i_379_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_380_);
		float f_383_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i + ((ja) this).aw.aFloatArray4667[7] * (float) i_376_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_377_);
		float f_384_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i_378_ + ((ja) this).aw.aFloatArray4667[7] * (float) i_379_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_380_);
		if (f < -f_383_ && f_382_ < -f_384_)
			i_381_ |= 0x10;
		else if (f > f_383_ && f_382_ > f_384_)
			i_381_ |= 0x20;
		float f_385_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i + ((ja) this).aw.aFloatArray4667[4] * (float) i_376_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_377_);
		float f_386_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i_378_ + ((ja) this).aw.aFloatArray4667[4] * (float) i_379_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_380_);
		if (f_385_ < -f_383_ && f_386_ < -f_384_)
			i_381_ |= 0x1;
		if (f_385_ > f_383_ && f_386_ > f_384_)
			i_381_ |= 0x2;
		float f_387_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i + ((ja) this).aw.aFloatArray4667[5] * (float) i_376_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_377_);
		float f_388_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i_378_ + ((ja) this).aw.aFloatArray4667[5] * (float) i_379_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_380_);
		if (f_387_ < -f_383_ && f_388_ < -f_384_)
			i_381_ |= 0x4;
		if (f_387_ > f_383_ && f_388_ > f_384_)
			i_381_ |= 0x8;
		return i_381_;
	}

	public int method8538(int i, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_) {
		int i_394_ = 0;
		float f = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i + ((ja) this).aw.aFloatArray4667[6] * (float) i_389_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_390_);
		float f_395_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i_391_ + ((ja) this).aw.aFloatArray4667[6] * (float) i_392_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_393_);
		float f_396_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i + ((ja) this).aw.aFloatArray4667[7] * (float) i_389_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_390_);
		float f_397_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i_391_ + ((ja) this).aw.aFloatArray4667[7] * (float) i_392_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_393_);
		if (f < -f_396_ && f_395_ < -f_397_)
			i_394_ |= 0x10;
		else if (f > f_396_ && f_395_ > f_397_)
			i_394_ |= 0x20;
		float f_398_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i + ((ja) this).aw.aFloatArray4667[4] * (float) i_389_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_390_);
		float f_399_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i_391_ + ((ja) this).aw.aFloatArray4667[4] * (float) i_392_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_393_);
		if (f_398_ < -f_396_ && f_399_ < -f_397_)
			i_394_ |= 0x1;
		if (f_398_ > f_396_ && f_399_ > f_397_)
			i_394_ |= 0x2;
		float f_400_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i + ((ja) this).aw.aFloatArray4667[5] * (float) i_389_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_390_);
		float f_401_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i_391_ + ((ja) this).aw.aFloatArray4667[5] * (float) i_392_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_393_);
		if (f_400_ < -f_396_ && f_401_ < -f_397_)
			i_394_ |= 0x4;
		if (f_400_ > f_396_ && f_401_ > f_397_)
			i_394_ |= 0x8;
		return i_394_;
	}

	public int method8539(int i, int i_402_, int i_403_, int i_404_, int i_405_, int i_406_) {
		int i_407_ = 0;
		float f = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i + ((ja) this).aw.aFloatArray4667[6] * (float) i_402_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_403_);
		float f_408_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i_404_ + ((ja) this).aw.aFloatArray4667[6] * (float) i_405_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_406_);
		float f_409_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i + ((ja) this).aw.aFloatArray4667[7] * (float) i_402_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_403_);
		float f_410_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i_404_ + ((ja) this).aw.aFloatArray4667[7] * (float) i_405_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_406_);
		if (f < -f_409_ && f_408_ < -f_410_)
			i_407_ |= 0x10;
		else if (f > f_409_ && f_408_ > f_410_)
			i_407_ |= 0x20;
		float f_411_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i + ((ja) this).aw.aFloatArray4667[4] * (float) i_402_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_403_);
		float f_412_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i_404_ + ((ja) this).aw.aFloatArray4667[4] * (float) i_405_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_406_);
		if (f_411_ < -f_409_ && f_412_ < -f_410_)
			i_407_ |= 0x1;
		if (f_411_ > f_409_ && f_412_ > f_410_)
			i_407_ |= 0x2;
		float f_413_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i + ((ja) this).aw.aFloatArray4667[5] * (float) i_402_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_403_);
		float f_414_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i_404_ + ((ja) this).aw.aFloatArray4667[5] * (float) i_405_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_406_);
		if (f_413_ < -f_409_ && f_414_ < -f_410_)
			i_407_ |= 0x4;
		if (f_413_ > f_409_ && f_414_ > f_410_)
			i_407_ |= 0x8;
		return i_407_;
	}

	public int method8540(int i, int i_415_, int i_416_, int i_417_, int i_418_, int i_419_) {
		int i_420_ = 0;
		float f = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i + ((ja) this).aw.aFloatArray4667[6] * (float) i_415_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_416_);
		float f_421_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * (float) i_417_ + ((ja) this).aw.aFloatArray4667[6] * (float) i_418_ + ((ja) this).aw.aFloatArray4667[10] * (float) i_419_);
		float f_422_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i + ((ja) this).aw.aFloatArray4667[7] * (float) i_415_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_416_);
		float f_423_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * (float) i_417_ + ((ja) this).aw.aFloatArray4667[7] * (float) i_418_ + ((ja) this).aw.aFloatArray4667[11] * (float) i_419_);
		if (f < -f_422_ && f_421_ < -f_423_)
			i_420_ |= 0x10;
		else if (f > f_422_ && f_421_ > f_423_)
			i_420_ |= 0x20;
		float f_424_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i + ((ja) this).aw.aFloatArray4667[4] * (float) i_415_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_416_);
		float f_425_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * (float) i_417_ + ((ja) this).aw.aFloatArray4667[4] * (float) i_418_ + ((ja) this).aw.aFloatArray4667[8] * (float) i_419_);
		if (f_424_ < -f_422_ && f_425_ < -f_423_)
			i_420_ |= 0x1;
		if (f_424_ > f_422_ && f_425_ > f_423_)
			i_420_ |= 0x2;
		float f_426_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i + ((ja) this).aw.aFloatArray4667[5] * (float) i_415_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_416_);
		float f_427_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * (float) i_417_ + ((ja) this).aw.aFloatArray4667[5] * (float) i_418_ + ((ja) this).aw.aFloatArray4667[9] * (float) i_419_);
		if (f_426_ < -f_422_ && f_427_ < -f_423_)
			i_420_ |= 0x4;
		if (f_426_ > f_422_ && f_427_ > f_423_)
			i_420_ |= 0x8;
		return i_420_;
	}

	public void method8598(Class152 class152) {
		/* empty */
	}

	public native void o(int i, int i_428_, int i_429_, int i_430_);

	public int method8565(int i, int i_431_) {
		int i_432_ = i & 0xfffff;
		int i_433_ = i_431_ & 0xfffff;
		return i_432_ & i_433_ ^ i_433_;
	}

	native void on(int i, int i_434_, int i_435_, int i_436_);

	public void method8544(Class282_Sub1 class282_sub1) {
		((ja) this).z = (ba) class282_sub1;
		n(class282_sub1);
	}

	public native void GA(float f, float f_437_);

	public Class160 method8577(int i, int i_438_, boolean bool, boolean bool_439_) {
		return new fa(this, i, i_438_, bool_439_);
	}

	public Class160 method8543(int[] is, int i, int i_440_, int i_441_, int i_442_, boolean bool) {
		return new fa(this, is, i, i_440_, i_441_, i_442_, false);
	}

	public Class160 method8548(int[] is, int i, int i_443_, int i_444_, int i_445_, boolean bool) {
		return new fa(this, is, i, i_443_, i_444_, i_445_, false);
	}

	public Class160 method8612(Class91 class91, boolean bool) {
		fa var_fa = new fa(this, class91.anIntArray955, class91.aByteArray960, class91.aByteArray961, 0, class91.anInt957, class91.anInt957, class91.anInt954);
		var_fa.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return var_fa;
	}

	public Class160 method8518(Class91 class91, boolean bool) {
		fa var_fa = new fa(this, class91.anIntArray955, class91.aByteArray960, class91.aByteArray961, 0, class91.anInt957, class91.anInt957, class91.anInt954);
		var_fa.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return var_fa;
	}

	public Class160 method8604(int i, int i_446_, int i_447_, int i_448_, boolean bool) {
		return new fa(this, i, i_446_, i_447_, i_448_, !bool);
	}

	public Class160 method8552(int i, int i_449_, int i_450_, int i_451_, boolean bool) {
		return new fa(this, i, i_449_, i_450_, i_451_, !bool);
	}

	public void method8513(int i, int i_452_, int i_453_, int i_454_) {
		((ja) this).az = (float) i_453_ / 2.0F;
		((ja) this).ap = (float) i_454_ / 2.0F;
		((ja) this).ax = (float) i + ((ja) this).az;
		((ja) this).al = (float) i_452_ + ((ja) this).ap;
		A(i, i_452_, i_453_, i_454_);
	}

	public void method8584(Class152 class152) {
		/* empty */
	}

	public Class455 method8427(int i, int i_455_, int[] is, int[] is_456_) {
		return new wa(this, ((ja) this).z, i, i_455_, is, is_456_);
	}

	public Class455 method8556(int i, int i_457_, int[] is, int[] is_458_) {
		return new wa(this, ((ja) this).z, i, i_457_, is, is_458_);
	}

	public void method8511(int i, int i_459_, int i_460_, int i_461_, int i_462_, int i_463_) {
		XA(i, i_459_, i_460_, i_462_, i_463_);
		XA(i, i_459_ + i_461_ - 1, i_460_, i_462_, i_463_);
		G(i, i_459_ + 1, i_461_ - 1, i_462_, i_463_);
		G(i + i_460_ - 1, i_459_ + 1, i_461_ - 1, i_462_, i_463_);
	}

	public void method8601() {
		/* empty */
	}

	native void nn(int i, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_);

	public boolean method8679() {
		return false;
	}

	public Class8 method8625(Class414 class414, Class91[] class91s, boolean bool) {
		int[] is = new int[class91s.length];
		int[] is_469_ = new int[class91s.length];
		boolean bool_470_ = false;
		for (int i = 0; i < class91s.length; i++) {
			is[i] = class91s[i].anInt957;
			is_469_[i] = class91s[i].anInt954;
			if (class91s[i].aByteArray961 != null)
				bool_470_ = true;
		}
		if (bool) {
			if (bool_470_)
				return new ea(this, ((ja) this).z, class414, class91s, null);
			return new m(this, ((ja) this).z, class414, class91s, null);
		}
		if (bool_470_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).z, class414, class91s, null);
	}

	public void method8559(int i) {
		((ja) this).ac = ((ja) this).at = i;
		if (((ja) this).as > 1)
			throw new IllegalStateException();
		nu(((ja) this).as);
		ni(0);
	}

	public void method8560(int i) {
		((ja) this).ac = ((ja) this).at = i;
		if (((ja) this).as > 1)
			throw new IllegalStateException();
		nu(((ja) this).as);
		ni(0);
	}

	public Class528 method8561(Class157 class157, int i, int i_471_, int i_472_, int i_473_) {
		return new h(this, ((ja) this).z, class157, i, i_471_, i_472_, i_473_);
	}

	public Class528 method8623(Class157 class157, int i, int i_474_, int i_475_, int i_476_) {
		return new h(this, ((ja) this).z, class157, i, i_474_, i_475_, i_476_);
	}

	public Class528 method8505(Class157 class157, int i, int i_477_, int i_478_, int i_479_) {
		return new h(this, ((ja) this).z, class157, i, i_477_, i_478_, i_479_);
	}

	public Class528 method8564(Class157 class157, int i, int i_480_, int i_481_, int i_482_) {
		return new h(this, ((ja) this).z, class157, i, i_480_, i_481_, i_482_);
	}

	public void method8635() {
		((ja) this).az = (float) method8523((byte) 126).method2714() / 2.0F;
		((ja) this).ap = (float) method8523((byte) 107).method2716() / 2.0F;
		((ja) this).ax = ((ja) this).az;
		((ja) this).al = ((ja) this).ap;
		k();
	}

	public int method8566(int i, int i_483_) {
		int i_484_ = i & 0xfffff;
		int i_485_ = i_483_ & 0xfffff;
		return i_484_ & i_485_ ^ i_485_;
	}

	public int method8567(int i, int i_486_) {
		int i_487_ = i & 0xfffff;
		int i_488_ = i_486_ & 0xfffff;
		return i_487_ & i_488_ ^ i_488_;
	}

	public int method8443(int i, int i_489_) {
		int i_490_ = i & 0xfffff;
		int i_491_ = i_489_ & 0xfffff;
		return i_490_ & i_491_ ^ i_491_;
	}

	public Class390 method8569(int i, int i_492_, int[][] is, int[][] is_493_, int i_494_, int i_495_, int i_496_) {
		return new i(this, ((ja) this).z, i, i_492_, is, is_493_, i_494_, i_495_, i_496_);
	}

	public Class282_Sub1 method8541(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).au.method8059(var_ba, -818600578);
		return var_ba;
	}

	public Class384 method8571() {
		return ((ja) this).af;
	}

	public Class294 method8572() {
		return ((ja) this).ag;
	}

	public Class294 method8626() {
		return ((ja) this).ag;
	}

	public int method8574() {
		return 4;
	}

	public void method8394(int i, Class282_Sub24[] class282_sub24s) {
		int i_497_ = 0;
		for (int i_498_ = 0; i_498_ < i; i_498_++) {
			aq[i_497_++] = class282_sub24s[i_498_].method12368((byte) -43);
			aq[i_497_++] = class282_sub24s[i_498_].method12369(1534020223);
			aq[i_497_++] = class282_sub24s[i_498_].method12394(1467681691);
			aq[i_497_++] = class282_sub24s[i_498_].method12370(-789603523);
			av[i_498_] = class282_sub24s[i_498_].method12395(-608600459);
			aq[i_497_++] = class282_sub24s[i_498_].method12371(-2146406856);
		}
		Q(i, aq, av);
	}

	public void method8426(int i, Class282_Sub24[] class282_sub24s) {
		int i_499_ = 0;
		for (int i_500_ = 0; i_500_ < i; i_500_++) {
			aq[i_499_++] = class282_sub24s[i_500_].method12368((byte) -50);
			aq[i_499_++] = class282_sub24s[i_500_].method12369(1534020223);
			aq[i_499_++] = class282_sub24s[i_500_].method12394(1428101811);
			aq[i_499_++] = class282_sub24s[i_500_].method12370(-789603523);
			av[i_500_] = class282_sub24s[i_500_].method12395(434198990);
			aq[i_499_++] = class282_sub24s[i_500_].method12371(-2135372215);
		}
		Q(i, aq, av);
	}

	public void method8629(int i, int i_501_, float f, int i_502_, int i_503_, float f_504_, int i_505_, int i_506_, float f_507_, int i_508_, int i_509_, int i_510_, int i_511_) {
		throw new IllegalStateException();
	}

	public void method8580(Class151 class151) {
		if (class151.aClass464_1961.method7736(-756134032) != 0) {
			ny(class151, false);
			nx().method309(this, bi, bw, bx, bz, class151.aClass464_1961.method7736(-1766385205));
		}
	}

	public void method8581(Class151 class151) {
		if (class151.aClass464_1961.method7736(-419803619) != 0) {
			ny(class151, false);
			nx().method309(this, bi, bw, bx, bz, class151.aClass464_1961.method7736(-1679034596));
		}
	}

	public void method8423(Class294 class294) {
		((ja) this).ay = class294;
		((ja) this).ao.method6522(class294);
		AA(((ja) this).ao.aFloatArray4667);
		((ja) this).aw.method6568(((ja) this).ao, ((ja) this).an);
	}

	public Class294 method8583() {
		return ((ja) this).ay;
	}

	public Class294 method8685() {
		return ((ja) this).ay;
	}

	public void method8446(Class384 class384) {
		((ja) this).an = class384;
		wa(((ja) this).an.aFloatArray4667);
		((ja) this).aw.method6568(((ja) this).ao, ((ja) this).an);
	}

	public void method8586(Class384 class384) {
		((ja) this).an = class384;
		wa(((ja) this).an.aFloatArray4667);
		((ja) this).aw.method6568(((ja) this).ao, ((ja) this).an);
	}

	public native void is(int i, int i_512_, int i_513_);

	public Class384 method8588() {
		return ((ja) this).an;
	}

	public Class384 method8589() {
		return ((ja) this).an;
	}

	public Class384 method8590() {
		return ((ja) this).an;
	}

	native void k();

	public boolean method8674() {
		return true;
	}

	public void method8519(int i, int i_514_, int i_515_, int i_516_, int i_517_, int i_518_) {
		XA(i, i_514_, i_515_, i_517_, i_518_);
		XA(i, i_514_ + i_516_ - 1, i_515_, i_517_, i_518_);
		G(i, i_514_ + 1, i_516_ - 1, i_517_, i_518_);
		G(i + i_515_ - 1, i_514_ + 1, i_516_ - 1, i_517_, i_518_);
	}

	public native void im(int i, float f, float f_519_, float f_520_, float f_521_, float f_522_);

	public native void iq(int i);

	public native void il(int i);

	public native void ii(int i);

	public void method8507() {
		/* empty */
	}

	public native void ik(int i, int i_523_, int i_524_);

	public Class160 method8461(int i, int i_525_, boolean bool, boolean bool_526_) {
		return new fa(this, i, i_525_, bool_526_);
	}

	public void method8594(boolean bool) {
		/* empty */
	}

	public void method8595(boolean bool) {
		/* empty */
	}

	public Class152 method8557(Class152 class152, Class152 class152_527_, float f, Class152 class152_528_) {
		return null;
	}

	native void fw(int i, int i_529_, int i_530_, int i_531_, int i_532_);

	public Class390 method8478(int i, int i_533_, int[][] is, int[][] is_534_, int i_535_, int i_536_, int i_537_) {
		return new i(this, ((ja) this).z, i, i_533_, is, is_534_, i_535_, i_536_, i_537_);
	}

	public boolean method8628() {
		return false;
	}

	public boolean method8600() {
		return false;
	}

	public Class160 method8444(Class91 class91, boolean bool) {
		fa var_fa = new fa(this, class91.anIntArray955, class91.aByteArray960, class91.aByteArray961, 0, class91.anInt957, class91.anInt957, class91.anInt954);
		var_fa.method2743(class91.anInt956, class91.anInt959, class91.anInt958, class91.anInt953);
		return var_fa;
	}

	public void method8491(boolean bool) {
		/* empty */
	}

	public void method8521() {
		/* empty */
	}

	public Class168 method8392() {
		return new Class168(0, "SSE", 1, "CPU", 0L);
	}

	public boolean method8605() {
		return false;
	}

	public boolean method8606() {
		return false;
	}

	public boolean method8607() {
		return false;
	}

	public boolean method8614() {
		return true;
	}

	native void ou(long l, long l_538_);

	public void method8603(int i, int i_539_, int i_540_, int i_541_) {
		/* empty */
	}

	public void method8611() {
		/* empty */
	}

	public void method8691() {
		/* empty */
	}

	public native int dd();

	native void oi(int i, int i_542_, int i_543_, int i_544_);

	public final void method8615(int i, Class90 class90) {
		JA(i, class90.anInt946 * 1152775735, class90.anInt945 * 973144081, class90.anInt947 * -732614481);
	}

	native void V(short i, short i_545_, int i_546_, byte i_547_, byte i_548_, int i_549_, boolean bool, byte i_550_, byte i_551_, byte i_552_, byte i_553_, boolean bool_554_, boolean bool_555_, boolean bool_556_, boolean bool_557_, boolean bool_558_, byte i_559_, boolean bool_560_, boolean bool_561_, int i_562_);

	public void method8474() {
		/* empty */
	}

	public void method8536(int i, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_, int i_568_) {
		nx().method311(this, i, i_563_, i_564_, i_565_, i_566_, i_567_, i_568_);
	}

	public void method8650(float f, float f_569_, float f_570_, float[] fs) {
		float f_571_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * f + ((ja) this).aw.aFloatArray4667[7] * f_569_ + ((ja) this).aw.aFloatArray4667[11] * f_570_);
		float f_572_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * f + ((ja) this).aw.aFloatArray4667[4] * f_569_ + ((ja) this).aw.aFloatArray4667[8] * f_570_);
		float f_573_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * f + ((ja) this).aw.aFloatArray4667[5] * f_569_ + ((ja) this).aw.aFloatArray4667[9] * f_570_);
		float f_574_ = (((ja) this).ao.aFloatArray4667[14] + ((ja) this).ao.aFloatArray4667[2] * f + ((ja) this).ao.aFloatArray4667[6] * f_569_ + ((ja) this).ao.aFloatArray4667[10] * f_570_);
		fs[0] = ((ja) this).ax + ((ja) this).az * f_572_ / f_571_;
		fs[1] = ((ja) this).al + ((ja) this).ap * f_573_ / f_571_;
		fs[2] = f_574_;
	}

	public void method8619(float f, float f_575_, float f_576_, float[] fs) {
		float f_577_ = (((ja) this).aw.aFloatArray4667[14] + ((ja) this).aw.aFloatArray4667[2] * f + ((ja) this).aw.aFloatArray4667[6] * f_575_ + ((ja) this).aw.aFloatArray4667[10] * f_576_);
		float f_578_ = (((ja) this).aw.aFloatArray4667[15] + ((ja) this).aw.aFloatArray4667[3] * f + ((ja) this).aw.aFloatArray4667[7] * f_575_ + ((ja) this).aw.aFloatArray4667[11] * f_576_);
		if (f_577_ < -f_578_ || f_577_ > f_578_) {
			float[] fs_579_ = fs;
			float[] fs_580_ = fs;
			fs[2] = Float.NaN;
			fs_580_[1] = Float.NaN;
			fs_579_[0] = Float.NaN;
		} else {
			float f_581_ = (((ja) this).aw.aFloatArray4667[12] + ((ja) this).aw.aFloatArray4667[0] * f + ((ja) this).aw.aFloatArray4667[4] * f_575_ + ((ja) this).aw.aFloatArray4667[8] * f_576_);
			if (f_581_ < -f_578_ || f_581_ > f_578_) {
				float[] fs_582_ = fs;
				float[] fs_583_ = fs;
				fs[2] = Float.NaN;
				fs_583_[1] = Float.NaN;
				fs_582_[0] = Float.NaN;
			} else {
				float f_584_ = (((ja) this).aw.aFloatArray4667[13] + ((ja) this).aw.aFloatArray4667[1] * f + ((ja) this).aw.aFloatArray4667[5] * f_575_ + ((ja) this).aw.aFloatArray4667[9] * f_576_);
				if (f_584_ < -f_578_ || f_584_ > f_578_) {
					float[] fs_585_ = fs;
					float[] fs_586_ = fs;
					fs[2] = Float.NaN;
					fs_586_[1] = Float.NaN;
					fs_585_[0] = Float.NaN;
				} else {
					float f_587_ = (((ja) this).ao.aFloatArray4667[14] + ((ja) this).ao.aFloatArray4667[2] * f + ((ja) this).ao.aFloatArray4667[6] * f_575_ + ((ja) this).ao.aFloatArray4667[10] * f_576_);
					fs[0] = ((ja) this).ax + ((ja) this).az * f_581_ / f_578_;
					fs[1] = ((ja) this).al + ((ja) this).ap * f_584_ / f_578_;
					fs[2] = f_587_;
				}
			}
		}
	}

	public void method8576(int i, int i_588_, int i_589_, int i_590_, int i_591_, int i_592_, Class455 class455, int i_593_, int i_594_) {
		R(i, i_588_, i_589_, i_590_, i_591_, i_592_, class455, i_593_, i_594_);
	}

	public Interface8 method8621(int i, int i_595_) {
		return new oa(i, i_595_);
	}

	public Class294 method8450() {
		return ((ja) this).ag;
	}

	synchronized void method8550() {
		method8396(1076945318);
		if (((ja) this).nativeid != 0L)
			Class156.method2642(this, (byte) 127);
	}

	public boolean method8609() {
		return true;
	}

	public native int[] kh(int i, int i_596_, int i_597_, int i_598_);

	public native int[] ke(int i, int i_599_, int i_600_, int i_601_);

	public native int[] kf(int i, int i_602_, int i_603_, int i_604_);

	public native void fm(int i, int i_605_, int i_606_, int i_607_);

	public void method8516(int i, int i_608_, float f, int i_609_, int i_610_, float f_611_, int i_612_, int i_613_, float f_614_, int i_615_, int i_616_, int i_617_, int i_618_) {
		throw new IllegalStateException();
	}

	void method8608(float f, float f_619_, float f_620_, float f_621_, float f_622_, float f_623_) {
		/* empty */
	}

	public int method8630(int i, int i_624_) {
		return i | i_624_;
	}

	public int method8434(int i, int i_625_) {
		return i | i_625_;
	}

	public int method8632(int i, int i_626_) {
		return i | i_626_;
	}

	public void method8633() {
		((ja) this).az = (float) method8523((byte) 123).method2714() / 2.0F;
		((ja) this).ap = (float) method8523((byte) 117).method2716() / 2.0F;
		((ja) this).ax = ((ja) this).az;
		((ja) this).al = ((ja) this).ap;
		k();
	}

	public native void hr(int i, Class455 class455, int i_627_, int i_628_);

	public void method8579(int i, Class282_Sub24[] class282_sub24s) {
		int i_629_ = 0;
		for (int i_630_ = 0; i_630_ < i; i_630_++) {
			aq[i_629_++] = class282_sub24s[i_630_].method12368((byte) 98);
			aq[i_629_++] = class282_sub24s[i_630_].method12369(1534020223);
			aq[i_629_++] = class282_sub24s[i_630_].method12394(1424765190);
			aq[i_629_++] = class282_sub24s[i_630_].method12370(-789603523);
			av[i_630_] = class282_sub24s[i_630_].method12395(-1021578073);
			aq[i_629_++] = class282_sub24s[i_630_].method12371(-2136942824);
		}
		Q(i, aq, av);
	}

	public native void y(boolean bool);

	public native void fc(int i, int i_631_, int i_632_, int i_633_);

	native void ng(Interface22 interface22, int i, int i_634_);

	public void method8530(int i, int i_635_, int i_636_, int i_637_, int i_638_, int i_639_, int i_640_, int i_641_, int i_642_) {
		/* empty */
	}

	native void nc(int i, int i_643_, int i_644_, int i_645_, int i_646_, int i_647_);

	void method8486() {
		if (!((ja) this).b) {
			((ja) this).ai = null;
			((ja) this).z = null;
			((ja) this).af = null;
			for (ba var_ba = (ba) ((ja) this).au.method8097((byte) 41); var_ba != null; var_ba = (ba) ((ja) this).au.method8067(476144881))
				var_ba.ha();
			((ja) this).au.method8118(1098204001);
			da();
			if (((ja) this).bm) {
				Class13.method508(false, true, 1235757139);
				((ja) this).bm = false;
			}
			h();
			Class156.method2644(-902098068);
			((ja) this).b = true;
		}
	}

	native void nz(int i);

	native void nm(Class282_Sub1 class282_sub1);

	native void nd(Class282_Sub1 class282_sub1);

	native void nj(Class282_Sub1 class282_sub1);

	native void nf(int i, int[] is, float[] fs);

	native void nr(short i, int[] is, short i_648_, int i_649_, byte i_650_, byte i_651_, int i_652_, boolean bool, byte i_653_, byte i_654_, byte i_655_, byte i_656_, boolean bool_657_, boolean bool_658_, boolean bool_659_, boolean bool_660_, boolean bool_661_, byte i_662_, boolean bool_663_, boolean bool_664_, int i_665_);

	native void ns(short i, int[] is, short i_666_, int i_667_, byte i_668_, byte i_669_, int i_670_, boolean bool, byte i_671_, byte i_672_, byte i_673_, byte i_674_, boolean bool_675_, boolean bool_676_, boolean bool_677_, boolean bool_678_, boolean bool_679_, byte i_680_, boolean bool_681_, boolean bool_682_, int i_683_);

	native void nw(short i, int[] is, short i_684_, int i_685_, byte i_686_, byte i_687_, int i_688_, boolean bool, byte i_689_, byte i_690_, byte i_691_, byte i_692_, boolean bool_693_, boolean bool_694_, boolean bool_695_, boolean bool_696_, boolean bool_697_, byte i_698_, boolean bool_699_, boolean bool_700_, int i_701_);

	void oz(Class151 class151, boolean bool) {
		int i = 0;
		int i_702_ = 0;
		int i_703_ = 0;
		int i_704_ = 0;
		int i_705_ = 0;
		for (Class275_Sub1_Sub1 class275_sub1_sub1 = ((Class275_Sub1_Sub1) class151.aClass464_1961.method7731(717952124)); class275_sub1_sub1 != null; class275_sub1_sub1 = ((Class275_Sub1_Sub1) class151.aClass464_1961.method7734((byte) -35))) {
			bi[i++] = class275_sub1_sub1.anInt10205;
			bi[i++] = class275_sub1_sub1.anInt10208;
			bi[i++] = class275_sub1_sub1.anInt10202;
			bw[i_702_++] = class275_sub1_sub1.anInt10209;
			bz[i_704_++] = (short) class275_sub1_sub1.anInt10207;
			bx[i_703_++] = class275_sub1_sub1.anInt10206;
			if (bool)
				bj[i_705_++] = class275_sub1_sub1.aByte10211;
		}
	}

	native void ow(za var_za);

	public void method8673(int i, int i_706_, int i_707_, int i_708_) {
		/* empty */
	}

	native void os(za var_za);

	public boolean method8599() {
		return false;
	}

	native void or();

	native void oe();

	public native void O();

	native void of(int i, int i_709_, int i_710_, int i_711_);

	public int method8546(int i, int i_712_) {
		return i | i_712_;
	}

	public Class455 method8624(int i, int i_713_, int[] is, int[] is_714_) {
		return new wa(this, ((ja) this).z, i, i_713_, is, is_714_);
	}

	native void ov(int i, int i_715_, int i_716_, int i_717_);

	void om(int i) {
		((ja) this).as = i;
		((ja) this).ai = new a[((ja) this).as];
		for (int i_718_ = 0; i_718_ < ((ja) this).as; i_718_++)
			((ja) this).ai[i_718_] = new a(this, ((ja) this).ac, ((ja) this).at);
	}

	boolean SA(short i) {
		synchronized (anInterface22_5834) {
			Class169 class169 = anInterface22_5834.method144(i, -1791476176);
			if (class169 == null) {
				boolean bool = false;
				return bool;
			}
			if (!anInterface22_5834.method139(i, -930341706)) {
				boolean bool = false;
				return bool;
			}
			int[] is;
			if (class169.anInt2074 * 1960017665 != 2)
				is = anInterface22_5834.method140(i, 0.7F, 128, 128, true, (byte) 66);
			else
				is = anInterface22_5834.method141(i, 0.7F, 128, 128, true, -42875303);
			F(i, is, class169.aShort2073, class169.anInt2074 * 1960017665, class169.aByte2064, class169.aByte2076, class169.anInt2077 * 1385119855, class169.aBool2065, class169.aByte2079, class169.aByte2080, class169.aByte2081, class169.aByte2090, class169.aBool2056, class169.aBool2072, class169.aBool2087, class169.aBool2086, class169.aBool2059, class169.aByte2088, class169.aBool2089, class169.aBool2082, class169.anInt2091 * 1436865495);
		}
		return true;
	}

	a oh() {
		for (int i = 0; i < ((ja) this).as; i++) {
			if (((a) ((ja) this).ai[i]).aRunnable48 == Thread.currentThread())
				return ((ja) this).ai[i];
		}
		return null;
	}

	public boolean method8495() {
		return false;
	}

	native void oy(float[] fs);

	public native void in(float f);

	native void ot(float[] fs);

	public void method8529(int i, int i_719_, int i_720_, int i_721_, int i_722_, int i_723_, int i_724_, int i_725_, int i_726_) {
		/* empty */
	}

	public Class152 method8400(int i, int i_727_, int i_728_, int i_729_, int i_730_, int i_731_) {
		return null;
	}

	public Class455 method8554(int i, int i_732_, int[] is, int[] is_733_) {
		return new wa(this, ((ja) this).z, i, i_732_, is, is_733_);
	}

	native void no(Interface22 interface22, int i, int i_734_);

	native void oa(int i, int i_735_, int i_736_, int i_737_);

	native void ox(int i, int i_738_, int i_739_, int i_740_);
}
