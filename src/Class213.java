/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class213 {
	short[] aShortArray2434 = new short[512];
	static int anInt2435 = 4095;
	short[] aShortArray2436;
	static int anInt2437 = 12;
	int anInt2438;
	int anInt2439 = 0;
	int anInt2440 = 4;
	static int anInt2441 = 4096;
	int anInt2442;
	int anInt2443;
	public static int[] anIntArray2444 = new int[4096];

	void method1958(int i, int i_0_, int i_1_) {
		int[] is = new int[i];
		int[] is_2_ = new int[i_0_];
		int[] is_3_ = new int[i_1_];
		for (int i_4_ = 0; i_4_ < i; i_4_++)
			is[i_4_] = (i_4_ << 12) / i;
		for (int i_5_ = 0; i_5_ < i_0_; i_5_++)
			is_2_[i_5_] = (i_5_ << 12) / i_0_;
		for (int i_6_ = 0; i_6_ < i_1_; i_6_++)
			is_3_[i_6_] = (i_6_ << 12) / i_1_;
		method1959();
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
			for (int i_8_ = 0; i_8_ < i_0_; i_8_++) {
				for (int i_9_ = 0; i_9_ < i; i_9_++) {
					for (int i_10_ = 0; i_10_ < ((Class213) this).anInt2443; i_10_++) {
						int i_11_ = ((Class213) this).aShortArray2436[i_10_] << 12;
						int i_12_ = ((Class213) this).anInt2440 * i_11_ >> 12;
						int i_13_ = ((Class213) this).anInt2438 * i_11_ >> 12;
						int i_14_ = ((Class213) this).anInt2442 * i_11_ >> 12;
						int i_15_ = is[i_9_] * i_11_ >> 12;
						int i_16_ = is_2_[i_8_] * i_11_ >> 12;
						int i_17_ = is_3_[i_7_] * i_11_ >> 12;
						i_15_ *= ((Class213) this).anInt2440;
						i_16_ *= ((Class213) this).anInt2438;
						i_17_ *= ((Class213) this).anInt2442;
						int i_18_ = i_15_ >> 12;
						int i_19_ = i_18_ + 1;
						i_18_ &= 0xff;
						int i_20_ = i_16_ >> 12;
						int i_21_ = i_20_ + 1;
						i_20_ &= 0xff;
						int i_22_ = i_17_ >> 12;
						int i_23_ = i_22_ + 1;
						i_22_ &= 0xff;
						if (i_19_ >= i_12_)
							i_19_ = 0;
						else
							i_19_ &= 0xff;
						if (i_21_ >= i_13_)
							i_21_ = 0;
						else
							i_21_ &= 0xff;
						if (i_23_ >= i_14_)
							i_23_ = 0;
						else
							i_23_ &= 0xff;
						i_15_ &= 0xfff;
						i_16_ &= 0xfff;
						i_17_ &= 0xfff;
						int i_24_ = anIntArray2444[i_15_];
						int i_25_ = anIntArray2444[i_16_];
						int i_26_ = anIntArray2444[i_17_];
						int i_27_ = i_15_ - 4096;
						int i_28_ = i_16_ - 4096;
						int i_29_ = i_17_ - 4096;
						int i_30_ = ((Class213) this).aShortArray2434[i_22_];
						int i_31_ = ((Class213) this).aShortArray2434[i_23_];
						int i_32_ = ((Class213) this).aShortArray2434[i_20_ + i_30_];
						int i_33_ = ((Class213) this).aShortArray2434[i_21_ + i_30_];
						int i_34_ = ((Class213) this).aShortArray2434[i_20_ + i_31_];
						int i_35_ = ((Class213) this).aShortArray2434[i_21_ + i_31_];
						int i_36_ = method1965((((Class213) this).aShortArray2434[i_18_ + i_32_]), i_15_, i_16_, i_17_);
						int i_37_ = method1965((((Class213) this).aShortArray2434[i_19_ + i_32_]), i_27_, i_16_, i_17_);
						int i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method1965((((Class213) this).aShortArray2434[i_18_ + i_33_]), i_15_, i_28_, i_17_);
						i_37_ = method1965((((Class213) this).aShortArray2434[i_19_ + i_33_]), i_27_, i_28_, i_17_);
						int i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_40_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						i_36_ = method1965((((Class213) this).aShortArray2434[i_18_ + i_34_]), i_15_, i_16_, i_29_);
						i_37_ = method1965((((Class213) this).aShortArray2434[i_19_ + i_34_]), i_27_, i_16_, i_29_);
						i_38_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						i_36_ = method1965((((Class213) this).aShortArray2434[i_18_ + i_35_]), i_15_, i_28_, i_29_);
						i_37_ = method1965((((Class213) this).aShortArray2434[i_19_ + i_35_]), i_27_, i_28_, i_29_);
						i_39_ = i_36_ + (i_24_ * (i_37_ - i_36_) >> 12);
						int i_41_ = i_38_ + (i_25_ * (i_39_ - i_38_) >> 12);
						method1961(i_10_, i_40_ + (i_26_ * (i_41_ - i_40_) >> 12));
					}
					method1970();
				}
			}
		}
	}

	abstract void method1959();

	abstract void method1960(int i, int i_42_);

	abstract void method1961(int i, int i_43_);

	void method1962() {
		((Class213) this).aShortArray2436 = new short[((Class213) this).anInt2443];
		for (int i = 0; i < ((Class213) this).anInt2443; i++)
			((Class213) this).aShortArray2436[i] = (short) (int) Math.pow(2.0, (double) i);
	}

	static final int method1963(int i) {
		int i_44_ = i * (i * i >> 12) >> 12;
		int i_45_ = i * 6 - 61440;
		int i_46_ = 40960 + (i_45_ * i >> 12);
		return i_46_ * i_44_ >> 12;
	}

	void method1964() {
		Random random = new Random((long) ((Class213) this).anInt2439);
		for (int i = 0; i < 255; i++)
			((Class213) this).aShortArray2434[i] = (short) i;
		for (int i = 0; i < 255; i++) {
			int i_47_ = 255 - i;
			int i_48_ = Class298_Sub19_Sub3.method3039(random, i_47_, (byte) -33);
			short i_49_ = ((Class213) this).aShortArray2434[i_48_];
			((Class213) this).aShortArray2434[i_48_] = ((Class213) this).aShortArray2434[i_47_];
			((Class213) this).aShortArray2434[i_47_] = ((Class213) this).aShortArray2434[i_47_ + 256] = i_49_;
		}
	}

	static int method1965(int i, int i_50_, int i_51_, int i_52_) {
		int i_53_ = i & 0xf;
		int i_54_ = i_53_ < 8 ? i_50_ : i_51_;
		int i_55_ = i_53_ < 4 ? i_51_ : i_53_ == 12 || i_53_ == 14 ? i_50_ : i_52_;
		return (((i_53_ & 0x1) == 0 ? i_54_ : -i_54_) + ((i_53_ & 0x2) == 0 ? i_55_ : -i_55_));
	}

	abstract void method1966();

	abstract void method1967();

	static {
		for (int i = 0; i < 4096; i++)
			anIntArray2444[i] = method1963(i);
	}

	abstract void method1968(int i, int i_56_);

	abstract void method1969(int i, int i_57_);

	Class213(int i, int i_58_, int i_59_, int i_60_, int i_61_) {
		((Class213) this).anInt2438 = 4;
		((Class213) this).anInt2442 = 4;
		((Class213) this).anInt2443 = 4;
		((Class213) this).anInt2439 = i;
		((Class213) this).anInt2440 = i_59_;
		((Class213) this).anInt2438 = i_60_;
		((Class213) this).anInt2442 = i_61_;
		((Class213) this).anInt2443 = i_58_;
		method1962();
		method1964();
	}

	abstract void method1970();
}
