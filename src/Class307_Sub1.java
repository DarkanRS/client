/* Class307_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class307_Sub1 extends Class307 {
	static float[][] aFloatArrayArray7666 = { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
	int[] anIntArray7667 = new int[512];

	void method3757(int i, int i_0_, int i_1_, int i_2_, float f, float f_3_, float f_4_, float f_5_, float[] fs, int i_6_) {
		int i_7_ = (int) ((float) i_0_ * f - 1.0F);
		i_7_ &= 0xff;
		int i_8_ = (int) ((float) i_1_ * f_3_ - 1.0F);
		i_8_ &= 0xff;
		int i_9_ = (int) ((float) i_2_ * f_4_ - 1.0F);
		i_9_ &= 0xff;
		float f_10_ = (float) i * f_4_;
		int i_11_ = (int) f_10_;
		int i_12_ = i_11_ + 1;
		float f_13_ = f_10_ - (float) i_11_;
		float f_14_ = 1.0F - f_13_;
		float f_15_ = method3762(f_13_);
		i_11_ &= i_9_;
		i_12_ &= i_9_;
		int i_16_ = ((Class307_Sub1) this).anIntArray7667[i_11_];
		int i_17_ = ((Class307_Sub1) this).anIntArray7667[i_12_];
		for (int i_18_ = 0; i_18_ < i_1_; i_18_++) {
			float f_19_ = (float) i_18_ * f_3_;
			int i_20_ = (int) f_19_;
			int i_21_ = i_20_ + 1;
			float f_22_ = f_19_ - (float) i_20_;
			float f_23_ = 1.0F - f_22_;
			float f_24_ = method3762(f_22_);
			i_20_ &= i_8_;
			i_21_ &= i_8_;
			int i_25_ = ((Class307_Sub1) this).anIntArray7667[i_20_ + i_16_];
			int i_26_ = ((Class307_Sub1) this).anIntArray7667[i_21_ + i_16_];
			int i_27_ = ((Class307_Sub1) this).anIntArray7667[i_20_ + i_17_];
			int i_28_ = ((Class307_Sub1) this).anIntArray7667[i_21_ + i_17_];
			for (int i_29_ = 0; i_29_ < i_0_; i_29_++) {
				float f_30_ = (float) i_29_ * f;
				int i_31_ = (int) f_30_;
				int i_32_ = i_31_ + 1;
				float f_33_ = f_30_ - (float) i_31_;
				float f_34_ = 1.0F - f_33_;
				float f_35_ = method3762(f_33_);
				i_31_ &= i_7_;
				i_32_ &= i_7_;
				fs[i_6_++] = f_5_
						* (method3760((method3760(method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_31_ + i_25_]) & 0x7, f_34_, f_23_, f_14_), method3761((((Class307_Sub1) this).anIntArray7667[i_32_ + i_25_]) & 0x7, f_33_, f_23_, f_14_), f_35_), method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_31_ + i_26_]) & 0x7, f_34_, f_22_, f_14_), method3761((((Class307_Sub1) this).anIntArray7667[i_32_ + i_26_]) & 0x7, f_33_, f_22_, f_14_), f_35_), f_24_)),
								(method3760(method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_31_ + i_27_]) & 0x7, f_34_, f_23_, f_13_), method3761((((Class307_Sub1) this).anIntArray7667[i_32_ + i_27_]) & 0x7, f_33_, f_23_, f_13_), f_35_), method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_31_ + i_28_]) & 0x7, f_34_, f_22_, f_13_), method3761((((Class307_Sub1) this).anIntArray7667[i_32_ + i_28_]) & 0x7, f_33_, f_22_, f_13_), f_35_), f_24_)), f_15_));
			}
		}
	}

	static final float method3760(float f, float f_36_, float f_37_) {
		return f + (f_36_ - f) * f_37_;
	}

	static final float method3761(int i, float f, float f_38_, float f_39_) {
		float[] fs = aFloatArrayArray7666[i];
		return fs[0] * f + fs[1] * f_38_ + fs[2] * f_39_;
	}

	public Class307_Sub1(int i) {
		Random random = new Random((long) i);
		for (int i_40_ = 0; i_40_ < 256; i_40_++)
			((Class307_Sub1) this).anIntArray7667[i_40_] = ((Class307_Sub1) this).anIntArray7667[i_40_ + 256] = i_40_;
		for (int i_41_ = 0; i_41_ < 256; i_41_++) {
			int i_42_ = random.nextInt() & 0xff;
			int i_43_ = ((Class307_Sub1) this).anIntArray7667[i_42_];
			((Class307_Sub1) this).anIntArray7667[i_42_] = ((Class307_Sub1) this).anIntArray7667[i_42_ + 256] = ((Class307_Sub1) this).anIntArray7667[i_41_];
			((Class307_Sub1) this).anIntArray7667[i_41_] = ((Class307_Sub1) this).anIntArray7667[i_41_ + 256] = i_43_;
		}
	}

	void method3758(int i, int i_44_, int i_45_, int i_46_, float f, float f_47_, float f_48_, float f_49_, float[] fs, int i_50_) {
		int i_51_ = (int) ((float) i_44_ * f - 1.0F);
		i_51_ &= 0xff;
		int i_52_ = (int) ((float) i_45_ * f_47_ - 1.0F);
		i_52_ &= 0xff;
		int i_53_ = (int) ((float) i_46_ * f_48_ - 1.0F);
		i_53_ &= 0xff;
		float f_54_ = (float) i * f_48_;
		int i_55_ = (int) f_54_;
		int i_56_ = i_55_ + 1;
		float f_57_ = f_54_ - (float) i_55_;
		float f_58_ = 1.0F - f_57_;
		float f_59_ = method3762(f_57_);
		i_55_ &= i_53_;
		i_56_ &= i_53_;
		int i_60_ = ((Class307_Sub1) this).anIntArray7667[i_55_];
		int i_61_ = ((Class307_Sub1) this).anIntArray7667[i_56_];
		for (int i_62_ = 0; i_62_ < i_45_; i_62_++) {
			float f_63_ = (float) i_62_ * f_47_;
			int i_64_ = (int) f_63_;
			int i_65_ = i_64_ + 1;
			float f_66_ = f_63_ - (float) i_64_;
			float f_67_ = 1.0F - f_66_;
			float f_68_ = method3762(f_66_);
			i_64_ &= i_52_;
			i_65_ &= i_52_;
			int i_69_ = ((Class307_Sub1) this).anIntArray7667[i_64_ + i_60_];
			int i_70_ = ((Class307_Sub1) this).anIntArray7667[i_65_ + i_60_];
			int i_71_ = ((Class307_Sub1) this).anIntArray7667[i_64_ + i_61_];
			int i_72_ = ((Class307_Sub1) this).anIntArray7667[i_65_ + i_61_];
			for (int i_73_ = 0; i_73_ < i_44_; i_73_++) {
				float f_74_ = (float) i_73_ * f;
				int i_75_ = (int) f_74_;
				int i_76_ = i_75_ + 1;
				float f_77_ = f_74_ - (float) i_75_;
				float f_78_ = 1.0F - f_77_;
				float f_79_ = method3762(f_77_);
				i_75_ &= i_51_;
				i_76_ &= i_51_;
				fs[i_50_++] = (f_49_ * (method3760((method3760(method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_75_ + i_69_]) & 0x7, f_78_, f_67_, f_58_), method3761((((Class307_Sub1) this).anIntArray7667[i_76_ + i_69_]) & 0x7, f_77_, f_67_, f_58_), f_79_), method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_75_ + i_70_]) & 0x7, f_78_, f_66_, f_58_), method3761((((Class307_Sub1) this).anIntArray7667[i_76_ + i_70_]) & 0x7, f_77_, f_66_, f_58_), f_79_), f_68_)),
						(method3760(method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_75_ + i_71_]) & 0x7, f_78_, f_67_, f_57_), method3761((((Class307_Sub1) this).anIntArray7667[i_76_ + i_71_]) & 0x7, f_77_, f_67_, f_57_), f_79_), method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_75_ + i_72_]) & 0x7, f_78_, f_66_, f_57_), method3761((((Class307_Sub1) this).anIntArray7667[i_76_ + i_72_]) & 0x7, f_77_, f_66_, f_57_), f_79_), f_68_)), f_59_)));
			}
		}
	}

	void method3759(int i, int i_80_, int i_81_, int i_82_, float f, float f_83_, float f_84_, float f_85_, float[] fs, int i_86_) {
		int i_87_ = (int) ((float) i_80_ * f - 1.0F);
		i_87_ &= 0xff;
		int i_88_ = (int) ((float) i_81_ * f_83_ - 1.0F);
		i_88_ &= 0xff;
		int i_89_ = (int) ((float) i_82_ * f_84_ - 1.0F);
		i_89_ &= 0xff;
		float f_90_ = (float) i * f_84_;
		int i_91_ = (int) f_90_;
		int i_92_ = i_91_ + 1;
		float f_93_ = f_90_ - (float) i_91_;
		float f_94_ = 1.0F - f_93_;
		float f_95_ = method3762(f_93_);
		i_91_ &= i_89_;
		i_92_ &= i_89_;
		int i_96_ = ((Class307_Sub1) this).anIntArray7667[i_91_];
		int i_97_ = ((Class307_Sub1) this).anIntArray7667[i_92_];
		for (int i_98_ = 0; i_98_ < i_81_; i_98_++) {
			float f_99_ = (float) i_98_ * f_83_;
			int i_100_ = (int) f_99_;
			int i_101_ = i_100_ + 1;
			float f_102_ = f_99_ - (float) i_100_;
			float f_103_ = 1.0F - f_102_;
			float f_104_ = method3762(f_102_);
			i_100_ &= i_88_;
			i_101_ &= i_88_;
			int i_105_ = ((Class307_Sub1) this).anIntArray7667[i_100_ + i_96_];
			int i_106_ = ((Class307_Sub1) this).anIntArray7667[i_101_ + i_96_];
			int i_107_ = ((Class307_Sub1) this).anIntArray7667[i_100_ + i_97_];
			int i_108_ = ((Class307_Sub1) this).anIntArray7667[i_101_ + i_97_];
			for (int i_109_ = 0; i_109_ < i_80_; i_109_++) {
				float f_110_ = (float) i_109_ * f;
				int i_111_ = (int) f_110_;
				int i_112_ = i_111_ + 1;
				float f_113_ = f_110_ - (float) i_111_;
				float f_114_ = 1.0F - f_113_;
				float f_115_ = method3762(f_113_);
				i_111_ &= i_87_;
				i_112_ &= i_87_;
				fs[i_86_++] = (f_85_ * (method3760(
						(method3760(method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_111_ + i_105_]) & 0x7, f_114_, f_103_, f_94_), method3761((((Class307_Sub1) this).anIntArray7667[i_112_ + i_105_]) & 0x7, f_113_, f_103_, f_94_), f_115_), method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_111_ + i_106_]) & 0x7, f_114_, f_102_, f_94_), method3761((((Class307_Sub1) this).anIntArray7667[i_112_ + i_106_]) & 0x7, f_113_, f_102_, f_94_), f_115_), f_104_)),
						(method3760(method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_111_ + i_107_]) & 0x7, f_114_, f_103_, f_93_), method3761((((Class307_Sub1) this).anIntArray7667[i_112_ + i_107_]) & 0x7, f_113_, f_103_, f_93_), f_115_), method3760(method3761((((Class307_Sub1) this).anIntArray7667[i_111_ + i_108_]) & 0x7, f_114_, f_102_, f_93_), method3761((((Class307_Sub1) this).anIntArray7667[i_112_ + i_108_]) & 0x7, f_113_, f_102_, f_93_), f_115_), f_104_)), f_95_)));
			}
		}
	}

	static final float method3762(float f) {
		return f * f * f * (10.0F + (f * 6.0F - 15.0F) * f);
	}
}
