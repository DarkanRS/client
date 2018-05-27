/* Class532_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class532_Sub2 extends Class532 {
	static final int anInt7923 = 12;
	static final int anInt7924 = 4096;
	public static Index aClass317_7925;

	static final void method12848(int i, int i_0_, int i_1_, int i_2_) {
		if (i > i_0_)
			Class232.method3922(anIntArrayArray7072[i_1_], i_0_, i, i_2_, (byte) 53);
		else
			Class232.method3922(anIntArrayArray7072[i_1_], i, i_0_, i_2_, (byte) 15);
	}

	static final void method12849(int i, int i_3_, int i_4_, int i_5_) {
		if (i_3_ > i_4_) {
			for (int i_6_ = i_4_; i_6_ < i_3_; i_6_++)
				anIntArrayArray7072[i_6_][i] = i_5_;
		} else {
			for (int i_7_ = i_3_; i_7_ < i_4_; i_7_++)
				anIntArrayArray7072[i_7_][i] = i_5_;
		}
	}

	Class532_Sub2() throws Throwable {
		throw new Error();
	}

	static final void method12850(int i, int i_8_, int i_9_, int i_10_) {
		if (i >= anInt7071 * -612590951 && i <= anInt7069 * -1345107225) {
			i_8_ = Class275.method4890(i_8_, 324226563 * anInt7070, -348932735 * anInt7068, -38562102);
			i_9_ = Class275.method4890(i_9_, anInt7070 * 324226563, anInt7068 * -348932735, 1490362030);
			Class225_Sub6.method13411(i, i_8_, i_9_, i_10_, (byte) -50);
		}
	}

	static final void method12851(int i, int i_11_, int i_12_, int i_13_) {
		if (i >= anInt7071 * -612590951 && i <= anInt7069 * -1345107225) {
			i_11_ = Class275.method4890(i_11_, 324226563 * anInt7070, -348932735 * anInt7068, -1108654484);
			i_12_ = Class275.method4890(i_12_, anInt7070 * 324226563, anInt7068 * -348932735, -1308266482);
			Class225_Sub6.method13411(i, i_11_, i_12_, i_13_, (byte) -55);
		}
	}

	public static final void method12852(int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		int i_18_ = i_15_ - i;
		int i_19_ = i_16_ - i_14_;
		if (0 == i_18_) {
			if (i_19_ != 0)
				Class468_Sub15.method12746(i, i_14_, i_16_, i_17_, 783440477);
		} else if (i_19_ == 0)
			CS2Executor.method11250(i, i_15_, i_14_, i_17_, -1213677167);
		else {
			int i_20_ = (i_19_ << 12) / i_18_;
			int i_21_ = i_14_ - (i * i_20_ >> 12);
			int i_22_;
			int i_23_;
			if (i < -612590951 * anInt7071) {
				i_22_ = i_21_ + (i_20_ * (anInt7071 * -612590951) >> 12);
				i_23_ = -612590951 * anInt7071;
			} else if (i > anInt7069 * -1345107225) {
				i_22_ = (i_20_ * (-1345107225 * anInt7069) >> 12) + i_21_;
				i_23_ = anInt7069 * -1345107225;
			} else {
				i_22_ = i_14_;
				i_23_ = i;
			}
			int i_24_;
			int i_25_;
			if (i_15_ < -612590951 * anInt7071) {
				i_24_ = (-612590951 * anInt7071 * i_20_ >> 12) + i_21_;
				i_25_ = anInt7071 * -612590951;
			} else if (i_15_ > anInt7069 * -1345107225) {
				i_24_ = i_21_ + (-1345107225 * anInt7069 * i_20_ >> 12);
				i_25_ = -1345107225 * anInt7069;
			} else {
				i_24_ = i_16_;
				i_25_ = i_15_;
			}
			if (i_22_ < 324226563 * anInt7070) {
				i_22_ = 324226563 * anInt7070;
				i_23_ = (anInt7070 * 324226563 - i_21_ << 12) / i_20_;
			} else if (i_22_ > -348932735 * anInt7068) {
				i_22_ = anInt7068 * -348932735;
				i_23_ = (-348932735 * anInt7068 - i_21_ << 12) / i_20_;
			}
			if (i_24_ < 324226563 * anInt7070) {
				i_24_ = anInt7070 * 324226563;
				i_25_ = (324226563 * anInt7070 - i_21_ << 12) / i_20_;
			} else if (i_24_ > -348932735 * anInt7068) {
				i_24_ = -348932735 * anInt7068;
				i_25_ = (anInt7068 * -348932735 - i_21_ << 12) / i_20_;
			}
			Class523.method11220(i_23_, i_22_, i_25_, i_24_, i_17_, (byte) 86);
		}
	}

	static final void method12853(int i, int i_26_, int i_27_, int i_28_) {
		if (i_27_ >= 324226563 * anInt7070 && i_27_ <= anInt7068 * -348932735) {
			i = Class275.method4890(i, -612590951 * anInt7071, anInt7069 * -1345107225, 1735656468);
			i_26_ = Class275.method4890(i_26_, -612590951 * anInt7071, -1345107225 * anInt7069, -2078173539);
			Class16.method568(i, i_26_, i_27_, i_28_, (short) 128);
		}
	}

	static final void method12854(int i, int i_29_, int i_30_, int i_31_) {
		if (i > i_29_)
			Class232.method3922(anIntArrayArray7072[i_30_], i_29_, i, i_31_, (byte) 12);
		else
			Class232.method3922(anIntArrayArray7072[i_30_], i, i_29_, i_31_, (byte) 50);
	}

	public static final void method12855(int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		int i_36_ = i_33_ - i;
		int i_37_ = i_34_ - i_32_;
		if (0 == i_36_) {
			if (i_37_ != 0)
				Class468_Sub15.method12746(i, i_32_, i_34_, i_35_, 105122965);
		} else if (i_37_ == 0)
			CS2Executor.method11250(i, i_33_, i_32_, i_35_, -17096497);
		else {
			int i_38_ = (i_37_ << 12) / i_36_;
			int i_39_ = i_32_ - (i * i_38_ >> 12);
			int i_40_;
			int i_41_;
			if (i < -612590951 * anInt7071) {
				i_40_ = i_39_ + (i_38_ * (anInt7071 * -612590951) >> 12);
				i_41_ = -612590951 * anInt7071;
			} else if (i > anInt7069 * -1345107225) {
				i_40_ = (i_38_ * (-1345107225 * anInt7069) >> 12) + i_39_;
				i_41_ = anInt7069 * -1345107225;
			} else {
				i_40_ = i_32_;
				i_41_ = i;
			}
			int i_42_;
			int i_43_;
			if (i_33_ < -612590951 * anInt7071) {
				i_42_ = (-612590951 * anInt7071 * i_38_ >> 12) + i_39_;
				i_43_ = anInt7071 * -612590951;
			} else if (i_33_ > anInt7069 * -1345107225) {
				i_42_ = i_39_ + (-1345107225 * anInt7069 * i_38_ >> 12);
				i_43_ = -1345107225 * anInt7069;
			} else {
				i_42_ = i_34_;
				i_43_ = i_33_;
			}
			if (i_40_ < 324226563 * anInt7070) {
				i_40_ = 324226563 * anInt7070;
				i_41_ = (anInt7070 * 324226563 - i_39_ << 12) / i_38_;
			} else if (i_40_ > -348932735 * anInt7068) {
				i_40_ = anInt7068 * -348932735;
				i_41_ = (-348932735 * anInt7068 - i_39_ << 12) / i_38_;
			}
			if (i_42_ < 324226563 * anInt7070) {
				i_42_ = anInt7070 * 324226563;
				i_43_ = (324226563 * anInt7070 - i_39_ << 12) / i_38_;
			} else if (i_42_ > -348932735 * anInt7068) {
				i_42_ = -348932735 * anInt7068;
				i_43_ = (anInt7068 * -348932735 - i_39_ << 12) / i_38_;
			}
			Class523.method11220(i_41_, i_40_, i_43_, i_42_, i_35_, (byte) 127);
		}
	}

	static final void method12856(int i, int i_44_, int i_45_, int i_46_) {
		if (i > i_44_)
			Class232.method3922(anIntArrayArray7072[i_45_], i_44_, i, i_46_, (byte) -42);
		else
			Class232.method3922(anIntArrayArray7072[i_45_], i, i_44_, i_46_, (byte) -22);
	}

	static final void method12857(int i, int i_47_, int i_48_, int i_49_) {
		if (i > i_47_)
			Class232.method3922(anIntArrayArray7072[i_48_], i_47_, i, i_49_, (byte) 21);
		else
			Class232.method3922(anIntArrayArray7072[i_48_], i, i_47_, i_49_, (byte) -35);
	}

	static final void method12858(int i, int i_50_, int i_51_, int i_52_, int i_53_) {
		int i_54_ = i_52_ - i_50_;
		int i_55_ = i_51_ - i;
		if (i_55_ == 0) {
			if (i_54_ != 0)
				Class225_Sub6.method13411(i, i_50_, i_52_, i_53_, (byte) -120);
		} else if (i_54_ == 0)
			Class16.method568(i, i_51_, i_50_, i_53_, (short) 128);
		else {
			if (i_54_ < 0)
				i_54_ = -i_54_;
			if (i_55_ < 0)
				i_55_ = -i_55_;
			boolean bool = i_54_ > i_55_;
			if (bool) {
				int i_56_ = i;
				int i_57_ = i_51_;
				i = i_50_;
				i_50_ = i_56_;
				i_51_ = i_52_;
				i_52_ = i_57_;
			}
			if (i > i_51_) {
				int i_58_ = i;
				int i_59_ = i_50_;
				i = i_51_;
				i_51_ = i_58_;
				i_50_ = i_52_;
				i_52_ = i_59_;
			}
			int i_60_ = i_50_;
			int i_61_ = i_51_ - i;
			int i_62_ = i_52_ - i_50_;
			int i_63_ = -(i_61_ >> 1);
			int i_64_ = i_50_ < i_52_ ? 1 : -1;
			if (i_62_ < 0)
				i_62_ = -i_62_;
			if (bool) {
				for (int i_65_ = i; i_65_ <= i_51_; i_65_++) {
					anIntArrayArray7072[i_65_][i_60_] = i_53_;
					i_63_ += i_62_;
					if (i_63_ > 0) {
						i_60_ += i_64_;
						i_63_ -= i_61_;
					}
				}
			} else {
				for (int i_66_ = i; i_66_ <= i_51_; i_66_++) {
					anIntArrayArray7072[i_60_][i_66_] = i_53_;
					i_63_ += i_62_;
					if (i_63_ > 0) {
						i_60_ += i_64_;
						i_63_ -= i_61_;
					}
				}
			}
		}
	}

	static final void method12859(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 412083381 * Class468_Sub28.anInt7961;
	}
}
