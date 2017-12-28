/* Class282_Sub50_Sub17_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub17_Sub1 extends Class282_Sub50_Sub17 {
	static final int anInt10292 = 16;
	int anInt10293;
	int anInt10294;
	int anInt10295;
	int anInt10296;
	byte[] aByteArray10297;

	static final void method15709(byte[] is, int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ < i_2_) {
			i += i_1_;
			i_0_ = i_2_ - i_1_ >> 2;
			while (--i_0_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_0_ = i_2_ - i_1_ & 0x3;
			while (--i_0_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	boolean method15710(int i, int i_3_) {
		return (((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length >= i * i_3_);
	}

	static final void method15711(byte[] is, int i, int i_4_, int i_5_, int i_6_) {
		if (i_5_ < i_6_) {
			i += i_5_;
			i_4_ = i_6_ - i_5_ >> 2;
			while (--i_4_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_4_ = i_6_ - i_5_ & 0x3;
			while (--i_4_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method15712() {
		int i = -1;
		int i_7_ = ((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length - 8;
		while (i < i_7_) {
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
		}
		while (i < ((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length - 1)
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
	}

	void method15713(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = 0;
		if (i_8_ != i)
			i_13_ = (i_11_ - i_10_ << 16) / (i_8_ - i);
		int i_14_ = 0;
		if (i_9_ != i_8_)
			i_14_ = (i_12_ - i_11_ << 16) / (i_9_ - i_8_);
		int i_15_ = 0;
		if (i_9_ != i)
			i_15_ = (i_10_ - i_12_ << 16) / (i - i_9_);
		if (i <= i_8_ && i <= i_9_) {
			if (i_8_ < i_9_) {
				i_12_ = i_10_ <<= 16;
				if (i < 0) {
					i_12_ -= i_15_ * i;
					i_10_ -= i_13_ * i;
					i = 0;
				}
				i_11_ <<= 16;
				if (i_8_ < 0) {
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				if (i != i_8_ && i_15_ < i_13_ || i == i_8_ && i_15_ > i_14_) {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_8_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_8_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			} else {
				i_11_ = i_10_ <<= 16;
				if (i < 0) {
					i_11_ -= i_15_ * i;
					i_10_ -= i_13_ * i;
					i = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_14_ * i_9_;
					i_9_ = 0;
				}
				if (i != i_9_ && i_15_ < i_13_ || i == i_9_ && i_14_ > i_13_) {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_11_ >> 16, i_10_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_8_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_10_ >> 16, i_11_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_8_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			}
		} else if (i_8_ <= i_9_) {
			if (i_9_ < i) {
				i_10_ = i_11_ <<= 16;
				if (i_8_ < 0) {
					i_10_ -= i_13_ * i_8_;
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				i_12_ <<= 16;
				if (i_9_ < 0) {
					i_12_ -= i_15_ * i_9_;
					i_9_ = 0;
				}
				if (i_8_ != i_9_ && i_13_ < i_14_ || i_8_ == i_9_ && i_13_ > i_15_) {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_10_ >> 16, i_12_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_12_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			} else {
				i_12_ = i_11_ <<= 16;
				if (i_8_ < 0) {
					i_12_ -= i_13_ * i_8_;
					i_11_ -= i_14_ * i_8_;
					i_8_ = 0;
				}
				i_10_ <<= 16;
				if (i < 0) {
					i_10_ -= i_15_ * i;
					i = 0;
				}
				if (i_13_ < i_14_) {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_9_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			}
		} else if (i < i_8_) {
			i_11_ = i_12_ <<= 16;
			if (i_9_ < 0) {
				i_11_ -= i_14_ * i_9_;
				i_12_ -= i_15_ * i_9_;
				i_9_ = 0;
			}
			i_10_ <<= 16;
			if (i < 0) {
				i_10_ -= i_13_ * i;
				i = 0;
			}
			if (i_14_ < i_15_) {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i_8_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_11_ >> 16, i_10_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			} else {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i_8_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_10_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			}
		} else {
			i_10_ = i_12_ <<= 16;
			if (i_9_ < 0) {
				i_10_ -= i_14_ * i_9_;
				i_12_ -= i_15_ * i_9_;
				i_9_ = 0;
			}
			i_11_ <<= 16;
			if (i_8_ < 0) {
				i_11_ -= i_13_ * i_8_;
				i_8_ = 0;
			}
			if (i_14_ < i_15_) {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i_8_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_10_ >> 16, i_12_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			} else {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i_8_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_12_ >> 16, i_10_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			}
		}
	}

	void method15714() {
		int i = -1;
		int i_16_ = ((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length - 8;
		while (i < i_16_) {
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
		}
		while (i < ((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length - 1)
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
	}

	void method15715(int i, int i_17_, int i_18_, int i_19_) {
		((Class282_Sub50_Sub17_Sub1) this).anInt10293 = i;
		((Class282_Sub50_Sub17_Sub1) this).anInt10295 = i_17_;
		((Class282_Sub50_Sub17_Sub1) this).anInt10296 = i_18_ - i;
		((Class282_Sub50_Sub17_Sub1) this).anInt10294 = i_19_ - i_17_;
	}

	boolean method15716(int i, int i_20_) {
		return (((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length >= i * i_20_);
	}

	boolean method15717(int i, int i_21_) {
		return (((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length >= i * i_21_);
	}

	static final void method15718(byte[] is, int i, int i_22_, int i_23_, int i_24_) {
		if (i_23_ < i_24_) {
			i += i_23_;
			i_22_ = i_24_ - i_23_ >> 2;
			while (--i_22_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_22_ = i_24_ - i_23_ & 0x3;
			while (--i_22_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	void method15719() {
		int i = -1;
		int i_25_ = ((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length - 8;
		while (i < i_25_) {
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
		}
		while (i < ((Class282_Sub50_Sub17_Sub1) this).aByteArray10297.length - 1)
			((Class282_Sub50_Sub17_Sub1) this).aByteArray10297[++i] = (byte) 0;
	}

	void method15720(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_) {
		int i_31_ = 0;
		if (i_26_ != i)
			i_31_ = (i_29_ - i_28_ << 16) / (i_26_ - i);
		int i_32_ = 0;
		if (i_27_ != i_26_)
			i_32_ = (i_30_ - i_29_ << 16) / (i_27_ - i_26_);
		int i_33_ = 0;
		if (i_27_ != i)
			i_33_ = (i_28_ - i_30_ << 16) / (i - i_27_);
		if (i <= i_26_ && i <= i_27_) {
			if (i_26_ < i_27_) {
				i_30_ = i_28_ <<= 16;
				if (i < 0) {
					i_30_ -= i_33_ * i;
					i_28_ -= i_31_ * i;
					i = 0;
				}
				i_29_ <<= 16;
				if (i_26_ < 0) {
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				if (i != i_26_ && i_33_ < i_31_ || i == i_26_ && i_33_ > i_32_) {
					i_27_ -= i_26_;
					i_26_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_26_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_30_ >> 16, i_28_ >> 16);
						i_30_ += i_33_;
						i_28_ += i_31_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_30_ >> 16, i_29_ >> 16);
						i_30_ += i_33_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i_27_ -= i_26_;
					i_26_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_26_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_28_ >> 16, i_30_ >> 16);
						i_30_ += i_33_;
						i_28_ += i_31_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_29_ >> 16, i_30_ >> 16);
						i_30_ += i_33_;
						i_29_ += i_32_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			} else {
				i_29_ = i_28_ <<= 16;
				if (i < 0) {
					i_29_ -= i_33_ * i;
					i_28_ -= i_31_ * i;
					i = 0;
				}
				i_30_ <<= 16;
				if (i_27_ < 0) {
					i_30_ -= i_32_ * i_27_;
					i_27_ = 0;
				}
				if (i != i_27_ && i_33_ < i_31_ || i == i_27_ && i_32_ > i_31_) {
					i_26_ -= i_27_;
					i_27_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_29_ >> 16, i_28_ >> 16);
						i_29_ += i_33_;
						i_28_ += i_31_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_26_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_30_ >> 16, i_28_ >> 16);
						i_30_ += i_32_;
						i_28_ += i_31_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i_26_ -= i_27_;
					i_27_ -= i;
					i *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_28_ >> 16, i_29_ >> 16);
						i_29_ += i_33_;
						i_28_ += i_31_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_26_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i, 0, i_28_ >> 16, i_30_ >> 16);
						i_30_ += i_32_;
						i_28_ += i_31_;
						i += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			}
		} else if (i_26_ <= i_27_) {
			if (i_27_ < i) {
				i_28_ = i_29_ <<= 16;
				if (i_26_ < 0) {
					i_28_ -= i_31_ * i_26_;
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				i_30_ <<= 16;
				if (i_27_ < 0) {
					i_30_ -= i_33_ * i_27_;
					i_27_ = 0;
				}
				if (i_26_ != i_27_ && i_31_ < i_32_ || i_26_ == i_27_ && i_31_ > i_33_) {
					i -= i_27_;
					i_27_ -= i_26_;
					i_26_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_28_ >> 16, i_29_ >> 16);
						i_28_ += i_31_;
						i_29_ += i_32_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_28_ >> 16, i_30_ >> 16);
						i_28_ += i_31_;
						i_30_ += i_33_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i -= i_27_;
					i_27_ -= i_26_;
					i_26_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_29_ >> 16, i_28_ >> 16);
						i_28_ += i_31_;
						i_29_ += i_32_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_30_ >> 16, i_28_ >> 16);
						i_28_ += i_31_;
						i_30_ += i_33_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			} else {
				i_30_ = i_29_ <<= 16;
				if (i_26_ < 0) {
					i_30_ -= i_31_ * i_26_;
					i_29_ -= i_32_ * i_26_;
					i_26_ = 0;
				}
				i_28_ <<= 16;
				if (i < 0) {
					i_28_ -= i_33_ * i;
					i = 0;
				}
				if (i_31_ < i_32_) {
					i_27_ -= i;
					i -= i_26_;
					i_26_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_30_ >> 16, i_29_ >> 16);
						i_30_ += i_31_;
						i_29_ += i_32_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_28_ >> 16, i_29_ >> 16);
						i_28_ += i_33_;
						i_29_ += i_32_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				} else {
					i_27_ -= i;
					i -= i_26_;
					i_26_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					while (--i >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_29_ >> 16, i_30_ >> 16);
						i_30_ += i_31_;
						i_29_ += i_32_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
					while (--i_27_ >= 0) {
						method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_26_, 0, i_29_ >> 16, i_28_ >> 16);
						i_28_ += i_33_;
						i_29_ += i_32_;
						i_26_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
					}
				}
			}
		} else if (i < i_26_) {
			i_29_ = i_30_ <<= 16;
			if (i_27_ < 0) {
				i_29_ -= i_32_ * i_27_;
				i_30_ -= i_33_ * i_27_;
				i_27_ = 0;
			}
			i_28_ <<= 16;
			if (i < 0) {
				i_28_ -= i_31_ * i;
				i = 0;
			}
			if (i_32_ < i_33_) {
				i_26_ -= i;
				i -= i_27_;
				i_27_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_29_ >> 16, i_30_ >> 16);
					i_29_ += i_32_;
					i_30_ += i_33_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i_26_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_29_ >> 16, i_28_ >> 16);
					i_29_ += i_32_;
					i_28_ += i_31_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			} else {
				i_26_ -= i;
				i -= i_27_;
				i_27_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_30_ >> 16, i_29_ >> 16);
					i_29_ += i_32_;
					i_30_ += i_33_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i_26_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_28_ >> 16, i_29_ >> 16);
					i_29_ += i_32_;
					i_28_ += i_31_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			}
		} else {
			i_28_ = i_30_ <<= 16;
			if (i_27_ < 0) {
				i_28_ -= i_32_ * i_27_;
				i_30_ -= i_33_ * i_27_;
				i_27_ = 0;
			}
			i_29_ <<= 16;
			if (i_26_ < 0) {
				i_29_ -= i_31_ * i_26_;
				i_26_ = 0;
			}
			if (i_32_ < i_33_) {
				i -= i_26_;
				i_26_ -= i_27_;
				i_27_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i_26_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_28_ >> 16, i_30_ >> 16);
					i_28_ += i_32_;
					i_30_ += i_33_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_29_ >> 16, i_30_ >> 16);
					i_29_ += i_31_;
					i_30_ += i_33_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			} else {
				i -= i_26_;
				i_26_ -= i_27_;
				i_27_ *= ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				while (--i_26_ >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_30_ >> 16, i_28_ >> 16);
					i_28_ += i_32_;
					i_30_ += i_33_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
				while (--i >= 0) {
					method15709((((Class282_Sub50_Sub17_Sub1) this).aByteArray10297), i_27_, 0, i_30_ >> 16, i_29_ >> 16);
					i_29_ += i_31_;
					i_30_ += i_33_;
					i_27_ += ((Class282_Sub50_Sub17_Sub1) this).anInt10296;
				}
			}
		}
	}

	Class282_Sub50_Sub17_Sub1(Class505_Sub1 class505_sub1, int i, int i_34_) {
		((Class282_Sub50_Sub17_Sub1) this).aByteArray10297 = new byte[i * i_34_];
	}

	void method15721(int i, int i_35_, int i_36_, int i_37_) {
		((Class282_Sub50_Sub17_Sub1) this).anInt10293 = i;
		((Class282_Sub50_Sub17_Sub1) this).anInt10295 = i_35_;
		((Class282_Sub50_Sub17_Sub1) this).anInt10296 = i_36_ - i;
		((Class282_Sub50_Sub17_Sub1) this).anInt10294 = i_37_ - i_35_;
	}

	static final void method15722(byte[] is, int i, int i_38_, int i_39_, int i_40_) {
		if (i_39_ < i_40_) {
			i += i_39_;
			i_38_ = i_40_ - i_39_ >> 2;
			while (--i_38_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_38_ = i_40_ - i_39_ & 0x3;
			while (--i_38_ >= 0)
				is[i++] = (byte) 1;
		}
	}
}
