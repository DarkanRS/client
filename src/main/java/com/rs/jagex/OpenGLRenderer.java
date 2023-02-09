package com.rs.jagex;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static jaggl.GLConst.*;

public class OpenGLRenderer extends AbstractRenderer {

	static int[] anIntArray8381 = new int[1000];
	static int anInt8421 = 4;
	static float[] LIGHT_PARAMS = new float[4];
	static float[] aFloatArray8322 = new float[4];
	private static final int VENDOR_FLAG = 0x1;
	private static final int LOW_VERSION_FLAG = 0x2;
	private static final int WEIRD_VERSION_FLAG = 0x4;
	private static final int MULTITEXTURE_FLAG = 0x8;
	private static final int UNSUPPORTED_SHADER_INSTRUCTIONS = 0x10;
	private static final int TEXTURE_ENV_COMBINE_FLAG = 0x20;
	public static AbstractRenderer create(Canvas canvas_0, ImageLoader interface22_1, int i_2) {
		return new OpenGLRenderer(canvas_0, interface22_1, i_2);
	}
	static int method13629(Class150 class150_0) {
		return switch (class150_0.anInt1958) {
		case 0 -> GL_LUMINANCE;
		case 1 -> GL_ALPHA;
		case 2, 3, 7 -> throw new IllegalStateException();
		default -> throw new IllegalStateException();
		case 4 -> GL_LUMINANCE_ALPHA;
		case 5 -> GL_RGB;
		case 6 -> GL_RGBA;
		case 8 -> GL_DEPTH_COMPONENT;
		};
	}
	static int method13630(Class150 class150_0, Class76 class76_1) {
		if (class76_1 == Class76.aClass76_751)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE;
			case 1 -> GL_ALPHA;
			case 2, 3 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA;
			case 5 -> GL_RGB;
			case 6 -> GL_RGBA;
			};
		else if (class76_1 == Class76.aClass76_752)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE16;
			case 1 -> GL_ALPHA16;
			case 2, 3, 7 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA16UI_EXT;
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
			case 1 -> GL_ALPHA16F_ARB;
			case 2, 3 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA16F_ARB;
			case 5 -> GL_RGB16F_ARB;
			case 6 -> GL_RGBA16F_ARB;
			};
		else if (class76_1 == Class76.aClass76_758)
			return switch (class150_0.anInt1958) {
			case 0 -> GL_LUMINANCE32F_ARB;
			case 1 -> GL_ALPHA32F_ARB;
			case 2, 3 -> throw new IllegalArgumentException();
			default -> throw new IllegalArgumentException();
			case 4 -> GL_LUMINANCE_ALPHA32F_ARB;
			case 5 -> GL_RGB32F_ARB;
			case 6 -> GL_RGBA32F_ARB;
			};
		else
			throw new IllegalArgumentException();
	}
	GLTexture[] textures;
	Class137_Sub1 aClass137_Sub1_8460;
	FrameBufferObject fbo;
	int colorRenderType;
	int blendType;
	boolean enableAlphaTest;
	boolean maskRgb;
	int anInt8441;
	int anInt8428 = -1;
	boolean aBool8367;
	int anInt8349 = 128;
	Class134 aClass134_8359 = new Class134();
	Matrix44 aClass384_8360 = new Matrix44();
	Matrix44 aClass384_8361 = new Matrix44();
	Matrix44Var aClass294_8476 = new Matrix44Var();
	int anInt8466 = 8;
	int anInt8473 = 3;
	LinkedNodeList aClass473_8369 = new LinkedNodeList();
	LinkedNodeList aClass473_8373 = new LinkedNodeList();
	LinkedNodeList aClass473_8486 = new LinkedNodeList();
	LinkedNodeList aClass473_8375 = new LinkedNodeList();
	LinkedNodeList aClass473_8376 = new LinkedNodeList();
	LinkedNodeList aClass473_8377 = new LinkedNodeList();
	LinkedNodeList aClass473_8461 = new LinkedNodeList();
	LinkedNodeList aClass473_8379 = new LinkedNodeList();
	Matrix44Var aClass294_8389 = new Matrix44Var();
	Matrix44 aClass384_8348 = new Matrix44();
	Matrix44 aClass384_8391 = new Matrix44();
	Matrix44 aClass384_8442 = new Matrix44();
	Matrix44 aClass384_8385 = new Matrix44();
	Matrix44 aClass384_8394 = new Matrix44();
	float[][] aFloatArrayArray8395 = new float[6][4];
	float[] aFloatArray8396 = new float[4];
	float aFloat8364;
	float aFloat8320 = 1.0F;
	float aFloat8403;
	float aFloat8404 = -1.0f;
	Matrix44Var aClass294_8405 = new Matrix44Var();
	Matrix44 aClass384_8380 = new Matrix44();
	Matrix44 aClass384_8407 = new Matrix44();
	float[] aFloatArray8477 = new float[16];
	boolean aBool8353 = true;
	int anInt8415;
	int anInt8478;
	int anInt8413;
	int anInt8412;
	int anInt8453;
	int anInt8416;
	float[] aFloatArray8424 = new float[4];
	float[] aFloatArray8425 = new float[4];
	float[] aFloatArray8426 = new float[4];
	float[] aFloatArray8427 = new float[4];
	float aFloat8429 = 1.0F;
	float aFloat8430 = 1.0F;
	float aFloat8431 = 1.0F;
	float aFloat8433 = -1.0f;
	float aFloat8434 = -1.0f;
	GLLight[] lights;
	int anInt8358;
	int anInt8378;
	float aFloat8446;
	float aFloat8355;
	boolean aBool8449;
	int anInt8455;
	int anInt8451;
	float largestAntialiasedPointSize;
	float smallestAntialiasedPointSize;
	MeshRasterizer_Sub1[] aMeshRasterizer_Sub1Array8479;
	MeshRasterizer_Sub1[] aMeshRasterizer_Sub1Array8492;
	Node_Sub35_Sub1 aNode_Sub35_Sub1_8499;
	int[] anIntArray8500;
	int[] anIntArray8501;
	int[] anIntArray8502;
	byte[] aByteArray8503;
	int anInt8475;
	OpenGL openGLInstance;
	int anInt8410;
	boolean supportsFBO;
	boolean aBool8487;
	boolean supportsFloatTextures;
	Class167 aClass167_8481;
	Class164 aClass164_8363;
	Class170 aClass170_8357;
	boolean supportsRectTextures;
	boolean aBool8362;
	boolean aBool8465;
	Node_Sub5_Sub1 aNode_Sub5_Sub1_8444;
	Class146 aClass146_8356;
	boolean supportsVBO;
	boolean supportsExtTex3d;
	NativeHeap aNativeHeap8445;
	Interface14 anInterface14_8496;
	OpenGlArrayBufferPointer aClass143_8494;
	OpenGlArrayBufferPointer aClass143_8495;
	int anInt8450;
	HDWaterTile aClass90_8423;
	boolean aBool8448;
	int anInt8417;
	int anInt8418;
	int anInt8419;
	int anInt8347;
	float aFloat8398;
	float aFloat8400;
	float aFloat8315;
	float aFloat8399;
	float aFloat8432;
	int anInt8371;
	int anInt8370;
	int anInt8372;
	int anInt8368;
	long aLong8316;
	int anInt8409;
	int anInt8382;
	int anInt8438;
	int anInt8439;
	float aFloat8402;
	float aFloat8406;
	Interface14 anInterface14_8483;
	boolean aBool8457;
	int anInt8454;
	int currActiveTexture;
	boolean aBool8422;
	boolean aBool8397;
	boolean aBool8388;
	int maxLightIndex;
	boolean aBool8440;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_8462;
	String vendor;
	String renderer;
	int version;
	int maxTextureUnits;
	int maxTextureCoords;
	int aluInstructions;
	boolean aBool8467;
	boolean supportsMultiSample;
	boolean supportsVertexPrograms;
	boolean supportsFragmentPrograms;
	boolean supportsVertexShaders;
	boolean supportsFragmentShaders;
	boolean supportsCubeMaps;

	boolean aBool8498;
	boolean supportsFBOBlit;
	boolean supportsFBOMultiSample;
	boolean supportsPostProcessing;
	boolean isMac;
	int maxActiveLightIndex;

	boolean depthTestEnabled;

	Class152_Sub1 aClass152_Sub1_8317;

	Interface15 anInterface15_8452;

	OpenGLRenderer(Canvas canvas_1, ImageLoader interface22_2, int i_3) {
		super(interface22_2);
		lights = new GLLight[anInt8421];
		anInt8441 = -1;
		anInt8358 = -1;
		anInt8378 = 0;
		aFloat8446 = 1.0F;
		aFloat8355 = 0.0F;
		aBool8449 = false;
		anInt8455 = 8448;
		anInt8451 = 8448;
		largestAntialiasedPointSize = -1.0f;
		smallestAntialiasedPointSize = -1.0f;
		aMeshRasterizer_Sub1Array8479 = new MeshRasterizer_Sub1[7];
		aMeshRasterizer_Sub1Array8492 = new MeshRasterizer_Sub1[7];
		aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1(8192);
		anIntArray8500 = new int[1];
		anIntArray8501 = new int[1];
		anIntArray8502 = new int[1];
		aByteArray8503 = new byte[16384];

		try {
			anInt8475 = i_3;
			if (!LibraryLoader.getLoader().loadLibrary("jaclib"))
				throw new RuntimeException("");
			if (!LibraryLoader.getLoader().loadLibrary("jaggl"))
				throw new RuntimeException("");
			else {
				openGLInstance = new OpenGL();
				long long_4 = openGLInstance.init(canvas_1, 8, 8, 8, 24, 0, anInt8475);
				if (long_4 == 0L)
					throw new RuntimeException("");
				else {
					method13571();
					int unsupportedFlags = getCapabilities();
					if (unsupportedFlags != 0) {
						System.err.println(this);
						System.err.println(unsupportedFlags);
						if ((unsupportedFlags & VENDOR_FLAG) != 0)
							System.err.println("Unsupported vendor: " + vendor);
						if ((unsupportedFlags & LOW_VERSION_FLAG) != 0)
							System.err.println("Unsupported version: " + version);
						if ((unsupportedFlags & WEIRD_VERSION_FLAG) != 0)
							System.err.println("Unsupported weird version: " + version);
						if ((unsupportedFlags & MULTITEXTURE_FLAG) != 0)
							System.err.println("Multitexture support required.");
						if ((unsupportedFlags & UNSUPPORTED_SHADER_INSTRUCTIONS) != 0)
							System.err.println("Shader instruction support required.");
						if ((unsupportedFlags & TEXTURE_ENV_COMBINE_FLAG) != 0)
							System.err.println("Texture env combine support required.");
						throw new RuntimeException("");
					} else {
						anInt8410 = aBool8467 ? 33639 : 5121;
						if (renderer.indexOf("radeon") != -1) {
							int i_7 = 0;
							boolean bool_8 = false;
							boolean bool_9 = false;
							String[] arr_10 = MovingAnimation.split(renderer.replace('/', ' '), ' ');

							for (String element : arr_10) {
								String string_12 = element;

								try {
									if (!string_12.isEmpty()) {
										if (string_12.charAt(0) == 120 && string_12.length() >= 3 && Class115.method1950(string_12.substring(1, 3))) {
											string_12 = string_12.substring(1);
											bool_9 = true;
										}

										if ("hd".equals(string_12))
											bool_8 = true;
										else {
											if (string_12.startsWith("hd")) {
												string_12 = string_12.substring(2);
												bool_8 = true;
											}

											if (string_12.length() >= 4 && Class115.method1950(string_12.substring(0, 4))) {
												i_7 = Utils.parseInt(string_12.substring(0, 4));
												break;
											}
										}
									}
								} catch (Exception ignored) {
								}
							}

							if (!bool_9 && !bool_8) {
								if (i_7 >= 7000 && i_7 <= 7999)
									supportsVBO = false;

								if (i_7 >= 7000 && i_7 <= 9250)
									supportsExtTex3d = false;
							}

							if (!bool_8 || i_7 < 4000)
								supportsFloatTextures = false;

							supportsRectTextures &= openGLInstance.supportsExtension("GL_ARB_half_float_pixel");
							aBool8362 = supportsVBO;
							aBool8465 = true;
						}

						if (vendor.indexOf("intel") != -1)
							supportsFBO = false;

						aBool8487 = !"s3 graphics".equals(vendor);
						if (supportsVBO)
							try {
								int[] ints_14 = new int[1];
								OpenGL.glGenBuffersARB(1, ints_14, 0);
							} catch (Throwable throwable_16) {
								throw new RuntimeException("");
							}

						SunDefinitions.method854(false, true);
						aBool8367 = true;
						aClass167_8481 = new Class167(this, textureCache);
						method13572();
						aClass164_8363 = new Class164(this);
						aClass170_8357 = new Class170(this);
						if (aClass170_8357.method2896()) {
							aNode_Sub5_Sub1_8444 = new Node_Sub5_Sub1(this);
							if (!aNode_Sub5_Sub1_8444.method15445()) {
								aNode_Sub5_Sub1_8444.method12120();
								aNode_Sub5_Sub1_8444 = null;
							}
						}

						method8411(canvas_1, new Class158_Sub2_Sub1(this, canvas_1, long_4));
						method8412(canvas_1);
						aClass146_8356 = new Class146(this);
						method13573();
						method8420();
					}
				}
			}
		} catch (Throwable throwable_18) {
			throwable_18.printStackTrace();
			method8396();
			if (throwable_18 instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable_18;
			throw new RuntimeException("");
		}
	}

	@Override
	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		if (aClass158_5853 == null)
			return null;
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, GL_BGRA, anInt8410, ints_5, i_3 * i_7);

		return ints_5;
	}

	void applyAmbientLightToModel() {
		LIGHT_PARAMS[0] = aFloat8432 * aFloat8429;
		LIGHT_PARAMS[1] = aFloat8432 * aFloat8430;
		LIGHT_PARAMS[2] = aFloat8432 * aFloat8431;
		LIGHT_PARAMS[3] = 1.0F;
		OpenGL.glLightModelfv(GL_LIGHT_MODEL_AMBIENT, LIGHT_PARAMS, 0);
	}

	@Override
	public void B(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3;
		float f_10 = f_8 + i_4;
		method13659();
		setColorRenderType(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_QUADS);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public void ba(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void c(int i_1, int i_2, int i_3) {
		if (anInt8441 != i_1 || i_2 != anInt8358 || i_3 != anInt8378) {
			anInt8441 = i_1;
			anInt8358 = i_2;
			anInt8378 = i_3;
			method13594();
			method13747();
		}

	}

	@Override
	void CA(int i_1, int i_2, int i_3, int i_4) {
		if (i_3 < 0)
			i_3 = -i_3;

		if (i_3 + i_1 >= anInt8413 && i_1 - i_3 <= anInt8412 && i_3 + i_2 >= anInt8415 && i_2 - i_3 <= anInt8478) {
			method13659();
			setColorRenderType(1);
			OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
			float f_6 = i_1 + 0.35F;
			float f_7 = i_2 + 0.35F;
			int i_8 = i_3 << 1;
			if (i_8 < smallestAntialiasedPointSize) {
				OpenGL.glBegin(GL_QUADS);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 + 1.0F);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 + 1.0F);
				OpenGL.glEnd();
			} else if (i_8 <= largestAntialiasedPointSize) {
				OpenGL.glEnable(GL_POINT_SMOOTH);
				OpenGL.glPointSize(i_8);
				OpenGL.glBegin(GL_POINTS);
				OpenGL.glVertex2f(f_6, f_7);
				OpenGL.glEnd();
				OpenGL.glDisable(GL_POINT_SMOOTH);
			} else {
				OpenGL.glBegin(GL_TRIANGLE_FAN);
				OpenGL.glVertex2f(f_6, f_7);
				int i_9 = 262144 / (i_3 * 6);
				if (i_9 <= 64)
					i_9 = 64;
				else if (i_9 > 512)
					i_9 = 512;

				i_9 = Class51.method1072(i_9);
				OpenGL.glVertex2f(f_6 + i_3, f_7);

				for (int i_10 = 16384 - i_9; i_10 > 0; i_10 -= i_9)
					OpenGL.glVertex2f(f_6 + Class142.aFloatArray1665[i_10] * i_3, f_7 + Class142.aFloatArray1666[i_10] * i_3);

				OpenGL.glVertex2f(f_6 + i_3, f_7);
				OpenGL.glEnd();
			}
		}

	}

	Interface14 createArrayBuffer(int i_1, Buffer buffer_2, int i_3) {
		return !supportsVBO ? new Class131_Sub1(this, i_1, buffer_2) : new Class135_Sub2(this, i_1, buffer_2, i_3);
	}

	@Override
	public FontRenderer createFont(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		return new FontRenderer_Sub5(this, fontmetrics_1, arr_2, bool_3);
	}

	@Override
	public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
		return new OpenGLGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, 512);
	}

	@Override
	public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	@Override
	public void DA(Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		setColorRenderType(1);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (-16777216 >> 16), (byte) (-16777216 >> 8), (byte) -16777216, (byte) (-16777216 >> 24));
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8415);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8415);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public int dd() {
		return anInt8371 + anInt8370 + anInt8372;
	}

	@Override
	public int df() {
		return anInt8371 + anInt8370 + anInt8372;
	}

	@Override
	public int di() {
		return anInt8371 + anInt8370 + anInt8372;
	}

	@Override
	public int dv() {
		return anInt8371 + anInt8370 + anInt8372;
	}

	@Override
	public void eh() {
		if (aClass158_5853 != null) {
			anInt8413 = 0;
			anInt8415 = 0;
			anInt8412 = aClass158_5853.getWidth();
			anInt8478 = aClass158_5853.getHeight();
			OpenGL.glDisable(GL_SCISSOR_TEST);
		}

	}

	@Override
	public void ej(float f_1, float f_2) {
		aFloat8364 = f_1;
		aFloat8320 = f_2;
		method13671();
	}

	@Override
	public void en(float f_1, float f_2) {
		aFloat8364 = f_1;
		aFloat8320 = f_2;
		method13671();
	}

	void enableDepthTest(boolean enable) {
		if (depthTestEnabled != enable) {
			if (enable)
				OpenGL.glEnable(GL_DEPTH_TEST);
			else
				OpenGL.glDisable(GL_DEPTH_TEST);

			depthTestEnabled = enable;
			anInt8382 &= -16;
		}

	}

	@Override
	public void eq(boolean bool_1) {
		aBool8353 = bool_1;
		method13579();
	}

	@Override
	public void ez() {
		if (aClass158_5853 != null) {
			anInt8413 = 0;
			anInt8415 = 0;
			anInt8412 = aClass158_5853.getWidth();
			anInt8478 = aClass158_5853.getHeight();
			OpenGL.glDisable(GL_SCISSOR_TEST);
		}

	}

	@Override
	public void fb(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3;
		float f_10 = f_8 + i_4;
		method13659();
		setColorRenderType(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_QUADS);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public void fc(int i_1, int i_2, int i_3, int i_4) {
		int i_11 = i_1;
		int i_31 = i_3;
		int i_21 = i_2;
		int i_41 = i_4;
		if (aClass158_5853 != null) {
			if (i_11 < 0)
				i_11 = 0;

			if (i_31 > aClass158_5853.getWidth())
				i_31 = aClass158_5853.getWidth();

			if (i_21 < 0)
				i_21 = 0;

			if (i_41 > aClass158_5853.getHeight())
				i_41 = aClass158_5853.getHeight();

			anInt8413 = i_11;
			anInt8415 = i_21;
			anInt8412 = i_31;
			anInt8478 = i_41;
			OpenGL.glEnable(GL_SCISSOR_TEST);
			method13570();
		}

	}

	@Override
	public void fd(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void fe(int i_1, int i_2, int i_3, int i_4) {
		if (anInt8413 < i_1)
			anInt8413 = i_1;

		if (anInt8412 > i_3)
			anInt8412 = i_3;

		if (anInt8415 < i_2)
			anInt8415 = i_2;

		if (anInt8478 > i_4)
			anInt8478 = i_4;

		OpenGL.glEnable(GL_SCISSOR_TEST);
		method13570();
	}

	@Override
	public void ff(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		float f_10;
		float f_11;
		if (aClass137_Sub1_Sub1_8462 != null && aClass137_Sub1_Sub1_8462.anInt9087 >= i_3 && aClass137_Sub1_Sub1_8462.anInt9086 >= i_4) {
			aClass137_Sub1_Sub1_8462.method14455(0, i_3, i_4, bytes_7, Class150.aClass150_1951, 0, false);
			f_10 = aClass137_Sub1_Sub1_8462.aFloat10134 * i_4 / aClass137_Sub1_Sub1_8462.anInt9086;
			f_11 = aClass137_Sub1_Sub1_8462.aFloat10132 * i_3 / aClass137_Sub1_Sub1_8462.anInt9087;
		} else {
			aClass137_Sub1_Sub1_8462 = Class137_Sub1_Sub1.method15540(this, Class150.aClass150_1951, Class76.aClass76_751, i_3, i_4, bytes_7, Class150.aClass150_1951);
			aClass137_Sub1_Sub1_8462.method14445(false, false);
			f_10 = aClass137_Sub1_Sub1_8462.aFloat10134;
			f_11 = aClass137_Sub1_Sub1_8462.aFloat10132;
		}

		method13637();
		setTexture(aClass137_Sub1_Sub1_8462);
		setColorRenderType(i_9);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		method13617(i_6);
		method13717(GL_INTERPOLATE, GL_INTERPOLATE);
		method13595(0, GL_CONSTANT, GL_SRC_COLOR);
		method13595(2, GL_TEXTURE, GL_SRC_ALPHA);
		method13616(0, GL_CONSTANT);
		method13616(2, GL_TEXTURE);
		float f_12 = i_1;
		float f_13 = i_2;
		float f_14 = f_12 + i_3;
		float f_15 = f_13 + i_4;
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glTexCoord2f(0.0F, f_11);
		OpenGL.glVertex2f(f_12, f_15);
		OpenGL.glTexCoord2f(f_10, f_11);
		OpenGL.glVertex2f(f_14, f_15);
		OpenGL.glTexCoord2f(f_10, 0.0F);
		OpenGL.glVertex2f(f_14, f_13);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
		method13595(2, GL_CONSTANT, GL_SRC_ALPHA);
		method13616(0, GL_TEXTURE);
		method13616(2, GL_CONSTANT);
	}

	@Override
	public void fh(int[] ints_1) {
		ints_1[0] = anInt8413;
		ints_1[1] = anInt8415;
		ints_1[2] = anInt8412;
		ints_1[3] = anInt8478;
	}

	@Override
	public void fi(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void fk(int i_1, int i_2, int i_3, int i_4) {
		if (anInt8413 < i_1)
			anInt8413 = i_1;

		if (anInt8412 > i_3)
			anInt8412 = i_3;

		if (anInt8415 < i_2)
			anInt8415 = i_2;

		if (anInt8478 > i_4)
			anInt8478 = i_4;

		OpenGL.glEnable(GL_SCISSOR_TEST);
		method13570();
	}

	@Override
	public void fl(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method13659();
		setColorRenderType(i_5);
		float f_6 = i_1 + 0.35F;
		float f_7 = i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6, f_7 + i_3);
		OpenGL.glEnd();
	}

	@Override
	public void fm(int i_1, int i_2, int i_3, int i_4) {
		int i_11 = i_1;
		int i_31 = i_3;
		int i_21 = i_2;
		int i_41 = i_4;
		if (aClass158_5853 != null) {
			if (i_11 < 0)
				i_11 = 0;

			if (i_31 > aClass158_5853.getWidth())
				i_31 = aClass158_5853.getWidth();

			if (i_21 < 0)
				i_21 = 0;

			if (i_41 > aClass158_5853.getHeight())
				i_41 = aClass158_5853.getHeight();

			anInt8413 = i_11;
			anInt8415 = i_21;
			anInt8412 = i_31;
			anInt8478 = i_41;
			OpenGL.glEnable(GL_SCISSOR_TEST);
			method13570();
		}

	}

	@Override
	public void fo(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method13659();
		setColorRenderType(i_5);
		float f_6 = i_1 + 0.35F;
		float f_7 = i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6, f_7 + i_3);
		OpenGL.glEnd();
	}

	@Override
	public void fp(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3;
		float f_10 = f_8 + i_4;
		method13659();
		setColorRenderType(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_QUADS);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public void fq(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method13659();
		setColorRenderType(i_5);
		float f_6 = i_1 + 0.35F;
		float f_7 = i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6 + i_3, f_7);
		OpenGL.glEnd();
	}

	@Override
	void fr(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_3 < 0)
			i_3 = -i_3;

		if (i_1 + i_3 >= anInt8413 && i_1 - i_3 <= anInt8412 && i_2 + i_3 >= anInt8415 && i_2 - i_3 <= anInt8478) {
			method13659();
			setColorRenderType(i_5);
			OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
			float f_6 = i_1 + 0.35F;
			float f_7 = i_2 + 0.35F;
			int i_8 = i_3 << 1;
			if (i_8 < smallestAntialiasedPointSize) {
				OpenGL.glBegin(GL_QUADS);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 + 1.0F);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 + 1.0F);
				OpenGL.glEnd();
			} else if (i_8 <= largestAntialiasedPointSize) {
				OpenGL.glEnable(GL_POINT_SMOOTH);
				OpenGL.glPointSize(i_8);
				OpenGL.glBegin(GL_POINTS);
				OpenGL.glVertex2f(f_6, f_7);
				OpenGL.glEnd();
				OpenGL.glDisable(GL_POINT_SMOOTH);
			} else {
				OpenGL.glBegin(GL_TRIANGLE_FAN);
				OpenGL.glVertex2f(f_6, f_7);
				int i_9 = 262144 / (6 * i_3);
				if (i_9 <= 64)
					i_9 = 64;
				else if (i_9 > 512)
					i_9 = 512;

				i_9 = Class51.method1072(i_9);
				OpenGL.glVertex2f(f_6 + i_3, f_7);

				for (int i_10 = 16384 - i_9; i_10 > 0; i_10 -= i_9)
					OpenGL.glVertex2f(f_6 + Class142.aFloatArray1665[i_10] * i_3, f_7 + Class142.aFloatArray1666[i_10] * i_3);

				OpenGL.glVertex2f(f_6 + i_3, f_7);
				OpenGL.glEnd();
			}
		}

	}

	@Override
	public void fs(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method13659();
		setColorRenderType(i_5);
		float f_6 = i_1 + 0.35F;
		float f_7 = i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6 + i_3, f_7);
		OpenGL.glEnd();
	}

	@Override
	public void ft(int[] ints_1) {
		ints_1[0] = anInt8413;
		ints_1[1] = anInt8415;
		ints_1[2] = anInt8412;
		ints_1[3] = anInt8478;
	}

	@Override
	public void fu(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((i_2 & 0xff0000) / 1.671168E7F, (i_2 & 0xff00) / 65280.0F, (i_2 & 0xff) / 255.0F, (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0)
			i_3 |= 0x400;

		OpenGL.glClear(i_3);
	}

	@Override
	public void fv(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		float f_10;
		float f_11;
		if (aClass137_Sub1_Sub1_8462 != null && aClass137_Sub1_Sub1_8462.anInt9087 >= i_3 && aClass137_Sub1_Sub1_8462.anInt9086 >= i_4) {
			aClass137_Sub1_Sub1_8462.method14455(0, i_3, i_4, bytes_7, Class150.aClass150_1951, 0, false);
			f_10 = aClass137_Sub1_Sub1_8462.aFloat10134 * i_4 / aClass137_Sub1_Sub1_8462.anInt9086;
			f_11 = aClass137_Sub1_Sub1_8462.aFloat10132 * i_3 / aClass137_Sub1_Sub1_8462.anInt9087;
		} else {
			aClass137_Sub1_Sub1_8462 = Class137_Sub1_Sub1.method15540(this, Class150.aClass150_1951, Class76.aClass76_751, i_3, i_4, bytes_7, Class150.aClass150_1951);
			aClass137_Sub1_Sub1_8462.method14445(false, false);
			f_10 = aClass137_Sub1_Sub1_8462.aFloat10134;
			f_11 = aClass137_Sub1_Sub1_8462.aFloat10132;
		}

		method13637();
		setTexture(aClass137_Sub1_Sub1_8462);
		setColorRenderType(i_9);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		method13617(i_6);
		method13717(GL_INTERPOLATE, GL_INTERPOLATE);
		method13595(0, GL_CONSTANT, GL_SRC_COLOR);
		method13595(2, GL_TEXTURE, GL_SRC_ALPHA);
		method13616(0, GL_CONSTANT);
		method13616(2, GL_TEXTURE);
		float f_12 = i_1;
		float f_13 = i_2;
		float f_14 = f_12 + i_3;
		float f_15 = f_13 + i_4;
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glTexCoord2f(0.0F, f_11);
		OpenGL.glVertex2f(f_12, f_15);
		OpenGL.glTexCoord2f(f_10, f_11);
		OpenGL.glVertex2f(f_14, f_15);
		OpenGL.glTexCoord2f(f_10, 0.0F);
		OpenGL.glVertex2f(f_14, f_13);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
		method13595(2, GL_CONSTANT, GL_SRC_ALPHA);
		method13616(0, GL_TEXTURE);
		method13616(2, GL_CONSTANT);
	}

	@Override
	void fw(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_3 < 0)
			i_3 = -i_3;

		if (i_1 + i_3 >= anInt8413 && i_1 - i_3 <= anInt8412 && i_2 + i_3 >= anInt8415 && i_2 - i_3 <= anInt8478) {
			method13659();
			setColorRenderType(i_5);
			OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
			float f_6 = i_1 + 0.35F;
			float f_7 = i_2 + 0.35F;
			int i_8 = i_3 << 1;
			if (i_8 < smallestAntialiasedPointSize) {
				OpenGL.glBegin(GL_QUADS);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 + 1.0F);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 + 1.0F);
				OpenGL.glEnd();
			} else if (i_8 <= largestAntialiasedPointSize) {
				OpenGL.glEnable(GL_POINT_SMOOTH);
				OpenGL.glPointSize(i_8);
				OpenGL.glBegin(GL_POINTS);
				OpenGL.glVertex2f(f_6, f_7);
				OpenGL.glEnd();
				OpenGL.glDisable(GL_POINT_SMOOTH);
			} else {
				OpenGL.glBegin(GL_TRIANGLE_FAN);
				OpenGL.glVertex2f(f_6, f_7);
				int i_9 = 262144 / (6 * i_3);
				if (i_9 <= 64)
					i_9 = 64;
				else if (i_9 > 512)
					i_9 = 512;

				i_9 = Class51.method1072(i_9);
				OpenGL.glVertex2f(f_6 + i_3, f_7);

				for (int i_10 = 16384 - i_9; i_10 > 0; i_10 -= i_9)
					OpenGL.glVertex2f(f_6 + Class142.aFloatArray1665[i_10] * i_3, f_7 + Class142.aFloatArray1666[i_10] * i_3);

				OpenGL.glVertex2f(f_6 + i_3, f_7);
				OpenGL.glEnd();
			}
		}

	}

	@Override
	public void G(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method13659();
		setColorRenderType(i_5);
		float f_6 = i_1 + 0.35F;
		float f_7 = i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6, f_7 + i_3);
		OpenGL.glEnd();
	}

	@Override
	public void GA() {
		aFloat8364 = (float) 0.0;
		aFloat8320 = (float) 1.0;
		method13671();
	}

	int getCapabilities() {
		int doesntSupportFlags = 0;
		vendor = OpenGL.glGetString(GL_VENDOR).toLowerCase();
		renderer = OpenGL.glGetString(GL_RENDERER).toLowerCase();
		if (vendor.indexOf("microsoft") != -1)
			doesntSupportFlags |= VENDOR_FLAG;

		if (vendor.indexOf("brian paul") != -1)
			doesntSupportFlags |= VENDOR_FLAG;

		String versionStr = OpenGL.glGetString(GL_VERSION);
		String[] versionSplit = MovingAnimation.split(versionStr.replace('.', ' '), ' ');
		if (versionSplit.length >= 2)
			try {
				int major = Utils.parseInt(versionSplit[0]);
				int minor = Utils.parseInt(versionSplit[1]);
				version = major * 10 + minor;
			} catch (NumberFormatException numberformatexception_7) {
				doesntSupportFlags |= WEIRD_VERSION_FLAG;
			}
		else
			doesntSupportFlags |= WEIRD_VERSION_FLAG;

		if (version < 12)
			doesntSupportFlags |= LOW_VERSION_FLAG;

		if (!openGLInstance.supportsExtension("GL_ARB_multitexture"))
			doesntSupportFlags |= MULTITEXTURE_FLAG;

		if (!openGLInstance.supportsExtension("GL_ARB_texture_env_combine"))
			doesntSupportFlags |= TEXTURE_ENV_COMBINE_FLAG;

		int[] returnVal = new int[1];
		OpenGL.glGetIntegerv(GL_MAX_TEXTURE_UNITS, returnVal, 0);
		maxTextureUnits = returnVal[0];
		OpenGL.glGetIntegerv(GL_MAX_TEXTURE_COORDS_ARB, returnVal, 0);
		maxTextureCoords = returnVal[0];
		OpenGL.glGetIntegerv(GL_PROGRAM_ALU_INSTRUCTIONS_ARB, returnVal, 0);
		aluInstructions = returnVal[0];
		if (maxTextureUnits < 2 || maxTextureCoords < 2 || aluInstructions < 2)
			doesntSupportFlags |= UNSUPPORTED_SHADER_INSTRUCTIONS;

		aBool8467 = Stream.method2926();
		supportsVBO = openGLInstance.supportsExtension("GL_ARB_vertex_buffer_object");
		supportsMultiSample = openGLInstance.supportsExtension("GL_ARB_multisample");
		supportsVertexPrograms = openGLInstance.supportsExtension("GL_ARB_vertex_program");
		supportsFragmentPrograms = openGLInstance.supportsExtension("GL_ARB_fragment_program");
		supportsVertexShaders = openGLInstance.supportsExtension("GL_ARB_vertex_shader");
		supportsFragmentShaders = openGLInstance.supportsExtension("GL_ARB_fragment_shader");
		supportsExtTex3d = openGLInstance.supportsExtension("GL_EXT_texture3D");
		supportsRectTextures = openGLInstance.supportsExtension("GL_ARB_texture_rectangle");
		supportsCubeMaps = openGLInstance.supportsExtension("GL_ARB_texture_cube_map");
		supportsFloatTextures = openGLInstance.supportsExtension("GL_ARB_texture_float");
		aBool8498 = false;
		supportsFBO = openGLInstance.supportsExtension("GL_EXT_framebuffer_object");
		supportsFBOBlit = openGLInstance.supportsExtension("GL_EXT_framebuffer_blit");
		supportsFBOMultiSample = openGLInstance.supportsExtension("GL_EXT_framebuffer_multisample");
		supportsPostProcessing = supportsFBOBlit & supportsFBOMultiSample;
		isMac = Class396.OS_NAME.startsWith("mac");
		OpenGL.glGetFloatv(GL_POINT_SIZE_RANGE, LIGHT_PARAMS, 0);
		smallestAntialiasedPointSize = LIGHT_PARAMS[0];
		largestAntialiasedPointSize = LIGHT_PARAMS[1];
		return doesntSupportFlags;
	}

	@Override
	public void hi(int i_1, Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		setColorRenderType(1);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (i_1 >> 16), (byte) (i_1 >> 8), (byte) i_1, (byte) (i_1 >> 24));
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8415);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8415);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void hr(int i_1, Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		setColorRenderType(1);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (i_1 >> 16), (byte) (i_1 >> 8), (byte) i_1, (byte) (i_1 >> 24));
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8415);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8415);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void hz(int i_1, Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		setColorRenderType(1);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (i_1 >> 16), (byte) (i_1 >> 8), (byte) i_1, (byte) (i_1 >> 24));
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8415);
		OpenGL.glTexCoord2f(f_7 * (anInt8413 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8413, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8478 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8478);
		OpenGL.glTexCoord2f(f_7 * (anInt8412 - i_3), f_8 * (anInt8415 - i_4));
		OpenGL.glVertex2i(anInt8412, anInt8415);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void IA(float f_1) {
		if (aFloat8432 != f_1) {
			aFloat8432 = f_1;
			applyAmbientLightToModel();
		}

	}

	@Override
	public void ib(int i_1, int i_2, int i_3) {
		if (anInt8441 != i_1 || anInt8358 != i_2 || anInt8378 != i_3) {
			anInt8441 = i_1;
			anInt8358 = i_2;
			anInt8378 = i_3;
			method13594();
			method13747();
		}

	}

	@Override
	public void ii(int i_1) {
		for (anInt8473 = 0; i_1 > 1; i_1 >>= 1)
			anInt8473 = (anInt8473 * -1431655765 * 3 * -1431655765 * 3 + 1) * -1431655765 * 3 * -1431655765 * 3;

		anInt8466 = 1 << anInt8473 * -1431655765 * 3 * -1431655765 * 3;
	}

	@Override
	public void ik(int i_1, int i_2, int i_3) {
		if (anInt8441 != i_1 || anInt8358 != i_2 || anInt8378 != i_3) {
			anInt8441 = i_1;
			anInt8358 = i_2;
			anInt8378 = i_3;
			method13594();
			method13747();
		}

	}

	@Override
	public void il(int i_1) {
		for (anInt8473 = 0; i_1 > 1; i_1 >>= 1)
			anInt8473 = (anInt8473 * -1431655765 * 3 * -1431655765 * 3 + 1) * -1431655765 * 3 * -1431655765 * 3;

		anInt8466 = 1 << anInt8473 * -1431655765 * 3 * -1431655765 * 3;
	}

	@Override
	public void im(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = anInt8428 != i_1;
		if (bool_7 || aFloat8433 != f_2 || aFloat8434 != f_3) {
			anInt8428 = i_1;
			aFloat8433 = f_2;
			aFloat8434 = f_3;
			if (bool_7) {
				aFloat8429 = (anInt8428 & 0xff0000) / 1.671168E7F;
				aFloat8430 = (anInt8428 & 0xff00) / 65280.0F;
				aFloat8431 = (anInt8428 & 0xff) / 255.0F;
				applyAmbientLightToModel();
			}

			setLightDiffusion();
		}

		if (aFloatArray8424[0] != f_4 || aFloatArray8424[1] != f_5 || aFloatArray8424[2] != f_6) {
			aFloatArray8424[0] = f_4;
			aFloatArray8424[1] = f_5;
			aFloatArray8424[2] = f_6;
			aFloatArray8425[0] = -f_4;
			aFloatArray8425[1] = -f_5;
			aFloatArray8425[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt(f_4 * f_4 + f_5 * f_5 + f_6 * f_6));
			aFloatArray8426[0] = f_4 * f_8;
			aFloatArray8426[1] = f_5 * f_8;
			aFloatArray8426[2] = f_6 * f_8;
			aFloatArray8427[0] = -aFloatArray8426[0];
			aFloatArray8427[1] = -aFloatArray8426[1];
			aFloatArray8427[2] = -aFloatArray8426[2];
			positionLights();
			anInt8438 = (int) (f_4 * 256.0F / f_5);
			anInt8439 = (int) (f_6 * 256.0F / f_5);
		}

	}

	@Override
	public void in(float f_1) {
		if (aFloat8432 != f_1) {
			aFloat8432 = f_1;
			applyAmbientLightToModel();
		}

	}

	@Override
	public void iq(int i_1) {
		for (anInt8473 = 0; i_1 > 1; i_1 >>= 1)
			anInt8473 = (anInt8473 * -1431655765 * 3 * -1431655765 * 3 + 1) * -1431655765 * 3 * -1431655765 * 3;

		anInt8466 = 1 << anInt8473 * -1431655765 * 3 * -1431655765 * 3;
	}

	@Override
	public void is(int i_1, int i_2, int i_3) {
		if (anInt8441 != i_1 || anInt8358 != i_2 || anInt8378 != i_3) {
			anInt8441 = i_1;
			anInt8358 = i_2;
			anInt8378 = i_3;
			method13594();
			method13747();
		}

	}

	@Override
	public void iw(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = anInt8428 != i_1;
		if (bool_7 || aFloat8433 != f_2 || aFloat8434 != f_3) {
			anInt8428 = i_1;
			aFloat8433 = f_2;
			aFloat8434 = f_3;
			if (bool_7) {
				aFloat8429 = (anInt8428 & 0xff0000) / 1.671168E7F;
				aFloat8430 = (anInt8428 & 0xff00) / 65280.0F;
				aFloat8431 = (anInt8428 & 0xff) / 255.0F;
				applyAmbientLightToModel();
			}

			setLightDiffusion();
		}

		if (aFloatArray8424[0] != f_4 || aFloatArray8424[1] != f_5 || aFloatArray8424[2] != f_6) {
			aFloatArray8424[0] = f_4;
			aFloatArray8424[1] = f_5;
			aFloatArray8424[2] = f_6;
			aFloatArray8425[0] = -f_4;
			aFloatArray8425[1] = -f_5;
			aFloatArray8425[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt(f_4 * f_4 + f_5 * f_5 + f_6 * f_6));
			aFloatArray8426[0] = f_4 * f_8;
			aFloatArray8426[1] = f_5 * f_8;
			aFloatArray8426[2] = f_6 * f_8;
			aFloatArray8427[0] = -aFloatArray8426[0];
			aFloatArray8427[1] = -aFloatArray8426[1];
			aFloatArray8427[2] = -aFloatArray8426[2];
			positionLights();
			anInt8438 = (int) (f_4 * 256.0F / f_5);
			anInt8439 = (int) (f_6 * 256.0F / f_5);
		}

	}

	@Override
	public void iz(float f_1) {
		if (aFloat8432 != f_1) {
			aFloat8432 = f_1;
			applyAmbientLightToModel();
		}

	}

	@Override
	public void J() {
		int meme = 32;
		for (anInt8473 = 0; meme > 1; meme >>= 1)
			++anInt8473;

		anInt8466 = 1 << anInt8473;
	}

	@Override
	public void jf() {
		aBool8448 = false;
	}

	@Override
	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		if (aClass158_5853 == null)
			return null;
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, GL_BGRA, anInt8410 * GL_UNSIGNED_INT_8_8_8_8_REV, ints_5, i_7 * i_3);

		return ints_5;
	}

	@Override
	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		if (aClass158_5853 == null)
			return null;
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, GL_BGRA, anInt8410 * GL_UNSIGNED_INT_8_8_8_8_REV, ints_5, i_7 * i_3);

		return ints_5;
	}

	@Override
	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		if (aClass158_5853 == null)
			return null;
		int[] ints_5 = new int[i_3 * i_4];
		int i_6 = aClass158_5853.getHeight();

		for (int i_7 = 0; i_7 < i_4; i_7++)
			OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, GL_BGRA, anInt8410 * GL_UNSIGNED_INT_8_8_8_8_REV, ints_5, i_7 * i_3);

		return ints_5;
	}

	@Override
	public void L() {
		if (aClass158_5853 != null) {
			anInt8413 = 0;
			anInt8415 = 0;
			anInt8412 = aClass158_5853.getWidth();
			anInt8478 = aClass158_5853.getHeight();
			OpenGL.glDisable(GL_SCISSOR_TEST);
		}

	}

	@Override
	public void m(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = anInt8428 != i_1;
		if (bool_7 || aFloat8433 != f_2 || aFloat8434 != f_3) {
			anInt8428 = i_1;
			aFloat8433 = f_2;
			aFloat8434 = f_3;
			if (bool_7) {
				aFloat8429 = (anInt8428 & 0xff0000) / 1.671168E7F;
				aFloat8430 = (anInt8428 & 0xff00) / 65280.0F;
				aFloat8431 = (anInt8428 & 0xff) / 255.0F;
				applyAmbientLightToModel();
			}

			setLightDiffusion();
		}

		if (aFloatArray8424[0] != f_4 || aFloatArray8424[1] != f_5 || aFloatArray8424[2] != f_6) {
			aFloatArray8424[0] = f_4;
			aFloatArray8424[1] = f_5;
			aFloatArray8424[2] = f_6;
			aFloatArray8425[0] = -f_4;
			aFloatArray8425[1] = -f_5;
			aFloatArray8425[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt(f_4 * f_4 + f_5 * f_5 + f_6 * f_6));
			aFloatArray8426[0] = f_4 * f_8;
			aFloatArray8426[1] = f_5 * f_8;
			aFloatArray8426[2] = f_6 * f_8;
			aFloatArray8427[0] = -aFloatArray8426[0];
			aFloatArray8427[1] = -aFloatArray8426[1];
			aFloatArray8427[2] = -aFloatArray8426[2];
			positionLights();
			anInt8438 = (int) (f_4 * 256.0F / f_5);
			anInt8439 = (int) (f_6 * 256.0F / f_5);
		}

	}

	void method13570() {
		if (aClass158_5853 != null && anInt8413 < anInt8412 && anInt8415 < anInt8478)
			OpenGL.glScissor(anInt8453 + anInt8413, anInt8416 + aClass158_5853.getHeight() - anInt8478, anInt8412 - anInt8413, anInt8478 - anInt8415);
		else
			OpenGL.glScissor(0, 0, 0, 0);

	}

	void method13571() {
		int i_1 = 0;

		while (!openGLInstance.method2570()) {
			if (i_1++ > 5)
				throw new RuntimeException("");

			Class89.sleep(1000L);
		}

	}

	void method13572() {
		textures = new GLTexture[maxTextureUnits];
		aClass137_Sub1_8460 = new Class137_Sub1(this, GL_TEXTURE_2D, Class150.aClass150_1949, Class76.aClass76_751, 1, 1);
		new Class137_Sub1(this, GL_TEXTURE_2D, Class150.aClass150_1949, Class76.aClass76_751, 1, 1);
		new Class137_Sub1(this, GL_TEXTURE_2D, Class150.aClass150_1949, Class76.aClass76_751, 1, 1);

		for (int i_1 = 0; i_1 < 7; i_1++) {
			aMeshRasterizer_Sub1Array8479[i_1] = new MeshRasterizer_Sub1(this);
			aMeshRasterizer_Sub1Array8492[i_1] = new MeshRasterizer_Sub1(this);
		}

		if (supportsFBO) {
			fbo = new FrameBufferObject(this);
			new FrameBufferObject(this);
		}

	}

	void method13573() {
		method13581(-2);

		for (int texId = maxTextureUnits - 1; texId >= 0; --texId) {
			setActiveTexture(texId);
			setTexture(null);
			OpenGL.glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_COMBINE);
		}

		method13717(GL_MODULATE, GL_MODULATE);
		method13595(2, GL_PREVIOUS, GL_SRC_ALPHA);
		setTextureModelView();
		colorRenderType = 1;
		OpenGL.glEnable(GL_BLEND);
		OpenGL.glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
		blendType = 1;
		OpenGL.glEnable(GL_ALPHA_TEST);
		OpenGL.glAlphaFunc(GL_GREATER, 0.0F);
		enableAlphaTest = true;
		OpenGL.glColorMask(true, true, true, true);
		maskRgb = true;
		method13642(true);
		method13620(true);
		enableDepthTest(true);
		method13623(true);
		GA();
		method13586();
		openGLInstance.setSwapInterval(0);
		OpenGL.glShadeModel(GL_SMOOTH);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(GL_LEQUAL);
		OpenGL.glPolygonMode(GL_FRONT, GL_FILL);
		OpenGL.glEnable(GL_CULL_FACE);
		OpenGL.glCullFace(GL_BACK);
		OpenGL.glMatrixMode(GL_MODELVIEW);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(GL_FRONT, GL_AMBIENT_AND_DIFFUSE);
		OpenGL.glEnable(GL_COLOR_MATERIAL);
		float[] floats_4 = {0.0F, 0.0F, 0.0F, 1.0F};

		for (int i_2 = 0; i_2 < 8; i_2++) {
			int i_3 = i_2 + GL_LIGHT0;
			OpenGL.glLightfv(i_3, GL_AMBIENT, floats_4, 0);
			OpenGL.glLightf(i_3, GL_CONSTANT_ATTENUATION, 0.0F);
			OpenGL.glLightf(i_3, GL_LINEAR_ATTENUATION, 0.0F);
		}

		OpenGL.glEnable(GL_LIGHT0);
		OpenGL.glEnable(GL_LIGHT1);
		OpenGL.glFogf(GL_FOG_DENSITY, 0.95F);
		OpenGL.glFogi(GL_FOG_MODE, GL_LINEAR);
		OpenGL.glHint(GL_FOG_HINT, GL_FASTEST);
		anInt8441 = -1;
		anInt8428 = -1;
		method8421();
		L();
	}

	void method13578() {
		method13639();
	}

	void method13579() {
		OpenGL.glDepthMask(aBool8388 && aBool8353);
	}

	void method13581(int i_1) {
		method13608(i_1, true);
	}

	void method13584() {
		if (aClass158_5853 != null) {
			int i_1;
			int i_2;
			int i_3;
			int i_4;
			if (anInt8409 == 2) {
				i_1 = anInt8417;
				i_2 = anInt8418;
				i_3 = anInt8419;
				i_4 = anInt8347;
			} else {
				i_1 = 0;
				i_2 = 0;
				i_3 = aClass158_5853.getWidth();
				i_4 = aClass158_5853.getHeight();
			}

			if (i_3 < 1)
				i_3 = 1;

			if (i_4 < 1)
				i_4 = 1;

			OpenGL.glViewport(i_1 + anInt8453, anInt8416 + aClass158_5853.getHeight() - i_2 - i_4, i_3, i_4);
			aFloat8398 = anInt8419 / 2.0F;
			aFloat8400 = anInt8347 / 2.0F;
			aFloat8315 = anInt8417 + aFloat8398;
			aFloat8399 = anInt8418 + aFloat8400;
		}

	}

	void method13585(Matrix44 matrix44_1) {
		OpenGL.glLoadMatrixf(matrix44_1.buf, 0);
	}

	void method13586() {
		if (anInt8409 != 0) {
			anInt8409 = 0;
			method13584();
			method13671();
			anInt8382 &= -16;
		}

	}

	void method13587() {
		if (anInt8409 != 1) {
			anInt8409 = 1;
			method13588();
			method13584();
			method13671();
			OpenGL.glMatrixMode(GL_MODELVIEW);
			OpenGL.glLoadIdentity();
			anInt8382 &= -9;
		}

	}

	void method13588() {
		aFloat8404 = aClass384_8442.method6587();
		aFloat8403 = aClass384_8442.method6533();
		method13594();
		if (anInt8409 == 2)
			method13719(aClass384_8442.buf);
		else if (anInt8409 == 1)
			method13719(aClass384_8385.buf);

	}

	void method13591(float f_1, float f_2) {
		aFloat8446 = f_1;
		aFloat8355 = f_2;
		method13594();
	}

	void method13594() {
		aFloat8402 = aFloat8404 - anInt8378 - aFloat8355;
		aFloat8406 = aFloat8402 - anInt8358 * aFloat8446;
		if (aFloat8406 < aFloat8403)
			aFloat8406 = aFloat8403;

		OpenGL.glFogf(GL_FOG_START, aFloat8406);
		OpenGL.glFogf(GL_FOG_END, aFloat8402);
		LIGHT_PARAMS[0] = (anInt8441 & 0xff0000) / 1.671168E7F;
		LIGHT_PARAMS[1] = (anInt8441 & 0xff00) / 65280.0F;
		LIGHT_PARAMS[2] = (anInt8441 & 0xff) / 255.0F;
		OpenGL.glFogfv(GL_FOG_COLOR, LIGHT_PARAMS, 0);
	}

	void method13595(int i_1, int i_2, int i_3) {
		OpenGL.glTexEnvi(GL_TEXTURE_ENV, i_1 + GL_SRC0_RGB, i_2);
		OpenGL.glTexEnvi(GL_TEXTURE_ENV, i_1 + GL_OPERAND0_RGB, i_3);
	}

	Class137_Sub2 method13596() {
		return aClass152_Sub1_8317 != null ? aClass152_Sub1_8317.method13519() : null;
	}

	void method13597() {
		aClass384_8394.copy(aClass384_8348);
		aClass384_8394.multiply(aClass384_8442);
		aClass384_8394.method6539(aFloatArrayArray8395[0]);
		aClass384_8394.method6540(aFloatArrayArray8395[1]);
		aClass384_8394.method6535(aFloatArrayArray8395[2]);
		aClass384_8394.method6536(aFloatArrayArray8395[3]);
		aClass384_8394.method6613(aFloatArrayArray8395[4]);
		aClass384_8394.method6538(aFloatArrayArray8395[5]);
	}

	Interface15 method13598(byte[] bytes_2, int i_3, boolean bool_4) {
		return !supportsVBO || bool_4 && !aBool8362 ? new Class131_Sub2(this, bytes_2, i_3) : new Class135_Sub1(this, bytes_2, i_3, bool_4);
	}

	Interface14 method13599(int i_1, byte[] bytes_2, int i_3, boolean bool_4) {
		return !supportsVBO || bool_4 && !aBool8362 ? new Class131_Sub1(this, i_1, bytes_2, i_3) : new Class135_Sub2(this, i_1, bytes_2, i_3, bool_4);
	}

	void method13601(Interface14 interface14_1) {
		if (interface14_1 != anInterface14_8483) {
			if (supportsVBO)
				OpenGL.glBindBufferARB(GL_ARRAY_BUFFER, interface14_1.method1());

			anInterface14_8483 = interface14_1;
		}

	}

	void method13602(float f_1, float f_2) {
		OpenGL.glMatrixMode(GL_TEXTURE);
		if (aBool8457)
			OpenGL.glLoadIdentity();

		OpenGL.glTranslatef(f_1, f_2, (float) 0.0);
		OpenGL.glMatrixMode(GL_MODELVIEW);
		aBool8457 = true;
	}

	void method13603(int i_3) {
		OpenGL.glDrawArrays(GL_QUADS, 0, i_3);
	}

	void method13606() {
		if (anInt8382 != 4) {
			method13587();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			method13581(-2);
			setColorRenderType(1);
			anInt8382 = 4;
		}

	}

	void method13607() {
		if (anInt8382 != 8) {
			method13645();
			method13642(true);
			enableDepthTest(true);
			method13623(true);
			setColorRenderType(1);
			anInt8382 = 8;
		}

	}

	void method13608(int i_1, boolean bool_2) {
		method13609(i_1, bool_2, true);
	}

	void method13609(int i_1, boolean bool_2, boolean bool_3) {
		if (anInt8454 != i_1 || aBool8449 != aBool8448) {
			Class137_Sub1 class137_sub1_4 = null;
			int i_5 = 0;
			byte b_6 = 0;
			int i_7 = 0;
			int i_8 = aBool8448 ? 3 : 0;
			if (i_1 < 0)
				setTextureModelView();
			else {
				class137_sub1_4 = aClass167_8481.method2858(i_1);
				TextureDetails class169_9 = textureCache.getTextureDetails(i_1);
				if (class169_9.textureSpeedU == 0 && class169_9.textureSpeedV == 0)
					setTextureModelView();
				else
					method13602((anInt8368 % 128000) / 1000.0F * class169_9.textureSpeedU / 64.0F % 1.0F, (anInt8368 % 128000) / 1000.0F * class169_9.textureSpeedV / 64.0F % 1.0F);

				if (!aBool8448) {
					b_6 = class169_9.effectParam1;
					i_7 = class169_9.effectParam2;
					i_8 = class169_9.effectId;
				}

				i_5 = class169_9.combineMode;
			}

			aClass146_8356.method2462(i_8, b_6, i_7, bool_2, bool_3);
			if (!aClass146_8356.method2463(class137_sub1_4, i_5)) {
				setTexture(class137_sub1_4);
				method13612(i_5);
			}

			aBool8449 = aBool8448;
			anInt8454 = i_1;
		}

		anInt8382 &= -8;
	}

	void method13611(Interface15 interface15_1, int i_3, int i_4) {
		method13663(interface15_1);
		OpenGL.glDrawElements(GL_TRIANGLES, i_4, GL_UNSIGNED_SHORT, interface15_1.method2() + (i_3 * 2));
	}

	void method13612(int i_1) {
		if (i_1 == 1)
			method13717(GL_REPLACE, GL_REPLACE);
		else if (i_1 == 0)
			method13717(GL_MODULATE, GL_MODULATE);
		else if (i_1 == 2)
			method13717(GL_INTERPOLATE, GL_REPLACE);
		else if (i_1 == 3)
			method13717(GL_ADD, GL_MODULATE);
		else if (i_1 == 4)
			method13717(GL_SUBTRACT, GL_SUBTRACT);

	}

	int method13613(int i_1) {
		if (i_1 == 1)
			return GL_REPLACE;
		if (i_1 == 0)
			return GL_MODULATE;
		else if (i_1 == 2)
			return GL_INTERPOLATE;
		else if (i_1 == 3)
			return GL_ADD;
		else if (i_1 == 4)
			return GL_SUBTRACT;
		else
			throw new IllegalArgumentException();
	}

	void method13616(int i_1, int i_2) {
		OpenGL.glTexEnvi(GL_TEXTURE_ENV, i_1 + GL_SRC0_ALPHA, i_2);
		OpenGL.glTexEnvi(GL_TEXTURE_ENV, i_1 + GL_OPERAND0_ALPHA, GL_SRC_ALPHA);
	}

	void method13617(int i_1) {
		LIGHT_PARAMS[0] = (i_1 & 0xff0000) / 1.671168E7F;
		LIGHT_PARAMS[1] = (i_1 & 0xff00) / 65280.0F;
		LIGHT_PARAMS[2] = (i_1 & 0xff) / 255.0F;
		LIGHT_PARAMS[3] = (i_1 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(GL_TEXTURE_ENV, GL_TEXTURE_ENV_COLOR, LIGHT_PARAMS, 0);
	}

	void method13620(boolean bool_1) {
		if (aBool8422 != bool_1) {
			aBool8422 = bool_1;
			method13622();
			anInt8382 &= -8;
		}

	}

	void method13621(boolean bool_1) {
		if (aBool8397 != bool_1) {
			aBool8397 = bool_1;
			method13622();
		}

	}

	void method13622() {
		if (aBool8422 && !aBool8397)
			OpenGL.glEnable(GL_LIGHTING);
		else
			OpenGL.glDisable(GL_LIGHTING);

	}

	void method13623(boolean bool_1) {
		if (aBool8388 != bool_1) {
			aBool8388 = bool_1;
			method13579();
			anInt8382 &= -16;
		}

	}

	synchronized void method13625(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.pointer = i_1;
		aClass473_8375.insertBack(class282_sub38_3);
	}

	synchronized void method13627(long long_1) {
		Node node_3 = new Node();
		node_3.pointer = long_1;
		aClass473_8379.insertBack(node_3);
	}

	synchronized void method13628(int i_1) {
		Node node_2 = new Node();
		node_2.pointer = i_1;
		aClass473_8461.insertBack(node_2);
	}

	void method13633(Matrix44 matrix44_1) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(matrix44_1.buf, 0);
	}

	void method13635(float f_1, float f_2, float f_3, float f_4) {
		LIGHT_PARAMS[0] = f_1;
		LIGHT_PARAMS[1] = f_2;
		LIGHT_PARAMS[2] = f_3;
		LIGHT_PARAMS[3] = f_4;
		OpenGL.glTexEnvfv(GL_TEXTURE_ENV, GL_TEXTURE_ENV_COLOR, LIGHT_PARAMS, 0);
	}

	void method13637() {
		if (anInt8382 != 2) {
			method13587();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			method13581(-2);
			anInt8382 = 2;
		}

	}

	void method13639() {
		int i_1 = aClass158_5853.getWidth();
		int i_2 = aClass158_5853.getHeight();
		aClass384_8385.method6530(0.0F, i_1, 0.0F, i_2, -1.0f, 1.0F);
		method8421();
		method13586();
		L();
	}

	void method13640(int i_1, int i_2) {
		anInt8453 = i_1;
		anInt8416 = i_2;
		method13584();
		method13570();
	}

	void method13641() {
		OpenGL.glPopMatrix();
	}

	void method13642(boolean bool_1) {
		if (aBool8440 != bool_1) {
			aBool8440 = bool_1;
			method13747();
			anInt8382 &= -16;
		}

	}

	void method13645() {
		if (anInt8409 != 2) {
			anInt8409 = 2;
			method13719(aClass384_8442.buf);
			method13748();
			method13584();
			method13671();
			anInt8382 &= -8;
		}

	}

	void method13647(OpenGlArrayBufferPointer class143_1, OpenGlArrayBufferPointer class143_2, OpenGlArrayBufferPointer class143_3, OpenGlArrayBufferPointer class143_4) {
		if (class143_1 != null) {
			method13601(class143_1.anInterface14_1667);
			OpenGL.glVertexPointer(class143_1.aByte1670, class143_1.aShort1668, anInterface14_8483.method59(), anInterface14_8483.method109() + class143_1.aByte1669);
			OpenGL.glEnableClientState(GL_VERTEX_ARRAY);
		} else
			OpenGL.glDisableClientState(GL_VERTEX_ARRAY);

		if (class143_2 != null) {
			method13601(class143_2.anInterface14_1667);
			OpenGL.glNormalPointer(class143_2.aShort1668, anInterface14_8483.method59(), anInterface14_8483.method109() + class143_2.aByte1669);
			OpenGL.glEnableClientState(GL_NORMAL_ARRAY);
		} else
			OpenGL.glDisableClientState(GL_NORMAL_ARRAY);

		if (class143_3 != null) {
			method13601(class143_3.anInterface14_1667);
			OpenGL.glColorPointer(class143_3.aByte1670, class143_3.aShort1668, anInterface14_8483.method59(), anInterface14_8483.method109() + class143_3.aByte1669);
			OpenGL.glEnableClientState(GL_COLOR_ARRAY);
		} else
			OpenGL.glDisableClientState(GL_COLOR_ARRAY);

		if (class143_4 != null) {
			method13601(class143_4.anInterface14_1667);
			OpenGL.glTexCoordPointer(class143_4.aByte1670, class143_4.aShort1668, anInterface14_8483.method59(), anInterface14_8483.method109() + class143_4.aByte1669);
			OpenGL.glEnableClientState(GL_TEXTURE_COORD_ARRAY);
		} else
			OpenGL.glDisableClientState(GL_TEXTURE_COORD_ARRAY);

	}

	synchronized void method13657(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.pointer = i_1;
		aClass473_8486.insertBack(class282_sub38_3);
	}

	void method13659() {
		if (anInt8382 != 1) {
			method13587();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			setTexture(null);
			method13581(-2);
			method13612(1);
			anInt8382 = 1;
		}

	}

	void method13663(Interface15 interface15_1) {
		if (interface15_1 != anInterface15_8452) {
			if (supportsVBO)
				OpenGL.glBindBufferARB(GL_ELEMENT_ARRAY_BUFFER, interface15_1.method1());

			anInterface15_8452 = interface15_1;
		}

	}

	void method13671() {
		if (anInt8409 == 2)
			OpenGL.glDepthRange(aFloat8364, aFloat8320);
		else
			OpenGL.glDepthRange(0.0F, 1.0F);

	}

	synchronized void method13678(int i_1) {
		IntNode class282_sub38_2 = new IntNode(i_1);
		aClass473_8376.insertBack(class282_sub38_2);
	}

	boolean method13704() {
		return aClass146_8356.method2465();
	}

	synchronized void method13707(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.pointer = i_1;
		aClass473_8377.insertBack(class282_sub38_3);
	}

	void method13717(int i_1, int i_2) {
		if (currActiveTexture == 0) {
			boolean bool_3 = false;
			if (anInt8455 != i_1) {
				OpenGL.glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, i_1);
				anInt8455 = i_1;
				bool_3 = true;
			}

			if (i_2 != anInt8451) {
				OpenGL.glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, i_2);
				anInt8451 = i_2;
				bool_3 = true;
			}

			if (bool_3)
				anInt8382 &= -14;
		} else {
			OpenGL.glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_RGB, i_1);
			OpenGL.glTexEnvi(GL_TEXTURE_ENV, GL_COMBINE_ALPHA, i_2);
		}

	}

	void method13719(float[] floats_1) {
		float[] floats_2 = new float[16];
		System.arraycopy(floats_1, 0, floats_2, 0, 16);
		floats_2[1] = -floats_2[1];
		floats_2[5] = -floats_2[5];
		floats_2[9] = -floats_2[9];
		floats_2[13] = -floats_2[13];
		OpenGL.glMatrixMode(GL_PROJECTION);
		OpenGL.glLoadMatrixf(floats_2, 0);
		OpenGL.glMatrixMode(GL_MODELVIEW);
	}

	void method13747() {
		if (aBool8440 && anInt8358 >= 0)
			OpenGL.glEnable(GL_FOG);
		else
			OpenGL.glDisable(GL_FOG);

	}

	void method13748() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(aClass384_8348.buf, 0);
		if (aBool8449)
			aClass146_8356.aClass141_Sub4_1715.method14427();

		positionLights();
		renderLights();
	}

	@Override
	public RendererInfo method8392() {
		int i_1 = -1;
		if (vendor.indexOf("nvidia") != -1)
			i_1 = 4318;
		else if (vendor.indexOf("intel") != -1)
			i_1 = 32902; //GL_INDEX_ARRAY_STRIDE
		else if (vendor.indexOf("ati") != -1)
			i_1 = 4098;
		else if (vendor.indexOf("mesa") != -1)
			i_1 = 1337; //TODO who the hell knows what the vendor id for mesa is
		return new RendererInfo(i_1, "OpenGL", version, renderer, 0L);
	}

	@Override // dead code
	public void method8394(int i_1, GLLight[] arr_2) {
		if (i_1 >= 0) System.arraycopy(arr_2, 0, lights, 0, i_1);

		maxActiveLightIndex = i_1;
		if (anInt8409 != 1)
			renderLights();

	}

	@Override
	public void method8395() {
		OpenGL.glFinish();
	}

	@Override
	void method8397() {
		for (Node node_1 = aClass473_8369.getBack(); node_1 != null; node_1 = aClass473_8369.getPrevious())
			((Node_Sub1_Sub1) node_1).method15450();

		if (aClass170_8357 != null)
			aClass170_8357.method2898();

		if (aBool8367) {
			Class13.method508(false, true);
			aBool8367 = false;
		}

	}

	@Override
	public synchronized void method8398(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!aClass473_8486.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8486.popTail();
			anIntArray8381[i_2++] = (int) class282_sub38_4.pointer;
			anInt8371 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8375.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8375.popTail();
			anIntArray8381[i_2++] = (int) class282_sub38_4.pointer;
			anInt8370 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8376.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8376.popTail();
			anIntArray8381[i_2++] = class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8377.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8377.popTail();
			anIntArray8381[i_2++] = (int) class282_sub38_4.pointer;
			anInt8372 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
			boolean bool_3 = false;
		}

		while (!aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.pointer, class282_sub38_4.value);
		}

		Node node_5;
		while (!aClass473_8461.method7861()) {
			node_5 = aClass473_8461.popTail();
			OpenGL.glDeleteProgramARB((int) node_5.pointer);
		}

		while (!aClass473_8379.method7861()) {
			node_5 = aClass473_8379.popTail();
			OpenGL.glDeleteShader((int) node_5.pointer);
		}

		while (!aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.pointer, class282_sub38_4.value);
		}

		aClass167_8481.method2860();
		if (za() > 100663296 && Utils.time() > aLong8316 + 60000L) {
			System.gc();
			aLong8316 = Utils.time();
		}

		anInt8368 = i_1;
	}

	@Override
	public boolean method8399() {
		return true;
	}

	@Override
	public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return supportsCubeMaps ? new Class152_Sub1_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6) : null;
	}

	@Override
	public boolean method8402() {
		return true;
	}

	@Override
	public boolean method8403() {
		return aNode_Sub5_Sub1_8444 != null && (anInt8475 <= 1 || supportsPostProcessing);
	}

	@Override
	public boolean method8404() {
		return true;
	}

	@Override
	public boolean method8405() {
		return supportsMultiSample && (!method8471() || supportsPostProcessing);
	}

	@Override
	public boolean method8406() {
		return true;
	}

	@Override
	public boolean method8407() {
		return false;
	}

	@Override
	public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		method13659();
		setColorRenderType(i_6);
		float f_7 = (float) i_3 - i_1;
		float f_8 = (float) i_4 - i_2;
		if (f_7 == 0.0F && f_8 == 0.0F)
			f_7 = 1.0F;
		else {
			float f_9 = (float) (1.0D / Math.sqrt(f_7 * f_7 + f_8 * f_8));
			f_7 *= f_9;
			f_8 *= f_9;
		}

		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glVertex2f(i_3 + f_7 + 0.35F, i_4 + f_8 + 0.35F);
		OpenGL.glEnd();
	}

	@Override
	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub1(this, canvas_1);
	}

	@Override
	public Class158_Sub1 method8418() {
		return new FrameBufferObject(this);
	}

	@Override
	public Interface8 method8419(int i_1, int i_2) {
		return new CacheableNode_Sub19(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	@Override
	public void method8420() {
		if (aBool8487 && aClass158_5853 != null) {
			int i_1 = anInt8413;
			int i_2 = anInt8412;
			int i_3 = anInt8415;
			int i_4 = anInt8478;
			L();
			int i_5 = anInt8417;
			int i_6 = anInt8418;
			int i_7 = anInt8419;
			int i_8 = anInt8347;
			method8421();
			OpenGL.glReadBuffer(GL_FRONT);
			OpenGL.glDrawBuffer(GL_BACK);
			method13586();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			setTexture(null);
			method13581(-2);
			method13612(1);
			setColorRenderType(0);
			OpenGL.glMatrixMode(GL_PROJECTION);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
			OpenGL.glMatrixMode(GL_MODELVIEW);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass158_5853.getWidth(), aClass158_5853.getHeight(), GL_COLOR);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(GL_BACK);
			OpenGL.glDrawBuffer(GL_BACK);
			r(i_1, i_3, i_2, i_4);
			method8617(i_5, i_6, i_7, i_8);
		}

	}

	@Override
	public void method8421() {
		anInt8417 = 0;
		anInt8418 = 0;
		anInt8419 = aClass158_5853.getWidth();
		anInt8347 = aClass158_5853.getHeight();
		method13584();
	}

	@Override
	public void method8423(Matrix44Var matrix44var_1) {
		aClass294_8389.method5209(matrix44var_1);
		aClass384_8348.fromVarMatrix44(aClass294_8389);
		aClass294_8405.method5209(matrix44var_1);
		aClass294_8405.method5207();
		aClass384_8391.fromVarMatrix44(aClass294_8405);
		method13597();
		if (anInt8409 != 1)
			method13748();

	}

	@Override
	public void method8424(Matrix44 matrix44_1) {
		aClass384_8442.copy(matrix44_1);
		method13597();
		method13588();
	}

	@Override // dead code
	public void method8426(int i_1, GLLight[] arr_2) {
		if (i_1 >= 0) System.arraycopy(arr_2, 0, lights, 0, i_1);

		maxActiveLightIndex = i_1;
		if (anInt8409 != 1)
			renderLights();

	}

	@Override
	public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	@Override
	public void method8430(int i_1, int i_2, int i_3, int i_4, int color, int colorRenderType) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3 - 1.0F;
		float f_10 = f_8 + i_4 - 1.0F;
		method13659();
		setColorRenderType(colorRenderType);
		OpenGL.glColor4ub((byte) (color >> 16), (byte) (color >> 8), (byte) color, (byte) (color >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_LINE_LOOP);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public boolean method8431() {
		return true;
	}

	@Override
	public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		method13659();
		setColorRenderType(i_6);
		float f_7 = (float) i_3 - i_1;
		float f_8 = (float) i_4 - i_2;
		if (f_7 == 0.0F && f_8 == 0.0F)
			f_7 = 1.0F;
		else {
			float f_9 = (float) (1.0D / Math.sqrt(f_7 * f_7 + f_8 * f_8));
			f_7 *= f_9;
			f_8 *= f_9;
		}

		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glVertex2f(i_3 + f_7 + 0.35F, i_4 + f_8 + 0.35F);
		OpenGL.glEnd();
	}

	@Override
	public int method8434(int i_1, int i_2) {
		return i_1 | i_2;
	}

	@Override
	public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
		if (i_3 != i_1 || i_2 != i_4) {
			method13659();
			setColorRenderType(1);
			float f_10 = (float) i_3 - i_1;
			float f_11 = (float) i_4 - i_2;
			float f_12 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * i_7;
			float f_14 = f_11 * i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (i_8 + i_7 - i_9);
				f_16 = f_11 * (i_8 + i_7 - i_9);
			} else {
				f_17 = f_10 * (i_7 - i_9);
				f_18 = f_11 * (i_7 - i_9);
			}

			float f_19 = i_1 + 0.35F + f_15;
			float f_20 = i_2 + 0.35F + f_16;
			float f_21 = f_10 * i_8;
			float f_22 = f_11 * i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > i_3 + 0.35F)
						break;

					if (f_19 + f_17 > i_3)
						f_17 = i_3 - f_19;
				} else {
					if (f_19 < i_3 + 0.35F)
						break;

					if (f_19 + f_17 < i_3)
						f_17 = i_3 - f_19;
				}

				if (i_4 > i_2) {
					if (f_20 > i_4 + 0.35F)
						break;

					if (f_20 + f_18 > i_4)
						f_18 = i_4 - f_20;
				} else {
					if (f_20 < i_4 + 0.35F)
						break;

					if (f_20 + f_18 < i_4)
						f_18 = i_4 - f_20;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glVertex2f(f_19, f_20);
				OpenGL.glVertex2f(f_19 + f_17, f_20 + f_18);
				OpenGL.glEnd();
				f_19 += f_21 + f_17;
				f_20 += f_22 + f_18;
				f_17 = f_13;
				f_18 = f_14;
			}
		}

	}

	@Override
	public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_1 + aClass384_8394.buf[6] * i_2 + aClass384_8394.buf[10] * i_3;
		float f_9 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_4 + aClass384_8394.buf[6] * i_5 + aClass384_8394.buf[10] * i_6;
		float f_10 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_1 + aClass384_8394.buf[7] * i_2 + aClass384_8394.buf[11] * i_3;
		float f_11 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_4 + aClass384_8394.buf[7] * i_5 + aClass384_8394.buf[11] * i_6;
		if (f_8 < -f_10 && f_9 < -f_11)
			i_7 |= 0x10;
		else if (f_8 > f_10 && f_9 > f_11)
			i_7 |= 0x20;

		float f_12 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_1 + aClass384_8394.buf[4] * i_2 + aClass384_8394.buf[8] * i_3;
		float f_13 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_4 + aClass384_8394.buf[4] * i_5 + aClass384_8394.buf[8] * i_6;
		if (f_12 < -f_10 && f_13 < -f_11)
			i_7 |= 0x1;

		if (f_12 > f_10 && f_13 > f_11)
			i_7 |= 0x2;

		float f_14 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_1 + aClass384_8394.buf[5] * i_2 + aClass384_8394.buf[9] * i_3;
		float f_15 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_4 + aClass384_8394.buf[5] * i_5 + aClass384_8394.buf[9] * i_6;
		if (f_14 < -f_10 && f_15 < -f_11)
			i_7 |= 0x4;

		if (f_14 > f_10 && f_15 > f_11)
			i_7 |= 0x8;

		return i_7;
	}

	@Override
	public Node_Sub1 method8438(int i_1) {
		Node_Sub1_Sub1 class282_sub1_sub1_2 = new Node_Sub1_Sub1(i_1);
		aClass473_8369.insertBack(class282_sub1_sub1_2);
		return class282_sub1_sub1_2;
	}

	@Override
	public void method8439(Node_Sub1 class282_sub1_1) {
		aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			anInterface14_8496 = method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index, false);
			aClass143_8494 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 3, 0);
			aClass143_8495 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 2, 12);
			aClass134_8359.method2328(this);
		}

	}

	@Override
	public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new OpenGLSprite(this, i_4, i_5, ints_1, i_2, i_3);
	}

	@Override
	public int method8443(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	@Override
	public NativeSprite method8444(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = new int[class91_1.width * class91_1.height];
		int i_4 = 0;
		int i_5 = 0;
		int i_6;
		int i_7;
		if (class91_1.alpha != null)
			for (i_6 = 0; i_6 < class91_1.height; i_6++)
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					ints_3[i_5++] = class91_1.alpha[i_4] << 24 | class91_1.pallete[class91_1.pixels[i_4] & 0xff];
					++i_4;
				}
		else
			for (i_6 = 0; i_6 < class91_1.height; i_6++)
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					int i_8 = class91_1.pallete[class91_1.pixels[i_4++] & 0xff];
					ints_3[i_5++] = i_8 != 0 ? -16777216 | i_8 : 0;
				}

		NativeSprite nativesprite_9 = createNativeSprite(ints_3, class91_1.width, class91_1.width, class91_1.height);
		nativesprite_9.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_9;
	}

	@Override
	public void method8445() {
		if (aBool8487 && aClass158_5853 != null) {
			int i_1 = anInt8413;
			int i_2 = anInt8412;
			int i_3 = anInt8415;
			int i_4 = anInt8478;
			L();
			int i_5 = anInt8417;
			int i_6 = anInt8418;
			int i_7 = anInt8419;
			int i_8 = anInt8347;
			method8421();
			OpenGL.glReadBuffer(GL_FRONT);
			OpenGL.glDrawBuffer(GL_BACK);
			method13586();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			setTexture(null);
			method13581(-2);
			method13612(1);
			setColorRenderType(0);
			OpenGL.glMatrixMode(GL_PROJECTION);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
			OpenGL.glMatrixMode(GL_MODELVIEW);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass158_5853.getWidth(), aClass158_5853.getHeight(), GL_COLOR);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(GL_BACK);
			OpenGL.glDrawBuffer(GL_BACK);
			r(i_1, i_3, i_2, i_4);
			method8617(i_5, i_6, i_7, i_8);
		}

	}

	@Override
	public void method8446(Matrix44 matrix44_1) {
		aClass384_8442.copy(matrix44_1);
		method13597();
		method13588();
	}

	@Override
	public Matrix44 method8449() {
		return aClass384_8360;
	}

	@Override
	public Matrix44Var method8450() {
		return aClass294_8476;
	}

	@Override
	public int method8452(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	@Override
	public Matrix44 method8453() {
		return new Matrix44(aClass384_8442);
	}

	@Override
	public boolean method8454() {
		return true;
	}

	@Override
	public void method8456(Class151 class151_1) {
		aClass134_8359.method2329(this, class151_1);
	}

	@Override
	public void method8457(Matrix44Var matrix44var_1) {
		aClass294_8389.method5209(matrix44var_1);
		aClass384_8348.fromVarMatrix44(aClass294_8389);
		aClass294_8405.method5209(matrix44var_1);
		aClass294_8405.method5207();
		aClass384_8391.fromVarMatrix44(aClass294_8405);
		method13597();
		if (anInt8409 != 1)
			method13748();

	}

	@Override
	public Matrix44Var method8458() {
		return new Matrix44Var(aClass294_8389);
	}

	@Override
	public void method8459() {
	}

	@Override
	public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new OpenGLSprite(this, i_1, i_2, bool_3);
	}

	@Override
	public boolean method8462() {
		return supportsMultiSample && (!method8471() || supportsPostProcessing);
	}

	@Override
	public int method8463() {
		return 4;
	}

	@Override
	public boolean method8464() {
		return aNode_Sub5_Sub1_8444 != null && (anInt8475 <= 1 || supportsPostProcessing);
	}

	@Override
	public boolean method8465() {
		return true;
	}

	@Override
	public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return supportsCubeMaps ? new Class152_Sub1_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6) : null;
	}

	@Override
	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		if (class152_1 != null && class152_2 != null && supportsCubeMaps && supportsFBO) {
			Class152_Sub1_Sub2 class152_sub1_sub2_5 = null;
			Class152_Sub1 class152_sub1_6 = (Class152_Sub1) class152_1;
			Class152_Sub1 class152_sub1_7 = (Class152_Sub1) class152_2;
			Class137_Sub2 class137_sub2_8 = class152_sub1_6.method13519();
			Class137_Sub2 class137_sub2_9 = class152_sub1_7.method13519();
			if (class137_sub2_8 != null && class137_sub2_9 != null) {
				int i_10 = Math.max(class137_sub2_8.anInt9104, class137_sub2_9.anInt9104);
				if (class152_1 != class152_4 && class152_2 != class152_4 && class152_4 instanceof Class152_Sub1_Sub2 class152_sub1_sub2_11) {
					if (class152_sub1_sub2_11.method15532() == i_10)
						class152_sub1_sub2_5 = class152_sub1_sub2_11;
				}

				if (class152_sub1_sub2_5 == null)
					class152_sub1_sub2_5 = new Class152_Sub1_Sub2(this, i_10);

				if (class152_sub1_sub2_5.method15531(class137_sub2_8, class137_sub2_9, f_3))
					return class152_sub1_sub2_5;
			}
		}

		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	@Override
	public boolean method8469() {
		if (aNode_Sub5_Sub1_8444 == null)
			return false;
		if (!aNode_Sub5_Sub1_8444.method12129()) {
			if (!aClass170_8357.method2900(aNode_Sub5_Sub1_8444))
				return false;

			aClass167_8481.method2861();
		}

		return true;
	}

	@Override
	public boolean method8471() {
		return aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129();
	}

	@Override
	public void method8474() {
		aClass170_8357.method2883();
	}

	@Override
	public void method8475(HDWaterTile class90_2) {
		anInt8450 = -1;
		aClass90_8423 = class90_2;
		aBool8448 = true;
	}

	@Override
	public void method8476(int i_1, HDWaterTile class90_2) {
		if (!aBool8448)
			throw new RuntimeException("");
		anInt8450 = i_1;
		aClass90_8423 = class90_2;
		if (aBool8449) {
			aClass146_8356.aClass141_Sub4_1715.method14427();
			aClass146_8356.aClass141_Sub4_1715.method14428();
		}
	}

	@Override
	public void method8477(Class152 class152_1) {
		aClass152_Sub1_8317 = (Class152_Sub1) class152_1;
	}

	@Override
	public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * f_1 + aClass384_8394.buf[7] * f_2 + aClass384_8394.buf[11] * f_3;
		float f_6 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * f_1 + aClass384_8394.buf[4] * f_2 + aClass384_8394.buf[8] * f_3;
		float f_7 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * f_1 + aClass384_8394.buf[5] * f_2 + aClass384_8394.buf[9] * f_3;
		float f_8 = aClass384_8348.buf[14] + aClass384_8348.buf[2] * f_1 + aClass384_8348.buf[6] * f_2 + aClass384_8348.buf[10] * f_3;
		floats_4[0] = aFloat8315 + aFloat8398 * f_6 / f_5;
		floats_4[1] = aFloat8399 + aFloat8400 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	@Override
	public void method8480() {
	}

	@Override
	public RendererInfo method8481() {
		int i_1 = -1;
		if (vendor.indexOf("nvidia") != -1)
			i_1 = 4318;
		else if (vendor.indexOf("intel") != -1)
			i_1 = 32902;
		else if (vendor.indexOf("ati") != -1)
			i_1 = 4098;

		return new RendererInfo(i_1, "OpenGL", version, renderer, 0L);
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
		for (Node node_1 = aClass473_8369.getBack(); node_1 != null; node_1 = aClass473_8369.getPrevious())
			((Node_Sub1_Sub1) node_1).method15450();

		if (aClass170_8357 != null)
			aClass170_8357.method2898();

		if (aBool8367) {
			Class13.method508(false, true);
			aBool8367 = false;
		}

	}

	@Override
	void method8486() {
		for (Node node_1 = aClass473_8369.getBack(); node_1 != null; node_1 = aClass473_8369.getPrevious())
			((Node_Sub1_Sub1) node_1).method15450();

		if (aClass170_8357 != null)
			aClass170_8357.method2898();

		if (aBool8367) {
			Class13.method508(false, true);
			aBool8367 = false;
		}

	}

	@Override
	public synchronized void method8487(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!aClass473_8486.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8486.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8371 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8375.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8375.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8370 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8376.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8376.popTail();
			anIntArray8381[i_2++] = class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8377.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8377.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L);
			anInt8372 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
			boolean bool_3 = false;
		}

		while (!aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		Node node_5;
		while (!aClass473_8461.method7861()) {
			node_5 = aClass473_8461.popTail();
			OpenGL.glDeleteProgramARB((int) (node_5.pointer * -1253863389874800229L * -3442165056282524525L));
		}

		while (!aClass473_8379.method7861()) {
			node_5 = aClass473_8379.popTail();
			OpenGL.glDeleteShader((int) (node_5.pointer * -1253863389874800229L * -3442165056282524525L));
		}

		while (!aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		aClass167_8481.method2860();
		if (za() > 100663296 && Utils.time() > aLong8316 + 60000L) {
			System.gc();
			aLong8316 = Utils.time();
		}

		anInt8368 = i_1;
	}

	@Override
	public synchronized void method8488(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!aClass473_8486.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8486.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.pointer);
			anInt8371 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8375.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8375.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.pointer);
			anInt8370 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8376.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8376.popTail();
			anIntArray8381[i_2++] = class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!aClass473_8377.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8377.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.pointer);
			anInt8372 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(1000, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
			boolean bool_3 = false;
		}

		while (!aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer), class282_sub38_4.value);
		}

		Node node_5;
		while (!aClass473_8461.method7861()) {
			node_5 = aClass473_8461.popTail();
			OpenGL.glDeleteProgramARB((int) (node_5.pointer));
		}

		while (!aClass473_8379.method7861()) {
			node_5 = aClass473_8379.popTail();
			OpenGL.glDeleteShader((int) (node_5.pointer));
		}

		while (!aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.pointer), class282_sub38_4.value);
		}

		aClass167_8481.method2860();
		if (za() > 100663296 && Utils.time() > aLong8316 + 60000L) {
			System.gc();
			aLong8316 = Utils.time();
		}

		anInt8368 = i_1;
	}

	@Override
	public boolean method8489() {
		return true;
	}

	@Override
	public void method8490() {
		if (aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129()) {
			aClass170_8357.method2885(aNode_Sub5_Sub1_8444);
			aClass167_8481.method2861();
		}

	}

	@Override
	public void method8491() {
	}

	@Override
	public boolean method8492() {
		return true;
	}

	@Override
	public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			method13659();
			setColorRenderType(i_6);
			float f_10 = (float) i_3 - i_1;
			float f_11 = (float) i_4 - i_2;
			float f_12 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * i_7;
			float f_14 = f_11 * i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (i_7 + i_8 - i_9);
				f_16 = f_11 * (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (i_7 - i_9);
				f_18 = f_11 * (i_7 - i_9);
			}

			float f_19 = i_1 + 0.35F + f_15;
			float f_20 = i_2 + 0.35F + f_16;
			float f_21 = f_10 * i_8;
			float f_22 = f_11 * i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > i_3 + 0.35F)
						break;

					if (f_19 + f_17 > i_3)
						f_17 = i_3 - f_19;
				} else {
					if (f_19 < i_3 + 0.35F)
						break;

					if (f_19 + f_17 < i_3)
						f_17 = i_3 - f_19;
				}

				if (i_4 > i_2) {
					if (f_20 > i_4 + 0.35F)
						break;

					if (f_20 + f_18 > i_4)
						f_18 = i_4 - f_20;
				} else {
					if (f_20 < i_4 + 0.35F)
						break;

					if (f_20 + f_18 < i_4)
						f_18 = i_4 - f_20;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glVertex2f(f_19, f_20);
				OpenGL.glVertex2f(f_19 + f_17, f_20 + f_18);
				OpenGL.glEnd();
				f_19 += f_21 + f_17;
				f_20 += f_22 + f_18;
				f_17 = f_13;
				f_18 = f_14;
			}
		}

	}

	@Override
	public boolean method8495() {
		return true;
	}

	@Override
	public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		OpenGL.glLineWidth(i_6);
		method8433(i_1, i_2, i_3, i_4, i_5, i_7);
		OpenGL.glLineWidth(1.0F);
	}

	@Override
	public void method8497() {
		if (aBool8487 && aClass158_5853 != null) {
			int i_1 = anInt8413;
			int i_2 = anInt8412;
			int i_3 = anInt8415;
			int i_4 = anInt8478;
			L();
			int i_5 = anInt8417;
			int i_6 = anInt8418;
			int i_7 = anInt8419;
			int i_8 = anInt8347;
			method8421();
			OpenGL.glReadBuffer(GL_FRONT);
			OpenGL.glDrawBuffer(GL_BACK);
			method13586();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			setTexture(null);
			method13581(-2);
			method13612(1);
			setColorRenderType(0);
			OpenGL.glMatrixMode(GL_PROJECTION);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
			OpenGL.glMatrixMode(GL_MODELVIEW);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass158_5853.getWidth(), aClass158_5853.getHeight(), GL_COLOR);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(GL_BACK);
			OpenGL.glDrawBuffer(GL_BACK);
			r(i_1, i_3, i_2, i_4);
			method8617(i_5, i_6, i_7, i_8);
		}

	}

	@Override
	public boolean method8498() {
		return true;
	}

	@Override
	public boolean method8501() {
		return supportsMultiSample && (!method8471() || supportsPostProcessing);
	}

	@Override
	public boolean method8502() {
		return true;
	}

	@Override
	public boolean method8503() {
		return true;
	}

	@Override
	public boolean method8504() {
		return true;
	}

	@Override
	public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	@Override
	public void method8507() {
		if (aBool8487 && aClass158_5853 != null) {
			int i_1 = anInt8413;
			int i_2 = anInt8412;
			int i_3 = anInt8415;
			int i_4 = anInt8478;
			L();
			int i_5 = anInt8417;
			int i_6 = anInt8418;
			int i_7 = anInt8419;
			int i_8 = anInt8347;
			method8421();
			OpenGL.glReadBuffer(GL_FRONT);
			OpenGL.glDrawBuffer(GL_BACK);
			method13586();
			method13642(false);
			method13620(false);
			enableDepthTest(false);
			method13623(false);
			setTexture(null);
			method13581(-2);
			method13612(1);
			setColorRenderType(0);
			OpenGL.glMatrixMode(GL_PROJECTION);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0, 1.0D);
			OpenGL.glMatrixMode(GL_MODELVIEW);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass158_5853.getWidth(), aClass158_5853.getHeight(), GL_COLOR);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(GL_BACK);
			OpenGL.glDrawBuffer(GL_BACK);
			r(i_1, i_3, i_2, i_4);
			method8617(i_5, i_6, i_7, i_8);
		}

	}

	@Override
	public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3 - 1.0F;
		float f_10 = f_8 + i_4 - 1.0F;
		method13659();
		setColorRenderType(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_LINE_LOOP);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public void method8513(int i_1, int i_2, int i_3, int i_4) {
		anInt8417 = i_1;
		anInt8418 = i_2;
		anInt8419 = i_3;
		anInt8347 = i_4;
		method13584();
	}

	@Override
	public void method8514(int i_1, int i_2, int i_3, int i_4) {
		anInt8417 = i_1;
		anInt8418 = i_2;
		anInt8419 = i_3;
		anInt8347 = i_4;
		method13584();
	}

	@Override
	public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * f_1 + aClass384_8394.buf[6] * f_2 + aClass384_8394.buf[10] * f_3;
		float f_6 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * f_1 + aClass384_8394.buf[7] * f_2 + aClass384_8394.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * f_1 + aClass384_8394.buf[4] * f_2 + aClass384_8394.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * f_1 + aClass384_8394.buf[5] * f_2 + aClass384_8394.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = aClass384_8348.buf[14] + aClass384_8348.buf[2] * f_1 + aClass384_8348.buf[6] * f_2 + aClass384_8348.buf[10] * f_3;
					floats_4[0] = aFloat8315 + aFloat8398 * f_7 / f_6;
					floats_4[1] = aFloat8399 + aFloat8400 * f_8 / f_6;
					floats_4[2] = f_9;
				} else {
					floats_4[2] = Float.NaN;
					floats_4[1] = Float.NaN;
					floats_4[0] = Float.NaN;
				}
			} else {
				floats_4[2] = Float.NaN;
				floats_4[1] = Float.NaN;
				floats_4[0] = Float.NaN;
			}
		} else {
			floats_4[2] = Float.NaN;
			floats_4[1] = Float.NaN;
			floats_4[0] = Float.NaN;
		}

	}

	@Override
	public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		method13659();
		setColorRenderType(i_13);
		OpenGL.glBegin(GL_TRIANGLES);
		OpenGL.glColor4ub((byte) (i_10 >> 16), (byte) (i_10 >> 8), (byte) i_10, (byte) (i_10 >> 24));
		OpenGL.glVertex3f(i_1 + 0.35F, i_2 + 0.35F, f_3);
		OpenGL.glColor4ub((byte) (i_11 >> 16), (byte) (i_11 >> 8), (byte) i_11, (byte) (i_11 >> 24));
		OpenGL.glVertex3f(i_4 + 0.35F, i_5 + 0.35F, f_6);
		OpenGL.glColor4ub((byte) (i_12 >> 16), (byte) (i_12 >> 8), (byte) i_12, (byte) (i_12 >> 24));
		OpenGL.glVertex3f(i_7 + 0.35F, i_8 + 0.35F, f_9);
		OpenGL.glEnd();
	}

	@Override
	public Matrix44 method8517() {
		return aClass384_8360;
	}

	@Override
	public NativeSprite method8518(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = new int[class91_1.width * class91_1.height];
		int i_4 = 0;
		int i_5 = 0;
		int i_6;
		int i_7;
		if (class91_1.alpha != null)
			for (i_6 = 0; i_6 < class91_1.height; i_6++)
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					ints_3[i_5++] = class91_1.alpha[i_4] << 24 | class91_1.pallete[class91_1.pixels[i_4] & 0xff];
					++i_4;
				}
		else
			for (i_6 = 0; i_6 < class91_1.height; i_6++)
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					int i_8 = class91_1.pallete[class91_1.pixels[i_4++] & 0xff];
					ints_3[i_5++] = i_8 != 0 ? -16777216 | i_8 : 0;
				}

		NativeSprite nativesprite_9 = createNativeSprite(ints_3, class91_1.width, class91_1.width, class91_1.height);
		nativesprite_9.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_9;
	}

	@Override
	public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3 - 1.0F;
		float f_10 = f_8 + i_4 - 1.0F;
		method13659();
		setColorRenderType(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_LINE_LOOP);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = i_1 + 0.35F;
		float f_8 = i_2 + 0.35F;
		float f_9 = f_7 + i_3 - 1.0F;
		float f_10 = f_8 + i_4 - 1.0F;
		method13659();
		setColorRenderType(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (supportsMultiSample)
			OpenGL.glDisable(GL_MULTISAMPLE);

		OpenGL.glBegin(GL_LINE_LOOP);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (supportsMultiSample)
			OpenGL.glEnable(GL_MULTISAMPLE);

	}

	@Override
	public void method8521() {
		if (aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129()) {
			aClass170_8357.method2885(aNode_Sub5_Sub1_8444);
			aClass167_8481.method2861();
		}

	}

	@Override
	public void method8525(int i_3, int i_4) {
		aClass170_8357.method2884(0, 0, i_3, i_4);
	}

	@Override
	public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		method13659();
		setColorRenderType(i_6);
		float f_7 = (float) i_3 - i_1;
		float f_8 = (float) i_4 - i_2;
		if (f_7 == 0.0F && f_8 == 0.0F)
			f_7 = 1.0F;
		else {
			float f_9 = (float) (1.0D / Math.sqrt(f_7 * f_7 + f_8 * f_8));
			f_7 *= f_9;
			f_8 *= f_9;
		}

		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glVertex2f(i_3 + f_7 + 0.35F, i_4 + f_8 + 0.35F);
		OpenGL.glEnd();
	}

	@Override
	public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			method13659();
			setColorRenderType(i_6);
			float f_10 = (float) i_3 - i_1;
			float f_11 = (float) i_4 - i_2;
			float f_12 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * i_7;
			float f_14 = f_11 * i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (i_7 + i_8 - i_9);
				f_16 = f_11 * (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (i_7 - i_9);
				f_18 = f_11 * (i_7 - i_9);
			}

			float f_19 = i_1 + 0.35F + f_15;
			float f_20 = i_2 + 0.35F + f_16;
			float f_21 = f_10 * i_8;
			float f_22 = f_11 * i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > i_3 + 0.35F)
						break;

					if (f_19 + f_17 > i_3)
						f_17 = i_3 - f_19;
				} else {
					if (f_19 < i_3 + 0.35F)
						break;

					if (f_19 + f_17 < i_3)
						f_17 = i_3 - f_19;
				}

				if (i_4 > i_2) {
					if (f_20 > i_4 + 0.35F)
						break;

					if (f_20 + f_18 > i_4)
						f_18 = i_4 - f_20;
				} else {
					if (f_20 < i_4 + 0.35F)
						break;

					if (f_20 + f_18 < i_4)
						f_18 = i_4 - f_20;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glVertex2f(f_19, f_20);
				OpenGL.glVertex2f(f_19 + f_17, f_20 + f_18);
				OpenGL.glEnd();
				f_19 += f_21 + f_17;
				f_20 += f_22 + f_18;
				f_17 = f_13;
				f_18 = f_14;
			}
		}

	}

	@Override
	public boolean method8528() {
		return true;
	}

	@Override
	public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			method13659();
			setColorRenderType(i_6);
			float f_10 = (float) i_3 - i_1;
			float f_11 = (float) i_4 - i_2;
			float f_12 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * i_7;
			float f_14 = f_11 * i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (i_7 + i_8 - i_9);
				f_16 = f_11 * (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (i_7 - i_9);
				f_18 = f_11 * (i_7 - i_9);
			}

			float f_19 = i_1 + 0.35F + f_15;
			float f_20 = i_2 + 0.35F + f_16;
			float f_21 = f_10 * i_8;
			float f_22 = f_11 * i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > i_3 + 0.35F)
						break;

					if (f_19 + f_17 > i_3)
						f_17 = i_3 - f_19;
				} else {
					if (f_19 < i_3 + 0.35F)
						break;

					if (f_19 + f_17 < i_3)
						f_17 = i_3 - f_19;
				}

				if (i_4 > i_2) {
					if (f_20 > i_4 + 0.35F)
						break;

					if (f_20 + f_18 > i_4)
						f_18 = i_4 - f_20;
				} else {
					if (f_20 < i_4 + 0.35F)
						break;

					if (f_20 + f_18 < i_4)
						f_18 = i_4 - f_20;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glVertex2f(f_19, f_20);
				OpenGL.glVertex2f(f_19 + f_17, f_20 + f_18);
				OpenGL.glEnd();
				f_19 += f_21 + f_17;
				f_20 += f_22 + f_18;
				f_17 = f_13;
				f_18 = f_14;
			}
		}

	}

	@Override
	public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			method13659();
			setColorRenderType(i_6);
			float f_10 = (float) i_3 - i_1;
			float f_11 = (float) i_4 - i_2;
			float f_12 = (float) (1.0D / Math.sqrt(f_10 * f_10 + f_11 * f_11));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * i_7;
			float f_14 = f_11 * i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (i_7 + i_8 - i_9);
				f_16 = f_11 * (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (i_7 - i_9);
				f_18 = f_11 * (i_7 - i_9);
			}

			float f_19 = i_1 + 0.35F + f_15;
			float f_20 = i_2 + 0.35F + f_16;
			float f_21 = f_10 * i_8;
			float f_22 = f_11 * i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > i_3 + 0.35F)
						break;

					if (f_19 + f_17 > i_3)
						f_17 = i_3 - f_19;
				} else {
					if (f_19 < i_3 + 0.35F)
						break;

					if (f_19 + f_17 < i_3)
						f_17 = i_3 - f_19;
				}

				if (i_4 > i_2) {
					if (f_20 > i_4 + 0.35F)
						break;

					if (f_20 + f_18 > i_4)
						f_18 = i_4 - f_20;
				} else {
					if (f_20 < i_4 + 0.35F)
						break;

					if (f_20 + f_18 < i_4)
						f_18 = i_4 - f_20;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glVertex2f(f_19, f_20);
				OpenGL.glVertex2f(f_19 + f_17, f_20 + f_18);
				OpenGL.glEnd();
				f_19 += f_21 + f_17;
				f_20 += f_22 + f_18;
				f_17 = f_13;
				f_18 = f_14;
			}
		}

	}

	@Override
	void method8531() {
		for (Node node_1 = aClass473_8369.getBack(); node_1 != null; node_1 = aClass473_8369.getPrevious())
			((Node_Sub1_Sub1) node_1).method15450();

		if (aClass170_8357 != null)
			aClass170_8357.method2898();

		if (aBool8367) {
			Class13.method508(false, true);
			aBool8367 = false;
		}

	}

	@Override
	public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		setColorRenderType(i_6);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - i_1;
		float f_15 = (float) i_4 - i_2;
		float f_16 = (float) (1.0D / Math.sqrt(f_14 * f_14 + f_15 * f_15));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f_12 * (i_1 - i_8), f_13 * (i_2 - i_9));
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (i_3 - i_8), f_13 * (i_4 - i_9));
		OpenGL.glVertex2f(i_3 + f_14 + 0.35F, i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		setColorRenderType(i_6);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - i_1;
		float f_15 = (float) i_4 - i_2;
		float f_16 = (float) (1.0D / Math.sqrt(f_14 * f_14 + f_15 * f_15));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glTexCoord2f(f_12 * (i_1 - i_8), f_13 * (i_2 - i_9));
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (i_3 - i_8), f_13 * (i_4 - i_9));
		OpenGL.glVertex2f(i_3 + f_14 + 0.35F, i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (i_1 != i_3 || i_2 != i_4) {
			Class455_Sub2 class455_sub2_13 = (Class455_Sub2) class455_7;
			Class137_Sub1_Sub1 class137_sub1_sub1_14 = class455_sub2_13.aClass137_Sub1_Sub1_8974;
			method13637();
			setTexture(class455_sub2_13.aClass137_Sub1_Sub1_8974);
			setColorRenderType(i_6);
			method13717(GL_REPLACE, GL_MODULATE);
			method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
			float f_15 = class137_sub1_sub1_14.aFloat10132 / class137_sub1_sub1_14.anInt10136;
			float f_16 = class137_sub1_sub1_14.aFloat10134 / class137_sub1_sub1_14.anInt10133;
			float f_17 = (float) i_3 - i_1;
			float f_18 = (float) i_4 - i_2;
			float f_19 = (float) (1.0D / Math.sqrt(f_17 * f_17 + f_18 * f_18));
			f_17 *= f_19;
			f_18 *= f_19;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_12 %= i_11 + i_10;
			float f_20 = f_17 * i_10;
			float f_21 = f_18 * i_10;
			float f_22 = 0.0F;
			float f_23 = 0.0F;
			float f_24 = f_20;
			float f_25 = f_21;
			if (i_12 > i_10) {
				f_22 = f_17 * (i_10 + i_11 - i_12);
				f_23 = f_18 * (i_10 + i_11 - i_12);
			} else {
				f_24 = f_17 * (i_10 - i_12);
				f_25 = f_18 * (i_10 - i_12);
			}

			float f_26 = i_1 + 0.35F + f_22;
			float f_27 = i_2 + 0.35F + f_23;
			float f_28 = f_17 * i_11;
			float f_29 = f_18 * i_11;

			while (true) {
				if (i_3 > i_1) {
					if (f_26 > i_3 + 0.35F)
						break;

					if (f_26 + f_24 > i_3)
						f_24 = i_3 - f_26;
				} else {
					if (f_26 < i_3 + 0.35F)
						break;

					if (f_26 + f_24 < i_3)
						f_24 = i_3 - f_26;
				}

				if (i_4 > i_2) {
					if (f_27 > i_4 + 0.35F)
						break;

					if (f_27 + f_25 > i_4)
						f_25 = i_4 - f_27;
				} else {
					if (f_27 < i_4 + 0.35F)
						break;

					if (f_27 + f_25 < i_4)
						f_25 = i_4 - f_27;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glTexCoord2f(f_15 * (f_26 - i_8), f_16 * (f_27 - i_9));
				OpenGL.glVertex2f(f_26, f_27);
				OpenGL.glTexCoord2f(f_15 * (f_26 + f_24 - i_8), f_16 * (f_27 + f_25 - i_9));
				OpenGL.glVertex2f(f_26 + f_24, f_27 + f_25);
				OpenGL.glEnd();
				f_26 += f_28 + f_24;
				f_27 += f_29 + f_25;
				f_24 = f_20;
				f_25 = f_21;
			}

			method13595(0, GL_TEXTURE, GL_SRC_COLOR);
		}

	}

	@Override
	public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		OpenGL.glLineWidth(i_6);
		method8433(i_1, i_2, i_3, i_4, i_5, i_7);
		OpenGL.glLineWidth(1.0F);
	}

	@Override
	public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_1 + aClass384_8394.buf[6] * i_2 + aClass384_8394.buf[10] * i_3;
		float f_9 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_4 + aClass384_8394.buf[6] * i_5 + aClass384_8394.buf[10] * i_6;
		float f_10 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_1 + aClass384_8394.buf[7] * i_2 + aClass384_8394.buf[11] * i_3;
		float f_11 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_4 + aClass384_8394.buf[7] * i_5 + aClass384_8394.buf[11] * i_6;
		if (f_8 < -f_10 && f_9 < -f_11)
			i_7 |= 0x10;
		else if (f_8 > f_10 && f_9 > f_11)
			i_7 |= 0x20;

		float f_12 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_1 + aClass384_8394.buf[4] * i_2 + aClass384_8394.buf[8] * i_3;
		float f_13 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_4 + aClass384_8394.buf[4] * i_5 + aClass384_8394.buf[8] * i_6;
		if (f_12 < -f_10 && f_13 < -f_11)
			i_7 |= 0x1;

		if (f_12 > f_10 && f_13 > f_11)
			i_7 |= 0x2;

		float f_14 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_1 + aClass384_8394.buf[5] * i_2 + aClass384_8394.buf[9] * i_3;
		float f_15 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_4 + aClass384_8394.buf[5] * i_5 + aClass384_8394.buf[9] * i_6;
		if (f_14 < -f_10 && f_15 < -f_11)
			i_7 |= 0x4;

		if (f_14 > f_10 && f_15 > f_11)
			i_7 |= 0x8;

		return i_7;
	}

	@Override
	public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_1 + aClass384_8394.buf[6] * i_2 + aClass384_8394.buf[10] * i_3;
		float f_9 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_4 + aClass384_8394.buf[6] * i_5 + aClass384_8394.buf[10] * i_6;
		float f_10 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_1 + aClass384_8394.buf[7] * i_2 + aClass384_8394.buf[11] * i_3;
		float f_11 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_4 + aClass384_8394.buf[7] * i_5 + aClass384_8394.buf[11] * i_6;
		if (f_8 < -f_10 && f_9 < -f_11)
			i_7 |= 0x10;
		else if (f_8 > f_10 && f_9 > f_11)
			i_7 |= 0x20;

		float f_12 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_1 + aClass384_8394.buf[4] * i_2 + aClass384_8394.buf[8] * i_3;
		float f_13 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_4 + aClass384_8394.buf[4] * i_5 + aClass384_8394.buf[8] * i_6;
		if (f_12 < -f_10 && f_13 < -f_11)
			i_7 |= 0x1;

		if (f_12 > f_10 && f_13 > f_11)
			i_7 |= 0x2;

		float f_14 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_1 + aClass384_8394.buf[5] * i_2 + aClass384_8394.buf[9] * i_3;
		float f_15 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_4 + aClass384_8394.buf[5] * i_5 + aClass384_8394.buf[9] * i_6;
		if (f_14 < -f_10 && f_15 < -f_11)
			i_7 |= 0x4;

		if (f_14 > f_10 && f_15 > f_11)
			i_7 |= 0x8;

		return i_7;
	}

	@Override
	public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_1 + aClass384_8394.buf[6] * i_2 + aClass384_8394.buf[10] * i_3;
		float f_9 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_4 + aClass384_8394.buf[6] * i_5 + aClass384_8394.buf[10] * i_6;
		float f_10 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_1 + aClass384_8394.buf[7] * i_2 + aClass384_8394.buf[11] * i_3;
		float f_11 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_4 + aClass384_8394.buf[7] * i_5 + aClass384_8394.buf[11] * i_6;
		if (f_8 < -f_10 && f_9 < -f_11)
			i_7 |= 0x10;
		else if (f_8 > f_10 && f_9 > f_11)
			i_7 |= 0x20;

		float f_12 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_1 + aClass384_8394.buf[4] * i_2 + aClass384_8394.buf[8] * i_3;
		float f_13 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_4 + aClass384_8394.buf[4] * i_5 + aClass384_8394.buf[8] * i_6;
		if (f_12 < -f_10 && f_13 < -f_11)
			i_7 |= 0x1;

		if (f_12 > f_10 && f_13 > f_11)
			i_7 |= 0x2;

		float f_14 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_1 + aClass384_8394.buf[5] * i_2 + aClass384_8394.buf[9] * i_3;
		float f_15 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_4 + aClass384_8394.buf[5] * i_5 + aClass384_8394.buf[9] * i_6;
		if (f_14 < -f_10 && f_15 < -f_11)
			i_7 |= 0x4;

		if (f_14 > f_10 && f_15 > f_11)
			i_7 |= 0x8;

		return i_7;
	}

	@Override
	public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_1 + aClass384_8394.buf[6] * i_2 + aClass384_8394.buf[10] * i_3;
		float f_9 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * i_4 + aClass384_8394.buf[6] * i_5 + aClass384_8394.buf[10] * i_6;
		float f_10 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_1 + aClass384_8394.buf[7] * i_2 + aClass384_8394.buf[11] * i_3;
		float f_11 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * i_4 + aClass384_8394.buf[7] * i_5 + aClass384_8394.buf[11] * i_6;
		if (f_8 < -f_10 && f_9 < -f_11)
			i_7 |= 0x10;
		else if (f_8 > f_10 && f_9 > f_11)
			i_7 |= 0x20;

		float f_12 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_1 + aClass384_8394.buf[4] * i_2 + aClass384_8394.buf[8] * i_3;
		float f_13 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * i_4 + aClass384_8394.buf[4] * i_5 + aClass384_8394.buf[8] * i_6;
		if (f_12 < -f_10 && f_13 < -f_11)
			i_7 |= 0x1;

		if (f_12 > f_10 && f_13 > f_11)
			i_7 |= 0x2;

		float f_14 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_1 + aClass384_8394.buf[5] * i_2 + aClass384_8394.buf[9] * i_3;
		float f_15 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * i_4 + aClass384_8394.buf[5] * i_5 + aClass384_8394.buf[9] * i_6;
		if (f_14 < -f_10 && f_15 < -f_11)
			i_7 |= 0x4;

		if (f_14 > f_10 && f_15 > f_11)
			i_7 |= 0x8;

		return i_7;
	}

	@Override
	public Node_Sub1 method8541(int i_1) {
		Node_Sub1_Sub1 class282_sub1_sub1_2 = new Node_Sub1_Sub1(i_1);
		aClass473_8369.insertBack(class282_sub1_sub1_2);
		return class282_sub1_sub1_2;
	}

	@Override
	public void method8542(Node_Sub1 class282_sub1_1) {
		aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			anInterface14_8496 = method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index * -1115476867 * -1990677291, false);
			aClass143_8494 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 3, 0);
			aClass143_8495 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 2, 12);
			aClass134_8359.method2328(this);
		}

	}

	@Override
	public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new OpenGLSprite(this, i_4, i_5, ints_1, i_2, i_3);
	}

	@Override
	public void method8544(Node_Sub1 class282_sub1_1) {
		aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			anInterface14_8496 = method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index * -1115476867 * -1990677291, false);
			aClass143_8494 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 3, 0);
			aClass143_8495 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 2, 12);
			aClass134_8359.method2328(this);
		}

	}

	@Override
	public int method8546(int i_1, int i_2) {
		return i_1 | i_2;
	}

	@Override
	public void method8547(int nodeCount, GLLight[] nodes) {
		for(int index = 0; index < nodeCount; index++)
			lights[index] = nodes[index];

		maxActiveLightIndex = nodeCount;
		if (anInt8409 != 1)
			renderLights();

	}

	@Override
	public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new OpenGLSprite(this, i_4, i_5, ints_1, i_2, i_3);
	}

	@Override
	public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new OpenGLSprite(this, i_1, i_2, i_3, i_4);
	}

	@Override
	public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	@Override
	public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	@Override
	void method8555() throws Exception_Sub3 {
		try {
			aClass158_Sub2_5841.method14344();
		} catch (Exception ignored) {
		}

		if (textureCache != null)
			textureCache.method161();

	}

	@Override
	public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	@Override
	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		if (class152_1 != null && class152_2 != null && supportsCubeMaps && supportsFBO) {
			Class152_Sub1_Sub2 class152_sub1_sub2_5 = null;
			Class152_Sub1 class152_sub1_6 = (Class152_Sub1) class152_1;
			Class152_Sub1 class152_sub1_7 = (Class152_Sub1) class152_2;
			Class137_Sub2 class137_sub2_8 = class152_sub1_6.method13519();
			Class137_Sub2 class137_sub2_9 = class152_sub1_7.method13519();
			if (class137_sub2_8 != null && class137_sub2_9 != null) {
				int i_10 = Math.max(class137_sub2_8.anInt9104, class137_sub2_9.anInt9104);
				if (class152_1 != class152_4 && class152_2 != class152_4 && class152_4 instanceof Class152_Sub1_Sub2 class152_sub1_sub2_11) {
					if (class152_sub1_sub2_11.method15532() == i_10)
						class152_sub1_sub2_5 = class152_sub1_sub2_11;
				}

				if (class152_sub1_sub2_5 == null)
					class152_sub1_sub2_5 = new Class152_Sub1_Sub2(this, i_10);

				if (class152_sub1_sub2_5.method15531(class137_sub2_8, class137_sub2_9, f_3))
					return class152_sub1_sub2_5;
			}
		}

		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	@Override
	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub1(this, canvas_1);
	}

	@Override
	public void method8559(int i_1) {
	}

	@Override
	public void method8560(int i_1) {
	}

	@Override
	public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	@Override
	public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (i_3 != i_1 || i_2 != i_4) {
			Class455_Sub2 class455_sub2_13 = (Class455_Sub2) class455_7;
			Class137_Sub1_Sub1 class137_sub1_sub1_14 = class455_sub2_13.aClass137_Sub1_Sub1_8974;
			method13637();
			setTexture(class455_sub2_13.aClass137_Sub1_Sub1_8974);
			setColorRenderType(1);
			method13717(7681, 8448);
			method13595(0, 34167, GL_SRC_COLOR);
			float f_15 = class137_sub1_sub1_14.aFloat10132 / class137_sub1_sub1_14.anInt10136;
			float f_16 = class137_sub1_sub1_14.aFloat10134 / class137_sub1_sub1_14.anInt10133;
			float f_17 = (float) i_3 - i_1;
			float f_18 = (float) i_4 - i_2;
			float f_19 = (float) (1.0D / Math.sqrt(f_17 * f_17 + f_18 * f_18));
			f_17 *= f_19;
			f_18 *= f_19;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_12 %= i_11 + i_10;
			float f_20 = f_17 * i_10;
			float f_21 = f_18 * i_10;
			float f_22 = 0.0F;
			float f_23 = 0.0F;
			float f_24 = f_20;
			float f_25 = f_21;
			if (i_12 > i_10) {
				f_22 = f_17 * (i_11 + i_10 - i_12);
				f_23 = f_18 * (i_11 + i_10 - i_12);
			} else {
				f_24 = f_17 * (i_10 - i_12);
				f_25 = f_18 * (i_10 - i_12);
			}

			float f_26 = i_1 + 0.35F + f_22;
			float f_27 = i_2 + 0.35F + f_23;
			float f_28 = f_17 * i_11;
			float f_29 = f_18 * i_11;

			while (true) {
				if (i_3 > i_1) {
					if (f_26 > i_3 + 0.35F)
						break;

					if (f_26 + f_24 > i_3)
						f_24 = i_3 - f_26;
				} else {
					if (f_26 < i_3 + 0.35F)
						break;

					if (f_26 + f_24 < i_3)
						f_24 = i_3 - f_26;
				}

				if (i_4 > i_2) {
					if (f_27 > i_4 + 0.35F)
						break;

					if (f_27 + f_25 > i_4)
						f_25 = i_4 - f_27;
				} else {
					if (f_27 < i_4 + 0.35F)
						break;

					if (f_27 + f_25 < i_4)
						f_25 = i_4 - f_27;
				}

				OpenGL.glBegin(GL_LINES);
				OpenGL.glTexCoord2f(f_15 * (f_26 - i_8), f_16 * (f_27 - i_9));
				OpenGL.glVertex2f(f_26, f_27);
				OpenGL.glTexCoord2f(f_15 * (f_26 + f_24 - i_8), f_16 * (f_27 + f_25 - i_9));
				OpenGL.glVertex2f(f_26 + f_24, f_27 + f_25);
				OpenGL.glEnd();
				f_26 += f_28 + f_24;
				f_27 += f_29 + f_25;
				f_24 = f_20;
				f_25 = f_21;
			}

			method13595(0, GL_TEXTURE, GL_SRC_COLOR);
		}

	}

	@Override
	public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	@Override
	public int method8565(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	@Override
	public int method8566(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	@Override
	public int method8567(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	@Override
	public void method8568() {
	}

	@Override
	public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
		return new OpenGLGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, i_5);
	}

	@Override
	public Node_Sub1 method8570(int i_1) {
		Node_Sub1_Sub1 class282_sub1_sub1_2 = new Node_Sub1_Sub1(i_1);
		aClass473_8369.insertBack(class282_sub1_sub1_2);
		return class282_sub1_sub1_2;
	}

	@Override
	public Matrix44 method8571() {
		return aClass384_8360;
	}

	@Override
	public Matrix44Var method8572() {
		return aClass294_8476;
	}

	@Override
	public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * f_1 + aClass384_8394.buf[7] * f_2 + aClass384_8394.buf[11] * f_3;
		float f_6 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * f_1 + aClass384_8394.buf[4] * f_2 + aClass384_8394.buf[8] * f_3;
		float f_7 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * f_1 + aClass384_8394.buf[5] * f_2 + aClass384_8394.buf[9] * f_3;
		float f_8 = aClass384_8348.buf[14] + aClass384_8348.buf[2] * f_1 + aClass384_8348.buf[6] * f_2 + aClass384_8348.buf[10] * f_3;
		floats_4[0] = aFloat8315 + aFloat8398 * f_6 / f_5;
		floats_4[1] = aFloat8399 + aFloat8400 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	@Override
	public int method8574() {
		return 4;
	}

	@Override
	public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		setColorRenderType(i_6);
		method13717(GL_REPLACE, GL_MODULATE);
		method13595(0, GL_PRIMARY_COLOR, GL_SRC_COLOR);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - i_1;
		float f_15 = (float) i_4 - i_2;
		float f_16 = (float) (1.0D / Math.sqrt(f_14 * f_14 + f_15 * f_15));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glTexCoord2f(f_12 * (i_1 - i_8), f_13 * (i_2 - i_9));
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (i_3 - i_8), f_13 * (i_4 - i_9));
		OpenGL.glVertex2f(i_3 + f_14 + 0.35F, i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		setColorRenderType(i_6);
		method13717(7681, 8448);
		method13595(0, 34167, GL_SRC_COLOR);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - i_1;
		float f_15 = (float) i_4 - i_2;
		float f_16 = (float) (1.0D / Math.sqrt(f_14 * f_14 + f_15 * f_15));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glTexCoord2f(f_12 * (i_1 - i_8), f_13 * (i_2 - i_9));
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (i_3 - i_8), f_13 * (i_4 - i_9));
		OpenGL.glVertex2f(i_3 + f_14 + 0.35F, i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new OpenGLSprite(this, i_1, i_2, bool_3);
	}

	@Override
	public boolean method8578() {
		return supportsMultiSample && (!method8471() || supportsPostProcessing);
	}

	@Override // dead code
	public void method8579(int i_1, GLLight[] arr_2) {
		if (i_1 >= 0) System.arraycopy(arr_2, 0, lights, 0, i_1);

		maxActiveLightIndex = i_1;
		if (anInt8409 != 1)
			renderLights();

	}

	@Override
	public void method8580(Class151 class151_1) {
		aClass134_8359.method2329(this, class151_1);
	}

	@Override
	public void method8581(Class151 class151_1) {
		aClass134_8359.method2329(this, class151_1);
	}

	@Override
	public Matrix44Var method8583() {
		return new Matrix44Var(aClass294_8389);
	}

	@Override
	public void method8584(Class152 class152_1) {
		aClass152_Sub1_8317 = (Class152_Sub1) class152_1;
	}

	@Override
	public void method8585(int i_1, HDWaterTile class90_2) {
		anInt8450 = i_1;
		aClass90_8423 = class90_2;
		aBool8448 = true;
	}

	@Override
	public void method8586(Matrix44 matrix44_1) {
		aClass384_8442.copy(matrix44_1);
		method13597();
		method13588();
	}

	@Override
	public Matrix44 method8587() {
		return new Matrix44(aClass384_8442);
	}

	@Override
	public Matrix44 method8588() {
		return new Matrix44(aClass384_8442);
	}

	@Override
	public Matrix44 method8589() {
		return new Matrix44(aClass384_8442);
	}

	@Override
	public Matrix44 method8590() {
		return new Matrix44(aClass384_8442);
	}

	@Override
	void method8592(float f_1, float f_2, float f_3) {
		Node_Sub5_Sub1.aFloat10026 = f_1;
		Node_Sub5_Sub1.aFloat10025 = f_2;
		Node_Sub5_Sub1.aFloat10024 = f_3;
	}

	@Override
	public void method8594(boolean bool_1) {
	}

	@Override
	public void method8595(boolean bool_1) {
	}

	@Override
	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		try {
			aClass158_Sub2_5841.method14344();
		} catch (Exception ignored) {
		}

		if (textureCache != null)
			textureCache.method161();

	}

	@Override
	public void method8598(Class152 class152_1) {
		aClass152_Sub1_8317 = (Class152_Sub1) class152_1;
	}

	@Override
	public boolean method8599() {
		return aNode_Sub5_Sub1_8444 != null && (anInt8475 <= 1 || supportsPostProcessing);
	}

	@Override
	public boolean method8600() {
		if (aNode_Sub5_Sub1_8444 == null)
			return false;
		if (!aNode_Sub5_Sub1_8444.method12129()) {
			if (!aClass170_8357.method2900(aNode_Sub5_Sub1_8444))
				return false;

			aClass167_8481.method2861();
		}

		return true;
	}

	@Override
	public void method8601() {
		if (aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129()) {
			aClass170_8357.method2885(aNode_Sub5_Sub1_8444);
			aClass167_8481.method2861();
		}

	}

	@Override
	public void method8602() {
		if (aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129()) {
			aClass170_8357.method2885(aNode_Sub5_Sub1_8444);
			aClass167_8481.method2861();
		}

	}

	@Override
	public void method8603(int i_1, int i_2, int i_3, int i_4) {
		aClass170_8357.method2884(i_1, i_2, i_3, i_4);
	}

	@Override
	public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new OpenGLSprite(this, i_1, i_2, i_3, i_4);
	}

	@Override
	public boolean method8605() {
		return aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129();
	}

	@Override
	public boolean method8606() {
		return aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129();
	}

	@Override
	public boolean method8607() {
		return aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129();
	}

	@Override
	void method8608(float f_1, float f_2, float f_3, float f_6) {
		Node_Sub5_Sub1.aFloat10026 = f_1;
		Node_Sub5_Sub1.aFloat10025 = f_2;
		Node_Sub5_Sub1.aFloat10024 = f_3;
	}

	@Override
	public boolean method8609() {
		return false;
	}

	@Override
	public void method8611() {
		aClass170_8357.method2883();
	}

	@Override
	public NativeSprite method8612(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = new int[class91_1.width * class91_1.height];
		int i_4 = 0;
		int i_5 = 0;
		int i_6;
		int i_7;
		if (class91_1.alpha != null)
			for (i_6 = 0; i_6 < class91_1.height; i_6++)
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					ints_3[i_5++] = class91_1.alpha[i_4] << 24 | class91_1.pallete[class91_1.pixels[i_4] & 0xff];
					++i_4;
				}
		else
			for (i_6 = 0; i_6 < class91_1.height; i_6++)
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					int i_8 = class91_1.pallete[class91_1.pixels[i_4++] & 0xff];
					ints_3[i_5++] = i_8 != 0 ? -16777216 | i_8 : 0;
				}

		NativeSprite nativesprite_9 = createNativeSprite(ints_3, class91_1.width, class91_1.width, class91_1.height);
		nativesprite_9.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_9;
	}

	@Override
	public void method8613() {
		aClass170_8357.method2883();
	}

	@Override
	public boolean method8614() {
		return true;
	}

	@Override
	public void method8615(int i_1, HDWaterTile class90_2) {
		if (!aBool8448)
			throw new RuntimeException("");
		anInt8450 = i_1;
		aClass90_8423 = class90_2;
		if (aBool8449) {
			aClass146_8356.aClass141_Sub4_1715.method14427();
			aClass146_8356.aClass141_Sub4_1715.method14428();
		}
	}

	@Override
	public void method8616(int i_1, HDWaterTile class90_2) {
		if (!aBool8448)
			throw new RuntimeException("");
		anInt8450 = i_1;
		aClass90_8423 = class90_2;
		if (aBool8449) {
			aClass146_8356.aClass141_Sub4_1715.method14427();
			aClass146_8356.aClass141_Sub4_1715.method14428();
		}
	}

	@Override
	public void method8617(int i_1, int i_2, int i_3, int i_4) {
		anInt8417 = i_1;
		anInt8418 = i_2;
		anInt8419 = i_3;
		anInt8347 = i_4;
		method13584();
	}

	@Override
	public void method8618(Node_Sub1 class282_sub1_1) {
		aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(-1.0f);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(-1.0f);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			anInterface14_8496 = method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index * -1115476867 * -1990677291, false);
			aClass143_8494 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 3, 0);
			aClass143_8495 = new OpenGlArrayBufferPointer(anInterface14_8496, 5126, 2, 12);
			aClass134_8359.method2328(this);
		}

	}

	@Override
	public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = aClass384_8394.buf[14] + aClass384_8394.buf[2] * f_1 + aClass384_8394.buf[6] * f_2 + aClass384_8394.buf[10] * f_3;
		float f_6 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * f_1 + aClass384_8394.buf[7] * f_2 + aClass384_8394.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * f_1 + aClass384_8394.buf[4] * f_2 + aClass384_8394.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * f_1 + aClass384_8394.buf[5] * f_2 + aClass384_8394.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = aClass384_8348.buf[14] + aClass384_8348.buf[2] * f_1 + aClass384_8348.buf[6] * f_2 + aClass384_8348.buf[10] * f_3;
					floats_4[0] = aFloat8315 + aFloat8398 * f_7 / f_6;
					floats_4[1] = aFloat8399 + aFloat8400 * f_8 / f_6;
					floats_4[2] = f_9;
				} else {
					floats_4[2] = Float.NaN;
					floats_4[1] = Float.NaN;
					floats_4[0] = Float.NaN;
				}
			} else {
				floats_4[2] = Float.NaN;
				floats_4[1] = Float.NaN;
				floats_4[0] = Float.NaN;
			}
		} else {
			floats_4[2] = Float.NaN;
			floats_4[1] = Float.NaN;
			floats_4[0] = Float.NaN;
		}

	}

	@Override
	public Class158_Sub1 method8620() {
		return new FrameBufferObject(this);
	}

	@Override
	public Interface8 method8621(int i_1, int i_2) {
		return new CacheableNode_Sub19(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	@Override
	public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	@Override
	public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	@Override
	public FontRenderer method8625(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		return new FontRenderer_Sub5(this, fontmetrics_1, arr_2, bool_3);
	}

	@Override
	public Matrix44Var method8626() {
		return aClass294_8476;
	}

	@Override
	public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		method13659();
		setColorRenderType(i_13);
		OpenGL.glBegin(GL_TRIANGLES);
		OpenGL.glColor4ub((byte) (i_10 >> 16), (byte) (i_10 >> 8), (byte) i_10, (byte) (i_10 >> 24));
		OpenGL.glVertex3f(i_1 + 0.35F, i_2 + 0.35F, f_3);
		OpenGL.glColor4ub((byte) (i_11 >> 16), (byte) (i_11 >> 8), (byte) i_11, (byte) (i_11 >> 24));
		OpenGL.glVertex3f(i_4 + 0.35F, i_5 + 0.35F, f_6);
		OpenGL.glColor4ub((byte) (i_12 >> 16), (byte) (i_12 >> 8), (byte) i_12, (byte) (i_12 >> 24));
		OpenGL.glVertex3f(i_7 + 0.35F, i_8 + 0.35F, f_9);
		OpenGL.glEnd();
	}

	@Override
	public boolean method8628() {
		if (aNode_Sub5_Sub1_8444 == null)
			return false;
		if (!aNode_Sub5_Sub1_8444.method12129()) {
			if (!aClass170_8357.method2900(aNode_Sub5_Sub1_8444))
				return false;

			aClass167_8481.method2861();
		}

		return true;
	}

	@Override
	public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		method13659();
		setColorRenderType(i_13);
		OpenGL.glBegin(GL_TRIANGLES);
		OpenGL.glColor4ub((byte) (i_10 >> 16), (byte) (i_10 >> 8), (byte) i_10, (byte) (i_10 >> 24));
		OpenGL.glVertex3f(i_1 + 0.35F, i_2 + 0.35F, f_3);
		OpenGL.glColor4ub((byte) (i_11 >> 16), (byte) (i_11 >> 8), (byte) i_11, (byte) (i_11 >> 24));
		OpenGL.glVertex3f(i_4 + 0.35F, i_5 + 0.35F, f_6);
		OpenGL.glColor4ub((byte) (i_12 >> 16), (byte) (i_12 >> 8), (byte) i_12, (byte) (i_12 >> 24));
		OpenGL.glVertex3f(i_7 + 0.35F, i_8 + 0.35F, f_9);
		OpenGL.glEnd();
	}

	@Override
	public int method8630(int i_1, int i_2) {
		return i_1 | i_2;
	}

	@Override
	public int method8632(int i_1, int i_2) {
		return i_1 | i_2;
	}

	@Override
	public void method8633() {
		anInt8417 = 0;
		anInt8418 = 0;
		anInt8419 = aClass158_5853.getWidth();
		anInt8347 = aClass158_5853.getHeight();
		method13584();
	}

	@Override
	public void method8634() {
		anInt8417 = 0;
		anInt8418 = 0;
		anInt8419 = aClass158_5853.getWidth();
		anInt8347 = aClass158_5853.getHeight();
		method13584();
	}

	@Override
	public void method8635() {
		anInt8417 = 0;
		anInt8418 = 0;
		anInt8419 = aClass158_5853.getWidth();
		anInt8347 = aClass158_5853.getHeight();
		method13584();
	}

	@Override
	public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return supportsCubeMaps ? new Class152_Sub1_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6) : null;
	}

	@Override
	public boolean method8644() {
		return true;
	}

	@Override
	public boolean method8649() {
		return aNode_Sub5_Sub1_8444 != null && (anInt8475 <= 1 || supportsPostProcessing);
	}

	@Override
	public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = aClass384_8394.buf[15] + aClass384_8394.buf[3] * f_1 + aClass384_8394.buf[7] * f_2 + aClass384_8394.buf[11] * f_3;
		float f_6 = aClass384_8394.buf[12] + aClass384_8394.buf[0] * f_1 + aClass384_8394.buf[4] * f_2 + aClass384_8394.buf[8] * f_3;
		float f_7 = aClass384_8394.buf[13] + aClass384_8394.buf[1] * f_1 + aClass384_8394.buf[5] * f_2 + aClass384_8394.buf[9] * f_3;
		float f_8 = aClass384_8348.buf[14] + aClass384_8348.buf[2] * f_1 + aClass384_8348.buf[6] * f_2 + aClass384_8348.buf[10] * f_3;
		floats_4[0] = aFloat8315 + aFloat8398 * f_6 / f_5;
		floats_4[1] = aFloat8399 + aFloat8400 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	@Override
	public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new OpenGLSprite(this, i_1, i_2, bool_3);
	}

	@Override
	public void method8658() {
		method13659();
		setColorRenderType(1);
		OpenGL.glBegin(GL_TRIANGLES);
		OpenGL.glColor4ub((byte) (-65536 >> 16), (byte) (-65536 >> 8), (byte) -65536, (byte) (-65536 >> 24));
		OpenGL.glVertex3f(5.35f, 10.35f, (float) 100.0);
		OpenGL.glColor4ub((byte) (-65536 >> 16), (byte) (-65536 >> 8), (byte) -65536, (byte) (-65536 >> 24));
		OpenGL.glVertex3f(75.35f, 50.35f, (float) 100.0);
		OpenGL.glColor4ub((byte) (-65536 >> 16), (byte) (-65536 >> 8), (byte) -65536, (byte) (-65536 >> 24));
		OpenGL.glVertex3f(15.35f, 90.35f, (float) 100.0);
		OpenGL.glEnd();
	}

	@Override
	public FontRenderer method8660(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		return new FontRenderer_Sub5(this, fontmetrics_1, arr_2, bool_3);
	}

	@Override
	public boolean method8664() {
		return true;
	}

	@Override
	public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new OpenGLSprite(this, i_1, i_2, i_3, i_4);
	}

	@Override
	public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		method13637();
		setTexture(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		setColorRenderType(1);
		method13717(7681, 8448);
		method13595(0, 34167, GL_SRC_COLOR);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - i_1;
		float f_15 = (float) i_4 - i_2;
		float f_16 = (float) (1.0D / Math.sqrt(f_14 * f_14 + f_15 * f_15));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glTexCoord2f(f_12 * (i_1 - i_8), f_13 * (i_2 - i_9));
		OpenGL.glVertex2f(i_1 + 0.35F, i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (i_3 - i_8), f_13 * (i_4 - i_9));
		OpenGL.glVertex2f(i_3 + f_14 + 0.35F, i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
	}

	@Override
	public void method8673(int i_1, int i_2, int i_3, int i_4) {
		aClass170_8357.method2884(i_1, i_2, i_3, i_4);
	}

	@Override
	public boolean method8674() {
		return true;
	}

	@Override
	public boolean method8679() {
		return aNode_Sub5_Sub1_8444 != null && aNode_Sub5_Sub1_8444.method12129();
	}

	@Override
	public Matrix44Var method8685() {
		return new Matrix44Var(aClass294_8389);
	}

	@Override
	public void method8691() {
		aClass170_8357.method2883();
	}

	@Override
	public void N(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		float f_10;
		float f_11;
		if (aClass137_Sub1_Sub1_8462 != null && aClass137_Sub1_Sub1_8462.anInt9087 >= i_3 && aClass137_Sub1_Sub1_8462.anInt9086 >= i_4) {
			aClass137_Sub1_Sub1_8462.method14455(0, i_3, i_4, bytes_7, Class150.aClass150_1951, 0, false);
			f_10 = aClass137_Sub1_Sub1_8462.aFloat10134 * i_4 / aClass137_Sub1_Sub1_8462.anInt9086;
			f_11 = aClass137_Sub1_Sub1_8462.aFloat10132 * i_3 / aClass137_Sub1_Sub1_8462.anInt9087;
		} else {
			aClass137_Sub1_Sub1_8462 = Class137_Sub1_Sub1.method15540(this, Class150.aClass150_1951, Class76.aClass76_751, i_3, i_4, bytes_7, Class150.aClass150_1951);
			aClass137_Sub1_Sub1_8462.method14445(false, false);
			f_10 = aClass137_Sub1_Sub1_8462.aFloat10134;
			f_11 = aClass137_Sub1_Sub1_8462.aFloat10132;
		}

		method13637();
		setTexture(aClass137_Sub1_Sub1_8462);
		setColorRenderType(i_9);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		method13617(i_6);
		method13717(GL_INTERPOLATE, GL_INTERPOLATE);
		method13595(0, GL_CONSTANT, GL_SRC_COLOR);
		method13595(2, GL_TEXTURE, GL_SRC_ALPHA);
		method13616(0, GL_CONSTANT);
		method13616(2, GL_TEXTURE);
		float f_12 = i_1;
		float f_13 = i_2;
		float f_14 = f_12 + i_3;
		float f_15 = f_13 + i_4;
		OpenGL.glBegin(GL_QUADS);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glTexCoord2f(0.0F, f_11);
		OpenGL.glVertex2f(f_12, f_15);
		OpenGL.glTexCoord2f(f_10, f_11);
		OpenGL.glVertex2f(f_14, f_15);
		OpenGL.glTexCoord2f(f_10, 0.0F);
		OpenGL.glVertex2f(f_14, f_13);
		OpenGL.glEnd();
		method13595(0, GL_TEXTURE, GL_SRC_COLOR);
		method13595(2, GL_CONSTANT, GL_SRC_ALPHA);
		method13616(0, GL_TEXTURE);
		method13616(2, GL_CONSTANT);
	}

	@Override
	public void o(int i_1, int i_2, int i_3, int i_4) {
		if (anInt8413 < i_1)
			anInt8413 = i_1;

		if (anInt8412 > i_3)
			anInt8412 = i_3;

		if (anInt8415 < i_2)
			anInt8415 = i_2;

		if (anInt8478 > i_4)
			anInt8478 = i_4;

		OpenGL.glEnable(GL_SCISSOR_TEST);
		method13570();
	}

	@Override
	public void O() {
		aBool8448 = false;
	}

	void positionLights() {
		OpenGL.glLightfv(GL_LIGHT0, GL_POSITION, aFloatArray8426, 0);
		OpenGL.glLightfv(GL_LIGHT1, GL_POSITION, aFloatArray8427, 0);
	}

	void pushMatrix() {
		OpenGL.glPushMatrix();
	}

	@Override
	public void qa(int[] ints_1) {
		ints_1[0] = anInt8413;
		ints_1[1] = anInt8415;
		ints_1[2] = anInt8412;
		ints_1[3] = anInt8478;
	}

	@Override
	public void r(int i_1, int i_2, int i_3, int i_4) {
		int i_11 = i_1;
		int i_31 = i_3;
		int i_21 = i_2;
		int i_41 = i_4;
		if (aClass158_5853 != null) {
			if (i_11 < 0)
				i_11 = 0;

			if (i_31 > aClass158_5853.getWidth())
				i_31 = aClass158_5853.getWidth();

			if (i_21 < 0)
				i_21 = 0;

			if (i_41 > aClass158_5853.getHeight())
				i_41 = aClass158_5853.getHeight();

			anInt8413 = i_11;
			anInt8415 = i_21;
			anInt8412 = i_31;
			anInt8478 = i_41;
			OpenGL.glEnable(GL_SCISSOR_TEST);
			method13570();
		}

	}

	@Override
	public void RA(boolean bool_1) {
		aBool8353 = bool_1;
		method13579();
	}

	void renderLights() {
		int lightIndex;
		for (lightIndex = 0; lightIndex < maxActiveLightIndex; lightIndex++) {
			GLLight light = lights[lightIndex];
			int lightId = lightIndex + GL_LIGHT2;
			aFloatArray8322[0] = light.getX();
			aFloatArray8322[1] = light.getY();
			aFloatArray8322[2] = light.getZ();
			aFloatArray8322[3] = 1.0F;
			OpenGL.glLightfv(lightId, GL_POSITION, aFloatArray8322, 0);
			int color = light.getColor();
			float intensity = light.getIntensity() / 255.0F;
			aFloatArray8322[0] = (color >> 16 & 0xff) * intensity;
			aFloatArray8322[1] = (color >> 8 & 0xff) * intensity;
			aFloatArray8322[2] = (color & 0xff) * intensity;
			OpenGL.glLightfv(lightId, GL_DIFFUSE, aFloatArray8322, 0);
			OpenGL.glLightf(lightId, GL_QUADRATIC_ATTENUATION, 1.0F / (light.method12370() * light.method12370()));
			OpenGL.glEnable(lightId);
		}

		while (lightIndex < maxLightIndex) {
			OpenGL.glDisable(lightIndex + GL_LIGHT2);
			++lightIndex;
		}

		maxLightIndex = maxActiveLightIndex;
	}

	void setActiveTexture(int textureId) {
		if (currActiveTexture != textureId) {
			OpenGL.glActiveTexture(textureId + GL_TEXTURE0);
			currActiveTexture = textureId;
		}

	}

	void setColorRenderType(int _colorRenderType) {
		if (colorRenderType != _colorRenderType) {
			int _blendType;
			boolean _maskRgb;
			boolean _enableAlphaTest;
			if (_colorRenderType == 1) {
				_blendType = 1;
				_maskRgb = true;
				_enableAlphaTest = true;
			} else if (_colorRenderType == 2) {
				_blendType = 2;
				_maskRgb = true;
				_enableAlphaTest = false;
			} else if (_colorRenderType == 128) {
				_blendType = 3;
				_maskRgb = true;
				_enableAlphaTest = true;
			} else {
				_blendType = 0;
				_maskRgb = true;
				_enableAlphaTest = false;
			}

			if (_maskRgb != maskRgb) {
				OpenGL.glColorMask(_maskRgb, _maskRgb, _maskRgb, true);
				maskRgb = _maskRgb;
			}

			if (_enableAlphaTest != enableAlphaTest) {
				if (_enableAlphaTest)
					OpenGL.glEnable(GL_ALPHA_TEST);
				else
					OpenGL.glDisable(GL_ALPHA_TEST);

				enableAlphaTest = _enableAlphaTest;
			}

			if (_blendType != blendType) {
				if (_blendType == 1) {
					OpenGL.glEnable(GL_BLEND);
					OpenGL.glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
				} else if (_blendType == 2) {
					OpenGL.glEnable(GL_BLEND);
					OpenGL.glBlendFunc(GL_ONE, GL_ONE);
				} else if (_blendType == 3) {
					OpenGL.glEnable(GL_BLEND);
					OpenGL.glBlendFunc(GL_DST_COLOR, GL_ONE);
				} else
					OpenGL.glDisable(GL_BLEND);

				blendType = _blendType;
			}

			colorRenderType = _colorRenderType;
			anInt8382 &= ~0xc;
		}

	}

	void setLightDiffusion() {
		LIGHT_PARAMS[0] = aFloat8433 * aFloat8429;
		LIGHT_PARAMS[1] = aFloat8433 * aFloat8430;
		LIGHT_PARAMS[2] = aFloat8433 * aFloat8431;
		LIGHT_PARAMS[3] = 1.0F;
		OpenGL.glLightfv(GL_LIGHT0, GL_DIFFUSE, LIGHT_PARAMS, 0);
		LIGHT_PARAMS[0] = -aFloat8434 * aFloat8429;
		LIGHT_PARAMS[1] = -aFloat8434 * aFloat8430;
		LIGHT_PARAMS[2] = -aFloat8434 * aFloat8431;
		LIGHT_PARAMS[3] = 1.0F;
		OpenGL.glLightfv(GL_LIGHT1, GL_DIFFUSE, LIGHT_PARAMS, 0);
	}

	void setTexture(GLTexture texture) {
		GLTexture currTexture = textures[currActiveTexture];
		if (currTexture != texture) {
			if (texture != null) {
				if (currTexture != null) {
					if (currTexture.bindId != texture.bindId) {
						OpenGL.glDisable(currTexture.bindId);
						OpenGL.glEnable(texture.bindId);
					}
				} else
					OpenGL.glEnable(texture.bindId);

				OpenGL.glBindTexture(texture.bindId, texture.textureId);
			} else
				OpenGL.glDisable(currTexture.bindId);

			textures[currActiveTexture] = texture;
		}

		anInt8382 &= -2;
	}

	void setTextureModelView() {
		if (aBool8457) {
			OpenGL.glMatrixMode(GL_TEXTURE);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(GL_MODELVIEW);
			aBool8457 = false;
		}

	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		result.append(this.getClass().getName());
		result.append(" {");
		result.append(newLine);

		Field[] fields = this.getClass().getDeclaredFields();

		for (Field field : fields) {
			if (Modifier.isStatic(field.getModifiers()))
				continue;
			try {
				result.append("  ");
				result.append(field.getType().getCanonicalName() + " " + field.getName() + ": ");
				result.append(Utils.getFieldValue(this, field));
			} catch (Throwable ex) {
				System.out.println(ex);
			}
			result.append(newLine);
		}
		result.append("}");

		return result.toString();
	}

	@Override
	public void XA(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method13659();
		setColorRenderType(i_5);
		float f_6 = i_1 + 0.35F;
		float f_7 = i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(GL_LINES);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6 + i_3, f_7);
		OpenGL.glEnd();
	}

	@Override
	public int za() {
		return anInt8371 + anInt8370 + anInt8372;
	}

}