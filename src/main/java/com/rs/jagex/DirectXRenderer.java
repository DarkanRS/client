package com.rs.jagex;

import jagdx.*;

import java.awt.*;

public class DirectXRenderer extends HardwareRenderer {

	static int[] anIntArray10272 = {77, 80};
	static int[] anIntArray10273 = {22, 23};
	public static AbstractRenderer create(Canvas canvas_0, ImageLoader interface22_1, Index index_2, int i_3) {
		try {
			boolean bool_5 = HardwareRenderer.method13893();
			if (!bool_5)
				throw new RuntimeException("");
			if (!LibraryLoader.getLoader().loadLibrary("jagdx"))
				throw new RuntimeException("");
			else {
				AbstractRenderer graphicalrenderer_4 = method15638(canvas_0, interface22_1, index_2, Integer.valueOf(i_3));
				return graphicalrenderer_4;
			}
		} catch (Throwable throwable_7) {
			throw new RuntimeException("");
		}
	}
	static AbstractRenderer method15638(Canvas canvas, ImageLoader imageLoader, Index index_2, Integer integer_3) {
		DirectXRenderer renderer = null;
		byte b_6 = 0;
		byte b_7 = 1;
		long long_8 = IDirect3D.Direct3DCreate();
		D3DCAPS d3dcaps_10 = new D3DCAPS();
		IDirect3D.GetDeviceCaps(long_8, b_6, b_7, d3dcaps_10);
		if ((d3dcaps_10.RasterCaps & 0x1000000) == 0)
			throw new RuntimeException("");
		if ((d3dcaps_10.MaxSimultaneousTextures < 2) || ((d3dcaps_10.TextureOpCaps & 0x2) == 0) || ((d3dcaps_10.TextureOpCaps & 0x8) == 0) || ((d3dcaps_10.TextureOpCaps & 0x40) == 0))
			throw new RuntimeException("");
		else if ((d3dcaps_10.TextureOpCaps & 0x200) == 0)
			throw new RuntimeException("");
		else if ((d3dcaps_10.TextureOpCaps & 0x2000000) == 0)
			throw new RuntimeException("");
		else if ((d3dcaps_10.SrcBlendCaps & d3dcaps_10.DestBlendCaps & 0x10) == 0)
			throw new RuntimeException("");
		else if ((d3dcaps_10.SrcBlendCaps & d3dcaps_10.DestBlendCaps & 0x20) == 0)
			throw new RuntimeException("");
		else if ((d3dcaps_10.SrcBlendCaps & d3dcaps_10.DestBlendCaps & 0x2) == 0)
			throw new RuntimeException("");
		else if (d3dcaps_10.MaxActiveLights > 0 && d3dcaps_10.MaxActiveLights < 2)
			throw new RuntimeException("");
		else if (d3dcaps_10.MaxStreams < 5)
			throw new RuntimeException("");
		else {
			D3DPRESENT_PARAMETERS d3DPRESENTParameters = new D3DPRESENT_PARAMETERS(canvas);
			d3DPRESENTParameters.Windowed = true;
			d3DPRESENTParameters.EnableAutoDepthStencil = true;
			d3DPRESENTParameters.BackBufferWidth = canvas.getWidth();
			d3DPRESENTParameters.BackBufferHeight = canvas.getHeight();
			d3DPRESENTParameters.BackBufferCount = 1;
			d3DPRESENTParameters.PresentationInterval = Integer.MIN_VALUE;
			if (!method15656(b_6, b_7, long_8, integer_3.intValue(), d3DPRESENTParameters))
				throw new RuntimeException("");
			else {
				int i_12 = 0;
				if ((d3dcaps_10.DevCaps & 0x100000) != 0)
					i_12 |= 0x10;

				long long_13 = 0L;

				try {
					long_13 = IDirect3D.CreateDeviceContext(long_8, b_6, b_7, canvas, i_12 | 0x40, d3DPRESENTParameters);
				} catch (RuntimeException_Sub1 runtimeexception_sub1_17) {
					long_13 = IDirect3D.CreateDeviceContext(long_8, b_6, b_7, canvas, i_12 & -1048577 | 0x20, d3DPRESENTParameters);
				}
				renderer = new DirectXRenderer(b_6, b_7, long_8, long_13, d3DPRESENTParameters, d3dcaps_10, imageLoader, index_2, integer_3.intValue());
				if (!renderer.mapCanvasToTBD.containsKey(canvas)) {
					Class459.method7679(canvas);
					renderer.method8411(canvas, new Class158_Sub2_Sub2_Sub2(renderer, canvas, canvas.getWidth(), canvas.getHeight(), true));
				}

				renderer.method8412(canvas);
				renderer.method14147();
				return renderer;
			}
		}
	}
	static int method15648(Class67 class67_0) {
		return switch (class67_0.anInt681) {
		case 0 -> 3;
		case 1 -> 0;
		case 2 -> 2;
		case 3 -> 1;
		default -> throw new IllegalArgumentException();
		};
	}
	static int method15652(Class150 class150_0, Class76 class76_1) {
		switch (class76_1.ordinal()) {
		case 3:
			if (Class150.aClass150_1949 == class150_0)
				return 116;
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
			if (Class150.aClass150_1949 == class150_0)
				return 113;
		}

		throw new IllegalArgumentException("");
	}
	static int method15653(Class76 class76_0) {
		if (Class76.aClass76_752 == class76_0)
			return 80;
		if (Class76.aClass76_749 == class76_0)
			return 77;
		else
			throw new IllegalArgumentException("");
	}
	static int method15654(Class352 class352_0) {
		return switch (class352_0.anInt4101) {
		case 0 -> 3;
		case 1 -> 2;
		case 2 -> 5;
		case 3 -> 6;
		case 4 -> 4;
		case 5 -> 1;
		default -> throw new IllegalArgumentException("");
		};
	}
	static boolean method15656(int i_0, int i_1, long long_2, int i_4, D3DPRESENT_PARAMETERS d3dpresent_parameters_5) {
		int i_6 = 0;
		int i_7 = 0;
		int i_8 = 0;

		try {
			D3DDISPLAYMODE d3ddisplaymode_10 = new D3DDISPLAYMODE();
			if (Class25.lessThanZero(IDirect3D.GetAdapterDisplayMode(long_2, i_0, d3ddisplaymode_10)))
				return false;
			label74:
				for (; i_4 >= 0; --i_4)
					if (i_4 != 1) {
						i_8 = i_4;

						for (int i_11 = 0; i_11 < anIntArray10273.length; i_11++)
							if (IDirect3D.CheckDeviceType(long_2, i_0, i_1, d3ddisplaymode_10.Format, anIntArray10273[i_11], true) == 0 && IDirect3D.CheckDeviceFormat(long_2, i_0, i_1, d3ddisplaymode_10.Format, 1, 1, anIntArray10273[i_11]) == 0 && (i_4 == 0 || IDirect3D.CheckDeviceMultiSampleType(long_2, i_0, i_1, anIntArray10273[i_11], true, i_8) == 0))
								for (int i_12 = 0; i_12 < anIntArray10272.length; i_12++)
									if (IDirect3D.CheckDeviceFormat(long_2, i_0, i_1, d3ddisplaymode_10.Format, 2, 1, anIntArray10272[i_12]) == 0 && IDirect3D.CheckDepthStencilMatch(long_2, i_0, i_1, d3ddisplaymode_10.Format, anIntArray10273[i_11], anIntArray10272[i_12]) == 0 && (i_4 == 0 || IDirect3D.CheckDeviceMultiSampleType(long_2, i_0, i_1, anIntArray10272[i_11], true, i_8) == 0)) {
										i_7 = anIntArray10273[i_11];
										i_6 = anIntArray10272[i_12];
										break label74;
									}
					}

			if (i_4 >= 0 && i_7 != 0 && i_6 != 0) {
				d3dpresent_parameters_5.BackBufferFormat = i_7;
				d3dpresent_parameters_5.AutoDepthStencilFormat = i_6;
				d3dpresent_parameters_5.MultiSampleType = i_8;
				d3dpresent_parameters_5.MultiSampleQuality = 0;
				boolean bool_9 = true;
				return bool_9;
			} else
				return false;
		} catch (Throwable throwable_13) {
			return false;
		}
	}
	static int method15661(Class68 class68_0) {
		return switch (class68_0.anInt686) {
		case 0 -> 7;
		case 1 -> 10;
		case 2 -> 2;
		case 3 -> 26;
		case 4 -> 4;
		default -> throw new IllegalArgumentException();
		};
	}
	static int method15667(Class37 class37_0) {
		return switch (class37_0.anInt390) {
		case 1 -> 2;
		case 2 -> 1;
		case 3 -> 3;
		case 4 -> 256;
		case 5 -> 4;
		default -> 0;
		};
	}
	Class115_Sub1 aClass115_Sub1_10251;
	long aLong10246;
	long aLong10252;
	LinkedNodeList aClass473_10249 = new LinkedNodeList();
	int anInt10262;
	long aLong10259;
	long aLong10250;
	long aLong10253;
	boolean aBool10254;
	float[] aFloatArray10264 = new float[16];
	int anInt10268 = 128;
	int anInt10270;
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

	Matrix44 aClass384_10261;

	long aLong10269;

	DirectXRenderer(int i_1, int i_2, long long_3, long long_5, D3DPRESENT_PARAMETERS d3dpresent_parameters_7, D3DCAPS d3dcaps_8, ImageLoader interface22_9, Index index_10, int i_11) {
		super(interface22_9, index_10, i_11, 0);
		aLongArray10271 = new long[anInt10268];

		try {
			anInt10260 = i_1;
			anInt10244 = i_2;
			aLong10246 = long_3;
			aLong10252 = long_5;
			aD3DPRESENT_PARAMETERS10248 = d3dpresent_parameters_7;
			aD3DCAPS10267 = d3dcaps_8;
			aLong10259 = D3DLIGHT.Create();
			aLong10250 = D3DLIGHT.Create();
			aLong10253 = D3DLIGHT.Create();
			anInt8825 = aD3DCAPS10267.MaxSimultaneousTextures;
			anInt8799 = aD3DCAPS10267.MaxActiveLights > 0 ? aD3DCAPS10267.MaxActiveLights : 8;
						aBool10265 = (aD3DCAPS10267.TextureCaps & 0x2) == 0;
						aBool8827 = (aD3DCAPS10267.TextureCaps & 0x2000) != 0;
						aBool10247 = (aD3DCAPS10267.TextureCaps & 0x10000) != 0;
						aBool10263 = (aD3DCAPS10267.TextureCaps & 0x4000) != 0;
						aBool8718 = true;
						aBool8828 = anInt8709 > 0 || IDirect3D.CheckDeviceMultiSampleType(aLong10246, anInt10260, anInt10244, aD3DPRESENT_PARAMETERS10248.BackBufferFormat, true, 2) == 0;
						aBoolArray10255 = new boolean[anInt8825];
						aBoolArray10256 = new boolean[anInt8825];
						aBoolArray10257 = new boolean[anInt8825];
						aClass35Array10245 = new Class35[anInt8825];
						aBoolArray10258 = new boolean[anInt8825];
						anIntArray10266 = new int[anInt8825];
						Matrix44Var matrix44var_12 = new Matrix44Var();
						matrix44var_12.method5259(1.0F, -1.0f, 0.5F);
						matrix44var_12.method5219(0.0F, 0.0F, 0.5F);
						aClass384_10261 = new Matrix44();
						aClass384_10261.fromVarMatrix44(matrix44var_12);
						IDirect3DDevice.BeginScene(aLong10252);
		} catch (Throwable throwable_13) {
			throwable_13.printStackTrace();
			method8396();
			throw new RuntimeException("");
		}
	}

	@Override
	public int[] ab(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	@Override
	public void ba(int i_1, int i_2) {
		IDirect3DDevice.Clear(aLong10252, i_1, i_2, 1.0F, 0);
	}

	@Override
	public void fd(int i_1, int i_2) {
		IDirect3DDevice.Clear(aLong10252, i_1, i_2, 1.0F, 0);
	}

	@Override
	public void fi(int i_1, int i_2) {
		IDirect3DDevice.Clear(aLong10252, i_1, i_2, 1.0F, 0);
	}

	@Override
	protected void finalize() {
		super.finalize();
	}

	@Override
	public void fu(int i_1, int i_2) {
		IDirect3DDevice.Clear(aLong10252, i_1, i_2, 1.0F, 0);
	}

	byte[] getDXShaderData(String string_1) {
		return getCacheShaderData("dx", string_1);
	}

	@Override
	public int[] ke(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	@Override
	public int[] kf(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	@Override
	public int[] kh(int i_1, int i_2, int i_3, int i_4) {
		int[] ints_5 = null;
		long long_6 = IDirect3DDevice.GetRenderTarget(aLong10252, 0);
		long long_8 = IDirect3DDevice.CreateRenderTarget(aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.gtOrEqualToZero(IDirect3DDevice.StretchRect(aLong10252, long_6, i_1, i_2, i_3, i_4, long_8, 0, 0, i_3, i_4, 1))) {
			ints_5 = new int[i_3 * i_4];
			IDirect3DSurface.Download(long_8, 0, 0, i_3, i_4, i_3 * 4, 16, aLong8695);
			aByteBuffer8838.clear();
			aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_6);
		IUnknown.Release(long_8);
		return ints_5;
	}

	@Override
	public Shader loadShader(String name) {
		byte[] bytes_2 = getDXShaderData(name);
		if (bytes_2 == null)
			return null;
		ShaderLoader class114_3 = method13891(bytes_2);
		return new DirectXShader(this, class114_3);
	}

	@Override
	public boolean method13887() {
		return (aD3DCAPS10267.VertexShaderVersion & 0xffff) >= 257;
	}

	@Override
	public boolean method13888() {
		return (aD3DCAPS10267.PixelShaderVersion & 0xffff) >= 257;
	}

	@Override
	public void method13892(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		IDirect3DDevice.SetTransform(aLong10252, 256, matrix44_1.buf);
		IDirect3DDevice.SetTransform(aLong10252, 2, matrix44_2.buf);
		IDirect3DDevice.SetTransform(aLong10252, 3, matrix44_3.buf);
	}

	@Override
	void method13894() {
		switch (aClass73_8733.anInt729) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 6);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 2);
		}

		switch (anInt8844) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 1);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 2);
		}

	}

	@Override
	void method13897() {
		for (int i_1 = 0; i_1 < anInt8825; i_1++) {
			IDirect3DDevice.SetSamplerState(aLong10252, i_1, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong10252, i_1, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong10252, i_1, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong10252, i_1, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong10252, i_1, 2, 1);
			aClass35Array10245[i_1] = Class35.aClass35_382;
			boolean[] bools_2 = aBoolArray10255;
			aBoolArray10256[i_1] = true;
			bools_2[i_1] = true;
			aBoolArray10258[i_1] = false;
			anIntArray10266[i_1] = 0;
		}

		IDirect3DDevice.SetTextureStageState(aLong10252, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong10252, 9, 2);
		IDirect3DDevice.SetRenderState(aLong10252, 23, 4);
		IDirect3DDevice.SetRenderState(aLong10252, 25, 5);
		IDirect3DDevice.SetRenderState(aLong10252, 24, 0);
		IDirect3DDevice.SetRenderState(aLong10252, 22, 2);
		IDirect3DDevice.SetRenderState(aLong10252, 147, 1);
		IDirect3DDevice.SetRenderState(aLong10252, 145, 1);
		IDirect3DDevice.method14470(aLong10252, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong10252, 35, 3);
		IDirect3DDevice.method14470(aLong10252, 154, 1.0F);
		D3DLIGHT.SetType(aLong10259, 3);
		D3DLIGHT.SetType(aLong10250, 3);
		D3DLIGHT.SetType(aLong10253, 1);
		IDirect3DDevice.SetRenderState(aLong10252, 206, 1);
		aBool10254 = false;
		super.method13897();
	}

	@Override
	void method13899() {
		for (Node node_1 = aClass473_10249.getBack(); node_1 != null; node_1 = aClass473_10249.getPrevious()) {
			Node_Sub9 class282_sub9_2 = (Node_Sub9) node_1;
			Interface33 interface33_3 = class282_sub9_2.anInterface33_7538;
			interface33_3.method210();
			if (interface33_3 == aClass158_5853)
				interface33_3.method213();
		}

		super.method13899();
	}

	@Override
	void method13900() {
		for (Node node_1 = aClass473_10249.getBack(); node_1 != null; node_1 = aClass473_10249.getPrevious()) {
			Node_Sub9 class282_sub9_2 = (Node_Sub9) node_1;
			Interface33 interface33_3 = class282_sub9_2.anInterface33_7538;
			interface33_3.method212();
		}

		super.method13900();
	}

	@Override
	public float method13905() {
		return -0.5f;
	}

	@Override
	void method13909() {
		IDirect3DDevice.method14471(aLong10252, 174, aBool8843);
	}

	@Override
	void method13913() {
		if (aBool8692 && !aBool10254) {
			IDirect3DDevice.LightEnable(aLong10252, 0, false);
			IDirect3DDevice.LightEnable(aLong10252, 1, false);
			IDirect3DDevice.SetLight(aLong10252, 0, aLong10259);
			IDirect3DDevice.SetLight(aLong10252, 1, aLong10250);
			IDirect3DDevice.LightEnable(aLong10252, 0, true);
			IDirect3DDevice.LightEnable(aLong10252, 1, true);
			aBool10254 = true;
		}

	}

	@Override
	void method13914() {
		IDirect3DDevice.method14471(aLong10252, 27, aBool8817);
	}

	@Override
	void method13915() {
		if (aBool8692) {
			D3DLIGHT.SetDirection(aLong10259, -aFloatArray8747[0], -aFloatArray8747[1], -aFloatArray8747[2]);
			D3DLIGHT.SetDirection(aLong10250, -aFloatArray8762[0], -aFloatArray8762[1], -aFloatArray8762[2]);
			aBool10254 = false;
		}

	}

	@Override
	void method13916() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 4, i_1);
		}

	}

	@Override
	Interface1 method13917(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class360_Sub1(this, class150_1, i_2, i_3, i_4, bytes_6);
	}

	@Override
	void method13920() {
		if (aClass158_5853 != null)
			IDirect3DDevice.SetViewport(aLong10252, anInt8823 + anInt8749, anInt8754 + anInt8776, anInt8751, anInt8752, aFloat8735, aFloat8736);

	}

	@Override
	void method13921() {
		IDirect3DDevice.SetScissorRect(aLong10252, anInt8823 + anInt8743, anInt8754 + anInt8822, anInt8744, anInt8742);
	}

	@Override
	void method13922() {
		IDirect3DDevice.method14471(aLong10252, 174, aBool8843);
	}

	@Override
	public void method13923(Class352 class352_1, int i_2, int i_3) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawPrimitive(aLong10252, method15654(class352_1), i_2, i_3);
	}

	@Override
	void method13924() {
		if (aBool8692 && !aBool10254) {
			IDirect3DDevice.LightEnable(aLong10252, 0, false);
			IDirect3DDevice.LightEnable(aLong10252, 1, false);
			IDirect3DDevice.SetLight(aLong10252, 0, aLong10259);
			IDirect3DDevice.SetLight(aLong10252, 1, aLong10250);
			IDirect3DDevice.LightEnable(aLong10252, 0, true);
			IDirect3DDevice.LightEnable(aLong10252, 1, true);
			aBool10254 = true;
		}

	}

	@Override
	Interface4 method13925(boolean bool_1) {
		return new Class300(this, bool_1);
	}

	@Override
	public void method13933(Matrix44 matrix44_1) {
		matrix44_1.multiply(aClass384_10261);
	}

	@Override
	void method13945() {
		IDirect3DDevice.method14471(aLong10252, 15, aBool8818);
	}

	@Override
	void method13948() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			aBool10254 = false;
		}

	}

	@Override
	void method13949() {
		if (aBool8692) {
			float f_1 = aBool8759 ? aFloat8770 : 0.0F;
			float f_2 = aBool8759 ? -aFloat8826 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong10259, f_1 * aFloat8766, f_1 * aFloat8767, f_1 * aFloat8768, 0.0F);
			D3DLIGHT.SetDiffuse(aLong10250, f_2 * aFloat8766, f_2 * aFloat8767, f_2 * aFloat8768, 0.0F);
			aBool10254 = false;
		}

	}

	@Override
	void method13950() {
		if (aBool8692) {
			D3DLIGHT.SetDirection(aLong10259, -aFloatArray8747[0], -aFloatArray8747[1], -aFloatArray8747[2]);
			D3DLIGHT.SetDirection(aLong10250, -aFloatArray8762[0], -aFloatArray8762[1], -aFloatArray8762[2]);
			aBool10254 = false;
		}

	}

	@Override
	void method13951() {
		if (aBool8692 && !aBool10254) {
			IDirect3DDevice.LightEnable(aLong10252, 0, false);
			IDirect3DDevice.LightEnable(aLong10252, 1, false);
			IDirect3DDevice.SetLight(aLong10252, 0, aLong10259);
			IDirect3DDevice.SetLight(aLong10252, 1, aLong10250);
			IDirect3DDevice.LightEnable(aLong10252, 0, true);
			IDirect3DDevice.LightEnable(aLong10252, 1, true);
			aBool10254 = true;
		}

	}

	@Override
	void method13952() {
		method13949();
		method13951();
	}

	@Override
	void method13953() {
		int i_1;
		for (i_1 = 0; i_1 < anInt8773; i_1++) {
			GLLight class282_sub24_2 = aNode_Sub24Array8716[i_1];
			int i_3 = i_1 + 2;
			int i_4 = class282_sub24_2.getColor();
			float f_5 = class282_sub24_2.getIntensity() / 255.0F;
			D3DLIGHT.SetPosition(aLong10253, class282_sub24_2.getX(), class282_sub24_2.getY(), class282_sub24_2.getZ());
			D3DLIGHT.SetDiffuse(aLong10253, (i_4 >> 16 & 0xff) * f_5, (i_4 >> 8 & 0xff) * f_5, (i_4 & 0xff) * f_5, 0.0F);
			D3DLIGHT.SetAttenuation(aLong10253, 0.0F, 0.0F, 1.0F / (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			D3DLIGHT.SetRange(aLong10253, class282_sub24_2.method12370());
			IDirect3DDevice.SetLight(aLong10252, i_3, aLong10253);
			IDirect3DDevice.LightEnable(aLong10252, i_3, true);
		}

		while (i_1 < anInt8831) {
			IDirect3DDevice.LightEnable(aLong10252, i_1 + 2, false);
			++i_1;
		}

	}

	@Override
	boolean method13954(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	@Override
	boolean method13955(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 4, method15652(class150_1, class76_2)));
	}

	@Override
	void method13956() {
		IDirect3DDevice.method14471(aLong10252, 7, aBool8757);
	}

	@Override
	public void method13959(Class352 class352_1, int i_2, int i_3) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawPrimitive(aLong10252, method15654(class352_1), i_2, i_3);
	}

	@Override
	Interface6 method13961(Class150 class150_1, int i_2, int i_3, float[] floats_5) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, true, floats_5, 0, 0);
	}

	@Override
	Interface1 method13962(Class150 class150_1, byte[] bytes_6) {
		return new Class360_Sub1(this, class150_1, 128, 128, 16, bytes_6);
	}

	@Override
	public void method13964() {
		if (aBoolArray10257[anInt8780]) {
			aBoolArray10257[anInt8780] = false;
			IDirect3DDevice.SetTexture(aLong10252, anInt8780, 0L);
			method13980();
			method13979();
		}

	}

	@Override
	void method13968(int i_1, Class67 class67_2) {
		if (aBool8692) {
			byte b_5 = 0;
			byte b_6 = switch (i_1) {
			case 1 -> 3;
			case 2 -> 26;
			default -> 2;
			};
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, b_6, method15648(class67_2) | b_5);
		}

	}

	@Override
	void method13970(int i_1, Class67 class67_2) {
		if (aBool8692) {
			byte b_4 = 0;
			byte b_5 = switch (i_1) {
			case 1 -> 6;
			case 2 -> 27;
			default -> 5;
			};
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, b_5, method15648(class67_2) | b_4);
		}

	}

	@Override
	boolean method13975(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	@Override
	void method13978() {
	}

	@Override
	void method13979() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 1, i_1);
		}

	}

	@Override
	void method13980() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 4, i_1);
		}

	}

	@Override
	void method13982() {
		int i_1;
		for (i_1 = 0; i_1 < anInt8773; i_1++) {
			GLLight class282_sub24_2 = aNode_Sub24Array8716[i_1];
			int i_3 = i_1 + 2;
			int i_4 = class282_sub24_2.getColor();
			float f_5 = class282_sub24_2.getIntensity() / 255.0F;
			D3DLIGHT.SetPosition(aLong10253, class282_sub24_2.getX(), class282_sub24_2.getY(), class282_sub24_2.getZ());
			D3DLIGHT.SetDiffuse(aLong10253, (i_4 >> 16 & 0xff) * f_5, (i_4 >> 8 & 0xff) * f_5, (i_4 & 0xff) * f_5, 0.0F);
			D3DLIGHT.SetAttenuation(aLong10253, 0.0F, 0.0F, 1.0F / (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			D3DLIGHT.SetRange(aLong10253, class282_sub24_2.method12370());
			IDirect3DDevice.SetLight(aLong10252, i_3, aLong10253);
			IDirect3DDevice.LightEnable(aLong10252, i_3, true);
		}

		while (i_1 < anInt8831) {
			IDirect3DDevice.LightEnable(aLong10252, i_1 + 2, false);
			++i_1;
		}

	}

	@Override
	public void method13983(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawIndexedPrimitive(aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	@Override
	void method13986(int i_1) {
		IDirect3DDevice.SetRenderState(aLong10252, 168, i_1);
	}

	@Override
	void method13987() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState(aLong10252, 60, anInt8758);

	}

	@Override
	void method13991() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 28, aBool8809 && aBool8808 && anInt8811 >= 0);

	}

	@Override
	void method13992(boolean bool_1) {
		IDirect3DDevice.method14471(aLong10252, 161, bool_1);
	}

	@Override
	Interface32 method13993(boolean bool_1) {
		return new Class367(this, Class76.aClass76_752, bool_1);
	}

	@Override
	Interface4 method13994(boolean bool_1) {
		return new Class300(this, bool_1);
	}

	@Override
	Class70 method13995(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	@Override
	public void method13996(Class70 class70_1) {
		Class70_Sub1 class70_sub1_2 = (Class70_Sub1) class70_1;
		IDirect3DDevice.SetVertexDeclaration(aLong10252, class70_sub1_2.aLong9179);
	}

	@Override
	void method13997(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(aLong10252, ((Class367) interface32_1).aLong4238);
	}

	@Override
	void method13999() {
		aFloat8819 = aFloat8697 - anInt8680;
		aFloat8813 = aFloat8819 - anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;

		if (aBool8692) {
			IDirect3DDevice.method14470(aLong10252, 36, aFloat8813);
			IDirect3DDevice.method14470(aLong10252, 37, aFloat8819);
			IDirect3DDevice.SetRenderState(aLong10252, 34, anInt8810);
		}

	}

	@Override
	public void method14002(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawIndexedPrimitive(aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	@Override
	Interface6 method14008(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		return new Class360_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
	}

	@Override
	Interface31 method14011(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	@Override
	void method14013() {
		aFloat8819 = aFloat8697 - anInt8680;
		aFloat8813 = aFloat8819 - anInt8811;
		if (aFloat8813 < aFloat8726)
			aFloat8813 = aFloat8726;

		if (aBool8692) {
			IDirect3DDevice.method14470(aLong10252, 36, aFloat8813);
			IDirect3DDevice.method14470(aLong10252, 37, aFloat8819);
			IDirect3DDevice.SetRenderState(aLong10252, 34, anInt8810);
		}

	}

	@Override
	void method14015() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 28, aBool8809 && aBool8808 && anInt8811 >= 0);

	}

	@Override
	Class70 method14017(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	@Override
	void method14019() {
		IDirect3DDevice.SetScissorRect(aLong10252, anInt8823 + anInt8743, anInt8754 + anInt8822, anInt8744, anInt8742);
	}

	@Override
	void method14020() {
		switch (aClass73_8733.anInt729) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 6);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 2);
		}

		switch (anInt8844) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 1);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 2);
		}

	}

	@Override
	Interface29 method14022(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	void method14025() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 137, aBool8684 && !aBool8760);

	}

	@Override
	void method14026() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			aBool10254 = false;
		}

	}

	@Override
	Interface31 method14034(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	@Override
	public boolean method14045() {
		return (aD3DCAPS10267.PixelShaderVersion & 0xffff) >= 257;
	}

	@Override
	void method14047() {
		method13949();
		method13951();
	}

	@Override
	Interface6 method14048(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		return new Class360_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
	}

	@Override
	public Shader method14049(String string_1) {
		byte[] bytes_2 = getDXShaderData(string_1);
		if (bytes_2 == null)
			return null;
		ShaderLoader class114_3 = method13891(bytes_2);
		return new DirectXShader(this, class114_3);
	}

	@Override
	void method14054() {
		IDirect3DDevice.method14471(aLong10252, 14, aBool8755 && aBool8756);
	}

	@Override
	public void method14056(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		IDirect3DDevice.SetTransform(aLong10252, 256, matrix44_1.buf);
		IDirect3DDevice.SetTransform(aLong10252, 2, matrix44_2.buf);
		IDirect3DDevice.SetTransform(aLong10252, 3, matrix44_3.buf);
	}

	@Override
	public void method14057(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		IDirect3DDevice.SetTransform(aLong10252, 256, matrix44_1.buf);
		IDirect3DDevice.SetTransform(aLong10252, 2, matrix44_2.buf);
		IDirect3DDevice.SetTransform(aLong10252, 3, matrix44_3.buf);
	}

	@Override
	public void method14058(Matrix44 matrix44_1, Matrix44 matrix44_2, Matrix44 matrix44_3) {
		IDirect3DDevice.SetTransform(aLong10252, 256, matrix44_1.buf);
		IDirect3DDevice.SetTransform(aLong10252, 2, matrix44_2.buf);
		IDirect3DDevice.SetTransform(aLong10252, 3, matrix44_3.buf);
	}

	@Override
	void method14063() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState(aLong10252, 60, anInt8758);

	}

	@Override
	Interface29 method14064(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface6 method14072(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface1 method14077(Class150 class150_1, int i_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6) {
		return new Class360_Sub1(this, class150_1, i_2, i_3, i_4, bytes_6);
	}

	@Override
	void method14087() {
		if (aClass158_5853 != null)
			IDirect3DDevice.SetViewport(aLong10252, anInt8823 + anInt8749, anInt8754 + anInt8776, anInt8751, anInt8752, aFloat8735, aFloat8736);

	}

	@Override
	void method14088() {
		IDirect3DDevice.SetScissorRect(aLong10252, anInt8823 + anInt8743, anInt8754 + anInt8822, anInt8744, anInt8742);
	}

	@Override
	Interface6 method14090(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
	}

	@Override
	public float method14091() {
		return -0.5f;
	}

	@Override
	void method14092(boolean bool_1) {
		IDirect3DDevice.method14471(aLong10252, 161, bool_1);
	}

	@Override
	Interface6 method14094(int i_1, int i_2, boolean bool_3, int[] ints_4, int i_5, int i_6) {
		return new Class360_Sub2(this, i_1, i_2, bool_3, ints_4, i_5, i_6);
	}

	@Override
	void method14098(int i_1) {
		int i_2 = (i_1 & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(aLong10252, 8, i_2);
	}

	@Override
	public void method14101(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawIndexedPrimitive(aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	@Override
	public void method14107(Matrix44 matrix44_1) {
		matrix44_1.multiply(aClass384_10261);
	}

	@Override
	void method14117() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 137, aBool8684 && !aBool8760);

	}

	@Override
	void method14119() {
		IDirect3DDevice.method14471(aLong10252, 7, aBool8757);
	}

	@Override
	void method14120() {
		IDirect3DDevice.method14471(aLong10252, 14, aBool8755 && aBool8756);
	}

	@Override
	void method14121() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 137, aBool8684 && !aBool8760);

	}

	@Override
	void method14122() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 137, aBool8684 && !aBool8760);

	}

	@Override
	void method14124() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			aBool10254 = false;
		}

	}

	@Override
	void method14125() {
		if (aBool8692) {
			D3DLIGHT.SetAmbient(aLong10259, aFloat8766 * aFloat8769, aFloat8767 * aFloat8769, aFloat8768 * aFloat8769, 0.0F);
			aBool10254 = false;
		}

	}

	@Override
	void method14127() {
		if (aBool8692) {
			float f_1 = aBool8759 ? aFloat8770 : 0.0F;
			float f_2 = aBool8759 ? -aFloat8826 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong10259, f_1 * aFloat8766, f_1 * aFloat8767, f_1 * aFloat8768, 0.0F);
			D3DLIGHT.SetDiffuse(aLong10250, f_2 * aFloat8766, f_2 * aFloat8767, f_2 * aFloat8768, 0.0F);
			aBool10254 = false;
		}

	}

	@Override
	void method14132() {
		int i_1;
		for (i_1 = 0; i_1 < anInt8773; i_1++) {
			GLLight class282_sub24_2 = aNode_Sub24Array8716[i_1];
			int i_3 = i_1 + 2;
			int i_4 = class282_sub24_2.getColor();
			float f_5 = class282_sub24_2.getIntensity() / 255.0F;
			D3DLIGHT.SetPosition(aLong10253, class282_sub24_2.getX(), class282_sub24_2.getY(), class282_sub24_2.getZ());
			D3DLIGHT.SetDiffuse(aLong10253, (i_4 >> 16 & 0xff) * f_5, (i_4 >> 8 & 0xff) * f_5, (i_4 & 0xff) * f_5, 0.0F);
			D3DLIGHT.SetAttenuation(aLong10253, 0.0F, 0.0F, 1.0F / (class282_sub24_2.method12370() * class282_sub24_2.method12370()));
			D3DLIGHT.SetRange(aLong10253, class282_sub24_2.method12370());
			IDirect3DDevice.SetLight(aLong10252, i_3, aLong10253);
			IDirect3DDevice.LightEnable(aLong10252, i_3, true);
		}

		while (i_1 < anInt8831) {
			IDirect3DDevice.LightEnable(aLong10252, i_1 + 2, false);
			++i_1;
		}

	}

	@Override
	boolean method14134(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	@Override
	boolean method14135(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	@Override
	boolean method14136(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	@Override
	boolean method14137(Class150 class150_1, Class76 class76_2) {
		D3DDISPLAYMODE d3ddisplaymode_3 = new D3DDISPLAYMODE();
		return Class25.gtOrEqualToZero(IDirect3D.GetAdapterDisplayMode(aLong10246, anInt10260, d3ddisplaymode_3)) && Class25.gtOrEqualToZero(IDirect3D.CheckDeviceFormat(aLong10246, anInt10260, anInt10244, d3ddisplaymode_3.Format, 0, 3, method15652(class150_1, class76_2)));
	}

	@Override
	Interface6 method14141(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface6 method14142(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface6 method14143(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, 0, 0);
	}

	@Override
	Interface6 method14144(Class150 class150_1, int i_2, int i_3, boolean bool_4, byte[] bytes_5, int i_6, int i_7) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, bytes_5, i_6, i_7);
	}

	@Override
	Interface6 method14145(Class150 class150_1, int i_2, int i_3, boolean bool_4, float[] floats_5, int i_6, int i_7) {
		return new Class360_Sub2(this, class150_1, i_2, i_3, bool_4, floats_5, i_6, i_7);
	}

	@Override
	public boolean method14146() {
		return (aD3DCAPS10267.VertexShaderVersion & 0xffff) >= 257;
	}

	@Override
	Interface29 method14148(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	Interface29 method14149(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2_Sub1(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	public void method14153() {
		if (aBoolArray10257[anInt8780]) {
			aBoolArray10257[anInt8780] = false;
			IDirect3DDevice.SetTexture(aLong10252, anInt8780, 0L);
			method13980();
			method13979();
		}

	}

	@Override
	public void method14154() {
		if (aBoolArray10257[anInt8780]) {
			aBoolArray10257[anInt8780] = false;
			IDirect3DDevice.SetTexture(aLong10252, anInt8780, 0L);
			method13980();
			method13979();
		}

	}

	@Override
	public void method14161(int i_1, Interface4 interface4_2) {
		Class300 class300_3 = (Class300) interface4_2;
		IDirect3DDevice.SetStreamSource(aLong10252, i_1, class300_3.aLong3549, 0, class300_3.method5317());
	}

	@Override
	void method14162(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		if (aBool8692) {
			int i_5 = 0;
			byte b_6 = switch (i_1) {
			case 1 -> 3;
			case 2 -> 26;
			default -> 2;
			};
			if (bool_3)
				i_5 |= 0x20;

			if (bool_4)
				i_5 |= 0x10;

			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, b_6, method15648(class67_2) | i_5);
		}

	}

	@Override
	void method14166(int i_1, Class67 class67_2, boolean bool_3) {
		if (aBool8692) {
			int i_4 = 0;
			byte b_5 = switch (i_1) {
			case 1 -> 6;
			case 2 -> 27;
			default -> 5;
			};
			if (bool_3)
				i_4 |= 0x10;

			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, b_5, method15648(class67_2) | i_4);
		}

	}

	@Override
	void method14169() {
		IDirect3DDevice.method14471(aLong10252, 14, aBool8755 && aBool8756);
	}

	@Override
	void method14172() {
		method13949();
		method13951();
	}

	@Override
	void method14173(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(aLong10252, ((Class367) interface32_1).aLong4238);
	}

	@Override
	void method14179() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState(aLong10252, 60, anInt8758);

	}

	@Override
	void method14180() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState(aLong10252, 60, anInt8758);

	}

	@Override
	void method14181() {
		if (aBool8692)
			IDirect3DDevice.SetRenderState(aLong10252, 60, anInt8758);

	}

	@Override
	void method14182() {
		if (aLong10269 == 0L && aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			if (aClass37Array8783[anInt8780] == Class37.aClass37_388)
				IDirect3DDevice.SetTransform(aLong10252, 16 + anInt8780, aClass384Array8782[anInt8780].method6548(aFloatArray10264));
			else
				IDirect3DDevice.SetTransform(aLong10252, 16 + anInt8780, aClass384Array8782[anInt8780].method6517(aFloatArray10264));

			int i_1 = method15667(aClass37Array8783[anInt8780]);
			if (i_1 != anIntArray10266[anInt8780]) {
				IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 24, i_1);
				anIntArray10266[anInt8780] = i_1;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 24, 0);
			anIntArray10266[anInt8780] = 0;
		}

	}

	@Override
	void method14183() {
		if (aLong10269 == 0L && aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			if (aClass37Array8783[anInt8780] == Class37.aClass37_388)
				IDirect3DDevice.SetTransform(aLong10252, 16 + anInt8780, aClass384Array8782[anInt8780].method6548(aFloatArray10264));
			else
				IDirect3DDevice.SetTransform(aLong10252, 16 + anInt8780, aClass384Array8782[anInt8780].method6517(aFloatArray10264));

			int i_1 = method15667(aClass37Array8783[anInt8780]);
			if (i_1 != anIntArray10266[anInt8780]) {
				IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 24, i_1);
				anIntArray10266[anInt8780] = i_1;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 24, 0);
			anIntArray10266[anInt8780] = 0;
		}

	}

	@Override
	void method14184() {
	}

	@Override
	void method14185() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 1, i_1);
		}

	}

	@Override
	void method14186() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 1, i_1);
		}

	}

	@Override
	void method14187() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8784[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 1, i_1);
		}

	}

	@Override
	void method14188() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 4, i_1);
		}

	}

	@Override
	void method14190() {
		if (aBool8692) {
			int i_1 = aBoolArray10257[anInt8780] ? method15661(aClass68Array8785[anInt8780]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 4, i_1);
		}

	}

	@Override
	void method14197() {
		IDirect3DDevice.method14471(aLong10252, 15, aBool8818);
	}

	@Override
	void method14199() {
		switch (aClass73_8733.anInt729) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 2);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 5);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 6);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 1);
			break;
		case 3:
			IDirect3DDevice.SetRenderState(aLong10252, 19, 9);
			IDirect3DDevice.SetRenderState(aLong10252, 20, 2);
		}

		switch (anInt8844) {
		case 0:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 1);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 1);
			break;
		case 1:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 1);
			break;
		case 2:
			IDirect3DDevice.SetRenderState(aLong10252, 207, 2);
			IDirect3DDevice.SetRenderState(aLong10252, 208, 2);
		}

	}

	@Override
	void method14200() {
		IDirect3DDevice.method14471(aLong10252, 27, aBool8817);
	}

	@Override
	void method14203() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 28, aBool8809 && aBool8808 && anInt8811 >= 0);

	}

	@Override
	void method14204() {
		if (aBool8692)
			IDirect3DDevice.method14471(aLong10252, 137, aBool8684 && !aBool8760);

	}

	@Override
	void method14205() {
		if (aClass158_5853 != null)
			IDirect3DDevice.SetViewport(aLong10252, anInt8823 + anInt8749, anInt8754 + anInt8776, anInt8751, anInt8752, aFloat8735, aFloat8736);

	}

	@Override
	Interface32 method14206(boolean bool_1) {
		return new Class367(this, Class76.aClass76_752, bool_1);
	}

	@Override
	Interface32 method14207(boolean bool_1) {
		return new Class367(this, Class76.aClass76_752, bool_1);
	}

	@Override
	Class70 method14209(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	@Override
	Class70 method14210(Class72[] arr_1) {
		return new Class70_Sub1(this, arr_1);
	}

	@Override
	public void method14212(Class70 class70_1) {
		Class70_Sub1 class70_sub1_2 = (Class70_Sub1) class70_1;
		IDirect3DDevice.SetVertexDeclaration(aLong10252, class70_sub1_2.aLong9179);
	}

	@Override
	public void method14213(int i_1, Interface4 interface4_2) {
		Class300 class300_3 = (Class300) interface4_2;
		IDirect3DDevice.SetStreamSource(aLong10252, i_1, class300_3.aLong3549, 0, class300_3.method5317());
	}

	@Override
	public void method14214(int i_1, Interface4 interface4_2) {
		Class300 class300_3 = (Class300) interface4_2;
		IDirect3DDevice.SetStreamSource(aLong10252, i_1, class300_3.aLong3549, 0, class300_3.method5317());
	}

	@Override
	void method14215(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(aLong10252, ((Class367) interface32_1).aLong4238);
	}

	@Override
	Interface6 method14216(Class150 class150_1, Class76 class76_2, int i_3, int i_4) {
		return new Class360_Sub2(this, class150_1, class76_2, i_3, i_4);
	}

	@Override
	void method14217(Interface32 interface32_1) {
		IDirect3DDevice.SetIndices(aLong10252, ((Class367) interface32_1).aLong4238);
	}

	@Override
	void method14224(int i_1, Class67 class67_2, boolean bool_3, boolean bool_4) {
		if (aBool8692) {
			int i_5 = 0;
			byte b_6 = switch (i_1) {
			case 1 -> 3;
			case 2 -> 26;
			default -> 2;
			};
			if (bool_3)
				i_5 |= 0x20;

			if (bool_4)
				i_5 |= 0x10;

			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, b_6, method15648(class67_2) | i_5);
		}

	}

	@Override
	void method14226() {
		if (aLong10269 == 0L && aClass37Array8783[anInt8780] != Class37.aClass37_393) {
			if (aClass37Array8783[anInt8780] == Class37.aClass37_388)
				IDirect3DDevice.SetTransform(aLong10252, anInt8780 + 16, aClass384Array8782[anInt8780].method6548(aFloatArray10264));
			else
				IDirect3DDevice.SetTransform(aLong10252, anInt8780 + 16, aClass384Array8782[anInt8780].method6517(aFloatArray10264));

			int i_1 = method15667(aClass37Array8783[anInt8780]);
			if (i_1 != anIntArray10266[anInt8780]) {
				IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 24, i_1);
				anIntArray10266[anInt8780] = i_1;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong10252, anInt8780, 24, 0);
			anIntArray10266[anInt8780] = 0;
		}

	}

	@Override
	public void method14228(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawIndexedPrimitive(aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	@Override
	public void method14229(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawIndexedPrimitive(aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	@Override
	public void method14230(Class352 class352_1, int i_2, int i_3, int i_4, int i_5) {
		if (aClass115_Sub1_10251 != null)
			aClass115_Sub1_10251.method14591();

		IDirect3DDevice.DrawIndexedPrimitive(aLong10252, method15654(class352_1), 0, i_2, i_3, i_4, i_5);
	}

	@Override
	void method14235(int i_1) {
		int i_2 = (i_1 & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(aLong10252, 8, i_2);
	}

	@Override
	void method14236(int i_1) {
		int i_2 = (i_1 & 0x2) != 0 ? 2 : 3;
		IDirect3DDevice.SetRenderState(aLong10252, 8, i_2);
	}

	@Override
	Interface31 method14237(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	@Override
	void method14238() {
		IDirect3DDevice.method14471(aLong10252, 15, aBool8818);
	}

	@Override
	Interface31 method14239(int i_1, boolean bool_2, int[][] ints_3) {
		return new Class360_Sub3(this, i_1, bool_2, ints_3);
	}

	@Override
	void method14240(int i_1) {
		IDirect3DDevice.SetRenderState(aLong10252, 168, i_1);
	}

	boolean method15639() {
		int i_1 = IDirect3DDevice.TestCooperativeLevel(aLong10252);
		if (i_1 == 0 || i_1 == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong10252, 0L);

			int i_2;
			for (i_2 = 0; i_2 < 4; i_2++)
				IDirect3DDevice.SetRenderTarget(aLong10252, i_2, 0L);

			for (i_2 = 0; i_2 < 4; i_2++)
				IDirect3DDevice.SetStreamSource(aLong10252, i_2, 0L, 0, 0);

			for (i_2 = 0; i_2 < 4; i_2++)
				IDirect3DDevice.SetTexture(aLong10252, i_2, 0L);

			IDirect3DDevice.SetIndices(aLong10252, 0L);
			method13900();
			aD3DPRESENT_PARAMETERS10248.BackBufferWidth = 0;
			aD3DPRESENT_PARAMETERS10248.BackBufferHeight = 0;
			if (method15656(anInt10260, anInt10244, aLong10246, anInt8709, aD3DPRESENT_PARAMETERS10248)) {
				i_2 = IDirect3DDevice.Reset(aLong10252, aD3DPRESENT_PARAMETERS10248);
				if (Class25.gtOrEqualToZero(i_2)) {
					method13899();
					method13897();
					return true;
				}

				System.exit(0);
			}
		}

		return false;
	}

	Node_Sub9 method15641(Interface33 interface33_1) {
		for (Node node_2 = aClass473_10249.getBack(); node_2 != null; node_2 = aClass473_10249.getPrevious()) {
			Node_Sub9 class282_sub9_3 = (Node_Sub9) node_2;
			if (interface33_1 == class282_sub9_3.anInterface33_7538)
				return class282_sub9_3;
		}

		return null;
	}

	void method15642(Interface33 interface33_1) {
		if (method15641(interface33_1) == null)
			aClass473_10249.insertBack(new Node_Sub9(interface33_1));

	}

	void method15643(Interface33 interface33_1) {
		Node_Sub9 class282_sub9_2 = method15641(interface33_1);
		if (class282_sub9_2 != null)
			class282_sub9_2.unlink();

	}

	void method15645(long long_1) {
		IDirect3DDevice.SetPixelShader(aLong10252, long_1);
	}

	void method15647(Class360_Sub2 class360_sub2_1) {
		method15662(class360_sub2_1);
		if (aBoolArray10255[anInt8780] != class360_sub2_1.aBool9156) {
			IDirect3DDevice.SetSamplerState(aLong10252, anInt8780, 1, class360_sub2_1.aBool9156 ? 1 : 3);
			aBoolArray10255[anInt8780] = class360_sub2_1.aBool9156;
		}

		if (aBoolArray10256[anInt8780] != class360_sub2_1.aBool9155) {
			IDirect3DDevice.SetSamplerState(aLong10252, anInt8780, 2, class360_sub2_1.aBool9155 ? 1 : 3);
			aBoolArray10256[anInt8780] = class360_sub2_1.aBool9155;
		}

	}

	synchronized void method15650(long long_1) {
		if (anInt10270 == anInt10268) {
			anInt10268 *= 2;
			long[] longs_3 = new long[anInt10268];
			System.arraycopy(aLongArray10271, 0, longs_3, 0, anInt10270);
			aLongArray10271 = longs_3;
		}

		aLongArray10271[anInt10270] = long_1;
		++anInt10270;
	}

	void method15657(Class360_Sub1 class360_sub1_1) {
		method15662(class360_sub1_1);
		if (!aBoolArray10255[anInt8780]) {
			IDirect3DDevice.SetSamplerState(aLong10252, anInt8780, 1, 1);
			aBoolArray10255[anInt8780] = true;
		}

		if (!aBoolArray10256[anInt8780]) {
			IDirect3DDevice.SetSamplerState(aLong10252, anInt8780, 2, 1);
			aBoolArray10256[anInt8780] = true;
		}

	}

	void method15662(Class360 class360_1) {
		IDirect3DDevice.SetTexture(aLong10252, anInt8780, class360_1.method6245());
		if (aBool8692 && !aBoolArray10257[anInt8780]) {
			aBoolArray10257[anInt8780] = true;
			method13980();
			method13979();
		}

	}

	void method15666(long long_1) {
		aLong10269 = long_1;
		IDirect3DDevice.SetVertexShader(aLong10252, long_1);
	}

	@Override
	public RendererInfo method8392() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier_1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong10246, anInt10260, 0, d3dadapter_identifier_1);
		return new RendererInfo(d3dadapter_identifier_1.VendorID, "Direct3D", 9, d3dadapter_identifier_1.Description, d3dadapter_identifier_1.DriverVersion);
	}

	@Override
	public void method8395() {
		long long_1 = IDirect3DDevice.CreateEventQuery(aLong10252);
		if (Class25.gtOrEqualToZero(IDirect3DEventQuery.Issue(long_1)))
			while (true) {
				int i_3 = IDirect3DEventQuery.IsSignaled(long_1);
				if (i_3 != 1)
					break;

				Thread.yield();
			}

		IUnknown.Release(long_1);
	}

	@Override
	void method8397() {
		super.method8397();
		if (aLong10259 != 0L) {
			D3DLIGHT.Destroy(aLong10259);
			aLong10259 = 0L;
		}

		if (aLong10250 != 0L) {
			D3DLIGHT.Destroy(aLong10250);
			aLong10250 = 0L;
		}

		if (aLong10253 != 0L) {
			D3DLIGHT.Destroy(aLong10253);
			aLong10253 = 0L;
		}

		if (aLong10252 != 0L) {
			IDirect3DDevice.Destroy(aLong10252);
			aLong10252 = 0L;
		}

		if (aLong10246 != 0L) {
			IUnknown.Release(aLong10246);
			aLong10246 = 0L;
		}

	}

	@Override
	public synchronized void method8398(int i_1) {
		for (int i_2 = 0; i_2 < anInt10270; i_2++)
			IUnknown.Release(aLongArray10271[i_2]);

		anInt10270 = 0;
		super.method8398(i_1);
	}

	@Override
	Class158_Sub2 method8417(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub2(this, canvas_1, i_2, i_3, false);
	}

	@Override
	public Class158_Sub1 method8418() {
		return new Class158_Sub1_Sub3_Sub1(this);
	}

	@Override
	public Interface8 method8419(int i_1, int i_2) {
		return new Class307(this, Class76.aClass76_749, i_1, i_2);
	}

	@Override
	public void method8420() {
	}

	@Override
	public void method8445() {
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
		D3DADAPTER_IDENTIFIER d3dadapter_identifier_1 = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(aLong10246, anInt10260, 0, d3dadapter_identifier_1);
		return new RendererInfo(d3dadapter_identifier_1.VendorID, "Direct3D", 9, d3dadapter_identifier_1.Description, d3dadapter_identifier_1.DriverVersion);
	}

	@Override
	public void method8483() {
		long long_1 = IDirect3DDevice.CreateEventQuery(aLong10252);
		if (Class25.gtOrEqualToZero(IDirect3DEventQuery.Issue(long_1)))
			while (true) {
				int i_3 = IDirect3DEventQuery.IsSignaled(long_1);
				if (i_3 != 1)
					break;

				Thread.yield();
			}

		IUnknown.Release(long_1);
	}

	@Override
	public void method8484() {
		long long_1 = IDirect3DDevice.CreateEventQuery(aLong10252);
		if (Class25.gtOrEqualToZero(IDirect3DEventQuery.Issue(long_1)))
			while (true) {
				int i_3 = IDirect3DEventQuery.IsSignaled(long_1);
				if (i_3 != 1)
					break;

				Thread.yield();
			}

		IUnknown.Release(long_1);
	}

	@Override
	void method8485() {
		super.method8397();
		if (aLong10259 != 0L) {
			D3DLIGHT.Destroy(aLong10259);
			aLong10259 = 0L;
		}

		if (aLong10250 != 0L) {
			D3DLIGHT.Destroy(aLong10250);
			aLong10250 = 0L;
		}

		if (aLong10253 != 0L) {
			D3DLIGHT.Destroy(aLong10253);
			aLong10253 = 0L;
		}

		if (aLong10252 != 0L) {
			IDirect3DDevice.Destroy(aLong10252);
			aLong10252 = 0L;
		}

		if (aLong10246 != 0L) {
			IUnknown.Release(aLong10246);
			aLong10246 = 0L;
		}

	}

	@Override
	void method8486() {
		super.method8397();
		if (aLong10259 != 0L) {
			D3DLIGHT.Destroy(aLong10259);
			aLong10259 = 0L;
		}

		if (aLong10250 != 0L) {
			D3DLIGHT.Destroy(aLong10250);
			aLong10250 = 0L;
		}

		if (aLong10253 != 0L) {
			D3DLIGHT.Destroy(aLong10253);
			aLong10253 = 0L;
		}

		if (aLong10252 != 0L) {
			IDirect3DDevice.Destroy(aLong10252);
			aLong10252 = 0L;
		}

		if (aLong10246 != 0L) {
			IUnknown.Release(aLong10246);
			aLong10246 = 0L;
		}

	}

	@Override
	public synchronized void method8487(int i_1) {
		for (int i_2 = 0; i_2 < anInt10270; i_2++)
			IUnknown.Release(aLongArray10271[i_2]);

		anInt10270 = 0;
		super.method8398(i_1);
	}

	@Override
	public synchronized void method8488(int i_1) {
		for (int i_2 = 0; i_2 < anInt10270; i_2++)
			IUnknown.Release(aLongArray10271[i_2]);

		anInt10270 = 0;
		super.method8398(i_1);
	}

	@Override
	public void method8491() {
	}

	@Override
	public void method8497() {
	}

	@Override
	public void method8507() {
	}

	@Override
	void method8531() {
		super.method8397();
		if (aLong10259 != 0L) {
			D3DLIGHT.Destroy(aLong10259);
			aLong10259 = 0L;
		}

		if (aLong10250 != 0L) {
			D3DLIGHT.Destroy(aLong10250);
			aLong10250 = 0L;
		}

		if (aLong10253 != 0L) {
			D3DLIGHT.Destroy(aLong10253);
			aLong10253 = 0L;
		}

		if (aLong10252 != 0L) {
			IDirect3DDevice.Destroy(aLong10252);
			aLong10252 = 0L;
		}

		if (aLong10246 != 0L) {
			IUnknown.Release(aLong10246);
			aLong10246 = 0L;
		}

	}

	@Override
	void method8555() throws Exception_Sub3 {
		IDirect3DDevice.EndScene(aLong10252);
		int i_3 = aClass158_Sub2_5841.method14344();
		if (Class25.lessThanZero(i_3)) {
			if (i_3 != -2005530520) {
				if (++anInt10262 > 50)
					throw new Exception_Sub3();
			} else {
				aClass158_Sub2_5841.method212();
				method15639();
				((Class158_Sub2_Sub2_Sub2) aClass158_Sub2_5841).method210();
			}
		} else
			anInt10262 = 0;

		IDirect3DDevice.BeginScene(aLong10252);
		if (textureCache != null)
			textureCache.method161();

	}

	@Override
	public Class152 method8557(Class152 class152_1, Class152 class152_2, float f_3, Class152 class152_4) {
		return f_3 < 0.5F ? class152_1 : class152_2;
	}

	@Override
	Class158_Sub2 method8558(Canvas canvas_1, int i_2, int i_3) {
		return new Class158_Sub2_Sub2_Sub2(this, canvas_1, i_2, i_3, false);
	}

	@Override
	void method8596(int i_1, int i_2) throws Exception_Sub3 {
		IDirect3DDevice.EndScene(aLong10252);
		int i_3 = aClass158_Sub2_5841.method14344();
		if (Class25.lessThanZero(i_3)) {
			if (i_3 != -2005530520) {
				if (++anInt10262 > 50)
					throw new Exception_Sub3();
			} else {
				aClass158_Sub2_5841.method212();
				method15639();
				((Class158_Sub2_Sub2_Sub2) aClass158_Sub2_5841).method210();
			}
		} else
			anInt10262 = 0;

		IDirect3DDevice.BeginScene(aLong10252);
		if (textureCache != null)
			textureCache.method161();

	}

	@Override
	public Class158_Sub1 method8620() {
		return new Class158_Sub1_Sub3_Sub1(this);
	}

	@Override
	public Interface8 method8621(int i_1, int i_2) {
		return new Class307(this, Class76.aClass76_749, i_1, i_2);
	}

}
