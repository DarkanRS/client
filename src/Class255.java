/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class255 {
	int[] anIntArray3146;
	int anInt3147;
	int anInt3148;
	int[] anIntArray3149;
	float[][] aFloatArrayArray3150;
	int[] anIntArray3151;

	float[] method4382() {
		return ((Class255) this).aFloatArrayArray3150[method4384()];
	}

	Class255() {
		Class282_Sub18.method12264(24);
		((Class255) this).anInt3147 = Class282_Sub18.method12264(16);
		((Class255) this).anInt3148 = Class282_Sub18.method12264(24);
		((Class255) this).anIntArray3146 = new int[((Class255) this).anInt3148];
		boolean bool = Class282_Sub18.method12263() != 0;
		if (bool) {
			int i = 0;
			int i_0_ = Class282_Sub18.method12264(5) + 1;
			while (i < ((Class255) this).anInt3148) {
				int i_1_ = (Class282_Sub18.method12264(Class159.method2739(((Class255) this).anInt3148 - i, 2063492992)));
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
					((Class255) this).anIntArray3146[i++] = i_0_;
				i_0_++;
			}
		} else {
			boolean bool_3_ = Class282_Sub18.method12263() != 0;
			for (int i = 0; i < ((Class255) this).anInt3148; i++) {
				if (bool_3_ && Class282_Sub18.method12263() == 0)
					((Class255) this).anIntArray3146[i] = 0;
				else
					((Class255) this).anIntArray3146[i] = Class282_Sub18.method12264(5) + 1;
			}
		}
		method4383();
		int i = Class282_Sub18.method12264(4);
		if (i > 0) {
			float f = Class282_Sub18.method12300(Class282_Sub18.method12264(32));
			float f_4_ = Class282_Sub18.method12300(Class282_Sub18.method12264(32));
			int i_5_ = Class282_Sub18.method12264(4) + 1;
			boolean bool_6_ = Class282_Sub18.method12263() != 0;
			int i_7_;
			if (i == 1)
				i_7_ = method4397(((Class255) this).anInt3148, ((Class255) this).anInt3147);
			else
				i_7_ = (((Class255) this).anInt3148 * ((Class255) this).anInt3147);
			((Class255) this).anIntArray3149 = new int[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				((Class255) this).anIntArray3149[i_8_] = Class282_Sub18.method12264(i_5_);
			((Class255) this).aFloatArrayArray3150 = (new float[((Class255) this).anInt3148][((Class255) this).anInt3147]);
			if (i == 1) {
				for (int i_9_ = 0; i_9_ < ((Class255) this).anInt3148; i_9_++) {
					float f_10_ = 0.0F;
					int i_11_ = 1;
					for (int i_12_ = 0; i_12_ < ((Class255) this).anInt3147; i_12_++) {
						int i_13_ = i_9_ / i_11_ % i_7_;
						float f_14_ = (((float) ((Class255) this).anIntArray3149[i_13_] * f_4_) + f + f_10_);
						((Class255) this).aFloatArrayArray3150[i_9_][i_12_] = f_14_;
						if (bool_6_)
							f_10_ = f_14_;
						i_11_ *= i_7_;
					}
				}
			} else {
				for (int i_15_ = 0; i_15_ < ((Class255) this).anInt3148; i_15_++) {
					float f_16_ = 0.0F;
					int i_17_ = i_15_ * ((Class255) this).anInt3147;
					for (int i_18_ = 0; i_18_ < ((Class255) this).anInt3147; i_18_++) {
						float f_19_ = (((float) ((Class255) this).anIntArray3149[i_17_] * f_4_) + f + f_16_);
						((Class255) this).aFloatArrayArray3150[i_15_][i_18_] = f_19_;
						if (bool_6_)
							f_16_ = f_19_;
						i_17_++;
					}
				}
			}
		}
	}

	void method4383() {
		int[] is = new int[((Class255) this).anInt3148];
		int[] is_20_ = new int[33];
		for (int i = 0; i < ((Class255) this).anInt3148; i++) {
			int i_21_ = ((Class255) this).anIntArray3146[i];
			if (i_21_ != 0) {
				int i_22_ = 1 << 32 - i_21_;
				int i_23_ = is_20_[i_21_];
				is[i] = i_23_;
				int i_24_;
				if ((i_23_ & i_22_) != 0)
					i_24_ = is_20_[i_21_ - 1];
				else {
					i_24_ = i_23_ | i_22_;
					for (int i_25_ = i_21_ - 1; i_25_ >= 1; i_25_--) {
						int i_26_ = is_20_[i_25_];
						if (i_26_ != i_23_)
							break;
						int i_27_ = 1 << 32 - i_25_;
						if ((i_26_ & i_27_) != 0) {
							is_20_[i_25_] = is_20_[i_25_ - 1];
							break;
						}
						is_20_[i_25_] = i_26_ | i_27_;
					}
				}
				is_20_[i_21_] = i_24_;
				for (int i_28_ = i_21_ + 1; i_28_ <= 32; i_28_++) {
					int i_29_ = is_20_[i_28_];
					if (i_29_ == i_23_)
						is_20_[i_28_] = i_24_;
				}
			}
		}
		((Class255) this).anIntArray3151 = new int[8];
		int i = 0;
		for (int i_30_ = 0; i_30_ < ((Class255) this).anInt3148; i_30_++) {
			int i_31_ = ((Class255) this).anIntArray3146[i_30_];
			if (i_31_ != 0) {
				int i_32_ = is[i_30_];
				int i_33_ = 0;
				for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
					int i_35_ = -2147483648 >>> i_34_;
					if ((i_32_ & i_35_) != 0) {
						if (((Class255) this).anIntArray3151[i_33_] == 0)
							((Class255) this).anIntArray3151[i_33_] = i;
						i_33_ = ((Class255) this).anIntArray3151[i_33_];
					} else
						i_33_++;
					if (i_33_ >= ((Class255) this).anIntArray3151.length) {
						int[] is_36_ = (new int[((Class255) this).anIntArray3151.length * 2]);
						for (int i_37_ = 0; i_37_ < ((Class255) this).anIntArray3151.length; i_37_++)
							is_36_[i_37_] = ((Class255) this).anIntArray3151[i_37_];
						((Class255) this).anIntArray3151 = is_36_;
					}
					i_35_ >>>= 1;
				}
				((Class255) this).anIntArray3151[i_33_] = i_30_ ^ 0xffffffff;
				if (i_33_ >= i)
					i = i_33_ + 1;
			}
		}
	}

	int method4384() {
		int i;
		for (i = 0; ((Class255) this).anIntArray3151[i] >= 0; i = (Class282_Sub18.method12263() != 0 ? ((Class255) this).anIntArray3151[i] : i + 1)) {
			/* empty */
		}
		return ((Class255) this).anIntArray3151[i] ^ 0xffffffff;
	}

	static int method4385(int i, int i_38_) {
		int i_39_;
		for (i_39_ = (int) Math.pow((double) i, 1.0 / (double) i_38_) + 1; Class277.method4906(i_39_, i_38_, (byte) -8) > i; i_39_--) {
			/* empty */
		}
		return i_39_;
	}

	static int method4386(int i, int i_40_) {
		int i_41_;
		for (i_41_ = (int) Math.pow((double) i, 1.0 / (double) i_40_) + 1; Class277.method4906(i_41_, i_40_, (byte) 16) > i; i_41_--) {
			/* empty */
		}
		return i_41_;
	}

	float[] method4387() {
		return ((Class255) this).aFloatArrayArray3150[method4384()];
	}

	static int method4388(int i, int i_42_) {
		int i_43_;
		for (i_43_ = (int) Math.pow((double) i, 1.0 / (double) i_42_) + 1; Class277.method4906(i_43_, i_42_, (byte) -119) > i; i_43_--) {
			/* empty */
		}
		return i_43_;
	}

	void method4389() {
		int[] is = new int[((Class255) this).anInt3148];
		int[] is_44_ = new int[33];
		for (int i = 0; i < ((Class255) this).anInt3148; i++) {
			int i_45_ = ((Class255) this).anIntArray3146[i];
			if (i_45_ != 0) {
				int i_46_ = 1 << 32 - i_45_;
				int i_47_ = is_44_[i_45_];
				is[i] = i_47_;
				int i_48_;
				if ((i_47_ & i_46_) != 0)
					i_48_ = is_44_[i_45_ - 1];
				else {
					i_48_ = i_47_ | i_46_;
					for (int i_49_ = i_45_ - 1; i_49_ >= 1; i_49_--) {
						int i_50_ = is_44_[i_49_];
						if (i_50_ != i_47_)
							break;
						int i_51_ = 1 << 32 - i_49_;
						if ((i_50_ & i_51_) != 0) {
							is_44_[i_49_] = is_44_[i_49_ - 1];
							break;
						}
						is_44_[i_49_] = i_50_ | i_51_;
					}
				}
				is_44_[i_45_] = i_48_;
				for (int i_52_ = i_45_ + 1; i_52_ <= 32; i_52_++) {
					int i_53_ = is_44_[i_52_];
					if (i_53_ == i_47_)
						is_44_[i_52_] = i_48_;
				}
			}
		}
		((Class255) this).anIntArray3151 = new int[8];
		int i = 0;
		for (int i_54_ = 0; i_54_ < ((Class255) this).anInt3148; i_54_++) {
			int i_55_ = ((Class255) this).anIntArray3146[i_54_];
			if (i_55_ != 0) {
				int i_56_ = is[i_54_];
				int i_57_ = 0;
				for (int i_58_ = 0; i_58_ < i_55_; i_58_++) {
					int i_59_ = -2147483648 >>> i_58_;
					if ((i_56_ & i_59_) != 0) {
						if (((Class255) this).anIntArray3151[i_57_] == 0)
							((Class255) this).anIntArray3151[i_57_] = i;
						i_57_ = ((Class255) this).anIntArray3151[i_57_];
					} else
						i_57_++;
					if (i_57_ >= ((Class255) this).anIntArray3151.length) {
						int[] is_60_ = (new int[((Class255) this).anIntArray3151.length * 2]);
						for (int i_61_ = 0; i_61_ < ((Class255) this).anIntArray3151.length; i_61_++)
							is_60_[i_61_] = ((Class255) this).anIntArray3151[i_61_];
						((Class255) this).anIntArray3151 = is_60_;
					}
					i_59_ >>>= 1;
				}
				((Class255) this).anIntArray3151[i_57_] = i_54_ ^ 0xffffffff;
				if (i_57_ >= i)
					i = i_57_ + 1;
			}
		}
	}

	void method4390() {
		int[] is = new int[((Class255) this).anInt3148];
		int[] is_62_ = new int[33];
		for (int i = 0; i < ((Class255) this).anInt3148; i++) {
			int i_63_ = ((Class255) this).anIntArray3146[i];
			if (i_63_ != 0) {
				int i_64_ = 1 << 32 - i_63_;
				int i_65_ = is_62_[i_63_];
				is[i] = i_65_;
				int i_66_;
				if ((i_65_ & i_64_) != 0)
					i_66_ = is_62_[i_63_ - 1];
				else {
					i_66_ = i_65_ | i_64_;
					for (int i_67_ = i_63_ - 1; i_67_ >= 1; i_67_--) {
						int i_68_ = is_62_[i_67_];
						if (i_68_ != i_65_)
							break;
						int i_69_ = 1 << 32 - i_67_;
						if ((i_68_ & i_69_) != 0) {
							is_62_[i_67_] = is_62_[i_67_ - 1];
							break;
						}
						is_62_[i_67_] = i_68_ | i_69_;
					}
				}
				is_62_[i_63_] = i_66_;
				for (int i_70_ = i_63_ + 1; i_70_ <= 32; i_70_++) {
					int i_71_ = is_62_[i_70_];
					if (i_71_ == i_65_)
						is_62_[i_70_] = i_66_;
				}
			}
		}
		((Class255) this).anIntArray3151 = new int[8];
		int i = 0;
		for (int i_72_ = 0; i_72_ < ((Class255) this).anInt3148; i_72_++) {
			int i_73_ = ((Class255) this).anIntArray3146[i_72_];
			if (i_73_ != 0) {
				int i_74_ = is[i_72_];
				int i_75_ = 0;
				for (int i_76_ = 0; i_76_ < i_73_; i_76_++) {
					int i_77_ = -2147483648 >>> i_76_;
					if ((i_74_ & i_77_) != 0) {
						if (((Class255) this).anIntArray3151[i_75_] == 0)
							((Class255) this).anIntArray3151[i_75_] = i;
						i_75_ = ((Class255) this).anIntArray3151[i_75_];
					} else
						i_75_++;
					if (i_75_ >= ((Class255) this).anIntArray3151.length) {
						int[] is_78_ = (new int[((Class255) this).anIntArray3151.length * 2]);
						for (int i_79_ = 0; i_79_ < ((Class255) this).anIntArray3151.length; i_79_++)
							is_78_[i_79_] = ((Class255) this).anIntArray3151[i_79_];
						((Class255) this).anIntArray3151 = is_78_;
					}
					i_77_ >>>= 1;
				}
				((Class255) this).anIntArray3151[i_75_] = i_72_ ^ 0xffffffff;
				if (i_75_ >= i)
					i = i_75_ + 1;
			}
		}
	}

	void method4391() {
		int[] is = new int[((Class255) this).anInt3148];
		int[] is_80_ = new int[33];
		for (int i = 0; i < ((Class255) this).anInt3148; i++) {
			int i_81_ = ((Class255) this).anIntArray3146[i];
			if (i_81_ != 0) {
				int i_82_ = 1 << 32 - i_81_;
				int i_83_ = is_80_[i_81_];
				is[i] = i_83_;
				int i_84_;
				if ((i_83_ & i_82_) != 0)
					i_84_ = is_80_[i_81_ - 1];
				else {
					i_84_ = i_83_ | i_82_;
					for (int i_85_ = i_81_ - 1; i_85_ >= 1; i_85_--) {
						int i_86_ = is_80_[i_85_];
						if (i_86_ != i_83_)
							break;
						int i_87_ = 1 << 32 - i_85_;
						if ((i_86_ & i_87_) != 0) {
							is_80_[i_85_] = is_80_[i_85_ - 1];
							break;
						}
						is_80_[i_85_] = i_86_ | i_87_;
					}
				}
				is_80_[i_81_] = i_84_;
				for (int i_88_ = i_81_ + 1; i_88_ <= 32; i_88_++) {
					int i_89_ = is_80_[i_88_];
					if (i_89_ == i_83_)
						is_80_[i_88_] = i_84_;
				}
			}
		}
		((Class255) this).anIntArray3151 = new int[8];
		int i = 0;
		for (int i_90_ = 0; i_90_ < ((Class255) this).anInt3148; i_90_++) {
			int i_91_ = ((Class255) this).anIntArray3146[i_90_];
			if (i_91_ != 0) {
				int i_92_ = is[i_90_];
				int i_93_ = 0;
				for (int i_94_ = 0; i_94_ < i_91_; i_94_++) {
					int i_95_ = -2147483648 >>> i_94_;
					if ((i_92_ & i_95_) != 0) {
						if (((Class255) this).anIntArray3151[i_93_] == 0)
							((Class255) this).anIntArray3151[i_93_] = i;
						i_93_ = ((Class255) this).anIntArray3151[i_93_];
					} else
						i_93_++;
					if (i_93_ >= ((Class255) this).anIntArray3151.length) {
						int[] is_96_ = (new int[((Class255) this).anIntArray3151.length * 2]);
						for (int i_97_ = 0; i_97_ < ((Class255) this).anIntArray3151.length; i_97_++)
							is_96_[i_97_] = ((Class255) this).anIntArray3151[i_97_];
						((Class255) this).anIntArray3151 = is_96_;
					}
					i_95_ >>>= 1;
				}
				((Class255) this).anIntArray3151[i_93_] = i_90_ ^ 0xffffffff;
				if (i_93_ >= i)
					i = i_93_ + 1;
			}
		}
	}

	int method4392() {
		int i;
		for (i = 0; ((Class255) this).anIntArray3151[i] >= 0; i = (Class282_Sub18.method12263() != 0 ? ((Class255) this).anIntArray3151[i] : i + 1)) {
			/* empty */
		}
		return ((Class255) this).anIntArray3151[i] ^ 0xffffffff;
	}

	int method4393() {
		int i;
		for (i = 0; ((Class255) this).anIntArray3151[i] >= 0; i = (Class282_Sub18.method12263() != 0 ? ((Class255) this).anIntArray3151[i] : i + 1)) {
			/* empty */
		}
		return ((Class255) this).anIntArray3151[i] ^ 0xffffffff;
	}

	int method4394() {
		int i;
		for (i = 0; ((Class255) this).anIntArray3151[i] >= 0; i = (Class282_Sub18.method12263() != 0 ? ((Class255) this).anIntArray3151[i] : i + 1)) {
			/* empty */
		}
		return ((Class255) this).anIntArray3151[i] ^ 0xffffffff;
	}

	float[] method4395() {
		return ((Class255) this).aFloatArrayArray3150[method4384()];
	}

	float[] method4396() {
		return ((Class255) this).aFloatArrayArray3150[method4384()];
	}

	static int method4397(int i, int i_98_) {
		int i_99_;
		for (i_99_ = (int) Math.pow((double) i, 1.0 / (double) i_98_) + 1; Class277.method4906(i_99_, i_98_, (byte) -59) > i; i_99_--) {
			/* empty */
		}
		return i_99_;
	}

	float[] method4398() {
		return ((Class255) this).aFloatArrayArray3150[method4384()];
	}
}
