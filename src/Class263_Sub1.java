/* Class263_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub1 extends Class263 implements Interface9_Impl2_Impl1 {
	int anInt9951;
	int anInt9952;

	public int method84() {
		return ((Class263_Sub1) this).anInt9951;
	}

	Class263_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(class_ra_sub3_sub1, 3553, Class55.aClass55_557, Class77.aClass77_717, i * i_0_, bool);
		((Class263_Sub1) this).anInt9952 = i;
		((Class263_Sub1) this).anInt9951 = i_0_;
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (!bool || i_2_ != 0 || i_1_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(((Class263_Sub1) this).anInt6415, 0, 6408, ((Class263_Sub1) this).anInt9952, ((Class263_Sub1) this).anInt9951, 0, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_1_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2468(((Class263_Sub1) this).anInt6415, i, i_0_, is);
	}

	Class263_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, int i, int i_3_, boolean bool, byte[] is, int i_4_, int i_5_) {
		super(class_ra_sub3_sub1, 3553, class55, Class77.aClass77_717, i * i_3_, bool);
		((Class263_Sub1) this).anInt9952 = i;
		((Class263_Sub1) this).anInt9951 = i_3_;
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_5_ != 0 || i_4_ != 0) {
			OpenGL.glPixelStorei(3314, i_5_);
			Class55 class55_6_ = ((Class263_Sub1) this).aClass55_6419;
			if (((Class263_Sub1) this).aClass55_6419 != null) {
				/* empty */
			}
			if (class55_6_ == Class55.aClass55_564)
				OpenGL.glCompressedTexImage2Dub((((Class263_Sub1) this).anInt6415), 0, 33777, i, i_3_, 0, i * i_3_ / 2, is, i_4_);
			else {
				Class55 class55_7_ = ((Class263_Sub1) this).aClass55_6419;
				if (((Class263_Sub1) this).aClass55_6419 != null) {
					/* empty */
				}
				if (class55_7_ == Class55.aClass55_558)
					OpenGL.glCompressedTexImage2Dub((((Class263_Sub1) this).anInt6415), 0, 33779, i, i_3_, 0, i * i_3_, is, i_4_);
				else
					OpenGL.glTexImage2Dub(((Class263_Sub1) this).anInt6415, 0, Class_ra_Sub3_Sub1.method5533((((Class263_Sub1) this).aClass55_6419), (((Class263_Sub1) this).aClass77_6420)), i, i_3_, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub1) this).aClass55_6419), 5121, is, i_4_);
			}
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2472(((Class263_Sub1) this).anInt6415, i, i_3_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method126() {
		super.method128();
	}

	public int method76() {
		return ((Class263_Sub1) this).anInt9951;
	}

	public boolean method110() {
		return true;
	}

	public float method78(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9951;
	}

	public boolean method79() {
		return true;
	}

	public void method104(int i, int i_8_, int i_9_, int i_10_, byte[] is, Class55 class55, int i_11_, int i_12_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_12_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub1) this).anInt6415, 0, i, i_8_, i_9_, i_10_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_11_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method86() {
		return ((Class263_Sub1) this).anInt9952;
	}

	public void method82(int i, int i_13_, int i_14_, int i_15_, byte[] is, Class55 class55, int i_16_, int i_17_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_17_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub1) this).anInt6415, 0, i, i_13_, i_14_, i_15_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_16_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method81(int i, int i_18_, int i_19_, int i_20_, int[] is, int i_21_, int i_22_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_22_);
		OpenGL.glTexSubImage2Di(((Class263_Sub1) this).anInt6415, 0, i, i_18_, i_19_, i_20_, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_21_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method83(int i, int i_23_, int i_24_, int i_25_, int[] is, int i_26_) {
		int[] is_27_ = new int[(((Class263_Sub1) this).anInt9952 * ((Class263_Sub1) this).anInt9951)];
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGetTexImagei(((Class263_Sub1) this).anInt6415, 0, 32993, 5121, is_27_, 0);
		for (int i_28_ = 0; i_28_ < i_25_; i_28_++)
			System.arraycopy(is_27_, ((i_23_ + (i_25_ - 1) - i_28_) * ((Class263_Sub1) this).anInt9952), is, i_26_ + i_28_ * i_24_, i_24_);
	}

	public Interface8_Impl1_Impl1 method117(int i) {
		return new Class245(this, i);
	}

	public boolean method85() {
		return true;
	}

	public void method125() {
		super.method128();
	}

	public Interface8_Impl1_Impl1 method121(int i) {
		return new Class245(this, i);
	}

	public void b() {
		super.b();
	}

	public void method93(int i, int i_29_, int i_30_, int i_31_, int[] is, int i_32_) {
		int[] is_33_ = new int[(((Class263_Sub1) this).anInt9952 * ((Class263_Sub1) this).anInt9951)];
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGetTexImagei(((Class263_Sub1) this).anInt6415, 0, 32993, 5121, is_33_, 0);
		for (int i_34_ = 0; i_34_ < i_31_; i_34_++)
			System.arraycopy(is_33_, ((i_29_ + (i_31_ - 1) - i_34_) * ((Class263_Sub1) this).anInt9952), is, i_32_ + i_34_ * i_30_, i_30_);
	}

	public void u() {
		super.b();
	}

	public void x() {
		super.b();
	}

	public float method109(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9951;
	}

	public int method75() {
		return ((Class263_Sub1) this).anInt9951;
	}

	public void method102(int i, int i_35_, int i_36_, int i_37_, int[] is, int i_38_, int i_39_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_39_);
		OpenGL.glTexSubImage2Di(((Class263_Sub1) this).anInt6415, 0, i, i_35_, i_36_, i_37_, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_38_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public int method88() {
		return ((Class263_Sub1) this).anInt9951;
	}

	public float method89(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9952;
	}

	public float method90(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9952;
	}

	public float method91(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9952;
	}

	public float method105(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9951;
	}

	public float method77(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9952;
	}

	public float method94(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9951;
	}

	public void d() {
		super.b();
	}

	public void method96(boolean bool, boolean bool_40_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10243, bool_40_ ? 10497 : 33071);
	}

	public void method97(boolean bool, boolean bool_41_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10243, bool_41_ ? 10497 : 33071);
	}

	public void method98(boolean bool, boolean bool_42_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10243, bool_42_ ? 10497 : 33071);
	}

	public void method106(boolean bool, boolean bool_43_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10243, bool_43_ ? 10497 : 33071);
	}

	public void method99(boolean bool, boolean bool_44_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10243, bool_44_ ? 10497 : 33071);
	}

	public void method101(int i, int i_45_, int i_46_, int i_47_, int[] is, int i_48_, int i_49_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_49_);
		OpenGL.glTexSubImage2Di(((Class263_Sub1) this).anInt6415, 0, i, i_45_, i_46_, i_47_, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_48_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	Class263_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, Class77 class77, int i, int i_50_) {
		super(class_ra_sub3_sub1, 3553, class55, class77, i * i_50_, false);
		((Class263_Sub1) this).anInt9952 = i;
		((Class263_Sub1) this).anInt9951 = i_50_;
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexImage2Dub(((Class263_Sub1) this).anInt6415, 0, Class_ra_Sub3_Sub1.method5533((((Class263_Sub1) this).aClass55_6419), (((Class263_Sub1) this).aClass77_6420)), i, i_50_, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub1) this).aClass55_6419), Class_ra_Sub3_Sub1.method5537(((Class263_Sub1) this).aClass77_6420), null, 0);
	}

	public void method87(int i, int i_51_, int i_52_, int i_53_, byte[] is, Class55 class55, int i_54_, int i_55_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_55_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub1) this).anInt6415, 0, i, i_51_, i_52_, i_53_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_54_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method80(boolean bool, boolean bool_56_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class263_Sub1) this).anInt6415, 10243, bool_56_ ? 10497 : 33071);
	}

	public void method107(int i, int i_57_, int i_58_, int i_59_, int[] is, int i_60_) {
		int[] is_61_ = new int[(((Class263_Sub1) this).anInt9952 * ((Class263_Sub1) this).anInt9951)];
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGetTexImagei(((Class263_Sub1) this).anInt6415, 0, 32993, 5121, is_61_, 0);
		for (int i_62_ = 0; i_62_ < i_59_; i_62_++)
			System.arraycopy(is_61_, ((i_57_ + (i_59_ - 1) - i_62_) * ((Class263_Sub1) this).anInt9952), is, i_60_ + i_62_ * i_58_, i_58_);
	}

	public boolean method108() {
		return super.method103();
	}

	public boolean method111() {
		return super.method103();
	}

	public float method95(float f) {
		return f / (float) ((Class263_Sub1) this).anInt9951;
	}

	void method2473(int i, int i_63_, int i_64_, int i_65_, float[] fs, Class55 class55, int i_66_, int i_67_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_67_);
		OpenGL.glTexSubImage2Df(((Class263_Sub1) this).anInt6415, 0, i, i_63_, i_64_, i_65_, Class_ra_Sub3_Sub1.method5532(class55), 5121, fs, i_66_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method123() {
		super.method128();
	}

	public void method128() {
		super.method128();
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public void method100(int i, int i_68_, int i_69_, int i_70_, byte[] is, Class55 class55, int i_71_, int i_72_) {
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_72_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub1) this).anInt6415, 0, i, i_68_, i_69_, i_70_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_71_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public Interface8_Impl1_Impl1 method120(int i) {
		return new Class245(this, i);
	}

	public Interface8_Impl1_Impl1 method119(int i) {
		return new Class245(this, i);
	}

	public Interface8_Impl1_Impl1 method118(int i) {
		return new Class245(this, i);
	}

	Class263_Sub1(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, int i, int i_73_, boolean bool, float[] fs, int i_74_, int i_75_) {
		super(class_ra_sub3_sub1, 3553, class55, Class77.aClass77_721, i * i_73_, bool);
		((Class263_Sub1) this).anInt9952 = i;
		((Class263_Sub1) this).anInt9951 = i_73_;
		((Class263_Sub1) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (!bool || i_75_ != 0 || i_74_ != 0) {
			OpenGL.glPixelStorei(3314, i_75_);
			OpenGL.glTexImage2Df(((Class263_Sub1) this).anInt6415, 0, (Class_ra_Sub3_Sub1.method5533(((Class263_Sub1) this).aClass55_6419, ((Class263_Sub1) this).aClass77_6420)), i, i_73_, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub1) this).aClass55_6419), 5126, fs, i_74_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method2469(((Class263_Sub1) this).anInt6415, i, i_73_, fs);
	}

	public boolean method103() {
		return super.method103();
	}

	public int method92() {
		return ((Class263_Sub1) this).anInt9952;
	}
}
