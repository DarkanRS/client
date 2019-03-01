import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import java.awt.Canvas;

public final class Class505_Sub2_Sub1 extends Class505_Sub2 {

	Class115_Sub2 aClass115_Sub2_10189;
	LinkedNodeList aClass473_10173 = new LinkedNodeList();
	LinkedNodeList aClass473_10174 = new LinkedNodeList();
	LinkedNodeList aClass473_10175 = new LinkedNodeList();
	LinkedNodeList aClass473_10176 = new LinkedNodeList();
	LinkedNodeList aClass473_10195 = new LinkedNodeList();
	LinkedNodeList aClass473_10178 = new LinkedNodeList();
	LinkedNodeList aClass473_10179 = new LinkedNodeList();
	int[] anIntArray10184 = new int[1000];
	Class326_Sub1[] aClass326_Sub1Array10186 = new Class326_Sub1[16];
	float[] aFloatArray10172;
	float[] aFloatArray10182;
	OpenGL anOpenGL10191;
	String aString10185;
	String aString10200;
	int anInt10196;
	boolean aBool10193;
	boolean aBool10194;
	boolean aBool10197;
	boolean aBool10177;
	boolean aBool10192;
	int[] anIntArray10188;
	int anInt10198;
	Class326_Sub2 aClass326_Sub2_10187;
	long aLong10199;
	boolean aBool10180;
	boolean aBool10190;
	boolean aBool10183;
	int anInt10181;

	boolean method13975(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	public Class101 method13890(String string_1) {
		byte[] bytes_2 = this.method15579(string_1);
		if (bytes_2 == null) {
			return null;
		} else {
			Class114 class114_3 = this.method13891(bytes_2);
			return new Class101_Sub1(this, class114_3);
		}
	}

	public boolean method13887() {
		return this.aBool10177;
	}

	public boolean method13888() {
		return this.aBool10192;
	}

	Class505_Sub2_Sub1(OpenGL opengl_1, Canvas canvas_2, long long_3, Interface22 interface22_5, Index index_6, int i_7) {
		super(interface22_5, index_6, i_7, 1);
		new MapBuffer();
		new MapBuffer();
		this.aFloatArray10172 = new float[4];
		this.aFloatArray10182 = new float[16];
		int[] ints_8 = new int[1];

		try {
			this.anOpenGL10191 = opengl_1;
			this.anOpenGL10191.method2570();
			this.aString10185 = OpenGL.glGetString(7936).toLowerCase();
			this.aString10200 = OpenGL.glGetString(7937).toLowerCase();
			if (this.aString10185.indexOf("microsoft") == -1 && this.aString10185.indexOf("brian paul") == -1 && this.aString10185.indexOf("mesa") == -1) {
				String string_9 = OpenGL.glGetString(7938);
				String[] arr_10 = Class456_Sub3.method12681(string_9.replace('.', ' '), ' ', 229848533);
				if (arr_10.length >= 2) {
					int i_11;
					try {
						i_11 = Class328.parseInt(arr_10[0], 102234625);
						int i_12 = Class328.parseInt(arr_10[1], -768077921);
						this.anInt10196 = i_11 * 10 + i_12;
					} catch (NumberFormatException numberformatexception_20) {
						throw new RuntimeException("");
					}

					if (this.anInt10196 < 12) {
						throw new RuntimeException("");
					} else {
						OpenGL.glGetIntegerv(34018, ints_8, 0);
						this.anInt8825 = ints_8[0];
						if (this.anInt8825 < 2) {
							throw new RuntimeException("");
						} else {
							this.anInt8799 = 8;
							this.aBool10193 = this.anOpenGL10191.method2569("GL_ARB_vertex_buffer_object");
							this.aBool8828 = this.anOpenGL10191.method2569("GL_ARB_multisample");
							this.aBool10194 = this.anOpenGL10191.method2569("GL_ARB_texture_rectangle");
							this.anOpenGL10191.method2569("GL_ARB_texture_cube_map");
							this.aBool10197 = this.anOpenGL10191.method2569("GL_ARB_texture_non_power_of_two");
							this.aBool8827 = this.anOpenGL10191.method2569("GL_EXT_texture3D");
							this.aBool10177 = this.anOpenGL10191.method2569("GL_ARB_vertex_shader");
							this.anOpenGL10191.method2569("GL_ARB_vertex_program");
							this.aBool10192 = this.anOpenGL10191.method2569("GL_ARB_fragment_shader");
							this.anOpenGL10191.method2569("GL_ARB_fragment_program");
							this.anOpenGL10191.method2569("GL_EXT_framebuffer_object");
							this.anIntArray10188 = new int[this.anInt8825];
							this.aBool8718 = this.anOpenGL10191.method2569("GL_EXT_framebuffer_object");
							this.anOpenGL10191.method2569("GL_EXT_framebuffer_blit");
							this.anOpenGL10191.method2569("GL_EXT_framebuffer_multisample");
							if (!this.method13887() || !this.method13888()) {
								if (!this.anOpenGL10191.method2569("GL_ARB_multitexture")) {
									throw new RuntimeException("");
								}

								if (!this.anOpenGL10191.method2569("GL_ARB_texture_env_combine")) {
									throw new RuntimeException("");
								}
							}

							this.anInt10198 = Stream.method2926() ? 33639 : 5121;
							if (this.aString10200.indexOf("radeon") != -1) {
								i_11 = 0;
								boolean bool_23 = false;
								boolean bool_13 = false;
								String[] arr_14 = Class456_Sub3.method12681(this.aString10200.replace('/', ' '), ' ', 229848533);

								for (int i_15 = 0; i_15 < arr_14.length; i_15++) {
									String string_16 = arr_14[i_15];

									try {
										if (string_16.length() > 0) {
											if (string_16.charAt(0) == 120 && string_16.length() >= 3 && Class115.method1950(string_16.substring(1, 3), -590499639)) {
												string_16 = string_16.substring(1);
												bool_13 = true;
											}

											if (string_16.equals("hd")) {
												bool_23 = true;
											} else {
												if (string_16.startsWith("hd")) {
													string_16 = string_16.substring(2);
													bool_23 = true;
												}

												if (string_16.length() >= 4 && Class115.method1950(string_16.substring(0, 4), -77816633)) {
													i_11 = Class328.parseInt(string_16.substring(0, 4), 1896827568);
													break;
												}
											}
										}
									} catch (Exception exception_21) {
										;
									}
								}

								if (!bool_13 && !bool_23) {
									if (i_11 >= 7000 && i_11 <= 7999) {
										this.aBool10193 = false;
									}

									if (i_11 >= 7000 && i_11 <= 9250) {
										this.aBool8827 = false;
									}
								}

								this.aBool10194 &= this.anOpenGL10191.method2569("GL_ARB_half_float_pixel");
							}

							this.aString10185.indexOf("intel");
							if (this.aBool10193) {
								try {
									int[] ints_18 = new int[1];
									OpenGL.glGenBuffersARB(1, ints_18, 0);
								} catch (Throwable throwable_19) {
									throw new RuntimeException("");
								}
							}

							this.method8411(canvas_2, new Class158_Sub2_Sub2_Sub1(this, canvas_2, long_3), 316223525);
							this.method8412(canvas_2, (byte) 8);
							this.method13910(32768, false);
							this.method13910(32768, false);
						}
					}
				} else {
					throw new RuntimeException("");
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (Throwable throwable_22) {
			throwable_22.printStackTrace();
			this.method8396(1155001996);
			if (throwable_22 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) throwable_22;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	Interface6 method14145(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_2, 1942118537) || !Class96_Sub9.method14585(i_3, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, class150_1, i_2, i_3, floats_5, i_6, i_7);
			} else {
				Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_758, Class323.nextPowerOfTwo(i_2, 258691248), Class323.nextPowerOfTwo(i_3, 787226616));
				class319_sub2_8.method14494(0, 0, i_2, i_3, floats_5, class150_1, i_6, i_7);
				return class319_sub2_8;
			}
		} else {
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
		}
	}

	void method14020() {
		byte b_1 = 0;
		byte b_2 = 0;
		if (this.anInt8844 == 0) {
			b_1 = 0;
			b_2 = 0;
		} else if (this.anInt8844 == 1) {
			b_1 = 1;
			b_2 = 0;
		} else if (this.anInt8844 == 2) {
			b_1 = 1;
			b_2 = 1;
		}

		if (this.aClass73_8733 == Class73.aClass73_727) {
			OpenGL.glBlendFuncSeparate(770, 771, b_1, b_2);
		} else if (this.aClass73_8733 == Class73.aClass73_725) {
			OpenGL.glBlendFuncSeparate(1, 1, b_1, b_2);
		} else if (this.aClass73_8733 == Class73.aClass73_726) {
			OpenGL.glBlendFuncSeparate(774, 1, b_1, b_2);
		}

	}

	Class70 method14210(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	public void method8395() {
		OpenGL.glFinish();
	}

	void method8397() {
		super.method8397();
		if (this.anOpenGL10191 != null) {
			this.anOpenGL10191.method2571();
			this.anOpenGL10191.release();
			this.anOpenGL10191 = null;
		}

	}

	public float method13905() {
		return 0.0F;
	}

	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub1(this, canvas_1);
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub3_Sub2(this);
	}

	void method14182() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			OpenGL.glLoadMatrixf(this.aClass384Array8782[this.anInt8780].method6517(this.aFloatArray10182), 0);
		} else {
			OpenGL.glLoadIdentity();
		}

		OpenGL.glMatrixMode(5888);
	}

	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = this.aClass158_5853.method2716();

		for (int i_7 = 0; i_7 < i_4; i_7++) {
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt10198, ints_5, i_3 * i_7);
		}

		return ints_5;
	}

	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	public void ba(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	void method13920() {
		if (this.aClass158_5853 != null) {
			OpenGL.glViewport(this.anInt8823 + this.anInt8749, this.anInt8754 + this.aClass158_5853.method2716() - this.anInt8776 - this.anInt8752, this.anInt8751, this.anInt8752);
		}

		OpenGL.glDepthRange(this.aFloat8735, this.aFloat8736);
	}

	void method14173(Interface32 interface32_1) {
		this.aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		this.aClass326_Sub2_10187.method5792();
	}

	final void method14179() {
		this.aFloatArray10172[0] = (float) (this.anInt8758 & 0xff0000) / 1.671168E7F;
		this.aFloatArray10172[1] = (float) (this.anInt8758 & 0xff00) / 65280.0F;
		this.aFloatArray10172[2] = (float) (this.anInt8758 & 0xff) / 255.0F;
		this.aFloatArray10172[3] = (float) (this.anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray10172, 0);
	}

	public void method8445() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.aClass158_5853.method2714();
			int i_2 = this.aClass158_5853.method2716();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = this.anInt8749;
				int i_4 = this.anInt8776;
				int i_5 = this.anInt8751;
				int i_6 = this.anInt8752;
				this.method8421();
				int i_7 = this.anInt8743;
				int i_8 = this.anInt8744;
				int i_9 = this.anInt8822;
				int i_10 = this.anInt8742;
				this.L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				this.method13934();
				this.method13989(false);
				this.method13946(false);
				this.method13941(false);
				this.method13942(false);
				this.method14035((Interface30) null);
				this.method13947(1);
				this.method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				this.r(i_7, i_9, i_8, i_10);
				this.method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	void method14199() {
		byte b_1 = 0;
		byte b_2 = 0;
		if (this.anInt8844 == 0) {
			b_1 = 0;
			b_2 = 0;
		} else if (this.anInt8844 == 1) {
			b_1 = 1;
			b_2 = 0;
		} else if (this.anInt8844 == 2) {
			b_1 = 1;
			b_2 = 1;
		}

		if (this.aClass73_8733 == Class73.aClass73_727) {
			OpenGL.glBlendFuncSeparate(770, 771, b_1, b_2);
		} else if (this.aClass73_8733 == Class73.aClass73_725) {
			OpenGL.glBlendFuncSeparate(1, 1, b_1, b_2);
		} else if (this.aClass73_8733 == Class73.aClass73_726) {
			OpenGL.glBlendFuncSeparate(774, 1, b_1, b_2);
		}

	}

	void method13956() {
		if (this.aBool8757) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}

	}

	void method14054() {
		OpenGL.glDepthMask(this.aBool8755 && this.aBool8756);
	}

	void method14204() {
		if (this.aBool8684 && !this.aBool8760) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}

	}

	static final int method15566(Class76 class76_0) {
		switch (class76_0.anInt757) {
		case 0:
			return 5122;
		case 1:
		default:
			return 5121;
		case 2:
			return 5125;
		case 3:
			return 5126;
		case 4:
			return 5121;
		case 5:
			return 5123;
		case 6:
			return 5120;
		case 7:
			return 5124;
		case 8:
			return 5131;
		}
	}

	void method13949() {
		this.aFloatArray10172[0] = this.aFloat8770 * this.aFloat8766;
		this.aFloatArray10172[1] = this.aFloat8770 * this.aFloat8767;
		this.aFloatArray10172[2] = this.aFloat8770 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray10172, 0);
		this.aFloatArray10172[0] = -this.aFloat8826 * this.aFloat8766;
		this.aFloatArray10172[1] = -this.aFloat8826 * this.aFloat8767;
		this.aFloatArray10172[2] = -this.aFloat8826 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray10172, 0);
	}

	public void method13933(Matrix44Arr matrix44arr_1) {
		float[] floats_2 = matrix44arr_1.buf;
		floats_2[1] = -floats_2[1];
		floats_2[5] = -floats_2[5];
		floats_2[9] = -floats_2[9];
		floats_2[13] = -floats_2[13];
	}

	void method13952() {
		if (this.aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}

	}

	void method13951() {
	}

	void method13953() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass384_8740.buf, 0);

		int i_1;
		for (i_1 = 0; i_1 < this.anInt8773; i_1++) {
			Class282_Sub24 class282_sub24_2 = this.aClass282_Sub24Array8716[i_1];
			int i_3 = class282_sub24_2.method12371(-2134785395);
			int i_4 = i_1 + 16386;
			float f_5 = class282_sub24_2.method12395(-671405195) / 255.0F;
			this.aFloatArray10172[0] = (float) class282_sub24_2.method12368((byte) -1);
			this.aFloatArray10172[1] = (float) class282_sub24_2.method12369(1534020223);
			this.aFloatArray10172[2] = (float) class282_sub24_2.method12394(1631595924);
			this.aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4611, this.aFloatArray10172, 0);
			this.aFloatArray10172[0] = (float) (i_3 >> 16 & 0xff) * f_5;
			this.aFloatArray10172[1] = (float) (i_3 >> 8 & 0xff) * f_5;
			this.aFloatArray10172[2] = (float) (i_3 & 0xff) * f_5;
			this.aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4609, this.aFloatArray10172, 0);
			OpenGL.glLightf(i_4, 4617, 1.0F / (float) (class282_sub24_2.method12370(-789603523) * class282_sub24_2.method12370(-789603523)));
			OpenGL.glEnable(i_4);
		}

		while (i_1 < this.anInt8831) {
			OpenGL.glDisable(i_1 + 16386);
			++i_1;
		}

	}

	final Interface32 method14207(boolean bool_1) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool_1);
	}

	boolean method13955(Class150 class150_1, Class76 class76_2) {
		return this.aBool8827;
	}

	Interface6 method14072(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return this.method14064(class150_1, class76_2, i_3, i_4);
	}

	void method14185() {
		OpenGL.glTexEnvi(8960, 34161, method15583(this.aClass68Array8784[this.anInt8780]));
	}

	void method14127() {
		this.aFloatArray10172[0] = this.aFloat8770 * this.aFloat8766;
		this.aFloatArray10172[1] = this.aFloat8770 * this.aFloat8767;
		this.aFloatArray10172[2] = this.aFloat8770 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, this.aFloatArray10172, 0);
		this.aFloatArray10172[0] = -this.aFloat8826 * this.aFloat8766;
		this.aFloatArray10172[1] = -this.aFloat8826 * this.aFloat8767;
		this.aFloatArray10172[2] = -this.aFloat8826 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, this.aFloatArray10172, 0);
	}

	Interface6 method13961(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_2, 1942118537) || !Class96_Sub9.method14585(i_3, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, class150_1, i_2, i_3, floats_5, i_6, i_7);
			} else {
				Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_758, Class323.nextPowerOfTwo(i_2, 1029457431), Class323.nextPowerOfTwo(i_3, 411015837));
				class319_sub2_8.method14494(0, 0, i_2, i_3, floats_5, class150_1, i_6, i_7);
				return class319_sub2_8;
			}
		} else {
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
		}
	}

	Interface29 method14064(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return (Interface29) (!this.aBool10197 && (!Class96_Sub9.method14585(i_3, 1942118537) || !Class96_Sub9.method14585(i_4, 1942118537)) ? (this.aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Class323.nextPowerOfTwo(i_3, -509744092), Class323.nextPowerOfTwo(i_4, 139344255))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4));
	}

	Interface31 method14034(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	Interface1 method13962(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class319_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	static final int method15567(Class67 class67_0) {
		if (Class67.aClass67_680 == class67_0) {
			return 5890;
		} else if (Class67.aClass67_678 == class67_0) {
			return 34167;
		} else if (Class67.aClass67_679 == class67_0) {
			return 34168;
		} else if (Class67.aClass67_677 == class67_0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	void method14088() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.anInt8823 + this.anInt8743;
			int i_2 = this.anInt8754 + this.aClass158_5853.method2716() - this.anInt8742;
			int i_3 = this.anInt8744 - this.anInt8743;
			int i_4 = this.anInt8742 - this.anInt8822;
			if (i_3 < 0) {
				i_3 = 0;
			}

			if (i_4 < 0) {
				i_4 = 0;
			}

			OpenGL.glScissor(i_1, i_2, i_3, i_4);
		}

	}

	void method13978() {
		OpenGL.glActiveTexture(this.anInt8780 + 33984);
	}

	void method13979() {
		OpenGL.glTexEnvi(8960, 34161, method15583(this.aClass68Array8784[this.anInt8780]));
	}

	void method13980() {
		OpenGL.glTexEnvi(8960, 34162, method15583(this.aClass68Array8785[this.anInt8780]));
	}

	final void method14181() {
		this.aFloatArray10172[0] = (float) (this.anInt8758 & 0xff0000) / 1.671168E7F;
		this.aFloatArray10172[1] = (float) (this.anInt8758 & 0xff00) / 65280.0F;
		this.aFloatArray10172[2] = (float) (this.anInt8758 & 0xff) / 255.0F;
		this.aFloatArray10172[3] = (float) (this.anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray10172, 0);
	}

	final void method13970(int i_1, Class67 class67_2, boolean bool_3) {
		OpenGL.glTexEnvi(8960, i_1 + 34184, method15567(class67_2));
		OpenGL.glTexEnvi(8960, i_1 + 34200, 770);
	}

	final void method13987() {
		this.aFloatArray10172[0] = (float) (this.anInt8758 & 0xff0000) / 1.671168E7F;
		this.aFloatArray10172[1] = (float) (this.anInt8758 & 0xff00) / 65280.0F;
		this.aFloatArray10172[2] = (float) (this.anInt8758 & 0xff) / 255.0F;
		this.aFloatArray10172[3] = (float) (this.anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray10172, 0);
	}

	void method14125() {
		this.aFloatArray10172[0] = this.aFloat8769 * this.aFloat8766;
		this.aFloatArray10172[1] = this.aFloat8769 * this.aFloat8767;
		this.aFloatArray10172[2] = this.aFloat8769 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray10172, 0);
	}

	void method13986(int i_1) {
		OpenGL.glColorMask((i_1 & 0x1) != 0, (i_1 & 0x2) != 0, (i_1 & 0x4) != 0, (i_1 & 0x8) != 0);
	}

	public final void method14229(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		byte b_6;
		int i_7;
		if (class352_1 == Class352.aClass352_4099) {
			b_6 = 1;
			i_7 = i_5 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_6 = 3;
			i_7 = i_5 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_6 = 4;
			i_7 = i_5 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_6 = 6;
			i_7 = i_5 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_6 = 5;
			i_7 = i_5 + 2;
		} else {
			b_6 = 0;
			i_7 = i_5;
		}

		Class76 class76_8 = this.aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), this.aClass326_Sub2_10187.method5794() + (long) (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	void method13894() {
		byte b_1 = 0;
		byte b_2 = 0;
		if (this.anInt8844 == 0) {
			b_1 = 0;
			b_2 = 0;
		} else if (this.anInt8844 == 1) {
			b_1 = 1;
			b_2 = 0;
		} else if (this.anInt8844 == 2) {
			b_1 = 1;
			b_2 = 1;
		}

		if (this.aClass73_8733 == Class73.aClass73_727) {
			OpenGL.glBlendFuncSeparate(770, 771, b_1, b_2);
		} else if (this.aClass73_8733 == Class73.aClass73_725) {
			OpenGL.glBlendFuncSeparate(1, 1, b_1, b_2);
		} else if (this.aClass73_8733 == Class73.aClass73_726) {
			OpenGL.glBlendFuncSeparate(774, 1, b_1, b_2);
		}

	}

	void method13914() {
		if (this.aBool8817) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}

	}

	void method13991() {
		if (this.aBool8809 && this.aBool8808 && this.anInt8811 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}

	}

	void method14013() {
		this.aFloat8819 = this.aFloat8697 - (float) this.anInt8680;
		this.aFloat8813 = this.aFloat8819 - (float) this.anInt8811;
		if (this.aFloat8813 < this.aFloat8726) {
			this.aFloat8813 = this.aFloat8726;
		}

		if (this.aBool8692) {
			OpenGL.glFogf(2915, this.aFloat8813);
			OpenGL.glFogf(2916, this.aFloat8819);
			this.aFloatArray10172[0] = (float) (this.anInt8810 & 0xff0000) / 1.671168E7F;
			this.aFloatArray10172[1] = (float) (this.anInt8810 & 0xff00) / 65280.0F;
			this.aFloatArray10172[2] = (float) (this.anInt8810 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, this.aFloatArray10172, 0);
		}

	}

	void method13992(boolean bool_1) {
		if (bool_1) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}

	}

	final Interface4 method13994(boolean bool_1) {
		return new Class326_Sub1(this, bool_1);
	}

	Interface1 method13917(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class319_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	public void method14057(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		OpenGL.glMatrixMode(5888);
		this.aClass384_8683.method6568(matrix44arr_1, matrix44arr_2);
		OpenGL.glLoadMatrixf(this.aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44arr_3.buf, 0);
	}

	public void method14161(int i_1, Interface4 interface4_2) {
		this.aClass326_Sub1Array10186[i_1] = (Class326_Sub1) interface4_2;
	}

	void method14188() {
		OpenGL.glTexEnvi(8960, 34162, method15583(this.aClass68Array8785[this.anInt8780]));
	}

	void method14197() {
		if (this.aBool8818) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}

	}

	public final void method13923(Class352 class352_1, int i_2, int i_3) {
		byte b_4;
		int i_5;
		if (class352_1 == Class352.aClass352_4099) {
			b_4 = 1;
			i_5 = i_3 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_4 = 3;
			i_5 = i_3 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_4 = 4;
			i_5 = i_3 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_4 = 6;
			i_5 = i_3 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_4 = 5;
			i_5 = i_3 + 2;
		} else {
			b_4 = 0;
			i_5 = i_3;
		}

		OpenGL.glDrawArrays(b_4, i_2, i_5);
	}

	public final void method14002(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		byte b_6;
		int i_7;
		if (class352_1 == Class352.aClass352_4099) {
			b_6 = 1;
			i_7 = i_5 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_6 = 3;
			i_7 = i_5 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_6 = 4;
			i_7 = i_5 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_6 = 6;
			i_7 = i_5 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_6 = 5;
			i_7 = i_5 + 2;
		} else {
			b_6 = 0;
			i_7 = i_5;
		}

		Class76 class76_8 = this.aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), this.aClass326_Sub2_10187.method5794() + (long) (i_4 * class76_8.anInt748));
	}

	public final synchronized void method8398(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		Class282_Sub38 class282_sub38_4;
		while (!this.aClass473_10174.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10174.popTail();
			this.anIntArray10184[i_2++] = (int) class282_sub38_4.data;
			this.anInt8702 -= class282_sub38_4.anInt8002;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10175.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10175.popTail();
			this.anIntArray10184[i_2++] = (int) class282_sub38_4.data;
			this.anInt8701 -= class282_sub38_4.anInt8002;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10176.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10176.popTail();
			this.anIntArray10184[i_2++] = class282_sub38_4.anInt8002;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10195.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10195.popTail();
			this.anIntArray10184[i_2++] = (int) class282_sub38_4.data;
			this.anInt8761 -= class282_sub38_4.anInt8002;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, this.anIntArray10184, 0);
			boolean bool_3 = false;
		}

		while (!this.aClass473_10173.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.data, class282_sub38_4.anInt8002);
		}

		Node node_5;
		while (!this.aClass473_10178.method7861(141891001)) {
			node_5 = this.aClass473_10178.popTail();
			OpenGL.glDeleteProgram((int) node_5.data);
		}

		while (!this.aClass473_10179.method7861(141891001)) {
			node_5 = this.aClass473_10179.popTail();
			OpenGL.glDeleteShader((int) node_5.data);
		}

		while (!this.aClass473_10173.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.data, class282_sub38_4.anInt8002);
		}

		if (this.za() > 100663296 && Class169.time() > this.aLong10199 + 60000L) {
			System.gc();
			this.aLong10199 = Class169.time();
		}

		super.method8398(i_1);
	}

	final synchronized void method15569(int i_1, int i_2) {
		Class282_Sub38 class282_sub38_3 = new Class282_Sub38(i_2);
		class282_sub38_3.data = (long) i_1;
		this.aClass473_10174.insertBack(class282_sub38_3);
	}

	final synchronized void method15570(int i_1, int i_2) {
		Class282_Sub38 class282_sub38_3 = new Class282_Sub38(i_2);
		class282_sub38_3.data = (long) i_1;
		this.aClass473_10175.insertBack(class282_sub38_3);
	}

	final synchronized void method15571(int i_1) {
		Class282_Sub38 class282_sub38_2 = new Class282_Sub38(i_1);
		this.aClass473_10176.insertBack(class282_sub38_2);
	}

	final synchronized void method15572(int i_1, int i_2) {
		Class282_Sub38 class282_sub38_3 = new Class282_Sub38(i_2);
		class282_sub38_3.data = (long) i_1;
		this.aClass473_10195.insertBack(class282_sub38_3);
	}

	Interface6 method14142(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return this.method14064(class150_1, class76_2, i_3, i_4);
	}

	final synchronized void method15573(int i_1) {
		Node node_2 = new Node();
		node_2.data = (long) i_1;
		this.aClass473_10178.insertBack(node_2);
	}

	Interface31 method14239(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	void method14226() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			OpenGL.glLoadMatrixf(this.aClass384Array8782[this.anInt8780].method6517(this.aFloatArray10182), 0);
		} else {
			OpenGL.glLoadIdentity();
		}

		OpenGL.glMatrixMode(5888);
	}

	static int method15574(Class150 class150_0, Class76 class76_1) {
		if (class76_1 == Class76.aClass76_751) {
			switch (class150_0.anInt1958) {
			case 0:
				return 6409;
			case 1:
				return 6406;
			case 2:
			case 3:
			case 8:
			default:
				throw new IllegalArgumentException();
			case 4:
				return 6410;
			case 5:
				return 6407;
			case 6:
				return 6408;
			case 7:
				return 33777;
			case 9:
				return 33779;
			}
		} else if (class76_1 == Class76.aClass76_752) {
			switch (class150_0.anInt1958) {
			case 0:
				return 32834;
			case 1:
				return 32830;
			case 2:
			case 3:
			case 7:
			default:
				throw new IllegalArgumentException();
			case 4:
				return 36219;
			case 5:
				return 32852;
			case 6:
				return 32859;
			case 8:
				return 33189;
			}
		} else if (class76_1 == Class76.aClass76_749) {
			switch (class150_0.anInt1958) {
			case 8:
				return 33190;
			default:
				throw new IllegalArgumentException();
			}
		} else if (class76_1 == Class76.aClass76_755) {
			switch (class150_0.anInt1958) {
			case 0:
				return 34846;
			case 1:
				return 34844;
			case 2:
			case 3:
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34847;
			case 5:
				return 34843;
			case 6:
				return 34842;
			}
		} else if (class76_1 == Class76.aClass76_758) {
			switch (class150_0.anInt1958) {
			case 0:
				return 34840;
			case 1:
				return 34838;
			case 2:
			case 3:
			default:
				throw new IllegalArgumentException();
			case 4:
				return 34841;
			case 5:
				return 34837;
			case 6:
				return 34836;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8480(boolean bool_1) {
	}

	void method14098(int i_1) {
		OpenGL.glPolygonMode(1028, (i_1 & 0x2) != 0 ? 6913 : 6914);
	}

	public Class168 method8481() {
		int i_1 = -1;
		if (this.aString10185.indexOf("nvidia") != -1) {
			i_1 = 4318;
		} else if (this.aString10185.indexOf("intel") != -1) {
			i_1 = 32902;
		} else if (this.aString10185.indexOf("ati") != -1) {
			i_1 = 4098;
		}

		return new Class168(i_1, "OpenGL", this.anInt10196, this.aString10200, 0L);
	}

	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		this.aClass158_Sub2_5841.method14344();
		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-1813889988);
		}

	}

	public void method8483() {
		OpenGL.glFinish();
	}

	public void method8484() {
		OpenGL.glFinish();
	}

	void method13997(Interface32 interface32_1) {
		this.aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		this.aClass326_Sub2_10187.method5792();
	}

	void method8485() {
		super.method8397();
		if (this.anOpenGL10191 != null) {
			this.anOpenGL10191.method2571();
			this.anOpenGL10191.release();
			this.anOpenGL10191 = null;
		}

	}

	static int method15575(Class150 class150_0) {
		switch (class150_0.anInt1958) {
		case 0:
			return 6409;
		case 1:
			return 6406;
		case 2:
		case 3:
		case 7:
		default:
			throw new IllegalStateException();
		case 4:
			return 6410;
		case 5:
			return 6407;
		case 6:
			return 6408;
		case 8:
			return 6402;
		}
	}

	public final synchronized void method8487(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		Class282_Sub38 class282_sub38_4;
		while (!this.aClass473_10174.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10174.popTail();
			this.anIntArray10184[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8702 -= class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10175.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10175.popTail();
			this.anIntArray10184[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8701 -= class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10176.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10176.popTail();
			this.anIntArray10184[i_2++] = class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10195.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10195.popTail();
			this.anIntArray10184[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8761 -= class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, this.anIntArray10184, 0);
			boolean bool_3 = false;
		}

		while (!this.aClass473_10173.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.anInt8002 * 1270866345 * -570797415);
		}

		Node node_5;
		while (!this.aClass473_10178.method7861(141891001)) {
			node_5 = this.aClass473_10178.popTail();
			OpenGL.glDeleteProgram((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_10179.method7861(141891001)) {
			node_5 = this.aClass473_10179.popTail();
			OpenGL.glDeleteShader((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_10173.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.anInt8002 * 1270866345 * -570797415);
		}

		if (this.za() > 100663296 && Class169.time() > this.aLong10199 + 60000L) {
			System.gc();
			this.aLong10199 = Class169.time();
		}

		super.method8398(i_1);
	}

	Interface31 method14237(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	Class70 method13995(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub1(this, canvas_1);
	}

	public void method8507() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.aClass158_5853.method2714();
			int i_2 = this.aClass158_5853.method2716();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = this.anInt8749;
				int i_4 = this.anInt8776;
				int i_5 = this.anInt8751;
				int i_6 = this.anInt8752;
				this.method8421();
				int i_7 = this.anInt8743;
				int i_8 = this.anInt8744;
				int i_9 = this.anInt8822;
				int i_10 = this.anInt8742;
				this.L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				this.method13934();
				this.method13989(false);
				this.method13946(false);
				this.method13941(false);
				this.method13942(false);
				this.method14035((Interface30) null);
				this.method13947(1);
				this.method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				this.r(i_7, i_9, i_8, i_10);
				this.method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	public boolean method14045() {
		return this.aBool10192;
	}

	public void method8497() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.aClass158_5853.method2714();
			int i_2 = this.aClass158_5853.method2716();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = this.anInt8749;
				int i_4 = this.anInt8776;
				int i_5 = this.anInt8751;
				int i_6 = this.anInt8752;
				this.method8421();
				int i_7 = this.anInt8743;
				int i_8 = this.anInt8744;
				int i_9 = this.anInt8822;
				int i_10 = this.anInt8742;
				this.L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				this.method13934();
				this.method13989(false);
				this.method13946(false);
				this.method13941(false);
				this.method13942(false);
				this.method14035((Interface30) null);
				this.method13947(1);
				this.method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				this.r(i_7, i_9, i_8, i_10);
				this.method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	public void fd(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	public void method14056(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		OpenGL.glMatrixMode(5888);
		this.aClass384_8683.method6568(matrix44arr_1, matrix44arr_2);
		OpenGL.glLoadMatrixf(this.aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44arr_3.buf, 0);
	}

	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub3_Sub2(this);
	}

	public Interface8 method8621(int i_1, int i_2) {
		return new Class333(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = this.aClass158_5853.method2716();

		for (int i_7 = 0; i_7 < i_4; i_7++) {
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);
		}

		return ints_5;
	}

	void method8531() {
		super.method8397();
		if (this.anOpenGL10191 != null) {
			this.anOpenGL10191.method2571();
			this.anOpenGL10191.release();
			this.anOpenGL10191 = null;
		}

	}

	byte[] method15579(String string_1) {
		return this.method14075("gl", string_1);
	}

	void method13922() {
		if (this.aBool8843) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}

	}

	void method8486() {
		super.method8397();
		if (this.anOpenGL10191 != null) {
			this.anOpenGL10191.method2571();
			this.anOpenGL10191.release();
			this.anOpenGL10191 = null;
		}

	}

	void method13897() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);

		for (int i_1 = this.anInt8825 - 1; i_1 >= 0; --i_1) {
			OpenGL.glActiveTexture(i_1 + 33984);
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
		float[] floats_4 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };

		for (int i_2 = 0; i_2 < 8; i_2++) {
			int i_3 = i_2 + 16384;
			OpenGL.glLightfv(i_3, 4608, floats_4, 0);
			OpenGL.glLightf(i_3, 4615, 0.0F);
			OpenGL.glLightf(i_3, 4616, 0.0F);
		}

		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anOpenGL10191.setSwapInterval(0);
		super.method13897();
	}

	public void method14058(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		OpenGL.glMatrixMode(5888);
		this.aClass384_8683.method6568(matrix44arr_1, matrix44arr_2);
		OpenGL.glLoadMatrixf(this.aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44arr_3.buf, 0);
	}

	public float method14091() {
		return 0.0F;
	}

	void method14087() {
		if (this.aClass158_5853 != null) {
			OpenGL.glViewport(this.anInt8823 + this.anInt8749, this.anInt8754 + this.aClass158_5853.method2716() - this.anInt8776 - this.anInt8752, this.anInt8751, this.anInt8752);
		}

		OpenGL.glDepthRange(this.aFloat8735, this.aFloat8736);
	}

	void method14205() {
		if (this.aClass158_5853 != null) {
			OpenGL.glViewport(this.anInt8823 + this.anInt8749, this.anInt8754 + this.aClass158_5853.method2716() - this.anInt8776 - this.anInt8752, this.anInt8751, this.anInt8752);
		}

		OpenGL.glDepthRange(this.aFloat8735, this.aFloat8736);
	}

	void method14047() {
		if (this.aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}

	}

	void method14019() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.anInt8823 + this.anInt8743;
			int i_2 = this.anInt8754 + this.aClass158_5853.method2716() - this.anInt8742;
			int i_3 = this.anInt8744 - this.anInt8743;
			int i_4 = this.anInt8742 - this.anInt8822;
			if (i_3 < 0) {
				i_3 = 0;
			}

			if (i_4 < 0) {
				i_4 = 0;
			}

			OpenGL.glScissor(i_1, i_2, i_3, i_4);
		}

	}

	void method13909() {
		if (this.aBool8843) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}

	}

	public void method14107(Matrix44Arr matrix44arr_1) {
		float[] floats_2 = matrix44arr_1.buf;
		floats_2[1] = -floats_2[1];
		floats_2[5] = -floats_2[5];
		floats_2[9] = -floats_2[9];
		floats_2[13] = -floats_2[13];
	}

	void method14119() {
		if (this.aBool8757) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}

	}

	final synchronized void method15580(long long_1) {
		Node node_3 = new Node();
		node_3.data = long_1;
		this.aClass473_10179.insertBack(node_3);
	}

	void method14169() {
		OpenGL.glDepthMask(this.aBool8755 && this.aBool8756);
	}

	void method14121() {
		if (this.aBool8684 && !this.aBool8760) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}

	}

	void method14122() {
		if (this.aBool8684 && !this.aBool8760) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}

	}

	void method14025() {
		if (this.aBool8684 && !this.aBool8760) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}

	}

	public void fu(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	void method14183() {
		OpenGL.glMatrixMode(5890);
		if (this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			OpenGL.glLoadMatrixf(this.aClass384Array8782[this.anInt8780].method6517(this.aFloatArray10182), 0);
		} else {
			OpenGL.glLoadIdentity();
		}

		OpenGL.glMatrixMode(5888);
	}

	void method14026() {
		this.aFloatArray10172[0] = this.aFloat8769 * this.aFloat8766;
		this.aFloatArray10172[1] = this.aFloat8769 * this.aFloat8767;
		this.aFloatArray10172[2] = this.aFloat8769 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray10172, 0);
	}

	public void method8491(boolean bool_1) {
	}

	void method8555(int i_1, int i_2) throws Exception_Sub3 {
		this.aClass158_Sub2_5841.method14344();
		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-1879314244);
		}

	}

	void method14124() {
		this.aFloatArray10172[0] = this.aFloat8769 * this.aFloat8766;
		this.aFloatArray10172[1] = this.aFloat8769 * this.aFloat8767;
		this.aFloatArray10172[2] = this.aFloat8769 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray10172, 0);
	}

	void method13913() {
	}

	void method14172() {
		if (this.aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}

	}

	public Class101 method14049(String string_1) {
		byte[] bytes_2 = this.method15579(string_1);
		if (bytes_2 == null) {
			return null;
		} else {
			Class114 class114_3 = this.method13891(bytes_2);
			return new Class101_Sub1(this, class114_3);
		}
	}

	void method14132() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass384_8740.buf, 0);

		int i_1;
		for (i_1 = 0; i_1 < this.anInt8773; i_1++) {
			Class282_Sub24 class282_sub24_2 = this.aClass282_Sub24Array8716[i_1];
			int i_3 = class282_sub24_2.method12371(-2136398949);
			int i_4 = 16386 + i_1;
			float f_5 = class282_sub24_2.method12395(-1367391140) / 255.0F;
			this.aFloatArray10172[0] = (float) class282_sub24_2.method12368((byte) 48);
			this.aFloatArray10172[1] = (float) class282_sub24_2.method12369(1534020223);
			this.aFloatArray10172[2] = (float) class282_sub24_2.method12394(1329997001);
			this.aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4611, this.aFloatArray10172, 0);
			this.aFloatArray10172[0] = (float) (i_3 >> 16 & 0xff) * f_5;
			this.aFloatArray10172[1] = (float) (i_3 >> 8 & 0xff) * f_5;
			this.aFloatArray10172[2] = (float) (i_3 & 0xff) * f_5;
			this.aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4609, this.aFloatArray10172, 0);
			OpenGL.glLightf(i_4, 4617, 1.0F / (float) (class282_sub24_2.method12370(-789603523) * class282_sub24_2.method12370(-789603523)));
			OpenGL.glEnable(i_4);
		}

		while (i_1 < this.anInt8831) {
			OpenGL.glDisable(16386 + i_1);
			++i_1;
		}

	}

	void method13982() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass384_8740.buf, 0);

		int i_1;
		for (i_1 = 0; i_1 < this.anInt8773; i_1++) {
			Class282_Sub24 class282_sub24_2 = this.aClass282_Sub24Array8716[i_1];
			int i_3 = class282_sub24_2.method12371(-2138332100);
			int i_4 = 16386 + i_1;
			float f_5 = class282_sub24_2.method12395(656103016) / 255.0F;
			this.aFloatArray10172[0] = (float) class282_sub24_2.method12368((byte) 82);
			this.aFloatArray10172[1] = (float) class282_sub24_2.method12369(1534020223);
			this.aFloatArray10172[2] = (float) class282_sub24_2.method12394(1976918511);
			this.aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4611, this.aFloatArray10172, 0);
			this.aFloatArray10172[0] = (float) (i_3 >> 16 & 0xff) * f_5;
			this.aFloatArray10172[1] = (float) (i_3 >> 8 & 0xff) * f_5;
			this.aFloatArray10172[2] = (float) (i_3 & 0xff) * f_5;
			this.aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4609, this.aFloatArray10172, 0);
			OpenGL.glLightf(i_4, 4617, 1.0F / (float) (class282_sub24_2.method12370(-789603523) * class282_sub24_2.method12370(-789603523)));
			OpenGL.glEnable(i_4);
		}

		while (i_1 < this.anInt8831) {
			OpenGL.glDisable(16386 + i_1);
			++i_1;
		}

	}

	boolean method14134(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = this.aClass158_5853.method2716();

		for (int i_7 = 0; i_7 < i_4; i_7++) {
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);
		}

		return ints_5;
	}

	public void method13996(Class70 class70_1) {
		Class72[] arr_2 = class70_1.aClass72Array707;
		int i_3 = 0;
		boolean bool_4 = false;
		boolean bool_5 = false;
		boolean bool_6 = false;

		int i_7;
		for (i_7 = 0; i_7 < arr_2.length; i_7++) {
			Class72 class72_8 = arr_2[i_7];
			Class326_Sub1 class326_sub1_9 = this.aClass326_Sub1Array10186[i_7];
			int i_10 = 0;
			int i_11 = class326_sub1_9.method14559();
			long long_12 = class326_sub1_9.method5794();
			class326_sub1_9.method5792();

			for (int i_14 = 0; i_14 < class72_8.method1296(); i_14++) {
				Class69 class69_15 = class72_8.method1297(i_14);
				switch (class69_15.anInt698) {
				case 0:
					OpenGL.glNormalPointer(5126, i_11, long_12 + (long) i_10);
					bool_5 = true;
				case 1:
				case 3:
				case 5:
				case 6:
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(4, 5126, i_11, long_12 + (long) i_10);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(2, 5126, i_11, long_12 + (long) i_10);
					break;
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_11, long_12 + (long) i_10);
					bool_6 = true;
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(1, 5126, i_11, long_12 + (long) i_10);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(3, 5126, i_11, long_12 + (long) i_10);
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_11, long_12 + (long) i_10);
					bool_4 = true;
				}

				i_10 += class69_15.anInt704;
			}
		}

		if (bool_6 != this.aBool10180) {
			if (bool_6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}

			this.aBool10180 = bool_6;
		}

		if (bool_5 != this.aBool10190) {
			if (bool_5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}

			this.aBool10190 = bool_5;
		}

		if (bool_4 != this.aBool10183) {
			if (bool_4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}

			this.aBool10183 = bool_4;
		}

		if (this.anInt10181 < i_3) {
			for (i_7 = this.anInt10181; i_7 < i_3; i_7++) {
				OpenGL.glClientActiveTexture(i_7 + 33984);
				OpenGL.glEnableClientState(32888);
			}

			this.anInt10181 = i_3;
		} else if (this.anInt10181 > i_3) {
			for (i_7 = i_3; i_7 < this.anInt10181; i_7++) {
				OpenGL.glClientActiveTexture(i_7 + 33984);
				OpenGL.glDisableClientState(32888);
			}

			this.anInt10181 = i_3;
		}

	}

	boolean method14137(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	boolean method14136(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	Interface6 method14141(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return this.method14064(class150_1, class76_2, i_3, i_4);
	}

	final Interface32 method13993(boolean bool_1) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool_1);
	}

	Interface6 method14216(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return this.method14064(class150_1, class76_2, i_3, i_4);
	}

	Interface6 method14144(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5, int i_6, int i_7) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_2, 1942118537) || !Class96_Sub9.method14585(i_3, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, class150_1, i_2, i_3, bytes_5, i_6, i_7);
			} else {
				Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_751, Class323.nextPowerOfTwo(i_2, -1427498963), Class323.nextPowerOfTwo(i_3, -1153726914));
				class319_sub2_8.method52(0, 0, i_2, i_3, bytes_5, class150_1, i_6, i_7);
				return class319_sub2_8;
			}
		} else {
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, i_6, i_7);
		}
	}

	Interface6 method14090(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_2, 1942118537) || !Class96_Sub9.method14585(i_3, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, class150_1, i_2, i_3, floats_5, i_6, i_7);
			} else {
				Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_758, Class323.nextPowerOfTwo(i_2, 86710193), Class323.nextPowerOfTwo(i_3, -962187680));
				class319_sub2_8.method14494(0, 0, i_2, i_3, floats_5, class150_1, i_6, i_7);
				return class319_sub2_8;
			}
		} else {
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
		}
	}

	public void method13964() {
		int i_1 = this.anIntArray10188[this.anInt8780];
		if (i_1 != 0) {
			this.anIntArray10188[this.anInt8780] = 0;
			OpenGL.glBindTexture(i_1, 0);
			OpenGL.glDisable(i_1);
		}

	}

	Interface6 method14008(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_1, 1942118537) || !Class96_Sub9.method14585(i_2, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, i_1, i_2, ints_4, i_5, i_6);
			} else {
				Class319_Sub2 class319_sub2_7 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Class323.nextPowerOfTwo(i_1, -1060363007), Class323.nextPowerOfTwo(i_2, -1282480778));
				class319_sub2_7.method48(0, 0, i_1, i_2, ints_4, i_5, i_6);
				return class319_sub2_7;
			}
		} else {
			return new Class319_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
		}
	}

	Interface6 method14048(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_1, 1942118537) || !Class96_Sub9.method14585(i_2, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, i_1, i_2, ints_4, i_5, i_6);
			} else {
				Class319_Sub2 class319_sub2_7 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Class323.nextPowerOfTwo(i_1, 1023785634), Class323.nextPowerOfTwo(i_2, -747639178));
				class319_sub2_7.method48(0, 0, i_1, i_2, ints_4, i_5, i_6);
				return class319_sub2_7;
			}
		} else {
			return new Class319_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
		}
	}

	public final void method13983(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		byte b_6;
		int i_7;
		if (class352_1 == Class352.aClass352_4099) {
			b_6 = 1;
			i_7 = i_5 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_6 = 3;
			i_7 = i_5 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_6 = 4;
			i_7 = i_5 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_6 = 6;
			i_7 = i_5 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_6 = 5;
			i_7 = i_5 + 2;
		} else {
			b_6 = 0;
			i_7 = i_5;
		}

		Class76 class76_8 = this.aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), this.aClass326_Sub2_10187.method5794() + (long) (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	Interface1 method14077(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class319_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	Interface29 method14022(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return (Interface29) (!this.aBool10197 && (!Class96_Sub9.method14585(i_3, 1942118537) || !Class96_Sub9.method14585(i_4, 1942118537)) ? (this.aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Class323.nextPowerOfTwo(i_3, 2046359812), Class323.nextPowerOfTwo(i_4, -1483303534))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4));
	}

	Interface29 method14148(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return (Interface29) (!this.aBool10197 && (!Class96_Sub9.method14585(i_3, 1942118537) || !Class96_Sub9.method14585(i_4, 1942118537)) ? (this.aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Class323.nextPowerOfTwo(i_3, 622988125), Class323.nextPowerOfTwo(i_4, -1774275791))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4));
	}

	Interface29 method14149(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return (Interface29) (!this.aBool10197 && (!Class96_Sub9.method14585(i_3, 1942118537) || !Class96_Sub9.method14585(i_4, 1942118537)) ? (this.aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Class323.nextPowerOfTwo(i_3, -196167688), Class323.nextPowerOfTwo(i_4, -1962177193))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4));
	}

	public void method14153() {
		int i_1 = this.anIntArray10188[this.anInt8780];
		if (i_1 != 0) {
			this.anIntArray10188[this.anInt8780] = 0;
			OpenGL.glBindTexture(i_1, 0);
			OpenGL.glDisable(i_1);
		}

	}

	public void method14154() {
		int i_1 = this.anIntArray10188[this.anInt8780];
		if (i_1 != 0) {
			this.anIntArray10188[this.anInt8780] = 0;
			OpenGL.glBindTexture(i_1, 0);
			OpenGL.glDisable(i_1);
		}

	}

	final void method14224(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		OpenGL.glTexEnvi(8960, 34176 + i_1, method15567(class67_2));
		if (bool_3) {
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 769 : 768);
		}

	}

	final void method14162(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		OpenGL.glTexEnvi(8960, 34176 + i_1, method15567(class67_2));
		if (bool_3) {
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 769 : 768);
		}

	}

	public final void method14228(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		byte b_6;
		int i_7;
		if (class352_1 == Class352.aClass352_4099) {
			b_6 = 1;
			i_7 = i_5 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_6 = 3;
			i_7 = i_5 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_6 = 4;
			i_7 = i_5 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_6 = 6;
			i_7 = i_5 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_6 = 5;
			i_7 = i_5 + 2;
		} else {
			b_6 = 0;
			i_7 = i_5;
		}

		Class76 class76_8 = this.aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), this.aClass326_Sub2_10187.method5794() + (long) (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	void method14187() {
		OpenGL.glTexEnvi(8960, 34161, method15583(this.aClass68Array8784[this.anInt8780]));
	}

	final void method14180() {
		this.aFloatArray10172[0] = (float) (this.anInt8758 & 0xff0000) / 1.671168E7F;
		this.aFloatArray10172[1] = (float) (this.anInt8758 & 0xff00) / 65280.0F;
		this.aFloatArray10172[2] = (float) (this.anInt8758 & 0xff) / 255.0F;
		this.aFloatArray10172[3] = (float) (this.anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray10172, 0);
	}

	final void method14063() {
		this.aFloatArray10172[0] = (float) (this.anInt8758 & 0xff0000) / 1.671168E7F;
		this.aFloatArray10172[1] = (float) (this.anInt8758 & 0xff00) / 65280.0F;
		this.aFloatArray10172[2] = (float) (this.anInt8758 & 0xff) / 255.0F;
		this.aFloatArray10172[3] = (float) (this.anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, this.aFloatArray10172, 0);
	}

	public Class168 method8392() {
		int i_1 = -1;
		if (this.aString10185.indexOf("nvidia") != -1) {
			i_1 = 4318;
		} else if (this.aString10185.indexOf("intel") != -1) {
			i_1 = 32902;
		} else if (this.aString10185.indexOf("ati") != -1) {
			i_1 = 4098;
		}

		return new Class168(i_1, "OpenGL", this.anInt10196, this.aString10200, 0L);
	}

	Interface6 method14143(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5, int i_6, int i_7) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_2, 1942118537) || !Class96_Sub9.method14585(i_3, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, class150_1, i_2, i_3, bytes_5, i_6, i_7);
			} else {
				Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_751, Class323.nextPowerOfTwo(i_2, -1588026691), Class323.nextPowerOfTwo(i_3, 191823312));
				class319_sub2_8.method52(0, 0, i_2, i_3, bytes_5, class150_1, i_6, i_7);
				return class319_sub2_8;
			}
		} else {
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, i_6, i_7);
		}
	}

	void method14184() {
		OpenGL.glActiveTexture(33984 + this.anInt8780);
	}

	boolean method13954(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	void method14186() {
		OpenGL.glTexEnvi(8960, 34161, method15583(this.aClass68Array8784[this.anInt8780]));
	}

	public boolean method14146() {
		return this.aBool10177;
	}

	Class70 method14017(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	void method13916() {
		OpenGL.glTexEnvi(8960, 34162, method15583(this.aClass68Array8785[this.anInt8780]));
	}

	public void fi(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	void method13924() {
	}

	void method13945() {
		if (this.aBool8818) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}

	}

	void method14190() {
		OpenGL.glTexEnvi(8960, 34162, method15583(this.aClass68Array8785[this.anInt8780]));
	}

	public void method13892(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		OpenGL.glMatrixMode(5888);
		this.aClass384_8683.method6568(matrix44arr_1, matrix44arr_2);
		OpenGL.glLoadMatrixf(this.aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44arr_3.buf, 0);
	}

	void method14200() {
		if (this.aBool8817) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}

	}

	void method13999() {
		this.aFloat8819 = this.aFloat8697 - (float) this.anInt8680;
		this.aFloat8813 = this.aFloat8819 - (float) this.anInt8811;
		if (this.aFloat8813 < this.aFloat8726) {
			this.aFloat8813 = this.aFloat8726;
		}

		if (this.aBool8692) {
			OpenGL.glFogf(2915, this.aFloat8813);
			OpenGL.glFogf(2916, this.aFloat8819);
			this.aFloatArray10172[0] = (float) (this.anInt8810 & 0xff0000) / 1.671168E7F;
			this.aFloatArray10172[1] = (float) (this.anInt8810 & 0xff00) / 65280.0F;
			this.aFloatArray10172[2] = (float) (this.anInt8810 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, this.aFloatArray10172, 0);
		}

	}

	void method14203() {
		if (this.aBool8809 && this.aBool8808 && this.anInt8811 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}

	}

	void method14015() {
		if (this.aBool8809 && this.aBool8808 && this.anInt8811 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}

	}

	void method14092(boolean bool_1) {
		if (bool_1) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}

	}

	final Interface32 method14206(boolean bool_1) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool_1);
	}

	static final int method15583(Class68 class68_0) {
		if (Class68.aClass68_687 == class68_0) {
			return 7681;
		} else if (Class68.aClass68_683 == class68_0) {
			return 8448;
		} else if (Class68.aClass68_682 == class68_0) {
			return 34165;
		} else if (Class68.aClass68_684 == class68_0) {
			return 260;
		} else if (Class68.aClass68_685 == class68_0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	final Interface4 method13925(boolean bool_1) {
		return new Class326_Sub1(this, bool_1);
	}

	Class70 method14209(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	public final synchronized void method8488(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		Class282_Sub38 class282_sub38_4;
		while (!this.aClass473_10174.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10174.popTail();
			this.anIntArray10184[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8702 -= class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10175.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10175.popTail();
			this.anIntArray10184[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8701 -= class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10176.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10176.popTail();
			this.anIntArray10184[i_2++] = class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, this.anIntArray10184, 0);
			i_2 = 0;
		}

		while (!this.aClass473_10195.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10195.popTail();
			this.anIntArray10184[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8761 -= class282_sub38_4.anInt8002 * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_2, this.anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, this.anIntArray10184, 0);
			boolean bool_3 = false;
		}

		while (!this.aClass473_10173.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.anInt8002 * 1270866345 * -570797415);
		}

		Node node_5;
		while (!this.aClass473_10178.method7861(141891001)) {
			node_5 = this.aClass473_10178.popTail();
			OpenGL.glDeleteProgram((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_10179.method7861(141891001)) {
			node_5 = this.aClass473_10179.popTail();
			OpenGL.glDeleteShader((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_10173.method7861(141891001)) {
			class282_sub38_4 = (Class282_Sub38) this.aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.anInt8002 * 1270866345 * -570797415);
		}

		if (this.za() > 100663296 && Class169.time() > this.aLong10199 + 60000L) {
			System.gc();
			this.aLong10199 = Class169.time();
		}

		super.method8398(i_1);
	}

	void method14215(Interface32 interface32_1) {
		this.aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		this.aClass326_Sub2_10187.method5792();
	}

	public void method14212(Class70 class70_1) {
		Class72[] arr_2 = class70_1.aClass72Array707;
		int i_3 = 0;
		boolean bool_4 = false;
		boolean bool_5 = false;
		boolean bool_6 = false;

		int i_7;
		for (i_7 = 0; i_7 < arr_2.length; i_7++) {
			Class72 class72_8 = arr_2[i_7];
			Class326_Sub1 class326_sub1_9 = this.aClass326_Sub1Array10186[i_7];
			int i_10 = 0;
			int i_11 = class326_sub1_9.method14559();
			long long_12 = class326_sub1_9.method5794();
			class326_sub1_9.method5792();

			for (int i_14 = 0; i_14 < class72_8.method1296(); i_14++) {
				Class69 class69_15 = class72_8.method1297(i_14);
				switch (class69_15.anInt698) {
				case 0:
					OpenGL.glNormalPointer(5126, i_11, long_12 + (long) i_10);
					bool_5 = true;
				case 1:
				case 3:
				case 5:
				case 6:
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(4, 5126, i_11, long_12 + (long) i_10);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(2, 5126, i_11, long_12 + (long) i_10);
					break;
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_11, long_12 + (long) i_10);
					bool_6 = true;
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(1, 5126, i_11, long_12 + (long) i_10);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(3, 5126, i_11, long_12 + (long) i_10);
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_11, long_12 + (long) i_10);
					bool_4 = true;
				}

				i_10 += class69_15.anInt704;
			}
		}

		if (this.aBool10180 != bool_6) {
			if (bool_6) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}

			this.aBool10180 = bool_6;
		}

		if (this.aBool10190 != bool_5) {
			if (bool_5) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}

			this.aBool10190 = bool_5;
		}

		if (this.aBool10183 != bool_4) {
			if (bool_4) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}

			this.aBool10183 = bool_4;
		}

		if (this.anInt10181 < i_3) {
			for (i_7 = this.anInt10181; i_7 < i_3; i_7++) {
				OpenGL.glClientActiveTexture(33984 + i_7);
				OpenGL.glEnableClientState(32888);
			}

			this.anInt10181 = i_3;
		} else if (this.anInt10181 > i_3) {
			for (i_7 = i_3; i_7 < this.anInt10181; i_7++) {
				OpenGL.glClientActiveTexture(33984 + i_7);
				OpenGL.glDisableClientState(32888);
			}

			this.anInt10181 = i_3;
		}

	}

	public void method14213(int i_1, Interface4 interface4_2) {
		this.aClass326_Sub1Array10186[i_1] = (Class326_Sub1) interface4_2;
	}

	void method13950() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass384_8740.buf, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8747, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8762, 0);
	}

	void method13921() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.anInt8823 + this.anInt8743;
			int i_2 = this.anInt8754 + this.aClass158_5853.method2716() - this.anInt8742;
			int i_3 = this.anInt8744 - this.anInt8743;
			int i_4 = this.anInt8742 - this.anInt8822;
			if (i_3 < 0) {
				i_3 = 0;
			}

			if (i_4 < 0) {
				i_4 = 0;
			}

			OpenGL.glScissor(i_1, i_2, i_3, i_4);
		}

	}

	void method14238() {
		if (this.aBool8818) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}

	}

	void method14217(Interface32 interface32_1) {
		this.aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		this.aClass326_Sub2_10187.method5792();
	}

	public final void method13959(Class352 class352_1, int i_2, int i_3) {
		byte b_4;
		int i_5;
		if (class352_1 == Class352.aClass352_4099) {
			b_4 = 1;
			i_5 = i_3 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_4 = 3;
			i_5 = i_3 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_4 = 4;
			i_5 = i_3 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_4 = 6;
			i_5 = i_3 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_4 = 5;
			i_5 = i_3 + 2;
		} else {
			b_4 = 0;
			i_5 = i_3;
		}

		OpenGL.glDrawArrays(b_4, i_2, i_5);
	}

	public final void method14101(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		byte b_6;
		int i_7;
		if (class352_1 == Class352.aClass352_4099) {
			b_6 = 1;
			i_7 = i_5 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_6 = 3;
			i_7 = i_5 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_6 = 4;
			i_7 = i_5 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_6 = 6;
			i_7 = i_5 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_6 = 5;
			i_7 = i_5 + 2;
		} else {
			b_6 = 0;
			i_7 = i_5;
		}

		Class76 class76_8 = this.aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), this.aClass326_Sub2_10187.method5794() + (long) (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	public Interface8 method8419(int i_1, int i_2) {
		return new Class333(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = this.aClass158_5853.method2716();

		for (int i_7 = 0; i_7 < i_4; i_7++) {
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);
		}

		return ints_5;
	}

	final void method13968(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		OpenGL.glTexEnvi(8960, i_1 + 34176, method15567(class67_2));
		OpenGL.glTexEnvi(8960, i_1 + 34192, 768);
	}

	public final void method14230(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		byte b_6;
		int i_7;
		if (class352_1 == Class352.aClass352_4099) {
			b_6 = 1;
			i_7 = i_5 * 2;
		} else if (class352_1 == Class352.aClass352_4102) {
			b_6 = 3;
			i_7 = i_5 + 1;
		} else if (class352_1 == Class352.aClass352_4098) {
			b_6 = 4;
			i_7 = i_5 * 3;
		} else if (class352_1 == Class352.aClass352_4104) {
			b_6 = 6;
			i_7 = i_5 + 2;
		} else if (class352_1 == Class352.aClass352_4103) {
			b_6 = 5;
			i_7 = i_5 + 2;
		} else {
			b_6 = 0;
			i_7 = i_5;
		}

		Class76 class76_8 = this.aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), this.aClass326_Sub2_10187.method5794() + (long) (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	void method14235(int i_1) {
		OpenGL.glPolygonMode(1028, (i_1 & 0x2) != 0 ? 6913 : 6914);
	}

	void method14236(int i_1) {
		OpenGL.glPolygonMode(1028, (i_1 & 0x2) != 0 ? 6913 : 6914);
	}

	final void method14166(int i_1, Class67 class67_2, boolean bool_3) {
		OpenGL.glTexEnvi(8960, 34184 + i_1, method15567(class67_2));
		OpenGL.glTexEnvi(8960, 34200 + i_1, bool_3 ? 771 : 770);
	}

	Interface31 method14011(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	public void method14214(int i_1, Interface4 interface4_2) {
		this.aClass326_Sub1Array10186[i_1] = (Class326_Sub1) interface4_2;
	}

	void method14117() {
		if (this.aBool8684 && !this.aBool8760) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}

	}

	boolean method14135(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	void method14240(int i_1) {
		OpenGL.glColorMask((i_1 & 0x1) != 0, (i_1 & 0x2) != 0, (i_1 & 0x4) != 0, (i_1 & 0x8) != 0);
	}

	Interface6 method14094(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		if (!this.aBool10197 && (!Class96_Sub9.method14585(i_1, 1942118537) || !Class96_Sub9.method14585(i_2, 1942118537))) {
			if (this.aBool10194) {
				return new Class319_Sub3(this, i_1, i_2, ints_4, i_5, i_6);
			} else {
				Class319_Sub2 class319_sub2_7 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Class323.nextPowerOfTwo(i_1, -874037324), Class323.nextPowerOfTwo(i_2, -2104244422));
				class319_sub2_7.method48(0, 0, i_1, i_2, ints_4, i_5, i_6);
				return class319_sub2_7;
			}
		} else {
			return new Class319_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
		}
	}

	public void method8420() {
		if (this.aClass158_5853 != null) {
			int i_1 = this.aClass158_5853.method2714();
			int i_2 = this.aClass158_5853.method2716();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = this.anInt8749;
				int i_4 = this.anInt8776;
				int i_5 = this.anInt8751;
				int i_6 = this.anInt8752;
				this.method8421();
				int i_7 = this.anInt8743;
				int i_8 = this.anInt8744;
				int i_9 = this.anInt8822;
				int i_10 = this.anInt8742;
				this.L();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				this.method13934();
				this.method13989(false);
				this.method13946(false);
				this.method13941(false);
				this.method13942(false);
				this.method14035((Interface30) null);
				this.method13947(1);
				this.method13904(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				this.r(i_7, i_9, i_8, i_10);
				this.method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	void method13948() {
		this.aFloatArray10172[0] = this.aFloat8769 * this.aFloat8766;
		this.aFloatArray10172[1] = this.aFloat8769 * this.aFloat8767;
		this.aFloatArray10172[2] = this.aFloat8769 * this.aFloat8768;
		this.aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, this.aFloatArray10172, 0);
	}

	void method13915() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(this.aClass384_8740.buf, 0);
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8747, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8762, 0);
	}

	void method14120() {
		OpenGL.glDepthMask(this.aBool8755 && this.aBool8756);
	}

}
