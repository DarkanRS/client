package com.rs.jagex;

import static jaggl.GLConst.*;

import java.awt.Canvas;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

public class JAGGLRenderer extends HardwareRenderer {

	public static AbstractRenderer create(Canvas canvas_0, ImageLoader interface22_1, Index index_2, int i_3) {
		try {
			boolean bool_5 = HardwareRenderer.method13893();
			if (!bool_5)
				throw new RuntimeException("");
			if (!LibraryLoader.getLoader().loadLibrary("jaggl"))
				throw new RuntimeException("");
			else {
				Class459.method7679(canvas_0);
				OpenGL opengl_6 = new OpenGL();
				long long_7 = opengl_6.init(canvas_0, 8, 8, 8, 24, 0, i_3);
				if (long_7 == 0L)
					throw new RuntimeException("");
				else {
					JAGGLRenderer class505_sub2_sub1_9 = new JAGGLRenderer(opengl_6, canvas_0, long_7, interface22_1, index_2, i_3);
					class505_sub2_sub1_9.method14147();
					return class505_sub2_sub1_9;
				}
			}
		} catch (Throwable throwable_11) {
			throw new RuntimeException("");
		}
	}
	static int method15566(Class76 class76_0) {
		return switch (class76_0.ordinal()) {
		case 0 -> GL_SHORT;
		case 1, 4 -> GL_UNSIGNED_BYTE;
		default -> GL_UNSIGNED_BYTE;
		case 2 -> GL_UNSIGNED_INT;
		case 3 -> GL_FLOAT;
		case 5 -> GL_UNSIGNED_SHORT;
		case 6 -> GL_BYTE;
		case 7 -> GL_INT;
		case 8 -> GL_HALF_FLOAT;
		};
	}
	static int method15567(Class67 class67_0) {
		if (Class67.aClass67_680 == class67_0)
			return GL_TEXTURE;
		if (Class67.aClass67_678 == class67_0)
			return GL_PRIMARY_COLOR;
		else if (Class67.aClass67_679 == class67_0)
			return GL_PREVIOUS;
		else if (Class67.aClass67_677 == class67_0)
			return GL_CONSTANT;
		else
			throw new IllegalArgumentException();
	}
	static int method15574(Class150 class150_0, Class76 class76_1) {
		if (class76_1 == Class76.aClass76_751)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE;
			case 1 -> GL_ALPHA;
			case 2, 3, 8 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA;
			case 5 -> GL_RGB;
			case 6 -> GL_RGBA;
			case 7 -> GL_COMPRESSED_RGBA_S3TC_DXT1_EXT;
			case 9 -> GL_COMPRESSED_RGBA_S3TC_DXT5_EXT;
			};
		else if (class76_1 == Class76.aClass76_752)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE16;
			case 1 -> GL_ALPHA16;
			case 2, 3, 7 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA16UI;
			case 5 -> GL_RGB16;
			case 6 -> GL_RGBA16;
			case 8 -> GL_DEPTH_COMPONENT16;
			};
		else if (class76_1 == Class76.aClass76_749)
			return switch (class150_0.anInt1958) {
			case 8 -> GL_DEPTH_COMPONENT24;
			default -> throw new IllegalArgumentException();
			};
		else if (class76_1 == Class76.aClass76_755)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE16F_ARB;
			case 1 -> GL_ALPHA_FLOAT16_APPLE;
			case 2, 3 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA_FLOAT16_APPLE;
			case 5 -> GL_RGB_FLOAT16_APPLE;
			case 6 -> GL_RGBA_FLOAT16_APPLE;
			};
		else if (class76_1 == Class76.aClass76_758)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE32F_ARB;
			case 1 -> GL_ALPHA_FLOAT32_APPLE;
			case 2, 3 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA_FLOAT32_APPLE;
			case 5 -> GL_RGB_FLOAT32_APPLE;
			case 6 -> GL_RGBA_FLOAT32_APPLE;
			};
		else
			throw new IllegalArgumentException();
	}
	static int method15575(Class150 class150_0) {
		return switch (class150_0.anInt1958) {
		case 0 -> 6409;
		case 1 -> 6406;
		case 2, 3, 7 -> throw new IllegalStateException();
		default -> throw new IllegalStateException();
		case 4 -> 6410;
		case 5 -> 6407;
		case 6 -> 6408;
		case 8 -> 6402;
		};
	}
	static int method15583(Class68 class68_0) {
		if (Class68.aClass68_687 == class68_0)
			return 7681;
		if (Class68.aClass68_683 == class68_0)
			return 8448;
		else if (Class68.aClass68_682 == class68_0)
			return 34165;
		else if (Class68.aClass68_684 == class68_0)
			return 260;
		else if (Class68.aClass68_685 == class68_0)
			return 34023;
		else
			throw new IllegalArgumentException();
	}
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

	JAGGLRenderer(OpenGL opengl_1, Canvas canvas_2, long long_3, ImageLoader interface22_5, Index index_6, int i_7) {
		super(interface22_5, index_6, i_7, 1);
		new MapBuffer();
		new MapBuffer();
		aFloatArray10172 = new float[4];
		aFloatArray10182 = new float[16];
		int[] ints_8 = new int[1];

		try {
			anOpenGL10191 = opengl_1;
			anOpenGL10191.method2570();
			aString10185 = OpenGL.glGetString(7936).toLowerCase();
			aString10200 = OpenGL.glGetString(7937).toLowerCase();
			if ((aString10185.indexOf("microsoft") != -1) || (aString10185.indexOf("brian paul") != -1) || (aString10185.indexOf("mesa") != -1))
				throw new RuntimeException("");
			String string_9 = OpenGL.glGetString(7938);
			String[] arr_10 = MovingAnimation.split(string_9.replace('.', ' '), ' ');
			if (arr_10.length >= 2) {
				int i_11;
				try {
					i_11 = Utils.parseInt(arr_10[0]);
					int i_12 = Utils.parseInt(arr_10[1]);
					anInt10196 = i_11 * 10 + i_12;
				} catch (NumberFormatException numberformatexception_20) {
					throw new RuntimeException("");
				}

				if (anInt10196 < 12)
					throw new RuntimeException("");
				else {
					OpenGL.glGetIntegerv(34018, ints_8, 0);
					anInt8825 = ints_8[0];
					if (anInt8825 < 2)
						throw new RuntimeException("");
					else {
						anInt8799 = 8;
						aBool10193 = anOpenGL10191.supportsExtension("GL_ARB_vertex_buffer_object");
						aBool8828 = anOpenGL10191.supportsExtension("GL_ARB_multisample");
						aBool10194 = anOpenGL10191.supportsExtension("GL_ARB_texture_rectangle");
						anOpenGL10191.supportsExtension("GL_ARB_texture_cube_map");
						aBool10197 = anOpenGL10191.supportsExtension("GL_ARB_texture_non_power_of_two");
						aBool8827 = anOpenGL10191.supportsExtension("GL_EXT_texture3D");
						aBool10177 = anOpenGL10191.supportsExtension("GL_ARB_vertex_shader");
						anOpenGL10191.supportsExtension("GL_ARB_vertex_program");
						aBool10192 = anOpenGL10191.supportsExtension("GL_ARB_fragment_shader");
						anOpenGL10191.supportsExtension("GL_ARB_fragment_program");
						anOpenGL10191.supportsExtension("GL_EXT_framebuffer_object");
						anIntArray10188 = new int[anInt8825];
						aBool8718 = anOpenGL10191.supportsExtension("GL_EXT_framebuffer_object");
						anOpenGL10191.supportsExtension("GL_EXT_framebuffer_blit");
						anOpenGL10191.supportsExtension("GL_EXT_framebuffer_multisample");
						if (!method13887() || !method13888()) {
							if (!anOpenGL10191.supportsExtension("GL_ARB_multitexture") || !anOpenGL10191.supportsExtension("GL_ARB_texture_env_combine"))
								throw new RuntimeException("");
						}

						anInt10198 = Stream.method2926() ? 33639 : 5121;
						if (aString10200.indexOf("radeon") != -1) {
							i_11 = 0;
							boolean bool_23 = false;
							boolean bool_13 = false;
							String[] arr_14 = MovingAnimation.split(aString10200.replace('/', ' '), ' ');

							for (String element : arr_14) {
								String string_16 = element;

								try {
									if (!string_16.isEmpty()) {
										if (string_16.charAt(0) == 120 && string_16.length() >= 3 && Class115.method1950(string_16.substring(1, 3))) {
											string_16 = string_16.substring(1);
											bool_13 = true;
										}

										if ("hd".equals(string_16))
											bool_23 = true;
										else {
											if (string_16.startsWith("hd")) {
												string_16 = string_16.substring(2);
												bool_23 = true;
											}

											if (string_16.length() >= 4 && Class115.method1950(string_16.substring(0, 4))) {
												i_11 = Utils.parseInt(string_16.substring(0, 4));
												break;
											}
										}
									}
								} catch (Exception ignored) {
								}
							}

							if (!bool_13 && !bool_23) {
								if (i_11 >= 7000 && i_11 <= 7999)
									aBool10193 = false;

								if (i_11 >= 7000 && i_11 <= 9250)
									aBool8827 = false;
							}

							aBool10194 &= anOpenGL10191.supportsExtension("GL_ARB_half_float_pixel");
						}

						aString10185.indexOf("intel");
						if (aBool10193)
							try {
								int[] ints_18 = new int[1];
								OpenGL.glGenBuffersARB(1, ints_18, 0);
							} catch (Throwable throwable_19) {
								throw new RuntimeException("");
							}

						method8411(canvas_2, new Class158_Sub2_Sub2_Sub1(this, canvas_2, long_3));
						method8412(canvas_2);
						method13910(32768, false);
						method13910(32768, false);
					}
				}
			} else
				throw new RuntimeException("");
		} catch (Throwable throwable_22) {
			throwable_22.printStackTrace();
			method8396();
			if (throwable_22 instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable_22;
			throw new RuntimeException("");
		}
	}

	@Override
	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, anInt10198, ints_5, i_3 * i_7);

		return ints_5;
	}

	@Override
	public void ba(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void fd(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void fi(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void fu(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13942(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	byte[] getGLShaderData(String string_1) {
		return getCacheShaderData("gl", string_1);
	}

	@Override
	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);

		return ints_5;
	}

	@Override
	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);

		return ints_5;
	}

	@Override
	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, anInt10198 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);

		return ints_5;
	}

	@Override
	public Shader loadShader(String string_1) {
		byte[] bytes_2 = getGLShaderData(string_1);
		if (bytes_2 == null)
			return null;
		ShaderLoader class114_3 = method13891(bytes_2);
		return new OpenGLShader(this, class114_3);
	}

	@Override
	public boolean method13887() {
		return aBool10177;
	}

	@Override
	public boolean method13888() {
		return aBool10192;
	}

	@Override
	public void method13892(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(matrix44_1, matrix44_2);
		OpenGL.glLoadMatrixf(aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44_3.buf, 0);
	}

	@Override
	void method13894() {
		byte b_1 = 0;
		byte b_2 = 0;
		if (anInt8844 == 0) {
			b_1 = 0;
			b_2 = 0;
		} else if (anInt8844 == 1) {
			b_1 = 1;
			b_2 = 0;
		} else if (anInt8844 == 2) {
			b_1 = 1;
			b_2 = 1;
		}

		if (aClass73_8733 == Class73.aClass73_727)
			OpenGL.glBlendFuncSeparate(770, 771, b_1, b_2);
		else if (aClass73_8733 == Class73.aClass73_725)
			OpenGL.glBlendFuncSeparate(1, 1, b_1, b_2);
		else if (aClass73_8733 == Class73.aClass73_726)
			OpenGL.glBlendFuncSeparate(774, 1, b_1, b_2);

	}

	@Override
	void method13897() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);

		for (int i_1 = anInt8825 - 1; i_1 >= 0; --i_1) {
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
		float[] floats_4 = {0.0F, 0.0F, 0.0F, 1.0F};

		for (int i_2 = 0; i_2 < 8; i_2++) {
			int i_3 = i_2 + 16384;
			OpenGL.glLightfv(i_3, 4608, floats_4, 0);
			OpenGL.glLightf(i_3, 4615, 0.0F);
			OpenGL.glLightf(i_3, 4616, 0.0F);
		}

		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL10191.setSwapInterval(0);
		super.method13897();
	}

	@Override
	public float method13905() {
		return 0.0F;
	}

	@Override
	void method13909() {
		if (aBool8843)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);

	}

	@Override
	void method13913() {
	}

	@Override
	void method13914() {
		if (aBool8817)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);

	}

	@Override
	void method13915() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.buf, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8747, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8762, 0);
	}

	@Override
	void method13916() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	@Override
	Interface1 method13917(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class319_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	@Override
	void method13920() {
		if (aClass158_5853 != null)
			OpenGL.glViewport(anInt8823 + anInt8749, anInt8754 + aClass158_5853.getHeight() - anInt8776 - anInt8752, anInt8751, anInt8752);

		OpenGL.glDepthRange(aFloat8735, aFloat8736);
	}

	@Override
	void method13921() {
		if (aClass158_5853 != null) {
			int i_1 = anInt8823 + anInt8743;
			int i_2 = anInt8754 + aClass158_5853.getHeight() - anInt8742;
			int i_3 = anInt8744 - anInt8743;
			int i_4 = anInt8742 - anInt8822;
			if (i_3 < 0)
				i_3 = 0;

			if (i_4 < 0)
				i_4 = 0;

			OpenGL.glScissor(i_1, i_2, i_3, i_4);
		}

	}

	@Override
	void method13922() {
		if (aBool8843)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);

	}

	@Override
	public void method13923(Class352 class352_1, int i_2, int i_3) {
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

	@Override
	void method13924() {
	}

	@Override
	Interface4 method13925(boolean bool_1) {
		return new Class326_Sub1(this, bool_1);
	}

	@Override
	public void method13933(Matrix44 matrix44_1) {
		float[] floats_2 = matrix44_1.buf;
		floats_2[1] = -floats_2[1];
		floats_2[5] = -floats_2[5];
		floats_2[9] = -floats_2[9];
		floats_2[13] = -floats_2[13];
	}

	@Override
	void method13945() {
		if (aBool8818)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);

	}

	@Override
	void method13948() {
		aFloatArray10172[0] = aFloat8769 * aFloat8766;
		aFloatArray10172[1] = aFloat8769 * aFloat8767;
		aFloatArray10172[2] = aFloat8769 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray10172, 0);
	}

	@Override
	void method13949() {
		aFloatArray10172[0] = aFloat8770 * aFloat8766;
		aFloatArray10172[1] = aFloat8770 * aFloat8767;
		aFloatArray10172[2] = aFloat8770 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray10172, 0);
		aFloatArray10172[0] = -aFloat8826 * aFloat8766;
		aFloatArray10172[1] = -aFloat8826 * aFloat8767;
		aFloatArray10172[2] = -aFloat8826 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray10172, 0);
	}

	@Override
	void method13950() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.buf, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray8747, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray8762, 0);
	}

	@Override
	void method13951() {
	}

	@Override
	void method13952() {
		if (aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}

	}

	@Override
	void method13953() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.buf, 0);

		int i_1;
		for (i_1 = 0; i_1 < anInt8773; i_1++) {
			GLLight class282_sub24_2 = aNode_Sub24Array8716[i_1];
			int i_3 = class282_sub24_2.getColor();
			int i_4 = i_1 + 16386;
			float f_5 = class282_sub24_2.getIntensity() / 255.0F;
			aFloatArray10172[0] = class282_sub24_2.getX();
			aFloatArray10172[1] = class282_sub24_2.getY();
			aFloatArray10172[2] = class282_sub24_2.getZ();
			aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4611, aFloatArray10172, 0);
			aFloatArray10172[0] = (i_3 >> 16 & 0xff) * f_5;
			aFloatArray10172[1] = (i_3 >> 8 & 0xff) * f_5;
			aFloatArray10172[2] = (i_3 & 0xff) * f_5;
			aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4609, aFloatArray10172, 0);
			OpenGL.glLightf(i_4, 4617, 1.0F / (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			OpenGL.glEnable(i_4);
		}

		while (i_1 < anInt8831) {
			OpenGL.glDisable(i_1 + 16386);
			++i_1;
		}

	}

	@Override
	boolean method13954(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	@Override
	boolean method13955(Class150 class150_1, Class76 class76_2) {
		return aBool8827;
	}

	@Override
	void method13956() {
		if (aBool8757)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);

	}

	@Override
	public void method13959(Class352 class352_1, int i_2, int i_3) {
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

	@Override
	Interface6 method13961(Class150 class150_1, int i_2, int i_3, float[] floats_5) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_2) && CutsceneAction_Sub9.method14585(i_3)))
			return new Class319_Sub2(this, class150_1, i_2, i_3, true, floats_5, 0, 0);
		if (aBool10194)
			return new Class319_Sub3(this, class150_1, i_2, i_3, floats_5, 0, 0);
		else {
			Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_758, Utils.nextPowerOfTwo(i_2), Utils.nextPowerOfTwo(i_3));
			class319_sub2_8.method14494(i_2, i_3, floats_5, class150_1, 0, 0);
			return class319_sub2_8;
		}
	}

	@Override
	Interface1 method13962(Class150 class150_1, byte[] bytes_6) {
		return new Class319_Sub1(this, class150_1, 128, 128, 16, true, bytes_6);
	}

	@Override
	public void method13964() {
		int i_1 = anIntArray10188[anInt8780];
		if (i_1 != 0) {
			anIntArray10188[anInt8780] = 0;
			OpenGL.glBindTexture(i_1, 0);
			OpenGL.glDisable(i_1);
		}

	}

	@Override
	void method13968(int i_1, Class67 class67_2) {
		OpenGL.glTexEnvi(8960, i_1 + 34176, method15567(class67_2));
		OpenGL.glTexEnvi(8960, i_1 + 34192, 768);
	}

	@Override
	void method13970(int i_1, Class67 class67_2) {
		OpenGL.glTexEnvi(8960, i_1 + 34184, method15567(class67_2));
		OpenGL.glTexEnvi(8960, i_1 + 34200, 770);
	}

	@Override
	boolean method13975(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	@Override
	void method13978() {
		OpenGL.glActiveTexture(anInt8780 + 33984);
	}

	@Override
	void method13979() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	@Override
	void method13980() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	@Override
	void method13982() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.buf, 0);

		int i_1;
		for (i_1 = 0; i_1 < anInt8773; i_1++) {
			GLLight class282_sub24_2 = aNode_Sub24Array8716[i_1];
			int i_3 = class282_sub24_2.getColor();
			int i_4 = 16386 + i_1;
			float f_5 = class282_sub24_2.getIntensity() / 255.0F;
			aFloatArray10172[0] = class282_sub24_2.getX();
			aFloatArray10172[1] = class282_sub24_2.getY();
			aFloatArray10172[2] = class282_sub24_2.getZ();
			aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4611, aFloatArray10172, 0);
			aFloatArray10172[0] = (i_3 >> 16 & 0xff) * f_5;
			aFloatArray10172[1] = (i_3 >> 8 & 0xff) * f_5;
			aFloatArray10172[2] = (i_3 & 0xff) * f_5;
			aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4609, aFloatArray10172, 0);
			OpenGL.glLightf(i_4, 4617, 1.0F / (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			OpenGL.glEnable(i_4);
		}

		while (i_1 < anInt8831) {
			OpenGL.glDisable(16386 + i_1);
			++i_1;
		}

	}

	@Override
	public void method13983(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
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

		Class76 class76_8 = aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), aClass326_Sub2_10187.method5794() + (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	@Override
	void method13986(int i_1) {
		OpenGL.glColorMask((i_1 & 0x1) != 0, (i_1 & 0x2) != 0, (i_1 & 0x4) != 0, (i_1 & 0x8) != 0);
	}

	@Override
	void method13987() {
		aFloatArray10172[0] = (anInt8758 & 0xff0000) / 1.671168E7F;
		aFloatArray10172[1] = (anInt8758 & 0xff00) / 65280.0F;
		aFloatArray10172[2] = (anInt8758 & 0xff) / 255.0F;
		aFloatArray10172[3] = (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10172, 0);
	}

	@Override
	void method13991() {
		if (aBool8809 && aBool8808 && anInt8811 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);

	}

	@Override
	void method13992(boolean bool_1) {
		if (bool_1)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);

	}

	@Override
	Interface32 method13993(boolean bool_1) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool_1);
	}

	@Override
	Interface4 method13994(boolean bool_1) {
		return new Class326_Sub1(this, bool_1);
	}

	@Override
	Class70 method13995(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	@Override
	public void method13996(Class70 class70_1) {
		Class72[] arr_2 = class70_1.aClass72Array707;
		int i_3 = 0;
		boolean bool_4 = false;
		boolean bool_5 = false;
		boolean bool_6 = false;

		int i_7;
		for (i_7 = 0; i_7 < arr_2.length; i_7++) {
			Class72 class72_8 = arr_2[i_7];
			Class326_Sub1 class326_sub1_9 = aClass326_Sub1Array10186[i_7];
			int i_10 = 0;
			int i_11 = class326_sub1_9.method14559();
			long long_12 = class326_sub1_9.method5794();
			class326_sub1_9.method5792();

			for (int i_14 = 0; i_14 < class72_8.method1296(); i_14++) {
				Class69 class69_15 = class72_8.method1297(i_14);
				switch (class69_15.anInt698) {
				case 0:
					OpenGL.glNormalPointer(5126, i_11, long_12 + i_10);
					bool_5 = true;
				case 1:
				case 3:
				case 5:
				case 6:
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(4, 5126, i_11, long_12 + i_10);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(2, 5126, i_11, long_12 + i_10);
					break;
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_11, long_12 + i_10);
					bool_6 = true;
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(1, 5126, i_11, long_12 + i_10);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(3, 5126, i_11, long_12 + i_10);
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_11, long_12 + i_10);
					bool_4 = true;
				}

				i_10 += class69_15.anInt704;
			}
		}

		if (bool_6 != aBool10180) {
			if (bool_6)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);

			aBool10180 = bool_6;
		}

		if (bool_5 != aBool10190) {
			if (bool_5)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);

			aBool10190 = bool_5;
		}

		if (bool_4 != aBool10183) {
			if (bool_4)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);

			aBool10183 = bool_4;
		}

		if (anInt10181 < i_3) {
			for (i_7 = anInt10181; i_7 < i_3; i_7++) {
				OpenGL.glClientActiveTexture(i_7 + 33984);
				OpenGL.glEnableClientState(32888);
			}

			anInt10181 = i_3;
		} else if (anInt10181 > i_3) {
			for (i_7 = i_3; i_7 < anInt10181; i_7++) {
				OpenGL.glClientActiveTexture(i_7 + 33984);
				OpenGL.glDisableClientState(32888);
			}

			anInt10181 = i_3;
		}

	}

	@Override
	void method13997(Interface32 interface32_1) {
		aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		aClass326_Sub2_10187.method5792();
	}

	@Override
	void method13999() {
		aFloat8819 = aFloat8697 - anInt8680;
		aFloat8813 = aFloat8819 - anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;

		if (aBool8692) {
			OpenGL.glFogf(2915, aFloat8813);
			OpenGL.glFogf(2916, aFloat8819);
			aFloatArray10172[0] = (anInt8810 & 0xff0000) / 1.671168E7F;
			aFloatArray10172[1] = (anInt8810 & 0xff00) / 65280.0F;
			aFloatArray10172[2] = (anInt8810 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray10172, 0);
		}

	}

	@Override
	public void method14002(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
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

		Class76 class76_8 = aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), aClass326_Sub2_10187.method5794() + (i_4 * class76_8.anInt748));
	}

	@Override
	Interface6 method14008(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_1) && CutsceneAction_Sub9.method14585(i_2)))
			return new Class319_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
		if (aBool10194)
			return new Class319_Sub3(this, i_1, i_2, ints_4, i_5, i_6);
		else {
			Class319_Sub2 class319_sub2_7 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Utils.nextPowerOfTwo(i_1), Utils.nextPowerOfTwo(i_2));
			class319_sub2_7.method48(0, 0, i_1, i_2, ints_4, i_5, i_6);
			return class319_sub2_7;
		}
	}

	@Override
	Interface31 method14011(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	@Override
	void method14013() {
		aFloat8819 = aFloat8697 - anInt8680;
		aFloat8813 = aFloat8819 - anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;

		if (aBool8692) {
			OpenGL.glFogf(2915, aFloat8813);
			OpenGL.glFogf(2916, aFloat8819);
			aFloatArray10172[0] = (anInt8810 & 0xff0000) / 1.671168E7F;
			aFloatArray10172[1] = (anInt8810 & 0xff00) / 65280.0F;
			aFloatArray10172[2] = (anInt8810 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray10172, 0);
		}

	}

	@Override
	void method14015() {
		if (aBool8809 && aBool8808 && anInt8811 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);

	}

	@Override
	Class70 method14017(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	@Override
	void method14019() {
		if (aClass158_5853 != null) {
			int i_1 = anInt8823 + anInt8743;
			int i_2 = anInt8754 + aClass158_5853.getHeight() - anInt8742;
			int i_3 = anInt8744 - anInt8743;
			int i_4 = anInt8742 - anInt8822;
			if (i_3 < 0)
				i_3 = 0;

			if (i_4 < 0)
				i_4 = 0;

			OpenGL.glScissor(i_1, i_2, i_3, i_4);
		}

	}

	@Override
	void method14020() {
		byte b_1 = 0;
		byte b_2 = 0;
		if (anInt8844 == 0) {
			b_1 = 0;
			b_2 = 0;
		} else if (anInt8844 == 1) {
			b_1 = 1;
			b_2 = 0;
		} else if (anInt8844 == 2) {
			b_1 = 1;
			b_2 = 1;
		}

		if (aClass73_8733 == Class73.aClass73_727)
			OpenGL.glBlendFuncSeparate(770, 771, b_1, b_2);
		else if (aClass73_8733 == Class73.aClass73_725)
			OpenGL.glBlendFuncSeparate(1, 1, b_1, b_2);
		else if (aClass73_8733 == Class73.aClass73_726)
			OpenGL.glBlendFuncSeparate(774, 1, b_1, b_2);

	}

	@Override
	Interface29 method14022(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return !aBool10197 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	void method14025() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);

	}

	@Override
	void method14026() {
		aFloatArray10172[0] = aFloat8769 * aFloat8766;
		aFloatArray10172[1] = aFloat8769 * aFloat8767;
		aFloatArray10172[2] = aFloat8769 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray10172, 0);
	}

	@Override
	Interface31 method14034(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	@Override
	public boolean method14045() {
		return aBool10192;
	}

	@Override
	void method14047() {
		if (aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}

	}

	@Override
	Interface6 method14048(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_1) && CutsceneAction_Sub9.method14585(i_2)))
			return new Class319_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
		if (aBool10194)
			return new Class319_Sub3(this, i_1, i_2, ints_4, i_5, i_6);
		else {
			Class319_Sub2 class319_sub2_7 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Utils.nextPowerOfTwo(i_1), Utils.nextPowerOfTwo(i_2));
			class319_sub2_7.method48(0, 0, i_1, i_2, ints_4, i_5, i_6);
			return class319_sub2_7;
		}
	}

	@Override
	public Shader method14049(String string_1) {
		byte[] bytes_2 = getGLShaderData(string_1);
		if (bytes_2 == null)
			return null;
		ShaderLoader class114_3 = method13891(bytes_2);
		return new OpenGLShader(this, class114_3);
	}

	@Override
	void method14054() {
		OpenGL.glDepthMask(aBool8755 && aBool8756);
	}

	@Override
	public void method14056(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(matrix44_1, matrix44_2);
		OpenGL.glLoadMatrixf(aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44_3.buf, 0);
	}

	@Override
	public void method14057(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(matrix44_1, matrix44_2);
		OpenGL.glLoadMatrixf(aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44_3.buf, 0);
	}

	@Override
	public void method14058(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		OpenGL.glMatrixMode(5888);
		aClass384_8683.method6568(matrix44_1, matrix44_2);
		OpenGL.glLoadMatrixf(aClass384_8683.buf, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(matrix44_3.buf, 0);
	}

	@Override
	void method14063() {
		aFloatArray10172[0] = (anInt8758 & 0xff0000) / 1.671168E7F;
		aFloatArray10172[1] = (anInt8758 & 0xff00) / 65280.0F;
		aFloatArray10172[2] = (anInt8758 & 0xff) / 255.0F;
		aFloatArray10172[3] = (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10172, 0);
	}

	@Override
	Interface29 method14064(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return !aBool10197 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface6 method14072(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return method14064(class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface1 method14077(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class319_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	@Override
	void method14087() {
		if (aClass158_5853 != null)
			OpenGL.glViewport(anInt8823 + anInt8749, anInt8754 + aClass158_5853.getHeight() - anInt8776 - anInt8752, anInt8751, anInt8752);

		OpenGL.glDepthRange(aFloat8735, aFloat8736);
	}

	@Override
	void method14088() {
		if (aClass158_5853 != null) {
			int i_1 = anInt8823 + anInt8743;
			int i_2 = anInt8754 + aClass158_5853.getHeight() - anInt8742;
			int i_3 = anInt8744 - anInt8743;
			int i_4 = anInt8742 - anInt8822;
			if (i_3 < 0)
				i_3 = 0;

			if (i_4 < 0)
				i_4 = 0;

			OpenGL.glScissor(i_1, i_2, i_3, i_4);
		}

	}

	@Override
	Interface6 method14090(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_2) && CutsceneAction_Sub9.method14585(i_3)))
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
		if (aBool10194)
			return new Class319_Sub3(this, class150_1, i_2, i_3, floats_5, i_6, i_7);
		else {
			Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_758, Utils.nextPowerOfTwo(i_2), Utils.nextPowerOfTwo(i_3));
			class319_sub2_8.method14494(i_2, i_3, floats_5, class150_1, i_6, i_7);
			return class319_sub2_8;
		}
	}

	@Override
	public float method14091() {
		return 0.0F;
	}

	@Override
	void method14092(boolean bool_1) {
		if (bool_1)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);

	}

	@Override
	Interface6 method14094(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_1) && CutsceneAction_Sub9.method14585(i_2)))
			return new Class319_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
		if (aBool10194)
			return new Class319_Sub3(this, i_1, i_2, ints_4, i_5, i_6);
		else {
			Class319_Sub2 class319_sub2_7 = new Class319_Sub2(this, Class150.aClass150_1949, Class76.aClass76_751, Utils.nextPowerOfTwo(i_1), Utils.nextPowerOfTwo(i_2));
			class319_sub2_7.method48(0, 0, i_1, i_2, ints_4, i_5, i_6);
			return class319_sub2_7;
		}
	}

	@Override
	void method14098(int i_1) {
		OpenGL.glPolygonMode(1028, (i_1 & 0x2) != 0 ? 6913 : 6914);
	}

	@Override
	public void method14101(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
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

		Class76 class76_8 = aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), aClass326_Sub2_10187.method5794() + (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	@Override
	public void method14107(Matrix44 matrix44_1) {
		float[] floats_2 = matrix44_1.buf;
		floats_2[1] = -floats_2[1];
		floats_2[5] = -floats_2[5];
		floats_2[9] = -floats_2[9];
		floats_2[13] = -floats_2[13];
	}

	@Override
	void method14117() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);

	}

	@Override
	void method14119() {
		if (aBool8757)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);

	}

	@Override
	void method14120() {
		OpenGL.glDepthMask(aBool8755 && aBool8756);
	}

	@Override
	void method14121() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);

	}

	@Override
	void method14122() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);

	}

	@Override
	void method14124() {
		aFloatArray10172[0] = aFloat8769 * aFloat8766;
		aFloatArray10172[1] = aFloat8769 * aFloat8767;
		aFloatArray10172[2] = aFloat8769 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray10172, 0);
	}

	@Override
	void method14125() {
		aFloatArray10172[0] = aFloat8769 * aFloat8766;
		aFloatArray10172[1] = aFloat8769 * aFloat8767;
		aFloatArray10172[2] = aFloat8769 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray10172, 0);
	}

	@Override
	void method14127() {
		aFloatArray10172[0] = aFloat8770 * aFloat8766;
		aFloatArray10172[1] = aFloat8770 * aFloat8767;
		aFloatArray10172[2] = aFloat8770 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray10172, 0);
		aFloatArray10172[0] = -aFloat8826 * aFloat8766;
		aFloatArray10172[1] = -aFloat8826 * aFloat8767;
		aFloatArray10172[2] = -aFloat8826 * aFloat8768;
		aFloatArray10172[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray10172, 0);
	}

	@Override
	void method14132() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass384_8740.buf, 0);

		int i_1;
		for (i_1 = 0; i_1 < anInt8773; i_1++) {
			GLLight class282_sub24_2 = aNode_Sub24Array8716[i_1];
			int i_3 = class282_sub24_2.getColor();
			int i_4 = 16386 + i_1;
			float f_5 = class282_sub24_2.getIntensity() / 255.0F;
			aFloatArray10172[0] = class282_sub24_2.getX();
			aFloatArray10172[1] = class282_sub24_2.getY();
			aFloatArray10172[2] = class282_sub24_2.getZ();
			aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4611, aFloatArray10172, 0);
			aFloatArray10172[0] = (i_3 >> 16 & 0xff) * f_5;
			aFloatArray10172[1] = (i_3 >> 8 & 0xff) * f_5;
			aFloatArray10172[2] = (i_3 & 0xff) * f_5;
			aFloatArray10172[3] = 1.0F;
			OpenGL.glLightfv(i_4, 4609, aFloatArray10172, 0);
			OpenGL.glLightf(i_4, 4617, 1.0F / (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			OpenGL.glEnable(i_4);
		}

		while (i_1 < anInt8831) {
			OpenGL.glDisable(16386 + i_1);
			++i_1;
		}

	}

	@Override
	boolean method14134(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	@Override
	boolean method14135(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	@Override
	boolean method14136(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	@Override
	boolean method14137(Class150 class150_1, Class76 class76_2) {
		return true;
	}

	@Override
	Interface6 method14141(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return method14064(class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface6 method14142(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return method14064(class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface6 method14143(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_2) && CutsceneAction_Sub9.method14585(i_3)))
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, 0, 0);
		if (aBool10194)
			return new Class319_Sub3(this, class150_1, i_2, i_3, bytes_5, 0, 0);
		else {
			Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_751, Utils.nextPowerOfTwo(i_2), Utils.nextPowerOfTwo(i_3));
			class319_sub2_8.method52(0, 0, i_2, i_3, bytes_5, class150_1, 0, 0);
			return class319_sub2_8;
		}
	}

	@Override
	Interface6 method14144(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5, int i_6, int i_7) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_2) && CutsceneAction_Sub9.method14585(i_3)))
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, i_6, i_7);
		if (aBool10194)
			return new Class319_Sub3(this, class150_1, i_2, i_3, bytes_5, i_6, i_7);
		else {
			Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_751, Utils.nextPowerOfTwo(i_2), Utils.nextPowerOfTwo(i_3));
			class319_sub2_8.method52(0, 0, i_2, i_3, bytes_5, class150_1, i_6, i_7);
			return class319_sub2_8;
		}
	}

	@Override
	Interface6 method14145(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		if (aBool10197 || (CutsceneAction_Sub9.method14585(i_2) && CutsceneAction_Sub9.method14585(i_3)))
			return new Class319_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
		if (aBool10194)
			return new Class319_Sub3(this, class150_1, i_2, i_3, floats_5, i_6, i_7);
		else {
			Class319_Sub2 class319_sub2_8 = new Class319_Sub2(this, class150_1, Class76.aClass76_758, Utils.nextPowerOfTwo(i_2), Utils.nextPowerOfTwo(i_3));
			class319_sub2_8.method14494(i_2, i_3, floats_5, class150_1, i_6, i_7);
			return class319_sub2_8;
		}
	}

	@Override
	public boolean method14146() {
		return aBool10177;
	}

	@Override
	Interface29 method14148(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return !aBool10197 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface29 method14149(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return !aBool10197 && (!CutsceneAction_Sub9.method14585(i_3) || !CutsceneAction_Sub9.method14585(i_4)) ? (aBool10194 ? new Class319_Sub3(this, class150_1, class76_2, i_3, i_4) : new Class319_Sub2(this, class150_1, class76_2, Utils.nextPowerOfTwo(i_3), Utils.nextPowerOfTwo(i_4))) : new Class319_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	public void method14153() {
		int i_1 = anIntArray10188[anInt8780];
		if (i_1 != 0) {
			anIntArray10188[anInt8780] = 0;
			OpenGL.glBindTexture(i_1, 0);
			OpenGL.glDisable(i_1);
		}

	}

	@Override
	public void method14154() {
		int i_1 = anIntArray10188[anInt8780];
		if (i_1 != 0) {
			anIntArray10188[anInt8780] = 0;
			OpenGL.glBindTexture(i_1, 0);
			OpenGL.glDisable(i_1);
		}

	}

	@Override
	public void method14161(int i_1, Interface4 interface4_2) {
		aClass326_Sub1Array10186[i_1] = (Class326_Sub1) interface4_2;
	}

	@Override
	void method14162(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		OpenGL.glTexEnvi(8960, 34176 + i_1, method15567(class67_2));
		if (bool_3)
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 769 : 768);

	}

	@Override
	void method14166(int i_1, Class67 class67_2, boolean bool_3) {
		OpenGL.glTexEnvi(8960, 34184 + i_1, method15567(class67_2));
		OpenGL.glTexEnvi(8960, 34200 + i_1, bool_3 ? 771 : 770);
	}

	@Override
	void method14169() {
		OpenGL.glDepthMask(aBool8755 && aBool8756);
	}

	@Override
	void method14172() {
		if (aBool8759) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}

	}

	@Override
	void method14173(Interface32 interface32_1) {
		aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		aClass326_Sub2_10187.method5792();
	}

	@Override
	void method14179() {
		aFloatArray10172[0] = (anInt8758 & 0xff0000) / 1.671168E7F;
		aFloatArray10172[1] = (anInt8758 & 0xff00) / 65280.0F;
		aFloatArray10172[2] = (anInt8758 & 0xff) / 255.0F;
		aFloatArray10172[3] = (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10172, 0);
	}

	@Override
	void method14180() {
		aFloatArray10172[0] = (anInt8758 & 0xff0000) / 1.671168E7F;
		aFloatArray10172[1] = (anInt8758 & 0xff00) / 65280.0F;
		aFloatArray10172[2] = (anInt8758 & 0xff) / 255.0F;
		aFloatArray10172[3] = (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10172, 0);
	}

	@Override
	void method14181() {
		aFloatArray10172[0] = (anInt8758 & 0xff0000) / 1.671168E7F;
		aFloatArray10172[1] = (anInt8758 & 0xff00) / 65280.0F;
		aFloatArray10172[2] = (anInt8758 & 0xff) / 255.0F;
		aFloatArray10172[3] = (anInt8758 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10172, 0);
	}

	@Override
	void method14182() {
		OpenGL.glMatrixMode(5890);
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393)
			OpenGL.glLoadMatrixf(aClass384Array8782[anInt8780].method6517(aFloatArray10182), 0);
		else
			OpenGL.glLoadIdentity();

		OpenGL.glMatrixMode(5888);
	}

	@Override
	void method14183() {
		OpenGL.glMatrixMode(5890);
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393)
			OpenGL.glLoadMatrixf(aClass384Array8782[anInt8780].method6517(aFloatArray10182), 0);
		else
			OpenGL.glLoadIdentity();

		OpenGL.glMatrixMode(5888);
	}

	@Override
	void method14184() {
		OpenGL.glActiveTexture(33984 + anInt8780);
	}

	@Override
	void method14185() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	@Override
	void method14186() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	@Override
	void method14187() {
		OpenGL.glTexEnvi(8960, 34161, method15583(aClass68Array8784[anInt8780]));
	}

	@Override
	void method14188() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	@Override
	void method14190() {
		OpenGL.glTexEnvi(8960, 34162, method15583(aClass68Array8785[anInt8780]));
	}

	@Override
	void method14197() {
		if (aBool8818)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);

	}

	@Override
	void method14199() {
		byte b_1 = 0;
		byte b_2 = 0;
		if (anInt8844 == 0) {
			b_1 = 0;
			b_2 = 0;
		} else if (anInt8844 == 1) {
			b_1 = 1;
			b_2 = 0;
		} else if (anInt8844 == 2) {
			b_1 = 1;
			b_2 = 1;
		}

		if (aClass73_8733 == Class73.aClass73_727)
			OpenGL.glBlendFuncSeparate(770, 771, b_1, b_2);
		else if (aClass73_8733 == Class73.aClass73_725)
			OpenGL.glBlendFuncSeparate(1, 1, b_1, b_2);
		else if (aClass73_8733 == Class73.aClass73_726)
			OpenGL.glBlendFuncSeparate(774, 1, b_1, b_2);

	}

	@Override
	void method14200() {
		if (aBool8817)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);

	}

	@Override
	void method14203() {
		if (aBool8809 && aBool8808 && anInt8811 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);

	}

	@Override
	void method14204() {
		if (aBool8684 && !aBool8760)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);

	}

	@Override
	void method14205() {
		if (aClass158_5853 != null)
			OpenGL.glViewport(anInt8823 + anInt8749, anInt8754 + aClass158_5853.getHeight() - anInt8776 - anInt8752, anInt8751, anInt8752);

		OpenGL.glDepthRange(aFloat8735, aFloat8736);
	}

	@Override
	Interface32 method14206(boolean bool_1) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool_1);
	}

	@Override
	Interface32 method14207(boolean bool_1) {
		return new Class326_Sub2(this, Class76.aClass76_752, bool_1);
	}

	@Override
	Class70 method14209(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	@Override
	Class70 method14210(Class72[] arr_1) {
		return new Class70_Sub2(arr_1);
	}

	@Override
	public void method14212(Class70 class70_1) {
		Class72[] arr_2 = class70_1.aClass72Array707;
		int i_3 = 0;
		boolean bool_4 = false;
		boolean bool_5 = false;
		boolean bool_6 = false;

		int i_7;
		for (i_7 = 0; i_7 < arr_2.length; i_7++) {
			Class72 class72_8 = arr_2[i_7];
			Class326_Sub1 class326_sub1_9 = aClass326_Sub1Array10186[i_7];
			int i_10 = 0;
			int i_11 = class326_sub1_9.method14559();
			long long_12 = class326_sub1_9.method5794();
			class326_sub1_9.method5792();

			for (int i_14 = 0; i_14 < class72_8.method1296(); i_14++) {
				Class69 class69_15 = class72_8.method1297(i_14);
				switch (class69_15.anInt698) {
				case 0:
					OpenGL.glNormalPointer(5126, i_11, long_12 + i_10);
					bool_5 = true;
				case 1:
				case 3:
				case 5:
				case 6:
				default:
					break;
				case 2:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(4, 5126, i_11, long_12 + i_10);
					break;
				case 4:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(2, 5126, i_11, long_12 + i_10);
					break;
				case 7:
					OpenGL.glVertexPointer(3, 5126, i_11, long_12 + i_10);
					bool_6 = true;
					break;
				case 8:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(1, 5126, i_11, long_12 + i_10);
					break;
				case 9:
					OpenGL.glClientActiveTexture(33984 + i_3++);
					OpenGL.glTexCoordPointer(3, 5126, i_11, long_12 + i_10);
					break;
				case 10:
					OpenGL.glColorPointer(4, 5121, i_11, long_12 + i_10);
					bool_4 = true;
				}

				i_10 += class69_15.anInt704;
			}
		}

		if (aBool10180 != bool_6) {
			if (bool_6)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);

			aBool10180 = bool_6;
		}

		if (aBool10190 != bool_5) {
			if (bool_5)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);

			aBool10190 = bool_5;
		}

		if (aBool10183 != bool_4) {
			if (bool_4)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);

			aBool10183 = bool_4;
		}

		if (anInt10181 < i_3) {
			for (i_7 = anInt10181; i_7 < i_3; i_7++) {
				OpenGL.glClientActiveTexture(33984 + i_7);
				OpenGL.glEnableClientState(32888);
			}

			anInt10181 = i_3;
		} else if (anInt10181 > i_3) {
			for (i_7 = i_3; i_7 < anInt10181; i_7++) {
				OpenGL.glClientActiveTexture(33984 + i_7);
				OpenGL.glDisableClientState(32888);
			}

			anInt10181 = i_3;
		}

	}

	@Override
	public void method14213(int i_1, Interface4 interface4_2) {
		aClass326_Sub1Array10186[i_1] = (Class326_Sub1) interface4_2;
	}

	@Override
	public void method14214(int i_1, Interface4 interface4_2) {
		aClass326_Sub1Array10186[i_1] = (Class326_Sub1) interface4_2;
	}

	@Override
	void method14215(Interface32 interface32_1) {
		aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		aClass326_Sub2_10187.method5792();
	}

	@Override
	Interface6 method14216(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return method14064(class150_1, class76_2, i_3, i_4);
	}

	@Override
	void method14217(Interface32 interface32_1) {
		aClass326_Sub2_10187 = (Class326_Sub2) interface32_1;
		aClass326_Sub2_10187.method5792();
	}

	@Override
	void method14224(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		OpenGL.glTexEnvi(8960, 34176 + i_1, method15567(class67_2));
		if (bool_3)
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i_1, bool_4 ? 769 : 768);

	}

	@Override
	void method14226() {
		OpenGL.glMatrixMode(5890);
		if (aClass37Array8783[anInt8780] != Class37.aClass37_393)
			OpenGL.glLoadMatrixf(aClass384Array8782[anInt8780].method6517(aFloatArray10182), 0);
		else
			OpenGL.glLoadIdentity();

		OpenGL.glMatrixMode(5888);
	}

	@Override
	public void method14228(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
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

		Class76 class76_8 = aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), aClass326_Sub2_10187.method5794() + (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	@Override
	public void method14229(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
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

		Class76 class76_8 = aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), aClass326_Sub2_10187.method5794() + (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	@Override
	public void method14230(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
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

		Class76 class76_8 = aClass326_Sub2_10187.method14575();
		OpenGL.glDrawElements(b_6, i_7, method15566(class76_8), aClass326_Sub2_10187.method5794() + (i_4 * class76_8.anInt748 * -704130985 * 971905895));
	}

	@Override
	void method14235(int i_1) {
		OpenGL.glPolygonMode(1028, (i_1 & 0x2) != 0 ? 6913 : 6914);
	}

	@Override
	void method14236(int i_1) {
		OpenGL.glPolygonMode(1028, (i_1 & 0x2) != 0 ? 6913 : 6914);
	}

	@Override
	Interface31 method14237(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	@Override
	void method14238() {
		if (aBool8818)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);

	}

	@Override
	Interface31 method14239(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class319_Sub4(this, i_1, bool_2, ints_3);
	}

	@Override
	void method14240(int i_1) {
		OpenGL.glColorMask((i_1 & 0x1) != 0, (i_1 & 0x2) != 0, (i_1 & 0x4) != 0, (i_1 & 0x8) != 0);
	}

	synchronized void method15569(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.pointer = i_1;
		aClass473_10174.insertBack(class282_sub38_3);
	}

	synchronized void method15570(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.pointer = i_1;
		aClass473_10175.insertBack(class282_sub38_3);
	}

	synchronized void method15571(int i_1) {
		IntNode class282_sub38_2 = new IntNode(i_1);
		aClass473_10176.insertBack(class282_sub38_2);
	}

	synchronized void method15572(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.pointer = i_1;
		aClass473_10195.insertBack(class282_sub38_3);
	}

	synchronized void method15573(int i_1) {
		Node node_2 = new Node();
		node_2.pointer = i_1;
		aClass473_10178.insertBack(node_2);
	}

	synchronized void method15580(long long_1) {
		Node node_3 = new Node();
		node_3.pointer = long_1;
		aClass473_10179.insertBack(node_3);
	}

	@Override
	public RendererInfo method8392() {
		int i_1 = -1;
		if (aString10185.indexOf("nvidia") != -1)
			i_1 = 4318;
		else if (aString10185.indexOf("intel") != -1)
			i_1 = 32902;
		else if (aString10185.indexOf("ati") != -1)
			i_1 = 4098;

		return new RendererInfo(i_1, "OpenGL", anInt10196, aString10200, 0L);
	}

	@Override
	public void method8395() {
		OpenGL.glFinish();
	}

	@Override
	void method8397() {
		super.method8397();
		if (anOpenGL10191 != null) {
			anOpenGL10191.method2571();
			anOpenGL10191.release();
			anOpenGL10191 = null;
		}

	}

	@Override
	public synchronized void method8398(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!aClass473_10174.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10174.popTail();
			anIntArray10184[i_2++] = (int) class282_sub38_4.pointer;
			anInt8702 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10175.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10175.popTail();
			anIntArray10184[i_2++] = (int) class282_sub38_4.pointer;
			anInt8701 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10176.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10176.popTail();
			anIntArray10184[i_2++] = class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10195.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10195.popTail();
			anIntArray10184[i_2++] = (int) class282_sub38_4.pointer;
			anInt8761 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray10184, 0);
			boolean bool_3 = false;
		}

		while (!aClass473_10173.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.pointer, class282_sub38_4.value);
		}

		Node node_5;
		while (!aClass473_10178.method7861()) {
			node_5 = aClass473_10178.popTail();
			OpenGL.glDeleteProgram((int) node_5.pointer);
		}

		while (!aClass473_10179.method7861()) {
			node_5 = aClass473_10179.popTail();
			OpenGL.glDeleteShader((int) node_5.pointer);
		}

		while (!aClass473_10173.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.pointer, class282_sub38_4.value);
		}

		if (za() > 100663296 && Utils.time() > aLong10199 + 60000L) {
			System.gc();
			aLong10199 = Utils.time();
		}

		super.method8398(i_1);
	}

	@Override
	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub1(this, canvas_1);
	}

	@Override
	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub3_Sub2(this);
	}

	@Override
	public Interface8 method8419(int i_1, int i_2) {
		return new Class333(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	@Override
	public void method8420() {
		if (aClass158_5853 != null) {
			int i_1 = aClass158_5853.getWidth();
			int i_2 = aClass158_5853.getHeight();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = anInt8749;
				int i_4 = anInt8776;
				int i_5 = anInt8751;
				int i_6 = anInt8752;
				method8421();
				int i_7 = anInt8743;
				int i_8 = anInt8744;
				int i_9 = anInt8822;
				int i_10 = anInt8742;
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
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_7, i_9, i_8, i_10);
				method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	@Override
	public void method8445() {
		if (aClass158_5853 != null) {
			int i_1 = aClass158_5853.getWidth();
			int i_2 = aClass158_5853.getHeight();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = anInt8749;
				int i_4 = anInt8776;
				int i_5 = anInt8751;
				int i_6 = anInt8752;
				method8421();
				int i_7 = anInt8743;
				int i_8 = anInt8744;
				int i_9 = anInt8822;
				int i_10 = anInt8742;
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
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_7, i_9, i_8, i_10);
				method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	@Override
	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	@Override
	public void method8480() {
	}

	@Override
	public RendererInfo method8481() {
		int i_1 = -1;
		if (aString10185.indexOf("nvidia") != -1)
			i_1 = 4318;
		else if (aString10185.indexOf("intel") != -1)
			i_1 = 32902;
		else if (aString10185.indexOf("ati") != -1)
			i_1 = 4098;

		return new RendererInfo(i_1, "OpenGL", anInt10196, aString10200, 0L);
	}

	@Override
	public void method8483() {
		OpenGL.glFinish();
	}

	@Override
	public void method8484() {
		OpenGL.glFinish();
	}

	@Override
	void method8485() {
		super.method8397();
		if (anOpenGL10191 != null) {
			anOpenGL10191.method2571();
			anOpenGL10191.release();
			anOpenGL10191 = null;
		}

	}

	@Override
	void method8486() {
		super.method8397();
		if (anOpenGL10191 != null) {
			anOpenGL10191.method2571();
			anOpenGL10191.release();
			anOpenGL10191 = null;
		}

	}

	@Override
	public synchronized void method8487(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!aClass473_10174.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10174.popTail();
			anIntArray10184[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8702 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10175.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10175.popTail();
			anIntArray10184[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8701 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10176.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10176.popTail();
			anIntArray10184[i_2++] = class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10195.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10195.popTail();
			anIntArray10184[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8761 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray10184, 0);
			boolean bool_3 = false;
		}

		while (!aClass473_10173.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		Node node_5;
		while (!aClass473_10178.method7861()) {
			node_5 = aClass473_10178.popTail();
			OpenGL.glDeleteProgram((int) (node_5.pointer * -1253863389874800229L * -3442165056282524525L));
		}

		while (!aClass473_10179.method7861()) {
			node_5 = aClass473_10179.popTail();
			OpenGL.glDeleteShader((int) (node_5.pointer * -1253863389874800229L * -3442165056282524525L));
		}

		while (!aClass473_10173.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		if (za() > 100663296 && Utils.time() > aLong10199 + 60000L) {
			System.gc();
			aLong10199 = Utils.time();
		}

		super.method8398(i_1);
	}

	@Override
	public synchronized void method8488(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!aClass473_10174.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10174.popTail();
			anIntArray10184[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8702 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10175.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10175.popTail();
			anIntArray10184[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8701 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10176.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10176.popTail();
			anIntArray10184[i_2++] = class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray10184, 0);
			i_2 = 0;
		}

		while (!aClass473_10195.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10195.popTail();
			anIntArray10184[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8761 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(1000, anIntArray10184, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray10184, 0);
			boolean bool_3 = false;
		}

		while (!aClass473_10173.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		Node node_5;
		while (!aClass473_10178.method7861()) {
			node_5 = aClass473_10178.popTail();
			OpenGL.glDeleteProgram((int) (node_5.pointer * -1253863389874800229L * -3442165056282524525L));
		}

		while (!aClass473_10179.method7861()) {
			node_5 = aClass473_10179.popTail();
			OpenGL.glDeleteShader((int) (node_5.pointer * -1253863389874800229L * -3442165056282524525L));
		}

		while (!aClass473_10173.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_10173.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		if (za() > 100663296 && Utils.time() > aLong10199 + 60000L) {
			System.gc();
			aLong10199 = Utils.time();
		}

		super.method8398(i_1);
	}

	@Override
	public void method8491() {
	}

	@Override
	public void method8497() {
		if (aClass158_5853 != null) {
			int i_1 = aClass158_5853.getWidth();
			int i_2 = aClass158_5853.getHeight();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = anInt8749;
				int i_4 = anInt8776;
				int i_5 = anInt8751;
				int i_6 = anInt8752;
				method8421();
				int i_7 = anInt8743;
				int i_8 = anInt8744;
				int i_9 = anInt8822;
				int i_10 = anInt8742;
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
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_7, i_9, i_8, i_10);
				method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	@Override
	public void method8507() {
		if (aClass158_5853 != null) {
			int i_1 = aClass158_5853.getWidth();
			int i_2 = aClass158_5853.getHeight();
			if (i_1 > 0 || i_2 > 0) {
				int i_3 = anInt8749;
				int i_4 = anInt8776;
				int i_5 = anInt8751;
				int i_6 = anInt8752;
				method8421();
				int i_7 = anInt8743;
				int i_8 = anInt8744;
				int i_9 = anInt8822;
				int i_10 = anInt8742;
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
				OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glCopyPixels(0, 0, i_1, i_2, 6144);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				r(i_7, i_9, i_8, i_10);
				method8617(i_3, i_4, i_5, i_6);
			}
		}

	}

	@Override
	void method8531() {
		super.method8397();
		if (anOpenGL10191 != null) {
			anOpenGL10191.method2571();
			anOpenGL10191.release();
			anOpenGL10191 = null;
		}

	}

	@Override
	void method8555() throws Exception_Sub3 {
		aClass158_Sub2_5841.method14344();
		if (textureCache != null)
			textureCache.method161();

	}

	@Override
	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	@Override
	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub1(this, canvas_1);
	}

	@Override
	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		aClass158_Sub2_5841.method14344();
		if (textureCache != null)
			textureCache.method161();

	}

	@Override
	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub3_Sub2(this);
	}

	@Override
	public Interface8 method8621(int i_1, int i_2) {
		return new Class333(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

}
