
/* Class505_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaclib.memory.Stream;

import jaggl.MapBuffer;
import jaggl.OpenGL;

public final class Class505_Sub2_Sub1 extends Class505_Sub2 {
	float[] aFloatArray10172;
	Class473 aClass473_10173 = new Class473();
	Class473 aClass473_10174 = new Class473();
	Class473 aClass473_10175 = new Class473();
	Class473 aClass473_10176 = new Class473();
	boolean aBool10177;
	Class473 aClass473_10178;
	Class473 aClass473_10179;
	boolean aBool10180;
	int anInt10181;
	float[] aFloatArray10182;
	boolean aBool10183;
	int[] anIntArray10184;
	String aString10185;
	Class326_Sub1[] aClass326_Sub1Array10186;
	Class326_Sub2 aClass326_Sub2_10187;
	int[] anIntArray10188;
	Class115_Sub2 aClass115_Sub2_10189;
	boolean aBool10190;
	OpenGL anOpenGL10191;
	boolean aBool10192;
	boolean aBool10193;
	boolean aBool10194;
	Class473 aClass473_10195 = new Class473();
	int anInt10196;
	boolean aBool10197;
	int anInt10198;
	long aLong10199;
	String aString10200;

	boolean method13975(Class150 class150, Class76 class76) {
		return true;
	}

	public Class101 method13890(String string) {
		byte[] is = method15579(string);
		if (is == null)
			return null;
		Class114 class114 = method13891(is);
		return new Class101_Sub1(this, class114);
	}

	public boolean method13887() {
		return ((Class505_Sub2_Sub1) this).aBool10177;
	}

	public boolean method13888() {
		return ((Class505_Sub2_Sub1) this).aBool10192;
	}

	Class505_Sub2_Sub1(OpenGL opengl, Canvas canvas, long l, Interface22 interface22, Class317 class317, int i) {
		super(interface22, class317, i, 1);
		((Class505_Sub2_Sub1) this).aClass473_10178 = new Class473();
		((Class505_Sub2_Sub1) this).aClass473_10179 = new Class473();
		((Class505_Sub2_Sub1) this).anIntArray10184 = new int[1000];
		((Class505_Sub2_Sub1) this).aClass326_Sub1Array10186 = new Class326_Sub1[16];
		new MapBuffer();
		new MapBuffer();
		((Class505_Sub2_Sub1) this).aFloatArray10172 = new float[4];
		((Class505_Sub2_Sub1) this).aFloatArray10182 = new float[16];
		int[] is = new int[1];
		try {
			((Class505_Sub2_Sub1) this).anOpenGL10191 = opengl;
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2570();
			((Class505_Sub2_Sub1) this).aString10185 = OpenGL.glGetString(7936).toLowerCase();
			((Class505_Sub2_Sub1) this).aString10200 = OpenGL.glGetString(7937).toLowerCase();
			if ((((Class505_Sub2_Sub1) this).aString10185.indexOf("microsoft") != -1) || ((Class505_Sub2_Sub1) this).aString10185.indexOf("brian paul") != -1 || (((Class505_Sub2_Sub1) this).aString10185.indexOf("mesa") != -1))
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class456_Sub3.method12681(string.replace('.', ' '), ' ', 229848533);
			if (strings.length >= 2) {
				try {
					int i_0_ = Class328.method5830(strings[0], 102234625);
					int i_1_ = Class328.method5830(strings[1], -768077921);
					((Class505_Sub2_Sub1) this).anInt10196 = i_0_ * 10 + i_1_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (((Class505_Sub2_Sub1) this).anInt10196 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt8825 = is[0];
			if (anInt8825 < 2)
				throw new RuntimeException("");
			anInt8799 = 8;
			((Class505_Sub2_Sub1) this).aBool10193 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_vertex_buffer_object");
			aBool8828 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_multisample");
			((Class505_Sub2_Sub1) this).aBool10194 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_texture_rectangle");
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_texture_cube_map");
			((Class505_Sub2_Sub1) this).aBool10197 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_texture_non_power_of_two");
			aBool8827 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_EXT_texture3D");
			((Class505_Sub2_Sub1) this).aBool10177 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_vertex_shader");
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_vertex_program");
			((Class505_Sub2_Sub1) this).aBool10192 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_fragment_shader");
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_fragment_program");
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_EXT_framebuffer_object");
			((Class505_Sub2_Sub1) this).anIntArray10188 = new int[anInt8825];
			aBool8718 = ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_EXT_framebuffer_object");
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_EXT_framebuffer_blit");
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_EXT_framebuffer_multisample");
			if (!method13887() || !method13888()) {
				if (!((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			((Class505_Sub2_Sub1) this).anInt10198 = Stream.method2926() ? 33639 : 5121;
			if (((Class505_Sub2_Sub1) this).aString10200.indexOf("radeon") != -1) {
				int i_2_ = 0;
				boolean bool = false;
				boolean bool_3_ = false;
				String[] strings_4_ = Class456_Sub3.method12681(((Class505_Sub2_Sub1) this).aString10200.replace('/', ' '), ' ', 229848533);
				for (int i_5_ = 0; i_5_ < strings_4_.length; i_5_++) {
					String string_6_ = strings_4_[i_5_];
					try {
						if (string_6_.length() <= 0)
							continue;
						if (string_6_.charAt(0) == 'x' && string_6_.length() >= 3 && Class115.method1950(string_6_.substring(1, 3), -590499639)) {
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
						if (string_6_.length() < 4 || !Class115.method1950(string_6_.substring(0, 4), -77816633))
							continue;
						i_2_ = Class328.method5830(string_6_.substring(0, 4), 1896827568);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (!bool_3_ && !bool) {
					if (i_2_ >= 7000 && i_2_ <= 7999)
						((Class505_Sub2_Sub1) this).aBool10193 = false;
					if (i_2_ >= 7000 && i_2_ <= 9250)
						aBool8827 = false;
				}
				((Class505_Sub2_Sub1) this).aBool10194 &= ((Class505_Sub2_Sub1) this).anOpenGL10191.method2569("GL_ARB_half_float_pixel");
			}
			if (((Class505_Sub2_Sub1) this).aString10185.indexOf("intel") == -1) {
				/* empty */
			}
			if (((Class505_Sub2_Sub1) this).aBool10193) {
				try {
					int[] is_7_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_7_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			method8411(canvas, new Class158_Sub2_Sub2_Sub1(this, canvas, l), 316223525);
			method8412(canvas, (byte) 8);
			method13910(32768, false);
			method13910(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method8396(1155001996);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	Interface6 method14145(Class150 class150, int i, int i_8_, boolean bool, float[] fs, int i_9_, int i_10_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_8_, 1942118537)))
			return new Class319_Sub2(this, class150, i, i_8_, bool, fs, i_9_, i_10_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, i, i_8_, fs, i_9_, i_10_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, class150, Class76.aClass76_758, Class323.method5778(i, 258691248), Class323.method5778(i_8_, 787226616));
		class319_sub2.method14494(0, 0, i, i_8_, fs, class150, i_9_, i_10_);
		return class319_sub2;
	}

	void method14020() {
		int i = 0;
		int i_11_ = 0;
		if (anInt8844 == 0) {
			i = 0;
			i_11_ = 0;
		} else if (anInt8844 == 1) {
			i = 1;
			i_11_ = 0;
		} else if (anInt8844 == 2) {
			i = 1;
			i_11_ = 1;
		}
		if (aClass73_8733 == Class73.aClass73_727)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_11_);
		else if (aClass73_8733 == Class73.aClass73_725)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_11_);
		else if (aClass73_8733 == Class73.aClass73_726)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_11_);
	}

	Class70 method14210(Class72[] class72s) {
		return new Class70_Sub2(class72s);
	}

	public void method8395() {
		OpenGL.glFinish();
	}

	void method8397() {
		super.method8397();
		if (((Class505_Sub2_Sub1) this).anOpenGL10191 != null) {
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2571();
			((Class505_Sub2_Sub1) this).anOpenGL10191.release();
			((Class505_Sub2_Sub1) this).anOpenGL10191 = null;
		}
	}

	public float method13905() {
		return 0.0F;
	}

	Class158_Sub2 method8417(Canvas canvas, int i, int i_12_) {
		return new Class158_Sub2_Sub2_Sub1(this, canvas);
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub3_Sub2(this);
	}

	void method14182() {
		OpenGL.glMatrixMode(5890);
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393)
			OpenGL.glLoadMatrixf(aClass384Array8782[anInt8780].method6517(((Class505_Sub2_Sub1) this).aFloatArray10182), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public int[] ab(int i, int i_13_, int i_14_, int i_15_) {
		int[] is = new int[i_14_ * i_15_];
		int i_16_ = aClass158_5853.method2716();
		for (int i_17_ = 0; i_17_ < i_15_; i_17_++)
			OpenGL.glReadPixelsi(i, i_16_ - i_13_ - i_17_ - 1, i_14_, 1, 32993, ((Class505_Sub2_Sub1) this).anInt10198, is, i_17_ * i_14_);
		return is;
	}

	static int method15565(Class150 class150, Class76 class76) {
		if (class76 == Class76.aClass76_751) {
			switch (class150.anInt1958 * -1436290903) {
			case 9:
				return 33779;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 6408;
			case 5:
				return 6407;
			case 7:
				return 33777;
			case 0:
				return 6409;
			case 1:
				return 6406;
			case 4:
				return 6410;
			}
		}
		if (class76 == Class76.aClass76_752) {
			switch (class150.anInt1958 * -1436290903) {
			case 0:
				return 32834;
			case 8:
				return 33189;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 32859;
			case 1:
				return 32830;
			case 4:
				return 36219;
			case 5:
				return 32852;
			}
		}
		if (class76 == Class76.aClass76_749) {
			switch (class150.anInt1958 * -1436290903) {
			case 8:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class76 == Class76.aClass76_755) {
			switch (class150.anInt1958 * -1436290903) {
			case 0:
				return 34846;
			case 6:
				return 34842;
			case 4:
				return 34847;
			case 5:
				return 34843;
			case 1:
				return 34844;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class76 == Class76.aClass76_758) {
			switch (class150.anInt1958 * -1436290903) {
			case 1:
				return 34838;
			case 5:
				return 34837;
			case 6:
				return 34836;
			case 4:
				return 34841;
			case 0:
				return 34840;
			default:
				throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	public Class152 method8467(Class152 class152, Class152 class152_18_, float f, Class152 class152_19_) {
		return f < 0.5F ? class152 : class152_18_;
	}

	public void ba(int i, int i_20_) {
		int i_21_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_20_ & 0xff0000) / 1.671168E7F, (float) (i_20_ & 0xff00) / 65280.0F, (float) (i_20_ & 0xff) / 255.0F, (float) (i_20_ >>> 24) / 255.0F);
			i_21_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method13942(true);
			i_21_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_21_ |= 0x400;
		OpenGL.glClear(i_21_);
	}

	void method13920() {
		if (aClass158_5853 != null)
			OpenGL.glViewport(anInt8823 + anInt8749, (anInt8754 + aClass158_5853.method2716() - anInt8776 - anInt8752), anInt8751, anInt8752);
		OpenGL.glDepthRange(aFloat8735, aFloat8736);
	}

	void method14173(Interface32 interface32) {
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187 = (Class326_Sub2) interface32;
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5792();
	}

	final void method14179() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8758 & 0xff0000) / 1.671168E7F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8758 & 0xff00) / 65280.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8758 & 0xff) / 255.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = (float) (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	public void method8445() {
		if (aClass158_5853 != null) {
			int i = aClass158_5853.method2714();
			int i_22_ = aClass158_5853.method2716();
			if (i > 0 || i_22_ > 0) {
				int i_23_ = anInt8749;
				int i_24_ = anInt8776;
				int i_25_ = anInt8751;
				int i_26_ = anInt8752;
				method8421();
				int i_27_ = anInt8743;
				int i_28_ = anInt8744;
				int i_29_ = anInt8822;
				int i_30_ = anInt8742;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method13934();
				method13989(false);
				method13946(false);
				method13941(false);
				method13942(false);
				method14035(null);
				method13947(1);
				method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_22_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_27_, i_29_, i_28_, i_30_);
				method8617(i_23_, i_24_, i_25_, i_26_);
			}
		}
	}

	void method14199() {
		int i = 0;
		int i_31_ = 0;
		if (anInt8844 == 0) {
			i = 0;
			i_31_ = 0;
		} else if (anInt8844 == 1) {
			i = 1;
			i_31_ = 0;
		} else if (anInt8844 == 2) {
			i = 1;
			i_31_ = 1;
		}
		if (aClass73_8733 == Class73.aClass73_727)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_31_);
		else if (aClass73_8733 == Class73.aClass73_725)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_31_);
		else if (aClass73_8733 == Class73.aClass73_726)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_31_);
	}

	void method13956() {
		if (aBool8757)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method14054() {
		OpenGL.glDepthMask(aBool8755 && aBool8756);
	}

	void method14204() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	static final int method15566(Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 0:
			return 5122;
		case 7:
			return 5124;
		case 6:
			return 5120;
		case 5:
			return 5123;
		case 3:
			return 5126;
		default:
			return 5121;
		case 8:
			return 5131;
		case 2:
			return 5125;
		case 4:
			return 5121;
		}
	}

	void method13949() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = aFloat8770 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = aFloat8770 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = aFloat8770 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = -aFloat8826 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = -aFloat8826 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = -aFloat8826 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	public void method13933(Class384 class384) {
		float[] fs = class384.aFloatArray4667;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method13952() {
		if (aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method13951() {
		/* empty */
	}

	void method13953() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.aFloatArray4667, 0);
		int i;
		for (i = 0; i < anInt8773; i++) {
			Class282_Sub24 class282_sub24 = aClass282_Sub24Array8716[i];
			int i_32_ = class282_sub24.method12371(-2134785395);
			int i_33_ = 16386 + i;
			float f = class282_sub24.method12395(-671405195) / 255.0F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) class282_sub24.method12368((byte) -1);
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) class282_sub24.method12369(1534020223);
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) class282_sub24.method12394(1631595924);
			((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_33_, 4611, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (i_32_ >> 16 & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (i_32_ >> 8 & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (i_32_ & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_33_, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
			OpenGL.glLightf(i_33_, 4617, (1.0F / (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523))));
			OpenGL.glEnable(i_33_);
		}
		for (/**/; i < anInt8831; i++)
			OpenGL.glDisable(16386 + i);
	}

	final Interface32 method14207(boolean bool) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool);
	}

	boolean method13955(Class150 class150, Class76 class76) {
		return aBool8827;
	}

	Interface6 method14072(Class150 class150, Class76 class76, int i, int i_34_) {
		return method14064(class150, class76, i, i_34_);
	}

	void method14185() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	void method14127() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = aFloat8770 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = aFloat8770 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = aFloat8770 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = -aFloat8826 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = -aFloat8826 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = -aFloat8826 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	Interface6 method13961(Class150 class150, int i, int i_35_, boolean bool, float[] fs, int i_36_, int i_37_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_35_, 1942118537)))
			return new Class319_Sub2(this, class150, i, i_35_, bool, fs, i_36_, i_37_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, i, i_35_, fs, i_36_, i_37_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, class150, Class76.aClass76_758, Class323.method5778(i, 1029457431), Class323.method5778(i_35_, 411015837));
		class319_sub2.method14494(0, 0, i, i_35_, fs, class150, i_36_, i_37_);
		return class319_sub2;
	}

	Interface29 method14064(Class150 class150, Class76 class76, int i, int i_38_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_38_, 1942118537)))
			return new Class319_Sub2(this, class150, class76, i, i_38_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, class76, i, i_38_);
		return new Class319_Sub2(this, class150, class76, Class323.method5778(i, -509744092), Class323.method5778(i_38_, 139344255));
	}

	Interface31 method14034(int i, boolean bool, int[][] is) {
		return new Class319_Sub4(this, i, bool, is);
	}

	Interface1 method13962(Class150 class150, int i, int i_39_, int i_40_, boolean bool, byte[] is) {
		return new Class319_Sub1(this, class150, i, i_39_, i_40_, bool, is);
	}

	static final int method15567(Class67 class67) {
		if (class67 == Class67.aClass67_680)
			return 5890;
		if (class67 == Class67.aClass67_678)
			return 34167;
		if (class67 == Class67.aClass67_679)
			return 34168;
		if (class67 == Class67.aClass67_677)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method14088() {
		if (aClass158_5853 != null) {
			int i = anInt8823 + anInt8743;
			int i_41_ = anInt8754 + aClass158_5853.method2716() - anInt8742;
			int i_42_ = anInt8744 - anInt8743;
			int i_43_ = anInt8742 - anInt8822;
			if (i_42_ < 0)
				i_42_ = 0;
			if (i_43_ < 0)
				i_43_ = 0;
			OpenGL.glScissor(i, i_41_, i_42_, i_43_);
		}
	}

	void method13978() {
		OpenGL.glActiveTexture(33984 + anInt8780);
	}

	void method13979() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	void method13980() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	final void method14181() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8758 & 0xff0000) / 1.671168E7F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8758 & 0xff00) / 65280.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8758 & 0xff) / 255.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = (float) (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	final void method13970(int i, Class67 class67, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method15567(class67));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method13987() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8758 & 0xff0000) / 1.671168E7F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8758 & 0xff00) / 65280.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8758 & 0xff) / 255.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = (float) (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	void method14125() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = aFloat8769 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = aFloat8769 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = aFloat8769 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	static final int method15568(Class68 class68) {
		if (class68 == Class68.aClass68_687)
			return 7681;
		if (class68 == Class68.aClass68_683)
			return 8448;
		if (class68 == Class68.aClass68_682)
			return 34165;
		if (class68 == Class68.aClass68_684)
			return 260;
		if (class68 == Class68.aClass68_685)
			return 34023;
		throw new IllegalArgumentException();
	}

	void method13986(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public final void method14229(Class352 class352, int i, int i_44_, int i_45_, int i_46_) {
		int i_47_;
		int i_48_;
		if (class352 == Class352.aClass352_4099) {
			i_47_ = 1;
			i_48_ = i_46_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_47_ = 3;
			i_48_ = i_46_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_47_ = 4;
			i_48_ = i_46_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_47_ = 6;
			i_48_ = i_46_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_47_ = 5;
			i_48_ = i_46_ + 2;
		} else {
			i_47_ = 0;
			i_48_ = i_46_;
		}
		Class76 class76 = ((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(i_47_, i_48_, method15566(class76), (((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5794() + (long) (i_45_ * (class76.anInt748 * 971905895))));
	}

	void method13894() {
		int i = 0;
		int i_49_ = 0;
		if (anInt8844 == 0) {
			i = 0;
			i_49_ = 0;
		} else if (anInt8844 == 1) {
			i = 1;
			i_49_ = 0;
		} else if (anInt8844 == 2) {
			i = 1;
			i_49_ = 1;
		}
		if (aClass73_8733 == Class73.aClass73_727)
			OpenGL.glBlendFuncSeparate(770, 771, i, i_49_);
		else if (aClass73_8733 == Class73.aClass73_725)
			OpenGL.glBlendFuncSeparate(1, 1, i, i_49_);
		else if (aClass73_8733 == Class73.aClass73_726)
			OpenGL.glBlendFuncSeparate(774, 1, i, i_49_);
	}

	void method13914() {
		if (aBool8817)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method13991() {
		if (aBool8809 && aBool8808 && anInt8811 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method14013() {
		aFloat8819 = aFloat8697 - (float) anInt8680;
		aFloat8813 = aFloat8819 - (float) anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;
		if (aBool8692) {
			OpenGL.glFogf(2915, aFloat8813);
			OpenGL.glFogf(2916, aFloat8819);
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8810 & 0xff0000) / 1.671168E7F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8810 & 0xff00) / 65280.0F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8810 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
		}
	}

	void method13992(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	final Interface4 method13994(boolean bool) {
		return new Class326_Sub1(this, bool);
	}

	Interface1 method13917(Class150 class150, int i, int i_50_, int i_51_, boolean bool, byte[] is) {
		return new Class319_Sub1(this, class150, i, i_50_, i_51_, bool, is);
	}

	public void method14057(Class384 class384, Class384 class384_52_, Class384 class384_53_) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(class384, class384_52_);
		OpenGL.glLoadMatrixf(aClass384_8683.aFloatArray4667, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class384_53_.aFloatArray4667, 0);
	}

	public void method14161(int i, Interface4 interface4) {
		((Class505_Sub2_Sub1) this).aClass326_Sub1Array10186[i] = (Class326_Sub1) interface4;
	}

	void method14188() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	void method14197() {
		if (aBool8818)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	public final void method13923(Class352 class352, int i, int i_54_) {
		int i_55_;
		int i_56_;
		if (class352 == Class352.aClass352_4099) {
			i_55_ = 1;
			i_56_ = i_54_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_55_ = 3;
			i_56_ = i_54_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_55_ = 4;
			i_56_ = i_54_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_55_ = 6;
			i_56_ = i_54_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_55_ = 5;
			i_56_ = i_54_ + 2;
		} else {
			i_55_ = 0;
			i_56_ = i_54_;
		}
		OpenGL.glDrawArrays(i_55_, i, i_56_);
	}

	public final void method14002(Class352 class352, int i, int i_57_, int i_58_, int i_59_) {
		int i_60_;
		int i_61_;
		if (class352 == Class352.aClass352_4099) {
			i_60_ = 1;
			i_61_ = i_59_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_60_ = 3;
			i_61_ = i_59_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_60_ = 4;
			i_61_ = i_59_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_60_ = 6;
			i_61_ = i_59_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_60_ = 5;
			i_61_ = i_59_ + 2;
		} else {
			i_60_ = 0;
			i_61_ = i_59_;
		}
		Class76 class76 = ((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(i_60_, i_61_, method15566(class76), (((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5794() + (long) (i_58_ * (class76.anInt748 * 971905895))));
	}

	public final synchronized void method8398(int i) {
		int i_62_ = 0;
		i &= 0x7fffffff;
		while (!((Class505_Sub2_Sub1) this).aClass473_10174.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10174.method7858((byte) -105);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_62_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8702 -= class282_sub38.anInt8002 * -570797415;
			if (i_62_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_62_ = 0;
			}
		}
		if (i_62_ > 0) {
			OpenGL.glDeleteBuffersARB(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_62_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10175.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10175.method7858((byte) -1);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_62_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8701 -= class282_sub38.anInt8002 * -570797415;
			if (i_62_ == 1000) {
				OpenGL.glDeleteTextures(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_62_ = 0;
			}
		}
		if (i_62_ > 0) {
			OpenGL.glDeleteTextures(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_62_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10176.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10176.method7858((byte) -28);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_62_++] = class282_sub38.anInt8002 * -570797415;
			if (i_62_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_62_ = 0;
			}
		}
		if (i_62_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_62_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10195.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10195.method7858((byte) -119);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_62_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8761 -= class282_sub38.anInt8002 * -570797415;
			if (i_62_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_62_ = 0;
			}
		}
		if (i_62_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_62_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			boolean bool = false;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10173.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10173.method7858((byte) -39);
			OpenGL.glDeleteLists((int) (class282_sub38.aLong3379 * -3442165056282524525L), class282_sub38.anInt8002 * -570797415);
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10178.method7861(141891001)) {
			Class282 class282 = ((Class505_Sub2_Sub1) this).aClass473_10178.method7858((byte) -24);
			OpenGL.glDeleteProgram((int) (class282.aLong3379 * -3442165056282524525L));
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10179.method7861(141891001)) {
			Class282 class282 = ((Class505_Sub2_Sub1) this).aClass473_10179.method7858((byte) -83);
			OpenGL.glDeleteShader((int) (class282.aLong3379 * -3442165056282524525L));
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10173.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10173.method7858((byte) -24);
			OpenGL.glDeleteLists((int) (class282_sub38.aLong3379 * -3442165056282524525L), class282_sub38.anInt8002 * -570797415);
		}
		if (za() > 100663296 && (Class169.method2869(1578958721) > ((Class505_Sub2_Sub1) this).aLong10199 + 60000L)) {
			System.gc();
			((Class505_Sub2_Sub1) this).aLong10199 = Class169.method2869(2044788226);
		}
		super.method8398(i);
	}

	final synchronized void method15569(int i, int i_63_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_63_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10174.method7877(class282_sub38, 204534613);
	}

	final synchronized void method15570(int i, int i_64_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_64_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10175.method7877(class282_sub38, 1175513464);
	}

	final synchronized void method15571(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, 1414212746);
	}

	final synchronized void method15572(int i, int i_65_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_65_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10195.method7877(class282_sub38, 832333379);
	}

	Interface6 method14142(Class150 class150, Class76 class76, int i, int i_66_) {
		return method14064(class150, class76, i, i_66_);
	}

	final synchronized void method15573(int i) {
		Class282 class282 = new Class282();
		class282.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10178.method7877(class282, 8939308);
	}

	Interface31 method14239(int i, boolean bool, int[][] is) {
		return new Class319_Sub4(this, i, bool, is);
	}

	void method14226() {
		OpenGL.glMatrixMode(5890);
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393)
			OpenGL.glLoadMatrixf(aClass384Array8782[anInt8780].method6517(((Class505_Sub2_Sub1) this).aFloatArray10182), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	static int method15574(Class150 class150, Class76 class76) {
		if (class76 == Class76.aClass76_751) {
			switch (class150.anInt1958 * -1436290903) {
			case 9:
				return 33779;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 6408;
			case 5:
				return 6407;
			case 7:
				return 33777;
			case 0:
				return 6409;
			case 1:
				return 6406;
			case 4:
				return 6410;
			}
		}
		if (class76 == Class76.aClass76_752) {
			switch (class150.anInt1958 * -1436290903) {
			case 0:
				return 32834;
			case 8:
				return 33189;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 32859;
			case 1:
				return 32830;
			case 4:
				return 36219;
			case 5:
				return 32852;
			}
		}
		if (class76 == Class76.aClass76_749) {
			switch (class150.anInt1958 * -1436290903) {
			case 8:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class76 == Class76.aClass76_755) {
			switch (class150.anInt1958 * -1436290903) {
			case 0:
				return 34846;
			case 6:
				return 34842;
			case 4:
				return 34847;
			case 5:
				return 34843;
			case 1:
				return 34844;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class76 == Class76.aClass76_758) {
			switch (class150.anInt1958 * -1436290903) {
			case 1:
				return 34838;
			case 5:
				return 34837;
			case 6:
				return 34836;
			case 4:
				return 34841;
			case 0:
				return 34840;
			default:
				throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	public void method8480(boolean bool) {
		/* empty */
	}

	void method14098(int i) {
		OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public Class168 method8481() {
		int i = -1;
		if (((Class505_Sub2_Sub1) this).aString10185.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class505_Sub2_Sub1) this).aString10185.indexOf("intel") != -1)
			i = 32902;
		else if (((Class505_Sub2_Sub1) this).aString10185.indexOf("ati") != -1)
			i = 4098;
		return new Class168(i, "OpenGL", ((Class505_Sub2_Sub1) this).anInt10196, ((Class505_Sub2_Sub1) this).aString10200, 0L);
	}

	void method8596(int i, int i_67_) throws Exception_Sub3 {
		aClass158_Sub2_5841.method14344();
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-1813889988);
	}

	public void method8483() {
		OpenGL.glFinish();
	}

	public void method8484() {
		OpenGL.glFinish();
	}

	void method13997(Interface32 interface32) {
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187 = (Class326_Sub2) interface32;
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5792();
	}

	void method8485() {
		super.method8397();
		if (((Class505_Sub2_Sub1) this).anOpenGL10191 != null) {
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2571();
			((Class505_Sub2_Sub1) this).anOpenGL10191.release();
			((Class505_Sub2_Sub1) this).anOpenGL10191 = null;
		}
	}

	static int method15575(Class150 class150) {
		switch (class150.anInt1958 * -1436290903) {
		default:
			throw new IllegalStateException();
		case 1:
			return 6406;
		case 8:
			return 6402;
		case 4:
			return 6410;
		case 0:
			return 6409;
		case 6:
			return 6408;
		case 5:
			return 6407;
		}
	}

	public final synchronized void method8487(int i) {
		int i_68_ = 0;
		i &= 0x7fffffff;
		while (!((Class505_Sub2_Sub1) this).aClass473_10174.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10174.method7858((byte) -71);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_68_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8702 -= class282_sub38.anInt8002 * -570797415;
			if (i_68_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_68_ = 0;
			}
		}
		if (i_68_ > 0) {
			OpenGL.glDeleteBuffersARB(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_68_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10175.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10175.method7858((byte) -31);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_68_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8701 -= class282_sub38.anInt8002 * -570797415;
			if (i_68_ == 1000) {
				OpenGL.glDeleteTextures(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_68_ = 0;
			}
		}
		if (i_68_ > 0) {
			OpenGL.glDeleteTextures(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_68_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10176.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10176.method7858((byte) -110);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_68_++] = class282_sub38.anInt8002 * -570797415;
			if (i_68_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_68_ = 0;
			}
		}
		if (i_68_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_68_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10195.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10195.method7858((byte) -60);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_68_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8761 -= class282_sub38.anInt8002 * -570797415;
			if (i_68_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_68_ = 0;
			}
		}
		if (i_68_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_68_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			boolean bool = false;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10173.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10173.method7858((byte) -13);
			OpenGL.glDeleteLists((int) (class282_sub38.aLong3379 * -3442165056282524525L), class282_sub38.anInt8002 * -570797415);
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10178.method7861(141891001)) {
			Class282 class282 = ((Class505_Sub2_Sub1) this).aClass473_10178.method7858((byte) -10);
			OpenGL.glDeleteProgram((int) (class282.aLong3379 * -3442165056282524525L));
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10179.method7861(141891001)) {
			Class282 class282 = ((Class505_Sub2_Sub1) this).aClass473_10179.method7858((byte) -32);
			OpenGL.glDeleteShader((int) (class282.aLong3379 * -3442165056282524525L));
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10173.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10173.method7858((byte) -63);
			OpenGL.glDeleteLists((int) (class282_sub38.aLong3379 * -3442165056282524525L), class282_sub38.anInt8002 * -570797415);
		}
		if (za() > 100663296 && (Class169.method2869(1746619997) > ((Class505_Sub2_Sub1) this).aLong10199 + 60000L)) {
			System.gc();
			((Class505_Sub2_Sub1) this).aLong10199 = Class169.method2869(2047459986);
		}
		super.method8398(i);
	}

	Interface31 method14237(int i, boolean bool, int[][] is) {
		return new Class319_Sub4(this, i, bool, is);
	}

	Class70 method13995(Class72[] class72s) {
		return new Class70_Sub2(class72s);
	}

	Class158_Sub2 method8558(Canvas canvas, int i, int i_69_) {
		return new Class158_Sub2_Sub2_Sub1(this, canvas);
	}

	public void method8507() {
		if (aClass158_5853 != null) {
			int i = aClass158_5853.method2714();
			int i_70_ = aClass158_5853.method2716();
			if (i > 0 || i_70_ > 0) {
				int i_71_ = anInt8749;
				int i_72_ = anInt8776;
				int i_73_ = anInt8751;
				int i_74_ = anInt8752;
				method8421();
				int i_75_ = anInt8743;
				int i_76_ = anInt8744;
				int i_77_ = anInt8822;
				int i_78_ = anInt8742;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method13934();
				method13989(false);
				method13946(false);
				method13941(false);
				method13942(false);
				method14035(null);
				method13947(1);
				method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_70_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_75_, i_77_, i_76_, i_78_);
				method8617(i_71_, i_72_, i_73_, i_74_);
			}
		}
	}

	public boolean method14045() {
		return ((Class505_Sub2_Sub1) this).aBool10192;
	}

	public void method8497() {
		if (aClass158_5853 != null) {
			int i = aClass158_5853.method2714();
			int i_79_ = aClass158_5853.method2716();
			if (i > 0 || i_79_ > 0) {
				int i_80_ = anInt8749;
				int i_81_ = anInt8776;
				int i_82_ = anInt8751;
				int i_83_ = anInt8752;
				method8421();
				int i_84_ = anInt8743;
				int i_85_ = anInt8744;
				int i_86_ = anInt8822;
				int i_87_ = anInt8742;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method13934();
				method13989(false);
				method13946(false);
				method13941(false);
				method13942(false);
				method14035(null);
				method13947(1);
				method13904(0);
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
				method8617(i_80_, i_81_, i_82_, i_83_);
			}
		}
	}

	public void fd(int i, int i_88_) {
		int i_89_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_88_ & 0xff0000) / 1.671168E7F, (float) (i_88_ & 0xff00) / 65280.0F, (float) (i_88_ & 0xff) / 255.0F, (float) (i_88_ >>> 24) / 255.0F);
			i_89_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method13942(true);
			i_89_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_89_ |= 0x400;
		OpenGL.glClear(i_89_);
	}

	public void method14056(Class384 class384, Class384 class384_90_, Class384 class384_91_) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(class384, class384_90_);
		OpenGL.glLoadMatrixf(aClass384_8683.aFloatArray4667, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class384_91_.aFloatArray4667, 0);
	}

	final synchronized void method15576(int i) {
		Class282 class282 = new Class282();
		class282.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10178.method7877(class282, 1183853013);
	}

	public Class152 method8557(Class152 class152, Class152 class152_92_, float f, Class152 class152_93_) {
		return f < 0.5F ? class152 : class152_92_;
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub3_Sub2(this);
	}

	public Interface8 method8621(int i, int i_94_) {
		return new Class333(this, Class150.aClass150_1953, Class76.aClass76_749, i, i_94_);
	}

	static final int method15577(Class67 class67) {
		if (class67 == Class67.aClass67_680)
			return 5890;
		if (class67 == Class67.aClass67_678)
			return 34167;
		if (class67 == Class67.aClass67_679)
			return 34168;
		if (class67 == Class67.aClass67_677)
			return 34166;
		throw new IllegalArgumentException();
	}

	final synchronized void method15578(long l) {
		Class282 class282 = new Class282();
		class282.aLong3379 = l * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10179.method7877(class282, 1623227813);
	}

	public int[] kf(int i, int i_95_, int i_96_, int i_97_) {
		int[] is = new int[i_96_ * i_97_];
		int i_98_ = aClass158_5853.method2716();
		for (int i_99_ = 0; i_99_ < i_97_; i_99_++)
			OpenGL.glReadPixelsi(i, i_98_ - i_95_ - i_99_ - 1, i_96_, 1, 32993, ((Class505_Sub2_Sub1) this).anInt10198, is, i_99_ * i_96_);
		return is;
	}

	void method8531() {
		super.method8397();
		if (((Class505_Sub2_Sub1) this).anOpenGL10191 != null) {
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2571();
			((Class505_Sub2_Sub1) this).anOpenGL10191.release();
			((Class505_Sub2_Sub1) this).anOpenGL10191 = null;
		}
	}

	byte[] method15579(String string) {
		return method14075("gl", string);
	}

	void method13922() {
		if (aBool8843)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	void method8486() {
		super.method8397();
		if (((Class505_Sub2_Sub1) this).anOpenGL10191 != null) {
			((Class505_Sub2_Sub1) this).anOpenGL10191.method2571();
			((Class505_Sub2_Sub1) this).anOpenGL10191.release();
			((Class505_Sub2_Sub1) this).anOpenGL10191 = null;
		}
	}

	void method13897() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8825 - 1; i >= 0; i--) {
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
			int i_100_ = 16384 + i;
			OpenGL.glLightfv(i_100_, 4608, fs, 0);
			OpenGL.glLightf(i_100_, 4615, 0.0F);
			OpenGL.glLightf(i_100_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class505_Sub2_Sub1) this).anOpenGL10191.setSwapInterval(0);
		super.method13897();
	}

	public void method14058(Class384 class384, Class384 class384_101_, Class384 class384_102_) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(class384, class384_101_);
		OpenGL.glLoadMatrixf(aClass384_8683.aFloatArray4667, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class384_102_.aFloatArray4667, 0);
	}

	void method14051() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8825 - 1; i >= 0; i--) {
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
			int i_103_ = 16384 + i;
			OpenGL.glLightfv(i_103_, 4608, fs, 0);
			OpenGL.glLightf(i_103_, 4615, 0.0F);
			OpenGL.glLightf(i_103_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class505_Sub2_Sub1) this).anOpenGL10191.setSwapInterval(0);
		super.method13897();
	}

	void method13929() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8825 - 1; i >= 0; i--) {
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
		((Class505_Sub2_Sub1) this).anOpenGL10191.setSwapInterval(0);
		super.method13897();
	}

	void method14041() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		for (int i = anInt8825 - 1; i >= 0; i--) {
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
			int i_105_ = 16384 + i;
			OpenGL.glLightfv(i_105_, 4608, fs, 0);
			OpenGL.glLightf(i_105_, 4615, 0.0F);
			OpenGL.glLightf(i_105_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class505_Sub2_Sub1) this).anOpenGL10191.setSwapInterval(0);
		super.method13897();
	}

	public float method14091() {
		return 0.0F;
	}

	void method14087() {
		if (aClass158_5853 != null)
			OpenGL.glViewport(anInt8823 + anInt8749, (anInt8754 + aClass158_5853.method2716() - anInt8776 - anInt8752), anInt8751, anInt8752);
		OpenGL.glDepthRange(aFloat8735, aFloat8736);
	}

	void method14205() {
		if (aClass158_5853 != null)
			OpenGL.glViewport(anInt8823 + anInt8749, (anInt8754 + aClass158_5853.method2716() - anInt8776 - anInt8752), anInt8751, anInt8752);
		OpenGL.glDepthRange(aFloat8735, aFloat8736);
	}

	void method14047() {
		if (aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method14019() {
		if (aClass158_5853 != null) {
			int i = anInt8823 + anInt8743;
			int i_106_ = anInt8754 + aClass158_5853.method2716() - anInt8742;
			int i_107_ = anInt8744 - anInt8743;
			int i_108_ = anInt8742 - anInt8822;
			if (i_107_ < 0)
				i_107_ = 0;
			if (i_108_ < 0)
				i_108_ = 0;
			OpenGL.glScissor(i, i_106_, i_107_, i_108_);
		}
	}

	void method13909() {
		if (aBool8843)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method14107(Class384 class384) {
		float[] fs = class384.aFloatArray4667;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	void method14119() {
		if (aBool8757)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	final synchronized void method15580(long l) {
		Class282 class282 = new Class282();
		class282.aLong3379 = l * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10179.method7877(class282, 87906600);
	}

	void method14169() {
		OpenGL.glDepthMask(aBool8755 && aBool8756);
	}

	void method14121() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method14122() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method14025() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	final synchronized void method15581(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, -192968884);
	}

	public void fu(int i, int i_109_) {
		int i_110_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_109_ & 0xff0000) / 1.671168E7F, (float) (i_109_ & 0xff00) / 65280.0F, (float) (i_109_ & 0xff) / 255.0F, (float) (i_109_ >>> 24) / 255.0F);
			i_110_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method13942(true);
			i_110_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_110_ |= 0x400;
		OpenGL.glClear(i_110_);
	}

	void method14183() {
		OpenGL.glMatrixMode(5890);
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393)
			OpenGL.glLoadMatrixf(aClass384Array8782[anInt8780].method6517(((Class505_Sub2_Sub1) this).aFloatArray10182), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method14026() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = aFloat8769 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = aFloat8769 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = aFloat8769 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	public void method8491(boolean bool) {
		/* empty */
	}

	void method8555(int i, int i_111_) throws Exception_Sub3 {
		aClass158_Sub2_5841.method14344();
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-1879314244);
	}

	void method14124() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = aFloat8769 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = aFloat8769 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = aFloat8769 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	void method13913() {
		/* empty */
	}

	void method14172() {
		if (aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public Class101 method14049(String string) {
		byte[] is = method15579(string);
		if (is == null)
			return null;
		Class114 class114 = method13891(is);
		return new Class101_Sub1(this, class114);
	}

	void method14132() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.aFloatArray4667, 0);
		int i;
		for (i = 0; i < anInt8773; i++) {
			Class282_Sub24 class282_sub24 = aClass282_Sub24Array8716[i];
			int i_112_ = class282_sub24.method12371(-2136398949);
			int i_113_ = 16386 + i;
			float f = class282_sub24.method12395(-1367391140) / 255.0F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) class282_sub24.method12368((byte) 48);
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) class282_sub24.method12369(1534020223);
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) class282_sub24.method12394(1329997001);
			((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_113_, 4611, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (i_112_ >> 16 & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (i_112_ >> 8 & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (i_112_ & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_113_, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
			OpenGL.glLightf(i_113_, 4617, (1.0F / (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523))));
			OpenGL.glEnable(i_113_);
		}
		for (/**/; i < anInt8831; i++)
			OpenGL.glDisable(16386 + i);
	}

	void method13982() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.aFloatArray4667, 0);
		int i;
		for (i = 0; i < anInt8773; i++) {
			Class282_Sub24 class282_sub24 = aClass282_Sub24Array8716[i];
			int i_114_ = class282_sub24.method12371(-2138332100);
			int i_115_ = 16386 + i;
			float f = class282_sub24.method12395(656103016) / 255.0F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) class282_sub24.method12368((byte) 82);
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) class282_sub24.method12369(1534020223);
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) class282_sub24.method12394(1976918511);
			((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_115_, 4611, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (i_114_ >> 16 & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (i_114_ >> 8 & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (i_114_ & 0xff) * f;
			((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_115_, 4609, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
			OpenGL.glLightf(i_115_, 4617, (1.0F / (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523))));
			OpenGL.glEnable(i_115_);
		}
		for (/**/; i < anInt8831; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method14134(Class150 class150, Class76 class76) {
		return true;
	}

	public int[] kh(int i, int i_116_, int i_117_, int i_118_) {
		int[] is = new int[i_117_ * i_118_];
		int i_119_ = aClass158_5853.method2716();
		for (int i_120_ = 0; i_120_ < i_118_; i_120_++)
			OpenGL.glReadPixelsi(i, i_119_ - i_116_ - i_120_ - 1, i_117_, 1, 32993, ((Class505_Sub2_Sub1) this).anInt10198, is, i_120_ * i_117_);
		return is;
	}

	public void method13996(Class70 class70) {
		Class72[] class72s = class70.aClass72Array707;
		int i = 0;
		boolean bool = false;
		boolean bool_121_ = false;
		boolean bool_122_ = false;
		for (int i_123_ = 0; i_123_ < class72s.length; i_123_++) {
			Class72 class72 = class72s[i_123_];
			Class326_Sub1 class326_sub1 = ((Class505_Sub2_Sub1) this).aClass326_Sub1Array10186[i_123_];
			int i_124_ = 0;
			int i_125_ = class326_sub1.method14559();
			long l = class326_sub1.method5794();
			class326_sub1.method5792();
			for (int i_126_ = 0; i_126_ < class72.method1296(); i_126_++) {
				Class69 class69 = class72.method1297(i_126_);
				switch (class69.anInt698) {
				case 10:
					OpenGL.glColorPointer(4, 5121, i_125_, l + (long) i_124_);
					bool = true;
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_125_, l + (long) i_124_);
					break;
				case 0:
					OpenGL.glNormalPointer(5126, i_125_, l + (long) i_124_);
					bool_121_ = true;
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_125_, l + (long) i_124_);
					break;
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_125_, l + (long) i_124_);
					bool_122_ = true;
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_125_, l + (long) i_124_);
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_125_, l + (long) i_124_);
					break;
				}
				i_124_ += class69.anInt704;
			}
		}
		if (((Class505_Sub2_Sub1) this).aBool10180 != bool_122_) {
			if (bool_122_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class505_Sub2_Sub1) this).aBool10180 = bool_122_;
		}
		if (((Class505_Sub2_Sub1) this).aBool10190 != bool_121_) {
			if (bool_121_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class505_Sub2_Sub1) this).aBool10190 = bool_121_;
		}
		if (((Class505_Sub2_Sub1) this).aBool10183 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class505_Sub2_Sub1) this).aBool10183 = bool;
		}
		if (((Class505_Sub2_Sub1) this).anInt10181 < i) {
			for (int i_127_ = ((Class505_Sub2_Sub1) this).anInt10181; i_127_ < i; i_127_++) {
				OpenGL.glClientActiveTexture(33984 + i_127_);
				OpenGL.glEnableClientState(32888);
			}
			((Class505_Sub2_Sub1) this).anInt10181 = i;
		} else if (((Class505_Sub2_Sub1) this).anInt10181 > i) {
			for (int i_128_ = i; i_128_ < ((Class505_Sub2_Sub1) this).anInt10181; i_128_++) {
				OpenGL.glClientActiveTexture(33984 + i_128_);
				OpenGL.glDisableClientState(32888);
			}
			((Class505_Sub2_Sub1) this).anInt10181 = i;
		}
	}

	boolean method14137(Class150 class150, Class76 class76) {
		return true;
	}

	boolean method14136(Class150 class150, Class76 class76) {
		return true;
	}

	Interface6 method14141(Class150 class150, Class76 class76, int i, int i_129_) {
		return method14064(class150, class76, i, i_129_);
	}

	final Interface32 method13993(boolean bool) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool);
	}

	Interface6 method14216(Class150 class150, Class76 class76, int i, int i_130_) {
		return method14064(class150, class76, i, i_130_);
	}

	Interface6 method14144(Class150 class150, int i, int i_131_, boolean bool, byte[] is, int i_132_, int i_133_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_131_, 1942118537)))
			return new Class319_Sub2(this, class150, i, i_131_, bool, is, i_132_, i_133_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, i, i_131_, is, i_132_, i_133_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, class150, Class76.aClass76_751, Class323.method5778(i, -1427498963), Class323.method5778(i_131_, -1153726914));
		class319_sub2.method52(0, 0, i, i_131_, is, class150, i_132_, i_133_);
		return class319_sub2;
	}

	Interface6 method14090(Class150 class150, int i, int i_134_, boolean bool, float[] fs, int i_135_, int i_136_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_134_, 1942118537)))
			return new Class319_Sub2(this, class150, i, i_134_, bool, fs, i_135_, i_136_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, i, i_134_, fs, i_135_, i_136_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, class150, Class76.aClass76_758, Class323.method5778(i, 86710193), Class323.method5778(i_134_, -962187680));
		class319_sub2.method14494(0, 0, i, i_134_, fs, class150, i_135_, i_136_);
		return class319_sub2;
	}

	public void method13964() {
		int i = ((Class505_Sub2_Sub1) this).anIntArray10188[anInt8780];
		if (i != 0) {
			((Class505_Sub2_Sub1) this).anIntArray10188[anInt8780] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	Interface6 method14008(int i, int i_137_, boolean bool, int[] is, int i_138_, int i_139_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_137_, 1942118537)))
			return new Class319_Sub2(this, i, i_137_, bool, is, i_138_, i_139_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, i, i_137_, is, i_138_, i_139_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Class323.method5778(i, -1060363007), Class323.method5778(i_137_, -1282480778));
		class319_sub2.method48(0, 0, i, i_137_, is, i_138_, i_139_);
		return class319_sub2;
	}

	Interface6 method14048(int i, int i_140_, boolean bool, int[] is, int i_141_, int i_142_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_140_, 1942118537)))
			return new Class319_Sub2(this, i, i_140_, bool, is, i_141_, i_142_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, i, i_140_, is, i_141_, i_142_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Class323.method5778(i, 1023785634), Class323.method5778(i_140_, -747639178));
		class319_sub2.method48(0, 0, i, i_140_, is, i_141_, i_142_);
		return class319_sub2;
	}

	public final void method13983(Class352 class352, int i, int i_143_, int i_144_, int i_145_) {
		int i_146_;
		int i_147_;
		if (class352 == Class352.aClass352_4099) {
			i_146_ = 1;
			i_147_ = i_145_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_146_ = 3;
			i_147_ = i_145_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_146_ = 4;
			i_147_ = i_145_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_146_ = 6;
			i_147_ = i_145_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_146_ = 5;
			i_147_ = i_145_ + 2;
		} else {
			i_146_ = 0;
			i_147_ = i_145_;
		}
		Class76 class76 = ((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(i_146_, i_147_, method15566(class76), (((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5794() + (long) (i_144_ * (class76.anInt748 * 971905895))));
	}

	Interface1 method14077(Class150 class150, int i, int i_148_, int i_149_, boolean bool, byte[] is) {
		return new Class319_Sub1(this, class150, i, i_148_, i_149_, bool, is);
	}

	Interface29 method14022(Class150 class150, Class76 class76, int i, int i_150_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_150_, 1942118537)))
			return new Class319_Sub2(this, class150, class76, i, i_150_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, class76, i, i_150_);
		return new Class319_Sub2(this, class150, class76, Class323.method5778(i, 2046359812), Class323.method5778(i_150_, -1483303534));
	}

	Interface29 method14148(Class150 class150, Class76 class76, int i, int i_151_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_151_, 1942118537)))
			return new Class319_Sub2(this, class150, class76, i, i_151_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, class76, i, i_151_);
		return new Class319_Sub2(this, class150, class76, Class323.method5778(i, 622988125), Class323.method5778(i_151_, -1774275791));
	}

	Interface29 method14149(Class150 class150, Class76 class76, int i, int i_152_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_152_, 1942118537)))
			return new Class319_Sub2(this, class150, class76, i, i_152_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, class76, i, i_152_);
		return new Class319_Sub2(this, class150, class76, Class323.method5778(i, -196167688), Class323.method5778(i_152_, -1962177193));
	}

	public void method14153() {
		int i = ((Class505_Sub2_Sub1) this).anIntArray10188[anInt8780];
		if (i != 0) {
			((Class505_Sub2_Sub1) this).anIntArray10188[anInt8780] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	public void method14154() {
		int i = ((Class505_Sub2_Sub1) this).anIntArray10188[anInt8780];
		if (i != 0) {
			((Class505_Sub2_Sub1) this).anIntArray10188[anInt8780] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	final void method14224(int i, Class67 class67, boolean bool, boolean bool_153_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method15567(class67));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_153_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_153_ ? 769 : 768);
	}

	final void method14162(int i, Class67 class67, boolean bool, boolean bool_154_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method15567(class67));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_154_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_154_ ? 769 : 768);
	}

	public final void method14228(Class352 class352, int i, int i_155_, int i_156_, int i_157_) {
		int i_158_;
		int i_159_;
		if (class352 == Class352.aClass352_4099) {
			i_158_ = 1;
			i_159_ = i_157_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_158_ = 3;
			i_159_ = i_157_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_158_ = 4;
			i_159_ = i_157_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_158_ = 6;
			i_159_ = i_157_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_158_ = 5;
			i_159_ = i_157_ + 2;
		} else {
			i_158_ = 0;
			i_159_ = i_157_;
		}
		Class76 class76 = ((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(i_158_, i_159_, method15566(class76), (((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5794() + (long) (i_156_ * (class76.anInt748 * 971905895))));
	}

	void method14187() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	final void method14180() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8758 & 0xff0000) / 1.671168E7F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8758 & 0xff00) / 65280.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8758 & 0xff) / 255.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = (float) (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	final void method14063() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8758 & 0xff0000) / 1.671168E7F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8758 & 0xff00) / 65280.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8758 & 0xff) / 255.0F;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = (float) (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	final synchronized void method15582(int i) {
		Class282 class282 = new Class282();
		class282.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10178.method7877(class282, -75474566);
	}

	public Class168 method8392() {
		int i = -1;
		if (((Class505_Sub2_Sub1) this).aString10185.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class505_Sub2_Sub1) this).aString10185.indexOf("intel") != -1)
			i = 32902;
		else if (((Class505_Sub2_Sub1) this).aString10185.indexOf("ati") != -1)
			i = 4098;
		return new Class168(i, "OpenGL", ((Class505_Sub2_Sub1) this).anInt10196, ((Class505_Sub2_Sub1) this).aString10200, 0L);
	}

	Interface6 method14143(Class150 class150, int i, int i_160_, boolean bool, byte[] is, int i_161_, int i_162_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_160_, 1942118537)))
			return new Class319_Sub2(this, class150, i, i_160_, bool, is, i_161_, i_162_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, class150, i, i_160_, is, i_161_, i_162_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, class150, Class76.aClass76_751, Class323.method5778(i, -1588026691), Class323.method5778(i_160_, 191823312));
		class319_sub2.method52(0, 0, i, i_160_, is, class150, i_161_, i_162_);
		return class319_sub2;
	}

	void method14184() {
		OpenGL.glActiveTexture(33984 + anInt8780);
	}

	boolean method13954(Class150 class150, Class76 class76) {
		return true;
	}

	void method14186() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	public boolean method14146() {
		return ((Class505_Sub2_Sub1) this).aBool10177;
	}

	Class70 method14017(Class72[] class72s) {
		return new Class70_Sub2(class72s);
	}

	void method13916() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	public void fi(int i, int i_163_) {
		int i_164_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_163_ & 0xff0000) / 1.671168E7F, (float) (i_163_ & 0xff00) / 65280.0F, (float) (i_163_ & 0xff) / 255.0F, (float) (i_163_ >>> 24) / 255.0F);
			i_164_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method13942(true);
			i_164_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_164_ |= 0x400;
		OpenGL.glClear(i_164_);
	}

	void method13924() {
		/* empty */
	}

	void method13945() {
		if (aBool8818)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	void method14190() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	public void method13892(Class384 class384, Class384 class384_165_, Class384 class384_166_) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(class384, class384_165_);
		OpenGL.glLoadMatrixf(aClass384_8683.aFloatArray4667, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class384_166_.aFloatArray4667, 0);
	}

	void method14200() {
		if (aBool8817)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method13999() {
		aFloat8819 = aFloat8697 - (float) anInt8680;
		aFloat8813 = aFloat8819 - (float) anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;
		if (aBool8692) {
			OpenGL.glFogf(2915, aFloat8813);
			OpenGL.glFogf(2916, aFloat8819);
			((Class505_Sub2_Sub1) this).aFloatArray10172[0] = (float) (anInt8810 & 0xff0000) / 1.671168E7F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[1] = (float) (anInt8810 & 0xff00) / 65280.0F;
			((Class505_Sub2_Sub1) this).aFloatArray10172[2] = (float) (anInt8810 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
		}
	}

	void method14203() {
		if (aBool8809 && aBool8808 && anInt8811 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method14015() {
		if (aBool8809 && aBool8808 && anInt8811 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method14092(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	final Interface32 method14206(boolean bool) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool);
	}

	static final int method15583(Class68 class68) {
		if (class68 == Class68.aClass68_687)
			return 7681;
		if (class68 == Class68.aClass68_683)
			return 8448;
		if (class68 == Class68.aClass68_682)
			return 34165;
		if (class68 == Class68.aClass68_684)
			return 260;
		if (class68 == Class68.aClass68_685)
			return 34023;
		throw new IllegalArgumentException();
	}

	final Interface4 method13925(boolean bool) {
		return new Class326_Sub1(this, bool);
	}

	Class70 method14209(Class72[] class72s) {
		return new Class70_Sub2(class72s);
	}

	public final synchronized void method8488(int i) {
		int i_167_ = 0;
		i &= 0x7fffffff;
		while (!((Class505_Sub2_Sub1) this).aClass473_10174.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10174.method7858((byte) -26);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_167_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8702 -= class282_sub38.anInt8002 * -570797415;
			if (i_167_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_167_ = 0;
			}
		}
		if (i_167_ > 0) {
			OpenGL.glDeleteBuffersARB(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_167_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10175.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10175.method7858((byte) -71);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_167_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8701 -= class282_sub38.anInt8002 * -570797415;
			if (i_167_ == 1000) {
				OpenGL.glDeleteTextures(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_167_ = 0;
			}
		}
		if (i_167_ > 0) {
			OpenGL.glDeleteTextures(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_167_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10176.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10176.method7858((byte) -4);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_167_++] = class282_sub38.anInt8002 * -570797415;
			if (i_167_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_167_ = 0;
			}
		}
		if (i_167_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			i_167_ = 0;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10195.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10195.method7858((byte) -56);
			((Class505_Sub2_Sub1) this).anIntArray10184[i_167_++] = (int) (class282_sub38.aLong3379 * -3442165056282524525L);
			anInt8761 -= class282_sub38.anInt8002 * -570797415;
			if (i_167_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
				i_167_ = 0;
			}
		}
		if (i_167_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_167_, (((Class505_Sub2_Sub1) this).anIntArray10184), 0);
			boolean bool = false;
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10173.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10173.method7858((byte) -88);
			OpenGL.glDeleteLists((int) (class282_sub38.aLong3379 * -3442165056282524525L), class282_sub38.anInt8002 * -570797415);
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10178.method7861(141891001)) {
			Class282 class282 = ((Class505_Sub2_Sub1) this).aClass473_10178.method7858((byte) -40);
			OpenGL.glDeleteProgram((int) (class282.aLong3379 * -3442165056282524525L));
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10179.method7861(141891001)) {
			Class282 class282 = ((Class505_Sub2_Sub1) this).aClass473_10179.method7858((byte) -38);
			OpenGL.glDeleteShader((int) (class282.aLong3379 * -3442165056282524525L));
		}
		while (!((Class505_Sub2_Sub1) this).aClass473_10173.method7861(141891001)) {
			Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class505_Sub2_Sub1) this).aClass473_10173.method7858((byte) -91);
			OpenGL.glDeleteLists((int) (class282_sub38.aLong3379 * -3442165056282524525L), class282_sub38.anInt8002 * -570797415);
		}
		if (za() > 100663296 && (Class169.method2869(2017519398) > ((Class505_Sub2_Sub1) this).aLong10199 + 60000L)) {
			System.gc();
			((Class505_Sub2_Sub1) this).aLong10199 = Class169.method2869(2095972718);
		}
		super.method8398(i);
	}

	void method14215(Interface32 interface32) {
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187 = (Class326_Sub2) interface32;
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5792();
	}

	public void method14212(Class70 class70) {
		Class72[] class72s = class70.aClass72Array707;
		int i = 0;
		boolean bool = false;
		boolean bool_168_ = false;
		boolean bool_169_ = false;
		for (int i_170_ = 0; i_170_ < class72s.length; i_170_++) {
			Class72 class72 = class72s[i_170_];
			Class326_Sub1 class326_sub1 = ((Class505_Sub2_Sub1) this).aClass326_Sub1Array10186[i_170_];
			int i_171_ = 0;
			int i_172_ = class326_sub1.method14559();
			long l = class326_sub1.method5794();
			class326_sub1.method5792();
			for (int i_173_ = 0; i_173_ < class72.method1296(); i_173_++) {
				Class69 class69 = class72.method1297(i_173_);
				switch (class69.anInt698) {
				case 10:
					OpenGL.glColorPointer(4, 5121, i_172_, l + (long) i_171_);
					bool = true;
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(2, 5126, i_172_, l + (long) i_171_);
					break;
				case 0:
					OpenGL.glNormalPointer(5126, i_172_, l + (long) i_171_);
					bool_168_ = true;
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(3, 5126, i_172_, l + (long) i_171_);
					break;
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_172_, l + (long) i_171_);
					bool_169_ = true;
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(1, 5126, i_172_, l + (long) i_171_);
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i++);
					OpenGL.glTexCoordPointer(4, 5126, i_172_, l + (long) i_171_);
					break;
				}
				i_171_ += class69.anInt704;
			}
		}
		if (((Class505_Sub2_Sub1) this).aBool10180 != bool_169_) {
			if (bool_169_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class505_Sub2_Sub1) this).aBool10180 = bool_169_;
		}
		if (((Class505_Sub2_Sub1) this).aBool10190 != bool_168_) {
			if (bool_168_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class505_Sub2_Sub1) this).aBool10190 = bool_168_;
		}
		if (((Class505_Sub2_Sub1) this).aBool10183 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class505_Sub2_Sub1) this).aBool10183 = bool;
		}
		if (((Class505_Sub2_Sub1) this).anInt10181 < i) {
			for (int i_174_ = ((Class505_Sub2_Sub1) this).anInt10181; i_174_ < i; i_174_++) {
				OpenGL.glClientActiveTexture(33984 + i_174_);
				OpenGL.glEnableClientState(32888);
			}
			((Class505_Sub2_Sub1) this).anInt10181 = i;
		} else if (((Class505_Sub2_Sub1) this).anInt10181 > i) {
			for (int i_175_ = i; i_175_ < ((Class505_Sub2_Sub1) this).anInt10181; i_175_++) {
				OpenGL.glClientActiveTexture(33984 + i_175_);
				OpenGL.glDisableClientState(32888);
			}
			((Class505_Sub2_Sub1) this).anInt10181 = i;
		}
	}

	public void method14213(int i, Interface4 interface4) {
		((Class505_Sub2_Sub1) this).aClass326_Sub1Array10186[i] = (Class326_Sub1) interface4;
	}

	void method13950() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.aFloatArray4667, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8747, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8762, 0);
	}

	void method13921() {
		if (aClass158_5853 != null) {
			int i = anInt8823 + anInt8743;
			int i_176_ = anInt8754 + aClass158_5853.method2716() - anInt8742;
			int i_177_ = anInt8744 - anInt8743;
			int i_178_ = anInt8742 - anInt8822;
			if (i_177_ < 0)
				i_177_ = 0;
			if (i_178_ < 0)
				i_178_ = 0;
			OpenGL.glScissor(i, i_176_, i_177_, i_178_);
		}
	}

	void method14238() {
		if (aBool8818)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
	}

	void method14217(Interface32 interface32) {
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187 = (Class326_Sub2) interface32;
		((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5792();
	}

	public final void method13959(Class352 class352, int i, int i_179_) {
		int i_180_;
		int i_181_;
		if (class352 == Class352.aClass352_4099) {
			i_180_ = 1;
			i_181_ = i_179_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_180_ = 3;
			i_181_ = i_179_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_180_ = 4;
			i_181_ = i_179_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_180_ = 6;
			i_181_ = i_179_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_180_ = 5;
			i_181_ = i_179_ + 2;
		} else {
			i_180_ = 0;
			i_181_ = i_179_;
		}
		OpenGL.glDrawArrays(i_180_, i, i_181_);
	}

	public final void method14101(Class352 class352, int i, int i_182_, int i_183_, int i_184_) {
		int i_185_;
		int i_186_;
		if (class352 == Class352.aClass352_4099) {
			i_185_ = 1;
			i_186_ = i_184_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_185_ = 3;
			i_186_ = i_184_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_185_ = 4;
			i_186_ = i_184_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_185_ = 6;
			i_186_ = i_184_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_185_ = 5;
			i_186_ = i_184_ + 2;
		} else {
			i_185_ = 0;
			i_186_ = i_184_;
		}
		Class76 class76 = ((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(i_185_, i_186_, method15566(class76), (((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5794() + (long) (i_183_ * (class76.anInt748 * 971905895))));
	}

	public Interface8 method8419(int i, int i_187_) {
		return new Class333(this, Class150.aClass150_1953, Class76.aClass76_749, i, i_187_);
	}

	public int[] ke(int i, int i_188_, int i_189_, int i_190_) {
		int[] is = new int[i_189_ * i_190_];
		int i_191_ = aClass158_5853.method2716();
		for (int i_192_ = 0; i_192_ < i_190_; i_192_++)
			OpenGL.glReadPixelsi(i, i_191_ - i_188_ - i_192_ - 1, i_189_, 1, 32993, ((Class505_Sub2_Sub1) this).anInt10198, is, i_192_ * i_189_);
		return is;
	}

	final void method13968(int i, Class67 class67, boolean bool, boolean bool_193_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method15567(class67));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_193_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_193_ ? 769 : 768);
	}

	public final void method14230(Class352 class352, int i, int i_194_, int i_195_, int i_196_) {
		int i_197_;
		int i_198_;
		if (class352 == Class352.aClass352_4099) {
			i_197_ = 1;
			i_198_ = i_196_ * 2;
		} else if (class352 == Class352.aClass352_4102) {
			i_197_ = 3;
			i_198_ = i_196_ + 1;
		} else if (class352 == Class352.aClass352_4098) {
			i_197_ = 4;
			i_198_ = i_196_ * 3;
		} else if (class352 == Class352.aClass352_4104) {
			i_197_ = 6;
			i_198_ = i_196_ + 2;
		} else if (class352 == Class352.aClass352_4103) {
			i_197_ = 5;
			i_198_ = i_196_ + 2;
		} else {
			i_197_ = 0;
			i_198_ = i_196_;
		}
		Class76 class76 = ((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(i_197_, i_198_, method15566(class76), (((Class505_Sub2_Sub1) this).aClass326_Sub2_10187.method5794() + (long) (i_195_ * (class76.anInt748 * 971905895))));
	}

	void method14235(int i) {
		OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method14236(int i) {
		OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	final void method14166(int i, Class67 class67, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method15567(class67));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	Interface31 method14011(int i, boolean bool, int[][] is) {
		return new Class319_Sub4(this, i, bool, is);
	}

	public void method14214(int i, Interface4 interface4) {
		((Class505_Sub2_Sub1) this).aClass326_Sub1Array10186[i] = (Class326_Sub1) interface4;
	}

	byte[] method15584(String string) {
		return method14075("gl", string);
	}

	static final int method15585(Class68 class68) {
		if (class68 == Class68.aClass68_687)
			return 7681;
		if (class68 == Class68.aClass68_683)
			return 8448;
		if (class68 == Class68.aClass68_682)
			return 34165;
		if (class68 == Class68.aClass68_684)
			return 260;
		if (class68 == Class68.aClass68_685)
			return 34023;
		throw new IllegalArgumentException();
	}

	static final int method15586(Class68 class68) {
		if (class68 == Class68.aClass68_687)
			return 7681;
		if (class68 == Class68.aClass68_683)
			return 8448;
		if (class68 == Class68.aClass68_682)
			return 34165;
		if (class68 == Class68.aClass68_684)
			return 260;
		if (class68 == Class68.aClass68_685)
			return 34023;
		throw new IllegalArgumentException();
	}

	void method14117() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	static final int method15587(Class67 class67) {
		if (class67 == Class67.aClass67_680)
			return 5890;
		if (class67 == Class67.aClass67_678)
			return 34167;
		if (class67 == Class67.aClass67_679)
			return 34168;
		if (class67 == Class67.aClass67_677)
			return 34166;
		throw new IllegalArgumentException();
	}

	boolean method14135(Class150 class150, Class76 class76) {
		return true;
	}

	void method14240(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	final synchronized void method15588(int i, int i_199_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_199_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10174.method7877(class282_sub38, 754267766);
	}

	Interface6 method14094(int i, int i_200_, boolean bool, int[] is, int i_201_, int i_202_) {
		if (((Class505_Sub2_Sub1) this).aBool10197 || (Class96_Sub9.method14585(i, 1942118537) && Class96_Sub9.method14585(i_200_, 1942118537)))
			return new Class319_Sub2(this, i, i_200_, bool, is, i_201_, i_202_);
		if (((Class505_Sub2_Sub1) this).aBool10194)
			return new Class319_Sub3(this, i, i_200_, is, i_201_, i_202_);
		Class319_Sub2 class319_sub2 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Class323.method5778(i, -874037324), Class323.method5778(i_200_, -2104244422));
		class319_sub2.method48(0, 0, i, i_200_, is, i_201_, i_202_);
		return class319_sub2;
	}

	final synchronized void method15589(int i, int i_203_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_203_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10175.method7877(class282_sub38, 824347547);
	}

	final synchronized void method15590(int i, int i_204_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_204_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10175.method7877(class282_sub38, 1571357440);
	}

	final synchronized void method15591(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, 121256123);
	}

	final synchronized void method15592(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, -297908517);
	}

	final synchronized void method15593(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, 1142940049);
	}

	public void method8420() {
		if (aClass158_5853 != null) {
			int i = aClass158_5853.method2714();
			int i_205_ = aClass158_5853.method2716();
			if (i > 0 || i_205_ > 0) {
				int i_206_ = anInt8749;
				int i_207_ = anInt8776;
				int i_208_ = anInt8751;
				int i_209_ = anInt8752;
				method8421();
				int i_210_ = anInt8743;
				int i_211_ = anInt8744;
				int i_212_ = anInt8822;
				int i_213_ = anInt8742;
				L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method13934();
				method13989(false);
				method13946(false);
				method13941(false);
				method13942(false);
				method14035(null);
				method13947(1);
				method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i, i_205_, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_210_, i_212_, i_211_, i_213_);
				method8617(i_206_, i_207_, i_208_, i_209_);
			}
		}
	}

	final synchronized void method15594(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, 962122184);
	}

	final synchronized void method15595(long l) {
		Class282 class282 = new Class282();
		class282.aLong3379 = l * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10179.method7877(class282, 183482405);
	}

	final synchronized void method15596(int i, int i_214_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_214_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10195.method7877(class282_sub38, 485599978);
	}

	final synchronized void method15597(int i, int i_215_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_215_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10195.method7877(class282_sub38, 98123723);
	}

	final synchronized void method15598(long l) {
		Class282 class282 = new Class282();
		class282.aLong3379 = l * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10179.method7877(class282, 1833532707);
	}

	void method13948() {
		((Class505_Sub2_Sub1) this).aFloatArray10172[0] = aFloat8769 * aFloat8766;
		((Class505_Sub2_Sub1) this).aFloatArray10172[1] = aFloat8769 * aFloat8767;
		((Class505_Sub2_Sub1) this).aFloatArray10172[2] = aFloat8769 * aFloat8768;
		((Class505_Sub2_Sub1) this).aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class505_Sub2_Sub1) this).aFloatArray10172, 0);
	}

	final synchronized void method15599(int i) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i);
		((Class505_Sub2_Sub1) this).aClass473_10176.method7877(class282_sub38, 1332919722);
	}

	void method13915() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.aFloatArray4667, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8747, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8762, 0);
	}

	final synchronized void method15600(int i) {
		Class282 class282 = new Class282();
		class282.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10178.method7877(class282, 1138125884);
	}

	void method14120() {
		OpenGL.glDepthMask(aBool8755 && aBool8756);
	}

	static final int method15601(Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 0:
			return 5122;
		case 7:
			return 5124;
		case 6:
			return 5120;
		case 5:
			return 5123;
		case 3:
			return 5126;
		default:
			return 5121;
		case 8:
			return 5131;
		case 2:
			return 5125;
		case 4:
			return 5121;
		}
	}

	static final int method15602(Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 0:
			return 5122;
		case 7:
			return 5124;
		case 6:
			return 5120;
		case 5:
			return 5123;
		case 3:
			return 5126;
		default:
			return 5121;
		case 8:
			return 5131;
		case 2:
			return 5125;
		case 4:
			return 5121;
		}
	}

	static int method15603(Class150 class150) {
		switch (class150.anInt1958 * -1436290903) {
		default:
			throw new IllegalStateException();
		case 1:
			return 6406;
		case 8:
			return 6402;
		case 4:
			return 6410;
		case 0:
			return 6409;
		case 6:
			return 6408;
		case 5:
			return 6407;
		}
	}

	static int method15604(Class150 class150) {
		switch (class150.anInt1958 * -1436290903) {
		default:
			throw new IllegalStateException();
		case 1:
			return 6406;
		case 8:
			return 6402;
		case 4:
			return 6410;
		case 0:
			return 6409;
		case 6:
			return 6408;
		case 5:
			return 6407;
		}
	}

	static int method15605(Class150 class150, Class76 class76) {
		if (class76 == Class76.aClass76_751) {
			switch (class150.anInt1958 * -1436290903) {
			case 9:
				return 33779;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 6408;
			case 5:
				return 6407;
			case 7:
				return 33777;
			case 0:
				return 6409;
			case 1:
				return 6406;
			case 4:
				return 6410;
			}
		}
		if (class76 == Class76.aClass76_752) {
			switch (class150.anInt1958 * -1436290903) {
			case 0:
				return 32834;
			case 8:
				return 33189;
			default:
				throw new IllegalArgumentException();
			case 6:
				return 32859;
			case 1:
				return 32830;
			case 4:
				return 36219;
			case 5:
				return 32852;
			}
		}
		if (class76 == Class76.aClass76_749) {
			switch (class150.anInt1958 * -1436290903) {
			case 8:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class76 == Class76.aClass76_755) {
			switch (class150.anInt1958 * -1436290903) {
			case 0:
				return 34846;
			case 6:
				return 34842;
			case 4:
				return 34847;
			case 5:
				return 34843;
			case 1:
				return 34844;
			default:
				throw new IllegalArgumentException();
			}
		}
		if (class76 == Class76.aClass76_758) {
			switch (class150.anInt1958 * -1436290903) {
			case 1:
				return 34838;
			case 5:
				return 34837;
			case 6:
				return 34836;
			case 4:
				return 34841;
			case 0:
				return 34840;
			default:
				throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	final synchronized void method15606(int i, int i_216_) {
		Class282_Sub38 class282_sub38 = new Class282_Sub38(i_216_);
		class282_sub38.aLong3379 = (long) i * -1253863389874800229L;
		((Class505_Sub2_Sub1) this).aClass473_10175.method7877(class282_sub38, 782321858);
	}
}
