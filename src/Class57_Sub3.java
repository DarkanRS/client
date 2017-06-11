/* Class57_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class57_Sub3 extends Class57 {
	int anInt9037;
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_9038;
	boolean aBoolean9039;
	int anInt9040 = 0;
	Class_ra_Sub2 aClass_ra_Sub2_9041;
	int anInt9042;
	Class30_Sub2_Sub1 aClass30_Sub2_Sub1_9043;
	int anInt9044;
	int anInt9045;

	void method671(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, Class_ta class_ta, int i_5_, int i_6_) {
		Class30_Sub2_Sub1 class30_sub2_sub1 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).aClass30_Sub2_Sub1_8441);
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_7_ = (float) method271();
			float f_8_ = (float) method626();
			float f_9_ = (f_1_ - f) / f_7_;
			float f_10_ = (f_2_ - f_0_) / f_7_;
			float f_11_ = (f_3_ - f) / f_8_;
			float f_12_ = (f_4_ - f_0_) / f_8_;
			float f_13_ = f_11_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_14_ = f_12_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_15_ = f_9_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_16_ = f_10_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_17_ = -f_9_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_18_ = -f_10_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_19_ = -f_11_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_20_ = -f_12_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_15_ + f_13_;
			f_0_ = f_0_ + f_16_ + f_14_;
			f_1_ = f_1_ + f_17_ + f_13_;
			f_2_ = f_2_ + f_18_ + f_14_;
			f_3_ = f_3_ + f_15_ + f_19_;
			f_4_ = f_4_ + f_16_ + f_20_;
		}
		float f_21_ = f_3_ + (f_1_ - f);
		float f_22_ = f_2_ + (f_4_ - f_0_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(class30_sub2_sub1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(7681, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(1);
		float f_23_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9049 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9048);
		float f_24_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9047);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f - (float) i_5_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_24_ * (f_0_ - (float) i_6_)));
		OpenGL.glVertex2f(f, f_0_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_3_ - (float) i_5_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_24_ * (f_4_ - (float) i_6_)));
		OpenGL.glVertex2f(f_3_, f_4_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_21_ - (float) i_5_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_24_ * (f_22_ - (float) i_6_)));
		OpenGL.glVertex2f(f_21_, f_22_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_23_ * (f_1_ - (float) i_5_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_24_ * (f_2_ - (float) i_6_)));
		OpenGL.glVertex2f(f_1_, f_2_);
		OpenGL.glEnd();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 5890, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
	}

	Class57_Sub3(Class_ra_Sub2 class_ra_sub2, int i, int i_25_, int i_26_, int i_27_) {
		((Class57_Sub3) this).aBoolean9039 = false;
		((Class57_Sub3) this).anInt9042 = 0;
		((Class57_Sub3) this).anInt9037 = 0;
		((Class57_Sub3) this).anInt9044 = 0;
		((Class57_Sub3) this).anInt9045 = 0;
		((Class57_Sub3) this).aClass_ra_Sub2_9041 = class_ra_sub2;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043 = Class30_Sub2_Sub1.method427(class_ra_sub2, i, i_25_, i_26_, i_27_);
	}

	Class57_Sub3(Class_ra_Sub2 class_ra_sub2, int i, int i_28_, int[] is, int i_29_, int i_30_) {
		((Class57_Sub3) this).aBoolean9039 = false;
		((Class57_Sub3) this).anInt9042 = 0;
		((Class57_Sub3) this).anInt9037 = 0;
		((Class57_Sub3) this).anInt9044 = 0;
		((Class57_Sub3) this).anInt9045 = 0;
		((Class57_Sub3) this).aClass_ra_Sub2_9041 = class_ra_sub2;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043 = Class30_Sub2_Sub1.method425(class_ra_sub2, i, i_28_, false, is, i_30_, i_29_);
	}

	public void method621(int i, int i_31_, int i_32_, int i_33_) {
		((Class57_Sub3) this).anInt9037 = i;
		((Class57_Sub3) this).anInt9042 = i_31_;
		((Class57_Sub3) this).anInt9045 = i_32_;
		((Class57_Sub3) this).anInt9044 = i_33_;
		((Class57_Sub3) this).aBoolean9039 = (((Class57_Sub3) this).anInt9037 != 0 || ((Class57_Sub3) this).anInt9042 != 0 || ((Class57_Sub3) this).anInt9045 != 0 || ((Class57_Sub3) this).anInt9044 != 0);
	}

	public void method622(int[] is) {
		is[0] = ((Class57_Sub3) this).anInt9037;
		is[1] = ((Class57_Sub3) this).anInt9042;
		is[2] = ((Class57_Sub3) this).anInt9045;
		is[3] = ((Class57_Sub3) this).anInt9044;
	}

	public int method623() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
	}

	public int method626() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047 + ((Class57_Sub3) this).anInt9042 + ((Class57_Sub3) this).anInt9044);
	}

	public int method625() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
	}

	public int method272() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048 + ((Class57_Sub3) this).anInt9037 + ((Class57_Sub3) this).anInt9045);
	}

	void method676(float f, float f_34_, float f_35_, float f_36_, float f_37_, float f_38_, int i, int i_39_, int i_40_, int i_41_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_42_ = (float) method271();
			float f_43_ = (float) method626();
			float f_44_ = (f_35_ - f) / f_42_;
			float f_45_ = (f_36_ - f_34_) / f_42_;
			float f_46_ = (f_37_ - f) / f_43_;
			float f_47_ = (f_38_ - f_34_) / f_43_;
			float f_48_ = f_46_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_49_ = f_47_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_50_ = f_44_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_51_ = f_45_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_52_ = -f_44_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_53_ = -f_45_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_54_ = -f_46_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_55_ = -f_47_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_50_ + f_48_;
			f_34_ = f_34_ + f_51_ + f_49_;
			f_35_ = f_35_ + f_52_ + f_48_;
			f_36_ = f_36_ + f_53_ + f_49_;
			f_37_ = f_37_ + f_50_ + f_54_;
			f_38_ = f_38_ + f_51_ + f_55_;
		}
		float f_56_ = f_37_ + (f_35_ - f);
		float f_57_ = f_36_ + (f_38_ - f_34_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_41_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_40_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_39_ >> 16), (byte) (i_39_ >> 8), (byte) i_39_, (byte) (i_39_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_34_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_37_, f_38_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_56_, f_57_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_35_, f_36_);
		OpenGL.glEnd();
	}

	public void method675(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		if (((Class_ra_Sub2) ((Class57_Sub3) this).aClass_ra_Sub2_9041).aBoolean8166) {
			int[] is = ((Class57_Sub3) this).aClass_ra_Sub2_9041.aq(i_61_, i_62_, i_59_, i_60_);
			if (is != null) {
				for (int i_63_ = 0; i_63_ < is.length; i_63_++)
					is[i_63_] |= ~0xffffff;
				method691(i, i_58_, i_59_, i_60_, is, 0, i_59_);
			}
		} else
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method419(i, i_58_, i_59_, i_60_, i_61_, i_62_);
	}

	public void method632(int i, int i_64_, int i_65_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 = (Class30_Sub2_Sub1.method427(((Class57_Sub3) this).aClass_ra_Sub2_9041, i, i_64_, ((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048, ((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047));
		((Class57_Sub3) this).anInt9040 = i_65_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	Class57_Sub3(Class_ra_Sub2 class_ra_sub2, int i, int i_66_, boolean bool) {
		((Class57_Sub3) this).aBoolean9039 = false;
		((Class57_Sub3) this).anInt9042 = 0;
		((Class57_Sub3) this).anInt9037 = 0;
		((Class57_Sub3) this).anInt9044 = 0;
		((Class57_Sub3) this).anInt9045 = 0;
		((Class57_Sub3) this).aClass_ra_Sub2_9041 = class_ra_sub2;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043 = Class30_Sub2_Sub1.method426(class_ra_sub2, (bool ? Class55.aClass55_557 : Class55.aClass55_560), Class77.aClass77_717, i, i_66_);
	}

	void method689(int i) {
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(((Class57_Sub3) this).aClass_ra_Sub2_9041.method5288(i), 7681);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(1, 34167, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5286(0, 34168, 770);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9038);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(34479, 7681);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(1, 34166, 768);
		if (((Class57_Sub3) this).anInt9040 == 0)
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5260(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class57_Sub3) this).anInt9040 == 1)
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5260(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class57_Sub3) this).anInt9040 == 2)
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5260(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class57_Sub3) this).anInt9040 == 3)
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5260(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method690() {
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(8448, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(1, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5286(0, 5890, 770);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(1, 34168, 768);
	}

	public void method631(int i, int i_67_, int i_68_, int i_69_, int i_70_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_70_);
		OpenGL.glColor4ub((byte) (i_69_ >> 16), (byte) (i_69_ >> 8), (byte) i_69_, (byte) (i_69_ >> 24));
		i += ((Class57_Sub3) this).anInt9037;
		i_67_ += ((Class57_Sub3) this).anInt9042;
		if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_68_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_67_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_67_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_67_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_67_);
			OpenGL.glEnd();
		} else {
			method689(i_68_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_67_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_67_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_67_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_67_);
			OpenGL.glEnd();
			method690();
		}
	}

	public void method654(int i, int i_71_, Class_ta class_ta, int i_72_, int i_73_) {
		Class_ta_Sub1 class_ta_sub1 = (Class_ta_Sub1) class_ta;
		Class30_Sub2_Sub1 class30_sub2_sub1 = ((Class_ta_Sub1) class_ta_sub1).aClass30_Sub2_Sub1_8441;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(class30_sub2_sub1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(7681, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(1);
		i += ((Class57_Sub3) this).anInt9037;
		i_71_ += ((Class57_Sub3) this).anInt9042;
		int i_74_ = i + ((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048;
		int i_75_ = i_71_ + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
		float f = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9049 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9048);
		float f_76_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9047);
		float f_77_ = (float) (i - i_72_) * f;
		float f_78_ = (float) (i_74_ - i_72_) * f;
		float f_79_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 - (float) (i_71_ - i_73_) * f_76_);
		float f_80_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 - (float) (i_75_ - i_73_) * f_76_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_77_, f_79_);
		OpenGL.glVertex2i(i, i_71_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_77_, f_80_);
		OpenGL.glVertex2i(i, i_71_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_78_, f_80_);
		OpenGL.glVertex2i(i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048), i_71_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_78_, f_79_);
		OpenGL.glVertex2i(i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048), i_71_);
		OpenGL.glEnd();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 5890, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
	}

	void method635(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_87_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_86_);
		OpenGL.glColor4ub((byte) (i_85_ >> 16), (byte) (i_85_ >> 8), (byte) i_85_, (byte) (i_85_ >> 24));
		if (((Class57_Sub3) this).aBoolean9039) {
			float f = (float) i_82_ / (float) method271();
			float f_88_ = (float) i_83_ / (float) method626();
			float f_89_ = (float) i + (float) ((Class57_Sub3) this).anInt9037 * f;
			float f_90_ = ((float) i_81_ + (float) ((Class57_Sub3) this).anInt9042 * f_88_);
			float f_91_ = (f_89_ + (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048) * f);
			float f_92_ = (f_90_ + (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047) * f_88_);
			if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
				((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
				((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_84_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_89_, f_90_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_89_, f_92_);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_91_, f_92_);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_91_, f_90_);
				OpenGL.glEnd();
			} else {
				method689(i_84_);
				((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
				OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_89_, f_90_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_89_, f_92_);
				OpenGL.glMultiTexCoord2f(33985, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), 0.0F);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_91_, f_92_);
				OpenGL.glMultiTexCoord2f(33985, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_91_, f_90_);
				OpenGL.glEnd();
				method690();
			}
		} else if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_84_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_81_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_81_ + i_83_);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_82_, i_81_ + i_83_);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + i_82_, i_81_);
			OpenGL.glEnd();
		} else {
			method689(i_84_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_81_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_81_ + i_83_);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_82_, i_81_ + i_83_);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + i_82_, i_81_);
			OpenGL.glEnd();
			method690();
		}
	}

	public void method662(int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		int i_99_ = i + i_94_;
		int i_100_ = i_93_ + i_95_;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_98_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_96_);
		OpenGL.glColor4ub((byte) (i_97_ >> 16), (byte) (i_97_ >> 8), (byte) i_97_, (byte) (i_97_ >> 24));
		if (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aBoolean9050 && !((Class57_Sub3) this).aBoolean9039) {
			float f = (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051 * (float) i_95_ / (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047));
			float f_101_ = (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049 * (float) i_94_ / (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_93_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_100_);
			OpenGL.glTexCoord2f(f_101_, 0.0F);
			OpenGL.glVertex2i(i_99_, i_100_);
			OpenGL.glTexCoord2f(f_101_, f);
			OpenGL.glVertex2i(i_99_, i_93_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class57_Sub3) this).anInt9037, (float) ((Class57_Sub3) this).anInt9042, 0.0F);
			int i_102_ = method271();
			int i_103_ = method626();
			int i_104_ = i_93_ + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
			OpenGL.glBegin(7);
			int i_105_ = i_93_;
			for (/**/; i_104_ <= i_100_; i_104_ += i_103_) {
				int i_106_ = i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
				int i_107_ = i;
				while (i_106_ <= i_99_) {
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_107_, i_105_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_107_, i_104_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), 0.0F);
					OpenGL.glVertex2i(i_106_, i_104_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_106_, i_105_);
					i_106_ += i_102_;
					i_107_ += i_102_;
				}
				if (i_107_ < i_99_) {
					float f = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049) * (float) (i_99_ - i_107_) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048);
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_107_, i_105_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_107_, i_104_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_99_, i_104_);
					OpenGL.glTexCoord2f(f, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_99_, i_105_);
				}
				i_105_ += i_103_;
			}
			if (i_105_ < i_100_) {
				float f = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051) * (float) (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047 - (i_100_ - i_105_)) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
				int i_108_ = i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
				int i_109_ = i;
				while (i_108_ <= i_99_) {
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_109_, i_105_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_109_, i_100_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), f);
					OpenGL.glVertex2i(i_108_, i_100_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_108_, i_105_);
					i_108_ += i_102_;
					i_109_ += i_102_;
				}
				if (i_109_ < i_99_) {
					float f_110_ = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049) * (float) (i_99_ - i_109_) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048);
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_109_, i_105_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_109_, i_100_);
					OpenGL.glTexCoord2f(f_110_, f);
					OpenGL.glVertex2i(i_99_, i_100_);
					OpenGL.glTexCoord2f(f_110_, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_99_, i_105_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method642(float f, float f_111_, float f_112_, float f_113_, float f_114_, float f_115_, int i, int i_116_, int i_117_, int i_118_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_119_ = (float) method271();
			float f_120_ = (float) method626();
			float f_121_ = (f_112_ - f) / f_119_;
			float f_122_ = (f_113_ - f_111_) / f_119_;
			float f_123_ = (f_114_ - f) / f_120_;
			float f_124_ = (f_115_ - f_111_) / f_120_;
			float f_125_ = f_123_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_126_ = f_124_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_127_ = f_121_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_128_ = f_122_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_129_ = -f_121_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_130_ = -f_122_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_131_ = -f_123_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_132_ = -f_124_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_127_ + f_125_;
			f_111_ = f_111_ + f_128_ + f_126_;
			f_112_ = f_112_ + f_129_ + f_125_;
			f_113_ = f_113_ + f_130_ + f_126_;
			f_114_ = f_114_ + f_127_ + f_131_;
			f_115_ = f_115_ + f_128_ + f_132_;
		}
		float f_133_ = f_114_ + (f_112_ - f);
		float f_134_ = f_113_ + (f_115_ - f_111_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_118_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_117_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_116_ >> 16), (byte) (i_116_ >> 8), (byte) i_116_, (byte) (i_116_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_111_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_114_, f_115_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_133_, f_134_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_112_, f_113_);
		OpenGL.glEnd();
	}

	void method644(float f, float f_135_, float f_136_, float f_137_, float f_138_, float f_139_, int i, Class_ta class_ta, int i_140_, int i_141_) {
		Class30_Sub2_Sub1 class30_sub2_sub1 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).aClass30_Sub2_Sub1_8441);
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_142_ = (float) method271();
			float f_143_ = (float) method626();
			float f_144_ = (f_136_ - f) / f_142_;
			float f_145_ = (f_137_ - f_135_) / f_142_;
			float f_146_ = (f_138_ - f) / f_143_;
			float f_147_ = (f_139_ - f_135_) / f_143_;
			float f_148_ = f_146_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_149_ = f_147_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_150_ = f_144_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_151_ = f_145_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_152_ = -f_144_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_153_ = -f_145_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_154_ = -f_146_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_155_ = -f_147_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_150_ + f_148_;
			f_135_ = f_135_ + f_151_ + f_149_;
			f_136_ = f_136_ + f_152_ + f_148_;
			f_137_ = f_137_ + f_153_ + f_149_;
			f_138_ = f_138_ + f_150_ + f_154_;
			f_139_ = f_139_ + f_151_ + f_155_;
		}
		float f_156_ = f_138_ + (f_136_ - f);
		float f_157_ = f_137_ + (f_139_ - f_135_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(class30_sub2_sub1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(7681, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(1);
		float f_158_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9049 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9048);
		float f_159_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9047);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f - (float) i_140_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_159_ * (f_135_ - (float) i_141_)));
		OpenGL.glVertex2f(f, f_135_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_138_ - (float) i_140_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_159_ * (f_139_ - (float) i_141_)));
		OpenGL.glVertex2f(f_138_, f_139_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_156_ - (float) i_140_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_159_ * (f_157_ - (float) i_141_)));
		OpenGL.glVertex2f(f_156_, f_157_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_158_ * (f_136_ - (float) i_140_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_159_ * (f_137_ - (float) i_141_)));
		OpenGL.glVertex2f(f_136_, f_137_);
		OpenGL.glEnd();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 5890, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
	}

	public void method650(int i, int i_160_, Class_ta class_ta, int i_161_, int i_162_) {
		Class_ta_Sub1 class_ta_sub1 = (Class_ta_Sub1) class_ta;
		Class30_Sub2_Sub1 class30_sub2_sub1 = ((Class_ta_Sub1) class_ta_sub1).aClass30_Sub2_Sub1_8441;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(class30_sub2_sub1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(7681, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(1);
		i += ((Class57_Sub3) this).anInt9037;
		i_160_ += ((Class57_Sub3) this).anInt9042;
		int i_163_ = i + ((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048;
		int i_164_ = i_160_ + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
		float f = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9049 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9048);
		float f_165_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9047);
		float f_166_ = (float) (i - i_161_) * f;
		float f_167_ = (float) (i_163_ - i_161_) * f;
		float f_168_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 - (float) (i_160_ - i_162_) * f_165_);
		float f_169_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 - (float) (i_164_ - i_162_) * f_165_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_166_, f_168_);
		OpenGL.glVertex2i(i, i_160_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_166_, f_169_);
		OpenGL.glVertex2i(i, i_160_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_167_, f_169_);
		OpenGL.glVertex2i(i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048), i_160_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_167_, f_168_);
		OpenGL.glVertex2i(i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048), i_160_);
		OpenGL.glEnd();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 5890, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
	}

	public Interface8_Impl1_Impl1 method646() {
		return ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method423(0);
	}

	public void method640(int[] is) {
		is[0] = ((Class57_Sub3) this).anInt9037;
		is[1] = ((Class57_Sub3) this).anInt9042;
		is[2] = ((Class57_Sub3) this).anInt9045;
		is[3] = ((Class57_Sub3) this).anInt9044;
	}

	public void method643(int i, int i_170_, int i_171_, int i_172_, int i_173_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_173_);
		OpenGL.glColor4ub((byte) (i_172_ >> 16), (byte) (i_172_ >> 8), (byte) i_172_, (byte) (i_172_ >> 24));
		i += ((Class57_Sub3) this).anInt9037;
		i_170_ += ((Class57_Sub3) this).anInt9042;
		if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_171_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_170_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_170_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_170_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_170_);
			OpenGL.glEnd();
		} else {
			method689(i_171_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_170_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_170_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_170_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_170_);
			OpenGL.glEnd();
			method690();
		}
	}

	public void method665(int i, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_) {
		if (((Class_ra_Sub2) ((Class57_Sub3) this).aClass_ra_Sub2_9041).aBoolean8166) {
			int[] is = ((Class57_Sub3) this).aClass_ra_Sub2_9041.aq(i_177_, i_178_, i_175_, i_176_);
			if (is != null) {
				for (int i_179_ = 0; i_179_ < is.length; i_179_++)
					is[i_179_] |= ~0xffffff;
				method691(i, i_174_, i_175_, i_176_, is, 0, i_175_);
			}
		} else
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method419(i, i_174_, i_175_, i_176_, i_177_, i_178_);
	}

	void method670(float f, float f_180_, float f_181_, float f_182_, float f_183_, float f_184_, int i, Class_ta class_ta, int i_185_, int i_186_) {
		Class30_Sub2_Sub1 class30_sub2_sub1 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).aClass30_Sub2_Sub1_8441);
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_187_ = (float) method271();
			float f_188_ = (float) method626();
			float f_189_ = (f_181_ - f) / f_187_;
			float f_190_ = (f_182_ - f_180_) / f_187_;
			float f_191_ = (f_183_ - f) / f_188_;
			float f_192_ = (f_184_ - f_180_) / f_188_;
			float f_193_ = f_191_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_194_ = f_192_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_195_ = f_189_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_196_ = f_190_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_197_ = -f_189_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_198_ = -f_190_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_199_ = -f_191_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_200_ = -f_192_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_195_ + f_193_;
			f_180_ = f_180_ + f_196_ + f_194_;
			f_181_ = f_181_ + f_197_ + f_193_;
			f_182_ = f_182_ + f_198_ + f_194_;
			f_183_ = f_183_ + f_195_ + f_199_;
			f_184_ = f_184_ + f_196_ + f_200_;
		}
		float f_201_ = f_183_ + (f_181_ - f);
		float f_202_ = f_182_ + (f_184_ - f_180_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(class30_sub2_sub1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(7681, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(1);
		float f_203_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9049 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9048);
		float f_204_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9047);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_203_ * (f - (float) i_185_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_204_ * (f_180_ - (float) i_186_)));
		OpenGL.glVertex2f(f, f_180_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_203_ * (f_183_ - (float) i_185_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_204_ * (f_184_ - (float) i_186_)));
		OpenGL.glVertex2f(f_183_, f_184_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_203_ * (f_201_ - (float) i_185_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_204_ * (f_202_ - (float) i_186_)));
		OpenGL.glVertex2f(f_201_, f_202_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_203_ * (f_181_ - (float) i_185_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_204_ * (f_182_ - (float) i_186_)));
		OpenGL.glVertex2f(f_181_, f_182_);
		OpenGL.glEnd();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 5890, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
	}

	public void method648(int i, int i_205_, int i_206_, int i_207_, int i_208_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_208_);
		OpenGL.glColor4ub((byte) (i_207_ >> 16), (byte) (i_207_ >> 8), (byte) i_207_, (byte) (i_207_ >> 24));
		i += ((Class57_Sub3) this).anInt9037;
		i_205_ += ((Class57_Sub3) this).anInt9042;
		if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_206_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_205_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_205_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_205_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_205_);
			OpenGL.glEnd();
		} else {
			method689(i_206_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_205_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_205_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_205_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_205_);
			OpenGL.glEnd();
			method690();
		}
	}

	public int method669() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
	}

	void method651(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_, int i_215_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_215_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_214_);
		OpenGL.glColor4ub((byte) (i_213_ >> 16), (byte) (i_213_ >> 8), (byte) i_213_, (byte) (i_213_ >> 24));
		if (((Class57_Sub3) this).aBoolean9039) {
			float f = (float) i_210_ / (float) method271();
			float f_216_ = (float) i_211_ / (float) method626();
			float f_217_ = (float) i + (float) ((Class57_Sub3) this).anInt9037 * f;
			float f_218_ = ((float) i_209_ + (float) ((Class57_Sub3) this).anInt9042 * f_216_);
			float f_219_ = (f_217_ + (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048) * f);
			float f_220_ = (f_218_ + (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047) * f_216_);
			if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
				((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
				((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_212_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_217_, f_218_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_217_, f_220_);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_219_, f_220_);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_219_, f_218_);
				OpenGL.glEnd();
			} else {
				method689(i_212_);
				((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
				OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_217_, f_218_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_217_, f_220_);
				OpenGL.glMultiTexCoord2f(33985, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), 0.0F);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_219_, f_220_);
				OpenGL.glMultiTexCoord2f(33985, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_219_, f_218_);
				OpenGL.glEnd();
				method690();
			}
		} else if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_212_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_209_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_209_ + i_211_);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_210_, i_209_ + i_211_);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + i_210_, i_209_);
			OpenGL.glEnd();
		} else {
			method689(i_212_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_209_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_209_ + i_211_);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_210_, i_209_ + i_211_);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + i_210_, i_209_);
			OpenGL.glEnd();
			method690();
		}
	}

	void method652(int i, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_227_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_226_);
		OpenGL.glColor4ub((byte) (i_225_ >> 16), (byte) (i_225_ >> 8), (byte) i_225_, (byte) (i_225_ >> 24));
		if (((Class57_Sub3) this).aBoolean9039) {
			float f = (float) i_222_ / (float) method271();
			float f_228_ = (float) i_223_ / (float) method626();
			float f_229_ = (float) i + (float) ((Class57_Sub3) this).anInt9037 * f;
			float f_230_ = ((float) i_221_ + (float) ((Class57_Sub3) this).anInt9042 * f_228_);
			float f_231_ = (f_229_ + (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048) * f);
			float f_232_ = (f_230_ + (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047) * f_228_);
			if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
				((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
				((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_224_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_229_, f_230_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_229_, f_232_);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_231_, f_232_);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_231_, f_230_);
				OpenGL.glEnd();
			} else {
				method689(i_224_);
				((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
				OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_229_, f_230_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_229_, f_232_);
				OpenGL.glMultiTexCoord2f(33985, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), 0.0F);
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
				OpenGL.glVertex2f(f_231_, f_232_);
				OpenGL.glMultiTexCoord2f(33985, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
				OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
				OpenGL.glVertex2f(f_231_, f_230_);
				OpenGL.glEnd();
				method690();
			}
		} else if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_224_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_221_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_221_ + i_223_);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_222_, i_221_ + i_223_);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + i_222_, i_221_);
			OpenGL.glEnd();
		} else {
			method689(i_224_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_221_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_221_ + i_223_);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + i_222_, i_221_ + i_223_);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + i_222_, i_221_);
			OpenGL.glEnd();
			method690();
		}
	}

	public void method624(int i, int i_233_, int i_234_, int i_235_, int i_236_, int i_237_) {
		if (((Class_ra_Sub2) ((Class57_Sub3) this).aClass_ra_Sub2_9041).aBoolean8166) {
			int[] is = ((Class57_Sub3) this).aClass_ra_Sub2_9041.aq(i_236_, i_237_, i_234_, i_235_);
			if (is != null) {
				for (int i_238_ = 0; i_238_ < is.length; i_238_++)
					is[i_238_] |= ~0xffffff;
				method691(i, i_233_, i_234_, i_235_, is, 0, i_234_);
			}
		} else
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method419(i, i_233_, i_234_, i_235_, i_236_, i_237_);
	}

	public Interface8_Impl1_Impl1 method647() {
		return ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method423(0);
	}

	public void method655(int i, int i_239_, int i_240_, int i_241_) {
		((Class57_Sub3) this).anInt9037 = i;
		((Class57_Sub3) this).anInt9042 = i_239_;
		((Class57_Sub3) this).anInt9045 = i_240_;
		((Class57_Sub3) this).anInt9044 = i_241_;
		((Class57_Sub3) this).aBoolean9039 = (((Class57_Sub3) this).anInt9037 != 0 || ((Class57_Sub3) this).anInt9042 != 0 || ((Class57_Sub3) this).anInt9045 != 0 || ((Class57_Sub3) this).anInt9044 != 0);
	}

	public void method656(int[] is) {
		is[0] = ((Class57_Sub3) this).anInt9037;
		is[1] = ((Class57_Sub3) this).anInt9042;
		is[2] = ((Class57_Sub3) this).anInt9045;
		is[3] = ((Class57_Sub3) this).anInt9044;
	}

	public void method628(int i, int i_242_, int i_243_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 = (Class30_Sub2_Sub1.method427(((Class57_Sub3) this).aClass_ra_Sub2_9041, i, i_242_, ((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048, ((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047));
		((Class57_Sub3) this).anInt9040 = i_243_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method691(int i, int i_244_, int i_245_, int i_246_, int[] is, int i_247_, int i_248_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method422(i, i_244_, i_245_, i_246_, is, i_247_, i_248_, true);
	}

	public int method630() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
	}

	public int method658() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
	}

	public int method653() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047 + ((Class57_Sub3) this).anInt9042 + ((Class57_Sub3) this).anInt9044);
	}

	public void method677(int[] is) {
		is[0] = ((Class57_Sub3) this).anInt9037;
		is[1] = ((Class57_Sub3) this).anInt9042;
		is[2] = ((Class57_Sub3) this).anInt9045;
		is[3] = ((Class57_Sub3) this).anInt9044;
	}

	public int method667() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
	}

	public void method661(int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_) {
		int i_255_ = i + i_250_;
		int i_256_ = i_249_ + i_251_;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_254_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_252_);
		OpenGL.glColor4ub((byte) (i_253_ >> 16), (byte) (i_253_ >> 8), (byte) i_253_, (byte) (i_253_ >> 24));
		if (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aBoolean9050 && !((Class57_Sub3) this).aBoolean9039) {
			float f = (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051 * (float) i_251_ / (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047));
			float f_257_ = (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049 * (float) i_250_ / (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_249_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_256_);
			OpenGL.glTexCoord2f(f_257_, 0.0F);
			OpenGL.glVertex2i(i_255_, i_256_);
			OpenGL.glTexCoord2f(f_257_, f);
			OpenGL.glVertex2i(i_255_, i_249_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class57_Sub3) this).anInt9037, (float) ((Class57_Sub3) this).anInt9042, 0.0F);
			int i_258_ = method271();
			int i_259_ = method626();
			int i_260_ = i_249_ + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
			OpenGL.glBegin(7);
			int i_261_ = i_249_;
			for (/**/; i_260_ <= i_256_; i_260_ += i_259_) {
				int i_262_ = i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
				int i_263_ = i;
				while (i_262_ <= i_255_) {
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_263_, i_261_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_263_, i_260_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), 0.0F);
					OpenGL.glVertex2i(i_262_, i_260_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_262_, i_261_);
					i_262_ += i_258_;
					i_263_ += i_258_;
				}
				if (i_263_ < i_255_) {
					float f = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049) * (float) (i_255_ - i_263_) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048);
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_263_, i_261_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_263_, i_260_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_255_, i_260_);
					OpenGL.glTexCoord2f(f, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_255_, i_261_);
				}
				i_261_ += i_259_;
			}
			if (i_261_ < i_256_) {
				float f = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051) * (float) (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047 - (i_256_ - i_261_)) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
				int i_264_ = i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
				int i_265_ = i;
				while (i_264_ <= i_255_) {
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_265_, i_261_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_265_, i_256_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), f);
					OpenGL.glVertex2i(i_264_, i_256_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_264_, i_261_);
					i_264_ += i_258_;
					i_265_ += i_258_;
				}
				if (i_265_ < i_255_) {
					float f_266_ = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049) * (float) (i_255_ - i_265_) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048);
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_265_, i_261_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_265_, i_256_);
					OpenGL.glTexCoord2f(f_266_, f);
					OpenGL.glVertex2i(i_255_, i_256_);
					OpenGL.glTexCoord2f(f_266_, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_255_, i_261_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method629(float f, float f_267_, float f_268_, float f_269_, float f_270_, float f_271_, int i, int i_272_, int i_273_, int i_274_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_275_ = (float) method271();
			float f_276_ = (float) method626();
			float f_277_ = (f_268_ - f) / f_275_;
			float f_278_ = (f_269_ - f_267_) / f_275_;
			float f_279_ = (f_270_ - f) / f_276_;
			float f_280_ = (f_271_ - f_267_) / f_276_;
			float f_281_ = f_279_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_282_ = f_280_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_283_ = f_277_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_284_ = f_278_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_285_ = -f_277_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_286_ = -f_278_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_287_ = -f_279_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_288_ = -f_280_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_283_ + f_281_;
			f_267_ = f_267_ + f_284_ + f_282_;
			f_268_ = f_268_ + f_285_ + f_281_;
			f_269_ = f_269_ + f_286_ + f_282_;
			f_270_ = f_270_ + f_283_ + f_287_;
			f_271_ = f_271_ + f_284_ + f_288_;
		}
		float f_289_ = f_270_ + (f_268_ - f);
		float f_290_ = f_269_ + (f_271_ - f_267_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_274_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_273_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_272_ >> 16), (byte) (i_272_ >> 8), (byte) i_272_, (byte) (i_272_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_267_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_270_, f_271_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_289_, f_290_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_268_, f_269_);
		OpenGL.glEnd();
	}

	public int method271() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048 + ((Class57_Sub3) this).anInt9037 + ((Class57_Sub3) this).anInt9045);
	}

	void method657(float f, float f_291_, float f_292_, float f_293_, float f_294_, float f_295_, int i, int i_296_, int i_297_, int i_298_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_299_ = (float) method271();
			float f_300_ = (float) method626();
			float f_301_ = (f_292_ - f) / f_299_;
			float f_302_ = (f_293_ - f_291_) / f_299_;
			float f_303_ = (f_294_ - f) / f_300_;
			float f_304_ = (f_295_ - f_291_) / f_300_;
			float f_305_ = f_303_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_306_ = f_304_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_307_ = f_301_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_308_ = f_302_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_309_ = -f_301_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_310_ = -f_302_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_311_ = -f_303_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_312_ = -f_304_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_307_ + f_305_;
			f_291_ = f_291_ + f_308_ + f_306_;
			f_292_ = f_292_ + f_309_ + f_305_;
			f_293_ = f_293_ + f_310_ + f_306_;
			f_294_ = f_294_ + f_307_ + f_311_;
			f_295_ = f_295_ + f_308_ + f_312_;
		}
		float f_313_ = f_294_ + (f_292_ - f);
		float f_314_ = f_293_ + (f_295_ - f_291_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_298_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_297_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_296_ >> 16), (byte) (i_296_ >> 8), (byte) i_296_, (byte) (i_296_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_291_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_294_, f_295_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_313_, f_314_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_292_, f_293_);
		OpenGL.glEnd();
	}

	void method664(float f, float f_315_, float f_316_, float f_317_, float f_318_, float f_319_, int i, int i_320_, int i_321_, int i_322_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_323_ = (float) method271();
			float f_324_ = (float) method626();
			float f_325_ = (f_316_ - f) / f_323_;
			float f_326_ = (f_317_ - f_315_) / f_323_;
			float f_327_ = (f_318_ - f) / f_324_;
			float f_328_ = (f_319_ - f_315_) / f_324_;
			float f_329_ = f_327_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_330_ = f_328_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_331_ = f_325_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_332_ = f_326_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_333_ = -f_325_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_334_ = -f_326_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_335_ = -f_327_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_336_ = -f_328_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_331_ + f_329_;
			f_315_ = f_315_ + f_332_ + f_330_;
			f_316_ = f_316_ + f_333_ + f_329_;
			f_317_ = f_317_ + f_334_ + f_330_;
			f_318_ = f_318_ + f_331_ + f_335_;
			f_319_ = f_319_ + f_332_ + f_336_;
		}
		float f_337_ = f_318_ + (f_316_ - f);
		float f_338_ = f_317_ + (f_319_ - f_315_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_322_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_321_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_320_ >> 16), (byte) (i_320_ >> 8), (byte) i_320_, (byte) (i_320_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_315_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_318_, f_319_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_337_, f_338_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_316_, f_317_);
		OpenGL.glEnd();
	}

	public void method649(int i, int i_339_, int i_340_, int i_341_, int i_342_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_342_);
		OpenGL.glColor4ub((byte) (i_341_ >> 16), (byte) (i_341_ >> 8), (byte) i_341_, (byte) (i_341_ >> 24));
		i += ((Class57_Sub3) this).anInt9037;
		i_339_ += ((Class57_Sub3) this).anInt9042;
		if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_340_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_339_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_339_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_339_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_339_);
			OpenGL.glEnd();
		} else {
			method689(i_340_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_339_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_339_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_339_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_339_);
			OpenGL.glEnd();
			method690();
		}
	}

	public Interface8_Impl1_Impl1 method627() {
		return ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method423(0);
	}

	public int method668() {
		return (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
	}

	public void method660(int i, int i_343_, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_) {
		int i_349_ = i + i_344_;
		int i_350_ = i_343_ + i_345_;
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_348_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_346_);
		OpenGL.glColor4ub((byte) (i_347_ >> 16), (byte) (i_347_ >> 8), (byte) i_347_, (byte) (i_347_ >> 24));
		if (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aBoolean9050 && !((Class57_Sub3) this).aBoolean9039) {
			float f = (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051 * (float) i_345_ / (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047));
			float f_351_ = (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049 * (float) i_344_ / (float) (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_343_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_350_);
			OpenGL.glTexCoord2f(f_351_, 0.0F);
			OpenGL.glVertex2i(i_349_, i_350_);
			OpenGL.glTexCoord2f(f_351_, f);
			OpenGL.glVertex2i(i_349_, i_343_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class57_Sub3) this).anInt9037, (float) ((Class57_Sub3) this).anInt9042, 0.0F);
			int i_352_ = method271();
			int i_353_ = method626();
			int i_354_ = i_343_ + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9047);
			OpenGL.glBegin(7);
			int i_355_ = i_343_;
			for (/**/; i_354_ <= i_350_; i_354_ += i_353_) {
				int i_356_ = i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
				int i_357_ = i;
				while (i_356_ <= i_349_) {
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_357_, i_355_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_357_, i_354_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), 0.0F);
					OpenGL.glVertex2i(i_356_, i_354_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_356_, i_355_);
					i_356_ += i_352_;
					i_357_ += i_352_;
				}
				if (i_357_ < i_349_) {
					float f = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049) * (float) (i_349_ - i_357_) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048);
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_357_, i_355_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_357_, i_354_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_349_, i_354_);
					OpenGL.glTexCoord2f(f, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_349_, i_355_);
				}
				i_355_ += i_353_;
			}
			if (i_355_ < i_350_) {
				float f = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051) * (float) (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047 - (i_350_ - i_355_)) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
				int i_358_ = i + (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).anInt9048);
				int i_359_ = i;
				while (i_358_ <= i_349_) {
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_359_, i_355_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_359_, i_350_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), f);
					OpenGL.glVertex2i(i_358_, i_350_);
					OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049), (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_358_, i_355_);
					i_358_ += i_352_;
					i_359_ += i_352_;
				}
				if (i_359_ < i_349_) {
					float f_360_ = ((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049) * (float) (i_349_ - i_359_) / (float) ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048);
					OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_359_, i_355_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_359_, i_350_);
					OpenGL.glTexCoord2f(f_360_, f);
					OpenGL.glVertex2i(i_349_, i_350_);
					OpenGL.glTexCoord2f(f_360_, (((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051));
					OpenGL.glVertex2i(i_349_, i_355_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method666(float f, float f_361_, float f_362_, float f_363_, float f_364_, float f_365_, int i, int i_366_, int i_367_, int i_368_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_369_ = (float) method271();
			float f_370_ = (float) method626();
			float f_371_ = (f_362_ - f) / f_369_;
			float f_372_ = (f_363_ - f_361_) / f_369_;
			float f_373_ = (f_364_ - f) / f_370_;
			float f_374_ = (f_365_ - f_361_) / f_370_;
			float f_375_ = f_373_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_376_ = f_374_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_377_ = f_371_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_378_ = f_372_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_379_ = -f_371_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_380_ = -f_372_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_381_ = -f_373_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_382_ = -f_374_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_377_ + f_375_;
			f_361_ = f_361_ + f_378_ + f_376_;
			f_362_ = f_362_ + f_379_ + f_375_;
			f_363_ = f_363_ + f_380_ + f_376_;
			f_364_ = f_364_ + f_377_ + f_381_;
			f_365_ = f_365_ + f_378_ + f_382_;
		}
		float f_383_ = f_364_ + (f_362_ - f);
		float f_384_ = f_363_ + (f_365_ - f_361_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_368_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_367_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_366_ >> 16), (byte) (i_366_ >> 8), (byte) i_366_, (byte) (i_366_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_361_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_364_, f_365_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_383_, f_384_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_362_, f_363_);
		OpenGL.glEnd();
	}

	void method663(float f, float f_385_, float f_386_, float f_387_, float f_388_, float f_389_, int i, int i_390_, int i_391_, int i_392_) {
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_393_ = (float) method271();
			float f_394_ = (float) method626();
			float f_395_ = (f_386_ - f) / f_393_;
			float f_396_ = (f_387_ - f_385_) / f_393_;
			float f_397_ = (f_388_ - f) / f_394_;
			float f_398_ = (f_389_ - f_385_) / f_394_;
			float f_399_ = f_397_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_400_ = f_398_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_401_ = f_395_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_402_ = f_396_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_403_ = -f_395_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_404_ = -f_396_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_405_ = -f_397_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_406_ = -f_398_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_401_ + f_399_;
			f_385_ = f_385_ + f_402_ + f_400_;
			f_386_ = f_386_ + f_403_ + f_399_;
			f_387_ = f_387_ + f_404_ + f_400_;
			f_388_ = f_388_ + f_401_ + f_405_;
			f_389_ = f_389_ + f_402_ + f_406_;
		}
		float f_407_ = f_388_ + (f_386_ - f);
		float f_408_ = f_387_ + (f_389_ - f_385_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i_392_ & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_391_);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i);
		OpenGL.glColor4ub((byte) (i_390_ >> 16), (byte) (i_390_ >> 8), (byte) i_390_, (byte) (i_390_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f, f_385_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_388_, f_389_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), 0.0F);
		OpenGL.glVertex2f(f_407_, f_408_);
		OpenGL.glTexCoord2f((((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9049), (((Class30_Sub2_Sub1) ((Class57_Sub3) this).aClass30_Sub2_Sub1_9043).aFloat9051));
		OpenGL.glVertex2f(f_386_, f_387_);
		OpenGL.glEnd();
	}

	public void method674(int i, int i_409_, int i_410_, int i_411_, int i_412_) {
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410(false);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(i_412_);
		OpenGL.glColor4ub((byte) (i_411_ >> 16), (byte) (i_411_ >> 8), (byte) i_411_, (byte) (i_411_ >> 24));
		i += ((Class57_Sub3) this).anInt9037;
		i_409_ += ((Class57_Sub3) this).anInt9042;
		if (((Class57_Sub3) this).aClass30_Sub2_Sub1_9038 == null) {
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
			((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(i_410_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_409_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_409_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_409_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_409_);
			OpenGL.glEnd();
		} else {
			method689(i_410_);
			((Class57_Sub3) this).aClass30_Sub2_Sub1_9038.method410(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i, i_409_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_409_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_409_ + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9047);
			OpenGL.glMultiTexCoord2f(33985, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glTexCoord2f(((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
			OpenGL.glVertex2i(i + ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).anInt9048, i_409_);
			OpenGL.glEnd();
			method690();
		}
	}

	void method672(float f, float f_413_, float f_414_, float f_415_, float f_416_, float f_417_, int i, Class_ta class_ta, int i_418_, int i_419_) {
		Class30_Sub2_Sub1 class30_sub2_sub1 = (((Class_ta_Sub1) (Class_ta_Sub1) class_ta).aClass30_Sub2_Sub1_8441);
		if (((Class57_Sub3) this).aBoolean9039) {
			float f_420_ = (float) method271();
			float f_421_ = (float) method626();
			float f_422_ = (f_414_ - f) / f_420_;
			float f_423_ = (f_415_ - f_413_) / f_420_;
			float f_424_ = (f_416_ - f) / f_421_;
			float f_425_ = (f_417_ - f_413_) / f_421_;
			float f_426_ = f_424_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_427_ = f_425_ * (float) ((Class57_Sub3) this).anInt9042;
			float f_428_ = f_422_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_429_ = f_423_ * (float) ((Class57_Sub3) this).anInt9037;
			float f_430_ = -f_422_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_431_ = -f_423_ * (float) ((Class57_Sub3) this).anInt9045;
			float f_432_ = -f_424_ * (float) ((Class57_Sub3) this).anInt9044;
			float f_433_ = -f_425_ * (float) ((Class57_Sub3) this).anInt9044;
			f = f + f_428_ + f_426_;
			f_413_ = f_413_ + f_429_ + f_427_;
			f_414_ = f_414_ + f_430_ + f_426_;
			f_415_ = f_415_ + f_431_ + f_427_;
			f_416_ = f_416_ + f_428_ + f_432_;
			f_417_ = f_417_ + f_429_ + f_433_;
		}
		float f_434_ = f_416_ + (f_414_ - f);
		float f_435_ = f_415_ + (f_417_ - f_413_);
		((Class57_Sub3) this).aClass30_Sub2_Sub1_9043.method410((i & 0x1) != 0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5251();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(((Class57_Sub3) this).aClass30_Sub2_Sub1_9043);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(class30_sub2_sub1);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5258(7681, 8448);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 34168, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5266(1);
		float f_436_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9049 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9048);
		float f_437_ = (((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051 / (float) ((Class30_Sub2_Sub1) class30_sub2_sub1).anInt9047);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_436_ * (f - (float) i_418_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_437_ * (f_413_ - (float) i_419_)));
		OpenGL.glVertex2f(f, f_413_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_436_ * (f_416_ - (float) i_418_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_437_ * (f_417_ - (float) i_419_)));
		OpenGL.glVertex2f(f_416_, f_417_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_436_ * (f_434_ - (float) i_418_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_437_ * (f_435_ - (float) i_419_)));
		OpenGL.glVertex2f(f_434_, f_435_);
		OpenGL.glMultiTexCoord2f(33984, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9049, ((Class30_Sub2_Sub1) (((Class57_Sub3) this).aClass30_Sub2_Sub1_9043)).aFloat9051);
		OpenGL.glMultiTexCoord2f(33985, f_436_ * (f_414_ - (float) i_418_), ((((Class30_Sub2_Sub1) class30_sub2_sub1).aFloat9051) - f_437_ * (f_415_ - (float) i_419_)));
		OpenGL.glVertex2f(f_414_, f_415_);
		OpenGL.glEnd();
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5259(0, 5890, 768);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5243(0);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5256(null);
		((Class57_Sub3) this).aClass_ra_Sub2_9041.method5255(0);
	}
}
