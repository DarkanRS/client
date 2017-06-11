/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public final class IDirect3DDevice extends IUnknown {
	private IDirect3DDevice() throws Throwable {
		throw new Error();
	}

	public static native void Destroy(long l);

	public static native long GetRenderTarget(long l, int i);

	public static native void GetRenderTargetData(long l, long l_0_, long l_1_);

	public static native int SetRenderTarget(long l, int i, long l_2_);

	public static native long CreateRenderTarget(long l, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool);

	public static native long GetSwapChain(long l, int i);

	public static native long CreateAdditionalSwapChain(long l, D3DPRESENT_PARAMETERS d3dpresent_parameters);

	public static native long GetDepthStencilSurface(long l);

	public static native int SetDepthStencilSurface(long l, long l_7_);

	public static native long CreateDepthStencilSurface(long l, int i, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool);

	public static native long CreateOffscreenPlainSurface(long l, int i, int i_12_, int i_13_, int i_14_);

	public static native long GetBackBuffer(long l, int i, int i_15_, int i_16_);

	public static native int StretchRect(long l, long l_17_, int i, int i_18_, int i_19_, int i_20_, long l_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_);

	public static native long CreateVertexBuffer(long l, int i, int i_27_, int i_28_, int i_29_);

	public static native long CreateIndexBuffer(long l, int i, int i_30_, int i_31_, int i_32_);

	public static native long CreateVertexDeclaration(long l, long l_33_);

	public static native int SetStreamSource(long l, int i, long l_34_, int i_35_, int i_36_);

	public static native int SetVertexDeclaration(long l, long l_37_);

	public static native int SetIndices(long l, long l_38_);

	public static native int DrawIndexedPrimitive(long l, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_);

	public static native int DrawIndexedPrimitiveIB(long l, long l_44_, int i, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_);

	public static native int DrawPrimitive(long l, int i, int i_50_, int i_51_);

	public static native long CreateTexture(long l, int i, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_);

	public static native long CreateCubeTexture(long l, int i, int i_57_, int i_58_, int i_59_, int i_60_);

	public static native long CreateVolumeTexture(long l, int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_);

	public static native int SetTexture(long l, int i, long l_67_);

	public static native int SetTextureStageState(long l, int i, int i_68_, int i_69_);

	public static native int SetSamplerState(long l, int i, int i_70_, int i_71_);

	public static native int UpdateTexture(long l, long l_72_, long l_73_);

	public static native long CreateVertexShader(long l, byte[] is);

	public static native long CreatePixelShader(long l, byte[] is);

	public static native int SetPixelShader(long l, long l_74_);

	public static native int SetVertexShader(long l, long l_75_);

	public static native int SetPixelShaderConstantF(long l, int i, long l_76_, int i_77_);

	public static native int SetVertexShaderConstantF(long l, int i, long l_78_, int i_79_);

	public static native long CreateEventQuery(long l);

	public static native int Clear(long l, int i, int i_80_, float f, int i_81_);

	public static native int BeginScene(long l);

	public static native int EndScene(long l);

	public static native int SetTransform(long l, int i, float[] fs);

	public static native int SetScissorRect(long l, int i, int i_82_, int i_83_, int i_84_);

	public static native int SetViewport(long l, int i, int i_85_, int i_86_, int i_87_, float f, float f_88_);

	public static int a(long l, int i, float f) {
		return SetRenderStatef(l, i, f);
	}

	public static int f(long l, int i, boolean bool) {
		return SetRenderStateb(l, i, bool);
	}

	public static native int SetRenderState(long l, int i, int i_89_);

	private static native int SetRenderStatef(long l, int i, float f);

	private static native int SetRenderStateb(long l, int i, boolean bool);

	public static native int SetLight(long l, int i, long l_90_);

	public static native boolean LightEnable(long l, int i, boolean bool);

	public static native int Reset(long l, D3DPRESENT_PARAMETERS d3dpresent_parameters);

	public static native int TestCooperativeLevel(long l);
}
