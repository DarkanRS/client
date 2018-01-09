/* Class282_Sub15_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub15_Sub5_Sub1 extends Class282_Sub15_Sub5 {
	static final int anInt10303 = 128;

	static int method15726(float f, float[] fs, int[] is, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_7_ >>= 8;
		i_1_ <<= 2;
		i_2_ <<= 2;
		i_3_ <<= 2;
		i_4_ <<= 2;
		i_1_ *= 128;
		i_3_ *= 128;
		i_2_ *= 128;
		i_4_ *= 128;
		if ((i_5_ = i_0_ + i_7_ - i) > i_6_)
			i_5_ = i_6_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * (i_5_ - i_0_) * 809781739);
		i_0_ <<= 1;
		i_5_ <<= 1;
		i_5_ -= 6;
		while (i_0_ < i_5_) {
			f = fs[i++];
			is[i_0_++] += f * (float) i_1_;
			i_1_ += i_3_;
			is[i_0_++] += f * (float) i_2_;
			i_2_ += i_4_;
			f = fs[i++];
			is[i_0_++] += f * (float) i_1_;
			i_1_ += i_3_;
			is[i_0_++] += f * (float) i_2_;
			i_2_ += i_4_;
			f = fs[i++];
			is[i_0_++] += f * (float) i_1_;
			i_1_ += i_3_;
			is[i_0_++] += f * (float) i_2_;
			i_2_ += i_4_;
			f = fs[i++];
			is[i_0_++] += f * (float) i_1_;
			i_1_ += i_3_;
			is[i_0_++] += f * (float) i_2_;
			i_2_ += i_4_;
		}
		i_5_ += 6;
		while (i_0_ < i_5_) {
			f = fs[i++];
			is[i_0_++] += f * (float) i_1_;
			i_1_ += i_3_;
			is[i_0_++] += f * (float) i_2_;
			i_2_ += i_4_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = (i_1_ / 128 >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = (i_2_ / 128 >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_0_ >> 1;
	}

	public synchronized void method12230(int[] is, int i, int i_8_) throws IllegalStateException {
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 == 0)
			method12231(i_8_);
		else {
			int i_9_ = ((Class282_Sub15_Sub5_Sub1) this).anInt9844 * -99794975 << 8;
			int i_10_ = (((Class282_Sub15_Sub5_Sub1) this).anInt9856 * -1048610041 << 8);
			int i_11_ = (((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15223() << 8);
			int i_12_ = i_10_ - i_9_;
			if (i_12_ <= 0)
				((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
			int i_13_ = i;
			i_8_ += i;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 >= i_11_) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_11_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
						i_13_ = method15732(is, i_13_, i_9_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_9_)
							return;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_9_ + i_9_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
					for (;;) {
						i_13_ = method15769(is, i_13_, i_10_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_10_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_10_ + i_10_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
						i_13_ = method15732(is, i_13_, i_9_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_9_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_9_ + i_9_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_13_ = method15732(is, i_13_, i_9_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_9_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_10_ - 1 - (i_10_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) % i_12_) * -834443097);
					}
				} else {
					for (;;) {
						i_13_ = method15769(is, i_13_, i_10_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_10_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_9_ + ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) - i_9_) % i_12_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
								i_13_ = (method15732(is, i_13_, i_9_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_9_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_9_ + i_9_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_13_ = (method15769(is, i_13_, i_10_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_10_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_10_ + i_10_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_13_ = (method15732(is, i_13_, i_9_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_9_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_9_ + i_9_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_13_ = (method15732(is, i_13_, i_9_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_9_)
									return;
								int i_14_ = ((i_10_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) / i_12_);
								if (i_14_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 += i_12_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097;
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 += i_12_ * i_14_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_14_ * -485012237;
							}
						} else {
							for (;;) {
								i_13_ = (method15769(is, i_13_, i_10_, i_8_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_10_)
									return;
								int i_15_ = ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 - i_9_) / i_12_;
								if (i_15_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= i_12_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097;
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= i_12_ * i_15_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_15_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0) {
					method15732(is, i_13_, 0, i_8_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15769(is, i_13_, i_11_, i_8_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_11_) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = i_11_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	static int method15727(float f, int i, float[] fs, int[] is, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_23_, float f_24_) {
		i_18_ *= 128;
		i_19_ *= 128;
		if (i_23_ == 0 || (i_20_ = i_17_ + (i_22_ - i_16_ + i_23_ - 257) / i_23_) > i_21_)
			i_20_ = i_21_;
		i_17_ <<= 1;
		i_20_ <<= 1;
		while (i_17_ < i_20_) {
			i = i_16_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_16_ & 0xff);
			is[i_17_++] += (int) (f * (float) i_18_) >> 6;
			is[i_17_++] += (int) (f * (float) i_19_) >> 6;
			i_16_ += i_23_;
		}
		if (i_23_ == 0 || ((i_20_ = (i_17_ >> 1) + (i_22_ - i_16_ + i_23_ - 1) / i_23_) > i_21_))
			i_20_ = i_21_;
		i_20_ <<= 1;
		while (i_17_ < i_20_) {
			f = fs[i_16_ >> 8];
			f = f * 256.0F + (f_24_ - f) * (float) (i_16_ & 0xff);
			is[i_17_++] += (int) (f * (float) i_18_) >> 6;
			is[i_17_++] += (int) (f * (float) i_19_) >> 6;
			i_16_ += i_23_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_16_ * -834443097;
		return i_17_ >> 1;
	}

	static int method15728(float f, int i, float[] fs, int[] is, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_32_, float f_33_) {
		i_27_ *= 128;
		i_28_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_26_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_26_ * 1339372733);
		if (i_32_ == 0 || (i_29_ = i_26_ + (i_31_ - i_25_ + i_32_ - 257) / i_32_) > i_30_)
			i_29_ = i_30_;
		while (i_26_ < i_29_) {
			i = i_25_ >> 8;
			f = fs[i];
			is[i_26_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_25_ & 0xff)) * (float) i_27_) >> 6;
			i_27_ += i_28_;
			i_25_ += i_32_;
		}
		if (i_32_ == 0 || (i_29_ = i_26_ + (i_31_ - i_25_ + i_32_ - 1) / i_32_) > i_30_)
			i_29_ = i_30_;
		while (i_26_ < i_29_) {
			f = fs[i_25_ >> 8];
			is[i_26_++] += (int) ((f * 256.0F + (f_33_ - f) * (float) (i_25_ & 0xff)) * (float) i_27_) >> 6;
			i_27_ += i_28_;
			i_25_ += i_32_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_26_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_26_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_27_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_25_ * -834443097;
		return i_26_;
	}

	static int method15729(float f, int i, float[] fs, int[] is, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_41_, float f_42_) {
		i_36_ *= 128;
		i_37_ *= 128;
		if (i_41_ == 0 || (i_38_ = i_35_ + (i_40_ + 256 - i_34_ + i_41_) / i_41_) > i_39_)
			i_38_ = i_39_;
		i_35_ <<= 1;
		i_38_ <<= 1;
		while (i_35_ < i_38_) {
			i = i_34_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_34_ & 0xff);
			is[i_35_++] += (int) (f * (float) i_36_) >> 6;
			is[i_35_++] += (int) (f * (float) i_37_) >> 6;
			i_34_ += i_41_;
		}
		if (i_41_ == 0 || ((i_38_ = (i_35_ >> 1) + (i_40_ - i_34_ + i_41_) / i_41_) > i_39_))
			i_38_ = i_39_;
		i_38_ <<= 1;
		while (i_35_ < i_38_) {
			f = f_42_ * 256.0F + (fs[i_34_ >> 8] - f_42_) * (float) (i_34_ & 0xff);
			is[i_35_++] += (int) (f * (float) i_36_) >> 6;
			is[i_35_++] += (int) (f * (float) i_37_) >> 6;
			i_34_ += i_41_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_34_ * -834443097;
		return i_35_ >> 1;
	}

	public synchronized void method12240(int[] is, int i, int i_43_) throws IllegalStateException {
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 == 0)
			method12231(i_43_);
		else {
			int i_44_ = ((Class282_Sub15_Sub5_Sub1) this).anInt9844 * -99794975 << 8;
			int i_45_ = (((Class282_Sub15_Sub5_Sub1) this).anInt9856 * -1048610041 << 8);
			int i_46_ = (((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15223() << 8);
			int i_47_ = i_45_ - i_44_;
			if (i_47_ <= 0)
				((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
			int i_48_ = i;
			i_43_ += i;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 >= i_46_) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_46_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
						i_48_ = method15732(is, i_48_, i_44_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_44_)
							return;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_44_ + i_44_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
					for (;;) {
						i_48_ = method15769(is, i_48_, i_45_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_45_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_45_ + i_45_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
						i_48_ = method15732(is, i_48_, i_44_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_44_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_44_ + i_44_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_48_ = method15732(is, i_48_, i_44_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_44_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_45_ - 1 - (i_45_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) % i_47_) * -834443097);
					}
				} else {
					for (;;) {
						i_48_ = method15769(is, i_48_, i_45_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_45_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_44_ + ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) - i_44_) % i_47_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
								i_48_ = (method15732(is, i_48_, i_44_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_44_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_44_ + i_44_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_48_ = (method15769(is, i_48_, i_45_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_45_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_45_ + i_45_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_48_ = (method15732(is, i_48_, i_44_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_44_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_44_ + i_44_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_48_ = (method15732(is, i_48_, i_44_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_44_)
									return;
								int i_49_ = ((i_45_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) / i_47_);
								if (i_49_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 += i_47_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097;
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 += i_47_ * i_49_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_49_ * -485012237;
							}
						} else {
							for (;;) {
								i_48_ = (method15769(is, i_48_, i_45_, i_43_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_45_)
									return;
								int i_50_ = ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 - i_44_) / i_47_;
								if (i_50_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= i_47_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097;
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= i_47_ * i_50_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_50_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0) {
					method15732(is, i_48_, 0, i_43_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15769(is, i_48_, i_46_, i_43_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_46_) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = i_46_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	static int method15730(float f, int i, float[] fs, int[] is, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_58_, float f_59_) {
		i_53_ *= 128;
		i_54_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_52_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_52_ * 1339372733);
		if (i_58_ == 0 || (i_55_ = i_52_ + (i_57_ - i_51_ + i_58_ - 257) / i_58_) > i_56_)
			i_55_ = i_56_;
		while (i_52_ < i_55_) {
			i = i_51_ >> 8;
			f = fs[i];
			is[i_52_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_51_ & 0xff)) * (float) i_53_) >> 6;
			i_53_ += i_54_;
			i_51_ += i_58_;
		}
		if (i_58_ == 0 || (i_55_ = i_52_ + (i_57_ - i_51_ + i_58_ - 1) / i_58_) > i_56_)
			i_55_ = i_56_;
		while (i_52_ < i_55_) {
			f = fs[i_51_ >> 8];
			is[i_52_++] += (int) ((f * 256.0F + (f_59_ - f) * (float) (i_51_ & 0xff)) * (float) i_53_) >> 6;
			i_53_ += i_54_;
			i_51_ += i_58_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_52_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_52_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_53_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_51_ * -834443097;
		return i_52_;
	}

	static int method15731(float f, float[] fs, int[] is, int i, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_65_ >>= 8;
		i_61_ <<= 2;
		i_62_ <<= 2;
		i_61_ *= 128;
		i_62_ *= 128;
		if ((i_63_ = i_60_ + i - (i_65_ - 1)) > i_64_)
			i_63_ = i_64_;
		i_60_ <<= 1;
		i_63_ <<= 1;
		i_63_ -= 6;
		while (i_60_ < i_63_) {
			f = fs[i--];
			is[i_60_++] += f * (float) i_61_;
			is[i_60_++] += f * (float) i_62_;
			f = fs[i--];
			is[i_60_++] += f * (float) i_61_;
			is[i_60_++] += f * (float) i_62_;
			f = fs[i--];
			is[i_60_++] += f * (float) i_61_;
			is[i_60_++] += f * (float) i_62_;
			f = fs[i--];
			is[i_60_++] += f * (float) i_61_;
			is[i_60_++] += f * (float) i_62_;
		}
		i_63_ += 6;
		while (i_60_ < i_63_) {
			f = fs[i--];
			is[i_60_++] += f * (float) i_61_;
			is[i_60_++] += f * (float) i_62_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_60_ >> 1;
	}

	int method15732(int[] is, int i, int i_66_, int i_67_, float f) {
		while (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 > 0) {
			int i_68_ = i + ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447;
			if (i_68_ > i_67_)
				i_68_ = i_67_;
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 += i * 1156515807;
			if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == -256) && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method15739(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub1) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub1) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub1) this).anInt9851) * 241181547, 0, i_68_, i_66_, this);
				else
					i = method15738(((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub1) this).anInt9849) * 1670226395, 0, i_68_, i_66_, this);
			} else if (Class253.aBool3115)
				i = (method15743(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub1) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub1) this).anInt9851 * 241181547, 0, i_68_, i_66_, this,
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			else
				i = (method15742(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub1) this).anInt9849 * 1670226395, 0, i_68_, i_66_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 56))
				return i_67_;
		}
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == -256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15731(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173), 0, i_67_, i_66_, this);
			return (method15774(((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_67_, i_66_, this));
		}
		if (Class253.aBool3115)
			return (method15729(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, 0, i_67_, i_66_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
		return (method15734(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_67_, i_66_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
	}

	static int method15733(float f, int i, float[] fs, int[] is, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_78_, float f_79_) {
		i_71_ *= 128;
		i_73_ *= 128;
		i_72_ *= 128;
		i_74_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_70_ * 809781739);
		if (i_78_ == 0 || (i_75_ = i_70_ + (i_77_ - i_69_ + i_78_ - 257) / i_78_) > i_76_)
			i_75_ = i_76_;
		i_70_ <<= 1;
		i_75_ <<= 1;
		while (i_70_ < i_75_) {
			i = i_69_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_69_ & 0xff);
			is[i_70_++] += (int) (f * (float) i_71_) >> 6;
			i_71_ += i_73_;
			is[i_70_++] += (int) (f * (float) i_72_) >> 6;
			i_72_ += i_74_;
			i_69_ += i_78_;
		}
		if (i_78_ == 0 || ((i_75_ = (i_70_ >> 1) + (i_77_ - i_69_ + i_78_ - 1) / i_78_) > i_76_))
			i_75_ = i_76_;
		i_75_ <<= 1;
		while (i_70_ < i_75_) {
			f = fs[i_69_ >> 8];
			f = f * 256.0F + (f_79_ - f) * (float) (i_69_ & 0xff);
			is[i_70_++] += (int) (f * (float) i_71_) >> 6;
			i_71_ += i_73_;
			is[i_70_++] += (int) (f * (float) i_72_) >> 6;
			i_72_ += i_74_;
			i_69_ += i_78_;
		}
		i_70_ >>= 1;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_70_ * 809781739);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = i_71_ / 128 * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = i_72_ / 128 * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_69_ * -834443097;
		return i_70_;
	}

	static int method15734(float f, int i, float[] fs, int[] is, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_86_, float f_87_) {
		i_82_ *= 128;
		if (i_86_ == 0 || (i_83_ = i_81_ + (i_85_ + 256 - i_80_ + i_86_) / i_86_) > i_84_)
			i_83_ = i_84_;
		while (i_81_ < i_83_) {
			i = i_80_ >> 8;
			f = fs[i - 1];
			is[i_81_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_80_ & 0xff)) * (float) i_82_) >> 6;
			i_80_ += i_86_;
		}
		if (i_86_ == 0 || (i_83_ = i_81_ + (i_85_ - i_80_ + i_86_) / i_86_) > i_84_)
			i_83_ = i_84_;
		f = f_87_;
		while (i_81_ < i_83_) {
			is[i_81_++] += (int) ((f * 256.0F + (fs[i_80_ >> 8] - f) * (float) (i_80_ & 0xff)) * (float) i_82_) >> 6;
			i_80_ += i_86_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_80_ * -834443097;
		return i_81_;
	}

	static int method15735(float f, int i, float[] fs, int[] is, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_95_, float f_96_) {
		i_90_ *= 128;
		i_91_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_89_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_89_ * 1339372733);
		if (i_95_ == 0 || (i_92_ = i_89_ + (i_94_ - i_88_ + i_95_ - 257) / i_95_) > i_93_)
			i_92_ = i_93_;
		while (i_89_ < i_92_) {
			i = i_88_ >> 8;
			f = fs[i];
			is[i_89_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_88_ & 0xff)) * (float) i_90_) >> 6;
			i_90_ += i_91_;
			i_88_ += i_95_;
		}
		if (i_95_ == 0 || (i_92_ = i_89_ + (i_94_ - i_88_ + i_95_ - 1) / i_95_) > i_93_)
			i_92_ = i_93_;
		while (i_89_ < i_92_) {
			f = fs[i_88_ >> 8];
			is[i_89_++] += (int) ((f * 256.0F + (f_96_ - f) * (float) (i_88_ & 0xff)) * (float) i_90_) >> 6;
			i_90_ += i_91_;
			i_88_ += i_95_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_89_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_89_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_90_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_88_ * -834443097;
		return i_89_;
	}

	static int method15736(float f, int i, float[] fs, int[] is, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_103_, float f_104_) {
		i_99_ *= 128;
		if (i_103_ == 0 || ((i_100_ = i_98_ + (i_102_ - i_97_ + i_103_ - 257) / i_103_) > i_101_))
			i_100_ = i_101_;
		while (i_98_ < i_100_) {
			i = i_97_ >> 8;
			f = fs[i];
			is[i_98_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_97_ & 0xff)) * (float) i_99_) >> 6;
			i_97_ += i_103_;
		}
		if (i_103_ == 0 || ((i_100_ = i_98_ + (i_102_ - i_97_ + i_103_ - 1) / i_103_) > i_101_))
			i_100_ = i_101_;
		while (i_98_ < i_100_) {
			f = fs[i_97_ >> 8];
			is[i_98_++] += (int) ((f * 256.0F + (f_104_ - f) * (float) (i_97_ & 0xff)) * (float) i_99_) >> 6;
			i_97_ += i_103_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_97_ * -834443097;
		return i_98_;
	}

	static int method15737(float f, float[] fs, int[] is, int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_112_ >>= 8;
		i_106_ <<= 2;
		i_107_ <<= 2;
		i_108_ <<= 2;
		i_109_ <<= 2;
		i_106_ *= 128;
		i_108_ *= 128;
		i_107_ *= 128;
		i_109_ *= 128;
		if ((i_110_ = i_105_ + i_112_ - i) > i_111_)
			i_110_ = i_111_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * (i_110_ - i_105_) * 809781739);
		i_105_ <<= 1;
		i_110_ <<= 1;
		i_110_ -= 6;
		while (i_105_ < i_110_) {
			f = fs[i++];
			is[i_105_++] += f * (float) i_106_;
			i_106_ += i_108_;
			is[i_105_++] += f * (float) i_107_;
			i_107_ += i_109_;
			f = fs[i++];
			is[i_105_++] += f * (float) i_106_;
			i_106_ += i_108_;
			is[i_105_++] += f * (float) i_107_;
			i_107_ += i_109_;
			f = fs[i++];
			is[i_105_++] += f * (float) i_106_;
			i_106_ += i_108_;
			is[i_105_++] += f * (float) i_107_;
			i_107_ += i_109_;
			f = fs[i++];
			is[i_105_++] += f * (float) i_106_;
			i_106_ += i_108_;
			is[i_105_++] += f * (float) i_107_;
			i_107_ += i_109_;
		}
		i_110_ += 6;
		while (i_105_ < i_110_) {
			f = fs[i++];
			is[i_105_++] += f * (float) i_106_;
			i_106_ += i_108_;
			is[i_105_++] += f * (float) i_107_;
			i_107_ += i_109_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = (i_106_ / 128 >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = (i_107_ / 128 >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_105_ >> 1;
	}

	static int method15738(float[] fs, int[] is, int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_118_ >>= 8;
		i_114_ <<= 2;
		i_115_ <<= 2;
		i_114_ *= 128;
		i_115_ *= 128;
		if ((i_116_ = i_113_ + i - (i_118_ - 1)) > i_117_)
			i_116_ = i_117_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * (i_116_ - i_113_) * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * (i_116_ - i_113_) * 1339372733);
		i_116_ -= 3;
		while (i_113_ < i_116_) {
			is[i_113_++] += fs[i--] * (float) i_114_;
			i_114_ += i_115_;
			is[i_113_++] += fs[i--] * (float) i_114_;
			i_114_ += i_115_;
			is[i_113_++] += fs[i--] * (float) i_114_;
			i_114_ += i_115_;
			is[i_113_++] += fs[i--] * (float) i_114_;
			i_114_ += i_115_;
		}
		i_116_ += 3;
		while (i_113_ < i_116_) {
			is[i_113_++] += fs[i--] * (float) i_114_;
			i_114_ += i_115_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = (i_114_ / 128 >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_113_;
	}

	static int method15739(float f, float[] fs, int[] is, int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_126_ >>= 8;
		i_120_ <<= 2;
		i_121_ <<= 2;
		i_122_ <<= 2;
		i_123_ <<= 2;
		i_120_ *= 128;
		i_122_ *= 128;
		i_121_ *= 128;
		i_123_ *= 128;
		if ((i_124_ = i_119_ + i - (i_126_ - 1)) > i_125_)
			i_124_ = i_125_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * (i_124_ - i_119_) * 809781739);
		i_119_ <<= 1;
		i_124_ <<= 1;
		i_124_ -= 6;
		while (i_119_ < i_124_) {
			f = fs[i--];
			is[i_119_++] += f * (float) i_120_;
			i_120_ += i_122_;
			is[i_119_++] += f * (float) i_121_;
			i_121_ += i_123_;
			f = fs[i--];
			is[i_119_++] += f * (float) i_120_;
			i_120_ += i_122_;
			is[i_119_++] += f * (float) i_121_;
			i_121_ += i_123_;
			f = fs[i--];
			is[i_119_++] += f * (float) i_120_;
			i_120_ += i_122_;
			is[i_119_++] += f * (float) i_121_;
			i_121_ += i_123_;
			f = fs[i--];
			is[i_119_++] += f * (float) i_120_;
			i_120_ += i_122_;
			is[i_119_++] += f * (float) i_121_;
			i_121_ += i_123_;
		}
		i_124_ += 6;
		while (i_119_ < i_124_) {
			f = fs[i--];
			is[i_119_++] += f * (float) i_120_;
			i_120_ += i_122_;
			is[i_119_++] += f * (float) i_121_;
			i_121_ += i_123_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = (i_120_ / 128 >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = (i_121_ / 128 >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_119_ >> 1;
	}

	static int method15740(float[] fs, int[] is, int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_131_ >>= 8;
		i_128_ <<= 2;
		i_128_ *= 128;
		if ((i_129_ = i_127_ + i_131_ - i) > i_130_)
			i_129_ = i_130_;
		i_129_ -= 3;
		while (i_127_ < i_129_) {
			is[i_127_++] += fs[i++] * (float) i_128_;
			is[i_127_++] += fs[i++] * (float) i_128_;
			is[i_127_++] += fs[i++] * (float) i_128_;
			is[i_127_++] += fs[i++] * (float) i_128_;
		}
		i_129_ += 3;
		while (i_127_ < i_129_)
			is[i_127_++] += fs[i++] * (float) i_128_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_127_;
	}

	static int method15741(float f, int i, float[] fs, int[] is, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, int i_140_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_141_, float f_142_) {
		i_134_ *= 128;
		i_136_ *= 128;
		i_135_ *= 128;
		i_137_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_133_ * 809781739);
		if (i_141_ == 0 || ((i_138_ = i_133_ + (i_140_ - i_132_ + i_141_ - 257) / i_141_) > i_139_))
			i_138_ = i_139_;
		i_133_ <<= 1;
		i_138_ <<= 1;
		while (i_133_ < i_138_) {
			i = i_132_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_132_ & 0xff);
			is[i_133_++] += (int) (f * (float) i_134_) >> 6;
			i_134_ += i_136_;
			is[i_133_++] += (int) (f * (float) i_135_) >> 6;
			i_135_ += i_137_;
			i_132_ += i_141_;
		}
		if (i_141_ == 0 || (i_138_ = (i_133_ >> 1) + (i_140_ - i_132_ + i_141_ - 1) / i_141_) > i_139_)
			i_138_ = i_139_;
		i_138_ <<= 1;
		while (i_133_ < i_138_) {
			f = fs[i_132_ >> 8];
			f = f * 256.0F + (f_142_ - f) * (float) (i_132_ & 0xff);
			is[i_133_++] += (int) (f * (float) i_134_) >> 6;
			i_134_ += i_136_;
			is[i_133_++] += (int) (f * (float) i_135_) >> 6;
			i_135_ += i_137_;
			i_132_ += i_141_;
		}
		i_133_ >>= 1;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_133_ * 809781739);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = i_134_ / 128 * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = i_135_ / 128 * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_132_ * -834443097;
		return i_133_;
	}

	static int method15742(float f, int i, float[] fs, int[] is, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_150_, float f_151_) {
		i_145_ *= 128;
		i_146_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_144_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_144_ * 1339372733);
		if (i_150_ == 0 || ((i_147_ = i_144_ + (i_149_ + 256 - i_143_ + i_150_) / i_150_) > i_148_))
			i_147_ = i_148_;
		while (i_144_ < i_147_) {
			i = i_143_ >> 8;
			f = fs[i - 1];
			is[i_144_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_143_ & 0xff)) * (float) i_145_) >> 6;
			i_145_ += i_146_;
			i_143_ += i_150_;
		}
		if (i_150_ == 0 || ((i_147_ = i_144_ + (i_149_ - i_143_ + i_150_) / i_150_) > i_148_))
			i_147_ = i_148_;
		f = f_151_;
		while (i_144_ < i_147_) {
			is[i_144_++] += (int) ((f * 256.0F + (fs[i_143_ >> 8] - f) * (float) (i_143_ & 0xff)) * (float) i_145_) >> 6;
			i_145_ += i_146_;
			i_143_ += i_150_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_144_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_144_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_145_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_143_ * -834443097;
		return i_144_;
	}

	static int method15743(float f, int i, float[] fs, int[] is, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_161_, float f_162_) {
		i_154_ *= 128;
		i_156_ *= 128;
		i_155_ *= 128;
		i_157_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_153_ * 809781739);
		if (i_161_ == 0 || ((i_158_ = i_153_ + (i_160_ + 256 - i_152_ + i_161_) / i_161_) > i_159_))
			i_158_ = i_159_;
		i_153_ <<= 1;
		i_158_ <<= 1;
		while (i_153_ < i_158_) {
			i = i_152_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_152_ & 0xff);
			is[i_153_++] += (int) (f * (float) i_154_) >> 6;
			i_154_ += i_156_;
			is[i_153_++] += (int) (f * (float) i_155_) >> 6;
			i_155_ += i_157_;
			i_152_ += i_161_;
		}
		if (i_161_ == 0 || ((i_158_ = (i_153_ >> 1) + (i_160_ - i_152_ + i_161_) / i_161_) > i_159_))
			i_158_ = i_159_;
		i_158_ <<= 1;
		while (i_153_ < i_158_) {
			f = (f_162_ * 256.0F + (fs[i_152_ >> 8] - f_162_) * (float) (i_152_ & 0xff));
			is[i_153_++] += (int) (f * (float) i_154_) >> 6;
			i_154_ += i_156_;
			is[i_153_++] += (int) (f * (float) i_155_) >> 6;
			i_155_ += i_157_;
			i_152_ += i_161_;
		}
		i_153_ >>= 1;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_153_ * 809781739);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = i_154_ / 128 * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = i_155_ / 128 * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_152_ * -834443097;
		return i_153_;
	}

	static int method15744(float f, float[] fs, int[] is, int i, int i_163_, int i_164_, int i_165_, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_170_ >>= 8;
		i_164_ <<= 2;
		i_165_ <<= 2;
		i_166_ <<= 2;
		i_167_ <<= 2;
		i_164_ *= 128;
		i_166_ *= 128;
		i_165_ *= 128;
		i_167_ *= 128;
		if ((i_168_ = i_163_ + i - (i_170_ - 1)) > i_169_)
			i_168_ = i_169_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * (i_168_ - i_163_) * 809781739);
		i_163_ <<= 1;
		i_168_ <<= 1;
		i_168_ -= 6;
		while (i_163_ < i_168_) {
			f = fs[i--];
			is[i_163_++] += f * (float) i_164_;
			i_164_ += i_166_;
			is[i_163_++] += f * (float) i_165_;
			i_165_ += i_167_;
			f = fs[i--];
			is[i_163_++] += f * (float) i_164_;
			i_164_ += i_166_;
			is[i_163_++] += f * (float) i_165_;
			i_165_ += i_167_;
			f = fs[i--];
			is[i_163_++] += f * (float) i_164_;
			i_164_ += i_166_;
			is[i_163_++] += f * (float) i_165_;
			i_165_ += i_167_;
			f = fs[i--];
			is[i_163_++] += f * (float) i_164_;
			i_164_ += i_166_;
			is[i_163_++] += f * (float) i_165_;
			i_165_ += i_167_;
		}
		i_168_ += 6;
		while (i_163_ < i_168_) {
			f = fs[i--];
			is[i_163_++] += f * (float) i_164_;
			i_164_ += i_166_;
			is[i_163_++] += f * (float) i_165_;
			i_165_ += i_167_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = (i_164_ / 128 >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = (i_165_ / 128 >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_163_ >> 1;
	}

	static int method15745(float f, int i, float[] fs, int[] is, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_, int i_179_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_180_, float f_181_) {
		i_173_ *= 128;
		i_175_ *= 128;
		i_174_ *= 128;
		i_176_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_172_ * 809781739);
		if (i_180_ == 0 || ((i_177_ = i_172_ + (i_179_ + 256 - i_171_ + i_180_) / i_180_) > i_178_))
			i_177_ = i_178_;
		i_172_ <<= 1;
		i_177_ <<= 1;
		while (i_172_ < i_177_) {
			i = i_171_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_171_ & 0xff);
			is[i_172_++] += (int) (f * (float) i_173_) >> 6;
			i_173_ += i_175_;
			is[i_172_++] += (int) (f * (float) i_174_) >> 6;
			i_174_ += i_176_;
			i_171_ += i_180_;
		}
		if (i_180_ == 0 || ((i_177_ = (i_172_ >> 1) + (i_179_ - i_171_ + i_180_) / i_180_) > i_178_))
			i_177_ = i_178_;
		i_177_ <<= 1;
		while (i_172_ < i_177_) {
			f = (f_181_ * 256.0F + (fs[i_171_ >> 8] - f_181_) * (float) (i_171_ & 0xff));
			is[i_172_++] += (int) (f * (float) i_173_) >> 6;
			i_173_ += i_175_;
			is[i_172_++] += (int) (f * (float) i_174_) >> 6;
			i_174_ += i_176_;
			i_171_ += i_180_;
		}
		i_172_ >>= 1;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_172_ * 809781739);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = i_173_ / 128 * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = i_174_ / 128 * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_171_ * -834443097;
		return i_172_;
	}

	Class282_Sub15_Sub5_Sub1(Class282_Sub26_Sub1_Sub1 class282_sub26_sub1_sub1, int i, int i_182_, int i_183_) {
		((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601 = class282_sub26_sub1_sub1;
		((Class282_Sub15_Sub5_Sub1) this).anInt9844 = class282_sub26_sub1_sub1.anInt9749 * 1301352263;
		((Class282_Sub15_Sub5_Sub1) this).anInt9856 = (((Class282_Sub26_Sub1_Sub1) class282_sub26_sub1_sub1).anInt9751 * 849408595);
		((Class282_Sub15_Sub5_Sub1) this).aBool9857 = class282_sub26_sub1_sub1.aBool9752;
		((Class282_Sub15_Sub5_Sub1) this).anInt9855 = i * 1927994969;
		((Class282_Sub15_Sub5_Sub1) this).anInt9846 = i_182_ * -298675253;
		((Class282_Sub15_Sub5_Sub1) this).anInt9847 = i_183_ * 375820671;
		((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 0;
		method15332((byte) -8);
	}

	static int method15746(float f, int i, float[] fs, int[] is, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_191_, float f_192_) {
		i_186_ *= 128;
		i_187_ *= 128;
		if (i_191_ == 0 || ((i_188_ = i_185_ + (i_190_ - i_184_ + i_191_ - 257) / i_191_) > i_189_))
			i_188_ = i_189_;
		i_185_ <<= 1;
		i_188_ <<= 1;
		while (i_185_ < i_188_) {
			i = i_184_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_184_ & 0xff);
			is[i_185_++] += (int) (f * (float) i_186_) >> 6;
			is[i_185_++] += (int) (f * (float) i_187_) >> 6;
			i_184_ += i_191_;
		}
		if (i_191_ == 0 || (i_188_ = (i_185_ >> 1) + (i_190_ - i_184_ + i_191_ - 1) / i_191_) > i_189_)
			i_188_ = i_189_;
		i_188_ <<= 1;
		while (i_185_ < i_188_) {
			f = fs[i_184_ >> 8];
			f = f * 256.0F + (f_192_ - f) * (float) (i_184_ & 0xff);
			is[i_185_++] += (int) (f * (float) i_186_) >> 6;
			is[i_185_++] += (int) (f * (float) i_187_) >> 6;
			i_184_ += i_191_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_184_ * -834443097;
		return i_185_ >> 1;
	}

	static int method15747(float f, int i, float[] fs, int[] is, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_199_, float f_200_) {
		i_195_ *= 128;
		if (i_199_ == 0 || ((i_196_ = i_194_ + (i_198_ - i_193_ + i_199_ - 257) / i_199_) > i_197_))
			i_196_ = i_197_;
		while (i_194_ < i_196_) {
			i = i_193_ >> 8;
			f = fs[i];
			is[i_194_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_193_ & 0xff)) * (float) i_195_) >> 6;
			i_193_ += i_199_;
		}
		if (i_199_ == 0 || ((i_196_ = i_194_ + (i_198_ - i_193_ + i_199_ - 1) / i_199_) > i_197_))
			i_196_ = i_197_;
		while (i_194_ < i_196_) {
			f = fs[i_193_ >> 8];
			is[i_194_++] += (int) ((f * 256.0F + (f_200_ - f) * (float) (i_193_ & 0xff)) * (float) i_195_) >> 6;
			i_193_ += i_199_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_193_ * -834443097;
		return i_194_;
	}

	int method15748(int[] is, int i, int i_201_, int i_202_, float f) {
		while (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 > 0) {
			int i_203_ = i + ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447;
			if (i_203_ > i_202_)
				i_203_ = i_202_;
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 += i * 1156515807;
			if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == -256) && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method15739(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub1) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub1) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub1) this).anInt9851) * 241181547, 0, i_203_, i_201_, this);
				else
					i = method15738(((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub1) this).anInt9849) * 1670226395, 0, i_203_, i_201_, this);
			} else if (Class253.aBool3115)
				i = (method15743(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub1) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub1) this).anInt9851 * 241181547, 0, i_203_, i_201_, this,
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			else
				i = (method15742(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub1) this).anInt9849 * 1670226395, 0, i_203_, i_201_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 12))
				return i_202_;
		}
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == -256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15731(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173), 0, i_202_, i_201_, this);
			return (method15774(((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_202_, i_201_, this));
		}
		if (Class253.aBool3115)
			return (method15729(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, 0, i_202_, i_201_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
		return (method15734(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_202_, i_201_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
	}

	static int method15749(float[] fs, int[] is, int i, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_208_ >>= 8;
		i_205_ <<= 2;
		i_205_ *= 128;
		if ((i_206_ = i_204_ + i_208_ - i) > i_207_)
			i_206_ = i_207_;
		i_206_ -= 3;
		while (i_204_ < i_206_) {
			is[i_204_++] += fs[i++] * (float) i_205_;
			is[i_204_++] += fs[i++] * (float) i_205_;
			is[i_204_++] += fs[i++] * (float) i_205_;
			is[i_204_++] += fs[i++] * (float) i_205_;
		}
		i_206_ += 3;
		while (i_204_ < i_206_)
			is[i_204_++] += fs[i++] * (float) i_205_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_204_;
	}

	static int method15750(float[] fs, int[] is, int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_213_ >>= 8;
		i_210_ <<= 2;
		i_210_ *= 128;
		if ((i_211_ = i_209_ + i_213_ - i) > i_212_)
			i_211_ = i_212_;
		i_211_ -= 3;
		while (i_209_ < i_211_) {
			is[i_209_++] += fs[i++] * (float) i_210_;
			is[i_209_++] += fs[i++] * (float) i_210_;
			is[i_209_++] += fs[i++] * (float) i_210_;
			is[i_209_++] += fs[i++] * (float) i_210_;
		}
		i_211_ += 3;
		while (i_209_ < i_211_)
			is[i_209_++] += fs[i++] * (float) i_210_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_209_;
	}

	static int method15751(float f, float[] fs, int[] is, int i, int i_214_, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_219_ >>= 8;
		i_215_ <<= 2;
		i_216_ <<= 2;
		i_215_ *= 128;
		i_216_ *= 128;
		if ((i_217_ = i_214_ + i_219_ - i) > i_218_)
			i_217_ = i_218_;
		i_214_ <<= 1;
		i_217_ <<= 1;
		i_217_ -= 6;
		while (i_214_ < i_217_) {
			f = fs[i++];
			is[i_214_++] += f * (float) i_215_;
			is[i_214_++] += f * (float) i_216_;
			f = fs[i++];
			is[i_214_++] += f * (float) i_215_;
			is[i_214_++] += f * (float) i_216_;
			f = fs[i++];
			is[i_214_++] += f * (float) i_215_;
			is[i_214_++] += f * (float) i_216_;
			f = fs[i++];
			is[i_214_++] += f * (float) i_215_;
			is[i_214_++] += f * (float) i_216_;
		}
		i_217_ += 6;
		while (i_214_ < i_217_) {
			f = fs[i++];
			is[i_214_++] += f * (float) i_215_;
			is[i_214_++] += f * (float) i_216_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_214_ >> 1;
	}

	static int method15752(float f, float[] fs, int[] is, int i, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_, int i_225_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_225_ >>= 8;
		i_221_ <<= 2;
		i_222_ <<= 2;
		i_221_ *= 128;
		i_222_ *= 128;
		if ((i_223_ = i_220_ + i_225_ - i) > i_224_)
			i_223_ = i_224_;
		i_220_ <<= 1;
		i_223_ <<= 1;
		i_223_ -= 6;
		while (i_220_ < i_223_) {
			f = fs[i++];
			is[i_220_++] += f * (float) i_221_;
			is[i_220_++] += f * (float) i_222_;
			f = fs[i++];
			is[i_220_++] += f * (float) i_221_;
			is[i_220_++] += f * (float) i_222_;
			f = fs[i++];
			is[i_220_++] += f * (float) i_221_;
			is[i_220_++] += f * (float) i_222_;
			f = fs[i++];
			is[i_220_++] += f * (float) i_221_;
			is[i_220_++] += f * (float) i_222_;
		}
		i_223_ += 6;
		while (i_220_ < i_223_) {
			f = fs[i++];
			is[i_220_++] += f * (float) i_221_;
			is[i_220_++] += f * (float) i_222_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_220_ >> 1;
	}

	static int method15753(float[] fs, int[] is, int i, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_230_ >>= 8;
		i_227_ <<= 2;
		i_227_ *= 128;
		if ((i_228_ = i_226_ + i - (i_230_ - 1)) > i_229_)
			i_228_ = i_229_;
		i_228_ -= 3;
		while (i_226_ < i_228_) {
			is[i_226_++] += fs[i--] * (float) i_227_;
			is[i_226_++] += fs[i--] * (float) i_227_;
			is[i_226_++] += fs[i--] * (float) i_227_;
			is[i_226_++] += fs[i--] * (float) i_227_;
		}
		i_228_ += 3;
		while (i_226_ < i_228_)
			is[i_226_++] += fs[i--] * (float) i_227_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_226_;
	}

	static int method15754(float f, int i, float[] fs, int[] is, int i_231_, int i_232_, int i_233_, int i_234_, int i_235_, int i_236_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_237_, float f_238_) {
		i_233_ *= 128;
		if (i_237_ == 0 || ((i_234_ = i_232_ + (i_236_ - i_231_ + i_237_ - 257) / i_237_) > i_235_))
			i_234_ = i_235_;
		while (i_232_ < i_234_) {
			i = i_231_ >> 8;
			f = fs[i];
			is[i_232_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_231_ & 0xff)) * (float) i_233_) >> 6;
			i_231_ += i_237_;
		}
		if (i_237_ == 0 || ((i_234_ = i_232_ + (i_236_ - i_231_ + i_237_ - 1) / i_237_) > i_235_))
			i_234_ = i_235_;
		while (i_232_ < i_234_) {
			f = fs[i_231_ >> 8];
			is[i_232_++] += (int) ((f * 256.0F + (f_238_ - f) * (float) (i_231_ & 0xff)) * (float) i_233_) >> 6;
			i_231_ += i_237_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_231_ * -834443097;
		return i_232_;
	}

	int method15755(int[] is, int i, int i_239_, int i_240_, float f) {
		while (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 > 0) {
			int i_241_ = i + ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447;
			if (i_241_ > i_240_)
				i_241_ = i_240_;
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 += i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method15737(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub1) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub1) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub1) this).anInt9851) * 241181547, 0, i_241_, i_239_, this);
				else
					i = method15777(((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub1) this).anInt9849) * 1670226395, 0, i_241_, i_239_, this);
			} else if (Class253.aBool3115)
				i = (method15741(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub1) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub1) this).anInt9851 * 241181547, 0, i_241_, i_239_, this,
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			else
				i = (method15735(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub1) this).anInt9849 * 1670226395, 0, i_241_, i_239_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 77))
				return i_240_;
		}
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15770(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173), 0, i_240_, i_239_, this);
			return (method15740(((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_240_, i_239_, this));
		}
		if (Class253.aBool3115)
			return (method15746(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, 0, i_240_, i_239_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
		return (method15747(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_240_, i_239_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
	}

	static int method15756(float f, int i, float[] fs, int[] is, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_248_, float f_249_) {
		i_244_ *= 128;
		if (i_248_ == 0 || ((i_245_ = i_243_ + (i_247_ - i_242_ + i_248_ - 257) / i_248_) > i_246_))
			i_245_ = i_246_;
		while (i_243_ < i_245_) {
			i = i_242_ >> 8;
			f = fs[i];
			is[i_243_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_242_ & 0xff)) * (float) i_244_) >> 6;
			i_242_ += i_248_;
		}
		if (i_248_ == 0 || ((i_245_ = i_243_ + (i_247_ - i_242_ + i_248_ - 1) / i_248_) > i_246_))
			i_245_ = i_246_;
		while (i_243_ < i_245_) {
			f = fs[i_242_ >> 8];
			is[i_243_++] += (int) ((f * 256.0F + (f_249_ - f) * (float) (i_242_ & 0xff)) * (float) i_244_) >> 6;
			i_242_ += i_248_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_242_ * -834443097;
		return i_243_;
	}

	static int method15757(float f, int i, float[] fs, int[] is, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_257_, float f_258_) {
		i_252_ *= 128;
		i_253_ *= 128;
		if (i_257_ == 0 || ((i_254_ = i_251_ + (i_256_ - i_250_ + i_257_ - 257) / i_257_) > i_255_))
			i_254_ = i_255_;
		i_251_ <<= 1;
		i_254_ <<= 1;
		while (i_251_ < i_254_) {
			i = i_250_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_250_ & 0xff);
			is[i_251_++] += (int) (f * (float) i_252_) >> 6;
			is[i_251_++] += (int) (f * (float) i_253_) >> 6;
			i_250_ += i_257_;
		}
		if (i_257_ == 0 || (i_254_ = (i_251_ >> 1) + (i_256_ - i_250_ + i_257_ - 1) / i_257_) > i_255_)
			i_254_ = i_255_;
		i_254_ <<= 1;
		while (i_251_ < i_254_) {
			f = fs[i_250_ >> 8];
			f = f * 256.0F + (f_258_ - f) * (float) (i_250_ & 0xff);
			is[i_251_++] += (int) (f * (float) i_252_) >> 6;
			is[i_251_++] += (int) (f * (float) i_253_) >> 6;
			i_250_ += i_257_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_250_ * -834443097;
		return i_251_ >> 1;
	}

	static int method15758(float f, int i, float[] fs, int[] is, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_266_, float f_267_) {
		i_261_ *= 128;
		i_262_ *= 128;
		if (i_266_ == 0 || ((i_263_ = i_260_ + (i_265_ - i_259_ + i_266_ - 257) / i_266_) > i_264_))
			i_263_ = i_264_;
		i_260_ <<= 1;
		i_263_ <<= 1;
		while (i_260_ < i_263_) {
			i = i_259_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_259_ & 0xff);
			is[i_260_++] += (int) (f * (float) i_261_) >> 6;
			is[i_260_++] += (int) (f * (float) i_262_) >> 6;
			i_259_ += i_266_;
		}
		if (i_266_ == 0 || (i_263_ = (i_260_ >> 1) + (i_265_ - i_259_ + i_266_ - 1) / i_266_) > i_264_)
			i_263_ = i_264_;
		i_263_ <<= 1;
		while (i_260_ < i_263_) {
			f = fs[i_259_ >> 8];
			f = f * 256.0F + (f_267_ - f) * (float) (i_259_ & 0xff);
			is[i_260_++] += (int) (f * (float) i_261_) >> 6;
			is[i_260_++] += (int) (f * (float) i_262_) >> 6;
			i_259_ += i_266_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_259_ * -834443097;
		return i_260_ >> 1;
	}

	public synchronized void method12241(int[] is, int i, int i_268_) throws IllegalStateException {
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 == 0)
			method12231(i_268_);
		else {
			int i_269_ = ((Class282_Sub15_Sub5_Sub1) this).anInt9844 * -99794975 << 8;
			int i_270_ = (((Class282_Sub15_Sub5_Sub1) this).anInt9856 * -1048610041 << 8);
			int i_271_ = (((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15223() << 8);
			int i_272_ = i_270_ - i_269_;
			if (i_272_ <= 0)
				((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
			int i_273_ = i;
			i_268_ += i;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 >= i_271_) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_271_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
						i_273_ = method15732(is, i_273_, i_269_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_269_)
							return;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_269_ + i_269_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
					for (;;) {
						i_273_ = method15769(is, i_273_, i_270_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_270_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_270_ + i_270_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
						i_273_ = method15732(is, i_273_, i_269_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_269_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_269_ + i_269_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_273_ = method15732(is, i_273_, i_269_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_269_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_270_ - 1 - (i_270_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) % i_272_) * -834443097);
					}
				} else {
					for (;;) {
						i_273_ = method15769(is, i_273_, i_270_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_270_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_269_ + ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) - i_269_) % i_272_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
								i_273_ = (method15732(is, i_273_, i_269_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_269_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_269_ + i_269_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_273_ = (method15769(is, i_273_, i_270_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_270_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_270_ + i_270_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_273_ = (method15732(is, i_273_, i_269_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_269_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_269_ + i_269_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_273_ = (method15732(is, i_273_, i_269_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_269_)
									return;
								int i_274_ = ((i_270_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) / i_272_);
								if (i_274_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 += (i_272_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 += i_272_ * i_274_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_274_ * -485012237;
							}
						} else {
							for (;;) {
								i_273_ = (method15769(is, i_273_, i_270_, i_268_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_270_)
									return;
								int i_275_ = (((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 - i_269_) / i_272_);
								if (i_275_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= (i_272_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= i_272_ * i_275_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_275_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0) {
					method15732(is, i_273_, 0, i_268_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15769(is, i_273_, i_271_, i_268_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_271_) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = i_271_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	static int method15759(float f, int i, float[] fs, int[] is, int i_276_, int i_277_, int i_278_, int i_279_, int i_280_, int i_281_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_282_, float f_283_) {
		i_278_ *= 128;
		if (i_282_ == 0 || ((i_279_ = i_277_ + (i_281_ + 256 - i_276_ + i_282_) / i_282_) > i_280_))
			i_279_ = i_280_;
		while (i_277_ < i_279_) {
			i = i_276_ >> 8;
			f = fs[i - 1];
			is[i_277_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_276_ & 0xff)) * (float) i_278_) >> 6;
			i_276_ += i_282_;
		}
		if (i_282_ == 0 || ((i_279_ = i_277_ + (i_281_ - i_276_ + i_282_) / i_282_) > i_280_))
			i_279_ = i_280_;
		f = f_283_;
		while (i_277_ < i_279_) {
			is[i_277_++] += (int) ((f * 256.0F + (fs[i_276_ >> 8] - f) * (float) (i_276_ & 0xff)) * (float) i_278_) >> 6;
			i_276_ += i_282_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_276_ * -834443097;
		return i_277_;
	}

	static int method15760(float f, int i, float[] fs, int[] is, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, int i_289_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_290_, float f_291_) {
		i_286_ *= 128;
		if (i_290_ == 0 || ((i_287_ = i_285_ + (i_289_ + 256 - i_284_ + i_290_) / i_290_) > i_288_))
			i_287_ = i_288_;
		while (i_285_ < i_287_) {
			i = i_284_ >> 8;
			f = fs[i - 1];
			is[i_285_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_284_ & 0xff)) * (float) i_286_) >> 6;
			i_284_ += i_290_;
		}
		if (i_290_ == 0 || ((i_287_ = i_285_ + (i_289_ - i_284_ + i_290_) / i_290_) > i_288_))
			i_287_ = i_288_;
		f = f_291_;
		while (i_285_ < i_287_) {
			is[i_285_++] += (int) ((f * 256.0F + (fs[i_284_ >> 8] - f) * (float) (i_284_ & 0xff)) * (float) i_286_) >> 6;
			i_284_ += i_290_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_284_ * -834443097;
		return i_285_;
	}

	static int method15761(float f, int i, float[] fs, int[] is, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, int i_297_, int i_298_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_299_, float f_300_) {
		i_294_ *= 128;
		i_295_ *= 128;
		if (i_299_ == 0 || ((i_296_ = i_293_ + (i_298_ + 256 - i_292_ + i_299_) / i_299_) > i_297_))
			i_296_ = i_297_;
		i_293_ <<= 1;
		i_296_ <<= 1;
		while (i_293_ < i_296_) {
			i = i_292_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_292_ & 0xff);
			is[i_293_++] += (int) (f * (float) i_294_) >> 6;
			is[i_293_++] += (int) (f * (float) i_295_) >> 6;
			i_292_ += i_299_;
		}
		if (i_299_ == 0 || ((i_296_ = (i_293_ >> 1) + (i_298_ - i_292_ + i_299_) / i_299_) > i_297_))
			i_296_ = i_297_;
		i_296_ <<= 1;
		while (i_293_ < i_296_) {
			f = (f_300_ * 256.0F + (fs[i_292_ >> 8] - f_300_) * (float) (i_292_ & 0xff));
			is[i_293_++] += (int) (f * (float) i_294_) >> 6;
			is[i_293_++] += (int) (f * (float) i_295_) >> 6;
			i_292_ += i_299_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_292_ * -834443097;
		return i_293_ >> 1;
	}

	static int method15762(float f, int i, float[] fs, int[] is, int i_301_, int i_302_, int i_303_, int i_304_, int i_305_, int i_306_, int i_307_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_308_, float f_309_) {
		i_303_ *= 128;
		i_304_ *= 128;
		if (i_308_ == 0 || ((i_305_ = i_302_ + (i_307_ + 256 - i_301_ + i_308_) / i_308_) > i_306_))
			i_305_ = i_306_;
		i_302_ <<= 1;
		i_305_ <<= 1;
		while (i_302_ < i_305_) {
			i = i_301_ >> 8;
			f = fs[i - 1];
			f = f * 256.0F + (fs[i] - f) * (float) (i_301_ & 0xff);
			is[i_302_++] += (int) (f * (float) i_303_) >> 6;
			is[i_302_++] += (int) (f * (float) i_304_) >> 6;
			i_301_ += i_308_;
		}
		if (i_308_ == 0 || ((i_305_ = (i_302_ >> 1) + (i_307_ - i_301_ + i_308_) / i_308_) > i_306_))
			i_305_ = i_306_;
		i_305_ <<= 1;
		while (i_302_ < i_305_) {
			f = (f_309_ * 256.0F + (fs[i_301_ >> 8] - f_309_) * (float) (i_301_ & 0xff));
			is[i_302_++] += (int) (f * (float) i_303_) >> 6;
			is[i_302_++] += (int) (f * (float) i_304_) >> 6;
			i_301_ += i_308_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_301_ * -834443097;
		return i_302_ >> 1;
	}

	static int method15763(float[] fs, int[] is, int i, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_315_ >>= 8;
		i_311_ <<= 2;
		i_312_ <<= 2;
		i_311_ *= 128;
		i_312_ *= 128;
		if ((i_313_ = i_310_ + i_315_ - i) > i_314_)
			i_313_ = i_314_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * (i_313_ - i_310_) * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * (i_313_ - i_310_) * 1339372733);
		i_313_ -= 3;
		while (i_310_ < i_313_) {
			is[i_310_++] += fs[i++] * (float) i_311_;
			i_311_ += i_312_;
			is[i_310_++] += fs[i++] * (float) i_311_;
			i_311_ += i_312_;
			is[i_310_++] += fs[i++] * (float) i_311_;
			i_311_ += i_312_;
			is[i_310_++] += fs[i++] * (float) i_311_;
			i_311_ += i_312_;
		}
		i_313_ += 3;
		while (i_310_ < i_313_) {
			is[i_310_++] += fs[i++] * (float) i_311_;
			i_311_ += i_312_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = (i_311_ / 128 >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_310_;
	}

	static int method15764(float[] fs, int[] is, int i, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_321_ >>= 8;
		i_317_ <<= 2;
		i_318_ <<= 2;
		i_317_ *= 128;
		i_318_ *= 128;
		if ((i_319_ = i_316_ + i_321_ - i) > i_320_)
			i_319_ = i_320_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * (i_319_ - i_316_) * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * (i_319_ - i_316_) * 1339372733);
		i_319_ -= 3;
		while (i_316_ < i_319_) {
			is[i_316_++] += fs[i++] * (float) i_317_;
			i_317_ += i_318_;
			is[i_316_++] += fs[i++] * (float) i_317_;
			i_317_ += i_318_;
			is[i_316_++] += fs[i++] * (float) i_317_;
			i_317_ += i_318_;
			is[i_316_++] += fs[i++] * (float) i_317_;
			i_317_ += i_318_;
		}
		i_319_ += 3;
		while (i_316_ < i_319_) {
			is[i_316_++] += fs[i++] * (float) i_317_;
			i_317_ += i_318_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = (i_317_ / 128 >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_316_;
	}

	int method15765(int[] is, int i, int i_322_, int i_323_, float f) {
		while (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 > 0) {
			int i_324_ = i + ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447;
			if (i_324_ > i_323_)
				i_324_ = i_323_;
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 += i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method15737(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub1) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub1) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub1) this).anInt9851) * 241181547, 0, i_324_, i_322_, this);
				else
					i = method15777(((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub1) this).anInt9849) * 1670226395, 0, i_324_, i_322_, this);
			} else if (Class253.aBool3115)
				i = (method15741(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub1) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub1) this).anInt9851 * 241181547, 0, i_324_, i_322_, this,
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			else
				i = (method15735(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub1) this).anInt9849 * 1670226395, 0, i_324_, i_322_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) -64))
				return i_323_;
		}
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15770(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173), 0, i_323_, i_322_, this);
			return (method15740(((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_323_, i_322_, this));
		}
		if (Class253.aBool3115)
			return (method15746(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, 0, i_323_, i_322_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
		return (method15747(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_323_, i_322_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
	}

	static int method15766(float f, float[] fs, int[] is, int i, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_, int i_330_, int i_331_, int i_332_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_332_ >>= 8;
		i_326_ <<= 2;
		i_327_ <<= 2;
		i_328_ <<= 2;
		i_329_ <<= 2;
		i_326_ *= 128;
		i_328_ *= 128;
		i_327_ *= 128;
		i_329_ *= 128;
		if ((i_330_ = i_325_ + i_332_ - i) > i_331_)
			i_330_ = i_331_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * (i_330_ - i_325_) * 809781739);
		i_325_ <<= 1;
		i_330_ <<= 1;
		i_330_ -= 6;
		while (i_325_ < i_330_) {
			f = fs[i++];
			is[i_325_++] += f * (float) i_326_;
			i_326_ += i_328_;
			is[i_325_++] += f * (float) i_327_;
			i_327_ += i_329_;
			f = fs[i++];
			is[i_325_++] += f * (float) i_326_;
			i_326_ += i_328_;
			is[i_325_++] += f * (float) i_327_;
			i_327_ += i_329_;
			f = fs[i++];
			is[i_325_++] += f * (float) i_326_;
			i_326_ += i_328_;
			is[i_325_++] += f * (float) i_327_;
			i_327_ += i_329_;
			f = fs[i++];
			is[i_325_++] += f * (float) i_326_;
			i_326_ += i_328_;
			is[i_325_++] += f * (float) i_327_;
			i_327_ += i_329_;
		}
		i_330_ += 6;
		while (i_325_ < i_330_) {
			f = fs[i++];
			is[i_325_++] += f * (float) i_326_;
			i_326_ += i_328_;
			is[i_325_++] += f * (float) i_327_;
			i_327_ += i_329_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = (i_326_ / 128 >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = (i_327_ / 128 >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_325_ >> 1;
	}

	static int method15767(float f, float[] fs, int[] is, int i, int i_333_, int i_334_, int i_335_, int i_336_, int i_337_, int i_338_, int i_339_, int i_340_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_340_ >>= 8;
		i_334_ <<= 2;
		i_335_ <<= 2;
		i_336_ <<= 2;
		i_337_ <<= 2;
		i_334_ *= 128;
		i_336_ *= 128;
		i_335_ *= 128;
		i_337_ *= 128;
		if ((i_338_ = i_333_ + i_340_ - i) > i_339_)
			i_338_ = i_339_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * (i_338_ - i_333_) * 809781739);
		i_333_ <<= 1;
		i_338_ <<= 1;
		i_338_ -= 6;
		while (i_333_ < i_338_) {
			f = fs[i++];
			is[i_333_++] += f * (float) i_334_;
			i_334_ += i_336_;
			is[i_333_++] += f * (float) i_335_;
			i_335_ += i_337_;
			f = fs[i++];
			is[i_333_++] += f * (float) i_334_;
			i_334_ += i_336_;
			is[i_333_++] += f * (float) i_335_;
			i_335_ += i_337_;
			f = fs[i++];
			is[i_333_++] += f * (float) i_334_;
			i_334_ += i_336_;
			is[i_333_++] += f * (float) i_335_;
			i_335_ += i_337_;
			f = fs[i++];
			is[i_333_++] += f * (float) i_334_;
			i_334_ += i_336_;
			is[i_333_++] += f * (float) i_335_;
			i_335_ += i_337_;
		}
		i_338_ += 6;
		while (i_333_ < i_338_) {
			f = fs[i++];
			is[i_333_++] += f * (float) i_334_;
			i_334_ += i_336_;
			is[i_333_++] += f * (float) i_335_;
			i_335_ += i_337_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = (i_334_ / 128 >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = (i_335_ / 128 >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_333_ >> 1;
	}

	static int method15768(float[] fs, int[] is, int i, int i_341_, int i_342_, int i_343_, int i_344_, int i_345_, int i_346_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_346_ >>= 8;
		i_342_ <<= 2;
		i_343_ <<= 2;
		i_342_ *= 128;
		i_343_ *= 128;
		if ((i_344_ = i_341_ + i - (i_346_ - 1)) > i_345_)
			i_344_ = i_345_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * (i_344_ - i_341_) * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * (i_344_ - i_341_) * 1339372733);
		i_344_ -= 3;
		while (i_341_ < i_344_) {
			is[i_341_++] += fs[i--] * (float) i_342_;
			i_342_ += i_343_;
			is[i_341_++] += fs[i--] * (float) i_342_;
			i_342_ += i_343_;
			is[i_341_++] += fs[i--] * (float) i_342_;
			i_342_ += i_343_;
			is[i_341_++] += fs[i--] * (float) i_342_;
			i_342_ += i_343_;
		}
		i_344_ += 3;
		while (i_341_ < i_344_) {
			is[i_341_++] += fs[i--] * (float) i_342_;
			i_342_ += i_343_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = (i_342_ / 128 >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_341_;
	}

	public synchronized void method12242(int[] is, int i, int i_347_) throws IllegalStateException {
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 == 0)
			method12231(i_347_);
		else {
			int i_348_ = ((Class282_Sub15_Sub5_Sub1) this).anInt9844 * -99794975 << 8;
			int i_349_ = (((Class282_Sub15_Sub5_Sub1) this).anInt9856 * -1048610041 << 8);
			int i_350_ = (((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15223() << 8);
			int i_351_ = i_349_ - i_348_;
			if (i_351_ <= 0)
				((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
			int i_352_ = i;
			i_347_ += i;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 >= i_350_) {
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_350_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
						i_352_ = method15732(is, i_352_, i_348_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_348_)
							return;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_348_ + i_348_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
					for (;;) {
						i_352_ = method15769(is, i_352_, i_349_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_349_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_349_ + i_349_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
						i_352_ = method15732(is, i_352_, i_348_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_348_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_348_ + i_348_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub1) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_352_ = method15732(is, i_352_, i_348_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_348_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_349_ - 1 - (i_349_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) % i_351_) * -834443097);
					}
				} else {
					for (;;) {
						i_352_ = method15769(is, i_352_, i_349_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < i_349_)
							break;
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = (i_348_ + ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) - i_348_) % i_351_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub1) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
								i_352_ = (method15732(is, i_352_, i_348_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_348_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_348_ + i_348_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_352_ = (method15769(is, i_352_, i_349_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_349_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_349_ + i_349_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_352_ = (method15732(is, i_352_, i_348_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_348_)
									return;
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 = ((i_348_ + i_348_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub1) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub1) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_352_ = (method15732(is, i_352_, i_348_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 >= i_348_)
									return;
								int i_353_ = ((i_349_ - 1 - (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449) / i_351_);
								if (i_353_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 += (i_351_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 += i_351_ * i_353_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_353_ * -485012237;
							}
						} else {
							for (;;) {
								i_352_ = (method15769(is, i_352_, i_349_, i_347_, (((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778()[(((Class282_Sub15_Sub5_Sub1) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 < i_349_)
									return;
								int i_354_ = (((((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449 - i_348_) / i_351_);
								if (i_354_ >= (((Class282_Sub15_Sub5_Sub1) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= (i_351_ * (((Class282_Sub15_Sub5_Sub1) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub1) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub1) this).anInt9853 -= i_351_ * i_354_ * -834443097;
								((Class282_Sub15_Sub5_Sub1) this).anInt9854 -= i_354_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 < 0) {
					method15732(is, i_352_, 0, i_347_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15769(is, i_352_, i_350_, i_347_, 0.0F);
					if ((((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449) >= i_350_) {
						((Class282_Sub15_Sub5_Sub1) this).anInt9853 = i_350_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	int method15769(int[] is, int i, int i_355_, int i_356_, float f) {
		while (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 > 0) {
			int i_357_ = i + ((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447;
			if (i_357_ > i_356_)
				i_357_ = i_356_;
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 += i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method15737(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub1) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub1) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub1) this).anInt9851) * 241181547, 0, i_357_, i_355_, this);
				else
					i = method15777(((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub1) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub1) this).anInt9849) * 1670226395, 0, i_357_, i_355_, this);
			} else if (Class253.aBool3115)
				i = (method15741(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub1) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub1) this).anInt9851 * 241181547, 0, i_357_, i_355_, this,
						((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			else
				i = (method15735(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub1) this).anInt9849 * 1670226395, 0, i_357_, i_355_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
			((Class282_Sub15_Sub5_Sub1) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub1) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 70))
				return i_356_;
		}
		if (((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15770(0.0F, ((Class282_Sub26_Sub1_Sub1) (((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601)).method15778(), is, (((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173), 0, i_356_, i_355_, this);
			return (method15740(((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_356_, i_355_, this));
		}
		if (Class253.aBool3115)
			return (method15746(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub1) this).anInt9850 * 2085185173, 0, i_356_, i_355_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
		return (method15747(0.0F, 0, ((Class282_Sub26_Sub1_Sub1) ((Class282_Sub15_Sub5_Sub1) this).aClass282_Sub26_7601).method15778(), is, ((Class282_Sub15_Sub5_Sub1) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub1) this).anInt9848 * -217803069, 0, i_356_, i_355_, this, ((Class282_Sub15_Sub5_Sub1) this).anInt9855 * -177305111, f));
	}

	static int method15770(float f, float[] fs, int[] is, int i, int i_358_, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_363_ >>= 8;
		i_359_ <<= 2;
		i_360_ <<= 2;
		i_359_ *= 128;
		i_360_ *= 128;
		if ((i_361_ = i_358_ + i_363_ - i) > i_362_)
			i_361_ = i_362_;
		i_358_ <<= 1;
		i_361_ <<= 1;
		i_361_ -= 6;
		while (i_358_ < i_361_) {
			f = fs[i++];
			is[i_358_++] += f * (float) i_359_;
			is[i_358_++] += f * (float) i_360_;
			f = fs[i++];
			is[i_358_++] += f * (float) i_359_;
			is[i_358_++] += f * (float) i_360_;
			f = fs[i++];
			is[i_358_++] += f * (float) i_359_;
			is[i_358_++] += f * (float) i_360_;
			f = fs[i++];
			is[i_358_++] += f * (float) i_359_;
			is[i_358_++] += f * (float) i_360_;
		}
		i_361_ += 6;
		while (i_358_ < i_361_) {
			f = fs[i++];
			is[i_358_++] += f * (float) i_359_;
			is[i_358_++] += f * (float) i_360_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_358_ >> 1;
	}

	static int method15771(float f, int i, float[] fs, int[] is, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_, int i_369_, int i_370_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_371_, float f_372_) {
		i_366_ *= 128;
		i_367_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_365_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_365_ * 1339372733);
		if (i_371_ == 0 || ((i_368_ = i_365_ + (i_370_ - i_364_ + i_371_ - 257) / i_371_) > i_369_))
			i_368_ = i_369_;
		while (i_365_ < i_368_) {
			i = i_364_ >> 8;
			f = fs[i];
			is[i_365_++] += (int) ((f * 256.0F + (fs[i + 1] - f) * (float) (i_364_ & 0xff)) * (float) i_366_) >> 6;
			i_366_ += i_367_;
			i_364_ += i_371_;
		}
		if (i_371_ == 0 || ((i_368_ = i_365_ + (i_370_ - i_364_ + i_371_ - 1) / i_371_) > i_369_))
			i_368_ = i_369_;
		while (i_365_ < i_368_) {
			f = fs[i_364_ >> 8];
			is[i_365_++] += (int) ((f * 256.0F + (f_372_ - f) * (float) (i_364_ & 0xff)) * (float) i_366_) >> 6;
			i_366_ += i_367_;
			i_364_ += i_371_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_365_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_365_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_366_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_364_ * -834443097;
		return i_365_;
	}

	static int method15772(float f, int i, float[] fs, int[] is, int i_373_, int i_374_, int i_375_, int i_376_, int i_377_, int i_378_, int i_379_, int i_380_, int i_381_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_382_, float f_383_) {
		i_375_ *= 128;
		i_377_ *= 128;
		i_376_ *= 128;
		i_378_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_374_ * 809781739);
		if (i_382_ == 0 || ((i_379_ = i_374_ + (i_381_ - i_373_ + i_382_ - 257) / i_382_) > i_380_))
			i_379_ = i_380_;
		i_374_ <<= 1;
		i_379_ <<= 1;
		while (i_374_ < i_379_) {
			i = i_373_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_373_ & 0xff);
			is[i_374_++] += (int) (f * (float) i_375_) >> 6;
			i_375_ += i_377_;
			is[i_374_++] += (int) (f * (float) i_376_) >> 6;
			i_376_ += i_378_;
			i_373_ += i_382_;
		}
		if (i_382_ == 0 || (i_379_ = (i_374_ >> 1) + (i_381_ - i_373_ + i_382_ - 1) / i_382_) > i_380_)
			i_379_ = i_380_;
		i_379_ <<= 1;
		while (i_374_ < i_379_) {
			f = fs[i_373_ >> 8];
			f = f * 256.0F + (f_383_ - f) * (float) (i_373_ & 0xff);
			is[i_374_++] += (int) (f * (float) i_375_) >> 6;
			i_375_ += i_377_;
			is[i_374_++] += (int) (f * (float) i_376_) >> 6;
			i_376_ += i_378_;
			i_373_ += i_382_;
		}
		i_374_ >>= 1;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_374_ * 809781739);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = i_375_ / 128 * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = i_376_ / 128 * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_373_ * -834443097;
		return i_374_;
	}

	static int method15773(float f, int i, float[] fs, int[] is, int i_384_, int i_385_, int i_386_, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_393_, float f_394_) {
		i_386_ *= 128;
		i_388_ *= 128;
		i_387_ *= 128;
		i_389_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_385_ * 809781739);
		if (i_393_ == 0 || ((i_390_ = i_385_ + (i_392_ - i_384_ + i_393_ - 257) / i_393_) > i_391_))
			i_390_ = i_391_;
		i_385_ <<= 1;
		i_390_ <<= 1;
		while (i_385_ < i_390_) {
			i = i_384_ >> 8;
			f = fs[i];
			f = f * 256.0F + (fs[i + 1] - f) * (float) (i_384_ & 0xff);
			is[i_385_++] += (int) (f * (float) i_386_) >> 6;
			i_386_ += i_388_;
			is[i_385_++] += (int) (f * (float) i_387_) >> 6;
			i_387_ += i_389_;
			i_384_ += i_393_;
		}
		if (i_393_ == 0 || (i_390_ = (i_385_ >> 1) + (i_392_ - i_384_ + i_393_ - 1) / i_393_) > i_391_)
			i_390_ = i_391_;
		i_390_ <<= 1;
		while (i_385_ < i_390_) {
			f = fs[i_384_ >> 8];
			f = f * 256.0F + (f_394_ - f) * (float) (i_384_ & 0xff);
			is[i_385_++] += (int) (f * (float) i_386_) >> 6;
			i_386_ += i_388_;
			is[i_385_++] += (int) (f * (float) i_387_) >> 6;
			i_387_ += i_389_;
			i_384_ += i_393_;
		}
		i_385_ >>= 1;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9849 * 1670226395 * i_385_ * 809781739);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 = i_386_ / 128 * 1672655349;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 = i_387_ / 128 * 1339372733;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_384_ * -834443097;
		return i_385_;
	}

	static int method15774(float[] fs, int[] is, int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_399_ >>= 8;
		i_396_ <<= 2;
		i_396_ *= 128;
		if ((i_397_ = i_395_ + i - (i_399_ - 1)) > i_398_)
			i_397_ = i_398_;
		i_397_ -= 3;
		while (i_395_ < i_397_) {
			is[i_395_++] += fs[i--] * (float) i_396_;
			is[i_395_++] += fs[i--] * (float) i_396_;
			is[i_395_++] += fs[i--] * (float) i_396_;
			is[i_395_++] += fs[i--] * (float) i_396_;
		}
		i_397_ += 3;
		while (i_395_ < i_397_)
			is[i_395_++] += fs[i--] * (float) i_396_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_395_;
	}

	static int method15775(float f, int i, float[] fs, int[] is, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_, int i_405_, int i_406_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_407_, float f_408_) {
		i_402_ *= 128;
		i_403_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_401_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_401_ * 1339372733);
		if (i_407_ == 0 || ((i_404_ = i_401_ + (i_406_ + 256 - i_400_ + i_407_) / i_407_) > i_405_))
			i_404_ = i_405_;
		while (i_401_ < i_404_) {
			i = i_400_ >> 8;
			f = fs[i - 1];
			is[i_401_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_400_ & 0xff)) * (float) i_402_) >> 6;
			i_402_ += i_403_;
			i_400_ += i_407_;
		}
		if (i_407_ == 0 || ((i_404_ = i_401_ + (i_406_ - i_400_ + i_407_) / i_407_) > i_405_))
			i_404_ = i_405_;
		f = f_408_;
		while (i_401_ < i_404_) {
			is[i_401_++] += (int) ((f * 256.0F + (fs[i_400_ >> 8] - f) * (float) (i_400_ & 0xff)) * (float) i_402_) >> 6;
			i_402_ += i_403_;
			i_400_ += i_407_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_401_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_401_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_402_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_400_ * -834443097;
		return i_401_;
	}

	static int method15776(float f, int i, float[] fs, int[] is, int i_409_, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_, int i_415_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1, int i_416_, float f_417_) {
		i_411_ *= 128;
		i_412_ *= 128;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_410_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 -= (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_410_ * 1339372733);
		if (i_416_ == 0 || ((i_413_ = i_410_ + (i_415_ + 256 - i_409_ + i_416_) / i_416_) > i_414_))
			i_413_ = i_414_;
		while (i_410_ < i_413_) {
			i = i_409_ >> 8;
			f = fs[i - 1];
			is[i_410_++] += (int) ((f * 256.0F + (fs[i] - f) * (float) (i_409_ & 0xff)) * (float) i_411_) >> 6;
			i_411_ += i_412_;
			i_409_ += i_416_;
		}
		if (i_416_ == 0 || ((i_413_ = i_410_ + (i_415_ - i_409_ + i_416_) / i_416_) > i_414_))
			i_413_ = i_414_;
		f = f_417_;
		while (i_410_ < i_413_) {
			is[i_410_++] += (int) ((f * 256.0F + (fs[i_409_ >> 8] - f) * (float) (i_409_ & 0xff)) * (float) i_411_) >> 6;
			i_411_ += i_412_;
			i_409_ += i_416_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * i_410_ * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * i_410_ * 1339372733);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = i_411_ / 128 * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = i_409_ * -834443097;
		return i_410_;
	}

	static int method15777(float[] fs, int[] is, int i, int i_418_, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, Class282_Sub15_Sub5_Sub1 class282_sub15_sub5_sub1) {
		i >>= 8;
		i_423_ >>= 8;
		i_419_ <<= 2;
		i_420_ <<= 2;
		i_419_ *= 128;
		i_420_ *= 128;
		if ((i_421_ = i_418_ + i_423_ - i) > i_422_)
			i_421_ = i_422_;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9845 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9852 * 1923898617 * (i_421_ - i_418_) * 1672655349);
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9850 += (((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9851 * 241181547 * (i_421_ - i_418_) * 1339372733);
		i_421_ -= 3;
		while (i_418_ < i_421_) {
			is[i_418_++] += fs[i++] * (float) i_419_;
			i_419_ += i_420_;
			is[i_418_++] += fs[i++] * (float) i_419_;
			i_419_ += i_420_;
			is[i_418_++] += fs[i++] * (float) i_419_;
			i_419_ += i_420_;
			is[i_418_++] += fs[i++] * (float) i_419_;
			i_419_ += i_420_;
		}
		i_421_ += 3;
		while (i_418_ < i_421_) {
			is[i_418_++] += fs[i++] * (float) i_419_;
			i_419_ += i_420_;
		}
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9848 = (i_419_ / 128 >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub1) class282_sub15_sub5_sub1).anInt9853 = (i << 8) * -834443097;
		return i_418_;
	}
}
