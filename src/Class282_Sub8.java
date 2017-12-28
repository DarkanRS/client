
/* Class282_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class282_Sub8 extends Class282 {
	Interface32 anInterface32_7523;
	Class390_Sub1 aClass390_Sub1_7524;
	Interface4 anInterface4_7525;
	int anInt7526;
	int anInt7527;
	Class282_Sub24 aClass282_Sub24_7528;
	int anInt7529;
	int anInt7530;
	int anInt7531;
	int anInt7532;
	Class505_Sub2 aClass505_Sub2_7533;
	float[][] aFloatArrayArray7534;
	float[][] aFloatArrayArray7535;
	float[][] aFloatArrayArray7536;
	Class453 aClass453_7537;

	void method12175(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, ByteBuffer bytebuffer, ByteBuffer bytebuffer_5_) {
		long l = -1L;
		int i_6_ = i_3_ + (i_1_ << (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4775) * 1856651955);
		int i_7_ = i_4_ + (i_2_ << (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4775) * 1856651955);
		int i_8_ = ((Class282_Sub8) this).aClass390_Sub1_7524.method6709(i_6_, i_7_, -2014795016);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_7_ & 0xffffL) << 16 | (long) i_6_ & 0xffffL;
			Class282 class282 = ((Class282_Sub8) this).aClass453_7537.method7530(l);
			if (class282 != null) {
				bytebuffer.putShort(((Class282_Sub46) class282).aShort8067);
				return;
			}
		}
		short i_9_ = (short) ((Class282_Sub8) this).anInt7530++;
		if (l != -1L)
			((Class282_Sub8) this).aClass453_7537.method7534(new Class282_Sub46(i_9_), l);
		float f;
		float f_10_;
		float f_11_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i][i_0_];
			f_10_ = ((Class282_Sub8) this).aFloatArrayArray7535[i][i_0_];
			f_11_ = ((Class282_Sub8) this).aFloatArrayArray7536[i][i_0_];
		} else if (i_3_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439 && i_4_ == 0) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_0_];
			f_10_ = ((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_0_];
			f_11_ = ((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_0_];
		} else if (i_3_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439 && i_4_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_0_ + 1];
			f_10_ = ((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_0_ + 1];
			f_11_ = ((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i][i_0_ + 1];
			f_10_ = ((Class282_Sub8) this).aFloatArrayArray7535[i][i_0_ + 1];
			f_11_ = ((Class282_Sub8) this).aFloatArrayArray7536[i][i_0_ + 1];
		} else {
			float f_12_ = (float) i_3_ / (float) ((((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439);
			float f_13_ = (float) i_4_ / (float) ((((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439);
			float f_14_ = ((Class282_Sub8) this).aFloatArrayArray7534[i][i_0_];
			float f_15_ = ((Class282_Sub8) this).aFloatArrayArray7535[i][i_0_];
			float f_16_ = ((Class282_Sub8) this).aFloatArrayArray7536[i][i_0_];
			float f_17_ = ((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_0_];
			float f_18_ = ((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_0_];
			float f_19_ = ((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_0_];
			f_14_ += (((Class282_Sub8) this).aFloatArrayArray7534[i][i_0_ + 1] - f_14_) * f_12_;
			f_15_ += (((Class282_Sub8) this).aFloatArrayArray7535[i][i_0_ + 1] - f_15_) * f_12_;
			f_16_ += (((Class282_Sub8) this).aFloatArrayArray7536[i][i_0_ + 1] - f_16_) * f_12_;
			f_17_ += ((((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_0_ + 1]) - f_17_) * f_12_;
			f_18_ += ((((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_0_ + 1]) - f_18_) * f_12_;
			f_19_ += ((((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_0_ + 1]) - f_19_) * f_12_;
			f = f_14_ + (f_17_ - f_14_) * f_13_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_13_;
			f_11_ = f_16_ + (f_19_ - f_16_) * f_13_;
		}
		float f_20_ = (float) (((Class282_Sub8) this).aClass282_Sub24_7528.method12368((byte) 56) - i_6_);
		float f_21_ = (float) (((Class282_Sub8) this).aClass282_Sub24_7528.method12369(1534020223) - i_8_);
		float f_22_ = (float) (((Class282_Sub8) this).aClass282_Sub24_7528.method12394(1552154107) - i_7_);
		float f_23_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_ + f_22_ * f_22_));
		float f_24_ = 1.0F / f_23_;
		f_20_ *= f_24_;
		f_21_ *= f_24_;
		f_22_ *= f_24_;
		float f_25_ = f_23_ / (float) ((Class282_Sub8) this).aClass282_Sub24_7528.method12370(-789603523);
		float f_26_ = 1.0F - f_25_ * f_25_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_20_ * f + f_21_ * f_10_ + f_22_ * f_11_;
		if (f_27_ < 0.0F)
			f_27_ = 0.0F;
		float f_28_ = f_27_ * f_26_ * 2.0F;
		if (f_28_ > 1.0F)
			f_28_ = 1.0F;
		int i_29_ = ((Class282_Sub8) this).aClass282_Sub24_7528.method12371(-2135048903);
		int i_30_ = (int) (f_28_ * (float) (i_29_ >> 16 & 0xff));
		if (i_30_ > 255)
			i_30_ = 255;
		int i_31_ = (int) (f_28_ * (float) (i_29_ >> 8 & 0xff));
		if (i_31_ > 255)
			i_31_ = 255;
		int i_32_ = (int) (f_28_ * (float) (i_29_ & 0xff));
		if (i_32_ > 255)
			i_32_ = 255;
		bytebuffer_5_.putFloat((float) i_6_);
		bytebuffer_5_.putFloat((float) i_8_);
		bytebuffer_5_.putFloat((float) i_7_);
		if ((((Class505_Sub2) ((Class282_Sub8) this).aClass505_Sub2_7533).anInt8824) == 0) {
			bytebuffer_5_.put((byte) i_32_);
			bytebuffer_5_.put((byte) i_31_);
			bytebuffer_5_.put((byte) i_30_);
		} else {
			bytebuffer_5_.put((byte) i_30_);
			bytebuffer_5_.put((byte) i_31_);
			bytebuffer_5_.put((byte) i_32_);
		}
		bytebuffer_5_.put((byte) -1);
		bytebuffer.putShort(i_9_);
	}

	Class282_Sub8(Class505_Sub2 class505_sub2, Class390_Sub1 class390_sub1, Class282_Sub24 class282_sub24, int[] is) {
		((Class282_Sub8) this).aClass505_Sub2_7533 = class505_sub2;
		((Class282_Sub8) this).aClass282_Sub24_7528 = class282_sub24;
		((Class282_Sub8) this).aClass390_Sub1_7524 = class390_sub1;
		int i = (((Class282_Sub8) this).aClass282_Sub24_7528.method12370(-789603523) - (class390_sub1.anInt4774 * 750971439 >> 1));
		((Class282_Sub8) this).anInt7531 = (((Class282_Sub8) this).aClass282_Sub24_7528.method12368((byte) -45) - i >> class390_sub1.anInt4775 * 1856651955);
		((Class282_Sub8) this).anInt7527 = (((Class282_Sub8) this).aClass282_Sub24_7528.method12368((byte) 53) + i >> class390_sub1.anInt4775 * 1856651955);
		((Class282_Sub8) this).anInt7526 = (((Class282_Sub8) this).aClass282_Sub24_7528.method12394(1835098637) - i >> class390_sub1.anInt4775 * 1856651955);
		((Class282_Sub8) this).anInt7529 = (((Class282_Sub8) this).aClass282_Sub24_7528.method12394(2061552360) + i >> class390_sub1.anInt4775 * 1856651955);
		int i_33_ = (((Class282_Sub8) this).anInt7527 - ((Class282_Sub8) this).anInt7531 + 1);
		int i_34_ = (((Class282_Sub8) this).anInt7529 - ((Class282_Sub8) this).anInt7526 + 1);
		((Class282_Sub8) this).aFloatArrayArray7534 = new float[i_33_ + 1][i_34_ + 1];
		((Class282_Sub8) this).aFloatArrayArray7535 = new float[i_33_ + 1][i_34_ + 1];
		((Class282_Sub8) this).aFloatArrayArray7536 = new float[i_33_ + 1][i_34_ + 1];
		for (int i_35_ = 0; i_35_ <= i_34_; i_35_++) {
			int i_36_ = i_35_ + ((Class282_Sub8) this).anInt7526;
			if (i_36_ > 0 && i_36_ < (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4773) * 1826078169 - 1) {
				for (int i_37_ = 0; i_37_ <= i_33_; i_37_++) {
					int i_38_ = i_37_ + ((Class282_Sub8) this).anInt7531;
					if (i_38_ > 0 && i_38_ < (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4776) * -1843860823 - 1) {
						int i_39_ = (class390_sub1.method6722(i_38_ + 1, i_36_, 65280) - class390_sub1.method6722(i_38_ - 1, i_36_, 65280));
						int i_40_ = (class390_sub1.method6722(i_38_, i_36_ + 1, 65280) - class390_sub1.method6722(i_38_, i_36_ - 1, 65280));
						float f = (float) (1.0 / Math.sqrt((double) (i_39_ * i_39_ + 65536 + (i_40_ * i_40_))));
						((Class282_Sub8) this).aFloatArrayArray7534[i_37_][i_35_] = (float) i_39_ * f;
						((Class282_Sub8) this).aFloatArrayArray7535[i_37_][i_35_] = -256.0F * f;
						((Class282_Sub8) this).aFloatArrayArray7536[i_37_][i_35_] = (float) i_40_ * f;
					}
				}
			}
		}
		int i_41_ = 0;
		for (int i_42_ = ((Class282_Sub8) this).anInt7526; i_42_ <= ((Class282_Sub8) this).anInt7529; i_42_++) {
			if (i_42_ >= 0 && i_42_ < class390_sub1.anInt4773 * 1826078169) {
				for (int i_43_ = ((Class282_Sub8) this).anInt7531; i_43_ <= ((Class282_Sub8) this).anInt7527; i_43_++) {
					if (i_43_ >= 0 && i_43_ < class390_sub1.anInt4776 * -1843860823) {
						int i_44_ = is[i_41_];
						int[] is_45_ = (((Class390_Sub1) class390_sub1).anIntArrayArrayArray8538[i_43_][i_42_]);
						if (is_45_ != null && i_44_ != 0) {
							if (i_44_ == 1) {
								int i_46_ = 0;
								while (i_46_ < is_45_.length) {
									if (is_45_[i_46_++] != -1 && is_45_[i_46_++] != -1 && is_45_[i_46_++] != -1)
										((Class282_Sub8) this).anInt7532 += 3;
								}
							} else
								((Class282_Sub8) this).anInt7532 += 3;
						}
					}
					i_41_++;
				}
			} else
				i_41_ += (((Class282_Sub8) this).anInt7527 - ((Class282_Sub8) this).anInt7531);
		}
		if (((Class282_Sub8) this).anInt7532 > 0) {
			((Class282_Sub8) this).aClass453_7537 = new Class453(Class323.method5778((((Class282_Sub8) this).anInt7532), 1669854752));
			ByteBuffer bytebuffer = ((Class282_Sub8) this).aClass505_Sub2_7533.aByteBuffer8838;
			bytebuffer.clear();
			bytebuffer.position(2097152);
			ByteBuffer bytebuffer_47_ = bytebuffer.slice();
			bytebuffer.position(0);
			bytebuffer.limit(2097152);
			int i_48_ = 0;
			i_41_ = 0;
			for (int i_49_ = ((Class282_Sub8) this).anInt7526; i_49_ <= ((Class282_Sub8) this).anInt7529; i_49_++) {
				if (i_49_ >= 0 && i_49_ < class390_sub1.anInt4773 * 1826078169) {
					int i_50_ = 0;
					for (int i_51_ = ((Class282_Sub8) this).anInt7531; i_51_ <= ((Class282_Sub8) this).anInt7527; i_51_++) {
						if (i_51_ >= 0 && i_51_ < class390_sub1.anInt4776 * -1843860823) {
							int i_52_ = is[i_41_];
							int[] is_53_ = (((Class390_Sub1) class390_sub1).anIntArrayArrayArray8538[i_51_][i_49_]);
							if (is_53_ != null && i_52_ != 0) {
								if (i_52_ == 1) {
									int[] is_54_ = (((Class390_Sub1) class390_sub1).anIntArrayArrayArray8540[i_51_][i_49_]);
									int[] is_55_ = (((Class390_Sub1) class390_sub1).anIntArrayArrayArray8533[i_51_][i_49_]);
									int i_56_ = 0;
									while (i_56_ < is_53_.length) {
										if (is_53_[i_56_] != -1 && is_53_[i_56_ + 1] != -1 && is_53_[i_56_ + 2] != -1) {
											method12175(i_50_, i_48_, i_51_, i_49_, is_54_[i_56_], is_55_[i_56_], bytebuffer_47_, bytebuffer);
											i_56_++;
											method12175(i_50_, i_48_, i_51_, i_49_, is_54_[i_56_], is_55_[i_56_], bytebuffer_47_, bytebuffer);
											i_56_++;
											method12175(i_50_, i_48_, i_51_, i_49_, is_54_[i_56_], is_55_[i_56_], bytebuffer_47_, bytebuffer);
											i_56_++;
										} else
											i_56_ += 3;
									}
								} else if (i_52_ == 3) {
									method12175(i_50_, i_48_, i_51_, i_49_, 0, 0, bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, (class390_sub1.anInt4774 * 750971439), 0, bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, 0, (class390_sub1.anInt4774 * 750971439), bytebuffer_47_, bytebuffer);
								} else if (i_52_ == 2) {
									method12175(i_50_, i_48_, i_51_, i_49_, (class390_sub1.anInt4774 * 750971439), 0, bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, (class390_sub1.anInt4774 * 750971439), (class390_sub1.anInt4774 * 750971439), bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, 0, 0, bytebuffer_47_, bytebuffer);
								} else if (i_52_ == 5) {
									method12175(i_50_, i_48_, i_51_, i_49_, (class390_sub1.anInt4774 * 750971439), (class390_sub1.anInt4774 * 750971439), bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, 0, (class390_sub1.anInt4774 * 750971439), bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, (class390_sub1.anInt4774 * 750971439), 0, bytebuffer_47_, bytebuffer);
								} else if (i_52_ == 4) {
									method12175(i_50_, i_48_, i_51_, i_49_, 0, (class390_sub1.anInt4774 * 750971439), bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, 0, 0, bytebuffer_47_, bytebuffer);
									method12175(i_50_, i_48_, i_51_, i_49_, (class390_sub1.anInt4774 * 750971439), (class390_sub1.anInt4774 * 750971439), bytebuffer_47_, bytebuffer);
								}
							}
						}
						i_41_++;
						i_50_++;
					}
				} else
					i_41_ += (((Class282_Sub8) this).anInt7527 - ((Class282_Sub8) this).anInt7531);
				i_48_++;
			}
			((Class282_Sub8) this).anInterface32_7523 = ((Class282_Sub8) this).aClass505_Sub2_7533.method13993(false);
			((Class282_Sub8) this).anInterface32_7523.method208(((Class282_Sub8) this).anInt7532);
			((Class282_Sub8) this).anInterface4_7525 = ((Class282_Sub8) this).aClass505_Sub2_7533.method13994(false);
			((Class282_Sub8) this).anInterface4_7525.method31(((Class282_Sub8) this).anInt7530 * 16, 16);
			((Class282_Sub8) this).anInterface4_7525.method42(0, bytebuffer.position(), ((Class282_Sub8) this).aClass505_Sub2_7533.aLong8695);
			((Class282_Sub8) this).anInterface32_7523.method42(0, bytebuffer_47_.position(), (((Class282_Sub8) this).aClass505_Sub2_7533.aLong8695 + 2097152L));
		} else {
			((Class282_Sub8) this).anInterface4_7525 = null;
			((Class282_Sub8) this).anInterface32_7523 = null;
		}
		((Class282_Sub8) this).aClass453_7537 = null;
		((Class282_Sub8) this).aFloatArrayArray7536 = null;
		((Class282_Sub8) this).aFloatArrayArray7535 = null;
		((Class282_Sub8) this).aFloatArrayArray7534 = null;
	}

	void method12176(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, ByteBuffer bytebuffer, ByteBuffer bytebuffer_62_) {
		long l = -1L;
		int i_63_ = i_60_ + (i_58_ << (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4775 * 1856651955));
		int i_64_ = i_61_ + (i_59_ << (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4775 * 1856651955));
		int i_65_ = ((Class282_Sub8) this).aClass390_Sub1_7524.method6709(i_63_, i_64_, -106359952);
		if ((i_60_ & 0x7f) == 0 || (i_61_ & 0x7f) == 0) {
			l = ((long) i_64_ & 0xffffL) << 16 | (long) i_63_ & 0xffffL;
			Class282 class282 = ((Class282_Sub8) this).aClass453_7537.method7530(l);
			if (class282 != null) {
				bytebuffer.putShort(((Class282_Sub46) class282).aShort8067);
				return;
			}
		}
		short i_66_ = (short) ((Class282_Sub8) this).anInt7530++;
		if (l != -1L)
			((Class282_Sub8) this).aClass453_7537.method7534(new Class282_Sub46(i_66_), l);
		float f;
		float f_67_;
		float f_68_;
		if (i_60_ == 0 && i_61_ == 0) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i][i_57_];
			f_67_ = ((Class282_Sub8) this).aFloatArrayArray7535[i][i_57_];
			f_68_ = ((Class282_Sub8) this).aFloatArrayArray7536[i][i_57_];
		} else if (i_60_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439 && i_61_ == 0) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_57_];
			f_67_ = ((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_57_];
			f_68_ = ((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_57_];
		} else if (i_60_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439 && i_61_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_57_ + 1];
			f_67_ = (((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_57_ + 1]);
			f_68_ = (((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_57_ + 1]);
		} else if (i_60_ == 0 && i_61_ == (((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439) {
			f = ((Class282_Sub8) this).aFloatArrayArray7534[i][i_57_ + 1];
			f_67_ = ((Class282_Sub8) this).aFloatArrayArray7535[i][i_57_ + 1];
			f_68_ = ((Class282_Sub8) this).aFloatArrayArray7536[i][i_57_ + 1];
		} else {
			float f_69_ = (float) i_60_ / (float) ((((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439);
			float f_70_ = (float) i_61_ / (float) ((((Class282_Sub8) this).aClass390_Sub1_7524.anInt4774) * 750971439);
			float f_71_ = ((Class282_Sub8) this).aFloatArrayArray7534[i][i_57_];
			float f_72_ = ((Class282_Sub8) this).aFloatArrayArray7535[i][i_57_];
			float f_73_ = ((Class282_Sub8) this).aFloatArrayArray7536[i][i_57_];
			float f_74_ = ((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_57_];
			float f_75_ = ((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_57_];
			float f_76_ = ((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_57_];
			f_71_ += (((Class282_Sub8) this).aFloatArrayArray7534[i][i_57_ + 1] - f_71_) * f_69_;
			f_72_ += (((Class282_Sub8) this).aFloatArrayArray7535[i][i_57_ + 1] - f_72_) * f_69_;
			f_73_ += (((Class282_Sub8) this).aFloatArrayArray7536[i][i_57_ + 1] - f_73_) * f_69_;
			f_74_ += ((((Class282_Sub8) this).aFloatArrayArray7534[i + 1][i_57_ + 1]) - f_74_) * f_69_;
			f_75_ += ((((Class282_Sub8) this).aFloatArrayArray7535[i + 1][i_57_ + 1]) - f_75_) * f_69_;
			f_76_ += ((((Class282_Sub8) this).aFloatArrayArray7536[i + 1][i_57_ + 1]) - f_76_) * f_69_;
			f = f_71_ + (f_74_ - f_71_) * f_70_;
			f_67_ = f_72_ + (f_75_ - f_72_) * f_70_;
			f_68_ = f_73_ + (f_76_ - f_73_) * f_70_;
		}
		float f_77_ = (float) (((Class282_Sub8) this).aClass282_Sub24_7528.method12368((byte) -78) - i_63_);
		float f_78_ = (float) (((Class282_Sub8) this).aClass282_Sub24_7528.method12369(1534020223) - i_65_);
		float f_79_ = (float) (((Class282_Sub8) this).aClass282_Sub24_7528.method12394(1864066780) - i_64_);
		float f_80_ = (float) Math.sqrt((double) (f_77_ * f_77_ + f_78_ * f_78_ + f_79_ * f_79_));
		float f_81_ = 1.0F / f_80_;
		f_77_ *= f_81_;
		f_78_ *= f_81_;
		f_79_ *= f_81_;
		float f_82_ = f_80_ / (float) ((Class282_Sub8) this).aClass282_Sub24_7528.method12370(-789603523);
		float f_83_ = 1.0F - f_82_ * f_82_;
		if (f_83_ < 0.0F)
			f_83_ = 0.0F;
		float f_84_ = f_77_ * f + f_78_ * f_67_ + f_79_ * f_68_;
		if (f_84_ < 0.0F)
			f_84_ = 0.0F;
		float f_85_ = f_84_ * f_83_ * 2.0F;
		if (f_85_ > 1.0F)
			f_85_ = 1.0F;
		int i_86_ = ((Class282_Sub8) this).aClass282_Sub24_7528.method12371(-2139419259);
		int i_87_ = (int) (f_85_ * (float) (i_86_ >> 16 & 0xff));
		if (i_87_ > 255)
			i_87_ = 255;
		int i_88_ = (int) (f_85_ * (float) (i_86_ >> 8 & 0xff));
		if (i_88_ > 255)
			i_88_ = 255;
		int i_89_ = (int) (f_85_ * (float) (i_86_ & 0xff));
		if (i_89_ > 255)
			i_89_ = 255;
		bytebuffer_62_.putFloat((float) i_63_);
		bytebuffer_62_.putFloat((float) i_65_);
		bytebuffer_62_.putFloat((float) i_64_);
		if ((((Class505_Sub2) ((Class282_Sub8) this).aClass505_Sub2_7533).anInt8824) == 0) {
			bytebuffer_62_.put((byte) i_89_);
			bytebuffer_62_.put((byte) i_88_);
			bytebuffer_62_.put((byte) i_87_);
		} else {
			bytebuffer_62_.put((byte) i_87_);
			bytebuffer_62_.put((byte) i_88_);
			bytebuffer_62_.put((byte) i_89_);
		}
		bytebuffer_62_.put((byte) -1);
		bytebuffer.putShort(i_66_);
	}
}
