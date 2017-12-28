
/* Class319_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class319_Sub2 extends Class319 implements Interface29 {
	int anInt9158;
	int anInt9159;

	public void method68(int i, int i_0_, int i_1_, int i_2_, byte[] is, Class150 class150, int i_3_, int i_4_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_4_);
		OpenGL.glTexSubImage2Dub(((Class319_Sub2) this).anInt3707, 0, i, i_0_, i_1_, i_2_, Class505_Sub2_Sub1.method15575(class150), 5121, is, i_3_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1, int i, int i_5_, boolean bool, int[] is, int i_6_, int i_7_) {
		super(class505_sub2_sub1, 3553, Class150.aClass150_1949, Class76.aClass76_751, i * i_5_, bool);
		((Class319_Sub2) this).anInt9159 = i;
		((Class319_Sub2) this).anInt9158 = i_5_;
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (!bool || i_7_ != 0 || i_6_ != 0) {
			OpenGL.glPixelStorei(3314, i_7_);
			OpenGL.glTexImage2Di(((Class319_Sub2) this).anInt3707, 0, 6408, ((Class319_Sub2) this).anInt9159, ((Class319_Sub2) this).anInt9158, 0, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub2) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_6_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method5714(((Class319_Sub2) this).anInt3707, i, i_5_, is);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, int i, int i_8_, boolean bool, byte[] is, int i_9_, int i_10_) {
		super(class505_sub2_sub1, 3553, class150, Class76.aClass76_751, i * i_8_, bool);
		((Class319_Sub2) this).anInt9159 = i;
		((Class319_Sub2) this).anInt9158 = i_8_;
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		if (!bool || i_10_ != 0 || i_9_ != 0) {
			OpenGL.glPixelStorei(3314, i_10_);
			Class150 class150_11_ = ((Class319_Sub2) this).aClass150_3708;
			if (((Class319_Sub2) this).aClass150_3708 != null) {
				/* empty */
			}
			if (class150_11_ == Class150.aClass150_1956)
				OpenGL.glCompressedTexImage2Dub((((Class319_Sub2) this).anInt3707), 0, 33777, i, i_8_, 0, i * i_8_ / 2, is, i_9_);
			else {
				Class150 class150_12_ = ((Class319_Sub2) this).aClass150_3708;
				if (((Class319_Sub2) this).aClass150_3708 != null) {
					/* empty */
				}
				if (class150_12_ == Class150.aClass150_1957)
					OpenGL.glCompressedTexImage2Dub((((Class319_Sub2) this).anInt3707), 0, 33779, i, i_8_, 0, i * i_8_, is, i_9_);
				else
					OpenGL.glTexImage2Dub(((Class319_Sub2) this).anInt3707, 0, Class505_Sub2_Sub1.method15574((((Class319_Sub2) this).aClass150_3708), (((Class319_Sub2) this).aClass76_3710)), i, i_8_, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub2) this).aClass150_3708), 5121, is, i_9_);
			}
			OpenGL.glPixelStorei(3314, 0);
		} else
			method5707(((Class319_Sub2) this).anInt3707, i, i_8_, is);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method207() {
		super.method207();
	}

	public int method1() {
		return ((Class319_Sub2) this).anInt9159;
	}

	public int method59() {
		return ((Class319_Sub2) this).anInt9158;
	}

	void method14494(int i, int i_13_, int i_14_, int i_15_, float[] fs, Class150 class150, int i_16_, int i_17_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_17_);
		OpenGL.glTexSubImage2Df(((Class319_Sub2) this).anInt3707, 0, i, i_13_, i_14_, i_15_, Class505_Sub2_Sub1.method15575(class150), 5121, fs, i_16_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public boolean method63() {
		return true;
	}

	public boolean method46() {
		return true;
	}

	public void method50(boolean bool, boolean bool_18_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexParameteri(((Class319_Sub2) this).anInt3707, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class319_Sub2) this).anInt3707, 10243, bool_18_ ? 10497 : 33071);
	}

	public float method65(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9159;
	}

	public void method52(int i, int i_19_, int i_20_, int i_21_, byte[] is, Class150 class150, int i_22_, int i_23_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_23_);
		OpenGL.glTexSubImage2Dub(((Class319_Sub2) this).anInt3707, 0, i, i_19_, i_20_, i_21_, Class505_Sub2_Sub1.method15575(class150), 5121, is, i_22_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method61(int i, int i_24_, int i_25_, int i_26_, int[] is, int i_27_, int i_28_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_28_);
		OpenGL.glTexSubImage2Di(((Class319_Sub2) this).anInt3707, 0, i, i_24_, i_25_, i_26_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub2) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_27_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method47(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9159;
	}

	public Interface9 method200(int i) {
		return new Class324(this, i);
	}

	public int method55() {
		return ((Class319_Sub2) this).anInt9159;
	}

	public int method71() {
		return ((Class319_Sub2) this).anInt9158;
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method26() {
		super.method26();
	}

	public void method48(int i, int i_29_, int i_30_, int i_31_, int[] is, int i_32_, int i_33_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_33_);
		OpenGL.glTexSubImage2Di(((Class319_Sub2) this).anInt3707, 0, i, i_29_, i_30_, i_31_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub2) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_32_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public float method62(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9158;
	}

	public void method32() {
		super.method26();
	}

	public int method57() {
		return ((Class319_Sub2) this).anInt9159;
	}

	public int method70() {
		return ((Class319_Sub2) this).anInt9159;
	}

	public int method36() {
		return ((Class319_Sub2) this).anInt9159;
	}

	public float method56(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9159;
	}

	public float method45(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9159;
	}

	public float method60(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9158;
	}

	public float method58(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9158;
	}

	public float method51(float f) {
		return f / (float) ((Class319_Sub2) this).anInt9158;
	}

	public void method53(int i, int i_34_, int i_35_, int i_36_, int[] is, int i_37_) {
		int[] is_38_ = new int[(((Class319_Sub2) this).anInt9159 * ((Class319_Sub2) this).anInt9158)];
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(((Class319_Sub2) this).anInt3707, 0, 32993, 5121, is_38_, 0);
		for (int i_39_ = 0; i_39_ < i_36_; i_39_++)
			System.arraycopy(is_38_, ((i_34_ + (i_36_ - 1) - i_39_) * ((Class319_Sub2) this).anInt9159), is, i_37_ + i_39_ * i_35_, i_35_);
	}

	public boolean method54() {
		return super.method54();
	}

	public int method72() {
		return ((Class319_Sub2) this).anInt9158;
	}

	public void method66(int i, int i_40_, int i_41_, int i_42_, int[] is, int i_43_, int i_44_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_44_);
		OpenGL.glTexSubImage2Di(((Class319_Sub2) this).anInt3707, 0, i, i_40_, i_41_, i_42_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub2) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_43_);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method67(int i, int i_45_, int i_46_, int i_47_, int[] is, int i_48_, int i_49_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_49_);
		OpenGL.glTexSubImage2Di(((Class319_Sub2) this).anInt3707, 0, i, i_45_, i_46_, i_47_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub2) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_48_);
		OpenGL.glPixelStorei(3314, 0);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, int i, int i_50_, boolean bool, float[] fs, int i_51_, int i_52_) {
		super(class505_sub2_sub1, 3553, class150, Class76.aClass76_758, i * i_50_, bool);
		((Class319_Sub2) this).anInt9159 = i;
		((Class319_Sub2) this).anInt9158 = i_50_;
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (!bool || i_52_ != 0 || i_51_ != 0) {
			OpenGL.glPixelStorei(3314, i_52_);
			OpenGL.glTexImage2Df(((Class319_Sub2) this).anInt3707, 0, Class505_Sub2_Sub1.method15574((((Class319_Sub2) this).aClass150_3708), (((Class319_Sub2) this).aClass76_3710)), i, i_50_, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub2) this).aClass150_3708), 5126, fs, i_51_ * 4);
			OpenGL.glPixelStorei(3314, 0);
		} else
			method5702(((Class319_Sub2) this).anInt3707, i, i_50_, fs);
	}

	public void method69(int i, int i_53_, int i_54_, int i_55_, int[] is, int i_56_) {
		int[] is_57_ = new int[(((Class319_Sub2) this).anInt9159 * ((Class319_Sub2) this).anInt9158)];
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(((Class319_Sub2) this).anInt3707, 0, 32993, 5121, is_57_, 0);
		for (int i_58_ = 0; i_58_ < i_55_; i_58_++)
			System.arraycopy(is_57_, ((i_53_ + (i_55_ - 1) - i_58_) * ((Class319_Sub2) this).anInt9159), is, i_56_ + i_58_ * i_54_, i_54_);
	}

	public boolean method49() {
		return super.method54();
	}

	public void method203() {
		super.method207();
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	public Interface9 method199(int i) {
		return new Class324(this, i);
	}

	Class319_Sub2(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, Class76 class76, int i, int i_59_) {
		super(class505_sub2_sub1, 3553, class150, class76, i * i_59_, false);
		((Class319_Sub2) this).anInt9159 = i;
		((Class319_Sub2) this).anInt9158 = i_59_;
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexImage2Dub(((Class319_Sub2) this).anInt3707, 0, Class505_Sub2_Sub1.method15574((((Class319_Sub2) this).aClass150_3708), (((Class319_Sub2) this).aClass76_3710)), i, i_59_, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub2) this).aClass150_3708), Class505_Sub2_Sub1.method15566(((Class319_Sub2) this).aClass76_3710), null, 0);
	}

	public void method64(boolean bool, boolean bool_60_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexParameteri(((Class319_Sub2) this).anInt3707, 10242, bool ? 10497 : 33071);
		OpenGL.glTexParameteri(((Class319_Sub2) this).anInt3707, 10243, bool_60_ ? 10497 : 33071);
	}

	void method14495(int i, int i_61_, int i_62_, int i_63_, float[] fs, Class150 class150, int i_64_, int i_65_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_65_);
		OpenGL.glTexSubImage2Df(((Class319_Sub2) this).anInt3707, 0, i, i_61_, i_62_, i_63_, Class505_Sub2_Sub1.method15575(class150), 5121, fs, i_64_);
		OpenGL.glPixelStorei(3314, 0);
	}

	void method14496(int i, int i_66_, int i_67_, int i_68_, float[] fs, Class150 class150, int i_69_, int i_70_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_70_);
		OpenGL.glTexSubImage2Df(((Class319_Sub2) this).anInt3707, 0, i, i_66_, i_67_, i_68_, Class505_Sub2_Sub1.method15575(class150), 5121, fs, i_69_);
		OpenGL.glPixelStorei(3314, 0);
	}

	void method14497(int i, int i_71_, int i_72_, int i_73_, float[] fs, Class150 class150, int i_74_, int i_75_) {
		((Class319_Sub2) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_75_);
		OpenGL.glTexSubImage2Df(((Class319_Sub2) this).anInt3707, 0, i, i_71_, i_72_, i_73_, Class505_Sub2_Sub1.method15575(class150), 5121, fs, i_74_);
		OpenGL.glPixelStorei(3314, 0);
	}
}
