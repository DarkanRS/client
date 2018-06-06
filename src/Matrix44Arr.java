
/* Class384 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public final class Matrix44Arr {
	public static Matrix44Arr aClass384_4666 = new Matrix44Arr();
	public float[] buf;

	public float[] method6517(float[] fs) {
		System.arraycopy(buf, 0, fs, 0, 16);
		return fs;
	}

	public void method6518() {
		buf[0] = 1.0F;
		buf[1] = 0.0F;
		buf[2] = 0.0F;
		buf[3] = 0.0F;
		buf[4] = 0.0F;
		buf[5] = 1.0F;
		buf[6] = 0.0F;
		buf[7] = 0.0F;
		buf[8] = 0.0F;
		buf[9] = 0.0F;
		buf[10] = 1.0F;
		buf[11] = 0.0F;
		buf[12] = 0.0F;
		buf[13] = 0.0F;
		buf[14] = 0.0F;
		buf[15] = 1.0F;
	}

	public void method6520() {
		float f = buf[0];
		float f_0_ = buf[4];
		float f_1_ = buf[8];
		float f_2_ = buf[12];
		float f_3_ = buf[1];
		float f_4_ = buf[5];
		float f_5_ = buf[9];
		float f_6_ = buf[13];
		float f_7_ = buf[2];
		float f_8_ = buf[6];
		float f_9_ = buf[10];
		float f_10_ = buf[14];
		float f_11_ = buf[3];
		float f_12_ = buf[7];
		float f_13_ = buf[11];
		float f_14_ = buf[15];
		buf[0] = f;
		buf[1] = f_0_;
		buf[2] = f_1_;
		buf[3] = f_2_;
		buf[4] = f_3_;
		buf[5] = f_4_;
		buf[6] = f_5_;
		buf[7] = f_6_;
		buf[8] = f_7_;
		buf[9] = f_8_;
		buf[10] = f_9_;
		buf[11] = f_10_;
		buf[12] = f_11_;
		buf[13] = f_12_;
		buf[14] = f_13_;
		buf[15] = f_14_;
	}

	public void method6522(Matrix44Var class294) {
		buf[0] = ((Matrix44Var) class294).aFloat3519;
		buf[1] = ((Matrix44Var) class294).aFloat3514;
		buf[2] = ((Matrix44Var) class294).aFloat3516;
		buf[3] = 0.0F;
		buf[4] = ((Matrix44Var) class294).aFloat3517;
		buf[5] = ((Matrix44Var) class294).aFloat3523;
		buf[6] = ((Matrix44Var) class294).aFloat3522;
		buf[7] = 0.0F;
		buf[8] = ((Matrix44Var) class294).aFloat3520;
		buf[9] = ((Matrix44Var) class294).aFloat3513;
		buf[10] = ((Matrix44Var) class294).aFloat3521;
		buf[11] = 0.0F;
		buf[12] = ((Matrix44Var) class294).aFloat3515;
		buf[13] = ((Matrix44Var) class294).aFloat3524;
		buf[14] = ((Matrix44Var) class294).aFloat3525;
		buf[15] = 1.0F;
	}

	public void method6523(Matrix44Arr class384_17_) {
		float f = (buf[0] * class384_17_.buf[0] + buf[1] * class384_17_.buf[4] + buf[2] * class384_17_.buf[8] + buf[3] * class384_17_.buf[12]);
		float f_18_ = (buf[0] * class384_17_.buf[1] + buf[1] * class384_17_.buf[5] + buf[2] * class384_17_.buf[9] + buf[3] * class384_17_.buf[13]);
		float f_19_ = (buf[0] * class384_17_.buf[2] + buf[1] * class384_17_.buf[6] + buf[2] * class384_17_.buf[10] + buf[3] * class384_17_.buf[14]);
		float f_20_ = (buf[0] * class384_17_.buf[3] + buf[1] * class384_17_.buf[7] + buf[2] * class384_17_.buf[11] + buf[3] * class384_17_.buf[15]);
		float f_21_ = (buf[4] * class384_17_.buf[0] + buf[5] * class384_17_.buf[4] + buf[6] * class384_17_.buf[8] + buf[7] * class384_17_.buf[12]);
		float f_22_ = (buf[4] * class384_17_.buf[1] + buf[5] * class384_17_.buf[5] + buf[6] * class384_17_.buf[9] + buf[7] * class384_17_.buf[13]);
		float f_23_ = (buf[4] * class384_17_.buf[2] + buf[5] * class384_17_.buf[6] + buf[6] * class384_17_.buf[10] + buf[7] * class384_17_.buf[14]);
		float f_24_ = (buf[4] * class384_17_.buf[3] + buf[5] * class384_17_.buf[7] + buf[6] * class384_17_.buf[11] + buf[7] * class384_17_.buf[15]);
		float f_25_ = (buf[8] * class384_17_.buf[0] + buf[9] * class384_17_.buf[4] + buf[10] * class384_17_.buf[8] + buf[11] * class384_17_.buf[12]);
		float f_26_ = (buf[8] * class384_17_.buf[1] + buf[9] * class384_17_.buf[5] + buf[10] * class384_17_.buf[9] + buf[11] * class384_17_.buf[13]);
		float f_27_ = (buf[8] * class384_17_.buf[2] + buf[9] * class384_17_.buf[6] + buf[10] * class384_17_.buf[10] + buf[11] * class384_17_.buf[14]);
		float f_28_ = (buf[8] * class384_17_.buf[3] + buf[9] * class384_17_.buf[7] + buf[10] * class384_17_.buf[11] + buf[11] * class384_17_.buf[15]);
		float f_29_ = (buf[12] * class384_17_.buf[0] + buf[13] * class384_17_.buf[4] + buf[14] * class384_17_.buf[8] + buf[15] * class384_17_.buf[12]);
		float f_30_ = (buf[12] * class384_17_.buf[1] + buf[13] * class384_17_.buf[5] + buf[14] * class384_17_.buf[9] + buf[15] * class384_17_.buf[13]);
		float f_31_ = (buf[12] * class384_17_.buf[2] + buf[13] * class384_17_.buf[6] + buf[14] * class384_17_.buf[10] + buf[15] * class384_17_.buf[14]);
		float f_32_ = (buf[12] * class384_17_.buf[3] + buf[13] * class384_17_.buf[7] + buf[14] * class384_17_.buf[11] + buf[15] * class384_17_.buf[15]);
		buf[0] = f;
		buf[1] = f_18_;
		buf[2] = f_19_;
		buf[3] = f_20_;
		buf[4] = f_21_;
		buf[5] = f_22_;
		buf[6] = f_23_;
		buf[7] = f_24_;
		buf[8] = f_25_;
		buf[9] = f_26_;
		buf[10] = f_27_;
		buf[11] = f_28_;
		buf[12] = f_29_;
		buf[13] = f_30_;
		buf[14] = f_31_;
		buf[15] = f_32_;
	}

	public void method6524() {
		float f = 1.0F / method6612();
		float f_33_ = (buf[5] * buf[10] * buf[15] - buf[5] * buf[11] * buf[14] - buf[6] * buf[9] * buf[15] + buf[6] * buf[11] * buf[13] + buf[7] * buf[9] * buf[14] - (buf[7] * buf[10] * buf[13])) * f;
		float f_34_ = (-buf[1] * buf[10] * buf[15] + buf[1] * buf[11] * buf[14] + buf[2] * buf[9] * buf[15] - buf[2] * buf[11] * buf[13] - buf[3] * buf[9] * buf[14] + (buf[3] * buf[10] * buf[13])) * f;
		float f_35_ = ((buf[1] * buf[6] * buf[15] - buf[1] * buf[7] * buf[14] - buf[2] * buf[5] * buf[15] + buf[2] * buf[7] * buf[13] + buf[3] * buf[5] * buf[14] - (buf[3] * buf[6] * buf[13])) * f);
		float f_36_ = ((-buf[1] * buf[6] * buf[11] + buf[1] * buf[7] * buf[10] + buf[2] * buf[5] * buf[11] - buf[2] * buf[7] * buf[9] - buf[3] * buf[5] * buf[10] + buf[3] * buf[6] * buf[9]) * f);
		float f_37_ = (-buf[4] * buf[10] * buf[15] + buf[4] * buf[11] * buf[14] + buf[6] * buf[8] * buf[15] - buf[6] * buf[11] * buf[12] - buf[7] * buf[8] * buf[14] + (buf[7] * buf[10] * buf[12])) * f;
		float f_38_ = (buf[0] * buf[10] * buf[15] - buf[0] * buf[11] * buf[14] - buf[2] * buf[8] * buf[15] + buf[2] * buf[11] * buf[12] + buf[3] * buf[8] * buf[14] - (buf[3] * buf[10] * buf[12])) * f;
		float f_39_ = ((-buf[0] * buf[6] * buf[15] + buf[0] * buf[7] * buf[14] + buf[2] * buf[4] * buf[15] - buf[2] * buf[7] * buf[12] - buf[3] * buf[4] * buf[14] + (buf[3] * buf[6] * buf[12])) * f);
		float f_40_ = ((buf[0] * buf[6] * buf[11] - buf[0] * buf[7] * buf[10] - buf[2] * buf[4] * buf[11] + buf[2] * buf[7] * buf[8] + buf[3] * buf[4] * buf[10] - buf[3] * buf[6] * buf[8]) * f);
		float f_41_ = (buf[4] * buf[9] * buf[15] - buf[4] * buf[11] * buf[13] - buf[5] * buf[8] * buf[15] + buf[5] * buf[11] * buf[12] + buf[7] * buf[8] * buf[13] - (buf[7] * buf[9] * buf[12])) * f;
		float f_42_ = (-buf[0] * buf[9] * buf[15] + buf[0] * buf[11] * buf[13] + buf[1] * buf[8] * buf[15] - buf[1] * buf[11] * buf[12] - buf[3] * buf[8] * buf[13] + (buf[3] * buf[9] * buf[12])) * f;
		float f_43_ = ((buf[0] * buf[5] * buf[15] - buf[0] * buf[7] * buf[13] - buf[1] * buf[4] * buf[15] + buf[1] * buf[7] * buf[12] + buf[3] * buf[4] * buf[13] - (buf[3] * buf[5] * buf[12])) * f);
		float f_44_ = ((-buf[0] * buf[5] * buf[11] + buf[0] * buf[7] * buf[9] + buf[1] * buf[4] * buf[11] - buf[1] * buf[7] * buf[8] - buf[3] * buf[4] * buf[9] + buf[3] * buf[5] * buf[8]) * f);
		float f_45_ = (-buf[4] * buf[9] * buf[14] + buf[4] * buf[10] * buf[13] + buf[5] * buf[8] * buf[14] - buf[5] * buf[10] * buf[12] - buf[6] * buf[8] * buf[13] + (buf[6] * buf[9] * buf[12])) * f;
		float f_46_ = (buf[0] * buf[9] * buf[14] - buf[0] * buf[10] * buf[13] - buf[1] * buf[8] * buf[14] + buf[1] * buf[10] * buf[12] + buf[2] * buf[8] * buf[13] - (buf[2] * buf[9] * buf[12])) * f;
		float f_47_ = ((-buf[0] * buf[5] * buf[14] + buf[0] * buf[6] * buf[13] + buf[1] * buf[4] * buf[14] - buf[1] * buf[6] * buf[12] - buf[2] * buf[4] * buf[13] + (buf[2] * buf[5] * buf[12])) * f);
		float f_48_ = ((buf[0] * buf[5] * buf[10] - buf[0] * buf[6] * buf[9] - buf[1] * buf[4] * buf[10] + buf[1] * buf[6] * buf[8] + buf[2] * buf[4] * buf[9] - buf[2] * buf[5] * buf[8]) * f);
		buf[0] = f_33_;
		buf[1] = f_34_;
		buf[2] = f_35_;
		buf[3] = f_36_;
		buf[4] = f_37_;
		buf[5] = f_38_;
		buf[6] = f_39_;
		buf[7] = f_40_;
		buf[8] = f_41_;
		buf[9] = f_42_;
		buf[10] = f_43_;
		buf[11] = f_44_;
		buf[12] = f_45_;
		buf[13] = f_46_;
		buf[14] = f_47_;
		buf[15] = f_48_;
	}

	public void method6525(float f, float f_49_, float f_50_, float f_51_) {
		buf[0] = f;
		buf[1] = 0.0F;
		buf[2] = 0.0F;
		buf[3] = 0.0F;
		buf[4] = 0.0F;
		buf[5] = f_49_;
		buf[6] = 0.0F;
		buf[7] = 0.0F;
		buf[8] = 0.0F;
		buf[9] = 0.0F;
		buf[10] = f_50_;
		buf[11] = 0.0F;
		buf[12] = 0.0F;
		buf[13] = 0.0F;
		buf[14] = 0.0F;
		buf[15] = f_51_;
	}

	public boolean method6526() {
		return (buf[0] == 1.0F && buf[1] == 0.0F && buf[2] == 0.0F && buf[3] == 0.0F && buf[4] == 0.0F && buf[5] == 1.0F && buf[6] == 0.0F && buf[7] == 0.0F && buf[8] == 0.0F && buf[9] == 0.0F && buf[10] == 1.0F && buf[11] == 0.0F && buf[12] == 0.0F && buf[13] == 0.0F && buf[14] == 0.0F && buf[15] == 1.0F);
	}

	public void method6527(float f, float f_52_, float f_53_, float[] fs) {
		fs[0] = (buf[0] * f + buf[4] * f_52_ + buf[8] * f_53_ + buf[12]);
		fs[1] = (buf[1] * f + buf[5] * f_52_ + buf[9] * f_53_ + buf[13]);
		fs[2] = (buf[2] * f + buf[6] * f_52_ + buf[10] * f_53_ + buf[14]);
		if (fs.length > 3)
			fs[3] = (buf[3] * f + buf[7] * f_52_ + buf[11] * f_53_ + buf[15]);
	}

	public void method6528(float[] fs) {
		float f = fs[0];
		float f_54_ = fs[1];
		float f_55_ = fs[2];
		fs[0] = (buf[0] * f + buf[4] * f_54_ + buf[8] * f_55_ + buf[12]);
		fs[1] = (buf[1] * f + buf[5] * f_54_ + buf[9] * f_55_ + buf[13]);
		fs[2] = (buf[2] * f + buf[6] * f_54_ + buf[10] * f_55_ + buf[14]);
	}

	public void method6530(float f, float f_58_, float f_59_, float f_60_, float f_61_, float f_62_) {
		buf[0] = 2.0F / (f_58_ - f);
		buf[1] = 0.0F;
		buf[2] = 0.0F;
		buf[3] = 0.0F;
		buf[4] = 0.0F;
		buf[5] = 2.0F / (f_60_ - f_59_);
		buf[6] = 0.0F;
		buf[7] = 0.0F;
		buf[8] = 0.0F;
		buf[9] = 0.0F;
		buf[10] = 2.0F / (f_62_ - f_61_);
		buf[11] = 0.0F;
		buf[12] = -(f_58_ + f) / (f_58_ - f);
		buf[13] = -(f_60_ + f_59_) / (f_60_ - f_59_);
		buf[14] = -(f_62_ + f_61_) / (f_62_ - f_61_);
		buf[15] = 1.0F;
	}

	public void method6531(float f, float f_63_, float f_64_, float f_65_, float f_66_, float f_67_, float f_68_, float f_69_) {
		buf[0] = f_64_ * 2.0F / f_68_;
		buf[1] = 0.0F;
		buf[2] = 0.0F;
		buf[3] = 0.0F;
		buf[4] = 0.0F;
		buf[5] = f_65_ * 2.0F / f_69_;
		buf[6] = 0.0F;
		buf[7] = 0.0F;
		buf[8] = 2.0F * f / f_68_ - 1.0F;
		buf[9] = 2.0F * f_63_ / f_69_ - 1.0F;
		buf[10] = (f_67_ + f_66_) / (f_67_ - f_66_);
		buf[11] = 1.0F;
		buf[12] = 0.0F;
		buf[13] = 0.0F;
		buf[14] = 2.0F * f_67_ * f_66_ / (f_66_ - f_67_);
		buf[15] = 0.0F;
	}

	public void method6532(float f, float f_70_, float f_71_, float f_72_, float f_73_, float f_74_, float f_75_, float f_76_, float f_77_) {
		method6530(-(f * f_77_) / f_71_, f_77_ * (f_75_ - f) / f_71_, -(f_70_ * f_77_) / f_72_, f_77_ * (f_76_ - f_70_) / f_72_, f_73_, f_74_);
	}

	public float method6533() {
		return (-(buf[15] + buf[14]) / (buf[11] + buf[10]));
	}

	public float[] method6534(float[] fs) {
		System.arraycopy(buf, 0, fs, 0, 16);
		fs[3] = 0.0F;
		fs[7] = 0.0F;
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public float[] method6535(float[] fs) {
		float f = buf[3] + buf[0];
		float f_78_ = buf[7] + buf[4];
		float f_79_ = buf[11] + buf[8];
		double d = Math.sqrt((double) (f * f + f_78_ * f_78_ + f_79_ * f_79_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_78_ / d);
		fs[2] = (float) ((double) f_79_ / d);
		fs[3] = (float) ((double) (buf[15] + buf[12]) / d);
		return fs;
	}

	public float[] method6536(float[] fs) {
		float f = buf[3] - buf[0];
		float f_80_ = buf[7] - buf[4];
		float f_81_ = buf[11] - buf[8];
		double d = Math.sqrt((double) (f * f + f_80_ * f_80_ + f_81_ * f_81_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_80_ / d);
		fs[2] = (float) ((double) f_81_ / d);
		fs[3] = (float) ((double) (buf[15] - buf[12]) / d);
		return fs;
	}
	
	public float[] method6538(float[] fs) {
		float f = buf[3] - buf[1];
		float f_82_ = buf[7] - buf[5];
		float f_83_ = buf[11] - buf[9];
		double d = Math.sqrt((double) (f * f + f_82_ * f_82_ + f_83_ * f_83_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_82_ / d);
		fs[2] = (float) ((double) f_83_ / d);
		fs[3] = (float) ((double) (buf[15] - buf[13]) / d);
		return fs;
	}

	public float[] method6539(float[] fs) {
		float f = buf[3] + buf[2];
		float f_84_ = buf[7] + buf[6];
		float f_85_ = buf[11] + buf[10];
		double d = Math.sqrt((double) (f * f + f_84_ * f_84_ + f_85_ * f_85_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_84_ / d);
		fs[2] = (float) ((double) f_85_ / d);
		fs[3] = (float) ((double) (buf[15] + buf[14]) / d);
		return fs;
	}

	public float[] method6540(float[] fs) {
		float f = buf[3] - buf[2];
		float f_86_ = buf[7] - buf[6];
		float f_87_ = buf[11] - buf[10];
		double d = Math.sqrt((double) (f * f + f_86_ * f_86_ + f_87_ * f_87_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_86_ / d);
		fs[2] = (float) ((double) f_87_ / d);
		fs[3] = (float) ((double) (buf[15] - buf[14]) / d);
		return fs;
	}

	public float[] method6544(float[] fs) {
		fs[0] = buf[0];
		fs[1] = buf[1];
		fs[2] = buf[2];
		fs[3] = buf[4];
		fs[4] = buf[5];
		fs[5] = buf[6];
		fs[6] = buf[8];
		fs[7] = buf[9];
		fs[8] = buf[10];
		return fs;
	}

	public float[] method6545(float[] fs) {
		fs[0] = buf[0];
		fs[1] = buf[4];
		fs[2] = buf[8];
		fs[3] = buf[12];
		fs[4] = buf[1];
		fs[5] = buf[5];
		fs[6] = buf[9];
		fs[7] = buf[13];
		fs[8] = buf[2];
		fs[9] = buf[6];
		fs[10] = buf[10];
		fs[11] = buf[14];
		fs[12] = buf[3];
		fs[13] = buf[7];
		fs[14] = buf[11];
		fs[15] = buf[15];
		return fs;
	}

	public float[] method6548(float[] fs) {
		fs[0] = buf[0];
		fs[1] = buf[1];
		fs[2] = 0.0F;
		fs[3] = 0.0F;
		fs[4] = buf[4];
		fs[5] = buf[5];
		fs[6] = 0.0F;
		fs[7] = 0.0F;
		fs[8] = buf[12];
		fs[9] = buf[13];
		fs[10] = buf[14];
		fs[11] = 0.0F;
		fs[12] = 0.0F;
		fs[13] = 0.0F;
		fs[14] = 0.0F;
		fs[15] = 1.0F;
		return fs;
	}

	public void method6549(int i, int i_96_, int i_97_, float f, float f_98_, float f_99_) {
		if (i != 0) {
			float f_100_ = Class297.aFloatArray3536[i & 0x3fff];
			float f_101_ = Class297.aFloatArray3537[i & 0x3fff];
			buf[0] = f_100_ * (float) i_96_;
			buf[5] = f_100_ * (float) i_97_;
			buf[1] = f_101_ * (float) i_96_;
			buf[4] = -f_101_ * (float) i_97_;
			buf[10] = 1.0F;
			float[] fs = buf;
			float[] fs_102_ = buf;
			float[] fs_103_ = buf;
			buf[9] = 0.0F;
			fs_103_[8] = 0.0F;
			fs_102_[6] = 0.0F;
			fs[2] = 0.0F;
		} else {
			buf[0] = (float) i_96_;
			buf[5] = (float) i_97_;
			buf[10] = 1.0F;
			float[] fs = buf;
			float[] fs_104_ = buf;
			float[] fs_105_ = buf;
			float[] fs_106_ = buf;
			float[] fs_107_ = buf;
			buf[9] = 0.0F;
			fs_107_[8] = 0.0F;
			fs_106_[6] = 0.0F;
			fs_105_[4] = 0.0F;
			fs_104_[2] = 0.0F;
			fs[1] = 0.0F;
		}
		float[] fs = buf;
		float[] fs_108_ = buf;
		buf[11] = 0.0F;
		fs_108_[7] = 0.0F;
		fs[3] = 0.0F;
		buf[15] = 1.0F;
		buf[12] = f;
		buf[13] = f_98_;
		buf[14] = f_99_;
	}

	public int hashCode() {
		int i = 1;
		i = 31 * i + Arrays.hashCode(buf);
		return i;
	}

	public float[] method6551(float[] fs) {
		fs[0] = buf[0];
		fs[1] = buf[1];
		fs[2] = buf[4];
		fs[3] = buf[5];
		fs[4] = buf[8];
		fs[5] = buf[9];
		fs[6] = buf[12];
		fs[7] = buf[13];
		return fs;
	}

	public void method6562(Matrix44Arr class384_174_) {
		System.arraycopy(class384_174_.buf, 0, buf, 0, 16);
	}

	public void method6568(Matrix44Arr class384_207_, Matrix44Arr class384_208_) {
		float f = ((class384_207_.buf[0] * class384_208_.buf[0]) + (class384_207_.buf[1] * class384_208_.buf[4]) + (class384_207_.buf[2] * class384_208_.buf[8]) + (class384_207_.buf[3] * class384_208_.buf[12]));
		float f_209_ = ((class384_207_.buf[0] * class384_208_.buf[1]) + (class384_207_.buf[1] * class384_208_.buf[5]) + (class384_207_.buf[2] * class384_208_.buf[9]) + (class384_207_.buf[3] * class384_208_.buf[13]));
		float f_210_ = ((class384_207_.buf[0] * class384_208_.buf[2]) + (class384_207_.buf[1] * class384_208_.buf[6]) + (class384_207_.buf[2] * class384_208_.buf[10]) + (class384_207_.buf[3] * class384_208_.buf[14]));
		float f_211_ = ((class384_207_.buf[0] * class384_208_.buf[3]) + (class384_207_.buf[1] * class384_208_.buf[7]) + (class384_207_.buf[2] * class384_208_.buf[11]) + (class384_207_.buf[3] * class384_208_.buf[15]));
		float f_212_ = ((class384_207_.buf[4] * class384_208_.buf[0]) + (class384_207_.buf[5] * class384_208_.buf[4]) + (class384_207_.buf[6] * class384_208_.buf[8]) + (class384_207_.buf[7] * class384_208_.buf[12]));
		float f_213_ = ((class384_207_.buf[4] * class384_208_.buf[1]) + (class384_207_.buf[5] * class384_208_.buf[5]) + (class384_207_.buf[6] * class384_208_.buf[9]) + (class384_207_.buf[7] * class384_208_.buf[13]));
		float f_214_ = ((class384_207_.buf[4] * class384_208_.buf[2]) + (class384_207_.buf[5] * class384_208_.buf[6]) + (class384_207_.buf[6] * class384_208_.buf[10]) + (class384_207_.buf[7] * class384_208_.buf[14]));
		float f_215_ = ((class384_207_.buf[4] * class384_208_.buf[3]) + (class384_207_.buf[5] * class384_208_.buf[7]) + (class384_207_.buf[6] * class384_208_.buf[11]) + (class384_207_.buf[7] * class384_208_.buf[15]));
		float f_216_ = ((class384_207_.buf[8] * class384_208_.buf[0]) + (class384_207_.buf[9] * class384_208_.buf[4]) + (class384_207_.buf[10] * class384_208_.buf[8]) + (class384_207_.buf[11] * class384_208_.buf[12]));
		float f_217_ = ((class384_207_.buf[8] * class384_208_.buf[1]) + (class384_207_.buf[9] * class384_208_.buf[5]) + (class384_207_.buf[10] * class384_208_.buf[9]) + (class384_207_.buf[11] * class384_208_.buf[13]));
		float f_218_ = ((class384_207_.buf[8] * class384_208_.buf[2]) + (class384_207_.buf[9] * class384_208_.buf[6]) + (class384_207_.buf[10] * class384_208_.buf[10]) + (class384_207_.buf[11] * class384_208_.buf[14]));
		float f_219_ = ((class384_207_.buf[8] * class384_208_.buf[3]) + (class384_207_.buf[9] * class384_208_.buf[7]) + (class384_207_.buf[10] * class384_208_.buf[11]) + (class384_207_.buf[11] * class384_208_.buf[15]));
		float f_220_ = ((class384_207_.buf[12] * class384_208_.buf[0]) + (class384_207_.buf[13] * class384_208_.buf[4]) + (class384_207_.buf[14] * class384_208_.buf[8]) + (class384_207_.buf[15] * class384_208_.buf[12]));
		float f_221_ = ((class384_207_.buf[12] * class384_208_.buf[1]) + (class384_207_.buf[13] * class384_208_.buf[5]) + (class384_207_.buf[14] * class384_208_.buf[9]) + (class384_207_.buf[15] * class384_208_.buf[13]));
		float f_222_ = ((class384_207_.buf[12] * class384_208_.buf[2]) + (class384_207_.buf[13] * class384_208_.buf[6]) + (class384_207_.buf[14] * class384_208_.buf[10]) + (class384_207_.buf[15] * class384_208_.buf[14]));
		float f_223_ = ((class384_207_.buf[12] * class384_208_.buf[3]) + (class384_207_.buf[13] * class384_208_.buf[7]) + (class384_207_.buf[14] * class384_208_.buf[11]) + (class384_207_.buf[15] * class384_208_.buf[15]));
		buf[0] = f;
		buf[1] = f_209_;
		buf[2] = f_210_;
		buf[3] = f_211_;
		buf[4] = f_212_;
		buf[5] = f_213_;
		buf[6] = f_214_;
		buf[7] = f_215_;
		buf[8] = f_216_;
		buf[9] = f_217_;
		buf[10] = f_218_;
		buf[11] = f_219_;
		buf[12] = f_220_;
		buf[13] = f_221_;
		buf[14] = f_222_;
		buf[15] = f_223_;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Matrix44Arr))
			return false;
		Matrix44Arr class384_270_ = (Matrix44Arr) object;
		for (int i = 0; i < 16; i++) {
			if (buf[i] != class384_270_.buf[i])
				return false;
		}
		return true;
	}

	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			for (int i_288_ = 0; i_288_ < 4; i_288_++) {
				if (i_288_ > 0)
					stringbuilder.append("\t");
				stringbuilder.append(buf[i * 4 + i_288_]);
			}
			stringbuilder.append("\n");
		}
		return stringbuilder.toString();
	}

	public float method6587() {
		return ((buf[14] - buf[15]) / (buf[11] - buf[10]));
	}

	public Matrix44Arr(Matrix44Arr class384_289_) {
		buf = new float[16];
		method6562(class384_289_);
	}

	public float[] method6589(float[] fs) {
		fs[0] = buf[0];
		fs[1] = buf[4];
		fs[2] = buf[8];
		fs[3] = buf[12];
		fs[4] = buf[1];
		fs[5] = buf[5];
		fs[6] = buf[9];
		fs[7] = buf[13];
		return fs;
	}

	public Matrix44Arr() {
		buf = new float[16];
		method6518();
	}

	float method6612() {
		return ((buf[0] * buf[5] * buf[10] * buf[15]) - (buf[0] * buf[5] * buf[11] * buf[14]) - (buf[0] * buf[6] * buf[9] * buf[15]) + (buf[0] * buf[6] * buf[11] * buf[13]) + (buf[0] * buf[7] * buf[9] * buf[14])
				- (buf[0] * buf[7] * buf[10] * buf[13]) - (buf[1] * buf[4] * buf[10] * buf[15]) + (buf[1] * buf[4] * buf[11] * buf[14]) + (buf[1] * buf[6] * buf[8] * buf[15]) - (buf[1] * buf[6] * buf[11] * buf[12])
				- (buf[1] * buf[7] * buf[8] * buf[14]) + (buf[1] * buf[7] * buf[10] * buf[12]) + (buf[2] * buf[4] * buf[9] * buf[15]) - (buf[2] * buf[4] * buf[11] * buf[13]) - (buf[2] * buf[5] * buf[8] * buf[15])
				+ (buf[2] * buf[5] * buf[11] * buf[12]) + (buf[2] * buf[7] * buf[8] * buf[13]) - (buf[2] * buf[7] * buf[9] * buf[12]) - (buf[3] * buf[4] * buf[9] * buf[14]) + (buf[3] * buf[4] * buf[10] * buf[13])
				+ (buf[3] * buf[5] * buf[8] * buf[14]) - (buf[3] * buf[5] * buf[10] * buf[12]) - (buf[3] * buf[6] * buf[8] * buf[13]) + (buf[3] * buf[6] * buf[9] * buf[12]));
	}

	public float[] method6613(float[] fs) {
		float f = buf[3] + buf[1];
		float f_347_ = buf[7] + buf[5];
		float f_348_ = buf[11] + buf[9];
		double d = Math.sqrt((double) (f * f + f_347_ * f_347_ + f_348_ * f_348_));
		fs[0] = (float) ((double) f / d);
		fs[1] = (float) ((double) f_347_ / d);
		fs[2] = (float) ((double) f_348_ / d);
		fs[3] = (float) ((double) (buf[15] + buf[13]) / d);
		return fs;
	}

	public void method6614(float f, float f_349_, float f_350_, float[] fs) {
		fs[0] = (buf[0] * f + buf[4] * f_349_ + buf[8] * f_350_);
		fs[1] = (buf[1] * f + buf[5] * f_349_ + buf[9] * f_350_);
		fs[2] = (buf[2] * f + buf[6] * f_349_ + buf[10] * f_350_);
		if (fs.length > 3)
			fs[3] = (buf[3] * f + buf[7] * f_349_ + buf[11] * f_350_);
	}
}
