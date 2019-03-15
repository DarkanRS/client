import java.awt.Canvas;

public class ja extends GraphicalRenderer implements Interface40 {

	static int[] ab = new int[Math.max(Math.max(104, 20), 24573)];
	static float[] ar = new float[20];
	static int[] ae = new int[6];
	static int[] aq;
	static float[] av;
	static int[] aa;
	static int[] bi;
	static int[] bw;
	static int[] bx;
	static short[] bz;
	static byte[] bj;
	ba z;
	a[] ai;
	Matrix44Arr af;
	boolean bm = false;
	boolean b = false;
	float az;
	float ap;
	float ax;
	float al;
	int at = 4096;
	int ac = 4096;
	int as;
	Matrix44Var ay;
	Matrix44Arr an;
	long nativeid = 0L;
	NodeCollection au = new NodeCollection();
	Matrix44Var ag;
	Matrix44Arr ao;
	Matrix44Arr aw;

	static {
		aq = ab;
		av = ar;
		aa = ab;
		bi = ab;
		bw = new int[8191];
		bx = new int[8191];
		bz = new short[8191];
		bj = new byte[8191];
	}

	native void op(za var1);

	native void q(Interface22 var1, int var2, int var3);

	public void method8618(Class282_Sub1 class282_sub1_1) {
		this.z = (ba) class282_sub1_1;
		this.n(class282_sub1_1);
	}

	native void R(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9);

	public boolean method8489() {
		return true;
	}

	native void Y(int var1);

	public boolean method8649() {
		return false;
	}

	native void Q(int var1, int[] var2, float[] var3);

	native void wa(float[] var1);

	public synchronized void finalize() {
		this.method8396(-710252687);
		if (this.nativeid != 0L) {
			Class156.method2642(this, (byte) 14);
		}

	}

	public native void ib(int var1, int var2, int var3);

	void h() {
		System.gc();
		System.runFinalization();
		Class156.method2652((byte) -83);
	}

	public boolean method8464() {
		return false;
	}

	native void ol(int var1, int var2, int var3, int var4);

	void method8485() {
		if (!this.b) {
			this.ai = null;
			this.z = null;
			this.af = null;

			for (ba ba_1 = (ba) this.au.head((byte) 89); ba_1 != null; ba_1 = (ba) this.au.next(-58113197)) {
				ba_1.ha();
			}

			this.au.method8118(-971959284);
			this.da();
			if (this.bm) {
				Class13.method508(false, true, -167551249);
				this.bm = false;
			}

			this.h();
			Class156.method2644(-1556051265);
			this.b = true;
		}

	}

	public Matrix44Var method8458() {
		return this.ay;
	}

	public native void RA(boolean var1);

	public void method8395() {
	}

	public void method8488(int i_1) {
		Class156.method2652((byte) 46);
		this.Y(i_1);

		for (ba ba_2 = (ba) this.au.head((byte) 32); ba_2 != null; ba_2 = (ba) this.au.next(-980125304)) {
			ba_2.u();
		}

	}

	public void method8398(int i_1) {
		Class156.method2652((byte) 42);
		this.Y(i_1);

		for (ba ba_2 = (ba) this.au.head((byte) 99); ba_2 != null; ba_2 = (ba) this.au.next(1815060892)) {
			ba_2.u();
		}

	}

	public native int za();

	public NativeSprite method8442(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new fa(this, ints_1, i_2, i_3, i_4, i_5);
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

	public void method8479(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aw.buf[15] + this.aw.buf[3] * f_1 + this.aw.buf[7] * f_2 + this.aw.buf[11] * f_3;
		float f_6 = this.aw.buf[12] + this.aw.buf[0] * f_1 + this.aw.buf[4] * f_2 + this.aw.buf[8] * f_3;
		float f_7 = this.aw.buf[13] + this.aw.buf[1] * f_1 + this.aw.buf[5] * f_2 + this.aw.buf[9] * f_3;
		float f_8 = this.ao.buf[14] + this.ao.buf[2] * f_1 + this.ao.buf[6] * f_2 + this.ao.buf[10] * f_3;
		floats_4[0] = this.ax + this.az * f_6 / f_5;
		floats_4[1] = this.al + this.ap * f_7 / f_5;
		floats_4[2] = f_8;
	}

	public native void fl(int var1, int var2, int var3, int var4, int var5);

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

	public void method8480(boolean bool_1) {
	}

	public native void hi(int var1, Class455 var2, int var3, int var4);

	public void method8420() {
	}

	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new za(this, canvas_1, i_2, i_3);
	}

	native void PA(za var1);

	native void d(long var1, long var3);

	public void method8421() {
		this.az = (float) this.method8523((byte) 109).method2714() / 2.0F;
		this.ap = (float) this.method8523((byte) 123).method2716() / 2.0F;
		this.ax = this.az;
		this.al = this.ap;
		this.k();
	}

	public native void iw(int var1, float var2, float var3, float var4, float var5, float var6);

	public void method8617(int i_1, int i_2, int i_3, int i_4) {
		this.az = (float) i_3 / 2.0F;
		this.ap = (float) i_4 / 2.0F;
		this.ax = (float) i_1 + this.az;
		this.al = (float) i_2 + this.ap;
		this.A(i_1, i_2, i_3, i_4);
	}

	native void A(int var1, int var2, int var3, int var4);

	public Matrix44Arr method8587() {
		return this.an;
	}

	public native void L();

	public native void r(int var1, int var2, int var3, int var4);

	public void method8542(Class282_Sub1 class282_sub1_1) {
		this.z = (ba) class282_sub1_1;
		this.n(class282_sub1_1);
	}

	public native void qa(int[] var1);

	public native void ba(int var1, int var2);

	public void method8430(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
		this.G(i_3 + i_1 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
	}

	public native void B(int var1, int var2, int var3, int var4, int var5, int var6);

	public native void N(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

	public void method8658() {
		throw new IllegalStateException();
	}

	public native void XA(int var1, int var2, int var3, int var4, int var5);

	public native void G(int var1, int var2, int var3, int var4, int var5);

	public void method8433(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.YA(i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public boolean method8402() {
		return true;
	}

	native void CA(int var1, int var2, int var3, int var4);

	public void method8496(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.nx().method311(this, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	public void method8669(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9) {
		this.R(i_1, i_2, i_3, i_4, i_5, 1, class455_7, i_8, i_9);
	}

	public void method8435(int i_1, int i_2, int i_3, int i_4, int i_5, int i_7, int i_8, int i_9) {
	}

	public int method8437(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aw.buf[14] + this.aw.buf[2] * (float) i_1 + this.aw.buf[6] * (float) i_2 + this.aw.buf[10] * (float) i_3;
		float f_9 = this.aw.buf[14] + this.aw.buf[2] * (float) i_4 + this.aw.buf[6] * (float) i_5 + this.aw.buf[10] * (float) i_6;
		float f_10 = this.aw.buf[15] + this.aw.buf[3] * (float) i_1 + this.aw.buf[7] * (float) i_2 + this.aw.buf[11] * (float) i_3;
		float f_11 = this.aw.buf[15] + this.aw.buf[3] * (float) i_4 + this.aw.buf[7] * (float) i_5 + this.aw.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aw.buf[12] + this.aw.buf[0] * (float) i_1 + this.aw.buf[4] * (float) i_2 + this.aw.buf[8] * (float) i_3;
		float f_13 = this.aw.buf[12] + this.aw.buf[0] * (float) i_4 + this.aw.buf[4] * (float) i_5 + this.aw.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aw.buf[13] + this.aw.buf[1] * (float) i_1 + this.aw.buf[5] * (float) i_2 + this.aw.buf[9] * (float) i_3;
		float f_15 = this.aw.buf[13] + this.aw.buf[1] * (float) i_4 + this.aw.buf[5] * (float) i_5 + this.aw.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public boolean method8406() {
		return true;
	}

	public void method8515(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aw.buf[14] + this.aw.buf[2] * f_1 + this.aw.buf[6] * f_2 + this.aw.buf[10] * f_3;
		float f_6 = this.aw.buf[15] + this.aw.buf[3] * f_1 + this.aw.buf[7] * f_2 + this.aw.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = this.aw.buf[12] + this.aw.buf[0] * f_1 + this.aw.buf[4] * f_2 + this.aw.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = this.aw.buf[13] + this.aw.buf[1] * f_1 + this.aw.buf[5] * f_2 + this.aw.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.ao.buf[14] + this.ao.buf[2] * f_1 + this.ao.buf[6] * f_2 + this.ao.buf[10] * f_3;
					floats_4[0] = this.ax + this.az * f_7 / f_6;
					floats_4[1] = this.al + this.ap * f_8 / f_6;
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

	public Class282_Sub1 method8438(int i_1) {
		ba ba_2 = new ba(this, i_1);
		this.au.append(ba_2, 753628503);
		return ba_2;
	}

	public void method8439(Class282_Sub1 class282_sub1_1) {
		this.z = (ba) class282_sub1_1;
		this.n(class282_sub1_1);
	}

	public NativeSprite method8654(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new fa(this, i_1, i_2, bool_4);
	}

	public native void x(boolean var1);

	public boolean method8431() {
		return false;
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub1(this);
	}

	public boolean method8462() {
		return false;
	}

	public native void DA(Class455 var2, int var3, int var4);

	public FontRenderer createFont(FontMetrics fontmetrics_1, Class91[] arr_2, boolean bool_3) {
		int[] ints_4 = new int[arr_2.length];
		int[] ints_5 = new int[arr_2.length];
		boolean bool_6 = false;

		for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
			ints_4[i_7] = arr_2[i_7].anInt957;
			ints_5[i_7] = arr_2[i_7].anInt954;
			if (arr_2[i_7].aByteArray961 != null) {
				bool_6 = true;
			}
		}

		if (bool_3) {
			if (bool_6) {
				return new ea(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
			} else {
				return new m(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
			}
		} else if (bool_6) {
			throw new IllegalArgumentException("");
		} else {
			return new ia(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
		}
	}

	public void method8459() {
		this.ac = this.at = 10000;
		if (this.as > 1) {
			throw new IllegalStateException();
		} else {
			this.nu(this.as);
			this.ni();
		}
	}

	public MeshRasterizer createMeshRasterizer(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new h(this, this.z, rsmesh_1, i_2, i_3, i_4, i_5);
	}

	public int method8452(int i_1, int i_2) {
		int i_3 = i_1 & 0xfffff;
		int i_4 = i_2 & 0xfffff;
		return i_3 & i_4 ^ i_4;
	}

	public Class152 method8636(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return null;
	}

	public native void ej(float var1, float var2);

	public boolean method8405() {
		return false;
	}

	public boolean method8399() {
		return true;
	}

	void nu(int i_1) {
		this.as = i_1;
		this.ai = new a[this.as];

		for (int i_2 = 0; i_2 < this.as; i_2++) {
			this.ai[i_2] = new a(this, this.ac, this.at);
		}

	}

	void ni() {
		this.ai[0].method307();
	}

	a nx() {
		for (int i_1 = 0; i_1 < this.as; i_1++) {
			if (this.ai[i_1].aRunnable48 == Thread.currentThread()) {
				return this.ai[i_1];
			}
		}

		return null;
	}

	public void method8456(Class151 class151_1) {
		if (class151_1.aClass464_1961.method7736(-1292124716) != 0) {
			this.ny(class151_1);
			this.nx().method309(this, bi, bw, bx, bz, class151_1.aClass464_1961.method7736(-1336234189));
		}

	}

	public void method8457(Matrix44Var matrix44var_1) {
		this.ay = matrix44var_1;
		this.ao.fromVarMatrix44(matrix44var_1);
		this.AA(this.ao.buf);
		this.aw.method6568(this.ao, this.an);
	}

	native void oo();

	native void AA(float[] var1);

	public void method8424(Matrix44Arr matrix44arr_1) {
		this.an = matrix44arr_1;
		this.wa(this.an.buf);
		this.aw.method6568(this.ao, this.an);
	}

	public boolean method8503() {
		return true;
	}

	public Matrix44Arr method8453() {
		return this.an;
	}

	public native void IA(float var1);

	public native void m(int var1, float var2, float var3, float var4, float var5, float var6);

	public native void J();

	native void YA(int var1, int var2, int var3, int var4, int var5, int var6);

	public void method8547(int i_1, Class282_Sub24[] arr_2) {
		int i_3 = 0;

		for (int i_4 = 0; i_4 < i_1; i_4++) {
			aq[i_3++] = arr_2[i_4].method12368((byte) -85);
			aq[i_3++] = arr_2[i_4].method12369();
			aq[i_3++] = arr_2[i_4].method12394(1398342512);
			aq[i_3++] = arr_2[i_4].method12370();
			av[i_4] = arr_2[i_4].method12395(314107586);
			aq[i_3++] = arr_2[i_4].method12371(-2144091834);
		}

		this.Q(i_1, aq, av);
	}

	public void method8568() {
	}

	public Class152 method8466(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return null;
	}

	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		za za_3 = (za) this.method8460(-1390159861);
		if (za_3 == null) {
			throw new IllegalStateException();
		} else {
			za_3.method14353(i_1, i_2);
			if (this.anInterface22_5834 != null) {
				this.anInterface22_5834.method161(-1828555261);
			}

		}
	}

	public void method8477(Class152 class152_1) {
	}

	public void method8525(int i_3, int i_4) {
	}

	public boolean method8469() {
		return false;
	}

	public void method8490() {
	}

	public boolean method8471() {
		return false;
	}

	void method8592(float f_1, float f_2, float f_3) {
	}

	public native int di();

	native void JA(int var1, int var2, int var3, int var4);

	native void M(int var1, int var2, int var3, int var4);

	public final void method8475(Class90 class90_2) {
		this.M(-1, class90_2.color, class90_2.scale, class90_2.intensity);
	}

	public Class455 method8553(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new wa(this, this.z, i_1, i_2, ints_3, ints_4);
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub1(this);
	}

	public Interface8 method8419(int i_1, int i_2) {
		return new oa(i_1, i_2);
	}

	public Class168 method8481() {
		return new Class168(0, "SSE", 1, "CPU", 0L);
	}

	public void method8634() {
		this.az = (float) this.method8523((byte) 126).method2714() / 2.0F;
		this.ap = (float) this.method8523((byte) 117).method2716() / 2.0F;
		this.ax = this.az;
		this.al = this.ap;
		this.k();
	}

	public void method8483() {
	}

	public void method8484() {
	}

	void method8531() {
		if (!this.b) {
			this.ai = null;
			this.z = null;
			this.af = null;

			for (ba ba_1 = (ba) this.au.head((byte) 79); ba_1 != null; ba_1 = (ba) this.au.next(1077527555)) {
				ba_1.ha();
			}

			this.au.method8118(-239422644);
			this.da();
			if (this.bm) {
				Class13.method508(false, true, -803268356);
				this.bm = false;
			}

			this.h();
			Class156.method2644(-1800082140);
			this.b = true;
		}

	}

	public void method8445() {
	}

	public final void method8476(int i_1, Class90 class90_2) {
		this.JA(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
	}

	void method8555() throws Exception_Sub3 {
		za za_3 = (za) this.method8460(-323567179);
		if (za_3 == null) {
			throw new IllegalStateException();
		} else {
			za_3.method14353(0, 0);
			if (this.anInterface22_5834 != null) {
				this.anInterface22_5834.method161(-2129499905);
			}

		}
	}

	native void F(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

	public native void fi(int var1, int var2);

	public NativeSprite method8668(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new fa(this, i_1, i_2, i_3, i_4, !bool_5);
	}

	public native int df();

	public ja(Canvas canvas_1, Interface22 interface22_2, int i_3, int i_4) {
		super(interface22_2);

		try {
			if (!Class362.getNativeLibraryLoader().loadLibrary("sw3d", -1251324674)) {
				throw new RuntimeException("");
			} else {
				Class156.method2643();
				this.q(this.anInterface22_5834, this.anInterface22_5834.method84(), 0);
				Class38.method854(false, true, -1602514184);
				this.bm = true;
				this.af = new Matrix44Arr();
				new Vector3();
				this.ag = new Matrix44Var();
				new Quaternion();
				this.ao = new Matrix44Arr();
				this.an = new Matrix44Arr();
				this.aw = new Matrix44Arr();
				this.method8457(new Matrix44Var());
				this.method8424(new Matrix44Arr());
				this.nu(1);
				this.ni();
				if (canvas_1 != null) {
					this.method8524(canvas_1, i_3, i_4, (byte) -69);
					this.method8412(canvas_1);
				}

				int i_5 = this.anInterface22_5834.method84();

				for (short s_6 = 0; s_6 < i_5; s_6++) {
					TextureDetails class169_7 = this.anInterface22_5834.method144(s_6, -2075826193);
					if (class169_7 != null) {
						this.V(s_6, class169_7.color, class169_7.blendType, class169_7.effectId, class169_7.effectParam1, class169_7.effectParam2, class169_7.isHalfSize, class169_7.shadowFactor, class169_7.brightness, class169_7.textureSpeedU, class169_7.textureSpeedV, class169_7.isGroundMesh, class169_7.skipTriangles, class169_7.aBool2087, class169_7.repeatS, class169_7.repeatT, class169_7.useMipmaps, class169_7.hdr, class169_7.isBrickTile, class169_7.combineMode);
					}
				}

			}
		} catch (Throwable throwable_9) {
			this.method8396(1670288083);
			throw new RuntimeException();
		}
	}

	public Matrix44Arr method8449() {
		return this.af;
	}

	native void n(Class282_Sub1 var1);

	public boolean method8528() {
		return true;
	}

	public boolean method8492() {
		return true;
	}

	public void method8415(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.YA(i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public native int dv();

	public final void method8616(int i_1, Class90 class90_2) {
		this.JA(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
	}

	public void method8613() {
	}

	public void method8487(int i_1) {
		Class156.method2652((byte) 4);
		this.Y(i_1);

		for (ba ba_2 = (ba) this.au.head((byte) 58); ba_2 != null; ba_2 = (ba) this.au.next(951552583)) {
			ba_2.u();
		}

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
	}

	public boolean method8501() {
		return false;
	}

	public boolean method8502() {
		return true;
	}

	public Matrix44Arr method8517() {
		return this.af;
	}

	public native void hz(int var1, Class455 var2, int var3, int var4);

	public boolean method8504() {
		return true;
	}

	public native void iz(float var1);

	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new za(this, canvas_1, i_2, i_3);
	}

	public Class282_Sub1 method8570(int i_1) {
		ba ba_2 = new ba(this, i_1);
		this.au.append(ba_2, 486534140);
		return ba_2;
	}

	public native void ff(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

	public void method8497() {
	}

	public native void eq(boolean var1);

	native void og(float[] var1);

	void method8397() {
		if (!this.b) {
			this.ai = null;
			this.z = null;
			this.af = null;

			for (ba ba_1 = (ba) this.au.head((byte) 16); ba_1 != null; ba_1 = (ba) this.au.next(1772121447)) {
				ba_1.ha();
			}

			this.au.method8118(183026123);
			this.da();
			if (this.bm) {
				Class13.method508(false, true, -819132543);
				this.bm = false;
			}

			this.h();
			Class156.method2644(-1363354475);
			this.b = true;
		}

	}

	public native void en(float var1, float var2);

	public final void method8585(int i_1, Class90 class90_2) {
		this.M(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
	}

	public native void ez();

	public native void eh();

	public native void fk(int var1, int var2, int var3, int var4);

	public void method8514(int i_1, int i_2, int i_3, int i_4) {
		this.az = (float) i_3 / 2.0F;
		this.ap = (float) i_4 / 2.0F;
		this.ax = (float) i_1 + this.az;
		this.al = (float) i_2 + this.ap;
		this.A(i_1, i_2, i_3, i_4);
	}

	public native void fe(int var1, int var2, int var3, int var4);

	public native int[] ab(int var1, int var2, int var3, int var4);

	public native void fh(int[] var1);

	public native void ft(int[] var1);

	public native void fd(int var1, int var2);

	public native void fu(int var1, int var2);

	public void method8563(int i_1, int i_2, int i_3, int i_4, int i_5, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
	}

	public native void ma(boolean var1);

	void ny(Class151 class151_1) {
		int i_3 = 0;
		int i_4 = 0;
		int i_5 = 0;
		int i_6 = 0;
		boolean bool_7 = false;

		for (PointEntity class275_sub1_sub1_8 = (PointEntity) class151_1.aClass464_1961.method7731(); class275_sub1_sub1_8 != null; class275_sub1_sub1_8 = (PointEntity) class151_1.aClass464_1961.method7734()) {
			bi[i_3++] = class275_sub1_sub1_8.x;
			bi[i_3++] = class275_sub1_sub1_8.z;
			bi[i_3++] = class275_sub1_sub1_8.y;
			bw[i_4++] = class275_sub1_sub1_8.color;
			bz[i_6++] = (short) class275_sub1_sub1_8.rotation;
			bx[i_5++] = class275_sub1_sub1_8.size;
		}

	}

	native void oq(float[] var1);

	public native void fp(int var1, int var2, int var3, int var4, int var5, int var6);

	public native void fb(int var1, int var2, int var3, int var4, int var5, int var6);

	public void method8627(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		throw new IllegalStateException();
	}

	native void da();

	native void fr(int var1, int var2, int var3, int var4, int var5);

	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return null;
	}

	public native void fs(int var1, int var2, int var3, int var4, int var5);

	public native void fq(int var1, int var2, int var3, int var4, int var5);

	public native void fo(int var1, int var2, int var3, int var4, int var5);

	public native void fv(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

	public FontRenderer method8660(FontMetrics fontmetrics_1, Class91[] arr_2, boolean bool_3) {
		int[] ints_4 = new int[arr_2.length];
		int[] ints_5 = new int[arr_2.length];
		boolean bool_6 = false;

		for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
			ints_4[i_7] = arr_2[i_7].anInt957;
			ints_5[i_7] = arr_2[i_7].anInt954;
			if (arr_2[i_7].aByteArray961 != null) {
				bool_6 = true;
			}
		}

		if (bool_3) {
			if (bool_6) {
				return new ea(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
			} else {
				return new m(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
			}
		} else if (bool_6) {
			throw new IllegalArgumentException("");
		} else {
			return new ia(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
		}
	}

	public void method8526(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.YA(i_1, i_2, i_3, i_4, i_5, i_6);
	}

	public void method8527(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
	}

	public void method8494(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
	}

	native void oj(int var1, int var2, int var3, int var4);

	public void method8573(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aw.buf[15] + this.aw.buf[3] * f_1 + this.aw.buf[7] * f_2 + this.aw.buf[11] * f_3;
		float f_6 = this.aw.buf[12] + this.aw.buf[0] * f_1 + this.aw.buf[4] * f_2 + this.aw.buf[8] * f_3;
		float f_7 = this.aw.buf[13] + this.aw.buf[1] * f_1 + this.aw.buf[5] * f_2 + this.aw.buf[9] * f_3;
		float f_8 = this.ao.buf[14] + this.ao.buf[2] * f_1 + this.ao.buf[6] * f_2 + this.ao.buf[10] * f_3;
		floats_4[0] = this.ax + this.az * f_6 / f_5;
		floats_4[1] = this.al + this.ap * f_7 / f_5;
		floats_4[2] = f_8;
	}

	public void method8520(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
		this.G(i_1 + i_3 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
	}

	public void method8532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		this.R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
	}

	public void method8533(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		this.R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
	}

	public void method8575(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		this.R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
	}

	public void method8535(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9, int i_10, int i_11, int i_12) {
	}

	public native void c(int var1, int var2, int var3);

	public int method8537(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aw.buf[14] + this.aw.buf[2] * (float) i_1 + this.aw.buf[6] * (float) i_2 + this.aw.buf[10] * (float) i_3;
		float f_9 = this.aw.buf[14] + this.aw.buf[2] * (float) i_4 + this.aw.buf[6] * (float) i_5 + this.aw.buf[10] * (float) i_6;
		float f_10 = this.aw.buf[15] + this.aw.buf[3] * (float) i_1 + this.aw.buf[7] * (float) i_2 + this.aw.buf[11] * (float) i_3;
		float f_11 = this.aw.buf[15] + this.aw.buf[3] * (float) i_4 + this.aw.buf[7] * (float) i_5 + this.aw.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aw.buf[12] + this.aw.buf[0] * (float) i_1 + this.aw.buf[4] * (float) i_2 + this.aw.buf[8] * (float) i_3;
		float f_13 = this.aw.buf[12] + this.aw.buf[0] * (float) i_4 + this.aw.buf[4] * (float) i_5 + this.aw.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aw.buf[13] + this.aw.buf[1] * (float) i_1 + this.aw.buf[5] * (float) i_2 + this.aw.buf[9] * (float) i_3;
		float f_15 = this.aw.buf[13] + this.aw.buf[1] * (float) i_4 + this.aw.buf[5] * (float) i_5 + this.aw.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public int method8538(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aw.buf[14] + this.aw.buf[2] * (float) i_1 + this.aw.buf[6] * (float) i_2 + this.aw.buf[10] * (float) i_3;
		float f_9 = this.aw.buf[14] + this.aw.buf[2] * (float) i_4 + this.aw.buf[6] * (float) i_5 + this.aw.buf[10] * (float) i_6;
		float f_10 = this.aw.buf[15] + this.aw.buf[3] * (float) i_1 + this.aw.buf[7] * (float) i_2 + this.aw.buf[11] * (float) i_3;
		float f_11 = this.aw.buf[15] + this.aw.buf[3] * (float) i_4 + this.aw.buf[7] * (float) i_5 + this.aw.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aw.buf[12] + this.aw.buf[0] * (float) i_1 + this.aw.buf[4] * (float) i_2 + this.aw.buf[8] * (float) i_3;
		float f_13 = this.aw.buf[12] + this.aw.buf[0] * (float) i_4 + this.aw.buf[4] * (float) i_5 + this.aw.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aw.buf[13] + this.aw.buf[1] * (float) i_1 + this.aw.buf[5] * (float) i_2 + this.aw.buf[9] * (float) i_3;
		float f_15 = this.aw.buf[13] + this.aw.buf[1] * (float) i_4 + this.aw.buf[5] * (float) i_5 + this.aw.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public int method8539(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		float f_8 = this.aw.buf[14] + this.aw.buf[2] * (float) i_1 + this.aw.buf[6] * (float) i_2 + this.aw.buf[10] * (float) i_3;
		float f_9 = this.aw.buf[14] + this.aw.buf[2] * (float) i_4 + this.aw.buf[6] * (float) i_5 + this.aw.buf[10] * (float) i_6;
		float f_10 = this.aw.buf[15] + this.aw.buf[3] * (float) i_1 + this.aw.buf[7] * (float) i_2 + this.aw.buf[11] * (float) i_3;
		float f_11 = this.aw.buf[15] + this.aw.buf[3] * (float) i_4 + this.aw.buf[7] * (float) i_5 + this.aw.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aw.buf[12] + this.aw.buf[0] * (float) i_1 + this.aw.buf[4] * (float) i_2 + this.aw.buf[8] * (float) i_3;
		float f_13 = this.aw.buf[12] + this.aw.buf[0] * (float) i_4 + this.aw.buf[4] * (float) i_5 + this.aw.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aw.buf[13] + this.aw.buf[1] * (float) i_1 + this.aw.buf[5] * (float) i_2 + this.aw.buf[9] * (float) i_3;
		float f_15 = this.aw.buf[13] + this.aw.buf[1] * (float) i_4 + this.aw.buf[5] * (float) i_5 + this.aw.buf[9] * (float) i_6;
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
		float f_8 = this.aw.buf[14] + this.aw.buf[2] * (float) i_1 + this.aw.buf[6] * (float) i_2 + this.aw.buf[10] * (float) i_3;
		float f_9 = this.aw.buf[14] + this.aw.buf[2] * (float) i_4 + this.aw.buf[6] * (float) i_5 + this.aw.buf[10] * (float) i_6;
		float f_10 = this.aw.buf[15] + this.aw.buf[3] * (float) i_1 + this.aw.buf[7] * (float) i_2 + this.aw.buf[11] * (float) i_3;
		float f_11 = this.aw.buf[15] + this.aw.buf[3] * (float) i_4 + this.aw.buf[7] * (float) i_5 + this.aw.buf[11] * (float) i_6;
		if (f_8 < -f_10 && f_9 < -f_11) {
			i_7 |= 0x10;
		} else if (f_8 > f_10 && f_9 > f_11) {
			i_7 |= 0x20;
		}

		float f_12 = this.aw.buf[12] + this.aw.buf[0] * (float) i_1 + this.aw.buf[4] * (float) i_2 + this.aw.buf[8] * (float) i_3;
		float f_13 = this.aw.buf[12] + this.aw.buf[0] * (float) i_4 + this.aw.buf[4] * (float) i_5 + this.aw.buf[8] * (float) i_6;
		if (f_12 < -f_10 && f_13 < -f_11) {
			i_7 |= 0x1;
		}

		if (f_12 > f_10 && f_13 > f_11) {
			i_7 |= 0x2;
		}

		float f_14 = this.aw.buf[13] + this.aw.buf[1] * (float) i_1 + this.aw.buf[5] * (float) i_2 + this.aw.buf[9] * (float) i_3;
		float f_15 = this.aw.buf[13] + this.aw.buf[1] * (float) i_4 + this.aw.buf[5] * (float) i_5 + this.aw.buf[9] * (float) i_6;
		if (f_14 < -f_10 && f_15 < -f_11) {
			i_7 |= 0x4;
		}

		if (f_14 > f_10 && f_15 > f_11) {
			i_7 |= 0x8;
		}

		return i_7;
	}

	public void method8598(Class152 class152_1) {
	}

	public native void o(int var1, int var2, int var3, int var4);

	public int method8565(int i_1, int i_2) {
		int i_3 = i_1 & 0xfffff;
		int i_4 = i_2 & 0xfffff;
		return i_3 & i_4 ^ i_4;
	}

	native void on(int var1, int var2, int var3, int var4);

	public void method8544(Class282_Sub1 class282_sub1_1) {
		this.z = (ba) class282_sub1_1;
		this.n(class282_sub1_1);
	}

	public native void GA();

	public NativeSprite method8577(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new fa(this, i_1, i_2, bool_4);
	}

	public NativeSprite method8543(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new fa(this, ints_1, i_2, i_3, i_4, i_5);
	}

	public NativeSprite method8548(int[] ints_1, int i_2, int i_3, int i_4, int i_5, boolean bool_6) {
		return new fa(this, ints_1, i_2, i_3, i_4, i_5);
	}

	public NativeSprite method8612(Class91 class91_1, boolean bool_2) {
		fa fa_3 = new fa(this, class91_1.anIntArray955, class91_1.aByteArray960, class91_1.aByteArray961, class91_1.anInt957, class91_1.anInt957, class91_1.anInt954);
		fa_3.method2743(class91_1.anInt956, class91_1.anInt959, class91_1.anInt958, class91_1.anInt953);
		return fa_3;
	}

	public NativeSprite method8518(Class91 class91_1, boolean bool_2) {
		fa fa_3 = new fa(this, class91_1.anIntArray955, class91_1.aByteArray960, class91_1.aByteArray961, class91_1.anInt957, class91_1.anInt957, class91_1.anInt954);
		fa_3.method2743(class91_1.anInt956, class91_1.anInt959, class91_1.anInt958, class91_1.anInt953);
		return fa_3;
	}

	public NativeSprite method8604(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new fa(this, i_1, i_2, i_3, i_4, !bool_5);
	}

	public NativeSprite method8552(int i_1, int i_2, int i_3, int i_4, boolean bool_5) {
		return new fa(this, i_1, i_2, i_3, i_4, !bool_5);
	}

	public void method8513(int i_1, int i_2, int i_3, int i_4) {
		this.az = (float) i_3 / 2.0F;
		this.ap = (float) i_4 / 2.0F;
		this.ax = (float) i_1 + this.az;
		this.al = (float) i_2 + this.ap;
		this.A(i_1, i_2, i_3, i_4);
	}

	public void method8584(Class152 class152_1) {
	}

	public Class455 method8427(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new wa(this, this.z, i_1, i_2, ints_3, ints_4);
	}

	public Class455 method8556(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new wa(this, this.z, i_1, i_2, ints_3, ints_4);
	}

	public void method8511(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
		this.G(i_1 + i_3 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
	}

	public void method8601() {
	}

	native void nn(int var1, int var2, int var3, int var4, int var5, int var6);

	public boolean method8679() {
		return false;
	}

	public FontRenderer method8625(FontMetrics fontmetrics_1, Class91[] arr_2, boolean bool_3) {
		int[] ints_4 = new int[arr_2.length];
		int[] ints_5 = new int[arr_2.length];
		boolean bool_6 = false;

		for (int i_7 = 0; i_7 < arr_2.length; i_7++) {
			ints_4[i_7] = arr_2[i_7].anInt957;
			ints_5[i_7] = arr_2[i_7].anInt954;
			if (arr_2[i_7].aByteArray961 != null) {
				bool_6 = true;
			}
		}

		if (bool_3) {
			if (bool_6) {
				return new ea(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
			} else {
				return new m(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
			}
		} else if (bool_6) {
			throw new IllegalArgumentException("");
		} else {
			return new ia(this, this.z, fontmetrics_1, arr_2, (NativeSprite[]) null);
		}
	}

	public void method8559(int i_1) {
		this.ac = this.at = i_1;
		if (this.as > 1) {
			throw new IllegalStateException();
		} else {
			this.nu(this.as);
			this.ni();
		}
	}

	public void method8560(int i_1) {
		this.ac = this.at = i_1;
		if (this.as > 1) {
			throw new IllegalStateException();
		} else {
			this.nu(this.as);
			this.ni();
		}
	}

	public MeshRasterizer method8561(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new h(this, this.z, rsmesh_1, i_2, i_3, i_4, i_5);
	}

	public MeshRasterizer method8623(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new h(this, this.z, rsmesh_1, i_2, i_3, i_4, i_5);
	}

	public MeshRasterizer method8505(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new h(this, this.z, rsmesh_1, i_2, i_3, i_4, i_5);
	}

	public MeshRasterizer method8564(RSMesh rsmesh_1, int i_2, int i_3, int i_4, int i_5) {
		return new h(this, this.z, rsmesh_1, i_2, i_3, i_4, i_5);
	}

	public void method8635() {
		this.az = (float) this.method8523((byte) 126).method2714() / 2.0F;
		this.ap = (float) this.method8523((byte) 107).method2716() / 2.0F;
		this.ax = this.az;
		this.al = this.ap;
		this.k();
	}

	public int method8566(int i_1, int i_2) {
		int i_3 = i_1 & 0xfffff;
		int i_4 = i_2 & 0xfffff;
		return i_3 & i_4 ^ i_4;
	}

	public int method8567(int i_1, int i_2) {
		int i_3 = i_1 & 0xfffff;
		int i_4 = i_2 & 0xfffff;
		return i_3 & i_4 ^ i_4;
	}

	public int method8443(int i_1, int i_2) {
		int i_3 = i_1 & 0xfffff;
		int i_4 = i_2 & 0xfffff;
		return i_3 & i_4 ^ i_4;
	}

	public Ground method8569(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_5, int i_6, int i_7) {
		return new i(this, this.z, i_1, i_2, ints_3, ints_4, i_5, i_6, i_7);
	}

	public Class282_Sub1 method8541(int i_1) {
		ba ba_2 = new ba(this, i_1);
		this.au.append(ba_2, -818600578);
		return ba_2;
	}

	public Matrix44Arr method8571() {
		return this.af;
	}

	public Matrix44Var method8572() {
		return this.ag;
	}

	public Matrix44Var method8626() {
		return this.ag;
	}

	public int method8574() {
		return 4;
	}

	public void method8394(int i_1, Class282_Sub24[] arr_2) {
		int i_3 = 0;

		for (int i_4 = 0; i_4 < i_1; i_4++) {
			aq[i_3++] = arr_2[i_4].method12368((byte) -43);
			aq[i_3++] = arr_2[i_4].method12369();
			aq[i_3++] = arr_2[i_4].method12394(1467681691);
			aq[i_3++] = arr_2[i_4].method12370();
			av[i_4] = arr_2[i_4].method12395(-608600459);
			aq[i_3++] = arr_2[i_4].method12371(-2146406856);
		}

		this.Q(i_1, aq, av);
	}

	public void method8426(int i_1, Class282_Sub24[] arr_2) {
		int i_3 = 0;

		for (int i_4 = 0; i_4 < i_1; i_4++) {
			aq[i_3++] = arr_2[i_4].method12368((byte) -50);
			aq[i_3++] = arr_2[i_4].method12369();
			aq[i_3++] = arr_2[i_4].method12394(1428101811);
			aq[i_3++] = arr_2[i_4].method12370();
			av[i_4] = arr_2[i_4].method12395(434198990);
			aq[i_3++] = arr_2[i_4].method12371(-2135372215);
		}

		this.Q(i_1, aq, av);
	}

	public void method8629(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		throw new IllegalStateException();
	}

	public void method8580(Class151 class151_1) {
		if (class151_1.aClass464_1961.method7736(-756134032) != 0) {
			this.ny(class151_1);
			this.nx().method309(this, bi, bw, bx, bz, class151_1.aClass464_1961.method7736(-1766385205));
		}

	}

	public void method8581(Class151 class151_1) {
		if (class151_1.aClass464_1961.method7736(-419803619) != 0) {
			this.ny(class151_1);
			this.nx().method309(this, bi, bw, bx, bz, class151_1.aClass464_1961.method7736(-1679034596));
		}

	}

	public void method8423(Matrix44Var matrix44var_1) {
		this.ay = matrix44var_1;
		this.ao.fromVarMatrix44(matrix44var_1);
		this.AA(this.ao.buf);
		this.aw.method6568(this.ao, this.an);
	}

	public Matrix44Var method8583() {
		return this.ay;
	}

	public Matrix44Var method8685() {
		return this.ay;
	}

	public void method8446(Matrix44Arr matrix44arr_1) {
		this.an = matrix44arr_1;
		this.wa(this.an.buf);
		this.aw.method6568(this.ao, this.an);
	}

	public void method8586(Matrix44Arr matrix44arr_1) {
		this.an = matrix44arr_1;
		this.wa(this.an.buf);
		this.aw.method6568(this.ao, this.an);
	}

	public native void is(int var1, int var2, int var3);

	public Matrix44Arr method8588() {
		return this.an;
	}

	public Matrix44Arr method8589() {
		return this.an;
	}

	public Matrix44Arr method8590() {
		return this.an;
	}

	native void k();

	public boolean method8674() {
		return true;
	}

	public void method8519(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.XA(i_1, i_2, i_3, i_5, i_6);
		this.XA(i_1, i_2 + i_4 - 1, i_3, i_5, i_6);
		this.G(i_1, i_2 + 1, i_4 - 1, i_5, i_6);
		this.G(i_1 + i_3 - 1, i_2 + 1, i_4 - 1, i_5, i_6);
	}

	public native void im(int var1, float var2, float var3, float var4, float var5, float var6);

	public native void iq(int var1);

	public native void il(int var1);

	public native void ii(int var1);

	public void method8507() {
	}

	public native void ik(int var1, int var2, int var3);

	public NativeSprite method8461(int i_1, int i_2, boolean bool_3, boolean bool_4) {
		return new fa(this, i_1, i_2, bool_4);
	}

	public void method8594(boolean bool_1) {
	}

	public void method8595(boolean bool_1) {
	}

	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return null;
	}

	native void fw(int var1, int var2, int var3, int var4, int var5);

	public Ground createGround(int i_1, int i_2, int[][] ints_3, int[][] ints_4, int i_6, int i_7) {
		return new i(this, this.z, i_1, i_2, ints_3, ints_4, 512, i_6, i_7);
	}

	public boolean method8628() {
		return false;
	}

	public boolean method8600() {
		return false;
	}

	public NativeSprite method8444(Class91 class91_1, boolean bool_2) {
		fa fa_3 = new fa(this, class91_1.anIntArray955, class91_1.aByteArray960, class91_1.aByteArray961, class91_1.anInt957, class91_1.anInt957, class91_1.anInt954);
		fa_3.method2743(class91_1.anInt956, class91_1.anInt959, class91_1.anInt958, class91_1.anInt953);
		return fa_3;
	}

	public void method8491(boolean bool_1) {
	}

	public void method8521() {
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

	native void ou(long var1, long var3);

	public void method8603(int i_1, int i_2, int i_3, int i_4) {
	}

	public void method8611() {
	}

	public void method8691() {
	}

	public native int dd();

	native void oi(int var1, int var2, int var3, int var4);

	public final void method8615(int i_1, Class90 class90_2) {
		this.JA(i_1, class90_2.color, class90_2.scale, class90_2.intensity);
	}

	native void V(short var1, short var2, int var3, byte var4, byte var5, int var6, boolean var7, byte var8, byte var9, byte var10, byte var11, boolean var12, boolean var13, boolean var14, boolean var15, boolean var16, byte var17, boolean var18, boolean var19, int var20);

	public void method8474() {
	}

	public void method8536(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.nx().method311(this, i_1, i_2, i_3, i_4, i_5, i_6, i_7);
	}

	public void method8650(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aw.buf[15] + this.aw.buf[3] * f_1 + this.aw.buf[7] * f_2 + this.aw.buf[11] * f_3;
		float f_6 = this.aw.buf[12] + this.aw.buf[0] * f_1 + this.aw.buf[4] * f_2 + this.aw.buf[8] * f_3;
		float f_7 = this.aw.buf[13] + this.aw.buf[1] * f_1 + this.aw.buf[5] * f_2 + this.aw.buf[9] * f_3;
		float f_8 = this.ao.buf[14] + this.ao.buf[2] * f_1 + this.ao.buf[6] * f_2 + this.ao.buf[10] * f_3;
		floats_4[0] = this.ax + this.az * f_6 / f_5;
		floats_4[1] = this.al + this.ap * f_7 / f_5;
		floats_4[2] = f_8;
	}

	public void method8619(float f_1, float f_2, float f_3, float[] floats_4) {
		float f_5 = this.aw.buf[14] + this.aw.buf[2] * f_1 + this.aw.buf[6] * f_2 + this.aw.buf[10] * f_3;
		float f_6 = this.aw.buf[15] + this.aw.buf[3] * f_1 + this.aw.buf[7] * f_2 + this.aw.buf[11] * f_3;
		if (f_5 >= -f_6 && f_5 <= f_6) {
			float f_7 = this.aw.buf[12] + this.aw.buf[0] * f_1 + this.aw.buf[4] * f_2 + this.aw.buf[8] * f_3;
			if (f_7 >= -f_6 && f_7 <= f_6) {
				float f_8 = this.aw.buf[13] + this.aw.buf[1] * f_1 + this.aw.buf[5] * f_2 + this.aw.buf[9] * f_3;
				if (f_8 >= -f_6 && f_8 <= f_6) {
					float f_9 = this.ao.buf[14] + this.ao.buf[2] * f_1 + this.ao.buf[6] * f_2 + this.ao.buf[10] * f_3;
					floats_4[0] = this.ax + this.az * f_7 / f_6;
					floats_4[1] = this.al + this.ap * f_8 / f_6;
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

	public void method8576(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, Class455 class455_7, int i_8, int i_9) {
		this.R(i_1, i_2, i_3, i_4, i_5, i_6, class455_7, i_8, i_9);
	}

	public Interface8 method8621(int i_1, int i_2) {
		return new oa(i_1, i_2);
	}

	public Matrix44Var method8450() {
		return this.ag;
	}

	public boolean method8609() {
		return true;
	}

	public native int[] kh(int var1, int var2, int var3, int var4);

	public native int[] ke(int var1, int var2, int var3, int var4);

	public native int[] kf(int var1, int var2, int var3, int var4);

	public native void fm(int var1, int var2, int var3, int var4);

	public void method8516(int i_1, int i_2, float f_3, int i_4, int i_5, float f_6, int i_7, int i_8, float f_9, int i_10, int i_11, int i_12, int i_13) {
		throw new IllegalStateException();
	}

	void method8608(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
	}

	public int method8630(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public int method8434(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public int method8632(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public void method8633() {
		this.az = (float) this.method8523((byte) 123).method2714() / 2.0F;
		this.ap = (float) this.method8523((byte) 117).method2716() / 2.0F;
		this.ax = this.az;
		this.al = this.ap;
		this.k();
	}

	public native void hr(int var1, Class455 var2, int var3, int var4);

	public void method8579(int i_1, Class282_Sub24[] arr_2) {
		int i_3 = 0;

		for (int i_4 = 0; i_4 < i_1; i_4++) {
			aq[i_3++] = arr_2[i_4].method12368((byte) 98);
			aq[i_3++] = arr_2[i_4].method12369();
			aq[i_3++] = arr_2[i_4].method12394(1424765190);
			aq[i_3++] = arr_2[i_4].method12370();
			av[i_4] = arr_2[i_4].method12395(-1021578073);
			aq[i_3++] = arr_2[i_4].method12371(-2136942824);
		}

		this.Q(i_1, aq, av);
	}

	public native void y(boolean var1);

	public native void fc(int var1, int var2, int var3, int var4);

	native void ng(Interface22 var1, int var2, int var3);

	public void method8530(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
	}

	native void nc(int var1, int var2, int var3, int var4, int var5, int var6);

	void method8486() {
		if (!this.b) {
			this.ai = null;
			this.z = null;
			this.af = null;

			for (ba ba_1 = (ba) this.au.head((byte) 41); ba_1 != null; ba_1 = (ba) this.au.next(476144881)) {
				ba_1.ha();
			}

			this.au.method8118(1098204001);
			this.da();
			if (this.bm) {
				Class13.method508(false, true, 1235757139);
				this.bm = false;
			}

			this.h();
			Class156.method2644(-902098068);
			this.b = true;
		}

	}

	native void nz(int var1);

	native void nm(Class282_Sub1 var1);

	native void nd(Class282_Sub1 var1);

	native void nj(Class282_Sub1 var1);

	native void nf(int var1, int[] var2, float[] var3);

	native void nr(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

	native void ns(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

	native void nw(short var1, int[] var2, short var3, int var4, byte var5, byte var6, int var7, boolean var8, byte var9, byte var10, byte var11, byte var12, boolean var13, boolean var14, boolean var15, boolean var16, boolean var17, byte var18, boolean var19, boolean var20, int var21);

	native void ow(za var1);

	public void method8673(int i_1, int i_2, int i_3, int i_4) {
	}

	native void os(za var1);

	public boolean method8599() {
		return false;
	}

	native void or();

	native void oe();

	public native void O();

	native void of(int var1, int var2, int var3, int var4);

	public int method8546(int i_1, int i_2) {
		return i_1 | i_2;
	}

	public Class455 method8624(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new wa(this, this.z, i_1, i_2, ints_3, ints_4);
	}

	native void ov(int var1, int var2, int var3, int var4);

	public boolean method8495() {
		return false;
	}

	native void oy(float[] var1);

	public native void in(float var1);

	native void ot(float[] var1);

	public void method8529(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
	}

	public Class152 method8400(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		return null;
	}

	public Class455 method8554(int i_1, int i_2, int[] ints_3, int[] ints_4) {
		return new wa(this, this.z, i_1, i_2, ints_3, ints_4);
	}

	native void no(Interface22 var1, int var2, int var3);

	native void oa(int var1, int var2, int var3, int var4);

	native void ox(int var1, int var2, int var3, int var4);

}
