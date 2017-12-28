/* Class275_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class275_Sub5 extends Class275 {
	public int anInt7846;
	public int anInt7847;
	public int anInt7848;
	public boolean aBool7849 = false;
	public int anInt7850;
	public int anInt7851;

	public boolean method12591(int i, int i_0_) {
		if (!aBool7849)
			return false;
		int i_1_ = anInt7850 - anInt7847;
		int i_2_ = anInt7846 - anInt7848;
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = i * i_1_ + i_0_ * i_2_ - (anInt7847 * i_1_ + anInt7848 * i_2_);
		if (i_4_ <= 0) {
			int i_5_ = anInt7847 - i;
			int i_6_ = anInt7848 - i_0_;
			return i_5_ * i_5_ + i_6_ * i_6_ < anInt7851 * anInt7851;
		}
		if (i_4_ > i_3_) {
			int i_7_ = anInt7850 - i;
			int i_8_ = anInt7846 - i_0_;
			return i_7_ * i_7_ + i_8_ * i_8_ < anInt7851 * anInt7851;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = anInt7847 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = anInt7848 + (i_2_ * i_4_ >> 10) - i_0_;
		return i_9_ * i_9_ + i_10_ * i_10_ < anInt7851 * anInt7851;
	}

	public boolean method12592(int i, int i_11_) {
		if (!aBool7849)
			return false;
		int i_12_ = anInt7850 - anInt7847;
		int i_13_ = anInt7846 - anInt7848;
		int i_14_ = i_12_ * i_12_ + i_13_ * i_13_;
		int i_15_ = (i * i_12_ + i_11_ * i_13_ - (anInt7847 * i_12_ + anInt7848 * i_13_));
		if (i_15_ <= 0) {
			int i_16_ = anInt7847 - i;
			int i_17_ = anInt7848 - i_11_;
			return i_16_ * i_16_ + i_17_ * i_17_ < anInt7851 * anInt7851;
		}
		if (i_15_ > i_14_) {
			int i_18_ = anInt7850 - i;
			int i_19_ = anInt7846 - i_11_;
			return i_18_ * i_18_ + i_19_ * i_19_ < anInt7851 * anInt7851;
		}
		i_15_ = (i_15_ << 10) / i_14_;
		int i_20_ = anInt7847 + (i_12_ * i_15_ >> 10) - i;
		int i_21_ = anInt7848 + (i_13_ * i_15_ >> 10) - i_11_;
		return i_20_ * i_20_ + i_21_ * i_21_ < anInt7851 * anInt7851;
	}

	public boolean method12593(int i, int i_22_) {
		if (!aBool7849)
			return false;
		int i_23_ = anInt7850 - anInt7847;
		int i_24_ = anInt7846 - anInt7848;
		int i_25_ = i_23_ * i_23_ + i_24_ * i_24_;
		int i_26_ = (i * i_23_ + i_22_ * i_24_ - (anInt7847 * i_23_ + anInt7848 * i_24_));
		if (i_26_ <= 0) {
			int i_27_ = anInt7847 - i;
			int i_28_ = anInt7848 - i_22_;
			return i_27_ * i_27_ + i_28_ * i_28_ < anInt7851 * anInt7851;
		}
		if (i_26_ > i_25_) {
			int i_29_ = anInt7850 - i;
			int i_30_ = anInt7846 - i_22_;
			return i_29_ * i_29_ + i_30_ * i_30_ < anInt7851 * anInt7851;
		}
		i_26_ = (i_26_ << 10) / i_25_;
		int i_31_ = anInt7847 + (i_23_ * i_26_ >> 10) - i;
		int i_32_ = anInt7848 + (i_24_ * i_26_ >> 10) - i_22_;
		return i_31_ * i_31_ + i_32_ * i_32_ < anInt7851 * anInt7851;
	}

	public boolean method12594(int i, int i_33_) {
		if (!aBool7849)
			return false;
		int i_34_ = anInt7850 - anInt7847;
		int i_35_ = anInt7846 - anInt7848;
		int i_36_ = i_34_ * i_34_ + i_35_ * i_35_;
		int i_37_ = (i * i_34_ + i_33_ * i_35_ - (anInt7847 * i_34_ + anInt7848 * i_35_));
		if (i_37_ <= 0) {
			int i_38_ = anInt7847 - i;
			int i_39_ = anInt7848 - i_33_;
			return i_38_ * i_38_ + i_39_ * i_39_ < anInt7851 * anInt7851;
		}
		if (i_37_ > i_36_) {
			int i_40_ = anInt7850 - i;
			int i_41_ = anInt7846 - i_33_;
			return i_40_ * i_40_ + i_41_ * i_41_ < anInt7851 * anInt7851;
		}
		i_37_ = (i_37_ << 10) / i_36_;
		int i_42_ = anInt7847 + (i_34_ * i_37_ >> 10) - i;
		int i_43_ = anInt7848 + (i_35_ * i_37_ >> 10) - i_33_;
		return i_42_ * i_42_ + i_43_ * i_43_ < anInt7851 * anInt7851;
	}
}
