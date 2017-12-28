
/* Class319_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class319_Sub3 extends Class319 implements Interface29 {
	int anInt9166;
	int anInt9167;

	public void method68(int i, int i_0_, int i_1_, int i_2_, byte[] is, Class150 class150, int i_3_, int i_4_) {
		if (i_4_ == 0)
			i_4_ = i_1_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_4_ != i_1_)
			OpenGL.glPixelStorei(3314, i_4_);
		OpenGL.glTexSubImage2Dub(((Class319_Sub3) this).anInt3707, 0, i, i_0_, i_1_, i_2_, Class505_Sub2_Sub1.method15575(class150), 5121, is, i_3_);
		if (i_4_ != i_1_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public void method32() {
		super.method26();
	}

	public float method47(float f) {
		return f;
	}

	Class319_Sub3(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, int i, int i_5_, float[] fs, int i_6_, int i_7_) {
		super(class505_sub2_sub1, 34037, class150, Class76.aClass76_758, i * i_5_, false);
		((Class319_Sub3) this).anInt9167 = i;
		((Class319_Sub3) this).anInt9166 = i_5_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_7_);
		OpenGL.glTexImage2Df(((Class319_Sub3) this).anInt3707, 0, (Class505_Sub2_Sub1.method15574(((Class319_Sub3) this).aClass150_3708, ((Class319_Sub3) this).aClass76_3710)), i, i_5_, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub3) this).aClass150_3708), 5126, fs, i_6_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public int method1() {
		return ((Class319_Sub3) this).anInt9167;
	}

	public int method59() {
		return ((Class319_Sub3) this).anInt9166;
	}

	public float method62(float f) {
		return f;
	}

	public void method48(int i, int i_8_, int i_9_, int i_10_, int[] is, int i_11_, int i_12_) {
		if (i_12_ == 0)
			i_12_ = i_9_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (i_9_ != i_12_)
			OpenGL.glPixelStorei(3314, i_12_);
		OpenGL.glTexSubImage2Di(((Class319_Sub3) this).anInt3707, 0, i, i_8_, i_9_, i_10_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub3) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_11_);
		if (i_9_ != i_12_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public boolean method46() {
		return false;
	}

	public void method50(boolean bool, boolean bool_13_) {
		/* empty */
	}

	public boolean method63() {
		return false;
	}

	public void method52(int i, int i_14_, int i_15_, int i_16_, byte[] is, Class150 class150, int i_17_, int i_18_) {
		if (i_18_ == 0)
			i_18_ = i_15_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_18_ != i_15_)
			OpenGL.glPixelStorei(3314, i_18_);
		OpenGL.glTexSubImage2Dub(((Class319_Sub3) this).anInt3707, 0, i, i_14_, i_15_, i_16_, Class505_Sub2_Sub1.method15575(class150), 5121, is, i_17_);
		if (i_18_ != i_15_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	public boolean method54() {
		return super.method54();
	}

	public Interface9 method200(int i) {
		return new Class314(this, i);
	}

	public int method70() {
		return ((Class319_Sub3) this).anInt9167;
	}

	Class319_Sub3(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, Class76 class76, int i, int i_19_) {
		super(class505_sub2_sub1, 34037, class150, class76, i * i_19_, false);
		((Class319_Sub3) this).anInt9167 = i;
		((Class319_Sub3) this).anInt9166 = i_19_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glTexImage2Dub(((Class319_Sub3) this).anInt3707, 0, Class505_Sub2_Sub1.method15574((((Class319_Sub3) this).aClass150_3708), (((Class319_Sub3) this).aClass76_3710)), i, i_19_, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub3) this).aClass150_3708), Class505_Sub2_Sub1.method15566(((Class319_Sub3) this).aClass76_3710), null, 0);
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method26() {
		super.method26();
	}

	public float method60(float f) {
		return f;
	}

	public int method55() {
		return ((Class319_Sub3) this).anInt9167;
	}

	public boolean method49() {
		return super.method54();
	}

	public int method57() {
		return ((Class319_Sub3) this).anInt9167;
	}

	public int method72() {
		return ((Class319_Sub3) this).anInt9166;
	}

	public float method65(float f) {
		return f;
	}

	public float method56(float f) {
		return f;
	}

	public float method45(float f) {
		return f;
	}

	public void method53(int i, int i_20_, int i_21_, int i_22_, int[] is, int i_23_) {
		int[] is_24_ = new int[(((Class319_Sub3) this).anInt9167 * ((Class319_Sub3) this).anInt9166)];
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(((Class319_Sub3) this).anInt3707, 0, 32993, 5121, is_24_, 0);
		for (int i_25_ = 0; i_25_ < i_22_; i_25_++)
			System.arraycopy(is_24_, ((i_20_ + (i_22_ - 1) - i_25_) * ((Class319_Sub3) this).anInt9167), is, i_23_ + i_25_ * i_21_, i_21_);
	}

	public float method58(float f) {
		return f;
	}

	public float method51(float f) {
		return f;
	}

	public void method67(int i, int i_26_, int i_27_, int i_28_, int[] is, int i_29_, int i_30_) {
		if (i_30_ == 0)
			i_30_ = i_27_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (i_27_ != i_30_)
			OpenGL.glPixelStorei(3314, i_30_);
		OpenGL.glTexSubImage2Di(((Class319_Sub3) this).anInt3707, 0, i, i_26_, i_27_, i_28_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub3) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_29_);
		if (i_27_ != i_30_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method64(boolean bool, boolean bool_31_) {
		/* empty */
	}

	public void method61(int i, int i_32_, int i_33_, int i_34_, int[] is, int i_35_, int i_36_) {
		if (i_36_ == 0)
			i_36_ = i_33_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (i_33_ != i_36_)
			OpenGL.glPixelStorei(3314, i_36_);
		OpenGL.glTexSubImage2Di(((Class319_Sub3) this).anInt3707, 0, i, i_32_, i_33_, i_34_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub3) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_35_);
		if (i_33_ != i_36_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method66(int i, int i_37_, int i_38_, int i_39_, int[] is, int i_40_, int i_41_) {
		if (i_41_ == 0)
			i_41_ = i_38_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		if (i_38_ != i_41_)
			OpenGL.glPixelStorei(3314, i_41_);
		OpenGL.glTexSubImage2Di(((Class319_Sub3) this).anInt3707, 0, i, i_37_, i_38_, i_39_, 32993, ((Class505_Sub2_Sub1) (((Class319_Sub3) this).aClass505_Sub2_Sub1_3700)).anInt10198, is, i_40_);
		if (i_38_ != i_41_)
			OpenGL.glPixelStorei(3314, 0);
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}

	Class319_Sub3(Class505_Sub2_Sub1 class505_sub2_sub1, int i, int i_42_, int[] is, int i_43_, int i_44_) {
		super(class505_sub2_sub1, 34037, Class150.aClass150_1949, Class76.aClass76_751, i * i_42_, false);
		((Class319_Sub3) this).anInt9167 = i;
		((Class319_Sub3) this).anInt9166 = i_42_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3314, i_44_);
		OpenGL.glTexImage2Di(((Class319_Sub3) this).anInt3707, 0, 6408, ((Class319_Sub3) this).anInt9167, ((Class319_Sub3) this).anInt9166, 0, 32993, (((Class505_Sub2_Sub1) ((Class319_Sub3) this).aClass505_Sub2_Sub1_3700).anInt10198), is, i_43_ * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	public void method69(int i, int i_45_, int i_46_, int i_47_, int[] is, int i_48_) {
		int[] is_49_ = new int[(((Class319_Sub3) this).anInt9167 * ((Class319_Sub3) this).anInt9166)];
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glGetTexImagei(((Class319_Sub3) this).anInt3707, 0, 32993, 5121, is_49_, 0);
		for (int i_50_ = 0; i_50_ < i_47_; i_50_++)
			System.arraycopy(is_49_, ((i_45_ + (i_47_ - 1) - i_50_) * ((Class319_Sub3) this).anInt9167), is, i_48_ + i_50_ * i_46_, i_46_);
	}

	public int method36() {
		return ((Class319_Sub3) this).anInt9167;
	}

	public void method203() {
		super.method207();
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method207() {
		super.method207();
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	public Interface9 method199(int i) {
		return new Class314(this, i);
	}

	public int method71() {
		return ((Class319_Sub3) this).anInt9166;
	}

	Class319_Sub3(Class505_Sub2_Sub1 class505_sub2_sub1, Class150 class150, int i, int i_51_, byte[] is, int i_52_, int i_53_) {
		super(class505_sub2_sub1, 34037, class150, Class76.aClass76_751, i * i_51_, false);
		((Class319_Sub3) this).anInt9167 = i;
		((Class319_Sub3) this).anInt9166 = i_51_;
		((Class319_Sub3) this).aClass505_Sub2_Sub1_3700.method14035(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, i_53_);
		OpenGL.glTexImage2Dub(((Class319_Sub3) this).anInt3707, 0, (Class505_Sub2_Sub1.method15574(((Class319_Sub3) this).aClass150_3708, ((Class319_Sub3) this).aClass76_3710)), i, i_51_, 0, Class505_Sub2_Sub1.method15575(((Class319_Sub3) this).aClass150_3708), 5121, is, i_52_);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
