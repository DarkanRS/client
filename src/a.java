/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class a implements Interface40 {
	long nativeid;
	h[] ahArray47;
	Runnable aRunnable48;
	h[] ahArray49 = new h[7];
	ja aja50;
	Class384 aClass384_51;

	void method306(MeshRasterizer class528, MeshRasterizer class528_0_, int i, int i_1_, int i_2_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class528).nativeid, ((h) (h) class528_0_).nativeid, i, i_1_, i_2_, bool);
	}

	void method307() {
		((a) this).aRunnable48 = Thread.currentThread();
		method310();
	}

	native void ha(long l, GraphicalRenderer class505, int i, int i_3_);

	public void finalize() {
		if (((a) this).nativeid != 0L)
			Class156.method2642(this, (byte) 27);
	}

	boolean method308(MeshRasterizer class528, int i, int i_4_, Class294 class294, boolean bool) {
		((a) this).aClass384_51.method6522(class294);
		return ya(((a) this).nativeid, ((h) (h) class528).nativeid, i, i_4_, ((a) this).aClass384_51.aFloatArray4667, bool);
	}

	public void ma(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	native void R(long l, boolean bool);

	native void b(long l, GraphicalRenderer class505, int[] is, int[] is_5_, int[] is_6_, short[] is_7_, int i);

	native void ac(long l, GraphicalRenderer class505, int[] is, int[] is_8_, int[] is_9_, short[] is_10_, int i);

	void method309(GraphicalRenderer class505, int[] is, int[] is_11_, int[] is_12_, short[] is_13_, int i) {
		b(((a) this).nativeid, class505, is, is_11_, is_12_, is_13_, i);
	}

	void method310() {
		JA(((a) this).nativeid);
	}

	void method311(GraphicalRenderer class505, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		K(((a) this).nativeid, class505, i, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_);
	}

	boolean method312(MeshRasterizer class528, int i, int i_20_, Class294 class294, boolean bool) {
		((a) this).aClass384_51.method6522(class294);
		return ya(((a) this).nativeid, ((h) (h) class528).nativeid, i, i_20_, ((a) this).aClass384_51.aFloatArray4667, bool);
	}

	void method313(MeshRasterizer class528, MeshRasterizer class528_21_, int i, int i_22_, int i_23_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class528).nativeid, ((h) (h) class528_21_).nativeid, i, i_22_, i_23_, bool);
	}

	native void aq(long l, long l_24_, int[] is, float[] fs);

	void method314(MeshRasterizer class528, Class294 class294, int[] is, int i) {
		((a) this).aClass384_51.method6522(class294);
		wa(((a) this).nativeid, ((h) (h) class528).nativeid, ((a) this).aClass384_51.aFloatArray4667, is, i);
	}

	native void wa(long l, long l_25_, float[] fs, int[] is, int i);

	boolean method315(MeshRasterizer class528, int i, int i_26_, Class294 class294, boolean bool) {
		((a) this).aClass384_51.method6522(class294);
		return ya(((a) this).nativeid, ((h) (h) class528).nativeid, i, i_26_, ((a) this).aClass384_51.aFloatArray4667, bool);
	}

	native boolean ya(long l, long l_27_, int i, int i_28_, float[] fs, boolean bool);

	native void a(long l);

	native void J(long l, long l_29_, int[] is, float[] fs);

	void method316(Class390 class390, int i, int i_30_) {
		v(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_30_);
	}

	void method317(Class390 class390, int i, int i_31_) {
		v(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_31_);
	}

	void method318(Class390 class390, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, boolean[][] bools) {
		i(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, bools);
	}

	native void v(long l, long l_38_, int i, int i_39_);

	void method319() {
		if (((a) this).nativeid != 0L)
			Class156.method2642(this, (byte) 82);
	}

	void method320() {
		if (((a) this).nativeid != 0L)
			Class156.method2642(this, (byte) 18);
	}

	native void bs(long l, long l_40_, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, boolean[][] bools);

	public void x(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	void method321(MeshRasterizer class528, int[] is, Class294 class294) {
		((a) this).aClass384_51.method6522(class294);
		J(((a) this).nativeid, ((h) (h) class528).nativeid, is, ((a) this).aClass384_51.aFloatArray4667);
	}

	void method322() {
		((a) this).aRunnable48 = Thread.currentThread();
		method310();
	}

	native void s(long l, GraphicalRenderer class505, int i, int i_47_);

	native void i(long l, long l_48_, int i, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, boolean[][] bools);

	native void bz(long l, long l_55_, int i, int i_56_);

	void method323() {
		JA(((a) this).nativeid);
	}

	void method324() {
		JA(((a) this).nativeid);
	}

	native void d(long l);

	MeshRasterizer method325(h var_h, byte i, int i_57_, boolean bool) {
		boolean bool_58_ = false;
		h var_h_59_;
		h var_h_60_;
		if (i > 0 && i <= 7) {
			var_h_60_ = ((a) this).ahArray47[i - 1];
			var_h_59_ = ((a) this).ahArray49[i - 1];
			bool_58_ = true;
		} else
			var_h_59_ = var_h_60_ = new h(((a) this).aja50);
		var_h.BA(var_h_59_, var_h_60_, i_57_, bool_58_, bool);
		((h) var_h_59_).aClass87Array7139 = ((h) var_h).aClass87Array7139;
		((h) var_h_59_).aClass172Array7142 = ((h) var_h).aClass172Array7142;
		return var_h_59_;
	}

	void method326(GraphicalRenderer class505, int[] is, int[] is_61_, int[] is_62_, short[] is_63_, int i) {
		b(((a) this).nativeid, class505, is, is_61_, is_62_, is_63_, i);
	}

	native void au(long l, GraphicalRenderer class505, int[] is, int[] is_64_, int[] is_65_, short[] is_66_, int i);

	native void ay(long l, GraphicalRenderer class505, int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_);

	native void at(long l, GraphicalRenderer class505, int[] is, int[] is_73_, int[] is_74_, short[] is_75_, int i);

	void method327(GraphicalRenderer class505, int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		K(((a) this).nativeid, class505, i, i_76_, i_77_, i_78_, i_79_, i_80_, i_81_);
	}

	boolean method328(MeshRasterizer class528, int i, int i_82_, Class294 class294, boolean bool) {
		((a) this).aClass384_51.method6522(class294);
		return ya(((a) this).nativeid, ((h) (h) class528).nativeid, i, i_82_, ((a) this).aClass384_51.aFloatArray4667, bool);
	}

	native void K(long l, GraphicalRenderer class505, int i, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_);

	void method329() {
		((a) this).aRunnable48 = Thread.currentThread();
		method310();
	}

	void method330(MeshRasterizer class528, MeshRasterizer class528_89_, int i, int i_90_, int i_91_, boolean bool) {
		P(((a) this).nativeid, ((h) (h) class528).nativeid, ((h) (h) class528_89_).nativeid, i, i_90_, i_91_, bool);
	}

	native void aw(long l, long l_92_, long l_93_, int i, int i_94_, int i_95_, boolean bool);

	native void az(long l, long l_96_, long l_97_, int i, int i_98_, int i_99_, boolean bool);

	void method331(MeshRasterizer class528, int[] is, Class294 class294) {
		((a) this).aClass384_51.method6522(class294);
		J(((a) this).nativeid, ((h) (h) class528).nativeid, is, ((a) this).aClass384_51.aFloatArray4667);
	}

	void method332(MeshRasterizer class528, Class294 class294, int[] is, int i) {
		((a) this).aClass384_51.method6522(class294);
		wa(((a) this).nativeid, ((h) (h) class528).nativeid, ((a) this).aClass384_51.aFloatArray4667, is, i);
	}

	void method333(MeshRasterizer class528, Class294 class294, int[] is, int i) {
		((a) this).aClass384_51.method6522(class294);
		wa(((a) this).nativeid, ((h) (h) class528).nativeid, ((a) this).aClass384_51.aFloatArray4667, is, i);
	}

	void method334(MeshRasterizer class528, Class294 class294, int[] is, int i) {
		((a) this).aClass384_51.method6522(class294);
		wa(((a) this).nativeid, ((h) (h) class528).nativeid, ((a) this).aClass384_51.aFloatArray4667, is, i);
	}

	boolean method335(MeshRasterizer class528, int i, int i_100_, Class294 class294, boolean bool) {
		((a) this).aClass384_51.method6522(class294);
		return ya(((a) this).nativeid, ((h) (h) class528).nativeid, i, i_100_, ((a) this).aClass384_51.aFloatArray4667, bool);
	}

	native void ah(long l, long l_101_, float[] fs, int[] is, int i);

	native void ai(long l, long l_102_, float[] fs, int[] is, int i);

	native void P(long l, long l_103_, long l_104_, int i, int i_105_, int i_106_, boolean bool);

	void method336(GraphicalRenderer class505, int i, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_) {
		K(((a) this).nativeid, class505, i, i_107_, i_108_, i_109_, i_110_, i_111_, i_112_);
	}

	native void k(long l, GraphicalRenderer class505, int i, int i_113_);

	native void JA(long l);

	void method337(MeshRasterizer class528, int[] is, Class294 class294) {
		((a) this).aClass384_51.method6522(class294);
		J(((a) this).nativeid, ((h) (h) class528).nativeid, is, ((a) this).aClass384_51.aFloatArray4667);
	}

	void method338(MeshRasterizer class528, int[] is, Class294 class294) {
		((a) this).aClass384_51.method6522(class294);
		J(((a) this).nativeid, ((h) (h) class528).nativeid, is, ((a) this).aClass384_51.aFloatArray4667);
	}

	void method339(Class390 class390, int i, int i_114_) {
		v(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_114_);
	}

	public void y(boolean bool) {
		R(((a) this).nativeid, bool);
	}

	void method340(Class390 class390, int i, int i_115_) {
		v(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_115_);
	}

	a(ja var_ja, int i, int i_116_) {
		((a) this).ahArray47 = new h[7];
		((a) this).aja50 = var_ja;
		for (int i_117_ = 0; i_117_ < 7; i_117_++) {
			((a) this).ahArray49[i_117_] = new h(((a) this).aja50);
			((a) this).ahArray47[i_117_] = new h(((a) this).aja50);
		}
		((a) this).aClass384_51 = new Class384();
		ha(((a) this).nativeid, var_ja, i, i_116_);
	}

	void method341(Class390 class390, int i, int i_118_) {
		v(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_118_);
	}

	void method342(Class390 class390, int i, int i_119_) {
		v(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_119_);
	}

	void method343(MeshRasterizer class528, Class294 class294, int[] is, int i) {
		((a) this).aClass384_51.method6522(class294);
		wa(((a) this).nativeid, ((h) (h) class528).nativeid, ((a) this).aClass384_51.aFloatArray4667, is, i);
	}

	void method344(Class390 class390, int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, boolean[][] bools) {
		i(((a) this).nativeid, ((i) (i) class390).nativeid, i, i_120_, i_121_, i_122_, i_123_, i_124_, i_125_, bools);
	}

	native void bm(long l, long l_126_, int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, boolean[][] bools);

	native void u(long l, GraphicalRenderer class505, int i, int i_133_);
}
