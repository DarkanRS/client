import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;

public class OpenGLGraphicalRenderer extends GraphicalRenderer {

	static int[] anIntArray8381 = new int[1000];
	static int anInt8421 = 4;
	static float[] aFloatArray8497 = new float[4];
	static float[] aFloatArray8322 = new float[4];
	Class137[] aClass137Array8482;
	Class137_Sub1 aClass137_Sub1_8460;
	Class158_Sub1_Sub4 aClass158_Sub1_Sub4_8493;
	int anInt8366;
	int anInt8384;
	boolean aBool8408;
	boolean aBool8459;
	int anInt8441;
	int anInt8428 = -1;
	boolean aBool8367 = false;
	int anInt8349 = 128;
	Class134 aClass134_8359 = new Class134();
	Matrix44Arr aClass384_8360 = new Matrix44Arr();
	Matrix44Arr aClass384_8361 = new Matrix44Arr();
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
	Matrix44Arr aClass384_8348 = new Matrix44Arr();
	Matrix44Arr aClass384_8391 = new Matrix44Arr();
	Matrix44Arr aClass384_8442 = new Matrix44Arr();
	Matrix44Arr aClass384_8385 = new Matrix44Arr();
	Matrix44Arr aClass384_8394 = new Matrix44Arr();
	float[][] aFloatArrayArray8395 = new float[6][4];
	float[] aFloatArray8396 = new float[4];
	float aFloat8364 = 0.0F;
	float aFloat8320 = 1.0F;
	float aFloat8403 = 0.0F;
	float aFloat8404 = -1.0F;
	Matrix44Var aClass294_8405 = new Matrix44Var();
	Matrix44Arr aClass384_8380 = new Matrix44Arr();
	Matrix44Arr aClass384_8407 = new Matrix44Arr();
	float[] aFloatArray8477 = new float[16];
	boolean aBool8353 = true;
	int anInt8415 = 0;
	int anInt8478 = 0;
	int anInt8413 = 0;
	int anInt8412 = 0;
	int anInt8453 = 0;
	int anInt8416 = 0;
	float[] aFloatArray8424 = new float[4];
	float[] aFloatArray8425 = new float[4];
	float[] aFloatArray8426 = new float[4];
	float[] aFloatArray8427 = new float[4];
	float aFloat8429 = 1.0F;
	float aFloat8430 = 1.0F;
	float aFloat8431 = 1.0F;
	float aFloat8433 = -1.0F;
	float aFloat8434 = -1.0F;
	Node_Sub24[] aNode_Sub24Array8435;
	int anInt8358;
	int anInt8378;
	float aFloat8446;
	float aFloat8355;
	boolean aBool8449;
	int anInt8455;
	int anInt8451;
	float aFloat8489;
	float aFloat8414;
	MeshRasterizer_Sub1[] aMeshRasterizer_Sub1Array8479;
	MeshRasterizer_Sub1[] aMeshRasterizer_Sub1Array8492;
	Node_Sub35_Sub1 aNode_Sub35_Sub1_8499;
	int[] anIntArray8500;
	int[] anIntArray8501;
	int[] anIntArray8502;
	byte[] aByteArray8503;
	int anInt8475;
	OpenGL anOpenGL8352;
	int anInt8410;
	boolean aBool8472;
	boolean aBool8487;
	boolean aBool8312;
	Class167 aClass167_8481;
	Class164 aClass164_8363;
	Class170 aClass170_8357;
	boolean aBool8401;
	boolean aBool8362;
	boolean aBool8465;
	Node_Sub5_Sub1 aNode_Sub5_Sub1_8444;
	Class146 aClass146_8356;
	boolean aBool8309;
	boolean aBool8393;
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
	int anInt8458;
	boolean aBool8422;
	boolean aBool8397;
	boolean aBool8388;
	int anInt8436;
	boolean aBool8440;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_8462;
	String aString8463;
	String aString8464;
	int anInt8443;
	int anInt8469;
	int anInt8470;
	int anInt8471;
	boolean aBool8467;
	boolean aBool8342;
	boolean aBool8484;
	boolean aBool8485;
	boolean aBool8365;
	boolean aBool8480;
	boolean aBool8498;
	boolean aBool8338;
	boolean aBool8488;
	boolean aBool8344;
	boolean aBool8456;
	int anInt8437;
	boolean aBool8387;
	Class152_Sub1 aClass152_Sub1_8317;
	Interface15 anInterface15_8452;

	final void method13570() {
		if (this.aClass158_5853 != null && this.anInt8413 < this.anInt8412 && this.anInt8415 < this.anInt8478) {
			OpenGL.glScissor(this.anInt8453 + this.anInt8413, this.anInt8416 + this.aClass158_5853.method2716() - this.anInt8478, this.anInt8412 - this.anInt8413, this.anInt8478 - this.anInt8415);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}

	}

	void method13571() {
		int i_1 = 0;

		while (!this.anOpenGL8352.method2570()) {
			if (i_1++ > 5) {
				throw new RuntimeException("");
			}

			Class89.sleep(1000L);
		}

	}

	public void method8507() {
		if (this.aBool8487 && this.aClass158_5853 != null) {
			int i_1 = this.anInt8413;
			int i_2 = this.anInt8412;
			int i_3 = this.anInt8415;
			int i_4 = this.anInt8478;
			this.L();
			int i_5 = this.anInt8417;
			int i_6 = this.anInt8418;
			int i_7 = this.anInt8419;
			int i_8 = this.anInt8347;
			this.method8421();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			this.method13586();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13654((Class137) null);
			this.method13581(-2);
			this.method13612(1);
			this.method13624(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, this.aClass158_5853.method2714(), this.aClass158_5853.method2716(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			this.r(i_1, i_3, i_2, i_4);
			this.method8617(i_5, i_6, i_7, i_8);
		}

	}

	void method13572() {
		this.aClass137Array8482 = new Class137[this.anInt8469];
		this.aClass137_Sub1_8460 = new Class137_Sub1(this, 3553, Class150.aClass150_1949, Class76.aClass76_751, 1, 1);
		new Class137_Sub1(this, 3553, Class150.aClass150_1949, Class76.aClass76_751, 1, 1);
		new Class137_Sub1(this, 3553, Class150.aClass150_1949, Class76.aClass76_751, 1, 1);

		for (int i_1 = 0; i_1 < 7; i_1++) {
			this.aMeshRasterizer_Sub1Array8479[i_1] = new MeshRasterizer_Sub1(this);
			this.aMeshRasterizer_Sub1Array8492[i_1] = new MeshRasterizer_Sub1(this);
		}

		if (this.aBool8472) {
			this.aClass158_Sub1_Sub4_8493 = new Class158_Sub1_Sub4(this);
			new Class158_Sub1_Sub4(this);
		}

	}

	void method13573() {
		this.method13581(-2);

		for (int i_1 = this.anInt8469 - 1; i_1 >= 0; --i_1) {
			this.method13610(i_1);
			this.method13654((Class137) null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}

		this.method13717(8448, 8448);
		this.method13595(2, 34168, 770);
		this.method13618();
		this.anInt8366 = 1;
		OpenGL.glEnable(3042);
		OpenGL.glBlendFunc(770, 771);
		this.anInt8384 = 1;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, 0.0F);
		this.aBool8408 = true;
		OpenGL.glColorMask(true, true, true, true);
		this.aBool8459 = true;
		this.method13642(true);
		this.method13620(true);
		this.method13656(true);
		this.method13623(true);
		this.GA();
		this.method13586();
		this.anOpenGL8352.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
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

		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		this.anInt8441 = -1;
		this.anInt8428 = -1;
		this.method8421();
		this.L();
	}

	void method8555() throws Exception_Sub3 {
		try {
			this.aClass158_Sub2_5841.method14344();
		} catch (Exception exception_4) {
			;
		}

		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-1871804143);
		}

	}

	public void method8395() {
		OpenGL.glFinish();
	}

	void method8397() {
		for (Node node_1 = this.aClass473_8369.getBack(); node_1 != null; node_1 = this.aClass473_8369.getPrevious()) {
			((Node_Sub1_Sub1) node_1).method15450();
		}

		if (this.aClass170_8357 != null) {
			this.aClass170_8357.method2898();
		}

		if (this.aBool8367) {
			Class13.method508(false, true, -600309245);
			this.aBool8367 = false;
		}

	}

	public boolean method8465() {
		return true;
	}

	public boolean method8664() {
		return true;
	}

	public boolean method8403() {
		return this.aNode_Sub5_Sub1_8444 != null && (this.anInt8475 <= 1 || this.aBool8344);
	}

	public boolean method8404() {
		return true;
	}

	final void method13576() {
		OpenGL.glPushMatrix();
	}

	public void fs(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method13659();
		this.method13624(i_5);
		float f_6 = (float) i_1 + 0.35F;
		float f_7 = (float) i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6 + (float) i_3, f_7);
		OpenGL.glEnd();
	}

	public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new NativeSprite_Sub2(this, i_1, i_2, i_3, i_4);
	}

	public boolean method8454() {
		return true;
	}

	OpenGLGraphicalRenderer(Canvas canvas_1, Interface22 interface22_2, int i_3) {
		super(interface22_2);
		this.aNode_Sub24Array8435 = new Node_Sub24[anInt8421];
		this.anInt8441 = -1;
		this.anInt8358 = -1;
		this.anInt8378 = 0;
		this.aFloat8446 = 1.0F;
		this.aFloat8355 = 0.0F;
		this.aBool8449 = false;
		this.anInt8455 = 8448;
		this.anInt8451 = 8448;
		this.aFloat8489 = -1.0F;
		this.aFloat8414 = -1.0F;
		this.aMeshRasterizer_Sub1Array8479 = new MeshRasterizer_Sub1[7];
		this.aMeshRasterizer_Sub1Array8492 = new MeshRasterizer_Sub1[7];
		this.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1(8192);
		this.anIntArray8500 = new int[1];
		this.anIntArray8501 = new int[1];
		this.anIntArray8502 = new int[1];
		this.aByteArray8503 = new byte[16384];

		try {
			this.anInt8475 = i_3;
			if (!Class362.getNativeLibraryLoader().loadLibrary("jaclib", 946095611)) {
				throw new RuntimeException("");
			} else if (!Class362.getNativeLibraryLoader().loadLibrary("jaggl", 560880433)) {
				throw new RuntimeException("");
			} else {
				this.anOpenGL8352 = new OpenGL();
				long long_4 = this.anOpenGL8352.init(canvas_1, 8, 8, 8, 24, 0, this.anInt8475);
				if (long_4 == 0L) {
					throw new RuntimeException("");
				} else {
					this.method13571();
					int i_6 = this.method13652();
					if (i_6 != 0) {
						throw new RuntimeException("");
					} else {
						this.anInt8410 = this.aBool8467 ? 33639 : 5121;
						if (this.aString8464.indexOf("radeon") != -1) {
							int i_7 = 0;
							boolean bool_8 = false;
							boolean bool_9 = false;
							String[] arr_10 = MovingAnimation.method12681(this.aString8464.replace('/', ' '), ' ');

							for (int i_11 = 0; i_11 < arr_10.length; i_11++) {
								String string_12 = arr_10[i_11];

								try {
									if (string_12.length() > 0) {
										if (string_12.charAt(0) == 120 && string_12.length() >= 3 && Class115.method1950(string_12.substring(1, 3), -2077836212)) {
											string_12 = string_12.substring(1);
											bool_9 = true;
										}

										if (string_12.equals("hd")) {
											bool_8 = true;
										} else {
											if (string_12.startsWith("hd")) {
												string_12 = string_12.substring(2);
												bool_8 = true;
											}

											if (string_12.length() >= 4 && Class115.method1950(string_12.substring(0, 4), 814122152)) {
												i_7 = Class328.parseInt(string_12.substring(0, 4), -1887024388);
												break;
											}
										}
									}
								} catch (Exception exception_17) {
									;
								}
							}

							if (!bool_9 && !bool_8) {
								if (i_7 >= 7000 && i_7 <= 7999) {
									this.aBool8309 = false;
								}

								if (i_7 >= 7000 && i_7 <= 9250) {
									this.aBool8393 = false;
								}
							}

							if (!bool_8 || i_7 < 4000) {
								this.aBool8312 = false;
							}

							this.aBool8401 &= this.anOpenGL8352.method2569("GL_ARB_half_float_pixel");
							this.aBool8362 = this.aBool8309;
							this.aBool8465 = true;
						}

						if (this.aString8463.indexOf("intel") != -1) {
							this.aBool8472 = false;
						}

						this.aBool8487 = !this.aString8463.equals("s3 graphics");
						if (this.aBool8309) {
							try {
								int[] ints_14 = new int[1];
								OpenGL.glGenBuffersARB(1, ints_14, 0);
							} catch (Throwable throwable_16) {
								throw new RuntimeException("");
							}
						}

						SunDefinitions.method854(false, true, -930172525);
						this.aBool8367 = true;
						this.aClass167_8481 = new Class167(this, this.anInterface22_5834);
						this.method13572();
						this.aClass164_8363 = new Class164(this);
						this.aClass170_8357 = new Class170(this);
						if (this.aClass170_8357.method2896()) {
							this.aNode_Sub5_Sub1_8444 = new Node_Sub5_Sub1(this);
							if (!this.aNode_Sub5_Sub1_8444.method15445()) {
								this.aNode_Sub5_Sub1_8444.method12120();
								this.aNode_Sub5_Sub1_8444 = null;
							}
						}

						this.method8411(canvas_1, new Class158_Sub2_Sub1(this, canvas_1, long_4));
						this.method8412(canvas_1);
						this.aClass146_8356 = new Class146(this);
						this.method13573();
						this.method8420();
					}
				}
			}
		} catch (Throwable throwable_18) {
			throwable_18.printStackTrace();
			this.method8396(-219989635);
			if (throwable_18 instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) throwable_18;
			} else {
				throw new RuntimeException("");
			}
		}
	}

	public void eq(boolean bool_1) {
		this.aBool8353 = bool_1;
		this.method13579();
	}

	void method13578() {
		this.method13639();
	}

	void method8531() {
		for (Node node_1 = this.aClass473_8369.getBack(); node_1 != null; node_1 = this.aClass473_8369.getPrevious()) {
			((Node_Sub1_Sub1) node_1).method15450();
		}

		if (this.aClass170_8357 != null) {
			this.aClass170_8357.method2898();
		}

		if (this.aBool8367) {
			Class13.method508(false, true, 912496616);
			this.aBool8367 = false;
		}

	}

	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 == null) {
			return null;
		} else {
			int[] ints_5 = new int[i_3 * i_4];
			int i_6 = this.aClass158_5853.method2716();

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt8410, ints_5, i_3 * i_7);
			}

			return ints_5;
		}
	}

	public void method8420() {
		if (this.aBool8487 && this.aClass158_5853 != null) {
			int i_1 = this.anInt8413;
			int i_2 = this.anInt8412;
			int i_3 = this.anInt8415;
			int i_4 = this.anInt8478;
			this.L();
			int i_5 = this.anInt8417;
			int i_6 = this.anInt8418;
			int i_7 = this.anInt8419;
			int i_8 = this.anInt8347;
			this.method8421();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			this.method13586();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13654((Class137) null);
			this.method13581(-2);
			this.method13612(1);
			this.method13624(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, this.aClass158_5853.method2714(), this.aClass158_5853.method2716(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			this.r(i_1, i_3, i_2, i_4);
			this.method8617(i_5, i_6, i_7, i_8);
		}

	}

	public void ba(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	public void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3 - 1.0F;
		float f_10 = f_8 + (float) i_4 - 1.0F;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	public void B(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3;
		float f_10 = f_8 + (float) i_4;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	final void method13579() {
		OpenGL.glDepthMask(this.aBool8388 && this.aBool8353);
	}

	public void method8658() {
		this.method13659();
		this.method13624(1);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (-65536 >> 16), (byte) (-65536 >> 8), (byte) -65536, (byte) (-65536 >> 24));
		OpenGL.glVertex3f((float) 5 + 0.35F, (float) 10 + 0.35F, (float) 100.0);
		OpenGL.glColor4ub((byte) (-65536 >> 16), (byte) (-65536 >> 8), (byte) -65536, (byte) (-65536 >> 24));
		OpenGL.glVertex3f((float) 75 + 0.35F, (float) 50 + 0.35F, (float) 100.0);
		OpenGL.glColor4ub((byte) (-65536 >> 16), (byte) (-65536 >> 8), (byte) -65536, (byte) (-65536 >> 24));
		OpenGL.glVertex3f((float) 15 + 0.35F, (float) 90 + 0.35F, (float) 100.0);
		OpenGL.glEnd();
	}

	public void RA(boolean bool_1) {
		this.aBool8353 = bool_1;
		this.method13579();
	}

	public final void method8446(Matrix44Arr matrix44arr_1) {
		this.aClass384_8442.method6562(matrix44arr_1);
		this.method13597();
		this.method13588();
	}

	final void method13581(int i_1) {
		this.method13608(i_1, true);
	}

	public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
		if (i_3 != i_1 || i_2 != i_4) {
			this.method13659();
			this.method13624(1);
			float f_10 = (float) i_3 - (float) i_1;
			float f_11 = (float) i_4 - (float) i_2;
			float f_12 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * (float) i_7;
			float f_14 = f_11 * (float) i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (float) (i_8 + i_7 - i_9);
				f_16 = f_11 * (float) (i_8 + i_7 - i_9);
			} else {
				f_17 = f_10 * (float) (i_7 - i_9);
				f_18 = f_11 * (float) (i_7 - i_9);
			}

			float f_19 = (float) i_1 + 0.35F + f_15;
			float f_20 = (float) i_2 + 0.35F + f_16;
			float f_21 = f_10 * (float) i_8;
			float f_22 = f_11 * (float) i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 > (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				} else {
					if (f_19 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 < (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				}

				if (i_4 > i_2) {
					if (f_20 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 > (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				} else {
					if (f_20 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 < (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				}

				OpenGL.glBegin(1);
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

	public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		this.method13624(1);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - (float) i_1;
		float f_15 = (float) i_4 - (float) i_2;
		float f_16 = (float) (1.0D / Math.sqrt((double) (f_14 * f_14 + f_15 * f_15)));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f_12 * (float) (i_1 - i_8), f_13 * (float) (i_2 - i_9));
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (float) (i_3 - i_8), f_13 * (float) (i_4 - i_9));
		OpenGL.glVertex2f((float) i_3 + f_14 + 0.35F, (float) i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (i_3 != i_1 || i_2 != i_4) {
			Class455_Sub2 class455_sub2_13 = (Class455_Sub2) class455_7;
			Class137_Sub1_Sub1 class137_sub1_sub1_14 = class455_sub2_13.aClass137_Sub1_Sub1_8974;
			this.method13637();
			this.method13654(class455_sub2_13.aClass137_Sub1_Sub1_8974);
			this.method13624(1);
			this.method13717(7681, 8448);
			this.method13595(0, 34167, 768);
			float f_15 = class137_sub1_sub1_14.aFloat10132 / (float) class137_sub1_sub1_14.anInt10136;
			float f_16 = class137_sub1_sub1_14.aFloat10134 / (float) class137_sub1_sub1_14.anInt10133;
			float f_17 = (float) i_3 - (float) i_1;
			float f_18 = (float) i_4 - (float) i_2;
			float f_19 = (float) (1.0D / Math.sqrt((double) (f_17 * f_17 + f_18 * f_18)));
			f_17 *= f_19;
			f_18 *= f_19;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_12 %= i_11 + i_10;
			float f_20 = f_17 * (float) i_10;
			float f_21 = f_18 * (float) i_10;
			float f_22 = 0.0F;
			float f_23 = 0.0F;
			float f_24 = f_20;
			float f_25 = f_21;
			if (i_12 > i_10) {
				f_22 = f_17 * (float) (i_11 + i_10 - i_12);
				f_23 = f_18 * (float) (i_11 + i_10 - i_12);
			} else {
				f_24 = f_17 * (float) (i_10 - i_12);
				f_25 = f_18 * (float) (i_10 - i_12);
			}

			float f_26 = (float) i_1 + 0.35F + f_22;
			float f_27 = (float) i_2 + 0.35F + f_23;
			float f_28 = f_17 * (float) i_11;
			float f_29 = f_18 * (float) i_11;

			while (true) {
				if (i_3 > i_1) {
					if (f_26 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_26 + f_24 > (float) i_3) {
						f_24 = (float) i_3 - f_26;
					}
				} else {
					if (f_26 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_26 + f_24 < (float) i_3) {
						f_24 = (float) i_3 - f_26;
					}
				}

				if (i_4 > i_2) {
					if (f_27 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_27 + f_25 > (float) i_4) {
						f_25 = (float) i_4 - f_27;
					}
				} else {
					if (f_27 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_27 + f_25 < (float) i_4) {
						f_25 = (float) i_4 - f_27;
					}
				}

				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f_15 * (f_26 - (float) i_8), f_16 * (f_27 - (float) i_9));
				OpenGL.glVertex2f(f_26, f_27);
				OpenGL.glTexCoord2f(f_15 * (f_26 + f_24 - (float) i_8), f_16 * (f_27 + f_25 - (float) i_9));
				OpenGL.glVertex2f(f_26 + f_24, f_27 + f_25);
				OpenGL.glEnd();
				f_26 += f_28 + f_24;
				f_27 += f_29 + f_25;
				f_24 = f_20;
				f_25 = f_21;
			}

			this.method13595(0, 5890, 768);
		}

	}

	public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		OpenGL.glLineWidth((float) i_6);
		this.method8433(i_1, i_2, i_3, i_4, i_5, i_7);
		OpenGL.glLineWidth(1.0F);
	}

	public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * f_1 + this.aClass384_8394.buf[7] * f_2 + this.aClass384_8394.buf[11] * f_3;
		float f_6 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * f_1 + this.aClass384_8394.buf[4] * f_2 + this.aClass384_8394.buf[8] * f_3;
		float f_7 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * f_1 + this.aClass384_8394.buf[5] * f_2 + this.aClass384_8394.buf[9] * f_3;
		float f_8 = this.aClass384_8348.buf[14] + this.aClass384_8348.buf[2] * f_1 + this.aClass384_8348.buf[6] * f_2 + this.aClass384_8348.buf[10] * f_3;
		floats_4[0] = this.aFloat8315 + this.aFloat8398 * f_6 / f_5;
		floats_4[1] = this.aFloat8399 + this.aFloat8400 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * f_1 + this.aClass384_8394.buf[6] * f_2 + this.aClass384_8394.buf[10] * f_3;
		float f_6 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * f_1 + this.aClass384_8394.buf[7] * f_2 + this.aClass384_8394.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * f_1 + this.aClass384_8394.buf[4] * f_2 + this.aClass384_8394.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * f_1 + this.aClass384_8394.buf[5] * f_2 + this.aClass384_8394.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.aClass384_8348.buf[14] + this.aClass384_8348.buf[2] * f_1 + this.aClass384_8348.buf[6] * f_2 + this.aClass384_8348.buf[10] * f_3;
					floats_4[0] = this.aFloat8315 + this.aFloat8398 * f_7 / f_6;
					floats_4[1] = this.aFloat8399 + this.aFloat8400 * f_8 / f_6;
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

	public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method13659();
		this.method13624(i_6);
		float f_7 = (float) i_3 - (float) i_1;
		float f_8 = (float) i_4 - (float) i_2;
		if (f_7 == 0.0F && f_8 == 0.0F) {
			f_7 = 1.0F;
		} else {
			float f_9 = (float) (1.0D / Math.sqrt((double) (f_7 * f_7 + f_8 * f_8)));
			f_7 *= f_9;
			f_8 *= f_9;
		}

		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glVertex2f((float) i_3 + f_7 + 0.35F, (float) i_4 + f_8 + 0.35F);
		OpenGL.glEnd();
	}

	public Node_Sub1 method8438(int i_1) {
		Node_Sub1_Sub1 class282_sub1_sub1_2 = new Node_Sub1_Sub1(i_1);
		this.aClass473_8369.insertBack(class282_sub1_sub1_2);
		return class282_sub1_sub1_2;
	}

	public void method8439(Node_Sub1 class282_sub1_1) {
		this.aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (this.anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (this.aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
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
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
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
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			this.anInterface14_8496 = this.method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index, false);
			this.aClass143_8494 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 3, 0);
			this.aClass143_8495 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 2, 12);
			this.aClass134_8359.method2328(this);
		}

	}

	public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new NativeSprite_Sub2(this, i_1, i_2, bool_3);
	}

	public NativeSprite method8444(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = new int[class91_1.width * class91_1.height];
		int i_4 = 0;
		int i_5 = 0;
		int i_6;
		int i_7;
		if (class91_1.alpha != null) {
			for (i_6 = 0; i_6 < class91_1.height; i_6++) {
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					ints_3[i_5++] = class91_1.alpha[i_4] << 24 | class91_1.pallete[class91_1.pixels[i_4] & 0xff];
					++i_4;
				}
			}
		} else {
			for (i_6 = 0; i_6 < class91_1.height; i_6++) {
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					int i_8 = class91_1.pallete[class91_1.pixels[i_4++] & 0xff];
					ints_3[i_5++] = i_8 != 0 ? ~0xffffff | i_8 : 0;
				}
			}
		}

		NativeSprite nativesprite_9 = this.createNativeSprite(ints_3, class91_1.width, class91_1.width, class91_1.height, -1670906477);
		nativesprite_9.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_9;
	}

	public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new NativeSprite_Sub2(this, i_4, i_5, ints_1, i_2, i_3);
	}

	public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new NativeSprite_Sub2(this, i_1, i_2, i_3, i_4);
	}

	public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	public void DA(Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		this.method13624(1);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / (float) class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / (float) class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (-16777216 >> 16), (byte) (-16777216 >> 8), (byte) -16777216, (byte) (-16777216 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8415);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8415);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void method8459() {
	}

	public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public int method8452(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public void fd(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	public final void c(int i_1, int i_2, int i_3) {
		if (this.anInt8441 != i_1 || i_2 != this.anInt8358 || i_3 != this.anInt8378) {
			this.anInt8441 = i_1;
			this.anInt8358 = i_2;
			this.anInt8378 = i_3;
			this.method13594();
			this.method13747();
		}

	}

	public Matrix44Arr method8449() {
		return this.aClass384_8360;
	}

	public Matrix44Var method8450() {
		return this.aClass294_8476;
	}

	public void method8456(Class151 class151_1) {
		this.aClass134_8359.method2329(this, class151_1);
	}

	public void method8475(HDWaterTile class90_2) {
		this.anInt8450 = -1;
		this.aClass90_8423 = class90_2;
		this.aBool8448 = true;
	}

	public void method8476(int i_1, HDWaterTile class90_2) {
		if (!this.aBool8448) {
			throw new RuntimeException("");
		} else {
			this.anInt8450 = i_1;
			this.aClass90_8423 = class90_2;
			if (this.aBool8449) {
				this.aClass146_8356.aClass141_Sub4_1715.method14427();
				this.aClass146_8356.aClass141_Sub4_1715.method14428();
			}

		}
	}

	public Interface8 method8419(int i_1, int i_2) {
		return new CacheableNode_Sub19(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	public void method8421() {
		this.anInt8417 = 0;
		this.anInt8418 = 0;
		this.anInt8419 = this.aClass158_5853.method2714();
		this.anInt8347 = this.aClass158_5853.method2716();
		this.method13584();
	}

	public void method8617(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8417 = i_1;
		this.anInt8418 = i_2;
		this.anInt8419 = i_3;
		this.anInt8347 = i_4;
		this.method13584();
	}

	public final void qa(int[] ints_1) {
		ints_1[0] = this.anInt8413;
		ints_1[1] = this.anInt8415;
		ints_1[2] = this.anInt8412;
		ints_1[3] = this.anInt8478;
	}

	public final void L() {
		if (this.aClass158_5853 != null) {
			this.anInt8413 = 0;
			this.anInt8415 = 0;
			this.anInt8412 = this.aClass158_5853.method2714();
			this.anInt8478 = this.aClass158_5853.method2716();
			OpenGL.glDisable(3089);
		}

	}

	public final void r(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 != null) {
			if (i_1 < 0) {
				i_1 = 0;
			}

			if (i_3 > this.aClass158_5853.method2714()) {
				i_3 = this.aClass158_5853.method2714();
			}

			if (i_2 < 0) {
				i_2 = 0;
			}

			if (i_4 > this.aClass158_5853.method2716()) {
				i_4 = this.aClass158_5853.method2716();
			}

			this.anInt8413 = i_1;
			this.anInt8415 = i_2;
			this.anInt8412 = i_3;
			this.anInt8478 = i_4;
			OpenGL.glEnable(3089);
			this.method13570();
		}

	}

	public final void o(int i_1, int i_2, int i_3, int i_4) {
		if (this.anInt8413 < i_1) {
			this.anInt8413 = i_1;
		}

		if (this.anInt8412 > i_3) {
			this.anInt8412 = i_3;
		}

		if (this.anInt8415 < i_2) {
			this.anInt8415 = i_2;
		}

		if (this.anInt8478 > i_4) {
			this.anInt8478 = i_4;
		}

		OpenGL.glEnable(3089);
		this.method13570();
	}

	public void O() {
		this.aBool8448 = false;
	}

	final void method13584() {
		if (this.aClass158_5853 != null) {
			int i_1;
			int i_2;
			int i_3;
			int i_4;
			if (this.anInt8409 == 2) {
				i_1 = this.anInt8417;
				i_2 = this.anInt8418;
				i_3 = this.anInt8419;
				i_4 = this.anInt8347;
			} else {
				i_1 = 0;
				i_2 = 0;
				i_3 = this.aClass158_5853.method2714();
				i_4 = this.aClass158_5853.method2716();
			}

			if (i_3 < 1) {
				i_3 = 1;
			}

			if (i_4 < 1) {
				i_4 = 1;
			}

			OpenGL.glViewport(i_1 + this.anInt8453, this.anInt8416 + this.aClass158_5853.method2716() - i_2 - i_4, i_3, i_4);
			this.aFloat8398 = (float) this.anInt8419 / 2.0F;
			this.aFloat8400 = (float) this.anInt8347 / 2.0F;
			this.aFloat8315 = (float) this.anInt8417 + this.aFloat8398;
			this.aFloat8399 = (float) this.anInt8418 + this.aFloat8400;
		}

	}

	public final void in(float f_1) {
		if (this.aFloat8432 != f_1) {
			this.aFloat8432 = f_1;
			this.method13689();
		}

	}

	public final synchronized void method8398(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!this.aClass473_8486.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8486.popTail();
			anIntArray8381[i_2++] = (int) class282_sub38_4.data;
			this.anInt8371 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8375.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8375.popTail();
			anIntArray8381[i_2++] = (int) class282_sub38_4.data;
			this.anInt8370 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8376.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8376.popTail();
			anIntArray8381[i_2++] = class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8377.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8377.popTail();
			anIntArray8381[i_2++] = (int) class282_sub38_4.data;
			this.anInt8372 -= class282_sub38_4.value;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
			boolean bool_3 = false;
		}

		while (!this.aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.data, class282_sub38_4.value);
		}

		Node node_5;
		while (!this.aClass473_8461.method7861()) {
			node_5 = this.aClass473_8461.popTail();
			OpenGL.glDeleteProgramARB((int) node_5.data);
		}

		while (!this.aClass473_8379.method7861()) {
			node_5 = this.aClass473_8379.popTail();
			OpenGL.glDeleteShader((int) node_5.data);
		}

		while (!this.aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) class282_sub38_4.data, class282_sub38_4.value);
		}

		this.aClass167_8481.method2860();
		if (this.za() > 100663296 && TextureDetails.time() > this.aLong8316 + 60000L) {
			System.gc();
			this.aLong8316 = TextureDetails.time();
		}

		this.anInt8368 = i_1;
	}

	void method8486() {
		for (Node node_1 = this.aClass473_8369.getBack(); node_1 != null; node_1 = this.aClass473_8369.getPrevious()) {
			((Node_Sub1_Sub1) node_1).method15450();
		}

		if (this.aClass170_8357 != null) {
			this.aClass170_8357.method2898();
		}

		if (this.aBool8367) {
			Class13.method508(false, true, 253235103);
			this.aBool8367 = false;
		}

	}

	void CA(int i_1, int i_2, int i_3, int i_4) {
		if (i_3 < 0) {
			i_3 = -i_3;
		}

		if (i_3 + i_1 >= this.anInt8413 && i_1 - i_3 <= this.anInt8412 && i_3 + i_2 >= this.anInt8415 && i_2 - i_3 <= this.anInt8478) {
			this.method13659();
			this.method13624(1);
			OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
			float f_6 = (float) i_1 + 0.35F;
			float f_7 = (float) i_2 + 0.35F;
			int i_8 = i_3 << 1;
			if ((float) i_8 < this.aFloat8414) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 + 1.0F);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 + 1.0F);
				OpenGL.glEnd();
			} else if ((float) i_8 <= this.aFloat8489) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize((float) i_8);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f_6, f_7);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f_6, f_7);
				int i_9 = 262144 / (i_3 * 6);
				if (i_9 <= 64) {
					i_9 = 64;
				} else if (i_9 > 512) {
					i_9 = 512;
				}

				i_9 = Class51.method1072(i_9, 1399937538);
				OpenGL.glVertex2f(f_6 + (float) i_3, f_7);

				for (int i_10 = 16384 - i_9; i_10 > 0; i_10 -= i_9) {
					OpenGL.glVertex2f(f_6 + Class142.aFloatArray1665[i_10] * (float) i_3, f_7 + Class142.aFloatArray1666[i_10] * (float) i_3);
				}

				OpenGL.glVertex2f(f_6 + (float) i_3, f_7);
				OpenGL.glEnd();
			}
		}

	}

	final void method13585(Matrix44Arr matrix44arr_1) {
		OpenGL.glLoadMatrixf(matrix44arr_1.buf, 0);
	}

	public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	public final void method8457(Matrix44Var matrix44var_1) {
		this.aClass294_8389.method5209(matrix44var_1);
		this.aClass384_8348.fromVarMatrix44(this.aClass294_8389);
		this.aClass294_8405.method5209(matrix44var_1);
		this.aClass294_8405.method5207();
		this.aClass384_8391.fromVarMatrix44(this.aClass294_8405);
		this.method13597();
		if (this.anInt8409 != 1) {
			this.method13748();
		}

	}

	public Matrix44Var method8458() {
		return new Matrix44Var(this.aClass294_8389);
	}

	public boolean method8501() {
		return this.aBool8342 && (!this.method8471() || this.aBool8344);
	}

	public Class168 method8481() {
		int i_1 = -1;
		if (this.aString8463.indexOf("nvidia") != -1) {
			i_1 = 4318;
		} else if (this.aString8463.indexOf("intel") != -1) {
			i_1 = 32902;
		} else if (this.aString8463.indexOf("ati") != -1) {
			i_1 = 4098;
		}

		return new Class168(i_1, "OpenGL", this.anInt8443, this.aString8464, 0L);
	}

	public final Matrix44Arr method8453() {
		return new Matrix44Arr(this.aClass384_8442);
	}

	final void method13586() {
		if (this.anInt8409 != 0) {
			this.anInt8409 = 0;
			this.method13584();
			this.method13671();
			this.anInt8382 &= ~0xf;
		}

	}

	final void method13587() {
		if (this.anInt8409 != 1) {
			this.anInt8409 = 1;
			this.method13588();
			this.method13584();
			this.method13671();
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			this.anInt8382 &= ~0x8;
		}

	}

	public int method8566(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	final void method13588() {
		this.aFloat8404 = this.aClass384_8442.method6587();
		this.aFloat8403 = this.aClass384_8442.method6533();
		this.method13594();
		if (this.anInt8409 == 2) {
			this.method13719(this.aClass384_8442.buf);
		} else if (this.anInt8409 == 1) {
			this.method13719(this.aClass384_8385.buf);
		}

	}

	public final int dv() {
		return this.anInt8371 + this.anInt8370 + this.anInt8372;
	}

	public boolean method8399() {
		return true;
	}

	public final void method8525(int i_3, int i_4) {
		this.aClass170_8357.method2884(0, 0, i_3, i_4);
	}

	public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
		return new OpenGLGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, i_5);
	}

	public final void IA(float f_1) {
		if (this.aFloat8432 != f_1) {
			this.aFloat8432 = f_1;
			this.method13689();
		}

	}

	public final void m(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = this.anInt8428 != i_1;
		if (bool_7 || this.aFloat8433 != f_2 || this.aFloat8434 != f_3) {
			this.anInt8428 = i_1;
			this.aFloat8433 = f_2;
			this.aFloat8434 = f_3;
			if (bool_7) {
				this.aFloat8429 = (float) (this.anInt8428 & 0xff0000) / 1.671168E7F;
				this.aFloat8430 = (float) (this.anInt8428 & 0xff00) / 65280.0F;
				this.aFloat8431 = (float) (this.anInt8428 & 0xff) / 255.0F;
				this.method13689();
			}

			this.method13592();
		}

		if (this.aFloatArray8424[0] != f_4 || this.aFloatArray8424[1] != f_5 || this.aFloatArray8424[2] != f_6) {
			this.aFloatArray8424[0] = f_4;
			this.aFloatArray8424[1] = f_5;
			this.aFloatArray8424[2] = f_6;
			this.aFloatArray8425[0] = -f_4;
			this.aFloatArray8425[1] = -f_5;
			this.aFloatArray8425[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt((double) (f_4 * f_4 + f_5 * f_5 + f_6 * f_6)));
			this.aFloatArray8426[0] = f_4 * f_8;
			this.aFloatArray8426[1] = f_5 * f_8;
			this.aFloatArray8426[2] = f_6 * f_8;
			this.aFloatArray8427[0] = -this.aFloatArray8426[0];
			this.aFloatArray8427[1] = -this.aFloatArray8426[1];
			this.aFloatArray8427[2] = -this.aFloatArray8426[2];
			this.method13593();
			this.anInt8438 = (int) (f_4 * 256.0F / f_5);
			this.anInt8439 = (int) (f_6 * 256.0F / f_5);
		}

	}

	public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_1 + this.aClass384_8394.buf[6] * (float) i_2 + this.aClass384_8394.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_4 + this.aClass384_8394.buf[6] * (float) i_5 + this.aClass384_8394.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_1 + this.aClass384_8394.buf[7] * (float) i_2 + this.aClass384_8394.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_4 + this.aClass384_8394.buf[7] * (float) i_5 + this.aClass384_8394.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_1 + this.aClass384_8394.buf[4] * (float) i_2 + this.aClass384_8394.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_4 + this.aClass384_8394.buf[4] * (float) i_5 + this.aClass384_8394.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_1 + this.aClass384_8394.buf[5] * (float) i_2 + this.aClass384_8394.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_4 + this.aClass384_8394.buf[5] * (float) i_5 + this.aClass384_8394.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public FontRenderer createFont(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		return new FontRenderer_Sub5(this, fontmetrics_1, arr_2, bool_3);
	}

	final void method13591(float f_1, float f_2) {
		this.aFloat8446 = f_1;
		this.aFloat8355 = f_2;
		this.method13594();
	}

	public void method8618(Node_Sub1 class282_sub1_1) {
		this.aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (this.anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (this.aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
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
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
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
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			this.anInterface14_8496 = this.method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index * -1115476867 * -1990677291, false);
			this.aClass143_8494 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 3, 0);
			this.aClass143_8495 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 2, 12);
			this.aClass134_8359.method2328(this);
		}

	}

	void method13592() {
		aFloatArray8497[0] = this.aFloat8433 * this.aFloat8429;
		aFloatArray8497[1] = this.aFloat8433 * this.aFloat8430;
		aFloatArray8497[2] = this.aFloat8433 * this.aFloat8431;
		aFloatArray8497[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray8497, 0);
		aFloatArray8497[0] = -this.aFloat8434 * this.aFloat8429;
		aFloatArray8497[1] = -this.aFloat8434 * this.aFloat8430;
		aFloatArray8497[2] = -this.aFloat8434 * this.aFloat8431;
		aFloatArray8497[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray8497, 0);
	}

	void method13593() {
		OpenGL.glLightfv(16384, 4611, this.aFloatArray8426, 0);
		OpenGL.glLightfv(16385, 4611, this.aFloatArray8427, 0);
	}

	public boolean method8402() {
		return true;
	}

	void method13594() {
		this.aFloat8402 = this.aFloat8404 - (float) this.anInt8378 - this.aFloat8355;
		this.aFloat8406 = this.aFloat8402 - (float) this.anInt8358 * this.aFloat8446;
		if (this.aFloat8406 < this.aFloat8403) {
			this.aFloat8406 = this.aFloat8403;
		}

		OpenGL.glFogf(2915, this.aFloat8406);
		OpenGL.glFogf(2916, this.aFloat8402);
		aFloatArray8497[0] = (float) (this.anInt8441 & 0xff0000) / 1.671168E7F;
		aFloatArray8497[1] = (float) (this.anInt8441 & 0xff00) / 65280.0F;
		aFloatArray8497[2] = (float) (this.anInt8441 & 0xff) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray8497, 0);
	}

	final void method13595(int i_1, int i_2, int i_3) {
		OpenGL.glTexEnvi(8960, i_1 + 34176, i_2);
		OpenGL.glTexEnvi(8960, i_1 + 34192, i_3);
	}

	public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return this.aBool8480 ? new Class152_Sub1_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6) : null;
	}

	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		if (class152_1 != null && class152_2 != null && this.aBool8480 && this.aBool8472) {
			Class152_Sub1_Sub2 class152_sub1_sub2_5 = null;
			Class152_Sub1 class152_sub1_6 = (Class152_Sub1) class152_1;
			Class152_Sub1 class152_sub1_7 = (Class152_Sub1) class152_2;
			Class137_Sub2 class137_sub2_8 = class152_sub1_6.method13519();
			Class137_Sub2 class137_sub2_9 = class152_sub1_7.method13519();
			if (class137_sub2_8 != null && class137_sub2_9 != null) {
				int i_10 = class137_sub2_8.anInt9104 > class137_sub2_9.anInt9104 ? class137_sub2_8.anInt9104 : class137_sub2_9.anInt9104;
				if (class152_1 != class152_4 && class152_2 != class152_4 && class152_4 instanceof Class152_Sub1_Sub2) {
					Class152_Sub1_Sub2 class152_sub1_sub2_11 = (Class152_Sub1_Sub2) class152_4;
					if (class152_sub1_sub2_11.method15532() == i_10) {
						class152_sub1_sub2_5 = class152_sub1_sub2_11;
					}
				}

				if (class152_sub1_sub2_5 == null) {
					class152_sub1_sub2_5 = new Class152_Sub1_Sub2(this, i_10);
				}

				if (class152_sub1_sub2_5.method15531(class137_sub2_8, class137_sub2_9, f_3)) {
					return class152_sub1_sub2_5;
				}
			}
		}

		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	public final void iz(float f_1) {
		if (this.aFloat8432 != f_1) {
			this.aFloat8432 = f_1;
			this.method13689();
		}

	}

	final Class137_Sub2 method13596() {
		return this.aClass152_Sub1_8317 != null ? this.aClass152_Sub1_8317.method13519() : null;
	}

	public final boolean method8469() {
		if (this.aNode_Sub5_Sub1_8444 != null) {
			if (!this.aNode_Sub5_Sub1_8444.method12129()) {
				if (!this.aClass170_8357.method2900(this.aNode_Sub5_Sub1_8444)) {
					return false;
				}

				this.aClass167_8481.method2861();
			}

			return true;
		} else {
			return false;
		}
	}

	public final void method8490() {
		if (this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129()) {
			this.aClass170_8357.method2885(this.aNode_Sub5_Sub1_8444);
			this.aClass167_8481.method2861();
		}

	}

	public final boolean method8471() {
		return this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129();
	}

	final void method8592(float f_1, float f_2, float f_3) {
		Node_Sub5_Sub1.aFloat10026 = f_1;
		Node_Sub5_Sub1.aFloat10025 = f_2;
		Node_Sub5_Sub1.aFloat10024 = f_3;
	}

	public boolean method8492() {
		return true;
	}

	public final void method8474() {
		this.aClass170_8357.method2883();
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub4(this);
	}

	final void method13597() {
		this.aClass384_8394.method6562(this.aClass384_8348);
		this.aClass384_8394.method6523(this.aClass384_8442);
		this.aClass384_8394.method6539(this.aFloatArrayArray8395[0]);
		this.aClass384_8394.method6540(this.aFloatArrayArray8395[1]);
		this.aClass384_8394.method6535(this.aFloatArrayArray8395[2]);
		this.aClass384_8394.method6536(this.aFloatArrayArray8395[3]);
		this.aClass384_8394.method6613(this.aFloatArrayArray8395[4]);
		this.aClass384_8394.method6538(this.aFloatArrayArray8395[5]);
	}

	final Interface15 method13598(byte[] bytes_2, int i_3, boolean bool_4) {
		return (Interface15) (!this.aBool8309 || bool_4 && !this.aBool8362 ? new Class131_Sub2(this, bytes_2, i_3) : new Class135_Sub1(this, bytes_2, i_3, bool_4));
	}

	final Interface14 method13599(int i_1, byte[] bytes_2, int i_3, boolean bool_4) {
		return (Interface14) (!this.aBool8309 || bool_4 && !this.aBool8362 ? new Class131_Sub1(this, i_1, bytes_2, i_3) : new Class135_Sub2(this, i_1, bytes_2, i_3, bool_4));
	}

	final Interface14 createArrayBuffer(int i_1, Buffer buffer_2, int i_3) {
		return (Interface14) (!this.aBool8309 || false && !this.aBool8362 ? new Class131_Sub1(this, i_1, buffer_2) : new Class135_Sub2(this, i_1, buffer_2, i_3));
	}

	final void method13601(Interface14 interface14_1) {
		if (interface14_1 != this.anInterface14_8483) {
			if (this.aBool8309) {
				OpenGL.glBindBufferARB(34962, interface14_1.method1());
			}

			this.anInterface14_8483 = interface14_1;
		}

	}

	public void method8568() {
	}

	final void method13602(float f_1, float f_2) {
		OpenGL.glMatrixMode(5890);
		if (this.aBool8457) {
			OpenGL.glLoadIdentity();
		}

		OpenGL.glTranslatef(f_1, f_2, (float) 0.0);
		OpenGL.glMatrixMode(5888);
		this.aBool8457 = true;
	}

	final void method13603(int i_3) {
		OpenGL.glDrawArrays(7, 0, i_3);
	}

	public boolean method8495() {
		return true;
	}

	final void method13606() {
		if (this.anInt8382 != 4) {
			this.method13587();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13581(-2);
			this.method13624(1);
			this.anInt8382 = 4;
		}

	}

	final void method13607() {
		if (this.anInt8382 != 8) {
			this.method13645();
			this.method13642(true);
			this.method13656(true);
			this.method13623(true);
			this.method13624(1);
			this.anInt8382 = 8;
		}

	}

	public void method8483() {
		OpenGL.glFinish();
	}

	final void method13608(int i_1, boolean bool_2) {
		this.method13609(i_1, bool_2, true);
	}

	final void method13609(int i_1, boolean bool_2, boolean bool_3) {
		if (this.anInt8454 != i_1 || this.aBool8449 != this.aBool8448) {
			Class137_Sub1 class137_sub1_4 = null;
			int i_5 = 0;
			byte b_6 = 0;
			int i_7 = 0;
			int i_8 = this.aBool8448 ? 3 : 0;
			if (i_1 < 0) {
				this.method13618();
			} else {
				class137_sub1_4 = this.aClass167_8481.method2858(i_1);
				TextureDetails class169_9 = this.anInterface22_5834.method144(i_1);
				if (class169_9.textureSpeedU == 0 && class169_9.textureSpeedV == 0) {
					this.method13618();
				} else {
					this.method13602((float) (this.anInt8368 % 128000) / 1000.0F * (float) class169_9.textureSpeedU / 64.0F % 1.0F, (float) (this.anInt8368 % 128000) / 1000.0F * (float) class169_9.textureSpeedV / 64.0F % 1.0F);
				}

				if (!this.aBool8448) {
					b_6 = class169_9.effectParam1;
					i_7 = class169_9.effectParam2;
					i_8 = class169_9.effectId;
				}

				i_5 = class169_9.combineMode;
			}

			this.aClass146_8356.method2462(i_8, b_6, i_7, bool_2, bool_3);
			if (!this.aClass146_8356.method2463(class137_sub1_4, i_5)) {
				this.method13654(class137_sub1_4);
				this.method13612(i_5);
			}

			this.aBool8449 = this.aBool8448;
			this.anInt8454 = i_1;
		}

		this.anInt8382 &= ~0x7;
	}

	final void method13610(int i_1) {
		if (this.anInt8458 != i_1) {
			OpenGL.glActiveTexture(i_1 + 33984);
			this.anInt8458 = i_1;
		}

	}

	final void method13611(Interface15 interface15_1, int i_3, int i_4) {
		this.method13663(interface15_1);
		OpenGL.glDrawElements(4, i_4, 5123, interface15_1.method2() + (long) (i_3 * 2));
	}

	final void method13612(int i_1) {
		if (i_1 == 1) {
			this.method13717(7681, 7681);
		} else if (i_1 == 0) {
			this.method13717(8448, 8448);
		} else if (i_1 == 2) {
			this.method13717(34165, 7681);
		} else if (i_1 == 3) {
			this.method13717(260, 8448);
		} else if (i_1 == 4) {
			this.method13717(34023, 34023);
		}

	}

	final int method13613(int i_1) {
		if (i_1 == 1) {
			return 7681;
		} else if (i_1 == 0) {
			return 8448;
		} else if (i_1 == 2) {
			return 34165;
		} else if (i_1 == 3) {
			return 260;
		} else if (i_1 == 4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	final void method13616(int i_1, int i_2) {
		OpenGL.glTexEnvi(8960, i_1 + 34184, i_2);
		OpenGL.glTexEnvi(8960, i_1 + 34200, 770);
	}

	final void method13617(int i_1) {
		aFloatArray8497[0] = (float) (i_1 & 0xff0000) / 1.671168E7F;
		aFloatArray8497[1] = (float) (i_1 & 0xff00) / 65280.0F;
		aFloatArray8497[2] = (float) (i_1 & 0xff) / 255.0F;
		aFloatArray8497[3] = (float) (i_1 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray8497, 0);
	}

	public final synchronized void method8488(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!this.aClass473_8486.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8486.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8371 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8375.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8375.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8370 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8376.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8376.popTail();
			anIntArray8381[i_2++] = class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8377.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8377.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8372 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
			boolean bool_3 = false;
		}

		while (!this.aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		Node node_5;
		while (!this.aClass473_8461.method7861()) {
			node_5 = this.aClass473_8461.popTail();
			OpenGL.glDeleteProgramARB((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_8379.method7861()) {
			node_5 = this.aClass473_8379.popTail();
			OpenGL.glDeleteShader((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		this.aClass167_8481.method2860();
		if (this.za() > 100663296 && TextureDetails.time() > this.aLong8316 + 60000L) {
			System.gc();
			this.aLong8316 = TextureDetails.time();
		}

		this.anInt8368 = i_1;
	}

	public final void im(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = this.anInt8428 != i_1;
		if (bool_7 || this.aFloat8433 != f_2 || this.aFloat8434 != f_3) {
			this.anInt8428 = i_1;
			this.aFloat8433 = f_2;
			this.aFloat8434 = f_3;
			if (bool_7) {
				this.aFloat8429 = (float) (this.anInt8428 & 0xff0000) / 1.671168E7F;
				this.aFloat8430 = (float) (this.anInt8428 & 0xff00) / 65280.0F;
				this.aFloat8431 = (float) (this.anInt8428 & 0xff) / 255.0F;
				this.method13689();
			}

			this.method13592();
		}

		if (this.aFloatArray8424[0] != f_4 || this.aFloatArray8424[1] != f_5 || this.aFloatArray8424[2] != f_6) {
			this.aFloatArray8424[0] = f_4;
			this.aFloatArray8424[1] = f_5;
			this.aFloatArray8424[2] = f_6;
			this.aFloatArray8425[0] = -f_4;
			this.aFloatArray8425[1] = -f_5;
			this.aFloatArray8425[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt((double) (f_4 * f_4 + f_5 * f_5 + f_6 * f_6)));
			this.aFloatArray8426[0] = f_4 * f_8;
			this.aFloatArray8426[1] = f_5 * f_8;
			this.aFloatArray8426[2] = f_6 * f_8;
			this.aFloatArray8427[0] = -this.aFloatArray8426[0];
			this.aFloatArray8427[1] = -this.aFloatArray8426[1];
			this.aFloatArray8427[2] = -this.aFloatArray8426[2];
			this.method13593();
			this.anInt8438 = (int) (f_4 * 256.0F / f_5);
			this.anInt8439 = (int) (f_6 * 256.0F / f_5);
		}

	}

	final void method13618() {
		if (this.aBool8457) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aBool8457 = false;
		}

	}

	final void method13620(boolean bool_1) {
		if (this.aBool8422 != bool_1) {
			this.aBool8422 = bool_1;
			this.method13622();
			this.anInt8382 &= ~0x7;
		}

	}

	final void method13621(boolean bool_1) {
		if (this.aBool8397 != bool_1) {
			this.aBool8397 = bool_1;
			this.method13622();
		}

	}

	void method13622() {
		if (this.aBool8422 && !this.aBool8397) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}

	}

	public final boolean method8600() {
		if (this.aNode_Sub5_Sub1_8444 != null) {
			if (!this.aNode_Sub5_Sub1_8444.method12129()) {
				if (!this.aClass170_8357.method2900(this.aNode_Sub5_Sub1_8444)) {
					return false;
				}

				this.aClass167_8481.method2861();
			}

			return true;
		} else {
			return false;
		}
	}

	final void method13623(boolean bool_1) {
		if (this.aBool8388 != bool_1) {
			this.aBool8388 = bool_1;
			this.method13579();
			this.anInt8382 &= ~0xf;
		}

	}

	public final boolean method8628() {
		if (this.aNode_Sub5_Sub1_8444 != null) {
			if (!this.aNode_Sub5_Sub1_8444.method12129()) {
				if (!this.aClass170_8357.method2900(this.aNode_Sub5_Sub1_8444)) {
					return false;
				}

				this.aClass167_8481.method2861();
			}

			return true;
		} else {
			return false;
		}
	}

	final void method13624(int i_1) {
		if (this.anInt8366 != i_1) {
			byte b_2;
			boolean bool_3;
			boolean bool_4;
			if (i_1 == 1) {
				b_2 = 1;
				bool_3 = true;
				bool_4 = true;
			} else if (i_1 == 2) {
				b_2 = 2;
				bool_3 = true;
				bool_4 = false;
			} else if (i_1 == 128) {
				b_2 = 3;
				bool_3 = true;
				bool_4 = true;
			} else {
				b_2 = 0;
				bool_3 = true;
				bool_4 = false;
			}

			if (bool_3 != this.aBool8459) {
				OpenGL.glColorMask(bool_3, bool_3, bool_3, true);
				this.aBool8459 = bool_3;
			}

			if (bool_4 != this.aBool8408) {
				if (bool_4) {
					OpenGL.glEnable(3008);
				} else {
					OpenGL.glDisable(3008);
				}

				this.aBool8408 = bool_4;
			}

			if (b_2 != this.anInt8384) {
				if (b_2 == 1) {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(770, 771);
				} else if (b_2 == 2) {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(1, 1);
				} else if (b_2 == 3) {
					OpenGL.glEnable(3042);
					OpenGL.glBlendFunc(774, 1);
				} else {
					OpenGL.glDisable(3042);
				}

				this.anInt8384 = b_2;
			}

			this.anInt8366 = i_1;
			this.anInt8382 &= ~0xc;
		}

	}

	public final int za() {
		return this.anInt8371 + this.anInt8370 + this.anInt8372;
	}

	public boolean method8407() {
		return false;
	}

	public final void method8673(int i_1, int i_2, int i_3, int i_4) {
		this.aClass170_8357.method2884(i_1, i_2, i_3, i_4);
	}

	final synchronized void method13625(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.data = (long) i_1;
		this.aClass473_8375.insertBack(class282_sub38_3);
	}

	void method8485() {
		for (Node node_1 = this.aClass473_8369.getBack(); node_1 != null; node_1 = this.aClass473_8369.getPrevious()) {
			((Node_Sub1_Sub1) node_1).method15450();
		}

		if (this.aClass170_8357 != null) {
			this.aClass170_8357.method2898();
		}

		if (this.aBool8367) {
			Class13.method508(false, true, -1169813027);
			this.aBool8367 = false;
		}

	}

	final synchronized void method13627(long long_1) {
		Node node_3 = new Node();
		node_3.data = long_1;
		this.aClass473_8379.insertBack(node_3);
	}

	final synchronized void method13628(int i_1) {
		Node node_2 = new Node();
		node_2.data = (long) i_1;
		this.aClass473_8461.insertBack(node_2);
	}

	static int method13629(Class150 class150_0) {
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

	static int method13630(Class150 class150_0, Class76 class76_1) {
		if (class76_1 == Class76.aClass76_751) {
			switch (class150_0.anInt1958) {
			case 0:
				return 6409;
			case 1:
				return 6406;
			case 2:
			case 3:
			default:
				throw new IllegalArgumentException();
			case 4:
				return 6410;
			case 5:
				return 6407;
			case 6:
				return 6408;
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

	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		try {
			this.aClass158_Sub2_5841.method14344();
		} catch (Exception exception_4) {
			;
		}

		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-2009873144);
		}

	}

	public Matrix44Arr method8571() {
		return this.aClass384_8360;
	}

	public void method8484() {
		OpenGL.glFinish();
	}

	public final void method8423(Matrix44Var matrix44var_1) {
		this.aClass294_8389.method5209(matrix44var_1);
		this.aClass384_8348.fromVarMatrix44(this.aClass294_8389);
		this.aClass294_8405.method5209(matrix44var_1);
		this.aClass294_8405.method5207();
		this.aClass384_8391.fromVarMatrix44(this.aClass294_8405);
		this.method13597();
		if (this.anInt8409 != 1) {
			this.method13748();
		}

	}

	public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * f_1 + this.aClass384_8394.buf[7] * f_2 + this.aClass384_8394.buf[11] * f_3;
		float f_6 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * f_1 + this.aClass384_8394.buf[4] * f_2 + this.aClass384_8394.buf[8] * f_3;
		float f_7 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * f_1 + this.aClass384_8394.buf[5] * f_2 + this.aClass384_8394.buf[9] * f_3;
		float f_8 = this.aClass384_8348.buf[14] + this.aClass384_8348.buf[2] * f_1 + this.aClass384_8348.buf[6] * f_2 + this.aClass384_8348.buf[10] * f_3;
		floats_4[0] = this.aFloat8315 + this.aFloat8398 * f_6 / f_5;
		floats_4[1] = this.aFloat8399 + this.aFloat8400 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	final void method13633(Matrix44Arr matrix44arr_1) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(matrix44arr_1.buf, 0);
	}

	public final int dd() {
		return this.anInt8371 + this.anInt8370 + this.anInt8372;
	}

	public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_1 + this.aClass384_8394.buf[6] * (float) i_2 + this.aClass384_8394.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_4 + this.aClass384_8394.buf[6] * (float) i_5 + this.aClass384_8394.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_1 + this.aClass384_8394.buf[7] * (float) i_2 + this.aClass384_8394.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_4 + this.aClass384_8394.buf[7] * (float) i_5 + this.aClass384_8394.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_1 + this.aClass384_8394.buf[4] * (float) i_2 + this.aClass384_8394.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_4 + this.aClass384_8394.buf[4] * (float) i_5 + this.aClass384_8394.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_1 + this.aClass384_8394.buf[5] * (float) i_2 + this.aClass384_8394.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_4 + this.aClass384_8394.buf[5] * (float) i_5 + this.aClass384_8394.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public void en(float f_1, float f_2) {
		this.aFloat8364 = f_1;
		this.aFloat8320 = f_2;
		this.method13671();
	}

	public final int df() {
		return this.anInt8371 + this.anInt8370 + this.anInt8372;
	}

	final void method13635(float f_1, float f_2, float f_3, float f_4) {
		aFloatArray8497[0] = f_1;
		aFloatArray8497[1] = f_2;
		aFloatArray8497[2] = f_3;
		aFloatArray8497[3] = f_4;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray8497, 0);
	}

	public boolean method8489() {
		return true;
	}

	public boolean method8674() {
		return true;
	}

	public boolean method8528() {
		return true;
	}

	public FontRenderer method8625(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		return new FontRenderer_Sub5(this, fontmetrics_1, arr_2, bool_3);
	}

	public boolean method8599() {
		return this.aNode_Sub5_Sub1_8444 != null && (this.anInt8475 <= 1 || this.aBool8344);
	}

	public boolean method8464() {
		return this.aNode_Sub5_Sub1_8444 != null && (this.anInt8475 <= 1 || this.aBool8344);
	}

	public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new NativeSprite_Sub2(this, i_1, i_2, i_3, i_4);
	}

	public boolean method8649() {
		return this.aNode_Sub5_Sub1_8444 != null && (this.anInt8475 <= 1 || this.aBool8344);
	}

	final void method13637() {
		if (this.anInt8382 != 2) {
			this.method13587();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13581(-2);
			this.anInt8382 = 2;
		}

	}

	void method13638() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8437; i_1++) {
			Node_Sub24 class282_sub24_2 = this.aNode_Sub24Array8435[i_1];
			int i_3 = i_1 + 16386;
			aFloatArray8322[0] = (float) class282_sub24_2.method12368((byte) 11);
			aFloatArray8322[1] = (float) class282_sub24_2.method12369();
			aFloatArray8322[2] = (float) class282_sub24_2.method12394(1619249215);
			aFloatArray8322[3] = 1.0F;
			OpenGL.glLightfv(i_3, 4611, aFloatArray8322, 0);
			int i_4 = class282_sub24_2.method12371(-2140071642);
			float f_5 = class282_sub24_2.method12395(-227216021) / 255.0F;
			aFloatArray8322[0] = (float) (i_4 >> 16 & 0xff) * f_5;
			aFloatArray8322[1] = (float) (i_4 >> 8 & 0xff) * f_5;
			aFloatArray8322[2] = (float) (i_4 & 0xff) * f_5;
			OpenGL.glLightfv(i_3, 4609, aFloatArray8322, 0);
			OpenGL.glLightf(i_3, 4617, 1.0F / (float) (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			OpenGL.glEnable(i_3);
		}

		while (i_1 < this.anInt8436) {
			OpenGL.glDisable(i_1 + 16386);
			++i_1;
		}

		this.anInt8436 = this.anInt8437;
	}

	void method13639() {
		int i_1 = this.aClass158_5853.method2714();
		int i_2 = this.aClass158_5853.method2716();
		this.aClass384_8385.method6530(0.0F, (float) i_1, 0.0F, (float) i_2, -1.0F, 1.0F);
		this.method8421();
		this.method13586();
		this.L();
	}

	final void method13640(int i_1, int i_2) {
		this.anInt8453 = i_1;
		this.anInt8416 = i_2;
		this.method13584();
		this.method13570();
	}

	public final void method8603(int i_1, int i_2, int i_3, int i_4) {
		this.aClass170_8357.method2884(i_1, i_2, i_3, i_4);
	}

	public boolean method8502() {
		return true;
	}

	public final Matrix44Arr method8587() {
		return new Matrix44Arr(this.aClass384_8442);
	}

	public boolean method8614() {
		return true;
	}

	final void method13641() {
		OpenGL.glPopMatrix();
	}

	public void method8491(boolean bool_1) {
	}

	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub1(this, canvas_1);
	}

	final void method13642(boolean bool_1) {
		if (this.aBool8440 != bool_1) {
			this.aBool8440 = bool_1;
			this.method13747();
			this.anInt8382 &= ~0xf;
		}

	}

	public void method8445() {
		if (this.aBool8487 && this.aClass158_5853 != null) {
			int i_1 = this.anInt8413;
			int i_2 = this.anInt8412;
			int i_3 = this.anInt8415;
			int i_4 = this.anInt8478;
			this.L();
			int i_5 = this.anInt8417;
			int i_6 = this.anInt8418;
			int i_7 = this.anInt8419;
			int i_8 = this.anInt8347;
			this.method8421();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			this.method13586();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13654((Class137) null);
			this.method13581(-2);
			this.method13612(1);
			this.method13624(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, this.aClass158_5853.method2714(), this.aClass158_5853.method2716(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			this.r(i_1, i_3, i_2, i_4);
			this.method8617(i_5, i_6, i_7, i_8);
		}

	}

	public void method8497() {
		if (this.aBool8487 && this.aClass158_5853 != null) {
			int i_1 = this.anInt8413;
			int i_2 = this.anInt8412;
			int i_3 = this.anInt8415;
			int i_4 = this.anInt8478;
			this.L();
			int i_5 = this.anInt8417;
			int i_6 = this.anInt8418;
			int i_7 = this.anInt8419;
			int i_8 = this.anInt8347;
			this.method8421();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			this.method13586();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13654((Class137) null);
			this.method13581(-2);
			this.method13612(1);
			this.method13624(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, this.aClass158_5853.method2714(), this.aClass158_5853.method2716(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			this.r(i_1, i_3, i_2, i_4);
			this.method8617(i_5, i_6, i_7, i_8);
		}

	}

	public void fi(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	public boolean method8498() {
		return true;
	}

	public final void J() {
		int meme = 32;
		for (this.anInt8473 = 0; meme > 1; meme >>= 1) {
			++this.anInt8473;
		}

		this.anInt8466 = 1 << this.anInt8473;
	}

	public void ej(float f_1, float f_2) {
		this.aFloat8364 = f_1;
		this.aFloat8320 = f_2;
		this.method13671();
	}

	public final void ez() {
		if (this.aClass158_5853 != null) {
			this.anInt8413 = 0;
			this.anInt8415 = 0;
			this.anInt8412 = this.aClass158_5853.method2714();
			this.anInt8478 = this.aClass158_5853.method2716();
			OpenGL.glDisable(3089);
		}

	}

	public final void eh() {
		if (this.aClass158_5853 != null) {
			this.anInt8413 = 0;
			this.anInt8415 = 0;
			this.anInt8412 = this.aClass158_5853.method2714();
			this.anInt8478 = this.aClass158_5853.method2716();
			OpenGL.glDisable(3089);
		}

	}

	public final void fm(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 != null) {
			if (i_1 < 0) {
				i_1 = 0;
			}

			if (i_3 > this.aClass158_5853.method2714()) {
				i_3 = this.aClass158_5853.method2714();
			}

			if (i_2 < 0) {
				i_2 = 0;
			}

			if (i_4 > this.aClass158_5853.method2716()) {
				i_4 = this.aClass158_5853.method2716();
			}

			this.anInt8413 = i_1;
			this.anInt8415 = i_2;
			this.anInt8412 = i_3;
			this.anInt8478 = i_4;
			OpenGL.glEnable(3089);
			this.method13570();
		}

	}

	public final void fc(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 != null) {
			if (i_1 < 0) {
				i_1 = 0;
			}

			if (i_3 > this.aClass158_5853.method2714()) {
				i_3 = this.aClass158_5853.method2714();
			}

			if (i_2 < 0) {
				i_2 = 0;
			}

			if (i_4 > this.aClass158_5853.method2716()) {
				i_4 = this.aClass158_5853.method2716();
			}

			this.anInt8413 = i_1;
			this.anInt8415 = i_2;
			this.anInt8412 = i_3;
			this.anInt8478 = i_4;
			OpenGL.glEnable(3089);
			this.method13570();
		}

	}

	public final void fe(int i_1, int i_2, int i_3, int i_4) {
		if (this.anInt8413 < i_1) {
			this.anInt8413 = i_1;
		}

		if (this.anInt8412 > i_3) {
			this.anInt8412 = i_3;
		}

		if (this.anInt8415 < i_2) {
			this.anInt8415 = i_2;
		}

		if (this.anInt8478 > i_4) {
			this.anInt8478 = i_4;
		}

		OpenGL.glEnable(3089);
		this.method13570();
	}

	public final void fk(int i_1, int i_2, int i_3, int i_4) {
		if (this.anInt8413 < i_1) {
			this.anInt8413 = i_1;
		}

		if (this.anInt8412 > i_3) {
			this.anInt8412 = i_3;
		}

		if (this.anInt8415 < i_2) {
			this.anInt8415 = i_2;
		}

		if (this.anInt8478 > i_4) {
			this.anInt8478 = i_4;
		}

		OpenGL.glEnable(3089);
		this.method13570();
	}

	final void method13645() {
		if (this.anInt8409 != 2) {
			this.anInt8409 = 2;
			this.method13719(this.aClass384_8442.buf);
			this.method13748();
			this.method13584();
			this.method13671();
			this.anInt8382 &= ~0x7;
		}

	}

	public void method8480(boolean bool_1) {
	}

	public void fu(int i_1, int i_2) {
		int i_3 = 0;
		if ((i_1 & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_2 & 0xff0000) / 1.671168E7F, (float) (i_2 & 0xff00) / 65280.0F, (float) (i_2 & 0xff) / 255.0F, (float) (i_2 >>> 24) / 255.0F);
			i_3 = 16384;
		}

		if ((i_1 & 0x2) != 0) {
			this.method13623(true);
			i_3 |= 0x100;
		}

		if ((i_1 & 0x4) != 0) {
			i_3 |= 0x400;
		}

		OpenGL.glClear(i_3);
	}

	public final synchronized void method8487(int i_1) {
		int i_2 = 0;
		i_1 &= 0x7fffffff;

		IntNode class282_sub38_4;
		while (!this.aClass473_8486.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8486.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8371 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteBuffersARB(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8375.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8375.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8370 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteTextures(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8376.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8376.popTail();
			anIntArray8381[i_2++] = class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_2, anIntArray8381, 0);
			i_2 = 0;
		}

		while (!this.aClass473_8377.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8377.popTail();
			anIntArray8381[i_2++] = (int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L);
			this.anInt8372 -= class282_sub38_4.value * 1270866345 * -570797415;
			if (i_2 == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
				i_2 = 0;
			}
		}

		if (i_2 > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_2, anIntArray8381, 0);
			boolean bool_3 = false;
		}

		while (!this.aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		Node node_5;
		while (!this.aClass473_8461.method7861()) {
			node_5 = this.aClass473_8461.popTail();
			OpenGL.glDeleteProgramARB((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_8379.method7861()) {
			node_5 = this.aClass473_8379.popTail();
			OpenGL.glDeleteShader((int) (node_5.data * -1253863389874800229L * -3442165056282524525L));
		}

		while (!this.aClass473_8373.method7861()) {
			class282_sub38_4 = (IntNode) this.aClass473_8373.popTail();
			OpenGL.glDeleteLists((int) (class282_sub38_4.data * -1253863389874800229L * -3442165056282524525L), class282_sub38_4.value * 1270866345 * -570797415);
		}

		this.aClass167_8481.method2860();
		if (this.za() > 100663296 && TextureDetails.time() > this.aLong8316 + 60000L) {
			System.gc();
			this.aLong8316 = TextureDetails.time();
		}

		this.anInt8368 = i_1;
	}

	public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3 - 1.0F;
		float f_10 = f_8 + (float) i_4 - 1.0F;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3 - 1.0F;
		float f_10 = f_8 + (float) i_4 - 1.0F;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3 - 1.0F;
		float f_10 = f_8 + (float) i_4 - 1.0F;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	public void fp(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3;
		float f_10 = f_8 + (float) i_4;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	public void fb(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		float f_7 = (float) i_1 + 0.35F;
		float f_8 = (float) i_2 + 0.35F;
		float f_9 = f_7 + (float) i_3;
		float f_10 = f_8 + (float) i_4;
		this.method13659();
		this.method13624(i_6);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		if (this.aBool8342) {
			OpenGL.glDisable(32925);
		}

		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f_7, f_8);
		OpenGL.glVertex2f(f_7, f_10);
		OpenGL.glVertex2f(f_9, f_10);
		OpenGL.glVertex2f(f_9, f_8);
		OpenGL.glEnd();
		if (this.aBool8342) {
			OpenGL.glEnable(32925);
		}

	}

	public void fv(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		float f_10;
		float f_11;
		if (this.aClass137_Sub1_Sub1_8462 != null && this.aClass137_Sub1_Sub1_8462.anInt9087 >= i_3 && this.aClass137_Sub1_Sub1_8462.anInt9086 >= i_4) {
			this.aClass137_Sub1_Sub1_8462.method14455(0, i_3, i_4, bytes_7, Class150.aClass150_1951, 0, false);
			f_10 = this.aClass137_Sub1_Sub1_8462.aFloat10134 * (float) i_4 / (float) this.aClass137_Sub1_Sub1_8462.anInt9086;
			f_11 = this.aClass137_Sub1_Sub1_8462.aFloat10132 * (float) i_3 / (float) this.aClass137_Sub1_Sub1_8462.anInt9087;
		} else {
			this.aClass137_Sub1_Sub1_8462 = Class137_Sub1_Sub1.method15540(this, Class150.aClass150_1951, Class76.aClass76_751, i_3, i_4, bytes_7, Class150.aClass150_1951);
			this.aClass137_Sub1_Sub1_8462.method14445(false, false);
			f_10 = this.aClass137_Sub1_Sub1_8462.aFloat10134;
			f_11 = this.aClass137_Sub1_Sub1_8462.aFloat10132;
		}

		this.method13637();
		this.method13654(this.aClass137_Sub1_Sub1_8462);
		this.method13624(i_9);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		this.method13617(i_6);
		this.method13717(34165, 34165);
		this.method13595(0, 34166, 768);
		this.method13595(2, 5890, 770);
		this.method13616(0, 34166);
		this.method13616(2, 5890);
		float f_12 = (float) i_1;
		float f_13 = (float) i_2;
		float f_14 = f_12 + (float) i_3;
		float f_15 = f_13 + (float) i_4;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glTexCoord2f(0.0F, f_11);
		OpenGL.glVertex2f(f_12, f_15);
		OpenGL.glTexCoord2f(f_10, f_11);
		OpenGL.glVertex2f(f_14, f_15);
		OpenGL.glTexCoord2f(f_10, 0.0F);
		OpenGL.glVertex2f(f_14, f_13);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
		this.method13595(2, 34166, 770);
		this.method13616(0, 5890);
		this.method13616(2, 34166);
	}

	public final void method8601() {
		if (this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129()) {
			this.aClass170_8357.method2885(this.aNode_Sub5_Sub1_8444);
			this.aClass167_8481.method2861();
		}

	}

	void fr(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_3 < 0) {
			i_3 = -i_3;
		}

		if (i_1 + i_3 >= this.anInt8413 && i_1 - i_3 <= this.anInt8412 && i_2 + i_3 >= this.anInt8415 && i_2 - i_3 <= this.anInt8478) {
			this.method13659();
			this.method13624(i_5);
			OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
			float f_6 = (float) i_1 + 0.35F;
			float f_7 = (float) i_2 + 0.35F;
			int i_8 = i_3 << 1;
			if ((float) i_8 < this.aFloat8414) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 + 1.0F);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 + 1.0F);
				OpenGL.glEnd();
			} else if ((float) i_8 <= this.aFloat8489) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize((float) i_8);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f_6, f_7);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f_6, f_7);
				int i_9 = 262144 / (6 * i_3);
				if (i_9 <= 64) {
					i_9 = 64;
				} else if (i_9 > 512) {
					i_9 = 512;
				}

				i_9 = Class51.method1072(i_9, 960090928);
				OpenGL.glVertex2f(f_6 + (float) i_3, f_7);

				for (int i_10 = 16384 - i_9; i_10 > 0; i_10 -= i_9) {
					OpenGL.glVertex2f(f_6 + Class142.aFloatArray1665[i_10] * (float) i_3, f_7 + Class142.aFloatArray1666[i_10] * (float) i_3);
				}

				OpenGL.glVertex2f(f_6 + (float) i_3, f_7);
				OpenGL.glEnd();
			}
		}

	}

	void fw(int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_3 < 0) {
			i_3 = -i_3;
		}

		if (i_1 + i_3 >= this.anInt8413 && i_1 - i_3 <= this.anInt8412 && i_2 + i_3 >= this.anInt8415 && i_2 - i_3 <= this.anInt8478) {
			this.method13659();
			this.method13624(i_5);
			OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
			float f_6 = (float) i_1 + 0.35F;
			float f_7 = (float) i_2 + 0.35F;
			int i_8 = i_3 << 1;
			if ((float) i_8 < this.aFloat8414) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 + 1.0F);
				OpenGL.glVertex2f(f_6 + 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 - 1.0F);
				OpenGL.glVertex2f(f_6 - 1.0F, f_7 + 1.0F);
				OpenGL.glEnd();
			} else if ((float) i_8 <= this.aFloat8489) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize((float) i_8);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f_6, f_7);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f_6, f_7);
				int i_9 = 262144 / (6 * i_3);
				if (i_9 <= 64) {
					i_9 = 64;
				} else if (i_9 > 512) {
					i_9 = 512;
				}

				i_9 = Class51.method1072(i_9, 1964199200);
				OpenGL.glVertex2f(f_6 + (float) i_3, f_7);

				for (int i_10 = 16384 - i_9; i_10 > 0; i_10 -= i_9) {
					OpenGL.glVertex2f(f_6 + Class142.aFloatArray1665[i_10] * (float) i_3, f_7 + Class142.aFloatArray1666[i_10] * (float) i_3);
				}

				OpenGL.glVertex2f(f_6 + (float) i_3, f_7);
				OpenGL.glEnd();
			}
		}

	}

	public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		this.method13659();
		this.method13624(i_13);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_10 >> 16), (byte) (i_10 >> 8), (byte) i_10, (byte) (i_10 >> 24));
		OpenGL.glVertex3f((float) i_1 + 0.35F, (float) i_2 + 0.35F, f_3);
		OpenGL.glColor4ub((byte) (i_11 >> 16), (byte) (i_11 >> 8), (byte) i_11, (byte) (i_11 >> 24));
		OpenGL.glVertex3f((float) i_4 + 0.35F, (float) i_5 + 0.35F, f_6);
		OpenGL.glColor4ub((byte) (i_12 >> 16), (byte) (i_12 >> 8), (byte) i_12, (byte) (i_12 >> 24));
		OpenGL.glVertex3f((float) i_7 + 0.35F, (float) i_8 + 0.35F, f_9);
		OpenGL.glEnd();
	}

	public void fq(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method13659();
		this.method13624(i_5);
		float f_6 = (float) i_1 + 0.35F;
		float f_7 = (float) i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6 + (float) i_3, f_7);
		OpenGL.glEnd();
	}

	public boolean method8431() {
		return true;
	}

	public void fl(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method13659();
		this.method13624(i_5);
		float f_6 = (float) i_1 + 0.35F;
		float f_7 = (float) i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6, f_7 + (float) i_3);
		OpenGL.glEnd();
	}

	public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method13659();
		this.method13624(i_6);
		float f_7 = (float) i_3 - (float) i_1;
		float f_8 = (float) i_4 - (float) i_2;
		if (f_7 == 0.0F && f_8 == 0.0F) {
			f_7 = 1.0F;
		} else {
			float f_9 = (float) (1.0D / Math.sqrt((double) (f_7 * f_7 + f_8 * f_8)));
			f_7 *= f_9;
			f_8 *= f_9;
		}

		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glVertex2f((float) i_3 + f_7 + 0.35F, (float) i_4 + f_8 + 0.35F);
		OpenGL.glEnd();
	}

	public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.method13659();
		this.method13624(i_6);
		float f_7 = (float) i_3 - (float) i_1;
		float f_8 = (float) i_4 - (float) i_2;
		if (f_7 == 0.0F && f_8 == 0.0F) {
			f_7 = 1.0F;
		} else {
			float f_9 = (float) (1.0D / Math.sqrt((double) (f_7 * f_7 + f_8 * f_8)));
			f_7 *= f_9;
			f_8 *= f_9;
		}

		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glVertex2f((float) i_3 + f_7 + 0.35F, (float) i_4 + f_8 + 0.35F);
		OpenGL.glEnd();
	}

	public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			this.method13659();
			this.method13624(i_6);
			float f_10 = (float) i_3 - (float) i_1;
			float f_11 = (float) i_4 - (float) i_2;
			float f_12 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * (float) i_7;
			float f_14 = f_11 * (float) i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (float) (i_7 + i_8 - i_9);
				f_16 = f_11 * (float) (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (float) (i_7 - i_9);
				f_18 = f_11 * (float) (i_7 - i_9);
			}

			float f_19 = (float) i_1 + 0.35F + f_15;
			float f_20 = (float) i_2 + 0.35F + f_16;
			float f_21 = f_10 * (float) i_8;
			float f_22 = f_11 * (float) i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 > (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				} else {
					if (f_19 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 < (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				}

				if (i_4 > i_2) {
					if (f_20 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 > (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				} else {
					if (f_20 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 < (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				}

				OpenGL.glBegin(1);
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

	public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			this.method13659();
			this.method13624(i_6);
			float f_10 = (float) i_3 - (float) i_1;
			float f_11 = (float) i_4 - (float) i_2;
			float f_12 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * (float) i_7;
			float f_14 = f_11 * (float) i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (float) (i_7 + i_8 - i_9);
				f_16 = f_11 * (float) (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (float) (i_7 - i_9);
				f_18 = f_11 * (float) (i_7 - i_9);
			}

			float f_19 = (float) i_1 + 0.35F + f_15;
			float f_20 = (float) i_2 + 0.35F + f_16;
			float f_21 = f_10 * (float) i_8;
			float f_22 = f_11 * (float) i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 > (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				} else {
					if (f_19 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 < (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				}

				if (i_4 > i_2) {
					if (f_20 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 > (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				} else {
					if (f_20 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 < (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				}

				OpenGL.glBegin(1);
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

	public void fo(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method13659();
		this.method13624(i_5);
		float f_6 = (float) i_1 + 0.35F;
		float f_7 = (float) i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6, f_7 + (float) i_3);
		OpenGL.glEnd();
	}

	public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		this.method13624(i_6);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - (float) i_1;
		float f_15 = (float) i_4 - (float) i_2;
		float f_16 = (float) (1.0D / Math.sqrt((double) (f_14 * f_14 + f_15 * f_15)));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f_12 * (float) (i_1 - i_8), f_13 * (float) (i_2 - i_9));
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (float) (i_3 - i_8), f_13 * (float) (i_4 - i_9));
		OpenGL.glVertex2f((float) i_3 + f_14 + 0.35F, (float) i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		this.method13624(i_6);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - (float) i_1;
		float f_15 = (float) i_4 - (float) i_2;
		float f_16 = (float) (1.0D / Math.sqrt((double) (f_14 * f_14 + f_15 * f_15)));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f_12 * (float) (i_1 - i_8), f_13 * (float) (i_2 - i_9));
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (float) (i_3 - i_8), f_13 * (float) (i_4 - i_9));
		OpenGL.glVertex2f((float) i_3 + f_14 + 0.35F, (float) i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		this.method13624(i_6);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - (float) i_1;
		float f_15 = (float) i_4 - (float) i_2;
		float f_16 = (float) (1.0D / Math.sqrt((double) (f_14 * f_14 + f_15 * f_15)));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f_12 * (float) (i_1 - i_8), f_13 * (float) (i_2 - i_9));
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (float) (i_3 - i_8), f_13 * (float) (i_4 - i_9));
		OpenGL.glVertex2f((float) i_3 + f_14 + 0.35F, (float) i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		Class455_Sub2 class455_sub2_10 = (Class455_Sub2) class455_7;
		Class137_Sub1_Sub1 class137_sub1_sub1_11 = class455_sub2_10.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_10.aClass137_Sub1_Sub1_8974);
		this.method13624(i_6);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_12 = class137_sub1_sub1_11.aFloat10132 / (float) class137_sub1_sub1_11.anInt10136;
		float f_13 = class137_sub1_sub1_11.aFloat10134 / (float) class137_sub1_sub1_11.anInt10133;
		float f_14 = (float) i_3 - (float) i_1;
		float f_15 = (float) i_4 - (float) i_2;
		float f_16 = (float) (1.0D / Math.sqrt((double) (f_14 * f_14 + f_15 * f_15)));
		f_14 *= f_16;
		f_15 *= f_16;
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f_12 * (float) (i_1 - i_8), f_13 * (float) (i_2 - i_9));
		OpenGL.glVertex2f((float) i_1 + 0.35F, (float) i_2 + 0.35F);
		OpenGL.glTexCoord2f(f_12 * (float) (i_3 - i_8), f_13 * (float) (i_4 - i_9));
		OpenGL.glVertex2f((float) i_3 + f_14 + 0.35F, (float) i_4 + f_15 + 0.35F);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
		if (i_1 != i_3 || i_2 != i_4) {
			Class455_Sub2 class455_sub2_13 = (Class455_Sub2) class455_7;
			Class137_Sub1_Sub1 class137_sub1_sub1_14 = class455_sub2_13.aClass137_Sub1_Sub1_8974;
			this.method13637();
			this.method13654(class455_sub2_13.aClass137_Sub1_Sub1_8974);
			this.method13624(i_6);
			this.method13717(7681, 8448);
			this.method13595(0, 34167, 768);
			float f_15 = class137_sub1_sub1_14.aFloat10132 / (float) class137_sub1_sub1_14.anInt10136;
			float f_16 = class137_sub1_sub1_14.aFloat10134 / (float) class137_sub1_sub1_14.anInt10133;
			float f_17 = (float) i_3 - (float) i_1;
			float f_18 = (float) i_4 - (float) i_2;
			float f_19 = (float) (1.0D / Math.sqrt((double) (f_17 * f_17 + f_18 * f_18)));
			f_17 *= f_19;
			f_18 *= f_19;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_12 %= i_11 + i_10;
			float f_20 = f_17 * (float) i_10;
			float f_21 = f_18 * (float) i_10;
			float f_22 = 0.0F;
			float f_23 = 0.0F;
			float f_24 = f_20;
			float f_25 = f_21;
			if (i_12 > i_10) {
				f_22 = f_17 * (float) (i_10 + i_11 - i_12);
				f_23 = f_18 * (float) (i_10 + i_11 - i_12);
			} else {
				f_24 = f_17 * (float) (i_10 - i_12);
				f_25 = f_18 * (float) (i_10 - i_12);
			}

			float f_26 = (float) i_1 + 0.35F + f_22;
			float f_27 = (float) i_2 + 0.35F + f_23;
			float f_28 = f_17 * (float) i_11;
			float f_29 = f_18 * (float) i_11;

			while (true) {
				if (i_3 > i_1) {
					if (f_26 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_26 + f_24 > (float) i_3) {
						f_24 = (float) i_3 - f_26;
					}
				} else {
					if (f_26 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_26 + f_24 < (float) i_3) {
						f_24 = (float) i_3 - f_26;
					}
				}

				if (i_4 > i_2) {
					if (f_27 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_27 + f_25 > (float) i_4) {
						f_25 = (float) i_4 - f_27;
					}
				} else {
					if (f_27 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_27 + f_25 < (float) i_4) {
						f_25 = (float) i_4 - f_27;
					}
				}

				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f_15 * (f_26 - (float) i_8), f_16 * (f_27 - (float) i_9));
				OpenGL.glVertex2f(f_26, f_27);
				OpenGL.glTexCoord2f(f_15 * (f_26 + f_24 - (float) i_8), f_16 * (f_27 + f_25 - (float) i_9));
				OpenGL.glVertex2f(f_26 + f_24, f_27 + f_25);
				OpenGL.glEnd();
				f_26 += f_28 + f_24;
				f_27 += f_29 + f_25;
				f_24 = f_20;
				f_25 = f_21;
			}

			this.method13595(0, 5890, 768);
		}

	}

	public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		OpenGL.glLineWidth((float) i_6);
		this.method8433(i_1, i_2, i_3, i_4, i_5, i_7);
		OpenGL.glLineWidth(1.0F);
	}

	public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_1 + this.aClass384_8394.buf[6] * (float) i_2 + this.aClass384_8394.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_4 + this.aClass384_8394.buf[6] * (float) i_5 + this.aClass384_8394.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_1 + this.aClass384_8394.buf[7] * (float) i_2 + this.aClass384_8394.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_4 + this.aClass384_8394.buf[7] * (float) i_5 + this.aClass384_8394.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_1 + this.aClass384_8394.buf[4] * (float) i_2 + this.aClass384_8394.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_4 + this.aClass384_8394.buf[4] * (float) i_5 + this.aClass384_8394.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_1 + this.aClass384_8394.buf[5] * (float) i_2 + this.aClass384_8394.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_4 + this.aClass384_8394.buf[5] * (float) i_5 + this.aClass384_8394.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	final void method13647(OpenGlArrayBufferPointer class143_1, OpenGlArrayBufferPointer class143_2, OpenGlArrayBufferPointer class143_3, OpenGlArrayBufferPointer class143_4) {
		if (class143_1 != null) {
			this.method13601(class143_1.anInterface14_1667);
			OpenGL.glVertexPointer(class143_1.aByte1670, class143_1.aShort1668, this.anInterface14_8483.method59(), this.anInterface14_8483.method109() + (long) class143_1.aByte1669);
			OpenGL.glEnableClientState(32884);
		} else {
			OpenGL.glDisableClientState(32884);
		}

		if (class143_2 != null) {
			this.method13601(class143_2.anInterface14_1667);
			OpenGL.glNormalPointer(class143_2.aShort1668, this.anInterface14_8483.method59(), this.anInterface14_8483.method109() + (long) class143_2.aByte1669);
			OpenGL.glEnableClientState(32885);
		} else {
			OpenGL.glDisableClientState(32885);
		}

		if (class143_3 != null) {
			this.method13601(class143_3.anInterface14_1667);
			OpenGL.glColorPointer(class143_3.aByte1670, class143_3.aShort1668, this.anInterface14_8483.method59(), this.anInterface14_8483.method109() + (long) class143_3.aByte1669);
			OpenGL.glEnableClientState(32886);
		} else {
			OpenGL.glDisableClientState(32886);
		}

		if (class143_4 != null) {
			this.method13601(class143_4.anInterface14_1667);
			OpenGL.glTexCoordPointer(class143_4.aByte1670, class143_4.aShort1668, this.anInterface14_8483.method59(), this.anInterface14_8483.method109() + (long) class143_4.aByte1669);
			OpenGL.glEnableClientState(32888);
		} else {
			OpenGL.glDisableClientState(32888);
		}

	}

	public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_1 + this.aClass384_8394.buf[6] * (float) i_2 + this.aClass384_8394.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_4 + this.aClass384_8394.buf[6] * (float) i_5 + this.aClass384_8394.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_1 + this.aClass384_8394.buf[7] * (float) i_2 + this.aClass384_8394.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_4 + this.aClass384_8394.buf[7] * (float) i_5 + this.aClass384_8394.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_1 + this.aClass384_8394.buf[4] * (float) i_2 + this.aClass384_8394.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_4 + this.aClass384_8394.buf[4] * (float) i_5 + this.aClass384_8394.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_1 + this.aClass384_8394.buf[5] * (float) i_2 + this.aClass384_8394.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_4 + this.aClass384_8394.buf[5] * (float) i_5 + this.aClass384_8394.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public int method8540(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_1 + this.aClass384_8394.buf[6] * (float) i_2 + this.aClass384_8394.buf[10] * (float) i_3;
		float f_9 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * (float) i_4 + this.aClass384_8394.buf[6] * (float) i_5 + this.aClass384_8394.buf[10] * (float) i_6;
		float f_10 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_1 + this.aClass384_8394.buf[7] * (float) i_2 + this.aClass384_8394.buf[11] * (float) i_3;
		float f_11 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * (float) i_4 + this.aClass384_8394.buf[7] * (float) i_5 + this.aClass384_8394.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_1 + this.aClass384_8394.buf[4] * (float) i_2 + this.aClass384_8394.buf[8] * (float) i_3;
		float f_13 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * (float) i_4 + this.aClass384_8394.buf[4] * (float) i_5 + this.aClass384_8394.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_1 + this.aClass384_8394.buf[5] * (float) i_2 + this.aClass384_8394.buf[9] * (float) i_3;
		float f_15 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * (float) i_4 + this.aClass384_8394.buf[5] * (float) i_5 + this.aClass384_8394.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public Node_Sub1 method8570(int i_1) {
		Node_Sub1_Sub1 class282_sub1_sub1_2 = new Node_Sub1_Sub1(i_1);
		this.aClass473_8369.insertBack(class282_sub1_sub1_2);
		return class282_sub1_sub1_2;
	}

	public Node_Sub1 method8541(int i_1) {
		Node_Sub1_Sub1 class282_sub1_sub1_2 = new Node_Sub1_Sub1(i_1);
		this.aClass473_8369.insertBack(class282_sub1_sub1_2);
		return class282_sub1_sub1_2;
	}

	public void method8542(Node_Sub1 class282_sub1_1) {
		this.aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (this.anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (this.aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
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
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
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
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			this.anInterface14_8496 = this.method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index * -1115476867 * -1990677291, false);
			this.aClass143_8494 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 3, 0);
			this.aClass143_8495 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 2, 12);
			this.aClass134_8359.method2328(this);
		}

	}

	public void method8544(Node_Sub1 class282_sub1_1) {
		this.aNativeHeap8445 = ((Node_Sub1_Sub1) class282_sub1_1).aNativeHeap10051;
		if (this.anInterface14_8496 == null) {
			Node_Sub35_Sub1 class282_sub35_sub1_2 = new Node_Sub35_Sub1(80);
			if (this.aBool8467) {
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(-1.0F);
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
				class282_sub35_sub1_2.method14688(-1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
				class282_sub35_sub1_2.method14688(1.0F);
				class282_sub35_sub1_2.method14688(0.0F);
			} else {
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(-1.0F);
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
				class282_sub35_sub1_2.method14685(-1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
				class282_sub35_sub1_2.method14685(1.0F);
				class282_sub35_sub1_2.method14685(0.0F);
			}

			this.anInterface14_8496 = this.method13599(20, class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index * -1115476867 * -1990677291, false);
			this.aClass143_8494 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 3, 0);
			this.aClass143_8495 = new OpenGlArrayBufferPointer(this.anInterface14_8496, 5126, 2, 12);
			this.aClass134_8359.method2328(this);
		}

	}

	public void XA(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method13659();
		this.method13624(i_5);
		float f_6 = (float) i_1 + 0.35F;
		float f_7 = (float) i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6 + (float) i_3, f_7);
		OpenGL.glEnd();
	}

	public FontRenderer method8660(FontMetrics fontmetrics_1, SpriteDefinitions[] arr_2, boolean bool_3) {
		return new FontRenderer_Sub5(this, fontmetrics_1, arr_2, bool_3);
	}

	public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new NativeSprite_Sub2(this, i_4, i_5, ints_1, i_2, i_3);
	}

	public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new NativeSprite_Sub2(this, i_4, i_5, ints_1, i_2, i_3);
	}

	public NativeSprite method8612(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = new int[class91_1.width * class91_1.height];
		int i_4 = 0;
		int i_5 = 0;
		int i_6;
		int i_7;
		if (class91_1.alpha != null) {
			for (i_6 = 0; i_6 < class91_1.height; i_6++) {
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					ints_3[i_5++] = class91_1.alpha[i_4] << 24 | class91_1.pallete[class91_1.pixels[i_4] & 0xff];
					++i_4;
				}
			}
		} else {
			for (i_6 = 0; i_6 < class91_1.height; i_6++) {
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					int i_8 = class91_1.pallete[class91_1.pixels[i_4++] & 0xff];
					ints_3[i_5++] = i_8 != 0 ? ~0xffffff | i_8 : 0;
				}
			}
		}

		NativeSprite nativesprite_9 = this.createNativeSprite(ints_3, class91_1.width, class91_1.width, class91_1.height, 340274012);
		nativesprite_9.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_9;
	}

	public NativeSprite method8518(SpriteDefinitions class91_1, boolean bool_2) {
		int[] ints_3 = new int[class91_1.width * class91_1.height];
		int i_4 = 0;
		int i_5 = 0;
		int i_6;
		int i_7;
		if (class91_1.alpha != null) {
			for (i_6 = 0; i_6 < class91_1.height; i_6++) {
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					ints_3[i_5++] = class91_1.alpha[i_4] << 24 | class91_1.pallete[class91_1.pixels[i_4] & 0xff];
					++i_4;
				}
			}
		} else {
			for (i_6 = 0; i_6 < class91_1.height; i_6++) {
				for (i_7 = 0; i_7 < class91_1.width; i_7++) {
					int i_8 = class91_1.pallete[class91_1.pixels[i_4++] & 0xff];
					ints_3[i_5++] = i_8 != 0 ? ~0xffffff | i_8 : 0;
				}
			}
		}

		NativeSprite nativesprite_9 = this.createNativeSprite(ints_3, class91_1.width, class91_1.width, class91_1.height, 639428153);
		nativesprite_9.method2743(class91_1.minX, class91_1.minY, class91_1.anInt958, class91_1.anInt953);
		return nativesprite_9;
	}

	public int method8434(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new NativeSprite_Sub2(this, i_1, i_2, bool_3);
	}

	public void GA() {
		this.aFloat8364 = (float) 0.0;
		this.aFloat8320 = (float) 1.0;
		this.method13671();
	}

	public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	public void hr(int i_1, Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		this.method13624(1);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / (float) class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / (float) class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (i_1 >> 16), (byte) (i_1 >> 8), (byte) i_1, (byte) (i_1 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8415);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8415);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void hz(int i_1, Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		this.method13624(1);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / (float) class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / (float) class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (i_1 >> 16), (byte) (i_1 >> 8), (byte) i_1, (byte) (i_1 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8415);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8415);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void G(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.method13659();
		this.method13624(i_5);
		float f_6 = (float) i_1 + 0.35F;
		float f_7 = (float) i_2 + 0.35F;
		OpenGL.glColor4ub((byte) (i_4 >> 16), (byte) (i_4 >> 8), (byte) i_4, (byte) (i_4 >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f_6, f_7);
		OpenGL.glVertex2f(f_6, f_7 + (float) i_3);
		OpenGL.glEnd();
	}

	public void method8514(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8417 = i_1;
		this.anInt8418 = i_2;
		this.anInt8419 = i_3;
		this.anInt8347 = i_4;
		this.method13584();
	}

	public void method8559(int i_1) {
	}

	public void method8560(int i_1) {
	}

	public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new MeshRasterizer_Sub1(this, rsmesh_1, i_2, i_4, i_5, i_3);
	}

	public int method8565(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public final void ft(int[] ints_1) {
		ints_1[0] = this.anInt8413;
		ints_1[1] = this.anInt8415;
		ints_1[2] = this.anInt8412;
		ints_1[3] = this.anInt8478;
	}

	public int method8443(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	int method13652() {
		int i_1 = 0;
		this.aString8463 = OpenGL.glGetString(7936).toLowerCase();
		this.aString8464 = OpenGL.glGetString(7937).toLowerCase();
		if (this.aString8463.indexOf("microsoft") != -1) {
			i_1 |= 0x1;
		}

		if (this.aString8463.indexOf("brian paul") != -1 || this.aString8463.indexOf("mesa") != -1) {
			i_1 |= 0x1;
		}

		String string_2 = OpenGL.glGetString(7938);
		String[] arr_3 = MovingAnimation.method12681(string_2.replace('.', ' '), ' ');
		if (arr_3.length >= 2) {
			try {
				int i_4 = Class328.parseInt(arr_3[0], 242232953);
				int i_5 = Class328.parseInt(arr_3[1], -1619906898);
				this.anInt8443 = i_4 * 10 + i_5;
			} catch (NumberFormatException numberformatexception_7) {
				i_1 |= 0x4;
			}
		} else {
			i_1 |= 0x4;
		}

		if (this.anInt8443 < 12) {
			i_1 |= 0x2;
		}

		if (!this.anOpenGL8352.method2569("GL_ARB_multitexture")) {
			i_1 |= 0x8;
		}

		if (!this.anOpenGL8352.method2569("GL_ARB_texture_env_combine")) {
			i_1 |= 0x20;
		}

		int[] ints_6 = new int[1];
		OpenGL.glGetIntegerv(34018, ints_6, 0);
		this.anInt8469 = ints_6[0];
		OpenGL.glGetIntegerv(34929, ints_6, 0);
		this.anInt8470 = ints_6[0];
		OpenGL.glGetIntegerv(34930, ints_6, 0);
		this.anInt8471 = ints_6[0];
		if (this.anInt8469 < 2 || this.anInt8470 < 2 || this.anInt8471 < 2) {
			i_1 |= 0x10;
		}

		this.aBool8467 = Stream.method2926();
		this.aBool8309 = this.anOpenGL8352.method2569("GL_ARB_vertex_buffer_object");
		this.aBool8342 = this.anOpenGL8352.method2569("GL_ARB_multisample");
		this.aBool8484 = this.anOpenGL8352.method2569("GL_ARB_vertex_program");
		this.anOpenGL8352.method2569("GL_ARB_fragment_program");
		this.aBool8485 = this.anOpenGL8352.method2569("GL_ARB_vertex_shader");
		this.aBool8365 = this.anOpenGL8352.method2569("GL_ARB_fragment_shader");
		this.aBool8393 = this.anOpenGL8352.method2569("GL_EXT_texture3D");
		this.aBool8401 = this.anOpenGL8352.method2569("GL_ARB_texture_rectangle");
		this.aBool8480 = this.anOpenGL8352.method2569("GL_ARB_texture_cube_map");
		this.aBool8312 = this.anOpenGL8352.method2569("GL_ARB_texture_float");
		this.aBool8498 = false;
		this.aBool8472 = this.anOpenGL8352.method2569("GL_EXT_framebuffer_object");
		this.aBool8338 = this.anOpenGL8352.method2569("GL_EXT_framebuffer_blit");
		this.aBool8488 = this.anOpenGL8352.method2569("GL_EXT_framebuffer_multisample");
		this.aBool8344 = this.aBool8338 & this.aBool8488;
		this.aBool8456 = Class396.OS_NAME.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray8497, 0);
		this.aFloat8414 = aFloatArray8497[0];
		this.aFloat8489 = aFloatArray8497[1];
		return i_1 != 0 ? i_1 : 0;
	}

	final void method13654(Class137 class137_1) {
		Class137 class137_2 = this.aClass137Array8482[this.anInt8458];
		if (class137_2 != class137_1) {
			if (class137_1 != null) {
				if (class137_2 != null) {
					if (class137_2.anInt1648 != class137_1.anInt1648) {
						OpenGL.glDisable(class137_2.anInt1648);
						OpenGL.glEnable(class137_1.anInt1648);
					}
				} else {
					OpenGL.glEnable(class137_1.anInt1648);
				}

				OpenGL.glBindTexture(class137_1.anInt1648, class137_1.anInt1647);
			} else {
				OpenGL.glDisable(class137_2.anInt1648);
			}

			this.aClass137Array8482[this.anInt8458] = class137_1;
		}

		this.anInt8382 &= ~0x1;
	}

	public Matrix44Var method8572() {
		return this.aClass294_8476;
	}

	public Matrix44Var method8626() {
		return this.aClass294_8476;
	}

	public int method8574() {
		return 4;
	}

	public void method8394(int i_1, Node_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aNode_Sub24Array8435[i_3] = arr_2[i_3];
		}

		this.anInt8437 = i_1;
		if (this.anInt8409 != 1) {
			this.method13638();
		}

	}

	public void method8426(int i_1, Node_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aNode_Sub24Array8435[i_3] = arr_2[i_3];
		}

		this.anInt8437 = i_1;
		if (this.anInt8409 != 1) {
			this.method13638();
		}

	}

	public void method8579(int i_1, Node_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aNode_Sub24Array8435[i_3] = arr_2[i_3];
		}

		this.anInt8437 = i_1;
		if (this.anInt8409 != 1) {
			this.method13638();
		}

	}

	public void method8580(Class151 class151_1) {
		this.aClass134_8359.method2329(this, class151_1);
	}

	public void method8581(Class151 class151_1) {
		this.aClass134_8359.method2329(this, class151_1);
	}

	public Matrix44Var method8583() {
		return new Matrix44Var(this.aClass294_8389);
	}

	public Matrix44Var method8685() {
		return new Matrix44Var(this.aClass294_8389);
	}

	final void method13656(boolean bool_1) {
		if (this.aBool8387 != bool_1) {
			if (bool_1) {
				OpenGL.glEnable(2929);
			} else {
				OpenGL.glDisable(2929);
			}

			this.aBool8387 = bool_1;
			this.anInt8382 &= ~0xf;
		}

	}

	public final void method8586(Matrix44Arr matrix44arr_1) {
		this.aClass384_8442.method6562(matrix44arr_1);
		this.method13597();
		this.method13588();
	}

	final synchronized void method13657(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.data = (long) i_1;
		this.aClass473_8486.insertBack(class282_sub38_3);
	}

	public final Matrix44Arr method8588() {
		return new Matrix44Arr(this.aClass384_8442);
	}

	public final Matrix44Arr method8590() {
		return new Matrix44Arr(this.aClass384_8442);
	}

	final void method13659() {
		if (this.anInt8382 != 1) {
			this.method13587();
			this.method13642(false);
			this.method13620(false);
			this.method13656(false);
			this.method13623(false);
			this.method13654((Class137) null);
			this.method13581(-2);
			this.method13612(1);
			this.anInt8382 = 1;
		}

	}

	public boolean method8578() {
		return this.aBool8342 && (!this.method8471() || this.aBool8344);
	}

	public final void iw(int i_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		boolean bool_7 = this.anInt8428 != i_1;
		if (bool_7 || this.aFloat8433 != f_2 || this.aFloat8434 != f_3) {
			this.anInt8428 = i_1;
			this.aFloat8433 = f_2;
			this.aFloat8434 = f_3;
			if (bool_7) {
				this.aFloat8429 = (float) (this.anInt8428 & 0xff0000) / 1.671168E7F;
				this.aFloat8430 = (float) (this.anInt8428 & 0xff00) / 65280.0F;
				this.aFloat8431 = (float) (this.anInt8428 & 0xff) / 255.0F;
				this.method13689();
			}

			this.method13592();
		}

		if (this.aFloatArray8424[0] != f_4 || this.aFloatArray8424[1] != f_5 || this.aFloatArray8424[2] != f_6) {
			this.aFloatArray8424[0] = f_4;
			this.aFloatArray8424[1] = f_5;
			this.aFloatArray8424[2] = f_6;
			this.aFloatArray8425[0] = -f_4;
			this.aFloatArray8425[1] = -f_5;
			this.aFloatArray8425[2] = -f_6;
			float f_8 = (float) (1.0D / Math.sqrt((double) (f_4 * f_4 + f_5 * f_5 + f_6 * f_6)));
			this.aFloatArray8426[0] = f_4 * f_8;
			this.aFloatArray8426[1] = f_5 * f_8;
			this.aFloatArray8426[2] = f_6 * f_8;
			this.aFloatArray8427[0] = -this.aFloatArray8426[0];
			this.aFloatArray8427[1] = -this.aFloatArray8426[1];
			this.aFloatArray8427[2] = -this.aFloatArray8426[2];
			this.method13593();
			this.anInt8438 = (int) (f_4 * 256.0F / f_5);
			this.anInt8439 = (int) (f_6 * 256.0F / f_5);
		}

	}

	public boolean method8644() {
		return true;
	}

	public final void iq(int i_1) {
		for (this.anInt8473 = 0 * -1431655765 * 3 * -1431655765 * 3; i_1 > 1; i_1 >>= 1) {
			this.anInt8473 = (this.anInt8473 * -1431655765 * 3 * -1431655765 * 3 + 1) * -1431655765 * 3 * -1431655765 * 3;
		}

		this.anInt8466 = 1 << this.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
	}

	public final void il(int i_1) {
		for (this.anInt8473 = 0 * -1431655765 * 3 * -1431655765 * 3; i_1 > 1; i_1 >>= 1) {
			this.anInt8473 = (this.anInt8473 * -1431655765 * 3 * -1431655765 * 3 + 1) * -1431655765 * 3 * -1431655765 * 3;
		}

		this.anInt8466 = 1 << this.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
	}

	public final void is(int i_1, int i_2, int i_3) {
		if (this.anInt8441 != i_1 || this.anInt8358 != i_2 || this.anInt8378 != i_3) {
			this.anInt8441 = i_1;
			this.anInt8358 = i_2;
			this.anInt8378 = i_3;
			this.method13594();
			this.method13747();
		}

	}

	public final void ik(int i_1, int i_2, int i_3) {
		if (this.anInt8441 != i_1 || this.anInt8358 != i_2 || this.anInt8378 != i_3) {
			this.anInt8441 = i_1;
			this.anInt8358 = i_2;
			this.anInt8378 = i_3;
			this.method13594();
			this.method13747();
		}

	}

	public final void ib(int i_1, int i_2, int i_3) {
		if (this.anInt8441 != i_1 || this.anInt8358 != i_2 || this.anInt8378 != i_3) {
			this.anInt8441 = i_1;
			this.anInt8358 = i_2;
			this.anInt8378 = i_3;
			this.method13594();
			this.method13747();
		}

	}

	public void method8594(boolean bool_1) {
	}

	public void method8595(boolean bool_1) {
	}

	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		if (class152_1 != null && class152_2 != null && this.aBool8480 && this.aBool8472) {
			Class152_Sub1_Sub2 class152_sub1_sub2_5 = null;
			Class152_Sub1 class152_sub1_6 = (Class152_Sub1) class152_1;
			Class152_Sub1 class152_sub1_7 = (Class152_Sub1) class152_2;
			Class137_Sub2 class137_sub2_8 = class152_sub1_6.method13519();
			Class137_Sub2 class137_sub2_9 = class152_sub1_7.method13519();
			if (class137_sub2_8 != null && class137_sub2_9 != null) {
				int i_10 = class137_sub2_8.anInt9104 > class137_sub2_9.anInt9104 ? class137_sub2_8.anInt9104 : class137_sub2_9.anInt9104;
				if (class152_1 != class152_4 && class152_2 != class152_4 && class152_4 instanceof Class152_Sub1_Sub2) {
					Class152_Sub1_Sub2 class152_sub1_sub2_11 = (Class152_Sub1_Sub2) class152_4;
					if (class152_sub1_sub2_11.method15532() == i_10) {
						class152_sub1_sub2_5 = class152_sub1_sub2_11;
					}
				}

				if (class152_sub1_sub2_5 == null) {
					class152_sub1_sub2_5 = new Class152_Sub1_Sub2(this, i_10);
				}

				if (class152_sub1_sub2_5.method15531(class137_sub2_8, class137_sub2_9, f_3)) {
					return class152_sub1_sub2_5;
				}
			}
		}

		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	public final void method8584(Class152 class152_1) {
		this.aClass152_Sub1_8317 = (Class152_Sub1) class152_1;
	}

	public final void method8598(Class152 class152_1) {
		this.aClass152_Sub1_8317 = (Class152_Sub1) class152_1;
	}

	public final void method8691() {
		this.aClass170_8357.method2883();
	}

	public void method8635() {
		this.anInt8417 = 0;
		this.anInt8418 = 0;
		this.anInt8419 = this.aClass158_5853.method2714();
		this.anInt8347 = this.aClass158_5853.method2716();
		this.method13584();
	}

	public final void method8602() {
		if (this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129()) {
			this.aClass170_8357.method2885(this.aNode_Sub5_Sub1_8444);
			this.aClass167_8481.method2861();
		}

	}

	public final void method8521() {
		if (this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129()) {
			this.aClass170_8357.method2885(this.aNode_Sub5_Sub1_8444);
			this.aClass167_8481.method2861();
		}

	}

	public final boolean method8679() {
		return this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129();
	}

	public final boolean method8605() {
		return this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129();
	}

	public final boolean method8607() {
		return this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129();
	}

	final void method8608(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		Node_Sub5_Sub1.aFloat10026 = f_1;
		Node_Sub5_Sub1.aFloat10025 = f_2;
		Node_Sub5_Sub1.aFloat10024 = f_3;
	}

	public Matrix44Arr method8517() {
		return this.aClass384_8360;
	}

	final void method13663(Interface15 interface15_1) {
		if (interface15_1 != this.anInterface15_8452) {
			if (this.aBool8309) {
				OpenGL.glBindBufferARB(34963, interface15_1.method1());
			}

			this.anInterface15_8452 = interface15_1;
		}

	}

	public final void method8611() {
		this.aClass170_8357.method2883();
	}

	public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return Class455_Sub2.method14343(this, i_1, i_2, ints_3, ints_4);
	}

	public final void method8613() {
		this.aClass170_8357.method2883();
	}

	public void method8585(int i_1, HDWaterTile class90_2) {
		this.anInt8450 = i_1;
		this.aClass90_8423 = class90_2;
		this.aBool8448 = true;
	}

	public void method8615(int i_1, HDWaterTile class90_2) {
		if (!this.aBool8448) {
			throw new RuntimeException("");
		} else {
			this.anInt8450 = i_1;
			this.aClass90_8423 = class90_2;
			if (this.aBool8449) {
				this.aClass146_8356.aClass141_Sub4_1715.method14427();
				this.aClass146_8356.aClass141_Sub4_1715.method14428();
			}

		}
	}

	public void method8616(int i_1, HDWaterTile class90_2) {
		if (!this.aBool8448) {
			throw new RuntimeException("");
		} else {
			this.anInt8450 = i_1;
			this.aClass90_8423 = class90_2;
			if (this.aBool8449) {
				this.aClass146_8356.aClass141_Sub4_1715.method14427();
				this.aClass146_8356.aClass141_Sub4_1715.method14428();
			}

		}
	}

	public void jf() {
		this.aBool8448 = false;
	}

	public void method8513(int i_1, int i_2, int i_3, int i_4) {
		this.anInt8417 = i_1;
		this.anInt8418 = i_2;
		this.anInt8419 = i_3;
		this.anInt8347 = i_4;
		this.method13584();
	}

	public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8394.buf[14] + this.aClass384_8394.buf[2] * f_1 + this.aClass384_8394.buf[6] * f_2 + this.aClass384_8394.buf[10] * f_3;
		float f_6 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * f_1 + this.aClass384_8394.buf[7] * f_2 + this.aClass384_8394.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * f_1 + this.aClass384_8394.buf[4] * f_2 + this.aClass384_8394.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * f_1 + this.aClass384_8394.buf[5] * f_2 + this.aClass384_8394.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.aClass384_8348.buf[14] + this.aClass384_8348.buf[2] * f_1 + this.aClass384_8348.buf[6] * f_2 + this.aClass384_8348.buf[10] * f_3;
					floats_4[0] = this.aFloat8315 + this.aFloat8398 * f_7 / f_6;
					floats_4[1] = this.aFloat8399 + this.aFloat8400 * f_8 / f_6;
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

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub4(this);
	}

	public Interface8 method8621(int i_1, int i_2) {
		return new CacheableNode_Sub19(this, Class150.aClass150_1953, Class76.aClass76_749, i_1, i_2);
	}

	public boolean method8609() {
		return false;
	}

	public int method8567(int i_1, int i_2) {
		return i_1 & i_2 ^ i_2;
	}

	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 == null) {
			return null;
		} else {
			int[] ints_5 = new int[i_3 * i_4];
			int i_6 = this.aClass158_5853.method2716();

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt8410 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);
			}

			return ints_5;
		}
	}

	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 == null) {
			return null;
		} else {
			int[] ints_5 = new int[i_3 * i_4];
			int i_6 = this.aClass158_5853.method2716();

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt8410 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);
			}

			return ints_5;
		}
	}

	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		if (this.aClass158_5853 == null) {
			return null;
		} else {
			int[] ints_5 = new int[i_3 * i_4];
			int i_6 = this.aClass158_5853.method2716();

			for (int i_7 = 0; i_7 < i_4; i_7++) {
				OpenGL.glReadPixelsi(i_1, i_6 - i_2 - i_7 - 1, i_3, 1, 32993, this.anInt8410 * -1466767273 * 33639 * -1466767273 * 33639, ints_5, i_7 * i_3);
			}

			return ints_5;
		}
	}

	public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		this.method13659();
		this.method13624(i_13);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_10 >> 16), (byte) (i_10 >> 8), (byte) i_10, (byte) (i_10 >> 24));
		OpenGL.glVertex3f((float) i_1 + 0.35F, (float) i_2 + 0.35F, f_3);
		OpenGL.glColor4ub((byte) (i_11 >> 16), (byte) (i_11 >> 8), (byte) i_11, (byte) (i_11 >> 24));
		OpenGL.glVertex3f((float) i_4 + 0.35F, (float) i_5 + 0.35F, f_6);
		OpenGL.glColor4ub((byte) (i_12 >> 16), (byte) (i_12 >> 8), (byte) i_12, (byte) (i_12 >> 24));
		OpenGL.glVertex3f((float) i_7 + 0.35F, (float) i_8 + 0.35F, f_9);
		OpenGL.glEnd();
	}

	public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
		return new OpenGLGround(this, i_6, i_7, i_1, i_2, ints_3, ints_4, 512);
	}

	public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		this.method13659();
		this.method13624(i_13);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_10 >> 16), (byte) (i_10 >> 8), (byte) i_10, (byte) (i_10 >> 24));
		OpenGL.glVertex3f((float) i_1 + 0.35F, (float) i_2 + 0.35F, f_3);
		OpenGL.glColor4ub((byte) (i_11 >> 16), (byte) (i_11 >> 8), (byte) i_11, (byte) (i_11 >> 24));
		OpenGL.glVertex3f((float) i_4 + 0.35F, (float) i_5 + 0.35F, f_6);
		OpenGL.glColor4ub((byte) (i_12 >> 16), (byte) (i_12 >> 8), (byte) i_12, (byte) (i_12 >> 24));
		OpenGL.glVertex3f((float) i_7 + 0.35F, (float) i_8 + 0.35F, f_9);
		OpenGL.glEnd();
	}

	public int method8630(int i_1, int i_2) {
		return i_1 | i_2;
	}

	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub1(this, canvas_1);
	}

	public int method8632(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public void method8633() {
		this.anInt8417 = 0;
		this.anInt8418 = 0;
		this.anInt8419 = this.aClass158_5853.method2714();
		this.anInt8347 = this.aClass158_5853.method2716();
		this.method13584();
	}

	public void method8634() {
		this.anInt8417 = 0;
		this.anInt8418 = 0;
		this.anInt8419 = this.aClass158_5853.method2714();
		this.anInt8347 = this.aClass158_5853.method2716();
		this.method13584();
	}

	final void method13671() {
		if (this.anInt8409 == 2) {
			OpenGL.glDepthRange(this.aFloat8364, this.aFloat8320);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}

	}

	public final boolean method8606() {
		return this.aNode_Sub5_Sub1_8444 != null && this.aNode_Sub5_Sub1_8444.method12129();
	}

	final synchronized void method13678(int i_1) {
		IntNode class282_sub38_2 = new IntNode(i_1);
		this.aClass473_8376.insertBack(class282_sub38_2);
	}

	public final int di() {
		return this.anInt8371 + this.anInt8370 + this.anInt8372;
	}

	public Class168 method8392() {
		int i_1 = -1;
		if (this.aString8463.indexOf("nvidia") != -1) {
			i_1 = 4318;
		} else if (this.aString8463.indexOf("intel") != -1) {
			i_1 = 32902;
		} else if (this.aString8463.indexOf("ati") != -1) {
			i_1 = 4098;
		}

		return new Class168(i_1, "OpenGL", this.anInt8443, this.aString8464, 0L);
	}

	public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new NativeSprite_Sub2(this, i_1, i_2, bool_3);
	}

	void method13689() {
		aFloatArray8497[0] = this.aFloat8432 * this.aFloat8429;
		aFloatArray8497[1] = this.aFloat8432 * this.aFloat8430;
		aFloatArray8497[2] = this.aFloat8432 * this.aFloat8431;
		aFloatArray8497[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray8497, 0);
	}

	public final Matrix44Arr method8589() {
		return new Matrix44Arr(this.aClass384_8442);
	}

	public void N(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		float f_10;
		float f_11;
		if (this.aClass137_Sub1_Sub1_8462 != null && this.aClass137_Sub1_Sub1_8462.anInt9087 >= i_3 && this.aClass137_Sub1_Sub1_8462.anInt9086 >= i_4) {
			this.aClass137_Sub1_Sub1_8462.method14455(0, i_3, i_4, bytes_7, Class150.aClass150_1951, 0, false);
			f_10 = this.aClass137_Sub1_Sub1_8462.aFloat10134 * (float) i_4 / (float) this.aClass137_Sub1_Sub1_8462.anInt9086;
			f_11 = this.aClass137_Sub1_Sub1_8462.aFloat10132 * (float) i_3 / (float) this.aClass137_Sub1_Sub1_8462.anInt9087;
		} else {
			this.aClass137_Sub1_Sub1_8462 = Class137_Sub1_Sub1.method15540(this, Class150.aClass150_1951, Class76.aClass76_751, i_3, i_4, bytes_7, Class150.aClass150_1951);
			this.aClass137_Sub1_Sub1_8462.method14445(false, false);
			f_10 = this.aClass137_Sub1_Sub1_8462.aFloat10134;
			f_11 = this.aClass137_Sub1_Sub1_8462.aFloat10132;
		}

		this.method13637();
		this.method13654(this.aClass137_Sub1_Sub1_8462);
		this.method13624(i_9);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		this.method13617(i_6);
		this.method13717(34165, 34165);
		this.method13595(0, 34166, 768);
		this.method13595(2, 5890, 770);
		this.method13616(0, 34166);
		this.method13616(2, 5890);
		float f_12 = (float) i_1;
		float f_13 = (float) i_2;
		float f_14 = f_12 + (float) i_3;
		float f_15 = f_13 + (float) i_4;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glTexCoord2f(0.0F, f_11);
		OpenGL.glVertex2f(f_12, f_15);
		OpenGL.glTexCoord2f(f_10, f_11);
		OpenGL.glVertex2f(f_14, f_15);
		OpenGL.glTexCoord2f(f_10, 0.0F);
		OpenGL.glVertex2f(f_14, f_13);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
		this.method13595(2, 34166, 770);
		this.method13616(0, 5890);
		this.method13616(2, 34166);
	}

	public final void fh(int[] ints_1) {
		ints_1[0] = this.anInt8413;
		ints_1[1] = this.anInt8415;
		ints_1[2] = this.anInt8412;
		ints_1[3] = this.anInt8478;
	}

	public final void ii(int i_1) {
		for (this.anInt8473 = 0 * -1431655765 * 3 * -1431655765 * 3; i_1 > 1; i_1 >>= 1) {
			this.anInt8473 = (this.anInt8473 * -1431655765 * 3 * -1431655765 * 3 + 1) * -1431655765 * 3 * -1431655765 * 3;
		}

		this.anInt8466 = 1 << this.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
	}

	public void method8547(int i_1, Node_Sub24[] arr_2) {
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			this.aNode_Sub24Array8435[i_3] = arr_2[i_3];
		}

		this.anInt8437 = i_1;
		if (this.anInt8409 != 1) {
			this.method13638();
		}

	}

	boolean method13704() {
		return this.aClass146_8356.method2465();
	}

	public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aClass384_8394.buf[15] + this.aClass384_8394.buf[3] * f_1 + this.aClass384_8394.buf[7] * f_2 + this.aClass384_8394.buf[11] * f_3;
		float f_6 = this.aClass384_8394.buf[12] + this.aClass384_8394.buf[0] * f_1 + this.aClass384_8394.buf[4] * f_2 + this.aClass384_8394.buf[8] * f_3;
		float f_7 = this.aClass384_8394.buf[13] + this.aClass384_8394.buf[1] * f_1 + this.aClass384_8394.buf[5] * f_2 + this.aClass384_8394.buf[9] * f_3;
		float f_8 = this.aClass384_8348.buf[14] + this.aClass384_8348.buf[2] * f_1 + this.aClass384_8348.buf[6] * f_2 + this.aClass384_8348.buf[10] * f_3;
		floats_4[0] = this.aFloat8315 + this.aFloat8398 * f_6 / f_5;
		floats_4[1] = this.aFloat8399 + this.aFloat8400 * f_7 / f_5;
		floats_4[2] = f_8;
	}

	final synchronized void method13707(int i_1, int i_2) {
		IntNode class282_sub38_3 = new IntNode(i_2);
		class282_sub38_3.data = (long) i_1;
		this.aClass473_8377.insertBack(class282_sub38_3);
	}

	public void hi(int i_1, Class455 class455_2, int i_3, int i_4) {
		Class455_Sub2 class455_sub2_5 = (Class455_Sub2) class455_2;
		Class137_Sub1_Sub1 class137_sub1_sub1_6 = class455_sub2_5.aClass137_Sub1_Sub1_8974;
		this.method13637();
		this.method13654(class455_sub2_5.aClass137_Sub1_Sub1_8974);
		this.method13624(1);
		this.method13717(7681, 8448);
		this.method13595(0, 34167, 768);
		float f_7 = class137_sub1_sub1_6.aFloat10132 / (float) class137_sub1_sub1_6.anInt10136;
		float f_8 = class137_sub1_sub1_6.aFloat10134 / (float) class137_sub1_sub1_6.anInt10133;
		OpenGL.glColor4ub((byte) (i_1 >> 16), (byte) (i_1 >> 8), (byte) i_1, (byte) (i_1 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8415);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8413 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8413, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8478 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8478);
		OpenGL.glTexCoord2f(f_7 * (float) (this.anInt8412 - i_3), f_8 * (float) (this.anInt8415 - i_4));
		OpenGL.glVertex2i(this.anInt8412, this.anInt8415);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
	}

	public void ff(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte[] bytes_7, int i_8, int i_9) {
		float f_10;
		float f_11;
		if (this.aClass137_Sub1_Sub1_8462 != null && this.aClass137_Sub1_Sub1_8462.anInt9087 >= i_3 && this.aClass137_Sub1_Sub1_8462.anInt9086 >= i_4) {
			this.aClass137_Sub1_Sub1_8462.method14455(0, i_3, i_4, bytes_7, Class150.aClass150_1951, 0, false);
			f_10 = this.aClass137_Sub1_Sub1_8462.aFloat10134 * (float) i_4 / (float) this.aClass137_Sub1_Sub1_8462.anInt9086;
			f_11 = this.aClass137_Sub1_Sub1_8462.aFloat10132 * (float) i_3 / (float) this.aClass137_Sub1_Sub1_8462.anInt9087;
		} else {
			this.aClass137_Sub1_Sub1_8462 = Class137_Sub1_Sub1.method15540(this, Class150.aClass150_1951, Class76.aClass76_751, i_3, i_4, bytes_7, Class150.aClass150_1951);
			this.aClass137_Sub1_Sub1_8462.method14445(false, false);
			f_10 = this.aClass137_Sub1_Sub1_8462.aFloat10134;
			f_11 = this.aClass137_Sub1_Sub1_8462.aFloat10132;
		}

		this.method13637();
		this.method13654(this.aClass137_Sub1_Sub1_8462);
		this.method13624(i_9);
		OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
		this.method13617(i_6);
		this.method13717(34165, 34165);
		this.method13595(0, 34166, 768);
		this.method13595(2, 5890, 770);
		this.method13616(0, 34166);
		this.method13616(2, 5890);
		float f_12 = (float) i_1;
		float f_13 = (float) i_2;
		float f_14 = f_12 + (float) i_3;
		float f_15 = f_13 + (float) i_4;
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_12, f_13);
		OpenGL.glTexCoord2f(0.0F, f_11);
		OpenGL.glVertex2f(f_12, f_15);
		OpenGL.glTexCoord2f(f_10, f_11);
		OpenGL.glVertex2f(f_14, f_15);
		OpenGL.glTexCoord2f(f_10, 0.0F);
		OpenGL.glVertex2f(f_14, f_13);
		OpenGL.glEnd();
		this.method13595(0, 5890, 768);
		this.method13595(2, 34166, 770);
		this.method13616(0, 5890);
		this.method13616(2, 34166);
	}

	public final void method8477(Class152 class152_1) {
		this.aClass152_Sub1_8317 = (Class152_Sub1) class152_1;
	}

	final void method13717(int i_1, int i_2) {
		if (this.anInt8458 == 0) {
			boolean bool_3 = false;
			if (this.anInt8455 != i_1) {
				OpenGL.glTexEnvi(8960, 34161, i_1);
				this.anInt8455 = i_1;
				bool_3 = true;
			}

			if (i_2 != this.anInt8451) {
				OpenGL.glTexEnvi(8960, 34162, i_2);
				this.anInt8451 = i_2;
				bool_3 = true;
			}

			if (bool_3) {
				this.anInt8382 &= ~0xd;
			}
		} else {
			OpenGL.glTexEnvi(8960, 34161, i_1);
			OpenGL.glTexEnvi(8960, 34162, i_2);
		}

	}

	final void method13719(float[] floats_1) {
		float[] floats_2 = new float[16];
		System.arraycopy(floats_1, 0, floats_2, 0, 16);
		floats_2[1] = -floats_2[1];
		floats_2[5] = -floats_2[5];
		floats_2[9] = -floats_2[9];
		floats_2[13] = -floats_2[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(floats_2, 0);
		OpenGL.glMatrixMode(5888);
	}

	public boolean method8462() {
		return this.aBool8342 && (!this.method8471() || this.aBool8344);
	}

	public boolean method8406() {
		return true;
	}

	public boolean method8504() {
		return true;
	}

	public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			this.method13659();
			this.method13624(i_6);
			float f_10 = (float) i_3 - (float) i_1;
			float f_11 = (float) i_4 - (float) i_2;
			float f_12 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * (float) i_7;
			float f_14 = f_11 * (float) i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (float) (i_7 + i_8 - i_9);
				f_16 = f_11 * (float) (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (float) (i_7 - i_9);
				f_18 = f_11 * (float) (i_7 - i_9);
			}

			float f_19 = (float) i_1 + 0.35F + f_15;
			float f_20 = (float) i_2 + 0.35F + f_16;
			float f_21 = f_10 * (float) i_8;
			float f_22 = f_11 * (float) i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 > (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				} else {
					if (f_19 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 < (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				}

				if (i_4 > i_2) {
					if (f_20 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 > (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				} else {
					if (f_20 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 < (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				}

				OpenGL.glBegin(1);
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

	public int method8463() {
		return 4;
	}

	public final void method8424(Matrix44Arr matrix44arr_1) {
		this.aClass384_8442.method6562(matrix44arr_1);
		this.method13597();
		this.method13588();
	}

	public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_1 != i_3 || i_2 != i_4) {
			this.method13659();
			this.method13624(i_6);
			float f_10 = (float) i_3 - (float) i_1;
			float f_11 = (float) i_4 - (float) i_2;
			float f_12 = (float) (1.0D / Math.sqrt((double) (f_10 * f_10 + f_11 * f_11)));
			f_10 *= f_12;
			f_11 *= f_12;
			OpenGL.glColor4ub((byte) (i_5 >> 16), (byte) (i_5 >> 8), (byte) i_5, (byte) (i_5 >> 24));
			i_9 %= i_8 + i_7;
			float f_13 = f_10 * (float) i_7;
			float f_14 = f_11 * (float) i_7;
			float f_15 = 0.0F;
			float f_16 = 0.0F;
			float f_17 = f_13;
			float f_18 = f_14;
			if (i_9 > i_7) {
				f_15 = f_10 * (float) (i_7 + i_8 - i_9);
				f_16 = f_11 * (float) (i_7 + i_8 - i_9);
			} else {
				f_17 = f_10 * (float) (i_7 - i_9);
				f_18 = f_11 * (float) (i_7 - i_9);
			}

			float f_19 = (float) i_1 + 0.35F + f_15;
			float f_20 = (float) i_2 + 0.35F + f_16;
			float f_21 = f_10 * (float) i_8;
			float f_22 = f_11 * (float) i_8;

			while (true) {
				if (i_3 > i_1) {
					if (f_19 > (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 > (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				} else {
					if (f_19 < (float) i_3 + 0.35F) {
						break;
					}

					if (f_19 + f_17 < (float) i_3) {
						f_17 = (float) i_3 - f_19;
					}
				}

				if (i_4 > i_2) {
					if (f_20 > (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 > (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				} else {
					if (f_20 < (float) i_4 + 0.35F) {
						break;
					}

					if (f_20 + f_18 < (float) i_4) {
						f_18 = (float) i_4 - f_20;
					}
				}

				OpenGL.glBegin(1);
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

	public boolean method8405() {
		return this.aBool8342 && (!this.method8471() || this.aBool8344);
	}

	void method13747() {
		if (this.aBool8440 && this.anInt8358 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}

	}

	final void method13748() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(this.aClass384_8348.buf, 0);
		if (this.aBool8449) {
			this.aClass146_8356.aClass141_Sub4_1715.method14427();
		}

		this.method13593();
		this.method13638();
	}

	public int method8546(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public boolean method8503() {
		return true;
	}

	public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return this.aBool8480 ? new Class152_Sub1_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6) : null;
	}

	public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return this.aBool8480 ? new Class152_Sub1_Sub1(this, i_1, i_2, i_3, i_4, i_5, i_6) : null;
	}

}
