/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117 {
	int[] anIntArray1260;
	byte[] aByteArray1261;
	int[] anIntArray1262;

	int method1970(byte[] is, int i, int i_0_, byte[] is_1_, int i_2_) {
		int i_3_ = 0;
		int i_4_ = i_2_ << 3;
		for (i_0_ += i; i < i_0_; i++) {
			int i_5_ = is[i] & 0xff;
			int i_6_ = this.anIntArray1260[i_5_];
			int i_7_ = this.aByteArray1261[i_5_];
			if (0 == i_7_) {
				throw new RuntimeException(new StringBuilder().append("").append(i_5_).toString());
			}
			int i_8_ = i_4_ >> 3;
			int i_9_ = i_4_ & 0x7;
			i_3_ &= -i_9_ >> 31;
			int i_10_ = (i_9_ + i_7_ - 1 >> 3) + i_8_;
			i_9_ += 24;
			is_1_[i_8_] = (byte) (i_3_ |= i_6_ >>> i_9_);
			if (i_8_ < i_10_) {
				i_8_++;
				i_9_ -= 8;
				is_1_[i_8_] = (byte) (i_3_ = i_6_ >>> i_9_);
				if (i_8_ < i_10_) {
					i_8_++;
					i_9_ -= 8;
					is_1_[i_8_] = (byte) (i_3_ = i_6_ >>> i_9_);
					if (i_8_ < i_10_) {
						i_8_++;
						i_9_ -= 8;
						is_1_[i_8_] = (byte) (i_3_ = i_6_ >>> i_9_);
						if (i_8_ < i_10_) {
							i_8_++;
							i_9_ -= 8;
							is_1_[i_8_] = (byte) (i_3_ = i_6_ << -i_9_);
						}
					}
				}
			}
			i_4_ += i_7_;
		}
		return (7 + i_4_ >> 3) - i_2_;
	}

	int method1971(byte[] is, int i, int i_11_, byte[] is_12_, int i_13_, int i_14_) {
		int i_15_ = 0;
		int i_16_ = i_13_ << 3;
		for (i_11_ += i; i < i_11_; i++) {
			int i_17_ = is[i] & 0xff;
			int i_18_ = this.anIntArray1260[i_17_];
			int i_19_ = this.aByteArray1261[i_17_];
			if (0 == i_19_) {
				throw new RuntimeException(new StringBuilder().append("").append(i_17_).toString());
			}
			int i_20_ = i_16_ >> 3;
			int i_21_ = i_16_ & 0x7;
			i_15_ &= -i_21_ >> 31;
			int i_22_ = (i_21_ + i_19_ - 1 >> 3) + i_20_;
			i_21_ += 24;
			is_12_[i_20_] = (byte) (i_15_ |= i_18_ >>> i_21_);
			if (i_20_ < i_22_) {
				i_20_++;
				i_21_ -= 8;
				is_12_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
				if (i_20_ < i_22_) {
					i_20_++;
					i_21_ -= 8;
					is_12_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
					if (i_20_ < i_22_) {
						i_20_++;
						i_21_ -= 8;
						is_12_[i_20_] = (byte) (i_15_ = i_18_ >>> i_21_);
						if (i_20_ < i_22_) {
							i_20_++;
							i_21_ -= 8;
							is_12_[i_20_] = (byte) (i_15_ = i_18_ << -i_21_);
						}
					}
				}
			}
			i_16_ += i_19_;
		}
		return (7 + i_16_ >> 3) - i_13_;
	}

	int method1972(byte[] is, int i, int i_23_, byte[] is_24_, int i_25_) {
		int i_26_ = 0;
		int i_27_ = i_25_ << 3;
		for (i_23_ += i; i < i_23_; i++) {
			int i_28_ = is[i] & 0xff;
			int i_29_ = this.anIntArray1260[i_28_];
			int i_30_ = this.aByteArray1261[i_28_];
			if (0 == i_30_) {
				throw new RuntimeException(new StringBuilder().append("").append(i_28_).toString());
			}
			int i_31_ = i_27_ >> 3;
			int i_32_ = i_27_ & 0x7;
			i_26_ &= -i_32_ >> 31;
			int i_33_ = (i_32_ + i_30_ - 1 >> 3) + i_31_;
			i_32_ += 24;
			is_24_[i_31_] = (byte) (i_26_ |= i_29_ >>> i_32_);
			if (i_31_ < i_33_) {
				i_31_++;
				i_32_ -= 8;
				is_24_[i_31_] = (byte) (i_26_ = i_29_ >>> i_32_);
				if (i_31_ < i_33_) {
					i_31_++;
					i_32_ -= 8;
					is_24_[i_31_] = (byte) (i_26_ = i_29_ >>> i_32_);
					if (i_31_ < i_33_) {
						i_31_++;
						i_32_ -= 8;
						is_24_[i_31_] = (byte) (i_26_ = i_29_ >>> i_32_);
						if (i_31_ < i_33_) {
							i_31_++;
							i_32_ -= 8;
							is_24_[i_31_] = (byte) (i_26_ = i_29_ << -i_32_);
						}
					}
				}
			}
			i_27_ += i_30_;
		}
		return (7 + i_27_ >> 3) - i_25_;
	}

	int method1973(byte[] is, int i, byte[] is_34_, int i_35_, int i_36_, byte i_37_) {
		if (0 == i_36_) {
			return 0;
		}
		int i_38_ = 0;
		i_36_ += i_35_;
		int i_39_ = i;
		for (;;) {
			byte i_40_ = is[i_39_];
			if (i_40_ < 0) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			int i_41_;
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if (0 != (i_40_ & 0x40)) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if (0 != (i_40_ & 0x20)) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if ((i_40_ & 0x10) != 0) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if ((i_40_ & 0x8) != 0) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if (0 != (i_40_ & 0x4)) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if ((i_40_ & 0x2) != 0) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			if (0 != (i_40_ & 0x1)) {
				i_38_ = this.anIntArray1262[i_38_];
			} else {
				i_38_++;
			}
			if ((i_41_ = this.anIntArray1262[i_38_]) < 0) {
				is_34_[i_35_++] = (byte) (i_41_ ^ 0xffffffff);
				if (i_35_ >= i_36_) {
					break;
				}
				i_38_ = 0;
			}
			i_39_++;
		}
		return 1 + i_39_ - i;
	}

	int method1974(byte[] is, int i, int i_42_, byte[] is_43_, int i_44_) {
		int i_45_ = 0;
		int i_46_ = i_44_ << 3;
		for (i_42_ += i; i < i_42_; i++) {
			int i_47_ = is[i] & 0xff;
			int i_48_ = this.anIntArray1260[i_47_];
			int i_49_ = this.aByteArray1261[i_47_];
			if (0 == i_49_) {
				throw new RuntimeException(new StringBuilder().append("").append(i_47_).toString());
			}
			int i_50_ = i_46_ >> 3;
			int i_51_ = i_46_ & 0x7;
			i_45_ &= -i_51_ >> 31;
			int i_52_ = (i_51_ + i_49_ - 1 >> 3) + i_50_;
			i_51_ += 24;
			is_43_[i_50_] = (byte) (i_45_ |= i_48_ >>> i_51_);
			if (i_50_ < i_52_) {
				i_50_++;
				i_51_ -= 8;
				is_43_[i_50_] = (byte) (i_45_ = i_48_ >>> i_51_);
				if (i_50_ < i_52_) {
					i_50_++;
					i_51_ -= 8;
					is_43_[i_50_] = (byte) (i_45_ = i_48_ >>> i_51_);
					if (i_50_ < i_52_) {
						i_50_++;
						i_51_ -= 8;
						is_43_[i_50_] = (byte) (i_45_ = i_48_ >>> i_51_);
						if (i_50_ < i_52_) {
							i_50_++;
							i_51_ -= 8;
							is_43_[i_50_] = (byte) (i_45_ = i_48_ << -i_51_);
						}
					}
				}
			}
			i_46_ += i_49_;
		}
		return (7 + i_46_ >> 3) - i_44_;
	}

	public Class117(byte[] is) {
		int i = is.length;
		this.anIntArray1260 = new int[i];
		this.aByteArray1261 = is;
		int[] is_53_ = new int[33];
		this.anIntArray1262 = new int[8];
		int i_54_ = 0;
		for (int i_55_ = 0; i_55_ < i; i_55_++) {
			int i_56_ = is[i_55_];
			if (0 != i_56_) {
				int i_57_ = 1 << 32 - i_56_;
				int i_58_ = is_53_[i_56_];
				this.anIntArray1260[i_55_] = i_58_;
				int i_59_;
				if (0 != (i_58_ & i_57_)) {
					i_59_ = is_53_[i_56_ - 1];
				} else {
					i_59_ = i_58_ | i_57_;
					for (int i_60_ = i_56_ - 1; i_60_ >= 1; i_60_--) {
						int i_61_ = is_53_[i_60_];
						if (i_61_ != i_58_) {
							break;
						}
						int i_62_ = 1 << 32 - i_60_;
						if (0 != (i_61_ & i_62_)) {
							is_53_[i_60_] = is_53_[i_60_ - 1];
							break;
						}
						is_53_[i_60_] = i_61_ | i_62_;
					}
				}
				is_53_[i_56_] = i_59_;
				for (int i_63_ = i_56_ + 1; i_63_ <= 32; i_63_++) {
					if (i_58_ == is_53_[i_63_]) {
						is_53_[i_63_] = i_59_;
					}
				}
				int i_64_ = 0;
				for (int i_65_ = 0; i_65_ < i_56_; i_65_++) {
					int i_66_ = -2147483648 >>> i_65_;
					if (0 != (i_58_ & i_66_)) {
						if (0 == this.anIntArray1262[i_64_]) {
							this.anIntArray1262[i_64_] = i_54_;
						}
						i_64_ = this.anIntArray1262[i_64_];
					} else {
						i_64_++;
					}
					if (i_64_ >= this.anIntArray1262.length) {
						int[] is_67_ = (new int[this.anIntArray1262.length * 2]);
						for (int i_68_ = 0; i_68_ < this.anIntArray1262.length; i_68_++) {
							is_67_[i_68_] = this.anIntArray1262[i_68_];
						}
						this.anIntArray1262 = is_67_;
					}
					i_66_ >>>= 1;
				}
				this.anIntArray1262[i_64_] = i_55_ ^ 0xffffffff;
				if (i_64_ >= i_54_) {
					i_54_ = i_64_ + 1;
				}
			}
		}
	}

	int method1975(byte[] is, int i, int i_69_, byte[] is_70_, int i_71_) {
		int i_72_ = 0;
		int i_73_ = i_71_ << 3;
		for (i_69_ += i; i < i_69_; i++) {
			int i_74_ = is[i] & 0xff;
			int i_75_ = this.anIntArray1260[i_74_];
			int i_76_ = this.aByteArray1261[i_74_];
			if (0 == i_76_) {
				throw new RuntimeException(new StringBuilder().append("").append(i_74_).toString());
			}
			int i_77_ = i_73_ >> 3;
			int i_78_ = i_73_ & 0x7;
			i_72_ &= -i_78_ >> 31;
			int i_79_ = (i_78_ + i_76_ - 1 >> 3) + i_77_;
			i_78_ += 24;
			is_70_[i_77_] = (byte) (i_72_ |= i_75_ >>> i_78_);
			if (i_77_ < i_79_) {
				i_77_++;
				i_78_ -= 8;
				is_70_[i_77_] = (byte) (i_72_ = i_75_ >>> i_78_);
				if (i_77_ < i_79_) {
					i_77_++;
					i_78_ -= 8;
					is_70_[i_77_] = (byte) (i_72_ = i_75_ >>> i_78_);
					if (i_77_ < i_79_) {
						i_77_++;
						i_78_ -= 8;
						is_70_[i_77_] = (byte) (i_72_ = i_75_ >>> i_78_);
						if (i_77_ < i_79_) {
							i_77_++;
							i_78_ -= 8;
							is_70_[i_77_] = (byte) (i_72_ = i_75_ << -i_78_);
						}
					}
				}
			}
			i_73_ += i_76_;
		}
		return (7 + i_73_ >> 3) - i_71_;
	}

	int method1976(byte[] is, int i, byte[] is_80_, int i_81_, int i_82_) {
		if (0 == i_82_) {
			return 0;
		}
		int i_83_ = 0;
		i_82_ += i_81_;
		int i_84_ = i;
		for (;;) {
			byte i_85_ = is[i_84_];
			if (i_85_ < 0) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			int i_86_;
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if (0 != (i_85_ & 0x40)) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if (0 != (i_85_ & 0x20)) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if ((i_85_ & 0x10) != 0) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if ((i_85_ & 0x8) != 0) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if (0 != (i_85_ & 0x4)) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if ((i_85_ & 0x2) != 0) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			if (0 != (i_85_ & 0x1)) {
				i_83_ = this.anIntArray1262[i_83_];
			} else {
				i_83_++;
			}
			if ((i_86_ = this.anIntArray1262[i_83_]) < 0) {
				is_80_[i_81_++] = (byte) (i_86_ ^ 0xffffffff);
				if (i_81_ >= i_82_) {
					break;
				}
				i_83_ = 0;
			}
			i_84_++;
		}
		return 1 + i_84_ - i;
	}

	int method1977(byte[] is, int i, byte[] is_87_, int i_88_, int i_89_) {
		if (0 == i_89_) {
			return 0;
		}
		int i_90_ = 0;
		i_89_ += i_88_;
		int i_91_ = i;
		for (;;) {
			byte i_92_ = is[i_91_];
			if (i_92_ < 0) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			int i_93_;
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x40)) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x20)) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if ((i_92_ & 0x10) != 0) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if ((i_92_ & 0x8) != 0) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x4)) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if ((i_92_ & 0x2) != 0) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			if (0 != (i_92_ & 0x1)) {
				i_90_ = this.anIntArray1262[i_90_];
			} else {
				i_90_++;
			}
			if ((i_93_ = this.anIntArray1262[i_90_]) < 0) {
				is_87_[i_88_++] = (byte) (i_93_ ^ 0xffffffff);
				if (i_88_ >= i_89_) {
					break;
				}
				i_90_ = 0;
			}
			i_91_++;
		}
		return 1 + i_91_ - i;
	}

	public static void method1978(int i, int i_94_, int i_95_, byte i_96_) {
		i_95_ = i_95_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-964271083) >> 8;
		if (0 != i_95_ && i != -1) {
			if (!Class260.aBool3220 && -1 != 1293234709 * Class260.anInt3223 && Class116.method1966(1048199259) && !Class345.method6140(644777212)) {
				Class260.aClass282_Sub15_Sub2_3231 = Message.method7272((byte) 9);
				Class230.method3912((byte) 3);
				Class282_Sub15_Sub2 class282_sub15_sub2 = (Class282_Sub20_Sub10.method15262(Class260.aClass282_Sub15_Sub2_3231, 1475290596));
				Class42_Sub1.method14563(true, class282_sub15_sub2, (short) 569);
			}
			Class282_Sub43.method13400(Class525.aClass317_6984, i, 0, i_95_, false, (byte) -50);
			Class150.method2580(-1, 255, (byte) -39);
			Class260.aBool3220 = true;
		}
	}

	static final void method1979(CS2Executor class527, int i) {
		int i_97_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = (class527.aClass282_Sub4_7011.aClass57Array7499[i_97_].aString524);
	}

	public static int method1980(int i, int i_98_, boolean bool, int i_99_) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -2136766081);
		if (class282_sub30 == null) {
			return 0;
		}
		if (-1 == i_98_) {
			return 0;
		}
		int i_100_ = 0;
		for (int i_101_ = 0; i_101_ < class282_sub30.anIntArray7709.length; i_101_++) {
			if (class282_sub30.anIntArray7710[i_101_] == i_98_) {
				i_100_ += (class282_sub30.anIntArray7709[i_101_]);
			}
		}
		return i_100_;
	}

	public static Class118 method1981(int i, byte i_102_) {
		int i_103_ = i >> 16;
		if (null == Class468_Sub8.aClass98Array7889[i_103_] || (Class468_Sub8.aClass98Array7889[i_103_].method1618(i, (byte) 12) == null)) {
			boolean bool = Class456_Sub3.method12682(i_103_, null, -1161112150);
			if (!bool) {
				return null;
			}
		}
		return Class468_Sub8.aClass98Array7889[i_103_].method1618(i, (byte) 12);
	}

	static void method1982(int i, int i_104_) {
		Class13.anInt128 = 1984685679 * i;
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3859(1707843883);
		}
	}
}
