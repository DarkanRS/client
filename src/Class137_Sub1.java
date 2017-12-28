
/* Class137_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class137_Sub1 extends Class137 {
	int anInt9086;
	int anInt9087;

	void method14435(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_, boolean bool) {
		if (i_4_ == 0)
			i_4_ = i_1_;
		if (bool) {
			int[] is_5_ = new int[i_1_ * i_2_];
			for (int i_6_ = 0; i_6_ < i_2_; i_6_++) {
				int i_7_ = i_6_ * i_1_;
				int i_8_ = (i_2_ - i_6_ - 1) * i_4_ + i_3_;
				for (int i_9_ = 0; i_9_ < i_1_; i_9_++)
					is_5_[i_7_++] = is[i_8_++];
			}
			is = is_5_;
		}
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		if (i_1_ != i_4_)
			OpenGL.glPixelStorei(3314, i_4_);
		OpenGL.glTexSubImage2Di(((Class137_Sub1) this).anInt1648, 0, i, ((Class137_Sub1) this).anInt9086 - i_0_ - i_2_, i_1_, i_2_, 32993, (((Class505_Sub1) ((Class137_Sub1) this).aClass505_Sub1_1646).anInt8410), is, i_3_);
		if (i_1_ != i_4_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Interface8 method14436(int i) {
		return new Class154(this, i);
	}

	Class137_Sub1(Class505_Sub1 class505_sub1, int i, int i_10_, int i_11_, boolean bool, int[] is, int i_12_, int i_13_, boolean bool_14_) {
		super(class505_sub1, i, Class150.aClass150_1949, Class76.aClass76_751, i_10_ * i_11_, bool);
		((Class137_Sub1) this).anInt9087 = i_10_;
		((Class137_Sub1) this).anInt9086 = i_11_;
		if (bool_14_) {
			int[] is_15_ = new int[is.length];
			for (int i_16_ = 0; i_16_ < i_11_; i_16_++) {
				int i_17_ = i_16_ * i_10_;
				int i_18_ = (i_11_ - i_16_ - 1) * i_10_;
				for (int i_19_ = 0; i_19_ < i_10_; i_19_++)
					is_15_[i_17_++] = is[i_18_++];
			}
			is = is_15_;
		}
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		if (((Class137_Sub1) this).anInt1648 == 34037 || !bool || i_12_ != 0 || i_13_ != 0) {
			OpenGL.glPixelStorei(3314, i_12_);
			OpenGL.glTexImage2Di(((Class137_Sub1) this).anInt1648, 0, (Class505_Sub1.method13630(((Class137_Sub1) this).aClass150_1650, ((Class137_Sub1) this).aClass76_1651)), ((Class137_Sub1) this).anInt9087, ((Class137_Sub1) this).anInt9086, 0, 32993, (((Class505_Sub1) ((Class137_Sub1) this).aClass505_Sub1_1646).anInt8410), is, i_13_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method2354(false);
		} else {
			method2371(((Class137_Sub1) this).anInt1648, Class505_Sub1.method13630((((Class137_Sub1) this).aClass150_1650), (((Class137_Sub1) this).aClass76_1651)), ((Class137_Sub1) this).anInt9087, ((Class137_Sub1) this).anInt9086, 32993, ((Class505_Sub1) ((Class137_Sub1) this).aClass505_Sub1_1646).anInt8410, is);
			method2354(true);
		}
		method2351(true);
	}

	Class137_Sub1(Class505_Sub1 class505_sub1, int i, Class150 class150, Class76 class76, int i_20_, int i_21_, boolean bool, byte[] is, Class150 class150_22_, boolean bool_23_) {
		super(class505_sub1, i, class150, class76, i_20_ * i_21_, bool);
		((Class137_Sub1) this).anInt9087 = i_20_;
		((Class137_Sub1) this).anInt9086 = i_21_;
		if (bool_23_) {
			byte[] is_24_ = new byte[is.length];
			for (int i_25_ = 0; i_25_ < i_21_; i_25_++) {
				int i_26_ = i_25_ * i_20_;
				int i_27_ = (i_21_ - i_25_ - 1) * i_20_;
				for (int i_28_ = 0; i_28_ < i_20_; i_28_++)
					is_24_[i_26_++] = is[i_27_++];
			}
			is = is_24_;
		}
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && ((Class137_Sub1) this).anInt1648 != 34037) {
			method2359(i, Class505_Sub1.method13630((((Class137_Sub1) this).aClass150_1650), (((Class137_Sub1) this).aClass76_1651)), i_20_, i_21_, class150_22_, is);
			method2354(true);
		} else {
			OpenGL.glTexImage2Dub(((Class137_Sub1) this).anInt1648, 0, (Class505_Sub1.method13630(((Class137_Sub1) this).aClass150_1650, ((Class137_Sub1) this).aClass76_1651)), ((Class137_Sub1) this).anInt9087, ((Class137_Sub1) this).anInt9086, 0, Class505_Sub1.method13629(class150_22_), 5121, is, 0);
			method2354(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method2351(true);
	}

	Interface9 method14437(int i) {
		return new Class154(this, i);
	}

	void method14438(boolean bool, boolean bool_29_) {
		if (((Class137_Sub1) this).anInt1648 == 3553) {
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10243, bool_29_ ? 10497 : 33071);
		}
	}

	Class137_Sub1(Class505_Sub1 class505_sub1, int i, int i_30_, int i_31_, int i_32_, int i_33_) {
		super(class505_sub1, i, Class150.aClass150_1950, Class76.aClass76_751, i_32_ * i_33_, false);
		((Class137_Sub1) this).anInt9087 = i_32_;
		((Class137_Sub1) this).anInt9086 = i_33_;
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		Class158 class158 = ((Class137_Sub1) this).aClass505_Sub1_1646.method8523((byte) 125);
		if (class158 != null) {
			int i_34_ = class158.method2716() - (i_31_ + i_33_);
			int i_35_ = Class505_Sub1.method13630((((Class137_Sub1) this).aClass150_1650), (((Class137_Sub1) this).aClass76_1651));
			OpenGL.glCopyTexImage2D(((Class137_Sub1) this).anInt1648, 0, i_35_, i_30_, i_34_, i_32_, i_33_, 0);
		}
		method2351(true);
	}

	Class137_Sub1(Class505_Sub1 class505_sub1, int i, Class150 class150, Class76 class76, int i_36_, int i_37_, boolean bool, float[] fs, Class150 class150_38_) {
		super(class505_sub1, i, class150, class76, i_36_ * i_37_, bool);
		((Class137_Sub1) this).anInt9087 = i_36_;
		((Class137_Sub1) this).anInt9086 = i_37_;
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		if (bool && ((Class137_Sub1) this).anInt1648 != 34037) {
			method2361(i, Class505_Sub1.method13630((((Class137_Sub1) this).aClass150_1650), (((Class137_Sub1) this).aClass76_1651)), i_36_, i_37_, class150_38_, fs);
			method2354(true);
		} else {
			OpenGL.glTexImage2Df(((Class137_Sub1) this).anInt1648, 0, (Class505_Sub1.method13630(((Class137_Sub1) this).aClass150_1650, ((Class137_Sub1) this).aClass76_1651)), ((Class137_Sub1) this).anInt9087, ((Class137_Sub1) this).anInt9086, 0, Class505_Sub1.method13629(class150_38_), 5126, fs, 0);
			method2354(false);
		}
		method2351(true);
	}

	void method14439(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		Class158 class158 = ((Class137_Sub1) this).aClass505_Sub1_1646.method8523((byte) 122);
		if (class158 != null) {
			int i_44_ = class158.method2716() - (i_43_ + i_41_);
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glCopyTexSubImage2D(((Class137_Sub1) this).anInt1648, 0, i, (((Class137_Sub1) this).anInt9086 - (i_39_ + i_41_)), i_42_, i_44_, i_40_, i_41_);
			OpenGL.glFlush();
		}
	}

	Interface8 method14440(int i) {
		return new Class154(this, i);
	}

	Interface9 method14441(int i) {
		return new Class154(this, i);
	}

	void method14442(boolean bool, boolean bool_45_) {
		if (((Class137_Sub1) this).anInt1648 == 3553) {
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10243, bool_45_ ? 10497 : 33071);
		}
	}

	Interface8 method14443(int i) {
		return new Class154(this, i);
	}

	void method14444(boolean bool, boolean bool_46_) {
		if (((Class137_Sub1) this).anInt1648 == 3553) {
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10243, bool_46_ ? 10497 : 33071);
		}
	}

	void method14445(boolean bool, boolean bool_47_) {
		if (((Class137_Sub1) this).anInt1648 == 3553) {
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class137_Sub1) this).anInt1648, 10243, bool_47_ ? 10497 : 33071);
		}
	}

	void method14446(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		Class158 class158 = ((Class137_Sub1) this).aClass505_Sub1_1646.method8523((byte) 108);
		if (class158 != null) {
			int i_53_ = class158.method2716() - (i_52_ + i_50_);
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glCopyTexSubImage2D(((Class137_Sub1) this).anInt1648, 0, i, (((Class137_Sub1) this).anInt9086 - (i_48_ + i_50_)), i_51_, i_53_, i_49_, i_50_);
			OpenGL.glFlush();
		}
	}

	void method14447(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_) {
		Class158 class158 = ((Class137_Sub1) this).aClass505_Sub1_1646.method8523((byte) 113);
		if (class158 != null) {
			int i_59_ = class158.method2716() - (i_58_ + i_56_);
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glCopyTexSubImage2D(((Class137_Sub1) this).anInt1648, 0, i, (((Class137_Sub1) this).anInt9086 - (i_54_ + i_56_)), i_57_, i_59_, i_55_, i_56_);
			OpenGL.glFlush();
		}
	}

	void method14448(int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_) {
		Class158 class158 = ((Class137_Sub1) this).aClass505_Sub1_1646.method8523((byte) 123);
		if (class158 != null) {
			int i_65_ = class158.method2716() - (i_64_ + i_62_);
			((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
			OpenGL.glCopyTexSubImage2D(((Class137_Sub1) this).anInt1648, 0, i, (((Class137_Sub1) this).anInt9086 - (i_60_ + i_62_)), i_63_, i_65_, i_61_, i_62_);
			OpenGL.glFlush();
		}
	}

	Interface8 method14449(int i) {
		return new Class154(this, i);
	}

	Interface8 method14450(int i) {
		return new Class154(this, i);
	}

	Interface8 method14451(int i) {
		return new Class154(this, i);
	}

	Class137_Sub1(Class505_Sub1 class505_sub1, int i, Class150 class150, Class76 class76, int i_66_, int i_67_) {
		super(class505_sub1, i, class150, class76, i_66_ * i_67_, false);
		((Class137_Sub1) this).anInt9087 = i_66_;
		((Class137_Sub1) this).anInt9086 = i_67_;
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glTexImage2Dub(((Class137_Sub1) this).anInt1648, 0, Class505_Sub1.method13630(((Class137_Sub1) this).aClass150_1650, ((Class137_Sub1) this).aClass76_1651), i_66_, i_67_, 0, Class505_Sub1.method13629(((Class137_Sub1) this).aClass150_1650), 5121, null, 0);
		method2351(true);
	}

	void method14452(int i, int i_68_, int i_69_, int i_70_, int[] is, int i_71_, int i_72_, boolean bool) {
		if (i_72_ == 0)
			i_72_ = i_69_;
		if (bool) {
			int[] is_73_ = new int[i_69_ * i_70_];
			for (int i_74_ = 0; i_74_ < i_70_; i_74_++) {
				int i_75_ = i_74_ * i_69_;
				int i_76_ = (i_70_ - i_74_ - 1) * i_72_ + i_71_;
				for (int i_77_ = 0; i_77_ < i_69_; i_77_++)
					is_73_[i_75_++] = is[i_76_++];
			}
			is = is_73_;
		}
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		if (i_69_ != i_72_)
			OpenGL.glPixelStorei(3314, i_72_);
		OpenGL.glTexSubImage2Di(((Class137_Sub1) this).anInt1648, 0, i, (((Class137_Sub1) this).anInt9086 - i_68_ - i_70_), i_69_, i_70_, 32993, (((Class505_Sub1) ((Class137_Sub1) this).aClass505_Sub1_1646).anInt8410), is, i_71_);
		if (i_69_ != i_72_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Interface9 method14453(int i) {
		return new Class154(this, i);
	}

	Interface9 method14454(int i) {
		return new Class154(this, i);
	}

	void method14455(int i, int i_78_, int i_79_, int i_80_, byte[] is, Class150 class150, int i_81_, int i_82_, boolean bool) {
		if (i_82_ == 0)
			i_82_ = i_79_;
		if (bool) {
			int i_83_ = class150.anInt1959 * 351642797;
			int i_84_ = i_83_ * i_79_;
			int i_85_ = i_83_ * i_82_;
			byte[] is_86_ = new byte[i_84_ * i_80_];
			for (int i_87_ = 0; i_87_ < i_80_; i_87_++) {
				int i_88_ = i_87_ * i_84_;
				int i_89_ = (i_80_ - i_87_ - 1) * i_85_ + i_81_;
				for (int i_90_ = 0; i_90_ < i_84_; i_90_++)
					is_86_[i_88_++] = is[i_89_++];
			}
			is = is_86_;
		}
		((Class137_Sub1) this).aClass505_Sub1_1646.method13654(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_82_ != i_79_)
			OpenGL.glPixelStorei(3314, i_82_);
		OpenGL.glTexSubImage2Dub(((Class137_Sub1) this).anInt1648, 0, i, (((Class137_Sub1) this).anInt9086 - i_78_ - i_80_), i_79_, i_80_, Class505_Sub1.method13629(class150), 5121, is, i_81_);
		if (i_82_ != i_79_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
