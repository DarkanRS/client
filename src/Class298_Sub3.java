/* Class298_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub3 extends Linkable {
	Class298_Sub10 aClass298_Sub10_7168;
	Class_xa_Sub3 aClass_xa_Sub3_7169;
	int anInt7170;
	int anInt7171;
	int anInt7172;
	Class_ra_Sub2 aClass_ra_Sub2_7173;
	Interface2 anInterface2_7174;
	int anInt7175;
	int anInt7176;
	int anInt7177;
	Interface1 anInterface1_7178;
	Class32 aClass32_7179;
	Class32 aClass32_7180;
	float[][] aFloatArrayArray7181;
	float[][] aFloatArrayArray7182;
	float[][] aFloatArrayArray7183;
	RsByteBuffer aClass298_Sub53_7184;
	RsFloatBuffer aClass298_Sub53_Sub1_7185;
	Class440 aClass440_7186;

	void method2851(short i) {
		if (((Class_ra_Sub2) ((Class298_Sub3) this).aClass_ra_Sub2_7173).aBoolean8143)
			((Class298_Sub3) this).aClass298_Sub53_7184.writeShort(i, 16711935);
		else
			((Class298_Sub3) this).aClass298_Sub53_7184.method3587(i, 1368367793);
	}

	void method2852(int i, int i_0_, int i_1_, boolean[][] bools) {
		if (((Class298_Sub3) this).anInterface2_7174 != null && ((Class298_Sub3) this).anInt7171 <= i + i_1_ && ((Class298_Sub3) this).anInt7172 >= i - i_1_ && ((Class298_Sub3) this).anInt7177 <= i_0_ + i_1_ && ((Class298_Sub3) this).anInt7170 >= i_0_ - i_1_) {
			for (int i_2_ = ((Class298_Sub3) this).anInt7177; i_2_ <= ((Class298_Sub3) this).anInt7170; i_2_++) {
				for (int i_3_ = ((Class298_Sub3) this).anInt7171; i_3_ <= ((Class298_Sub3) this).anInt7172; i_3_++) {
					int i_4_ = i_3_ - i;
					int i_5_ = i_2_ - i_0_;
					if (i_4_ > -i_1_ && i_4_ < i_1_ && i_5_ > -i_1_ && i_5_ < i_1_ && bools[i_4_ + i_1_][i_5_ + i_1_]) {
						((Class298_Sub3) this).aClass_ra_Sub2_7173.method5273((int) (((Class298_Sub3) this).aClass298_Sub10_7168.method2901(608404512) * 255.0F) << 24);
						((Class298_Sub3) this).aClass_ra_Sub2_7173.method5248(((Class298_Sub3) this).aClass32_7179, null, ((Class298_Sub3) this).aClass32_7180, null);
						((Class298_Sub3) this).aClass_ra_Sub2_7173.method5254(((Class298_Sub3) this).anInterface2_7174, 4, 0, ((Class298_Sub3) this).anInt7176);
						return;
					}
				}
			}
		}
	}

	void method2853(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		long l = -1L;
		int i_11_ = i_9_ + (i_7_ << (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6289) * -2137349879);
		int i_12_ = (i_10_ + (i_8_ << (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6289 * -2137349879)));
		int i_13_ = ((Class298_Sub3) this).aClass_xa_Sub3_7169.method6340(i_11_, i_12_, -1731289320);
		if ((i_9_ & 0x7f) == 0 || (i_10_ & 0x7f) == 0) {
			l = ((long) i_12_ & 0xffffL) << 16 | (long) i_11_ & 0xffffL;
			Linkable class298 = ((Class298_Sub3) this).aClass440_7186.method5852(l);
			if (class298 != null) {
				method2851(((Class298_Sub20) class298).aShort7314);
				return;
			}
		}
		short i_14_ = (short) ((Class298_Sub3) this).anInt7175++;
		if (l != -1L)
			((Class298_Sub3) this).aClass440_7186.method5858(new Class298_Sub20(i_14_), l);
		float f;
		float f_15_;
		float f_16_;
		if (i_9_ == 0 && i_10_ == 0) {
			f = ((Class298_Sub3) this).aFloatArrayArray7181[i][i_6_];
			f_15_ = ((Class298_Sub3) this).aFloatArrayArray7182[i][i_6_];
			f_16_ = ((Class298_Sub3) this).aFloatArrayArray7183[i][i_6_];
		} else if (i_9_ == (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6288) * -1212653763 && i_10_ == 0) {
			f = ((Class298_Sub3) this).aFloatArrayArray7181[i + 1][i_6_];
			f_15_ = ((Class298_Sub3) this).aFloatArrayArray7182[i + 1][i_6_];
			f_16_ = ((Class298_Sub3) this).aFloatArrayArray7183[i + 1][i_6_];
		} else if (i_9_ == (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6288) * -1212653763 && i_10_ == (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6288) * -1212653763) {
			f = ((Class298_Sub3) this).aFloatArrayArray7181[i + 1][i_6_ + 1];
			f_15_ = ((Class298_Sub3) this).aFloatArrayArray7182[i + 1][i_6_ + 1];
			f_16_ = ((Class298_Sub3) this).aFloatArrayArray7183[i + 1][i_6_ + 1];
		} else if (i_9_ == 0 && i_10_ == (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6288) * -1212653763) {
			f = ((Class298_Sub3) this).aFloatArrayArray7181[i][i_6_ + 1];
			f_15_ = ((Class298_Sub3) this).aFloatArrayArray7182[i][i_6_ + 1];
			f_16_ = ((Class298_Sub3) this).aFloatArrayArray7183[i][i_6_ + 1];
		} else {
			float f_17_ = (float) i_9_ / (float) ((((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6288) * -1212653763);
			float f_18_ = (float) i_10_ / (float) ((((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6288) * -1212653763);
			float f_19_ = ((Class298_Sub3) this).aFloatArrayArray7181[i][i_6_];
			float f_20_ = ((Class298_Sub3) this).aFloatArrayArray7182[i][i_6_];
			float f_21_ = ((Class298_Sub3) this).aFloatArrayArray7183[i][i_6_];
			float f_22_ = ((Class298_Sub3) this).aFloatArrayArray7181[i + 1][i_6_];
			float f_23_ = ((Class298_Sub3) this).aFloatArrayArray7182[i + 1][i_6_];
			float f_24_ = ((Class298_Sub3) this).aFloatArrayArray7183[i + 1][i_6_];
			f_19_ += (((Class298_Sub3) this).aFloatArrayArray7181[i][i_6_ + 1] - f_19_) * f_17_;
			f_20_ += (((Class298_Sub3) this).aFloatArrayArray7182[i][i_6_ + 1] - f_20_) * f_17_;
			f_21_ += (((Class298_Sub3) this).aFloatArrayArray7183[i][i_6_ + 1] - f_21_) * f_17_;
			f_22_ += ((((Class298_Sub3) this).aFloatArrayArray7181[i + 1][i_6_ + 1]) - f_22_) * f_17_;
			f_23_ += ((((Class298_Sub3) this).aFloatArrayArray7182[i + 1][i_6_ + 1]) - f_23_) * f_17_;
			f_24_ += ((((Class298_Sub3) this).aFloatArrayArray7183[i + 1][i_6_ + 1]) - f_24_) * f_17_;
			f = f_19_ + (f_22_ - f_19_) * f_18_;
			f_15_ = f_20_ + (f_23_ - f_20_) * f_18_;
			f_16_ = f_21_ + (f_24_ - f_21_) * f_18_;
		}
		float f_25_ = (float) (((Class298_Sub3) this).aClass298_Sub10_7168.method2895(823958259) - i_11_);
		float f_26_ = (float) (((Class298_Sub3) this).aClass298_Sub10_7168.method2894(820885236) - i_13_);
		float f_27_ = (float) (((Class298_Sub3) this).aClass298_Sub10_7168.method2897((byte) 86) - i_12_);
		float f_28_ = (float) Math.sqrt((double) (f_25_ * f_25_ + f_26_ * f_26_ + f_27_ * f_27_));
		float f_29_ = 1.0F / f_28_;
		f_25_ *= f_29_;
		f_26_ *= f_29_;
		f_27_ *= f_29_;
		float f_30_ = f_28_ / (float) ((Class298_Sub3) this).aClass298_Sub10_7168.method2900(-1220224399);
		float f_31_ = 1.0F - f_30_ * f_30_;
		if (f_31_ < 0.0F)
			f_31_ = 0.0F;
		float f_32_ = f_25_ * f + f_26_ * f_15_ + f_27_ * f_16_;
		if (f_32_ < 0.0F)
			f_32_ = 0.0F;
		float f_33_ = f_32_ * f_31_ * 2.0F;
		if (f_33_ > 1.0F)
			f_33_ = 1.0F;
		int i_34_ = ((Class298_Sub3) this).aClass298_Sub10_7168.method2898(-2114796775);
		int i_35_ = (int) (f_33_ * (float) (i_34_ >> 16 & 0xff));
		if (i_35_ > 255)
			i_35_ = 255;
		int i_36_ = (int) (f_33_ * (float) (i_34_ >> 8 & 0xff));
		if (i_36_ > 255)
			i_36_ = 255;
		int i_37_ = (int) (f_33_ * (float) (i_34_ & 0xff));
		if (i_37_ > 255)
			i_37_ = 255;
		if (((Class_ra_Sub2) ((Class298_Sub3) this).aClass_ra_Sub2_7173).aBoolean8143) {
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.method3658((float) i_11_);
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.method3658((float) i_13_);
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.method3658((float) i_12_);
		} else {
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.method3659((float) i_11_);
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.method3659((float) i_13_);
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.method3659((float) i_12_);
		}
		((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.writeByte(i_35_);
		((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.writeByte(i_36_);
		((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.writeByte(i_37_);
		((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.writeByte(255);
		method2851(i_14_);
	}

	Class298_Sub3(Class_ra_Sub2 class_ra_sub2, Class_xa_Sub3 class_xa_sub3, Class298_Sub10 class298_sub10, int[] is) {
		((Class298_Sub3) this).aClass_ra_Sub2_7173 = class_ra_sub2;
		((Class298_Sub3) this).aClass298_Sub10_7168 = class298_sub10;
		((Class298_Sub3) this).aClass_xa_Sub3_7169 = class_xa_sub3;
		int i = (((Class298_Sub3) this).aClass298_Sub10_7168.method2900(-1472086638) - (class_xa_sub3.anInt6288 * -1212653763 >> 1));
		((Class298_Sub3) this).anInt7171 = (((Class298_Sub3) this).aClass298_Sub10_7168.method2895(823958259) - i >> class_xa_sub3.anInt6289 * -2137349879);
		((Class298_Sub3) this).anInt7172 = (((Class298_Sub3) this).aClass298_Sub10_7168.method2895(823958259) + i >> class_xa_sub3.anInt6289 * -2137349879);
		((Class298_Sub3) this).anInt7177 = (((Class298_Sub3) this).aClass298_Sub10_7168.method2897((byte) 91) - i >> class_xa_sub3.anInt6289 * -2137349879);
		((Class298_Sub3) this).anInt7170 = (((Class298_Sub3) this).aClass298_Sub10_7168.method2897((byte) 105) + i >> class_xa_sub3.anInt6289 * -2137349879);
		int i_38_ = (((Class298_Sub3) this).anInt7172 - ((Class298_Sub3) this).anInt7171 + 1);
		int i_39_ = (((Class298_Sub3) this).anInt7170 - ((Class298_Sub3) this).anInt7177 + 1);
		((Class298_Sub3) this).aFloatArrayArray7181 = new float[i_38_ + 1][i_39_ + 1];
		((Class298_Sub3) this).aFloatArrayArray7182 = new float[i_38_ + 1][i_39_ + 1];
		((Class298_Sub3) this).aFloatArrayArray7183 = new float[i_38_ + 1][i_39_ + 1];
		for (int i_40_ = 0; i_40_ <= i_39_; i_40_++) {
			int i_41_ = i_40_ + ((Class298_Sub3) this).anInt7177;
			if (i_41_ > 0 && i_41_ < (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6286) * -1148794921 - 1) {
				for (int i_42_ = 0; i_42_ <= i_38_; i_42_++) {
					int i_43_ = i_42_ + ((Class298_Sub3) this).anInt7171;
					if (i_43_ > 0 && i_43_ < (((Class298_Sub3) this).aClass_xa_Sub3_7169.anInt6287) * -506105871 - 1) {
						int i_44_ = (class_xa_sub3.method6341(i_43_ + 1, i_41_, (byte) -68) - class_xa_sub3.method6341(i_43_ - 1, i_41_, (byte) -35));
						int i_45_ = (class_xa_sub3.method6341(i_43_, i_41_ + 1, (byte) -82) - class_xa_sub3.method6341(i_43_, i_41_ - 1, (byte) -122));
						float f = (float) (1.0 / Math.sqrt((double) (i_44_ * i_44_ + 65536 + (i_45_ * i_45_))));
						((Class298_Sub3) this).aFloatArrayArray7181[i_42_][i_40_] = (float) i_44_ * f;
						((Class298_Sub3) this).aFloatArrayArray7182[i_42_][i_40_] = -256.0F * f;
						((Class298_Sub3) this).aFloatArrayArray7183[i_42_][i_40_] = (float) i_45_ * f;
					}
				}
			}
		}
		int i_46_ = 0;
		for (int i_47_ = ((Class298_Sub3) this).anInt7177; i_47_ <= ((Class298_Sub3) this).anInt7170; i_47_++) {
			if (i_47_ >= 0 && i_47_ < class_xa_sub3.anInt6286 * -1148794921) {
				for (int i_48_ = ((Class298_Sub3) this).anInt7171; i_48_ <= ((Class298_Sub3) this).anInt7172; i_48_++) {
					if (i_48_ >= 0 && i_48_ < class_xa_sub3.anInt6287 * -506105871) {
						int i_49_ = is[i_46_];
						int[] is_50_ = (((Class_xa_Sub3) class_xa_sub3).anIntArrayArrayArray8528[i_48_][i_47_]);
						if (is_50_ != null && i_49_ != 0) {
							if (i_49_ == 1) {
								int i_51_ = 0;
								while (i_51_ < is_50_.length) {
									if (is_50_[i_51_++] != -1 && is_50_[i_51_++] != -1 && is_50_[i_51_++] != -1)
										((Class298_Sub3) this).anInt7176 += 3;
								}
							} else
								((Class298_Sub3) this).anInt7176 += 3;
						}
					}
					i_46_++;
				}
			} else
				i_46_ += (((Class298_Sub3) this).anInt7172 - ((Class298_Sub3) this).anInt7171);
		}
		if (((Class298_Sub3) this).anInt7176 > 0) {
			((Class298_Sub3) this).aClass298_Sub53_7184 = new RsByteBuffer(((Class298_Sub3) this).anInt7176 * 2);
			((Class298_Sub3) this).aClass298_Sub53_Sub1_7185 = new RsFloatBuffer(((Class298_Sub3) this).anInt7176 * 16);
			((Class298_Sub3) this).aClass440_7186 = new Class440(Class416.method5590((((Class298_Sub3) this).anInt7176), (byte) 16));
			int i_52_ = 0;
			i_46_ = 0;
			for (int i_53_ = ((Class298_Sub3) this).anInt7177; i_53_ <= ((Class298_Sub3) this).anInt7170; i_53_++) {
				if (i_53_ >= 0 && i_53_ < class_xa_sub3.anInt6286 * -1148794921) {
					int i_54_ = 0;
					for (int i_55_ = ((Class298_Sub3) this).anInt7171; i_55_ <= ((Class298_Sub3) this).anInt7172; i_55_++) {
						if (i_55_ >= 0 && i_55_ < class_xa_sub3.anInt6287 * -506105871) {
							int i_56_ = is[i_46_];
							int[] is_57_ = (((Class_xa_Sub3) class_xa_sub3).anIntArrayArrayArray8528[i_55_][i_53_]);
							if (is_57_ != null && i_56_ != 0) {
								if (i_56_ == 1) {
									int[] is_58_ = (((Class_xa_Sub3) class_xa_sub3).anIntArrayArrayArray8537[i_55_][i_53_]);
									int[] is_59_ = (((Class_xa_Sub3) class_xa_sub3).anIntArrayArrayArray8531[i_55_][i_53_]);
									int i_60_ = 0;
									while (i_60_ < is_57_.length) {
										if (is_57_[i_60_] != -1 && is_57_[i_60_ + 1] != -1 && is_57_[i_60_ + 2] != -1) {
											method2853(i_54_, i_52_, i_55_, i_53_, is_58_[i_60_], is_59_[i_60_]);
											i_60_++;
											method2853(i_54_, i_52_, i_55_, i_53_, is_58_[i_60_], is_59_[i_60_]);
											i_60_++;
											method2853(i_54_, i_52_, i_55_, i_53_, is_58_[i_60_], is_59_[i_60_]);
											i_60_++;
										} else
											i_60_ += 3;
									}
								} else if (i_56_ == 3) {
									method2853(i_54_, i_52_, i_55_, i_53_, 0, 0);
									method2853(i_54_, i_52_, i_55_, i_53_, (class_xa_sub3.anInt6288 * -1212653763), 0);
									method2853(i_54_, i_52_, i_55_, i_53_, 0, (class_xa_sub3.anInt6288 * -1212653763));
								} else if (i_56_ == 2) {
									method2853(i_54_, i_52_, i_55_, i_53_, (class_xa_sub3.anInt6288 * -1212653763), 0);
									method2853(i_54_, i_52_, i_55_, i_53_, (class_xa_sub3.anInt6288 * -1212653763), (class_xa_sub3.anInt6288 * -1212653763));
									method2853(i_54_, i_52_, i_55_, i_53_, 0, 0);
								} else if (i_56_ == 5) {
									method2853(i_54_, i_52_, i_55_, i_53_, (class_xa_sub3.anInt6288 * -1212653763), (class_xa_sub3.anInt6288 * -1212653763));
									method2853(i_54_, i_52_, i_55_, i_53_, 0, (class_xa_sub3.anInt6288 * -1212653763));
									method2853(i_54_, i_52_, i_55_, i_53_, (class_xa_sub3.anInt6288 * -1212653763), 0);
								} else if (i_56_ == 4) {
									method2853(i_54_, i_52_, i_55_, i_53_, 0, (class_xa_sub3.anInt6288 * -1212653763));
									method2853(i_54_, i_52_, i_55_, i_53_, 0, 0);
									method2853(i_54_, i_52_, i_55_, i_53_, (class_xa_sub3.anInt6288 * -1212653763), (class_xa_sub3.anInt6288 * -1212653763));
								}
							}
						}
						i_46_++;
						i_54_++;
					}
				} else
					i_46_ += (((Class298_Sub3) this).anInt7172 - ((Class298_Sub3) this).anInt7171);
				i_52_++;
			}
			((Class298_Sub3) this).anInterface2_7174 = (((Class298_Sub3) this).aClass_ra_Sub2_7173.method5284(5123, ((Class298_Sub3) this).aClass298_Sub53_7184.buffer, (((Class298_Sub3) this).aClass298_Sub53_7184.index * 385051775), false));
			((Class298_Sub3) this).anInterface1_7178 = (((Class298_Sub3) this).aClass_ra_Sub2_7173.method5244(16, (((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.buffer), (((Class298_Sub3) this).aClass298_Sub53_Sub1_7185.index * 385051775), false));
			((Class298_Sub3) this).aClass32_7179 = new Class32(((Class298_Sub3) this).anInterface1_7178, 5126, 3, 0);
			((Class298_Sub3) this).aClass32_7180 = new Class32(((Class298_Sub3) this).anInterface1_7178, 5121, 4, 12);
		} else {
			((Class298_Sub3) this).anInterface2_7174 = null;
			((Class298_Sub3) this).anInterface1_7178 = null;
			((Class298_Sub3) this).aClass32_7179 = null;
			((Class298_Sub3) this).aClass32_7180 = null;
		}
		((Class298_Sub3) this).aClass298_Sub53_Sub1_7185 = null;
		((Class298_Sub3) this).aClass298_Sub53_7184 = null;
		((Class298_Sub3) this).aClass440_7186 = null;
		((Class298_Sub3) this).aFloatArrayArray7183 = null;
		((Class298_Sub3) this).aFloatArrayArray7182 = null;
		((Class298_Sub3) this).aFloatArrayArray7181 = null;
	}
}
