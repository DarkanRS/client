/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class265 {
	int anInt3281;
	int anInt3282;
	int anInt3283;
	int anInt3284;
	int anInt3285 = Class282_Sub18.method12264(16);
	int anInt3286;
	int[] anIntArray3287;

	void method4789(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = (((Class255) (Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286])).anInt3147);
			int i_2_ = ((Class265) this).anInt3281 - ((Class265) this).anInt3283;
			int i_3_ = i_2_ / ((Class265) this).anInt3282;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286].method4384();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % ((Class265) this).anInt3284;
							i_6_ /= ((Class265) this).anInt3284;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = (((Class265) this).anIntArray3287[i_9_ * 8 + i_4_]);
						if (i_10_ >= 0) {
							int i_11_ = (((Class265) this).anInt3283 + i_5_ * ((Class265) this).anInt3282);
							Class255 class255 = Class282_Sub18.aClass255Array7615[i_10_];
							if (((Class265) this).anInt3285 == 0) {
								int i_12_ = (((Class265) this).anInt3282 / ((Class255) class255).anInt3147);
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class255.method4382();
									for (int i_15_ = 0; (i_15_ < ((Class255) class255).anInt3147); i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < ((Class265) this).anInt3282) {
									float[] fs_17_ = class255.method4382();
									for (int i_18_ = 0; (i_18_ < ((Class255) class255).anInt3147); i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	void method4790(float[] fs, int i, boolean bool) {
		for (int i_19_ = 0; i_19_ < i; i_19_++)
			fs[i_19_] = 0.0F;
		if (!bool) {
			int i_20_ = (((Class255) (Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286])).anInt3147);
			int i_21_ = ((Class265) this).anInt3281 - ((Class265) this).anInt3283;
			int i_22_ = i_21_ / ((Class265) this).anInt3282;
			int[] is = new int[i_22_];
			for (int i_23_ = 0; i_23_ < 8; i_23_++) {
				int i_24_ = 0;
				while (i_24_ < i_22_) {
					if (i_23_ == 0) {
						int i_25_ = Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286].method4384();
						for (int i_26_ = i_20_ - 1; i_26_ >= 0; i_26_--) {
							if (i_24_ + i_26_ < i_22_)
								is[i_24_ + i_26_] = i_25_ % ((Class265) this).anInt3284;
							i_25_ /= ((Class265) this).anInt3284;
						}
					}
					for (int i_27_ = 0; i_27_ < i_20_; i_27_++) {
						int i_28_ = is[i_24_];
						int i_29_ = (((Class265) this).anIntArray3287[i_28_ * 8 + i_23_]);
						if (i_29_ >= 0) {
							int i_30_ = (((Class265) this).anInt3283 + i_24_ * ((Class265) this).anInt3282);
							Class255 class255 = Class282_Sub18.aClass255Array7615[i_29_];
							if (((Class265) this).anInt3285 == 0) {
								int i_31_ = (((Class265) this).anInt3282 / ((Class255) class255).anInt3147);
								for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
									float[] fs_33_ = class255.method4382();
									for (int i_34_ = 0; (i_34_ < ((Class255) class255).anInt3147); i_34_++)
										fs[i_30_ + i_32_ + i_34_ * i_31_] += fs_33_[i_34_];
								}
							} else {
								int i_35_ = 0;
								while (i_35_ < ((Class265) this).anInt3282) {
									float[] fs_36_ = class255.method4382();
									for (int i_37_ = 0; (i_37_ < ((Class255) class255).anInt3147); i_37_++) {
										fs[i_30_ + i_35_] += fs_36_[i_37_];
										i_35_++;
									}
								}
							}
						}
						if (++i_24_ >= i_22_)
							break;
					}
				}
			}
		}
	}

	void method4791(float[] fs, int i, boolean bool) {
		for (int i_38_ = 0; i_38_ < i; i_38_++)
			fs[i_38_] = 0.0F;
		if (!bool) {
			int i_39_ = (((Class255) (Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286])).anInt3147);
			int i_40_ = ((Class265) this).anInt3281 - ((Class265) this).anInt3283;
			int i_41_ = i_40_ / ((Class265) this).anInt3282;
			int[] is = new int[i_41_];
			for (int i_42_ = 0; i_42_ < 8; i_42_++) {
				int i_43_ = 0;
				while (i_43_ < i_41_) {
					if (i_42_ == 0) {
						int i_44_ = Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286].method4384();
						for (int i_45_ = i_39_ - 1; i_45_ >= 0; i_45_--) {
							if (i_43_ + i_45_ < i_41_)
								is[i_43_ + i_45_] = i_44_ % ((Class265) this).anInt3284;
							i_44_ /= ((Class265) this).anInt3284;
						}
					}
					for (int i_46_ = 0; i_46_ < i_39_; i_46_++) {
						int i_47_ = is[i_43_];
						int i_48_ = (((Class265) this).anIntArray3287[i_47_ * 8 + i_42_]);
						if (i_48_ >= 0) {
							int i_49_ = (((Class265) this).anInt3283 + i_43_ * ((Class265) this).anInt3282);
							Class255 class255 = Class282_Sub18.aClass255Array7615[i_48_];
							if (((Class265) this).anInt3285 == 0) {
								int i_50_ = (((Class265) this).anInt3282 / ((Class255) class255).anInt3147);
								for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
									float[] fs_52_ = class255.method4382();
									for (int i_53_ = 0; (i_53_ < ((Class255) class255).anInt3147); i_53_++)
										fs[i_49_ + i_51_ + i_53_ * i_50_] += fs_52_[i_53_];
								}
							} else {
								int i_54_ = 0;
								while (i_54_ < ((Class265) this).anInt3282) {
									float[] fs_55_ = class255.method4382();
									for (int i_56_ = 0; (i_56_ < ((Class255) class255).anInt3147); i_56_++) {
										fs[i_49_ + i_54_] += fs_55_[i_56_];
										i_54_++;
									}
								}
							}
						}
						if (++i_43_ >= i_41_)
							break;
					}
				}
			}
		}
	}

	Class265() {
		((Class265) this).anInt3283 = Class282_Sub18.method12264(24);
		((Class265) this).anInt3281 = Class282_Sub18.method12264(24);
		((Class265) this).anInt3282 = Class282_Sub18.method12264(24) + 1;
		((Class265) this).anInt3284 = Class282_Sub18.method12264(6) + 1;
		((Class265) this).anInt3286 = Class282_Sub18.method12264(8);
		int[] is = new int[((Class265) this).anInt3284];
		for (int i = 0; i < ((Class265) this).anInt3284; i++) {
			int i_57_ = 0;
			int i_58_ = Class282_Sub18.method12264(3);
			boolean bool = Class282_Sub18.method12263() != 0;
			if (bool)
				i_57_ = Class282_Sub18.method12264(5);
			is[i] = i_57_ << 3 | i_58_;
		}
		((Class265) this).anIntArray3287 = new int[((Class265) this).anInt3284 * 8];
		for (int i = 0; i < ((Class265) this).anInt3284 * 8; i++)
			((Class265) this).anIntArray3287[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class282_Sub18.method12264(8) : -1);
	}

	void method4792(float[] fs, int i, boolean bool) {
		for (int i_59_ = 0; i_59_ < i; i_59_++)
			fs[i_59_] = 0.0F;
		if (!bool) {
			int i_60_ = (((Class255) (Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286])).anInt3147);
			int i_61_ = ((Class265) this).anInt3281 - ((Class265) this).anInt3283;
			int i_62_ = i_61_ / ((Class265) this).anInt3282;
			int[] is = new int[i_62_];
			for (int i_63_ = 0; i_63_ < 8; i_63_++) {
				int i_64_ = 0;
				while (i_64_ < i_62_) {
					if (i_63_ == 0) {
						int i_65_ = Class282_Sub18.aClass255Array7615[((Class265) this).anInt3286].method4384();
						for (int i_66_ = i_60_ - 1; i_66_ >= 0; i_66_--) {
							if (i_64_ + i_66_ < i_62_)
								is[i_64_ + i_66_] = i_65_ % ((Class265) this).anInt3284;
							i_65_ /= ((Class265) this).anInt3284;
						}
					}
					for (int i_67_ = 0; i_67_ < i_60_; i_67_++) {
						int i_68_ = is[i_64_];
						int i_69_ = (((Class265) this).anIntArray3287[i_68_ * 8 + i_63_]);
						if (i_69_ >= 0) {
							int i_70_ = (((Class265) this).anInt3283 + i_64_ * ((Class265) this).anInt3282);
							Class255 class255 = Class282_Sub18.aClass255Array7615[i_69_];
							if (((Class265) this).anInt3285 == 0) {
								int i_71_ = (((Class265) this).anInt3282 / ((Class255) class255).anInt3147);
								for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
									float[] fs_73_ = class255.method4382();
									for (int i_74_ = 0; (i_74_ < ((Class255) class255).anInt3147); i_74_++)
										fs[i_70_ + i_72_ + i_74_ * i_71_] += fs_73_[i_74_];
								}
							} else {
								int i_75_ = 0;
								while (i_75_ < ((Class265) this).anInt3282) {
									float[] fs_76_ = class255.method4382();
									for (int i_77_ = 0; (i_77_ < ((Class255) class255).anInt3147); i_77_++) {
										fs[i_70_ + i_75_] += fs_76_[i_77_];
										i_75_++;
									}
								}
							}
						}
						if (++i_64_ >= i_62_)
							break;
					}
				}
			}
		}
	}
}
