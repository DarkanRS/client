/* Class282_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub27 extends Class282 {
	int anInt7691;
	int anInt7692;
	boolean aBool7693;
	int[] anIntArray7694;
	int anInt7695;
	static int[] anIntArray7696;

	void method12403(int i, int i_0_) {
		if (i != 0 || i_0_ != 0) {
			if (anIntArray7696 == null || (anIntArray7696.length != ((Class282_Sub27) this).anIntArray7694.length))
				anIntArray7696 = new int[((Class282_Sub27) this).anIntArray7694.length];
			int i_1_ = ((Class282_Sub27) this).anIntArray7694.length;
			int i_2_ = i;
			int i_3_ = ((Class282_Sub27) this).anInt7691 - 1;
			int i_4_ = ((Class282_Sub27) this).anInt7691 * i_0_;
			int i_5_ = i_1_ - 1;
			for (int i_6_ = 0; i_6_ < i_1_; i_6_ += ((Class282_Sub27) this).anInt7691) {
				int i_7_ = i_6_ + i_4_ & i_5_;
				for (int i_8_ = 0; i_8_ < ((Class282_Sub27) this).anInt7691; i_8_++) {
					int i_9_ = i_6_ + i_8_;
					int i_10_ = i_7_ + (i_8_ + i_2_ & i_3_);
					anIntArray7696[i_9_] = ((Class282_Sub27) this).anIntArray7694[i_10_];
				}
			}
			int[] is = ((Class282_Sub27) this).anIntArray7694;
			((Class282_Sub27) this).anIntArray7694 = anIntArray7696;
			anIntArray7696 = is;
		}
	}

	Class282_Sub27(int i, int i_11_, int[] is, boolean bool) {
		((Class282_Sub27) this).anInt7695 = i;
		((Class282_Sub27) this).anInt7691 = i_11_;
		((Class282_Sub27) this).anIntArray7694 = is;
		if (bool) {
			int[] is_12_ = new int[((Class282_Sub27) this).anInt7691];
			int[] is_13_ = new int[((Class282_Sub27) this).anInt7691];
			int[] is_14_ = new int[((Class282_Sub27) this).anInt7691];
			int[] is_15_ = new int[((Class282_Sub27) this).anInt7691];
			if (anIntArray7696 == null || (anIntArray7696.length != ((Class282_Sub27) this).anIntArray7694.length))
				anIntArray7696 = new int[((Class282_Sub27) this).anIntArray7694.length];
			int i_16_ = ((Class282_Sub27) this).anInt7691;
			int i_17_ = ((Class282_Sub27) this).anInt7691;
			int i_18_ = i_16_ - 1;
			int i_19_ = i_17_ - 1;
			int i_20_ = i_16_ * i_17_;
			int i_22_;
			int i_21_ = i_22_ = 1 * i_16_;
			for (int i_23_ = 2; i_23_ >= 0; i_23_--) {
				for (int i_24_ = i_18_; i_24_ >= 0; i_24_--) {
					int i_25_ = ((Class282_Sub27) this).anIntArray7694[--i_22_];
					is_12_[i_24_] += i_25_ >> 24 & 0xff;
					is_13_[i_24_] += i_25_ >> 16 & 0xff;
					is_14_[i_24_] += i_25_ >> 8 & 0xff;
					is_15_[i_24_] += i_25_ & 0xff;
				}
				if (i_22_ == 0)
					i_22_ = i_20_;
			}
			int i_26_ = i_20_;
			for (int i_27_ = i_19_; i_27_ >= 0; i_27_--) {
				int i_28_ = 1;
				int i_29_ = 1;
				int i_30_ = 0;
				int i_31_ = 0;
				int i_32_ = 0;
				int i_33_ = 0;
				for (int i_34_ = 2; i_34_ >= 0; i_34_--) {
					i_29_--;
					i_33_ += is_12_[i_29_];
					i_32_ += is_13_[i_29_];
					i_30_ += is_14_[i_29_];
					i_31_ += is_15_[i_29_];
					if (i_29_ == 0)
						i_29_ = i_16_;
				}
				for (int i_35_ = i_18_; i_35_ >= 0; i_35_--) {
					i_29_--;
					i_28_--;
					int i_36_ = i_33_ / 9;
					int i_37_ = i_32_ / 9;
					int i_38_ = i_30_ / 9;
					int i_39_ = i_31_ / 9;
					anIntArray7696[--i_26_] = i_36_ << 24 | i_37_ << 16 | i_38_ << 8 | i_39_;
					i_33_ += is_12_[i_29_] - is_12_[i_28_];
					i_32_ += is_13_[i_29_] - is_13_[i_28_];
					i_31_ += is_15_[i_29_] - is_15_[i_28_];
					i_30_ += is_14_[i_29_] - is_14_[i_28_];
					if (i_29_ == 0)
						i_29_ = i_16_;
					if (i_28_ == 0)
						i_28_ = i_16_;
				}
				for (int i_40_ = i_18_; i_40_ >= 0; i_40_--) {
					int i_41_ = ((Class282_Sub27) this).anIntArray7694[--i_22_];
					int i_42_ = ((Class282_Sub27) this).anIntArray7694[--i_21_];
					is_12_[i_40_] += (i_41_ >> 24 & 0xff) - (i_42_ >> 24 & 0xff);
					is_13_[i_40_] += (i_41_ >> 16 & 0xff) - (i_42_ >> 16 & 0xff);
					is_14_[i_40_] += (i_41_ >> 8 & 0xff) - (i_42_ >> 8 & 0xff);
					is_15_[i_40_] += (i_41_ & 0xff) - (i_42_ & 0xff);
				}
				if (i_22_ == 0)
					i_22_ = i_20_;
				if (i_21_ == 0)
					i_21_ = i_20_;
			}
			int[] is_43_ = ((Class282_Sub27) this).anIntArray7694;
			((Class282_Sub27) this).anIntArray7694 = anIntArray7696;
			anIntArray7696 = is_43_;
		}
	}

	void method12404(int i, int i_44_) {
		if (i != 0 || i_44_ != 0) {
			if (anIntArray7696 == null || (anIntArray7696.length != ((Class282_Sub27) this).anIntArray7694.length))
				anIntArray7696 = new int[((Class282_Sub27) this).anIntArray7694.length];
			int i_45_ = ((Class282_Sub27) this).anIntArray7694.length;
			int i_46_ = i;
			int i_47_ = ((Class282_Sub27) this).anInt7691 - 1;
			int i_48_ = ((Class282_Sub27) this).anInt7691 * i_44_;
			int i_49_ = i_45_ - 1;
			for (int i_50_ = 0; i_50_ < i_45_; i_50_ += ((Class282_Sub27) this).anInt7691) {
				int i_51_ = i_50_ + i_48_ & i_49_;
				for (int i_52_ = 0; i_52_ < ((Class282_Sub27) this).anInt7691; i_52_++) {
					int i_53_ = i_50_ + i_52_;
					int i_54_ = i_51_ + (i_52_ + i_46_ & i_47_);
					anIntArray7696[i_53_] = ((Class282_Sub27) this).anIntArray7694[i_54_];
				}
			}
			int[] is = ((Class282_Sub27) this).anIntArray7694;
			((Class282_Sub27) this).anIntArray7694 = anIntArray7696;
			anIntArray7696 = is;
		}
	}

	int[] method12405() {
		return ((Class282_Sub27) this).anIntArray7694;
	}

	int[] method12406() {
		return ((Class282_Sub27) this).anIntArray7694;
	}
}
