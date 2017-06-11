import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Class_na_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_na_Sub2 extends Class_na {
	int anInt10018;
	int anInt10019;
	byte[] aByteArray10020;
	int anInt10021;
	int anInt10022;
	static int anInt10023 = 16;

	void method3486(int i, int i_0_, int i_1_, int i_2_) {
		((Class_na_Sub2) this).anInt10018 = i;
		((Class_na_Sub2) this).anInt10022 = i_0_;
		((Class_na_Sub2) this).anInt10019 = i_1_ - i;
		((Class_na_Sub2) this).anInt10021 = i_2_ - i_0_;
	}

	void method3487() {
		int i = -1;
		int i_3_ = ((Class_na_Sub2) this).aByteArray10020.length - 8;
		while (i < i_3_) {
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
		}
		while (i < ((Class_na_Sub2) this).aByteArray10020.length - 1)
			((Class_na_Sub2) this).aByteArray10020[++i] = (byte) 0;
	}

	static final void method3488(byte[] is, int i, int i_4_, int i_5_, int i_6_) {
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

	boolean method3489(int i, int i_7_) {
		return ((Class_na_Sub2) this).aByteArray10020.length >= i * i_7_;
	}

	void method3490(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
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
					i *= ((Class_na_Sub2) this).anInt10019;
					while (--i_8_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += ((Class_na_Sub2) this).anInt10019;
					}
				} else {
					i_9_ -= i_8_;
					i_8_ -= i;
					i *= ((Class_na_Sub2) this).anInt10019;
					while (--i_8_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_15_;
						i_11_ += i_14_;
						i += ((Class_na_Sub2) this).anInt10019;
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
					i *= ((Class_na_Sub2) this).anInt10019;
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_11_ >> 16, i_10_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i_8_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_12_ >> 16, i_10_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += ((Class_na_Sub2) this).anInt10019;
					}
				} else {
					i_8_ -= i_9_;
					i_9_ -= i;
					i *= ((Class_na_Sub2) this).anInt10019;
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_10_ >> 16, i_11_ >> 16);
						i_11_ += i_15_;
						i_10_ += i_13_;
						i += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i_8_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i, 0, i_10_ >> 16, i_12_ >> 16);
						i_12_ += i_14_;
						i_10_ += i_13_;
						i += ((Class_na_Sub2) this).anInt10019;
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
					i_8_ *= ((Class_na_Sub2) this).anInt10019;
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_10_ >> 16, i_12_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
					}
				} else {
					i -= i_9_;
					i_9_ -= i_8_;
					i_8_ *= ((Class_na_Sub2) this).anInt10019;
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_12_ >> 16, i_10_ >> 16);
						i_10_ += i_13_;
						i_12_ += i_15_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
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
					i_8_ *= ((Class_na_Sub2) this).anInt10019;
					while (--i >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_12_ >> 16, i_11_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_10_ >> 16, i_11_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
					}
				} else {
					i_9_ -= i;
					i -= i_8_;
					i_8_ *= ((Class_na_Sub2) this).anInt10019;
					while (--i >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_11_ >> 16, i_12_ >> 16);
						i_12_ += i_13_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
					}
					while (--i_9_ >= 0) {
						method3488(((Class_na_Sub2) this).aByteArray10020, i_8_, 0, i_11_ >> 16, i_10_ >> 16);
						i_10_ += i_15_;
						i_11_ += i_14_;
						i_8_ += ((Class_na_Sub2) this).anInt10019;
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
				i_9_ *= ((Class_na_Sub2) this).anInt10019;
				while (--i >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
				while (--i_8_ >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_11_ >> 16, i_10_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
			} else {
				i_8_ -= i;
				i -= i_9_;
				i_9_ *= ((Class_na_Sub2) this).anInt10019;
				while (--i >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
				while (--i_8_ >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_10_ >> 16, i_11_ >> 16);
					i_11_ += i_14_;
					i_10_ += i_13_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
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
				i_9_ *= ((Class_na_Sub2) this).anInt10019;
				while (--i_8_ >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_10_ >> 16, i_12_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
				while (--i >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_11_ >> 16, i_12_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
			} else {
				i -= i_8_;
				i_8_ -= i_9_;
				i_9_ *= ((Class_na_Sub2) this).anInt10019;
				while (--i_8_ >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_12_ >> 16, i_10_ >> 16);
					i_10_ += i_14_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
				while (--i >= 0) {
					method3488(((Class_na_Sub2) this).aByteArray10020, i_9_, 0, i_12_ >> 16, i_11_ >> 16);
					i_11_ += i_13_;
					i_12_ += i_15_;
					i_9_ += ((Class_na_Sub2) this).anInt10019;
				}
			}
		}
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	Class_na_Sub2(Class_ra_Sub3 class_ra_sub3, int i, int i_16_) {
		((Class_na_Sub2) this).aByteArray10020 = new byte[i * i_16_];
	}
}
