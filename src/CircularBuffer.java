/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CircularBuffer {
	static byte[][] aByteArrayArray5767;
	static int anInt5768 = 0;
	static int anInt5769 = 0;
	static byte[][] aByteArrayArray5770;
	static byte[][] aByteArrayArray5771;
	static int anInt5772 = 0;
	static int[] anIntArray5773;

	static {
		aByteArrayArray5767 = new byte[1000][];
		aByteArrayArray5771 = new byte[250][];
		aByteArrayArray5770 = new byte[50][];
	}

	CircularBuffer() throws Throwable {
		throw new Error();
	}

	public static synchronized byte[] method8239(int i, int i_1_) {
		if (100 == i && -1753327595 * anInt5768 > 0) {
			byte[] is = aByteArrayArray5767[(anInt5768 -= -608782531) * -1753327595];
			aByteArrayArray5767[anInt5768 * -1753327595] = null;
			return is;
		}
		if (i == 5000 && anInt5769 * -495226665 > 0) {
			byte[] is = aByteArrayArray5771[(anInt5769 -= 758153959) * -495226665];
			aByteArrayArray5771[-495226665 * anInt5769] = null;
			return is;
		}
		if (i == 30000 && -1159034629 * anInt5772 > 0) {
			byte[] is = (aByteArrayArray5770[(anInt5772 -= -1912454605) * -1159034629]);
			aByteArrayArray5770[anInt5772 * -1159034629] = null;
			return is;
		}
		if (IcmpService_Sub1.aByteArrayArrayArray7963 != null) {
			for (int i_2_ = 0; i_2_ < anIntArray5773.length; i_2_++) {
				if (anIntArray5773[i_2_] == i && Class412.anIntArray4962[i_2_] > 0) {
					byte[] is = (IcmpService_Sub1.aByteArrayArrayArray7963[i_2_][--Class412.anIntArray4962[i_2_]]);
					IcmpService_Sub1.aByteArrayArrayArray7963[i_2_][Class412.anIntArray4962[i_2_]] = null;
					return is;
				}
			}
		}
		return new byte[i];
	}

	public static byte[][][] method8246(int i, short i_4_) {
		byte[][][] is = new byte[8][4][];
		int i_5_ = i;
		int i_6_ = i;
		byte[] is_7_ = new byte[i_5_ * i_6_];
		int i_8_ = 0;
		for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			for (int i_10_ = 0; i_10_ < i_5_; i_10_++) {
				if (i_10_ <= i_9_) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[0][0] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_11_ = i_6_ - 1; i_11_ >= 0; i_11_--) {
			for (int i_12_ = 0; i_12_ < i_6_; i_12_++) {
				if (i_12_ <= i_11_) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[0][1] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_13_ = 0; i_13_ < i_6_; i_13_++) {
			for (int i_14_ = 0; i_14_ < i_5_; i_14_++) {
				if (i_14_ >= i_13_) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[0][2] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_15_ = i_6_ - 1; i_15_ >= 0; i_15_--) {
			for (int i_16_ = 0; i_16_ < i_5_; i_16_++) {
				if (i_16_ >= i_15_) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[0][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_17_ = i_6_ - 1; i_17_ >= 0; i_17_--) {
			for (int i_18_ = 0; i_18_ < i_5_; i_18_++) {
				if (i_18_ <= i_17_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[1][0] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_19_ = 0; i_19_ < i_6_; i_19_++) {
			for (int i_20_ = 0; i_20_ < i_5_; i_20_++) {
				if (i_8_ < 0 || i_8_ >= is_7_.length) {
					i_8_++;
				} else {
					if (i_20_ >= i_19_ << 1) {
						is_7_[i_8_] = (byte) -1;
					}
					i_8_++;
				}
			}
		}
		is[1][1] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_21_ = 0; i_21_ < i_6_; i_21_++) {
			for (int i_22_ = i_5_ - 1; i_22_ >= 0; i_22_--) {
				if (i_22_ <= i_21_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[1][2] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_23_ = i_6_ - 1; i_23_ >= 0; i_23_--) {
			for (int i_24_ = i_5_ - 1; i_24_ >= 0; i_24_--) {
				if (i_24_ >= i_23_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[1][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_25_ = i_6_ - 1; i_25_ >= 0; i_25_--) {
			for (int i_26_ = i_5_ - 1; i_26_ >= 0; i_26_--) {
				if (i_26_ <= i_25_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[2][0] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_27_ = i_6_ - 1; i_27_ >= 0; i_27_--) {
			for (int i_28_ = 0; i_28_ < i_5_; i_28_++) {
				if (i_28_ >= i_27_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[2][1] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_29_ = 0; i_29_ < i_6_; i_29_++) {
			for (int i_30_ = 0; i_30_ < i_5_; i_30_++) {
				if (i_30_ <= i_29_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[2][2] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_31_ = 0; i_31_ < i_6_; i_31_++) {
			for (int i_32_ = i_5_ - 1; i_32_ >= 0; i_32_--) {
				if (i_32_ >= i_31_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[2][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_33_ = i_6_ - 1; i_33_ >= 0; i_33_--) {
			for (int i_34_ = 0; i_34_ < i_5_; i_34_++) {
				if (i_34_ >= i_33_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[3][0] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_35_ = 0; i_35_ < i_6_; i_35_++) {
			for (int i_36_ = 0; i_36_ < i_5_; i_36_++) {
				if (i_36_ <= i_35_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[3][1] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_37_ = 0; i_37_ < i_6_; i_37_++) {
			for (int i_38_ = i_5_ - 1; i_38_ >= 0; i_38_--) {
				if (i_38_ >= i_37_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[3][2] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_39_ = i_6_ - 1; i_39_ >= 0; i_39_--) {
			for (int i_40_ = i_5_ - 1; i_40_ >= 0; i_40_--) {
				if (i_40_ <= i_39_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[3][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_41_ = i_6_ - 1; i_41_ >= 0; i_41_--) {
			for (int i_42_ = i_5_ - 1; i_42_ >= 0; i_42_--) {
				if (i_42_ >= i_41_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[4][0] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_43_ = i_6_ - 1; i_43_ >= 0; i_43_--) {
			for (int i_44_ = 0; i_44_ < i_5_; i_44_++) {
				if (i_44_ <= i_43_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[4][1] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_45_ = 0; i_45_ < i_6_; i_45_++) {
			for (int i_46_ = 0; i_46_ < i_5_; i_46_++) {
				if (i_46_ >= i_45_ >> 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[4][2] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_47_ = 0; i_47_ < i_6_; i_47_++) {
			for (int i_48_ = i_5_ - 1; i_48_ >= 0; i_48_--) {
				if (i_48_ <= i_47_ << 1) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[4][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_49_ = 0; i_49_ < i_6_; i_49_++) {
			for (int i_50_ = 0; i_50_ < i_5_; i_50_++) {
				if (i_50_ <= i_5_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[5][0] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_51_ = 0; i_51_ < i_6_; i_51_++) {
			for (int i_52_ = 0; i_52_ < i_5_; i_52_++) {
				if (i_51_ <= i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[5][1] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_53_ = 0; i_53_ < i_6_; i_53_++) {
			for (int i_54_ = 0; i_54_ < i_5_; i_54_++) {
				if (i_54_ >= i_5_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[5][2] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_55_ = 0; i_55_ < i_6_; i_55_++) {
			for (int i_56_ = 0; i_56_ < i_5_; i_56_++) {
				if (i_55_ >= i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[5][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_57_ = 0; i_57_ < i_6_; i_57_++) {
			for (int i_58_ = 0; i_58_ < i_5_; i_58_++) {
				if (i_58_ <= i_57_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[6][0] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_59_ = i_6_ - 1; i_59_ >= 0; i_59_--) {
			for (int i_60_ = 0; i_60_ < i_5_; i_60_++) {
				if (i_60_ <= i_59_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[6][1] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_61_ = i_6_ - 1; i_61_ >= 0; i_61_--) {
			for (int i_62_ = i_5_ - 1; i_62_ >= 0; i_62_--) {
				if (i_62_ <= i_61_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[6][2] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_63_ = 0; i_63_ < i_6_; i_63_++) {
			for (int i_64_ = i_5_ - 1; i_64_ >= 0; i_64_--) {
				if (i_64_ <= i_63_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[6][3] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_65_ = 0; i_65_ < i_6_; i_65_++) {
			for (int i_66_ = 0; i_66_ < i_5_; i_66_++) {
				if (i_66_ >= i_65_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[7][0] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_67_ = i_6_ - 1; i_67_ >= 0; i_67_--) {
			for (int i_68_ = 0; i_68_ < i_5_; i_68_++) {
				if (i_68_ >= i_67_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[7][1] = is_7_;
		is_7_ = new byte[i_6_ * i_5_];
		i_8_ = 0;
		for (int i_69_ = i_6_ - 1; i_69_ >= 0; i_69_--) {
			for (int i_70_ = i_5_ - 1; i_70_ >= 0; i_70_--) {
				if (i_70_ >= i_69_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[7][2] = is_7_;
		is_7_ = new byte[i_5_ * i_6_];
		i_8_ = 0;
		for (int i_71_ = 0; i_71_ < i_6_; i_71_++) {
			for (int i_72_ = i_5_ - 1; i_72_ >= 0; i_72_--) {
				if (i_72_ >= i_71_ - i_6_ / 2) {
					is_7_[i_8_] = (byte) -1;
				}
				i_8_++;
			}
		}
		is[7][3] = is_7_;
		return is;
	}
}
