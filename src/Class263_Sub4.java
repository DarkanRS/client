/* Class263_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class263_Sub4 extends Class263 implements Interface9_Impl2_Impl1 {
	int anInt9953;
	int anInt9954;

	public boolean method111() {
		return super.method103();
	}

	public float method105(float f) {
		return f;
	}

	Class263_Sub4(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, int i, int i_0_, byte[] is, int i_1_, int i_2_) {
		super(class_ra_sub3_sub1, 34037, class55, Class77.aClass77_717, i * i_0_, false);
		((Class263_Sub4) this).anInt9954 = i;
		((Class263_Sub4) this).anInt9953 = i_0_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_2_);
		OpenGL.glTexImage2Dub(((Class263_Sub4) this).anInt6415, 0, (Class_ra_Sub3_Sub1.method5533(((Class263_Sub4) this).aClass55_6419, ((Class263_Sub4) this).aClass77_6420)), i, i_0_, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub4) this).aClass55_6419), 5121, is, i_1_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class263_Sub4(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, int i, int i_3_, float[] fs, int i_4_, int i_5_) {
		super(class_ra_sub3_sub1, 34037, class55, Class77.aClass77_721, i * i_3_, false);
		((Class263_Sub4) this).anInt9954 = i;
		((Class263_Sub4) this).anInt9953 = i_3_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_5_);
		OpenGL.glTexImage2Df(((Class263_Sub4) this).anInt6415, 0, (Class_ra_Sub3_Sub1.method5533(((Class263_Sub4) this).aClass55_6419, ((Class263_Sub4) this).aClass77_6420)), i, i_3_, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub4) this).aClass55_6419), 5126, fs, i_4_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method99(boolean bool, boolean bool_6_) {
		/* empty */
	}

	public void d() {
		super.b();
	}

	public float method77(float f) {
		return f;
	}

	public void method123() {
		super.method128();
	}

	public boolean method79() {
		return false;
	}

	public void method80(boolean bool, boolean bool_7_) {
		/* empty */
	}

	public void method81(int i, int i_8_, int i_9_, int i_10_, int[] is, int i_11_, int i_12_) {
		if (i_12_ == 0)
			i_12_ = i_9_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (i_9_ != i_12_)
			OpenGL.glPixelStorei(3314, i_12_);
		OpenGL.glTexSubImage2Di(((Class263_Sub4) this).anInt6415, 0, i, i_8_, i_9_, i_10_, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_11_);
		if (i_9_ != i_12_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void b() {
		super.b();
	}

	public void method83(int i, int i_13_, int i_14_, int i_15_, int[] is, int i_16_) {
		int[] is_17_ = new int[(((Class263_Sub4) this).anInt9954 * ((Class263_Sub4) this).anInt9953)];
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGetTexImagei(((Class263_Sub4) this).anInt6415, 0, 32993, 5121, is_17_, 0);
		for (int i_18_ = 0; i_18_ < i_15_; i_18_++)
			System.arraycopy(is_17_, ((i_13_ + (i_15_ - 1) - i_18_) * ((Class263_Sub4) this).anInt9954), is, i_16_ + i_18_ * i_14_, i_14_);
	}

	public Interface8_Impl1_Impl1 method117(int i) {
		return new Class258(this, i);
	}

	public Interface8_Impl1_Impl1 method118(int i) {
		return new Class258(this, i);
	}

	public void method128() {
		super.method128();
	}

	public void method122(Class179 class179) {
		super.method122(class179);
	}

	public void method100(int i, int i_19_, int i_20_, int i_21_, byte[] is, Class55 class55, int i_22_, int i_23_) {
		if (i_23_ == 0)
			i_23_ = i_20_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_23_ != i_20_)
			OpenGL.glPixelStorei(3314, i_23_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub4) this).anInt6415, 0, i, i_19_, i_20_, i_21_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_22_);
		if (i_23_ != i_20_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method127(Class179 class179) {
		super.method122(class179);
	}

	public void u() {
		super.b();
	}

	public void x() {
		super.b();
	}

	public int method86() {
		return ((Class263_Sub4) this).anInt9954;
	}

	public int method75() {
		return ((Class263_Sub4) this).anInt9953;
	}

	public int method84() {
		return ((Class263_Sub4) this).anInt9953;
	}

	public int method88() {
		return ((Class263_Sub4) this).anInt9953;
	}

	public float method89(float f) {
		return f;
	}

	public float method90(float f) {
		return f;
	}

	public float method91(float f) {
		return f;
	}

	Class263_Sub4(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, Class55 class55, Class77 class77, int i, int i_24_) {
		super(class_ra_sub3_sub1, 34037, class55, class77, i * i_24_, false);
		((Class263_Sub4) this).anInt9954 = i;
		((Class263_Sub4) this).anInt9953 = i_24_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glTexImage2Dub(((Class263_Sub4) this).anInt6415, 0, Class_ra_Sub3_Sub1.method5533((((Class263_Sub4) this).aClass55_6419), (((Class263_Sub4) this).aClass77_6420)), i, i_24_, 0, Class_ra_Sub3_Sub1.method5532(((Class263_Sub4) this).aClass55_6419), Class_ra_Sub3_Sub1.method5537(((Class263_Sub4) this).aClass77_6420), null, 0);
	}

	public float method109(float f) {
		return f;
	}

	public float method94(float f) {
		return f;
	}

	public float method95(float f) {
		return f;
	}

	public void method96(boolean bool, boolean bool_25_) {
		/* empty */
	}

	public void method97(boolean bool, boolean bool_26_) {
		/* empty */
	}

	public void method98(boolean bool, boolean bool_27_) {
		/* empty */
	}

	public void method82(int i, int i_28_, int i_29_, int i_30_, byte[] is, Class55 class55, int i_31_, int i_32_) {
		if (i_32_ == 0)
			i_32_ = i_29_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_32_ != i_29_)
			OpenGL.glPixelStorei(3314, i_32_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub4) this).anInt6415, 0, i, i_28_, i_29_, i_30_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_31_);
		if (i_32_ != i_29_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class263_Sub4(Class_ra_Sub3_Sub1 class_ra_sub3_sub1, int i, int i_33_, int[] is, int i_34_, int i_35_) {
		super(class_ra_sub3_sub1, 34037, Class55.aClass55_557, Class77.aClass77_717, i * i_33_, false);
		((Class263_Sub4) this).anInt9954 = i;
		((Class263_Sub4) this).anInt9953 = i_33_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3314, i_35_);
		OpenGL.glTexImage2Di(((Class263_Sub4) this).anInt6415, 0, 6408, ((Class263_Sub4) this).anInt9954, ((Class263_Sub4) this).anInt9953, 0, 32993, (((Class_ra_Sub3_Sub1) ((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422).anInt9841), is, i_34_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method101(int i, int i_36_, int i_37_, int i_38_, int[] is, int i_39_, int i_40_) {
		if (i_40_ == 0)
			i_40_ = i_37_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (i_37_ != i_40_)
			OpenGL.glPixelStorei(3314, i_40_);
		OpenGL.glTexSubImage2Di(((Class263_Sub4) this).anInt6415, 0, i, i_36_, i_37_, i_38_, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_39_);
		if (i_37_ != i_40_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method102(int i, int i_41_, int i_42_, int i_43_, int[] is, int i_44_, int i_45_) {
		if (i_45_ == 0)
			i_45_ = i_42_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		if (i_42_ != i_45_)
			OpenGL.glPixelStorei(3314, i_45_);
		OpenGL.glTexSubImage2Di(((Class263_Sub4) this).anInt6415, 0, i, i_41_, i_42_, i_43_, 32993, ((Class_ra_Sub3_Sub1) (((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422)).anInt9841, is, i_44_);
		if (i_42_ != i_45_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method104(int i, int i_46_, int i_47_, int i_48_, byte[] is, Class55 class55, int i_49_, int i_50_) {
		if (i_50_ == 0)
			i_50_ = i_47_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_50_ != i_47_)
			OpenGL.glPixelStorei(3314, i_50_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub4) this).anInt6415, 0, i, i_46_, i_47_, i_48_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_49_);
		if (i_50_ != i_47_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public int method92() {
		return ((Class263_Sub4) this).anInt9954;
	}

	public void method87(int i, int i_51_, int i_52_, int i_53_, byte[] is, Class55 class55, int i_54_, int i_55_) {
		if (i_55_ == 0)
			i_55_ = i_52_;
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_55_ != i_52_)
			OpenGL.glPixelStorei(3314, i_55_);
		OpenGL.glTexSubImage2Dub(((Class263_Sub4) this).anInt6415, 0, i, i_51_, i_52_, i_53_, Class_ra_Sub3_Sub1.method5532(class55), 5121, is, i_54_);
		if (i_55_ != i_52_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method106(boolean bool, boolean bool_56_) {
		/* empty */
	}

	public void method107(int i, int i_57_, int i_58_, int i_59_, int[] is, int i_60_) {
		int[] is_61_ = new int[(((Class263_Sub4) this).anInt9954 * ((Class263_Sub4) this).anInt9953)];
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGetTexImagei(((Class263_Sub4) this).anInt6415, 0, 32993, 5121, is_61_, 0);
		for (int i_62_ = 0; i_62_ < i_59_; i_62_++)
			System.arraycopy(is_61_, ((i_57_ + (i_59_ - 1) - i_62_) * ((Class263_Sub4) this).anInt9954), is, i_60_ + i_62_ * i_58_, i_58_);
	}

	public boolean method108() {
		return super.method103();
	}

	public void method129(Class179 class179) {
		super.method122(class179);
	}

	public void method125() {
		super.method128();
	}

	public void method126() {
		super.method128();
	}

	public int method76() {
		return ((Class263_Sub4) this).anInt9953;
	}

	public Interface8_Impl1_Impl1 method121(int i) {
		return new Class258(this, i);
	}

	public void method124(Class179 class179) {
		super.method122(class179);
	}

	public boolean method103() {
		return super.method103();
	}

	public Interface8_Impl1_Impl1 method120(int i) {
		return new Class258(this, i);
	}

	public Interface8_Impl1_Impl1 method119(int i) {
		return new Class258(this, i);
	}

	public float method78(float f) {
		return f;
	}

	public void method93(int i, int i_63_, int i_64_, int i_65_, int[] is, int i_66_) {
		int[] is_67_ = new int[(((Class263_Sub4) this).anInt9954 * ((Class263_Sub4) this).anInt9953)];
		((Class263_Sub4) this).aClass_ra_Sub3_Sub1_6422.method5358(this);
		OpenGL.glGetTexImagei(((Class263_Sub4) this).anInt6415, 0, 32993, 5121, is_67_, 0);
		for (int i_68_ = 0; i_68_ < i_65_; i_68_++)
			System.arraycopy(is_67_, ((i_63_ + (i_65_ - 1) - i_68_) * ((Class263_Sub4) this).anInt9954), is, i_66_ + i_68_ * i_64_, i_64_);
	}

	public boolean method110() {
		return false;
	}

	public boolean method85() {
		return false;
	}
}
