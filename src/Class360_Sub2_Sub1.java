
/* Class360_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class360_Sub2_Sub1 extends Class360_Sub2 implements Interface29 {
	public void method206(Class35 class35) {
		super.method205(class35);
	}

	public Interface9 method200(int i) {
		return new Class376(this, i);
	}

	public int method70() {
		return super.method1();
	}

	public int method1() {
		return super.method1();
	}

	public float method51(float f) {
		return super.method62(f);
	}

	public float method47(float f) {
		return super.method47(f);
	}

	public boolean method54() {
		return super.method54();
	}

	public boolean method46() {
		return super.method46();
	}

	public void method50(boolean bool, boolean bool_0_) {
		super.method50(bool, bool_0_);
	}

	public void method48(int i, int i_1_, int i_2_, int i_3_, int[] is, int i_4_, int i_5_) {
		super.method48(i, i_1_, i_2_, i_3_, is, i_4_, i_5_);
	}

	public void method52(int i, int i_6_, int i_7_, int i_8_, byte[] is, Class150 class150, int i_9_, int i_10_) {
		super.method52(i, i_6_, i_7_, i_8_, is, class150, i_9_, i_10_);
	}

	public void method53(int i, int i_11_, int i_12_, int i_13_, int[] is, int i_14_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class360_Sub2_Sub1) this).aLong4168, 0);
		long l_15_ = IDirect3DDevice.CreateRenderTarget((((Class505_Sub2_Sub2) (((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165)).aLong10252), i_12_, i_13_, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect((((Class505_Sub2_Sub2) (((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165)).aLong10252), l, i, i_11_, i_12_, i_13_, l_15_, 0, 0, i_12_, i_13_, 1))) {
			IDirect3DSurface.Download(l_15_, 0, 0, i_12_, i_13_, i_12_ * 4, 16, (((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165.aLong8695));
			((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838.clear();
			((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_15_);
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method26() {
		super.method26();
	}

	public void method32() {
		super.method26();
	}

	public int method55() {
		return super.method1();
	}

	public int method36() {
		return super.method1();
	}

	public int method57() {
		return super.method1();
	}

	public int method59() {
		return super.method59();
	}

	public float method60(float f) {
		return super.method62(f);
	}

	public float method56(float f) {
		return super.method47(f);
	}

	public float method45(float f) {
		return super.method47(f);
	}

	public int method71() {
		return super.method59();
	}

	public float method58(float f) {
		return super.method62(f);
	}

	public boolean method49() {
		return super.method54();
	}

	public boolean method63() {
		return super.method46();
	}

	public float method62(float f) {
		return super.method62(f);
	}

	public void method61(int i, int i_16_, int i_17_, int i_18_, int[] is, int i_19_, int i_20_) {
		super.method48(i, i_16_, i_17_, i_18_, is, i_19_, i_20_);
	}

	public void method66(int i, int i_21_, int i_22_, int i_23_, int[] is, int i_24_, int i_25_) {
		super.method48(i, i_21_, i_22_, i_23_, is, i_24_, i_25_);
	}

	public void method67(int i, int i_26_, int i_27_, int i_28_, int[] is, int i_29_, int i_30_) {
		super.method48(i, i_26_, i_27_, i_28_, is, i_29_, i_30_);
	}

	public void method68(int i, int i_31_, int i_32_, int i_33_, byte[] is, Class150 class150, int i_34_, int i_35_) {
		super.method52(i, i_31_, i_32_, i_33_, is, class150, i_34_, i_35_);
	}

	public void method69(int i, int i_36_, int i_37_, int i_38_, int[] is, int i_39_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class360_Sub2_Sub1) this).aLong4168, 0);
		long l_40_ = IDirect3DDevice.CreateRenderTarget((((Class505_Sub2_Sub2) (((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165)).aLong10252), i_37_, i_38_, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect((((Class505_Sub2_Sub2) (((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165)).aLong10252), l, i, i_36_, i_37_, i_38_, l_40_, 0, 0, i_37_, i_38_, 1))) {
			IDirect3DSurface.Download(l_40_, 0, 0, i_37_, i_38_, i_37_ * 4, 16, (((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165.aLong8695));
			((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838.clear();
			((Class360_Sub2_Sub1) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_40_);
	}

	public void method207() {
		super.method207();
	}

	public void method203() {
		super.method207();
	}

	Class360_Sub2_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, Class76 class76, int i, int i_41_) {
		super(class505_sub2_sub2, class150, class76, i, i_41_, 1025, 0);
	}

	public float method65(float f) {
		return super.method47(f);
	}

	public void method64(boolean bool, boolean bool_42_) {
		super.method50(bool, bool_42_);
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	public Interface9 method199(int i) {
		return new Class376(this, i);
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	public int method72() {
		return super.method59();
	}
}
