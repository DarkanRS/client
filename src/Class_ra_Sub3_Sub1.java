/* Class_ra_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class_ra_Sub3_Sub1 extends Class_ra_Sub3 {
	Class458 aClass458_9815;
	Class458 aClass458_9816 = new Class458();
	Class458 aClass458_9817 = new Class458();
	Class458 aClass458_9818 = new Class458();
	Class458 aClass458_9819 = new Class458();
	Class458 aClass458_9820 = new Class458();
	Class458 aClass458_9821 = new Class458();
	float[] aFloatArray9822;
	long aLong9823;
	int[] anIntArray9824;
	boolean aBoolean9825;
	OpenGL anOpenGL9826;
	Class246_Sub1 aClass246_Sub1_9827;
	int anInt9828;
	Class246_Sub2[] aClass246_Sub2Array9829;
	boolean aBoolean9830;
	int[] anIntArray9831;
	Class110_Sub2 aClass110_Sub2_9832;
	String aString9833;
	String aString9834;
	int anInt9835;
	boolean aBoolean9836;
	boolean aBoolean9837;
	boolean aBoolean9838;
	boolean aBoolean9839;
	boolean aBoolean9840;
	int anInt9841;
	boolean aBoolean9842;
	float[] aFloatArray9843;

	void method5506(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	public Class123 method5297(String string) {
		byte[] is = method5535(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub2(this, class109);
	}

	public boolean method5295() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9839;
	}

	public boolean method5483() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9840;
	}

	Class_ra_Sub3_Sub1(OpenGL opengl, Canvas canvas, long l, Interface_ma interface_ma, Class243 class243, int i) {
		super(interface_ma, class243, i, 1);
		((Class_ra_Sub3_Sub1) this).aClass458_9815 = new Class458();
		((Class_ra_Sub3_Sub1) this).anIntArray9824 = new int[1000];
		((Class_ra_Sub3_Sub1) this).aClass246_Sub2Array9829 = new Class246_Sub2[16];
		new MapBuffer();
		new MapBuffer();
		((Class_ra_Sub3_Sub1) this).aFloatArray9822 = new float[4];
		((Class_ra_Sub3_Sub1) this).aFloatArray9843 = new float[16];
		int[] is = new int[1];
		try {
			((Class_ra_Sub3_Sub1) this).anOpenGL9826 = opengl;
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.f();
			((Class_ra_Sub3_Sub1) this).aString9833 = OpenGL.glGetString(7936).toLowerCase();
			((Class_ra_Sub3_Sub1) this).aString9834 = OpenGL.glGetString(7937).toLowerCase();
			if ((((Class_ra_Sub3_Sub1) this).aString9833.indexOf("microsoft") != -1) || ((Class_ra_Sub3_Sub1) this).aString9833.indexOf("brian paul") != -1 || (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("mesa") != -1))
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class365_Sub1_Sub3_Sub1.method4508(string.replace('.', ' '), ' ', 596361763);
			if (strings.length >= 2) {
				try {
					int i_0_ = Class216.method1998(strings[0], (short) -8751);
					int i_1_ = Class216.method1998(strings[1], (short) -22429);
					((Class_ra_Sub3_Sub1) this).anInt9835 = i_0_ * 10 + i_1_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (((Class_ra_Sub3_Sub1) this).anInt9835 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt8347 = is[0];
			if (anInt8347 < 2)
				throw new RuntimeException("");
			anInt8348 = 8;
			((Class_ra_Sub3_Sub1) this).aBoolean9825 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_vertex_buffer_object");
			aBoolean8350 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_multisample");
			((Class_ra_Sub3_Sub1) this).aBoolean9837 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_texture_rectangle");
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_texture_cube_map");
			((Class_ra_Sub3_Sub1) this).aBoolean9838 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_texture_non_power_of_two");
			aBoolean8365 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_EXT_texture3D");
			((Class_ra_Sub3_Sub1) this).aBoolean9839 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_vertex_shader");
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_vertex_program");
			((Class_ra_Sub3_Sub1) this).aBoolean9840 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_fragment_shader");
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_fragment_program");
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_EXT_framebuffer_object");
			((Class_ra_Sub3_Sub1) this).anIntArray9831 = new int[anInt8347];
			aBoolean8349 = ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_EXT_framebuffer_object");
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_EXT_framebuffer_blit");
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_EXT_framebuffer_multisample");
			if (!method5295() || !method5483()) {
				if (!((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			((Class_ra_Sub3_Sub1) this).anInt9841 = Stream.r() ? 33639 : 5121;
			if (((Class_ra_Sub3_Sub1) this).aString9834.indexOf("radeon") != -1) {
				int i_2_ = 0;
				boolean bool = false;
				boolean bool_3_ = false;
				String[] strings_4_ = (Class365_Sub1_Sub3_Sub1.method4508(((Class_ra_Sub3_Sub1) this).aString9834.replace('/', ' '), ' ', 1460614940));
				for (int i_5_ = 0; i_5_ < strings_4_.length; i_5_++) {
					String string_6_ = strings_4_[i_5_];
					try {
						if (string_6_.length() <= 0)
							continue;
						if (string_6_.charAt(0) == 'x' && string_6_.length() >= 3 && Class51.method543(string_6_.substring(1, 3), 2144198876)) {
							string_6_ = string_6_.substring(1);
							bool_3_ = true;
						}
						if (string_6_.equals("hd")) {
							bool = true;
							continue;
						}
						if (string_6_.startsWith("hd")) {
							string_6_ = string_6_.substring(2);
							bool = true;
						}
						if (string_6_.length() < 4 || !Class51.method543(string_6_.substring(0, 4), 1769588700))
							continue;
						i_2_ = Class216.method1998(string_6_.substring(0, 4), (short) 5801);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (!bool_3_ && !bool) {
					if (i_2_ >= 7000 && i_2_ <= 7999)
						((Class_ra_Sub3_Sub1) this).aBoolean9825 = false;
					if (i_2_ >= 7000 && i_2_ <= 9250)
						aBoolean8365 = false;
				}
				((Class_ra_Sub3_Sub1) this).aBoolean9837 &= ((Class_ra_Sub3_Sub1) this).anOpenGL9826.a("GL_ARB_half_float_pixel");
			}
			if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("intel") == -1) {
				/* empty */
			}
			if (((Class_ra_Sub3_Sub1) this).aBoolean9825) {
				try {
					int[] is_7_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_7_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			method5151(canvas, new Class52_Sub2_Sub2_Sub1(this, canvas, l), (byte) -28);
			method5003(canvas, (byte) -71);
			method5517(32768, false);
			method5517(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method5136(763787815);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	public void method5520(Matrix4f class233, Matrix4f class233_8_, Matrix4f class233_9_) {
		OpenGL.glMatrixMode(5888);
		aClass233_8236.method2143(class233, class233_8_);
		OpenGL.glLoadMatrixf(aClass233_8236.aFloatArray2594, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class233_9_.aFloatArray2594, 0);
	}

	void method5412() {
		if (aBoolean8331 && aBoolean8278 && anInt8233 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public boolean method5426() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9840;
	}

	public void method5075() {
		OpenGL.glFinish();
	}

	void method5023() {
		super.method5023();
		if (((Class_ra_Sub3_Sub1) this).anOpenGL9826 != null) {
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.b();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.release();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826 = null;
		}
	}

	public float method5315() {
		return 0.0F;
	}

	Class52_Sub2 method5006(Canvas canvas, int i, int i_10_) {
		return new Class52_Sub2_Sub2_Sub1(this, canvas);
	}

	public Class52_Sub1 method5094() {
		return new Class52_Sub1_Sub3_Sub1(this);
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_11_) {
		return new Class262(this, Class55.aClass55_561, Class77.aClass77_719, i, i_11_);
	}

	public int[] aq(int i, int i_12_, int i_13_, int i_14_) {
		int[] is = new int[i_13_ * i_14_];
		int i_15_ = aClass52_5292.method552();
		for (int i_16_ = 0; i_16_ < i_14_; i_16_++)
			OpenGL.glReadPixelsi(i, i_15_ - i_12_ - i_16_ - 1, i_13_, 1, 32993, ((Class_ra_Sub3_Sub1) this).anInt9841, is, i_16_ * i_13_);
		return is;
	}

	void method4989(int i, int i_17_) throws Exception_Sub1 {
		aClass52_Sub2_5312.method580();
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(1673401622);
	}

	void method5409(Interface7_Impl2 interface7_impl2) {
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827 = (Class246_Sub1) interface7_impl2;
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2333();
	}

	public void ba(int i, int i_18_) {
		int i_19_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_18_ & 0xff0000) / 1.671168E7F, (float) (i_18_ & 0xff00) / 65280.0F, (float) (i_18_ & 0xff) / 255.0F, (float) (i_18_ >>> 24) / 255.0F);
			i_19_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_19_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_19_ |= 0x400;
		OpenGL.glClear(i_19_);
	}

	void method5325() {
		if (aClass52_5292 != null)
			OpenGL.glViewport(anInt8275 + anInt8339, (anInt8276 + aClass52_5292.method552() - anInt8272 - anInt8239), anInt8273, anInt8239);
		OpenGL.glDepthRange(aFloat8335, aFloat8258);
	}

	void method5326() {
		if (aClass52_5292 != null) {
			int i = anInt8275 + anInt8265;
			int i_20_ = anInt8276 + aClass52_5292.method552() - anInt8241;
			int i_21_ = anInt8234 - anInt8265;
			int i_22_ = anInt8241 - anInt8263;
			if (i_21_ < 0)
				i_21_ = 0;
			if (i_22_ < 0)
				i_22_ = 0;
			OpenGL.glScissor(i, i_20_, i_21_, i_22_);
		}
	}

	void method5327() {
		if (aBoolean8254)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method5300(Matrix4f class233, Matrix4f class233_23_, Matrix4f class233_24_) {
		OpenGL.glMatrixMode(5888);
		aClass233_8236.method2143(class233, class233_23_);
		OpenGL.glLoadMatrixf(aClass233_8236.aFloatArray2594, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class233_24_.aFloatArray2594, 0);
	}

	public Class66 method5142(Class66 class66, Class66 class66_25_, float f, Class66 class66_26_) {
		return f < 0.5F ? class66 : class66_25_;
	}

	void method5340() {
		if (aBoolean8279)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method5422() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8283, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8248, 0);
	}

	void method5451() {
		if (aBoolean8279)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method5429() {
		if (aBoolean8254)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public final void method5513(Class187 class187, int i, int i_27_) {
		int i_28_;
		int i_29_;
		if (class187 == Class187.aClass187_1908) {
			i_28_ = 1;
			i_29_ = i_27_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_28_ = 3;
			i_29_ = i_27_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_28_ = 4;
			i_29_ = i_27_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_28_ = 6;
			i_29_ = i_27_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_28_ = 5;
			i_29_ = i_27_ + 2;
		} else {
			i_28_ = 0;
			i_29_ = i_27_;
		}
		OpenGL.glDrawArrays(i_28_, i, i_29_);
	}

	void method5320() {
		/* empty */
	}

	void method5347() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		int i;
		for (i = 0; i < anInt8296; i++) {
			Class298_Sub10 class298_sub10 = aClass298_Sub10Array8286[i];
			int i_30_ = class298_sub10.method2898(-1132212405);
			int i_31_ = 16386 + i;
			float f = class298_sub10.method2901(608404512) / 255.0F;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) class298_sub10.method2895(823958259);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) class298_sub10.method2894(32231990);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) class298_sub10.method2897((byte) 56);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
			OpenGL.glLightfv(i_31_, 4611, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (i_30_ >> 16 & 0xff) * f;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (i_30_ >> 8 & 0xff) * f;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (i_30_ & 0xff) * f;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
			OpenGL.glLightfv(i_31_, 4609, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
			OpenGL.glLightf(i_31_, 4617, (1.0F / (float) (class298_sub10.method2900(-1643829054) * class298_sub10.method2900(-1735214490))));
			OpenGL.glEnable(i_31_);
		}
		for (/**/; i < anInt8295; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method5348(Class55 class55, Class77 class77) {
		return true;
	}

	boolean method5349(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	Interface9_Impl2 method5355(int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1989757601) && Class486.method6152(i_32_, 2122498233)))
			return new Class263_Sub1(this, i, i_32_, bool, is, i_33_, i_34_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, i, i_32_, is, i_33_, i_34_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, Class55.aClass55_557, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_32_, (byte) 16));
		class263_sub1.method81(0, 0, i, i_32_, is, i_33_, i_34_);
		return class263_sub1;
	}

	Interface9_Impl2 method5439(Class55 class55, int i, int i_35_, boolean bool, byte[] is, int i_36_, int i_37_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1826170596) && Class486.method6152(i_35_, 2001166662)))
			return new Class263_Sub1(this, class55, i, i_35_, bool, is, i_36_, i_37_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_35_, is, i_36_, i_37_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_35_, (byte) 16));
		class263_sub1.method82(0, 0, i, i_35_, is, class55, i_36_, i_37_);
		return class263_sub1;
	}

	Class153 method5447(Class181[] class181s) {
		return new Class153_Sub1(class181s);
	}

	Interface9_Impl2_Impl1 method5356(Class55 class55, Class77 class77, int i, int i_38_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2107127417) && Class486.method6152(i_38_, 2084635583)))
			return new Class263_Sub1(this, class55, class77, i, i_38_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, class77, i, i_38_);
		return new Class263_Sub1(this, class55, class77, Class416.method5590(i, (byte) 16), Class416.method5590(i_38_, (byte) 16));
	}

	Interface9_Impl1 method5415(int i, boolean bool, int[][] is) {
		return new Class263_Sub3(this, i, bool, is);
	}

	Interface9_Impl3 method5416(Class55 class55, int i, int i_39_, int i_40_, boolean bool, byte[] is) {
		return new Class263_Sub2(this, class55, i, i_39_, i_40_, bool, is);
	}

	public void method5359() {
		int i = ((Class_ra_Sub3_Sub1) this).anIntArray9831[anInt8325];
		if (i != 0) {
			((Class_ra_Sub3_Sub1) this).anIntArray9831[anInt8325] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method5486() {
		OpenGL.glMatrixMode(5890);
		if (aClass171Array8305[anInt8325] != Class171.aClass171_1742)
			OpenGL.glLoadMatrixf(aClass233Array8304[anInt8325].method2173(((Class_ra_Sub3_Sub1) this).aFloatArray9843), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method5371() {
		OpenGL.glActiveTexture(33984 + anInt8325);
	}

	void method5372() {
		OpenGL.glTexEnvi(8960, 34161, method5526(aClass175Array8294[anInt8325]));
	}

	void method5444() {
		OpenGL.glTexEnvi(8960, 34162, method5526(aClass175Array8307[anInt8325]));
	}

	final void method5427(int i, Class183 class183, boolean bool, boolean bool_41_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5527(class183));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_41_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_41_ ? 769 : 768);
	}

	final void method5364(int i, Class183 class183, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method5527(class183));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	void method5518(int i) {
		OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	static final int method5526(Class175 class175) {
		if (class175 == Class175.aClass175_1770)
			return 7681;
		if (class175 == Class175.aClass175_1765)
			return 8448;
		if (class175 == Class175.aClass175_1769)
			return 34165;
		if (class175 == Class175.aClass175_1767)
			return 260;
		if (class175 == Class175.aClass175_1768)
			return 34023;
		throw new IllegalArgumentException();
	}

	static final int method5527(Class183 class183) {
		if (class183 == Class183.aClass183_1888)
			return 5890;
		if (class183 == Class183.aClass183_1889)
			return 34167;
		if (class183 == Class183.aClass183_1887)
			return 34168;
		if (class183 == Class183.aClass183_1890)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method5292(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public void fh(int i, int i_42_) {
		int i_43_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_42_ & 0xff0000) / 1.671168E7F, (float) (i_42_ & 0xff00) / 65280.0F, (float) (i_42_ & 0xff) / 255.0F, (float) (i_42_ >>> 24) / 255.0F);
			i_43_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_43_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_43_ |= 0x400;
		OpenGL.glClear(i_43_);
	}

	public void method5480() {
		int i = ((Class_ra_Sub3_Sub1) this).anIntArray9831[anInt8325];
		if (i != 0) {
			((Class_ra_Sub3_Sub1) this).anIntArray9831[anInt8325] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method5379() {
		if (aBoolean8331 && aBoolean8278 && anInt8233 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public Class66 method5179(Class66 class66, Class66 class66_44_, float f, Class66 class66_45_) {
		return f < 0.5F ? class66 : class66_44_;
	}

	void method5380(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	final Interface7_Impl1 method5382(boolean bool) {
		return new Class246_Sub2(this, bool);
	}

	public boolean method5425() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9840;
	}

	public void method5383(int i, Interface7_Impl1 interface7_impl1) {
		((Class_ra_Sub3_Sub1) this).aClass246_Sub2Array9829[i] = (Class246_Sub2) interface7_impl1;
	}

	void method5384(Interface7_Impl2 interface7_impl2) {
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827 = (Class246_Sub1) interface7_impl2;
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2333();
	}

	boolean method5465(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	final synchronized void method5528(int i) {
		Class298_Sub35 class298_sub35 = new Class298_Sub35(i);
		((Class_ra_Sub3_Sub1) this).aClass458_9819.method5968(class298_sub35, 1815318204);
	}

	public final void method5392(Class187 class187, int i, int i_46_, int i_47_, int i_48_) {
		int i_49_;
		int i_50_;
		if (class187 == Class187.aClass187_1908) {
			i_49_ = 1;
			i_50_ = i_48_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_49_ = 3;
			i_50_ = i_48_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_49_ = 4;
			i_50_ = i_48_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_49_ = 6;
			i_50_ = i_48_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_49_ = 5;
			i_50_ = i_48_ + 2;
		} else {
			i_49_ = 0;
			i_50_ = i_48_;
		}
		Class77 class77 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2335();
		OpenGL.glDrawElements(i_49_, i_50_, method5537(class77), (((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2332() + (long) (i_47_ * (class77.anInt724 * 685647847))));
	}

	void method5494() {
		OpenGL.glTexEnvi(8960, 34161, method5526(aClass175Array8294[anInt8325]));
	}

	public Class66 method4986(Class66 class66, Class66 class66_51_, float f, Class66 class66_52_) {
		return f < 0.5F ? class66 : class66_51_;
	}

	final synchronized void method5529(int i, int i_53_) {
		Class298_Sub35 class298_sub35 = new Class298_Sub35(i_53_);
		class298_sub35.linkedKey = (long) i * 4191220306876042991L;
		((Class_ra_Sub3_Sub1) this).aClass458_9818.method5968(class298_sub35, 454001625);
	}

	public int[] ev(int i, int i_54_, int i_55_, int i_56_) {
		int[] is = new int[i_55_ * i_56_];
		int i_57_ = aClass52_5292.method552();
		for (int i_58_ = 0; i_58_ < i_56_; i_58_++)
			OpenGL.glReadPixelsi(i, i_57_ - i_54_ - i_58_ - 1, i_55_, 1, 32993, ((Class_ra_Sub3_Sub1) this).anInt9841, is, i_58_ * i_55_);
		return is;
	}

	final synchronized void method5530(int i, int i_59_) {
		Class298_Sub35 class298_sub35 = new Class298_Sub35(i_59_);
		class298_sub35.linkedKey = (long) i * 4191220306876042991L;
		((Class_ra_Sub3_Sub1) this).aClass458_9820.method5968(class298_sub35, 228363819);
	}

	final synchronized void method5531(long l) {
		Linkable class298 = new Linkable();
		class298.linkedKey = l * 4191220306876042991L;
		((Class_ra_Sub3_Sub1) this).aClass458_9815.method5968(class298, 270678246);
	}

	public void method5455(Class153 class153) {
		Class181[] class181s = class153.aClass181Array6405;
		int i = 0;
		boolean bool = false;
		boolean bool_60_ = false;
		boolean bool_61_ = false;
		for (int i_62_ = 0; i_62_ < class181s.length; i_62_++) {
			Class181 class181 = class181s[i_62_];
			Class246_Sub2 class246_sub2 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub2Array9829[i_62_];
			int i_63_ = 0;
			int i_64_ = class246_sub2.method2336();
			long l = class246_sub2.method2332();
			class246_sub2.method2333();
			for (int i_65_ = 0; i_65_ < class181.method1842(); i_65_++) {
				Class155 class155 = class181.method1839(i_65_);
				switch (class155.anInt1604) {
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_64_, l + (long) i_63_);
					break;
				case 10:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_64_, l + (long) i_63_);
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_64_, l + (long) i_63_);
					break;
				case 0:
					OpenGL.glVertexPointer(3, 5126, i_64_, l + (long) i_63_);
					bool_61_ = true;
					break;
				case 11:
					OpenGL.glNormalPointer(5126, i_64_, l + (long) i_63_);
					bool_60_ = true;
					break;
				case 3:
					OpenGL.glColorPointer(4, 5121, i_64_, l + (long) i_63_);
					bool = true;
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_64_, l + (long) i_63_);
					break;
				}
				i_63_ += class155.anInt1611;
			}
		}
		if (((Class_ra_Sub3_Sub1) this).aBoolean9836 != bool_61_) {
			if (bool_61_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub3_Sub1) this).aBoolean9836 = bool_61_;
		}
		if (((Class_ra_Sub3_Sub1) this).aBoolean9842 != bool_60_) {
			if (bool_60_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub3_Sub1) this).aBoolean9842 = bool_60_;
		}
		if (((Class_ra_Sub3_Sub1) this).aBoolean9830 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub3_Sub1) this).aBoolean9830 = bool;
		}
		if (((Class_ra_Sub3_Sub1) this).anInt9828 < i) {
			for (int i_66_ = ((Class_ra_Sub3_Sub1) this).anInt9828; i_66_ < i; i_66_++) {
				OpenGL.glClientActiveTexture(33984 + i_66_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub3_Sub1) this).anInt9828 = i;
		} else if (((Class_ra_Sub3_Sub1) this).anInt9828 > i) {
			for (int i_67_ = i; i_67_ < ((Class_ra_Sub3_Sub1) this).anInt9828; i_67_++) {
				OpenGL.glClientActiveTexture(33984 + i_67_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub3_Sub1) this).anInt9828 = i;
		}
	}

	final Interface7_Impl2 method5381(boolean bool) {
		return new Class246_Sub1(this, Class77.aClass77_718, bool);
	}

	static int method5532(Class55 class55) {
		switch (class55.anInt566 * -976336893) {
		case 3:
			return 6410;
		case 9:
			return 6408;
		case 1:
			return 6409;
		case 5:
			return 6407;
		case 7:
			return 6406;
		default:
			throw new IllegalStateException();
		case 2:
			return 6402;
		}
	}

	static int method5533(Class55 class55, Class77 class77) {
		if (class77 == Class77.aClass77_717) {
			switch (class55.anInt566 * -976336893) {
			case 8:
				return 33777;
			case 5:
				return 6407;
			case 0:
				return 33779;
			case 3:
				return 6410;
			default:
				throw new IllegalArgumentException();
			case 9:
				return 6408;
			case 7:
				return 6406;
			case 1:
				return 6409;
			}
		}
		if (class77 == Class77.aClass77_718) {
			switch (class55.anInt566 * -976336893) {
			case 9:
				return 32859;
			case 2:
				return 33189;
			case 3:
				return 36219;
			case 1:
				return 32834;
			default:
				throw new IllegalArgumentException();
			case 5:
				return 32852;
			case 7:
				return 32830;
			}
		}
		if (class77 == Class77.aClass77_719) {
			switch (class55.anInt566 * -976336893) {
			default:
				throw new IllegalArgumentException();
			case 2:
				return 33190;
			}
		}
		if (class77 == Class77.aClass77_714) {
			switch (class55.anInt566 * -976336893) {
			case 1:
				return 34846;
			case 7:
				return 34844;
			default:
				throw new IllegalArgumentException();
			case 9:
				return 34842;
			case 5:
				return 34843;
			case 3:
				return 34847;
			}
		}
		if (class77 == Class77.aClass77_721) {
			switch (class55.anInt566 * -976336893) {
			case 5:
				return 34837;
			case 1:
				return 34840;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 34841;
			case 7:
				return 34838;
			case 9:
				return 34836;
			}
		}
		throw new IllegalArgumentException();
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	void method5394(int i) {
		OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public final void method5398(Class187 class187, int i, int i_68_) {
		int i_69_;
		int i_70_;
		if (class187 == Class187.aClass187_1908) {
			i_69_ = 1;
			i_70_ = i_68_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_69_ = 3;
			i_70_ = i_68_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_69_ = 4;
			i_70_ = i_68_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_69_ = 6;
			i_70_ = i_68_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_69_ = 5;
			i_70_ = i_68_ + 2;
		} else {
			i_69_ = 0;
			i_70_ = i_68_;
		}
		OpenGL.glDrawArrays(i_69_, i, i_70_);
	}

	void method5410() {
		OpenGL.glDepthMask(aBoolean8277 && aBoolean8237);
	}

	void method5411() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = aFloat8291 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = aFloat8291 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = aFloat8291 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	Class153 method5404(Class181[] class181s) {
		return new Class153_Sub1(class181s);
	}

	void method5345() {
		if (aBoolean8281) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public void method5067() {
		OpenGL.glFinish();
	}

	void method5009() {
		super.method5023();
		if (((Class_ra_Sub3_Sub1) this).anOpenGL9826 != null) {
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.b();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.release();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826 = null;
		}
	}

	void method5141() {
		super.method5023();
		if (((Class_ra_Sub3_Sub1) this).anOpenGL9826 != null) {
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.b();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.release();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826 = null;
		}
	}

	void method5068() {
		super.method5023();
		if (((Class_ra_Sub3_Sub1) this).anOpenGL9826 != null) {
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.b();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.release();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826 = null;
		}
	}

	void method5069() {
		super.method5023();
		if (((Class_ra_Sub3_Sub1) this).anOpenGL9826 != null) {
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.b();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826.release();
			((Class_ra_Sub3_Sub1) this).anOpenGL9826 = null;
		}
	}

	public final synchronized void method5174(int i) {
		int i_71_ = 0;
		i &= 0x7fffffff;
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9817.method5970((byte) 43)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9817.method5971(1808910647);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_71_++] = (int) (class298_sub35.linkedKey * 7051297995265073167L);
			anInt8224 -= class298_sub35.anInt7394 * -774922497;
			if (i_71_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_71_ = 0;
			}
		}
		if (i_71_ > 0) {
			OpenGL.glDeleteBuffersARB(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
			i_71_ = 0;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9818.method5970((byte) 46)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9818.method5971(1720149730);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_71_++] = (int) (class298_sub35.linkedKey * 7051297995265073167L);
			anInt8223 -= class298_sub35.anInt7394 * -774922497;
			if (i_71_ == 1000) {
				OpenGL.glDeleteTextures(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_71_ = 0;
			}
		}
		if (i_71_ > 0) {
			OpenGL.glDeleteTextures(i_71_, ((Class_ra_Sub3_Sub1) this).anIntArray9824, 0);
			i_71_ = 0;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9819.method5970((byte) 60)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9819.method5971(1586924584);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_71_++] = class298_sub35.anInt7394 * -774922497;
			if (i_71_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_71_ = 0;
			}
		}
		if (i_71_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
			i_71_ = 0;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9820.method5970((byte) 42)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9820.method5971(1650317601);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_71_++] = (int) (class298_sub35.linkedKey * 7051297995265073167L);
			anInt8318 -= class298_sub35.anInt7394 * -774922497;
			if (i_71_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_71_ = 0;
			}
		}
		if (i_71_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_71_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
			boolean bool = false;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9816.method5970((byte) 86)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9816.method5971(1832837170);
			OpenGL.glDeleteLists((int) (class298_sub35.linkedKey * 7051297995265073167L), class298_sub35.anInt7394 * -774922497);
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9821.method5970((byte) 48)) {
			Linkable class298 = ((Class_ra_Sub3_Sub1) this).aClass458_9821.method5971(1814788261);
			OpenGL.glDeleteProgram((int) (class298.linkedKey * 7051297995265073167L));
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9815.method5970((byte) 126)) {
			Linkable class298 = ((Class_ra_Sub3_Sub1) this).aClass458_9815.method5971(1792328753);
			OpenGL.glDeleteShader((int) (class298.linkedKey * 7051297995265073167L));
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9816.method5970((byte) 79)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9816.method5971(1714583295);
			OpenGL.glDeleteLists((int) (class298_sub35.linkedKey * 7051297995265073167L), class298_sub35.anInt7394 * -774922497);
		}
		if (za() > 100663296 && (Class122.method1319((byte) 1) > ((Class_ra_Sub3_Sub1) this).aLong9823 + 60000L)) {
			System.gc();
			((Class_ra_Sub3_Sub1) this).aLong9823 = Class122.method1319((byte) 1);
		}
		super.method4993(i);
	}

	public void method5012(boolean bool) {
		/* empty */
	}

	void method5500() {
		if (aBoolean8309)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	Class52_Sub2 method5117(Canvas canvas, int i, int i_72_) {
		return new Class52_Sub2_Sub2_Sub1(this, canvas);
	}

	void method5463() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8347 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_73_ = 16384 + i;
			OpenGL.glLightfv(i_73_, 4608, fs, 0);
			OpenGL.glLightf(i_73_, 4615, 0.0F);
			OpenGL.glLightf(i_73_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub3_Sub1) this).anOpenGL9826.setSwapInterval(0);
		super.method5463();
	}

	public int[] eg(int i, int i_74_, int i_75_, int i_76_) {
		int[] is = new int[i_75_ * i_76_];
		int i_77_ = aClass52_5292.method552();
		for (int i_78_ = 0; i_78_ < i_76_; i_78_++)
			OpenGL.glReadPixelsi(i, i_77_ - i_74_ - i_78_ - 1, i_75_, 1, 32993, ((Class_ra_Sub3_Sub1) this).anInt9841, is, i_78_ * i_75_);
		return is;
	}

	public void method5080() {
		if (aClass52_5292 != null) {
			int i = aClass52_5292.method545();
			int i_79_ = aClass52_5292.method552();
			if (i > 0 || i_79_ > 0) {
				int i_80_ = anInt8339;
				int i_81_ = anInt8272;
				int i_82_ = anInt8273;
				int i_83_ = anInt8239;
				method5011();
				int i_84_ = anInt8265;
				int i_85_ = anInt8234;
				int i_86_ = anInt8263;
				int i_87_ = anInt8241;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method5336();
				method5330(false);
				method5417(false);
				method5339(false);
				method5399(false);
				method5358(null);
				method5360(1);
				method5374(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_79_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_84_, i_86_, i_85_, i_87_);
				method5187(i_80_, i_81_, i_82_, i_83_);
			}
		}
	}

	public void fy(int i, int i_88_) {
		int i_89_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_88_ & 0xff0000) / 1.671168E7F, (float) (i_88_ & 0xff00) / 65280.0F, (float) (i_88_ & 0xff) / 255.0F, (float) (i_88_ >>> 24) / 255.0F);
			i_89_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_89_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_89_ |= 0x400;
		OpenGL.glClear(i_89_);
	}

	public void fb(int i, int i_90_) {
		int i_91_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_90_ & 0xff0000) / 1.671168E7F, (float) (i_90_ & 0xff00) / 65280.0F, (float) (i_90_ & 0xff) / 255.0F, (float) (i_90_ >>> 24) / 255.0F);
			i_91_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_91_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_91_ |= 0x400;
		OpenGL.glClear(i_91_);
	}

	Interface9_Impl2 method5453(Class55 class55, int i, int i_92_, boolean bool, float[] fs, int i_93_, int i_94_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2083560637) && Class486.method6152(i_92_, 1982249624)))
			return new Class263_Sub1(this, class55, i, i_92_, bool, fs, i_93_, i_94_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_92_, fs, i_93_, i_94_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_721, Class416.method5590(i, (byte) 16), Class416.method5590(i_92_, (byte) 16));
		class263_sub1.method2473(0, 0, i, i_92_, fs, class55, i_93_, i_94_);
		return class263_sub1;
	}

	public void fn(int i, int i_95_) {
		int i_96_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_95_ & 0xff0000) / 1.671168E7F, (float) (i_95_ & 0xff00) / 65280.0F, (float) (i_95_ & 0xff) / 255.0F, (float) (i_95_ >>> 24) / 255.0F);
			i_96_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method5399(true);
			i_96_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_96_ |= 0x400;
		OpenGL.glClear(i_96_);
	}

	public Class58 method5062() {
		int i = -1;
		if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("intel") != -1)
			i = 32902;
		else if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("ati") != -1)
			i = 4098;
		return new Class58(i, "OpenGL", ((Class_ra_Sub3_Sub1) this).anInt9835, ((Class_ra_Sub3_Sub1) this).aString9834, 0L);
	}

	Interface9_Impl2 method5515(Class55 class55, int i, int i_97_, boolean bool, byte[] is, int i_98_, int i_99_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2068913262) && Class486.method6152(i_97_, 1962445088)))
			return new Class263_Sub1(this, class55, i, i_97_, bool, is, i_98_, i_99_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_97_, is, i_98_, i_99_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_97_, (byte) 16));
		class263_sub1.method82(0, 0, i, i_97_, is, class55, i_98_, i_99_);
		return class263_sub1;
	}

	public Class52_Sub1 method5138() {
		return new Class52_Sub1_Sub3_Sub1(this);
	}

	Interface9_Impl2 method5468(Class55 class55, int i, int i_100_, boolean bool, byte[] is, int i_101_, int i_102_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1902374633) && Class486.method6152(i_100_, 1834416496)))
			return new Class263_Sub1(this, class55, i, i_100_, bool, is, i_101_, i_102_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_100_, is, i_101_, i_102_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_100_, (byte) 16));
		class263_sub1.method82(0, 0, i, i_100_, is, class55, i_101_, i_102_);
		return class263_sub1;
	}

	public boolean method5385() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9839;
	}

	public boolean method5423() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9840;
	}

	public boolean method5424() {
		return ((Class_ra_Sub3_Sub1) this).aBoolean9840;
	}

	public Interface8_Impl1_Impl2 method5165(int i, int i_103_) {
		return new Class262(this, Class55.aClass55_561, Class77.aClass77_719, i, i_103_);
	}

	public float method5396() {
		return 0.0F;
	}

	void method5534() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8347 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_104_ = 16384 + i;
			OpenGL.glLightfv(i_104_, 4608, fs, 0);
			OpenGL.glLightf(i_104_, 4615, 0.0F);
			OpenGL.glLightf(i_104_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class_ra_Sub3_Sub1) this).anOpenGL9826.setSwapInterval(0);
		super.method5463();
	}

	public float method5434() {
		return 0.0F;
	}

	public float method5435() {
		return 0.0F;
	}

	byte[] method5535(String string) {
		return method5298("gl", string);
	}

	public void method5176() {
		if (aClass52_5292 != null) {
			int i = aClass52_5292.method545();
			int i_105_ = aClass52_5292.method552();
			if (i > 0 || i_105_ > 0) {
				int i_106_ = anInt8339;
				int i_107_ = anInt8272;
				int i_108_ = anInt8273;
				int i_109_ = anInt8239;
				method5011();
				int i_110_ = anInt8265;
				int i_111_ = anInt8234;
				int i_112_ = anInt8263;
				int i_113_ = anInt8241;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method5336();
				method5330(false);
				method5417(false);
				method5339(false);
				method5399(false);
				method5358(null);
				method5360(1);
				method5374(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_105_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_110_, i_112_, i_111_, i_113_);
				method5187(i_106_, i_107_, i_108_, i_109_);
			}
		}
	}

	void method5375() {
		if (aBoolean8309)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	final synchronized void method5536(int i, int i_114_) {
		Class298_Sub35 class298_sub35 = new Class298_Sub35(i_114_);
		class298_sub35.linkedKey = (long) i * 4191220306876042991L;
		((Class_ra_Sub3_Sub1) this).aClass458_9817.method5968(class298_sub35, 789899827);
	}

	void method5440() {
		if (aBoolean8254)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method5430() {
		if (aBoolean8331 && aBoolean8278 && anInt8233 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method5064(int i, int i_115_) throws Exception_Sub1 {
		aClass52_Sub2_5312.method580();
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(1141997012);
	}

	void method5442() {
		if (aBoolean8254)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method5446(Matrix4f class233) {
		float[] fs = class233.aFloatArray2594;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method5437() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = aFloat8291 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = aFloat8291 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = aFloat8291 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	void method5452() {
		OpenGL.glDepthMask(aBoolean8277 && aBoolean8237);
	}

	void method5441() {
		OpenGL.glDepthMask(aBoolean8277 && aBoolean8237);
	}

	Interface9_Impl2 method5472(Class55 class55, int i, int i_116_, boolean bool, float[] fs, int i_117_, int i_118_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1987260483) && Class486.method6152(i_116_, 2045072187)))
			return new Class263_Sub1(this, class55, i, i_116_, bool, fs, i_117_, i_118_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_116_, fs, i_117_, i_118_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_721, Class416.method5590(i, (byte) 16), Class416.method5590(i_116_, (byte) 16));
		class263_sub1.method2473(0, 0, i, i_116_, fs, class55, i_117_, i_118_);
		return class263_sub1;
	}

	public Class58 method5063() {
		int i = -1;
		if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("intel") != -1)
			i = 32902;
		else if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("ati") != -1)
			i = 4098;
		return new Class58(i, "OpenGL", ((Class_ra_Sub3_Sub1) this).anInt9835, ((Class_ra_Sub3_Sub1) this).aString9834, 0L);
	}

	void method5432() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = aFloat8291 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = aFloat8291 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = aFloat8291 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	void method5448() {
		if (aBoolean8264 && !aBoolean8282)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method5456() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = aFloat8291 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = aFloat8291 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = aFloat8291 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	void method5457() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = aFloat8364 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = aFloat8364 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = aFloat8364 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = -aFloat8293 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = -aFloat8293 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = -aFloat8293 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	void method5405() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8283, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8248, 0);
	}

	void method5458() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8283, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8248, 0);
	}

	void method5459() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8283, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8248, 0);
	}

	void method5342() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8283, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8248, 0);
	}

	Interface9_Impl1 method5475(int i, boolean bool, int[][] is) {
		return new Class263_Sub3(this, i, bool, is);
	}

	void method5491() {
		OpenGL.glActiveTexture(33984 + anInt8325);
	}

	void method5400() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass233_8230.aFloatArray2594, 0);
		int i;
		for (i = 0; i < anInt8296; i++) {
			Class298_Sub10 class298_sub10 = aClass298_Sub10Array8286[i];
			int i_119_ = class298_sub10.method2898(-2040590792);
			int i_120_ = 16386 + i;
			float f = class298_sub10.method2901(608404512) / 255.0F;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) class298_sub10.method2895(823958259);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) class298_sub10.method2894(-630869458);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) class298_sub10.method2897((byte) 86);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
			OpenGL.glLightfv(i_120_, 4611, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (i_119_ >> 16 & 0xff) * f;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (i_119_ >> 8 & 0xff) * f;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (i_119_ & 0xff) * f;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
			OpenGL.glLightfv(i_120_, 4609, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
			OpenGL.glLightf(i_120_, 4617, (1.0F / (float) (class298_sub10.method2900(-1089052693) * class298_sub10.method2900(-2044712108))));
			OpenGL.glEnable(i_120_);
		}
		for (/**/; i < anInt8295; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method5461(Class55 class55, Class77 class77) {
		return true;
	}

	boolean method5462(Class55 class55, Class77 class77) {
		return true;
	}

	boolean method5310(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	boolean method5464(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	void method5498(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	boolean method5406(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	boolean method5466(Class55 class55, Class77 class77) {
		return aBoolean8365;
	}

	Interface9_Impl2 method5433(Class55 class55, Class77 class77, int i, int i_121_) {
		return method5356(class55, class77, i, i_121_);
	}

	public void method5085(boolean bool) {
		/* empty */
	}

	Interface9_Impl2 method5370(Class55 class55, int i, int i_122_, boolean bool, byte[] is, int i_123_, int i_124_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1853172983) && Class486.method6152(i_122_, 1827151414)))
			return new Class263_Sub1(this, class55, i, i_122_, bool, is, i_123_, i_124_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_122_, is, i_123_, i_124_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_122_, (byte) 16));
		class263_sub1.method82(0, 0, i, i_122_, is, class55, i_123_, i_124_);
		return class263_sub1;
	}

	final Interface7_Impl1 method5408(boolean bool) {
		return new Class246_Sub2(this, bool);
	}

	void method5065(int i, int i_125_) throws Exception_Sub1 {
		aClass52_Sub2_5312.method580();
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(-85834145);
	}

	Interface9_Impl2 method5471(Class55 class55, int i, int i_126_, boolean bool, float[] fs, int i_127_, int i_128_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1898417444) && Class486.method6152(i_126_, 2072931351)))
			return new Class263_Sub1(this, class55, i, i_126_, bool, fs, i_127_, i_128_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_126_, fs, i_127_, i_128_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_721, Class416.method5590(i, (byte) 16), Class416.method5590(i_126_, (byte) 16));
		class263_sub1.method2473(0, 0, i, i_126_, fs, class55, i_127_, i_128_);
		return class263_sub1;
	}

	public final synchronized void method4993(int i) {
		int i_129_ = 0;
		i &= 0x7fffffff;
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9817.method5970((byte) 48)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9817.method5971(1595707002);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_129_++] = (int) (class298_sub35.linkedKey * 7051297995265073167L);
			anInt8224 -= class298_sub35.anInt7394 * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteBuffersARB(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
			i_129_ = 0;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9818.method5970((byte) 112)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9818.method5971(1563710334);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_129_++] = (int) (class298_sub35.linkedKey * 7051297995265073167L);
			anInt8223 -= class298_sub35.anInt7394 * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteTextures(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteTextures(i_129_, ((Class_ra_Sub3_Sub1) this).anIntArray9824, 0);
			i_129_ = 0;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9819.method5970((byte) 78)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9819.method5971(1735812614);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_129_++] = class298_sub35.anInt7394 * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
			i_129_ = 0;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9820.method5970((byte) 88)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9820.method5971(2070970334);
			((Class_ra_Sub3_Sub1) this).anIntArray9824[i_129_++] = (int) (class298_sub35.linkedKey * 7051297995265073167L);
			anInt8318 -= class298_sub35.anInt7394 * -774922497;
			if (i_129_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
				i_129_ = 0;
			}
		}
		if (i_129_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_129_, (((Class_ra_Sub3_Sub1) this).anIntArray9824), 0);
			boolean bool = false;
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9816.method5970((byte) 72)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9816.method5971(1996234534);
			OpenGL.glDeleteLists((int) (class298_sub35.linkedKey * 7051297995265073167L), class298_sub35.anInt7394 * -774922497);
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9821.method5970((byte) 121)) {
			Linkable class298 = ((Class_ra_Sub3_Sub1) this).aClass458_9821.method5971(1584885862);
			OpenGL.glDeleteProgram((int) (class298.linkedKey * 7051297995265073167L));
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9815.method5970((byte) 47)) {
			Linkable class298 = ((Class_ra_Sub3_Sub1) this).aClass458_9815.method5971(1940978688);
			OpenGL.glDeleteShader((int) (class298.linkedKey * 7051297995265073167L));
		}
		while (!((Class_ra_Sub3_Sub1) this).aClass458_9816.method5970((byte) 39)) {
			Class298_Sub35 class298_sub35 = (Class298_Sub35) ((Class_ra_Sub3_Sub1) this).aClass458_9816.method5971(1755537674);
			OpenGL.glDeleteLists((int) (class298_sub35.linkedKey * 7051297995265073167L), class298_sub35.anInt7394 * -774922497);
		}
		if (za() > 100663296 && (Class122.method1319((byte) 1) > ((Class_ra_Sub3_Sub1) this).aLong9823 + 60000L)) {
			System.gc();
			((Class_ra_Sub3_Sub1) this).aLong9823 = Class122.method1319((byte) 1);
		}
		super.method4993(i);
	}

	Interface9_Impl2 method5403(Class55 class55, int i, int i_130_, boolean bool, float[] fs, int i_131_, int i_132_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2060582659) && Class486.method6152(i_130_, 1956447406)))
			return new Class263_Sub1(this, class55, i, i_130_, bool, fs, i_131_, i_132_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_130_, fs, i_131_, i_132_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_721, Class416.method5590(i, (byte) 16), Class416.method5590(i_130_, (byte) 16));
		class263_sub1.method2473(0, 0, i, i_130_, fs, class55, i_131_, i_132_);
		return class263_sub1;
	}

	Interface9_Impl2 method5473(int i, int i_133_, boolean bool, int[] is, int i_134_, int i_135_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1897882026) && Class486.method6152(i_133_, 1916430478)))
			return new Class263_Sub1(this, i, i_133_, bool, is, i_134_, i_135_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, i, i_133_, is, i_134_, i_135_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, Class55.aClass55_557, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_133_, (byte) 16));
		class263_sub1.method81(0, 0, i, i_133_, is, i_134_, i_135_);
		return class263_sub1;
	}

	Interface9_Impl2 method5474(int i, int i_136_, boolean bool, int[] is, int i_137_, int i_138_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 1872676773) && Class486.method6152(i_136_, 1860279386)))
			return new Class263_Sub1(this, i, i_136_, bool, is, i_137_, i_138_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, i, i_136_, is, i_137_, i_138_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, Class55.aClass55_557, Class77.aClass77_717, Class416.method5590(i, (byte) 16), Class416.method5590(i_136_, (byte) 16));
		class263_sub1.method81(0, 0, i, i_136_, is, i_137_, i_138_);
		return class263_sub1;
	}

	void method5376() {
		int i = 0;
		int i_139_ = 0;
		if (anInt8366 == 0) {
			i = 0;
			i_139_ = 0;
		} else if (anInt8366 == 1) {
			i = 1;
			i_139_ = 0;
		} else if (anInt8366 == 2) {
			i = 1;
			i_139_ = 1;
		}
		if (aClass174_8268 == Class174.aClass174_1762)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_139_);
		else if (aClass174_8268 == Class174.aClass174_1760)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_139_);
		else if (aClass174_8268 == Class174.aClass174_1761)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_139_);
	}

	public Class58 method4987() {
		int i = -1;
		if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("intel") != -1)
			i = 32902;
		else if (((Class_ra_Sub3_Sub1) this).aString9833.indexOf("ati") != -1)
			i = 4098;
		return new Class58(i, "OpenGL", ((Class_ra_Sub3_Sub1) this).anInt9835, ((Class_ra_Sub3_Sub1) this).aString9834, 0L);
	}

	Interface9_Impl3 method5344(Class55 class55, int i, int i_140_, int i_141_, boolean bool, byte[] is) {
		return new Class263_Sub2(this, class55, i, i_140_, i_141_, bool, is);
	}

	void method5469() {
		if (aBoolean8309)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	Interface9_Impl2_Impl1 method5479(Class55 class55, Class77 class77, int i, int i_142_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2050497405) && Class486.method6152(i_142_, 1840822084)))
			return new Class263_Sub1(this, class55, class77, i, i_142_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, class77, i, i_142_);
		return new Class263_Sub1(this, class55, class77, Class416.method5590(i, (byte) 16), Class416.method5590(i_142_, (byte) 16));
	}

	Interface9_Impl2_Impl1 method5391(Class55 class55, Class77 class77, int i, int i_143_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2027556559) && Class486.method6152(i_143_, 2075532110)))
			return new Class263_Sub1(this, class55, class77, i, i_143_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, class77, i, i_143_);
		return new Class263_Sub1(this, class55, class77, Class416.method5590(i, (byte) 16), Class416.method5590(i_143_, (byte) 16));
	}

	Interface9_Impl2_Impl1 method5413(Class55 class55, Class77 class77, int i, int i_144_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2073016154) && Class486.method6152(i_144_, 2096946547)))
			return new Class263_Sub1(this, class55, class77, i, i_144_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, class77, i, i_144_);
		return new Class263_Sub1(this, class55, class77, Class416.method5590(i, (byte) 16), Class416.method5590(i_144_, (byte) 16));
	}

	void method5497() {
		OpenGL.glTexEnvi(8960, 34162, method5526(aClass175Array8307[anInt8325]));
	}

	final void method5482(int i, Class183 class183, boolean bool, boolean bool_145_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5527(class183));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_145_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_145_ ? 769 : 768);
	}

	final void method5319(int i, Class183 class183, boolean bool, boolean bool_146_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method5527(class183));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_146_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_146_ ? 769 : 768);
	}

	final void method5484(int i, Class183 class183, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method5527(class183));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method5485(int i, Class183 class183, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method5527(class183));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method5488() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (anInt8274 & 0xff0000) / 1.671168E7F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (anInt8274 & 0xff00) / 65280.0F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (anInt8274 & 0xff) / 255.0F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = (float) (anInt8274 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	final void method5489() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (anInt8274 & 0xff0000) / 1.671168E7F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (anInt8274 & 0xff00) / 65280.0F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (anInt8274 & 0xff) / 255.0F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = (float) (anInt8274 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	void method5490() {
		OpenGL.glMatrixMode(5890);
		if (aClass171Array8305[anInt8325] != Class171.aClass171_1742)
			OpenGL.glLoadMatrixf(aClass233Array8304[anInt8325].method2173(((Class_ra_Sub3_Sub1) this).aFloatArray9843), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public void method5445(Matrix4f class233) {
		float[] fs = class233.aFloatArray2594;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method5492() {
		OpenGL.glActiveTexture(33984 + anInt8325);
	}

	public void method5066() {
		OpenGL.glFinish();
	}

	void method5493() {
		OpenGL.glActiveTexture(33984 + anInt8325);
	}

	void method5495() {
		OpenGL.glTexEnvi(8960, 34161, method5526(aClass175Array8294[anInt8325]));
	}

	void method5496() {
		OpenGL.glTexEnvi(8960, 34162, method5526(aClass175Array8307[anInt8325]));
	}

	void method5428() {
		OpenGL.glTexEnvi(8960, 34162, method5526(aClass175Array8307[anInt8325]));
	}

	public float method5436() {
		return 0.0F;
	}

	void method5333(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method5460() {
		/* empty */
	}

	void method5343() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = aFloat8364 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = aFloat8364 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = aFloat8364 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = -aFloat8293 * aFloat8362;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = -aFloat8293 * aFloat8289;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = -aFloat8293 * aFloat8290;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}

	void method5481() {
		if (aClass52_5292 != null)
			OpenGL.glViewport(anInt8275 + anInt8339, (anInt8276 + aClass52_5292.method552() - anInt8272 - anInt8239), anInt8273, anInt8239);
		OpenGL.glDepthRange(aFloat8335, aFloat8258);
	}

	Interface9_Impl3 method5478(Class55 class55, int i, int i_147_, int i_148_, boolean bool, byte[] is) {
		return new Class263_Sub2(this, class55, i, i_147_, i_148_, bool, is);
	}

	Interface9_Impl2 method5353(Class55 class55, Class77 class77, int i, int i_149_) {
		return method5356(class55, class77, i, i_149_);
	}

	void method5502() {
		int i = 0;
		int i_150_ = 0;
		if (anInt8366 == 0) {
			i = 0;
			i_150_ = 0;
		} else if (anInt8366 == 1) {
			i = 1;
			i_150_ = 0;
		} else if (anInt8366 == 2) {
			i = 1;
			i_150_ = 1;
		}
		if (aClass174_8268 == Class174.aClass174_1762)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_150_);
		else if (aClass174_8268 == Class174.aClass174_1760)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_150_);
		else if (aClass174_8268 == Class174.aClass174_1761)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_150_);
	}

	void method5395() {
		if (aBoolean8245)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method5418() {
		aFloat8336 = aFloat8308 - (float) anInt8334;
		aFloat8292 = aFloat8336 - (float) anInt8233;
		if (aFloat8292 < aFloat8261)
			aFloat8292 = aFloat8261;
		if (fixedFunction) {
			OpenGL.glFogf(2915, aFloat8292);
			OpenGL.glFogf(2916, aFloat8336);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (anInt8332 & 0xff0000) / 1.671168E7F;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (anInt8332 & 0xff00) / 65280.0F;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (anInt8332 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
		}
	}

	Interface9_Impl2 method5470(Class55 class55, int i, int i_151_, boolean bool, float[] fs, int i_152_, int i_153_) {
		if (((Class_ra_Sub3_Sub1) this).aBoolean9838 || (Class486.method6152(i, 2130200323) && Class486.method6152(i_151_, 2059129528)))
			return new Class263_Sub1(this, class55, i, i_151_, bool, fs, i_152_, i_153_);
		if (((Class_ra_Sub3_Sub1) this).aBoolean9837)
			return new Class263_Sub4(this, class55, i, i_151_, fs, i_152_, i_153_);
		Class263_Sub1 class263_sub1 = new Class263_Sub1(this, class55, Class77.aClass77_721, Class416.method5590(i, (byte) 16), Class416.method5590(i_151_, (byte) 16));
		class263_sub1.method2473(0, 0, i, i_151_, fs, class55, i_152_, i_153_);
		return class263_sub1;
	}

	void method5504() {
		if (aBoolean8331 && aBoolean8278 && anInt8233 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method5378() {
		aFloat8336 = aFloat8308 - (float) anInt8334;
		aFloat8292 = aFloat8336 - (float) anInt8233;
		if (aFloat8292 < aFloat8261)
			aFloat8292 = aFloat8261;
		if (fixedFunction) {
			OpenGL.glFogf(2915, aFloat8292);
			OpenGL.glFogf(2916, aFloat8336);
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (anInt8332 & 0xff0000) / 1.671168E7F;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (anInt8332 & 0xff00) / 65280.0F;
			((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (anInt8332 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
		}
	}

	void method5505(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	void method5454() {
		OpenGL.glDepthMask(aBoolean8277 && aBoolean8237);
	}

	final Interface7_Impl2 method5507(boolean bool) {
		return new Class246_Sub1(this, Class77.aClass77_718, bool);
	}

	final Interface7_Impl1 method5508(boolean bool) {
		return new Class246_Sub2(this, bool);
	}

	final Interface7_Impl1 method5509(boolean bool) {
		return new Class246_Sub2(this, bool);
	}

	void method5501() {
		if (aBoolean8309)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	Class153 method5510(Class181[] class181s) {
		return new Class153_Sub1(class181s);
	}

	void method5487() {
		if (aBoolean8281) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	Class153 method5401(Class181[] class181s) {
		return new Class153_Sub1(class181s);
	}

	void method5511(Interface7_Impl2 interface7_impl2) {
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827 = (Class246_Sub1) interface7_impl2;
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2333();
	}

	void method5512(Interface7_Impl2 interface7_impl2) {
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827 = (Class246_Sub1) interface7_impl2;
		((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2333();
	}

	public void method5519(Matrix4f class233, Matrix4f class233_154_, Matrix4f class233_155_) {
		OpenGL.glMatrixMode(5888);
		aClass233_8236.method2143(class233, class233_154_);
		OpenGL.glLoadMatrixf(aClass233_8236.aFloatArray2594, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class233_155_.aFloatArray2594, 0);
	}

	public final void method5514(Class187 class187, int i, int i_156_) {
		int i_157_;
		int i_158_;
		if (class187 == Class187.aClass187_1908) {
			i_157_ = 1;
			i_158_ = i_156_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_157_ = 3;
			i_158_ = i_156_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_157_ = 4;
			i_158_ = i_156_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_157_ = 6;
			i_158_ = i_156_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_157_ = 5;
			i_158_ = i_156_ + 2;
		} else {
			i_157_ = 0;
			i_158_ = i_156_;
		}
		OpenGL.glDrawArrays(i_157_, i, i_158_);
	}

	public final void method5354(Class187 class187, int i, int i_159_, int i_160_, int i_161_) {
		int i_162_;
		int i_163_;
		if (class187 == Class187.aClass187_1908) {
			i_162_ = 1;
			i_163_ = i_161_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_162_ = 3;
			i_163_ = i_161_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_162_ = 4;
			i_163_ = i_161_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_162_ = 6;
			i_163_ = i_161_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_162_ = 5;
			i_163_ = i_161_ + 2;
		} else {
			i_162_ = 0;
			i_163_ = i_161_;
		}
		Class77 class77 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2335();
		OpenGL.glDrawElements(i_162_, i_163_, method5537(class77), (((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2332() + (long) (i_160_ * (class77.anInt724 * 685647847))));
	}

	public final void method5449(Class187 class187, int i, int i_164_, int i_165_, int i_166_) {
		int i_167_;
		int i_168_;
		if (class187 == Class187.aClass187_1908) {
			i_167_ = 1;
			i_168_ = i_166_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_167_ = 3;
			i_168_ = i_166_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_167_ = 4;
			i_168_ = i_166_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_167_ = 6;
			i_168_ = i_166_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_167_ = 5;
			i_168_ = i_166_ + 2;
		} else {
			i_167_ = 0;
			i_168_ = i_166_;
		}
		Class77 class77 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2335();
		OpenGL.glDrawElements(i_167_, i_168_, method5537(class77), (((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2332() + (long) (i_165_ * (class77.anInt724 * 685647847))));
	}

	public final void method5362(Class187 class187, int i, int i_169_, int i_170_, int i_171_) {
		int i_172_;
		int i_173_;
		if (class187 == Class187.aClass187_1908) {
			i_172_ = 1;
			i_173_ = i_171_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_172_ = 3;
			i_173_ = i_171_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_172_ = 4;
			i_173_ = i_171_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_172_ = 6;
			i_173_ = i_171_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_172_ = 5;
			i_173_ = i_171_ + 2;
		} else {
			i_172_ = 0;
			i_173_ = i_171_;
		}
		Class77 class77 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2335();
		OpenGL.glDrawElements(i_172_, i_173_, method5537(class77), (((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2332() + (long) (i_170_ * (class77.anInt724 * 685647847))));
	}

	public final void method5516(Class187 class187, int i, int i_174_, int i_175_, int i_176_) {
		int i_177_;
		int i_178_;
		if (class187 == Class187.aClass187_1908) {
			i_177_ = 1;
			i_178_ = i_176_ * 2;
		} else if (class187 == Class187.aClass187_1905) {
			i_177_ = 3;
			i_178_ = i_176_ + 1;
		} else if (class187 == Class187.aClass187_1907) {
			i_177_ = 4;
			i_178_ = i_176_ * 3;
		} else if (class187 == Class187.aClass187_1906) {
			i_177_ = 6;
			i_178_ = i_176_ + 2;
		} else if (class187 == Class187.aClass187_1904) {
			i_177_ = 5;
			i_178_ = i_176_ + 2;
		} else {
			i_177_ = 0;
			i_178_ = i_176_;
		}
		Class77 class77 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2335();
		OpenGL.glDrawElements(i_177_, i_178_, method5537(class77), (((Class_ra_Sub3_Sub1) this).aClass246_Sub1_9827.method2332() + (long) (i_175_ * (class77.anInt724 * 685647847))));
	}

	void method5303() {
		if (aClass52_5292 != null) {
			int i = anInt8275 + anInt8265;
			int i_179_ = anInt8276 + aClass52_5292.method552() - anInt8241;
			int i_180_ = anInt8234 - anInt8265;
			int i_181_ = anInt8241 - anInt8263;
			if (i_180_ < 0)
				i_180_ = 0;
			if (i_181_ < 0)
				i_181_ = 0;
			OpenGL.glScissor(i, i_179_, i_180_, i_181_);
		}
	}

	void method5341() {
		if (aBoolean8264 && !aBoolean8282)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	public void method5521(int i, Interface7_Impl1 interface7_impl1) {
		((Class_ra_Sub3_Sub1) this).aClass246_Sub2Array9829[i] = (Class246_Sub2) interface7_impl1;
	}

	public void method5313(Class153 class153) {
		Class181[] class181s = class153.aClass181Array6405;
		int i = 0;
		boolean bool = false;
		boolean bool_182_ = false;
		boolean bool_183_ = false;
		for (int i_184_ = 0; i_184_ < class181s.length; i_184_++) {
			Class181 class181 = class181s[i_184_];
			Class246_Sub2 class246_sub2 = ((Class_ra_Sub3_Sub1) this).aClass246_Sub2Array9829[i_184_];
			int i_185_ = 0;
			int i_186_ = class246_sub2.method2336();
			long l = class246_sub2.method2332();
			class246_sub2.method2333();
			for (int i_187_ = 0; i_187_ < class181.method1842(); i_187_++) {
				Class155 class155 = class181.method1839(i_187_);
				switch (class155.anInt1604) {
				case 5:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_186_, l + (long) i_185_);
					break;
				case 10:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_186_, l + (long) i_185_);
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_186_, l + (long) i_185_);
					break;
				case 0:
					OpenGL.glVertexPointer(3, 5126, i_186_, l + (long) i_185_);
					bool_183_ = true;
					break;
				case 11:
					OpenGL.glNormalPointer(5126, i_186_, l + (long) i_185_);
					bool_182_ = true;
					break;
				case 3:
					OpenGL.glColorPointer(4, 5121, i_186_, l + (long) i_185_);
					bool = true;
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_186_, l + (long) i_185_);
					break;
				}
				i_185_ += class155.anInt1611;
			}
		}
		if (((Class_ra_Sub3_Sub1) this).aBoolean9836 != bool_183_) {
			if (bool_183_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class_ra_Sub3_Sub1) this).aBoolean9836 = bool_183_;
		}
		if (((Class_ra_Sub3_Sub1) this).aBoolean9842 != bool_182_) {
			if (bool_182_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class_ra_Sub3_Sub1) this).aBoolean9842 = bool_182_;
		}
		if (((Class_ra_Sub3_Sub1) this).aBoolean9830 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class_ra_Sub3_Sub1) this).aBoolean9830 = bool;
		}
		if (((Class_ra_Sub3_Sub1) this).anInt9828 < i) {
			for (int i_188_ = ((Class_ra_Sub3_Sub1) this).anInt9828; i_188_ < i; i_188_++) {
				OpenGL.glClientActiveTexture(33984 + i_188_);
				OpenGL.glEnableClientState(32888);
			}
			((Class_ra_Sub3_Sub1) this).anInt9828 = i;
		} else if (((Class_ra_Sub3_Sub1) this).anInt9828 > i) {
			for (int i_189_ = i; i_189_ < ((Class_ra_Sub3_Sub1) this).anInt9828; i_189_++) {
				OpenGL.glClientActiveTexture(33984 + i_189_);
				OpenGL.glDisableClientState(32888);
			}
			((Class_ra_Sub3_Sub1) this).anInt9828 = i;
		}
	}

	void method5499(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public Class123 method5522(String string) {
		byte[] is = method5535(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub2(this, class109);
	}

	public Class123 method5523(String string) {
		byte[] is = method5535(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub2(this, class109);
	}

	public Class123 method5524(String string) {
		byte[] is = method5535(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub2(this, class109);
	}

	public Class123 method5525(String string) {
		byte[] is = method5535(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub2(this, class109);
	}

	public void method5335(Matrix4f class233) {
		float[] fs = class233.aFloatArray2594;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method5305() {
		if (aBoolean8245)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	Interface9_Impl1 method5476(int i, boolean bool, int[][] is) {
		return new Class263_Sub3(this, i, bool, is);
	}

	static final int method5537(Class77 class77) {
		switch (class77.anInt723 * -1857088243) {
		case 3:
			return 5126;
		case 5:
			return 5122;
		case 2:
			return 5120;
		case 0:
			return 5125;
		case 1:
			return 5121;
		default:
			return 5121;
		case 6:
			return 5123;
		case 8:
			return 5124;
		case 4:
			return 5131;
		}
	}

	final synchronized void method5538(int i) {
		Linkable class298 = new Linkable();
		class298.linkedKey = (long) i * 4191220306876042991L;
		((Class_ra_Sub3_Sub1) this).aClass458_9821.method5968(class298, 1460654582);
	}

	final void method5369() {
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[0] = (float) (anInt8274 & 0xff0000) / 1.671168E7F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[1] = (float) (anInt8274 & 0xff00) / 65280.0F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[2] = (float) (anInt8274 & 0xff) / 255.0F;
		((Class_ra_Sub3_Sub1) this).aFloatArray9822[3] = (float) (anInt8274 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class_ra_Sub3_Sub1) this).aFloatArray9822, 0);
	}
}
