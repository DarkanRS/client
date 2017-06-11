/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81 {
	static int anInt753;
	static int anInt754;
	static int anInt755;
	static int[] anIntArray756;
	static int anInt757;
	static int anInt758;
	static int anInt759;
	static int anInt760;

	public static void method857(GraphicsToolkit class_ra, int[] is, int i) {
		method859(class_ra, is, 0, is.length, i, null, null);
	}

	public static void method858(GraphicsToolkit class_ra, int[] is, int i, int[] is_0_, int[] is_1_) {
		method859(class_ra, is, 0, is.length, i, is_0_, is_1_);
	}

	static void method859(GraphicsToolkit class_ra, int[] is, int i, int i_2_, int i_3_, int[] is_4_, int[] is_5_) {
		int[] is_6_ = new int[4];
		class_ra.qa(is_6_);
		if (is_4_ != null && is_6_[3] - is_6_[1] != is_4_.length)
			throw new IllegalStateException();
		method864();
		method860(is, i, i_2_);
		method861(is_6_[1]);
		while (method862(is_6_[3])) {
			int i_7_ = anInt754;
			int i_8_ = anInt755;
			int i_9_ = anInt757;
			if (is_4_ != null) {
				int i_10_ = i_9_ - is_6_[1];
				if (i_7_ < is_4_[i_10_] + is_6_[0])
					i_7_ = is_4_[i_10_] + is_6_[0];
				if (i_8_ > is_4_[i_10_] + is_5_[i_10_] + is_6_[0])
					i_8_ = is_4_[i_10_] + is_5_[i_10_] + is_6_[0];
				if (i_8_ - i_7_ <= 0)
					continue;
			}
			class_ra.XA(i_7_, i_9_, i_8_ - i_7_, i_3_, 1);
		}
	}

	static void method860(int[] is, int i, int i_11_) {
		int i_12_ = anInt753 + (i_11_ << 1);
		if (anIntArray756 == null || anIntArray756.length < i_12_) {
			int[] is_13_ = new int[i_12_];
			for (int i_14_ = 0; i_14_ < anInt753; i_14_++)
				is_13_[i_14_] = anIntArray756[i_14_];
			anIntArray756 = is_13_;
		}
		i_11_ += i;
		int i_15_ = i_11_ - 2;
		for (int i_16_ = i; i_16_ < i_11_; i_16_ += 2) {
			int i_17_ = is[i_15_ + 1];
			int i_18_ = is[i_16_ + 1];
			if (i_17_ < i_18_) {
				anIntArray756[anInt753++] = is[i_15_];
				anIntArray756[anInt753++] = i_17_;
				anIntArray756[anInt753++] = is[i_16_];
				anIntArray756[anInt753++] = i_18_;
			} else if (i_18_ < i_17_) {
				anIntArray756[anInt753++] = is[i_16_];
				anIntArray756[anInt753++] = i_18_;
				anIntArray756[anInt753++] = is[i_15_];
				anIntArray756[anInt753++] = i_17_;
			}
			i_15_ = i_16_;
		}
	}

	static void method861(int i) {
		if (anInt753 < 0) {
			anInt760 = 0;
			anInt759 = 0;
			anInt758 = 0;
			anInt757 = 2147483646;
		} else {
			method863(0, anInt753);
			int i_19_ = anIntArray756[1];
			if (i_19_ < i)
				i_19_ = i;
			int i_20_ = 0;
			int i_21_;
			for (i_21_ = 0; i_21_ < anInt753; i_21_ += 4) {
				int i_22_ = anIntArray756[i_21_ + 1];
				if (i_19_ < i_22_)
					break;
				int i_23_ = anIntArray756[i_21_];
				int i_24_ = anIntArray756[i_21_ + 2];
				int i_25_ = anIntArray756[i_21_ + 3];
				int i_26_ = (i_24_ - i_23_ << 16) / (i_25_ - i_22_);
				int i_27_ = (i_23_ << 16) + 32768;
				anIntArray756[i_21_] = i_27_ + (i_19_ - i_22_) * i_26_;
				anIntArray756[i_21_ + 2] = i_26_;
			}
			anInt758 = i_20_;
			anInt759 = i_21_;
			anInt760 = i_21_;
			anInt757 = i_19_ - 1;
		}
	}

	static boolean method862(int i) {
		int i_28_ = anInt759;
		int i_29_ = anInt760;
		int i_30_ = anInt757;
		int i_31_;
		for (/**/; i_29_ >= i_28_; i_29_ = i_31_) {
			anInt757 = ++i_30_;
			if (i_30_ >= i)
				return false;
			i_31_ = anInt758;
			for (/**/; i_28_ < anInt753; i_28_ += 4) {
				int i_32_ = anIntArray756[i_28_ + 1];
				if (i_30_ < i_32_)
					break;
				int i_33_ = anIntArray756[i_28_];
				int i_34_ = anIntArray756[i_28_ + 2];
				int i_35_ = anIntArray756[i_28_ + 3];
				int i_36_ = (i_34_ - i_33_ << 16) / (i_35_ - i_32_);
				int i_37_ = (i_33_ << 16) + 32768;
				anIntArray756[i_28_] = i_37_;
				anIntArray756[i_28_ + 2] = i_36_;
			}
			for (int i_38_ = i_31_; i_38_ < i_28_; i_38_ += 4) {
				int i_39_ = anIntArray756[i_38_ + 3];
				if (i_30_ >= i_39_) {
					anIntArray756[i_38_] = anIntArray756[i_31_];
					anIntArray756[i_38_ + 1] = anIntArray756[i_31_ + 1];
					anIntArray756[i_38_ + 2] = anIntArray756[i_31_ + 2];
					anIntArray756[i_38_ + 3] = anIntArray756[i_31_ + 3];
					i_31_ += 4;
				}
			}
			if (i_31_ == anInt753) {
				anInt753 = 0;
				return false;
			}
			method865(i_31_, i_28_);
			anInt758 = i_31_;
			anInt759 = i_28_;
		}
		anInt754 = anIntArray756[i_29_] >> 16;
		anInt755 = anIntArray756[i_29_ + 4] >> 16;
		anIntArray756[i_29_] += anIntArray756[i_29_ + 2];
		anIntArray756[i_29_ + 4] += anIntArray756[i_29_ + 6];
		i_29_ += 8;
		anInt760 = i_29_;
		return true;
	}

	static void method863(int i, int i_40_) {
		if (i_40_ > i + 4) {
			int i_41_ = i;
			int i_42_ = anIntArray756[i_41_];
			int i_43_ = anIntArray756[i_41_ + 1];
			int i_44_ = anIntArray756[i_41_ + 2];
			int i_45_ = anIntArray756[i_41_ + 3];
			for (int i_46_ = i + 4; i_46_ < i_40_; i_46_ += 4) {
				int i_47_ = anIntArray756[i_46_ + 1];
				if (i_47_ < i_43_) {
					anIntArray756[i_41_] = anIntArray756[i_46_];
					anIntArray756[i_41_ + 1] = i_47_;
					anIntArray756[i_41_ + 2] = anIntArray756[i_46_ + 2];
					anIntArray756[i_41_ + 3] = anIntArray756[i_46_ + 3];
					i_41_ += 4;
					anIntArray756[i_46_] = anIntArray756[i_41_];
					anIntArray756[i_46_ + 1] = anIntArray756[i_41_ + 1];
					anIntArray756[i_46_ + 2] = anIntArray756[i_41_ + 2];
					anIntArray756[i_46_ + 3] = anIntArray756[i_41_ + 3];
				}
			}
			anIntArray756[i_41_] = i_42_;
			anIntArray756[i_41_ + 1] = i_43_;
			anIntArray756[i_41_ + 2] = i_44_;
			anIntArray756[i_41_ + 3] = i_45_;
			method863(i, i_41_);
			method863(i_41_ + 4, i_40_);
		}
	}

	static void method864() {
		anInt753 = 0;
	}

	Class81() throws Throwable {
		throw new Error();
	}

	static void method865(int i, int i_48_) {
		for (/**/; i_48_ >= i + 8; i_48_ -= 4) {
			boolean bool = true;
			for (int i_49_ = i + 4; i_49_ < i_48_; i_49_ += 4) {
				int i_50_ = anIntArray756[i_49_ - 4];
				int i_51_ = anIntArray756[i_49_];
				if (i_50_ > i_51_) {
					bool = false;
					anIntArray756[i_49_ - 4] = i_51_;
					anIntArray756[i_49_] = i_50_;
					i_50_ = anIntArray756[i_49_ - 2];
					anIntArray756[i_49_ - 2] = anIntArray756[i_49_ + 2];
					anIntArray756[i_49_ + 2] = i_50_;
					i_50_ = anIntArray756[i_49_ - 1];
					anIntArray756[i_49_ - 1] = anIntArray756[i_49_ + 3];
					anIntArray756[i_49_ + 3] = i_50_;
				}
			}
			if (bool)
				break;
		}
	}
}
