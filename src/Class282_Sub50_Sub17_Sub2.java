/* Class282_Sub50_Sub17_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub17_Sub2 extends Class282_Sub50_Sub17 {
	int anInt10451;
	int anInt10452;
	int anInt10453;
	byte[] aByteArray10454;
	int anInt10455;
	static final int anInt10456 = 16;

	boolean method16039(int i, int i_0_) {
		return (((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length >= i * i_0_);
	}

	void method16040(int i, int i_1_, int i_2_, int i_3_) {
		((Class282_Sub50_Sub17_Sub2) this).anInt10453 = i;
		((Class282_Sub50_Sub17_Sub2) this).anInt10455 = i_1_;
		((Class282_Sub50_Sub17_Sub2) this).anInt10452 = i_2_ - i;
		((Class282_Sub50_Sub17_Sub2) this).anInt10451 = i_3_ - i_1_;
	}

	boolean method16041(int i, int i_4_) {
		return (((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length >= i * i_4_);
	}

	void method16042() {
		int i = -1;
		int i_5_ = ((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length - 8;
		while (i < i_5_) {
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
		}
		while (i < ((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length - 1)
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
	}

	void method16043(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = 0;
		if (i_6_ != i)
			i_11_ = (i_9_ - i_8_ << 16) / (i_6_ - i);
		int i_12_ = 0;
		if (i_7_ != i_6_)
			i_12_ = (i_10_ - i_9_ << 16) / (i_7_ - i_6_);
		int i_13_ = 0;
		if (i_7_ != i)
			i_13_ = (i_8_ - i_10_ << 16) / (i - i_7_);
		if (i <= i_6_ && i <= i_7_) {
			if (i_6_ < i_7_) {
				i_10_ = i_8_ <<= 16;
				if (i < 0) {
					i_10_ -= i_13_ * i;
					i_8_ -= i_11_ * i;
					i = 0;
				}
				i_9_ <<= 16;
				if (i_6_ < 0) {
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				if (i != i_6_ && i_13_ < i_11_ || i == i_6_ && i_13_ > i_12_) {
					i_7_ -= i_6_;
					i_6_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_6_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_10_ >> 16, i_8_ >> 16);
						i_10_ += i_13_;
						i_8_ += i_11_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_13_;
						i_9_ += i_12_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i_7_ -= i_6_;
					i_6_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_6_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_8_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_8_ += i_11_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_9_ += i_12_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			} else {
				i_9_ = i_8_ <<= 16;
				if (i < 0) {
					i_9_ -= i_13_ * i;
					i_8_ -= i_11_ * i;
					i = 0;
				}
				i_10_ <<= 16;
				if (i_7_ < 0) {
					i_10_ -= i_12_ * i_7_;
					i_7_ = 0;
				}
				if (i != i_7_ && i_13_ < i_11_ || i == i_7_ && i_12_ > i_11_) {
					i_6_ -= i_7_;
					i_7_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_9_ >> 16, i_8_ >> 16);
						i_9_ += i_13_;
						i_8_ += i_11_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_6_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_10_ >> 16, i_8_ >> 16);
						i_10_ += i_12_;
						i_8_ += i_11_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i_6_ -= i_7_;
					i_7_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_8_ >> 16, i_9_ >> 16);
						i_9_ += i_13_;
						i_8_ += i_11_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_6_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_8_ >> 16, i_10_ >> 16);
						i_10_ += i_12_;
						i_8_ += i_11_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			}
		} else if (i_6_ <= i_7_) {
			if (i_7_ < i) {
				i_8_ = i_9_ <<= 16;
				if (i_6_ < 0) {
					i_8_ -= i_11_ * i_6_;
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				i_10_ <<= 16;
				if (i_7_ < 0) {
					i_10_ -= i_13_ * i_7_;
					i_7_ = 0;
				}
				if (i_6_ != i_7_ && i_11_ < i_12_ || i_6_ == i_7_ && i_11_ > i_13_) {
					i -= i_7_;
					i_7_ -= i_6_;
					i_6_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_8_ >> 16, i_9_ >> 16);
						i_8_ += i_11_;
						i_9_ += i_12_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_8_ >> 16, i_10_ >> 16);
						i_8_ += i_11_;
						i_10_ += i_13_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i -= i_7_;
					i_7_ -= i_6_;
					i_6_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_9_ >> 16, i_8_ >> 16);
						i_8_ += i_11_;
						i_9_ += i_12_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_10_ >> 16, i_8_ >> 16);
						i_8_ += i_11_;
						i_10_ += i_13_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			} else {
				i_10_ = i_9_ <<= 16;
				if (i_6_ < 0) {
					i_10_ -= i_11_ * i_6_;
					i_9_ -= i_12_ * i_6_;
					i_6_ = 0;
				}
				i_8_ <<= 16;
				if (i < 0) {
					i_8_ -= i_13_ * i;
					i = 0;
				}
				if (i_11_ < i_12_) {
					i_7_ -= i;
					i -= i_6_;
					i_6_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_10_ >> 16, i_9_ >> 16);
						i_10_ += i_11_;
						i_9_ += i_12_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_8_ >> 16, i_9_ >> 16);
						i_8_ += i_13_;
						i_9_ += i_12_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i_7_ -= i;
					i -= i_6_;
					i_6_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_9_ >> 16, i_10_ >> 16);
						i_10_ += i_11_;
						i_9_ += i_12_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_7_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_6_, 0, i_9_ >> 16, i_8_ >> 16);
						i_8_ += i_13_;
						i_9_ += i_12_;
						i_6_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			}
		} else if (i < i_6_) {
			i_9_ = i_10_ <<= 16;
			if (i_7_ < 0) {
				i_9_ -= i_12_ * i_7_;
				i_10_ -= i_13_ * i_7_;
				i_7_ = 0;
			}
			i_8_ <<= 16;
			if (i < 0) {
				i_8_ -= i_11_ * i;
				i = 0;
			}
			if (i_12_ < i_13_) {
				i_6_ -= i;
				i -= i_7_;
				i_7_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_9_ >> 16, i_10_ >> 16);
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i_6_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_9_ >> 16, i_8_ >> 16);
					i_9_ += i_12_;
					i_8_ += i_11_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			} else {
				i_6_ -= i;
				i -= i_7_;
				i_7_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_10_ >> 16, i_9_ >> 16);
					i_9_ += i_12_;
					i_10_ += i_13_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i_6_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_8_ >> 16, i_9_ >> 16);
					i_9_ += i_12_;
					i_8_ += i_11_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			}
		} else {
			i_8_ = i_10_ <<= 16;
			if (i_7_ < 0) {
				i_8_ -= i_12_ * i_7_;
				i_10_ -= i_13_ * i_7_;
				i_7_ = 0;
			}
			i_9_ <<= 16;
			if (i_6_ < 0) {
				i_9_ -= i_11_ * i_6_;
				i_6_ = 0;
			}
			if (i_12_ < i_13_) {
				i -= i_6_;
				i_6_ -= i_7_;
				i_7_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i_6_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_8_ >> 16, i_10_ >> 16);
					i_8_ += i_12_;
					i_10_ += i_13_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_9_ >> 16, i_10_ >> 16);
					i_9_ += i_11_;
					i_10_ += i_13_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			} else {
				i -= i_6_;
				i_6_ -= i_7_;
				i_7_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i_6_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_10_ >> 16, i_8_ >> 16);
					i_8_ += i_12_;
					i_10_ += i_13_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_7_, 0, i_10_ >> 16, i_9_ >> 16);
					i_9_ += i_11_;
					i_10_ += i_13_;
					i_7_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			}
		}
	}

	void method16044() {
		int i = -1;
		int i_14_ = ((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length - 8;
		while (i < i_14_) {
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
		}
		while (i < ((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length - 1)
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
	}

	void method16045(int i, int i_15_, int i_16_, int i_17_) {
		((Class282_Sub50_Sub17_Sub2) this).anInt10453 = i;
		((Class282_Sub50_Sub17_Sub2) this).anInt10455 = i_15_;
		((Class282_Sub50_Sub17_Sub2) this).anInt10452 = i_16_ - i;
		((Class282_Sub50_Sub17_Sub2) this).anInt10451 = i_17_ - i_15_;
	}

	Class282_Sub50_Sub17_Sub2(Class505_Sub2 class505_sub2, int i, int i_18_) {
		((Class282_Sub50_Sub17_Sub2) this).aByteArray10454 = new byte[i * i_18_];
	}

	static final void method16046(byte[] is, int i, int i_19_, int i_20_, int i_21_) {
		if (i_20_ < i_21_) {
			i += i_20_;
			i_19_ = i_21_ - i_20_ >> 2;
			while (--i_19_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_19_ = i_21_ - i_20_ & 0x3;
			while (--i_19_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	boolean method16047(int i, int i_22_) {
		return (((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length >= i * i_22_);
	}

	void method16048() {
		int i = -1;
		int i_23_ = ((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length - 8;
		while (i < i_23_) {
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
		}
		while (i < ((Class282_Sub50_Sub17_Sub2) this).aByteArray10454.length - 1)
			((Class282_Sub50_Sub17_Sub2) this).aByteArray10454[++i] = (byte) 0;
	}

	void method16049(int i, int i_24_, int i_25_, int i_26_) {
		((Class282_Sub50_Sub17_Sub2) this).anInt10453 = i;
		((Class282_Sub50_Sub17_Sub2) this).anInt10455 = i_24_;
		((Class282_Sub50_Sub17_Sub2) this).anInt10452 = i_25_ - i;
		((Class282_Sub50_Sub17_Sub2) this).anInt10451 = i_26_ - i_24_;
	}

	void method16050(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		int i_32_ = 0;
		if (i_27_ != i)
			i_32_ = (i_30_ - i_29_ << 16) / (i_27_ - i);
		int i_33_ = 0;
		if (i_28_ != i_27_)
			i_33_ = (i_31_ - i_30_ << 16) / (i_28_ - i_27_);
		int i_34_ = 0;
		if (i_28_ != i)
			i_34_ = (i_29_ - i_31_ << 16) / (i - i_28_);
		if (i <= i_27_ && i <= i_28_) {
			if (i_27_ < i_28_) {
				i_31_ = i_29_ <<= 16;
				if (i < 0) {
					i_31_ -= i_34_ * i;
					i_29_ -= i_32_ * i;
					i = 0;
				}
				i_30_ <<= 16;
				if (i_27_ < 0) {
					i_30_ -= i_33_ * i_27_;
					i_27_ = 0;
				}
				if (i != i_27_ && i_34_ < i_32_ || i == i_27_ && i_34_ > i_33_) {
					i_28_ -= i_27_;
					i_27_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_27_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_31_ >> 16, i_29_ >> 16);
						i_31_ += i_34_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_31_ >> 16, i_30_ >> 16);
						i_31_ += i_34_;
						i_30_ += i_33_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i_28_ -= i_27_;
					i_27_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_27_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_29_ >> 16, i_31_ >> 16);
						i_31_ += i_34_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_30_ >> 16, i_31_ >> 16);
						i_31_ += i_34_;
						i_30_ += i_33_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			} else {
				i_30_ = i_29_ <<= 16;
				if (i < 0) {
					i_30_ -= i_34_ * i;
					i_29_ -= i_32_ * i;
					i = 0;
				}
				i_31_ <<= 16;
				if (i_28_ < 0) {
					i_31_ -= i_33_ * i_28_;
					i_28_ = 0;
				}
				if (i != i_28_ && i_34_ < i_32_ || i == i_28_ && i_33_ > i_32_) {
					i_27_ -= i_28_;
					i_28_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_30_ >> 16, i_29_ >> 16);
						i_30_ += i_34_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_27_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_31_ >> 16, i_29_ >> 16);
						i_31_ += i_33_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i_27_ -= i_28_;
					i_28_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_29_ >> 16, i_30_ >> 16);
						i_30_ += i_34_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_27_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i, 0, i_29_ >> 16, i_31_ >> 16);
						i_31_ += i_33_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			}
		} else if (i_27_ <= i_28_) {
			if (i_28_ < i) {
				i_29_ = i_30_ <<= 16;
				if (i_27_ < 0) {
					i_29_ -= i_32_ * i_27_;
					i_30_ -= i_33_ * i_27_;
					i_27_ = 0;
				}
				i_31_ <<= 16;
				if (i_28_ < 0) {
					i_31_ -= i_34_ * i_28_;
					i_28_ = 0;
				}
				if (i_27_ != i_28_ && i_32_ < i_33_ || i_27_ == i_28_ && i_32_ > i_34_) {
					i -= i_28_;
					i_28_ -= i_27_;
					i_27_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_29_ >> 16, i_30_ >> 16);
						i_29_ += i_32_;
						i_30_ += i_33_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_29_ >> 16, i_31_ >> 16);
						i_29_ += i_32_;
						i_31_ += i_34_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i -= i_28_;
					i_28_ -= i_27_;
					i_27_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_30_ >> 16, i_29_ >> 16);
						i_29_ += i_32_;
						i_30_ += i_33_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_31_ >> 16, i_29_ >> 16);
						i_29_ += i_32_;
						i_31_ += i_34_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			} else {
				i_31_ = i_30_ <<= 16;
				if (i_27_ < 0) {
					i_31_ -= i_32_ * i_27_;
					i_30_ -= i_33_ * i_27_;
					i_27_ = 0;
				}
				i_29_ <<= 16;
				if (i < 0) {
					i_29_ -= i_34_ * i;
					i = 0;
				}
				if (i_32_ < i_33_) {
					i_28_ -= i;
					i -= i_27_;
					i_27_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_31_ >> 16, i_30_ >> 16);
						i_31_ += i_32_;
						i_30_ += i_33_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_29_ >> 16, i_30_ >> 16);
						i_29_ += i_34_;
						i_30_ += i_33_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				} else {
					i_28_ -= i;
					i -= i_27_;
					i_27_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					while (--i >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_30_ >> 16, i_31_ >> 16);
						i_31_ += i_32_;
						i_30_ += i_33_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
					while (--i_28_ >= 0) {
						method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_27_, 0, i_30_ >> 16, i_29_ >> 16);
						i_29_ += i_34_;
						i_30_ += i_33_;
						i_27_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
					}
				}
			}
		} else if (i < i_27_) {
			i_30_ = i_31_ <<= 16;
			if (i_28_ < 0) {
				i_30_ -= i_33_ * i_28_;
				i_31_ -= i_34_ * i_28_;
				i_28_ = 0;
			}
			i_29_ <<= 16;
			if (i < 0) {
				i_29_ -= i_32_ * i;
				i = 0;
			}
			if (i_33_ < i_34_) {
				i_27_ -= i;
				i -= i_28_;
				i_28_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_30_ >> 16, i_31_ >> 16);
					i_30_ += i_33_;
					i_31_ += i_34_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i_27_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_30_ >> 16, i_29_ >> 16);
					i_30_ += i_33_;
					i_29_ += i_32_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			} else {
				i_27_ -= i;
				i -= i_28_;
				i_28_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_31_ >> 16, i_30_ >> 16);
					i_30_ += i_33_;
					i_31_ += i_34_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i_27_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_29_ >> 16, i_30_ >> 16);
					i_30_ += i_33_;
					i_29_ += i_32_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			}
		} else {
			i_29_ = i_31_ <<= 16;
			if (i_28_ < 0) {
				i_29_ -= i_33_ * i_28_;
				i_31_ -= i_34_ * i_28_;
				i_28_ = 0;
			}
			i_30_ <<= 16;
			if (i_27_ < 0) {
				i_30_ -= i_32_ * i_27_;
				i_27_ = 0;
			}
			if (i_33_ < i_34_) {
				i -= i_27_;
				i_27_ -= i_28_;
				i_28_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i_27_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_29_ >> 16, i_31_ >> 16);
					i_29_ += i_33_;
					i_31_ += i_34_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_30_ >> 16, i_31_ >> 16);
					i_30_ += i_32_;
					i_31_ += i_34_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			} else {
				i -= i_27_;
				i_27_ -= i_28_;
				i_28_ *= ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				while (--i_27_ >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_31_ >> 16, i_29_ >> 16);
					i_29_ += i_33_;
					i_31_ += i_34_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
				while (--i >= 0) {
					method16046((((Class282_Sub50_Sub17_Sub2) this).aByteArray10454), i_28_, 0, i_31_ >> 16, i_30_ >> 16);
					i_30_ += i_32_;
					i_31_ += i_34_;
					i_28_ += ((Class282_Sub50_Sub17_Sub2) this).anInt10452;
				}
			}
		}
	}

	static final void method16051(byte[] is, int i, int i_35_, int i_36_, int i_37_) {
		if (i_36_ < i_37_) {
			i += i_36_;
			i_35_ = i_37_ - i_36_ >> 2;
			while (--i_35_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_35_ = i_37_ - i_36_ & 0x3;
			while (--i_35_ >= 0)
				is[i++] = (byte) 1;
		}
	}
}
