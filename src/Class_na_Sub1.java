import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* Class_na_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class_na_Sub1 extends Class_na {
	int anInt10012;
	int anInt10013;
	int anInt10014;
	static int anInt10015 = 16;
	int anInt10016;
	byte[] aByteArray10017;

	boolean method3481(int i, int i_0_) {
		return ((Class_na_Sub1) this).aByteArray10017.length >= i * i_0_;
	}

	void method3482() {
		int i = -1;
		int i_1_ = ((Class_na_Sub1) this).aByteArray10017.length - 8;
		while (i < i_1_) {
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
		}
		while (i < ((Class_na_Sub1) this).aByteArray10017.length - 1)
			((Class_na_Sub1) this).aByteArray10017[++i] = (byte) 0;
	}

	void method3483(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = 0;
		if (i_2_ != i)
			i_7_ = (i_5_ - i_4_ << 16) / (i_2_ - i);
		int i_8_ = 0;
		if (i_3_ != i_2_)
			i_8_ = (i_6_ - i_5_ << 16) / (i_3_ - i_2_);
		int i_9_ = 0;
		if (i_3_ != i)
			i_9_ = (i_4_ - i_6_ << 16) / (i - i_3_);
		if (i <= i_2_ && i <= i_3_) {
			if (i_2_ < i_3_) {
				i_6_ = i_4_ <<= 16;
				if (i < 0) {
					i_6_ -= i_9_ * i;
					i_4_ -= i_7_ * i;
					i = 0;
				}
				i_5_ <<= 16;
				if (i_2_ < 0) {
					i_5_ -= i_8_ * i_2_;
					i_2_ = 0;
				}
				if (i != i_2_ && i_9_ < i_7_ || i == i_2_ && i_9_ > i_8_) {
					i_3_ -= i_2_;
					i_2_ -= i;
					i *= ((Class_na_Sub1) this).anInt10013;
					while (--i_2_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_6_ >> 16, i_4_ >> 16);
						i_6_ += i_9_;
						i_4_ += i_7_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_6_ >> 16, i_5_ >> 16);
						i_6_ += i_9_;
						i_5_ += i_8_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
				} else {
					i_3_ -= i_2_;
					i_2_ -= i;
					i *= ((Class_na_Sub1) this).anInt10013;
					while (--i_2_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_4_ >> 16, i_6_ >> 16);
						i_6_ += i_9_;
						i_4_ += i_7_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_5_ >> 16, i_6_ >> 16);
						i_6_ += i_9_;
						i_5_ += i_8_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
				}
			} else {
				i_5_ = i_4_ <<= 16;
				if (i < 0) {
					i_5_ -= i_9_ * i;
					i_4_ -= i_7_ * i;
					i = 0;
				}
				i_6_ <<= 16;
				if (i_3_ < 0) {
					i_6_ -= i_8_ * i_3_;
					i_3_ = 0;
				}
				if (i != i_3_ && i_9_ < i_7_ || i == i_3_ && i_8_ > i_7_) {
					i_2_ -= i_3_;
					i_3_ -= i;
					i *= ((Class_na_Sub1) this).anInt10013;
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_5_ >> 16, i_4_ >> 16);
						i_5_ += i_9_;
						i_4_ += i_7_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i_2_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_6_ >> 16, i_4_ >> 16);
						i_6_ += i_8_;
						i_4_ += i_7_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
				} else {
					i_2_ -= i_3_;
					i_3_ -= i;
					i *= ((Class_na_Sub1) this).anInt10013;
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_4_ >> 16, i_5_ >> 16);
						i_5_ += i_9_;
						i_4_ += i_7_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i_2_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i, 0, i_4_ >> 16, i_6_ >> 16);
						i_6_ += i_8_;
						i_4_ += i_7_;
						i += ((Class_na_Sub1) this).anInt10013;
					}
				}
			}
		} else if (i_2_ <= i_3_) {
			if (i_3_ < i) {
				i_4_ = i_5_ <<= 16;
				if (i_2_ < 0) {
					i_4_ -= i_7_ * i_2_;
					i_5_ -= i_8_ * i_2_;
					i_2_ = 0;
				}
				i_6_ <<= 16;
				if (i_3_ < 0) {
					i_6_ -= i_9_ * i_3_;
					i_3_ = 0;
				}
				if (i_2_ != i_3_ && i_7_ < i_8_ || i_2_ == i_3_ && i_7_ > i_9_) {
					i -= i_3_;
					i_3_ -= i_2_;
					i_2_ *= ((Class_na_Sub1) this).anInt10013;
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_4_ >> 16, i_5_ >> 16);
						i_4_ += i_7_;
						i_5_ += i_8_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_4_ >> 16, i_6_ >> 16);
						i_4_ += i_7_;
						i_6_ += i_9_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
				} else {
					i -= i_3_;
					i_3_ -= i_2_;
					i_2_ *= ((Class_na_Sub1) this).anInt10013;
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_5_ >> 16, i_4_ >> 16);
						i_4_ += i_7_;
						i_5_ += i_8_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_6_ >> 16, i_4_ >> 16);
						i_4_ += i_7_;
						i_6_ += i_9_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
				}
			} else {
				i_6_ = i_5_ <<= 16;
				if (i_2_ < 0) {
					i_6_ -= i_7_ * i_2_;
					i_5_ -= i_8_ * i_2_;
					i_2_ = 0;
				}
				i_4_ <<= 16;
				if (i < 0) {
					i_4_ -= i_9_ * i;
					i = 0;
				}
				if (i_7_ < i_8_) {
					i_3_ -= i;
					i -= i_2_;
					i_2_ *= ((Class_na_Sub1) this).anInt10013;
					while (--i >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_6_ >> 16, i_5_ >> 16);
						i_6_ += i_7_;
						i_5_ += i_8_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_4_ >> 16, i_5_ >> 16);
						i_4_ += i_9_;
						i_5_ += i_8_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
				} else {
					i_3_ -= i;
					i -= i_2_;
					i_2_ *= ((Class_na_Sub1) this).anInt10013;
					while (--i >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_5_ >> 16, i_6_ >> 16);
						i_6_ += i_7_;
						i_5_ += i_8_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
					while (--i_3_ >= 0) {
						method3484(((Class_na_Sub1) this).aByteArray10017, i_2_, 0, i_5_ >> 16, i_4_ >> 16);
						i_4_ += i_9_;
						i_5_ += i_8_;
						i_2_ += ((Class_na_Sub1) this).anInt10013;
					}
				}
			}
		} else if (i < i_2_) {
			i_5_ = i_6_ <<= 16;
			if (i_3_ < 0) {
				i_5_ -= i_8_ * i_3_;
				i_6_ -= i_9_ * i_3_;
				i_3_ = 0;
			}
			i_4_ <<= 16;
			if (i < 0) {
				i_4_ -= i_7_ * i;
				i = 0;
			}
			if (i_8_ < i_9_) {
				i_2_ -= i;
				i -= i_3_;
				i_3_ *= ((Class_na_Sub1) this).anInt10013;
				while (--i >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_5_ >> 16, i_6_ >> 16);
					i_5_ += i_8_;
					i_6_ += i_9_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
				while (--i_2_ >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_5_ >> 16, i_4_ >> 16);
					i_5_ += i_8_;
					i_4_ += i_7_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
			} else {
				i_2_ -= i;
				i -= i_3_;
				i_3_ *= ((Class_na_Sub1) this).anInt10013;
				while (--i >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_6_ >> 16, i_5_ >> 16);
					i_5_ += i_8_;
					i_6_ += i_9_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
				while (--i_2_ >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_4_ >> 16, i_5_ >> 16);
					i_5_ += i_8_;
					i_4_ += i_7_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
			}
		} else {
			i_4_ = i_6_ <<= 16;
			if (i_3_ < 0) {
				i_4_ -= i_8_ * i_3_;
				i_6_ -= i_9_ * i_3_;
				i_3_ = 0;
			}
			i_5_ <<= 16;
			if (i_2_ < 0) {
				i_5_ -= i_7_ * i_2_;
				i_2_ = 0;
			}
			if (i_8_ < i_9_) {
				i -= i_2_;
				i_2_ -= i_3_;
				i_3_ *= ((Class_na_Sub1) this).anInt10013;
				while (--i_2_ >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_4_ >> 16, i_6_ >> 16);
					i_4_ += i_8_;
					i_6_ += i_9_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
				while (--i >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_5_ >> 16, i_6_ >> 16);
					i_5_ += i_7_;
					i_6_ += i_9_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
			} else {
				i -= i_2_;
				i_2_ -= i_3_;
				i_3_ *= ((Class_na_Sub1) this).anInt10013;
				while (--i_2_ >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_6_ >> 16, i_4_ >> 16);
					i_4_ += i_8_;
					i_6_ += i_9_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
				}
				while (--i >= 0) {
					method3484(((Class_na_Sub1) this).aByteArray10017, i_3_, 0, i_6_ >> 16, i_5_ >> 16);
					i_5_ += i_7_;
					i_6_ += i_9_;
					i_3_ += ((Class_na_Sub1) this).anInt10013;
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

	static final void method3484(byte[] is, int i, int i_10_, int i_11_, int i_12_) {
		if (i_11_ < i_12_) {
			i += i_11_;
			i_10_ = i_12_ - i_11_ >> 2;
			while (--i_10_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_10_ = i_12_ - i_11_ & 0x3;
			while (--i_10_ >= 0)
				is[i++] = (byte) 1;
		}
	}

	Class_na_Sub1(Class_ra_Sub2 class_ra_sub2, int i, int i_13_) {
		((Class_na_Sub1) this).aByteArray10017 = new byte[i * i_13_];
	}

	void method3485(int i, int i_14_, int i_15_, int i_16_) {
		((Class_na_Sub1) this).anInt10012 = i;
		((Class_na_Sub1) this).anInt10016 = i_14_;
		((Class_na_Sub1) this).anInt10013 = i_15_ - i;
		((Class_na_Sub1) this).anInt10014 = i_16_ - i_14_;
	}
}
