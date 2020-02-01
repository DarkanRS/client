package com.jagex;
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

public class GraphicalRenderer_Sub2_Sub2 extends GraphicalRenderer_Sub2 {

	Class115_Sub1 aClass115_Sub1_10251;
	static int[] anIntArray10272 = new int[] { 77, 80 };
	static int[] anIntArray10273 = new int[] { 22, 23 };
	long aLong10246 = 0L;
	long aLong10252 = 0L;
	LinkedNodeList aClass473_10249 = new LinkedNodeList();
	int anInt10262 = 0;
	long aLong10259 = 0L;
	long aLong10250 = 0L;
	long aLong10253 = 0L;
	boolean aBool10254 = false;
	float[] aFloatArray10264 = new float[16];
	int anInt10268 = 128;
	int anInt10270 = 0;
	long[] aLongArray10271;
	int anInt10260;
	int anInt10244;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS10248;
	D3DCAPS aD3DCAPS10267;
	boolean aBool10265;
	boolean aBool10247;
	boolean aBool10263;
	boolean[] aBoolArray10255;
	boolean[] aBoolArray10256;
	boolean[] aBoolArray10257;
	Class35[] aClass35Array10245;
	boolean[] aBoolArray10258;
	int[] anIntArray10266;
	Matrix44Arr aClass384_10261;
	long aLong10269;

	public void method8497() {
	}

	public boolean method13888() {
		return (this.aD3DCAPS10267.PixelShaderVersion & 0xffff) >= 257;
	}

	static GraphicalRenderer method15638(Canvas canvas_0, Interface22 interface22_1, Index index_2, Integer integer_3) {
		GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_4 = null;
		byte b_6 = 0;
		byte b_7 = 1;
		long long_8 = IDirect3D.Direct3DCreate();
		D3DCAPS d3dcaps_10 = new D3DCAPS();
		IDirect3D.GetDeviceCaps(long_8, b_6, b_7, d3dcaps_10);
		if ((d3dcaps_10.RasterCaps & 0x1000000) == 0) {
			throw new RuntimeException("");
		} else if (d3dcaps_10.MaxSimultaneousTextures < 2) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.TextureOpCaps & 0x2) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.TextureOpCaps & 0x8) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.TextureOpCaps & 0x40) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.TextureOpCaps & 0x200) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.TextureOpCaps & 0x2000000) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.SrcBlendCaps & d3dcaps_10.DestBlendCaps & 0x10) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.SrcBlendCaps & d3dcaps_10.DestBlendCaps & 0x20) == 0) {
			throw new RuntimeException("");
		} else if ((d3dcaps_10.SrcBlendCaps & d3dcaps_10.DestBlendCaps & 0x2) == 0) {
			throw new RuntimeException("");
		} else if (d3dcaps_10.MaxActiveLights > 0 && d3dcaps_10.MaxActiveLights < 2) {
			throw new RuntimeException("");
		} else if (d3dcaps_10.MaxStreams < 5) {
			throw new RuntimeException("");
		} else {
			D3DPRESENT_PARAMETERS d3dpresent_parameters_11 = new D3DPRESENT_PARAMETERS(canvas_0);
			d3dpresent_parameters_11.Windowed = true;
			d3dpresent_parameters_11.EnableAutoDepthStencil = true;
			d3dpresent_parameters_11.BackBufferWidth = canvas_0.getWidth();
			d3dpresent_parameters_11.BackBufferHeight = canvas_0.getHeight();
			d3dpresent_parameters_11.BackBufferCount = 1;
			d3dpresent_parameters_11.PresentationInterval = Integer.MIN_VALUE;
			if (!method15656(b_6, b_7, long_8, integer_3.intValue(), d3dpresent_parameters_11)) {
				throw new RuntimeException("");
			} else {
				int i_12 = 0;
				if ((d3dcaps_10.DevCaps & 0x100000) != 0) {
					i_12 |= 0x10;
				}

				long long_13 = 0L;

				try {
					long_13 = IDirect3D.CreateDeviceContext(long_8, b_6, b_7, canvas_0, i_12 | 0x40, d3dpresent_parameters_11);
				} catch (RuntimeException_Sub1 runtimeexception_sub1_17) {
					long_13 = IDirect3D.CreateDeviceContext(long_8, b_6, b_7, canvas_0, i_12 & ~0x100000 | 0x20, d3dpresent_parameters_11);
				}

				class505_sub2_sub2_4 = new GraphicalRenderer_Sub2_Sub2(b_6, b_7, long_8, long_13, d3dpresent_parameters_11, d3dcaps_10, interface22_1, index_2, integer_3.intValue());
				if (!class505_sub2_sub2_4.aHashtable5855.containsKey(canvas_0)) {
					Class459.method7679(canvas_0, 902386492);
					class505_sub2_sub2_4.method8411(canvas_0, new Class158_Sub2_Sub2_Sub2(class505_sub2_sub2_4, canvas_0, canvas_0.getWidth(), canvas_0.getHeight(), true));
				}

				class505_sub2_sub2_4.method8412(canvas_0);
				class505_sub2_sub2_4.method14147();
				return class505_sub2_sub2_4;
			}
		}
	}

	GraphicalRenderer_Sub2_Sub2(int i_1, int i_2, long long_3, long long_5, D3DPRESENT_PARAMETERS d3dpresent_parameters_7, D3DCAPS d3dcaps_8, Interface22 interface22_9, Index index_10, int i_11) {
		super(interface22_9, index_10, i_11, 0);
		this.aLongArray10271 = new long[this.anInt10268];

		try {
			this.anInt10260 = i_1;
			this.anInt10244 = i_2;
			this.aLong10246 = long_3;
			this.aLong10252 = long_5;
			this.aD3DPRESENT_PARAMETERS10248 = d3dpresent_parameters_7;
			this.aD3DCAPS10267 = d3dcaps_8;
			this.aLong10259 = D3DLIGHT.Create();
			this.aLong10250 = D3DLIGHT.Create();
			this.aLong10253 = D3DLIGHT.Create();
			this.anInt8825 = this.aD3DCAPS10267.MaxSimultaneousTextures;
			this.anInt8799 = this.aD3DCAPS10267.MaxActiveLights > 0 ? this.aD3DCAPS10267.MaxActiveLights : 8;
			this.aBool10265 = (this.aD3DCAPS10267.TextureCaps & 0x2) == 0;
			this.aBool8827 = (this.aD3DCAPS10267.TextureCaps & 0x2000) != 0;
			this.aBool10247 = (this.aD3DCAPS10267.TextureCaps & 0x10000) != 0;
			this.aBool10263 = (this.aD3DCAPS10267.TextureCaps & 0x4000) != 0;
			this.aBool8718 = true;
			this.aBool8828 = this.anInt8709 > 0 || IDirect3D.CheckDeviceMultiSampleType(this.aLong10246, this.anInt10260, this.anInt10244, this.aD3DPRESENT_PARAMETERS10248.BackBufferFormat, true, 2) == 0;
			this.aBoolArray10255 = new boolean[this.anInt8825];
			this.aBoolArray10256 = new boolean[this.anInt8825];
			this.aBoolArray10257 = new boolean[this.anInt8825];
			this.aClass35Array10245 = new Class35[this.anInt8825];
			this.aBoolArray10258 = new boolean[this.anInt8825];
			this.anIntArray10266 = new int[this.anInt8825];
			Matrix44Var matrix44var_12 = new Matrix44Var();
			matrix44var_12.method5259(1.0F, -1.0F, 0.5F);
			matrix44var_12.method5219(0.0F, 0.0F, 0.5F);
			this.aClass384_10261 = new Matrix44Arr();
			this.aClass384_10261.fromVarMatrix44(matrix44var_12);
			IDirect3DDevice.BeginScene(this.aLong10252);
		} catch (Throwable throwable_13) {
			throwable_13.printStackTrace();
			this.method8396();
			throw new RuntimeException("");
		}
	}

	Interface6 method14141(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	void method13900() {
		for (Node node_1 = this.aClass473_10249.getBack(); node_1 != null; node_1 = this.aClass473_10249.getPrevious()) {
			Node_Sub9 class282_sub9_2 = (Node_Sub9) node_1;
			Interface33 interface33_3 = class282_sub9_2.anInterface33_7538;
			interface33_3.method212();
		}

		super.method13900();
	}

	boolean method15639() {
		int i_1 = IDirect3DDevice.TestCooperativeLevel(this.aLong10252);
		if (i_1 == 0 || i_1 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(this.aLong10252, 0L);

			int i_2;
			for (i_2 = 0; i_2 < 4; i_2++) {
				IDirect3DDevice.SetRenderTarget(this.aLong10252, i_2, 0L);
			}

			for (i_2 = 0; i_2 < 4; i_2++) {
				IDirect3DDevice.SetStreamSource(this.aLong10252, i_2, 0L, 0, 0);
			}

			for (i_2 = 0; i_2 < 4; i_2++) {
				IDirect3DDevice.SetTexture(this.aLong10252, i_2, 0L);
			}

			IDirect3DDevice.SetIndices(this.aLong10252, 0L);
			this.method13900();
			this.aD3DPRESENT_PARAMETERS10248.BackBufferWidth = 0;
			this.aD3DPRESENT_PARAMETERS10248.BackBufferHeight = 0;
			if (method15656(this.anInt10260, this.anInt10244, this.aLong10246, this.anInt8709, this.aD3DPRESENT_PARAMETERS10248)) {
				i_2 = IDirect3DDevice.Reset(this.aLong10252, this.aD3DPRESENT_PARAMETERS10248);
				if (Class25.gtOrEqualToZero(i_2)) {
					this.method13899();
					this.method13897();
					return true;
				}

				System.exit(0);
			}
		}

		return false;
	}

	void method13897() {
		for (int i_1 = 0; i_1 < this.anInt8825; i_1++) {
			IDirect3DDevice.SetSamplerState(this.aLong10252, i_1, 7, 2);
			IDirect3DDevice.SetSamplerState(this.aLong10252, i_1, 6, 2);
			IDirect3DDevice.SetSamplerState(this.aLong10252, i_1, 5, 2);
			IDirect3DDevice.SetSamplerState(this.aLong10252, i_1, 1, 1);
			IDirect3DDevice.SetSamplerState(this.aLong10252, i_1, 2, 1);
			this.aClass35Array10245[i_1] = Class35.aClass35_382;
			boolean[] bools_2 = this.aBoolArray10255;
			this.aBoolArray10256[i_1] = true;
			bools_2[i_1] = true;
			this.aBoolArray10258[i_1] = false;
			this.anIntArray10266[i_1] = 0;
		}

		IDirect3DDevice.SetTextureStageState(this.aLong10252, 0, 6, 1);
		IDirect3DDevice.SetRenderState(this.aLong10252, 9, 2);
		IDirect3DDevice.SetRenderState(this.aLong10252, 23, 4);
		IDirect3DDevice.SetRenderState(this.aLong10252, 25, 5);
		IDirect3DDevice.SetRenderState(this.aLong10252, 24, 0);
		IDirect3DDevice.SetRenderState(this.aLong10252, 22, 2);
		IDirect3DDevice.SetRenderState(this.aLong10252, 147, 1);
		IDirect3DDevice.SetRenderState(this.aLong10252, 145, 1);
		IDirect3DDevice.method14470(this.aLong10252, 38, 0.95F);
		IDirect3DDevice.SetRenderState(this.aLong10252, 35, 3);
		IDirect3DDevice.method14470(this.aLong10252, 154, 1.0F);
		D3DLIGHT.SetType(this.aLong10259, 3);
		D3DLIGHT.SetType(this.aLong10250, 3);
		D3DLIGHT.SetType(this.aLong10253, 1);
		IDirect3DDevice.SetRenderState(this.aLong10252, 206, 1);
		this.aBool10254 = false;
		super.method13897();
	}

	public RendererInfo method8392() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier_1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong10246, this.anInt10260, 0, d3dadapter_identifier_1);
		return new RendererInfo(d3dadapter_identifier_1.VendorID, "Direct3D", 9, d3dadapter_identifier_1.Description, d3dadapter_identifier_1.DriverVersion);
	}

	void method8555() throws Exception_Sub3 {
		IDirect3DDevice.EndScene(this.aLong10252);
		int i_3 = this.aClass158_Sub2_5841.method14344();
		if (Class25.lessThanZero(i_3)) {
			if (i_3 != -2005530520) {
				if (++this.anInt10262 > 50) {
					throw new Exception_Sub3();
				}
			} else {
				this.aClass158_Sub2_5841.method212();
				this.method15639();
				((Class158_Sub2_Sub2_Sub2) this.aClass158_Sub2_5841).method210();
			}
		} else {
			this.anInt10262 = 0;
		}

		IDirect3DDevice.BeginScene(this.aLong10252);
		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-1786216756);
		}

	}

	public void method8395() {
		long long_1 = IDirect3DDevice.CreateEventQuery(this.aLong10252);
		if (Class25.gtOrEqualToZero(IDirect3DEventQuery.Issue(long_1))) {
			while (true) {
				int i_3 = IDirect3DEventQuery.IsSignaled(long_1);
				if (i_3 != 1) {
					break;
				}

				Thread.yield();
			}
		}

		IUnknown.Release(long_1);
	}

	public void finalize() {
		super.finalize();
	}

	void method14120() {
		IDirect3DDevice.method14471(this.aLong10252, 14, this.aBool8755 && this.aBool8756);
	}

	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub3_Sub1(this);
	}

	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub2(this, canvas_1, i_2, i_3, false);
	}

	public Interface8 method8419(int i_1, int i_2) {
		return new Class307(this, Class76.aClass76_749, i_1, i_2);
	}

	Node_Sub9 method15641(Interface33 interface33_1) {
		for (Node node_2 = this.aClass473_10249.getBack(); node_2 != null; node_2 = this.aClass473_10249.getPrevious()) {
			Node_Sub9 class282_sub9_3 = (Node_Sub9) node_2;
			if (interface33_1 == class282_sub9_3.anInterface33_7538) {
				return class282_sub9_3;
			}
		}

		return null;
	}

	void method15642(Interface33 interface33_1) {
		if (this.method15641(interface33_1) == null) {
			this.aClass473_10249.insertBack(new Node_Sub9(interface33_1));
		}

	}

	void method15643(Interface33 interface33_1) {
		Node_Sub9 class282_sub9_2 = this.method15641(interface33_1);
		if (class282_sub9_2 != null) {
			class282_sub9_2.remove();
		}

	}

	void method13951() {
		if (this.aBool8692 && !this.aBool10254) {
			IDirect3DDevice.LightEnable(this.aLong10252, 0, false);
			IDirect3DDevice.LightEnable(this.aLong10252, 1, false);
			IDirect3DDevice.SetLight(this.aLong10252, 0, this.aLong10259);
			IDirect3DDevice.SetLight(this.aLong10252, 1, this.aLong10250);
			IDirect3DDevice.LightEnable(this.aLong10252, 0, true);
			IDirect3DDevice.LightEnable(this.aLong10252, 1, true);
			this.aBool10254 = true;
		}

	}

	public void method8491(boolean bool_1) {
	}

	public void method13996(Class70 class70_1) {
		Class70_Sub1 class70_sub1_2 = (Class70_Sub1) class70_1;
		IDirect3DDevice.SetVertexDeclaration(this.aLong10252, class70_sub1_2.aLong9179);
	}

	public void ba(int i_1, int i_2) {
		IDirect3DDevice.Clear(this.aLong10252, i_1, i_2, 1.0F, 0);
	}

	void method13920() {
		if (this.aClass158_5853 != null) {
			IDirect3DDevice.SetViewport(this.aLong10252, this.anInt8823 + this.anInt8749, this.anInt8754 + this.anInt8776, this.anInt8751, this.anInt8752, this.aFloat8735, this.aFloat8736);
		}

	}

	void method13921() {
		IDirect3DDevice.SetScissorRect(this.aLong10252, this.anInt8823 + this.anInt8743, this.anInt8754 + this.anInt8822, this.anInt8744, this.anInt8742);
	}

	final void method13968(int i_1, Class67 class67_2) {
		if (this.aBool8692) {
			byte b_5 = 0;
			byte b_6;
			switch (i_1) {
			case 1:
				b_6 = 3;
				break;
			case 2:
				b_6 = 26;
				break;
			default:
				b_6 = 2;
			}

			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, b_6, method15648(class67_2) | b_5);
		}

	}

	final void method15645(long long_1) {
		IDirect3DDevice.SetPixelShader(this.aLong10252, long_1);
	}

	public void method13892(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		IDirect3DDevice.SetTransform(this.aLong10252, 256, matrix44arr_1.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 2, matrix44arr_2.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 3, matrix44arr_3.buf);
	}

	public void method13933(Matrix44Arr matrix44arr_1) {
		matrix44arr_1.method6523(this.aClass384_10261);
	}

	void method13956() {
		IDirect3DDevice.method14471(this.aLong10252, 7, this.aBool8757);
	}

	void method14054() {
		IDirect3DDevice.method14471(this.aLong10252, 14, this.aBool8755 && this.aBool8756);
	}

	public void fi(int i_1, int i_2) {
		IDirect3DDevice.Clear(this.aLong10252, i_1, i_2, 1.0F, 0);
	}

	final Interface32 method13993(boolean bool_1) {
		return new Class367(this, Class76.aClass76_752, bool_1);
	}

	void method13949() {
		if (this.aBool8692) {
			float f_1 = this.aBool8759 ? this.aFloat8770 : 0.0F;
			float f_2 = this.aBool8759 ? -this.aFloat8826 : 0.0F;
			D3DLIGHT.SetDiffuse(this.aLong10259, f_1 * this.aFloat8766, f_1 * this.aFloat8767, f_1 * this.aFloat8768, 0.0F);
			D3DLIGHT.SetDiffuse(this.aLong10250, f_2 * this.aFloat8766, f_2 * this.aFloat8767, f_2 * this.aFloat8768, 0.0F);
			this.aBool10254 = false;
		}

	}

	void method13950() {
		if (this.aBool8692) {
			D3DLIGHT.SetDirection(this.aLong10259, -this.aFloatArray8747[0], -this.aFloatArray8747[1], -this.aFloatArray8747[2]);
			D3DLIGHT.SetDirection(this.aLong10250, -this.aFloatArray8762[0], -this.aFloatArray8762[1], -this.aFloatArray8762[2]);
			this.aBool10254 = false;
		}

	}

	void method13952() {
		this.method13949();
		this.method13951();
	}

	public void method8420() {
	}

	void method13953() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8773; i_1++) {
			Node_Sub24 class282_sub24_2 = this.aNode_Sub24Array8716[i_1];
			int i_3 = i_1 + 2;
			int i_4 = class282_sub24_2.method12371(-2141155828);
			float f_5 = class282_sub24_2.method12395(1596693490) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong10253, (float) class282_sub24_2.method12368((byte) -85), (float) class282_sub24_2.method12369(), (float) class282_sub24_2.method12394(1027065931));
			D3DLIGHT.SetDiffuse(this.aLong10253, (float) (i_4 >> 16 & 0xff) * f_5, (float) (i_4 >> 8 & 0xff) * f_5, (float) (i_4 & 0xff) * f_5, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong10253, 0.0F, 0.0F, 1.0F / (float) (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			D3DLIGHT.SetRange(this.aLong10253, (float) class282_sub24_2.method12370());
			IDirect3DDevice.SetLight(this.aLong10252, i_3, this.aLong10253);
			IDirect3DDevice.LightEnable(this.aLong10252, i_3, true);
		}

		while (i_1 < this.anInt8831) {
			IDirect3DDevice.LightEnable(this.aLong10252, i_1 + 2, false);
			++i_1;
		}

	}

	public final synchronized void method8487(int i_1) {
		for (int i_2 = 0; i_2 < this.anInt10270; i_2++) {
			IUnknown.Release(this.aLongArray10271[i_2]);
		}

		this.anInt10270 = 0;
		super.method8398(i_1);
	}

	boolean method13955(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 4, method15652(class150_1, class76_2)));
	}

	Interface6 method14094(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		return new Class360_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
	}

	Interface1 method14077(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class360_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	Interface6 method13961(Class150 class150_1, int i_2, int i_3, float[] floats_5) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, true, floats_5, 0, 0);
	}

	void method14188() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8785[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 4, i_1);
		}

	}

	Interface31 method14034(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	Interface1 method13962(Class150 class150_1, byte[] bytes_6) {
		return new Class360_Sub1(this, class150_1, 128, 128, 16, true, bytes_6);
	}

	Interface1 method13917(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class360_Sub1(this, class150_1, i_2, i_3, i_4, bool_5, bytes_6);
	}

	final void method15647(Class360_Sub2 class360_sub2_1) {
		this.method15662(class360_sub2_1);
		if (this.aBoolArray10255[this.anInt8780] != class360_sub2_1.aBool9156) {
			IDirect3DDevice.SetSamplerState(this.aLong10252, this.anInt8780, 1, class360_sub2_1.aBool9156 ? 1 : 3);
			this.aBoolArray10255[this.anInt8780] = class360_sub2_1.aBool9156;
		}

		if (this.aBoolArray10256[this.anInt8780] != class360_sub2_1.aBool9155) {
			IDirect3DDevice.SetSamplerState(this.aLong10252, this.anInt8780, 2, class360_sub2_1.aBool9155 ? 1 : 3);
			this.aBoolArray10256[this.anInt8780] = class360_sub2_1.aBool9155;
		}

	}

	public void method14212(Class70 class70_1) {
		Class70_Sub1 class70_sub1_2 = (Class70_Sub1) class70_1;
		IDirect3DDevice.SetVertexDeclaration(this.aLong10252, class70_sub1_2.aLong9179);
	}

	void method8485() {
		super.method8397();
		if (this.aLong10259 != 0L) {
			D3DLIGHT.Destroy(this.aLong10259);
			this.aLong10259 = 0L;
		}

		if (this.aLong10250 != 0L) {
			D3DLIGHT.Destroy(this.aLong10250);
			this.aLong10250 = 0L;
		}

		if (this.aLong10253 != 0L) {
			D3DLIGHT.Destroy(this.aLong10253);
			this.aLong10253 = 0L;
		}

		if (this.aLong10252 != 0L) {
			IDirect3DDevice.Destroy(this.aLong10252);
			this.aLong10252 = 0L;
		}

		if (this.aLong10246 != 0L) {
			IUnknown.Release(this.aLong10246);
			this.aLong10246 = 0L;
		}

	}

	void method14226() {
		if (this.aLong10269 == 0L && this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			if (this.aClass37Array8783[this.anInt8780] == Class37.aClass37_388) {
				IDirect3DDevice.SetTransform(this.aLong10252, this.anInt8780 + 16, this.aClass384Array8782[this.anInt8780].method6548(this.aFloatArray10264));
			} else {
				IDirect3DDevice.SetTransform(this.aLong10252, this.anInt8780 + 16, this.aClass384Array8782[this.anInt8780].method6517(this.aFloatArray10264));
			}

			int i_1 = method15667(this.aClass37Array8783[this.anInt8780]);
			if (i_1 != this.anIntArray10266[this.anInt8780]) {
				IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 24, i_1);
				this.anIntArray10266[this.anInt8780] = i_1;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 24, 0);
			this.anIntArray10266[this.anInt8780] = 0;
		}

	}

	void method13978() {
	}

	void method13979() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8784[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 1, i_1);
		}

	}

	void method13980() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8785[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 4, i_1);
		}

	}

	void method14119() {
		IDirect3DDevice.method14471(this.aLong10252, 7, this.aBool8757);
	}

	final void method13970(int i_1, Class67 class67_2) {
		if (this.aBool8692) {
			byte b_4 = 0;
			byte b_5;
			switch (i_1) {
			case 1:
				b_5 = 6;
				break;
			case 2:
				b_5 = 27;
				break;
			default:
				b_5 = 5;
			}

			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, b_5, method15648(class67_2) | b_4);
		}

	}

	final void method13987() {
		if (this.aBool8692) {
			IDirect3DDevice.SetRenderState(this.aLong10252, 60, this.anInt8758);
		}

	}

	void method14183() {
		if (this.aLong10269 == 0L && this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			if (this.aClass37Array8783[this.anInt8780] == Class37.aClass37_388) {
				IDirect3DDevice.SetTransform(this.aLong10252, 16 + this.anInt8780, this.aClass384Array8782[this.anInt8780].method6548(this.aFloatArray10264));
			} else {
				IDirect3DDevice.SetTransform(this.aLong10252, 16 + this.anInt8780, this.aClass384Array8782[this.anInt8780].method6517(this.aFloatArray10264));
			}

			int i_1 = method15667(this.aClass37Array8783[this.anInt8780]);
			if (i_1 != this.anIntArray10266[this.anInt8780]) {
				IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 24, i_1);
				this.anIntArray10266[this.anInt8780] = i_1;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 24, 0);
			this.anIntArray10266[this.anInt8780] = 0;
		}

	}

	static final int method15648(Class67 class67_0) {
		switch (class67_0.anInt681) {
		case 0:
			return 3;
		case 1:
			return 0;
		case 2:
			return 2;
		case 3:
			return 1;
		default:
			throw new IllegalArgumentException();
		}
	}

	void method13982() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8773; i_1++) {
			Node_Sub24 class282_sub24_2 = this.aNode_Sub24Array8716[i_1];
			int i_3 = i_1 + 2;
			int i_4 = class282_sub24_2.method12371(-2135463998);
			float f_5 = class282_sub24_2.method12395(-2014514150) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong10253, (float) class282_sub24_2.method12368((byte) 11), (float) class282_sub24_2.method12369(), (float) class282_sub24_2.method12394(1899159240));
			D3DLIGHT.SetDiffuse(this.aLong10253, (float) (i_4 >> 16 & 0xff) * f_5, (float) (i_4 >> 8 & 0xff) * f_5, (float) (i_4 & 0xff) * f_5, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong10253, 0.0F, 0.0F, 1.0F / (float) (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			D3DLIGHT.SetRange(this.aLong10253, (float) class282_sub24_2.method12370());
			IDirect3DDevice.SetLight(this.aLong10252, i_3, this.aLong10253);
			IDirect3DDevice.LightEnable(this.aLong10252, i_3, true);
		}

		while (i_1 < this.anInt8831) {
			IDirect3DDevice.LightEnable(this.aLong10252, i_1 + 2, false);
			++i_1;
		}

	}

	void method13986(int i_1) {
		IDirect3DDevice.SetRenderState(this.aLong10252, 168, i_1);
	}

	void method14238() {
		IDirect3DDevice.method14471(this.aLong10252, 15, this.aBool8818);
	}

	void method13894() {
		switch (this.aClass73_8733.anInt729) {
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 6);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 2);
		}

		switch (this.anInt8844) {
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 1);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 2);
		}

	}

	void method14019() {
		IDirect3DDevice.SetScissorRect(this.aLong10252, this.anInt8823 + this.anInt8743, this.anInt8754 + this.anInt8822, this.anInt8744, this.anInt8742);
	}

	void method14013() {
		this.aFloat8819 = this.aFloat8697 - (float) this.anInt8680;
		this.aFloat8813 = this.aFloat8819 - (float) this.anInt8811;
		if (this.aFloat8813 < this.aFloat8726) {
			this.aFloat8813 = this.aFloat8726;
		}

		if (this.aBool8692) {
			IDirect3DDevice.method14470(this.aLong10252, 36, this.aFloat8813);
			IDirect3DDevice.method14470(this.aLong10252, 37, this.aFloat8819);
			IDirect3DDevice.SetRenderState(this.aLong10252, 34, this.anInt8810);
		}

	}

	synchronized void method15650(long long_1) {
		if (this.anInt10270 == this.anInt10268) {
			this.anInt10268 *= 2;
			long[] longs_3 = new long[this.anInt10268];
			System.arraycopy(this.aLongArray10271, 0, longs_3, 0, this.anInt10270);
			this.aLongArray10271 = longs_3;
		}

		this.aLongArray10271[this.anInt10270] = long_1;
		++this.anInt10270;
	}

	boolean method13954(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	void method14204() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 137, this.aBool8684 && !this.aBool8760);
		}

	}

	Class70 method13995(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	public float method13905() {
		return -0.5F;
	}

	public void method14161(int i_1, Interface4 interface4_2) {
		Class300 class300_3 = (Class300) interface4_2;
		IDirect3DDevice.SetStreamSource(this.aLong10252, i_1, class300_3.aLong3549, 0, class300_3.method5317());
	}

	void method13997(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(this.aLong10252, ((Class367) interface32_1).aLong4238);
	}

	public final void method13923(Class352 class352_1, int i_2, int i_3) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawPrimitive(this.aLong10252, method15654(class352_1), i_2, i_3);
	}

	public final void method14002(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawIndexedPrimitive(this.aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	byte[] getDXShaderData(String string_1) {
		return this.getCacheShaderData("dx", string_1);
	}

	public Shader loadShader(String name) {
		byte[] bytes_2 = this.getDXShaderData(name);
		if (bytes_2 == null) {
			return null;
		} else {
			ShaderLoader class114_3 = this.method13891(bytes_2);
			return new DirectXShader(this, class114_3);
		}
	}

	public final synchronized void method8398(int i_1) {
		for (int i_2 = 0; i_2 < this.anInt10270; i_2++) {
			IUnknown.Release(this.aLongArray10271[i_2]);
		}

		this.anInt10270 = 0;
		super.method8398(i_1);
	}

	static final int method15652(Class150 class150_0, Class76 class76_1) {
		switch (class76_1.anInt757) {
		case 3:
			if (Class150.aClass150_1949 == class150_0) {
				return 116;
			}
			break;
		case 4:
			switch (class150_0.anInt1958) {
			case 0:
				return 50;
			case 1:
				return 28;
			case 2:
			case 3:
			default:
				break;
			case 4:
				return 51;
			case 5:
				return 22;
			case 6:
				return 21;
			case 7:
				return Class27.anInt345;
			case 8:
				return 77;
			case 9:
				return Class27.anInt346;
			}
		case 5:
		case 6:
		case 7:
		default:
			break;
		case 8:
			if (Class150.aClass150_1949 == class150_0) {
				return 113;
			}
		}

		throw new IllegalArgumentException("");
	}

	static final int method15653(Class76 class76_0) {
		if (Class76.aClass76_752 == class76_0) {
			return 80;
		} else if (Class76.aClass76_749 == class76_0) {
			return 77;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	static final int method15654(Class352 class352_0) {
		switch (class352_0.anInt4101) {
		case 0:
			return 3;
		case 1:
			return 2;
		case 2:
			return 5;
		case 3:
			return 6;
		case 4:
			return 4;
		case 5:
			return 1;
		default:
			throw new IllegalArgumentException("");
		}
	}

	static boolean method15656(int i_0, int i_1, long long_2, int i_4, D3DPRESENT_PARAMETERS d3dpresent_parameters_5) {
		int i_6 = 0;
		int i_7 = 0;
		int i_8 = 0;

		try {
			D3DDISPLAYMODE d3ddisplaymode_10 = new D3DDISPLAYMODE();
			if (Class25.lessThanZero(IDirect3D.GetAdapterDisplayMode(long_2, i_0, d3ddisplaymode_10))) {
				return false;
			} else {
				label74: for (; i_4 >= 0; --i_4) {
					if (i_4 != 1) {
						i_8 = i_4 + 0;

						for (int i_11 = 0; i_11 < anIntArray10273.length; i_11++) {
							if (IDirect3D.CheckDeviceType(long_2, i_0, i_1, d3ddisplaymode_10.Format, anIntArray10273[i_11], true) == 0 && IDirect3D.CheckDeviceFormat(long_2, i_0, i_1, d3ddisplaymode_10.Format, 1, 1, anIntArray10273[i_11]) == 0 && (i_4 == 0 || IDirect3D.CheckDeviceMultiSampleType(long_2, i_0, i_1, anIntArray10273[i_11], true, i_8) == 0)) {
								for (int i_12 = 0; i_12 < anIntArray10272.length; i_12++) {
									if (IDirect3D.CheckDeviceFormat(long_2, i_0, i_1, d3ddisplaymode_10.Format, 2, 1, anIntArray10272[i_12]) == 0 && IDirect3D.CheckDepthStencilMatch(long_2, i_0, i_1, d3ddisplaymode_10.Format, anIntArray10273[i_11], anIntArray10272[i_12]) == 0 && (i_4 == 0 || IDirect3D.CheckDeviceMultiSampleType(long_2, i_0, i_1, anIntArray10272[i_11], true, i_8) == 0)) {
										i_7 = anIntArray10273[i_11];
										i_6 = anIntArray10272[i_12];
										break label74;
									}
								}
							}
						}
					}
				}

				if (i_4 >= 0 && i_7 != 0 && i_6 != 0) {
					d3dpresent_parameters_5.BackBufferFormat = i_7;
					d3dpresent_parameters_5.AutoDepthStencilFormat = i_6;
					d3dpresent_parameters_5.MultiSampleType = i_8;
					d3dpresent_parameters_5.MultiSampleQuality = 0;
					boolean bool_9 = true;
					return bool_9;
				} else {
					return false;
				}
			}
		} catch (Throwable throwable_13) {
			return false;
		}
	}

	final void method15657(Class360_Sub1 class360_sub1_1) {
		this.method15662(class360_sub1_1);
		if (!this.aBoolArray10255[this.anInt8780]) {
			IDirect3DDevice.SetSamplerState(this.aLong10252, this.anInt8780, 1, 1);
			this.aBoolArray10255[this.anInt8780] = true;
		}

		if (!this.aBoolArray10256[this.anInt8780]) {
			IDirect3DDevice.SetSamplerState(this.aLong10252, this.anInt8780, 2, 1);
			this.aBoolArray10256[this.anInt8780] = true;
		}

	}

	void method14098(int i_1) {
		int i_2 = (i_1 & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(this.aLong10252, 8, i_2);
	}

	void method14205() {
		if (this.aClass158_5853 != null) {
			IDirect3DDevice.SetViewport(this.aLong10252, this.anInt8823 + this.anInt8749, this.anInt8754 + this.anInt8776, this.anInt8751, this.anInt8752, this.aFloat8735, this.aFloat8736);
		}

	}

	void method13992(boolean bool_1) {
		IDirect3DDevice.method14471(this.aLong10252, 161, bool_1);
	}

	void method8531() {
		super.method8397();
		if (this.aLong10259 != 0L) {
			D3DLIGHT.Destroy(this.aLong10259);
			this.aLong10259 = 0L;
		}

		if (this.aLong10250 != 0L) {
			D3DLIGHT.Destroy(this.aLong10250);
			this.aLong10250 = 0L;
		}

		if (this.aLong10253 != 0L) {
			D3DLIGHT.Destroy(this.aLong10253);
			this.aLong10253 = 0L;
		}

		if (this.aLong10252 != 0L) {
			IDirect3DDevice.Destroy(this.aLong10252);
			this.aLong10252 = 0L;
		}

		if (this.aLong10246 != 0L) {
			IUnknown.Release(this.aLong10246);
			this.aLong10246 = 0L;
		}

	}

	void method14121() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 137, this.aBool8684 && !this.aBool8760);
		}

	}

	void method13916() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8785[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 4, i_1);
		}

	}

	Interface6 method14008(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		return new Class360_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
	}

	void method14197() {
		IDirect3DDevice.method14471(this.aLong10252, 15, this.aBool8818);
	}

	void method13948() {
		if (this.aBool8692) {
			D3DLIGHT.SetAmbient(this.aLong10259, this.aFloat8766 * this.aFloat8769, this.aFloat8767 * this.aFloat8769, this.aFloat8768 * this.aFloat8769, 0.0F);
			this.aBool10254 = false;
		}

	}

	public void method8507() {
	}

	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		IDirect3DDevice.EndScene(this.aLong10252);
		int i_3 = this.aClass158_Sub2_5841.method14344();
		if (Class25.lessThanZero(i_3)) {
			if (i_3 != -2005530520) {
				if (++this.anInt10262 > 50) {
					throw new Exception_Sub3();
				}
			} else {
				this.aClass158_Sub2_5841.method212();
				this.method15639();
				((Class158_Sub2_Sub2_Sub2) this.aClass158_Sub2_5841).method210();
			}
		} else {
			this.anInt10262 = 0;
		}

		IDirect3DDevice.BeginScene(this.aLong10252);
		if (this.anInterface22_5834 != null) {
			this.anInterface22_5834.method161(-2073019355);
		}

	}

	static final int method15661(Class68 class68_0) {
		switch (class68_0.anInt686) {
		case 0:
			return 7;
		case 1:
			return 10;
		case 2:
			return 2;
		case 3:
			return 26;
		case 4:
			return 4;
		default:
			throw new IllegalArgumentException();
		}
	}

	public void fd(int i_1, int i_2) {
		IDirect3DDevice.Clear(this.aLong10252, i_1, i_2, 1.0F, 0);
	}

	public void fu(int i_1, int i_2) {
		IDirect3DDevice.Clear(this.aLong10252, i_1, i_2, 1.0F, 0);
	}

	void method14236(int i_1) {
		int i_2 = (i_1 & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(this.aLong10252, 8, i_2);
	}

	Interface6 method14143(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, 0, 0);
	}

	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub3_Sub1(this);
	}

	final void method15662(Class360 class360_1) {
		IDirect3DDevice.SetTexture(this.aLong10252, this.anInt8780, class360_1.method6245());
		if (this.aBool8692 && !this.aBoolArray10257[this.anInt8780]) {
			this.aBoolArray10257[this.anInt8780] = true;
			this.method13980();
			this.method13979();
		}

	}

	public final synchronized void method8488(int i_1) {
		for (int i_2 = 0; i_2 < this.anInt10270; i_2++) {
			IUnknown.Release(this.aLongArray10271[i_2]);
		}

		this.anInt10270 = 0;
		super.method8398(i_1);
	}

	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(this.aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(this.aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(this.aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, this.aLong8695);
			this.aByteBuffer8838.clear();
			this.aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	public boolean method14045() {
		return (this.aD3DCAPS10267.PixelShaderVersion & 0xffff) >= 257;
	}

	public Shader method14049(String string_1) {
		byte[] bytes_2 = this.getDXShaderData(string_1);
		if (bytes_2 == null) {
			return null;
		} else {
			ShaderLoader class114_3 = this.method13891(bytes_2);
			return new DirectXShader(this, class114_3);
		}
	}

	public void method14056(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		IDirect3DDevice.SetTransform(this.aLong10252, 256, matrix44arr_1.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 2, matrix44arr_2.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 3, matrix44arr_3.buf);
	}

	public void method14057(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		IDirect3DDevice.SetTransform(this.aLong10252, 256, matrix44arr_1.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 2, matrix44arr_2.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 3, matrix44arr_3.buf);
	}

	public void method14058(Matrix44Arr matrix44arr_1, Matrix44Arr matrix44arr_2, Matrix44Arr matrix44arr_3) {
		IDirect3DDevice.SetTransform(this.aLong10252, 256, matrix44arr_1.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 2, matrix44arr_2.buf);
		IDirect3DDevice.SetTransform(this.aLong10252, 3, matrix44arr_3.buf);
	}

	public float method14091() {
		return -0.5F;
	}

	void method14087() {
		if (this.aClass158_5853 != null) {
			IDirect3DDevice.SetViewport(this.aLong10252, this.anInt8823 + this.anInt8749, this.anInt8754 + this.anInt8776, this.anInt8751, this.anInt8752, this.aFloat8735, this.aFloat8736);
		}

	}

	public Interface8 method8621(int i_1, int i_2) {
		return new Class307(this, Class76.aClass76_749, i_1, i_2);
	}

	void method14088() {
		IDirect3DDevice.SetScissorRect(this.aLong10252, this.anInt8823 + this.anInt8743, this.anInt8754 + this.anInt8822, this.anInt8744, this.anInt8742);
	}

	public final void method14228(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawIndexedPrimitive(this.aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	void method13909() {
		IDirect3DDevice.method14471(this.aLong10252, 174, this.aBool8843);
	}

	public void method14107(Matrix44Arr matrix44arr_1) {
		matrix44arr_1.method6523(this.aClass384_10261);
	}

	void method13924() {
		if (this.aBool8692 && !this.aBool10254) {
			IDirect3DDevice.LightEnable(this.aLong10252, 0, false);
			IDirect3DDevice.LightEnable(this.aLong10252, 1, false);
			IDirect3DDevice.SetLight(this.aLong10252, 0, this.aLong10259);
			IDirect3DDevice.SetLight(this.aLong10252, 1, this.aLong10250);
			IDirect3DDevice.LightEnable(this.aLong10252, 0, true);
			IDirect3DDevice.LightEnable(this.aLong10252, 1, true);
			this.aBool10254 = true;
		}

	}

	void method14092(boolean bool_1) {
		IDirect3DDevice.method14471(this.aLong10252, 161, bool_1);
	}

	void method14169() {
		IDirect3DDevice.method14471(this.aLong10252, 14, this.aBool8755 && this.aBool8756);
	}

	public void method8483() {
		long long_1 = IDirect3DDevice.CreateEventQuery(this.aLong10252);
		if (Class25.gtOrEqualToZero(IDirect3DEventQuery.Issue(long_1))) {
			while (true) {
				int i_3 = IDirect3DEventQuery.IsSignaled(long_1);
				if (i_3 != 1) {
					break;
				}

				Thread.yield();
			}
		}

		IUnknown.Release(long_1);
	}

	void method14122() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 137, this.aBool8684 && !this.aBool8760);
		}

	}

	void method14025() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 137, this.aBool8684 && !this.aBool8760);
		}

	}

	void method14117() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 137, this.aBool8684 && !this.aBool8760);
		}

	}

	void method14124() {
		if (this.aBool8692) {
			D3DLIGHT.SetAmbient(this.aLong10259, this.aFloat8766 * this.aFloat8769, this.aFloat8767 * this.aFloat8769, this.aFloat8768 * this.aFloat8769, 0.0F);
			this.aBool10254 = false;
		}

	}

	void method14125() {
		if (this.aBool8692) {
			D3DLIGHT.SetAmbient(this.aLong10259, this.aFloat8766 * this.aFloat8769, this.aFloat8767 * this.aFloat8769, this.aFloat8768 * this.aFloat8769, 0.0F);
			this.aBool10254 = false;
		}

	}

	void method14026() {
		if (this.aBool8692) {
			D3DLIGHT.SetAmbient(this.aLong10259, this.aFloat8766 * this.aFloat8769, this.aFloat8767 * this.aFloat8769, this.aFloat8768 * this.aFloat8769, 0.0F);
			this.aBool10254 = false;
		}

	}

	void method14127() {
		if (this.aBool8692) {
			float f_1 = this.aBool8759 ? this.aFloat8770 : 0.0F;
			float f_2 = this.aBool8759 ? -this.aFloat8826 : 0.0F;
			D3DLIGHT.SetDiffuse(this.aLong10259, f_1 * this.aFloat8766, f_1 * this.aFloat8767, f_1 * this.aFloat8768, 0.0F);
			D3DLIGHT.SetDiffuse(this.aLong10250, f_2 * this.aFloat8766, f_2 * this.aFloat8767, f_2 * this.aFloat8768, 0.0F);
			this.aBool10254 = false;
		}

	}

	void method13915() {
		if (this.aBool8692) {
			D3DLIGHT.SetDirection(this.aLong10259, -this.aFloatArray8747[0], -this.aFloatArray8747[1], -this.aFloatArray8747[2]);
			D3DLIGHT.SetDirection(this.aLong10250, -this.aFloatArray8762[0], -this.aFloatArray8762[1], -this.aFloatArray8762[2]);
			this.aBool10254 = false;
		}

	}

	void method13913() {
		if (this.aBool8692 && !this.aBool10254) {
			IDirect3DDevice.LightEnable(this.aLong10252, 0, false);
			IDirect3DDevice.LightEnable(this.aLong10252, 1, false);
			IDirect3DDevice.SetLight(this.aLong10252, 0, this.aLong10259);
			IDirect3DDevice.SetLight(this.aLong10252, 1, this.aLong10250);
			IDirect3DDevice.LightEnable(this.aLong10252, 0, true);
			IDirect3DDevice.LightEnable(this.aLong10252, 1, true);
			this.aBool10254 = true;
		}

	}

	public Class152 method8467(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub2(this, canvas_1, i_2, i_3, false);
	}

	void method14132() {
		int i_1;
		for (i_1 = 0; i_1 < this.anInt8773; i_1++) {
			Node_Sub24 class282_sub24_2 = this.aNode_Sub24Array8716[i_1];
			int i_3 = i_1 + 2;
			int i_4 = class282_sub24_2.method12371(-2144308312);
			float f_5 = class282_sub24_2.method12395(-747591590) / 255.0F;
			D3DLIGHT.SetPosition(this.aLong10253, (float) class282_sub24_2.method12368((byte) -50), (float) class282_sub24_2.method12369(), (float) class282_sub24_2.method12394(1436724778));
			D3DLIGHT.SetDiffuse(this.aLong10253, (float) (i_4 >> 16 & 0xff) * f_5, (float) (i_4 >> 8 & 0xff) * f_5, (float) (i_4 & 0xff) * f_5, 0.0F);
			D3DLIGHT.SetAttenuation(this.aLong10253, 0.0F, 0.0F, 1.0F / (float) (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			D3DLIGHT.SetRange(this.aLong10253, (float) class282_sub24_2.method12370());
			IDirect3DDevice.SetLight(this.aLong10252, i_3, this.aLong10253);
			IDirect3DDevice.LightEnable(this.aLong10252, i_3, true);
		}

		while (i_1 < this.anInt8831) {
			IDirect3DDevice.LightEnable(this.aLong10252, i_1 + 2, false);
			++i_1;
		}

	}

	Interface6 method14048(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		return new Class360_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
	}

	boolean method14134(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	boolean method14136(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	boolean method13975(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	boolean method14137(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(this.aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(this.aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(this.aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, this.aLong8695);
			this.aByteBuffer8838.clear();
			this.aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	public void method8480(boolean bool_1) {
	}

	Interface6 method14142(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	Interface6 method14216(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	final void method15666(long long_1) {
		this.aLong10269 = long_1;
		IDirect3DDevice.SetVertexShader(this.aLong10252, long_1);
	}

	void method14172() {
		this.method13949();
		this.method13951();
	}

	Interface6 method14145(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
	}

	public RendererInfo method8481() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier_1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(this.aLong10246, this.anInt10260, 0, d3dadapter_identifier_1);
		return new RendererInfo(d3dadapter_identifier_1.VendorID, "Direct3D", 9, d3dadapter_identifier_1.Description, d3dadapter_identifier_1.DriverVersion);
	}

	void method13899() {
		for (Node node_1 = this.aClass473_10249.getBack(); node_1 != null; node_1 = this.aClass473_10249.getPrevious()) {
			Node_Sub9 class282_sub9_2 = (Node_Sub9) node_1;
			Interface33 interface33_3 = class282_sub9_2.anInterface33_7538;
			interface33_3.method210();
			if (interface33_3 == this.aClass158_5853) {
				interface33_3.method213();
			}
		}

		super.method13899();
	}

	public void method14153() {
		if (this.aBoolArray10257[this.anInt8780]) {
			this.aBoolArray10257[this.anInt8780] = false;
			IDirect3DDevice.SetTexture(this.aLong10252, this.anInt8780, 0L);
			this.method13980();
			this.method13979();
		}

	}

	void method14217(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(this.aLong10252, ((Class367) interface32_1).aLong4238);
	}

	Interface29 method14022(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	Interface29 method14148(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	Interface29 method14149(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	void method13922() {
		IDirect3DDevice.method14471(this.aLong10252, 174, this.aBool8843);
	}

	public void method14154() {
		if (this.aBoolArray10257[this.anInt8780]) {
			this.aBoolArray10257[this.anInt8780] = false;
			IDirect3DDevice.SetTexture(this.aLong10252, this.anInt8780, 0L);
			this.method13980();
			this.method13979();
		}

	}

	final void method14224(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		if (this.aBool8692) {
			int i_5 = 0;
			byte b_6;
			switch (i_1) {
			case 1:
				b_6 = 3;
				break;
			case 2:
				b_6 = 26;
				break;
			default:
				b_6 = 2;
			}

			if (bool_3) {
				i_5 |= 0x20;
			}

			if (bool_4) {
				i_5 |= 0x10;
			}

			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, b_6, method15648(class67_2) | i_5);
		}

	}

	final void method14162(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		if (this.aBool8692) {
			int i_5 = 0;
			byte b_6;
			switch (i_1) {
			case 1:
				b_6 = 3;
				break;
			case 2:
				b_6 = 26;
				break;
			default:
				b_6 = 2;
			}

			if (bool_3) {
				i_5 |= 0x20;
			}

			if (bool_4) {
				i_5 |= 0x10;
			}

			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, b_6, method15648(class67_2) | i_5);
		}

	}

	final void method14166(int i_1, Class67 class67_2, boolean bool_3) {
		if (this.aBool8692) {
			int i_4 = 0;
			byte b_5;
			switch (i_1) {
			case 1:
				b_5 = 6;
				break;
			case 2:
				b_5 = 27;
				break;
			default:
				b_5 = 5;
			}

			if (bool_3) {
				i_4 |= 0x10;
			}

			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, b_5, method15648(class67_2) | i_4);
		}

	}

	final void method14179() {
		if (this.aBool8692) {
			IDirect3DDevice.SetRenderState(this.aLong10252, 60, this.anInt8758);
		}

	}

	final void method14180() {
		if (this.aBool8692) {
			IDirect3DDevice.SetRenderState(this.aLong10252, 60, this.anInt8758);
		}

	}

	void method13991() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 28, this.aBool8809 && this.aBool8808 && this.anInt8811 >= 0);
		}

	}

	final void method14181() {
		if (this.aBool8692) {
			IDirect3DDevice.SetRenderState(this.aLong10252, 60, this.anInt8758);
		}

	}

	static final int method15667(Class37 class37_0) {
		switch (class37_0.anInt390) {
		case 1:
			return 2;
		case 2:
			return 1;
		case 3:
			return 3;
		case 4:
			return 256;
		case 5:
			return 4;
		default:
			return 0;
		}
	}

	void method13945() {
		IDirect3DDevice.method14471(this.aLong10252, 15, this.aBool8818);
	}

	void method14184() {
	}

	void method14185() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8784[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 1, i_1);
		}

	}

	void method14186() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8784[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 1, i_1);
		}

	}

	void method14187() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8784[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 1, i_1);
		}

	}

	void method14173(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(this.aLong10252, ((Class367) interface32_1).aLong4238);
	}

	boolean method14135(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(this.aLong10246, this.anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(this.aLong10246, this.anInt10260, this.anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	void method14190() {
		if (this.aBool8692) {
			int i_1 = this.aBoolArray10257[this.anInt8780] ? method15661(this.aClass68Array8785[this.anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 4, i_1);
		}

	}

	public boolean method14146() {
		return (this.aD3DCAPS10267.VertexShaderVersion & 0xffff) >= 257;
	}

	final void method14063() {
		if (this.aBool8692) {
			IDirect3DDevice.SetRenderState(this.aLong10252, 60, this.anInt8758);
		}

	}

	void method14020() {
		switch (this.aClass73_8733.anInt729) {
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 6);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 2);
		}

		switch (this.anInt8844) {
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 1);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 2);
		}

	}

	void method14199() {
		switch (this.aClass73_8733.anInt729) {
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 6);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(this.aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(this.aLong10252, 20, 2);
		}

		switch (this.anInt8844) {
		case 0:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 1);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(this.aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(this.aLong10252, 208, 2);
		}

	}

	void method14200() {
		IDirect3DDevice.method14471(this.aLong10252, 27, this.aBool8817);
	}

	void method13914() {
		IDirect3DDevice.method14471(this.aLong10252, 27, this.aBool8817);
	}

	void method14203() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 28, this.aBool8809 && this.aBool8808 && this.anInt8811 >= 0);
		}

	}

	void method14015() {
		if (this.aBool8692) {
			IDirect3DDevice.method14471(this.aLong10252, 28, this.aBool8809 && this.aBool8808 && this.anInt8811 >= 0);
		}

	}

	Interface6 method14090(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
	}

	final Interface32 method14206(boolean bool_1) {
		return new Class367(this, Class76.aClass76_752, bool_1);
	}

	final Interface32 method14207(boolean bool_1) {
		return new Class367(this, Class76.aClass76_752, bool_1);
	}

	final Interface4 method13925(boolean bool_1) {
		return new Class300(this, bool_1);
	}

	Class70 method14209(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	Class70 method14210(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	Class70 method14017(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	Interface6 method14072(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	public void method14213(int i_1, Interface4 interface4_2) {
		Class300 class300_3 = (Class300) interface4_2;
		IDirect3DDevice.SetStreamSource(this.aLong10252, i_1, class300_3.aLong3549, 0, class300_3.method5317());
	}

	public void method14214(int i_1, Interface4 interface4_2) {
		Class300 class300_3 = (Class300) interface4_2;
		IDirect3DDevice.SetStreamSource(this.aLong10252, i_1, class300_3.aLong3549, 0, class300_3.method5317());
	}

	void method14215(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(this.aLong10252, ((Class367) interface32_1).aLong4238);
	}

	void method14047() {
		this.method13949();
		this.method13951();
	}

	void method8397() {
		super.method8397();
		if (this.aLong10259 != 0L) {
			D3DLIGHT.Destroy(this.aLong10259);
			this.aLong10259 = 0L;
		}

		if (this.aLong10250 != 0L) {
			D3DLIGHT.Destroy(this.aLong10250);
			this.aLong10250 = 0L;
		}

		if (this.aLong10253 != 0L) {
			D3DLIGHT.Destroy(this.aLong10253);
			this.aLong10253 = 0L;
		}

		if (this.aLong10252 != 0L) {
			IDirect3DDevice.Destroy(this.aLong10252);
			this.aLong10252 = 0L;
		}

		if (this.aLong10246 != 0L) {
			IUnknown.Release(this.aLong10246);
			this.aLong10246 = 0L;
		}

	}

	public final void method13959(Class352 class352_1, int i_2, int i_3) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawPrimitive(this.aLong10252, method15654(class352_1), i_2, i_3);
	}

	public final void method14101(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawIndexedPrimitive(this.aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	public final void method13983(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawIndexedPrimitive(this.aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	void method13999() {
		this.aFloat8819 = this.aFloat8697 - (float) this.anInt8680;
		this.aFloat8813 = this.aFloat8819 - (float) this.anInt8811;
		if (this.aFloat8813 < this.aFloat8726) {
			this.aFloat8813 = this.aFloat8726;
		}

		if (this.aBool8692) {
			IDirect3DDevice.method14470(this.aLong10252, 36, this.aFloat8813);
			IDirect3DDevice.method14470(this.aLong10252, 37, this.aFloat8819);
			IDirect3DDevice.SetRenderState(this.aLong10252, 34, this.anInt8810);
		}

	}

	public final void method14229(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawIndexedPrimitive(this.aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	public final void method14230(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (this.aClass115_Sub1_10251 != null) {
			this.aClass115_Sub1_10251.method14591();
		}

		IDirect3DDevice.DrawIndexedPrimitive(this.aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	void method14235(int i_1) {
		int i_2 = (i_1 & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(this.aLong10252, 8, i_2);
	}

	void method14182() {
		if (this.aLong10269 == 0L && this.aClass37Array8783[this.anInt8780] != Class37.aClass37_393) {
			if (this.aClass37Array8783[this.anInt8780] == Class37.aClass37_388) {
				IDirect3DDevice.SetTransform(this.aLong10252, 16 + this.anInt8780, this.aClass384Array8782[this.anInt8780].method6548(this.aFloatArray10264));
			} else {
				IDirect3DDevice.SetTransform(this.aLong10252, 16 + this.anInt8780, this.aClass384Array8782[this.anInt8780].method6517(this.aFloatArray10264));
			}

			int i_1 = method15667(this.aClass37Array8783[this.anInt8780]);
			if (i_1 != this.anIntArray10266[this.anInt8780]) {
				IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 24, i_1);
				this.anIntArray10266[this.anInt8780] = i_1;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(this.aLong10252, this.anInt8780, 24, 0);
			this.anIntArray10266[this.anInt8780] = 0;
		}

	}

	Interface31 method14237(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	Interface31 method14011(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	Interface31 method14239(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	public void method13964() {
		if (this.aBoolArray10257[this.anInt8780]) {
			this.aBoolArray10257[this.anInt8780] = false;
			IDirect3DDevice.SetTexture(this.aLong10252, this.anInt8780, 0L);
			this.method13980();
			this.method13979();
		}

	}

	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(this.aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(this.aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(this.aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, this.aLong8695);
			this.aByteBuffer8838.clear();
			this.aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	Interface6 method14144(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5, int i_6, int i_7) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, i_6, i_7);
	}

	Interface29 method14064(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	public boolean method13887() {
		return (this.aD3DCAPS10267.VertexShaderVersion & 0xffff) >= 257;
	}

	public void method8445() {
	}

	final Interface4 method13994(boolean bool_1) {
		return new Class300(this, bool_1);
	}

	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(this.aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(this.aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(this.aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, this.aLong8695);
			this.aByteBuffer8838.clear();
			this.aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	void method8486() {
		super.method8397();
		if (this.aLong10259 != 0L) {
			D3DLIGHT.Destroy(this.aLong10259);
			this.aLong10259 = 0L;
		}

		if (this.aLong10250 != 0L) {
			D3DLIGHT.Destroy(this.aLong10250);
			this.aLong10250 = 0L;
		}

		if (this.aLong10253 != 0L) {
			D3DLIGHT.Destroy(this.aLong10253);
			this.aLong10253 = 0L;
		}

		if (this.aLong10252 != 0L) {
			IDirect3DDevice.Destroy(this.aLong10252);
			this.aLong10252 = 0L;
		}

		if (this.aLong10246 != 0L) {
			IUnknown.Release(this.aLong10246);
			this.aLong10246 = 0L;
		}

	}

	public void method8484() {
		long long_1 = IDirect3DDevice.CreateEventQuery(this.aLong10252);
		if (Class25.gtOrEqualToZero(IDirect3DEventQuery.Issue(long_1))) {
			while (true) {
				int i_3 = IDirect3DEventQuery.IsSignaled(long_1);
				if (i_3 != 1) {
					break;
				}

				Thread.yield();
			}
		}

		IUnknown.Release(long_1);
	}

	void method14240(int i_1) {
		IDirect3DDevice.SetRenderState(this.aLong10252, 168, i_1);
	}

}
