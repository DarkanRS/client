/* Class282_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub19 extends Class282 {
	Interface15 anInterface15_7639;
	int anInt7640;
	Class282_Sub24 aClass282_Sub24_7641;
	int anInt7642;
	Class143 aClass143_7643;
	int anInt7644;
	float[][] aFloatArrayArray7645;
	int anInt7646;
	Class143 aClass143_7647;
	float[][] aFloatArrayArray7648;
	Interface14 anInterface14_7649;
	Class505_Sub1 aClass505_Sub1_7650;
	Class282_Sub35_Sub1 aClass282_Sub35_Sub1_7651;
	float[][] aFloatArrayArray7652;
	int anInt7653;
	Class390_Sub2 aClass390_Sub2_7654;
	RsByteBuffer aClass282_Sub35_7655;
	int anInt7656;
	Class453 aClass453_7657;

	void method12304(short i) {
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467)
			((Class282_Sub19) this).aClass282_Sub35_7655.writeShort(i, 1417031095);
		else
			((Class282_Sub19) this).aClass282_Sub35_7655.writeLEShort(i, (byte) -73);
	}

	void method12305(short i) {
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467)
			((Class282_Sub19) this).aClass282_Sub35_7655.writeShort(i, 1417031095);
		else
			((Class282_Sub19) this).aClass282_Sub35_7655.writeLEShort(i, (byte) -40);
	}

	void method12306(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4775) * 1856651955);
		int i_6_ = i_4_ + (i_2_ << (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4775) * 1856651955);
		int i_7_ = ((Class282_Sub19) this).aClass390_Sub2_7654.method6709(i_5_, i_6_, 1957271969);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_6_ & 0xffffL) << 16 | (long) i_5_ & 0xffffL;
			Class282 class282 = ((Class282_Sub19) this).aClass453_7657.method7530(l);
			if (class282 != null) {
				method12305(((Class282_Sub46) class282).aShort8067);
				return;
			}
		}
		short i_8_ = (short) ((Class282_Sub19) this).anInt7646++;
		if (l != -1L)
			((Class282_Sub19) this).aClass453_7657.method7534(new Class282_Sub46(i_8_), l);
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_0_];
			f_9_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_0_];
			f_10_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_0_];
		} else if (i_3_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439 && i_4_ == 0) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_0_];
			f_9_ = ((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_0_];
			f_10_ = ((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_0_];
		} else if (i_3_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439 && i_4_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_0_ + 1];
			f_9_ = (((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_0_ + 1]);
			f_10_ = (((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_0_ + 1]);
		} else if (i_3_ == 0 && i_4_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_0_ + 1];
			f_9_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_0_ + 1];
			f_10_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_0_ + 1];
		} else {
			float f_11_ = (float) i_3_ / (float) ((((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439);
			float f_12_ = (float) i_4_ / (float) ((((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439);
			float f_13_ = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_0_];
			float f_14_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_0_];
			float f_15_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_0_];
			float f_16_ = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_0_];
			float f_17_ = ((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_0_];
			float f_18_ = ((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_0_];
			f_13_ += (((Class282_Sub19) this).aFloatArrayArray7652[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (((Class282_Sub19) this).aFloatArrayArray7648[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (((Class282_Sub19) this).aFloatArrayArray7645[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += ((((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_0_ + 1]) - f_16_) * f_11_;
			f_17_ += ((((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_0_ + 1]) - f_17_) * f_11_;
			f_18_ += ((((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_0_ + 1]) - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12368((byte) 74) - i_5_);
		float f_20_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12369(1534020223) - i_7_);
		float f_21_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12394(2101145954) - i_6_);
		float f_22_ = (float) Math.sqrt((double) (f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_));
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / (float) ((Class282_Sub19) this).aClass282_Sub24_7641.method12370(-789603523);
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F)
			f_25_ = 0.0F;
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F)
			f_27_ = 1.0F;
		int i_28_ = ((Class282_Sub19) this).aClass282_Sub24_7641.method12371(-2137671408);
		int i_29_ = (int) (f_27_ * (float) (i_28_ >> 16 & 0xff));
		if (i_29_ > 255)
			i_29_ = 255;
		int i_30_ = (int) (f_27_ * (float) (i_28_ >> 8 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_27_ * (float) (i_28_ & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467) {
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_5_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_7_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_6_);
		} else {
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_5_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_7_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_6_);
		}
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_29_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_30_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_31_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(255);
		method12305(i_8_);
	}

	Class282_Sub19(Class505_Sub1 class505_sub1, Class390_Sub2 class390_sub2, Class282_Sub24 class282_sub24, int[] is) {
		((Class282_Sub19) this).aClass505_Sub1_7650 = class505_sub1;
		((Class282_Sub19) this).aClass282_Sub24_7641 = class282_sub24;
		((Class282_Sub19) this).aClass390_Sub2_7654 = class390_sub2;
		int i = (((Class282_Sub19) this).aClass282_Sub24_7641.method12370(-789603523) - (class390_sub2.anInt4774 * 750971439 >> 1));
		((Class282_Sub19) this).anInt7642 = (((Class282_Sub19) this).aClass282_Sub24_7641.method12368((byte) -10) - i >> class390_sub2.anInt4775 * 1856651955);
		((Class282_Sub19) this).anInt7653 = (((Class282_Sub19) this).aClass282_Sub24_7641.method12368((byte) -55) + i >> class390_sub2.anInt4775 * 1856651955);
		((Class282_Sub19) this).anInt7644 = (((Class282_Sub19) this).aClass282_Sub24_7641.method12394(1027318121) - i >> class390_sub2.anInt4775 * 1856651955);
		((Class282_Sub19) this).anInt7656 = (((Class282_Sub19) this).aClass282_Sub24_7641.method12394(1972195362) + i >> class390_sub2.anInt4775 * 1856651955);
		int i_32_ = (((Class282_Sub19) this).anInt7653 - ((Class282_Sub19) this).anInt7642 + 1);
		int i_33_ = (((Class282_Sub19) this).anInt7656 - ((Class282_Sub19) this).anInt7644 + 1);
		((Class282_Sub19) this).aFloatArrayArray7652 = new float[i_32_ + 1][i_33_ + 1];
		((Class282_Sub19) this).aFloatArrayArray7648 = new float[i_32_ + 1][i_33_ + 1];
		((Class282_Sub19) this).aFloatArrayArray7645 = new float[i_32_ + 1][i_33_ + 1];
		for (int i_34_ = 0; i_34_ <= i_33_; i_34_++) {
			int i_35_ = i_34_ + ((Class282_Sub19) this).anInt7644;
			if (i_35_ > 0 && i_35_ < (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4773) * 1826078169 - 1) {
				for (int i_36_ = 0; i_36_ <= i_32_; i_36_++) {
					int i_37_ = i_36_ + ((Class282_Sub19) this).anInt7642;
					if (i_37_ > 0 && i_37_ < (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4776) * -1843860823 - 1) {
						int i_38_ = (class390_sub2.method6722(i_37_ + 1, i_35_, 65280) - class390_sub2.method6722(i_37_ - 1, i_35_, 65280));
						int i_39_ = (class390_sub2.method6722(i_37_, i_35_ + 1, 65280) - class390_sub2.method6722(i_37_, i_35_ - 1, 65280));
						float f = (float) (1.0 / Math.sqrt((double) (i_38_ * i_38_ + 65536 + (i_39_ * i_39_))));
						((Class282_Sub19) this).aFloatArrayArray7652[i_36_][i_34_] = (float) i_38_ * f;
						((Class282_Sub19) this).aFloatArrayArray7648[i_36_][i_34_] = -256.0F * f;
						((Class282_Sub19) this).aFloatArrayArray7645[i_36_][i_34_] = (float) i_39_ * f;
					}
				}
			}
		}
		int i_40_ = 0;
		for (int i_41_ = ((Class282_Sub19) this).anInt7644; i_41_ <= ((Class282_Sub19) this).anInt7656; i_41_++) {
			if (i_41_ >= 0 && i_41_ < class390_sub2.anInt4773 * 1826078169) {
				for (int i_42_ = ((Class282_Sub19) this).anInt7642; i_42_ <= ((Class282_Sub19) this).anInt7653; i_42_++) {
					if (i_42_ >= 0 && i_42_ < class390_sub2.anInt4776 * -1843860823) {
						int i_43_ = is[i_40_];
						int[] is_44_ = (((Class390_Sub2) class390_sub2).anIntArrayArrayArray8647[i_42_][i_41_]);
						if (is_44_ != null && i_43_ != 0) {
							if (i_43_ == 1) {
								int i_45_ = 0;
								while (i_45_ < is_44_.length) {
									if (is_44_[i_45_++] != -1 && is_44_[i_45_++] != -1 && is_44_[i_45_++] != -1)
										((Class282_Sub19) this).anInt7640 += 3;
								}
							} else
								((Class282_Sub19) this).anInt7640 += 3;
						}
					}
					i_40_++;
				}
			} else
				i_40_ += (((Class282_Sub19) this).anInt7653 - ((Class282_Sub19) this).anInt7642);
		}
		if (((Class282_Sub19) this).anInt7640 > 0) {
			((Class282_Sub19) this).aClass282_Sub35_7655 = new RsByteBuffer(((Class282_Sub19) this).anInt7640 * 2);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651 = new Class282_Sub35_Sub1(((Class282_Sub19) this).anInt7640 * 16);
			((Class282_Sub19) this).aClass453_7657 = new Class453(Class323.nextPowerOfTwo((((Class282_Sub19) this).anInt7640), 1055590190));
			int i_46_ = 0;
			i_40_ = 0;
			for (int i_47_ = ((Class282_Sub19) this).anInt7644; i_47_ <= ((Class282_Sub19) this).anInt7656; i_47_++) {
				if (i_47_ >= 0 && i_47_ < class390_sub2.anInt4773 * 1826078169) {
					int i_48_ = 0;
					for (int i_49_ = ((Class282_Sub19) this).anInt7642; i_49_ <= ((Class282_Sub19) this).anInt7653; i_49_++) {
						if (i_49_ >= 0 && i_49_ < class390_sub2.anInt4776 * -1843860823) {
							int i_50_ = is[i_40_];
							int[] is_51_ = (((Class390_Sub2) class390_sub2).anIntArrayArrayArray8647[i_49_][i_47_]);
							if (is_51_ != null && i_50_ != 0) {
								if (i_50_ == 1) {
									int[] is_52_ = (((Class390_Sub2) class390_sub2).anIntArrayArrayArray8661[i_49_][i_47_]);
									int[] is_53_ = (((Class390_Sub2) class390_sub2).anIntArrayArrayArray8660[i_49_][i_47_]);
									int i_54_ = 0;
									while (i_54_ < is_51_.length) {
										if (is_51_[i_54_] != -1 && is_51_[i_54_ + 1] != -1 && is_51_[i_54_ + 2] != -1) {
											method12306(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
											method12306(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
											method12306(i_48_, i_46_, i_49_, i_47_, is_52_[i_54_], is_53_[i_54_]);
											i_54_++;
										} else
											i_54_ += 3;
									}
								} else if (i_50_ == 3) {
									method12306(i_48_, i_46_, i_49_, i_47_, 0, 0);
									method12306(i_48_, i_46_, i_49_, i_47_, (class390_sub2.anInt4774 * 750971439), 0);
									method12306(i_48_, i_46_, i_49_, i_47_, 0, (class390_sub2.anInt4774 * 750971439));
								} else if (i_50_ == 2) {
									method12306(i_48_, i_46_, i_49_, i_47_, (class390_sub2.anInt4774 * 750971439), 0);
									method12306(i_48_, i_46_, i_49_, i_47_, (class390_sub2.anInt4774 * 750971439), (class390_sub2.anInt4774 * 750971439));
									method12306(i_48_, i_46_, i_49_, i_47_, 0, 0);
								} else if (i_50_ == 5) {
									method12306(i_48_, i_46_, i_49_, i_47_, (class390_sub2.anInt4774 * 750971439), (class390_sub2.anInt4774 * 750971439));
									method12306(i_48_, i_46_, i_49_, i_47_, 0, (class390_sub2.anInt4774 * 750971439));
									method12306(i_48_, i_46_, i_49_, i_47_, (class390_sub2.anInt4774 * 750971439), 0);
								} else if (i_50_ == 4) {
									method12306(i_48_, i_46_, i_49_, i_47_, 0, (class390_sub2.anInt4774 * 750971439));
									method12306(i_48_, i_46_, i_49_, i_47_, 0, 0);
									method12306(i_48_, i_46_, i_49_, i_47_, (class390_sub2.anInt4774 * 750971439), (class390_sub2.anInt4774 * 750971439));
								}
							}
						}
						i_40_++;
						i_48_++;
					}
				} else
					i_40_ += (((Class282_Sub19) this).anInt7653 - ((Class282_Sub19) this).anInt7642);
				i_46_++;
			}
			((Class282_Sub19) this).anInterface15_7639 = (((Class282_Sub19) this).aClass505_Sub1_7650.method13598(5123, (((Class282_Sub19) this).aClass282_Sub35_7655.buffer), (((Class282_Sub19) this).aClass282_Sub35_7655.index * -1990677291), false));
			((Class282_Sub19) this).anInterface14_7649 = (((Class282_Sub19) this).aClass505_Sub1_7650.method13599(16, (((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.buffer), (((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.index) * -1990677291, false));
			((Class282_Sub19) this).aClass143_7647 = new Class143(((Class282_Sub19) this).anInterface14_7649, 5126, 3, 0);
			((Class282_Sub19) this).aClass143_7643 = new Class143(((Class282_Sub19) this).anInterface14_7649, 5121, 4, 12);
		} else {
			((Class282_Sub19) this).anInterface15_7639 = null;
			((Class282_Sub19) this).anInterface14_7649 = null;
			((Class282_Sub19) this).aClass143_7647 = null;
			((Class282_Sub19) this).aClass143_7643 = null;
		}
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651 = null;
		((Class282_Sub19) this).aClass282_Sub35_7655 = null;
		((Class282_Sub19) this).aClass453_7657 = null;
		((Class282_Sub19) this).aFloatArrayArray7645 = null;
		((Class282_Sub19) this).aFloatArrayArray7648 = null;
		((Class282_Sub19) this).aFloatArrayArray7652 = null;
	}

	void method12307(short i) {
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467)
			((Class282_Sub19) this).aClass282_Sub35_7655.writeShort(i, 1417031095);
		else
			((Class282_Sub19) this).aClass282_Sub35_7655.writeLEShort(i, (byte) -18);
	}

	void method12308(short i) {
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467)
			((Class282_Sub19) this).aClass282_Sub35_7655.writeShort(i, 1417031095);
		else
			((Class282_Sub19) this).aClass282_Sub35_7655.writeLEShort(i, (byte) -46);
	}

	void method12309(int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		long l = -1L;
		int i_60_ = i_58_ + (i_56_ << (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4775) * 1856651955);
		int i_61_ = i_59_ + (i_57_ << (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4775) * 1856651955);
		int i_62_ = ((Class282_Sub19) this).aClass390_Sub2_7654.method6709(i_60_, i_61_, 371202509);
		if ((i_58_ & 0x7f) == 0 || (i_59_ & 0x7f) == 0) {
			l = ((long) i_61_ & 0xffffL) << 16 | (long) i_60_ & 0xffffL;
			Class282 class282 = ((Class282_Sub19) this).aClass453_7657.method7530(l);
			if (class282 != null) {
				method12305(((Class282_Sub46) class282).aShort8067);
				return;
			}
		}
		short i_63_ = (short) ((Class282_Sub19) this).anInt7646++;
		if (l != -1L)
			((Class282_Sub19) this).aClass453_7657.method7534(new Class282_Sub46(i_63_), l);
		float f;
		float f_64_;
		float f_65_;
		if (i_58_ == 0 && i_59_ == 0) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_55_];
			f_64_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_55_];
			f_65_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_55_];
		} else if (i_58_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439 && i_59_ == 0) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_55_];
			f_64_ = ((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_55_];
			f_65_ = ((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_55_];
		} else if (i_58_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439 && i_59_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_55_ + 1];
			f_64_ = (((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_55_ + 1]);
			f_65_ = (((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_55_ + 1]);
		} else if (i_58_ == 0 && i_59_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_55_ + 1];
			f_64_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_55_ + 1];
			f_65_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_55_ + 1];
		} else {
			float f_66_ = (float) i_58_ / (float) ((((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439);
			float f_67_ = (float) i_59_ / (float) ((((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439);
			float f_68_ = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_55_];
			float f_69_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_55_];
			float f_70_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_55_];
			float f_71_ = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_55_];
			float f_72_ = ((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_55_];
			float f_73_ = ((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_55_];
			f_68_ += (((Class282_Sub19) this).aFloatArrayArray7652[i][i_55_ + 1] - f_68_) * f_66_;
			f_69_ += (((Class282_Sub19) this).aFloatArrayArray7648[i][i_55_ + 1] - f_69_) * f_66_;
			f_70_ += (((Class282_Sub19) this).aFloatArrayArray7645[i][i_55_ + 1] - f_70_) * f_66_;
			f_71_ += ((((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_55_ + 1]) - f_71_) * f_66_;
			f_72_ += ((((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_55_ + 1]) - f_72_) * f_66_;
			f_73_ += ((((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_55_ + 1]) - f_73_) * f_66_;
			f = f_68_ + (f_71_ - f_68_) * f_67_;
			f_64_ = f_69_ + (f_72_ - f_69_) * f_67_;
			f_65_ = f_70_ + (f_73_ - f_70_) * f_67_;
		}
		float f_74_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12368((byte) 28) - i_60_);
		float f_75_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12369(1534020223) - i_62_);
		float f_76_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12394(1898486359) - i_61_);
		float f_77_ = (float) Math.sqrt((double) (f_74_ * f_74_ + f_75_ * f_75_ + f_76_ * f_76_));
		float f_78_ = 1.0F / f_77_;
		f_74_ *= f_78_;
		f_75_ *= f_78_;
		f_76_ *= f_78_;
		float f_79_ = f_77_ / (float) ((Class282_Sub19) this).aClass282_Sub24_7641.method12370(-789603523);
		float f_80_ = 1.0F - f_79_ * f_79_;
		if (f_80_ < 0.0F)
			f_80_ = 0.0F;
		float f_81_ = f_74_ * f + f_75_ * f_64_ + f_76_ * f_65_;
		if (f_81_ < 0.0F)
			f_81_ = 0.0F;
		float f_82_ = f_81_ * f_80_ * 2.0F;
		if (f_82_ > 1.0F)
			f_82_ = 1.0F;
		int i_83_ = ((Class282_Sub19) this).aClass282_Sub24_7641.method12371(-2146815269);
		int i_84_ = (int) (f_82_ * (float) (i_83_ >> 16 & 0xff));
		if (i_84_ > 255)
			i_84_ = 255;
		int i_85_ = (int) (f_82_ * (float) (i_83_ >> 8 & 0xff));
		if (i_85_ > 255)
			i_85_ = 255;
		int i_86_ = (int) (f_82_ * (float) (i_83_ & 0xff));
		if (i_86_ > 255)
			i_86_ = 255;
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467) {
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_60_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_62_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_61_);
		} else {
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_60_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_62_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_61_);
		}
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_84_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_85_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_86_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(255);
		method12305(i_63_);
	}

	void method12310(int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_) {
		long l = -1L;
		int i_92_ = i_90_ + (i_88_ << (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4775) * 1856651955);
		int i_93_ = i_91_ + (i_89_ << (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4775) * 1856651955);
		int i_94_ = ((Class282_Sub19) this).aClass390_Sub2_7654.method6709(i_92_, i_93_, -1176275430);
		if ((i_90_ & 0x7f) == 0 || (i_91_ & 0x7f) == 0) {
			l = ((long) i_93_ & 0xffffL) << 16 | (long) i_92_ & 0xffffL;
			Class282 class282 = ((Class282_Sub19) this).aClass453_7657.method7530(l);
			if (class282 != null) {
				method12305(((Class282_Sub46) class282).aShort8067);
				return;
			}
		}
		short i_95_ = (short) ((Class282_Sub19) this).anInt7646++;
		if (l != -1L)
			((Class282_Sub19) this).aClass453_7657.method7534(new Class282_Sub46(i_95_), l);
		float f;
		float f_96_;
		float f_97_;
		if (i_90_ == 0 && i_91_ == 0) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_87_];
			f_96_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_87_];
			f_97_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_87_];
		} else if (i_90_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439 && i_91_ == 0) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_87_];
			f_96_ = ((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_87_];
			f_97_ = ((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_87_];
		} else if (i_90_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439 && i_91_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_87_ + 1];
			f_96_ = (((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_87_ + 1]);
			f_97_ = (((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_87_ + 1]);
		} else if (i_90_ == 0 && i_91_ == (((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439) {
			f = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_87_ + 1];
			f_96_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_87_ + 1];
			f_97_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_87_ + 1];
		} else {
			float f_98_ = (float) i_90_ / (float) ((((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439);
			float f_99_ = (float) i_91_ / (float) ((((Class282_Sub19) this).aClass390_Sub2_7654.anInt4774) * 750971439);
			float f_100_ = ((Class282_Sub19) this).aFloatArrayArray7652[i][i_87_];
			float f_101_ = ((Class282_Sub19) this).aFloatArrayArray7648[i][i_87_];
			float f_102_ = ((Class282_Sub19) this).aFloatArrayArray7645[i][i_87_];
			float f_103_ = ((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_87_];
			float f_104_ = ((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_87_];
			float f_105_ = ((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_87_];
			f_100_ += (((Class282_Sub19) this).aFloatArrayArray7652[i][i_87_ + 1] - f_100_) * f_98_;
			f_101_ += (((Class282_Sub19) this).aFloatArrayArray7648[i][i_87_ + 1] - f_101_) * f_98_;
			f_102_ += (((Class282_Sub19) this).aFloatArrayArray7645[i][i_87_ + 1] - f_102_) * f_98_;
			f_103_ += ((((Class282_Sub19) this).aFloatArrayArray7652[i + 1][i_87_ + 1]) - f_103_) * f_98_;
			f_104_ += ((((Class282_Sub19) this).aFloatArrayArray7648[i + 1][i_87_ + 1]) - f_104_) * f_98_;
			f_105_ += ((((Class282_Sub19) this).aFloatArrayArray7645[i + 1][i_87_ + 1]) - f_105_) * f_98_;
			f = f_100_ + (f_103_ - f_100_) * f_99_;
			f_96_ = f_101_ + (f_104_ - f_101_) * f_99_;
			f_97_ = f_102_ + (f_105_ - f_102_) * f_99_;
		}
		float f_106_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12368((byte) 17) - i_92_);
		float f_107_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12369(1534020223) - i_94_);
		float f_108_ = (float) (((Class282_Sub19) this).aClass282_Sub24_7641.method12394(1014949196) - i_93_);
		float f_109_ = (float) Math.sqrt((double) (f_106_ * f_106_ + f_107_ * f_107_ + f_108_ * f_108_));
		float f_110_ = 1.0F / f_109_;
		f_106_ *= f_110_;
		f_107_ *= f_110_;
		f_108_ *= f_110_;
		float f_111_ = f_109_ / (float) ((Class282_Sub19) this).aClass282_Sub24_7641.method12370(-789603523);
		float f_112_ = 1.0F - f_111_ * f_111_;
		if (f_112_ < 0.0F)
			f_112_ = 0.0F;
		float f_113_ = f_106_ * f + f_107_ * f_96_ + f_108_ * f_97_;
		if (f_113_ < 0.0F)
			f_113_ = 0.0F;
		float f_114_ = f_113_ * f_112_ * 2.0F;
		if (f_114_ > 1.0F)
			f_114_ = 1.0F;
		int i_115_ = ((Class282_Sub19) this).aClass282_Sub24_7641.method12371(-2137441551);
		int i_116_ = (int) (f_114_ * (float) (i_115_ >> 16 & 0xff));
		if (i_116_ > 255)
			i_116_ = 255;
		int i_117_ = (int) (f_114_ * (float) (i_115_ >> 8 & 0xff));
		if (i_117_ > 255)
			i_117_ = 255;
		int i_118_ = (int) (f_114_ * (float) (i_115_ & 0xff));
		if (i_118_ > 255)
			i_118_ = 255;
		if (((Class505_Sub1) ((Class282_Sub19) this).aClass505_Sub1_7650).aBool8467) {
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_92_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_94_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14688((float) i_93_);
		} else {
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_92_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_94_);
			((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.method14685((float) i_93_);
		}
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_116_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_117_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(i_118_);
		((Class282_Sub19) this).aClass282_Sub35_Sub1_7651.writeByte(255);
		method12305(i_95_);
	}

	void method12311(int i, int i_119_, int i_120_, boolean[][] bools) {
		if (((Class282_Sub19) this).anInterface15_7639 != null && ((Class282_Sub19) this).anInt7642 <= i + i_120_ && ((Class282_Sub19) this).anInt7653 >= i - i_120_ && ((Class282_Sub19) this).anInt7644 <= i_119_ + i_120_ && ((Class282_Sub19) this).anInt7656 >= i_119_ - i_120_) {
			for (int i_121_ = ((Class282_Sub19) this).anInt7644; i_121_ <= ((Class282_Sub19) this).anInt7656; i_121_++) {
				for (int i_122_ = ((Class282_Sub19) this).anInt7642; i_122_ <= ((Class282_Sub19) this).anInt7653; i_122_++) {
					int i_123_ = i_122_ - i;
					int i_124_ = i_121_ - i_119_;
					if (i_123_ > -i_120_ && i_123_ < i_120_ && i_124_ > -i_120_ && i_124_ < i_120_ && bools[i_123_ + i_120_][i_124_ + i_120_]) {
						((Class282_Sub19) this).aClass505_Sub1_7650.method13617((int) (((Class282_Sub19) this).aClass282_Sub24_7641.method12395(-86790079) * 255.0F) << 24);
						((Class282_Sub19) this).aClass505_Sub1_7650.method13647(((Class282_Sub19) this).aClass143_7647, null, ((Class282_Sub19) this).aClass143_7643, null);
						((Class282_Sub19) this).aClass505_Sub1_7650.method13611(((Class282_Sub19) this).anInterface15_7639, 4, 0, ((Class282_Sub19) this).anInt7640);
						return;
					}
				}
			}
		}
	}

	void method12312(int i, int i_125_, int i_126_, boolean[][] bools) {
		if (((Class282_Sub19) this).anInterface15_7639 != null && ((Class282_Sub19) this).anInt7642 <= i + i_126_ && ((Class282_Sub19) this).anInt7653 >= i - i_126_ && ((Class282_Sub19) this).anInt7644 <= i_125_ + i_126_ && ((Class282_Sub19) this).anInt7656 >= i_125_ - i_126_) {
			for (int i_127_ = ((Class282_Sub19) this).anInt7644; i_127_ <= ((Class282_Sub19) this).anInt7656; i_127_++) {
				for (int i_128_ = ((Class282_Sub19) this).anInt7642; i_128_ <= ((Class282_Sub19) this).anInt7653; i_128_++) {
					int i_129_ = i_128_ - i;
					int i_130_ = i_127_ - i_125_;
					if (i_129_ > -i_126_ && i_129_ < i_126_ && i_130_ > -i_126_ && i_130_ < i_126_ && bools[i_129_ + i_126_][i_130_ + i_126_]) {
						((Class282_Sub19) this).aClass505_Sub1_7650.method13617((int) (((Class282_Sub19) this).aClass282_Sub24_7641.method12395(1088999214) * 255.0F) << 24);
						((Class282_Sub19) this).aClass505_Sub1_7650.method13647(((Class282_Sub19) this).aClass143_7647, null, ((Class282_Sub19) this).aClass143_7643, null);
						((Class282_Sub19) this).aClass505_Sub1_7650.method13611(((Class282_Sub19) this).anInterface15_7639, 4, 0, ((Class282_Sub19) this).anInt7640);
						return;
					}
				}
			}
		}
	}

	void method12313(int i, int i_131_, int i_132_, boolean[][] bools) {
		if (((Class282_Sub19) this).anInterface15_7639 != null && ((Class282_Sub19) this).anInt7642 <= i + i_132_ && ((Class282_Sub19) this).anInt7653 >= i - i_132_ && ((Class282_Sub19) this).anInt7644 <= i_131_ + i_132_ && ((Class282_Sub19) this).anInt7656 >= i_131_ - i_132_) {
			for (int i_133_ = ((Class282_Sub19) this).anInt7644; i_133_ <= ((Class282_Sub19) this).anInt7656; i_133_++) {
				for (int i_134_ = ((Class282_Sub19) this).anInt7642; i_134_ <= ((Class282_Sub19) this).anInt7653; i_134_++) {
					int i_135_ = i_134_ - i;
					int i_136_ = i_133_ - i_131_;
					if (i_135_ > -i_132_ && i_135_ < i_132_ && i_136_ > -i_132_ && i_136_ < i_132_ && bools[i_135_ + i_132_][i_136_ + i_132_]) {
						((Class282_Sub19) this).aClass505_Sub1_7650.method13617((int) (((Class282_Sub19) this).aClass282_Sub24_7641.method12395(289408915) * 255.0F) << 24);
						((Class282_Sub19) this).aClass505_Sub1_7650.method13647(((Class282_Sub19) this).aClass143_7647, null, ((Class282_Sub19) this).aClass143_7643, null);
						((Class282_Sub19) this).aClass505_Sub1_7650.method13611(((Class282_Sub19) this).anInterface15_7639, 4, 0, ((Class282_Sub19) this).anInt7640);
						return;
					}
				}
			}
		}
	}
}
