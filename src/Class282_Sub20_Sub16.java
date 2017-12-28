/* Class282_Sub20_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub20_Sub16 extends Class282_Sub20 {
	static final int anInt9840 = 1;
	static final boolean aBool9841 = false;
	int anInt9842 = -131821577;
	int anInt9843 = -24125921;

	void method12335(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub16) this).anInt9842 = class282_sub35.readUnsignedByte() * -131821577;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub16) this).anInt9843 = class282_sub35.readUnsignedByte() * -24125921;
			break;
		}
	}

	int[] method12319(int i, int i_0_) {
		int[] is = aClass320_7667.method5721(i, -937795728);
		if (aClass320_7667.aBool3722) {
			int i_1_ = (((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + 1);
			int i_2_ = 65536 / i_1_;
			int i_3_ = (((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + ((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + 1);
			int i_4_ = 65536 / i_3_;
			int[][] is_5_ = new int[i_1_][];
			for (int i_6_ = i - (((Class282_Sub20_Sub16) this).anInt9843 * -218358305); (i_6_ <= ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + i); i_6_++) {
				int[] is_7_ = method12317(0, i_6_ & 543225399 * Class316.anInt3673, 1959050678);
				int[] is_8_ = new int[Class316.anInt3670 * -402153223];
				int i_9_ = 0;
				for (int i_10_ = -(609542599 * ((Class282_Sub20_Sub16) this).anInt9842); (i_10_ <= ((Class282_Sub20_Sub16) this).anInt9842 * 609542599); i_10_++)
					i_9_ += is_7_[i_10_ & Class316.anInt3669 * 1201532175];
				int i_11_ = 0;
				while (i_11_ < -402153223 * Class316.anInt3670) {
					is_8_[i_11_] = i_9_ * i_4_ >> 16;
					i_9_ -= is_7_[(i_11_ - (((Class282_Sub20_Sub16) this).anInt9842) * 609542599 & 1201532175 * Class316.anInt3669)];
					i_11_++;
					i_9_ += is_7_[(609542599 * (((Class282_Sub20_Sub16) this).anInt9842) + i_11_ & 1201532175 * Class316.anInt3669)];
				}
				is_5_[(i_6_ + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 - i)] = is_8_;
			}
			for (int i_12_ = 0; i_12_ < Class316.anInt3670 * -402153223; i_12_++) {
				int i_13_ = 0;
				for (int i_14_ = 0; i_14_ < i_1_; i_14_++)
					i_13_ += is_5_[i_14_][i_12_];
				is[i_12_] = i_13_ * i_2_ >> 16;
			}
		}
		return is;
	}

	int[][] method12320(int i, int i_15_) {
		int[][] is = aClass308_7670.method5463(i, 2090479453);
		if (aClass308_7670.aBool3619) {
			int i_16_ = 1 + (-218358305 * ((Class282_Sub20_Sub16) this).anInt9843 + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305);
			int i_17_ = 65536 / i_16_;
			int i_18_ = 1 + (((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + ((Class282_Sub20_Sub16) this).anInt9842 * 609542599);
			int i_19_ = 65536 / i_18_;
			int[][][] is_20_ = new int[i_16_][][];
			for (int i_21_ = i - (-218358305 * ((Class282_Sub20_Sub16) this).anInt9843); (i_21_ <= i + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305); i_21_++) {
				int[][] is_22_ = method12333(0, i_21_ & 543225399 * Class316.anInt3673, (byte) 3);
				int[][] is_23_ = new int[3][Class316.anInt3670 * -402153223];
				int i_24_ = 0;
				int i_25_ = 0;
				int i_26_ = 0;
				int[] is_27_ = is_22_[0];
				int[] is_28_ = is_22_[1];
				int[] is_29_ = is_22_[2];
				for (int i_30_ = -(609542599 * ((Class282_Sub20_Sub16) this).anInt9842); (i_30_ <= ((Class282_Sub20_Sub16) this).anInt9842 * 609542599); i_30_++) {
					int i_31_ = i_30_ & 1201532175 * Class316.anInt3669;
					i_24_ += is_27_[i_31_];
					i_25_ += is_28_[i_31_];
					i_26_ += is_29_[i_31_];
				}
				int[] is_32_ = is_23_[0];
				int[] is_33_ = is_23_[1];
				int[] is_34_ = is_23_[2];
				int i_35_ = 0;
				while (i_35_ < -402153223 * Class316.anInt3670) {
					is_32_[i_35_] = i_19_ * i_24_ >> 16;
					is_33_[i_35_] = i_19_ * i_25_ >> 16;
					is_34_[i_35_] = i_26_ * i_19_ >> 16;
					int i_36_ = (i_35_ - (609542599 * ((Class282_Sub20_Sub16) this).anInt9842) & 1201532175 * Class316.anInt3669);
					i_24_ -= is_27_[i_36_];
					i_25_ -= is_28_[i_36_];
					i_26_ -= is_29_[i_36_];
					i_35_++;
					i_36_ = (609542599 * ((Class282_Sub20_Sub16) this).anInt9842 + i_35_) & 1201532175 * Class316.anInt3669;
					i_24_ += is_27_[i_36_];
					i_25_ += is_28_[i_36_];
					i_26_ += is_29_[i_36_];
				}
				is_20_[(((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + i_21_ - i)] = is_23_;
			}
			int[] is_37_ = is[0];
			int[] is_38_ = is[1];
			int[] is_39_ = is[2];
			for (int i_40_ = 0; i_40_ < Class316.anInt3670 * -402153223; i_40_++) {
				int i_41_ = 0;
				int i_42_ = 0;
				int i_43_ = 0;
				for (int i_44_ = 0; i_44_ < i_16_; i_44_++) {
					int[][] is_45_ = is_20_[i_44_];
					i_41_ += is_45_[0][i_40_];
					i_42_ += is_45_[1][i_40_];
					i_43_ += is_45_[2][i_40_];
				}
				is_37_[i_40_] = i_41_ * i_17_ >> 16;
				is_38_[i_40_] = i_17_ * i_42_ >> 16;
				is_39_[i_40_] = i_17_ * i_43_ >> 16;
			}
		}
		return is;
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_46_) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub16) this).anInt9842 = class282_sub35.readUnsignedByte() * -131821577;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub16) this).anInt9843 = class282_sub35.readUnsignedByte() * -24125921;
			break;
		}
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub16) this).anInt9842 = class282_sub35.readUnsignedByte() * -131821577;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub16) this).anInt9843 = class282_sub35.readUnsignedByte() * -24125921;
			break;
		}
	}

	int[] method12336(int i) {
		int[] is = aClass320_7667.method5721(i, 349131022);
		if (aClass320_7667.aBool3722) {
			int i_47_ = (((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + 1);
			int i_48_ = 65536 / i_47_;
			int i_49_ = (((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + ((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + 1);
			int i_50_ = 65536 / i_49_;
			int[][] is_51_ = new int[i_47_][];
			for (int i_52_ = i - (((Class282_Sub20_Sub16) this).anInt9843 * -218358305); (i_52_ <= ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + i); i_52_++) {
				int[] is_53_ = method12317(0, i_52_ & 543225399 * Class316.anInt3673, 2035750331);
				int[] is_54_ = new int[Class316.anInt3670 * -402153223];
				int i_55_ = 0;
				for (int i_56_ = -(609542599 * ((Class282_Sub20_Sub16) this).anInt9842); (i_56_ <= ((Class282_Sub20_Sub16) this).anInt9842 * 609542599); i_56_++)
					i_55_ += is_53_[i_56_ & Class316.anInt3669 * 1201532175];
				int i_57_ = 0;
				while (i_57_ < -402153223 * Class316.anInt3670) {
					is_54_[i_57_] = i_55_ * i_50_ >> 16;
					i_55_ -= is_53_[(i_57_ - (((Class282_Sub20_Sub16) this).anInt9842) * 609542599 & 1201532175 * Class316.anInt3669)];
					i_57_++;
					i_55_ += is_53_[(609542599 * (((Class282_Sub20_Sub16) this).anInt9842) + i_57_ & 1201532175 * Class316.anInt3669)];
				}
				is_51_[(i_52_ + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 - i)] = is_54_;
			}
			for (int i_58_ = 0; i_58_ < Class316.anInt3670 * -402153223; i_58_++) {
				int i_59_ = 0;
				for (int i_60_ = 0; i_60_ < i_47_; i_60_++)
					i_59_ += is_51_[i_60_][i_58_];
				is[i_58_] = i_59_ * i_48_ >> 16;
			}
		}
		return is;
	}

	int[] method12327(int i) {
		int[] is = aClass320_7667.method5721(i, -1858200438);
		if (aClass320_7667.aBool3722) {
			int i_61_ = (((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + 1);
			int i_62_ = 65536 / i_61_;
			int i_63_ = (((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + ((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + 1);
			int i_64_ = 65536 / i_63_;
			int[][] is_65_ = new int[i_61_][];
			for (int i_66_ = i - (((Class282_Sub20_Sub16) this).anInt9843 * -218358305); (i_66_ <= ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + i); i_66_++) {
				int[] is_67_ = method12317(0, i_66_ & 543225399 * Class316.anInt3673, 2006510003);
				int[] is_68_ = new int[Class316.anInt3670 * -402153223];
				int i_69_ = 0;
				for (int i_70_ = -(609542599 * ((Class282_Sub20_Sub16) this).anInt9842); (i_70_ <= ((Class282_Sub20_Sub16) this).anInt9842 * 609542599); i_70_++)
					i_69_ += is_67_[i_70_ & Class316.anInt3669 * 1201532175];
				int i_71_ = 0;
				while (i_71_ < -402153223 * Class316.anInt3670) {
					is_68_[i_71_] = i_69_ * i_64_ >> 16;
					i_69_ -= is_67_[(i_71_ - (((Class282_Sub20_Sub16) this).anInt9842) * 609542599 & 1201532175 * Class316.anInt3669)];
					i_71_++;
					i_69_ += is_67_[(609542599 * (((Class282_Sub20_Sub16) this).anInt9842) + i_71_ & 1201532175 * Class316.anInt3669)];
				}
				is_65_[(i_66_ + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 - i)] = is_68_;
			}
			for (int i_72_ = 0; i_72_ < Class316.anInt3670 * -402153223; i_72_++) {
				int i_73_ = 0;
				for (int i_74_ = 0; i_74_ < i_61_; i_74_++)
					i_73_ += is_65_[i_74_][i_72_];
				is[i_72_] = i_73_ * i_62_ >> 16;
			}
		}
		return is;
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		switch (i) {
		case 0:
			((Class282_Sub20_Sub16) this).anInt9842 = class282_sub35.readUnsignedByte() * -131821577;
			break;
		case 2:
			aBool7669 = class282_sub35.readUnsignedByte() == 1;
			break;
		case 1:
			((Class282_Sub20_Sub16) this).anInt9843 = class282_sub35.readUnsignedByte() * -24125921;
			break;
		}
	}

	public Class282_Sub20_Sub16() {
		super(1, false);
	}

	int[] method12325(int i) {
		int[] is = aClass320_7667.method5721(i, -206533314);
		if (aClass320_7667.aBool3722) {
			int i_75_ = (((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + 1);
			int i_76_ = 65536 / i_75_;
			int i_77_ = (((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + ((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + 1);
			int i_78_ = 65536 / i_77_;
			int[][] is_79_ = new int[i_75_][];
			for (int i_80_ = i - (((Class282_Sub20_Sub16) this).anInt9843 * -218358305); (i_80_ <= ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + i); i_80_++) {
				int[] is_81_ = method12317(0, i_80_ & 543225399 * Class316.anInt3673, 2126472720);
				int[] is_82_ = new int[Class316.anInt3670 * -402153223];
				int i_83_ = 0;
				for (int i_84_ = -(609542599 * ((Class282_Sub20_Sub16) this).anInt9842); (i_84_ <= ((Class282_Sub20_Sub16) this).anInt9842 * 609542599); i_84_++)
					i_83_ += is_81_[i_84_ & Class316.anInt3669 * 1201532175];
				int i_85_ = 0;
				while (i_85_ < -402153223 * Class316.anInt3670) {
					is_82_[i_85_] = i_83_ * i_78_ >> 16;
					i_83_ -= is_81_[(i_85_ - (((Class282_Sub20_Sub16) this).anInt9842) * 609542599 & 1201532175 * Class316.anInt3669)];
					i_85_++;
					i_83_ += is_81_[(609542599 * (((Class282_Sub20_Sub16) this).anInt9842) + i_85_ & 1201532175 * Class316.anInt3669)];
				}
				is_79_[(i_80_ + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305 - i)] = is_82_;
			}
			for (int i_86_ = 0; i_86_ < Class316.anInt3670 * -402153223; i_86_++) {
				int i_87_ = 0;
				for (int i_88_ = 0; i_88_ < i_75_; i_88_++)
					i_87_ += is_79_[i_88_][i_86_];
				is[i_86_] = i_87_ * i_76_ >> 16;
			}
		}
		return is;
	}

	int[][] method12339(int i) {
		int[][] is = aClass308_7670.method5463(i, 1140100860);
		if (aClass308_7670.aBool3619) {
			int i_89_ = 1 + (-218358305 * ((Class282_Sub20_Sub16) this).anInt9843 + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305);
			int i_90_ = 65536 / i_89_;
			int i_91_ = 1 + (((Class282_Sub20_Sub16) this).anInt9842 * 609542599 + ((Class282_Sub20_Sub16) this).anInt9842 * 609542599);
			int i_92_ = 65536 / i_91_;
			int[][][] is_93_ = new int[i_89_][][];
			for (int i_94_ = i - (-218358305 * ((Class282_Sub20_Sub16) this).anInt9843); (i_94_ <= i + ((Class282_Sub20_Sub16) this).anInt9843 * -218358305); i_94_++) {
				int[][] is_95_ = method12333(0, i_94_ & 543225399 * Class316.anInt3673, (byte) 3);
				int[][] is_96_ = new int[3][Class316.anInt3670 * -402153223];
				int i_97_ = 0;
				int i_98_ = 0;
				int i_99_ = 0;
				int[] is_100_ = is_95_[0];
				int[] is_101_ = is_95_[1];
				int[] is_102_ = is_95_[2];
				for (int i_103_ = -(609542599 * ((Class282_Sub20_Sub16) this).anInt9842); (i_103_ <= ((Class282_Sub20_Sub16) this).anInt9842 * 609542599); i_103_++) {
					int i_104_ = i_103_ & 1201532175 * Class316.anInt3669;
					i_97_ += is_100_[i_104_];
					i_98_ += is_101_[i_104_];
					i_99_ += is_102_[i_104_];
				}
				int[] is_105_ = is_96_[0];
				int[] is_106_ = is_96_[1];
				int[] is_107_ = is_96_[2];
				int i_108_ = 0;
				while (i_108_ < -402153223 * Class316.anInt3670) {
					is_105_[i_108_] = i_92_ * i_97_ >> 16;
					is_106_[i_108_] = i_92_ * i_98_ >> 16;
					is_107_[i_108_] = i_99_ * i_92_ >> 16;
					int i_109_ = (i_108_ - (609542599 * ((Class282_Sub20_Sub16) this).anInt9842) & 1201532175 * Class316.anInt3669);
					i_97_ -= is_100_[i_109_];
					i_98_ -= is_101_[i_109_];
					i_99_ -= is_102_[i_109_];
					i_108_++;
					i_109_ = (609542599 * ((Class282_Sub20_Sub16) this).anInt9842 + i_108_) & 1201532175 * Class316.anInt3669;
					i_97_ += is_100_[i_109_];
					i_98_ += is_101_[i_109_];
					i_99_ += is_102_[i_109_];
				}
				is_93_[(((Class282_Sub20_Sub16) this).anInt9843 * -218358305 + i_94_ - i)] = is_96_;
			}
			int[] is_110_ = is[0];
			int[] is_111_ = is[1];
			int[] is_112_ = is[2];
			for (int i_113_ = 0; i_113_ < Class316.anInt3670 * -402153223; i_113_++) {
				int i_114_ = 0;
				int i_115_ = 0;
				int i_116_ = 0;
				for (int i_117_ = 0; i_117_ < i_89_; i_117_++) {
					int[][] is_118_ = is_93_[i_117_];
					i_114_ += is_118_[0][i_113_];
					i_115_ += is_118_[1][i_113_];
					i_116_ += is_118_[2][i_113_];
				}
				is_110_[i_113_] = i_114_ * i_90_ >> 16;
				is_111_[i_113_] = i_90_ * i_115_ >> 16;
				is_112_[i_113_] = i_90_ * i_116_ >> 16;
			}
		}
		return is;
	}

	static final void method15307(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		if ((((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]) > (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]))
			((Class527) class527).anInt7020 += ((((Class527) class527).anIntArray7018[301123709 * ((Class527) class527).anInt7020]) * -1051529003);
	}
}
