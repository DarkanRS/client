/* Class282_Sub15_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub15_Sub5_Sub2 extends Class282_Sub15_Sub5 {
	static int method15989(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_5_ >>= 8;
		i_2_ <<= 2;
		if ((i_3_ = i_1_ + i - (i_5_ - 1)) > i_4_)
			i_3_ = i_4_;
		i_3_ -= 3;
		while (i_1_ < i_3_) {
			is_0_[i_1_++] += is[i--] * i_2_;
			is_0_[i_1_++] += is[i--] * i_2_;
			is_0_[i_1_++] += is[i--] * i_2_;
			is_0_[i_1_++] += is[i--] * i_2_;
		}
		i_3_ += 3;
		while (i_1_ < i_3_)
			is_0_[i_1_++] += is[i--] * i_2_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_1_;
	}

	public synchronized void method12230(int[] is, int i, int i_6_) {
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 == 0)
			method12231(i_6_);
		else {
			int i_7_ = ((Class282_Sub15_Sub5_Sub2) this).anInt9844 * -99794975 << 8;
			int i_8_ = (((Class282_Sub15_Sub5_Sub2) this).anInt9856 * -1048610041 << 8);
			int i_9_ = ((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470).length << 8);
			int i_10_ = i_8_ - i_7_;
			if (i_10_ <= 0)
				((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
			int i_11_ = i;
			i_6_ += i;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 >= i_9_) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_9_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
						i_11_ = method16018(is, i_11_, i_7_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_7_)
							return;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_7_ + i_7_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
					for (;;) {
						i_11_ = method15990(is, i_11_, i_8_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_8_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_8_ + i_8_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
						i_11_ = method16018(is, i_11_, i_7_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_7_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_7_ + i_7_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_11_ = method16018(is, i_11_, i_7_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_7_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_8_ - 1 - (i_8_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) % i_10_) * -834443097);
					}
				} else {
					for (;;) {
						i_11_ = method15990(is, i_11_, i_8_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_8_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_7_ + ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) - i_7_) % i_10_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
								i_11_ = (method16018(is, i_11_, i_7_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_7_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_7_ + i_7_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_11_ = (method15990(is, i_11_, i_8_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_8_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_8_ + i_8_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_11_ = (method16018(is, i_11_, i_7_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_7_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_7_ + i_7_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_11_ = (method16018(is, i_11_, i_7_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_7_)
									return;
								int i_12_ = ((i_8_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) / i_10_);
								if (i_12_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 += i_10_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097;
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 += i_10_ * i_12_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_12_ * -485012237;
							}
						} else {
							for (;;) {
								i_11_ = (method15990(is, i_11_, i_8_, i_6_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_8_)
									return;
								int i_13_ = ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 - i_7_) / i_10_;
								if (i_13_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= i_10_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097;
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= i_10_ * i_13_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_13_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0) {
					method16018(is, i_11_, 0, i_6_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15990(is, i_11_, i_9_, i_6_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_9_) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = i_9_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	int method15990(int[] is, int i, int i_14_, int i_15_, int i_16_) {
		while (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 > 0) {
			int i_17_ = i + ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447;
			if (i_17_ > i_15_)
				i_17_ = i_15_;
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 += i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method16001(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub2) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub2) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub2) this).anInt9851) * 241181547, 0, i_17_, i_14_, this);
				else
					i = method16000(((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub2) this).anInt9849) * 1670226395, 0, i_17_, i_14_, this);
			} else if (Class253.aBool3115)
				i = (method16005(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub2) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub2) this).anInt9851 * 241181547, 0, i_17_, i_14_, this,
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_16_));
			else
				i = (method16004(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub2) this).anInt9849 * 1670226395, 0, i_17_, i_14_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_16_));
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 40))
				return i_15_;
		}
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == 256 && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method16031(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173), 0, i_15_, i_14_, this);
			return (method15992((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_15_, i_14_, this));
		}
		if (Class253.aBool3115)
			return (method16019(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, 0, i_15_, i_14_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_16_));
		return (method15996(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_15_, i_14_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_16_));
	}

	static int method15991(byte[] is, int[] is_18_, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_23_ >>= 8;
		i_20_ <<= 2;
		if ((i_21_ = i_19_ + i - (i_23_ - 1)) > i_22_)
			i_21_ = i_22_;
		i_21_ -= 3;
		while (i_19_ < i_21_) {
			is_18_[i_19_++] += is[i--] * i_20_;
			is_18_[i_19_++] += is[i--] * i_20_;
			is_18_[i_19_++] += is[i--] * i_20_;
			is_18_[i_19_++] += is[i--] * i_20_;
		}
		i_21_ += 3;
		while (i_19_ < i_21_)
			is_18_[i_19_++] += is[i--] * i_20_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_19_;
	}

	static int method15992(byte[] is, int[] is_24_, int i, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_29_ >>= 8;
		i_26_ <<= 2;
		if ((i_27_ = i_25_ + i_29_ - i) > i_28_)
			i_27_ = i_28_;
		i_27_ -= 3;
		while (i_25_ < i_27_) {
			is_24_[i_25_++] += is[i++] * i_26_;
			is_24_[i_25_++] += is[i++] * i_26_;
			is_24_[i_25_++] += is[i++] * i_26_;
			is_24_[i_25_++] += is[i++] * i_26_;
		}
		i_27_ += 3;
		while (i_25_ < i_27_)
			is_24_[i_25_++] += is[i++] * i_26_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_25_;
	}

	static int method15993(int i, int i_30_, byte[] is, int[] is_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_38_, int i_39_) {
		if (i_38_ == 0 || (i_35_ = i_33_ + (i_37_ - i_32_ + i_38_ - 257) / i_38_) > i_36_)
			i_35_ = i_36_;
		while (i_33_ < i_35_) {
			i_30_ = i_32_ >> 8;
			i = is[i_30_];
			is_31_[i_33_++] += (((i << 8) + (is[i_30_ + 1] - i) * (i_32_ & 0xff)) * i_34_ >> 6);
			i_32_ += i_38_;
		}
		if (i_38_ == 0 || (i_35_ = i_33_ + (i_37_ - i_32_ + i_38_ - 1) / i_38_) > i_36_)
			i_35_ = i_36_;
		i_30_ = i_39_;
		while (i_33_ < i_35_) {
			i = is[i_32_ >> 8];
			is_31_[i_33_++] += ((i << 8) + (i_30_ - i) * (i_32_ & 0xff)) * i_34_ >> 6;
			i_32_ += i_38_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_32_ * -834443097;
		return i_33_;
	}

	static int method15994(byte[] is, int[] is_40_, int i, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_46_ >>= 8;
		i_42_ <<= 2;
		i_43_ <<= 2;
		if ((i_44_ = i_41_ + i - (i_46_ - 1)) > i_45_)
			i_44_ = i_45_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_44_ - i_41_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_44_ - i_41_) * 1339372733);
		i_44_ -= 3;
		while (i_41_ < i_44_) {
			is_40_[i_41_++] += is[i--] * i_42_;
			i_42_ += i_43_;
			is_40_[i_41_++] += is[i--] * i_42_;
			i_42_ += i_43_;
			is_40_[i_41_++] += is[i--] * i_42_;
			i_42_ += i_43_;
			is_40_[i_41_++] += is[i--] * i_42_;
			i_42_ += i_43_;
		}
		i_44_ += 3;
		while (i_41_ < i_44_) {
			is_40_[i_41_++] += is[i--] * i_42_;
			i_42_ += i_43_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_42_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_41_;
	}

	static int method15995(int i, byte[] is, int[] is_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_48_ >>= 8;
		i_54_ >>= 8;
		i_50_ <<= 2;
		i_51_ <<= 2;
		if ((i_52_ = i_49_ + i_48_ - (i_54_ - 1)) > i_53_)
			i_52_ = i_53_;
		i_49_ <<= 1;
		i_52_ <<= 1;
		i_52_ -= 6;
		while (i_49_ < i_52_) {
			i = is[i_48_--];
			is_47_[i_49_++] += i * i_50_;
			is_47_[i_49_++] += i * i_51_;
			i = is[i_48_--];
			is_47_[i_49_++] += i * i_50_;
			is_47_[i_49_++] += i * i_51_;
			i = is[i_48_--];
			is_47_[i_49_++] += i * i_50_;
			is_47_[i_49_++] += i * i_51_;
			i = is[i_48_--];
			is_47_[i_49_++] += i * i_50_;
			is_47_[i_49_++] += i * i_51_;
		}
		i_52_ += 6;
		while (i_49_ < i_52_) {
			i = is[i_48_--];
			is_47_[i_49_++] += i * i_50_;
			is_47_[i_49_++] += i * i_51_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_48_ << 8) * -834443097;
		return i_49_ >> 1;
	}

	static int method15996(int i, int i_55_, byte[] is, int[] is_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_63_, int i_64_) {
		if (i_63_ == 0 || (i_60_ = i_58_ + (i_62_ - i_57_ + i_63_ - 257) / i_63_) > i_61_)
			i_60_ = i_61_;
		while (i_58_ < i_60_) {
			i_55_ = i_57_ >> 8;
			i = is[i_55_];
			is_56_[i_58_++] += (((i << 8) + (is[i_55_ + 1] - i) * (i_57_ & 0xff)) * i_59_ >> 6);
			i_57_ += i_63_;
		}
		if (i_63_ == 0 || (i_60_ = i_58_ + (i_62_ - i_57_ + i_63_ - 1) / i_63_) > i_61_)
			i_60_ = i_61_;
		i_55_ = i_64_;
		while (i_58_ < i_60_) {
			i = is[i_57_ >> 8];
			is_56_[i_58_++] += ((i << 8) + (i_55_ - i) * (i_57_ & 0xff)) * i_59_ >> 6;
			i_57_ += i_63_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_57_ * -834443097;
		return i_58_;
	}

	static int method15997(int i, int i_65_, byte[] is, int[] is_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_74_, int i_75_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_68_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_68_ * 1339372733);
		if (i_74_ == 0 || (i_71_ = i_68_ + (i_73_ - i_67_ + i_74_ - 257) / i_74_) > i_72_)
			i_71_ = i_72_;
		while (i_68_ < i_71_) {
			i_65_ = i_67_ >> 8;
			i = is[i_65_];
			is_66_[i_68_++] += (((i << 8) + (is[i_65_ + 1] - i) * (i_67_ & 0xff)) * i_69_ >> 6);
			i_69_ += i_70_;
			i_67_ += i_74_;
		}
		if (i_74_ == 0 || (i_71_ = i_68_ + (i_73_ - i_67_ + i_74_ - 1) / i_74_) > i_72_)
			i_71_ = i_72_;
		i_65_ = i_75_;
		while (i_68_ < i_71_) {
			i = is[i_67_ >> 8];
			is_66_[i_68_++] += ((i << 8) + (i_65_ - i) * (i_67_ & 0xff)) * i_69_ >> 6;
			i_69_ += i_70_;
			i_67_ += i_74_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_68_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_68_ * 1339372733);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = i_69_ * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_67_ * -834443097;
		return i_68_;
	}

	static int method15998(int i, int i_76_, byte[] is, int[] is_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_84_, int i_85_) {
		if (i_84_ == 0 || (i_81_ = i_79_ + (i_83_ + 256 - i_78_ + i_84_) / i_84_) > i_82_)
			i_81_ = i_82_;
		while (i_79_ < i_81_) {
			i_76_ = i_78_ >> 8;
			i = is[i_76_ - 1];
			is_77_[i_79_++] += ((i << 8) + (is[i_76_] - i) * (i_78_ & 0xff)) * i_80_ >> 6;
			i_78_ += i_84_;
		}
		if (i_84_ == 0 || (i_81_ = i_79_ + (i_83_ - i_78_ + i_84_) / i_84_) > i_82_)
			i_81_ = i_82_;
		i = i_85_;
		i_76_ = i_84_;
		while (i_79_ < i_81_) {
			is_77_[i_79_++] += (((i << 8) + (is[i_78_ >> 8] - i) * (i_78_ & 0xff)) * i_80_ >> 6);
			i_78_ += i_76_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_78_ * -834443097;
		return i_79_;
	}

	static int method15999(int i, int i_86_, byte[] is, int[] is_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_95_, int i_96_) {
		if (i_95_ == 0 || (i_92_ = i_89_ + (i_94_ + 256 - i_88_ + i_95_) / i_95_) > i_93_)
			i_92_ = i_93_;
		i_89_ <<= 1;
		i_92_ <<= 1;
		while (i_89_ < i_92_) {
			i_86_ = i_88_ >> 8;
			i = is[i_86_ - 1];
			i = (i << 8) + (is[i_86_] - i) * (i_88_ & 0xff);
			is_87_[i_89_++] += i * i_90_ >> 6;
			is_87_[i_89_++] += i * i_91_ >> 6;
			i_88_ += i_95_;
		}
		if (i_95_ == 0 || ((i_92_ = (i_89_ >> 1) + (i_94_ - i_88_ + i_95_) / i_95_) > i_93_))
			i_92_ = i_93_;
		i_92_ <<= 1;
		i_86_ = i_96_;
		while (i_89_ < i_92_) {
			i = (i_86_ << 8) + (is[i_88_ >> 8] - i_86_) * (i_88_ & 0xff);
			is_87_[i_89_++] += i * i_90_ >> 6;
			is_87_[i_89_++] += i * i_91_ >> 6;
			i_88_ += i_95_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_88_ * -834443097;
		return i_89_ >> 1;
	}

	static int method16000(byte[] is, int[] is_97_, int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_103_ >>= 8;
		i_99_ <<= 2;
		i_100_ <<= 2;
		if ((i_101_ = i_98_ + i_103_ - i) > i_102_)
			i_101_ = i_102_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_101_ - i_98_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_101_ - i_98_) * 1339372733);
		i_101_ -= 3;
		while (i_98_ < i_101_) {
			is_97_[i_98_++] += is[i++] * i_99_;
			i_99_ += i_100_;
			is_97_[i_98_++] += is[i++] * i_99_;
			i_99_ += i_100_;
			is_97_[i_98_++] += is[i++] * i_99_;
			i_99_ += i_100_;
			is_97_[i_98_++] += is[i++] * i_99_;
			i_99_ += i_100_;
		}
		i_101_ += 3;
		while (i_98_ < i_101_) {
			is_97_[i_98_++] += is[i++] * i_99_;
			i_99_ += i_100_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_99_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_98_;
	}

	static int method16001(int i, byte[] is, int[] is_104_, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_105_ >>= 8;
		i_113_ >>= 8;
		i_107_ <<= 2;
		i_108_ <<= 2;
		i_109_ <<= 2;
		i_110_ <<= 2;
		if ((i_111_ = i_106_ + i_113_ - i_105_) > i_112_)
			i_111_ = i_112_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * (i_111_ - i_106_) * 809781739);
		i_106_ <<= 1;
		i_111_ <<= 1;
		i_111_ -= 6;
		while (i_106_ < i_111_) {
			i = is[i_105_++];
			is_104_[i_106_++] += i * i_107_;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_;
			i_108_ += i_110_;
			i = is[i_105_++];
			is_104_[i_106_++] += i * i_107_;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_;
			i_108_ += i_110_;
			i = is[i_105_++];
			is_104_[i_106_++] += i * i_107_;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_;
			i_108_ += i_110_;
			i = is[i_105_++];
			is_104_[i_106_++] += i * i_107_;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_;
			i_108_ += i_110_;
		}
		i_111_ += 6;
		while (i_106_ < i_111_) {
			i = is[i_105_++];
			is_104_[i_106_++] += i * i_107_;
			i_107_ += i_109_;
			is_104_[i_106_++] += i * i_108_;
			i_108_ += i_110_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = (i_107_ >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = (i_108_ >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_105_ << 8) * -834443097;
		return i_106_ >> 1;
	}

	static int method16002(byte[] is, int[] is_114_, int i, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_120_ >>= 8;
		i_116_ <<= 2;
		i_117_ <<= 2;
		if ((i_118_ = i_115_ + i - (i_120_ - 1)) > i_119_)
			i_118_ = i_119_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_118_ - i_115_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_118_ - i_115_) * 1339372733);
		i_118_ -= 3;
		while (i_115_ < i_118_) {
			is_114_[i_115_++] += is[i--] * i_116_;
			i_116_ += i_117_;
			is_114_[i_115_++] += is[i--] * i_116_;
			i_116_ += i_117_;
			is_114_[i_115_++] += is[i--] * i_116_;
			i_116_ += i_117_;
			is_114_[i_115_++] += is[i--] * i_116_;
			i_116_ += i_117_;
		}
		i_118_ += 3;
		while (i_115_ < i_118_) {
			is_114_[i_115_++] += is[i--] * i_116_;
			i_116_ += i_117_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_116_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_115_;
	}

	static int method16003(int i, byte[] is, int[] is_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_122_ >>= 8;
		i_130_ >>= 8;
		i_124_ <<= 2;
		i_125_ <<= 2;
		i_126_ <<= 2;
		i_127_ <<= 2;
		if ((i_128_ = i_123_ + i_122_ - (i_130_ - 1)) > i_129_)
			i_128_ = i_129_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * (i_128_ - i_123_) * 809781739);
		i_123_ <<= 1;
		i_128_ <<= 1;
		i_128_ -= 6;
		while (i_123_ < i_128_) {
			i = is[i_122_--];
			is_121_[i_123_++] += i * i_124_;
			i_124_ += i_126_;
			is_121_[i_123_++] += i * i_125_;
			i_125_ += i_127_;
			i = is[i_122_--];
			is_121_[i_123_++] += i * i_124_;
			i_124_ += i_126_;
			is_121_[i_123_++] += i * i_125_;
			i_125_ += i_127_;
			i = is[i_122_--];
			is_121_[i_123_++] += i * i_124_;
			i_124_ += i_126_;
			is_121_[i_123_++] += i * i_125_;
			i_125_ += i_127_;
			i = is[i_122_--];
			is_121_[i_123_++] += i * i_124_;
			i_124_ += i_126_;
			is_121_[i_123_++] += i * i_125_;
			i_125_ += i_127_;
		}
		i_128_ += 6;
		while (i_123_ < i_128_) {
			i = is[i_122_--];
			is_121_[i_123_++] += i * i_124_;
			i_124_ += i_126_;
			is_121_[i_123_++] += i * i_125_;
			i_125_ += i_127_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = (i_124_ >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = (i_125_ >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_122_ << 8) * -834443097;
		return i_123_ >> 1;
	}

	static int method16004(int i, int i_131_, byte[] is, int[] is_132_, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_140_, int i_141_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_134_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_134_ * 1339372733);
		if (i_140_ == 0 || ((i_137_ = i_134_ + (i_139_ - i_133_ + i_140_ - 257) / i_140_) > i_138_))
			i_137_ = i_138_;
		while (i_134_ < i_137_) {
			i_131_ = i_133_ >> 8;
			i = is[i_131_];
			is_132_[i_134_++] += (((i << 8) + (is[i_131_ + 1] - i) * (i_133_ & 0xff)) * i_135_) >> 6;
			i_135_ += i_136_;
			i_133_ += i_140_;
		}
		if (i_140_ == 0 || ((i_137_ = i_134_ + (i_139_ - i_133_ + i_140_ - 1) / i_140_) > i_138_))
			i_137_ = i_138_;
		i_131_ = i_141_;
		while (i_134_ < i_137_) {
			i = is[i_133_ >> 8];
			is_132_[i_134_++] += ((i << 8) + (i_131_ - i) * (i_133_ & 0xff)) * i_135_ >> 6;
			i_135_ += i_136_;
			i_133_ += i_140_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_134_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_134_ * 1339372733);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = i_135_ * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_133_ * -834443097;
		return i_134_;
	}

	static int method16005(int i, int i_142_, byte[] is, int[] is_143_, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_153_, int i_154_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_145_ * 809781739);
		if (i_153_ == 0 || ((i_150_ = i_145_ + (i_152_ - i_144_ + i_153_ - 257) / i_153_) > i_151_))
			i_150_ = i_151_;
		i_145_ <<= 1;
		i_150_ <<= 1;
		while (i_145_ < i_150_) {
			i_142_ = i_144_ >> 8;
			i = is[i_142_];
			i = (i << 8) + (is[i_142_ + 1] - i) * (i_144_ & 0xff);
			is_143_[i_145_++] += i * i_146_ >> 6;
			i_146_ += i_148_;
			is_143_[i_145_++] += i * i_147_ >> 6;
			i_147_ += i_149_;
			i_144_ += i_153_;
		}
		if (i_153_ == 0 || (i_150_ = (i_145_ >> 1) + (i_152_ - i_144_ + i_153_ - 1) / i_153_) > i_151_)
			i_150_ = i_151_;
		i_150_ <<= 1;
		i_142_ = i_154_;
		while (i_145_ < i_150_) {
			i = is[i_144_ >> 8];
			i = (i << 8) + (i_142_ - i) * (i_144_ & 0xff);
			is_143_[i_145_++] += i * i_146_ >> 6;
			i_146_ += i_148_;
			is_143_[i_145_++] += i * i_147_ >> 6;
			i_147_ += i_149_;
			i_144_ += i_153_;
		}
		i_145_ >>= 1;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_145_ * 809781739);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = i_146_ * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = i_147_ * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_144_ * -834443097;
		return i_145_;
	}

	static int method16006(int i, int i_155_, byte[] is, int[] is_156_, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_164_, int i_165_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_158_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_158_ * 1339372733);
		if (i_164_ == 0 || ((i_161_ = i_158_ + (i_163_ + 256 - i_157_ + i_164_) / i_164_) > i_162_))
			i_161_ = i_162_;
		while (i_158_ < i_161_) {
			i_155_ = i_157_ >> 8;
			i = is[i_155_ - 1];
			is_156_[i_158_++] += (((i << 8) + (is[i_155_] - i) * (i_157_ & 0xff)) * i_159_ >> 6);
			i_159_ += i_160_;
			i_157_ += i_164_;
		}
		if (i_164_ == 0 || ((i_161_ = i_158_ + (i_163_ - i_157_ + i_164_) / i_164_) > i_162_))
			i_161_ = i_162_;
		i = i_165_;
		i_155_ = i_164_;
		while (i_158_ < i_161_) {
			is_156_[i_158_++] += (((i << 8) + (is[i_157_ >> 8] - i) * (i_157_ & 0xff)) * i_159_) >> 6;
			i_159_ += i_160_;
			i_157_ += i_155_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_158_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_158_ * 1339372733);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = i_159_ * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_157_ * -834443097;
		return i_158_;
	}

	static int method16007(int i, int i_166_, byte[] is, int[] is_167_, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_177_, int i_178_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_169_ * 809781739);
		if (i_177_ == 0 || ((i_174_ = i_169_ + (i_176_ + 256 - i_168_ + i_177_) / i_177_) > i_175_))
			i_174_ = i_175_;
		i_169_ <<= 1;
		i_174_ <<= 1;
		while (i_169_ < i_174_) {
			i_166_ = i_168_ >> 8;
			i = is[i_166_ - 1];
			i = (i << 8) + (is[i_166_] - i) * (i_168_ & 0xff);
			is_167_[i_169_++] += i * i_170_ >> 6;
			i_170_ += i_172_;
			is_167_[i_169_++] += i * i_171_ >> 6;
			i_171_ += i_173_;
			i_168_ += i_177_;
		}
		if (i_177_ == 0 || ((i_174_ = (i_169_ >> 1) + (i_176_ - i_168_ + i_177_) / i_177_) > i_175_))
			i_174_ = i_175_;
		i_174_ <<= 1;
		i_166_ = i_178_;
		while (i_169_ < i_174_) {
			i = (i_166_ << 8) + (is[i_168_ >> 8] - i_166_) * (i_168_ & 0xff);
			is_167_[i_169_++] += i * i_170_ >> 6;
			i_170_ += i_172_;
			is_167_[i_169_++] += i * i_171_ >> 6;
			i_171_ += i_173_;
			i_168_ += i_177_;
		}
		i_169_ >>= 1;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_169_ * 809781739);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = i_170_ * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = i_171_ * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_168_ * -834443097;
		return i_169_;
	}

	public synchronized void method12240(int[] is, int i, int i_179_) {
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 == 0)
			method12231(i_179_);
		else {
			int i_180_ = ((Class282_Sub15_Sub5_Sub2) this).anInt9844 * -99794975 << 8;
			int i_181_ = (((Class282_Sub15_Sub5_Sub2) this).anInt9856 * -1048610041 << 8);
			int i_182_ = ((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470).length << 8);
			int i_183_ = i_181_ - i_180_;
			if (i_183_ <= 0)
				((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
			int i_184_ = i;
			i_179_ += i;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 >= i_182_) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_182_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
						i_184_ = method16018(is, i_184_, i_180_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_180_)
							return;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_180_ + i_180_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
					for (;;) {
						i_184_ = method15990(is, i_184_, i_181_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_181_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_181_ + i_181_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
						i_184_ = method16018(is, i_184_, i_180_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_180_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_180_ + i_180_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_184_ = method16018(is, i_184_, i_180_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_180_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_181_ - 1 - (i_181_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) % i_183_) * -834443097);
					}
				} else {
					for (;;) {
						i_184_ = method15990(is, i_184_, i_181_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_181_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_180_ + ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) - i_180_) % i_183_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
								i_184_ = (method16018(is, i_184_, i_180_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_180_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_180_ + i_180_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_184_ = (method15990(is, i_184_, i_181_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_181_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_181_ + i_181_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_184_ = (method16018(is, i_184_, i_180_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_180_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_180_ + i_180_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_184_ = (method16018(is, i_184_, i_180_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_180_)
									return;
								int i_185_ = ((i_181_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) / i_183_);
								if (i_185_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 += (i_183_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 += i_183_ * i_185_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_185_ * -485012237;
							}
						} else {
							for (;;) {
								i_184_ = (method15990(is, i_184_, i_181_, i_179_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_181_)
									return;
								int i_186_ = (((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 - i_180_) / i_183_);
								if (i_186_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= (i_183_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= i_183_ * i_186_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_186_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0) {
					method16018(is, i_184_, 0, i_179_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15990(is, i_184_, i_182_, i_179_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_182_) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = i_182_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	public synchronized void method12241(int[] is, int i, int i_187_) {
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 == 0)
			method12231(i_187_);
		else {
			int i_188_ = ((Class282_Sub15_Sub5_Sub2) this).anInt9844 * -99794975 << 8;
			int i_189_ = (((Class282_Sub15_Sub5_Sub2) this).anInt9856 * -1048610041 << 8);
			int i_190_ = ((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470).length << 8);
			int i_191_ = i_189_ - i_188_;
			if (i_191_ <= 0)
				((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
			int i_192_ = i;
			i_187_ += i;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 >= i_190_) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_190_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
						i_192_ = method16018(is, i_192_, i_188_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_188_)
							return;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_188_ + i_188_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
					for (;;) {
						i_192_ = method15990(is, i_192_, i_189_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_189_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_189_ + i_189_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
						i_192_ = method16018(is, i_192_, i_188_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_188_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_188_ + i_188_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_192_ = method16018(is, i_192_, i_188_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_188_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_189_ - 1 - (i_189_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) % i_191_) * -834443097);
					}
				} else {
					for (;;) {
						i_192_ = method15990(is, i_192_, i_189_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_189_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_188_ + ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) - i_188_) % i_191_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
								i_192_ = (method16018(is, i_192_, i_188_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_188_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_188_ + i_188_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_192_ = (method15990(is, i_192_, i_189_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_189_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_189_ + i_189_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_192_ = (method16018(is, i_192_, i_188_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_188_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_188_ + i_188_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_192_ = (method16018(is, i_192_, i_188_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_188_)
									return;
								int i_193_ = ((i_189_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) / i_191_);
								if (i_193_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 += (i_191_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 += i_191_ * i_193_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_193_ * -485012237;
							}
						} else {
							for (;;) {
								i_192_ = (method15990(is, i_192_, i_189_, i_187_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_189_)
									return;
								int i_194_ = (((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 - i_188_) / i_191_);
								if (i_194_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= (i_191_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= i_191_ * i_194_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_194_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0) {
					method16018(is, i_192_, 0, i_187_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15990(is, i_192_, i_190_, i_187_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_190_) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = i_190_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	static int method16008(int i, byte[] is, int[] is_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_196_ >>= 8;
		i_202_ >>= 8;
		i_198_ <<= 2;
		i_199_ <<= 2;
		if ((i_200_ = i_197_ + i_202_ - i_196_) > i_201_)
			i_200_ = i_201_;
		i_197_ <<= 1;
		i_200_ <<= 1;
		i_200_ -= 6;
		while (i_197_ < i_200_) {
			i = is[i_196_++];
			is_195_[i_197_++] += i * i_198_;
			is_195_[i_197_++] += i * i_199_;
			i = is[i_196_++];
			is_195_[i_197_++] += i * i_198_;
			is_195_[i_197_++] += i * i_199_;
			i = is[i_196_++];
			is_195_[i_197_++] += i * i_198_;
			is_195_[i_197_++] += i * i_199_;
			i = is[i_196_++];
			is_195_[i_197_++] += i * i_198_;
			is_195_[i_197_++] += i * i_199_;
		}
		i_200_ += 6;
		while (i_197_ < i_200_) {
			i = is[i_196_++];
			is_195_[i_197_++] += i * i_198_;
			is_195_[i_197_++] += i * i_199_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_196_ << 8) * -834443097;
		return i_197_ >> 1;
	}

	static int method16009(int i, byte[] is, int[] is_203_, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, int i_209_, int i_210_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_204_ >>= 8;
		i_210_ >>= 8;
		i_206_ <<= 2;
		i_207_ <<= 2;
		if ((i_208_ = i_205_ + i_210_ - i_204_) > i_209_)
			i_208_ = i_209_;
		i_205_ <<= 1;
		i_208_ <<= 1;
		i_208_ -= 6;
		while (i_205_ < i_208_) {
			i = is[i_204_++];
			is_203_[i_205_++] += i * i_206_;
			is_203_[i_205_++] += i * i_207_;
			i = is[i_204_++];
			is_203_[i_205_++] += i * i_206_;
			is_203_[i_205_++] += i * i_207_;
			i = is[i_204_++];
			is_203_[i_205_++] += i * i_206_;
			is_203_[i_205_++] += i * i_207_;
			i = is[i_204_++];
			is_203_[i_205_++] += i * i_206_;
			is_203_[i_205_++] += i * i_207_;
		}
		i_208_ += 6;
		while (i_205_ < i_208_) {
			i = is[i_204_++];
			is_203_[i_205_++] += i * i_206_;
			is_203_[i_205_++] += i * i_207_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_204_ << 8) * -834443097;
		return i_205_ >> 1;
	}

	int method16010(int[] is, int i, int i_211_, int i_212_, int i_213_) {
		while (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 > 0) {
			int i_214_ = i + ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447;
			if (i_214_ > i_212_)
				i_214_ = i_212_;
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 += i * 1156515807;
			if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == -256) && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method16003(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub2) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub2) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub2) this).anInt9851) * 241181547, 0, i_214_, i_211_, this);
				else
					i = method16002(((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub2) this).anInt9849) * 1670226395, 0, i_214_, i_211_, this);
			} else if (Class253.aBool3115)
				i = (method16007(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub2) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub2) this).anInt9851 * 241181547, 0, i_214_, i_211_, this,
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_213_));
			else
				i = (method16006(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub2) this).anInt9849 * 1670226395, 0, i_214_, i_211_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_213_));
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 56))
				return i_212_;
		}
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == -256 && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15995(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173), 0, i_212_, i_211_, this);
			return (method15991((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_212_, i_211_, this));
		}
		if (Class253.aBool3115)
			return (method15999(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, 0, i_212_, i_211_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_213_));
		return (method15998(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_212_, i_211_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_213_));
	}

	static int method16011(int i, int i_215_, byte[] is, int[] is_216_, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_223_, int i_224_) {
		if (i_223_ == 0 || ((i_220_ = i_218_ + (i_222_ - i_217_ + i_223_ - 257) / i_223_) > i_221_))
			i_220_ = i_221_;
		while (i_218_ < i_220_) {
			i_215_ = i_217_ >> 8;
			i = is[i_215_];
			is_216_[i_218_++] += (((i << 8) + (is[i_215_ + 1] - i) * (i_217_ & 0xff)) * i_219_) >> 6;
			i_217_ += i_223_;
		}
		if (i_223_ == 0 || ((i_220_ = i_218_ + (i_222_ - i_217_ + i_223_ - 1) / i_223_) > i_221_))
			i_220_ = i_221_;
		i_215_ = i_224_;
		while (i_218_ < i_220_) {
			i = is[i_217_ >> 8];
			is_216_[i_218_++] += ((i << 8) + (i_215_ - i) * (i_217_ & 0xff)) * i_219_ >> 6;
			i_217_ += i_223_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_217_ * -834443097;
		return i_218_;
	}

	static int method16012(byte[] is, int[] is_225_, int i, int i_226_, int i_227_, int i_228_, int i_229_, int i_230_, int i_231_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_231_ >>= 8;
		i_227_ <<= 2;
		i_228_ <<= 2;
		if ((i_229_ = i_226_ + i - (i_231_ - 1)) > i_230_)
			i_229_ = i_230_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_229_ - i_226_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_229_ - i_226_) * 1339372733);
		i_229_ -= 3;
		while (i_226_ < i_229_) {
			is_225_[i_226_++] += is[i--] * i_227_;
			i_227_ += i_228_;
			is_225_[i_226_++] += is[i--] * i_227_;
			i_227_ += i_228_;
			is_225_[i_226_++] += is[i--] * i_227_;
			i_227_ += i_228_;
			is_225_[i_226_++] += is[i--] * i_227_;
			i_227_ += i_228_;
		}
		i_229_ += 3;
		while (i_226_ < i_229_) {
			is_225_[i_226_++] += is[i--] * i_227_;
			i_227_ += i_228_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_227_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_226_;
	}

	Class282_Sub15_Sub5_Sub2(Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2, int i, int i_232_, int i_233_) {
		((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601 = class282_sub26_sub1_sub2;
		((Class282_Sub15_Sub5_Sub2) this).anInt9844 = class282_sub26_sub1_sub2.anInt9749 * 1301352263;
		((Class282_Sub15_Sub5_Sub2) this).anInt9856 = (((Class282_Sub26_Sub1_Sub2) class282_sub26_sub1_sub2).anInt9751 * 849408595);
		((Class282_Sub15_Sub5_Sub2) this).aBool9857 = class282_sub26_sub1_sub2.aBool9752;
		((Class282_Sub15_Sub5_Sub2) this).anInt9855 = i * 1927994969;
		((Class282_Sub15_Sub5_Sub2) this).anInt9846 = i_232_ * -298675253;
		((Class282_Sub15_Sub5_Sub2) this).anInt9847 = i_233_ * 375820671;
		((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 0;
		method15332((byte) -21);
	}

	static int method16013(int i, byte[] is, int[] is_234_, int i_235_, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_, int i_241_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_235_ >>= 8;
		i_241_ >>= 8;
		i_237_ <<= 2;
		i_238_ <<= 2;
		if ((i_239_ = i_236_ + i_241_ - i_235_) > i_240_)
			i_239_ = i_240_;
		i_236_ <<= 1;
		i_239_ <<= 1;
		i_239_ -= 6;
		while (i_236_ < i_239_) {
			i = is[i_235_++];
			is_234_[i_236_++] += i * i_237_;
			is_234_[i_236_++] += i * i_238_;
			i = is[i_235_++];
			is_234_[i_236_++] += i * i_237_;
			is_234_[i_236_++] += i * i_238_;
			i = is[i_235_++];
			is_234_[i_236_++] += i * i_237_;
			is_234_[i_236_++] += i * i_238_;
			i = is[i_235_++];
			is_234_[i_236_++] += i * i_237_;
			is_234_[i_236_++] += i * i_238_;
		}
		i_239_ += 6;
		while (i_236_ < i_239_) {
			i = is[i_235_++];
			is_234_[i_236_++] += i * i_237_;
			is_234_[i_236_++] += i * i_238_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_235_ << 8) * -834443097;
		return i_236_ >> 1;
	}

	static int method16014(byte[] is, int[] is_242_, int i, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_248_ >>= 8;
		i_244_ <<= 2;
		i_245_ <<= 2;
		if ((i_246_ = i_243_ + i_248_ - i) > i_247_)
			i_246_ = i_247_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_246_ - i_243_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_246_ - i_243_) * 1339372733);
		i_246_ -= 3;
		while (i_243_ < i_246_) {
			is_242_[i_243_++] += is[i++] * i_244_;
			i_244_ += i_245_;
			is_242_[i_243_++] += is[i++] * i_244_;
			i_244_ += i_245_;
			is_242_[i_243_++] += is[i++] * i_244_;
			i_244_ += i_245_;
			is_242_[i_243_++] += is[i++] * i_244_;
			i_244_ += i_245_;
		}
		i_246_ += 3;
		while (i_243_ < i_246_) {
			is_242_[i_243_++] += is[i++] * i_244_;
			i_244_ += i_245_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_244_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_243_;
	}

	static int method16015(int i, byte[] is, int[] is_249_, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_250_ >>= 8;
		i_256_ >>= 8;
		i_252_ <<= 2;
		i_253_ <<= 2;
		if ((i_254_ = i_251_ + i_256_ - i_250_) > i_255_)
			i_254_ = i_255_;
		i_251_ <<= 1;
		i_254_ <<= 1;
		i_254_ -= 6;
		while (i_251_ < i_254_) {
			i = is[i_250_++];
			is_249_[i_251_++] += i * i_252_;
			is_249_[i_251_++] += i * i_253_;
			i = is[i_250_++];
			is_249_[i_251_++] += i * i_252_;
			is_249_[i_251_++] += i * i_253_;
			i = is[i_250_++];
			is_249_[i_251_++] += i * i_252_;
			is_249_[i_251_++] += i * i_253_;
			i = is[i_250_++];
			is_249_[i_251_++] += i * i_252_;
			is_249_[i_251_++] += i * i_253_;
		}
		i_254_ += 6;
		while (i_251_ < i_254_) {
			i = is[i_250_++];
			is_249_[i_251_++] += i * i_252_;
			is_249_[i_251_++] += i * i_253_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_250_ << 8) * -834443097;
		return i_251_ >> 1;
	}

	static int method16016(int i, int i_257_, byte[] is, int[] is_258_, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_, int i_265_, int i_266_, int i_267_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_268_, int i_269_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_260_ * 809781739);
		if (i_268_ == 0 || ((i_265_ = i_260_ + (i_267_ + 256 - i_259_ + i_268_) / i_268_) > i_266_))
			i_265_ = i_266_;
		i_260_ <<= 1;
		i_265_ <<= 1;
		while (i_260_ < i_265_) {
			i_257_ = i_259_ >> 8;
			i = is[i_257_ - 1];
			i = (i << 8) + (is[i_257_] - i) * (i_259_ & 0xff);
			is_258_[i_260_++] += i * i_261_ >> 6;
			i_261_ += i_263_;
			is_258_[i_260_++] += i * i_262_ >> 6;
			i_262_ += i_264_;
			i_259_ += i_268_;
		}
		if (i_268_ == 0 || ((i_265_ = (i_260_ >> 1) + (i_267_ - i_259_ + i_268_) / i_268_) > i_266_))
			i_265_ = i_266_;
		i_265_ <<= 1;
		i_257_ = i_269_;
		while (i_260_ < i_265_) {
			i = (i_257_ << 8) + (is[i_259_ >> 8] - i_257_) * (i_259_ & 0xff);
			is_258_[i_260_++] += i * i_261_ >> 6;
			i_261_ += i_263_;
			is_258_[i_260_++] += i * i_262_ >> 6;
			i_262_ += i_264_;
			i_259_ += i_268_;
		}
		i_260_ >>= 1;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_260_ * 809781739);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = i_261_ * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = i_262_ * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_259_ * -834443097;
		return i_260_;
	}

	static int method16017(byte[] is, int[] is_270_, int i, int i_271_, int i_272_, int i_273_, int i_274_, int i_275_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_275_ >>= 8;
		i_272_ <<= 2;
		if ((i_273_ = i_271_ + i - (i_275_ - 1)) > i_274_)
			i_273_ = i_274_;
		i_273_ -= 3;
		while (i_271_ < i_273_) {
			is_270_[i_271_++] += is[i--] * i_272_;
			is_270_[i_271_++] += is[i--] * i_272_;
			is_270_[i_271_++] += is[i--] * i_272_;
			is_270_[i_271_++] += is[i--] * i_272_;
		}
		i_273_ += 3;
		while (i_271_ < i_273_)
			is_270_[i_271_++] += is[i--] * i_272_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_271_;
	}

	int method16018(int[] is, int i, int i_276_, int i_277_, int i_278_) {
		while (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 > 0) {
			int i_279_ = i + ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447;
			if (i_279_ > i_277_)
				i_279_ = i_277_;
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 += i * 1156515807;
			if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == -256) && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method16003(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub2) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub2) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub2) this).anInt9851) * 241181547, 0, i_279_, i_276_, this);
				else
					i = method16002(((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub2) this).anInt9849) * 1670226395, 0, i_279_, i_276_, this);
			} else if (Class253.aBool3115)
				i = (method16007(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub2) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub2) this).anInt9851 * 241181547, 0, i_279_, i_276_, this,
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_278_));
			else
				i = (method16006(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub2) this).anInt9849 * 1670226395, 0, i_279_, i_276_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_278_));
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) 65))
				return i_277_;
		}
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == -256 && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15995(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173), 0, i_277_, i_276_, this);
			return (method15991((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_277_, i_276_, this));
		}
		if (Class253.aBool3115)
			return (method15999(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, 0, i_277_, i_276_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_278_));
		return (method15998(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_277_, i_276_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_278_));
	}

	static int method16019(int i, int i_280_, byte[] is, int[] is_281_, int i_282_, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_289_, int i_290_) {
		if (i_289_ == 0 || ((i_286_ = i_283_ + (i_288_ - i_282_ + i_289_ - 257) / i_289_) > i_287_))
			i_286_ = i_287_;
		i_283_ <<= 1;
		i_286_ <<= 1;
		while (i_283_ < i_286_) {
			i_280_ = i_282_ >> 8;
			i = is[i_280_];
			i = (i << 8) + (is[i_280_ + 1] - i) * (i_282_ & 0xff);
			is_281_[i_283_++] += i * i_284_ >> 6;
			is_281_[i_283_++] += i * i_285_ >> 6;
			i_282_ += i_289_;
		}
		if (i_289_ == 0 || (i_286_ = (i_283_ >> 1) + (i_288_ - i_282_ + i_289_ - 1) / i_289_) > i_287_)
			i_286_ = i_287_;
		i_286_ <<= 1;
		i_280_ = i_290_;
		while (i_283_ < i_286_) {
			i = is[i_282_ >> 8];
			i = (i << 8) + (i_280_ - i) * (i_282_ & 0xff);
			is_281_[i_283_++] += i * i_284_ >> 6;
			is_281_[i_283_++] += i * i_285_ >> 6;
			i_282_ += i_289_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_282_ * -834443097;
		return i_283_ >> 1;
	}

	static int method16020(byte[] is, int[] is_291_, int i, int i_292_, int i_293_, int i_294_, int i_295_, int i_296_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_296_ >>= 8;
		i_293_ <<= 2;
		if ((i_294_ = i_292_ + i - (i_296_ - 1)) > i_295_)
			i_294_ = i_295_;
		i_294_ -= 3;
		while (i_292_ < i_294_) {
			is_291_[i_292_++] += is[i--] * i_293_;
			is_291_[i_292_++] += is[i--] * i_293_;
			is_291_[i_292_++] += is[i--] * i_293_;
			is_291_[i_292_++] += is[i--] * i_293_;
		}
		i_294_ += 3;
		while (i_292_ < i_294_)
			is_291_[i_292_++] += is[i--] * i_293_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_292_;
	}

	static int method16021(byte[] is, int[] is_297_, int i, int i_298_, int i_299_, int i_300_, int i_301_, int i_302_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_302_ >>= 8;
		i_299_ <<= 2;
		if ((i_300_ = i_298_ + i_302_ - i) > i_301_)
			i_300_ = i_301_;
		i_300_ -= 3;
		while (i_298_ < i_300_) {
			is_297_[i_298_++] += is[i++] * i_299_;
			is_297_[i_298_++] += is[i++] * i_299_;
			is_297_[i_298_++] += is[i++] * i_299_;
			is_297_[i_298_++] += is[i++] * i_299_;
		}
		i_300_ += 3;
		while (i_298_ < i_300_)
			is_297_[i_298_++] += is[i++] * i_299_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_298_;
	}

	int method16022(int[] is, int i, int i_303_, int i_304_, int i_305_) {
		while (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 > 0) {
			int i_306_ = i + ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447;
			if (i_306_ > i_304_)
				i_306_ = i_304_;
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 += i * 1156515807;
			if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == -256) && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
				if (Class253.aBool3115)
					i = method16003(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845) * 1784001117, (((Class282_Sub15_Sub5_Sub2) this).anInt9850) * 2085185173, (((Class282_Sub15_Sub5_Sub2) this).anInt9852) * 1923898617, (((Class282_Sub15_Sub5_Sub2) this).anInt9851) * 241181547, 0, i_306_, i_303_, this);
				else
					i = method16002(((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449, i, (((Class282_Sub15_Sub5_Sub2) this).anInt9848) * -217803069, (((Class282_Sub15_Sub5_Sub2) this).anInt9849) * 1670226395, 0, i_306_, i_303_, this);
			} else if (Class253.aBool3115)
				i = (method16007(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, ((Class282_Sub15_Sub5_Sub2) this).anInt9852 * 1923898617, ((Class282_Sub15_Sub5_Sub2) this).anInt9851 * 241181547, 0, i_306_, i_303_, this,
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_305_));
			else
				i = (method16006(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, ((Class282_Sub15_Sub5_Sub2) this).anInt9849 * 1670226395, 0, i_306_, i_303_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_305_));
			((Class282_Sub15_Sub5_Sub2) this).anInt9858 -= i * 1156515807;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 != 0)
				return i;
			if (method15324((byte) -57))
				return i_304_;
		}
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 == -256 && (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 & 0xff) == 0) {
			if (Class253.aBool3115)
				return method15995(0, ((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470, is, (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449), i, (((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117), (((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173), 0, i_304_, i_303_, this);
			return (method15991((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_304_, i_303_, this));
		}
		if (Class253.aBool3115)
			return (method15999(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9845 * 1784001117, ((Class282_Sub15_Sub5_Sub2) this).anInt9850 * 2085185173, 0, i_304_, i_303_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_305_));
		return (method15998(0, 0, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470), is, ((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449, i, ((Class282_Sub15_Sub5_Sub2) this).anInt9848 * -217803069, 0, i_304_, i_303_, this, ((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111, i_305_));
	}

	static int method16023(int i, int i_307_, byte[] is, int[] is_308_, int i_309_, int i_310_, int i_311_, int i_312_, int i_313_, int i_314_, int i_315_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_316_, int i_317_) {
		if (i_316_ == 0 || ((i_313_ = i_310_ + (i_315_ - i_309_ + i_316_ - 257) / i_316_) > i_314_))
			i_313_ = i_314_;
		i_310_ <<= 1;
		i_313_ <<= 1;
		while (i_310_ < i_313_) {
			i_307_ = i_309_ >> 8;
			i = is[i_307_];
			i = (i << 8) + (is[i_307_ + 1] - i) * (i_309_ & 0xff);
			is_308_[i_310_++] += i * i_311_ >> 6;
			is_308_[i_310_++] += i * i_312_ >> 6;
			i_309_ += i_316_;
		}
		if (i_316_ == 0 || (i_313_ = (i_310_ >> 1) + (i_315_ - i_309_ + i_316_ - 1) / i_316_) > i_314_)
			i_313_ = i_314_;
		i_313_ <<= 1;
		i_307_ = i_317_;
		while (i_310_ < i_313_) {
			i = is[i_309_ >> 8];
			i = (i << 8) + (i_307_ - i) * (i_309_ & 0xff);
			is_308_[i_310_++] += i * i_311_ >> 6;
			is_308_[i_310_++] += i * i_312_ >> 6;
			i_309_ += i_316_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_309_ * -834443097;
		return i_310_ >> 1;
	}

	static int method16024(int i, int i_318_, byte[] is, int[] is_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_327_, int i_328_) {
		if (i_327_ == 0 || ((i_324_ = i_321_ + (i_326_ - i_320_ + i_327_ - 257) / i_327_) > i_325_))
			i_324_ = i_325_;
		i_321_ <<= 1;
		i_324_ <<= 1;
		while (i_321_ < i_324_) {
			i_318_ = i_320_ >> 8;
			i = is[i_318_];
			i = (i << 8) + (is[i_318_ + 1] - i) * (i_320_ & 0xff);
			is_319_[i_321_++] += i * i_322_ >> 6;
			is_319_[i_321_++] += i * i_323_ >> 6;
			i_320_ += i_327_;
		}
		if (i_327_ == 0 || (i_324_ = (i_321_ >> 1) + (i_326_ - i_320_ + i_327_ - 1) / i_327_) > i_325_)
			i_324_ = i_325_;
		i_324_ <<= 1;
		i_318_ = i_328_;
		while (i_321_ < i_324_) {
			i = is[i_320_ >> 8];
			i = (i << 8) + (i_318_ - i) * (i_320_ & 0xff);
			is_319_[i_321_++] += i * i_322_ >> 6;
			is_319_[i_321_++] += i * i_323_ >> 6;
			i_320_ += i_327_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_320_ * -834443097;
		return i_321_ >> 1;
	}

	static int method16025(int i, int i_329_, byte[] is, int[] is_330_, int i_331_, int i_332_, int i_333_, int i_334_, int i_335_, int i_336_, int i_337_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_338_, int i_339_) {
		if (i_338_ == 0 || ((i_335_ = i_332_ + (i_337_ - i_331_ + i_338_ - 257) / i_338_) > i_336_))
			i_335_ = i_336_;
		i_332_ <<= 1;
		i_335_ <<= 1;
		while (i_332_ < i_335_) {
			i_329_ = i_331_ >> 8;
			i = is[i_329_];
			i = (i << 8) + (is[i_329_ + 1] - i) * (i_331_ & 0xff);
			is_330_[i_332_++] += i * i_333_ >> 6;
			is_330_[i_332_++] += i * i_334_ >> 6;
			i_331_ += i_338_;
		}
		if (i_338_ == 0 || (i_335_ = (i_332_ >> 1) + (i_337_ - i_331_ + i_338_ - 1) / i_338_) > i_336_)
			i_335_ = i_336_;
		i_335_ <<= 1;
		i_329_ = i_339_;
		while (i_332_ < i_335_) {
			i = is[i_331_ >> 8];
			i = (i << 8) + (i_329_ - i) * (i_331_ & 0xff);
			is_330_[i_332_++] += i * i_333_ >> 6;
			is_330_[i_332_++] += i * i_334_ >> 6;
			i_331_ += i_338_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_331_ * -834443097;
		return i_332_ >> 1;
	}

	static int method16026(int i, int i_340_, byte[] is, int[] is_341_, int i_342_, int i_343_, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_349_, int i_350_) {
		if (i_349_ == 0 || ((i_346_ = i_343_ + (i_348_ + 256 - i_342_ + i_349_) / i_349_) > i_347_))
			i_346_ = i_347_;
		i_343_ <<= 1;
		i_346_ <<= 1;
		while (i_343_ < i_346_) {
			i_340_ = i_342_ >> 8;
			i = is[i_340_ - 1];
			i = (i << 8) + (is[i_340_] - i) * (i_342_ & 0xff);
			is_341_[i_343_++] += i * i_344_ >> 6;
			is_341_[i_343_++] += i * i_345_ >> 6;
			i_342_ += i_349_;
		}
		if (i_349_ == 0 || ((i_346_ = (i_343_ >> 1) + (i_348_ - i_342_ + i_349_) / i_349_) > i_347_))
			i_346_ = i_347_;
		i_346_ <<= 1;
		i_340_ = i_350_;
		while (i_343_ < i_346_) {
			i = (i_340_ << 8) + (is[i_342_ >> 8] - i_340_) * (i_342_ & 0xff);
			is_341_[i_343_++] += i * i_344_ >> 6;
			is_341_[i_343_++] += i * i_345_ >> 6;
			i_342_ += i_349_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_342_ * -834443097;
		return i_343_ >> 1;
	}

	static int method16027(byte[] is, int[] is_351_, int i, int i_352_, int i_353_, int i_354_, int i_355_, int i_356_, int i_357_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_357_ >>= 8;
		i_353_ <<= 2;
		i_354_ <<= 2;
		if ((i_355_ = i_352_ + i_357_ - i) > i_356_)
			i_355_ = i_356_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_355_ - i_352_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_355_ - i_352_) * 1339372733);
		i_355_ -= 3;
		while (i_352_ < i_355_) {
			is_351_[i_352_++] += is[i++] * i_353_;
			i_353_ += i_354_;
			is_351_[i_352_++] += is[i++] * i_353_;
			i_353_ += i_354_;
			is_351_[i_352_++] += is[i++] * i_353_;
			i_353_ += i_354_;
			is_351_[i_352_++] += is[i++] * i_353_;
			i_353_ += i_354_;
		}
		i_355_ += 3;
		while (i_352_ < i_355_) {
			is_351_[i_352_++] += is[i++] * i_353_;
			i_353_ += i_354_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_353_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_352_;
	}

	static int method16028(int i, byte[] is, int[] is_358_, int i_359_, int i_360_, int i_361_, int i_362_, int i_363_, int i_364_, int i_365_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_359_ >>= 8;
		i_365_ >>= 8;
		i_361_ <<= 2;
		i_362_ <<= 2;
		if ((i_363_ = i_360_ + i_359_ - (i_365_ - 1)) > i_364_)
			i_363_ = i_364_;
		i_360_ <<= 1;
		i_363_ <<= 1;
		i_363_ -= 6;
		while (i_360_ < i_363_) {
			i = is[i_359_--];
			is_358_[i_360_++] += i * i_361_;
			is_358_[i_360_++] += i * i_362_;
			i = is[i_359_--];
			is_358_[i_360_++] += i * i_361_;
			is_358_[i_360_++] += i * i_362_;
			i = is[i_359_--];
			is_358_[i_360_++] += i * i_361_;
			is_358_[i_360_++] += i * i_362_;
			i = is[i_359_--];
			is_358_[i_360_++] += i * i_361_;
			is_358_[i_360_++] += i * i_362_;
		}
		i_363_ += 6;
		while (i_360_ < i_363_) {
			i = is[i_359_--];
			is_358_[i_360_++] += i * i_361_;
			is_358_[i_360_++] += i * i_362_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_359_ << 8) * -834443097;
		return i_360_ >> 1;
	}

	static int method16029(int i, byte[] is, int[] is_366_, int i_367_, int i_368_, int i_369_, int i_370_, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_367_ >>= 8;
		i_375_ >>= 8;
		i_369_ <<= 2;
		i_370_ <<= 2;
		i_371_ <<= 2;
		i_372_ <<= 2;
		if ((i_373_ = i_368_ + i_375_ - i_367_) > i_374_)
			i_373_ = i_374_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * (i_373_ - i_368_) * 809781739);
		i_368_ <<= 1;
		i_373_ <<= 1;
		i_373_ -= 6;
		while (i_368_ < i_373_) {
			i = is[i_367_++];
			is_366_[i_368_++] += i * i_369_;
			i_369_ += i_371_;
			is_366_[i_368_++] += i * i_370_;
			i_370_ += i_372_;
			i = is[i_367_++];
			is_366_[i_368_++] += i * i_369_;
			i_369_ += i_371_;
			is_366_[i_368_++] += i * i_370_;
			i_370_ += i_372_;
			i = is[i_367_++];
			is_366_[i_368_++] += i * i_369_;
			i_369_ += i_371_;
			is_366_[i_368_++] += i * i_370_;
			i_370_ += i_372_;
			i = is[i_367_++];
			is_366_[i_368_++] += i * i_369_;
			i_369_ += i_371_;
			is_366_[i_368_++] += i * i_370_;
			i_370_ += i_372_;
		}
		i_373_ += 6;
		while (i_368_ < i_373_) {
			i = is[i_367_++];
			is_366_[i_368_++] += i * i_369_;
			i_369_ += i_371_;
			is_366_[i_368_++] += i * i_370_;
			i_370_ += i_372_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = (i_369_ >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = (i_370_ >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_367_ << 8) * -834443097;
		return i_368_ >> 1;
	}

	static int method16030(int i, int i_376_, byte[] is, int[] is_377_, int i_378_, int i_379_, int i_380_, int i_381_, int i_382_, int i_383_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_384_, int i_385_) {
		if (i_384_ == 0 || ((i_381_ = i_379_ + (i_383_ - i_378_ + i_384_ - 257) / i_384_) > i_382_))
			i_381_ = i_382_;
		while (i_379_ < i_381_) {
			i_376_ = i_378_ >> 8;
			i = is[i_376_];
			is_377_[i_379_++] += (((i << 8) + (is[i_376_ + 1] - i) * (i_378_ & 0xff)) * i_380_) >> 6;
			i_378_ += i_384_;
		}
		if (i_384_ == 0 || ((i_381_ = i_379_ + (i_383_ - i_378_ + i_384_ - 1) / i_384_) > i_382_))
			i_381_ = i_382_;
		i_376_ = i_385_;
		while (i_379_ < i_381_) {
			i = is[i_378_ >> 8];
			is_377_[i_379_++] += ((i << 8) + (i_376_ - i) * (i_378_ & 0xff)) * i_380_ >> 6;
			i_378_ += i_384_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_378_ * -834443097;
		return i_379_;
	}

	static int method16031(int i, byte[] is, int[] is_386_, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, int i_393_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_387_ >>= 8;
		i_393_ >>= 8;
		i_389_ <<= 2;
		i_390_ <<= 2;
		if ((i_391_ = i_388_ + i_393_ - i_387_) > i_392_)
			i_391_ = i_392_;
		i_388_ <<= 1;
		i_391_ <<= 1;
		i_391_ -= 6;
		while (i_388_ < i_391_) {
			i = is[i_387_++];
			is_386_[i_388_++] += i * i_389_;
			is_386_[i_388_++] += i * i_390_;
			i = is[i_387_++];
			is_386_[i_388_++] += i * i_389_;
			is_386_[i_388_++] += i * i_390_;
			i = is[i_387_++];
			is_386_[i_388_++] += i * i_389_;
			is_386_[i_388_++] += i * i_390_;
			i = is[i_387_++];
			is_386_[i_388_++] += i * i_389_;
			is_386_[i_388_++] += i * i_390_;
		}
		i_391_ += 6;
		while (i_388_ < i_391_) {
			i = is[i_387_++];
			is_386_[i_388_++] += i * i_389_;
			is_386_[i_388_++] += i * i_390_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_387_ << 8) * -834443097;
		return i_388_ >> 1;
	}

	static int method16032(byte[] is, int[] is_394_, int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_400_ >>= 8;
		i_396_ <<= 2;
		i_397_ <<= 2;
		if ((i_398_ = i_395_ + i - (i_400_ - 1)) > i_399_)
			i_398_ = i_399_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * (i_398_ - i_395_) * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * (i_398_ - i_395_) * 1339372733);
		i_398_ -= 3;
		while (i_395_ < i_398_) {
			is_394_[i_395_++] += is[i--] * i_396_;
			i_396_ += i_397_;
			is_394_[i_395_++] += is[i--] * i_396_;
			i_396_ += i_397_;
			is_394_[i_395_++] += is[i--] * i_396_;
			i_396_ += i_397_;
			is_394_[i_395_++] += is[i--] * i_396_;
			i_396_ += i_397_;
		}
		i_398_ += 3;
		while (i_395_ < i_398_) {
			is_394_[i_395_++] += is[i--] * i_396_;
			i_396_ += i_397_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = (i_396_ >> 2) * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_395_;
	}

	static int method16033(int i, byte[] is, int[] is_401_, int i_402_, int i_403_, int i_404_, int i_405_, int i_406_, int i_407_, int i_408_, int i_409_, int i_410_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i_402_ >>= 8;
		i_410_ >>= 8;
		i_404_ <<= 2;
		i_405_ <<= 2;
		i_406_ <<= 2;
		i_407_ <<= 2;
		if ((i_408_ = i_403_ + i_402_ - (i_410_ - 1)) > i_409_)
			i_408_ = i_409_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * (i_408_ - i_403_) * 809781739);
		i_403_ <<= 1;
		i_408_ <<= 1;
		i_408_ -= 6;
		while (i_403_ < i_408_) {
			i = is[i_402_--];
			is_401_[i_403_++] += i * i_404_;
			i_404_ += i_406_;
			is_401_[i_403_++] += i * i_405_;
			i_405_ += i_407_;
			i = is[i_402_--];
			is_401_[i_403_++] += i * i_404_;
			i_404_ += i_406_;
			is_401_[i_403_++] += i * i_405_;
			i_405_ += i_407_;
			i = is[i_402_--];
			is_401_[i_403_++] += i * i_404_;
			i_404_ += i_406_;
			is_401_[i_403_++] += i * i_405_;
			i_405_ += i_407_;
			i = is[i_402_--];
			is_401_[i_403_++] += i * i_404_;
			i_404_ += i_406_;
			is_401_[i_403_++] += i * i_405_;
			i_405_ += i_407_;
		}
		i_408_ += 6;
		while (i_403_ < i_408_) {
			i = is[i_402_--];
			is_401_[i_403_++] += i * i_404_;
			i_404_ += i_406_;
			is_401_[i_403_++] += i * i_405_;
			i_405_ += i_407_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = (i_404_ >> 2) * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = (i_405_ >> 2) * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i_402_ << 8) * -834443097;
		return i_403_ >> 1;
	}

	static int method16034(byte[] is, int[] is_411_, int i, int i_412_, int i_413_, int i_414_, int i_415_, int i_416_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2) {
		i >>= 8;
		i_416_ >>= 8;
		i_413_ <<= 2;
		if ((i_414_ = i_412_ + i_416_ - i) > i_415_)
			i_414_ = i_415_;
		i_414_ -= 3;
		while (i_412_ < i_414_) {
			is_411_[i_412_++] += is[i++] * i_413_;
			is_411_[i_412_++] += is[i++] * i_413_;
			is_411_[i_412_++] += is[i++] * i_413_;
			is_411_[i_412_++] += is[i++] * i_413_;
		}
		i_414_ += 3;
		while (i_412_ < i_414_)
			is_411_[i_412_++] += is[i++] * i_413_;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = (i << 8) * -834443097;
		return i_412_;
	}

	static int method16035(int i, int i_417_, byte[] is, int[] is_418_, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, int i_424_, int i_425_, int i_426_, int i_427_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_428_, int i_429_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_420_ * 809781739);
		if (i_428_ == 0 || ((i_425_ = i_420_ + (i_427_ - i_419_ + i_428_ - 257) / i_428_) > i_426_))
			i_425_ = i_426_;
		i_420_ <<= 1;
		i_425_ <<= 1;
		while (i_420_ < i_425_) {
			i_417_ = i_419_ >> 8;
			i = is[i_417_];
			i = (i << 8) + (is[i_417_ + 1] - i) * (i_419_ & 0xff);
			is_418_[i_420_++] += i * i_421_ >> 6;
			i_421_ += i_423_;
			is_418_[i_420_++] += i * i_422_ >> 6;
			i_422_ += i_424_;
			i_419_ += i_428_;
		}
		if (i_428_ == 0 || (i_425_ = (i_420_ >> 1) + (i_427_ - i_419_ + i_428_ - 1) / i_428_) > i_426_)
			i_425_ = i_426_;
		i_425_ <<= 1;
		i_417_ = i_429_;
		while (i_420_ < i_425_) {
			i = is[i_419_ >> 8];
			i = (i << 8) + (i_417_ - i) * (i_419_ & 0xff);
			is_418_[i_420_++] += i * i_421_ >> 6;
			i_421_ += i_423_;
			is_418_[i_420_++] += i * i_422_ >> 6;
			i_422_ += i_424_;
			i_419_ += i_428_;
		}
		i_420_ >>= 1;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_420_ * 809781739);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = i_421_ * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = i_422_ * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_419_ * -834443097;
		return i_420_;
	}

	static int method16036(int i, int i_430_, byte[] is, int[] is_431_, int i_432_, int i_433_, int i_434_, int i_435_, int i_436_, int i_437_, int i_438_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_439_, int i_440_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_433_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_433_ * 1339372733);
		if (i_439_ == 0 || ((i_436_ = i_433_ + (i_438_ + 256 - i_432_ + i_439_) / i_439_) > i_437_))
			i_436_ = i_437_;
		while (i_433_ < i_436_) {
			i_430_ = i_432_ >> 8;
			i = is[i_430_ - 1];
			is_431_[i_433_++] += (((i << 8) + (is[i_430_] - i) * (i_432_ & 0xff)) * i_434_ >> 6);
			i_434_ += i_435_;
			i_432_ += i_439_;
		}
		if (i_439_ == 0 || ((i_436_ = i_433_ + (i_438_ - i_432_ + i_439_) / i_439_) > i_437_))
			i_436_ = i_437_;
		i = i_440_;
		i_430_ = i_439_;
		while (i_433_ < i_436_) {
			is_431_[i_433_++] += (((i << 8) + (is[i_432_ >> 8] - i) * (i_432_ & 0xff)) * i_434_) >> 6;
			i_434_ += i_435_;
			i_432_ += i_430_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_433_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_433_ * 1339372733);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = i_434_ * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_432_ * -834443097;
		return i_433_;
	}

	static int method16037(int i, int i_441_, byte[] is, int[] is_442_, int i_443_, int i_444_, int i_445_, int i_446_, int i_447_, int i_448_, int i_449_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_450_, int i_451_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_444_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_444_ * 1339372733);
		if (i_450_ == 0 || ((i_447_ = i_444_ + (i_449_ + 256 - i_443_ + i_450_) / i_450_) > i_448_))
			i_447_ = i_448_;
		while (i_444_ < i_447_) {
			i_441_ = i_443_ >> 8;
			i = is[i_441_ - 1];
			is_442_[i_444_++] += (((i << 8) + (is[i_441_] - i) * (i_443_ & 0xff)) * i_445_ >> 6);
			i_445_ += i_446_;
			i_443_ += i_450_;
		}
		if (i_450_ == 0 || ((i_447_ = i_444_ + (i_449_ - i_443_ + i_450_) / i_450_) > i_448_))
			i_447_ = i_448_;
		i = i_451_;
		i_441_ = i_450_;
		while (i_444_ < i_447_) {
			is_442_[i_444_++] += (((i << 8) + (is[i_443_ >> 8] - i) * (i_443_ & 0xff)) * i_445_) >> 6;
			i_445_ += i_446_;
			i_443_ += i_441_;
		}
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9852 * 1923898617 * i_444_ * 1672655349);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9851 * 241181547 * i_444_ * 1339372733);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 = i_445_ * 809781739;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_443_ * -834443097;
		return i_444_;
	}

	public synchronized void method12242(int[] is, int i, int i_452_) {
		if (((Class282_Sub15_Sub5_Sub2) this).anInt9846 * -1302038045 == 0 && ((Class282_Sub15_Sub5_Sub2) this).anInt9858 * 1008956447 == 0)
			method12231(i_452_);
		else {
			int i_453_ = ((Class282_Sub15_Sub5_Sub2) this).anInt9844 * -99794975 << 8;
			int i_454_ = (((Class282_Sub15_Sub5_Sub2) this).anInt9856 * -1048610041 << 8);
			int i_455_ = ((((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) ((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601).aByteArray10470).length << 8);
			int i_456_ = i_454_ - i_453_;
			if (i_456_ <= 0)
				((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
			int i_457_ = i;
			i_452_ += i;
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 > 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 0;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449 >= i_455_) {
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0)
					((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_455_ - 1) * -834443097;
				else {
					method15354(-859024475);
					unlink(-371378792);
					return;
				}
			}
			if (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163 < 0) {
				if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
						i_457_ = method16018(is, i_457_, i_453_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_453_)
							return;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_453_ + i_453_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
					for (;;) {
						i_457_ = method15990(is, i_457_, i_454_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_454_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_454_ + i_454_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
						i_457_ = method16018(is, i_457_, i_453_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_453_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_453_ + i_453_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449)) * -834443097;
						((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -(((Class282_Sub15_Sub5_Sub2) this).anInt9855 * 1);
					}
				} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
					for (;;) {
						i_457_ = method16018(is, i_457_, i_453_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_453_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_454_ - 1 - (i_454_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) % i_456_) * -834443097);
					}
				} else {
					for (;;) {
						i_457_ = method15990(is, i_457_, i_454_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975]));
						if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < i_454_)
							break;
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = (i_453_ + ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) - i_453_) % i_456_) * -834443097;
					}
				}
			} else {
				do {
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) > 0) {
						if (((Class282_Sub15_Sub5_Sub2) this).aBool9857) {
							if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
								i_457_ = (method16018(is, i_457_, i_453_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_453_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_453_ + i_453_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
							}
							do {
								i_457_ = (method15990(is, i_457_, i_454_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_454_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_454_ + i_454_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 == 0)
									break;
								i_457_ = (method16018(is, i_457_, i_453_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_453_)
									return;
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 = ((i_453_ + i_453_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) * -834443097);
								((Class282_Sub15_Sub5_Sub2) this).anInt9855 = -((((Class282_Sub15_Sub5_Sub2) this).anInt9855) * 1);
							} while ((((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= -485012237) * 1507503163 != 0);
						} else if ((((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111) < 0) {
							for (;;) {
								i_457_ = (method16018(is, i_457_, i_453_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9856) * -1048610041 - 1])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 >= i_453_)
									return;
								int i_458_ = ((i_454_ - 1 - (((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449) / i_456_);
								if (i_458_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 += (i_456_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 += i_456_ * i_458_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_458_ * -485012237;
							}
						} else {
							for (;;) {
								i_457_ = (method15990(is, i_457_, i_454_, i_452_, (((Class282_Sub26_Sub1_Sub2) (Class282_Sub26_Sub1_Sub2) (((Class282_Sub15_Sub5_Sub2) this).aClass282_Sub26_7601)).aByteArray10470[(((Class282_Sub15_Sub5_Sub2) this).anInt9844) * -99794975])));
								if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 < i_454_)
									return;
								int i_459_ = (((((Class282_Sub15_Sub5_Sub2) this).anInt9853) * -354697449 - i_453_) / i_456_);
								if (i_459_ >= (((Class282_Sub15_Sub5_Sub2) this).anInt9854) * 1507503163) {
									((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= (i_456_ * (((Class282_Sub15_Sub5_Sub2) this).anInt9854 * 1507503163) * -834443097);
									((Class282_Sub15_Sub5_Sub2) this).anInt9854 = 0;
									break;
								}
								((Class282_Sub15_Sub5_Sub2) this).anInt9853 -= i_456_ * i_459_ * -834443097;
								((Class282_Sub15_Sub5_Sub2) this).anInt9854 -= i_459_ * -485012237;
							}
						}
					}
				} while (false);
				if (((Class282_Sub15_Sub5_Sub2) this).anInt9855 * -177305111 < 0) {
					method16018(is, i_457_, 0, i_452_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) < 0) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = 834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				} else {
					method15990(is, i_457_, i_455_, i_452_, 0);
					if ((((Class282_Sub15_Sub5_Sub2) this).anInt9853 * -354697449) >= i_455_) {
						((Class282_Sub15_Sub5_Sub2) this).anInt9853 = i_455_ * -834443097;
						method15354(-859024475);
						unlink(-371378792);
					}
				}
			}
		}
	}

	static int method16038(int i, int i_460_, byte[] is, int[] is_461_, int i_462_, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_, int i_469_, int i_470_, Class282_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2, int i_471_, int i_472_) {
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 -= (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_463_ * 809781739);
		if (i_471_ == 0 || ((i_468_ = i_463_ + (i_470_ + 256 - i_462_ + i_471_) / i_471_) > i_469_))
			i_468_ = i_469_;
		i_463_ <<= 1;
		i_468_ <<= 1;
		while (i_463_ < i_468_) {
			i_460_ = i_462_ >> 8;
			i = is[i_460_ - 1];
			i = (i << 8) + (is[i_460_] - i) * (i_462_ & 0xff);
			is_461_[i_463_++] += i * i_464_ >> 6;
			i_464_ += i_466_;
			is_461_[i_463_++] += i * i_465_ >> 6;
			i_465_ += i_467_;
			i_462_ += i_471_;
		}
		if (i_471_ == 0 || ((i_468_ = (i_463_ >> 1) + (i_470_ - i_462_ + i_471_) / i_471_) > i_469_))
			i_468_ = i_469_;
		i_468_ <<= 1;
		i_460_ = i_472_;
		while (i_463_ < i_468_) {
			i = (i_460_ << 8) + (is[i_462_ >> 8] - i_460_) * (i_462_ & 0xff);
			is_461_[i_463_++] += i * i_464_ >> 6;
			i_464_ += i_466_;
			is_461_[i_463_++] += i * i_465_ >> 6;
			i_465_ += i_467_;
			i_462_ += i_471_;
		}
		i_463_ >>= 1;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9848 += (((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9849 * 1670226395 * i_463_ * 809781739);
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9845 = i_464_ * 1672655349;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9850 = i_465_ * 1339372733;
		((Class282_Sub15_Sub5_Sub2) class282_sub15_sub5_sub2).anInt9853 = i_462_ * -834443097;
		return i_463_;
	}
}
