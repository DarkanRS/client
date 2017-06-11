/* Class_ra_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;
import jagdx.b;
import jagdx.u;

public class Class_ra_Sub3_Sub2 extends Class_ra_Sub3 {
	int anInt9844;
	boolean[] aBooleanArray9845;
	boolean aBoolean9846;
	long aLong9847;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9848;
	long aLong9849;
	int anInt9850;
	Class458 aClass458_9851;
	long aLong9852 = 0L;
	long aLong9853;
	boolean aBoolean9854;
	long[] aLongArray9855;
	boolean[] aBooleanArray9856;
	boolean aBoolean9857;
	boolean[] aBooleanArray9858;
	Class179[] aClass179Array9859;
	Class110_Sub1 aClass110_Sub1_9860;
	Matrix4f aClass233_9861;
	boolean[] aBooleanArray9862;
	long aLong9863;
	D3DCAPS aD3DCAPS9864;
	boolean aBoolean9865;
	int[] anIntArray9866;
	long aLong9867;
	float[] aFloatArray9868;
	int anInt9869;
	int anInt9870;
	int anInt9871;
	static int[] anIntArray9872 = { 77, 80 };
	static int[] anIntArray9873 = { 22, 23 };

	Interface9_Impl2 method5439(Class55 class55, int i, int i_0_, boolean bool, byte[] is, int i_1_, int i_2_) {
		return new Class200_Sub3(this, class55, i, i_0_, bool, is, i_1_, i_2_);
	}

	public boolean method5483() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.PixelShaderVersion & 0xffff) >= 257);
	}

	void method5441() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 14, aBoolean8277 && aBoolean8237);
	}

	Class_ra_Sub3_Sub2(int i, int i_3_, long l, long l_4_, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, Interface_ma interface_ma, Class243 class243, int i_5_) {
		super(interface_ma, class243, i_5_, 0);
		((Class_ra_Sub3_Sub2) this).aLong9847 = 0L;
		((Class_ra_Sub3_Sub2) this).aClass458_9851 = new Class458();
		((Class_ra_Sub3_Sub2) this).anInt9850 = 0;
		((Class_ra_Sub3_Sub2) this).aLong9853 = 0L;
		((Class_ra_Sub3_Sub2) this).aLong9867 = 0L;
		((Class_ra_Sub3_Sub2) this).aLong9863 = 0L;
		((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		((Class_ra_Sub3_Sub2) this).aFloatArray9868 = new float[16];
		((Class_ra_Sub3_Sub2) this).anInt9869 = 128;
		((Class_ra_Sub3_Sub2) this).anInt9870 = 0;
		((Class_ra_Sub3_Sub2) this).aLongArray9855 = new long[((Class_ra_Sub3_Sub2) this).anInt9869];
		try {
			((Class_ra_Sub3_Sub2) this).anInt9844 = i;
			((Class_ra_Sub3_Sub2) this).anInt9871 = i_3_;
			((Class_ra_Sub3_Sub2) this).aLong9852 = l;
			((Class_ra_Sub3_Sub2) this).aLong9847 = l_4_;
			((Class_ra_Sub3_Sub2) this).aD3DPRESENT_PARAMETERS9848 = d3dpresent_parameters;
			((Class_ra_Sub3_Sub2) this).aD3DCAPS9864 = d3dcaps;
			((Class_ra_Sub3_Sub2) this).aLong9853 = D3DLIGHT.Create();
			((Class_ra_Sub3_Sub2) this).aLong9867 = D3DLIGHT.Create();
			((Class_ra_Sub3_Sub2) this).aLong9863 = D3DLIGHT.Create();
			anInt8347 = (((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.MaxSimultaneousTextures);
			anInt8348 = (((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.MaxActiveLights > 0 ? ((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.MaxActiveLights : 8);
			((Class_ra_Sub3_Sub2) this).aBoolean9865 = ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.TextureCaps & 0x2) == 0);
			aBoolean8365 = (((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.TextureCaps & 0x2000) != 0;
			((Class_ra_Sub3_Sub2) this).aBoolean9857 = (((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.TextureCaps & 0x10000) != 0;
			((Class_ra_Sub3_Sub2) this).aBoolean9846 = (((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.TextureCaps & 0x4000) != 0;
			aBoolean8349 = true;
			aBoolean8350 = anInt8341 > 0 || (IDirect3D.CheckDeviceMultiSampleType(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, (((Class_ra_Sub3_Sub2) this).aD3DPRESENT_PARAMETERS9848.BackBufferFormat), true, 2)) == 0;
			((Class_ra_Sub3_Sub2) this).aBooleanArray9862 = new boolean[anInt8347];
			((Class_ra_Sub3_Sub2) this).aBooleanArray9856 = new boolean[anInt8347];
			((Class_ra_Sub3_Sub2) this).aBooleanArray9845 = new boolean[anInt8347];
			((Class_ra_Sub3_Sub2) this).aClass179Array9859 = new Class179[anInt8347];
			((Class_ra_Sub3_Sub2) this).aBooleanArray9858 = new boolean[anInt8347];
			((Class_ra_Sub3_Sub2) this).anIntArray9866 = new int[anInt8347];
			Matrix3f class222 = new Matrix3f();
			class222.method2065(1.0F, -1.0F, 0.5F);
			class222.method2064(0.0F, 0.0F, 0.5F);
			((Class_ra_Sub3_Sub2) this).aClass233_9861 = new Matrix4f();
			((Class_ra_Sub3_Sub2) this).aClass233_9861.method2145(class222);
			IDirect3DDevice.BeginScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method5136(1630490401);
			throw new RuntimeException("");
		}
	}

	void method5307() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(1904772578); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -5)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method133();
			if (interface11 == aClass52_5292)
				interface11.method136();
		}
		super.method5307();
	}

	public void method5519(Matrix4f class233, Matrix4f class233_6_, Matrix4f class233_7_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 256, class233.aFloatArray2594);
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 2, class233_6_.aFloatArray2594);
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 3, class233_7_.aFloatArray2594);
	}

	boolean method5539() {
		int i = IDirect3DDevice.TestCooperativeLevel(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (i == 0 || i == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((((Class_ra_Sub3_Sub2) this).aLong9847), 0L);
			for (int i_8_ = 0; i_8_ < 4; i_8_++)
				IDirect3DDevice.SetRenderTarget((((Class_ra_Sub3_Sub2) this).aLong9847), i_8_, 0L);
			for (int i_9_ = 0; i_9_ < 4; i_9_++)
				IDirect3DDevice.SetStreamSource((((Class_ra_Sub3_Sub2) this).aLong9847), i_9_, 0L, 0, 0);
			for (int i_10_ = 0; i_10_ < 4; i_10_++)
				IDirect3DDevice.SetTexture((((Class_ra_Sub3_Sub2) this).aLong9847), i_10_, 0L);
			IDirect3DDevice.SetIndices(((Class_ra_Sub3_Sub2) this).aLong9847, 0L);
			method5306();
			((Class_ra_Sub3_Sub2) this).aD3DPRESENT_PARAMETERS9848.BackBufferWidth = 0;
			((Class_ra_Sub3_Sub2) this).aD3DPRESENT_PARAMETERS9848.BackBufferHeight = 0;
			if (method5551(((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, ((Class_ra_Sub3_Sub2) this).aLong9852, anInt8341, (((Class_ra_Sub3_Sub2) this).aD3DPRESENT_PARAMETERS9848))) {
				int i_11_ = IDirect3DDevice.Reset((((Class_ra_Sub3_Sub2) this).aLong9847), (((Class_ra_Sub3_Sub2) this).aD3DPRESENT_PARAMETERS9848));
				if (jagdx.a.f(i_11_)) {
					method5307();
					method5463();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	void method5448() {
		if (fixedFunction)
			IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 137, aBoolean8264 && !aBoolean8282);
	}

	public Class58 method4987() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, 0, d3dadapter_identifier);
		return new Class58(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	void method5540() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(2038971195); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) 3)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method135();
		}
		super.method5306();
	}

	public void method5075() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (jagdx.a.f(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method5023() {
		super.method5023();
		if (((Class_ra_Sub3_Sub2) this).aLong9853 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9853);
			((Class_ra_Sub3_Sub2) this).aLong9853 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9867 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9867);
			((Class_ra_Sub3_Sub2) this).aLong9867 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9863 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9863);
			((Class_ra_Sub3_Sub2) this).aLong9863 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9847 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub3_Sub2) this).aLong9847);
			((Class_ra_Sub3_Sub2) this).aLong9847 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9852 != 0L) {
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLong9852);
			((Class_ra_Sub3_Sub2) this).aLong9852 = 0L;
		}
	}

	Interface9_Impl2 method5474(int i, int i_12_, boolean bool, int[] is, int i_13_, int i_14_) {
		return new Class200_Sub3(this, i, i_12_, bool, is, i_13_, i_14_);
	}

	public float method5315() {
		return -0.5F;
	}

	Class52_Sub2 method5006(Canvas canvas, int i, int i_15_) {
		return new Class52_Sub2_Sub2_Sub2(this, canvas, i, i_15_, false);
	}

	void method5343() {
		if (fixedFunction) {
			float f = aBoolean8281 ? aFloat8364 : 0.0F;
			float f_16_ = aBoolean8281 ? -aFloat8293 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub3_Sub2) this).aLong9853, f * aFloat8362, f * aFloat8289, f * aFloat8290, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub3_Sub2) this).aLong9867, f_16_ * aFloat8362, f_16_ * aFloat8289, f_16_ * aFloat8290, 0.0F);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5069() {
		super.method5023();
		if (((Class_ra_Sub3_Sub2) this).aLong9853 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9853);
			((Class_ra_Sub3_Sub2) this).aLong9853 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9867 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9867);
			((Class_ra_Sub3_Sub2) this).aLong9867 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9863 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9863);
			((Class_ra_Sub3_Sub2) this).aLong9863 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9847 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub3_Sub2) this).aLong9847);
			((Class_ra_Sub3_Sub2) this).aLong9847 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9852 != 0L) {
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLong9852);
			((Class_ra_Sub3_Sub2) this).aLong9852 = 0L;
		}
	}

	Class298_Sub21 method5541(Interface11 interface11) {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(1679619359); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -106)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			if (((Class298_Sub21) class298_sub21).anInterface11_7315 == interface11)
				return class298_sub21;
		}
		return null;
	}

	void method5542(Interface11 interface11) {
		if (method5541(interface11) == null)
			((Class_ra_Sub3_Sub2) this).aClass458_9851.method5968(new Class298_Sub21(interface11), 364496408);
	}

	void method5347() {
		int i;
		for (i = 0; i < anInt8296; i++) {
			Class298_Sub10 class298_sub10 = aClass298_Sub10Array8286[i];
			int i_17_ = i + 2;
			int i_18_ = class298_sub10.method2898(-1167524098);
			float f = class298_sub10.method2901(608404512) / 255.0F;
			D3DLIGHT.SetPosition(((Class_ra_Sub3_Sub2) this).aLong9863, (float) class298_sub10.method2895(823958259), (float) class298_sub10.method2894(-1488448874), (float) class298_sub10.method2897((byte) 58));
			D3DLIGHT.SetDiffuse(((Class_ra_Sub3_Sub2) this).aLong9863, (float) (i_18_ >> 16 & 0xff) * f, (float) (i_18_ >> 8 & 0xff) * f, (float) (i_18_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class_ra_Sub3_Sub2) this).aLong9863, 0.0F, 0.0F, 1.0F / (float) (class298_sub10.method2900(-426177774) * class298_sub10.method2900(-311447466)));
			D3DLIGHT.SetRange(((Class_ra_Sub3_Sub2) this).aLong9863, (float) class298_sub10.method2900(-949255616));
			IDirect3DDevice.SetLight(((Class_ra_Sub3_Sub2) this).aLong9847, i_17_, ((Class_ra_Sub3_Sub2) this).aLong9863);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, i_17_, true);
		}
		for (/**/; i < anInt8295; i++)
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, i + 2, false);
	}

	public int[] aq(int i, int i_19_, int i_20_, int i_21_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class_ra_Sub3_Sub2) this).aLong9847, 0);
		long l_22_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub3_Sub2) this).aLong9847), i_20_, i_21_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((((Class_ra_Sub3_Sub2) this).aLong9847), l, i, i_19_, i_20_, i_21_, l_22_, 0, 0, i_20_, i_21_, 1))) {
			is = new int[i_20_ * i_21_];
			IDirect3DSurface.Download(l_22_, 0, 0, i_20_, i_21_, i_20_ * 4, 16, aLong8217);
			aByteBuffer8216.clear();
			aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_22_);
		return is;
	}

	public void method5176() {
		/* empty */
	}

	void method5506(boolean bool) {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 161, bool);
	}

	public void ba(int i, int i_23_) {
		IDirect3DDevice.Clear(((Class_ra_Sub3_Sub2) this).aLong9847, i, i_23_, 1.0F, 0);
	}

	void method5325() {
		if (aClass52_5292 != null)
			IDirect3DDevice.SetViewport(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8275 + anInt8339, anInt8276 + anInt8272, anInt8273, anInt8239, aFloat8335, aFloat8258);
	}

	void method5326() {
		IDirect3DDevice.SetScissorRect(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8275 + anInt8265, anInt8276 + anInt8263, anInt8234, anInt8241);
	}

	void method5327() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 174, aBoolean8254);
	}

	Interface9_Impl2 method5403(Class55 class55, int i, int i_24_, boolean bool, float[] fs, int i_25_, int i_26_) {
		return new Class200_Sub3(this, class55, i, i_24_, bool, fs, i_25_, i_26_);
	}

	void method5500() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 15, aBoolean8309);
	}

	public void method5300(Matrix4f class233, Matrix4f class233_27_, Matrix4f class233_28_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 256, class233.aFloatArray2594);
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 2, class233_27_.aFloatArray2594);
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 3, class233_28_.aFloatArray2594);
	}

	final Interface7_Impl1 method5408(boolean bool) {
		return new Class193(this, bool);
	}

	void method5340() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 7, aBoolean8279);
	}

	void method5341() {
		if (fixedFunction)
			IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 137, aBoolean8264 && !aBoolean8282);
	}

	void method5411() {
		if (fixedFunction) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub3_Sub2) this).aLong9853, aFloat8362 * aFloat8291, aFloat8289 * aFloat8291, aFloat8290 * aFloat8291, 0.0F);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5009() {
		super.method5023();
		if (((Class_ra_Sub3_Sub2) this).aLong9853 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9853);
			((Class_ra_Sub3_Sub2) this).aLong9853 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9867 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9867);
			((Class_ra_Sub3_Sub2) this).aLong9867 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9863 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9863);
			((Class_ra_Sub3_Sub2) this).aLong9863 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9847 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub3_Sub2) this).aLong9847);
			((Class_ra_Sub3_Sub2) this).aLong9847 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9852 != 0L) {
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLong9852);
			((Class_ra_Sub3_Sub2) this).aLong9852 = 0L;
		}
	}

	Interface9_Impl1 method5415(int i, boolean bool, int[][] is) {
		return new Class200_Sub2(this, i, bool, is);
	}

	void method5345() {
		method5343();
		method5320();
	}

	void method5320() {
		if (fixedFunction && !((Class_ra_Sub3_Sub2) this).aBoolean9854) {
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 0, false);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 1, false);
			IDirect3DDevice.SetLight(((Class_ra_Sub3_Sub2) this).aLong9847, 0, ((Class_ra_Sub3_Sub2) this).aLong9853);
			IDirect3DDevice.SetLight(((Class_ra_Sub3_Sub2) this).aLong9847, 1, ((Class_ra_Sub3_Sub2) this).aLong9867);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 0, true);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 1, true);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = true;
		}
	}

	Interface9_Impl3 method5344(Class55 class55, int i, int i_29_, int i_30_, boolean bool, byte[] is) {
		return new Class200_Sub1(this, class55, i, i_29_, i_30_, bool, is);
	}

	boolean method5348(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 3, method5546(class55, class77))));
	}

	boolean method5349(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	Interface9_Impl2 method5353(Class55 class55, Class77 class77, int i, int i_31_) {
		return new Class200_Sub3(this, class55, class77, i, i_31_);
	}

	Interface9_Impl2 method5355(int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		return new Class200_Sub3(this, i, i_32_, bool, is, i_33_, i_34_);
	}

	void method5495() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8294[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 1, i);
		}
	}

	Interface9_Impl2 method5453(Class55 class55, int i, int i_35_, boolean bool, float[] fs, int i_36_, int i_37_) {
		return new Class200_Sub3(this, class55, i, i_35_, bool, fs, i_36_, i_37_);
	}

	Interface9_Impl2_Impl1 method5356(Class55 class55, Class77 class77, int i, int i_38_) {
		return new Class200_Sub3_Sub1(this, class55, class77, i, i_38_);
	}

	final void method5543(long l) {
		((Class_ra_Sub3_Sub2) this).aLong9849 = l;
		IDirect3DDevice.SetVertexShader(((Class_ra_Sub3_Sub2) this).aLong9847, l);
	}

	final void method5485(int i, Class183 class183, boolean bool) {
		if (fixedFunction) {
			int i_39_ = 0;
			int i_40_;
			switch (i) {
			case 2:
				i_40_ = 27;
				break;
			case 1:
				i_40_ = 6;
				break;
			default:
				i_40_ = 5;
			}
			if (bool)
				i_39_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, i_40_, method5547(class183) | i_39_);
		}
	}

	final void method5544(Class200 class200) {
		IDirect3DDevice.SetTexture(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, class200.method1894());
		if (fixedFunction && !((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325]) {
			((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] = true;
			method5444();
			method5372();
		}
	}

	public void method5455(Class153 class153) {
		Class153_Sub2 class153_sub2 = (Class153_Sub2) class153;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub3_Sub2) this).aLong9847), (((Class153_Sub2) class153_sub2).aLong8623));
	}

	static GraphicsToolkit method5545(Canvas canvas, Interface_ma interface_ma, Class243 class243, Integer integer) {
		Class_ra_Sub3_Sub2 class_ra_sub3_sub2 = null;
		Class_ra_Sub3_Sub2 class_ra_sub3_sub2_41_;
		try {
			int i = 0;
			int i_42_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_42_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			if (!method5551(i, i_42_, l, integer.intValue(), d3dpresent_parameters))
				throw new RuntimeException("");
			int i_43_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_43_ |= 0x10;
			long l_44_ = 0L;
			try {
				l_44_ = IDirect3D.CreateDeviceContext(l, i, i_42_, canvas, i_43_ | 0x40, d3dpresent_parameters);
			} catch (u var_u) {
				l_44_ = IDirect3D.CreateDeviceContext(l, i, i_42_, canvas, i_43_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class_ra_sub3_sub2 = new Class_ra_Sub3_Sub2(i, i_42_, l, l_44_, d3dpresent_parameters, d3dcaps, interface_ma, class243, integer.intValue());
			if (!class_ra_sub3_sub2.aHashtable5313.containsKey(canvas)) {
				Class298_Sub19_Sub3.method3041(canvas, (short) 3524);
				class_ra_sub3_sub2.method5151(canvas, new Class52_Sub2_Sub2_Sub2(class_ra_sub3_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), (byte) -32);
			}
			class_ra_sub3_sub2.method5003(canvas, (byte) -102);
			class_ra_sub3_sub2.method5302();
			class_ra_sub3_sub2_41_ = class_ra_sub3_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class_ra_sub3_sub2 != null)
				class_ra_sub3_sub2.method5023();
			throw runtimeexception;
		}
		return class_ra_sub3_sub2_41_;
	}

	void method5422() {
		if (fixedFunction) {
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9853, -aFloatArray8283[0], -aFloatArray8283[1], -aFloatArray8283[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9867, -aFloatArray8248[0], -aFloatArray8248[1], -aFloatArray8248[2]);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5486() {
		if (((Class_ra_Sub3_Sub2) this).aLong9849 == 0L && aClass171Array8305[anInt8325] != Class171.aClass171_1742) {
			if (aClass171Array8305[anInt8325] == Class171.aClass171_1741)
				IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 16 + anInt8325, (aClass233Array8304[anInt8325].method2166(((Class_ra_Sub3_Sub2) this).aFloatArray9868)));
			else
				IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 16 + anInt8325, (aClass233Array8304[anInt8325].method2173(((Class_ra_Sub3_Sub2) this).aFloatArray9868)));
			int i = method5548(aClass171Array8305[anInt8325]);
			if (i != ((Class_ra_Sub3_Sub2) this).anIntArray9866[anInt8325]) {
				IDirect3DDevice.SetTextureStageState(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, 24, i);
				((Class_ra_Sub3_Sub2) this).anIntArray9866[anInt8325] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 24, 0);
			((Class_ra_Sub3_Sub2) this).anIntArray9866[anInt8325] = 0;
		}
	}

	void method5371() {
		/* empty */
	}

	public Class66 method5179(Class66 class66, Class66 class66_45_, float f, Class66 class66_46_) {
		return f < 0.5F ? class66 : class66_45_;
	}

	void method5444() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8307[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 4, i);
		}
	}

	final void method5427(int i, Class183 class183, boolean bool, boolean bool_47_) {
		if (fixedFunction) {
			int i_48_ = 0;
			int i_49_;
			switch (i) {
			case 1:
				i_49_ = 3;
				break;
			default:
				i_49_ = 2;
				break;
			case 2:
				i_49_ = 26;
			}
			if (bool)
				i_48_ |= 0x20;
			if (bool_47_)
				i_48_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, i_49_, method5547(class183) | i_48_);
		}
	}

	final void method5364(int i, Class183 class183, boolean bool) {
		if (fixedFunction) {
			int i_50_ = 0;
			int i_51_;
			switch (i) {
			case 2:
				i_51_ = 27;
				break;
			case 1:
				i_51_ = 6;
				break;
			default:
				i_51_ = 5;
			}
			if (bool)
				i_50_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, i_51_, method5547(class183) | i_50_);
		}
	}

	final void method5369() {
		if (fixedFunction)
			IDirect3DDevice.SetRenderState((((Class_ra_Sub3_Sub2) this).aLong9847), 60, anInt8274);
	}

	static final int method5546(Class55 class55, Class77 class77) {
		switch (class77.anInt723 * -1857088243) {
		case 4:
			if (class55 == Class55.aClass55_557)
				return 113;
			break;
		case 1:
			switch (class55.anInt566 * -976336893) {
			case 2:
				return 77;
			case 1:
				return 50;
			case 9:
				return 21;
			case 5:
				return 22;
			case 0:
				return b.y * 285928237;
			case 7:
				return 28;
			case 3:
				return 51;
			case 8:
				return b.z * 368340649;
			default:
				break;
			}
			break;
		case 3:
			if (class55 == Class55.aClass55_557)
				return 116;
			break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method5547(Class183 class183) {
		switch (class183.anInt1891) {
		case 0:
			return 1;
		case 1:
			return 3;
		default:
			throw new IllegalArgumentException();
		case 3:
			return 0;
		case 2:
			return 2;
		}
	}

	static final int method5548(Class171 class171) {
		switch (class171.anInt1745) {
		default:
			return 0;
		case 5:
			return 4;
		case 3:
			return 256;
		case 4:
			return 3;
		case 0:
			return 2;
		case 1:
			return 1;
		}
	}

	void method5292(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 168, i);
	}

	void method5375() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 15, aBoolean8309);
	}

	void method5376() {
		switch (aClass174_8268.anInt1764) {
		case 3:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 5);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 9);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 2);
			break;
		}
		switch (anInt8366) {
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 207, 1);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 208, 1);
			break;
		}
	}

	void method5305() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 27, aBoolean8245);
	}

	void method5379() {
		if (fixedFunction)
			IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 28, aBoolean8331 && aBoolean8278 && anInt8233 >= 0);
	}

	void method5378() {
		aFloat8336 = aFloat8308 - (float) anInt8334;
		aFloat8292 = aFloat8336 - (float) anInt8233;
		if (aFloat8292 < aFloat8261)
			aFloat8292 = aFloat8261;
		if (fixedFunction) {
			IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 36, aFloat8292);
			IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 37, aFloat8336);
			IDirect3DDevice.SetRenderState((((Class_ra_Sub3_Sub2) this).aLong9847), 34, anInt8332);
		}
	}

	void method5380(boolean bool) {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 161, bool);
	}

	final Interface7_Impl2 method5381(boolean bool) {
		return new Class196(this, Class77.aClass77_718, bool);
	}

	final Interface7_Impl1 method5382(boolean bool) {
		return new Class193(this, bool);
	}

	Class153 method5404(Class181[] class181s) {
		return new Class153_Sub2(this, class181s);
	}

	public void method5383(int i, Interface7_Impl1 interface7_impl1) {
		Class193 class193 = (Class193) interface7_impl1;
		IDirect3DDevice.SetStreamSource(((Class_ra_Sub3_Sub2) this).aLong9847, i, ((Class193) class193).aLong8584, 0, class193.method1861());
	}

	void method5384(Interface7_Impl2 interface7_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub3_Sub2) this).aLong9847, (((Class196) (Class196) interface7_impl2).aLong8590));
	}

	public final void method5398(Class187 class187, int i, int i_52_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawPrimitive(((Class_ra_Sub3_Sub2) this).aLong9847, method5567(class187), i, i_52_);
	}

	public final void method5392(Class187 class187, int i, int i_53_, int i_54_, int i_55_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub3_Sub2) this).aLong9847), method5567(class187), 0, i, i_53_, i_54_, i_55_);
	}

	byte[] method5549(String string) {
		return method5298("dx", string);
	}

	public Class123 method5297(String string) {
		byte[] is = method5549(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub1(this, class109);
	}

	public final synchronized void method4993(int i) {
		for (int i_56_ = 0; i_56_ < ((Class_ra_Sub3_Sub2) this).anInt9870; i_56_++)
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLongArray9855[i_56_]);
		((Class_ra_Sub3_Sub2) this).anInt9870 = 0;
		super.method4993(i);
	}

	void method4989(int i, int i_57_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		int i_58_ = aClass52_Sub2_5312.method580();
		if (jagdx.a.a(i_58_)) {
			if (i_58_ != -2005530520) {
				if (++((Class_ra_Sub3_Sub2) this).anInt9850 > 50)
					throw new Exception_Sub1();
			} else {
				aClass52_Sub2_5312.method135();
				method5539();
				((Class52_Sub2_Sub2_Sub2) aClass52_Sub2_5312).method133();
			}
		} else
			((Class_ra_Sub3_Sub2) this).anInt9850 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(1832776927);
	}

	static final int method5550(Class77 class77) {
		if (class77 == Class77.aClass77_718)
			return 80;
		if (class77 == Class77.aClass77_719)
			return 77;
		throw new IllegalArgumentException("");
	}

	public Interface8_Impl1_Impl2 method5165(int i, int i_59_) {
		return new Class199(this, Class77.aClass77_719, i, i_59_);
	}

	void method5394(int i) {
		int i_60_ = (i & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 8, i_60_);
	}

	static boolean method5551(int i, int i_61_, long l, int i_62_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_63_ = 0;
		int i_64_ = 0;
		int i_65_ = 0;
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (jagdx.a.a(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_16_: for (/**/; i_62_ >= 0; i_62_--) {
				if (i_62_ != 1) {
					i_65_ = 0 + i_62_;
					for (int i_66_ = 0; i_66_ < anIntArray9873.length; i_66_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_61_, d3ddisplaymode.Format, anIntArray9873[i_66_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_61_, (d3ddisplaymode.Format), 1, 1, (anIntArray9873[i_66_])) == 0 && (i_62_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_61_, anIntArray9873[i_66_], true, i_65_)) == 0)) {
							for (int i_67_ = 0; i_67_ < anIntArray9872.length; i_67_++) {
								if (IDirect3D.CheckDeviceFormat(l, i, i_61_, (d3ddisplaymode.Format), 2, 1, (anIntArray9872[i_67_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_61_, d3ddisplaymode.Format, anIntArray9873[i_66_], anIntArray9872[i_67_])) == 0 && (i_62_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_61_, anIntArray9872[i_66_], true, i_65_)) == 0)) {
									i_64_ = anIntArray9873[i_66_];
									i_63_ = anIntArray9872[i_67_];
									break while_16_;
								}
							}
						}
					}
				}
			}
			if (i_62_ < 0 || i_64_ == 0 || i_63_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_64_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_63_;
			d3dpresent_parameters.MultiSampleType = i_65_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	synchronized void method5552(long l) {
		if (((Class_ra_Sub3_Sub2) this).anInt9870 == ((Class_ra_Sub3_Sub2) this).anInt9869) {
			((Class_ra_Sub3_Sub2) this).anInt9869 *= 2;
			long[] ls = new long[((Class_ra_Sub3_Sub2) this).anInt9869];
			System.arraycopy(((Class_ra_Sub3_Sub2) this).aLongArray9855, 0, ls, 0, ((Class_ra_Sub3_Sub2) this).anInt9870);
			((Class_ra_Sub3_Sub2) this).aLongArray9855 = ls;
		}
		((Class_ra_Sub3_Sub2) this).aLongArray9855[(((Class_ra_Sub3_Sub2) this).anInt9870)] = l;
		((Class_ra_Sub3_Sub2) this).anInt9870++;
	}

	void method5372() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8294[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 1, i);
		}
	}

	public Class58 method5062() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, 0, d3dadapter_identifier);
		return new Class58(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	static GraphicsToolkit method5553(Canvas canvas, Interface_ma interface_ma, Class243 class243, Integer integer) {
		Class_ra_Sub3_Sub2 class_ra_sub3_sub2 = null;
		Class_ra_Sub3_Sub2 class_ra_sub3_sub2_68_;
		try {
			int i = 0;
			int i_69_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_69_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			if (!method5551(i, i_69_, l, integer.intValue(), d3dpresent_parameters))
				throw new RuntimeException("");
			int i_70_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_70_ |= 0x10;
			long l_71_ = 0L;
			try {
				l_71_ = IDirect3D.CreateDeviceContext(l, i, i_69_, canvas, i_70_ | 0x40, d3dpresent_parameters);
			} catch (u var_u) {
				l_71_ = IDirect3D.CreateDeviceContext(l, i, i_69_, canvas, i_70_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class_ra_sub3_sub2 = new Class_ra_Sub3_Sub2(i, i_69_, l, l_71_, d3dpresent_parameters, d3dcaps, interface_ma, class243, integer.intValue());
			if (!class_ra_sub3_sub2.aHashtable5313.containsKey(canvas)) {
				Class298_Sub19_Sub3.method3041(canvas, (short) 20418);
				class_ra_sub3_sub2.method5151(canvas, new Class52_Sub2_Sub2_Sub2(class_ra_sub3_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), (byte) -30);
			}
			class_ra_sub3_sub2.method5003(canvas, (byte) -26);
			class_ra_sub3_sub2.method5302();
			class_ra_sub3_sub2_68_ = class_ra_sub3_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class_ra_sub3_sub2 != null)
				class_ra_sub3_sub2.method5023();
			throw runtimeexception;
		}
		return class_ra_sub3_sub2_68_;
	}

	void method5064(int i, int i_72_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		int i_73_ = aClass52_Sub2_5312.method580();
		if (jagdx.a.a(i_73_)) {
			if (i_73_ != -2005530520) {
				if (++((Class_ra_Sub3_Sub2) this).anInt9850 > 50)
					throw new Exception_Sub1();
			} else {
				aClass52_Sub2_5312.method135();
				method5539();
				((Class52_Sub2_Sub2_Sub2) aClass52_Sub2_5312).method133();
			}
		} else
			((Class_ra_Sub3_Sub2) this).anInt9850 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(-50250813);
	}

	void method5065(int i, int i_74_) throws Exception_Sub1 {
		IDirect3DDevice.EndScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		int i_75_ = aClass52_Sub2_5312.method580();
		if (jagdx.a.a(i_75_)) {
			if (i_75_ != -2005530520) {
				if (++((Class_ra_Sub3_Sub2) this).anInt9850 > 50)
					throw new Exception_Sub1();
			} else {
				aClass52_Sub2_5312.method135();
				method5539();
				((Class52_Sub2_Sub2_Sub2) aClass52_Sub2_5312).method133();
			}
		} else
			((Class_ra_Sub3_Sub2) this).anInt9850 = 0;
		IDirect3DDevice.BeginScene(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (anInterface_ma5299 != null)
			anInterface_ma5299.method176(275079271);
	}

	public void method5066() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (jagdx.a.f(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	public void method5067() {
		long l = IDirect3DDevice.CreateEventQuery(((Class_ra_Sub3_Sub2) this).aLong9847);
		if (jagdx.a.f(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	final Interface7_Impl1 method5508(boolean bool) {
		return new Class193(this, bool);
	}

	void method5141() {
		super.method5023();
		if (((Class_ra_Sub3_Sub2) this).aLong9853 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9853);
			((Class_ra_Sub3_Sub2) this).aLong9853 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9867 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9867);
			((Class_ra_Sub3_Sub2) this).aLong9867 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9863 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9863);
			((Class_ra_Sub3_Sub2) this).aLong9863 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9847 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub3_Sub2) this).aLong9847);
			((Class_ra_Sub3_Sub2) this).aLong9847 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9852 != 0L) {
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLong9852);
			((Class_ra_Sub3_Sub2) this).aLong9852 = 0L;
		}
	}

	void method5554() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(1899920069); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -58)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method133();
			if (interface11 == aClass52_5292)
				interface11.method136();
		}
		super.method5307();
	}

	void method5481() {
		if (aClass52_5292 != null)
			IDirect3DDevice.SetViewport(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8275 + anInt8339, anInt8276 + anInt8272, anInt8273, anInt8239, aFloat8335, aFloat8258);
	}

	public final synchronized void method5174(int i) {
		for (int i_76_ = 0; i_76_ < ((Class_ra_Sub3_Sub2) this).anInt9870; i_76_++)
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLongArray9855[i_76_]);
		((Class_ra_Sub3_Sub2) this).anInt9870 = 0;
		super.method4993(i);
	}

	public void method5012(boolean bool) {
		/* empty */
	}

	public void method5085(boolean bool) {
		/* empty */
	}

	Class52_Sub2 method5117(Canvas canvas, int i, int i_77_) {
		return new Class52_Sub2_Sub2_Sub2(this, canvas, i, i_77_, false);
	}

	public int[] ev(int i, int i_78_, int i_79_, int i_80_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class_ra_Sub3_Sub2) this).aLong9847, 0);
		long l_81_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub3_Sub2) this).aLong9847), i_79_, i_80_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((((Class_ra_Sub3_Sub2) this).aLong9847), l, i, i_78_, i_79_, i_80_, l_81_, 0, 0, i_79_, i_80_, 1))) {
			is = new int[i_79_ * i_80_];
			IDirect3DSurface.Download(l_81_, 0, 0, i_79_, i_80_, i_79_ * 4, 16, aLong8217);
			aByteBuffer8216.clear();
			aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_81_);
		return is;
	}

	public int[] eg(int i, int i_82_, int i_83_, int i_84_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class_ra_Sub3_Sub2) this).aLong9847, 0);
		long l_85_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub3_Sub2) this).aLong9847), i_83_, i_84_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((((Class_ra_Sub3_Sub2) this).aLong9847), l, i, i_82_, i_83_, i_84_, l_85_, 0, 0, i_83_, i_84_, 1))) {
			is = new int[i_83_ * i_84_];
			IDirect3DSurface.Download(l_85_, 0, 0, i_83_, i_84_, i_83_ * 4, 16, aLong8217);
			aByteBuffer8216.clear();
			aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_85_);
		return is;
	}

	public void method5080() {
		/* empty */
	}

	public void fy(int i, int i_86_) {
		IDirect3DDevice.Clear(((Class_ra_Sub3_Sub2) this).aLong9847, i, i_86_, 1.0F, 0);
	}

	public void fb(int i, int i_87_) {
		IDirect3DDevice.Clear(((Class_ra_Sub3_Sub2) this).aLong9847, i, i_87_, 1.0F, 0);
	}

	public void fh(int i, int i_88_) {
		IDirect3DDevice.Clear(((Class_ra_Sub3_Sub2) this).aLong9847, i, i_88_, 1.0F, 0);
	}

	public void fn(int i, int i_89_) {
		IDirect3DDevice.Clear(((Class_ra_Sub3_Sub2) this).aLong9847, i, i_89_, 1.0F, 0);
	}

	public Class66 method4986(Class66 class66, Class66 class66_90_, float f, Class66 class66_91_) {
		return f < 0.5F ? class66 : class66_90_;
	}

	public boolean method5423() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.PixelShaderVersion & 0xffff) >= 257);
	}

	public Class52_Sub1 method5138() {
		return new Class52_Sub1_Sub3_Sub2(this);
	}

	void method5555() {
		super.finalize();
	}

	public boolean method5385() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.VertexShaderVersion & 0xffff) >= 257);
	}

	public Class52_Sub1 method5094() {
		return new Class52_Sub1_Sub3_Sub2(this);
	}

	public boolean method5424() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.PixelShaderVersion & 0xffff) >= 257);
	}

	void method5410() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 14, aBoolean8277 && aBoolean8237);
	}

	public boolean method5295() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.VertexShaderVersion & 0xffff) >= 257);
	}

	void method5556() {
		for (int i = 0; i < anInt8347; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 2, 1);
			((Class_ra_Sub3_Sub2) this).aClass179Array9859[i] = Class179.aClass179_1812;
			boolean[] bools = ((Class_ra_Sub3_Sub2) this).aBooleanArray9862;
			int i_92_ = i;
			((Class_ra_Sub3_Sub2) this).aBooleanArray9856[i] = true;
			bools[i_92_] = true;
			((Class_ra_Sub3_Sub2) this).aBooleanArray9858[i] = false;
			((Class_ra_Sub3_Sub2) this).anIntArray9866[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 145, 1);
		IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 35, 3);
		IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub3_Sub2) this).aLong9853, 3);
		D3DLIGHT.SetType(((Class_ra_Sub3_Sub2) this).aLong9867, 3);
		D3DLIGHT.SetType(((Class_ra_Sub3_Sub2) this).aLong9863, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 206, 1);
		((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		super.method5463();
	}

	void method5557() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(2106468652); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -100)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method135();
		}
		super.method5306();
	}

	Class153 method5447(Class181[] class181s) {
		return new Class153_Sub2(this, class181s);
	}

	void method5558() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(2053650484); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -111)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method135();
		}
		super.method5306();
	}

	void method5429() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 174, aBoolean8254);
	}

	void method5559() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(1978045823); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -62)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method133();
			if (interface11 == aClass52_5292)
				interface11.method136();
		}
		super.method5307();
	}

	void method5560() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(2005791940); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -120)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method133();
			if (interface11 == aClass52_5292)
				interface11.method136();
		}
		super.method5307();
	}

	public float method5434() {
		return -0.5F;
	}

	public float method5435() {
		return -0.5F;
	}

	public float method5436() {
		return -0.5F;
	}

	void method5497() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8307[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 4, i);
		}
	}

	void method5303() {
		IDirect3DDevice.SetScissorRect(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8275 + anInt8265, anInt8276 + anInt8263, anInt8234, anInt8241);
	}

	void method5440() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 174, aBoolean8254);
	}

	protected void finalize() {
		super.finalize();
	}

	void method5442() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 174, aBoolean8254);
	}

	public void method5445(Matrix4f class233) {
		class233.method2144(((Class_ra_Sub3_Sub2) this).aClass233_9861);
	}

	public void method5446(Matrix4f class233) {
		class233.method2144(((Class_ra_Sub3_Sub2) this).aClass233_9861);
	}

	void method5451() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 7, aBoolean8279);
	}

	public final void method5362(Class187 class187, int i, int i_93_, int i_94_, int i_95_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub3_Sub2) this).aLong9847), method5567(class187), 0, i, i_93_, i_94_, i_95_);
	}

	void method5454() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 14, aBoolean8277 && aBoolean8237);
	}

	void method5412() {
		if (fixedFunction)
			IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 28, aBoolean8331 && aBoolean8278 && anInt8233 >= 0);
	}

	void method5456() {
		if (fixedFunction) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub3_Sub2) this).aLong9853, aFloat8362 * aFloat8291, aFloat8289 * aFloat8291, aFloat8290 * aFloat8291, 0.0F);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5432() {
		if (fixedFunction) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub3_Sub2) this).aLong9853, aFloat8362 * aFloat8291, aFloat8289 * aFloat8291, aFloat8290 * aFloat8291, 0.0F);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5437() {
		if (fixedFunction) {
			D3DLIGHT.SetAmbient(((Class_ra_Sub3_Sub2) this).aLong9853, aFloat8362 * aFloat8291, aFloat8289 * aFloat8291, aFloat8290 * aFloat8291, 0.0F);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	public Class58 method5063() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, 0, d3dadapter_identifier);
		return new Class58(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	static final int method5561(Class175 class175) {
		switch (class175.anInt1766) {
		case 3:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 2:
			return 10;
		case 4:
			return 7;
		case 0:
			return 26;
		case 1:
			return 4;
		}
	}

	void method5405() {
		if (fixedFunction) {
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9853, -aFloatArray8283[0], -aFloatArray8283[1], -aFloatArray8283[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9867, -aFloatArray8248[0], -aFloatArray8248[1], -aFloatArray8248[2]);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5409(Interface7_Impl2 interface7_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub3_Sub2) this).aLong9847, (((Class196) (Class196) interface7_impl2).aLong8590));
	}

	void method5459() {
		if (fixedFunction) {
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9853, -aFloatArray8283[0], -aFloatArray8283[1], -aFloatArray8283[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9867, -aFloatArray8248[0], -aFloatArray8248[1], -aFloatArray8248[2]);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5342() {
		if (fixedFunction) {
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9853, -aFloatArray8283[0], -aFloatArray8283[1], -aFloatArray8283[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9867, -aFloatArray8248[0], -aFloatArray8248[1], -aFloatArray8248[2]);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	void method5460() {
		if (fixedFunction && !((Class_ra_Sub3_Sub2) this).aBoolean9854) {
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 0, false);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 1, false);
			IDirect3DDevice.SetLight(((Class_ra_Sub3_Sub2) this).aLong9847, 0, ((Class_ra_Sub3_Sub2) this).aLong9853);
			IDirect3DDevice.SetLight(((Class_ra_Sub3_Sub2) this).aLong9847, 1, ((Class_ra_Sub3_Sub2) this).aLong9867);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 0, true);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, 1, true);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = true;
		}
	}

	void method5487() {
		method5343();
		method5320();
	}

	void method5400() {
		int i;
		for (i = 0; i < anInt8296; i++) {
			Class298_Sub10 class298_sub10 = aClass298_Sub10Array8286[i];
			int i_96_ = i + 2;
			int i_97_ = class298_sub10.method2898(-1228810857);
			float f = class298_sub10.method2901(608404512) / 255.0F;
			D3DLIGHT.SetPosition(((Class_ra_Sub3_Sub2) this).aLong9863, (float) class298_sub10.method2895(823958259), (float) class298_sub10.method2894(-1567954297), (float) class298_sub10.method2897((byte) 5));
			D3DLIGHT.SetDiffuse(((Class_ra_Sub3_Sub2) this).aLong9863, (float) (i_97_ >> 16 & 0xff) * f, (float) (i_97_ >> 8 & 0xff) * f, (float) (i_97_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class_ra_Sub3_Sub2) this).aLong9863, 0.0F, 0.0F, 1.0F / (float) (class298_sub10.method2900(-62352346) * class298_sub10.method2900(-235041618)));
			D3DLIGHT.SetRange(((Class_ra_Sub3_Sub2) this).aLong9863, (float) class298_sub10.method2900(-970124596));
			IDirect3DDevice.SetLight(((Class_ra_Sub3_Sub2) this).aLong9847, i_96_, ((Class_ra_Sub3_Sub2) this).aLong9863);
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, i_96_, true);
		}
		for (/**/; i < anInt8295; i++)
			IDirect3DDevice.LightEnable(((Class_ra_Sub3_Sub2) this).aLong9847, i + 2, false);
	}

	void method5068() {
		super.method5023();
		if (((Class_ra_Sub3_Sub2) this).aLong9853 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9853);
			((Class_ra_Sub3_Sub2) this).aLong9853 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9867 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9867);
			((Class_ra_Sub3_Sub2) this).aLong9867 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9863 != 0L) {
			D3DLIGHT.Destroy(((Class_ra_Sub3_Sub2) this).aLong9863);
			((Class_ra_Sub3_Sub2) this).aLong9863 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9847 != 0L) {
			IDirect3DDevice.Destroy(((Class_ra_Sub3_Sub2) this).aLong9847);
			((Class_ra_Sub3_Sub2) this).aLong9847 = 0L;
		}
		if (((Class_ra_Sub3_Sub2) this).aLong9852 != 0L) {
			IUnknown.Release(((Class_ra_Sub3_Sub2) this).aLong9852);
			((Class_ra_Sub3_Sub2) this).aLong9852 = 0L;
		}
	}

	boolean method5462(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 3, method5546(class55, class77))));
	}

	boolean method5310(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	boolean method5465(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	boolean method5464(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	boolean method5466(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	Interface9_Impl2 method5433(Class55 class55, Class77 class77, int i, int i_98_) {
		return new Class200_Sub3(this, class55, class77, i, i_98_);
	}

	Interface9_Impl2 method5468(Class55 class55, int i, int i_99_, boolean bool, byte[] is, int i_100_, int i_101_) {
		return new Class200_Sub3(this, class55, i, i_99_, bool, is, i_100_, i_101_);
	}

	Interface9_Impl2 method5370(Class55 class55, int i, int i_102_, boolean bool, byte[] is, int i_103_, int i_104_) {
		return new Class200_Sub3(this, class55, i, i_102_, bool, is, i_103_, i_104_);
	}

	Interface9_Impl2 method5515(Class55 class55, int i, int i_105_, boolean bool, byte[] is, int i_106_, int i_107_) {
		return new Class200_Sub3(this, class55, i, i_105_, bool, is, i_106_, i_107_);
	}

	Interface9_Impl2 method5470(Class55 class55, int i, int i_108_, boolean bool, float[] fs, int i_109_, int i_110_) {
		return new Class200_Sub3(this, class55, i, i_108_, bool, fs, i_109_, i_110_);
	}

	Interface9_Impl2 method5471(Class55 class55, int i, int i_111_, boolean bool, float[] fs, int i_112_, int i_113_) {
		return new Class200_Sub3(this, class55, i, i_111_, bool, fs, i_112_, i_113_);
	}

	Interface9_Impl2 method5472(Class55 class55, int i, int i_114_, boolean bool, float[] fs, int i_115_, int i_116_) {
		return new Class200_Sub3(this, class55, i, i_114_, bool, fs, i_115_, i_116_);
	}

	void method5306() {
		for (Linkable class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5967(1665102883); class298 != null; class298 = ((Class_ra_Sub3_Sub2) this).aClass458_9851.method5969((byte) -18)) {
			Class298_Sub21 class298_sub21 = (Class298_Sub21) class298;
			Interface11 interface11 = ((Class298_Sub21) class298_sub21).anInterface11_7315;
			interface11.method135();
		}
		super.method5306();
	}

	public final void method5513(Class187 class187, int i, int i_117_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawPrimitive(((Class_ra_Sub3_Sub2) this).aLong9847, method5567(class187), i, i_117_);
	}

	final void method5562(Class200_Sub3 class200_sub3) {
		method5544(class200_sub3);
		if (((Class_ra_Sub3_Sub2) this).aBooleanArray9862[anInt8325] != ((Class200_Sub3) class200_sub3).aBoolean8631) {
			IDirect3DDevice.SetSamplerState(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, 1, ((Class200_Sub3) class200_sub3).aBoolean8631 ? 1 : 3);
			((Class_ra_Sub3_Sub2) this).aBooleanArray9862[anInt8325] = ((Class200_Sub3) class200_sub3).aBoolean8631;
		}
		if (((Class_ra_Sub3_Sub2) this).aBooleanArray9856[anInt8325] != ((Class200_Sub3) class200_sub3).aBoolean8632) {
			IDirect3DDevice.SetSamplerState(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, 2, ((Class200_Sub3) class200_sub3).aBoolean8632 ? 1 : 3);
			((Class_ra_Sub3_Sub2) this).aBooleanArray9856[anInt8325] = ((Class200_Sub3) class200_sub3).aBoolean8632;
		}
	}

	void method5492() {
		/* empty */
	}

	public Class123 method5525(String string) {
		byte[] is = method5549(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub1(this, class109);
	}

	public boolean method5425() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.PixelShaderVersion & 0xffff) >= 257);
	}

	Interface9_Impl3 method5478(Class55 class55, int i, int i_118_, int i_119_, boolean bool, byte[] is) {
		return new Class200_Sub1(this, class55, i, i_118_, i_119_, bool, is);
	}

	Interface9_Impl2_Impl1 method5479(Class55 class55, Class77 class77, int i, int i_120_) {
		return new Class200_Sub3_Sub1(this, class55, class77, i, i_120_);
	}

	void method5457() {
		if (fixedFunction) {
			float f = aBoolean8281 ? aFloat8364 : 0.0F;
			float f_121_ = aBoolean8281 ? -aFloat8293 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class_ra_Sub3_Sub2) this).aLong9853, f * aFloat8362, f * aFloat8289, f * aFloat8290, 0.0F);
			D3DLIGHT.SetDiffuse(((Class_ra_Sub3_Sub2) this).aLong9867, f_121_ * aFloat8362, f_121_ * aFloat8289, f_121_ * aFloat8290, 0.0F);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	Interface9_Impl2_Impl1 method5413(Class55 class55, Class77 class77, int i, int i_122_) {
		return new Class200_Sub3_Sub1(this, class55, class77, i, i_122_);
	}

	public void method5480() {
		if (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325]) {
			((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] = false;
			IDirect3DDevice.SetTexture(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, 0L);
			method5444();
			method5372();
		}
	}

	final void method5482(int i, Class183 class183, boolean bool, boolean bool_123_) {
		if (fixedFunction) {
			int i_124_ = 0;
			int i_125_;
			switch (i) {
			case 1:
				i_125_ = 3;
				break;
			default:
				i_125_ = 2;
				break;
			case 2:
				i_125_ = 26;
			}
			if (bool)
				i_124_ |= 0x20;
			if (bool_123_)
				i_124_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, i_125_, (method5547(class183) | i_124_));
		}
	}

	final void method5319(int i, Class183 class183, boolean bool, boolean bool_126_) {
		if (fixedFunction) {
			int i_127_ = 0;
			int i_128_;
			switch (i) {
			case 1:
				i_128_ = 3;
				break;
			default:
				i_128_ = 2;
				break;
			case 2:
				i_128_ = 26;
			}
			if (bool)
				i_127_ |= 0x20;
			if (bool_126_)
				i_127_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, i_128_, (method5547(class183) | i_127_));
		}
	}

	void method5458() {
		if (fixedFunction) {
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9853, -aFloatArray8283[0], -aFloatArray8283[1], -aFloatArray8283[2]);
			D3DLIGHT.SetDirection(((Class_ra_Sub3_Sub2) this).aLong9867, -aFloatArray8248[0], -aFloatArray8248[1], -aFloatArray8248[2]);
			((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		}
	}

	final void method5488() {
		if (fixedFunction)
			IDirect3DDevice.SetRenderState((((Class_ra_Sub3_Sub2) this).aLong9847), 60, anInt8274);
	}

	final void method5489() {
		if (fixedFunction)
			IDirect3DDevice.SetRenderState((((Class_ra_Sub3_Sub2) this).aLong9847), 60, anInt8274);
	}

	void method5490() {
		if (((Class_ra_Sub3_Sub2) this).aLong9849 == 0L && aClass171Array8305[anInt8325] != Class171.aClass171_1742) {
			if (aClass171Array8305[anInt8325] == Class171.aClass171_1741)
				IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 16 + anInt8325, (aClass233Array8304[anInt8325].method2166(((Class_ra_Sub3_Sub2) this).aFloatArray9868)));
			else
				IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 16 + anInt8325, (aClass233Array8304[anInt8325].method2173(((Class_ra_Sub3_Sub2) this).aFloatArray9868)));
			int i = method5548(aClass171Array8305[anInt8325]);
			if (i != ((Class_ra_Sub3_Sub2) this).anIntArray9866[anInt8325]) {
				IDirect3DDevice.SetTextureStageState(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, 24, i);
				((Class_ra_Sub3_Sub2) this).anIntArray9866[anInt8325] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 24, 0);
			((Class_ra_Sub3_Sub2) this).anIntArray9866[anInt8325] = 0;
		}
	}

	void method5491() {
		/* empty */
	}

	public Class123 method5523(String string) {
		byte[] is = method5549(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub1(this, class109);
	}

	void method5463() {
		for (int i = 0; i < anInt8347; i++) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), i, 2, 1);
			((Class_ra_Sub3_Sub2) this).aClass179Array9859[i] = Class179.aClass179_1812;
			boolean[] bools = ((Class_ra_Sub3_Sub2) this).aBooleanArray9862;
			int i_129_ = i;
			((Class_ra_Sub3_Sub2) this).aBooleanArray9856[i] = true;
			bools[i_129_] = true;
			((Class_ra_Sub3_Sub2) this).aBooleanArray9858[i] = false;
			((Class_ra_Sub3_Sub2) this).anIntArray9866[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 9, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 23, 4);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 25, 5);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 24, 0);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 22, 2);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 147, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 145, 1);
		IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 35, 3);
		IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 154, 1.0F);
		D3DLIGHT.SetType(((Class_ra_Sub3_Sub2) this).aLong9853, 3);
		D3DLIGHT.SetType(((Class_ra_Sub3_Sub2) this).aLong9867, 3);
		D3DLIGHT.SetType(((Class_ra_Sub3_Sub2) this).aLong9863, 1);
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 206, 1);
		((Class_ra_Sub3_Sub2) this).aBoolean9854 = false;
		super.method5463();
	}

	void method5494() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8294[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 1, i);
		}
	}

	public void method5061(boolean bool) {
		/* empty */
	}

	void method5496() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8307[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 4, i);
		}
	}

	void method5428() {
		if (fixedFunction) {
			int i = (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] ? method5561(aClass175Array8307[anInt8325]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 4, i);
		}
	}

	final void method5484(int i, Class183 class183, boolean bool) {
		if (fixedFunction) {
			int i_130_ = 0;
			int i_131_;
			switch (i) {
			case 2:
				i_131_ = 27;
				break;
			case 1:
				i_131_ = 6;
				break;
			default:
				i_131_ = 5;
			}
			if (bool)
				i_130_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, i_131_, (method5547(class183) | i_130_));
		}
	}

	void method5333(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 168, i);
	}

	void method5499(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 168, i);
	}

	void method5498(int i) {
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 168, i);
	}

	void method5469() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 15, aBoolean8309);
	}

	void method5501() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 15, aBoolean8309);
	}

	void method5502() {
		switch (aClass174_8268.anInt1764) {
		case 3:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 5);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 6);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 2);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 19, 9);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 20, 2);
			break;
		}
		switch (anInt8366) {
		case 2:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 208, 2);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 207, 1);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 207, 2);
			IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 208, 1);
			break;
		}
	}

	void method5418() {
		aFloat8336 = aFloat8308 - (float) anInt8334;
		aFloat8292 = aFloat8336 - (float) anInt8233;
		if (aFloat8292 < aFloat8261)
			aFloat8292 = aFloat8261;
		if (fixedFunction) {
			IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 36, aFloat8292);
			IDirect3DDevice.a(((Class_ra_Sub3_Sub2) this).aLong9847, 37, aFloat8336);
			IDirect3DDevice.SetRenderState((((Class_ra_Sub3_Sub2) this).aLong9847), 34, anInt8332);
		}
	}

	void method5430() {
		if (fixedFunction)
			IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 28, aBoolean8331 && aBoolean8278 && anInt8233 >= 0);
	}

	void method5504() {
		if (fixedFunction)
			IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 28, aBoolean8331 && aBoolean8278 && anInt8233 >= 0);
	}

	Interface9_Impl1 method5476(int i, boolean bool, int[][] is) {
		return new Class200_Sub2(this, i, bool, is);
	}

	void method5505(boolean bool) {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 161, bool);
	}

	void method5493() {
		/* empty */
	}

	final Interface7_Impl2 method5507(boolean bool) {
		return new Class196(this, Class77.aClass77_718, bool);
	}

	final Interface7_Impl1 method5509(boolean bool) {
		return new Class193(this, bool);
	}

	Class153 method5510(Class181[] class181s) {
		return new Class153_Sub2(this, class181s);
	}

	Interface9_Impl3 method5416(Class55 class55, int i, int i_132_, int i_133_, boolean bool, byte[] is) {
		return new Class200_Sub1(this, class55, i, i_132_, i_133_, bool, is);
	}

	Class153 method5401(Class181[] class181s) {
		return new Class153_Sub2(this, class181s);
	}

	void method5511(Interface7_Impl2 interface7_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub3_Sub2) this).aLong9847, (((Class196) (Class196) interface7_impl2).aLong8590));
	}

	void method5512(Interface7_Impl2 interface7_impl2) {
		IDirect3DDevice.SetIndices(((Class_ra_Sub3_Sub2) this).aLong9847, (((Class196) (Class196) interface7_impl2).aLong8590));
	}

	boolean method5461(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 3, method5546(class55, class77))));
	}

	public Class66 method5142(Class66 class66, Class66 class66_134_, float f, Class66 class66_135_) {
		return f < 0.5F ? class66 : class66_134_;
	}

	public final void method5514(Class187 class187, int i, int i_136_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawPrimitive(((Class_ra_Sub3_Sub2) this).aLong9847, method5567(class187), i, i_136_);
	}

	public final void method5354(Class187 class187, int i, int i_137_, int i_138_, int i_139_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub3_Sub2) this).aLong9847), method5567(class187), 0, i, i_137_, i_138_, i_139_);
	}

	public final void method5449(Class187 class187, int i, int i_140_, int i_141_, int i_142_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub3_Sub2) this).aLong9847), method5567(class187), 0, i, i_140_, i_141_, i_142_);
	}

	boolean method5406(Class55 class55, Class77 class77) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (jagdx.a.f(IDirect3D.GetAdapterDisplayMode(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, d3ddisplaymode)) && jagdx.a.f(IDirect3D.CheckDeviceFormat(((Class_ra_Sub3_Sub2) this).aLong9852, ((Class_ra_Sub3_Sub2) this).anInt9844, ((Class_ra_Sub3_Sub2) this).anInt9871, d3ddisplaymode.Format, 0, 4, method5546(class55, class77))));
	}

	Interface9_Impl2 method5473(int i, int i_143_, boolean bool, int[] is, int i_144_, int i_145_) {
		return new Class200_Sub3(this, i, i_143_, bool, is, i_144_, i_145_);
	}

	void method5518(int i) {
		int i_146_ = (i & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(((Class_ra_Sub3_Sub2) this).aLong9847, 8, i_146_);
	}

	static GraphicsToolkit method5563(Canvas canvas, Interface_ma interface_ma, Class243 class243, Integer integer) {
		Class_ra_Sub3_Sub2 class_ra_sub3_sub2 = null;
		Class_ra_Sub3_Sub2 class_ra_sub3_sub2_147_;
		try {
			int i = 0;
			int i_148_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_148_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			if (!method5551(i, i_148_, l, integer.intValue(), d3dpresent_parameters))
				throw new RuntimeException("");
			int i_149_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_149_ |= 0x10;
			long l_150_ = 0L;
			try {
				l_150_ = IDirect3D.CreateDeviceContext(l, i, i_148_, canvas, i_149_ | 0x40, d3dpresent_parameters);
			} catch (u var_u) {
				l_150_ = IDirect3D.CreateDeviceContext(l, i, i_148_, canvas, i_149_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class_ra_sub3_sub2 = new Class_ra_Sub3_Sub2(i, i_148_, l, l_150_, d3dpresent_parameters, d3dcaps, interface_ma, class243, integer.intValue());
			if (!class_ra_sub3_sub2.aHashtable5313.containsKey(canvas)) {
				Class298_Sub19_Sub3.method3041(canvas, (short) 4620);
				class_ra_sub3_sub2.method5151(canvas, new Class52_Sub2_Sub2_Sub2(class_ra_sub3_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), (byte) -2);
			}
			class_ra_sub3_sub2.method5003(canvas, (byte) -94);
			class_ra_sub3_sub2.method5302();
			class_ra_sub3_sub2_147_ = class_ra_sub3_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class_ra_sub3_sub2 != null)
				class_ra_sub3_sub2.method5023();
			throw runtimeexception;
		}
		return class_ra_sub3_sub2_147_;
	}

	final void method5564(Class200_Sub1 class200_sub1) {
		method5544(class200_sub1);
		if (!((Class_ra_Sub3_Sub2) this).aBooleanArray9862[anInt8325]) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 1, 1);
			((Class_ra_Sub3_Sub2) this).aBooleanArray9862[anInt8325] = true;
		}
		if (!((Class_ra_Sub3_Sub2) this).aBooleanArray9856[anInt8325]) {
			IDirect3DDevice.SetSamplerState((((Class_ra_Sub3_Sub2) this).aLong9847), anInt8325, 2, 1);
			((Class_ra_Sub3_Sub2) this).aBooleanArray9856[anInt8325] = true;
		}
	}

	Interface9_Impl1 method5475(int i, boolean bool, int[][] is) {
		return new Class200_Sub2(this, i, bool, is);
	}

	void method5565(Interface11 interface11) {
		Class298_Sub21 class298_sub21 = method5541(interface11);
		if (class298_sub21 != null)
			class298_sub21.unlink(-1460969981);
	}

	public final void method5516(Class187 class187, int i, int i_151_, int i_152_, int i_153_) {
		if (((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860 != null)
			((Class_ra_Sub3_Sub2) this).aClass110_Sub1_9860.method1229();
		IDirect3DDevice.DrawIndexedPrimitive((((Class_ra_Sub3_Sub2) this).aLong9847), method5567(class187), 0, i, i_151_, i_152_, i_153_);
	}

	Interface9_Impl2_Impl1 method5391(Class55 class55, Class77 class77, int i, int i_154_) {
		return new Class200_Sub3_Sub1(this, class55, class77, i, i_154_);
	}

	void method5395() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 27, aBoolean8245);
	}

	public void method5335(Matrix4f class233) {
		class233.method2144(((Class_ra_Sub3_Sub2) this).aClass233_9861);
	}

	public void method5359() {
		if (((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325]) {
			((Class_ra_Sub3_Sub2) this).aBooleanArray9845[anInt8325] = false;
			IDirect3DDevice.SetTexture(((Class_ra_Sub3_Sub2) this).aLong9847, anInt8325, 0L);
			method5444();
			method5372();
		}
	}

	public Interface8_Impl1_Impl2 method5186(int i, int i_155_) {
		return new Class199(this, Class77.aClass77_719, i, i_155_);
	}

	void method5452() {
		IDirect3DDevice.f(((Class_ra_Sub3_Sub2) this).aLong9847, 14, aBoolean8277 && aBoolean8237);
	}

	public void method5313(Class153 class153) {
		Class153_Sub2 class153_sub2 = (Class153_Sub2) class153;
		IDirect3DDevice.SetVertexDeclaration((((Class_ra_Sub3_Sub2) this).aLong9847), (((Class153_Sub2) class153_sub2).aLong8623));
	}

	public void method5521(int i, Interface7_Impl1 interface7_impl1) {
		Class193 class193 = (Class193) interface7_impl1;
		IDirect3DDevice.SetStreamSource(((Class_ra_Sub3_Sub2) this).aLong9847, i, ((Class193) class193).aLong8584, 0, class193.method1861());
	}

	public Class123 method5522(String string) {
		byte[] is = method5549(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub1(this, class109);
	}

	public void method5520(Matrix4f class233, Matrix4f class233_156_, Matrix4f class233_157_) {
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 256, class233.aFloatArray2594);
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 2, class233_156_.aFloatArray2594);
		IDirect3DDevice.SetTransform(((Class_ra_Sub3_Sub2) this).aLong9847, 3, class233_157_.aFloatArray2594);
	}

	public Class123 method5524(String string) {
		byte[] is = method5549(string);
		if (is == null)
			return null;
		Class109 class109 = method5299(is);
		return new Class123_Sub1(this, class109);
	}

	public float method5396() {
		return -0.5F;
	}

	final void method5566(long l) {
		IDirect3DDevice.SetPixelShader(((Class_ra_Sub3_Sub2) this).aLong9847, l);
	}

	static final int method5567(Class187 class187) {
		switch (class187.anInt1909) {
		case 1:
			return 6;
		case 0:
			return 1;
		case 2:
			return 2;
		case 5:
			return 4;
		case 4:
			return 3;
		case 3:
			return 5;
		default:
			throw new IllegalArgumentException("");
		}
	}

	public boolean method5426() {
		return ((((Class_ra_Sub3_Sub2) this).aD3DCAPS9864.PixelShaderVersion & 0xffff) >= 257);
	}
}
