/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class332 {
	static int anInt3566 = 2;
	int anInt3567 = 0;
	Class333 aClass333_3568;
	static int anInt3569 = 38400;
	static int anInt3570 = 1;
	static int anInt3571 = 8;
	int anInt3572;
	static int anInt3573 = 12;
	static int anInt3574 = 2001;
	static int anInt3575 = -2001;

	final boolean method4064(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i > 2001 || i_0_ > 2001 || i_1_ > 2001 || i_2_ > 2001 || i_3_ > 2001 || i_4_ > 2001)
			return false;
		if (i < -2001 || i_0_ < -2001 || i_1_ < -2001 || i_2_ < -2001 || i_3_ < -2001 || i_4_ < -2001)
			return false;
		if (((Class332) this).anInt3572 == 2) {
			int i_8_ = i_2_ + i * (((Class333) ((Class332) this).aClass333_3568).anInt3603);
			if (i_8_ >= 0 && i_8_ < (((Class333) ((Class332) this).aClass333_3568).anIntArray3599).length && ((i_5_ << 8) - 38400 < (((Class333) ((Class332) this).aClass333_3568).anIntArray3599[i_8_])))
				return false;
			i_8_ = i_3_ + i_0_ * (((Class333) ((Class332) this).aClass333_3568).anInt3603);
			if (i_8_ >= 0 && i_8_ < (((Class333) ((Class332) this).aClass333_3568).anIntArray3599).length && ((i_6_ << 8) - 38400 < (((Class333) ((Class332) this).aClass333_3568).anIntArray3599[i_8_])))
				return false;
			i_8_ = i_4_ + i_1_ * (((Class333) ((Class332) this).aClass333_3568).anInt3603);
			if (i_8_ >= 0 && i_8_ < (((Class333) ((Class332) this).aClass333_3568).anIntArray3599).length && ((i_7_ << 8) - 38400 < (((Class333) ((Class332) this).aClass333_3568).anIntArray3599[i_8_])))
				return false;
		}
		int i_9_ = i_3_ - i_2_;
		int i_10_ = i_0_ - i;
		int i_11_ = i_4_ - i_2_;
		int i_12_ = i_1_ - i;
		int i_13_ = i_6_ - i_5_;
		int i_14_ = i_7_ - i_5_;
		if (i < i_0_ && i_1_ < i_1_) {
			i--;
			if (i_0_ > i_1_)
				i_0_++;
			else
				i_1_++;
		} else if (i_0_ < i_1_) {
			i_0_--;
			if (i > i_1_)
				i++;
			else
				i_1_++;
		} else {
			i_1_--;
			if (i > i_0_)
				i++;
			else
				i_0_++;
		}
		int i_15_ = 0;
		if (i_0_ != i)
			i_15_ = (i_3_ - i_2_ << 12) / (i_0_ - i);
		int i_16_ = 0;
		if (i_1_ != i_0_)
			i_16_ = (i_4_ - i_3_ << 12) / (i_1_ - i_0_);
		int i_17_ = 0;
		if (i_1_ != i)
			i_17_ = (i_2_ - i_4_ << 12) / (i - i_1_);
		int i_18_ = i_9_ * i_12_ - i_11_ * i_10_;
		if (i_18_ == 0)
			return false;
		int i_19_ = (i_13_ * i_12_ - i_14_ * i_10_ << 8) / i_18_;
		int i_20_ = (i_14_ * i_9_ - i_13_ * i_11_ << 8) / i_18_;
		if (i <= i_0_ && i <= i_1_) {
			if (i >= ((Class333) ((Class332) this).aClass333_3568).anInt3604)
				return true;
			if (i_0_ > ((Class333) ((Class332) this).aClass333_3568).anInt3604)
				i_0_ = ((Class333) ((Class332) this).aClass333_3568).anInt3604;
			if (i_1_ > ((Class333) ((Class332) this).aClass333_3568).anInt3604)
				i_1_ = ((Class333) ((Class332) this).aClass333_3568).anInt3604;
			i_5_ = (i_5_ << 8) - i_19_ * i_2_ + i_19_;
			if (i_0_ < i_1_) {
				i_4_ = i_2_ <<= 12;
				if (i < 0) {
					i_4_ -= i_17_ * i;
					i_2_ -= i_15_ * i;
					i_5_ -= i_20_ * i;
					i = 0;
				}
				i_3_ <<= 12;
				if (i_0_ < 0) {
					i_3_ -= i_16_ * i_0_;
					i_0_ = 0;
				}
				if (i != i_0_ && i_17_ < i_15_ || i == i_0_ && i_17_ > i_16_) {
					i_1_ -= i_0_;
					i_0_ -= i;
					i *= (((Class333) ((Class332) this).aClass333_3568).anInt3603);
					while (--i_0_ >= 0) {
						if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
							return false;
						i_4_ += i_17_;
						i_2_ += i_15_;
						i_5_ += i_20_;
						i += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
					}
					while (--i_1_ >= 0) {
						if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
							return false;
						i_4_ += i_17_;
						i_3_ += i_16_;
						i_5_ += i_20_;
						i += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
					}
					return true;
				}
				i_1_ -= i_0_;
				i_0_ -= i;
				i *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
				while (--i_0_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_4_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				while (--i_1_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_4_ += i_17_;
					i_3_ += i_16_;
					i_5_ += i_20_;
					i += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				return true;
			}
			i_3_ = i_2_ <<= 12;
			if (i < 0) {
				i_3_ -= i_17_ * i;
				i_2_ -= i_15_ * i;
				i_5_ -= i_20_ * i;
				i = 0;
			}
			i_4_ <<= 12;
			if (i_1_ < 0) {
				i_4_ -= i_16_ * i_1_;
				i_1_ = 0;
			}
			if (i != i_1_ && i_17_ < i_15_ || i == i_1_ && i_16_ > i_15_) {
				i_0_ -= i_1_;
				i_1_ -= i;
				i *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
				while (--i_1_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_3_ += i_17_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				while (--i_0_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_5_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_4_ += i_16_;
					i_2_ += i_15_;
					i_5_ += i_20_;
					i += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				return true;
			}
			i_0_ -= i_1_;
			i_1_ -= i;
			i *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			while (--i_1_ >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_5_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_3_ += i_17_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			while (--i_0_ >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_5_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_4_ += i_16_;
				i_2_ += i_15_;
				i_5_ += i_20_;
				i += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			return true;
		}
		if (i_0_ <= i_1_) {
			if (i_0_ >= ((Class333) ((Class332) this).aClass333_3568).anInt3604)
				return true;
			if (i_1_ > ((Class333) ((Class332) this).aClass333_3568).anInt3604)
				i_1_ = ((Class333) ((Class332) this).aClass333_3568).anInt3604;
			if (i > ((Class333) ((Class332) this).aClass333_3568).anInt3604)
				i = ((Class333) ((Class332) this).aClass333_3568).anInt3604;
			i_6_ = (i_6_ << 8) - i_19_ * i_3_ + i_19_;
			if (i_1_ < i) {
				i_2_ = i_3_ <<= 12;
				if (i_0_ < 0) {
					i_2_ -= i_15_ * i_0_;
					i_3_ -= i_16_ * i_0_;
					i_6_ -= i_20_ * i_0_;
					i_0_ = 0;
				}
				i_4_ <<= 12;
				if (i_1_ < 0) {
					i_4_ -= i_17_ * i_1_;
					i_1_ = 0;
				}
				if (i_0_ != i_1_ && i_15_ < i_16_ || i_0_ == i_1_ && i_15_ > i_17_) {
					i -= i_1_;
					i_1_ -= i_0_;
					i_0_ *= (((Class333) ((Class332) this).aClass333_3568).anInt3603);
					while (--i_1_ >= 0) {
						if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
							return false;
						i_2_ += i_15_;
						i_3_ += i_16_;
						i_6_ += i_20_;
						i_0_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
					}
					while (--i >= 0) {
						if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
							return false;
						i_2_ += i_15_;
						i_4_ += i_17_;
						i_6_ += i_20_;
						i_0_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
					}
					return true;
				}
				i -= i_1_;
				i_1_ -= i_0_;
				i_0_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
				while (--i_1_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_2_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				while (--i >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_2_ += i_15_;
					i_4_ += i_17_;
					i_6_ += i_20_;
					i_0_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				return true;
			}
			i_4_ = i_3_ <<= 12;
			if (i_0_ < 0) {
				i_4_ -= i_15_ * i_0_;
				i_3_ -= i_16_ * i_0_;
				i_6_ -= i_20_ * i_0_;
				i_0_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_17_ * i;
				i = 0;
			}
			if (i_15_ < i_16_) {
				i_1_ -= i;
				i -= i_0_;
				i_0_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
				while (--i >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_4_ += i_15_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				while (--i_1_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_6_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_2_ += i_17_;
					i_3_ += i_16_;
					i_6_ += i_20_;
					i_0_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				return true;
			}
			i_1_ -= i;
			i -= i_0_;
			i_0_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			while (--i >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_6_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_4_ += i_15_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			while (--i_1_ >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_0_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_6_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_2_ += i_17_;
				i_3_ += i_16_;
				i_6_ += i_20_;
				i_0_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			return true;
		}
		if (i_1_ >= ((Class333) ((Class332) this).aClass333_3568).anInt3604)
			return true;
		if (i > ((Class333) ((Class332) this).aClass333_3568).anInt3604)
			i = ((Class333) ((Class332) this).aClass333_3568).anInt3604;
		if (i_0_ > ((Class333) ((Class332) this).aClass333_3568).anInt3604)
			i_0_ = ((Class333) ((Class332) this).aClass333_3568).anInt3604;
		i_7_ = (i_7_ << 8) - i_19_ * i_4_ + i_19_;
		if (i < i_0_) {
			i_3_ = i_4_ <<= 12;
			if (i_1_ < 0) {
				i_3_ -= i_16_ * i_1_;
				i_4_ -= i_17_ * i_1_;
				i_7_ -= i_20_ * i_1_;
				i_1_ = 0;
			}
			i_2_ <<= 12;
			if (i < 0) {
				i_2_ -= i_15_ * i;
				i = 0;
			}
			if (i_16_ < i_17_) {
				i_0_ -= i;
				i -= i_1_;
				i_1_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
				while (--i >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_3_ += i_16_;
					i_4_ += i_17_;
					i_7_ += i_20_;
					i_1_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				while (--i_0_ >= 0) {
					if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_3_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, ((Class333) (((Class332) this).aClass333_3568)).anInt3603))
						return false;
					i_3_ += i_16_;
					i_2_ += i_15_;
					i_7_ += i_20_;
					i_1_ += (((Class333) ((Class332) this).aClass333_3568).anInt3603);
				}
				return true;
			}
			i_0_ -= i;
			i -= i_1_;
			i_1_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			while (--i >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_3_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			while (--i_0_ >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_2_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_3_ += i_16_;
				i_2_ += i_15_;
				i_7_ += i_20_;
				i_1_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			return true;
		}
		i_2_ = i_4_ <<= 12;
		if (i_1_ < 0) {
			i_2_ -= i_16_ * i_1_;
			i_4_ -= i_17_ * i_1_;
			i_7_ -= i_20_ * i_1_;
			i_1_ = 0;
		}
		i_3_ <<= 12;
		if (i_0_ < 0) {
			i_3_ -= i_15_ * i_0_;
			i_0_ = 0;
		}
		if (i_16_ < i_17_) {
			i -= i_0_;
			i_0_ -= i_1_;
			i_1_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			while (--i_0_ >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_2_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_2_ += i_16_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			while (--i >= 0) {
				if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_3_ >> 12) - 1, (i_4_ >> 12) + 1, i_7_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
					return false;
				i_3_ += i_15_;
				i_4_ += i_17_;
				i_7_ += i_20_;
				i_1_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
			}
			return true;
		}
		i -= i_0_;
		i_0_ -= i_1_;
		i_1_ *= ((Class333) ((Class332) this).aClass333_3568).anInt3603;
		while (--i_0_ >= 0) {
			if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_4_ >> 12) - 1, (i_2_ >> 12) + 1, i_7_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
				return false;
			i_2_ += i_16_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
		}
		while (--i >= 0) {
			if (!method4065((((Class333) ((Class332) this).aClass333_3568).anIntArray3599), i_1_, 0, (i_4_ >> 12) - 1, (i_3_ >> 12) + 1, i_7_, i_19_, (((Class333) ((Class332) this).aClass333_3568).anInt3603)))
				return false;
			i_3_ += i_15_;
			i_4_ += i_17_;
			i_7_ += i_20_;
			i_1_ += ((Class333) ((Class332) this).aClass333_3568).anInt3603;
		}
		return true;
	}

	Class332(Class333 class333) {
		((Class332) this).aClass333_3568 = class333;
	}

	final boolean method4065(int[] is, int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		if (i_23_ > i_26_)
			i_23_ = i_26_;
		if (i_22_ < 0)
			i_22_ = 0;
		if (i_22_ >= i_23_)
			return true;
		i += i_22_ - 1;
		i_21_ = i_23_ - i_22_ >> 2;
		i_24_ += i_25_ * i_22_;
		if (((Class332) this).anInt3572 == 1) {
			((Class332) this).anInt3567 += i_21_;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
			}
			i_21_ = i_23_ - i_22_ & 0x3;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					is[i] = i_24_;
				i_24_ += i_25_;
			}
		} else {
			i_24_ -= 38400;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
			}
			i_21_ = i_23_ - i_22_ & 0x3;
			while (--i_21_ >= 0) {
				if (i_24_ < is[++i])
					return false;
				i_24_ += i_25_;
			}
		}
		return true;
	}
}
