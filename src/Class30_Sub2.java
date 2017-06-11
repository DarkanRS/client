/* Class30_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class30_Sub2 extends Class30 {
	int anInt6746;
	int anInt6747;

	Class30_Sub2(Class_ra_Sub2 class_ra_sub2, int i, Class55 class55, Class77 class77, int i_0_, int i_1_, boolean bool, byte[] is, Class55 class55_2_, boolean bool_3_) {
		super(class_ra_sub2, i, class55, class77, i_0_ * i_1_, bool);
		((Class30_Sub2) this).anInt6746 = i_0_;
		((Class30_Sub2) this).anInt6747 = i_1_;
		if (bool_3_) {
			byte[] is_4_ = new byte[is.length];
			for (int i_5_ = 0; i_5_ < i_1_; i_5_++) {
				int i_6_ = i_5_ * i_0_;
				int i_7_ = (i_1_ - i_5_ - 1) * i_0_;
				for (int i_8_ = 0; i_8_ < i_0_; i_8_++)
					is_4_[i_6_++] = is[i_7_++];
			}
			is = is_4_;
		}
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		OpenGL.glPixelStorei(3317, 1);
		if (bool && ((Class30_Sub2) this).anInt372 != 34037) {
			method412(i, Class_ra_Sub2.method5274((((Class30_Sub2) this).aClass55_377), (((Class30_Sub2) this).aClass77_378)), i_0_, i_1_, class55_2_, is);
			method414(true);
		} else {
			OpenGL.glTexImage2Dub(((Class30_Sub2) this).anInt372, 0, Class_ra_Sub2.method5274(((Class30_Sub2) this).aClass55_377, ((Class30_Sub2) this).aClass77_378), ((Class30_Sub2) this).anInt6746, ((Class30_Sub2) this).anInt6747, 0, Class_ra_Sub2.method5228(class55_2_), 5121, is, 0);
			method414(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		method410(true);
	}

	Class30_Sub2(Class_ra_Sub2 class_ra_sub2, int i, int i_9_, int i_10_, boolean bool, int[] is, int i_11_, int i_12_, boolean bool_13_) {
		super(class_ra_sub2, i, Class55.aClass55_557, Class77.aClass77_717, i_9_ * i_10_, bool);
		((Class30_Sub2) this).anInt6746 = i_9_;
		((Class30_Sub2) this).anInt6747 = i_10_;
		if (bool_13_) {
			int[] is_14_ = new int[is.length];
			for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
				int i_16_ = i_15_ * i_9_;
				int i_17_ = (i_10_ - i_15_ - 1) * i_9_;
				for (int i_18_ = 0; i_18_ < i_9_; i_18_++)
					is_14_[i_16_++] = is[i_17_++];
			}
			is = is_14_;
		}
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		if (((Class30_Sub2) this).anInt372 == 34037 || !bool || i_11_ != 0 || i_12_ != 0) {
			OpenGL.glPixelStorei(3314, i_11_);
			OpenGL.glTexImage2Di(((Class30_Sub2) this).anInt372, 0, Class_ra_Sub2.method5274(((Class30_Sub2) this).aClass55_377, ((Class30_Sub2) this).aClass77_378), ((Class30_Sub2) this).anInt6746, ((Class30_Sub2) this).anInt6747, 0, 32993, (((Class_ra_Sub2) ((Class30_Sub2) this).aClass_ra_Sub2_381).anInt8186), is, i_12_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			method414(false);
		} else {
			method411(((Class30_Sub2) this).anInt372, Class_ra_Sub2.method5274((((Class30_Sub2) this).aClass55_377), (((Class30_Sub2) this).aClass77_378)), ((Class30_Sub2) this).anInt6746, ((Class30_Sub2) this).anInt6747, 32993, ((Class_ra_Sub2) ((Class30_Sub2) this).aClass_ra_Sub2_381).anInt8186, is);
			method414(true);
		}
		method410(true);
	}

	void method419(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		Class52 class52 = ((Class30_Sub2) this).aClass_ra_Sub2_381.method4992((short) -5396);
		if (class52 != null) {
			int i_24_ = class52.method552() - (i_23_ + i_21_);
			((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
			OpenGL.glCopyTexSubImage2D(((Class30_Sub2) this).anInt372, 0, i, (((Class30_Sub2) this).anInt6747 - (i_19_ + i_21_)), i_22_, i_24_, i_20_, i_21_);
			OpenGL.glFlush();
		}
	}

	Class30_Sub2(Class_ra_Sub2 class_ra_sub2, int i, Class55 class55, Class77 class77, int i_25_, int i_26_, boolean bool, float[] fs, Class55 class55_27_) {
		super(class_ra_sub2, i, class55, class77, i_25_ * i_26_, bool);
		((Class30_Sub2) this).anInt6746 = i_25_;
		((Class30_Sub2) this).anInt6747 = i_26_;
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		if (bool && ((Class30_Sub2) this).anInt372 != 34037) {
			method415(i, Class_ra_Sub2.method5274((((Class30_Sub2) this).aClass55_377), (((Class30_Sub2) this).aClass77_378)), i_25_, i_26_, class55_27_, fs);
			method414(true);
		} else {
			OpenGL.glTexImage2Df(((Class30_Sub2) this).anInt372, 0, Class_ra_Sub2.method5274(((Class30_Sub2) this).aClass55_377, ((Class30_Sub2) this).aClass77_378), ((Class30_Sub2) this).anInt6746, ((Class30_Sub2) this).anInt6747, 0, Class_ra_Sub2.method5228(class55_27_), 5126, fs, 0);
			method414(false);
		}
		method410(true);
	}

	void method420(boolean bool, boolean bool_28_) {
		if (((Class30_Sub2) this).anInt372 == 3553) {
			((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
			OpenGL.glTexParameteri(((Class30_Sub2) this).anInt372, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(((Class30_Sub2) this).anInt372, 10243, bool_28_ ? 10497 : 33071);
		}
	}

	void method421(int i, int i_29_, int i_30_, int i_31_, byte[] is, Class55 class55, int i_32_, int i_33_, boolean bool) {
		if (i_33_ == 0)
			i_33_ = i_30_;
		if (bool) {
			int i_34_ = class55.anInt556 * 845115459;
			int i_35_ = i_34_ * i_30_;
			int i_36_ = i_34_ * i_33_;
			byte[] is_37_ = new byte[i_35_ * i_31_];
			for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
				int i_39_ = i_38_ * i_35_;
				int i_40_ = (i_31_ - i_38_ - 1) * i_36_ + i_32_;
				for (int i_41_ = 0; i_41_ < i_35_; i_41_++)
					is_37_[i_39_++] = is[i_40_++];
			}
			is = is_37_;
		}
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		OpenGL.glPixelStorei(3317, 1);
		if (i_33_ != i_30_)
			OpenGL.glPixelStorei(3314, i_33_);
		OpenGL.glTexSubImage2Dub(((Class30_Sub2) this).anInt372, 0, i, (((Class30_Sub2) this).anInt6747 - i_29_ - i_31_), i_30_, i_31_, Class_ra_Sub2.method5228(class55), 5121, is, i_32_);
		if (i_33_ != i_30_)
			OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	void method422(int i, int i_42_, int i_43_, int i_44_, int[] is, int i_45_, int i_46_, boolean bool) {
		if (i_46_ == 0)
			i_46_ = i_43_;
		if (bool) {
			int[] is_47_ = new int[i_43_ * i_44_];
			for (int i_48_ = 0; i_48_ < i_44_; i_48_++) {
				int i_49_ = i_48_ * i_43_;
				int i_50_ = (i_44_ - i_48_ - 1) * i_46_ + i_45_;
				for (int i_51_ = 0; i_51_ < i_43_; i_51_++)
					is_47_[i_49_++] = is[i_50_++];
			}
			is = is_47_;
		}
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		if (i_43_ != i_46_)
			OpenGL.glPixelStorei(3314, i_46_);
		OpenGL.glTexSubImage2Di(((Class30_Sub2) this).anInt372, 0, i, (((Class30_Sub2) this).anInt6747 - i_42_ - i_44_), i_43_, i_44_, 32993, (((Class_ra_Sub2) ((Class30_Sub2) this).aClass_ra_Sub2_381).anInt8186), is, i_45_);
		if (i_43_ != i_46_)
			OpenGL.glPixelStorei(3314, 0);
	}

	Class30_Sub2(Class_ra_Sub2 class_ra_sub2, int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		super(class_ra_sub2, i, Class55.aClass55_560, Class77.aClass77_717, i_54_ * i_55_, false);
		((Class30_Sub2) this).anInt6746 = i_54_;
		((Class30_Sub2) this).anInt6747 = i_55_;
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		Class52 class52 = ((Class30_Sub2) this).aClass_ra_Sub2_381.method4992((short) -8855);
		if (class52 != null) {
			int i_56_ = class52.method552() - (i_53_ + i_55_);
			int i_57_ = Class_ra_Sub2.method5274(((Class30_Sub2) this).aClass55_377, ((Class30_Sub2) this).aClass77_378);
			OpenGL.glCopyTexImage2D(((Class30_Sub2) this).anInt372, 0, i_57_, i_52_, i_56_, i_54_, i_55_, 0);
		}
		method410(true);
	}

	Interface8_Impl1_Impl1 method423(int i) {
		return new Class72(this, i);
	}

	Class30_Sub2(Class_ra_Sub2 class_ra_sub2, int i, Class55 class55, Class77 class77, int i_58_, int i_59_) {
		super(class_ra_sub2, i, class55, class77, i_58_ * i_59_, false);
		((Class30_Sub2) this).anInt6746 = i_58_;
		((Class30_Sub2) this).anInt6747 = i_59_;
		((Class30_Sub2) this).aClass_ra_Sub2_381.method5256(this);
		OpenGL.glTexImage2Dub(((Class30_Sub2) this).anInt372, 0, Class_ra_Sub2.method5274(((Class30_Sub2) this).aClass55_377, ((Class30_Sub2) this).aClass77_378), i_58_, i_59_, 0, Class_ra_Sub2.method5228(((Class30_Sub2) this).aClass55_377), 5121, null, 0);
		method410(true);
	}

	Interface8_Impl1_Impl2 method424(int i) {
		return new Class72(this, i);
	}
}
