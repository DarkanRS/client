/* Class298_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class298_Sub18 extends Linkable {
	Class298_Sub10 aClass298_Sub10_7295;
	Class_xa_Sub1 aClass_xa_Sub1_7296;
	float[][] aFloatArrayArray7297;
	int anInt7298;
	Class440 aClass440_7299;
	int anInt7300;
	int anInt7301;
	int anInt7302;
	int anInt7303;
	Interface7_Impl2 anInterface7_Impl2_7304;
	Interface7_Impl1 anInterface7_Impl1_7305;
	int anInt7306;
	float[][] aFloatArrayArray7307;
	float[][] aFloatArrayArray7308;
	Class_ra_Sub3 aClass_ra_Sub3_7309;

	void method2927(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, ByteBuffer bytebuffer, ByteBuffer bytebuffer_5_) {
		long l = -1L;
		int i_6_ = i_3_ + (i_1_ << (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6289) * -2137349879);
		int i_7_ = i_4_ + (i_2_ << (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6289) * -2137349879);
		int i_8_ = ((Class298_Sub18) this).aClass_xa_Sub1_7296.method6340(i_6_, i_7_, -1829757752);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = ((long) i_7_ & 0xffffL) << 16 | (long) i_6_ & 0xffffL;
			Linkable class298 = ((Class298_Sub18) this).aClass440_7299.method5852(l);
			if (class298 != null) {
				bytebuffer.putShort(((Class298_Sub20) class298).aShort7314);
				return;
			}
		}
		short i_9_ = (short) ((Class298_Sub18) this).anInt7302++;
		if (l != -1L)
			((Class298_Sub18) this).aClass440_7299.method5858(new Class298_Sub20(i_9_), l);
		float f;
		float f_10_;
		float f_11_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = ((Class298_Sub18) this).aFloatArrayArray7297[i][i_0_];
			f_10_ = ((Class298_Sub18) this).aFloatArrayArray7307[i][i_0_];
			f_11_ = ((Class298_Sub18) this).aFloatArrayArray7308[i][i_0_];
		} else if (i_3_ == (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6288) * -1212653763 && i_4_ == 0) {
			f = ((Class298_Sub18) this).aFloatArrayArray7297[i + 1][i_0_];
			f_10_ = ((Class298_Sub18) this).aFloatArrayArray7307[i + 1][i_0_];
			f_11_ = ((Class298_Sub18) this).aFloatArrayArray7308[i + 1][i_0_];
		} else if (i_3_ == (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6288) * -1212653763 && i_4_ == (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6288) * -1212653763) {
			f = ((Class298_Sub18) this).aFloatArrayArray7297[i + 1][i_0_ + 1];
			f_10_ = (((Class298_Sub18) this).aFloatArrayArray7307[i + 1][i_0_ + 1]);
			f_11_ = (((Class298_Sub18) this).aFloatArrayArray7308[i + 1][i_0_ + 1]);
		} else if (i_3_ == 0 && i_4_ == (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6288) * -1212653763) {
			f = ((Class298_Sub18) this).aFloatArrayArray7297[i][i_0_ + 1];
			f_10_ = ((Class298_Sub18) this).aFloatArrayArray7307[i][i_0_ + 1];
			f_11_ = ((Class298_Sub18) this).aFloatArrayArray7308[i][i_0_ + 1];
		} else {
			float f_12_ = (float) i_3_ / (float) ((((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6288) * -1212653763);
			float f_13_ = (float) i_4_ / (float) ((((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6288) * -1212653763);
			float f_14_ = ((Class298_Sub18) this).aFloatArrayArray7297[i][i_0_];
			float f_15_ = ((Class298_Sub18) this).aFloatArrayArray7307[i][i_0_];
			float f_16_ = ((Class298_Sub18) this).aFloatArrayArray7308[i][i_0_];
			float f_17_ = ((Class298_Sub18) this).aFloatArrayArray7297[i + 1][i_0_];
			float f_18_ = ((Class298_Sub18) this).aFloatArrayArray7307[i + 1][i_0_];
			float f_19_ = ((Class298_Sub18) this).aFloatArrayArray7308[i + 1][i_0_];
			f_14_ += (((Class298_Sub18) this).aFloatArrayArray7297[i][i_0_ + 1] - f_14_) * f_12_;
			f_15_ += (((Class298_Sub18) this).aFloatArrayArray7307[i][i_0_ + 1] - f_15_) * f_12_;
			f_16_ += (((Class298_Sub18) this).aFloatArrayArray7308[i][i_0_ + 1] - f_16_) * f_12_;
			f_17_ += ((((Class298_Sub18) this).aFloatArrayArray7297[i + 1][i_0_ + 1]) - f_17_) * f_12_;
			f_18_ += ((((Class298_Sub18) this).aFloatArrayArray7307[i + 1][i_0_ + 1]) - f_18_) * f_12_;
			f_19_ += ((((Class298_Sub18) this).aFloatArrayArray7308[i + 1][i_0_ + 1]) - f_19_) * f_12_;
			f = f_14_ + (f_17_ - f_14_) * f_13_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_13_;
			f_11_ = f_16_ + (f_19_ - f_16_) * f_13_;
		}
		float f_20_ = (float) (((Class298_Sub18) this).aClass298_Sub10_7295.method2895(823958259) - i_6_);
		float f_21_ = (float) (((Class298_Sub18) this).aClass298_Sub10_7295.method2894(1790623605) - i_8_);
		float f_22_ = (float) (((Class298_Sub18) this).aClass298_Sub10_7295.method2897((byte) 62) - i_7_);
		float f_23_ = (float) Math.sqrt((double) (f_20_ * f_20_ + f_21_ * f_21_ + f_22_ * f_22_));
		float f_24_ = 1.0F / f_23_;
		f_20_ *= f_24_;
		f_21_ *= f_24_;
		f_22_ *= f_24_;
		float f_25_ = f_23_ / (float) ((Class298_Sub18) this).aClass298_Sub10_7295.method2900(-1347339001);
		float f_26_ = 1.0F - f_25_ * f_25_;
		if (f_26_ < 0.0F)
			f_26_ = 0.0F;
		float f_27_ = f_20_ * f + f_21_ * f_10_ + f_22_ * f_11_;
		if (f_27_ < 0.0F)
			f_27_ = 0.0F;
		float f_28_ = f_27_ * f_26_ * 2.0F;
		if (f_28_ > 1.0F)
			f_28_ = 1.0F;
		int i_29_ = ((Class298_Sub18) this).aClass298_Sub10_7295.method2898(-1418172708);
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
		if ((((Class_ra_Sub3) ((Class298_Sub18) this).aClass_ra_Sub3_7309).anInt8346) == 0) {
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

	Class298_Sub18(Class_ra_Sub3 class_ra_sub3, Class_xa_Sub1 class_xa_sub1, Class298_Sub10 class298_sub10, int[] is) {
		((Class298_Sub18) this).aClass_ra_Sub3_7309 = class_ra_sub3;
		((Class298_Sub18) this).aClass298_Sub10_7295 = class298_sub10;
		((Class298_Sub18) this).aClass_xa_Sub1_7296 = class_xa_sub1;
		int i = (((Class298_Sub18) this).aClass298_Sub10_7295.method2900(-447705698) - (class_xa_sub1.anInt6288 * -1212653763 >> 1));
		((Class298_Sub18) this).anInt7303 = (((Class298_Sub18) this).aClass298_Sub10_7295.method2895(823958259) - i >> class_xa_sub1.anInt6289 * -2137349879);
		((Class298_Sub18) this).anInt7300 = (((Class298_Sub18) this).aClass298_Sub10_7295.method2895(823958259) + i >> class_xa_sub1.anInt6289 * -2137349879);
		((Class298_Sub18) this).anInt7306 = (((Class298_Sub18) this).aClass298_Sub10_7295.method2897((byte) 100) - i >> class_xa_sub1.anInt6289 * -2137349879);
		((Class298_Sub18) this).anInt7301 = (((Class298_Sub18) this).aClass298_Sub10_7295.method2897((byte) 65) + i >> class_xa_sub1.anInt6289 * -2137349879);
		int i_33_ = (((Class298_Sub18) this).anInt7300 - ((Class298_Sub18) this).anInt7303 + 1);
		int i_34_ = (((Class298_Sub18) this).anInt7301 - ((Class298_Sub18) this).anInt7306 + 1);
		((Class298_Sub18) this).aFloatArrayArray7297 = new float[i_33_ + 1][i_34_ + 1];
		((Class298_Sub18) this).aFloatArrayArray7307 = new float[i_33_ + 1][i_34_ + 1];
		((Class298_Sub18) this).aFloatArrayArray7308 = new float[i_33_ + 1][i_34_ + 1];
		for (int i_35_ = 0; i_35_ <= i_34_; i_35_++) {
			int i_36_ = i_35_ + ((Class298_Sub18) this).anInt7306;
			if (i_36_ > 0 && i_36_ < (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6286) * -1148794921 - 1) {
				for (int i_37_ = 0; i_37_ <= i_33_; i_37_++) {
					int i_38_ = i_37_ + ((Class298_Sub18) this).anInt7303;
					if (i_38_ > 0 && i_38_ < (((Class298_Sub18) this).aClass_xa_Sub1_7296.anInt6287) * -506105871 - 1) {
						int i_39_ = (class_xa_sub1.method6341(i_38_ + 1, i_36_, (byte) -128) - class_xa_sub1.method6341(i_38_ - 1, i_36_, (byte) -55));
						int i_40_ = (class_xa_sub1.method6341(i_38_, i_36_ + 1, (byte) -98) - class_xa_sub1.method6341(i_38_, i_36_ - 1, (byte) -82));
						float f = (float) (1.0 / Math.sqrt((double) (i_39_ * i_39_ + 65536 + (i_40_ * i_40_))));
						((Class298_Sub18) this).aFloatArrayArray7297[i_37_][i_35_] = (float) i_39_ * f;
						((Class298_Sub18) this).aFloatArrayArray7307[i_37_][i_35_] = -256.0F * f;
						((Class298_Sub18) this).aFloatArrayArray7308[i_37_][i_35_] = (float) i_40_ * f;
					}
				}
			}
		}
		int i_41_ = 0;
		for (int i_42_ = ((Class298_Sub18) this).anInt7306; i_42_ <= ((Class298_Sub18) this).anInt7301; i_42_++) {
			if (i_42_ >= 0 && i_42_ < class_xa_sub1.anInt6286 * -1148794921) {
				for (int i_43_ = ((Class298_Sub18) this).anInt7303; i_43_ <= ((Class298_Sub18) this).anInt7300; i_43_++) {
					if (i_43_ >= 0 && i_43_ < class_xa_sub1.anInt6287 * -506105871) {
						int i_44_ = is[i_41_];
						int[] is_45_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8483[i_43_][i_42_]);
						if (is_45_ != null && i_44_ != 0) {
							if (i_44_ == 1) {
								int i_46_ = 0;
								while (i_46_ < is_45_.length) {
									if (is_45_[i_46_++] != -1 && is_45_[i_46_++] != -1 && is_45_[i_46_++] != -1)
										((Class298_Sub18) this).anInt7298 += 3;
								}
							} else
								((Class298_Sub18) this).anInt7298 += 3;
						}
					}
					i_41_++;
				}
			} else
				i_41_ += (((Class298_Sub18) this).anInt7300 - ((Class298_Sub18) this).anInt7303);
		}
		if (((Class298_Sub18) this).anInt7298 > 0) {
			((Class298_Sub18) this).aClass440_7299 = new Class440(Class416.method5590((((Class298_Sub18) this).anInt7298), (byte) 16));
			ByteBuffer bytebuffer = ((Class298_Sub18) this).aClass_ra_Sub3_7309.aByteBuffer8216;
			bytebuffer.clear();
			bytebuffer.position(2097152);
			ByteBuffer bytebuffer_47_ = bytebuffer.slice();
			bytebuffer.position(0);
			bytebuffer.limit(2097152);
			int i_48_ = 0;
			i_41_ = 0;
			for (int i_49_ = ((Class298_Sub18) this).anInt7306; i_49_ <= ((Class298_Sub18) this).anInt7301; i_49_++) {
				if (i_49_ >= 0 && i_49_ < class_xa_sub1.anInt6286 * -1148794921) {
					int i_50_ = 0;
					for (int i_51_ = ((Class298_Sub18) this).anInt7303; i_51_ <= ((Class298_Sub18) this).anInt7300; i_51_++) {
						if (i_51_ >= 0 && i_51_ < class_xa_sub1.anInt6287 * -506105871) {
							int i_52_ = is[i_41_];
							int[] is_53_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8483[i_51_][i_49_]);
							if (is_53_ != null && i_52_ != 0) {
								if (i_52_ == 1) {
									int[] is_54_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8462[i_51_][i_49_]);
									int[] is_55_ = (((Class_xa_Sub1) class_xa_sub1).anIntArrayArrayArray8458[i_51_][i_49_]);
									int i_56_ = 0;
									while (i_56_ < is_53_.length) {
										if (is_53_[i_56_] != -1 && is_53_[i_56_ + 1] != -1 && is_53_[i_56_ + 2] != -1) {
											method2927(i_50_, i_48_, i_51_, i_49_, is_54_[i_56_], is_55_[i_56_], bytebuffer_47_, bytebuffer);
											i_56_++;
											method2927(i_50_, i_48_, i_51_, i_49_, is_54_[i_56_], is_55_[i_56_], bytebuffer_47_, bytebuffer);
											i_56_++;
											method2927(i_50_, i_48_, i_51_, i_49_, is_54_[i_56_], is_55_[i_56_], bytebuffer_47_, bytebuffer);
											i_56_++;
										} else
											i_56_ += 3;
									}
								} else if (i_52_ == 3) {
									method2927(i_50_, i_48_, i_51_, i_49_, 0, 0, bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, (class_xa_sub1.anInt6288 * -1212653763), 0, bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, 0, (class_xa_sub1.anInt6288 * -1212653763), bytebuffer_47_, bytebuffer);
								} else if (i_52_ == 2) {
									method2927(i_50_, i_48_, i_51_, i_49_, (class_xa_sub1.anInt6288 * -1212653763), 0, bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, (class_xa_sub1.anInt6288 * -1212653763), (class_xa_sub1.anInt6288 * -1212653763), bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, 0, 0, bytebuffer_47_, bytebuffer);
								} else if (i_52_ == 5) {
									method2927(i_50_, i_48_, i_51_, i_49_, (class_xa_sub1.anInt6288 * -1212653763), (class_xa_sub1.anInt6288 * -1212653763), bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, 0, (class_xa_sub1.anInt6288 * -1212653763), bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, (class_xa_sub1.anInt6288 * -1212653763), 0, bytebuffer_47_, bytebuffer);
								} else if (i_52_ == 4) {
									method2927(i_50_, i_48_, i_51_, i_49_, 0, (class_xa_sub1.anInt6288 * -1212653763), bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, 0, 0, bytebuffer_47_, bytebuffer);
									method2927(i_50_, i_48_, i_51_, i_49_, (class_xa_sub1.anInt6288 * -1212653763), (class_xa_sub1.anInt6288 * -1212653763), bytebuffer_47_, bytebuffer);
								}
							}
						}
						i_41_++;
						i_50_++;
					}
				} else
					i_41_ += (((Class298_Sub18) this).anInt7300 - ((Class298_Sub18) this).anInt7303);
				i_48_++;
			}
			((Class298_Sub18) this).anInterface7_Impl2_7304 = ((Class298_Sub18) this).aClass_ra_Sub3_7309.method5381(false);
			((Class298_Sub18) this).anInterface7_Impl2_7304.method113(((Class298_Sub18) this).anInt7298);
			((Class298_Sub18) this).anInterface7_Impl1_7305 = ((Class298_Sub18) this).aClass_ra_Sub3_7309.method5382(false);
			((Class298_Sub18) this).anInterface7_Impl1_7305.method72(((Class298_Sub18) this).anInt7302 * 16, 16);
			((Class298_Sub18) this).anInterface7_Impl1_7305.method63(0, bytebuffer.position(), ((Class298_Sub18) this).aClass_ra_Sub3_7309.aLong8217);
			((Class298_Sub18) this).anInterface7_Impl2_7304.method63(0, bytebuffer_47_.position(), (((Class298_Sub18) this).aClass_ra_Sub3_7309.aLong8217 + 2097152L));
		} else {
			((Class298_Sub18) this).anInterface7_Impl1_7305 = null;
			((Class298_Sub18) this).anInterface7_Impl2_7304 = null;
		}
		((Class298_Sub18) this).aClass440_7299 = null;
		((Class298_Sub18) this).aFloatArrayArray7308 = null;
		((Class298_Sub18) this).aFloatArrayArray7307 = null;
		((Class298_Sub18) this).aFloatArrayArray7297 = null;
	}
}
