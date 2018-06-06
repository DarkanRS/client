/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Matrix44Var {
	float aFloat3513;
	float aFloat3514;
	float aFloat3515;
	float aFloat3516;
	float aFloat3517;
	public static Matrix44Var aClass294_3518 = new Matrix44Var();
	float aFloat3519;
	float aFloat3520;
	float aFloat3521;
	float aFloat3522;
	float aFloat3523;
	float aFloat3524;
	float aFloat3525;

	public void method5207() {
		float f = ((Matrix44Var) this).aFloat3515;
		float f_0_ = ((Matrix44Var) this).aFloat3524;
		float f_1_ = ((Matrix44Var) this).aFloat3517;
		((Matrix44Var) this).aFloat3517 = ((Matrix44Var) this).aFloat3514;
		((Matrix44Var) this).aFloat3514 = f_1_;
		float f_2_ = ((Matrix44Var) this).aFloat3520;
		((Matrix44Var) this).aFloat3520 = ((Matrix44Var) this).aFloat3516;
		((Matrix44Var) this).aFloat3516 = f_2_;
		float f_3_ = ((Matrix44Var) this).aFloat3513;
		((Matrix44Var) this).aFloat3513 = ((Matrix44Var) this).aFloat3522;
		((Matrix44Var) this).aFloat3522 = f_3_;
		((Matrix44Var) this).aFloat3515 = -(f * ((Matrix44Var) this).aFloat3519 + f_0_ * ((Matrix44Var) this).aFloat3517 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3520);
		((Matrix44Var) this).aFloat3524 = -(f * ((Matrix44Var) this).aFloat3514 + f_0_ * ((Matrix44Var) this).aFloat3523 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3513);
		((Matrix44Var) this).aFloat3525 = -(f * ((Matrix44Var) this).aFloat3516 + f_0_ * ((Matrix44Var) this).aFloat3522 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3521);
	}

	public void method5208(Matrix44Var class294_4_) {
		float f = ((Matrix44Var) this).aFloat3519;
		float f_5_ = ((Matrix44Var) this).aFloat3514;
		float f_6_ = ((Matrix44Var) this).aFloat3517;
		float f_7_ = ((Matrix44Var) this).aFloat3523;
		float f_8_ = ((Matrix44Var) this).aFloat3520;
		float f_9_ = ((Matrix44Var) this).aFloat3513;
		float f_10_ = ((Matrix44Var) this).aFloat3515;
		float f_11_ = ((Matrix44Var) this).aFloat3524;
		float f_12_ = ((Matrix44Var) this).aFloat3516;
		float f_13_ = ((Matrix44Var) this).aFloat3522;
		float f_14_ = ((Matrix44Var) this).aFloat3521;
		float f_15_ = ((Matrix44Var) this).aFloat3525;
		((Matrix44Var) this).aFloat3519 = (f * ((Matrix44Var) class294_4_).aFloat3519 + f_5_ * ((Matrix44Var) class294_4_).aFloat3517 + f_12_ * ((Matrix44Var) class294_4_).aFloat3520);
		((Matrix44Var) this).aFloat3514 = (f * ((Matrix44Var) class294_4_).aFloat3514 + f_5_ * ((Matrix44Var) class294_4_).aFloat3523 + f_12_ * ((Matrix44Var) class294_4_).aFloat3513);
		((Matrix44Var) this).aFloat3516 = (f * ((Matrix44Var) class294_4_).aFloat3516 + f_5_ * ((Matrix44Var) class294_4_).aFloat3522 + f_12_ * ((Matrix44Var) class294_4_).aFloat3521);
		((Matrix44Var) this).aFloat3517 = (f_6_ * ((Matrix44Var) class294_4_).aFloat3519 + f_7_ * ((Matrix44Var) class294_4_).aFloat3517 + f_13_ * ((Matrix44Var) class294_4_).aFloat3520);
		((Matrix44Var) this).aFloat3523 = (f_6_ * ((Matrix44Var) class294_4_).aFloat3514 + f_7_ * ((Matrix44Var) class294_4_).aFloat3523 + f_13_ * ((Matrix44Var) class294_4_).aFloat3513);
		((Matrix44Var) this).aFloat3522 = (f_6_ * ((Matrix44Var) class294_4_).aFloat3516 + f_7_ * ((Matrix44Var) class294_4_).aFloat3522 + f_13_ * ((Matrix44Var) class294_4_).aFloat3521);
		((Matrix44Var) this).aFloat3520 = (f_8_ * ((Matrix44Var) class294_4_).aFloat3519 + f_9_ * ((Matrix44Var) class294_4_).aFloat3517 + f_14_ * ((Matrix44Var) class294_4_).aFloat3520);
		((Matrix44Var) this).aFloat3513 = (f_8_ * ((Matrix44Var) class294_4_).aFloat3514 + f_9_ * ((Matrix44Var) class294_4_).aFloat3523 + f_14_ * ((Matrix44Var) class294_4_).aFloat3513);
		((Matrix44Var) this).aFloat3521 = (f_8_ * ((Matrix44Var) class294_4_).aFloat3516 + f_9_ * ((Matrix44Var) class294_4_).aFloat3522 + f_14_ * ((Matrix44Var) class294_4_).aFloat3521);
		((Matrix44Var) this).aFloat3515 = (f_10_ * ((Matrix44Var) class294_4_).aFloat3519 + f_11_ * ((Matrix44Var) class294_4_).aFloat3517 + f_15_ * ((Matrix44Var) class294_4_).aFloat3520 + ((Matrix44Var) class294_4_).aFloat3515);
		((Matrix44Var) this).aFloat3524 = (f_10_ * ((Matrix44Var) class294_4_).aFloat3514 + f_11_ * ((Matrix44Var) class294_4_).aFloat3523 + f_15_ * ((Matrix44Var) class294_4_).aFloat3513 + ((Matrix44Var) class294_4_).aFloat3524);
		((Matrix44Var) this).aFloat3525 = (f_10_ * ((Matrix44Var) class294_4_).aFloat3516 + f_11_ * ((Matrix44Var) class294_4_).aFloat3522 + f_15_ * ((Matrix44Var) class294_4_).aFloat3521 + ((Matrix44Var) class294_4_).aFloat3525);
	}

	public void method5209(Matrix44Var class294_16_) {
		((Matrix44Var) this).aFloat3519 = ((Matrix44Var) class294_16_).aFloat3519;
		((Matrix44Var) this).aFloat3517 = ((Matrix44Var) class294_16_).aFloat3517;
		((Matrix44Var) this).aFloat3520 = ((Matrix44Var) class294_16_).aFloat3520;
		((Matrix44Var) this).aFloat3515 = ((Matrix44Var) class294_16_).aFloat3515;
		((Matrix44Var) this).aFloat3514 = ((Matrix44Var) class294_16_).aFloat3514;
		((Matrix44Var) this).aFloat3523 = ((Matrix44Var) class294_16_).aFloat3523;
		((Matrix44Var) this).aFloat3513 = ((Matrix44Var) class294_16_).aFloat3513;
		((Matrix44Var) this).aFloat3524 = ((Matrix44Var) class294_16_).aFloat3524;
		((Matrix44Var) this).aFloat3516 = ((Matrix44Var) class294_16_).aFloat3516;
		((Matrix44Var) this).aFloat3522 = ((Matrix44Var) class294_16_).aFloat3522;
		((Matrix44Var) this).aFloat3521 = ((Matrix44Var) class294_16_).aFloat3521;
		((Matrix44Var) this).aFloat3525 = ((Matrix44Var) class294_16_).aFloat3525;
	}

	public void method5210(Class305 class305) {
		method5242(class305.aClass381_3594);
		method5263(class305.aClass385_3595);
	}

	public void method5211(float f, float f_17_, float f_18_) {
		((Matrix44Var) this).aFloat3519 *= f;
		((Matrix44Var) this).aFloat3517 *= f;
		((Matrix44Var) this).aFloat3520 *= f;
		((Matrix44Var) this).aFloat3515 *= f;
		((Matrix44Var) this).aFloat3514 *= f_17_;
		((Matrix44Var) this).aFloat3523 *= f_17_;
		((Matrix44Var) this).aFloat3513 *= f_17_;
		((Matrix44Var) this).aFloat3524 *= f_17_;
		((Matrix44Var) this).aFloat3516 *= f_18_;
		((Matrix44Var) this).aFloat3522 *= f_18_;
		((Matrix44Var) this).aFloat3521 *= f_18_;
		((Matrix44Var) this).aFloat3525 *= f_18_;
	}

	public void method5212() {
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
	}

	public void method5213(int i, int i_19_, int i_20_, float f, float f_21_, float f_22_) {
		if (i != 0) {
			float f_23_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_24_ = Class297.aFloatArray3537[i & 0x3fff];
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3519 = 2.0F * f_23_ * (float) i_19_;
			((Matrix44Var) this).aFloat3523 = 2.0F * f_23_ * (float) i_20_;
			((Matrix44Var) this).aFloat3514 = 2.0F * f_24_ * (float) i_19_;
			((Matrix44Var) this).aFloat3517 = -2.0F * f_24_ * (float) i_20_;
			((Matrix44Var) this).aFloat3515 = (float) (2 * i_19_) * (0.5F * f_24_ - 0.5F * f_23_) + f;
			((Matrix44Var) this).aFloat3524 = (float) (2 * i_20_) * (-0.5F * f_24_ - 0.5F * f_23_) + f_21_;
			((Matrix44Var) this).aFloat3525 = f_22_;
		} else {
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3517 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3514 = 0.0F;
			((Matrix44Var) this).aFloat3519 = (float) (2 * i_19_);
			((Matrix44Var) this).aFloat3523 = (float) (2 * i_20_);
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3515 = f - (float) i_19_;
			((Matrix44Var) this).aFloat3524 = f_21_ - (float) i_20_;
			((Matrix44Var) this).aFloat3525 = f_22_;
		}
	}

	public void method5214(float f, float f_25_, float f_26_, float f_27_, float f_28_, float f_29_, float f_30_, float f_31_, float f_32_) {
		((Matrix44Var) this).aFloat3519 = f;
		((Matrix44Var) this).aFloat3517 = f_27_;
		((Matrix44Var) this).aFloat3520 = f_30_;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3514 = f_25_;
		((Matrix44Var) this).aFloat3523 = f_28_;
		((Matrix44Var) this).aFloat3513 = f_31_;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3516 = f_26_;
		((Matrix44Var) this).aFloat3522 = f_29_;
		((Matrix44Var) this).aFloat3521 = f_32_;
		((Matrix44Var) this).aFloat3525 = 0.0F;
	}

	public void method5215(Matrix44Var class294_33_) {
		if (class294_33_ == this)
			method5207();
		else {
			((Matrix44Var) this).aFloat3519 = ((Matrix44Var) class294_33_).aFloat3519;
			((Matrix44Var) this).aFloat3517 = ((Matrix44Var) class294_33_).aFloat3514;
			((Matrix44Var) this).aFloat3520 = ((Matrix44Var) class294_33_).aFloat3516;
			((Matrix44Var) this).aFloat3514 = ((Matrix44Var) class294_33_).aFloat3517;
			((Matrix44Var) this).aFloat3523 = ((Matrix44Var) class294_33_).aFloat3523;
			((Matrix44Var) this).aFloat3513 = ((Matrix44Var) class294_33_).aFloat3522;
			((Matrix44Var) this).aFloat3516 = ((Matrix44Var) class294_33_).aFloat3520;
			((Matrix44Var) this).aFloat3522 = ((Matrix44Var) class294_33_).aFloat3513;
			((Matrix44Var) this).aFloat3521 = ((Matrix44Var) class294_33_).aFloat3521;
			((Matrix44Var) this).aFloat3515 = -((((Matrix44Var) class294_33_).aFloat3515 * ((Matrix44Var) this).aFloat3519) + (((Matrix44Var) class294_33_).aFloat3524 * ((Matrix44Var) this).aFloat3517) + (((Matrix44Var) class294_33_).aFloat3525 * ((Matrix44Var) this).aFloat3520));
			((Matrix44Var) this).aFloat3524 = -((((Matrix44Var) class294_33_).aFloat3515 * ((Matrix44Var) this).aFloat3514) + (((Matrix44Var) class294_33_).aFloat3524 * ((Matrix44Var) this).aFloat3523) + (((Matrix44Var) class294_33_).aFloat3525 * ((Matrix44Var) this).aFloat3513));
			((Matrix44Var) this).aFloat3525 = -((((Matrix44Var) class294_33_).aFloat3515 * ((Matrix44Var) this).aFloat3516) + (((Matrix44Var) class294_33_).aFloat3524 * ((Matrix44Var) this).aFloat3522) + (((Matrix44Var) class294_33_).aFloat3525 * ((Matrix44Var) this).aFloat3521));
		}
	}

	public void method5216(float f, float f_34_, float f_35_) {
		((Matrix44Var) this).aFloat3519 = f;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3523 = f_34_;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3521 = f_35_;
		((Matrix44Var) this).aFloat3525 = 0.0F;
	}

	public void method5217(float f, float f_36_, float f_37_, float f_38_) {
		float f_39_ = (float) Math.cos((double) f_38_);
		float f_40_ = (float) Math.sin((double) f_38_);
		((Matrix44Var) this).aFloat3519 = f_39_ + f * f * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3514 = f_37_ * f_40_ + f_36_ * f * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3516 = -f_36_ * f_40_ + f_37_ * f * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3517 = -f_37_ * f_40_ + f * f_36_ * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3523 = f_39_ + f_36_ * f_36_ * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3522 = f * f_40_ + f_37_ * f_36_ * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3520 = f_36_ * f_40_ + f * f_37_ * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3513 = -f * f_40_ + f_36_ * f_37_ * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3521 = f_39_ + f_37_ * f_37_ * (1.0F - f_39_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	public void method5218(float f, float f_41_, float f_42_, float[] fs) {
		f -= ((Matrix44Var) this).aFloat3515;
		f_41_ -= ((Matrix44Var) this).aFloat3524;
		f_42_ -= ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_41_ + ((Matrix44Var) this).aFloat3516 * f_42_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_41_ + ((Matrix44Var) this).aFloat3522 * f_42_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_41_ + ((Matrix44Var) this).aFloat3521 * f_42_);
	}

	public void method5219(float f, float f_43_, float f_44_) {
		((Matrix44Var) this).aFloat3515 += f;
		((Matrix44Var) this).aFloat3524 += f_43_;
		((Matrix44Var) this).aFloat3525 += f_44_;
	}

	public void method5220(float f, float f_45_, float f_46_, float f_47_) {
		float f_48_ = (float) Math.cos((double) f_47_);
		float f_49_ = (float) Math.sin((double) f_47_);
		float f_50_ = f_48_ + f * f * (1.0F - f_48_);
		float f_51_ = f_46_ * f_49_ + f_45_ * f * (1.0F - f_48_);
		float f_52_ = -f_45_ * f_49_ + f_46_ * f * (1.0F - f_48_);
		float f_53_ = -f_46_ * f_49_ + f * f_45_ * (1.0F - f_48_);
		float f_54_ = f_48_ + f_45_ * f_45_ * (1.0F - f_48_);
		float f_55_ = f * f_49_ + f_46_ * f_45_ * (1.0F - f_48_);
		float f_56_ = f_45_ * f_49_ + f * f_46_ * (1.0F - f_48_);
		float f_57_ = -f * f_49_ + f_45_ * f_46_ * (1.0F - f_48_);
		float f_58_ = f_48_ + f_46_ * f_46_ * (1.0F - f_48_);
		float f_59_ = ((Matrix44Var) this).aFloat3519;
		float f_60_ = ((Matrix44Var) this).aFloat3514;
		float f_61_ = ((Matrix44Var) this).aFloat3517;
		float f_62_ = ((Matrix44Var) this).aFloat3523;
		float f_63_ = ((Matrix44Var) this).aFloat3520;
		float f_64_ = ((Matrix44Var) this).aFloat3513;
		float f_65_ = ((Matrix44Var) this).aFloat3515;
		float f_66_ = ((Matrix44Var) this).aFloat3524;
		((Matrix44Var) this).aFloat3519 = (f_59_ * f_50_ + f_60_ * f_53_ + ((Matrix44Var) this).aFloat3516 * f_56_);
		((Matrix44Var) this).aFloat3514 = (f_59_ * f_51_ + f_60_ * f_54_ + ((Matrix44Var) this).aFloat3516 * f_57_);
		((Matrix44Var) this).aFloat3516 = (f_59_ * f_52_ + f_60_ * f_55_ + ((Matrix44Var) this).aFloat3516 * f_58_);
		((Matrix44Var) this).aFloat3517 = (f_61_ * f_50_ + f_62_ * f_53_ + ((Matrix44Var) this).aFloat3522 * f_56_);
		((Matrix44Var) this).aFloat3523 = (f_61_ * f_51_ + f_62_ * f_54_ + ((Matrix44Var) this).aFloat3522 * f_57_);
		((Matrix44Var) this).aFloat3522 = (f_61_ * f_52_ + f_62_ * f_55_ + ((Matrix44Var) this).aFloat3522 * f_58_);
		((Matrix44Var) this).aFloat3520 = (f_63_ * f_50_ + f_64_ * f_53_ + ((Matrix44Var) this).aFloat3521 * f_56_);
		((Matrix44Var) this).aFloat3513 = (f_63_ * f_51_ + f_64_ * f_54_ + ((Matrix44Var) this).aFloat3521 * f_57_);
		((Matrix44Var) this).aFloat3521 = (f_63_ * f_52_ + f_64_ * f_55_ + ((Matrix44Var) this).aFloat3521 * f_58_);
		((Matrix44Var) this).aFloat3515 = (f_65_ * f_50_ + f_66_ * f_53_ + ((Matrix44Var) this).aFloat3525 * f_56_);
		((Matrix44Var) this).aFloat3524 = (f_65_ * f_51_ + f_66_ * f_54_ + ((Matrix44Var) this).aFloat3525 * f_57_);
		((Matrix44Var) this).aFloat3525 = (f_65_ * f_52_ + f_66_ * f_55_ + ((Matrix44Var) this).aFloat3525 * f_58_);
	}

	public float[] method5221(float[] fs) {
		fs[0] = ((Matrix44Var) this).aFloat3515;
		fs[1] = ((Matrix44Var) this).aFloat3524;
		fs[2] = ((Matrix44Var) this).aFloat3525;
		return fs;
	}

	public void method5222(float f, float f_67_, float f_68_, float f_69_) {
		float f_70_ = (float) Math.cos((double) f_69_);
		float f_71_ = (float) Math.sin((double) f_69_);
		float f_72_ = f_70_ + f * f * (1.0F - f_70_);
		float f_73_ = f_68_ * f_71_ + f_67_ * f * (1.0F - f_70_);
		float f_74_ = -f_67_ * f_71_ + f_68_ * f * (1.0F - f_70_);
		float f_75_ = -f_68_ * f_71_ + f * f_67_ * (1.0F - f_70_);
		float f_76_ = f_70_ + f_67_ * f_67_ * (1.0F - f_70_);
		float f_77_ = f * f_71_ + f_68_ * f_67_ * (1.0F - f_70_);
		float f_78_ = f_67_ * f_71_ + f * f_68_ * (1.0F - f_70_);
		float f_79_ = -f * f_71_ + f_67_ * f_68_ * (1.0F - f_70_);
		float f_80_ = f_70_ + f_68_ * f_68_ * (1.0F - f_70_);
		float f_81_ = ((Matrix44Var) this).aFloat3519;
		float f_82_ = ((Matrix44Var) this).aFloat3514;
		float f_83_ = ((Matrix44Var) this).aFloat3517;
		float f_84_ = ((Matrix44Var) this).aFloat3523;
		float f_85_ = ((Matrix44Var) this).aFloat3520;
		float f_86_ = ((Matrix44Var) this).aFloat3513;
		float f_87_ = ((Matrix44Var) this).aFloat3515;
		float f_88_ = ((Matrix44Var) this).aFloat3524;
		((Matrix44Var) this).aFloat3519 = (f_81_ * f_72_ + f_82_ * f_75_ + ((Matrix44Var) this).aFloat3516 * f_78_);
		((Matrix44Var) this).aFloat3514 = (f_81_ * f_73_ + f_82_ * f_76_ + ((Matrix44Var) this).aFloat3516 * f_79_);
		((Matrix44Var) this).aFloat3516 = (f_81_ * f_74_ + f_82_ * f_77_ + ((Matrix44Var) this).aFloat3516 * f_80_);
		((Matrix44Var) this).aFloat3517 = (f_83_ * f_72_ + f_84_ * f_75_ + ((Matrix44Var) this).aFloat3522 * f_78_);
		((Matrix44Var) this).aFloat3523 = (f_83_ * f_73_ + f_84_ * f_76_ + ((Matrix44Var) this).aFloat3522 * f_79_);
		((Matrix44Var) this).aFloat3522 = (f_83_ * f_74_ + f_84_ * f_77_ + ((Matrix44Var) this).aFloat3522 * f_80_);
		((Matrix44Var) this).aFloat3520 = (f_85_ * f_72_ + f_86_ * f_75_ + ((Matrix44Var) this).aFloat3521 * f_78_);
		((Matrix44Var) this).aFloat3513 = (f_85_ * f_73_ + f_86_ * f_76_ + ((Matrix44Var) this).aFloat3521 * f_79_);
		((Matrix44Var) this).aFloat3521 = (f_85_ * f_74_ + f_86_ * f_77_ + ((Matrix44Var) this).aFloat3521 * f_80_);
		((Matrix44Var) this).aFloat3515 = (f_87_ * f_72_ + f_88_ * f_75_ + ((Matrix44Var) this).aFloat3525 * f_78_);
		((Matrix44Var) this).aFloat3524 = (f_87_ * f_73_ + f_88_ * f_76_ + ((Matrix44Var) this).aFloat3525 * f_79_);
		((Matrix44Var) this).aFloat3525 = (f_87_ * f_74_ + f_88_ * f_77_ + ((Matrix44Var) this).aFloat3525 * f_80_);
	}

	public void method5223(float f, float f_89_, float f_90_) {
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
		((Matrix44Var) this).aFloat3515 = f;
		((Matrix44Var) this).aFloat3524 = f_89_;
		((Matrix44Var) this).aFloat3525 = f_90_;
	}

	public void method5224() {
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
	}

	void method5225(float f, float f_91_, float f_92_, float f_93_) {
		float f_94_ = f * f;
		float f_95_ = f * f_91_;
		float f_96_ = f * f_92_;
		float f_97_ = f * f_93_;
		float f_98_ = f_91_ * f_91_;
		float f_99_ = f_91_ * f_92_;
		float f_100_ = f_91_ * f_93_;
		float f_101_ = f_92_ * f_92_;
		float f_102_ = f_92_ * f_93_;
		((Matrix44Var) this).aFloat3519 = 1.0F - 2.0F * (f_98_ + f_101_);
		((Matrix44Var) this).aFloat3517 = 2.0F * (f_95_ - f_102_);
		((Matrix44Var) this).aFloat3520 = 2.0F * (f_96_ + f_100_);
		((Matrix44Var) this).aFloat3514 = 2.0F * (f_95_ + f_102_);
		((Matrix44Var) this).aFloat3523 = 1.0F - 2.0F * (f_94_ + f_101_);
		((Matrix44Var) this).aFloat3513 = 2.0F * (f_99_ - f_97_);
		((Matrix44Var) this).aFloat3516 = 2.0F * (f_96_ - f_100_);
		((Matrix44Var) this).aFloat3522 = 2.0F * (f_99_ + f_97_);
		((Matrix44Var) this).aFloat3521 = 1.0F - 2.0F * (f_94_ + f_98_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	public String toString() {
		return new StringBuilder().append(((Matrix44Var) this).aFloat3519).append(",").append(((Matrix44Var) this).aFloat3517).append(",").append(((Matrix44Var) this).aFloat3520).append(",").append(((Matrix44Var) this).aFloat3515).append(" - ").append(((Matrix44Var) this).aFloat3514).append(",").append(((Matrix44Var) this).aFloat3523).append(",").append(((Matrix44Var) this).aFloat3513).append(",").append(((Matrix44Var) this).aFloat3524).append(" - ").append(((Matrix44Var) this).aFloat3516).append(",")
				.append(((Matrix44Var) this).aFloat3522).append(",").append(((Matrix44Var) this).aFloat3521).append(",").append(((Matrix44Var) this).aFloat3525).toString();
	}

	public void method5226(float f, float f_103_, float f_104_, float[] fs) {
		fs[0] = (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3517 * f_103_ + ((Matrix44Var) this).aFloat3520 * f_104_ + ((Matrix44Var) this).aFloat3515);
		fs[1] = (((Matrix44Var) this).aFloat3514 * f + ((Matrix44Var) this).aFloat3523 * f_103_ + ((Matrix44Var) this).aFloat3513 * f_104_ + ((Matrix44Var) this).aFloat3524);
		fs[2] = (((Matrix44Var) this).aFloat3516 * f + ((Matrix44Var) this).aFloat3522 * f_103_ + ((Matrix44Var) this).aFloat3521 * f_104_ + ((Matrix44Var) this).aFloat3525);
	}

	public void method5227(float f, float f_105_, float f_106_, float f_107_) {
		float f_108_ = (float) Math.cos((double) f_107_);
		float f_109_ = (float) Math.sin((double) f_107_);
		float f_110_ = f_108_ + f * f * (1.0F - f_108_);
		float f_111_ = f_106_ * f_109_ + f_105_ * f * (1.0F - f_108_);
		float f_112_ = -f_105_ * f_109_ + f_106_ * f * (1.0F - f_108_);
		float f_113_ = -f_106_ * f_109_ + f * f_105_ * (1.0F - f_108_);
		float f_114_ = f_108_ + f_105_ * f_105_ * (1.0F - f_108_);
		float f_115_ = f * f_109_ + f_106_ * f_105_ * (1.0F - f_108_);
		float f_116_ = f_105_ * f_109_ + f * f_106_ * (1.0F - f_108_);
		float f_117_ = -f * f_109_ + f_105_ * f_106_ * (1.0F - f_108_);
		float f_118_ = f_108_ + f_106_ * f_106_ * (1.0F - f_108_);
		float f_119_ = ((Matrix44Var) this).aFloat3519;
		float f_120_ = ((Matrix44Var) this).aFloat3514;
		float f_121_ = ((Matrix44Var) this).aFloat3517;
		float f_122_ = ((Matrix44Var) this).aFloat3523;
		float f_123_ = ((Matrix44Var) this).aFloat3520;
		float f_124_ = ((Matrix44Var) this).aFloat3513;
		float f_125_ = ((Matrix44Var) this).aFloat3515;
		float f_126_ = ((Matrix44Var) this).aFloat3524;
		((Matrix44Var) this).aFloat3519 = (f_119_ * f_110_ + f_120_ * f_113_ + ((Matrix44Var) this).aFloat3516 * f_116_);
		((Matrix44Var) this).aFloat3514 = (f_119_ * f_111_ + f_120_ * f_114_ + ((Matrix44Var) this).aFloat3516 * f_117_);
		((Matrix44Var) this).aFloat3516 = (f_119_ * f_112_ + f_120_ * f_115_ + ((Matrix44Var) this).aFloat3516 * f_118_);
		((Matrix44Var) this).aFloat3517 = (f_121_ * f_110_ + f_122_ * f_113_ + ((Matrix44Var) this).aFloat3522 * f_116_);
		((Matrix44Var) this).aFloat3523 = (f_121_ * f_111_ + f_122_ * f_114_ + ((Matrix44Var) this).aFloat3522 * f_117_);
		((Matrix44Var) this).aFloat3522 = (f_121_ * f_112_ + f_122_ * f_115_ + ((Matrix44Var) this).aFloat3522 * f_118_);
		((Matrix44Var) this).aFloat3520 = (f_123_ * f_110_ + f_124_ * f_113_ + ((Matrix44Var) this).aFloat3521 * f_116_);
		((Matrix44Var) this).aFloat3513 = (f_123_ * f_111_ + f_124_ * f_114_ + ((Matrix44Var) this).aFloat3521 * f_117_);
		((Matrix44Var) this).aFloat3521 = (f_123_ * f_112_ + f_124_ * f_115_ + ((Matrix44Var) this).aFloat3521 * f_118_);
		((Matrix44Var) this).aFloat3515 = (f_125_ * f_110_ + f_126_ * f_113_ + ((Matrix44Var) this).aFloat3525 * f_116_);
		((Matrix44Var) this).aFloat3524 = (f_125_ * f_111_ + f_126_ * f_114_ + ((Matrix44Var) this).aFloat3525 * f_117_);
		((Matrix44Var) this).aFloat3525 = (f_125_ * f_112_ + f_126_ * f_115_ + ((Matrix44Var) this).aFloat3525 * f_118_);
	}

	public void method5228(float f, float f_127_, float f_128_, float[] fs) {
		f -= ((Matrix44Var) this).aFloat3515;
		f_127_ -= ((Matrix44Var) this).aFloat3524;
		f_128_ -= ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_127_ + ((Matrix44Var) this).aFloat3516 * f_128_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_127_ + ((Matrix44Var) this).aFloat3522 * f_128_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_127_ + ((Matrix44Var) this).aFloat3521 * f_128_);
	}

	public void method5229(float f, float f_129_, float f_130_) {
		((Matrix44Var) this).aFloat3519 = f;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3523 = f_129_;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3521 = f_130_;
		((Matrix44Var) this).aFloat3525 = 0.0F;
	}

	public void method5230(float[] fs) {
		float f = fs[0];
		float f_131_ = fs[1];
		float f_132_ = fs[2];
		fs[0] = (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_131_ + ((Matrix44Var) this).aFloat3516 * f_132_);
		fs[1] = (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_131_ + ((Matrix44Var) this).aFloat3522 * f_132_);
		fs[2] = (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_131_ + ((Matrix44Var) this).aFloat3521 * f_132_);
	}

	public float[] method5231(float[] fs) {
		fs[0] = ((Matrix44Var) this).aFloat3515;
		fs[1] = ((Matrix44Var) this).aFloat3524;
		fs[2] = ((Matrix44Var) this).aFloat3525;
		return fs;
	}

	public void method5232(float f, float f_133_, float f_134_) {
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
		((Matrix44Var) this).aFloat3515 = f;
		((Matrix44Var) this).aFloat3524 = f_133_;
		((Matrix44Var) this).aFloat3525 = f_134_;
	}

	public String method5233() {
		return new StringBuilder().append(((Matrix44Var) this).aFloat3519).append(",").append(((Matrix44Var) this).aFloat3517).append(",").append(((Matrix44Var) this).aFloat3520).append(",").append(((Matrix44Var) this).aFloat3515).append(" - ").append(((Matrix44Var) this).aFloat3514).append(",").append(((Matrix44Var) this).aFloat3523).append(",").append(((Matrix44Var) this).aFloat3513).append(",").append(((Matrix44Var) this).aFloat3524).append(" - ").append(((Matrix44Var) this).aFloat3516).append(",")
				.append(((Matrix44Var) this).aFloat3522).append(",").append(((Matrix44Var) this).aFloat3521).append(",").append(((Matrix44Var) this).aFloat3525).toString();
	}

	public String method5234() {
		return new StringBuilder().append(((Matrix44Var) this).aFloat3519).append(",").append(((Matrix44Var) this).aFloat3517).append(",").append(((Matrix44Var) this).aFloat3520).append(",").append(((Matrix44Var) this).aFloat3515).append(" - ").append(((Matrix44Var) this).aFloat3514).append(",").append(((Matrix44Var) this).aFloat3523).append(",").append(((Matrix44Var) this).aFloat3513).append(",").append(((Matrix44Var) this).aFloat3524).append(" - ").append(((Matrix44Var) this).aFloat3516).append(",")
				.append(((Matrix44Var) this).aFloat3522).append(",").append(((Matrix44Var) this).aFloat3521).append(",").append(((Matrix44Var) this).aFloat3525).toString();
	}

	public void method5235(Matrix44Var class294_135_) {
		((Matrix44Var) this).aFloat3519 = ((Matrix44Var) class294_135_).aFloat3519;
		((Matrix44Var) this).aFloat3517 = ((Matrix44Var) class294_135_).aFloat3517;
		((Matrix44Var) this).aFloat3520 = ((Matrix44Var) class294_135_).aFloat3520;
		((Matrix44Var) this).aFloat3515 = ((Matrix44Var) class294_135_).aFloat3515;
		((Matrix44Var) this).aFloat3514 = ((Matrix44Var) class294_135_).aFloat3514;
		((Matrix44Var) this).aFloat3523 = ((Matrix44Var) class294_135_).aFloat3523;
		((Matrix44Var) this).aFloat3513 = ((Matrix44Var) class294_135_).aFloat3513;
		((Matrix44Var) this).aFloat3524 = ((Matrix44Var) class294_135_).aFloat3524;
		((Matrix44Var) this).aFloat3516 = ((Matrix44Var) class294_135_).aFloat3516;
		((Matrix44Var) this).aFloat3522 = ((Matrix44Var) class294_135_).aFloat3522;
		((Matrix44Var) this).aFloat3521 = ((Matrix44Var) class294_135_).aFloat3521;
		((Matrix44Var) this).aFloat3525 = ((Matrix44Var) class294_135_).aFloat3525;
	}

	public void method5236(Matrix44Var class294_136_) {
		((Matrix44Var) this).aFloat3519 = ((Matrix44Var) class294_136_).aFloat3519;
		((Matrix44Var) this).aFloat3517 = ((Matrix44Var) class294_136_).aFloat3517;
		((Matrix44Var) this).aFloat3520 = ((Matrix44Var) class294_136_).aFloat3520;
		((Matrix44Var) this).aFloat3515 = ((Matrix44Var) class294_136_).aFloat3515;
		((Matrix44Var) this).aFloat3514 = ((Matrix44Var) class294_136_).aFloat3514;
		((Matrix44Var) this).aFloat3523 = ((Matrix44Var) class294_136_).aFloat3523;
		((Matrix44Var) this).aFloat3513 = ((Matrix44Var) class294_136_).aFloat3513;
		((Matrix44Var) this).aFloat3524 = ((Matrix44Var) class294_136_).aFloat3524;
		((Matrix44Var) this).aFloat3516 = ((Matrix44Var) class294_136_).aFloat3516;
		((Matrix44Var) this).aFloat3522 = ((Matrix44Var) class294_136_).aFloat3522;
		((Matrix44Var) this).aFloat3521 = ((Matrix44Var) class294_136_).aFloat3521;
		((Matrix44Var) this).aFloat3525 = ((Matrix44Var) class294_136_).aFloat3525;
	}

	public void method5237(Class305 class305) {
		method5242(class305.aClass381_3594);
		method5263(class305.aClass385_3595);
	}

	public void method5238(Class305 class305) {
		float f = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).scalar);
		float f_137_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).i);
		float f_138_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).j);
		float f_139_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).k);
		float f_140_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).i);
		float f_141_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).j);
		float f_142_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).k);
		float f_143_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).j);
		float f_144_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).k);
		float f_145_ = (((Quaternion) class305.aClass381_3594).k * ((Quaternion) class305.aClass381_3594).k);
		((Matrix44Var) this).aFloat3519 = f_140_ + f - f_145_ - f_143_;
		((Matrix44Var) this).aFloat3514 = f_141_ + f_139_ + f_141_ + f_139_;
		((Matrix44Var) this).aFloat3516 = f_142_ - f_138_ - f_138_ + f_142_;
		((Matrix44Var) this).aFloat3517 = f_141_ - f_139_ - f_139_ + f_141_;
		((Matrix44Var) this).aFloat3523 = f_143_ + f - f_140_ - f_145_;
		((Matrix44Var) this).aFloat3522 = f_144_ + f_137_ + f_144_ + f_137_;
		((Matrix44Var) this).aFloat3520 = f_142_ + f_138_ + f_142_ + f_138_;
		((Matrix44Var) this).aFloat3513 = f_144_ - f_137_ - f_137_ + f_144_;
		((Matrix44Var) this).aFloat3521 = f_145_ + f - f_143_ - f_140_;
		((Matrix44Var) this).aFloat3515 = class305.aClass385_3595.x;
		((Matrix44Var) this).aFloat3524 = class305.aClass385_3595.y;
		((Matrix44Var) this).aFloat3525 = class305.aClass385_3595.z;
	}

	public void method5239(Class305 class305) {
		float f = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).scalar);
		float f_146_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).i);
		float f_147_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).j);
		float f_148_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).k);
		float f_149_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).i);
		float f_150_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).j);
		float f_151_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).k);
		float f_152_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).j);
		float f_153_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).k);
		float f_154_ = (((Quaternion) class305.aClass381_3594).k * ((Quaternion) class305.aClass381_3594).k);
		((Matrix44Var) this).aFloat3519 = f_149_ + f - f_154_ - f_152_;
		((Matrix44Var) this).aFloat3514 = f_150_ + f_148_ + f_150_ + f_148_;
		((Matrix44Var) this).aFloat3516 = f_151_ - f_147_ - f_147_ + f_151_;
		((Matrix44Var) this).aFloat3517 = f_150_ - f_148_ - f_148_ + f_150_;
		((Matrix44Var) this).aFloat3523 = f_152_ + f - f_149_ - f_154_;
		((Matrix44Var) this).aFloat3522 = f_153_ + f_146_ + f_153_ + f_146_;
		((Matrix44Var) this).aFloat3520 = f_151_ + f_147_ + f_151_ + f_147_;
		((Matrix44Var) this).aFloat3513 = f_153_ - f_146_ - f_146_ + f_153_;
		((Matrix44Var) this).aFloat3521 = f_154_ + f - f_152_ - f_149_;
		((Matrix44Var) this).aFloat3515 = class305.aClass385_3595.x;
		((Matrix44Var) this).aFloat3524 = class305.aClass385_3595.y;
		((Matrix44Var) this).aFloat3525 = class305.aClass385_3595.z;
	}

	public void method5240(Class305 class305) {
		float f = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).scalar);
		float f_155_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).i);
		float f_156_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).j);
		float f_157_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).k);
		float f_158_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).i);
		float f_159_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).j);
		float f_160_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).k);
		float f_161_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).j);
		float f_162_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).k);
		float f_163_ = (((Quaternion) class305.aClass381_3594).k * ((Quaternion) class305.aClass381_3594).k);
		((Matrix44Var) this).aFloat3519 = f_158_ + f - f_163_ - f_161_;
		((Matrix44Var) this).aFloat3514 = f_159_ + f_157_ + f_159_ + f_157_;
		((Matrix44Var) this).aFloat3516 = f_160_ - f_156_ - f_156_ + f_160_;
		((Matrix44Var) this).aFloat3517 = f_159_ - f_157_ - f_157_ + f_159_;
		((Matrix44Var) this).aFloat3523 = f_161_ + f - f_158_ - f_163_;
		((Matrix44Var) this).aFloat3522 = f_162_ + f_155_ + f_162_ + f_155_;
		((Matrix44Var) this).aFloat3520 = f_160_ + f_156_ + f_160_ + f_156_;
		((Matrix44Var) this).aFloat3513 = f_162_ - f_155_ - f_155_ + f_162_;
		((Matrix44Var) this).aFloat3521 = f_163_ + f - f_161_ - f_158_;
		((Matrix44Var) this).aFloat3515 = class305.aClass385_3595.x;
		((Matrix44Var) this).aFloat3524 = class305.aClass385_3595.y;
		((Matrix44Var) this).aFloat3525 = class305.aClass385_3595.z;
	}

	public void method5241(Class305 class305) {
		float f = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).scalar);
		float f_164_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).i);
		float f_165_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).j);
		float f_166_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).k);
		float f_167_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).i);
		float f_168_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).j);
		float f_169_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).k);
		float f_170_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).j);
		float f_171_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).k);
		float f_172_ = (((Quaternion) class305.aClass381_3594).k * ((Quaternion) class305.aClass381_3594).k);
		((Matrix44Var) this).aFloat3519 = f_167_ + f - f_172_ - f_170_;
		((Matrix44Var) this).aFloat3514 = f_168_ + f_166_ + f_168_ + f_166_;
		((Matrix44Var) this).aFloat3516 = f_169_ - f_165_ - f_165_ + f_169_;
		((Matrix44Var) this).aFloat3517 = f_168_ - f_166_ - f_166_ + f_168_;
		((Matrix44Var) this).aFloat3523 = f_170_ + f - f_167_ - f_172_;
		((Matrix44Var) this).aFloat3522 = f_171_ + f_164_ + f_171_ + f_164_;
		((Matrix44Var) this).aFloat3520 = f_169_ + f_165_ + f_169_ + f_165_;
		((Matrix44Var) this).aFloat3513 = f_171_ - f_164_ - f_164_ + f_171_;
		((Matrix44Var) this).aFloat3521 = f_172_ + f - f_170_ - f_167_;
		((Matrix44Var) this).aFloat3515 = class305.aClass385_3595.x;
		((Matrix44Var) this).aFloat3524 = class305.aClass385_3595.y;
		((Matrix44Var) this).aFloat3525 = class305.aClass385_3595.z;
	}

	void method5242(Quaternion class381) {
		method5272(((Quaternion) class381).i, ((Quaternion) class381).j, ((Quaternion) class381).k, ((Quaternion) class381).scalar);
	}

	public void method5243(float[] fs) {
		float f = fs[0] - ((Matrix44Var) this).aFloat3515;
		float f_173_ = fs[1] - ((Matrix44Var) this).aFloat3524;
		float f_174_ = fs[2] - ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_173_ + ((Matrix44Var) this).aFloat3516 * f_174_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_173_ + ((Matrix44Var) this).aFloat3522 * f_174_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_173_ + ((Matrix44Var) this).aFloat3521 * f_174_);
	}

	public void method5244(float f, float f_175_, float f_176_) {
		((Matrix44Var) this).aFloat3515 += f;
		((Matrix44Var) this).aFloat3524 += f_175_;
		((Matrix44Var) this).aFloat3525 += f_176_;
	}

	public void method5245(int i, int i_177_, int i_178_, float f, float f_179_, float f_180_) {
		if (i != 0) {
			float f_181_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_182_ = Class297.aFloatArray3537[i & 0x3fff];
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3519 = 2.0F * f_181_ * (float) i_177_;
			((Matrix44Var) this).aFloat3523 = 2.0F * f_181_ * (float) i_178_;
			((Matrix44Var) this).aFloat3514 = 2.0F * f_182_ * (float) i_177_;
			((Matrix44Var) this).aFloat3517 = -2.0F * f_182_ * (float) i_178_;
			((Matrix44Var) this).aFloat3515 = (float) (2 * i_177_) * (0.5F * f_182_ - 0.5F * f_181_) + f;
			((Matrix44Var) this).aFloat3524 = ((float) (2 * i_178_) * (-0.5F * f_182_ - 0.5F * f_181_) + f_179_);
			((Matrix44Var) this).aFloat3525 = f_180_;
		} else {
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3517 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3514 = 0.0F;
			((Matrix44Var) this).aFloat3519 = (float) (2 * i_177_);
			((Matrix44Var) this).aFloat3523 = (float) (2 * i_178_);
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3515 = f - (float) i_177_;
			((Matrix44Var) this).aFloat3524 = f_179_ - (float) i_178_;
			((Matrix44Var) this).aFloat3525 = f_180_;
		}
	}

	public void method5246(int i, int i_183_, int i_184_, float f, float f_185_, float f_186_) {
		if (i != 0) {
			float f_187_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_188_ = Class297.aFloatArray3537[i & 0x3fff];
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3519 = 2.0F * f_187_ * (float) i_183_;
			((Matrix44Var) this).aFloat3523 = 2.0F * f_187_ * (float) i_184_;
			((Matrix44Var) this).aFloat3514 = 2.0F * f_188_ * (float) i_183_;
			((Matrix44Var) this).aFloat3517 = -2.0F * f_188_ * (float) i_184_;
			((Matrix44Var) this).aFloat3515 = (float) (2 * i_183_) * (0.5F * f_188_ - 0.5F * f_187_) + f;
			((Matrix44Var) this).aFloat3524 = ((float) (2 * i_184_) * (-0.5F * f_188_ - 0.5F * f_187_) + f_185_);
			((Matrix44Var) this).aFloat3525 = f_186_;
		} else {
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3517 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3514 = 0.0F;
			((Matrix44Var) this).aFloat3519 = (float) (2 * i_183_);
			((Matrix44Var) this).aFloat3523 = (float) (2 * i_184_);
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3515 = f - (float) i_183_;
			((Matrix44Var) this).aFloat3524 = f_185_ - (float) i_184_;
			((Matrix44Var) this).aFloat3525 = f_186_;
		}
	}

	public void method5247(float f, float f_189_, float f_190_) {
		((Matrix44Var) this).aFloat3519 *= f;
		((Matrix44Var) this).aFloat3517 *= f;
		((Matrix44Var) this).aFloat3520 *= f;
		((Matrix44Var) this).aFloat3515 *= f;
		((Matrix44Var) this).aFloat3514 *= f_189_;
		((Matrix44Var) this).aFloat3523 *= f_189_;
		((Matrix44Var) this).aFloat3513 *= f_189_;
		((Matrix44Var) this).aFloat3524 *= f_189_;
		((Matrix44Var) this).aFloat3516 *= f_190_;
		((Matrix44Var) this).aFloat3522 *= f_190_;
		((Matrix44Var) this).aFloat3521 *= f_190_;
		((Matrix44Var) this).aFloat3525 *= f_190_;
	}

	public void method5248(float f, float f_191_, float f_192_, float f_193_, float f_194_, float f_195_, float f_196_, float f_197_, float f_198_) {
		((Matrix44Var) this).aFloat3519 = f;
		((Matrix44Var) this).aFloat3517 = f_193_;
		((Matrix44Var) this).aFloat3520 = f_196_;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3514 = f_191_;
		((Matrix44Var) this).aFloat3523 = f_194_;
		((Matrix44Var) this).aFloat3513 = f_197_;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3516 = f_192_;
		((Matrix44Var) this).aFloat3522 = f_195_;
		((Matrix44Var) this).aFloat3521 = f_198_;
		((Matrix44Var) this).aFloat3525 = 0.0F;
	}

	public void method5249(float f, float f_199_, float f_200_, float f_201_, float f_202_, float f_203_, float f_204_, float f_205_, float f_206_) {
		((Matrix44Var) this).aFloat3519 = f;
		((Matrix44Var) this).aFloat3517 = f_201_;
		((Matrix44Var) this).aFloat3520 = f_204_;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3514 = f_199_;
		((Matrix44Var) this).aFloat3523 = f_202_;
		((Matrix44Var) this).aFloat3513 = f_205_;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3516 = f_200_;
		((Matrix44Var) this).aFloat3522 = f_203_;
		((Matrix44Var) this).aFloat3521 = f_206_;
		((Matrix44Var) this).aFloat3525 = 0.0F;
	}

	public void method5250(Matrix44Var class294_207_) {
		if (class294_207_ == this)
			method5207();
		else {
			((Matrix44Var) this).aFloat3519 = ((Matrix44Var) class294_207_).aFloat3519;
			((Matrix44Var) this).aFloat3517 = ((Matrix44Var) class294_207_).aFloat3514;
			((Matrix44Var) this).aFloat3520 = ((Matrix44Var) class294_207_).aFloat3516;
			((Matrix44Var) this).aFloat3514 = ((Matrix44Var) class294_207_).aFloat3517;
			((Matrix44Var) this).aFloat3523 = ((Matrix44Var) class294_207_).aFloat3523;
			((Matrix44Var) this).aFloat3513 = ((Matrix44Var) class294_207_).aFloat3522;
			((Matrix44Var) this).aFloat3516 = ((Matrix44Var) class294_207_).aFloat3520;
			((Matrix44Var) this).aFloat3522 = ((Matrix44Var) class294_207_).aFloat3513;
			((Matrix44Var) this).aFloat3521 = ((Matrix44Var) class294_207_).aFloat3521;
			((Matrix44Var) this).aFloat3515 = -((((Matrix44Var) class294_207_).aFloat3515 * ((Matrix44Var) this).aFloat3519) + (((Matrix44Var) class294_207_).aFloat3524 * ((Matrix44Var) this).aFloat3517) + (((Matrix44Var) class294_207_).aFloat3525 * ((Matrix44Var) this).aFloat3520));
			((Matrix44Var) this).aFloat3524 = -((((Matrix44Var) class294_207_).aFloat3515 * ((Matrix44Var) this).aFloat3514) + (((Matrix44Var) class294_207_).aFloat3524 * ((Matrix44Var) this).aFloat3523) + (((Matrix44Var) class294_207_).aFloat3525 * ((Matrix44Var) this).aFloat3513));
			((Matrix44Var) this).aFloat3525 = -((((Matrix44Var) class294_207_).aFloat3515 * ((Matrix44Var) this).aFloat3516) + (((Matrix44Var) class294_207_).aFloat3524 * ((Matrix44Var) this).aFloat3522) + (((Matrix44Var) class294_207_).aFloat3525 * ((Matrix44Var) this).aFloat3521));
		}
	}

	public void method5251(Matrix44Var class294_208_) {
		if (class294_208_ == this)
			method5207();
		else {
			((Matrix44Var) this).aFloat3519 = ((Matrix44Var) class294_208_).aFloat3519;
			((Matrix44Var) this).aFloat3517 = ((Matrix44Var) class294_208_).aFloat3514;
			((Matrix44Var) this).aFloat3520 = ((Matrix44Var) class294_208_).aFloat3516;
			((Matrix44Var) this).aFloat3514 = ((Matrix44Var) class294_208_).aFloat3517;
			((Matrix44Var) this).aFloat3523 = ((Matrix44Var) class294_208_).aFloat3523;
			((Matrix44Var) this).aFloat3513 = ((Matrix44Var) class294_208_).aFloat3522;
			((Matrix44Var) this).aFloat3516 = ((Matrix44Var) class294_208_).aFloat3520;
			((Matrix44Var) this).aFloat3522 = ((Matrix44Var) class294_208_).aFloat3513;
			((Matrix44Var) this).aFloat3521 = ((Matrix44Var) class294_208_).aFloat3521;
			((Matrix44Var) this).aFloat3515 = -((((Matrix44Var) class294_208_).aFloat3515 * ((Matrix44Var) this).aFloat3519) + (((Matrix44Var) class294_208_).aFloat3524 * ((Matrix44Var) this).aFloat3517) + (((Matrix44Var) class294_208_).aFloat3525 * ((Matrix44Var) this).aFloat3520));
			((Matrix44Var) this).aFloat3524 = -((((Matrix44Var) class294_208_).aFloat3515 * ((Matrix44Var) this).aFloat3514) + (((Matrix44Var) class294_208_).aFloat3524 * ((Matrix44Var) this).aFloat3523) + (((Matrix44Var) class294_208_).aFloat3525 * ((Matrix44Var) this).aFloat3513));
			((Matrix44Var) this).aFloat3525 = -((((Matrix44Var) class294_208_).aFloat3515 * ((Matrix44Var) this).aFloat3516) + (((Matrix44Var) class294_208_).aFloat3524 * ((Matrix44Var) this).aFloat3522) + (((Matrix44Var) class294_208_).aFloat3525 * ((Matrix44Var) this).aFloat3521));
		}
	}

	public void method5252() {
		float f = ((Matrix44Var) this).aFloat3515;
		float f_209_ = ((Matrix44Var) this).aFloat3524;
		float f_210_ = ((Matrix44Var) this).aFloat3517;
		((Matrix44Var) this).aFloat3517 = ((Matrix44Var) this).aFloat3514;
		((Matrix44Var) this).aFloat3514 = f_210_;
		float f_211_ = ((Matrix44Var) this).aFloat3520;
		((Matrix44Var) this).aFloat3520 = ((Matrix44Var) this).aFloat3516;
		((Matrix44Var) this).aFloat3516 = f_211_;
		float f_212_ = ((Matrix44Var) this).aFloat3513;
		((Matrix44Var) this).aFloat3513 = ((Matrix44Var) this).aFloat3522;
		((Matrix44Var) this).aFloat3522 = f_212_;
		((Matrix44Var) this).aFloat3515 = -(f * ((Matrix44Var) this).aFloat3519 + f_209_ * ((Matrix44Var) this).aFloat3517 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3520);
		((Matrix44Var) this).aFloat3524 = -(f * ((Matrix44Var) this).aFloat3514 + f_209_ * ((Matrix44Var) this).aFloat3523 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3513);
		((Matrix44Var) this).aFloat3525 = -(f * ((Matrix44Var) this).aFloat3516 + f_209_ * ((Matrix44Var) this).aFloat3522 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3521);
	}

	public void method5253() {
		float f = ((Matrix44Var) this).aFloat3515;
		float f_213_ = ((Matrix44Var) this).aFloat3524;
		float f_214_ = ((Matrix44Var) this).aFloat3517;
		((Matrix44Var) this).aFloat3517 = ((Matrix44Var) this).aFloat3514;
		((Matrix44Var) this).aFloat3514 = f_214_;
		float f_215_ = ((Matrix44Var) this).aFloat3520;
		((Matrix44Var) this).aFloat3520 = ((Matrix44Var) this).aFloat3516;
		((Matrix44Var) this).aFloat3516 = f_215_;
		float f_216_ = ((Matrix44Var) this).aFloat3513;
		((Matrix44Var) this).aFloat3513 = ((Matrix44Var) this).aFloat3522;
		((Matrix44Var) this).aFloat3522 = f_216_;
		((Matrix44Var) this).aFloat3515 = -(f * ((Matrix44Var) this).aFloat3519 + f_213_ * ((Matrix44Var) this).aFloat3517 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3520);
		((Matrix44Var) this).aFloat3524 = -(f * ((Matrix44Var) this).aFloat3514 + f_213_ * ((Matrix44Var) this).aFloat3523 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3513);
		((Matrix44Var) this).aFloat3525 = -(f * ((Matrix44Var) this).aFloat3516 + f_213_ * ((Matrix44Var) this).aFloat3522 + ((Matrix44Var) this).aFloat3525 * ((Matrix44Var) this).aFloat3521);
	}

	public void method5254(float f, float f_217_, float f_218_, float f_219_) {
		float f_220_ = (float) Math.cos((double) f_219_);
		float f_221_ = (float) Math.sin((double) f_219_);
		((Matrix44Var) this).aFloat3519 = f_220_ + f * f * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3514 = f_218_ * f_221_ + f_217_ * f * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3516 = -f_217_ * f_221_ + f_218_ * f * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3517 = -f_218_ * f_221_ + f * f_217_ * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3523 = f_220_ + f_217_ * f_217_ * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3522 = f * f_221_ + f_218_ * f_217_ * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3520 = f_217_ * f_221_ + f * f_218_ * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3513 = -f * f_221_ + f_217_ * f_218_ * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3521 = f_220_ + f_218_ * f_218_ * (1.0F - f_220_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	public void method5255(float f, float f_222_, float f_223_, float f_224_) {
		float f_225_ = (float) Math.cos((double) f_224_);
		float f_226_ = (float) Math.sin((double) f_224_);
		((Matrix44Var) this).aFloat3519 = f_225_ + f * f * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3514 = f_223_ * f_226_ + f_222_ * f * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3516 = -f_222_ * f_226_ + f_223_ * f * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3517 = -f_223_ * f_226_ + f * f_222_ * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3523 = f_225_ + f_222_ * f_222_ * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3522 = f * f_226_ + f_223_ * f_222_ * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3520 = f_222_ * f_226_ + f * f_223_ * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3513 = -f * f_226_ + f_222_ * f_223_ * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3521 = f_225_ + f_223_ * f_223_ * (1.0F - f_225_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	void method5256(Quaternion class381) {
		method5272(((Quaternion) class381).i, ((Quaternion) class381).j, ((Quaternion) class381).k, ((Quaternion) class381).scalar);
	}

	void method5257(Quaternion class381) {
		method5272(((Quaternion) class381).i, ((Quaternion) class381).j, ((Quaternion) class381).k, ((Quaternion) class381).scalar);
	}

	void method5258(float f, float f_227_, float f_228_, float f_229_) {
		float f_230_ = f * f;
		float f_231_ = f * f_227_;
		float f_232_ = f * f_228_;
		float f_233_ = f * f_229_;
		float f_234_ = f_227_ * f_227_;
		float f_235_ = f_227_ * f_228_;
		float f_236_ = f_227_ * f_229_;
		float f_237_ = f_228_ * f_228_;
		float f_238_ = f_228_ * f_229_;
		((Matrix44Var) this).aFloat3519 = 1.0F - 2.0F * (f_234_ + f_237_);
		((Matrix44Var) this).aFloat3517 = 2.0F * (f_231_ - f_238_);
		((Matrix44Var) this).aFloat3520 = 2.0F * (f_232_ + f_236_);
		((Matrix44Var) this).aFloat3514 = 2.0F * (f_231_ + f_238_);
		((Matrix44Var) this).aFloat3523 = 1.0F - 2.0F * (f_230_ + f_237_);
		((Matrix44Var) this).aFloat3513 = 2.0F * (f_235_ - f_233_);
		((Matrix44Var) this).aFloat3516 = 2.0F * (f_232_ - f_236_);
		((Matrix44Var) this).aFloat3522 = 2.0F * (f_235_ + f_233_);
		((Matrix44Var) this).aFloat3521 = 1.0F - 2.0F * (f_230_ + f_234_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	public void method5259(float f, float f_239_, float f_240_) {
		((Matrix44Var) this).aFloat3519 = f;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3523 = f_239_;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3521 = f_240_;
		((Matrix44Var) this).aFloat3525 = 0.0F;
	}

	void method5260(float f, float f_241_, float f_242_, float f_243_) {
		float f_244_ = f * f;
		float f_245_ = f * f_241_;
		float f_246_ = f * f_242_;
		float f_247_ = f * f_243_;
		float f_248_ = f_241_ * f_241_;
		float f_249_ = f_241_ * f_242_;
		float f_250_ = f_241_ * f_243_;
		float f_251_ = f_242_ * f_242_;
		float f_252_ = f_242_ * f_243_;
		((Matrix44Var) this).aFloat3519 = 1.0F - 2.0F * (f_248_ + f_251_);
		((Matrix44Var) this).aFloat3517 = 2.0F * (f_245_ - f_252_);
		((Matrix44Var) this).aFloat3520 = 2.0F * (f_246_ + f_250_);
		((Matrix44Var) this).aFloat3514 = 2.0F * (f_245_ + f_252_);
		((Matrix44Var) this).aFloat3523 = 1.0F - 2.0F * (f_244_ + f_251_);
		((Matrix44Var) this).aFloat3513 = 2.0F * (f_249_ - f_247_);
		((Matrix44Var) this).aFloat3516 = 2.0F * (f_246_ - f_250_);
		((Matrix44Var) this).aFloat3522 = 2.0F * (f_249_ + f_247_);
		((Matrix44Var) this).aFloat3521 = 1.0F - 2.0F * (f_244_ + f_248_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	public void method5261(Matrix44Var class294_253_, Matrix44Var class294_254_) {
		((Matrix44Var) this).aFloat3519 = ((((Matrix44Var) class294_253_).aFloat3519 * ((Matrix44Var) class294_254_).aFloat3519) + (((Matrix44Var) class294_253_).aFloat3514 * ((Matrix44Var) class294_254_).aFloat3517) + (((Matrix44Var) class294_253_).aFloat3516 * ((Matrix44Var) class294_254_).aFloat3520));
		((Matrix44Var) this).aFloat3514 = ((((Matrix44Var) class294_253_).aFloat3519 * ((Matrix44Var) class294_254_).aFloat3514) + (((Matrix44Var) class294_253_).aFloat3514 * ((Matrix44Var) class294_254_).aFloat3523) + (((Matrix44Var) class294_253_).aFloat3516 * ((Matrix44Var) class294_254_).aFloat3513));
		((Matrix44Var) this).aFloat3516 = ((((Matrix44Var) class294_253_).aFloat3519 * ((Matrix44Var) class294_254_).aFloat3516) + (((Matrix44Var) class294_253_).aFloat3514 * ((Matrix44Var) class294_254_).aFloat3522) + (((Matrix44Var) class294_253_).aFloat3516 * ((Matrix44Var) class294_254_).aFloat3521));
		((Matrix44Var) this).aFloat3517 = ((((Matrix44Var) class294_253_).aFloat3517 * ((Matrix44Var) class294_254_).aFloat3519) + (((Matrix44Var) class294_253_).aFloat3523 * ((Matrix44Var) class294_254_).aFloat3517) + (((Matrix44Var) class294_253_).aFloat3522 * ((Matrix44Var) class294_254_).aFloat3520));
		((Matrix44Var) this).aFloat3523 = ((((Matrix44Var) class294_253_).aFloat3517 * ((Matrix44Var) class294_254_).aFloat3514) + (((Matrix44Var) class294_253_).aFloat3523 * ((Matrix44Var) class294_254_).aFloat3523) + (((Matrix44Var) class294_253_).aFloat3522 * ((Matrix44Var) class294_254_).aFloat3513));
		((Matrix44Var) this).aFloat3522 = ((((Matrix44Var) class294_253_).aFloat3517 * ((Matrix44Var) class294_254_).aFloat3516) + (((Matrix44Var) class294_253_).aFloat3523 * ((Matrix44Var) class294_254_).aFloat3522) + (((Matrix44Var) class294_253_).aFloat3522 * ((Matrix44Var) class294_254_).aFloat3521));
		((Matrix44Var) this).aFloat3520 = ((((Matrix44Var) class294_253_).aFloat3520 * ((Matrix44Var) class294_254_).aFloat3519) + (((Matrix44Var) class294_253_).aFloat3513 * ((Matrix44Var) class294_254_).aFloat3517) + (((Matrix44Var) class294_253_).aFloat3521 * ((Matrix44Var) class294_254_).aFloat3520));
		((Matrix44Var) this).aFloat3513 = ((((Matrix44Var) class294_253_).aFloat3520 * ((Matrix44Var) class294_254_).aFloat3514) + (((Matrix44Var) class294_253_).aFloat3513 * ((Matrix44Var) class294_254_).aFloat3523) + (((Matrix44Var) class294_253_).aFloat3521 * ((Matrix44Var) class294_254_).aFloat3513));
		((Matrix44Var) this).aFloat3521 = ((((Matrix44Var) class294_253_).aFloat3520 * ((Matrix44Var) class294_254_).aFloat3516) + (((Matrix44Var) class294_253_).aFloat3513 * ((Matrix44Var) class294_254_).aFloat3522) + (((Matrix44Var) class294_253_).aFloat3521 * ((Matrix44Var) class294_254_).aFloat3521));
		((Matrix44Var) this).aFloat3515 = ((((Matrix44Var) class294_253_).aFloat3515 * ((Matrix44Var) class294_254_).aFloat3519) + (((Matrix44Var) class294_253_).aFloat3524 * ((Matrix44Var) class294_254_).aFloat3517) + (((Matrix44Var) class294_253_).aFloat3525 * ((Matrix44Var) class294_254_).aFloat3520) + ((Matrix44Var) class294_254_).aFloat3515);
		((Matrix44Var) this).aFloat3524 = ((((Matrix44Var) class294_253_).aFloat3515 * ((Matrix44Var) class294_254_).aFloat3514) + (((Matrix44Var) class294_253_).aFloat3524 * ((Matrix44Var) class294_254_).aFloat3523) + (((Matrix44Var) class294_253_).aFloat3525 * ((Matrix44Var) class294_254_).aFloat3513) + ((Matrix44Var) class294_254_).aFloat3524);
		((Matrix44Var) this).aFloat3525 = ((((Matrix44Var) class294_253_).aFloat3515 * ((Matrix44Var) class294_254_).aFloat3516) + (((Matrix44Var) class294_253_).aFloat3524 * ((Matrix44Var) class294_254_).aFloat3522) + (((Matrix44Var) class294_253_).aFloat3525 * ((Matrix44Var) class294_254_).aFloat3521) + ((Matrix44Var) class294_254_).aFloat3525);
	}

	public void method5262(float f, float f_255_, float f_256_, float f_257_) {
		float f_258_ = (float) Math.cos((double) f_257_);
		float f_259_ = (float) Math.sin((double) f_257_);
		float f_260_ = f_258_ + f * f * (1.0F - f_258_);
		float f_261_ = f_256_ * f_259_ + f_255_ * f * (1.0F - f_258_);
		float f_262_ = -f_255_ * f_259_ + f_256_ * f * (1.0F - f_258_);
		float f_263_ = -f_256_ * f_259_ + f * f_255_ * (1.0F - f_258_);
		float f_264_ = f_258_ + f_255_ * f_255_ * (1.0F - f_258_);
		float f_265_ = f * f_259_ + f_256_ * f_255_ * (1.0F - f_258_);
		float f_266_ = f_255_ * f_259_ + f * f_256_ * (1.0F - f_258_);
		float f_267_ = -f * f_259_ + f_255_ * f_256_ * (1.0F - f_258_);
		float f_268_ = f_258_ + f_256_ * f_256_ * (1.0F - f_258_);
		float f_269_ = ((Matrix44Var) this).aFloat3519;
		float f_270_ = ((Matrix44Var) this).aFloat3514;
		float f_271_ = ((Matrix44Var) this).aFloat3517;
		float f_272_ = ((Matrix44Var) this).aFloat3523;
		float f_273_ = ((Matrix44Var) this).aFloat3520;
		float f_274_ = ((Matrix44Var) this).aFloat3513;
		float f_275_ = ((Matrix44Var) this).aFloat3515;
		float f_276_ = ((Matrix44Var) this).aFloat3524;
		((Matrix44Var) this).aFloat3519 = (f_269_ * f_260_ + f_270_ * f_263_ + ((Matrix44Var) this).aFloat3516 * f_266_);
		((Matrix44Var) this).aFloat3514 = (f_269_ * f_261_ + f_270_ * f_264_ + ((Matrix44Var) this).aFloat3516 * f_267_);
		((Matrix44Var) this).aFloat3516 = (f_269_ * f_262_ + f_270_ * f_265_ + ((Matrix44Var) this).aFloat3516 * f_268_);
		((Matrix44Var) this).aFloat3517 = (f_271_ * f_260_ + f_272_ * f_263_ + ((Matrix44Var) this).aFloat3522 * f_266_);
		((Matrix44Var) this).aFloat3523 = (f_271_ * f_261_ + f_272_ * f_264_ + ((Matrix44Var) this).aFloat3522 * f_267_);
		((Matrix44Var) this).aFloat3522 = (f_271_ * f_262_ + f_272_ * f_265_ + ((Matrix44Var) this).aFloat3522 * f_268_);
		((Matrix44Var) this).aFloat3520 = (f_273_ * f_260_ + f_274_ * f_263_ + ((Matrix44Var) this).aFloat3521 * f_266_);
		((Matrix44Var) this).aFloat3513 = (f_273_ * f_261_ + f_274_ * f_264_ + ((Matrix44Var) this).aFloat3521 * f_267_);
		((Matrix44Var) this).aFloat3521 = (f_273_ * f_262_ + f_274_ * f_265_ + ((Matrix44Var) this).aFloat3521 * f_268_);
		((Matrix44Var) this).aFloat3515 = (f_275_ * f_260_ + f_276_ * f_263_ + ((Matrix44Var) this).aFloat3525 * f_266_);
		((Matrix44Var) this).aFloat3524 = (f_275_ * f_261_ + f_276_ * f_264_ + ((Matrix44Var) this).aFloat3525 * f_267_);
		((Matrix44Var) this).aFloat3525 = (f_275_ * f_262_ + f_276_ * f_265_ + ((Matrix44Var) this).aFloat3525 * f_268_);
	}

	public Matrix44Var(Matrix44Var class294_277_) {
		method5209(class294_277_);
	}

	public Matrix44Var() {
		method5212();
	}

	void method5263(Vector3 class385) {
		method5219(class385.x, class385.y, class385.z);
	}

	public void method5264() {
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
	}

	public void method5265(Matrix44Var class294_278_, Matrix44Var class294_279_) {
		((Matrix44Var) this).aFloat3519 = ((((Matrix44Var) class294_278_).aFloat3519 * ((Matrix44Var) class294_279_).aFloat3519) + (((Matrix44Var) class294_278_).aFloat3514 * ((Matrix44Var) class294_279_).aFloat3517) + (((Matrix44Var) class294_278_).aFloat3516 * ((Matrix44Var) class294_279_).aFloat3520));
		((Matrix44Var) this).aFloat3514 = ((((Matrix44Var) class294_278_).aFloat3519 * ((Matrix44Var) class294_279_).aFloat3514) + (((Matrix44Var) class294_278_).aFloat3514 * ((Matrix44Var) class294_279_).aFloat3523) + (((Matrix44Var) class294_278_).aFloat3516 * ((Matrix44Var) class294_279_).aFloat3513));
		((Matrix44Var) this).aFloat3516 = ((((Matrix44Var) class294_278_).aFloat3519 * ((Matrix44Var) class294_279_).aFloat3516) + (((Matrix44Var) class294_278_).aFloat3514 * ((Matrix44Var) class294_279_).aFloat3522) + (((Matrix44Var) class294_278_).aFloat3516 * ((Matrix44Var) class294_279_).aFloat3521));
		((Matrix44Var) this).aFloat3517 = ((((Matrix44Var) class294_278_).aFloat3517 * ((Matrix44Var) class294_279_).aFloat3519) + (((Matrix44Var) class294_278_).aFloat3523 * ((Matrix44Var) class294_279_).aFloat3517) + (((Matrix44Var) class294_278_).aFloat3522 * ((Matrix44Var) class294_279_).aFloat3520));
		((Matrix44Var) this).aFloat3523 = ((((Matrix44Var) class294_278_).aFloat3517 * ((Matrix44Var) class294_279_).aFloat3514) + (((Matrix44Var) class294_278_).aFloat3523 * ((Matrix44Var) class294_279_).aFloat3523) + (((Matrix44Var) class294_278_).aFloat3522 * ((Matrix44Var) class294_279_).aFloat3513));
		((Matrix44Var) this).aFloat3522 = ((((Matrix44Var) class294_278_).aFloat3517 * ((Matrix44Var) class294_279_).aFloat3516) + (((Matrix44Var) class294_278_).aFloat3523 * ((Matrix44Var) class294_279_).aFloat3522) + (((Matrix44Var) class294_278_).aFloat3522 * ((Matrix44Var) class294_279_).aFloat3521));
		((Matrix44Var) this).aFloat3520 = ((((Matrix44Var) class294_278_).aFloat3520 * ((Matrix44Var) class294_279_).aFloat3519) + (((Matrix44Var) class294_278_).aFloat3513 * ((Matrix44Var) class294_279_).aFloat3517) + (((Matrix44Var) class294_278_).aFloat3521 * ((Matrix44Var) class294_279_).aFloat3520));
		((Matrix44Var) this).aFloat3513 = ((((Matrix44Var) class294_278_).aFloat3520 * ((Matrix44Var) class294_279_).aFloat3514) + (((Matrix44Var) class294_278_).aFloat3513 * ((Matrix44Var) class294_279_).aFloat3523) + (((Matrix44Var) class294_278_).aFloat3521 * ((Matrix44Var) class294_279_).aFloat3513));
		((Matrix44Var) this).aFloat3521 = ((((Matrix44Var) class294_278_).aFloat3520 * ((Matrix44Var) class294_279_).aFloat3516) + (((Matrix44Var) class294_278_).aFloat3513 * ((Matrix44Var) class294_279_).aFloat3522) + (((Matrix44Var) class294_278_).aFloat3521 * ((Matrix44Var) class294_279_).aFloat3521));
		((Matrix44Var) this).aFloat3515 = ((((Matrix44Var) class294_278_).aFloat3515 * ((Matrix44Var) class294_279_).aFloat3519) + (((Matrix44Var) class294_278_).aFloat3524 * ((Matrix44Var) class294_279_).aFloat3517) + (((Matrix44Var) class294_278_).aFloat3525 * ((Matrix44Var) class294_279_).aFloat3520) + ((Matrix44Var) class294_279_).aFloat3515);
		((Matrix44Var) this).aFloat3524 = ((((Matrix44Var) class294_278_).aFloat3515 * ((Matrix44Var) class294_279_).aFloat3514) + (((Matrix44Var) class294_278_).aFloat3524 * ((Matrix44Var) class294_279_).aFloat3523) + (((Matrix44Var) class294_278_).aFloat3525 * ((Matrix44Var) class294_279_).aFloat3513) + ((Matrix44Var) class294_279_).aFloat3524);
		((Matrix44Var) this).aFloat3525 = ((((Matrix44Var) class294_278_).aFloat3515 * ((Matrix44Var) class294_279_).aFloat3516) + (((Matrix44Var) class294_278_).aFloat3524 * ((Matrix44Var) class294_279_).aFloat3522) + (((Matrix44Var) class294_278_).aFloat3525 * ((Matrix44Var) class294_279_).aFloat3521) + ((Matrix44Var) class294_279_).aFloat3525);
	}

	public void method5266(float f, float f_280_, float f_281_) {
		((Matrix44Var) this).aFloat3519 *= f;
		((Matrix44Var) this).aFloat3517 *= f;
		((Matrix44Var) this).aFloat3520 *= f;
		((Matrix44Var) this).aFloat3515 *= f;
		((Matrix44Var) this).aFloat3514 *= f_280_;
		((Matrix44Var) this).aFloat3523 *= f_280_;
		((Matrix44Var) this).aFloat3513 *= f_280_;
		((Matrix44Var) this).aFloat3524 *= f_280_;
		((Matrix44Var) this).aFloat3516 *= f_281_;
		((Matrix44Var) this).aFloat3522 *= f_281_;
		((Matrix44Var) this).aFloat3521 *= f_281_;
		((Matrix44Var) this).aFloat3525 *= f_281_;
	}

	public void method5267(float f, float f_282_, float f_283_) {
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
		((Matrix44Var) this).aFloat3515 = f;
		((Matrix44Var) this).aFloat3524 = f_282_;
		((Matrix44Var) this).aFloat3525 = f_283_;
	}

	public void method5268(float f, float f_284_, float f_285_) {
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
		((Matrix44Var) this).aFloat3515 = f;
		((Matrix44Var) this).aFloat3524 = f_284_;
		((Matrix44Var) this).aFloat3525 = f_285_;
	}

	public void method5269() {
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
	}

	public void method5270(float f, float f_286_, float f_287_) {
		((Matrix44Var) this).aFloat3513 = 0.0F;
		((Matrix44Var) this).aFloat3520 = 0.0F;
		((Matrix44Var) this).aFloat3522 = 0.0F;
		((Matrix44Var) this).aFloat3517 = 0.0F;
		((Matrix44Var) this).aFloat3516 = 0.0F;
		((Matrix44Var) this).aFloat3514 = 0.0F;
		((Matrix44Var) this).aFloat3521 = 1.0F;
		((Matrix44Var) this).aFloat3523 = 1.0F;
		((Matrix44Var) this).aFloat3519 = 1.0F;
		((Matrix44Var) this).aFloat3515 = f;
		((Matrix44Var) this).aFloat3524 = f_286_;
		((Matrix44Var) this).aFloat3525 = f_287_;
	}

	void method5271(Vector3 class385) {
		method5219(class385.x, class385.y, class385.z);
	}

	void method5272(float f, float f_288_, float f_289_, float f_290_) {
		float f_291_ = f * f;
		float f_292_ = f * f_288_;
		float f_293_ = f * f_289_;
		float f_294_ = f * f_290_;
		float f_295_ = f_288_ * f_288_;
		float f_296_ = f_288_ * f_289_;
		float f_297_ = f_288_ * f_290_;
		float f_298_ = f_289_ * f_289_;
		float f_299_ = f_289_ * f_290_;
		((Matrix44Var) this).aFloat3519 = 1.0F - 2.0F * (f_295_ + f_298_);
		((Matrix44Var) this).aFloat3517 = 2.0F * (f_292_ - f_299_);
		((Matrix44Var) this).aFloat3520 = 2.0F * (f_293_ + f_297_);
		((Matrix44Var) this).aFloat3514 = 2.0F * (f_292_ + f_299_);
		((Matrix44Var) this).aFloat3523 = 1.0F - 2.0F * (f_291_ + f_298_);
		((Matrix44Var) this).aFloat3513 = 2.0F * (f_296_ - f_294_);
		((Matrix44Var) this).aFloat3516 = 2.0F * (f_293_ - f_297_);
		((Matrix44Var) this).aFloat3522 = 2.0F * (f_296_ + f_294_);
		((Matrix44Var) this).aFloat3521 = 1.0F - 2.0F * (f_291_ + f_295_);
		((Matrix44Var) this).aFloat3525 = 0.0F;
		((Matrix44Var) this).aFloat3524 = 0.0F;
		((Matrix44Var) this).aFloat3515 = 0.0F;
	}

	public void method5273(Matrix44Var class294_300_) {
		float f = ((Matrix44Var) this).aFloat3519;
		float f_301_ = ((Matrix44Var) this).aFloat3514;
		float f_302_ = ((Matrix44Var) this).aFloat3517;
		float f_303_ = ((Matrix44Var) this).aFloat3523;
		float f_304_ = ((Matrix44Var) this).aFloat3520;
		float f_305_ = ((Matrix44Var) this).aFloat3513;
		float f_306_ = ((Matrix44Var) this).aFloat3515;
		float f_307_ = ((Matrix44Var) this).aFloat3524;
		float f_308_ = ((Matrix44Var) this).aFloat3516;
		float f_309_ = ((Matrix44Var) this).aFloat3522;
		float f_310_ = ((Matrix44Var) this).aFloat3521;
		float f_311_ = ((Matrix44Var) this).aFloat3525;
		((Matrix44Var) this).aFloat3519 = (f * ((Matrix44Var) class294_300_).aFloat3519 + f_301_ * ((Matrix44Var) class294_300_).aFloat3517 + f_308_ * ((Matrix44Var) class294_300_).aFloat3520);
		((Matrix44Var) this).aFloat3514 = (f * ((Matrix44Var) class294_300_).aFloat3514 + f_301_ * ((Matrix44Var) class294_300_).aFloat3523 + f_308_ * ((Matrix44Var) class294_300_).aFloat3513);
		((Matrix44Var) this).aFloat3516 = (f * ((Matrix44Var) class294_300_).aFloat3516 + f_301_ * ((Matrix44Var) class294_300_).aFloat3522 + f_308_ * ((Matrix44Var) class294_300_).aFloat3521);
		((Matrix44Var) this).aFloat3517 = (f_302_ * ((Matrix44Var) class294_300_).aFloat3519 + f_303_ * ((Matrix44Var) class294_300_).aFloat3517 + f_309_ * ((Matrix44Var) class294_300_).aFloat3520);
		((Matrix44Var) this).aFloat3523 = (f_302_ * ((Matrix44Var) class294_300_).aFloat3514 + f_303_ * ((Matrix44Var) class294_300_).aFloat3523 + f_309_ * ((Matrix44Var) class294_300_).aFloat3513);
		((Matrix44Var) this).aFloat3522 = (f_302_ * ((Matrix44Var) class294_300_).aFloat3516 + f_303_ * ((Matrix44Var) class294_300_).aFloat3522 + f_309_ * ((Matrix44Var) class294_300_).aFloat3521);
		((Matrix44Var) this).aFloat3520 = (f_304_ * ((Matrix44Var) class294_300_).aFloat3519 + f_305_ * ((Matrix44Var) class294_300_).aFloat3517 + f_310_ * ((Matrix44Var) class294_300_).aFloat3520);
		((Matrix44Var) this).aFloat3513 = (f_304_ * ((Matrix44Var) class294_300_).aFloat3514 + f_305_ * ((Matrix44Var) class294_300_).aFloat3523 + f_310_ * ((Matrix44Var) class294_300_).aFloat3513);
		((Matrix44Var) this).aFloat3521 = (f_304_ * ((Matrix44Var) class294_300_).aFloat3516 + f_305_ * ((Matrix44Var) class294_300_).aFloat3522 + f_310_ * ((Matrix44Var) class294_300_).aFloat3521);
		((Matrix44Var) this).aFloat3515 = (f_306_ * ((Matrix44Var) class294_300_).aFloat3519 + f_307_ * ((Matrix44Var) class294_300_).aFloat3517 + f_311_ * ((Matrix44Var) class294_300_).aFloat3520 + ((Matrix44Var) class294_300_).aFloat3515);
		((Matrix44Var) this).aFloat3524 = (f_306_ * ((Matrix44Var) class294_300_).aFloat3514 + f_307_ * ((Matrix44Var) class294_300_).aFloat3523 + f_311_ * ((Matrix44Var) class294_300_).aFloat3513 + ((Matrix44Var) class294_300_).aFloat3524);
		((Matrix44Var) this).aFloat3525 = (f_306_ * ((Matrix44Var) class294_300_).aFloat3516 + f_307_ * ((Matrix44Var) class294_300_).aFloat3522 + f_311_ * ((Matrix44Var) class294_300_).aFloat3521 + ((Matrix44Var) class294_300_).aFloat3525);
	}

	public void method5274(Matrix44Var class294_312_) {
		float f = ((Matrix44Var) this).aFloat3519;
		float f_313_ = ((Matrix44Var) this).aFloat3514;
		float f_314_ = ((Matrix44Var) this).aFloat3517;
		float f_315_ = ((Matrix44Var) this).aFloat3523;
		float f_316_ = ((Matrix44Var) this).aFloat3520;
		float f_317_ = ((Matrix44Var) this).aFloat3513;
		float f_318_ = ((Matrix44Var) this).aFloat3515;
		float f_319_ = ((Matrix44Var) this).aFloat3524;
		float f_320_ = ((Matrix44Var) this).aFloat3516;
		float f_321_ = ((Matrix44Var) this).aFloat3522;
		float f_322_ = ((Matrix44Var) this).aFloat3521;
		float f_323_ = ((Matrix44Var) this).aFloat3525;
		((Matrix44Var) this).aFloat3519 = (f * ((Matrix44Var) class294_312_).aFloat3519 + f_313_ * ((Matrix44Var) class294_312_).aFloat3517 + f_320_ * ((Matrix44Var) class294_312_).aFloat3520);
		((Matrix44Var) this).aFloat3514 = (f * ((Matrix44Var) class294_312_).aFloat3514 + f_313_ * ((Matrix44Var) class294_312_).aFloat3523 + f_320_ * ((Matrix44Var) class294_312_).aFloat3513);
		((Matrix44Var) this).aFloat3516 = (f * ((Matrix44Var) class294_312_).aFloat3516 + f_313_ * ((Matrix44Var) class294_312_).aFloat3522 + f_320_ * ((Matrix44Var) class294_312_).aFloat3521);
		((Matrix44Var) this).aFloat3517 = (f_314_ * ((Matrix44Var) class294_312_).aFloat3519 + f_315_ * ((Matrix44Var) class294_312_).aFloat3517 + f_321_ * ((Matrix44Var) class294_312_).aFloat3520);
		((Matrix44Var) this).aFloat3523 = (f_314_ * ((Matrix44Var) class294_312_).aFloat3514 + f_315_ * ((Matrix44Var) class294_312_).aFloat3523 + f_321_ * ((Matrix44Var) class294_312_).aFloat3513);
		((Matrix44Var) this).aFloat3522 = (f_314_ * ((Matrix44Var) class294_312_).aFloat3516 + f_315_ * ((Matrix44Var) class294_312_).aFloat3522 + f_321_ * ((Matrix44Var) class294_312_).aFloat3521);
		((Matrix44Var) this).aFloat3520 = (f_316_ * ((Matrix44Var) class294_312_).aFloat3519 + f_317_ * ((Matrix44Var) class294_312_).aFloat3517 + f_322_ * ((Matrix44Var) class294_312_).aFloat3520);
		((Matrix44Var) this).aFloat3513 = (f_316_ * ((Matrix44Var) class294_312_).aFloat3514 + f_317_ * ((Matrix44Var) class294_312_).aFloat3523 + f_322_ * ((Matrix44Var) class294_312_).aFloat3513);
		((Matrix44Var) this).aFloat3521 = (f_316_ * ((Matrix44Var) class294_312_).aFloat3516 + f_317_ * ((Matrix44Var) class294_312_).aFloat3522 + f_322_ * ((Matrix44Var) class294_312_).aFloat3521);
		((Matrix44Var) this).aFloat3515 = (f_318_ * ((Matrix44Var) class294_312_).aFloat3519 + f_319_ * ((Matrix44Var) class294_312_).aFloat3517 + f_323_ * ((Matrix44Var) class294_312_).aFloat3520 + ((Matrix44Var) class294_312_).aFloat3515);
		((Matrix44Var) this).aFloat3524 = (f_318_ * ((Matrix44Var) class294_312_).aFloat3514 + f_319_ * ((Matrix44Var) class294_312_).aFloat3523 + f_323_ * ((Matrix44Var) class294_312_).aFloat3513 + ((Matrix44Var) class294_312_).aFloat3524);
		((Matrix44Var) this).aFloat3525 = (f_318_ * ((Matrix44Var) class294_312_).aFloat3516 + f_319_ * ((Matrix44Var) class294_312_).aFloat3522 + f_323_ * ((Matrix44Var) class294_312_).aFloat3521 + ((Matrix44Var) class294_312_).aFloat3525);
	}

	public void method5275(Matrix44Var class294_324_, Matrix44Var class294_325_) {
		((Matrix44Var) this).aFloat3519 = ((((Matrix44Var) class294_324_).aFloat3519 * ((Matrix44Var) class294_325_).aFloat3519) + (((Matrix44Var) class294_324_).aFloat3514 * ((Matrix44Var) class294_325_).aFloat3517) + (((Matrix44Var) class294_324_).aFloat3516 * ((Matrix44Var) class294_325_).aFloat3520));
		((Matrix44Var) this).aFloat3514 = ((((Matrix44Var) class294_324_).aFloat3519 * ((Matrix44Var) class294_325_).aFloat3514) + (((Matrix44Var) class294_324_).aFloat3514 * ((Matrix44Var) class294_325_).aFloat3523) + (((Matrix44Var) class294_324_).aFloat3516 * ((Matrix44Var) class294_325_).aFloat3513));
		((Matrix44Var) this).aFloat3516 = ((((Matrix44Var) class294_324_).aFloat3519 * ((Matrix44Var) class294_325_).aFloat3516) + (((Matrix44Var) class294_324_).aFloat3514 * ((Matrix44Var) class294_325_).aFloat3522) + (((Matrix44Var) class294_324_).aFloat3516 * ((Matrix44Var) class294_325_).aFloat3521));
		((Matrix44Var) this).aFloat3517 = ((((Matrix44Var) class294_324_).aFloat3517 * ((Matrix44Var) class294_325_).aFloat3519) + (((Matrix44Var) class294_324_).aFloat3523 * ((Matrix44Var) class294_325_).aFloat3517) + (((Matrix44Var) class294_324_).aFloat3522 * ((Matrix44Var) class294_325_).aFloat3520));
		((Matrix44Var) this).aFloat3523 = ((((Matrix44Var) class294_324_).aFloat3517 * ((Matrix44Var) class294_325_).aFloat3514) + (((Matrix44Var) class294_324_).aFloat3523 * ((Matrix44Var) class294_325_).aFloat3523) + (((Matrix44Var) class294_324_).aFloat3522 * ((Matrix44Var) class294_325_).aFloat3513));
		((Matrix44Var) this).aFloat3522 = ((((Matrix44Var) class294_324_).aFloat3517 * ((Matrix44Var) class294_325_).aFloat3516) + (((Matrix44Var) class294_324_).aFloat3523 * ((Matrix44Var) class294_325_).aFloat3522) + (((Matrix44Var) class294_324_).aFloat3522 * ((Matrix44Var) class294_325_).aFloat3521));
		((Matrix44Var) this).aFloat3520 = ((((Matrix44Var) class294_324_).aFloat3520 * ((Matrix44Var) class294_325_).aFloat3519) + (((Matrix44Var) class294_324_).aFloat3513 * ((Matrix44Var) class294_325_).aFloat3517) + (((Matrix44Var) class294_324_).aFloat3521 * ((Matrix44Var) class294_325_).aFloat3520));
		((Matrix44Var) this).aFloat3513 = ((((Matrix44Var) class294_324_).aFloat3520 * ((Matrix44Var) class294_325_).aFloat3514) + (((Matrix44Var) class294_324_).aFloat3513 * ((Matrix44Var) class294_325_).aFloat3523) + (((Matrix44Var) class294_324_).aFloat3521 * ((Matrix44Var) class294_325_).aFloat3513));
		((Matrix44Var) this).aFloat3521 = ((((Matrix44Var) class294_324_).aFloat3520 * ((Matrix44Var) class294_325_).aFloat3516) + (((Matrix44Var) class294_324_).aFloat3513 * ((Matrix44Var) class294_325_).aFloat3522) + (((Matrix44Var) class294_324_).aFloat3521 * ((Matrix44Var) class294_325_).aFloat3521));
		((Matrix44Var) this).aFloat3515 = ((((Matrix44Var) class294_324_).aFloat3515 * ((Matrix44Var) class294_325_).aFloat3519) + (((Matrix44Var) class294_324_).aFloat3524 * ((Matrix44Var) class294_325_).aFloat3517) + (((Matrix44Var) class294_324_).aFloat3525 * ((Matrix44Var) class294_325_).aFloat3520) + ((Matrix44Var) class294_325_).aFloat3515);
		((Matrix44Var) this).aFloat3524 = ((((Matrix44Var) class294_324_).aFloat3515 * ((Matrix44Var) class294_325_).aFloat3514) + (((Matrix44Var) class294_324_).aFloat3524 * ((Matrix44Var) class294_325_).aFloat3523) + (((Matrix44Var) class294_324_).aFloat3525 * ((Matrix44Var) class294_325_).aFloat3513) + ((Matrix44Var) class294_325_).aFloat3524);
		((Matrix44Var) this).aFloat3525 = ((((Matrix44Var) class294_324_).aFloat3515 * ((Matrix44Var) class294_325_).aFloat3516) + (((Matrix44Var) class294_324_).aFloat3524 * ((Matrix44Var) class294_325_).aFloat3522) + (((Matrix44Var) class294_324_).aFloat3525 * ((Matrix44Var) class294_325_).aFloat3521) + ((Matrix44Var) class294_325_).aFloat3525);
	}

	public void method5276(float f, float f_326_, float f_327_) {
		((Matrix44Var) this).aFloat3519 *= f;
		((Matrix44Var) this).aFloat3517 *= f;
		((Matrix44Var) this).aFloat3520 *= f;
		((Matrix44Var) this).aFloat3515 *= f;
		((Matrix44Var) this).aFloat3514 *= f_326_;
		((Matrix44Var) this).aFloat3523 *= f_326_;
		((Matrix44Var) this).aFloat3513 *= f_326_;
		((Matrix44Var) this).aFloat3524 *= f_326_;
		((Matrix44Var) this).aFloat3516 *= f_327_;
		((Matrix44Var) this).aFloat3522 *= f_327_;
		((Matrix44Var) this).aFloat3521 *= f_327_;
		((Matrix44Var) this).aFloat3525 *= f_327_;
	}

	public void method5277(float f, float f_328_, float f_329_, float[] fs) {
		fs[0] = (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3517 * f_328_ + ((Matrix44Var) this).aFloat3520 * f_329_ + ((Matrix44Var) this).aFloat3515);
		fs[1] = (((Matrix44Var) this).aFloat3514 * f + ((Matrix44Var) this).aFloat3523 * f_328_ + ((Matrix44Var) this).aFloat3513 * f_329_ + ((Matrix44Var) this).aFloat3524);
		fs[2] = (((Matrix44Var) this).aFloat3516 * f + ((Matrix44Var) this).aFloat3522 * f_328_ + ((Matrix44Var) this).aFloat3521 * f_329_ + ((Matrix44Var) this).aFloat3525);
	}

	public void method5278(float f, float f_330_, float f_331_, float[] fs) {
		f -= ((Matrix44Var) this).aFloat3515;
		f_330_ -= ((Matrix44Var) this).aFloat3524;
		f_331_ -= ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_330_ + ((Matrix44Var) this).aFloat3516 * f_331_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_330_ + ((Matrix44Var) this).aFloat3522 * f_331_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_330_ + ((Matrix44Var) this).aFloat3521 * f_331_);
	}

	public void method5279(Class305 class305) {
		float f = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).scalar);
		float f_332_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).i);
		float f_333_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).j);
		float f_334_ = (((Quaternion) class305.aClass381_3594).scalar * ((Quaternion) class305.aClass381_3594).k);
		float f_335_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).i);
		float f_336_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).j);
		float f_337_ = (((Quaternion) class305.aClass381_3594).i * ((Quaternion) class305.aClass381_3594).k);
		float f_338_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).j);
		float f_339_ = (((Quaternion) class305.aClass381_3594).j * ((Quaternion) class305.aClass381_3594).k);
		float f_340_ = (((Quaternion) class305.aClass381_3594).k * ((Quaternion) class305.aClass381_3594).k);
		((Matrix44Var) this).aFloat3519 = f_335_ + f - f_340_ - f_338_;
		((Matrix44Var) this).aFloat3514 = f_336_ + f_334_ + f_336_ + f_334_;
		((Matrix44Var) this).aFloat3516 = f_337_ - f_333_ - f_333_ + f_337_;
		((Matrix44Var) this).aFloat3517 = f_336_ - f_334_ - f_334_ + f_336_;
		((Matrix44Var) this).aFloat3523 = f_338_ + f - f_335_ - f_340_;
		((Matrix44Var) this).aFloat3522 = f_339_ + f_332_ + f_339_ + f_332_;
		((Matrix44Var) this).aFloat3520 = f_337_ + f_333_ + f_337_ + f_333_;
		((Matrix44Var) this).aFloat3513 = f_339_ - f_332_ - f_332_ + f_339_;
		((Matrix44Var) this).aFloat3521 = f_340_ + f - f_338_ - f_335_;
		((Matrix44Var) this).aFloat3515 = class305.aClass385_3595.x;
		((Matrix44Var) this).aFloat3524 = class305.aClass385_3595.y;
		((Matrix44Var) this).aFloat3525 = class305.aClass385_3595.z;
	}

	public void method5280(float f, float f_341_, float f_342_, float[] fs) {
		fs[0] = (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3517 * f_341_ + ((Matrix44Var) this).aFloat3520 * f_342_ + ((Matrix44Var) this).aFloat3515);
		fs[1] = (((Matrix44Var) this).aFloat3514 * f + ((Matrix44Var) this).aFloat3523 * f_341_ + ((Matrix44Var) this).aFloat3513 * f_342_ + ((Matrix44Var) this).aFloat3524);
		fs[2] = (((Matrix44Var) this).aFloat3516 * f + ((Matrix44Var) this).aFloat3522 * f_341_ + ((Matrix44Var) this).aFloat3521 * f_342_ + ((Matrix44Var) this).aFloat3525);
	}

	public void method5281(float[] fs) {
		float f = fs[0] - ((Matrix44Var) this).aFloat3515;
		float f_343_ = fs[1] - ((Matrix44Var) this).aFloat3524;
		float f_344_ = fs[2] - ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_343_ + ((Matrix44Var) this).aFloat3516 * f_344_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_343_ + ((Matrix44Var) this).aFloat3522 * f_344_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_343_ + ((Matrix44Var) this).aFloat3521 * f_344_);
	}

	public void method5282(float[] fs) {
		float f = fs[0] - ((Matrix44Var) this).aFloat3515;
		float f_345_ = fs[1] - ((Matrix44Var) this).aFloat3524;
		float f_346_ = fs[2] - ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_345_ + ((Matrix44Var) this).aFloat3516 * f_346_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_345_ + ((Matrix44Var) this).aFloat3522 * f_346_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_345_ + ((Matrix44Var) this).aFloat3521 * f_346_);
	}

	public void method5283(float[] fs) {
		float f = fs[0] - ((Matrix44Var) this).aFloat3515;
		float f_347_ = fs[1] - ((Matrix44Var) this).aFloat3524;
		float f_348_ = fs[2] - ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_347_ + ((Matrix44Var) this).aFloat3516 * f_348_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_347_ + ((Matrix44Var) this).aFloat3522 * f_348_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_347_ + ((Matrix44Var) this).aFloat3521 * f_348_);
	}

	public void method5284(float[] fs) {
		float f = fs[0];
		float f_349_ = fs[1];
		float f_350_ = fs[2];
		fs[0] = (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_349_ + ((Matrix44Var) this).aFloat3516 * f_350_);
		fs[1] = (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_349_ + ((Matrix44Var) this).aFloat3522 * f_350_);
		fs[2] = (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_349_ + ((Matrix44Var) this).aFloat3521 * f_350_);
	}

	public void method5285(float[] fs) {
		float f = fs[0];
		float f_351_ = fs[1];
		float f_352_ = fs[2];
		fs[0] = (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_351_ + ((Matrix44Var) this).aFloat3516 * f_352_);
		fs[1] = (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_351_ + ((Matrix44Var) this).aFloat3522 * f_352_);
		fs[2] = (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_351_ + ((Matrix44Var) this).aFloat3521 * f_352_);
	}

	public void method5286(float f, float f_353_, float f_354_, float[] fs) {
		f -= ((Matrix44Var) this).aFloat3515;
		f_353_ -= ((Matrix44Var) this).aFloat3524;
		f_354_ -= ((Matrix44Var) this).aFloat3525;
		fs[0] = (float) (int) (((Matrix44Var) this).aFloat3519 * f + ((Matrix44Var) this).aFloat3514 * f_353_ + ((Matrix44Var) this).aFloat3516 * f_354_);
		fs[1] = (float) (int) (((Matrix44Var) this).aFloat3517 * f + ((Matrix44Var) this).aFloat3523 * f_353_ + ((Matrix44Var) this).aFloat3522 * f_354_);
		fs[2] = (float) (int) (((Matrix44Var) this).aFloat3520 * f + ((Matrix44Var) this).aFloat3513 * f_353_ + ((Matrix44Var) this).aFloat3521 * f_354_);
	}

	public void method5287(int i, int i_355_, int i_356_, float f, float f_357_, float f_358_) {
		if (i != 0) {
			float f_359_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_360_ = Class297.aFloatArray3537[i & 0x3fff];
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3519 = 2.0F * f_359_ * (float) i_355_;
			((Matrix44Var) this).aFloat3523 = 2.0F * f_359_ * (float) i_356_;
			((Matrix44Var) this).aFloat3514 = 2.0F * f_360_ * (float) i_355_;
			((Matrix44Var) this).aFloat3517 = -2.0F * f_360_ * (float) i_356_;
			((Matrix44Var) this).aFloat3515 = (float) (2 * i_355_) * (0.5F * f_360_ - 0.5F * f_359_) + f;
			((Matrix44Var) this).aFloat3524 = ((float) (2 * i_356_) * (-0.5F * f_360_ - 0.5F * f_359_) + f_357_);
			((Matrix44Var) this).aFloat3525 = f_358_;
		} else {
			((Matrix44Var) this).aFloat3513 = 0.0F;
			((Matrix44Var) this).aFloat3520 = 0.0F;
			((Matrix44Var) this).aFloat3522 = 0.0F;
			((Matrix44Var) this).aFloat3517 = 0.0F;
			((Matrix44Var) this).aFloat3516 = 0.0F;
			((Matrix44Var) this).aFloat3514 = 0.0F;
			((Matrix44Var) this).aFloat3519 = (float) (2 * i_355_);
			((Matrix44Var) this).aFloat3523 = (float) (2 * i_356_);
			((Matrix44Var) this).aFloat3521 = 1.0F;
			((Matrix44Var) this).aFloat3515 = f - (float) i_355_;
			((Matrix44Var) this).aFloat3524 = f_357_ - (float) i_356_;
			((Matrix44Var) this).aFloat3525 = f_358_;
		}
	}

	public float[] method5288(float[] fs) {
		fs[0] = ((Matrix44Var) this).aFloat3515;
		fs[1] = ((Matrix44Var) this).aFloat3524;
		fs[2] = ((Matrix44Var) this).aFloat3525;
		return fs;
	}

	public float[] method5289(float[] fs) {
		fs[0] = ((Matrix44Var) this).aFloat3515;
		fs[1] = ((Matrix44Var) this).aFloat3524;
		fs[2] = ((Matrix44Var) this).aFloat3525;
		return fs;
	}
}
