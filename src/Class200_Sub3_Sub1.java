/* Class200_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class200_Sub3_Sub1 extends Class200_Sub3 implements Interface9_Impl2_Impl1 {
	public int method88() {
		return super.method76();
	}

	public Interface8_Impl1_Impl1 method117(int i) {
		return new Class192(this, i);
	}

	public void method83(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class200_Sub3_Sub1) this).aLong6407, 0);
		long l_4_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub3_Sub2) (((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410)).aLong9847), i_1_, i_2_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((((Class_ra_Sub3_Sub2) ((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410).aLong9847), l, i, i_0_, i_1_, i_2_, l_4_, 0, 0, i_1_, i_2_, 1))) {
			IDirect3DSurface.Download(l_4_, 0, 0, i_1_, i_2_, i_1_ * 4, 16, (((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
			((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216.clear();
			((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_4_);
	}

	public int method92() {
		return super.method92();
	}

	public int method76() {
		return super.method76();
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public float method78(float f) {
		return super.method78(f);
	}

	public boolean method79() {
		return super.method79();
	}

	public Interface8_Impl1_Impl1 method121(int i) {
		return new Class192(this, i);
	}

	public void method81(int i, int i_5_, int i_6_, int i_7_, int[] is, int i_8_, int i_9_) {
		super.method81(i, i_5_, i_6_, i_7_, is, i_8_, i_9_);
	}

	public int method86() {
		return super.method92();
	}

	public void method101(int i, int i_10_, int i_11_, int i_12_, int[] is, int i_13_, int i_14_) {
		super.method81(i, i_10_, i_11_, i_12_, is, i_13_, i_14_);
	}

	public void method128() {
		super.method128();
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void b() {
		super.b();
	}

	public void method82(int i, int i_15_, int i_16_, int i_17_, byte[] is, Class55 class55, int i_18_, int i_19_) {
		super.method82(i, i_15_, i_16_, i_17_, is, class55, i_18_, i_19_);
	}

	public void method107(int i, int i_20_, int i_21_, int i_22_, int[] is, int i_23_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class200_Sub3_Sub1) this).aLong6407, 0);
		long l_24_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub3_Sub2) (((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410)).aLong9847), i_21_, i_22_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((((Class_ra_Sub3_Sub2) ((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410).aLong9847), l, i, i_20_, i_21_, i_22_, l_24_, 0, 0, i_21_, i_22_, 1))) {
			IDirect3DSurface.Download(l_24_, 0, 0, i_21_, i_22_, i_21_ * 4, 16, (((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
			((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216.clear();
			((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_24_);
	}

	public void x() {
		super.b();
	}

	public void method106(boolean bool, boolean bool_25_) {
		super.method80(bool, bool_25_);
	}

	public int method75() {
		return super.method76();
	}

	public float method77(float f) {
		return super.method77(f);
	}

	public void method123() {
		super.method128();
	}

	public float method89(float f) {
		return super.method77(f);
	}

	public float method90(float f) {
		return super.method77(f);
	}

	public Interface8_Impl1_Impl1 method118(int i) {
		return new Class192(this, i);
	}

	public void d() {
		super.b();
	}

	public float method109(float f) {
		return super.method78(f);
	}

	public float method94(float f) {
		return super.method78(f);
	}

	public float method95(float f) {
		return super.method78(f);
	}

	public void method96(boolean bool, boolean bool_26_) {
		super.method80(bool, bool_26_);
	}

	public void method97(boolean bool, boolean bool_27_) {
		super.method80(bool, bool_27_);
	}

	public void method98(boolean bool, boolean bool_28_) {
		super.method80(bool, bool_28_);
	}

	public boolean method103() {
		return super.method103();
	}

	public void method99(boolean bool, boolean bool_29_) {
		super.method80(bool, bool_29_);
	}

	public void method80(boolean bool, boolean bool_30_) {
		super.method80(bool, bool_30_);
	}

	public void method102(int i, int i_31_, int i_32_, int i_33_, int[] is, int i_34_, int i_35_) {
		super.method81(i, i_31_, i_32_, i_33_, is, i_34_, i_35_);
	}

	public void method125() {
		super.method128();
	}

	public void method104(int i, int i_36_, int i_37_, int i_38_, byte[] is, Class55 class55, int i_39_, int i_40_) {
		super.method82(i, i_36_, i_37_, i_38_, is, class55, i_39_, i_40_);
	}

	public Interface8_Impl1_Impl1 method119(int i) {
		return new Class192(this, i);
	}

	public void method93(int i, int i_41_, int i_42_, int i_43_, int[] is, int i_44_) {
		long l = IDirect3DTexture.GetSurfaceLevel(((Class200_Sub3_Sub1) this).aLong6407, 0);
		long l_45_ = IDirect3DDevice.CreateRenderTarget((((Class_ra_Sub3_Sub2) (((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410)).aLong9847), i_42_, i_43_, 21, 0, 0, true);
		if (jagdx.a.f(IDirect3DDevice.StretchRect((((Class_ra_Sub3_Sub2) ((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410).aLong9847), l, i, i_41_, i_42_, i_43_, l_45_, 0, 0, i_42_, i_43_, 1))) {
			IDirect3DSurface.Download(l_45_, 0, 0, i_42_, i_43_, i_42_ * 4, 16, (((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aLong8217));
			((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216.clear();
			((Class200_Sub3_Sub1) this).aClass_ra_Sub3_Sub2_6410.aByteBuffer8216.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_45_);
	}

	public void u() {
		super.b();
	}

	public boolean method108() {
		return super.method103();
	}

	public boolean method111() {
		return super.method103();
	}

	public int method84() {
		return super.method76();
	}

	public void method126() {
		super.method128();
	}

	public float method91(float f) {
		return super.method77(f);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method87(int i, int i_46_, int i_47_, int i_48_, byte[] is, Class55 class55, int i_49_, int i_50_) {
		super.method82(i, i_46_, i_47_, i_48_, is, class55, i_49_, i_50_);
	}

	public Interface8_Impl1_Impl1 method120(int i) {
		return new Class192(this, i);
	}

	public boolean method85() {
		return super.method79();
	}

	public void method100(int i, int i_51_, int i_52_, int i_53_, byte[] is, Class55 class55, int i_54_, int i_55_) {
		super.method82(i, i_51_, i_52_, i_53_, is, class55, i_54_, i_55_);
	}

	Class200_Sub3_Sub1(Class_ra_Sub3_Sub2 class_ra_sub3_sub2, Class55 class55, Class77 class77, int i, int i_56_) {
		super(class_ra_sub3_sub2, class55, class77, i, i_56_, 1025, 0);
	}

	public boolean method110() {
		return super.method79();
	}

	public float method105(float f) {
		return super.method78(f);
	}
}
