/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class a implements Interface25 {
	Runnable aRunnable6669;
	ja aJa6670;
	long nativeid;
	h[] aHArray6671 = new h[7];
	h[] aHArray6672 = new h[7];
	Matrix4f aClass233_6673;

	public void ma(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	native void i(long l, long l_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean[][] bools);

	native void bv(long l, long l_7_, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean[][] bools);

	native void ha(long l, GraphicsToolkit class_ra, int i, int i_14_);

	Class387 method276(h var_h, byte i, int i_15_, boolean bool) {
		boolean bool_16_ = false;
		h var_h_17_;
		h var_h_18_;
		if (i > 0 && i <= 7) {
			var_h_18_ = ((a) this).aHArray6672[i - 1];
			var_h_17_ = ((a) this).aHArray6671[i - 1];
			bool_16_ = true;
		} else
			var_h_17_ = var_h_18_ = new h(((a) this).aJa6670);
		var_h.BA(var_h_17_, var_h_18_, i_15_, bool_16_, bool);
		((h) var_h_17_).aClass85Array6677 = ((h) var_h).aClass85Array6677;
		((h) var_h_17_).aClass68Array6676 = ((h) var_h).aClass68Array6676;
		return var_h_17_;
	}

	void method277() {
		JA(((a) this).nativeid);
	}

	void method278(GraphicsToolkit class_ra, int[] is, int[] is_19_, int[] is_20_, short[] is_21_, int i) {
		b(((a) this).nativeid, class_ra, is, is_19_, is_20_, is_21_, i);
	}

	native void b(long l, GraphicsToolkit class_ra, int[] is, int[] is_22_, int[] is_23_, short[] is_24_, int i);

	native void P(long l, long l_25_, long l_26_, int i, int i_27_, int i_28_, boolean bool);

	void method279(Class387 class387, Matrix3f class222, int[] is, int i) {
		((a) this).aClass233_6673.method2145(class222);
		wa(((a) this).nativeid, ((h) (h) class387).nativeid, ((a) this).aClass233_6673.aFloatArray2594, is, i);
	}

	native boolean ya(long l, long l_29_, int i, int i_30_, float[] fs, boolean bool);

	void method280(Class387 class387, int[] is, Matrix3f class222) {
		((a) this).aClass233_6673.method2145(class222);
		J(((a) this).nativeid, ((h) (h) class387).nativeid, is, ((a) this).aClass233_6673.aFloatArray2594);
	}

	native void JA(long l);

	void method281(Class_xa class_xa, int i, int i_31_) {
		v(((a) this).nativeid, ((i) (i) class_xa).nativeid, i, i_31_);
	}

	native void v(long l, long l_32_, int i, int i_33_);

	void method282(Class_xa class_xa, int i, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, boolean[][] bools) {
		i(((a) this).nativeid, ((i) (i) class_xa).nativeid, i, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_, bools);
	}

	native void K(long l, GraphicsToolkit class_ra, int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_);

	native void c(long l, GraphicsToolkit class_ra, int i, int i_46_);

	native void m(long l, GraphicsToolkit class_ra, int i, int i_47_);

	native void w(long l, GraphicsToolkit class_ra, int i, int i_48_);

	native void j(long l, boolean bool);

	void method283() {
		((a) this).aRunnable6669 = Thread.currentThread();
		method277();
	}

	native void ak(long l);

	native void wa(long l, long l_49_, float[] fs, int[] is, int i);

	native void ao(long l, GraphicsToolkit class_ra, int[] is, int[] is_50_, int[] is_51_, short[] is_52_, int i);

	native void ad(long l, GraphicsToolkit class_ra, int[] is, int[] is_53_, int[] is_54_, short[] is_55_, int i);

	native void av(long l, GraphicsToolkit class_ra, int[] is, int[] is_56_, int[] is_57_, short[] is_58_, int i);

	native void at(long l, GraphicsToolkit class_ra, int[] is, int[] is_59_, int[] is_60_, short[] is_61_, int i);

	native void ah(long l, GraphicsToolkit class_ra, int[] is, int[] is_62_, int[] is_63_, short[] is_64_, int i);

	native void bp(long l, long l_65_, int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, boolean[][] bools);

	native void ap(long l, GraphicsToolkit class_ra, int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_);

	a(ja var_ja, int i, int i_78_) {
		((a) this).aJa6670 = var_ja;
		for (int i_79_ = 0; i_79_ < 7; i_79_++) {
			((a) this).aHArray6671[i_79_] = new h(((a) this).aJa6670);
			((a) this).aHArray6672[i_79_] = new h(((a) this).aJa6670);
		}
		((a) this).aClass233_6673 = new Matrix4f();
		ha(((a) this).nativeid, var_ja, i, i_78_);
	}

	native void ab(long l, long l_80_, long l_81_, int i, int i_82_, int i_83_, boolean bool);

	native void aj(long l, long l_84_, long l_85_, int i, int i_86_, int i_87_, boolean bool);

	boolean method284(Class387 class387, int i, int i_88_, Matrix3f class222, boolean bool) {
		((a) this).aClass233_6673.method2145(class222);
		return ya(((a) this).nativeid, ((h) (h) class387).nativeid, i, i_88_, ((a) this).aClass233_6673.aFloatArray2594, bool);
	}

	native void au(long l, long l_89_, float[] fs, int[] is, int i);

	native void ar(long l, long l_90_, float[] fs, int[] is, int i);

	native void ac(long l, long l_91_, float[] fs, int[] is, int i);

	native void J(long l, long l_92_, int[] is, float[] fs);

	void method285(Class387 class387, Class387 class387_93_, int i, int i_94_, int i_95_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class387).nativeid, ((h) (h) class387_93_).nativeid, i, i_94_, i_95_, bool);
	}

	native void as(long l, GraphicsToolkit class_ra, int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_);

	native void o(long l, boolean bool);

	native void bo(long l, long l_102_, int[] is, float[] fs);

	native void bb(long l, long l_103_, int[] is, float[] fs);

	native boolean bf(long l, long l_104_, int i, int i_105_, float[] fs, boolean bool);

	native boolean bd(long l, long l_106_, int i, int i_107_, float[] fs, boolean bool);

	native void R(long l, boolean bool);

	void method286(GraphicsToolkit class_ra, int i, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_) {
		K(((a) this).nativeid, class_ra, i, i_108_, i_109_, i_110_, i_111_, i_112_, i_113_);
	}

	public void z(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	native void bh(long l, long l_114_, int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, boolean[][] bools);
}
