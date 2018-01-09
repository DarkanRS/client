
/* Class505_Sub2_Sub2 - Decompiled by JODE
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

public class Class505_Sub2_Sub2 extends Class505_Sub2 {
	int anInt10244;
	Class35[] aClass35Array10245;
	long aLong10246 = 0L;
	boolean aBool10247;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10248;
	Class473 aClass473_10249;
	long aLong10250;
	Class115_Sub1 aClass115_Sub1_10251;
	long aLong10252 = 0L;
	long aLong10253;
	boolean aBool10254;
	boolean[] aBoolArray10255;
	boolean[] aBoolArray10256;
	boolean[] aBoolArray10257;
	boolean[] aBoolArray10258;
	long aLong10259;
	int anInt10260;
	Class384 aClass384_10261;
	int anInt10262;
	boolean aBool10263;
	float[] aFloatArray10264;
	boolean aBool10265;
	int[] anIntArray10266;
	D3DCAPS aD3DCAPS10267;
	int anInt10268;
	long aLong10269;
	int anInt10270;
	long[] aLongArray10271;
	static int[] anIntArray10272 = { 77, 80 };
	static int[] anIntArray10273 = { 22, 23 };

	public void method8497() {
		/* empty */
	}

	public boolean method13888() {
		return ((((Class505_Sub2_Sub2) this).aD3DCAPS10267.PixelShaderVersion & 0xffff) >= 257);
	}

	static GraphicalRenderer method15638(Canvas canvas, Interface22 interface22, Index class317, Integer integer) {
		Class505_Sub2_Sub2 class505_sub2_sub2 = null;
		Class505_Sub2_Sub2 class505_sub2_sub2_0_;
		try {
			int i = 0;
			int i_1_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_1_, d3dcaps);
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
			if (!method15656(i, i_1_, l, integer.intValue(), d3dpresent_parameters))
				throw new RuntimeException("");
			int i_2_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_2_ |= 0x10;
			long l_3_ = 0L;
			try {
				l_3_ = IDirect3D.CreateDeviceContext(l, i, i_1_, canvas, i_2_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub1 runtimeexception_sub1) {
				l_3_ = IDirect3D.CreateDeviceContext(l, i, i_1_, canvas, i_2_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class505_sub2_sub2 = new Class505_Sub2_Sub2(i, i_1_, l, l_3_, d3dpresent_parameters, d3dcaps, interface22, class317, integer.intValue());
			if (!class505_sub2_sub2.aHashtable5855.containsKey(canvas)) {
				Class459.method7679(canvas, 902386492);
				class505_sub2_sub2.method8411(canvas, new Class158_Sub2_Sub2_Sub2(class505_sub2_sub2, canvas, canvas.getWidth(), canvas.getHeight(), true), 316223525);
			}
			class505_sub2_sub2.method8412(canvas, (byte) 8);
			class505_sub2_sub2.method14147();
			class505_sub2_sub2_0_ = class505_sub2_sub2;
		} catch (RuntimeException runtimeexception) {
			if (class505_sub2_sub2 != null)
				class505_sub2_sub2.method8397();
			throw runtimeexception;
		}
		return class505_sub2_sub2_0_;
	}

	Class505_Sub2_Sub2(int i, int i_4_, long l, long l_5_, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, Interface22 interface22, Index class317, int i_6_) {
		super(interface22, class317, i_6_, 0);
		((Class505_Sub2_Sub2) this).aClass473_10249 = new Class473();
		((Class505_Sub2_Sub2) this).anInt10262 = 0;
		((Class505_Sub2_Sub2) this).aLong10259 = 0L;
		((Class505_Sub2_Sub2) this).aLong10250 = 0L;
		((Class505_Sub2_Sub2) this).aLong10253 = 0L;
		((Class505_Sub2_Sub2) this).aBool10254 = false;
		((Class505_Sub2_Sub2) this).aFloatArray10264 = new float[16];
		((Class505_Sub2_Sub2) this).anInt10268 = 128;
		((Class505_Sub2_Sub2) this).anInt10270 = 0;
		((Class505_Sub2_Sub2) this).aLongArray10271 = new long[((Class505_Sub2_Sub2) this).anInt10268];
		try {
			((Class505_Sub2_Sub2) this).anInt10260 = i;
			((Class505_Sub2_Sub2) this).anInt10244 = i_4_;
			((Class505_Sub2_Sub2) this).aLong10246 = l;
			((Class505_Sub2_Sub2) this).aLong10252 = l_5_;
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248 = d3dpresent_parameters;
			((Class505_Sub2_Sub2) this).aD3DCAPS10267 = d3dcaps;
			((Class505_Sub2_Sub2) this).aLong10259 = D3DLIGHT.Create();
			((Class505_Sub2_Sub2) this).aLong10250 = D3DLIGHT.Create();
			((Class505_Sub2_Sub2) this).aLong10253 = D3DLIGHT.Create();
			anInt8825 = (((Class505_Sub2_Sub2) this).aD3DCAPS10267.MaxSimultaneousTextures);
			anInt8799 = ((((Class505_Sub2_Sub2) this).aD3DCAPS10267.MaxActiveLights > 0) ? ((Class505_Sub2_Sub2) this).aD3DCAPS10267.MaxActiveLights : 8);
			((Class505_Sub2_Sub2) this).aBool10265 = (((Class505_Sub2_Sub2) this).aD3DCAPS10267.TextureCaps & 0x2) == 0;
			aBool8827 = (((Class505_Sub2_Sub2) this).aD3DCAPS10267.TextureCaps & 0x2000) != 0;
			((Class505_Sub2_Sub2) this).aBool10247 = (((Class505_Sub2_Sub2) this).aD3DCAPS10267.TextureCaps & 0x10000) != 0;
			((Class505_Sub2_Sub2) this).aBool10263 = (((Class505_Sub2_Sub2) this).aD3DCAPS10267.TextureCaps & 0x4000) != 0;
			aBool8718 = true;
			aBool8828 = anInt8709 > 0 || (IDirect3D.CheckDeviceMultiSampleType(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferFormat), true, 2)) == 0;
			((Class505_Sub2_Sub2) this).aBoolArray10255 = new boolean[anInt8825];
			((Class505_Sub2_Sub2) this).aBoolArray10256 = new boolean[anInt8825];
			((Class505_Sub2_Sub2) this).aBoolArray10257 = new boolean[anInt8825];
			((Class505_Sub2_Sub2) this).aClass35Array10245 = new Class35[anInt8825];
			((Class505_Sub2_Sub2) this).aBoolArray10258 = new boolean[anInt8825];
			((Class505_Sub2_Sub2) this).anIntArray10266 = new int[anInt8825];
			Class294 class294 = new Class294();
			class294.method5259(1.0F, -1.0F, 0.5F);
			class294.method5219(0.0F, 0.0F, 0.5F);
			((Class505_Sub2_Sub2) this).aClass384_10261 = new Class384();
			((Class505_Sub2_Sub2) this).aClass384_10261.method6522(class294);
			IDirect3DDevice.BeginScene(((Class505_Sub2_Sub2) this).aLong10252);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method8396(593778067);
			throw new RuntimeException("");
		}
	}

	Interface6 method14141(Class150 class150, Class76 class76, int i, int i_7_) {
		return new Class360_Sub2(this, class150, class76, i, i_7_);
	}

	void method13900() {
		for (Node class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7859(425316532); class282 != null; class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7857((byte) -37)) {
			Class282_Sub9 class282_sub9 = (Class282_Sub9) class282;
			Interface33 interface33 = ((Class282_Sub9) class282_sub9).anInterface33_7538;
			interface33.method212();
		}
		super.method13900();
	}

	boolean method15639() {
		int i = IDirect3DDevice.TestCooperativeLevel(((Class505_Sub2_Sub2) this).aLong10252);
		if (i == 0 || i == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((((Class505_Sub2_Sub2) this).aLong10252), 0L);
			for (int i_8_ = 0; i_8_ < 4; i_8_++)
				IDirect3DDevice.SetRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_8_, 0L);
			for (int i_9_ = 0; i_9_ < 4; i_9_++)
				IDirect3DDevice.SetStreamSource((((Class505_Sub2_Sub2) this).aLong10252), i_9_, 0L, 0, 0);
			for (int i_10_ = 0; i_10_ < 4; i_10_++)
				IDirect3DDevice.SetTexture((((Class505_Sub2_Sub2) this).aLong10252), i_10_, 0L);
			IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, 0L);
			method13900();
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferWidth = 0;
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferHeight = 0;
			if (method15656(((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, ((Class505_Sub2_Sub2) this).aLong10246, anInt8709, (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248))) {
				int i_11_ = IDirect3DDevice.Reset((((Class505_Sub2_Sub2) this).aLong10252), (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248));
				if (Class25.method751(i_11_)) {
					method13899();
					method13897();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	void method13897() {
		for (int i = 0; i < anInt8825; i++) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 2, 1);
			((Class505_Sub2_Sub2) this).aClass35Array10245[i] = Class35.aClass35_382;
			boolean[] bools = ((Class505_Sub2_Sub2) this).aBoolArray10255;
			int i_12_ = i;
			((Class505_Sub2_Sub2) this).aBoolArray10256[i] = true;
			bools[i_12_] = true;
			((Class505_Sub2_Sub2) this).aBoolArray10258[i] = false;
			((Class505_Sub2_Sub2) this).anIntArray10266[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 9, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 23, 4);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 25, 5);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 24, 0);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 22, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 147, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 145, 1);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 35, 3);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 154, 1.0F);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10259, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10250, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10253, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 206, 1);
		((Class505_Sub2_Sub2) this).aBool10254 = false;
		super.method13897();
	}

	public Class168 method8392() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, 0, d3dadapter_identifier);
		return new Class168(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	void method8555(int i, int i_13_) throws Exception_Sub3 {
		IDirect3DDevice.EndScene(((Class505_Sub2_Sub2) this).aLong10252);
		int i_14_ = aClass158_Sub2_5841.method14344();
		if (Class25.method750(i_14_)) {
			if (i_14_ != -2005530520) {
				if (++((Class505_Sub2_Sub2) this).anInt10262 > 50)
					throw new Exception_Sub3();
			} else {
				aClass158_Sub2_5841.method212();
				method15639();
				((Class158_Sub2_Sub2_Sub2) aClass158_Sub2_5841).method210();
			}
		} else
			((Class505_Sub2_Sub2) this).anInt10262 = 0;
		IDirect3DDevice.BeginScene(((Class505_Sub2_Sub2) this).aLong10252);
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-1786216756);
	}

	public void method8395() {
		long l = IDirect3DDevice.CreateEventQuery(((Class505_Sub2_Sub2) this).aLong10252);
		if (Class25.method751(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	final void method15640(Class360 class360) {
		IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, class360.method6245());
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = true;
			method13980();
			method13979();
		}
	}

	public void finalize() {
		super.finalize();
	}

	void method14120() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 14, aBool8755 && aBool8756);
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub3_Sub1(this);
	}

	Class158_Sub2 method8417(Canvas canvas, int i, int i_15_) {
		return new Class158_Sub2_Sub2_Sub2(this, canvas, i, i_15_, false);
	}

	public Interface8 method8419(int i, int i_16_) {
		return new Class307(this, Class76.aClass76_749, i, i_16_);
	}

	Class282_Sub9 method15641(Interface33 interface33) {
		for (Node class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7859(978719918); class282 != null; class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7857((byte) -58)) {
			Class282_Sub9 class282_sub9 = (Class282_Sub9) class282;
			if (((Class282_Sub9) class282_sub9).anInterface33_7538 == interface33)
				return class282_sub9;
		}
		return null;
	}

	void method15642(Interface33 interface33) {
		if (method15641(interface33) == null)
			((Class505_Sub2_Sub2) this).aClass473_10249.method7877(new Class282_Sub9(interface33), 968649327);
	}

	void method15643(Interface33 interface33) {
		Class282_Sub9 class282_sub9 = method15641(interface33);
		if (class282_sub9 != null)
			class282_sub9.unlink(-371378792);
	}

	void method13951() {
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBool10254) {
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 0, false);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 1, false);
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, 0, ((Class505_Sub2_Sub2) this).aLong10259);
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, 1, ((Class505_Sub2_Sub2) this).aLong10250);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 0, true);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 1, true);
			((Class505_Sub2_Sub2) this).aBool10254 = true;
		}
	}

	public void method8491(boolean bool) {
		/* empty */
	}

	public void method13996(Class70 class70) {
		Class70_Sub1 class70_sub1 = (Class70_Sub1) class70;
		IDirect3DDevice.SetVertexDeclaration((((Class505_Sub2_Sub2) this).aLong10252), (((Class70_Sub1) class70_sub1).aLong9179));
	}

	public void ba(int i, int i_17_) {
		IDirect3DDevice.Clear(((Class505_Sub2_Sub2) this).aLong10252, i, i_17_, 1.0F, 0);
	}

	void method13920() {
		if (aClass158_5853 != null)
			IDirect3DDevice.SetViewport(((Class505_Sub2_Sub2) this).aLong10252, anInt8823 + anInt8749, anInt8754 + anInt8776, anInt8751, anInt8752, aFloat8735, aFloat8736);
	}

	void method13921() {
		IDirect3DDevice.SetScissorRect(((Class505_Sub2_Sub2) this).aLong10252, anInt8823 + anInt8743, anInt8754 + anInt8822, anInt8744, anInt8742);
	}

	final void method13968(int i, Class67 class67, boolean bool, boolean bool_18_) {
		if (aBool8692) {
			int i_19_ = 0;
			int i_20_;
			switch (i) {
			case 1:
				i_20_ = 3;
				break;
			case 2:
				i_20_ = 26;
				break;
			default:
				i_20_ = 2;
			}
			if (bool)
				i_19_ |= 0x20;
			if (bool_18_)
				i_19_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, i_20_, method15648(class67) | i_19_);
		}
	}

	boolean method15644() {
		int i = IDirect3DDevice.TestCooperativeLevel(((Class505_Sub2_Sub2) this).aLong10252);
		if (i == 0 || i == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((((Class505_Sub2_Sub2) this).aLong10252), 0L);
			for (int i_21_ = 0; i_21_ < 4; i_21_++)
				IDirect3DDevice.SetRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_21_, 0L);
			for (int i_22_ = 0; i_22_ < 4; i_22_++)
				IDirect3DDevice.SetStreamSource((((Class505_Sub2_Sub2) this).aLong10252), i_22_, 0L, 0, 0);
			for (int i_23_ = 0; i_23_ < 4; i_23_++)
				IDirect3DDevice.SetTexture((((Class505_Sub2_Sub2) this).aLong10252), i_23_, 0L);
			IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, 0L);
			method13900();
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferWidth = 0;
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferHeight = 0;
			if (method15656(((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, ((Class505_Sub2_Sub2) this).aLong10246, anInt8709, (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248))) {
				int i_24_ = IDirect3DDevice.Reset((((Class505_Sub2_Sub2) this).aLong10252), (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248));
				if (Class25.method751(i_24_)) {
					method13899();
					method13897();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	final void method15645(long l) {
		IDirect3DDevice.SetPixelShader(((Class505_Sub2_Sub2) this).aLong10252, l);
	}

	public void method13892(Class384 class384, Class384 class384_25_, Class384 class384_26_) {
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 256, class384.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 2, class384_25_.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 3, class384_26_.aFloatArray4667);
	}

	public void method13933(Class384 class384) {
		class384.method6523(((Class505_Sub2_Sub2) this).aClass384_10261);
	}

	void method13956() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 7, aBool8757);
	}

	void method14054() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 14, aBool8755 && aBool8756);
	}

	public void fi(int i, int i_27_) {
		IDirect3DDevice.Clear(((Class505_Sub2_Sub2) this).aLong10252, i, i_27_, 1.0F, 0);
	}

	final Interface32 method13993(boolean bool) {
		return new Class367(this, Class76.aClass76_752, bool);
	}

	void method13949() {
		if (aBool8692) {
			float f = aBool8759 ? aFloat8770 : 0.0F;
			float f_28_ = aBool8759 ? -aFloat8826 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10259, f * aFloat8766, f * aFloat8767, f * aFloat8768, 0.0F);
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10250, f_28_ * aFloat8766, f_28_ * aFloat8767, f_28_ * aFloat8768, 0.0F);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method13950() {
		if (aBool8692) {
			D3DLIGHT.SetDirection(((Class505_Sub2_Sub2) this).aLong10259, -aFloatArray8747[0], -aFloatArray8747[1], -aFloatArray8747[2]);
			D3DLIGHT.SetDirection(((Class505_Sub2_Sub2) this).aLong10250, -aFloatArray8762[0], -aFloatArray8762[1], -aFloatArray8762[2]);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method13952() {
		method13949();
		method13951();
	}

	public void method8420() {
		/* empty */
	}

	void method13953() {
		int i;
		for (i = 0; i < anInt8773; i++) {
			Class282_Sub24 class282_sub24 = aClass282_Sub24Array8716[i];
			int i_29_ = i + 2;
			int i_30_ = class282_sub24.method12371(-2141155828);
			float f = class282_sub24.method12395(1596693490) / 255.0F;
			D3DLIGHT.SetPosition(((Class505_Sub2_Sub2) this).aLong10253, (float) class282_sub24.method12368((byte) -85), (float) class282_sub24.method12369(1534020223), (float) class282_sub24.method12394(1027065931));
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10253, (float) (i_30_ >> 16 & 0xff) * f, (float) (i_30_ >> 8 & 0xff) * f, (float) (i_30_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class505_Sub2_Sub2) this).aLong10253, 0.0F, 0.0F, 1.0F / (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523)));
			D3DLIGHT.SetRange(((Class505_Sub2_Sub2) this).aLong10253, (float) class282_sub24.method12370(-789603523));
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, i_29_, ((Class505_Sub2_Sub2) this).aLong10253);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, i_29_, true);
		}
		for (/**/; i < anInt8831; i++)
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, i + 2, false);
	}

	public final synchronized void method8487(int i) {
		for (int i_31_ = 0; i_31_ < ((Class505_Sub2_Sub2) this).anInt10270; i_31_++)
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLongArray10271[i_31_]);
		((Class505_Sub2_Sub2) this).anInt10270 = 0;
		super.method8398(i);
	}

	boolean method13955(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 4, method15652(class150, class76))));
	}

	Interface6 method14094(int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		return new Class360_Sub2(this, i, i_32_, bool, is, i_33_, i_34_);
	}

	Interface1 method14077(Class150 class150, int i, int i_35_, int i_36_, boolean bool, byte[] is) {
		return new Class360_Sub1(this, class150, i, i_35_, i_36_, bool, is);
	}

	void method15646(Interface33 interface33) {
		if (method15641(interface33) == null)
			((Class505_Sub2_Sub2) this).aClass473_10249.method7877(new Class282_Sub9(interface33), 2118289464);
	}

	Interface6 method13961(Class150 class150, int i, int i_37_, boolean bool, float[] fs, int i_38_, int i_39_) {
		return new Class360_Sub2(this, class150, i, i_37_, bool, fs, i_38_, i_39_);
	}

	void method14188() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 4, i);
		}
	}

	Interface31 method14034(int i, boolean bool, int[][] is) {
		return new Class360_Sub3(this, i, bool, is);
	}

	Interface1 method13962(Class150 class150, int i, int i_40_, int i_41_, boolean bool, byte[] is) {
		return new Class360_Sub1(this, class150, i, i_40_, i_41_, bool, is);
	}

	Interface1 method13917(Class150 class150, int i, int i_42_, int i_43_, boolean bool, byte[] is) {
		return new Class360_Sub1(this, class150, i, i_42_, i_43_, bool, is);
	}

	final void method15647(Class360_Sub2 class360_sub2) {
		method15662(class360_sub2);
		if (((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780] != ((Class360_Sub2) class360_sub2).aBool9156) {
			IDirect3DDevice.SetSamplerState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 1, ((Class360_Sub2) class360_sub2).aBool9156 ? 1 : 3);
			((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780] = ((Class360_Sub2) class360_sub2).aBool9156;
		}
		if (((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780] != ((Class360_Sub2) class360_sub2).aBool9155) {
			IDirect3DDevice.SetSamplerState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 2, ((Class360_Sub2) class360_sub2).aBool9155 ? 1 : 3);
			((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780] = ((Class360_Sub2) class360_sub2).aBool9155;
		}
	}

	public void method14212(Class70 class70) {
		Class70_Sub1 class70_sub1 = (Class70_Sub1) class70;
		IDirect3DDevice.SetVertexDeclaration((((Class505_Sub2_Sub2) this).aLong10252), (((Class70_Sub1) class70_sub1).aLong9179));
	}

	void method8485() {
		super.method8397();
		if (((Class505_Sub2_Sub2) this).aLong10259 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10259);
			((Class505_Sub2_Sub2) this).aLong10259 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10250 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10250);
			((Class505_Sub2_Sub2) this).aLong10250 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10253 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10253);
			((Class505_Sub2_Sub2) this).aLong10253 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10252 != 0L) {
			IDirect3DDevice.Destroy(((Class505_Sub2_Sub2) this).aLong10252);
			((Class505_Sub2_Sub2) this).aLong10252 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10246 != 0L) {
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLong10246);
			((Class505_Sub2_Sub2) this).aLong10246 = 0L;
		}
	}

	void method14226() {
		if (((Class505_Sub2_Sub2) this).aLong10269 == 0L && aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			if (aClass37Array8783[anInt8780] == Class37.aClass37_388)
				IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 16 + anInt8780, (aClass384Array8782[anInt8780].method6548(((Class505_Sub2_Sub2) this).aFloatArray10264)));
			else
				IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 16 + anInt8780, (aClass384Array8782[anInt8780].method6517(((Class505_Sub2_Sub2) this).aFloatArray10264)));
			int i = method15667(aClass37Array8783[anInt8780]);
			if (i != ((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780]) {
				IDirect3DDevice.SetTextureStageState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 24, i);
				((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 24, 0);
			((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780] = 0;
		}
	}

	void method13978() {
		/* empty */
	}

	void method13979() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 1, i);
		}
	}

	void method13980() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 4, i);
		}
	}

	void method14119() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 7, aBool8757);
	}

	final void method13970(int i, Class67 class67, boolean bool) {
		if (aBool8692) {
			int i_44_ = 0;
			int i_45_;
			switch (i) {
			default:
				i_45_ = 5;
				break;
			case 2:
				i_45_ = 27;
				break;
			case 1:
				i_45_ = 6;
			}
			if (bool)
				i_44_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, i_45_, method15648(class67) | i_44_);
		}
	}

	final void method13987() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 60, anInt8758);
	}

	void method14183() {
		if (((Class505_Sub2_Sub2) this).aLong10269 == 0L && aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			if (aClass37Array8783[anInt8780] == Class37.aClass37_388)
				IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 16 + anInt8780, (aClass384Array8782[anInt8780].method6548(((Class505_Sub2_Sub2) this).aFloatArray10264)));
			else
				IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 16 + anInt8780, (aClass384Array8782[anInt8780].method6517(((Class505_Sub2_Sub2) this).aFloatArray10264)));
			int i = method15667(aClass37Array8783[anInt8780]);
			if (i != ((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780]) {
				IDirect3DDevice.SetTextureStageState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 24, i);
				((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 24, 0);
			((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780] = 0;
		}
	}

	static final int method15648(Class67 class67) {
		switch (class67.anInt681) {
		case 3:
			return 1;
		case 2:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 1:
			return 0;
		case 0:
			return 3;
		}
	}

	void method13982() {
		int i;
		for (i = 0; i < anInt8773; i++) {
			Class282_Sub24 class282_sub24 = aClass282_Sub24Array8716[i];
			int i_46_ = i + 2;
			int i_47_ = class282_sub24.method12371(-2135463998);
			float f = class282_sub24.method12395(-2014514150) / 255.0F;
			D3DLIGHT.SetPosition(((Class505_Sub2_Sub2) this).aLong10253, (float) class282_sub24.method12368((byte) 11), (float) class282_sub24.method12369(1534020223), (float) class282_sub24.method12394(1899159240));
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10253, (float) (i_47_ >> 16 & 0xff) * f, (float) (i_47_ >> 8 & 0xff) * f, (float) (i_47_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class505_Sub2_Sub2) this).aLong10253, 0.0F, 0.0F, 1.0F / (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523)));
			D3DLIGHT.SetRange(((Class505_Sub2_Sub2) this).aLong10253, (float) class282_sub24.method12370(-789603523));
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, i_46_, ((Class505_Sub2_Sub2) this).aLong10253);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, i_46_, true);
		}
		for (/**/; i < anInt8831; i++)
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, i + 2, false);
	}

	void method13986(int i) {
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 168, i);
	}

	void method14238() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 15, aBool8818);
	}

	void method13894() {
		switch (aClass73_8733.anInt729) {
		case 2:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 2);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 6);
			break;
		}
		switch (anInt8844) {
		case 1:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 2);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 1);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 2);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 2);
			break;
		}
	}

	static final int method15649(Class68 class68) {
		switch (class68.anInt686) {
		case 1:
			return 10;
		default:
			throw new IllegalArgumentException();
		case 4:
			return 4;
		case 2:
			return 2;
		case 0:
			return 7;
		case 3:
			return 26;
		}
	}

	void method14019() {
		IDirect3DDevice.SetScissorRect(((Class505_Sub2_Sub2) this).aLong10252, anInt8823 + anInt8743, anInt8754 + anInt8822, anInt8744, anInt8742);
	}

	void method14013() {
		aFloat8819 = aFloat8697 - (float) anInt8680;
		aFloat8813 = aFloat8819 - (float) anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;
		if (aBool8692) {
			IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 36, aFloat8813);
			IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 37, aFloat8819);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 34, anInt8810);
		}
	}

	synchronized void method15650(long l) {
		if (((Class505_Sub2_Sub2) this).anInt10270 == ((Class505_Sub2_Sub2) this).anInt10268) {
			((Class505_Sub2_Sub2) this).anInt10268 *= 2;
			long[] ls = new long[((Class505_Sub2_Sub2) this).anInt10268];
			System.arraycopy(((Class505_Sub2_Sub2) this).aLongArray10271, 0, ls, 0, ((Class505_Sub2_Sub2) this).anInt10270);
			((Class505_Sub2_Sub2) this).aLongArray10271 = ls;
		}
		((Class505_Sub2_Sub2) this).aLongArray10271[((Class505_Sub2_Sub2) this).anInt10270] = l;
		((Class505_Sub2_Sub2) this).anInt10270++;
	}

	boolean method13954(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 3, method15652(class150, class76))));
	}

	void method14204() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 137, aBool8684 && !aBool8760);
	}

	Class70 method13995(Class72[] class72s) {
		return new Class70_Sub1(this, class72s);
	}

	public float method13905() {
		return -0.5F;
	}

	public void method14161(int i, Interface4 interface4) {
		Class300 class300 = (Class300) interface4;
		IDirect3DDevice.SetStreamSource(((Class505_Sub2_Sub2) this).aLong10252, i, ((Class300) class300).aLong3549, 0, class300.method5317());
	}

	void method13997(Interface32 interface32) {
		IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, (((Class367) (Class367) interface32).aLong4238));
	}

	public final void method13923(Class352 class352, int i, int i_48_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawPrimitive(((Class505_Sub2_Sub2) this).aLong10252, method15654(class352), i, i_48_);
	}

	public final void method14002(Class352 class352, int i, int i_49_, int i_50_, int i_51_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawIndexedPrimitive((((Class505_Sub2_Sub2) this).aLong10252), method15654(class352), 0, i, i_49_, i_50_, i_51_);
	}

	byte[] method15651(String string) {
		return method14075("dx", string);
	}

	public Class101 method13890(String string) {
		byte[] is = method15651(string);
		if (is == null)
			return null;
		Class114 class114 = method13891(is);
		return new Class101_Sub2(this, class114);
	}

	public final synchronized void method8398(int i) {
		for (int i_52_ = 0; i_52_ < ((Class505_Sub2_Sub2) this).anInt10270; i_52_++)
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLongArray10271[i_52_]);
		((Class505_Sub2_Sub2) this).anInt10270 = 0;
		super.method8398(i);
	}

	static final int method15652(Class150 class150, Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 4:
			switch (class150.anInt1958 * -1436290903) {
			case 6:
				return 21;
			case 5:
				return 22;
			case 8:
				return 77;
			case 1:
				return 28;
			case 7:
				return Class27.anInt345 * 154791573;
			case 0:
				return 50;
			case 9:
				return Class27.anInt346 * 15254207;
			case 4:
				return 51;
			default:
				break;
			}
			break;
		case 3:
			if (class150 == Class150.aClass150_1949)
				return 116;
			break;
		case 8:
			if (class150 == Class150.aClass150_1949)
				return 113;
			break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method15653(Class76 class76) {
		if (class76 == Class76.aClass76_752)
			return 80;
		if (class76 == Class76.aClass76_749)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method15654(Class352 class352) {
		switch (class352.anInt4101) {
		case 0:
			return 3;
		case 3:
			return 6;
		case 1:
			return 2;
		case 4:
			return 4;
		case 2:
			return 5;
		case 5:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	byte[] method15655(String string) {
		return method14075("dx", string);
	}

	static boolean method15656(int i, int i_53_, long l, int i_54_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (Class25.method750(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_179_: for (/**/; i_54_ >= 0; i_54_--) {
				if (i_54_ != 1) {
					i_57_ = 0 + i_54_;
					for (int i_58_ = 0; i_58_ < anIntArray10273.length; i_58_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_53_, d3ddisplaymode.Format, anIntArray10273[i_58_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_53_, (d3ddisplaymode.Format), 1, 1, (anIntArray10273[i_58_])) == 0 && (i_54_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_53_, anIntArray10273[i_58_], true, i_57_)) == 0)) {
							for (int i_59_ = 0; i_59_ < anIntArray10272.length; i_59_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_53_, d3ddisplaymode.Format, 2, 1, anIntArray10272[i_59_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_53_, d3ddisplaymode.Format, anIntArray10273[i_58_], anIntArray10272[i_59_])) == 0 && (i_54_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_53_, anIntArray10272[i_58_], true, i_57_)) == 0)) {
									i_56_ = anIntArray10273[i_58_];
									i_55_ = anIntArray10272[i_59_];
									break while_179_;
								}
							}
						}
					}
				}
			}
			if (i_54_ < 0 || i_56_ == 0 || i_55_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_56_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_55_;
			d3dpresent_parameters.MultiSampleType = i_57_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	final void method15657(Class360_Sub1 class360_sub1) {
		method15662(class360_sub1);
		if (!((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780]) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 1, 1);
			((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780] = true;
		}
		if (!((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780]) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 2, 1);
			((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780] = true;
		}
	}

	void method14098(int i) {
		int i_60_ = (i & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 8, i_60_);
	}

	void method14205() {
		if (aClass158_5853 != null)
			IDirect3DDevice.SetViewport(((Class505_Sub2_Sub2) this).aLong10252, anInt8823 + anInt8749, anInt8754 + anInt8776, anInt8751, anInt8752, aFloat8735, aFloat8736);
	}

	void method13992(boolean bool) {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 161, bool);
	}

	final void method15658(Class360_Sub1 class360_sub1) {
		method15662(class360_sub1);
		if (!((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780]) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 1, 1);
			((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780] = true;
		}
		if (!((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780]) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 2, 1);
			((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780] = true;
		}
	}

	final void method15659(Class360 class360) {
		IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, class360.method6245());
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = true;
			method13980();
			method13979();
		}
	}

	void method8531() {
		super.method8397();
		if (((Class505_Sub2_Sub2) this).aLong10259 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10259);
			((Class505_Sub2_Sub2) this).aLong10259 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10250 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10250);
			((Class505_Sub2_Sub2) this).aLong10250 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10253 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10253);
			((Class505_Sub2_Sub2) this).aLong10253 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10252 != 0L) {
			IDirect3DDevice.Destroy(((Class505_Sub2_Sub2) this).aLong10252);
			((Class505_Sub2_Sub2) this).aLong10252 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10246 != 0L) {
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLong10246);
			((Class505_Sub2_Sub2) this).aLong10246 = 0L;
		}
	}

	void method14121() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 137, aBool8684 && !aBool8760);
	}

	static final int method15660(Class67 class67) {
		switch (class67.anInt681) {
		case 3:
			return 1;
		case 2:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 1:
			return 0;
		case 0:
			return 3;
		}
	}

	void method13916() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 4, i);
		}
	}

	Interface6 method14008(int i, int i_61_, boolean bool, int[] is, int i_62_, int i_63_) {
		return new Class360_Sub2(this, i, i_61_, bool, is, i_62_, i_63_);
	}

	void method14197() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 15, aBool8818);
	}

	void method13948() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(((Class505_Sub2_Sub2) this).aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	public void method8507() {
		/* empty */
	}

	void method8596(int i, int i_64_) throws Exception_Sub3 {
		IDirect3DDevice.EndScene(((Class505_Sub2_Sub2) this).aLong10252);
		int i_65_ = aClass158_Sub2_5841.method14344();
		if (Class25.method750(i_65_)) {
			if (i_65_ != -2005530520) {
				if (++((Class505_Sub2_Sub2) this).anInt10262 > 50)
					throw new Exception_Sub3();
			} else {
				aClass158_Sub2_5841.method212();
				method15639();
				((Class158_Sub2_Sub2_Sub2) aClass158_Sub2_5841).method210();
			}
		} else
			((Class505_Sub2_Sub2) this).anInt10262 = 0;
		IDirect3DDevice.BeginScene(((Class505_Sub2_Sub2) this).aLong10252);
		if (anInterface22_5834 != null)
			anInterface22_5834.method161(-2073019355);
	}

	static final int method15661(Class68 class68) {
		switch (class68.anInt686) {
		case 1:
			return 10;
		default:
			throw new IllegalArgumentException();
		case 4:
			return 4;
		case 2:
			return 2;
		case 0:
			return 7;
		case 3:
			return 26;
		}
	}

	public void fd(int i, int i_66_) {
		IDirect3DDevice.Clear(((Class505_Sub2_Sub2) this).aLong10252, i, i_66_, 1.0F, 0);
	}

	public void fu(int i, int i_67_) {
		IDirect3DDevice.Clear(((Class505_Sub2_Sub2) this).aLong10252, i, i_67_, 1.0F, 0);
	}

	void method14236(int i) {
		int i_68_ = (i & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 8, i_68_);
	}

	Interface6 method14143(Class150 class150, int i, int i_69_, boolean bool, byte[] is, int i_70_, int i_71_) {
		return new Class360_Sub2(this, class150, i, i_69_, bool, is, i_70_, i_71_);
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub3_Sub1(this);
	}

	void method8550() {
		super.finalize();
	}

	void method8622() {
		super.finalize();
	}

	final void method15662(Class360 class360) {
		IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, class360.method6245());
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = true;
			method13980();
			method13979();
		}
	}

	public final synchronized void method8488(int i) {
		for (int i_72_ = 0; i_72_ < ((Class505_Sub2_Sub2) this).anInt10270; i_72_++)
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLongArray10271[i_72_]);
		((Class505_Sub2_Sub2) this).anInt10270 = 0;
		super.method8398(i);
	}

	public Class152 method8557(Class152 class152, Class152 class152_73_, float f, Class152 class152_74_) {
		return f < 0.5F ? class152 : class152_73_;
	}

	public int[] kf(int i, int i_75_, int i_76_, int i_77_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class505_Sub2_Sub2) this).aLong10252, 0);
		long l_78_ = IDirect3DDevice.CreateRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_76_, i_77_, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect(((Class505_Sub2_Sub2) this).aLong10252, l, i, i_75_, i_76_, i_77_, l_78_, 0, 0, i_76_, i_77_, 1))) {
			is = new int[i_76_ * i_77_];
			IDirect3DSurface.Download(l_78_, 0, 0, i_76_, i_77_, i_76_ * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_78_);
		return is;
	}

	static final int method15663(Class76 class76) {
		if (class76 == Class76.aClass76_752)
			return 80;
		if (class76 == Class76.aClass76_749)
			return 77;
		throw new IllegalArgumentException("");
	}

	public boolean method14045() {
		return ((((Class505_Sub2_Sub2) this).aD3DCAPS10267.PixelShaderVersion & 0xffff) >= 257);
	}

	public Class101 method14049(String string) {
		byte[] is = method15651(string);
		if (is == null)
			return null;
		Class114 class114 = method13891(is);
		return new Class101_Sub2(this, class114);
	}

	public void method14056(Class384 class384, Class384 class384_79_, Class384 class384_80_) {
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 256, class384.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 2, class384_79_.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 3, class384_80_.aFloatArray4667);
	}

	public void method14057(Class384 class384, Class384 class384_81_, Class384 class384_82_) {
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 256, class384.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 2, class384_81_.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 3, class384_82_.aFloatArray4667);
	}

	public void method14058(Class384 class384, Class384 class384_83_, Class384 class384_84_) {
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 256, class384.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 2, class384_83_.aFloatArray4667);
		IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 3, class384_84_.aFloatArray4667);
	}

	void method14051() {
		for (int i = 0; i < anInt8825; i++) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 2, 1);
			((Class505_Sub2_Sub2) this).aClass35Array10245[i] = Class35.aClass35_382;
			boolean[] bools = ((Class505_Sub2_Sub2) this).aBoolArray10255;
			int i_85_ = i;
			((Class505_Sub2_Sub2) this).aBoolArray10256[i] = true;
			bools[i_85_] = true;
			((Class505_Sub2_Sub2) this).aBoolArray10258[i] = false;
			((Class505_Sub2_Sub2) this).anIntArray10266[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 9, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 23, 4);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 25, 5);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 24, 0);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 22, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 147, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 145, 1);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 35, 3);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 154, 1.0F);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10259, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10250, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10253, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 206, 1);
		((Class505_Sub2_Sub2) this).aBool10254 = false;
		super.method13897();
	}

	void method13929() {
		for (int i = 0; i < anInt8825; i++) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 2, 1);
			((Class505_Sub2_Sub2) this).aClass35Array10245[i] = Class35.aClass35_382;
			boolean[] bools = ((Class505_Sub2_Sub2) this).aBoolArray10255;
			int i_86_ = i;
			((Class505_Sub2_Sub2) this).aBoolArray10256[i] = true;
			bools[i_86_] = true;
			((Class505_Sub2_Sub2) this).aBoolArray10258[i] = false;
			((Class505_Sub2_Sub2) this).anIntArray10266[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 9, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 23, 4);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 25, 5);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 24, 0);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 22, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 147, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 145, 1);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 35, 3);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 154, 1.0F);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10259, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10250, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10253, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 206, 1);
		((Class505_Sub2_Sub2) this).aBool10254 = false;
		super.method13897();
	}

	void method14041() {
		for (int i = 0; i < anInt8825; i++) {
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class505_Sub2_Sub2) this).aLong10252), i, 2, 1);
			((Class505_Sub2_Sub2) this).aClass35Array10245[i] = Class35.aClass35_382;
			boolean[] bools = ((Class505_Sub2_Sub2) this).aBoolArray10255;
			int i_87_ = i;
			((Class505_Sub2_Sub2) this).aBoolArray10256[i] = true;
			bools[i_87_] = true;
			((Class505_Sub2_Sub2) this).aBoolArray10258[i] = false;
			((Class505_Sub2_Sub2) this).anIntArray10266[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 9, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 23, 4);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 25, 5);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 24, 0);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 22, 2);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 147, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 145, 1);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 35, 3);
		IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 154, 1.0F);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10259, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10250, 3);
		D3DLIGHT.SetType(((Class505_Sub2_Sub2) this).aLong10253, 1);
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 206, 1);
		((Class505_Sub2_Sub2) this).aBool10254 = false;
		super.method13897();
	}

	void method14089() {
		for (Node class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7859(1708563028); class282 != null; class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7857((byte) -65)) {
			Class282_Sub9 class282_sub9 = (Class282_Sub9) class282;
			Interface33 interface33 = ((Class282_Sub9) class282_sub9).anInterface33_7538;
			interface33.method212();
		}
		super.method13900();
	}

	static final int method15664(Class67 class67) {
		switch (class67.anInt681) {
		case 3:
			return 1;
		case 2:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 1:
			return 0;
		case 0:
			return 3;
		}
	}

	public float method14091() {
		return -0.5F;
	}

	void method14087() {
		if (aClass158_5853 != null)
			IDirect3DDevice.SetViewport(((Class505_Sub2_Sub2) this).aLong10252, anInt8823 + anInt8749, anInt8754 + anInt8776, anInt8751, anInt8752, aFloat8735, aFloat8736);
	}

	public Interface8 method8621(int i, int i_88_) {
		return new Class307(this, Class76.aClass76_749, i, i_88_);
	}

	void method14088() {
		IDirect3DDevice.SetScissorRect(((Class505_Sub2_Sub2) this).aLong10252, anInt8823 + anInt8743, anInt8754 + anInt8822, anInt8744, anInt8742);
	}

	public final void method14228(Class352 class352, int i, int i_89_, int i_90_, int i_91_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawIndexedPrimitive((((Class505_Sub2_Sub2) this).aLong10252), method15654(class352), 0, i, i_89_, i_90_, i_91_);
	}

	void method13909() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 174, aBool8843);
	}

	public void method14107(Class384 class384) {
		class384.method6523(((Class505_Sub2_Sub2) this).aClass384_10261);
	}

	void method13924() {
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBool10254) {
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 0, false);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 1, false);
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, 0, ((Class505_Sub2_Sub2) this).aLong10259);
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, 1, ((Class505_Sub2_Sub2) this).aLong10250);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 0, true);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 1, true);
			((Class505_Sub2_Sub2) this).aBool10254 = true;
		}
	}

	void method14092(boolean bool) {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 161, bool);
	}

	void method14169() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 14, aBool8755 && aBool8756);
	}

	public void method8483() {
		long l = IDirect3DDevice.CreateEventQuery(((Class505_Sub2_Sub2) this).aLong10252);
		if (Class25.method751(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	void method14122() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 137, aBool8684 && !aBool8760);
	}

	void method14025() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 137, aBool8684 && !aBool8760);
	}

	void method14117() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 137, aBool8684 && !aBool8760);
	}

	void method14124() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(((Class505_Sub2_Sub2) this).aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method14125() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(((Class505_Sub2_Sub2) this).aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method14026() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(((Class505_Sub2_Sub2) this).aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method14127() {
		if (aBool8692) {
			float f = aBool8759 ? aFloat8770 : 0.0F;
			float f_92_ = aBool8759 ? -aFloat8826 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10259, f * aFloat8766, f * aFloat8767, f * aFloat8768, 0.0F);
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10250, f_92_ * aFloat8766, f_92_ * aFloat8767, f_92_ * aFloat8768, 0.0F);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method13915() {
		if (aBool8692) {
			D3DLIGHT.SetDirection(((Class505_Sub2_Sub2) this).aLong10259, -aFloatArray8747[0], -aFloatArray8747[1], -aFloatArray8747[2]);
			D3DLIGHT.SetDirection(((Class505_Sub2_Sub2) this).aLong10250, -aFloatArray8762[0], -aFloatArray8762[1], -aFloatArray8762[2]);
			((Class505_Sub2_Sub2) this).aBool10254 = false;
		}
	}

	void method15665(Interface33 interface33) {
		Class282_Sub9 class282_sub9 = method15641(interface33);
		if (class282_sub9 != null)
			class282_sub9.unlink(-371378792);
	}

	void method13913() {
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBool10254) {
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 0, false);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 1, false);
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, 0, ((Class505_Sub2_Sub2) this).aLong10259);
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, 1, ((Class505_Sub2_Sub2) this).aLong10250);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 0, true);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, 1, true);
			((Class505_Sub2_Sub2) this).aBool10254 = true;
		}
	}

	public Class152 method8467(Class152 class152, Class152 class152_93_, float f, Class152 class152_94_) {
		return f < 0.5F ? class152 : class152_93_;
	}

	Class158_Sub2 method8558(Canvas canvas, int i, int i_95_) {
		return new Class158_Sub2_Sub2_Sub2(this, canvas, i, i_95_, false);
	}

	void method14132() {
		int i;
		for (i = 0; i < anInt8773; i++) {
			Class282_Sub24 class282_sub24 = aClass282_Sub24Array8716[i];
			int i_96_ = i + 2;
			int i_97_ = class282_sub24.method12371(-2144308312);
			float f = class282_sub24.method12395(-747591590) / 255.0F;
			D3DLIGHT.SetPosition(((Class505_Sub2_Sub2) this).aLong10253, (float) class282_sub24.method12368((byte) -50), (float) class282_sub24.method12369(1534020223), (float) class282_sub24.method12394(1436724778));
			D3DLIGHT.SetDiffuse(((Class505_Sub2_Sub2) this).aLong10253, (float) (i_97_ >> 16 & 0xff) * f, (float) (i_97_ >> 8 & 0xff) * f, (float) (i_97_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class505_Sub2_Sub2) this).aLong10253, 0.0F, 0.0F, 1.0F / (float) (class282_sub24.method12370(-789603523) * class282_sub24.method12370(-789603523)));
			D3DLIGHT.SetRange(((Class505_Sub2_Sub2) this).aLong10253, (float) class282_sub24.method12370(-789603523));
			IDirect3DDevice.SetLight(((Class505_Sub2_Sub2) this).aLong10252, i_96_, ((Class505_Sub2_Sub2) this).aLong10253);
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, i_96_, true);
		}
		for (/**/; i < anInt8831; i++)
			IDirect3DDevice.LightEnable(((Class505_Sub2_Sub2) this).aLong10252, i + 2, false);
	}

	Interface6 method14048(int i, int i_98_, boolean bool, int[] is, int i_99_, int i_100_) {
		return new Class360_Sub2(this, i, i_98_, bool, is, i_99_, i_100_);
	}

	boolean method14134(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 3, method15652(class150, class76))));
	}

	boolean method14136(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 3, method15652(class150, class76))));
	}

	boolean method13975(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 3, method15652(class150, class76))));
	}

	boolean method14137(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 3, method15652(class150, class76))));
	}

	public int[] kh(int i, int i_101_, int i_102_, int i_103_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class505_Sub2_Sub2) this).aLong10252, 0);
		long l_104_ = IDirect3DDevice.CreateRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_102_, i_103_, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect(((Class505_Sub2_Sub2) this).aLong10252, l, i, i_101_, i_102_, i_103_, l_104_, 0, 0, i_102_, i_103_, 1))) {
			is = new int[i_102_ * i_103_];
			IDirect3DSurface.Download(l_104_, 0, 0, i_102_, i_103_, i_102_ * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_104_);
		return is;
	}

	public void method8480(boolean bool) {
		/* empty */
	}

	Interface6 method14142(Class150 class150, Class76 class76, int i, int i_105_) {
		return new Class360_Sub2(this, class150, class76, i, i_105_);
	}

	Interface6 method14216(Class150 class150, Class76 class76, int i, int i_106_) {
		return new Class360_Sub2(this, class150, class76, i, i_106_);
	}

	final void method15666(long l) {
		((Class505_Sub2_Sub2) this).aLong10269 = l;
		IDirect3DDevice.SetVertexShader(((Class505_Sub2_Sub2) this).aLong10252, l);
	}

	void method14172() {
		method13949();
		method13951();
	}

	Interface6 method14145(Class150 class150, int i, int i_107_, boolean bool, float[] fs, int i_108_, int i_109_) {
		return new Class360_Sub2(this, class150, i, i_107_, bool, fs, i_108_, i_109_);
	}

	public Class168 method8481() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, 0, d3dadapter_identifier);
		return new Class168(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	void method13899() {
		for (Node class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7859(1831958057); class282 != null; class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7857((byte) -3)) {
			Class282_Sub9 class282_sub9 = (Class282_Sub9) class282;
			Interface33 interface33 = ((Class282_Sub9) class282_sub9).anInterface33_7538;
			interface33.method210();
			if (interface33 == aClass158_5853)
				interface33.method213();
		}
		super.method13899();
	}

	public void method14153() {
		if (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = false;
			IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 0L);
			method13980();
			method13979();
		}
	}

	void method14217(Interface32 interface32) {
		IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, (((Class367) (Class367) interface32).aLong4238));
	}

	Interface29 method14022(Class150 class150, Class76 class76, int i, int i_110_) {
		return new Class360_Sub2_Sub1(this, class150, class76, i, i_110_);
	}

	Interface29 method14148(Class150 class150, Class76 class76, int i, int i_111_) {
		return new Class360_Sub2_Sub1(this, class150, class76, i, i_111_);
	}

	Interface29 method14149(Class150 class150, Class76 class76, int i, int i_112_) {
		return new Class360_Sub2_Sub1(this, class150, class76, i, i_112_);
	}

	void method13922() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 174, aBool8843);
	}

	public void method14154() {
		if (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = false;
			IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 0L);
			method13980();
			method13979();
		}
	}

	final void method14224(int i, Class67 class67, boolean bool, boolean bool_113_) {
		if (aBool8692) {
			int i_114_ = 0;
			int i_115_;
			switch (i) {
			case 1:
				i_115_ = 3;
				break;
			case 2:
				i_115_ = 26;
				break;
			default:
				i_115_ = 2;
			}
			if (bool)
				i_114_ |= 0x20;
			if (bool_113_)
				i_114_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, i_115_, (method15648(class67) | i_114_));
		}
	}

	final void method14162(int i, Class67 class67, boolean bool, boolean bool_116_) {
		if (aBool8692) {
			int i_117_ = 0;
			int i_118_;
			switch (i) {
			case 1:
				i_118_ = 3;
				break;
			case 2:
				i_118_ = 26;
				break;
			default:
				i_118_ = 2;
			}
			if (bool)
				i_117_ |= 0x20;
			if (bool_116_)
				i_117_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, i_118_, (method15648(class67) | i_117_));
		}
	}

	final void method14166(int i, Class67 class67, boolean bool) {
		if (aBool8692) {
			int i_119_ = 0;
			int i_120_;
			switch (i) {
			default:
				i_120_ = 5;
				break;
			case 2:
				i_120_ = 27;
				break;
			case 1:
				i_120_ = 6;
			}
			if (bool)
				i_119_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, i_120_, (method15648(class67) | i_119_));
		}
	}

	final void method14179() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 60, anInt8758);
	}

	final void method14180() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 60, anInt8758);
	}

	void method13991() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 28, (aBool8809 && aBool8808 && anInt8811 >= 0));
	}

	final void method14181() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 60, anInt8758);
	}

	static final int method15667(Class37 class37) {
		switch (class37.anInt390) {
		case 1:
			return 2;
		case 4:
			return 256;
		case 2:
			return 1;
		case 5:
			return 4;
		case 3:
			return 3;
		default:
			return 0;
		}
	}

	void method13945() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 15, aBool8818);
	}

	void method14184() {
		/* empty */
	}

	void method14185() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 1, i);
		}
	}

	void method14186() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 1, i);
		}
	}

	void method14187() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 1, i);
		}
	}

	void method14173(Interface32 interface32) {
		IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, (((Class367) (Class367) interface32).aLong4238));
	}

	boolean method14135(Class150 class150, Class76 class76) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class25.method751(IDirect3D.GetAdapterDisplayMode(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, d3ddisplaymode)) && Class25.method751(IDirect3D.CheckDeviceFormat(((Class505_Sub2_Sub2) this).aLong10246, ((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, d3ddisplaymode.Format, 0, 3, method15652(class150, class76))));
	}

	void method14190() {
		if (aBool8692) {
			int i = (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 4, i);
		}
	}

	public boolean method14146() {
		return ((((Class505_Sub2_Sub2) this).aD3DCAPS10267.VertexShaderVersion & 0xffff) >= 257);
	}

	final void method14063() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 60, anInt8758);
	}

	void method14020() {
		switch (aClass73_8733.anInt729) {
		case 2:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 2);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 6);
			break;
		}
		switch (anInt8844) {
		case 1:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 2);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 1);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 2);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 2);
			break;
		}
	}

	void method14199() {
		switch (aClass73_8733.anInt729) {
		case 2:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 2);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 20, 6);
			break;
		}
		switch (anInt8844) {
		case 1:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 2);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 1);
			break;
		case 0:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 1);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 207, 2);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 208, 2);
			break;
		}
	}

	void method14200() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 27, aBool8817);
	}

	void method13914() {
		IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 27, aBool8817);
	}

	void method14203() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 28, (aBool8809 && aBool8808 && anInt8811 >= 0));
	}

	void method14015() {
		if (aBool8692)
			IDirect3DDevice.method14471(((Class505_Sub2_Sub2) this).aLong10252, 28, (aBool8809 && aBool8808 && anInt8811 >= 0));
	}

	Interface6 method14090(Class150 class150, int i, int i_121_, boolean bool, float[] fs, int i_122_, int i_123_) {
		return new Class360_Sub2(this, class150, i, i_121_, bool, fs, i_122_, i_123_);
	}

	final Interface32 method14206(boolean bool) {
		return new Class367(this, Class76.aClass76_752, bool);
	}

	final Interface32 method14207(boolean bool) {
		return new Class367(this, Class76.aClass76_752, bool);
	}

	final Interface4 method13925(boolean bool) {
		return new Class300(this, bool);
	}

	Class70 method14209(Class72[] class72s) {
		return new Class70_Sub1(this, class72s);
	}

	Class70 method14210(Class72[] class72s) {
		return new Class70_Sub1(this, class72s);
	}

	Class70 method14017(Class72[] class72s) {
		return new Class70_Sub1(this, class72s);
	}

	Interface6 method14072(Class150 class150, Class76 class76, int i, int i_124_) {
		return new Class360_Sub2(this, class150, class76, i, i_124_);
	}

	public void method14213(int i, Interface4 interface4) {
		Class300 class300 = (Class300) interface4;
		IDirect3DDevice.SetStreamSource(((Class505_Sub2_Sub2) this).aLong10252, i, ((Class300) class300).aLong3549, 0, class300.method5317());
	}

	public void method14214(int i, Interface4 interface4) {
		Class300 class300 = (Class300) interface4;
		IDirect3DDevice.SetStreamSource(((Class505_Sub2_Sub2) this).aLong10252, i, ((Class300) class300).aLong3549, 0, class300.method5317());
	}

	void method14215(Interface32 interface32) {
		IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, (((Class367) (Class367) interface32).aLong4238));
	}

	void method14047() {
		method13949();
		method13951();
	}

	void method8397() {
		super.method8397();
		if (((Class505_Sub2_Sub2) this).aLong10259 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10259);
			((Class505_Sub2_Sub2) this).aLong10259 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10250 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10250);
			((Class505_Sub2_Sub2) this).aLong10250 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10253 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10253);
			((Class505_Sub2_Sub2) this).aLong10253 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10252 != 0L) {
			IDirect3DDevice.Destroy(((Class505_Sub2_Sub2) this).aLong10252);
			((Class505_Sub2_Sub2) this).aLong10252 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10246 != 0L) {
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLong10246);
			((Class505_Sub2_Sub2) this).aLong10246 = 0L;
		}
	}

	public final void method13959(Class352 class352, int i, int i_125_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawPrimitive(((Class505_Sub2_Sub2) this).aLong10252, method15654(class352), i, i_125_);
	}

	public final void method14101(Class352 class352, int i, int i_126_, int i_127_, int i_128_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawIndexedPrimitive((((Class505_Sub2_Sub2) this).aLong10252), method15654(class352), 0, i, i_126_, i_127_, i_128_);
	}

	public final void method13983(Class352 class352, int i, int i_129_, int i_130_, int i_131_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawIndexedPrimitive((((Class505_Sub2_Sub2) this).aLong10252), method15654(class352), 0, i, i_129_, i_130_, i_131_);
	}

	void method13999() {
		aFloat8819 = aFloat8697 - (float) anInt8680;
		aFloat8813 = aFloat8819 - (float) anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;
		if (aBool8692) {
			IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 36, aFloat8813);
			IDirect3DDevice.method14470(((Class505_Sub2_Sub2) this).aLong10252, 37, aFloat8819);
			IDirect3DDevice.SetRenderState((((Class505_Sub2_Sub2) this).aLong10252), 34, anInt8810);
		}
	}

	public final void method14229(Class352 class352, int i, int i_132_, int i_133_, int i_134_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawIndexedPrimitive((((Class505_Sub2_Sub2) this).aLong10252), method15654(class352), 0, i, i_132_, i_133_, i_134_);
	}

	public final void method14230(Class352 class352, int i, int i_135_, int i_136_, int i_137_) {
		if (((Class505_Sub2_Sub2) this).aClass115_Sub1_10251 != null)
			((Class505_Sub2_Sub2) this).aClass115_Sub1_10251.method14591();
		IDirect3DDevice.DrawIndexedPrimitive((((Class505_Sub2_Sub2) this).aLong10252), method15654(class352), 0, i, i_135_, i_136_, i_137_);
	}

	void method14235(int i) {
		int i_138_ = (i & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 8, i_138_);
	}

	void method14069() {
		for (Node class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7859(1428199779); class282 != null; class282 = ((Class505_Sub2_Sub2) this).aClass473_10249.method7857((byte) -53)) {
			Class282_Sub9 class282_sub9 = (Class282_Sub9) class282;
			Interface33 interface33 = ((Class282_Sub9) class282_sub9).anInterface33_7538;
			interface33.method210();
			if (interface33 == aClass158_5853)
				interface33.method213();
		}
		super.method13899();
	}

	boolean method15668() {
		int i = IDirect3DDevice.TestCooperativeLevel(((Class505_Sub2_Sub2) this).aLong10252);
		if (i == 0 || i == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((((Class505_Sub2_Sub2) this).aLong10252), 0L);
			for (int i_139_ = 0; i_139_ < 4; i_139_++)
				IDirect3DDevice.SetRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_139_, 0L);
			for (int i_140_ = 0; i_140_ < 4; i_140_++)
				IDirect3DDevice.SetStreamSource((((Class505_Sub2_Sub2) this).aLong10252), i_140_, 0L, 0, 0);
			for (int i_141_ = 0; i_141_ < 4; i_141_++)
				IDirect3DDevice.SetTexture((((Class505_Sub2_Sub2) this).aLong10252), i_141_, 0L);
			IDirect3DDevice.SetIndices(((Class505_Sub2_Sub2) this).aLong10252, 0L);
			method13900();
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferWidth = 0;
			((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248.BackBufferHeight = 0;
			if (method15656(((Class505_Sub2_Sub2) this).anInt10260, ((Class505_Sub2_Sub2) this).anInt10244, ((Class505_Sub2_Sub2) this).aLong10246, anInt8709, (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248))) {
				int i_142_ = IDirect3DDevice.Reset((((Class505_Sub2_Sub2) this).aLong10252), (((Class505_Sub2_Sub2) this).aD3DPRESENT_PARAMETERS10248));
				if (Class25.method751(i_142_)) {
					method13899();
					method13897();
					return true;
				}
				System.exit(0);
			}
		}
		return false;
	}

	void method14182() {
		if (((Class505_Sub2_Sub2) this).aLong10269 == 0L && aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			if (aClass37Array8783[anInt8780] == Class37.aClass37_388)
				IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 16 + anInt8780, (aClass384Array8782[anInt8780].method6548(((Class505_Sub2_Sub2) this).aFloatArray10264)));
			else
				IDirect3DDevice.SetTransform(((Class505_Sub2_Sub2) this).aLong10252, 16 + anInt8780, (aClass384Array8782[anInt8780].method6517(((Class505_Sub2_Sub2) this).aFloatArray10264)));
			int i = method15667(aClass37Array8783[anInt8780]);
			if (i != ((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780]) {
				IDirect3DDevice.SetTextureStageState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 24, i);
				((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class505_Sub2_Sub2) this).aLong10252), anInt8780, 24, 0);
			((Class505_Sub2_Sub2) this).anIntArray10266[anInt8780] = 0;
		}
	}

	static final int method15669(Class352 class352) {
		switch (class352.anInt4101) {
		case 0:
			return 3;
		case 3:
			return 6;
		case 1:
			return 2;
		case 4:
			return 4;
		case 2:
			return 5;
		case 5:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	void method15670(Interface33 interface33) {
		if (method15641(interface33) == null)
			((Class505_Sub2_Sub2) this).aClass473_10249.method7877(new Class282_Sub9(interface33), -97072883);
	}

	void method15671(Interface33 interface33) {
		if (method15641(interface33) == null)
			((Class505_Sub2_Sub2) this).aClass473_10249.method7877(new Class282_Sub9(interface33), 533407894);
	}

	synchronized void method15672(long l) {
		if (((Class505_Sub2_Sub2) this).anInt10270 == ((Class505_Sub2_Sub2) this).anInt10268) {
			((Class505_Sub2_Sub2) this).anInt10268 *= 2;
			long[] ls = new long[((Class505_Sub2_Sub2) this).anInt10268];
			System.arraycopy(((Class505_Sub2_Sub2) this).aLongArray10271, 0, ls, 0, ((Class505_Sub2_Sub2) this).anInt10270);
			((Class505_Sub2_Sub2) this).aLongArray10271 = ls;
		}
		((Class505_Sub2_Sub2) this).aLongArray10271[((Class505_Sub2_Sub2) this).anInt10270] = l;
		((Class505_Sub2_Sub2) this).anInt10270++;
	}

	void method15673(Interface33 interface33) {
		Class282_Sub9 class282_sub9 = method15641(interface33);
		if (class282_sub9 != null)
			class282_sub9.unlink(-371378792);
	}

	void method15674(Interface33 interface33) {
		Class282_Sub9 class282_sub9 = method15641(interface33);
		if (class282_sub9 != null)
			class282_sub9.unlink(-371378792);
	}

	final void method15675(long l) {
		((Class505_Sub2_Sub2) this).aLong10269 = l;
		IDirect3DDevice.SetVertexShader(((Class505_Sub2_Sub2) this).aLong10252, l);
	}

	final void method15676(long l) {
		((Class505_Sub2_Sub2) this).aLong10269 = l;
		IDirect3DDevice.SetVertexShader(((Class505_Sub2_Sub2) this).aLong10252, l);
	}

	Interface31 method14237(int i, boolean bool, int[][] is) {
		return new Class360_Sub3(this, i, bool, is);
	}

	Interface31 method14011(int i, boolean bool, int[][] is) {
		return new Class360_Sub3(this, i, bool, is);
	}

	Interface31 method14239(int i, boolean bool, int[][] is) {
		return new Class360_Sub3(this, i, bool, is);
	}

	public void method13964() {
		if (((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = false;
			IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 0L);
			method13980();
			method13979();
		}
	}

	final void method15677(Class360 class360) {
		IDirect3DDevice.SetTexture(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, class360.method6245());
		if (aBool8692 && !((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780]) {
			((Class505_Sub2_Sub2) this).aBoolArray10257[anInt8780] = true;
			method13980();
			method13979();
		}
	}

	public int[] ab(int i, int i_143_, int i_144_, int i_145_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class505_Sub2_Sub2) this).aLong10252, 0);
		long l_146_ = IDirect3DDevice.CreateRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_144_, i_145_, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect(((Class505_Sub2_Sub2) this).aLong10252, l, i, i_143_, i_144_, i_145_, l_146_, 0, 0, i_144_, i_145_, 1))) {
			is = new int[i_144_ * i_145_];
			IDirect3DSurface.Download(l_146_, 0, 0, i_144_, i_145_, i_144_ * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_146_);
		return is;
	}

	final void method15678(Class360_Sub2 class360_sub2) {
		method15662(class360_sub2);
		if (((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780] != ((Class360_Sub2) class360_sub2).aBool9156) {
			IDirect3DDevice.SetSamplerState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 1, ((Class360_Sub2) class360_sub2).aBool9156 ? 1 : 3);
			((Class505_Sub2_Sub2) this).aBoolArray10255[anInt8780] = ((Class360_Sub2) class360_sub2).aBool9156;
		}
		if (((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780] != ((Class360_Sub2) class360_sub2).aBool9155) {
			IDirect3DDevice.SetSamplerState(((Class505_Sub2_Sub2) this).aLong10252, anInt8780, 2, ((Class360_Sub2) class360_sub2).aBool9155 ? 1 : 3);
			((Class505_Sub2_Sub2) this).aBoolArray10256[anInt8780] = ((Class360_Sub2) class360_sub2).aBool9155;
		}
	}

	Interface6 method14144(Class150 class150, int i, int i_147_, boolean bool, byte[] is, int i_148_, int i_149_) {
		return new Class360_Sub2(this, class150, i, i_147_, bool, is, i_148_, i_149_);
	}

	static final int method15679(Class68 class68) {
		switch (class68.anInt686) {
		case 1:
			return 10;
		default:
			throw new IllegalArgumentException();
		case 4:
			return 4;
		case 2:
			return 2;
		case 0:
			return 7;
		case 3:
			return 26;
		}
	}

	Interface29 method14064(Class150 class150, Class76 class76, int i, int i_150_) {
		return new Class360_Sub2_Sub1(this, class150, class76, i, i_150_);
	}

	static final int method15680(Class68 class68) {
		switch (class68.anInt686) {
		case 1:
			return 10;
		default:
			throw new IllegalArgumentException();
		case 4:
			return 4;
		case 2:
			return 2;
		case 0:
			return 7;
		case 3:
			return 26;
		}
	}

	public boolean method13887() {
		return ((((Class505_Sub2_Sub2) this).aD3DCAPS10267.VertexShaderVersion & 0xffff) >= 257);
	}

	public void method8445() {
		/* empty */
	}

	final Interface4 method13994(boolean bool) {
		return new Class300(this, bool);
	}

	static final int method15681(Class37 class37) {
		switch (class37.anInt390) {
		case 1:
			return 2;
		case 4:
			return 256;
		case 2:
			return 1;
		case 5:
			return 4;
		case 3:
			return 3;
		default:
			return 0;
		}
	}

	static final int method15682(Class76 class76) {
		if (class76 == Class76.aClass76_752)
			return 80;
		if (class76 == Class76.aClass76_749)
			return 77;
		throw new IllegalArgumentException("");
	}

	static final int method15683(Class150 class150, Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 4:
			switch (class150.anInt1958 * -1436290903) {
			case 6:
				return 21;
			case 5:
				return 22;
			case 8:
				return 77;
			case 1:
				return 28;
			case 7:
				return Class27.anInt345 * 154791573;
			case 0:
				return 50;
			case 9:
				return Class27.anInt346 * 15254207;
			case 4:
				return 51;
			default:
				break;
			}
			break;
		case 3:
			if (class150 == Class150.aClass150_1949)
				return 116;
			break;
		case 8:
			if (class150 == Class150.aClass150_1949)
				return 113;
			break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method15684(Class150 class150, Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 4:
			switch (class150.anInt1958 * -1436290903) {
			case 6:
				return 21;
			case 5:
				return 22;
			case 8:
				return 77;
			case 1:
				return 28;
			case 7:
				return Class27.anInt345 * 154791573;
			case 0:
				return 50;
			case 9:
				return Class27.anInt346 * 15254207;
			case 4:
				return 51;
			default:
				break;
			}
			break;
		case 3:
			if (class150 == Class150.aClass150_1949)
				return 116;
			break;
		case 8:
			if (class150 == Class150.aClass150_1949)
				return 113;
			break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method15685(Class150 class150, Class76 class76) {
		switch (class76.anInt757 * -72465143) {
		case 4:
			switch (class150.anInt1958 * -1436290903) {
			case 6:
				return 21;
			case 5:
				return 22;
			case 8:
				return 77;
			case 1:
				return 28;
			case 7:
				return Class27.anInt345 * 154791573;
			case 0:
				return 50;
			case 9:
				return Class27.anInt346 * 15254207;
			case 4:
				return 51;
			default:
				break;
			}
			break;
		case 3:
			if (class150 == Class150.aClass150_1949)
				return 116;
			break;
		case 8:
			if (class150 == Class150.aClass150_1949)
				return 113;
			break;
		}
		throw new IllegalArgumentException("");
	}

	public int[] ke(int i, int i_151_, int i_152_, int i_153_) {
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class505_Sub2_Sub2) this).aLong10252, 0);
		long l_154_ = IDirect3DDevice.CreateRenderTarget((((Class505_Sub2_Sub2) this).aLong10252), i_152_, i_153_, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect(((Class505_Sub2_Sub2) this).aLong10252, l, i, i_151_, i_152_, i_153_, l_154_, 0, 0, i_152_, i_153_, 1))) {
			is = new int[i_152_ * i_153_];
			IDirect3DSurface.Download(l_154_, 0, 0, i_152_, i_153_, i_152_ * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_154_);
		return is;
	}

	static final int method15686(Class76 class76) {
		if (class76 == Class76.aClass76_752)
			return 80;
		if (class76 == Class76.aClass76_749)
			return 77;
		throw new IllegalArgumentException("");
	}

	void method8486() {
		super.method8397();
		if (((Class505_Sub2_Sub2) this).aLong10259 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10259);
			((Class505_Sub2_Sub2) this).aLong10259 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10250 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10250);
			((Class505_Sub2_Sub2) this).aLong10250 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10253 != 0L) {
			D3DLIGHT.Destroy(((Class505_Sub2_Sub2) this).aLong10253);
			((Class505_Sub2_Sub2) this).aLong10253 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10252 != 0L) {
			IDirect3DDevice.Destroy(((Class505_Sub2_Sub2) this).aLong10252);
			((Class505_Sub2_Sub2) this).aLong10252 = 0L;
		}
		if (((Class505_Sub2_Sub2) this).aLong10246 != 0L) {
			IUnknown.Release(((Class505_Sub2_Sub2) this).aLong10246);
			((Class505_Sub2_Sub2) this).aLong10246 = 0L;
		}
	}

	static final int method15687(Class352 class352) {
		switch (class352.anInt4101) {
		case 0:
			return 3;
		case 3:
			return 6;
		case 1:
			return 2;
		case 4:
			return 4;
		case 2:
			return 5;
		case 5:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	public void method8484() {
		long l = IDirect3DDevice.CreateEventQuery(((Class505_Sub2_Sub2) this).aLong10252);
		if (Class25.method751(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	synchronized void method15688(long l) {
		if (((Class505_Sub2_Sub2) this).anInt10270 == ((Class505_Sub2_Sub2) this).anInt10268) {
			((Class505_Sub2_Sub2) this).anInt10268 *= 2;
			long[] ls = new long[((Class505_Sub2_Sub2) this).anInt10268];
			System.arraycopy(((Class505_Sub2_Sub2) this).aLongArray10271, 0, ls, 0, ((Class505_Sub2_Sub2) this).anInt10270);
			((Class505_Sub2_Sub2) this).aLongArray10271 = ls;
		}
		((Class505_Sub2_Sub2) this).aLongArray10271[((Class505_Sub2_Sub2) this).anInt10270] = l;
		((Class505_Sub2_Sub2) this).anInt10270++;
	}

	static final int method15689(Class67 class67) {
		switch (class67.anInt681) {
		case 3:
			return 1;
		case 2:
			return 2;
		default:
			throw new IllegalArgumentException();
		case 1:
			return 0;
		case 0:
			return 3;
		}
	}

	void method14240(int i) {
		IDirect3DDevice.SetRenderState(((Class505_Sub2_Sub2) this).aLong10252, 168, i);
	}
}
