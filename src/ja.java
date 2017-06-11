/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.EmptyStackException;

public class ja extends GraphicsToolkit implements Interface25 {
	Class453 aClass453_6680;
	static int[] anIntArray6681;
	ba aBa6682;
	Matrix4f aClass233_6683;
	boolean aBoolean6684 = false;
	int anInt6685;
	Matrix4f aClass233_6686;
	float aFloat6687;
	Matrix3f aClass222_6688;
	Matrix4f aClass233_6689;
	Matrix4f aClass233_6690;
	float aFloat6691;
	int anInt6692;
	static int[] anIntArray6693 = new int[Math.max(Math.max(104, 20), 24573)];
	float aFloat6694;
	float aFloat6695;
	Matrix3f aClass222_6696;
	a[] anAArray6697;
	static int anInt6698 = 20;
	static int anInt6699 = 104;
	long nativeid = 0L;
	static int anInt6700 = 20;
	static int anInt6701 = 24573;
	static int anInt6702 = 4;
	static float[] aFloatArray6703 = new float[20];
	static int[] anIntArray6704 = new int[6];
	static int[] anIntArray6705 = anIntArray6693;
	static float[] aFloatArray6706 = aFloatArray6703;
	static int[] anIntArray6707;
	static int[] anIntArray6708;
	int anInt6709;
	static int[] anIntArray6710;
	static short[] aShortArray6711;
	static byte[] aByteArray6712;
	boolean aBoolean6713;

	native void Q(int i, int[] is, float[] fs);

	native void q(Interface_ma interface_ma, int i, int i_0_);

	native void oo(float[] fs);

	native void R(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class_ta class_ta, int i_6_, int i_7_);

	native void da();

	native void Y(int i);

	native void n(Class_v class_v);

	public native void ea(int i, int i_8_, int i_9_, int i_10_);
	
	public void method5042_cp(Class69 class69, al ccat, int ci, int ca) {
		return;
	}

	Object WA() {
		return new aa(this);
	}

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public int method5135(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		int i_16_ = 0;
		float f = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_11_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_12_));
		float f_17_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i_13_ + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_14_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_15_));
		float f_18_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_11_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_12_));
		float f_19_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i_13_ + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_14_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_15_));
		if (f < -f_18_ && f_17_ < -f_19_)
			i_16_ |= 0x10;
		else if (f > f_18_ && f_17_ > f_19_)
			i_16_ |= 0x20;
		float f_20_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_11_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_12_));
		float f_21_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i_13_ + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_14_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_15_));
		if (f_20_ < -f_18_ && f_21_ < -f_19_)
			i_16_ |= 0x1;
		if (f_20_ > f_18_ && f_21_ > f_19_)
			i_16_ |= 0x2;
		float f_22_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_11_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_12_));
		float f_23_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i_13_ + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_14_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_15_));
		if (f_22_ < -f_18_ && f_23_ < -f_19_)
			i_16_ |= 0x4;
		if (f_22_ > f_18_ && f_23_ > f_19_)
			i_16_ |= 0x8;
		return i_16_;
	}

	public void method5012(boolean bool) {
		/* empty */
	}

	protected void finalize() {
		method5136(1915551427);
		if (((ja) this).nativeid != 0L)
			Class71.method809(this, (short) 18758);
	}

	void method5068() {
		if (!((ja) this).aBoolean6684) {
			((ja) this).anAArray6697 = null;
			((ja) this).aBa6682 = null;
			((ja) this).aClass233_6686 = null;
			for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
				var_ba.ha();
			((ja) this).aClass453_6680.method5943((byte) 1);
			da();
			if (((ja) this).aBoolean6713) {
				Class216.method2000(false, true, (short) 17761);
				((ja) this).aBoolean6713 = false;
			}
			h();
			Class71.method812(-1408959178);
			((ja) this).aBoolean6684 = true;
		}
	}

	void method5568(Class69 class69, boolean bool) {
		int i = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		int i_26_ = 0;
		int i_27_ = 0;
		for (Class302_Sub3_Sub1 class302_sub3_sub1 = ((Class302_Sub3_Sub1) class69.aClass448_680.method5911(-1980678448)); class302_sub3_sub1 != null; class302_sub3_sub1 = ((Class302_Sub3_Sub1) class69.aClass448_680.method5909(-1594607978))) {
			anIntArray6708[i++] = class302_sub3_sub1.anInt9785;
			anIntArray6708[i++] = class302_sub3_sub1.anInt9789;
			anIntArray6708[i++] = class302_sub3_sub1.anInt9790;
			anIntArray6707[i_24_++] = class302_sub3_sub1.flags;
			aShortArray6711[i_26_++] = (short) class302_sub3_sub1.anInt9794;
			anIntArray6710[i_25_++] = class302_sub3_sub1.anInt9791;
			if (bool)
				aByteArray6712[i_27_++] = class302_sub3_sub1.aByte9793;
		}
	}

	public Class58 method4987() {
		return new Class58(0, "SSE", 1, "CPU", 0L);
	}

	public void method5011() {
		((ja) this).aFloat6695 = (float) method4992((short) 13884).method545() / 2.0F;
		((ja) this).aFloat6694 = (float) method4992((short) -4468).method552() / 2.0F;
		((ja) this).aFloat6687 = ((ja) this).aFloat6695;
		((ja) this).aFloat6691 = ((ja) this).aFloat6694;
		k();
	}

	public void method5075() {
		/* empty */
	}

	void method5023() {
		if (!((ja) this).aBoolean6684) {
			((ja) this).anAArray6697 = null;
			((ja) this).aBa6682 = null;
			((ja) this).aClass233_6686 = null;
			for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
				var_ba.ha();
			((ja) this).aClass453_6680.method5943((byte) 1);
			da();
			if (((ja) this).aBoolean6713) {
				Class216.method2000(false, true, (short) -22106);
				((ja) this).aBoolean6713 = false;
			}
			h();
			Class71.method812(-1408959178);
			((ja) this).aBoolean6684 = true;
		}
	}

	public void method4993(int i) {
		Class71.method810((byte) 3);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
			var_ba.u();
	}

	void method5150(float f, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_) {
		/* empty */
	}

	public boolean method5001() {
		return true;
	}

	public native void z(boolean bool);

	native void nf(short i, short i_33_, int i_34_, byte i_35_, byte i_36_, int i_37_, boolean bool, byte i_38_, byte i_39_, byte i_40_, byte i_41_, boolean bool_42_, boolean bool_43_, boolean bool_44_, boolean bool_45_, boolean bool_46_, byte i_47_, boolean bool_48_, boolean bool_49_, int i_50_);

	public boolean method5050() {
		return false;
	}

	public boolean method4996() {
		return false;
	}

	public boolean method5082() {
		return true;
	}

	public boolean method5032() {
		return false;
	}

	native void ns();

	native void fm(int i, int i_51_, int i_52_, int i_53_, int i_54_);

	public boolean method5051() {
		return true;
	}

	public native void G(int i, int i_55_, int i_56_, int i_57_, int i_58_);

	public boolean method5159() {
		return true;
	}

	public native int[] aq(int i, int i_59_, int i_60_, int i_61_);

	public native void gv(int i, Class_ta class_ta, int i_62_, int i_63_);

	public void method5115(int i) {
		((ja) this).anInt6709 = ((ja) this).anInt6685 = i;
		if (((ja) this).anInt6692 > 1)
			throw new IllegalStateException();
		method5569(((ja) this).anInt6692);
		method5570(0);
	}

	public native void L();

	native void d(long l, long l_64_);

	public Class66 method5142(Class66 class66, Class66 class66_65_, float f, Class66 class66_66_) {
		return null;
	}

	native void k();

	public void method5187(int i, int i_67_, int i_68_, int i_69_) {
		((ja) this).aFloat6695 = (float) i_68_ / 2.0F;
		((ja) this).aFloat6694 = (float) i_69_ / 2.0F;
		((ja) this).aFloat6687 = (float) i + ((ja) this).aFloat6695;
		((ja) this).aFloat6691 = (float) i_67_ + ((ja) this).aFloat6694;
		A(i, i_67_, i_68_, i_69_);
	}

	public native void fl(int i, int i_70_, int i_71_, int i_72_, int i_73_);

	public native void GA(float f, float f_74_);

	public Class264 method5114(Class505 class505, Class89[] class89s, boolean bool) {
		int[] is = new int[class89s.length];
		int[] is_75_ = new int[class89s.length];
		boolean bool_76_ = false;
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].anInt812;
			is_75_[i] = class89s[i].anInt816;
			if (class89s[i].aByteArray819 != null)
				bool_76_ = true;
		}
		if (bool) {
			if (bool_76_)
				return new ea(this, ((ja) this).aBa6682, class505, class89s, null);
			return new m(this, ((ja) this).aBa6682, class505, class89s, null);
		}
		if (bool_76_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).aBa6682, class505, class89s, null);
	}

	public native int du();

	public native void o(int i, int i_77_, int i_78_, int i_79_);

	public native void qa(int[] is);

	public native void ba(int i, int i_80_);

	public void method5189(Class66 class66) {
		/* empty */
	}

	public native void B(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_);

	public native void N(int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, byte[] is, int i_91_, int i_92_);

	public void method5020(int i, int i_93_, float f, int i_94_, int i_95_, float f_96_, int i_97_, int i_98_, float f_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		throw new IllegalStateException();
	}

	public native void XA(int i, int i_104_, int i_105_, int i_106_, int i_107_);

	native void op(float[] fs);

	public void method5091(int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_) {
		YA(i, i_108_, i_109_, i_110_, i_111_, i_112_);
	}

	public void method5022(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, Class_ta class_ta, int i_118_, int i_119_) {
		R(i, i_113_, i_114_, i_115_, i_116_, i_117_, class_ta, i_118_, i_119_);
	}

	native void CA(int i, int i_120_, int i_121_, int i_122_, int i_123_);

	public void method5145() {
		/* empty */
	}

	public void method5007(int i, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, Class_ta class_ta, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_) {
		/* empty */
	}

	public void method5039(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_) {
		/* empty */
	}

	public Matrix4f method5083() {
		return ((ja) this).aClass233_6686;
	}

	public Class264 method5092(Class505 class505, Class89[] class89s, boolean bool) {
		int[] is = new int[class89s.length];
		int[] is_142_ = new int[class89s.length];
		boolean bool_143_ = false;
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].anInt812;
			is_142_[i] = class89s[i].anInt816;
			if (class89s[i].aByteArray819 != null)
				bool_143_ = true;
		}
		if (bool) {
			if (bool_143_)
				return new ea(this, ((ja) this).aBa6682, class505, class89s, null);
			return new m(this, ((ja) this).aBa6682, class505, class89s, null);
		}
		if (bool_143_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).aBa6682, class505, class89s, null);
	}

	public void method5059(float f, float f_144_, float f_145_, float[] fs) {
		float f_146_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * f + ((ja) this).aClass233_6683.aFloatArray2594[6] * f_144_ + ((ja) this).aClass233_6683.aFloatArray2594[10] * f_145_);
		float f_147_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_144_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_145_);
		if (f_146_ < -f_147_ || f_146_ > f_147_) {
			float[] fs_148_ = fs;
			float[] fs_149_ = fs;
			fs[2] = Float.NaN;
			fs_149_[1] = Float.NaN;
			fs_148_[0] = Float.NaN;
		} else {
			float f_150_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_144_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_145_);
			if (f_150_ < -f_147_ || f_150_ > f_147_) {
				float[] fs_151_ = fs;
				float[] fs_152_ = fs;
				fs[2] = Float.NaN;
				fs_152_[1] = Float.NaN;
				fs_151_[0] = Float.NaN;
			} else {
				float f_153_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_144_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * f_145_));
				if (f_153_ < -f_147_ || f_153_ > f_147_) {
					float[] fs_154_ = fs;
					float[] fs_155_ = fs;
					fs[2] = Float.NaN;
					fs_155_[1] = Float.NaN;
					fs_154_[0] = Float.NaN;
				} else {
					float f_156_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + (((ja) this).aClass233_6689.aFloatArray2594[6] * f_144_) + (((ja) this).aClass233_6689.aFloatArray2594[10] * f_145_));
					fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_150_ / f_147_);
					fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_153_ / f_147_);
					fs[2] = f_156_;
				}
			}
		}
	}

	public Class_v method5026(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).aClass453_6680.method5935(var_ba, 1259364637);
		return var_ba;
	}

	public void method5027(Class_v class_v) {
		((ja) this).aBa6682 = (ba) class_v;
		n(class_v);
	}

	public Class57 method5029(int i, int i_157_, boolean bool, boolean bool_158_) {
		return new fa(this, i, i_157_, bool_158_);
	}

	public Class57 method5030(int[] is, int i, int i_159_, int i_160_, int i_161_, boolean bool) {
		return new fa(this, is, i, i_159_, i_160_, i_161_, false);
	}

	public Class57 method5125(Class89 class89, boolean bool) {
		fa var_fa = new fa(this, class89.anIntArray817, class89.aByteArray818, class89.aByteArray819, 0, class89.anInt812, class89.anInt812, class89.anInt816);
		var_fa.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return var_fa;
	}

	public Class57 method5033(int i, int i_162_, int i_163_, int i_164_, boolean bool) {
		return new fa(this, i, i_162_, i_163_, i_164_, !bool);
	}

	native void V(short i, short i_165_, int i_166_, byte i_167_, byte i_168_, int i_169_, boolean bool, byte i_170_, byte i_171_, byte i_172_, byte i_173_, boolean bool_174_, boolean bool_175_, boolean bool_176_, boolean bool_177_, boolean bool_178_, byte i_179_, boolean bool_180_, boolean bool_181_, int i_182_);

	public native void DA(int i, Class_ta class_ta, int i_183_, int i_184_);

	public native void ej(int i, int i_185_, int i_186_, int i_187_);

	public void method5162(float f, float f_188_, float f_189_, float[] fs) {
		float f_190_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_188_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_189_);
		float f_191_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_188_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_189_);
		float f_192_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_188_ + ((ja) this).aClass233_6683.aFloatArray2594[9] * f_189_);
		float f_193_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + ((ja) this).aClass233_6689.aFloatArray2594[6] * f_188_ + ((ja) this).aClass233_6689.aFloatArray2594[10] * f_189_);
		fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_191_ / f_190_);
		fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_192_ / f_190_);
		fs[2] = f_193_;
	}

	public Class387 method5037(Model model, int i, int i_194_, int i_195_, int i_196_) {
		return new h(this, ((ja) this).aBa6682, model, i, i_194_, i_195_, i_196_);
	}

	public int method5017(int i, int i_197_) {
		int i_198_ = i & 0xfffff;
		int i_199_ = i_197_ & 0xfffff;
		return i_198_ & i_199_ ^ i_199_;
	}

	public int method5004(int i, int i_200_) {
		return i | i_200_;
	}

	public native void gg(int i, Class_ta class_ta, int i_201_, int i_202_);

	public Matrix4f method5036() {
		return ((ja) this).aClass233_6686;
	}

	public Matrix3f method5178() {
		return ((ja) this).aClass222_6696;
	}

	void method5569(int i) {
		((ja) this).anInt6692 = i;
		((ja) this).anAArray6697 = new a[((ja) this).anInt6692];
		for (int i_203_ = 0; i_203_ < ((ja) this).anInt6692; i_203_++)
			((ja) this).anAArray6697[i_203_] = new a(this, ((ja) this).anInt6709, ((ja) this).anInt6685);
	}

	void method5570(int i) {
		((ja) this).anAArray6697[i].method283();
	}

	a method5571() {
		for (int i = 0; i < ((ja) this).anInt6692; i++) {
			if (((a) ((ja) this).anAArray6697[i]).aRunnable6669 == Thread.currentThread())
				return ((ja) this).anAArray6697[i];
		}
		return null;
	}

	public void method5042(Class69 class69) {
		if (class69.aClass448_680.method5910((short) -13342) != 0) {
			method5568(class69, false);
			method5571().method278(this, anIntArray6708, anIntArray6707, anIntArray6710, aShortArray6711, class69.aClass448_680.method5910((short) -17134));
		}
	}

	public void method5043(Matrix3f class222) {
		((ja) this).aClass222_6688 = class222;
		((ja) this).aClass233_6689.method2145(class222);
		AA(((ja) this).aClass233_6689.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	public Matrix3f method5044() {
		return ((ja) this).aClass222_6688;
	}

	public void method5182(Matrix4f class233) {
		((ja) this).aClass233_6690 = class233;
		wa(((ja) this).aClass233_6690.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	native void JA(int i, int i_204_, int i_205_, int i_206_);

	public boolean method5127() {
		return true;
	}

	native void nm(long l, long l_207_);

	void method5009() {
		if (!((ja) this).aBoolean6684) {
			((ja) this).anAArray6697 = null;
			((ja) this).aBa6682 = null;
			((ja) this).aClass233_6686 = null;
			for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
				var_ba.ha();
			((ja) this).aClass453_6680.method5943((byte) 1);
			da();
			if (((ja) this).aBoolean6713) {
				Class216.method2000(false, true, (short) -6656);
				((ja) this).aBoolean6713 = false;
			}
			h();
			Class71.method812(-1408959178);
			((ja) this).aBoolean6684 = true;
		}
	}

	public void method5128(Class69 class69) {
		if (class69.aClass448_680.method5910((short) -3305) != 0) {
			method5568(class69, false);
			method5571().method278(this, anIntArray6708, anIntArray6707, anIntArray6710, aShortArray6711, class69.aClass448_680.method5910((short) 6188));
		}
	}

	public native void J(int i);

	public native void c(int i, int i_208_, int i_209_);

	public native void RA(boolean bool);

	public void method5021(int i, Class298_Sub10[] class298_sub10s) {
		int i_210_ = 0;
		for (int i_211_ = 0; i_211_ < i; i_211_++) {
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2895(823958259);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2894(-2035778581);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2897((byte) 52);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2900(34190041);
			aFloatArray6706[i_211_] = class298_sub10s[i_211_].method2901(608404512);
			anIntArray6705[i_210_++] = class298_sub10s[i_211_].method2898(-1429005837);
		}
		Q(i, anIntArray6705, aFloatArray6706);
	}

	native void mt(Interface_ma interface_ma, int i, int i_212_);

	public Class66 method5028(int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_) {
		return null;
	}

	public Class66 method5179(Class66 class66, Class66 class66_218_, float f, Class66 class66_219_) {
		return null;
	}

	public void method5095(Class66 class66) {
		/* empty */
	}

	void method5064(int i, int i_220_) throws Exception_Sub1 {
		za var_za = (za) method5147(1919444558);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method581(i, i_220_);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(589016953);
	}

	void method4989(int i, int i_221_) throws Exception_Sub1 {
		za var_za = (za) method5147(2121679356);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method581(i, i_221_);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(1305525906);
	}

	public boolean method4995() {
		return true;
	}

	public void method5053() {
		/* empty */
	}

	public boolean method5054() {
		return false;
	}

	public Class52_Sub1 method5138() {
		return new Class52_Sub1_Sub4(this);
	}

	public void method5176() {
		/* empty */
	}

	public void method5168(int i, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_) {
		method5571().method286(this, i, i_222_, i_223_, i_224_, i_225_, i_226_, i_227_);
	}

	public Matrix4f method5045() {
		return ((ja) this).aClass233_6690;
	}

	public final void method5057(int i, Class78 class78) {
		M(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	native void M(int i, int i_228_, int i_229_, int i_230_);

	public Class52_Sub1 method5094() {
		return new Class52_Sub1_Sub4(this);
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_231_) {
		return new oa(i, i_231_);
	}

	static {
		anIntArray6681 = anIntArray6693;
		anIntArray6708 = anIntArray6693;
		anIntArray6707 = new int[8191];
		anIntArray6710 = new int[8191];
		aShortArray6711 = new short[8191];
		aByteArray6712 = new byte[8191];
	}

	public Class58 method5062() {
		return new Class58(0, "SSE", 1, "CPU", 0L);
	}

	public native void es(int[] is);

	public native void fu(int i, int i_232_, int i_233_, int i_234_, int i_235_);

	void method5065(int i, int i_236_) throws Exception_Sub1 {
		za var_za = (za) method5147(1865730499);
		if (var_za == null)
			throw new IllegalStateException();
		var_za.method581(i, i_236_);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(1643795383);
	}

	public void method5066() {
		/* empty */
	}

	public void method5067() {
		/* empty */
	}

	public native int za();

	public native void fh(int i, int i_237_);

	public boolean method5073() {
		return true;
	}

	void method5069() {
		if (!((ja) this).aBoolean6684) {
			((ja) this).anAArray6697 = null;
			((ja) this).aBa6682 = null;
			((ja) this).aClass233_6686 = null;
			for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
				var_ba.ha();
			((ja) this).aClass453_6680.method5943((byte) 1);
			da();
			if (((ja) this).aBoolean6713) {
				Class216.method2000(false, true, (short) -17613);
				((ja) this).aBoolean6713 = false;
			}
			h();
			Class71.method812(-1408959178);
			((ja) this).aBoolean6684 = true;
		}
	}

	public void method5174(int i) {
		Class71.method810((byte) 3);
		Y(i);
		for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
			var_ba.u();
	}

	public native int dm();

	public ja(Canvas canvas, Interface_ma interface_ma, int i, int i_238_) {
		super(interface_ma);
		((ja) this).aClass453_6680 = new Class453();
		((ja) this).anInt6709 = 4096;
		((ja) this).anInt6685 = 4096;
		((ja) this).aBoolean6713 = false;
		try {
			if (!Class85.method955(2126469897).method265("sw3d", 1499520275))
				throw new RuntimeException("");
			Class71.method811(-1686477693);
			q(anInterface_ma5299, anInterface_ma5299.method177(452373566), 0);
			Class374_Sub1.method4640(false, true, -162450455);
			((ja) this).aBoolean6713 = true;
			((ja) this).aClass233_6686 = new Matrix4f();
			new Class217();
			((ja) this).aClass222_6696 = new Matrix3f();
			new Class218();
			((ja) this).aClass233_6689 = new Matrix4f();
			((ja) this).aClass233_6690 = new Matrix4f();
			((ja) this).aClass233_6683 = new Matrix4f();
			method5043(new Matrix3f());
			method5182(new Matrix4f());
			method5569(1);
			method5570(0);
			if (canvas != null) {
				method5163(canvas, i, i_238_, -414919790);
				method5003(canvas, (byte) -90);
			}
			int i_239_ = anInterface_ma5299.method177(468739561);
			for (short i_240_ = 0; i_240_ < i_239_; i_240_++) {
				Class53 class53 = anInterface_ma5299.method174(i_240_, 1423908475);
				if (class53 != null)
					V(i_240_, class53.aShort532, class53.anInt528 * -2138060883, class53.aByte529, class53.aByte536, class53.anInt531 * 1616831825, class53.aBoolean518, class53.aByte533, class53.aByte534, class53.aByte535, class53.aByte509, class53.aBoolean524, class53.aBoolean538, class53.aBoolean527, class53.aBoolean540, class53.aBoolean541, class53.aByte537, class53.aBoolean543, class53.aBoolean544, class53.anInt519 * -490972023);
			}
		} catch (Throwable throwable) {
			method5136(368074744);
			throw new RuntimeException();
		}
	}

	public boolean method5070() {
		return true;
	}

	public native void ed(int i, int i_241_, int i_242_, int i_243_);

	public boolean method5072() {
		return true;
	}

	public boolean method5071() {
		return true;
	}

	public boolean method5081() {
		return false;
	}

	public void method5134(Matrix4f class233) {
		((ja) this).aClass233_6690 = class233;
		wa(((ja) this).aClass233_6690.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	native void mu(int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_);

	public boolean method5076() {
		return false;
	}

	public boolean method5077() {
		return false;
	}

	public boolean method5079() {
		return true;
	}

	public native void fa(int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_);

	public boolean method5180() {
		return true;
	}

	public int method5048() {
		return 4;
	}

	public boolean method5078() {
		return true;
	}

	Class52_Sub2 method5117(Canvas canvas, int i, int i_254_) {
		return new za(this, canvas, i, i_254_);
	}

	public native int[] ev(int i, int i_255_, int i_256_, int i_257_);

	public native int[] eg(int i, int i_258_, int i_259_, int i_260_);

	public native void hb(int i);

	public native void em(boolean bool);

	public native void ec(boolean bool);

	public void method5086() {
		((ja) this).aFloat6695 = (float) method4992((short) 21033).method545() / 2.0F;
		((ja) this).aFloat6694 = (float) method4992((short) -7995).method552() / 2.0F;
		((ja) this).aFloat6687 = ((ja) this).aFloat6695;
		((ja) this).aFloat6691 = ((ja) this).aFloat6694;
		k();
	}

	public native void ey(float f, float f_261_);

	public native void ez(float f, float f_262_);

	public native void el(float f, float f_263_);

	public void method5060(float f, float f_264_, float f_265_, float[] fs) {
		float f_266_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_264_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_265_);
		float f_267_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_264_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_265_);
		float f_268_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_264_ + ((ja) this).aClass233_6683.aFloatArray2594[9] * f_265_);
		float f_269_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + ((ja) this).aClass233_6689.aFloatArray2594[6] * f_264_ + ((ja) this).aClass233_6689.aFloatArray2594[10] * f_265_);
		fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_267_ / f_266_);
		fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_268_ / f_266_);
		fs[2] = f_269_;
	}

	public native void ep();

	public native void ei();

	public boolean method5146() {
		return false;
	}

	public void method5112() {
		/* empty */
	}

	public native void r(int i, int i_270_, int i_271_, int i_272_);

	public native void eh(int i, int i_273_, int i_274_, int i_275_);

	public void method5019(int i, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_) {
		XA(i, i_276_, i_277_, i_279_, i_280_);
		XA(i, i_276_ + i_278_ - 1, i_277_, i_279_, i_280_);
		G(i, i_276_ + 1, i_278_ - 1, i_279_, i_280_);
		G(i + i_277_ - 1, i_276_ + 1, i_278_ - 1, i_279_, i_280_);
	}

	public native void eo(int[] is);

	public native void er(int[] is);

	public native void fy(int i, int i_281_);

	public native void fb(int i, int i_282_);

	public void method5080() {
		/* empty */
	}

	public native void fn(int i, int i_283_);

	public void method5093(int i, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_) {
		XA(i, i_284_, i_285_, i_287_, i_288_);
		XA(i, i_284_ + i_286_ - 1, i_285_, i_287_, i_288_);
		G(i, i_284_ + 1, i_286_ - 1, i_287_, i_288_);
		G(i + i_285_ - 1, i_284_ + 1, i_286_ - 1, i_287_, i_288_);
	}

	native void A(int i, int i_289_, int i_290_, int i_291_);

	public void method5169(int i) {
		((ja) this).anInt6709 = ((ja) this).anInt6685 = i;
		if (((ja) this).anInt6692 > 1)
			throw new IllegalStateException();
		method5569(((ja) this).anInt6692);
		method5570(0);
	}

	public native void fi(int i, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, byte[] is, int i_297_, int i_298_);

	native void fv(int i, int i_299_, int i_300_, int i_301_, int i_302_);

	native void or(float[] fs);

	public native void ff(int i, int i_303_, int i_304_, int i_305_, int i_306_);

	public native void fd(int i, int i_307_, int i_308_, int i_309_, int i_310_);

	public native void ft(int i, int i_311_, int i_312_, int i_313_, int i_314_);

	public void method4999(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_) {
		method5571().method286(this, i, i_315_, i_316_, i_317_, i_318_, i_319_, i_320_);
	}

	public native void eq();

	public void method5038(int i, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_, int i_327_, int i_328_) {
		/* empty */
	}

	public void method5088(int i, int i_329_, int i_330_, int i_331_, int i_332_, int i_333_, Class_ta class_ta, int i_334_, int i_335_) {
		R(i, i_329_, i_330_, i_331_, i_332_, i_333_, class_ta, i_334_, i_335_);
	}

	public native void hg(int i, float f, float f_336_, float f_337_, float f_338_, float f_339_);

	public void method5097(int i, int i_340_, int i_341_, int i_342_, int i_343_, int i_344_, Class_ta class_ta, int i_345_, int i_346_) {
		R(i, i_340_, i_341_, i_342_, i_343_, i_344_, class_ta, i_345_, i_346_);
	}

	public void method5131(Matrix3f class222) {
		((ja) this).aClass222_6688 = class222;
		((ja) this).aClass233_6689.method2145(class222);
		AA(((ja) this).aClass233_6689.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	public int method5099(int i, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_) {
		int i_352_ = 0;
		float f = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_347_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_348_));
		float f_353_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i_349_ + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_350_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_351_));
		float f_354_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_347_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_348_));
		float f_355_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i_349_ + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_350_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_351_));
		if (f < -f_354_ && f_353_ < -f_355_)
			i_352_ |= 0x10;
		else if (f > f_354_ && f_353_ > f_355_)
			i_352_ |= 0x20;
		float f_356_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_347_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_348_));
		float f_357_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i_349_ + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_350_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_351_));
		if (f_356_ < -f_354_ && f_357_ < -f_355_)
			i_352_ |= 0x1;
		if (f_356_ > f_354_ && f_357_ > f_355_)
			i_352_ |= 0x2;
		float f_358_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_347_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_348_));
		float f_359_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i_349_ + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_350_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_351_));
		if (f_358_ < -f_354_ && f_359_ < -f_355_)
			i_352_ |= 0x4;
		if (f_358_ > f_354_ && f_359_ > f_355_)
			i_352_ |= 0x8;
		return i_352_;
	}

	public Interface8_Impl1_Impl2 method5165(int i, int i_360_) {
		return new oa(i, i_360_);
	}

	public boolean method5119() {
		return false;
	}

	public Class_v method5102(int i) {
		ba var_ba = new ba(this, i);
		((ja) this).aClass453_6680.method5935(var_ba, 472280132);
		return var_ba;
	}

	public void method5103(Class_v class_v) {
		((ja) this).aBa6682 = (ba) class_v;
		n(class_v);
	}

	public Class57 method5104(int i, int i_361_, boolean bool, boolean bool_362_) {
		return new fa(this, i, i_361_, bool_362_);
	}

	public void method5160(float f, float f_363_, float f_364_, float[] fs) {
		float f_365_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_363_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_364_);
		float f_366_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_363_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_364_);
		float f_367_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_363_ + ((ja) this).aClass233_6683.aFloatArray2594[9] * f_364_);
		float f_368_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + ((ja) this).aClass233_6689.aFloatArray2594[6] * f_363_ + ((ja) this).aClass233_6689.aFloatArray2594[10] * f_364_);
		fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_366_ / f_365_);
		fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_367_ / f_365_);
		fs[2] = f_368_;
	}

	public Class57 method5106(int[] is, int i, int i_369_, int i_370_, int i_371_, boolean bool) {
		return new fa(this, is, i, i_369_, i_370_, i_371_, false);
	}

	public Class57 method5190(int[] is, int i, int i_372_, int i_373_, int i_374_, boolean bool) {
		return new fa(this, is, i, i_372_, i_373_, i_374_, false);
	}

	public int method5126(int i, int i_375_) {
		int i_376_ = i & 0xfffff;
		int i_377_ = i_375_ & 0xfffff;
		return i_376_ & i_377_ ^ i_377_;
	}

	public Class57 method5101(Class89 class89, boolean bool) {
		fa var_fa = new fa(this, class89.anIntArray817, class89.aByteArray818, class89.aByteArray819, 0, class89.anInt812, class89.anInt812, class89.anInt816);
		var_fa.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return var_fa;
	}

	public Class57 method5108(int i, int i_378_, int i_379_, int i_380_, boolean bool) {
		return new fa(this, i, i_378_, i_379_, i_380_, !bool);
	}

	public Class_ta method5109(int i, int i_381_, int[] is, int[] is_382_) {
		return new wa(this, ((ja) this).aBa6682, i, i_381_, is, is_382_);
	}

	public void method5154() {
		/* empty */
	}

	native void AA(float[] fs);

	public void method5047(boolean bool) {
		/* empty */
	}

	public native void fo(int i, int i_383_, int i_384_, int i_385_, int i_386_, int i_387_, byte[] is, int i_388_, int i_389_);

	public Class264 method5113(Class505 class505, Class89[] class89s, boolean bool) {
		int[] is = new int[class89s.length];
		int[] is_390_ = new int[class89s.length];
		boolean bool_391_ = false;
		for (int i = 0; i < class89s.length; i++) {
			is[i] = class89s[i].anInt812;
			is_390_[i] = class89s[i].anInt816;
			if (class89s[i].aByteArray819 != null)
				bool_391_ = true;
		}
		if (bool) {
			if (bool_391_)
				return new ea(this, ((ja) this).aBa6682, class505, class89s, null);
			return new m(this, ((ja) this).aBa6682, class505, class89s, null);
		}
		if (bool_391_)
			throw new IllegalArgumentException("");
		return new ia(this, ((ja) this).aBa6682, class505, class89s, null);
	}

	public boolean method5074() {
		return true;
	}

	public native void m(int i, float f, float f_392_, float f_393_, float f_394_, float f_395_);

	public boolean method5052() {
		return false;
	}

	public void method5056(int i, int i_396_, int i_397_, int i_398_) {
		/* empty */
	}

	public int method5118(int i, int i_399_) {
		int i_400_ = i & 0xfffff;
		int i_401_ = i_399_ & 0xfffff;
		return i_400_ & i_401_ ^ i_401_;
	}

	public int method5024(int i, int i_402_) {
		int i_403_ = i & 0xfffff;
		int i_404_ = i_402_ & 0xfffff;
		return i_403_ & i_404_ ^ i_404_;
	}

	public int method5120(int i, int i_405_) {
		int i_406_ = i & 0xfffff;
		int i_407_ = i_405_ & 0xfffff;
		return i_406_ & i_407_ ^ i_407_;
	}

	public Class_xa method5121(int i, int i_408_, int[][] is, int[][] is_409_, int i_410_, int i_411_, int i_412_) {
		return new i(this, ((ja) this).aBa6682, i, i_408_, is, is_409_, i_410_, i_411_, i_412_);
	}

	public Class_xa method5122(int i, int i_413_, int[][] is, int[][] is_414_, int i_415_, int i_416_, int i_417_) {
		return new i(this, ((ja) this).aBa6682, i, i_413_, is, is_414_, i_415_, i_416_, i_417_);
	}

	public Class_xa method5123(int i, int i_418_, int[][] is, int[][] is_419_, int i_420_, int i_421_, int i_422_) {
		return new i(this, ((ja) this).aBa6682, i, i_418_, is, is_419_, i_420_, i_421_, i_422_);
	}

	public Class_xa method5087(int i, int i_423_, int[][] is, int[][] is_424_, int i_425_, int i_426_, int i_427_) {
		return new i(this, ((ja) this).aBa6682, i, i_423_, is, is_424_, i_425_, i_426_, i_427_);
	}

	public Matrix3f method5013() {
		return ((ja) this).aClass222_6696;
	}

	public Matrix3f method5008() {
		return ((ja) this).aClass222_6696;
	}

	public void method5132(Matrix3f class222) {
		((ja) this).aClass222_6688 = class222;
		((ja) this).aClass233_6689.method2145(class222);
		AA(((ja) this).aClass233_6689.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	public Class_ta method5110(int i, int i_428_, int[] is, int[] is_429_) {
		return new wa(this, ((ja) this).aBa6682, i, i_428_, is, is_429_);
	}

	native void PA(za var_za);

	public void method5129(Matrix3f class222) {
		((ja) this).aClass222_6688 = class222;
		((ja) this).aClass233_6689.method2145(class222);
		AA(((ja) this).aClass233_6689.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	public void method5130(Matrix3f class222) {
		((ja) this).aClass222_6688 = class222;
		((ja) this).aClass233_6689.method2145(class222);
		AA(((ja) this).aClass233_6689.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	public void method5096(int i, int i_430_, int i_431_, int i_432_, int i_433_, int i_434_, Class_ta class_ta, int i_435_, int i_436_) {
		R(i, i_430_, i_431_, i_432_, i_433_, i_434_, class_ta, i_435_, i_436_);
	}

	public void method4991(int i, int i_437_, int i_438_, int i_439_) {
		/* empty */
	}

	public void method5133(Matrix4f class233) {
		((ja) this).aClass233_6690 = class233;
		wa(((ja) this).aClass233_6690.aFloatArray2594);
		((ja) this).aClass233_6683.method2143(((ja) this).aClass233_6689, ((ja) this).aClass233_6690);
	}

	native void YA(int i, int i_440_, int i_441_, int i_442_, int i_443_, int i_444_);

	public boolean method4994() {
		return true;
	}

	Class52_Sub2 method5006(Canvas canvas, int i, int i_445_) {
		return new za(this, canvas, i, i_445_);
	}

	public void method4997(int i, Class298_Sub10[] class298_sub10s) {
		int i_446_ = 0;
		for (int i_447_ = 0; i_447_ < i; i_447_++) {
			anIntArray6705[i_446_++] = class298_sub10s[i_447_].method2895(823958259);
			anIntArray6705[i_446_++] = class298_sub10s[i_447_].method2894(-417421408);
			anIntArray6705[i_446_++] = class298_sub10s[i_447_].method2897((byte) 4);
			anIntArray6705[i_446_++] = class298_sub10s[i_447_].method2900(-642441246);
			aFloatArray6706[i_447_] = class298_sub10s[i_447_].method2901(608404512);
			anIntArray6705[i_446_++] = class298_sub10s[i_447_].method2898(-1322756012);
		}
		Q(i, anIntArray6705, aFloatArray6706);
	}

	public Class57 method5105(int[] is, int i, int i_448_, int i_449_, int i_450_, boolean bool) {
		return new fa(this, is, i, i_448_, i_449_, i_450_, false);
	}

	public native void hv(int i, int i_451_, int i_452_);

	public native void hj(int i, int i_453_, int i_454_);

	public native void hn(int i, int i_455_, int i_456_);

	public native void he(int i, int i_457_, int i_458_);

	public void method5137(boolean bool) {
		/* empty */
	}

	public void method5184(boolean bool) {
		/* empty */
	}

	public Class66 method5185(int i, int i_459_, int i_460_, int i_461_, int i_462_, int i_463_) {
		return null;
	}

	public Class66 method5140(int i, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_) {
		return null;
	}

	public Class66 method5181(int i, int i_469_, int i_470_, int i_471_, int i_472_, int i_473_) {
		return null;
	}

	public Class66 method5084(int i, int i_474_, int i_475_, int i_476_, int i_477_, int i_478_) {
		return null;
	}

	public Class66 method4986(Class66 class66, Class66 class66_479_, float f, Class66 class66_480_) {
		return null;
	}

	public Class58 method5063() {
		return new Class58(0, "SSE", 1, "CPU", 0L);
	}

	void h() {
		System.gc();
		System.runFinalization();
		Class71.method810((byte) 3);
	}

	boolean SA(short i) {
		synchronized (anInterface_ma5299) {
			Class53 class_cc = anInterface_ma5299.method174(i, 1155250631);
			if (class_cc == null) {
				boolean bool = false;
				return bool;
			}
			if (!anInterface_ma5299.method170(i, (short) 29433)) {
				boolean bool = false;
				return bool;
			}
			int[] is;
			if (class_cc.anInt528 * -2138060883 != 2)
				is = anInterface_ma5299.method171(i, 0.7F, 128, 128, true, 1135790918);
			else
				is = anInterface_ma5299.method172(i, 0.7F, 128, 128, true, (byte) 2);
			F(i, is, class_cc.aShort532, class_cc.anInt528 * -2138060883, class_cc.aByte529, class_cc.aByte536, class_cc.anInt531 * 1616831825, class_cc.aBoolean518, class_cc.aByte533, class_cc.aByte534, class_cc.aByte535, class_cc.aByte509, class_cc.aBoolean524, class_cc.aBoolean538, class_cc.aBoolean527, class_cc.aBoolean540, class_cc.aBoolean541, class_cc.aByte537, class_cc.aBoolean543, class_cc.aBoolean544, class_cc.anInt519 * -490972023);
		}
		return true;
	}

	public boolean method5144() {
		return false;
	}

	public native void IA(float f);

	void method5141() {
		if (!((ja) this).aBoolean6684) {
			((ja) this).anAArray6697 = null;
			((ja) this).aBa6682 = null;
			((ja) this).aClass233_6686 = null;
			for (ba var_ba = (ba) ((ja) this).aClass453_6680.method5939(1766612795); var_ba != null; var_ba = (ba) ((ja) this).aClass453_6680.method5944(49146))
				var_ba.ha();
			((ja) this).aClass453_6680.method5943((byte) 1);
			da();
			if (((ja) this).aBoolean6713) {
				Class216.method2000(false, true, (short) 8528);
				((ja) this).aBoolean6713 = false;
			}
			h();
			Class71.method812(-1408959178);
			((ja) this).aBoolean6684 = true;
		}
	}

	native void om(float[] fs);

	public boolean method5148() {
		return false;
	}

	public boolean method5149() {
		return false;
	}

	public int method5025(int i, int i_481_, int i_482_, int i_483_, int i_484_, int i_485_) {
		int i_486_ = 0;
		float f = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_481_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_482_));
		float f_487_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i_483_ + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_484_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_485_));
		float f_488_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_481_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_482_));
		float f_489_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i_483_ + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_484_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_485_));
		if (f < -f_488_ && f_487_ < -f_489_)
			i_486_ |= 0x10;
		else if (f > f_488_ && f_487_ > f_489_)
			i_486_ |= 0x20;
		float f_490_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_481_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_482_));
		float f_491_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i_483_ + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_484_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_485_));
		if (f_490_ < -f_488_ && f_491_ < -f_489_)
			i_486_ |= 0x1;
		if (f_490_ > f_488_ && f_491_ > f_489_)
			i_486_ |= 0x2;
		float f_492_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_481_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_482_));
		float f_493_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i_483_ + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_484_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_485_));
		if (f_492_ < -f_488_ && f_493_ < -f_489_)
			i_486_ |= 0x4;
		if (f_492_ > f_488_ && f_493_ > f_489_)
			i_486_ |= 0x8;
		return i_486_;
	}

	native void mi(int i, int i_494_, int i_495_, int i_496_, int i_497_, int i_498_, Class_ta class_ta, int i_499_, int i_500_);

	public void method5175() {
		/* empty */
	}

	public void method5153() {
		/* empty */
	}

	void method5188(float f, float f_501_, float f_502_, float f_503_, float f_504_, float f_505_) {
		/* empty */
	}

	public final void method5155(int i, Class78 class78) {
		M(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	public final void method5156(int i, Class78 class78) {
		M(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	public final void method5089(int i, Class78 class78) {
		JA(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	public native void hu(float f);

	public native void iv();

	public void method5157(int i, int i_506_, float f, int i_507_, int i_508_, float f_509_, int i_510_, int i_511_, float f_512_, int i_513_, int i_514_, int i_515_, int i_516_) {
		throw new IllegalStateException();
	}

	public void method5158(int i, int i_517_, float f, int i_518_, int i_519_, float f_520_, int i_521_, int i_522_, float f_523_, int i_524_, int i_525_, int i_526_, int i_527_) {
		throw new IllegalStateException();
	}

	public void method5139(int i, int i_528_, float f, int i_529_, int i_530_, float f_531_, int i_532_, int i_533_, float f_534_, int i_535_, int i_536_, int i_537_, int i_538_) {
		throw new IllegalStateException();
	}

	native void od(int i, int i_539_, int i_540_, int i_541_);

	public void method5161(float f, float f_542_, float f_543_, float[] fs) {
		float f_544_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_542_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_543_);
		float f_545_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_542_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_543_);
		float f_546_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_542_ + ((ja) this).aClass233_6683.aFloatArray2594[9] * f_543_);
		float f_547_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + ((ja) this).aClass233_6689.aFloatArray2594[6] * f_542_ + ((ja) this).aClass233_6689.aFloatArray2594[10] * f_543_);
		fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_545_ / f_544_);
		fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_546_ / f_544_);
		fs[2] = f_547_;
	}

	public native void ih();

	public void method5055(float f, float f_548_, float f_549_, float[] fs) {
		float f_550_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * f + ((ja) this).aClass233_6683.aFloatArray2594[6] * f_548_ + ((ja) this).aClass233_6683.aFloatArray2594[10] * f_549_);
		float f_551_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_548_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_549_);
		if (f_550_ < -f_551_ || f_550_ > f_551_) {
			float[] fs_552_ = fs;
			float[] fs_553_ = fs;
			fs[2] = Float.NaN;
			fs_553_[1] = Float.NaN;
			fs_552_[0] = Float.NaN;
		} else {
			float f_554_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_548_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_549_);
			if (f_554_ < -f_551_ || f_554_ > f_551_) {
				float[] fs_555_ = fs;
				float[] fs_556_ = fs;
				fs[2] = Float.NaN;
				fs_556_[1] = Float.NaN;
				fs_555_[0] = Float.NaN;
			} else {
				float f_557_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_548_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * f_549_));
				if (f_557_ < -f_551_ || f_557_ > f_551_) {
					float[] fs_558_ = fs;
					float[] fs_559_ = fs;
					fs[2] = Float.NaN;
					fs_559_[1] = Float.NaN;
					fs_558_[0] = Float.NaN;
				} else {
					float f_560_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + (((ja) this).aClass233_6689.aFloatArray2594[6] * f_548_) + (((ja) this).aClass233_6689.aFloatArray2594[10] * f_549_));
					fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_554_ / f_551_);
					fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_557_ / f_551_);
					fs[2] = f_560_;
				}
			}
		}
	}

	public void method5164(float f, float f_561_, float f_562_, float[] fs) {
		float f_563_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * f + ((ja) this).aClass233_6683.aFloatArray2594[6] * f_561_ + ((ja) this).aClass233_6683.aFloatArray2594[10] * f_562_);
		float f_564_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * f + ((ja) this).aClass233_6683.aFloatArray2594[7] * f_561_ + ((ja) this).aClass233_6683.aFloatArray2594[11] * f_562_);
		if (f_563_ < -f_564_ || f_563_ > f_564_) {
			float[] fs_565_ = fs;
			float[] fs_566_ = fs;
			fs[2] = Float.NaN;
			fs_566_[1] = Float.NaN;
			fs_565_[0] = Float.NaN;
		} else {
			float f_567_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * f + ((ja) this).aClass233_6683.aFloatArray2594[4] * f_561_ + ((ja) this).aClass233_6683.aFloatArray2594[8] * f_562_);
			if (f_567_ < -f_564_ || f_567_ > f_564_) {
				float[] fs_568_ = fs;
				float[] fs_569_ = fs;
				fs[2] = Float.NaN;
				fs_569_[1] = Float.NaN;
				fs_568_[0] = Float.NaN;
			} else {
				float f_570_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * f + ((ja) this).aClass233_6683.aFloatArray2594[5] * f_561_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * f_562_));
				if (f_570_ < -f_564_ || f_570_ > f_564_) {
					float[] fs_571_ = fs;
					float[] fs_572_ = fs;
					fs[2] = Float.NaN;
					fs_572_[1] = Float.NaN;
					fs_571_[0] = Float.NaN;
				} else {
					float f_573_ = (((ja) this).aClass233_6689.aFloatArray2594[14] + ((ja) this).aClass233_6689.aFloatArray2594[2] * f + (((ja) this).aClass233_6689.aFloatArray2594[6] * f_561_) + (((ja) this).aClass233_6689.aFloatArray2594[10] * f_562_));
					fs[0] = (((ja) this).aFloat6687 + ((ja) this).aFloat6695 * f_567_ / f_564_);
					fs[1] = (((ja) this).aFloat6691 + ((ja) this).aFloat6694 * f_570_ / f_564_);
					fs[2] = f_573_;
				}
			}
		}
	}

	public boolean method4998() {
		return true;
	}

	public native void O();

	synchronized void method5573() {
		method5136(336698672);
		if (((ja) this).nativeid != 0L)
			Class71.method809(this, (short) 12675);
	}

	public boolean method5166() {
		return false;
	}

	public void method5167(int i, int i_574_, int i_575_, int i_576_, int i_577_, int i_578_) {
		YA(i, i_574_, i_575_, i_576_, i_577_, i_578_);
	}

	native void ox(int i, int i_579_, int i_580_, int i_581_);

	public void method5010(int i, int i_582_, int i_583_, int i_584_, int i_585_, int i_586_, int i_587_) {
		method5571().method286(this, i, i_582_, i_583_, i_584_, i_585_, i_586_, i_587_);
	}

	public int method5170(int i, int i_588_) {
		return i | i_588_;
	}

	public void method5090(int i, int i_589_, int i_590_, int i_591_) {
		((ja) this).aFloat6695 = (float) i_590_ / 2.0F;
		((ja) this).aFloat6694 = (float) i_591_ / 2.0F;
		((ja) this).aFloat6687 = (float) i + ((ja) this).aFloat6695;
		((ja) this).aFloat6691 = (float) i_589_ + ((ja) this).aFloat6694;
		A(i, i_589_, i_590_, i_591_);
	}

	public Matrix3f method5171() {
		return ((ja) this).aClass222_6688;
	}

	public Matrix4f method5172() {
		return ((ja) this).aClass233_6690;
	}

	public Matrix4f method5124() {
		return ((ja) this).aClass233_6690;
	}

	public int method5177() {
		return 4;
	}

	public native void hs(float f);

	public native void go(int i, Class_ta class_ta, int i_592_, int i_593_);

	native void ms(Interface_ma interface_ma, int i, int i_594_);

	native void mx(Interface_ma interface_ma, int i, int i_595_);

	public void method5085(boolean bool) {
		/* empty */
	}

	native void me(int i, int i_596_, int i_597_, int i_598_, int i_599_, int i_600_);

	native void mz(int i, int i_601_, int i_602_, int i_603_, int i_604_, int i_605_, Class_ta class_ta, int i_606_, int i_607_);

	public Matrix3f method5183() {
		return ((ja) this).aClass222_6696;
	}

	public Class57 method5107(Class89 class89, boolean bool) {
		fa var_fa = new fa(this, class89.anIntArray817, class89.aByteArray818, class89.aByteArray819, 0, class89.anInt812, class89.anInt812, class89.anInt816);
		var_fa.method621(class89.anInt815, class89.anInt811, class89.anInt814, class89.anInt813);
		return var_fa;
	}

	native void mn();

	native void ne();

	public Class387 method5116(Model model, int i, int i_608_, int i_609_, int i_610_) {
		return new h(this, ((ja) this).aBa6682, model, i, i_608_, i_609_, i_610_);
	}

	native void ng(int i);

	native void nt(Class_v class_v);

	native void nl(Class_v class_v);

	native void nh(int i, int[] is, float[] fs);

	public void method5061(boolean bool) {
		/* empty */
	}

	native void no(short i, short i_611_, int i_612_, byte i_613_, byte i_614_, int i_615_, boolean bool, byte i_616_, byte i_617_, byte i_618_, byte i_619_, boolean bool_620_, boolean bool_621_, boolean bool_622_, boolean bool_623_, boolean bool_624_, byte i_625_, boolean bool_626_, boolean bool_627_, int i_628_);

	public Class_ta method5034(int i, int i_629_, int[] is, int[] is_630_) {
		return new wa(this, ((ja) this).aBa6682, i, i_629_, is, is_630_);
	}

	native void ni(short i, short i_631_, int i_632_, byte i_633_, byte i_634_, int i_635_, boolean bool, byte i_636_, byte i_637_, byte i_638_, byte i_639_, boolean bool_640_, boolean bool_641_, boolean bool_642_, boolean bool_643_, boolean bool_644_, byte i_645_, boolean bool_646_, boolean bool_647_, int i_648_);

	native void nu(za var_za);

	native void np(long l, long l_649_);

	native void ny(long l, long l_650_);

	native void mb(int i, int i_651_, int i_652_, int i_653_, int i_654_, int i_655_, Class_ta class_ta, int i_656_, int i_657_);

	native void nj();

	native void nw();

	native void nx(int i, int i_658_, int i_659_, int i_660_);

	native void nk(int i, int i_661_, int i_662_, int i_663_);

	native void nc(int i, int[] is, float[] fs);

	public Class_xa method5040(int i, int i_664_, int[][] is, int[][] is_665_, int i_666_, int i_667_, int i_668_) {
		return new i(this, ((ja) this).aBa6682, i, i_664_, is, is_665_, i_666_, i_667_, i_668_);
	}

	public boolean method5111() {
		return true;
	}

	public int method5100(int i, int i_669_, int i_670_, int i_671_, int i_672_, int i_673_) {
		int i_674_ = 0;
		float f = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_669_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_670_));
		float f_675_ = (((ja) this).aClass233_6683.aFloatArray2594[14] + ((ja) this).aClass233_6683.aFloatArray2594[2] * (float) i_671_ + ((ja) this).aClass233_6683.aFloatArray2594[6] * (float) i_672_ + (((ja) this).aClass233_6683.aFloatArray2594[10] * (float) i_673_));
		float f_676_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_669_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_670_));
		float f_677_ = (((ja) this).aClass233_6683.aFloatArray2594[15] + ((ja) this).aClass233_6683.aFloatArray2594[3] * (float) i_671_ + ((ja) this).aClass233_6683.aFloatArray2594[7] * (float) i_672_ + (((ja) this).aClass233_6683.aFloatArray2594[11] * (float) i_673_));
		if (f < -f_676_ && f_675_ < -f_677_)
			i_674_ |= 0x10;
		else if (f > f_676_ && f_675_ > f_677_)
			i_674_ |= 0x20;
		float f_678_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_669_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_670_));
		float f_679_ = (((ja) this).aClass233_6683.aFloatArray2594[12] + ((ja) this).aClass233_6683.aFloatArray2594[0] * (float) i_671_ + ((ja) this).aClass233_6683.aFloatArray2594[4] * (float) i_672_ + (((ja) this).aClass233_6683.aFloatArray2594[8] * (float) i_673_));
		if (f_678_ < -f_676_ && f_679_ < -f_677_)
			i_674_ |= 0x1;
		if (f_678_ > f_676_ && f_679_ > f_677_)
			i_674_ |= 0x2;
		float f_680_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_669_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_670_));
		float f_681_ = (((ja) this).aClass233_6683.aFloatArray2594[13] + ((ja) this).aClass233_6683.aFloatArray2594[1] * (float) i_671_ + ((ja) this).aClass233_6683.aFloatArray2594[5] * (float) i_672_ + (((ja) this).aClass233_6683.aFloatArray2594[9] * (float) i_673_));
		if (f_680_ < -f_676_ && f_681_ < -f_677_)
			i_674_ |= 0x4;
		if (f_680_ > f_676_ && f_681_ > f_677_)
			i_674_ |= 0x8;
		return i_674_;
	}

	public void method5098(int i, int i_682_, int i_683_, int i_684_, int i_685_, int i_686_, Class_ta class_ta, int i_687_, int i_688_, int i_689_, int i_690_, int i_691_) {
		/* empty */
	}

	public final void method5058(int i, Class78 class78) {
		JA(i, class78.anInt726 * -1212608691, class78.anInt725 * 1996750669, class78.anInt727 * -1475891183);
	}

	native void wa(float[] fs);

	native void F(short i, int[] is, short i_692_, int i_693_, byte i_694_, byte i_695_, int i_696_, boolean bool, byte i_697_, byte i_698_, byte i_699_, byte i_700_, boolean bool_701_, boolean bool_702_, boolean bool_703_, boolean bool_704_, boolean bool_705_, byte i_706_, boolean bool_707_, boolean bool_708_, int i_709_);

	native void ou(int i, int i_710_, int i_711_, int i_712_);

	native void oj(int i, int i_713_, int i_714_, int i_715_);

	public native void ma(boolean bool);

	native void oz(int i, int i_716_, int i_717_, int i_718_);
}
